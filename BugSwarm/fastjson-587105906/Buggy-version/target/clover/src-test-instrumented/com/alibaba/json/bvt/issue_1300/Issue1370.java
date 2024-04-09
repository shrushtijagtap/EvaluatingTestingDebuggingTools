/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1300;

import com.alibaba.fastjson.JSONObject;
import junit.framework.TestCase;

import java.sql.Timestamp;

/**
 * Created by wenshao on 04/08/2017.
 */
public class Issue1370 extends TestCase {static class __CLR4_1_101a8o1a8olusqk9gf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,59953,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_1_101a8o1a8olusqk9gf.R.globalSliceStart(getClass().getName(),59928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21a8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101a8o1a8olusqk9gf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101a8o1a8olusqk9gf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1370.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),59928,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21a8o() throws Exception{try{__CLR4_1_101a8o1a8olusqk9gf.R.inc(59928);
        __CLR4_1_101a8o1a8olusqk9gf.R.inc(59929);JSONObject obj = new JSONObject();
        __CLR4_1_101a8o1a8olusqk9gf.R.inc(59930);obj.put("val", "2017-08-04 15:16:41.000000000");

        __CLR4_1_101a8o1a8olusqk9gf.R.inc(59931);Model model = obj.toJavaObject(Model.class);
        __CLR4_1_101a8o1a8olusqk9gf.R.inc(59932);assertNotNull(model.val);
    }finally{__CLR4_1_101a8o1a8olusqk9gf.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101a8o1a8olusqk9gf.R.globalSliceStart(getClass().getName(),59933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1a8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101a8o1a8olusqk9gf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101a8o1a8olusqk9gf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1370.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),59933,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1a8t() throws Exception{try{__CLR4_1_101a8o1a8olusqk9gf.R.inc(59933);
        __CLR4_1_101a8o1a8olusqk9gf.R.inc(59934);JSONObject obj = new JSONObject();
        __CLR4_1_101a8o1a8olusqk9gf.R.inc(59935);obj.put("val", "2017-08-04 15:16:41.0");

        __CLR4_1_101a8o1a8olusqk9gf.R.inc(59936);Model model = obj.toJavaObject(Model.class);
        __CLR4_1_101a8o1a8olusqk9gf.R.inc(59937);assertNotNull(model.val);
    }finally{__CLR4_1_101a8o1a8olusqk9gf.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101a8o1a8olusqk9gf.R.globalSliceStart(getClass().getName(),59938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441a8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101a8o1a8olusqk9gf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101a8o1a8olusqk9gf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1370.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),59938,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441a8y() throws Exception{try{__CLR4_1_101a8o1a8olusqk9gf.R.inc(59938);
        __CLR4_1_101a8o1a8olusqk9gf.R.inc(59939);JSONObject obj = new JSONObject();
        __CLR4_1_101a8o1a8olusqk9gf.R.inc(59940);obj.put("val", "2017-08-04 15:16:41.00");

        __CLR4_1_101a8o1a8olusqk9gf.R.inc(59941);Model model = obj.toJavaObject(Model.class);
        __CLR4_1_101a8o1a8olusqk9gf.R.inc(59942);assertNotNull(model.val);
    }finally{__CLR4_1_101a8o1a8olusqk9gf.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101a8o1a8olusqk9gf.R.globalSliceStart(getClass().getName(),59943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1a93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101a8o1a8olusqk9gf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101a8o1a8olusqk9gf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1370.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),59943,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1a93() throws Exception{try{__CLR4_1_101a8o1a8olusqk9gf.R.inc(59943);
        __CLR4_1_101a8o1a8olusqk9gf.R.inc(59944);JSONObject obj = new JSONObject();
        __CLR4_1_101a8o1a8olusqk9gf.R.inc(59945);obj.put("val", "2017-08-04 15:16:41.000");

        __CLR4_1_101a8o1a8olusqk9gf.R.inc(59946);Model model = obj.toJavaObject(Model.class);
        __CLR4_1_101a8o1a8olusqk9gf.R.inc(59947);assertNotNull(model.val);
    }finally{__CLR4_1_101a8o1a8olusqk9gf.R.flushNeeded();}}


    public void test_4() throws Exception {__CLR4_1_101a8o1a8olusqk9gf.R.globalSliceStart(getClass().getName(),59948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61a98();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101a8o1a8olusqk9gf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101a8o1a8olusqk9gf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1370.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),59948,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61a98() throws Exception{try{__CLR4_1_101a8o1a8olusqk9gf.R.inc(59948);
        __CLR4_1_101a8o1a8olusqk9gf.R.inc(59949);JSONObject obj = new JSONObject();
        __CLR4_1_101a8o1a8olusqk9gf.R.inc(59950);obj.put("val", "2017-08-04 15:16:41.000000");

        __CLR4_1_101a8o1a8olusqk9gf.R.inc(59951);Model model = obj.toJavaObject(Model.class);
        __CLR4_1_101a8o1a8olusqk9gf.R.inc(59952);assertNotNull(model.val);
    }finally{__CLR4_1_101a8o1a8olusqk9gf.R.flushNeeded();}}

    public static class Model {
        public Timestamp val;
    }
}
