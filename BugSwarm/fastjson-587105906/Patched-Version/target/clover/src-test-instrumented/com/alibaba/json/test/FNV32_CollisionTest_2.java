/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test;

import junit.framework.TestCase;

import java.text.NumberFormat;
import java.util.Random;

/**
 * Created by wenshao on 08/01/2017.
 */
public class FNV32_CollisionTest_2 extends TestCase {static class __CLR4_5_221692169lusyjwf7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,94944,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    char[] digLetters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_".toCharArray();
    //char[] digLetters = "0123456789".toCharArray();
    Random r = new Random();
    int[] powers = new int[10];

    {try{__CLR4_5_221692169lusyjwf7.R.inc(94833);
        __CLR4_5_221692169lusyjwf7.R.inc(94834);for (int i = 0; (((i < powers.length)&&(__CLR4_5_221692169lusyjwf7.R.iget(94835)!=0|true))||(__CLR4_5_221692169lusyjwf7.R.iget(94836)==0&false)); ++i) {{
            __CLR4_5_221692169lusyjwf7.R.inc(94837);powers[i] = (int) Math.pow(digLetters.length, i);
        }
    }}finally{__CLR4_5_221692169lusyjwf7.R.flushNeeded();}}


    public void test_fnv_hash_7() throws Exception {__CLR4_5_221692169lusyjwf7.R.globalSliceStart(getClass().getName(),94838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h6tpqj216e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_221692169lusyjwf7.R.rethrow($CLV_t2$);}finally{__CLR4_5_221692169lusyjwf7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.FNV32_CollisionTest_2.test_fnv_hash_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),94838,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h6tpqj216e() throws Exception{try{__CLR4_5_221692169lusyjwf7.R.inc(94838);
        __CLR4_5_221692169lusyjwf7.R.inc(94839);int COUNT = 1000 * 1000 * 1000;

        __CLR4_5_221692169lusyjwf7.R.inc(94840);long id_hash_64 = fnv_hash("name".toCharArray());
        __CLR4_5_221692169lusyjwf7.R.inc(94841);int id_hash_32 = (int) id_hash_64;
        __CLR4_5_221692169lusyjwf7.R.inc(94842);System.out.println("name : " + id_hash_32 + ", " + id_hash_64);

        __CLR4_5_221692169lusyjwf7.R.inc(94843);long v = 0;
        __CLR4_5_221692169lusyjwf7.R.inc(94844);long time = System.currentTimeMillis();
        __CLR4_5_221692169lusyjwf7.R.inc(94845);NumberFormat format = NumberFormat.getInstance();


        __CLR4_5_221692169lusyjwf7.R.inc(94846);final int len = 7;
        __CLR4_5_221692169lusyjwf7.R.inc(94847);char[] chars = new char[len];
        __CLR4_5_221692169lusyjwf7.R.inc(94848);for (int i0 = 0; (((i0 < digLetters.length)&&(__CLR4_5_221692169lusyjwf7.R.iget(94849)!=0|true))||(__CLR4_5_221692169lusyjwf7.R.iget(94850)==0&false)); ++i0) {{
            __CLR4_5_221692169lusyjwf7.R.inc(94851);long h0 = 0x811c9dc5;
            __CLR4_5_221692169lusyjwf7.R.inc(94852);char c0 = digLetters[i0];
            __CLR4_5_221692169lusyjwf7.R.inc(94853);h0 ^= c0;
            __CLR4_5_221692169lusyjwf7.R.inc(94854);h0 *= 0x1000193;

            __CLR4_5_221692169lusyjwf7.R.inc(94855);chars[0] = c0;
            __CLR4_5_221692169lusyjwf7.R.inc(94856);for (int i1 = 0; (((i1 < digLetters.length)&&(__CLR4_5_221692169lusyjwf7.R.iget(94857)!=0|true))||(__CLR4_5_221692169lusyjwf7.R.iget(94858)==0&false)); ++i1) {{
                __CLR4_5_221692169lusyjwf7.R.inc(94859);char c1 = digLetters[i1];
                __CLR4_5_221692169lusyjwf7.R.inc(94860);chars[1] = c1;

                __CLR4_5_221692169lusyjwf7.R.inc(94861);long h1 = h0;
                __CLR4_5_221692169lusyjwf7.R.inc(94862);h1 ^= c1;
                __CLR4_5_221692169lusyjwf7.R.inc(94863);h1 *= 0x1000193;

                __CLR4_5_221692169lusyjwf7.R.inc(94864);for (int i2 = 0; (((i2 < digLetters.length)&&(__CLR4_5_221692169lusyjwf7.R.iget(94865)!=0|true))||(__CLR4_5_221692169lusyjwf7.R.iget(94866)==0&false)); ++i2) {{
                    __CLR4_5_221692169lusyjwf7.R.inc(94867);char c2 = digLetters[i2];

                    __CLR4_5_221692169lusyjwf7.R.inc(94868);long h2 = h1;
                    __CLR4_5_221692169lusyjwf7.R.inc(94869);h2 ^= c2;
                    __CLR4_5_221692169lusyjwf7.R.inc(94870);h2 *= 0x1000193;

                    __CLR4_5_221692169lusyjwf7.R.inc(94871);chars[2] = c2;
                    __CLR4_5_221692169lusyjwf7.R.inc(94872);for (int i3 = 0; (((i3 < digLetters.length)&&(__CLR4_5_221692169lusyjwf7.R.iget(94873)!=0|true))||(__CLR4_5_221692169lusyjwf7.R.iget(94874)==0&false)); ++i3) {{
                        __CLR4_5_221692169lusyjwf7.R.inc(94875);char c3 = digLetters[i3];

                        __CLR4_5_221692169lusyjwf7.R.inc(94876);long h3 = h2;
                        __CLR4_5_221692169lusyjwf7.R.inc(94877);h3 ^= c3;
                        __CLR4_5_221692169lusyjwf7.R.inc(94878);h3 *= 0x1000193;

                        __CLR4_5_221692169lusyjwf7.R.inc(94879);chars[3] = c3;
                        __CLR4_5_221692169lusyjwf7.R.inc(94880);for (int i4 = 0; (((i4 < digLetters.length)&&(__CLR4_5_221692169lusyjwf7.R.iget(94881)!=0|true))||(__CLR4_5_221692169lusyjwf7.R.iget(94882)==0&false)); ++i4) {{
                            __CLR4_5_221692169lusyjwf7.R.inc(94883);char c4 = digLetters[i4];

                            __CLR4_5_221692169lusyjwf7.R.inc(94884);long h4 = h3;
                            __CLR4_5_221692169lusyjwf7.R.inc(94885);h4 ^= c4;
                            __CLR4_5_221692169lusyjwf7.R.inc(94886);h4 *= 0x1000193;

                            __CLR4_5_221692169lusyjwf7.R.inc(94887);chars[4] = c4;
                            __CLR4_5_221692169lusyjwf7.R.inc(94888);for (int i5 = 0; (((i5 < digLetters.length)&&(__CLR4_5_221692169lusyjwf7.R.iget(94889)!=0|true))||(__CLR4_5_221692169lusyjwf7.R.iget(94890)==0&false)); ++i5) {{
                                __CLR4_5_221692169lusyjwf7.R.inc(94891);char c5 = digLetters[i5];
                                __CLR4_5_221692169lusyjwf7.R.inc(94892);chars[5] = c5;

                                __CLR4_5_221692169lusyjwf7.R.inc(94893);long h5 = h4;
                                __CLR4_5_221692169lusyjwf7.R.inc(94894);h5 ^= c5;
                                __CLR4_5_221692169lusyjwf7.R.inc(94895);h5 *= 0x1000193;

                                __CLR4_5_221692169lusyjwf7.R.inc(94896);for (int i6 = 0; (((i6 < digLetters.length)&&(__CLR4_5_221692169lusyjwf7.R.iget(94897)!=0|true))||(__CLR4_5_221692169lusyjwf7.R.iget(94898)==0&false)); ++i6) {{
                                    __CLR4_5_221692169lusyjwf7.R.inc(94899);char c6 = digLetters[i6];

                                    __CLR4_5_221692169lusyjwf7.R.inc(94900);long h6 = h5;
                                    __CLR4_5_221692169lusyjwf7.R.inc(94901);h6 ^= c6;
                                    __CLR4_5_221692169lusyjwf7.R.inc(94902);h6 *= 0x1000193;

                                    __CLR4_5_221692169lusyjwf7.R.inc(94903);chars[6] = c6;

                                    __CLR4_5_221692169lusyjwf7.R.inc(94904);v++;
                                    __CLR4_5_221692169lusyjwf7.R.inc(94905);if ((((h6 == id_hash_64)&&(__CLR4_5_221692169lusyjwf7.R.iget(94906)!=0|true))||(__CLR4_5_221692169lusyjwf7.R.iget(94907)==0&false))) {{
                                        __CLR4_5_221692169lusyjwf7.R.inc(94908);int hash_32 = (int) h6;
                                        __CLR4_5_221692169lusyjwf7.R.inc(94909);System.out.println("collision : " + build(v, len) + "\uff0c hash64 : " + h6 + ", hash 32 " + hash_32);
                                        __CLR4_5_221692169lusyjwf7.R.inc(94910);break;
                                    }

                                    }__CLR4_5_221692169lusyjwf7.R.inc(94911);if ((((v != 0 && v % (1000 * 1000 * 1000) == 0)&&(__CLR4_5_221692169lusyjwf7.R.iget(94912)!=0|true))||(__CLR4_5_221692169lusyjwf7.R.iget(94913)==0&false))) {{
                                        __CLR4_5_221692169lusyjwf7.R.inc(94914);long now = System.currentTimeMillis();
                                        __CLR4_5_221692169lusyjwf7.R.inc(94915);long millis = now - time;
                                        __CLR4_5_221692169lusyjwf7.R.inc(94916);time = now;
                                        __CLR4_5_221692169lusyjwf7.R.inc(94917);System.out.println("millis : " + millis + ", " + format.format(v));
                                    }
                                }}
                            }}
                        }}
                    }}
                }}
            }}
        }}


        }__CLR4_5_221692169lusyjwf7.R.inc(94918);System.out.println("end : " + len);

    }finally{__CLR4_5_221692169lusyjwf7.R.flushNeeded();}}

    String build(long v, int len) {try{__CLR4_5_221692169lusyjwf7.R.inc(94919);
        __CLR4_5_221692169lusyjwf7.R.inc(94920);char[] chars = new char[len];
        __CLR4_5_221692169lusyjwf7.R.inc(94921);for (int i = 0; (((i < chars.length)&&(__CLR4_5_221692169lusyjwf7.R.iget(94922)!=0|true))||(__CLR4_5_221692169lusyjwf7.R.iget(94923)==0&false)); ++i) {{
            __CLR4_5_221692169lusyjwf7.R.inc(94924);int power = powers[chars.length - i - 1];
            __CLR4_5_221692169lusyjwf7.R.inc(94925);int d = (int) ((v / power) % digLetters.length);
            __CLR4_5_221692169lusyjwf7.R.inc(94926);chars[i] = digLetters[d];
        }

        }__CLR4_5_221692169lusyjwf7.R.inc(94927);return new String(chars);
    }finally{__CLR4_5_221692169lusyjwf7.R.flushNeeded();}}

    static long fnv_hash(char[] chars) {try{__CLR4_5_221692169lusyjwf7.R.inc(94928);
        __CLR4_5_221692169lusyjwf7.R.inc(94929);long hash = 0x811c9dc5;
        __CLR4_5_221692169lusyjwf7.R.inc(94930);for (int i = 0; (((i < chars.length)&&(__CLR4_5_221692169lusyjwf7.R.iget(94931)!=0|true))||(__CLR4_5_221692169lusyjwf7.R.iget(94932)==0&false)); ++i) {{
            __CLR4_5_221692169lusyjwf7.R.inc(94933);char c = chars[i];
            __CLR4_5_221692169lusyjwf7.R.inc(94934);hash ^= c;
            __CLR4_5_221692169lusyjwf7.R.inc(94935);hash *= 0x1000193;
        }
        }__CLR4_5_221692169lusyjwf7.R.inc(94936);return hash;
    }finally{__CLR4_5_221692169lusyjwf7.R.flushNeeded();}}

    static long hash(char[] chars) {try{__CLR4_5_221692169lusyjwf7.R.inc(94937);
        __CLR4_5_221692169lusyjwf7.R.inc(94938);long hash = 0;
        __CLR4_5_221692169lusyjwf7.R.inc(94939);for (int i = 0; (((i < chars.length)&&(__CLR4_5_221692169lusyjwf7.R.iget(94940)!=0|true))||(__CLR4_5_221692169lusyjwf7.R.iget(94941)==0&false)); ++i) {{
            __CLR4_5_221692169lusyjwf7.R.inc(94942);hash = 31 * hash + chars[i];
        }
        }__CLR4_5_221692169lusyjwf7.R.inc(94943);return hash;
    }finally{__CLR4_5_221692169lusyjwf7.R.flushNeeded();}}
}
