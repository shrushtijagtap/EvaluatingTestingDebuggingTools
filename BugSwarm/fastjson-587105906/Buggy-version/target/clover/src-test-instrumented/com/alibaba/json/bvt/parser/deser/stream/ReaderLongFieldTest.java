/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.stream;

import java.io.StringReader;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ReaderLongFieldTest extends TestCase {static class __CLR4_1_101nfv1nfvlusqkh8b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,77090,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_long_error_0() throws Exception {__CLR4_1_101nfv1nfvlusqkh8b.R.globalSliceStart(getClass().getName(),77035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10crwdxy1nfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nfv1nfvlusqkh8b.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nfv1nfvlusqkh8b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77035,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10crwdxy1nfv() throws Exception{try{__CLR4_1_101nfv1nfvlusqkh8b.R.inc(77035);
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77036);Exception error = null;
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77037);try {
            __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77038);JSONReader reader = new JSONReader(new StringReader("{\"value\":1.A}"));
            __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77039);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77040);error = ex;
        }
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77041);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nfv1nfvlusqkh8b.R.flushNeeded();}}

    public void test_long_error_1() throws Exception {__CLR4_1_101nfv1nfvlusqkh8b.R.globalSliceStart(getClass().getName(),77042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109iwf5h1ng2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nfv1nfvlusqkh8b.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nfv1nfvlusqkh8b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77042,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109iwf5h1ng2() throws Exception{try{__CLR4_1_101nfv1nfvlusqkh8b.R.inc(77042);
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77043);Exception error = null;
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77044);try {
            __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77045);JSONReader reader = new JSONReader(new StringReader("{\"value\":9223372036854775808}"));
            __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77046);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77047);error = ex;
        }
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77048);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nfv1nfvlusqkh8b.R.flushNeeded();}}
    
    public void test_long_error_1_x() throws Exception {__CLR4_1_101nfv1nfvlusqkh8b.R.globalSliceStart(getClass().getName(),77049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vagc9w1ng9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nfv1nfvlusqkh8b.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nfv1nfvlusqkh8b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_1_x",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77049,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vagc9w1ng9() throws Exception{try{__CLR4_1_101nfv1nfvlusqkh8b.R.inc(77049);
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77050);Exception error = null;
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77051);try {
            __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77052);JSONReader reader = new JSONReader(new StringReader("{\"value\":922337203685477580892233720368547758088}"));
            __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77053);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77054);error = ex;
        }
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77055);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nfv1nfvlusqkh8b.R.flushNeeded();}}

    public void test_long_error_2() throws Exception {__CLR4_1_101nfv1nfvlusqkh8b.R.globalSliceStart(getClass().getName(),77056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1069wgd01ngg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nfv1nfvlusqkh8b.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nfv1nfvlusqkh8b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77056,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1069wgd01ngg() throws Exception{try{__CLR4_1_101nfv1nfvlusqkh8b.R.inc(77056);
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77057);Exception error = null;
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77058);try {
            __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77059);JSONReader reader = new JSONReader(new StringReader("{\"value\":AA}"));
            __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77060);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77061);error = ex;
        }
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77062);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nfv1nfvlusqkh8b.R.flushNeeded();}}

    public void test_long_normal() throws Exception {__CLR4_1_101nfv1nfvlusqkh8b.R.globalSliceStart(getClass().getName(),77063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108lpjzw1ngn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nfv1nfvlusqkh8b.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nfv1nfvlusqkh8b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_normal",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77063,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108lpjzw1ngn() throws Exception{try{__CLR4_1_101nfv1nfvlusqkh8b.R.inc(77063);
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77064);JSONReader reader = new JSONReader(new StringReader("{\"value\":1001,\"value2\":-2001}"));
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77065);Model model = reader.readObject(Model.class);
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77066);Assert.assertEquals(1001L, model.value);
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77067);Assert.assertEquals(-2001L, model.value2);
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77068);reader.close();
    }finally{__CLR4_1_101nfv1nfvlusqkh8b.R.flushNeeded();}}

    public void test_long_normal_2() throws Exception {__CLR4_1_101nfv1nfvlusqkh8b.R.globalSliceStart(getClass().getName(),77069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kic6sp1ngt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nfv1nfvlusqkh8b.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nfv1nfvlusqkh8b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_normal_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77069,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kic6sp1ngt() throws Exception{try{__CLR4_1_101nfv1nfvlusqkh8b.R.inc(77069);
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77070);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"value\":3001,\"value2\":-4001}}"));
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77071);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77072);Model model = map.get("model");
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77073);Assert.assertEquals(3001L, model.value);
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77074);Assert.assertEquals(-4001L, model.value2);
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77075);reader.close();
    }finally{__CLR4_1_101nfv1nfvlusqkh8b.R.flushNeeded();}}

    public void test_long_error_map() throws Exception {__CLR4_1_101nfv1nfvlusqkh8b.R.globalSliceStart(getClass().getName(),77076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107o517a1nh0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nfv1nfvlusqkh8b.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nfv1nfvlusqkh8b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_map",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77076,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107o517a1nh0() throws Exception{try{__CLR4_1_101nfv1nfvlusqkh8b.R.inc(77076);
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77077);Exception error = null;
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77078);try {
            __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77079);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"value\":3001,\"value2\":-4001}["));
            __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77080);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77081);error = ex;
        }
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77082);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nfv1nfvlusqkh8b.R.flushNeeded();}}

    public void test_long_error_end() throws Exception {__CLR4_1_101nfv1nfvlusqkh8b.R.globalSliceStart(getClass().getName(),77083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gxkfsl1nh7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nfv1nfvlusqkh8b.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nfv1nfvlusqkh8b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_end",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77083,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gxkfsl1nh7() throws Exception{try{__CLR4_1_101nfv1nfvlusqkh8b.R.inc(77083);
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77084);Exception error = null;
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77085);try {
            __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77086);JSONReader reader = new JSONReader(new StringReader("{\"value\":1001,\"value2\":-2001["));
            __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77087);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77088);error = ex;
        }
        __CLR4_1_101nfv1nfvlusqkh8b.R.inc(77089);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nfv1nfvlusqkh8b.R.flushNeeded();}}

    private static class Model {

        public long value;
        public long value2;
    }
}
