/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.jdk8;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class LocalDateTimeTest5 extends TestCase {static class __CLR4_5_21f0e1f0elusvnbxi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,66216,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static Random random = new Random();

    private Locale origin;
    private TimeZone original = TimeZone.getDefault();
    private String[] zoneIds = TimeZone.getAvailableIDs();

    @Override
    protected void setUp() throws Exception {try{__CLR4_5_21f0e1f0elusvnbxi.R.inc(66110);
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66111);int index = random.nextInt(zoneIds.length);
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66112);TimeZone timeZone = TimeZone.getTimeZone(zoneIds[index]);
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66113);TimeZone.setDefault(timeZone);
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66114);JSON.defaultTimeZone = timeZone; // While running mvn tests defaultTimeZone might already be initialized
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66115);origin = Locale.getDefault();
    }finally{__CLR4_5_21f0e1f0elusvnbxi.R.flushNeeded();}}

    @Override
    protected void tearDown() throws Exception {try{__CLR4_5_21f0e1f0elusvnbxi.R.inc(66116);
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66117);TimeZone.setDefault(original);
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66118);JSON.defaultTimeZone = original;
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66119);Locale.setDefault(origin);
    }finally{__CLR4_5_21f0e1f0elusvnbxi.R.flushNeeded();}}

    public void test_for_long() throws Exception {__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceStart(getClass().getName(),66120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_254hl0m1f0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f0e1f0elusvnbxi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66120,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_254hl0m1f0o() throws Exception{try{__CLR4_5_21f0e1f0elusvnbxi.R.inc(66120);
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66121);long millis = 1322874196000L;
        // using localDataTime instance so that different timeZones are tested
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66122);LocalDateTime localDateTime = LocalDateTime.ofInstant(
                Instant.ofEpochMilli(millis), TimeZone.getDefault().toZoneId());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66123);VO vo = JSON.parseObject("{\"date\":" + millis + "}", VO.class);

        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66124);assertEquals("Not Matching year", localDateTime.getYear(), vo.date.getYear());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66125);assertEquals("Not Matching month", localDateTime.getMonthValue(), vo.date.getMonthValue());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66126);assertEquals("Not Matching day", localDateTime.getDayOfMonth(), vo.date.getDayOfMonth());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66127);assertEquals("Not Matching hour", localDateTime.getHour(), vo.date.getHour());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66128);assertEquals("Not Matching minute", localDateTime.getMinute(), vo.date.getMinute());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66129);assertEquals("Not Matching second", localDateTime.getSecond(), vo.date.getSecond());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66130);assertEquals("Not Matching nano", localDateTime.getNano(), vo.date.getNano());
    }finally{__CLR4_5_21f0e1f0elusvnbxi.R.flushNeeded();}}
    
    public void test_for_normal() throws Exception {__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceStart(getClass().getName(),66131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mp8hyp1f0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f0e1f0elusvnbxi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_normal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66131,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mp8hyp1f0z() throws Exception{try{__CLR4_5_21f0e1f0elusvnbxi.R.inc(66131);
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66132);VO vo = JSON.parseObject("{\"date\":\"2011-12-03 09:03:16\"}", VO.class);
        
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66133);assertEquals(2011, vo.date.getYear());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66134);assertEquals(12, vo.date.getMonthValue());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66135);assertEquals(3, vo.date.getDayOfMonth());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66136);assertEquals(9, vo.date.getHour());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66137);assertEquals(3, vo.date.getMinute());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66138);assertEquals(16, vo.date.getSecond());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66139);assertEquals(0, vo.date.getNano());
    }finally{__CLR4_5_21f0e1f0elusvnbxi.R.flushNeeded();}}
    
    public void test_for_iso() throws Exception {__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceStart(getClass().getName(),66140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dfjkpj1f18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f0e1f0elusvnbxi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_iso",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66140,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dfjkpj1f18() throws Exception{try{__CLR4_5_21f0e1f0elusvnbxi.R.inc(66140);
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66141);VO vo = JSON.parseObject("{\"date\":\"2011-12-03T09:03:16\"}", VO.class);
        
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66142);assertEquals(2011, vo.date.getYear());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66143);assertEquals(12, vo.date.getMonthValue());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66144);assertEquals(3, vo.date.getDayOfMonth());
        
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66145);assertEquals(9, vo.date.getHour());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66146);assertEquals(3, vo.date.getMinute());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66147);assertEquals(16, vo.date.getSecond());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66148);assertEquals(0, vo.date.getNano());
    }finally{__CLR4_5_21f0e1f0elusvnbxi.R.flushNeeded();}}
    
    public void test_for_tw() throws Exception {__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceStart(getClass().getName(),66149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l65f8z1f1h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f0e1f0elusvnbxi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_tw",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66149,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l65f8z1f1h() throws Exception{try{__CLR4_5_21f0e1f0elusvnbxi.R.inc(66149);
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66150);VO vo = JSON.parseObject("{\"date\":\"2016/05/06 09:03:16\"}", VO.class);

        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66151);assertEquals(2016, vo.date.getYear());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66152);assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66153);assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21f0e1f0elusvnbxi.R.flushNeeded();}}

    public void test_for_jp() throws Exception {__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceStart(getClass().getName(),66154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e1u1o01f1m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f0e1f0elusvnbxi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_jp",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66154,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e1u1o01f1m() throws Exception{try{__CLR4_5_21f0e1f0elusvnbxi.R.inc(66154);
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66155);VO vo = JSON.parseObject("{\"date\":\"2016\u5e745\u67086\u65e5 09:03:16\"}", VO.class);

        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66156);assertEquals(2016, vo.date.getYear());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66157);assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66158);assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21f0e1f0elusvnbxi.R.flushNeeded();}}
    
    public void test_for_cn() throws Exception {__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceStart(getClass().getName(),66159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cm5y7p1f1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f0e1f0elusvnbxi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_cn",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66159,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cm5y7p1f1r() throws Exception{try{__CLR4_5_21f0e1f0elusvnbxi.R.inc(66159);
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66160);VO vo = JSON.parseObject("{\"date\":\"2016\u5e745\u67086\u65e5 9\u65f63\u520616\u79d2\"}", VO.class);

        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66161);assertEquals(2016, vo.date.getYear());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66162);assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66163);assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21f0e1f0elusvnbxi.R.flushNeeded();}}

    public void test_for_kr() throws Exception {__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceStart(getClass().getName(),66164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2krf66n1f1w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f0e1f0elusvnbxi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_kr",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66164,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2krf66n1f1w() throws Exception{try{__CLR4_5_21f0e1f0elusvnbxi.R.inc(66164);
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66165);VO vo = JSON.parseObject("{\"date\":\"2016\ub1445\uc6d46\uc77c 09:03:16\"}", VO.class);

        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66166);assertEquals(2016, vo.date.getYear());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66167);assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66168);assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21f0e1f0elusvnbxi.R.flushNeeded();}}

    public void test_for_us() throws Exception {__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceStart(getClass().getName(),66169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24gadvc1f21();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f0e1f0elusvnbxi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_us",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66169,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24gadvc1f21() throws Exception{try{__CLR4_5_21f0e1f0elusvnbxi.R.inc(66169);
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66170);VO vo = JSON.parseObject("{\"date\":\"05/26/2016 09:03:16\"}", VO.class);

        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66171);assertEquals(2016, vo.date.getYear());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66172);assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66173);assertEquals(26, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21f0e1f0elusvnbxi.R.flushNeeded();}}

    public void test_for_eur() throws Exception {__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceStart(getClass().getName(),66174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26qj5ru1f26();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f0e1f0elusvnbxi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_eur",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66174,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26qj5ru1f26() throws Exception{try{__CLR4_5_21f0e1f0elusvnbxi.R.inc(66174);
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66175);VO vo = JSON.parseObject("{\"date\":\"26/05/2016 09:03:16\"}", VO.class);

        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66176);assertEquals(2016, vo.date.getYear());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66177);assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66178);assertEquals(26, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21f0e1f0elusvnbxi.R.flushNeeded();}}

    public void test_for_us_1() throws Exception {__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceStart(getClass().getName(),66179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2crooli1f2b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f0e1f0elusvnbxi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_us_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66179,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2crooli1f2b() throws Exception{try{__CLR4_5_21f0e1f0elusvnbxi.R.inc(66179);
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66180);Locale.setDefault(Locale.US);
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66181);VO vo = JSON.parseObject("{\"date\":\"05/06/2016 09:03:16\"}", VO.class);

        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66182);assertEquals(2016, vo.date.getYear());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66183);assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66184);assertEquals(06, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21f0e1f0elusvnbxi.R.flushNeeded();}}

    public void test_for_br() throws Exception {__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceStart(getClass().getName(),66185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_243p35y1f2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f0e1f0elusvnbxi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_br",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66185,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_243p35y1f2h() throws Exception{try{__CLR4_5_21f0e1f0elusvnbxi.R.inc(66185);
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66186);Locale.setDefault(new Locale("pt", "BR"));
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66187);VO vo = JSON.parseObject("{\"date\":\"06/05/2016 09:03:16\"}", VO.class);

        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66188);assertEquals(2016, vo.date.getYear());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66189);assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66190);assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21f0e1f0elusvnbxi.R.flushNeeded();}}

    public void test_for_au() throws Exception {__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceStart(getClass().getName(),66191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o2k3c21f2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f0e1f0elusvnbxi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_au",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66191,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o2k3c21f2n() throws Exception{try{__CLR4_5_21f0e1f0elusvnbxi.R.inc(66191);
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66192);Locale.setDefault(new Locale("en", "AU"));
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66193);VO vo = JSON.parseObject("{\"date\":\"06/05/2016 09:03:16\"}", VO.class);

        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66194);assertEquals(2016, vo.date.getYear());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66195);assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66196);assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21f0e1f0elusvnbxi.R.flushNeeded();}}

    public void test_for_de() throws Exception {__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceStart(getClass().getName(),66197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d315mz1f2t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f0e1f0elusvnbxi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_de",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66197,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d315mz1f2t() throws Exception{try{__CLR4_5_21f0e1f0elusvnbxi.R.inc(66197);
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66198);Locale.setDefault(new Locale("pt", "BR"));
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66199);VO vo = JSON.parseObject("{\"date\":\"06.05.2016 09:03:16\"}", VO.class);

        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66200);assertEquals(2016, vo.date.getYear());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66201);assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66202);assertEquals(6, vo.date.getDayOfMonth());
        
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66203);assertEquals(9, vo.date.getHour());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66204);assertEquals(3, vo.date.getMinute());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66205);assertEquals(16, vo.date.getSecond());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66206);assertEquals(0, vo.date.getNano());
    }finally{__CLR4_5_21f0e1f0elusvnbxi.R.flushNeeded();}}
    
    public void test_for_in() throws Exception {__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceStart(getClass().getName(),66207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m60sgh1f33();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f0e1f0elusvnbxi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f0e1f0elusvnbxi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_in",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66207,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m60sgh1f33() throws Exception{try{__CLR4_5_21f0e1f0elusvnbxi.R.inc(66207);
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66208);VO vo = JSON.parseObject("{\"date\":\"06-05-2016 09:03:16\"}", VO.class);

        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66209);assertEquals(2016, vo.date.getYear());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66210);assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66211);assertEquals(6, vo.date.getDayOfMonth());
        
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66212);assertEquals(9, vo.date.getHour());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66213);assertEquals(3, vo.date.getMinute());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66214);assertEquals(16, vo.date.getSecond());
        __CLR4_5_21f0e1f0elusvnbxi.R.inc(66215);assertEquals(0, vo.date.getNano());
    }finally{__CLR4_5_21f0e1f0elusvnbxi.R.flushNeeded();}}

    public static class VO {
        public LocalDateTime date;
    }
}
