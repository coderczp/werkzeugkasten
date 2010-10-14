package org.handwerkszeug.dns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jboss.netty.buffer.ChannelBuffer;

public class Name {

	/**
	 * 4.1.4. Message compression
	 */
	public static final int MASK_POINTER = 0xC0; // 1100 0000

	/**
	 * 2.3.1. Preferred name syntax
	 */
	public static final int MAX_LABEL_SIZE = 63; // 0011 1111

	protected byte[] name;

	public Name(ChannelBuffer buffer) {
		this.name = this.parse(buffer);
	}

	public Name(String name) {
		// TODO charset? double byte string?
		this(name.getBytes());
	}

	protected Name(byte[] name) {
		verify(name);
		this.name = name;
	}

	protected void verify(byte[] ary) {
		int labelsize = 0;
		for (int i = 0, length = ary.length; i < length; i++) {
			byte b = ary[i];
			if ((b == '.') && (++i < length) && (ary[i] == '.')) {
				// TODO error msg.
				throw new IllegalArgumentException("null label is not valid");
			}
			labelsize++;
		}
		if (MAX_LABEL_SIZE < labelsize) {
			// TODO error msg.
			throw new IllegalArgumentException(
					"Labels must be 63 characters or less. size=" + labelsize);
		}
	}

	protected byte[] parse(ChannelBuffer buffer) {
		List<byte[]> list = new ArrayList<byte[]>();
		boolean jumped = false;

		for (int length = buffer.readUnsignedByte(); 0 < length; length = buffer
				.readUnsignedByte()) {
			if ((length & MASK_POINTER) != 0) {
				int p = ((length ^ MASK_POINTER) << 8)
						+ buffer.readUnsignedByte();
				if (jumped == false) {
					buffer.markReaderIndex();
					jumped = true;
				}
				buffer.readerIndex(p);
			} else if (length <= MAX_LABEL_SIZE) {
				byte[] ary = new byte[length];
				buffer.readBytes(ary);
				list.add(ary);
			} else {
				throw new IllegalStateException("Invalid compression mask : "
						+ length);
			}
		}

		if (jumped) {
			buffer.resetReaderIndex();
		}

		return freeze(buffer, list);
	}

	protected byte[] freeze(ChannelBuffer buffer, List<byte[]> list) {
		int size = 0;
		for (byte[] a : list) {
			size += a.length;
			size += 1;
		}
		byte[] result = new byte[size];
		int pos = 0;
		for (byte[] a : list) {
			System.arraycopy(a, 0, result, pos, a.length);
			pos += a.length;
			result[pos] = '.';
			pos++;
		}
		return result;
	}

	public void write(ChannelBuffer buffer, NameCompressor compressor) {
		if (writePointer(buffer, compressor, this) == false) {
			compressor.put(this, buffer.writerIndex());
			List<byte[]> list = split();
			int namelength = this.name.length;
			int consumed = 0;
			for (byte[] current : list) {
				buffer.writeByte(current.length);
				buffer.writeBytes(current);

				consumed += (current.length + 1);
				int newlength = namelength - consumed;
				if (0 < newlength) {
					byte[] newone = new byte[newlength];
					System.arraycopy(this.name, consumed, newone, 0, newlength);
					Name n = new Name(newone);
					if (writePointer(buffer, compressor, n)) {
						break;
					} else {
						compressor.put(n, buffer.writerIndex());
					}
				} else {
					buffer.writeZero(1); // Null label
				}
			}
		}
	}

	protected boolean writePointer(ChannelBuffer buffer,
			NameCompressor compressor, Name n) {
		int position = compressor.get(n);
		if (-1 < position) {
			int pointer = (MASK_POINTER << 8) | position;
			buffer.writeShort(pointer);
			return true;
		}
		return false;
	}

	protected List<byte[]> split() {
		List<byte[]> result = new ArrayList<byte[]>();
		for (int i = 0, begin = 0, part = 0, length = this.name.length; i < length; i++) {
			byte b = this.name[i];
			if (b == '.') {
				byte[] newone = new byte[part];
				System.arraycopy(this.name, begin, newone, 0, part);
				result.add(newone);
				part = 0;
				begin = i + 1;
			} else {
				part++;
			}
		}
		return result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(this.name);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Name) {
			return equals(Name.class.cast(obj));
		}
		return false;
	}

	public boolean equals(Name other) {
		return (other != null) && Arrays.equals(this.name, other.name);
	}

	@Override
	public String toString() {
		// TODO charset ?
		return new String(this.name);
	}
}
