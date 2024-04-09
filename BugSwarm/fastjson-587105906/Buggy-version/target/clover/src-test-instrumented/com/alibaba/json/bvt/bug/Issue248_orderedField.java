/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;

public class Issue248_orderedField extends TestCase {static class __CLR4_1_1016zx16zxlusqk6tx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,55770,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_1016zx16zxlusqk6tx.R.globalSliceStart(getClass().getName(),55725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp216zx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1016zx16zxlusqk6tx.R.rethrow($CLV_t2$);}finally{__CLR4_1_1016zx16zxlusqk6tx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue248_orderedField.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),55725,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp216zx() throws Exception{try{__CLR4_1_1016zx16zxlusqk6tx.R.inc(55725);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55726);String text = "{\"b\":\"b\",\"d\":\"d\",\"c\":\"c\",\"a\":\"a\"}";
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55727);JSONObject object = JSON.parseObject(text, Feature.OrderedField);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55728);System.out.println(object);

        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55729);Assert.assertEquals("b", object.keySet().toArray()[0]);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55730);Assert.assertEquals("d", object.keySet().toArray()[1]);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55731);Assert.assertEquals("c", object.keySet().toArray()[2]);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55732);Assert.assertEquals("a", object.keySet().toArray()[3]);
    }finally{__CLR4_1_1016zx16zxlusqk6tx.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_1016zx16zxlusqk6tx.R.globalSliceStart(getClass().getName(),55733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1705();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1016zx16zxlusqk6tx.R.rethrow($CLV_t2$);}finally{__CLR4_1_1016zx16zxlusqk6tx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue248_orderedField.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),55733,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1705() throws Exception{try{__CLR4_1_1016zx16zxlusqk6tx.R.inc(55733);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55734);String text = "{\"a\":\"a\",\"b\":\"b\",\"c\":\"c\",\"d\":\"d\"}";
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55735);System.out.println(JSON.parseObject(text));

        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55736);JSONObject object = JSON.parseObject(text, Feature.OrderedField);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55737);System.out.println(object);

        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55738);Assert.assertEquals("a", object.keySet().toArray()[0]);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55739);Assert.assertEquals("b", object.keySet().toArray()[1]);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55740);Assert.assertEquals("c", object.keySet().toArray()[2]);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55741);Assert.assertEquals("d", object.keySet().toArray()[3]);

    }finally{__CLR4_1_1016zx16zxlusqk6tx.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_1016zx16zxlusqk6tx.R.globalSliceStart(getClass().getName(),55742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k44170e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1016zx16zxlusqk6tx.R.rethrow($CLV_t2$);}finally{__CLR4_1_1016zx16zxlusqk6tx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue248_orderedField.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),55742,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k44170e() throws Exception{try{__CLR4_1_1016zx16zxlusqk6tx.R.inc(55742);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55743);String text = "{\"k1\":\"v1\",\"k3\":\"v3\",\"k2\":\"v2\",\"map\":{\"k1\":\"v1\",\"k3\":\"v3\",\"k2\":\"v2\",\"map\":{\"k1\":\"v1\",\"k3\":\"v3\",\"k2\":\"v2\"}}}";
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55744);System.out.println(JSON.parseObject(text));

        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55745);JSONObject object = JSON.parseObject(text, Feature.OrderedField);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55746);System.out.println(object);

        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55747);Assert.assertEquals("k1", object.keySet().toArray()[0]);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55748);Assert.assertEquals("k3", object.keySet().toArray()[1]);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55749);Assert.assertEquals("k2", object.keySet().toArray()[2]);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55750);Assert.assertEquals("map", object.keySet().toArray()[3]);

        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55751);Assert.assertEquals("k1", object.getJSONObject("map").keySet().toArray()[0]);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55752);Assert.assertEquals("k3", object.getJSONObject("map").keySet().toArray()[1]);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55753);Assert.assertEquals("k2", object.getJSONObject("map").keySet().toArray()[2]);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55754);Assert.assertEquals("map", object.getJSONObject("map").keySet().toArray()[3]);

        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55755);Assert.assertEquals("k1", object.getJSONObject("map").getJSONObject("map").keySet().toArray()[0]);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55756);Assert.assertEquals("k3", object.getJSONObject("map").getJSONObject("map").keySet().toArray()[1]);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55757);Assert.assertEquals("k2", object.getJSONObject("map").getJSONObject("map").keySet().toArray()[2]);
    }finally{__CLR4_1_1016zx16zxlusqk6tx.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_1016zx16zxlusqk6tx.R.globalSliceStart(getClass().getName(),55758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn170u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1016zx16zxlusqk6tx.R.rethrow($CLV_t2$);}finally{__CLR4_1_1016zx16zxlusqk6tx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue248_orderedField.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),55758,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn170u() throws Exception{try{__CLR4_1_1016zx16zxlusqk6tx.R.inc(55758);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55759);String text = "{\"k1\":\"v1\",\"k3\":\"v3\",\"k2\":\"v2\",\"list\":[\"v1\",\"v3\",\"v2\",{\"map\":{\"k1\":\"v1\",\"k3\":\"v3\",\"k2\":\"v2\"}}]}";
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55760);System.out.println(JSON.parseObject(text));

        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55761);JSONObject object = JSON.parseObject(text, Feature.OrderedField);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55762);System.out.println(object);

        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55763);Assert.assertEquals("k1", object.keySet().toArray()[0]);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55764);Assert.assertEquals("k3", object.keySet().toArray()[1]);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55765);Assert.assertEquals("k2", object.keySet().toArray()[2]);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55766);Assert.assertEquals("list", object.keySet().toArray()[3]);

        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55767);Assert.assertEquals("k1",
                            object.getJSONArray("list").getJSONObject(3).getJSONObject("map").keySet().toArray()[0]);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55768);Assert.assertEquals("k3",
                            object.getJSONArray("list").getJSONObject(3).getJSONObject("map").keySet().toArray()[1]);
        __CLR4_1_1016zx16zxlusqk6tx.R.inc(55769);Assert.assertEquals("k2",
                            object.getJSONArray("list").getJSONObject(3).getJSONObject("map").keySet().toArray()[2]);

    }finally{__CLR4_1_1016zx16zxlusqk6tx.R.flushNeeded();}}

}
