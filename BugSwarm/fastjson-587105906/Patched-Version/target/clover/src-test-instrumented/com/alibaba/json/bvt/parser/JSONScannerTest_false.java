/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONScannerTest_false extends TestCase {static class __CLR4_5_21ic81ic8lusvnd2l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,70503,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_scan_false_0() throws Exception {__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceStart(getClass().getName(),70424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vooshy1ic8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic81ic8lusvnd2l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70424,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vooshy1ic8() throws Exception{try{__CLR4_5_21ic81ic8lusvnd2l.R.inc(70424);
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70425);JSONScanner lexer = new JSONScanner("false");
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70426);lexer.scanFalse();
    }finally{__CLR4_5_21ic81ic8lusvnd2l.R.flushNeeded();}}

    public void test_scan_false_1() throws Exception {__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceStart(getClass().getName(),70427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yxoraf1icb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic81ic8lusvnd2l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70427,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yxoraf1icb() throws Exception{try{__CLR4_5_21ic81ic8lusvnd2l.R.inc(70427);
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70428);JSONException error = null;
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70429);try {
            __CLR4_5_21ic81ic8lusvnd2l.R.inc(70430);JSONScanner lexer = new JSONScanner("zalse");
            __CLR4_5_21ic81ic8lusvnd2l.R.inc(70431);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_5_21ic81ic8lusvnd2l.R.inc(70432);error = e;
        }
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70433);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ic81ic8lusvnd2l.R.flushNeeded();}}

    public void test_scan_false_2() throws Exception {__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceStart(getClass().getName(),70434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wufbw81ici();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic81ic8lusvnd2l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70434,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wufbw81ici() throws Exception{try{__CLR4_5_21ic81ic8lusvnd2l.R.inc(70434);
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70435);JSONException error = null;
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70436);try {
            __CLR4_5_21ic81ic8lusvnd2l.R.inc(70437);JSONScanner lexer = new JSONScanner("fzlse");
            __CLR4_5_21ic81ic8lusvnd2l.R.inc(70438);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_5_21ic81ic8lusvnd2l.R.inc(70439);error = e;
        }
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70440);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ic81ic8lusvnd2l.R.flushNeeded();}}

    public void test_scan_false_3() throws Exception {__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceStart(getClass().getName(),70441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tlfd3r1icp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic81ic8lusvnd2l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70441,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tlfd3r1icp() throws Exception{try{__CLR4_5_21ic81ic8lusvnd2l.R.inc(70441);
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70442);JSONException error = null;
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70443);try {
            __CLR4_5_21ic81ic8lusvnd2l.R.inc(70444);JSONScanner lexer = new JSONScanner("fazse");
            __CLR4_5_21ic81ic8lusvnd2l.R.inc(70445);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_5_21ic81ic8lusvnd2l.R.inc(70446);error = e;
        }
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70447);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ic81ic8lusvnd2l.R.flushNeeded();}}

    public void test_scan_false_4() throws Exception {__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceStart(getClass().getName(),70448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qcfeba1icw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic81ic8lusvnd2l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70448,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qcfeba1icw() throws Exception{try{__CLR4_5_21ic81ic8lusvnd2l.R.inc(70448);
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70449);JSONException error = null;
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70450);try {
            __CLR4_5_21ic81ic8lusvnd2l.R.inc(70451);JSONScanner lexer = new JSONScanner("falze");
            __CLR4_5_21ic81ic8lusvnd2l.R.inc(70452);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_5_21ic81ic8lusvnd2l.R.inc(70453);error = e;
        }
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70454);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ic81ic8lusvnd2l.R.flushNeeded();}}

    public void test_scan_false_5() throws Exception {__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceStart(getClass().getName(),70455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n3ffit1id3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic81ic8lusvnd2l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70455,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n3ffit1id3() throws Exception{try{__CLR4_5_21ic81ic8lusvnd2l.R.inc(70455);
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70456);JSONException error = null;
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70457);try {
            __CLR4_5_21ic81ic8lusvnd2l.R.inc(70458);JSONScanner lexer = new JSONScanner("falsz");
            __CLR4_5_21ic81ic8lusvnd2l.R.inc(70459);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_5_21ic81ic8lusvnd2l.R.inc(70460);error = e;
        }
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70461);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ic81ic8lusvnd2l.R.flushNeeded();}}

    public void test_scan_false_6_1() throws Exception {__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceStart(getClass().getName(),70462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2utun9e1ida();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic81ic8lusvnd2l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_6_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70462,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2utun9e1ida() throws Exception{try{__CLR4_5_21ic81ic8lusvnd2l.R.inc(70462);
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70463);JSONException error = null;
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70464);try {
            __CLR4_5_21ic81ic8lusvnd2l.R.inc(70465);JSONScanner lexer = new JSONScanner("falsee");
            __CLR4_5_21ic81ic8lusvnd2l.R.inc(70466);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_5_21ic81ic8lusvnd2l.R.inc(70467);error = e;
        }
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70468);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ic81ic8lusvnd2l.R.flushNeeded();}}

    public void test_scan_false_6() throws Exception {__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceStart(getClass().getName(),70469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jufgqc1idh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic81ic8lusvnd2l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70469,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jufgqc1idh() throws Exception{try{__CLR4_5_21ic81ic8lusvnd2l.R.inc(70469);
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70470);JSONException error = null;
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70471);try {
            __CLR4_5_21ic81ic8lusvnd2l.R.inc(70472);JSONScanner lexer = new JSONScanner("false\"");
            __CLR4_5_21ic81ic8lusvnd2l.R.inc(70473);lexer.scanFalse();
        } catch (JSONException e) {
            __CLR4_5_21ic81ic8lusvnd2l.R.inc(70474);error = e;
        }
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70475);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ic81ic8lusvnd2l.R.flushNeeded();}}

    public void test_scan_false_7() throws Exception {__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceStart(getClass().getName(),70476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2glfhxv1ido();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic81ic8lusvnd2l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70476,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2glfhxv1ido() throws Exception{try{__CLR4_5_21ic81ic8lusvnd2l.R.inc(70476);
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70477);JSONScanner lexer = new JSONScanner("false a");
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70478);lexer.scanFalse();
    }finally{__CLR4_5_21ic81ic8lusvnd2l.R.flushNeeded();}}

    public void test_scan_false_8() throws Exception {__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceStart(getClass().getName(),70479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dcfj5e1idr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic81ic8lusvnd2l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70479,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dcfj5e1idr() throws Exception{try{__CLR4_5_21ic81ic8lusvnd2l.R.inc(70479);
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70480);JSONScanner lexer = new JSONScanner("false,");
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70481);lexer.scanFalse();
    }finally{__CLR4_5_21ic81ic8lusvnd2l.R.flushNeeded();}}

    public void test_scan_false_9() throws Exception {__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceStart(getClass().getName(),70482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a3fkcx1idu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic81ic8lusvnd2l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70482,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a3fkcx1idu() throws Exception{try{__CLR4_5_21ic81ic8lusvnd2l.R.inc(70482);
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70483);JSONScanner lexer = new JSONScanner("false\na");
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70484);lexer.scanFalse();
    }finally{__CLR4_5_21ic81ic8lusvnd2l.R.flushNeeded();}}

    public void test_scan_false_10() throws Exception {__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceStart(getClass().getName(),70485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h712ll1idx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic81ic8lusvnd2l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70485,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h712ll1idx() throws Exception{try{__CLR4_5_21ic81ic8lusvnd2l.R.inc(70485);
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70486);JSONScanner lexer = new JSONScanner("false\ra");
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70487);lexer.scanFalse();
    }finally{__CLR4_5_21ic81ic8lusvnd2l.R.flushNeeded();}}

    public void test_scan_false_11() throws Exception {__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceStart(getClass().getName(),70488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dy13t41ie0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic81ic8lusvnd2l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70488,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dy13t41ie0() throws Exception{try{__CLR4_5_21ic81ic8lusvnd2l.R.inc(70488);
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70489);JSONScanner lexer = new JSONScanner("false\ta");
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70490);lexer.scanFalse();
    }finally{__CLR4_5_21ic81ic8lusvnd2l.R.flushNeeded();}}

    public void test_scan_false_12() throws Exception {__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceStart(getClass().getName(),70491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ap150n1ie3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic81ic8lusvnd2l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70491,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ap150n1ie3() throws Exception{try{__CLR4_5_21ic81ic8lusvnd2l.R.inc(70491);
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70492);JSONScanner lexer = new JSONScanner("false\fa");
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70493);lexer.scanFalse();
    }finally{__CLR4_5_21ic81ic8lusvnd2l.R.flushNeeded();}}

    public void test_scan_false_13() throws Exception {__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceStart(getClass().getName(),70494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27g16861ie6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic81ic8lusvnd2l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70494,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27g16861ie6() throws Exception{try{__CLR4_5_21ic81ic8lusvnd2l.R.inc(70494);
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70495);JSONScanner lexer = new JSONScanner("false\ba");
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70496);lexer.scanFalse();
    }finally{__CLR4_5_21ic81ic8lusvnd2l.R.flushNeeded();}}

    public void test_scan_false_14() throws Exception {__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceStart(getClass().getName(),70497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24717fp1ie9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic81ic8lusvnd2l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70497,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24717fp1ie9() throws Exception{try{__CLR4_5_21ic81ic8lusvnd2l.R.inc(70497);
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70498);JSONScanner lexer = new JSONScanner("false}");
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70499);lexer.scanFalse();
    }finally{__CLR4_5_21ic81ic8lusvnd2l.R.flushNeeded();}}

    public void test_scan_false_15() throws Exception {__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceStart(getClass().getName(),70500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y18n81iec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ic81ic8lusvnd2l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ic81ic8lusvnd2l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_false.test_scan_false_15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70500,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y18n81iec() throws Exception{try{__CLR4_5_21ic81ic8lusvnd2l.R.inc(70500);
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70501);JSONScanner lexer = new JSONScanner("false]");
        __CLR4_5_21ic81ic8lusvnd2l.R.inc(70502);lexer.scanFalse();
    }finally{__CLR4_5_21ic81ic8lusvnd2l.R.flushNeeded();}}
}
