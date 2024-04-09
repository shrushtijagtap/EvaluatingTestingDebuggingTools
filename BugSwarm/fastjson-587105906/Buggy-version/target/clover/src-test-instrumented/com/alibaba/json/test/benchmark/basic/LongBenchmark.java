/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.benchmark.basic;

import com.alibaba.fastjson.JSON;

import java.util.Random;

/**
 * Created by wenshao on 04/08/2017.
 */
public class LongBenchmark {public static class __CLR4_1_1022vo22volusqks8z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,97073,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static String json = "{\"v1\":-1883391953414482124,\"v2\":-3019416596934963650,\"v3\":6497525620823745793,\"v4\":2136224289077142499,\"v5\":-2090575024006307745}";
    static String json2 = "{\"v1\":\"-1883391953414482124\",\"v2\":\"-3019416596934963650\",\"v3\":\"6497525620823745793\",\"v4\":\"2136224289077142499\",\"v5\":\"-2090575024006307745\"}";
    static String json3 = "{\n" +
            "\t\"v1\":-1883391953414482124,\n" +
            "\t\"v2\":-3019416596934963650,\n" +
            "\t\"v3\":6497525620823745793,\n" +
            "\t\"v4\":2136224289077142499,\n" +
            "\t\"v5\":-2090575024006307745\n" +
            "}";

    public static void main(String[] args) throws Exception {try{__CLR4_1_1022vo22volusqks8z.R.inc(97044);
//        Model model = new Model();
//        model.v1 = new Random().nextLong();
//        model.v2 = new Random().nextLong();
//        model.v3 = new Random().nextLong();
//        model.v4 = new Random().nextLong();
//        model.v5 = new Random().nextLong();
//
//        System.out.println(JSON.toJSONString(model));

//        System.out.println(JSON.toJSONString(JSON.parseObject(json), true));

        __CLR4_1_1022vo22volusqks8z.R.inc(97045);for (int i = 0; (((i < 10)&&(__CLR4_1_1022vo22volusqks8z.R.iget(97046)!=0|true))||(__CLR4_1_1022vo22volusqks8z.R.iget(97047)==0&false)); ++i) {{
//             perf(); // 2799
//            perf2(); // 2931
            __CLR4_1_1022vo22volusqks8z.R.inc(97048);perf3(); // 10256
        }
    }}finally{__CLR4_1_1022vo22volusqks8z.R.flushNeeded();}}

    public static void perf() {try{__CLR4_1_1022vo22volusqks8z.R.inc(97049);
        __CLR4_1_1022vo22volusqks8z.R.inc(97050);long start = System.currentTimeMillis();
        __CLR4_1_1022vo22volusqks8z.R.inc(97051);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_1_1022vo22volusqks8z.R.iget(97052)!=0|true))||(__CLR4_1_1022vo22volusqks8z.R.iget(97053)==0&false)); ++i) {{
            __CLR4_1_1022vo22volusqks8z.R.inc(97054);JSON.parseObject(json, Model.class);
        }
        }__CLR4_1_1022vo22volusqks8z.R.inc(97055);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1022vo22volusqks8z.R.inc(97056);System.out.println("millis : " + millis);
    }finally{__CLR4_1_1022vo22volusqks8z.R.flushNeeded();}}

    public static void perf2() {try{__CLR4_1_1022vo22volusqks8z.R.inc(97057);
        __CLR4_1_1022vo22volusqks8z.R.inc(97058);long start = System.currentTimeMillis();
        __CLR4_1_1022vo22volusqks8z.R.inc(97059);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_1_1022vo22volusqks8z.R.iget(97060)!=0|true))||(__CLR4_1_1022vo22volusqks8z.R.iget(97061)==0&false)); ++i) {{
            __CLR4_1_1022vo22volusqks8z.R.inc(97062);JSON.parseObject(json2, Model.class);
        }
        }__CLR4_1_1022vo22volusqks8z.R.inc(97063);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1022vo22volusqks8z.R.inc(97064);System.out.println("millis : " + millis);
    }finally{__CLR4_1_1022vo22volusqks8z.R.flushNeeded();}}

    public static void perf3() {try{__CLR4_1_1022vo22volusqks8z.R.inc(97065);
        __CLR4_1_1022vo22volusqks8z.R.inc(97066);long start = System.currentTimeMillis();
        __CLR4_1_1022vo22volusqks8z.R.inc(97067);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_1_1022vo22volusqks8z.R.iget(97068)!=0|true))||(__CLR4_1_1022vo22volusqks8z.R.iget(97069)==0&false)); ++i) {{
            __CLR4_1_1022vo22volusqks8z.R.inc(97070);JSON.parseObject(json3, Model.class);
        }
        }__CLR4_1_1022vo22volusqks8z.R.inc(97071);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1022vo22volusqks8z.R.inc(97072);System.out.println("millis : " + millis);
    }finally{__CLR4_1_1022vo22volusqks8z.R.flushNeeded();}}

    public static class Model {
        public long v1;
        public long v2;
        public long v3;
        public long v4;
        public long v5;
    }
}
