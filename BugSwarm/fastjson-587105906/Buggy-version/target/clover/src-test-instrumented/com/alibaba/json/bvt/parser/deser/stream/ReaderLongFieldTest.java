/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.stream;

import java.io.StringReader;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ReaderLongFieldTest extends TestCase {static class __CLR4_1_101oe31oe3luszwdwz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,78322,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_long_error_0() throws Exception {__CLR4_1_101oe31oe3luszwdwz.R.globalSliceStart(getClass().getName(),78267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10crwdxy1oe3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oe31oe3luszwdwz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oe31oe3luszwdwz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78267,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10crwdxy1oe3() throws Exception{try{__CLR4_1_101oe31oe3luszwdwz.R.inc(78267);
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78268);Exception error = null;
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78269);try {
            __CLR4_1_101oe31oe3luszwdwz.R.inc(78270);JSONReader reader = new JSONReader(new StringReader("{\"value\":1.A}"));
            __CLR4_1_101oe31oe3luszwdwz.R.inc(78271);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101oe31oe3luszwdwz.R.inc(78272);error = ex;
        }
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78273);Assert.assertNotNull(error);
    }finally{__CLR4_1_101oe31oe3luszwdwz.R.flushNeeded();}}

    public void test_long_error_1() throws Exception {__CLR4_1_101oe31oe3luszwdwz.R.globalSliceStart(getClass().getName(),78274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109iwf5h1oea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oe31oe3luszwdwz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oe31oe3luszwdwz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78274,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109iwf5h1oea() throws Exception{try{__CLR4_1_101oe31oe3luszwdwz.R.inc(78274);
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78275);Exception error = null;
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78276);try {
            __CLR4_1_101oe31oe3luszwdwz.R.inc(78277);JSONReader reader = new JSONReader(new StringReader("{\"value\":9223372036854775808}"));
            __CLR4_1_101oe31oe3luszwdwz.R.inc(78278);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101oe31oe3luszwdwz.R.inc(78279);error = ex;
        }
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78280);Assert.assertNotNull(error);
    }finally{__CLR4_1_101oe31oe3luszwdwz.R.flushNeeded();}}
    
    public void test_long_error_1_x() throws Exception {__CLR4_1_101oe31oe3luszwdwz.R.globalSliceStart(getClass().getName(),78281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vagc9w1oeh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oe31oe3luszwdwz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oe31oe3luszwdwz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_1_x",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78281,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vagc9w1oeh() throws Exception{try{__CLR4_1_101oe31oe3luszwdwz.R.inc(78281);
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78282);Exception error = null;
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78283);try {
            __CLR4_1_101oe31oe3luszwdwz.R.inc(78284);JSONReader reader = new JSONReader(new StringReader("{\"value\":922337203685477580892233720368547758088}"));
            __CLR4_1_101oe31oe3luszwdwz.R.inc(78285);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101oe31oe3luszwdwz.R.inc(78286);error = ex;
        }
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78287);Assert.assertNotNull(error);
    }finally{__CLR4_1_101oe31oe3luszwdwz.R.flushNeeded();}}

    public void test_long_error_2() throws Exception {__CLR4_1_101oe31oe3luszwdwz.R.globalSliceStart(getClass().getName(),78288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1069wgd01oeo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oe31oe3luszwdwz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oe31oe3luszwdwz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78288,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1069wgd01oeo() throws Exception{try{__CLR4_1_101oe31oe3luszwdwz.R.inc(78288);
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78289);Exception error = null;
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78290);try {
            __CLR4_1_101oe31oe3luszwdwz.R.inc(78291);JSONReader reader = new JSONReader(new StringReader("{\"value\":AA}"));
            __CLR4_1_101oe31oe3luszwdwz.R.inc(78292);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101oe31oe3luszwdwz.R.inc(78293);error = ex;
        }
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78294);Assert.assertNotNull(error);
    }finally{__CLR4_1_101oe31oe3luszwdwz.R.flushNeeded();}}

    public void test_long_normal() throws Exception {__CLR4_1_101oe31oe3luszwdwz.R.globalSliceStart(getClass().getName(),78295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108lpjzw1oev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oe31oe3luszwdwz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oe31oe3luszwdwz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_normal",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78295,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108lpjzw1oev() throws Exception{try{__CLR4_1_101oe31oe3luszwdwz.R.inc(78295);
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78296);JSONReader reader = new JSONReader(new StringReader("{\"value\":1001,\"value2\":-2001}"));
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78297);Model model = reader.readObject(Model.class);
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78298);Assert.assertEquals(1001L, model.value);
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78299);Assert.assertEquals(-2001L, model.value2);
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78300);reader.close();
    }finally{__CLR4_1_101oe31oe3luszwdwz.R.flushNeeded();}}

    public void test_long_normal_2() throws Exception {__CLR4_1_101oe31oe3luszwdwz.R.globalSliceStart(getClass().getName(),78301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kic6sp1of1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oe31oe3luszwdwz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oe31oe3luszwdwz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_normal_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78301,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kic6sp1of1() throws Exception{try{__CLR4_1_101oe31oe3luszwdwz.R.inc(78301);
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78302);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"value\":3001,\"value2\":-4001}}"));
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78303);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78304);Model model = map.get("model");
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78305);Assert.assertEquals(3001L, model.value);
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78306);Assert.assertEquals(-4001L, model.value2);
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78307);reader.close();
    }finally{__CLR4_1_101oe31oe3luszwdwz.R.flushNeeded();}}

    public void test_long_error_map() throws Exception {__CLR4_1_101oe31oe3luszwdwz.R.globalSliceStart(getClass().getName(),78308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107o517a1of8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oe31oe3luszwdwz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oe31oe3luszwdwz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_map",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78308,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107o517a1of8() throws Exception{try{__CLR4_1_101oe31oe3luszwdwz.R.inc(78308);
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78309);Exception error = null;
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78310);try {
            __CLR4_1_101oe31oe3luszwdwz.R.inc(78311);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"value\":3001,\"value2\":-4001}["));
            __CLR4_1_101oe31oe3luszwdwz.R.inc(78312);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101oe31oe3luszwdwz.R.inc(78313);error = ex;
        }
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78314);Assert.assertNotNull(error);
    }finally{__CLR4_1_101oe31oe3luszwdwz.R.flushNeeded();}}

    public void test_long_error_end() throws Exception {__CLR4_1_101oe31oe3luszwdwz.R.globalSliceStart(getClass().getName(),78315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gxkfsl1off();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oe31oe3luszwdwz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oe31oe3luszwdwz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_end",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78315,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gxkfsl1off() throws Exception{try{__CLR4_1_101oe31oe3luszwdwz.R.inc(78315);
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78316);Exception error = null;
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78317);try {
            __CLR4_1_101oe31oe3luszwdwz.R.inc(78318);JSONReader reader = new JSONReader(new StringReader("{\"value\":1001,\"value2\":-2001["));
            __CLR4_1_101oe31oe3luszwdwz.R.inc(78319);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101oe31oe3luszwdwz.R.inc(78320);error = ex;
        }
        __CLR4_1_101oe31oe3luszwdwz.R.inc(78321);Assert.assertNotNull(error);
    }finally{__CLR4_1_101oe31oe3luszwdwz.R.flushNeeded();}}

    private static class Model {

        public long value;
        public long value2;
    }
}
