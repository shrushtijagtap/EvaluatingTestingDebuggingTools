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

public class BeanToArrayTest_date extends TestCase {static class __CLR4_1_101k901k90luszwd1f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,72933,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_101k901k90luszwd1f.R.inc(72900);
        __CLR4_1_101k901k90luszwd1f.R.inc(72901);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_1_101k901k90luszwd1f.R.inc(72902);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_1_101k901k90luszwd1f.R.flushNeeded();}}
    
    public void test_date() throws Exception {__CLR4_1_101k901k90luszwd1f.R.globalSliceStart(getClass().getName(),72903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zi49um1k93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101k901k90luszwd1f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101k901k90luszwd1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_date.test_date",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72903,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zi49um1k93() throws Exception{try{__CLR4_1_101k901k90luszwd1f.R.inc(72903);
        __CLR4_1_101k901k90luszwd1f.R.inc(72904);long time = System.currentTimeMillis();
        __CLR4_1_101k901k90luszwd1f.R.inc(72905);Model model = JSON.parseObject("[" + time + "," + time + "]", Model.class, Feature.SupportArrayToBean);
        __CLR4_1_101k901k90luszwd1f.R.inc(72906);Assert.assertEquals(time, model.v1.getTime());
        __CLR4_1_101k901k90luszwd1f.R.inc(72907);Assert.assertEquals(time, model.v2.getTime());
    }finally{__CLR4_1_101k901k90luszwd1f.R.flushNeeded();}}

    public void test_date_reader() throws Exception {__CLR4_1_101k901k90luszwd1f.R.globalSliceStart(getClass().getName(),72908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109nytzm1k98();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101k901k90luszwd1f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101k901k90luszwd1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_date.test_date_reader",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72908,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109nytzm1k98() throws Exception{try{__CLR4_1_101k901k90luszwd1f.R.inc(72908);
        __CLR4_1_101k901k90luszwd1f.R.inc(72909);long time = System.currentTimeMillis();
        __CLR4_1_101k901k90luszwd1f.R.inc(72910);Model model = new JSONReader(new StringReader("[" + time + "," + time + "]"), Feature.SupportArrayToBean).readObject(Model.class);
        __CLR4_1_101k901k90luszwd1f.R.inc(72911);Assert.assertEquals(time, model.v1.getTime());
        __CLR4_1_101k901k90luszwd1f.R.inc(72912);Assert.assertEquals(time, model.v2.getTime());
    }finally{__CLR4_1_101k901k90luszwd1f.R.flushNeeded();}}
    
    public void test_date_null() throws Exception {__CLR4_1_101k901k90luszwd1f.R.globalSliceStart(getClass().getName(),72913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ac7h1q1k9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101k901k90luszwd1f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101k901k90luszwd1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_date.test_date_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72913,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ac7h1q1k9d() throws Exception{try{__CLR4_1_101k901k90luszwd1f.R.inc(72913);
        __CLR4_1_101k901k90luszwd1f.R.inc(72914);Model model = JSON.parseObject("[null,null]", Model.class, Feature.SupportArrayToBean);
        __CLR4_1_101k901k90luszwd1f.R.inc(72915);Assert.assertNull(model.v1);
        __CLR4_1_101k901k90luszwd1f.R.inc(72916);Assert.assertNull(model.v2);
    }finally{__CLR4_1_101k901k90luszwd1f.R.flushNeeded();}}

    public void test_date_null_reader() throws Exception {__CLR4_1_101k901k90luszwd1f.R.globalSliceStart(getClass().getName(),72917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102is6vy1k9h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101k901k90luszwd1f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101k901k90luszwd1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_date.test_date_null_reader",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72917,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102is6vy1k9h() throws Exception{try{__CLR4_1_101k901k90luszwd1f.R.inc(72917);
        __CLR4_1_101k901k90luszwd1f.R.inc(72918);Model model = new JSONReader(new StringReader("[null,null]"), Feature.SupportArrayToBean).readObject(Model.class);
        __CLR4_1_101k901k90luszwd1f.R.inc(72919);Assert.assertNull(model.v1);
        __CLR4_1_101k901k90luszwd1f.R.inc(72920);Assert.assertNull(model.v2);
    }finally{__CLR4_1_101k901k90luszwd1f.R.flushNeeded();}}
    
    public void test_date2() throws Exception {__CLR4_1_101k901k90luszwd1f.R.globalSliceStart(getClass().getName(),72921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107ngkvy1k9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101k901k90luszwd1f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101k901k90luszwd1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_date.test_date2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72921,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107ngkvy1k9l() throws Exception{try{__CLR4_1_101k901k90luszwd1f.R.inc(72921);
        __CLR4_1_101k901k90luszwd1f.R.inc(72922);SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", JSON.defaultLocale);
        __CLR4_1_101k901k90luszwd1f.R.inc(72923);dateFormat.setTimeZone(JSON.defaultTimeZone);
        __CLR4_1_101k901k90luszwd1f.R.inc(72924);Model model = JSON.parseObject("[\"2016-01-01\",\"2016-01-02\"]", Model.class, Feature.SupportArrayToBean);
        __CLR4_1_101k901k90luszwd1f.R.inc(72925);Assert.assertEquals(dateFormat.parse("2016-01-01").getTime(), model.v1.getTime());
        __CLR4_1_101k901k90luszwd1f.R.inc(72926);Assert.assertEquals(dateFormat.parse("2016-01-02").getTime(), model.v2.getTime());
    }finally{__CLR4_1_101k901k90luszwd1f.R.flushNeeded();}}

    public void test_date2_reader() throws Exception {__CLR4_1_101k901k90luszwd1f.R.globalSliceStart(getClass().getName(),72927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xm0ini1k9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101k901k90luszwd1f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101k901k90luszwd1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_date.test_date2_reader",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72927,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xm0ini1k9r() throws Exception{try{__CLR4_1_101k901k90luszwd1f.R.inc(72927);
        __CLR4_1_101k901k90luszwd1f.R.inc(72928);SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", JSON.defaultLocale);
        __CLR4_1_101k901k90luszwd1f.R.inc(72929);dateFormat.setTimeZone(JSON.defaultTimeZone);

        __CLR4_1_101k901k90luszwd1f.R.inc(72930);Model model = new JSONReader(new StringReader("[\"2016-01-01\",\"2016-01-02\"]"), Feature.SupportArrayToBean).readObject(Model.class);
        __CLR4_1_101k901k90luszwd1f.R.inc(72931);Assert.assertEquals(dateFormat.parse("2016-01-01").getTime(), model.v1.getTime());
        __CLR4_1_101k901k90luszwd1f.R.inc(72932);Assert.assertEquals(dateFormat.parse("2016-01-02").getTime(), model.v2.getTime());
    }finally{__CLR4_1_101k901k90luszwd1f.R.flushNeeded();}}

    public static class Model {
        public Date v1;
        public Date v2;
    }
}
