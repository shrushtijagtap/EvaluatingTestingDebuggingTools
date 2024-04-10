/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.benchmark.basic;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;

import java.util.Random;

/**
 * Created by wenshao on 04/08/2017.
 */
public class ByteBenchmark_arrayMapping_obj {public static class __CLR4_5_222kt22ktlusyjwp9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,96681,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static String json = "[-55,67,107,96,-119]";
    static String json2 = "[\"-55\",\"67\",\"107\",\"96\",\"-119\"]";

    public static void main(String[] args) throws Exception {try{__CLR4_5_222kt22ktlusyjwp9.R.inc(96653);
        __CLR4_5_222kt22ktlusyjwp9.R.inc(96654);Model model = new Model();
        __CLR4_5_222kt22ktlusyjwp9.R.inc(96655);model.v1 = (byte) new Random().nextInt();
        __CLR4_5_222kt22ktlusyjwp9.R.inc(96656);model.v2 = (byte) new Random().nextInt();
        __CLR4_5_222kt22ktlusyjwp9.R.inc(96657);model.v3 = (byte) new Random().nextInt();
        __CLR4_5_222kt22ktlusyjwp9.R.inc(96658);model.v4 = (byte) new Random().nextInt();
        __CLR4_5_222kt22ktlusyjwp9.R.inc(96659);model.v5 = (byte) new Random().nextInt();

        __CLR4_5_222kt22ktlusyjwp9.R.inc(96660);System.out.println(JSON.toJSONString(model));

        __CLR4_5_222kt22ktlusyjwp9.R.inc(96661);for (int i = 0; (((i < 10)&&(__CLR4_5_222kt22ktlusyjwp9.R.iget(96662)!=0|true))||(__CLR4_5_222kt22ktlusyjwp9.R.iget(96663)==0&false)); ++i) {{
//             perf(); // 818
            __CLR4_5_222kt22ktlusyjwp9.R.inc(96664);perf2(); // 903
        }
    }}finally{__CLR4_5_222kt22ktlusyjwp9.R.flushNeeded();}}

    public static void perf() {try{__CLR4_5_222kt22ktlusyjwp9.R.inc(96665);
        __CLR4_5_222kt22ktlusyjwp9.R.inc(96666);long start = System.currentTimeMillis();
        __CLR4_5_222kt22ktlusyjwp9.R.inc(96667);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_222kt22ktlusyjwp9.R.iget(96668)!=0|true))||(__CLR4_5_222kt22ktlusyjwp9.R.iget(96669)==0&false)); ++i) {{
            __CLR4_5_222kt22ktlusyjwp9.R.inc(96670);JSON.parseObject(json, Model.class, Feature.SupportArrayToBean);
        }
        }__CLR4_5_222kt22ktlusyjwp9.R.inc(96671);long millis = System.currentTimeMillis() - start;
        __CLR4_5_222kt22ktlusyjwp9.R.inc(96672);System.out.println("millis : " + millis);
    }finally{__CLR4_5_222kt22ktlusyjwp9.R.flushNeeded();}}

    public static void perf2() {try{__CLR4_5_222kt22ktlusyjwp9.R.inc(96673);
        __CLR4_5_222kt22ktlusyjwp9.R.inc(96674);long start = System.currentTimeMillis();
        __CLR4_5_222kt22ktlusyjwp9.R.inc(96675);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_222kt22ktlusyjwp9.R.iget(96676)!=0|true))||(__CLR4_5_222kt22ktlusyjwp9.R.iget(96677)==0&false)); ++i) {{
            __CLR4_5_222kt22ktlusyjwp9.R.inc(96678);JSON.parseObject(json2, Model.class, Feature.SupportArrayToBean);
        }
        }__CLR4_5_222kt22ktlusyjwp9.R.inc(96679);long millis = System.currentTimeMillis() - start;
        __CLR4_5_222kt22ktlusyjwp9.R.inc(96680);System.out.println("millis : " + millis);
    }finally{__CLR4_5_222kt22ktlusyjwp9.R.flushNeeded();}}

    public static class Model {
        public Byte v1;
        public Byte v2;
        public Byte v3;
        public Byte v4;
        public Byte v5;
    }
}
