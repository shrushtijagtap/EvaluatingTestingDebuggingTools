/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.date;

import java.util.Date;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

import junit.framework.TestCase;

public class DateTest_error extends TestCase {static class __CLR4_5_219y519y5lusvn96s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,59591,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    
    public void test_error() throws Exception {__CLR4_5_219y519y5lusvn96s.R.globalSliceStart(getClass().getName(),59549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a19y5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219y519y5lusvn96s.R.rethrow($CLV_t2$);}finally{__CLR4_5_219y519y5lusvn96s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateTest_error.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59549,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a19y5() throws Exception{try{__CLR4_5_219y519y5lusvn96s.R.inc(59549);
        __CLR4_5_219y519y5lusvn96s.R.inc(59550);String text = "{\"value\":true}";

        __CLR4_5_219y519y5lusvn96s.R.inc(59551);Exception error = null;
        __CLR4_5_219y519y5lusvn96s.R.inc(59552);try {
            __CLR4_5_219y519y5lusvn96s.R.inc(59553);JSON.parseObject(text, Date.class);
        } catch (JSONException ex) {
            __CLR4_5_219y519y5lusvn96s.R.inc(59554);error = ex;
        }
        __CLR4_5_219y519y5lusvn96s.R.inc(59555);Assert.assertNotNull(error);
    }finally{__CLR4_5_219y519y5lusvn96s.R.flushNeeded();}}
    
    
    public void test_error_1() throws Exception {__CLR4_5_219y519y5lusvn96s.R.globalSliceStart(getClass().getName(),59556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc19yc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219y519y5lusvn96s.R.rethrow($CLV_t2$);}finally{__CLR4_5_219y519y5lusvn96s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateTest_error.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59556,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc19yc() throws Exception{try{__CLR4_5_219y519y5lusvn96s.R.inc(59556);
        __CLR4_5_219y519y5lusvn96s.R.inc(59557);String text = "{1:true}";

        __CLR4_5_219y519y5lusvn96s.R.inc(59558);Exception error = null;
        __CLR4_5_219y519y5lusvn96s.R.inc(59559);try {
            __CLR4_5_219y519y5lusvn96s.R.inc(59560);JSON.parseObject(text, Date.class);
        } catch (JSONException ex) {
            __CLR4_5_219y519y5lusvn96s.R.inc(59561);error = ex;
        }
        __CLR4_5_219y519y5lusvn96s.R.inc(59562);Assert.assertNotNull(error);
    }finally{__CLR4_5_219y519y5lusvn96s.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_5_219y519y5lusvn96s.R.globalSliceStart(getClass().getName(),59563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit19yj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219y519y5lusvn96s.R.rethrow($CLV_t2$);}finally{__CLR4_5_219y519y5lusvn96s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateTest_error.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59563,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit19yj() throws Exception{try{__CLR4_5_219y519y5lusvn96s.R.inc(59563);
        __CLR4_5_219y519y5lusvn96s.R.inc(59564);String text = "{\"@type\":\"java.util.Date\",\"value\":true}";

        __CLR4_5_219y519y5lusvn96s.R.inc(59565);Exception error = null;
        __CLR4_5_219y519y5lusvn96s.R.inc(59566);try {
            __CLR4_5_219y519y5lusvn96s.R.inc(59567);JSON.parseObject(text, Date.class);
        } catch (JSONException ex) {
            __CLR4_5_219y519y5lusvn96s.R.inc(59568);error = ex;
        }
        __CLR4_5_219y519y5lusvn96s.R.inc(59569);Assert.assertNotNull(error);
    }finally{__CLR4_5_219y519y5lusvn96s.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_5_219y519y5lusvn96s.R.globalSliceStart(getClass().getName(),59570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba19yq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219y519y5lusvn96s.R.rethrow($CLV_t2$);}finally{__CLR4_5_219y519y5lusvn96s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateTest_error.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59570,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba19yq() throws Exception{try{__CLR4_5_219y519y5lusvn96s.R.inc(59570);
        __CLR4_5_219y519y5lusvn96s.R.inc(59571);String text = "{\"@type\":\"java.util.Date\",\"value\":true}";

        __CLR4_5_219y519y5lusvn96s.R.inc(59572);Exception error = null;
        __CLR4_5_219y519y5lusvn96s.R.inc(59573);try {
            __CLR4_5_219y519y5lusvn96s.R.inc(59574);JSON.parseObject(text);
        } catch (JSONException ex) {
            __CLR4_5_219y519y5lusvn96s.R.inc(59575);error = ex;
        }
        __CLR4_5_219y519y5lusvn96s.R.inc(59576);Assert.assertNotNull(error);
    }finally{__CLR4_5_219y519y5lusvn96s.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_5_219y519y5lusvn96s.R.globalSliceStart(getClass().getName(),59577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r19yx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219y519y5lusvn96s.R.rethrow($CLV_t2$);}finally{__CLR4_5_219y519y5lusvn96s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateTest_error.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59577,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r19yx() throws Exception{try{__CLR4_5_219y519y5lusvn96s.R.inc(59577);
        __CLR4_5_219y519y5lusvn96s.R.inc(59578);String text = "{\"@type\":\"java.util.Date\",1:true}";

        __CLR4_5_219y519y5lusvn96s.R.inc(59579);Exception error = null;
        __CLR4_5_219y519y5lusvn96s.R.inc(59580);try {
            __CLR4_5_219y519y5lusvn96s.R.inc(59581);JSON.parseObject(text);
        } catch (JSONException ex) {
            __CLR4_5_219y519y5lusvn96s.R.inc(59582);error = ex;
        }
        __CLR4_5_219y519y5lusvn96s.R.inc(59583);Assert.assertNotNull(error);
    }finally{__CLR4_5_219y519y5lusvn96s.R.flushNeeded();}}
    
    public void test_error_5() throws Exception {__CLR4_5_219y519y5lusvn96s.R.globalSliceStart(getClass().getName(),59584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw819z4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219y519y5lusvn96s.R.rethrow($CLV_t2$);}finally{__CLR4_5_219y519y5lusvn96s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateTest_error.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59584,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw819z4() throws Exception{try{__CLR4_5_219y519y5lusvn96s.R.inc(59584);
        __CLR4_5_219y519y5lusvn96s.R.inc(59585);String text = "\"xxxxxxxxx\"";

        __CLR4_5_219y519y5lusvn96s.R.inc(59586);Exception error = null;
        __CLR4_5_219y519y5lusvn96s.R.inc(59587);try {
            __CLR4_5_219y519y5lusvn96s.R.inc(59588);JSON.parseObject(text, Date.class);
        } catch (JSONException ex) {
            __CLR4_5_219y519y5lusvn96s.R.inc(59589);error = ex;
        }
        __CLR4_5_219y519y5lusvn96s.R.inc(59590);Assert.assertNotNull(error);
    }finally{__CLR4_5_219y519y5lusvn96s.R.flushNeeded();}}
}
