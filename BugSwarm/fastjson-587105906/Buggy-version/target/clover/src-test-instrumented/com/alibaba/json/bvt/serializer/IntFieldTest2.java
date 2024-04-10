/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringReader;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class IntFieldTest2 extends TestCase {static class __CLR4_1_101sbf1sbfluszweym{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,83396,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_model() throws Exception {__CLR4_1_101sbf1sbfluszweym.R.globalSliceStart(getClass().getName(),83355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ic1ber1sbf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sbf1sbfluszweym.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sbf1sbfluszweym.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.IntFieldTest2.test_model",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83355,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ic1ber1sbf() throws Exception{try{__CLR4_1_101sbf1sbfluszweym.R.inc(83355);
        __CLR4_1_101sbf1sbfluszweym.R.inc(83356);Model model = new Model();
        __CLR4_1_101sbf1sbfluszweym.R.inc(83357);model.id = -1001;
        __CLR4_1_101sbf1sbfluszweym.R.inc(83358);model.id2 = -1002;

        __CLR4_1_101sbf1sbfluszweym.R.inc(83359);String text = JSON.toJSONString(model);
        __CLR4_1_101sbf1sbfluszweym.R.inc(83360);Assert.assertEquals("{\"id\":-1001,\"id2\":-1002}", text);
    }finally{__CLR4_1_101sbf1sbfluszweym.R.flushNeeded();}}

    public void test_model_max() throws Exception {__CLR4_1_101sbf1sbfluszweym.R.globalSliceStart(getClass().getName(),83361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10myxb7s1sbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sbf1sbfluszweym.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sbf1sbfluszweym.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.IntFieldTest2.test_model_max",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83361,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10myxb7s1sbl() throws Exception{try{__CLR4_1_101sbf1sbfluszweym.R.inc(83361);
        __CLR4_1_101sbf1sbfluszweym.R.inc(83362);Model model = new Model();
        __CLR4_1_101sbf1sbfluszweym.R.inc(83363);model.id = Integer.MIN_VALUE;
        __CLR4_1_101sbf1sbfluszweym.R.inc(83364);model.id2 = Integer.MAX_VALUE;

        __CLR4_1_101sbf1sbfluszweym.R.inc(83365);String text = JSON.toJSONString(model);
        __CLR4_1_101sbf1sbfluszweym.R.inc(83366);Assert.assertEquals("{\"id\":-2147483648,\"id2\":2147483647}", text);
        {
            __CLR4_1_101sbf1sbfluszweym.R.inc(83367);JSONReader reader = new JSONReader(new StringReader(text));
            __CLR4_1_101sbf1sbfluszweym.R.inc(83368);Model model2 = reader.readObject(Model.class);
            __CLR4_1_101sbf1sbfluszweym.R.inc(83369);Assert.assertEquals(model.id, model2.id);
            __CLR4_1_101sbf1sbfluszweym.R.inc(83370);Assert.assertEquals(model.id2, model2.id2);
            __CLR4_1_101sbf1sbfluszweym.R.inc(83371);reader.close();
        }
    }finally{__CLR4_1_101sbf1sbfluszweym.R.flushNeeded();}}

    public void test_model_map() throws Exception {__CLR4_1_101sbf1sbfluszweym.R.globalSliceStart(getClass().getName(),83372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10312f401sbw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sbf1sbfluszweym.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sbf1sbfluszweym.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.IntFieldTest2.test_model_map",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83372,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10312f401sbw() throws Exception{try{__CLR4_1_101sbf1sbfluszweym.R.inc(83372);
        __CLR4_1_101sbf1sbfluszweym.R.inc(83373);String text = "{\"model\":{\"id\":-1001,\"id2\":-1002}}";

        __CLR4_1_101sbf1sbfluszweym.R.inc(83374);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101sbf1sbfluszweym.R.inc(83375);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_1_101sbf1sbfluszweym.R.inc(83376);Model model2 = map.get("model");
        __CLR4_1_101sbf1sbfluszweym.R.inc(83377);Assert.assertEquals(-1001, model2.id);
        __CLR4_1_101sbf1sbfluszweym.R.inc(83378);Assert.assertEquals(-1002, model2.id2);
        __CLR4_1_101sbf1sbfluszweym.R.inc(83379);reader.close();
    }finally{__CLR4_1_101sbf1sbfluszweym.R.flushNeeded();}}

    public void test_model_map_error() throws Exception {__CLR4_1_101sbf1sbfluszweym.R.globalSliceStart(getClass().getName(),83380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10sx4i7d1sc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sbf1sbfluszweym.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sbf1sbfluszweym.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.IntFieldTest2.test_model_map_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83380,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10sx4i7d1sc4() throws Exception{try{__CLR4_1_101sbf1sbfluszweym.R.inc(83380);
        __CLR4_1_101sbf1sbfluszweym.R.inc(83381);String text = "{\"model\":{\"id\":-1001,\"id2\":-1002[";

        __CLR4_1_101sbf1sbfluszweym.R.inc(83382);Exception error = null;
        __CLR4_1_101sbf1sbfluszweym.R.inc(83383);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101sbf1sbfluszweym.R.inc(83384);try {
            __CLR4_1_101sbf1sbfluszweym.R.inc(83385);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101sbf1sbfluszweym.R.inc(83386);error = ex;
        }
        __CLR4_1_101sbf1sbfluszweym.R.inc(83387);Assert.assertNotNull(error);
    }finally{__CLR4_1_101sbf1sbfluszweym.R.flushNeeded();}}
    
    public void test_model_map_error_2() throws Exception {__CLR4_1_101sbf1sbfluszweym.R.globalSliceStart(getClass().getName(),83388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qm0r981scc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sbf1sbfluszweym.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sbf1sbfluszweym.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.IntFieldTest2.test_model_map_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83388,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qm0r981scc() throws Exception{try{__CLR4_1_101sbf1sbfluszweym.R.inc(83388);
        __CLR4_1_101sbf1sbfluszweym.R.inc(83389);String text = "{\"model\":{\"id\":-1001,\"id2\":-1002}[";

        __CLR4_1_101sbf1sbfluszweym.R.inc(83390);Exception error = null;
        __CLR4_1_101sbf1sbfluszweym.R.inc(83391);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101sbf1sbfluszweym.R.inc(83392);try {
            __CLR4_1_101sbf1sbfluszweym.R.inc(83393);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101sbf1sbfluszweym.R.inc(83394);error = ex;
        }
        __CLR4_1_101sbf1sbfluszweym.R.inc(83395);Assert.assertNotNull(error);
    }finally{__CLR4_1_101sbf1sbfluszweym.R.flushNeeded();}}

    public static class Model {

        public int id;
        public int id2;
    }
}
