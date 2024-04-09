/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.support.hsf;

import com.alibaba.fastjson.support.hsf.HSFJSONUtils;
import com.alibaba.fastjson.support.hsf.MethodLocator;
import junit.framework.TestCase;

import java.lang.reflect.Method;

public class HSFJSONUtilsTest_3 extends TestCase {static class __CLR4_1_101wkc1wkclusqkm1z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,88888,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_hsf() throws Exception {__CLR4_1_101wkc1wkclusqkm1z.R.globalSliceStart(getClass().getName(),88860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10uhfh0f1wkc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wkc1wkclusqkm1z.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wkc1wkclusqkm1z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_3.test_for_hsf",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88860,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10uhfh0f1wkc() throws Exception{try{__CLR4_1_101wkc1wkclusqkm1z.R.inc(88860);
        __CLR4_1_101wkc1wkclusqkm1z.R.inc(88861);final Method method = HSFJSONUtilsTest_3.class.getMethod("f", int.class, long.class);

        __CLR4_1_101wkc1wkclusqkm1z.R.inc(88862);String json = "[[1,2]]";

        __CLR4_1_101wkc1wkclusqkm1z.R.inc(88863);Object[] values = HSFJSONUtils.parseInvocationArguments(json, new MethodLocator() {

            public Method findMethod(String[] types) {try{__CLR4_1_101wkc1wkclusqkm1z.R.inc(88864);
                __CLR4_1_101wkc1wkclusqkm1z.R.inc(88865);return method;
            }finally{__CLR4_1_101wkc1wkclusqkm1z.R.flushNeeded();}}
        });

        __CLR4_1_101wkc1wkclusqkm1z.R.inc(88866);assertEquals(2, values.length);
        __CLR4_1_101wkc1wkclusqkm1z.R.inc(88867);assertEquals(1, values[0]);
        __CLR4_1_101wkc1wkclusqkm1z.R.inc(88868);assertEquals(2L, values[1]);
    }finally{__CLR4_1_101wkc1wkclusqkm1z.R.flushNeeded();}}

    public void test_for_hsf_1() throws Exception {__CLR4_1_101wkc1wkclusqkm1z.R.globalSliceStart(getClass().getName(),88869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yqeslt1wkl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wkc1wkclusqkm1z.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wkc1wkclusqkm1z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_3.test_for_hsf_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88869,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yqeslt1wkl() throws Exception{try{__CLR4_1_101wkc1wkclusqkm1z.R.inc(88869);
        __CLR4_1_101wkc1wkclusqkm1z.R.inc(88870);final Method method = HSFJSONUtilsTest_3.class.getMethod("f", int.class, long.class);

        __CLR4_1_101wkc1wkclusqkm1z.R.inc(88871);String json = "[\n" +
                "[1, 2]\n" +
                "]";

        __CLR4_1_101wkc1wkclusqkm1z.R.inc(88872);Object[] values = HSFJSONUtils.parseInvocationArguments(json, new MethodLocator() {

            public Method findMethod(String[] types) {try{__CLR4_1_101wkc1wkclusqkm1z.R.inc(88873);
                __CLR4_1_101wkc1wkclusqkm1z.R.inc(88874);return method;
            }finally{__CLR4_1_101wkc1wkclusqkm1z.R.flushNeeded();}}
        });

        __CLR4_1_101wkc1wkclusqkm1z.R.inc(88875);assertEquals(2, values.length);
        __CLR4_1_101wkc1wkclusqkm1z.R.inc(88876);assertEquals(1, values[0]);
        __CLR4_1_101wkc1wkclusqkm1z.R.inc(88877);assertEquals(2L, values[1]);
    }finally{__CLR4_1_101wkc1wkclusqkm1z.R.flushNeeded();}}

    public void test_for_hsf_2() throws Exception {__CLR4_1_101wkc1wkclusqkm1z.R.globalSliceStart(getClass().getName(),88878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10x1paku1wku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wkc1wkclusqkm1z.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wkc1wkclusqkm1z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_3.test_for_hsf_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88878,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10x1paku1wku() throws Exception{try{__CLR4_1_101wkc1wkclusqkm1z.R.inc(88878);
        __CLR4_1_101wkc1wkclusqkm1z.R.inc(88879);final Method method = HSFJSONUtilsTest_3.class.getMethod("f", int.class, long.class);

        __CLR4_1_101wkc1wkclusqkm1z.R.inc(88880);String json = "[[\"1\",\"2\"]]";

        __CLR4_1_101wkc1wkclusqkm1z.R.inc(88881);Object[] values = HSFJSONUtils.parseInvocationArguments(json, new MethodLocator() {

            public Method findMethod(String[] types) {try{__CLR4_1_101wkc1wkclusqkm1z.R.inc(88882);
                __CLR4_1_101wkc1wkclusqkm1z.R.inc(88883);return method;
            }finally{__CLR4_1_101wkc1wkclusqkm1z.R.flushNeeded();}}
        });

        __CLR4_1_101wkc1wkclusqkm1z.R.inc(88884);assertEquals(2, values.length);
        __CLR4_1_101wkc1wkclusqkm1z.R.inc(88885);assertEquals(1, values[0]);
        __CLR4_1_101wkc1wkclusqkm1z.R.inc(88886);assertEquals(2L, values[1]);
    }finally{__CLR4_1_101wkc1wkclusqkm1z.R.flushNeeded();}}

    public static void f(int a, long b) {try{__CLR4_1_101wkc1wkclusqkm1z.R.inc(88887);

    }finally{__CLR4_1_101wkc1wkclusqkm1z.R.flushNeeded();}}
}
