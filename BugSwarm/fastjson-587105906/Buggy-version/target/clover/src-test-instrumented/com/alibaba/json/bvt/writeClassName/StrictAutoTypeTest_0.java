/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.writeClassName;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import junit.framework.TestCase;

public class StrictAutoTypeTest_0 extends TestCase {static class __CLR4_1_101ysm1ysmlusqkocn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,91769,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private ParserConfig config = new ParserConfig();

    public void test_0() throws Exception {__CLR4_1_101ysm1ysmlusqkocn.R.globalSliceStart(getClass().getName(),91750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21ysm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ysm1ysmlusqkocn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ysm1ysmlusqkocn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeClassName.StrictAutoTypeTest_0.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91750,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21ysm() throws Exception{try{__CLR4_1_101ysm1ysmlusqkocn.R.inc(91750);
        __CLR4_1_101ysm1ysmlusqkocn.R.inc(91751);JSON.parseObject("{\"@type\":\"com.alibaba.fastjson.JSONObject\"}", Object.class, config);
        __CLR4_1_101ysm1ysmlusqkocn.R.inc(91752);JSON.parseObject("{\"@type\":\"com.alibaba.fastjson.JSONObject\"}", Object.class, config, Feature.SupportAutoType);
    }finally{__CLR4_1_101ysm1ysmlusqkocn.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101ysm1ysmlusqkocn.R.globalSliceStart(getClass().getName(),91753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1ysp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ysm1ysmlusqkocn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ysm1ysmlusqkocn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeClassName.StrictAutoTypeTest_0.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91753,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1ysp() throws Exception{try{__CLR4_1_101ysm1ysmlusqkocn.R.inc(91753);
        __CLR4_1_101ysm1ysmlusqkocn.R.inc(91754);JSON.parseObject("{\"@type\":\"com.alibaba.json.bvt.writeClassName.StrictAutoTypeTest_0$VO\"}", Object.class, config, Feature.SupportAutoType);
    }finally{__CLR4_1_101ysm1ysmlusqkocn.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101ysm1ysmlusqkocn.R.globalSliceStart(getClass().getName(),91755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441ysr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ysm1ysmlusqkocn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ysm1ysmlusqkocn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeClassName.StrictAutoTypeTest_0.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91755,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441ysr() throws Exception{try{__CLR4_1_101ysm1ysmlusqkocn.R.inc(91755);
        {
            __CLR4_1_101ysm1ysmlusqkocn.R.inc(91756);Exception error = null;
            __CLR4_1_101ysm1ysmlusqkocn.R.inc(91757);try {
                __CLR4_1_101ysm1ysmlusqkocn.R.inc(91758);JSON.parseObject("{\"@type\":\"com.alibaba.json.bvt.writeClassName.StrictAutoTypeTest_0$V1\"}", Object.class, config);
            } catch (JSONException ex) {
                __CLR4_1_101ysm1ysmlusqkocn.R.inc(91759);error = ex;
            }
            __CLR4_1_101ysm1ysmlusqkocn.R.inc(91760);assertNotNull(error);
        }
        {
            __CLR4_1_101ysm1ysmlusqkocn.R.inc(91761);Exception error = null;
            __CLR4_1_101ysm1ysmlusqkocn.R.inc(91762);try {
                __CLR4_1_101ysm1ysmlusqkocn.R.inc(91763);JSON.parseObject("{\"@type\":\"com.alibaba.json.bvt.writeClassName.StrictAutoTypeTest_0$V1\"}", Object.class, config);
            } catch (JSONException ex) {
                __CLR4_1_101ysm1ysmlusqkocn.R.inc(91764);error = ex;
            }
            __CLR4_1_101ysm1ysmlusqkocn.R.inc(91765);assertNotNull(error);
        }
    }finally{__CLR4_1_101ysm1ysmlusqkocn.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101ysm1ysmlusqkocn.R.globalSliceStart(getClass().getName(),91766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1yt2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ysm1ysmlusqkocn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ysm1ysmlusqkocn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeClassName.StrictAutoTypeTest_0.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91766,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1yt2() throws Exception{try{__CLR4_1_101ysm1ysmlusqkocn.R.inc(91766);
        __CLR4_1_101ysm1ysmlusqkocn.R.inc(91767);int features = JSON.DEFAULT_PARSER_FEATURE | Feature.SupportAutoType.mask;
        __CLR4_1_101ysm1ysmlusqkocn.R.inc(91768);JSON.parse("{\"val\":{\"@type\":\"com.alibaba.json.bvt.writeClassName.StrictAutoTypeTest_0$V3\"}}", config, features);
    }finally{__CLR4_1_101ysm1ysmlusqkocn.R.flushNeeded();}}

    public static class VO {

    }
    public static class V1 {

    }
    public static class V2 {

    }
    public static class V3 {

    }
}
