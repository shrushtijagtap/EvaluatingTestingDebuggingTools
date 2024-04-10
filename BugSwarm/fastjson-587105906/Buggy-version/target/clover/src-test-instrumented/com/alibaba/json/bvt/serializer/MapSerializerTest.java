/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

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

public class MapSerializerTest extends TestCase {static class __CLR4_1_101t3o1t3oluszwf2r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,84445,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_empty_1() throws Exception {__CLR4_1_101t3o1t3oluszwf2r.R.globalSliceStart(getClass().getName(),84372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106jmo6f1t3o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t3o1t3oluszwf2r.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t3o1t3oluszwf2r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_empty_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84372,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106jmo6f1t3o() throws Exception{try{__CLR4_1_101t3o1t3oluszwf2r.R.inc(84372);
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84373);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84374);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84375);mapSerializer.write(new JSONSerializer(out), Collections.EMPTY_MAP, null, null, 0);

        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84376);Assert.assertEquals("{}", out.toString());
    }finally{__CLR4_1_101t3o1t3oluszwf2r.R.flushNeeded();}}

    public void test_singleton_1() throws Exception {__CLR4_1_101t3o1t3oluszwf2r.R.globalSliceStart(getClass().getName(),84377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1080rg891t3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t3o1t3oluszwf2r.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t3o1t3oluszwf2r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_singleton_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84377,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1080rg891t3t() throws Exception{try{__CLR4_1_101t3o1t3oluszwf2r.R.inc(84377);
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84378);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84379);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84380);mapSerializer.write(new JSONSerializer(out), Collections.singletonMap("A", 1), null, null, 0);

        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84381);Assert.assertEquals("{\"A\":1}", out.toString());
    }finally{__CLR4_1_101t3o1t3oluszwf2r.R.flushNeeded();}}

    public void test_int2_s() throws Exception {__CLR4_1_101t3o1t3oluszwf2r.R.globalSliceStart(getClass().getName(),84382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103mwigb1t3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t3o1t3oluszwf2r.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t3o1t3oluszwf2r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_int2_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84382,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103mwigb1t3y() throws Exception{try{__CLR4_1_101t3o1t3oluszwf2r.R.inc(84382);
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84383);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84384);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84385);Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84386);map.put("A", 1);
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84387);map.put("B", 2);
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84388);mapSerializer.write(new JSONSerializer(out), map, null, null, 0);

        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84389);Assert.assertEquals("{\"A\":1,\"B\":2}", out.toString());
    }finally{__CLR4_1_101t3o1t3oluszwf2r.R.flushNeeded();}}

    public void test_long2_s() throws Exception {__CLR4_1_101t3o1t3oluszwf2r.R.globalSliceStart(getClass().getName(),84390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104u3an81t46();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t3o1t3oluszwf2r.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t3o1t3oluszwf2r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_long2_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84390,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104u3an81t46() throws Exception{try{__CLR4_1_101t3o1t3oluszwf2r.R.inc(84390);
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84391);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84392);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84393);Map<String, Long> map = new LinkedHashMap<String, Long>();
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84394);map.put("A", 1L);
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84395);map.put("B", 2L);
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84396);mapSerializer.write(new JSONSerializer(out), map, null, null, 0);

        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84397);Assert.assertEquals("{\"A\":1,\"B\":2}", out.toString());
    }finally{__CLR4_1_101t3o1t3oluszwf2r.R.flushNeeded();}}

    public void test_string2_s() throws Exception {__CLR4_1_101t3o1t3oluszwf2r.R.globalSliceStart(getClass().getName(),84398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107rw2lt1t4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t3o1t3oluszwf2r.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t3o1t3oluszwf2r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_string2_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84398,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107rw2lt1t4e() throws Exception{try{__CLR4_1_101t3o1t3oluszwf2r.R.inc(84398);
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84399);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84400);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84401);Map<String, String> map = new LinkedHashMap<String, String>();
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84402);map.put("A", "1");
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84403);map.put("B", "2");
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84404);mapSerializer.write(new JSONSerializer(out), map, null, null, 0);

        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84405);Assert.assertEquals("{\"A\":\"1\",\"B\":\"2\"}", out.toString());
    }finally{__CLR4_1_101t3o1t3oluszwf2r.R.flushNeeded();}}

    public void test_string3_s() throws Exception {__CLR4_1_101t3o1t3oluszwf2r.R.globalSliceStart(getClass().getName(),84406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109wqrgw1t4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t3o1t3oluszwf2r.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t3o1t3oluszwf2r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_string3_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84406,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109wqrgw1t4m() throws Exception{try{__CLR4_1_101t3o1t3oluszwf2r.R.inc(84406);
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84407);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84408);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84409);serializer.config(SerializerFeature.UseSingleQuotes, true);

        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84410);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84411);Map<String, String> map = new LinkedHashMap<String, String>();
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84412);map.put("A", "1");
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84413);map.put("B", "2");
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84414);mapSerializer.write(serializer, map, null, null, 0);

        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84415);Assert.assertEquals("{'A':'1','B':'2'}", out.toString());
    }finally{__CLR4_1_101t3o1t3oluszwf2r.R.flushNeeded();}}

    public void test_special_s() throws Exception {__CLR4_1_101t3o1t3oluszwf2r.R.globalSliceStart(getClass().getName(),84416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1024j6bd1t4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t3o1t3oluszwf2r.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t3o1t3oluszwf2r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_special_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84416,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1024j6bd1t4w() throws Exception{try{__CLR4_1_101t3o1t3oluszwf2r.R.inc(84416);
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84417);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84418);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84419);mapSerializer.write(new JSONSerializer(out), Collections.singletonMap("A\nB", 1), null, null, 0);

        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84420);Assert.assertEquals("{\"A\\nB\":1}", out.toString());
    }finally{__CLR4_1_101t3o1t3oluszwf2r.R.flushNeeded();}}

    public void test_special2_s() throws Exception {__CLR4_1_101t3o1t3oluszwf2r.R.globalSliceStart(getClass().getName(),84421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10q1h5un1t51();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t3o1t3oluszwf2r.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t3o1t3oluszwf2r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_special2_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84421,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10q1h5un1t51() throws Exception{try{__CLR4_1_101t3o1t3oluszwf2r.R.inc(84421);
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84422);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84423);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84424);mapSerializer.write(new JSONSerializer(out), Collections.singletonMap("A\nB", 1), null, null, 0);

        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84425);Assert.assertEquals("{\"A\\nB\":1}", out.toString());
    }finally{__CLR4_1_101t3o1t3oluszwf2r.R.flushNeeded();}}

    public void test_special3_s() throws Exception {__CLR4_1_101t3o1t3oluszwf2r.R.globalSliceStart(getClass().getName(),84426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s6bupq1t56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t3o1t3oluszwf2r.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t3o1t3oluszwf2r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_special3_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84426,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s6bupq1t56() throws Exception{try{__CLR4_1_101t3o1t3oluszwf2r.R.inc(84426);
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84427);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84428);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84429);mapSerializer.write(new JSONSerializer(out), Collections.singletonMap("A\nB", Collections.EMPTY_MAP), null, null, 0);

        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84430);Assert.assertEquals("{\"A\\nB\":{}}", out.toString());
    }finally{__CLR4_1_101t3o1t3oluszwf2r.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101t3o1t3oluszwf2r.R.globalSliceStart(getClass().getName(),84431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61t5b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t3o1t3oluszwf2r.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t3o1t3oluszwf2r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84431,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61t5b() throws Exception{try{__CLR4_1_101t3o1t3oluszwf2r.R.inc(84431);
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84432);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84433);Map<String, Object> map = new LinkedHashMap<String, Object>();
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84434);map.put("TOP", "value");
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84435);map.put("bytes", new byte[] { 1, 2 });

        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84436);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84437);mapSerializer.write(new JSONSerializer(out), map, null, null, 0);

        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84438);String text = out.toString();
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84439);Assert.assertEquals("{\"TOP\":\"value\",\"bytes\":\"AQI=\"}", text);
        
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84440);JSONObject json = JSON.parseObject(text);
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84441);byte[] bytes = json.getBytes("bytes");
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84442);Assert.assertEquals(1, bytes[0]);
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84443);Assert.assertEquals(2, bytes[1]);
        __CLR4_1_101t3o1t3oluszwf2r.R.inc(84444);Assert.assertEquals(2, bytes.length);
    }finally{__CLR4_1_101t3o1t3oluszwf2r.R.flushNeeded();}}
}
