/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.stream;

import java.io.StringReader;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ReaderBooleanFieldTest extends TestCase {static class __CLR4_1_101nc81nc8lusqkh7f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,76973,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_bool_error_0() throws Exception {__CLR4_1_101nc81nc8lusqkh7f.R.globalSliceStart(getClass().getName(),76904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ngv3e01nc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nc81nc8lusqkh7f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nc81nc8lusqkh7f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76904,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ngv3e01nc8() throws Exception{try{__CLR4_1_101nc81nc8lusqkh7f.R.inc(76904);
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76905);Exception error = null;
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76906);try {
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76907);JSONReader reader = new JSONReader(new StringReader("{\"value\":t}"));
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76908);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76909);error = ex;
        }
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76910);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nc81nc8lusqkh7f.R.flushNeeded();}}

    public void test_bool_error_1() throws Exception {__CLR4_1_101nc81nc8lusqkh7f.R.globalSliceStart(getClass().getName(),76911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10k7v4lj1ncf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nc81nc8lusqkh7f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nc81nc8lusqkh7f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76911,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10k7v4lj1ncf() throws Exception{try{__CLR4_1_101nc81nc8lusqkh7f.R.inc(76911);
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76912);Exception error = null;
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76913);try {
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76914);JSONReader reader = new JSONReader(new StringReader("{\"value\":tr}"));
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76915);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76916);error = ex;
        }
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76917);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nc81nc8lusqkh7f.R.flushNeeded();}}

    public void test_bool_error_2() throws Exception {__CLR4_1_101nc81nc8lusqkh7f.R.globalSliceStart(getClass().getName(),76918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gyv5t21ncm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nc81nc8lusqkh7f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nc81nc8lusqkh7f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76918,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gyv5t21ncm() throws Exception{try{__CLR4_1_101nc81nc8lusqkh7f.R.inc(76918);
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76919);Exception error = null;
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76920);try {
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76921);JSONReader reader = new JSONReader(new StringReader("{\"value\":tru}"));
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76922);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76923);error = ex;
        }
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76924);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nc81nc8lusqkh7f.R.flushNeeded();}}

    public void test_bool_error_f0() throws Exception {__CLR4_1_101nc81nc8lusqkh7f.R.globalSliceStart(getClass().getName(),76925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109ufieo1nct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nc81nc8lusqkh7f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nc81nc8lusqkh7f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_f0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76925,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109ufieo1nct() throws Exception{try{__CLR4_1_101nc81nc8lusqkh7f.R.inc(76925);
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76926);Exception error = null;
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76927);try {
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76928);JSONReader reader = new JSONReader(new StringReader("{\"value\":f}"));
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76929);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76930);error = ex;
        }
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76931);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nc81nc8lusqkh7f.R.flushNeeded();}}

    public void test_bool_error_f1() throws Exception {__CLR4_1_101nc81nc8lusqkh7f.R.globalSliceStart(getClass().getName(),76932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106lfjm71nd0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nc81nc8lusqkh7f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nc81nc8lusqkh7f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_f1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76932,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106lfjm71nd0() throws Exception{try{__CLR4_1_101nc81nc8lusqkh7f.R.inc(76932);
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76933);Exception error = null;
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76934);try {
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76935);JSONReader reader = new JSONReader(new StringReader("{\"value\":fa}"));
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76936);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76937);error = ex;
        }
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76938);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nc81nc8lusqkh7f.R.flushNeeded();}}

    public void test_bool_error_f2() throws Exception {__CLR4_1_101nc81nc8lusqkh7f.R.globalSliceStart(getClass().getName(),76939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103cfktq1nd7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nc81nc8lusqkh7f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nc81nc8lusqkh7f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_f2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76939,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103cfktq1nd7() throws Exception{try{__CLR4_1_101nc81nc8lusqkh7f.R.inc(76939);
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76940);Exception error = null;
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76941);try {
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76942);JSONReader reader = new JSONReader(new StringReader("{\"value\":fal}"));
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76943);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76944);error = ex;
        }
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76945);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nc81nc8lusqkh7f.R.flushNeeded();}}

    public void test_bool_error_f3() throws Exception {__CLR4_1_101nc81nc8lusqkh7f.R.globalSliceStart(getClass().getName(),76946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103fm191nde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nc81nc8lusqkh7f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nc81nc8lusqkh7f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_f3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76946,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103fm191nde() throws Exception{try{__CLR4_1_101nc81nc8lusqkh7f.R.inc(76946);
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76947);Exception error = null;
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76948);try {
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76949);JSONReader reader = new JSONReader(new StringReader("{\"value\":fals}"));
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76950);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76951);error = ex;
        }
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76952);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nc81nc8lusqkh7f.R.flushNeeded();}}

    public void test_bool_normal() throws Exception {__CLR4_1_101nc81nc8lusqkh7f.R.globalSliceStart(getClass().getName(),76953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tkik8a1ndl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nc81nc8lusqkh7f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nc81nc8lusqkh7f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_normal",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76953,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tkik8a1ndl() throws Exception{try{__CLR4_1_101nc81nc8lusqkh7f.R.inc(76953);
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76954);JSONReader reader = new JSONReader(new StringReader("{\"value\":false,\"value2\":true}"));
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76955);Model model = reader.readObject(Model.class);
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76956);Assert.assertFalse(model.value);
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76957);Assert.assertTrue(model.value2);
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76958);reader.close();
    }finally{__CLR4_1_101nc81nc8lusqkh7f.R.flushNeeded();}}
    
    public void test_bool_normal_2() throws Exception {__CLR4_1_101nc81nc8lusqkh7f.R.globalSliceStart(getClass().getName(),76959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1035c6951ndr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nc81nc8lusqkh7f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nc81nc8lusqkh7f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_normal_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76959,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1035c6951ndr() throws Exception{try{__CLR4_1_101nc81nc8lusqkh7f.R.inc(76959);
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76960);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"value\":false,\"value2\":true}}"));
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76961);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {});
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76962);Model model = map.get("model");
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76963);Assert.assertFalse(model.value);
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76964);Assert.assertTrue(model.value2);
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76965);reader.close();
    }finally{__CLR4_1_101nc81nc8lusqkh7f.R.flushNeeded();}}
    
    public void test_bool_error_map() throws Exception {__CLR4_1_101nc81nc8lusqkh7f.R.globalSliceStart(getClass().getName(),76966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10uqzq101ndy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nc81nc8lusqkh7f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nc81nc8lusqkh7f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderBooleanFieldTest.test_bool_error_map",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76966,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10uqzq101ndy() throws Exception{try{__CLR4_1_101nc81nc8lusqkh7f.R.inc(76966);
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76967);Exception error = null;
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76968);try {
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76969);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"value\":false,\"value2\":true}["));
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76970);reader.readObject(new TypeReference<Map<String, Model>>() {});
        } catch (JSONException ex) {
            __CLR4_1_101nc81nc8lusqkh7f.R.inc(76971);error = ex;
        }
        __CLR4_1_101nc81nc8lusqkh7f.R.inc(76972);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nc81nc8lusqkh7f.R.flushNeeded();}}

    private static class Model {

        public boolean value;
        public boolean value2;
    }
}
