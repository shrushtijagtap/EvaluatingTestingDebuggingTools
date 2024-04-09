/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONScannerTest_true extends TestCase {static class __CLR4_5_21j6y1j6ylusvndig{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,71602,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_scan_true_0() throws Exception {__CLR4_5_21j6y1j6ylusvndig.R.globalSliceStart(getClass().getName(),71530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_255puu31j6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j6y1j6ylusvndig.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j6y1j6ylusvndig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71530,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_255puu31j6y() throws Exception{try{__CLR4_5_21j6y1j6ylusvndig.R.inc(71530);
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71531);JSONScanner lexer = new JSONScanner("true");
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71532);lexer.scanTrue();
    }finally{__CLR4_5_21j6y1j6ylusvndig.R.flushNeeded();}}

    public void test_scan_true_1() throws Exception {__CLR4_5_21j6y1j6ylusvndig.R.globalSliceStart(getClass().getName(),71533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28eptmk1j71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j6y1j6ylusvndig.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j6y1j6ylusvndig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71533,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28eptmk1j71() throws Exception{try{__CLR4_5_21j6y1j6ylusvndig.R.inc(71533);
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71534);JSONException error = null;
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71535);try {
            __CLR4_5_21j6y1j6ylusvndig.R.inc(71536);JSONScanner lexer = new JSONScanner("frue");
            __CLR4_5_21j6y1j6ylusvndig.R.inc(71537);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_5_21j6y1j6ylusvndig.R.inc(71538);error = e;
        }
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71539);Assert.assertNotNull(error);
    }finally{__CLR4_5_21j6y1j6ylusvndig.R.flushNeeded();}}

    public void test_scan_true_2() throws Exception {__CLR4_5_21j6y1j6ylusvndig.R.globalSliceStart(getClass().getName(),71540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bnpsf11j78();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j6y1j6ylusvndig.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j6y1j6ylusvndig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71540,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bnpsf11j78() throws Exception{try{__CLR4_5_21j6y1j6ylusvndig.R.inc(71540);
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71541);JSONException error = null;
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71542);try {
            __CLR4_5_21j6y1j6ylusvndig.R.inc(71543);JSONScanner lexer = new JSONScanner("ttue");
            __CLR4_5_21j6y1j6ylusvndig.R.inc(71544);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_5_21j6y1j6ylusvndig.R.inc(71545);error = e;
        }
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71546);Assert.assertNotNull(error);
    }finally{__CLR4_5_21j6y1j6ylusvndig.R.flushNeeded();}}

    public void test_scan_true_3() throws Exception {__CLR4_5_21j6y1j6ylusvndig.R.globalSliceStart(getClass().getName(),71547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ewpr7i1j7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j6y1j6ylusvndig.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j6y1j6ylusvndig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71547,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ewpr7i1j7f() throws Exception{try{__CLR4_5_21j6y1j6ylusvndig.R.inc(71547);
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71548);JSONException error = null;
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71549);try {
            __CLR4_5_21j6y1j6ylusvndig.R.inc(71550);JSONScanner lexer = new JSONScanner("trze");
            __CLR4_5_21j6y1j6ylusvndig.R.inc(71551);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_5_21j6y1j6ylusvndig.R.inc(71552);error = e;
        }
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71553);Assert.assertNotNull(error);
    }finally{__CLR4_5_21j6y1j6ylusvndig.R.flushNeeded();}}

    public void test_scan_true_4() throws Exception {__CLR4_5_21j6y1j6ylusvndig.R.globalSliceStart(getClass().getName(),71554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i5ppzz1j7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j6y1j6ylusvndig.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j6y1j6ylusvndig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71554,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i5ppzz1j7m() throws Exception{try{__CLR4_5_21j6y1j6ylusvndig.R.inc(71554);
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71555);JSONException error = null;
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71556);try {
            __CLR4_5_21j6y1j6ylusvndig.R.inc(71557);JSONScanner lexer = new JSONScanner("truz");
            __CLR4_5_21j6y1j6ylusvndig.R.inc(71558);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_5_21j6y1j6ylusvndig.R.inc(71559);error = e;
        }
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71560);Assert.assertNotNull(error);
    }finally{__CLR4_5_21j6y1j6ylusvndig.R.flushNeeded();}}

    public void test_scan_true_5() throws Exception {__CLR4_5_21j6y1j6ylusvndig.R.globalSliceStart(getClass().getName(),71561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2leposg1j7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j6y1j6ylusvndig.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j6y1j6ylusvndig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71561,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2leposg1j7t() throws Exception{try{__CLR4_5_21j6y1j6ylusvndig.R.inc(71561);
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71562);JSONException error = null;
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71563);try {
            __CLR4_5_21j6y1j6ylusvndig.R.inc(71564);JSONScanner lexer = new JSONScanner("truee");
            __CLR4_5_21j6y1j6ylusvndig.R.inc(71565);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_5_21j6y1j6ylusvndig.R.inc(71566);error = e;
        }
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71567);Assert.assertNotNull(error);
    }finally{__CLR4_5_21j6y1j6ylusvndig.R.flushNeeded();}}

    public void test_scan_true_6() throws Exception {__CLR4_5_21j6y1j6ylusvndig.R.globalSliceStart(getClass().getName(),71568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2onpnkx1j80();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j6y1j6ylusvndig.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j6y1j6ylusvndig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71568,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2onpnkx1j80() throws Exception{try{__CLR4_5_21j6y1j6ylusvndig.R.inc(71568);
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71569);JSONException error = null;
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71570);try {
            __CLR4_5_21j6y1j6ylusvndig.R.inc(71571);JSONScanner lexer = new JSONScanner("true\"");
            __CLR4_5_21j6y1j6ylusvndig.R.inc(71572);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_5_21j6y1j6ylusvndig.R.inc(71573);error = e;
        }
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71574);Assert.assertNotNull(error);
    }finally{__CLR4_5_21j6y1j6ylusvndig.R.flushNeeded();}}

    public void test_scan_true_7() throws Exception {__CLR4_5_21j6y1j6ylusvndig.R.globalSliceStart(getClass().getName(),71575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rwpmde1j87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j6y1j6ylusvndig.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j6y1j6ylusvndig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71575,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rwpmde1j87() throws Exception{try{__CLR4_5_21j6y1j6ylusvndig.R.inc(71575);
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71576);JSONScanner lexer = new JSONScanner("true a");
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71577);lexer.scanTrue();
    }finally{__CLR4_5_21j6y1j6ylusvndig.R.flushNeeded();}}

    public void test_scan_true_8() throws Exception {__CLR4_5_21j6y1j6ylusvndig.R.globalSliceStart(getClass().getName(),71578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v5pl5v1j8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j6y1j6ylusvndig.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j6y1j6ylusvndig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71578,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v5pl5v1j8a() throws Exception{try{__CLR4_5_21j6y1j6ylusvndig.R.inc(71578);
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71579);JSONScanner lexer = new JSONScanner("true,");
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71580);lexer.scanTrue();
    }finally{__CLR4_5_21j6y1j6ylusvndig.R.flushNeeded();}}

    public void test_scan_true_9() throws Exception {__CLR4_5_21j6y1j6ylusvndig.R.globalSliceStart(getClass().getName(),71581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yepjyc1j8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j6y1j6ylusvndig.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j6y1j6ylusvndig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71581,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yepjyc1j8d() throws Exception{try{__CLR4_5_21j6y1j6ylusvndig.R.inc(71581);
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71582);JSONScanner lexer = new JSONScanner("true\na");
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71583);lexer.scanTrue();
    }finally{__CLR4_5_21j6y1j6ylusvndig.R.flushNeeded();}}

    public void test_scan_true_10() throws Exception {__CLR4_5_21j6y1j6ylusvndig.R.globalSliceStart(getClass().getName(),71584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cu8lk21j8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j6y1j6ylusvndig.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j6y1j6ylusvndig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71584,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cu8lk21j8g() throws Exception{try{__CLR4_5_21j6y1j6ylusvndig.R.inc(71584);
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71585);JSONScanner lexer = new JSONScanner("true\ra");
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71586);lexer.scanTrue();
    }finally{__CLR4_5_21j6y1j6ylusvndig.R.flushNeeded();}}

    public void test_scan_true_11() throws Exception {__CLR4_5_21j6y1j6ylusvndig.R.globalSliceStart(getClass().getName(),71587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g38kcj1j8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j6y1j6ylusvndig.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j6y1j6ylusvndig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71587,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g38kcj1j8j() throws Exception{try{__CLR4_5_21j6y1j6ylusvndig.R.inc(71587);
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71588);JSONScanner lexer = new JSONScanner("true\ta");
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71589);lexer.scanTrue();
    }finally{__CLR4_5_21j6y1j6ylusvndig.R.flushNeeded();}}

    public void test_scan_true_12() throws Exception {__CLR4_5_21j6y1j6ylusvndig.R.globalSliceStart(getClass().getName(),71590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jc8j501j8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j6y1j6ylusvndig.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j6y1j6ylusvndig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71590,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jc8j501j8m() throws Exception{try{__CLR4_5_21j6y1j6ylusvndig.R.inc(71590);
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71591);JSONScanner lexer = new JSONScanner("true\fa");
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71592);lexer.scanTrue();
    }finally{__CLR4_5_21j6y1j6ylusvndig.R.flushNeeded();}}

    public void test_scan_true_13() throws Exception {__CLR4_5_21j6y1j6ylusvndig.R.globalSliceStart(getClass().getName(),71593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ml8hxh1j8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j6y1j6ylusvndig.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j6y1j6ylusvndig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71593,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ml8hxh1j8p() throws Exception{try{__CLR4_5_21j6y1j6ylusvndig.R.inc(71593);
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71594);JSONScanner lexer = new JSONScanner("true\ba");
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71595);lexer.scanTrue();
    }finally{__CLR4_5_21j6y1j6ylusvndig.R.flushNeeded();}}

    public void test_scan_false_14() throws Exception {__CLR4_5_21j6y1j6ylusvndig.R.globalSliceStart(getClass().getName(),71596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24717fp1j8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j6y1j6ylusvndig.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j6y1j6ylusvndig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_false_14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71596,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24717fp1j8s() throws Exception{try{__CLR4_5_21j6y1j6ylusvndig.R.inc(71596);
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71597);JSONScanner lexer = new JSONScanner("true}");
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71598);lexer.scanTrue();
    }finally{__CLR4_5_21j6y1j6ylusvndig.R.flushNeeded();}}

    public void test_scan_false_15() throws Exception {__CLR4_5_21j6y1j6ylusvndig.R.globalSliceStart(getClass().getName(),71599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y18n81j8v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j6y1j6ylusvndig.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j6y1j6ylusvndig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_false_15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71599,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y18n81j8v() throws Exception{try{__CLR4_5_21j6y1j6ylusvndig.R.inc(71599);
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71600);JSONScanner lexer = new JSONScanner("true]");
        __CLR4_5_21j6y1j6ylusvndig.R.inc(71601);lexer.scanTrue();
    }finally{__CLR4_5_21j6y1j6ylusvndig.R.flushNeeded();}}
}
