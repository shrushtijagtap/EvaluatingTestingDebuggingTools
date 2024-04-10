/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.basicType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;

import java.io.StringReader;

/**
 * Created by wenshao on 11/08/2017.
 */
public class LongTest2_obj extends TestCase {static class __CLR4_5_212k912k9lusyjr0g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,50028,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_5_212k912k9lusyjr0g.R.globalSliceStart(getClass().getName(),49977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp212k9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212k912k9lusyjr0g.R.rethrow($CLV_t2$);}finally{__CLR4_5_212k912k9lusyjr0g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.LongTest2_obj.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49977,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp212k9() throws Exception{try{__CLR4_5_212k912k9lusyjr0g.R.inc(49977);
        __CLR4_5_212k912k9lusyjr0g.R.inc(49978);String json = "{\"v1\":-1883391953414482124,\"v2\":-3019416596934963650,\"v3\":6497525620823745793,\"v4\":2136224289077142499,\"v5\":-2090575024006307745}";
        __CLR4_5_212k912k9lusyjr0g.R.inc(49979);String json2 = "{\"v1\":\"-1883391953414482124\",\"v2\":\"-3019416596934963650\",\"v3\":\"6497525620823745793\",\"v4\":\"2136224289077142499\",\"v5\":\"-2090575024006307745\"}";

        __CLR4_5_212k912k9lusyjr0g.R.inc(49980);Model m1 = JSON.parseObject(json, Model.class);
        __CLR4_5_212k912k9lusyjr0g.R.inc(49981);Model m2 = JSON.parseObject(json2, Model.class);

        __CLR4_5_212k912k9lusyjr0g.R.inc(49982);assertNotNull(m1);
        __CLR4_5_212k912k9lusyjr0g.R.inc(49983);assertNotNull(m2);

        __CLR4_5_212k912k9lusyjr0g.R.inc(49984);assertEquals(-1883391953414482124L, m1.v1.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(49985);assertEquals(-3019416596934963650L, m1.v2.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(49986);assertEquals(6497525620823745793L, m1.v3.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(49987);assertEquals(2136224289077142499L, m1.v4.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(49988);assertEquals(-2090575024006307745L, m1.v5.longValue());

        __CLR4_5_212k912k9lusyjr0g.R.inc(49989);assertEquals(-1883391953414482124L, m2.v1.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(49990);assertEquals(-3019416596934963650L, m2.v2.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(49991);assertEquals(6497525620823745793L, m2.v3.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(49992);assertEquals(2136224289077142499L, m2.v4.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(49993);assertEquals(-2090575024006307745L, m2.v5.longValue());
    }finally{__CLR4_5_212k912k9lusyjr0g.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_212k912k9lusyjr0g.R.globalSliceStart(getClass().getName(),49994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl12kq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212k912k9lusyjr0g.R.rethrow($CLV_t2$);}finally{__CLR4_5_212k912k9lusyjr0g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.LongTest2_obj.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49994,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl12kq() throws Exception{try{__CLR4_5_212k912k9lusyjr0g.R.inc(49994);
        __CLR4_5_212k912k9lusyjr0g.R.inc(49995);String json = "{\"v1\":-1883391953414482124,\"v2\":-3019416596934963650,\"v3\":6497525620823745793,\"v4\":2136224289077142499,\"v5\":-2090575024006307745}";
        __CLR4_5_212k912k9lusyjr0g.R.inc(49996);String json2 = "{\"v1\":\"-1883391953414482124\",\"v2\":\"-3019416596934963650\",\"v3\":\"6497525620823745793\",\"v4\":\"2136224289077142499\",\"v5\":\"-2090575024006307745\"}";

        __CLR4_5_212k912k9lusyjr0g.R.inc(49997);Model m1 = new JSONReader(new StringReader(json)).readObject(Model.class);
        __CLR4_5_212k912k9lusyjr0g.R.inc(49998);Model m2 = new JSONReader(new StringReader(json2)).readObject(Model.class);

        __CLR4_5_212k912k9lusyjr0g.R.inc(49999);assertNotNull(m1);
        __CLR4_5_212k912k9lusyjr0g.R.inc(50000);assertNotNull(m2);

        __CLR4_5_212k912k9lusyjr0g.R.inc(50001);assertEquals(-1883391953414482124L, m1.v1.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(50002);assertEquals(-3019416596934963650L, m1.v2.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(50003);assertEquals(6497525620823745793L, m1.v3.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(50004);assertEquals(2136224289077142499L, m1.v4.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(50005);assertEquals(-2090575024006307745L, m1.v5.longValue());

        __CLR4_5_212k912k9lusyjr0g.R.inc(50006);assertEquals(-1883391953414482124L, m2.v1.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(50007);assertEquals(-3019416596934963650L, m2.v2.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(50008);assertEquals(6497525620823745793L, m2.v3.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(50009);assertEquals(2136224289077142499L, m2.v4.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(50010);assertEquals(-2090575024006307745L, m2.v5.longValue());
    }finally{__CLR4_5_212k912k9lusyjr0g.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_212k912k9lusyjr0g.R.globalSliceStart(getClass().getName(),50011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k4412l7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212k912k9lusyjr0g.R.rethrow($CLV_t2$);}finally{__CLR4_5_212k912k9lusyjr0g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.LongTest2_obj.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50011,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k4412l7() throws Exception{try{__CLR4_5_212k912k9lusyjr0g.R.inc(50011);
        __CLR4_5_212k912k9lusyjr0g.R.inc(50012);String json = "[-1883391953414482124,-3019416596934963650,6497525620823745793,2136224289077142499,-2090575024006307745]";
        __CLR4_5_212k912k9lusyjr0g.R.inc(50013);String json2 = "[\"-1883391953414482124\",\"-3019416596934963650\",\"6497525620823745793\",\"2136224289077142499\",\"-2090575024006307745\"]";

        __CLR4_5_212k912k9lusyjr0g.R.inc(50014);Model m1 = new JSONReader(new StringReader(json), Feature.SupportArrayToBean).readObject(Model.class);
        __CLR4_5_212k912k9lusyjr0g.R.inc(50015);Model m2 = new JSONReader(new StringReader(json2), Feature.SupportArrayToBean).readObject(Model.class);

        __CLR4_5_212k912k9lusyjr0g.R.inc(50016);assertNotNull(m1);
        __CLR4_5_212k912k9lusyjr0g.R.inc(50017);assertNotNull(m2);

        __CLR4_5_212k912k9lusyjr0g.R.inc(50018);assertEquals(-1883391953414482124L, m1.v1.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(50019);assertEquals(-3019416596934963650L, m1.v2.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(50020);assertEquals(6497525620823745793L, m1.v3.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(50021);assertEquals(2136224289077142499L, m1.v4.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(50022);assertEquals(-2090575024006307745L, m1.v5.longValue());

        __CLR4_5_212k912k9lusyjr0g.R.inc(50023);assertEquals(-1883391953414482124L, m2.v1.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(50024);assertEquals(-3019416596934963650L, m2.v2.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(50025);assertEquals(6497525620823745793L, m2.v3.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(50026);assertEquals(2136224289077142499L, m2.v4.longValue());
        __CLR4_5_212k912k9lusyjr0g.R.inc(50027);assertEquals(-2090575024006307745L, m2.v5.longValue());
    }finally{__CLR4_5_212k912k9lusyjr0g.R.flushNeeded();}}

    public static class Model {
        public Long v1;
        public Long v2;
        public Long v3;
        public Long v4;
        public Long v5;
    }
}
