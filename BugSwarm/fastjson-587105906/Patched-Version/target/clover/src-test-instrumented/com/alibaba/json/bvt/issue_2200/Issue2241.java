/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_2200;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;
import org.joda.time.LocalDateTime;

import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Issue2241 extends TestCase {static class __CLR4_5_21d7d1d7dlusyjt5o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,63796,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_21d7d1d7dlusyjt5o.R.inc(63769);
        __CLR4_5_21d7d1d7dlusyjt5o.R.inc(63770);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_21d7d1d7dlusyjt5o.R.inc(63771);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_5_21d7d1d7dlusyjt5o.R.flushNeeded();}}

    public void test_for_issue() throws Exception {__CLR4_5_21d7d1d7dlusyjt5o.R.globalSliceStart(getClass().getName(),63772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1d7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21d7d1d7dlusyjt5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_21d7d1d7dlusyjt5o.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2241.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63772,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1d7g() throws Exception{try{__CLR4_5_21d7d1d7dlusyjt5o.R.inc(63772);
        __CLR4_5_21d7d1d7dlusyjt5o.R.inc(63773);String text = "{\"createTime\":1548166745}";

        __CLR4_5_21d7d1d7dlusyjt5o.R.inc(63774);Order o = JSON.parseObject(text, Order.class);
        __CLR4_5_21d7d1d7dlusyjt5o.R.inc(63775);assertEquals(1548166745000L, o.createTime.getTime());

        __CLR4_5_21d7d1d7dlusyjt5o.R.inc(63776);String json = JSON.toJSONString(o);
        __CLR4_5_21d7d1d7dlusyjt5o.R.inc(63777);assertEquals("{\"createTime\":1548166745}", json);
    }finally{__CLR4_5_21d7d1d7dlusyjt5o.R.flushNeeded();}}

    public void test_for_issue2() throws Exception {__CLR4_5_21d7d1d7dlusyjt5o.R.globalSliceStart(getClass().getName(),63778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rx8ytf1d7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21d7d1d7dlusyjt5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_21d7d1d7dlusyjt5o.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2241.test_for_issue2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63778,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rx8ytf1d7m() throws Exception{try{__CLR4_5_21d7d1d7dlusyjt5o.R.inc(63778);
        __CLR4_5_21d7d1d7dlusyjt5o.R.inc(63779);String text = "{\"createTime\":1548166745}";

        __CLR4_5_21d7d1d7dlusyjt5o.R.inc(63780);Order2 o = JSON.parseObject(text, Order2.class);
        __CLR4_5_21d7d1d7dlusyjt5o.R.inc(63781);assertEquals(1548166745000L, o.createTime.getTimeInMillis());

        __CLR4_5_21d7d1d7dlusyjt5o.R.inc(63782);String json = JSON.toJSONString(o);
        __CLR4_5_21d7d1d7dlusyjt5o.R.inc(63783);assertEquals("{\"createTime\":1548166745}", json);
    }finally{__CLR4_5_21d7d1d7dlusyjt5o.R.flushNeeded();}}

    public void test_for_issue3() throws Exception {__CLR4_5_21d7d1d7dlusyjt5o.R.globalSliceStart(getClass().getName(),63784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v68xlw1d7s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21d7d1d7dlusyjt5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_21d7d1d7dlusyjt5o.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2241.test_for_issue3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63784,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v68xlw1d7s() throws Exception{try{__CLR4_5_21d7d1d7dlusyjt5o.R.inc(63784);
        __CLR4_5_21d7d1d7dlusyjt5o.R.inc(63785);String text = "{\"createTime\":\"20180714224948\"}";

        __CLR4_5_21d7d1d7dlusyjt5o.R.inc(63786);Order3 o = JSON.parseObject(text, Order3.class);
        __CLR4_5_21d7d1d7dlusyjt5o.R.inc(63787);assertEquals(1531579788000L, o.createTime.getTimeInMillis());

        __CLR4_5_21d7d1d7dlusyjt5o.R.inc(63788);String json = JSON.toJSONString(o);
        __CLR4_5_21d7d1d7dlusyjt5o.R.inc(63789);assertEquals("{\"createTime\":\"20180714224948\"}", json);
    }finally{__CLR4_5_21d7d1d7dlusyjt5o.R.flushNeeded();}}

    public void test_for_issue4() throws Exception {__CLR4_5_21d7d1d7dlusyjt5o.R.globalSliceStart(getClass().getName(),63790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yf8wed1d7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21d7d1d7dlusyjt5o.R.rethrow($CLV_t2$);}finally{__CLR4_5_21d7d1d7dlusyjt5o.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2241.test_for_issue4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63790,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yf8wed1d7y() throws Exception{try{__CLR4_5_21d7d1d7dlusyjt5o.R.inc(63790);
        __CLR4_5_21d7d1d7dlusyjt5o.R.inc(63791);String text = "{\"createTime\":1548166745}";

        __CLR4_5_21d7d1d7dlusyjt5o.R.inc(63792);Order4 o = JSON.parseObject(text, Order4.class);
        __CLR4_5_21d7d1d7dlusyjt5o.R.inc(63793);assertEquals(1548166745L, o.createTime.toEpochSecond());

        __CLR4_5_21d7d1d7dlusyjt5o.R.inc(63794);String json = JSON.toJSONString(o);
        __CLR4_5_21d7d1d7dlusyjt5o.R.inc(63795);assertEquals("{\"createTime\":1548166745}", json);
    }finally{__CLR4_5_21d7d1d7dlusyjt5o.R.flushNeeded();}}

    public static class Order {
        @JSONField(format = "unixtime")
        public Date createTime;
    }

    public static class Order2 {
        @JSONField(format = "unixtime")
        public Calendar createTime;
    }

    public static class Order3 {
        @JSONField(format = "yyyyMMddHHmmss")
        public Calendar createTime;
    }

    public static class Order4 {
        @JSONField(format = "unixtime")
        public ZonedDateTime createTime;
    }

}
