/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class JSONScannerTest_scanFieldInt extends TestCase {static class __CLR4_5_21ivl1ivllusvndd3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,71168,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21ivl1ivllusvndd3.R.globalSliceStart(getClass().getName(),71121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21ivl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ivl1ivllusvndd3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ivl1ivllusvndd3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldInt.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71121,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21ivl() throws Exception{try{__CLR4_5_21ivl1ivllusvndd3.R.inc(71121);
        __CLR4_5_21ivl1ivllusvndd3.R.inc(71122);String text = "{\"value\":1.0}";
        __CLR4_5_21ivl1ivllusvndd3.R.inc(71123);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21ivl1ivllusvndd3.R.inc(71124);Assert.assertEquals(1, obj.getValue());
    }finally{__CLR4_5_21ivl1ivllusvndd3.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_5_21ivl1ivllusvndd3.R.globalSliceStart(getClass().getName(),71125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1ivp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ivl1ivllusvndd3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ivl1ivllusvndd3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldInt.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71125,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1ivp() throws Exception{try{__CLR4_5_21ivl1ivllusvndd3.R.inc(71125);
        __CLR4_5_21ivl1ivllusvndd3.R.inc(71126);String text = "{\"value\":\"1\"}";
        __CLR4_5_21ivl1ivllusvndd3.R.inc(71127);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21ivl1ivllusvndd3.R.inc(71128);Assert.assertEquals(1, obj.getValue());
    }finally{__CLR4_5_21ivl1ivllusvndd3.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_5_21ivl1ivllusvndd3.R.globalSliceStart(getClass().getName(),71129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1ivt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ivl1ivllusvndd3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ivl1ivllusvndd3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldInt.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71129,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1ivt() throws Exception{try{__CLR4_5_21ivl1ivllusvndd3.R.inc(71129);
        __CLR4_5_21ivl1ivllusvndd3.R.inc(71130);JSONException error = null;
        __CLR4_5_21ivl1ivllusvndd3.R.inc(71131);try {
            __CLR4_5_21ivl1ivllusvndd3.R.inc(71132);String text = "{\"value\":922337203685477580723}";
            __CLR4_5_21ivl1ivllusvndd3.R.inc(71133);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21ivl1ivllusvndd3.R.inc(71134);error = ex;
        }
        __CLR4_5_21ivl1ivllusvndd3.R.inc(71135);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ivl1ivllusvndd3.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_5_21ivl1ivllusvndd3.R.globalSliceStart(getClass().getName(),71136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1iw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ivl1ivllusvndd3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ivl1ivllusvndd3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldInt.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71136,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1iw0() throws Exception{try{__CLR4_5_21ivl1ivllusvndd3.R.inc(71136);
        __CLR4_5_21ivl1ivllusvndd3.R.inc(71137);JSONException error = null;
        __CLR4_5_21ivl1ivllusvndd3.R.inc(71138);try {
            __CLR4_5_21ivl1ivllusvndd3.R.inc(71139);String text = "{\"value\":32O}";
            __CLR4_5_21ivl1ivllusvndd3.R.inc(71140);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21ivl1ivllusvndd3.R.inc(71141);error = ex;
        }
        __CLR4_5_21ivl1ivllusvndd3.R.inc(71142);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ivl1ivllusvndd3.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_5_21ivl1ivllusvndd3.R.globalSliceStart(getClass().getName(),71143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1iw7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ivl1ivllusvndd3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ivl1ivllusvndd3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldInt.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71143,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1iw7() throws Exception{try{__CLR4_5_21ivl1ivllusvndd3.R.inc(71143);
        __CLR4_5_21ivl1ivllusvndd3.R.inc(71144);JSONException error = null;
        __CLR4_5_21ivl1ivllusvndd3.R.inc(71145);try {
            __CLR4_5_21ivl1ivllusvndd3.R.inc(71146);String text = "{\"value\":32}{";
            __CLR4_5_21ivl1ivllusvndd3.R.inc(71147);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21ivl1ivllusvndd3.R.inc(71148);error = ex;
        }
        __CLR4_5_21ivl1ivllusvndd3.R.inc(71149);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ivl1ivllusvndd3.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_5_21ivl1ivllusvndd3.R.globalSliceStart(getClass().getName(),71150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1iwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ivl1ivllusvndd3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ivl1ivllusvndd3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldInt.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71150,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1iwe() throws Exception{try{__CLR4_5_21ivl1ivllusvndd3.R.inc(71150);
        __CLR4_5_21ivl1ivllusvndd3.R.inc(71151);JSONException error = null;
        __CLR4_5_21ivl1ivllusvndd3.R.inc(71152);try {
            __CLR4_5_21ivl1ivllusvndd3.R.inc(71153);String text = "{\"value\":\u4e2d}";
            __CLR4_5_21ivl1ivllusvndd3.R.inc(71154);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21ivl1ivllusvndd3.R.inc(71155);error = ex;
        }
        __CLR4_5_21ivl1ivllusvndd3.R.inc(71156);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ivl1ivllusvndd3.R.flushNeeded();}}
    
    public void test_error_5() throws Exception {__CLR4_5_21ivl1ivllusvndd3.R.globalSliceStart(getClass().getName(),71157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw81iwl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ivl1ivllusvndd3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ivl1ivllusvndd3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldInt.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71157,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw81iwl() throws Exception{try{__CLR4_5_21ivl1ivllusvndd3.R.inc(71157);
        __CLR4_5_21ivl1ivllusvndd3.R.inc(71158);JSONException error = null;
        __CLR4_5_21ivl1ivllusvndd3.R.inc(71159);try {
            __CLR4_5_21ivl1ivllusvndd3.R.inc(71160);String text = "{\"value\":\0}";
            __CLR4_5_21ivl1ivllusvndd3.R.inc(71161);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21ivl1ivllusvndd3.R.inc(71162);error = ex;
        }
        __CLR4_5_21ivl1ivllusvndd3.R.inc(71163);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ivl1ivllusvndd3.R.flushNeeded();}}

    public static class VO {

        private int value;

        public int getValue() {try{__CLR4_5_21ivl1ivllusvndd3.R.inc(71164);
            __CLR4_5_21ivl1ivllusvndd3.R.inc(71165);return value;
        }finally{__CLR4_5_21ivl1ivllusvndd3.R.flushNeeded();}}

        public void setValue(int value) {try{__CLR4_5_21ivl1ivllusvndd3.R.inc(71166);
            __CLR4_5_21ivl1ivllusvndd3.R.inc(71167);this.value = value;
        }finally{__CLR4_5_21ivl1ivllusvndd3.R.flushNeeded();}}

    }
}
