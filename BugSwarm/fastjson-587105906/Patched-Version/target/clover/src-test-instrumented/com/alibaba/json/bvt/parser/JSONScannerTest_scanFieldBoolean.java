/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class JSONScannerTest_scanFieldBoolean extends TestCase {static class __CLR4_5_21img1imglusvnd47{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,70918,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_true() throws Exception {__CLR4_5_21img1imglusvnd47.R.globalSliceStart(getClass().getName(),70792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zgwum61img();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21img1imglusvnd47.R.rethrow($CLV_t2$);}finally{__CLR4_5_21img1imglusvnd47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_true",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70792,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zgwum61img() throws Exception{try{__CLR4_5_21img1imglusvnd47.R.inc(70792);
        __CLR4_5_21img1imglusvnd47.R.inc(70793);String text = "{\"value\":true}";
        __CLR4_5_21img1imglusvnd47.R.inc(70794);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21img1imglusvnd47.R.inc(70795);Assert.assertEquals(true, obj.getValue());
    }finally{__CLR4_5_21img1imglusvnd47.R.flushNeeded();}}

    public void test_false() throws Exception {__CLR4_5_21img1imglusvnd47.R.globalSliceStart(getClass().getName(),70796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g0rozn1imk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21img1imglusvnd47.R.rethrow($CLV_t2$);}finally{__CLR4_5_21img1imglusvnd47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_false",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70796,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g0rozn1imk() throws Exception{try{__CLR4_5_21img1imglusvnd47.R.inc(70796);
        __CLR4_5_21img1imglusvnd47.R.inc(70797);String text = "{\"value\":false}";
        __CLR4_5_21img1imglusvnd47.R.inc(70798);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21img1imglusvnd47.R.inc(70799);Assert.assertEquals(false, obj.getValue());
    }finally{__CLR4_5_21img1imglusvnd47.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21img1imglusvnd47.R.globalSliceStart(getClass().getName(),70800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1imo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21img1imglusvnd47.R.rethrow($CLV_t2$);}finally{__CLR4_5_21img1imglusvnd47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70800,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1imo() throws Exception{try{__CLR4_5_21img1imglusvnd47.R.inc(70800);
        __CLR4_5_21img1imglusvnd47.R.inc(70801);String text = "{\"value\":\"true\"}";
        __CLR4_5_21img1imglusvnd47.R.inc(70802);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21img1imglusvnd47.R.inc(70803);Assert.assertEquals(true, obj.getValue());
    }finally{__CLR4_5_21img1imglusvnd47.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21img1imglusvnd47.R.globalSliceStart(getClass().getName(),70804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441ims();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21img1imglusvnd47.R.rethrow($CLV_t2$);}finally{__CLR4_5_21img1imglusvnd47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70804,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441ims() throws Exception{try{__CLR4_5_21img1imglusvnd47.R.inc(70804);
        __CLR4_5_21img1imglusvnd47.R.inc(70805);String text = "{\"value\":\"false\"}";
        __CLR4_5_21img1imglusvnd47.R.inc(70806);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21img1imglusvnd47.R.inc(70807);Assert.assertEquals(false, obj.getValue());
    }finally{__CLR4_5_21img1imglusvnd47.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21img1imglusvnd47.R.globalSliceStart(getClass().getName(),70808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1imw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21img1imglusvnd47.R.rethrow($CLV_t2$);}finally{__CLR4_5_21img1imglusvnd47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70808,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1imw() throws Exception{try{__CLR4_5_21img1imglusvnd47.R.inc(70808);
        __CLR4_5_21img1imglusvnd47.R.inc(70809);String text = "{\"value\":\"1\"}";
        __CLR4_5_21img1imglusvnd47.R.inc(70810);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21img1imglusvnd47.R.inc(70811);Assert.assertEquals(true, obj.getValue());
    }finally{__CLR4_5_21img1imglusvnd47.R.flushNeeded();}}
    

    
    public void test_5() throws Exception {__CLR4_5_21img1imglusvnd47.R.globalSliceStart(getClass().getName(),70812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1in0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21img1imglusvnd47.R.rethrow($CLV_t2$);}finally{__CLR4_5_21img1imglusvnd47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70812,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1in0() throws Exception{try{__CLR4_5_21img1imglusvnd47.R.inc(70812);
        __CLR4_5_21img1imglusvnd47.R.inc(70813);String text = "{\"value\":false}";
        __CLR4_5_21img1imglusvnd47.R.inc(70814);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21img1imglusvnd47.R.inc(70815);Assert.assertEquals(false, obj.getValue());
    }finally{__CLR4_5_21img1imglusvnd47.R.flushNeeded();}}

    public void test_error_0() {__CLR4_5_21img1imglusvnd47.R.globalSliceStart(getClass().getName(),70816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxv1in4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21img1imglusvnd47.R.rethrow($CLV_t2$);}finally{__CLR4_5_21img1imglusvnd47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70816,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxv1in4(){try{__CLR4_5_21img1imglusvnd47.R.inc(70816);
        __CLR4_5_21img1imglusvnd47.R.inc(70817);Exception error = null;
        __CLR4_5_21img1imglusvnd47.R.inc(70818);try {
            __CLR4_5_21img1imglusvnd47.R.inc(70819);String text = "{\"value\":true\\n\"";
            __CLR4_5_21img1imglusvnd47.R.inc(70820);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21img1imglusvnd47.R.inc(70821);error = ex;
        }
        __CLR4_5_21img1imglusvnd47.R.inc(70822);Assert.assertNotNull(error);
    }finally{__CLR4_5_21img1imglusvnd47.R.flushNeeded();}}

    public void test_error_1() {__CLR4_5_21img1imglusvnd47.R.globalSliceStart(getClass().getName(),70823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1inb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21img1imglusvnd47.R.rethrow($CLV_t2$);}finally{__CLR4_5_21img1imglusvnd47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70823,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1inb(){try{__CLR4_5_21img1imglusvnd47.R.inc(70823);
        __CLR4_5_21img1imglusvnd47.R.inc(70824);Exception error = null;
        __CLR4_5_21img1imglusvnd47.R.inc(70825);try {
            __CLR4_5_21img1imglusvnd47.R.inc(70826);String text = "{\"value\":a";
            __CLR4_5_21img1imglusvnd47.R.inc(70827);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21img1imglusvnd47.R.inc(70828);error = ex;
        }
        __CLR4_5_21img1imglusvnd47.R.inc(70829);Assert.assertNotNull(error);
    }finally{__CLR4_5_21img1imglusvnd47.R.flushNeeded();}}

    public void test_error_2() {__CLR4_5_21img1imglusvnd47.R.globalSliceStart(getClass().getName(),70830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1ini();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21img1imglusvnd47.R.rethrow($CLV_t2$);}finally{__CLR4_5_21img1imglusvnd47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70830,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1ini(){try{__CLR4_5_21img1imglusvnd47.R.inc(70830);
        __CLR4_5_21img1imglusvnd47.R.inc(70831);Exception error = null;
        __CLR4_5_21img1imglusvnd47.R.inc(70832);try {
            __CLR4_5_21img1imglusvnd47.R.inc(70833);String text = "{\"value\":teue}";
            __CLR4_5_21img1imglusvnd47.R.inc(70834);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21img1imglusvnd47.R.inc(70835);error = ex;
        }
        __CLR4_5_21img1imglusvnd47.R.inc(70836);Assert.assertNotNull(error);
    }finally{__CLR4_5_21img1imglusvnd47.R.flushNeeded();}}

    public void test_error_3() {__CLR4_5_21img1imglusvnd47.R.globalSliceStart(getClass().getName(),70837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1inp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21img1imglusvnd47.R.rethrow($CLV_t2$);}finally{__CLR4_5_21img1imglusvnd47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70837,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1inp(){try{__CLR4_5_21img1imglusvnd47.R.inc(70837);
        __CLR4_5_21img1imglusvnd47.R.inc(70838);Exception error = null;
        __CLR4_5_21img1imglusvnd47.R.inc(70839);try {
            __CLR4_5_21img1imglusvnd47.R.inc(70840);String text = "{\"value\":tree}";
            __CLR4_5_21img1imglusvnd47.R.inc(70841);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21img1imglusvnd47.R.inc(70842);error = ex;
        }
        __CLR4_5_21img1imglusvnd47.R.inc(70843);Assert.assertNotNull(error);
    }finally{__CLR4_5_21img1imglusvnd47.R.flushNeeded();}}

    public void test_error_4() {__CLR4_5_21img1imglusvnd47.R.globalSliceStart(getClass().getName(),70844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1inw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21img1imglusvnd47.R.rethrow($CLV_t2$);}finally{__CLR4_5_21img1imglusvnd47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70844,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1inw(){try{__CLR4_5_21img1imglusvnd47.R.inc(70844);
        __CLR4_5_21img1imglusvnd47.R.inc(70845);Exception error = null;
        __CLR4_5_21img1imglusvnd47.R.inc(70846);try {
            __CLR4_5_21img1imglusvnd47.R.inc(70847);String text = "{\"value\":truu}";
            __CLR4_5_21img1imglusvnd47.R.inc(70848);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21img1imglusvnd47.R.inc(70849);error = ex;
        }
        __CLR4_5_21img1imglusvnd47.R.inc(70850);Assert.assertNotNull(error);
    }finally{__CLR4_5_21img1imglusvnd47.R.flushNeeded();}}

    public void test_error_5() {__CLR4_5_21img1imglusvnd47.R.globalSliceStart(getClass().getName(),70851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw81io3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21img1imglusvnd47.R.rethrow($CLV_t2$);}finally{__CLR4_5_21img1imglusvnd47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70851,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw81io3(){try{__CLR4_5_21img1imglusvnd47.R.inc(70851);
        __CLR4_5_21img1imglusvnd47.R.inc(70852);Exception error = null;
        __CLR4_5_21img1imglusvnd47.R.inc(70853);try {
            __CLR4_5_21img1imglusvnd47.R.inc(70854);String text = "{\"value\":fflse}";
            __CLR4_5_21img1imglusvnd47.R.inc(70855);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21img1imglusvnd47.R.inc(70856);error = ex;
        }
        __CLR4_5_21img1imglusvnd47.R.inc(70857);Assert.assertNotNull(error);
    }finally{__CLR4_5_21img1imglusvnd47.R.flushNeeded();}}
    
    public void test_error_6() {__CLR4_5_21img1imglusvnd47.R.globalSliceStart(getClass().getName(),70858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yicaop1ioa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21img1imglusvnd47.R.rethrow($CLV_t2$);}finally{__CLR4_5_21img1imglusvnd47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70858,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yicaop1ioa(){try{__CLR4_5_21img1imglusvnd47.R.inc(70858);
        __CLR4_5_21img1imglusvnd47.R.inc(70859);Exception error = null;
        __CLR4_5_21img1imglusvnd47.R.inc(70860);try {
            __CLR4_5_21img1imglusvnd47.R.inc(70861);String text = "{\"value\":fasse}";
            __CLR4_5_21img1imglusvnd47.R.inc(70862);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21img1imglusvnd47.R.inc(70863);error = ex;
        }
        __CLR4_5_21img1imglusvnd47.R.inc(70864);Assert.assertNotNull(error);
    }finally{__CLR4_5_21img1imglusvnd47.R.flushNeeded();}}
    
    public void test_error_7() {__CLR4_5_21img1imglusvnd47.R.globalSliceStart(getClass().getName(),70865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x9rshy1ioh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21img1imglusvnd47.R.rethrow($CLV_t2$);}finally{__CLR4_5_21img1imglusvnd47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70865,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x9rshy1ioh(){try{__CLR4_5_21img1imglusvnd47.R.inc(70865);
        __CLR4_5_21img1imglusvnd47.R.inc(70866);Exception error = null;
        __CLR4_5_21img1imglusvnd47.R.inc(70867);try {
            __CLR4_5_21img1imglusvnd47.R.inc(70868);String text = "{\"value\":falee}";
            __CLR4_5_21img1imglusvnd47.R.inc(70869);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21img1imglusvnd47.R.inc(70870);error = ex;
        }
        __CLR4_5_21img1imglusvnd47.R.inc(70871);Assert.assertNotNull(error);
    }finally{__CLR4_5_21img1imglusvnd47.R.flushNeeded();}}
    
    public void test_error_8() {__CLR4_5_21img1imglusvnd47.R.globalSliceStart(getClass().getName(),70872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u0rtph1ioo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21img1imglusvnd47.R.rethrow($CLV_t2$);}finally{__CLR4_5_21img1imglusvnd47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70872,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u0rtph1ioo(){try{__CLR4_5_21img1imglusvnd47.R.inc(70872);
        __CLR4_5_21img1imglusvnd47.R.inc(70873);Exception error = null;
        __CLR4_5_21img1imglusvnd47.R.inc(70874);try {
            __CLR4_5_21img1imglusvnd47.R.inc(70875);String text = "{\"value\":falss}";
            __CLR4_5_21img1imglusvnd47.R.inc(70876);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21img1imglusvnd47.R.inc(70877);error = ex;
        }
        __CLR4_5_21img1imglusvnd47.R.inc(70878);Assert.assertNotNull(error);
    }finally{__CLR4_5_21img1imglusvnd47.R.flushNeeded();}}
    
    public void test_error_9() {__CLR4_5_21img1imglusvnd47.R.globalSliceStart(getClass().getName(),70879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qrrux01iov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21img1imglusvnd47.R.rethrow($CLV_t2$);}finally{__CLR4_5_21img1imglusvnd47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70879,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qrrux01iov(){try{__CLR4_5_21img1imglusvnd47.R.inc(70879);
        __CLR4_5_21img1imglusvnd47.R.inc(70880);Exception error = null;
        __CLR4_5_21img1imglusvnd47.R.inc(70881);try {
            __CLR4_5_21img1imglusvnd47.R.inc(70882);String text = "{\"value\":false]";
            __CLR4_5_21img1imglusvnd47.R.inc(70883);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21img1imglusvnd47.R.inc(70884);error = ex;
        }
        __CLR4_5_21img1imglusvnd47.R.inc(70885);Assert.assertNotNull(error);
    }finally{__CLR4_5_21img1imglusvnd47.R.flushNeeded();}}
    
    public void test_error_10() {__CLR4_5_21img1imglusvnd47.R.globalSliceStart(getClass().getName(),70886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y3a9wq1ip2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21img1imglusvnd47.R.rethrow($CLV_t2$);}finally{__CLR4_5_21img1imglusvnd47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70886,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y3a9wq1ip2(){try{__CLR4_5_21img1imglusvnd47.R.inc(70886);
        __CLR4_5_21img1imglusvnd47.R.inc(70887);Exception error = null;
        __CLR4_5_21img1imglusvnd47.R.inc(70888);try {
            __CLR4_5_21img1imglusvnd47.R.inc(70889);String text = "{\"value\":false}{";
            __CLR4_5_21img1imglusvnd47.R.inc(70890);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21img1imglusvnd47.R.inc(70891);error = ex;
        }
        __CLR4_5_21img1imglusvnd47.R.inc(70892);Assert.assertNotNull(error);
    }finally{__CLR4_5_21img1imglusvnd47.R.flushNeeded();}}
    
    public void test_error_11() {__CLR4_5_21img1imglusvnd47.R.globalSliceStart(getClass().getName(),70893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xott9x1ip9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21img1imglusvnd47.R.rethrow($CLV_t2$);}finally{__CLR4_5_21img1imglusvnd47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70893,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xott9x1ip9(){try{__CLR4_5_21img1imglusvnd47.R.inc(70893);
        __CLR4_5_21img1imglusvnd47.R.inc(70894);Exception error = null;
        __CLR4_5_21img1imglusvnd47.R.inc(70895);try {
            __CLR4_5_21img1imglusvnd47.R.inc(70896);String text = "{\"value\":false}}";
            __CLR4_5_21img1imglusvnd47.R.inc(70897);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21img1imglusvnd47.R.inc(70898);error = ex;
        }
        __CLR4_5_21img1imglusvnd47.R.inc(70899);Assert.assertNotNull(error);
    }finally{__CLR4_5_21img1imglusvnd47.R.flushNeeded();}}
    
    public void test_error_12() {__CLR4_5_21img1imglusvnd47.R.globalSliceStart(getClass().getName(),70900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uftuhg1ipg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21img1imglusvnd47.R.rethrow($CLV_t2$);}finally{__CLR4_5_21img1imglusvnd47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70900,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uftuhg1ipg(){try{__CLR4_5_21img1imglusvnd47.R.inc(70900);
        __CLR4_5_21img1imglusvnd47.R.inc(70901);Exception error = null;
        __CLR4_5_21img1imglusvnd47.R.inc(70902);try {
            __CLR4_5_21img1imglusvnd47.R.inc(70903);String text = "{\"value\":false}]";
            __CLR4_5_21img1imglusvnd47.R.inc(70904);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21img1imglusvnd47.R.inc(70905);error = ex;
        }
        __CLR4_5_21img1imglusvnd47.R.inc(70906);Assert.assertNotNull(error);
    }finally{__CLR4_5_21img1imglusvnd47.R.flushNeeded();}}
    
    public void test_error_13() {__CLR4_5_21img1imglusvnd47.R.globalSliceStart(getClass().getName(),70907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r6tvoz1ipn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21img1imglusvnd47.R.rethrow($CLV_t2$);}finally{__CLR4_5_21img1imglusvnd47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldBoolean.test_error_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70907,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r6tvoz1ipn(){try{__CLR4_5_21img1imglusvnd47.R.inc(70907);
        __CLR4_5_21img1imglusvnd47.R.inc(70908);Exception error = null;
        __CLR4_5_21img1imglusvnd47.R.inc(70909);try {
            __CLR4_5_21img1imglusvnd47.R.inc(70910);String text = "{\"value\":false},";
            __CLR4_5_21img1imglusvnd47.R.inc(70911);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_5_21img1imglusvnd47.R.inc(70912);error = ex;
        }
        __CLR4_5_21img1imglusvnd47.R.inc(70913);Assert.assertNotNull(error);
    }finally{__CLR4_5_21img1imglusvnd47.R.flushNeeded();}}

    public static class VO {

        private boolean value;

        public boolean getValue() {try{__CLR4_5_21img1imglusvnd47.R.inc(70914);
            __CLR4_5_21img1imglusvnd47.R.inc(70915);return value;
        }finally{__CLR4_5_21img1imglusvnd47.R.flushNeeded();}}

        public void setValue(boolean value) {try{__CLR4_5_21img1imglusvnd47.R.inc(70916);
            __CLR4_5_21img1imglusvnd47.R.inc(70917);this.value = value;
        }finally{__CLR4_5_21img1imglusvnd47.R.flushNeeded();}}

    }
}
