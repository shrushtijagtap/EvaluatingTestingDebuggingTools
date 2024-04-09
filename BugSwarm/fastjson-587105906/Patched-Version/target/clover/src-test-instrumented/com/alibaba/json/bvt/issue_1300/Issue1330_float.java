/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1300;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import junit.framework.TestCase;

/**
 * Created by wenshao on 30/07/2017.
 */
public class Issue1330_float extends TestCase {static class __CLR4_5_21azm1azmlusvn9t3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,60919,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_21azm1azmlusvn9t3.R.globalSliceStart(getClass().getName(),60898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1azm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21azm1azmlusvn9t3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21azm1azmlusvn9t3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1330_float.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),60898,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1azm() throws Exception{try{__CLR4_5_21azm1azmlusvn9t3.R.inc(60898);
        __CLR4_5_21azm1azmlusvn9t3.R.inc(60899);Exception error = null;
        __CLR4_5_21azm1azmlusvn9t3.R.inc(60900);try {
            __CLR4_5_21azm1azmlusvn9t3.R.inc(60901);JSON.parseObject("{\"value\":\"ABC\"}", Model.class);
        } catch (JSONException e) {
            __CLR4_5_21azm1azmlusvn9t3.R.inc(60902);error = e;
        }
        __CLR4_5_21azm1azmlusvn9t3.R.inc(60903);assertNotNull(error);
        __CLR4_5_21azm1azmlusvn9t3.R.inc(60904);assertTrue(error.getMessage().indexOf("parseLong error, field : value") != -1);
    }finally{__CLR4_5_21azm1azmlusvn9t3.R.flushNeeded();}}

    public void test_for_issue_1() throws Exception {__CLR4_5_21azm1azmlusvn9t3.R.globalSliceStart(getClass().getName(),60905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uhstn51azt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21azm1azmlusvn9t3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21azm1azmlusvn9t3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1330_float.test_for_issue_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),60905,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uhstn51azt() throws Exception{try{__CLR4_5_21azm1azmlusvn9t3.R.inc(60905);
        __CLR4_5_21azm1azmlusvn9t3.R.inc(60906);Exception error = null;
        __CLR4_5_21azm1azmlusvn9t3.R.inc(60907);try {
            __CLR4_5_21azm1azmlusvn9t3.R.inc(60908);JSON.parseObject("{\"value\":[]}", Model.class);
        } catch (JSONException e) {
            __CLR4_5_21azm1azmlusvn9t3.R.inc(60909);error = e;
        }
        __CLR4_5_21azm1azmlusvn9t3.R.inc(60910);assertNotNull(error);
        __CLR4_5_21azm1azmlusvn9t3.R.inc(60911);assertTrue(error.getMessage().indexOf("parseLong error, field : value") != -1);
    }finally{__CLR4_5_21azm1azmlusvn9t3.R.flushNeeded();}}

    public void test_for_issue_2() throws Exception {__CLR4_5_21azm1azmlusvn9t3.R.globalSliceStart(getClass().getName(),60912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r8suuo1b00();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21azm1azmlusvn9t3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21azm1azmlusvn9t3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1330_float.test_for_issue_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),60912,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r8suuo1b00() throws Exception{try{__CLR4_5_21azm1azmlusvn9t3.R.inc(60912);
        __CLR4_5_21azm1azmlusvn9t3.R.inc(60913);Exception error = null;
        __CLR4_5_21azm1azmlusvn9t3.R.inc(60914);try {
            __CLR4_5_21azm1azmlusvn9t3.R.inc(60915);JSON.parseObject("{\"value\":{}}", Model.class);
        } catch (JSONException e) {
            __CLR4_5_21azm1azmlusvn9t3.R.inc(60916);error = e;
        }
        __CLR4_5_21azm1azmlusvn9t3.R.inc(60917);assertNotNull(error);
        __CLR4_5_21azm1azmlusvn9t3.R.inc(60918);assertTrue(error.getMessage().indexOf("parseLong error, field : value") != -1);
    }finally{__CLR4_5_21azm1azmlusvn9t3.R.flushNeeded();}}

    public static class Model {
        public float value;
    }
}
