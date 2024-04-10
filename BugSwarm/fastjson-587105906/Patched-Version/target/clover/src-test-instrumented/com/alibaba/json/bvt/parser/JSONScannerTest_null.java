/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONScannerTest_null extends TestCase {static class __CLR4_5_21hm81hm8lusyjtq0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,69560,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_scan_null_0() throws Exception {__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceStart(getClass().getName(),69488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kuaux81hm8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hm81hm8lusyjtq0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69488,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kuaux81hm8() throws Exception{try{__CLR4_5_21hm81hm8lusyjtq0.R.inc(69488);
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69489);JSONScanner lexer = new JSONScanner("null");
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69490);lexer.scanNullOrNew();
    }finally{__CLR4_5_21hm81hm8lusyjtq0.R.flushNeeded();}}

    public void test_scan_null_1() throws Exception {__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceStart(getClass().getName(),69491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hlaw4r1hmb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hm81hm8lusyjtq0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69491,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hlaw4r1hmb() throws Exception{try{__CLR4_5_21hm81hm8lusyjtq0.R.inc(69491);
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69492);JSONException error = null;
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69493);try {
            __CLR4_5_21hm81hm8lusyjtq0.R.inc(69494);JSONScanner lexer = new JSONScanner("zull");
            __CLR4_5_21hm81hm8lusyjtq0.R.inc(69495);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21hm81hm8lusyjtq0.R.inc(69496);error = e;
        }
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69497);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hm81hm8lusyjtq0.R.flushNeeded();}}

    public void test_scan_null_2() throws Exception {__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceStart(getClass().getName(),69498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ecaxca1hmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hm81hm8lusyjtq0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69498,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ecaxca1hmi() throws Exception{try{__CLR4_5_21hm81hm8lusyjtq0.R.inc(69498);
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69499);JSONException error = null;
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69500);try {
            __CLR4_5_21hm81hm8lusyjtq0.R.inc(69501);JSONScanner lexer = new JSONScanner("nzll");
            __CLR4_5_21hm81hm8lusyjtq0.R.inc(69502);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21hm81hm8lusyjtq0.R.inc(69503);error = e;
        }
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69504);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hm81hm8lusyjtq0.R.flushNeeded();}}

    public void test_scan_null_3() throws Exception {__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceStart(getClass().getName(),69505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b3ayjt1hmp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hm81hm8lusyjtq0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69505,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b3ayjt1hmp() throws Exception{try{__CLR4_5_21hm81hm8lusyjtq0.R.inc(69505);
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69506);JSONException error = null;
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69507);try {
            __CLR4_5_21hm81hm8lusyjtq0.R.inc(69508);JSONScanner lexer = new JSONScanner("nuzl");
            __CLR4_5_21hm81hm8lusyjtq0.R.inc(69509);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21hm81hm8lusyjtq0.R.inc(69510);error = e;
        }
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69511);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hm81hm8lusyjtq0.R.flushNeeded();}}

    public void test_scan_null_4() throws Exception {__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceStart(getClass().getName(),69512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27uazrc1hmw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hm81hm8lusyjtq0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69512,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27uazrc1hmw() throws Exception{try{__CLR4_5_21hm81hm8lusyjtq0.R.inc(69512);
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69513);JSONException error = null;
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69514);try {
            __CLR4_5_21hm81hm8lusyjtq0.R.inc(69515);JSONScanner lexer = new JSONScanner("nulz");
            __CLR4_5_21hm81hm8lusyjtq0.R.inc(69516);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21hm81hm8lusyjtq0.R.inc(69517);error = e;
        }
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69518);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hm81hm8lusyjtq0.R.flushNeeded();}}

    public void test_scan_null_5() throws Exception {__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceStart(getClass().getName(),69519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24lb0yv1hn3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hm81hm8lusyjtq0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69519,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24lb0yv1hn3() throws Exception{try{__CLR4_5_21hm81hm8lusyjtq0.R.inc(69519);
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69520);JSONException error = null;
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69521);try {
            __CLR4_5_21hm81hm8lusyjtq0.R.inc(69522);JSONScanner lexer = new JSONScanner("nulle");
            __CLR4_5_21hm81hm8lusyjtq0.R.inc(69523);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21hm81hm8lusyjtq0.R.inc(69524);error = e;
        }
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69525);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hm81hm8lusyjtq0.R.flushNeeded();}}

    public void test_scan_null_6() throws Exception {__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceStart(getClass().getName(),69526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21cb26e1hna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hm81hm8lusyjtq0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69526,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21cb26e1hna() throws Exception{try{__CLR4_5_21hm81hm8lusyjtq0.R.inc(69526);
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69527);JSONException error = null;
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69528);try {
            __CLR4_5_21hm81hm8lusyjtq0.R.inc(69529);JSONScanner lexer = new JSONScanner("null\"");
            __CLR4_5_21hm81hm8lusyjtq0.R.inc(69530);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21hm81hm8lusyjtq0.R.inc(69531);error = e;
        }
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69532);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hm81hm8lusyjtq0.R.flushNeeded();}}

    public void test_scan_null_7() throws Exception {__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceStart(getClass().getName(),69533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21wowm31hnh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hm81hm8lusyjtq0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69533,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21wowm31hnh() throws Exception{try{__CLR4_5_21hm81hm8lusyjtq0.R.inc(69533);
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69534);JSONScanner lexer = new JSONScanner("null a");
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69535);lexer.scanNullOrNew();
    }finally{__CLR4_5_21hm81hm8lusyjtq0.R.flushNeeded();}}

    public void test_scan_null_8() throws Exception {__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceStart(getClass().getName(),69536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_255ovek1hnk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hm81hm8lusyjtq0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69536,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_255ovek1hnk() throws Exception{try{__CLR4_5_21hm81hm8lusyjtq0.R.inc(69536);
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69537);JSONScanner lexer = new JSONScanner("null,");
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69538);lexer.scanNullOrNew();
    }finally{__CLR4_5_21hm81hm8lusyjtq0.R.flushNeeded();}}

    public void test_scan_null_9() throws Exception {__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceStart(getClass().getName(),69539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28eou711hnn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hm81hm8lusyjtq0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69539,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28eou711hnn() throws Exception{try{__CLR4_5_21hm81hm8lusyjtq0.R.inc(69539);
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69540);JSONScanner lexer = new JSONScanner("null\na");
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69541);lexer.scanNullOrNew();
    }finally{__CLR4_5_21hm81hm8lusyjtq0.R.flushNeeded();}}

    public void test_scan_null_10() throws Exception {__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceStart(getClass().getName(),69542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bu4z871hnq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hm81hm8lusyjtq0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69542,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bu4z871hnq() throws Exception{try{__CLR4_5_21hm81hm8lusyjtq0.R.inc(69542);
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69543);JSONScanner lexer = new JSONScanner("null\ra");
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69544);lexer.scanNullOrNew();
    }finally{__CLR4_5_21hm81hm8lusyjtq0.R.flushNeeded();}}

    public void test_scan_null_11() throws Exception {__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceStart(getClass().getName(),69545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28l50fq1hnt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hm81hm8lusyjtq0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69545,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28l50fq1hnt() throws Exception{try{__CLR4_5_21hm81hm8lusyjtq0.R.inc(69545);
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69546);JSONScanner lexer = new JSONScanner("null\ta");
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69547);lexer.scanNullOrNew();
    }finally{__CLR4_5_21hm81hm8lusyjtq0.R.flushNeeded();}}

    public void test_scan_null_12() throws Exception {__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceStart(getClass().getName(),69548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25c51n91hnw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hm81hm8lusyjtq0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69548,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25c51n91hnw() throws Exception{try{__CLR4_5_21hm81hm8lusyjtq0.R.inc(69548);
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69549);JSONScanner lexer = new JSONScanner("null\fa");
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69550);lexer.scanNullOrNew();
    }finally{__CLR4_5_21hm81hm8lusyjtq0.R.flushNeeded();}}

    public void test_scan_null_13() throws Exception {__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceStart(getClass().getName(),69551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22352us1hnz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hm81hm8lusyjtq0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69551,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22352us1hnz() throws Exception{try{__CLR4_5_21hm81hm8lusyjtq0.R.inc(69551);
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69552);JSONScanner lexer = new JSONScanner("null\ba");
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69553);lexer.scanNullOrNew();
    }finally{__CLR4_5_21hm81hm8lusyjtq0.R.flushNeeded();}}

    public void test_scan_false_14() throws Exception {__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceStart(getClass().getName(),69554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24717fp1ho2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hm81hm8lusyjtq0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_false_14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69554,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24717fp1ho2() throws Exception{try{__CLR4_5_21hm81hm8lusyjtq0.R.inc(69554);
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69555);JSONScanner lexer = new JSONScanner("null}");
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69556);lexer.scanNullOrNew();
    }finally{__CLR4_5_21hm81hm8lusyjtq0.R.flushNeeded();}}

    public void test_scan_false_15() throws Exception {__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceStart(getClass().getName(),69557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y18n81ho5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hm81hm8lusyjtq0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hm81hm8lusyjtq0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_false_15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69557,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y18n81ho5() throws Exception{try{__CLR4_5_21hm81hm8lusyjtq0.R.inc(69557);
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69558);JSONScanner lexer = new JSONScanner("null]");
        __CLR4_5_21hm81hm8lusyjtq0.R.inc(69559);lexer.scanNullOrNew();
    }finally{__CLR4_5_21hm81hm8lusyjtq0.R.flushNeeded();}}
}
