/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.list;

import java.util.Map;
import java.util.TreeSet;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ListStringFieldTest_dom_treeSet extends TestCase {static class __CLR4_5_21my91my9lusyjucu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,76457,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_5_21my91my9lusyjucu.R.globalSliceStart(getClass().getName(),76401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259ny8i1my9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21my91my9lusyjucu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21my91my9lusyjucu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76401,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259ny8i1my9() throws Exception{try{__CLR4_5_21my91my9lusyjucu.R.inc(76401);
        __CLR4_5_21my91my9lusyjucu.R.inc(76402);String text = "{\"values\":[\"a\",\"b\",\"ab\\\\c\"]}";

        __CLR4_5_21my91my9lusyjucu.R.inc(76403);Model model = JSON.parseObject(text, Model.class);

        __CLR4_5_21my91my9lusyjucu.R.inc(76404);Assert.assertEquals(3, model.values.size());
        __CLR4_5_21my91my9lusyjucu.R.inc(76405);Assert.assertTrue(model.values.contains("a"));
        __CLR4_5_21my91my9lusyjucu.R.inc(76406);Assert.assertTrue(model.values.contains("b"));
        __CLR4_5_21my91my9lusyjucu.R.inc(76407);Assert.assertTrue(model.values.contains("ab\\c"));
    }finally{__CLR4_5_21my91my9lusyjucu.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_5_21my91my9lusyjucu.R.globalSliceStart(getClass().getName(),76408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1myg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21my91my9lusyjucu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21my91my9lusyjucu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76408,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1myg() throws Exception{try{__CLR4_5_21my91my9lusyjucu.R.inc(76408);
        __CLR4_5_21my91my9lusyjucu.R.inc(76409);String text = "{\"values\":null}";
        __CLR4_5_21my91my9lusyjucu.R.inc(76410);Model model = JSON.parseObject(text, Model.class);
        __CLR4_5_21my91my9lusyjucu.R.inc(76411);Assert.assertNull(model.values);
    }finally{__CLR4_5_21my91my9lusyjucu.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_5_21my91my9lusyjucu.R.globalSliceStart(getClass().getName(),76412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m1ch211myk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21my91my9lusyjucu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21my91my9lusyjucu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76412,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m1ch211myk() throws Exception{try{__CLR4_5_21my91my9lusyjucu.R.inc(76412);
        __CLR4_5_21my91my9lusyjucu.R.inc(76413);String text = "{\"values\":[]}";
        __CLR4_5_21my91my9lusyjucu.R.inc(76414);Model model = JSON.parseObject(text, Model.class);
        __CLR4_5_21my91my9lusyjucu.R.inc(76415);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_5_21my91my9lusyjucu.R.flushNeeded();}}

    public void test_map_empty() throws Exception {__CLR4_5_21my91my9lusyjucu.R.globalSliceStart(getClass().getName(),76416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lmhrdw1myo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21my91my9lusyjucu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21my91my9lusyjucu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_map_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76416,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lmhrdw1myo() throws Exception{try{__CLR4_5_21my91my9lusyjucu.R.inc(76416);
        __CLR4_5_21my91my9lusyjucu.R.inc(76417);String text = "{\"model\":{\"values\":[]}}";
        __CLR4_5_21my91my9lusyjucu.R.inc(76418);Map<String, Model> map = JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
        });
        __CLR4_5_21my91my9lusyjucu.R.inc(76419);Model model = (Model) map.get("model");
        __CLR4_5_21my91my9lusyjucu.R.inc(76420);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_5_21my91my9lusyjucu.R.flushNeeded();}}

    public void test_notMatch() throws Exception {__CLR4_5_21my91my9lusyjucu.R.globalSliceStart(getClass().getName(),76421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jcmrza1myt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21my91my9lusyjucu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21my91my9lusyjucu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_notMatch",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76421,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jcmrza1myt() throws Exception{try{__CLR4_5_21my91my9lusyjucu.R.inc(76421);
        __CLR4_5_21my91my9lusyjucu.R.inc(76422);String text = "{\"value\":[]}";
        __CLR4_5_21my91my9lusyjucu.R.inc(76423);Model model = JSON.parseObject(text, Model.class);
        __CLR4_5_21my91my9lusyjucu.R.inc(76424);Assert.assertNull(model.values);
    }finally{__CLR4_5_21my91my9lusyjucu.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21my91my9lusyjucu.R.globalSliceStart(getClass().getName(),76425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1myx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21my91my9lusyjucu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21my91my9lusyjucu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76425,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1myx() throws Exception{try{__CLR4_5_21my91my9lusyjucu.R.inc(76425);
        __CLR4_5_21my91my9lusyjucu.R.inc(76426);String text = "{\"values\":[1";
        __CLR4_5_21my91my9lusyjucu.R.inc(76427);Exception error = null;
        __CLR4_5_21my91my9lusyjucu.R.inc(76428);try {
            __CLR4_5_21my91my9lusyjucu.R.inc(76429);Model model = JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21my91my9lusyjucu.R.inc(76430);error = ex;
        }
        __CLR4_5_21my91my9lusyjucu.R.inc(76431);Assert.assertNotNull(error);
    }finally{__CLR4_5_21my91my9lusyjucu.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_5_21my91my9lusyjucu.R.globalSliceStart(getClass().getName(),76432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1mz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21my91my9lusyjucu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21my91my9lusyjucu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76432,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1mz4() throws Exception{try{__CLR4_5_21my91my9lusyjucu.R.inc(76432);
        __CLR4_5_21my91my9lusyjucu.R.inc(76433);String text = "{\"values\":[\"b\"[";
        __CLR4_5_21my91my9lusyjucu.R.inc(76434);Exception error = null;
        __CLR4_5_21my91my9lusyjucu.R.inc(76435);try {
            __CLR4_5_21my91my9lusyjucu.R.inc(76436);Model model = JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21my91my9lusyjucu.R.inc(76437);error = ex;
        }
        __CLR4_5_21my91my9lusyjucu.R.inc(76438);Assert.assertNotNull(error);
    }finally{__CLR4_5_21my91my9lusyjucu.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21my91my9lusyjucu.R.globalSliceStart(getClass().getName(),76439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1mzb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21my91my9lusyjucu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21my91my9lusyjucu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76439,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1mzb() throws Exception{try{__CLR4_5_21my91my9lusyjucu.R.inc(76439);
        __CLR4_5_21my91my9lusyjucu.R.inc(76440);String text = "{\"model\":{\"values\":[][";

        __CLR4_5_21my91my9lusyjucu.R.inc(76441);Exception error = null;
        __CLR4_5_21my91my9lusyjucu.R.inc(76442);try {
            __CLR4_5_21my91my9lusyjucu.R.inc(76443);JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21my91my9lusyjucu.R.inc(76444);error = ex;
        }
        __CLR4_5_21my91my9lusyjucu.R.inc(76445);Assert.assertNotNull(error);
    }finally{__CLR4_5_21my91my9lusyjucu.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_5_21my91my9lusyjucu.R.globalSliceStart(getClass().getName(),76446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1mzi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21my91my9lusyjucu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21my91my9lusyjucu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76446,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1mzi() throws Exception{try{__CLR4_5_21my91my9lusyjucu.R.inc(76446);
        __CLR4_5_21my91my9lusyjucu.R.inc(76447);String text = "{\"model\":{\"values\":[]}[";

        __CLR4_5_21my91my9lusyjucu.R.inc(76448);Exception error = null;
        __CLR4_5_21my91my9lusyjucu.R.inc(76449);try {
            __CLR4_5_21my91my9lusyjucu.R.inc(76450);JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21my91my9lusyjucu.R.inc(76451);error = ex;
        }
        __CLR4_5_21my91my9lusyjucu.R.inc(76452);Assert.assertNotNull(error);
    }finally{__CLR4_5_21my91my9lusyjucu.R.flushNeeded();}}

    public static class Model {

        private TreeSet<String> values;

        public TreeSet<String> getValues() {try{__CLR4_5_21my91my9lusyjucu.R.inc(76453);
            __CLR4_5_21my91my9lusyjucu.R.inc(76454);return values;
        }finally{__CLR4_5_21my91my9lusyjucu.R.flushNeeded();}}

        public void setValues(TreeSet<String> values) {try{__CLR4_5_21my91my9lusyjucu.R.inc(76455);
            __CLR4_5_21my91my9lusyjucu.R.inc(76456);this.values = values;
        }finally{__CLR4_5_21my91my9lusyjucu.R.flushNeeded();}}

    }
}
