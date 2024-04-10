/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.support.hsf;

import com.alibaba.fastjson.support.hsf.HSFJSONUtils;
import com.alibaba.fastjson.support.hsf.MethodLocator;
import junit.framework.TestCase;

import java.lang.reflect.Method;
import java.util.List;

public class HSFJSONUtilsTest_0 extends TestCase {static class __CLR4_5_21wdr1wdrlusyjvi0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,88715,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Method method_f2;
    private Method method_f3;
    private Method method_f4;
    private Method method_f5;
    private MethodLocator methodLocator;

    protected void setUp() throws Exception {try{__CLR4_5_21wdr1wdrlusyjvi0.R.inc(88623);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88624);method_f2 = Service.class.getMethod("f2", String.class, Model.class);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88625);method_f3 = Service.class.getMethod("f3", String.class, List.class);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88626);method_f4 = Service.class.getMethod("f4", List.class);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88627);method_f5 = Service.class.getMethod("f4", User[].class);

        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88628);methodLocator = new MethodLocator() {
            public Method findMethod(String[] types) {try{__CLR4_5_21wdr1wdrlusyjvi0.R.inc(88629);
                __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88630);if ((((types == null)&&(__CLR4_5_21wdr1wdrlusyjvi0.R.iget(88631)!=0|true))||(__CLR4_5_21wdr1wdrlusyjvi0.R.iget(88632)==0&false))) {{
                    __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88633);return method_f2;
                }

                }__CLR4_5_21wdr1wdrlusyjvi0.R.inc(88634);if ((((types.length == 1 && types[0].equals("java.util.List"))&&(__CLR4_5_21wdr1wdrlusyjvi0.R.iget(88635)!=0|true))||(__CLR4_5_21wdr1wdrlusyjvi0.R.iget(88636)==0&false))) {{
                    __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88637);return method_f4;
                }

                }__CLR4_5_21wdr1wdrlusyjvi0.R.inc(88638);if ((((types.length == 1 && types[0].equals("com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.User[]"))&&(__CLR4_5_21wdr1wdrlusyjvi0.R.iget(88639)!=0|true))||(__CLR4_5_21wdr1wdrlusyjvi0.R.iget(88640)==0&false))) {{
                    __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88641);return method_f5;
                }

                }__CLR4_5_21wdr1wdrlusyjvi0.R.inc(88642);if ((((types[1].equals("java.util.List"))&&(__CLR4_5_21wdr1wdrlusyjvi0.R.iget(88643)!=0|true))||(__CLR4_5_21wdr1wdrlusyjvi0.R.iget(88644)==0&false))) {{
                    __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88645);return method_f3;
                }

                }__CLR4_5_21wdr1wdrlusyjvi0.R.inc(88646);return method_f2;
            }finally{__CLR4_5_21wdr1wdrlusyjvi0.R.flushNeeded();}}
        };
    }finally{__CLR4_5_21wdr1wdrlusyjvi0.R.flushNeeded();}}

    public void test_invoke() throws Exception {__CLR4_5_21wdr1wdrlusyjvi0.R.globalSliceStart(getClass().getName(),88647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iur6ac1wef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wdr1wdrlusyjvi0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wdr1wdrlusyjvi0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.test_invoke",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88647,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iur6ac1wef() throws Exception{try{__CLR4_5_21wdr1wdrlusyjvi0.R.inc(88647);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88648);String json = "{ \n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"],\n" +
                "    \"argsObjs\"   :   [ \"abc\", {\"value\":\"xxx\"} ]\n" +
                "}";
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88649);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88650);assertNotNull(values);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88651);assertEquals(2, values.length);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88652);assertEquals("abc", values[0]);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88653);assertEquals("xxx", ((Model) values[1]).value);
    }finally{__CLR4_5_21wdr1wdrlusyjvi0.R.flushNeeded();}}

    public void test_invoke_1() throws Exception {__CLR4_5_21wdr1wdrlusyjvi0.R.globalSliceStart(getClass().getName(),88654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21wwjtu1wem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wdr1wdrlusyjvi0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wdr1wdrlusyjvi0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.test_invoke_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88654,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21wwjtu1wem() throws Exception{try{__CLR4_5_21wdr1wdrlusyjvi0.R.inc(88654);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88655);String json = "{ \n" +
                "    \"argsObjs\"   :   [ \"abc\", {\"value\":\"xxx\"} ]\n" +
                "}";
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88656);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88657);assertNotNull(values);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88658);assertEquals(2, values.length);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88659);assertEquals("abc", values[0]);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88660);assertEquals("xxx", ((Model) values[1]).value);
    }finally{__CLR4_5_21wdr1wdrlusyjvi0.R.flushNeeded();}}

    public void test_invoke_null() throws Exception {__CLR4_5_21wdr1wdrlusyjvi0.R.globalSliceStart(getClass().getName(),88661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xtnz141wet();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wdr1wdrlusyjvi0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wdr1wdrlusyjvi0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.test_invoke_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88661,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xtnz141wet() throws Exception{try{__CLR4_5_21wdr1wdrlusyjvi0.R.inc(88661);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88662);String json = "{ \n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"],\n" +
                "    \"argsObjs\"   :   [ null, null ]\n" +
                "}";
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88663);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88664);assertNotNull(values);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88665);assertEquals(2, values.length);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88666);assertEquals(null, values[0]);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88667);assertEquals(null, values[1]);
    }finally{__CLR4_5_21wdr1wdrlusyjvi0.R.flushNeeded();}}

    public void test_invoke_list() throws Exception {__CLR4_5_21wdr1wdrlusyjvi0.R.globalSliceStart(getClass().getName(),88668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_230ux3z1wf0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wdr1wdrlusyjvi0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wdr1wdrlusyjvi0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.test_invoke_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88668,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_230ux3z1wf0() throws Exception{try{__CLR4_5_21wdr1wdrlusyjvi0.R.inc(88668);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88669);String json = "{ \n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"java.util.List\"],\n" +
                "    \"argsObjs\"   :   [ \"abc\", [" +
                "{" +
                "   \"value\":\"xxx\"" +
                "   }] ]\n" +
                "}";
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88670);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88671);assertNotNull(values);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88672);assertEquals(2, values.length);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88673);assertEquals("abc", values[0]);

        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88674);List list = (List) values[1];
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88675);assertEquals("xxx", ((Model) list.get(0)).value);
    }finally{__CLR4_5_21wdr1wdrlusyjvi0.R.flushNeeded();}}

    public void test_invoke_list_f4() throws Exception {__CLR4_5_21wdr1wdrlusyjvi0.R.globalSliceStart(getClass().getName(),88676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_250e9dw1wf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wdr1wdrlusyjvi0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wdr1wdrlusyjvi0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.test_invoke_list_f4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88676,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_250e9dw1wf8() throws Exception{try{__CLR4_5_21wdr1wdrlusyjvi0.R.inc(88676);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88677);String json = "{\n" +
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
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88678);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88679);assertNotNull(values);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88680);assertEquals(1, values.length);

        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88681);List list = (List) values[0];
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88682);assertEquals("123", ((User) list.get(0)).name);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88683);assertEquals("123", ((User) list.get(1)).name);
    }finally{__CLR4_5_21wdr1wdrlusyjvi0.R.flushNeeded();}}

    public void test_invoke_list_f5() throws Exception {__CLR4_5_21wdr1wdrlusyjvi0.R.globalSliceStart(getClass().getName(),88684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21realf1wfg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wdr1wdrlusyjvi0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wdr1wdrlusyjvi0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.test_invoke_list_f5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88684,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21realf1wfg() throws Exception{try{__CLR4_5_21wdr1wdrlusyjvi0.R.inc(88684);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88685);String json = " [\n" +
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
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88686);System.out.println(json);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88687);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88688);assertNotNull(values);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88689);assertEquals(1, values.length);

        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88690);List list = (List) values[0];
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88691);assertEquals("123", ((User) list.get(0)).name);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88692);assertEquals("123", ((User) list.get(1)).name);
    }finally{__CLR4_5_21wdr1wdrlusyjvi0.R.flushNeeded();}}

    public void test_invoke_array() throws Exception {__CLR4_5_21wdr1wdrlusyjvi0.R.globalSliceStart(getClass().getName(),88693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ufwsai1wfp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wdr1wdrlusyjvi0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wdr1wdrlusyjvi0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0.test_invoke_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88693,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ufwsai1wfp() throws Exception{try{__CLR4_5_21wdr1wdrlusyjvi0.R.inc(88693);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88694);String json = "{\n" +
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
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88695);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88696);assertNotNull(values);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88697);assertEquals(1, values.length);

        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88698);User[] list = (User[]) values[0];
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88699);assertEquals("123", ((User) list[0]).name);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88700);assertEquals("123", ((User) list[1]).name);
    }finally{__CLR4_5_21wdr1wdrlusyjvi0.R.flushNeeded();}}

//    public void test_perf() throws Exception {
//        for (int i = 0; i < 5; ++i) {
//            perf(); // 723
//        }
//    }

    void perf() throws Exception {try{__CLR4_5_21wdr1wdrlusyjvi0.R.inc(88701);
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88702);long start = System.currentTimeMillis();
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88703);String json = "{ \n" +
                "    \"argsTypes\"  :  [ \"java.lang.String\", \"com.alibaba.json.bvt.support.hsf.HSFJSONUtilsTest_0$Model\"],\n" +
                "    \"argsObjs\"   :   [ \"abc\", {\"value\":\"xxx\"} ]\n" +
                "}";
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88704);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_5_21wdr1wdrlusyjvi0.R.iget(88705)!=0|true))||(__CLR4_5_21wdr1wdrlusyjvi0.R.iget(88706)==0&false)); ++i) {{
            __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88707);Object[] values = HSFJSONUtils.parseInvocationArguments(json, methodLocator);
        }
        }__CLR4_5_21wdr1wdrlusyjvi0.R.inc(88708);long millis = System.currentTimeMillis() - start;
        __CLR4_5_21wdr1wdrlusyjvi0.R.inc(88709);System.out.println("millis : " + millis);
    }finally{__CLR4_5_21wdr1wdrlusyjvi0.R.flushNeeded();}}

    public static class Service {
        public void f1() {try{__CLR4_5_21wdr1wdrlusyjvi0.R.inc(88710);

        }finally{__CLR4_5_21wdr1wdrlusyjvi0.R.flushNeeded();}}

        public void f2(String name, Model model) {try{__CLR4_5_21wdr1wdrlusyjvi0.R.inc(88711);

        }finally{__CLR4_5_21wdr1wdrlusyjvi0.R.flushNeeded();}}

        public void f3(String name, List<Model> models) {try{__CLR4_5_21wdr1wdrlusyjvi0.R.inc(88712);

        }finally{__CLR4_5_21wdr1wdrlusyjvi0.R.flushNeeded();}}

        public void f4( List<User> models) {try{__CLR4_5_21wdr1wdrlusyjvi0.R.inc(88713);

        }finally{__CLR4_5_21wdr1wdrlusyjvi0.R.flushNeeded();}}

        public void f4( User[] models) {try{__CLR4_5_21wdr1wdrlusyjvi0.R.inc(88714);

        }finally{__CLR4_5_21wdr1wdrlusyjvi0.R.flushNeeded();}}
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
