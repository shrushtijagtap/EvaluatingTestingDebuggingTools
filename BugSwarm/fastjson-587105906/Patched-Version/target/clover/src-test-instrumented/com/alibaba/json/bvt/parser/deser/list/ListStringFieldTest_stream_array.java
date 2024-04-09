/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.list;

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

public class ListStringFieldTest_stream_array extends TestCase {static class __CLR4_5_21o2z1o2zlusvnewr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,78028,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceStart(getClass().getName(),77867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259ny8i1o2z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o2z1o2zlusvnewr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77867,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259ny8i1o2z() throws Exception{try{__CLR4_5_21o2z1o2zlusvnewr.R.inc(77867);
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77868);String text = "[[\"a\",null,\"b\",\"ab\\\\c\\\"a\"]]";

        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77869);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77870);Model model = reader.readObject(Model.class);
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77871);Assert.assertEquals(4, model.values.size());
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77872);Assert.assertEquals("a", model.values.get(0));
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77873);Assert.assertEquals(null, model.values.get(1));
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77874);Assert.assertEquals("b", model.values.get(2));
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77875);Assert.assertEquals("ab\\c\"a", model.values.get(3));
    }finally{__CLR4_5_21o2z1o2zlusvnewr.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceStart(getClass().getName(),77876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1o38();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o2z1o2zlusvnewr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77876,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1o38() throws Exception{try{__CLR4_5_21o2z1o2zlusvnewr.R.inc(77876);
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77877);String text = "[null]";
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77878);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77879);Model model = reader.readObject(Model.class);
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77880);Assert.assertNull(model.values);
    }finally{__CLR4_5_21o2z1o2zlusvnewr.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceStart(getClass().getName(),77881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m1ch211o3d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o2z1o2zlusvnewr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77881,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m1ch211o3d() throws Exception{try{__CLR4_5_21o2z1o2zlusvnewr.R.inc(77881);
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77882);String text = "[[]]}";
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77883);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77884);Model model = reader.readObject(Model.class);
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77885);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_5_21o2z1o2zlusvnewr.R.flushNeeded();}}

    public void test_map_empty() throws Exception {__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceStart(getClass().getName(),77886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lmhrdw1o3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o2z1o2zlusvnewr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_map_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77886,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lmhrdw1o3i() throws Exception{try{__CLR4_5_21o2z1o2zlusvnewr.R.inc(77886);
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77887);String text = "{\"model\":[[]]}";
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77888);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77889);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77890);Model model = (Model) map.get("model");
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77891);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_5_21o2z1o2zlusvnewr.R.flushNeeded();}}
    
    public void test_map_empty_2() throws Exception {__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceStart(getClass().getName(),77892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n63rwp1o3o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o2z1o2zlusvnewr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_map_empty_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77892,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n63rwp1o3o() throws Exception{try{__CLR4_5_21o2z1o2zlusvnewr.R.inc(77892);
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77893);String text = "{\"model\":[[]],\"model2\":[[]]}";
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77894);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77895);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77896);Model model = (Model) map.get("model");
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77897);Assert.assertEquals(0, model.values.size());
        
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77898);Model model2 = (Model) map.get("model2");
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77899);Assert.assertEquals(0, model2.values.size());
    }finally{__CLR4_5_21o2z1o2zlusvnewr.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceStart(getClass().getName(),77900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1o3w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o2z1o2zlusvnewr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77900,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1o3w() throws Exception{try{__CLR4_5_21o2z1o2zlusvnewr.R.inc(77900);
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77901);String text = "[[1{1,}";
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77902);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77903);Exception error = null;
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77904);try {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77905);reader.readObject(Model.class);
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77906);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77907);error = ex;
        }
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77908);Assert.assertNotNull(error);
    }finally{__CLR4_5_21o2z1o2zlusvnewr.R.flushNeeded();}}
    
    public void test_error_0() throws Exception {__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceStart(getClass().getName(),77909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxv1o45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o2z1o2zlusvnewr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77909,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxv1o45() throws Exception{try{__CLR4_5_21o2z1o2zlusvnewr.R.inc(77909);
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77910);String text = "[{";
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77911);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77912);Exception error = null;
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77913);try {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77914);reader.readObject(Model.class);
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77915);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77916);error = ex;
        }
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77917);Assert.assertNotNull(error);
    }finally{__CLR4_5_21o2z1o2zlusvnewr.R.flushNeeded();}}
    
    public void test_error_n() throws Exception {__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceStart(getClass().getName(),77918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23ey91t1o4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o2z1o2zlusvnewr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_n",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77918,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23ey91t1o4e() throws Exception{try{__CLR4_5_21o2z1o2zlusvnewr.R.inc(77918);
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77919);String text = "[n";
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77920);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77921);Exception error = null;
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77922);try {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77923);reader.readObject(Model.class);
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77924);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77925);error = ex;
        }
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77926);Assert.assertNotNull(error);
    }finally{__CLR4_5_21o2z1o2zlusvnewr.R.flushNeeded();}}
    
    public void test_error_nu() throws Exception {__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceStart(getClass().getName(),77927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b9biaa1o4n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o2z1o2zlusvnewr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_nu",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77927,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b9biaa1o4n() throws Exception{try{__CLR4_5_21o2z1o2zlusvnewr.R.inc(77927);
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77928);String text = "[nu";
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77929);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77930);Exception error = null;
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77931);try {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77932);reader.readObject(Model.class);
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77933);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77934);error = ex;
        }
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77935);Assert.assertNotNull(error);
    }finally{__CLR4_5_21o2z1o2zlusvnewr.R.flushNeeded();}}
    
    public void test_error_nul() throws Exception {__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceStart(getClass().getName(),77936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c2eljc1o4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o2z1o2zlusvnewr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_nul",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77936,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c2eljc1o4w() throws Exception{try{__CLR4_5_21o2z1o2zlusvnewr.R.inc(77936);
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77937);String text = "[nul";
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77938);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77939);Exception error = null;
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77940);try {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77941);reader.readObject(Model.class);
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77942);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77943);error = ex;
        }
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77944);Assert.assertNotNull(error);
    }finally{__CLR4_5_21o2z1o2zlusvnewr.R.flushNeeded();}}
    
    
    public void test_error_null() throws Exception {__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceStart(getClass().getName(),77945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xx1nn21o55();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o2z1o2zlusvnewr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77945,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xx1nn21o55() throws Exception{try{__CLR4_5_21o2z1o2zlusvnewr.R.inc(77945);
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77946);String text = "[null";
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77947);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77948);Exception error = null;
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77949);try {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77950);reader.readObject(Model.class);
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77951);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77952);error = ex;
        }
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77953);Assert.assertNotNull(error);
    }finally{__CLR4_5_21o2z1o2zlusvnewr.R.flushNeeded();}}
    
    public void test_error_fn() throws Exception {__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceStart(getClass().getName(),77954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yvwqb71o5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o2z1o2zlusvnewr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_fn",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77954,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yvwqb71o5e() throws Exception{try{__CLR4_5_21o2z1o2zlusvnewr.R.inc(77954);
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77955);String text = "[[n";
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77956);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77957);Exception error = null;
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77958);try {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77959);reader.readObject(Model.class);
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77960);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77961);error = ex;
        }
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77962);Assert.assertNotNull(error);
    }finally{__CLR4_5_21o2z1o2zlusvnewr.R.flushNeeded();}}
    
    public void test_error_fnu() throws Exception {__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceStart(getClass().getName(),77963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27kkea81o5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o2z1o2zlusvnewr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_fnu",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77963,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27kkea81o5n() throws Exception{try{__CLR4_5_21o2z1o2zlusvnewr.R.inc(77963);
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77964);String text = "[[nu";
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77965);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77966);Exception error = null;
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77967);try {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77968);reader.readObject(Model.class);
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77969);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77970);error = ex;
        }
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77971);Assert.assertNotNull(error);
    }finally{__CLR4_5_21o2z1o2zlusvnewr.R.flushNeeded();}}
    
    public void test_error_fnul() throws Exception {__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceStart(getClass().getName(),77972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23f60ba1o5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o2z1o2zlusvnewr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_fnul",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77972,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23f60ba1o5w() throws Exception{try{__CLR4_5_21o2z1o2zlusvnewr.R.inc(77972);
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77973);String text = "[[nul";
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77974);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77975);Exception error = null;
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77976);try {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77977);reader.readObject(Model.class);
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77978);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77979);error = ex;
        }
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77980);Assert.assertNotNull(error);
    }finally{__CLR4_5_21o2z1o2zlusvnewr.R.flushNeeded();}}
    
    
    public void test_error_fnull() throws Exception {__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceStart(getClass().getName(),77981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gu03681o65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o2z1o2zlusvnewr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_fnull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77981,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gu03681o65() throws Exception{try{__CLR4_5_21o2z1o2zlusvnewr.R.inc(77981);
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77982);String text = "[[null";
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77983);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77984);Exception error = null;
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77985);try {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77986);reader.readObject(Model.class);
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77987);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77988);error = ex;
        }
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77989);Assert.assertNotNull(error);
    }finally{__CLR4_5_21o2z1o2zlusvnewr.R.flushNeeded();}}
    
    public void test_error_notclose() throws Exception {__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceStart(getClass().getName(),77990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kuh3cg1o6e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o2z1o2zlusvnewr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_notclose",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77990,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kuh3cg1o6e() throws Exception{try{__CLR4_5_21o2z1o2zlusvnewr.R.inc(77990);
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77991);String text = "[[\"aaa";
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77992);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77993);Exception error = null;
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77994);try {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77995);reader.readObject(Model.class);
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77996);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(77997);error = ex;
        }
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(77998);Assert.assertNotNull(error);
    }finally{__CLR4_5_21o2z1o2zlusvnewr.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceStart(getClass().getName(),77999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1o6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o2z1o2zlusvnewr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77999,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1o6n() throws Exception{try{__CLR4_5_21o2z1o2zlusvnewr.R.inc(77999);
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(78000);String text = "[[\"b\"[[{";
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(78001);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21o2z1o2zlusvnewr.R.inc(78002);Exception error = null;
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(78003);try {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(78004);reader.readObject(Model.class);
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(78005);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(78006);error = ex;
        }
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(78007);Assert.assertNotNull(error);
    }finally{__CLR4_5_21o2z1o2zlusvnewr.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceStart(getClass().getName(),78008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1o6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o2z1o2zlusvnewr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78008,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1o6w() throws Exception{try{__CLR4_5_21o2z1o2zlusvnewr.R.inc(78008);
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(78009);String text = "{\"model\":[[][";
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(78010);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_5_21o2z1o2zlusvnewr.R.inc(78011);Exception error = null;
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(78012);try {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(78013);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(78014);error = ex;
        }
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(78015);Assert.assertNotNull(error);
    }finally{__CLR4_5_21o2z1o2zlusvnewr.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceStart(getClass().getName(),78016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1o74();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o2z1o2zlusvnewr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o2z1o2zlusvnewr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78016,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1o74() throws Exception{try{__CLR4_5_21o2z1o2zlusvnewr.R.inc(78016);
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(78017);String text = "{\"model\":[[]}[";
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(78018);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_5_21o2z1o2zlusvnewr.R.inc(78019);Exception error = null;
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(78020);try {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(78021);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(78022);error = ex;
        }
        __CLR4_5_21o2z1o2zlusvnewr.R.inc(78023);Assert.assertNotNull(error);
    }finally{__CLR4_5_21o2z1o2zlusvnewr.R.flushNeeded();}}
    
    @JSONType(parseFeatures = Feature.SupportArrayToBean)
    public static class Model {

        private List<String> values;

        public List<String> getValues() {try{__CLR4_5_21o2z1o2zlusvnewr.R.inc(78024);
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(78025);return values;
        }finally{__CLR4_5_21o2z1o2zlusvnewr.R.flushNeeded();}}

        public void setValues(List<String> values) {try{__CLR4_5_21o2z1o2zlusvnewr.R.inc(78026);
            __CLR4_5_21o2z1o2zlusvnewr.R.inc(78027);this.values = values;
        }finally{__CLR4_5_21o2z1o2zlusvnewr.R.flushNeeded();}}

    }
}
