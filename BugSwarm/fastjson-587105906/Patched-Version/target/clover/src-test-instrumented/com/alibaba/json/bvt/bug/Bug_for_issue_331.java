/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class Bug_for_issue_331 extends TestCase {static class __CLR4_5_2158x158xlusvn6dk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,53485,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_2158x158xlusvn6dk.R.inc(53457);
        __CLR4_5_2158x158xlusvn6dk.R.inc(53458);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_2158x158xlusvn6dk.R.inc(53459);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_5_2158x158xlusvn6dk.R.flushNeeded();}}
    
    public void test_for_issue() throws Exception {__CLR4_5_2158x158xlusvn6dk.R.globalSliceStart(getClass().getName(),53460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1590();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2158x158xlusvn6dk.R.rethrow($CLV_t2$);}finally{__CLR4_5_2158x158xlusvn6dk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_331.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53460,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1590() throws Exception{try{__CLR4_5_2158x158xlusvn6dk.R.inc(53460);
        
        __CLR4_5_2158x158xlusvn6dk.R.inc(53461);SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", JSON.defaultLocale);
        __CLR4_5_2158x158xlusvn6dk.R.inc(53462);format.setTimeZone(JSON.defaultTimeZone);
        __CLR4_5_2158x158xlusvn6dk.R.inc(53463);Date date = format.parse("2015-05-23");

        __CLR4_5_2158x158xlusvn6dk.R.inc(53464);Calendar c = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_5_2158x158xlusvn6dk.R.inc(53465);c.setTime(date);

        __CLR4_5_2158x158xlusvn6dk.R.inc(53466);Model original = new Model();
        __CLR4_5_2158x158xlusvn6dk.R.inc(53467);original.setDate(date);
        __CLR4_5_2158x158xlusvn6dk.R.inc(53468);original.setCalendar(c);
        
        __CLR4_5_2158x158xlusvn6dk.R.inc(53469);String json = JSON.toJSONString(original, SerializerFeature.UseISO8601DateFormat);

        __CLR4_5_2158x158xlusvn6dk.R.inc(53470);System.out.println(json); //V1.2.4 \u8f93\u51fa{"calendar":"2015-05-23","date":"2015-05-23"} , V1.2.6 \u8f93\u51fa{"calendar":"2015-05-23+08:00","date":"2015-05-23+08:00"}

        __CLR4_5_2158x158xlusvn6dk.R.inc(53471);Model actual = JSON.parseObject(json, Model.class);

        __CLR4_5_2158x158xlusvn6dk.R.inc(53472);Assert.assertNotNull(actual);
        __CLR4_5_2158x158xlusvn6dk.R.inc(53473);Assert.assertNotNull(actual.getDate());
        __CLR4_5_2158x158xlusvn6dk.R.inc(53474);Assert.assertNotNull(actual.getCalendar());

        __CLR4_5_2158x158xlusvn6dk.R.inc(53475);Assert.assertEquals("\u4e0e\u5e8f\u5217\u5316\u524d\u6bd4\u8f83\u4e0d\u76f8\u7b49", original.getDate(), actual.getDate());

        __CLR4_5_2158x158xlusvn6dk.R.inc(53476);Assert.assertEquals("\u5e8f\u5217\u5316\u540e\u7684Date \u548c Calendar \u4e0d\u76f8\u7b49", actual.getDate(), actual.getCalendar().getTime());
    }finally{__CLR4_5_2158x158xlusvn6dk.R.flushNeeded();}}
    
    public static class Model {
        private Date date;
        private Calendar calendar;
        
        public Date getDate() {try{__CLR4_5_2158x158xlusvn6dk.R.inc(53477);
            __CLR4_5_2158x158xlusvn6dk.R.inc(53478);return date;
        }finally{__CLR4_5_2158x158xlusvn6dk.R.flushNeeded();}}
        
        public void setDate(Date date) {try{__CLR4_5_2158x158xlusvn6dk.R.inc(53479);
            __CLR4_5_2158x158xlusvn6dk.R.inc(53480);this.date = date;
        }finally{__CLR4_5_2158x158xlusvn6dk.R.flushNeeded();}}
        
        public Calendar getCalendar() {try{__CLR4_5_2158x158xlusvn6dk.R.inc(53481);
            __CLR4_5_2158x158xlusvn6dk.R.inc(53482);return calendar;
        }finally{__CLR4_5_2158x158xlusvn6dk.R.flushNeeded();}}
        
        public void setCalendar(Calendar calendar) {try{__CLR4_5_2158x158xlusvn6dk.R.inc(53483);
            __CLR4_5_2158x158xlusvn6dk.R.inc(53484);this.calendar = calendar;
        }finally{__CLR4_5_2158x158xlusvn6dk.R.flushNeeded();}}
        
        
    }
}
