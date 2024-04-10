/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONScannerTest_scanFieldFloat extends TestCase {static class __CLR4_5_21huk1huklusyjtqh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,69889,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21huk1huklusyjtqh.R.globalSliceStart(getClass().getName(),69788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21huk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21huk1huklusyjtqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21huk1huklusyjtqh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69788,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21huk() throws Exception{try{__CLR4_5_21huk1huklusyjtqh.R.inc(69788);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69789);String text = "{\"value\":1.0}";
        __CLR4_5_21huk1huklusyjtqh.R.inc(69790);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69791);Assert.assertTrue(1F == obj.getValue());
    }finally{__CLR4_5_21huk1huklusyjtqh.R.flushNeeded();}}

    @SuppressWarnings("resource")
    public void test_isBlank() throws Exception {__CLR4_5_21huk1huklusyjtqh.R.globalSliceStart(getClass().getName(),69792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22ceda41huo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21huk1huklusyjtqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21huk1huklusyjtqh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_isBlank",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69792,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22ceda41huo() throws Exception{try{__CLR4_5_21huk1huklusyjtqh.R.inc(69792);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69793);String text = "   {\"value\":1.0}";
        __CLR4_5_21huk1huklusyjtqh.R.inc(69794);Assert.assertTrue(!new JSONScanner(text).isBlankInput());
    }finally{__CLR4_5_21huk1huklusyjtqh.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21huk1huklusyjtqh.R.globalSliceStart(getClass().getName(),69795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1hur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21huk1huklusyjtqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21huk1huklusyjtqh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69795,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1hur() throws Exception{try{__CLR4_5_21huk1huklusyjtqh.R.inc(69795);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69796);String text = "{\"value\":\"1\"}";
        __CLR4_5_21huk1huklusyjtqh.R.inc(69797);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69798);Assert.assertTrue(1F == obj.getValue());
    }finally{__CLR4_5_21huk1huklusyjtqh.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21huk1huklusyjtqh.R.globalSliceStart(getClass().getName(),69799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441huv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21huk1huklusyjtqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21huk1huklusyjtqh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69799,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441huv() throws Exception{try{__CLR4_5_21huk1huklusyjtqh.R.inc(69799);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69800);String text = "{\"f1\":2,\"value\":1.0}";
        __CLR4_5_21huk1huklusyjtqh.R.inc(69801);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69802);Assert.assertTrue(1F == obj.getValue());
    }finally{__CLR4_5_21huk1huklusyjtqh.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21huk1huklusyjtqh.R.globalSliceStart(getClass().getName(),69803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1huz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21huk1huklusyjtqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21huk1huklusyjtqh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69803,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1huz() throws Exception{try{__CLR4_5_21huk1huklusyjtqh.R.inc(69803);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69804);String text = "{\"value\":1.01}";
        __CLR4_5_21huk1huklusyjtqh.R.inc(69805);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69806);Assert.assertTrue(1.01F == obj.getValue());
    }finally{__CLR4_5_21huk1huklusyjtqh.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21huk1huklusyjtqh.R.globalSliceStart(getClass().getName(),69807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61hv3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21huk1huklusyjtqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21huk1huklusyjtqh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69807,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61hv3() throws Exception{try{__CLR4_5_21huk1huklusyjtqh.R.inc(69807);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69808);String text = "{\"value\":1.}";
        __CLR4_5_21huk1huklusyjtqh.R.inc(69809);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69810);Assert.assertTrue(1F == obj.getValue());
    }finally{__CLR4_5_21huk1huklusyjtqh.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_5_21huk1huklusyjtqh.R.globalSliceStart(getClass().getName(),69811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1hv7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21huk1huklusyjtqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21huk1huklusyjtqh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69811,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1hv7() throws Exception{try{__CLR4_5_21huk1huklusyjtqh.R.inc(69811);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69812);String text = "{\"value\":922337203685477580723}";
        __CLR4_5_21huk1huklusyjtqh.R.inc(69813);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69814);Assert.assertTrue(922337203685477580723F == obj.getValue());
    }finally{__CLR4_5_21huk1huklusyjtqh.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21huk1huklusyjtqh.R.globalSliceStart(getClass().getName(),69815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1hvb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21huk1huklusyjtqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21huk1huklusyjtqh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69815,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1hvb() throws Exception{try{__CLR4_5_21huk1huklusyjtqh.R.inc(69815);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69816);JSONException error = null;
        __CLR4_5_21huk1huklusyjtqh.R.inc(69817);try {
            __CLR4_5_21huk1huklusyjtqh.R.inc(69818);String text = "{\"value\":32M}";
            __CLR4_5_21huk1huklusyjtqh.R.inc(69819);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21huk1huklusyjtqh.R.inc(69820);error = ex;
        }
        __CLR4_5_21huk1huklusyjtqh.R.inc(69821);Assert.assertNotNull(error);
    }finally{__CLR4_5_21huk1huklusyjtqh.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_5_21huk1huklusyjtqh.R.globalSliceStart(getClass().getName(),69822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1hvi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21huk1huklusyjtqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21huk1huklusyjtqh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69822,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1hvi() throws Exception{try{__CLR4_5_21huk1huklusyjtqh.R.inc(69822);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69823);JSONException error = null;
        __CLR4_5_21huk1huklusyjtqh.R.inc(69824);try {
            __CLR4_5_21huk1huklusyjtqh.R.inc(69825);String text = "{\"value\":32}{";
            __CLR4_5_21huk1huklusyjtqh.R.inc(69826);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21huk1huklusyjtqh.R.inc(69827);error = ex;
        }
        __CLR4_5_21huk1huklusyjtqh.R.inc(69828);Assert.assertNotNull(error);
    }finally{__CLR4_5_21huk1huklusyjtqh.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_5_21huk1huklusyjtqh.R.globalSliceStart(getClass().getName(),69829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1hvp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21huk1huklusyjtqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21huk1huklusyjtqh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69829,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1hvp() throws Exception{try{__CLR4_5_21huk1huklusyjtqh.R.inc(69829);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69830);JSONException error = null;
        __CLR4_5_21huk1huklusyjtqh.R.inc(69831);try {
            __CLR4_5_21huk1huklusyjtqh.R.inc(69832);String text = "{\"value\":\u4e2d}";
            __CLR4_5_21huk1huklusyjtqh.R.inc(69833);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21huk1huklusyjtqh.R.inc(69834);error = ex;
        }
        __CLR4_5_21huk1huklusyjtqh.R.inc(69835);Assert.assertNotNull(error);
    }finally{__CLR4_5_21huk1huklusyjtqh.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_5_21huk1huklusyjtqh.R.globalSliceStart(getClass().getName(),69836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw81hvw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21huk1huklusyjtqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21huk1huklusyjtqh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69836,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw81hvw() throws Exception{try{__CLR4_5_21huk1huklusyjtqh.R.inc(69836);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69837);JSONException error = null;
        __CLR4_5_21huk1huklusyjtqh.R.inc(69838);try {
            __CLR4_5_21huk1huklusyjtqh.R.inc(69839);String text = "{\"value\":3.F";
            __CLR4_5_21huk1huklusyjtqh.R.inc(69840);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21huk1huklusyjtqh.R.inc(69841);error = ex;
        }
        __CLR4_5_21huk1huklusyjtqh.R.inc(69842);Assert.assertNotNull(error);
    }finally{__CLR4_5_21huk1huklusyjtqh.R.flushNeeded();}}

    public void test_error_6() throws Exception {__CLR4_5_21huk1huklusyjtqh.R.globalSliceStart(getClass().getName(),69843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yicaop1hw3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21huk1huklusyjtqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21huk1huklusyjtqh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69843,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yicaop1hw3() throws Exception{try{__CLR4_5_21huk1huklusyjtqh.R.inc(69843);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69844);JSONException error = null;
        __CLR4_5_21huk1huklusyjtqh.R.inc(69845);try {
            __CLR4_5_21huk1huklusyjtqh.R.inc(69846);String text = "{\"value\":3.2]";
            __CLR4_5_21huk1huklusyjtqh.R.inc(69847);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21huk1huklusyjtqh.R.inc(69848);error = ex;
        }
        __CLR4_5_21huk1huklusyjtqh.R.inc(69849);Assert.assertNotNull(error);
    }finally{__CLR4_5_21huk1huklusyjtqh.R.flushNeeded();}}

    public void test_error_7() throws Exception {__CLR4_5_21huk1huklusyjtqh.R.globalSliceStart(getClass().getName(),69850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x9rshy1hwa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21huk1huklusyjtqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21huk1huklusyjtqh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69850,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x9rshy1hwa() throws Exception{try{__CLR4_5_21huk1huklusyjtqh.R.inc(69850);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69851);JSONException error = null;
        __CLR4_5_21huk1huklusyjtqh.R.inc(69852);try {
            __CLR4_5_21huk1huklusyjtqh.R.inc(69853);String text = "{\"value\":3.2}]";
            __CLR4_5_21huk1huklusyjtqh.R.inc(69854);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21huk1huklusyjtqh.R.inc(69855);error = ex;
        }
        __CLR4_5_21huk1huklusyjtqh.R.inc(69856);Assert.assertNotNull(error);
    }finally{__CLR4_5_21huk1huklusyjtqh.R.flushNeeded();}}

    public void test_error_8() throws Exception {__CLR4_5_21huk1huklusyjtqh.R.globalSliceStart(getClass().getName(),69857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u0rtph1hwh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21huk1huklusyjtqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21huk1huklusyjtqh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69857,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u0rtph1hwh() throws Exception{try{__CLR4_5_21huk1huklusyjtqh.R.inc(69857);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69858);JSONException error = null;
        __CLR4_5_21huk1huklusyjtqh.R.inc(69859);try {
            __CLR4_5_21huk1huklusyjtqh.R.inc(69860);String text = "{\"value\":3.2}}";
            __CLR4_5_21huk1huklusyjtqh.R.inc(69861);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21huk1huklusyjtqh.R.inc(69862);error = ex;
        }
        __CLR4_5_21huk1huklusyjtqh.R.inc(69863);Assert.assertNotNull(error);
    }finally{__CLR4_5_21huk1huklusyjtqh.R.flushNeeded();}}

    public void test_error_9() throws Exception {__CLR4_5_21huk1huklusyjtqh.R.globalSliceStart(getClass().getName(),69864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qrrux01hwo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21huk1huklusyjtqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21huk1huklusyjtqh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69864,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qrrux01hwo() throws Exception{try{__CLR4_5_21huk1huklusyjtqh.R.inc(69864);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69865);JSONException error = null;
        __CLR4_5_21huk1huklusyjtqh.R.inc(69866);try {
            __CLR4_5_21huk1huklusyjtqh.R.inc(69867);String text = "{\"value\":3.2},";
            __CLR4_5_21huk1huklusyjtqh.R.inc(69868);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21huk1huklusyjtqh.R.inc(69869);error = ex;
        }
        __CLR4_5_21huk1huklusyjtqh.R.inc(69870);Assert.assertNotNull(error);
    }finally{__CLR4_5_21huk1huklusyjtqh.R.flushNeeded();}}
    
    public void test_error_10() throws Exception {__CLR4_5_21huk1huklusyjtqh.R.globalSliceStart(getClass().getName(),69871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y3a9wq1hwv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21huk1huklusyjtqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21huk1huklusyjtqh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69871,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y3a9wq1hwv() throws Exception{try{__CLR4_5_21huk1huklusyjtqh.R.inc(69871);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69872);JSONException error = null;
        __CLR4_5_21huk1huklusyjtqh.R.inc(69873);try {
            __CLR4_5_21huk1huklusyjtqh.R.inc(69874);String text = "{\"value\":3.\\0}";
            __CLR4_5_21huk1huklusyjtqh.R.inc(69875);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21huk1huklusyjtqh.R.inc(69876);error = ex;
        }
        __CLR4_5_21huk1huklusyjtqh.R.inc(69877);Assert.assertNotNull(error);
    }finally{__CLR4_5_21huk1huklusyjtqh.R.flushNeeded();}}
    
    public void test_error_11() throws Exception {__CLR4_5_21huk1huklusyjtqh.R.globalSliceStart(getClass().getName(),69878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xott9x1hx2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21huk1huklusyjtqh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21huk1huklusyjtqh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69878,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xott9x1hx2() throws Exception{try{__CLR4_5_21huk1huklusyjtqh.R.inc(69878);
        __CLR4_5_21huk1huklusyjtqh.R.inc(69879);JSONException error = null;
        __CLR4_5_21huk1huklusyjtqh.R.inc(69880);try {
            __CLR4_5_21huk1huklusyjtqh.R.inc(69881);String text = "{\"value\":3.\u4e2d}";
            __CLR4_5_21huk1huklusyjtqh.R.inc(69882);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21huk1huklusyjtqh.R.inc(69883);error = ex;
        }
        __CLR4_5_21huk1huklusyjtqh.R.inc(69884);Assert.assertNotNull(error);
    }finally{__CLR4_5_21huk1huklusyjtqh.R.flushNeeded();}}

    public static class VO {

        private float value;

        public float getValue() {try{__CLR4_5_21huk1huklusyjtqh.R.inc(69885);
            __CLR4_5_21huk1huklusyjtqh.R.inc(69886);return value;
        }finally{__CLR4_5_21huk1huklusyjtqh.R.flushNeeded();}}

        public void setValue(float value) {try{__CLR4_5_21huk1huklusyjtqh.R.inc(69887);
            __CLR4_5_21huk1huklusyjtqh.R.inc(69888);this.value = value;
        }finally{__CLR4_5_21huk1huklusyjtqh.R.flushNeeded();}}

    }
}
