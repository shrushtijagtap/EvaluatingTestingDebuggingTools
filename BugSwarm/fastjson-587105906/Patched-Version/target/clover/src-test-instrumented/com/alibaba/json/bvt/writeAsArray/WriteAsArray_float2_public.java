/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.writeAsArray;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class WriteAsArray_float2_public extends TestCase {static class __CLR4_5_21zab1zablusvni78{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,92422,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0 () throws Exception {__CLR4_5_21zab1zablusvni78.R.globalSliceStart(getClass().getName(),92387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21zab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zab1zablusvni78.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zab1zablusvni78.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_float2_public.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92387,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21zab() throws Exception{try{__CLR4_5_21zab1zablusvni78.R.inc(92387);
        __CLR4_5_21zab1zablusvni78.R.inc(92388);VO vo = new VO();
        __CLR4_5_21zab1zablusvni78.R.inc(92389);vo.setId(123F);
        __CLR4_5_21zab1zablusvni78.R.inc(92390);vo.setName("wenshao");
        
        __CLR4_5_21zab1zablusvni78.R.inc(92391);String text = JSON.toJSONString(vo, SerializerFeature.BeanToArray);
        __CLR4_5_21zab1zablusvni78.R.inc(92392);Assert.assertEquals("[123.0,\"wenshao\"]", text);
        
        __CLR4_5_21zab1zablusvni78.R.inc(92393);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_5_21zab1zablusvni78.R.inc(92394);Assert.assertTrue(vo.id == vo2.id);
        __CLR4_5_21zab1zablusvni78.R.inc(92395);Assert.assertEquals(vo.name, vo2.name);
    }finally{__CLR4_5_21zab1zablusvni78.R.flushNeeded();}}
    
    public void test_error() throws Exception {__CLR4_5_21zab1zablusvni78.R.globalSliceStart(getClass().getName(),92396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1zak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zab1zablusvni78.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zab1zablusvni78.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_float2_public.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92396,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1zak() throws Exception{try{__CLR4_5_21zab1zablusvni78.R.inc(92396);
        __CLR4_5_21zab1zablusvni78.R.inc(92397);Exception error = null;
        __CLR4_5_21zab1zablusvni78.R.inc(92398);try {
            __CLR4_5_21zab1zablusvni78.R.inc(92399);JSON.parseObject("[123.A,\"wenshao\"]", VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21zab1zablusvni78.R.inc(92400);error = ex;
        }
        __CLR4_5_21zab1zablusvni78.R.inc(92401);Assert.assertNotNull(error);
    }finally{__CLR4_5_21zab1zablusvni78.R.flushNeeded();}}
    
    public void test_error1() throws Exception {__CLR4_5_21zab1zablusvni78.R.globalSliceStart(getClass().getName(),92402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_284g0lf1zaq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zab1zablusvni78.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zab1zablusvni78.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_float2_public.test_error1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92402,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_284g0lf1zaq() throws Exception{try{__CLR4_5_21zab1zablusvni78.R.inc(92402);
        __CLR4_5_21zab1zablusvni78.R.inc(92403);Exception error = null;
        __CLR4_5_21zab1zablusvni78.R.inc(92404);try {
            __CLR4_5_21zab1zablusvni78.R.inc(92405);JSON.parseObject("[\"A\",\"wenshao\"]", VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21zab1zablusvni78.R.inc(92406);error = ex;
        }
        __CLR4_5_21zab1zablusvni78.R.inc(92407);Assert.assertNotNull(error);
    }finally{__CLR4_5_21zab1zablusvni78.R.flushNeeded();}}
    
    public void test_error2() throws Exception {__CLR4_5_21zab1zablusvni78.R.globalSliceStart(getClass().getName(),92408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24vg1sy1zaw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zab1zablusvni78.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zab1zablusvni78.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_float2_public.test_error2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92408,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24vg1sy1zaw() throws Exception{try{__CLR4_5_21zab1zablusvni78.R.inc(92408);
        __CLR4_5_21zab1zablusvni78.R.inc(92409);Exception error = null;
        __CLR4_5_21zab1zablusvni78.R.inc(92410);try {
            __CLR4_5_21zab1zablusvni78.R.inc(92411);JSON.parseObject("[123:\"wenshao\"]", VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21zab1zablusvni78.R.inc(92412);error = ex;
        }
        __CLR4_5_21zab1zablusvni78.R.inc(92413);Assert.assertNotNull(error);
    }finally{__CLR4_5_21zab1zablusvni78.R.flushNeeded();}}
    
    public static class VO {
        private float id;
        private String name;

        public float getId() {try{__CLR4_5_21zab1zablusvni78.R.inc(92414);
            __CLR4_5_21zab1zablusvni78.R.inc(92415);return id;
        }finally{__CLR4_5_21zab1zablusvni78.R.flushNeeded();}}

        public void setId(float id) {try{__CLR4_5_21zab1zablusvni78.R.inc(92416);
            __CLR4_5_21zab1zablusvni78.R.inc(92417);this.id = id;
        }finally{__CLR4_5_21zab1zablusvni78.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21zab1zablusvni78.R.inc(92418);
            __CLR4_5_21zab1zablusvni78.R.inc(92419);return name;
        }finally{__CLR4_5_21zab1zablusvni78.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21zab1zablusvni78.R.inc(92420);
            __CLR4_5_21zab1zablusvni78.R.inc(92421);this.name = name;
        }finally{__CLR4_5_21zab1zablusvni78.R.flushNeeded();}}
    }
}
