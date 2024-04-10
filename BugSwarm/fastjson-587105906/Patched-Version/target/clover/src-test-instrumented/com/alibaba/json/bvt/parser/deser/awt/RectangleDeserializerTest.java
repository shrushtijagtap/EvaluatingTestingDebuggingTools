/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.awt;

import java.awt.Font;
import java.awt.Rectangle;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.serializer.AwtCodec;

import junit.framework.TestCase;


public class RectangleDeserializerTest extends TestCase {static class __CLR4_5_21m2o1m2olusyju9j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,75310,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0 () throws Exception {__CLR4_5_21m2o1m2olusyju9j.R.globalSliceStart(getClass().getName(),75264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21m2o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21m2o1m2olusyju9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_21m2o1m2olusyju9j.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.RectangleDeserializerTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75264,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21m2o() throws Exception{try{__CLR4_5_21m2o1m2olusyju9j.R.inc(75264);
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75265);AwtCodec.instance.getFastMatchToken();
        
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75266);Assert.assertNull(JSON.parseObject("null", Rectangle.class));
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75267);Assert.assertNull(JSON.parseArray("null", Rectangle.class));
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75268);Assert.assertNull(JSON.parseArray("[null]", Rectangle.class).get(0));
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75269);Assert.assertNull(JSON.parseObject("{\"value\":null}", VO.class).getValue());
    }finally{__CLR4_5_21m2o1m2olusyju9j.R.flushNeeded();}}
    
    public void test_stack_error_0() throws Exception {__CLR4_5_21m2o1m2olusyju9j.R.globalSliceStart(getClass().getName(),75270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pjesho1m2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21m2o1m2olusyju9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_21m2o1m2olusyju9j.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.RectangleDeserializerTest.test_stack_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75270,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pjesho1m2u() throws Exception{try{__CLR4_5_21m2o1m2olusyju9j.R.inc(75270);
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75271);Exception error = null;
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75272);try {
            __CLR4_5_21m2o1m2olusyju9j.R.inc(75273);JSON.parseObject("[]", Rectangle.class);
        } catch (JSONException ex) {
            __CLR4_5_21m2o1m2olusyju9j.R.inc(75274);error = ex;
        }
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75275);Assert.assertNotNull(error);
    }finally{__CLR4_5_21m2o1m2olusyju9j.R.flushNeeded();}}
    
    public void test_stack_error_1() throws Exception {__CLR4_5_21m2o1m2olusyju9j.R.globalSliceStart(getClass().getName(),75276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ssera51m30();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21m2o1m2olusyju9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_21m2o1m2olusyju9j.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.RectangleDeserializerTest.test_stack_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75276,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ssera51m30() throws Exception{try{__CLR4_5_21m2o1m2olusyju9j.R.inc(75276);
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75277);Exception error = null;
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75278);try {
            __CLR4_5_21m2o1m2olusyju9j.R.inc(75279);JSON.parseObject("{33:22}", Rectangle.class);
        } catch (JSONException ex) {
            __CLR4_5_21m2o1m2olusyju9j.R.inc(75280);error = ex;
        }
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75281);Assert.assertNotNull(error);
    }finally{__CLR4_5_21m2o1m2olusyju9j.R.flushNeeded();}}
    
    public void test_stack_error_2() throws Exception {__CLR4_5_21m2o1m2olusyju9j.R.globalSliceStart(getClass().getName(),75282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w1eq2m1m36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21m2o1m2olusyju9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_21m2o1m2olusyju9j.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.RectangleDeserializerTest.test_stack_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75282,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w1eq2m1m36() throws Exception{try{__CLR4_5_21m2o1m2olusyju9j.R.inc(75282);
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75283);Exception error = null;
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75284);try {
            __CLR4_5_21m2o1m2olusyju9j.R.inc(75285);JSON.parseObject("{\"name\":22}", Rectangle.class);
        } catch (JSONException ex) {
            __CLR4_5_21m2o1m2olusyju9j.R.inc(75286);error = ex;
        }
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75287);Assert.assertNotNull(error);
    }finally{__CLR4_5_21m2o1m2olusyju9j.R.flushNeeded();}}
    
    public void test_stack_error_3() throws Exception {__CLR4_5_21m2o1m2olusyju9j.R.globalSliceStart(getClass().getName(),75288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zaeov31m3c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21m2o1m2olusyju9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_21m2o1m2olusyju9j.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.RectangleDeserializerTest.test_stack_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75288,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zaeov31m3c() throws Exception{try{__CLR4_5_21m2o1m2olusyju9j.R.inc(75288);
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75289);Exception error = null;
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75290);try {
            __CLR4_5_21m2o1m2olusyju9j.R.inc(75291);JSON.parseObject("{\"style\":true}", Rectangle.class);
        } catch (JSONException ex) {
            __CLR4_5_21m2o1m2olusyju9j.R.inc(75292);error = ex;
        }
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75293);Assert.assertNotNull(error);
    }finally{__CLR4_5_21m2o1m2olusyju9j.R.flushNeeded();}}
    
    public void test_stack_error_4() throws Exception {__CLR4_5_21m2o1m2olusyju9j.R.globalSliceStart(getClass().getName(),75294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2whpebk1m3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21m2o1m2olusyju9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_21m2o1m2olusyju9j.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.RectangleDeserializerTest.test_stack_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75294,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2whpebk1m3i() throws Exception{try{__CLR4_5_21m2o1m2olusyju9j.R.inc(75294);
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75295);Exception error = null;
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75296);try {
            __CLR4_5_21m2o1m2olusyju9j.R.inc(75297);JSON.parseObject("{\"size\":\"33\"}", Rectangle.class);
        } catch (JSONException ex) {
            __CLR4_5_21m2o1m2olusyju9j.R.inc(75298);error = ex;
        }
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75299);Assert.assertNotNull(error);
    }finally{__CLR4_5_21m2o1m2olusyju9j.R.flushNeeded();}}
    
    public void test_stack_error_5() throws Exception {__CLR4_5_21m2o1m2olusyju9j.R.globalSliceStart(getClass().getName(),75300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t8pfj31m3o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21m2o1m2olusyju9j.R.rethrow($CLV_t2$);}finally{__CLR4_5_21m2o1m2olusyju9j.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.RectangleDeserializerTest.test_stack_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75300,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t8pfj31m3o() throws Exception{try{__CLR4_5_21m2o1m2olusyju9j.R.inc(75300);
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75301);Exception error = null;
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75302);try {
            __CLR4_5_21m2o1m2olusyju9j.R.inc(75303);JSON.parseObject("{\"xxx\":22}", Font.class);
        } catch (JSONException ex) {
            __CLR4_5_21m2o1m2olusyju9j.R.inc(75304);error = ex;
        }
        __CLR4_5_21m2o1m2olusyju9j.R.inc(75305);Assert.assertNotNull(error);
    }finally{__CLR4_5_21m2o1m2olusyju9j.R.flushNeeded();}}
    
    public static class VO {

        private Rectangle value;

        public Rectangle getValue() {try{__CLR4_5_21m2o1m2olusyju9j.R.inc(75306);
            __CLR4_5_21m2o1m2olusyju9j.R.inc(75307);return value;
        }finally{__CLR4_5_21m2o1m2olusyju9j.R.flushNeeded();}}

        public void setValue(Rectangle value) {try{__CLR4_5_21m2o1m2olusyju9j.R.inc(75308);
            __CLR4_5_21m2o1m2olusyju9j.R.inc(75309);this.value = value;
        }finally{__CLR4_5_21m2o1m2olusyju9j.R.flushNeeded();}}

    }
}
