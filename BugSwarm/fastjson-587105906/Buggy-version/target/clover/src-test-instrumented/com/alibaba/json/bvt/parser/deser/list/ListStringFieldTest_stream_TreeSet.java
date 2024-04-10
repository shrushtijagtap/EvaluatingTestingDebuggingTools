/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.list;

import java.io.StringReader;
import java.util.Map;
import java.util.TreeSet;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ListStringFieldTest_stream_TreeSet extends TestCase {static class __CLR4_1_101o1i1o1iluszwdvd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,77878,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_1_101o1i1o1iluszwdvd.R.globalSliceStart(getClass().getName(),77814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1059ny8i1o1i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o1i1o1iluszwdvd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o1i1o1iluszwdvd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77814,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1059ny8i1o1i() throws Exception{try{__CLR4_1_101o1i1o1iluszwdvd.R.inc(77814);
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77815);String text = "{\"values\":[\"a\",\"b\",\"ab\\\\c\"]}";

        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77816);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77817);Model model = reader.readObject(Model.class);
        
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77818);Assert.assertEquals(3, model.values.size());
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77819);Assert.assertTrue(model.values.contains("a"));
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77820);Assert.assertTrue(model.values.contains("b"));
    }finally{__CLR4_1_101o1i1o1iluszwdvd.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_1_101o1i1o1iluszwdvd.R.globalSliceStart(getClass().getName(),77821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1o1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o1i1o1iluszwdvd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o1i1o1iluszwdvd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77821,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1o1p() throws Exception{try{__CLR4_1_101o1i1o1iluszwdvd.R.inc(77821);
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77822);String text = "{\"values\":null}";
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77823);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77824);Model model = reader.readObject(Model.class);
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77825);Assert.assertNull(model.values);
    }finally{__CLR4_1_101o1i1o1iluszwdvd.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_1_101o1i1o1iluszwdvd.R.globalSliceStart(getClass().getName(),77826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m1ch211o1u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o1i1o1iluszwdvd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o1i1o1iluszwdvd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77826,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m1ch211o1u() throws Exception{try{__CLR4_1_101o1i1o1iluszwdvd.R.inc(77826);
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77827);String text = "{\"values\":[]}";
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77828);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77829);Model model = reader.readObject(Model.class);
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77830);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101o1i1o1iluszwdvd.R.flushNeeded();}}

    public void test_map_empty() throws Exception {__CLR4_1_101o1i1o1iluszwdvd.R.globalSliceStart(getClass().getName(),77831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lmhrdw1o1z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o1i1o1iluszwdvd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o1i1o1iluszwdvd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_map_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77831,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lmhrdw1o1z() throws Exception{try{__CLR4_1_101o1i1o1iluszwdvd.R.inc(77831);
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77832);String text = "{\"model\":{\"values\":[]}}";
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77833);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77834);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77835);Model model = (Model) map.get("model");
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77836);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101o1i1o1iluszwdvd.R.flushNeeded();}}

    public void test_notMatch() throws Exception {__CLR4_1_101o1i1o1iluszwdvd.R.globalSliceStart(getClass().getName(),77837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jcmrza1o25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o1i1o1iluszwdvd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o1i1o1iluszwdvd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_notMatch",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77837,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jcmrza1o25() throws Exception{try{__CLR4_1_101o1i1o1iluszwdvd.R.inc(77837);
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77838);String text = "{\"value\":[]}";
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77839);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77840);Model model = reader.readObject(Model.class);
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77841);Assert.assertNull(model.values);
    }finally{__CLR4_1_101o1i1o1iluszwdvd.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101o1i1o1iluszwdvd.R.globalSliceStart(getClass().getName(),77842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1o2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o1i1o1iluszwdvd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o1i1o1iluszwdvd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77842,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1o2a() throws Exception{try{__CLR4_1_101o1i1o1iluszwdvd.R.inc(77842);
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77843);String text = "{\"values\":[1";
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77844);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77845);Exception error = null;
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77846);try {
            __CLR4_1_101o1i1o1iluszwdvd.R.inc(77847);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101o1i1o1iluszwdvd.R.inc(77848);error = ex;
        }
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77849);Assert.assertNotNull(error);
    }finally{__CLR4_1_101o1i1o1iluszwdvd.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_1_101o1i1o1iluszwdvd.R.globalSliceStart(getClass().getName(),77850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1o2i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o1i1o1iluszwdvd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o1i1o1iluszwdvd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77850,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1o2i() throws Exception{try{__CLR4_1_101o1i1o1iluszwdvd.R.inc(77850);
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77851);String text = "{\"values\":[\"b\"[";
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77852);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77853);Exception error = null;
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77854);try {
            __CLR4_1_101o1i1o1iluszwdvd.R.inc(77855);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101o1i1o1iluszwdvd.R.inc(77856);error = ex;
        }
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77857);Assert.assertNotNull(error);
    }finally{__CLR4_1_101o1i1o1iluszwdvd.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_1_101o1i1o1iluszwdvd.R.globalSliceStart(getClass().getName(),77858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1o2q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o1i1o1iluszwdvd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o1i1o1iluszwdvd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77858,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1o2q() throws Exception{try{__CLR4_1_101o1i1o1iluszwdvd.R.inc(77858);
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77859);String text = "{\"model\":{\"values\":[][";
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77860);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77861);Exception error = null;
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77862);try {
            __CLR4_1_101o1i1o1iluszwdvd.R.inc(77863);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101o1i1o1iluszwdvd.R.inc(77864);error = ex;
        }
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77865);Assert.assertNotNull(error);
    }finally{__CLR4_1_101o1i1o1iluszwdvd.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_1_101o1i1o1iluszwdvd.R.globalSliceStart(getClass().getName(),77866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1o2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o1i1o1iluszwdvd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o1i1o1iluszwdvd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_TreeSet.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77866,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1o2y() throws Exception{try{__CLR4_1_101o1i1o1iluszwdvd.R.inc(77866);
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77867);String text = "{\"model\":{\"values\":[]}[";
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77868);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77869);Exception error = null;
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77870);try {
            __CLR4_1_101o1i1o1iluszwdvd.R.inc(77871);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101o1i1o1iluszwdvd.R.inc(77872);error = ex;
        }
        __CLR4_1_101o1i1o1iluszwdvd.R.inc(77873);Assert.assertNotNull(error);
    }finally{__CLR4_1_101o1i1o1iluszwdvd.R.flushNeeded();}}
    

    public static class Model {

        private TreeSet<String> values;

        public TreeSet<String> getValues() {try{__CLR4_1_101o1i1o1iluszwdvd.R.inc(77874);
            __CLR4_1_101o1i1o1iluszwdvd.R.inc(77875);return values;
        }finally{__CLR4_1_101o1i1o1iluszwdvd.R.flushNeeded();}}

        public void setValues(TreeSet<String> values) {try{__CLR4_1_101o1i1o1iluszwdvd.R.inc(77876);
            __CLR4_1_101o1i1o1iluszwdvd.R.inc(77877);this.values = values;
        }finally{__CLR4_1_101o1i1o1iluszwdvd.R.flushNeeded();}}

    }
}
