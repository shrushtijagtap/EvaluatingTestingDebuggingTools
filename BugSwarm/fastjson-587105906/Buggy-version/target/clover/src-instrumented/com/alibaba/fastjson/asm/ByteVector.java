/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//***
 * ASM: a very small and fast Java bytecode manipulation framework
 * Copyright (c) 2000-2007 INRIA, France Telecom
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. Neither the name of the copyright holders nor the names of its
 *    contributors may be used to endorse or promote products derived from
 *    this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.alibaba.fastjson.asm;

/**
 * A dynamically extensible vector of bytes. This class is roughly equivalent to
 * a DataOutputStream on top of a ByteArrayOutputStream, but is more efficient.
 *
 * @author Eric Bruneton
 */
public class ByteVector {public static class __CLR4_1_10499499luszvt8a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,5617,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	/**
	 * The content of this vector.
	 */
	public byte[] data;

	/**
	 * Actual number of bytes in this vector.
	 */
	public int length;

	/**
	 * Constructs a new {@link ByteVector ByteVector} with a default initial size.
	 */
	public ByteVector() {try{__CLR4_1_10499499luszvt8a.R.inc(5517);
		__CLR4_1_10499499luszvt8a.R.inc(5518);data = new byte[64];
	}finally{__CLR4_1_10499499luszvt8a.R.flushNeeded();}}

	/**
	 * Constructs a new {@link ByteVector ByteVector} with the given initial size.
	 *
	 * @param initialSize the initial size of the byte vector to be constructed.
	 */
	public ByteVector(final int initialSize) {try{__CLR4_1_10499499luszvt8a.R.inc(5519);
		__CLR4_1_10499499luszvt8a.R.inc(5520);data = new byte[initialSize];
	}finally{__CLR4_1_10499499luszvt8a.R.flushNeeded();}}

	/**
	 * Puts a byte into this byte vector. The byte vector is automatically enlarged
	 * if necessary.
	 *
	 * @param b a byte.
	 * @return this byte vector.
	 */
	public ByteVector putByte(final int b) {try{__CLR4_1_10499499luszvt8a.R.inc(5521);
		__CLR4_1_10499499luszvt8a.R.inc(5522);int length = this.length;
		__CLR4_1_10499499luszvt8a.R.inc(5523);if ((((length + 1 > data.length)&&(__CLR4_1_10499499luszvt8a.R.iget(5524)!=0|true))||(__CLR4_1_10499499luszvt8a.R.iget(5525)==0&false))) {{
			__CLR4_1_10499499luszvt8a.R.inc(5526);enlarge(1);
		}
		}__CLR4_1_10499499luszvt8a.R.inc(5527);data[length++] = (byte) b;
		__CLR4_1_10499499luszvt8a.R.inc(5528);this.length = length;
		__CLR4_1_10499499luszvt8a.R.inc(5529);return this;
	}finally{__CLR4_1_10499499luszvt8a.R.flushNeeded();}}

	/**
	 * Puts two bytes into this byte vector. The byte vector is automatically
	 * enlarged if necessary.
	 *
	 * @param b1 a byte.
	 * @param b2 another byte.
	 * @return this byte vector.
	 */
	ByteVector put11(final int b1, final int b2) {try{__CLR4_1_10499499luszvt8a.R.inc(5530);
		__CLR4_1_10499499luszvt8a.R.inc(5531);int length = this.length;
		__CLR4_1_10499499luszvt8a.R.inc(5532);if ((((length + 2 > data.length)&&(__CLR4_1_10499499luszvt8a.R.iget(5533)!=0|true))||(__CLR4_1_10499499luszvt8a.R.iget(5534)==0&false))) {{
			__CLR4_1_10499499luszvt8a.R.inc(5535);enlarge(2);
		}
		}__CLR4_1_10499499luszvt8a.R.inc(5536);final byte[] data = this.data;
		__CLR4_1_10499499luszvt8a.R.inc(5537);data[length++] = (byte) b1;
		__CLR4_1_10499499luszvt8a.R.inc(5538);data[length++] = (byte) b2;
		__CLR4_1_10499499luszvt8a.R.inc(5539);this.length = length;
		__CLR4_1_10499499luszvt8a.R.inc(5540);return this;
	}finally{__CLR4_1_10499499luszvt8a.R.flushNeeded();}}

	/**
	 * Puts a short into this byte vector. The byte vector is automatically enlarged
	 * if necessary.
	 *
	 * @param s a short.
	 * @return this byte vector.
	 */
	public ByteVector putShort(final int s) {try{__CLR4_1_10499499luszvt8a.R.inc(5541);
		__CLR4_1_10499499luszvt8a.R.inc(5542);int length = this.length;
		__CLR4_1_10499499luszvt8a.R.inc(5543);if ((((length + 2 > data.length)&&(__CLR4_1_10499499luszvt8a.R.iget(5544)!=0|true))||(__CLR4_1_10499499luszvt8a.R.iget(5545)==0&false))) {{
			__CLR4_1_10499499luszvt8a.R.inc(5546);enlarge(2);
		}
		}__CLR4_1_10499499luszvt8a.R.inc(5547);final byte[] data = this.data;
		__CLR4_1_10499499luszvt8a.R.inc(5548);data[length++] = (byte) (s >>> 8);
		__CLR4_1_10499499luszvt8a.R.inc(5549);data[length++] = (byte) s;
		__CLR4_1_10499499luszvt8a.R.inc(5550);this.length = length;
		__CLR4_1_10499499luszvt8a.R.inc(5551);return this;
	}finally{__CLR4_1_10499499luszvt8a.R.flushNeeded();}}

	/**
	 * Puts a byte and a short into this byte vector. The byte vector is
	 * automatically enlarged if necessary.
	 *
	 * @param b a byte.
	 * @param s a short.
	 * @return this byte vector.
	 */
	public ByteVector put12(final int b, final int s) {try{__CLR4_1_10499499luszvt8a.R.inc(5552);
		__CLR4_1_10499499luszvt8a.R.inc(5553);int length = this.length;
		__CLR4_1_10499499luszvt8a.R.inc(5554);if ((((length + 3 > data.length)&&(__CLR4_1_10499499luszvt8a.R.iget(5555)!=0|true))||(__CLR4_1_10499499luszvt8a.R.iget(5556)==0&false))) {{
			__CLR4_1_10499499luszvt8a.R.inc(5557);enlarge(3);
		}
		}__CLR4_1_10499499luszvt8a.R.inc(5558);final byte[] data = this.data;
		__CLR4_1_10499499luszvt8a.R.inc(5559);data[length++] = (byte) b;
		__CLR4_1_10499499luszvt8a.R.inc(5560);data[length++] = (byte) (s >>> 8);
		__CLR4_1_10499499luszvt8a.R.inc(5561);data[length++] = (byte) s;
		__CLR4_1_10499499luszvt8a.R.inc(5562);this.length = length;
		__CLR4_1_10499499luszvt8a.R.inc(5563);return this;
	}finally{__CLR4_1_10499499luszvt8a.R.flushNeeded();}}

	/**
	 * Puts an int into this byte vector. The byte vector is automatically enlarged
	 * if necessary.
	 *
	 * @param i an int.
	 * @return this byte vector.
	 */
	public ByteVector putInt(final int i) {try{__CLR4_1_10499499luszvt8a.R.inc(5564);
		__CLR4_1_10499499luszvt8a.R.inc(5565);int length = this.length;
		__CLR4_1_10499499luszvt8a.R.inc(5566);if ((((length + 4 > data.length)&&(__CLR4_1_10499499luszvt8a.R.iget(5567)!=0|true))||(__CLR4_1_10499499luszvt8a.R.iget(5568)==0&false))) {{
			__CLR4_1_10499499luszvt8a.R.inc(5569);enlarge(4);
		}
		}__CLR4_1_10499499luszvt8a.R.inc(5570);final byte[] data = this.data;
		__CLR4_1_10499499luszvt8a.R.inc(5571);data[length++] = (byte) (i >>> 24);
		__CLR4_1_10499499luszvt8a.R.inc(5572);data[length++] = (byte) (i >>> 16);
		__CLR4_1_10499499luszvt8a.R.inc(5573);data[length++] = (byte) (i >>> 8);
		__CLR4_1_10499499luszvt8a.R.inc(5574);data[length++] = (byte) i;
		__CLR4_1_10499499luszvt8a.R.inc(5575);this.length = length;
		__CLR4_1_10499499luszvt8a.R.inc(5576);return this;
	}finally{__CLR4_1_10499499luszvt8a.R.flushNeeded();}}

	/**
	 * Puts an UTF8 string into this byte vector. The byte vector is automatically
	 * enlarged if necessary.
	 *
	 * @param s a String.
	 * @return this byte vector.
	 */
	public ByteVector putUTF8(final String s) {try{__CLR4_1_10499499luszvt8a.R.inc(5577);
		__CLR4_1_10499499luszvt8a.R.inc(5578);final int charLength = s.length();
		__CLR4_1_10499499luszvt8a.R.inc(5579);int len = length;
		__CLR4_1_10499499luszvt8a.R.inc(5580);if ((((len + 2 + charLength > data.length)&&(__CLR4_1_10499499luszvt8a.R.iget(5581)!=0|true))||(__CLR4_1_10499499luszvt8a.R.iget(5582)==0&false))) {{
			__CLR4_1_10499499luszvt8a.R.inc(5583);enlarge(2 + charLength);
		}
		}__CLR4_1_10499499luszvt8a.R.inc(5584);final byte[] data = this.data;
		// optimistic algorithm: instead of computing the byte length and then
		// serializing the string (which requires two loops), we assume the byte
		// length is equal to char length (which is the most frequent case), and
		// we start serializing the string right away. During the serialization,
		// if we find that this assumption is wrong, we continue with the
		// general method.
		__CLR4_1_10499499luszvt8a.R.inc(5585);data[len++] = (byte) (charLength >>> 8);
		__CLR4_1_10499499luszvt8a.R.inc(5586);data[len++] = (byte) charLength;
		__CLR4_1_10499499luszvt8a.R.inc(5587);for (int i = 0; (((i < charLength)&&(__CLR4_1_10499499luszvt8a.R.iget(5588)!=0|true))||(__CLR4_1_10499499luszvt8a.R.iget(5589)==0&false)); ++i) {{
			__CLR4_1_10499499luszvt8a.R.inc(5590);final char c = s.charAt(i);
			__CLR4_1_10499499luszvt8a.R.inc(5591);if ((((c >= '\001' && c <= '\177')&&(__CLR4_1_10499499luszvt8a.R.iget(5592)!=0|true))||(__CLR4_1_10499499luszvt8a.R.iget(5593)==0&false))) {{
				__CLR4_1_10499499luszvt8a.R.inc(5594);data[len++] = (byte) c;
			} }else {{
				__CLR4_1_10499499luszvt8a.R.inc(5595);throw new UnsupportedOperationException();
			}
		}}
		}__CLR4_1_10499499luszvt8a.R.inc(5596);length = len;
		__CLR4_1_10499499luszvt8a.R.inc(5597);return this;
	}finally{__CLR4_1_10499499luszvt8a.R.flushNeeded();}}

	/**
	 * Puts an array of bytes into this byte vector. The byte vector is
	 * automatically enlarged if necessary.
	 *
	 * @param b   an array of bytes. May be <tt>null</tt> to put <tt>len</tt> null
	 *            bytes into this byte vector.
	 * @param off index of the fist byte of b that must be copied.
	 * @param len number of bytes of b that must be copied.
	 * @return this byte vector.
	 */
	public ByteVector putByteArray(final byte[] b, final int off, final int len) {try{__CLR4_1_10499499luszvt8a.R.inc(5598);
		__CLR4_1_10499499luszvt8a.R.inc(5599);if ((((length + len > data.length)&&(__CLR4_1_10499499luszvt8a.R.iget(5600)!=0|true))||(__CLR4_1_10499499luszvt8a.R.iget(5601)==0&false))) {{
			__CLR4_1_10499499luszvt8a.R.inc(5602);enlarge(len);
		}
		}__CLR4_1_10499499luszvt8a.R.inc(5603);if ((((b != null)&&(__CLR4_1_10499499luszvt8a.R.iget(5604)!=0|true))||(__CLR4_1_10499499luszvt8a.R.iget(5605)==0&false))) {{
			__CLR4_1_10499499luszvt8a.R.inc(5606);System.arraycopy(b, off, data, length, len);
		}
		}__CLR4_1_10499499luszvt8a.R.inc(5607);length += len;
		__CLR4_1_10499499luszvt8a.R.inc(5608);return this;
	}finally{__CLR4_1_10499499luszvt8a.R.flushNeeded();}}

	/**
	 * Enlarge this byte vector so that it can receive n more bytes.
	 *
	 * @param size number of additional bytes that this byte vector should be able
	 *             to receive.
	 */
	private void enlarge(final int size) {try{__CLR4_1_10499499luszvt8a.R.inc(5609);
		__CLR4_1_10499499luszvt8a.R.inc(5610);final int length1 = 2 * data.length;
		__CLR4_1_10499499luszvt8a.R.inc(5611);final int length2 = length + size;
		__CLR4_1_10499499luszvt8a.R.inc(5612);final byte[] newData = new byte[(((length1 > length2 )&&(__CLR4_1_10499499luszvt8a.R.iget(5613)!=0|true))||(__CLR4_1_10499499luszvt8a.R.iget(5614)==0&false))? length1 : length2];
		__CLR4_1_10499499luszvt8a.R.inc(5615);System.arraycopy(data, 0, newData, 0, length);
		__CLR4_1_10499499luszvt8a.R.inc(5616);data = newData;
	}finally{__CLR4_1_10499499luszvt8a.R.flushNeeded();}}
}
