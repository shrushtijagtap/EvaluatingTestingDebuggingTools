/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.util;

import java.lang.ref.SoftReference;
import java.nio.charset.CharsetDecoder;

/**
 * @deprecated
 */
public class ThreadLocalCache {public static class __CLR4_1_10s2ts2tlusqjqrx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,36460,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final static int                                 CHARS_CACH_INIT_SIZE = 1024;                                    // 1k, 2^10;
    public final static int 								CHARS_CACH_INIT_SIZE_EXP = 10;
    public final static int                                 CHARS_CACH_MAX_SIZE  = 1024 * 128;                              // 128k, 2^17;
    public final static int 								CHARS_CACH_MAX_SIZE_EXP = 17;
    private final static ThreadLocal<SoftReference<char[]>> charsBufLocal        = new ThreadLocal<SoftReference<char[]>>();

    private final static ThreadLocal<CharsetDecoder>        decoderLocal         = new ThreadLocal<CharsetDecoder>();

    public static CharsetDecoder getUTF8Decoder() {try{__CLR4_1_10s2ts2tlusqjqrx.R.inc(36389);
        __CLR4_1_10s2ts2tlusqjqrx.R.inc(36390);CharsetDecoder decoder = decoderLocal.get();
        __CLR4_1_10s2ts2tlusqjqrx.R.inc(36391);if ((((decoder == null)&&(__CLR4_1_10s2ts2tlusqjqrx.R.iget(36392)!=0|true))||(__CLR4_1_10s2ts2tlusqjqrx.R.iget(36393)==0&false))) {{
            __CLR4_1_10s2ts2tlusqjqrx.R.inc(36394);decoder = new UTF8Decoder();
            __CLR4_1_10s2ts2tlusqjqrx.R.inc(36395);decoderLocal.set(decoder);
        }
        }__CLR4_1_10s2ts2tlusqjqrx.R.inc(36396);return decoder;
    }finally{__CLR4_1_10s2ts2tlusqjqrx.R.flushNeeded();}}

    public static void clearChars() {try{__CLR4_1_10s2ts2tlusqjqrx.R.inc(36397);
        __CLR4_1_10s2ts2tlusqjqrx.R.inc(36398);charsBufLocal.set(null);
    }finally{__CLR4_1_10s2ts2tlusqjqrx.R.flushNeeded();}}

    public static char[] getChars(int length) {try{__CLR4_1_10s2ts2tlusqjqrx.R.inc(36399);
        __CLR4_1_10s2ts2tlusqjqrx.R.inc(36400);SoftReference<char[]> ref = charsBufLocal.get();

        __CLR4_1_10s2ts2tlusqjqrx.R.inc(36401);if ((((ref == null)&&(__CLR4_1_10s2ts2tlusqjqrx.R.iget(36402)!=0|true))||(__CLR4_1_10s2ts2tlusqjqrx.R.iget(36403)==0&false))) {{
            __CLR4_1_10s2ts2tlusqjqrx.R.inc(36404);return allocate(length);
        }

        }__CLR4_1_10s2ts2tlusqjqrx.R.inc(36405);char[] chars = ref.get();

        __CLR4_1_10s2ts2tlusqjqrx.R.inc(36406);if ((((chars == null)&&(__CLR4_1_10s2ts2tlusqjqrx.R.iget(36407)!=0|true))||(__CLR4_1_10s2ts2tlusqjqrx.R.iget(36408)==0&false))) {{
            __CLR4_1_10s2ts2tlusqjqrx.R.inc(36409);return allocate(length);
        }

        }__CLR4_1_10s2ts2tlusqjqrx.R.inc(36410);if ((((chars.length < length)&&(__CLR4_1_10s2ts2tlusqjqrx.R.iget(36411)!=0|true))||(__CLR4_1_10s2ts2tlusqjqrx.R.iget(36412)==0&false))) {{
            __CLR4_1_10s2ts2tlusqjqrx.R.inc(36413);chars = allocate(length);
        }

        }__CLR4_1_10s2ts2tlusqjqrx.R.inc(36414);return chars;
    }finally{__CLR4_1_10s2ts2tlusqjqrx.R.flushNeeded();}}

    private static char[] allocate(int length) {try{__CLR4_1_10s2ts2tlusqjqrx.R.inc(36415);
        __CLR4_1_10s2ts2tlusqjqrx.R.inc(36416);if((((length> CHARS_CACH_MAX_SIZE)&&(__CLR4_1_10s2ts2tlusqjqrx.R.iget(36417)!=0|true))||(__CLR4_1_10s2ts2tlusqjqrx.R.iget(36418)==0&false))) {{
            __CLR4_1_10s2ts2tlusqjqrx.R.inc(36419);return new char[length];
        }

        }__CLR4_1_10s2ts2tlusqjqrx.R.inc(36420);int allocateLength = getAllocateLengthExp(CHARS_CACH_INIT_SIZE_EXP, CHARS_CACH_MAX_SIZE_EXP, length);
        __CLR4_1_10s2ts2tlusqjqrx.R.inc(36421);char[] chars = new char[allocateLength];
        __CLR4_1_10s2ts2tlusqjqrx.R.inc(36422);charsBufLocal.set(new SoftReference<char[]>(chars));
        __CLR4_1_10s2ts2tlusqjqrx.R.inc(36423);return chars;
    }finally{__CLR4_1_10s2ts2tlusqjqrx.R.flushNeeded();}}

    private static int getAllocateLengthExp(int minExp, int maxExp, int length) {try{__CLR4_1_10s2ts2tlusqjqrx.R.inc(36424);
        assert ((((1<<maxExp) >= length)&&(__CLR4_1_10s2ts2tlusqjqrx.R.iget(36425)!=0|true))||(__CLR4_1_10s2ts2tlusqjqrx.R.iget(36426)==0&false));
//		int max = 1 << maxExp;
//		if(length>= max) {
//			return length;
//		}
        __CLR4_1_10s2ts2tlusqjqrx.R.inc(36427);int part = length >>> minExp;
        __CLR4_1_10s2ts2tlusqjqrx.R.inc(36428);if((((part <= 0)&&(__CLR4_1_10s2ts2tlusqjqrx.R.iget(36429)!=0|true))||(__CLR4_1_10s2ts2tlusqjqrx.R.iget(36430)==0&false))) {{
            __CLR4_1_10s2ts2tlusqjqrx.R.inc(36431);return 1<< minExp;
        }
        }__CLR4_1_10s2ts2tlusqjqrx.R.inc(36432);return 1 << 32 - Integer.numberOfLeadingZeros(length-1);
    }finally{__CLR4_1_10s2ts2tlusqjqrx.R.flushNeeded();}}

    // /////////
    public final static int                                 BYTES_CACH_INIT_SIZE = 1024;                                    // 1k, 2^10;
    public final static int 								BYTES_CACH_INIT_SIZE_EXP = 10;
    public final static int                                 BYTES_CACH_MAX_SIZE  = 1024 * 128;                              // 128k, 2^17;
    public final static int 								BYTES_CACH_MAX_SIZE_EXP = 17;
    private final static ThreadLocal<SoftReference<byte[]>> bytesBufLocal        = new ThreadLocal<SoftReference<byte[]>>();

    public static void clearBytes() {try{__CLR4_1_10s2ts2tlusqjqrx.R.inc(36433);
        __CLR4_1_10s2ts2tlusqjqrx.R.inc(36434);bytesBufLocal.set(null);
    }finally{__CLR4_1_10s2ts2tlusqjqrx.R.flushNeeded();}}

    public static byte[] getBytes(int length) {try{__CLR4_1_10s2ts2tlusqjqrx.R.inc(36435);
        __CLR4_1_10s2ts2tlusqjqrx.R.inc(36436);SoftReference<byte[]> ref = bytesBufLocal.get();

        __CLR4_1_10s2ts2tlusqjqrx.R.inc(36437);if ((((ref == null)&&(__CLR4_1_10s2ts2tlusqjqrx.R.iget(36438)!=0|true))||(__CLR4_1_10s2ts2tlusqjqrx.R.iget(36439)==0&false))) {{
            __CLR4_1_10s2ts2tlusqjqrx.R.inc(36440);return allocateBytes(length);
        }

        }__CLR4_1_10s2ts2tlusqjqrx.R.inc(36441);byte[] bytes = ref.get();

        __CLR4_1_10s2ts2tlusqjqrx.R.inc(36442);if ((((bytes == null)&&(__CLR4_1_10s2ts2tlusqjqrx.R.iget(36443)!=0|true))||(__CLR4_1_10s2ts2tlusqjqrx.R.iget(36444)==0&false))) {{
            __CLR4_1_10s2ts2tlusqjqrx.R.inc(36445);return allocateBytes(length);
        }

        }__CLR4_1_10s2ts2tlusqjqrx.R.inc(36446);if ((((bytes.length < length)&&(__CLR4_1_10s2ts2tlusqjqrx.R.iget(36447)!=0|true))||(__CLR4_1_10s2ts2tlusqjqrx.R.iget(36448)==0&false))) {{
            __CLR4_1_10s2ts2tlusqjqrx.R.inc(36449);bytes = allocateBytes(length);
        }

        }__CLR4_1_10s2ts2tlusqjqrx.R.inc(36450);return bytes;
    }finally{__CLR4_1_10s2ts2tlusqjqrx.R.flushNeeded();}}

    private static byte[] allocateBytes(int length) {try{__CLR4_1_10s2ts2tlusqjqrx.R.inc(36451);
        __CLR4_1_10s2ts2tlusqjqrx.R.inc(36452);if((((length > BYTES_CACH_MAX_SIZE)&&(__CLR4_1_10s2ts2tlusqjqrx.R.iget(36453)!=0|true))||(__CLR4_1_10s2ts2tlusqjqrx.R.iget(36454)==0&false))) {{
            __CLR4_1_10s2ts2tlusqjqrx.R.inc(36455);return new byte[length];
        }

        }__CLR4_1_10s2ts2tlusqjqrx.R.inc(36456);int allocateLength = getAllocateLengthExp(BYTES_CACH_INIT_SIZE_EXP, BYTES_CACH_MAX_SIZE_EXP, length);
        __CLR4_1_10s2ts2tlusqjqrx.R.inc(36457);byte[] chars = new byte[allocateLength];
        __CLR4_1_10s2ts2tlusqjqrx.R.inc(36458);bytesBufLocal.set(new SoftReference<byte[]>(chars));
        __CLR4_1_10s2ts2tlusqjqrx.R.inc(36459);return chars;
    }finally{__CLR4_1_10s2ts2tlusqjqrx.R.flushNeeded();}}

}