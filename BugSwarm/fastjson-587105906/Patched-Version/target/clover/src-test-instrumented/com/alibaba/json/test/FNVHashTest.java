/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test;

import junit.framework.TestCase;

import java.util.*;

/**
 * Created by wenshao on 05/01/2017.
 */
public class FNVHashTest extends TestCase {static class __CLR4_5_2229l229llusvnjxe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,96303,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    char[] digLetters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_".toCharArray();
    Random r = new Random();

    public void test_fnv_hash() throws Exception {__CLR4_5_2229l229llusvnjxe.R.globalSliceStart(getClass().getName(),96249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2brbokt229l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2229l229llusvnjxe.R.rethrow($CLV_t2$);}finally{__CLR4_5_2229l229llusvnjxe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.FNVHashTest.test_fnv_hash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),96249,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2brbokt229l() throws Exception{try{__CLR4_5_2229l229llusvnjxe.R.inc(96249);
        __CLR4_5_2229l229llusvnjxe.R.inc(96250);int COUNT = 1000 * 1000 * 1000;

        __CLR4_5_2229l229llusvnjxe.R.inc(96251);int collision_cnt = 0;
        // Map<Long, char[]> map = new HashMap<Long, char[]>(COUNT);

        __CLR4_5_2229l229llusvnjxe.R.inc(96252);long id_hash = fnv_hash("id".toCharArray());
        __CLR4_5_2229l229llusvnjxe.R.inc(96253);System.out.printf("id : " + id_hash);
        __CLR4_5_2229l229llusvnjxe.R.inc(96254);System.out.println();
        __CLR4_5_2229l229llusvnjxe.R.inc(96255);for (int i = 0; (((i < digLetters.length)&&(__CLR4_5_2229l229llusvnjxe.R.iget(96256)!=0|true))||(__CLR4_5_2229l229llusvnjxe.R.iget(96257)==0&false)); ++i) {{
            __CLR4_5_2229l229llusvnjxe.R.inc(96258);System.out.print(digLetters[i]);
            __CLR4_5_2229l229llusvnjxe.R.inc(96259);System.out.print(",");
        }
//        for (int i = 0; i < COUNT; ++i) {
//            char[] chars = gen();
//            int hash = fnv_hash32(chars);
//            if (hash == id_hash) {
//                System.out.println(new String(chars));
//                break;
//            }
//        }

//        for (int i = 0; i < COUNT; ++i) {
//            char[] chars = gen();
//            Long hash = bkdr_hash(chars);
//
//            char[] chars_2 = map.get(hash);
//            if (chars_2 != null) {
//                if (!Arrays.equals(chars, chars_2)) {
//                    System.out.println("collision (" + collision_cnt++ + ") : " + new String(chars) + " -> " + new String(chars_2));
//                }
//            } else {
//                map.put(hash, chars);
//            }
//        }
    }}finally{__CLR4_5_2229l229llusvnjxe.R.flushNeeded();}}

    private char[] gen() {try{__CLR4_5_2229l229llusvnjxe.R.inc(96260);
        __CLR4_5_2229l229llusvnjxe.R.inc(96261);int len = r.nextInt(32);
        __CLR4_5_2229l229llusvnjxe.R.inc(96262);char[] chars = new char[len];
        __CLR4_5_2229l229llusvnjxe.R.inc(96263);for (int i = 0; (((i < chars.length)&&(__CLR4_5_2229l229llusvnjxe.R.iget(96264)!=0|true))||(__CLR4_5_2229l229llusvnjxe.R.iget(96265)==0&false)); ++i) {{
            __CLR4_5_2229l229llusvnjxe.R.inc(96266);chars[i] = digLetters[r.nextInt(digLetters.length)];
        }
        }__CLR4_5_2229l229llusvnjxe.R.inc(96267);return chars;
    }finally{__CLR4_5_2229l229llusvnjxe.R.flushNeeded();}}

    static int fnv_hash32(char[] chars) {try{__CLR4_5_2229l229llusvnjxe.R.inc(96268);
        __CLR4_5_2229l229llusvnjxe.R.inc(96269);long hash = 0x811c9dc5;
        __CLR4_5_2229l229llusvnjxe.R.inc(96270);for (int i = 0; (((i < chars.length)&&(__CLR4_5_2229l229llusvnjxe.R.iget(96271)!=0|true))||(__CLR4_5_2229l229llusvnjxe.R.iget(96272)==0&false)); ++i) {{
            __CLR4_5_2229l229llusvnjxe.R.inc(96273);char c = chars[i];
            __CLR4_5_2229l229llusvnjxe.R.inc(96274);hash ^= c;
            __CLR4_5_2229l229llusvnjxe.R.inc(96275);hash *= 0x1000193;
        }
        }__CLR4_5_2229l229llusvnjxe.R.inc(96276);return (int) hash;
    }finally{__CLR4_5_2229l229llusvnjxe.R.flushNeeded();}}

    static long fnv_hash64(char[] chars) {try{__CLR4_5_2229l229llusvnjxe.R.inc(96277);
        __CLR4_5_2229l229llusvnjxe.R.inc(96278);long hash = 0xcbf29ce484222325L;
        __CLR4_5_2229l229llusvnjxe.R.inc(96279);for (int i = 0; (((i < chars.length)&&(__CLR4_5_2229l229llusvnjxe.R.iget(96280)!=0|true))||(__CLR4_5_2229l229llusvnjxe.R.iget(96281)==0&false)); ++i) {{
            __CLR4_5_2229l229llusvnjxe.R.inc(96282);char c = chars[i];
            __CLR4_5_2229l229llusvnjxe.R.inc(96283);hash ^= c;
            __CLR4_5_2229l229llusvnjxe.R.inc(96284);hash *= 0x100000001b3L;
        }
        }__CLR4_5_2229l229llusvnjxe.R.inc(96285);return hash;
    }finally{__CLR4_5_2229l229llusvnjxe.R.flushNeeded();}}

    static long fnv_hash(char[] chars) {try{__CLR4_5_2229l229llusvnjxe.R.inc(96286);
        __CLR4_5_2229l229llusvnjxe.R.inc(96287);long hash = 0x811c9dc5;
        __CLR4_5_2229l229llusvnjxe.R.inc(96288);for (int i = 0; (((i < chars.length)&&(__CLR4_5_2229l229llusvnjxe.R.iget(96289)!=0|true))||(__CLR4_5_2229l229llusvnjxe.R.iget(96290)==0&false)); ++i) {{
            __CLR4_5_2229l229llusvnjxe.R.inc(96291);char c = chars[i];
            __CLR4_5_2229l229llusvnjxe.R.inc(96292);hash ^= c;
            __CLR4_5_2229l229llusvnjxe.R.inc(96293);hash *= 0x1000193;
        }
        }__CLR4_5_2229l229llusvnjxe.R.inc(96294);return hash;
    }finally{__CLR4_5_2229l229llusvnjxe.R.flushNeeded();}}

    static long bkdr_hash(char[] chars) {try{__CLR4_5_2229l229llusvnjxe.R.inc(96295);
        __CLR4_5_2229l229llusvnjxe.R.inc(96296);long hash = 0;
        __CLR4_5_2229l229llusvnjxe.R.inc(96297);for (int i = 0; (((i < chars.length)&&(__CLR4_5_2229l229llusvnjxe.R.iget(96298)!=0|true))||(__CLR4_5_2229l229llusvnjxe.R.iget(96299)==0&false)); ++i) {{
            __CLR4_5_2229l229llusvnjxe.R.inc(96300);char c = chars[i];
            __CLR4_5_2229l229llusvnjxe.R.inc(96301);hash = hash * 131 + c;
        }
        }__CLR4_5_2229l229llusvnjxe.R.inc(96302);return hash;
    }finally{__CLR4_5_2229l229llusvnjxe.R.flushNeeded();}}
}
