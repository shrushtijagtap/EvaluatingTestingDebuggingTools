/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.benchmark.basic;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;

/**
 * Created by wenshao on 04/08/2017.
 */
public class DoubleBenchmark_arrayMapping_obj {public static class __CLR4_5_223n823n8lusvnkhh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,98057,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static String json = "[0.4430165316544028,0.22676692048907365,0.9766986818812096,0.3423751102308744,0.4262177938610565]";
    static String json2 = "[\"0.4430165316544028\",\"0.22676692048907365\",\"0.9766986818812096\",\"0.3423751102308744\",\"0.4262177938610565\"]";

    public static void main(String[] args) throws Exception {try{__CLR4_5_223n823n8lusvnkhh.R.inc(98036);
//        Model model = new Model();
//        model.v1 = new Random().nextDouble();
//        model.v2 = new Random().nextDouble();
//        model.v3 = new Random().nextDouble();
//        model.v4 = new Random().nextDouble();
//        model.v5 = new Random().nextDouble();
//
//        System.out.println(JSON.toJSONString(model));

        __CLR4_5_223n823n8lusvnkhh.R.inc(98037);for (int i = 0; (((i < 10)&&(__CLR4_5_223n823n8lusvnkhh.R.iget(98038)!=0|true))||(__CLR4_5_223n823n8lusvnkhh.R.iget(98039)==0&false)); ++i) {{
             __CLR4_5_223n823n8lusvnkhh.R.inc(98040);perf(); // 320
//            perf2(); // 330
        }
    }}finally{__CLR4_5_223n823n8lusvnkhh.R.flushNeeded();}}

    public static void perf() {try{__CLR4_5_223n823n8lusvnkhh.R.inc(98041);
        __CLR4_5_223n823n8lusvnkhh.R.inc(98042);long start = System.currentTimeMillis();
        __CLR4_5_223n823n8lusvnkhh.R.inc(98043);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_223n823n8lusvnkhh.R.iget(98044)!=0|true))||(__CLR4_5_223n823n8lusvnkhh.R.iget(98045)==0&false)); ++i) {{
            __CLR4_5_223n823n8lusvnkhh.R.inc(98046);JSON.parseObject(json, Model.class, Feature.SupportArrayToBean);
        }
        }__CLR4_5_223n823n8lusvnkhh.R.inc(98047);long millis = System.currentTimeMillis() - start;
        __CLR4_5_223n823n8lusvnkhh.R.inc(98048);System.out.println("millis : " + millis);
    }finally{__CLR4_5_223n823n8lusvnkhh.R.flushNeeded();}}

    public static void perf2() {try{__CLR4_5_223n823n8lusvnkhh.R.inc(98049);
        __CLR4_5_223n823n8lusvnkhh.R.inc(98050);long start = System.currentTimeMillis();
        __CLR4_5_223n823n8lusvnkhh.R.inc(98051);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_223n823n8lusvnkhh.R.iget(98052)!=0|true))||(__CLR4_5_223n823n8lusvnkhh.R.iget(98053)==0&false)); ++i) {{
            __CLR4_5_223n823n8lusvnkhh.R.inc(98054);JSON.parseObject(json2, Model.class, Feature.SupportArrayToBean);
        }
        }__CLR4_5_223n823n8lusvnkhh.R.inc(98055);long millis = System.currentTimeMillis() - start;
        __CLR4_5_223n823n8lusvnkhh.R.inc(98056);System.out.println("millis : " + millis);
    }finally{__CLR4_5_223n823n8lusvnkhh.R.flushNeeded();}}

    public static class Model {
        public Double v1;
        public Double v2;
        public Double v3;
        public Double v4;
        public Double v5;
    }
}
