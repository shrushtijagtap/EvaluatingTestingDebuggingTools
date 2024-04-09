/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class JSONScannerTest_scanFieldDouble extends TestCase {static class __CLR4_5_21iq21iq2lusvndbq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,71020,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21iq21iq2lusvndbq.R.globalSliceStart(getClass().getName(),70922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21iq2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iq21iq2lusvndbq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iq21iq2lusvndbq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70922,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21iq2() throws Exception{try{__CLR4_5_21iq21iq2lusvndbq.R.inc(70922);
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70923);String text = "{\"value\":1.0}";
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70924);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70925);Assert.assertTrue(1D == obj.getValue());
    }finally{__CLR4_5_21iq21iq2lusvndbq.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21iq21iq2lusvndbq.R.globalSliceStart(getClass().getName(),70926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1iq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iq21iq2lusvndbq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iq21iq2lusvndbq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70926,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1iq6() throws Exception{try{__CLR4_5_21iq21iq2lusvndbq.R.inc(70926);
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70927);String text = "{\"value\":\"1\"}";
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70928);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70929);Assert.assertTrue(1D == obj.getValue());
    }finally{__CLR4_5_21iq21iq2lusvndbq.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21iq21iq2lusvndbq.R.globalSliceStart(getClass().getName(),70930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441iqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iq21iq2lusvndbq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iq21iq2lusvndbq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70930,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441iqa() throws Exception{try{__CLR4_5_21iq21iq2lusvndbq.R.inc(70930);
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70931);String text = "{\"f1\":2,\"value\":1.0}";
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70932);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70933);Assert.assertTrue(1D == obj.getValue());
    }finally{__CLR4_5_21iq21iq2lusvndbq.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21iq21iq2lusvndbq.R.globalSliceStart(getClass().getName(),70934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1iqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iq21iq2lusvndbq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iq21iq2lusvndbq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70934,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1iqe() throws Exception{try{__CLR4_5_21iq21iq2lusvndbq.R.inc(70934);
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70935);String text = "{\"value\":1.01}";
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70936);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70937);Assert.assertTrue(1.01D == obj.getValue());
    }finally{__CLR4_5_21iq21iq2lusvndbq.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21iq21iq2lusvndbq.R.globalSliceStart(getClass().getName(),70938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61iqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iq21iq2lusvndbq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iq21iq2lusvndbq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70938,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61iqi() throws Exception{try{__CLR4_5_21iq21iq2lusvndbq.R.inc(70938);
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70939);String text = "{\"value\":1.}";
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70940);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70941);Assert.assertTrue(1D == obj.getValue());
    }finally{__CLR4_5_21iq21iq2lusvndbq.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21iq21iq2lusvndbq.R.globalSliceStart(getClass().getName(),70942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1iqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iq21iq2lusvndbq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iq21iq2lusvndbq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70942,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1iqm() throws Exception{try{__CLR4_5_21iq21iq2lusvndbq.R.inc(70942);
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70943);String text = "{\"value\":922337203685477580723}";
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70944);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70945);Assert.assertTrue(922337203685477580723D == obj.getValue());
    }finally{__CLR4_5_21iq21iq2lusvndbq.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21iq21iq2lusvndbq.R.globalSliceStart(getClass().getName(),70946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1iqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iq21iq2lusvndbq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iq21iq2lusvndbq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70946,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1iqq() throws Exception{try{__CLR4_5_21iq21iq2lusvndbq.R.inc(70946);
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70947);JSONException error = null;
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70948);try {
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70949);String text = "{\"value\":32K}";
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70950);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70951);error = ex;
        }
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70952);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iq21iq2lusvndbq.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_5_21iq21iq2lusvndbq.R.globalSliceStart(getClass().getName(),70953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1iqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iq21iq2lusvndbq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iq21iq2lusvndbq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70953,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1iqx() throws Exception{try{__CLR4_5_21iq21iq2lusvndbq.R.inc(70953);
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70954);JSONException error = null;
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70955);try {
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70956);String text = "{\"value\":32}{";
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70957);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70958);error = ex;
        }
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70959);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iq21iq2lusvndbq.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_5_21iq21iq2lusvndbq.R.globalSliceStart(getClass().getName(),70960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1ir4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iq21iq2lusvndbq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iq21iq2lusvndbq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70960,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1ir4() throws Exception{try{__CLR4_5_21iq21iq2lusvndbq.R.inc(70960);
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70961);JSONException error = null;
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70962);try {
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70963);String text = "{\"value\":\u4e2d}";
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70964);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70965);error = ex;
        }
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70966);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iq21iq2lusvndbq.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_5_21iq21iq2lusvndbq.R.globalSliceStart(getClass().getName(),70967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw81irb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iq21iq2lusvndbq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iq21iq2lusvndbq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70967,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw81irb() throws Exception{try{__CLR4_5_21iq21iq2lusvndbq.R.inc(70967);
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70968);JSONException error = null;
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70969);try {
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70970);String text = "{\"value\":3.F";
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70971);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70972);error = ex;
        }
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70973);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iq21iq2lusvndbq.R.flushNeeded();}}

    public void test_error_6() throws Exception {__CLR4_5_21iq21iq2lusvndbq.R.globalSliceStart(getClass().getName(),70974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yicaop1iri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iq21iq2lusvndbq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iq21iq2lusvndbq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70974,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yicaop1iri() throws Exception{try{__CLR4_5_21iq21iq2lusvndbq.R.inc(70974);
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70975);JSONException error = null;
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70976);try {
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70977);String text = "{\"value\":3.2]";
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70978);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70979);error = ex;
        }
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70980);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iq21iq2lusvndbq.R.flushNeeded();}}

    public void test_error_7() throws Exception {__CLR4_5_21iq21iq2lusvndbq.R.globalSliceStart(getClass().getName(),70981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x9rshy1irp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iq21iq2lusvndbq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iq21iq2lusvndbq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70981,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x9rshy1irp() throws Exception{try{__CLR4_5_21iq21iq2lusvndbq.R.inc(70981);
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70982);JSONException error = null;
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70983);try {
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70984);String text = "{\"value\":3.2}]";
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70985);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70986);error = ex;
        }
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70987);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iq21iq2lusvndbq.R.flushNeeded();}}

    public void test_error_8() throws Exception {__CLR4_5_21iq21iq2lusvndbq.R.globalSliceStart(getClass().getName(),70988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u0rtph1irw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iq21iq2lusvndbq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iq21iq2lusvndbq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70988,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u0rtph1irw() throws Exception{try{__CLR4_5_21iq21iq2lusvndbq.R.inc(70988);
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70989);JSONException error = null;
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70990);try {
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70991);String text = "{\"value\":3.2}}";
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70992);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70993);error = ex;
        }
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70994);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iq21iq2lusvndbq.R.flushNeeded();}}

    public void test_error_9() throws Exception {__CLR4_5_21iq21iq2lusvndbq.R.globalSliceStart(getClass().getName(),70995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qrrux01is3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iq21iq2lusvndbq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iq21iq2lusvndbq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70995,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qrrux01is3() throws Exception{try{__CLR4_5_21iq21iq2lusvndbq.R.inc(70995);
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70996);JSONException error = null;
        __CLR4_5_21iq21iq2lusvndbq.R.inc(70997);try {
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70998);String text = "{\"value\":3.2},";
            __CLR4_5_21iq21iq2lusvndbq.R.inc(70999);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21iq21iq2lusvndbq.R.inc(71000);error = ex;
        }
        __CLR4_5_21iq21iq2lusvndbq.R.inc(71001);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iq21iq2lusvndbq.R.flushNeeded();}}

    public void test_error_10() throws Exception {__CLR4_5_21iq21iq2lusvndbq.R.globalSliceStart(getClass().getName(),71002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y3a9wq1isa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iq21iq2lusvndbq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iq21iq2lusvndbq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71002,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y3a9wq1isa() throws Exception{try{__CLR4_5_21iq21iq2lusvndbq.R.inc(71002);
        __CLR4_5_21iq21iq2lusvndbq.R.inc(71003);JSONException error = null;
        __CLR4_5_21iq21iq2lusvndbq.R.inc(71004);try {
            __CLR4_5_21iq21iq2lusvndbq.R.inc(71005);String text = "{\"value\":3.\\0}";
            __CLR4_5_21iq21iq2lusvndbq.R.inc(71006);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21iq21iq2lusvndbq.R.inc(71007);error = ex;
        }
        __CLR4_5_21iq21iq2lusvndbq.R.inc(71008);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iq21iq2lusvndbq.R.flushNeeded();}}

    public void test_error_11() throws Exception {__CLR4_5_21iq21iq2lusvndbq.R.globalSliceStart(getClass().getName(),71009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xott9x1ish();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iq21iq2lusvndbq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iq21iq2lusvndbq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldDouble.test_error_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71009,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xott9x1ish() throws Exception{try{__CLR4_5_21iq21iq2lusvndbq.R.inc(71009);
        __CLR4_5_21iq21iq2lusvndbq.R.inc(71010);JSONException error = null;
        __CLR4_5_21iq21iq2lusvndbq.R.inc(71011);try {
            __CLR4_5_21iq21iq2lusvndbq.R.inc(71012);String text = "{\"value\":3.\u4e2d}";
            __CLR4_5_21iq21iq2lusvndbq.R.inc(71013);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21iq21iq2lusvndbq.R.inc(71014);error = ex;
        }
        __CLR4_5_21iq21iq2lusvndbq.R.inc(71015);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iq21iq2lusvndbq.R.flushNeeded();}}

    public static class VO {

        private double value;

        public double getValue() {try{__CLR4_5_21iq21iq2lusvndbq.R.inc(71016);
            __CLR4_5_21iq21iq2lusvndbq.R.inc(71017);return value;
        }finally{__CLR4_5_21iq21iq2lusvndbq.R.flushNeeded();}}

        public void setValue(double value) {try{__CLR4_5_21iq21iq2lusvndbq.R.inc(71018);
            __CLR4_5_21iq21iq2lusvndbq.R.inc(71019);this.value = value;
        }finally{__CLR4_5_21iq21iq2lusvndbq.R.flushNeeded();}}

    }
}
