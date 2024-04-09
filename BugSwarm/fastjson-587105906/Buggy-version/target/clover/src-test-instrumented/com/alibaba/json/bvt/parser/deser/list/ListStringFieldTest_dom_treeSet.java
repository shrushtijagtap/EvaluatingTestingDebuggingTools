/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.list;

import java.util.Map;
import java.util.TreeSet;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ListStringFieldTest_dom_treeSet extends TestCase {static class __CLR4_1_101myk1myklusqkh36{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,76468,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_1_101myk1myklusqkh36.R.globalSliceStart(getClass().getName(),76412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1059ny8i1myk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101myk1myklusqkh36.R.rethrow($CLV_t2$);}finally{__CLR4_1_101myk1myklusqkh36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76412,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1059ny8i1myk() throws Exception{try{__CLR4_1_101myk1myklusqkh36.R.inc(76412);
        __CLR4_1_101myk1myklusqkh36.R.inc(76413);String text = "{\"values\":[\"a\",\"b\",\"ab\\\\c\"]}";

        __CLR4_1_101myk1myklusqkh36.R.inc(76414);Model model = JSON.parseObject(text, Model.class);

        __CLR4_1_101myk1myklusqkh36.R.inc(76415);Assert.assertEquals(3, model.values.size());
        __CLR4_1_101myk1myklusqkh36.R.inc(76416);Assert.assertTrue(model.values.contains("a"));
        __CLR4_1_101myk1myklusqkh36.R.inc(76417);Assert.assertTrue(model.values.contains("b"));
        __CLR4_1_101myk1myklusqkh36.R.inc(76418);Assert.assertTrue(model.values.contains("ab\\c"));
    }finally{__CLR4_1_101myk1myklusqkh36.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_1_101myk1myklusqkh36.R.globalSliceStart(getClass().getName(),76419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1myr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101myk1myklusqkh36.R.rethrow($CLV_t2$);}finally{__CLR4_1_101myk1myklusqkh36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76419,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1myr() throws Exception{try{__CLR4_1_101myk1myklusqkh36.R.inc(76419);
        __CLR4_1_101myk1myklusqkh36.R.inc(76420);String text = "{\"values\":null}";
        __CLR4_1_101myk1myklusqkh36.R.inc(76421);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101myk1myklusqkh36.R.inc(76422);Assert.assertNull(model.values);
    }finally{__CLR4_1_101myk1myklusqkh36.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_1_101myk1myklusqkh36.R.globalSliceStart(getClass().getName(),76423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m1ch211myv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101myk1myklusqkh36.R.rethrow($CLV_t2$);}finally{__CLR4_1_101myk1myklusqkh36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76423,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m1ch211myv() throws Exception{try{__CLR4_1_101myk1myklusqkh36.R.inc(76423);
        __CLR4_1_101myk1myklusqkh36.R.inc(76424);String text = "{\"values\":[]}";
        __CLR4_1_101myk1myklusqkh36.R.inc(76425);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101myk1myklusqkh36.R.inc(76426);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101myk1myklusqkh36.R.flushNeeded();}}

    public void test_map_empty() throws Exception {__CLR4_1_101myk1myklusqkh36.R.globalSliceStart(getClass().getName(),76427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lmhrdw1myz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101myk1myklusqkh36.R.rethrow($CLV_t2$);}finally{__CLR4_1_101myk1myklusqkh36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_map_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76427,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lmhrdw1myz() throws Exception{try{__CLR4_1_101myk1myklusqkh36.R.inc(76427);
        __CLR4_1_101myk1myklusqkh36.R.inc(76428);String text = "{\"model\":{\"values\":[]}}";
        __CLR4_1_101myk1myklusqkh36.R.inc(76429);Map<String, Model> map = JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
        });
        __CLR4_1_101myk1myklusqkh36.R.inc(76430);Model model = (Model) map.get("model");
        __CLR4_1_101myk1myklusqkh36.R.inc(76431);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101myk1myklusqkh36.R.flushNeeded();}}

    public void test_notMatch() throws Exception {__CLR4_1_101myk1myklusqkh36.R.globalSliceStart(getClass().getName(),76432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jcmrza1mz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101myk1myklusqkh36.R.rethrow($CLV_t2$);}finally{__CLR4_1_101myk1myklusqkh36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_notMatch",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76432,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jcmrza1mz4() throws Exception{try{__CLR4_1_101myk1myklusqkh36.R.inc(76432);
        __CLR4_1_101myk1myklusqkh36.R.inc(76433);String text = "{\"value\":[]}";
        __CLR4_1_101myk1myklusqkh36.R.inc(76434);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101myk1myklusqkh36.R.inc(76435);Assert.assertNull(model.values);
    }finally{__CLR4_1_101myk1myklusqkh36.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101myk1myklusqkh36.R.globalSliceStart(getClass().getName(),76436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1mz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101myk1myklusqkh36.R.rethrow($CLV_t2$);}finally{__CLR4_1_101myk1myklusqkh36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76436,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1mz8() throws Exception{try{__CLR4_1_101myk1myklusqkh36.R.inc(76436);
        __CLR4_1_101myk1myklusqkh36.R.inc(76437);String text = "{\"values\":[1";
        __CLR4_1_101myk1myklusqkh36.R.inc(76438);Exception error = null;
        __CLR4_1_101myk1myklusqkh36.R.inc(76439);try {
            __CLR4_1_101myk1myklusqkh36.R.inc(76440);Model model = JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101myk1myklusqkh36.R.inc(76441);error = ex;
        }
        __CLR4_1_101myk1myklusqkh36.R.inc(76442);Assert.assertNotNull(error);
    }finally{__CLR4_1_101myk1myklusqkh36.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101myk1myklusqkh36.R.globalSliceStart(getClass().getName(),76443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1mzf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101myk1myklusqkh36.R.rethrow($CLV_t2$);}finally{__CLR4_1_101myk1myklusqkh36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76443,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1mzf() throws Exception{try{__CLR4_1_101myk1myklusqkh36.R.inc(76443);
        __CLR4_1_101myk1myklusqkh36.R.inc(76444);String text = "{\"values\":[\"b\"[";
        __CLR4_1_101myk1myklusqkh36.R.inc(76445);Exception error = null;
        __CLR4_1_101myk1myklusqkh36.R.inc(76446);try {
            __CLR4_1_101myk1myklusqkh36.R.inc(76447);Model model = JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101myk1myklusqkh36.R.inc(76448);error = ex;
        }
        __CLR4_1_101myk1myklusqkh36.R.inc(76449);Assert.assertNotNull(error);
    }finally{__CLR4_1_101myk1myklusqkh36.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101myk1myklusqkh36.R.globalSliceStart(getClass().getName(),76450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1mzm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101myk1myklusqkh36.R.rethrow($CLV_t2$);}finally{__CLR4_1_101myk1myklusqkh36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76450,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1mzm() throws Exception{try{__CLR4_1_101myk1myklusqkh36.R.inc(76450);
        __CLR4_1_101myk1myklusqkh36.R.inc(76451);String text = "{\"model\":{\"values\":[][";

        __CLR4_1_101myk1myklusqkh36.R.inc(76452);Exception error = null;
        __CLR4_1_101myk1myklusqkh36.R.inc(76453);try {
            __CLR4_1_101myk1myklusqkh36.R.inc(76454);JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101myk1myklusqkh36.R.inc(76455);error = ex;
        }
        __CLR4_1_101myk1myklusqkh36.R.inc(76456);Assert.assertNotNull(error);
    }finally{__CLR4_1_101myk1myklusqkh36.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_101myk1myklusqkh36.R.globalSliceStart(getClass().getName(),76457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1mzt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101myk1myklusqkh36.R.rethrow($CLV_t2$);}finally{__CLR4_1_101myk1myklusqkh36.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76457,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1mzt() throws Exception{try{__CLR4_1_101myk1myklusqkh36.R.inc(76457);
        __CLR4_1_101myk1myklusqkh36.R.inc(76458);String text = "{\"model\":{\"values\":[]}[";

        __CLR4_1_101myk1myklusqkh36.R.inc(76459);Exception error = null;
        __CLR4_1_101myk1myklusqkh36.R.inc(76460);try {
            __CLR4_1_101myk1myklusqkh36.R.inc(76461);JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101myk1myklusqkh36.R.inc(76462);error = ex;
        }
        __CLR4_1_101myk1myklusqkh36.R.inc(76463);Assert.assertNotNull(error);
    }finally{__CLR4_1_101myk1myklusqkh36.R.flushNeeded();}}

    public static class Model {

        private TreeSet<String> values;

        public TreeSet<String> getValues() {try{__CLR4_1_101myk1myklusqkh36.R.inc(76464);
            __CLR4_1_101myk1myklusqkh36.R.inc(76465);return values;
        }finally{__CLR4_1_101myk1myklusqkh36.R.flushNeeded();}}

        public void setValues(TreeSet<String> values) {try{__CLR4_1_101myk1myklusqkh36.R.inc(76466);
            __CLR4_1_101myk1myklusqkh36.R.inc(76467);this.values = values;
        }finally{__CLR4_1_101myk1myklusqkh36.R.flushNeeded();}}

    }
}
