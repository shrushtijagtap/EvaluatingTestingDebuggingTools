/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.benchmark.basic;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;

import java.util.Date;
import java.util.UUID;

/**
 * Created by wenshao on 04/08/2017.
 */
public class UUIDBenchmark {public static class __CLR4_5_223xb23xblusvnkjb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,98452,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static String json = "{\"v1\":\"d3ab4486-f6c5-4419-8a06-12b0d5853cbe\",\"v2\":\"aae4fb77-e5b3-4e3a-b331-d2fbbf812d8f\",\"v3\":\"99717c8d-5c39-4f1b-b44c-548bf5dd6060\",\"v4\":\"6269e62f-67ba-463d-a38e-c568c25571fb\",\"v5\":\"62be2c96-472a-4253-938b-e71a131c1670\"}";
    static String json2 = "{\"v1\":\"d3ab4486f6c544198a0612b0d5853cbe\",\"v2\":\"aae4fb77e5b34e3ab331d2fbbf812d8f\",\"v3\":\"99717c8d5c394f1bb44c548bf5dd6060\",\"v4\":\"6269e62f67ba463da38ec568c25571fb\",\"v5\":\"62be2c96472a4253938be71a131c1670\"}";
    static String json_null = "{\"v1\":null,\"v2\":null,\"v3\":null,\"v4\":null,\"v5\":null}";
    static String json3 = "[\"d3ab4486-f6c5-4419-8a06-12b0d5853cbe\",\"aae4fb77-e5b3-4e3a-b331-d2fbbf812d8f\",\"99717c8d-5c39-4f1b-b44c-548bf5dd6060\",\"6269e62f-67ba-463d-a38e-c568c25571fb\",\"62be2c96-472a-4253-938b-e71a131c1670\"]";
    static String json4 = "[\"d3ab4486f6c544198a0612b0d5853cbe\",\"aae4fb77e5b34e3ab331d2fbbf812d8f\",\"99717c8d5c394f1bb44c548bf5dd6060\",\"6269e62f67ba463da38ec568c25571fb\",\"62be2c96472a4253938be71a131c1670\"]";
    static String json_null_array = "[null,null,null,null,null]";

    public static void main(String[] args) throws Exception {try{__CLR4_5_223xb23xblusvnkjb.R.inc(98399);
//        Model model = new Model();
//        model.v1 = UUID.randomUUID();
//        model.v2 = UUID.randomUUID();
//        model.v3 = UUID.randomUUID();
//        model.v4 = UUID.randomUUID();
//        model.v5 = UUID.randomUUID();
//
//        System.out.println(JSON.toJSONString(model));


        __CLR4_5_223xb23xblusvnkjb.R.inc(98400);for (int i = 0; (((i < 10)&&(__CLR4_5_223xb23xblusvnkjb.R.iget(98401)!=0|true))||(__CLR4_5_223xb23xblusvnkjb.R.iget(98402)==0&false)); ++i) {{
//             perf(); // 25021 24135 4977
//            perf2(); // 4276
//            perf_null(); // 4244 1278
//            perf3(); // 25247 3970
//            perf4(); // 3733
            __CLR4_5_223xb23xblusvnkjb.R.inc(98403);perf_null_array(); // 746
        }
    }}finally{__CLR4_5_223xb23xblusvnkjb.R.flushNeeded();}}

    public static void perf() {try{__CLR4_5_223xb23xblusvnkjb.R.inc(98404);
        __CLR4_5_223xb23xblusvnkjb.R.inc(98405);long start = System.currentTimeMillis();
        __CLR4_5_223xb23xblusvnkjb.R.inc(98406);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_223xb23xblusvnkjb.R.iget(98407)!=0|true))||(__CLR4_5_223xb23xblusvnkjb.R.iget(98408)==0&false)); ++i) {{
            __CLR4_5_223xb23xblusvnkjb.R.inc(98409);JSON.parseObject(json, Model.class);
        }
        }__CLR4_5_223xb23xblusvnkjb.R.inc(98410);long millis = System.currentTimeMillis() - start;
        __CLR4_5_223xb23xblusvnkjb.R.inc(98411);System.out.println("millis : " + millis);
    }finally{__CLR4_5_223xb23xblusvnkjb.R.flushNeeded();}}

    public static void perf2() {try{__CLR4_5_223xb23xblusvnkjb.R.inc(98412);
        __CLR4_5_223xb23xblusvnkjb.R.inc(98413);long start = System.currentTimeMillis();
        __CLR4_5_223xb23xblusvnkjb.R.inc(98414);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_223xb23xblusvnkjb.R.iget(98415)!=0|true))||(__CLR4_5_223xb23xblusvnkjb.R.iget(98416)==0&false)); ++i) {{
            __CLR4_5_223xb23xblusvnkjb.R.inc(98417);JSON.parseObject(json2, Model.class);
        }
        }__CLR4_5_223xb23xblusvnkjb.R.inc(98418);long millis = System.currentTimeMillis() - start;
        __CLR4_5_223xb23xblusvnkjb.R.inc(98419);System.out.println("millis : " + millis);
    }finally{__CLR4_5_223xb23xblusvnkjb.R.flushNeeded();}}

    public static void perf_null() {try{__CLR4_5_223xb23xblusvnkjb.R.inc(98420);
        __CLR4_5_223xb23xblusvnkjb.R.inc(98421);long start = System.currentTimeMillis();
        __CLR4_5_223xb23xblusvnkjb.R.inc(98422);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_223xb23xblusvnkjb.R.iget(98423)!=0|true))||(__CLR4_5_223xb23xblusvnkjb.R.iget(98424)==0&false)); ++i) {{
            __CLR4_5_223xb23xblusvnkjb.R.inc(98425);JSON.parseObject(json_null, Model.class);
        }
        }__CLR4_5_223xb23xblusvnkjb.R.inc(98426);long millis = System.currentTimeMillis() - start;
        __CLR4_5_223xb23xblusvnkjb.R.inc(98427);System.out.println("millis : " + millis);
    }finally{__CLR4_5_223xb23xblusvnkjb.R.flushNeeded();}}

    public static void perf3() {try{__CLR4_5_223xb23xblusvnkjb.R.inc(98428);
        __CLR4_5_223xb23xblusvnkjb.R.inc(98429);long start = System.currentTimeMillis();
        __CLR4_5_223xb23xblusvnkjb.R.inc(98430);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_223xb23xblusvnkjb.R.iget(98431)!=0|true))||(__CLR4_5_223xb23xblusvnkjb.R.iget(98432)==0&false)); ++i) {{
            __CLR4_5_223xb23xblusvnkjb.R.inc(98433);JSON.parseObject(json3, Model.class, Feature.SupportArrayToBean);
        }
        }__CLR4_5_223xb23xblusvnkjb.R.inc(98434);long millis = System.currentTimeMillis() - start;
        __CLR4_5_223xb23xblusvnkjb.R.inc(98435);System.out.println("millis : " + millis);
    }finally{__CLR4_5_223xb23xblusvnkjb.R.flushNeeded();}}

    public static void perf4() {try{__CLR4_5_223xb23xblusvnkjb.R.inc(98436);
        __CLR4_5_223xb23xblusvnkjb.R.inc(98437);long start = System.currentTimeMillis();
        __CLR4_5_223xb23xblusvnkjb.R.inc(98438);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_223xb23xblusvnkjb.R.iget(98439)!=0|true))||(__CLR4_5_223xb23xblusvnkjb.R.iget(98440)==0&false)); ++i) {{
            __CLR4_5_223xb23xblusvnkjb.R.inc(98441);JSON.parseObject(json4, Model.class, Feature.SupportArrayToBean);
        }
        }__CLR4_5_223xb23xblusvnkjb.R.inc(98442);long millis = System.currentTimeMillis() - start;
        __CLR4_5_223xb23xblusvnkjb.R.inc(98443);System.out.println("millis : " + millis);
    }finally{__CLR4_5_223xb23xblusvnkjb.R.flushNeeded();}}

    public static void perf_null_array() {try{__CLR4_5_223xb23xblusvnkjb.R.inc(98444);
        __CLR4_5_223xb23xblusvnkjb.R.inc(98445);long start = System.currentTimeMillis();
        __CLR4_5_223xb23xblusvnkjb.R.inc(98446);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_223xb23xblusvnkjb.R.iget(98447)!=0|true))||(__CLR4_5_223xb23xblusvnkjb.R.iget(98448)==0&false)); ++i) {{
            __CLR4_5_223xb23xblusvnkjb.R.inc(98449);JSON.parseObject(json_null_array, Model.class, Feature.SupportArrayToBean);
        }
        }__CLR4_5_223xb23xblusvnkjb.R.inc(98450);long millis = System.currentTimeMillis() - start;
        __CLR4_5_223xb23xblusvnkjb.R.inc(98451);System.out.println("millis : " + millis);
    }finally{__CLR4_5_223xb23xblusvnkjb.R.flushNeeded();}}

    public static class Model {
        public UUID v1;
        public UUID v2;
        public UUID v3;
        public UUID v4;
        public UUID v5;
    }
}
