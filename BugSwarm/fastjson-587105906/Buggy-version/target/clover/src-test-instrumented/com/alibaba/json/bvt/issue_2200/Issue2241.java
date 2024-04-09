/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_2200;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;
import org.joda.time.LocalDateTime;

import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Issue2241 extends TestCase {static class __CLR4_1_101d7o1d7olusqkbnd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,63807,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_101d7o1d7olusqkbnd.R.inc(63780);
        __CLR4_1_101d7o1d7olusqkbnd.R.inc(63781);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_1_101d7o1d7olusqkbnd.R.inc(63782);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_1_101d7o1d7olusqkbnd.R.flushNeeded();}}

    public void test_for_issue() throws Exception {__CLR4_1_101d7o1d7olusqkbnd.R.globalSliceStart(getClass().getName(),63783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1d7r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101d7o1d7olusqkbnd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101d7o1d7olusqkbnd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2241.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63783,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1d7r() throws Exception{try{__CLR4_1_101d7o1d7olusqkbnd.R.inc(63783);
        __CLR4_1_101d7o1d7olusqkbnd.R.inc(63784);String text = "{\"createTime\":1548166745}";

        __CLR4_1_101d7o1d7olusqkbnd.R.inc(63785);Order o = JSON.parseObject(text, Order.class);
        __CLR4_1_101d7o1d7olusqkbnd.R.inc(63786);assertEquals(1548166745000L, o.createTime.getTime());

        __CLR4_1_101d7o1d7olusqkbnd.R.inc(63787);String json = JSON.toJSONString(o);
        __CLR4_1_101d7o1d7olusqkbnd.R.inc(63788);assertEquals("{\"createTime\":1548166745}", json);
    }finally{__CLR4_1_101d7o1d7olusqkbnd.R.flushNeeded();}}

    public void test_for_issue2() throws Exception {__CLR4_1_101d7o1d7olusqkbnd.R.globalSliceStart(getClass().getName(),63789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rx8ytf1d7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101d7o1d7olusqkbnd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101d7o1d7olusqkbnd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2241.test_for_issue2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63789,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rx8ytf1d7x() throws Exception{try{__CLR4_1_101d7o1d7olusqkbnd.R.inc(63789);
        __CLR4_1_101d7o1d7olusqkbnd.R.inc(63790);String text = "{\"createTime\":1548166745}";

        __CLR4_1_101d7o1d7olusqkbnd.R.inc(63791);Order2 o = JSON.parseObject(text, Order2.class);
        __CLR4_1_101d7o1d7olusqkbnd.R.inc(63792);assertEquals(1548166745000L, o.createTime.getTimeInMillis());

        __CLR4_1_101d7o1d7olusqkbnd.R.inc(63793);String json = JSON.toJSONString(o);
        __CLR4_1_101d7o1d7olusqkbnd.R.inc(63794);assertEquals("{\"createTime\":1548166745}", json);
    }finally{__CLR4_1_101d7o1d7olusqkbnd.R.flushNeeded();}}

    public void test_for_issue3() throws Exception {__CLR4_1_101d7o1d7olusqkbnd.R.globalSliceStart(getClass().getName(),63795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v68xlw1d83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101d7o1d7olusqkbnd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101d7o1d7olusqkbnd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2241.test_for_issue3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63795,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v68xlw1d83() throws Exception{try{__CLR4_1_101d7o1d7olusqkbnd.R.inc(63795);
        __CLR4_1_101d7o1d7olusqkbnd.R.inc(63796);String text = "{\"createTime\":\"20180714224948\"}";

        __CLR4_1_101d7o1d7olusqkbnd.R.inc(63797);Order3 o = JSON.parseObject(text, Order3.class);
        __CLR4_1_101d7o1d7olusqkbnd.R.inc(63798);assertEquals(1531579788000L, o.createTime.getTimeInMillis());

        __CLR4_1_101d7o1d7olusqkbnd.R.inc(63799);String json = JSON.toJSONString(o);
        __CLR4_1_101d7o1d7olusqkbnd.R.inc(63800);assertEquals("{\"createTime\":\"20180714224948\"}", json);
    }finally{__CLR4_1_101d7o1d7olusqkbnd.R.flushNeeded();}}

    public void test_for_issue4() throws Exception {__CLR4_1_101d7o1d7olusqkbnd.R.globalSliceStart(getClass().getName(),63801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yf8wed1d89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101d7o1d7olusqkbnd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101d7o1d7olusqkbnd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2241.test_for_issue4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63801,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yf8wed1d89() throws Exception{try{__CLR4_1_101d7o1d7olusqkbnd.R.inc(63801);
        __CLR4_1_101d7o1d7olusqkbnd.R.inc(63802);String text = "{\"createTime\":1548166745}";

        __CLR4_1_101d7o1d7olusqkbnd.R.inc(63803);Order4 o = JSON.parseObject(text, Order4.class);
        __CLR4_1_101d7o1d7olusqkbnd.R.inc(63804);assertEquals(1548166745L, o.createTime.toEpochSecond());

        __CLR4_1_101d7o1d7olusqkbnd.R.inc(63805);String json = JSON.toJSONString(o);
        __CLR4_1_101d7o1d7olusqkbnd.R.inc(63806);assertEquals("{\"createTime\":1548166745}", json);
    }finally{__CLR4_1_101d7o1d7olusqkbnd.R.flushNeeded();}}

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
