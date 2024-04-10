/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1300;

import com.alibaba.fastjson.JSONObject;
import junit.framework.TestCase;

import java.sql.Timestamp;

/**
 * Created by wenshao on 04/08/2017.
 */
public class Issue1370 extends TestCase {static class __CLR4_1_101b6w1b6wluszwapk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,61185,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_1_101b6w1b6wluszwapk.R.globalSliceStart(getClass().getName(),61160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21b6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101b6w1b6wluszwapk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101b6w1b6wluszwapk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1370.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),61160,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21b6w() throws Exception{try{__CLR4_1_101b6w1b6wluszwapk.R.inc(61160);
        __CLR4_1_101b6w1b6wluszwapk.R.inc(61161);JSONObject obj = new JSONObject();
        __CLR4_1_101b6w1b6wluszwapk.R.inc(61162);obj.put("val", "2017-08-04 15:16:41.000000000");

        __CLR4_1_101b6w1b6wluszwapk.R.inc(61163);Model model = obj.toJavaObject(Model.class);
        __CLR4_1_101b6w1b6wluszwapk.R.inc(61164);assertNotNull(model.val);
    }finally{__CLR4_1_101b6w1b6wluszwapk.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101b6w1b6wluszwapk.R.globalSliceStart(getClass().getName(),61165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1b71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101b6w1b6wluszwapk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101b6w1b6wluszwapk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1370.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),61165,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1b71() throws Exception{try{__CLR4_1_101b6w1b6wluszwapk.R.inc(61165);
        __CLR4_1_101b6w1b6wluszwapk.R.inc(61166);JSONObject obj = new JSONObject();
        __CLR4_1_101b6w1b6wluszwapk.R.inc(61167);obj.put("val", "2017-08-04 15:16:41.0");

        __CLR4_1_101b6w1b6wluszwapk.R.inc(61168);Model model = obj.toJavaObject(Model.class);
        __CLR4_1_101b6w1b6wluszwapk.R.inc(61169);assertNotNull(model.val);
    }finally{__CLR4_1_101b6w1b6wluszwapk.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101b6w1b6wluszwapk.R.globalSliceStart(getClass().getName(),61170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441b76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101b6w1b6wluszwapk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101b6w1b6wluszwapk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1370.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),61170,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441b76() throws Exception{try{__CLR4_1_101b6w1b6wluszwapk.R.inc(61170);
        __CLR4_1_101b6w1b6wluszwapk.R.inc(61171);JSONObject obj = new JSONObject();
        __CLR4_1_101b6w1b6wluszwapk.R.inc(61172);obj.put("val", "2017-08-04 15:16:41.00");

        __CLR4_1_101b6w1b6wluszwapk.R.inc(61173);Model model = obj.toJavaObject(Model.class);
        __CLR4_1_101b6w1b6wluszwapk.R.inc(61174);assertNotNull(model.val);
    }finally{__CLR4_1_101b6w1b6wluszwapk.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101b6w1b6wluszwapk.R.globalSliceStart(getClass().getName(),61175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1b7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101b6w1b6wluszwapk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101b6w1b6wluszwapk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1370.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),61175,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1b7b() throws Exception{try{__CLR4_1_101b6w1b6wluszwapk.R.inc(61175);
        __CLR4_1_101b6w1b6wluszwapk.R.inc(61176);JSONObject obj = new JSONObject();
        __CLR4_1_101b6w1b6wluszwapk.R.inc(61177);obj.put("val", "2017-08-04 15:16:41.000");

        __CLR4_1_101b6w1b6wluszwapk.R.inc(61178);Model model = obj.toJavaObject(Model.class);
        __CLR4_1_101b6w1b6wluszwapk.R.inc(61179);assertNotNull(model.val);
    }finally{__CLR4_1_101b6w1b6wluszwapk.R.flushNeeded();}}


    public void test_4() throws Exception {__CLR4_1_101b6w1b6wluszwapk.R.globalSliceStart(getClass().getName(),61180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61b7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101b6w1b6wluszwapk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101b6w1b6wluszwapk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1370.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),61180,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61b7g() throws Exception{try{__CLR4_1_101b6w1b6wluszwapk.R.inc(61180);
        __CLR4_1_101b6w1b6wluszwapk.R.inc(61181);JSONObject obj = new JSONObject();
        __CLR4_1_101b6w1b6wluszwapk.R.inc(61182);obj.put("val", "2017-08-04 15:16:41.000000");

        __CLR4_1_101b6w1b6wluszwapk.R.inc(61183);Model model = obj.toJavaObject(Model.class);
        __CLR4_1_101b6w1b6wluszwapk.R.inc(61184);assertNotNull(model.val);
    }finally{__CLR4_1_101b6w1b6wluszwapk.R.flushNeeded();}}

    public static class Model {
        public Timestamp val;
    }
}
