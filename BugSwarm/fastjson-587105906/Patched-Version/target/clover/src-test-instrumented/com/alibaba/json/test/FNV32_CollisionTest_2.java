/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test;

import junit.framework.TestCase;

import java.text.NumberFormat;
import java.util.Random;

/**
 * Created by wenshao on 08/01/2017.
 */
public class FNV32_CollisionTest_2 extends TestCase {static class __CLR4_5_2224h224hlusvnjwf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,96176,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    char[] digLetters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_".toCharArray();
    //char[] digLetters = "0123456789".toCharArray();
    Random r = new Random();
    int[] powers = new int[10];

    {try{__CLR4_5_2224h224hlusvnjwf.R.inc(96065);
        __CLR4_5_2224h224hlusvnjwf.R.inc(96066);for (int i = 0; (((i < powers.length)&&(__CLR4_5_2224h224hlusvnjwf.R.iget(96067)!=0|true))||(__CLR4_5_2224h224hlusvnjwf.R.iget(96068)==0&false)); ++i) {{
            __CLR4_5_2224h224hlusvnjwf.R.inc(96069);powers[i] = (int) Math.pow(digLetters.length, i);
        }
    }}finally{__CLR4_5_2224h224hlusvnjwf.R.flushNeeded();}}


    public void test_fnv_hash_7() throws Exception {__CLR4_5_2224h224hlusvnjwf.R.globalSliceStart(getClass().getName(),96070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h6tpqj224m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2224h224hlusvnjwf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2224h224hlusvnjwf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.FNV32_CollisionTest_2.test_fnv_hash_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),96070,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h6tpqj224m() throws Exception{try{__CLR4_5_2224h224hlusvnjwf.R.inc(96070);
        __CLR4_5_2224h224hlusvnjwf.R.inc(96071);int COUNT = 1000 * 1000 * 1000;

        __CLR4_5_2224h224hlusvnjwf.R.inc(96072);long id_hash_64 = fnv_hash("name".toCharArray());
        __CLR4_5_2224h224hlusvnjwf.R.inc(96073);int id_hash_32 = (int) id_hash_64;
        __CLR4_5_2224h224hlusvnjwf.R.inc(96074);System.out.println("name : " + id_hash_32 + ", " + id_hash_64);

        __CLR4_5_2224h224hlusvnjwf.R.inc(96075);long v = 0;
        __CLR4_5_2224h224hlusvnjwf.R.inc(96076);long time = System.currentTimeMillis();
        __CLR4_5_2224h224hlusvnjwf.R.inc(96077);NumberFormat format = NumberFormat.getInstance();


        __CLR4_5_2224h224hlusvnjwf.R.inc(96078);final int len = 7;
        __CLR4_5_2224h224hlusvnjwf.R.inc(96079);char[] chars = new char[len];
        __CLR4_5_2224h224hlusvnjwf.R.inc(96080);for (int i0 = 0; (((i0 < digLetters.length)&&(__CLR4_5_2224h224hlusvnjwf.R.iget(96081)!=0|true))||(__CLR4_5_2224h224hlusvnjwf.R.iget(96082)==0&false)); ++i0) {{
            __CLR4_5_2224h224hlusvnjwf.R.inc(96083);long h0 = 0x811c9dc5;
            __CLR4_5_2224h224hlusvnjwf.R.inc(96084);char c0 = digLetters[i0];
            __CLR4_5_2224h224hlusvnjwf.R.inc(96085);h0 ^= c0;
            __CLR4_5_2224h224hlusvnjwf.R.inc(96086);h0 *= 0x1000193;

            __CLR4_5_2224h224hlusvnjwf.R.inc(96087);chars[0] = c0;
            __CLR4_5_2224h224hlusvnjwf.R.inc(96088);for (int i1 = 0; (((i1 < digLetters.length)&&(__CLR4_5_2224h224hlusvnjwf.R.iget(96089)!=0|true))||(__CLR4_5_2224h224hlusvnjwf.R.iget(96090)==0&false)); ++i1) {{
                __CLR4_5_2224h224hlusvnjwf.R.inc(96091);char c1 = digLetters[i1];
                __CLR4_5_2224h224hlusvnjwf.R.inc(96092);chars[1] = c1;

                __CLR4_5_2224h224hlusvnjwf.R.inc(96093);long h1 = h0;
                __CLR4_5_2224h224hlusvnjwf.R.inc(96094);h1 ^= c1;
                __CLR4_5_2224h224hlusvnjwf.R.inc(96095);h1 *= 0x1000193;

                __CLR4_5_2224h224hlusvnjwf.R.inc(96096);for (int i2 = 0; (((i2 < digLetters.length)&&(__CLR4_5_2224h224hlusvnjwf.R.iget(96097)!=0|true))||(__CLR4_5_2224h224hlusvnjwf.R.iget(96098)==0&false)); ++i2) {{
                    __CLR4_5_2224h224hlusvnjwf.R.inc(96099);char c2 = digLetters[i2];

                    __CLR4_5_2224h224hlusvnjwf.R.inc(96100);long h2 = h1;
                    __CLR4_5_2224h224hlusvnjwf.R.inc(96101);h2 ^= c2;
                    __CLR4_5_2224h224hlusvnjwf.R.inc(96102);h2 *= 0x1000193;

                    __CLR4_5_2224h224hlusvnjwf.R.inc(96103);chars[2] = c2;
                    __CLR4_5_2224h224hlusvnjwf.R.inc(96104);for (int i3 = 0; (((i3 < digLetters.length)&&(__CLR4_5_2224h224hlusvnjwf.R.iget(96105)!=0|true))||(__CLR4_5_2224h224hlusvnjwf.R.iget(96106)==0&false)); ++i3) {{
                        __CLR4_5_2224h224hlusvnjwf.R.inc(96107);char c3 = digLetters[i3];

                        __CLR4_5_2224h224hlusvnjwf.R.inc(96108);long h3 = h2;
                        __CLR4_5_2224h224hlusvnjwf.R.inc(96109);h3 ^= c3;
                        __CLR4_5_2224h224hlusvnjwf.R.inc(96110);h3 *= 0x1000193;

                        __CLR4_5_2224h224hlusvnjwf.R.inc(96111);chars[3] = c3;
                        __CLR4_5_2224h224hlusvnjwf.R.inc(96112);for (int i4 = 0; (((i4 < digLetters.length)&&(__CLR4_5_2224h224hlusvnjwf.R.iget(96113)!=0|true))||(__CLR4_5_2224h224hlusvnjwf.R.iget(96114)==0&false)); ++i4) {{
                            __CLR4_5_2224h224hlusvnjwf.R.inc(96115);char c4 = digLetters[i4];

                            __CLR4_5_2224h224hlusvnjwf.R.inc(96116);long h4 = h3;
                            __CLR4_5_2224h224hlusvnjwf.R.inc(96117);h4 ^= c4;
                            __CLR4_5_2224h224hlusvnjwf.R.inc(96118);h4 *= 0x1000193;

                            __CLR4_5_2224h224hlusvnjwf.R.inc(96119);chars[4] = c4;
                            __CLR4_5_2224h224hlusvnjwf.R.inc(96120);for (int i5 = 0; (((i5 < digLetters.length)&&(__CLR4_5_2224h224hlusvnjwf.R.iget(96121)!=0|true))||(__CLR4_5_2224h224hlusvnjwf.R.iget(96122)==0&false)); ++i5) {{
                                __CLR4_5_2224h224hlusvnjwf.R.inc(96123);char c5 = digLetters[i5];
                                __CLR4_5_2224h224hlusvnjwf.R.inc(96124);chars[5] = c5;

                                __CLR4_5_2224h224hlusvnjwf.R.inc(96125);long h5 = h4;
                                __CLR4_5_2224h224hlusvnjwf.R.inc(96126);h5 ^= c5;
                                __CLR4_5_2224h224hlusvnjwf.R.inc(96127);h5 *= 0x1000193;

                                __CLR4_5_2224h224hlusvnjwf.R.inc(96128);for (int i6 = 0; (((i6 < digLetters.length)&&(__CLR4_5_2224h224hlusvnjwf.R.iget(96129)!=0|true))||(__CLR4_5_2224h224hlusvnjwf.R.iget(96130)==0&false)); ++i6) {{
                                    __CLR4_5_2224h224hlusvnjwf.R.inc(96131);char c6 = digLetters[i6];

                                    __CLR4_5_2224h224hlusvnjwf.R.inc(96132);long h6 = h5;
                                    __CLR4_5_2224h224hlusvnjwf.R.inc(96133);h6 ^= c6;
                                    __CLR4_5_2224h224hlusvnjwf.R.inc(96134);h6 *= 0x1000193;

                                    __CLR4_5_2224h224hlusvnjwf.R.inc(96135);chars[6] = c6;

                                    __CLR4_5_2224h224hlusvnjwf.R.inc(96136);v++;
                                    __CLR4_5_2224h224hlusvnjwf.R.inc(96137);if ((((h6 == id_hash_64)&&(__CLR4_5_2224h224hlusvnjwf.R.iget(96138)!=0|true))||(__CLR4_5_2224h224hlusvnjwf.R.iget(96139)==0&false))) {{
                                        __CLR4_5_2224h224hlusvnjwf.R.inc(96140);int hash_32 = (int) h6;
                                        __CLR4_5_2224h224hlusvnjwf.R.inc(96141);System.out.println("collision : " + build(v, len) + "\uff0c hash64 : " + h6 + ", hash 32 " + hash_32);
                                        __CLR4_5_2224h224hlusvnjwf.R.inc(96142);break;
                                    }

                                    }__CLR4_5_2224h224hlusvnjwf.R.inc(96143);if ((((v != 0 && v % (1000 * 1000 * 1000) == 0)&&(__CLR4_5_2224h224hlusvnjwf.R.iget(96144)!=0|true))||(__CLR4_5_2224h224hlusvnjwf.R.iget(96145)==0&false))) {{
                                        __CLR4_5_2224h224hlusvnjwf.R.inc(96146);long now = System.currentTimeMillis();
                                        __CLR4_5_2224h224hlusvnjwf.R.inc(96147);long millis = now - time;
                                        __CLR4_5_2224h224hlusvnjwf.R.inc(96148);time = now;
                                        __CLR4_5_2224h224hlusvnjwf.R.inc(96149);System.out.println("millis : " + millis + ", " + format.format(v));
                                    }
                                }}
                            }}
                        }}
                    }}
                }}
            }}
        }}


        }__CLR4_5_2224h224hlusvnjwf.R.inc(96150);System.out.println("end : " + len);

    }finally{__CLR4_5_2224h224hlusvnjwf.R.flushNeeded();}}

    String build(long v, int len) {try{__CLR4_5_2224h224hlusvnjwf.R.inc(96151);
        __CLR4_5_2224h224hlusvnjwf.R.inc(96152);char[] chars = new char[len];
        __CLR4_5_2224h224hlusvnjwf.R.inc(96153);for (int i = 0; (((i < chars.length)&&(__CLR4_5_2224h224hlusvnjwf.R.iget(96154)!=0|true))||(__CLR4_5_2224h224hlusvnjwf.R.iget(96155)==0&false)); ++i) {{
            __CLR4_5_2224h224hlusvnjwf.R.inc(96156);int power = powers[chars.length - i - 1];
            __CLR4_5_2224h224hlusvnjwf.R.inc(96157);int d = (int) ((v / power) % digLetters.length);
            __CLR4_5_2224h224hlusvnjwf.R.inc(96158);chars[i] = digLetters[d];
        }

        }__CLR4_5_2224h224hlusvnjwf.R.inc(96159);return new String(chars);
    }finally{__CLR4_5_2224h224hlusvnjwf.R.flushNeeded();}}

    static long fnv_hash(char[] chars) {try{__CLR4_5_2224h224hlusvnjwf.R.inc(96160);
        __CLR4_5_2224h224hlusvnjwf.R.inc(96161);long hash = 0x811c9dc5;
        __CLR4_5_2224h224hlusvnjwf.R.inc(96162);for (int i = 0; (((i < chars.length)&&(__CLR4_5_2224h224hlusvnjwf.R.iget(96163)!=0|true))||(__CLR4_5_2224h224hlusvnjwf.R.iget(96164)==0&false)); ++i) {{
            __CLR4_5_2224h224hlusvnjwf.R.inc(96165);char c = chars[i];
            __CLR4_5_2224h224hlusvnjwf.R.inc(96166);hash ^= c;
            __CLR4_5_2224h224hlusvnjwf.R.inc(96167);hash *= 0x1000193;
        }
        }__CLR4_5_2224h224hlusvnjwf.R.inc(96168);return hash;
    }finally{__CLR4_5_2224h224hlusvnjwf.R.flushNeeded();}}

    static long hash(char[] chars) {try{__CLR4_5_2224h224hlusvnjwf.R.inc(96169);
        __CLR4_5_2224h224hlusvnjwf.R.inc(96170);long hash = 0;
        __CLR4_5_2224h224hlusvnjwf.R.inc(96171);for (int i = 0; (((i < chars.length)&&(__CLR4_5_2224h224hlusvnjwf.R.iget(96172)!=0|true))||(__CLR4_5_2224h224hlusvnjwf.R.iget(96173)==0&false)); ++i) {{
            __CLR4_5_2224h224hlusvnjwf.R.inc(96174);hash = 31 * hash + chars[i];
        }
        }__CLR4_5_2224h224hlusvnjwf.R.inc(96175);return hash;
    }finally{__CLR4_5_2224h224hlusvnjwf.R.flushNeeded();}}
}
