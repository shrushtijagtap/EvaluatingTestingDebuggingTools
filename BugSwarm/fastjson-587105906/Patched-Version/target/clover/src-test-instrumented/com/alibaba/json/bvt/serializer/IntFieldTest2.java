/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringReader;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class IntFieldTest2 extends TestCase {static class __CLR4_5_21sb41sb4lusvng7l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,83385,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_model() throws Exception {__CLR4_5_21sb41sb4lusvng7l.R.globalSliceStart(getClass().getName(),83344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ic1ber1sb4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sb41sb4lusvng7l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sb41sb4lusvng7l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.IntFieldTest2.test_model",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83344,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ic1ber1sb4() throws Exception{try{__CLR4_5_21sb41sb4lusvng7l.R.inc(83344);
        __CLR4_5_21sb41sb4lusvng7l.R.inc(83345);Model model = new Model();
        __CLR4_5_21sb41sb4lusvng7l.R.inc(83346);model.id = -1001;
        __CLR4_5_21sb41sb4lusvng7l.R.inc(83347);model.id2 = -1002;

        __CLR4_5_21sb41sb4lusvng7l.R.inc(83348);String text = JSON.toJSONString(model);
        __CLR4_5_21sb41sb4lusvng7l.R.inc(83349);Assert.assertEquals("{\"id\":-1001,\"id2\":-1002}", text);
    }finally{__CLR4_5_21sb41sb4lusvng7l.R.flushNeeded();}}

    public void test_model_max() throws Exception {__CLR4_5_21sb41sb4lusvng7l.R.globalSliceStart(getClass().getName(),83350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2myxb7s1sba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sb41sb4lusvng7l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sb41sb4lusvng7l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.IntFieldTest2.test_model_max",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83350,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2myxb7s1sba() throws Exception{try{__CLR4_5_21sb41sb4lusvng7l.R.inc(83350);
        __CLR4_5_21sb41sb4lusvng7l.R.inc(83351);Model model = new Model();
        __CLR4_5_21sb41sb4lusvng7l.R.inc(83352);model.id = Integer.MIN_VALUE;
        __CLR4_5_21sb41sb4lusvng7l.R.inc(83353);model.id2 = Integer.MAX_VALUE;

        __CLR4_5_21sb41sb4lusvng7l.R.inc(83354);String text = JSON.toJSONString(model);
        __CLR4_5_21sb41sb4lusvng7l.R.inc(83355);Assert.assertEquals("{\"id\":-2147483648,\"id2\":2147483647}", text);
        {
            __CLR4_5_21sb41sb4lusvng7l.R.inc(83356);JSONReader reader = new JSONReader(new StringReader(text));
            __CLR4_5_21sb41sb4lusvng7l.R.inc(83357);Model model2 = reader.readObject(Model.class);
            __CLR4_5_21sb41sb4lusvng7l.R.inc(83358);Assert.assertEquals(model.id, model2.id);
            __CLR4_5_21sb41sb4lusvng7l.R.inc(83359);Assert.assertEquals(model.id2, model2.id2);
            __CLR4_5_21sb41sb4lusvng7l.R.inc(83360);reader.close();
        }
    }finally{__CLR4_5_21sb41sb4lusvng7l.R.flushNeeded();}}

    public void test_model_map() throws Exception {__CLR4_5_21sb41sb4lusvng7l.R.globalSliceStart(getClass().getName(),83361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2312f401sbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sb41sb4lusvng7l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sb41sb4lusvng7l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.IntFieldTest2.test_model_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83361,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2312f401sbl() throws Exception{try{__CLR4_5_21sb41sb4lusvng7l.R.inc(83361);
        __CLR4_5_21sb41sb4lusvng7l.R.inc(83362);String text = "{\"model\":{\"id\":-1001,\"id2\":-1002}}";

        __CLR4_5_21sb41sb4lusvng7l.R.inc(83363);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21sb41sb4lusvng7l.R.inc(83364);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_5_21sb41sb4lusvng7l.R.inc(83365);Model model2 = map.get("model");
        __CLR4_5_21sb41sb4lusvng7l.R.inc(83366);Assert.assertEquals(-1001, model2.id);
        __CLR4_5_21sb41sb4lusvng7l.R.inc(83367);Assert.assertEquals(-1002, model2.id2);
        __CLR4_5_21sb41sb4lusvng7l.R.inc(83368);reader.close();
    }finally{__CLR4_5_21sb41sb4lusvng7l.R.flushNeeded();}}

    public void test_model_map_error() throws Exception {__CLR4_5_21sb41sb4lusvng7l.R.globalSliceStart(getClass().getName(),83369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sx4i7d1sbt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sb41sb4lusvng7l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sb41sb4lusvng7l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.IntFieldTest2.test_model_map_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83369,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sx4i7d1sbt() throws Exception{try{__CLR4_5_21sb41sb4lusvng7l.R.inc(83369);
        __CLR4_5_21sb41sb4lusvng7l.R.inc(83370);String text = "{\"model\":{\"id\":-1001,\"id2\":-1002[";

        __CLR4_5_21sb41sb4lusvng7l.R.inc(83371);Exception error = null;
        __CLR4_5_21sb41sb4lusvng7l.R.inc(83372);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21sb41sb4lusvng7l.R.inc(83373);try {
            __CLR4_5_21sb41sb4lusvng7l.R.inc(83374);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21sb41sb4lusvng7l.R.inc(83375);error = ex;
        }
        __CLR4_5_21sb41sb4lusvng7l.R.inc(83376);Assert.assertNotNull(error);
    }finally{__CLR4_5_21sb41sb4lusvng7l.R.flushNeeded();}}
    
    public void test_model_map_error_2() throws Exception {__CLR4_5_21sb41sb4lusvng7l.R.globalSliceStart(getClass().getName(),83377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qm0r981sc1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sb41sb4lusvng7l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sb41sb4lusvng7l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.IntFieldTest2.test_model_map_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83377,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qm0r981sc1() throws Exception{try{__CLR4_5_21sb41sb4lusvng7l.R.inc(83377);
        __CLR4_5_21sb41sb4lusvng7l.R.inc(83378);String text = "{\"model\":{\"id\":-1001,\"id2\":-1002}[";

        __CLR4_5_21sb41sb4lusvng7l.R.inc(83379);Exception error = null;
        __CLR4_5_21sb41sb4lusvng7l.R.inc(83380);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21sb41sb4lusvng7l.R.inc(83381);try {
            __CLR4_5_21sb41sb4lusvng7l.R.inc(83382);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21sb41sb4lusvng7l.R.inc(83383);error = ex;
        }
        __CLR4_5_21sb41sb4lusvng7l.R.inc(83384);Assert.assertNotNull(error);
    }finally{__CLR4_5_21sb41sb4lusvng7l.R.flushNeeded();}}

    public static class Model {

        public int id;
        public int id2;
    }
}
