/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class JSONScannerTest_scanFieldDouble extends TestCase {static class __CLR4_1_101hs51hs5lusqkdq6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,69799,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceStart(getClass().getName(),69701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21hs5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hs51hs5lusqkdq6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69701,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21hs5() throws Exception{try{__CLR4_1_101hs51hs5lusqkdq6.R.inc(69701);
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69702);String text = "{\"value\":1.0}";
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69703);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69704);Assert.assertTrue(1D == obj.getValue());
    }finally{__CLR4_1_101hs51hs5lusqkdq6.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceStart(getClass().getName(),69705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1hs9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hs51hs5lusqkdq6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69705,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1hs9() throws Exception{try{__CLR4_1_101hs51hs5lusqkdq6.R.inc(69705);
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69706);String text = "{\"value\":\"1\"}";
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69707);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69708);Assert.assertTrue(1D == obj.getValue());
    }finally{__CLR4_1_101hs51hs5lusqkdq6.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceStart(getClass().getName(),69709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441hsd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hs51hs5lusqkdq6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69709,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441hsd() throws Exception{try{__CLR4_1_101hs51hs5lusqkdq6.R.inc(69709);
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69710);String text = "{\"f1\":2,\"value\":1.0}";
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69711);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69712);Assert.assertTrue(1D == obj.getValue());
    }finally{__CLR4_1_101hs51hs5lusqkdq6.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceStart(getClass().getName(),69713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1hsh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hs51hs5lusqkdq6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69713,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1hsh() throws Exception{try{__CLR4_1_101hs51hs5lusqkdq6.R.inc(69713);
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69714);String text = "{\"value\":1.01}";
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69715);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69716);Assert.assertTrue(1.01D == obj.getValue());
    }finally{__CLR4_1_101hs51hs5lusqkdq6.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceStart(getClass().getName(),69717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61hsl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hs51hs5lusqkdq6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69717,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61hsl() throws Exception{try{__CLR4_1_101hs51hs5lusqkdq6.R.inc(69717);
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69718);String text = "{\"value\":1.}";
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69719);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69720);Assert.assertTrue(1D == obj.getValue());
    }finally{__CLR4_1_101hs51hs5lusqkdq6.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceStart(getClass().getName(),69721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1hsp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hs51hs5lusqkdq6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69721,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1hsp() throws Exception{try{__CLR4_1_101hs51hs5lusqkdq6.R.inc(69721);
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69722);String text = "{\"value\":922337203685477580723}";
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69723);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69724);Assert.assertTrue(922337203685477580723D == obj.getValue());
    }finally{__CLR4_1_101hs51hs5lusqkdq6.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceStart(getClass().getName(),69725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1hst();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hs51hs5lusqkdq6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69725,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1hst() throws Exception{try{__CLR4_1_101hs51hs5lusqkdq6.R.inc(69725);
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69726);JSONException error = null;
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69727);try {
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69728);String text = "{\"value\":32K}";
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69729);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69730);error = ex;
        }
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69731);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hs51hs5lusqkdq6.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceStart(getClass().getName(),69732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1ht0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hs51hs5lusqkdq6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69732,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1ht0() throws Exception{try{__CLR4_1_101hs51hs5lusqkdq6.R.inc(69732);
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69733);JSONException error = null;
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69734);try {
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69735);String text = "{\"value\":32}{";
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69736);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69737);error = ex;
        }
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69738);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hs51hs5lusqkdq6.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceStart(getClass().getName(),69739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1ht7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hs51hs5lusqkdq6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69739,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1ht7() throws Exception{try{__CLR4_1_101hs51hs5lusqkdq6.R.inc(69739);
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69740);JSONException error = null;
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69741);try {
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69742);String text = "{\"value\":\u4e2d}";
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69743);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69744);error = ex;
        }
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69745);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hs51hs5lusqkdq6.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceStart(getClass().getName(),69746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v9cbw81hte();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hs51hs5lusqkdq6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69746,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v9cbw81hte() throws Exception{try{__CLR4_1_101hs51hs5lusqkdq6.R.inc(69746);
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69747);JSONException error = null;
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69748);try {
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69749);String text = "{\"value\":3.F";
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69750);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69751);error = ex;
        }
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69752);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hs51hs5lusqkdq6.R.flushNeeded();}}

    public void test_error_6() throws Exception {__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceStart(getClass().getName(),69753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yicaop1htl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hs51hs5lusqkdq6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69753,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yicaop1htl() throws Exception{try{__CLR4_1_101hs51hs5lusqkdq6.R.inc(69753);
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69754);JSONException error = null;
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69755);try {
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69756);String text = "{\"value\":3.2]";
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69757);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69758);error = ex;
        }
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69759);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hs51hs5lusqkdq6.R.flushNeeded();}}

    public void test_error_7() throws Exception {__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceStart(getClass().getName(),69760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10x9rshy1hts();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hs51hs5lusqkdq6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69760,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10x9rshy1hts() throws Exception{try{__CLR4_1_101hs51hs5lusqkdq6.R.inc(69760);
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69761);JSONException error = null;
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69762);try {
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69763);String text = "{\"value\":3.2}]";
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69764);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69765);error = ex;
        }
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69766);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hs51hs5lusqkdq6.R.flushNeeded();}}

    public void test_error_8() throws Exception {__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceStart(getClass().getName(),69767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10u0rtph1htz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hs51hs5lusqkdq6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69767,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10u0rtph1htz() throws Exception{try{__CLR4_1_101hs51hs5lusqkdq6.R.inc(69767);
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69768);JSONException error = null;
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69769);try {
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69770);String text = "{\"value\":3.2}}";
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69771);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69772);error = ex;
        }
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69773);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hs51hs5lusqkdq6.R.flushNeeded();}}

    public void test_error_9() throws Exception {__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceStart(getClass().getName(),69774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qrrux01hu6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hs51hs5lusqkdq6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69774,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qrrux01hu6() throws Exception{try{__CLR4_1_101hs51hs5lusqkdq6.R.inc(69774);
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69775);JSONException error = null;
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69776);try {
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69777);String text = "{\"value\":3.2},";
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69778);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69779);error = ex;
        }
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69780);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hs51hs5lusqkdq6.R.flushNeeded();}}

    public void test_error_10() throws Exception {__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceStart(getClass().getName(),69781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10y3a9wq1hud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hs51hs5lusqkdq6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69781,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10y3a9wq1hud() throws Exception{try{__CLR4_1_101hs51hs5lusqkdq6.R.inc(69781);
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69782);JSONException error = null;
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69783);try {
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69784);String text = "{\"value\":3.\\0}";
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69785);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69786);error = ex;
        }
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69787);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hs51hs5lusqkdq6.R.flushNeeded();}}

    public void test_error_11() throws Exception {__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceStart(getClass().getName(),69788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xott9x1huk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hs51hs5lusqkdq6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hs51hs5lusqkdq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69788,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xott9x1huk() throws Exception{try{__CLR4_1_101hs51hs5lusqkdq6.R.inc(69788);
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69789);JSONException error = null;
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69790);try {
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69791);String text = "{\"value\":3.\u4e2d}";
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69792);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69793);error = ex;
        }
        __CLR4_1_101hs51hs5lusqkdq6.R.inc(69794);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hs51hs5lusqkdq6.R.flushNeeded();}}

    public static class VO {

        private double value;

        public double getValue() {try{__CLR4_1_101hs51hs5lusqkdq6.R.inc(69795);
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69796);return value;
        }finally{__CLR4_1_101hs51hs5lusqkdq6.R.flushNeeded();}}

        public void setValue(double value) {try{__CLR4_1_101hs51hs5lusqkdq6.R.inc(69797);
            __CLR4_1_101hs51hs5lusqkdq6.R.inc(69798);this.value = value;
        }finally{__CLR4_1_101hs51hs5lusqkdq6.R.flushNeeded();}}

    }
}
