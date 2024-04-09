/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class SqlDateTest1 extends TestCase {static class __CLR4_1_10zh6zh6lusqjz81{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,45997,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_10zh6zh6lusqjz81.R.inc(45978);
        __CLR4_1_10zh6zh6lusqjz81.R.inc(45979);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_1_10zh6zh6lusqjz81.R.inc(45980);JSON.defaultLocale = new Locale("zh_CN");
    }finally{__CLR4_1_10zh6zh6lusqjz81.R.flushNeeded();}}
    
    public void test_date() throws Exception {__CLR4_1_10zh6zh6lusqjz81.R.globalSliceStart(getClass().getName(),45981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zi49umzh9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10zh6zh6lusqjz81.R.rethrow($CLV_t2$);}finally{__CLR4_1_10zh6zh6lusqjz81.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.SqlDateTest1.test_date",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45981,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zi49umzh9() throws Exception{try{__CLR4_1_10zh6zh6lusqjz81.R.inc(45981);
        __CLR4_1_10zh6zh6lusqjz81.R.inc(45982);long millis = 1324138987429L;
        __CLR4_1_10zh6zh6lusqjz81.R.inc(45983);Date date = new Date(millis);

        __CLR4_1_10zh6zh6lusqjz81.R.inc(45984);Assert.assertEquals("1324138987429", JSON.toJSONString(date));
        __CLR4_1_10zh6zh6lusqjz81.R.inc(45985);Assert.assertEquals("{\"@type\":\"java.sql.Date\",\"val\":1324138987429}", JSON.toJSONString(date, SerializerFeature.WriteClassName));
        __CLR4_1_10zh6zh6lusqjz81.R.inc(45986);Assert.assertEquals(1324138987429L, ((java.util.Date)JSON.parse("{\"@type\":\"java.util.Date\",\"val\":1324138987429}")).getTime());

        __CLR4_1_10zh6zh6lusqjz81.R.inc(45987);Assert.assertEquals("\"2011-12-18 00:23:07\"",
                            JSON.toJSONString(date, SerializerFeature.WriteDateUseDateFormat));
        __CLR4_1_10zh6zh6lusqjz81.R.inc(45988);Assert.assertEquals("\"2011-12-18 00:23:07.429\"",
                            JSON.toJSONStringWithDateFormat(date, "yyyy-MM-dd HH:mm:ss.SSS"));
        __CLR4_1_10zh6zh6lusqjz81.R.inc(45989);Assert.assertEquals("'2011-12-18 00:23:07.429'",
                            JSON.toJSONStringWithDateFormat(date, "yyyy-MM-dd HH:mm:ss.SSS",
                                                            SerializerFeature.UseSingleQuotes));
    }finally{__CLR4_1_10zh6zh6lusqjz81.R.flushNeeded();}}

    public void test_date2() throws Exception {__CLR4_1_10zh6zh6lusqjz81.R.globalSliceStart(getClass().getName(),45990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107ngkvyzhi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10zh6zh6lusqjz81.R.rethrow($CLV_t2$);}finally{__CLR4_1_10zh6zh6lusqjz81.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.SqlDateTest1.test_date2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45990,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107ngkvyzhi() throws Exception{try{__CLR4_1_10zh6zh6lusqjz81.R.inc(45990);
        __CLR4_1_10zh6zh6lusqjz81.R.inc(45991);SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        __CLR4_1_10zh6zh6lusqjz81.R.inc(45992);java.util.Date d = sdf.parse("2019-09-12 16:00:00");
        __CLR4_1_10zh6zh6lusqjz81.R.inc(45993);java.sql.Date ds = new java.sql.Date(d.getTime());
//        System.out.println("Java Obj: " + sdf.format(ds));

        __CLR4_1_10zh6zh6lusqjz81.R.inc(45994);String jvs = JSON.toJSONString(ds);
//        System.out.println("JSON Str: " + jvs);

        __CLR4_1_10zh6zh6lusqjz81.R.inc(45995);java.sql.Date d2s = JSON.parseObject(jvs, java.sql.Date.class);
//        System.out.println("Java Obj: " + sdf.format(d2s));
//        System.out.println("LONG: " + d2s.getTime());

        __CLR4_1_10zh6zh6lusqjz81.R.inc(45996);assertEquals(d.getTime(), d2s.getTime());
    }finally{__CLR4_1_10zh6zh6lusqjz81.R.flushNeeded();}}
}
