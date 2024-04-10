/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONScannerTest_true extends TestCase {static class __CLR4_1_101j791j79luszwcq5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,71613,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_scan_true_0() throws Exception {__CLR4_1_101j791j79luszwcq5.R.globalSliceStart(getClass().getName(),71541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1055puu31j79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j791j79luszwcq5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j791j79luszwcq5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71541,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1055puu31j79() throws Exception{try{__CLR4_1_101j791j79luszwcq5.R.inc(71541);
        __CLR4_1_101j791j79luszwcq5.R.inc(71542);JSONScanner lexer = new JSONScanner("true");
        __CLR4_1_101j791j79luszwcq5.R.inc(71543);lexer.scanTrue();
    }finally{__CLR4_1_101j791j79luszwcq5.R.flushNeeded();}}

    public void test_scan_true_1() throws Exception {__CLR4_1_101j791j79luszwcq5.R.globalSliceStart(getClass().getName(),71544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108eptmk1j7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j791j79luszwcq5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j791j79luszwcq5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71544,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108eptmk1j7c() throws Exception{try{__CLR4_1_101j791j79luszwcq5.R.inc(71544);
        __CLR4_1_101j791j79luszwcq5.R.inc(71545);JSONException error = null;
        __CLR4_1_101j791j79luszwcq5.R.inc(71546);try {
            __CLR4_1_101j791j79luszwcq5.R.inc(71547);JSONScanner lexer = new JSONScanner("frue");
            __CLR4_1_101j791j79luszwcq5.R.inc(71548);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_1_101j791j79luszwcq5.R.inc(71549);error = e;
        }
        __CLR4_1_101j791j79luszwcq5.R.inc(71550);Assert.assertNotNull(error);
    }finally{__CLR4_1_101j791j79luszwcq5.R.flushNeeded();}}

    public void test_scan_true_2() throws Exception {__CLR4_1_101j791j79luszwcq5.R.globalSliceStart(getClass().getName(),71551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bnpsf11j7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j791j79luszwcq5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j791j79luszwcq5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71551,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bnpsf11j7j() throws Exception{try{__CLR4_1_101j791j79luszwcq5.R.inc(71551);
        __CLR4_1_101j791j79luszwcq5.R.inc(71552);JSONException error = null;
        __CLR4_1_101j791j79luszwcq5.R.inc(71553);try {
            __CLR4_1_101j791j79luszwcq5.R.inc(71554);JSONScanner lexer = new JSONScanner("ttue");
            __CLR4_1_101j791j79luszwcq5.R.inc(71555);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_1_101j791j79luszwcq5.R.inc(71556);error = e;
        }
        __CLR4_1_101j791j79luszwcq5.R.inc(71557);Assert.assertNotNull(error);
    }finally{__CLR4_1_101j791j79luszwcq5.R.flushNeeded();}}

    public void test_scan_true_3() throws Exception {__CLR4_1_101j791j79luszwcq5.R.globalSliceStart(getClass().getName(),71558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ewpr7i1j7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j791j79luszwcq5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j791j79luszwcq5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71558,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ewpr7i1j7q() throws Exception{try{__CLR4_1_101j791j79luszwcq5.R.inc(71558);
        __CLR4_1_101j791j79luszwcq5.R.inc(71559);JSONException error = null;
        __CLR4_1_101j791j79luszwcq5.R.inc(71560);try {
            __CLR4_1_101j791j79luszwcq5.R.inc(71561);JSONScanner lexer = new JSONScanner("trze");
            __CLR4_1_101j791j79luszwcq5.R.inc(71562);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_1_101j791j79luszwcq5.R.inc(71563);error = e;
        }
        __CLR4_1_101j791j79luszwcq5.R.inc(71564);Assert.assertNotNull(error);
    }finally{__CLR4_1_101j791j79luszwcq5.R.flushNeeded();}}

    public void test_scan_true_4() throws Exception {__CLR4_1_101j791j79luszwcq5.R.globalSliceStart(getClass().getName(),71565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i5ppzz1j7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j791j79luszwcq5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j791j79luszwcq5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71565,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i5ppzz1j7x() throws Exception{try{__CLR4_1_101j791j79luszwcq5.R.inc(71565);
        __CLR4_1_101j791j79luszwcq5.R.inc(71566);JSONException error = null;
        __CLR4_1_101j791j79luszwcq5.R.inc(71567);try {
            __CLR4_1_101j791j79luszwcq5.R.inc(71568);JSONScanner lexer = new JSONScanner("truz");
            __CLR4_1_101j791j79luszwcq5.R.inc(71569);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_1_101j791j79luszwcq5.R.inc(71570);error = e;
        }
        __CLR4_1_101j791j79luszwcq5.R.inc(71571);Assert.assertNotNull(error);
    }finally{__CLR4_1_101j791j79luszwcq5.R.flushNeeded();}}

    public void test_scan_true_5() throws Exception {__CLR4_1_101j791j79luszwcq5.R.globalSliceStart(getClass().getName(),71572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10leposg1j84();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j791j79luszwcq5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j791j79luszwcq5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71572,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10leposg1j84() throws Exception{try{__CLR4_1_101j791j79luszwcq5.R.inc(71572);
        __CLR4_1_101j791j79luszwcq5.R.inc(71573);JSONException error = null;
        __CLR4_1_101j791j79luszwcq5.R.inc(71574);try {
            __CLR4_1_101j791j79luszwcq5.R.inc(71575);JSONScanner lexer = new JSONScanner("truee");
            __CLR4_1_101j791j79luszwcq5.R.inc(71576);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_1_101j791j79luszwcq5.R.inc(71577);error = e;
        }
        __CLR4_1_101j791j79luszwcq5.R.inc(71578);Assert.assertNotNull(error);
    }finally{__CLR4_1_101j791j79luszwcq5.R.flushNeeded();}}

    public void test_scan_true_6() throws Exception {__CLR4_1_101j791j79luszwcq5.R.globalSliceStart(getClass().getName(),71579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10onpnkx1j8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j791j79luszwcq5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j791j79luszwcq5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71579,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10onpnkx1j8b() throws Exception{try{__CLR4_1_101j791j79luszwcq5.R.inc(71579);
        __CLR4_1_101j791j79luszwcq5.R.inc(71580);JSONException error = null;
        __CLR4_1_101j791j79luszwcq5.R.inc(71581);try {
            __CLR4_1_101j791j79luszwcq5.R.inc(71582);JSONScanner lexer = new JSONScanner("true\"");
            __CLR4_1_101j791j79luszwcq5.R.inc(71583);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_1_101j791j79luszwcq5.R.inc(71584);error = e;
        }
        __CLR4_1_101j791j79luszwcq5.R.inc(71585);Assert.assertNotNull(error);
    }finally{__CLR4_1_101j791j79luszwcq5.R.flushNeeded();}}

    public void test_scan_true_7() throws Exception {__CLR4_1_101j791j79luszwcq5.R.globalSliceStart(getClass().getName(),71586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rwpmde1j8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j791j79luszwcq5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j791j79luszwcq5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71586,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rwpmde1j8i() throws Exception{try{__CLR4_1_101j791j79luszwcq5.R.inc(71586);
        __CLR4_1_101j791j79luszwcq5.R.inc(71587);JSONScanner lexer = new JSONScanner("true a");
        __CLR4_1_101j791j79luszwcq5.R.inc(71588);lexer.scanTrue();
    }finally{__CLR4_1_101j791j79luszwcq5.R.flushNeeded();}}

    public void test_scan_true_8() throws Exception {__CLR4_1_101j791j79luszwcq5.R.globalSliceStart(getClass().getName(),71589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v5pl5v1j8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j791j79luszwcq5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j791j79luszwcq5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71589,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v5pl5v1j8l() throws Exception{try{__CLR4_1_101j791j79luszwcq5.R.inc(71589);
        __CLR4_1_101j791j79luszwcq5.R.inc(71590);JSONScanner lexer = new JSONScanner("true,");
        __CLR4_1_101j791j79luszwcq5.R.inc(71591);lexer.scanTrue();
    }finally{__CLR4_1_101j791j79luszwcq5.R.flushNeeded();}}

    public void test_scan_true_9() throws Exception {__CLR4_1_101j791j79luszwcq5.R.globalSliceStart(getClass().getName(),71592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yepjyc1j8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j791j79luszwcq5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j791j79luszwcq5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71592,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yepjyc1j8o() throws Exception{try{__CLR4_1_101j791j79luszwcq5.R.inc(71592);
        __CLR4_1_101j791j79luszwcq5.R.inc(71593);JSONScanner lexer = new JSONScanner("true\na");
        __CLR4_1_101j791j79luszwcq5.R.inc(71594);lexer.scanTrue();
    }finally{__CLR4_1_101j791j79luszwcq5.R.flushNeeded();}}

    public void test_scan_true_10() throws Exception {__CLR4_1_101j791j79luszwcq5.R.globalSliceStart(getClass().getName(),71595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10cu8lk21j8r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j791j79luszwcq5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j791j79luszwcq5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71595,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10cu8lk21j8r() throws Exception{try{__CLR4_1_101j791j79luszwcq5.R.inc(71595);
        __CLR4_1_101j791j79luszwcq5.R.inc(71596);JSONScanner lexer = new JSONScanner("true\ra");
        __CLR4_1_101j791j79luszwcq5.R.inc(71597);lexer.scanTrue();
    }finally{__CLR4_1_101j791j79luszwcq5.R.flushNeeded();}}

    public void test_scan_true_11() throws Exception {__CLR4_1_101j791j79luszwcq5.R.globalSliceStart(getClass().getName(),71598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g38kcj1j8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j791j79luszwcq5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j791j79luszwcq5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71598,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g38kcj1j8u() throws Exception{try{__CLR4_1_101j791j79luszwcq5.R.inc(71598);
        __CLR4_1_101j791j79luszwcq5.R.inc(71599);JSONScanner lexer = new JSONScanner("true\ta");
        __CLR4_1_101j791j79luszwcq5.R.inc(71600);lexer.scanTrue();
    }finally{__CLR4_1_101j791j79luszwcq5.R.flushNeeded();}}

    public void test_scan_true_12() throws Exception {__CLR4_1_101j791j79luszwcq5.R.globalSliceStart(getClass().getName(),71601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jc8j501j8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j791j79luszwcq5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j791j79luszwcq5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71601,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jc8j501j8x() throws Exception{try{__CLR4_1_101j791j79luszwcq5.R.inc(71601);
        __CLR4_1_101j791j79luszwcq5.R.inc(71602);JSONScanner lexer = new JSONScanner("true\fa");
        __CLR4_1_101j791j79luszwcq5.R.inc(71603);lexer.scanTrue();
    }finally{__CLR4_1_101j791j79luszwcq5.R.flushNeeded();}}

    public void test_scan_true_13() throws Exception {__CLR4_1_101j791j79luszwcq5.R.globalSliceStart(getClass().getName(),71604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ml8hxh1j90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j791j79luszwcq5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j791j79luszwcq5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71604,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ml8hxh1j90() throws Exception{try{__CLR4_1_101j791j79luszwcq5.R.inc(71604);
        __CLR4_1_101j791j79luszwcq5.R.inc(71605);JSONScanner lexer = new JSONScanner("true\ba");
        __CLR4_1_101j791j79luszwcq5.R.inc(71606);lexer.scanTrue();
    }finally{__CLR4_1_101j791j79luszwcq5.R.flushNeeded();}}

    public void test_scan_false_14() throws Exception {__CLR4_1_101j791j79luszwcq5.R.globalSliceStart(getClass().getName(),71607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104717fp1j93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j791j79luszwcq5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j791j79luszwcq5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_false_14",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71607,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104717fp1j93() throws Exception{try{__CLR4_1_101j791j79luszwcq5.R.inc(71607);
        __CLR4_1_101j791j79luszwcq5.R.inc(71608);JSONScanner lexer = new JSONScanner("true}");
        __CLR4_1_101j791j79luszwcq5.R.inc(71609);lexer.scanTrue();
    }finally{__CLR4_1_101j791j79luszwcq5.R.flushNeeded();}}

    public void test_scan_false_15() throws Exception {__CLR4_1_101j791j79luszwcq5.R.globalSliceStart(getClass().getName(),71610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10y18n81j96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j791j79luszwcq5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j791j79luszwcq5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_false_15",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71610,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10y18n81j96() throws Exception{try{__CLR4_1_101j791j79luszwcq5.R.inc(71610);
        __CLR4_1_101j791j79luszwcq5.R.inc(71611);JSONScanner lexer = new JSONScanner("true]");
        __CLR4_1_101j791j79luszwcq5.R.inc(71612);lexer.scanTrue();
    }finally{__CLR4_1_101j791j79luszwcq5.R.flushNeeded();}}
}
