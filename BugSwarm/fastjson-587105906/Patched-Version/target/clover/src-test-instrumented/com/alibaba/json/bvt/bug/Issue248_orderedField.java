/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;

public class Issue248_orderedField extends TestCase {static class __CLR4_5_217xu17xulusvn8d3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,56991,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_217xu17xulusvn8d3.R.globalSliceStart(getClass().getName(),56946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp217xu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217xu17xulusvn8d3.R.rethrow($CLV_t2$);}finally{__CLR4_5_217xu17xulusvn8d3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue248_orderedField.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56946,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp217xu() throws Exception{try{__CLR4_5_217xu17xulusvn8d3.R.inc(56946);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56947);String text = "{\"b\":\"b\",\"d\":\"d\",\"c\":\"c\",\"a\":\"a\"}";
        __CLR4_5_217xu17xulusvn8d3.R.inc(56948);JSONObject object = JSON.parseObject(text, Feature.OrderedField);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56949);System.out.println(object);

        __CLR4_5_217xu17xulusvn8d3.R.inc(56950);Assert.assertEquals("b", object.keySet().toArray()[0]);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56951);Assert.assertEquals("d", object.keySet().toArray()[1]);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56952);Assert.assertEquals("c", object.keySet().toArray()[2]);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56953);Assert.assertEquals("a", object.keySet().toArray()[3]);
    }finally{__CLR4_5_217xu17xulusvn8d3.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_217xu17xulusvn8d3.R.globalSliceStart(getClass().getName(),56954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl17y2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217xu17xulusvn8d3.R.rethrow($CLV_t2$);}finally{__CLR4_5_217xu17xulusvn8d3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue248_orderedField.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56954,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl17y2() throws Exception{try{__CLR4_5_217xu17xulusvn8d3.R.inc(56954);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56955);String text = "{\"a\":\"a\",\"b\":\"b\",\"c\":\"c\",\"d\":\"d\"}";
        __CLR4_5_217xu17xulusvn8d3.R.inc(56956);System.out.println(JSON.parseObject(text));

        __CLR4_5_217xu17xulusvn8d3.R.inc(56957);JSONObject object = JSON.parseObject(text, Feature.OrderedField);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56958);System.out.println(object);

        __CLR4_5_217xu17xulusvn8d3.R.inc(56959);Assert.assertEquals("a", object.keySet().toArray()[0]);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56960);Assert.assertEquals("b", object.keySet().toArray()[1]);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56961);Assert.assertEquals("c", object.keySet().toArray()[2]);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56962);Assert.assertEquals("d", object.keySet().toArray()[3]);

    }finally{__CLR4_5_217xu17xulusvn8d3.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_217xu17xulusvn8d3.R.globalSliceStart(getClass().getName(),56963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k4417yb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217xu17xulusvn8d3.R.rethrow($CLV_t2$);}finally{__CLR4_5_217xu17xulusvn8d3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue248_orderedField.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56963,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k4417yb() throws Exception{try{__CLR4_5_217xu17xulusvn8d3.R.inc(56963);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56964);String text = "{\"k1\":\"v1\",\"k3\":\"v3\",\"k2\":\"v2\",\"map\":{\"k1\":\"v1\",\"k3\":\"v3\",\"k2\":\"v2\",\"map\":{\"k1\":\"v1\",\"k3\":\"v3\",\"k2\":\"v2\"}}}";
        __CLR4_5_217xu17xulusvn8d3.R.inc(56965);System.out.println(JSON.parseObject(text));

        __CLR4_5_217xu17xulusvn8d3.R.inc(56966);JSONObject object = JSON.parseObject(text, Feature.OrderedField);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56967);System.out.println(object);

        __CLR4_5_217xu17xulusvn8d3.R.inc(56968);Assert.assertEquals("k1", object.keySet().toArray()[0]);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56969);Assert.assertEquals("k3", object.keySet().toArray()[1]);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56970);Assert.assertEquals("k2", object.keySet().toArray()[2]);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56971);Assert.assertEquals("map", object.keySet().toArray()[3]);

        __CLR4_5_217xu17xulusvn8d3.R.inc(56972);Assert.assertEquals("k1", object.getJSONObject("map").keySet().toArray()[0]);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56973);Assert.assertEquals("k3", object.getJSONObject("map").keySet().toArray()[1]);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56974);Assert.assertEquals("k2", object.getJSONObject("map").keySet().toArray()[2]);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56975);Assert.assertEquals("map", object.getJSONObject("map").keySet().toArray()[3]);

        __CLR4_5_217xu17xulusvn8d3.R.inc(56976);Assert.assertEquals("k1", object.getJSONObject("map").getJSONObject("map").keySet().toArray()[0]);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56977);Assert.assertEquals("k3", object.getJSONObject("map").getJSONObject("map").keySet().toArray()[1]);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56978);Assert.assertEquals("k2", object.getJSONObject("map").getJSONObject("map").keySet().toArray()[2]);
    }finally{__CLR4_5_217xu17xulusvn8d3.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_217xu17xulusvn8d3.R.globalSliceStart(getClass().getName(),56979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn17yr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217xu17xulusvn8d3.R.rethrow($CLV_t2$);}finally{__CLR4_5_217xu17xulusvn8d3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue248_orderedField.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56979,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn17yr() throws Exception{try{__CLR4_5_217xu17xulusvn8d3.R.inc(56979);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56980);String text = "{\"k1\":\"v1\",\"k3\":\"v3\",\"k2\":\"v2\",\"list\":[\"v1\",\"v3\",\"v2\",{\"map\":{\"k1\":\"v1\",\"k3\":\"v3\",\"k2\":\"v2\"}}]}";
        __CLR4_5_217xu17xulusvn8d3.R.inc(56981);System.out.println(JSON.parseObject(text));

        __CLR4_5_217xu17xulusvn8d3.R.inc(56982);JSONObject object = JSON.parseObject(text, Feature.OrderedField);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56983);System.out.println(object);

        __CLR4_5_217xu17xulusvn8d3.R.inc(56984);Assert.assertEquals("k1", object.keySet().toArray()[0]);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56985);Assert.assertEquals("k3", object.keySet().toArray()[1]);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56986);Assert.assertEquals("k2", object.keySet().toArray()[2]);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56987);Assert.assertEquals("list", object.keySet().toArray()[3]);

        __CLR4_5_217xu17xulusvn8d3.R.inc(56988);Assert.assertEquals("k1",
                            object.getJSONArray("list").getJSONObject(3).getJSONObject("map").keySet().toArray()[0]);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56989);Assert.assertEquals("k3",
                            object.getJSONArray("list").getJSONObject(3).getJSONObject("map").keySet().toArray()[1]);
        __CLR4_5_217xu17xulusvn8d3.R.inc(56990);Assert.assertEquals("k2",
                            object.getJSONArray("list").getJSONObject(3).getJSONObject("map").keySet().toArray()[2]);

    }finally{__CLR4_5_217xu17xulusvn8d3.R.flushNeeded();}}

}
