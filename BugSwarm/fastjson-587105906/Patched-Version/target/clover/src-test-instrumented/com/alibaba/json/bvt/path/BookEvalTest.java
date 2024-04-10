/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.util.IOUtils;
import junit.framework.TestCase;

import java.io.InputStream;
import java.io.InputStreamReader;

public class BookEvalTest extends TestCase {static class __CLR4_5_21oa91oa9lusyjuhc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,78169,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private JSONObject root;

    protected void setUp() throws Exception {try{__CLR4_5_21oa91oa9lusyjuhc.R.inc(78129);
        __CLR4_5_21oa91oa9lusyjuhc.R.inc(78130);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("json/book.json");
        __CLR4_5_21oa91oa9lusyjuhc.R.inc(78131);InputStreamReader reader = new InputStreamReader(is);
        __CLR4_5_21oa91oa9lusyjuhc.R.inc(78132);String json = IOUtils.readAll(reader);
        __CLR4_5_21oa91oa9lusyjuhc.R.inc(78133);IOUtils.close(reader);

        __CLR4_5_21oa91oa9lusyjuhc.R.inc(78134);root = (JSONObject) JSON.parse(json, Feature.OrderedField);
    }finally{__CLR4_5_21oa91oa9lusyjuhc.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceStart(getClass().getName(),78135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21oaf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa91oa9lusyjuhc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78135,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21oaf() throws Exception{try{__CLR4_5_21oa91oa9lusyjuhc.R.inc(78135);
        __CLR4_5_21oa91oa9lusyjuhc.R.inc(78136);assertEquals(4, JSONPath.eval(root, "$..book.length()"));
    }finally{__CLR4_5_21oa91oa9lusyjuhc.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceStart(getClass().getName(),78137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1oah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa91oa9lusyjuhc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78137,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1oah() throws Exception{try{__CLR4_5_21oa91oa9lusyjuhc.R.inc(78137);
        __CLR4_5_21oa91oa9lusyjuhc.R.inc(78138);assertEquals("[\"reference\",\"Nigel Rees\",\"Sayings of the Century\",8.95,\"fiction\",\"Evelyn Waugh\",\"Sword of Honour\",12.99,\"fiction\",\"Herman Melville\",\"Moby Dick\",\"0-553-21311-3\",8.99,\"fiction\",\"J. R. R. Tolkien\",\"The Lord of the Rings\",\"0-395-19395-8\",22.99,\"red\",19.95,10]"
                , JSON.toJSONString(JSONPath.eval(root, "$..*")));
    }finally{__CLR4_5_21oa91oa9lusyjuhc.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceStart(getClass().getName(),78139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441oaj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa91oa9lusyjuhc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78139,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441oaj() throws Exception{try{__CLR4_5_21oa91oa9lusyjuhc.R.inc(78139);
        __CLR4_5_21oa91oa9lusyjuhc.R.inc(78140);assertEquals("[\"Nigel Rees\",\"Evelyn Waugh\",\"Herman Melville\",\"J. R. R. Tolkien\"]", JSON.toJSONString(JSONPath.eval(root, "$.store.book[*].author")));
    }finally{__CLR4_5_21oa91oa9lusyjuhc.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceStart(getClass().getName(),78141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1oal();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa91oa9lusyjuhc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78141,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1oal() throws Exception{try{__CLR4_5_21oa91oa9lusyjuhc.R.inc(78141);
        __CLR4_5_21oa91oa9lusyjuhc.R.inc(78142);assertEquals("[\"Nigel Rees\",\"Evelyn Waugh\",\"Herman Melville\",\"J. R. R. Tolkien\"]", JSON.toJSONString(JSONPath.eval(root, "$..author")));
    }finally{__CLR4_5_21oa91oa9lusyjuhc.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceStart(getClass().getName(),78143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61oan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa91oa9lusyjuhc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78143,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61oan() throws Exception{try{__CLR4_5_21oa91oa9lusyjuhc.R.inc(78143);
        __CLR4_5_21oa91oa9lusyjuhc.R.inc(78144);assertEquals("[8.95,12.99,8.99,22.99,19.95]", JSON.toJSONString(JSONPath.eval(root, "$..price")));
    }finally{__CLR4_5_21oa91oa9lusyjuhc.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceStart(getClass().getName(),78145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1oap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa91oa9lusyjuhc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78145,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1oap() throws Exception{try{__CLR4_5_21oa91oa9lusyjuhc.R.inc(78145);
        __CLR4_5_21oa91oa9lusyjuhc.R.inc(78146);assertEquals("[8.95,12.99,8.99,22.99]", JSON.toJSONString(JSONPath.eval(root, "$..book.price")));
    }finally{__CLR4_5_21oa91oa9lusyjuhc.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceStart(getClass().getName(),78147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81oar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa91oa9lusyjuhc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78147,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81oar() throws Exception{try{__CLR4_5_21oa91oa9lusyjuhc.R.inc(78147);
        __CLR4_5_21oa91oa9lusyjuhc.R.inc(78148);assertEquals("[[{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95},{\"category\":\"fiction\",\"author\":\"Evelyn Waugh\",\"title\":\"Sword of Honour\",\"price\":12.99},{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99},{\"category\":\"fiction\",\"author\":\"J. R. R. Tolkien\",\"title\":\"The Lord of the Rings\",\"isbn\":\"0-395-19395-8\",\"price\":22.99}],{\"color\":\"red\",\"price\":19.95}]"
                , JSON.toJSONString(JSONPath.eval(root, "$.store.*")));
    }finally{__CLR4_5_21oa91oa9lusyjuhc.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceStart(getClass().getName(),78149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1oat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa91oa9lusyjuhc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78149,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1oat() throws Exception{try{__CLR4_5_21oa91oa9lusyjuhc.R.inc(78149);
        __CLR4_5_21oa91oa9lusyjuhc.R.inc(78150);assertEquals("[8.95,12.99,8.99,22.99,19.95]"
                , JSON.toJSONString(JSONPath.eval(root, "$.store..price")));
    }finally{__CLR4_5_21oa91oa9lusyjuhc.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceStart(getClass().getName(),78151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq1oav();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa91oa9lusyjuhc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78151,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq1oav() throws Exception{try{__CLR4_5_21oa91oa9lusyjuhc.R.inc(78151);
        __CLR4_5_21oa91oa9lusyjuhc.R.inc(78152);assertEquals("{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99}"
                , JSON.toJSONString(JSONPath.eval(root, "$..book[2]")));
    }finally{__CLR4_5_21oa91oa9lusyjuhc.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceStart(getClass().getName(),78153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f71oax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa91oa9lusyjuhc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78153,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f71oax() throws Exception{try{__CLR4_5_21oa91oa9lusyjuhc.R.inc(78153);
        __CLR4_5_21oa91oa9lusyjuhc.R.inc(78154);assertEquals("{\"category\":\"fiction\",\"author\":\"J. R. R. Tolkien\",\"title\":\"The Lord of the Rings\",\"isbn\":\"0-395-19395-8\",\"price\":22.99}"
                , JSON.toJSONString(JSONPath.eval(root, "$..book[-1]")));
    }finally{__CLR4_5_21oa91oa9lusyjuhc.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceStart(getClass().getName(),78155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3oj7x1oaz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa91oa9lusyjuhc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78155,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3oj7x1oaz() throws Exception{try{__CLR4_5_21oa91oa9lusyjuhc.R.inc(78155);
        __CLR4_5_21oa91oa9lusyjuhc.R.inc(78156);assertEquals("[{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95},{\"category\":\"fiction\",\"author\":\"Evelyn Waugh\",\"title\":\"Sword of Honour\",\"price\":12.99}]"
                , JSON.toJSONString(JSONPath.eval(root, "$..book[0,1]")));
    }finally{__CLR4_5_21oa91oa9lusyjuhc.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceStart(getClass().getName(),78157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uokfg1ob1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa91oa9lusyjuhc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78157,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uokfg1ob1() throws Exception{try{__CLR4_5_21oa91oa9lusyjuhc.R.inc(78157);
        __CLR4_5_21oa91oa9lusyjuhc.R.inc(78158);assertEquals("[{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99},{\"category\":\"fiction\",\"author\":\"J. R. R. Tolkien\",\"title\":\"The Lord of the Rings\",\"isbn\":\"0-395-19395-8\",\"price\":22.99}]"
                , JSON.toJSONString(JSONPath.eval(root, "$..book[?(@.isbn)]")));
    }finally{__CLR4_5_21oa91oa9lusyjuhc.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceStart(getClass().getName(),78159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lolmz1ob3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa91oa9lusyjuhc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78159,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lolmz1ob3() throws Exception{try{__CLR4_5_21oa91oa9lusyjuhc.R.inc(78159);
        __CLR4_5_21oa91oa9lusyjuhc.R.inc(78160);assertEquals("[{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95},{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99}]"
                , JSON.toJSONString(JSONPath.eval(root, "$.store.book[?(@.price < 10)]")));
    }finally{__CLR4_5_21oa91oa9lusyjuhc.R.flushNeeded();}}

    public void test_13() throws Exception {__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceStart(getClass().getName(),78161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22comui1ob5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa91oa9lusyjuhc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78161,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22comui1ob5() throws Exception{try{__CLR4_5_21oa91oa9lusyjuhc.R.inc(78161);
        __CLR4_5_21oa91oa9lusyjuhc.R.inc(78162);assertEquals("[{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95},{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99}]"
                , JSON.toJSONString(JSONPath.eval(root, "$..book[?(@.price <= $['expensive'])]")));
    }finally{__CLR4_5_21oa91oa9lusyjuhc.R.flushNeeded();}}

    public void test_14() throws Exception {__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceStart(getClass().getName(),78163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wbbxz1ob7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa91oa9lusyjuhc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78163,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wbbxz1ob7() throws Exception{try{__CLR4_5_21oa91oa9lusyjuhc.R.inc(78163);
        __CLR4_5_21oa91oa9lusyjuhc.R.inc(78164);assertEquals("[{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95}]"
                , JSON.toJSONString(JSONPath.eval(root, "$..book[?(@.author =~ /.*REES/i)]")));
    }finally{__CLR4_5_21oa91oa9lusyjuhc.R.flushNeeded();}}

    public void test_15() throws Exception {__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceStart(getClass().getName(),78165);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_245baqg1ob9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa91oa9lusyjuhc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78165,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_245baqg1ob9() throws Exception{try{__CLR4_5_21oa91oa9lusyjuhc.R.inc(78165);
        __CLR4_5_21oa91oa9lusyjuhc.R.inc(78166);assertEquals("[{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95}]"
                , JSON.toJSONString(JSONPath.eval(root, "$..book[?(@.author =~ /.*REES/i)]")));
    }finally{__CLR4_5_21oa91oa9lusyjuhc.R.flushNeeded();}}

    public void test_16() throws Exception {__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceStart(getClass().getName(),78167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27eb9ix1obb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa91oa9lusyjuhc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa91oa9lusyjuhc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_16",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78167,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27eb9ix1obb() throws Exception{try{__CLR4_5_21oa91oa9lusyjuhc.R.inc(78167);
        __CLR4_5_21oa91oa9lusyjuhc.R.inc(78168);assertEquals("[{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99}]"
                , JSON.toJSONString(JSONPath.eval(root, "$.store.book[?(@.price < 10 && @.category == 'fiction')]")));
    }finally{__CLR4_5_21oa91oa9lusyjuhc.R.flushNeeded();}}

}
