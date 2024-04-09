/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.basicType;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class LongTest_browserCompatible extends TestCase {static class __CLR4_5_213jw13jwlusvn52b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,51309,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_array() throws Exception {__CLR4_5_213jw13jwlusvn52b.R.globalSliceStart(getClass().getName(),51260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vw0vd913jw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213jw13jwlusvn52b.R.rethrow($CLV_t2$);}finally{__CLR4_5_213jw13jwlusvn52b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.LongTest_browserCompatible.test_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51260,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vw0vd913jw() throws Exception{try{__CLR4_5_213jw13jwlusvn52b.R.inc(51260);
        __CLR4_5_213jw13jwlusvn52b.R.inc(51261);long[] values = new long[] {Long.MIN_VALUE, -1, 0, 1, Long.MAX_VALUE};
        __CLR4_5_213jw13jwlusvn52b.R.inc(51262);String text = JSON.toJSONString(values, SerializerFeature.BrowserCompatible);
        __CLR4_5_213jw13jwlusvn52b.R.inc(51263);long[] values_2 = JSON.parseObject(text, long[].class);
        __CLR4_5_213jw13jwlusvn52b.R.inc(51264);Assert.assertEquals(values_2.length, values.length);
        __CLR4_5_213jw13jwlusvn52b.R.inc(51265);for (int i = 0; (((i < values.length)&&(__CLR4_5_213jw13jwlusvn52b.R.iget(51266)!=0|true))||(__CLR4_5_213jw13jwlusvn52b.R.iget(51267)==0&false)); ++i) {{
            __CLR4_5_213jw13jwlusvn52b.R.inc(51268);Assert.assertEquals(values[i], values_2[i]);
        }
    }}finally{__CLR4_5_213jw13jwlusvn52b.R.flushNeeded();}}
    
    public void test_array_writer() throws Exception {__CLR4_5_213jw13jwlusvn52b.R.globalSliceStart(getClass().getName(),51269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9c5d913k5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213jw13jwlusvn52b.R.rethrow($CLV_t2$);}finally{__CLR4_5_213jw13jwlusvn52b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.LongTest_browserCompatible.test_array_writer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51269,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9c5d913k5() throws Exception{try{__CLR4_5_213jw13jwlusvn52b.R.inc(51269);
        __CLR4_5_213jw13jwlusvn52b.R.inc(51270);long[] values = new long[] {Long.MIN_VALUE, -1, 0, 1, Long.MAX_VALUE};
        
        __CLR4_5_213jw13jwlusvn52b.R.inc(51271);StringWriter writer = new StringWriter();
        __CLR4_5_213jw13jwlusvn52b.R.inc(51272);JSON.writeJSONString(writer, values, SerializerFeature.BrowserCompatible);
        __CLR4_5_213jw13jwlusvn52b.R.inc(51273);String text = writer.toString();
        __CLR4_5_213jw13jwlusvn52b.R.inc(51274);long[] values_2 = JSON.parseObject(text, long[].class);
        __CLR4_5_213jw13jwlusvn52b.R.inc(51275);Assert.assertEquals(values_2.length, values.length);
        __CLR4_5_213jw13jwlusvn52b.R.inc(51276);for (int i = 0; (((i < values.length)&&(__CLR4_5_213jw13jwlusvn52b.R.iget(51277)!=0|true))||(__CLR4_5_213jw13jwlusvn52b.R.iget(51278)==0&false)); ++i) {{
            __CLR4_5_213jw13jwlusvn52b.R.inc(51279);Assert.assertEquals(values[i], values_2[i]);
        }
    }}finally{__CLR4_5_213jw13jwlusvn52b.R.flushNeeded();}}
    
    public void test_array_writer_2() throws Exception {__CLR4_5_213jw13jwlusvn52b.R.globalSliceStart(getClass().getName(),51280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21mgc8w13kg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213jw13jwlusvn52b.R.rethrow($CLV_t2$);}finally{__CLR4_5_213jw13jwlusvn52b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.LongTest_browserCompatible.test_array_writer_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51280,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21mgc8w13kg() throws Exception{try{__CLR4_5_213jw13jwlusvn52b.R.inc(51280);
        __CLR4_5_213jw13jwlusvn52b.R.inc(51281);Random random = new Random();
        __CLR4_5_213jw13jwlusvn52b.R.inc(51282);long[] values = new long[2048];
        __CLR4_5_213jw13jwlusvn52b.R.inc(51283);for (int i = 0; (((i < values.length)&&(__CLR4_5_213jw13jwlusvn52b.R.iget(51284)!=0|true))||(__CLR4_5_213jw13jwlusvn52b.R.iget(51285)==0&false)); ++i) {{
            __CLR4_5_213jw13jwlusvn52b.R.inc(51286);values[i] = random.nextLong();
        }
        
        }__CLR4_5_213jw13jwlusvn52b.R.inc(51287);StringWriter writer = new StringWriter();
        __CLR4_5_213jw13jwlusvn52b.R.inc(51288);JSON.writeJSONString(writer, values, SerializerFeature.BrowserCompatible);
        __CLR4_5_213jw13jwlusvn52b.R.inc(51289);String text = writer.toString();
        __CLR4_5_213jw13jwlusvn52b.R.inc(51290);long[] values_2 = JSON.parseObject(text, long[].class);
        __CLR4_5_213jw13jwlusvn52b.R.inc(51291);Assert.assertEquals(values_2.length, values.length);
        __CLR4_5_213jw13jwlusvn52b.R.inc(51292);for (int i = 0; (((i < values.length)&&(__CLR4_5_213jw13jwlusvn52b.R.iget(51293)!=0|true))||(__CLR4_5_213jw13jwlusvn52b.R.iget(51294)==0&false)); ++i) {{
            __CLR4_5_213jw13jwlusvn52b.R.inc(51295);Assert.assertEquals(values[i], values_2[i]);
        }
    }}finally{__CLR4_5_213jw13jwlusvn52b.R.flushNeeded();}}
    
    public void test_map() throws Exception {__CLR4_5_213jw13jwlusvn52b.R.globalSliceStart(getClass().getName(),51296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aaqgyy13kw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213jw13jwlusvn52b.R.rethrow($CLV_t2$);}finally{__CLR4_5_213jw13jwlusvn52b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.LongTest_browserCompatible.test_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51296,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aaqgyy13kw() throws Exception{try{__CLR4_5_213jw13jwlusvn52b.R.inc(51296);
        __CLR4_5_213jw13jwlusvn52b.R.inc(51297);long[] values = new long[] {Long.MIN_VALUE, -1, 0, 1, Long.MAX_VALUE};
        __CLR4_5_213jw13jwlusvn52b.R.inc(51298);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_213jw13jwlusvn52b.R.inc(51299);for (int i = 0; (((i < values.length)&&(__CLR4_5_213jw13jwlusvn52b.R.iget(51300)!=0|true))||(__CLR4_5_213jw13jwlusvn52b.R.iget(51301)==0&false)); ++i) {{
            __CLR4_5_213jw13jwlusvn52b.R.inc(51302);map.put(Long.toString(i), values[i]);
        }
        
        }__CLR4_5_213jw13jwlusvn52b.R.inc(51303);String text = JSON.toJSONString(map, SerializerFeature.BrowserCompatible);
        __CLR4_5_213jw13jwlusvn52b.R.inc(51304);JSONObject obj = JSON.parseObject(text);
        __CLR4_5_213jw13jwlusvn52b.R.inc(51305);for (int i = 0; (((i < values.length)&&(__CLR4_5_213jw13jwlusvn52b.R.iget(51306)!=0|true))||(__CLR4_5_213jw13jwlusvn52b.R.iget(51307)==0&false)); ++i) {{
            __CLR4_5_213jw13jwlusvn52b.R.inc(51308);Assert.assertEquals(values[i], ((Number) obj.getLong(Long.toString(i))).longValue());
        }
    }}finally{__CLR4_5_213jw13jwlusvn52b.R.flushNeeded();}}
}
