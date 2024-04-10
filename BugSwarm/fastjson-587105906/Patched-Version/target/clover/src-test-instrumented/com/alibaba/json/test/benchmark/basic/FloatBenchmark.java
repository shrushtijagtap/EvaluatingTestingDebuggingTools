/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.benchmark.basic;

import com.alibaba.fastjson.JSON;

import java.util.Random;

/**
 * Created by wenshao on 04/08/2017.
 */
public class FloatBenchmark {public static class __CLR4_5_222q722q7lusyjwpu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,96877,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static String json = "{\"v1\":0.012671709,\"v2\":0.6042485,\"v3\":0.13231707,\"v4\":0.80090785,\"v5\":0.6192943}";
    static String json2 = "{\"v1\":\"0.012671709\",\"v2\":\"0.6042485\",\"v3\":\"0.13231707\",\"v4\":\"0.80090785\",\"v5\":\"0.6192943\"}";
    static String json3 = "{\n" +
            "\t\"v1\":0.012671709,\n" +
            "\t\"v2\":0.6042485,\n" +
            "\t\"v3\":0.13231707,\n" +
            "\t\"v4\":0.80090785,\n" +
            "\t\"v5\":0.6192943\n" +
            "}";

    public static void main(String[] args) throws Exception {try{__CLR4_5_222q722q7lusyjwpu.R.inc(96847);
        __CLR4_5_222q722q7lusyjwpu.R.inc(96848);Model model = new Model();
//        model.v1 = new Random().nextFloat();
//        model.v2 = new Random().nextFloat();
//        model.v3 = new Random().nextFloat();
//        model.v4 = new Random().nextFloat();
//        model.v5 = new Random().nextFloat();
////
//        System.out.println(JSON.toJSONString(model));
//        System.out.println(JSON.toJSONString(JSON.parseObject(json), true));

        __CLR4_5_222q722q7lusyjwpu.R.inc(96849);for (int i = 0; (((i < 10)&&(__CLR4_5_222q722q7lusyjwpu.R.iget(96850)!=0|true))||(__CLR4_5_222q722q7lusyjwpu.R.iget(96851)==0&false)); ++i) {{
//             perf(); // 210
//            perf2(); // 216
            __CLR4_5_222q722q7lusyjwpu.R.inc(96852);perf3(); // 246
        }
    }}finally{__CLR4_5_222q722q7lusyjwpu.R.flushNeeded();}}

    public static void perf() {try{__CLR4_5_222q722q7lusyjwpu.R.inc(96853);
        __CLR4_5_222q722q7lusyjwpu.R.inc(96854);long start = System.currentTimeMillis();
        __CLR4_5_222q722q7lusyjwpu.R.inc(96855);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_5_222q722q7lusyjwpu.R.iget(96856)!=0|true))||(__CLR4_5_222q722q7lusyjwpu.R.iget(96857)==0&false)); ++i) {{
            __CLR4_5_222q722q7lusyjwpu.R.inc(96858);JSON.parseObject(json, Model.class);
        }
        }__CLR4_5_222q722q7lusyjwpu.R.inc(96859);long millis = System.currentTimeMillis() - start;
        __CLR4_5_222q722q7lusyjwpu.R.inc(96860);System.out.println("millis : " + millis);
    }finally{__CLR4_5_222q722q7lusyjwpu.R.flushNeeded();}}

    public static void perf2() {try{__CLR4_5_222q722q7lusyjwpu.R.inc(96861);
        __CLR4_5_222q722q7lusyjwpu.R.inc(96862);long start = System.currentTimeMillis();
        __CLR4_5_222q722q7lusyjwpu.R.inc(96863);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_5_222q722q7lusyjwpu.R.iget(96864)!=0|true))||(__CLR4_5_222q722q7lusyjwpu.R.iget(96865)==0&false)); ++i) {{
            __CLR4_5_222q722q7lusyjwpu.R.inc(96866);JSON.parseObject(json2, Model.class);
        }
        }__CLR4_5_222q722q7lusyjwpu.R.inc(96867);long millis = System.currentTimeMillis() - start;
        __CLR4_5_222q722q7lusyjwpu.R.inc(96868);System.out.println("millis : " + millis);
    }finally{__CLR4_5_222q722q7lusyjwpu.R.flushNeeded();}}

    public static void perf3() {try{__CLR4_5_222q722q7lusyjwpu.R.inc(96869);
        __CLR4_5_222q722q7lusyjwpu.R.inc(96870);long start = System.currentTimeMillis();
        __CLR4_5_222q722q7lusyjwpu.R.inc(96871);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_5_222q722q7lusyjwpu.R.iget(96872)!=0|true))||(__CLR4_5_222q722q7lusyjwpu.R.iget(96873)==0&false)); ++i) {{
            __CLR4_5_222q722q7lusyjwpu.R.inc(96874);JSON.parseObject(json3, Model.class);
        }
        }__CLR4_5_222q722q7lusyjwpu.R.inc(96875);long millis = System.currentTimeMillis() - start;
        __CLR4_5_222q722q7lusyjwpu.R.inc(96876);System.out.println("millis : " + millis);
    }finally{__CLR4_5_222q722q7lusyjwpu.R.flushNeeded();}}

    public static class Model {
        public float v1;
        public float v2;
        public float v3;
        public float v4;
        public float v5;
    }
}
