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

public class LongTest_browserCompatible extends TestCase {static class __CLR4_5_212lo12lolusyjr0p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,50077,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_array() throws Exception {__CLR4_5_212lo12lolusyjr0p.R.globalSliceStart(getClass().getName(),50028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vw0vd912lo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212lo12lolusyjr0p.R.rethrow($CLV_t2$);}finally{__CLR4_5_212lo12lolusyjr0p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.LongTest_browserCompatible.test_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50028,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vw0vd912lo() throws Exception{try{__CLR4_5_212lo12lolusyjr0p.R.inc(50028);
        __CLR4_5_212lo12lolusyjr0p.R.inc(50029);long[] values = new long[] {Long.MIN_VALUE, -1, 0, 1, Long.MAX_VALUE};
        __CLR4_5_212lo12lolusyjr0p.R.inc(50030);String text = JSON.toJSONString(values, SerializerFeature.BrowserCompatible);
        __CLR4_5_212lo12lolusyjr0p.R.inc(50031);long[] values_2 = JSON.parseObject(text, long[].class);
        __CLR4_5_212lo12lolusyjr0p.R.inc(50032);Assert.assertEquals(values_2.length, values.length);
        __CLR4_5_212lo12lolusyjr0p.R.inc(50033);for (int i = 0; (((i < values.length)&&(__CLR4_5_212lo12lolusyjr0p.R.iget(50034)!=0|true))||(__CLR4_5_212lo12lolusyjr0p.R.iget(50035)==0&false)); ++i) {{
            __CLR4_5_212lo12lolusyjr0p.R.inc(50036);Assert.assertEquals(values[i], values_2[i]);
        }
    }}finally{__CLR4_5_212lo12lolusyjr0p.R.flushNeeded();}}
    
    public void test_array_writer() throws Exception {__CLR4_5_212lo12lolusyjr0p.R.globalSliceStart(getClass().getName(),50037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9c5d912lx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212lo12lolusyjr0p.R.rethrow($CLV_t2$);}finally{__CLR4_5_212lo12lolusyjr0p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.LongTest_browserCompatible.test_array_writer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50037,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9c5d912lx() throws Exception{try{__CLR4_5_212lo12lolusyjr0p.R.inc(50037);
        __CLR4_5_212lo12lolusyjr0p.R.inc(50038);long[] values = new long[] {Long.MIN_VALUE, -1, 0, 1, Long.MAX_VALUE};
        
        __CLR4_5_212lo12lolusyjr0p.R.inc(50039);StringWriter writer = new StringWriter();
        __CLR4_5_212lo12lolusyjr0p.R.inc(50040);JSON.writeJSONString(writer, values, SerializerFeature.BrowserCompatible);
        __CLR4_5_212lo12lolusyjr0p.R.inc(50041);String text = writer.toString();
        __CLR4_5_212lo12lolusyjr0p.R.inc(50042);long[] values_2 = JSON.parseObject(text, long[].class);
        __CLR4_5_212lo12lolusyjr0p.R.inc(50043);Assert.assertEquals(values_2.length, values.length);
        __CLR4_5_212lo12lolusyjr0p.R.inc(50044);for (int i = 0; (((i < values.length)&&(__CLR4_5_212lo12lolusyjr0p.R.iget(50045)!=0|true))||(__CLR4_5_212lo12lolusyjr0p.R.iget(50046)==0&false)); ++i) {{
            __CLR4_5_212lo12lolusyjr0p.R.inc(50047);Assert.assertEquals(values[i], values_2[i]);
        }
    }}finally{__CLR4_5_212lo12lolusyjr0p.R.flushNeeded();}}
    
    public void test_array_writer_2() throws Exception {__CLR4_5_212lo12lolusyjr0p.R.globalSliceStart(getClass().getName(),50048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21mgc8w12m8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212lo12lolusyjr0p.R.rethrow($CLV_t2$);}finally{__CLR4_5_212lo12lolusyjr0p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.LongTest_browserCompatible.test_array_writer_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50048,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21mgc8w12m8() throws Exception{try{__CLR4_5_212lo12lolusyjr0p.R.inc(50048);
        __CLR4_5_212lo12lolusyjr0p.R.inc(50049);Random random = new Random();
        __CLR4_5_212lo12lolusyjr0p.R.inc(50050);long[] values = new long[2048];
        __CLR4_5_212lo12lolusyjr0p.R.inc(50051);for (int i = 0; (((i < values.length)&&(__CLR4_5_212lo12lolusyjr0p.R.iget(50052)!=0|true))||(__CLR4_5_212lo12lolusyjr0p.R.iget(50053)==0&false)); ++i) {{
            __CLR4_5_212lo12lolusyjr0p.R.inc(50054);values[i] = random.nextLong();
        }
        
        }__CLR4_5_212lo12lolusyjr0p.R.inc(50055);StringWriter writer = new StringWriter();
        __CLR4_5_212lo12lolusyjr0p.R.inc(50056);JSON.writeJSONString(writer, values, SerializerFeature.BrowserCompatible);
        __CLR4_5_212lo12lolusyjr0p.R.inc(50057);String text = writer.toString();
        __CLR4_5_212lo12lolusyjr0p.R.inc(50058);long[] values_2 = JSON.parseObject(text, long[].class);
        __CLR4_5_212lo12lolusyjr0p.R.inc(50059);Assert.assertEquals(values_2.length, values.length);
        __CLR4_5_212lo12lolusyjr0p.R.inc(50060);for (int i = 0; (((i < values.length)&&(__CLR4_5_212lo12lolusyjr0p.R.iget(50061)!=0|true))||(__CLR4_5_212lo12lolusyjr0p.R.iget(50062)==0&false)); ++i) {{
            __CLR4_5_212lo12lolusyjr0p.R.inc(50063);Assert.assertEquals(values[i], values_2[i]);
        }
    }}finally{__CLR4_5_212lo12lolusyjr0p.R.flushNeeded();}}
    
    public void test_map() throws Exception {__CLR4_5_212lo12lolusyjr0p.R.globalSliceStart(getClass().getName(),50064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aaqgyy12mo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212lo12lolusyjr0p.R.rethrow($CLV_t2$);}finally{__CLR4_5_212lo12lolusyjr0p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.LongTest_browserCompatible.test_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50064,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aaqgyy12mo() throws Exception{try{__CLR4_5_212lo12lolusyjr0p.R.inc(50064);
        __CLR4_5_212lo12lolusyjr0p.R.inc(50065);long[] values = new long[] {Long.MIN_VALUE, -1, 0, 1, Long.MAX_VALUE};
        __CLR4_5_212lo12lolusyjr0p.R.inc(50066);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_212lo12lolusyjr0p.R.inc(50067);for (int i = 0; (((i < values.length)&&(__CLR4_5_212lo12lolusyjr0p.R.iget(50068)!=0|true))||(__CLR4_5_212lo12lolusyjr0p.R.iget(50069)==0&false)); ++i) {{
            __CLR4_5_212lo12lolusyjr0p.R.inc(50070);map.put(Long.toString(i), values[i]);
        }
        
        }__CLR4_5_212lo12lolusyjr0p.R.inc(50071);String text = JSON.toJSONString(map, SerializerFeature.BrowserCompatible);
        __CLR4_5_212lo12lolusyjr0p.R.inc(50072);JSONObject obj = JSON.parseObject(text);
        __CLR4_5_212lo12lolusyjr0p.R.inc(50073);for (int i = 0; (((i < values.length)&&(__CLR4_5_212lo12lolusyjr0p.R.iget(50074)!=0|true))||(__CLR4_5_212lo12lolusyjr0p.R.iget(50075)==0&false)); ++i) {{
            __CLR4_5_212lo12lolusyjr0p.R.inc(50076);Assert.assertEquals(values[i], ((Number) obj.getLong(Long.toString(i))).longValue());
        }
    }}finally{__CLR4_5_212lo12lolusyjr0p.R.flushNeeded();}}
}
