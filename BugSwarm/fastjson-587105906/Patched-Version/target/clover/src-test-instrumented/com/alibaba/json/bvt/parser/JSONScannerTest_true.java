/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONScannerTest_true extends TestCase {static class __CLR4_5_21i8q1i8qlusyjts4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,70370,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_scan_true_0() throws Exception {__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceStart(getClass().getName(),70298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_255puu31i8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8q1i8qlusyjts4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70298,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_255puu31i8q() throws Exception{try{__CLR4_5_21i8q1i8qlusyjts4.R.inc(70298);
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70299);JSONScanner lexer = new JSONScanner("true");
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70300);lexer.scanTrue();
    }finally{__CLR4_5_21i8q1i8qlusyjts4.R.flushNeeded();}}

    public void test_scan_true_1() throws Exception {__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceStart(getClass().getName(),70301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28eptmk1i8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8q1i8qlusyjts4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70301,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28eptmk1i8t() throws Exception{try{__CLR4_5_21i8q1i8qlusyjts4.R.inc(70301);
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70302);JSONException error = null;
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70303);try {
            __CLR4_5_21i8q1i8qlusyjts4.R.inc(70304);JSONScanner lexer = new JSONScanner("frue");
            __CLR4_5_21i8q1i8qlusyjts4.R.inc(70305);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_5_21i8q1i8qlusyjts4.R.inc(70306);error = e;
        }
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70307);Assert.assertNotNull(error);
    }finally{__CLR4_5_21i8q1i8qlusyjts4.R.flushNeeded();}}

    public void test_scan_true_2() throws Exception {__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceStart(getClass().getName(),70308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bnpsf11i90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8q1i8qlusyjts4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70308,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bnpsf11i90() throws Exception{try{__CLR4_5_21i8q1i8qlusyjts4.R.inc(70308);
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70309);JSONException error = null;
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70310);try {
            __CLR4_5_21i8q1i8qlusyjts4.R.inc(70311);JSONScanner lexer = new JSONScanner("ttue");
            __CLR4_5_21i8q1i8qlusyjts4.R.inc(70312);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_5_21i8q1i8qlusyjts4.R.inc(70313);error = e;
        }
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70314);Assert.assertNotNull(error);
    }finally{__CLR4_5_21i8q1i8qlusyjts4.R.flushNeeded();}}

    public void test_scan_true_3() throws Exception {__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceStart(getClass().getName(),70315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ewpr7i1i97();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8q1i8qlusyjts4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70315,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ewpr7i1i97() throws Exception{try{__CLR4_5_21i8q1i8qlusyjts4.R.inc(70315);
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70316);JSONException error = null;
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70317);try {
            __CLR4_5_21i8q1i8qlusyjts4.R.inc(70318);JSONScanner lexer = new JSONScanner("trze");
            __CLR4_5_21i8q1i8qlusyjts4.R.inc(70319);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_5_21i8q1i8qlusyjts4.R.inc(70320);error = e;
        }
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70321);Assert.assertNotNull(error);
    }finally{__CLR4_5_21i8q1i8qlusyjts4.R.flushNeeded();}}

    public void test_scan_true_4() throws Exception {__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceStart(getClass().getName(),70322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i5ppzz1i9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8q1i8qlusyjts4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70322,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i5ppzz1i9e() throws Exception{try{__CLR4_5_21i8q1i8qlusyjts4.R.inc(70322);
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70323);JSONException error = null;
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70324);try {
            __CLR4_5_21i8q1i8qlusyjts4.R.inc(70325);JSONScanner lexer = new JSONScanner("truz");
            __CLR4_5_21i8q1i8qlusyjts4.R.inc(70326);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_5_21i8q1i8qlusyjts4.R.inc(70327);error = e;
        }
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70328);Assert.assertNotNull(error);
    }finally{__CLR4_5_21i8q1i8qlusyjts4.R.flushNeeded();}}

    public void test_scan_true_5() throws Exception {__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceStart(getClass().getName(),70329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2leposg1i9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8q1i8qlusyjts4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70329,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2leposg1i9l() throws Exception{try{__CLR4_5_21i8q1i8qlusyjts4.R.inc(70329);
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70330);JSONException error = null;
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70331);try {
            __CLR4_5_21i8q1i8qlusyjts4.R.inc(70332);JSONScanner lexer = new JSONScanner("truee");
            __CLR4_5_21i8q1i8qlusyjts4.R.inc(70333);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_5_21i8q1i8qlusyjts4.R.inc(70334);error = e;
        }
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70335);Assert.assertNotNull(error);
    }finally{__CLR4_5_21i8q1i8qlusyjts4.R.flushNeeded();}}

    public void test_scan_true_6() throws Exception {__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceStart(getClass().getName(),70336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2onpnkx1i9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8q1i8qlusyjts4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70336,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2onpnkx1i9s() throws Exception{try{__CLR4_5_21i8q1i8qlusyjts4.R.inc(70336);
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70337);JSONException error = null;
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70338);try {
            __CLR4_5_21i8q1i8qlusyjts4.R.inc(70339);JSONScanner lexer = new JSONScanner("true\"");
            __CLR4_5_21i8q1i8qlusyjts4.R.inc(70340);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_5_21i8q1i8qlusyjts4.R.inc(70341);error = e;
        }
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70342);Assert.assertNotNull(error);
    }finally{__CLR4_5_21i8q1i8qlusyjts4.R.flushNeeded();}}

    public void test_scan_true_7() throws Exception {__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceStart(getClass().getName(),70343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rwpmde1i9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8q1i8qlusyjts4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70343,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rwpmde1i9z() throws Exception{try{__CLR4_5_21i8q1i8qlusyjts4.R.inc(70343);
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70344);JSONScanner lexer = new JSONScanner("true a");
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70345);lexer.scanTrue();
    }finally{__CLR4_5_21i8q1i8qlusyjts4.R.flushNeeded();}}

    public void test_scan_true_8() throws Exception {__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceStart(getClass().getName(),70346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v5pl5v1ia2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8q1i8qlusyjts4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70346,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v5pl5v1ia2() throws Exception{try{__CLR4_5_21i8q1i8qlusyjts4.R.inc(70346);
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70347);JSONScanner lexer = new JSONScanner("true,");
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70348);lexer.scanTrue();
    }finally{__CLR4_5_21i8q1i8qlusyjts4.R.flushNeeded();}}

    public void test_scan_true_9() throws Exception {__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceStart(getClass().getName(),70349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yepjyc1ia5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8q1i8qlusyjts4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70349,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yepjyc1ia5() throws Exception{try{__CLR4_5_21i8q1i8qlusyjts4.R.inc(70349);
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70350);JSONScanner lexer = new JSONScanner("true\na");
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70351);lexer.scanTrue();
    }finally{__CLR4_5_21i8q1i8qlusyjts4.R.flushNeeded();}}

    public void test_scan_true_10() throws Exception {__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceStart(getClass().getName(),70352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cu8lk21ia8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8q1i8qlusyjts4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70352,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cu8lk21ia8() throws Exception{try{__CLR4_5_21i8q1i8qlusyjts4.R.inc(70352);
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70353);JSONScanner lexer = new JSONScanner("true\ra");
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70354);lexer.scanTrue();
    }finally{__CLR4_5_21i8q1i8qlusyjts4.R.flushNeeded();}}

    public void test_scan_true_11() throws Exception {__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceStart(getClass().getName(),70355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g38kcj1iab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8q1i8qlusyjts4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70355,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g38kcj1iab() throws Exception{try{__CLR4_5_21i8q1i8qlusyjts4.R.inc(70355);
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70356);JSONScanner lexer = new JSONScanner("true\ta");
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70357);lexer.scanTrue();
    }finally{__CLR4_5_21i8q1i8qlusyjts4.R.flushNeeded();}}

    public void test_scan_true_12() throws Exception {__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceStart(getClass().getName(),70358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jc8j501iae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8q1i8qlusyjts4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70358,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jc8j501iae() throws Exception{try{__CLR4_5_21i8q1i8qlusyjts4.R.inc(70358);
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70359);JSONScanner lexer = new JSONScanner("true\fa");
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70360);lexer.scanTrue();
    }finally{__CLR4_5_21i8q1i8qlusyjts4.R.flushNeeded();}}

    public void test_scan_true_13() throws Exception {__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceStart(getClass().getName(),70361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ml8hxh1iah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8q1i8qlusyjts4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70361,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ml8hxh1iah() throws Exception{try{__CLR4_5_21i8q1i8qlusyjts4.R.inc(70361);
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70362);JSONScanner lexer = new JSONScanner("true\ba");
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70363);lexer.scanTrue();
    }finally{__CLR4_5_21i8q1i8qlusyjts4.R.flushNeeded();}}

    public void test_scan_false_14() throws Exception {__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceStart(getClass().getName(),70364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24717fp1iak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8q1i8qlusyjts4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_false_14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70364,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24717fp1iak() throws Exception{try{__CLR4_5_21i8q1i8qlusyjts4.R.inc(70364);
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70365);JSONScanner lexer = new JSONScanner("true}");
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70366);lexer.scanTrue();
    }finally{__CLR4_5_21i8q1i8qlusyjts4.R.flushNeeded();}}

    public void test_scan_false_15() throws Exception {__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceStart(getClass().getName(),70367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y18n81ian();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21i8q1i8qlusyjts4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21i8q1i8qlusyjts4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_false_15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70367,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y18n81ian() throws Exception{try{__CLR4_5_21i8q1i8qlusyjts4.R.inc(70367);
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70368);JSONScanner lexer = new JSONScanner("true]");
        __CLR4_5_21i8q1i8qlusyjts4.R.inc(70369);lexer.scanTrue();
    }finally{__CLR4_5_21i8q1i8qlusyjts4.R.flushNeeded();}}
}
