/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.benchmark.basic;

import com.alibaba.fastjson.JSON;

import java.util.Random;

/**
 * Created by wenshao on 04/08/2017.
 */
public class BooleanBenchmark {public static class __CLR4_5_222is22islusyjwow{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,96625,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static String json = "{\"v1\":true,\"v2\":false,\"v3\":true,\"v4\":false,\"v5\":false}";
    static String json2 = "{\"v1\":\"true\",\"v2\":\"false\",\"v3\":\"true\",\"v4\":\"false\",\"v5\":\"false\"}";
    static String json3 = "{\"v1\":1,\"v2\":0,\"v3\":1,\"v4\":0,\"v5\":1}";
    static String json4 = "{\"v1\":\"1\",\"v2\":\"0\",\"v3\":\"1\",\"v4\":\"0\",\"v5\":\"1\"}";
    static String json5 = "{\n" +
            "\t\"v1\":true,\n" +
            "\t\"v2\":false,\n" +
            "\t\"v3\":true,\n" +
            "\t\"v4\":false,\n" +
            "\t\"v5\":false\n" +
            "}";

    public static void main(String[] args) throws Exception {try{__CLR4_5_222is22islusyjwow.R.inc(96580);
//        System.out.println(JSON.toJSONString(JSON.parseObject(json), true));

        __CLR4_5_222is22islusyjwow.R.inc(96581);for (int i = 0; (((i < 10)&&(__CLR4_5_222is22islusyjwow.R.iget(96582)!=0|true))||(__CLR4_5_222is22islusyjwow.R.iget(96583)==0&false)); ++i) {{
//             perf(); // 1266
//            perf2(); // 1334
//            perf3(); // 1085
//            perf4(); // 1085
            __CLR4_5_222is22islusyjwow.R.inc(96584);perf5(); // 1803
        }
    }}finally{__CLR4_5_222is22islusyjwow.R.flushNeeded();}}

    public static void perf() {try{__CLR4_5_222is22islusyjwow.R.inc(96585);
        __CLR4_5_222is22islusyjwow.R.inc(96586);long start = System.currentTimeMillis();
        __CLR4_5_222is22islusyjwow.R.inc(96587);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_222is22islusyjwow.R.iget(96588)!=0|true))||(__CLR4_5_222is22islusyjwow.R.iget(96589)==0&false)); ++i) {{
            __CLR4_5_222is22islusyjwow.R.inc(96590);JSON.parseObject(json, Model.class);
        }
        }__CLR4_5_222is22islusyjwow.R.inc(96591);long millis = System.currentTimeMillis() - start;
        __CLR4_5_222is22islusyjwow.R.inc(96592);System.out.println("millis : " + millis);
    }finally{__CLR4_5_222is22islusyjwow.R.flushNeeded();}}

    public static void perf2() {try{__CLR4_5_222is22islusyjwow.R.inc(96593);
        __CLR4_5_222is22islusyjwow.R.inc(96594);long start = System.currentTimeMillis();
        __CLR4_5_222is22islusyjwow.R.inc(96595);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_222is22islusyjwow.R.iget(96596)!=0|true))||(__CLR4_5_222is22islusyjwow.R.iget(96597)==0&false)); ++i) {{
            __CLR4_5_222is22islusyjwow.R.inc(96598);JSON.parseObject(json2, Model.class);
        }
        }__CLR4_5_222is22islusyjwow.R.inc(96599);long millis = System.currentTimeMillis() - start;
        __CLR4_5_222is22islusyjwow.R.inc(96600);System.out.println("millis : " + millis);
    }finally{__CLR4_5_222is22islusyjwow.R.flushNeeded();}}

    public static void perf3() {try{__CLR4_5_222is22islusyjwow.R.inc(96601);
        __CLR4_5_222is22islusyjwow.R.inc(96602);long start = System.currentTimeMillis();
        __CLR4_5_222is22islusyjwow.R.inc(96603);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_222is22islusyjwow.R.iget(96604)!=0|true))||(__CLR4_5_222is22islusyjwow.R.iget(96605)==0&false)); ++i) {{
            __CLR4_5_222is22islusyjwow.R.inc(96606);JSON.parseObject(json3, Model.class);
        }
        }__CLR4_5_222is22islusyjwow.R.inc(96607);long millis = System.currentTimeMillis() - start;
        __CLR4_5_222is22islusyjwow.R.inc(96608);System.out.println("millis : " + millis);
    }finally{__CLR4_5_222is22islusyjwow.R.flushNeeded();}}

    public static void perf4() {try{__CLR4_5_222is22islusyjwow.R.inc(96609);
        __CLR4_5_222is22islusyjwow.R.inc(96610);long start = System.currentTimeMillis();
        __CLR4_5_222is22islusyjwow.R.inc(96611);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_222is22islusyjwow.R.iget(96612)!=0|true))||(__CLR4_5_222is22islusyjwow.R.iget(96613)==0&false)); ++i) {{
            __CLR4_5_222is22islusyjwow.R.inc(96614);JSON.parseObject(json4, Model.class);
        }
        }__CLR4_5_222is22islusyjwow.R.inc(96615);long millis = System.currentTimeMillis() - start;
        __CLR4_5_222is22islusyjwow.R.inc(96616);System.out.println("millis : " + millis);
    }finally{__CLR4_5_222is22islusyjwow.R.flushNeeded();}}

    public static void perf5() {try{__CLR4_5_222is22islusyjwow.R.inc(96617);
        __CLR4_5_222is22islusyjwow.R.inc(96618);long start = System.currentTimeMillis();
        __CLR4_5_222is22islusyjwow.R.inc(96619);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_222is22islusyjwow.R.iget(96620)!=0|true))||(__CLR4_5_222is22islusyjwow.R.iget(96621)==0&false)); ++i) {{
            __CLR4_5_222is22islusyjwow.R.inc(96622);JSON.parseObject(json5, Model.class);
        }
        }__CLR4_5_222is22islusyjwow.R.inc(96623);long millis = System.currentTimeMillis() - start;
        __CLR4_5_222is22islusyjwow.R.inc(96624);System.out.println("millis : " + millis);
    }finally{__CLR4_5_222is22islusyjwow.R.flushNeeded();}}

    public static class Model {
        public boolean v1;
        public boolean v2;
        public boolean v3;
        public boolean v4;
        public boolean v5;
    }
}
