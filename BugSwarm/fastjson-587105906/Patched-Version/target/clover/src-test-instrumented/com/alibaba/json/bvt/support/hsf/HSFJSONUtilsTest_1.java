/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.support.hsf;

import com.alibaba.fastjson.support.hsf.HSFJSONUtils;
import com.alibaba.fastjson.support.hsf.MethodLocator;
import junit.framework.TestCase;

import java.lang.reflect.Method;
import java.util.List;

public class HSFJSONUtilsTest_1 extends TestCase {static class __CLR4_5_21wgb1wgblusyjvib{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,88842,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Method method_f2;
    private Method method_f3;
    private Method method_f4;
    private Method method_f5;
    private MethodLocator methodLocator;

    protected void setUp() throws Exception {try{__CLR4_5_21wgb1wgblusyjvib.R.inc(88715);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88716);method_f2 = Service.class.getMethod("f2", String.class, Model.class);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88717);method_f3 = Service.class.getMethod("f3", String.class, List.class);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88718);method_f4 = Service.class.getMethod("f3", String.class, Model[].class);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88719);method_f5 = Service.class.getMethod("f3", int.class, long.class);

        __CLR4_5_21wgb1wgblusyjvib.R.inc(88720);methodLocator = new MethodLocator() {
            public Method findMethod(String[] types) {try{__CLR4_5_21wgb1wgblusyjvib.R.inc(88721);
                __CLR4_5_21wgb1wgblusyjvib.R.inc(88722);if ((((types == null || types.length == 0)&&(__CLR4_5_21wgb1wgblusyjvib.R.iget(88723)!=0|true))||(__CLR4_5_21wgb1wgblusyjvib.R.iget(88724)==0&false))) {{
                    __CLR4_5_21wgb1wgblusyjvib.R.inc(88725);return null;
                }

                }__CLR4_5_21wgb1wgblusyjvib.R.inc(88726);if ((((types[0].equals("int"))&&(__CLR4_5_21wgb1wgblusyjvib.R.iget(88727)!=0|true))||(__CLR4_5_21wgb1wgblusyjvib.R.iget(88728)==0&false))) {{
                    __CLR4_5_21wgb1wgblusyjvib.R.inc(88729);return method_f5;
                }

                }__CLR4_5_21wgb1wgblusyjvib.R.inc(88730);if ((((types[1].equals("java.util.List"))&&(__CLR4_5_21wgb1wgblusyjvib.R.iget(88731)!=0|true))||(__CLR4_5_21wgb1wgblusyjvib.R.iget(88732)==0&false))) {{
                    __CLR4_5_21wgb1wgblusyjvib.R.inc(88733);return method_f3;
                }

                }__CLR4_5_21wgb1wgblusyjvib.R.inc(88734);if ((((types[1].equals("com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model[]"))&&(__CLR4_5_21wgb1wgblusyjvib.R.iget(88735)!=0|true))||(__CLR4_5_21wgb1wgblusyjvib.R.iget(88736)==0&false))) {{
                    __CLR4_5_21wgb1wgblusyjvib.R.inc(88737);return method_f4;
                }

                }__CLR4_5_21wgb1wgblusyjvib.R.inc(88738);return method_f2;
            }finally{__CLR4_5_21wgb1wgblusyjvib.R.flushNeeded();}}
        };
    }finally{__CLR4_5_21wgb1wgblusyjvib.R.flushNeeded();}}

    public void test_invoke() throws Exception {__CLR4_5_21wgb1wgblusyjvib.R.globalSliceStart(getClass().getName(),88739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iur6ac1wgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wgb1wgblusyjvib.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wgb1wgblusyjvib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88739,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iur6ac1wgz() throws Exception{try{__CLR4_5_21wgb1wgblusyjvib.R.inc(88739);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88740);String json = "{ \n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"],\n" +
                "    \"argsObjs\"   :   [ \"abc\", {\"value\":\"xxx\"} ]\n" +
                "}";
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88741);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88742);assertNotNull(values);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88743);assertEquals(2, values.length);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88744);assertEquals("abc", values[0]);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88745);assertEquals("xxx", ((Model) values[1]).value);
    }finally{__CLR4_5_21wgb1wgblusyjvib.R.flushNeeded();}}

    public void test_invoke_type() throws Exception {__CLR4_5_21wgb1wgblusyjvib.R.globalSliceStart(getClass().getName(),88746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bucxff1wh6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wgb1wgblusyjvib.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wgb1wgblusyjvib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_type",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88746,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bucxff1wh6() throws Exception{try{__CLR4_5_21wgb1wgblusyjvib.R.inc(88746);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88747);String json = "{\"@type\":\"com.alibaba.fastjson.JSONObject\", \n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"],\n" +
                "    \"argsObjs\"   :   [ \"abc\", {\"value\":\"xxx\"} ]\n" +
                "}";
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88748);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88749);assertNotNull(values);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88750);assertEquals(2, values.length);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88751);assertEquals("abc", values[0]);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88752);assertEquals("xxx", ((Model) values[1]).value);
    }finally{__CLR4_5_21wgb1wgblusyjvib.R.flushNeeded();}}

    public void test_invoke_reverse() throws Exception {__CLR4_5_21wgb1wgblusyjvib.R.globalSliceStart(getClass().getName(),88753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ygbmi71whd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wgb1wgblusyjvib.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wgb1wgblusyjvib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_reverse",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88753,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ygbmi71whd() throws Exception{try{__CLR4_5_21wgb1wgblusyjvib.R.inc(88753);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88754);String json = "{ \n" +
                "    \"argsObjs\"   :   [ \"abc\", {\"value\":\"xxx\"} ],\n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"]\n" +
                "}";
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88755);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88756);assertNotNull(values);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88757);assertEquals(2, values.length);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88758);assertEquals("abc", values[0]);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88759);assertEquals("xxx", ((Model) values[1]).value);
    }finally{__CLR4_5_21wgb1wgblusyjvib.R.flushNeeded();}}

    public void test_invoke_reverse_list() throws Exception {__CLR4_5_21wgb1wgblusyjvib.R.globalSliceStart(getClass().getName(),88760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26im37g1whk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wgb1wgblusyjvib.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wgb1wgblusyjvib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_reverse_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88760,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26im37g1whk() throws Exception{try{__CLR4_5_21wgb1wgblusyjvib.R.inc(88760);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88761);String json = "{ \n" +
                "    \"argsObjs\"   :   [ \"abc\", [{\"value\":\"xxx\"}] ],\n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"java.util.List\"]\n" +
                "}";
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88762);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88763);assertNotNull(values);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88764);assertEquals(2, values.length);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88765);assertEquals("abc", values[0]);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88766);List list = (List) values[1];
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88767);assertEquals("xxx", ((Model) list.get(0)).value);
    }finally{__CLR4_5_21wgb1wgblusyjvib.R.flushNeeded();}}

    public void test_invoke_reverse_array() throws Exception {__CLR4_5_21wgb1wgblusyjvib.R.globalSliceStart(getClass().getName(),88768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26tdeq11whs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wgb1wgblusyjvib.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wgb1wgblusyjvib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_reverse_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88768,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26tdeq11whs() throws Exception{try{__CLR4_5_21wgb1wgblusyjvib.R.inc(88768);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88769);String json = "{ \n" +
                "    \"argsObjs\"   :   [ \"abc\", [{\"value\":\"xxx\"}] ],\n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model[]\"]\n" +
                "}";
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88770);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88771);assertNotNull(values);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88772);assertEquals(2, values.length);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88773);assertEquals("abc", values[0]);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88774);Model[] list = (Model[]) values[1];
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88775);assertEquals("xxx", ((Model) list[0]).value);
    }finally{__CLR4_5_21wgb1wgblusyjvib.R.flushNeeded();}}

    public void test_invoke_array() throws Exception {__CLR4_5_21wgb1wgblusyjvib.R.globalSliceStart(getClass().getName(),88776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ufwsai1wi0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wgb1wgblusyjvib.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wgb1wgblusyjvib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88776,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ufwsai1wi0() throws Exception{try{__CLR4_5_21wgb1wgblusyjvib.R.inc(88776);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88777);String json = "[ \n" +
                "   [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"],\n" +
                "    [ \"abc\", {\"value\":\"xxx\"} ]\n" +
                "]";
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88778);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88779);assertNotNull(values);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88780);assertEquals(2, values.length);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88781);assertEquals("abc", values[0]);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88782);assertEquals("xxx", ((Model) values[1]).value);
    }finally{__CLR4_5_21wgb1wgblusyjvib.R.flushNeeded();}}

    public void test_invoke_array_2() throws Exception {__CLR4_5_21wgb1wgblusyjvib.R.globalSliceStart(getClass().getName(),88783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hfzmmx1wi7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wgb1wgblusyjvib.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wgb1wgblusyjvib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_array_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88783,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hfzmmx1wi7() throws Exception{try{__CLR4_5_21wgb1wgblusyjvib.R.inc(88783);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88784);String json = "[ \n" +
                "   [ \"java.lang.String\", \"java.util.List\"],\n" +
                "    [ \"abc\", [{\"value\":\"xxx\"}] ]\n" +
                "]";
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88785);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88786);assertNotNull(values);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88787);assertEquals(2, values.length);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88788);assertEquals("abc", values[0]);

        __CLR4_5_21wgb1wgblusyjvib.R.inc(88789);List list = (List) values[1];
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88790);assertEquals("xxx", ((Model) list.get(0)).value);
    }finally{__CLR4_5_21wgb1wgblusyjvib.R.flushNeeded();}}

    public void test_invoke_array_3() throws Exception {__CLR4_5_21wgb1wgblusyjvib.R.globalSliceStart(getClass().getName(),88791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kozlfe1wif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wgb1wgblusyjvib.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wgb1wgblusyjvib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_array_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88791,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kozlfe1wif() throws Exception{try{__CLR4_5_21wgb1wgblusyjvib.R.inc(88791);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88792);String json = "[ \n" +
                "   [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model[]\"],\n" +
                "    [ \"abc\", [{\"value\":\"xxx\"}] ]\n" +
                "]";
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88793);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88794);assertNotNull(values);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88795);assertEquals(2, values.length);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88796);assertEquals("abc", values[0]);

        __CLR4_5_21wgb1wgblusyjvib.R.inc(88797);Model[] list = (Model[]) values[1];
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88798);assertEquals("xxx", ((Model) list[0]).value);
    }finally{__CLR4_5_21wgb1wgblusyjvib.R.flushNeeded();}}

    public void test_invoke_int() throws Exception {__CLR4_5_21wgb1wgblusyjvib.R.globalSliceStart(getClass().getName(),88799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cn1eqs1win();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wgb1wgblusyjvib.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wgb1wgblusyjvib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88799,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cn1eqs1win() throws Exception{try{__CLR4_5_21wgb1wgblusyjvib.R.inc(88799);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88800);String json = "[ \n" +
                "   [ \"int\", \"long\"],\n" +
                "    [ 3,4 ]\n" +
                "]";
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88801);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88802);assertNotNull(values);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88803);assertEquals(2, values.length);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88804);assertEquals(3, ((Integer)values[0]).intValue());
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88805);assertEquals(4L, ((Long)values[1]).longValue());
    }finally{__CLR4_5_21wgb1wgblusyjvib.R.flushNeeded();}}

    public void test_invoke_int_obj_reverse() throws Exception {__CLR4_5_21wgb1wgblusyjvib.R.globalSliceStart(getClass().getName(),88806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m3rgmh1wiu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wgb1wgblusyjvib.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wgb1wgblusyjvib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_int_obj_reverse",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88806,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m3rgmh1wiu() throws Exception{try{__CLR4_5_21wgb1wgblusyjvib.R.inc(88806);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88807);String json = "{ \n" +
                "    \"argsObjs\"   :   [ 3, 4],\n" +
                "    \"argsTypes\"  :  [ \"int\", \"long\"]\n" +
                "}";
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88808);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88809);assertNotNull(values);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88810);assertEquals(2, values.length);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88811);assertEquals(3, ((Integer)values[0]).intValue());
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88812);assertEquals(4L, ((Long)values[1]).longValue());
    }finally{__CLR4_5_21wgb1wgblusyjvib.R.flushNeeded();}}

    public void test_invoke_int_obj() throws Exception {__CLR4_5_21wgb1wgblusyjvib.R.globalSliceStart(getClass().getName(),88813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cz84rw1wj1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wgb1wgblusyjvib.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wgb1wgblusyjvib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_int_obj",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88813,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cz84rw1wj1() throws Exception{try{__CLR4_5_21wgb1wgblusyjvib.R.inc(88813);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88814);String json = "{ \n" +
                "    \"argsTypes\"  :  [ \"int\", \"long\"],\n" +
                "    \"argsObjs\"   :   [ 3, 4 ]\n" +
                "}";
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88815);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88816);assertNotNull(values);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88817);assertEquals(2, values.length);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88818);assertEquals(3, ((Integer)values[0]).intValue());
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88819);assertEquals(4L, ((Long)values[1]).longValue());
    }finally{__CLR4_5_21wgb1wgblusyjvib.R.flushNeeded();}}

    public void test_invoke_int_obj_2() throws Exception {__CLR4_5_21wgb1wgblusyjvib.R.globalSliceStart(getClass().getName(),88820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yhllp51wj8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wgb1wgblusyjvib.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wgb1wgblusyjvib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_int_obj_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88820,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yhllp51wj8() throws Exception{try{__CLR4_5_21wgb1wgblusyjvib.R.inc(88820);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88821);String json = "{ \n" +
                "    \"argsObjs\"   :   [ 3, 4 ]\n" +
                "}";
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88822);Object[] values = HSFJSONUtils.parseInvocationArguments(json,  new MethodLocator() {

            public Method findMethod(String[] types) {try{__CLR4_5_21wgb1wgblusyjvib.R.inc(88823);
                __CLR4_5_21wgb1wgblusyjvib.R.inc(88824);return method_f5;
            }finally{__CLR4_5_21wgb1wgblusyjvib.R.flushNeeded();}}
        });
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88825);assertNotNull(values);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88826);assertEquals(2, values.length);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88827);assertEquals(3, ((Integer)values[0]).intValue());
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88828);assertEquals(4L, ((Long)values[1]).longValue());
    }finally{__CLR4_5_21wgb1wgblusyjvib.R.flushNeeded();}}

    public void test_invoke_int_2() throws Exception {__CLR4_5_21wgb1wgblusyjvib.R.globalSliceStart(getClass().getName(),88829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26pf2271wjh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wgb1wgblusyjvib.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wgb1wgblusyjvib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_1.test_invoke_int_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88829,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26pf2271wjh() throws Exception{try{__CLR4_5_21wgb1wgblusyjvib.R.inc(88829);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88830);String json = "[ \n" +
                "    null, [ 3,4 ]\n" +
                "]";
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88831);Object[] values = HSFJSONUtils.parseInvocationArguments(json, new MethodLocator() {

            public Method findMethod(String[] types) {try{__CLR4_5_21wgb1wgblusyjvib.R.inc(88832);
                __CLR4_5_21wgb1wgblusyjvib.R.inc(88833);return method_f5;
            }finally{__CLR4_5_21wgb1wgblusyjvib.R.flushNeeded();}}
        });
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88834);assertNotNull(values);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88835);assertEquals(2, values.length);
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88836);assertEquals(3, ((Integer)values[0]).intValue());
        __CLR4_5_21wgb1wgblusyjvib.R.inc(88837);assertEquals(4L, ((Long)values[1]).longValue());
    }finally{__CLR4_5_21wgb1wgblusyjvib.R.flushNeeded();}}
//
    public static class Service {
        public void f2(String name, Model model) {try{__CLR4_5_21wgb1wgblusyjvib.R.inc(88838);

        }finally{__CLR4_5_21wgb1wgblusyjvib.R.flushNeeded();}}

        public void f3(String name, List<Model> models) {try{__CLR4_5_21wgb1wgblusyjvib.R.inc(88839);

        }finally{__CLR4_5_21wgb1wgblusyjvib.R.flushNeeded();}}

        public void f3(String name, Model[] models) {try{__CLR4_5_21wgb1wgblusyjvib.R.inc(88840);

        }finally{__CLR4_5_21wgb1wgblusyjvib.R.flushNeeded();}}

        public void f3(int a, long b) {try{__CLR4_5_21wgb1wgblusyjvib.R.inc(88841);

        }finally{__CLR4_5_21wgb1wgblusyjvib.R.flushNeeded();}}
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
