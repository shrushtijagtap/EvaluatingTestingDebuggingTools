/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONScannerTest_scanFieldFloat extends TestCase {static class __CLR4_1_101huv1huvlusqkdqq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,69900,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101huv1huvlusqkdqq.R.globalSliceStart(getClass().getName(),69799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21huv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101huv1huvlusqkdqq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101huv1huvlusqkdqq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69799,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21huv() throws Exception{try{__CLR4_1_101huv1huvlusqkdqq.R.inc(69799);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69800);String text = "{\"value\":1.0}";
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69801);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69802);Assert.assertTrue(1F == obj.getValue());
    }finally{__CLR4_1_101huv1huvlusqkdqq.R.flushNeeded();}}

    @SuppressWarnings("resource")
    public void test_isBlank() throws Exception {__CLR4_1_101huv1huvlusqkdqq.R.globalSliceStart(getClass().getName(),69803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102ceda41huz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101huv1huvlusqkdqq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101huv1huvlusqkdqq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_isBlank",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69803,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102ceda41huz() throws Exception{try{__CLR4_1_101huv1huvlusqkdqq.R.inc(69803);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69804);String text = "   {\"value\":1.0}";
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69805);Assert.assertTrue(!new JSONScanner(text).isBlankInput());
    }finally{__CLR4_1_101huv1huvlusqkdqq.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101huv1huvlusqkdqq.R.globalSliceStart(getClass().getName(),69806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1hv2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101huv1huvlusqkdqq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101huv1huvlusqkdqq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69806,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1hv2() throws Exception{try{__CLR4_1_101huv1huvlusqkdqq.R.inc(69806);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69807);String text = "{\"value\":\"1\"}";
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69808);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69809);Assert.assertTrue(1F == obj.getValue());
    }finally{__CLR4_1_101huv1huvlusqkdqq.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101huv1huvlusqkdqq.R.globalSliceStart(getClass().getName(),69810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441hv6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101huv1huvlusqkdqq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101huv1huvlusqkdqq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69810,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441hv6() throws Exception{try{__CLR4_1_101huv1huvlusqkdqq.R.inc(69810);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69811);String text = "{\"f1\":2,\"value\":1.0}";
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69812);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69813);Assert.assertTrue(1F == obj.getValue());
    }finally{__CLR4_1_101huv1huvlusqkdqq.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101huv1huvlusqkdqq.R.globalSliceStart(getClass().getName(),69814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1hva();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101huv1huvlusqkdqq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101huv1huvlusqkdqq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69814,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1hva() throws Exception{try{__CLR4_1_101huv1huvlusqkdqq.R.inc(69814);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69815);String text = "{\"value\":1.01}";
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69816);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69817);Assert.assertTrue(1.01F == obj.getValue());
    }finally{__CLR4_1_101huv1huvlusqkdqq.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101huv1huvlusqkdqq.R.globalSliceStart(getClass().getName(),69818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61hve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101huv1huvlusqkdqq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101huv1huvlusqkdqq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69818,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61hve() throws Exception{try{__CLR4_1_101huv1huvlusqkdqq.R.inc(69818);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69819);String text = "{\"value\":1.}";
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69820);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69821);Assert.assertTrue(1F == obj.getValue());
    }finally{__CLR4_1_101huv1huvlusqkdqq.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101huv1huvlusqkdqq.R.globalSliceStart(getClass().getName(),69822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1hvi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101huv1huvlusqkdqq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101huv1huvlusqkdqq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69822,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1hvi() throws Exception{try{__CLR4_1_101huv1huvlusqkdqq.R.inc(69822);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69823);String text = "{\"value\":922337203685477580723}";
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69824);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69825);Assert.assertTrue(922337203685477580723F == obj.getValue());
    }finally{__CLR4_1_101huv1huvlusqkdqq.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101huv1huvlusqkdqq.R.globalSliceStart(getClass().getName(),69826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1hvm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101huv1huvlusqkdqq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101huv1huvlusqkdqq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69826,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1hvm() throws Exception{try{__CLR4_1_101huv1huvlusqkdqq.R.inc(69826);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69827);JSONException error = null;
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69828);try {
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69829);String text = "{\"value\":32M}";
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69830);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69831);error = ex;
        }
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69832);Assert.assertNotNull(error);
    }finally{__CLR4_1_101huv1huvlusqkdqq.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_101huv1huvlusqkdqq.R.globalSliceStart(getClass().getName(),69833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1hvt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101huv1huvlusqkdqq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101huv1huvlusqkdqq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69833,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1hvt() throws Exception{try{__CLR4_1_101huv1huvlusqkdqq.R.inc(69833);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69834);JSONException error = null;
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69835);try {
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69836);String text = "{\"value\":32}{";
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69837);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69838);error = ex;
        }
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69839);Assert.assertNotNull(error);
    }finally{__CLR4_1_101huv1huvlusqkdqq.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_1_101huv1huvlusqkdqq.R.globalSliceStart(getClass().getName(),69840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1hw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101huv1huvlusqkdqq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101huv1huvlusqkdqq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69840,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1hw0() throws Exception{try{__CLR4_1_101huv1huvlusqkdqq.R.inc(69840);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69841);JSONException error = null;
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69842);try {
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69843);String text = "{\"value\":\u4e2d}";
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69844);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69845);error = ex;
        }
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69846);Assert.assertNotNull(error);
    }finally{__CLR4_1_101huv1huvlusqkdqq.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_1_101huv1huvlusqkdqq.R.globalSliceStart(getClass().getName(),69847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v9cbw81hw7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101huv1huvlusqkdqq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101huv1huvlusqkdqq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69847,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v9cbw81hw7() throws Exception{try{__CLR4_1_101huv1huvlusqkdqq.R.inc(69847);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69848);JSONException error = null;
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69849);try {
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69850);String text = "{\"value\":3.F";
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69851);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69852);error = ex;
        }
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69853);Assert.assertNotNull(error);
    }finally{__CLR4_1_101huv1huvlusqkdqq.R.flushNeeded();}}

    public void test_error_6() throws Exception {__CLR4_1_101huv1huvlusqkdqq.R.globalSliceStart(getClass().getName(),69854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yicaop1hwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101huv1huvlusqkdqq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101huv1huvlusqkdqq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69854,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yicaop1hwe() throws Exception{try{__CLR4_1_101huv1huvlusqkdqq.R.inc(69854);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69855);JSONException error = null;
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69856);try {
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69857);String text = "{\"value\":3.2]";
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69858);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69859);error = ex;
        }
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69860);Assert.assertNotNull(error);
    }finally{__CLR4_1_101huv1huvlusqkdqq.R.flushNeeded();}}

    public void test_error_7() throws Exception {__CLR4_1_101huv1huvlusqkdqq.R.globalSliceStart(getClass().getName(),69861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10x9rshy1hwl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101huv1huvlusqkdqq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101huv1huvlusqkdqq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69861,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10x9rshy1hwl() throws Exception{try{__CLR4_1_101huv1huvlusqkdqq.R.inc(69861);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69862);JSONException error = null;
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69863);try {
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69864);String text = "{\"value\":3.2}]";
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69865);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69866);error = ex;
        }
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69867);Assert.assertNotNull(error);
    }finally{__CLR4_1_101huv1huvlusqkdqq.R.flushNeeded();}}

    public void test_error_8() throws Exception {__CLR4_1_101huv1huvlusqkdqq.R.globalSliceStart(getClass().getName(),69868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10u0rtph1hws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101huv1huvlusqkdqq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101huv1huvlusqkdqq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69868,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10u0rtph1hws() throws Exception{try{__CLR4_1_101huv1huvlusqkdqq.R.inc(69868);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69869);JSONException error = null;
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69870);try {
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69871);String text = "{\"value\":3.2}}";
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69872);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69873);error = ex;
        }
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69874);Assert.assertNotNull(error);
    }finally{__CLR4_1_101huv1huvlusqkdqq.R.flushNeeded();}}

    public void test_error_9() throws Exception {__CLR4_1_101huv1huvlusqkdqq.R.globalSliceStart(getClass().getName(),69875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qrrux01hwz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101huv1huvlusqkdqq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101huv1huvlusqkdqq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69875,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qrrux01hwz() throws Exception{try{__CLR4_1_101huv1huvlusqkdqq.R.inc(69875);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69876);JSONException error = null;
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69877);try {
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69878);String text = "{\"value\":3.2},";
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69879);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69880);error = ex;
        }
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69881);Assert.assertNotNull(error);
    }finally{__CLR4_1_101huv1huvlusqkdqq.R.flushNeeded();}}
    
    public void test_error_10() throws Exception {__CLR4_1_101huv1huvlusqkdqq.R.globalSliceStart(getClass().getName(),69882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10y3a9wq1hx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101huv1huvlusqkdqq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101huv1huvlusqkdqq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69882,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10y3a9wq1hx6() throws Exception{try{__CLR4_1_101huv1huvlusqkdqq.R.inc(69882);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69883);JSONException error = null;
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69884);try {
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69885);String text = "{\"value\":3.\\0}";
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69886);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69887);error = ex;
        }
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69888);Assert.assertNotNull(error);
    }finally{__CLR4_1_101huv1huvlusqkdqq.R.flushNeeded();}}
    
    public void test_error_11() throws Exception {__CLR4_1_101huv1huvlusqkdqq.R.globalSliceStart(getClass().getName(),69889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xott9x1hxd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101huv1huvlusqkdqq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101huv1huvlusqkdqq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69889,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xott9x1hxd() throws Exception{try{__CLR4_1_101huv1huvlusqkdqq.R.inc(69889);
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69890);JSONException error = null;
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69891);try {
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69892);String text = "{\"value\":3.\u4e2d}";
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69893);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69894);error = ex;
        }
        __CLR4_1_101huv1huvlusqkdqq.R.inc(69895);Assert.assertNotNull(error);
    }finally{__CLR4_1_101huv1huvlusqkdqq.R.flushNeeded();}}

    public static class VO {

        private float value;

        public float getValue() {try{__CLR4_1_101huv1huvlusqkdqq.R.inc(69896);
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69897);return value;
        }finally{__CLR4_1_101huv1huvlusqkdqq.R.flushNeeded();}}

        public void setValue(float value) {try{__CLR4_1_101huv1huvlusqkdqq.R.inc(69898);
            __CLR4_1_101huv1huvlusqkdqq.R.inc(69899);this.value = value;
        }finally{__CLR4_1_101huv1huvlusqkdqq.R.flushNeeded();}}

    }
}
