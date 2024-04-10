/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.support.hsf;

import com.alibaba.fastjson.support.hsf.HSFJSONUtils;
import com.alibaba.fastjson.support.hsf.MethodLocator;
import junit.framework.TestCase;

import java.lang.reflect.Method;

public class HSFJSONUtilsTest_3 extends TestCase {static class __CLR4_5_21wk11wk1lusyjvih{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,88877,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_hsf() throws Exception {__CLR4_5_21wk11wk1lusyjvih.R.globalSliceStart(getClass().getName(),88849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uhfh0f1wk1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wk11wk1lusyjvih.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wk11wk1lusyjvih.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_3.test_for_hsf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88849,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uhfh0f1wk1() throws Exception{try{__CLR4_5_21wk11wk1lusyjvih.R.inc(88849);
        __CLR4_5_21wk11wk1lusyjvih.R.inc(88850);final Method method = HSFJSONUtilsTest_3.class.getMethod("f", int.class, long.class);

        __CLR4_5_21wk11wk1lusyjvih.R.inc(88851);String json = "[[1,2]]";

        __CLR4_5_21wk11wk1lusyjvih.R.inc(88852);Object[] values = HSFJSONUtils.parseInvocationArguments(json, new MethodLocator() {

            public Method findMethod(String[] types) {try{__CLR4_5_21wk11wk1lusyjvih.R.inc(88853);
                __CLR4_5_21wk11wk1lusyjvih.R.inc(88854);return method;
            }finally{__CLR4_5_21wk11wk1lusyjvih.R.flushNeeded();}}
        });

        __CLR4_5_21wk11wk1lusyjvih.R.inc(88855);assertEquals(2, values.length);
        __CLR4_5_21wk11wk1lusyjvih.R.inc(88856);assertEquals(1, values[0]);
        __CLR4_5_21wk11wk1lusyjvih.R.inc(88857);assertEquals(2L, values[1]);
    }finally{__CLR4_5_21wk11wk1lusyjvih.R.flushNeeded();}}

    public void test_for_hsf_1() throws Exception {__CLR4_5_21wk11wk1lusyjvih.R.globalSliceStart(getClass().getName(),88858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yqeslt1wka();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wk11wk1lusyjvih.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wk11wk1lusyjvih.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_3.test_for_hsf_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88858,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yqeslt1wka() throws Exception{try{__CLR4_5_21wk11wk1lusyjvih.R.inc(88858);
        __CLR4_5_21wk11wk1lusyjvih.R.inc(88859);final Method method = HSFJSONUtilsTest_3.class.getMethod("f", int.class, long.class);

        __CLR4_5_21wk11wk1lusyjvih.R.inc(88860);String json = "[\n" +
                "[1, 2]\n" +
                "]";

        __CLR4_5_21wk11wk1lusyjvih.R.inc(88861);Object[] values = HSFJSONUtils.parseInvocationArguments(json, new MethodLocator() {

            public Method findMethod(String[] types) {try{__CLR4_5_21wk11wk1lusyjvih.R.inc(88862);
                __CLR4_5_21wk11wk1lusyjvih.R.inc(88863);return method;
            }finally{__CLR4_5_21wk11wk1lusyjvih.R.flushNeeded();}}
        });

        __CLR4_5_21wk11wk1lusyjvih.R.inc(88864);assertEquals(2, values.length);
        __CLR4_5_21wk11wk1lusyjvih.R.inc(88865);assertEquals(1, values[0]);
        __CLR4_5_21wk11wk1lusyjvih.R.inc(88866);assertEquals(2L, values[1]);
    }finally{__CLR4_5_21wk11wk1lusyjvih.R.flushNeeded();}}

    public void test_for_hsf_2() throws Exception {__CLR4_5_21wk11wk1lusyjvih.R.globalSliceStart(getClass().getName(),88867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x1paku1wkj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wk11wk1lusyjvih.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wk11wk1lusyjvih.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_3.test_for_hsf_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88867,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x1paku1wkj() throws Exception{try{__CLR4_5_21wk11wk1lusyjvih.R.inc(88867);
        __CLR4_5_21wk11wk1lusyjvih.R.inc(88868);final Method method = HSFJSONUtilsTest_3.class.getMethod("f", int.class, long.class);

        __CLR4_5_21wk11wk1lusyjvih.R.inc(88869);String json = "[[\"1\",\"2\"]]";

        __CLR4_5_21wk11wk1lusyjvih.R.inc(88870);Object[] values = HSFJSONUtils.parseInvocationArguments(json, new MethodLocator() {

            public Method findMethod(String[] types) {try{__CLR4_5_21wk11wk1lusyjvih.R.inc(88871);
                __CLR4_5_21wk11wk1lusyjvih.R.inc(88872);return method;
            }finally{__CLR4_5_21wk11wk1lusyjvih.R.flushNeeded();}}
        });

        __CLR4_5_21wk11wk1lusyjvih.R.inc(88873);assertEquals(2, values.length);
        __CLR4_5_21wk11wk1lusyjvih.R.inc(88874);assertEquals(1, values[0]);
        __CLR4_5_21wk11wk1lusyjvih.R.inc(88875);assertEquals(2L, values[1]);
    }finally{__CLR4_5_21wk11wk1lusyjvih.R.flushNeeded();}}

    public static void f(int a, long b) {try{__CLR4_5_21wk11wk1lusyjvih.R.inc(88876);

    }finally{__CLR4_5_21wk11wk1lusyjvih.R.flushNeeded();}}
}
