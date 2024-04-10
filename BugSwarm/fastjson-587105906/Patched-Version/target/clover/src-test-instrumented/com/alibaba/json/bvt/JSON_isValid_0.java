/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

public class JSON_isValid_0 extends TestCase {static class __CLR4_5_2ygeygelusyjq23{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,44690,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_isValid_0() throws Exception {__CLR4_5_2ygeygelusyjq23.R.globalSliceStart(getClass().getName(),44654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mvw55yge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ygeygelusyjq23.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ygeygelusyjq23.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSON_isValid_0.test_for_isValid_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44654,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mvw55yge() throws Exception{try{__CLR4_5_2ygeygelusyjq23.R.inc(44654);
        __CLR4_5_2ygeygelusyjq23.R.inc(44655);assertFalse(JSON.isValid(null));
        __CLR4_5_2ygeygelusyjq23.R.inc(44656);assertFalse(JSON.isValid(""));
    }finally{__CLR4_5_2ygeygelusyjq23.R.flushNeeded();}}

    public void test_for_isValid_value() throws Exception {__CLR4_5_2ygeygelusyjq23.R.globalSliceStart(getClass().getName(),44657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yq8g4oygh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ygeygelusyjq23.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ygeygelusyjq23.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSON_isValid_0.test_for_isValid_value",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44657,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yq8g4oygh() throws Exception{try{__CLR4_5_2ygeygelusyjq23.R.inc(44657);
        __CLR4_5_2ygeygelusyjq23.R.inc(44658);assertTrue(JSON.isValid("null"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44659);assertTrue(JSON.isValid("123"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44660);assertTrue(JSON.isValid("12.34"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44661);assertTrue(JSON.isValid("true"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44662);assertTrue(JSON.isValid("false"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44663);assertTrue(JSON.isValid("\"abc\""));
    }finally{__CLR4_5_2ygeygelusyjq23.R.flushNeeded();}}


    public void test_for_isValid_obj() throws Exception {__CLR4_5_2ygeygelusyjq23.R.globalSliceStart(getClass().getName(),44664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ue0x9qygo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ygeygelusyjq23.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ygeygelusyjq23.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSON_isValid_0.test_for_isValid_obj",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44664,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ue0x9qygo() throws Exception{try{__CLR4_5_2ygeygelusyjq23.R.inc(44664);
        __CLR4_5_2ygeygelusyjq23.R.inc(44665);assertTrue(JSON.isValid("{}"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44666);assertTrue(JSON.isValid("{\"id\":123}"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44667);assertTrue(JSON.isValid("{\"id\":\"123\"}"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44668);assertTrue(JSON.isValid("{\"id\":true}"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44669);assertTrue(JSON.isValid("{\"id\":{}}"));
    }finally{__CLR4_5_2ygeygelusyjq23.R.flushNeeded();}}

    public void test_for_isValid_obj_1() throws Exception {__CLR4_5_2ygeygelusyjq23.R.globalSliceStart(getClass().getName(),44670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ew5uzkygu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ygeygelusyjq23.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ygeygelusyjq23.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSON_isValid_0.test_for_isValid_obj_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44670,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ew5uzkygu() throws Exception{try{__CLR4_5_2ygeygelusyjq23.R.inc(44670);
        __CLR4_5_2ygeygelusyjq23.R.inc(44671);assertTrue(JSON.isValidObject("{}"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44672);assertTrue(JSON.isValidObject("{\"id\":123}"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44673);assertTrue(JSON.isValidObject("{\"id\":\"123\"}"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44674);assertTrue(JSON.isValidObject("{\"id\":true}"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44675);assertTrue(JSON.isValidObject("{\"id\":{}}"));
    }finally{__CLR4_5_2ygeygelusyjq23.R.flushNeeded();}}

    public void test_for_isValid_array() throws Exception {__CLR4_5_2ygeygelusyjq23.R.globalSliceStart(getClass().getName(),44676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wagfw0yh0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ygeygelusyjq23.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ygeygelusyjq23.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSON_isValid_0.test_for_isValid_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44676,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wagfw0yh0() throws Exception{try{__CLR4_5_2ygeygelusyjq23.R.inc(44676);
        __CLR4_5_2ygeygelusyjq23.R.inc(44677);assertTrue(JSON.isValid("[]"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44678);assertTrue(JSON.isValid("[[],[]]"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44679);assertTrue(JSON.isValid("[{\"id\":123}]"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44680);assertTrue(JSON.isValid("[{\"id\":\"123\"}]"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44681);assertTrue(JSON.isValid("[{\"id\":true}]"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44682);assertTrue(JSON.isValid("[{\"id\":{}}]"));
    }finally{__CLR4_5_2ygeygelusyjq23.R.flushNeeded();}}

    public void test_for_isValid_array_1() throws Exception {__CLR4_5_2ygeygelusyjq23.R.globalSliceStart(getClass().getName(),44683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dk44aqyh7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2ygeygelusyjq23.R.rethrow($CLV_t2$);}finally{__CLR4_5_2ygeygelusyjq23.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSON_isValid_0.test_for_isValid_array_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44683,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dk44aqyh7() throws Exception{try{__CLR4_5_2ygeygelusyjq23.R.inc(44683);
        __CLR4_5_2ygeygelusyjq23.R.inc(44684);assertTrue(JSON.isValidArray("[]"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44685);assertTrue(JSON.isValidArray("[[],[]]"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44686);assertTrue(JSON.isValidArray("[{\"id\":123}]"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44687);assertTrue(JSON.isValidArray("[{\"id\":\"123\"}]"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44688);assertTrue(JSON.isValidArray("[{\"id\":true}]"));
        __CLR4_5_2ygeygelusyjq23.R.inc(44689);assertTrue(JSON.isValidArray("[{\"id\":{}}]"));
    }finally{__CLR4_5_2ygeygelusyjq23.R.flushNeeded();}}

}
