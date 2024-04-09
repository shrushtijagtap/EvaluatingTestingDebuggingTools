/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.benchmark.basic;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by wenshao on 04/08/2017.
 */
public class DateBenchmark {public static class __CLR4_5_223kl23kllusvnkh3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,97986,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static String json = "{\"v1\":\"2017-08-16 04:29:00\",\"v2\":\"2017-08-16 04:29:00\",\"v3\":\"2017-08-16 04:29:00\",\"v4\":\"2017-08-16 04:29:00\",\"v5\":\"2017-08-16 04:29:00\"}";
    static String json2 = "{\"v1\":1502828940000,\"v2\":1502828940000,\"v3\":1502828940000,\"v4\":1502828940000,\"v5\":1502828940000}";
    static String json3 = "[\"2017-08-16 04:29:00\",\"2017-08-16 04:29:00\",\"2017-08-16 04:29:00\",\"2017-08-16 04:29:00\",\"2017-08-16 04:29:00\"]";
    static String json4 = "[1502828940000,1502828940000,1502828940000,1502828940000,1502828940000]";
    static String json_null_array = "[null,null,null,null,null]";

    public static void main(String[] args) throws Exception {try{__CLR4_5_223kl23kllusvnkh3.R.inc(97941);
//        Model model = new Model();
//        model.v1 = new Random().nextDouble();
//        model.v2 = new Random().nextDouble();
//        model.v3 = new Random().nextDouble();
//        model.v4 = new Random().nextDouble();
//        model.v5 = new Random().nextDouble();
//
//        System.out.println(JSON.toJSONString(model));

        __CLR4_5_223kl23kllusvnkh3.R.inc(97942);for (int i = 0; (((i < 5)&&(__CLR4_5_223kl23kllusvnkh3.R.iget(97943)!=0|true))||(__CLR4_5_223kl23kllusvnkh3.R.iget(97944)==0&false)); ++i) {{
             __CLR4_5_223kl23kllusvnkh3.R.inc(97945);perf(); // 18540
//            perf2(); // 2205
//            perf3(); // 22660 20963 18566
//            perf4(); // 2020
//            perf_null_array(); // 841
        }
    }}finally{__CLR4_5_223kl23kllusvnkh3.R.flushNeeded();}}

    public static void perf() {try{__CLR4_5_223kl23kllusvnkh3.R.inc(97946);
        __CLR4_5_223kl23kllusvnkh3.R.inc(97947);long start = System.currentTimeMillis();
        __CLR4_5_223kl23kllusvnkh3.R.inc(97948);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_223kl23kllusvnkh3.R.iget(97949)!=0|true))||(__CLR4_5_223kl23kllusvnkh3.R.iget(97950)==0&false)); ++i) {{
            __CLR4_5_223kl23kllusvnkh3.R.inc(97951);JSON.parseObject(json, Model.class);
        }
        }__CLR4_5_223kl23kllusvnkh3.R.inc(97952);long millis = System.currentTimeMillis() - start;
        __CLR4_5_223kl23kllusvnkh3.R.inc(97953);System.out.println("millis : " + millis);
    }finally{__CLR4_5_223kl23kllusvnkh3.R.flushNeeded();}}

    public static void perf2() {try{__CLR4_5_223kl23kllusvnkh3.R.inc(97954);
        __CLR4_5_223kl23kllusvnkh3.R.inc(97955);long start = System.currentTimeMillis();
        __CLR4_5_223kl23kllusvnkh3.R.inc(97956);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_223kl23kllusvnkh3.R.iget(97957)!=0|true))||(__CLR4_5_223kl23kllusvnkh3.R.iget(97958)==0&false)); ++i) {{
            __CLR4_5_223kl23kllusvnkh3.R.inc(97959);JSON.parseObject(json2, Model.class);
        }
        }__CLR4_5_223kl23kllusvnkh3.R.inc(97960);long millis = System.currentTimeMillis() - start;
        __CLR4_5_223kl23kllusvnkh3.R.inc(97961);System.out.println("millis : " + millis);
    }finally{__CLR4_5_223kl23kllusvnkh3.R.flushNeeded();}}

    public static void perf3() {try{__CLR4_5_223kl23kllusvnkh3.R.inc(97962);
        __CLR4_5_223kl23kllusvnkh3.R.inc(97963);long start = System.currentTimeMillis();
        __CLR4_5_223kl23kllusvnkh3.R.inc(97964);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_223kl23kllusvnkh3.R.iget(97965)!=0|true))||(__CLR4_5_223kl23kllusvnkh3.R.iget(97966)==0&false)); ++i) {{
            __CLR4_5_223kl23kllusvnkh3.R.inc(97967);JSON.parseObject(json3, Model.class, Feature.SupportArrayToBean);
        }
        }__CLR4_5_223kl23kllusvnkh3.R.inc(97968);long millis = System.currentTimeMillis() - start;
        __CLR4_5_223kl23kllusvnkh3.R.inc(97969);System.out.println("millis : " + millis);
    }finally{__CLR4_5_223kl23kllusvnkh3.R.flushNeeded();}}

    public static void perf4() {try{__CLR4_5_223kl23kllusvnkh3.R.inc(97970);
        __CLR4_5_223kl23kllusvnkh3.R.inc(97971);long start = System.currentTimeMillis();
        __CLR4_5_223kl23kllusvnkh3.R.inc(97972);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_223kl23kllusvnkh3.R.iget(97973)!=0|true))||(__CLR4_5_223kl23kllusvnkh3.R.iget(97974)==0&false)); ++i) {{
            __CLR4_5_223kl23kllusvnkh3.R.inc(97975);JSON.parseObject(json4, Model.class, Feature.SupportArrayToBean);
        }
        }__CLR4_5_223kl23kllusvnkh3.R.inc(97976);long millis = System.currentTimeMillis() - start;
        __CLR4_5_223kl23kllusvnkh3.R.inc(97977);System.out.println("millis : " + millis);
    }finally{__CLR4_5_223kl23kllusvnkh3.R.flushNeeded();}}

    public static void perf_null_array() {try{__CLR4_5_223kl23kllusvnkh3.R.inc(97978);
        __CLR4_5_223kl23kllusvnkh3.R.inc(97979);long start = System.currentTimeMillis();
        __CLR4_5_223kl23kllusvnkh3.R.inc(97980);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_223kl23kllusvnkh3.R.iget(97981)!=0|true))||(__CLR4_5_223kl23kllusvnkh3.R.iget(97982)==0&false)); ++i) {{
            __CLR4_5_223kl23kllusvnkh3.R.inc(97983);JSON.parseObject(json_null_array, Model.class, Feature.SupportArrayToBean);
        }
        }__CLR4_5_223kl23kllusvnkh3.R.inc(97984);long millis = System.currentTimeMillis() - start;
        __CLR4_5_223kl23kllusvnkh3.R.inc(97985);System.out.println("millis : " + millis);
    }finally{__CLR4_5_223kl23kllusvnkh3.R.flushNeeded();}}

    public static class Model {
        public Date v1;
        public Date v2;
        public Date v3;
        public Date v4;
        public Date v5;
    }
}
