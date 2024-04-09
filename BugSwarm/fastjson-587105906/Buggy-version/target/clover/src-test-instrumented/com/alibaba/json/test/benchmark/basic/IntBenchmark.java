/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.benchmark.basic;

import com.alibaba.fastjson.JSON;

import java.util.Random;

/**
 * Created by wenshao on 04/08/2017.
 */
public class IntBenchmark {public static class __CLR4_1_1022t622t6lusqks7d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,96984,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static String json = "{\"v1\":-1224609302,\"v2\":379420556,\"v3\":-1098099527,\"v4\":-2018662,\"v5\":422842162}";
    static String json2 = "{\"v1\":\"-1224609302\",\"v2\":\"379420556\",\"v3\":\"-1098099527\",\"v4\":\"-2018662\",\"v5\":\"422842162\"}";
    static String json3 = "{\n" +
            "\t\"v1\":\"-1224609302\",\n" +
            "\t\"v2\":\"379420556\",\n" +
            "\t\"v3\":\"-1098099527\",\n" +
            "\t\"v4\":\"-2018662\",\n" +
            "\t\"v5\":\"422842162\"\n" +
            "}";

    public static void main(String[] args) throws Exception {try{__CLR4_1_1022t622t6lusqks7d.R.inc(96954);
        __CLR4_1_1022t622t6lusqks7d.R.inc(96955);System.out.println(System.getProperty("java.vm.name") + " " + System.getProperty("java.runtime.version"));
//        Model model = new Model();
//        model.v1 = new Random().nextInt();
//        model.v2 = new Random().nextInt();
//        model.v3 = new Random().nextInt();
//        model.v4 = new Random().nextInt();
//        model.v5 = new Random().nextInt();
//
//        System.out.println(JSON.toJSONString(model));


        __CLR4_1_1022t622t6lusqks7d.R.inc(96956);for (int i = 0; (((i < 10)&&(__CLR4_1_1022t622t6lusqks7d.R.iget(96957)!=0|true))||(__CLR4_1_1022t622t6lusqks7d.R.iget(96958)==0&false)); ++i) {{
             __CLR4_1_1022t622t6lusqks7d.R.inc(96959);perf(); // 1798
           // perf2(); // 1877
//            perf3(); // 20624 2334
        }
    }}finally{__CLR4_1_1022t622t6lusqks7d.R.flushNeeded();}}

    public static void perf() {try{__CLR4_1_1022t622t6lusqks7d.R.inc(96960);
        __CLR4_1_1022t622t6lusqks7d.R.inc(96961);long start = System.currentTimeMillis();
        __CLR4_1_1022t622t6lusqks7d.R.inc(96962);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_1_1022t622t6lusqks7d.R.iget(96963)!=0|true))||(__CLR4_1_1022t622t6lusqks7d.R.iget(96964)==0&false)); ++i) {{
            __CLR4_1_1022t622t6lusqks7d.R.inc(96965);JSON.parseObject(json, Model.class);
        }
        }__CLR4_1_1022t622t6lusqks7d.R.inc(96966);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1022t622t6lusqks7d.R.inc(96967);System.out.println("millis : " + millis);
    }finally{__CLR4_1_1022t622t6lusqks7d.R.flushNeeded();}}

    public static void perf2() {try{__CLR4_1_1022t622t6lusqks7d.R.inc(96968);
        __CLR4_1_1022t622t6lusqks7d.R.inc(96969);long start = System.currentTimeMillis();
        __CLR4_1_1022t622t6lusqks7d.R.inc(96970);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_1_1022t622t6lusqks7d.R.iget(96971)!=0|true))||(__CLR4_1_1022t622t6lusqks7d.R.iget(96972)==0&false)); ++i) {{
            __CLR4_1_1022t622t6lusqks7d.R.inc(96973);JSON.parseObject(json2, Model.class);
        }
        }__CLR4_1_1022t622t6lusqks7d.R.inc(96974);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1022t622t6lusqks7d.R.inc(96975);System.out.println("millis : " + millis);
    }finally{__CLR4_1_1022t622t6lusqks7d.R.flushNeeded();}}

    public static void perf3() {try{__CLR4_1_1022t622t6lusqks7d.R.inc(96976);
        __CLR4_1_1022t622t6lusqks7d.R.inc(96977);long start = System.currentTimeMillis();
        __CLR4_1_1022t622t6lusqks7d.R.inc(96978);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_1_1022t622t6lusqks7d.R.iget(96979)!=0|true))||(__CLR4_1_1022t622t6lusqks7d.R.iget(96980)==0&false)); ++i) {{
            __CLR4_1_1022t622t6lusqks7d.R.inc(96981);JSON.parseObject(json3, Model.class);
        }
        }__CLR4_1_1022t622t6lusqks7d.R.inc(96982);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1022t622t6lusqks7d.R.inc(96983);System.out.println("millis : " + millis);
    }finally{__CLR4_1_1022t622t6lusqks7d.R.flushNeeded();}}

    public static class Model {
        public int v1;
        public int v2;
        public int v3;
        public int v4;
        public int v5;
    }
}
