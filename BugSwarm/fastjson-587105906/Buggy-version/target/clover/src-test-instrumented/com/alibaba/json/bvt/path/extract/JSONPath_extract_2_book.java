/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path.extract;

import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.util.IOUtils;
import junit.framework.TestCase;

import java.io.InputStream;
import java.io.InputStreamReader;

public class JSONPath_extract_2_book extends TestCase {static class __CLR4_1_101qxb1qxbluszwepg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,81595,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101qxb1qxbluszwepg.R.globalSliceStart(getClass().getName(),81551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21qxb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qxb1qxbluszwepg.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qxb1qxbluszwepg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81551,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21qxb() throws Exception{try{__CLR4_1_101qxb1qxbluszwepg.R.inc(81551);
        __CLR4_1_101qxb1qxbluszwepg.R.inc(81552);assertEquals("[\"Nigel Rees\",\"Evelyn Waugh\",\"Herman Melville\",\"J. R. R. Tolkien\"]"
                , JSONPath.extract(json, "$.store.book.author")
                    .toString());
    }finally{__CLR4_1_101qxb1qxbluszwepg.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101qxb1qxbluszwepg.R.globalSliceStart(getClass().getName(),81553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1qxd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qxb1qxbluszwepg.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qxb1qxbluszwepg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81553,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1qxd() throws Exception{try{__CLR4_1_101qxb1qxbluszwepg.R.inc(81553);
        __CLR4_1_101qxb1qxbluszwepg.R.inc(81554);assertEquals("[\"Nigel Rees\",\"Evelyn Waugh\",\"Herman Melville\",\"J. R. R. Tolkien\"]"
                , JSONPath.extract(json, "$.store.book[*].author")
                        .toString());
    }finally{__CLR4_1_101qxb1qxbluszwepg.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101qxb1qxbluszwepg.R.globalSliceStart(getClass().getName(),81555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441qxf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qxb1qxbluszwepg.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qxb1qxbluszwepg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81555,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441qxf() throws Exception{try{__CLR4_1_101qxb1qxbluszwepg.R.inc(81555);
        __CLR4_1_101qxb1qxbluszwepg.R.inc(81556);assertNull(JSONPath.extract(json, "$.author"));
    }finally{__CLR4_1_101qxb1qxbluszwepg.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101qxb1qxbluszwepg.R.globalSliceStart(getClass().getName(),81557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1qxh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qxb1qxbluszwepg.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qxb1qxbluszwepg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81557,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1qxh() throws Exception{try{__CLR4_1_101qxb1qxbluszwepg.R.inc(81557);
        __CLR4_1_101qxb1qxbluszwepg.R.inc(81558);assertEquals("[\"Nigel Rees\",\"Evelyn Waugh\",\"Herman Melville\",\"J. R. R. Tolkien\"]"
                , JSONPath.extract(json, "$..author")
                        .toString());
    }finally{__CLR4_1_101qxb1qxbluszwepg.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101qxb1qxbluszwepg.R.globalSliceStart(getClass().getName(),81559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61qxj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qxb1qxbluszwepg.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qxb1qxbluszwepg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81559,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61qxj() throws Exception{try{__CLR4_1_101qxb1qxbluszwepg.R.inc(81559);
        __CLR4_1_101qxb1qxbluszwepg.R.inc(81560);assertEquals("[[{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95},{\"category\":\"fiction\",\"author\":\"Evelyn Waugh\",\"title\":\"Sword of Honour\",\"price\":12.99},{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99},{\"category\":\"fiction\",\"author\":\"J. R. R. Tolkien\",\"title\":\"The Lord of the Rings\",\"isbn\":\"0-395-19395-8\",\"price\":22.99}],{\"color\":\"red\",\"price\":19.95}]"
                , JSONPath.extract(json, "$.store.*")
                        .toString());
    }finally{__CLR4_1_101qxb1qxbluszwepg.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101qxb1qxbluszwepg.R.globalSliceStart(getClass().getName(),81561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1qxl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qxb1qxbluszwepg.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qxb1qxbluszwepg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81561,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1qxl() throws Exception{try{__CLR4_1_101qxb1qxbluszwepg.R.inc(81561);
        __CLR4_1_101qxb1qxbluszwepg.R.inc(81562);assertEquals("$.store..price", "[8.95,12.99,8.99,22.99,19.95]"
                , JSONPath.extract(json, "$.store..price")
                        .toString());
    }finally{__CLR4_1_101qxb1qxbluszwepg.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_101qxb1qxbluszwepg.R.globalSliceStart(getClass().getName(),81563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81qxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qxb1qxbluszwepg.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qxb1qxbluszwepg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81563,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81qxn() throws Exception{try{__CLR4_1_101qxb1qxbluszwepg.R.inc(81563);
        __CLR4_1_101qxb1qxbluszwepg.R.inc(81564);assertEquals("{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99}"
                , JSONPath.extract(json, "$..book[2]")
                        .toString());
    }finally{__CLR4_1_101qxb1qxbluszwepg.R.flushNeeded();}}

    public void test_7  () throws Exception {__CLR4_1_101qxb1qxbluszwepg.R.globalSliceStart(getClass().getName(),81565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1qxp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qxb1qxbluszwepg.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qxb1qxbluszwepg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81565,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1qxp() throws Exception{try{__CLR4_1_101qxb1qxbluszwepg.R.inc(81565);
        __CLR4_1_101qxb1qxbluszwepg.R.inc(81566);assertEquals("[{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95},{\"category\":\"fiction\",\"author\":\"Evelyn Waugh\",\"title\":\"Sword of Honour\",\"price\":12.99}]"
                , JSONPath.extract(json, "$..book[0,1]")
                        .toString());
    }finally{__CLR4_1_101qxb1qxbluszwepg.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_1_101qxb1qxbluszwepg.R.globalSliceStart(getClass().getName(),81567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102uw8mq1qxr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qxb1qxbluszwepg.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qxb1qxbluszwepg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81567,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102uw8mq1qxr() throws Exception{try{__CLR4_1_101qxb1qxbluszwepg.R.inc(81567);
        __CLR4_1_101qxb1qxbluszwepg.R.inc(81568);assertEquals("{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99}"
                , JSONPath.extract(json, "$..book[-2]")
                        .toString());
    }finally{__CLR4_1_101qxb1qxbluszwepg.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_1_101qxb1qxbluszwepg.R.globalSliceStart(getClass().getName(),81569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1063w7f71qxt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qxb1qxbluszwepg.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qxb1qxbluszwepg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81569,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1063w7f71qxt() throws Exception{try{__CLR4_1_101qxb1qxbluszwepg.R.inc(81569);
        __CLR4_1_101qxb1qxbluszwepg.R.inc(81570);assertEquals("Nigel Rees"
                , JSONPath.extract(json, "$['store']['book'][0]['author']")
                        .toString());

        __CLR4_1_101qxb1qxbluszwepg.R.inc(81571);assertEquals("Evelyn Waugh"
                , JSONPath.extract(json, "$['store']['book'][1]['author']")
                        .toString());

        __CLR4_1_101qxb1qxbluszwepg.R.inc(81572);assertEquals("Herman Melville"
                , JSONPath.extract(json, "$['store']['book'][2]['author']")
                        .toString());

        __CLR4_1_101qxb1qxbluszwepg.R.inc(81573);assertEquals("J. R. R. Tolkien"
                , JSONPath.extract(json, "$['store']['book'][3]['author']")
                        .toString());
    }finally{__CLR4_1_101qxb1qxbluszwepg.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_1_101qxb1qxbluszwepg.R.globalSliceStart(getClass().getName(),81574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c3oj7x1qxy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qxb1qxbluszwepg.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qxb1qxbluszwepg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81574,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c3oj7x1qxy() throws Exception{try{__CLR4_1_101qxb1qxbluszwepg.R.inc(81574);
        __CLR4_1_101qxb1qxbluszwepg.R.inc(81575);assertEquals("[{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95},{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99}]"
                , JSONPath.extract(json, "$.store.book[?(@.price < 10)]")
                        .toString());
    }finally{__CLR4_1_101qxb1qxbluszwepg.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_1_101qxb1qxbluszwepg.R.globalSliceStart(getClass().getName(),81576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108uokfg1qy0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qxb1qxbluszwepg.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qxb1qxbluszwepg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81576,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108uokfg1qy0() throws Exception{try{__CLR4_1_101qxb1qxbluszwepg.R.inc(81576);
        __CLR4_1_101qxb1qxbluszwepg.R.inc(81577);assertEquals("10"
                , JSONPath.extract(json, "$.expensive")
                        .toString());
    }finally{__CLR4_1_101qxb1qxbluszwepg.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_1_101qxb1qxbluszwepg.R.globalSliceStart(getClass().getName(),81578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105lolmz1qy2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qxb1qxbluszwepg.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qxb1qxbluszwepg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81578,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105lolmz1qy2() throws Exception{try{__CLR4_1_101qxb1qxbluszwepg.R.inc(81578);
        __CLR4_1_101qxb1qxbluszwepg.R.inc(81579);assertNull(JSONPath.extract(json, "$.store.book.doesnt_exist"));
    }finally{__CLR4_1_101qxb1qxbluszwepg.R.flushNeeded();}}

    public void test_13() throws Exception {__CLR4_1_101qxb1qxbluszwepg.R.globalSliceStart(getClass().getName(),81580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102comui1qy4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qxb1qxbluszwepg.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qxb1qxbluszwepg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81580,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102comui1qy4() throws Exception{try{__CLR4_1_101qxb1qxbluszwepg.R.inc(81580);
        __CLR4_1_101qxb1qxbluszwepg.R.inc(81581);assertEquals("J. R. R. Tolkien", JSONPath.extract(json, "$.store.book[3].author"));
    }finally{__CLR4_1_101qxb1qxbluszwepg.R.flushNeeded();}}

    public void test_14() throws Exception {__CLR4_1_101qxb1qxbluszwepg.R.globalSliceStart(getClass().getName(),81582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wbbxz1qy6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qxb1qxbluszwepg.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qxb1qxbluszwepg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_14",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81582,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wbbxz1qy6() throws Exception{try{__CLR4_1_101qxb1qxbluszwepg.R.inc(81582);
        __CLR4_1_101qxb1qxbluszwepg.R.inc(81583);assertEquals("[{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95},{\"category\":\"fiction\",\"author\":\"Evelyn Waugh\",\"title\":\"Sword of Honour\",\"price\":12.99},{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99},{\"category\":\"fiction\",\"author\":\"J. R. R. Tolkien\",\"title\":\"The Lord of the Rings\",\"isbn\":\"0-395-19395-8\",\"price\":22.99}]"
                , JSONPath.extract(json, "$.store.book").toString());
    }finally{__CLR4_1_101qxb1qxbluszwepg.R.flushNeeded();}}

    public void test_15() throws Exception {__CLR4_1_101qxb1qxbluszwepg.R.globalSliceStart(getClass().getName(),81584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1045baqg1qy8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qxb1qxbluszwepg.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qxb1qxbluszwepg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_15",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81584,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1045baqg1qy8() throws Exception{try{__CLR4_1_101qxb1qxbluszwepg.R.inc(81584);
        __CLR4_1_101qxb1qxbluszwepg.R.inc(81585);assertEquals("{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95}"
                , JSONPath.extract(json, "$[\"store\"][\"book\"][0]").toString());
    }finally{__CLR4_1_101qxb1qxbluszwepg.R.flushNeeded();}}

    public void test_16() throws Exception {__CLR4_1_101qxb1qxbluszwepg.R.globalSliceStart(getClass().getName(),81586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107eb9ix1qya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qxb1qxbluszwepg.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qxb1qxbluszwepg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_16",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81586,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107eb9ix1qya() throws Exception{try{__CLR4_1_101qxb1qxbluszwepg.R.inc(81586);
        __CLR4_1_101qxb1qxbluszwepg.R.inc(81587);assertNull(JSONPath.extract(json, "$.store.object.inner_object.array[0].inner_array[0].x"));
    }finally{__CLR4_1_101qxb1qxbluszwepg.R.flushNeeded();}}

    public void test_17() throws Exception {__CLR4_1_101qxb1qxbluszwepg.R.globalSliceStart(getClass().getName(),81588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10anb8be1qyc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qxb1qxbluszwepg.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qxb1qxbluszwepg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_17",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81588,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10anb8be1qyc() throws Exception{try{__CLR4_1_101qxb1qxbluszwepg.R.inc(81588);
        __CLR4_1_101qxb1qxbluszwepg.R.inc(81589);assertEquals(4, JSONPath.extract(json, "$..book.length()"));
    }finally{__CLR4_1_101qxb1qxbluszwepg.R.flushNeeded();}}


    private static String json;
    static {try{__CLR4_1_101qxb1qxbluszwepg.R.inc(81590);
        __CLR4_1_101qxb1qxbluszwepg.R.inc(81591);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("json/book.json");
        __CLR4_1_101qxb1qxbluszwepg.R.inc(81592);InputStreamReader reader = new InputStreamReader(is);
        __CLR4_1_101qxb1qxbluszwepg.R.inc(81593);json = IOUtils.readAll(reader);
        __CLR4_1_101qxb1qxbluszwepg.R.inc(81594);IOUtils.close(reader);
    }finally{__CLR4_1_101qxb1qxbluszwepg.R.flushNeeded();}}
}
