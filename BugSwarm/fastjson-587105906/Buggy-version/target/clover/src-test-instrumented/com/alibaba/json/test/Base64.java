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
{public static class __CLR4_1_1021mo21moluszwhlu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,95832,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	private static final char[] CA = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
	private static final int[] IA = new int[256];
	static {try{__CLR4_1_1021mo21moluszwhlu.R.inc(95424);
		__CLR4_1_1021mo21moluszwhlu.R.inc(95425);Arrays.fill(IA, -1);
		__CLR4_1_1021mo21moluszwhlu.R.inc(95426);for (int i = 0, iS = CA.length; (((i < iS)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95427)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95428)==0&false)); i++)
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95429);IA[CA[i]] = i;
		}__CLR4_1_1021mo21moluszwhlu.R.inc(95430);IA['='] = 0;
	}finally{__CLR4_1_1021mo21moluszwhlu.R.flushNeeded();}}

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
	{try{__CLR4_1_1021mo21moluszwhlu.R.inc(95431);
		// Check special case
		__CLR4_1_1021mo21moluszwhlu.R.inc(95432);int bytes_len = (((bytes != null )&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95433)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95434)==0&false))? bytes.length : 0;
		__CLR4_1_1021mo21moluszwhlu.R.inc(95435);if ((((bytes_len == 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95436)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95437)==0&false)))
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95438);return new char[0];

		}__CLR4_1_1021mo21moluszwhlu.R.inc(95439);int eLen = (bytes_len / 3) * 3;              // Length of even 24-bits.
		__CLR4_1_1021mo21moluszwhlu.R.inc(95440);int cCnt = ((bytes_len - 1) / 3 + 1) << 2;   // Returned character count
		__CLR4_1_1021mo21moluszwhlu.R.inc(95441);int chars_len = cCnt + ((((lineSep )&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95442)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95443)==0&false))? (cCnt - 1) / 76 << 1 : 0); // Length of returned array
		__CLR4_1_1021mo21moluszwhlu.R.inc(95444);char[] chars = new char[chars_len];

		// Encode even 24-bits
		__CLR4_1_1021mo21moluszwhlu.R.inc(95445);for (int s = 0, d = 0, cc = 0; (((s < eLen)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95446)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95447)==0&false));) {{
			// Copy next three bytes into lower 24 bits of int, paying attension to sign.
			__CLR4_1_1021mo21moluszwhlu.R.inc(95448);int i = (bytes[s++] & 0xff) << 16 | (bytes[s++] & 0xff) << 8 | (bytes[s++] & 0xff);

			// Encode the int into four chars
			__CLR4_1_1021mo21moluszwhlu.R.inc(95449);chars[d++] = CA[(i >>> 18) & 0x3f];
			__CLR4_1_1021mo21moluszwhlu.R.inc(95450);chars[d++] = CA[(i >>> 12) & 0x3f];
			__CLR4_1_1021mo21moluszwhlu.R.inc(95451);chars[d++] = CA[(i >>> 6) & 0x3f];
			__CLR4_1_1021mo21moluszwhlu.R.inc(95452);chars[d++] = CA[i & 0x3f];

			// Add optional line separator
			__CLR4_1_1021mo21moluszwhlu.R.inc(95453);if ((((lineSep && ++cc == 19 && d < chars_len - 2)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95454)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95455)==0&false))) {{
				__CLR4_1_1021mo21moluszwhlu.R.inc(95456);chars[d++] = '\r';
				__CLR4_1_1021mo21moluszwhlu.R.inc(95457);chars[d++] = '\n';
				__CLR4_1_1021mo21moluszwhlu.R.inc(95458);cc = 0;
			}
		}}

		// Pad and encode last bits if source isn't even 24 bits.
		}__CLR4_1_1021mo21moluszwhlu.R.inc(95459);int left = bytes_len - eLen; // 0 - 2.
		__CLR4_1_1021mo21moluszwhlu.R.inc(95460);if ((((left > 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95461)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95462)==0&false))) {{
			// Prepare the int
			__CLR4_1_1021mo21moluszwhlu.R.inc(95463);int i = ((bytes[eLen] & 0xff) << 10) | ((((left == 2 )&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95464)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95465)==0&false))? ((bytes[bytes_len - 1] & 0xff) << 2) : 0);

			// Set last four chars
			__CLR4_1_1021mo21moluszwhlu.R.inc(95466);chars[chars_len - 4] = CA[i >> 12];
			__CLR4_1_1021mo21moluszwhlu.R.inc(95467);chars[chars_len - 3] = CA[(i >>> 6) & 0x3f];
			__CLR4_1_1021mo21moluszwhlu.R.inc(95468);chars[chars_len - 2] = (((left == 2 )&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95469)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95470)==0&false))? CA[i & 0x3f] : '=';
			__CLR4_1_1021mo21moluszwhlu.R.inc(95471);chars[chars_len - 1] = '=';
		}
		}__CLR4_1_1021mo21moluszwhlu.R.inc(95472);return chars;
	}finally{__CLR4_1_1021mo21moluszwhlu.R.flushNeeded();}}

	/** Decodes a BASE64 encoded char array. All illegal characters will be ignored and can handle both arrays with
	 * and without line separators.
	 * @param sArr The source array. <code>null</code> or length 0 will return an empty array.
	 * @return The decoded array of bytes. May be of length 0. Will be <code>null</code> if the legal characters
	 * (including '=') isn't divideable by 4.  (I.e. definitely corrupted).
	 */
	public final static byte[] decode(char[] sArr)
	{try{__CLR4_1_1021mo21moluszwhlu.R.inc(95473);
		// Check special case
		__CLR4_1_1021mo21moluszwhlu.R.inc(95474);int sLen = (((sArr != null )&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95475)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95476)==0&false))? sArr.length : 0;
		__CLR4_1_1021mo21moluszwhlu.R.inc(95477);if ((((sLen == 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95478)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95479)==0&false)))
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95480);return new byte[0];

		// Count illegal characters (including '\r', '\n') to know what size the returned array will be,
		// so we don't have to reallocate & copy it later.
		}__CLR4_1_1021mo21moluszwhlu.R.inc(95481);int sepCnt = 0; // Number of separator characters. (Actually illegal characters, but that's a bonus...)
		__CLR4_1_1021mo21moluszwhlu.R.inc(95482);for (int i = 0; (((i < sLen)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95483)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95484)==0&false)); i++)  // If input is "pure" (I.e. no line separators or illegal chars) base64 this loop can be commented out.
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95485);if ((((IA[sArr[i]] < 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95486)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95487)==0&false)))
				{__CLR4_1_1021mo21moluszwhlu.R.inc(95488);sepCnt++;

		// Check so that legal chars (including '=') are evenly divideable by 4 as specified in RFC 2045.
		}}__CLR4_1_1021mo21moluszwhlu.R.inc(95489);if (((((sLen - sepCnt) % 4 != 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95490)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95491)==0&false)))
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95492);return null;

		}__CLR4_1_1021mo21moluszwhlu.R.inc(95493);int pad = 0;
		__CLR4_1_1021mo21moluszwhlu.R.inc(95494);for (int i = sLen; (((i > 1 && IA[sArr[--i]] <= 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95495)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95496)==0&false));)
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95497);if ((((sArr[i] == '=')&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95498)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95499)==0&false)))
				{__CLR4_1_1021mo21moluszwhlu.R.inc(95500);pad++;

		}}__CLR4_1_1021mo21moluszwhlu.R.inc(95501);int len = ((sLen - sepCnt) * 6 >> 3) - pad;

		__CLR4_1_1021mo21moluszwhlu.R.inc(95502);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		__CLR4_1_1021mo21moluszwhlu.R.inc(95503);for (int s = 0, d = 0; (((d < len)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95504)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95505)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_1_1021mo21moluszwhlu.R.inc(95506);int i = 0;
			__CLR4_1_1021mo21moluszwhlu.R.inc(95507);for (int j = 0; (((j < 4)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95508)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95509)==0&false)); j++) {{   // j only increased if a valid char was found.
				__CLR4_1_1021mo21moluszwhlu.R.inc(95510);int c = IA[sArr[s++]];
				__CLR4_1_1021mo21moluszwhlu.R.inc(95511);if ((((c >= 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95512)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95513)==0&false)))
				    {__CLR4_1_1021mo21moluszwhlu.R.inc(95514);i |= c << (18 - j * 6);
				}else
					{__CLR4_1_1021mo21moluszwhlu.R.inc(95515);j--;
			}}
			// Add the bytes
			}__CLR4_1_1021mo21moluszwhlu.R.inc(95516);dArr[d++] = (byte) (i >> 16);
			__CLR4_1_1021mo21moluszwhlu.R.inc(95517);if ((((d < len)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95518)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95519)==0&false))) {{
				__CLR4_1_1021mo21moluszwhlu.R.inc(95520);dArr[d++]= (byte) (i >> 8);
				__CLR4_1_1021mo21moluszwhlu.R.inc(95521);if ((((d < len)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95522)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95523)==0&false)))
					{__CLR4_1_1021mo21moluszwhlu.R.inc(95524);dArr[d++] = (byte) i;
			}}
		}}
		}__CLR4_1_1021mo21moluszwhlu.R.inc(95525);return dArr;
	}finally{__CLR4_1_1021mo21moluszwhlu.R.flushNeeded();}}

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
	{try{__CLR4_1_1021mo21moluszwhlu.R.inc(95526);
		// Check special case
		__CLR4_1_1021mo21moluszwhlu.R.inc(95527);int sLen = sArr.length;
		__CLR4_1_1021mo21moluszwhlu.R.inc(95528);if ((((sLen == 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95529)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95530)==0&false)))
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95531);return new byte[0];

		}__CLR4_1_1021mo21moluszwhlu.R.inc(95532);int sIx = 0, eIx = sLen - 1;    // Start and end index after trimming.

		// Trim illegal chars from start
		__CLR4_1_1021mo21moluszwhlu.R.inc(95533);while ((((sIx < eIx && IA[sArr[sIx]] < 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95534)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95535)==0&false)))
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95536);sIx++;

		// Trim illegal chars from end
		}__CLR4_1_1021mo21moluszwhlu.R.inc(95537);while ((((eIx > 0 && IA[sArr[eIx]] < 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95538)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95539)==0&false)))
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95540);eIx--;

		// get the padding count (=) (0, 1 or 2)
		}__CLR4_1_1021mo21moluszwhlu.R.inc(95541);int pad = (((sArr[eIx] == '=' )&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95542)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95543)==0&false))? ((((sArr[eIx - 1] == '=' )&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95544)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95545)==0&false))? 2 : 1) : 0;  // Count '=' at end.
		__CLR4_1_1021mo21moluszwhlu.R.inc(95546);int cCnt = eIx - sIx + 1;   // Content count including possible separators
		__CLR4_1_1021mo21moluszwhlu.R.inc(95547);int sepCnt = (((sLen > 76 )&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95548)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95549)==0&false))? ((((sArr[76] == '\r' )&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95550)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95551)==0&false))? cCnt / 78 : 0) << 1 : 0;

		__CLR4_1_1021mo21moluszwhlu.R.inc(95552);int len = ((cCnt - sepCnt) * 6 >> 3) - pad; // The number of decoded bytes
		__CLR4_1_1021mo21moluszwhlu.R.inc(95553);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		// Decode all but the last 0 - 2 bytes.
		__CLR4_1_1021mo21moluszwhlu.R.inc(95554);int d = 0;
		__CLR4_1_1021mo21moluszwhlu.R.inc(95555);for (int cc = 0, eLen = (len / 3) * 3; (((d < eLen)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95556)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95557)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_1_1021mo21moluszwhlu.R.inc(95558);int i = IA[sArr[sIx++]] << 18 | IA[sArr[sIx++]] << 12 | IA[sArr[sIx++]] << 6 | IA[sArr[sIx++]];

			// Add the bytes
			__CLR4_1_1021mo21moluszwhlu.R.inc(95559);dArr[d++] = (byte) (i >> 16);
			__CLR4_1_1021mo21moluszwhlu.R.inc(95560);dArr[d++] = (byte) (i >> 8);
			__CLR4_1_1021mo21moluszwhlu.R.inc(95561);dArr[d++] = (byte) i;

			// If line separator, jump over it.
			__CLR4_1_1021mo21moluszwhlu.R.inc(95562);if ((((sepCnt > 0 && ++cc == 19)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95563)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95564)==0&false))) {{
				__CLR4_1_1021mo21moluszwhlu.R.inc(95565);sIx += 2;
				__CLR4_1_1021mo21moluszwhlu.R.inc(95566);cc = 0;
			}
		}}

		}__CLR4_1_1021mo21moluszwhlu.R.inc(95567);if ((((d < len)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95568)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95569)==0&false))) {{
			// Decode last 1-3 bytes (incl '=') into 1-3 bytes
			__CLR4_1_1021mo21moluszwhlu.R.inc(95570);int i = 0;
			__CLR4_1_1021mo21moluszwhlu.R.inc(95571);for (int j = 0; (((sIx <= eIx - pad)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95572)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95573)==0&false)); j++)
				{__CLR4_1_1021mo21moluszwhlu.R.inc(95574);i |= IA[sArr[sIx++]] << (18 - j * 6);

			}__CLR4_1_1021mo21moluszwhlu.R.inc(95575);for (int r = 16; (((d < len)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95576)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95577)==0&false)); r -= 8)
				{__CLR4_1_1021mo21moluszwhlu.R.inc(95578);dArr[d++] = (byte) (i >> r);
		}}

		}__CLR4_1_1021mo21moluszwhlu.R.inc(95579);return dArr;
	}finally{__CLR4_1_1021mo21moluszwhlu.R.flushNeeded();}}

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
	{try{__CLR4_1_1021mo21moluszwhlu.R.inc(95580);
		// Check special case
		__CLR4_1_1021mo21moluszwhlu.R.inc(95581);int sLen = (((sArr != null )&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95582)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95583)==0&false))? sArr.length : 0;
		__CLR4_1_1021mo21moluszwhlu.R.inc(95584);if ((((sLen == 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95585)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95586)==0&false)))
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95587);return new byte[0];

		}__CLR4_1_1021mo21moluszwhlu.R.inc(95588);int eLen = (sLen / 3) * 3;                              // Length of even 24-bits.
		__CLR4_1_1021mo21moluszwhlu.R.inc(95589);int cCnt = ((sLen - 1) / 3 + 1) << 2;                   // Returned character count
		__CLR4_1_1021mo21moluszwhlu.R.inc(95590);int dLen = cCnt + ((((lineSep )&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95591)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95592)==0&false))? (cCnt - 1) / 76 << 1 : 0); // Length of returned array
		__CLR4_1_1021mo21moluszwhlu.R.inc(95593);byte[] dArr = new byte[dLen];

		// Encode even 24-bits
		__CLR4_1_1021mo21moluszwhlu.R.inc(95594);for (int s = 0, d = 0, cc = 0; (((s < eLen)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95595)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95596)==0&false));) {{
			// Copy next three bytes into lower 24 bits of int, paying attension to sign.
			__CLR4_1_1021mo21moluszwhlu.R.inc(95597);int i = (sArr[s++] & 0xff) << 16 | (sArr[s++] & 0xff) << 8 | (sArr[s++] & 0xff);

			// Encode the int into four chars
			__CLR4_1_1021mo21moluszwhlu.R.inc(95598);dArr[d++] = (byte) CA[(i >>> 18) & 0x3f];
			__CLR4_1_1021mo21moluszwhlu.R.inc(95599);dArr[d++] = (byte) CA[(i >>> 12) & 0x3f];
			__CLR4_1_1021mo21moluszwhlu.R.inc(95600);dArr[d++] = (byte) CA[(i >>> 6) & 0x3f];
			__CLR4_1_1021mo21moluszwhlu.R.inc(95601);dArr[d++] = (byte) CA[i & 0x3f];

			// Add optional line separator
			__CLR4_1_1021mo21moluszwhlu.R.inc(95602);if ((((lineSep && ++cc == 19 && d < dLen - 2)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95603)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95604)==0&false))) {{
				__CLR4_1_1021mo21moluszwhlu.R.inc(95605);dArr[d++] = '\r';
				__CLR4_1_1021mo21moluszwhlu.R.inc(95606);dArr[d++] = '\n';
				__CLR4_1_1021mo21moluszwhlu.R.inc(95607);cc = 0;
			}
		}}

		// Pad and encode last bits if source isn't an even 24 bits.
		}__CLR4_1_1021mo21moluszwhlu.R.inc(95608);int left = sLen - eLen; // 0 - 2.
		__CLR4_1_1021mo21moluszwhlu.R.inc(95609);if ((((left > 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95610)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95611)==0&false))) {{
			// Prepare the int
			__CLR4_1_1021mo21moluszwhlu.R.inc(95612);int i = ((sArr[eLen] & 0xff) << 10) | ((((left == 2 )&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95613)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95614)==0&false))? ((sArr[sLen - 1] & 0xff) << 2) : 0);

			// Set last four chars
			__CLR4_1_1021mo21moluszwhlu.R.inc(95615);dArr[dLen - 4] = (byte) CA[i >> 12];
			__CLR4_1_1021mo21moluszwhlu.R.inc(95616);dArr[dLen - 3] = (byte) CA[(i >>> 6) & 0x3f];
			__CLR4_1_1021mo21moluszwhlu.R.inc(95617);dArr[dLen - 2] = (((left == 2 )&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95618)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95619)==0&false))? (byte) CA[i & 0x3f] : (byte) '=';
			__CLR4_1_1021mo21moluszwhlu.R.inc(95620);dArr[dLen - 1] = '=';
		}
		}__CLR4_1_1021mo21moluszwhlu.R.inc(95621);return dArr;
	}finally{__CLR4_1_1021mo21moluszwhlu.R.flushNeeded();}}

	/** Decodes a BASE64 encoded byte array. All illegal characters will be ignored and can handle both arrays with
	 * and without line separators.
	 * @param sArr The source array. Length 0 will return an empty array. <code>null</code> will throw an exception.
	 * @return The decoded array of bytes. May be of length 0. Will be <code>null</code> if the legal characters
	 * (including '=') isn't divideable by 4. (I.e. definitely corrupted).
	 */
	public final static byte[] decode(byte[] sArr)
	{try{__CLR4_1_1021mo21moluszwhlu.R.inc(95622);
		// Check special case
		__CLR4_1_1021mo21moluszwhlu.R.inc(95623);int sLen = sArr.length;

		// Count illegal characters (including '\r', '\n') to know what size the returned array will be,
		// so we don't have to reallocate & copy it later.
		__CLR4_1_1021mo21moluszwhlu.R.inc(95624);int sepCnt = 0; // Number of separator characters. (Actually illegal characters, but that's a bonus...)
		__CLR4_1_1021mo21moluszwhlu.R.inc(95625);for (int i = 0; (((i < sLen)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95626)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95627)==0&false)); i++)      // If input is "pure" (I.e. no line separators or illegal chars) base64 this loop can be commented out.
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95628);if ((((IA[sArr[i] & 0xff] < 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95629)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95630)==0&false)))
				{__CLR4_1_1021mo21moluszwhlu.R.inc(95631);sepCnt++;

		// Check so that legal chars (including '=') are evenly divideable by 4 as specified in RFC 2045.
		}}__CLR4_1_1021mo21moluszwhlu.R.inc(95632);if (((((sLen - sepCnt) % 4 != 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95633)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95634)==0&false)))
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95635);return null;

		}__CLR4_1_1021mo21moluszwhlu.R.inc(95636);int pad = 0;
		__CLR4_1_1021mo21moluszwhlu.R.inc(95637);for (int i = sLen; (((i > 1 && IA[sArr[--i] & 0xff] <= 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95638)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95639)==0&false));)
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95640);if ((((sArr[i] == '=')&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95641)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95642)==0&false)))
				{__CLR4_1_1021mo21moluszwhlu.R.inc(95643);pad++;

		}}__CLR4_1_1021mo21moluszwhlu.R.inc(95644);int len = ((sLen - sepCnt) * 6 >> 3) - pad;

		__CLR4_1_1021mo21moluszwhlu.R.inc(95645);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		__CLR4_1_1021mo21moluszwhlu.R.inc(95646);for (int s = 0, d = 0; (((d < len)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95647)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95648)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_1_1021mo21moluszwhlu.R.inc(95649);int i = 0;
			__CLR4_1_1021mo21moluszwhlu.R.inc(95650);for (int j = 0; (((j < 4)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95651)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95652)==0&false)); j++) {{   // j only increased if a valid char was found.
				__CLR4_1_1021mo21moluszwhlu.R.inc(95653);int c = IA[sArr[s++] & 0xff];
				__CLR4_1_1021mo21moluszwhlu.R.inc(95654);if ((((c >= 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95655)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95656)==0&false)))
				    {__CLR4_1_1021mo21moluszwhlu.R.inc(95657);i |= c << (18 - j * 6);
				}else
					{__CLR4_1_1021mo21moluszwhlu.R.inc(95658);j--;
			}}

			// Add the bytes
			}__CLR4_1_1021mo21moluszwhlu.R.inc(95659);dArr[d++] = (byte) (i >> 16);
			__CLR4_1_1021mo21moluszwhlu.R.inc(95660);if ((((d < len)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95661)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95662)==0&false))) {{
				__CLR4_1_1021mo21moluszwhlu.R.inc(95663);dArr[d++]= (byte) (i >> 8);
				__CLR4_1_1021mo21moluszwhlu.R.inc(95664);if ((((d < len)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95665)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95666)==0&false)))
					{__CLR4_1_1021mo21moluszwhlu.R.inc(95667);dArr[d++] = (byte) i;
			}}
		}}

		}__CLR4_1_1021mo21moluszwhlu.R.inc(95668);return dArr;
	}finally{__CLR4_1_1021mo21moluszwhlu.R.flushNeeded();}}


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
	{try{__CLR4_1_1021mo21moluszwhlu.R.inc(95669);
		// Check special case
		__CLR4_1_1021mo21moluszwhlu.R.inc(95670);int sLen = sArr.length;
		__CLR4_1_1021mo21moluszwhlu.R.inc(95671);if ((((sLen == 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95672)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95673)==0&false)))
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95674);return new byte[0];

		}__CLR4_1_1021mo21moluszwhlu.R.inc(95675);int sIx = 0, eIx = sLen - 1;    // Start and end index after trimming.

		// Trim illegal chars from start
		__CLR4_1_1021mo21moluszwhlu.R.inc(95676);while ((((sIx < eIx && IA[sArr[sIx] & 0xff] < 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95677)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95678)==0&false)))
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95679);sIx++;

		// Trim illegal chars from end
		}__CLR4_1_1021mo21moluszwhlu.R.inc(95680);while ((((eIx > 0 && IA[sArr[eIx] & 0xff] < 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95681)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95682)==0&false)))
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95683);eIx--;

		// get the padding count (=) (0, 1 or 2)
		}__CLR4_1_1021mo21moluszwhlu.R.inc(95684);int pad = (((sArr[eIx] == '=' )&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95685)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95686)==0&false))? ((((sArr[eIx - 1] == '=' )&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95687)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95688)==0&false))? 2 : 1) : 0;  // Count '=' at end.
		__CLR4_1_1021mo21moluszwhlu.R.inc(95689);int cCnt = eIx - sIx + 1;   // Content count including possible separators
		__CLR4_1_1021mo21moluszwhlu.R.inc(95690);int sepCnt = (((sLen > 76 )&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95691)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95692)==0&false))? ((((sArr[76] == '\r' )&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95693)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95694)==0&false))? cCnt / 78 : 0) << 1 : 0;

		__CLR4_1_1021mo21moluszwhlu.R.inc(95695);int len = ((cCnt - sepCnt) * 6 >> 3) - pad; // The number of decoded bytes
		__CLR4_1_1021mo21moluszwhlu.R.inc(95696);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		// Decode all but the last 0 - 2 bytes.
		__CLR4_1_1021mo21moluszwhlu.R.inc(95697);int d = 0;
		__CLR4_1_1021mo21moluszwhlu.R.inc(95698);for (int cc = 0, eLen = (len / 3) * 3; (((d < eLen)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95699)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95700)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_1_1021mo21moluszwhlu.R.inc(95701);int i = IA[sArr[sIx++]] << 18 | IA[sArr[sIx++]] << 12 | IA[sArr[sIx++]] << 6 | IA[sArr[sIx++]];

			// Add the bytes
			__CLR4_1_1021mo21moluszwhlu.R.inc(95702);dArr[d++] = (byte) (i >> 16);
			__CLR4_1_1021mo21moluszwhlu.R.inc(95703);dArr[d++] = (byte) (i >> 8);
			__CLR4_1_1021mo21moluszwhlu.R.inc(95704);dArr[d++] = (byte) i;

			// If line separator, jump over it.
			__CLR4_1_1021mo21moluszwhlu.R.inc(95705);if ((((sepCnt > 0 && ++cc == 19)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95706)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95707)==0&false))) {{
				__CLR4_1_1021mo21moluszwhlu.R.inc(95708);sIx += 2;
				__CLR4_1_1021mo21moluszwhlu.R.inc(95709);cc = 0;
			}
		}}

		}__CLR4_1_1021mo21moluszwhlu.R.inc(95710);if ((((d < len)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95711)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95712)==0&false))) {{
			// Decode last 1-3 bytes (incl '=') into 1-3 bytes
			__CLR4_1_1021mo21moluszwhlu.R.inc(95713);int i = 0;
			__CLR4_1_1021mo21moluszwhlu.R.inc(95714);for (int j = 0; (((sIx <= eIx - pad)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95715)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95716)==0&false)); j++)
				{__CLR4_1_1021mo21moluszwhlu.R.inc(95717);i |= IA[sArr[sIx++]] << (18 - j * 6);

			}__CLR4_1_1021mo21moluszwhlu.R.inc(95718);for (int r = 16; (((d < len)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95719)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95720)==0&false)); r -= 8)
				{__CLR4_1_1021mo21moluszwhlu.R.inc(95721);dArr[d++] = (byte) (i >> r);
		}}

		}__CLR4_1_1021mo21moluszwhlu.R.inc(95722);return dArr;
	}finally{__CLR4_1_1021mo21moluszwhlu.R.flushNeeded();}}

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
	{try{__CLR4_1_1021mo21moluszwhlu.R.inc(95723);
		// Reuse char[] since we can't create a String incrementally anyway and StringBuffer/Builder would be slower.
		__CLR4_1_1021mo21moluszwhlu.R.inc(95724);return new String(encodeToChar(sArr, lineSep));
	}finally{__CLR4_1_1021mo21moluszwhlu.R.flushNeeded();}}

	/** Decodes a BASE64 encoded <code>String</code>. All illegal characters will be ignored and can handle both strings with
	 * and without line separators.<br>
	 * <b>Note!</b> It can be up to about 2x the speed to call <code>decode(str.toCharArray())</code> instead. That
	 * will create a temporary array though. This version will use <code>str.charAt(i)</code> to iterate the string.
	 * @param str The source string. <code>null</code> or length 0 will return an empty array.
	 * @return The decoded array of bytes. May be of length 0. Will be <code>null</code> if the legal characters
	 * (including '=') isn't divideable by 4.  (I.e. definitely corrupted).
	 */
	public final static byte[] decode(String str)
	{try{__CLR4_1_1021mo21moluszwhlu.R.inc(95725);
		// Check special case
		__CLR4_1_1021mo21moluszwhlu.R.inc(95726);int sLen = (((str != null )&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95727)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95728)==0&false))? str.length() : 0;
		__CLR4_1_1021mo21moluszwhlu.R.inc(95729);if ((((sLen == 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95730)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95731)==0&false)))
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95732);return new byte[0];

		// Count illegal characters (including '\r', '\n') to know what size the returned array will be,
		// so we don't have to reallocate & copy it later.
		}__CLR4_1_1021mo21moluszwhlu.R.inc(95733);int sepCnt = 0; // Number of separator characters. (Actually illegal characters, but that's a bonus...)
		__CLR4_1_1021mo21moluszwhlu.R.inc(95734);for (int i = 0; (((i < sLen)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95735)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95736)==0&false)); i++)  // If input is "pure" (I.e. no line separators or illegal chars) base64 this loop can be commented out.
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95737);if ((((IA[str.charAt(i)] < 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95738)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95739)==0&false)))
				{__CLR4_1_1021mo21moluszwhlu.R.inc(95740);sepCnt++;

		// Check so that legal chars (including '=') are evenly divideable by 4 as specified in RFC 2045.
		}}__CLR4_1_1021mo21moluszwhlu.R.inc(95741);if (((((sLen - sepCnt) % 4 != 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95742)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95743)==0&false)))
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95744);return null;

		// Count '=' at end
		}__CLR4_1_1021mo21moluszwhlu.R.inc(95745);int pad = 0;
		__CLR4_1_1021mo21moluszwhlu.R.inc(95746);for (int i = sLen; (((i > 1 && IA[str.charAt(--i)] <= 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95747)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95748)==0&false));)
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95749);if ((((str.charAt(i) == '=')&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95750)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95751)==0&false)))
				{__CLR4_1_1021mo21moluszwhlu.R.inc(95752);pad++;

		}}__CLR4_1_1021mo21moluszwhlu.R.inc(95753);int len = ((sLen - sepCnt) * 6 >> 3) - pad;

		__CLR4_1_1021mo21moluszwhlu.R.inc(95754);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		__CLR4_1_1021mo21moluszwhlu.R.inc(95755);for (int s = 0, d = 0; (((d < len)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95756)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95757)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_1_1021mo21moluszwhlu.R.inc(95758);int i = 0;
			__CLR4_1_1021mo21moluszwhlu.R.inc(95759);for (int j = 0; (((j < 4)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95760)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95761)==0&false)); j++) {{   // j only increased if a valid char was found.
				__CLR4_1_1021mo21moluszwhlu.R.inc(95762);int c = IA[str.charAt(s++)];
				__CLR4_1_1021mo21moluszwhlu.R.inc(95763);if ((((c >= 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95764)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95765)==0&false)))
				    {__CLR4_1_1021mo21moluszwhlu.R.inc(95766);i |= c << (18 - j * 6);
				}else
					{__CLR4_1_1021mo21moluszwhlu.R.inc(95767);j--;
			}}
			// Add the bytes
			}__CLR4_1_1021mo21moluszwhlu.R.inc(95768);dArr[d++] = (byte) (i >> 16);
			__CLR4_1_1021mo21moluszwhlu.R.inc(95769);if ((((d < len)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95770)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95771)==0&false))) {{
				__CLR4_1_1021mo21moluszwhlu.R.inc(95772);dArr[d++]= (byte) (i >> 8);
				__CLR4_1_1021mo21moluszwhlu.R.inc(95773);if ((((d < len)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95774)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95775)==0&false)))
					{__CLR4_1_1021mo21moluszwhlu.R.inc(95776);dArr[d++] = (byte) i;
			}}
		}}
		}__CLR4_1_1021mo21moluszwhlu.R.inc(95777);return dArr;
	}finally{__CLR4_1_1021mo21moluszwhlu.R.flushNeeded();}}

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
	{try{__CLR4_1_1021mo21moluszwhlu.R.inc(95778);
		// Check special case
		__CLR4_1_1021mo21moluszwhlu.R.inc(95779);int sLen = s.length();
		__CLR4_1_1021mo21moluszwhlu.R.inc(95780);if ((((sLen == 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95781)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95782)==0&false)))
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95783);return new byte[0];

		}__CLR4_1_1021mo21moluszwhlu.R.inc(95784);int sIx = 0, eIx = sLen - 1;    // Start and end index after trimming.

		// Trim illegal chars from start
		__CLR4_1_1021mo21moluszwhlu.R.inc(95785);while ((((sIx < eIx && IA[s.charAt(sIx) & 0xff] < 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95786)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95787)==0&false)))
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95788);sIx++;

		// Trim illegal chars from end
		}__CLR4_1_1021mo21moluszwhlu.R.inc(95789);while ((((eIx > 0 && IA[s.charAt(eIx) & 0xff] < 0)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95790)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95791)==0&false)))
			{__CLR4_1_1021mo21moluszwhlu.R.inc(95792);eIx--;

		// get the padding count (=) (0, 1 or 2)
		}__CLR4_1_1021mo21moluszwhlu.R.inc(95793);int pad = (((s.charAt(eIx) == '=' )&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95794)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95795)==0&false))? ((((s.charAt(eIx - 1) == '=' )&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95796)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95797)==0&false))? 2 : 1) : 0;  // Count '=' at end.
		__CLR4_1_1021mo21moluszwhlu.R.inc(95798);int cCnt = eIx - sIx + 1;   // Content count including possible separators
		__CLR4_1_1021mo21moluszwhlu.R.inc(95799);int sepCnt = (((sLen > 76 )&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95800)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95801)==0&false))? ((((s.charAt(76) == '\r' )&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95802)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95803)==0&false))? cCnt / 78 : 0) << 1 : 0;

		__CLR4_1_1021mo21moluszwhlu.R.inc(95804);int len = ((cCnt - sepCnt) * 6 >> 3) - pad; // The number of decoded bytes
		__CLR4_1_1021mo21moluszwhlu.R.inc(95805);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		// Decode all but the last 0 - 2 bytes.
		__CLR4_1_1021mo21moluszwhlu.R.inc(95806);int d = 0;
		__CLR4_1_1021mo21moluszwhlu.R.inc(95807);for (int cc = 0, eLen = (len / 3) * 3; (((d < eLen)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95808)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95809)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_1_1021mo21moluszwhlu.R.inc(95810);int i = IA[s.charAt(sIx++)] << 18 | IA[s.charAt(sIx++)] << 12 | IA[s.charAt(sIx++)] << 6 | IA[s.charAt(sIx++)];

			// Add the bytes
			__CLR4_1_1021mo21moluszwhlu.R.inc(95811);dArr[d++] = (byte) (i >> 16);
			__CLR4_1_1021mo21moluszwhlu.R.inc(95812);dArr[d++] = (byte) (i >> 8);
			__CLR4_1_1021mo21moluszwhlu.R.inc(95813);dArr[d++] = (byte) i;

			// If line separator, jump over it.
			__CLR4_1_1021mo21moluszwhlu.R.inc(95814);if ((((sepCnt > 0 && ++cc == 19)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95815)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95816)==0&false))) {{
				__CLR4_1_1021mo21moluszwhlu.R.inc(95817);sIx += 2;
				__CLR4_1_1021mo21moluszwhlu.R.inc(95818);cc = 0;
			}
		}}

		}__CLR4_1_1021mo21moluszwhlu.R.inc(95819);if ((((d < len)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95820)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95821)==0&false))) {{
			// Decode last 1-3 bytes (incl '=') into 1-3 bytes
			__CLR4_1_1021mo21moluszwhlu.R.inc(95822);int i = 0;
			__CLR4_1_1021mo21moluszwhlu.R.inc(95823);for (int j = 0; (((sIx <= eIx - pad)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95824)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95825)==0&false)); j++)
				{__CLR4_1_1021mo21moluszwhlu.R.inc(95826);i |= IA[s.charAt(sIx++)] << (18 - j * 6);

			}__CLR4_1_1021mo21moluszwhlu.R.inc(95827);for (int r = 16; (((d < len)&&(__CLR4_1_1021mo21moluszwhlu.R.iget(95828)!=0|true))||(__CLR4_1_1021mo21moluszwhlu.R.iget(95829)==0&false)); r -= 8)
				{__CLR4_1_1021mo21moluszwhlu.R.inc(95830);dArr[d++] = (byte) (i >> r);
		}}

		}__CLR4_1_1021mo21moluszwhlu.R.inc(95831);return dArr;
	}finally{__CLR4_1_1021mo21moluszwhlu.R.flushNeeded();}}
}