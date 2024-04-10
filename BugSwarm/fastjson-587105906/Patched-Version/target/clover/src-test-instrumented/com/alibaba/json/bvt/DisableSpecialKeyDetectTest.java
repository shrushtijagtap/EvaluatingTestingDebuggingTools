/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt;

import java.util.Map;
import java.util.Set;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;

public class DisableSpecialKeyDetectTest extends TestCase {static class __CLR4_5_2wx8wx8lusyjpri{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,42691,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_2wx8wx8lusyjpri.R.globalSliceStart(getClass().getName(),42668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp2wx8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wx8wx8lusyjpri.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wx8wx8lusyjpri.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.DisableSpecialKeyDetectTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42668,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp2wx8() throws Exception{try{__CLR4_5_2wx8wx8lusyjpri.R.inc(42668);
        __CLR4_5_2wx8wx8lusyjpri.R.inc(42669);String json = "{\"schema\":{\"$ref\":{\"@title\":\"\u7c7b\u76eeID\",\"@type\":\"string\"},\"$\":{\"@\":\"\u7c7b\u76ee\u540d\u79f0\",\"type\":\"string\"},\"cat_desc\":{\"title\":\"\u7c7b\u76ee\u63cf\u8ff0\",\"type\":\"string\"}}}";
        __CLR4_5_2wx8wx8lusyjpri.R.inc(42670);JSONObject errorJson = JSON.parseObject(json, Feature.DisableSpecialKeyDetect);
        __CLR4_5_2wx8wx8lusyjpri.R.inc(42671);JSONObject schema = errorJson.getJSONObject("schema");
        __CLR4_5_2wx8wx8lusyjpri.R.inc(42672);Set<Map.Entry<String, Object>> es2 = schema.entrySet();
        __CLR4_5_2wx8wx8lusyjpri.R.inc(42673);for (Map.Entry<String, Object> entry : es2) {{
            __CLR4_5_2wx8wx8lusyjpri.R.inc(42674);System.out.println(entry.getKey() + "_" + entry.getValue());
        }
    }}finally{__CLR4_5_2wx8wx8lusyjpri.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_2wx8wx8lusyjpri.R.globalSliceStart(getClass().getName(),42675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwlwxf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wx8wx8lusyjpri.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wx8wx8lusyjpri.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.DisableSpecialKeyDetectTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42675,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwlwxf() throws Exception{try{__CLR4_5_2wx8wx8lusyjpri.R.inc(42675);
        __CLR4_5_2wx8wx8lusyjpri.R.inc(42676);String text = "{\"@v1\":\"v1\",\"@type\":\"v2\", \"@\":\"v3\",\"$\":\"v4\",\"$ref\":\"v5\"}";
        __CLR4_5_2wx8wx8lusyjpri.R.inc(42677);JSONObject json = JSON.parseObject(text, Feature.DisableSpecialKeyDetect);
        __CLR4_5_2wx8wx8lusyjpri.R.inc(42678);Assert.assertEquals("v1", json.getString("@v1"));
        __CLR4_5_2wx8wx8lusyjpri.R.inc(42679);Assert.assertEquals("v2", json.getString("@type"));
        __CLR4_5_2wx8wx8lusyjpri.R.inc(42680);Assert.assertEquals("v3", json.getString("@"));
        __CLR4_5_2wx8wx8lusyjpri.R.inc(42681);Assert.assertEquals("v4", json.getString("$"));
        __CLR4_5_2wx8wx8lusyjpri.R.inc(42682);Assert.assertEquals("v5", json.getString("$ref"));
    }finally{__CLR4_5_2wx8wx8lusyjpri.R.flushNeeded();}}
    
    public void test_2() throws Exception {__CLR4_5_2wx8wx8lusyjpri.R.globalSliceStart(getClass().getName(),42683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k44wxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wx8wx8lusyjpri.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wx8wx8lusyjpri.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.DisableSpecialKeyDetectTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42683,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k44wxn() throws Exception{try{__CLR4_5_2wx8wx8lusyjpri.R.inc(42683);
        __CLR4_5_2wx8wx8lusyjpri.R.inc(42684);String text = "{\"@v1\":\"v1\",\"@type\":\"v2\", \"@\":\"v3\",\"$\":\"v4\",\"$ref\":\"v5\"}";
        __CLR4_5_2wx8wx8lusyjpri.R.inc(42685);Map<String,String> map = JSON.parseObject(text, new TypeReference<Map<String,String>>(){}, Feature.DisableSpecialKeyDetect);
        __CLR4_5_2wx8wx8lusyjpri.R.inc(42686);Assert.assertEquals("v1", map.get("@v1"));
        __CLR4_5_2wx8wx8lusyjpri.R.inc(42687);Assert.assertEquals("v2", map.get("@type"));
        __CLR4_5_2wx8wx8lusyjpri.R.inc(42688);Assert.assertEquals("v3", map.get("@"));
        __CLR4_5_2wx8wx8lusyjpri.R.inc(42689);Assert.assertEquals("v4", map.get("$"));
        __CLR4_5_2wx8wx8lusyjpri.R.inc(42690);Assert.assertEquals("v5", map.get("$ref"));
    }finally{__CLR4_5_2wx8wx8lusyjpri.R.flushNeeded();}}

}
