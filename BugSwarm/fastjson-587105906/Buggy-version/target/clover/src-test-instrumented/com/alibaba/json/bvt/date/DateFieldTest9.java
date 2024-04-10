/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.date;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class DateFieldTest9 extends TestCase {static class __CLR4_1_1019sc19scluszwa9b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,59475,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected void setUp() throws Exception {try{__CLR4_1_1019sc19scluszwa9b.R.inc(59340);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59341);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_1_1019sc19scluszwa9b.R.inc(59342);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_1_1019sc19scluszwa9b.R.flushNeeded();}}

    public void test_tw() throws Exception {__CLR4_1_1019sc19scluszwa9b.R.globalSliceStart(getClass().getName(),59343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107t9y1j19sf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019sc19scluszwa9b.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019sc19scluszwa9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_tw",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),59343,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107t9y1j19sf() throws Exception{try{__CLR4_1_1019sc19scluszwa9b.R.inc(59343);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59344);Entity vo = JSON.parseObject("{\"date\":\"2016/05/06\"}", Entity.class);

        __CLR4_1_1019sc19scluszwa9b.R.inc(59345);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59346);calendar.setTime(vo.date);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59347);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59348);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59349);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59350);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59351);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59352);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59353);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1019sc19scluszwa9b.R.flushNeeded();}}
    
    public void test_cn() throws Exception {__CLR4_1_1019sc19scluszwa9b.R.globalSliceStart(getClass().getName(),59354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tfiqgx19sq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019sc19scluszwa9b.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019sc19scluszwa9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_cn",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),59354,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tfiqgx19sq() throws Exception{try{__CLR4_1_1019sc19scluszwa9b.R.inc(59354);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59355);Entity vo = JSON.parseObject("{\"date\":\"2016-05-06\"}", Entity.class);

        __CLR4_1_1019sc19scluszwa9b.R.inc(59356);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59357);calendar.setTime(vo.date);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59358);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59359);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59360);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59361);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59362);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59363);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59364);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1019sc19scluszwa9b.R.flushNeeded();}}
    
    public void test_cn_1() throws Exception {__CLR4_1_1019sc19scluszwa9b.R.globalSliceStart(getClass().getName(),59365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108tih3j19t1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019sc19scluszwa9b.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019sc19scluszwa9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_cn_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),59365,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108tih3j19t1() throws Exception{try{__CLR4_1_1019sc19scluszwa9b.R.inc(59365);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59366);Entity vo = JSON.parseObject("{\"date\":\"2016\u5e745\u67086\u65e5\"}", Entity.class);

        __CLR4_1_1019sc19scluszwa9b.R.inc(59367);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59368);calendar.setTime(vo.date);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59369);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59370);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59371);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59372);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59373);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59374);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59375);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1019sc19scluszwa9b.R.flushNeeded();}}
    
    public void test_cn_2() throws Exception {__CLR4_1_1019sc19scluszwa9b.R.globalSliceStart(getClass().getName(),59376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105kiib219tc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019sc19scluszwa9b.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019sc19scluszwa9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_cn_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),59376,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105kiib219tc() throws Exception{try{__CLR4_1_1019sc19scluszwa9b.R.inc(59376);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59377);Entity vo = JSON.parseObject("{\"date\":\"2016\u5e745\u670806\u65e5\"}", Entity.class);

        __CLR4_1_1019sc19scluszwa9b.R.inc(59378);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59379);calendar.setTime(vo.date);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59380);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59381);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59382);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59383);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59384);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59385);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59386);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1019sc19scluszwa9b.R.flushNeeded();}}
    
    public void test_cn_3() throws Exception {__CLR4_1_1019sc19scluszwa9b.R.globalSliceStart(getClass().getName(),59387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102bijil19tn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019sc19scluszwa9b.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019sc19scluszwa9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_cn_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),59387,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102bijil19tn() throws Exception{try{__CLR4_1_1019sc19scluszwa9b.R.inc(59387);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59388);Entity vo = JSON.parseObject("{\"date\":\"2016\u5e7405\u67086\u65e5\"}", Entity.class);

        __CLR4_1_1019sc19scluszwa9b.R.inc(59389);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59390);calendar.setTime(vo.date);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59391);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59392);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59393);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59394);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59395);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59396);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59397);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1019sc19scluszwa9b.R.flushNeeded();}}
    
    public void test_cn_4() throws Exception {__CLR4_1_1019sc19scluszwa9b.R.globalSliceStart(getClass().getName(),59398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xhf9w19ty();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019sc19scluszwa9b.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019sc19scluszwa9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_cn_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),59398,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xhf9w19ty() throws Exception{try{__CLR4_1_1019sc19scluszwa9b.R.inc(59398);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59399);Entity vo = JSON.parseObject("{\"date\":\"2016\u5e7405\u670806\u65e5\"}", Entity.class);

        __CLR4_1_1019sc19scluszwa9b.R.inc(59400);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59401);calendar.setTime(vo.date);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59402);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59403);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59404);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59405);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59406);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59407);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59408);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1019sc19scluszwa9b.R.flushNeeded();}}
    
    public void test_kr_1() throws Exception {__CLR4_1_1019sc19scluszwa9b.R.globalSliceStart(getClass().getName(),59409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lgjx4d19u9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019sc19scluszwa9b.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019sc19scluszwa9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_kr_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),59409,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lgjx4d19u9() throws Exception{try{__CLR4_1_1019sc19scluszwa9b.R.inc(59409);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59410);Entity vo = JSON.parseObject("{\"date\":\"2016\ub1445\uc6d46\uc77c\"}", Entity.class);

        __CLR4_1_1019sc19scluszwa9b.R.inc(59411);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59412);calendar.setTime(vo.date);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59413);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59414);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59415);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59416);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59417);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59418);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59419);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1019sc19scluszwa9b.R.flushNeeded();}}
    
    public void test_kr_2() throws Exception {__CLR4_1_1019sc19scluszwa9b.R.globalSliceStart(getClass().getName(),59420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10opjvwu19uk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019sc19scluszwa9b.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019sc19scluszwa9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_kr_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),59420,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10opjvwu19uk() throws Exception{try{__CLR4_1_1019sc19scluszwa9b.R.inc(59420);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59421);Entity vo = JSON.parseObject("{\"date\":\"2016\ub1445\uc6d406\uc77c\"}", Entity.class);

        __CLR4_1_1019sc19scluszwa9b.R.inc(59422);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59423);calendar.setTime(vo.date);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59424);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59425);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59426);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59427);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59428);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59429);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59430);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1019sc19scluszwa9b.R.flushNeeded();}}
    
    public void test_kr_3() throws Exception {__CLR4_1_1019sc19scluszwa9b.R.globalSliceStart(getClass().getName(),59431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ryjupb19uv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019sc19scluszwa9b.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019sc19scluszwa9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_kr_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),59431,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ryjupb19uv() throws Exception{try{__CLR4_1_1019sc19scluszwa9b.R.inc(59431);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59432);Entity vo = JSON.parseObject("{\"date\":\"2016\ub14405\uc6d46\uc77c\"}", Entity.class);

        __CLR4_1_1019sc19scluszwa9b.R.inc(59433);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59434);calendar.setTime(vo.date);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59435);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59436);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59437);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59438);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59439);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59440);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59441);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1019sc19scluszwa9b.R.flushNeeded();}}
    
    public void test_kr_4() throws Exception {__CLR4_1_1019sc19scluszwa9b.R.globalSliceStart(getClass().getName(),59442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v7jths19v6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019sc19scluszwa9b.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019sc19scluszwa9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_kr_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),59442,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v7jths19v6() throws Exception{try{__CLR4_1_1019sc19scluszwa9b.R.inc(59442);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59443);Entity vo = JSON.parseObject("{\"date\":\"2016\ub14405\uc6d406\uc77c\"}", Entity.class);

        __CLR4_1_1019sc19scluszwa9b.R.inc(59444);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59445);calendar.setTime(vo.date);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59446);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59447);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59448);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59449);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59450);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59451);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59452);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1019sc19scluszwa9b.R.flushNeeded();}}
    
    public void test_de() throws Exception {__CLR4_1_1019sc19scluszwa9b.R.globalSliceStart(getClass().getName(),59453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10synj1n19vh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019sc19scluszwa9b.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019sc19scluszwa9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_de",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),59453,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10synj1n19vh() throws Exception{try{__CLR4_1_1019sc19scluszwa9b.R.inc(59453);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59454);Entity vo = JSON.parseObject("{\"date\":\"06.05.2016\"}", Entity.class);

        __CLR4_1_1019sc19scluszwa9b.R.inc(59455);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59456);calendar.setTime(vo.date);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59457);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59458);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59459);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59460);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59461);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59462);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59463);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1019sc19scluszwa9b.R.flushNeeded();}}
    
    public void test_in() throws Exception {__CLR4_1_1019sc19scluszwa9b.R.globalSliceStart(getClass().getName(),59464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106teku119vs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019sc19scluszwa9b.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019sc19scluszwa9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_in",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),59464,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106teku119vs() throws Exception{try{__CLR4_1_1019sc19scluszwa9b.R.inc(59464);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59465);Entity vo = JSON.parseObject("{\"date\":\"06-05-2016\"}", Entity.class);

        __CLR4_1_1019sc19scluszwa9b.R.inc(59466);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59467);calendar.setTime(vo.date);
        __CLR4_1_1019sc19scluszwa9b.R.inc(59468);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59469);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59470);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59471);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59472);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59473);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1019sc19scluszwa9b.R.inc(59474);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1019sc19scluszwa9b.R.flushNeeded();}}

    public static class Entity {

        public Date date;
    }
}
