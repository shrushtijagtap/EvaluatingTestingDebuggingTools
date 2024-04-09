/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.date;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by wenshao on 07/04/2017.
 */
public class DateFieldTest10 extends TestCase {static class __CLR4_5_219i119i1lusvn90e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,59005,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_219i119i1lusvn90e.R.inc(58969);
        __CLR4_5_219i119i1lusvn90e.R.inc(58970);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_219i119i1lusvn90e.R.inc(58971);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_5_219i119i1lusvn90e.R.flushNeeded();}}

    public void test_for_zero() throws Exception {__CLR4_5_219i119i1lusvn90e.R.globalSliceStart(getClass().getName(),58972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q6op5e19i4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219i119i1lusvn90e.R.rethrow($CLV_t2$);}finally{__CLR4_5_219i119i1lusvn90e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest10.test_for_zero",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58972,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q6op5e19i4() throws Exception{try{__CLR4_5_219i119i1lusvn90e.R.inc(58972);
        __CLR4_5_219i119i1lusvn90e.R.inc(58973);String text = "{\"date\":\"0000-00-00\"}";

        __CLR4_5_219i119i1lusvn90e.R.inc(58974);SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        __CLR4_5_219i119i1lusvn90e.R.inc(58975);Object object = format.parse("0000-00-00");
        __CLR4_5_219i119i1lusvn90e.R.inc(58976);JSON.parseObject(text, Model.class);
    }finally{__CLR4_5_219i119i1lusvn90e.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_219i119i1lusvn90e.R.globalSliceStart(getClass().getName(),58977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl19i9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219i119i1lusvn90e.R.rethrow($CLV_t2$);}finally{__CLR4_5_219i119i1lusvn90e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest10.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58977,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl19i9() throws Exception{try{__CLR4_5_219i119i1lusvn90e.R.inc(58977);
        __CLR4_5_219i119i1lusvn90e.R.inc(58978);String text = "{\"date\":\"2017-08-14 19:05:30.000|America/Los_Angeles\"}";
        __CLR4_5_219i119i1lusvn90e.R.inc(58979);JSON.parseObject(text, Model.class);
    }finally{__CLR4_5_219i119i1lusvn90e.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_219i119i1lusvn90e.R.globalSliceStart(getClass().getName(),58980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k4419ic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219i119i1lusvn90e.R.rethrow($CLV_t2$);}finally{__CLR4_5_219i119i1lusvn90e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest10.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58980,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k4419ic() throws Exception{try{__CLR4_5_219i119i1lusvn90e.R.inc(58980);
        __CLR4_5_219i119i1lusvn90e.R.inc(58981);String text = "{\"date\":\"2017-08-16T04:29Z\"}";
        __CLR4_5_219i119i1lusvn90e.R.inc(58982);Model model = JSON.parseObject(text, Model.class);

        __CLR4_5_219i119i1lusvn90e.R.inc(58983);SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        __CLR4_5_219i119i1lusvn90e.R.inc(58984);Object object = format.parse("2017-08-16 04:29");
//        assertEquals(object, model.date);
    }finally{__CLR4_5_219i119i1lusvn90e.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_219i119i1lusvn90e.R.globalSliceStart(getClass().getName(),58985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn19ih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219i119i1lusvn90e.R.rethrow($CLV_t2$);}finally{__CLR4_5_219i119i1lusvn90e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest10.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58985,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn19ih() throws Exception{try{__CLR4_5_219i119i1lusvn90e.R.inc(58985);
        __CLR4_5_219i119i1lusvn90e.R.inc(58986);String text = "{\"date\":\"2017-08-16 04:29\"}";
        __CLR4_5_219i119i1lusvn90e.R.inc(58987);Model model = JSON.parseObject(text, Model.class);

        __CLR4_5_219i119i1lusvn90e.R.inc(58988);SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        __CLR4_5_219i119i1lusvn90e.R.inc(58989);Object object = format.parse("2017-08-16 04:29");
//        assertEquals(object, model.date);
    }finally{__CLR4_5_219i119i1lusvn90e.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_219i119i1lusvn90e.R.globalSliceStart(getClass().getName(),58990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj619im();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219i119i1lusvn90e.R.rethrow($CLV_t2$);}finally{__CLR4_5_219i119i1lusvn90e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest10.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58990,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj619im() throws Exception{try{__CLR4_5_219i119i1lusvn90e.R.inc(58990);
        __CLR4_5_219i119i1lusvn90e.R.inc(58991);String text = "{\"date\":\"2017-08-16T04:29\"}";
        __CLR4_5_219i119i1lusvn90e.R.inc(58992);Model model = JSON.parseObject(text, Model.class);

        __CLR4_5_219i119i1lusvn90e.R.inc(58993);SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        __CLR4_5_219i119i1lusvn90e.R.inc(58994);Object object = format.parse("2017-08-16 04:29");
//        assertEquals(object, model.date);
    }finally{__CLR4_5_219i119i1lusvn90e.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_219i119i1lusvn90e.R.globalSliceStart(getClass().getName(),58995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp19ir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219i119i1lusvn90e.R.rethrow($CLV_t2$);}finally{__CLR4_5_219i119i1lusvn90e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest10.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58995,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp19ir() throws Exception{try{__CLR4_5_219i119i1lusvn90e.R.inc(58995);
        __CLR4_5_219i119i1lusvn90e.R.inc(58996);String text = "{\"date\":\"2018-05-21T14:39:44.907+08:00\"}";
        __CLR4_5_219i119i1lusvn90e.R.inc(58997);Model model = JSON.parseObject(text, Model.class);
        __CLR4_5_219i119i1lusvn90e.R.inc(58998);String str = JSON.toJSONString(model, SerializerFeature.UseISO8601DateFormat);
        __CLR4_5_219i119i1lusvn90e.R.inc(58999);assertEquals("{\"date\":\"2018-05-21T14:39:44.907+08:00\"}", str);

//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//        Date object = format.parse("2018-05-21T14:39:44.9077913+08:00");
//        assertEquals(object.getTime(), model.date.getTime());
    }finally{__CLR4_5_219i119i1lusvn90e.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_5_219i119i1lusvn90e.R.globalSliceStart(getClass().getName(),59000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy819iw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219i119i1lusvn90e.R.rethrow($CLV_t2$);}finally{__CLR4_5_219i119i1lusvn90e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldTest10.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59000,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy819iw() throws Exception{try{__CLR4_5_219i119i1lusvn90e.R.inc(59000);
        __CLR4_5_219i119i1lusvn90e.R.inc(59001);String text = "{\"date\":\"4567-08-16T04:29\"}";
        __CLR4_5_219i119i1lusvn90e.R.inc(59002);Model model = JSON.parseObject(text, Model.class);

        __CLR4_5_219i119i1lusvn90e.R.inc(59003);SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        __CLR4_5_219i119i1lusvn90e.R.inc(59004);Object object = format.parse("2017-08-16 04:29");
//        assertEquals(object, model.date);
    }finally{__CLR4_5_219i119i1lusvn90e.R.flushNeeded();}}

    public static class Model {
        public Date date;
    }
}
