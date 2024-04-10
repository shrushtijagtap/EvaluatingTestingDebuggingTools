/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.stream;

import java.io.StringReader;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ReaderBooleanFieldTest extends TestCase {static class __CLR4_5_21nbx1nbxlusyjudm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,76962,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_bool_error_0() throws Exception {__CLR4_5_21nbx1nbxlusyjudm.R.globalSliceStart(getClass().getName(),76893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ngv3e01nbx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nbx1nbxlusyjudm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nbx1nbxlusyjudm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76893,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ngv3e01nbx() throws Exception{try{__CLR4_5_21nbx1nbxlusyjudm.R.inc(76893);
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76894);Exception error = null;
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76895);try {
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76896);JSONReader reader = new JSONReader(new StringReader("{\"value\":t}"));
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76897);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76898);error = ex;
        }
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76899);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nbx1nbxlusyjudm.R.flushNeeded();}}

    public void test_bool_error_1() throws Exception {__CLR4_5_21nbx1nbxlusyjudm.R.globalSliceStart(getClass().getName(),76900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k7v4lj1nc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nbx1nbxlusyjudm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nbx1nbxlusyjudm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76900,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k7v4lj1nc4() throws Exception{try{__CLR4_5_21nbx1nbxlusyjudm.R.inc(76900);
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76901);Exception error = null;
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76902);try {
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76903);JSONReader reader = new JSONReader(new StringReader("{\"value\":tr}"));
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76904);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76905);error = ex;
        }
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76906);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nbx1nbxlusyjudm.R.flushNeeded();}}

    public void test_bool_error_2() throws Exception {__CLR4_5_21nbx1nbxlusyjudm.R.globalSliceStart(getClass().getName(),76907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gyv5t21ncb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nbx1nbxlusyjudm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nbx1nbxlusyjudm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76907,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gyv5t21ncb() throws Exception{try{__CLR4_5_21nbx1nbxlusyjudm.R.inc(76907);
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76908);Exception error = null;
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76909);try {
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76910);JSONReader reader = new JSONReader(new StringReader("{\"value\":tru}"));
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76911);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76912);error = ex;
        }
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76913);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nbx1nbxlusyjudm.R.flushNeeded();}}

    public void test_bool_error_f0() throws Exception {__CLR4_5_21nbx1nbxlusyjudm.R.globalSliceStart(getClass().getName(),76914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29ufieo1nci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nbx1nbxlusyjudm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nbx1nbxlusyjudm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_f0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76914,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29ufieo1nci() throws Exception{try{__CLR4_5_21nbx1nbxlusyjudm.R.inc(76914);
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76915);Exception error = null;
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76916);try {
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76917);JSONReader reader = new JSONReader(new StringReader("{\"value\":f}"));
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76918);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76919);error = ex;
        }
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76920);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nbx1nbxlusyjudm.R.flushNeeded();}}

    public void test_bool_error_f1() throws Exception {__CLR4_5_21nbx1nbxlusyjudm.R.globalSliceStart(getClass().getName(),76921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26lfjm71ncp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nbx1nbxlusyjudm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nbx1nbxlusyjudm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_f1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76921,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26lfjm71ncp() throws Exception{try{__CLR4_5_21nbx1nbxlusyjudm.R.inc(76921);
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76922);Exception error = null;
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76923);try {
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76924);JSONReader reader = new JSONReader(new StringReader("{\"value\":fa}"));
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76925);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76926);error = ex;
        }
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76927);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nbx1nbxlusyjudm.R.flushNeeded();}}

    public void test_bool_error_f2() throws Exception {__CLR4_5_21nbx1nbxlusyjudm.R.globalSliceStart(getClass().getName(),76928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23cfktq1ncw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nbx1nbxlusyjudm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nbx1nbxlusyjudm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_f2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76928,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23cfktq1ncw() throws Exception{try{__CLR4_5_21nbx1nbxlusyjudm.R.inc(76928);
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76929);Exception error = null;
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76930);try {
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76931);JSONReader reader = new JSONReader(new StringReader("{\"value\":fal}"));
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76932);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76933);error = ex;
        }
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76934);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nbx1nbxlusyjudm.R.flushNeeded();}}

    public void test_bool_error_f3() throws Exception {__CLR4_5_21nbx1nbxlusyjudm.R.globalSliceStart(getClass().getName(),76935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23fm191nd3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nbx1nbxlusyjudm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nbx1nbxlusyjudm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_f3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76935,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23fm191nd3() throws Exception{try{__CLR4_5_21nbx1nbxlusyjudm.R.inc(76935);
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76936);Exception error = null;
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76937);try {
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76938);JSONReader reader = new JSONReader(new StringReader("{\"value\":fals}"));
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76939);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76940);error = ex;
        }
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76941);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nbx1nbxlusyjudm.R.flushNeeded();}}

    public void test_bool_normal() throws Exception {__CLR4_5_21nbx1nbxlusyjudm.R.globalSliceStart(getClass().getName(),76942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tkik8a1nda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nbx1nbxlusyjudm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nbx1nbxlusyjudm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_normal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76942,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tkik8a1nda() throws Exception{try{__CLR4_5_21nbx1nbxlusyjudm.R.inc(76942);
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76943);JSONReader reader = new JSONReader(new StringReader("{\"value\":false,\"value2\":true}"));
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76944);Model model = reader.readObject(Model.class);
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76945);Assert.assertFalse(model.value);
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76946);Assert.assertTrue(model.value2);
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76947);reader.close();
    }finally{__CLR4_5_21nbx1nbxlusyjudm.R.flushNeeded();}}
    
    public void test_bool_normal_2() throws Exception {__CLR4_5_21nbx1nbxlusyjudm.R.globalSliceStart(getClass().getName(),76948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_235c6951ndg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nbx1nbxlusyjudm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nbx1nbxlusyjudm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_normal_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76948,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_235c6951ndg() throws Exception{try{__CLR4_5_21nbx1nbxlusyjudm.R.inc(76948);
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76949);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"value\":false,\"value2\":true}}"));
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76950);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {});
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76951);Model model = map.get("model");
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76952);Assert.assertFalse(model.value);
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76953);Assert.assertTrue(model.value2);
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76954);reader.close();
    }finally{__CLR4_5_21nbx1nbxlusyjudm.R.flushNeeded();}}
    
    public void test_bool_error_map() throws Exception {__CLR4_5_21nbx1nbxlusyjudm.R.globalSliceStart(getClass().getName(),76955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uqzq101ndn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nbx1nbxlusyjudm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nbx1nbxlusyjudm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76955,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uqzq101ndn() throws Exception{try{__CLR4_5_21nbx1nbxlusyjudm.R.inc(76955);
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76956);Exception error = null;
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76957);try {
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76958);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"value\":false,\"value2\":true}["));
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76959);reader.readObject(new TypeReference<Map<String, Model>>() {});
        } catch (JSONException ex) {
            __CLR4_5_21nbx1nbxlusyjudm.R.inc(76960);error = ex;
        }
        __CLR4_5_21nbx1nbxlusyjudm.R.inc(76961);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nbx1nbxlusyjudm.R.flushNeeded();}}

    private static class Model {

        public boolean value;
        public boolean value2;
    }
}
