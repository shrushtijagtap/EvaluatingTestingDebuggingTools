/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.list;

import java.io.StringReader;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ListStringFieldTest_stream extends TestCase {static class __CLR4_5_21ny11ny1lusvnew3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,77803,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_5_21ny11ny1lusvnew3.R.globalSliceStart(getClass().getName(),77689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259ny8i1ny1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ny11ny1lusvnew3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ny11ny1lusvnew3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77689,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259ny8i1ny1() throws Exception{try{__CLR4_5_21ny11ny1lusvnew3.R.inc(77689);
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77690);String text = "{\"values\":[\"a\",null,\"b\",\"ab\\\\c\\\"\"]}";

        __CLR4_5_21ny11ny1lusvnew3.R.inc(77691);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77692);Model model = reader.readObject(Model.class);
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77693);Assert.assertEquals(4, model.values.size());
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77694);Assert.assertEquals("a", model.values.get(0));
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77695);Assert.assertEquals(null, model.values.get(1));
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77696);Assert.assertEquals("b", model.values.get(2));
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77697);Assert.assertEquals("ab\\c\"", model.values.get(3));
    }finally{__CLR4_5_21ny11ny1lusvnew3.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_5_21ny11ny1lusvnew3.R.globalSliceStart(getClass().getName(),77698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1nya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ny11ny1lusvnew3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ny11ny1lusvnew3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77698,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1nya() throws Exception{try{__CLR4_5_21ny11ny1lusvnew3.R.inc(77698);
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77699);String text = "{\"values\":null}";
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77700);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77701);Model model = reader.readObject(Model.class);
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77702);Assert.assertNull(model.values);
    }finally{__CLR4_5_21ny11ny1lusvnew3.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_5_21ny11ny1lusvnew3.R.globalSliceStart(getClass().getName(),77703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m1ch211nyf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ny11ny1lusvnew3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ny11ny1lusvnew3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77703,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m1ch211nyf() throws Exception{try{__CLR4_5_21ny11ny1lusvnew3.R.inc(77703);
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77704);String text = "{\"values\":[]}";
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77705);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77706);Model model = reader.readObject(Model.class);
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77707);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_5_21ny11ny1lusvnew3.R.flushNeeded();}}

    public void test_map_empty() throws Exception {__CLR4_5_21ny11ny1lusvnew3.R.globalSliceStart(getClass().getName(),77708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lmhrdw1nyk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ny11ny1lusvnew3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ny11ny1lusvnew3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_map_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77708,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lmhrdw1nyk() throws Exception{try{__CLR4_5_21ny11ny1lusvnew3.R.inc(77708);
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77709);String text = "{\"model\":{\"values\":[]}}";
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77710);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77711);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77712);Model model = (Model) map.get("model");
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77713);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_5_21ny11ny1lusvnew3.R.flushNeeded();}}

    public void test_notMatch() throws Exception {__CLR4_5_21ny11ny1lusvnew3.R.globalSliceStart(getClass().getName(),77714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jcmrza1nyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ny11ny1lusvnew3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ny11ny1lusvnew3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_notMatch",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77714,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jcmrza1nyq() throws Exception{try{__CLR4_5_21ny11ny1lusvnew3.R.inc(77714);
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77715);String text = "{\"value\":[]}";
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77716);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77717);Model model = reader.readObject(Model.class);
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77718);Assert.assertNull(model.values);
    }finally{__CLR4_5_21ny11ny1lusvnew3.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21ny11ny1lusvnew3.R.globalSliceStart(getClass().getName(),77719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1nyv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ny11ny1lusvnew3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ny11ny1lusvnew3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77719,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1nyv() throws Exception{try{__CLR4_5_21ny11ny1lusvnew3.R.inc(77719);
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77720);String text = "{\"values\":[1";
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77721);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21ny11ny1lusvnew3.R.inc(77722);Exception error = null;
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77723);try {
            __CLR4_5_21ny11ny1lusvnew3.R.inc(77724);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ny11ny1lusvnew3.R.inc(77725);error = ex;
        }
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77726);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ny11ny1lusvnew3.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_5_21ny11ny1lusvnew3.R.globalSliceStart(getClass().getName(),77727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1nz3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ny11ny1lusvnew3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ny11ny1lusvnew3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77727,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1nz3() throws Exception{try{__CLR4_5_21ny11ny1lusvnew3.R.inc(77727);
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77728);String text = "{\"values\":[\"b\"[";
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77729);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21ny11ny1lusvnew3.R.inc(77730);Exception error = null;
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77731);try {
            __CLR4_5_21ny11ny1lusvnew3.R.inc(77732);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ny11ny1lusvnew3.R.inc(77733);error = ex;
        }
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77734);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ny11ny1lusvnew3.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_5_21ny11ny1lusvnew3.R.globalSliceStart(getClass().getName(),77735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1nzb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ny11ny1lusvnew3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ny11ny1lusvnew3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77735,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1nzb() throws Exception{try{__CLR4_5_21ny11ny1lusvnew3.R.inc(77735);
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77736);String text = "{\"model\":{\"values\":[][";
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77737);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_5_21ny11ny1lusvnew3.R.inc(77738);Exception error = null;
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77739);try {
            __CLR4_5_21ny11ny1lusvnew3.R.inc(77740);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21ny11ny1lusvnew3.R.inc(77741);error = ex;
        }
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77742);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ny11ny1lusvnew3.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_5_21ny11ny1lusvnew3.R.globalSliceStart(getClass().getName(),77743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1nzj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ny11ny1lusvnew3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ny11ny1lusvnew3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77743,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1nzj() throws Exception{try{__CLR4_5_21ny11ny1lusvnew3.R.inc(77743);
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77744);String text = "{\"model\":{\"values\":[]}[";
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77745);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_5_21ny11ny1lusvnew3.R.inc(77746);Exception error = null;
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77747);try {
            __CLR4_5_21ny11ny1lusvnew3.R.inc(77748);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21ny11ny1lusvnew3.R.inc(77749);error = ex;
        }
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77750);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ny11ny1lusvnew3.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_5_21ny11ny1lusvnew3.R.globalSliceStart(getClass().getName(),77751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1nzr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ny11ny1lusvnew3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ny11ny1lusvnew3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77751,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1nzr() throws Exception{try{__CLR4_5_21ny11ny1lusvnew3.R.inc(77751);
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77752);String text = "{\"model\":{\"values\":[\"aaa]}[";
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77753);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_5_21ny11ny1lusvnew3.R.inc(77754);Exception error = null;
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77755);try {
            __CLR4_5_21ny11ny1lusvnew3.R.inc(77756);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21ny11ny1lusvnew3.R.inc(77757);error = ex;
        }
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77758);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ny11ny1lusvnew3.R.flushNeeded();}}
    
    public void test_error_n() throws Exception {__CLR4_5_21ny11ny1lusvnew3.R.globalSliceStart(getClass().getName(),77759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23ey91t1nzz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ny11ny1lusvnew3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ny11ny1lusvnew3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_n",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77759,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23ey91t1nzz() throws Exception{try{__CLR4_5_21ny11ny1lusvnew3.R.inc(77759);
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77760);String text = "{\"values\":[n";
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77761);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21ny11ny1lusvnew3.R.inc(77762);Exception error = null;
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77763);try {
            __CLR4_5_21ny11ny1lusvnew3.R.inc(77764);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ny11ny1lusvnew3.R.inc(77765);error = ex;
        }
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77766);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ny11ny1lusvnew3.R.flushNeeded();}}
    
    public void test_error_nu() throws Exception {__CLR4_5_21ny11ny1lusvnew3.R.globalSliceStart(getClass().getName(),77767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b9biaa1o07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ny11ny1lusvnew3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ny11ny1lusvnew3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_nu",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77767,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b9biaa1o07() throws Exception{try{__CLR4_5_21ny11ny1lusvnew3.R.inc(77767);
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77768);String text = "{\"values\":[nu";
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77769);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21ny11ny1lusvnew3.R.inc(77770);Exception error = null;
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77771);try {
            __CLR4_5_21ny11ny1lusvnew3.R.inc(77772);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ny11ny1lusvnew3.R.inc(77773);error = ex;
        }
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77774);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ny11ny1lusvnew3.R.flushNeeded();}}
    
    public void test_error_nul() throws Exception {__CLR4_5_21ny11ny1lusvnew3.R.globalSliceStart(getClass().getName(),77775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c2eljc1o0f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ny11ny1lusvnew3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ny11ny1lusvnew3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_nul",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77775,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c2eljc1o0f() throws Exception{try{__CLR4_5_21ny11ny1lusvnew3.R.inc(77775);
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77776);String text = "{\"values\":[nul";
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77777);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21ny11ny1lusvnew3.R.inc(77778);Exception error = null;
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77779);try {
            __CLR4_5_21ny11ny1lusvnew3.R.inc(77780);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ny11ny1lusvnew3.R.inc(77781);error = ex;
        }
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77782);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ny11ny1lusvnew3.R.flushNeeded();}}
    
    public void test_error_null() throws Exception {__CLR4_5_21ny11ny1lusvnew3.R.globalSliceStart(getClass().getName(),77783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xx1nn21o0n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ny11ny1lusvnew3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ny11ny1lusvnew3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77783,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xx1nn21o0n() throws Exception{try{__CLR4_5_21ny11ny1lusvnew3.R.inc(77783);
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77784);String text = "{\"values\":[null";
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77785);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21ny11ny1lusvnew3.R.inc(77786);Exception error = null;
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77787);try {
            __CLR4_5_21ny11ny1lusvnew3.R.inc(77788);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ny11ny1lusvnew3.R.inc(77789);error = ex;
        }
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77790);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ny11ny1lusvnew3.R.flushNeeded();}}
    
    public void test_error_rbacket() throws Exception {__CLR4_5_21ny11ny1lusvnew3.R.globalSliceStart(getClass().getName(),77791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t4ut911o0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ny11ny1lusvnew3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ny11ny1lusvnew3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_rbacket",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77791,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t4ut911o0v() throws Exception{try{__CLR4_5_21ny11ny1lusvnew3.R.inc(77791);
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77792);String text = "{\"values\":[null,]";
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77793);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21ny11ny1lusvnew3.R.inc(77794);Exception error = null;
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77795);try {
            __CLR4_5_21ny11ny1lusvnew3.R.inc(77796);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ny11ny1lusvnew3.R.inc(77797);error = ex;
        }
        __CLR4_5_21ny11ny1lusvnew3.R.inc(77798);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ny11ny1lusvnew3.R.flushNeeded();}}

    public static class Model {

        private List<String> values;

        public List<String> getValues() {try{__CLR4_5_21ny11ny1lusvnew3.R.inc(77799);
            __CLR4_5_21ny11ny1lusvnew3.R.inc(77800);return values;
        }finally{__CLR4_5_21ny11ny1lusvnew3.R.flushNeeded();}}

        public void setValues(List<String> values) {try{__CLR4_5_21ny11ny1lusvnew3.R.inc(77801);
            __CLR4_5_21ny11ny1lusvnew3.R.inc(77802);this.values = values;
        }finally{__CLR4_5_21ny11ny1lusvnew3.R.flushNeeded();}}

    }
}
