/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.junit.Assert;

import com.alibaba.fastjson.JSONObject;

import junit.framework.TestCase;

import java.util.HashMap;
import java.util.List;

public class JSONObjectTest_getObj extends TestCase {static class __CLR4_5_2y1yy1ylusyjpzm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,44152,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_get_empty() throws Exception {__CLR4_5_2y1yy1ylusyjpzm.R.globalSliceStart(getClass().getName(),44134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28zv4m6y1y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y1yy1ylusyjpzm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y1yy1ylusyjpzm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest_getObj.test_get_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44134,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28zv4m6y1y() throws Exception{try{__CLR4_5_2y1yy1ylusyjpzm.R.inc(44134);
        __CLR4_5_2y1yy1ylusyjpzm.R.inc(44135);JSONObject obj = new JSONObject();
        __CLR4_5_2y1yy1ylusyjpzm.R.inc(44136);obj.put("value", "");
        __CLR4_5_2y1yy1ylusyjpzm.R.inc(44137);Assert.assertEquals("", obj.get("value"));
        __CLR4_5_2y1yy1ylusyjpzm.R.inc(44138);Assert.assertNull(obj.getObject("value", Model.class));
    }finally{__CLR4_5_2y1yy1ylusyjpzm.R.flushNeeded();}}
    
    public void test_get_null() throws Exception {__CLR4_5_2y1yy1ylusyjpzm.R.globalSliceStart(getClass().getName(),44139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f8xgucy23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y1yy1ylusyjpzm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y1yy1ylusyjpzm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest_getObj.test_get_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44139,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f8xgucy23() throws Exception{try{__CLR4_5_2y1yy1ylusyjpzm.R.inc(44139);
        __CLR4_5_2y1yy1ylusyjpzm.R.inc(44140);JSONObject obj = new JSONObject();
        __CLR4_5_2y1yy1ylusyjpzm.R.inc(44141);obj.put("value", "null");
        __CLR4_5_2y1yy1ylusyjpzm.R.inc(44142);Assert.assertEquals("null", obj.get("value"));
        __CLR4_5_2y1yy1ylusyjpzm.R.inc(44143);Assert.assertNull(obj.getObject("value", Model.class));
    }finally{__CLR4_5_2y1yy1ylusyjpzm.R.flushNeeded();}}

    public void test_get_obj() throws Exception {__CLR4_5_2y1yy1ylusyjpzm.R.globalSliceStart(getClass().getName(),44144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2awq8soy28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y1yy1ylusyjpzm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y1yy1ylusyjpzm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest_getObj.test_get_obj",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44144,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2awq8soy28() throws Exception{try{__CLR4_5_2y1yy1ylusyjpzm.R.inc(44144);
        __CLR4_5_2y1yy1ylusyjpzm.R.inc(44145);JSONObject obj = new JSONObject();
        __CLR4_5_2y1yy1ylusyjpzm.R.inc(44146);obj.put("value", new HashMap());
        __CLR4_5_2y1yy1ylusyjpzm.R.inc(44147);Assert.assertEquals(new JSONObject(), obj.getObject("value", JSONObject.class));
    }finally{__CLR4_5_2y1yy1ylusyjpzm.R.flushNeeded();}}

    public void test_get_obj2() throws Exception {__CLR4_5_2y1yy1ylusyjpzm.R.globalSliceStart(getClass().getName(),44148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pthjfcy2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y1yy1ylusyjpzm.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y1yy1ylusyjpzm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest_getObj.test_get_obj2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44148,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pthjfcy2c() throws Exception{try{__CLR4_5_2y1yy1ylusyjpzm.R.inc(44148);
        __CLR4_5_2y1yy1ylusyjpzm.R.inc(44149);List<JSONObject> json = JSON.parseArray("[{\"values\":[{}]}]", JSONObject.class);

        __CLR4_5_2y1yy1ylusyjpzm.R.inc(44150);for (JSONObject obj : json) {{
            __CLR4_5_2y1yy1ylusyjpzm.R.inc(44151);Object values = obj.getObject("values", new TypeReference<List<JSONObject>>() {});
        }
    }}finally{__CLR4_5_2y1yy1ylusyjpzm.R.flushNeeded();}}
    
    public static class Model {
        
    }
}
