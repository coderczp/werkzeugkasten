package org.handwerkszeug.dns.client;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

import org.handwerkszeug.dns.DNSClass;
import org.handwerkszeug.dns.DNSMessage;
import org.handwerkszeug.dns.Name;
import org.handwerkszeug.dns.OpCode;
import org.handwerkszeug.dns.ResourceRecord;
import org.handwerkszeug.dns.Type;
import org.handwerkszeug.dns.record.WKSRecord;
import org.handwerkszeug.util.EnumUtil;
import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;
import org.jboss.netty.channel.socket.DatagramChannelFactory;
import org.jboss.netty.channel.socket.oio.OioDatagramChannelFactory;

import sun.net.dns.ResolverConfiguration;
import werkzeugkasten.common.util.StringUtil;

public class DNSClient extends SimpleChannelHandler {

	protected static final String LINE_SEP = System
			.getProperty("line.separator");
	protected WKProtocols wkProtocols = new WKProtocols();
	protected WKPortNumbers wkPortNumbers = new WKPortNumbers();

	protected List<String> names = new ArrayList<String>();

	protected DNSClass dnsclass = DNSClass.IN;

	protected Type type = Type.A;

	protected OpCode opCode = OpCode.QUERY;

	protected InetSocketAddress serverAddress;

	protected int serverPort = 53; // default DNS port.

	protected DNSMessage request;

	protected long time;

	public static void main(String[] args) throws Exception {
		DNSClient client = new DNSClient();
		client.initialize();
		client.process(args);
	}

	protected void initialize() {
		this.wkProtocols.load();
		this.wkPortNumbers.load();
	}

	protected void process(String[] args) throws Exception {
		parseArgs(args);
		setUpRequest();
		sendRequest();
	}

	protected void parseArgs(String[] args) throws Exception {
		InetAddress address = null;
		for (int i = 0, length = args.length; i < length; i++) {
			String current = args[i];
			if (current.startsWith("@")) {
				String s = current.substring(1);
				address = InetAddress.getByName(s);
			} else if (current.startsWith("-") && (1 < current.length())) {
				switch (current.charAt(1)) {
				case 'x': {
					this.opCode = OpCode.IQUERY;
					break;
				}
				case 'p': {
					String next = args[++i];
					if (Pattern.matches("\\p{Digit}+", next)) {
						int num = Integer.parseInt(next);
						if ((0 < num) && (num < 0xFFFF)) {
							this.serverPort = num;
						} else {
							// TODO error msg.
							System.err.println("invalid port number " + num);
						}
					}
					break;
				}
				}

			} else {
				String s = current.toUpperCase();
				DNSClass dc = EnumUtil.find(DNSClass.values(), s, null);
				if (dc != null) {
					this.dnsclass = dc;
					continue;
				}
				Type t = EnumUtil.find(Type.values(), s, null);
				if (t != null) {
					this.type = t;
					continue;
				}
				this.names.add(current);
			}
		}
		if (address == null) {
			address = findDNSServer();
		}

		this.serverAddress = new InetSocketAddress(address, this.serverPort);
	}

	protected InetAddress findDNSServer() throws Exception {
		// FIXME this code run only sun JRE.
		ResolverConfiguration conf = ResolverConfiguration.open();
		List<?> list = conf.nameservers();
		if (0 < list.size()) {
			String host = list.get(0).toString();
			return InetAddress.getByName(host);
		}
		return InetAddress.getLocalHost();
	}

	protected void setUpRequest() {
		this.request = new DNSMessage();
		this.request.header().opcode(this.opCode);
		this.request.header().rd(true);
		for (String s : this.names) {
			String name = s;
			if ((OpCode.IQUERY.equals(this.opCode) == false)
					&& (s.endsWith(".") == false)) {
				name += ".";
			}
			ResourceRecord rr = this.type.newRecord();
			rr.name(new Name(name));
			this.request.question().add(rr);
		}
	}

	protected void sendRequest() {
		// use UDP/IP
		DatagramChannelFactory factory = new OioDatagramChannelFactory(
				Executors.newSingleThreadExecutor());

		try {
			ClientBootstrap bootstrap = new ClientBootstrap(factory);

			bootstrap.setPipelineFactory(new ChannelPipelineFactory() {
				@Override
				public ChannelPipeline getPipeline() {
					return Channels.pipeline(DNSClient.this);
				}
			});
			bootstrap.setOption("broadcast", "false");
			bootstrap.setOption("sendBufferSize", 512);
			bootstrap.setOption("receiveBufferSize", 512);

			ChannelFuture future = bootstrap.connect(this.serverAddress);
			future.awaitUninterruptibly();
			if (!future.isSuccess()) {
				future.getCause().printStackTrace();
			}
			future.getChannel().getCloseFuture().awaitUninterruptibly();
		} finally {
			factory.releaseExternalResources();
		}
	}

	@Override
	public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e)
			throws Exception {
		ChannelBuffer buffer = ChannelBuffers.buffer(512);
		this.request.write(buffer);
		this.time = System.currentTimeMillis();
		e.getChannel().write(buffer);
	}

	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e)
			throws Exception {
		this.time = System.currentTimeMillis() - this.time;
		ChannelBuffer buffer = (ChannelBuffer) e.getMessage();
		DNSMessage msg = new DNSMessage(buffer);
		printResult(this.time, msg);
		e.getChannel().close();
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e)
			throws Exception {
		e.getCause().printStackTrace();
		e.getChannel().close();
	}

	protected String formatMessage(long time, DNSMessage msg) {
		StringBuilder stb = new StringBuilder();
		stb.append(msg.header());
		stb.append(LINE_SEP);
		stb.append(LINE_SEP);
		stb.append(";; QUESTION SECTION:");
		stb.append(LINE_SEP);
		for (ResourceRecord rr : msg.question()) {
			stb.append(';');
			int i = stb.length();
			stb.append(rr.name().toString());
			StringUtil.padRight(stb, ' ', i + 30);
			stb.append(' ');
			stb.append(rr.dnsClass().name());
			stb.append(' ');
			stb.append(rr.type().name());
			stb.append(LINE_SEP);
		}

		stb.append(LINE_SEP);
		append(stb, ";; ANSWER SECTION:", msg.answer());
		stb.append(LINE_SEP);
		append(stb, ";; AUTHORITY SECTION:", msg.authority());
		stb.append(LINE_SEP);
		append(stb, ";; ADDITIONAL SECTION:", msg.additional());
		stb.append(LINE_SEP);

		stb.append(";; Query time: ");
		stb.append(time);
		stb.append(" msec");
		stb.append(LINE_SEP);
		stb.append(";; Server: ");
		stb.append(this.serverAddress);
		stb.append(LINE_SEP);
		stb.append(";; When: ");
		stb.append(DateFormat.getDateTimeInstance().format(new Date()));
		stb.append(LINE_SEP);
		stb.append(";; Message size: ");
		stb.append(msg.messageSize());
		stb.append(" bytes");
		stb.append(LINE_SEP);
		return stb.toString();
	}

	protected void append(StringBuilder stb, String name,
			List<ResourceRecord> list) {
		stb.append(name);
		stb.append(LINE_SEP);
		if (list != null) {
			for (ResourceRecord rr : list) {
				stb.append(rr.toString());
				if (rr.type().equals(Type.WKS)) {
					append(stb, (WKSRecord) rr);
				}
				stb.append(LINE_SEP);
			}
		}
	}

	protected void append(StringBuilder stb, WKSRecord record) {
		stb.append(' ');
		stb.append(this.wkProtocols.find(record.protocol()));
		stb.append(' ');
		this.wkPortNumbers.appendServices(record, stb);
	}

	protected void printResult(long time, DNSMessage msg) {
		System.out.println(formatMessage(time, msg));
	}

	protected void printHelp() {
		// TODO print help message.
	}
}
