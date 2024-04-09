/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.awt;

import java.awt.Font;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.serializer.AwtCodec;

import junit.framework.TestCase;


public class FontDeserializerTest extends TestCase {static class __CLR4_5_21myq1myqlusvnenj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,76464,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0 () throws Exception {__CLR4_5_21myq1myqlusvnenj.R.globalSliceStart(getClass().getName(),76418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21myq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21myq1myqlusvnenj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21myq1myqlusvnenj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.FontDeserializerTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76418,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21myq() throws Exception{try{__CLR4_5_21myq1myqlusvnenj.R.inc(76418);
        __CLR4_5_21myq1myqlusvnenj.R.inc(76419);AwtCodec.instance.getFastMatchToken();
        
        __CLR4_5_21myq1myqlusvnenj.R.inc(76420);Assert.assertNull(JSON.parseObject("null", StackTraceElement.class));
        __CLR4_5_21myq1myqlusvnenj.R.inc(76421);Assert.assertNull(JSON.parseArray("null", StackTraceElement.class));
        __CLR4_5_21myq1myqlusvnenj.R.inc(76422);Assert.assertNull(JSON.parseArray("[null]", StackTraceElement.class).get(0));
        __CLR4_5_21myq1myqlusvnenj.R.inc(76423);Assert.assertNull(JSON.parseObject("{\"value\":null}", VO.class).getValue());
    }finally{__CLR4_5_21myq1myqlusvnenj.R.flushNeeded();}}
    
    public void test_stack_error_0() throws Exception {__CLR4_5_21myq1myqlusvnenj.R.globalSliceStart(getClass().getName(),76424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pjesho1myw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21myq1myqlusvnenj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21myq1myqlusvnenj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.FontDeserializerTest.test_stack_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76424,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pjesho1myw() throws Exception{try{__CLR4_5_21myq1myqlusvnenj.R.inc(76424);
        __CLR4_5_21myq1myqlusvnenj.R.inc(76425);Exception error = null;
        __CLR4_5_21myq1myqlusvnenj.R.inc(76426);try {
            __CLR4_5_21myq1myqlusvnenj.R.inc(76427);JSON.parseObject("[]", Font.class);
        } catch (JSONException ex) {
            __CLR4_5_21myq1myqlusvnenj.R.inc(76428);error = ex;
        }
        __CLR4_5_21myq1myqlusvnenj.R.inc(76429);Assert.assertNotNull(error);
    }finally{__CLR4_5_21myq1myqlusvnenj.R.flushNeeded();}}
    
    public void test_stack_error_1() throws Exception {__CLR4_5_21myq1myqlusvnenj.R.globalSliceStart(getClass().getName(),76430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ssera51mz2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21myq1myqlusvnenj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21myq1myqlusvnenj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.FontDeserializerTest.test_stack_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76430,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ssera51mz2() throws Exception{try{__CLR4_5_21myq1myqlusvnenj.R.inc(76430);
        __CLR4_5_21myq1myqlusvnenj.R.inc(76431);Exception error = null;
        __CLR4_5_21myq1myqlusvnenj.R.inc(76432);try {
            __CLR4_5_21myq1myqlusvnenj.R.inc(76433);JSON.parseObject("{33:22}", Font.class);
        } catch (JSONException ex) {
            __CLR4_5_21myq1myqlusvnenj.R.inc(76434);error = ex;
        }
        __CLR4_5_21myq1myqlusvnenj.R.inc(76435);Assert.assertNotNull(error);
    }finally{__CLR4_5_21myq1myqlusvnenj.R.flushNeeded();}}
    
    public void test_stack_error_2() throws Exception {__CLR4_5_21myq1myqlusvnenj.R.globalSliceStart(getClass().getName(),76436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w1eq2m1mz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21myq1myqlusvnenj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21myq1myqlusvnenj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.FontDeserializerTest.test_stack_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76436,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w1eq2m1mz8() throws Exception{try{__CLR4_5_21myq1myqlusvnenj.R.inc(76436);
        __CLR4_5_21myq1myqlusvnenj.R.inc(76437);Exception error = null;
        __CLR4_5_21myq1myqlusvnenj.R.inc(76438);try {
            __CLR4_5_21myq1myqlusvnenj.R.inc(76439);JSON.parseObject("{\"name\":22}", Font.class);
        } catch (JSONException ex) {
            __CLR4_5_21myq1myqlusvnenj.R.inc(76440);error = ex;
        }
        __CLR4_5_21myq1myqlusvnenj.R.inc(76441);Assert.assertNotNull(error);
    }finally{__CLR4_5_21myq1myqlusvnenj.R.flushNeeded();}}
    
    public void test_stack_error_3() throws Exception {__CLR4_5_21myq1myqlusvnenj.R.globalSliceStart(getClass().getName(),76442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zaeov31mze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21myq1myqlusvnenj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21myq1myqlusvnenj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.FontDeserializerTest.test_stack_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76442,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zaeov31mze() throws Exception{try{__CLR4_5_21myq1myqlusvnenj.R.inc(76442);
        __CLR4_5_21myq1myqlusvnenj.R.inc(76443);Exception error = null;
        __CLR4_5_21myq1myqlusvnenj.R.inc(76444);try {
            __CLR4_5_21myq1myqlusvnenj.R.inc(76445);JSON.parseObject("{\"style\":true}", Font.class);
        } catch (JSONException ex) {
            __CLR4_5_21myq1myqlusvnenj.R.inc(76446);error = ex;
        }
        __CLR4_5_21myq1myqlusvnenj.R.inc(76447);Assert.assertNotNull(error);
    }finally{__CLR4_5_21myq1myqlusvnenj.R.flushNeeded();}}
    
    public void test_stack_error_4() throws Exception {__CLR4_5_21myq1myqlusvnenj.R.globalSliceStart(getClass().getName(),76448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2whpebk1mzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21myq1myqlusvnenj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21myq1myqlusvnenj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.FontDeserializerTest.test_stack_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76448,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2whpebk1mzk() throws Exception{try{__CLR4_5_21myq1myqlusvnenj.R.inc(76448);
        __CLR4_5_21myq1myqlusvnenj.R.inc(76449);Exception error = null;
        __CLR4_5_21myq1myqlusvnenj.R.inc(76450);try {
            __CLR4_5_21myq1myqlusvnenj.R.inc(76451);JSON.parseObject("{\"size\":\"33\"}", Font.class);
        } catch (JSONException ex) {
            __CLR4_5_21myq1myqlusvnenj.R.inc(76452);error = ex;
        }
        __CLR4_5_21myq1myqlusvnenj.R.inc(76453);Assert.assertNotNull(error);
    }finally{__CLR4_5_21myq1myqlusvnenj.R.flushNeeded();}}
    
    public void test_stack_error_5() throws Exception {__CLR4_5_21myq1myqlusvnenj.R.globalSliceStart(getClass().getName(),76454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t8pfj31mzq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21myq1myqlusvnenj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21myq1myqlusvnenj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.FontDeserializerTest.test_stack_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76454,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t8pfj31mzq() throws Exception{try{__CLR4_5_21myq1myqlusvnenj.R.inc(76454);
        __CLR4_5_21myq1myqlusvnenj.R.inc(76455);Exception error = null;
        __CLR4_5_21myq1myqlusvnenj.R.inc(76456);try {
            __CLR4_5_21myq1myqlusvnenj.R.inc(76457);JSON.parseObject("{\"xxx\":22}", Font.class);
        } catch (JSONException ex) {
            __CLR4_5_21myq1myqlusvnenj.R.inc(76458);error = ex;
        }
        __CLR4_5_21myq1myqlusvnenj.R.inc(76459);Assert.assertNotNull(error);
    }finally{__CLR4_5_21myq1myqlusvnenj.R.flushNeeded();}}
    
    public static class VO {

        private Font value;

        public Font getValue() {try{__CLR4_5_21myq1myqlusvnenj.R.inc(76460);
            __CLR4_5_21myq1myqlusvnenj.R.inc(76461);return value;
        }finally{__CLR4_5_21myq1myqlusvnenj.R.flushNeeded();}}

        public void setValue(Font value) {try{__CLR4_5_21myq1myqlusvnenj.R.inc(76462);
            __CLR4_5_21myq1myqlusvnenj.R.inc(76463);this.value = value;
        }finally{__CLR4_5_21myq1myqlusvnenj.R.flushNeeded();}}

    }
}
