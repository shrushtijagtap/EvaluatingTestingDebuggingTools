/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.writeClassName;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import junit.framework.TestCase;

public class StrictAutoTypeTest_0 extends TestCase {static class __CLR4_5_21zqj1zqjlusvnifj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,92990,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private ParserConfig config = new ParserConfig();

    public void test_0() throws Exception {__CLR4_5_21zqj1zqjlusvnifj.R.globalSliceStart(getClass().getName(),92971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21zqj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zqj1zqjlusvnifj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zqj1zqjlusvnifj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeClassName.StrictAutoTypeTest_0.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92971,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21zqj() throws Exception{try{__CLR4_5_21zqj1zqjlusvnifj.R.inc(92971);
        __CLR4_5_21zqj1zqjlusvnifj.R.inc(92972);JSON.parseObject("{\"@type\":\"com.alibaba.fastjson.JSONObject\"}", Object.class, config);
        __CLR4_5_21zqj1zqjlusvnifj.R.inc(92973);JSON.parseObject("{\"@type\":\"com.alibaba.fastjson.JSONObject\"}", Object.class, config, Feature.SupportAutoType);
    }finally{__CLR4_5_21zqj1zqjlusvnifj.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21zqj1zqjlusvnifj.R.globalSliceStart(getClass().getName(),92974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1zqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zqj1zqjlusvnifj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zqj1zqjlusvnifj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeClassName.StrictAutoTypeTest_0.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92974,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1zqm() throws Exception{try{__CLR4_5_21zqj1zqjlusvnifj.R.inc(92974);
        __CLR4_5_21zqj1zqjlusvnifj.R.inc(92975);JSON.parseObject("{\"@type\":\"com.alibaba.json.bvt.writeClassName.StrictAutoTypeTest_0$VO\"}", Object.class, config, Feature.SupportAutoType);
    }finally{__CLR4_5_21zqj1zqjlusvnifj.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21zqj1zqjlusvnifj.R.globalSliceStart(getClass().getName(),92976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441zqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zqj1zqjlusvnifj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zqj1zqjlusvnifj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeClassName.StrictAutoTypeTest_0.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92976,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441zqo() throws Exception{try{__CLR4_5_21zqj1zqjlusvnifj.R.inc(92976);
        {
            __CLR4_5_21zqj1zqjlusvnifj.R.inc(92977);Exception error = null;
            __CLR4_5_21zqj1zqjlusvnifj.R.inc(92978);try {
                __CLR4_5_21zqj1zqjlusvnifj.R.inc(92979);JSON.parseObject("{\"@type\":\"com.alibaba.json.bvt.writeClassName.StrictAutoTypeTest_0$V1\"}", Object.class, config);
            } catch (JSONException ex) {
                __CLR4_5_21zqj1zqjlusvnifj.R.inc(92980);error = ex;
            }
            __CLR4_5_21zqj1zqjlusvnifj.R.inc(92981);assertNotNull(error);
        }
        {
            __CLR4_5_21zqj1zqjlusvnifj.R.inc(92982);Exception error = null;
            __CLR4_5_21zqj1zqjlusvnifj.R.inc(92983);try {
                __CLR4_5_21zqj1zqjlusvnifj.R.inc(92984);JSON.parseObject("{\"@type\":\"com.alibaba.json.bvt.writeClassName.StrictAutoTypeTest_0$V1\"}", Object.class, config);
            } catch (JSONException ex) {
                __CLR4_5_21zqj1zqjlusvnifj.R.inc(92985);error = ex;
            }
            __CLR4_5_21zqj1zqjlusvnifj.R.inc(92986);assertNotNull(error);
        }
    }finally{__CLR4_5_21zqj1zqjlusvnifj.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21zqj1zqjlusvnifj.R.globalSliceStart(getClass().getName(),92987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1zqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zqj1zqjlusvnifj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zqj1zqjlusvnifj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeClassName.StrictAutoTypeTest_0.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92987,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1zqz() throws Exception{try{__CLR4_5_21zqj1zqjlusvnifj.R.inc(92987);
        __CLR4_5_21zqj1zqjlusvnifj.R.inc(92988);int features = JSON.DEFAULT_PARSER_FEATURE | Feature.SupportAutoType.mask;
        __CLR4_5_21zqj1zqjlusvnifj.R.inc(92989);JSON.parse("{\"val\":{\"@type\":\"com.alibaba.json.bvt.writeClassName.StrictAutoTypeTest_0$V3\"}}", config, features);
    }finally{__CLR4_5_21zqj1zqjlusvnifj.R.flushNeeded();}}

    public static class VO {

    }
    public static class V1 {

    }
    public static class V2 {

    }
    public static class V3 {

    }
}
