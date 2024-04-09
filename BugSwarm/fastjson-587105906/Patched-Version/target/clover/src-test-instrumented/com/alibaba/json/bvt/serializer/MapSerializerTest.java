/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.MapSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class MapSerializerTest extends TestCase {static class __CLR4_5_21t3d1t3dlusvngep{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,84434,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_empty_1() throws Exception {__CLR4_5_21t3d1t3dlusvngep.R.globalSliceStart(getClass().getName(),84361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26jmo6f1t3d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t3d1t3dlusvngep.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t3d1t3dlusvngep.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_empty_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84361,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26jmo6f1t3d() throws Exception{try{__CLR4_5_21t3d1t3dlusvngep.R.inc(84361);
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84362);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21t3d1t3dlusvngep.R.inc(84363);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84364);mapSerializer.write(new JSONSerializer(out), Collections.EMPTY_MAP, null, null, 0);

        __CLR4_5_21t3d1t3dlusvngep.R.inc(84365);Assert.assertEquals("{}", out.toString());
    }finally{__CLR4_5_21t3d1t3dlusvngep.R.flushNeeded();}}

    public void test_singleton_1() throws Exception {__CLR4_5_21t3d1t3dlusvngep.R.globalSliceStart(getClass().getName(),84366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_280rg891t3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t3d1t3dlusvngep.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t3d1t3dlusvngep.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_singleton_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84366,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_280rg891t3i() throws Exception{try{__CLR4_5_21t3d1t3dlusvngep.R.inc(84366);
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84367);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21t3d1t3dlusvngep.R.inc(84368);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84369);mapSerializer.write(new JSONSerializer(out), Collections.singletonMap("A", 1), null, null, 0);

        __CLR4_5_21t3d1t3dlusvngep.R.inc(84370);Assert.assertEquals("{\"A\":1}", out.toString());
    }finally{__CLR4_5_21t3d1t3dlusvngep.R.flushNeeded();}}

    public void test_int2_s() throws Exception {__CLR4_5_21t3d1t3dlusvngep.R.globalSliceStart(getClass().getName(),84371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23mwigb1t3n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t3d1t3dlusvngep.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t3d1t3dlusvngep.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_int2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84371,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23mwigb1t3n() throws Exception{try{__CLR4_5_21t3d1t3dlusvngep.R.inc(84371);
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84372);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21t3d1t3dlusvngep.R.inc(84373);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84374);Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84375);map.put("A", 1);
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84376);map.put("B", 2);
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84377);mapSerializer.write(new JSONSerializer(out), map, null, null, 0);

        __CLR4_5_21t3d1t3dlusvngep.R.inc(84378);Assert.assertEquals("{\"A\":1,\"B\":2}", out.toString());
    }finally{__CLR4_5_21t3d1t3dlusvngep.R.flushNeeded();}}

    public void test_long2_s() throws Exception {__CLR4_5_21t3d1t3dlusvngep.R.globalSliceStart(getClass().getName(),84379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24u3an81t3v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t3d1t3dlusvngep.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t3d1t3dlusvngep.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_long2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84379,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24u3an81t3v() throws Exception{try{__CLR4_5_21t3d1t3dlusvngep.R.inc(84379);
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84380);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21t3d1t3dlusvngep.R.inc(84381);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84382);Map<String, Long> map = new LinkedHashMap<String, Long>();
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84383);map.put("A", 1L);
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84384);map.put("B", 2L);
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84385);mapSerializer.write(new JSONSerializer(out), map, null, null, 0);

        __CLR4_5_21t3d1t3dlusvngep.R.inc(84386);Assert.assertEquals("{\"A\":1,\"B\":2}", out.toString());
    }finally{__CLR4_5_21t3d1t3dlusvngep.R.flushNeeded();}}

    public void test_string2_s() throws Exception {__CLR4_5_21t3d1t3dlusvngep.R.globalSliceStart(getClass().getName(),84387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27rw2lt1t43();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t3d1t3dlusvngep.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t3d1t3dlusvngep.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_string2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84387,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27rw2lt1t43() throws Exception{try{__CLR4_5_21t3d1t3dlusvngep.R.inc(84387);
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84388);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21t3d1t3dlusvngep.R.inc(84389);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84390);Map<String, String> map = new LinkedHashMap<String, String>();
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84391);map.put("A", "1");
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84392);map.put("B", "2");
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84393);mapSerializer.write(new JSONSerializer(out), map, null, null, 0);

        __CLR4_5_21t3d1t3dlusvngep.R.inc(84394);Assert.assertEquals("{\"A\":\"1\",\"B\":\"2\"}", out.toString());
    }finally{__CLR4_5_21t3d1t3dlusvngep.R.flushNeeded();}}

    public void test_string3_s() throws Exception {__CLR4_5_21t3d1t3dlusvngep.R.globalSliceStart(getClass().getName(),84395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29wqrgw1t4b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t3d1t3dlusvngep.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t3d1t3dlusvngep.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_string3_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84395,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29wqrgw1t4b() throws Exception{try{__CLR4_5_21t3d1t3dlusvngep.R.inc(84395);
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84396);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21t3d1t3dlusvngep.R.inc(84397);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84398);serializer.config(SerializerFeature.UseSingleQuotes, true);

        __CLR4_5_21t3d1t3dlusvngep.R.inc(84399);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84400);Map<String, String> map = new LinkedHashMap<String, String>();
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84401);map.put("A", "1");
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84402);map.put("B", "2");
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84403);mapSerializer.write(serializer, map, null, null, 0);

        __CLR4_5_21t3d1t3dlusvngep.R.inc(84404);Assert.assertEquals("{'A':'1','B':'2'}", out.toString());
    }finally{__CLR4_5_21t3d1t3dlusvngep.R.flushNeeded();}}

    public void test_special_s() throws Exception {__CLR4_5_21t3d1t3dlusvngep.R.globalSliceStart(getClass().getName(),84405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_224j6bd1t4l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t3d1t3dlusvngep.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t3d1t3dlusvngep.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_special_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84405,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_224j6bd1t4l() throws Exception{try{__CLR4_5_21t3d1t3dlusvngep.R.inc(84405);
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84406);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21t3d1t3dlusvngep.R.inc(84407);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84408);mapSerializer.write(new JSONSerializer(out), Collections.singletonMap("A\nB", 1), null, null, 0);

        __CLR4_5_21t3d1t3dlusvngep.R.inc(84409);Assert.assertEquals("{\"A\\nB\":1}", out.toString());
    }finally{__CLR4_5_21t3d1t3dlusvngep.R.flushNeeded();}}

    public void test_special2_s() throws Exception {__CLR4_5_21t3d1t3dlusvngep.R.globalSliceStart(getClass().getName(),84410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q1h5un1t4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t3d1t3dlusvngep.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t3d1t3dlusvngep.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_special2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84410,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q1h5un1t4q() throws Exception{try{__CLR4_5_21t3d1t3dlusvngep.R.inc(84410);
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84411);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21t3d1t3dlusvngep.R.inc(84412);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84413);mapSerializer.write(new JSONSerializer(out), Collections.singletonMap("A\nB", 1), null, null, 0);

        __CLR4_5_21t3d1t3dlusvngep.R.inc(84414);Assert.assertEquals("{\"A\\nB\":1}", out.toString());
    }finally{__CLR4_5_21t3d1t3dlusvngep.R.flushNeeded();}}

    public void test_special3_s() throws Exception {__CLR4_5_21t3d1t3dlusvngep.R.globalSliceStart(getClass().getName(),84415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s6bupq1t4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t3d1t3dlusvngep.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t3d1t3dlusvngep.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_special3_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84415,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s6bupq1t4v() throws Exception{try{__CLR4_5_21t3d1t3dlusvngep.R.inc(84415);
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84416);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21t3d1t3dlusvngep.R.inc(84417);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84418);mapSerializer.write(new JSONSerializer(out), Collections.singletonMap("A\nB", Collections.EMPTY_MAP), null, null, 0);

        __CLR4_5_21t3d1t3dlusvngep.R.inc(84419);Assert.assertEquals("{\"A\\nB\":{}}", out.toString());
    }finally{__CLR4_5_21t3d1t3dlusvngep.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21t3d1t3dlusvngep.R.globalSliceStart(getClass().getName(),84420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61t50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t3d1t3dlusvngep.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t3d1t3dlusvngep.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84420,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61t50() throws Exception{try{__CLR4_5_21t3d1t3dlusvngep.R.inc(84420);
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84421);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84422);Map<String, Object> map = new LinkedHashMap<String, Object>();
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84423);map.put("TOP", "value");
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84424);map.put("bytes", new byte[] { 1, 2 });

        __CLR4_5_21t3d1t3dlusvngep.R.inc(84425);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84426);mapSerializer.write(new JSONSerializer(out), map, null, null, 0);

        __CLR4_5_21t3d1t3dlusvngep.R.inc(84427);String text = out.toString();
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84428);Assert.assertEquals("{\"TOP\":\"value\",\"bytes\":\"AQI=\"}", text);
        
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84429);JSONObject json = JSON.parseObject(text);
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84430);byte[] bytes = json.getBytes("bytes");
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84431);Assert.assertEquals(1, bytes[0]);
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84432);Assert.assertEquals(2, bytes[1]);
        __CLR4_5_21t3d1t3dlusvngep.R.inc(84433);Assert.assertEquals(2, bytes.length);
    }finally{__CLR4_5_21t3d1t3dlusvngep.R.flushNeeded();}}
}
