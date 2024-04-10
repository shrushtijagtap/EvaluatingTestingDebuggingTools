/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test;

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
{public static class __CLR4_5_220o520o5lusyjwcx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,94589,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	private static final char[] CA = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
	private static final int[] IA = new int[256];
	static {try{__CLR4_5_220o520o5lusyjwcx.R.inc(94181);
		__CLR4_5_220o520o5lusyjwcx.R.inc(94182);Arrays.fill(IA, -1);
		__CLR4_5_220o520o5lusyjwcx.R.inc(94183);for (int i = 0, iS = CA.length; (((i < iS)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94184)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94185)==0&false)); i++)
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94186);IA[CA[i]] = i;
		}__CLR4_5_220o520o5lusyjwcx.R.inc(94187);IA['='] = 0;
	}finally{__CLR4_5_220o520o5lusyjwcx.R.flushNeeded();}}

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
	{try{__CLR4_5_220o520o5lusyjwcx.R.inc(94188);
		// Check special case
		__CLR4_5_220o520o5lusyjwcx.R.inc(94189);int bytes_len = (((bytes != null )&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94190)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94191)==0&false))? bytes.length : 0;
		__CLR4_5_220o520o5lusyjwcx.R.inc(94192);if ((((bytes_len == 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94193)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94194)==0&false)))
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94195);return new char[0];

		}__CLR4_5_220o520o5lusyjwcx.R.inc(94196);int eLen = (bytes_len / 3) * 3;              // Length of even 24-bits.
		__CLR4_5_220o520o5lusyjwcx.R.inc(94197);int cCnt = ((bytes_len - 1) / 3 + 1) << 2;   // Returned character count
		__CLR4_5_220o520o5lusyjwcx.R.inc(94198);int chars_len = cCnt + ((((lineSep )&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94199)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94200)==0&false))? (cCnt - 1) / 76 << 1 : 0); // Length of returned array
		__CLR4_5_220o520o5lusyjwcx.R.inc(94201);char[] chars = new char[chars_len];

		// Encode even 24-bits
		__CLR4_5_220o520o5lusyjwcx.R.inc(94202);for (int s = 0, d = 0, cc = 0; (((s < eLen)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94203)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94204)==0&false));) {{
			// Copy next three bytes into lower 24 bits of int, paying attension to sign.
			__CLR4_5_220o520o5lusyjwcx.R.inc(94205);int i = (bytes[s++] & 0xff) << 16 | (bytes[s++] & 0xff) << 8 | (bytes[s++] & 0xff);

			// Encode the int into four chars
			__CLR4_5_220o520o5lusyjwcx.R.inc(94206);chars[d++] = CA[(i >>> 18) & 0x3f];
			__CLR4_5_220o520o5lusyjwcx.R.inc(94207);chars[d++] = CA[(i >>> 12) & 0x3f];
			__CLR4_5_220o520o5lusyjwcx.R.inc(94208);chars[d++] = CA[(i >>> 6) & 0x3f];
			__CLR4_5_220o520o5lusyjwcx.R.inc(94209);chars[d++] = CA[i & 0x3f];

			// Add optional line separator
			__CLR4_5_220o520o5lusyjwcx.R.inc(94210);if ((((lineSep && ++cc == 19 && d < chars_len - 2)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94211)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94212)==0&false))) {{
				__CLR4_5_220o520o5lusyjwcx.R.inc(94213);chars[d++] = '\r';
				__CLR4_5_220o520o5lusyjwcx.R.inc(94214);chars[d++] = '\n';
				__CLR4_5_220o520o5lusyjwcx.R.inc(94215);cc = 0;
			}
		}}

		// Pad and encode last bits if source isn't even 24 bits.
		}__CLR4_5_220o520o5lusyjwcx.R.inc(94216);int left = bytes_len - eLen; // 0 - 2.
		__CLR4_5_220o520o5lusyjwcx.R.inc(94217);if ((((left > 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94218)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94219)==0&false))) {{
			// Prepare the int
			__CLR4_5_220o520o5lusyjwcx.R.inc(94220);int i = ((bytes[eLen] & 0xff) << 10) | ((((left == 2 )&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94221)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94222)==0&false))? ((bytes[bytes_len - 1] & 0xff) << 2) : 0);

			// Set last four chars
			__CLR4_5_220o520o5lusyjwcx.R.inc(94223);chars[chars_len - 4] = CA[i >> 12];
			__CLR4_5_220o520o5lusyjwcx.R.inc(94224);chars[chars_len - 3] = CA[(i >>> 6) & 0x3f];
			__CLR4_5_220o520o5lusyjwcx.R.inc(94225);chars[chars_len - 2] = (((left == 2 )&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94226)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94227)==0&false))? CA[i & 0x3f] : '=';
			__CLR4_5_220o520o5lusyjwcx.R.inc(94228);chars[chars_len - 1] = '=';
		}
		}__CLR4_5_220o520o5lusyjwcx.R.inc(94229);return chars;
	}finally{__CLR4_5_220o520o5lusyjwcx.R.flushNeeded();}}

	/** Decodes a BASE64 encoded char array. All illegal characters will be ignored and can handle both arrays with
	 * and without line separators.
	 * @param sArr The source array. <code>null</code> or length 0 will return an empty array.
	 * @return The decoded array of bytes. May be of length 0. Will be <code>null</code> if the legal characters
	 * (including '=') isn't divideable by 4.  (I.e. definitely corrupted).
	 */
	public final static byte[] decode(char[] sArr)
	{try{__CLR4_5_220o520o5lusyjwcx.R.inc(94230);
		// Check special case
		__CLR4_5_220o520o5lusyjwcx.R.inc(94231);int sLen = (((sArr != null )&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94232)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94233)==0&false))? sArr.length : 0;
		__CLR4_5_220o520o5lusyjwcx.R.inc(94234);if ((((sLen == 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94235)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94236)==0&false)))
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94237);return new byte[0];

		// Count illegal characters (including '\r', '\n') to know what size the returned array will be,
		// so we don't have to reallocate & copy it later.
		}__CLR4_5_220o520o5lusyjwcx.R.inc(94238);int sepCnt = 0; // Number of separator characters. (Actually illegal characters, but that's a bonus...)
		__CLR4_5_220o520o5lusyjwcx.R.inc(94239);for (int i = 0; (((i < sLen)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94240)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94241)==0&false)); i++)  // If input is "pure" (I.e. no line separators or illegal chars) base64 this loop can be commented out.
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94242);if ((((IA[sArr[i]] < 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94243)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94244)==0&false)))
				{__CLR4_5_220o520o5lusyjwcx.R.inc(94245);sepCnt++;

		// Check so that legal chars (including '=') are evenly divideable by 4 as specified in RFC 2045.
		}}__CLR4_5_220o520o5lusyjwcx.R.inc(94246);if (((((sLen - sepCnt) % 4 != 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94247)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94248)==0&false)))
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94249);return null;

		}__CLR4_5_220o520o5lusyjwcx.R.inc(94250);int pad = 0;
		__CLR4_5_220o520o5lusyjwcx.R.inc(94251);for (int i = sLen; (((i > 1 && IA[sArr[--i]] <= 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94252)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94253)==0&false));)
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94254);if ((((sArr[i] == '=')&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94255)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94256)==0&false)))
				{__CLR4_5_220o520o5lusyjwcx.R.inc(94257);pad++;

		}}__CLR4_5_220o520o5lusyjwcx.R.inc(94258);int len = ((sLen - sepCnt) * 6 >> 3) - pad;

		__CLR4_5_220o520o5lusyjwcx.R.inc(94259);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		__CLR4_5_220o520o5lusyjwcx.R.inc(94260);for (int s = 0, d = 0; (((d < len)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94261)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94262)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_5_220o520o5lusyjwcx.R.inc(94263);int i = 0;
			__CLR4_5_220o520o5lusyjwcx.R.inc(94264);for (int j = 0; (((j < 4)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94265)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94266)==0&false)); j++) {{   // j only increased if a valid char was found.
				__CLR4_5_220o520o5lusyjwcx.R.inc(94267);int c = IA[sArr[s++]];
				__CLR4_5_220o520o5lusyjwcx.R.inc(94268);if ((((c >= 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94269)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94270)==0&false)))
				    {__CLR4_5_220o520o5lusyjwcx.R.inc(94271);i |= c << (18 - j * 6);
				}else
					{__CLR4_5_220o520o5lusyjwcx.R.inc(94272);j--;
			}}
			// Add the bytes
			}__CLR4_5_220o520o5lusyjwcx.R.inc(94273);dArr[d++] = (byte) (i >> 16);
			__CLR4_5_220o520o5lusyjwcx.R.inc(94274);if ((((d < len)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94275)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94276)==0&false))) {{
				__CLR4_5_220o520o5lusyjwcx.R.inc(94277);dArr[d++]= (byte) (i >> 8);
				__CLR4_5_220o520o5lusyjwcx.R.inc(94278);if ((((d < len)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94279)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94280)==0&false)))
					{__CLR4_5_220o520o5lusyjwcx.R.inc(94281);dArr[d++] = (byte) i;
			}}
		}}
		}__CLR4_5_220o520o5lusyjwcx.R.inc(94282);return dArr;
	}finally{__CLR4_5_220o520o5lusyjwcx.R.flushNeeded();}}

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
	{try{__CLR4_5_220o520o5lusyjwcx.R.inc(94283);
		// Check special case
		__CLR4_5_220o520o5lusyjwcx.R.inc(94284);int sLen = sArr.length;
		__CLR4_5_220o520o5lusyjwcx.R.inc(94285);if ((((sLen == 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94286)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94287)==0&false)))
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94288);return new byte[0];

		}__CLR4_5_220o520o5lusyjwcx.R.inc(94289);int sIx = 0, eIx = sLen - 1;    // Start and end index after trimming.

		// Trim illegal chars from start
		__CLR4_5_220o520o5lusyjwcx.R.inc(94290);while ((((sIx < eIx && IA[sArr[sIx]] < 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94291)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94292)==0&false)))
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94293);sIx++;

		// Trim illegal chars from end
		}__CLR4_5_220o520o5lusyjwcx.R.inc(94294);while ((((eIx > 0 && IA[sArr[eIx]] < 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94295)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94296)==0&false)))
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94297);eIx--;

		// get the padding count (=) (0, 1 or 2)
		}__CLR4_5_220o520o5lusyjwcx.R.inc(94298);int pad = (((sArr[eIx] == '=' )&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94299)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94300)==0&false))? ((((sArr[eIx - 1] == '=' )&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94301)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94302)==0&false))? 2 : 1) : 0;  // Count '=' at end.
		__CLR4_5_220o520o5lusyjwcx.R.inc(94303);int cCnt = eIx - sIx + 1;   // Content count including possible separators
		__CLR4_5_220o520o5lusyjwcx.R.inc(94304);int sepCnt = (((sLen > 76 )&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94305)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94306)==0&false))? ((((sArr[76] == '\r' )&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94307)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94308)==0&false))? cCnt / 78 : 0) << 1 : 0;

		__CLR4_5_220o520o5lusyjwcx.R.inc(94309);int len = ((cCnt - sepCnt) * 6 >> 3) - pad; // The number of decoded bytes
		__CLR4_5_220o520o5lusyjwcx.R.inc(94310);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		// Decode all but the last 0 - 2 bytes.
		__CLR4_5_220o520o5lusyjwcx.R.inc(94311);int d = 0;
		__CLR4_5_220o520o5lusyjwcx.R.inc(94312);for (int cc = 0, eLen = (len / 3) * 3; (((d < eLen)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94313)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94314)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_5_220o520o5lusyjwcx.R.inc(94315);int i = IA[sArr[sIx++]] << 18 | IA[sArr[sIx++]] << 12 | IA[sArr[sIx++]] << 6 | IA[sArr[sIx++]];

			// Add the bytes
			__CLR4_5_220o520o5lusyjwcx.R.inc(94316);dArr[d++] = (byte) (i >> 16);
			__CLR4_5_220o520o5lusyjwcx.R.inc(94317);dArr[d++] = (byte) (i >> 8);
			__CLR4_5_220o520o5lusyjwcx.R.inc(94318);dArr[d++] = (byte) i;

			// If line separator, jump over it.
			__CLR4_5_220o520o5lusyjwcx.R.inc(94319);if ((((sepCnt > 0 && ++cc == 19)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94320)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94321)==0&false))) {{
				__CLR4_5_220o520o5lusyjwcx.R.inc(94322);sIx += 2;
				__CLR4_5_220o520o5lusyjwcx.R.inc(94323);cc = 0;
			}
		}}

		}__CLR4_5_220o520o5lusyjwcx.R.inc(94324);if ((((d < len)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94325)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94326)==0&false))) {{
			// Decode last 1-3 bytes (incl '=') into 1-3 bytes
			__CLR4_5_220o520o5lusyjwcx.R.inc(94327);int i = 0;
			__CLR4_5_220o520o5lusyjwcx.R.inc(94328);for (int j = 0; (((sIx <= eIx - pad)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94329)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94330)==0&false)); j++)
				{__CLR4_5_220o520o5lusyjwcx.R.inc(94331);i |= IA[sArr[sIx++]] << (18 - j * 6);

			}__CLR4_5_220o520o5lusyjwcx.R.inc(94332);for (int r = 16; (((d < len)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94333)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94334)==0&false)); r -= 8)
				{__CLR4_5_220o520o5lusyjwcx.R.inc(94335);dArr[d++] = (byte) (i >> r);
		}}

		}__CLR4_5_220o520o5lusyjwcx.R.inc(94336);return dArr;
	}finally{__CLR4_5_220o520o5lusyjwcx.R.flushNeeded();}}

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
	{try{__CLR4_5_220o520o5lusyjwcx.R.inc(94337);
		// Check special case
		__CLR4_5_220o520o5lusyjwcx.R.inc(94338);int sLen = (((sArr != null )&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94339)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94340)==0&false))? sArr.length : 0;
		__CLR4_5_220o520o5lusyjwcx.R.inc(94341);if ((((sLen == 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94342)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94343)==0&false)))
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94344);return new byte[0];

		}__CLR4_5_220o520o5lusyjwcx.R.inc(94345);int eLen = (sLen / 3) * 3;                              // Length of even 24-bits.
		__CLR4_5_220o520o5lusyjwcx.R.inc(94346);int cCnt = ((sLen - 1) / 3 + 1) << 2;                   // Returned character count
		__CLR4_5_220o520o5lusyjwcx.R.inc(94347);int dLen = cCnt + ((((lineSep )&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94348)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94349)==0&false))? (cCnt - 1) / 76 << 1 : 0); // Length of returned array
		__CLR4_5_220o520o5lusyjwcx.R.inc(94350);byte[] dArr = new byte[dLen];

		// Encode even 24-bits
		__CLR4_5_220o520o5lusyjwcx.R.inc(94351);for (int s = 0, d = 0, cc = 0; (((s < eLen)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94352)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94353)==0&false));) {{
			// Copy next three bytes into lower 24 bits of int, paying attension to sign.
			__CLR4_5_220o520o5lusyjwcx.R.inc(94354);int i = (sArr[s++] & 0xff) << 16 | (sArr[s++] & 0xff) << 8 | (sArr[s++] & 0xff);

			// Encode the int into four chars
			__CLR4_5_220o520o5lusyjwcx.R.inc(94355);dArr[d++] = (byte) CA[(i >>> 18) & 0x3f];
			__CLR4_5_220o520o5lusyjwcx.R.inc(94356);dArr[d++] = (byte) CA[(i >>> 12) & 0x3f];
			__CLR4_5_220o520o5lusyjwcx.R.inc(94357);dArr[d++] = (byte) CA[(i >>> 6) & 0x3f];
			__CLR4_5_220o520o5lusyjwcx.R.inc(94358);dArr[d++] = (byte) CA[i & 0x3f];

			// Add optional line separator
			__CLR4_5_220o520o5lusyjwcx.R.inc(94359);if ((((lineSep && ++cc == 19 && d < dLen - 2)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94360)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94361)==0&false))) {{
				__CLR4_5_220o520o5lusyjwcx.R.inc(94362);dArr[d++] = '\r';
				__CLR4_5_220o520o5lusyjwcx.R.inc(94363);dArr[d++] = '\n';
				__CLR4_5_220o520o5lusyjwcx.R.inc(94364);cc = 0;
			}
		}}

		// Pad and encode last bits if source isn't an even 24 bits.
		}__CLR4_5_220o520o5lusyjwcx.R.inc(94365);int left = sLen - eLen; // 0 - 2.
		__CLR4_5_220o520o5lusyjwcx.R.inc(94366);if ((((left > 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94367)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94368)==0&false))) {{
			// Prepare the int
			__CLR4_5_220o520o5lusyjwcx.R.inc(94369);int i = ((sArr[eLen] & 0xff) << 10) | ((((left == 2 )&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94370)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94371)==0&false))? ((sArr[sLen - 1] & 0xff) << 2) : 0);

			// Set last four chars
			__CLR4_5_220o520o5lusyjwcx.R.inc(94372);dArr[dLen - 4] = (byte) CA[i >> 12];
			__CLR4_5_220o520o5lusyjwcx.R.inc(94373);dArr[dLen - 3] = (byte) CA[(i >>> 6) & 0x3f];
			__CLR4_5_220o520o5lusyjwcx.R.inc(94374);dArr[dLen - 2] = (((left == 2 )&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94375)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94376)==0&false))? (byte) CA[i & 0x3f] : (byte) '=';
			__CLR4_5_220o520o5lusyjwcx.R.inc(94377);dArr[dLen - 1] = '=';
		}
		}__CLR4_5_220o520o5lusyjwcx.R.inc(94378);return dArr;
	}finally{__CLR4_5_220o520o5lusyjwcx.R.flushNeeded();}}

	/** Decodes a BASE64 encoded byte array. All illegal characters will be ignored and can handle both arrays with
	 * and without line separators.
	 * @param sArr The source array. Length 0 will return an empty array. <code>null</code> will throw an exception.
	 * @return The decoded array of bytes. May be of length 0. Will be <code>null</code> if the legal characters
	 * (including '=') isn't divideable by 4. (I.e. definitely corrupted).
	 */
	public final static byte[] decode(byte[] sArr)
	{try{__CLR4_5_220o520o5lusyjwcx.R.inc(94379);
		// Check special case
		__CLR4_5_220o520o5lusyjwcx.R.inc(94380);int sLen = sArr.length;

		// Count illegal characters (including '\r', '\n') to know what size the returned array will be,
		// so we don't have to reallocate & copy it later.
		__CLR4_5_220o520o5lusyjwcx.R.inc(94381);int sepCnt = 0; // Number of separator characters. (Actually illegal characters, but that's a bonus...)
		__CLR4_5_220o520o5lusyjwcx.R.inc(94382);for (int i = 0; (((i < sLen)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94383)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94384)==0&false)); i++)      // If input is "pure" (I.e. no line separators or illegal chars) base64 this loop can be commented out.
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94385);if ((((IA[sArr[i] & 0xff] < 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94386)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94387)==0&false)))
				{__CLR4_5_220o520o5lusyjwcx.R.inc(94388);sepCnt++;

		// Check so that legal chars (including '=') are evenly divideable by 4 as specified in RFC 2045.
		}}__CLR4_5_220o520o5lusyjwcx.R.inc(94389);if (((((sLen - sepCnt) % 4 != 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94390)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94391)==0&false)))
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94392);return null;

		}__CLR4_5_220o520o5lusyjwcx.R.inc(94393);int pad = 0;
		__CLR4_5_220o520o5lusyjwcx.R.inc(94394);for (int i = sLen; (((i > 1 && IA[sArr[--i] & 0xff] <= 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94395)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94396)==0&false));)
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94397);if ((((sArr[i] == '=')&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94398)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94399)==0&false)))
				{__CLR4_5_220o520o5lusyjwcx.R.inc(94400);pad++;

		}}__CLR4_5_220o520o5lusyjwcx.R.inc(94401);int len = ((sLen - sepCnt) * 6 >> 3) - pad;

		__CLR4_5_220o520o5lusyjwcx.R.inc(94402);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		__CLR4_5_220o520o5lusyjwcx.R.inc(94403);for (int s = 0, d = 0; (((d < len)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94404)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94405)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_5_220o520o5lusyjwcx.R.inc(94406);int i = 0;
			__CLR4_5_220o520o5lusyjwcx.R.inc(94407);for (int j = 0; (((j < 4)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94408)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94409)==0&false)); j++) {{   // j only increased if a valid char was found.
				__CLR4_5_220o520o5lusyjwcx.R.inc(94410);int c = IA[sArr[s++] & 0xff];
				__CLR4_5_220o520o5lusyjwcx.R.inc(94411);if ((((c >= 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94412)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94413)==0&false)))
				    {__CLR4_5_220o520o5lusyjwcx.R.inc(94414);i |= c << (18 - j * 6);
				}else
					{__CLR4_5_220o520o5lusyjwcx.R.inc(94415);j--;
			}}

			// Add the bytes
			}__CLR4_5_220o520o5lusyjwcx.R.inc(94416);dArr[d++] = (byte) (i >> 16);
			__CLR4_5_220o520o5lusyjwcx.R.inc(94417);if ((((d < len)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94418)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94419)==0&false))) {{
				__CLR4_5_220o520o5lusyjwcx.R.inc(94420);dArr[d++]= (byte) (i >> 8);
				__CLR4_5_220o520o5lusyjwcx.R.inc(94421);if ((((d < len)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94422)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94423)==0&false)))
					{__CLR4_5_220o520o5lusyjwcx.R.inc(94424);dArr[d++] = (byte) i;
			}}
		}}

		}__CLR4_5_220o520o5lusyjwcx.R.inc(94425);return dArr;
	}finally{__CLR4_5_220o520o5lusyjwcx.R.flushNeeded();}}


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
	{try{__CLR4_5_220o520o5lusyjwcx.R.inc(94426);
		// Check special case
		__CLR4_5_220o520o5lusyjwcx.R.inc(94427);int sLen = sArr.length;
		__CLR4_5_220o520o5lusyjwcx.R.inc(94428);if ((((sLen == 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94429)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94430)==0&false)))
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94431);return new byte[0];

		}__CLR4_5_220o520o5lusyjwcx.R.inc(94432);int sIx = 0, eIx = sLen - 1;    // Start and end index after trimming.

		// Trim illegal chars from start
		__CLR4_5_220o520o5lusyjwcx.R.inc(94433);while ((((sIx < eIx && IA[sArr[sIx] & 0xff] < 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94434)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94435)==0&false)))
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94436);sIx++;

		// Trim illegal chars from end
		}__CLR4_5_220o520o5lusyjwcx.R.inc(94437);while ((((eIx > 0 && IA[sArr[eIx] & 0xff] < 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94438)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94439)==0&false)))
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94440);eIx--;

		// get the padding count (=) (0, 1 or 2)
		}__CLR4_5_220o520o5lusyjwcx.R.inc(94441);int pad = (((sArr[eIx] == '=' )&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94442)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94443)==0&false))? ((((sArr[eIx - 1] == '=' )&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94444)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94445)==0&false))? 2 : 1) : 0;  // Count '=' at end.
		__CLR4_5_220o520o5lusyjwcx.R.inc(94446);int cCnt = eIx - sIx + 1;   // Content count including possible separators
		__CLR4_5_220o520o5lusyjwcx.R.inc(94447);int sepCnt = (((sLen > 76 )&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94448)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94449)==0&false))? ((((sArr[76] == '\r' )&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94450)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94451)==0&false))? cCnt / 78 : 0) << 1 : 0;

		__CLR4_5_220o520o5lusyjwcx.R.inc(94452);int len = ((cCnt - sepCnt) * 6 >> 3) - pad; // The number of decoded bytes
		__CLR4_5_220o520o5lusyjwcx.R.inc(94453);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		// Decode all but the last 0 - 2 bytes.
		__CLR4_5_220o520o5lusyjwcx.R.inc(94454);int d = 0;
		__CLR4_5_220o520o5lusyjwcx.R.inc(94455);for (int cc = 0, eLen = (len / 3) * 3; (((d < eLen)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94456)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94457)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_5_220o520o5lusyjwcx.R.inc(94458);int i = IA[sArr[sIx++]] << 18 | IA[sArr[sIx++]] << 12 | IA[sArr[sIx++]] << 6 | IA[sArr[sIx++]];

			// Add the bytes
			__CLR4_5_220o520o5lusyjwcx.R.inc(94459);dArr[d++] = (byte) (i >> 16);
			__CLR4_5_220o520o5lusyjwcx.R.inc(94460);dArr[d++] = (byte) (i >> 8);
			__CLR4_5_220o520o5lusyjwcx.R.inc(94461);dArr[d++] = (byte) i;

			// If line separator, jump over it.
			__CLR4_5_220o520o5lusyjwcx.R.inc(94462);if ((((sepCnt > 0 && ++cc == 19)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94463)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94464)==0&false))) {{
				__CLR4_5_220o520o5lusyjwcx.R.inc(94465);sIx += 2;
				__CLR4_5_220o520o5lusyjwcx.R.inc(94466);cc = 0;
			}
		}}

		}__CLR4_5_220o520o5lusyjwcx.R.inc(94467);if ((((d < len)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94468)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94469)==0&false))) {{
			// Decode last 1-3 bytes (incl '=') into 1-3 bytes
			__CLR4_5_220o520o5lusyjwcx.R.inc(94470);int i = 0;
			__CLR4_5_220o520o5lusyjwcx.R.inc(94471);for (int j = 0; (((sIx <= eIx - pad)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94472)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94473)==0&false)); j++)
				{__CLR4_5_220o520o5lusyjwcx.R.inc(94474);i |= IA[sArr[sIx++]] << (18 - j * 6);

			}__CLR4_5_220o520o5lusyjwcx.R.inc(94475);for (int r = 16; (((d < len)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94476)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94477)==0&false)); r -= 8)
				{__CLR4_5_220o520o5lusyjwcx.R.inc(94478);dArr[d++] = (byte) (i >> r);
		}}

		}__CLR4_5_220o520o5lusyjwcx.R.inc(94479);return dArr;
	}finally{__CLR4_5_220o520o5lusyjwcx.R.flushNeeded();}}

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
	{try{__CLR4_5_220o520o5lusyjwcx.R.inc(94480);
		// Reuse char[] since we can't create a String incrementally anyway and StringBuffer/Builder would be slower.
		__CLR4_5_220o520o5lusyjwcx.R.inc(94481);return new String(encodeToChar(sArr, lineSep));
	}finally{__CLR4_5_220o520o5lusyjwcx.R.flushNeeded();}}

	/** Decodes a BASE64 encoded <code>String</code>. All illegal characters will be ignored and can handle both strings with
	 * and without line separators.<br>
	 * <b>Note!</b> It can be up to about 2x the speed to call <code>decode(str.toCharArray())</code> instead. That
	 * will create a temporary array though. This version will use <code>str.charAt(i)</code> to iterate the string.
	 * @param str The source string. <code>null</code> or length 0 will return an empty array.
	 * @return The decoded array of bytes. May be of length 0. Will be <code>null</code> if the legal characters
	 * (including '=') isn't divideable by 4.  (I.e. definitely corrupted).
	 */
	public final static byte[] decode(String str)
	{try{__CLR4_5_220o520o5lusyjwcx.R.inc(94482);
		// Check special case
		__CLR4_5_220o520o5lusyjwcx.R.inc(94483);int sLen = (((str != null )&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94484)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94485)==0&false))? str.length() : 0;
		__CLR4_5_220o520o5lusyjwcx.R.inc(94486);if ((((sLen == 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94487)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94488)==0&false)))
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94489);return new byte[0];

		// Count illegal characters (including '\r', '\n') to know what size the returned array will be,
		// so we don't have to reallocate & copy it later.
		}__CLR4_5_220o520o5lusyjwcx.R.inc(94490);int sepCnt = 0; // Number of separator characters. (Actually illegal characters, but that's a bonus...)
		__CLR4_5_220o520o5lusyjwcx.R.inc(94491);for (int i = 0; (((i < sLen)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94492)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94493)==0&false)); i++)  // If input is "pure" (I.e. no line separators or illegal chars) base64 this loop can be commented out.
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94494);if ((((IA[str.charAt(i)] < 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94495)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94496)==0&false)))
				{__CLR4_5_220o520o5lusyjwcx.R.inc(94497);sepCnt++;

		// Check so that legal chars (including '=') are evenly divideable by 4 as specified in RFC 2045.
		}}__CLR4_5_220o520o5lusyjwcx.R.inc(94498);if (((((sLen - sepCnt) % 4 != 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94499)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94500)==0&false)))
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94501);return null;

		// Count '=' at end
		}__CLR4_5_220o520o5lusyjwcx.R.inc(94502);int pad = 0;
		__CLR4_5_220o520o5lusyjwcx.R.inc(94503);for (int i = sLen; (((i > 1 && IA[str.charAt(--i)] <= 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94504)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94505)==0&false));)
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94506);if ((((str.charAt(i) == '=')&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94507)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94508)==0&false)))
				{__CLR4_5_220o520o5lusyjwcx.R.inc(94509);pad++;

		}}__CLR4_5_220o520o5lusyjwcx.R.inc(94510);int len = ((sLen - sepCnt) * 6 >> 3) - pad;

		__CLR4_5_220o520o5lusyjwcx.R.inc(94511);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		__CLR4_5_220o520o5lusyjwcx.R.inc(94512);for (int s = 0, d = 0; (((d < len)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94513)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94514)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_5_220o520o5lusyjwcx.R.inc(94515);int i = 0;
			__CLR4_5_220o520o5lusyjwcx.R.inc(94516);for (int j = 0; (((j < 4)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94517)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94518)==0&false)); j++) {{   // j only increased if a valid char was found.
				__CLR4_5_220o520o5lusyjwcx.R.inc(94519);int c = IA[str.charAt(s++)];
				__CLR4_5_220o520o5lusyjwcx.R.inc(94520);if ((((c >= 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94521)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94522)==0&false)))
				    {__CLR4_5_220o520o5lusyjwcx.R.inc(94523);i |= c << (18 - j * 6);
				}else
					{__CLR4_5_220o520o5lusyjwcx.R.inc(94524);j--;
			}}
			// Add the bytes
			}__CLR4_5_220o520o5lusyjwcx.R.inc(94525);dArr[d++] = (byte) (i >> 16);
			__CLR4_5_220o520o5lusyjwcx.R.inc(94526);if ((((d < len)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94527)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94528)==0&false))) {{
				__CLR4_5_220o520o5lusyjwcx.R.inc(94529);dArr[d++]= (byte) (i >> 8);
				__CLR4_5_220o520o5lusyjwcx.R.inc(94530);if ((((d < len)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94531)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94532)==0&false)))
					{__CLR4_5_220o520o5lusyjwcx.R.inc(94533);dArr[d++] = (byte) i;
			}}
		}}
		}__CLR4_5_220o520o5lusyjwcx.R.inc(94534);return dArr;
	}finally{__CLR4_5_220o520o5lusyjwcx.R.flushNeeded();}}

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
	{try{__CLR4_5_220o520o5lusyjwcx.R.inc(94535);
		// Check special case
		__CLR4_5_220o520o5lusyjwcx.R.inc(94536);int sLen = s.length();
		__CLR4_5_220o520o5lusyjwcx.R.inc(94537);if ((((sLen == 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94538)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94539)==0&false)))
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94540);return new byte[0];

		}__CLR4_5_220o520o5lusyjwcx.R.inc(94541);int sIx = 0, eIx = sLen - 1;    // Start and end index after trimming.

		// Trim illegal chars from start
		__CLR4_5_220o520o5lusyjwcx.R.inc(94542);while ((((sIx < eIx && IA[s.charAt(sIx) & 0xff] < 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94543)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94544)==0&false)))
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94545);sIx++;

		// Trim illegal chars from end
		}__CLR4_5_220o520o5lusyjwcx.R.inc(94546);while ((((eIx > 0 && IA[s.charAt(eIx) & 0xff] < 0)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94547)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94548)==0&false)))
			{__CLR4_5_220o520o5lusyjwcx.R.inc(94549);eIx--;

		// get the padding count (=) (0, 1 or 2)
		}__CLR4_5_220o520o5lusyjwcx.R.inc(94550);int pad = (((s.charAt(eIx) == '=' )&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94551)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94552)==0&false))? ((((s.charAt(eIx - 1) == '=' )&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94553)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94554)==0&false))? 2 : 1) : 0;  // Count '=' at end.
		__CLR4_5_220o520o5lusyjwcx.R.inc(94555);int cCnt = eIx - sIx + 1;   // Content count including possible separators
		__CLR4_5_220o520o5lusyjwcx.R.inc(94556);int sepCnt = (((sLen > 76 )&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94557)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94558)==0&false))? ((((s.charAt(76) == '\r' )&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94559)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94560)==0&false))? cCnt / 78 : 0) << 1 : 0;

		__CLR4_5_220o520o5lusyjwcx.R.inc(94561);int len = ((cCnt - sepCnt) * 6 >> 3) - pad; // The number of decoded bytes
		__CLR4_5_220o520o5lusyjwcx.R.inc(94562);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		// Decode all but the last 0 - 2 bytes.
		__CLR4_5_220o520o5lusyjwcx.R.inc(94563);int d = 0;
		__CLR4_5_220o520o5lusyjwcx.R.inc(94564);for (int cc = 0, eLen = (len / 3) * 3; (((d < eLen)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94565)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94566)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_5_220o520o5lusyjwcx.R.inc(94567);int i = IA[s.charAt(sIx++)] << 18 | IA[s.charAt(sIx++)] << 12 | IA[s.charAt(sIx++)] << 6 | IA[s.charAt(sIx++)];

			// Add the bytes
			__CLR4_5_220o520o5lusyjwcx.R.inc(94568);dArr[d++] = (byte) (i >> 16);
			__CLR4_5_220o520o5lusyjwcx.R.inc(94569);dArr[d++] = (byte) (i >> 8);
			__CLR4_5_220o520o5lusyjwcx.R.inc(94570);dArr[d++] = (byte) i;

			// If line separator, jump over it.
			__CLR4_5_220o520o5lusyjwcx.R.inc(94571);if ((((sepCnt > 0 && ++cc == 19)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94572)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94573)==0&false))) {{
				__CLR4_5_220o520o5lusyjwcx.R.inc(94574);sIx += 2;
				__CLR4_5_220o520o5lusyjwcx.R.inc(94575);cc = 0;
			}
		}}

		}__CLR4_5_220o520o5lusyjwcx.R.inc(94576);if ((((d < len)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94577)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94578)==0&false))) {{
			// Decode last 1-3 bytes (incl '=') into 1-3 bytes
			__CLR4_5_220o520o5lusyjwcx.R.inc(94579);int i = 0;
			__CLR4_5_220o520o5lusyjwcx.R.inc(94580);for (int j = 0; (((sIx <= eIx - pad)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94581)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94582)==0&false)); j++)
				{__CLR4_5_220o520o5lusyjwcx.R.inc(94583);i |= IA[s.charAt(sIx++)] << (18 - j * 6);

			}__CLR4_5_220o520o5lusyjwcx.R.inc(94584);for (int r = 16; (((d < len)&&(__CLR4_5_220o520o5lusyjwcx.R.iget(94585)!=0|true))||(__CLR4_5_220o520o5lusyjwcx.R.iget(94586)==0&false)); r -= 8)
				{__CLR4_5_220o520o5lusyjwcx.R.inc(94587);dArr[d++] = (byte) (i >> r);
		}}

		}__CLR4_5_220o520o5lusyjwcx.R.inc(94588);return dArr;
	}finally{__CLR4_5_220o520o5lusyjwcx.R.flushNeeded();}}
}