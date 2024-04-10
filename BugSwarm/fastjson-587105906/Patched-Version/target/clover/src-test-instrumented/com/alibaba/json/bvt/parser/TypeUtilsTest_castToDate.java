/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.util.TypeUtils;

public class TypeUtilsTest_castToDate extends TestCase {static class __CLR4_5_21ixt1ixtlusyjtuw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,71221,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_21ixt1ixtlusyjtuw.R.inc(71201);
        __CLR4_5_21ixt1ixtlusyjtuw.R.inc(71202);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_21ixt1ixtlusyjtuw.R.inc(71203);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_5_21ixt1ixtlusyjtuw.R.flushNeeded();}}
    
    public void test_castToDate() throws Exception {__CLR4_5_21ixt1ixtlusyjtuw.R.globalSliceStart(getClass().getName(),71204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pzfmhw1ixw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ixt1ixtlusyjtuw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ixt1ixtlusyjtuw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToDate.test_castToDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71204,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pzfmhw1ixw() throws Exception{try{__CLR4_5_21ixt1ixtlusyjtuw.R.inc(71204);
        __CLR4_5_21ixt1ixtlusyjtuw.R.inc(71205);JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
        __CLR4_5_21ixt1ixtlusyjtuw.R.inc(71206);Date date = TypeUtils.castToDate("2012-07-15 12:12:11");
        
        __CLR4_5_21ixt1ixtlusyjtuw.R.inc(71207);SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        __CLR4_5_21ixt1ixtlusyjtuw.R.inc(71208);format.setTimeZone(JSON.defaultTimeZone);
        __CLR4_5_21ixt1ixtlusyjtuw.R.inc(71209);Assert.assertEquals(format.parseObject("2012-07-15 12:12:11"), date);
        __CLR4_5_21ixt1ixtlusyjtuw.R.inc(71210);JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    }finally{__CLR4_5_21ixt1ixtlusyjtuw.R.flushNeeded();}}

    public void test_castToDate_error() throws Exception {__CLR4_5_21ixt1ixtlusyjtuw.R.globalSliceStart(getClass().getName(),71211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ds2zk51iy3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ixt1ixtlusyjtuw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ixt1ixtlusyjtuw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToDate.test_castToDate_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71211,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ds2zk51iy3() throws Exception{try{__CLR4_5_21ixt1ixtlusyjtuw.R.inc(71211);
        __CLR4_5_21ixt1ixtlusyjtuw.R.inc(71212);Exception error = null;
        __CLR4_5_21ixt1ixtlusyjtuw.R.inc(71213);try {
            __CLR4_5_21ixt1ixtlusyjtuw.R.inc(71214);TypeUtils.castToDate("\u4f60\u5988\u4f60\u5988-MM-dd");
        } catch (Exception ex) {
            __CLR4_5_21ixt1ixtlusyjtuw.R.inc(71215);error = ex;
        }
        __CLR4_5_21ixt1ixtlusyjtuw.R.inc(71216);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ixt1ixtlusyjtuw.R.flushNeeded();}}

    public void test_castToDate_zero() throws Exception {__CLR4_5_21ixt1ixtlusyjtuw.R.globalSliceStart(getClass().getName(),71217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hrij2f1iy9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ixt1ixtlusyjtuw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ixt1ixtlusyjtuw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToDate.test_castToDate_zero",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71217,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hrij2f1iy9() throws Exception{try{__CLR4_5_21ixt1ixtlusyjtuw.R.inc(71217);
        __CLR4_5_21ixt1ixtlusyjtuw.R.inc(71218);Assert.assertEquals(new Date(0), TypeUtils.castToDate("0"));
    }finally{__CLR4_5_21ixt1ixtlusyjtuw.R.flushNeeded();}}

    public void test_castToDate_negative() throws Exception {__CLR4_5_21ixt1ixtlusyjtuw.R.globalSliceStart(getClass().getName(),71219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eu1o2i1iyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ixt1ixtlusyjtuw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ixt1ixtlusyjtuw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToDate.test_castToDate_negative",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71219,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eu1o2i1iyb() throws Exception{try{__CLR4_5_21ixt1ixtlusyjtuw.R.inc(71219);
        __CLR4_5_21ixt1ixtlusyjtuw.R.inc(71220);Assert.assertEquals(new Date(-1), TypeUtils.castToDate(-1));
    }finally{__CLR4_5_21ixt1ixtlusyjtuw.R.flushNeeded();}}

}
