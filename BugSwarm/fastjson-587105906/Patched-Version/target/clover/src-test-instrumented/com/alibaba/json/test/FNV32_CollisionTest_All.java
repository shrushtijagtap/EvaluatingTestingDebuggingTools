/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test;

import junit.framework.TestCase;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.text.NumberFormat;
import java.util.BitSet;
import java.util.Random;

/**
 * Created by wenshao on 08/01/2017.
 */
public class FNV32_CollisionTest_All extends TestCase {static class __CLR4_5_2227k227klusvnjx3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,96249,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    char[] digLetters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_".toCharArray();
    //char[] digLetters = "0123456789".toCharArray();
    Random r = new Random();
    int[] powers = new int[10];

    {try{__CLR4_5_2227k227klusvnjx3.R.inc(96176);
        __CLR4_5_2227k227klusvnjx3.R.inc(96177);for (int i = 0; (((i < powers.length)&&(__CLR4_5_2227k227klusvnjx3.R.iget(96178)!=0|true))||(__CLR4_5_2227k227klusvnjx3.R.iget(96179)==0&false)); ++i) {{
            __CLR4_5_2227k227klusvnjx3.R.inc(96180);powers[i] = (int) Math.pow(digLetters.length, i);
        }
    }}finally{__CLR4_5_2227k227klusvnjx3.R.flushNeeded();}}

    private BitSet[] bits = new BitSet[16];

    private File file = new File("/Users/wenshao/Downloads/fnv/hash.bin");
    FileOutputStream out;

    protected void setUp() throws Exception {try{__CLR4_5_2227k227klusvnjx3.R.inc(96181);
        __CLR4_5_2227k227klusvnjx3.R.inc(96182);out = new FileOutputStream(file);

        __CLR4_5_2227k227klusvnjx3.R.inc(96183);for (int i = 0; (((i < bits.length)&&(__CLR4_5_2227k227klusvnjx3.R.iget(96184)!=0|true))||(__CLR4_5_2227k227klusvnjx3.R.iget(96185)==0&false)); ++i) {{
            __CLR4_5_2227k227klusvnjx3.R.inc(96186);bits[i] = new BitSet(Integer.MAX_VALUE);
        }
    }}finally{__CLR4_5_2227k227klusvnjx3.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_5_2227k227klusvnjx3.R.inc(96187);
        __CLR4_5_2227k227klusvnjx3.R.inc(96188);out.close();
    }finally{__CLR4_5_2227k227klusvnjx3.R.flushNeeded();}}

    public void test_fnv_hash() throws Exception {__CLR4_5_2227k227klusvnjx3.R.globalSliceStart(getClass().getName(),96189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2brbokt227x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2227k227klusvnjx3.R.rethrow($CLV_t2$);}finally{__CLR4_5_2227k227klusvnjx3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.FNV32_CollisionTest_All.test_fnv_hash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),96189,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2brbokt227x() throws Exception{try{__CLR4_5_2227k227klusvnjx3.R.inc(96189);
        __CLR4_5_2227k227klusvnjx3.R.inc(96190);int collisionCount = 0;

        __CLR4_5_2227k227klusvnjx3.R.inc(96191);long id_hash_64 = fnv_hash("name".toCharArray());
        __CLR4_5_2227k227klusvnjx3.R.inc(96192);int id_hash_32 = Math.abs((int) id_hash_64);
        //bitset.set(id_hash_32);

        __CLR4_5_2227k227klusvnjx3.R.inc(96193);long v = 0;
        __CLR4_5_2227k227klusvnjx3.R.inc(96194);long time = System.currentTimeMillis();
        __CLR4_5_2227k227klusvnjx3.R.inc(96195);NumberFormat format = NumberFormat.getInstance();

        __CLR4_5_2227k227klusvnjx3.R.inc(96196);byte[] b = new byte[8];
        __CLR4_5_2227k227klusvnjx3.R.inc(96197);for (int len = 1; (((len <= 5)&&(__CLR4_5_2227k227klusvnjx3.R.iget(96198)!=0|true))||(__CLR4_5_2227k227klusvnjx3.R.iget(96199)==0&false)); ++len){{
            __CLR4_5_2227k227klusvnjx3.R.inc(96200);char[] chars = new char[len];
            __CLR4_5_2227k227klusvnjx3.R.inc(96201);long n = (long) Math.pow(digLetters.length, chars.length);

            __CLR4_5_2227k227klusvnjx3.R.inc(96202);for (; (((v < n)&&(__CLR4_5_2227k227klusvnjx3.R.iget(96203)!=0|true))||(__CLR4_5_2227k227klusvnjx3.R.iget(96204)==0&false)); ++v) {{
                __CLR4_5_2227k227klusvnjx3.R.inc(96205);long hash = 0xcbf29ce484222325L;
                __CLR4_5_2227k227klusvnjx3.R.inc(96206);for (int i = 0; (((i < chars.length)&&(__CLR4_5_2227k227klusvnjx3.R.iget(96207)!=0|true))||(__CLR4_5_2227k227klusvnjx3.R.iget(96208)==0&false)); ++i) {{
                    __CLR4_5_2227k227klusvnjx3.R.inc(96209);int power = powers[chars.length - i - 1];
                    __CLR4_5_2227k227klusvnjx3.R.inc(96210);int d = (int) ((v / power) % digLetters.length);
                    __CLR4_5_2227k227klusvnjx3.R.inc(96211);char c = digLetters[d];

                    __CLR4_5_2227k227klusvnjx3.R.inc(96212);hash ^= c;
                    __CLR4_5_2227k227klusvnjx3.R.inc(96213);hash *= 0x100000001b3L;
                }
                }__CLR4_5_2227k227klusvnjx3.R.inc(96214);b[7] = (byte) (hash       );
                __CLR4_5_2227k227klusvnjx3.R.inc(96215);b[6] = (byte) (hash >>>  8);
                __CLR4_5_2227k227klusvnjx3.R.inc(96216);b[5] = (byte) (hash >>> 16);
                __CLR4_5_2227k227klusvnjx3.R.inc(96217);b[4] = (byte) (hash >>> 24);
                __CLR4_5_2227k227klusvnjx3.R.inc(96218);b[3] = (byte) (hash >>> 32);
                __CLR4_5_2227k227klusvnjx3.R.inc(96219);b[2] = (byte) (hash >>> 40);
                __CLR4_5_2227k227klusvnjx3.R.inc(96220);b[1] = (byte) (hash >>> 48);
                __CLR4_5_2227k227klusvnjx3.R.inc(96221);b[0] = (byte) (hash >>> 56);
                __CLR4_5_2227k227klusvnjx3.R.inc(96222);out.write(b);

                __CLR4_5_2227k227klusvnjx3.R.inc(96223);if ((((v != 0 && v % (1000 * 1000 * 10) == 0)&&(__CLR4_5_2227k227klusvnjx3.R.iget(96224)!=0|true))||(__CLR4_5_2227k227klusvnjx3.R.iget(96225)==0&false))) {{
                    __CLR4_5_2227k227klusvnjx3.R.inc(96226);long now = System.currentTimeMillis();
                    __CLR4_5_2227k227klusvnjx3.R.inc(96227);long millis = now - time;
                    __CLR4_5_2227k227klusvnjx3.R.inc(96228);time = now;
                    __CLR4_5_2227k227klusvnjx3.R.inc(96229);System.out.println("millis : " + millis + ", collision " + format.format(collisionCount) + ", " + format.format(v));
                }
            }}

            }__CLR4_5_2227k227klusvnjx3.R.inc(96230);System.out.println("end : " + len);
        }
    }}finally{__CLR4_5_2227k227klusvnjx3.R.flushNeeded();}}

    String build(long v, int len) {try{__CLR4_5_2227k227klusvnjx3.R.inc(96231);
        __CLR4_5_2227k227klusvnjx3.R.inc(96232);char[] chars = new char[len];
        __CLR4_5_2227k227klusvnjx3.R.inc(96233);for (int i = 0; (((i < chars.length)&&(__CLR4_5_2227k227klusvnjx3.R.iget(96234)!=0|true))||(__CLR4_5_2227k227klusvnjx3.R.iget(96235)==0&false)); ++i) {{
            __CLR4_5_2227k227klusvnjx3.R.inc(96236);int power = powers[chars.length - i - 1];
            __CLR4_5_2227k227klusvnjx3.R.inc(96237);int d = (int) ((v / power) % digLetters.length);
            __CLR4_5_2227k227klusvnjx3.R.inc(96238);chars[i] = digLetters[d];
        }

        }__CLR4_5_2227k227klusvnjx3.R.inc(96239);return new String(chars);
    }finally{__CLR4_5_2227k227klusvnjx3.R.flushNeeded();}}

    static long fnv_hash(char[] chars) {try{__CLR4_5_2227k227klusvnjx3.R.inc(96240);
        __CLR4_5_2227k227klusvnjx3.R.inc(96241);long hash = 0xcbf29ce484222325L;
        __CLR4_5_2227k227klusvnjx3.R.inc(96242);for (int i = 0; (((i < chars.length)&&(__CLR4_5_2227k227klusvnjx3.R.iget(96243)!=0|true))||(__CLR4_5_2227k227klusvnjx3.R.iget(96244)==0&false)); ++i) {{
            __CLR4_5_2227k227klusvnjx3.R.inc(96245);char c = chars[i];
            __CLR4_5_2227k227klusvnjx3.R.inc(96246);hash ^= c;
            __CLR4_5_2227k227klusvnjx3.R.inc(96247);hash *= 0x100000001b3L;
        }
        }__CLR4_5_2227k227klusvnjx3.R.inc(96248);return hash;
    }finally{__CLR4_5_2227k227klusvnjx3.R.flushNeeded();}}
}
