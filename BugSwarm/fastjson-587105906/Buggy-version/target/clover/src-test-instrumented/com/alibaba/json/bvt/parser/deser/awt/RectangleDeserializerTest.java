/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.awt;

import java.awt.Font;
import java.awt.Rectangle;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.serializer.AwtCodec;

import junit.framework.TestCase;


public class RectangleDeserializerTest extends TestCase {static class __CLR4_1_101m2z1m2zlusqkgox{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,75321,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0 () throws Exception {__CLR4_1_101m2z1m2zlusqkgox.R.globalSliceStart(getClass().getName(),75275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21m2z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101m2z1m2zlusqkgox.R.rethrow($CLV_t2$);}finally{__CLR4_1_101m2z1m2zlusqkgox.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.RectangleDeserializerTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75275,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21m2z() throws Exception{try{__CLR4_1_101m2z1m2zlusqkgox.R.inc(75275);
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75276);AwtCodec.instance.getFastMatchToken();
        
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75277);Assert.assertNull(JSON.parseObject("null", Rectangle.class));
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75278);Assert.assertNull(JSON.parseArray("null", Rectangle.class));
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75279);Assert.assertNull(JSON.parseArray("[null]", Rectangle.class).get(0));
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75280);Assert.assertNull(JSON.parseObject("{\"value\":null}", VO.class).getValue());
    }finally{__CLR4_1_101m2z1m2zlusqkgox.R.flushNeeded();}}
    
    public void test_stack_error_0() throws Exception {__CLR4_1_101m2z1m2zlusqkgox.R.globalSliceStart(getClass().getName(),75281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pjesho1m35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101m2z1m2zlusqkgox.R.rethrow($CLV_t2$);}finally{__CLR4_1_101m2z1m2zlusqkgox.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.RectangleDeserializerTest.test_stack_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75281,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pjesho1m35() throws Exception{try{__CLR4_1_101m2z1m2zlusqkgox.R.inc(75281);
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75282);Exception error = null;
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75283);try {
            __CLR4_1_101m2z1m2zlusqkgox.R.inc(75284);JSON.parseObject("[]", Rectangle.class);
        } catch (JSONException ex) {
            __CLR4_1_101m2z1m2zlusqkgox.R.inc(75285);error = ex;
        }
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75286);Assert.assertNotNull(error);
    }finally{__CLR4_1_101m2z1m2zlusqkgox.R.flushNeeded();}}
    
    public void test_stack_error_1() throws Exception {__CLR4_1_101m2z1m2zlusqkgox.R.globalSliceStart(getClass().getName(),75287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ssera51m3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101m2z1m2zlusqkgox.R.rethrow($CLV_t2$);}finally{__CLR4_1_101m2z1m2zlusqkgox.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.RectangleDeserializerTest.test_stack_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75287,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ssera51m3b() throws Exception{try{__CLR4_1_101m2z1m2zlusqkgox.R.inc(75287);
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75288);Exception error = null;
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75289);try {
            __CLR4_1_101m2z1m2zlusqkgox.R.inc(75290);JSON.parseObject("{33:22}", Rectangle.class);
        } catch (JSONException ex) {
            __CLR4_1_101m2z1m2zlusqkgox.R.inc(75291);error = ex;
        }
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75292);Assert.assertNotNull(error);
    }finally{__CLR4_1_101m2z1m2zlusqkgox.R.flushNeeded();}}
    
    public void test_stack_error_2() throws Exception {__CLR4_1_101m2z1m2zlusqkgox.R.globalSliceStart(getClass().getName(),75293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10w1eq2m1m3h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101m2z1m2zlusqkgox.R.rethrow($CLV_t2$);}finally{__CLR4_1_101m2z1m2zlusqkgox.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.RectangleDeserializerTest.test_stack_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75293,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10w1eq2m1m3h() throws Exception{try{__CLR4_1_101m2z1m2zlusqkgox.R.inc(75293);
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75294);Exception error = null;
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75295);try {
            __CLR4_1_101m2z1m2zlusqkgox.R.inc(75296);JSON.parseObject("{\"name\":22}", Rectangle.class);
        } catch (JSONException ex) {
            __CLR4_1_101m2z1m2zlusqkgox.R.inc(75297);error = ex;
        }
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75298);Assert.assertNotNull(error);
    }finally{__CLR4_1_101m2z1m2zlusqkgox.R.flushNeeded();}}
    
    public void test_stack_error_3() throws Exception {__CLR4_1_101m2z1m2zlusqkgox.R.globalSliceStart(getClass().getName(),75299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zaeov31m3n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101m2z1m2zlusqkgox.R.rethrow($CLV_t2$);}finally{__CLR4_1_101m2z1m2zlusqkgox.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.RectangleDeserializerTest.test_stack_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75299,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zaeov31m3n() throws Exception{try{__CLR4_1_101m2z1m2zlusqkgox.R.inc(75299);
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75300);Exception error = null;
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75301);try {
            __CLR4_1_101m2z1m2zlusqkgox.R.inc(75302);JSON.parseObject("{\"style\":true}", Rectangle.class);
        } catch (JSONException ex) {
            __CLR4_1_101m2z1m2zlusqkgox.R.inc(75303);error = ex;
        }
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75304);Assert.assertNotNull(error);
    }finally{__CLR4_1_101m2z1m2zlusqkgox.R.flushNeeded();}}
    
    public void test_stack_error_4() throws Exception {__CLR4_1_101m2z1m2zlusqkgox.R.globalSliceStart(getClass().getName(),75305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10whpebk1m3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101m2z1m2zlusqkgox.R.rethrow($CLV_t2$);}finally{__CLR4_1_101m2z1m2zlusqkgox.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.RectangleDeserializerTest.test_stack_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75305,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10whpebk1m3t() throws Exception{try{__CLR4_1_101m2z1m2zlusqkgox.R.inc(75305);
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75306);Exception error = null;
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75307);try {
            __CLR4_1_101m2z1m2zlusqkgox.R.inc(75308);JSON.parseObject("{\"size\":\"33\"}", Rectangle.class);
        } catch (JSONException ex) {
            __CLR4_1_101m2z1m2zlusqkgox.R.inc(75309);error = ex;
        }
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75310);Assert.assertNotNull(error);
    }finally{__CLR4_1_101m2z1m2zlusqkgox.R.flushNeeded();}}
    
    public void test_stack_error_5() throws Exception {__CLR4_1_101m2z1m2zlusqkgox.R.globalSliceStart(getClass().getName(),75311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10t8pfj31m3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101m2z1m2zlusqkgox.R.rethrow($CLV_t2$);}finally{__CLR4_1_101m2z1m2zlusqkgox.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.awt.RectangleDeserializerTest.test_stack_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75311,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10t8pfj31m3z() throws Exception{try{__CLR4_1_101m2z1m2zlusqkgox.R.inc(75311);
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75312);Exception error = null;
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75313);try {
            __CLR4_1_101m2z1m2zlusqkgox.R.inc(75314);JSON.parseObject("{\"xxx\":22}", Font.class);
        } catch (JSONException ex) {
            __CLR4_1_101m2z1m2zlusqkgox.R.inc(75315);error = ex;
        }
        __CLR4_1_101m2z1m2zlusqkgox.R.inc(75316);Assert.assertNotNull(error);
    }finally{__CLR4_1_101m2z1m2zlusqkgox.R.flushNeeded();}}
    
    public static class VO {

        private Rectangle value;

        public Rectangle getValue() {try{__CLR4_1_101m2z1m2zlusqkgox.R.inc(75317);
            __CLR4_1_101m2z1m2zlusqkgox.R.inc(75318);return value;
        }finally{__CLR4_1_101m2z1m2zlusqkgox.R.flushNeeded();}}

        public void setValue(Rectangle value) {try{__CLR4_1_101m2z1m2zlusqkgox.R.inc(75319);
            __CLR4_1_101m2z1m2zlusqkgox.R.inc(75320);this.value = value;
        }finally{__CLR4_1_101m2z1m2zlusqkgox.R.flushNeeded();}}

    }
}
