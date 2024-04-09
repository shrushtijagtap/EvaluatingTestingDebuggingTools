/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.basicType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;

import java.io.StringReader;

/**
 * Created by wenshao on 11/08/2017.
 */
public class LongTest2 extends TestCase {static class __CLR4_5_213h213h2lusvn50v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,51209,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_5_213h213h2lusvn50v.R.globalSliceStart(getClass().getName(),51158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp213h2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213h213h2lusvn50v.R.rethrow($CLV_t2$);}finally{__CLR4_5_213h213h2lusvn50v.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.LongTest2.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51158,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp213h2() throws Exception{try{__CLR4_5_213h213h2lusvn50v.R.inc(51158);
        __CLR4_5_213h213h2lusvn50v.R.inc(51159);String json = "{\"v1\":-1883391953414482124,\"v2\":-3019416596934963650,\"v3\":6497525620823745793,\"v4\":2136224289077142499,\"v5\":-2090575024006307745}";
        __CLR4_5_213h213h2lusvn50v.R.inc(51160);String json2 = "{\"v1\":\"-1883391953414482124\",\"v2\":\"-3019416596934963650\",\"v3\":\"6497525620823745793\",\"v4\":\"2136224289077142499\",\"v5\":\"-2090575024006307745\"}";

        __CLR4_5_213h213h2lusvn50v.R.inc(51161);Model m1 = JSON.parseObject(json, Model.class);
        __CLR4_5_213h213h2lusvn50v.R.inc(51162);Model m2 = JSON.parseObject(json2, Model.class);

        __CLR4_5_213h213h2lusvn50v.R.inc(51163);assertNotNull(m1);
        __CLR4_5_213h213h2lusvn50v.R.inc(51164);assertNotNull(m2);

        __CLR4_5_213h213h2lusvn50v.R.inc(51165);assertEquals(-1883391953414482124L, m1.v1);
        __CLR4_5_213h213h2lusvn50v.R.inc(51166);assertEquals(-3019416596934963650L, m1.v2);
        __CLR4_5_213h213h2lusvn50v.R.inc(51167);assertEquals(6497525620823745793L, m1.v3);
        __CLR4_5_213h213h2lusvn50v.R.inc(51168);assertEquals(2136224289077142499L, m1.v4);
        __CLR4_5_213h213h2lusvn50v.R.inc(51169);assertEquals(-2090575024006307745L, m1.v5);

        __CLR4_5_213h213h2lusvn50v.R.inc(51170);assertEquals(-1883391953414482124L, m2.v1);
        __CLR4_5_213h213h2lusvn50v.R.inc(51171);assertEquals(-3019416596934963650L, m2.v2);
        __CLR4_5_213h213h2lusvn50v.R.inc(51172);assertEquals(6497525620823745793L, m2.v3);
        __CLR4_5_213h213h2lusvn50v.R.inc(51173);assertEquals(2136224289077142499L, m2.v4);
        __CLR4_5_213h213h2lusvn50v.R.inc(51174);assertEquals(-2090575024006307745L, m2.v5);
    }finally{__CLR4_5_213h213h2lusvn50v.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_213h213h2lusvn50v.R.globalSliceStart(getClass().getName(),51175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl13hj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213h213h2lusvn50v.R.rethrow($CLV_t2$);}finally{__CLR4_5_213h213h2lusvn50v.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.LongTest2.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51175,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl13hj() throws Exception{try{__CLR4_5_213h213h2lusvn50v.R.inc(51175);
        __CLR4_5_213h213h2lusvn50v.R.inc(51176);String json = "{\"v1\":-1883391953414482124,\"v2\":-3019416596934963650,\"v3\":6497525620823745793,\"v4\":2136224289077142499,\"v5\":-2090575024006307745}";
        __CLR4_5_213h213h2lusvn50v.R.inc(51177);String json2 = "{\"v1\":\"-1883391953414482124\",\"v2\":\"-3019416596934963650\",\"v3\":\"6497525620823745793\",\"v4\":\"2136224289077142499\",\"v5\":\"-2090575024006307745\"}";

        __CLR4_5_213h213h2lusvn50v.R.inc(51178);Model m1 = new JSONReader(new StringReader(json)).readObject(Model.class);
        __CLR4_5_213h213h2lusvn50v.R.inc(51179);Model m2 = new JSONReader(new StringReader(json2)).readObject(Model.class);

        __CLR4_5_213h213h2lusvn50v.R.inc(51180);assertNotNull(m1);
        __CLR4_5_213h213h2lusvn50v.R.inc(51181);assertNotNull(m2);

        __CLR4_5_213h213h2lusvn50v.R.inc(51182);assertEquals(-1883391953414482124L, m1.v1);
        __CLR4_5_213h213h2lusvn50v.R.inc(51183);assertEquals(-3019416596934963650L, m1.v2);
        __CLR4_5_213h213h2lusvn50v.R.inc(51184);assertEquals(6497525620823745793L, m1.v3);
        __CLR4_5_213h213h2lusvn50v.R.inc(51185);assertEquals(2136224289077142499L, m1.v4);
        __CLR4_5_213h213h2lusvn50v.R.inc(51186);assertEquals(-2090575024006307745L, m1.v5);

        __CLR4_5_213h213h2lusvn50v.R.inc(51187);assertEquals(-1883391953414482124L, m2.v1);
        __CLR4_5_213h213h2lusvn50v.R.inc(51188);assertEquals(-3019416596934963650L, m2.v2);
        __CLR4_5_213h213h2lusvn50v.R.inc(51189);assertEquals(6497525620823745793L, m2.v3);
        __CLR4_5_213h213h2lusvn50v.R.inc(51190);assertEquals(2136224289077142499L, m2.v4);
        __CLR4_5_213h213h2lusvn50v.R.inc(51191);assertEquals(-2090575024006307745L, m2.v5);
    }finally{__CLR4_5_213h213h2lusvn50v.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_213h213h2lusvn50v.R.globalSliceStart(getClass().getName(),51192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k4413i0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213h213h2lusvn50v.R.rethrow($CLV_t2$);}finally{__CLR4_5_213h213h2lusvn50v.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.LongTest2.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51192,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k4413i0() throws Exception{try{__CLR4_5_213h213h2lusvn50v.R.inc(51192);
        __CLR4_5_213h213h2lusvn50v.R.inc(51193);String json = "[-1883391953414482124,-3019416596934963650,6497525620823745793,2136224289077142499,-2090575024006307745]";
        __CLR4_5_213h213h2lusvn50v.R.inc(51194);String json2 = "[\"-1883391953414482124\",\"-3019416596934963650\",\"6497525620823745793\",\"2136224289077142499\",\"-2090575024006307745\"]";

        __CLR4_5_213h213h2lusvn50v.R.inc(51195);Model m1 = new JSONReader(new StringReader(json), Feature.SupportArrayToBean).readObject(Model.class);
        __CLR4_5_213h213h2lusvn50v.R.inc(51196);Model m2 = new JSONReader(new StringReader(json2), Feature.SupportArrayToBean).readObject(Model.class);

        __CLR4_5_213h213h2lusvn50v.R.inc(51197);assertNotNull(m1);
        __CLR4_5_213h213h2lusvn50v.R.inc(51198);assertNotNull(m2);

        __CLR4_5_213h213h2lusvn50v.R.inc(51199);assertEquals(-1883391953414482124L, m1.v1);
        __CLR4_5_213h213h2lusvn50v.R.inc(51200);assertEquals(-3019416596934963650L, m1.v2);
        __CLR4_5_213h213h2lusvn50v.R.inc(51201);assertEquals(6497525620823745793L, m1.v3);
        __CLR4_5_213h213h2lusvn50v.R.inc(51202);assertEquals(2136224289077142499L, m1.v4);
        __CLR4_5_213h213h2lusvn50v.R.inc(51203);assertEquals(-2090575024006307745L, m1.v5);

        __CLR4_5_213h213h2lusvn50v.R.inc(51204);assertEquals(-1883391953414482124L, m2.v1);
        __CLR4_5_213h213h2lusvn50v.R.inc(51205);assertEquals(-3019416596934963650L, m2.v2);
        __CLR4_5_213h213h2lusvn50v.R.inc(51206);assertEquals(6497525620823745793L, m2.v3);
        __CLR4_5_213h213h2lusvn50v.R.inc(51207);assertEquals(2136224289077142499L, m2.v4);
        __CLR4_5_213h213h2lusvn50v.R.inc(51208);assertEquals(-2090575024006307745L, m2.v5);
    }finally{__CLR4_5_213h213h2lusvn50v.R.flushNeeded();}}

    public static class Model {
        public long v1;
        public long v2;
        public long v3;
        public long v4;
        public long v5;
    }
}
