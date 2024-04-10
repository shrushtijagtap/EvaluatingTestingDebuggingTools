/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONScannerTest_null extends TestCase {static class __CLR4_1_101ikr1ikrluszwcli{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,70803,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_scan_null_0() throws Exception {__CLR4_1_101ikr1ikrluszwcli.R.globalSliceStart(getClass().getName(),70731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kuaux81ikr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ikr1ikrluszwcli.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ikr1ikrluszwcli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70731,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kuaux81ikr() throws Exception{try{__CLR4_1_101ikr1ikrluszwcli.R.inc(70731);
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70732);JSONScanner lexer = new JSONScanner("null");
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70733);lexer.scanNullOrNew();
    }finally{__CLR4_1_101ikr1ikrluszwcli.R.flushNeeded();}}

    public void test_scan_null_1() throws Exception {__CLR4_1_101ikr1ikrluszwcli.R.globalSliceStart(getClass().getName(),70734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hlaw4r1iku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ikr1ikrluszwcli.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ikr1ikrluszwcli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70734,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hlaw4r1iku() throws Exception{try{__CLR4_1_101ikr1ikrluszwcli.R.inc(70734);
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70735);JSONException error = null;
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70736);try {
            __CLR4_1_101ikr1ikrluszwcli.R.inc(70737);JSONScanner lexer = new JSONScanner("zull");
            __CLR4_1_101ikr1ikrluszwcli.R.inc(70738);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101ikr1ikrluszwcli.R.inc(70739);error = e;
        }
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70740);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ikr1ikrluszwcli.R.flushNeeded();}}

    public void test_scan_null_2() throws Exception {__CLR4_1_101ikr1ikrluszwcli.R.globalSliceStart(getClass().getName(),70741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ecaxca1il1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ikr1ikrluszwcli.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ikr1ikrluszwcli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70741,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ecaxca1il1() throws Exception{try{__CLR4_1_101ikr1ikrluszwcli.R.inc(70741);
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70742);JSONException error = null;
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70743);try {
            __CLR4_1_101ikr1ikrluszwcli.R.inc(70744);JSONScanner lexer = new JSONScanner("nzll");
            __CLR4_1_101ikr1ikrluszwcli.R.inc(70745);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101ikr1ikrluszwcli.R.inc(70746);error = e;
        }
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70747);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ikr1ikrluszwcli.R.flushNeeded();}}

    public void test_scan_null_3() throws Exception {__CLR4_1_101ikr1ikrluszwcli.R.globalSliceStart(getClass().getName(),70748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10b3ayjt1il8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ikr1ikrluszwcli.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ikr1ikrluszwcli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70748,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10b3ayjt1il8() throws Exception{try{__CLR4_1_101ikr1ikrluszwcli.R.inc(70748);
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70749);JSONException error = null;
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70750);try {
            __CLR4_1_101ikr1ikrluszwcli.R.inc(70751);JSONScanner lexer = new JSONScanner("nuzl");
            __CLR4_1_101ikr1ikrluszwcli.R.inc(70752);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101ikr1ikrluszwcli.R.inc(70753);error = e;
        }
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70754);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ikr1ikrluszwcli.R.flushNeeded();}}

    public void test_scan_null_4() throws Exception {__CLR4_1_101ikr1ikrluszwcli.R.globalSliceStart(getClass().getName(),70755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107uazrc1ilf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ikr1ikrluszwcli.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ikr1ikrluszwcli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70755,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107uazrc1ilf() throws Exception{try{__CLR4_1_101ikr1ikrluszwcli.R.inc(70755);
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70756);JSONException error = null;
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70757);try {
            __CLR4_1_101ikr1ikrluszwcli.R.inc(70758);JSONScanner lexer = new JSONScanner("nulz");
            __CLR4_1_101ikr1ikrluszwcli.R.inc(70759);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101ikr1ikrluszwcli.R.inc(70760);error = e;
        }
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70761);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ikr1ikrluszwcli.R.flushNeeded();}}

    public void test_scan_null_5() throws Exception {__CLR4_1_101ikr1ikrluszwcli.R.globalSliceStart(getClass().getName(),70762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104lb0yv1ilm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ikr1ikrluszwcli.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ikr1ikrluszwcli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70762,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104lb0yv1ilm() throws Exception{try{__CLR4_1_101ikr1ikrluszwcli.R.inc(70762);
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70763);JSONException error = null;
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70764);try {
            __CLR4_1_101ikr1ikrluszwcli.R.inc(70765);JSONScanner lexer = new JSONScanner("nulle");
            __CLR4_1_101ikr1ikrluszwcli.R.inc(70766);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101ikr1ikrluszwcli.R.inc(70767);error = e;
        }
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70768);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ikr1ikrluszwcli.R.flushNeeded();}}

    public void test_scan_null_6() throws Exception {__CLR4_1_101ikr1ikrluszwcli.R.globalSliceStart(getClass().getName(),70769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101cb26e1ilt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ikr1ikrluszwcli.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ikr1ikrluszwcli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70769,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101cb26e1ilt() throws Exception{try{__CLR4_1_101ikr1ikrluszwcli.R.inc(70769);
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70770);JSONException error = null;
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70771);try {
            __CLR4_1_101ikr1ikrluszwcli.R.inc(70772);JSONScanner lexer = new JSONScanner("null\"");
            __CLR4_1_101ikr1ikrluszwcli.R.inc(70773);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101ikr1ikrluszwcli.R.inc(70774);error = e;
        }
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70775);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ikr1ikrluszwcli.R.flushNeeded();}}

    public void test_scan_null_7() throws Exception {__CLR4_1_101ikr1ikrluszwcli.R.globalSliceStart(getClass().getName(),70776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101wowm31im0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ikr1ikrluszwcli.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ikr1ikrluszwcli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70776,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101wowm31im0() throws Exception{try{__CLR4_1_101ikr1ikrluszwcli.R.inc(70776);
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70777);JSONScanner lexer = new JSONScanner("null a");
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70778);lexer.scanNullOrNew();
    }finally{__CLR4_1_101ikr1ikrluszwcli.R.flushNeeded();}}

    public void test_scan_null_8() throws Exception {__CLR4_1_101ikr1ikrluszwcli.R.globalSliceStart(getClass().getName(),70779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1055ovek1im3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ikr1ikrluszwcli.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ikr1ikrluszwcli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70779,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1055ovek1im3() throws Exception{try{__CLR4_1_101ikr1ikrluszwcli.R.inc(70779);
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70780);JSONScanner lexer = new JSONScanner("null,");
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70781);lexer.scanNullOrNew();
    }finally{__CLR4_1_101ikr1ikrluszwcli.R.flushNeeded();}}

    public void test_scan_null_9() throws Exception {__CLR4_1_101ikr1ikrluszwcli.R.globalSliceStart(getClass().getName(),70782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108eou711im6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ikr1ikrluszwcli.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ikr1ikrluszwcli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70782,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108eou711im6() throws Exception{try{__CLR4_1_101ikr1ikrluszwcli.R.inc(70782);
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70783);JSONScanner lexer = new JSONScanner("null\na");
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70784);lexer.scanNullOrNew();
    }finally{__CLR4_1_101ikr1ikrluszwcli.R.flushNeeded();}}

    public void test_scan_null_10() throws Exception {__CLR4_1_101ikr1ikrluszwcli.R.globalSliceStart(getClass().getName(),70785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bu4z871im9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ikr1ikrluszwcli.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ikr1ikrluszwcli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70785,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bu4z871im9() throws Exception{try{__CLR4_1_101ikr1ikrluszwcli.R.inc(70785);
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70786);JSONScanner lexer = new JSONScanner("null\ra");
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70787);lexer.scanNullOrNew();
    }finally{__CLR4_1_101ikr1ikrluszwcli.R.flushNeeded();}}

    public void test_scan_null_11() throws Exception {__CLR4_1_101ikr1ikrluszwcli.R.globalSliceStart(getClass().getName(),70788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108l50fq1imc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ikr1ikrluszwcli.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ikr1ikrluszwcli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70788,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108l50fq1imc() throws Exception{try{__CLR4_1_101ikr1ikrluszwcli.R.inc(70788);
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70789);JSONScanner lexer = new JSONScanner("null\ta");
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70790);lexer.scanNullOrNew();
    }finally{__CLR4_1_101ikr1ikrluszwcli.R.flushNeeded();}}

    public void test_scan_null_12() throws Exception {__CLR4_1_101ikr1ikrluszwcli.R.globalSliceStart(getClass().getName(),70791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105c51n91imf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ikr1ikrluszwcli.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ikr1ikrluszwcli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70791,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105c51n91imf() throws Exception{try{__CLR4_1_101ikr1ikrluszwcli.R.inc(70791);
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70792);JSONScanner lexer = new JSONScanner("null\fa");
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70793);lexer.scanNullOrNew();
    }finally{__CLR4_1_101ikr1ikrluszwcli.R.flushNeeded();}}

    public void test_scan_null_13() throws Exception {__CLR4_1_101ikr1ikrluszwcli.R.globalSliceStart(getClass().getName(),70794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102352us1imi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ikr1ikrluszwcli.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ikr1ikrluszwcli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_null_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70794,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102352us1imi() throws Exception{try{__CLR4_1_101ikr1ikrluszwcli.R.inc(70794);
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70795);JSONScanner lexer = new JSONScanner("null\ba");
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70796);lexer.scanNullOrNew();
    }finally{__CLR4_1_101ikr1ikrluszwcli.R.flushNeeded();}}

    public void test_scan_false_14() throws Exception {__CLR4_1_101ikr1ikrluszwcli.R.globalSliceStart(getClass().getName(),70797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104717fp1iml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ikr1ikrluszwcli.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ikr1ikrluszwcli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_false_14",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70797,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104717fp1iml() throws Exception{try{__CLR4_1_101ikr1ikrluszwcli.R.inc(70797);
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70798);JSONScanner lexer = new JSONScanner("null}");
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70799);lexer.scanNullOrNew();
    }finally{__CLR4_1_101ikr1ikrluszwcli.R.flushNeeded();}}

    public void test_scan_false_15() throws Exception {__CLR4_1_101ikr1ikrluszwcli.R.globalSliceStart(getClass().getName(),70800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10y18n81imo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ikr1ikrluszwcli.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ikr1ikrluszwcli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_null.test_scan_false_15",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70800,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10y18n81imo() throws Exception{try{__CLR4_1_101ikr1ikrluszwcli.R.inc(70800);
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70801);JSONScanner lexer = new JSONScanner("null]");
        __CLR4_1_101ikr1ikrluszwcli.R.inc(70802);lexer.scanNullOrNew();
    }finally{__CLR4_1_101ikr1ikrluszwcli.R.flushNeeded();}}
}
