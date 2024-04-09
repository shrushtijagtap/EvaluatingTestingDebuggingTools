/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.list;

import java.io.StringReader;
import java.util.Map;
import java.util.TreeSet;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ListStringFieldTest_stream_TreeSet extends TestCase {static class __CLR4_1_101n3a1n3alusqkh47{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,76646,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_1_101n3a1n3alusqkh47.R.globalSliceStart(getClass().getName(),76582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1059ny8i1n3a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n3a1n3alusqkh47.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n3a1n3alusqkh47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76582,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1059ny8i1n3a() throws Exception{try{__CLR4_1_101n3a1n3alusqkh47.R.inc(76582);
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76583);String text = "{\"values\":[\"a\",\"b\",\"ab\\\\c\"]}";

        __CLR4_1_101n3a1n3alusqkh47.R.inc(76584);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76585);Model model = reader.readObject(Model.class);
        
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76586);Assert.assertEquals(3, model.values.size());
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76587);Assert.assertTrue(model.values.contains("a"));
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76588);Assert.assertTrue(model.values.contains("b"));
    }finally{__CLR4_1_101n3a1n3alusqkh47.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_1_101n3a1n3alusqkh47.R.globalSliceStart(getClass().getName(),76589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1n3h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n3a1n3alusqkh47.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n3a1n3alusqkh47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76589,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1n3h() throws Exception{try{__CLR4_1_101n3a1n3alusqkh47.R.inc(76589);
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76590);String text = "{\"values\":null}";
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76591);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76592);Model model = reader.readObject(Model.class);
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76593);Assert.assertNull(model.values);
    }finally{__CLR4_1_101n3a1n3alusqkh47.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_1_101n3a1n3alusqkh47.R.globalSliceStart(getClass().getName(),76594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m1ch211n3m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n3a1n3alusqkh47.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n3a1n3alusqkh47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76594,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m1ch211n3m() throws Exception{try{__CLR4_1_101n3a1n3alusqkh47.R.inc(76594);
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76595);String text = "{\"values\":[]}";
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76596);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76597);Model model = reader.readObject(Model.class);
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76598);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101n3a1n3alusqkh47.R.flushNeeded();}}

    public void test_map_empty() throws Exception {__CLR4_1_101n3a1n3alusqkh47.R.globalSliceStart(getClass().getName(),76599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lmhrdw1n3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n3a1n3alusqkh47.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n3a1n3alusqkh47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_map_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76599,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lmhrdw1n3r() throws Exception{try{__CLR4_1_101n3a1n3alusqkh47.R.inc(76599);
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76600);String text = "{\"model\":{\"values\":[]}}";
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76601);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76602);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76603);Model model = (Model) map.get("model");
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76604);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101n3a1n3alusqkh47.R.flushNeeded();}}

    public void test_notMatch() throws Exception {__CLR4_1_101n3a1n3alusqkh47.R.globalSliceStart(getClass().getName(),76605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jcmrza1n3x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n3a1n3alusqkh47.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n3a1n3alusqkh47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_notMatch",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76605,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jcmrza1n3x() throws Exception{try{__CLR4_1_101n3a1n3alusqkh47.R.inc(76605);
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76606);String text = "{\"value\":[]}";
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76607);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76608);Model model = reader.readObject(Model.class);
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76609);Assert.assertNull(model.values);
    }finally{__CLR4_1_101n3a1n3alusqkh47.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101n3a1n3alusqkh47.R.globalSliceStart(getClass().getName(),76610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1n42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n3a1n3alusqkh47.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n3a1n3alusqkh47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76610,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1n42() throws Exception{try{__CLR4_1_101n3a1n3alusqkh47.R.inc(76610);
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76611);String text = "{\"values\":[1";
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76612);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101n3a1n3alusqkh47.R.inc(76613);Exception error = null;
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76614);try {
            __CLR4_1_101n3a1n3alusqkh47.R.inc(76615);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101n3a1n3alusqkh47.R.inc(76616);error = ex;
        }
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76617);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n3a1n3alusqkh47.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_1_101n3a1n3alusqkh47.R.globalSliceStart(getClass().getName(),76618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1n4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n3a1n3alusqkh47.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n3a1n3alusqkh47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76618,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1n4a() throws Exception{try{__CLR4_1_101n3a1n3alusqkh47.R.inc(76618);
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76619);String text = "{\"values\":[\"b\"[";
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76620);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101n3a1n3alusqkh47.R.inc(76621);Exception error = null;
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76622);try {
            __CLR4_1_101n3a1n3alusqkh47.R.inc(76623);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101n3a1n3alusqkh47.R.inc(76624);error = ex;
        }
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76625);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n3a1n3alusqkh47.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_1_101n3a1n3alusqkh47.R.globalSliceStart(getClass().getName(),76626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1n4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n3a1n3alusqkh47.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n3a1n3alusqkh47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76626,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1n4i() throws Exception{try{__CLR4_1_101n3a1n3alusqkh47.R.inc(76626);
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76627);String text = "{\"model\":{\"values\":[][";
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76628);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_1_101n3a1n3alusqkh47.R.inc(76629);Exception error = null;
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76630);try {
            __CLR4_1_101n3a1n3alusqkh47.R.inc(76631);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101n3a1n3alusqkh47.R.inc(76632);error = ex;
        }
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76633);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n3a1n3alusqkh47.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_1_101n3a1n3alusqkh47.R.globalSliceStart(getClass().getName(),76634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1n4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n3a1n3alusqkh47.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n3a1n3alusqkh47.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76634,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1n4q() throws Exception{try{__CLR4_1_101n3a1n3alusqkh47.R.inc(76634);
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76635);String text = "{\"model\":{\"values\":[]}[";
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76636);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_1_101n3a1n3alusqkh47.R.inc(76637);Exception error = null;
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76638);try {
            __CLR4_1_101n3a1n3alusqkh47.R.inc(76639);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101n3a1n3alusqkh47.R.inc(76640);error = ex;
        }
        __CLR4_1_101n3a1n3alusqkh47.R.inc(76641);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n3a1n3alusqkh47.R.flushNeeded();}}
    

    public static class Model {

        private TreeSet<String> values;

        public TreeSet<String> getValues() {try{__CLR4_1_101n3a1n3alusqkh47.R.inc(76642);
            __CLR4_1_101n3a1n3alusqkh47.R.inc(76643);return values;
        }finally{__CLR4_1_101n3a1n3alusqkh47.R.flushNeeded();}}

        public void setValues(TreeSet<String> values) {try{__CLR4_1_101n3a1n3alusqkh47.R.inc(76644);
            __CLR4_1_101n3a1n3alusqkh47.R.inc(76645);this.values = values;
        }finally{__CLR4_1_101n3a1n3alusqkh47.R.flushNeeded();}}

    }
}
