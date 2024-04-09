/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.support.hsf;

import com.alibaba.fastjson.support.hsf.HSFJSONUtils;
import com.alibaba.fastjson.support.hsf.MethodLocator;
import junit.framework.TestCase;

import java.lang.reflect.Method;
import java.util.List;

public class HSFJSONUtilsTest_0 extends TestCase {static class __CLR4_5_21xbz1xbzlusvnh8u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,89947,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Method method_f2;
    private Method method_f3;
    private Method method_f4;
    private Method method_f5;
    private MethodLocator methodLocator;

    protected void setUp() throws Exception {try{__CLR4_5_21xbz1xbzlusvnh8u.R.inc(89855);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89856);method_f2 = Service.class.getMethod("f2", String.class, Model.class);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89857);method_f3 = Service.class.getMethod("f3", String.class, List.class);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89858);method_f4 = Service.class.getMethod("f4", List.class);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89859);method_f5 = Service.class.getMethod("f4", User[].class);

        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89860);methodLocator = new MethodLocator() {
            public Method findMethod(String[] types) {try{__CLR4_5_21xbz1xbzlusvnh8u.R.inc(89861);
                __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89862);if ((((types == null)&&(__CLR4_5_21xbz1xbzlusvnh8u.R.iget(89863)!=0|true))||(__CLR4_5_21xbz1xbzlusvnh8u.R.iget(89864)==0&false))) {{
                    __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89865);return method_f2;
                }

                }__CLR4_5_21xbz1xbzlusvnh8u.R.inc(89866);if ((((types.length == 1 && types[0].equals("java.util.List"))&&(__CLR4_5_21xbz1xbzlusvnh8u.R.iget(89867)!=0|true))||(__CLR4_5_21xbz1xbzlusvnh8u.R.iget(89868)==0&false))) {{
                    __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89869);return method_f4;
                }

                }__CLR4_5_21xbz1xbzlusvnh8u.R.inc(89870);if ((((types.length == 1 && types[0].equals("com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.User[]"))&&(__CLR4_5_21xbz1xbzlusvnh8u.R.iget(89871)!=0|true))||(__CLR4_5_21xbz1xbzlusvnh8u.R.iget(89872)==0&false))) {{
                    __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89873);return method_f5;
                }

                }__CLR4_5_21xbz1xbzlusvnh8u.R.inc(89874);if ((((types[1].equals("java.util.List"))&&(__CLR4_5_21xbz1xbzlusvnh8u.R.iget(89875)!=0|true))||(__CLR4_5_21xbz1xbzlusvnh8u.R.iget(89876)==0&false))) {{
                    __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89877);return method_f3;
                }

                }__CLR4_5_21xbz1xbzlusvnh8u.R.inc(89878);return method_f2;
            }finally{__CLR4_5_21xbz1xbzlusvnh8u.R.flushNeeded();}}
        };
    }finally{__CLR4_5_21xbz1xbzlusvnh8u.R.flushNeeded();}}

    public void test_invoke() throws Exception {__CLR4_5_21xbz1xbzlusvnh8u.R.globalSliceStart(getClass().getName(),89879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iur6ac1xcn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xbz1xbzlusvnh8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xbz1xbzlusvnh8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.test_invoke",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89879,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iur6ac1xcn() throws Exception{try{__CLR4_5_21xbz1xbzlusvnh8u.R.inc(89879);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89880);String json = "{ \n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"],\n" +
                "    \"argsObjs\"   :   [ \"abc\", {\"value\":\"xxx\"} ]\n" +
                "}";
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89881);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89882);assertNotNull(values);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89883);assertEquals(2, values.length);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89884);assertEquals("abc", values[0]);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89885);assertEquals("xxx", ((Model) values[1]).value);
    }finally{__CLR4_5_21xbz1xbzlusvnh8u.R.flushNeeded();}}

    public void test_invoke_1() throws Exception {__CLR4_5_21xbz1xbzlusvnh8u.R.globalSliceStart(getClass().getName(),89886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21wwjtu1xcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xbz1xbzlusvnh8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xbz1xbzlusvnh8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.test_invoke_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89886,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21wwjtu1xcu() throws Exception{try{__CLR4_5_21xbz1xbzlusvnh8u.R.inc(89886);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89887);String json = "{ \n" +
                "    \"argsObjs\"   :   [ \"abc\", {\"value\":\"xxx\"} ]\n" +
                "}";
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89888);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89889);assertNotNull(values);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89890);assertEquals(2, values.length);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89891);assertEquals("abc", values[0]);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89892);assertEquals("xxx", ((Model) values[1]).value);
    }finally{__CLR4_5_21xbz1xbzlusvnh8u.R.flushNeeded();}}

    public void test_invoke_null() throws Exception {__CLR4_5_21xbz1xbzlusvnh8u.R.globalSliceStart(getClass().getName(),89893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xtnz141xd1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xbz1xbzlusvnh8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xbz1xbzlusvnh8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.test_invoke_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89893,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xtnz141xd1() throws Exception{try{__CLR4_5_21xbz1xbzlusvnh8u.R.inc(89893);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89894);String json = "{ \n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"],\n" +
                "    \"argsObjs\"   :   [ null, null ]\n" +
                "}";
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89895);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89896);assertNotNull(values);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89897);assertEquals(2, values.length);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89898);assertEquals(null, values[0]);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89899);assertEquals(null, values[1]);
    }finally{__CLR4_5_21xbz1xbzlusvnh8u.R.flushNeeded();}}

    public void test_invoke_list() throws Exception {__CLR4_5_21xbz1xbzlusvnh8u.R.globalSliceStart(getClass().getName(),89900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_230ux3z1xd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xbz1xbzlusvnh8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xbz1xbzlusvnh8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.test_invoke_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89900,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_230ux3z1xd8() throws Exception{try{__CLR4_5_21xbz1xbzlusvnh8u.R.inc(89900);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89901);String json = "{ \n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"java.util.List\"],\n" +
                "    \"argsObjs\"   :   [ \"abc\", [" +
                "{" +
                "   \"value\":\"xxx\"" +
                "   }] ]\n" +
                "}";
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89902);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89903);assertNotNull(values);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89904);assertEquals(2, values.length);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89905);assertEquals("abc", values[0]);

        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89906);List list = (List) values[1];
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89907);assertEquals("xxx", ((Model) list.get(0)).value);
    }finally{__CLR4_5_21xbz1xbzlusvnh8u.R.flushNeeded();}}

    public void test_invoke_list_f4() throws Exception {__CLR4_5_21xbz1xbzlusvnh8u.R.globalSliceStart(getClass().getName(),89908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_250e9dw1xdg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xbz1xbzlusvnh8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xbz1xbzlusvnh8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.test_invoke_list_f4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89908,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_250e9dw1xdg() throws Exception{try{__CLR4_5_21xbz1xbzlusvnh8u.R.inc(89908);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89909);String json = "{\n" +
                "    \"argsTypes\": [\"java.util.List\"],\n" +
                "    \n" +
                "    \"argsObjs\": [\n" +
                "        [\n" +
                "    \t\t{\n" +
                "    \t\t\t\"name\": \"123\",\n" +
                "    \t\t\t\"id\": 123,\n" +
                "    \t\t\t\"age\": 123\n" +
                "    \t\t},\n" +
                "    \t\t{\n" +
                "    \t\t\t\"name\": \"123\",\n" +
                "    \t\t\t\"id\": 123,\n" +
                "    \t\t\t\"age\": 123\n" +
                "    \t\t}\n" +
                "\t\t]\n" +
                "    ]\n" +
                "}";
//        System.out.println(json);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89910);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89911);assertNotNull(values);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89912);assertEquals(1, values.length);

        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89913);List list = (List) values[0];
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89914);assertEquals("123", ((User) list.get(0)).name);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89915);assertEquals("123", ((User) list.get(1)).name);
    }finally{__CLR4_5_21xbz1xbzlusvnh8u.R.flushNeeded();}}

    public void test_invoke_list_f5() throws Exception {__CLR4_5_21xbz1xbzlusvnh8u.R.globalSliceStart(getClass().getName(),89916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21realf1xdo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xbz1xbzlusvnh8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xbz1xbzlusvnh8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.test_invoke_list_f5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89916,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21realf1xdo() throws Exception{try{__CLR4_5_21xbz1xbzlusvnh8u.R.inc(89916);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89917);String json = " [\n" +
                " \t[\"java.util.List\"],\n" +
                "    [\n" +
                "    \t\t[{\n" +
                "    \t\t\t\"name\": \"123\",\n" +
                "    \t\t\t\"id\": 123,\n" +
                "    \t\t\t\"age\": 123\n" +
                "    \t\t},\n" +
                "    \t\t{\n" +
                "    \t\t\t\"name\": \"123\",\n" +
                "    \t\t\t\"id\": 123,\n" +
                "    \t\t\t\"age\": 123\n" +
                "    \t\t}]\n" +
                "    ]\n" +
                "]";
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89918);System.out.println(json);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89919);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89920);assertNotNull(values);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89921);assertEquals(1, values.length);

        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89922);List list = (List) values[0];
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89923);assertEquals("123", ((User) list.get(0)).name);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89924);assertEquals("123", ((User) list.get(1)).name);
    }finally{__CLR4_5_21xbz1xbzlusvnh8u.R.flushNeeded();}}

    public void test_invoke_array() throws Exception {__CLR4_5_21xbz1xbzlusvnh8u.R.globalSliceStart(getClass().getName(),89925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ufwsai1xdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xbz1xbzlusvnh8u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xbz1xbzlusvnh8u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.test_invoke_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89925,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ufwsai1xdx() throws Exception{try{__CLR4_5_21xbz1xbzlusvnh8u.R.inc(89925);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89926);String json = "{\n" +
                "    \"argsTypes\": [\"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.User[]\"],\n" +
                "    \n" +
                "    \"argsObjs\": [\n" +
                "        [\n" +
                "    \t\t{\n" +
                "    \t\t\t\"name\": \"123\",\n" +
                "    \t\t\t\"id\": 123,\n" +
                "    \t\t\t\"age\": 123\n" +
                "    \t\t},\n" +
                "    \t\t{\n" +
                "    \t\t\t\"name\": \"123\",\n" +
                "    \t\t\t\"id\": 123,\n" +
                "    \t\t\t\"age\": 123\n" +
                "    \t\t}\n" +
                "\t\t]\n" +
                "    ]\n" +
                "}";
//        System.out.println(json);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89927);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89928);assertNotNull(values);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89929);assertEquals(1, values.length);

        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89930);User[] list = (User[]) values[0];
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89931);assertEquals("123", ((User) list[0]).name);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89932);assertEquals("123", ((User) list[1]).name);
    }finally{__CLR4_5_21xbz1xbzlusvnh8u.R.flushNeeded();}}

//    public void test_perf() throws Exception {
//        for (int i = 0; i < 5; ++i) {
//            perf(); // 723
//        }
//    }

    void perf() throws Exception {try{__CLR4_5_21xbz1xbzlusvnh8u.R.inc(89933);
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89934);long start = System.currentTimeMillis();
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89935);String json = "{ \n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"],\n" +
                "    \"argsObjs\"   :   [ \"abc\", {\"value\":\"xxx\"} ]\n" +
                "}";
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89936);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_5_21xbz1xbzlusvnh8u.R.iget(89937)!=0|true))||(__CLR4_5_21xbz1xbzlusvnh8u.R.iget(89938)==0&false)); ++i) {{
            __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89939);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        }
        }__CLR4_5_21xbz1xbzlusvnh8u.R.inc(89940);long millis = System.currentTimeMillis() - start;
        __CLR4_5_21xbz1xbzlusvnh8u.R.inc(89941);System.out.println("millis : " + millis);
    }finally{__CLR4_5_21xbz1xbzlusvnh8u.R.flushNeeded();}}

    public static class Service {
        public void f1() {try{__CLR4_5_21xbz1xbzlusvnh8u.R.inc(89942);

        }finally{__CLR4_5_21xbz1xbzlusvnh8u.R.flushNeeded();}}

        public void f2(String name, Model model) {try{__CLR4_5_21xbz1xbzlusvnh8u.R.inc(89943);

        }finally{__CLR4_5_21xbz1xbzlusvnh8u.R.flushNeeded();}}

        public void f3(String name, List<Model> models) {try{__CLR4_5_21xbz1xbzlusvnh8u.R.inc(89944);

        }finally{__CLR4_5_21xbz1xbzlusvnh8u.R.flushNeeded();}}

        public void f4( List<User> models) {try{__CLR4_5_21xbz1xbzlusvnh8u.R.inc(89945);

        }finally{__CLR4_5_21xbz1xbzlusvnh8u.R.flushNeeded();}}

        public void f4( User[] models) {try{__CLR4_5_21xbz1xbzlusvnh8u.R.inc(89946);

        }finally{__CLR4_5_21xbz1xbzlusvnh8u.R.flushNeeded();}}
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
