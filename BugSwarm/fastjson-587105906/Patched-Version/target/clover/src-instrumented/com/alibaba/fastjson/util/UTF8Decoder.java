/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.util;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

/*  Legal UTF-8 Byte Sequences
 *
 * #    Code Points      Bits   Bit/Byte pattern
 * 1                     7      0xxxxxxx
 *      U+0000..U+007F          00..7F
 *
 * 2                     11     110xxxxx    10xxxxxx
 *      U+0080..U+07FF          C2..DF      80..BF
 *
 * 3                     16     1110xxxx    10xxxxxx    10xxxxxx
 *      U+0800..U+0FFF          E0          A0..BF      80..BF
 *      U+1000..U+FFFF          E1..EF      80..BF      80..BF
 *
 * 4                     21     11110xxx    10xxxxxx    10xxxxxx    10xxxxxx
 *     U+10000..U+3FFFF         F0          90..BF      80..BF      80..BF
 *     U+40000..U+FFFFF         F1..F3      80..BF      80..BF      80..BF
 *    U+100000..U10FFFF         F4          80..8F      80..BF      80..BF
 *
 */

/**
 * @deprecated
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class UTF8Decoder extends CharsetDecoder {public static class __CLR4_5_2ubuubulusyjovn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,39456,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final static Charset charset = Charset.forName("UTF-8");

    public UTF8Decoder(){
        super(charset, 1.0f, 1.0f);__CLR4_5_2ubuubulusyjovn.R.inc(39307);try{__CLR4_5_2ubuubulusyjovn.R.inc(39306);
    }finally{__CLR4_5_2ubuubulusyjovn.R.flushNeeded();}}

    private static boolean isNotContinuation(int b) {try{__CLR4_5_2ubuubulusyjovn.R.inc(39308);
        __CLR4_5_2ubuubulusyjovn.R.inc(39309);return (b & 0xc0) != 0x80;
    }finally{__CLR4_5_2ubuubulusyjovn.R.flushNeeded();}}

    // [C2..DF] [80..BF]
    private static boolean isMalformed2(int b1, int b2) {try{__CLR4_5_2ubuubulusyjovn.R.inc(39310);
        __CLR4_5_2ubuubulusyjovn.R.inc(39311);return (b1 & 0x1e) == 0x0 || (b2 & 0xc0) != 0x80;
    }finally{__CLR4_5_2ubuubulusyjovn.R.flushNeeded();}}

    // [E0] [A0..BF] [80..BF]
    // [E1..EF] [80..BF] [80..BF]
    private static boolean isMalformed3(int b1, int b2, int b3) {try{__CLR4_5_2ubuubulusyjovn.R.inc(39312);
        __CLR4_5_2ubuubulusyjovn.R.inc(39313);return (b1 == (byte) 0xe0 && (b2 & 0xe0) == 0x80) || (b2 & 0xc0) != 0x80 || (b3 & 0xc0) != 0x80;
    }finally{__CLR4_5_2ubuubulusyjovn.R.flushNeeded();}}

    // [F0] [90..BF] [80..BF] [80..BF]
    // [F1..F3] [80..BF] [80..BF] [80..BF]
    // [F4] [80..8F] [80..BF] [80..BF]
    // only check 80-be range here, the [0xf0,0x80...] and [0xf4,0x90-...]
    // will be checked by Surrogate.neededFor(uc)
    private static boolean isMalformed4(int b2, int b3, int b4) {try{__CLR4_5_2ubuubulusyjovn.R.inc(39314);
        __CLR4_5_2ubuubulusyjovn.R.inc(39315);return (b2 & 0xc0) != 0x80 || (b3 & 0xc0) != 0x80 || (b4 & 0xc0) != 0x80;
    }finally{__CLR4_5_2ubuubulusyjovn.R.flushNeeded();}}

    private static CoderResult lookupN(ByteBuffer src, int n) {try{__CLR4_5_2ubuubulusyjovn.R.inc(39316);
        __CLR4_5_2ubuubulusyjovn.R.inc(39317);for (int i = 1; (((i < n)&&(__CLR4_5_2ubuubulusyjovn.R.iget(39318)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39319)==0&false)); i++) {{
            __CLR4_5_2ubuubulusyjovn.R.inc(39320);if ((((isNotContinuation(src.get()))&&(__CLR4_5_2ubuubulusyjovn.R.iget(39321)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39322)==0&false))) {__CLR4_5_2ubuubulusyjovn.R.inc(39323);return CoderResult.malformedForLength(i);
        }}
        }__CLR4_5_2ubuubulusyjovn.R.inc(39324);return CoderResult.malformedForLength(n);
    }finally{__CLR4_5_2ubuubulusyjovn.R.flushNeeded();}}

    public static CoderResult malformedN(ByteBuffer src, int nb) {try{__CLR4_5_2ubuubulusyjovn.R.inc(39325);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_2ubuubulusyjovn.R.inc(39326);switch (nb) {
            case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_2ubuubulusyjovn.R.inc(39327);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ubuubulusyjovn.R.inc(39328);int b1 = src.get();
                __CLR4_5_2ubuubulusyjovn.R.inc(39329);if (((((b1 >> 2) == -2)&&(__CLR4_5_2ubuubulusyjovn.R.iget(39330)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39331)==0&false))) {{
                    // 5 bytes 111110xx 10xxxxxx 10xxxxxx 10xxxxxx 10xxxxxx
                    __CLR4_5_2ubuubulusyjovn.R.inc(39332);if ((((src.remaining() < 4)&&(__CLR4_5_2ubuubulusyjovn.R.iget(39333)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39334)==0&false))) {__CLR4_5_2ubuubulusyjovn.R.inc(39335);return CoderResult.UNDERFLOW;
                    }__CLR4_5_2ubuubulusyjovn.R.inc(39336);return lookupN(src, 5);
                }
                }__CLR4_5_2ubuubulusyjovn.R.inc(39337);if (((((b1 >> 1) == -2)&&(__CLR4_5_2ubuubulusyjovn.R.iget(39338)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39339)==0&false))) {{
                    // 6 bytes 1111110x 10xxxxxx 10xxxxxx 10xxxxxx 10xxxxxx 10xxxxxx
                    __CLR4_5_2ubuubulusyjovn.R.inc(39340);if ((((src.remaining() < 5)&&(__CLR4_5_2ubuubulusyjovn.R.iget(39341)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39342)==0&false))) {{
                        __CLR4_5_2ubuubulusyjovn.R.inc(39343);return CoderResult.UNDERFLOW;
                    }
                    }__CLR4_5_2ubuubulusyjovn.R.inc(39344);return lookupN(src, 6);
                }
                }__CLR4_5_2ubuubulusyjovn.R.inc(39345);return CoderResult.malformedForLength(1);
            case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_2ubuubulusyjovn.R.inc(39346);__CLB4_5_2_bool0=true;} // always 1
                __CLR4_5_2ubuubulusyjovn.R.inc(39347);return CoderResult.malformedForLength(1);
            case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_2ubuubulusyjovn.R.inc(39348);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ubuubulusyjovn.R.inc(39349);b1 = src.get();
                __CLR4_5_2ubuubulusyjovn.R.inc(39350);int b2 = src.get(); // no need to lookup b3
                __CLR4_5_2ubuubulusyjovn.R.inc(39351);return CoderResult.malformedForLength((((((b1 == (byte) 0xe0 && (b2 & 0xe0) == 0x80) || isNotContinuation(b2)) )&&(__CLR4_5_2ubuubulusyjovn.R.iget(39352)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39353)==0&false))? 1 : 2);
            case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_2ubuubulusyjovn.R.inc(39354);__CLB4_5_2_bool0=true;} // we don't care the speed here
                __CLR4_5_2ubuubulusyjovn.R.inc(39355);b1 = src.get() & 0xff;
                __CLR4_5_2ubuubulusyjovn.R.inc(39356);b2 = src.get() & 0xff;
                __CLR4_5_2ubuubulusyjovn.R.inc(39357);if ((((b1 > 0xf4 || (b1 == 0xf0 && (b2 < 0x90 || b2 > 0xbf)) || (b1 == 0xf4 && (b2 & 0xf0) != 0x80) || isNotContinuation(b2))&&(__CLR4_5_2ubuubulusyjovn.R.iget(39358)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39359)==0&false))) {__CLR4_5_2ubuubulusyjovn.R.inc(39360);return CoderResult.malformedForLength(1);
                }__CLR4_5_2ubuubulusyjovn.R.inc(39361);if ((((isNotContinuation(src.get()))&&(__CLR4_5_2ubuubulusyjovn.R.iget(39362)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39363)==0&false))) {__CLR4_5_2ubuubulusyjovn.R.inc(39364);return CoderResult.malformedForLength(2);
                }__CLR4_5_2ubuubulusyjovn.R.inc(39365);return CoderResult.malformedForLength(3);
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_2ubuubulusyjovn.R.inc(39366);__CLB4_5_2_bool0=true;}
                __CLR4_5_2ubuubulusyjovn.R.inc(39367);throw new IllegalStateException();
        }
    }finally{__CLR4_5_2ubuubulusyjovn.R.flushNeeded();}}

    private static CoderResult malformed(ByteBuffer src, int sp, CharBuffer dst, int dp, int nb) {try{__CLR4_5_2ubuubulusyjovn.R.inc(39368);
        __CLR4_5_2ubuubulusyjovn.R.inc(39369);src.position(sp - src.arrayOffset());
        __CLR4_5_2ubuubulusyjovn.R.inc(39370);CoderResult cr = malformedN(src, nb);
        __CLR4_5_2ubuubulusyjovn.R.inc(39371);src.position(sp);
        __CLR4_5_2ubuubulusyjovn.R.inc(39372);dst.position(dp);
        __CLR4_5_2ubuubulusyjovn.R.inc(39373);return cr;
    }finally{__CLR4_5_2ubuubulusyjovn.R.flushNeeded();}}

    private static CoderResult xflow(Buffer src, int sp, int sl, Buffer dst, int dp, int nb) {try{__CLR4_5_2ubuubulusyjovn.R.inc(39374);
        __CLR4_5_2ubuubulusyjovn.R.inc(39375);src.position(sp);
        __CLR4_5_2ubuubulusyjovn.R.inc(39376);dst.position(dp);
        __CLR4_5_2ubuubulusyjovn.R.inc(39377);return ((((nb == 0 || sl - sp < nb) )&&(__CLR4_5_2ubuubulusyjovn.R.iget(39378)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39379)==0&false))? CoderResult.UNDERFLOW : CoderResult.OVERFLOW;
    }finally{__CLR4_5_2ubuubulusyjovn.R.flushNeeded();}}

    private CoderResult decodeArrayLoop(ByteBuffer src, CharBuffer dst) {try{__CLR4_5_2ubuubulusyjovn.R.inc(39380);
        // This method is optimized for ASCII input.
        __CLR4_5_2ubuubulusyjovn.R.inc(39381);byte[] srcArray = src.array();
        __CLR4_5_2ubuubulusyjovn.R.inc(39382);int srcPosition = src.arrayOffset() + src.position();
        __CLR4_5_2ubuubulusyjovn.R.inc(39383);int srcLength = src.arrayOffset() + src.limit();

        __CLR4_5_2ubuubulusyjovn.R.inc(39384);char[] destArray = dst.array();
        __CLR4_5_2ubuubulusyjovn.R.inc(39385);int destPosition = dst.arrayOffset() + dst.position();
        __CLR4_5_2ubuubulusyjovn.R.inc(39386);int destLength = dst.arrayOffset() + dst.limit();
        __CLR4_5_2ubuubulusyjovn.R.inc(39387);int destLengthASCII = destPosition + Math.min(srcLength - srcPosition, destLength - destPosition);

        // ASCII only loop
        __CLR4_5_2ubuubulusyjovn.R.inc(39388);while ((((destPosition < destLengthASCII && srcArray[srcPosition] >= 0)&&(__CLR4_5_2ubuubulusyjovn.R.iget(39389)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39390)==0&false))) {{
            __CLR4_5_2ubuubulusyjovn.R.inc(39391);destArray[destPosition++] = (char) srcArray[srcPosition++];
        }

        }__CLR4_5_2ubuubulusyjovn.R.inc(39392);while ((((srcPosition < srcLength)&&(__CLR4_5_2ubuubulusyjovn.R.iget(39393)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39394)==0&false))) {{
            __CLR4_5_2ubuubulusyjovn.R.inc(39395);int b1 = srcArray[srcPosition];
            __CLR4_5_2ubuubulusyjovn.R.inc(39396);if ((((b1 >= 0)&&(__CLR4_5_2ubuubulusyjovn.R.iget(39397)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39398)==0&false))) {{
                // 1 byte, 7 bits: 0xxxxxxx
                __CLR4_5_2ubuubulusyjovn.R.inc(39399);if ((((destPosition >= destLength)&&(__CLR4_5_2ubuubulusyjovn.R.iget(39400)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39401)==0&false))) {{
                    __CLR4_5_2ubuubulusyjovn.R.inc(39402);return xflow(src, srcPosition, srcLength, dst, destPosition, 1);
                }
                }__CLR4_5_2ubuubulusyjovn.R.inc(39403);destArray[destPosition++] = (char) b1;
                __CLR4_5_2ubuubulusyjovn.R.inc(39404);srcPosition++;
            } }else {__CLR4_5_2ubuubulusyjovn.R.inc(39405);if (((((b1 >> 5) == -2)&&(__CLR4_5_2ubuubulusyjovn.R.iget(39406)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39407)==0&false))) {{
                // 2 bytes, 11 bits: 110xxxxx 10xxxxxx
                __CLR4_5_2ubuubulusyjovn.R.inc(39408);if ((((srcLength - srcPosition < 2 || destPosition >= destLength)&&(__CLR4_5_2ubuubulusyjovn.R.iget(39409)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39410)==0&false))) {{
                    __CLR4_5_2ubuubulusyjovn.R.inc(39411);return xflow(src, srcPosition, srcLength, dst, destPosition, 2);
                }
                }__CLR4_5_2ubuubulusyjovn.R.inc(39412);int b2 = srcArray[srcPosition + 1];
                __CLR4_5_2ubuubulusyjovn.R.inc(39413);if ((((isMalformed2(b1, b2))&&(__CLR4_5_2ubuubulusyjovn.R.iget(39414)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39415)==0&false))) {{
                    __CLR4_5_2ubuubulusyjovn.R.inc(39416);return malformed(src, srcPosition, dst, destPosition, 2);
                }
                }__CLR4_5_2ubuubulusyjovn.R.inc(39417);destArray[destPosition++] = (char) (((b1 << 6) ^ b2) ^ 0x0f80);
                __CLR4_5_2ubuubulusyjovn.R.inc(39418);srcPosition += 2;
            } }else {__CLR4_5_2ubuubulusyjovn.R.inc(39419);if (((((b1 >> 4) == -2)&&(__CLR4_5_2ubuubulusyjovn.R.iget(39420)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39421)==0&false))) {{
                // 3 bytes, 16 bits: 1110xxxx 10xxxxxx 10xxxxxx
                __CLR4_5_2ubuubulusyjovn.R.inc(39422);if ((((srcLength - srcPosition < 3 || destPosition >= destLength)&&(__CLR4_5_2ubuubulusyjovn.R.iget(39423)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39424)==0&false))) {{
                    __CLR4_5_2ubuubulusyjovn.R.inc(39425);return xflow(src, srcPosition, srcLength, dst, destPosition, 3);
                }
                }__CLR4_5_2ubuubulusyjovn.R.inc(39426);int b2 = srcArray[srcPosition + 1];
                __CLR4_5_2ubuubulusyjovn.R.inc(39427);int b3 = srcArray[srcPosition + 2];
                __CLR4_5_2ubuubulusyjovn.R.inc(39428);if ((((isMalformed3(b1, b2, b3))&&(__CLR4_5_2ubuubulusyjovn.R.iget(39429)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39430)==0&false))) {{
                    __CLR4_5_2ubuubulusyjovn.R.inc(39431);return malformed(src, srcPosition, dst, destPosition, 3);
                }
                }__CLR4_5_2ubuubulusyjovn.R.inc(39432);destArray[destPosition++] = (char) (((b1 << 12) ^ (b2 << 6) ^ b3) ^ 0x1f80);
                __CLR4_5_2ubuubulusyjovn.R.inc(39433);srcPosition += 3;
            } }else {__CLR4_5_2ubuubulusyjovn.R.inc(39434);if (((((b1 >> 3) == -2)&&(__CLR4_5_2ubuubulusyjovn.R.iget(39435)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39436)==0&false))) {{
                // 4 bytes, 21 bits: 11110xxx 10xxxxxx 10xxxxxx 10xxxxxx
                __CLR4_5_2ubuubulusyjovn.R.inc(39437);if ((((srcLength - srcPosition < 4 || destLength - destPosition < 2)&&(__CLR4_5_2ubuubulusyjovn.R.iget(39438)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39439)==0&false))) {{
                    __CLR4_5_2ubuubulusyjovn.R.inc(39440);return xflow(src, srcPosition, srcLength, dst, destPosition, 4);
                }
                }__CLR4_5_2ubuubulusyjovn.R.inc(39441);int b2 = srcArray[srcPosition + 1];
                __CLR4_5_2ubuubulusyjovn.R.inc(39442);int b3 = srcArray[srcPosition + 2];
                __CLR4_5_2ubuubulusyjovn.R.inc(39443);int b4 = srcArray[srcPosition + 3];
                __CLR4_5_2ubuubulusyjovn.R.inc(39444);int uc = ((b1 & 0x07) << 18) | ((b2 & 0x3f) << 12) | ((b3 & 0x3f) << 06) | (b4 & 0x3f);
                __CLR4_5_2ubuubulusyjovn.R.inc(39445);if ((((isMalformed4(b2, b3, b4) || !((uc >= 0x10000) && (uc <= 1114111)))&&(__CLR4_5_2ubuubulusyjovn.R.iget(39446)!=0|true))||(__CLR4_5_2ubuubulusyjovn.R.iget(39447)==0&false))) {{
                    __CLR4_5_2ubuubulusyjovn.R.inc(39448);return malformed(src, srcPosition, dst, destPosition, 4);
                }
                }__CLR4_5_2ubuubulusyjovn.R.inc(39449);destArray[destPosition++] = (char) (0xd800 | (((uc - 0x10000) >> 10) & 0x3ff));
                __CLR4_5_2ubuubulusyjovn.R.inc(39450);destArray[destPosition++] = (char) (0xdc00 | ((uc - 0x10000) & 0x3ff));
                __CLR4_5_2ubuubulusyjovn.R.inc(39451);srcPosition += 4;
            } }else {{
                __CLR4_5_2ubuubulusyjovn.R.inc(39452);return malformed(src, srcPosition, dst, destPosition, 1);
            }
        }}}}}
        }__CLR4_5_2ubuubulusyjovn.R.inc(39453);return xflow(src, srcPosition, srcLength, dst, destPosition, 0);
    }finally{__CLR4_5_2ubuubulusyjovn.R.flushNeeded();}}

    protected CoderResult decodeLoop(ByteBuffer src, CharBuffer dst) {try{__CLR4_5_2ubuubulusyjovn.R.inc(39454);
        __CLR4_5_2ubuubulusyjovn.R.inc(39455);return decodeArrayLoop(src, dst);
    }finally{__CLR4_5_2ubuubulusyjovn.R.flushNeeded();}}




}
