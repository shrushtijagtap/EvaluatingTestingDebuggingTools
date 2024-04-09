/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.writeAsArray;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class WriteAsArray_double_public extends TestCase {static class __CLR4_5_21z7w1z7wlusvni6q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,92335,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0 () throws Exception {__CLR4_5_21z7w1z7wlusvni6q.R.globalSliceStart(getClass().getName(),92300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21z7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21z7w1z7wlusvni6q.R.rethrow($CLV_t2$);}finally{__CLR4_5_21z7w1z7wlusvni6q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_double_public.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92300,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21z7w() throws Exception{try{__CLR4_5_21z7w1z7wlusvni6q.R.inc(92300);
        __CLR4_5_21z7w1z7wlusvni6q.R.inc(92301);VO vo = new VO();
        __CLR4_5_21z7w1z7wlusvni6q.R.inc(92302);vo.setId(123D);
        __CLR4_5_21z7w1z7wlusvni6q.R.inc(92303);vo.setName("wenshao");
        
        __CLR4_5_21z7w1z7wlusvni6q.R.inc(92304);String text = JSON.toJSONString(vo, SerializerFeature.BeanToArray);
        __CLR4_5_21z7w1z7wlusvni6q.R.inc(92305);Assert.assertEquals("[123.0,\"wenshao\"]", text);
        
        __CLR4_5_21z7w1z7wlusvni6q.R.inc(92306);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_5_21z7w1z7wlusvni6q.R.inc(92307);Assert.assertTrue(vo.id == vo2.id);
        __CLR4_5_21z7w1z7wlusvni6q.R.inc(92308);Assert.assertEquals(vo.name, vo2.name);
    }finally{__CLR4_5_21z7w1z7wlusvni6q.R.flushNeeded();}}
    
    public void test_error() throws Exception {__CLR4_5_21z7w1z7wlusvni6q.R.globalSliceStart(getClass().getName(),92309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1z85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21z7w1z7wlusvni6q.R.rethrow($CLV_t2$);}finally{__CLR4_5_21z7w1z7wlusvni6q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_double_public.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92309,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1z85() throws Exception{try{__CLR4_5_21z7w1z7wlusvni6q.R.inc(92309);
        __CLR4_5_21z7w1z7wlusvni6q.R.inc(92310);Exception error = null;
        __CLR4_5_21z7w1z7wlusvni6q.R.inc(92311);try {
            __CLR4_5_21z7w1z7wlusvni6q.R.inc(92312);JSON.parseObject("[123.A,\"wenshao\"]", VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21z7w1z7wlusvni6q.R.inc(92313);error = ex;
        }
        __CLR4_5_21z7w1z7wlusvni6q.R.inc(92314);Assert.assertNotNull(error);
    }finally{__CLR4_5_21z7w1z7wlusvni6q.R.flushNeeded();}}
    
    public void test_error1() throws Exception {__CLR4_5_21z7w1z7wlusvni6q.R.globalSliceStart(getClass().getName(),92315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_284g0lf1z8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21z7w1z7wlusvni6q.R.rethrow($CLV_t2$);}finally{__CLR4_5_21z7w1z7wlusvni6q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_double_public.test_error1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92315,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_284g0lf1z8b() throws Exception{try{__CLR4_5_21z7w1z7wlusvni6q.R.inc(92315);
        __CLR4_5_21z7w1z7wlusvni6q.R.inc(92316);Exception error = null;
        __CLR4_5_21z7w1z7wlusvni6q.R.inc(92317);try {
            __CLR4_5_21z7w1z7wlusvni6q.R.inc(92318);JSON.parseObject("[\"A\",\"wenshao\"]", VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21z7w1z7wlusvni6q.R.inc(92319);error = ex;
        }
        __CLR4_5_21z7w1z7wlusvni6q.R.inc(92320);Assert.assertNotNull(error);
    }finally{__CLR4_5_21z7w1z7wlusvni6q.R.flushNeeded();}}
    
    public void test_error2() throws Exception {__CLR4_5_21z7w1z7wlusvni6q.R.globalSliceStart(getClass().getName(),92321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24vg1sy1z8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21z7w1z7wlusvni6q.R.rethrow($CLV_t2$);}finally{__CLR4_5_21z7w1z7wlusvni6q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_double_public.test_error2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92321,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24vg1sy1z8h() throws Exception{try{__CLR4_5_21z7w1z7wlusvni6q.R.inc(92321);
        __CLR4_5_21z7w1z7wlusvni6q.R.inc(92322);Exception error = null;
        __CLR4_5_21z7w1z7wlusvni6q.R.inc(92323);try {
            __CLR4_5_21z7w1z7wlusvni6q.R.inc(92324);JSON.parseObject("[123:\"wenshao\"]", VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21z7w1z7wlusvni6q.R.inc(92325);error = ex;
        }
        __CLR4_5_21z7w1z7wlusvni6q.R.inc(92326);Assert.assertNotNull(error);
    }finally{__CLR4_5_21z7w1z7wlusvni6q.R.flushNeeded();}}
    
    private static class VO {
        private double id;
        private String name;

        public double getId() {try{__CLR4_5_21z7w1z7wlusvni6q.R.inc(92327);
            __CLR4_5_21z7w1z7wlusvni6q.R.inc(92328);return id;
        }finally{__CLR4_5_21z7w1z7wlusvni6q.R.flushNeeded();}}

        public void setId(double id) {try{__CLR4_5_21z7w1z7wlusvni6q.R.inc(92329);
            __CLR4_5_21z7w1z7wlusvni6q.R.inc(92330);this.id = id;
        }finally{__CLR4_5_21z7w1z7wlusvni6q.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21z7w1z7wlusvni6q.R.inc(92331);
            __CLR4_5_21z7w1z7wlusvni6q.R.inc(92332);return name;
        }finally{__CLR4_5_21z7w1z7wlusvni6q.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21z7w1z7wlusvni6q.R.inc(92333);
            __CLR4_5_21z7w1z7wlusvni6q.R.inc(92334);this.name = name;
        }finally{__CLR4_5_21z7w1z7wlusvni6q.R.flushNeeded();}}
    }
}
