/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.junit.Assert;

import com.alibaba.fastjson.JSONObject;

import junit.framework.TestCase;

import java.util.HashMap;
import java.util.List;

public class JSONObjectTest_getObj extends TestCase {static class __CLR4_1_10y22y22lusqjy7z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,44156,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_get_empty() throws Exception {__CLR4_1_10y22y22lusqjy7z.R.globalSliceStart(getClass().getName(),44138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108zv4m6y22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y22y22lusqjy7z.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y22y22lusqjy7z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest_getObj.test_get_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44138,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108zv4m6y22() throws Exception{try{__CLR4_1_10y22y22lusqjy7z.R.inc(44138);
        __CLR4_1_10y22y22lusqjy7z.R.inc(44139);JSONObject obj = new JSONObject();
        __CLR4_1_10y22y22lusqjy7z.R.inc(44140);obj.put("value", "");
        __CLR4_1_10y22y22lusqjy7z.R.inc(44141);Assert.assertEquals("", obj.get("value"));
        __CLR4_1_10y22y22lusqjy7z.R.inc(44142);Assert.assertNull(obj.getObject("value", Model.class));
    }finally{__CLR4_1_10y22y22lusqjy7z.R.flushNeeded();}}
    
    public void test_get_null() throws Exception {__CLR4_1_10y22y22lusqjy7z.R.globalSliceStart(getClass().getName(),44143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f8xgucy27();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y22y22lusqjy7z.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y22y22lusqjy7z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest_getObj.test_get_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44143,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f8xgucy27() throws Exception{try{__CLR4_1_10y22y22lusqjy7z.R.inc(44143);
        __CLR4_1_10y22y22lusqjy7z.R.inc(44144);JSONObject obj = new JSONObject();
        __CLR4_1_10y22y22lusqjy7z.R.inc(44145);obj.put("value", "null");
        __CLR4_1_10y22y22lusqjy7z.R.inc(44146);Assert.assertEquals("null", obj.get("value"));
        __CLR4_1_10y22y22lusqjy7z.R.inc(44147);Assert.assertNull(obj.getObject("value", Model.class));
    }finally{__CLR4_1_10y22y22lusqjy7z.R.flushNeeded();}}

    public void test_get_obj() throws Exception {__CLR4_1_10y22y22lusqjy7z.R.globalSliceStart(getClass().getName(),44148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10awq8soy2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y22y22lusqjy7z.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y22y22lusqjy7z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest_getObj.test_get_obj",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44148,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10awq8soy2c() throws Exception{try{__CLR4_1_10y22y22lusqjy7z.R.inc(44148);
        __CLR4_1_10y22y22lusqjy7z.R.inc(44149);JSONObject obj = new JSONObject();
        __CLR4_1_10y22y22lusqjy7z.R.inc(44150);obj.put("value", new HashMap());
        __CLR4_1_10y22y22lusqjy7z.R.inc(44151);Assert.assertEquals(new JSONObject(), obj.getObject("value", JSONObject.class));
    }finally{__CLR4_1_10y22y22lusqjy7z.R.flushNeeded();}}

    public void test_get_obj2() throws Exception {__CLR4_1_10y22y22lusqjy7z.R.globalSliceStart(getClass().getName(),44152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pthjfcy2g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y22y22lusqjy7z.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y22y22lusqjy7z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest_getObj.test_get_obj2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44152,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pthjfcy2g() throws Exception{try{__CLR4_1_10y22y22lusqjy7z.R.inc(44152);
        __CLR4_1_10y22y22lusqjy7z.R.inc(44153);List<JSONObject> json = JSON.parseArray("[{\"values\":[{}]}]", JSONObject.class);

        __CLR4_1_10y22y22lusqjy7z.R.inc(44154);for (JSONObject obj : json) {{
            __CLR4_1_10y22y22lusqjy7z.R.inc(44155);Object values = obj.getObject("values", new TypeReference<List<JSONObject>>() {});
        }
    }}finally{__CLR4_1_10y22y22lusqjy7z.R.flushNeeded();}}
    
    public static class Model {
        
    }
}
