/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.deserializer;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by jiangyu on 2017-03-03 11:33.
 */
public class IgnoreTypeDeserializer {public static class __CLR4_5_2v87v87lusvn1sz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,40496,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test(expected = JSONException.class)
    public void parseObjectWithNotExistTypeThrowException() {try{__CLR4_5_2v87v87lusvn1sz.R.inc(40471);
        __CLR4_5_2v87v87lusvn1sz.R.inc(40472);String s = "{\"@type\":\"com.alibaba.fastjson.ValueBean\",\"val\":1}";
        __CLR4_5_2v87v87lusvn1sz.R.inc(40473);JSONObject.parseObject(s, ValueBean.class);
    }finally{__CLR4_5_2v87v87lusvn1sz.R.flushNeeded();}}

    @Test
    public void parseObjectWithNotExistType() {try{__CLR4_5_2v87v87lusvn1sz.R.inc(40474);
        __CLR4_5_2v87v87lusvn1sz.R.inc(40475);String s = "{\"@type\":\"com.alibaba.fastjson.ValueBean\",\"val\":1}";
        __CLR4_5_2v87v87lusvn1sz.R.inc(40476);ValueBean v = JSONObject.parseObject(s, ValueBean.class, Feature.IgnoreAutoType);
        __CLR4_5_2v87v87lusvn1sz.R.inc(40477);Assert.assertNotNull(v);
        __CLR4_5_2v87v87lusvn1sz.R.inc(40478);Assert.assertEquals(new Integer(1), v.getVal());
    }finally{__CLR4_5_2v87v87lusvn1sz.R.flushNeeded();}}

    @Test
    public void parseWithNotExistType() {try{__CLR4_5_2v87v87lusvn1sz.R.inc(40479);
        __CLR4_5_2v87v87lusvn1sz.R.inc(40480);String s = "{\"@type\":\"com.alibaba.fastjson.ValueBean\",\"val\":1}";
        __CLR4_5_2v87v87lusvn1sz.R.inc(40481);Object object = JSONObject.parse(s);
        __CLR4_5_2v87v87lusvn1sz.R.inc(40482);Assert.assertNotNull(object);
        __CLR4_5_2v87v87lusvn1sz.R.inc(40483);Assert.assertTrue(object instanceof JSONObject);
        __CLR4_5_2v87v87lusvn1sz.R.inc(40484);Assert.assertEquals(new Integer(1), JSONObject.class.cast(object).getInteger("val"));
    }finally{__CLR4_5_2v87v87lusvn1sz.R.flushNeeded();}}

    @Test
    public void parseWithExistType() {try{__CLR4_5_2v87v87lusvn1sz.R.inc(40485);
        __CLR4_5_2v87v87lusvn1sz.R.inc(40486);String s = "{\"@type\":\"com.alibaba.fastjson.deserializer.ValueBean\",\"val\":1}";
        __CLR4_5_2v87v87lusvn1sz.R.inc(40487);Object object = JSONObject.parse(s);
        __CLR4_5_2v87v87lusvn1sz.R.inc(40488);Assert.assertNotNull(object);
        __CLR4_5_2v87v87lusvn1sz.R.inc(40489);Assert.assertTrue(object instanceof ValueBean);
        __CLR4_5_2v87v87lusvn1sz.R.inc(40490);Assert.assertEquals(new Integer(1), ValueBean.class.cast(object).getVal());
    }finally{__CLR4_5_2v87v87lusvn1sz.R.flushNeeded();}}

    @Test
    public void parseObjectWithExistType() {try{__CLR4_5_2v87v87lusvn1sz.R.inc(40491);
        __CLR4_5_2v87v87lusvn1sz.R.inc(40492);String s = "{\"@type\":\"com.alibaba.fastjson.deserializer.ValueBean\",\"val\":1}";
        __CLR4_5_2v87v87lusvn1sz.R.inc(40493);ValueBean object = JSONObject.parseObject(s, ValueBean.class);
        __CLR4_5_2v87v87lusvn1sz.R.inc(40494);Assert.assertNotNull(object);
        __CLR4_5_2v87v87lusvn1sz.R.inc(40495);Assert.assertEquals(new Integer(1), object.getVal());
    }finally{__CLR4_5_2v87v87lusvn1sz.R.flushNeeded();}}

}
