/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.awt;

import java.awt.Font;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.serializer.AwtCodec;

import junit.framework.TestCase;


public class FontDeserializerTest extends TestCase {static class __CLR4_1_101mz11mz1luszwdly{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,76475,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0 () throws Exception {__CLR4_1_101mz11mz1luszwdly.R.globalSliceStart(getClass().getName(),76429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21mz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mz11mz1luszwdly.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mz11mz1luszwdly.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.FontDeserializerTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76429,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21mz1() throws Exception{try{__CLR4_1_101mz11mz1luszwdly.R.inc(76429);
        __CLR4_1_101mz11mz1luszwdly.R.inc(76430);AwtCodec.instance.getFastMatchToken();
        
        __CLR4_1_101mz11mz1luszwdly.R.inc(76431);Assert.assertNull(JSON.parseObject("null", StackTraceElement.class));
        __CLR4_1_101mz11mz1luszwdly.R.inc(76432);Assert.assertNull(JSON.parseArray("null", StackTraceElement.class));
        __CLR4_1_101mz11mz1luszwdly.R.inc(76433);Assert.assertNull(JSON.parseArray("[null]", StackTraceElement.class).get(0));
        __CLR4_1_101mz11mz1luszwdly.R.inc(76434);Assert.assertNull(JSON.parseObject("{\"value\":null}", VO.class).getValue());
    }finally{__CLR4_1_101mz11mz1luszwdly.R.flushNeeded();}}
    
    public void test_stack_error_0() throws Exception {__CLR4_1_101mz11mz1luszwdly.R.globalSliceStart(getClass().getName(),76435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pjesho1mz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mz11mz1luszwdly.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mz11mz1luszwdly.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.FontDeserializerTest.test_stack_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76435,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pjesho1mz7() throws Exception{try{__CLR4_1_101mz11mz1luszwdly.R.inc(76435);
        __CLR4_1_101mz11mz1luszwdly.R.inc(76436);Exception error = null;
        __CLR4_1_101mz11mz1luszwdly.R.inc(76437);try {
            __CLR4_1_101mz11mz1luszwdly.R.inc(76438);JSON.parseObject("[]", Font.class);
        } catch (JSONException ex) {
            __CLR4_1_101mz11mz1luszwdly.R.inc(76439);error = ex;
        }
        __CLR4_1_101mz11mz1luszwdly.R.inc(76440);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mz11mz1luszwdly.R.flushNeeded();}}
    
    public void test_stack_error_1() throws Exception {__CLR4_1_101mz11mz1luszwdly.R.globalSliceStart(getClass().getName(),76441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ssera51mzd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mz11mz1luszwdly.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mz11mz1luszwdly.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.FontDeserializerTest.test_stack_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76441,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ssera51mzd() throws Exception{try{__CLR4_1_101mz11mz1luszwdly.R.inc(76441);
        __CLR4_1_101mz11mz1luszwdly.R.inc(76442);Exception error = null;
        __CLR4_1_101mz11mz1luszwdly.R.inc(76443);try {
            __CLR4_1_101mz11mz1luszwdly.R.inc(76444);JSON.parseObject("{33:22}", Font.class);
        } catch (JSONException ex) {
            __CLR4_1_101mz11mz1luszwdly.R.inc(76445);error = ex;
        }
        __CLR4_1_101mz11mz1luszwdly.R.inc(76446);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mz11mz1luszwdly.R.flushNeeded();}}
    
    public void test_stack_error_2() throws Exception {__CLR4_1_101mz11mz1luszwdly.R.globalSliceStart(getClass().getName(),76447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10w1eq2m1mzj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mz11mz1luszwdly.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mz11mz1luszwdly.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.FontDeserializerTest.test_stack_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76447,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10w1eq2m1mzj() throws Exception{try{__CLR4_1_101mz11mz1luszwdly.R.inc(76447);
        __CLR4_1_101mz11mz1luszwdly.R.inc(76448);Exception error = null;
        __CLR4_1_101mz11mz1luszwdly.R.inc(76449);try {
            __CLR4_1_101mz11mz1luszwdly.R.inc(76450);JSON.parseObject("{\"name\":22}", Font.class);
        } catch (JSONException ex) {
            __CLR4_1_101mz11mz1luszwdly.R.inc(76451);error = ex;
        }
        __CLR4_1_101mz11mz1luszwdly.R.inc(76452);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mz11mz1luszwdly.R.flushNeeded();}}
    
    public void test_stack_error_3() throws Exception {__CLR4_1_101mz11mz1luszwdly.R.globalSliceStart(getClass().getName(),76453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zaeov31mzp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mz11mz1luszwdly.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mz11mz1luszwdly.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.FontDeserializerTest.test_stack_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76453,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zaeov31mzp() throws Exception{try{__CLR4_1_101mz11mz1luszwdly.R.inc(76453);
        __CLR4_1_101mz11mz1luszwdly.R.inc(76454);Exception error = null;
        __CLR4_1_101mz11mz1luszwdly.R.inc(76455);try {
            __CLR4_1_101mz11mz1luszwdly.R.inc(76456);JSON.parseObject("{\"style\":true}", Font.class);
        } catch (JSONException ex) {
            __CLR4_1_101mz11mz1luszwdly.R.inc(76457);error = ex;
        }
        __CLR4_1_101mz11mz1luszwdly.R.inc(76458);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mz11mz1luszwdly.R.flushNeeded();}}
    
    public void test_stack_error_4() throws Exception {__CLR4_1_101mz11mz1luszwdly.R.globalSliceStart(getClass().getName(),76459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10whpebk1mzv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mz11mz1luszwdly.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mz11mz1luszwdly.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.FontDeserializerTest.test_stack_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76459,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10whpebk1mzv() throws Exception{try{__CLR4_1_101mz11mz1luszwdly.R.inc(76459);
        __CLR4_1_101mz11mz1luszwdly.R.inc(76460);Exception error = null;
        __CLR4_1_101mz11mz1luszwdly.R.inc(76461);try {
            __CLR4_1_101mz11mz1luszwdly.R.inc(76462);JSON.parseObject("{\"size\":\"33\"}", Font.class);
        } catch (JSONException ex) {
            __CLR4_1_101mz11mz1luszwdly.R.inc(76463);error = ex;
        }
        __CLR4_1_101mz11mz1luszwdly.R.inc(76464);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mz11mz1luszwdly.R.flushNeeded();}}
    
    public void test_stack_error_5() throws Exception {__CLR4_1_101mz11mz1luszwdly.R.globalSliceStart(getClass().getName(),76465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10t8pfj31n01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mz11mz1luszwdly.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mz11mz1luszwdly.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.FontDeserializerTest.test_stack_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76465,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10t8pfj31n01() throws Exception{try{__CLR4_1_101mz11mz1luszwdly.R.inc(76465);
        __CLR4_1_101mz11mz1luszwdly.R.inc(76466);Exception error = null;
        __CLR4_1_101mz11mz1luszwdly.R.inc(76467);try {
            __CLR4_1_101mz11mz1luszwdly.R.inc(76468);JSON.parseObject("{\"xxx\":22}", Font.class);
        } catch (JSONException ex) {
            __CLR4_1_101mz11mz1luszwdly.R.inc(76469);error = ex;
        }
        __CLR4_1_101mz11mz1luszwdly.R.inc(76470);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mz11mz1luszwdly.R.flushNeeded();}}
    
    public static class VO {

        private Font value;

        public Font getValue() {try{__CLR4_1_101mz11mz1luszwdly.R.inc(76471);
            __CLR4_1_101mz11mz1luszwdly.R.inc(76472);return value;
        }finally{__CLR4_1_101mz11mz1luszwdly.R.flushNeeded();}}

        public void setValue(Font value) {try{__CLR4_1_101mz11mz1luszwdly.R.inc(76473);
            __CLR4_1_101mz11mz1luszwdly.R.inc(76474);this.value = value;
        }finally{__CLR4_1_101mz11mz1luszwdly.R.flushNeeded();}}

    }
}
