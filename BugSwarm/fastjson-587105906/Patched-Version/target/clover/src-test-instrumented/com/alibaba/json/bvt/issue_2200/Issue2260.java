/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_2200;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class Issue2260 extends TestCase {static class __CLR4_5_21da01da0lusyjt60{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,63892,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_21da01da0lusyjt60.R.globalSliceStart(getClass().getName(),63864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1da0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21da01da0lusyjt60.R.rethrow($CLV_t2$);}finally{__CLR4_5_21da01da0lusyjt60.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2260.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63864,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1da0() throws Exception{try{__CLR4_5_21da01da0lusyjt60.R.inc(63864);
        __CLR4_5_21da01da0lusyjt60.R.inc(63865);String json = "{\"date\":\"1950-07-14\"}";
        __CLR4_5_21da01da0lusyjt60.R.inc(63866);M1 m = JSON.parseObject(json, M1.class);
        __CLR4_5_21da01da0lusyjt60.R.inc(63867);assertEquals(1950, m.date.get(Calendar.YEAR));
    }finally{__CLR4_5_21da01da0lusyjt60.R.flushNeeded();}}

    public void test_for_jdk8_zdt_1() throws Exception {__CLR4_5_21da01da0lusyjt60.R.globalSliceStart(getClass().getName(),63868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_274507i1da4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21da01da0lusyjt60.R.rethrow($CLV_t2$);}finally{__CLR4_5_21da01da0lusyjt60.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2260.test_for_jdk8_zdt_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63868,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_274507i1da4() throws Exception{try{__CLR4_5_21da01da0lusyjt60.R.inc(63868);
        __CLR4_5_21da01da0lusyjt60.R.inc(63869);String json = "{\"date\":\"1950-07-14\"}";
        __CLR4_5_21da01da0lusyjt60.R.inc(63870);M2 m = JSON.parseObject(json, M2.class);
        __CLR4_5_21da01da0lusyjt60.R.inc(63871);assertEquals(1950, m.date.getYear());
    }finally{__CLR4_5_21da01da0lusyjt60.R.flushNeeded();}}

    public void test_for_jdk8_zdt_2() throws Exception {__CLR4_5_21da01da0lusyjt60.R.globalSliceStart(getClass().getName(),63872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ad4yzz1da8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21da01da0lusyjt60.R.rethrow($CLV_t2$);}finally{__CLR4_5_21da01da0lusyjt60.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2260.test_for_jdk8_zdt_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63872,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ad4yzz1da8() throws Exception{try{__CLR4_5_21da01da0lusyjt60.R.inc(63872);
        __CLR4_5_21da01da0lusyjt60.R.inc(63873);String json = "{\"date\":\"1950-07-14 12:23:34\"}";
        __CLR4_5_21da01da0lusyjt60.R.inc(63874);M2 m = JSON.parseObject(json, M2.class);
        __CLR4_5_21da01da0lusyjt60.R.inc(63875);assertEquals(1950, m.date.getYear());
    }finally{__CLR4_5_21da01da0lusyjt60.R.flushNeeded();}}

    public void test_for_jdk8_zdt_3() throws Exception {__CLR4_5_21da01da0lusyjt60.R.globalSliceStart(getClass().getName(),63876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dm4xsg1dac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21da01da0lusyjt60.R.rethrow($CLV_t2$);}finally{__CLR4_5_21da01da0lusyjt60.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2260.test_for_jdk8_zdt_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63876,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dm4xsg1dac() throws Exception{try{__CLR4_5_21da01da0lusyjt60.R.inc(63876);
        __CLR4_5_21da01da0lusyjt60.R.inc(63877);String json = "{\"date\":\"1950-07-14T12:23:34\"}";
        __CLR4_5_21da01da0lusyjt60.R.inc(63878);M2 m = JSON.parseObject(json, M2.class);
        __CLR4_5_21da01da0lusyjt60.R.inc(63879);assertEquals(1950, m.date.getYear());
    }finally{__CLR4_5_21da01da0lusyjt60.R.flushNeeded();}}

    public void test_for_jdk8_ldt_1() throws Exception {__CLR4_5_21da01da0lusyjt60.R.globalSliceStart(getClass().getName(),63880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w4eups1dag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21da01da0lusyjt60.R.rethrow($CLV_t2$);}finally{__CLR4_5_21da01da0lusyjt60.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2260.test_for_jdk8_ldt_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63880,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w4eups1dag() throws Exception{try{__CLR4_5_21da01da0lusyjt60.R.inc(63880);
        __CLR4_5_21da01da0lusyjt60.R.inc(63881);String json = "{\"date\":\"1950-07-14\"}";
        __CLR4_5_21da01da0lusyjt60.R.inc(63882);M3 m = JSON.parseObject(json, M3.class);
        __CLR4_5_21da01da0lusyjt60.R.inc(63883);assertEquals(1950, m.date.getYear());
    }finally{__CLR4_5_21da01da0lusyjt60.R.flushNeeded();}}

    public void test_for_jdk8_ldt_2() throws Exception {__CLR4_5_21da01da0lusyjt60.R.globalSliceStart(getClass().getName(),63884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zdeti91dak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21da01da0lusyjt60.R.rethrow($CLV_t2$);}finally{__CLR4_5_21da01da0lusyjt60.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2260.test_for_jdk8_ldt_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63884,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zdeti91dak() throws Exception{try{__CLR4_5_21da01da0lusyjt60.R.inc(63884);
        __CLR4_5_21da01da0lusyjt60.R.inc(63885);String json = "{\"date\":\"1950-07-14 12:23:34\"}";
        __CLR4_5_21da01da0lusyjt60.R.inc(63886);M3 m = JSON.parseObject(json, M3.class);
        __CLR4_5_21da01da0lusyjt60.R.inc(63887);assertEquals(1950, m.date.getYear());
    }finally{__CLR4_5_21da01da0lusyjt60.R.flushNeeded();}}

    public void test_for_jdk8_ldt_3() throws Exception {__CLR4_5_21da01da0lusyjt60.R.globalSliceStart(getClass().getName(),63888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wep9oe1dao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21da01da0lusyjt60.R.rethrow($CLV_t2$);}finally{__CLR4_5_21da01da0lusyjt60.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2260.test_for_jdk8_ldt_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63888,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wep9oe1dao() throws Exception{try{__CLR4_5_21da01da0lusyjt60.R.inc(63888);
        __CLR4_5_21da01da0lusyjt60.R.inc(63889);String json = "{\"date\":\"1950-07-14T12:23:34\"}";
        __CLR4_5_21da01da0lusyjt60.R.inc(63890);M3 m = JSON.parseObject(json, M3.class);
        __CLR4_5_21da01da0lusyjt60.R.inc(63891);assertEquals(1950, m.date.getYear());
    }finally{__CLR4_5_21da01da0lusyjt60.R.flushNeeded();}}

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
