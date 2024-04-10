/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.support.hsf;

import com.alibaba.fastjson.support.hsf.HSFJSONUtils;
import com.alibaba.fastjson.support.hsf.MethodLocator;
import junit.framework.TestCase;

import java.lang.reflect.Method;
import java.util.List;

public class HSFJSONUtilsTest_0 extends TestCase {static class __CLR4_1_101xca1xcaluszwfqc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,89958,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Method method_f2;
    private Method method_f3;
    private Method method_f4;
    private Method method_f5;
    private MethodLocator methodLocator;

    protected void setUp() throws Exception {try{__CLR4_1_101xca1xcaluszwfqc.R.inc(89866);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89867);method_f2 = Service.class.getMethod("f2", String.class, Model.class);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89868);method_f3 = Service.class.getMethod("f3", String.class, List.class);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89869);method_f4 = Service.class.getMethod("f4", List.class);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89870);method_f5 = Service.class.getMethod("f4", User[].class);

        __CLR4_1_101xca1xcaluszwfqc.R.inc(89871);methodLocator = new MethodLocator() {
            public Method findMethod(String[] types) {try{__CLR4_1_101xca1xcaluszwfqc.R.inc(89872);
                __CLR4_1_101xca1xcaluszwfqc.R.inc(89873);if ((((types == null)&&(__CLR4_1_101xca1xcaluszwfqc.R.iget(89874)!=0|true))||(__CLR4_1_101xca1xcaluszwfqc.R.iget(89875)==0&false))) {{
                    __CLR4_1_101xca1xcaluszwfqc.R.inc(89876);return method_f2;
                }

                }__CLR4_1_101xca1xcaluszwfqc.R.inc(89877);if ((((types.length == 1 && types[0].equals("java.util.List"))&&(__CLR4_1_101xca1xcaluszwfqc.R.iget(89878)!=0|true))||(__CLR4_1_101xca1xcaluszwfqc.R.iget(89879)==0&false))) {{
                    __CLR4_1_101xca1xcaluszwfqc.R.inc(89880);return method_f4;
                }

                }__CLR4_1_101xca1xcaluszwfqc.R.inc(89881);if ((((types.length == 1 && types[0].equals("com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.User[]"))&&(__CLR4_1_101xca1xcaluszwfqc.R.iget(89882)!=0|true))||(__CLR4_1_101xca1xcaluszwfqc.R.iget(89883)==0&false))) {{
                    __CLR4_1_101xca1xcaluszwfqc.R.inc(89884);return method_f5;
                }

                }__CLR4_1_101xca1xcaluszwfqc.R.inc(89885);if ((((types[1].equals("java.util.List"))&&(__CLR4_1_101xca1xcaluszwfqc.R.iget(89886)!=0|true))||(__CLR4_1_101xca1xcaluszwfqc.R.iget(89887)==0&false))) {{
                    __CLR4_1_101xca1xcaluszwfqc.R.inc(89888);return method_f3;
                }

                }__CLR4_1_101xca1xcaluszwfqc.R.inc(89889);return method_f2;
            }finally{__CLR4_1_101xca1xcaluszwfqc.R.flushNeeded();}}
        };
    }finally{__CLR4_1_101xca1xcaluszwfqc.R.flushNeeded();}}

    public void test_invoke() throws Exception {__CLR4_1_101xca1xcaluszwfqc.R.globalSliceStart(getClass().getName(),89890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10iur6ac1xcy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xca1xcaluszwfqc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xca1xcaluszwfqc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.test_invoke",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89890,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10iur6ac1xcy() throws Exception{try{__CLR4_1_101xca1xcaluszwfqc.R.inc(89890);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89891);String json = "{ \n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"],\n" +
                "    \"argsObjs\"   :   [ \"abc\", {\"value\":\"xxx\"} ]\n" +
                "}";
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89892);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89893);assertNotNull(values);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89894);assertEquals(2, values.length);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89895);assertEquals("abc", values[0]);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89896);assertEquals("xxx", ((Model) values[1]).value);
    }finally{__CLR4_1_101xca1xcaluszwfqc.R.flushNeeded();}}

    public void test_invoke_1() throws Exception {__CLR4_1_101xca1xcaluszwfqc.R.globalSliceStart(getClass().getName(),89897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101wwjtu1xd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xca1xcaluszwfqc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xca1xcaluszwfqc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.test_invoke_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89897,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101wwjtu1xd5() throws Exception{try{__CLR4_1_101xca1xcaluszwfqc.R.inc(89897);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89898);String json = "{ \n" +
                "    \"argsObjs\"   :   [ \"abc\", {\"value\":\"xxx\"} ]\n" +
                "}";
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89899);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89900);assertNotNull(values);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89901);assertEquals(2, values.length);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89902);assertEquals("abc", values[0]);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89903);assertEquals("xxx", ((Model) values[1]).value);
    }finally{__CLR4_1_101xca1xcaluszwfqc.R.flushNeeded();}}

    public void test_invoke_null() throws Exception {__CLR4_1_101xca1xcaluszwfqc.R.globalSliceStart(getClass().getName(),89904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xtnz141xdc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xca1xcaluszwfqc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xca1xcaluszwfqc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.test_invoke_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89904,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xtnz141xdc() throws Exception{try{__CLR4_1_101xca1xcaluszwfqc.R.inc(89904);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89905);String json = "{ \n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"],\n" +
                "    \"argsObjs\"   :   [ null, null ]\n" +
                "}";
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89906);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89907);assertNotNull(values);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89908);assertEquals(2, values.length);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89909);assertEquals(null, values[0]);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89910);assertEquals(null, values[1]);
    }finally{__CLR4_1_101xca1xcaluszwfqc.R.flushNeeded();}}

    public void test_invoke_list() throws Exception {__CLR4_1_101xca1xcaluszwfqc.R.globalSliceStart(getClass().getName(),89911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1030ux3z1xdj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xca1xcaluszwfqc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xca1xcaluszwfqc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.test_invoke_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89911,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1030ux3z1xdj() throws Exception{try{__CLR4_1_101xca1xcaluszwfqc.R.inc(89911);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89912);String json = "{ \n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"java.util.List\"],\n" +
                "    \"argsObjs\"   :   [ \"abc\", [" +
                "{" +
                "   \"value\":\"xxx\"" +
                "   }] ]\n" +
                "}";
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89913);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89914);assertNotNull(values);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89915);assertEquals(2, values.length);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89916);assertEquals("abc", values[0]);

        __CLR4_1_101xca1xcaluszwfqc.R.inc(89917);List list = (List) values[1];
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89918);assertEquals("xxx", ((Model) list.get(0)).value);
    }finally{__CLR4_1_101xca1xcaluszwfqc.R.flushNeeded();}}

    public void test_invoke_list_f4() throws Exception {__CLR4_1_101xca1xcaluszwfqc.R.globalSliceStart(getClass().getName(),89919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1050e9dw1xdr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xca1xcaluszwfqc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xca1xcaluszwfqc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.test_invoke_list_f4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89919,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1050e9dw1xdr() throws Exception{try{__CLR4_1_101xca1xcaluszwfqc.R.inc(89919);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89920);String json = "{\n" +
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
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89921);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89922);assertNotNull(values);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89923);assertEquals(1, values.length);

        __CLR4_1_101xca1xcaluszwfqc.R.inc(89924);List list = (List) values[0];
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89925);assertEquals("123", ((User) list.get(0)).name);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89926);assertEquals("123", ((User) list.get(1)).name);
    }finally{__CLR4_1_101xca1xcaluszwfqc.R.flushNeeded();}}

    public void test_invoke_list_f5() throws Exception {__CLR4_1_101xca1xcaluszwfqc.R.globalSliceStart(getClass().getName(),89927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101realf1xdz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xca1xcaluszwfqc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xca1xcaluszwfqc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.test_invoke_list_f5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89927,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101realf1xdz() throws Exception{try{__CLR4_1_101xca1xcaluszwfqc.R.inc(89927);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89928);String json = " [\n" +
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
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89929);System.out.println(json);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89930);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89931);assertNotNull(values);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89932);assertEquals(1, values.length);

        __CLR4_1_101xca1xcaluszwfqc.R.inc(89933);List list = (List) values[0];
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89934);assertEquals("123", ((User) list.get(0)).name);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89935);assertEquals("123", ((User) list.get(1)).name);
    }finally{__CLR4_1_101xca1xcaluszwfqc.R.flushNeeded();}}

    public void test_invoke_array() throws Exception {__CLR4_1_101xca1xcaluszwfqc.R.globalSliceStart(getClass().getName(),89936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ufwsai1xe8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xca1xcaluszwfqc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xca1xcaluszwfqc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.test_invoke_array",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89936,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ufwsai1xe8() throws Exception{try{__CLR4_1_101xca1xcaluszwfqc.R.inc(89936);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89937);String json = "{\n" +
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
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89938);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89939);assertNotNull(values);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89940);assertEquals(1, values.length);

        __CLR4_1_101xca1xcaluszwfqc.R.inc(89941);User[] list = (User[]) values[0];
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89942);assertEquals("123", ((User) list[0]).name);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89943);assertEquals("123", ((User) list[1]).name);
    }finally{__CLR4_1_101xca1xcaluszwfqc.R.flushNeeded();}}

//    public void test_perf() throws Exception {
//        for (int i = 0; i < 5; ++i) {
//            perf(); // 723
//        }
//    }

    void perf() throws Exception {try{__CLR4_1_101xca1xcaluszwfqc.R.inc(89944);
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89945);long start = System.currentTimeMillis();
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89946);String json = "{ \n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"],\n" +
                "    \"argsObjs\"   :   [ \"abc\", {\"value\":\"xxx\"} ]\n" +
                "}";
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89947);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_1_101xca1xcaluszwfqc.R.iget(89948)!=0|true))||(__CLR4_1_101xca1xcaluszwfqc.R.iget(89949)==0&false)); ++i) {{
            __CLR4_1_101xca1xcaluszwfqc.R.inc(89950);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        }
        }__CLR4_1_101xca1xcaluszwfqc.R.inc(89951);long millis = System.currentTimeMillis() - start;
        __CLR4_1_101xca1xcaluszwfqc.R.inc(89952);System.out.println("millis : " + millis);
    }finally{__CLR4_1_101xca1xcaluszwfqc.R.flushNeeded();}}

    public static class Service {
        public void f1() {try{__CLR4_1_101xca1xcaluszwfqc.R.inc(89953);

        }finally{__CLR4_1_101xca1xcaluszwfqc.R.flushNeeded();}}

        public void f2(String name, Model model) {try{__CLR4_1_101xca1xcaluszwfqc.R.inc(89954);

        }finally{__CLR4_1_101xca1xcaluszwfqc.R.flushNeeded();}}

        public void f3(String name, List<Model> models) {try{__CLR4_1_101xca1xcaluszwfqc.R.inc(89955);

        }finally{__CLR4_1_101xca1xcaluszwfqc.R.flushNeeded();}}

        public void f4( List<User> models) {try{__CLR4_1_101xca1xcaluszwfqc.R.inc(89956);

        }finally{__CLR4_1_101xca1xcaluszwfqc.R.flushNeeded();}}

        public void f4( User[] models) {try{__CLR4_1_101xca1xcaluszwfqc.R.inc(89957);

        }finally{__CLR4_1_101xca1xcaluszwfqc.R.flushNeeded();}}
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
