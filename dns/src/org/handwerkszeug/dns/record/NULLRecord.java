package org.handwerkszeug.dns.record;

import org.handwerkszeug.dns.NameCompressor;
import org.handwerkszeug.dns.Type;
import org.jboss.netty.buffer.ChannelBuffer;

/**
 * 3.3.10. NULL RDATA format (EXPERIMENTAL)
 * 
 * @author taichi
 * 
 */
public class NULLRecord extends AbstractRecord {

	/**
	 * Anything at all may be in the RDATA field so long as it is 65535 octets
	 * or less.
	 */
	protected byte[] anything;

	public NULLRecord() {
		super(Type.NULL);
	}

	@Override
	protected void parseRDATA(ChannelBuffer buffer) {
		this.anything = new byte[rdlength()];
		buffer.readBytes(this.anything);
	}

	@Override
	protected void writeRDATA(ChannelBuffer buffer, NameCompressor compressor) {
		buffer.writeBytes(anything());
	}

	public byte[] anything() {
		return this.anything;
	}

	public void anything(byte[] data) {
		if (65535 < data.length) {
			throw new IllegalArgumentException("data too long length:"
					+ data.length);
		}
		this.anything = data;
	}
}
