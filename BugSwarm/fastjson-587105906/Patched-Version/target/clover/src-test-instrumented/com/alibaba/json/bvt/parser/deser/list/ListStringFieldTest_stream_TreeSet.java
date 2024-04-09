/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.list;

import java.io.StringReader;
import java.util.Map;
import java.util.TreeSet;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ListStringFieldTest_stream_TreeSet extends TestCase {static class __CLR4_5_21o171o17lusvnew8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,77867,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_5_21o171o17lusvnew8.R.globalSliceStart(getClass().getName(),77803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259ny8i1o17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o171o17lusvnew8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o171o17lusvnew8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77803,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259ny8i1o17() throws Exception{try{__CLR4_5_21o171o17lusvnew8.R.inc(77803);
        __CLR4_5_21o171o17lusvnew8.R.inc(77804);String text = "{\"values\":[\"a\",\"b\",\"ab\\\\c\"]}";

        __CLR4_5_21o171o17lusvnew8.R.inc(77805);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21o171o17lusvnew8.R.inc(77806);Model model = reader.readObject(Model.class);
        
        __CLR4_5_21o171o17lusvnew8.R.inc(77807);Assert.assertEquals(3, model.values.size());
        __CLR4_5_21o171o17lusvnew8.R.inc(77808);Assert.assertTrue(model.values.contains("a"));
        __CLR4_5_21o171o17lusvnew8.R.inc(77809);Assert.assertTrue(model.values.contains("b"));
    }finally{__CLR4_5_21o171o17lusvnew8.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_5_21o171o17lusvnew8.R.globalSliceStart(getClass().getName(),77810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1o1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o171o17lusvnew8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o171o17lusvnew8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77810,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1o1e() throws Exception{try{__CLR4_5_21o171o17lusvnew8.R.inc(77810);
        __CLR4_5_21o171o17lusvnew8.R.inc(77811);String text = "{\"values\":null}";
        __CLR4_5_21o171o17lusvnew8.R.inc(77812);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21o171o17lusvnew8.R.inc(77813);Model model = reader.readObject(Model.class);
        __CLR4_5_21o171o17lusvnew8.R.inc(77814);Assert.assertNull(model.values);
    }finally{__CLR4_5_21o171o17lusvnew8.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_5_21o171o17lusvnew8.R.globalSliceStart(getClass().getName(),77815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m1ch211o1j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o171o17lusvnew8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o171o17lusvnew8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77815,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m1ch211o1j() throws Exception{try{__CLR4_5_21o171o17lusvnew8.R.inc(77815);
        __CLR4_5_21o171o17lusvnew8.R.inc(77816);String text = "{\"values\":[]}";
        __CLR4_5_21o171o17lusvnew8.R.inc(77817);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21o171o17lusvnew8.R.inc(77818);Model model = reader.readObject(Model.class);
        __CLR4_5_21o171o17lusvnew8.R.inc(77819);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_5_21o171o17lusvnew8.R.flushNeeded();}}

    public void test_map_empty() throws Exception {__CLR4_5_21o171o17lusvnew8.R.globalSliceStart(getClass().getName(),77820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lmhrdw1o1o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o171o17lusvnew8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o171o17lusvnew8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_map_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77820,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lmhrdw1o1o() throws Exception{try{__CLR4_5_21o171o17lusvnew8.R.inc(77820);
        __CLR4_5_21o171o17lusvnew8.R.inc(77821);String text = "{\"model\":{\"values\":[]}}";
        __CLR4_5_21o171o17lusvnew8.R.inc(77822);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21o171o17lusvnew8.R.inc(77823);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_5_21o171o17lusvnew8.R.inc(77824);Model model = (Model) map.get("model");
        __CLR4_5_21o171o17lusvnew8.R.inc(77825);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_5_21o171o17lusvnew8.R.flushNeeded();}}

    public void test_notMatch() throws Exception {__CLR4_5_21o171o17lusvnew8.R.globalSliceStart(getClass().getName(),77826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jcmrza1o1u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o171o17lusvnew8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o171o17lusvnew8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_notMatch",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77826,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jcmrza1o1u() throws Exception{try{__CLR4_5_21o171o17lusvnew8.R.inc(77826);
        __CLR4_5_21o171o17lusvnew8.R.inc(77827);String text = "{\"value\":[]}";
        __CLR4_5_21o171o17lusvnew8.R.inc(77828);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21o171o17lusvnew8.R.inc(77829);Model model = reader.readObject(Model.class);
        __CLR4_5_21o171o17lusvnew8.R.inc(77830);Assert.assertNull(model.values);
    }finally{__CLR4_5_21o171o17lusvnew8.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21o171o17lusvnew8.R.globalSliceStart(getClass().getName(),77831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1o1z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o171o17lusvnew8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o171o17lusvnew8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77831,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1o1z() throws Exception{try{__CLR4_5_21o171o17lusvnew8.R.inc(77831);
        __CLR4_5_21o171o17lusvnew8.R.inc(77832);String text = "{\"values\":[1";
        __CLR4_5_21o171o17lusvnew8.R.inc(77833);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21o171o17lusvnew8.R.inc(77834);Exception error = null;
        __CLR4_5_21o171o17lusvnew8.R.inc(77835);try {
            __CLR4_5_21o171o17lusvnew8.R.inc(77836);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21o171o17lusvnew8.R.inc(77837);error = ex;
        }
        __CLR4_5_21o171o17lusvnew8.R.inc(77838);Assert.assertNotNull(error);
    }finally{__CLR4_5_21o171o17lusvnew8.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_5_21o171o17lusvnew8.R.globalSliceStart(getClass().getName(),77839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1o27();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o171o17lusvnew8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o171o17lusvnew8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77839,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1o27() throws Exception{try{__CLR4_5_21o171o17lusvnew8.R.inc(77839);
        __CLR4_5_21o171o17lusvnew8.R.inc(77840);String text = "{\"values\":[\"b\"[";
        __CLR4_5_21o171o17lusvnew8.R.inc(77841);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21o171o17lusvnew8.R.inc(77842);Exception error = null;
        __CLR4_5_21o171o17lusvnew8.R.inc(77843);try {
            __CLR4_5_21o171o17lusvnew8.R.inc(77844);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21o171o17lusvnew8.R.inc(77845);error = ex;
        }
        __CLR4_5_21o171o17lusvnew8.R.inc(77846);Assert.assertNotNull(error);
    }finally{__CLR4_5_21o171o17lusvnew8.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_5_21o171o17lusvnew8.R.globalSliceStart(getClass().getName(),77847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1o2f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o171o17lusvnew8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o171o17lusvnew8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77847,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1o2f() throws Exception{try{__CLR4_5_21o171o17lusvnew8.R.inc(77847);
        __CLR4_5_21o171o17lusvnew8.R.inc(77848);String text = "{\"model\":{\"values\":[][";
        __CLR4_5_21o171o17lusvnew8.R.inc(77849);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_5_21o171o17lusvnew8.R.inc(77850);Exception error = null;
        __CLR4_5_21o171o17lusvnew8.R.inc(77851);try {
            __CLR4_5_21o171o17lusvnew8.R.inc(77852);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21o171o17lusvnew8.R.inc(77853);error = ex;
        }
        __CLR4_5_21o171o17lusvnew8.R.inc(77854);Assert.assertNotNull(error);
    }finally{__CLR4_5_21o171o17lusvnew8.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_5_21o171o17lusvnew8.R.globalSliceStart(getClass().getName(),77855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1o2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o171o17lusvnew8.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o171o17lusvnew8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77855,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1o2n() throws Exception{try{__CLR4_5_21o171o17lusvnew8.R.inc(77855);
        __CLR4_5_21o171o17lusvnew8.R.inc(77856);String text = "{\"model\":{\"values\":[]}[";
        __CLR4_5_21o171o17lusvnew8.R.inc(77857);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_5_21o171o17lusvnew8.R.inc(77858);Exception error = null;
        __CLR4_5_21o171o17lusvnew8.R.inc(77859);try {
            __CLR4_5_21o171o17lusvnew8.R.inc(77860);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21o171o17lusvnew8.R.inc(77861);error = ex;
        }
        __CLR4_5_21o171o17lusvnew8.R.inc(77862);Assert.assertNotNull(error);
    }finally{__CLR4_5_21o171o17lusvnew8.R.flushNeeded();}}
    

    public static class Model {

        private TreeSet<String> values;

        public TreeSet<String> getValues() {try{__CLR4_5_21o171o17lusvnew8.R.inc(77863);
            __CLR4_5_21o171o17lusvnew8.R.inc(77864);return values;
        }finally{__CLR4_5_21o171o17lusvnew8.R.flushNeeded();}}

        public void setValues(TreeSet<String> values) {try{__CLR4_5_21o171o17lusvnew8.R.inc(77865);
            __CLR4_5_21o171o17lusvnew8.R.inc(77866);this.values = values;
        }finally{__CLR4_5_21o171o17lusvnew8.R.flushNeeded();}}

    }
}
