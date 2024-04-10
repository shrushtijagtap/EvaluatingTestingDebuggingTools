/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.benchmark.basic;

import com.alibaba.fastjson.JSON;

import java.util.Random;

/**
 * Created by wenshao on 04/08/2017.
 */
public class ByteBenchmark_obj {public static class __CLR4_5_222ll22lllusyjwpb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,96709,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static String json = "{\"v1\":-55,\"v2\":67,\"v3\":107,\"v4\":96,\"v5\":-119}";
    static String json2 = "{\"v1\":\"-55\",\"v2\":\"67\",\"v3\":\"107\",\"v4\":\"96\",\"v5\":\"-119\"}";

    public static void main(String[] args) throws Exception {try{__CLR4_5_222ll22lllusyjwpb.R.inc(96681);
        __CLR4_5_222ll22lllusyjwpb.R.inc(96682);Model model = new Model();
        __CLR4_5_222ll22lllusyjwpb.R.inc(96683);model.v1 = (byte) new Random().nextInt();
        __CLR4_5_222ll22lllusyjwpb.R.inc(96684);model.v2 = (byte) new Random().nextInt();
        __CLR4_5_222ll22lllusyjwpb.R.inc(96685);model.v3 = (byte) new Random().nextInt();
        __CLR4_5_222ll22lllusyjwpb.R.inc(96686);model.v4 = (byte) new Random().nextInt();
        __CLR4_5_222ll22lllusyjwpb.R.inc(96687);model.v5 = (byte) new Random().nextInt();

        __CLR4_5_222ll22lllusyjwpb.R.inc(96688);System.out.println(JSON.toJSONString(model));

        __CLR4_5_222ll22lllusyjwpb.R.inc(96689);for (int i = 0; (((i < 10)&&(__CLR4_5_222ll22lllusyjwpb.R.iget(96690)!=0|true))||(__CLR4_5_222ll22lllusyjwpb.R.iget(96691)==0&false)); ++i) {{
             __CLR4_5_222ll22lllusyjwpb.R.inc(96692);perf(); // 1398
//            perf2(); // 1467
        }
    }}finally{__CLR4_5_222ll22lllusyjwpb.R.flushNeeded();}}

    public static void perf() {try{__CLR4_5_222ll22lllusyjwpb.R.inc(96693);
        __CLR4_5_222ll22lllusyjwpb.R.inc(96694);long start = System.currentTimeMillis();
        __CLR4_5_222ll22lllusyjwpb.R.inc(96695);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_222ll22lllusyjwpb.R.iget(96696)!=0|true))||(__CLR4_5_222ll22lllusyjwpb.R.iget(96697)==0&false)); ++i) {{
            __CLR4_5_222ll22lllusyjwpb.R.inc(96698);JSON.parseObject(json, Model.class);
        }
        }__CLR4_5_222ll22lllusyjwpb.R.inc(96699);long millis = System.currentTimeMillis() - start;
        __CLR4_5_222ll22lllusyjwpb.R.inc(96700);System.out.println("millis : " + millis);
    }finally{__CLR4_5_222ll22lllusyjwpb.R.flushNeeded();}}

    public static void perf2() {try{__CLR4_5_222ll22lllusyjwpb.R.inc(96701);
        __CLR4_5_222ll22lllusyjwpb.R.inc(96702);long start = System.currentTimeMillis();
        __CLR4_5_222ll22lllusyjwpb.R.inc(96703);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_222ll22lllusyjwpb.R.iget(96704)!=0|true))||(__CLR4_5_222ll22lllusyjwpb.R.iget(96705)==0&false)); ++i) {{
            __CLR4_5_222ll22lllusyjwpb.R.inc(96706);JSON.parseObject(json2, Model.class);
        }
        }__CLR4_5_222ll22lllusyjwpb.R.inc(96707);long millis = System.currentTimeMillis() - start;
        __CLR4_5_222ll22lllusyjwpb.R.inc(96708);System.out.println("millis : " + millis);
    }finally{__CLR4_5_222ll22lllusyjwpb.R.flushNeeded();}}

    public static class Model {
        public Byte v1;
        public Byte v2;
        public Byte v3;
        public Byte v4;
        public Byte v5;
    }
}
