/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test;

import junit.framework.TestCase;

import java.text.NumberFormat;
import java.util.Random;

/**
 * Created by wenshao on 08/01/2017.
 */
public class FNV32_CollisionTest extends TestCase {static class __CLR4_1_10214n214nlusqkqy4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,94844,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    char[] digLetters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_".toCharArray();
    //char[] digLetters = "0123456789".toCharArray();
    Random r = new Random();
    int[] powers = new int[10];

    {try{__CLR4_1_10214n214nlusqkqy4.R.inc(94775);
        __CLR4_1_10214n214nlusqkqy4.R.inc(94776);for (int i = 0; (((i < powers.length)&&(__CLR4_1_10214n214nlusqkqy4.R.iget(94777)!=0|true))||(__CLR4_1_10214n214nlusqkqy4.R.iget(94778)==0&false)); ++i) {{
            __CLR4_1_10214n214nlusqkqy4.R.inc(94779);powers[i] = (int) Math.pow(digLetters.length, i);
        }
    }}finally{__CLR4_1_10214n214nlusqkqy4.R.flushNeeded();}}


    public void test_fnv_hash() throws Exception {__CLR4_1_10214n214nlusqkqy4.R.globalSliceStart(getClass().getName(),94780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10brbokt214s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10214n214nlusqkqy4.R.rethrow($CLV_t2$);}finally{__CLR4_1_10214n214nlusqkqy4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.FNV32_CollisionTest.test_fnv_hash",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),94780,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10brbokt214s() throws Exception{try{__CLR4_1_10214n214nlusqkqy4.R.inc(94780);
        __CLR4_1_10214n214nlusqkqy4.R.inc(94781);int COUNT = 1000 * 1000 * 1000;

        __CLR4_1_10214n214nlusqkqy4.R.inc(94782);long id_hash_64 = fnv_hash("name".toCharArray());
        __CLR4_1_10214n214nlusqkqy4.R.inc(94783);int id_hash_32 = (int) id_hash_64;
        __CLR4_1_10214n214nlusqkqy4.R.inc(94784);System.out.println("name : " + id_hash_32 + ", " + id_hash_64);

        __CLR4_1_10214n214nlusqkqy4.R.inc(94785);long v = 0;
        __CLR4_1_10214n214nlusqkqy4.R.inc(94786);long time = System.currentTimeMillis();
        __CLR4_1_10214n214nlusqkqy4.R.inc(94787);NumberFormat format = NumberFormat.getInstance();

        __CLR4_1_10214n214nlusqkqy4.R.inc(94788);for (int len = 1; (((len <= 7)&&(__CLR4_1_10214n214nlusqkqy4.R.iget(94789)!=0|true))||(__CLR4_1_10214n214nlusqkqy4.R.iget(94790)==0&false)); ++len){{
            __CLR4_1_10214n214nlusqkqy4.R.inc(94791);char[] chars = new char[len];
            __CLR4_1_10214n214nlusqkqy4.R.inc(94792);long n = (long) Math.pow(digLetters.length, chars.length);


            __CLR4_1_10214n214nlusqkqy4.R.inc(94793);for (; (((v < n)&&(__CLR4_1_10214n214nlusqkqy4.R.iget(94794)!=0|true))||(__CLR4_1_10214n214nlusqkqy4.R.iget(94795)==0&false)); ++v) {{
                __CLR4_1_10214n214nlusqkqy4.R.inc(94796);long hash = 0x811c9dc5;
                __CLR4_1_10214n214nlusqkqy4.R.inc(94797);for (int i = 0; (((i < chars.length)&&(__CLR4_1_10214n214nlusqkqy4.R.iget(94798)!=0|true))||(__CLR4_1_10214n214nlusqkqy4.R.iget(94799)==0&false)); ++i) {{
                    __CLR4_1_10214n214nlusqkqy4.R.inc(94800);int power = powers[chars.length - i - 1];
                    __CLR4_1_10214n214nlusqkqy4.R.inc(94801);int d = (int) ((v / power) % digLetters.length);
                    __CLR4_1_10214n214nlusqkqy4.R.inc(94802);char c = digLetters[d];

                    __CLR4_1_10214n214nlusqkqy4.R.inc(94803);hash ^= c;
                    __CLR4_1_10214n214nlusqkqy4.R.inc(94804);hash *= 0x1000193;
                }

                }__CLR4_1_10214n214nlusqkqy4.R.inc(94805);if ((((hash == id_hash_64)&&(__CLR4_1_10214n214nlusqkqy4.R.iget(94806)!=0|true))||(__CLR4_1_10214n214nlusqkqy4.R.iget(94807)==0&false))) {{
                    __CLR4_1_10214n214nlusqkqy4.R.inc(94808);int hash_32 = (int) hash;
                    __CLR4_1_10214n214nlusqkqy4.R.inc(94809);System.out.println("collision : " + build(v, len) + "\uff0c hash64 : " + hash + ", hash 32 " + hash_32);
                    __CLR4_1_10214n214nlusqkqy4.R.inc(94810);break;
                }

                }__CLR4_1_10214n214nlusqkqy4.R.inc(94811);if ((((v != 0 && v % (1000 * 1000 * 100) == 0)&&(__CLR4_1_10214n214nlusqkqy4.R.iget(94812)!=0|true))||(__CLR4_1_10214n214nlusqkqy4.R.iget(94813)==0&false))) {{
                    __CLR4_1_10214n214nlusqkqy4.R.inc(94814);long now = System.currentTimeMillis();
                    __CLR4_1_10214n214nlusqkqy4.R.inc(94815);long millis = now - time;
                    __CLR4_1_10214n214nlusqkqy4.R.inc(94816);time = now;
                    __CLR4_1_10214n214nlusqkqy4.R.inc(94817);System.out.println("millis : " + millis + ", " + format.format(v));
                }
            }}

            }__CLR4_1_10214n214nlusqkqy4.R.inc(94818);System.out.println("end : " + len);
        }
    }}finally{__CLR4_1_10214n214nlusqkqy4.R.flushNeeded();}}

    String build(long v, int len) {try{__CLR4_1_10214n214nlusqkqy4.R.inc(94819);
        __CLR4_1_10214n214nlusqkqy4.R.inc(94820);char[] chars = new char[len];
        __CLR4_1_10214n214nlusqkqy4.R.inc(94821);for (int i = 0; (((i < chars.length)&&(__CLR4_1_10214n214nlusqkqy4.R.iget(94822)!=0|true))||(__CLR4_1_10214n214nlusqkqy4.R.iget(94823)==0&false)); ++i) {{
            __CLR4_1_10214n214nlusqkqy4.R.inc(94824);int power = powers[chars.length - i - 1];
            __CLR4_1_10214n214nlusqkqy4.R.inc(94825);int d = (int) ((v / power) % digLetters.length);
            __CLR4_1_10214n214nlusqkqy4.R.inc(94826);chars[i] = digLetters[d];
        }

        }__CLR4_1_10214n214nlusqkqy4.R.inc(94827);return new String(chars);
    }finally{__CLR4_1_10214n214nlusqkqy4.R.flushNeeded();}}

    static long fnv_hash(char[] chars) {try{__CLR4_1_10214n214nlusqkqy4.R.inc(94828);
        __CLR4_1_10214n214nlusqkqy4.R.inc(94829);long hash = 0x811c9dc5;
        __CLR4_1_10214n214nlusqkqy4.R.inc(94830);for (int i = 0; (((i < chars.length)&&(__CLR4_1_10214n214nlusqkqy4.R.iget(94831)!=0|true))||(__CLR4_1_10214n214nlusqkqy4.R.iget(94832)==0&false)); ++i) {{
            __CLR4_1_10214n214nlusqkqy4.R.inc(94833);char c = chars[i];
            __CLR4_1_10214n214nlusqkqy4.R.inc(94834);hash ^= c;
            __CLR4_1_10214n214nlusqkqy4.R.inc(94835);hash *= 0x1000193;
        }
        }__CLR4_1_10214n214nlusqkqy4.R.inc(94836);return hash;
    }finally{__CLR4_1_10214n214nlusqkqy4.R.flushNeeded();}}

    static long hash(char[] chars) {try{__CLR4_1_10214n214nlusqkqy4.R.inc(94837);
        __CLR4_1_10214n214nlusqkqy4.R.inc(94838);long hash = 0;
        __CLR4_1_10214n214nlusqkqy4.R.inc(94839);for (int i = 0; (((i < chars.length)&&(__CLR4_1_10214n214nlusqkqy4.R.iget(94840)!=0|true))||(__CLR4_1_10214n214nlusqkqy4.R.iget(94841)==0&false)); ++i) {{
            __CLR4_1_10214n214nlusqkqy4.R.inc(94842);hash = 31 * hash + chars[i];
        }
        }__CLR4_1_10214n214nlusqkqy4.R.inc(94843);return hash;
    }finally{__CLR4_1_10214n214nlusqkqy4.R.flushNeeded();}}
}
