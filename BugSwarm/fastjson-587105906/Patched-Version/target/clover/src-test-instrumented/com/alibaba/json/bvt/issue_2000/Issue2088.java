/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_2000;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Issue2088 extends TestCase {static class __CLR4_5_21drb1drblusvnb7d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,64504,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_21drb1drblusvnb7d.R.inc(64487);
        __CLR4_5_21drb1drblusvnb7d.R.inc(64488);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_21drb1drblusvnb7d.R.inc(64489);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_5_21drb1drblusvnb7d.R.flushNeeded();}}

    public void test_for_issue() throws Exception {__CLR4_5_21drb1drblusvnb7d.R.globalSliceStart(getClass().getName(),64490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1dre();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21drb1drblusvnb7d.R.rethrow($CLV_t2$);}finally{__CLR4_5_21drb1drblusvnb7d.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2000.Issue2088.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64490,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1dre() throws Exception{try{__CLR4_5_21drb1drblusvnb7d.R.inc(64490);
        __CLR4_5_21drb1drblusvnb7d.R.inc(64491);String json = "{\"date\":\"20181011103607186+0800\"}";
        __CLR4_5_21drb1drblusvnb7d.R.inc(64492);Model m = JSON.parseObject(json, Model.class);

        __CLR4_5_21drb1drblusvnb7d.R.inc(64493);SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSSZ");
        __CLR4_5_21drb1drblusvnb7d.R.inc(64494);format.setTimeZone(JSON.defaultTimeZone);
        __CLR4_5_21drb1drblusvnb7d.R.inc(64495);Date date = format.parse("20181011103607186+0800");

        __CLR4_5_21drb1drblusvnb7d.R.inc(64496);assertEquals(date, m.date);
    }finally{__CLR4_5_21drb1drblusvnb7d.R.flushNeeded();}}

    public void test_for_issue_1() throws Exception {__CLR4_5_21drb1drblusvnb7d.R.globalSliceStart(getClass().getName(),64497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uhstn51drl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21drb1drblusvnb7d.R.rethrow($CLV_t2$);}finally{__CLR4_5_21drb1drblusvnb7d.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2000.Issue2088.test_for_issue_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64497,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uhstn51drl() throws Exception{try{__CLR4_5_21drb1drblusvnb7d.R.inc(64497);
        __CLR4_5_21drb1drblusvnb7d.R.inc(64498);String json = "{\"date\":\"20181011103607186-0800\"}";
        __CLR4_5_21drb1drblusvnb7d.R.inc(64499);Model m = JSON.parseObject(json, Model.class);

        __CLR4_5_21drb1drblusvnb7d.R.inc(64500);SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSSZ", JSON.defaultLocale);
        __CLR4_5_21drb1drblusvnb7d.R.inc(64501);format.setTimeZone(JSON.defaultTimeZone);
        __CLR4_5_21drb1drblusvnb7d.R.inc(64502);Date date = format.parse("20181011103607186-0800");

        __CLR4_5_21drb1drblusvnb7d.R.inc(64503);assertEquals(date, m.date);
    }finally{__CLR4_5_21drb1drblusvnb7d.R.flushNeeded();}}

    public static class Model {
        @JSONField(format = "yyyyMMddHHmmssSSSZ")
        public Date date;
    }
}
