/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONScannerTest_new extends TestCase {static class __CLR4_1_101iir1iirluszwclf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,70731,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_scan_new_0() throws Exception {__CLR4_1_101iir1iirluszwclf.R.globalSliceStart(getClass().getName(),70659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rz54rh1iir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iir1iirluszwclf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iir1iirluszwclf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70659,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rz54rh1iir() throws Exception{try{__CLR4_1_101iir1iirluszwclf.R.inc(70659);
        __CLR4_1_101iir1iirluszwclf.R.inc(70660);JSONScanner lexer = new JSONScanner("new");
        __CLR4_1_101iir1iirluszwclf.R.inc(70661);lexer.scanNullOrNew();
    }finally{__CLR4_1_101iir1iirluszwclf.R.flushNeeded();}}

    public void test_scan_new_1() throws Exception {__CLR4_1_101iir1iirluszwclf.R.globalSliceStart(getClass().getName(),70662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10oq55z01iiu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iir1iirluszwclf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iir1iirluszwclf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70662,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10oq55z01iiu() throws Exception{try{__CLR4_1_101iir1iirluszwclf.R.inc(70662);
        __CLR4_1_101iir1iirluszwclf.R.inc(70663);JSONException error = null;
        __CLR4_1_101iir1iirluszwclf.R.inc(70664);try {
            __CLR4_1_101iir1iirluszwclf.R.inc(70665);JSONScanner lexer = new JSONScanner("nww");
            __CLR4_1_101iir1iirluszwclf.R.inc(70666);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101iir1iirluszwclf.R.inc(70667);error = e;
        }
        __CLR4_1_101iir1iirluszwclf.R.inc(70668);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iir1iirluszwclf.R.flushNeeded();}}

    public void test_scan_new_2() throws Exception {__CLR4_1_101iir1iirluszwclf.R.globalSliceStart(getClass().getName(),70669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lh576j1ij1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iir1iirluszwclf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iir1iirluszwclf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70669,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lh576j1ij1() throws Exception{try{__CLR4_1_101iir1iirluszwclf.R.inc(70669);
        __CLR4_1_101iir1iirluszwclf.R.inc(70670);JSONException error = null;
        __CLR4_1_101iir1iirluszwclf.R.inc(70671);try {
            __CLR4_1_101iir1iirluszwclf.R.inc(70672);JSONScanner lexer = new JSONScanner("nee");
            __CLR4_1_101iir1iirluszwclf.R.inc(70673);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101iir1iirluszwclf.R.inc(70674);error = e;
        }
        __CLR4_1_101iir1iirluszwclf.R.inc(70675);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iir1iirluszwclf.R.flushNeeded();}}

    public void test_scan_new_3() throws Exception {__CLR4_1_101iir1iirluszwclf.R.globalSliceStart(getClass().getName(),70676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i858e21ij8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iir1iirluszwclf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iir1iirluszwclf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70676,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i858e21ij8() throws Exception{try{__CLR4_1_101iir1iirluszwclf.R.inc(70676);
        __CLR4_1_101iir1iirluszwclf.R.inc(70677);JSONException error = null;
        __CLR4_1_101iir1iirluszwclf.R.inc(70678);try {
            __CLR4_1_101iir1iirluszwclf.R.inc(70679);JSONScanner lexer = new JSONScanner("neel");
            __CLR4_1_101iir1iirluszwclf.R.inc(70680);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101iir1iirluszwclf.R.inc(70681);error = e;
        }
        __CLR4_1_101iir1iirluszwclf.R.inc(70682);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iir1iirluszwclf.R.flushNeeded();}}

    public void test_scan_new_4() throws Exception {__CLR4_1_101iir1iirluszwclf.R.globalSliceStart(getClass().getName(),70683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ez59ll1ijf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iir1iirluszwclf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iir1iirluszwclf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70683,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ez59ll1ijf() throws Exception{try{__CLR4_1_101iir1iirluszwclf.R.inc(70683);
        __CLR4_1_101iir1iirluszwclf.R.inc(70684);JSONException error = null;
        __CLR4_1_101iir1iirluszwclf.R.inc(70685);try {
            __CLR4_1_101iir1iirluszwclf.R.inc(70686);JSONScanner lexer = new JSONScanner("neww");
            __CLR4_1_101iir1iirluszwclf.R.inc(70687);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101iir1iirluszwclf.R.inc(70688);error = e;
        }
        __CLR4_1_101iir1iirluszwclf.R.inc(70689);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iir1iirluszwclf.R.flushNeeded();}}

    public void test_scan_new_5() throws Exception {__CLR4_1_101iir1iirluszwclf.R.globalSliceStart(getClass().getName(),70690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bq5at41ijm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iir1iirluszwclf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iir1iirluszwclf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70690,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bq5at41ijm() throws Exception{try{__CLR4_1_101iir1iirluszwclf.R.inc(70690);
        __CLR4_1_101iir1iirluszwclf.R.inc(70691);JSONException error = null;
        __CLR4_1_101iir1iirluszwclf.R.inc(70692);try {
            __CLR4_1_101iir1iirluszwclf.R.inc(70693);JSONScanner lexer = new JSONScanner("newe");
            __CLR4_1_101iir1iirluszwclf.R.inc(70694);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101iir1iirluszwclf.R.inc(70695);error = e;
        }
        __CLR4_1_101iir1iirluszwclf.R.inc(70696);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iir1iirluszwclf.R.flushNeeded();}}

    public void test_scan_new_6() throws Exception {__CLR4_1_101iir1iirluszwclf.R.globalSliceStart(getClass().getName(),70697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108h5c0n1ijt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iir1iirluszwclf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iir1iirluszwclf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70697,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108h5c0n1ijt() throws Exception{try{__CLR4_1_101iir1iirluszwclf.R.inc(70697);
        __CLR4_1_101iir1iirluszwclf.R.inc(70698);JSONException error = null;
        __CLR4_1_101iir1iirluszwclf.R.inc(70699);try {
            __CLR4_1_101iir1iirluszwclf.R.inc(70700);JSONScanner lexer = new JSONScanner("new\"");
            __CLR4_1_101iir1iirluszwclf.R.inc(70701);lexer.scanNullOrNew();
        } catch (JSONException e) {
            __CLR4_1_101iir1iirluszwclf.R.inc(70702);error = e;
        }
        __CLR4_1_101iir1iirluszwclf.R.inc(70703);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iir1iirluszwclf.R.flushNeeded();}}

    public void test_scan_new_7() throws Exception {__CLR4_1_101iir1iirluszwclf.R.globalSliceStart(getClass().getName(),70704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10585d861ik0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iir1iirluszwclf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iir1iirluszwclf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70704,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10585d861ik0() throws Exception{try{__CLR4_1_101iir1iirluszwclf.R.inc(70704);
        __CLR4_1_101iir1iirluszwclf.R.inc(70705);JSONScanner lexer = new JSONScanner("new a");
        __CLR4_1_101iir1iirluszwclf.R.inc(70706);lexer.scanNullOrNew();
    }finally{__CLR4_1_101iir1iirluszwclf.R.flushNeeded();}}

    public void test_scan_new_8() throws Exception {__CLR4_1_101iir1iirluszwclf.R.globalSliceStart(getClass().getName(),70707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101z5efp1ik3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iir1iirluszwclf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iir1iirluszwclf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70707,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101z5efp1ik3() throws Exception{try{__CLR4_1_101iir1iirluszwclf.R.inc(70707);
        __CLR4_1_101iir1iirluszwclf.R.inc(70708);JSONScanner lexer = new JSONScanner("new,");
        __CLR4_1_101iir1iirluszwclf.R.inc(70709);lexer.scanNullOrNew();
    }finally{__CLR4_1_101iir1iirluszwclf.R.flushNeeded();}}

    public void test_scan_new_9() throws Exception {__CLR4_1_101iir1iirluszwclf.R.globalSliceStart(getClass().getName(),70710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1019ukcs1ik6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iir1iirluszwclf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iir1iirluszwclf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70710,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1019ukcs1ik6() throws Exception{try{__CLR4_1_101iir1iirluszwclf.R.inc(70710);
        __CLR4_1_101iir1iirluszwclf.R.inc(70711);JSONScanner lexer = new JSONScanner("new\na");
        __CLR4_1_101iir1iirluszwclf.R.inc(70712);lexer.scanNullOrNew();
    }finally{__CLR4_1_101iir1iirluszwclf.R.flushNeeded();}}

    public void test_scan_new_10() throws Exception {__CLR4_1_101iir1iirluszwclf.R.globalSliceStart(getClass().getName(),70713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jwvacm1ik9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iir1iirluszwclf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iir1iirluszwclf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70713,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jwvacm1ik9() throws Exception{try{__CLR4_1_101iir1iirluszwclf.R.inc(70713);
        __CLR4_1_101iir1iirluszwclf.R.inc(70714);JSONScanner lexer = new JSONScanner("new\ra");
        __CLR4_1_101iir1iirluszwclf.R.inc(70715);lexer.scanNullOrNew();
    }finally{__CLR4_1_101iir1iirluszwclf.R.flushNeeded();}}

    public void test_scan_new_11() throws Exception {__CLR4_1_101iir1iirluszwclf.R.globalSliceStart(getClass().getName(),70716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gnvbk51ikc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iir1iirluszwclf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iir1iirluszwclf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70716,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gnvbk51ikc() throws Exception{try{__CLR4_1_101iir1iirluszwclf.R.inc(70716);
        __CLR4_1_101iir1iirluszwclf.R.inc(70717);JSONScanner lexer = new JSONScanner("new\ta");
        __CLR4_1_101iir1iirluszwclf.R.inc(70718);lexer.scanNullOrNew();
    }finally{__CLR4_1_101iir1iirluszwclf.R.flushNeeded();}}

    public void test_scan_new_12() throws Exception {__CLR4_1_101iir1iirluszwclf.R.globalSliceStart(getClass().getName(),70719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10devcro1ikf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iir1iirluszwclf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iir1iirluszwclf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70719,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10devcro1ikf() throws Exception{try{__CLR4_1_101iir1iirluszwclf.R.inc(70719);
        __CLR4_1_101iir1iirluszwclf.R.inc(70720);JSONScanner lexer = new JSONScanner("new\fa");
        __CLR4_1_101iir1iirluszwclf.R.inc(70721);lexer.scanNullOrNew();
    }finally{__CLR4_1_101iir1iirluszwclf.R.flushNeeded();}}

    public void test_scan_new_13() throws Exception {__CLR4_1_101iir1iirluszwclf.R.globalSliceStart(getClass().getName(),70722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a5vdz71iki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iir1iirluszwclf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iir1iirluszwclf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70722,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a5vdz71iki() throws Exception{try{__CLR4_1_101iir1iirluszwclf.R.inc(70722);
        __CLR4_1_101iir1iirluszwclf.R.inc(70723);JSONScanner lexer = new JSONScanner("new\ba");
        __CLR4_1_101iir1iirluszwclf.R.inc(70724);lexer.scanNullOrNew();
    }finally{__CLR4_1_101iir1iirluszwclf.R.flushNeeded();}}

    public void test_scan_new_14() throws Exception {__CLR4_1_101iir1iirluszwclf.R.globalSliceStart(getClass().getName(),70725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106wvf6q1ikl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iir1iirluszwclf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iir1iirluszwclf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_14",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70725,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106wvf6q1ikl() throws Exception{try{__CLR4_1_101iir1iirluszwclf.R.inc(70725);
        __CLR4_1_101iir1iirluszwclf.R.inc(70726);JSONScanner lexer = new JSONScanner("new}");
        __CLR4_1_101iir1iirluszwclf.R.inc(70727);lexer.scanNullOrNew();
    }finally{__CLR4_1_101iir1iirluszwclf.R.flushNeeded();}}

    public void test_scan_new_15() throws Exception {__CLR4_1_101iir1iirluszwclf.R.globalSliceStart(getClass().getName(),70728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103nvge91iko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iir1iirluszwclf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iir1iirluszwclf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_new.test_scan_new_15",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70728,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103nvge91iko() throws Exception{try{__CLR4_1_101iir1iirluszwclf.R.inc(70728);
        __CLR4_1_101iir1iirluszwclf.R.inc(70729);JSONScanner lexer = new JSONScanner("new]");
        __CLR4_1_101iir1iirluszwclf.R.inc(70730);lexer.scanNullOrNew();
    }finally{__CLR4_1_101iir1iirluszwclf.R.flushNeeded();}}
}
