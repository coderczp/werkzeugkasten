package org.handwerkszeug.dns.server;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.handwerkszeug.dns.DNSMessage;
import org.handwerkszeug.dns.RCode;
import org.handwerkszeug.dns.conf.ServerConfiguration;
import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFactory;
import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.ChannelFutureListener;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.ExceptionEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelUpstreamHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForwardingHandler extends SimpleChannelUpstreamHandler {

	static final Logger LOG = LoggerFactory.getLogger(ForwardingHandler.class);

	protected ServerConfiguration config;
	protected ChannelFactory clientChannelFactory;

	public ForwardingHandler(ServerConfiguration config,
			ChannelFactory clientChannelFactory) {
		this.config = config;
		this.clientChannelFactory = clientChannelFactory;
	}

	@Override
	public void messageReceived(ChannelHandlerContext ctx, final MessageEvent e)
			throws Exception {
		final DNSMessage original = DNSMessage.class.cast(e.getMessage());

		ClientBootstrap cb = new ClientBootstrap(this.clientChannelFactory);
		cb.setOption("broadcast", "false");
		cb.setPipelineFactory(new ChannelPipelineFactory() {
			@Override
			public ChannelPipeline getPipeline() throws Exception {

				return Channels.pipeline(new ClientHanler(original, e
						.getChannel(), e.getRemoteAddress()));
			}
		});

		List<SocketAddress> newlist = new ArrayList<SocketAddress>(
				this.config.forwarders());
		sendRequest(e, original, cb, newlist);
	}

	protected void sendRequest(final MessageEvent e, final DNSMessage original,
			final ClientBootstrap bootstrap,
			final List<SocketAddress> forwarders) {
		if (0 < forwarders.size()) {
			SocketAddress sa = forwarders.remove(0);
			LOG.info("send to {}", sa);

			ChannelFuture f = bootstrap.connect(sa);
			ChannelBuffer buffer = ChannelBuffers.buffer(512);
			DNSMessage newone = new DNSMessage();
			newone.copy(original);
			newone.write(buffer);
			final Channel c = f.getChannel();

			LOG.info(
					"STATUS : [isOpen/isConnected/isWritable {}] {} {}",
					new Object[] {
							new boolean[] { c.isOpen(), c.isConnected(),
									c.isWritable() }, c.getRemoteAddress(),
							c.getClass() });

			c.write(buffer, sa).addListener(new ChannelFutureListener() {
				@Override
				public void operationComplete(ChannelFuture future)
						throws Exception {
					LOG.info("operationComplete");
					// c.close();
					if (future.isSuccess() == false) {
						if (0 < forwarders.size()) {
							sendRequest(e, original, bootstrap, forwarders);
						} else {
							original.header().rcode(RCode.ServFail);
							ChannelBuffer buffer = ChannelBuffers.buffer(512);
							original.write(buffer);
							e.getChannel().write(buffer);
						}
					}
				}
			});

			f.awaitUninterruptibly(30, TimeUnit.SECONDS);
		}
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e)
			throws Exception {
		LOG.error("ForwardingHandler#exceptionCaught");
		Throwable t = e.getCause();
		t.printStackTrace();
		LOG.error(t.getMessage(), e);
		e.getChannel().close();
	}

	protected class ClientHanler extends SimpleChannelUpstreamHandler {

		protected DNSMessage original;

		protected Channel originalChannel;

		protected SocketAddress originalAddress;

		public ClientHanler(DNSMessage msg, Channel c, SocketAddress sa) {
			this.original = msg;
			this.originalChannel = c;
			this.originalAddress = sa;
		}

		// @Override
		// public void channelConnected(ChannelHandlerContext ctx,
		// ChannelStateEvent e) throws Exception {
		// LOG.info("ClientHanler#channelConnected");
		// ChannelBuffer buffer = ChannelBuffers.buffer(512);
		// DNSMessage newone = new DNSMessage();
		// newone.copy(this.original);
		// newone.write(buffer);
		// Channel c = e.getChannel();
		// LOG.info(
		// "STATUS : [isOpen/isConnected/isWritable {}] {} {}",
		// new Object[] {
		// new boolean[] { c.isOpen(), c.isConnected(),
		// c.isWritable() }, c.getRemoteAddress(),
		// c.getClass() });
		//
		// c.write(buffer);
		// }

		@Override
		public void messageReceived(ChannelHandlerContext ctx, MessageEvent e)
				throws Exception {
			LOG.debug("ClientHanler#messageReceived");
			ChannelBuffer buffer = (ChannelBuffer) e.getMessage();
			DNSMessage msg = new DNSMessage(buffer);
			msg.header().id(this.original.header().id());
			ChannelBuffer newone = ChannelBuffers.buffer(buffer.capacity());
			msg.write(newone);
			this.originalChannel.write(newone, this.originalAddress);
			// this.originalChannel.close();
		}

		@Override
		public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e)
				throws Exception {
			LOG.error("ClientHanler#exceptionCaught");
			Throwable t = e.getCause();
			t.printStackTrace();
			LOG.error(t.getMessage(), t);
			e.getFuture().setFailure(t);
			e.getChannel().close();
		}
	}

}
