/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONScannerTest_new extends TestCase {static class __CLR4_5_21iig1iiglusvnd3m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,70720,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_scan_new_0() throws Exception {__CLR4_5_21iig1iiglusvnd3m.R.globalSliceStart(getClass().getName(),70648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rz54rh1iig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iig1iiglusvnd3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iig1iiglusvnd3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70648,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rz54rh1iig() throws Exception{try{__CLR4_5_21iig1iiglusvnd3m.R.inc(70648);
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70649);JSONScanner lexer = new JSONScanner("new");
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70650);lexer.scanNullOrNew();
    }finally{__CLR4_5_21iig1iiglusvnd3m.R.flushNeeded();}}

    public void test_scan_new_1() throws Exception {__CLR4_5_21iig1iiglusvnd3m.R.globalSliceStart(getClass().getName(),70651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oq55z01iij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iig1iiglusvnd3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iig1iiglusvnd3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70651,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oq55z01iij() throws Exception{try{__CLR4_5_21iig1iiglusvnd3m.R.inc(70651);
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70652);JSONException error = null;
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70653);try {
            __CLR4_5_21iig1iiglusvnd3m.R.inc(70654);JSONScanner lexer = new JSONScanner("nww");
            __CLR4_5_21iig1iiglusvnd3m.R.inc(70655);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21iig1iiglusvnd3m.R.inc(70656);error = e;
        }
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70657);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iig1iiglusvnd3m.R.flushNeeded();}}

    public void test_scan_new_2() throws Exception {__CLR4_5_21iig1iiglusvnd3m.R.globalSliceStart(getClass().getName(),70658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lh576j1iiq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iig1iiglusvnd3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iig1iiglusvnd3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70658,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lh576j1iiq() throws Exception{try{__CLR4_5_21iig1iiglusvnd3m.R.inc(70658);
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70659);JSONException error = null;
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70660);try {
            __CLR4_5_21iig1iiglusvnd3m.R.inc(70661);JSONScanner lexer = new JSONScanner("nee");
            __CLR4_5_21iig1iiglusvnd3m.R.inc(70662);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21iig1iiglusvnd3m.R.inc(70663);error = e;
        }
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70664);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iig1iiglusvnd3m.R.flushNeeded();}}

    public void test_scan_new_3() throws Exception {__CLR4_5_21iig1iiglusvnd3m.R.globalSliceStart(getClass().getName(),70665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i858e21iix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iig1iiglusvnd3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iig1iiglusvnd3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70665,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i858e21iix() throws Exception{try{__CLR4_5_21iig1iiglusvnd3m.R.inc(70665);
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70666);JSONException error = null;
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70667);try {
            __CLR4_5_21iig1iiglusvnd3m.R.inc(70668);JSONScanner lexer = new JSONScanner("neel");
            __CLR4_5_21iig1iiglusvnd3m.R.inc(70669);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21iig1iiglusvnd3m.R.inc(70670);error = e;
        }
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70671);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iig1iiglusvnd3m.R.flushNeeded();}}

    public void test_scan_new_4() throws Exception {__CLR4_5_21iig1iiglusvnd3m.R.globalSliceStart(getClass().getName(),70672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ez59ll1ij4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iig1iiglusvnd3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iig1iiglusvnd3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70672,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ez59ll1ij4() throws Exception{try{__CLR4_5_21iig1iiglusvnd3m.R.inc(70672);
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70673);JSONException error = null;
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70674);try {
            __CLR4_5_21iig1iiglusvnd3m.R.inc(70675);JSONScanner lexer = new JSONScanner("neww");
            __CLR4_5_21iig1iiglusvnd3m.R.inc(70676);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21iig1iiglusvnd3m.R.inc(70677);error = e;
        }
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70678);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iig1iiglusvnd3m.R.flushNeeded();}}

    public void test_scan_new_5() throws Exception {__CLR4_5_21iig1iiglusvnd3m.R.globalSliceStart(getClass().getName(),70679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bq5at41ijb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iig1iiglusvnd3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iig1iiglusvnd3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70679,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bq5at41ijb() throws Exception{try{__CLR4_5_21iig1iiglusvnd3m.R.inc(70679);
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70680);JSONException error = null;
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70681);try {
            __CLR4_5_21iig1iiglusvnd3m.R.inc(70682);JSONScanner lexer = new JSONScanner("newe");
            __CLR4_5_21iig1iiglusvnd3m.R.inc(70683);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21iig1iiglusvnd3m.R.inc(70684);error = e;
        }
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70685);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iig1iiglusvnd3m.R.flushNeeded();}}

    public void test_scan_new_6() throws Exception {__CLR4_5_21iig1iiglusvnd3m.R.globalSliceStart(getClass().getName(),70686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28h5c0n1iji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iig1iiglusvnd3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iig1iiglusvnd3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70686,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28h5c0n1iji() throws Exception{try{__CLR4_5_21iig1iiglusvnd3m.R.inc(70686);
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70687);JSONException error = null;
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70688);try {
            __CLR4_5_21iig1iiglusvnd3m.R.inc(70689);JSONScanner lexer = new JSONScanner("new\"");
            __CLR4_5_21iig1iiglusvnd3m.R.inc(70690);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_5_21iig1iiglusvnd3m.R.inc(70691);error = e;
        }
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70692);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iig1iiglusvnd3m.R.flushNeeded();}}

    public void test_scan_new_7() throws Exception {__CLR4_5_21iig1iiglusvnd3m.R.globalSliceStart(getClass().getName(),70693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2585d861ijp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iig1iiglusvnd3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iig1iiglusvnd3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70693,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2585d861ijp() throws Exception{try{__CLR4_5_21iig1iiglusvnd3m.R.inc(70693);
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70694);JSONScanner lexer = new JSONScanner("new a");
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70695);lexer.scanNullOrNew();
    }finally{__CLR4_5_21iig1iiglusvnd3m.R.flushNeeded();}}

    public void test_scan_new_8() throws Exception {__CLR4_5_21iig1iiglusvnd3m.R.globalSliceStart(getClass().getName(),70696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21z5efp1ijs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iig1iiglusvnd3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iig1iiglusvnd3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70696,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21z5efp1ijs() throws Exception{try{__CLR4_5_21iig1iiglusvnd3m.R.inc(70696);
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70697);JSONScanner lexer = new JSONScanner("new,");
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70698);lexer.scanNullOrNew();
    }finally{__CLR4_5_21iig1iiglusvnd3m.R.flushNeeded();}}

    public void test_scan_new_9() throws Exception {__CLR4_5_21iig1iiglusvnd3m.R.globalSliceStart(getClass().getName(),70699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_219ukcs1ijv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iig1iiglusvnd3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iig1iiglusvnd3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70699,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_219ukcs1ijv() throws Exception{try{__CLR4_5_21iig1iiglusvnd3m.R.inc(70699);
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70700);JSONScanner lexer = new JSONScanner("new\na");
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70701);lexer.scanNullOrNew();
    }finally{__CLR4_5_21iig1iiglusvnd3m.R.flushNeeded();}}

    public void test_scan_new_10() throws Exception {__CLR4_5_21iig1iiglusvnd3m.R.globalSliceStart(getClass().getName(),70702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jwvacm1ijy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iig1iiglusvnd3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iig1iiglusvnd3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70702,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jwvacm1ijy() throws Exception{try{__CLR4_5_21iig1iiglusvnd3m.R.inc(70702);
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70703);JSONScanner lexer = new JSONScanner("new\ra");
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70704);lexer.scanNullOrNew();
    }finally{__CLR4_5_21iig1iiglusvnd3m.R.flushNeeded();}}

    public void test_scan_new_11() throws Exception {__CLR4_5_21iig1iiglusvnd3m.R.globalSliceStart(getClass().getName(),70705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gnvbk51ik1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iig1iiglusvnd3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iig1iiglusvnd3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70705,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gnvbk51ik1() throws Exception{try{__CLR4_5_21iig1iiglusvnd3m.R.inc(70705);
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70706);JSONScanner lexer = new JSONScanner("new\ta");
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70707);lexer.scanNullOrNew();
    }finally{__CLR4_5_21iig1iiglusvnd3m.R.flushNeeded();}}

    public void test_scan_new_12() throws Exception {__CLR4_5_21iig1iiglusvnd3m.R.globalSliceStart(getClass().getName(),70708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2devcro1ik4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iig1iiglusvnd3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iig1iiglusvnd3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70708,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2devcro1ik4() throws Exception{try{__CLR4_5_21iig1iiglusvnd3m.R.inc(70708);
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70709);JSONScanner lexer = new JSONScanner("new\fa");
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70710);lexer.scanNullOrNew();
    }finally{__CLR4_5_21iig1iiglusvnd3m.R.flushNeeded();}}

    public void test_scan_new_13() throws Exception {__CLR4_5_21iig1iiglusvnd3m.R.globalSliceStart(getClass().getName(),70711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a5vdz71ik7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iig1iiglusvnd3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iig1iiglusvnd3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70711,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a5vdz71ik7() throws Exception{try{__CLR4_5_21iig1iiglusvnd3m.R.inc(70711);
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70712);JSONScanner lexer = new JSONScanner("new\ba");
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70713);lexer.scanNullOrNew();
    }finally{__CLR4_5_21iig1iiglusvnd3m.R.flushNeeded();}}

    public void test_scan_new_14() throws Exception {__CLR4_5_21iig1iiglusvnd3m.R.globalSliceStart(getClass().getName(),70714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26wvf6q1ika();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iig1iiglusvnd3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iig1iiglusvnd3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70714,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26wvf6q1ika() throws Exception{try{__CLR4_5_21iig1iiglusvnd3m.R.inc(70714);
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70715);JSONScanner lexer = new JSONScanner("new}");
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70716);lexer.scanNullOrNew();
    }finally{__CLR4_5_21iig1iiglusvnd3m.R.flushNeeded();}}

    public void test_scan_new_15() throws Exception {__CLR4_5_21iig1iiglusvnd3m.R.globalSliceStart(getClass().getName(),70717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23nvge91ikd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iig1iiglusvnd3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iig1iiglusvnd3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70717,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23nvge91ikd() throws Exception{try{__CLR4_5_21iig1iiglusvnd3m.R.inc(70717);
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70718);JSONScanner lexer = new JSONScanner("new]");
        __CLR4_5_21iig1iiglusvnd3m.R.inc(70719);lexer.scanNullOrNew();
    }finally{__CLR4_5_21iig1iiglusvnd3m.R.flushNeeded();}}
}
