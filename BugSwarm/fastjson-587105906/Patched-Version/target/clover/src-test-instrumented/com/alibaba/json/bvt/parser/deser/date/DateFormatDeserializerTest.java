/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.date;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class DateFormatDeserializerTest extends TestCase {static class __CLR4_5_21n291n29lusvneog{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,76579,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_21n291n29lusvneog.R.inc(76545);
        __CLR4_5_21n291n29lusvneog.R.inc(76546);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_21n291n29lusvneog.R.inc(76547);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_5_21n291n29lusvneog.R.flushNeeded();}}
    
    public void test_dateFormat_empty() throws Exception {__CLR4_5_21n291n29lusvneog.R.globalSliceStart(getClass().getName(),76548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m1hpeh1n2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n291n29lusvneog.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n291n29lusvneog.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateFormatDeserializerTest.test_dateFormat_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76548,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m1hpeh1n2c() throws Exception{try{__CLR4_5_21n291n29lusvneog.R.inc(76548);
        __CLR4_5_21n291n29lusvneog.R.inc(76549);VO vo = JSON.parseObject("{\"format\":\"\"}", VO.class);
        __CLR4_5_21n291n29lusvneog.R.inc(76550);Assert.assertEquals(null, vo.getFormat());
    }finally{__CLR4_5_21n291n29lusvneog.R.flushNeeded();}}
    
    public void test_dateFormat_array() throws Exception {__CLR4_5_21n291n29lusvneog.R.globalSliceStart(getClass().getName(),76551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vw63pp1n2f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n291n29lusvneog.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n291n29lusvneog.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateFormatDeserializerTest.test_dateFormat_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76551,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vw63pp1n2f() throws Exception{try{__CLR4_5_21n291n29lusvneog.R.inc(76551);
        __CLR4_5_21n291n29lusvneog.R.inc(76552);List<SimpleDateFormat> list = JSON.parseArray("[\"\",null,\"yyyy\"]", SimpleDateFormat.class);
        __CLR4_5_21n291n29lusvneog.R.inc(76553);Assert.assertEquals(null, list.get(0));
        __CLR4_5_21n291n29lusvneog.R.inc(76554);Assert.assertEquals(null, list.get(1));
        
        __CLR4_5_21n291n29lusvneog.R.inc(76555);SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy", JSON.defaultLocale);
        __CLR4_5_21n291n29lusvneog.R.inc(76556);dateFormat.setTimeZone(JSON.defaultTimeZone);
        __CLR4_5_21n291n29lusvneog.R.inc(76557);Assert.assertEquals(dateFormat, list.get(2));
    }finally{__CLR4_5_21n291n29lusvneog.R.flushNeeded();}}

    public void test_dateFormat_null() throws Exception {__CLR4_5_21n291n29lusvneog.R.globalSliceStart(getClass().getName(),76558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_252xowr1n2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n291n29lusvneog.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n291n29lusvneog.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateFormatDeserializerTest.test_dateFormat_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76558,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_252xowr1n2m() throws Exception{try{__CLR4_5_21n291n29lusvneog.R.inc(76558);
        __CLR4_5_21n291n29lusvneog.R.inc(76559);VO vo = JSON.parseObject("{\"format\":null}", VO.class);
        __CLR4_5_21n291n29lusvneog.R.inc(76560);Assert.assertEquals(null, vo.getFormat());
    }finally{__CLR4_5_21n291n29lusvneog.R.flushNeeded();}}

    public void test_dateFormat_yyyy() throws Exception {__CLR4_5_21n291n29lusvneog.R.globalSliceStart(getClass().getName(),76561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ipl1qk1n2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n291n29lusvneog.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n291n29lusvneog.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateFormatDeserializerTest.test_dateFormat_yyyy",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76561,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ipl1qk1n2p() throws Exception{try{__CLR4_5_21n291n29lusvneog.R.inc(76561);
        __CLR4_5_21n291n29lusvneog.R.inc(76562);VO vo = JSON.parseObject("{\"format\":\"yyyy\"}", VO.class);
        
        __CLR4_5_21n291n29lusvneog.R.inc(76563);SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy", JSON.defaultLocale);
        __CLR4_5_21n291n29lusvneog.R.inc(76564);dateFormat.setTimeZone(JSON.defaultTimeZone);
        __CLR4_5_21n291n29lusvneog.R.inc(76565);Assert.assertEquals(dateFormat, vo.getFormat());
    }finally{__CLR4_5_21n291n29lusvneog.R.flushNeeded();}}

    public void test_dateFormat_error() throws Exception {__CLR4_5_21n291n29lusvneog.R.globalSliceStart(getClass().getName(),76566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbu1dq1n2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n291n29lusvneog.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n291n29lusvneog.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateFormatDeserializerTest.test_dateFormat_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76566,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbu1dq1n2u() throws Exception{try{__CLR4_5_21n291n29lusvneog.R.inc(76566);
        __CLR4_5_21n291n29lusvneog.R.inc(76567);Exception error = null;
        __CLR4_5_21n291n29lusvneog.R.inc(76568);try {
            __CLR4_5_21n291n29lusvneog.R.inc(76569);JSON.parseObject("{\"format\":123}", VO.class);
        } catch (Exception e) {
            __CLR4_5_21n291n29lusvneog.R.inc(76570);error = e;
        }
        __CLR4_5_21n291n29lusvneog.R.inc(76571);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n291n29lusvneog.R.flushNeeded();}}

    public static class VO {

        private SimpleDateFormat format;

        public VO(){try{__CLR4_5_21n291n29lusvneog.R.inc(76572);

        }finally{__CLR4_5_21n291n29lusvneog.R.flushNeeded();}}

        public VO(SimpleDateFormat format){try{__CLR4_5_21n291n29lusvneog.R.inc(76573);
            __CLR4_5_21n291n29lusvneog.R.inc(76574);this.format = format;
        }finally{__CLR4_5_21n291n29lusvneog.R.flushNeeded();}}

        public SimpleDateFormat getFormat() {try{__CLR4_5_21n291n29lusvneog.R.inc(76575);
            __CLR4_5_21n291n29lusvneog.R.inc(76576);return format;
        }finally{__CLR4_5_21n291n29lusvneog.R.flushNeeded();}}

        public void setFormat(SimpleDateFormat format) {try{__CLR4_5_21n291n29lusvneog.R.inc(76577);
            __CLR4_5_21n291n29lusvneog.R.inc(76578);this.format = format;
        }finally{__CLR4_5_21n291n29lusvneog.R.flushNeeded();}}

    }
}
