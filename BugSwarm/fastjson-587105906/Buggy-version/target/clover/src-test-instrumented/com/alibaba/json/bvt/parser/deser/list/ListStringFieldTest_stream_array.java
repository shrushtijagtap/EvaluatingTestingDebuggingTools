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

public class ListStringFieldTest_stream_array extends TestCase {static class __CLR4_1_101n521n52lusqkh51{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,76807,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_1_101n521n52lusqkh51.R.globalSliceStart(getClass().getName(),76646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1059ny8i1n52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n521n52lusqkh51.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n521n52lusqkh51.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76646,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1059ny8i1n52() throws Exception{try{__CLR4_1_101n521n52lusqkh51.R.inc(76646);
        __CLR4_1_101n521n52lusqkh51.R.inc(76647);String text = "[[\"a\",null,\"b\",\"ab\\\\c\\\"a\"]]";

        __CLR4_1_101n521n52lusqkh51.R.inc(76648);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101n521n52lusqkh51.R.inc(76649);Model model = reader.readObject(Model.class);
        __CLR4_1_101n521n52lusqkh51.R.inc(76650);Assert.assertEquals(4, model.values.size());
        __CLR4_1_101n521n52lusqkh51.R.inc(76651);Assert.assertEquals("a", model.values.get(0));
        __CLR4_1_101n521n52lusqkh51.R.inc(76652);Assert.assertEquals(null, model.values.get(1));
        __CLR4_1_101n521n52lusqkh51.R.inc(76653);Assert.assertEquals("b", model.values.get(2));
        __CLR4_1_101n521n52lusqkh51.R.inc(76654);Assert.assertEquals("ab\\c\"a", model.values.get(3));
    }finally{__CLR4_1_101n521n52lusqkh51.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_1_101n521n52lusqkh51.R.globalSliceStart(getClass().getName(),76655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1n5b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n521n52lusqkh51.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n521n52lusqkh51.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76655,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1n5b() throws Exception{try{__CLR4_1_101n521n52lusqkh51.R.inc(76655);
        __CLR4_1_101n521n52lusqkh51.R.inc(76656);String text = "[null]";
        __CLR4_1_101n521n52lusqkh51.R.inc(76657);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101n521n52lusqkh51.R.inc(76658);Model model = reader.readObject(Model.class);
        __CLR4_1_101n521n52lusqkh51.R.inc(76659);Assert.assertNull(model.values);
    }finally{__CLR4_1_101n521n52lusqkh51.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_1_101n521n52lusqkh51.R.globalSliceStart(getClass().getName(),76660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m1ch211n5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n521n52lusqkh51.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n521n52lusqkh51.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76660,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m1ch211n5g() throws Exception{try{__CLR4_1_101n521n52lusqkh51.R.inc(76660);
        __CLR4_1_101n521n52lusqkh51.R.inc(76661);String text = "[[]]}";
        __CLR4_1_101n521n52lusqkh51.R.inc(76662);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101n521n52lusqkh51.R.inc(76663);Model model = reader.readObject(Model.class);
        __CLR4_1_101n521n52lusqkh51.R.inc(76664);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101n521n52lusqkh51.R.flushNeeded();}}

    public void test_map_empty() throws Exception {__CLR4_1_101n521n52lusqkh51.R.globalSliceStart(getClass().getName(),76665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lmhrdw1n5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n521n52lusqkh51.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n521n52lusqkh51.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_map_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76665,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lmhrdw1n5l() throws Exception{try{__CLR4_1_101n521n52lusqkh51.R.inc(76665);
        __CLR4_1_101n521n52lusqkh51.R.inc(76666);String text = "{\"model\":[[]]}";
        __CLR4_1_101n521n52lusqkh51.R.inc(76667);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101n521n52lusqkh51.R.inc(76668);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_1_101n521n52lusqkh51.R.inc(76669);Model model = (Model) map.get("model");
        __CLR4_1_101n521n52lusqkh51.R.inc(76670);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101n521n52lusqkh51.R.flushNeeded();}}
    
    public void test_map_empty_2() throws Exception {__CLR4_1_101n521n52lusqkh51.R.globalSliceStart(getClass().getName(),76671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n63rwp1n5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n521n52lusqkh51.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n521n52lusqkh51.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_map_empty_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76671,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n63rwp1n5r() throws Exception{try{__CLR4_1_101n521n52lusqkh51.R.inc(76671);
        __CLR4_1_101n521n52lusqkh51.R.inc(76672);String text = "{\"model\":[[]],\"model2\":[[]]}";
        __CLR4_1_101n521n52lusqkh51.R.inc(76673);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101n521n52lusqkh51.R.inc(76674);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_1_101n521n52lusqkh51.R.inc(76675);Model model = (Model) map.get("model");
        __CLR4_1_101n521n52lusqkh51.R.inc(76676);Assert.assertEquals(0, model.values.size());
        
        __CLR4_1_101n521n52lusqkh51.R.inc(76677);Model model2 = (Model) map.get("model2");
        __CLR4_1_101n521n52lusqkh51.R.inc(76678);Assert.assertEquals(0, model2.values.size());
    }finally{__CLR4_1_101n521n52lusqkh51.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101n521n52lusqkh51.R.globalSliceStart(getClass().getName(),76679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1n5z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n521n52lusqkh51.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n521n52lusqkh51.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76679,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1n5z() throws Exception{try{__CLR4_1_101n521n52lusqkh51.R.inc(76679);
        __CLR4_1_101n521n52lusqkh51.R.inc(76680);String text = "[[1{1,}";
        __CLR4_1_101n521n52lusqkh51.R.inc(76681);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101n521n52lusqkh51.R.inc(76682);Exception error = null;
        __CLR4_1_101n521n52lusqkh51.R.inc(76683);try {
            __CLR4_1_101n521n52lusqkh51.R.inc(76684);reader.readObject(Model.class);
            __CLR4_1_101n521n52lusqkh51.R.inc(76685);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101n521n52lusqkh51.R.inc(76686);error = ex;
        }
        __CLR4_1_101n521n52lusqkh51.R.inc(76687);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n521n52lusqkh51.R.flushNeeded();}}
    
    public void test_error_0() throws Exception {__CLR4_1_101n521n52lusqkh51.R.globalSliceStart(getClass().getName(),76688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1n68();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n521n52lusqkh51.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n521n52lusqkh51.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76688,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1n68() throws Exception{try{__CLR4_1_101n521n52lusqkh51.R.inc(76688);
        __CLR4_1_101n521n52lusqkh51.R.inc(76689);String text = "[{";
        __CLR4_1_101n521n52lusqkh51.R.inc(76690);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101n521n52lusqkh51.R.inc(76691);Exception error = null;
        __CLR4_1_101n521n52lusqkh51.R.inc(76692);try {
            __CLR4_1_101n521n52lusqkh51.R.inc(76693);reader.readObject(Model.class);
            __CLR4_1_101n521n52lusqkh51.R.inc(76694);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101n521n52lusqkh51.R.inc(76695);error = ex;
        }
        __CLR4_1_101n521n52lusqkh51.R.inc(76696);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n521n52lusqkh51.R.flushNeeded();}}
    
    public void test_error_n() throws Exception {__CLR4_1_101n521n52lusqkh51.R.globalSliceStart(getClass().getName(),76697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103ey91t1n6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n521n52lusqkh51.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n521n52lusqkh51.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_n",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76697,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103ey91t1n6h() throws Exception{try{__CLR4_1_101n521n52lusqkh51.R.inc(76697);
        __CLR4_1_101n521n52lusqkh51.R.inc(76698);String text = "[n";
        __CLR4_1_101n521n52lusqkh51.R.inc(76699);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101n521n52lusqkh51.R.inc(76700);Exception error = null;
        __CLR4_1_101n521n52lusqkh51.R.inc(76701);try {
            __CLR4_1_101n521n52lusqkh51.R.inc(76702);reader.readObject(Model.class);
            __CLR4_1_101n521n52lusqkh51.R.inc(76703);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101n521n52lusqkh51.R.inc(76704);error = ex;
        }
        __CLR4_1_101n521n52lusqkh51.R.inc(76705);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n521n52lusqkh51.R.flushNeeded();}}
    
    public void test_error_nu() throws Exception {__CLR4_1_101n521n52lusqkh51.R.globalSliceStart(getClass().getName(),76706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10b9biaa1n6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n521n52lusqkh51.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n521n52lusqkh51.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_nu",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76706,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10b9biaa1n6q() throws Exception{try{__CLR4_1_101n521n52lusqkh51.R.inc(76706);
        __CLR4_1_101n521n52lusqkh51.R.inc(76707);String text = "[nu";
        __CLR4_1_101n521n52lusqkh51.R.inc(76708);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101n521n52lusqkh51.R.inc(76709);Exception error = null;
        __CLR4_1_101n521n52lusqkh51.R.inc(76710);try {
            __CLR4_1_101n521n52lusqkh51.R.inc(76711);reader.readObject(Model.class);
            __CLR4_1_101n521n52lusqkh51.R.inc(76712);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101n521n52lusqkh51.R.inc(76713);error = ex;
        }
        __CLR4_1_101n521n52lusqkh51.R.inc(76714);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n521n52lusqkh51.R.flushNeeded();}}
    
    public void test_error_nul() throws Exception {__CLR4_1_101n521n52lusqkh51.R.globalSliceStart(getClass().getName(),76715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c2eljc1n6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n521n52lusqkh51.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n521n52lusqkh51.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_nul",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76715,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c2eljc1n6z() throws Exception{try{__CLR4_1_101n521n52lusqkh51.R.inc(76715);
        __CLR4_1_101n521n52lusqkh51.R.inc(76716);String text = "[nul";
        __CLR4_1_101n521n52lusqkh51.R.inc(76717);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101n521n52lusqkh51.R.inc(76718);Exception error = null;
        __CLR4_1_101n521n52lusqkh51.R.inc(76719);try {
            __CLR4_1_101n521n52lusqkh51.R.inc(76720);reader.readObject(Model.class);
            __CLR4_1_101n521n52lusqkh51.R.inc(76721);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101n521n52lusqkh51.R.inc(76722);error = ex;
        }
        __CLR4_1_101n521n52lusqkh51.R.inc(76723);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n521n52lusqkh51.R.flushNeeded();}}
    
    
    public void test_error_null() throws Exception {__CLR4_1_101n521n52lusqkh51.R.globalSliceStart(getClass().getName(),76724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xx1nn21n78();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n521n52lusqkh51.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n521n52lusqkh51.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76724,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xx1nn21n78() throws Exception{try{__CLR4_1_101n521n52lusqkh51.R.inc(76724);
        __CLR4_1_101n521n52lusqkh51.R.inc(76725);String text = "[null";
        __CLR4_1_101n521n52lusqkh51.R.inc(76726);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101n521n52lusqkh51.R.inc(76727);Exception error = null;
        __CLR4_1_101n521n52lusqkh51.R.inc(76728);try {
            __CLR4_1_101n521n52lusqkh51.R.inc(76729);reader.readObject(Model.class);
            __CLR4_1_101n521n52lusqkh51.R.inc(76730);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101n521n52lusqkh51.R.inc(76731);error = ex;
        }
        __CLR4_1_101n521n52lusqkh51.R.inc(76732);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n521n52lusqkh51.R.flushNeeded();}}
    
    public void test_error_fn() throws Exception {__CLR4_1_101n521n52lusqkh51.R.globalSliceStart(getClass().getName(),76733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yvwqb71n7h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n521n52lusqkh51.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n521n52lusqkh51.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_fn",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76733,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yvwqb71n7h() throws Exception{try{__CLR4_1_101n521n52lusqkh51.R.inc(76733);
        __CLR4_1_101n521n52lusqkh51.R.inc(76734);String text = "[[n";
        __CLR4_1_101n521n52lusqkh51.R.inc(76735);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101n521n52lusqkh51.R.inc(76736);Exception error = null;
        __CLR4_1_101n521n52lusqkh51.R.inc(76737);try {
            __CLR4_1_101n521n52lusqkh51.R.inc(76738);reader.readObject(Model.class);
            __CLR4_1_101n521n52lusqkh51.R.inc(76739);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101n521n52lusqkh51.R.inc(76740);error = ex;
        }
        __CLR4_1_101n521n52lusqkh51.R.inc(76741);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n521n52lusqkh51.R.flushNeeded();}}
    
    public void test_error_fnu() throws Exception {__CLR4_1_101n521n52lusqkh51.R.globalSliceStart(getClass().getName(),76742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107kkea81n7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n521n52lusqkh51.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n521n52lusqkh51.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_fnu",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76742,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107kkea81n7q() throws Exception{try{__CLR4_1_101n521n52lusqkh51.R.inc(76742);
        __CLR4_1_101n521n52lusqkh51.R.inc(76743);String text = "[[nu";
        __CLR4_1_101n521n52lusqkh51.R.inc(76744);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101n521n52lusqkh51.R.inc(76745);Exception error = null;
        __CLR4_1_101n521n52lusqkh51.R.inc(76746);try {
            __CLR4_1_101n521n52lusqkh51.R.inc(76747);reader.readObject(Model.class);
            __CLR4_1_101n521n52lusqkh51.R.inc(76748);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101n521n52lusqkh51.R.inc(76749);error = ex;
        }
        __CLR4_1_101n521n52lusqkh51.R.inc(76750);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n521n52lusqkh51.R.flushNeeded();}}
    
    public void test_error_fnul() throws Exception {__CLR4_1_101n521n52lusqkh51.R.globalSliceStart(getClass().getName(),76751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103f60ba1n7z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n521n52lusqkh51.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n521n52lusqkh51.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_fnul",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76751,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103f60ba1n7z() throws Exception{try{__CLR4_1_101n521n52lusqkh51.R.inc(76751);
        __CLR4_1_101n521n52lusqkh51.R.inc(76752);String text = "[[nul";
        __CLR4_1_101n521n52lusqkh51.R.inc(76753);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101n521n52lusqkh51.R.inc(76754);Exception error = null;
        __CLR4_1_101n521n52lusqkh51.R.inc(76755);try {
            __CLR4_1_101n521n52lusqkh51.R.inc(76756);reader.readObject(Model.class);
            __CLR4_1_101n521n52lusqkh51.R.inc(76757);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101n521n52lusqkh51.R.inc(76758);error = ex;
        }
        __CLR4_1_101n521n52lusqkh51.R.inc(76759);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n521n52lusqkh51.R.flushNeeded();}}
    
    
    public void test_error_fnull() throws Exception {__CLR4_1_101n521n52lusqkh51.R.globalSliceStart(getClass().getName(),76760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gu03681n88();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n521n52lusqkh51.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n521n52lusqkh51.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_fnull",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76760,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gu03681n88() throws Exception{try{__CLR4_1_101n521n52lusqkh51.R.inc(76760);
        __CLR4_1_101n521n52lusqkh51.R.inc(76761);String text = "[[null";
        __CLR4_1_101n521n52lusqkh51.R.inc(76762);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101n521n52lusqkh51.R.inc(76763);Exception error = null;
        __CLR4_1_101n521n52lusqkh51.R.inc(76764);try {
            __CLR4_1_101n521n52lusqkh51.R.inc(76765);reader.readObject(Model.class);
            __CLR4_1_101n521n52lusqkh51.R.inc(76766);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101n521n52lusqkh51.R.inc(76767);error = ex;
        }
        __CLR4_1_101n521n52lusqkh51.R.inc(76768);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n521n52lusqkh51.R.flushNeeded();}}
    
    public void test_error_notclose() throws Exception {__CLR4_1_101n521n52lusqkh51.R.globalSliceStart(getClass().getName(),76769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kuh3cg1n8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n521n52lusqkh51.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n521n52lusqkh51.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_notclose",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76769,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kuh3cg1n8h() throws Exception{try{__CLR4_1_101n521n52lusqkh51.R.inc(76769);
        __CLR4_1_101n521n52lusqkh51.R.inc(76770);String text = "[[\"aaa";
        __CLR4_1_101n521n52lusqkh51.R.inc(76771);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101n521n52lusqkh51.R.inc(76772);Exception error = null;
        __CLR4_1_101n521n52lusqkh51.R.inc(76773);try {
            __CLR4_1_101n521n52lusqkh51.R.inc(76774);reader.readObject(Model.class);
            __CLR4_1_101n521n52lusqkh51.R.inc(76775);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101n521n52lusqkh51.R.inc(76776);error = ex;
        }
        __CLR4_1_101n521n52lusqkh51.R.inc(76777);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n521n52lusqkh51.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_1_101n521n52lusqkh51.R.globalSliceStart(getClass().getName(),76778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1n8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n521n52lusqkh51.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n521n52lusqkh51.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76778,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1n8q() throws Exception{try{__CLR4_1_101n521n52lusqkh51.R.inc(76778);
        __CLR4_1_101n521n52lusqkh51.R.inc(76779);String text = "[[\"b\"[[{";
        __CLR4_1_101n521n52lusqkh51.R.inc(76780);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101n521n52lusqkh51.R.inc(76781);Exception error = null;
        __CLR4_1_101n521n52lusqkh51.R.inc(76782);try {
            __CLR4_1_101n521n52lusqkh51.R.inc(76783);reader.readObject(Model.class);
            __CLR4_1_101n521n52lusqkh51.R.inc(76784);reader.close();
        } catch (JSONException ex) {
            __CLR4_1_101n521n52lusqkh51.R.inc(76785);error = ex;
        }
        __CLR4_1_101n521n52lusqkh51.R.inc(76786);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n521n52lusqkh51.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_1_101n521n52lusqkh51.R.globalSliceStart(getClass().getName(),76787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1n8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n521n52lusqkh51.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n521n52lusqkh51.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76787,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1n8z() throws Exception{try{__CLR4_1_101n521n52lusqkh51.R.inc(76787);
        __CLR4_1_101n521n52lusqkh51.R.inc(76788);String text = "{\"model\":[[][";
        __CLR4_1_101n521n52lusqkh51.R.inc(76789);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_1_101n521n52lusqkh51.R.inc(76790);Exception error = null;
        __CLR4_1_101n521n52lusqkh51.R.inc(76791);try {
            __CLR4_1_101n521n52lusqkh51.R.inc(76792);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101n521n52lusqkh51.R.inc(76793);error = ex;
        }
        __CLR4_1_101n521n52lusqkh51.R.inc(76794);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n521n52lusqkh51.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_1_101n521n52lusqkh51.R.globalSliceStart(getClass().getName(),76795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1n97();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n521n52lusqkh51.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n521n52lusqkh51.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76795,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1n97() throws Exception{try{__CLR4_1_101n521n52lusqkh51.R.inc(76795);
        __CLR4_1_101n521n52lusqkh51.R.inc(76796);String text = "{\"model\":[[]}[";
        __CLR4_1_101n521n52lusqkh51.R.inc(76797);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_1_101n521n52lusqkh51.R.inc(76798);Exception error = null;
        __CLR4_1_101n521n52lusqkh51.R.inc(76799);try {
            __CLR4_1_101n521n52lusqkh51.R.inc(76800);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101n521n52lusqkh51.R.inc(76801);error = ex;
        }
        __CLR4_1_101n521n52lusqkh51.R.inc(76802);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n521n52lusqkh51.R.flushNeeded();}}
    
    @JSONType(parseFeatures = Feature.SupportArrayToBean)
    public static class Model {

        private List<String> values;

        public List<String> getValues() {try{__CLR4_1_101n521n52lusqkh51.R.inc(76803);
            __CLR4_1_101n521n52lusqkh51.R.inc(76804);return values;
        }finally{__CLR4_1_101n521n52lusqkh51.R.flushNeeded();}}

        public void setValues(List<String> values) {try{__CLR4_1_101n521n52lusqkh51.R.inc(76805);
            __CLR4_1_101n521n52lusqkh51.R.inc(76806);this.values = values;
        }finally{__CLR4_1_101n521n52lusqkh51.R.flushNeeded();}}

    }
}
