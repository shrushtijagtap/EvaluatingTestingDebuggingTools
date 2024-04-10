/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.date;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class DateFormatDeserializerTest extends TestCase {static class __CLR4_5_21m411m41lusyju9n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,75347,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_21m411m41lusyju9n.R.inc(75313);
        __CLR4_5_21m411m41lusyju9n.R.inc(75314);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_21m411m41lusyju9n.R.inc(75315);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_5_21m411m41lusyju9n.R.flushNeeded();}}
    
    public void test_dateFormat_empty() throws Exception {__CLR4_5_21m411m41lusyju9n.R.globalSliceStart(getClass().getName(),75316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m1hpeh1m44();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21m411m41lusyju9n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21m411m41lusyju9n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateFormatDeserializerTest.test_dateFormat_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75316,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m1hpeh1m44() throws Exception{try{__CLR4_5_21m411m41lusyju9n.R.inc(75316);
        __CLR4_5_21m411m41lusyju9n.R.inc(75317);VO vo = JSON.parseObject("{\"format\":\"\"}", VO.class);
        __CLR4_5_21m411m41lusyju9n.R.inc(75318);Assert.assertEquals(null, vo.getFormat());
    }finally{__CLR4_5_21m411m41lusyju9n.R.flushNeeded();}}
    
    public void test_dateFormat_array() throws Exception {__CLR4_5_21m411m41lusyju9n.R.globalSliceStart(getClass().getName(),75319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vw63pp1m47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21m411m41lusyju9n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21m411m41lusyju9n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateFormatDeserializerTest.test_dateFormat_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75319,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vw63pp1m47() throws Exception{try{__CLR4_5_21m411m41lusyju9n.R.inc(75319);
        __CLR4_5_21m411m41lusyju9n.R.inc(75320);List<SimpleDateFormat> list = JSON.parseArray("[\"\",null,\"yyyy\"]", SimpleDateFormat.class);
        __CLR4_5_21m411m41lusyju9n.R.inc(75321);Assert.assertEquals(null, list.get(0));
        __CLR4_5_21m411m41lusyju9n.R.inc(75322);Assert.assertEquals(null, list.get(1));
        
        __CLR4_5_21m411m41lusyju9n.R.inc(75323);SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy", JSON.defaultLocale);
        __CLR4_5_21m411m41lusyju9n.R.inc(75324);dateFormat.setTimeZone(JSON.defaultTimeZone);
        __CLR4_5_21m411m41lusyju9n.R.inc(75325);Assert.assertEquals(dateFormat, list.get(2));
    }finally{__CLR4_5_21m411m41lusyju9n.R.flushNeeded();}}

    public void test_dateFormat_null() throws Exception {__CLR4_5_21m411m41lusyju9n.R.globalSliceStart(getClass().getName(),75326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_252xowr1m4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21m411m41lusyju9n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21m411m41lusyju9n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateFormatDeserializerTest.test_dateFormat_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75326,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_252xowr1m4e() throws Exception{try{__CLR4_5_21m411m41lusyju9n.R.inc(75326);
        __CLR4_5_21m411m41lusyju9n.R.inc(75327);VO vo = JSON.parseObject("{\"format\":null}", VO.class);
        __CLR4_5_21m411m41lusyju9n.R.inc(75328);Assert.assertEquals(null, vo.getFormat());
    }finally{__CLR4_5_21m411m41lusyju9n.R.flushNeeded();}}

    public void test_dateFormat_yyyy() throws Exception {__CLR4_5_21m411m41lusyju9n.R.globalSliceStart(getClass().getName(),75329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ipl1qk1m4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21m411m41lusyju9n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21m411m41lusyju9n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateFormatDeserializerTest.test_dateFormat_yyyy",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75329,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ipl1qk1m4h() throws Exception{try{__CLR4_5_21m411m41lusyju9n.R.inc(75329);
        __CLR4_5_21m411m41lusyju9n.R.inc(75330);VO vo = JSON.parseObject("{\"format\":\"yyyy\"}", VO.class);
        
        __CLR4_5_21m411m41lusyju9n.R.inc(75331);SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy", JSON.defaultLocale);
        __CLR4_5_21m411m41lusyju9n.R.inc(75332);dateFormat.setTimeZone(JSON.defaultTimeZone);
        __CLR4_5_21m411m41lusyju9n.R.inc(75333);Assert.assertEquals(dateFormat, vo.getFormat());
    }finally{__CLR4_5_21m411m41lusyju9n.R.flushNeeded();}}

    public void test_dateFormat_error() throws Exception {__CLR4_5_21m411m41lusyju9n.R.globalSliceStart(getClass().getName(),75334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbu1dq1m4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21m411m41lusyju9n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21m411m41lusyju9n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateFormatDeserializerTest.test_dateFormat_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75334,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbu1dq1m4m() throws Exception{try{__CLR4_5_21m411m41lusyju9n.R.inc(75334);
        __CLR4_5_21m411m41lusyju9n.R.inc(75335);Exception error = null;
        __CLR4_5_21m411m41lusyju9n.R.inc(75336);try {
            __CLR4_5_21m411m41lusyju9n.R.inc(75337);JSON.parseObject("{\"format\":123}", VO.class);
        } catch (Exception e) {
            __CLR4_5_21m411m41lusyju9n.R.inc(75338);error = e;
        }
        __CLR4_5_21m411m41lusyju9n.R.inc(75339);Assert.assertNotNull(error);
    }finally{__CLR4_5_21m411m41lusyju9n.R.flushNeeded();}}

    public static class VO {

        private SimpleDateFormat format;

        public VO(){try{__CLR4_5_21m411m41lusyju9n.R.inc(75340);

        }finally{__CLR4_5_21m411m41lusyju9n.R.flushNeeded();}}

        public VO(SimpleDateFormat format){try{__CLR4_5_21m411m41lusyju9n.R.inc(75341);
            __CLR4_5_21m411m41lusyju9n.R.inc(75342);this.format = format;
        }finally{__CLR4_5_21m411m41lusyju9n.R.flushNeeded();}}

        public SimpleDateFormat getFormat() {try{__CLR4_5_21m411m41lusyju9n.R.inc(75343);
            __CLR4_5_21m411m41lusyju9n.R.inc(75344);return format;
        }finally{__CLR4_5_21m411m41lusyju9n.R.flushNeeded();}}

        public void setFormat(SimpleDateFormat format) {try{__CLR4_5_21m411m41lusyju9n.R.inc(75345);
            __CLR4_5_21m411m41lusyju9n.R.inc(75346);this.format = format;
        }finally{__CLR4_5_21m411m41lusyju9n.R.flushNeeded();}}

    }
}
