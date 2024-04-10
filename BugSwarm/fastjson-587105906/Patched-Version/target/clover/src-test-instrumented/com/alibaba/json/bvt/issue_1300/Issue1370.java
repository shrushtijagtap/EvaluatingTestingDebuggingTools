/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1300;

import com.alibaba.fastjson.JSONObject;
import junit.framework.TestCase;

import java.sql.Timestamp;

/**
 * Created by wenshao on 04/08/2017.
 */
public class Issue1370 extends TestCase {static class __CLR4_5_21a8d1a8dlusyjssz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,59942,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_5_21a8d1a8dlusyjssz.R.globalSliceStart(getClass().getName(),59917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21a8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21a8d1a8dlusyjssz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21a8d1a8dlusyjssz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1370.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59917,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21a8d() throws Exception{try{__CLR4_5_21a8d1a8dlusyjssz.R.inc(59917);
        __CLR4_5_21a8d1a8dlusyjssz.R.inc(59918);JSONObject obj = new JSONObject();
        __CLR4_5_21a8d1a8dlusyjssz.R.inc(59919);obj.put("val", "2017-08-04 15:16:41.000000000");

        __CLR4_5_21a8d1a8dlusyjssz.R.inc(59920);Model model = obj.toJavaObject(Model.class);
        __CLR4_5_21a8d1a8dlusyjssz.R.inc(59921);assertNotNull(model.val);
    }finally{__CLR4_5_21a8d1a8dlusyjssz.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21a8d1a8dlusyjssz.R.globalSliceStart(getClass().getName(),59922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1a8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21a8d1a8dlusyjssz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21a8d1a8dlusyjssz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1370.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59922,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1a8i() throws Exception{try{__CLR4_5_21a8d1a8dlusyjssz.R.inc(59922);
        __CLR4_5_21a8d1a8dlusyjssz.R.inc(59923);JSONObject obj = new JSONObject();
        __CLR4_5_21a8d1a8dlusyjssz.R.inc(59924);obj.put("val", "2017-08-04 15:16:41.0");

        __CLR4_5_21a8d1a8dlusyjssz.R.inc(59925);Model model = obj.toJavaObject(Model.class);
        __CLR4_5_21a8d1a8dlusyjssz.R.inc(59926);assertNotNull(model.val);
    }finally{__CLR4_5_21a8d1a8dlusyjssz.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21a8d1a8dlusyjssz.R.globalSliceStart(getClass().getName(),59927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441a8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21a8d1a8dlusyjssz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21a8d1a8dlusyjssz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1370.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59927,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441a8n() throws Exception{try{__CLR4_5_21a8d1a8dlusyjssz.R.inc(59927);
        __CLR4_5_21a8d1a8dlusyjssz.R.inc(59928);JSONObject obj = new JSONObject();
        __CLR4_5_21a8d1a8dlusyjssz.R.inc(59929);obj.put("val", "2017-08-04 15:16:41.00");

        __CLR4_5_21a8d1a8dlusyjssz.R.inc(59930);Model model = obj.toJavaObject(Model.class);
        __CLR4_5_21a8d1a8dlusyjssz.R.inc(59931);assertNotNull(model.val);
    }finally{__CLR4_5_21a8d1a8dlusyjssz.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21a8d1a8dlusyjssz.R.globalSliceStart(getClass().getName(),59932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1a8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21a8d1a8dlusyjssz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21a8d1a8dlusyjssz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1370.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59932,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1a8s() throws Exception{try{__CLR4_5_21a8d1a8dlusyjssz.R.inc(59932);
        __CLR4_5_21a8d1a8dlusyjssz.R.inc(59933);JSONObject obj = new JSONObject();
        __CLR4_5_21a8d1a8dlusyjssz.R.inc(59934);obj.put("val", "2017-08-04 15:16:41.000");

        __CLR4_5_21a8d1a8dlusyjssz.R.inc(59935);Model model = obj.toJavaObject(Model.class);
        __CLR4_5_21a8d1a8dlusyjssz.R.inc(59936);assertNotNull(model.val);
    }finally{__CLR4_5_21a8d1a8dlusyjssz.R.flushNeeded();}}


    public void test_4() throws Exception {__CLR4_5_21a8d1a8dlusyjssz.R.globalSliceStart(getClass().getName(),59937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61a8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21a8d1a8dlusyjssz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21a8d1a8dlusyjssz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1370.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59937,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61a8x() throws Exception{try{__CLR4_5_21a8d1a8dlusyjssz.R.inc(59937);
        __CLR4_5_21a8d1a8dlusyjssz.R.inc(59938);JSONObject obj = new JSONObject();
        __CLR4_5_21a8d1a8dlusyjssz.R.inc(59939);obj.put("val", "2017-08-04 15:16:41.000000");

        __CLR4_5_21a8d1a8dlusyjssz.R.inc(59940);Model model = obj.toJavaObject(Model.class);
        __CLR4_5_21a8d1a8dlusyjssz.R.inc(59941);assertNotNull(model.val);
    }finally{__CLR4_5_21a8d1a8dlusyjssz.R.flushNeeded();}}

    public static class Model {
        public Timestamp val;
    }
}
