/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.array;

import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;

import junit.framework.TestCase;

public class BeanToArrayTest_date extends TestCase {static class __CLR4_5_21jah1jahlusyjtw3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,71690,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_21jah1jahlusyjtw3.R.inc(71657);
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71658);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71659);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_5_21jah1jahlusyjtw3.R.flushNeeded();}}
    
    public void test_date() throws Exception {__CLR4_5_21jah1jahlusyjtw3.R.globalSliceStart(getClass().getName(),71660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zi49um1jak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jah1jahlusyjtw3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jah1jahlusyjtw3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_date.test_date",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71660,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zi49um1jak() throws Exception{try{__CLR4_5_21jah1jahlusyjtw3.R.inc(71660);
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71661);long time = System.currentTimeMillis();
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71662);Model model = JSON.parseObject("[" + time + "," + time + "]", Model.class, Feature.SupportArrayToBean);
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71663);Assert.assertEquals(time, model.v1.getTime());
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71664);Assert.assertEquals(time, model.v2.getTime());
    }finally{__CLR4_5_21jah1jahlusyjtw3.R.flushNeeded();}}

    public void test_date_reader() throws Exception {__CLR4_5_21jah1jahlusyjtw3.R.globalSliceStart(getClass().getName(),71665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29nytzm1jap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jah1jahlusyjtw3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jah1jahlusyjtw3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_date.test_date_reader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71665,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29nytzm1jap() throws Exception{try{__CLR4_5_21jah1jahlusyjtw3.R.inc(71665);
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71666);long time = System.currentTimeMillis();
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71667);Model model = new JSONReader(new StringReader("[" + time + "," + time + "]"), Feature.SupportArrayToBean).readObject(Model.class);
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71668);Assert.assertEquals(time, model.v1.getTime());
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71669);Assert.assertEquals(time, model.v2.getTime());
    }finally{__CLR4_5_21jah1jahlusyjtw3.R.flushNeeded();}}
    
    public void test_date_null() throws Exception {__CLR4_5_21jah1jahlusyjtw3.R.globalSliceStart(getClass().getName(),71670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ac7h1q1jau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jah1jahlusyjtw3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jah1jahlusyjtw3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_date.test_date_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71670,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ac7h1q1jau() throws Exception{try{__CLR4_5_21jah1jahlusyjtw3.R.inc(71670);
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71671);Model model = JSON.parseObject("[null,null]", Model.class, Feature.SupportArrayToBean);
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71672);Assert.assertNull(model.v1);
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71673);Assert.assertNull(model.v2);
    }finally{__CLR4_5_21jah1jahlusyjtw3.R.flushNeeded();}}

    public void test_date_null_reader() throws Exception {__CLR4_5_21jah1jahlusyjtw3.R.globalSliceStart(getClass().getName(),71674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22is6vy1jay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jah1jahlusyjtw3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jah1jahlusyjtw3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_date.test_date_null_reader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71674,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22is6vy1jay() throws Exception{try{__CLR4_5_21jah1jahlusyjtw3.R.inc(71674);
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71675);Model model = new JSONReader(new StringReader("[null,null]"), Feature.SupportArrayToBean).readObject(Model.class);
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71676);Assert.assertNull(model.v1);
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71677);Assert.assertNull(model.v2);
    }finally{__CLR4_5_21jah1jahlusyjtw3.R.flushNeeded();}}
    
    public void test_date2() throws Exception {__CLR4_5_21jah1jahlusyjtw3.R.globalSliceStart(getClass().getName(),71678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27ngkvy1jb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jah1jahlusyjtw3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jah1jahlusyjtw3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_date.test_date2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71678,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27ngkvy1jb2() throws Exception{try{__CLR4_5_21jah1jahlusyjtw3.R.inc(71678);
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71679);SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", JSON.defaultLocale);
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71680);dateFormat.setTimeZone(JSON.defaultTimeZone);
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71681);Model model = JSON.parseObject("[\"2016-01-01\",\"2016-01-02\"]", Model.class, Feature.SupportArrayToBean);
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71682);Assert.assertEquals(dateFormat.parse("2016-01-01").getTime(), model.v1.getTime());
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71683);Assert.assertEquals(dateFormat.parse("2016-01-02").getTime(), model.v2.getTime());
    }finally{__CLR4_5_21jah1jahlusyjtw3.R.flushNeeded();}}

    public void test_date2_reader() throws Exception {__CLR4_5_21jah1jahlusyjtw3.R.globalSliceStart(getClass().getName(),71684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xm0ini1jb8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jah1jahlusyjtw3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jah1jahlusyjtw3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_date.test_date2_reader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71684,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xm0ini1jb8() throws Exception{try{__CLR4_5_21jah1jahlusyjtw3.R.inc(71684);
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71685);SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", JSON.defaultLocale);
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71686);dateFormat.setTimeZone(JSON.defaultTimeZone);

        __CLR4_5_21jah1jahlusyjtw3.R.inc(71687);Model model = new JSONReader(new StringReader("[\"2016-01-01\",\"2016-01-02\"]"), Feature.SupportArrayToBean).readObject(Model.class);
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71688);Assert.assertEquals(dateFormat.parse("2016-01-01").getTime(), model.v1.getTime());
        __CLR4_5_21jah1jahlusyjtw3.R.inc(71689);Assert.assertEquals(dateFormat.parse("2016-01-02").getTime(), model.v2.getTime());
    }finally{__CLR4_5_21jah1jahlusyjtw3.R.flushNeeded();}}

    public static class Model {
        public Date v1;
        public Date v2;
    }
}
