/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.list;

import java.util.Map;
import java.util.TreeSet;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ListStringFieldTest_dom_treeSet extends TestCase {static class __CLR4_1_101nws1nwsluszwduw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,77700,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_1_101nws1nwsluszwduw.R.globalSliceStart(getClass().getName(),77644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1059ny8i1nws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nws1nwsluszwduw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nws1nwsluszwduw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77644,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1059ny8i1nws() throws Exception{try{__CLR4_1_101nws1nwsluszwduw.R.inc(77644);
        __CLR4_1_101nws1nwsluszwduw.R.inc(77645);String text = "{\"values\":[\"a\",\"b\",\"ab\\\\c\"]}";

        __CLR4_1_101nws1nwsluszwduw.R.inc(77646);Model model = JSON.parseObject(text, Model.class);

        __CLR4_1_101nws1nwsluszwduw.R.inc(77647);Assert.assertEquals(3, model.values.size());
        __CLR4_1_101nws1nwsluszwduw.R.inc(77648);Assert.assertTrue(model.values.contains("a"));
        __CLR4_1_101nws1nwsluszwduw.R.inc(77649);Assert.assertTrue(model.values.contains("b"));
        __CLR4_1_101nws1nwsluszwduw.R.inc(77650);Assert.assertTrue(model.values.contains("ab\\c"));
    }finally{__CLR4_1_101nws1nwsluszwduw.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_1_101nws1nwsluszwduw.R.globalSliceStart(getClass().getName(),77651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1nwz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nws1nwsluszwduw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nws1nwsluszwduw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77651,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1nwz() throws Exception{try{__CLR4_1_101nws1nwsluszwduw.R.inc(77651);
        __CLR4_1_101nws1nwsluszwduw.R.inc(77652);String text = "{\"values\":null}";
        __CLR4_1_101nws1nwsluszwduw.R.inc(77653);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101nws1nwsluszwduw.R.inc(77654);Assert.assertNull(model.values);
    }finally{__CLR4_1_101nws1nwsluszwduw.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_1_101nws1nwsluszwduw.R.globalSliceStart(getClass().getName(),77655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m1ch211nx3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nws1nwsluszwduw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nws1nwsluszwduw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77655,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m1ch211nx3() throws Exception{try{__CLR4_1_101nws1nwsluszwduw.R.inc(77655);
        __CLR4_1_101nws1nwsluszwduw.R.inc(77656);String text = "{\"values\":[]}";
        __CLR4_1_101nws1nwsluszwduw.R.inc(77657);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101nws1nwsluszwduw.R.inc(77658);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101nws1nwsluszwduw.R.flushNeeded();}}

    public void test_map_empty() throws Exception {__CLR4_1_101nws1nwsluszwduw.R.globalSliceStart(getClass().getName(),77659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lmhrdw1nx7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nws1nwsluszwduw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nws1nwsluszwduw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_map_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77659,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lmhrdw1nx7() throws Exception{try{__CLR4_1_101nws1nwsluszwduw.R.inc(77659);
        __CLR4_1_101nws1nwsluszwduw.R.inc(77660);String text = "{\"model\":{\"values\":[]}}";
        __CLR4_1_101nws1nwsluszwduw.R.inc(77661);Map<String, Model> map = JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
        });
        __CLR4_1_101nws1nwsluszwduw.R.inc(77662);Model model = (Model) map.get("model");
        __CLR4_1_101nws1nwsluszwduw.R.inc(77663);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101nws1nwsluszwduw.R.flushNeeded();}}

    public void test_notMatch() throws Exception {__CLR4_1_101nws1nwsluszwduw.R.globalSliceStart(getClass().getName(),77664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jcmrza1nxc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nws1nwsluszwduw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nws1nwsluszwduw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_notMatch",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77664,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jcmrza1nxc() throws Exception{try{__CLR4_1_101nws1nwsluszwduw.R.inc(77664);
        __CLR4_1_101nws1nwsluszwduw.R.inc(77665);String text = "{\"value\":[]}";
        __CLR4_1_101nws1nwsluszwduw.R.inc(77666);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101nws1nwsluszwduw.R.inc(77667);Assert.assertNull(model.values);
    }finally{__CLR4_1_101nws1nwsluszwduw.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101nws1nwsluszwduw.R.globalSliceStart(getClass().getName(),77668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1nxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nws1nwsluszwduw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nws1nwsluszwduw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77668,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1nxg() throws Exception{try{__CLR4_1_101nws1nwsluszwduw.R.inc(77668);
        __CLR4_1_101nws1nwsluszwduw.R.inc(77669);String text = "{\"values\":[1";
        __CLR4_1_101nws1nwsluszwduw.R.inc(77670);Exception error = null;
        __CLR4_1_101nws1nwsluszwduw.R.inc(77671);try {
            __CLR4_1_101nws1nwsluszwduw.R.inc(77672);Model model = JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nws1nwsluszwduw.R.inc(77673);error = ex;
        }
        __CLR4_1_101nws1nwsluszwduw.R.inc(77674);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nws1nwsluszwduw.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101nws1nwsluszwduw.R.globalSliceStart(getClass().getName(),77675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1nxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nws1nwsluszwduw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nws1nwsluszwduw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77675,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1nxn() throws Exception{try{__CLR4_1_101nws1nwsluszwduw.R.inc(77675);
        __CLR4_1_101nws1nwsluszwduw.R.inc(77676);String text = "{\"values\":[\"b\"[";
        __CLR4_1_101nws1nwsluszwduw.R.inc(77677);Exception error = null;
        __CLR4_1_101nws1nwsluszwduw.R.inc(77678);try {
            __CLR4_1_101nws1nwsluszwduw.R.inc(77679);Model model = JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nws1nwsluszwduw.R.inc(77680);error = ex;
        }
        __CLR4_1_101nws1nwsluszwduw.R.inc(77681);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nws1nwsluszwduw.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101nws1nwsluszwduw.R.globalSliceStart(getClass().getName(),77682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1nxu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nws1nwsluszwduw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nws1nwsluszwduw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77682,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1nxu() throws Exception{try{__CLR4_1_101nws1nwsluszwduw.R.inc(77682);
        __CLR4_1_101nws1nwsluszwduw.R.inc(77683);String text = "{\"model\":{\"values\":[][";

        __CLR4_1_101nws1nwsluszwduw.R.inc(77684);Exception error = null;
        __CLR4_1_101nws1nwsluszwduw.R.inc(77685);try {
            __CLR4_1_101nws1nwsluszwduw.R.inc(77686);JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101nws1nwsluszwduw.R.inc(77687);error = ex;
        }
        __CLR4_1_101nws1nwsluszwduw.R.inc(77688);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nws1nwsluszwduw.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_101nws1nwsluszwduw.R.globalSliceStart(getClass().getName(),77689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1ny1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nws1nwsluszwduw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nws1nwsluszwduw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_treeSet.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77689,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1ny1() throws Exception{try{__CLR4_1_101nws1nwsluszwduw.R.inc(77689);
        __CLR4_1_101nws1nwsluszwduw.R.inc(77690);String text = "{\"model\":{\"values\":[]}[";

        __CLR4_1_101nws1nwsluszwduw.R.inc(77691);Exception error = null;
        __CLR4_1_101nws1nwsluszwduw.R.inc(77692);try {
            __CLR4_1_101nws1nwsluszwduw.R.inc(77693);JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101nws1nwsluszwduw.R.inc(77694);error = ex;
        }
        __CLR4_1_101nws1nwsluszwduw.R.inc(77695);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nws1nwsluszwduw.R.flushNeeded();}}

    public static class Model {

        private TreeSet<String> values;

        public TreeSet<String> getValues() {try{__CLR4_1_101nws1nwsluszwduw.R.inc(77696);
            __CLR4_1_101nws1nwsluszwduw.R.inc(77697);return values;
        }finally{__CLR4_1_101nws1nwsluszwduw.R.flushNeeded();}}

        public void setValues(TreeSet<String> values) {try{__CLR4_1_101nws1nwsluszwduw.R.inc(77698);
            __CLR4_1_101nws1nwsluszwduw.R.inc(77699);this.values = values;
        }finally{__CLR4_1_101nws1nwsluszwduw.R.flushNeeded();}}

    }
}
