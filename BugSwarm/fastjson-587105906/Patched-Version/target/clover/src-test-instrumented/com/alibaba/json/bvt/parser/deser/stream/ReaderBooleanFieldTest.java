/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.stream;

import java.io.StringReader;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ReaderBooleanFieldTest extends TestCase {static class __CLR4_5_21oa51oa5lusvnexk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,78194,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_bool_error_0() throws Exception {__CLR4_5_21oa51oa5lusvnexk.R.globalSliceStart(getClass().getName(),78125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ngv3e01oa5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa51oa5lusvnexk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa51oa5lusvnexk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78125,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ngv3e01oa5() throws Exception{try{__CLR4_5_21oa51oa5lusvnexk.R.inc(78125);
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78126);Exception error = null;
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78127);try {
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78128);JSONReader reader = new JSONReader(new StringReader("{\"value\":t}"));
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78129);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78130);error = ex;
        }
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78131);Assert.assertNotNull(error);
    }finally{__CLR4_5_21oa51oa5lusvnexk.R.flushNeeded();}}

    public void test_bool_error_1() throws Exception {__CLR4_5_21oa51oa5lusvnexk.R.globalSliceStart(getClass().getName(),78132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k7v4lj1oac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa51oa5lusvnexk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa51oa5lusvnexk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78132,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k7v4lj1oac() throws Exception{try{__CLR4_5_21oa51oa5lusvnexk.R.inc(78132);
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78133);Exception error = null;
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78134);try {
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78135);JSONReader reader = new JSONReader(new StringReader("{\"value\":tr}"));
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78136);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78137);error = ex;
        }
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78138);Assert.assertNotNull(error);
    }finally{__CLR4_5_21oa51oa5lusvnexk.R.flushNeeded();}}

    public void test_bool_error_2() throws Exception {__CLR4_5_21oa51oa5lusvnexk.R.globalSliceStart(getClass().getName(),78139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gyv5t21oaj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa51oa5lusvnexk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa51oa5lusvnexk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78139,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gyv5t21oaj() throws Exception{try{__CLR4_5_21oa51oa5lusvnexk.R.inc(78139);
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78140);Exception error = null;
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78141);try {
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78142);JSONReader reader = new JSONReader(new StringReader("{\"value\":tru}"));
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78143);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78144);error = ex;
        }
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78145);Assert.assertNotNull(error);
    }finally{__CLR4_5_21oa51oa5lusvnexk.R.flushNeeded();}}

    public void test_bool_error_f0() throws Exception {__CLR4_5_21oa51oa5lusvnexk.R.globalSliceStart(getClass().getName(),78146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29ufieo1oaq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa51oa5lusvnexk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa51oa5lusvnexk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_f0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78146,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29ufieo1oaq() throws Exception{try{__CLR4_5_21oa51oa5lusvnexk.R.inc(78146);
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78147);Exception error = null;
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78148);try {
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78149);JSONReader reader = new JSONReader(new StringReader("{\"value\":f}"));
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78150);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78151);error = ex;
        }
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78152);Assert.assertNotNull(error);
    }finally{__CLR4_5_21oa51oa5lusvnexk.R.flushNeeded();}}

    public void test_bool_error_f1() throws Exception {__CLR4_5_21oa51oa5lusvnexk.R.globalSliceStart(getClass().getName(),78153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26lfjm71oax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa51oa5lusvnexk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa51oa5lusvnexk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_f1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78153,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26lfjm71oax() throws Exception{try{__CLR4_5_21oa51oa5lusvnexk.R.inc(78153);
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78154);Exception error = null;
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78155);try {
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78156);JSONReader reader = new JSONReader(new StringReader("{\"value\":fa}"));
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78157);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78158);error = ex;
        }
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78159);Assert.assertNotNull(error);
    }finally{__CLR4_5_21oa51oa5lusvnexk.R.flushNeeded();}}

    public void test_bool_error_f2() throws Exception {__CLR4_5_21oa51oa5lusvnexk.R.globalSliceStart(getClass().getName(),78160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23cfktq1ob4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa51oa5lusvnexk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa51oa5lusvnexk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_f2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78160,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23cfktq1ob4() throws Exception{try{__CLR4_5_21oa51oa5lusvnexk.R.inc(78160);
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78161);Exception error = null;
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78162);try {
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78163);JSONReader reader = new JSONReader(new StringReader("{\"value\":fal}"));
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78164);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78165);error = ex;
        }
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78166);Assert.assertNotNull(error);
    }finally{__CLR4_5_21oa51oa5lusvnexk.R.flushNeeded();}}

    public void test_bool_error_f3() throws Exception {__CLR4_5_21oa51oa5lusvnexk.R.globalSliceStart(getClass().getName(),78167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23fm191obb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa51oa5lusvnexk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa51oa5lusvnexk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_f3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78167,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23fm191obb() throws Exception{try{__CLR4_5_21oa51oa5lusvnexk.R.inc(78167);
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78168);Exception error = null;
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78169);try {
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78170);JSONReader reader = new JSONReader(new StringReader("{\"value\":fals}"));
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78171);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78172);error = ex;
        }
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78173);Assert.assertNotNull(error);
    }finally{__CLR4_5_21oa51oa5lusvnexk.R.flushNeeded();}}

    public void test_bool_normal() throws Exception {__CLR4_5_21oa51oa5lusvnexk.R.globalSliceStart(getClass().getName(),78174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tkik8a1obi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa51oa5lusvnexk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa51oa5lusvnexk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_normal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78174,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tkik8a1obi() throws Exception{try{__CLR4_5_21oa51oa5lusvnexk.R.inc(78174);
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78175);JSONReader reader = new JSONReader(new StringReader("{\"value\":false,\"value2\":true}"));
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78176);Model model = reader.readObject(Model.class);
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78177);Assert.assertFalse(model.value);
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78178);Assert.assertTrue(model.value2);
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78179);reader.close();
    }finally{__CLR4_5_21oa51oa5lusvnexk.R.flushNeeded();}}
    
    public void test_bool_normal_2() throws Exception {__CLR4_5_21oa51oa5lusvnexk.R.globalSliceStart(getClass().getName(),78180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_235c6951obo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa51oa5lusvnexk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa51oa5lusvnexk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_normal_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78180,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_235c6951obo() throws Exception{try{__CLR4_5_21oa51oa5lusvnexk.R.inc(78180);
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78181);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"value\":false,\"value2\":true}}"));
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78182);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {});
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78183);Model model = map.get("model");
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78184);Assert.assertFalse(model.value);
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78185);Assert.assertTrue(model.value2);
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78186);reader.close();
    }finally{__CLR4_5_21oa51oa5lusvnexk.R.flushNeeded();}}
    
    public void test_bool_error_map() throws Exception {__CLR4_5_21oa51oa5lusvnexk.R.globalSliceStart(getClass().getName(),78187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uqzq101obv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oa51oa5lusvnexk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oa51oa5lusvnexk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78187,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uqzq101obv() throws Exception{try{__CLR4_5_21oa51oa5lusvnexk.R.inc(78187);
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78188);Exception error = null;
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78189);try {
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78190);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"value\":false,\"value2\":true}["));
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78191);reader.readObject(new TypeReference<Map<String, Model>>() {});
        } catch (JSONException ex) {
            __CLR4_5_21oa51oa5lusvnexk.R.inc(78192);error = ex;
        }
        __CLR4_5_21oa51oa5lusvnexk.R.inc(78193);Assert.assertNotNull(error);
    }finally{__CLR4_5_21oa51oa5lusvnexk.R.flushNeeded();}}

    private static class Model {

        public boolean value;
        public boolean value2;
    }
}
