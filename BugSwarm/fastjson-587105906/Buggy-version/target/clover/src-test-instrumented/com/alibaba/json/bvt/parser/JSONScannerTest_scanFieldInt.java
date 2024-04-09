/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class JSONScannerTest_scanFieldInt extends TestCase {static class __CLR4_1_101hxo1hxolusqkdqy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,69947,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101hxo1hxolusqkdqy.R.globalSliceStart(getClass().getName(),69900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21hxo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hxo1hxolusqkdqy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hxo1hxolusqkdqy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldInt.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69900,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21hxo() throws Exception{try{__CLR4_1_101hxo1hxolusqkdqy.R.inc(69900);
        __CLR4_1_101hxo1hxolusqkdqy.R.inc(69901);String text = "{\"value\":1.0}";
        __CLR4_1_101hxo1hxolusqkdqy.R.inc(69902);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101hxo1hxolusqkdqy.R.inc(69903);Assert.assertEquals(1, obj.getValue());
    }finally{__CLR4_1_101hxo1hxolusqkdqy.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_1_101hxo1hxolusqkdqy.R.globalSliceStart(getClass().getName(),69904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1hxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hxo1hxolusqkdqy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hxo1hxolusqkdqy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldInt.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69904,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1hxs() throws Exception{try{__CLR4_1_101hxo1hxolusqkdqy.R.inc(69904);
        __CLR4_1_101hxo1hxolusqkdqy.R.inc(69905);String text = "{\"value\":\"1\"}";
        __CLR4_1_101hxo1hxolusqkdqy.R.inc(69906);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101hxo1hxolusqkdqy.R.inc(69907);Assert.assertEquals(1, obj.getValue());
    }finally{__CLR4_1_101hxo1hxolusqkdqy.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101hxo1hxolusqkdqy.R.globalSliceStart(getClass().getName(),69908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1hxw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hxo1hxolusqkdqy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hxo1hxolusqkdqy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldInt.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69908,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1hxw() throws Exception{try{__CLR4_1_101hxo1hxolusqkdqy.R.inc(69908);
        __CLR4_1_101hxo1hxolusqkdqy.R.inc(69909);JSONException error = null;
        __CLR4_1_101hxo1hxolusqkdqy.R.inc(69910);try {
            __CLR4_1_101hxo1hxolusqkdqy.R.inc(69911);String text = "{\"value\":922337203685477580723}";
            __CLR4_1_101hxo1hxolusqkdqy.R.inc(69912);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101hxo1hxolusqkdqy.R.inc(69913);error = ex;
        }
        __CLR4_1_101hxo1hxolusqkdqy.R.inc(69914);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hxo1hxolusqkdqy.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_1_101hxo1hxolusqkdqy.R.globalSliceStart(getClass().getName(),69915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1hy3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hxo1hxolusqkdqy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hxo1hxolusqkdqy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldInt.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69915,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1hy3() throws Exception{try{__CLR4_1_101hxo1hxolusqkdqy.R.inc(69915);
        __CLR4_1_101hxo1hxolusqkdqy.R.inc(69916);JSONException error = null;
        __CLR4_1_101hxo1hxolusqkdqy.R.inc(69917);try {
            __CLR4_1_101hxo1hxolusqkdqy.R.inc(69918);String text = "{\"value\":32O}";
            __CLR4_1_101hxo1hxolusqkdqy.R.inc(69919);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101hxo1hxolusqkdqy.R.inc(69920);error = ex;
        }
        __CLR4_1_101hxo1hxolusqkdqy.R.inc(69921);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hxo1hxolusqkdqy.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_1_101hxo1hxolusqkdqy.R.globalSliceStart(getClass().getName(),69922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1hya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hxo1hxolusqkdqy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hxo1hxolusqkdqy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldInt.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69922,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1hya() throws Exception{try{__CLR4_1_101hxo1hxolusqkdqy.R.inc(69922);
        __CLR4_1_101hxo1hxolusqkdqy.R.inc(69923);JSONException error = null;
        __CLR4_1_101hxo1hxolusqkdqy.R.inc(69924);try {
            __CLR4_1_101hxo1hxolusqkdqy.R.inc(69925);String text = "{\"value\":32}{";
            __CLR4_1_101hxo1hxolusqkdqy.R.inc(69926);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101hxo1hxolusqkdqy.R.inc(69927);error = ex;
        }
        __CLR4_1_101hxo1hxolusqkdqy.R.inc(69928);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hxo1hxolusqkdqy.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_1_101hxo1hxolusqkdqy.R.globalSliceStart(getClass().getName(),69929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1hyh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hxo1hxolusqkdqy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hxo1hxolusqkdqy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldInt.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69929,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1hyh() throws Exception{try{__CLR4_1_101hxo1hxolusqkdqy.R.inc(69929);
        __CLR4_1_101hxo1hxolusqkdqy.R.inc(69930);JSONException error = null;
        __CLR4_1_101hxo1hxolusqkdqy.R.inc(69931);try {
            __CLR4_1_101hxo1hxolusqkdqy.R.inc(69932);String text = "{\"value\":\u4e2d}";
            __CLR4_1_101hxo1hxolusqkdqy.R.inc(69933);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101hxo1hxolusqkdqy.R.inc(69934);error = ex;
        }
        __CLR4_1_101hxo1hxolusqkdqy.R.inc(69935);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hxo1hxolusqkdqy.R.flushNeeded();}}
    
    public void test_error_5() throws Exception {__CLR4_1_101hxo1hxolusqkdqy.R.globalSliceStart(getClass().getName(),69936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v9cbw81hyo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hxo1hxolusqkdqy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hxo1hxolusqkdqy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldInt.test_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69936,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v9cbw81hyo() throws Exception{try{__CLR4_1_101hxo1hxolusqkdqy.R.inc(69936);
        __CLR4_1_101hxo1hxolusqkdqy.R.inc(69937);JSONException error = null;
        __CLR4_1_101hxo1hxolusqkdqy.R.inc(69938);try {
            __CLR4_1_101hxo1hxolusqkdqy.R.inc(69939);String text = "{\"value\":\0}";
            __CLR4_1_101hxo1hxolusqkdqy.R.inc(69940);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101hxo1hxolusqkdqy.R.inc(69941);error = ex;
        }
        __CLR4_1_101hxo1hxolusqkdqy.R.inc(69942);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hxo1hxolusqkdqy.R.flushNeeded();}}

    public static class VO {

        private int value;

        public int getValue() {try{__CLR4_1_101hxo1hxolusqkdqy.R.inc(69943);
            __CLR4_1_101hxo1hxolusqkdqy.R.inc(69944);return value;
        }finally{__CLR4_1_101hxo1hxolusqkdqy.R.flushNeeded();}}

        public void setValue(int value) {try{__CLR4_1_101hxo1hxolusqkdqy.R.inc(69945);
            __CLR4_1_101hxo1hxolusqkdqy.R.inc(69946);this.value = value;
        }finally{__CLR4_1_101hxo1hxolusqkdqy.R.flushNeeded();}}

    }
}
