/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.date;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class DateFieldTest9 extends TestCase {static class __CLR4_1_1018u418u4lusqk85w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,58243,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected void setUp() throws Exception {try{__CLR4_1_1018u418u4lusqk85w.R.inc(58108);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58109);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_1_1018u418u4lusqk85w.R.inc(58110);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_1_1018u418u4lusqk85w.R.flushNeeded();}}

    public void test_tw() throws Exception {__CLR4_1_1018u418u4lusqk85w.R.globalSliceStart(getClass().getName(),58111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107t9y1j18u7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018u418u4lusqk85w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018u418u4lusqk85w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_tw",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58111,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107t9y1j18u7() throws Exception{try{__CLR4_1_1018u418u4lusqk85w.R.inc(58111);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58112);Entity vo = JSON.parseObject("{\"date\":\"2016/05/06\"}", Entity.class);

        __CLR4_1_1018u418u4lusqk85w.R.inc(58113);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58114);calendar.setTime(vo.date);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58115);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58116);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58117);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58118);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58119);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58120);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58121);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1018u418u4lusqk85w.R.flushNeeded();}}
    
    public void test_cn() throws Exception {__CLR4_1_1018u418u4lusqk85w.R.globalSliceStart(getClass().getName(),58122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tfiqgx18ui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018u418u4lusqk85w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018u418u4lusqk85w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_cn",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58122,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tfiqgx18ui() throws Exception{try{__CLR4_1_1018u418u4lusqk85w.R.inc(58122);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58123);Entity vo = JSON.parseObject("{\"date\":\"2016-05-06\"}", Entity.class);

        __CLR4_1_1018u418u4lusqk85w.R.inc(58124);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58125);calendar.setTime(vo.date);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58126);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58127);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58128);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58129);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58130);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58131);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58132);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1018u418u4lusqk85w.R.flushNeeded();}}
    
    public void test_cn_1() throws Exception {__CLR4_1_1018u418u4lusqk85w.R.globalSliceStart(getClass().getName(),58133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108tih3j18ut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018u418u4lusqk85w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018u418u4lusqk85w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_cn_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58133,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108tih3j18ut() throws Exception{try{__CLR4_1_1018u418u4lusqk85w.R.inc(58133);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58134);Entity vo = JSON.parseObject("{\"date\":\"2016\u5e745\u67086\u65e5\"}", Entity.class);

        __CLR4_1_1018u418u4lusqk85w.R.inc(58135);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58136);calendar.setTime(vo.date);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58137);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58138);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58139);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58140);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58141);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58142);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58143);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1018u418u4lusqk85w.R.flushNeeded();}}
    
    public void test_cn_2() throws Exception {__CLR4_1_1018u418u4lusqk85w.R.globalSliceStart(getClass().getName(),58144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105kiib218v4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018u418u4lusqk85w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018u418u4lusqk85w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_cn_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58144,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105kiib218v4() throws Exception{try{__CLR4_1_1018u418u4lusqk85w.R.inc(58144);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58145);Entity vo = JSON.parseObject("{\"date\":\"2016\u5e745\u670806\u65e5\"}", Entity.class);

        __CLR4_1_1018u418u4lusqk85w.R.inc(58146);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58147);calendar.setTime(vo.date);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58148);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58149);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58150);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58151);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58152);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58153);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58154);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1018u418u4lusqk85w.R.flushNeeded();}}
    
    public void test_cn_3() throws Exception {__CLR4_1_1018u418u4lusqk85w.R.globalSliceStart(getClass().getName(),58155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102bijil18vf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018u418u4lusqk85w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018u418u4lusqk85w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_cn_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58155,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102bijil18vf() throws Exception{try{__CLR4_1_1018u418u4lusqk85w.R.inc(58155);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58156);Entity vo = JSON.parseObject("{\"date\":\"2016\u5e7405\u67086\u65e5\"}", Entity.class);

        __CLR4_1_1018u418u4lusqk85w.R.inc(58157);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58158);calendar.setTime(vo.date);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58159);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58160);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58161);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58162);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58163);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58164);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58165);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1018u418u4lusqk85w.R.flushNeeded();}}
    
    public void test_cn_4() throws Exception {__CLR4_1_1018u418u4lusqk85w.R.globalSliceStart(getClass().getName(),58166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xhf9w18vq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018u418u4lusqk85w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018u418u4lusqk85w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_cn_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58166,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xhf9w18vq() throws Exception{try{__CLR4_1_1018u418u4lusqk85w.R.inc(58166);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58167);Entity vo = JSON.parseObject("{\"date\":\"2016\u5e7405\u670806\u65e5\"}", Entity.class);

        __CLR4_1_1018u418u4lusqk85w.R.inc(58168);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58169);calendar.setTime(vo.date);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58170);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58171);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58172);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58173);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58174);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58175);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58176);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1018u418u4lusqk85w.R.flushNeeded();}}
    
    public void test_kr_1() throws Exception {__CLR4_1_1018u418u4lusqk85w.R.globalSliceStart(getClass().getName(),58177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lgjx4d18w1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018u418u4lusqk85w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018u418u4lusqk85w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_kr_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58177,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lgjx4d18w1() throws Exception{try{__CLR4_1_1018u418u4lusqk85w.R.inc(58177);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58178);Entity vo = JSON.parseObject("{\"date\":\"2016\ub1445\uc6d46\uc77c\"}", Entity.class);

        __CLR4_1_1018u418u4lusqk85w.R.inc(58179);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58180);calendar.setTime(vo.date);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58181);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58182);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58183);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58184);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58185);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58186);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58187);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1018u418u4lusqk85w.R.flushNeeded();}}
    
    public void test_kr_2() throws Exception {__CLR4_1_1018u418u4lusqk85w.R.globalSliceStart(getClass().getName(),58188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10opjvwu18wc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018u418u4lusqk85w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018u418u4lusqk85w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_kr_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58188,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10opjvwu18wc() throws Exception{try{__CLR4_1_1018u418u4lusqk85w.R.inc(58188);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58189);Entity vo = JSON.parseObject("{\"date\":\"2016\ub1445\uc6d406\uc77c\"}", Entity.class);

        __CLR4_1_1018u418u4lusqk85w.R.inc(58190);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58191);calendar.setTime(vo.date);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58192);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58193);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58194);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58195);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58196);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58197);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58198);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1018u418u4lusqk85w.R.flushNeeded();}}
    
    public void test_kr_3() throws Exception {__CLR4_1_1018u418u4lusqk85w.R.globalSliceStart(getClass().getName(),58199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ryjupb18wn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018u418u4lusqk85w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018u418u4lusqk85w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_kr_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58199,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ryjupb18wn() throws Exception{try{__CLR4_1_1018u418u4lusqk85w.R.inc(58199);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58200);Entity vo = JSON.parseObject("{\"date\":\"2016\ub14405\uc6d46\uc77c\"}", Entity.class);

        __CLR4_1_1018u418u4lusqk85w.R.inc(58201);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58202);calendar.setTime(vo.date);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58203);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58204);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58205);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58206);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58207);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58208);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58209);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1018u418u4lusqk85w.R.flushNeeded();}}
    
    public void test_kr_4() throws Exception {__CLR4_1_1018u418u4lusqk85w.R.globalSliceStart(getClass().getName(),58210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v7jths18wy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018u418u4lusqk85w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018u418u4lusqk85w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_kr_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58210,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v7jths18wy() throws Exception{try{__CLR4_1_1018u418u4lusqk85w.R.inc(58210);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58211);Entity vo = JSON.parseObject("{\"date\":\"2016\ub14405\uc6d406\uc77c\"}", Entity.class);

        __CLR4_1_1018u418u4lusqk85w.R.inc(58212);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58213);calendar.setTime(vo.date);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58214);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58215);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58216);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58217);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58218);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58219);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58220);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1018u418u4lusqk85w.R.flushNeeded();}}
    
    public void test_de() throws Exception {__CLR4_1_1018u418u4lusqk85w.R.globalSliceStart(getClass().getName(),58221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10synj1n18x9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018u418u4lusqk85w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018u418u4lusqk85w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_de",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58221,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10synj1n18x9() throws Exception{try{__CLR4_1_1018u418u4lusqk85w.R.inc(58221);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58222);Entity vo = JSON.parseObject("{\"date\":\"06.05.2016\"}", Entity.class);

        __CLR4_1_1018u418u4lusqk85w.R.inc(58223);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58224);calendar.setTime(vo.date);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58225);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58226);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58227);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58228);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58229);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58230);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58231);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1018u418u4lusqk85w.R.flushNeeded();}}
    
    public void test_in() throws Exception {__CLR4_1_1018u418u4lusqk85w.R.globalSliceStart(getClass().getName(),58232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106teku118xk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018u418u4lusqk85w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018u418u4lusqk85w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest9.test_in",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58232,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106teku118xk() throws Exception{try{__CLR4_1_1018u418u4lusqk85w.R.inc(58232);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58233);Entity vo = JSON.parseObject("{\"date\":\"06-05-2016\"}", Entity.class);

        __CLR4_1_1018u418u4lusqk85w.R.inc(58234);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58235);calendar.setTime(vo.date);
        __CLR4_1_1018u418u4lusqk85w.R.inc(58236);Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58237);Assert.assertEquals(4, calendar.get(Calendar.MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58238);Assert.assertEquals(6, calendar.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58239);Assert.assertEquals(0, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58240);Assert.assertEquals(0, calendar.get(Calendar.MINUTE));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58241);Assert.assertEquals(0, calendar.get(Calendar.SECOND));
        __CLR4_1_1018u418u4lusqk85w.R.inc(58242);Assert.assertEquals(0, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_1018u418u4lusqk85w.R.flushNeeded();}}

    public static class Entity {

        public Date date;
    }
}
