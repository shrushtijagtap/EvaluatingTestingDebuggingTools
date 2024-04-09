/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_2200;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class Issue2260 extends TestCase {static class __CLR4_5_21e881e88lusvnbdx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,65124,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_21e881e88lusvnbdx.R.globalSliceStart(getClass().getName(),65096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1e88();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e881e88lusvnbdx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e881e88lusvnbdx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2260.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65096,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1e88() throws Exception{try{__CLR4_5_21e881e88lusvnbdx.R.inc(65096);
        __CLR4_5_21e881e88lusvnbdx.R.inc(65097);String json = "{\"date\":\"1950-07-14\"}";
        __CLR4_5_21e881e88lusvnbdx.R.inc(65098);M1 m = JSON.parseObject(json, M1.class);
        __CLR4_5_21e881e88lusvnbdx.R.inc(65099);assertEquals(1950, m.date.get(Calendar.YEAR));
    }finally{__CLR4_5_21e881e88lusvnbdx.R.flushNeeded();}}

    public void test_for_jdk8_zdt_1() throws Exception {__CLR4_5_21e881e88lusvnbdx.R.globalSliceStart(getClass().getName(),65100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_274507i1e8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e881e88lusvnbdx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e881e88lusvnbdx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2260.test_for_jdk8_zdt_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65100,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_274507i1e8c() throws Exception{try{__CLR4_5_21e881e88lusvnbdx.R.inc(65100);
        __CLR4_5_21e881e88lusvnbdx.R.inc(65101);String json = "{\"date\":\"1950-07-14\"}";
        __CLR4_5_21e881e88lusvnbdx.R.inc(65102);M2 m = JSON.parseObject(json, M2.class);
        __CLR4_5_21e881e88lusvnbdx.R.inc(65103);assertEquals(1950, m.date.getYear());
    }finally{__CLR4_5_21e881e88lusvnbdx.R.flushNeeded();}}

    public void test_for_jdk8_zdt_2() throws Exception {__CLR4_5_21e881e88lusvnbdx.R.globalSliceStart(getClass().getName(),65104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ad4yzz1e8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e881e88lusvnbdx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e881e88lusvnbdx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2260.test_for_jdk8_zdt_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65104,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ad4yzz1e8g() throws Exception{try{__CLR4_5_21e881e88lusvnbdx.R.inc(65104);
        __CLR4_5_21e881e88lusvnbdx.R.inc(65105);String json = "{\"date\":\"1950-07-14 12:23:34\"}";
        __CLR4_5_21e881e88lusvnbdx.R.inc(65106);M2 m = JSON.parseObject(json, M2.class);
        __CLR4_5_21e881e88lusvnbdx.R.inc(65107);assertEquals(1950, m.date.getYear());
    }finally{__CLR4_5_21e881e88lusvnbdx.R.flushNeeded();}}

    public void test_for_jdk8_zdt_3() throws Exception {__CLR4_5_21e881e88lusvnbdx.R.globalSliceStart(getClass().getName(),65108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dm4xsg1e8k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e881e88lusvnbdx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e881e88lusvnbdx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2260.test_for_jdk8_zdt_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65108,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dm4xsg1e8k() throws Exception{try{__CLR4_5_21e881e88lusvnbdx.R.inc(65108);
        __CLR4_5_21e881e88lusvnbdx.R.inc(65109);String json = "{\"date\":\"1950-07-14T12:23:34\"}";
        __CLR4_5_21e881e88lusvnbdx.R.inc(65110);M2 m = JSON.parseObject(json, M2.class);
        __CLR4_5_21e881e88lusvnbdx.R.inc(65111);assertEquals(1950, m.date.getYear());
    }finally{__CLR4_5_21e881e88lusvnbdx.R.flushNeeded();}}

    public void test_for_jdk8_ldt_1() throws Exception {__CLR4_5_21e881e88lusvnbdx.R.globalSliceStart(getClass().getName(),65112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w4eups1e8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e881e88lusvnbdx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e881e88lusvnbdx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2260.test_for_jdk8_ldt_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65112,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w4eups1e8o() throws Exception{try{__CLR4_5_21e881e88lusvnbdx.R.inc(65112);
        __CLR4_5_21e881e88lusvnbdx.R.inc(65113);String json = "{\"date\":\"1950-07-14\"}";
        __CLR4_5_21e881e88lusvnbdx.R.inc(65114);M3 m = JSON.parseObject(json, M3.class);
        __CLR4_5_21e881e88lusvnbdx.R.inc(65115);assertEquals(1950, m.date.getYear());
    }finally{__CLR4_5_21e881e88lusvnbdx.R.flushNeeded();}}

    public void test_for_jdk8_ldt_2() throws Exception {__CLR4_5_21e881e88lusvnbdx.R.globalSliceStart(getClass().getName(),65116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zdeti91e8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e881e88lusvnbdx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e881e88lusvnbdx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2260.test_for_jdk8_ldt_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65116,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zdeti91e8s() throws Exception{try{__CLR4_5_21e881e88lusvnbdx.R.inc(65116);
        __CLR4_5_21e881e88lusvnbdx.R.inc(65117);String json = "{\"date\":\"1950-07-14 12:23:34\"}";
        __CLR4_5_21e881e88lusvnbdx.R.inc(65118);M3 m = JSON.parseObject(json, M3.class);
        __CLR4_5_21e881e88lusvnbdx.R.inc(65119);assertEquals(1950, m.date.getYear());
    }finally{__CLR4_5_21e881e88lusvnbdx.R.flushNeeded();}}

    public void test_for_jdk8_ldt_3() throws Exception {__CLR4_5_21e881e88lusvnbdx.R.globalSliceStart(getClass().getName(),65120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wep9oe1e8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e881e88lusvnbdx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e881e88lusvnbdx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2260.test_for_jdk8_ldt_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65120,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wep9oe1e8w() throws Exception{try{__CLR4_5_21e881e88lusvnbdx.R.inc(65120);
        __CLR4_5_21e881e88lusvnbdx.R.inc(65121);String json = "{\"date\":\"1950-07-14T12:23:34\"}";
        __CLR4_5_21e881e88lusvnbdx.R.inc(65122);M3 m = JSON.parseObject(json, M3.class);
        __CLR4_5_21e881e88lusvnbdx.R.inc(65123);assertEquals(1950, m.date.getYear());
    }finally{__CLR4_5_21e881e88lusvnbdx.R.flushNeeded();}}

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
