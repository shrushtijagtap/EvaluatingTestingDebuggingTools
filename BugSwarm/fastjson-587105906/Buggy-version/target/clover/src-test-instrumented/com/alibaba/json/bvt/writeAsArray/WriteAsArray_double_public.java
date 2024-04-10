/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.writeAsArray;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class WriteAsArray_double_public extends TestCase {static class __CLR4_1_101z871z87luszwgex{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,92346,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0 () throws Exception {__CLR4_1_101z871z87luszwgex.R.globalSliceStart(getClass().getName(),92311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21z87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101z871z87luszwgex.R.rethrow($CLV_t2$);}finally{__CLR4_1_101z871z87luszwgex.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_double_public.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92311,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21z87() throws Exception{try{__CLR4_1_101z871z87luszwgex.R.inc(92311);
        __CLR4_1_101z871z87luszwgex.R.inc(92312);VO vo = new VO();
        __CLR4_1_101z871z87luszwgex.R.inc(92313);vo.setId(123D);
        __CLR4_1_101z871z87luszwgex.R.inc(92314);vo.setName("wenshao");
        
        __CLR4_1_101z871z87luszwgex.R.inc(92315);String text = JSON.toJSONString(vo, SerializerFeature.BeanToArray);
        __CLR4_1_101z871z87luszwgex.R.inc(92316);Assert.assertEquals("[123.0,\"wenshao\"]", text);
        
        __CLR4_1_101z871z87luszwgex.R.inc(92317);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_1_101z871z87luszwgex.R.inc(92318);Assert.assertTrue(vo.id == vo2.id);
        __CLR4_1_101z871z87luszwgex.R.inc(92319);Assert.assertEquals(vo.name, vo2.name);
    }finally{__CLR4_1_101z871z87luszwgex.R.flushNeeded();}}
    
    public void test_error() throws Exception {__CLR4_1_101z871z87luszwgex.R.globalSliceStart(getClass().getName(),92320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1z8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101z871z87luszwgex.R.rethrow($CLV_t2$);}finally{__CLR4_1_101z871z87luszwgex.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_double_public.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92320,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1z8g() throws Exception{try{__CLR4_1_101z871z87luszwgex.R.inc(92320);
        __CLR4_1_101z871z87luszwgex.R.inc(92321);Exception error = null;
        __CLR4_1_101z871z87luszwgex.R.inc(92322);try {
            __CLR4_1_101z871z87luszwgex.R.inc(92323);JSON.parseObject("[123.A,\"wenshao\"]", VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101z871z87luszwgex.R.inc(92324);error = ex;
        }
        __CLR4_1_101z871z87luszwgex.R.inc(92325);Assert.assertNotNull(error);
    }finally{__CLR4_1_101z871z87luszwgex.R.flushNeeded();}}
    
    public void test_error1() throws Exception {__CLR4_1_101z871z87luszwgex.R.globalSliceStart(getClass().getName(),92326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1084g0lf1z8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101z871z87luszwgex.R.rethrow($CLV_t2$);}finally{__CLR4_1_101z871z87luszwgex.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_double_public.test_error1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92326,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1084g0lf1z8m() throws Exception{try{__CLR4_1_101z871z87luszwgex.R.inc(92326);
        __CLR4_1_101z871z87luszwgex.R.inc(92327);Exception error = null;
        __CLR4_1_101z871z87luszwgex.R.inc(92328);try {
            __CLR4_1_101z871z87luszwgex.R.inc(92329);JSON.parseObject("[\"A\",\"wenshao\"]", VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101z871z87luszwgex.R.inc(92330);error = ex;
        }
        __CLR4_1_101z871z87luszwgex.R.inc(92331);Assert.assertNotNull(error);
    }finally{__CLR4_1_101z871z87luszwgex.R.flushNeeded();}}
    
    public void test_error2() throws Exception {__CLR4_1_101z871z87luszwgex.R.globalSliceStart(getClass().getName(),92332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104vg1sy1z8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101z871z87luszwgex.R.rethrow($CLV_t2$);}finally{__CLR4_1_101z871z87luszwgex.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_double_public.test_error2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92332,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104vg1sy1z8s() throws Exception{try{__CLR4_1_101z871z87luszwgex.R.inc(92332);
        __CLR4_1_101z871z87luszwgex.R.inc(92333);Exception error = null;
        __CLR4_1_101z871z87luszwgex.R.inc(92334);try {
            __CLR4_1_101z871z87luszwgex.R.inc(92335);JSON.parseObject("[123:\"wenshao\"]", VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101z871z87luszwgex.R.inc(92336);error = ex;
        }
        __CLR4_1_101z871z87luszwgex.R.inc(92337);Assert.assertNotNull(error);
    }finally{__CLR4_1_101z871z87luszwgex.R.flushNeeded();}}
    
    private static class VO {
        private double id;
        private String name;

        public double getId() {try{__CLR4_1_101z871z87luszwgex.R.inc(92338);
            __CLR4_1_101z871z87luszwgex.R.inc(92339);return id;
        }finally{__CLR4_1_101z871z87luszwgex.R.flushNeeded();}}

        public void setId(double id) {try{__CLR4_1_101z871z87luszwgex.R.inc(92340);
            __CLR4_1_101z871z87luszwgex.R.inc(92341);this.id = id;
        }finally{__CLR4_1_101z871z87luszwgex.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101z871z87luszwgex.R.inc(92342);
            __CLR4_1_101z871z87luszwgex.R.inc(92343);return name;
        }finally{__CLR4_1_101z871z87luszwgex.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101z871z87luszwgex.R.inc(92344);
            __CLR4_1_101z871z87luszwgex.R.inc(92345);this.name = name;
        }finally{__CLR4_1_101z871z87luszwgex.R.flushNeeded();}}
    }
}
