/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.benchmark.basic;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;

import java.util.Random;

/**
 * Created by wenshao on 04/08/2017.
 */
public class ByteBenchmark_arrayMapping_obj {public static class __CLR4_5_223j123j1lusvnkgq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,97913,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static String json = "[-55,67,107,96,-119]";
    static String json2 = "[\"-55\",\"67\",\"107\",\"96\",\"-119\"]";

    public static void main(String[] args) throws Exception {try{__CLR4_5_223j123j1lusvnkgq.R.inc(97885);
        __CLR4_5_223j123j1lusvnkgq.R.inc(97886);Model model = new Model();
        __CLR4_5_223j123j1lusvnkgq.R.inc(97887);model.v1 = (byte) new Random().nextInt();
        __CLR4_5_223j123j1lusvnkgq.R.inc(97888);model.v2 = (byte) new Random().nextInt();
        __CLR4_5_223j123j1lusvnkgq.R.inc(97889);model.v3 = (byte) new Random().nextInt();
        __CLR4_5_223j123j1lusvnkgq.R.inc(97890);model.v4 = (byte) new Random().nextInt();
        __CLR4_5_223j123j1lusvnkgq.R.inc(97891);model.v5 = (byte) new Random().nextInt();

        __CLR4_5_223j123j1lusvnkgq.R.inc(97892);System.out.println(JSON.toJSONString(model));

        __CLR4_5_223j123j1lusvnkgq.R.inc(97893);for (int i = 0; (((i < 10)&&(__CLR4_5_223j123j1lusvnkgq.R.iget(97894)!=0|true))||(__CLR4_5_223j123j1lusvnkgq.R.iget(97895)==0&false)); ++i) {{
//             perf(); // 818
            __CLR4_5_223j123j1lusvnkgq.R.inc(97896);perf2(); // 903
        }
    }}finally{__CLR4_5_223j123j1lusvnkgq.R.flushNeeded();}}

    public static void perf() {try{__CLR4_5_223j123j1lusvnkgq.R.inc(97897);
        __CLR4_5_223j123j1lusvnkgq.R.inc(97898);long start = System.currentTimeMillis();
        __CLR4_5_223j123j1lusvnkgq.R.inc(97899);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_223j123j1lusvnkgq.R.iget(97900)!=0|true))||(__CLR4_5_223j123j1lusvnkgq.R.iget(97901)==0&false)); ++i) {{
            __CLR4_5_223j123j1lusvnkgq.R.inc(97902);JSON.parseObject(json, Model.class, Feature.SupportArrayToBean);
        }
        }__CLR4_5_223j123j1lusvnkgq.R.inc(97903);long millis = System.currentTimeMillis() - start;
        __CLR4_5_223j123j1lusvnkgq.R.inc(97904);System.out.println("millis : " + millis);
    }finally{__CLR4_5_223j123j1lusvnkgq.R.flushNeeded();}}

    public static void perf2() {try{__CLR4_5_223j123j1lusvnkgq.R.inc(97905);
        __CLR4_5_223j123j1lusvnkgq.R.inc(97906);long start = System.currentTimeMillis();
        __CLR4_5_223j123j1lusvnkgq.R.inc(97907);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_223j123j1lusvnkgq.R.iget(97908)!=0|true))||(__CLR4_5_223j123j1lusvnkgq.R.iget(97909)==0&false)); ++i) {{
            __CLR4_5_223j123j1lusvnkgq.R.inc(97910);JSON.parseObject(json2, Model.class, Feature.SupportArrayToBean);
        }
        }__CLR4_5_223j123j1lusvnkgq.R.inc(97911);long millis = System.currentTimeMillis() - start;
        __CLR4_5_223j123j1lusvnkgq.R.inc(97912);System.out.println("millis : " + millis);
    }finally{__CLR4_5_223j123j1lusvnkgq.R.flushNeeded();}}

    public static class Model {
        public Byte v1;
        public Byte v2;
        public Byte v3;
        public Byte v4;
        public Byte v5;
    }
}
