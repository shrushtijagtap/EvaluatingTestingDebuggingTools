/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.list;

import java.io.StringReader;
import java.util.Map;
import java.util.TreeSet;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ListStringFieldTest_stream_TreeSet extends TestCase {static class __CLR4_5_21n2z1n2zlusyjud3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,76635,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_5_21n2z1n2zlusyjud3.R.globalSliceStart(getClass().getName(),76571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259ny8i1n2z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n2z1n2zlusyjud3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n2z1n2zlusyjud3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76571,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259ny8i1n2z() throws Exception{try{__CLR4_5_21n2z1n2zlusyjud3.R.inc(76571);
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76572);String text = "{\"values\":[\"a\",\"b\",\"ab\\\\c\"]}";

        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76573);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76574);Model model = reader.readObject(Model.class);
        
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76575);Assert.assertEquals(3, model.values.size());
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76576);Assert.assertTrue(model.values.contains("a"));
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76577);Assert.assertTrue(model.values.contains("b"));
    }finally{__CLR4_5_21n2z1n2zlusyjud3.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_5_21n2z1n2zlusyjud3.R.globalSliceStart(getClass().getName(),76578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1n36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n2z1n2zlusyjud3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n2z1n2zlusyjud3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76578,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1n36() throws Exception{try{__CLR4_5_21n2z1n2zlusyjud3.R.inc(76578);
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76579);String text = "{\"values\":null}";
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76580);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76581);Model model = reader.readObject(Model.class);
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76582);Assert.assertNull(model.values);
    }finally{__CLR4_5_21n2z1n2zlusyjud3.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_5_21n2z1n2zlusyjud3.R.globalSliceStart(getClass().getName(),76583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m1ch211n3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n2z1n2zlusyjud3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n2z1n2zlusyjud3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76583,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m1ch211n3b() throws Exception{try{__CLR4_5_21n2z1n2zlusyjud3.R.inc(76583);
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76584);String text = "{\"values\":[]}";
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76585);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76586);Model model = reader.readObject(Model.class);
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76587);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_5_21n2z1n2zlusyjud3.R.flushNeeded();}}

    public void test_map_empty() throws Exception {__CLR4_5_21n2z1n2zlusyjud3.R.globalSliceStart(getClass().getName(),76588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lmhrdw1n3g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n2z1n2zlusyjud3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n2z1n2zlusyjud3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_map_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76588,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lmhrdw1n3g() throws Exception{try{__CLR4_5_21n2z1n2zlusyjud3.R.inc(76588);
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76589);String text = "{\"model\":{\"values\":[]}}";
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76590);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76591);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76592);Model model = (Model) map.get("model");
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76593);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_5_21n2z1n2zlusyjud3.R.flushNeeded();}}

    public void test_notMatch() throws Exception {__CLR4_5_21n2z1n2zlusyjud3.R.globalSliceStart(getClass().getName(),76594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jcmrza1n3m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n2z1n2zlusyjud3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n2z1n2zlusyjud3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_notMatch",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76594,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jcmrza1n3m() throws Exception{try{__CLR4_5_21n2z1n2zlusyjud3.R.inc(76594);
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76595);String text = "{\"value\":[]}";
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76596);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76597);Model model = reader.readObject(Model.class);
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76598);Assert.assertNull(model.values);
    }finally{__CLR4_5_21n2z1n2zlusyjud3.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21n2z1n2zlusyjud3.R.globalSliceStart(getClass().getName(),76599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1n3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n2z1n2zlusyjud3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n2z1n2zlusyjud3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76599,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1n3r() throws Exception{try{__CLR4_5_21n2z1n2zlusyjud3.R.inc(76599);
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76600);String text = "{\"values\":[1";
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76601);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76602);Exception error = null;
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76603);try {
            __CLR4_5_21n2z1n2zlusyjud3.R.inc(76604);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21n2z1n2zlusyjud3.R.inc(76605);error = ex;
        }
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76606);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n2z1n2zlusyjud3.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_5_21n2z1n2zlusyjud3.R.globalSliceStart(getClass().getName(),76607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1n3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n2z1n2zlusyjud3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n2z1n2zlusyjud3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76607,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1n3z() throws Exception{try{__CLR4_5_21n2z1n2zlusyjud3.R.inc(76607);
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76608);String text = "{\"values\":[\"b\"[";
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76609);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76610);Exception error = null;
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76611);try {
            __CLR4_5_21n2z1n2zlusyjud3.R.inc(76612);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21n2z1n2zlusyjud3.R.inc(76613);error = ex;
        }
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76614);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n2z1n2zlusyjud3.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_5_21n2z1n2zlusyjud3.R.globalSliceStart(getClass().getName(),76615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1n47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n2z1n2zlusyjud3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n2z1n2zlusyjud3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76615,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1n47() throws Exception{try{__CLR4_5_21n2z1n2zlusyjud3.R.inc(76615);
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76616);String text = "{\"model\":{\"values\":[][";
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76617);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76618);Exception error = null;
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76619);try {
            __CLR4_5_21n2z1n2zlusyjud3.R.inc(76620);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21n2z1n2zlusyjud3.R.inc(76621);error = ex;
        }
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76622);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n2z1n2zlusyjud3.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_5_21n2z1n2zlusyjud3.R.globalSliceStart(getClass().getName(),76623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1n4f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n2z1n2zlusyjud3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n2z1n2zlusyjud3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76623,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1n4f() throws Exception{try{__CLR4_5_21n2z1n2zlusyjud3.R.inc(76623);
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76624);String text = "{\"model\":{\"values\":[]}[";
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76625);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76626);Exception error = null;
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76627);try {
            __CLR4_5_21n2z1n2zlusyjud3.R.inc(76628);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21n2z1n2zlusyjud3.R.inc(76629);error = ex;
        }
        __CLR4_5_21n2z1n2zlusyjud3.R.inc(76630);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n2z1n2zlusyjud3.R.flushNeeded();}}
    

    public static class Model {

        private TreeSet<String> values;

        public TreeSet<String> getValues() {try{__CLR4_5_21n2z1n2zlusyjud3.R.inc(76631);
            __CLR4_5_21n2z1n2zlusyjud3.R.inc(76632);return values;
        }finally{__CLR4_5_21n2z1n2zlusyjud3.R.flushNeeded();}}

        public void setValues(TreeSet<String> values) {try{__CLR4_5_21n2z1n2zlusyjud3.R.inc(76633);
            __CLR4_5_21n2z1n2zlusyjud3.R.inc(76634);this.values = values;
        }finally{__CLR4_5_21n2z1n2zlusyjud3.R.flushNeeded();}}

    }
}
