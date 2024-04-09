/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path.extract;

import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.util.IOUtils;
import junit.framework.TestCase;

import java.io.InputStream;
import java.io.InputStreamReader;

public class JSONPath_extract_2_book extends TestCase {static class __CLR4_1_101pz31pz3lusqkixy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,80363,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101pz31pz3lusqkixy.R.globalSliceStart(getClass().getName(),80319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21pz3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pz31pz3lusqkixy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pz31pz3lusqkixy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80319,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21pz3() throws Exception{try{__CLR4_1_101pz31pz3lusqkixy.R.inc(80319);
        __CLR4_1_101pz31pz3lusqkixy.R.inc(80320);assertEquals("[\"Nigel Rees\",\"Evelyn Waugh\",\"Herman Melville\",\"J. R. R. Tolkien\"]"
                , JSONPath.extract(json, "$.store.book.author")
                    .toString());
    }finally{__CLR4_1_101pz31pz3lusqkixy.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101pz31pz3lusqkixy.R.globalSliceStart(getClass().getName(),80321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1pz5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pz31pz3lusqkixy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pz31pz3lusqkixy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80321,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1pz5() throws Exception{try{__CLR4_1_101pz31pz3lusqkixy.R.inc(80321);
        __CLR4_1_101pz31pz3lusqkixy.R.inc(80322);assertEquals("[\"Nigel Rees\",\"Evelyn Waugh\",\"Herman Melville\",\"J. R. R. Tolkien\"]"
                , JSONPath.extract(json, "$.store.book[*].author")
                        .toString());
    }finally{__CLR4_1_101pz31pz3lusqkixy.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101pz31pz3lusqkixy.R.globalSliceStart(getClass().getName(),80323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441pz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pz31pz3lusqkixy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pz31pz3lusqkixy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80323,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441pz7() throws Exception{try{__CLR4_1_101pz31pz3lusqkixy.R.inc(80323);
        __CLR4_1_101pz31pz3lusqkixy.R.inc(80324);assertNull(JSONPath.extract(json, "$.author"));
    }finally{__CLR4_1_101pz31pz3lusqkixy.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101pz31pz3lusqkixy.R.globalSliceStart(getClass().getName(),80325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1pz9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pz31pz3lusqkixy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pz31pz3lusqkixy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80325,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1pz9() throws Exception{try{__CLR4_1_101pz31pz3lusqkixy.R.inc(80325);
        __CLR4_1_101pz31pz3lusqkixy.R.inc(80326);assertEquals("[\"Nigel Rees\",\"Evelyn Waugh\",\"Herman Melville\",\"J. R. R. Tolkien\"]"
                , JSONPath.extract(json, "$..author")
                        .toString());
    }finally{__CLR4_1_101pz31pz3lusqkixy.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101pz31pz3lusqkixy.R.globalSliceStart(getClass().getName(),80327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61pzb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pz31pz3lusqkixy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pz31pz3lusqkixy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80327,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61pzb() throws Exception{try{__CLR4_1_101pz31pz3lusqkixy.R.inc(80327);
        __CLR4_1_101pz31pz3lusqkixy.R.inc(80328);assertEquals("[[{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95},{\"category\":\"fiction\",\"author\":\"Evelyn Waugh\",\"title\":\"Sword of Honour\",\"price\":12.99},{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99},{\"category\":\"fiction\",\"author\":\"J. R. R. Tolkien\",\"title\":\"The Lord of the Rings\",\"isbn\":\"0-395-19395-8\",\"price\":22.99}],{\"color\":\"red\",\"price\":19.95}]"
                , JSONPath.extract(json, "$.store.*")
                        .toString());
    }finally{__CLR4_1_101pz31pz3lusqkixy.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101pz31pz3lusqkixy.R.globalSliceStart(getClass().getName(),80329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1pzd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pz31pz3lusqkixy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pz31pz3lusqkixy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80329,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1pzd() throws Exception{try{__CLR4_1_101pz31pz3lusqkixy.R.inc(80329);
        __CLR4_1_101pz31pz3lusqkixy.R.inc(80330);assertEquals("$.store..price", "[8.95,12.99,8.99,22.99,19.95]"
                , JSONPath.extract(json, "$.store..price")
                        .toString());
    }finally{__CLR4_1_101pz31pz3lusqkixy.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_101pz31pz3lusqkixy.R.globalSliceStart(getClass().getName(),80331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81pzf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pz31pz3lusqkixy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pz31pz3lusqkixy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80331,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81pzf() throws Exception{try{__CLR4_1_101pz31pz3lusqkixy.R.inc(80331);
        __CLR4_1_101pz31pz3lusqkixy.R.inc(80332);assertEquals("{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99}"
                , JSONPath.extract(json, "$..book[2]")
                        .toString());
    }finally{__CLR4_1_101pz31pz3lusqkixy.R.flushNeeded();}}

    public void test_7  () throws Exception {__CLR4_1_101pz31pz3lusqkixy.R.globalSliceStart(getClass().getName(),80333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1pzh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pz31pz3lusqkixy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pz31pz3lusqkixy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80333,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1pzh() throws Exception{try{__CLR4_1_101pz31pz3lusqkixy.R.inc(80333);
        __CLR4_1_101pz31pz3lusqkixy.R.inc(80334);assertEquals("[{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95},{\"category\":\"fiction\",\"author\":\"Evelyn Waugh\",\"title\":\"Sword of Honour\",\"price\":12.99}]"
                , JSONPath.extract(json, "$..book[0,1]")
                        .toString());
    }finally{__CLR4_1_101pz31pz3lusqkixy.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_1_101pz31pz3lusqkixy.R.globalSliceStart(getClass().getName(),80335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102uw8mq1pzj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pz31pz3lusqkixy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pz31pz3lusqkixy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80335,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102uw8mq1pzj() throws Exception{try{__CLR4_1_101pz31pz3lusqkixy.R.inc(80335);
        __CLR4_1_101pz31pz3lusqkixy.R.inc(80336);assertEquals("{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99}"
                , JSONPath.extract(json, "$..book[-2]")
                        .toString());
    }finally{__CLR4_1_101pz31pz3lusqkixy.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_1_101pz31pz3lusqkixy.R.globalSliceStart(getClass().getName(),80337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1063w7f71pzl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pz31pz3lusqkixy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pz31pz3lusqkixy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80337,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1063w7f71pzl() throws Exception{try{__CLR4_1_101pz31pz3lusqkixy.R.inc(80337);
        __CLR4_1_101pz31pz3lusqkixy.R.inc(80338);assertEquals("Nigel Rees"
                , JSONPath.extract(json, "$['store']['book'][0]['author']")
                        .toString());

        __CLR4_1_101pz31pz3lusqkixy.R.inc(80339);assertEquals("Evelyn Waugh"
                , JSONPath.extract(json, "$['store']['book'][1]['author']")
                        .toString());

        __CLR4_1_101pz31pz3lusqkixy.R.inc(80340);assertEquals("Herman Melville"
                , JSONPath.extract(json, "$['store']['book'][2]['author']")
                        .toString());

        __CLR4_1_101pz31pz3lusqkixy.R.inc(80341);assertEquals("J. R. R. Tolkien"
                , JSONPath.extract(json, "$['store']['book'][3]['author']")
                        .toString());
    }finally{__CLR4_1_101pz31pz3lusqkixy.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_1_101pz31pz3lusqkixy.R.globalSliceStart(getClass().getName(),80342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c3oj7x1pzq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pz31pz3lusqkixy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pz31pz3lusqkixy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80342,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c3oj7x1pzq() throws Exception{try{__CLR4_1_101pz31pz3lusqkixy.R.inc(80342);
        __CLR4_1_101pz31pz3lusqkixy.R.inc(80343);assertEquals("[{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95},{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99}]"
                , JSONPath.extract(json, "$.store.book[?(@.price < 10)]")
                        .toString());
    }finally{__CLR4_1_101pz31pz3lusqkixy.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_1_101pz31pz3lusqkixy.R.globalSliceStart(getClass().getName(),80344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108uokfg1pzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pz31pz3lusqkixy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pz31pz3lusqkixy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80344,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108uokfg1pzs() throws Exception{try{__CLR4_1_101pz31pz3lusqkixy.R.inc(80344);
        __CLR4_1_101pz31pz3lusqkixy.R.inc(80345);assertEquals("10"
                , JSONPath.extract(json, "$.expensive")
                        .toString());
    }finally{__CLR4_1_101pz31pz3lusqkixy.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_1_101pz31pz3lusqkixy.R.globalSliceStart(getClass().getName(),80346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105lolmz1pzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pz31pz3lusqkixy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pz31pz3lusqkixy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80346,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105lolmz1pzu() throws Exception{try{__CLR4_1_101pz31pz3lusqkixy.R.inc(80346);
        __CLR4_1_101pz31pz3lusqkixy.R.inc(80347);assertNull(JSONPath.extract(json, "$.store.book.doesnt_exist"));
    }finally{__CLR4_1_101pz31pz3lusqkixy.R.flushNeeded();}}

    public void test_13() throws Exception {__CLR4_1_101pz31pz3lusqkixy.R.globalSliceStart(getClass().getName(),80348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102comui1pzw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pz31pz3lusqkixy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pz31pz3lusqkixy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80348,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102comui1pzw() throws Exception{try{__CLR4_1_101pz31pz3lusqkixy.R.inc(80348);
        __CLR4_1_101pz31pz3lusqkixy.R.inc(80349);assertEquals("J. R. R. Tolkien", JSONPath.extract(json, "$.store.book[3].author"));
    }finally{__CLR4_1_101pz31pz3lusqkixy.R.flushNeeded();}}

    public void test_14() throws Exception {__CLR4_1_101pz31pz3lusqkixy.R.globalSliceStart(getClass().getName(),80350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wbbxz1pzy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pz31pz3lusqkixy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pz31pz3lusqkixy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_14",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80350,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wbbxz1pzy() throws Exception{try{__CLR4_1_101pz31pz3lusqkixy.R.inc(80350);
        __CLR4_1_101pz31pz3lusqkixy.R.inc(80351);assertEquals("[{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95},{\"category\":\"fiction\",\"author\":\"Evelyn Waugh\",\"title\":\"Sword of Honour\",\"price\":12.99},{\"category\":\"fiction\",\"author\":\"Herman Melville\",\"title\":\"Moby Dick\",\"isbn\":\"0-553-21311-3\",\"price\":8.99},{\"category\":\"fiction\",\"author\":\"J. R. R. Tolkien\",\"title\":\"The Lord of the Rings\",\"isbn\":\"0-395-19395-8\",\"price\":22.99}]"
                , JSONPath.extract(json, "$.store.book").toString());
    }finally{__CLR4_1_101pz31pz3lusqkixy.R.flushNeeded();}}

    public void test_15() throws Exception {__CLR4_1_101pz31pz3lusqkixy.R.globalSliceStart(getClass().getName(),80352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1045baqg1q00();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pz31pz3lusqkixy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pz31pz3lusqkixy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_15",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80352,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1045baqg1q00() throws Exception{try{__CLR4_1_101pz31pz3lusqkixy.R.inc(80352);
        __CLR4_1_101pz31pz3lusqkixy.R.inc(80353);assertEquals("{\"category\":\"reference\",\"author\":\"Nigel Rees\",\"title\":\"Sayings of the Century\",\"price\":8.95}"
                , JSONPath.extract(json, "$[\"store\"][\"book\"][0]").toString());
    }finally{__CLR4_1_101pz31pz3lusqkixy.R.flushNeeded();}}

    public void test_16() throws Exception {__CLR4_1_101pz31pz3lusqkixy.R.globalSliceStart(getClass().getName(),80354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107eb9ix1q02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pz31pz3lusqkixy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pz31pz3lusqkixy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_16",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80354,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107eb9ix1q02() throws Exception{try{__CLR4_1_101pz31pz3lusqkixy.R.inc(80354);
        __CLR4_1_101pz31pz3lusqkixy.R.inc(80355);assertNull(JSONPath.extract(json, "$.store.object.inner_object.array[0].inner_array[0].x"));
    }finally{__CLR4_1_101pz31pz3lusqkixy.R.flushNeeded();}}

    public void test_17() throws Exception {__CLR4_1_101pz31pz3lusqkixy.R.globalSliceStart(getClass().getName(),80356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10anb8be1q04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pz31pz3lusqkixy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pz31pz3lusqkixy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.extract.JSONPath_extract_2_book.test_17",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80356,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10anb8be1q04() throws Exception{try{__CLR4_1_101pz31pz3lusqkixy.R.inc(80356);
        __CLR4_1_101pz31pz3lusqkixy.R.inc(80357);assertEquals(4, JSONPath.extract(json, "$..book.length()"));
    }finally{__CLR4_1_101pz31pz3lusqkixy.R.flushNeeded();}}


    private static String json;
    static {try{__CLR4_1_101pz31pz3lusqkixy.R.inc(80358);
        __CLR4_1_101pz31pz3lusqkixy.R.inc(80359);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("json/book.json");
        __CLR4_1_101pz31pz3lusqkixy.R.inc(80360);InputStreamReader reader = new InputStreamReader(is);
        __CLR4_1_101pz31pz3lusqkixy.R.inc(80361);json = IOUtils.readAll(reader);
        __CLR4_1_101pz31pz3lusqkixy.R.inc(80362);IOUtils.close(reader);
    }finally{__CLR4_1_101pz31pz3lusqkixy.R.flushNeeded();}}
}
