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
{public static class __CLR4_5_221md21mdlusvnjmv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,95821,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	private static final char[] CA = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
	private static final int[] IA = new int[256];
	static {try{__CLR4_5_221md21mdlusvnjmv.R.inc(95413);
		__CLR4_5_221md21mdlusvnjmv.R.inc(95414);Arrays.fill(IA, -1);
		__CLR4_5_221md21mdlusvnjmv.R.inc(95415);for (int i = 0, iS = CA.length; (((i < iS)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95416)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95417)==0&false)); i++)
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95418);IA[CA[i]] = i;
		}__CLR4_5_221md21mdlusvnjmv.R.inc(95419);IA['='] = 0;
	}finally{__CLR4_5_221md21mdlusvnjmv.R.flushNeeded();}}

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
	{try{__CLR4_5_221md21mdlusvnjmv.R.inc(95420);
		// Check special case
		__CLR4_5_221md21mdlusvnjmv.R.inc(95421);int bytes_len = (((bytes != null )&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95422)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95423)==0&false))? bytes.length : 0;
		__CLR4_5_221md21mdlusvnjmv.R.inc(95424);if ((((bytes_len == 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95425)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95426)==0&false)))
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95427);return new char[0];

		}__CLR4_5_221md21mdlusvnjmv.R.inc(95428);int eLen = (bytes_len / 3) * 3;              // Length of even 24-bits.
		__CLR4_5_221md21mdlusvnjmv.R.inc(95429);int cCnt = ((bytes_len - 1) / 3 + 1) << 2;   // Returned character count
		__CLR4_5_221md21mdlusvnjmv.R.inc(95430);int chars_len = cCnt + ((((lineSep )&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95431)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95432)==0&false))? (cCnt - 1) / 76 << 1 : 0); // Length of returned array
		__CLR4_5_221md21mdlusvnjmv.R.inc(95433);char[] chars = new char[chars_len];

		// Encode even 24-bits
		__CLR4_5_221md21mdlusvnjmv.R.inc(95434);for (int s = 0, d = 0, cc = 0; (((s < eLen)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95435)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95436)==0&false));) {{
			// Copy next three bytes into lower 24 bits of int, paying attension to sign.
			__CLR4_5_221md21mdlusvnjmv.R.inc(95437);int i = (bytes[s++] & 0xff) << 16 | (bytes[s++] & 0xff) << 8 | (bytes[s++] & 0xff);

			// Encode the int into four chars
			__CLR4_5_221md21mdlusvnjmv.R.inc(95438);chars[d++] = CA[(i >>> 18) & 0x3f];
			__CLR4_5_221md21mdlusvnjmv.R.inc(95439);chars[d++] = CA[(i >>> 12) & 0x3f];
			__CLR4_5_221md21mdlusvnjmv.R.inc(95440);chars[d++] = CA[(i >>> 6) & 0x3f];
			__CLR4_5_221md21mdlusvnjmv.R.inc(95441);chars[d++] = CA[i & 0x3f];

			// Add optional line separator
			__CLR4_5_221md21mdlusvnjmv.R.inc(95442);if ((((lineSep && ++cc == 19 && d < chars_len - 2)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95443)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95444)==0&false))) {{
				__CLR4_5_221md21mdlusvnjmv.R.inc(95445);chars[d++] = '\r';
				__CLR4_5_221md21mdlusvnjmv.R.inc(95446);chars[d++] = '\n';
				__CLR4_5_221md21mdlusvnjmv.R.inc(95447);cc = 0;
			}
		}}

		// Pad and encode last bits if source isn't even 24 bits.
		}__CLR4_5_221md21mdlusvnjmv.R.inc(95448);int left = bytes_len - eLen; // 0 - 2.
		__CLR4_5_221md21mdlusvnjmv.R.inc(95449);if ((((left > 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95450)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95451)==0&false))) {{
			// Prepare the int
			__CLR4_5_221md21mdlusvnjmv.R.inc(95452);int i = ((bytes[eLen] & 0xff) << 10) | ((((left == 2 )&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95453)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95454)==0&false))? ((bytes[bytes_len - 1] & 0xff) << 2) : 0);

			// Set last four chars
			__CLR4_5_221md21mdlusvnjmv.R.inc(95455);chars[chars_len - 4] = CA[i >> 12];
			__CLR4_5_221md21mdlusvnjmv.R.inc(95456);chars[chars_len - 3] = CA[(i >>> 6) & 0x3f];
			__CLR4_5_221md21mdlusvnjmv.R.inc(95457);chars[chars_len - 2] = (((left == 2 )&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95458)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95459)==0&false))? CA[i & 0x3f] : '=';
			__CLR4_5_221md21mdlusvnjmv.R.inc(95460);chars[chars_len - 1] = '=';
		}
		}__CLR4_5_221md21mdlusvnjmv.R.inc(95461);return chars;
	}finally{__CLR4_5_221md21mdlusvnjmv.R.flushNeeded();}}

	/** Decodes a BASE64 encoded char array. All illegal characters will be ignored and can handle both arrays with
	 * and without line separators.
	 * @param sArr The source array. <code>null</code> or length 0 will return an empty array.
	 * @return The decoded array of bytes. May be of length 0. Will be <code>null</code> if the legal characters
	 * (including '=') isn't divideable by 4.  (I.e. definitely corrupted).
	 */
	public final static byte[] decode(char[] sArr)
	{try{__CLR4_5_221md21mdlusvnjmv.R.inc(95462);
		// Check special case
		__CLR4_5_221md21mdlusvnjmv.R.inc(95463);int sLen = (((sArr != null )&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95464)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95465)==0&false))? sArr.length : 0;
		__CLR4_5_221md21mdlusvnjmv.R.inc(95466);if ((((sLen == 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95467)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95468)==0&false)))
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95469);return new byte[0];

		// Count illegal characters (including '\r', '\n') to know what size the returned array will be,
		// so we don't have to reallocate & copy it later.
		}__CLR4_5_221md21mdlusvnjmv.R.inc(95470);int sepCnt = 0; // Number of separator characters. (Actually illegal characters, but that's a bonus...)
		__CLR4_5_221md21mdlusvnjmv.R.inc(95471);for (int i = 0; (((i < sLen)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95472)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95473)==0&false)); i++)  // If input is "pure" (I.e. no line separators or illegal chars) base64 this loop can be commented out.
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95474);if ((((IA[sArr[i]] < 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95475)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95476)==0&false)))
				{__CLR4_5_221md21mdlusvnjmv.R.inc(95477);sepCnt++;

		// Check so that legal chars (including '=') are evenly divideable by 4 as specified in RFC 2045.
		}}__CLR4_5_221md21mdlusvnjmv.R.inc(95478);if (((((sLen - sepCnt) % 4 != 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95479)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95480)==0&false)))
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95481);return null;

		}__CLR4_5_221md21mdlusvnjmv.R.inc(95482);int pad = 0;
		__CLR4_5_221md21mdlusvnjmv.R.inc(95483);for (int i = sLen; (((i > 1 && IA[sArr[--i]] <= 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95484)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95485)==0&false));)
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95486);if ((((sArr[i] == '=')&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95487)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95488)==0&false)))
				{__CLR4_5_221md21mdlusvnjmv.R.inc(95489);pad++;

		}}__CLR4_5_221md21mdlusvnjmv.R.inc(95490);int len = ((sLen - sepCnt) * 6 >> 3) - pad;

		__CLR4_5_221md21mdlusvnjmv.R.inc(95491);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		__CLR4_5_221md21mdlusvnjmv.R.inc(95492);for (int s = 0, d = 0; (((d < len)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95493)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95494)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_5_221md21mdlusvnjmv.R.inc(95495);int i = 0;
			__CLR4_5_221md21mdlusvnjmv.R.inc(95496);for (int j = 0; (((j < 4)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95497)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95498)==0&false)); j++) {{   // j only increased if a valid char was found.
				__CLR4_5_221md21mdlusvnjmv.R.inc(95499);int c = IA[sArr[s++]];
				__CLR4_5_221md21mdlusvnjmv.R.inc(95500);if ((((c >= 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95501)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95502)==0&false)))
				    {__CLR4_5_221md21mdlusvnjmv.R.inc(95503);i |= c << (18 - j * 6);
				}else
					{__CLR4_5_221md21mdlusvnjmv.R.inc(95504);j--;
			}}
			// Add the bytes
			}__CLR4_5_221md21mdlusvnjmv.R.inc(95505);dArr[d++] = (byte) (i >> 16);
			__CLR4_5_221md21mdlusvnjmv.R.inc(95506);if ((((d < len)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95507)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95508)==0&false))) {{
				__CLR4_5_221md21mdlusvnjmv.R.inc(95509);dArr[d++]= (byte) (i >> 8);
				__CLR4_5_221md21mdlusvnjmv.R.inc(95510);if ((((d < len)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95511)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95512)==0&false)))
					{__CLR4_5_221md21mdlusvnjmv.R.inc(95513);dArr[d++] = (byte) i;
			}}
		}}
		}__CLR4_5_221md21mdlusvnjmv.R.inc(95514);return dArr;
	}finally{__CLR4_5_221md21mdlusvnjmv.R.flushNeeded();}}

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
	{try{__CLR4_5_221md21mdlusvnjmv.R.inc(95515);
		// Check special case
		__CLR4_5_221md21mdlusvnjmv.R.inc(95516);int sLen = sArr.length;
		__CLR4_5_221md21mdlusvnjmv.R.inc(95517);if ((((sLen == 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95518)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95519)==0&false)))
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95520);return new byte[0];

		}__CLR4_5_221md21mdlusvnjmv.R.inc(95521);int sIx = 0, eIx = sLen - 1;    // Start and end index after trimming.

		// Trim illegal chars from start
		__CLR4_5_221md21mdlusvnjmv.R.inc(95522);while ((((sIx < eIx && IA[sArr[sIx]] < 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95523)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95524)==0&false)))
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95525);sIx++;

		// Trim illegal chars from end
		}__CLR4_5_221md21mdlusvnjmv.R.inc(95526);while ((((eIx > 0 && IA[sArr[eIx]] < 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95527)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95528)==0&false)))
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95529);eIx--;

		// get the padding count (=) (0, 1 or 2)
		}__CLR4_5_221md21mdlusvnjmv.R.inc(95530);int pad = (((sArr[eIx] == '=' )&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95531)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95532)==0&false))? ((((sArr[eIx - 1] == '=' )&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95533)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95534)==0&false))? 2 : 1) : 0;  // Count '=' at end.
		__CLR4_5_221md21mdlusvnjmv.R.inc(95535);int cCnt = eIx - sIx + 1;   // Content count including possible separators
		__CLR4_5_221md21mdlusvnjmv.R.inc(95536);int sepCnt = (((sLen > 76 )&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95537)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95538)==0&false))? ((((sArr[76] == '\r' )&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95539)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95540)==0&false))? cCnt / 78 : 0) << 1 : 0;

		__CLR4_5_221md21mdlusvnjmv.R.inc(95541);int len = ((cCnt - sepCnt) * 6 >> 3) - pad; // The number of decoded bytes
		__CLR4_5_221md21mdlusvnjmv.R.inc(95542);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		// Decode all but the last 0 - 2 bytes.
		__CLR4_5_221md21mdlusvnjmv.R.inc(95543);int d = 0;
		__CLR4_5_221md21mdlusvnjmv.R.inc(95544);for (int cc = 0, eLen = (len / 3) * 3; (((d < eLen)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95545)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95546)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_5_221md21mdlusvnjmv.R.inc(95547);int i = IA[sArr[sIx++]] << 18 | IA[sArr[sIx++]] << 12 | IA[sArr[sIx++]] << 6 | IA[sArr[sIx++]];

			// Add the bytes
			__CLR4_5_221md21mdlusvnjmv.R.inc(95548);dArr[d++] = (byte) (i >> 16);
			__CLR4_5_221md21mdlusvnjmv.R.inc(95549);dArr[d++] = (byte) (i >> 8);
			__CLR4_5_221md21mdlusvnjmv.R.inc(95550);dArr[d++] = (byte) i;

			// If line separator, jump over it.
			__CLR4_5_221md21mdlusvnjmv.R.inc(95551);if ((((sepCnt > 0 && ++cc == 19)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95552)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95553)==0&false))) {{
				__CLR4_5_221md21mdlusvnjmv.R.inc(95554);sIx += 2;
				__CLR4_5_221md21mdlusvnjmv.R.inc(95555);cc = 0;
			}
		}}

		}__CLR4_5_221md21mdlusvnjmv.R.inc(95556);if ((((d < len)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95557)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95558)==0&false))) {{
			// Decode last 1-3 bytes (incl '=') into 1-3 bytes
			__CLR4_5_221md21mdlusvnjmv.R.inc(95559);int i = 0;
			__CLR4_5_221md21mdlusvnjmv.R.inc(95560);for (int j = 0; (((sIx <= eIx - pad)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95561)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95562)==0&false)); j++)
				{__CLR4_5_221md21mdlusvnjmv.R.inc(95563);i |= IA[sArr[sIx++]] << (18 - j * 6);

			}__CLR4_5_221md21mdlusvnjmv.R.inc(95564);for (int r = 16; (((d < len)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95565)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95566)==0&false)); r -= 8)
				{__CLR4_5_221md21mdlusvnjmv.R.inc(95567);dArr[d++] = (byte) (i >> r);
		}}

		}__CLR4_5_221md21mdlusvnjmv.R.inc(95568);return dArr;
	}finally{__CLR4_5_221md21mdlusvnjmv.R.flushNeeded();}}

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
	{try{__CLR4_5_221md21mdlusvnjmv.R.inc(95569);
		// Check special case
		__CLR4_5_221md21mdlusvnjmv.R.inc(95570);int sLen = (((sArr != null )&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95571)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95572)==0&false))? sArr.length : 0;
		__CLR4_5_221md21mdlusvnjmv.R.inc(95573);if ((((sLen == 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95574)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95575)==0&false)))
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95576);return new byte[0];

		}__CLR4_5_221md21mdlusvnjmv.R.inc(95577);int eLen = (sLen / 3) * 3;                              // Length of even 24-bits.
		__CLR4_5_221md21mdlusvnjmv.R.inc(95578);int cCnt = ((sLen - 1) / 3 + 1) << 2;                   // Returned character count
		__CLR4_5_221md21mdlusvnjmv.R.inc(95579);int dLen = cCnt + ((((lineSep )&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95580)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95581)==0&false))? (cCnt - 1) / 76 << 1 : 0); // Length of returned array
		__CLR4_5_221md21mdlusvnjmv.R.inc(95582);byte[] dArr = new byte[dLen];

		// Encode even 24-bits
		__CLR4_5_221md21mdlusvnjmv.R.inc(95583);for (int s = 0, d = 0, cc = 0; (((s < eLen)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95584)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95585)==0&false));) {{
			// Copy next three bytes into lower 24 bits of int, paying attension to sign.
			__CLR4_5_221md21mdlusvnjmv.R.inc(95586);int i = (sArr[s++] & 0xff) << 16 | (sArr[s++] & 0xff) << 8 | (sArr[s++] & 0xff);

			// Encode the int into four chars
			__CLR4_5_221md21mdlusvnjmv.R.inc(95587);dArr[d++] = (byte) CA[(i >>> 18) & 0x3f];
			__CLR4_5_221md21mdlusvnjmv.R.inc(95588);dArr[d++] = (byte) CA[(i >>> 12) & 0x3f];
			__CLR4_5_221md21mdlusvnjmv.R.inc(95589);dArr[d++] = (byte) CA[(i >>> 6) & 0x3f];
			__CLR4_5_221md21mdlusvnjmv.R.inc(95590);dArr[d++] = (byte) CA[i & 0x3f];

			// Add optional line separator
			__CLR4_5_221md21mdlusvnjmv.R.inc(95591);if ((((lineSep && ++cc == 19 && d < dLen - 2)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95592)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95593)==0&false))) {{
				__CLR4_5_221md21mdlusvnjmv.R.inc(95594);dArr[d++] = '\r';
				__CLR4_5_221md21mdlusvnjmv.R.inc(95595);dArr[d++] = '\n';
				__CLR4_5_221md21mdlusvnjmv.R.inc(95596);cc = 0;
			}
		}}

		// Pad and encode last bits if source isn't an even 24 bits.
		}__CLR4_5_221md21mdlusvnjmv.R.inc(95597);int left = sLen - eLen; // 0 - 2.
		__CLR4_5_221md21mdlusvnjmv.R.inc(95598);if ((((left > 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95599)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95600)==0&false))) {{
			// Prepare the int
			__CLR4_5_221md21mdlusvnjmv.R.inc(95601);int i = ((sArr[eLen] & 0xff) << 10) | ((((left == 2 )&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95602)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95603)==0&false))? ((sArr[sLen - 1] & 0xff) << 2) : 0);

			// Set last four chars
			__CLR4_5_221md21mdlusvnjmv.R.inc(95604);dArr[dLen - 4] = (byte) CA[i >> 12];
			__CLR4_5_221md21mdlusvnjmv.R.inc(95605);dArr[dLen - 3] = (byte) CA[(i >>> 6) & 0x3f];
			__CLR4_5_221md21mdlusvnjmv.R.inc(95606);dArr[dLen - 2] = (((left == 2 )&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95607)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95608)==0&false))? (byte) CA[i & 0x3f] : (byte) '=';
			__CLR4_5_221md21mdlusvnjmv.R.inc(95609);dArr[dLen - 1] = '=';
		}
		}__CLR4_5_221md21mdlusvnjmv.R.inc(95610);return dArr;
	}finally{__CLR4_5_221md21mdlusvnjmv.R.flushNeeded();}}

	/** Decodes a BASE64 encoded byte array. All illegal characters will be ignored and can handle both arrays with
	 * and without line separators.
	 * @param sArr The source array. Length 0 will return an empty array. <code>null</code> will throw an exception.
	 * @return The decoded array of bytes. May be of length 0. Will be <code>null</code> if the legal characters
	 * (including '=') isn't divideable by 4. (I.e. definitely corrupted).
	 */
	public final static byte[] decode(byte[] sArr)
	{try{__CLR4_5_221md21mdlusvnjmv.R.inc(95611);
		// Check special case
		__CLR4_5_221md21mdlusvnjmv.R.inc(95612);int sLen = sArr.length;

		// Count illegal characters (including '\r', '\n') to know what size the returned array will be,
		// so we don't have to reallocate & copy it later.
		__CLR4_5_221md21mdlusvnjmv.R.inc(95613);int sepCnt = 0; // Number of separator characters. (Actually illegal characters, but that's a bonus...)
		__CLR4_5_221md21mdlusvnjmv.R.inc(95614);for (int i = 0; (((i < sLen)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95615)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95616)==0&false)); i++)      // If input is "pure" (I.e. no line separators or illegal chars) base64 this loop can be commented out.
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95617);if ((((IA[sArr[i] & 0xff] < 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95618)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95619)==0&false)))
				{__CLR4_5_221md21mdlusvnjmv.R.inc(95620);sepCnt++;

		// Check so that legal chars (including '=') are evenly divideable by 4 as specified in RFC 2045.
		}}__CLR4_5_221md21mdlusvnjmv.R.inc(95621);if (((((sLen - sepCnt) % 4 != 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95622)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95623)==0&false)))
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95624);return null;

		}__CLR4_5_221md21mdlusvnjmv.R.inc(95625);int pad = 0;
		__CLR4_5_221md21mdlusvnjmv.R.inc(95626);for (int i = sLen; (((i > 1 && IA[sArr[--i] & 0xff] <= 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95627)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95628)==0&false));)
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95629);if ((((sArr[i] == '=')&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95630)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95631)==0&false)))
				{__CLR4_5_221md21mdlusvnjmv.R.inc(95632);pad++;

		}}__CLR4_5_221md21mdlusvnjmv.R.inc(95633);int len = ((sLen - sepCnt) * 6 >> 3) - pad;

		__CLR4_5_221md21mdlusvnjmv.R.inc(95634);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		__CLR4_5_221md21mdlusvnjmv.R.inc(95635);for (int s = 0, d = 0; (((d < len)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95636)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95637)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_5_221md21mdlusvnjmv.R.inc(95638);int i = 0;
			__CLR4_5_221md21mdlusvnjmv.R.inc(95639);for (int j = 0; (((j < 4)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95640)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95641)==0&false)); j++) {{   // j only increased if a valid char was found.
				__CLR4_5_221md21mdlusvnjmv.R.inc(95642);int c = IA[sArr[s++] & 0xff];
				__CLR4_5_221md21mdlusvnjmv.R.inc(95643);if ((((c >= 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95644)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95645)==0&false)))
				    {__CLR4_5_221md21mdlusvnjmv.R.inc(95646);i |= c << (18 - j * 6);
				}else
					{__CLR4_5_221md21mdlusvnjmv.R.inc(95647);j--;
			}}

			// Add the bytes
			}__CLR4_5_221md21mdlusvnjmv.R.inc(95648);dArr[d++] = (byte) (i >> 16);
			__CLR4_5_221md21mdlusvnjmv.R.inc(95649);if ((((d < len)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95650)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95651)==0&false))) {{
				__CLR4_5_221md21mdlusvnjmv.R.inc(95652);dArr[d++]= (byte) (i >> 8);
				__CLR4_5_221md21mdlusvnjmv.R.inc(95653);if ((((d < len)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95654)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95655)==0&false)))
					{__CLR4_5_221md21mdlusvnjmv.R.inc(95656);dArr[d++] = (byte) i;
			}}
		}}

		}__CLR4_5_221md21mdlusvnjmv.R.inc(95657);return dArr;
	}finally{__CLR4_5_221md21mdlusvnjmv.R.flushNeeded();}}


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
	{try{__CLR4_5_221md21mdlusvnjmv.R.inc(95658);
		// Check special case
		__CLR4_5_221md21mdlusvnjmv.R.inc(95659);int sLen = sArr.length;
		__CLR4_5_221md21mdlusvnjmv.R.inc(95660);if ((((sLen == 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95661)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95662)==0&false)))
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95663);return new byte[0];

		}__CLR4_5_221md21mdlusvnjmv.R.inc(95664);int sIx = 0, eIx = sLen - 1;    // Start and end index after trimming.

		// Trim illegal chars from start
		__CLR4_5_221md21mdlusvnjmv.R.inc(95665);while ((((sIx < eIx && IA[sArr[sIx] & 0xff] < 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95666)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95667)==0&false)))
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95668);sIx++;

		// Trim illegal chars from end
		}__CLR4_5_221md21mdlusvnjmv.R.inc(95669);while ((((eIx > 0 && IA[sArr[eIx] & 0xff] < 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95670)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95671)==0&false)))
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95672);eIx--;

		// get the padding count (=) (0, 1 or 2)
		}__CLR4_5_221md21mdlusvnjmv.R.inc(95673);int pad = (((sArr[eIx] == '=' )&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95674)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95675)==0&false))? ((((sArr[eIx - 1] == '=' )&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95676)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95677)==0&false))? 2 : 1) : 0;  // Count '=' at end.
		__CLR4_5_221md21mdlusvnjmv.R.inc(95678);int cCnt = eIx - sIx + 1;   // Content count including possible separators
		__CLR4_5_221md21mdlusvnjmv.R.inc(95679);int sepCnt = (((sLen > 76 )&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95680)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95681)==0&false))? ((((sArr[76] == '\r' )&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95682)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95683)==0&false))? cCnt / 78 : 0) << 1 : 0;

		__CLR4_5_221md21mdlusvnjmv.R.inc(95684);int len = ((cCnt - sepCnt) * 6 >> 3) - pad; // The number of decoded bytes
		__CLR4_5_221md21mdlusvnjmv.R.inc(95685);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		// Decode all but the last 0 - 2 bytes.
		__CLR4_5_221md21mdlusvnjmv.R.inc(95686);int d = 0;
		__CLR4_5_221md21mdlusvnjmv.R.inc(95687);for (int cc = 0, eLen = (len / 3) * 3; (((d < eLen)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95688)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95689)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_5_221md21mdlusvnjmv.R.inc(95690);int i = IA[sArr[sIx++]] << 18 | IA[sArr[sIx++]] << 12 | IA[sArr[sIx++]] << 6 | IA[sArr[sIx++]];

			// Add the bytes
			__CLR4_5_221md21mdlusvnjmv.R.inc(95691);dArr[d++] = (byte) (i >> 16);
			__CLR4_5_221md21mdlusvnjmv.R.inc(95692);dArr[d++] = (byte) (i >> 8);
			__CLR4_5_221md21mdlusvnjmv.R.inc(95693);dArr[d++] = (byte) i;

			// If line separator, jump over it.
			__CLR4_5_221md21mdlusvnjmv.R.inc(95694);if ((((sepCnt > 0 && ++cc == 19)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95695)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95696)==0&false))) {{
				__CLR4_5_221md21mdlusvnjmv.R.inc(95697);sIx += 2;
				__CLR4_5_221md21mdlusvnjmv.R.inc(95698);cc = 0;
			}
		}}

		}__CLR4_5_221md21mdlusvnjmv.R.inc(95699);if ((((d < len)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95700)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95701)==0&false))) {{
			// Decode last 1-3 bytes (incl '=') into 1-3 bytes
			__CLR4_5_221md21mdlusvnjmv.R.inc(95702);int i = 0;
			__CLR4_5_221md21mdlusvnjmv.R.inc(95703);for (int j = 0; (((sIx <= eIx - pad)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95704)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95705)==0&false)); j++)
				{__CLR4_5_221md21mdlusvnjmv.R.inc(95706);i |= IA[sArr[sIx++]] << (18 - j * 6);

			}__CLR4_5_221md21mdlusvnjmv.R.inc(95707);for (int r = 16; (((d < len)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95708)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95709)==0&false)); r -= 8)
				{__CLR4_5_221md21mdlusvnjmv.R.inc(95710);dArr[d++] = (byte) (i >> r);
		}}

		}__CLR4_5_221md21mdlusvnjmv.R.inc(95711);return dArr;
	}finally{__CLR4_5_221md21mdlusvnjmv.R.flushNeeded();}}

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
	{try{__CLR4_5_221md21mdlusvnjmv.R.inc(95712);
		// Reuse char[] since we can't create a String incrementally anyway and StringBuffer/Builder would be slower.
		__CLR4_5_221md21mdlusvnjmv.R.inc(95713);return new String(encodeToChar(sArr, lineSep));
	}finally{__CLR4_5_221md21mdlusvnjmv.R.flushNeeded();}}

	/** Decodes a BASE64 encoded <code>String</code>. All illegal characters will be ignored and can handle both strings with
	 * and without line separators.<br>
	 * <b>Note!</b> It can be up to about 2x the speed to call <code>decode(str.toCharArray())</code> instead. That
	 * will create a temporary array though. This version will use <code>str.charAt(i)</code> to iterate the string.
	 * @param str The source string. <code>null</code> or length 0 will return an empty array.
	 * @return The decoded array of bytes. May be of length 0. Will be <code>null</code> if the legal characters
	 * (including '=') isn't divideable by 4.  (I.e. definitely corrupted).
	 */
	public final static byte[] decode(String str)
	{try{__CLR4_5_221md21mdlusvnjmv.R.inc(95714);
		// Check special case
		__CLR4_5_221md21mdlusvnjmv.R.inc(95715);int sLen = (((str != null )&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95716)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95717)==0&false))? str.length() : 0;
		__CLR4_5_221md21mdlusvnjmv.R.inc(95718);if ((((sLen == 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95719)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95720)==0&false)))
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95721);return new byte[0];

		// Count illegal characters (including '\r', '\n') to know what size the returned array will be,
		// so we don't have to reallocate & copy it later.
		}__CLR4_5_221md21mdlusvnjmv.R.inc(95722);int sepCnt = 0; // Number of separator characters. (Actually illegal characters, but that's a bonus...)
		__CLR4_5_221md21mdlusvnjmv.R.inc(95723);for (int i = 0; (((i < sLen)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95724)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95725)==0&false)); i++)  // If input is "pure" (I.e. no line separators or illegal chars) base64 this loop can be commented out.
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95726);if ((((IA[str.charAt(i)] < 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95727)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95728)==0&false)))
				{__CLR4_5_221md21mdlusvnjmv.R.inc(95729);sepCnt++;

		// Check so that legal chars (including '=') are evenly divideable by 4 as specified in RFC 2045.
		}}__CLR4_5_221md21mdlusvnjmv.R.inc(95730);if (((((sLen - sepCnt) % 4 != 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95731)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95732)==0&false)))
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95733);return null;

		// Count '=' at end
		}__CLR4_5_221md21mdlusvnjmv.R.inc(95734);int pad = 0;
		__CLR4_5_221md21mdlusvnjmv.R.inc(95735);for (int i = sLen; (((i > 1 && IA[str.charAt(--i)] <= 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95736)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95737)==0&false));)
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95738);if ((((str.charAt(i) == '=')&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95739)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95740)==0&false)))
				{__CLR4_5_221md21mdlusvnjmv.R.inc(95741);pad++;

		}}__CLR4_5_221md21mdlusvnjmv.R.inc(95742);int len = ((sLen - sepCnt) * 6 >> 3) - pad;

		__CLR4_5_221md21mdlusvnjmv.R.inc(95743);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		__CLR4_5_221md21mdlusvnjmv.R.inc(95744);for (int s = 0, d = 0; (((d < len)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95745)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95746)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_5_221md21mdlusvnjmv.R.inc(95747);int i = 0;
			__CLR4_5_221md21mdlusvnjmv.R.inc(95748);for (int j = 0; (((j < 4)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95749)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95750)==0&false)); j++) {{   // j only increased if a valid char was found.
				__CLR4_5_221md21mdlusvnjmv.R.inc(95751);int c = IA[str.charAt(s++)];
				__CLR4_5_221md21mdlusvnjmv.R.inc(95752);if ((((c >= 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95753)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95754)==0&false)))
				    {__CLR4_5_221md21mdlusvnjmv.R.inc(95755);i |= c << (18 - j * 6);
				}else
					{__CLR4_5_221md21mdlusvnjmv.R.inc(95756);j--;
			}}
			// Add the bytes
			}__CLR4_5_221md21mdlusvnjmv.R.inc(95757);dArr[d++] = (byte) (i >> 16);
			__CLR4_5_221md21mdlusvnjmv.R.inc(95758);if ((((d < len)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95759)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95760)==0&false))) {{
				__CLR4_5_221md21mdlusvnjmv.R.inc(95761);dArr[d++]= (byte) (i >> 8);
				__CLR4_5_221md21mdlusvnjmv.R.inc(95762);if ((((d < len)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95763)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95764)==0&false)))
					{__CLR4_5_221md21mdlusvnjmv.R.inc(95765);dArr[d++] = (byte) i;
			}}
		}}
		}__CLR4_5_221md21mdlusvnjmv.R.inc(95766);return dArr;
	}finally{__CLR4_5_221md21mdlusvnjmv.R.flushNeeded();}}

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
	{try{__CLR4_5_221md21mdlusvnjmv.R.inc(95767);
		// Check special case
		__CLR4_5_221md21mdlusvnjmv.R.inc(95768);int sLen = s.length();
		__CLR4_5_221md21mdlusvnjmv.R.inc(95769);if ((((sLen == 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95770)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95771)==0&false)))
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95772);return new byte[0];

		}__CLR4_5_221md21mdlusvnjmv.R.inc(95773);int sIx = 0, eIx = sLen - 1;    // Start and end index after trimming.

		// Trim illegal chars from start
		__CLR4_5_221md21mdlusvnjmv.R.inc(95774);while ((((sIx < eIx && IA[s.charAt(sIx) & 0xff] < 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95775)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95776)==0&false)))
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95777);sIx++;

		// Trim illegal chars from end
		}__CLR4_5_221md21mdlusvnjmv.R.inc(95778);while ((((eIx > 0 && IA[s.charAt(eIx) & 0xff] < 0)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95779)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95780)==0&false)))
			{__CLR4_5_221md21mdlusvnjmv.R.inc(95781);eIx--;

		// get the padding count (=) (0, 1 or 2)
		}__CLR4_5_221md21mdlusvnjmv.R.inc(95782);int pad = (((s.charAt(eIx) == '=' )&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95783)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95784)==0&false))? ((((s.charAt(eIx - 1) == '=' )&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95785)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95786)==0&false))? 2 : 1) : 0;  // Count '=' at end.
		__CLR4_5_221md21mdlusvnjmv.R.inc(95787);int cCnt = eIx - sIx + 1;   // Content count including possible separators
		__CLR4_5_221md21mdlusvnjmv.R.inc(95788);int sepCnt = (((sLen > 76 )&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95789)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95790)==0&false))? ((((s.charAt(76) == '\r' )&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95791)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95792)==0&false))? cCnt / 78 : 0) << 1 : 0;

		__CLR4_5_221md21mdlusvnjmv.R.inc(95793);int len = ((cCnt - sepCnt) * 6 >> 3) - pad; // The number of decoded bytes
		__CLR4_5_221md21mdlusvnjmv.R.inc(95794);byte[] dArr = new byte[len];       // Preallocate byte[] of exact length

		// Decode all but the last 0 - 2 bytes.
		__CLR4_5_221md21mdlusvnjmv.R.inc(95795);int d = 0;
		__CLR4_5_221md21mdlusvnjmv.R.inc(95796);for (int cc = 0, eLen = (len / 3) * 3; (((d < eLen)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95797)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95798)==0&false));) {{
			// Assemble three bytes into an int from four "valid" characters.
			__CLR4_5_221md21mdlusvnjmv.R.inc(95799);int i = IA[s.charAt(sIx++)] << 18 | IA[s.charAt(sIx++)] << 12 | IA[s.charAt(sIx++)] << 6 | IA[s.charAt(sIx++)];

			// Add the bytes
			__CLR4_5_221md21mdlusvnjmv.R.inc(95800);dArr[d++] = (byte) (i >> 16);
			__CLR4_5_221md21mdlusvnjmv.R.inc(95801);dArr[d++] = (byte) (i >> 8);
			__CLR4_5_221md21mdlusvnjmv.R.inc(95802);dArr[d++] = (byte) i;

			// If line separator, jump over it.
			__CLR4_5_221md21mdlusvnjmv.R.inc(95803);if ((((sepCnt > 0 && ++cc == 19)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95804)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95805)==0&false))) {{
				__CLR4_5_221md21mdlusvnjmv.R.inc(95806);sIx += 2;
				__CLR4_5_221md21mdlusvnjmv.R.inc(95807);cc = 0;
			}
		}}

		}__CLR4_5_221md21mdlusvnjmv.R.inc(95808);if ((((d < len)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95809)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95810)==0&false))) {{
			// Decode last 1-3 bytes (incl '=') into 1-3 bytes
			__CLR4_5_221md21mdlusvnjmv.R.inc(95811);int i = 0;
			__CLR4_5_221md21mdlusvnjmv.R.inc(95812);for (int j = 0; (((sIx <= eIx - pad)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95813)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95814)==0&false)); j++)
				{__CLR4_5_221md21mdlusvnjmv.R.inc(95815);i |= IA[s.charAt(sIx++)] << (18 - j * 6);

			}__CLR4_5_221md21mdlusvnjmv.R.inc(95816);for (int r = 16; (((d < len)&&(__CLR4_5_221md21mdlusvnjmv.R.iget(95817)!=0|true))||(__CLR4_5_221md21mdlusvnjmv.R.iget(95818)==0&false)); r -= 8)
				{__CLR4_5_221md21mdlusvnjmv.R.inc(95819);dArr[d++] = (byte) (i >> r);
		}}

		}__CLR4_5_221md21mdlusvnjmv.R.inc(95820);return dArr;
	}finally{__CLR4_5_221md21mdlusvnjmv.R.flushNeeded();}}
}