/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONScannerTest_false extends TestCase {static class __CLR4_1_101icj1icjluszwckw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,70514,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_scan_false_0() throws Exception {__CLR4_1_101icj1icjluszwckw.R.globalSliceStart(getClass().getName(),70435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vooshy1icj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101icj1icjluszwckw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101icj1icjluszwckw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70435,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vooshy1icj() throws Exception{try{__CLR4_1_101icj1icjluszwckw.R.inc(70435);
        __CLR4_1_101icj1icjluszwckw.R.inc(70436);JSONScanner lexer = new JSONScanner("false");
        __CLR4_1_101icj1icjluszwckw.R.inc(70437);lexer.scanFalse();
    }finally{__CLR4_1_101icj1icjluszwckw.R.flushNeeded();}}

    public void test_scan_false_1() throws Exception {__CLR4_1_101icj1icjluszwckw.R.globalSliceStart(getClass().getName(),70438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yxoraf1icm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101icj1icjluszwckw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101icj1icjluszwckw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70438,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yxoraf1icm() throws Exception{try{__CLR4_1_101icj1icjluszwckw.R.inc(70438);
        __CLR4_1_101icj1icjluszwckw.R.inc(70439);JSONException error = null;
        __CLR4_1_101icj1icjluszwckw.R.inc(70440);try {
            __CLR4_1_101icj1icjluszwckw.R.inc(70441);JSONScanner lexer = new JSONScanner("zalse");
            __CLR4_1_101icj1icjluszwckw.R.inc(70442);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_1_101icj1icjluszwckw.R.inc(70443);error = e;
        }
        __CLR4_1_101icj1icjluszwckw.R.inc(70444);Assert.assertNotNull(error);
    }finally{__CLR4_1_101icj1icjluszwckw.R.flushNeeded();}}

    public void test_scan_false_2() throws Exception {__CLR4_1_101icj1icjluszwckw.R.globalSliceStart(getClass().getName(),70445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wufbw81ict();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101icj1icjluszwckw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101icj1icjluszwckw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70445,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wufbw81ict() throws Exception{try{__CLR4_1_101icj1icjluszwckw.R.inc(70445);
        __CLR4_1_101icj1icjluszwckw.R.inc(70446);JSONException error = null;
        __CLR4_1_101icj1icjluszwckw.R.inc(70447);try {
            __CLR4_1_101icj1icjluszwckw.R.inc(70448);JSONScanner lexer = new JSONScanner("fzlse");
            __CLR4_1_101icj1icjluszwckw.R.inc(70449);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_1_101icj1icjluszwckw.R.inc(70450);error = e;
        }
        __CLR4_1_101icj1icjluszwckw.R.inc(70451);Assert.assertNotNull(error);
    }finally{__CLR4_1_101icj1icjluszwckw.R.flushNeeded();}}

    public void test_scan_false_3() throws Exception {__CLR4_1_101icj1icjluszwckw.R.globalSliceStart(getClass().getName(),70452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tlfd3r1id0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101icj1icjluszwckw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101icj1icjluszwckw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70452,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tlfd3r1id0() throws Exception{try{__CLR4_1_101icj1icjluszwckw.R.inc(70452);
        __CLR4_1_101icj1icjluszwckw.R.inc(70453);JSONException error = null;
        __CLR4_1_101icj1icjluszwckw.R.inc(70454);try {
            __CLR4_1_101icj1icjluszwckw.R.inc(70455);JSONScanner lexer = new JSONScanner("fazse");
            __CLR4_1_101icj1icjluszwckw.R.inc(70456);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_1_101icj1icjluszwckw.R.inc(70457);error = e;
        }
        __CLR4_1_101icj1icjluszwckw.R.inc(70458);Assert.assertNotNull(error);
    }finally{__CLR4_1_101icj1icjluszwckw.R.flushNeeded();}}

    public void test_scan_false_4() throws Exception {__CLR4_1_101icj1icjluszwckw.R.globalSliceStart(getClass().getName(),70459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qcfeba1id7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101icj1icjluszwckw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101icj1icjluszwckw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70459,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qcfeba1id7() throws Exception{try{__CLR4_1_101icj1icjluszwckw.R.inc(70459);
        __CLR4_1_101icj1icjluszwckw.R.inc(70460);JSONException error = null;
        __CLR4_1_101icj1icjluszwckw.R.inc(70461);try {
            __CLR4_1_101icj1icjluszwckw.R.inc(70462);JSONScanner lexer = new JSONScanner("falze");
            __CLR4_1_101icj1icjluszwckw.R.inc(70463);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_1_101icj1icjluszwckw.R.inc(70464);error = e;
        }
        __CLR4_1_101icj1icjluszwckw.R.inc(70465);Assert.assertNotNull(error);
    }finally{__CLR4_1_101icj1icjluszwckw.R.flushNeeded();}}

    public void test_scan_false_5() throws Exception {__CLR4_1_101icj1icjluszwckw.R.globalSliceStart(getClass().getName(),70466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n3ffit1ide();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101icj1icjluszwckw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101icj1icjluszwckw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70466,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n3ffit1ide() throws Exception{try{__CLR4_1_101icj1icjluszwckw.R.inc(70466);
        __CLR4_1_101icj1icjluszwckw.R.inc(70467);JSONException error = null;
        __CLR4_1_101icj1icjluszwckw.R.inc(70468);try {
            __CLR4_1_101icj1icjluszwckw.R.inc(70469);JSONScanner lexer = new JSONScanner("falsz");
            __CLR4_1_101icj1icjluszwckw.R.inc(70470);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_1_101icj1icjluszwckw.R.inc(70471);error = e;
        }
        __CLR4_1_101icj1icjluszwckw.R.inc(70472);Assert.assertNotNull(error);
    }finally{__CLR4_1_101icj1icjluszwckw.R.flushNeeded();}}

    public void test_scan_false_6_1() throws Exception {__CLR4_1_101icj1icjluszwckw.R.globalSliceStart(getClass().getName(),70473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10utun9e1idl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101icj1icjluszwckw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101icj1icjluszwckw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_6_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70473,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10utun9e1idl() throws Exception{try{__CLR4_1_101icj1icjluszwckw.R.inc(70473);
        __CLR4_1_101icj1icjluszwckw.R.inc(70474);JSONException error = null;
        __CLR4_1_101icj1icjluszwckw.R.inc(70475);try {
            __CLR4_1_101icj1icjluszwckw.R.inc(70476);JSONScanner lexer = new JSONScanner("falsee");
            __CLR4_1_101icj1icjluszwckw.R.inc(70477);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_1_101icj1icjluszwckw.R.inc(70478);error = e;
        }
        __CLR4_1_101icj1icjluszwckw.R.inc(70479);Assert.assertNotNull(error);
    }finally{__CLR4_1_101icj1icjluszwckw.R.flushNeeded();}}

    public void test_scan_false_6() throws Exception {__CLR4_1_101icj1icjluszwckw.R.globalSliceStart(getClass().getName(),70480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jufgqc1ids();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101icj1icjluszwckw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101icj1icjluszwckw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70480,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jufgqc1ids() throws Exception{try{__CLR4_1_101icj1icjluszwckw.R.inc(70480);
        __CLR4_1_101icj1icjluszwckw.R.inc(70481);JSONException error = null;
        __CLR4_1_101icj1icjluszwckw.R.inc(70482);try {
            __CLR4_1_101icj1icjluszwckw.R.inc(70483);JSONScanner lexer = new JSONScanner("false\"");
            __CLR4_1_101icj1icjluszwckw.R.inc(70484);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_1_101icj1icjluszwckw.R.inc(70485);error = e;
        }
        __CLR4_1_101icj1icjluszwckw.R.inc(70486);Assert.assertNotNull(error);
    }finally{__CLR4_1_101icj1icjluszwckw.R.flushNeeded();}}

    public void test_scan_false_7() throws Exception {__CLR4_1_101icj1icjluszwckw.R.globalSliceStart(getClass().getName(),70487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10glfhxv1idz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101icj1icjluszwckw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101icj1icjluszwckw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70487,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10glfhxv1idz() throws Exception{try{__CLR4_1_101icj1icjluszwckw.R.inc(70487);
        __CLR4_1_101icj1icjluszwckw.R.inc(70488);JSONScanner lexer = new JSONScanner("false a");
        __CLR4_1_101icj1icjluszwckw.R.inc(70489);lexer.scanFalse();
    }finally{__CLR4_1_101icj1icjluszwckw.R.flushNeeded();}}

    public void test_scan_false_8() throws Exception {__CLR4_1_101icj1icjluszwckw.R.globalSliceStart(getClass().getName(),70490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dcfj5e1ie2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101icj1icjluszwckw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101icj1icjluszwckw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70490,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dcfj5e1ie2() throws Exception{try{__CLR4_1_101icj1icjluszwckw.R.inc(70490);
        __CLR4_1_101icj1icjluszwckw.R.inc(70491);JSONScanner lexer = new JSONScanner("false,");
        __CLR4_1_101icj1icjluszwckw.R.inc(70492);lexer.scanFalse();
    }finally{__CLR4_1_101icj1icjluszwckw.R.flushNeeded();}}

    public void test_scan_false_9() throws Exception {__CLR4_1_101icj1icjluszwckw.R.globalSliceStart(getClass().getName(),70493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a3fkcx1ie5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101icj1icjluszwckw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101icj1icjluszwckw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70493,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a3fkcx1ie5() throws Exception{try{__CLR4_1_101icj1icjluszwckw.R.inc(70493);
        __CLR4_1_101icj1icjluszwckw.R.inc(70494);JSONScanner lexer = new JSONScanner("false\na");
        __CLR4_1_101icj1icjluszwckw.R.inc(70495);lexer.scanFalse();
    }finally{__CLR4_1_101icj1icjluszwckw.R.flushNeeded();}}

    public void test_scan_false_10() throws Exception {__CLR4_1_101icj1icjluszwckw.R.globalSliceStart(getClass().getName(),70496);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10h712ll1ie8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101icj1icjluszwckw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101icj1icjluszwckw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70496,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10h712ll1ie8() throws Exception{try{__CLR4_1_101icj1icjluszwckw.R.inc(70496);
        __CLR4_1_101icj1icjluszwckw.R.inc(70497);JSONScanner lexer = new JSONScanner("false\ra");
        __CLR4_1_101icj1icjluszwckw.R.inc(70498);lexer.scanFalse();
    }finally{__CLR4_1_101icj1icjluszwckw.R.flushNeeded();}}

    public void test_scan_false_11() throws Exception {__CLR4_1_101icj1icjluszwckw.R.globalSliceStart(getClass().getName(),70499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dy13t41ieb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101icj1icjluszwckw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101icj1icjluszwckw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70499,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dy13t41ieb() throws Exception{try{__CLR4_1_101icj1icjluszwckw.R.inc(70499);
        __CLR4_1_101icj1icjluszwckw.R.inc(70500);JSONScanner lexer = new JSONScanner("false\ta");
        __CLR4_1_101icj1icjluszwckw.R.inc(70501);lexer.scanFalse();
    }finally{__CLR4_1_101icj1icjluszwckw.R.flushNeeded();}}

    public void test_scan_false_12() throws Exception {__CLR4_1_101icj1icjluszwckw.R.globalSliceStart(getClass().getName(),70502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ap150n1iee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101icj1icjluszwckw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101icj1icjluszwckw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70502,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ap150n1iee() throws Exception{try{__CLR4_1_101icj1icjluszwckw.R.inc(70502);
        __CLR4_1_101icj1icjluszwckw.R.inc(70503);JSONScanner lexer = new JSONScanner("false\fa");
        __CLR4_1_101icj1icjluszwckw.R.inc(70504);lexer.scanFalse();
    }finally{__CLR4_1_101icj1icjluszwckw.R.flushNeeded();}}

    public void test_scan_false_13() throws Exception {__CLR4_1_101icj1icjluszwckw.R.globalSliceStart(getClass().getName(),70505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107g16861ieh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101icj1icjluszwckw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101icj1icjluszwckw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70505,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107g16861ieh() throws Exception{try{__CLR4_1_101icj1icjluszwckw.R.inc(70505);
        __CLR4_1_101icj1icjluszwckw.R.inc(70506);JSONScanner lexer = new JSONScanner("false\ba");
        __CLR4_1_101icj1icjluszwckw.R.inc(70507);lexer.scanFalse();
    }finally{__CLR4_1_101icj1icjluszwckw.R.flushNeeded();}}

    public void test_scan_false_14() throws Exception {__CLR4_1_101icj1icjluszwckw.R.globalSliceStart(getClass().getName(),70508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104717fp1iek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101icj1icjluszwckw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101icj1icjluszwckw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_14",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70508,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104717fp1iek() throws Exception{try{__CLR4_1_101icj1icjluszwckw.R.inc(70508);
        __CLR4_1_101icj1icjluszwckw.R.inc(70509);JSONScanner lexer = new JSONScanner("false}");
        __CLR4_1_101icj1icjluszwckw.R.inc(70510);lexer.scanFalse();
    }finally{__CLR4_1_101icj1icjluszwckw.R.flushNeeded();}}

    public void test_scan_false_15() throws Exception {__CLR4_1_101icj1icjluszwckw.R.globalSliceStart(getClass().getName(),70511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10y18n81ien();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101icj1icjluszwckw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101icj1icjluszwckw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_15",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70511,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10y18n81ien() throws Exception{try{__CLR4_1_101icj1icjluszwckw.R.inc(70511);
        __CLR4_1_101icj1icjluszwckw.R.inc(70512);JSONScanner lexer = new JSONScanner("false]");
        __CLR4_1_101icj1icjluszwckw.R.inc(70513);lexer.scanFalse();
    }finally{__CLR4_1_101icj1icjluszwckw.R.flushNeeded();}}
}
