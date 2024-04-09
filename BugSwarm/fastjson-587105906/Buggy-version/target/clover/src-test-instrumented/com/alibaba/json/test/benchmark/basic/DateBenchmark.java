/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.benchmark.basic;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by wenshao on 04/08/2017.
 */
public class DateBenchmark {public static class __CLR4_1_1022mo22molusqks2p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,96765,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static String json = "{\"v1\":\"2017-08-16 04:29:00\",\"v2\":\"2017-08-16 04:29:00\",\"v3\":\"2017-08-16 04:29:00\",\"v4\":\"2017-08-16 04:29:00\",\"v5\":\"2017-08-16 04:29:00\"}";
    static String json2 = "{\"v1\":1502828940000,\"v2\":1502828940000,\"v3\":1502828940000,\"v4\":1502828940000,\"v5\":1502828940000}";
    static String json3 = "[\"2017-08-16 04:29:00\",\"2017-08-16 04:29:00\",\"2017-08-16 04:29:00\",\"2017-08-16 04:29:00\",\"2017-08-16 04:29:00\"]";
    static String json4 = "[1502828940000,1502828940000,1502828940000,1502828940000,1502828940000]";
    static String json_null_array = "[null,null,null,null,null]";

    public static void main(String[] args) throws Exception {try{__CLR4_1_1022mo22molusqks2p.R.inc(96720);
//        Model model = new Model();
//        model.v1 = new Random().nextDouble();
//        model.v2 = new Random().nextDouble();
//        model.v3 = new Random().nextDouble();
//        model.v4 = new Random().nextDouble();
//        model.v5 = new Random().nextDouble();
//
//        System.out.println(JSON.toJSONString(model));

        __CLR4_1_1022mo22molusqks2p.R.inc(96721);for (int i = 0; (((i < 5)&&(__CLR4_1_1022mo22molusqks2p.R.iget(96722)!=0|true))||(__CLR4_1_1022mo22molusqks2p.R.iget(96723)==0&false)); ++i) {{
             __CLR4_1_1022mo22molusqks2p.R.inc(96724);perf(); // 18540
//            perf2(); // 2205
//            perf3(); // 22660 20963 18566
//            perf4(); // 2020
//            perf_null_array(); // 841
        }
    }}finally{__CLR4_1_1022mo22molusqks2p.R.flushNeeded();}}

    public static void perf() {try{__CLR4_1_1022mo22molusqks2p.R.inc(96725);
        __CLR4_1_1022mo22molusqks2p.R.inc(96726);long start = System.currentTimeMillis();
        __CLR4_1_1022mo22molusqks2p.R.inc(96727);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_1_1022mo22molusqks2p.R.iget(96728)!=0|true))||(__CLR4_1_1022mo22molusqks2p.R.iget(96729)==0&false)); ++i) {{
            __CLR4_1_1022mo22molusqks2p.R.inc(96730);JSON.parseObject(json, Model.class);
        }
        }__CLR4_1_1022mo22molusqks2p.R.inc(96731);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1022mo22molusqks2p.R.inc(96732);System.out.println("millis : " + millis);
    }finally{__CLR4_1_1022mo22molusqks2p.R.flushNeeded();}}

    public static void perf2() {try{__CLR4_1_1022mo22molusqks2p.R.inc(96733);
        __CLR4_1_1022mo22molusqks2p.R.inc(96734);long start = System.currentTimeMillis();
        __CLR4_1_1022mo22molusqks2p.R.inc(96735);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_1_1022mo22molusqks2p.R.iget(96736)!=0|true))||(__CLR4_1_1022mo22molusqks2p.R.iget(96737)==0&false)); ++i) {{
            __CLR4_1_1022mo22molusqks2p.R.inc(96738);JSON.parseObject(json2, Model.class);
        }
        }__CLR4_1_1022mo22molusqks2p.R.inc(96739);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1022mo22molusqks2p.R.inc(96740);System.out.println("millis : " + millis);
    }finally{__CLR4_1_1022mo22molusqks2p.R.flushNeeded();}}

    public static void perf3() {try{__CLR4_1_1022mo22molusqks2p.R.inc(96741);
        __CLR4_1_1022mo22molusqks2p.R.inc(96742);long start = System.currentTimeMillis();
        __CLR4_1_1022mo22molusqks2p.R.inc(96743);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_1_1022mo22molusqks2p.R.iget(96744)!=0|true))||(__CLR4_1_1022mo22molusqks2p.R.iget(96745)==0&false)); ++i) {{
            __CLR4_1_1022mo22molusqks2p.R.inc(96746);JSON.parseObject(json3, Model.class, Feature.SupportArrayToBean);
        }
        }__CLR4_1_1022mo22molusqks2p.R.inc(96747);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1022mo22molusqks2p.R.inc(96748);System.out.println("millis : " + millis);
    }finally{__CLR4_1_1022mo22molusqks2p.R.flushNeeded();}}

    public static void perf4() {try{__CLR4_1_1022mo22molusqks2p.R.inc(96749);
        __CLR4_1_1022mo22molusqks2p.R.inc(96750);long start = System.currentTimeMillis();
        __CLR4_1_1022mo22molusqks2p.R.inc(96751);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_1_1022mo22molusqks2p.R.iget(96752)!=0|true))||(__CLR4_1_1022mo22molusqks2p.R.iget(96753)==0&false)); ++i) {{
            __CLR4_1_1022mo22molusqks2p.R.inc(96754);JSON.parseObject(json4, Model.class, Feature.SupportArrayToBean);
        }
        }__CLR4_1_1022mo22molusqks2p.R.inc(96755);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1022mo22molusqks2p.R.inc(96756);System.out.println("millis : " + millis);
    }finally{__CLR4_1_1022mo22molusqks2p.R.flushNeeded();}}

    public static void perf_null_array() {try{__CLR4_1_1022mo22molusqks2p.R.inc(96757);
        __CLR4_1_1022mo22molusqks2p.R.inc(96758);long start = System.currentTimeMillis();
        __CLR4_1_1022mo22molusqks2p.R.inc(96759);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_1_1022mo22molusqks2p.R.iget(96760)!=0|true))||(__CLR4_1_1022mo22molusqks2p.R.iget(96761)==0&false)); ++i) {{
            __CLR4_1_1022mo22molusqks2p.R.inc(96762);JSON.parseObject(json_null_array, Model.class, Feature.SupportArrayToBean);
        }
        }__CLR4_1_1022mo22molusqks2p.R.inc(96763);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1022mo22molusqks2p.R.inc(96764);System.out.println("millis : " + millis);
    }finally{__CLR4_1_1022mo22molusqks2p.R.flushNeeded();}}

    public static class Model {
        public Date v1;
        public Date v2;
        public Date v3;
        public Date v4;
        public Date v5;
    }
}
