/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.stream;

import java.io.StringReader;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ReaderLongFieldTest extends TestCase {static class __CLR4_5_21nfk1nfklusyjudt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,77079,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_long_error_0() throws Exception {__CLR4_5_21nfk1nfklusyjudt.R.globalSliceStart(getClass().getName(),77024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2crwdxy1nfk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nfk1nfklusyjudt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nfk1nfklusyjudt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77024,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2crwdxy1nfk() throws Exception{try{__CLR4_5_21nfk1nfklusyjudt.R.inc(77024);
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77025);Exception error = null;
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77026);try {
            __CLR4_5_21nfk1nfklusyjudt.R.inc(77027);JSONReader reader = new JSONReader(new StringReader("{\"value\":1.A}"));
            __CLR4_5_21nfk1nfklusyjudt.R.inc(77028);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nfk1nfklusyjudt.R.inc(77029);error = ex;
        }
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77030);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nfk1nfklusyjudt.R.flushNeeded();}}

    public void test_long_error_1() throws Exception {__CLR4_5_21nfk1nfklusyjudt.R.globalSliceStart(getClass().getName(),77031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29iwf5h1nfr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nfk1nfklusyjudt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nfk1nfklusyjudt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77031,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29iwf5h1nfr() throws Exception{try{__CLR4_5_21nfk1nfklusyjudt.R.inc(77031);
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77032);Exception error = null;
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77033);try {
            __CLR4_5_21nfk1nfklusyjudt.R.inc(77034);JSONReader reader = new JSONReader(new StringReader("{\"value\":9223372036854775808}"));
            __CLR4_5_21nfk1nfklusyjudt.R.inc(77035);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nfk1nfklusyjudt.R.inc(77036);error = ex;
        }
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77037);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nfk1nfklusyjudt.R.flushNeeded();}}
    
    public void test_long_error_1_x() throws Exception {__CLR4_5_21nfk1nfklusyjudt.R.globalSliceStart(getClass().getName(),77038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vagc9w1nfy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nfk1nfklusyjudt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nfk1nfklusyjudt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_1_x",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77038,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vagc9w1nfy() throws Exception{try{__CLR4_5_21nfk1nfklusyjudt.R.inc(77038);
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77039);Exception error = null;
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77040);try {
            __CLR4_5_21nfk1nfklusyjudt.R.inc(77041);JSONReader reader = new JSONReader(new StringReader("{\"value\":922337203685477580892233720368547758088}"));
            __CLR4_5_21nfk1nfklusyjudt.R.inc(77042);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nfk1nfklusyjudt.R.inc(77043);error = ex;
        }
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77044);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nfk1nfklusyjudt.R.flushNeeded();}}

    public void test_long_error_2() throws Exception {__CLR4_5_21nfk1nfklusyjudt.R.globalSliceStart(getClass().getName(),77045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_269wgd01ng5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nfk1nfklusyjudt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nfk1nfklusyjudt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77045,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_269wgd01ng5() throws Exception{try{__CLR4_5_21nfk1nfklusyjudt.R.inc(77045);
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77046);Exception error = null;
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77047);try {
            __CLR4_5_21nfk1nfklusyjudt.R.inc(77048);JSONReader reader = new JSONReader(new StringReader("{\"value\":AA}"));
            __CLR4_5_21nfk1nfklusyjudt.R.inc(77049);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nfk1nfklusyjudt.R.inc(77050);error = ex;
        }
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77051);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nfk1nfklusyjudt.R.flushNeeded();}}

    public void test_long_normal() throws Exception {__CLR4_5_21nfk1nfklusyjudt.R.globalSliceStart(getClass().getName(),77052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28lpjzw1ngc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nfk1nfklusyjudt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nfk1nfklusyjudt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_normal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77052,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28lpjzw1ngc() throws Exception{try{__CLR4_5_21nfk1nfklusyjudt.R.inc(77052);
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77053);JSONReader reader = new JSONReader(new StringReader("{\"value\":1001,\"value2\":-2001}"));
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77054);Model model = reader.readObject(Model.class);
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77055);Assert.assertEquals(1001L, model.value);
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77056);Assert.assertEquals(-2001L, model.value2);
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77057);reader.close();
    }finally{__CLR4_5_21nfk1nfklusyjudt.R.flushNeeded();}}

    public void test_long_normal_2() throws Exception {__CLR4_5_21nfk1nfklusyjudt.R.globalSliceStart(getClass().getName(),77058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kic6sp1ngi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nfk1nfklusyjudt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nfk1nfklusyjudt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_normal_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77058,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kic6sp1ngi() throws Exception{try{__CLR4_5_21nfk1nfklusyjudt.R.inc(77058);
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77059);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"value\":3001,\"value2\":-4001}}"));
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77060);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77061);Model model = map.get("model");
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77062);Assert.assertEquals(3001L, model.value);
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77063);Assert.assertEquals(-4001L, model.value2);
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77064);reader.close();
    }finally{__CLR4_5_21nfk1nfklusyjudt.R.flushNeeded();}}

    public void test_long_error_map() throws Exception {__CLR4_5_21nfk1nfklusyjudt.R.globalSliceStart(getClass().getName(),77065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27o517a1ngp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nfk1nfklusyjudt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nfk1nfklusyjudt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77065,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27o517a1ngp() throws Exception{try{__CLR4_5_21nfk1nfklusyjudt.R.inc(77065);
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77066);Exception error = null;
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77067);try {
            __CLR4_5_21nfk1nfklusyjudt.R.inc(77068);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"value\":3001,\"value2\":-4001}["));
            __CLR4_5_21nfk1nfklusyjudt.R.inc(77069);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21nfk1nfklusyjudt.R.inc(77070);error = ex;
        }
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77071);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nfk1nfklusyjudt.R.flushNeeded();}}

    public void test_long_error_end() throws Exception {__CLR4_5_21nfk1nfklusyjudt.R.globalSliceStart(getClass().getName(),77072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gxkfsl1ngw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nfk1nfklusyjudt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nfk1nfklusyjudt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderLongFieldTest.test_long_error_end",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77072,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gxkfsl1ngw() throws Exception{try{__CLR4_5_21nfk1nfklusyjudt.R.inc(77072);
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77073);Exception error = null;
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77074);try {
            __CLR4_5_21nfk1nfklusyjudt.R.inc(77075);JSONReader reader = new JSONReader(new StringReader("{\"value\":1001,\"value2\":-2001["));
            __CLR4_5_21nfk1nfklusyjudt.R.inc(77076);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nfk1nfklusyjudt.R.inc(77077);error = ex;
        }
        __CLR4_5_21nfk1nfklusyjudt.R.inc(77078);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nfk1nfklusyjudt.R.flushNeeded();}}

    private static class Model {

        public long value;
        public long value2;
    }
}
