/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.util;

import java.util.Arrays;

/**
 *
 * @version 2.2
 * @author Mikael Grev Date: 2004-aug-02 Time: 11:31:11
 * @deprecated internal api, don't use.
 */
public class Base64 {public static class __CLR4_1_10ppsppsluszw0n6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,33495,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final char[] CA = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    public static final int[]  IA = new int[256];
    static {try{__CLR4_1_10ppsppsluszw0n6.R.inc(33328);
        __CLR4_1_10ppsppsluszw0n6.R.inc(33329);Arrays.fill(IA, -1);
        __CLR4_1_10ppsppsluszw0n6.R.inc(33330);for (int i = 0, iS = CA.length; (((i < iS)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33331)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33332)==0&false)); i++)
            {__CLR4_1_10ppsppsluszw0n6.R.inc(33333);IA[CA[i]] = i;
        }__CLR4_1_10ppsppsluszw0n6.R.inc(33334);IA['='] = 0;
    }finally{__CLR4_1_10ppsppsluszw0n6.R.flushNeeded();}}

    /**
     * Decodes a BASE64 encoded char array that is known to be resonably well formatted. The method is about twice as
     * fast as #decode(char[]). The preconditions are:<br>
     * + The array must have a line length of 76 chars OR no line separators at all (one line).<br>
     * + Line separator must be "\r\n", as specified in RFC 2045 + The array must not contain illegal characters within
     * the encoded string<br>
     * + The array CAN have illegal characters at the beginning and end, those will be dealt with appropriately.<br>
     *
     * @param chars The source array. Length 0 will return an empty array. <code>null</code> will throw an exception.
     * @return The decoded array of bytes. May be of length 0.
     */
    public static byte[] decodeFast(char[] chars, int offset, int charsLen) {try{__CLR4_1_10ppsppsluszw0n6.R.inc(33335);
        // Check special case
        __CLR4_1_10ppsppsluszw0n6.R.inc(33336);if ((((charsLen == 0)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33337)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33338)==0&false))) {{
            __CLR4_1_10ppsppsluszw0n6.R.inc(33339);return new byte[0];
        }

        }__CLR4_1_10ppsppsluszw0n6.R.inc(33340);int sIx = offset, eIx = offset + charsLen - 1; // Start and end index after trimming.

        // Trim illegal chars from start
        __CLR4_1_10ppsppsluszw0n6.R.inc(33341);while ((((sIx < eIx && IA[chars[sIx]] < 0)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33342)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33343)==0&false)))
            {__CLR4_1_10ppsppsluszw0n6.R.inc(33344);sIx++;

        // Trim illegal chars from end
        }__CLR4_1_10ppsppsluszw0n6.R.inc(33345);while ((((eIx > 0 && IA[chars[eIx]] < 0)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33346)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33347)==0&false)))
            {__CLR4_1_10ppsppsluszw0n6.R.inc(33348);eIx--;

        // get the padding count (=) (0, 1 or 2)
        }__CLR4_1_10ppsppsluszw0n6.R.inc(33349);int pad = (((chars[eIx] == '=' )&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33350)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33351)==0&false))? ((((chars[eIx - 1] == '=' )&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33352)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33353)==0&false))? 2 : 1) : 0; // Count '=' at end.
        __CLR4_1_10ppsppsluszw0n6.R.inc(33354);int cCnt = eIx - sIx + 1; // Content count including possible separators
        __CLR4_1_10ppsppsluszw0n6.R.inc(33355);int sepCnt = (((charsLen > 76 )&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33356)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33357)==0&false))? ((((chars[76] == '\r' )&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33358)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33359)==0&false))? cCnt / 78 : 0) << 1 : 0;

        __CLR4_1_10ppsppsluszw0n6.R.inc(33360);int len = ((cCnt - sepCnt) * 6 >> 3) - pad; // The number of decoded bytes
        __CLR4_1_10ppsppsluszw0n6.R.inc(33361);byte[] bytes = new byte[len]; // Preallocate byte[] of exact length

        // Decode all but the last 0 - 2 bytes.
        __CLR4_1_10ppsppsluszw0n6.R.inc(33362);int d = 0;
        __CLR4_1_10ppsppsluszw0n6.R.inc(33363);for (int cc = 0, eLen = (len / 3) * 3; (((d < eLen)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33364)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33365)==0&false));) {{
            // Assemble three bytes into an int from four "valid" characters.
            __CLR4_1_10ppsppsluszw0n6.R.inc(33366);int i = IA[chars[sIx++]] << 18 | IA[chars[sIx++]] << 12 | IA[chars[sIx++]] << 6 | IA[chars[sIx++]];

            // Add the bytes
            __CLR4_1_10ppsppsluszw0n6.R.inc(33367);bytes[d++] = (byte) (i >> 16);
            __CLR4_1_10ppsppsluszw0n6.R.inc(33368);bytes[d++] = (byte) (i >> 8);
            __CLR4_1_10ppsppsluszw0n6.R.inc(33369);bytes[d++] = (byte) i;

            // If line separator, jump over it.
            __CLR4_1_10ppsppsluszw0n6.R.inc(33370);if ((((sepCnt > 0 && ++cc == 19)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33371)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33372)==0&false))) {{
                __CLR4_1_10ppsppsluszw0n6.R.inc(33373);sIx += 2;
                __CLR4_1_10ppsppsluszw0n6.R.inc(33374);cc = 0;
            }
        }}

        }__CLR4_1_10ppsppsluszw0n6.R.inc(33375);if ((((d < len)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33376)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33377)==0&false))) {{
            // Decode last 1-3 bytes (incl '=') into 1-3 bytes
            __CLR4_1_10ppsppsluszw0n6.R.inc(33378);int i = 0;
            __CLR4_1_10ppsppsluszw0n6.R.inc(33379);for (int j = 0; (((sIx <= eIx - pad)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33380)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33381)==0&false)); j++)
                {__CLR4_1_10ppsppsluszw0n6.R.inc(33382);i |= IA[chars[sIx++]] << (18 - j * 6);

            }__CLR4_1_10ppsppsluszw0n6.R.inc(33383);for (int r = 16; (((d < len)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33384)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33385)==0&false)); r -= 8)
                {__CLR4_1_10ppsppsluszw0n6.R.inc(33386);bytes[d++] = (byte) (i >> r);
        }}

        }__CLR4_1_10ppsppsluszw0n6.R.inc(33387);return bytes;
    }finally{__CLR4_1_10ppsppsluszw0n6.R.flushNeeded();}}

    public static byte[] decodeFast(String chars, int offset, int charsLen) {try{__CLR4_1_10ppsppsluszw0n6.R.inc(33388);
        // Check special case
        __CLR4_1_10ppsppsluszw0n6.R.inc(33389);if ((((charsLen == 0)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33390)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33391)==0&false))) {{
            __CLR4_1_10ppsppsluszw0n6.R.inc(33392);return new byte[0];
        }

        }__CLR4_1_10ppsppsluszw0n6.R.inc(33393);int sIx = offset, eIx = offset + charsLen - 1; // Start and end index after trimming.

        // Trim illegal chars from start
        __CLR4_1_10ppsppsluszw0n6.R.inc(33394);while ((((sIx < eIx && IA[chars.charAt(sIx)] < 0)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33395)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33396)==0&false)))
            {__CLR4_1_10ppsppsluszw0n6.R.inc(33397);sIx++;

        // Trim illegal chars from end
        }__CLR4_1_10ppsppsluszw0n6.R.inc(33398);while ((((eIx > 0 && IA[chars.charAt(eIx)] < 0)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33399)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33400)==0&false)))
            {__CLR4_1_10ppsppsluszw0n6.R.inc(33401);eIx--;

        // get the padding count (=) (0, 1 or 2)
        }__CLR4_1_10ppsppsluszw0n6.R.inc(33402);int pad = (((chars.charAt(eIx) == '=' )&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33403)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33404)==0&false))? ((((chars.charAt(eIx - 1) == '=' )&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33405)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33406)==0&false))? 2 : 1) : 0; // Count '=' at end.
        __CLR4_1_10ppsppsluszw0n6.R.inc(33407);int cCnt = eIx - sIx + 1; // Content count including possible separators
        __CLR4_1_10ppsppsluszw0n6.R.inc(33408);int sepCnt = (((charsLen > 76 )&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33409)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33410)==0&false))? ((((chars.charAt(76) == '\r' )&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33411)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33412)==0&false))? cCnt / 78 : 0) << 1 : 0;

        __CLR4_1_10ppsppsluszw0n6.R.inc(33413);int len = ((cCnt - sepCnt) * 6 >> 3) - pad; // The number of decoded bytes
        __CLR4_1_10ppsppsluszw0n6.R.inc(33414);byte[] bytes = new byte[len]; // Preallocate byte[] of exact length

        // Decode all but the last 0 - 2 bytes.
        __CLR4_1_10ppsppsluszw0n6.R.inc(33415);int d = 0;
        __CLR4_1_10ppsppsluszw0n6.R.inc(33416);for (int cc = 0, eLen = (len / 3) * 3; (((d < eLen)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33417)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33418)==0&false));) {{
            // Assemble three bytes into an int from four "valid" characters.
            __CLR4_1_10ppsppsluszw0n6.R.inc(33419);int i = IA[chars.charAt(sIx++)] << 18 | IA[chars.charAt(sIx++)] << 12 | IA[chars.charAt(sIx++)] << 6 | IA[chars.charAt(sIx++)];

            // Add the bytes
            __CLR4_1_10ppsppsluszw0n6.R.inc(33420);bytes[d++] = (byte) (i >> 16);
            __CLR4_1_10ppsppsluszw0n6.R.inc(33421);bytes[d++] = (byte) (i >> 8);
            __CLR4_1_10ppsppsluszw0n6.R.inc(33422);bytes[d++] = (byte) i;

            // If line separator, jump over it.
            __CLR4_1_10ppsppsluszw0n6.R.inc(33423);if ((((sepCnt > 0 && ++cc == 19)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33424)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33425)==0&false))) {{
                __CLR4_1_10ppsppsluszw0n6.R.inc(33426);sIx += 2;
                __CLR4_1_10ppsppsluszw0n6.R.inc(33427);cc = 0;
            }
        }}

        }__CLR4_1_10ppsppsluszw0n6.R.inc(33428);if ((((d < len)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33429)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33430)==0&false))) {{
            // Decode last 1-3 bytes (incl '=') into 1-3 bytes
            __CLR4_1_10ppsppsluszw0n6.R.inc(33431);int i = 0;
            __CLR4_1_10ppsppsluszw0n6.R.inc(33432);for (int j = 0; (((sIx <= eIx - pad)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33433)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33434)==0&false)); j++)
                {__CLR4_1_10ppsppsluszw0n6.R.inc(33435);i |= IA[chars.charAt(sIx++)] << (18 - j * 6);

            }__CLR4_1_10ppsppsluszw0n6.R.inc(33436);for (int r = 16; (((d < len)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33437)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33438)==0&false)); r -= 8)
                {__CLR4_1_10ppsppsluszw0n6.R.inc(33439);bytes[d++] = (byte) (i >> r);
        }}

        }__CLR4_1_10ppsppsluszw0n6.R.inc(33440);return bytes;
    }finally{__CLR4_1_10ppsppsluszw0n6.R.flushNeeded();}}

    /**
     * Decodes a BASE64 encoded string that is known to be resonably well formatted. The method is about twice as fast
     * as decode(String). The preconditions are:<br>
     * + The array must have a line length of 76 chars OR no line separators at all (one line).<br>
     * + Line separator must be "\r\n", as specified in RFC 2045 + The array must not contain illegal characters within
     * the encoded string<br>
     * + The array CAN have illegal characters at the beginning and end, those will be dealt with appropriately.<br>
     *
     * @param s The source string. Length 0 will return an empty array. <code>null</code> will throw an exception.
     * @return The decoded array of bytes. May be of length 0.
     */
    public static byte[] decodeFast(String s) {try{__CLR4_1_10ppsppsluszw0n6.R.inc(33441);
        // Check special case
        __CLR4_1_10ppsppsluszw0n6.R.inc(33442);int sLen = s.length();
        __CLR4_1_10ppsppsluszw0n6.R.inc(33443);if ((((sLen == 0)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33444)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33445)==0&false))) {{
            __CLR4_1_10ppsppsluszw0n6.R.inc(33446);return new byte[0];
        }

        }__CLR4_1_10ppsppsluszw0n6.R.inc(33447);int sIx = 0, eIx = sLen - 1; // Start and end index after trimming.

        // Trim illegal chars from start
        __CLR4_1_10ppsppsluszw0n6.R.inc(33448);while ((((sIx < eIx && IA[s.charAt(sIx) & 0xff] < 0)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33449)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33450)==0&false)))
            {__CLR4_1_10ppsppsluszw0n6.R.inc(33451);sIx++;

        // Trim illegal chars from end
        }__CLR4_1_10ppsppsluszw0n6.R.inc(33452);while ((((eIx > 0 && IA[s.charAt(eIx) & 0xff] < 0)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33453)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33454)==0&false)))
            {__CLR4_1_10ppsppsluszw0n6.R.inc(33455);eIx--;

        // get the padding count (=) (0, 1 or 2)
        }__CLR4_1_10ppsppsluszw0n6.R.inc(33456);int pad = (((s.charAt(eIx) == '=' )&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33457)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33458)==0&false))? ((((s.charAt(eIx - 1) == '=' )&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33459)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33460)==0&false))? 2 : 1) : 0; // Count '=' at end.
        __CLR4_1_10ppsppsluszw0n6.R.inc(33461);int cCnt = eIx - sIx + 1; // Content count including possible separators
        __CLR4_1_10ppsppsluszw0n6.R.inc(33462);int sepCnt = (((sLen > 76 )&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33463)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33464)==0&false))? ((((s.charAt(76) == '\r' )&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33465)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33466)==0&false))? cCnt / 78 : 0) << 1 : 0;

        __CLR4_1_10ppsppsluszw0n6.R.inc(33467);int len = ((cCnt - sepCnt) * 6 >> 3) - pad; // The number of decoded bytes
        __CLR4_1_10ppsppsluszw0n6.R.inc(33468);byte[] dArr = new byte[len]; // Preallocate byte[] of exact length

        // Decode all but the last 0 - 2 bytes.
        __CLR4_1_10ppsppsluszw0n6.R.inc(33469);int d = 0;
        __CLR4_1_10ppsppsluszw0n6.R.inc(33470);for (int cc = 0, eLen = (len / 3) * 3; (((d < eLen)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33471)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33472)==0&false));) {{
            // Assemble three bytes into an int from four "valid" characters.
            __CLR4_1_10ppsppsluszw0n6.R.inc(33473);int i = IA[s.charAt(sIx++)] << 18 | IA[s.charAt(sIx++)] << 12 | IA[s.charAt(sIx++)] << 6
                    | IA[s.charAt(sIx++)];

            // Add the bytes
            __CLR4_1_10ppsppsluszw0n6.R.inc(33474);dArr[d++] = (byte) (i >> 16);
            __CLR4_1_10ppsppsluszw0n6.R.inc(33475);dArr[d++] = (byte) (i >> 8);
            __CLR4_1_10ppsppsluszw0n6.R.inc(33476);dArr[d++] = (byte) i;

            // If line separator, jump over it.
            __CLR4_1_10ppsppsluszw0n6.R.inc(33477);if ((((sepCnt > 0 && ++cc == 19)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33478)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33479)==0&false))) {{
                __CLR4_1_10ppsppsluszw0n6.R.inc(33480);sIx += 2;
                __CLR4_1_10ppsppsluszw0n6.R.inc(33481);cc = 0;
            }
        }}

        }__CLR4_1_10ppsppsluszw0n6.R.inc(33482);if ((((d < len)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33483)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33484)==0&false))) {{
            // Decode last 1-3 bytes (incl '=') into 1-3 bytes
            __CLR4_1_10ppsppsluszw0n6.R.inc(33485);int i = 0;
            __CLR4_1_10ppsppsluszw0n6.R.inc(33486);for (int j = 0; (((sIx <= eIx - pad)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33487)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33488)==0&false)); j++)
                {__CLR4_1_10ppsppsluszw0n6.R.inc(33489);i |= IA[s.charAt(sIx++)] << (18 - j * 6);

            }__CLR4_1_10ppsppsluszw0n6.R.inc(33490);for (int r = 16; (((d < len)&&(__CLR4_1_10ppsppsluszw0n6.R.iget(33491)!=0|true))||(__CLR4_1_10ppsppsluszw0n6.R.iget(33492)==0&false)); r -= 8)
                {__CLR4_1_10ppsppsluszw0n6.R.inc(33493);dArr[d++] = (byte) (i >> r);
        }}

        }__CLR4_1_10ppsppsluszw0n6.R.inc(33494);return dArr;
    }finally{__CLR4_1_10ppsppsluszw0n6.R.flushNeeded();}}
}