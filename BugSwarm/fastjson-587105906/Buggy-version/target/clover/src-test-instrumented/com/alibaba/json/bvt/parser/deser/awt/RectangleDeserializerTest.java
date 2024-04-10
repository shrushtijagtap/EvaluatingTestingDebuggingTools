/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.awt;

import java.awt.Font;
import java.awt.Rectangle;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.serializer.AwtCodec;

import junit.framework.TestCase;


public class RectangleDeserializerTest extends TestCase {static class __CLR4_1_101n171n17luszwdom{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,76553,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0 () throws Exception {__CLR4_1_101n171n17luszwdom.R.globalSliceStart(getClass().getName(),76507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21n17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n171n17luszwdom.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n171n17luszwdom.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.RectangleDeserializerTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76507,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21n17() throws Exception{try{__CLR4_1_101n171n17luszwdom.R.inc(76507);
        __CLR4_1_101n171n17luszwdom.R.inc(76508);AwtCodec.instance.getFastMatchToken();
        
        __CLR4_1_101n171n17luszwdom.R.inc(76509);Assert.assertNull(JSON.parseObject("null", Rectangle.class));
        __CLR4_1_101n171n17luszwdom.R.inc(76510);Assert.assertNull(JSON.parseArray("null", Rectangle.class));
        __CLR4_1_101n171n17luszwdom.R.inc(76511);Assert.assertNull(JSON.parseArray("[null]", Rectangle.class).get(0));
        __CLR4_1_101n171n17luszwdom.R.inc(76512);Assert.assertNull(JSON.parseObject("{\"value\":null}", VO.class).getValue());
    }finally{__CLR4_1_101n171n17luszwdom.R.flushNeeded();}}
    
    public void test_stack_error_0() throws Exception {__CLR4_1_101n171n17luszwdom.R.globalSliceStart(getClass().getName(),76513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pjesho1n1d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n171n17luszwdom.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n171n17luszwdom.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.RectangleDeserializerTest.test_stack_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76513,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pjesho1n1d() throws Exception{try{__CLR4_1_101n171n17luszwdom.R.inc(76513);
        __CLR4_1_101n171n17luszwdom.R.inc(76514);Exception error = null;
        __CLR4_1_101n171n17luszwdom.R.inc(76515);try {
            __CLR4_1_101n171n17luszwdom.R.inc(76516);JSON.parseObject("[]", Rectangle.class);
        } catch (JSONException ex) {
            __CLR4_1_101n171n17luszwdom.R.inc(76517);error = ex;
        }
        __CLR4_1_101n171n17luszwdom.R.inc(76518);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n171n17luszwdom.R.flushNeeded();}}
    
    public void test_stack_error_1() throws Exception {__CLR4_1_101n171n17luszwdom.R.globalSliceStart(getClass().getName(),76519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ssera51n1j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n171n17luszwdom.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n171n17luszwdom.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.RectangleDeserializerTest.test_stack_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76519,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ssera51n1j() throws Exception{try{__CLR4_1_101n171n17luszwdom.R.inc(76519);
        __CLR4_1_101n171n17luszwdom.R.inc(76520);Exception error = null;
        __CLR4_1_101n171n17luszwdom.R.inc(76521);try {
            __CLR4_1_101n171n17luszwdom.R.inc(76522);JSON.parseObject("{33:22}", Rectangle.class);
        } catch (JSONException ex) {
            __CLR4_1_101n171n17luszwdom.R.inc(76523);error = ex;
        }
        __CLR4_1_101n171n17luszwdom.R.inc(76524);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n171n17luszwdom.R.flushNeeded();}}
    
    public void test_stack_error_2() throws Exception {__CLR4_1_101n171n17luszwdom.R.globalSliceStart(getClass().getName(),76525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10w1eq2m1n1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n171n17luszwdom.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n171n17luszwdom.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.RectangleDeserializerTest.test_stack_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76525,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10w1eq2m1n1p() throws Exception{try{__CLR4_1_101n171n17luszwdom.R.inc(76525);
        __CLR4_1_101n171n17luszwdom.R.inc(76526);Exception error = null;
        __CLR4_1_101n171n17luszwdom.R.inc(76527);try {
            __CLR4_1_101n171n17luszwdom.R.inc(76528);JSON.parseObject("{\"name\":22}", Rectangle.class);
        } catch (JSONException ex) {
            __CLR4_1_101n171n17luszwdom.R.inc(76529);error = ex;
        }
        __CLR4_1_101n171n17luszwdom.R.inc(76530);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n171n17luszwdom.R.flushNeeded();}}
    
    public void test_stack_error_3() throws Exception {__CLR4_1_101n171n17luszwdom.R.globalSliceStart(getClass().getName(),76531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zaeov31n1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n171n17luszwdom.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n171n17luszwdom.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.RectangleDeserializerTest.test_stack_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76531,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zaeov31n1v() throws Exception{try{__CLR4_1_101n171n17luszwdom.R.inc(76531);
        __CLR4_1_101n171n17luszwdom.R.inc(76532);Exception error = null;
        __CLR4_1_101n171n17luszwdom.R.inc(76533);try {
            __CLR4_1_101n171n17luszwdom.R.inc(76534);JSON.parseObject("{\"style\":true}", Rectangle.class);
        } catch (JSONException ex) {
            __CLR4_1_101n171n17luszwdom.R.inc(76535);error = ex;
        }
        __CLR4_1_101n171n17luszwdom.R.inc(76536);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n171n17luszwdom.R.flushNeeded();}}
    
    public void test_stack_error_4() throws Exception {__CLR4_1_101n171n17luszwdom.R.globalSliceStart(getClass().getName(),76537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10whpebk1n21();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n171n17luszwdom.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n171n17luszwdom.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.RectangleDeserializerTest.test_stack_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76537,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10whpebk1n21() throws Exception{try{__CLR4_1_101n171n17luszwdom.R.inc(76537);
        __CLR4_1_101n171n17luszwdom.R.inc(76538);Exception error = null;
        __CLR4_1_101n171n17luszwdom.R.inc(76539);try {
            __CLR4_1_101n171n17luszwdom.R.inc(76540);JSON.parseObject("{\"size\":\"33\"}", Rectangle.class);
        } catch (JSONException ex) {
            __CLR4_1_101n171n17luszwdom.R.inc(76541);error = ex;
        }
        __CLR4_1_101n171n17luszwdom.R.inc(76542);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n171n17luszwdom.R.flushNeeded();}}
    
    public void test_stack_error_5() throws Exception {__CLR4_1_101n171n17luszwdom.R.globalSliceStart(getClass().getName(),76543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10t8pfj31n27();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n171n17luszwdom.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n171n17luszwdom.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.RectangleDeserializerTest.test_stack_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76543,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10t8pfj31n27() throws Exception{try{__CLR4_1_101n171n17luszwdom.R.inc(76543);
        __CLR4_1_101n171n17luszwdom.R.inc(76544);Exception error = null;
        __CLR4_1_101n171n17luszwdom.R.inc(76545);try {
            __CLR4_1_101n171n17luszwdom.R.inc(76546);JSON.parseObject("{\"xxx\":22}", Font.class);
        } catch (JSONException ex) {
            __CLR4_1_101n171n17luszwdom.R.inc(76547);error = ex;
        }
        __CLR4_1_101n171n17luszwdom.R.inc(76548);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n171n17luszwdom.R.flushNeeded();}}
    
    public static class VO {

        private Rectangle value;

        public Rectangle getValue() {try{__CLR4_1_101n171n17luszwdom.R.inc(76549);
            __CLR4_1_101n171n17luszwdom.R.inc(76550);return value;
        }finally{__CLR4_1_101n171n17luszwdom.R.flushNeeded();}}

        public void setValue(Rectangle value) {try{__CLR4_1_101n171n17luszwdom.R.inc(76551);
            __CLR4_1_101n171n17luszwdom.R.inc(76552);this.value = value;
        }finally{__CLR4_1_101n171n17luszwdom.R.flushNeeded();}}

    }
}
