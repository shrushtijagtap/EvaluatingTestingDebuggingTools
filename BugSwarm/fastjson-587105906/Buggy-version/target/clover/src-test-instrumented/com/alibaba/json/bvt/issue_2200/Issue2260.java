/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_2200;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class Issue2260 extends TestCase {static class __CLR4_1_101e8j1e8jluszwbom{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,65135,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_101e8j1e8jluszwbom.R.globalSliceStart(getClass().getName(),65107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1e8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e8j1e8jluszwbom.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e8j1e8jluszwbom.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2260.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65107,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1e8j() throws Exception{try{__CLR4_1_101e8j1e8jluszwbom.R.inc(65107);
        __CLR4_1_101e8j1e8jluszwbom.R.inc(65108);String json = "{\"date\":\"1950-07-14\"}";
        __CLR4_1_101e8j1e8jluszwbom.R.inc(65109);M1 m = JSON.parseObject(json, M1.class);
        __CLR4_1_101e8j1e8jluszwbom.R.inc(65110);assertEquals(1950, m.date.get(Calendar.YEAR));
    }finally{__CLR4_1_101e8j1e8jluszwbom.R.flushNeeded();}}

    public void test_for_jdk8_zdt_1() throws Exception {__CLR4_1_101e8j1e8jluszwbom.R.globalSliceStart(getClass().getName(),65111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1074507i1e8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e8j1e8jluszwbom.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e8j1e8jluszwbom.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2260.test_for_jdk8_zdt_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65111,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1074507i1e8n() throws Exception{try{__CLR4_1_101e8j1e8jluszwbom.R.inc(65111);
        __CLR4_1_101e8j1e8jluszwbom.R.inc(65112);String json = "{\"date\":\"1950-07-14\"}";
        __CLR4_1_101e8j1e8jluszwbom.R.inc(65113);M2 m = JSON.parseObject(json, M2.class);
        __CLR4_1_101e8j1e8jluszwbom.R.inc(65114);assertEquals(1950, m.date.getYear());
    }finally{__CLR4_1_101e8j1e8jluszwbom.R.flushNeeded();}}

    public void test_for_jdk8_zdt_2() throws Exception {__CLR4_1_101e8j1e8jluszwbom.R.globalSliceStart(getClass().getName(),65115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ad4yzz1e8r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e8j1e8jluszwbom.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e8j1e8jluszwbom.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2260.test_for_jdk8_zdt_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65115,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ad4yzz1e8r() throws Exception{try{__CLR4_1_101e8j1e8jluszwbom.R.inc(65115);
        __CLR4_1_101e8j1e8jluszwbom.R.inc(65116);String json = "{\"date\":\"1950-07-14 12:23:34\"}";
        __CLR4_1_101e8j1e8jluszwbom.R.inc(65117);M2 m = JSON.parseObject(json, M2.class);
        __CLR4_1_101e8j1e8jluszwbom.R.inc(65118);assertEquals(1950, m.date.getYear());
    }finally{__CLR4_1_101e8j1e8jluszwbom.R.flushNeeded();}}

    public void test_for_jdk8_zdt_3() throws Exception {__CLR4_1_101e8j1e8jluszwbom.R.globalSliceStart(getClass().getName(),65119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dm4xsg1e8v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e8j1e8jluszwbom.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e8j1e8jluszwbom.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2260.test_for_jdk8_zdt_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65119,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dm4xsg1e8v() throws Exception{try{__CLR4_1_101e8j1e8jluszwbom.R.inc(65119);
        __CLR4_1_101e8j1e8jluszwbom.R.inc(65120);String json = "{\"date\":\"1950-07-14T12:23:34\"}";
        __CLR4_1_101e8j1e8jluszwbom.R.inc(65121);M2 m = JSON.parseObject(json, M2.class);
        __CLR4_1_101e8j1e8jluszwbom.R.inc(65122);assertEquals(1950, m.date.getYear());
    }finally{__CLR4_1_101e8j1e8jluszwbom.R.flushNeeded();}}

    public void test_for_jdk8_ldt_1() throws Exception {__CLR4_1_101e8j1e8jluszwbom.R.globalSliceStart(getClass().getName(),65123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10w4eups1e8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e8j1e8jluszwbom.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e8j1e8jluszwbom.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2260.test_for_jdk8_ldt_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65123,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10w4eups1e8z() throws Exception{try{__CLR4_1_101e8j1e8jluszwbom.R.inc(65123);
        __CLR4_1_101e8j1e8jluszwbom.R.inc(65124);String json = "{\"date\":\"1950-07-14\"}";
        __CLR4_1_101e8j1e8jluszwbom.R.inc(65125);M3 m = JSON.parseObject(json, M3.class);
        __CLR4_1_101e8j1e8jluszwbom.R.inc(65126);assertEquals(1950, m.date.getYear());
    }finally{__CLR4_1_101e8j1e8jluszwbom.R.flushNeeded();}}

    public void test_for_jdk8_ldt_2() throws Exception {__CLR4_1_101e8j1e8jluszwbom.R.globalSliceStart(getClass().getName(),65127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zdeti91e93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e8j1e8jluszwbom.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e8j1e8jluszwbom.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2260.test_for_jdk8_ldt_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65127,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zdeti91e93() throws Exception{try{__CLR4_1_101e8j1e8jluszwbom.R.inc(65127);
        __CLR4_1_101e8j1e8jluszwbom.R.inc(65128);String json = "{\"date\":\"1950-07-14 12:23:34\"}";
        __CLR4_1_101e8j1e8jluszwbom.R.inc(65129);M3 m = JSON.parseObject(json, M3.class);
        __CLR4_1_101e8j1e8jluszwbom.R.inc(65130);assertEquals(1950, m.date.getYear());
    }finally{__CLR4_1_101e8j1e8jluszwbom.R.flushNeeded();}}

    public void test_for_jdk8_ldt_3() throws Exception {__CLR4_1_101e8j1e8jluszwbom.R.globalSliceStart(getClass().getName(),65131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wep9oe1e97();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e8j1e8jluszwbom.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e8j1e8jluszwbom.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2260.test_for_jdk8_ldt_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65131,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wep9oe1e97() throws Exception{try{__CLR4_1_101e8j1e8jluszwbom.R.inc(65131);
        __CLR4_1_101e8j1e8jluszwbom.R.inc(65132);String json = "{\"date\":\"1950-07-14T12:23:34\"}";
        __CLR4_1_101e8j1e8jluszwbom.R.inc(65133);M3 m = JSON.parseObject(json, M3.class);
        __CLR4_1_101e8j1e8jluszwbom.R.inc(65134);assertEquals(1950, m.date.getYear());
    }finally{__CLR4_1_101e8j1e8jluszwbom.R.flushNeeded();}}

    public static class M1 {
        public Calendar date;
    }

    public static class M2 {
        public ZonedDateTime date;
    }

    public static class M3 {
        public LocalDateTime date;
    }

}
