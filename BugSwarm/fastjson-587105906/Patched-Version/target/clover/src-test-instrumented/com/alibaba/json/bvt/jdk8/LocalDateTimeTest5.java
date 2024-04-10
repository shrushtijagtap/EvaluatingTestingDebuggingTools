/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.jdk8;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class LocalDateTimeTest5 extends TestCase {static class __CLR4_5_21e261e26lusyjt9l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,64984,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static Random random = new Random();

    private Locale origin;
    private TimeZone original = TimeZone.getDefault();
    private String[] zoneIds = TimeZone.getAvailableIDs();

    @Override
    protected void setUp() throws Exception {try{__CLR4_5_21e261e26lusyjt9l.R.inc(64878);
        __CLR4_5_21e261e26lusyjt9l.R.inc(64879);int index = random.nextInt(zoneIds.length);
        __CLR4_5_21e261e26lusyjt9l.R.inc(64880);TimeZone timeZone = TimeZone.getTimeZone(zoneIds[index]);
        __CLR4_5_21e261e26lusyjt9l.R.inc(64881);TimeZone.setDefault(timeZone);
        __CLR4_5_21e261e26lusyjt9l.R.inc(64882);JSON.defaultTimeZone = timeZone; // While running mvn tests defaultTimeZone might already be initialized
        __CLR4_5_21e261e26lusyjt9l.R.inc(64883);origin = Locale.getDefault();
    }finally{__CLR4_5_21e261e26lusyjt9l.R.flushNeeded();}}

    @Override
    protected void tearDown() throws Exception {try{__CLR4_5_21e261e26lusyjt9l.R.inc(64884);
        __CLR4_5_21e261e26lusyjt9l.R.inc(64885);TimeZone.setDefault(original);
        __CLR4_5_21e261e26lusyjt9l.R.inc(64886);JSON.defaultTimeZone = original;
        __CLR4_5_21e261e26lusyjt9l.R.inc(64887);Locale.setDefault(origin);
    }finally{__CLR4_5_21e261e26lusyjt9l.R.flushNeeded();}}

    public void test_for_long() throws Exception {__CLR4_5_21e261e26lusyjt9l.R.globalSliceStart(getClass().getName(),64888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_254hl0m1e2g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e261e26lusyjt9l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e261e26lusyjt9l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64888,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_254hl0m1e2g() throws Exception{try{__CLR4_5_21e261e26lusyjt9l.R.inc(64888);
        __CLR4_5_21e261e26lusyjt9l.R.inc(64889);long millis = 1322874196000L;
        // using localDataTime instance so that different timeZones are tested
        __CLR4_5_21e261e26lusyjt9l.R.inc(64890);LocalDateTime localDateTime = LocalDateTime.ofInstant(
                Instant.ofEpochMilli(millis), TimeZone.getDefault().toZoneId());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64891);VO vo = JSON.parseObject("{\"date\":" + millis + "}", VO.class);

        __CLR4_5_21e261e26lusyjt9l.R.inc(64892);assertEquals("Not Matching year", localDateTime.getYear(), vo.date.getYear());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64893);assertEquals("Not Matching month", localDateTime.getMonthValue(), vo.date.getMonthValue());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64894);assertEquals("Not Matching day", localDateTime.getDayOfMonth(), vo.date.getDayOfMonth());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64895);assertEquals("Not Matching hour", localDateTime.getHour(), vo.date.getHour());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64896);assertEquals("Not Matching minute", localDateTime.getMinute(), vo.date.getMinute());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64897);assertEquals("Not Matching second", localDateTime.getSecond(), vo.date.getSecond());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64898);assertEquals("Not Matching nano", localDateTime.getNano(), vo.date.getNano());
    }finally{__CLR4_5_21e261e26lusyjt9l.R.flushNeeded();}}
    
    public void test_for_normal() throws Exception {__CLR4_5_21e261e26lusyjt9l.R.globalSliceStart(getClass().getName(),64899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mp8hyp1e2r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e261e26lusyjt9l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e261e26lusyjt9l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_normal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64899,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mp8hyp1e2r() throws Exception{try{__CLR4_5_21e261e26lusyjt9l.R.inc(64899);
        __CLR4_5_21e261e26lusyjt9l.R.inc(64900);VO vo = JSON.parseObject("{\"date\":\"2011-12-03 09:03:16\"}", VO.class);
        
        __CLR4_5_21e261e26lusyjt9l.R.inc(64901);assertEquals(2011, vo.date.getYear());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64902);assertEquals(12, vo.date.getMonthValue());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64903);assertEquals(3, vo.date.getDayOfMonth());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64904);assertEquals(9, vo.date.getHour());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64905);assertEquals(3, vo.date.getMinute());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64906);assertEquals(16, vo.date.getSecond());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64907);assertEquals(0, vo.date.getNano());
    }finally{__CLR4_5_21e261e26lusyjt9l.R.flushNeeded();}}
    
    public void test_for_iso() throws Exception {__CLR4_5_21e261e26lusyjt9l.R.globalSliceStart(getClass().getName(),64908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dfjkpj1e30();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e261e26lusyjt9l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e261e26lusyjt9l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_iso",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64908,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dfjkpj1e30() throws Exception{try{__CLR4_5_21e261e26lusyjt9l.R.inc(64908);
        __CLR4_5_21e261e26lusyjt9l.R.inc(64909);VO vo = JSON.parseObject("{\"date\":\"2011-12-03T09:03:16\"}", VO.class);
        
        __CLR4_5_21e261e26lusyjt9l.R.inc(64910);assertEquals(2011, vo.date.getYear());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64911);assertEquals(12, vo.date.getMonthValue());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64912);assertEquals(3, vo.date.getDayOfMonth());
        
        __CLR4_5_21e261e26lusyjt9l.R.inc(64913);assertEquals(9, vo.date.getHour());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64914);assertEquals(3, vo.date.getMinute());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64915);assertEquals(16, vo.date.getSecond());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64916);assertEquals(0, vo.date.getNano());
    }finally{__CLR4_5_21e261e26lusyjt9l.R.flushNeeded();}}
    
    public void test_for_tw() throws Exception {__CLR4_5_21e261e26lusyjt9l.R.globalSliceStart(getClass().getName(),64917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l65f8z1e39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e261e26lusyjt9l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e261e26lusyjt9l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_tw",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64917,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l65f8z1e39() throws Exception{try{__CLR4_5_21e261e26lusyjt9l.R.inc(64917);
        __CLR4_5_21e261e26lusyjt9l.R.inc(64918);VO vo = JSON.parseObject("{\"date\":\"2016/05/06 09:03:16\"}", VO.class);

        __CLR4_5_21e261e26lusyjt9l.R.inc(64919);assertEquals(2016, vo.date.getYear());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64920);assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64921);assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21e261e26lusyjt9l.R.flushNeeded();}}

    public void test_for_jp() throws Exception {__CLR4_5_21e261e26lusyjt9l.R.globalSliceStart(getClass().getName(),64922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e1u1o01e3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e261e26lusyjt9l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e261e26lusyjt9l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_jp",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64922,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e1u1o01e3e() throws Exception{try{__CLR4_5_21e261e26lusyjt9l.R.inc(64922);
        __CLR4_5_21e261e26lusyjt9l.R.inc(64923);VO vo = JSON.parseObject("{\"date\":\"2016\u5e745\u67086\u65e5 09:03:16\"}", VO.class);

        __CLR4_5_21e261e26lusyjt9l.R.inc(64924);assertEquals(2016, vo.date.getYear());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64925);assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64926);assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21e261e26lusyjt9l.R.flushNeeded();}}
    
    public void test_for_cn() throws Exception {__CLR4_5_21e261e26lusyjt9l.R.globalSliceStart(getClass().getName(),64927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cm5y7p1e3j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e261e26lusyjt9l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e261e26lusyjt9l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_cn",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64927,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cm5y7p1e3j() throws Exception{try{__CLR4_5_21e261e26lusyjt9l.R.inc(64927);
        __CLR4_5_21e261e26lusyjt9l.R.inc(64928);VO vo = JSON.parseObject("{\"date\":\"2016\u5e745\u67086\u65e5 9\u65f63\u520616\u79d2\"}", VO.class);

        __CLR4_5_21e261e26lusyjt9l.R.inc(64929);assertEquals(2016, vo.date.getYear());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64930);assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64931);assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21e261e26lusyjt9l.R.flushNeeded();}}

    public void test_for_kr() throws Exception {__CLR4_5_21e261e26lusyjt9l.R.globalSliceStart(getClass().getName(),64932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2krf66n1e3o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e261e26lusyjt9l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e261e26lusyjt9l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_kr",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64932,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2krf66n1e3o() throws Exception{try{__CLR4_5_21e261e26lusyjt9l.R.inc(64932);
        __CLR4_5_21e261e26lusyjt9l.R.inc(64933);VO vo = JSON.parseObject("{\"date\":\"2016\ub1445\uc6d46\uc77c 09:03:16\"}", VO.class);

        __CLR4_5_21e261e26lusyjt9l.R.inc(64934);assertEquals(2016, vo.date.getYear());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64935);assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64936);assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21e261e26lusyjt9l.R.flushNeeded();}}

    public void test_for_us() throws Exception {__CLR4_5_21e261e26lusyjt9l.R.globalSliceStart(getClass().getName(),64937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24gadvc1e3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e261e26lusyjt9l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e261e26lusyjt9l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_us",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64937,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24gadvc1e3t() throws Exception{try{__CLR4_5_21e261e26lusyjt9l.R.inc(64937);
        __CLR4_5_21e261e26lusyjt9l.R.inc(64938);VO vo = JSON.parseObject("{\"date\":\"05/26/2016 09:03:16\"}", VO.class);

        __CLR4_5_21e261e26lusyjt9l.R.inc(64939);assertEquals(2016, vo.date.getYear());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64940);assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64941);assertEquals(26, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21e261e26lusyjt9l.R.flushNeeded();}}

    public void test_for_eur() throws Exception {__CLR4_5_21e261e26lusyjt9l.R.globalSliceStart(getClass().getName(),64942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26qj5ru1e3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e261e26lusyjt9l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e261e26lusyjt9l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_eur",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64942,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26qj5ru1e3y() throws Exception{try{__CLR4_5_21e261e26lusyjt9l.R.inc(64942);
        __CLR4_5_21e261e26lusyjt9l.R.inc(64943);VO vo = JSON.parseObject("{\"date\":\"26/05/2016 09:03:16\"}", VO.class);

        __CLR4_5_21e261e26lusyjt9l.R.inc(64944);assertEquals(2016, vo.date.getYear());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64945);assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64946);assertEquals(26, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21e261e26lusyjt9l.R.flushNeeded();}}

    public void test_for_us_1() throws Exception {__CLR4_5_21e261e26lusyjt9l.R.globalSliceStart(getClass().getName(),64947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2crooli1e43();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e261e26lusyjt9l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e261e26lusyjt9l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_us_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64947,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2crooli1e43() throws Exception{try{__CLR4_5_21e261e26lusyjt9l.R.inc(64947);
        __CLR4_5_21e261e26lusyjt9l.R.inc(64948);Locale.setDefault(Locale.US);
        __CLR4_5_21e261e26lusyjt9l.R.inc(64949);VO vo = JSON.parseObject("{\"date\":\"05/06/2016 09:03:16\"}", VO.class);

        __CLR4_5_21e261e26lusyjt9l.R.inc(64950);assertEquals(2016, vo.date.getYear());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64951);assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64952);assertEquals(06, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21e261e26lusyjt9l.R.flushNeeded();}}

    public void test_for_br() throws Exception {__CLR4_5_21e261e26lusyjt9l.R.globalSliceStart(getClass().getName(),64953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_243p35y1e49();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e261e26lusyjt9l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e261e26lusyjt9l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_br",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64953,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_243p35y1e49() throws Exception{try{__CLR4_5_21e261e26lusyjt9l.R.inc(64953);
        __CLR4_5_21e261e26lusyjt9l.R.inc(64954);Locale.setDefault(new Locale("pt", "BR"));
        __CLR4_5_21e261e26lusyjt9l.R.inc(64955);VO vo = JSON.parseObject("{\"date\":\"06/05/2016 09:03:16\"}", VO.class);

        __CLR4_5_21e261e26lusyjt9l.R.inc(64956);assertEquals(2016, vo.date.getYear());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64957);assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64958);assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21e261e26lusyjt9l.R.flushNeeded();}}

    public void test_for_au() throws Exception {__CLR4_5_21e261e26lusyjt9l.R.globalSliceStart(getClass().getName(),64959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o2k3c21e4f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e261e26lusyjt9l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e261e26lusyjt9l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_au",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64959,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o2k3c21e4f() throws Exception{try{__CLR4_5_21e261e26lusyjt9l.R.inc(64959);
        __CLR4_5_21e261e26lusyjt9l.R.inc(64960);Locale.setDefault(new Locale("en", "AU"));
        __CLR4_5_21e261e26lusyjt9l.R.inc(64961);VO vo = JSON.parseObject("{\"date\":\"06/05/2016 09:03:16\"}", VO.class);

        __CLR4_5_21e261e26lusyjt9l.R.inc(64962);assertEquals(2016, vo.date.getYear());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64963);assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64964);assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21e261e26lusyjt9l.R.flushNeeded();}}

    public void test_for_de() throws Exception {__CLR4_5_21e261e26lusyjt9l.R.globalSliceStart(getClass().getName(),64965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d315mz1e4l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e261e26lusyjt9l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e261e26lusyjt9l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_de",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64965,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d315mz1e4l() throws Exception{try{__CLR4_5_21e261e26lusyjt9l.R.inc(64965);
        __CLR4_5_21e261e26lusyjt9l.R.inc(64966);Locale.setDefault(new Locale("pt", "BR"));
        __CLR4_5_21e261e26lusyjt9l.R.inc(64967);VO vo = JSON.parseObject("{\"date\":\"06.05.2016 09:03:16\"}", VO.class);

        __CLR4_5_21e261e26lusyjt9l.R.inc(64968);assertEquals(2016, vo.date.getYear());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64969);assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64970);assertEquals(6, vo.date.getDayOfMonth());
        
        __CLR4_5_21e261e26lusyjt9l.R.inc(64971);assertEquals(9, vo.date.getHour());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64972);assertEquals(3, vo.date.getMinute());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64973);assertEquals(16, vo.date.getSecond());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64974);assertEquals(0, vo.date.getNano());
    }finally{__CLR4_5_21e261e26lusyjt9l.R.flushNeeded();}}
    
    public void test_for_in() throws Exception {__CLR4_5_21e261e26lusyjt9l.R.globalSliceStart(getClass().getName(),64975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m60sgh1e4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e261e26lusyjt9l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e261e26lusyjt9l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest5.test_for_in",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64975,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m60sgh1e4v() throws Exception{try{__CLR4_5_21e261e26lusyjt9l.R.inc(64975);
        __CLR4_5_21e261e26lusyjt9l.R.inc(64976);VO vo = JSON.parseObject("{\"date\":\"06-05-2016 09:03:16\"}", VO.class);

        __CLR4_5_21e261e26lusyjt9l.R.inc(64977);assertEquals(2016, vo.date.getYear());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64978);assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64979);assertEquals(6, vo.date.getDayOfMonth());
        
        __CLR4_5_21e261e26lusyjt9l.R.inc(64980);assertEquals(9, vo.date.getHour());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64981);assertEquals(3, vo.date.getMinute());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64982);assertEquals(16, vo.date.getSecond());
        __CLR4_5_21e261e26lusyjt9l.R.inc(64983);assertEquals(0, vo.date.getNano());
    }finally{__CLR4_5_21e261e26lusyjt9l.R.flushNeeded();}}

    public static class VO {
        public LocalDateTime date;
    }
}
