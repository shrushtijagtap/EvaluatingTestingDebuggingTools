/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.stream;

import java.io.StringReader;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ReaderBooleanFieldTest extends TestCase {static class __CLR4_1_101oag1oagluszwdw8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,78205,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_bool_error_0() throws Exception {__CLR4_1_101oag1oagluszwdw8.R.globalSliceStart(getClass().getName(),78136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ngv3e01oag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oag1oagluszwdw8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oag1oagluszwdw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78136,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ngv3e01oag() throws Exception{try{__CLR4_1_101oag1oagluszwdw8.R.inc(78136);
        __CLR4_1_101oag1oagluszwdw8.R.inc(78137);Exception error = null;
        __CLR4_1_101oag1oagluszwdw8.R.inc(78138);try {
            __CLR4_1_101oag1oagluszwdw8.R.inc(78139);JSONReader reader = new JSONReader(new StringReader("{\"value\":t}"));
            __CLR4_1_101oag1oagluszwdw8.R.inc(78140);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101oag1oagluszwdw8.R.inc(78141);error = ex;
        }
        __CLR4_1_101oag1oagluszwdw8.R.inc(78142);Assert.assertNotNull(error);
    }finally{__CLR4_1_101oag1oagluszwdw8.R.flushNeeded();}}

    public void test_bool_error_1() throws Exception {__CLR4_1_101oag1oagluszwdw8.R.globalSliceStart(getClass().getName(),78143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10k7v4lj1oan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oag1oagluszwdw8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oag1oagluszwdw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78143,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10k7v4lj1oan() throws Exception{try{__CLR4_1_101oag1oagluszwdw8.R.inc(78143);
        __CLR4_1_101oag1oagluszwdw8.R.inc(78144);Exception error = null;
        __CLR4_1_101oag1oagluszwdw8.R.inc(78145);try {
            __CLR4_1_101oag1oagluszwdw8.R.inc(78146);JSONReader reader = new JSONReader(new StringReader("{\"value\":tr}"));
            __CLR4_1_101oag1oagluszwdw8.R.inc(78147);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101oag1oagluszwdw8.R.inc(78148);error = ex;
        }
        __CLR4_1_101oag1oagluszwdw8.R.inc(78149);Assert.assertNotNull(error);
    }finally{__CLR4_1_101oag1oagluszwdw8.R.flushNeeded();}}

    public void test_bool_error_2() throws Exception {__CLR4_1_101oag1oagluszwdw8.R.globalSliceStart(getClass().getName(),78150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gyv5t21oau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oag1oagluszwdw8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oag1oagluszwdw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78150,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gyv5t21oau() throws Exception{try{__CLR4_1_101oag1oagluszwdw8.R.inc(78150);
        __CLR4_1_101oag1oagluszwdw8.R.inc(78151);Exception error = null;
        __CLR4_1_101oag1oagluszwdw8.R.inc(78152);try {
            __CLR4_1_101oag1oagluszwdw8.R.inc(78153);JSONReader reader = new JSONReader(new StringReader("{\"value\":tru}"));
            __CLR4_1_101oag1oagluszwdw8.R.inc(78154);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101oag1oagluszwdw8.R.inc(78155);error = ex;
        }
        __CLR4_1_101oag1oagluszwdw8.R.inc(78156);Assert.assertNotNull(error);
    }finally{__CLR4_1_101oag1oagluszwdw8.R.flushNeeded();}}

    public void test_bool_error_f0() throws Exception {__CLR4_1_101oag1oagluszwdw8.R.globalSliceStart(getClass().getName(),78157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109ufieo1ob1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oag1oagluszwdw8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oag1oagluszwdw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_f0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78157,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109ufieo1ob1() throws Exception{try{__CLR4_1_101oag1oagluszwdw8.R.inc(78157);
        __CLR4_1_101oag1oagluszwdw8.R.inc(78158);Exception error = null;
        __CLR4_1_101oag1oagluszwdw8.R.inc(78159);try {
            __CLR4_1_101oag1oagluszwdw8.R.inc(78160);JSONReader reader = new JSONReader(new StringReader("{\"value\":f}"));
            __CLR4_1_101oag1oagluszwdw8.R.inc(78161);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101oag1oagluszwdw8.R.inc(78162);error = ex;
        }
        __CLR4_1_101oag1oagluszwdw8.R.inc(78163);Assert.assertNotNull(error);
    }finally{__CLR4_1_101oag1oagluszwdw8.R.flushNeeded();}}

    public void test_bool_error_f1() throws Exception {__CLR4_1_101oag1oagluszwdw8.R.globalSliceStart(getClass().getName(),78164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106lfjm71ob8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oag1oagluszwdw8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oag1oagluszwdw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_f1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78164,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106lfjm71ob8() throws Exception{try{__CLR4_1_101oag1oagluszwdw8.R.inc(78164);
        __CLR4_1_101oag1oagluszwdw8.R.inc(78165);Exception error = null;
        __CLR4_1_101oag1oagluszwdw8.R.inc(78166);try {
            __CLR4_1_101oag1oagluszwdw8.R.inc(78167);JSONReader reader = new JSONReader(new StringReader("{\"value\":fa}"));
            __CLR4_1_101oag1oagluszwdw8.R.inc(78168);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101oag1oagluszwdw8.R.inc(78169);error = ex;
        }
        __CLR4_1_101oag1oagluszwdw8.R.inc(78170);Assert.assertNotNull(error);
    }finally{__CLR4_1_101oag1oagluszwdw8.R.flushNeeded();}}

    public void test_bool_error_f2() throws Exception {__CLR4_1_101oag1oagluszwdw8.R.globalSliceStart(getClass().getName(),78171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103cfktq1obf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oag1oagluszwdw8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oag1oagluszwdw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_f2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78171,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103cfktq1obf() throws Exception{try{__CLR4_1_101oag1oagluszwdw8.R.inc(78171);
        __CLR4_1_101oag1oagluszwdw8.R.inc(78172);Exception error = null;
        __CLR4_1_101oag1oagluszwdw8.R.inc(78173);try {
            __CLR4_1_101oag1oagluszwdw8.R.inc(78174);JSONReader reader = new JSONReader(new StringReader("{\"value\":fal}"));
            __CLR4_1_101oag1oagluszwdw8.R.inc(78175);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101oag1oagluszwdw8.R.inc(78176);error = ex;
        }
        __CLR4_1_101oag1oagluszwdw8.R.inc(78177);Assert.assertNotNull(error);
    }finally{__CLR4_1_101oag1oagluszwdw8.R.flushNeeded();}}

    public void test_bool_error_f3() throws Exception {__CLR4_1_101oag1oagluszwdw8.R.globalSliceStart(getClass().getName(),78178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103fm191obm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oag1oagluszwdw8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oag1oagluszwdw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_f3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78178,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103fm191obm() throws Exception{try{__CLR4_1_101oag1oagluszwdw8.R.inc(78178);
        __CLR4_1_101oag1oagluszwdw8.R.inc(78179);Exception error = null;
        __CLR4_1_101oag1oagluszwdw8.R.inc(78180);try {
            __CLR4_1_101oag1oagluszwdw8.R.inc(78181);JSONReader reader = new JSONReader(new StringReader("{\"value\":fals}"));
            __CLR4_1_101oag1oagluszwdw8.R.inc(78182);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101oag1oagluszwdw8.R.inc(78183);error = ex;
        }
        __CLR4_1_101oag1oagluszwdw8.R.inc(78184);Assert.assertNotNull(error);
    }finally{__CLR4_1_101oag1oagluszwdw8.R.flushNeeded();}}

    public void test_bool_normal() throws Exception {__CLR4_1_101oag1oagluszwdw8.R.globalSliceStart(getClass().getName(),78185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tkik8a1obt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oag1oagluszwdw8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oag1oagluszwdw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_normal",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78185,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tkik8a1obt() throws Exception{try{__CLR4_1_101oag1oagluszwdw8.R.inc(78185);
        __CLR4_1_101oag1oagluszwdw8.R.inc(78186);JSONReader reader = new JSONReader(new StringReader("{\"value\":false,\"value2\":true}"));
        __CLR4_1_101oag1oagluszwdw8.R.inc(78187);Model model = reader.readObject(Model.class);
        __CLR4_1_101oag1oagluszwdw8.R.inc(78188);Assert.assertFalse(model.value);
        __CLR4_1_101oag1oagluszwdw8.R.inc(78189);Assert.assertTrue(model.value2);
        __CLR4_1_101oag1oagluszwdw8.R.inc(78190);reader.close();
    }finally{__CLR4_1_101oag1oagluszwdw8.R.flushNeeded();}}
    
    public void test_bool_normal_2() throws Exception {__CLR4_1_101oag1oagluszwdw8.R.globalSliceStart(getClass().getName(),78191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1035c6951obz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oag1oagluszwdw8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oag1oagluszwdw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_normal_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78191,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1035c6951obz() throws Exception{try{__CLR4_1_101oag1oagluszwdw8.R.inc(78191);
        __CLR4_1_101oag1oagluszwdw8.R.inc(78192);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"value\":false,\"value2\":true}}"));
        __CLR4_1_101oag1oagluszwdw8.R.inc(78193);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {});
        __CLR4_1_101oag1oagluszwdw8.R.inc(78194);Model model = map.get("model");
        __CLR4_1_101oag1oagluszwdw8.R.inc(78195);Assert.assertFalse(model.value);
        __CLR4_1_101oag1oagluszwdw8.R.inc(78196);Assert.assertTrue(model.value2);
        __CLR4_1_101oag1oagluszwdw8.R.inc(78197);reader.close();
    }finally{__CLR4_1_101oag1oagluszwdw8.R.flushNeeded();}}
    
    public void test_bool_error_map() throws Exception {__CLR4_1_101oag1oagluszwdw8.R.globalSliceStart(getClass().getName(),78198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10uqzq101oc6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oag1oagluszwdw8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oag1oagluszwdw8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_map",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78198,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10uqzq101oc6() throws Exception{try{__CLR4_1_101oag1oagluszwdw8.R.inc(78198);
        __CLR4_1_101oag1oagluszwdw8.R.inc(78199);Exception error = null;
        __CLR4_1_101oag1oagluszwdw8.R.inc(78200);try {
            __CLR4_1_101oag1oagluszwdw8.R.inc(78201);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"value\":false,\"value2\":true}["));
            __CLR4_1_101oag1oagluszwdw8.R.inc(78202);reader.readObject(new TypeReference<Map<String, Model>>() {});
        } catch (JSONException ex) {
            __CLR4_1_101oag1oagluszwdw8.R.inc(78203);error = ex;
        }
        __CLR4_1_101oag1oagluszwdw8.R.inc(78204);Assert.assertNotNull(error);
    }finally{__CLR4_1_101oag1oagluszwdw8.R.flushNeeded();}}

    private static class Model {

        public boolean value;
        public boolean value2;
    }
}
