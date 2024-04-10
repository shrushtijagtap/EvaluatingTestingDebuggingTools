/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.writeClassName;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class WriteDuplicateType extends TestCase {static class __CLR4_1_10201f201fluszwgs3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,93397,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_dupType() throws Exception {__CLR4_1_10201f201fluszwgs3.R.globalSliceStart(getClass().getName(),93363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kd51ir201f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10201f201fluszwgs3.R.rethrow($CLV_t2$);}finally{__CLR4_1_10201f201fluszwgs3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeClassName.WriteDuplicateType.test_dupType",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),93363,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kd51ir201f() throws Exception{try{__CLR4_1_10201f201fluszwgs3.R.inc(93363);
        __CLR4_1_10201f201fluszwgs3.R.inc(93364);DianDianCart cart = new DianDianCart();
        __CLR4_1_10201f201fluszwgs3.R.inc(93365);cart.setId(1001);
        
        __CLR4_1_10201f201fluszwgs3.R.inc(93366);LinkedHashMap<String, JSONObject> cartMap = new LinkedHashMap<String, JSONObject>();
        
        __CLR4_1_10201f201fluszwgs3.R.inc(93367);JSONObject obj = new JSONObject();
        __CLR4_1_10201f201fluszwgs3.R.inc(93368);obj.put("id", 1001);
        __CLR4_1_10201f201fluszwgs3.R.inc(93369);obj.put(JSON.DEFAULT_TYPE_KEY, "com.alibaba.json.bvt.writeClassName.WriteDuplicateType$DianDianCart");
        __CLR4_1_10201f201fluszwgs3.R.inc(93370);cartMap.put("1001", obj);
        
        __CLR4_1_10201f201fluszwgs3.R.inc(93371);String text1 = JSON.toJSONString(cartMap, SerializerFeature.WriteClassName);
        __CLR4_1_10201f201fluszwgs3.R.inc(93372);Assert.assertEquals("{\"@type\":\"java.util.LinkedHashMap\",\"1001\":{\"@type\":\"com.alibaba.json.bvt.writeClassName.WriteDuplicateType$DianDianCart\",\"id\":1001}}", text1);
        
    }finally{__CLR4_1_10201f201fluszwgs3.R.flushNeeded();}}
    
    public void test_dupType2() throws Exception {__CLR4_1_10201f201fluszwgs3.R.globalSliceStart(getClass().getName(),93373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yts1zh201p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10201f201fluszwgs3.R.rethrow($CLV_t2$);}finally{__CLR4_1_10201f201fluszwgs3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeClassName.WriteDuplicateType.test_dupType2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),93373,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yts1zh201p() throws Exception{try{__CLR4_1_10201f201fluszwgs3.R.inc(93373);
        __CLR4_1_10201f201fluszwgs3.R.inc(93374);DianDianCart cart = new DianDianCart();
        __CLR4_1_10201f201fluszwgs3.R.inc(93375);cart.setId(1001);
        
        __CLR4_1_10201f201fluszwgs3.R.inc(93376);LinkedHashMap<String, HashMap<String, Object>> cartMap = new LinkedHashMap<String, HashMap<String, Object>>();
        
        __CLR4_1_10201f201fluszwgs3.R.inc(93377);HashMap<String, Object> obj = new HashMap<String, Object>();
        __CLR4_1_10201f201fluszwgs3.R.inc(93378);obj.put("id", 1001);
        __CLR4_1_10201f201fluszwgs3.R.inc(93379);obj.put(JSON.DEFAULT_TYPE_KEY, "com.alibaba.json.bvt.writeClassName.WriteDuplicateType$DianDianCart");
        __CLR4_1_10201f201fluszwgs3.R.inc(93380);cartMap.put("1001", obj);
        
        __CLR4_1_10201f201fluszwgs3.R.inc(93381);String text1 = JSON.toJSONString(cartMap, SerializerFeature.WriteClassName);
        __CLR4_1_10201f201fluszwgs3.R.inc(93382);Assert.assertEquals("{\"@type\":\"java.util.LinkedHashMap\",\"1001\":{\"@type\":\"com.alibaba.json.bvt.writeClassName.WriteDuplicateType$DianDianCart\",\"id\":1001}}", text1);
        
    }finally{__CLR4_1_10201f201fluszwgs3.R.flushNeeded();}}
    
    
    public void test_dupType3() throws Exception {__CLR4_1_10201f201fluszwgs3.R.globalSliceStart(getClass().getName(),93383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wyc176201z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10201f201fluszwgs3.R.rethrow($CLV_t2$);}finally{__CLR4_1_10201f201fluszwgs3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeClassName.WriteDuplicateType.test_dupType3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),93383,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wyc176201z() throws Exception{try{__CLR4_1_10201f201fluszwgs3.R.inc(93383);
        __CLR4_1_10201f201fluszwgs3.R.inc(93384);DianDianCart cart = new DianDianCart();
        __CLR4_1_10201f201fluszwgs3.R.inc(93385);cart.setId(1001);
        
        __CLR4_1_10201f201fluszwgs3.R.inc(93386);LinkedHashMap<String, LinkedHashMap<String, Object>> cartMap = new LinkedHashMap<String, LinkedHashMap<String, Object>>();
        
        __CLR4_1_10201f201fluszwgs3.R.inc(93387);LinkedHashMap<String, Object> obj = new LinkedHashMap<String, Object>();
        __CLR4_1_10201f201fluszwgs3.R.inc(93388);obj.put(JSON.DEFAULT_TYPE_KEY, "com.alibaba.json.bvt.writeClassName.WriteDuplicateType$DianDianCart");
        __CLR4_1_10201f201fluszwgs3.R.inc(93389);obj.put("id", 1001);
        __CLR4_1_10201f201fluszwgs3.R.inc(93390);cartMap.put("1001", obj);
        
        __CLR4_1_10201f201fluszwgs3.R.inc(93391);String text1 = JSON.toJSONString(cartMap, SerializerFeature.WriteClassName);
        __CLR4_1_10201f201fluszwgs3.R.inc(93392);Assert.assertEquals("{\"@type\":\"java.util.LinkedHashMap\",\"1001\":{\"@type\":\"com.alibaba.json.bvt.writeClassName.WriteDuplicateType$DianDianCart\",\"id\":1001}}", text1);
        
    }finally{__CLR4_1_10201f201fluszwgs3.R.flushNeeded();}}

    public static class DianDianCart {

        private int id;

        public int getId() {try{__CLR4_1_10201f201fluszwgs3.R.inc(93393);
            __CLR4_1_10201f201fluszwgs3.R.inc(93394);return id;
        }finally{__CLR4_1_10201f201fluszwgs3.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_10201f201fluszwgs3.R.inc(93395);
            __CLR4_1_10201f201fluszwgs3.R.inc(93396);this.id = id;
        }finally{__CLR4_1_10201f201fluszwgs3.R.flushNeeded();}}

    }
}
