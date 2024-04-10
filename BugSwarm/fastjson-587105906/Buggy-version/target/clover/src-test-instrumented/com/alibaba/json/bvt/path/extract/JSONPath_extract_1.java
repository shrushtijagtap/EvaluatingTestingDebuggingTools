/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path.extract;

import com.alibaba.fastjson.JSONPath;
import junit.framework.TestCase;

import java.net.InetSocketAddress;

public class JSONPath_extract_1 extends TestCase {static class __CLR4_1_101qwp1qwpluszwepd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,81551,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_1_101qwp1qwpluszwepd.R.globalSliceStart(getClass().getName(),81529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21qwp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qwp1qwpluszwepd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qwp1qwpluszwepd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_1.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81529,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21qwp() throws Exception{try{__CLR4_1_101qwp1qwpluszwepd.R.inc(81529);
        __CLR4_1_101qwp1qwpluszwepd.R.inc(81530);String json = "[{\"id\":1001},{\"id\":1002},{\"id\":1003},[1],123,-4,\"a\\\"bc\"]";

        __CLR4_1_101qwp1qwpluszwepd.R.inc(81531);assertEquals("{\"id\":1001}"
                , JSONPath.extract(json, "$.0")
                    .toString());

        __CLR4_1_101qwp1qwpluszwepd.R.inc(81532);assertEquals("{\"id\":1002}"
                , JSONPath.extract(json, "$.1")
                        .toString());


        __CLR4_1_101qwp1qwpluszwepd.R.inc(81533);assertEquals("{\"id\":1003}"
                , JSONPath.extract(json, "$.2")
                        .toString());

        __CLR4_1_101qwp1qwpluszwepd.R.inc(81534);assertEquals("[1]"
                , JSONPath.extract(json, "$.3")
                        .toString());

        __CLR4_1_101qwp1qwpluszwepd.R.inc(81535);assertEquals("123"
                , JSONPath.extract(json, "$.4")
                        .toString());

        __CLR4_1_101qwp1qwpluszwepd.R.inc(81536);assertEquals("-4"
                , JSONPath.extract(json, "$.5")
                        .toString());

        __CLR4_1_101qwp1qwpluszwepd.R.inc(81537);assertEquals("a\"bc"
                , JSONPath.extract(json, "$.6")
                        .toString());
    }finally{__CLR4_1_101qwp1qwpluszwepd.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101qwp1qwpluszwepd.R.globalSliceStart(getClass().getName(),81538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1qwy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qwp1qwpluszwepd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qwp1qwpluszwepd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_1.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81538,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1qwy() throws Exception{try{__CLR4_1_101qwp1qwpluszwepd.R.inc(81538);
        __CLR4_1_101qwp1qwpluszwepd.R.inc(81539);String json = "[\"a\\\"bc\",123]";

        __CLR4_1_101qwp1qwpluszwepd.R.inc(81540);assertEquals("a\"bc"
                , JSONPath.extract(json, "$.0")
                        .toString());

        __CLR4_1_101qwp1qwpluszwepd.R.inc(81541);assertEquals("123"
                , JSONPath.extract(json, "$.1")
                        .toString());
    }finally{__CLR4_1_101qwp1qwpluszwepd.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101qwp1qwpluszwepd.R.globalSliceStart(getClass().getName(),81542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441qx2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qwp1qwpluszwepd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qwp1qwpluszwepd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_1.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81542,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441qx2() throws Exception{try{__CLR4_1_101qwp1qwpluszwepd.R.inc(81542);
        __CLR4_1_101qwp1qwpluszwepd.R.inc(81543);String json = "[\"a\\\\bc\",123]";

        __CLR4_1_101qwp1qwpluszwepd.R.inc(81544);assertEquals("a\\bc"
                , JSONPath.extract(json, "$.0")
                        .toString());

        __CLR4_1_101qwp1qwpluszwepd.R.inc(81545);assertEquals("123"
                , JSONPath.extract(json, "$.1")
                        .toString());
    }finally{__CLR4_1_101qwp1qwpluszwepd.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101qwp1qwpluszwepd.R.globalSliceStart(getClass().getName(),81546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1qx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qwp1qwpluszwepd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qwp1qwpluszwepd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_1.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81546,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1qx6() throws Exception{try{__CLR4_1_101qwp1qwpluszwepd.R.inc(81546);
        __CLR4_1_101qwp1qwpluszwepd.R.inc(81547);String json = "[\"a\\\"b\\\\c\\\"d\\\"e\",123]";

        __CLR4_1_101qwp1qwpluszwepd.R.inc(81548);assertEquals("a\"b\\c\"d\"e"
                , JSONPath.extract(json, "$.0")
                        .toString());

        __CLR4_1_101qwp1qwpluszwepd.R.inc(81549);assertEquals("123"
                , JSONPath.extract(json, "$.1")
                        .toString());

        __CLR4_1_101qwp1qwpluszwepd.R.inc(81550);assertNull(JSONPath.extract(json, "$.2"));
    }finally{__CLR4_1_101qwp1qwpluszwepd.R.flushNeeded();}}
}
