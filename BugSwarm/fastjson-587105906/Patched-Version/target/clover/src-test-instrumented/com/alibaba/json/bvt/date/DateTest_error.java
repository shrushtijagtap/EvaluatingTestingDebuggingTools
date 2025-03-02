/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.date;

import java.util.Date;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

import junit.framework.TestCase;

public class DateTest_error extends TestCase {static class __CLR4_5_218zx18zxlusyjska{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,58359,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    
    public void test_error() throws Exception {__CLR4_5_218zx18zxlusyjska.R.globalSliceStart(getClass().getName(),58317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a18zx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218zx18zxlusyjska.R.rethrow($CLV_t2$);}finally{__CLR4_5_218zx18zxlusyjska.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateTest_error.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58317,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a18zx() throws Exception{try{__CLR4_5_218zx18zxlusyjska.R.inc(58317);
        __CLR4_5_218zx18zxlusyjska.R.inc(58318);String text = "{\"value\":true}";

        __CLR4_5_218zx18zxlusyjska.R.inc(58319);Exception error = null;
        __CLR4_5_218zx18zxlusyjska.R.inc(58320);try {
            __CLR4_5_218zx18zxlusyjska.R.inc(58321);JSON.parseObject(text, Date.class);
        } catch (JSONException ex) {
            __CLR4_5_218zx18zxlusyjska.R.inc(58322);error = ex;
        }
        __CLR4_5_218zx18zxlusyjska.R.inc(58323);Assert.assertNotNull(error);
    }finally{__CLR4_5_218zx18zxlusyjska.R.flushNeeded();}}
    
    
    public void test_error_1() throws Exception {__CLR4_5_218zx18zxlusyjska.R.globalSliceStart(getClass().getName(),58324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1904();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218zx18zxlusyjska.R.rethrow($CLV_t2$);}finally{__CLR4_5_218zx18zxlusyjska.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateTest_error.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58324,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1904() throws Exception{try{__CLR4_5_218zx18zxlusyjska.R.inc(58324);
        __CLR4_5_218zx18zxlusyjska.R.inc(58325);String text = "{1:true}";

        __CLR4_5_218zx18zxlusyjska.R.inc(58326);Exception error = null;
        __CLR4_5_218zx18zxlusyjska.R.inc(58327);try {
            __CLR4_5_218zx18zxlusyjska.R.inc(58328);JSON.parseObject(text, Date.class);
        } catch (JSONException ex) {
            __CLR4_5_218zx18zxlusyjska.R.inc(58329);error = ex;
        }
        __CLR4_5_218zx18zxlusyjska.R.inc(58330);Assert.assertNotNull(error);
    }finally{__CLR4_5_218zx18zxlusyjska.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_5_218zx18zxlusyjska.R.globalSliceStart(getClass().getName(),58331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit190b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218zx18zxlusyjska.R.rethrow($CLV_t2$);}finally{__CLR4_5_218zx18zxlusyjska.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateTest_error.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58331,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit190b() throws Exception{try{__CLR4_5_218zx18zxlusyjska.R.inc(58331);
        __CLR4_5_218zx18zxlusyjska.R.inc(58332);String text = "{\"@type\":\"java.util.Date\",\"value\":true}";

        __CLR4_5_218zx18zxlusyjska.R.inc(58333);Exception error = null;
        __CLR4_5_218zx18zxlusyjska.R.inc(58334);try {
            __CLR4_5_218zx18zxlusyjska.R.inc(58335);JSON.parseObject(text, Date.class);
        } catch (JSONException ex) {
            __CLR4_5_218zx18zxlusyjska.R.inc(58336);error = ex;
        }
        __CLR4_5_218zx18zxlusyjska.R.inc(58337);Assert.assertNotNull(error);
    }finally{__CLR4_5_218zx18zxlusyjska.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_5_218zx18zxlusyjska.R.globalSliceStart(getClass().getName(),58338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba190i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218zx18zxlusyjska.R.rethrow($CLV_t2$);}finally{__CLR4_5_218zx18zxlusyjska.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateTest_error.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58338,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba190i() throws Exception{try{__CLR4_5_218zx18zxlusyjska.R.inc(58338);
        __CLR4_5_218zx18zxlusyjska.R.inc(58339);String text = "{\"@type\":\"java.util.Date\",\"value\":true}";

        __CLR4_5_218zx18zxlusyjska.R.inc(58340);Exception error = null;
        __CLR4_5_218zx18zxlusyjska.R.inc(58341);try {
            __CLR4_5_218zx18zxlusyjska.R.inc(58342);JSON.parseObject(text);
        } catch (JSONException ex) {
            __CLR4_5_218zx18zxlusyjska.R.inc(58343);error = ex;
        }
        __CLR4_5_218zx18zxlusyjska.R.inc(58344);Assert.assertNotNull(error);
    }finally{__CLR4_5_218zx18zxlusyjska.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_5_218zx18zxlusyjska.R.globalSliceStart(getClass().getName(),58345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r190p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218zx18zxlusyjska.R.rethrow($CLV_t2$);}finally{__CLR4_5_218zx18zxlusyjska.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateTest_error.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58345,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r190p() throws Exception{try{__CLR4_5_218zx18zxlusyjska.R.inc(58345);
        __CLR4_5_218zx18zxlusyjska.R.inc(58346);String text = "{\"@type\":\"java.util.Date\",1:true}";

        __CLR4_5_218zx18zxlusyjska.R.inc(58347);Exception error = null;
        __CLR4_5_218zx18zxlusyjska.R.inc(58348);try {
            __CLR4_5_218zx18zxlusyjska.R.inc(58349);JSON.parseObject(text);
        } catch (JSONException ex) {
            __CLR4_5_218zx18zxlusyjska.R.inc(58350);error = ex;
        }
        __CLR4_5_218zx18zxlusyjska.R.inc(58351);Assert.assertNotNull(error);
    }finally{__CLR4_5_218zx18zxlusyjska.R.flushNeeded();}}
    
    public void test_error_5() throws Exception {__CLR4_5_218zx18zxlusyjska.R.globalSliceStart(getClass().getName(),58352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw8190w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218zx18zxlusyjska.R.rethrow($CLV_t2$);}finally{__CLR4_5_218zx18zxlusyjska.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateTest_error.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58352,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw8190w() throws Exception{try{__CLR4_5_218zx18zxlusyjska.R.inc(58352);
        __CLR4_5_218zx18zxlusyjska.R.inc(58353);String text = "\"xxxxxxxxx\"";

        __CLR4_5_218zx18zxlusyjska.R.inc(58354);Exception error = null;
        __CLR4_5_218zx18zxlusyjska.R.inc(58355);try {
            __CLR4_5_218zx18zxlusyjska.R.inc(58356);JSON.parseObject(text, Date.class);
        } catch (JSONException ex) {
            __CLR4_5_218zx18zxlusyjska.R.inc(58357);error = ex;
        }
        __CLR4_5_218zx18zxlusyjska.R.inc(58358);Assert.assertNotNull(error);
    }finally{__CLR4_5_218zx18zxlusyjska.R.flushNeeded();}}
}
