/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class JSONScannerTest_scanFieldDouble extends TestCase {static class __CLR4_5_21hru1hrulusyjtqd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,69788,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21hru1hrulusyjtqd.R.globalSliceStart(getClass().getName(),69690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21hru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hru1hrulusyjtqd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hru1hrulusyjtqd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69690,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21hru() throws Exception{try{__CLR4_5_21hru1hrulusyjtqd.R.inc(69690);
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69691);String text = "{\"value\":1.0}";
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69692);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69693);Assert.assertTrue(1D == obj.getValue());
    }finally{__CLR4_5_21hru1hrulusyjtqd.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21hru1hrulusyjtqd.R.globalSliceStart(getClass().getName(),69694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1hry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hru1hrulusyjtqd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hru1hrulusyjtqd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69694,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1hry() throws Exception{try{__CLR4_5_21hru1hrulusyjtqd.R.inc(69694);
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69695);String text = "{\"value\":\"1\"}";
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69696);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69697);Assert.assertTrue(1D == obj.getValue());
    }finally{__CLR4_5_21hru1hrulusyjtqd.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21hru1hrulusyjtqd.R.globalSliceStart(getClass().getName(),69698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441hs2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hru1hrulusyjtqd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hru1hrulusyjtqd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69698,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441hs2() throws Exception{try{__CLR4_5_21hru1hrulusyjtqd.R.inc(69698);
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69699);String text = "{\"f1\":2,\"value\":1.0}";
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69700);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69701);Assert.assertTrue(1D == obj.getValue());
    }finally{__CLR4_5_21hru1hrulusyjtqd.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21hru1hrulusyjtqd.R.globalSliceStart(getClass().getName(),69702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1hs6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hru1hrulusyjtqd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hru1hrulusyjtqd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69702,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1hs6() throws Exception{try{__CLR4_5_21hru1hrulusyjtqd.R.inc(69702);
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69703);String text = "{\"value\":1.01}";
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69704);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69705);Assert.assertTrue(1.01D == obj.getValue());
    }finally{__CLR4_5_21hru1hrulusyjtqd.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21hru1hrulusyjtqd.R.globalSliceStart(getClass().getName(),69706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61hsa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hru1hrulusyjtqd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hru1hrulusyjtqd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69706,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61hsa() throws Exception{try{__CLR4_5_21hru1hrulusyjtqd.R.inc(69706);
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69707);String text = "{\"value\":1.}";
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69708);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69709);Assert.assertTrue(1D == obj.getValue());
    }finally{__CLR4_5_21hru1hrulusyjtqd.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21hru1hrulusyjtqd.R.globalSliceStart(getClass().getName(),69710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1hse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hru1hrulusyjtqd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hru1hrulusyjtqd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69710,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1hse() throws Exception{try{__CLR4_5_21hru1hrulusyjtqd.R.inc(69710);
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69711);String text = "{\"value\":922337203685477580723}";
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69712);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69713);Assert.assertTrue(922337203685477580723D == obj.getValue());
    }finally{__CLR4_5_21hru1hrulusyjtqd.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21hru1hrulusyjtqd.R.globalSliceStart(getClass().getName(),69714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1hsi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hru1hrulusyjtqd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hru1hrulusyjtqd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69714,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1hsi() throws Exception{try{__CLR4_5_21hru1hrulusyjtqd.R.inc(69714);
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69715);JSONException error = null;
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69716);try {
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69717);String text = "{\"value\":32K}";
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69718);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69719);error = ex;
        }
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69720);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hru1hrulusyjtqd.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_5_21hru1hrulusyjtqd.R.globalSliceStart(getClass().getName(),69721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1hsp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hru1hrulusyjtqd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hru1hrulusyjtqd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69721,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1hsp() throws Exception{try{__CLR4_5_21hru1hrulusyjtqd.R.inc(69721);
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69722);JSONException error = null;
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69723);try {
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69724);String text = "{\"value\":32}{";
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69725);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69726);error = ex;
        }
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69727);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hru1hrulusyjtqd.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_5_21hru1hrulusyjtqd.R.globalSliceStart(getClass().getName(),69728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1hsw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hru1hrulusyjtqd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hru1hrulusyjtqd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69728,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1hsw() throws Exception{try{__CLR4_5_21hru1hrulusyjtqd.R.inc(69728);
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69729);JSONException error = null;
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69730);try {
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69731);String text = "{\"value\":\u4e2d}";
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69732);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69733);error = ex;
        }
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69734);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hru1hrulusyjtqd.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_5_21hru1hrulusyjtqd.R.globalSliceStart(getClass().getName(),69735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw81ht3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hru1hrulusyjtqd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hru1hrulusyjtqd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69735,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw81ht3() throws Exception{try{__CLR4_5_21hru1hrulusyjtqd.R.inc(69735);
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69736);JSONException error = null;
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69737);try {
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69738);String text = "{\"value\":3.F";
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69739);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69740);error = ex;
        }
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69741);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hru1hrulusyjtqd.R.flushNeeded();}}

    public void test_error_6() throws Exception {__CLR4_5_21hru1hrulusyjtqd.R.globalSliceStart(getClass().getName(),69742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yicaop1hta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hru1hrulusyjtqd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hru1hrulusyjtqd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69742,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yicaop1hta() throws Exception{try{__CLR4_5_21hru1hrulusyjtqd.R.inc(69742);
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69743);JSONException error = null;
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69744);try {
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69745);String text = "{\"value\":3.2]";
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69746);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69747);error = ex;
        }
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69748);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hru1hrulusyjtqd.R.flushNeeded();}}

    public void test_error_7() throws Exception {__CLR4_5_21hru1hrulusyjtqd.R.globalSliceStart(getClass().getName(),69749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x9rshy1hth();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hru1hrulusyjtqd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hru1hrulusyjtqd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69749,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x9rshy1hth() throws Exception{try{__CLR4_5_21hru1hrulusyjtqd.R.inc(69749);
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69750);JSONException error = null;
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69751);try {
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69752);String text = "{\"value\":3.2}]";
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69753);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69754);error = ex;
        }
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69755);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hru1hrulusyjtqd.R.flushNeeded();}}

    public void test_error_8() throws Exception {__CLR4_5_21hru1hrulusyjtqd.R.globalSliceStart(getClass().getName(),69756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u0rtph1hto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hru1hrulusyjtqd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hru1hrulusyjtqd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69756,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u0rtph1hto() throws Exception{try{__CLR4_5_21hru1hrulusyjtqd.R.inc(69756);
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69757);JSONException error = null;
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69758);try {
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69759);String text = "{\"value\":3.2}}";
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69760);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69761);error = ex;
        }
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69762);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hru1hrulusyjtqd.R.flushNeeded();}}

    public void test_error_9() throws Exception {__CLR4_5_21hru1hrulusyjtqd.R.globalSliceStart(getClass().getName(),69763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qrrux01htv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hru1hrulusyjtqd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hru1hrulusyjtqd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69763,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qrrux01htv() throws Exception{try{__CLR4_5_21hru1hrulusyjtqd.R.inc(69763);
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69764);JSONException error = null;
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69765);try {
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69766);String text = "{\"value\":3.2},";
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69767);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69768);error = ex;
        }
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69769);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hru1hrulusyjtqd.R.flushNeeded();}}

    public void test_error_10() throws Exception {__CLR4_5_21hru1hrulusyjtqd.R.globalSliceStart(getClass().getName(),69770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y3a9wq1hu2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hru1hrulusyjtqd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hru1hrulusyjtqd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69770,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y3a9wq1hu2() throws Exception{try{__CLR4_5_21hru1hrulusyjtqd.R.inc(69770);
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69771);JSONException error = null;
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69772);try {
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69773);String text = "{\"value\":3.\\0}";
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69774);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69775);error = ex;
        }
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69776);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hru1hrulusyjtqd.R.flushNeeded();}}

    public void test_error_11() throws Exception {__CLR4_5_21hru1hrulusyjtqd.R.globalSliceStart(getClass().getName(),69777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xott9x1hu9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hru1hrulusyjtqd.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hru1hrulusyjtqd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69777,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xott9x1hu9() throws Exception{try{__CLR4_5_21hru1hrulusyjtqd.R.inc(69777);
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69778);JSONException error = null;
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69779);try {
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69780);String text = "{\"value\":3.\u4e2d}";
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69781);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69782);error = ex;
        }
        __CLR4_5_21hru1hrulusyjtqd.R.inc(69783);Assert.assertNotNull(error);
    }finally{__CLR4_5_21hru1hrulusyjtqd.R.flushNeeded();}}

    public static class VO {

        private double value;

        public double getValue() {try{__CLR4_5_21hru1hrulusyjtqd.R.inc(69784);
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69785);return value;
        }finally{__CLR4_5_21hru1hrulusyjtqd.R.flushNeeded();}}

        public void setValue(double value) {try{__CLR4_5_21hru1hrulusyjtqd.R.inc(69786);
            __CLR4_5_21hru1hrulusyjtqd.R.inc(69787);this.value = value;
        }finally{__CLR4_5_21hru1hrulusyjtqd.R.flushNeeded();}}

    }
}
