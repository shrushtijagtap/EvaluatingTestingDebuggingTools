/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.benchmark.basic;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;

import java.math.BigDecimal;

/**
 * Created by wenshao on 04/08/2017.
 */
public class BigDecimalBenchmark {public static class __CLR4_5_222he22helusyjwos{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,96559,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static String json = "{\"v1\":0.4430165316544028,\"v2\":0.22676692048907365,\"v3\":0.9766986818812096,\"v4\":0.3423751102308744,\"v5\":0.4262177938610565}";
    static String json2 = "{\"v1\":\"0.4430165316544028\",\"v2\":\"0.22676692048907365\",\"v3\":\"0.9766986818812096\",\"v4\":\"0.3423751102308744\",\"v5\":\"0.4262177938610565\"}";
    static String json3 = "[0.4430165316544028,0.22676692048907365,0.9766986818812096,0.3423751102308744,0.4262177938610565]";

    public static void main(String[] args) throws Exception {try{__CLR4_5_222he22helusyjwos.R.inc(96530);
//        Model model = new Model();
//        model.v1 = new Random().nextDouble();
//        model.v2 = new Random().nextDouble();
//        model.v3 = new Random().nextDouble();
//        model.v4 = new Random().nextDouble();
//        model.v5 = new Random().nextDouble();
//
//        System.out.println(JSON.toJSONString(model));

        __CLR4_5_222he22helusyjwos.R.inc(96531);for (int i = 0; (((i < 10)&&(__CLR4_5_222he22helusyjwos.R.iget(96532)!=0|true))||(__CLR4_5_222he22helusyjwos.R.iget(96533)==0&false)); ++i) {{
//             perf(); // 6806
//            perf2(); // 7181
            __CLR4_5_222he22helusyjwos.R.inc(96534);perf3(); // 7595 6707
        }
    }}finally{__CLR4_5_222he22helusyjwos.R.flushNeeded();}}

    public static void perf() {try{__CLR4_5_222he22helusyjwos.R.inc(96535);
        __CLR4_5_222he22helusyjwos.R.inc(96536);long start = System.currentTimeMillis();
        __CLR4_5_222he22helusyjwos.R.inc(96537);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_222he22helusyjwos.R.iget(96538)!=0|true))||(__CLR4_5_222he22helusyjwos.R.iget(96539)==0&false)); ++i) {{
            __CLR4_5_222he22helusyjwos.R.inc(96540);JSON.parseObject(json, Model.class);
        }
        }__CLR4_5_222he22helusyjwos.R.inc(96541);long millis = System.currentTimeMillis() - start;
        __CLR4_5_222he22helusyjwos.R.inc(96542);System.out.println("millis : " + millis);
    }finally{__CLR4_5_222he22helusyjwos.R.flushNeeded();}}

    public static void perf2() {try{__CLR4_5_222he22helusyjwos.R.inc(96543);
        __CLR4_5_222he22helusyjwos.R.inc(96544);long start = System.currentTimeMillis();
        __CLR4_5_222he22helusyjwos.R.inc(96545);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_222he22helusyjwos.R.iget(96546)!=0|true))||(__CLR4_5_222he22helusyjwos.R.iget(96547)==0&false)); ++i) {{
            __CLR4_5_222he22helusyjwos.R.inc(96548);JSON.parseObject(json2, Model.class);
        }
        }__CLR4_5_222he22helusyjwos.R.inc(96549);long millis = System.currentTimeMillis() - start;
        __CLR4_5_222he22helusyjwos.R.inc(96550);System.out.println("millis : " + millis);
    }finally{__CLR4_5_222he22helusyjwos.R.flushNeeded();}}

    public static void perf3() {try{__CLR4_5_222he22helusyjwos.R.inc(96551);
        __CLR4_5_222he22helusyjwos.R.inc(96552);long start = System.currentTimeMillis();
        __CLR4_5_222he22helusyjwos.R.inc(96553);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_222he22helusyjwos.R.iget(96554)!=0|true))||(__CLR4_5_222he22helusyjwos.R.iget(96555)==0&false)); ++i) {{
            __CLR4_5_222he22helusyjwos.R.inc(96556);JSON.parseObject(json3, Model.class, Feature.SupportArrayToBean);
        }
        }__CLR4_5_222he22helusyjwos.R.inc(96557);long millis = System.currentTimeMillis() - start;
        __CLR4_5_222he22helusyjwos.R.inc(96558);System.out.println("millis : " + millis);
    }finally{__CLR4_5_222he22helusyjwos.R.flushNeeded();}}

    public static class Model {
        public BigDecimal v1;
        public BigDecimal v2;
        public BigDecimal v3;
        public BigDecimal v4;
        public BigDecimal v5;
    }
}
