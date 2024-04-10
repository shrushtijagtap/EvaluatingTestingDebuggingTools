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

public class ListStringFieldTest_stream_array extends TestCase {static class __CLR4_5_21n4r1n4rlusyjudb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,76796,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceStart(getClass().getName(),76635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259ny8i1n4r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n4r1n4rlusyjudb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76635,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259ny8i1n4r() throws Exception{try{__CLR4_5_21n4r1n4rlusyjudb.R.inc(76635);
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76636);String text = "[[\"a\",null,\"b\",\"ab\\\\c\\\"a\"]]";

        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76637);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76638);Model model = reader.readObject(Model.class);
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76639);Assert.assertEquals(4, model.values.size());
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76640);Assert.assertEquals("a", model.values.get(0));
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76641);Assert.assertEquals(null, model.values.get(1));
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76642);Assert.assertEquals("b", model.values.get(2));
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76643);Assert.assertEquals("ab\\c\"a", model.values.get(3));
    }finally{__CLR4_5_21n4r1n4rlusyjudb.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceStart(getClass().getName(),76644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1n50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n4r1n4rlusyjudb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76644,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1n50() throws Exception{try{__CLR4_5_21n4r1n4rlusyjudb.R.inc(76644);
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76645);String text = "[null]";
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76646);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76647);Model model = reader.readObject(Model.class);
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76648);Assert.assertNull(model.values);
    }finally{__CLR4_5_21n4r1n4rlusyjudb.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceStart(getClass().getName(),76649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m1ch211n55();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n4r1n4rlusyjudb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76649,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m1ch211n55() throws Exception{try{__CLR4_5_21n4r1n4rlusyjudb.R.inc(76649);
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76650);String text = "[[]]}";
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76651);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76652);Model model = reader.readObject(Model.class);
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76653);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_5_21n4r1n4rlusyjudb.R.flushNeeded();}}

    public void test_map_empty() throws Exception {__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceStart(getClass().getName(),76654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lmhrdw1n5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n4r1n4rlusyjudb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_map_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76654,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lmhrdw1n5a() throws Exception{try{__CLR4_5_21n4r1n4rlusyjudb.R.inc(76654);
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76655);String text = "{\"model\":[[]]}";
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76656);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76657);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76658);Model model = (Model) map.get("model");
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76659);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_5_21n4r1n4rlusyjudb.R.flushNeeded();}}
    
    public void test_map_empty_2() throws Exception {__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceStart(getClass().getName(),76660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n63rwp1n5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n4r1n4rlusyjudb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_map_empty_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76660,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n63rwp1n5g() throws Exception{try{__CLR4_5_21n4r1n4rlusyjudb.R.inc(76660);
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76661);String text = "{\"model\":[[]],\"model2\":[[]]}";
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76662);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76663);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76664);Model model = (Model) map.get("model");
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76665);Assert.assertEquals(0, model.values.size());
        
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76666);Model model2 = (Model) map.get("model2");
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76667);Assert.assertEquals(0, model2.values.size());
    }finally{__CLR4_5_21n4r1n4rlusyjudb.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceStart(getClass().getName(),76668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1n5o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n4r1n4rlusyjudb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76668,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1n5o() throws Exception{try{__CLR4_5_21n4r1n4rlusyjudb.R.inc(76668);
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76669);String text = "[[1{1,}";
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76670);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76671);Exception error = null;
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76672);try {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76673);reader.readObject(Model.class);
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76674);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76675);error = ex;
        }
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76676);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n4r1n4rlusyjudb.R.flushNeeded();}}
    
    public void test_error_0() throws Exception {__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceStart(getClass().getName(),76677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxv1n5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n4r1n4rlusyjudb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76677,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxv1n5x() throws Exception{try{__CLR4_5_21n4r1n4rlusyjudb.R.inc(76677);
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76678);String text = "[{";
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76679);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76680);Exception error = null;
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76681);try {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76682);reader.readObject(Model.class);
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76683);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76684);error = ex;
        }
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76685);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n4r1n4rlusyjudb.R.flushNeeded();}}
    
    public void test_error_n() throws Exception {__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceStart(getClass().getName(),76686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23ey91t1n66();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n4r1n4rlusyjudb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_n",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76686,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23ey91t1n66() throws Exception{try{__CLR4_5_21n4r1n4rlusyjudb.R.inc(76686);
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76687);String text = "[n";
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76688);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76689);Exception error = null;
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76690);try {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76691);reader.readObject(Model.class);
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76692);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76693);error = ex;
        }
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76694);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n4r1n4rlusyjudb.R.flushNeeded();}}
    
    public void test_error_nu() throws Exception {__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceStart(getClass().getName(),76695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b9biaa1n6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n4r1n4rlusyjudb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_nu",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76695,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b9biaa1n6f() throws Exception{try{__CLR4_5_21n4r1n4rlusyjudb.R.inc(76695);
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76696);String text = "[nu";
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76697);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76698);Exception error = null;
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76699);try {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76700);reader.readObject(Model.class);
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76701);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76702);error = ex;
        }
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76703);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n4r1n4rlusyjudb.R.flushNeeded();}}
    
    public void test_error_nul() throws Exception {__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceStart(getClass().getName(),76704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c2eljc1n6o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n4r1n4rlusyjudb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_nul",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76704,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c2eljc1n6o() throws Exception{try{__CLR4_5_21n4r1n4rlusyjudb.R.inc(76704);
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76705);String text = "[nul";
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76706);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76707);Exception error = null;
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76708);try {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76709);reader.readObject(Model.class);
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76710);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76711);error = ex;
        }
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76712);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n4r1n4rlusyjudb.R.flushNeeded();}}
    
    
    public void test_error_null() throws Exception {__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceStart(getClass().getName(),76713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xx1nn21n6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n4r1n4rlusyjudb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76713,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xx1nn21n6x() throws Exception{try{__CLR4_5_21n4r1n4rlusyjudb.R.inc(76713);
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76714);String text = "[null";
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76715);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76716);Exception error = null;
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76717);try {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76718);reader.readObject(Model.class);
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76719);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76720);error = ex;
        }
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76721);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n4r1n4rlusyjudb.R.flushNeeded();}}
    
    public void test_error_fn() throws Exception {__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceStart(getClass().getName(),76722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yvwqb71n76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n4r1n4rlusyjudb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_fn",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76722,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yvwqb71n76() throws Exception{try{__CLR4_5_21n4r1n4rlusyjudb.R.inc(76722);
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76723);String text = "[[n";
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76724);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76725);Exception error = null;
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76726);try {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76727);reader.readObject(Model.class);
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76728);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76729);error = ex;
        }
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76730);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n4r1n4rlusyjudb.R.flushNeeded();}}
    
    public void test_error_fnu() throws Exception {__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceStart(getClass().getName(),76731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27kkea81n7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n4r1n4rlusyjudb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_fnu",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76731,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27kkea81n7f() throws Exception{try{__CLR4_5_21n4r1n4rlusyjudb.R.inc(76731);
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76732);String text = "[[nu";
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76733);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76734);Exception error = null;
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76735);try {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76736);reader.readObject(Model.class);
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76737);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76738);error = ex;
        }
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76739);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n4r1n4rlusyjudb.R.flushNeeded();}}
    
    public void test_error_fnul() throws Exception {__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceStart(getClass().getName(),76740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23f60ba1n7o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n4r1n4rlusyjudb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_fnul",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76740,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23f60ba1n7o() throws Exception{try{__CLR4_5_21n4r1n4rlusyjudb.R.inc(76740);
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76741);String text = "[[nul";
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76742);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76743);Exception error = null;
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76744);try {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76745);reader.readObject(Model.class);
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76746);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76747);error = ex;
        }
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76748);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n4r1n4rlusyjudb.R.flushNeeded();}}
    
    
    public void test_error_fnull() throws Exception {__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceStart(getClass().getName(),76749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gu03681n7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n4r1n4rlusyjudb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_fnull",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76749,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gu03681n7x() throws Exception{try{__CLR4_5_21n4r1n4rlusyjudb.R.inc(76749);
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76750);String text = "[[null";
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76751);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76752);Exception error = null;
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76753);try {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76754);reader.readObject(Model.class);
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76755);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76756);error = ex;
        }
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76757);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n4r1n4rlusyjudb.R.flushNeeded();}}
    
    public void test_error_notclose() throws Exception {__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceStart(getClass().getName(),76758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kuh3cg1n86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n4r1n4rlusyjudb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_notclose",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76758,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kuh3cg1n86() throws Exception{try{__CLR4_5_21n4r1n4rlusyjudb.R.inc(76758);
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76759);String text = "[[\"aaa";
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76760);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76761);Exception error = null;
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76762);try {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76763);reader.readObject(Model.class);
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76764);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76765);error = ex;
        }
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76766);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n4r1n4rlusyjudb.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceStart(getClass().getName(),76767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1n8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n4r1n4rlusyjudb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76767,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1n8f() throws Exception{try{__CLR4_5_21n4r1n4rlusyjudb.R.inc(76767);
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76768);String text = "[[\"b\"[[{";
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76769);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76770);Exception error = null;
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76771);try {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76772);reader.readObject(Model.class);
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76773);reader.close();
        } catch (JSONException ex) {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76774);error = ex;
        }
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76775);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n4r1n4rlusyjudb.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceStart(getClass().getName(),76776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1n8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n4r1n4rlusyjudb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76776,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1n8o() throws Exception{try{__CLR4_5_21n4r1n4rlusyjudb.R.inc(76776);
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76777);String text = "{\"model\":[[][";
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76778);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76779);Exception error = null;
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76780);try {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76781);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76782);error = ex;
        }
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76783);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n4r1n4rlusyjudb.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceStart(getClass().getName(),76784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1n8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n4r1n4rlusyjudb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n4r1n4rlusyjudb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76784,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1n8w() throws Exception{try{__CLR4_5_21n4r1n4rlusyjudb.R.inc(76784);
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76785);String text = "{\"model\":[[]}[";
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76786);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76787);Exception error = null;
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76788);try {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76789);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76790);error = ex;
        }
        __CLR4_5_21n4r1n4rlusyjudb.R.inc(76791);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n4r1n4rlusyjudb.R.flushNeeded();}}
    
    @JSONType(parseFeatures = Feature.SupportArrayToBean)
    public static class Model {

        private List<String> values;

        public List<String> getValues() {try{__CLR4_5_21n4r1n4rlusyjudb.R.inc(76792);
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76793);return values;
        }finally{__CLR4_5_21n4r1n4rlusyjudb.R.flushNeeded();}}

        public void setValues(List<String> values) {try{__CLR4_5_21n4r1n4rlusyjudb.R.inc(76794);
            __CLR4_5_21n4r1n4rlusyjudb.R.inc(76795);this.values = values;
        }finally{__CLR4_5_21n4r1n4rlusyjudb.R.flushNeeded();}}

    }
}
