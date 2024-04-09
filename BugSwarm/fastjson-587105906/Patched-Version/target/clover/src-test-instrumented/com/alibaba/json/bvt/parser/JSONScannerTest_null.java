/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONScannerTest_null extends TestCase {static class __CLR4_5_21ikg1ikglusvnd3r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,70792,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_scan_null_0() throws Exception {__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceStart(getClass().getName(),70720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kuaux81ikg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ikg1ikglusvnd3r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70720,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kuaux81ikg() throws Exception{try{__CLR4_5_21ikg1ikglusvnd3r.R.inc(70720);
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70721);JSONScanner lexer = new JSONScanner("null");
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70722);lexer.scanNullOrNew();
    }finally{__CLR4_5_21ikg1ikglusvnd3r.R.flushNeeded();}}

    public void test_scan_null_1() throws Exception {__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceStart(getClass().getName(),70723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hlaw4r1ikj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ikg1ikglusvnd3r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70723,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hlaw4r1ikj() throws Exception{try{__CLR4_5_21ikg1ikglusvnd3r.R.inc(70723);
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70724);JSONException error = null;
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70725);try {
            __CLR4_5_21ikg1ikglusvnd3r.R.inc(70726);JSONScanner lexer = new JSONScanner("zull");
            __CLR4_5_21ikg1ikglusvnd3r.R.inc(70727);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21ikg1ikglusvnd3r.R.inc(70728);error = e;
        }
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70729);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ikg1ikglusvnd3r.R.flushNeeded();}}

    public void test_scan_null_2() throws Exception {__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceStart(getClass().getName(),70730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ecaxca1ikq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ikg1ikglusvnd3r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70730,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ecaxca1ikq() throws Exception{try{__CLR4_5_21ikg1ikglusvnd3r.R.inc(70730);
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70731);JSONException error = null;
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70732);try {
            __CLR4_5_21ikg1ikglusvnd3r.R.inc(70733);JSONScanner lexer = new JSONScanner("nzll");
            __CLR4_5_21ikg1ikglusvnd3r.R.inc(70734);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21ikg1ikglusvnd3r.R.inc(70735);error = e;
        }
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70736);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ikg1ikglusvnd3r.R.flushNeeded();}}

    public void test_scan_null_3() throws Exception {__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceStart(getClass().getName(),70737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b3ayjt1ikx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ikg1ikglusvnd3r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70737,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b3ayjt1ikx() throws Exception{try{__CLR4_5_21ikg1ikglusvnd3r.R.inc(70737);
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70738);JSONException error = null;
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70739);try {
            __CLR4_5_21ikg1ikglusvnd3r.R.inc(70740);JSONScanner lexer = new JSONScanner("nuzl");
            __CLR4_5_21ikg1ikglusvnd3r.R.inc(70741);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21ikg1ikglusvnd3r.R.inc(70742);error = e;
        }
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70743);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ikg1ikglusvnd3r.R.flushNeeded();}}

    public void test_scan_null_4() throws Exception {__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceStart(getClass().getName(),70744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27uazrc1il4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ikg1ikglusvnd3r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70744,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27uazrc1il4() throws Exception{try{__CLR4_5_21ikg1ikglusvnd3r.R.inc(70744);
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70745);JSONException error = null;
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70746);try {
            __CLR4_5_21ikg1ikglusvnd3r.R.inc(70747);JSONScanner lexer = new JSONScanner("nulz");
            __CLR4_5_21ikg1ikglusvnd3r.R.inc(70748);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21ikg1ikglusvnd3r.R.inc(70749);error = e;
        }
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70750);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ikg1ikglusvnd3r.R.flushNeeded();}}

    public void test_scan_null_5() throws Exception {__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceStart(getClass().getName(),70751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24lb0yv1ilb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ikg1ikglusvnd3r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70751,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24lb0yv1ilb() throws Exception{try{__CLR4_5_21ikg1ikglusvnd3r.R.inc(70751);
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70752);JSONException error = null;
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70753);try {
            __CLR4_5_21ikg1ikglusvnd3r.R.inc(70754);JSONScanner lexer = new JSONScanner("nulle");
            __CLR4_5_21ikg1ikglusvnd3r.R.inc(70755);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21ikg1ikglusvnd3r.R.inc(70756);error = e;
        }
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70757);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ikg1ikglusvnd3r.R.flushNeeded();}}

    public void test_scan_null_6() throws Exception {__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceStart(getClass().getName(),70758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21cb26e1ili();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ikg1ikglusvnd3r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70758,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21cb26e1ili() throws Exception{try{__CLR4_5_21ikg1ikglusvnd3r.R.inc(70758);
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70759);JSONException error = null;
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70760);try {
            __CLR4_5_21ikg1ikglusvnd3r.R.inc(70761);JSONScanner lexer = new JSONScanner("null\"");
            __CLR4_5_21ikg1ikglusvnd3r.R.inc(70762);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21ikg1ikglusvnd3r.R.inc(70763);error = e;
        }
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70764);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ikg1ikglusvnd3r.R.flushNeeded();}}

    public void test_scan_null_7() throws Exception {__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceStart(getClass().getName(),70765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21wowm31ilp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ikg1ikglusvnd3r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70765,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21wowm31ilp() throws Exception{try{__CLR4_5_21ikg1ikglusvnd3r.R.inc(70765);
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70766);JSONScanner lexer = new JSONScanner("null a");
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70767);lexer.scanNullOrNew();
    }finally{__CLR4_5_21ikg1ikglusvnd3r.R.flushNeeded();}}

    public void test_scan_null_8() throws Exception {__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceStart(getClass().getName(),70768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_255ovek1ils();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ikg1ikglusvnd3r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70768,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_255ovek1ils() throws Exception{try{__CLR4_5_21ikg1ikglusvnd3r.R.inc(70768);
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70769);JSONScanner lexer = new JSONScanner("null,");
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70770);lexer.scanNullOrNew();
    }finally{__CLR4_5_21ikg1ikglusvnd3r.R.flushNeeded();}}

    public void test_scan_null_9() throws Exception {__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceStart(getClass().getName(),70771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28eou711ilv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ikg1ikglusvnd3r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70771,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28eou711ilv() throws Exception{try{__CLR4_5_21ikg1ikglusvnd3r.R.inc(70771);
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70772);JSONScanner lexer = new JSONScanner("null\na");
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70773);lexer.scanNullOrNew();
    }finally{__CLR4_5_21ikg1ikglusvnd3r.R.flushNeeded();}}

    public void test_scan_null_10() throws Exception {__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceStart(getClass().getName(),70774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bu4z871ily();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ikg1ikglusvnd3r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70774,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bu4z871ily() throws Exception{try{__CLR4_5_21ikg1ikglusvnd3r.R.inc(70774);
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70775);JSONScanner lexer = new JSONScanner("null\ra");
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70776);lexer.scanNullOrNew();
    }finally{__CLR4_5_21ikg1ikglusvnd3r.R.flushNeeded();}}

    public void test_scan_null_11() throws Exception {__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceStart(getClass().getName(),70777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28l50fq1im1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ikg1ikglusvnd3r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70777,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28l50fq1im1() throws Exception{try{__CLR4_5_21ikg1ikglusvnd3r.R.inc(70777);
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70778);JSONScanner lexer = new JSONScanner("null\ta");
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70779);lexer.scanNullOrNew();
    }finally{__CLR4_5_21ikg1ikglusvnd3r.R.flushNeeded();}}

    public void test_scan_null_12() throws Exception {__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceStart(getClass().getName(),70780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25c51n91im4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ikg1ikglusvnd3r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70780,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25c51n91im4() throws Exception{try{__CLR4_5_21ikg1ikglusvnd3r.R.inc(70780);
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70781);JSONScanner lexer = new JSONScanner("null\fa");
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70782);lexer.scanNullOrNew();
    }finally{__CLR4_5_21ikg1ikglusvnd3r.R.flushNeeded();}}

    public void test_scan_null_13() throws Exception {__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceStart(getClass().getName(),70783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22352us1im7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ikg1ikglusvnd3r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70783,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22352us1im7() throws Exception{try{__CLR4_5_21ikg1ikglusvnd3r.R.inc(70783);
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70784);JSONScanner lexer = new JSONScanner("null\ba");
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70785);lexer.scanNullOrNew();
    }finally{__CLR4_5_21ikg1ikglusvnd3r.R.flushNeeded();}}

    public void test_scan_false_14() throws Exception {__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceStart(getClass().getName(),70786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24717fp1ima();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ikg1ikglusvnd3r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_false_14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70786,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24717fp1ima() throws Exception{try{__CLR4_5_21ikg1ikglusvnd3r.R.inc(70786);
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70787);JSONScanner lexer = new JSONScanner("null}");
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70788);lexer.scanNullOrNew();
    }finally{__CLR4_5_21ikg1ikglusvnd3r.R.flushNeeded();}}

    public void test_scan_false_15() throws Exception {__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceStart(getClass().getName(),70789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y18n81imd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ikg1ikglusvnd3r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ikg1ikglusvnd3r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_false_15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70789,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y18n81imd() throws Exception{try{__CLR4_5_21ikg1ikglusvnd3r.R.inc(70789);
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70790);JSONScanner lexer = new JSONScanner("null]");
        __CLR4_5_21ikg1ikglusvnd3r.R.inc(70791);lexer.scanNullOrNew();
    }finally{__CLR4_5_21ikg1ikglusvnd3r.R.flushNeeded();}}
}
