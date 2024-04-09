/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test;

import java.util.Arrays;

/** A very fast and memory efficient class to encode and decode to and from BASE64 in full accordance
 * with RFC 2045.<br><br>
 * On Windows XP sp1 with 1.4.2_04 and later ;), this encoder and decoder is about 10 times faster
 * on small arrays (10 - 1000 bytes) and 2-3 times as fast on larger arrays (10000 - 1000000 bytes)
 * compared to <code>sun.misc.Encoder()/Decoder()</code>.<br><br>
 *
 * On byte arrays the encoder is about 20% faster than Jakarta Commons Base64 Codec for encode and
 * about 50% faster for decoding large arrays. This implementation is about twice as fast on very small
 * arrays (&lt 30 bytes). If source/destination is a <code>String</code> this
 * version is about three times as fast due to the fact that the Commons Codec result has to be recoded
 * to a <code>String</code> from <code>byte[]</code>, which is very expensive.<br><br>
 *
 * This encode/decode algorithm doesn't create any temporary arrays as many other codecs do, it only
 * allocates the resulting array. This produces less garbage and it is possible to handle arrays twice
 * as large as algorithms that create a temporary array. (E.g. Jakarta Commons Codec). It is unknown
 * whether Sun's <code>sun.misc.Encoder()/Decoder()</code> produce temporary arrays but since performance
 * is quite low it probably does.<br><br>
 *
 * The encoder produces the same output as the Sun one except that the Sun's encoder appends
 * a trailing line separator if the last character isn't a pad. Unclear why but it only adds to the
 * length and is probably a side effect. Both are in conformance with RFC 2045 though.<br>
 * Commons codec seem to always att a trailing line separator.<br><br>
 *
 * <b>Note!</b>
 * The encode/decode method pairs (types) come in three versions with the <b>exact</b> same algorithm and
 * thus a lot of code redundancy. This is to not create any temporary arrays for transcoding to/from different
 * format types. The methods not used can simply be commented out.<br><br>
 *
 * There is also a "fast" version of all decode methods that works the same way as the normal ones, but
 * har a few demands on the decoded input. Normally though, these fast verions should be used if the source if
 * the input is known and it hasn't bee tampered with.<br><br>
 *
 * If you find the code useful or you find a bug, please send me a note at base64 @ miginfocom . com.
 *
 * Licence (BSD):
 * ==============
 *
 * Copyright (c) 2004, Mikael Grev, MiG InfoCom AB. (base64 @ miginfocom . com)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or other
 * materials provided with the distribution.
 * Neither the name of the MiG InfoCom AB nor the names of its contributors may be
 * used to endorse or promote products derived from this software without specific
 * prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA,
 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY
 * OF SUCH DAMAGE.
 *
 * @version 2.2
 * @author Mikael Grev
 *         Date: 2004-aug-02
 *         Time: 11:31:11
 */

public class Base64
{public static class __CLR4_1_1020og20oglusqkqni{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,94600,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	private static final char[] CA = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
	private static final int[] IA = new int[256];
	static {try{__CLR4_1_1020og20oglusqkqni.R.inc(94192);
		__CLR4_1_1020og20oglusqkqni.R.inc(94193);Arrays.fill(IA, -1);
		__CLR4_1_1020og20oglusqkqni.R.inc(94194);for (int i = 0, iS = CA.length; (((i < iS)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94195)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94196)==0&false)); i++)
			{__CLR4_1_1020og20oglusqkqni.R.inc(94197);IA[CA[i]] = i;
		}__CLR4_1_1020og20oglusqkqni.R.inc(94198);IA['='] = 0;
	}finally{__CLR4_1_1020og20oglusqkqni.R.flushNeeded();}}

	// ****************************************************************************************
	// *  char[] version
	// ****************************************************************************************

	/** Encodes a raw byte array into a BASE64 <code>char[]</code> representation i accordance with RFC 2045.
	 * @param bytes The bytes to convert. If <code>null</code> or length 0 an empty array will be returned.
	 * @param lineSep Optional "\r\n" after 76 characters, unless end of file.<br>
	 * No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a
	 * little faster.
	 * @return A BASE64 encoded array. Never <code>null</code>.
	 */
	public final static char[] encodeToChar(byte[] bytes, boolean lineSep)
	{try{__CLR4_1_1020og20oglusqkqni.R.inc(94199);
		// Check special case
		__CLR4_1_1020og20oglusqkqni.R.inc(94200);int bytes_len = (((bytes != null )&&(__CLR4_1_1020og20oglusqkqni.R.iget(94201)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94202)==0&false))? bytes.length : 0;
		__CLR4_1_1020og20oglusqkqni.R.inc(94203);if ((((bytes_len == 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94204)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94205)==0&false)))
			{__CLR4_1_1020og20oglusqkqni.R.inc(94206);return new char[0];

		}__CLR4_1_1020og20oglusqkqni.R.inc(94207);int eLen = (bytes_len / 3) * 3;              // Length of even 24-bits.
		__CLR4_1_1020og20oglusqkqni.R.inc(94208);int cCnt = ((bytes_len - 1) / 3 + 1) << 2;   // Returned character count
		__CLR4_1_1020og20oglusqkqni.R.inc(94209);int chars_len = cCnt + ((((lineSep )&&(__CLR4_1_1020og20oglusqkqni.R.iget(94210)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94211)==0&false))? (cCnt - 1) / 76 << 1 : 0); // Length of returned array
		__CLR4_1_1020og20oglusqkqni.R.inc(94212);char[] chars = new char[chars_len];

		// Encode even 24-bits
		__CLR4_1_1020og20oglusqkqni.R.inc(94213);for (int s = 0, d = 0, cc = 0; (((s < eLen)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94214)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94215)==0&false));) {{
			// Copy next three bytes into lower 24 bits of int, paying attension to sign.
			__CLR4_1_1020og20oglusqkqni.R.inc(94216);int i = (bytes[s++] & 0xff) << 16 | (bytes[s++] & 0xff) << 8 | (bytes[s++] & 0xff);

			// Encode the int into four chars
			__CLR4_1_1020og20oglusqkqni.R.inc(94217);chars[d++] = CA[(i >>> 18) & 0x3f];
			__CLR4_1_1020og20oglusqkqni.R.inc(94218);chars[d++] = CA[(i >>> 12) & 0x3f];
			__CLR4_1_1020og20oglusqkqni.R.inc(94219);chars[d++] = CA[(i >>> 6) & 0x3f];
			__CLR4_1_1020og20oglusqkqni.R.inc(94220);chars[d++] = CA[i & 0x3f];

			// Add optional line separator
			__CLR4_1_1020og20oglusqkqni.R.inc(94221);if ((((lineSep && ++cc == 19 && d < chars_len - 2)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94222)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94223)==0&false))) {{
				__CLR4_1_1020og20oglusqkqni.R.inc(94224);chars[d++] = '\r';
				__CLR4_1_1020og20oglusqkqni.R.inc(94225);chars[d++] = '\n';
				__CLR4_1_1020og20oglusqkqni.R.inc(94226);cc = 0;
			}
		}}

		// Pad and encode last bits if source isn't even 24 bits.
		}__CLR4_1_1020og20oglusqkqni.R.inc(94227);int left = bytes_len - eLen; // 0 - 2.
		__CLR4_1_1020og20oglusqkqni.R.inc(94228);if ((((left > 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94229)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94230)==0&false))) {{
			// Prepare the int
			__CLR4_1_1020og20oglusqkqni.R.inc(94231);int i = ((bytes[eLen] & 0xff) << 10) | ((((left == 2 )&&(__CLR4_1_1020og20oglusqkqni.R.iget(94232)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94233)==0&false))? ((bytes[bytes_len - 1] & 0xff) << 2) : 0);

			// Set last four chars
			__CLR4_1_1020og20oglusqkqni.R.inc(94234);chars[chars_len - 4] = CA[i >> 12];
			__CLR4_1_1020og20oglusqkqni.R.inc(94235);chars[chars_len - 3] = CA[(i >>> 6) & 0x3f];
			__CLR4_1_1020og20oglusqkqni.R.inc(94236);chars[chars_len - 2] = (((left == 2 )&&(__CLR4_1_1020og20oglusqkqni.R.iget(94237)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94238)==0&false))? CA[i & 0x3f] : '=';
			__CLR4_1_1020og20oglusqkqni.R.inc(94239);chars[chars_len - 1] = '=';
		}
		}__CLR4_1_1020og20oglusqkqni.R.inc(94240);return chars;
	}finally{__CLR4_1_1020og20oglusqkqni.R.flushNeeded();}}

	/** Decodes a BASE64 encoded char array. All illegal characters will be ignored and can handle both arrays with
	 * and without line separators.
	 * @param sArr The source array. <code>null</code> or length 0 will return an empty array.
	 * @return The decoded array of bytes. May be of length 0. Will be <code>null</code> if the legal characters
	 * (including '=') isn't divideable by 4.  (I.e. definitely corrupted).
	 */
	public final static byte[] decode(char[] sArr)
	{try{__CLR4_1_1020og20oglusqkqni.R.inc(94241);
		// Check special case
		__CLR4_1_1020og20oglusqkqni.R.inc(94242);int sLen = (((sArr != null )&&(__CLR4_1_1020og20oglusqkqni.R.iget(94243)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94244)==0&false))? sArr.length : 0;
		__CLR4_1_1020og20oglusqkqni.R.inc(94245);if ((((sLen == 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94246)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94247)==0&false)))
			{__CLR4_1_1020og20oglusqkqni.R.inc(94248);return new byte[0];

		// Count illegal characters (including '\r', '\n') to know what size the returned array will be,
		// so we don't have to reallocate & copy it later.
		}__CLR4_1_1020og20oglusqkqni.R.inc(94249);int sepCnt = 0; // Number of separator characters. (Actually illegal characters, but that's a bonus...)
		__CLR4_1_1020og20oglusqkqni.R.inc(94250);for (int i = 0; (((i < sLen)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94251)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94252)==0&false)); i++)  // If input is "pure" (I.e. no line separators or illegal chars) base64 this loop can be commented out.
			{__CLR4_1_1020og20oglusqkqni.R.inc(94253);if ((((IA[sArr[i]] < 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94254)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94255)==0&false)))
				{__CLR4_1_1020og20oglusqkqni.R.inc(94256);sepCnt++;

		// Check so that legal chars (including '=') are evenly divideable by 4 as specified in RFC 2045.
		}}__CLR4_1_1020og20oglusqkqni.R.inc(94257);if (((((sLen - sepCnt) % 4 != 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94258)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94259)==0&false)))
			{__CLR4_1_1020og20oglusqkqni.R.inc(94260);return null;

		}__CLR4_1_1020og20oglusqkqni.R.inc(94261);int pad = 0;
		__CLR4_1_1020og20oglusqkqni.R.inc(94262);for (int i = sLen; (((i > 1 && IA[sArr[--i]] <= 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94263)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94264)==0&false));)
			{__CLR4_1_1020og20oglusqkqni.R.inc(94265);if ((((sArr[i] == '=')&&(__CLR4_1_1020og20oglusqkqni.R.iget(94266)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94267)==0&false)))
				{__CLR4_1_1020og20oglusqkqni.R.inc(94268);pad++;

		}}__CLR4_1_1020og20oglusqkqni.R.inc(94269);int len = ((sLen - sepCnt) * 6 >> 3) - pad;

		__CLR4_1_1020og20oglusqkqni.R.inc(94270);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		__CLR4_1_1020og20oglusqkqni.R.inc(94271);for (int s = 0, d = 0; (((d < len)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94272)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94273)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_1_1020og20oglusqkqni.R.inc(94274);int i = 0;
			__CLR4_1_1020og20oglusqkqni.R.inc(94275);for (int j = 0; (((j < 4)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94276)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94277)==0&false)); j++) {{   // j only increased if a valid char was found.
				__CLR4_1_1020og20oglusqkqni.R.inc(94278);int c = IA[sArr[s++]];
				__CLR4_1_1020og20oglusqkqni.R.inc(94279);if ((((c >= 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94280)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94281)==0&false)))
				    {__CLR4_1_1020og20oglusqkqni.R.inc(94282);i |= c << (18 - j * 6);
				}else
					{__CLR4_1_1020og20oglusqkqni.R.inc(94283);j--;
			}}
			// Add the bytes
			}__CLR4_1_1020og20oglusqkqni.R.inc(94284);dArr[d++] = (byte) (i >> 16);
			__CLR4_1_1020og20oglusqkqni.R.inc(94285);if ((((d < len)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94286)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94287)==0&false))) {{
				__CLR4_1_1020og20oglusqkqni.R.inc(94288);dArr[d++]= (byte) (i >> 8);
				__CLR4_1_1020og20oglusqkqni.R.inc(94289);if ((((d < len)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94290)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94291)==0&false)))
					{__CLR4_1_1020og20oglusqkqni.R.inc(94292);dArr[d++] = (byte) i;
			}}
		}}
		}__CLR4_1_1020og20oglusqkqni.R.inc(94293);return dArr;
	}finally{__CLR4_1_1020og20oglusqkqni.R.flushNeeded();}}

	/** Decodes a BASE64 encoded char array that is known to be resonably well formatted. The method is about twice as
	 * fast as {@link #decode(char[])}. The preconditions are:<br>
	 * + The array must have a line length of 76 chars OR no line separators at all (one line).<br>
	 * + Line separator must be "\r\n", as specified in RFC 2045
	 * + The array must not contain illegal characters within the encoded string<br>
	 * + The array CAN have illegal characters at the beginning and end, those will be dealt with appropriately.<br>
	 * @param sArr The source array. Length 0 will return an empty array. <code>null</code> will throw an exception.
	 * @return The decoded array of bytes. May be of length 0.
	 */
	public final static byte[] decodeFast(char[] sArr)
	{try{__CLR4_1_1020og20oglusqkqni.R.inc(94294);
		// Check special case
		__CLR4_1_1020og20oglusqkqni.R.inc(94295);int sLen = sArr.length;
		__CLR4_1_1020og20oglusqkqni.R.inc(94296);if ((((sLen == 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94297)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94298)==0&false)))
			{__CLR4_1_1020og20oglusqkqni.R.inc(94299);return new byte[0];

		}__CLR4_1_1020og20oglusqkqni.R.inc(94300);int sIx = 0, eIx = sLen - 1;    // Start and end index after trimming.

		// Trim illegal chars from start
		__CLR4_1_1020og20oglusqkqni.R.inc(94301);while ((((sIx < eIx && IA[sArr[sIx]] < 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94302)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94303)==0&false)))
			{__CLR4_1_1020og20oglusqkqni.R.inc(94304);sIx++;

		// Trim illegal chars from end
		}__CLR4_1_1020og20oglusqkqni.R.inc(94305);while ((((eIx > 0 && IA[sArr[eIx]] < 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94306)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94307)==0&false)))
			{__CLR4_1_1020og20oglusqkqni.R.inc(94308);eIx--;

		// get the padding count (=) (0, 1 or 2)
		}__CLR4_1_1020og20oglusqkqni.R.inc(94309);int pad = (((sArr[eIx] == '=' )&&(__CLR4_1_1020og20oglusqkqni.R.iget(94310)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94311)==0&false))? ((((sArr[eIx - 1] == '=' )&&(__CLR4_1_1020og20oglusqkqni.R.iget(94312)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94313)==0&false))? 2 : 1) : 0;  // Count '=' at end.
		__CLR4_1_1020og20oglusqkqni.R.inc(94314);int cCnt = eIx - sIx + 1;   // Content count including possible separators
		__CLR4_1_1020og20oglusqkqni.R.inc(94315);int sepCnt = (((sLen > 76 )&&(__CLR4_1_1020og20oglusqkqni.R.iget(94316)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94317)==0&false))? ((((sArr[76] == '\r' )&&(__CLR4_1_1020og20oglusqkqni.R.iget(94318)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94319)==0&false))? cCnt / 78 : 0) << 1 : 0;

		__CLR4_1_1020og20oglusqkqni.R.inc(94320);int len = ((cCnt - sepCnt) * 6 >> 3) - pad; // The number of decoded bytes
		__CLR4_1_1020og20oglusqkqni.R.inc(94321);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		// Decode all but the last 0 - 2 bytes.
		__CLR4_1_1020og20oglusqkqni.R.inc(94322);int d = 0;
		__CLR4_1_1020og20oglusqkqni.R.inc(94323);for (int cc = 0, eLen = (len / 3) * 3; (((d < eLen)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94324)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94325)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_1_1020og20oglusqkqni.R.inc(94326);int i = IA[sArr[sIx++]] << 18 | IA[sArr[sIx++]] << 12 | IA[sArr[sIx++]] << 6 | IA[sArr[sIx++]];

			// Add the bytes
			__CLR4_1_1020og20oglusqkqni.R.inc(94327);dArr[d++] = (byte) (i >> 16);
			__CLR4_1_1020og20oglusqkqni.R.inc(94328);dArr[d++] = (byte) (i >> 8);
			__CLR4_1_1020og20oglusqkqni.R.inc(94329);dArr[d++] = (byte) i;

			// If line separator, jump over it.
			__CLR4_1_1020og20oglusqkqni.R.inc(94330);if ((((sepCnt > 0 && ++cc == 19)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94331)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94332)==0&false))) {{
				__CLR4_1_1020og20oglusqkqni.R.inc(94333);sIx += 2;
				__CLR4_1_1020og20oglusqkqni.R.inc(94334);cc = 0;
			}
		}}

		}__CLR4_1_1020og20oglusqkqni.R.inc(94335);if ((((d < len)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94336)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94337)==0&false))) {{
			// Decode last 1-3 bytes (incl '=') into 1-3 bytes
			__CLR4_1_1020og20oglusqkqni.R.inc(94338);int i = 0;
			__CLR4_1_1020og20oglusqkqni.R.inc(94339);for (int j = 0; (((sIx <= eIx - pad)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94340)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94341)==0&false)); j++)
				{__CLR4_1_1020og20oglusqkqni.R.inc(94342);i |= IA[sArr[sIx++]] << (18 - j * 6);

			}__CLR4_1_1020og20oglusqkqni.R.inc(94343);for (int r = 16; (((d < len)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94344)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94345)==0&false)); r -= 8)
				{__CLR4_1_1020og20oglusqkqni.R.inc(94346);dArr[d++] = (byte) (i >> r);
		}}

		}__CLR4_1_1020og20oglusqkqni.R.inc(94347);return dArr;
	}finally{__CLR4_1_1020og20oglusqkqni.R.flushNeeded();}}

	// ****************************************************************************************
	// *  byte[] version
	// ****************************************************************************************

	/** Encodes a raw byte array into a BASE64 <code>byte[]</code> representation i accordance with RFC 2045.
	 * @param sArr The bytes to convert. If <code>null</code> or length 0 an empty array will be returned.
	 * @param lineSep Optional "\r\n" after 76 characters, unless end of file.<br>
	 * No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a
	 * little faster.
	 * @return A BASE64 encoded array. Never <code>null</code>.
	 */
	public final static byte[] encodeToByte(byte[] sArr, boolean lineSep)
	{try{__CLR4_1_1020og20oglusqkqni.R.inc(94348);
		// Check special case
		__CLR4_1_1020og20oglusqkqni.R.inc(94349);int sLen = (((sArr != null )&&(__CLR4_1_1020og20oglusqkqni.R.iget(94350)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94351)==0&false))? sArr.length : 0;
		__CLR4_1_1020og20oglusqkqni.R.inc(94352);if ((((sLen == 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94353)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94354)==0&false)))
			{__CLR4_1_1020og20oglusqkqni.R.inc(94355);return new byte[0];

		}__CLR4_1_1020og20oglusqkqni.R.inc(94356);int eLen = (sLen / 3) * 3;                              // Length of even 24-bits.
		__CLR4_1_1020og20oglusqkqni.R.inc(94357);int cCnt = ((sLen - 1) / 3 + 1) << 2;                   // Returned character count
		__CLR4_1_1020og20oglusqkqni.R.inc(94358);int dLen = cCnt + ((((lineSep )&&(__CLR4_1_1020og20oglusqkqni.R.iget(94359)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94360)==0&false))? (cCnt - 1) / 76 << 1 : 0); // Length of returned array
		__CLR4_1_1020og20oglusqkqni.R.inc(94361);byte[] dArr = new byte[dLen];

		// Encode even 24-bits
		__CLR4_1_1020og20oglusqkqni.R.inc(94362);for (int s = 0, d = 0, cc = 0; (((s < eLen)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94363)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94364)==0&false));) {{
			// Copy next three bytes into lower 24 bits of int, paying attension to sign.
			__CLR4_1_1020og20oglusqkqni.R.inc(94365);int i = (sArr[s++] & 0xff) << 16 | (sArr[s++] & 0xff) << 8 | (sArr[s++] & 0xff);

			// Encode the int into four chars
			__CLR4_1_1020og20oglusqkqni.R.inc(94366);dArr[d++] = (byte) CA[(i >>> 18) & 0x3f];
			__CLR4_1_1020og20oglusqkqni.R.inc(94367);dArr[d++] = (byte) CA[(i >>> 12) & 0x3f];
			__CLR4_1_1020og20oglusqkqni.R.inc(94368);dArr[d++] = (byte) CA[(i >>> 6) & 0x3f];
			__CLR4_1_1020og20oglusqkqni.R.inc(94369);dArr[d++] = (byte) CA[i & 0x3f];

			// Add optional line separator
			__CLR4_1_1020og20oglusqkqni.R.inc(94370);if ((((lineSep && ++cc == 19 && d < dLen - 2)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94371)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94372)==0&false))) {{
				__CLR4_1_1020og20oglusqkqni.R.inc(94373);dArr[d++] = '\r';
				__CLR4_1_1020og20oglusqkqni.R.inc(94374);dArr[d++] = '\n';
				__CLR4_1_1020og20oglusqkqni.R.inc(94375);cc = 0;
			}
		}}

		// Pad and encode last bits if source isn't an even 24 bits.
		}__CLR4_1_1020og20oglusqkqni.R.inc(94376);int left = sLen - eLen; // 0 - 2.
		__CLR4_1_1020og20oglusqkqni.R.inc(94377);if ((((left > 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94378)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94379)==0&false))) {{
			// Prepare the int
			__CLR4_1_1020og20oglusqkqni.R.inc(94380);int i = ((sArr[eLen] & 0xff) << 10) | ((((left == 2 )&&(__CLR4_1_1020og20oglusqkqni.R.iget(94381)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94382)==0&false))? ((sArr[sLen - 1] & 0xff) << 2) : 0);

			// Set last four chars
			__CLR4_1_1020og20oglusqkqni.R.inc(94383);dArr[dLen - 4] = (byte) CA[i >> 12];
			__CLR4_1_1020og20oglusqkqni.R.inc(94384);dArr[dLen - 3] = (byte) CA[(i >>> 6) & 0x3f];
			__CLR4_1_1020og20oglusqkqni.R.inc(94385);dArr[dLen - 2] = (((left == 2 )&&(__CLR4_1_1020og20oglusqkqni.R.iget(94386)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94387)==0&false))? (byte) CA[i & 0x3f] : (byte) '=';
			__CLR4_1_1020og20oglusqkqni.R.inc(94388);dArr[dLen - 1] = '=';
		}
		}__CLR4_1_1020og20oglusqkqni.R.inc(94389);return dArr;
	}finally{__CLR4_1_1020og20oglusqkqni.R.flushNeeded();}}

	/** Decodes a BASE64 encoded byte array. All illegal characters will be ignored and can handle both arrays with
	 * and without line separators.
	 * @param sArr The source array. Length 0 will return an empty array. <code>null</code> will throw an exception.
	 * @return The decoded array of bytes. May be of length 0. Will be <code>null</code> if the legal characters
	 * (including '=') isn't divideable by 4. (I.e. definitely corrupted).
	 */
	public final static byte[] decode(byte[] sArr)
	{try{__CLR4_1_1020og20oglusqkqni.R.inc(94390);
		// Check special case
		__CLR4_1_1020og20oglusqkqni.R.inc(94391);int sLen = sArr.length;

		// Count illegal characters (including '\r', '\n') to know what size the returned array will be,
		// so we don't have to reallocate & copy it later.
		__CLR4_1_1020og20oglusqkqni.R.inc(94392);int sepCnt = 0; // Number of separator characters. (Actually illegal characters, but that's a bonus...)
		__CLR4_1_1020og20oglusqkqni.R.inc(94393);for (int i = 0; (((i < sLen)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94394)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94395)==0&false)); i++)      // If input is "pure" (I.e. no line separators or illegal chars) base64 this loop can be commented out.
			{__CLR4_1_1020og20oglusqkqni.R.inc(94396);if ((((IA[sArr[i] & 0xff] < 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94397)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94398)==0&false)))
				{__CLR4_1_1020og20oglusqkqni.R.inc(94399);sepCnt++;

		// Check so that legal chars (including '=') are evenly divideable by 4 as specified in RFC 2045.
		}}__CLR4_1_1020og20oglusqkqni.R.inc(94400);if (((((sLen - sepCnt) % 4 != 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94401)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94402)==0&false)))
			{__CLR4_1_1020og20oglusqkqni.R.inc(94403);return null;

		}__CLR4_1_1020og20oglusqkqni.R.inc(94404);int pad = 0;
		__CLR4_1_1020og20oglusqkqni.R.inc(94405);for (int i = sLen; (((i > 1 && IA[sArr[--i] & 0xff] <= 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94406)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94407)==0&false));)
			{__CLR4_1_1020og20oglusqkqni.R.inc(94408);if ((((sArr[i] == '=')&&(__CLR4_1_1020og20oglusqkqni.R.iget(94409)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94410)==0&false)))
				{__CLR4_1_1020og20oglusqkqni.R.inc(94411);pad++;

		}}__CLR4_1_1020og20oglusqkqni.R.inc(94412);int len = ((sLen - sepCnt) * 6 >> 3) - pad;

		__CLR4_1_1020og20oglusqkqni.R.inc(94413);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		__CLR4_1_1020og20oglusqkqni.R.inc(94414);for (int s = 0, d = 0; (((d < len)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94415)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94416)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_1_1020og20oglusqkqni.R.inc(94417);int i = 0;
			__CLR4_1_1020og20oglusqkqni.R.inc(94418);for (int j = 0; (((j < 4)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94419)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94420)==0&false)); j++) {{   // j only increased if a valid char was found.
				__CLR4_1_1020og20oglusqkqni.R.inc(94421);int c = IA[sArr[s++] & 0xff];
				__CLR4_1_1020og20oglusqkqni.R.inc(94422);if ((((c >= 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94423)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94424)==0&false)))
				    {__CLR4_1_1020og20oglusqkqni.R.inc(94425);i |= c << (18 - j * 6);
				}else
					{__CLR4_1_1020og20oglusqkqni.R.inc(94426);j--;
			}}

			// Add the bytes
			}__CLR4_1_1020og20oglusqkqni.R.inc(94427);dArr[d++] = (byte) (i >> 16);
			__CLR4_1_1020og20oglusqkqni.R.inc(94428);if ((((d < len)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94429)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94430)==0&false))) {{
				__CLR4_1_1020og20oglusqkqni.R.inc(94431);dArr[d++]= (byte) (i >> 8);
				__CLR4_1_1020og20oglusqkqni.R.inc(94432);if ((((d < len)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94433)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94434)==0&false)))
					{__CLR4_1_1020og20oglusqkqni.R.inc(94435);dArr[d++] = (byte) i;
			}}
		}}

		}__CLR4_1_1020og20oglusqkqni.R.inc(94436);return dArr;
	}finally{__CLR4_1_1020og20oglusqkqni.R.flushNeeded();}}


	/** Decodes a BASE64 encoded byte array that is known to be resonably well formatted. The method is about twice as
	 * fast as {@link #decode(byte[])}. The preconditions are:<br>
	 * + The array must have a line length of 76 chars OR no line separators at all (one line).<br>
	 * + Line separator must be "\r\n", as specified in RFC 2045
	 * + The array must not contain illegal characters within the encoded string<br>
	 * + The array CAN have illegal characters at the beginning and end, those will be dealt with appropriately.<br>
	 * @param sArr The source array. Length 0 will return an empty array. <code>null</code> will throw an exception.
	 * @return The decoded array of bytes. May be of length 0.
	 */
	public final static byte[] decodeFast(byte[] sArr)
	{try{__CLR4_1_1020og20oglusqkqni.R.inc(94437);
		// Check special case
		__CLR4_1_1020og20oglusqkqni.R.inc(94438);int sLen = sArr.length;
		__CLR4_1_1020og20oglusqkqni.R.inc(94439);if ((((sLen == 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94440)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94441)==0&false)))
			{__CLR4_1_1020og20oglusqkqni.R.inc(94442);return new byte[0];

		}__CLR4_1_1020og20oglusqkqni.R.inc(94443);int sIx = 0, eIx = sLen - 1;    // Start and end index after trimming.

		// Trim illegal chars from start
		__CLR4_1_1020og20oglusqkqni.R.inc(94444);while ((((sIx < eIx && IA[sArr[sIx] & 0xff] < 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94445)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94446)==0&false)))
			{__CLR4_1_1020og20oglusqkqni.R.inc(94447);sIx++;

		// Trim illegal chars from end
		}__CLR4_1_1020og20oglusqkqni.R.inc(94448);while ((((eIx > 0 && IA[sArr[eIx] & 0xff] < 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94449)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94450)==0&false)))
			{__CLR4_1_1020og20oglusqkqni.R.inc(94451);eIx--;

		// get the padding count (=) (0, 1 or 2)
		}__CLR4_1_1020og20oglusqkqni.R.inc(94452);int pad = (((sArr[eIx] == '=' )&&(__CLR4_1_1020og20oglusqkqni.R.iget(94453)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94454)==0&false))? ((((sArr[eIx - 1] == '=' )&&(__CLR4_1_1020og20oglusqkqni.R.iget(94455)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94456)==0&false))? 2 : 1) : 0;  // Count '=' at end.
		__CLR4_1_1020og20oglusqkqni.R.inc(94457);int cCnt = eIx - sIx + 1;   // Content count including possible separators
		__CLR4_1_1020og20oglusqkqni.R.inc(94458);int sepCnt = (((sLen > 76 )&&(__CLR4_1_1020og20oglusqkqni.R.iget(94459)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94460)==0&false))? ((((sArr[76] == '\r' )&&(__CLR4_1_1020og20oglusqkqni.R.iget(94461)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94462)==0&false))? cCnt / 78 : 0) << 1 : 0;

		__CLR4_1_1020og20oglusqkqni.R.inc(94463);int len = ((cCnt - sepCnt) * 6 >> 3) - pad; // The number of decoded bytes
		__CLR4_1_1020og20oglusqkqni.R.inc(94464);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		// Decode all but the last 0 - 2 bytes.
		__CLR4_1_1020og20oglusqkqni.R.inc(94465);int d = 0;
		__CLR4_1_1020og20oglusqkqni.R.inc(94466);for (int cc = 0, eLen = (len / 3) * 3; (((d < eLen)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94467)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94468)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_1_1020og20oglusqkqni.R.inc(94469);int i = IA[sArr[sIx++]] << 18 | IA[sArr[sIx++]] << 12 | IA[sArr[sIx++]] << 6 | IA[sArr[sIx++]];

			// Add the bytes
			__CLR4_1_1020og20oglusqkqni.R.inc(94470);dArr[d++] = (byte) (i >> 16);
			__CLR4_1_1020og20oglusqkqni.R.inc(94471);dArr[d++] = (byte) (i >> 8);
			__CLR4_1_1020og20oglusqkqni.R.inc(94472);dArr[d++] = (byte) i;

			// If line separator, jump over it.
			__CLR4_1_1020og20oglusqkqni.R.inc(94473);if ((((sepCnt > 0 && ++cc == 19)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94474)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94475)==0&false))) {{
				__CLR4_1_1020og20oglusqkqni.R.inc(94476);sIx += 2;
				__CLR4_1_1020og20oglusqkqni.R.inc(94477);cc = 0;
			}
		}}

		}__CLR4_1_1020og20oglusqkqni.R.inc(94478);if ((((d < len)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94479)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94480)==0&false))) {{
			// Decode last 1-3 bytes (incl '=') into 1-3 bytes
			__CLR4_1_1020og20oglusqkqni.R.inc(94481);int i = 0;
			__CLR4_1_1020og20oglusqkqni.R.inc(94482);for (int j = 0; (((sIx <= eIx - pad)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94483)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94484)==0&false)); j++)
				{__CLR4_1_1020og20oglusqkqni.R.inc(94485);i |= IA[sArr[sIx++]] << (18 - j * 6);

			}__CLR4_1_1020og20oglusqkqni.R.inc(94486);for (int r = 16; (((d < len)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94487)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94488)==0&false)); r -= 8)
				{__CLR4_1_1020og20oglusqkqni.R.inc(94489);dArr[d++] = (byte) (i >> r);
		}}

		}__CLR4_1_1020og20oglusqkqni.R.inc(94490);return dArr;
	}finally{__CLR4_1_1020og20oglusqkqni.R.flushNeeded();}}

	// ****************************************************************************************
	// * String version
	// ****************************************************************************************

	/** Encodes a raw byte array into a BASE64 <code>String</code> representation i accordance with RFC 2045.
	 * @param sArr The bytes to convert. If <code>null</code> or length 0 an empty array will be returned.
	 * @param lineSep Optional "\r\n" after 76 characters, unless end of file.<br>
	 * No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a
	 * little faster.
	 * @return A BASE64 encoded array. Never <code>null</code>.
	 */
	public final static String encodeToString(byte[] sArr, boolean lineSep)
	{try{__CLR4_1_1020og20oglusqkqni.R.inc(94491);
		// Reuse char[] since we can't create a String incrementally anyway and StringBuffer/Builder would be slower.
		__CLR4_1_1020og20oglusqkqni.R.inc(94492);return new String(encodeToChar(sArr, lineSep));
	}finally{__CLR4_1_1020og20oglusqkqni.R.flushNeeded();}}

	/** Decodes a BASE64 encoded <code>String</code>. All illegal characters will be ignored and can handle both strings with
	 * and without line separators.<br>
	 * <b>Note!</b> It can be up to about 2x the speed to call <code>decode(str.toCharArray())</code> instead. That
	 * will create a temporary array though. This version will use <code>str.charAt(i)</code> to iterate the string.
	 * @param str The source string. <code>null</code> or length 0 will return an empty array.
	 * @return The decoded array of bytes. May be of length 0. Will be <code>null</code> if the legal characters
	 * (including '=') isn't divideable by 4.  (I.e. definitely corrupted).
	 */
	public final static byte[] decode(String str)
	{try{__CLR4_1_1020og20oglusqkqni.R.inc(94493);
		// Check special case
		__CLR4_1_1020og20oglusqkqni.R.inc(94494);int sLen = (((str != null )&&(__CLR4_1_1020og20oglusqkqni.R.iget(94495)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94496)==0&false))? str.length() : 0;
		__CLR4_1_1020og20oglusqkqni.R.inc(94497);if ((((sLen == 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94498)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94499)==0&false)))
			{__CLR4_1_1020og20oglusqkqni.R.inc(94500);return new byte[0];

		// Count illegal characters (including '\r', '\n') to know what size the returned array will be,
		// so we don't have to reallocate & copy it later.
		}__CLR4_1_1020og20oglusqkqni.R.inc(94501);int sepCnt = 0; // Number of separator characters. (Actually illegal characters, but that's a bonus...)
		__CLR4_1_1020og20oglusqkqni.R.inc(94502);for (int i = 0; (((i < sLen)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94503)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94504)==0&false)); i++)  // If input is "pure" (I.e. no line separators or illegal chars) base64 this loop can be commented out.
			{__CLR4_1_1020og20oglusqkqni.R.inc(94505);if ((((IA[str.charAt(i)] < 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94506)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94507)==0&false)))
				{__CLR4_1_1020og20oglusqkqni.R.inc(94508);sepCnt++;

		// Check so that legal chars (including '=') are evenly divideable by 4 as specified in RFC 2045.
		}}__CLR4_1_1020og20oglusqkqni.R.inc(94509);if (((((sLen - sepCnt) % 4 != 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94510)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94511)==0&false)))
			{__CLR4_1_1020og20oglusqkqni.R.inc(94512);return null;

		// Count '=' at end
		}__CLR4_1_1020og20oglusqkqni.R.inc(94513);int pad = 0;
		__CLR4_1_1020og20oglusqkqni.R.inc(94514);for (int i = sLen; (((i > 1 && IA[str.charAt(--i)] <= 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94515)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94516)==0&false));)
			{__CLR4_1_1020og20oglusqkqni.R.inc(94517);if ((((str.charAt(i) == '=')&&(__CLR4_1_1020og20oglusqkqni.R.iget(94518)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94519)==0&false)))
				{__CLR4_1_1020og20oglusqkqni.R.inc(94520);pad++;

		}}__CLR4_1_1020og20oglusqkqni.R.inc(94521);int len = ((sLen - sepCnt) * 6 >> 3) - pad;

		__CLR4_1_1020og20oglusqkqni.R.inc(94522);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		__CLR4_1_1020og20oglusqkqni.R.inc(94523);for (int s = 0, d = 0; (((d < len)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94524)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94525)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_1_1020og20oglusqkqni.R.inc(94526);int i = 0;
			__CLR4_1_1020og20oglusqkqni.R.inc(94527);for (int j = 0; (((j < 4)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94528)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94529)==0&false)); j++) {{   // j only increased if a valid char was found.
				__CLR4_1_1020og20oglusqkqni.R.inc(94530);int c = IA[str.charAt(s++)];
				__CLR4_1_1020og20oglusqkqni.R.inc(94531);if ((((c >= 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94532)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94533)==0&false)))
				    {__CLR4_1_1020og20oglusqkqni.R.inc(94534);i |= c << (18 - j * 6);
				}else
					{__CLR4_1_1020og20oglusqkqni.R.inc(94535);j--;
			}}
			// Add the bytes
			}__CLR4_1_1020og20oglusqkqni.R.inc(94536);dArr[d++] = (byte) (i >> 16);
			__CLR4_1_1020og20oglusqkqni.R.inc(94537);if ((((d < len)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94538)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94539)==0&false))) {{
				__CLR4_1_1020og20oglusqkqni.R.inc(94540);dArr[d++]= (byte) (i >> 8);
				__CLR4_1_1020og20oglusqkqni.R.inc(94541);if ((((d < len)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94542)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94543)==0&false)))
					{__CLR4_1_1020og20oglusqkqni.R.inc(94544);dArr[d++] = (byte) i;
			}}
		}}
		}__CLR4_1_1020og20oglusqkqni.R.inc(94545);return dArr;
	}finally{__CLR4_1_1020og20oglusqkqni.R.flushNeeded();}}

	/** Decodes a BASE64 encoded string that is known to be resonably well formatted. The method is about twice as
	 * fast as {@link #decode(String)}. The preconditions are:<br>
	 * + The array must have a line length of 76 chars OR no line separators at all (one line).<br>
	 * + Line separator must be "\r\n", as specified in RFC 2045
	 * + The array must not contain illegal characters within the encoded string<br>
	 * + The array CAN have illegal characters at the beginning and end, those will be dealt with appropriately.<br>
	 * @param s The source string. Length 0 will return an empty array. <code>null</code> will throw an exception.
	 * @return The decoded array of bytes. May be of length 0.
	 */
	public final static byte[] dedecodeFast(String s)
	{try{__CLR4_1_1020og20oglusqkqni.R.inc(94546);
		// Check special case
		__CLR4_1_1020og20oglusqkqni.R.inc(94547);int sLen = s.length();
		__CLR4_1_1020og20oglusqkqni.R.inc(94548);if ((((sLen == 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94549)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94550)==0&false)))
			{__CLR4_1_1020og20oglusqkqni.R.inc(94551);return new byte[0];

		}__CLR4_1_1020og20oglusqkqni.R.inc(94552);int sIx = 0, eIx = sLen - 1;    // Start and end index after trimming.

		// Trim illegal chars from start
		__CLR4_1_1020og20oglusqkqni.R.inc(94553);while ((((sIx < eIx && IA[s.charAt(sIx) & 0xff] < 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94554)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94555)==0&false)))
			{__CLR4_1_1020og20oglusqkqni.R.inc(94556);sIx++;

		// Trim illegal chars from end
		}__CLR4_1_1020og20oglusqkqni.R.inc(94557);while ((((eIx > 0 && IA[s.charAt(eIx) & 0xff] < 0)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94558)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94559)==0&false)))
			{__CLR4_1_1020og20oglusqkqni.R.inc(94560);eIx--;

		// get the padding count (=) (0, 1 or 2)
		}__CLR4_1_1020og20oglusqkqni.R.inc(94561);int pad = (((s.charAt(eIx) == '=' )&&(__CLR4_1_1020og20oglusqkqni.R.iget(94562)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94563)==0&false))? ((((s.charAt(eIx - 1) == '=' )&&(__CLR4_1_1020og20oglusqkqni.R.iget(94564)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94565)==0&false))? 2 : 1) : 0;  // Count '=' at end.
		__CLR4_1_1020og20oglusqkqni.R.inc(94566);int cCnt = eIx - sIx + 1;   // Content count including possible separators
		__CLR4_1_1020og20oglusqkqni.R.inc(94567);int sepCnt = (((sLen > 76 )&&(__CLR4_1_1020og20oglusqkqni.R.iget(94568)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94569)==0&false))? ((((s.charAt(76) == '\r' )&&(__CLR4_1_1020og20oglusqkqni.R.iget(94570)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94571)==0&false))? cCnt / 78 : 0) << 1 : 0;

		__CLR4_1_1020og20oglusqkqni.R.inc(94572);int len = ((cCnt - sepCnt) * 6 >> 3) - pad; // The number of decoded bytes
		__CLR4_1_1020og20oglusqkqni.R.inc(94573);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		// Decode all but the last 0 - 2 bytes.
		__CLR4_1_1020og20oglusqkqni.R.inc(94574);int d = 0;
		__CLR4_1_1020og20oglusqkqni.R.inc(94575);for (int cc = 0, eLen = (len / 3) * 3; (((d < eLen)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94576)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94577)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_1_1020og20oglusqkqni.R.inc(94578);int i = IA[s.charAt(sIx++)] << 18 | IA[s.charAt(sIx++)] << 12 | IA[s.charAt(sIx++)] << 6 | IA[s.charAt(sIx++)];

			// Add the bytes
			__CLR4_1_1020og20oglusqkqni.R.inc(94579);dArr[d++] = (byte) (i >> 16);
			__CLR4_1_1020og20oglusqkqni.R.inc(94580);dArr[d++] = (byte) (i >> 8);
			__CLR4_1_1020og20oglusqkqni.R.inc(94581);dArr[d++] = (byte) i;

			// If line separator, jump over it.
			__CLR4_1_1020og20oglusqkqni.R.inc(94582);if ((((sepCnt > 0 && ++cc == 19)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94583)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94584)==0&false))) {{
				__CLR4_1_1020og20oglusqkqni.R.inc(94585);sIx += 2;
				__CLR4_1_1020og20oglusqkqni.R.inc(94586);cc = 0;
			}
		}}

		}__CLR4_1_1020og20oglusqkqni.R.inc(94587);if ((((d < len)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94588)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94589)==0&false))) {{
			// Decode last 1-3 bytes (incl '=') into 1-3 bytes
			__CLR4_1_1020og20oglusqkqni.R.inc(94590);int i = 0;
			__CLR4_1_1020og20oglusqkqni.R.inc(94591);for (int j = 0; (((sIx <= eIx - pad)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94592)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94593)==0&false)); j++)
				{__CLR4_1_1020og20oglusqkqni.R.inc(94594);i |= IA[s.charAt(sIx++)] << (18 - j * 6);

			}__CLR4_1_1020og20oglusqkqni.R.inc(94595);for (int r = 16; (((d < len)&&(__CLR4_1_1020og20oglusqkqni.R.iget(94596)!=0|true))||(__CLR4_1_1020og20oglusqkqni.R.iget(94597)==0&false)); r -= 8)
				{__CLR4_1_1020og20oglusqkqni.R.inc(94598);dArr[d++] = (byte) (i >> r);
		}}

		}__CLR4_1_1020og20oglusqkqni.R.inc(94599);return dArr;
	}finally{__CLR4_1_1020og20oglusqkqni.R.flushNeeded();}}
}