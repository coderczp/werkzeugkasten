package org.handwerkszeug.dns.zone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.net.InetAddress;
import java.util.List;

import org.handwerkszeug.dns.DNSMessage;
import org.handwerkszeug.dns.Name;
import org.handwerkszeug.dns.RCode;
import org.handwerkszeug.dns.RRType;
import org.handwerkszeug.dns.ResourceRecord;
import org.handwerkszeug.dns.Response;
import org.handwerkszeug.dns.record.ARecord;
import org.handwerkszeug.dns.record.SOARecord;
import org.handwerkszeug.dns.record.SingleNameRecord;
import org.handwerkszeug.dns.server.DefaultResolveContext;
import org.junit.Before;
import org.junit.Test;

public class MasterZoneTest {

	MasterZone target;

	@Before
	public void setUp() throws Exception {
		SOARecord soaRecord = new SOARecord();
		Name n = new Name("example.co.jp.");
		soaRecord.name(n);
		soaRecord.mname(new Name("ns.example.co.jp."));
		this.target = new MasterZone(n, soaRecord);
		SingleNameRecord ns = new SingleNameRecord(RRType.NS, soaRecord.mname());
		ns.name(n);
		this.target.add(ns);
	}

	protected ARecord a(String name, String addr) throws Exception {
		ARecord result = new ARecord();
		result.name(new Name(name));
		result.address(InetAddress.getByName(addr));
		return result;
	}

	@Test
	public void testFind() throws Exception {
		this.target.add(a("*.example.co.jp.", "192.168.100.2"));
		this.target.add(a("www.exaple.co.jp.", "192.168.10.1"));
		this.target.add(a("example.co.jp.", "192.168.0.1"));
		this.target.add(a("example.co.jp.", "192.168.100.1"));

		SingleNameRecord ftp = new SingleNameRecord(RRType.NS, new Name(
				"share.example.co.jp."));
		ftp.name(new Name("ftp.example.co.jp."));
		this.target.add(ftp);
		assertEquals(RCode.NXDomain,
				this.target.find(new Name("co.jp."), RRType.ANY).rcode());

		Response res = this.target.find(new Name("example.co.jp."), RRType.A);
		assertEquals(RCode.NoError, res.rcode());

		DefaultResolveContext context = new DefaultResolveContext(
				new DNSMessage());
		res.postProcess(context);
		List<ResourceRecord> list = context.response().answer();
		assertEquals(2, list.size());
		assertTrue(list.contains(a("example.co.jp.", "192.168.0.1")));
		assertTrue(list.contains(a("example.co.jp.", "192.168.100.1")));

		Response wild = this.target.find(new Name("scp.example.co.jp."),
				RRType.A);
		assertEquals(RCode.NoError, wild.rcode());
		DefaultResolveContext wildc = new DefaultResolveContext(
				new DNSMessage());
		wild.postProcess(wildc);
		List<ResourceRecord> wl = wildc.response().answer();
		assertEquals(1, wl.size());
		assertEquals(a("scp.example.co.jp.", "192.168.100.2"), wl.get(0));
	}
}
