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

public class MapSerializerTest extends TestCase {static class __CLR4_5_21s551s55lusyjuzb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,83202,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_empty_1() throws Exception {__CLR4_5_21s551s55lusyjuzb.R.globalSliceStart(getClass().getName(),83129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26jmo6f1s55();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s551s55lusyjuzb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s551s55lusyjuzb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_empty_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83129,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26jmo6f1s55() throws Exception{try{__CLR4_5_21s551s55lusyjuzb.R.inc(83129);
        __CLR4_5_21s551s55lusyjuzb.R.inc(83130);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21s551s55lusyjuzb.R.inc(83131);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_5_21s551s55lusyjuzb.R.inc(83132);mapSerializer.write(new JSONSerializer(out), Collections.EMPTY_MAP, null, null, 0);

        __CLR4_5_21s551s55lusyjuzb.R.inc(83133);Assert.assertEquals("{}", out.toString());
    }finally{__CLR4_5_21s551s55lusyjuzb.R.flushNeeded();}}

    public void test_singleton_1() throws Exception {__CLR4_5_21s551s55lusyjuzb.R.globalSliceStart(getClass().getName(),83134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_280rg891s5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s551s55lusyjuzb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s551s55lusyjuzb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_singleton_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83134,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_280rg891s5a() throws Exception{try{__CLR4_5_21s551s55lusyjuzb.R.inc(83134);
        __CLR4_5_21s551s55lusyjuzb.R.inc(83135);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21s551s55lusyjuzb.R.inc(83136);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_5_21s551s55lusyjuzb.R.inc(83137);mapSerializer.write(new JSONSerializer(out), Collections.singletonMap("A", 1), null, null, 0);

        __CLR4_5_21s551s55lusyjuzb.R.inc(83138);Assert.assertEquals("{\"A\":1}", out.toString());
    }finally{__CLR4_5_21s551s55lusyjuzb.R.flushNeeded();}}

    public void test_int2_s() throws Exception {__CLR4_5_21s551s55lusyjuzb.R.globalSliceStart(getClass().getName(),83139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23mwigb1s5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s551s55lusyjuzb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s551s55lusyjuzb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_int2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83139,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23mwigb1s5f() throws Exception{try{__CLR4_5_21s551s55lusyjuzb.R.inc(83139);
        __CLR4_5_21s551s55lusyjuzb.R.inc(83140);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21s551s55lusyjuzb.R.inc(83141);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_5_21s551s55lusyjuzb.R.inc(83142);Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        __CLR4_5_21s551s55lusyjuzb.R.inc(83143);map.put("A", 1);
        __CLR4_5_21s551s55lusyjuzb.R.inc(83144);map.put("B", 2);
        __CLR4_5_21s551s55lusyjuzb.R.inc(83145);mapSerializer.write(new JSONSerializer(out), map, null, null, 0);

        __CLR4_5_21s551s55lusyjuzb.R.inc(83146);Assert.assertEquals("{\"A\":1,\"B\":2}", out.toString());
    }finally{__CLR4_5_21s551s55lusyjuzb.R.flushNeeded();}}

    public void test_long2_s() throws Exception {__CLR4_5_21s551s55lusyjuzb.R.globalSliceStart(getClass().getName(),83147);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24u3an81s5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s551s55lusyjuzb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s551s55lusyjuzb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_long2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83147,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24u3an81s5n() throws Exception{try{__CLR4_5_21s551s55lusyjuzb.R.inc(83147);
        __CLR4_5_21s551s55lusyjuzb.R.inc(83148);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21s551s55lusyjuzb.R.inc(83149);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_5_21s551s55lusyjuzb.R.inc(83150);Map<String, Long> map = new LinkedHashMap<String, Long>();
        __CLR4_5_21s551s55lusyjuzb.R.inc(83151);map.put("A", 1L);
        __CLR4_5_21s551s55lusyjuzb.R.inc(83152);map.put("B", 2L);
        __CLR4_5_21s551s55lusyjuzb.R.inc(83153);mapSerializer.write(new JSONSerializer(out), map, null, null, 0);

        __CLR4_5_21s551s55lusyjuzb.R.inc(83154);Assert.assertEquals("{\"A\":1,\"B\":2}", out.toString());
    }finally{__CLR4_5_21s551s55lusyjuzb.R.flushNeeded();}}

    public void test_string2_s() throws Exception {__CLR4_5_21s551s55lusyjuzb.R.globalSliceStart(getClass().getName(),83155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27rw2lt1s5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s551s55lusyjuzb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s551s55lusyjuzb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_string2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83155,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27rw2lt1s5v() throws Exception{try{__CLR4_5_21s551s55lusyjuzb.R.inc(83155);
        __CLR4_5_21s551s55lusyjuzb.R.inc(83156);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21s551s55lusyjuzb.R.inc(83157);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_5_21s551s55lusyjuzb.R.inc(83158);Map<String, String> map = new LinkedHashMap<String, String>();
        __CLR4_5_21s551s55lusyjuzb.R.inc(83159);map.put("A", "1");
        __CLR4_5_21s551s55lusyjuzb.R.inc(83160);map.put("B", "2");
        __CLR4_5_21s551s55lusyjuzb.R.inc(83161);mapSerializer.write(new JSONSerializer(out), map, null, null, 0);

        __CLR4_5_21s551s55lusyjuzb.R.inc(83162);Assert.assertEquals("{\"A\":\"1\",\"B\":\"2\"}", out.toString());
    }finally{__CLR4_5_21s551s55lusyjuzb.R.flushNeeded();}}

    public void test_string3_s() throws Exception {__CLR4_5_21s551s55lusyjuzb.R.globalSliceStart(getClass().getName(),83163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29wqrgw1s63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s551s55lusyjuzb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s551s55lusyjuzb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_string3_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83163,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29wqrgw1s63() throws Exception{try{__CLR4_5_21s551s55lusyjuzb.R.inc(83163);
        __CLR4_5_21s551s55lusyjuzb.R.inc(83164);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21s551s55lusyjuzb.R.inc(83165);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21s551s55lusyjuzb.R.inc(83166);serializer.config(SerializerFeature.UseSingleQuotes, true);

        __CLR4_5_21s551s55lusyjuzb.R.inc(83167);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_5_21s551s55lusyjuzb.R.inc(83168);Map<String, String> map = new LinkedHashMap<String, String>();
        __CLR4_5_21s551s55lusyjuzb.R.inc(83169);map.put("A", "1");
        __CLR4_5_21s551s55lusyjuzb.R.inc(83170);map.put("B", "2");
        __CLR4_5_21s551s55lusyjuzb.R.inc(83171);mapSerializer.write(serializer, map, null, null, 0);

        __CLR4_5_21s551s55lusyjuzb.R.inc(83172);Assert.assertEquals("{'A':'1','B':'2'}", out.toString());
    }finally{__CLR4_5_21s551s55lusyjuzb.R.flushNeeded();}}

    public void test_special_s() throws Exception {__CLR4_5_21s551s55lusyjuzb.R.globalSliceStart(getClass().getName(),83173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_224j6bd1s6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s551s55lusyjuzb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s551s55lusyjuzb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_special_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83173,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_224j6bd1s6d() throws Exception{try{__CLR4_5_21s551s55lusyjuzb.R.inc(83173);
        __CLR4_5_21s551s55lusyjuzb.R.inc(83174);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21s551s55lusyjuzb.R.inc(83175);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_5_21s551s55lusyjuzb.R.inc(83176);mapSerializer.write(new JSONSerializer(out), Collections.singletonMap("A\nB", 1), null, null, 0);

        __CLR4_5_21s551s55lusyjuzb.R.inc(83177);Assert.assertEquals("{\"A\\nB\":1}", out.toString());
    }finally{__CLR4_5_21s551s55lusyjuzb.R.flushNeeded();}}

    public void test_special2_s() throws Exception {__CLR4_5_21s551s55lusyjuzb.R.globalSliceStart(getClass().getName(),83178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q1h5un1s6i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s551s55lusyjuzb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s551s55lusyjuzb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_special2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83178,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q1h5un1s6i() throws Exception{try{__CLR4_5_21s551s55lusyjuzb.R.inc(83178);
        __CLR4_5_21s551s55lusyjuzb.R.inc(83179);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21s551s55lusyjuzb.R.inc(83180);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_5_21s551s55lusyjuzb.R.inc(83181);mapSerializer.write(new JSONSerializer(out), Collections.singletonMap("A\nB", 1), null, null, 0);

        __CLR4_5_21s551s55lusyjuzb.R.inc(83182);Assert.assertEquals("{\"A\\nB\":1}", out.toString());
    }finally{__CLR4_5_21s551s55lusyjuzb.R.flushNeeded();}}

    public void test_special3_s() throws Exception {__CLR4_5_21s551s55lusyjuzb.R.globalSliceStart(getClass().getName(),83183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s6bupq1s6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s551s55lusyjuzb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s551s55lusyjuzb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_special3_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83183,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s6bupq1s6n() throws Exception{try{__CLR4_5_21s551s55lusyjuzb.R.inc(83183);
        __CLR4_5_21s551s55lusyjuzb.R.inc(83184);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21s551s55lusyjuzb.R.inc(83185);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_5_21s551s55lusyjuzb.R.inc(83186);mapSerializer.write(new JSONSerializer(out), Collections.singletonMap("A\nB", Collections.EMPTY_MAP), null, null, 0);

        __CLR4_5_21s551s55lusyjuzb.R.inc(83187);Assert.assertEquals("{\"A\\nB\":{}}", out.toString());
    }finally{__CLR4_5_21s551s55lusyjuzb.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21s551s55lusyjuzb.R.globalSliceStart(getClass().getName(),83188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61s6s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s551s55lusyjuzb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s551s55lusyjuzb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83188,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61s6s() throws Exception{try{__CLR4_5_21s551s55lusyjuzb.R.inc(83188);
        __CLR4_5_21s551s55lusyjuzb.R.inc(83189);SerializeWriter out = new SerializeWriter();
        __CLR4_5_21s551s55lusyjuzb.R.inc(83190);Map<String, Object> map = new LinkedHashMap<String, Object>();
        __CLR4_5_21s551s55lusyjuzb.R.inc(83191);map.put("TOP", "value");
        __CLR4_5_21s551s55lusyjuzb.R.inc(83192);map.put("bytes", new byte[] { 1, 2 });

        __CLR4_5_21s551s55lusyjuzb.R.inc(83193);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_5_21s551s55lusyjuzb.R.inc(83194);mapSerializer.write(new JSONSerializer(out), map, null, null, 0);

        __CLR4_5_21s551s55lusyjuzb.R.inc(83195);String text = out.toString();
        __CLR4_5_21s551s55lusyjuzb.R.inc(83196);Assert.assertEquals("{\"TOP\":\"value\",\"bytes\":\"AQI=\"}", text);
        
        __CLR4_5_21s551s55lusyjuzb.R.inc(83197);JSONObject json = JSON.parseObject(text);
        __CLR4_5_21s551s55lusyjuzb.R.inc(83198);byte[] bytes = json.getBytes("bytes");
        __CLR4_5_21s551s55lusyjuzb.R.inc(83199);Assert.assertEquals(1, bytes[0]);
        __CLR4_5_21s551s55lusyjuzb.R.inc(83200);Assert.assertEquals(2, bytes[1]);
        __CLR4_5_21s551s55lusyjuzb.R.inc(83201);Assert.assertEquals(2, bytes.length);
    }finally{__CLR4_5_21s551s55lusyjuzb.R.flushNeeded();}}
}
