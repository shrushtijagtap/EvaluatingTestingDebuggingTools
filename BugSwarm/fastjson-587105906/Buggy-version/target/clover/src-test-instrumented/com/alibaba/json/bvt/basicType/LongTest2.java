/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.basicType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;

import java.io.StringReader;

/**
 * Created by wenshao on 11/08/2017.
 */
public class LongTest2 extends TestCase {static class __CLR4_1_1012j512j5lusqk11b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,49988,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_1_1012j512j5lusqk11b.R.globalSliceStart(getClass().getName(),49937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp212j5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012j512j5lusqk11b.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012j512j5lusqk11b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.LongTest2.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),49937,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp212j5() throws Exception{try{__CLR4_1_1012j512j5lusqk11b.R.inc(49937);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49938);String json = "{\"v1\":-1883391953414482124,\"v2\":-3019416596934963650,\"v3\":6497525620823745793,\"v4\":2136224289077142499,\"v5\":-2090575024006307745}";
        __CLR4_1_1012j512j5lusqk11b.R.inc(49939);String json2 = "{\"v1\":\"-1883391953414482124\",\"v2\":\"-3019416596934963650\",\"v3\":\"6497525620823745793\",\"v4\":\"2136224289077142499\",\"v5\":\"-2090575024006307745\"}";

        __CLR4_1_1012j512j5lusqk11b.R.inc(49940);Model m1 = JSON.parseObject(json, Model.class);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49941);Model m2 = JSON.parseObject(json2, Model.class);

        __CLR4_1_1012j512j5lusqk11b.R.inc(49942);assertNotNull(m1);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49943);assertNotNull(m2);

        __CLR4_1_1012j512j5lusqk11b.R.inc(49944);assertEquals(-1883391953414482124L, m1.v1);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49945);assertEquals(-3019416596934963650L, m1.v2);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49946);assertEquals(6497525620823745793L, m1.v3);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49947);assertEquals(2136224289077142499L, m1.v4);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49948);assertEquals(-2090575024006307745L, m1.v5);

        __CLR4_1_1012j512j5lusqk11b.R.inc(49949);assertEquals(-1883391953414482124L, m2.v1);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49950);assertEquals(-3019416596934963650L, m2.v2);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49951);assertEquals(6497525620823745793L, m2.v3);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49952);assertEquals(2136224289077142499L, m2.v4);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49953);assertEquals(-2090575024006307745L, m2.v5);
    }finally{__CLR4_1_1012j512j5lusqk11b.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_1012j512j5lusqk11b.R.globalSliceStart(getClass().getName(),49954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl12jm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012j512j5lusqk11b.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012j512j5lusqk11b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.LongTest2.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),49954,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl12jm() throws Exception{try{__CLR4_1_1012j512j5lusqk11b.R.inc(49954);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49955);String json = "{\"v1\":-1883391953414482124,\"v2\":-3019416596934963650,\"v3\":6497525620823745793,\"v4\":2136224289077142499,\"v5\":-2090575024006307745}";
        __CLR4_1_1012j512j5lusqk11b.R.inc(49956);String json2 = "{\"v1\":\"-1883391953414482124\",\"v2\":\"-3019416596934963650\",\"v3\":\"6497525620823745793\",\"v4\":\"2136224289077142499\",\"v5\":\"-2090575024006307745\"}";

        __CLR4_1_1012j512j5lusqk11b.R.inc(49957);Model m1 = new JSONReader(new StringReader(json)).readObject(Model.class);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49958);Model m2 = new JSONReader(new StringReader(json2)).readObject(Model.class);

        __CLR4_1_1012j512j5lusqk11b.R.inc(49959);assertNotNull(m1);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49960);assertNotNull(m2);

        __CLR4_1_1012j512j5lusqk11b.R.inc(49961);assertEquals(-1883391953414482124L, m1.v1);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49962);assertEquals(-3019416596934963650L, m1.v2);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49963);assertEquals(6497525620823745793L, m1.v3);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49964);assertEquals(2136224289077142499L, m1.v4);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49965);assertEquals(-2090575024006307745L, m1.v5);

        __CLR4_1_1012j512j5lusqk11b.R.inc(49966);assertEquals(-1883391953414482124L, m2.v1);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49967);assertEquals(-3019416596934963650L, m2.v2);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49968);assertEquals(6497525620823745793L, m2.v3);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49969);assertEquals(2136224289077142499L, m2.v4);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49970);assertEquals(-2090575024006307745L, m2.v5);
    }finally{__CLR4_1_1012j512j5lusqk11b.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_1012j512j5lusqk11b.R.globalSliceStart(getClass().getName(),49971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k4412k3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012j512j5lusqk11b.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012j512j5lusqk11b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.LongTest2.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),49971,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k4412k3() throws Exception{try{__CLR4_1_1012j512j5lusqk11b.R.inc(49971);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49972);String json = "[-1883391953414482124,-3019416596934963650,6497525620823745793,2136224289077142499,-2090575024006307745]";
        __CLR4_1_1012j512j5lusqk11b.R.inc(49973);String json2 = "[\"-1883391953414482124\",\"-3019416596934963650\",\"6497525620823745793\",\"2136224289077142499\",\"-2090575024006307745\"]";

        __CLR4_1_1012j512j5lusqk11b.R.inc(49974);Model m1 = new JSONReader(new StringReader(json), Feature.SupportArrayToBean).readObject(Model.class);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49975);Model m2 = new JSONReader(new StringReader(json2), Feature.SupportArrayToBean).readObject(Model.class);

        __CLR4_1_1012j512j5lusqk11b.R.inc(49976);assertNotNull(m1);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49977);assertNotNull(m2);

        __CLR4_1_1012j512j5lusqk11b.R.inc(49978);assertEquals(-1883391953414482124L, m1.v1);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49979);assertEquals(-3019416596934963650L, m1.v2);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49980);assertEquals(6497525620823745793L, m1.v3);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49981);assertEquals(2136224289077142499L, m1.v4);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49982);assertEquals(-2090575024006307745L, m1.v5);

        __CLR4_1_1012j512j5lusqk11b.R.inc(49983);assertEquals(-1883391953414482124L, m2.v1);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49984);assertEquals(-3019416596934963650L, m2.v2);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49985);assertEquals(6497525620823745793L, m2.v3);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49986);assertEquals(2136224289077142499L, m2.v4);
        __CLR4_1_1012j512j5lusqk11b.R.inc(49987);assertEquals(-2090575024006307745L, m2.v5);
    }finally{__CLR4_1_1012j512j5lusqk11b.R.flushNeeded();}}

    public static class Model {
        public long v1;
        public long v2;
        public long v3;
        public long v4;
        public long v5;
    }
}
