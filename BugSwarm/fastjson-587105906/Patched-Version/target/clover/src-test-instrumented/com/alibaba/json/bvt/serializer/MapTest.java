/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import com.alibaba.fastjson.annotation.JSONField;
import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.HashMap;
import java.util.Map;

public class MapTest extends TestCase {static class __CLR4_5_21t5e1t5elusvngex{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,84466,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_no_sort() throws Exception {__CLR4_5_21t5e1t5elusvngex.R.globalSliceStart(getClass().getName(),84434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xz3duy1t5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t5e1t5elusvngex.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t5e1t5elusvngex.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapTest.test_no_sort",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84434,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xz3duy1t5e() throws Exception{try{__CLR4_5_21t5e1t5elusvngex.R.inc(84434);
        __CLR4_5_21t5e1t5elusvngex.R.inc(84435);JSONObject obj = new JSONObject(true);
        __CLR4_5_21t5e1t5elusvngex.R.inc(84436);obj.put("name", "jobs");
        __CLR4_5_21t5e1t5elusvngex.R.inc(84437);obj.put("id", 33);
        __CLR4_5_21t5e1t5elusvngex.R.inc(84438);String text = toJSONString(obj);
        __CLR4_5_21t5e1t5elusvngex.R.inc(84439);Assert.assertEquals("{'name':'jobs','id':33}", text);
    }finally{__CLR4_5_21t5e1t5elusvngex.R.flushNeeded();}}
    
    public void test_null() throws Exception {__CLR4_5_21t5e1t5elusvngex.R.globalSliceStart(getClass().getName(),84440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1t5k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t5e1t5elusvngex.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t5e1t5elusvngex.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapTest.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84440,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1t5k() throws Exception{try{__CLR4_5_21t5e1t5elusvngex.R.inc(84440);
        __CLR4_5_21t5e1t5elusvngex.R.inc(84441);JSONObject obj = new JSONObject(true);
        __CLR4_5_21t5e1t5elusvngex.R.inc(84442);obj.put("name", null);
        __CLR4_5_21t5e1t5elusvngex.R.inc(84443);String text = JSON.toJSONString(obj, SerializerFeature.WriteMapNullValue);
        __CLR4_5_21t5e1t5elusvngex.R.inc(84444);Assert.assertEquals("{\"name\":null}", text);
    }finally{__CLR4_5_21t5e1t5elusvngex.R.flushNeeded();}}

    public static final String toJSONString(Object object) {try{__CLR4_5_21t5e1t5elusvngex.R.inc(84445);
        __CLR4_5_21t5e1t5elusvngex.R.inc(84446);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21t5e1t5elusvngex.R.inc(84447);try {
            __CLR4_5_21t5e1t5elusvngex.R.inc(84448);JSONSerializer serializer = new JSONSerializer(out);
            __CLR4_5_21t5e1t5elusvngex.R.inc(84449);serializer.config(SerializerFeature.SortField, false);
            __CLR4_5_21t5e1t5elusvngex.R.inc(84450);serializer.config(SerializerFeature.UseSingleQuotes, true);

            __CLR4_5_21t5e1t5elusvngex.R.inc(84451);serializer.write(object);

            __CLR4_5_21t5e1t5elusvngex.R.inc(84452);return out.toString();
        } catch (StackOverflowError e) {
            __CLR4_5_21t5e1t5elusvngex.R.inc(84453);throw new JSONException("maybe circular references", e);
        } finally {
            __CLR4_5_21t5e1t5elusvngex.R.inc(84454);out.close();
        }
    }finally{__CLR4_5_21t5e1t5elusvngex.R.flushNeeded();}}

    public void test_onJSONField() {__CLR4_5_21t5e1t5elusvngex.R.globalSliceStart(getClass().getName(),84455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jrl3rh1t5z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t5e1t5elusvngex.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t5e1t5elusvngex.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapTest.test_onJSONField",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84455,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jrl3rh1t5z(){try{__CLR4_5_21t5e1t5elusvngex.R.inc(84455);
        __CLR4_5_21t5e1t5elusvngex.R.inc(84456);Map<String, String> map = new HashMap();
        __CLR4_5_21t5e1t5elusvngex.R.inc(84457);map.put("Ariston", null);
        __CLR4_5_21t5e1t5elusvngex.R.inc(84458);MapNullValue mapNullValue = new MapNullValue();
        __CLR4_5_21t5e1t5elusvngex.R.inc(84459);mapNullValue.setMap( map );
        __CLR4_5_21t5e1t5elusvngex.R.inc(84460);String json = JSON.toJSONString( mapNullValue );
        __CLR4_5_21t5e1t5elusvngex.R.inc(84461);assertEquals("{\"map\":{\"Ariston\":null}}", json);
    }finally{__CLR4_5_21t5e1t5elusvngex.R.flushNeeded();}}

    class MapNullValue {
        @JSONField(serialzeFeatures = {SerializerFeature.WriteMapNullValue})
        private Map map;

        public Map getMap() {try{__CLR4_5_21t5e1t5elusvngex.R.inc(84462);
            __CLR4_5_21t5e1t5elusvngex.R.inc(84463);return map;
        }finally{__CLR4_5_21t5e1t5elusvngex.R.flushNeeded();}}

        public void setMap( Map map ) {try{__CLR4_5_21t5e1t5elusvngex.R.inc(84464);
            __CLR4_5_21t5e1t5elusvngex.R.inc(84465);this.map = map;
        }finally{__CLR4_5_21t5e1t5elusvngex.R.flushNeeded();}}
    }

}
