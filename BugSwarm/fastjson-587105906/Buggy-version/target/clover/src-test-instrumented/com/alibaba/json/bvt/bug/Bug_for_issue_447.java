/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class Bug_for_issue_447 extends TestCase {static class __CLR4_1_1014hh14hhlusqk313{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,52493,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_1014hh14hhlusqk313.R.inc(52469);
        __CLR4_1_1014hh14hhlusqk313.R.inc(52470);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_1_1014hh14hhlusqk313.R.inc(52471);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_1_1014hh14hhlusqk313.R.flushNeeded();}}
    
    public void test_for_issue() throws Exception {__CLR4_1_1014hh14hhlusqk313.R.globalSliceStart(getClass().getName(),52472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb14hk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1014hh14hhlusqk313.R.rethrow($CLV_t2$);}finally{__CLR4_1_1014hh14hhlusqk313.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_447.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),52472,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb14hk() throws Exception{try{__CLR4_1_1014hh14hhlusqk313.R.inc(52472);
        __CLR4_1_1014hh14hhlusqk313.R.inc(52473);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1014hh14hhlusqk313.R.inc(52474);calendar.setTimeInMillis(1460563200000L);
        __CLR4_1_1014hh14hhlusqk313.R.inc(52475);calendar.set(Calendar.HOUR_OF_DAY, 0);
        __CLR4_1_1014hh14hhlusqk313.R.inc(52476);calendar.set(Calendar.MINUTE, 0);
        __CLR4_1_1014hh14hhlusqk313.R.inc(52477);calendar.set(Calendar.SECOND, 0);
        __CLR4_1_1014hh14hhlusqk313.R.inc(52478);calendar.set(Calendar.MILLISECOND, 0);
        __CLR4_1_1014hh14hhlusqk313.R.inc(52479);Foo foo = new Foo();
        __CLR4_1_1014hh14hhlusqk313.R.inc(52480);foo.setCreateDate(calendar.getTime());
        __CLR4_1_1014hh14hhlusqk313.R.inc(52481);String date = JSON.toJSONString(foo, SerializerFeature.UseISO8601DateFormat);
        __CLR4_1_1014hh14hhlusqk313.R.inc(52482);Assert.assertEquals("{\"createDate\":\"2016-04-14+08:00\"}", date);
        __CLR4_1_1014hh14hhlusqk313.R.inc(52483);Foo foo2 = JSON.parseObject(date, Foo.class, Feature.AllowISO8601DateFormat);
        __CLR4_1_1014hh14hhlusqk313.R.inc(52484);Assert.assertEquals("{\"createDate\":\"2016-04-14 00:00:00\"}", JSON.toJSONString(foo2, SerializerFeature.WriteDateUseDateFormat));
    }finally{__CLR4_1_1014hh14hhlusqk313.R.flushNeeded();}}

    public static class Foo {

        private String name;
        private Date   createDate;

        public String getName() {try{__CLR4_1_1014hh14hhlusqk313.R.inc(52485);
            __CLR4_1_1014hh14hhlusqk313.R.inc(52486);return name;
        }finally{__CLR4_1_1014hh14hhlusqk313.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_1014hh14hhlusqk313.R.inc(52487);
            __CLR4_1_1014hh14hhlusqk313.R.inc(52488);this.name = name;
        }finally{__CLR4_1_1014hh14hhlusqk313.R.flushNeeded();}}

        public Date getCreateDate() {try{__CLR4_1_1014hh14hhlusqk313.R.inc(52489);
            __CLR4_1_1014hh14hhlusqk313.R.inc(52490);return createDate;
        }finally{__CLR4_1_1014hh14hhlusqk313.R.flushNeeded();}}

        public void setCreateDate(Date createDate) {try{__CLR4_1_1014hh14hhlusqk313.R.inc(52491);
            __CLR4_1_1014hh14hhlusqk313.R.inc(52492);this.createDate = createDate;
        }finally{__CLR4_1_1014hh14hhlusqk313.R.flushNeeded();}}

    }
}
