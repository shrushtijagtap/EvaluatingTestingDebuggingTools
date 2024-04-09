/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.date;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class DateFormatDeserializerTest extends TestCase {static class __CLR4_1_101m4c1m4clusqkgp7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,75358,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_101m4c1m4clusqkgp7.R.inc(75324);
        __CLR4_1_101m4c1m4clusqkgp7.R.inc(75325);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_1_101m4c1m4clusqkgp7.R.inc(75326);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_1_101m4c1m4clusqkgp7.R.flushNeeded();}}
    
    public void test_dateFormat_empty() throws Exception {__CLR4_1_101m4c1m4clusqkgp7.R.globalSliceStart(getClass().getName(),75327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m1hpeh1m4f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101m4c1m4clusqkgp7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101m4c1m4clusqkgp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateFormatDeserializerTest.test_dateFormat_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75327,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m1hpeh1m4f() throws Exception{try{__CLR4_1_101m4c1m4clusqkgp7.R.inc(75327);
        __CLR4_1_101m4c1m4clusqkgp7.R.inc(75328);VO vo = JSON.parseObject("{\"format\":\"\"}", VO.class);
        __CLR4_1_101m4c1m4clusqkgp7.R.inc(75329);Assert.assertEquals(null, vo.getFormat());
    }finally{__CLR4_1_101m4c1m4clusqkgp7.R.flushNeeded();}}
    
    public void test_dateFormat_array() throws Exception {__CLR4_1_101m4c1m4clusqkgp7.R.globalSliceStart(getClass().getName(),75330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vw63pp1m4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101m4c1m4clusqkgp7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101m4c1m4clusqkgp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateFormatDeserializerTest.test_dateFormat_array",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75330,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vw63pp1m4i() throws Exception{try{__CLR4_1_101m4c1m4clusqkgp7.R.inc(75330);
        __CLR4_1_101m4c1m4clusqkgp7.R.inc(75331);List<SimpleDateFormat> list = JSON.parseArray("[\"\",null,\"yyyy\"]", SimpleDateFormat.class);
        __CLR4_1_101m4c1m4clusqkgp7.R.inc(75332);Assert.assertEquals(null, list.get(0));
        __CLR4_1_101m4c1m4clusqkgp7.R.inc(75333);Assert.assertEquals(null, list.get(1));
        
        __CLR4_1_101m4c1m4clusqkgp7.R.inc(75334);SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy", JSON.defaultLocale);
        __CLR4_1_101m4c1m4clusqkgp7.R.inc(75335);dateFormat.setTimeZone(JSON.defaultTimeZone);
        __CLR4_1_101m4c1m4clusqkgp7.R.inc(75336);Assert.assertEquals(dateFormat, list.get(2));
    }finally{__CLR4_1_101m4c1m4clusqkgp7.R.flushNeeded();}}

    public void test_dateFormat_null() throws Exception {__CLR4_1_101m4c1m4clusqkgp7.R.globalSliceStart(getClass().getName(),75337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1052xowr1m4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101m4c1m4clusqkgp7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101m4c1m4clusqkgp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateFormatDeserializerTest.test_dateFormat_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75337,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1052xowr1m4p() throws Exception{try{__CLR4_1_101m4c1m4clusqkgp7.R.inc(75337);
        __CLR4_1_101m4c1m4clusqkgp7.R.inc(75338);VO vo = JSON.parseObject("{\"format\":null}", VO.class);
        __CLR4_1_101m4c1m4clusqkgp7.R.inc(75339);Assert.assertEquals(null, vo.getFormat());
    }finally{__CLR4_1_101m4c1m4clusqkgp7.R.flushNeeded();}}

    public void test_dateFormat_yyyy() throws Exception {__CLR4_1_101m4c1m4clusqkgp7.R.globalSliceStart(getClass().getName(),75340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ipl1qk1m4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101m4c1m4clusqkgp7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101m4c1m4clusqkgp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateFormatDeserializerTest.test_dateFormat_yyyy",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75340,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ipl1qk1m4s() throws Exception{try{__CLR4_1_101m4c1m4clusqkgp7.R.inc(75340);
        __CLR4_1_101m4c1m4clusqkgp7.R.inc(75341);VO vo = JSON.parseObject("{\"format\":\"yyyy\"}", VO.class);
        
        __CLR4_1_101m4c1m4clusqkgp7.R.inc(75342);SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy", JSON.defaultLocale);
        __CLR4_1_101m4c1m4clusqkgp7.R.inc(75343);dateFormat.setTimeZone(JSON.defaultTimeZone);
        __CLR4_1_101m4c1m4clusqkgp7.R.inc(75344);Assert.assertEquals(dateFormat, vo.getFormat());
    }finally{__CLR4_1_101m4c1m4clusqkgp7.R.flushNeeded();}}

    public void test_dateFormat_error() throws Exception {__CLR4_1_101m4c1m4clusqkgp7.R.globalSliceStart(getClass().getName(),75345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbu1dq1m4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101m4c1m4clusqkgp7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101m4c1m4clusqkgp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateFormatDeserializerTest.test_dateFormat_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75345,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbu1dq1m4x() throws Exception{try{__CLR4_1_101m4c1m4clusqkgp7.R.inc(75345);
        __CLR4_1_101m4c1m4clusqkgp7.R.inc(75346);Exception error = null;
        __CLR4_1_101m4c1m4clusqkgp7.R.inc(75347);try {
            __CLR4_1_101m4c1m4clusqkgp7.R.inc(75348);JSON.parseObject("{\"format\":123}", VO.class);
        } catch (Exception e) {
            __CLR4_1_101m4c1m4clusqkgp7.R.inc(75349);error = e;
        }
        __CLR4_1_101m4c1m4clusqkgp7.R.inc(75350);Assert.assertNotNull(error);
    }finally{__CLR4_1_101m4c1m4clusqkgp7.R.flushNeeded();}}

    public static class VO {

        private SimpleDateFormat format;

        public VO(){try{__CLR4_1_101m4c1m4clusqkgp7.R.inc(75351);

        }finally{__CLR4_1_101m4c1m4clusqkgp7.R.flushNeeded();}}

        public VO(SimpleDateFormat format){try{__CLR4_1_101m4c1m4clusqkgp7.R.inc(75352);
            __CLR4_1_101m4c1m4clusqkgp7.R.inc(75353);this.format = format;
        }finally{__CLR4_1_101m4c1m4clusqkgp7.R.flushNeeded();}}

        public SimpleDateFormat getFormat() {try{__CLR4_1_101m4c1m4clusqkgp7.R.inc(75354);
            __CLR4_1_101m4c1m4clusqkgp7.R.inc(75355);return format;
        }finally{__CLR4_1_101m4c1m4clusqkgp7.R.flushNeeded();}}

        public void setFormat(SimpleDateFormat format) {try{__CLR4_1_101m4c1m4clusqkgp7.R.inc(75356);
            __CLR4_1_101m4c1m4clusqkgp7.R.inc(75357);this.format = format;
        }finally{__CLR4_1_101m4c1m4clusqkgp7.R.flushNeeded();}}

    }
}
