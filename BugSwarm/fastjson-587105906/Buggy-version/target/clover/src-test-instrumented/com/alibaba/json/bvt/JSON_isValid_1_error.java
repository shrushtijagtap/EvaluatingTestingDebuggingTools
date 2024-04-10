/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

public class JSON_isValid_1_error extends TestCase {static class __CLR4_1_10yhiyhiluszw5pv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,44736,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_isValid_0() throws Exception {__CLR4_1_10yhiyhiluszw5pv.R.globalSliceStart(getClass().getName(),44694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mvw55yhi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10yhiyhiluszw5pv.R.rethrow($CLV_t2$);}finally{__CLR4_1_10yhiyhiluszw5pv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSON_isValid_1_error.test_for_isValid_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44694,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mvw55yhi() throws Exception{try{__CLR4_1_10yhiyhiluszw5pv.R.inc(44694);
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44695);assertFalse(JSON.isValid(null));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44696);assertFalse(JSON.isValid(""));
    }finally{__CLR4_1_10yhiyhiluszw5pv.R.flushNeeded();}}

    public void test_for_isValid_value() throws Exception {__CLR4_1_10yhiyhiluszw5pv.R.globalSliceStart(getClass().getName(),44697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yq8g4oyhl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10yhiyhiluszw5pv.R.rethrow($CLV_t2$);}finally{__CLR4_1_10yhiyhiluszw5pv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSON_isValid_1_error.test_for_isValid_value",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44697,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yq8g4oyhl() throws Exception{try{__CLR4_1_10yhiyhiluszw5pv.R.inc(44697);
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44698);assertFalse(JSON.isValid("nul"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44699);assertFalse(JSON.isValid("null,null"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44700);assertFalse(JSON.isValid("123,"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44701);assertFalse(JSON.isValid("123,123"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44702);assertFalse(JSON.isValid("12.34,true"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44703);assertFalse(JSON.isValid("12.34,123"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44704);assertFalse(JSON.isValid("tru"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44705);assertFalse(JSON.isValid("true,123"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44706);assertFalse(JSON.isValid("fals"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44707);assertFalse(JSON.isValid("false,123"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44708);assertFalse(JSON.isValid("\"abc"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44709);assertFalse(JSON.isValid("\"abc\",123"));
    }finally{__CLR4_1_10yhiyhiluszw5pv.R.flushNeeded();}}


    public void test_for_isValid_obj() throws Exception {__CLR4_1_10yhiyhiluszw5pv.R.globalSliceStart(getClass().getName(),44710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ue0x9qyhy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10yhiyhiluszw5pv.R.rethrow($CLV_t2$);}finally{__CLR4_1_10yhiyhiluszw5pv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSON_isValid_1_error.test_for_isValid_obj",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44710,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ue0x9qyhy() throws Exception{try{__CLR4_1_10yhiyhiluszw5pv.R.inc(44710);
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44711);assertFalse(JSON.isValid("{"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44712);assertFalse(JSON.isValid("{\"id\":123,}}"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44713);assertFalse(JSON.isValid("{\"id\":\"123}"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44714);assertFalse(JSON.isValid("{\"id\":{]}"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44715);assertFalse(JSON.isValid("{\"id\":{"));
    }finally{__CLR4_1_10yhiyhiluszw5pv.R.flushNeeded();}}

    public void test_for_isValid_obj_1() throws Exception {__CLR4_1_10yhiyhiluszw5pv.R.globalSliceStart(getClass().getName(),44716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ew5uzkyi4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10yhiyhiluszw5pv.R.rethrow($CLV_t2$);}finally{__CLR4_1_10yhiyhiluszw5pv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSON_isValid_1_error.test_for_isValid_obj_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44716,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ew5uzkyi4() throws Exception{try{__CLR4_1_10yhiyhiluszw5pv.R.inc(44716);
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44717);assertFalse(JSON.isValidObject("{"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44718);assertFalse(JSON.isValidObject("{\"id\":123,}}"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44719);assertFalse(JSON.isValidObject("{\"id\":\"123}"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44720);assertFalse(JSON.isValidObject("{\"id\":{]}"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44721);assertFalse(JSON.isValidObject("{\"id\":{"));
    }finally{__CLR4_1_10yhiyhiluszw5pv.R.flushNeeded();}}

    public void test_for_isValid_array() throws Exception {__CLR4_1_10yhiyhiluszw5pv.R.globalSliceStart(getClass().getName(),44722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wagfw0yia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10yhiyhiluszw5pv.R.rethrow($CLV_t2$);}finally{__CLR4_1_10yhiyhiluszw5pv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSON_isValid_1_error.test_for_isValid_array",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44722,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wagfw0yia() throws Exception{try{__CLR4_1_10yhiyhiluszw5pv.R.inc(44722);
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44723);assertFalse(JSON.isValid("["));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44724);assertFalse(JSON.isValid("[[,[]]"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44725);assertFalse(JSON.isValid("[{\"id\":123]"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44726);assertFalse(JSON.isValid("[{\"id\":\"123\"}"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44727);assertFalse(JSON.isValid("[{\"id\":true]"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44728);assertFalse(JSON.isValid("[{\"id\":{}]"));
    }finally{__CLR4_1_10yhiyhiluszw5pv.R.flushNeeded();}}

    public void test_for_isValid_array_1() throws Exception {__CLR4_1_10yhiyhiluszw5pv.R.globalSliceStart(getClass().getName(),44729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dk44aqyih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10yhiyhiluszw5pv.R.rethrow($CLV_t2$);}finally{__CLR4_1_10yhiyhiluszw5pv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSON_isValid_1_error.test_for_isValid_array_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44729,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dk44aqyih() throws Exception{try{__CLR4_1_10yhiyhiluszw5pv.R.inc(44729);
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44730);assertFalse(JSON.isValidArray("["));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44731);assertFalse(JSON.isValidArray("[[,[]]"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44732);assertFalse(JSON.isValidArray("[{\"id\":123]"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44733);assertFalse(JSON.isValidArray("[{\"id\":\"123\"}"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44734);assertFalse(JSON.isValidArray("[{\"id\":true]"));
        __CLR4_1_10yhiyhiluszw5pv.R.inc(44735);assertFalse(JSON.isValidArray("[{\"id\":{}]"));
    }finally{__CLR4_1_10yhiyhiluszw5pv.R.flushNeeded();}}

}
