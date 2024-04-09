/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.stream;

import java.io.StringReader;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ReaderLongFieldTest extends TestCase {static class __CLR4_5_21ods1odslusvney0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,78311,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_long_error_0() throws Exception {__CLR4_5_21ods1odslusvney0.R.globalSliceStart(getClass().getName(),78256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2crwdxy1ods();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ods1odslusvney0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ods1odslusvney0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78256,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2crwdxy1ods() throws Exception{try{__CLR4_5_21ods1odslusvney0.R.inc(78256);
        __CLR4_5_21ods1odslusvney0.R.inc(78257);Exception error = null;
        __CLR4_5_21ods1odslusvney0.R.inc(78258);try {
            __CLR4_5_21ods1odslusvney0.R.inc(78259);JSONReader reader = new JSONReader(new StringReader("{\"value\":1.A}"));
            __CLR4_5_21ods1odslusvney0.R.inc(78260);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ods1odslusvney0.R.inc(78261);error = ex;
        }
        __CLR4_5_21ods1odslusvney0.R.inc(78262);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ods1odslusvney0.R.flushNeeded();}}

    public void test_long_error_1() throws Exception {__CLR4_5_21ods1odslusvney0.R.globalSliceStart(getClass().getName(),78263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29iwf5h1odz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ods1odslusvney0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ods1odslusvney0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78263,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29iwf5h1odz() throws Exception{try{__CLR4_5_21ods1odslusvney0.R.inc(78263);
        __CLR4_5_21ods1odslusvney0.R.inc(78264);Exception error = null;
        __CLR4_5_21ods1odslusvney0.R.inc(78265);try {
            __CLR4_5_21ods1odslusvney0.R.inc(78266);JSONReader reader = new JSONReader(new StringReader("{\"value\":9223372036854775808}"));
            __CLR4_5_21ods1odslusvney0.R.inc(78267);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ods1odslusvney0.R.inc(78268);error = ex;
        }
        __CLR4_5_21ods1odslusvney0.R.inc(78269);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ods1odslusvney0.R.flushNeeded();}}
    
    public void test_long_error_1_x() throws Exception {__CLR4_5_21ods1odslusvney0.R.globalSliceStart(getClass().getName(),78270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vagc9w1oe6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ods1odslusvney0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ods1odslusvney0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_1_x",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78270,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vagc9w1oe6() throws Exception{try{__CLR4_5_21ods1odslusvney0.R.inc(78270);
        __CLR4_5_21ods1odslusvney0.R.inc(78271);Exception error = null;
        __CLR4_5_21ods1odslusvney0.R.inc(78272);try {
            __CLR4_5_21ods1odslusvney0.R.inc(78273);JSONReader reader = new JSONReader(new StringReader("{\"value\":922337203685477580892233720368547758088}"));
            __CLR4_5_21ods1odslusvney0.R.inc(78274);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ods1odslusvney0.R.inc(78275);error = ex;
        }
        __CLR4_5_21ods1odslusvney0.R.inc(78276);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ods1odslusvney0.R.flushNeeded();}}

    public void test_long_error_2() throws Exception {__CLR4_5_21ods1odslusvney0.R.globalSliceStart(getClass().getName(),78277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_269wgd01oed();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ods1odslusvney0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ods1odslusvney0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78277,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_269wgd01oed() throws Exception{try{__CLR4_5_21ods1odslusvney0.R.inc(78277);
        __CLR4_5_21ods1odslusvney0.R.inc(78278);Exception error = null;
        __CLR4_5_21ods1odslusvney0.R.inc(78279);try {
            __CLR4_5_21ods1odslusvney0.R.inc(78280);JSONReader reader = new JSONReader(new StringReader("{\"value\":AA}"));
            __CLR4_5_21ods1odslusvney0.R.inc(78281);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ods1odslusvney0.R.inc(78282);error = ex;
        }
        __CLR4_5_21ods1odslusvney0.R.inc(78283);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ods1odslusvney0.R.flushNeeded();}}

    public void test_long_normal() throws Exception {__CLR4_5_21ods1odslusvney0.R.globalSliceStart(getClass().getName(),78284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28lpjzw1oek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ods1odslusvney0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ods1odslusvney0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_normal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78284,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28lpjzw1oek() throws Exception{try{__CLR4_5_21ods1odslusvney0.R.inc(78284);
        __CLR4_5_21ods1odslusvney0.R.inc(78285);JSONReader reader = new JSONReader(new StringReader("{\"value\":1001,\"value2\":-2001}"));
        __CLR4_5_21ods1odslusvney0.R.inc(78286);Model model = reader.readObject(Model.class);
        __CLR4_5_21ods1odslusvney0.R.inc(78287);Assert.assertEquals(1001L, model.value);
        __CLR4_5_21ods1odslusvney0.R.inc(78288);Assert.assertEquals(-2001L, model.value2);
        __CLR4_5_21ods1odslusvney0.R.inc(78289);reader.close();
    }finally{__CLR4_5_21ods1odslusvney0.R.flushNeeded();}}

    public void test_long_normal_2() throws Exception {__CLR4_5_21ods1odslusvney0.R.globalSliceStart(getClass().getName(),78290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kic6sp1oeq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ods1odslusvney0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ods1odslusvney0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_normal_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78290,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kic6sp1oeq() throws Exception{try{__CLR4_5_21ods1odslusvney0.R.inc(78290);
        __CLR4_5_21ods1odslusvney0.R.inc(78291);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"value\":3001,\"value2\":-4001}}"));
        __CLR4_5_21ods1odslusvney0.R.inc(78292);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_5_21ods1odslusvney0.R.inc(78293);Model model = map.get("model");
        __CLR4_5_21ods1odslusvney0.R.inc(78294);Assert.assertEquals(3001L, model.value);
        __CLR4_5_21ods1odslusvney0.R.inc(78295);Assert.assertEquals(-4001L, model.value2);
        __CLR4_5_21ods1odslusvney0.R.inc(78296);reader.close();
    }finally{__CLR4_5_21ods1odslusvney0.R.flushNeeded();}}

    public void test_long_error_map() throws Exception {__CLR4_5_21ods1odslusvney0.R.globalSliceStart(getClass().getName(),78297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27o517a1oex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ods1odslusvney0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ods1odslusvney0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78297,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27o517a1oex() throws Exception{try{__CLR4_5_21ods1odslusvney0.R.inc(78297);
        __CLR4_5_21ods1odslusvney0.R.inc(78298);Exception error = null;
        __CLR4_5_21ods1odslusvney0.R.inc(78299);try {
            __CLR4_5_21ods1odslusvney0.R.inc(78300);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"value\":3001,\"value2\":-4001}["));
            __CLR4_5_21ods1odslusvney0.R.inc(78301);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21ods1odslusvney0.R.inc(78302);error = ex;
        }
        __CLR4_5_21ods1odslusvney0.R.inc(78303);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ods1odslusvney0.R.flushNeeded();}}

    public void test_long_error_end() throws Exception {__CLR4_5_21ods1odslusvney0.R.globalSliceStart(getClass().getName(),78304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gxkfsl1of4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ods1odslusvney0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ods1odslusvney0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_end",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78304,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gxkfsl1of4() throws Exception{try{__CLR4_5_21ods1odslusvney0.R.inc(78304);
        __CLR4_5_21ods1odslusvney0.R.inc(78305);Exception error = null;
        __CLR4_5_21ods1odslusvney0.R.inc(78306);try {
            __CLR4_5_21ods1odslusvney0.R.inc(78307);JSONReader reader = new JSONReader(new StringReader("{\"value\":1001,\"value2\":-2001["));
            __CLR4_5_21ods1odslusvney0.R.inc(78308);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ods1odslusvney0.R.inc(78309);error = ex;
        }
        __CLR4_5_21ods1odslusvney0.R.inc(78310);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ods1odslusvney0.R.flushNeeded();}}

    private static class Model {

        public long value;
        public long value2;
    }
}
