/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class JSONScannerTest_scanFieldInt extends TestCase {static class __CLR4_1_101ivw1ivwluszwcmn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,71179,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101ivw1ivwluszwcmn.R.globalSliceStart(getClass().getName(),71132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21ivw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ivw1ivwluszwcmn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ivw1ivwluszwcmn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldInt.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71132,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21ivw() throws Exception{try{__CLR4_1_101ivw1ivwluszwcmn.R.inc(71132);
        __CLR4_1_101ivw1ivwluszwcmn.R.inc(71133);String text = "{\"value\":1.0}";
        __CLR4_1_101ivw1ivwluszwcmn.R.inc(71134);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101ivw1ivwluszwcmn.R.inc(71135);Assert.assertEquals(1, obj.getValue());
    }finally{__CLR4_1_101ivw1ivwluszwcmn.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_1_101ivw1ivwluszwcmn.R.globalSliceStart(getClass().getName(),71136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1iw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ivw1ivwluszwcmn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ivw1ivwluszwcmn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldInt.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71136,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1iw0() throws Exception{try{__CLR4_1_101ivw1ivwluszwcmn.R.inc(71136);
        __CLR4_1_101ivw1ivwluszwcmn.R.inc(71137);String text = "{\"value\":\"1\"}";
        __CLR4_1_101ivw1ivwluszwcmn.R.inc(71138);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101ivw1ivwluszwcmn.R.inc(71139);Assert.assertEquals(1, obj.getValue());
    }finally{__CLR4_1_101ivw1ivwluszwcmn.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101ivw1ivwluszwcmn.R.globalSliceStart(getClass().getName(),71140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1iw4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ivw1ivwluszwcmn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ivw1ivwluszwcmn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldInt.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71140,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1iw4() throws Exception{try{__CLR4_1_101ivw1ivwluszwcmn.R.inc(71140);
        __CLR4_1_101ivw1ivwluszwcmn.R.inc(71141);JSONException error = null;
        __CLR4_1_101ivw1ivwluszwcmn.R.inc(71142);try {
            __CLR4_1_101ivw1ivwluszwcmn.R.inc(71143);String text = "{\"value\":922337203685477580723}";
            __CLR4_1_101ivw1ivwluszwcmn.R.inc(71144);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101ivw1ivwluszwcmn.R.inc(71145);error = ex;
        }
        __CLR4_1_101ivw1ivwluszwcmn.R.inc(71146);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ivw1ivwluszwcmn.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_1_101ivw1ivwluszwcmn.R.globalSliceStart(getClass().getName(),71147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1iwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ivw1ivwluszwcmn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ivw1ivwluszwcmn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldInt.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71147,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1iwb() throws Exception{try{__CLR4_1_101ivw1ivwluszwcmn.R.inc(71147);
        __CLR4_1_101ivw1ivwluszwcmn.R.inc(71148);JSONException error = null;
        __CLR4_1_101ivw1ivwluszwcmn.R.inc(71149);try {
            __CLR4_1_101ivw1ivwluszwcmn.R.inc(71150);String text = "{\"value\":32O}";
            __CLR4_1_101ivw1ivwluszwcmn.R.inc(71151);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101ivw1ivwluszwcmn.R.inc(71152);error = ex;
        }
        __CLR4_1_101ivw1ivwluszwcmn.R.inc(71153);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ivw1ivwluszwcmn.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_1_101ivw1ivwluszwcmn.R.globalSliceStart(getClass().getName(),71154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1iwi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ivw1ivwluszwcmn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ivw1ivwluszwcmn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldInt.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71154,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1iwi() throws Exception{try{__CLR4_1_101ivw1ivwluszwcmn.R.inc(71154);
        __CLR4_1_101ivw1ivwluszwcmn.R.inc(71155);JSONException error = null;
        __CLR4_1_101ivw1ivwluszwcmn.R.inc(71156);try {
            __CLR4_1_101ivw1ivwluszwcmn.R.inc(71157);String text = "{\"value\":32}{";
            __CLR4_1_101ivw1ivwluszwcmn.R.inc(71158);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101ivw1ivwluszwcmn.R.inc(71159);error = ex;
        }
        __CLR4_1_101ivw1ivwluszwcmn.R.inc(71160);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ivw1ivwluszwcmn.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_1_101ivw1ivwluszwcmn.R.globalSliceStart(getClass().getName(),71161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1iwp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ivw1ivwluszwcmn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ivw1ivwluszwcmn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldInt.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71161,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1iwp() throws Exception{try{__CLR4_1_101ivw1ivwluszwcmn.R.inc(71161);
        __CLR4_1_101ivw1ivwluszwcmn.R.inc(71162);JSONException error = null;
        __CLR4_1_101ivw1ivwluszwcmn.R.inc(71163);try {
            __CLR4_1_101ivw1ivwluszwcmn.R.inc(71164);String text = "{\"value\":\u4e2d}";
            __CLR4_1_101ivw1ivwluszwcmn.R.inc(71165);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101ivw1ivwluszwcmn.R.inc(71166);error = ex;
        }
        __CLR4_1_101ivw1ivwluszwcmn.R.inc(71167);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ivw1ivwluszwcmn.R.flushNeeded();}}
    
    public void test_error_5() throws Exception {__CLR4_1_101ivw1ivwluszwcmn.R.globalSliceStart(getClass().getName(),71168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v9cbw81iww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ivw1ivwluszwcmn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ivw1ivwluszwcmn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldInt.test_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71168,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v9cbw81iww() throws Exception{try{__CLR4_1_101ivw1ivwluszwcmn.R.inc(71168);
        __CLR4_1_101ivw1ivwluszwcmn.R.inc(71169);JSONException error = null;
        __CLR4_1_101ivw1ivwluszwcmn.R.inc(71170);try {
            __CLR4_1_101ivw1ivwluszwcmn.R.inc(71171);String text = "{\"value\":\0}";
            __CLR4_1_101ivw1ivwluszwcmn.R.inc(71172);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101ivw1ivwluszwcmn.R.inc(71173);error = ex;
        }
        __CLR4_1_101ivw1ivwluszwcmn.R.inc(71174);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ivw1ivwluszwcmn.R.flushNeeded();}}

    public static class VO {

        private int value;

        public int getValue() {try{__CLR4_1_101ivw1ivwluszwcmn.R.inc(71175);
            __CLR4_1_101ivw1ivwluszwcmn.R.inc(71176);return value;
        }finally{__CLR4_1_101ivw1ivwluszwcmn.R.flushNeeded();}}

        public void setValue(int value) {try{__CLR4_1_101ivw1ivwluszwcmn.R.inc(71177);
            __CLR4_1_101ivw1ivwluszwcmn.R.inc(71178);this.value = value;
        }finally{__CLR4_1_101ivw1ivwluszwcmn.R.flushNeeded();}}

    }
}
