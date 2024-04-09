/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1300;

import com.alibaba.fastjson.JSONObject;
import junit.framework.TestCase;

import java.sql.Timestamp;

/**
 * Created by wenshao on 04/08/2017.
 */
public class Issue1370 extends TestCase {static class __CLR4_5_21b6l1b6llusvn9xb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,61174,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_5_21b6l1b6llusvn9xb.R.globalSliceStart(getClass().getName(),61149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21b6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21b6l1b6llusvn9xb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21b6l1b6llusvn9xb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1370.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),61149,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21b6l() throws Exception{try{__CLR4_5_21b6l1b6llusvn9xb.R.inc(61149);
        __CLR4_5_21b6l1b6llusvn9xb.R.inc(61150);JSONObject obj = new JSONObject();
        __CLR4_5_21b6l1b6llusvn9xb.R.inc(61151);obj.put("val", "2017-08-04 15:16:41.000000000");

        __CLR4_5_21b6l1b6llusvn9xb.R.inc(61152);Model model = obj.toJavaObject(Model.class);
        __CLR4_5_21b6l1b6llusvn9xb.R.inc(61153);assertNotNull(model.val);
    }finally{__CLR4_5_21b6l1b6llusvn9xb.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21b6l1b6llusvn9xb.R.globalSliceStart(getClass().getName(),61154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1b6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21b6l1b6llusvn9xb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21b6l1b6llusvn9xb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1370.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),61154,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1b6q() throws Exception{try{__CLR4_5_21b6l1b6llusvn9xb.R.inc(61154);
        __CLR4_5_21b6l1b6llusvn9xb.R.inc(61155);JSONObject obj = new JSONObject();
        __CLR4_5_21b6l1b6llusvn9xb.R.inc(61156);obj.put("val", "2017-08-04 15:16:41.0");

        __CLR4_5_21b6l1b6llusvn9xb.R.inc(61157);Model model = obj.toJavaObject(Model.class);
        __CLR4_5_21b6l1b6llusvn9xb.R.inc(61158);assertNotNull(model.val);
    }finally{__CLR4_5_21b6l1b6llusvn9xb.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21b6l1b6llusvn9xb.R.globalSliceStart(getClass().getName(),61159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441b6v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21b6l1b6llusvn9xb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21b6l1b6llusvn9xb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1370.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),61159,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441b6v() throws Exception{try{__CLR4_5_21b6l1b6llusvn9xb.R.inc(61159);
        __CLR4_5_21b6l1b6llusvn9xb.R.inc(61160);JSONObject obj = new JSONObject();
        __CLR4_5_21b6l1b6llusvn9xb.R.inc(61161);obj.put("val", "2017-08-04 15:16:41.00");

        __CLR4_5_21b6l1b6llusvn9xb.R.inc(61162);Model model = obj.toJavaObject(Model.class);
        __CLR4_5_21b6l1b6llusvn9xb.R.inc(61163);assertNotNull(model.val);
    }finally{__CLR4_5_21b6l1b6llusvn9xb.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21b6l1b6llusvn9xb.R.globalSliceStart(getClass().getName(),61164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1b70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21b6l1b6llusvn9xb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21b6l1b6llusvn9xb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1370.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),61164,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1b70() throws Exception{try{__CLR4_5_21b6l1b6llusvn9xb.R.inc(61164);
        __CLR4_5_21b6l1b6llusvn9xb.R.inc(61165);JSONObject obj = new JSONObject();
        __CLR4_5_21b6l1b6llusvn9xb.R.inc(61166);obj.put("val", "2017-08-04 15:16:41.000");

        __CLR4_5_21b6l1b6llusvn9xb.R.inc(61167);Model model = obj.toJavaObject(Model.class);
        __CLR4_5_21b6l1b6llusvn9xb.R.inc(61168);assertNotNull(model.val);
    }finally{__CLR4_5_21b6l1b6llusvn9xb.R.flushNeeded();}}


    public void test_4() throws Exception {__CLR4_5_21b6l1b6llusvn9xb.R.globalSliceStart(getClass().getName(),61169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61b75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21b6l1b6llusvn9xb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21b6l1b6llusvn9xb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1370.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),61169,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61b75() throws Exception{try{__CLR4_5_21b6l1b6llusvn9xb.R.inc(61169);
        __CLR4_5_21b6l1b6llusvn9xb.R.inc(61170);JSONObject obj = new JSONObject();
        __CLR4_5_21b6l1b6llusvn9xb.R.inc(61171);obj.put("val", "2017-08-04 15:16:41.000000");

        __CLR4_5_21b6l1b6llusvn9xb.R.inc(61172);Model model = obj.toJavaObject(Model.class);
        __CLR4_5_21b6l1b6llusvn9xb.R.inc(61173);assertNotNull(model.val);
    }finally{__CLR4_5_21b6l1b6llusvn9xb.R.flushNeeded();}}

    public static class Model {
        public Timestamp val;
    }
}
