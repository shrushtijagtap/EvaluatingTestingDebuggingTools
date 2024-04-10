/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.date;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;


public class DateParseTest5 extends TestCase {static class __CLR4_1_101n7e1n7eluszwdps{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,76745,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_101n7e1n7eluszwdps.R.inc(76730);
        __CLR4_1_101n7e1n7eluszwdps.R.inc(76731);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_1_101n7e1n7eluszwdps.R.inc(76732);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_1_101n7e1n7eluszwdps.R.flushNeeded();}}
    
    public void test_date() throws Exception {__CLR4_1_101n7e1n7eluszwdps.R.globalSliceStart(getClass().getName(),76733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zi49um1n7h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n7e1n7eluszwdps.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n7e1n7eluszwdps.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest5.test_date",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76733,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zi49um1n7h() throws Exception{try{__CLR4_1_101n7e1n7eluszwdps.R.inc(76733);
        __CLR4_1_101n7e1n7eluszwdps.R.inc(76734);String text = "\"1979-07-14T13:07:23.456\"";
        __CLR4_1_101n7e1n7eluszwdps.R.inc(76735);Date date = JSON.parseObject(text, Date.class);
        __CLR4_1_101n7e1n7eluszwdps.R.inc(76736);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_101n7e1n7eluszwdps.R.inc(76737);calendar.setTime(date);
        
        __CLR4_1_101n7e1n7eluszwdps.R.inc(76738);Assert.assertEquals(1979, calendar.get(Calendar.YEAR));
        __CLR4_1_101n7e1n7eluszwdps.R.inc(76739);Assert.assertEquals(6, calendar.get(Calendar.MONTH));
        __CLR4_1_101n7e1n7eluszwdps.R.inc(76740);Assert.assertEquals(14, calendar.get(Calendar.DAY_OF_MONTH));
        
        __CLR4_1_101n7e1n7eluszwdps.R.inc(76741);Assert.assertEquals(13, calendar.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_101n7e1n7eluszwdps.R.inc(76742);Assert.assertEquals(7, calendar.get(Calendar.MINUTE));
        __CLR4_1_101n7e1n7eluszwdps.R.inc(76743);Assert.assertEquals(23, calendar.get(Calendar.SECOND));
        __CLR4_1_101n7e1n7eluszwdps.R.inc(76744);Assert.assertEquals(456, calendar.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_101n7e1n7eluszwdps.R.flushNeeded();}}
}
