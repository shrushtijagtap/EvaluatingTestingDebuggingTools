/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.array;

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

public class BeanToArrayTest_date extends TestCase {static class __CLR4_1_101jas1jaslusqkep6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,71701,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_101jas1jaslusqkep6.R.inc(71668);
        __CLR4_1_101jas1jaslusqkep6.R.inc(71669);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_1_101jas1jaslusqkep6.R.inc(71670);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_1_101jas1jaslusqkep6.R.flushNeeded();}}
    
    public void test_date() throws Exception {__CLR4_1_101jas1jaslusqkep6.R.globalSliceStart(getClass().getName(),71671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zi49um1jav();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jas1jaslusqkep6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jas1jaslusqkep6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_date.test_date",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71671,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zi49um1jav() throws Exception{try{__CLR4_1_101jas1jaslusqkep6.R.inc(71671);
        __CLR4_1_101jas1jaslusqkep6.R.inc(71672);long time = System.currentTimeMillis();
        __CLR4_1_101jas1jaslusqkep6.R.inc(71673);Model model = JSON.parseObject("[" + time + "," + time + "]", Model.class, Feature.SupportArrayToBean);
        __CLR4_1_101jas1jaslusqkep6.R.inc(71674);Assert.assertEquals(time, model.v1.getTime());
        __CLR4_1_101jas1jaslusqkep6.R.inc(71675);Assert.assertEquals(time, model.v2.getTime());
    }finally{__CLR4_1_101jas1jaslusqkep6.R.flushNeeded();}}

    public void test_date_reader() throws Exception {__CLR4_1_101jas1jaslusqkep6.R.globalSliceStart(getClass().getName(),71676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109nytzm1jb0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jas1jaslusqkep6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jas1jaslusqkep6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_date.test_date_reader",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71676,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109nytzm1jb0() throws Exception{try{__CLR4_1_101jas1jaslusqkep6.R.inc(71676);
        __CLR4_1_101jas1jaslusqkep6.R.inc(71677);long time = System.currentTimeMillis();
        __CLR4_1_101jas1jaslusqkep6.R.inc(71678);Model model = new JSONReader(new StringReader("[" + time + "," + time + "]"), Feature.SupportArrayToBean).readObject(Model.class);
        __CLR4_1_101jas1jaslusqkep6.R.inc(71679);Assert.assertEquals(time, model.v1.getTime());
        __CLR4_1_101jas1jaslusqkep6.R.inc(71680);Assert.assertEquals(time, model.v2.getTime());
    }finally{__CLR4_1_101jas1jaslusqkep6.R.flushNeeded();}}
    
    public void test_date_null() throws Exception {__CLR4_1_101jas1jaslusqkep6.R.globalSliceStart(getClass().getName(),71681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ac7h1q1jb5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jas1jaslusqkep6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jas1jaslusqkep6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_date.test_date_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71681,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ac7h1q1jb5() throws Exception{try{__CLR4_1_101jas1jaslusqkep6.R.inc(71681);
        __CLR4_1_101jas1jaslusqkep6.R.inc(71682);Model model = JSON.parseObject("[null,null]", Model.class, Feature.SupportArrayToBean);
        __CLR4_1_101jas1jaslusqkep6.R.inc(71683);Assert.assertNull(model.v1);
        __CLR4_1_101jas1jaslusqkep6.R.inc(71684);Assert.assertNull(model.v2);
    }finally{__CLR4_1_101jas1jaslusqkep6.R.flushNeeded();}}

    public void test_date_null_reader() throws Exception {__CLR4_1_101jas1jaslusqkep6.R.globalSliceStart(getClass().getName(),71685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102is6vy1jb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jas1jaslusqkep6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jas1jaslusqkep6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_date.test_date_null_reader",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71685,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102is6vy1jb9() throws Exception{try{__CLR4_1_101jas1jaslusqkep6.R.inc(71685);
        __CLR4_1_101jas1jaslusqkep6.R.inc(71686);Model model = new JSONReader(new StringReader("[null,null]"), Feature.SupportArrayToBean).readObject(Model.class);
        __CLR4_1_101jas1jaslusqkep6.R.inc(71687);Assert.assertNull(model.v1);
        __CLR4_1_101jas1jaslusqkep6.R.inc(71688);Assert.assertNull(model.v2);
    }finally{__CLR4_1_101jas1jaslusqkep6.R.flushNeeded();}}
    
    public void test_date2() throws Exception {__CLR4_1_101jas1jaslusqkep6.R.globalSliceStart(getClass().getName(),71689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107ngkvy1jbd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jas1jaslusqkep6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jas1jaslusqkep6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_date.test_date2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71689,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107ngkvy1jbd() throws Exception{try{__CLR4_1_101jas1jaslusqkep6.R.inc(71689);
        __CLR4_1_101jas1jaslusqkep6.R.inc(71690);SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", JSON.defaultLocale);
        __CLR4_1_101jas1jaslusqkep6.R.inc(71691);dateFormat.setTimeZone(JSON.defaultTimeZone);
        __CLR4_1_101jas1jaslusqkep6.R.inc(71692);Model model = JSON.parseObject("[\"2016-01-01\",\"2016-01-02\"]", Model.class, Feature.SupportArrayToBean);
        __CLR4_1_101jas1jaslusqkep6.R.inc(71693);Assert.assertEquals(dateFormat.parse("2016-01-01").getTime(), model.v1.getTime());
        __CLR4_1_101jas1jaslusqkep6.R.inc(71694);Assert.assertEquals(dateFormat.parse("2016-01-02").getTime(), model.v2.getTime());
    }finally{__CLR4_1_101jas1jaslusqkep6.R.flushNeeded();}}

    public void test_date2_reader() throws Exception {__CLR4_1_101jas1jaslusqkep6.R.globalSliceStart(getClass().getName(),71695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xm0ini1jbj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jas1jaslusqkep6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jas1jaslusqkep6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_date.test_date2_reader",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71695,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xm0ini1jbj() throws Exception{try{__CLR4_1_101jas1jaslusqkep6.R.inc(71695);
        __CLR4_1_101jas1jaslusqkep6.R.inc(71696);SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", JSON.defaultLocale);
        __CLR4_1_101jas1jaslusqkep6.R.inc(71697);dateFormat.setTimeZone(JSON.defaultTimeZone);

        __CLR4_1_101jas1jaslusqkep6.R.inc(71698);Model model = new JSONReader(new StringReader("[\"2016-01-01\",\"2016-01-02\"]"), Feature.SupportArrayToBean).readObject(Model.class);
        __CLR4_1_101jas1jaslusqkep6.R.inc(71699);Assert.assertEquals(dateFormat.parse("2016-01-01").getTime(), model.v1.getTime());
        __CLR4_1_101jas1jaslusqkep6.R.inc(71700);Assert.assertEquals(dateFormat.parse("2016-01-02").getTime(), model.v2.getTime());
    }finally{__CLR4_1_101jas1jaslusqkep6.R.flushNeeded();}}

    public static class Model {
        public Date v1;
        public Date v2;
    }
}
