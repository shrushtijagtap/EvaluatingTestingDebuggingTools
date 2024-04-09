/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONScannerTest_null extends TestCase {static class __CLR4_1_101hmj1hmjlusqkdoz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,69571,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_scan_null_0() throws Exception {__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceStart(getClass().getName(),69499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kuaux81hmj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hmj1hmjlusqkdoz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69499,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kuaux81hmj() throws Exception{try{__CLR4_1_101hmj1hmjlusqkdoz.R.inc(69499);
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69500);JSONScanner lexer = new JSONScanner("null");
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69501);lexer.scanNullOrNew();
    }finally{__CLR4_1_101hmj1hmjlusqkdoz.R.flushNeeded();}}

    public void test_scan_null_1() throws Exception {__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceStart(getClass().getName(),69502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hlaw4r1hmm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hmj1hmjlusqkdoz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69502,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hlaw4r1hmm() throws Exception{try{__CLR4_1_101hmj1hmjlusqkdoz.R.inc(69502);
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69503);JSONException error = null;
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69504);try {
            __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69505);JSONScanner lexer = new JSONScanner("zull");
            __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69506);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69507);error = e;
        }
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69508);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hmj1hmjlusqkdoz.R.flushNeeded();}}

    public void test_scan_null_2() throws Exception {__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceStart(getClass().getName(),69509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ecaxca1hmt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hmj1hmjlusqkdoz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69509,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ecaxca1hmt() throws Exception{try{__CLR4_1_101hmj1hmjlusqkdoz.R.inc(69509);
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69510);JSONException error = null;
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69511);try {
            __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69512);JSONScanner lexer = new JSONScanner("nzll");
            __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69513);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69514);error = e;
        }
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69515);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hmj1hmjlusqkdoz.R.flushNeeded();}}

    public void test_scan_null_3() throws Exception {__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceStart(getClass().getName(),69516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10b3ayjt1hn0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hmj1hmjlusqkdoz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69516,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10b3ayjt1hn0() throws Exception{try{__CLR4_1_101hmj1hmjlusqkdoz.R.inc(69516);
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69517);JSONException error = null;
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69518);try {
            __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69519);JSONScanner lexer = new JSONScanner("nuzl");
            __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69520);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69521);error = e;
        }
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69522);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hmj1hmjlusqkdoz.R.flushNeeded();}}

    public void test_scan_null_4() throws Exception {__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceStart(getClass().getName(),69523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107uazrc1hn7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hmj1hmjlusqkdoz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69523,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107uazrc1hn7() throws Exception{try{__CLR4_1_101hmj1hmjlusqkdoz.R.inc(69523);
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69524);JSONException error = null;
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69525);try {
            __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69526);JSONScanner lexer = new JSONScanner("nulz");
            __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69527);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69528);error = e;
        }
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69529);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hmj1hmjlusqkdoz.R.flushNeeded();}}

    public void test_scan_null_5() throws Exception {__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceStart(getClass().getName(),69530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104lb0yv1hne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hmj1hmjlusqkdoz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69530,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104lb0yv1hne() throws Exception{try{__CLR4_1_101hmj1hmjlusqkdoz.R.inc(69530);
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69531);JSONException error = null;
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69532);try {
            __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69533);JSONScanner lexer = new JSONScanner("nulle");
            __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69534);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69535);error = e;
        }
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69536);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hmj1hmjlusqkdoz.R.flushNeeded();}}

    public void test_scan_null_6() throws Exception {__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceStart(getClass().getName(),69537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101cb26e1hnl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hmj1hmjlusqkdoz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69537,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101cb26e1hnl() throws Exception{try{__CLR4_1_101hmj1hmjlusqkdoz.R.inc(69537);
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69538);JSONException error = null;
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69539);try {
            __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69540);JSONScanner lexer = new JSONScanner("null\"");
            __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69541);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69542);error = e;
        }
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69543);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hmj1hmjlusqkdoz.R.flushNeeded();}}

    public void test_scan_null_7() throws Exception {__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceStart(getClass().getName(),69544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101wowm31hns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hmj1hmjlusqkdoz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69544,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101wowm31hns() throws Exception{try{__CLR4_1_101hmj1hmjlusqkdoz.R.inc(69544);
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69545);JSONScanner lexer = new JSONScanner("null a");
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69546);lexer.scanNullOrNew();
    }finally{__CLR4_1_101hmj1hmjlusqkdoz.R.flushNeeded();}}

    public void test_scan_null_8() throws Exception {__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceStart(getClass().getName(),69547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1055ovek1hnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hmj1hmjlusqkdoz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69547,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1055ovek1hnv() throws Exception{try{__CLR4_1_101hmj1hmjlusqkdoz.R.inc(69547);
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69548);JSONScanner lexer = new JSONScanner("null,");
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69549);lexer.scanNullOrNew();
    }finally{__CLR4_1_101hmj1hmjlusqkdoz.R.flushNeeded();}}

    public void test_scan_null_9() throws Exception {__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceStart(getClass().getName(),69550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108eou711hny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hmj1hmjlusqkdoz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69550,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108eou711hny() throws Exception{try{__CLR4_1_101hmj1hmjlusqkdoz.R.inc(69550);
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69551);JSONScanner lexer = new JSONScanner("null\na");
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69552);lexer.scanNullOrNew();
    }finally{__CLR4_1_101hmj1hmjlusqkdoz.R.flushNeeded();}}

    public void test_scan_null_10() throws Exception {__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceStart(getClass().getName(),69553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bu4z871ho1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hmj1hmjlusqkdoz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69553,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bu4z871ho1() throws Exception{try{__CLR4_1_101hmj1hmjlusqkdoz.R.inc(69553);
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69554);JSONScanner lexer = new JSONScanner("null\ra");
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69555);lexer.scanNullOrNew();
    }finally{__CLR4_1_101hmj1hmjlusqkdoz.R.flushNeeded();}}

    public void test_scan_null_11() throws Exception {__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceStart(getClass().getName(),69556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108l50fq1ho4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hmj1hmjlusqkdoz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69556,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108l50fq1ho4() throws Exception{try{__CLR4_1_101hmj1hmjlusqkdoz.R.inc(69556);
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69557);JSONScanner lexer = new JSONScanner("null\ta");
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69558);lexer.scanNullOrNew();
    }finally{__CLR4_1_101hmj1hmjlusqkdoz.R.flushNeeded();}}

    public void test_scan_null_12() throws Exception {__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceStart(getClass().getName(),69559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105c51n91ho7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hmj1hmjlusqkdoz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69559,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105c51n91ho7() throws Exception{try{__CLR4_1_101hmj1hmjlusqkdoz.R.inc(69559);
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69560);JSONScanner lexer = new JSONScanner("null\fa");
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69561);lexer.scanNullOrNew();
    }finally{__CLR4_1_101hmj1hmjlusqkdoz.R.flushNeeded();}}

    public void test_scan_null_13() throws Exception {__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceStart(getClass().getName(),69562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102352us1hoa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hmj1hmjlusqkdoz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69562,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102352us1hoa() throws Exception{try{__CLR4_1_101hmj1hmjlusqkdoz.R.inc(69562);
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69563);JSONScanner lexer = new JSONScanner("null\ba");
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69564);lexer.scanNullOrNew();
    }finally{__CLR4_1_101hmj1hmjlusqkdoz.R.flushNeeded();}}

    public void test_scan_false_14() throws Exception {__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceStart(getClass().getName(),69565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104717fp1hod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hmj1hmjlusqkdoz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_false_14",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69565,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104717fp1hod() throws Exception{try{__CLR4_1_101hmj1hmjlusqkdoz.R.inc(69565);
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69566);JSONScanner lexer = new JSONScanner("null}");
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69567);lexer.scanNullOrNew();
    }finally{__CLR4_1_101hmj1hmjlusqkdoz.R.flushNeeded();}}

    public void test_scan_false_15() throws Exception {__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceStart(getClass().getName(),69568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10y18n81hog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hmj1hmjlusqkdoz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hmj1hmjlusqkdoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_false_15",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69568,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10y18n81hog() throws Exception{try{__CLR4_1_101hmj1hmjlusqkdoz.R.inc(69568);
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69569);JSONScanner lexer = new JSONScanner("null]");
        __CLR4_1_101hmj1hmjlusqkdoz.R.inc(69570);lexer.scanNullOrNew();
    }finally{__CLR4_1_101hmj1hmjlusqkdoz.R.flushNeeded();}}
}
