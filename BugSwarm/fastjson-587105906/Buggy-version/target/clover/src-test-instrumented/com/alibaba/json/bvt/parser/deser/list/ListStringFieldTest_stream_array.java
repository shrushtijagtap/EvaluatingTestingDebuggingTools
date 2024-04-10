/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.list;

import java.io.StringReader;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.Feature;

import junit.framework.TestCase;

public class ListStringFieldTest_stream_array extends TestCase {static class __CLR4_1_101o3a1o3aluszwdvq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,78039,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceStart(getClass().getName(),77878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1059ny8i1o3a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o3a1o3aluszwdvq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77878,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1059ny8i1o3a() throws Exception{try{__CLR4_1_101o3a1o3aluszwdvq.R.inc(77878);
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77879);String text = "[[\"a\",null,\"b\",\"ab\\\\c\\\"a\"]]";

        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77880);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77881);Model model = reader.readObject(Model.class);
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77882);Assert.assertEquals(4, model.values.size());
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77883);Assert.assertEquals("a", model.values.get(0));
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77884);Assert.assertEquals(null, model.values.get(1));
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77885);Assert.assertEquals("b", model.values.get(2));
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77886);Assert.assertEquals("ab\\c\"a", model.values.get(3));
    }finally{__CLR4_1_101o3a1o3aluszwdvq.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceStart(getClass().getName(),77887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1o3j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o3a1o3aluszwdvq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77887,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1o3j() throws Exception{try{__CLR4_1_101o3a1o3aluszwdvq.R.inc(77887);
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77888);String text = "[null]";
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77889);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77890);Model model = reader.readObject(Model.class);
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77891);Assert.assertNull(model.values);
    }finally{__CLR4_1_101o3a1o3aluszwdvq.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceStart(getClass().getName(),77892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m1ch211o3o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o3a1o3aluszwdvq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77892,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m1ch211o3o() throws Exception{try{__CLR4_1_101o3a1o3aluszwdvq.R.inc(77892);
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77893);String text = "[[]]}";
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77894);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77895);Model model = reader.readObject(Model.class);
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77896);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101o3a1o3aluszwdvq.R.flushNeeded();}}

    public void test_map_empty() throws Exception {__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceStart(getClass().getName(),77897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lmhrdw1o3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o3a1o3aluszwdvq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_map_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77897,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lmhrdw1o3t() throws Exception{try{__CLR4_1_101o3a1o3aluszwdvq.R.inc(77897);
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77898);String text = "{\"model\":[[]]}";
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77899);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77900);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77901);Model model = (Model) map.get("model");
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77902);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101o3a1o3aluszwdvq.R.flushNeeded();}}
    
    public void test_map_empty_2() throws Exception {__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceStart(getClass().getName(),77903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n63rwp1o3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o3a1o3aluszwdvq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_map_empty_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77903,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n63rwp1o3z() throws Exception{try{__CLR4_1_101o3a1o3aluszwdvq.R.inc(77903);
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77904);String text = "{\"model\":[[]],\"model2\":[[]]}";
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77905);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77906);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77907);Model model = (Model) map.get("model");
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77908);Assert.assertEquals(0, model.values.size());
        
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77909);Model model2 = (Model) map.get("model2");
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77910);Assert.assertEquals(0, model2.values.size());
    }finally{__CLR4_1_101o3a1o3aluszwdvq.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceStart(getClass().getName(),77911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1o47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o3a1o3aluszwdvq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77911,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1o47() throws Exception{try{__CLR4_1_101o3a1o3aluszwdvq.R.inc(77911);
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77912);String text = "[[1{1,}";
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77913);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77914);Exception error = null;
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77915);try {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77916);reader.readObject(Model.class);
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77917);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77918);error = ex;
        }
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77919);Assert.assertNotNull(error);
    }finally{__CLR4_1_101o3a1o3aluszwdvq.R.flushNeeded();}}
    
    public void test_error_0() throws Exception {__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceStart(getClass().getName(),77920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1o4g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o3a1o3aluszwdvq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77920,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1o4g() throws Exception{try{__CLR4_1_101o3a1o3aluszwdvq.R.inc(77920);
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77921);String text = "[{";
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77922);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77923);Exception error = null;
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77924);try {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77925);reader.readObject(Model.class);
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77926);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77927);error = ex;
        }
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77928);Assert.assertNotNull(error);
    }finally{__CLR4_1_101o3a1o3aluszwdvq.R.flushNeeded();}}
    
    public void test_error_n() throws Exception {__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceStart(getClass().getName(),77929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103ey91t1o4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o3a1o3aluszwdvq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_n",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77929,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103ey91t1o4p() throws Exception{try{__CLR4_1_101o3a1o3aluszwdvq.R.inc(77929);
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77930);String text = "[n";
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77931);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77932);Exception error = null;
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77933);try {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77934);reader.readObject(Model.class);
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77935);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77936);error = ex;
        }
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77937);Assert.assertNotNull(error);
    }finally{__CLR4_1_101o3a1o3aluszwdvq.R.flushNeeded();}}
    
    public void test_error_nu() throws Exception {__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceStart(getClass().getName(),77938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10b9biaa1o4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o3a1o3aluszwdvq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_nu",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77938,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10b9biaa1o4y() throws Exception{try{__CLR4_1_101o3a1o3aluszwdvq.R.inc(77938);
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77939);String text = "[nu";
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77940);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77941);Exception error = null;
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77942);try {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77943);reader.readObject(Model.class);
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77944);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77945);error = ex;
        }
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77946);Assert.assertNotNull(error);
    }finally{__CLR4_1_101o3a1o3aluszwdvq.R.flushNeeded();}}
    
    public void test_error_nul() throws Exception {__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceStart(getClass().getName(),77947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c2eljc1o57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o3a1o3aluszwdvq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_nul",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77947,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c2eljc1o57() throws Exception{try{__CLR4_1_101o3a1o3aluszwdvq.R.inc(77947);
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77948);String text = "[nul";
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77949);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77950);Exception error = null;
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77951);try {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77952);reader.readObject(Model.class);
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77953);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77954);error = ex;
        }
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77955);Assert.assertNotNull(error);
    }finally{__CLR4_1_101o3a1o3aluszwdvq.R.flushNeeded();}}
    
    
    public void test_error_null() throws Exception {__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceStart(getClass().getName(),77956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xx1nn21o5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o3a1o3aluszwdvq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77956,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xx1nn21o5g() throws Exception{try{__CLR4_1_101o3a1o3aluszwdvq.R.inc(77956);
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77957);String text = "[null";
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77958);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77959);Exception error = null;
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77960);try {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77961);reader.readObject(Model.class);
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77962);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77963);error = ex;
        }
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77964);Assert.assertNotNull(error);
    }finally{__CLR4_1_101o3a1o3aluszwdvq.R.flushNeeded();}}
    
    public void test_error_fn() throws Exception {__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceStart(getClass().getName(),77965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yvwqb71o5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o3a1o3aluszwdvq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_fn",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77965,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yvwqb71o5p() throws Exception{try{__CLR4_1_101o3a1o3aluszwdvq.R.inc(77965);
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77966);String text = "[[n";
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77967);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77968);Exception error = null;
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77969);try {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77970);reader.readObject(Model.class);
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77971);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77972);error = ex;
        }
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77973);Assert.assertNotNull(error);
    }finally{__CLR4_1_101o3a1o3aluszwdvq.R.flushNeeded();}}
    
    public void test_error_fnu() throws Exception {__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceStart(getClass().getName(),77974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107kkea81o5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o3a1o3aluszwdvq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_fnu",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77974,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107kkea81o5y() throws Exception{try{__CLR4_1_101o3a1o3aluszwdvq.R.inc(77974);
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77975);String text = "[[nu";
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77976);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77977);Exception error = null;
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77978);try {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77979);reader.readObject(Model.class);
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77980);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77981);error = ex;
        }
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77982);Assert.assertNotNull(error);
    }finally{__CLR4_1_101o3a1o3aluszwdvq.R.flushNeeded();}}
    
    public void test_error_fnul() throws Exception {__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceStart(getClass().getName(),77983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103f60ba1o67();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o3a1o3aluszwdvq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_fnul",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77983,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103f60ba1o67() throws Exception{try{__CLR4_1_101o3a1o3aluszwdvq.R.inc(77983);
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77984);String text = "[[nul";
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77985);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77986);Exception error = null;
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77987);try {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77988);reader.readObject(Model.class);
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77989);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77990);error = ex;
        }
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77991);Assert.assertNotNull(error);
    }finally{__CLR4_1_101o3a1o3aluszwdvq.R.flushNeeded();}}
    
    
    public void test_error_fnull() throws Exception {__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceStart(getClass().getName(),77992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gu03681o6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o3a1o3aluszwdvq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_fnull",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77992,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gu03681o6g() throws Exception{try{__CLR4_1_101o3a1o3aluszwdvq.R.inc(77992);
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77993);String text = "[[null";
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77994);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77995);Exception error = null;
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(77996);try {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77997);reader.readObject(Model.class);
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77998);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(77999);error = ex;
        }
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(78000);Assert.assertNotNull(error);
    }finally{__CLR4_1_101o3a1o3aluszwdvq.R.flushNeeded();}}
    
    public void test_error_notclose() throws Exception {__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceStart(getClass().getName(),78001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kuh3cg1o6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o3a1o3aluszwdvq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_notclose",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78001,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kuh3cg1o6p() throws Exception{try{__CLR4_1_101o3a1o3aluszwdvq.R.inc(78001);
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(78002);String text = "[[\"aaa";
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(78003);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101o3a1o3aluszwdvq.R.inc(78004);Exception error = null;
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(78005);try {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(78006);reader.readObject(Model.class);
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(78007);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(78008);error = ex;
        }
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(78009);Assert.assertNotNull(error);
    }finally{__CLR4_1_101o3a1o3aluszwdvq.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceStart(getClass().getName(),78010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1o6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o3a1o3aluszwdvq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78010,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1o6y() throws Exception{try{__CLR4_1_101o3a1o3aluszwdvq.R.inc(78010);
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(78011);String text = "[[\"b\"[[{";
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(78012);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101o3a1o3aluszwdvq.R.inc(78013);Exception error = null;
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(78014);try {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(78015);reader.readObject(Model.class);
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(78016);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(78017);error = ex;
        }
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(78018);Assert.assertNotNull(error);
    }finally{__CLR4_1_101o3a1o3aluszwdvq.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceStart(getClass().getName(),78019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1o77();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o3a1o3aluszwdvq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78019,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1o77() throws Exception{try{__CLR4_1_101o3a1o3aluszwdvq.R.inc(78019);
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(78020);String text = "{\"model\":[[][";
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(78021);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_1_101o3a1o3aluszwdvq.R.inc(78022);Exception error = null;
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(78023);try {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(78024);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(78025);error = ex;
        }
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(78026);Assert.assertNotNull(error);
    }finally{__CLR4_1_101o3a1o3aluszwdvq.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceStart(getClass().getName(),78027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1o7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o3a1o3aluszwdvq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o3a1o3aluszwdvq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78027,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1o7f() throws Exception{try{__CLR4_1_101o3a1o3aluszwdvq.R.inc(78027);
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(78028);String text = "{\"model\":[[]}[";
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(78029);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_1_101o3a1o3aluszwdvq.R.inc(78030);Exception error = null;
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(78031);try {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(78032);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(78033);error = ex;
        }
        __CLR4_1_101o3a1o3aluszwdvq.R.inc(78034);Assert.assertNotNull(error);
    }finally{__CLR4_1_101o3a1o3aluszwdvq.R.flushNeeded();}}
    
    @JSONType(parseFeatures = Feature.SupportArrayToBean)
    public static class Model {

        private List<String> values;

        public List<String> getValues() {try{__CLR4_1_101o3a1o3aluszwdvq.R.inc(78035);
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(78036);return values;
        }finally{__CLR4_1_101o3a1o3aluszwdvq.R.flushNeeded();}}

        public void setValues(List<String> values) {try{__CLR4_1_101o3a1o3aluszwdvq.R.inc(78037);
            __CLR4_1_101o3a1o3aluszwdvq.R.inc(78038);this.values = values;
        }finally{__CLR4_1_101o3a1o3aluszwdvq.R.flushNeeded();}}

    }
}
