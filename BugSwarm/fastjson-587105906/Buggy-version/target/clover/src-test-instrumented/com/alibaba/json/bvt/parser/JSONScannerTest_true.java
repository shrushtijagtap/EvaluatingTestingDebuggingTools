/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONScannerTest_true extends TestCase {static class __CLR4_1_101i911i91lusqkdwo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,70381,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_scan_true_0() throws Exception {__CLR4_1_101i911i91lusqkdwo.R.globalSliceStart(getClass().getName(),70309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1055puu31i91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i911i91lusqkdwo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i911i91lusqkdwo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70309,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1055puu31i91() throws Exception{try{__CLR4_1_101i911i91lusqkdwo.R.inc(70309);
        __CLR4_1_101i911i91lusqkdwo.R.inc(70310);JSONScanner lexer = new JSONScanner("true");
        __CLR4_1_101i911i91lusqkdwo.R.inc(70311);lexer.scanTrue();
    }finally{__CLR4_1_101i911i91lusqkdwo.R.flushNeeded();}}

    public void test_scan_true_1() throws Exception {__CLR4_1_101i911i91lusqkdwo.R.globalSliceStart(getClass().getName(),70312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108eptmk1i94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i911i91lusqkdwo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i911i91lusqkdwo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70312,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108eptmk1i94() throws Exception{try{__CLR4_1_101i911i91lusqkdwo.R.inc(70312);
        __CLR4_1_101i911i91lusqkdwo.R.inc(70313);JSONException error = null;
        __CLR4_1_101i911i91lusqkdwo.R.inc(70314);try {
            __CLR4_1_101i911i91lusqkdwo.R.inc(70315);JSONScanner lexer = new JSONScanner("frue");
            __CLR4_1_101i911i91lusqkdwo.R.inc(70316);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_1_101i911i91lusqkdwo.R.inc(70317);error = e;
        }
        __CLR4_1_101i911i91lusqkdwo.R.inc(70318);Assert.assertNotNull(error);
    }finally{__CLR4_1_101i911i91lusqkdwo.R.flushNeeded();}}

    public void test_scan_true_2() throws Exception {__CLR4_1_101i911i91lusqkdwo.R.globalSliceStart(getClass().getName(),70319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bnpsf11i9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i911i91lusqkdwo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i911i91lusqkdwo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70319,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bnpsf11i9b() throws Exception{try{__CLR4_1_101i911i91lusqkdwo.R.inc(70319);
        __CLR4_1_101i911i91lusqkdwo.R.inc(70320);JSONException error = null;
        __CLR4_1_101i911i91lusqkdwo.R.inc(70321);try {
            __CLR4_1_101i911i91lusqkdwo.R.inc(70322);JSONScanner lexer = new JSONScanner("ttue");
            __CLR4_1_101i911i91lusqkdwo.R.inc(70323);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_1_101i911i91lusqkdwo.R.inc(70324);error = e;
        }
        __CLR4_1_101i911i91lusqkdwo.R.inc(70325);Assert.assertNotNull(error);
    }finally{__CLR4_1_101i911i91lusqkdwo.R.flushNeeded();}}

    public void test_scan_true_3() throws Exception {__CLR4_1_101i911i91lusqkdwo.R.globalSliceStart(getClass().getName(),70326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ewpr7i1i9i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i911i91lusqkdwo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i911i91lusqkdwo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70326,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ewpr7i1i9i() throws Exception{try{__CLR4_1_101i911i91lusqkdwo.R.inc(70326);
        __CLR4_1_101i911i91lusqkdwo.R.inc(70327);JSONException error = null;
        __CLR4_1_101i911i91lusqkdwo.R.inc(70328);try {
            __CLR4_1_101i911i91lusqkdwo.R.inc(70329);JSONScanner lexer = new JSONScanner("trze");
            __CLR4_1_101i911i91lusqkdwo.R.inc(70330);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_1_101i911i91lusqkdwo.R.inc(70331);error = e;
        }
        __CLR4_1_101i911i91lusqkdwo.R.inc(70332);Assert.assertNotNull(error);
    }finally{__CLR4_1_101i911i91lusqkdwo.R.flushNeeded();}}

    public void test_scan_true_4() throws Exception {__CLR4_1_101i911i91lusqkdwo.R.globalSliceStart(getClass().getName(),70333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i5ppzz1i9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i911i91lusqkdwo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i911i91lusqkdwo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70333,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i5ppzz1i9p() throws Exception{try{__CLR4_1_101i911i91lusqkdwo.R.inc(70333);
        __CLR4_1_101i911i91lusqkdwo.R.inc(70334);JSONException error = null;
        __CLR4_1_101i911i91lusqkdwo.R.inc(70335);try {
            __CLR4_1_101i911i91lusqkdwo.R.inc(70336);JSONScanner lexer = new JSONScanner("truz");
            __CLR4_1_101i911i91lusqkdwo.R.inc(70337);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_1_101i911i91lusqkdwo.R.inc(70338);error = e;
        }
        __CLR4_1_101i911i91lusqkdwo.R.inc(70339);Assert.assertNotNull(error);
    }finally{__CLR4_1_101i911i91lusqkdwo.R.flushNeeded();}}

    public void test_scan_true_5() throws Exception {__CLR4_1_101i911i91lusqkdwo.R.globalSliceStart(getClass().getName(),70340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10leposg1i9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i911i91lusqkdwo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i911i91lusqkdwo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70340,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10leposg1i9w() throws Exception{try{__CLR4_1_101i911i91lusqkdwo.R.inc(70340);
        __CLR4_1_101i911i91lusqkdwo.R.inc(70341);JSONException error = null;
        __CLR4_1_101i911i91lusqkdwo.R.inc(70342);try {
            __CLR4_1_101i911i91lusqkdwo.R.inc(70343);JSONScanner lexer = new JSONScanner("truee");
            __CLR4_1_101i911i91lusqkdwo.R.inc(70344);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_1_101i911i91lusqkdwo.R.inc(70345);error = e;
        }
        __CLR4_1_101i911i91lusqkdwo.R.inc(70346);Assert.assertNotNull(error);
    }finally{__CLR4_1_101i911i91lusqkdwo.R.flushNeeded();}}

    public void test_scan_true_6() throws Exception {__CLR4_1_101i911i91lusqkdwo.R.globalSliceStart(getClass().getName(),70347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10onpnkx1ia3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i911i91lusqkdwo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i911i91lusqkdwo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70347,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10onpnkx1ia3() throws Exception{try{__CLR4_1_101i911i91lusqkdwo.R.inc(70347);
        __CLR4_1_101i911i91lusqkdwo.R.inc(70348);JSONException error = null;
        __CLR4_1_101i911i91lusqkdwo.R.inc(70349);try {
            __CLR4_1_101i911i91lusqkdwo.R.inc(70350);JSONScanner lexer = new JSONScanner("true\"");
            __CLR4_1_101i911i91lusqkdwo.R.inc(70351);lexer.scanTrue();
        } catch (JSONException e) {
            __CLR4_1_101i911i91lusqkdwo.R.inc(70352);error = e;
        }
        __CLR4_1_101i911i91lusqkdwo.R.inc(70353);Assert.assertNotNull(error);
    }finally{__CLR4_1_101i911i91lusqkdwo.R.flushNeeded();}}

    public void test_scan_true_7() throws Exception {__CLR4_1_101i911i91lusqkdwo.R.globalSliceStart(getClass().getName(),70354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rwpmde1iaa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i911i91lusqkdwo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i911i91lusqkdwo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70354,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rwpmde1iaa() throws Exception{try{__CLR4_1_101i911i91lusqkdwo.R.inc(70354);
        __CLR4_1_101i911i91lusqkdwo.R.inc(70355);JSONScanner lexer = new JSONScanner("true a");
        __CLR4_1_101i911i91lusqkdwo.R.inc(70356);lexer.scanTrue();
    }finally{__CLR4_1_101i911i91lusqkdwo.R.flushNeeded();}}

    public void test_scan_true_8() throws Exception {__CLR4_1_101i911i91lusqkdwo.R.globalSliceStart(getClass().getName(),70357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v5pl5v1iad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i911i91lusqkdwo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i911i91lusqkdwo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70357,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v5pl5v1iad() throws Exception{try{__CLR4_1_101i911i91lusqkdwo.R.inc(70357);
        __CLR4_1_101i911i91lusqkdwo.R.inc(70358);JSONScanner lexer = new JSONScanner("true,");
        __CLR4_1_101i911i91lusqkdwo.R.inc(70359);lexer.scanTrue();
    }finally{__CLR4_1_101i911i91lusqkdwo.R.flushNeeded();}}

    public void test_scan_true_9() throws Exception {__CLR4_1_101i911i91lusqkdwo.R.globalSliceStart(getClass().getName(),70360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yepjyc1iag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i911i91lusqkdwo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i911i91lusqkdwo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70360,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yepjyc1iag() throws Exception{try{__CLR4_1_101i911i91lusqkdwo.R.inc(70360);
        __CLR4_1_101i911i91lusqkdwo.R.inc(70361);JSONScanner lexer = new JSONScanner("true\na");
        __CLR4_1_101i911i91lusqkdwo.R.inc(70362);lexer.scanTrue();
    }finally{__CLR4_1_101i911i91lusqkdwo.R.flushNeeded();}}

    public void test_scan_true_10() throws Exception {__CLR4_1_101i911i91lusqkdwo.R.globalSliceStart(getClass().getName(),70363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10cu8lk21iaj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i911i91lusqkdwo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i911i91lusqkdwo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70363,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10cu8lk21iaj() throws Exception{try{__CLR4_1_101i911i91lusqkdwo.R.inc(70363);
        __CLR4_1_101i911i91lusqkdwo.R.inc(70364);JSONScanner lexer = new JSONScanner("true\ra");
        __CLR4_1_101i911i91lusqkdwo.R.inc(70365);lexer.scanTrue();
    }finally{__CLR4_1_101i911i91lusqkdwo.R.flushNeeded();}}

    public void test_scan_true_11() throws Exception {__CLR4_1_101i911i91lusqkdwo.R.globalSliceStart(getClass().getName(),70366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g38kcj1iam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i911i91lusqkdwo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i911i91lusqkdwo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70366,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g38kcj1iam() throws Exception{try{__CLR4_1_101i911i91lusqkdwo.R.inc(70366);
        __CLR4_1_101i911i91lusqkdwo.R.inc(70367);JSONScanner lexer = new JSONScanner("true\ta");
        __CLR4_1_101i911i91lusqkdwo.R.inc(70368);lexer.scanTrue();
    }finally{__CLR4_1_101i911i91lusqkdwo.R.flushNeeded();}}

    public void test_scan_true_12() throws Exception {__CLR4_1_101i911i91lusqkdwo.R.globalSliceStart(getClass().getName(),70369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jc8j501iap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i911i91lusqkdwo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i911i91lusqkdwo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70369,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jc8j501iap() throws Exception{try{__CLR4_1_101i911i91lusqkdwo.R.inc(70369);
        __CLR4_1_101i911i91lusqkdwo.R.inc(70370);JSONScanner lexer = new JSONScanner("true\fa");
        __CLR4_1_101i911i91lusqkdwo.R.inc(70371);lexer.scanTrue();
    }finally{__CLR4_1_101i911i91lusqkdwo.R.flushNeeded();}}

    public void test_scan_true_13() throws Exception {__CLR4_1_101i911i91lusqkdwo.R.globalSliceStart(getClass().getName(),70372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ml8hxh1ias();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i911i91lusqkdwo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i911i91lusqkdwo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_true_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70372,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ml8hxh1ias() throws Exception{try{__CLR4_1_101i911i91lusqkdwo.R.inc(70372);
        __CLR4_1_101i911i91lusqkdwo.R.inc(70373);JSONScanner lexer = new JSONScanner("true\ba");
        __CLR4_1_101i911i91lusqkdwo.R.inc(70374);lexer.scanTrue();
    }finally{__CLR4_1_101i911i91lusqkdwo.R.flushNeeded();}}

    public void test_scan_false_14() throws Exception {__CLR4_1_101i911i91lusqkdwo.R.globalSliceStart(getClass().getName(),70375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104717fp1iav();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i911i91lusqkdwo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i911i91lusqkdwo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_false_14",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70375,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104717fp1iav() throws Exception{try{__CLR4_1_101i911i91lusqkdwo.R.inc(70375);
        __CLR4_1_101i911i91lusqkdwo.R.inc(70376);JSONScanner lexer = new JSONScanner("true}");
        __CLR4_1_101i911i91lusqkdwo.R.inc(70377);lexer.scanTrue();
    }finally{__CLR4_1_101i911i91lusqkdwo.R.flushNeeded();}}

    public void test_scan_false_15() throws Exception {__CLR4_1_101i911i91lusqkdwo.R.globalSliceStart(getClass().getName(),70378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10y18n81iay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i911i91lusqkdwo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i911i91lusqkdwo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_true.test_scan_false_15",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70378,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10y18n81iay() throws Exception{try{__CLR4_1_101i911i91lusqkdwo.R.inc(70378);
        __CLR4_1_101i911i91lusqkdwo.R.inc(70379);JSONScanner lexer = new JSONScanner("true]");
        __CLR4_1_101i911i91lusqkdwo.R.inc(70380);lexer.scanTrue();
    }finally{__CLR4_1_101i911i91lusqkdwo.R.flushNeeded();}}
}
