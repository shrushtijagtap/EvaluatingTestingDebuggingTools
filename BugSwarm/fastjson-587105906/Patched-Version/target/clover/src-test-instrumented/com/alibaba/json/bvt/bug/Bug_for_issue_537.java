/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

import junit.framework.TestCase;

public class Bug_for_issue_537 extends TestCase {static class __CLR4_5_215m815m8lusvn6so{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,53964,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_5_215m815m8lusvn6so.R.globalSliceStart(getClass().getName(),53936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb15m8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215m815m8lusvn6so.R.rethrow($CLV_t2$);}finally{__CLR4_5_215m815m8lusvn6so.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_537.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53936,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb15m8() throws Exception{try{__CLR4_5_215m815m8lusvn6so.R.inc(53936);
        __CLR4_5_215m815m8lusvn6so.R.inc(53937);String text = "{\"value\":2147483649}";
        __CLR4_5_215m815m8lusvn6so.R.inc(53938);Exception error = null;
        __CLR4_5_215m815m8lusvn6so.R.inc(53939);try {
            __CLR4_5_215m815m8lusvn6so.R.inc(53940);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_215m815m8lusvn6so.R.inc(53941);error = ex;
        }
        __CLR4_5_215m815m8lusvn6so.R.inc(53942);Assert.assertNotNull(error);
        __CLR4_5_215m815m8lusvn6so.R.inc(53943);Assert.assertTrue(error.getMessage().contains("field : value"));
    }finally{__CLR4_5_215m815m8lusvn6so.R.flushNeeded();}}

    public void test_for_issue_private() throws Exception {__CLR4_5_215m815m8lusvn6so.R.globalSliceStart(getClass().getName(),53944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jzto0115mg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215m815m8lusvn6so.R.rethrow($CLV_t2$);}finally{__CLR4_5_215m815m8lusvn6so.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_537.test_for_issue_private",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53944,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jzto0115mg() throws Exception{try{__CLR4_5_215m815m8lusvn6so.R.inc(53944);
        __CLR4_5_215m815m8lusvn6so.R.inc(53945);String text = "{\"value\":2147483649}";
        __CLR4_5_215m815m8lusvn6so.R.inc(53946);Exception error = null;
        __CLR4_5_215m815m8lusvn6so.R.inc(53947);try {
            __CLR4_5_215m815m8lusvn6so.R.inc(53948);JSON.parseObject(text, V1.class);
        } catch (JSONException ex) {
            __CLR4_5_215m815m8lusvn6so.R.inc(53949);error = ex;
        }
        __CLR4_5_215m815m8lusvn6so.R.inc(53950);Assert.assertNotNull(error);
        __CLR4_5_215m815m8lusvn6so.R.inc(53951);Assert.assertTrue(error.getMessage().contains("field : value"));
    }finally{__CLR4_5_215m815m8lusvn6so.R.flushNeeded();}}
    

    public void test_for_issue_method() throws Exception {__CLR4_5_215m815m8lusvn6so.R.globalSliceStart(getClass().getName(),53952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2meczpt15mo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215m815m8lusvn6so.R.rethrow($CLV_t2$);}finally{__CLR4_5_215m815m8lusvn6so.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_537.test_for_issue_method",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53952,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2meczpt15mo() throws Exception{try{__CLR4_5_215m815m8lusvn6so.R.inc(53952);
        __CLR4_5_215m815m8lusvn6so.R.inc(53953);String text = "{\"value\":2147483649}";
        __CLR4_5_215m815m8lusvn6so.R.inc(53954);Exception error = null;
        __CLR4_5_215m815m8lusvn6so.R.inc(53955);try {
            __CLR4_5_215m815m8lusvn6so.R.inc(53956);JSON.parseObject(text, V2.class);
        } catch (JSONException ex) {
            __CLR4_5_215m815m8lusvn6so.R.inc(53957);error = ex;
        }
        __CLR4_5_215m815m8lusvn6so.R.inc(53958);Assert.assertNotNull(error);
        __CLR4_5_215m815m8lusvn6so.R.inc(53959);Assert.assertTrue(error.getMessage().contains("field : value"));
    }finally{__CLR4_5_215m815m8lusvn6so.R.flushNeeded();}}

    public static class VO {

        public int value;
    }

    private static class V1 {

        public int value;
    }

    public static class V2 {

        private int value;

        public int getValue() {try{__CLR4_5_215m815m8lusvn6so.R.inc(53960);
            __CLR4_5_215m815m8lusvn6so.R.inc(53961);return value;
        }finally{__CLR4_5_215m815m8lusvn6so.R.flushNeeded();}}

        public void setValue(int value) {try{__CLR4_5_215m815m8lusvn6so.R.inc(53962);
            __CLR4_5_215m815m8lusvn6so.R.inc(53963);this.value = value;
        }finally{__CLR4_5_215m815m8lusvn6so.R.flushNeeded();}}

    }
}
