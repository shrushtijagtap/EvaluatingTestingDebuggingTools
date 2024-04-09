/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.support.hsf;

import com.alibaba.fastjson.support.hsf.HSFJSONUtils;
import com.alibaba.fastjson.support.hsf.MethodLocator;
import junit.framework.TestCase;

import java.lang.reflect.Method;
import java.util.List;

public class HSFJSONUtilsTest_1 extends TestCase {static class __CLR4_5_21xej1xejlusvnh98{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,90074,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Method method_f2;
    private Method method_f3;
    private Method method_f4;
    private Method method_f5;
    private MethodLocator methodLocator;

    protected void setUp() throws Exception {try{__CLR4_5_21xej1xejlusvnh98.R.inc(89947);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89948);method_f2 = Service.class.getMethod("f2", String.class, Model.class);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89949);method_f3 = Service.class.getMethod("f3", String.class, List.class);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89950);method_f4 = Service.class.getMethod("f3", String.class, Model[].class);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89951);method_f5 = Service.class.getMethod("f3", int.class, long.class);

        __CLR4_5_21xej1xejlusvnh98.R.inc(89952);methodLocator = new MethodLocator() {
            public Method findMethod(String[] types) {try{__CLR4_5_21xej1xejlusvnh98.R.inc(89953);
                __CLR4_5_21xej1xejlusvnh98.R.inc(89954);if ((((types == null || types.length == 0)&&(__CLR4_5_21xej1xejlusvnh98.R.iget(89955)!=0|true))||(__CLR4_5_21xej1xejlusvnh98.R.iget(89956)==0&false))) {{
                    __CLR4_5_21xej1xejlusvnh98.R.inc(89957);return null;
                }

                }__CLR4_5_21xej1xejlusvnh98.R.inc(89958);if ((((types[0].equals("int"))&&(__CLR4_5_21xej1xejlusvnh98.R.iget(89959)!=0|true))||(__CLR4_5_21xej1xejlusvnh98.R.iget(89960)==0&false))) {{
                    __CLR4_5_21xej1xejlusvnh98.R.inc(89961);return method_f5;
                }

                }__CLR4_5_21xej1xejlusvnh98.R.inc(89962);if ((((types[1].equals("java.util.List"))&&(__CLR4_5_21xej1xejlusvnh98.R.iget(89963)!=0|true))||(__CLR4_5_21xej1xejlusvnh98.R.iget(89964)==0&false))) {{
                    __CLR4_5_21xej1xejlusvnh98.R.inc(89965);return method_f3;
                }

                }__CLR4_5_21xej1xejlusvnh98.R.inc(89966);if ((((types[1].equals("com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model[]"))&&(__CLR4_5_21xej1xejlusvnh98.R.iget(89967)!=0|true))||(__CLR4_5_21xej1xejlusvnh98.R.iget(89968)==0&false))) {{
                    __CLR4_5_21xej1xejlusvnh98.R.inc(89969);return method_f4;
                }

                }__CLR4_5_21xej1xejlusvnh98.R.inc(89970);return method_f2;
            }finally{__CLR4_5_21xej1xejlusvnh98.R.flushNeeded();}}
        };
    }finally{__CLR4_5_21xej1xejlusvnh98.R.flushNeeded();}}

    public void test_invoke() throws Exception {__CLR4_5_21xej1xejlusvnh98.R.globalSliceStart(getClass().getName(),89971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iur6ac1xf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xej1xejlusvnh98.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xej1xejlusvnh98.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89971,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iur6ac1xf7() throws Exception{try{__CLR4_5_21xej1xejlusvnh98.R.inc(89971);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89972);String json = "{ \n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"],\n" +
                "    \"argsObjs\"   :   [ \"abc\", {\"value\":\"xxx\"} ]\n" +
                "}";
        __CLR4_5_21xej1xejlusvnh98.R.inc(89973);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89974);assertNotNull(values);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89975);assertEquals(2, values.length);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89976);assertEquals("abc", values[0]);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89977);assertEquals("xxx", ((Model) values[1]).value);
    }finally{__CLR4_5_21xej1xejlusvnh98.R.flushNeeded();}}

    public void test_invoke_type() throws Exception {__CLR4_5_21xej1xejlusvnh98.R.globalSliceStart(getClass().getName(),89978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bucxff1xfe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xej1xejlusvnh98.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xej1xejlusvnh98.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_type",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89978,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bucxff1xfe() throws Exception{try{__CLR4_5_21xej1xejlusvnh98.R.inc(89978);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89979);String json = "{\"@type\":\"com.alibaba.fastjson.JSONObject\", \n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"],\n" +
                "    \"argsObjs\"   :   [ \"abc\", {\"value\":\"xxx\"} ]\n" +
                "}";
        __CLR4_5_21xej1xejlusvnh98.R.inc(89980);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89981);assertNotNull(values);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89982);assertEquals(2, values.length);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89983);assertEquals("abc", values[0]);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89984);assertEquals("xxx", ((Model) values[1]).value);
    }finally{__CLR4_5_21xej1xejlusvnh98.R.flushNeeded();}}

    public void test_invoke_reverse() throws Exception {__CLR4_5_21xej1xejlusvnh98.R.globalSliceStart(getClass().getName(),89985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ygbmi71xfl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xej1xejlusvnh98.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xej1xejlusvnh98.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_reverse",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89985,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ygbmi71xfl() throws Exception{try{__CLR4_5_21xej1xejlusvnh98.R.inc(89985);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89986);String json = "{ \n" +
                "    \"argsObjs\"   :   [ \"abc\", {\"value\":\"xxx\"} ],\n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"]\n" +
                "}";
        __CLR4_5_21xej1xejlusvnh98.R.inc(89987);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89988);assertNotNull(values);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89989);assertEquals(2, values.length);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89990);assertEquals("abc", values[0]);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89991);assertEquals("xxx", ((Model) values[1]).value);
    }finally{__CLR4_5_21xej1xejlusvnh98.R.flushNeeded();}}

    public void test_invoke_reverse_list() throws Exception {__CLR4_5_21xej1xejlusvnh98.R.globalSliceStart(getClass().getName(),89992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26im37g1xfs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xej1xejlusvnh98.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xej1xejlusvnh98.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_reverse_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89992,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26im37g1xfs() throws Exception{try{__CLR4_5_21xej1xejlusvnh98.R.inc(89992);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89993);String json = "{ \n" +
                "    \"argsObjs\"   :   [ \"abc\", [{\"value\":\"xxx\"}] ],\n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"java.util.List\"]\n" +
                "}";
        __CLR4_5_21xej1xejlusvnh98.R.inc(89994);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89995);assertNotNull(values);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89996);assertEquals(2, values.length);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89997);assertEquals("abc", values[0]);
        __CLR4_5_21xej1xejlusvnh98.R.inc(89998);List list = (List) values[1];
        __CLR4_5_21xej1xejlusvnh98.R.inc(89999);assertEquals("xxx", ((Model) list.get(0)).value);
    }finally{__CLR4_5_21xej1xejlusvnh98.R.flushNeeded();}}

    public void test_invoke_reverse_array() throws Exception {__CLR4_5_21xej1xejlusvnh98.R.globalSliceStart(getClass().getName(),90000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26tdeq11xg0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xej1xejlusvnh98.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xej1xejlusvnh98.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_reverse_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90000,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26tdeq11xg0() throws Exception{try{__CLR4_5_21xej1xejlusvnh98.R.inc(90000);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90001);String json = "{ \n" +
                "    \"argsObjs\"   :   [ \"abc\", [{\"value\":\"xxx\"}] ],\n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model[]\"]\n" +
                "}";
        __CLR4_5_21xej1xejlusvnh98.R.inc(90002);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90003);assertNotNull(values);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90004);assertEquals(2, values.length);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90005);assertEquals("abc", values[0]);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90006);Model[] list = (Model[]) values[1];
        __CLR4_5_21xej1xejlusvnh98.R.inc(90007);assertEquals("xxx", ((Model) list[0]).value);
    }finally{__CLR4_5_21xej1xejlusvnh98.R.flushNeeded();}}

    public void test_invoke_array() throws Exception {__CLR4_5_21xej1xejlusvnh98.R.globalSliceStart(getClass().getName(),90008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ufwsai1xg8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xej1xejlusvnh98.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xej1xejlusvnh98.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90008,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ufwsai1xg8() throws Exception{try{__CLR4_5_21xej1xejlusvnh98.R.inc(90008);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90009);String json = "[ \n" +
                "   [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"],\n" +
                "    [ \"abc\", {\"value\":\"xxx\"} ]\n" +
                "]";
        __CLR4_5_21xej1xejlusvnh98.R.inc(90010);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90011);assertNotNull(values);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90012);assertEquals(2, values.length);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90013);assertEquals("abc", values[0]);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90014);assertEquals("xxx", ((Model) values[1]).value);
    }finally{__CLR4_5_21xej1xejlusvnh98.R.flushNeeded();}}

    public void test_invoke_array_2() throws Exception {__CLR4_5_21xej1xejlusvnh98.R.globalSliceStart(getClass().getName(),90015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hfzmmx1xgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xej1xejlusvnh98.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xej1xejlusvnh98.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_array_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90015,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hfzmmx1xgf() throws Exception{try{__CLR4_5_21xej1xejlusvnh98.R.inc(90015);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90016);String json = "[ \n" +
                "   [ \"java.lang.String\", \"java.util.List\"],\n" +
                "    [ \"abc\", [{\"value\":\"xxx\"}] ]\n" +
                "]";
        __CLR4_5_21xej1xejlusvnh98.R.inc(90017);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90018);assertNotNull(values);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90019);assertEquals(2, values.length);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90020);assertEquals("abc", values[0]);

        __CLR4_5_21xej1xejlusvnh98.R.inc(90021);List list = (List) values[1];
        __CLR4_5_21xej1xejlusvnh98.R.inc(90022);assertEquals("xxx", ((Model) list.get(0)).value);
    }finally{__CLR4_5_21xej1xejlusvnh98.R.flushNeeded();}}

    public void test_invoke_array_3() throws Exception {__CLR4_5_21xej1xejlusvnh98.R.globalSliceStart(getClass().getName(),90023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kozlfe1xgn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xej1xejlusvnh98.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xej1xejlusvnh98.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_array_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90023,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kozlfe1xgn() throws Exception{try{__CLR4_5_21xej1xejlusvnh98.R.inc(90023);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90024);String json = "[ \n" +
                "   [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model[]\"],\n" +
                "    [ \"abc\", [{\"value\":\"xxx\"}] ]\n" +
                "]";
        __CLR4_5_21xej1xejlusvnh98.R.inc(90025);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90026);assertNotNull(values);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90027);assertEquals(2, values.length);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90028);assertEquals("abc", values[0]);

        __CLR4_5_21xej1xejlusvnh98.R.inc(90029);Model[] list = (Model[]) values[1];
        __CLR4_5_21xej1xejlusvnh98.R.inc(90030);assertEquals("xxx", ((Model) list[0]).value);
    }finally{__CLR4_5_21xej1xejlusvnh98.R.flushNeeded();}}

    public void test_invoke_int() throws Exception {__CLR4_5_21xej1xejlusvnh98.R.globalSliceStart(getClass().getName(),90031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cn1eqs1xgv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xej1xejlusvnh98.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xej1xejlusvnh98.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90031,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cn1eqs1xgv() throws Exception{try{__CLR4_5_21xej1xejlusvnh98.R.inc(90031);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90032);String json = "[ \n" +
                "   [ \"int\", \"long\"],\n" +
                "    [ 3,4 ]\n" +
                "]";
        __CLR4_5_21xej1xejlusvnh98.R.inc(90033);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90034);assertNotNull(values);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90035);assertEquals(2, values.length);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90036);assertEquals(3, ((Integer)values[0]).intValue());
        __CLR4_5_21xej1xejlusvnh98.R.inc(90037);assertEquals(4L, ((Long)values[1]).longValue());
    }finally{__CLR4_5_21xej1xejlusvnh98.R.flushNeeded();}}

    public void test_invoke_int_obj_reverse() throws Exception {__CLR4_5_21xej1xejlusvnh98.R.globalSliceStart(getClass().getName(),90038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m3rgmh1xh2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xej1xejlusvnh98.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xej1xejlusvnh98.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_int_obj_reverse",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90038,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m3rgmh1xh2() throws Exception{try{__CLR4_5_21xej1xejlusvnh98.R.inc(90038);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90039);String json = "{ \n" +
                "    \"argsObjs\"   :   [ 3, 4],\n" +
                "    \"argsTypes\"  :  [ \"int\", \"long\"]\n" +
                "}";
        __CLR4_5_21xej1xejlusvnh98.R.inc(90040);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90041);assertNotNull(values);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90042);assertEquals(2, values.length);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90043);assertEquals(3, ((Integer)values[0]).intValue());
        __CLR4_5_21xej1xejlusvnh98.R.inc(90044);assertEquals(4L, ((Long)values[1]).longValue());
    }finally{__CLR4_5_21xej1xejlusvnh98.R.flushNeeded();}}

    public void test_invoke_int_obj() throws Exception {__CLR4_5_21xej1xejlusvnh98.R.globalSliceStart(getClass().getName(),90045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cz84rw1xh9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xej1xejlusvnh98.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xej1xejlusvnh98.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_int_obj",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90045,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cz84rw1xh9() throws Exception{try{__CLR4_5_21xej1xejlusvnh98.R.inc(90045);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90046);String json = "{ \n" +
                "    \"argsTypes\"  :  [ \"int\", \"long\"],\n" +
                "    \"argsObjs\"   :   [ 3, 4 ]\n" +
                "}";
        __CLR4_5_21xej1xejlusvnh98.R.inc(90047);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90048);assertNotNull(values);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90049);assertEquals(2, values.length);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90050);assertEquals(3, ((Integer)values[0]).intValue());
        __CLR4_5_21xej1xejlusvnh98.R.inc(90051);assertEquals(4L, ((Long)values[1]).longValue());
    }finally{__CLR4_5_21xej1xejlusvnh98.R.flushNeeded();}}

    public void test_invoke_int_obj_2() throws Exception {__CLR4_5_21xej1xejlusvnh98.R.globalSliceStart(getClass().getName(),90052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yhllp51xhg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xej1xejlusvnh98.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xej1xejlusvnh98.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_int_obj_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90052,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yhllp51xhg() throws Exception{try{__CLR4_5_21xej1xejlusvnh98.R.inc(90052);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90053);String json = "{ \n" +
                "    \"argsObjs\"   :   [ 3, 4 ]\n" +
                "}";
        __CLR4_5_21xej1xejlusvnh98.R.inc(90054);Object[] values = HSFJSONUtils.parseInvocationArguments(json,  new MethodLocator() {

            public Method findMethod(String[] types) {try{__CLR4_5_21xej1xejlusvnh98.R.inc(90055);
                __CLR4_5_21xej1xejlusvnh98.R.inc(90056);return method_f5;
            }finally{__CLR4_5_21xej1xejlusvnh98.R.flushNeeded();}}
        });
        __CLR4_5_21xej1xejlusvnh98.R.inc(90057);assertNotNull(values);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90058);assertEquals(2, values.length);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90059);assertEquals(3, ((Integer)values[0]).intValue());
        __CLR4_5_21xej1xejlusvnh98.R.inc(90060);assertEquals(4L, ((Long)values[1]).longValue());
    }finally{__CLR4_5_21xej1xejlusvnh98.R.flushNeeded();}}

    public void test_invoke_int_2() throws Exception {__CLR4_5_21xej1xejlusvnh98.R.globalSliceStart(getClass().getName(),90061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26pf2271xhp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xej1xejlusvnh98.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xej1xejlusvnh98.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_int_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90061,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26pf2271xhp() throws Exception{try{__CLR4_5_21xej1xejlusvnh98.R.inc(90061);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90062);String json = "[ \n" +
                "    null, [ 3,4 ]\n" +
                "]";
        __CLR4_5_21xej1xejlusvnh98.R.inc(90063);Object[] values = HSFJSONUtils.parseInvocationArguments(json, new MethodLocator() {

            public Method findMethod(String[] types) {try{__CLR4_5_21xej1xejlusvnh98.R.inc(90064);
                __CLR4_5_21xej1xejlusvnh98.R.inc(90065);return method_f5;
            }finally{__CLR4_5_21xej1xejlusvnh98.R.flushNeeded();}}
        });
        __CLR4_5_21xej1xejlusvnh98.R.inc(90066);assertNotNull(values);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90067);assertEquals(2, values.length);
        __CLR4_5_21xej1xejlusvnh98.R.inc(90068);assertEquals(3, ((Integer)values[0]).intValue());
        __CLR4_5_21xej1xejlusvnh98.R.inc(90069);assertEquals(4L, ((Long)values[1]).longValue());
    }finally{__CLR4_5_21xej1xejlusvnh98.R.flushNeeded();}}
//
    public static class Service {
        public void f2(String name, Model model) {try{__CLR4_5_21xej1xejlusvnh98.R.inc(90070);

        }finally{__CLR4_5_21xej1xejlusvnh98.R.flushNeeded();}}

        public void f3(String name, List<Model> models) {try{__CLR4_5_21xej1xejlusvnh98.R.inc(90071);

        }finally{__CLR4_5_21xej1xejlusvnh98.R.flushNeeded();}}

        public void f3(String name, Model[] models) {try{__CLR4_5_21xej1xejlusvnh98.R.inc(90072);

        }finally{__CLR4_5_21xej1xejlusvnh98.R.flushNeeded();}}

        public void f3(int a, long b) {try{__CLR4_5_21xej1xejlusvnh98.R.inc(90073);

        }finally{__CLR4_5_21xej1xejlusvnh98.R.flushNeeded();}}
    }

    public static class Model {
        public String value;
    }

    public static class User {
        public String name;
        public int id;
        public int age;
    }
}
