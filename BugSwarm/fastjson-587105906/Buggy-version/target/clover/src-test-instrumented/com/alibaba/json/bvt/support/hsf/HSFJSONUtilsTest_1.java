/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.support.hsf;

import com.alibaba.fastjson.support.hsf.HSFJSONUtils;
import com.alibaba.fastjson.support.hsf.MethodLocator;
import junit.framework.TestCase;

import java.lang.reflect.Method;
import java.util.List;

public class HSFJSONUtilsTest_1 extends TestCase {static class __CLR4_1_101wgm1wgmlusqkm1f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,88853,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Method method_f2;
    private Method method_f3;
    private Method method_f4;
    private Method method_f5;
    private MethodLocator methodLocator;

    protected void setUp() throws Exception {try{__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88726);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88727);method_f2 = Service.class.getMethod("f2", String.class, Model.class);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88728);method_f3 = Service.class.getMethod("f3", String.class, List.class);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88729);method_f4 = Service.class.getMethod("f3", String.class, Model[].class);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88730);method_f5 = Service.class.getMethod("f3", int.class, long.class);

        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88731);methodLocator = new MethodLocator() {
            public Method findMethod(String[] types) {try{__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88732);
                __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88733);if ((((types == null || types.length == 0)&&(__CLR4_1_101wgm1wgmlusqkm1f.R.iget(88734)!=0|true))||(__CLR4_1_101wgm1wgmlusqkm1f.R.iget(88735)==0&false))) {{
                    __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88736);return null;
                }

                }__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88737);if ((((types[0].equals("int"))&&(__CLR4_1_101wgm1wgmlusqkm1f.R.iget(88738)!=0|true))||(__CLR4_1_101wgm1wgmlusqkm1f.R.iget(88739)==0&false))) {{
                    __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88740);return method_f5;
                }

                }__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88741);if ((((types[1].equals("java.util.List"))&&(__CLR4_1_101wgm1wgmlusqkm1f.R.iget(88742)!=0|true))||(__CLR4_1_101wgm1wgmlusqkm1f.R.iget(88743)==0&false))) {{
                    __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88744);return method_f3;
                }

                }__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88745);if ((((types[1].equals("com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model[]"))&&(__CLR4_1_101wgm1wgmlusqkm1f.R.iget(88746)!=0|true))||(__CLR4_1_101wgm1wgmlusqkm1f.R.iget(88747)==0&false))) {{
                    __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88748);return method_f4;
                }

                }__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88749);return method_f2;
            }finally{__CLR4_1_101wgm1wgmlusqkm1f.R.flushNeeded();}}
        };
    }finally{__CLR4_1_101wgm1wgmlusqkm1f.R.flushNeeded();}}

    public void test_invoke() throws Exception {__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceStart(getClass().getName(),88750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10iur6ac1wha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wgm1wgmlusqkm1f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88750,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10iur6ac1wha() throws Exception{try{__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88750);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88751);String json = "{ \n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"],\n" +
                "    \"argsObjs\"   :   [ \"abc\", {\"value\":\"xxx\"} ]\n" +
                "}";
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88752);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88753);assertNotNull(values);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88754);assertEquals(2, values.length);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88755);assertEquals("abc", values[0]);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88756);assertEquals("xxx", ((Model) values[1]).value);
    }finally{__CLR4_1_101wgm1wgmlusqkm1f.R.flushNeeded();}}

    public void test_invoke_type() throws Exception {__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceStart(getClass().getName(),88757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bucxff1whh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wgm1wgmlusqkm1f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_type",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88757,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bucxff1whh() throws Exception{try{__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88757);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88758);String json = "{\"@type\":\"com.alibaba.fastjson.JSONObject\", \n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"],\n" +
                "    \"argsObjs\"   :   [ \"abc\", {\"value\":\"xxx\"} ]\n" +
                "}";
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88759);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88760);assertNotNull(values);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88761);assertEquals(2, values.length);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88762);assertEquals("abc", values[0]);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88763);assertEquals("xxx", ((Model) values[1]).value);
    }finally{__CLR4_1_101wgm1wgmlusqkm1f.R.flushNeeded();}}

    public void test_invoke_reverse() throws Exception {__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceStart(getClass().getName(),88764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ygbmi71who();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wgm1wgmlusqkm1f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_reverse",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88764,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ygbmi71who() throws Exception{try{__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88764);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88765);String json = "{ \n" +
                "    \"argsObjs\"   :   [ \"abc\", {\"value\":\"xxx\"} ],\n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"]\n" +
                "}";
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88766);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88767);assertNotNull(values);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88768);assertEquals(2, values.length);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88769);assertEquals("abc", values[0]);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88770);assertEquals("xxx", ((Model) values[1]).value);
    }finally{__CLR4_1_101wgm1wgmlusqkm1f.R.flushNeeded();}}

    public void test_invoke_reverse_list() throws Exception {__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceStart(getClass().getName(),88771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106im37g1whv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wgm1wgmlusqkm1f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_reverse_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88771,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106im37g1whv() throws Exception{try{__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88771);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88772);String json = "{ \n" +
                "    \"argsObjs\"   :   [ \"abc\", [{\"value\":\"xxx\"}] ],\n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"java.util.List\"]\n" +
                "}";
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88773);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88774);assertNotNull(values);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88775);assertEquals(2, values.length);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88776);assertEquals("abc", values[0]);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88777);List list = (List) values[1];
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88778);assertEquals("xxx", ((Model) list.get(0)).value);
    }finally{__CLR4_1_101wgm1wgmlusqkm1f.R.flushNeeded();}}

    public void test_invoke_reverse_array() throws Exception {__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceStart(getClass().getName(),88779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106tdeq11wi3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wgm1wgmlusqkm1f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_reverse_array",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88779,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106tdeq11wi3() throws Exception{try{__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88779);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88780);String json = "{ \n" +
                "    \"argsObjs\"   :   [ \"abc\", [{\"value\":\"xxx\"}] ],\n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model[]\"]\n" +
                "}";
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88781);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88782);assertNotNull(values);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88783);assertEquals(2, values.length);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88784);assertEquals("abc", values[0]);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88785);Model[] list = (Model[]) values[1];
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88786);assertEquals("xxx", ((Model) list[0]).value);
    }finally{__CLR4_1_101wgm1wgmlusqkm1f.R.flushNeeded();}}

    public void test_invoke_array() throws Exception {__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceStart(getClass().getName(),88787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ufwsai1wib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wgm1wgmlusqkm1f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_array",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88787,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ufwsai1wib() throws Exception{try{__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88787);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88788);String json = "[ \n" +
                "   [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"],\n" +
                "    [ \"abc\", {\"value\":\"xxx\"} ]\n" +
                "]";
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88789);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88790);assertNotNull(values);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88791);assertEquals(2, values.length);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88792);assertEquals("abc", values[0]);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88793);assertEquals("xxx", ((Model) values[1]).value);
    }finally{__CLR4_1_101wgm1wgmlusqkm1f.R.flushNeeded();}}

    public void test_invoke_array_2() throws Exception {__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceStart(getClass().getName(),88794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hfzmmx1wii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wgm1wgmlusqkm1f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_array_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88794,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hfzmmx1wii() throws Exception{try{__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88794);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88795);String json = "[ \n" +
                "   [ \"java.lang.String\", \"java.util.List\"],\n" +
                "    [ \"abc\", [{\"value\":\"xxx\"}] ]\n" +
                "]";
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88796);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88797);assertNotNull(values);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88798);assertEquals(2, values.length);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88799);assertEquals("abc", values[0]);

        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88800);List list = (List) values[1];
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88801);assertEquals("xxx", ((Model) list.get(0)).value);
    }finally{__CLR4_1_101wgm1wgmlusqkm1f.R.flushNeeded();}}

    public void test_invoke_array_3() throws Exception {__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceStart(getClass().getName(),88802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kozlfe1wiq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wgm1wgmlusqkm1f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_array_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88802,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kozlfe1wiq() throws Exception{try{__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88802);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88803);String json = "[ \n" +
                "   [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model[]\"],\n" +
                "    [ \"abc\", [{\"value\":\"xxx\"}] ]\n" +
                "]";
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88804);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88805);assertNotNull(values);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88806);assertEquals(2, values.length);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88807);assertEquals("abc", values[0]);

        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88808);Model[] list = (Model[]) values[1];
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88809);assertEquals("xxx", ((Model) list[0]).value);
    }finally{__CLR4_1_101wgm1wgmlusqkm1f.R.flushNeeded();}}

    public void test_invoke_int() throws Exception {__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceStart(getClass().getName(),88810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10cn1eqs1wiy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wgm1wgmlusqkm1f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_int",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88810,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10cn1eqs1wiy() throws Exception{try{__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88810);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88811);String json = "[ \n" +
                "   [ \"int\", \"long\"],\n" +
                "    [ 3,4 ]\n" +
                "]";
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88812);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88813);assertNotNull(values);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88814);assertEquals(2, values.length);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88815);assertEquals(3, ((Integer)values[0]).intValue());
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88816);assertEquals(4L, ((Long)values[1]).longValue());
    }finally{__CLR4_1_101wgm1wgmlusqkm1f.R.flushNeeded();}}

    public void test_invoke_int_obj_reverse() throws Exception {__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceStart(getClass().getName(),88817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m3rgmh1wj5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wgm1wgmlusqkm1f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_int_obj_reverse",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88817,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m3rgmh1wj5() throws Exception{try{__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88817);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88818);String json = "{ \n" +
                "    \"argsObjs\"   :   [ 3, 4],\n" +
                "    \"argsTypes\"  :  [ \"int\", \"long\"]\n" +
                "}";
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88819);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88820);assertNotNull(values);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88821);assertEquals(2, values.length);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88822);assertEquals(3, ((Integer)values[0]).intValue());
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88823);assertEquals(4L, ((Long)values[1]).longValue());
    }finally{__CLR4_1_101wgm1wgmlusqkm1f.R.flushNeeded();}}

    public void test_invoke_int_obj() throws Exception {__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceStart(getClass().getName(),88824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10cz84rw1wjc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wgm1wgmlusqkm1f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_int_obj",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88824,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10cz84rw1wjc() throws Exception{try{__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88824);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88825);String json = "{ \n" +
                "    \"argsTypes\"  :  [ \"int\", \"long\"],\n" +
                "    \"argsObjs\"   :   [ 3, 4 ]\n" +
                "}";
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88826);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88827);assertNotNull(values);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88828);assertEquals(2, values.length);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88829);assertEquals(3, ((Integer)values[0]).intValue());
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88830);assertEquals(4L, ((Long)values[1]).longValue());
    }finally{__CLR4_1_101wgm1wgmlusqkm1f.R.flushNeeded();}}

    public void test_invoke_int_obj_2() throws Exception {__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceStart(getClass().getName(),88831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yhllp51wjj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wgm1wgmlusqkm1f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_int_obj_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88831,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yhllp51wjj() throws Exception{try{__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88831);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88832);String json = "{ \n" +
                "    \"argsObjs\"   :   [ 3, 4 ]\n" +
                "}";
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88833);Object[] values = HSFJSONUtils.parseInvocationArguments(json,  new MethodLocator() {

            public Method findMethod(String[] types) {try{__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88834);
                __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88835);return method_f5;
            }finally{__CLR4_1_101wgm1wgmlusqkm1f.R.flushNeeded();}}
        });
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88836);assertNotNull(values);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88837);assertEquals(2, values.length);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88838);assertEquals(3, ((Integer)values[0]).intValue());
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88839);assertEquals(4L, ((Long)values[1]).longValue());
    }finally{__CLR4_1_101wgm1wgmlusqkm1f.R.flushNeeded();}}

    public void test_invoke_int_2() throws Exception {__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceStart(getClass().getName(),88840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106pf2271wjs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wgm1wgmlusqkm1f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wgm1wgmlusqkm1f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_int_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88840,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106pf2271wjs() throws Exception{try{__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88840);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88841);String json = "[ \n" +
                "    null, [ 3,4 ]\n" +
                "]";
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88842);Object[] values = HSFJSONUtils.parseInvocationArguments(json, new MethodLocator() {

            public Method findMethod(String[] types) {try{__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88843);
                __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88844);return method_f5;
            }finally{__CLR4_1_101wgm1wgmlusqkm1f.R.flushNeeded();}}
        });
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88845);assertNotNull(values);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88846);assertEquals(2, values.length);
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88847);assertEquals(3, ((Integer)values[0]).intValue());
        __CLR4_1_101wgm1wgmlusqkm1f.R.inc(88848);assertEquals(4L, ((Long)values[1]).longValue());
    }finally{__CLR4_1_101wgm1wgmlusqkm1f.R.flushNeeded();}}
//
    public static class Service {
        public void f2(String name, Model model) {try{__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88849);

        }finally{__CLR4_1_101wgm1wgmlusqkm1f.R.flushNeeded();}}

        public void f3(String name, List<Model> models) {try{__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88850);

        }finally{__CLR4_1_101wgm1wgmlusqkm1f.R.flushNeeded();}}

        public void f3(String name, Model[] models) {try{__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88851);

        }finally{__CLR4_1_101wgm1wgmlusqkm1f.R.flushNeeded();}}

        public void f3(int a, long b) {try{__CLR4_1_101wgm1wgmlusqkm1f.R.inc(88852);

        }finally{__CLR4_1_101wgm1wgmlusqkm1f.R.flushNeeded();}}
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
