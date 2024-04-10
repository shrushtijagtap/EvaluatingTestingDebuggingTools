/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1400;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.json.bvt.issue_1500.Issue1500;
import junit.framework.TestCase;
import org.junit.Assert;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.TimeZone;

public class Issue1493 extends TestCase {static class __CLR4_5_21amu1amulusyjsuy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,60467,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_21amu1amulusyjsuy.R.inc(60438);
        __CLR4_5_21amu1amulusyjsuy.R.inc(60439);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_21amu1amulusyjsuy.R.inc(60440);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_5_21amu1amulusyjsuy.R.flushNeeded();}}

    public void test_for_issue() throws Exception {__CLR4_5_21amu1amulusyjsuy.R.globalSliceStart(getClass().getName(),60441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1amx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21amu1amulusyjsuy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21amu1amulusyjsuy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1400.Issue1493.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),60441,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1amx() throws Exception{try{__CLR4_5_21amu1amulusyjsuy.R.inc(60441);

        __CLR4_5_21amu1amulusyjsuy.R.inc(60442);TestBean test = new TestBean();
        __CLR4_5_21amu1amulusyjsuy.R.inc(60443);String stime2 = "2017-09-22T15:08:56";

        __CLR4_5_21amu1amulusyjsuy.R.inc(60444);LocalDateTime time1 = LocalDateTime.now();
        __CLR4_5_21amu1amulusyjsuy.R.inc(60445);time1 = time1.minusNanos(10L);
        __CLR4_5_21amu1amulusyjsuy.R.inc(60446);System.out.println(time1.getNano());
        __CLR4_5_21amu1amulusyjsuy.R.inc(60447);LocalDateTime time2 = LocalDateTime.parse(stime2);
        __CLR4_5_21amu1amulusyjsuy.R.inc(60448);test.setTime1(time1);
        __CLR4_5_21amu1amulusyjsuy.R.inc(60449);test.setTime2(time2);
        __CLR4_5_21amu1amulusyjsuy.R.inc(60450);String t1 = JSON.toJSONString(time1, SerializerFeature.WriteDateUseDateFormat);

        __CLR4_5_21amu1amulusyjsuy.R.inc(60451);String json = JSON.toJSONString(test, SerializerFeature.WriteDateUseDateFormat);
        __CLR4_5_21amu1amulusyjsuy.R.inc(60452);Assert.assertEquals("{\"time1\":"+t1+",\"time2\":\""+stime2+"\"}",json);


        //String default_format = JSON.DEFFAULT_LOCAL_DATE_TIME_FORMAT;
        //JSON.DEFFAULT_LOCAL_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
        //String stime1 = DateTimeFormatter.ofPattern(JSON.DEFFAULT_LOCAL_DATE_TIME_FORMAT, Locale.CHINA).format(time1);

        __CLR4_5_21amu1amulusyjsuy.R.inc(60453);json = JSON.toJSONString(test, SerializerFeature.WriteDateUseDateFormat);
        __CLR4_5_21amu1amulusyjsuy.R.inc(60454);Assert.assertEquals("{\"time1\":"+ JSON.toJSONString(time1, SerializerFeature.WriteDateUseDateFormat) +",\"time2\":\""+stime2+"\"}",json);


        __CLR4_5_21amu1amulusyjsuy.R.inc(60455);String pattern = "yyyy-MM-dd'T'HH:mm:ss";
        __CLR4_5_21amu1amulusyjsuy.R.inc(60456);String stime1 = DateTimeFormatter.ofPattern(pattern, Locale.CHINA).format(time1);

        __CLR4_5_21amu1amulusyjsuy.R.inc(60457);json = JSON.toJSONStringWithDateFormat(test, "yyyy-MM-dd'T'HH:mm:ss", SerializerFeature.WriteDateUseDateFormat);
        __CLR4_5_21amu1amulusyjsuy.R.inc(60458);Assert.assertEquals("{\"time1\":\""+stime1+"\",\"time2\":\""+stime2+"\"}",json);

        //JSON.DEFFAULT_LOCAL_DATE_TIME_FORMAT = default_format;
    }finally{__CLR4_5_21amu1amulusyjsuy.R.flushNeeded();}}

    public static class TestBean {
        LocalDateTime time1;
        LocalDateTime time2;

        public LocalDateTime getTime1() {try{__CLR4_5_21amu1amulusyjsuy.R.inc(60459);
            __CLR4_5_21amu1amulusyjsuy.R.inc(60460);return time1;
        }finally{__CLR4_5_21amu1amulusyjsuy.R.flushNeeded();}}

        public void setTime1(LocalDateTime time1) {try{__CLR4_5_21amu1amulusyjsuy.R.inc(60461);
            __CLR4_5_21amu1amulusyjsuy.R.inc(60462);this.time1 = time1;
        }finally{__CLR4_5_21amu1amulusyjsuy.R.flushNeeded();}}

        public LocalDateTime getTime2() {try{__CLR4_5_21amu1amulusyjsuy.R.inc(60463);
            __CLR4_5_21amu1amulusyjsuy.R.inc(60464);return time2;
        }finally{__CLR4_5_21amu1amulusyjsuy.R.flushNeeded();}}

        public void setTime2(LocalDateTime time2) {try{__CLR4_5_21amu1amulusyjsuy.R.inc(60465);
            __CLR4_5_21amu1amulusyjsuy.R.inc(60466);this.time2 = time2;
        }finally{__CLR4_5_21amu1amulusyjsuy.R.flushNeeded();}}
    }
}
