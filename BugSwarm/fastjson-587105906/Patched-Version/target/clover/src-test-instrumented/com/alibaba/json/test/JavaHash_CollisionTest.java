/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test;

import junit.framework.TestCase;

import java.text.NumberFormat;
import java.util.Random;

/**
 * Created by wenshao on 08/01/2017.
 */
public class JavaHash_CollisionTest extends TestCase {static class __CLR4_5_221j621j6lusyjwh9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,95367,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    char[] digLetters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_".toCharArray();
    //char[] digLetters = "0123456789".toCharArray();
    Random r = new Random();
    int[] powers = new int[10];

    {try{__CLR4_5_221j621j6lusyjwh9.R.inc(95298);
        __CLR4_5_221j621j6lusyjwh9.R.inc(95299);for (int i = 0; (((i < powers.length)&&(__CLR4_5_221j621j6lusyjwh9.R.iget(95300)!=0|true))||(__CLR4_5_221j621j6lusyjwh9.R.iget(95301)==0&false)); ++i) {{
            __CLR4_5_221j621j6lusyjwh9.R.inc(95302);powers[i] = (int) Math.pow(digLetters.length, i);
        }
    }}finally{__CLR4_5_221j621j6lusyjwh9.R.flushNeeded();}}


    public void test_fnv_hash() throws Exception {__CLR4_5_221j621j6lusyjwh9.R.globalSliceStart(getClass().getName(),95303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2brbokt21jb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_221j621j6lusyjwh9.R.rethrow($CLV_t2$);}finally{__CLR4_5_221j621j6lusyjwh9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.JavaHash_CollisionTest.test_fnv_hash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),95303,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2brbokt21jb() throws Exception{try{__CLR4_5_221j621j6lusyjwh9.R.inc(95303);
        __CLR4_5_221j621j6lusyjwh9.R.inc(95304);int COUNT = 1000 * 1000 * 1000;

        __CLR4_5_221j621j6lusyjwh9.R.inc(95305);long id_hash_64 = hash64("name".toCharArray());
        __CLR4_5_221j621j6lusyjwh9.R.inc(95306);int id_hash_32 = (int) id_hash_64;
        __CLR4_5_221j621j6lusyjwh9.R.inc(95307);System.out.println("name : " + id_hash_32 + ", " + id_hash_64);

        __CLR4_5_221j621j6lusyjwh9.R.inc(95308);long v = 0;
        __CLR4_5_221j621j6lusyjwh9.R.inc(95309);long time = System.currentTimeMillis();
        __CLR4_5_221j621j6lusyjwh9.R.inc(95310);NumberFormat format = NumberFormat.getInstance();

        __CLR4_5_221j621j6lusyjwh9.R.inc(95311);for (int len = 1; (((len <= 7)&&(__CLR4_5_221j621j6lusyjwh9.R.iget(95312)!=0|true))||(__CLR4_5_221j621j6lusyjwh9.R.iget(95313)==0&false)); ++len){{
            __CLR4_5_221j621j6lusyjwh9.R.inc(95314);char[] chars = new char[len];
            __CLR4_5_221j621j6lusyjwh9.R.inc(95315);long n = (long) Math.pow(digLetters.length, chars.length);

            // h = 31 * h + val[i];
            __CLR4_5_221j621j6lusyjwh9.R.inc(95316);for (; (((v < n)&&(__CLR4_5_221j621j6lusyjwh9.R.iget(95317)!=0|true))||(__CLR4_5_221j621j6lusyjwh9.R.iget(95318)==0&false)); ++v) {{
                // long hash = 0x811c9dc5;
                __CLR4_5_221j621j6lusyjwh9.R.inc(95319);long hash = 0;
                __CLR4_5_221j621j6lusyjwh9.R.inc(95320);for (int i = 0; (((i < chars.length)&&(__CLR4_5_221j621j6lusyjwh9.R.iget(95321)!=0|true))||(__CLR4_5_221j621j6lusyjwh9.R.iget(95322)==0&false)); ++i) {{
                    __CLR4_5_221j621j6lusyjwh9.R.inc(95323);int power = powers[chars.length - i - 1];
                    __CLR4_5_221j621j6lusyjwh9.R.inc(95324);int d = (int) ((v / power) % digLetters.length);
                    __CLR4_5_221j621j6lusyjwh9.R.inc(95325);char c = digLetters[d];

                    __CLR4_5_221j621j6lusyjwh9.R.inc(95326);hash = 31 * hash + c;
//                    hash ^= c;
//                    hash *= 0x1000193;
                }

                }__CLR4_5_221j621j6lusyjwh9.R.inc(95327);if ((((hash == id_hash_64)&&(__CLR4_5_221j621j6lusyjwh9.R.iget(95328)!=0|true))||(__CLR4_5_221j621j6lusyjwh9.R.iget(95329)==0&false))) {{
                    __CLR4_5_221j621j6lusyjwh9.R.inc(95330);int hash_32 = (int) hash;
                    __CLR4_5_221j621j6lusyjwh9.R.inc(95331);System.out.println("collision : " + build(v, len) + "\uff0c hash64 : " + hash + ", hash 32 " + hash_32);
                    __CLR4_5_221j621j6lusyjwh9.R.inc(95332);break;
                }

                }__CLR4_5_221j621j6lusyjwh9.R.inc(95333);if ((((v != 0 && v % (1000 * 1000 * 100) == 0)&&(__CLR4_5_221j621j6lusyjwh9.R.iget(95334)!=0|true))||(__CLR4_5_221j621j6lusyjwh9.R.iget(95335)==0&false))) {{
                    __CLR4_5_221j621j6lusyjwh9.R.inc(95336);long now = System.currentTimeMillis();
                    __CLR4_5_221j621j6lusyjwh9.R.inc(95337);long millis = now - time;
                    __CLR4_5_221j621j6lusyjwh9.R.inc(95338);time = now;
                    __CLR4_5_221j621j6lusyjwh9.R.inc(95339);System.out.println("millis : " + millis + ", " + format.format(v));
                }
            }}

            }__CLR4_5_221j621j6lusyjwh9.R.inc(95340);System.out.println("end : " + len);
        }
    }}finally{__CLR4_5_221j621j6lusyjwh9.R.flushNeeded();}}

    String build(long v, int len) {try{__CLR4_5_221j621j6lusyjwh9.R.inc(95341);
        __CLR4_5_221j621j6lusyjwh9.R.inc(95342);char[] chars = new char[len];
        __CLR4_5_221j621j6lusyjwh9.R.inc(95343);for (int i = 0; (((i < chars.length)&&(__CLR4_5_221j621j6lusyjwh9.R.iget(95344)!=0|true))||(__CLR4_5_221j621j6lusyjwh9.R.iget(95345)==0&false)); ++i) {{
            __CLR4_5_221j621j6lusyjwh9.R.inc(95346);int power = powers[chars.length - i - 1];
            __CLR4_5_221j621j6lusyjwh9.R.inc(95347);int d = (int) ((v / power) % digLetters.length);
            __CLR4_5_221j621j6lusyjwh9.R.inc(95348);chars[i] = digLetters[d];
        }

        }__CLR4_5_221j621j6lusyjwh9.R.inc(95349);return new String(chars);
    }finally{__CLR4_5_221j621j6lusyjwh9.R.flushNeeded();}}

    static long fnv_hash(char[] chars) {try{__CLR4_5_221j621j6lusyjwh9.R.inc(95350);
        __CLR4_5_221j621j6lusyjwh9.R.inc(95351);long hash = 0x811c9dc5;
        __CLR4_5_221j621j6lusyjwh9.R.inc(95352);for (int i = 0; (((i < chars.length)&&(__CLR4_5_221j621j6lusyjwh9.R.iget(95353)!=0|true))||(__CLR4_5_221j621j6lusyjwh9.R.iget(95354)==0&false)); ++i) {{
            __CLR4_5_221j621j6lusyjwh9.R.inc(95355);char c = chars[i];
            __CLR4_5_221j621j6lusyjwh9.R.inc(95356);hash ^= c;
            __CLR4_5_221j621j6lusyjwh9.R.inc(95357);hash *= 0x1000193;
        }
        }__CLR4_5_221j621j6lusyjwh9.R.inc(95358);return hash;
    }finally{__CLR4_5_221j621j6lusyjwh9.R.flushNeeded();}}

    static long hash64(char[] chars) {try{__CLR4_5_221j621j6lusyjwh9.R.inc(95359);
        __CLR4_5_221j621j6lusyjwh9.R.inc(95360);long hash = 0x811c9dc5;
        __CLR4_5_221j621j6lusyjwh9.R.inc(95361);for (int i = 0; (((i < chars.length)&&(__CLR4_5_221j621j6lusyjwh9.R.iget(95362)!=0|true))||(__CLR4_5_221j621j6lusyjwh9.R.iget(95363)==0&false)); ++i) {{
            __CLR4_5_221j621j6lusyjwh9.R.inc(95364);char c = chars[i];
            __CLR4_5_221j621j6lusyjwh9.R.inc(95365);hash = 31 * hash + c;

        }
        }__CLR4_5_221j621j6lusyjwh9.R.inc(95366);return hash;
    }finally{__CLR4_5_221j621j6lusyjwh9.R.flushNeeded();}}
}
