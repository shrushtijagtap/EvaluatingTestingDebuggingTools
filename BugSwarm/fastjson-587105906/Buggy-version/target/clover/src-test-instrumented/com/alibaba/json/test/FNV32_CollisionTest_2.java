/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test;

import junit.framework.TestCase;

import java.text.NumberFormat;
import java.util.Random;

/**
 * Created by wenshao on 08/01/2017.
 */
public class FNV32_CollisionTest_2 extends TestCase {static class __CLR4_1_10224s224sluszwhts{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,96187,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    char[] digLetters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_".toCharArray();
    //char[] digLetters = "0123456789".toCharArray();
    Random r = new Random();
    int[] powers = new int[10];

    {try{__CLR4_1_10224s224sluszwhts.R.inc(96076);
        __CLR4_1_10224s224sluszwhts.R.inc(96077);for (int i = 0; (((i < powers.length)&&(__CLR4_1_10224s224sluszwhts.R.iget(96078)!=0|true))||(__CLR4_1_10224s224sluszwhts.R.iget(96079)==0&false)); ++i) {{
            __CLR4_1_10224s224sluszwhts.R.inc(96080);powers[i] = (int) Math.pow(digLetters.length, i);
        }
    }}finally{__CLR4_1_10224s224sluszwhts.R.flushNeeded();}}


    public void test_fnv_hash_7() throws Exception {__CLR4_1_10224s224sluszwhts.R.globalSliceStart(getClass().getName(),96081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10h6tpqj224x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10224s224sluszwhts.R.rethrow($CLV_t2$);}finally{__CLR4_1_10224s224sluszwhts.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.FNV32_CollisionTest_2.test_fnv_hash_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),96081,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10h6tpqj224x() throws Exception{try{__CLR4_1_10224s224sluszwhts.R.inc(96081);
        __CLR4_1_10224s224sluszwhts.R.inc(96082);int COUNT = 1000 * 1000 * 1000;

        __CLR4_1_10224s224sluszwhts.R.inc(96083);long id_hash_64 = fnv_hash("name".toCharArray());
        __CLR4_1_10224s224sluszwhts.R.inc(96084);int id_hash_32 = (int) id_hash_64;
        __CLR4_1_10224s224sluszwhts.R.inc(96085);System.out.println("name : " + id_hash_32 + ", " + id_hash_64);

        __CLR4_1_10224s224sluszwhts.R.inc(96086);long v = 0;
        __CLR4_1_10224s224sluszwhts.R.inc(96087);long time = System.currentTimeMillis();
        __CLR4_1_10224s224sluszwhts.R.inc(96088);NumberFormat format = NumberFormat.getInstance();


        __CLR4_1_10224s224sluszwhts.R.inc(96089);final int len = 7;
        __CLR4_1_10224s224sluszwhts.R.inc(96090);char[] chars = new char[len];
        __CLR4_1_10224s224sluszwhts.R.inc(96091);for (int i0 = 0; (((i0 < digLetters.length)&&(__CLR4_1_10224s224sluszwhts.R.iget(96092)!=0|true))||(__CLR4_1_10224s224sluszwhts.R.iget(96093)==0&false)); ++i0) {{
            __CLR4_1_10224s224sluszwhts.R.inc(96094);long h0 = 0x811c9dc5;
            __CLR4_1_10224s224sluszwhts.R.inc(96095);char c0 = digLetters[i0];
            __CLR4_1_10224s224sluszwhts.R.inc(96096);h0 ^= c0;
            __CLR4_1_10224s224sluszwhts.R.inc(96097);h0 *= 0x1000193;

            __CLR4_1_10224s224sluszwhts.R.inc(96098);chars[0] = c0;
            __CLR4_1_10224s224sluszwhts.R.inc(96099);for (int i1 = 0; (((i1 < digLetters.length)&&(__CLR4_1_10224s224sluszwhts.R.iget(96100)!=0|true))||(__CLR4_1_10224s224sluszwhts.R.iget(96101)==0&false)); ++i1) {{
                __CLR4_1_10224s224sluszwhts.R.inc(96102);char c1 = digLetters[i1];
                __CLR4_1_10224s224sluszwhts.R.inc(96103);chars[1] = c1;

                __CLR4_1_10224s224sluszwhts.R.inc(96104);long h1 = h0;
                __CLR4_1_10224s224sluszwhts.R.inc(96105);h1 ^= c1;
                __CLR4_1_10224s224sluszwhts.R.inc(96106);h1 *= 0x1000193;

                __CLR4_1_10224s224sluszwhts.R.inc(96107);for (int i2 = 0; (((i2 < digLetters.length)&&(__CLR4_1_10224s224sluszwhts.R.iget(96108)!=0|true))||(__CLR4_1_10224s224sluszwhts.R.iget(96109)==0&false)); ++i2) {{
                    __CLR4_1_10224s224sluszwhts.R.inc(96110);char c2 = digLetters[i2];

                    __CLR4_1_10224s224sluszwhts.R.inc(96111);long h2 = h1;
                    __CLR4_1_10224s224sluszwhts.R.inc(96112);h2 ^= c2;
                    __CLR4_1_10224s224sluszwhts.R.inc(96113);h2 *= 0x1000193;

                    __CLR4_1_10224s224sluszwhts.R.inc(96114);chars[2] = c2;
                    __CLR4_1_10224s224sluszwhts.R.inc(96115);for (int i3 = 0; (((i3 < digLetters.length)&&(__CLR4_1_10224s224sluszwhts.R.iget(96116)!=0|true))||(__CLR4_1_10224s224sluszwhts.R.iget(96117)==0&false)); ++i3) {{
                        __CLR4_1_10224s224sluszwhts.R.inc(96118);char c3 = digLetters[i3];

                        __CLR4_1_10224s224sluszwhts.R.inc(96119);long h3 = h2;
                        __CLR4_1_10224s224sluszwhts.R.inc(96120);h3 ^= c3;
                        __CLR4_1_10224s224sluszwhts.R.inc(96121);h3 *= 0x1000193;

                        __CLR4_1_10224s224sluszwhts.R.inc(96122);chars[3] = c3;
                        __CLR4_1_10224s224sluszwhts.R.inc(96123);for (int i4 = 0; (((i4 < digLetters.length)&&(__CLR4_1_10224s224sluszwhts.R.iget(96124)!=0|true))||(__CLR4_1_10224s224sluszwhts.R.iget(96125)==0&false)); ++i4) {{
                            __CLR4_1_10224s224sluszwhts.R.inc(96126);char c4 = digLetters[i4];

                            __CLR4_1_10224s224sluszwhts.R.inc(96127);long h4 = h3;
                            __CLR4_1_10224s224sluszwhts.R.inc(96128);h4 ^= c4;
                            __CLR4_1_10224s224sluszwhts.R.inc(96129);h4 *= 0x1000193;

                            __CLR4_1_10224s224sluszwhts.R.inc(96130);chars[4] = c4;
                            __CLR4_1_10224s224sluszwhts.R.inc(96131);for (int i5 = 0; (((i5 < digLetters.length)&&(__CLR4_1_10224s224sluszwhts.R.iget(96132)!=0|true))||(__CLR4_1_10224s224sluszwhts.R.iget(96133)==0&false)); ++i5) {{
                                __CLR4_1_10224s224sluszwhts.R.inc(96134);char c5 = digLetters[i5];
                                __CLR4_1_10224s224sluszwhts.R.inc(96135);chars[5] = c5;

                                __CLR4_1_10224s224sluszwhts.R.inc(96136);long h5 = h4;
                                __CLR4_1_10224s224sluszwhts.R.inc(96137);h5 ^= c5;
                                __CLR4_1_10224s224sluszwhts.R.inc(96138);h5 *= 0x1000193;

                                __CLR4_1_10224s224sluszwhts.R.inc(96139);for (int i6 = 0; (((i6 < digLetters.length)&&(__CLR4_1_10224s224sluszwhts.R.iget(96140)!=0|true))||(__CLR4_1_10224s224sluszwhts.R.iget(96141)==0&false)); ++i6) {{
                                    __CLR4_1_10224s224sluszwhts.R.inc(96142);char c6 = digLetters[i6];

                                    __CLR4_1_10224s224sluszwhts.R.inc(96143);long h6 = h5;
                                    __CLR4_1_10224s224sluszwhts.R.inc(96144);h6 ^= c6;
                                    __CLR4_1_10224s224sluszwhts.R.inc(96145);h6 *= 0x1000193;

                                    __CLR4_1_10224s224sluszwhts.R.inc(96146);chars[6] = c6;

                                    __CLR4_1_10224s224sluszwhts.R.inc(96147);v++;
                                    __CLR4_1_10224s224sluszwhts.R.inc(96148);if ((((h6 == id_hash_64)&&(__CLR4_1_10224s224sluszwhts.R.iget(96149)!=0|true))||(__CLR4_1_10224s224sluszwhts.R.iget(96150)==0&false))) {{
                                        __CLR4_1_10224s224sluszwhts.R.inc(96151);int hash_32 = (int) h6;
                                        __CLR4_1_10224s224sluszwhts.R.inc(96152);System.out.println("collision : " + build(v, len) + "\uff0c hash64 : " + h6 + ", hash 32 " + hash_32);
                                        __CLR4_1_10224s224sluszwhts.R.inc(96153);break;
                                    }

                                    }__CLR4_1_10224s224sluszwhts.R.inc(96154);if ((((v != 0 && v % (1000 * 1000 * 1000) == 0)&&(__CLR4_1_10224s224sluszwhts.R.iget(96155)!=0|true))||(__CLR4_1_10224s224sluszwhts.R.iget(96156)==0&false))) {{
                                        __CLR4_1_10224s224sluszwhts.R.inc(96157);long now = System.currentTimeMillis();
                                        __CLR4_1_10224s224sluszwhts.R.inc(96158);long millis = now - time;
                                        __CLR4_1_10224s224sluszwhts.R.inc(96159);time = now;
                                        __CLR4_1_10224s224sluszwhts.R.inc(96160);System.out.println("millis : " + millis + ", " + format.format(v));
                                    }
                                }}
                            }}
                        }}
                    }}
                }}
            }}
        }}


        }__CLR4_1_10224s224sluszwhts.R.inc(96161);System.out.println("end : " + len);

    }finally{__CLR4_1_10224s224sluszwhts.R.flushNeeded();}}

    String build(long v, int len) {try{__CLR4_1_10224s224sluszwhts.R.inc(96162);
        __CLR4_1_10224s224sluszwhts.R.inc(96163);char[] chars = new char[len];
        __CLR4_1_10224s224sluszwhts.R.inc(96164);for (int i = 0; (((i < chars.length)&&(__CLR4_1_10224s224sluszwhts.R.iget(96165)!=0|true))||(__CLR4_1_10224s224sluszwhts.R.iget(96166)==0&false)); ++i) {{
            __CLR4_1_10224s224sluszwhts.R.inc(96167);int power = powers[chars.length - i - 1];
            __CLR4_1_10224s224sluszwhts.R.inc(96168);int d = (int) ((v / power) % digLetters.length);
            __CLR4_1_10224s224sluszwhts.R.inc(96169);chars[i] = digLetters[d];
        }

        }__CLR4_1_10224s224sluszwhts.R.inc(96170);return new String(chars);
    }finally{__CLR4_1_10224s224sluszwhts.R.flushNeeded();}}

    static long fnv_hash(char[] chars) {try{__CLR4_1_10224s224sluszwhts.R.inc(96171);
        __CLR4_1_10224s224sluszwhts.R.inc(96172);long hash = 0x811c9dc5;
        __CLR4_1_10224s224sluszwhts.R.inc(96173);for (int i = 0; (((i < chars.length)&&(__CLR4_1_10224s224sluszwhts.R.iget(96174)!=0|true))||(__CLR4_1_10224s224sluszwhts.R.iget(96175)==0&false)); ++i) {{
            __CLR4_1_10224s224sluszwhts.R.inc(96176);char c = chars[i];
            __CLR4_1_10224s224sluszwhts.R.inc(96177);hash ^= c;
            __CLR4_1_10224s224sluszwhts.R.inc(96178);hash *= 0x1000193;
        }
        }__CLR4_1_10224s224sluszwhts.R.inc(96179);return hash;
    }finally{__CLR4_1_10224s224sluszwhts.R.flushNeeded();}}

    static long hash(char[] chars) {try{__CLR4_1_10224s224sluszwhts.R.inc(96180);
        __CLR4_1_10224s224sluszwhts.R.inc(96181);long hash = 0;
        __CLR4_1_10224s224sluszwhts.R.inc(96182);for (int i = 0; (((i < chars.length)&&(__CLR4_1_10224s224sluszwhts.R.iget(96183)!=0|true))||(__CLR4_1_10224s224sluszwhts.R.iget(96184)==0&false)); ++i) {{
            __CLR4_1_10224s224sluszwhts.R.inc(96185);hash = 31 * hash + chars[i];
        }
        }__CLR4_1_10224s224sluszwhts.R.inc(96186);return hash;
    }finally{__CLR4_1_10224s224sluszwhts.R.flushNeeded();}}
}
