/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.benchmark.basic;

import com.alibaba.fastjson.JSON;

import java.util.Random;

/**
 * Created by wenshao on 04/08/2017.
 */
public class FloatBenchmark {public static class __CLR4_1_1023oq23oqluszwi7n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,98120,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static String json = "{\"v1\":0.012671709,\"v2\":0.6042485,\"v3\":0.13231707,\"v4\":0.80090785,\"v5\":0.6192943}";
    static String json2 = "{\"v1\":\"0.012671709\",\"v2\":\"0.6042485\",\"v3\":\"0.13231707\",\"v4\":\"0.80090785\",\"v5\":\"0.6192943\"}";
    static String json3 = "{\n" +
            "\t\"v1\":0.012671709,\n" +
            "\t\"v2\":0.6042485,\n" +
            "\t\"v3\":0.13231707,\n" +
            "\t\"v4\":0.80090785,\n" +
            "\t\"v5\":0.6192943\n" +
            "}";

    public static void main(String[] args) throws Exception {try{__CLR4_1_1023oq23oqluszwi7n.R.inc(98090);
        __CLR4_1_1023oq23oqluszwi7n.R.inc(98091);Model model = new Model();
//        model.v1 = new Random().nextFloat();
//        model.v2 = new Random().nextFloat();
//        model.v3 = new Random().nextFloat();
//        model.v4 = new Random().nextFloat();
//        model.v5 = new Random().nextFloat();
////
//        System.out.println(JSON.toJSONString(model));
//        System.out.println(JSON.toJSONString(JSON.parseObject(json), true));

        __CLR4_1_1023oq23oqluszwi7n.R.inc(98092);for (int i = 0; (((i < 10)&&(__CLR4_1_1023oq23oqluszwi7n.R.iget(98093)!=0|true))||(__CLR4_1_1023oq23oqluszwi7n.R.iget(98094)==0&false)); ++i) {{
//             perf(); // 210
//            perf2(); // 216
            __CLR4_1_1023oq23oqluszwi7n.R.inc(98095);perf3(); // 246
        }
    }}finally{__CLR4_1_1023oq23oqluszwi7n.R.flushNeeded();}}

    public static void perf() {try{__CLR4_1_1023oq23oqluszwi7n.R.inc(98096);
        __CLR4_1_1023oq23oqluszwi7n.R.inc(98097);long start = System.currentTimeMillis();
        __CLR4_1_1023oq23oqluszwi7n.R.inc(98098);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_1_1023oq23oqluszwi7n.R.iget(98099)!=0|true))||(__CLR4_1_1023oq23oqluszwi7n.R.iget(98100)==0&false)); ++i) {{
            __CLR4_1_1023oq23oqluszwi7n.R.inc(98101);JSON.parseObject(json, Model.class);
        }
        }__CLR4_1_1023oq23oqluszwi7n.R.inc(98102);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1023oq23oqluszwi7n.R.inc(98103);System.out.println("millis : " + millis);
    }finally{__CLR4_1_1023oq23oqluszwi7n.R.flushNeeded();}}

    public static void perf2() {try{__CLR4_1_1023oq23oqluszwi7n.R.inc(98104);
        __CLR4_1_1023oq23oqluszwi7n.R.inc(98105);long start = System.currentTimeMillis();
        __CLR4_1_1023oq23oqluszwi7n.R.inc(98106);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_1_1023oq23oqluszwi7n.R.iget(98107)!=0|true))||(__CLR4_1_1023oq23oqluszwi7n.R.iget(98108)==0&false)); ++i) {{
            __CLR4_1_1023oq23oqluszwi7n.R.inc(98109);JSON.parseObject(json2, Model.class);
        }
        }__CLR4_1_1023oq23oqluszwi7n.R.inc(98110);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1023oq23oqluszwi7n.R.inc(98111);System.out.println("millis : " + millis);
    }finally{__CLR4_1_1023oq23oqluszwi7n.R.flushNeeded();}}

    public static void perf3() {try{__CLR4_1_1023oq23oqluszwi7n.R.inc(98112);
        __CLR4_1_1023oq23oqluszwi7n.R.inc(98113);long start = System.currentTimeMillis();
        __CLR4_1_1023oq23oqluszwi7n.R.inc(98114);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_1_1023oq23oqluszwi7n.R.iget(98115)!=0|true))||(__CLR4_1_1023oq23oqluszwi7n.R.iget(98116)==0&false)); ++i) {{
            __CLR4_1_1023oq23oqluszwi7n.R.inc(98117);JSON.parseObject(json3, Model.class);
        }
        }__CLR4_1_1023oq23oqluszwi7n.R.inc(98118);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1023oq23oqluszwi7n.R.inc(98119);System.out.println("millis : " + millis);
    }finally{__CLR4_1_1023oq23oqluszwi7n.R.flushNeeded();}}

    public static class Model {
        public float v1;
        public float v2;
        public float v3;
        public float v4;
        public float v5;
    }
}
