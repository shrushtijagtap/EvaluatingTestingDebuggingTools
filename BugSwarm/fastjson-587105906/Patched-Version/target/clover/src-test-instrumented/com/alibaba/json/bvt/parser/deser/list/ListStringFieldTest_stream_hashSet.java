/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.list;

import java.io.StringReader;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ListStringFieldTest_stream_hashSet extends TestCase {static class __CLR4_5_21n9s1n9slusyjudh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,76882,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_5_21n9s1n9slusyjudh.R.globalSliceStart(getClass().getName(),76816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259ny8i1n9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n9s1n9slusyjudh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n9s1n9slusyjudh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_hashSet.test_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76816,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259ny8i1n9s() throws Exception{try{__CLR4_5_21n9s1n9slusyjudh.R.inc(76816);
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76817);String text = "{\"values\":[\"a\",null,\"b\",\"ab\\\\c\"]}";

        __CLR4_5_21n9s1n9slusyjudh.R.inc(76818);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76819);Model model = reader.readObject(Model.class);
        
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76820);Assert.assertEquals(4, model.values.size());
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76821);Assert.assertTrue(model.values.contains("a"));
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76822);Assert.assertTrue(model.values.contains("b"));
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76823);Assert.assertTrue(model.values.contains(null));
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76824);Assert.assertTrue(model.values.contains("ab\\c"));
    }finally{__CLR4_5_21n9s1n9slusyjudh.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_5_21n9s1n9slusyjudh.R.globalSliceStart(getClass().getName(),76825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1na1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n9s1n9slusyjudh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n9s1n9slusyjudh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_hashSet.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76825,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1na1() throws Exception{try{__CLR4_5_21n9s1n9slusyjudh.R.inc(76825);
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76826);String text = "{\"values\":null}";
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76827);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76828);Model model = reader.readObject(Model.class);
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76829);Assert.assertNull(model.values);
    }finally{__CLR4_5_21n9s1n9slusyjudh.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_5_21n9s1n9slusyjudh.R.globalSliceStart(getClass().getName(),76830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m1ch211na6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n9s1n9slusyjudh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n9s1n9slusyjudh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_hashSet.test_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76830,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m1ch211na6() throws Exception{try{__CLR4_5_21n9s1n9slusyjudh.R.inc(76830);
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76831);String text = "{\"values\":[]}";
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76832);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76833);Model model = reader.readObject(Model.class);
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76834);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_5_21n9s1n9slusyjudh.R.flushNeeded();}}

    public void test_map_empty() throws Exception {__CLR4_5_21n9s1n9slusyjudh.R.globalSliceStart(getClass().getName(),76835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lmhrdw1nab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n9s1n9slusyjudh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n9s1n9slusyjudh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_hashSet.test_map_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76835,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lmhrdw1nab() throws Exception{try{__CLR4_5_21n9s1n9slusyjudh.R.inc(76835);
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76836);String text = "{\"model\":{\"values\":[]}}";
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76837);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76838);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76839);Model model = (Model) map.get("model");
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76840);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_5_21n9s1n9slusyjudh.R.flushNeeded();}}

    public void test_notMatch() throws Exception {__CLR4_5_21n9s1n9slusyjudh.R.globalSliceStart(getClass().getName(),76841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jcmrza1nah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n9s1n9slusyjudh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n9s1n9slusyjudh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_hashSet.test_notMatch",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76841,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jcmrza1nah() throws Exception{try{__CLR4_5_21n9s1n9slusyjudh.R.inc(76841);
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76842);String text = "{\"value\":[]}";
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76843);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76844);Model model = reader.readObject(Model.class);
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76845);Assert.assertNull(model.values);
    }finally{__CLR4_5_21n9s1n9slusyjudh.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21n9s1n9slusyjudh.R.globalSliceStart(getClass().getName(),76846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1nam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n9s1n9slusyjudh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n9s1n9slusyjudh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_hashSet.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76846,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1nam() throws Exception{try{__CLR4_5_21n9s1n9slusyjudh.R.inc(76846);
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76847);String text = "{\"values\":[1";
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76848);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21n9s1n9slusyjudh.R.inc(76849);Exception error = null;
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76850);try {
            __CLR4_5_21n9s1n9slusyjudh.R.inc(76851);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21n9s1n9slusyjudh.R.inc(76852);error = ex;
        }
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76853);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n9s1n9slusyjudh.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_5_21n9s1n9slusyjudh.R.globalSliceStart(getClass().getName(),76854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1nau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n9s1n9slusyjudh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n9s1n9slusyjudh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_hashSet.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76854,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1nau() throws Exception{try{__CLR4_5_21n9s1n9slusyjudh.R.inc(76854);
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76855);String text = "{\"values\":[\"b\"[";
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76856);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21n9s1n9slusyjudh.R.inc(76857);Exception error = null;
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76858);try {
            __CLR4_5_21n9s1n9slusyjudh.R.inc(76859);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21n9s1n9slusyjudh.R.inc(76860);error = ex;
        }
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76861);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n9s1n9slusyjudh.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_5_21n9s1n9slusyjudh.R.globalSliceStart(getClass().getName(),76862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1nb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n9s1n9slusyjudh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n9s1n9slusyjudh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_hashSet.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76862,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1nb2() throws Exception{try{__CLR4_5_21n9s1n9slusyjudh.R.inc(76862);
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76863);String text = "{\"model\":{\"values\":[][";
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76864);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_5_21n9s1n9slusyjudh.R.inc(76865);Exception error = null;
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76866);try {
            __CLR4_5_21n9s1n9slusyjudh.R.inc(76867);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21n9s1n9slusyjudh.R.inc(76868);error = ex;
        }
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76869);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n9s1n9slusyjudh.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_5_21n9s1n9slusyjudh.R.globalSliceStart(getClass().getName(),76870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1nba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21n9s1n9slusyjudh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21n9s1n9slusyjudh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_hashSet.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76870,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1nba() throws Exception{try{__CLR4_5_21n9s1n9slusyjudh.R.inc(76870);
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76871);String text = "{\"model\":{\"values\":[]}[";
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76872);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_5_21n9s1n9slusyjudh.R.inc(76873);Exception error = null;
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76874);try {
            __CLR4_5_21n9s1n9slusyjudh.R.inc(76875);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21n9s1n9slusyjudh.R.inc(76876);error = ex;
        }
        __CLR4_5_21n9s1n9slusyjudh.R.inc(76877);Assert.assertNotNull(error);
    }finally{__CLR4_5_21n9s1n9slusyjudh.R.flushNeeded();}}
    

    public static class Model {

        private Set<String> values;

        public Set<String> getValues() {try{__CLR4_5_21n9s1n9slusyjudh.R.inc(76878);
            __CLR4_5_21n9s1n9slusyjudh.R.inc(76879);return values;
        }finally{__CLR4_5_21n9s1n9slusyjudh.R.flushNeeded();}}

        public void setValues(Set<String> values) {try{__CLR4_5_21n9s1n9slusyjudh.R.inc(76880);
            __CLR4_5_21n9s1n9slusyjudh.R.inc(76881);this.values = values;
        }finally{__CLR4_5_21n9s1n9slusyjudh.R.flushNeeded();}}

    }
}
