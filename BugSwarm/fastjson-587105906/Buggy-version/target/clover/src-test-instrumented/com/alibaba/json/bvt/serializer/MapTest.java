/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

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

public class MapTest extends TestCase {static class __CLR4_1_101s7h1s7hlusqkjvt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,83245,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_no_sort() throws Exception {__CLR4_1_101s7h1s7hlusqkjvt.R.globalSliceStart(getClass().getName(),83213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xz3duy1s7h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s7h1s7hlusqkjvt.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s7h1s7hlusqkjvt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapTest.test_no_sort",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83213,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xz3duy1s7h() throws Exception{try{__CLR4_1_101s7h1s7hlusqkjvt.R.inc(83213);
        __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83214);JSONObject obj = new JSONObject(true);
        __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83215);obj.put("name", "jobs");
        __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83216);obj.put("id", 33);
        __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83217);String text = toJSONString(obj);
        __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83218);Assert.assertEquals("{'name':'jobs','id':33}", text);
    }finally{__CLR4_1_101s7h1s7hlusqkjvt.R.flushNeeded();}}
    
    public void test_null() throws Exception {__CLR4_1_101s7h1s7hlusqkjvt.R.globalSliceStart(getClass().getName(),83219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1s7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s7h1s7hlusqkjvt.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s7h1s7hlusqkjvt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapTest.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83219,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1s7n() throws Exception{try{__CLR4_1_101s7h1s7hlusqkjvt.R.inc(83219);
        __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83220);JSONObject obj = new JSONObject(true);
        __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83221);obj.put("name", null);
        __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83222);String text = JSON.toJSONString(obj, SerializerFeature.WriteMapNullValue);
        __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83223);Assert.assertEquals("{\"name\":null}", text);
    }finally{__CLR4_1_101s7h1s7hlusqkjvt.R.flushNeeded();}}

    public static final String toJSONString(Object object) {try{__CLR4_1_101s7h1s7hlusqkjvt.R.inc(83224);
        __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83225);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83226);try {
            __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83227);JSONSerializer serializer = new JSONSerializer(out);
            __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83228);serializer.config(SerializerFeature.SortField, false);
            __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83229);serializer.config(SerializerFeature.UseSingleQuotes, true);

            __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83230);serializer.write(object);

            __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83231);return out.toString();
        } catch (StackOverflowError e) {
            __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83232);throw new JSONException("maybe circular references", e);
        } finally {
            __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83233);out.close();
        }
    }finally{__CLR4_1_101s7h1s7hlusqkjvt.R.flushNeeded();}}

    public void test_onJSONField() {__CLR4_1_101s7h1s7hlusqkjvt.R.globalSliceStart(getClass().getName(),83234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jrl3rh1s82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s7h1s7hlusqkjvt.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s7h1s7hlusqkjvt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapTest.test_onJSONField",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83234,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jrl3rh1s82(){try{__CLR4_1_101s7h1s7hlusqkjvt.R.inc(83234);
        __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83235);Map<String, String> map = new HashMap();
        __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83236);map.put("Ariston", null);
        __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83237);MapNullValue mapNullValue = new MapNullValue();
        __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83238);mapNullValue.setMap( map );
        __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83239);String json = JSON.toJSONString( mapNullValue );
        __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83240);assertEquals("{\"map\":{\"Ariston\":null}}", json);
    }finally{__CLR4_1_101s7h1s7hlusqkjvt.R.flushNeeded();}}

    class MapNullValue {
        @JSONField(serialzeFeatures = {SerializerFeature.WriteMapNullValue})
        private Map map;

        public Map getMap() {try{__CLR4_1_101s7h1s7hlusqkjvt.R.inc(83241);
            __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83242);return map;
        }finally{__CLR4_1_101s7h1s7hlusqkjvt.R.flushNeeded();}}

        public void setMap( Map map ) {try{__CLR4_1_101s7h1s7hlusqkjvt.R.inc(83243);
            __CLR4_1_101s7h1s7hlusqkjvt.R.inc(83244);this.map = map;
        }finally{__CLR4_1_101s7h1s7hlusqkjvt.R.flushNeeded();}}
    }

}
