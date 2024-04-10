/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.list;

import java.io.StringReader;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_array.Model;

import junit.framework.TestCase;

public class ListStringFieldTest_dom_hashSet extends TestCase {static class __CLR4_1_101nv71nv7luszwdun{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,77644,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_1_101nv71nv7luszwdun.R.globalSliceStart(getClass().getName(),77587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1059ny8i1nv7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nv71nv7luszwdun.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nv71nv7luszwdun.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_hashSet.test_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77587,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1059ny8i1nv7() throws Exception{try{__CLR4_1_101nv71nv7luszwdun.R.inc(77587);
        __CLR4_1_101nv71nv7luszwdun.R.inc(77588);String text = "{\"values\":[\"a\",null,\"b\",\"ab\\\\c\"]}";

        __CLR4_1_101nv71nv7luszwdun.R.inc(77589);Model model = JSON.parseObject(text, Model.class);

        __CLR4_1_101nv71nv7luszwdun.R.inc(77590);Assert.assertEquals(4, model.values.size());
        __CLR4_1_101nv71nv7luszwdun.R.inc(77591);Assert.assertTrue(model.values.contains("a"));
        __CLR4_1_101nv71nv7luszwdun.R.inc(77592);Assert.assertTrue(model.values.contains("b"));
        __CLR4_1_101nv71nv7luszwdun.R.inc(77593);Assert.assertTrue(model.values.contains(null));
        __CLR4_1_101nv71nv7luszwdun.R.inc(77594);Assert.assertTrue(model.values.contains("ab\\c"));
    }finally{__CLR4_1_101nv71nv7luszwdun.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_1_101nv71nv7luszwdun.R.globalSliceStart(getClass().getName(),77595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1nvf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nv71nv7luszwdun.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nv71nv7luszwdun.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_hashSet.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77595,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1nvf() throws Exception{try{__CLR4_1_101nv71nv7luszwdun.R.inc(77595);
        __CLR4_1_101nv71nv7luszwdun.R.inc(77596);String text = "{\"values\":null}";
        __CLR4_1_101nv71nv7luszwdun.R.inc(77597);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101nv71nv7luszwdun.R.inc(77598);Assert.assertNull(model.values);
    }finally{__CLR4_1_101nv71nv7luszwdun.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_1_101nv71nv7luszwdun.R.globalSliceStart(getClass().getName(),77599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m1ch211nvj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nv71nv7luszwdun.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nv71nv7luszwdun.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_hashSet.test_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77599,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m1ch211nvj() throws Exception{try{__CLR4_1_101nv71nv7luszwdun.R.inc(77599);
        __CLR4_1_101nv71nv7luszwdun.R.inc(77600);String text = "{\"values\":[]}";
        __CLR4_1_101nv71nv7luszwdun.R.inc(77601);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101nv71nv7luszwdun.R.inc(77602);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101nv71nv7luszwdun.R.flushNeeded();}}

    public void test_map_empty() throws Exception {__CLR4_1_101nv71nv7luszwdun.R.globalSliceStart(getClass().getName(),77603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lmhrdw1nvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nv71nv7luszwdun.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nv71nv7luszwdun.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_hashSet.test_map_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77603,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lmhrdw1nvn() throws Exception{try{__CLR4_1_101nv71nv7luszwdun.R.inc(77603);
        __CLR4_1_101nv71nv7luszwdun.R.inc(77604);String text = "{\"model\":{\"values\":[]}}";
        __CLR4_1_101nv71nv7luszwdun.R.inc(77605);Map<String, Model> map = JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
        });
        __CLR4_1_101nv71nv7luszwdun.R.inc(77606);Model model = (Model) map.get("model");
        __CLR4_1_101nv71nv7luszwdun.R.inc(77607);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101nv71nv7luszwdun.R.flushNeeded();}}

    public void test_notMatch() throws Exception {__CLR4_1_101nv71nv7luszwdun.R.globalSliceStart(getClass().getName(),77608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jcmrza1nvs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nv71nv7luszwdun.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nv71nv7luszwdun.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_hashSet.test_notMatch",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77608,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jcmrza1nvs() throws Exception{try{__CLR4_1_101nv71nv7luszwdun.R.inc(77608);
        __CLR4_1_101nv71nv7luszwdun.R.inc(77609);String text = "{\"value\":[]}";
        __CLR4_1_101nv71nv7luszwdun.R.inc(77610);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101nv71nv7luszwdun.R.inc(77611);Assert.assertNull(model.values);
    }finally{__CLR4_1_101nv71nv7luszwdun.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101nv71nv7luszwdun.R.globalSliceStart(getClass().getName(),77612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1nvw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nv71nv7luszwdun.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nv71nv7luszwdun.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_hashSet.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77612,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1nvw() throws Exception{try{__CLR4_1_101nv71nv7luszwdun.R.inc(77612);
        __CLR4_1_101nv71nv7luszwdun.R.inc(77613);String text = "{\"values\":[1";
        __CLR4_1_101nv71nv7luszwdun.R.inc(77614);Exception error = null;
        __CLR4_1_101nv71nv7luszwdun.R.inc(77615);try {
            __CLR4_1_101nv71nv7luszwdun.R.inc(77616);Model model = JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nv71nv7luszwdun.R.inc(77617);error = ex;
        }
        __CLR4_1_101nv71nv7luszwdun.R.inc(77618);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nv71nv7luszwdun.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101nv71nv7luszwdun.R.globalSliceStart(getClass().getName(),77619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1nw3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nv71nv7luszwdun.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nv71nv7luszwdun.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_hashSet.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77619,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1nw3() throws Exception{try{__CLR4_1_101nv71nv7luszwdun.R.inc(77619);
        __CLR4_1_101nv71nv7luszwdun.R.inc(77620);String text = "{\"values\":[\"b\"[";
        __CLR4_1_101nv71nv7luszwdun.R.inc(77621);Exception error = null;
        __CLR4_1_101nv71nv7luszwdun.R.inc(77622);try {
            __CLR4_1_101nv71nv7luszwdun.R.inc(77623);Model model = JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nv71nv7luszwdun.R.inc(77624);error = ex;
        }
        __CLR4_1_101nv71nv7luszwdun.R.inc(77625);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nv71nv7luszwdun.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101nv71nv7luszwdun.R.globalSliceStart(getClass().getName(),77626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1nwa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nv71nv7luszwdun.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nv71nv7luszwdun.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_hashSet.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77626,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1nwa() throws Exception{try{__CLR4_1_101nv71nv7luszwdun.R.inc(77626);
        __CLR4_1_101nv71nv7luszwdun.R.inc(77627);String text = "{\"model\":{\"values\":[][";

        __CLR4_1_101nv71nv7luszwdun.R.inc(77628);Exception error = null;
        __CLR4_1_101nv71nv7luszwdun.R.inc(77629);try {
            __CLR4_1_101nv71nv7luszwdun.R.inc(77630);JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101nv71nv7luszwdun.R.inc(77631);error = ex;
        }
        __CLR4_1_101nv71nv7luszwdun.R.inc(77632);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nv71nv7luszwdun.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_101nv71nv7luszwdun.R.globalSliceStart(getClass().getName(),77633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1nwh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nv71nv7luszwdun.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nv71nv7luszwdun.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom_hashSet.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77633,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1nwh() throws Exception{try{__CLR4_1_101nv71nv7luszwdun.R.inc(77633);
        __CLR4_1_101nv71nv7luszwdun.R.inc(77634);String text = "{\"model\":{\"values\":[]}[";

        __CLR4_1_101nv71nv7luszwdun.R.inc(77635);Exception error = null;
        __CLR4_1_101nv71nv7luszwdun.R.inc(77636);try {
            __CLR4_1_101nv71nv7luszwdun.R.inc(77637);JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101nv71nv7luszwdun.R.inc(77638);error = ex;
        }
        __CLR4_1_101nv71nv7luszwdun.R.inc(77639);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nv71nv7luszwdun.R.flushNeeded();}}

    public static class Model {

        private Set<String> values;

        public Set<String> getValues() {try{__CLR4_1_101nv71nv7luszwdun.R.inc(77640);
            __CLR4_1_101nv71nv7luszwdun.R.inc(77641);return values;
        }finally{__CLR4_1_101nv71nv7luszwdun.R.flushNeeded();}}

        public void setValues(Set<String> values) {try{__CLR4_1_101nv71nv7luszwdun.R.inc(77642);
            __CLR4_1_101nv71nv7luszwdun.R.inc(77643);this.values = values;
        }finally{__CLR4_1_101nv71nv7luszwdun.R.flushNeeded();}}

    }
}
