/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.jdk8;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class LocalDateTimeTest5 extends TestCase {static class __CLR4_1_101f0p1f0pluszwbw3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,66227,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static Random random = new Random();

    private Locale origin;
    private TimeZone original = TimeZone.getDefault();
    private String[] zoneIds = TimeZone.getAvailableIDs();

    @Override
    protected void setUp() throws Exception {try{__CLR4_1_101f0p1f0pluszwbw3.R.inc(66121);
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66122);int index = random.nextInt(zoneIds.length);
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66123);TimeZone timeZone = TimeZone.getTimeZone(zoneIds[index]);
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66124);TimeZone.setDefault(timeZone);
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66125);JSON.defaultTimeZone = timeZone; // While running mvn tests defaultTimeZone might already be initialized
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66126);origin = Locale.getDefault();
    }finally{__CLR4_1_101f0p1f0pluszwbw3.R.flushNeeded();}}

    @Override
    protected void tearDown() throws Exception {try{__CLR4_1_101f0p1f0pluszwbw3.R.inc(66127);
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66128);TimeZone.setDefault(original);
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66129);JSON.defaultTimeZone = original;
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66130);Locale.setDefault(origin);
    }finally{__CLR4_1_101f0p1f0pluszwbw3.R.flushNeeded();}}

    public void test_for_long() throws Exception {__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceStart(getClass().getName(),66131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1054hl0m1f0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f0p1f0pluszwbw3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_long",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66131,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1054hl0m1f0z() throws Exception{try{__CLR4_1_101f0p1f0pluszwbw3.R.inc(66131);
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66132);long millis = 1322874196000L;
        // using localDataTime instance so that different timeZones are tested
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66133);LocalDateTime localDateTime = LocalDateTime.ofInstant(
                Instant.ofEpochMilli(millis), TimeZone.getDefault().toZoneId());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66134);VO vo = JSON.parseObject("{\"date\":" + millis + "}", VO.class);

        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66135);assertEquals("Not Matching year", localDateTime.getYear(), vo.date.getYear());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66136);assertEquals("Not Matching month", localDateTime.getMonthValue(), vo.date.getMonthValue());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66137);assertEquals("Not Matching day", localDateTime.getDayOfMonth(), vo.date.getDayOfMonth());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66138);assertEquals("Not Matching hour", localDateTime.getHour(), vo.date.getHour());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66139);assertEquals("Not Matching minute", localDateTime.getMinute(), vo.date.getMinute());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66140);assertEquals("Not Matching second", localDateTime.getSecond(), vo.date.getSecond());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66141);assertEquals("Not Matching nano", localDateTime.getNano(), vo.date.getNano());
    }finally{__CLR4_1_101f0p1f0pluszwbw3.R.flushNeeded();}}
    
    public void test_for_normal() throws Exception {__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceStart(getClass().getName(),66142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mp8hyp1f1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f0p1f0pluszwbw3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_normal",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66142,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mp8hyp1f1a() throws Exception{try{__CLR4_1_101f0p1f0pluszwbw3.R.inc(66142);
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66143);VO vo = JSON.parseObject("{\"date\":\"2011-12-03 09:03:16\"}", VO.class);
        
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66144);assertEquals(2011, vo.date.getYear());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66145);assertEquals(12, vo.date.getMonthValue());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66146);assertEquals(3, vo.date.getDayOfMonth());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66147);assertEquals(9, vo.date.getHour());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66148);assertEquals(3, vo.date.getMinute());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66149);assertEquals(16, vo.date.getSecond());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66150);assertEquals(0, vo.date.getNano());
    }finally{__CLR4_1_101f0p1f0pluszwbw3.R.flushNeeded();}}
    
    public void test_for_iso() throws Exception {__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceStart(getClass().getName(),66151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dfjkpj1f1j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f0p1f0pluszwbw3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_iso",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66151,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dfjkpj1f1j() throws Exception{try{__CLR4_1_101f0p1f0pluszwbw3.R.inc(66151);
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66152);VO vo = JSON.parseObject("{\"date\":\"2011-12-03T09:03:16\"}", VO.class);
        
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66153);assertEquals(2011, vo.date.getYear());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66154);assertEquals(12, vo.date.getMonthValue());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66155);assertEquals(3, vo.date.getDayOfMonth());
        
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66156);assertEquals(9, vo.date.getHour());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66157);assertEquals(3, vo.date.getMinute());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66158);assertEquals(16, vo.date.getSecond());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66159);assertEquals(0, vo.date.getNano());
    }finally{__CLR4_1_101f0p1f0pluszwbw3.R.flushNeeded();}}
    
    public void test_for_tw() throws Exception {__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceStart(getClass().getName(),66160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10l65f8z1f1s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f0p1f0pluszwbw3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_tw",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66160,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10l65f8z1f1s() throws Exception{try{__CLR4_1_101f0p1f0pluszwbw3.R.inc(66160);
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66161);VO vo = JSON.parseObject("{\"date\":\"2016/05/06 09:03:16\"}", VO.class);

        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66162);assertEquals(2016, vo.date.getYear());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66163);assertEquals(5, vo.date.getMonthValue());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66164);assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_1_101f0p1f0pluszwbw3.R.flushNeeded();}}

    public void test_for_jp() throws Exception {__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceStart(getClass().getName(),66165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e1u1o01f1x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f0p1f0pluszwbw3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_jp",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66165,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e1u1o01f1x() throws Exception{try{__CLR4_1_101f0p1f0pluszwbw3.R.inc(66165);
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66166);VO vo = JSON.parseObject("{\"date\":\"2016\u5e745\u67086\u65e5 09:03:16\"}", VO.class);

        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66167);assertEquals(2016, vo.date.getYear());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66168);assertEquals(5, vo.date.getMonthValue());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66169);assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_1_101f0p1f0pluszwbw3.R.flushNeeded();}}
    
    public void test_for_cn() throws Exception {__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceStart(getClass().getName(),66170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10cm5y7p1f22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f0p1f0pluszwbw3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_cn",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66170,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10cm5y7p1f22() throws Exception{try{__CLR4_1_101f0p1f0pluszwbw3.R.inc(66170);
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66171);VO vo = JSON.parseObject("{\"date\":\"2016\u5e745\u67086\u65e5 9\u65f63\u520616\u79d2\"}", VO.class);

        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66172);assertEquals(2016, vo.date.getYear());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66173);assertEquals(5, vo.date.getMonthValue());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66174);assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_1_101f0p1f0pluszwbw3.R.flushNeeded();}}

    public void test_for_kr() throws Exception {__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceStart(getClass().getName(),66175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10krf66n1f27();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f0p1f0pluszwbw3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_kr",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66175,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10krf66n1f27() throws Exception{try{__CLR4_1_101f0p1f0pluszwbw3.R.inc(66175);
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66176);VO vo = JSON.parseObject("{\"date\":\"2016\ub1445\uc6d46\uc77c 09:03:16\"}", VO.class);

        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66177);assertEquals(2016, vo.date.getYear());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66178);assertEquals(5, vo.date.getMonthValue());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66179);assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_1_101f0p1f0pluszwbw3.R.flushNeeded();}}

    public void test_for_us() throws Exception {__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceStart(getClass().getName(),66180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104gadvc1f2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f0p1f0pluszwbw3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_us",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66180,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104gadvc1f2c() throws Exception{try{__CLR4_1_101f0p1f0pluszwbw3.R.inc(66180);
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66181);VO vo = JSON.parseObject("{\"date\":\"05/26/2016 09:03:16\"}", VO.class);

        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66182);assertEquals(2016, vo.date.getYear());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66183);assertEquals(5, vo.date.getMonthValue());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66184);assertEquals(26, vo.date.getDayOfMonth());
    }finally{__CLR4_1_101f0p1f0pluszwbw3.R.flushNeeded();}}

    public void test_for_eur() throws Exception {__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceStart(getClass().getName(),66185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106qj5ru1f2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f0p1f0pluszwbw3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_eur",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66185,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106qj5ru1f2h() throws Exception{try{__CLR4_1_101f0p1f0pluszwbw3.R.inc(66185);
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66186);VO vo = JSON.parseObject("{\"date\":\"26/05/2016 09:03:16\"}", VO.class);

        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66187);assertEquals(2016, vo.date.getYear());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66188);assertEquals(5, vo.date.getMonthValue());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66189);assertEquals(26, vo.date.getDayOfMonth());
    }finally{__CLR4_1_101f0p1f0pluszwbw3.R.flushNeeded();}}

    public void test_for_us_1() throws Exception {__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceStart(getClass().getName(),66190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10crooli1f2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f0p1f0pluszwbw3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_us_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66190,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10crooli1f2m() throws Exception{try{__CLR4_1_101f0p1f0pluszwbw3.R.inc(66190);
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66191);Locale.setDefault(Locale.US);
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66192);VO vo = JSON.parseObject("{\"date\":\"05/06/2016 09:03:16\"}", VO.class);

        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66193);assertEquals(2016, vo.date.getYear());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66194);assertEquals(5, vo.date.getMonthValue());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66195);assertEquals(06, vo.date.getDayOfMonth());
    }finally{__CLR4_1_101f0p1f0pluszwbw3.R.flushNeeded();}}

    public void test_for_br() throws Exception {__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceStart(getClass().getName(),66196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1043p35y1f2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f0p1f0pluszwbw3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_br",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66196,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1043p35y1f2s() throws Exception{try{__CLR4_1_101f0p1f0pluszwbw3.R.inc(66196);
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66197);Locale.setDefault(new Locale("pt", "BR"));
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66198);VO vo = JSON.parseObject("{\"date\":\"06/05/2016 09:03:16\"}", VO.class);

        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66199);assertEquals(2016, vo.date.getYear());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66200);assertEquals(5, vo.date.getMonthValue());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66201);assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_1_101f0p1f0pluszwbw3.R.flushNeeded();}}

    public void test_for_au() throws Exception {__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceStart(getClass().getName(),66202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10o2k3c21f2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f0p1f0pluszwbw3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_au",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66202,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10o2k3c21f2y() throws Exception{try{__CLR4_1_101f0p1f0pluszwbw3.R.inc(66202);
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66203);Locale.setDefault(new Locale("en", "AU"));
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66204);VO vo = JSON.parseObject("{\"date\":\"06/05/2016 09:03:16\"}", VO.class);

        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66205);assertEquals(2016, vo.date.getYear());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66206);assertEquals(5, vo.date.getMonthValue());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66207);assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_1_101f0p1f0pluszwbw3.R.flushNeeded();}}

    public void test_for_de() throws Exception {__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceStart(getClass().getName(),66208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10d315mz1f34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f0p1f0pluszwbw3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_de",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66208,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10d315mz1f34() throws Exception{try{__CLR4_1_101f0p1f0pluszwbw3.R.inc(66208);
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66209);Locale.setDefault(new Locale("pt", "BR"));
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66210);VO vo = JSON.parseObject("{\"date\":\"06.05.2016 09:03:16\"}", VO.class);

        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66211);assertEquals(2016, vo.date.getYear());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66212);assertEquals(5, vo.date.getMonthValue());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66213);assertEquals(6, vo.date.getDayOfMonth());
        
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66214);assertEquals(9, vo.date.getHour());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66215);assertEquals(3, vo.date.getMinute());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66216);assertEquals(16, vo.date.getSecond());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66217);assertEquals(0, vo.date.getNano());
    }finally{__CLR4_1_101f0p1f0pluszwbw3.R.flushNeeded();}}
    
    public void test_for_in() throws Exception {__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceStart(getClass().getName(),66218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m60sgh1f3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f0p1f0pluszwbw3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f0p1f0pluszwbw3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_in",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66218,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m60sgh1f3e() throws Exception{try{__CLR4_1_101f0p1f0pluszwbw3.R.inc(66218);
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66219);VO vo = JSON.parseObject("{\"date\":\"06-05-2016 09:03:16\"}", VO.class);

        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66220);assertEquals(2016, vo.date.getYear());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66221);assertEquals(5, vo.date.getMonthValue());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66222);assertEquals(6, vo.date.getDayOfMonth());
        
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66223);assertEquals(9, vo.date.getHour());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66224);assertEquals(3, vo.date.getMinute());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66225);assertEquals(16, vo.date.getSecond());
        __CLR4_1_101f0p1f0pluszwbw3.R.inc(66226);assertEquals(0, vo.date.getNano());
    }finally{__CLR4_1_101f0p1f0pluszwbw3.R.flushNeeded();}}

    public static class VO {
        public LocalDateTime date;
    }
}
