/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.support.hsf;

import com.alibaba.fastjson.support.hsf.HSFJSONUtils;
import com.alibaba.fastjson.support.hsf.MethodLocator;
import junit.framework.TestCase;

import java.lang.reflect.Method;
import java.util.List;

public class HSFJSONUtilsTest_1 extends TestCase {static class __CLR4_1_101xeu1xeuluszwfqn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,90085,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Method method_f2;
    private Method method_f3;
    private Method method_f4;
    private Method method_f5;
    private MethodLocator methodLocator;

    protected void setUp() throws Exception {try{__CLR4_1_101xeu1xeuluszwfqn.R.inc(89958);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(89959);method_f2 = Service.class.getMethod("f2", String.class, Model.class);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(89960);method_f3 = Service.class.getMethod("f3", String.class, List.class);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(89961);method_f4 = Service.class.getMethod("f3", String.class, Model[].class);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(89962);method_f5 = Service.class.getMethod("f3", int.class, long.class);

        __CLR4_1_101xeu1xeuluszwfqn.R.inc(89963);methodLocator = new MethodLocator() {
            public Method findMethod(String[] types) {try{__CLR4_1_101xeu1xeuluszwfqn.R.inc(89964);
                __CLR4_1_101xeu1xeuluszwfqn.R.inc(89965);if ((((types == null || types.length == 0)&&(__CLR4_1_101xeu1xeuluszwfqn.R.iget(89966)!=0|true))||(__CLR4_1_101xeu1xeuluszwfqn.R.iget(89967)==0&false))) {{
                    __CLR4_1_101xeu1xeuluszwfqn.R.inc(89968);return null;
                }

                }__CLR4_1_101xeu1xeuluszwfqn.R.inc(89969);if ((((types[0].equals("int"))&&(__CLR4_1_101xeu1xeuluszwfqn.R.iget(89970)!=0|true))||(__CLR4_1_101xeu1xeuluszwfqn.R.iget(89971)==0&false))) {{
                    __CLR4_1_101xeu1xeuluszwfqn.R.inc(89972);return method_f5;
                }

                }__CLR4_1_101xeu1xeuluszwfqn.R.inc(89973);if ((((types[1].equals("java.util.List"))&&(__CLR4_1_101xeu1xeuluszwfqn.R.iget(89974)!=0|true))||(__CLR4_1_101xeu1xeuluszwfqn.R.iget(89975)==0&false))) {{
                    __CLR4_1_101xeu1xeuluszwfqn.R.inc(89976);return method_f3;
                }

                }__CLR4_1_101xeu1xeuluszwfqn.R.inc(89977);if ((((types[1].equals("com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model[]"))&&(__CLR4_1_101xeu1xeuluszwfqn.R.iget(89978)!=0|true))||(__CLR4_1_101xeu1xeuluszwfqn.R.iget(89979)==0&false))) {{
                    __CLR4_1_101xeu1xeuluszwfqn.R.inc(89980);return method_f4;
                }

                }__CLR4_1_101xeu1xeuluszwfqn.R.inc(89981);return method_f2;
            }finally{__CLR4_1_101xeu1xeuluszwfqn.R.flushNeeded();}}
        };
    }finally{__CLR4_1_101xeu1xeuluszwfqn.R.flushNeeded();}}

    public void test_invoke() throws Exception {__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceStart(getClass().getName(),89982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10iur6ac1xfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xeu1xeuluszwfqn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89982,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10iur6ac1xfi() throws Exception{try{__CLR4_1_101xeu1xeuluszwfqn.R.inc(89982);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(89983);String json = "{ \n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"],\n" +
                "    \"argsObjs\"   :   [ \"abc\", {\"value\":\"xxx\"} ]\n" +
                "}";
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(89984);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(89985);assertNotNull(values);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(89986);assertEquals(2, values.length);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(89987);assertEquals("abc", values[0]);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(89988);assertEquals("xxx", ((Model) values[1]).value);
    }finally{__CLR4_1_101xeu1xeuluszwfqn.R.flushNeeded();}}

    public void test_invoke_type() throws Exception {__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceStart(getClass().getName(),89989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bucxff1xfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xeu1xeuluszwfqn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_type",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89989,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bucxff1xfp() throws Exception{try{__CLR4_1_101xeu1xeuluszwfqn.R.inc(89989);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(89990);String json = "{\"@type\":\"com.alibaba.fastjson.JSONObject\", \n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"],\n" +
                "    \"argsObjs\"   :   [ \"abc\", {\"value\":\"xxx\"} ]\n" +
                "}";
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(89991);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(89992);assertNotNull(values);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(89993);assertEquals(2, values.length);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(89994);assertEquals("abc", values[0]);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(89995);assertEquals("xxx", ((Model) values[1]).value);
    }finally{__CLR4_1_101xeu1xeuluszwfqn.R.flushNeeded();}}

    public void test_invoke_reverse() throws Exception {__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceStart(getClass().getName(),89996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ygbmi71xfw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xeu1xeuluszwfqn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_reverse",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89996,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ygbmi71xfw() throws Exception{try{__CLR4_1_101xeu1xeuluszwfqn.R.inc(89996);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(89997);String json = "{ \n" +
                "    \"argsObjs\"   :   [ \"abc\", {\"value\":\"xxx\"} ],\n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"]\n" +
                "}";
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(89998);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(89999);assertNotNull(values);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90000);assertEquals(2, values.length);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90001);assertEquals("abc", values[0]);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90002);assertEquals("xxx", ((Model) values[1]).value);
    }finally{__CLR4_1_101xeu1xeuluszwfqn.R.flushNeeded();}}

    public void test_invoke_reverse_list() throws Exception {__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceStart(getClass().getName(),90003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106im37g1xg3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xeu1xeuluszwfqn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_reverse_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90003,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106im37g1xg3() throws Exception{try{__CLR4_1_101xeu1xeuluszwfqn.R.inc(90003);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90004);String json = "{ \n" +
                "    \"argsObjs\"   :   [ \"abc\", [{\"value\":\"xxx\"}] ],\n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"java.util.List\"]\n" +
                "}";
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90005);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90006);assertNotNull(values);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90007);assertEquals(2, values.length);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90008);assertEquals("abc", values[0]);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90009);List list = (List) values[1];
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90010);assertEquals("xxx", ((Model) list.get(0)).value);
    }finally{__CLR4_1_101xeu1xeuluszwfqn.R.flushNeeded();}}

    public void test_invoke_reverse_array() throws Exception {__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceStart(getClass().getName(),90011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106tdeq11xgb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xeu1xeuluszwfqn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_reverse_array",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90011,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106tdeq11xgb() throws Exception{try{__CLR4_1_101xeu1xeuluszwfqn.R.inc(90011);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90012);String json = "{ \n" +
                "    \"argsObjs\"   :   [ \"abc\", [{\"value\":\"xxx\"}] ],\n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model[]\"]\n" +
                "}";
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90013);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90014);assertNotNull(values);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90015);assertEquals(2, values.length);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90016);assertEquals("abc", values[0]);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90017);Model[] list = (Model[]) values[1];
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90018);assertEquals("xxx", ((Model) list[0]).value);
    }finally{__CLR4_1_101xeu1xeuluszwfqn.R.flushNeeded();}}

    public void test_invoke_array() throws Exception {__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceStart(getClass().getName(),90019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ufwsai1xgj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xeu1xeuluszwfqn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_array",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90019,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ufwsai1xgj() throws Exception{try{__CLR4_1_101xeu1xeuluszwfqn.R.inc(90019);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90020);String json = "[ \n" +
                "   [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"],\n" +
                "    [ \"abc\", {\"value\":\"xxx\"} ]\n" +
                "]";
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90021);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90022);assertNotNull(values);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90023);assertEquals(2, values.length);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90024);assertEquals("abc", values[0]);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90025);assertEquals("xxx", ((Model) values[1]).value);
    }finally{__CLR4_1_101xeu1xeuluszwfqn.R.flushNeeded();}}

    public void test_invoke_array_2() throws Exception {__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceStart(getClass().getName(),90026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hfzmmx1xgq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xeu1xeuluszwfqn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_array_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90026,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hfzmmx1xgq() throws Exception{try{__CLR4_1_101xeu1xeuluszwfqn.R.inc(90026);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90027);String json = "[ \n" +
                "   [ \"java.lang.String\", \"java.util.List\"],\n" +
                "    [ \"abc\", [{\"value\":\"xxx\"}] ]\n" +
                "]";
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90028);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90029);assertNotNull(values);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90030);assertEquals(2, values.length);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90031);assertEquals("abc", values[0]);

        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90032);List list = (List) values[1];
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90033);assertEquals("xxx", ((Model) list.get(0)).value);
    }finally{__CLR4_1_101xeu1xeuluszwfqn.R.flushNeeded();}}

    public void test_invoke_array_3() throws Exception {__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceStart(getClass().getName(),90034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kozlfe1xgy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xeu1xeuluszwfqn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_array_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90034,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kozlfe1xgy() throws Exception{try{__CLR4_1_101xeu1xeuluszwfqn.R.inc(90034);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90035);String json = "[ \n" +
                "   [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model[]\"],\n" +
                "    [ \"abc\", [{\"value\":\"xxx\"}] ]\n" +
                "]";
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90036);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90037);assertNotNull(values);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90038);assertEquals(2, values.length);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90039);assertEquals("abc", values[0]);

        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90040);Model[] list = (Model[]) values[1];
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90041);assertEquals("xxx", ((Model) list[0]).value);
    }finally{__CLR4_1_101xeu1xeuluszwfqn.R.flushNeeded();}}

    public void test_invoke_int() throws Exception {__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceStart(getClass().getName(),90042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10cn1eqs1xh6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xeu1xeuluszwfqn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_int",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90042,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10cn1eqs1xh6() throws Exception{try{__CLR4_1_101xeu1xeuluszwfqn.R.inc(90042);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90043);String json = "[ \n" +
                "   [ \"int\", \"long\"],\n" +
                "    [ 3,4 ]\n" +
                "]";
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90044);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90045);assertNotNull(values);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90046);assertEquals(2, values.length);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90047);assertEquals(3, ((Integer)values[0]).intValue());
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90048);assertEquals(4L, ((Long)values[1]).longValue());
    }finally{__CLR4_1_101xeu1xeuluszwfqn.R.flushNeeded();}}

    public void test_invoke_int_obj_reverse() throws Exception {__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceStart(getClass().getName(),90049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m3rgmh1xhd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xeu1xeuluszwfqn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_int_obj_reverse",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90049,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m3rgmh1xhd() throws Exception{try{__CLR4_1_101xeu1xeuluszwfqn.R.inc(90049);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90050);String json = "{ \n" +
                "    \"argsObjs\"   :   [ 3, 4],\n" +
                "    \"argsTypes\"  :  [ \"int\", \"long\"]\n" +
                "}";
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90051);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90052);assertNotNull(values);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90053);assertEquals(2, values.length);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90054);assertEquals(3, ((Integer)values[0]).intValue());
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90055);assertEquals(4L, ((Long)values[1]).longValue());
    }finally{__CLR4_1_101xeu1xeuluszwfqn.R.flushNeeded();}}

    public void test_invoke_int_obj() throws Exception {__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceStart(getClass().getName(),90056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10cz84rw1xhk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xeu1xeuluszwfqn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_int_obj",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90056,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10cz84rw1xhk() throws Exception{try{__CLR4_1_101xeu1xeuluszwfqn.R.inc(90056);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90057);String json = "{ \n" +
                "    \"argsTypes\"  :  [ \"int\", \"long\"],\n" +
                "    \"argsObjs\"   :   [ 3, 4 ]\n" +
                "}";
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90058);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90059);assertNotNull(values);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90060);assertEquals(2, values.length);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90061);assertEquals(3, ((Integer)values[0]).intValue());
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90062);assertEquals(4L, ((Long)values[1]).longValue());
    }finally{__CLR4_1_101xeu1xeuluszwfqn.R.flushNeeded();}}

    public void test_invoke_int_obj_2() throws Exception {__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceStart(getClass().getName(),90063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yhllp51xhr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xeu1xeuluszwfqn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_int_obj_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90063,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yhllp51xhr() throws Exception{try{__CLR4_1_101xeu1xeuluszwfqn.R.inc(90063);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90064);String json = "{ \n" +
                "    \"argsObjs\"   :   [ 3, 4 ]\n" +
                "}";
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90065);Object[] values = HSFJSONUtils.parseInvocationArguments(json,  new MethodLocator() {

            public Method findMethod(String[] types) {try{__CLR4_1_101xeu1xeuluszwfqn.R.inc(90066);
                __CLR4_1_101xeu1xeuluszwfqn.R.inc(90067);return method_f5;
            }finally{__CLR4_1_101xeu1xeuluszwfqn.R.flushNeeded();}}
        });
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90068);assertNotNull(values);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90069);assertEquals(2, values.length);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90070);assertEquals(3, ((Integer)values[0]).intValue());
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90071);assertEquals(4L, ((Long)values[1]).longValue());
    }finally{__CLR4_1_101xeu1xeuluszwfqn.R.flushNeeded();}}

    public void test_invoke_int_2() throws Exception {__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceStart(getClass().getName(),90072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106pf2271xi0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xeu1xeuluszwfqn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xeu1xeuluszwfqn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_int_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90072,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106pf2271xi0() throws Exception{try{__CLR4_1_101xeu1xeuluszwfqn.R.inc(90072);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90073);String json = "[ \n" +
                "    null, [ 3,4 ]\n" +
                "]";
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90074);Object[] values = HSFJSONUtils.parseInvocationArguments(json, new MethodLocator() {

            public Method findMethod(String[] types) {try{__CLR4_1_101xeu1xeuluszwfqn.R.inc(90075);
                __CLR4_1_101xeu1xeuluszwfqn.R.inc(90076);return method_f5;
            }finally{__CLR4_1_101xeu1xeuluszwfqn.R.flushNeeded();}}
        });
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90077);assertNotNull(values);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90078);assertEquals(2, values.length);
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90079);assertEquals(3, ((Integer)values[0]).intValue());
        __CLR4_1_101xeu1xeuluszwfqn.R.inc(90080);assertEquals(4L, ((Long)values[1]).longValue());
    }finally{__CLR4_1_101xeu1xeuluszwfqn.R.flushNeeded();}}
//
    public static class Service {
        public void f2(String name, Model model) {try{__CLR4_1_101xeu1xeuluszwfqn.R.inc(90081);

        }finally{__CLR4_1_101xeu1xeuluszwfqn.R.flushNeeded();}}

        public void f3(String name, List<Model> models) {try{__CLR4_1_101xeu1xeuluszwfqn.R.inc(90082);

        }finally{__CLR4_1_101xeu1xeuluszwfqn.R.flushNeeded();}}

        public void f3(String name, Model[] models) {try{__CLR4_1_101xeu1xeuluszwfqn.R.inc(90083);

        }finally{__CLR4_1_101xeu1xeuluszwfqn.R.flushNeeded();}}

        public void f3(int a, long b) {try{__CLR4_1_101xeu1xeuluszwfqn.R.inc(90084);

        }finally{__CLR4_1_101xeu1xeuluszwfqn.R.flushNeeded();}}
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
