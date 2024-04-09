/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.util.IOUtils;
import junit.framework.TestCase;

import java.io.InputStream;
import java.io.InputStreamReader;

public class BookEvalTest extends TestCase {static class __CLR4_5_21p8h1p8hlusvnf9b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,79401,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private JSONObject root;

    protected void setUp() throws Exception {try{__CLR4_5_21p8h1p8hlusvnf9b.R.inc(79361);
        __CLR4_5_21p8h1p8hlusvnf9b.R.inc(79362);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("json/book.json");
        __CLR4_5_21p8h1p8hlusvnf9b.R.inc(79363);InputStreamReader reader = new InputStreamReader(is);
        __CLR4_5_21p8h1p8hlusvnf9b.R.inc(79364);String json = IOUtils.readAll(reader);
        __CLR4_5_21p8h1p8hlusvnf9b.R.inc(79365);IOUtils.close(reader);

        __CLR4_5_21p8h1p8hlusvnf9b.R.inc(79366);root = (JSONObject) JSON.parse(json, Feature.OrderedField);
    }finally{__CLR4_5_21p8h1p8hlusvnf9b.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceStart(getClass().getName(),79367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21p8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p8h1p8hlusvnf9b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79367,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21p8n() throws Exception{try{__CLR4_5_21p8h1p8hlusvnf9b.R.inc(79367);
        __CLR4_5_21p8h1p8hlusvnf9b.R.inc(79368);assertEquals(4, JSONPath.eval(root, "$..book.length()"));
    }finally{__CLR4_5_21p8h1p8hlusvnf9b.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceStart(getClass().getName(),79369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1p8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p8h1p8hlusvnf9b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79369,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1p8p() throws Exception{try{__CLR4_5_21p8h1p8hlusvnf9b.R.inc(79369);
        __CLR4_5_21p8h1p8hlusvnf9b.R.inc(79370);assertEquals("[\"reference\",\"Nigel Rees\",\"Sayings of the Century\",8.95,\"fiction\",\"Evelyn Waugh\",\"Sword of Honour\",12.99,\"fiction\",\"Herman Melville\",\"Moby Dick\",\"0-553-21311-3\",8.99,\"fiction\",\"J. R. R. Tolkien\",\"The Lord of the Rings\",\"0-395-19395-8\",22.99,\"red\",19.95,10]"
                , JSON.toJSONString(JSONPath.eval(root, "$..*")));
    }finally{__CLR4_5_21p8h1p8hlusvnf9b.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceStart(getClass().getName(),79371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441p8r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p8h1p8hlusvnf9b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79371,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441p8r() throws Exception{try{__CLR4_5_21p8h1p8hlusvnf9b.R.inc(79371);
        __CLR4_5_21p8h1p8hlusvnf9b.R.inc(79372);assertEquals("[\"Nigel Rees\",\"Evelyn Waugh\",\"Herman Melville\",\"J. R. R. Tolkien\"]", JSON.toJSONString(JSONPath.eval(root, "$.store.book[*].author")));
    }finally{__CLR4_5_21p8h1p8hlusvnf9b.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceStart(getClass().getName(),79373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1p8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p8h1p8hlusvnf9b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79373,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1p8t() throws Exception{try{__CLR4_5_21p8h1p8hlusvnf9b.R.inc(79373);
        __CLR4_5_21p8h1p8hlusvnf9b.R.inc(79374);assertEquals("[\"Nigel Rees\",\"Evelyn Waugh\",\"Herman Melville\",\"J. R. R. Tolkien\"]", JSON.toJSONString(JSONPath.eval(root, "$..author")));
    }finally{__CLR4_5_21p8h1p8hlusvnf9b.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceStart(getClass().getName(),79375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61p8v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p8h1p8hlusvnf9b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79375,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61p8v() throws Exception{try{__CLR4_5_21p8h1p8hlusvnf9b.R.inc(79375);
        __CLR4_5_21p8h1p8hlusvnf9b.R.inc(79376);assertEquals("[8.95,12.99,8.99,22.99,19.95]", JSON.toJSONString(JSONPath.eval(root, "$..price")));
    }finally{__CLR4_5_21p8h1p8hlusvnf9b.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceStart(getClass().getName(),79377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1p8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p8h1p8hlusvnf9b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79377,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1p8x() throws Exception{try{__CLR4_5_21p8h1p8hlusvnf9b.R.inc(79377);
        __CLR4_5_21p8h1p8hlusvnf9b.R.inc(79378);assertEquals("[8.95,12.99,8.99,22.99]", JSON.toJSONString(JSONPath.eval(root, "$..book.price")));
    }finally{__CLR4_5_21p8h1p8hlusvnf9b.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceStart(getClass().getName(),79379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81p8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p8h1p8hlusvnf9b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79379,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81p8z() throws Exception{try{__CLR4_5_21p8h1p8hlusvnf9b.R.inc(79379);
        __CLR4_5_21p8h1p8hlusvnf9b.R.inc(79380);assertEquals("[[{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95},{\"category\":\"fiction\",\"author\":\"Evelyn Waugh\",\"title\":\"Sword of Honour\",\"price\":12.99},{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99},{\"category\":\"fiction\",\"author\":\"J. R. R. Tolkien\",\"title\":\"The Lord of the Rings\",\"isbn\":\"0-395-19395-8\",\"price\":22.99}],{\"color\":\"red\",\"price\":19.95}]"
                , JSON.toJSONString(JSONPath.eval(root, "$.store.*")));
    }finally{__CLR4_5_21p8h1p8hlusvnf9b.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceStart(getClass().getName(),79381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1p91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p8h1p8hlusvnf9b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79381,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1p91() throws Exception{try{__CLR4_5_21p8h1p8hlusvnf9b.R.inc(79381);
        __CLR4_5_21p8h1p8hlusvnf9b.R.inc(79382);assertEquals("[8.95,12.99,8.99,22.99,19.95]"
                , JSON.toJSONString(JSONPath.eval(root, "$.store..price")));
    }finally{__CLR4_5_21p8h1p8hlusvnf9b.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceStart(getClass().getName(),79383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq1p93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p8h1p8hlusvnf9b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79383,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq1p93() throws Exception{try{__CLR4_5_21p8h1p8hlusvnf9b.R.inc(79383);
        __CLR4_5_21p8h1p8hlusvnf9b.R.inc(79384);assertEquals("{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99}"
                , JSON.toJSONString(JSONPath.eval(root, "$..book[2]")));
    }finally{__CLR4_5_21p8h1p8hlusvnf9b.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceStart(getClass().getName(),79385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f71p95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p8h1p8hlusvnf9b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79385,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f71p95() throws Exception{try{__CLR4_5_21p8h1p8hlusvnf9b.R.inc(79385);
        __CLR4_5_21p8h1p8hlusvnf9b.R.inc(79386);assertEquals("{\"category\":\"fiction\",\"author\":\"J. R. R. Tolkien\",\"title\":\"The Lord of the Rings\",\"isbn\":\"0-395-19395-8\",\"price\":22.99}"
                , JSON.toJSONString(JSONPath.eval(root, "$..book[-1]")));
    }finally{__CLR4_5_21p8h1p8hlusvnf9b.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceStart(getClass().getName(),79387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3oj7x1p97();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p8h1p8hlusvnf9b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79387,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3oj7x1p97() throws Exception{try{__CLR4_5_21p8h1p8hlusvnf9b.R.inc(79387);
        __CLR4_5_21p8h1p8hlusvnf9b.R.inc(79388);assertEquals("[{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95},{\"category\":\"fiction\",\"author\":\"Evelyn Waugh\",\"title\":\"Sword of Honour\",\"price\":12.99}]"
                , JSON.toJSONString(JSONPath.eval(root, "$..book[0,1]")));
    }finally{__CLR4_5_21p8h1p8hlusvnf9b.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceStart(getClass().getName(),79389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uokfg1p99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p8h1p8hlusvnf9b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79389,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uokfg1p99() throws Exception{try{__CLR4_5_21p8h1p8hlusvnf9b.R.inc(79389);
        __CLR4_5_21p8h1p8hlusvnf9b.R.inc(79390);assertEquals("[{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99},{\"category\":\"fiction\",\"author\":\"J. R. R. Tolkien\",\"title\":\"The Lord of the Rings\",\"isbn\":\"0-395-19395-8\",\"price\":22.99}]"
                , JSON.toJSONString(JSONPath.eval(root, "$..book[?(@.isbn)]")));
    }finally{__CLR4_5_21p8h1p8hlusvnf9b.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceStart(getClass().getName(),79391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lolmz1p9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p8h1p8hlusvnf9b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79391,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lolmz1p9b() throws Exception{try{__CLR4_5_21p8h1p8hlusvnf9b.R.inc(79391);
        __CLR4_5_21p8h1p8hlusvnf9b.R.inc(79392);assertEquals("[{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95},{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99}]"
                , JSON.toJSONString(JSONPath.eval(root, "$.store.book[?(@.price < 10)]")));
    }finally{__CLR4_5_21p8h1p8hlusvnf9b.R.flushNeeded();}}

    public void test_13() throws Exception {__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceStart(getClass().getName(),79393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22comui1p9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p8h1p8hlusvnf9b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79393,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22comui1p9d() throws Exception{try{__CLR4_5_21p8h1p8hlusvnf9b.R.inc(79393);
        __CLR4_5_21p8h1p8hlusvnf9b.R.inc(79394);assertEquals("[{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95},{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99}]"
                , JSON.toJSONString(JSONPath.eval(root, "$..book[?(@.price <= $['expensive'])]")));
    }finally{__CLR4_5_21p8h1p8hlusvnf9b.R.flushNeeded();}}

    public void test_14() throws Exception {__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceStart(getClass().getName(),79395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wbbxz1p9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p8h1p8hlusvnf9b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79395,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wbbxz1p9f() throws Exception{try{__CLR4_5_21p8h1p8hlusvnf9b.R.inc(79395);
        __CLR4_5_21p8h1p8hlusvnf9b.R.inc(79396);assertEquals("[{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95}]"
                , JSON.toJSONString(JSONPath.eval(root, "$..book[?(@.author =~ /.*REES/i)]")));
    }finally{__CLR4_5_21p8h1p8hlusvnf9b.R.flushNeeded();}}

    public void test_15() throws Exception {__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceStart(getClass().getName(),79397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_245baqg1p9h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p8h1p8hlusvnf9b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79397,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_245baqg1p9h() throws Exception{try{__CLR4_5_21p8h1p8hlusvnf9b.R.inc(79397);
        __CLR4_5_21p8h1p8hlusvnf9b.R.inc(79398);assertEquals("[{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95}]"
                , JSON.toJSONString(JSONPath.eval(root, "$..book[?(@.author =~ /.*REES/i)]")));
    }finally{__CLR4_5_21p8h1p8hlusvnf9b.R.flushNeeded();}}

    public void test_16() throws Exception {__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceStart(getClass().getName(),79399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27eb9ix1p9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p8h1p8hlusvnf9b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p8h1p8hlusvnf9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.BookEvalTest.test_16",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79399,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27eb9ix1p9j() throws Exception{try{__CLR4_5_21p8h1p8hlusvnf9b.R.inc(79399);
        __CLR4_5_21p8h1p8hlusvnf9b.R.inc(79400);assertEquals("[{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99}]"
                , JSON.toJSONString(JSONPath.eval(root, "$.store.book[?(@.price < 10 && @.category == 'fiction')]")));
    }finally{__CLR4_5_21p8h1p8hlusvnf9b.R.flushNeeded();}}

}
