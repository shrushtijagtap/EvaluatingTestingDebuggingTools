/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class JSONScannerTest_scanFieldDouble extends TestCase {static class __CLR4_1_101iqd1iqdluszwcm7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,71031,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceStart(getClass().getName(),70933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21iqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iqd1iqdluszwcm7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70933,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21iqd() throws Exception{try{__CLR4_1_101iqd1iqdluszwcm7.R.inc(70933);
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70934);String text = "{\"value\":1.0}";
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70935);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70936);Assert.assertTrue(1D == obj.getValue());
    }finally{__CLR4_1_101iqd1iqdluszwcm7.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceStart(getClass().getName(),70937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1iqh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iqd1iqdluszwcm7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70937,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1iqh() throws Exception{try{__CLR4_1_101iqd1iqdluszwcm7.R.inc(70937);
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70938);String text = "{\"value\":\"1\"}";
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70939);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70940);Assert.assertTrue(1D == obj.getValue());
    }finally{__CLR4_1_101iqd1iqdluszwcm7.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceStart(getClass().getName(),70941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441iql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iqd1iqdluszwcm7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70941,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441iql() throws Exception{try{__CLR4_1_101iqd1iqdluszwcm7.R.inc(70941);
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70942);String text = "{\"f1\":2,\"value\":1.0}";
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70943);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70944);Assert.assertTrue(1D == obj.getValue());
    }finally{__CLR4_1_101iqd1iqdluszwcm7.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceStart(getClass().getName(),70945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1iqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iqd1iqdluszwcm7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70945,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1iqp() throws Exception{try{__CLR4_1_101iqd1iqdluszwcm7.R.inc(70945);
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70946);String text = "{\"value\":1.01}";
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70947);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70948);Assert.assertTrue(1.01D == obj.getValue());
    }finally{__CLR4_1_101iqd1iqdluszwcm7.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceStart(getClass().getName(),70949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61iqt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iqd1iqdluszwcm7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70949,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61iqt() throws Exception{try{__CLR4_1_101iqd1iqdluszwcm7.R.inc(70949);
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70950);String text = "{\"value\":1.}";
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70951);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70952);Assert.assertTrue(1D == obj.getValue());
    }finally{__CLR4_1_101iqd1iqdluszwcm7.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceStart(getClass().getName(),70953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1iqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iqd1iqdluszwcm7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70953,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1iqx() throws Exception{try{__CLR4_1_101iqd1iqdluszwcm7.R.inc(70953);
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70954);String text = "{\"value\":922337203685477580723}";
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70955);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70956);Assert.assertTrue(922337203685477580723D == obj.getValue());
    }finally{__CLR4_1_101iqd1iqdluszwcm7.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceStart(getClass().getName(),70957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1ir1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iqd1iqdluszwcm7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70957,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1ir1() throws Exception{try{__CLR4_1_101iqd1iqdluszwcm7.R.inc(70957);
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70958);JSONException error = null;
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70959);try {
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(70960);String text = "{\"value\":32K}";
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(70961);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(70962);error = ex;
        }
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70963);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iqd1iqdluszwcm7.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceStart(getClass().getName(),70964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1ir8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iqd1iqdluszwcm7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70964,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1ir8() throws Exception{try{__CLR4_1_101iqd1iqdluszwcm7.R.inc(70964);
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70965);JSONException error = null;
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70966);try {
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(70967);String text = "{\"value\":32}{";
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(70968);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(70969);error = ex;
        }
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70970);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iqd1iqdluszwcm7.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceStart(getClass().getName(),70971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1irf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iqd1iqdluszwcm7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70971,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1irf() throws Exception{try{__CLR4_1_101iqd1iqdluszwcm7.R.inc(70971);
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70972);JSONException error = null;
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70973);try {
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(70974);String text = "{\"value\":\u4e2d}";
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(70975);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(70976);error = ex;
        }
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70977);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iqd1iqdluszwcm7.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceStart(getClass().getName(),70978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v9cbw81irm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iqd1iqdluszwcm7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70978,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v9cbw81irm() throws Exception{try{__CLR4_1_101iqd1iqdluszwcm7.R.inc(70978);
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70979);JSONException error = null;
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70980);try {
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(70981);String text = "{\"value\":3.F";
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(70982);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(70983);error = ex;
        }
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70984);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iqd1iqdluszwcm7.R.flushNeeded();}}

    public void test_error_6() throws Exception {__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceStart(getClass().getName(),70985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yicaop1irt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iqd1iqdluszwcm7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70985,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yicaop1irt() throws Exception{try{__CLR4_1_101iqd1iqdluszwcm7.R.inc(70985);
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70986);JSONException error = null;
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70987);try {
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(70988);String text = "{\"value\":3.2]";
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(70989);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(70990);error = ex;
        }
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70991);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iqd1iqdluszwcm7.R.flushNeeded();}}

    public void test_error_7() throws Exception {__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceStart(getClass().getName(),70992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10x9rshy1is0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iqd1iqdluszwcm7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70992,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10x9rshy1is0() throws Exception{try{__CLR4_1_101iqd1iqdluszwcm7.R.inc(70992);
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70993);JSONException error = null;
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70994);try {
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(70995);String text = "{\"value\":3.2}]";
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(70996);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(70997);error = ex;
        }
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(70998);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iqd1iqdluszwcm7.R.flushNeeded();}}

    public void test_error_8() throws Exception {__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceStart(getClass().getName(),70999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10u0rtph1is7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iqd1iqdluszwcm7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70999,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10u0rtph1is7() throws Exception{try{__CLR4_1_101iqd1iqdluszwcm7.R.inc(70999);
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(71000);JSONException error = null;
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(71001);try {
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(71002);String text = "{\"value\":3.2}}";
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(71003);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(71004);error = ex;
        }
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(71005);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iqd1iqdluszwcm7.R.flushNeeded();}}

    public void test_error_9() throws Exception {__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceStart(getClass().getName(),71006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qrrux01ise();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iqd1iqdluszwcm7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71006,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qrrux01ise() throws Exception{try{__CLR4_1_101iqd1iqdluszwcm7.R.inc(71006);
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(71007);JSONException error = null;
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(71008);try {
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(71009);String text = "{\"value\":3.2},";
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(71010);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(71011);error = ex;
        }
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(71012);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iqd1iqdluszwcm7.R.flushNeeded();}}

    public void test_error_10() throws Exception {__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceStart(getClass().getName(),71013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10y3a9wq1isl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iqd1iqdluszwcm7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71013,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10y3a9wq1isl() throws Exception{try{__CLR4_1_101iqd1iqdluszwcm7.R.inc(71013);
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(71014);JSONException error = null;
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(71015);try {
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(71016);String text = "{\"value\":3.\\0}";
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(71017);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(71018);error = ex;
        }
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(71019);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iqd1iqdluszwcm7.R.flushNeeded();}}

    public void test_error_11() throws Exception {__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceStart(getClass().getName(),71020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xott9x1iss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iqd1iqdluszwcm7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iqd1iqdluszwcm7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71020,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xott9x1iss() throws Exception{try{__CLR4_1_101iqd1iqdluszwcm7.R.inc(71020);
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(71021);JSONException error = null;
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(71022);try {
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(71023);String text = "{\"value\":3.\u4e2d}";
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(71024);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(71025);error = ex;
        }
        __CLR4_1_101iqd1iqdluszwcm7.R.inc(71026);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iqd1iqdluszwcm7.R.flushNeeded();}}

    public static class VO {

        private double value;

        public double getValue() {try{__CLR4_1_101iqd1iqdluszwcm7.R.inc(71027);
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(71028);return value;
        }finally{__CLR4_1_101iqd1iqdluszwcm7.R.flushNeeded();}}

        public void setValue(double value) {try{__CLR4_1_101iqd1iqdluszwcm7.R.inc(71029);
            __CLR4_1_101iqd1iqdluszwcm7.R.inc(71030);this.value = value;
        }finally{__CLR4_1_101iqd1iqdluszwcm7.R.flushNeeded();}}

    }
}
