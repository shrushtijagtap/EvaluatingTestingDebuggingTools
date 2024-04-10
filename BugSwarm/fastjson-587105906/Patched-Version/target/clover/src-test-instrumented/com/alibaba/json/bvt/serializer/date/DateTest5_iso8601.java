/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.date;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateTest5_iso8601 extends TestCase {static class __CLR4_5_21tso1tsolusyjv7v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,85297,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_21tso1tsolusyjv7v.R.inc(85272);
        __CLR4_5_21tso1tsolusyjv7v.R.inc(85273);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_21tso1tsolusyjv7v.R.inc(85274);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_5_21tso1tsolusyjv7v.R.flushNeeded();}}

    public void test_date() throws Exception {__CLR4_5_21tso1tsolusyjv7v.R.globalSliceStart(getClass().getName(),85275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zi49um1tsr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tso1tsolusyjv7v.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tso1tsolusyjv7v.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest5_iso8601.test_date",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85275,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zi49um1tsr() throws Exception{try{__CLR4_5_21tso1tsolusyjv7v.R.inc(85275);
        __CLR4_5_21tso1tsolusyjv7v.R.inc(85276);Date date1 = JSON.parseObject("{\"gmtCreate\":\"2018-09-12\"}", VO.class).getGmtCreate();
        __CLR4_5_21tso1tsolusyjv7v.R.inc(85277);assertNotNull(date1);
        __CLR4_5_21tso1tsolusyjv7v.R.inc(85278);Date date2 = JSON.parseObject("{\"gmtCreate\":\"2018-09-12T15:10:19+00:00\"}", VO.class).getGmtCreate();
        __CLR4_5_21tso1tsolusyjv7v.R.inc(85279);Date date3 = JSON.parseObject("{\"gmtCreate\":\"2018-09-12T15:10:19Z\"}", VO.class).getGmtCreate();
        __CLR4_5_21tso1tsolusyjv7v.R.inc(85280);Date date4 = JSON.parseObject("{\"gmtCreate\":\"20180912T151019Z\"}", VO.class).getGmtCreate();
        __CLR4_5_21tso1tsolusyjv7v.R.inc(85281);Date date5 = JSON.parseObject("{\"gmtCreate\":\"2018-09-12T15:10:19Z\"}", VO.class).getGmtCreate();
        __CLR4_5_21tso1tsolusyjv7v.R.inc(85282);Date date6 = JSON.parseObject("{\"gmtCreate\":\"20180912\"}", VO.class).getGmtCreate();

        __CLR4_5_21tso1tsolusyjv7v.R.inc(85283);long delta_2_1 = date2.getTime() - date1.getTime();
        __CLR4_5_21tso1tsolusyjv7v.R.inc(85284);assertEquals(83419000, delta_2_1);

        __CLR4_5_21tso1tsolusyjv7v.R.inc(85285);long delta_3_1 = date3.getTime() - date1.getTime();
        __CLR4_5_21tso1tsolusyjv7v.R.inc(85286);assertEquals(83419000, delta_3_1);

        __CLR4_5_21tso1tsolusyjv7v.R.inc(85287);long delta_4_3 = date4.getTime() - date3.getTime();
        __CLR4_5_21tso1tsolusyjv7v.R.inc(85288);assertEquals(0, delta_4_3);

        __CLR4_5_21tso1tsolusyjv7v.R.inc(85289);long delta_5_4 = date5.getTime() - date4.getTime();
        __CLR4_5_21tso1tsolusyjv7v.R.inc(85290);assertEquals(0, delta_5_4);

        __CLR4_5_21tso1tsolusyjv7v.R.inc(85291);long delta_6_1 = date6.getTime() - date1.getTime();
        __CLR4_5_21tso1tsolusyjv7v.R.inc(85292);assertEquals(0, delta_6_1);


    }finally{__CLR4_5_21tso1tsolusyjv7v.R.flushNeeded();}}

    public static class VO {

        private Date gmtCreate;

        public Date getGmtCreate() {try{__CLR4_5_21tso1tsolusyjv7v.R.inc(85293);
            __CLR4_5_21tso1tsolusyjv7v.R.inc(85294);return gmtCreate;
        }finally{__CLR4_5_21tso1tsolusyjv7v.R.flushNeeded();}}

        public void setGmtCreate(Date gmtCreate) {try{__CLR4_5_21tso1tsolusyjv7v.R.inc(85295);
            __CLR4_5_21tso1tsolusyjv7v.R.inc(85296);this.gmtCreate = gmtCreate;
        }finally{__CLR4_5_21tso1tsolusyjv7v.R.flushNeeded();}}

    }
}
