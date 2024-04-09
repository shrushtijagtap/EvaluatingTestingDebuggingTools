/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONScannerTest_scanFieldFloat extends TestCase {static class __CLR4_5_21iss1isslusvndcq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,71121,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21iss1isslusvndcq.R.globalSliceStart(getClass().getName(),71020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21iss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iss1isslusvndcq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iss1isslusvndcq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71020,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21iss() throws Exception{try{__CLR4_5_21iss1isslusvndcq.R.inc(71020);
        __CLR4_5_21iss1isslusvndcq.R.inc(71021);String text = "{\"value\":1.0}";
        __CLR4_5_21iss1isslusvndcq.R.inc(71022);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21iss1isslusvndcq.R.inc(71023);Assert.assertTrue(1F == obj.getValue());
    }finally{__CLR4_5_21iss1isslusvndcq.R.flushNeeded();}}

    @SuppressWarnings("resource")
    public void test_isBlank() throws Exception {__CLR4_5_21iss1isslusvndcq.R.globalSliceStart(getClass().getName(),71024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22ceda41isw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iss1isslusvndcq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iss1isslusvndcq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_isBlank",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71024,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22ceda41isw() throws Exception{try{__CLR4_5_21iss1isslusvndcq.R.inc(71024);
        __CLR4_5_21iss1isslusvndcq.R.inc(71025);String text = "   {\"value\":1.0}";
        __CLR4_5_21iss1isslusvndcq.R.inc(71026);Assert.assertTrue(!new JSONScanner(text).isBlankInput());
    }finally{__CLR4_5_21iss1isslusvndcq.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21iss1isslusvndcq.R.globalSliceStart(getClass().getName(),71027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1isz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iss1isslusvndcq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iss1isslusvndcq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71027,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1isz() throws Exception{try{__CLR4_5_21iss1isslusvndcq.R.inc(71027);
        __CLR4_5_21iss1isslusvndcq.R.inc(71028);String text = "{\"value\":\"1\"}";
        __CLR4_5_21iss1isslusvndcq.R.inc(71029);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21iss1isslusvndcq.R.inc(71030);Assert.assertTrue(1F == obj.getValue());
    }finally{__CLR4_5_21iss1isslusvndcq.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21iss1isslusvndcq.R.globalSliceStart(getClass().getName(),71031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441it3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iss1isslusvndcq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iss1isslusvndcq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71031,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441it3() throws Exception{try{__CLR4_5_21iss1isslusvndcq.R.inc(71031);
        __CLR4_5_21iss1isslusvndcq.R.inc(71032);String text = "{\"f1\":2,\"value\":1.0}";
        __CLR4_5_21iss1isslusvndcq.R.inc(71033);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21iss1isslusvndcq.R.inc(71034);Assert.assertTrue(1F == obj.getValue());
    }finally{__CLR4_5_21iss1isslusvndcq.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21iss1isslusvndcq.R.globalSliceStart(getClass().getName(),71035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1it7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iss1isslusvndcq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iss1isslusvndcq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71035,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1it7() throws Exception{try{__CLR4_5_21iss1isslusvndcq.R.inc(71035);
        __CLR4_5_21iss1isslusvndcq.R.inc(71036);String text = "{\"value\":1.01}";
        __CLR4_5_21iss1isslusvndcq.R.inc(71037);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21iss1isslusvndcq.R.inc(71038);Assert.assertTrue(1.01F == obj.getValue());
    }finally{__CLR4_5_21iss1isslusvndcq.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21iss1isslusvndcq.R.globalSliceStart(getClass().getName(),71039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61itb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iss1isslusvndcq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iss1isslusvndcq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71039,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61itb() throws Exception{try{__CLR4_5_21iss1isslusvndcq.R.inc(71039);
        __CLR4_5_21iss1isslusvndcq.R.inc(71040);String text = "{\"value\":1.}";
        __CLR4_5_21iss1isslusvndcq.R.inc(71041);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21iss1isslusvndcq.R.inc(71042);Assert.assertTrue(1F == obj.getValue());
    }finally{__CLR4_5_21iss1isslusvndcq.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_5_21iss1isslusvndcq.R.globalSliceStart(getClass().getName(),71043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1itf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iss1isslusvndcq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iss1isslusvndcq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71043,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1itf() throws Exception{try{__CLR4_5_21iss1isslusvndcq.R.inc(71043);
        __CLR4_5_21iss1isslusvndcq.R.inc(71044);String text = "{\"value\":922337203685477580723}";
        __CLR4_5_21iss1isslusvndcq.R.inc(71045);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21iss1isslusvndcq.R.inc(71046);Assert.assertTrue(922337203685477580723F == obj.getValue());
    }finally{__CLR4_5_21iss1isslusvndcq.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21iss1isslusvndcq.R.globalSliceStart(getClass().getName(),71047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1itj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iss1isslusvndcq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iss1isslusvndcq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71047,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1itj() throws Exception{try{__CLR4_5_21iss1isslusvndcq.R.inc(71047);
        __CLR4_5_21iss1isslusvndcq.R.inc(71048);JSONException error = null;
        __CLR4_5_21iss1isslusvndcq.R.inc(71049);try {
            __CLR4_5_21iss1isslusvndcq.R.inc(71050);String text = "{\"value\":32M}";
            __CLR4_5_21iss1isslusvndcq.R.inc(71051);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21iss1isslusvndcq.R.inc(71052);error = ex;
        }
        __CLR4_5_21iss1isslusvndcq.R.inc(71053);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iss1isslusvndcq.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_5_21iss1isslusvndcq.R.globalSliceStart(getClass().getName(),71054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1itq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iss1isslusvndcq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iss1isslusvndcq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71054,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1itq() throws Exception{try{__CLR4_5_21iss1isslusvndcq.R.inc(71054);
        __CLR4_5_21iss1isslusvndcq.R.inc(71055);JSONException error = null;
        __CLR4_5_21iss1isslusvndcq.R.inc(71056);try {
            __CLR4_5_21iss1isslusvndcq.R.inc(71057);String text = "{\"value\":32}{";
            __CLR4_5_21iss1isslusvndcq.R.inc(71058);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21iss1isslusvndcq.R.inc(71059);error = ex;
        }
        __CLR4_5_21iss1isslusvndcq.R.inc(71060);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iss1isslusvndcq.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_5_21iss1isslusvndcq.R.globalSliceStart(getClass().getName(),71061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1itx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iss1isslusvndcq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iss1isslusvndcq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71061,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1itx() throws Exception{try{__CLR4_5_21iss1isslusvndcq.R.inc(71061);
        __CLR4_5_21iss1isslusvndcq.R.inc(71062);JSONException error = null;
        __CLR4_5_21iss1isslusvndcq.R.inc(71063);try {
            __CLR4_5_21iss1isslusvndcq.R.inc(71064);String text = "{\"value\":\u4e2d}";
            __CLR4_5_21iss1isslusvndcq.R.inc(71065);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21iss1isslusvndcq.R.inc(71066);error = ex;
        }
        __CLR4_5_21iss1isslusvndcq.R.inc(71067);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iss1isslusvndcq.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_5_21iss1isslusvndcq.R.globalSliceStart(getClass().getName(),71068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw81iu4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iss1isslusvndcq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iss1isslusvndcq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71068,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw81iu4() throws Exception{try{__CLR4_5_21iss1isslusvndcq.R.inc(71068);
        __CLR4_5_21iss1isslusvndcq.R.inc(71069);JSONException error = null;
        __CLR4_5_21iss1isslusvndcq.R.inc(71070);try {
            __CLR4_5_21iss1isslusvndcq.R.inc(71071);String text = "{\"value\":3.F";
            __CLR4_5_21iss1isslusvndcq.R.inc(71072);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21iss1isslusvndcq.R.inc(71073);error = ex;
        }
        __CLR4_5_21iss1isslusvndcq.R.inc(71074);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iss1isslusvndcq.R.flushNeeded();}}

    public void test_error_6() throws Exception {__CLR4_5_21iss1isslusvndcq.R.globalSliceStart(getClass().getName(),71075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yicaop1iub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iss1isslusvndcq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iss1isslusvndcq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71075,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yicaop1iub() throws Exception{try{__CLR4_5_21iss1isslusvndcq.R.inc(71075);
        __CLR4_5_21iss1isslusvndcq.R.inc(71076);JSONException error = null;
        __CLR4_5_21iss1isslusvndcq.R.inc(71077);try {
            __CLR4_5_21iss1isslusvndcq.R.inc(71078);String text = "{\"value\":3.2]";
            __CLR4_5_21iss1isslusvndcq.R.inc(71079);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21iss1isslusvndcq.R.inc(71080);error = ex;
        }
        __CLR4_5_21iss1isslusvndcq.R.inc(71081);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iss1isslusvndcq.R.flushNeeded();}}

    public void test_error_7() throws Exception {__CLR4_5_21iss1isslusvndcq.R.globalSliceStart(getClass().getName(),71082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x9rshy1iui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iss1isslusvndcq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iss1isslusvndcq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71082,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x9rshy1iui() throws Exception{try{__CLR4_5_21iss1isslusvndcq.R.inc(71082);
        __CLR4_5_21iss1isslusvndcq.R.inc(71083);JSONException error = null;
        __CLR4_5_21iss1isslusvndcq.R.inc(71084);try {
            __CLR4_5_21iss1isslusvndcq.R.inc(71085);String text = "{\"value\":3.2}]";
            __CLR4_5_21iss1isslusvndcq.R.inc(71086);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21iss1isslusvndcq.R.inc(71087);error = ex;
        }
        __CLR4_5_21iss1isslusvndcq.R.inc(71088);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iss1isslusvndcq.R.flushNeeded();}}

    public void test_error_8() throws Exception {__CLR4_5_21iss1isslusvndcq.R.globalSliceStart(getClass().getName(),71089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u0rtph1iup();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iss1isslusvndcq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iss1isslusvndcq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71089,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u0rtph1iup() throws Exception{try{__CLR4_5_21iss1isslusvndcq.R.inc(71089);
        __CLR4_5_21iss1isslusvndcq.R.inc(71090);JSONException error = null;
        __CLR4_5_21iss1isslusvndcq.R.inc(71091);try {
            __CLR4_5_21iss1isslusvndcq.R.inc(71092);String text = "{\"value\":3.2}}";
            __CLR4_5_21iss1isslusvndcq.R.inc(71093);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21iss1isslusvndcq.R.inc(71094);error = ex;
        }
        __CLR4_5_21iss1isslusvndcq.R.inc(71095);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iss1isslusvndcq.R.flushNeeded();}}

    public void test_error_9() throws Exception {__CLR4_5_21iss1isslusvndcq.R.globalSliceStart(getClass().getName(),71096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qrrux01iuw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iss1isslusvndcq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iss1isslusvndcq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71096,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qrrux01iuw() throws Exception{try{__CLR4_5_21iss1isslusvndcq.R.inc(71096);
        __CLR4_5_21iss1isslusvndcq.R.inc(71097);JSONException error = null;
        __CLR4_5_21iss1isslusvndcq.R.inc(71098);try {
            __CLR4_5_21iss1isslusvndcq.R.inc(71099);String text = "{\"value\":3.2},";
            __CLR4_5_21iss1isslusvndcq.R.inc(71100);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21iss1isslusvndcq.R.inc(71101);error = ex;
        }
        __CLR4_5_21iss1isslusvndcq.R.inc(71102);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iss1isslusvndcq.R.flushNeeded();}}
    
    public void test_error_10() throws Exception {__CLR4_5_21iss1isslusvndcq.R.globalSliceStart(getClass().getName(),71103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y3a9wq1iv3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iss1isslusvndcq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iss1isslusvndcq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71103,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y3a9wq1iv3() throws Exception{try{__CLR4_5_21iss1isslusvndcq.R.inc(71103);
        __CLR4_5_21iss1isslusvndcq.R.inc(71104);JSONException error = null;
        __CLR4_5_21iss1isslusvndcq.R.inc(71105);try {
            __CLR4_5_21iss1isslusvndcq.R.inc(71106);String text = "{\"value\":3.\\0}";
            __CLR4_5_21iss1isslusvndcq.R.inc(71107);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21iss1isslusvndcq.R.inc(71108);error = ex;
        }
        __CLR4_5_21iss1isslusvndcq.R.inc(71109);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iss1isslusvndcq.R.flushNeeded();}}
    
    public void test_error_11() throws Exception {__CLR4_5_21iss1isslusvndcq.R.globalSliceStart(getClass().getName(),71110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xott9x1iva();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iss1isslusvndcq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iss1isslusvndcq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71110,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xott9x1iva() throws Exception{try{__CLR4_5_21iss1isslusvndcq.R.inc(71110);
        __CLR4_5_21iss1isslusvndcq.R.inc(71111);JSONException error = null;
        __CLR4_5_21iss1isslusvndcq.R.inc(71112);try {
            __CLR4_5_21iss1isslusvndcq.R.inc(71113);String text = "{\"value\":3.\u4e2d}";
            __CLR4_5_21iss1isslusvndcq.R.inc(71114);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21iss1isslusvndcq.R.inc(71115);error = ex;
        }
        __CLR4_5_21iss1isslusvndcq.R.inc(71116);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iss1isslusvndcq.R.flushNeeded();}}

    public static class VO {

        private float value;

        public float getValue() {try{__CLR4_5_21iss1isslusvndcq.R.inc(71117);
            __CLR4_5_21iss1isslusvndcq.R.inc(71118);return value;
        }finally{__CLR4_5_21iss1isslusvndcq.R.flushNeeded();}}

        public void setValue(float value) {try{__CLR4_5_21iss1isslusvndcq.R.inc(71119);
            __CLR4_5_21iss1isslusvndcq.R.inc(71120);this.value = value;
        }finally{__CLR4_5_21iss1isslusvndcq.R.flushNeeded();}}

    }
}
