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

public class MapSerializerTest extends TestCase {static class __CLR4_1_101s5g1s5glusqkjvi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,83213,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_empty_1() throws Exception {__CLR4_1_101s5g1s5glusqkjvi.R.globalSliceStart(getClass().getName(),83140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106jmo6f1s5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s5g1s5glusqkjvi.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s5g1s5glusqkjvi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_empty_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83140,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106jmo6f1s5g() throws Exception{try{__CLR4_1_101s5g1s5glusqkjvi.R.inc(83140);
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83141);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83142);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83143);mapSerializer.write(new JSONSerializer(out), Collections.EMPTY_MAP, null, null, 0);

        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83144);Assert.assertEquals("{}", out.toString());
    }finally{__CLR4_1_101s5g1s5glusqkjvi.R.flushNeeded();}}

    public void test_singleton_1() throws Exception {__CLR4_1_101s5g1s5glusqkjvi.R.globalSliceStart(getClass().getName(),83145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1080rg891s5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s5g1s5glusqkjvi.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s5g1s5glusqkjvi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_singleton_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83145,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1080rg891s5l() throws Exception{try{__CLR4_1_101s5g1s5glusqkjvi.R.inc(83145);
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83146);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83147);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83148);mapSerializer.write(new JSONSerializer(out), Collections.singletonMap("A", 1), null, null, 0);

        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83149);Assert.assertEquals("{\"A\":1}", out.toString());
    }finally{__CLR4_1_101s5g1s5glusqkjvi.R.flushNeeded();}}

    public void test_int2_s() throws Exception {__CLR4_1_101s5g1s5glusqkjvi.R.globalSliceStart(getClass().getName(),83150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103mwigb1s5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s5g1s5glusqkjvi.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s5g1s5glusqkjvi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_int2_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83150,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103mwigb1s5q() throws Exception{try{__CLR4_1_101s5g1s5glusqkjvi.R.inc(83150);
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83151);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83152);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83153);Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83154);map.put("A", 1);
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83155);map.put("B", 2);
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83156);mapSerializer.write(new JSONSerializer(out), map, null, null, 0);

        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83157);Assert.assertEquals("{\"A\":1,\"B\":2}", out.toString());
    }finally{__CLR4_1_101s5g1s5glusqkjvi.R.flushNeeded();}}

    public void test_long2_s() throws Exception {__CLR4_1_101s5g1s5glusqkjvi.R.globalSliceStart(getClass().getName(),83158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104u3an81s5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s5g1s5glusqkjvi.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s5g1s5glusqkjvi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_long2_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83158,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104u3an81s5y() throws Exception{try{__CLR4_1_101s5g1s5glusqkjvi.R.inc(83158);
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83159);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83160);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83161);Map<String, Long> map = new LinkedHashMap<String, Long>();
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83162);map.put("A", 1L);
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83163);map.put("B", 2L);
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83164);mapSerializer.write(new JSONSerializer(out), map, null, null, 0);

        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83165);Assert.assertEquals("{\"A\":1,\"B\":2}", out.toString());
    }finally{__CLR4_1_101s5g1s5glusqkjvi.R.flushNeeded();}}

    public void test_string2_s() throws Exception {__CLR4_1_101s5g1s5glusqkjvi.R.globalSliceStart(getClass().getName(),83166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107rw2lt1s66();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s5g1s5glusqkjvi.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s5g1s5glusqkjvi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_string2_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83166,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107rw2lt1s66() throws Exception{try{__CLR4_1_101s5g1s5glusqkjvi.R.inc(83166);
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83167);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83168);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83169);Map<String, String> map = new LinkedHashMap<String, String>();
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83170);map.put("A", "1");
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83171);map.put("B", "2");
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83172);mapSerializer.write(new JSONSerializer(out), map, null, null, 0);

        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83173);Assert.assertEquals("{\"A\":\"1\",\"B\":\"2\"}", out.toString());
    }finally{__CLR4_1_101s5g1s5glusqkjvi.R.flushNeeded();}}

    public void test_string3_s() throws Exception {__CLR4_1_101s5g1s5glusqkjvi.R.globalSliceStart(getClass().getName(),83174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109wqrgw1s6e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s5g1s5glusqkjvi.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s5g1s5glusqkjvi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_string3_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83174,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109wqrgw1s6e() throws Exception{try{__CLR4_1_101s5g1s5glusqkjvi.R.inc(83174);
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83175);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83176);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83177);serializer.config(SerializerFeature.UseSingleQuotes, true);

        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83178);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83179);Map<String, String> map = new LinkedHashMap<String, String>();
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83180);map.put("A", "1");
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83181);map.put("B", "2");
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83182);mapSerializer.write(serializer, map, null, null, 0);

        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83183);Assert.assertEquals("{'A':'1','B':'2'}", out.toString());
    }finally{__CLR4_1_101s5g1s5glusqkjvi.R.flushNeeded();}}

    public void test_special_s() throws Exception {__CLR4_1_101s5g1s5glusqkjvi.R.globalSliceStart(getClass().getName(),83184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1024j6bd1s6o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s5g1s5glusqkjvi.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s5g1s5glusqkjvi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_special_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83184,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1024j6bd1s6o() throws Exception{try{__CLR4_1_101s5g1s5glusqkjvi.R.inc(83184);
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83185);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83186);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83187);mapSerializer.write(new JSONSerializer(out), Collections.singletonMap("A\nB", 1), null, null, 0);

        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83188);Assert.assertEquals("{\"A\\nB\":1}", out.toString());
    }finally{__CLR4_1_101s5g1s5glusqkjvi.R.flushNeeded();}}

    public void test_special2_s() throws Exception {__CLR4_1_101s5g1s5glusqkjvi.R.globalSliceStart(getClass().getName(),83189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10q1h5un1s6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s5g1s5glusqkjvi.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s5g1s5glusqkjvi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_special2_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83189,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10q1h5un1s6t() throws Exception{try{__CLR4_1_101s5g1s5glusqkjvi.R.inc(83189);
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83190);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83191);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83192);mapSerializer.write(new JSONSerializer(out), Collections.singletonMap("A\nB", 1), null, null, 0);

        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83193);Assert.assertEquals("{\"A\\nB\":1}", out.toString());
    }finally{__CLR4_1_101s5g1s5glusqkjvi.R.flushNeeded();}}

    public void test_special3_s() throws Exception {__CLR4_1_101s5g1s5glusqkjvi.R.globalSliceStart(getClass().getName(),83194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s6bupq1s6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s5g1s5glusqkjvi.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s5g1s5glusqkjvi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_special3_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83194,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s6bupq1s6y() throws Exception{try{__CLR4_1_101s5g1s5glusqkjvi.R.inc(83194);
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83195);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83196);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83197);mapSerializer.write(new JSONSerializer(out), Collections.singletonMap("A\nB", Collections.EMPTY_MAP), null, null, 0);

        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83198);Assert.assertEquals("{\"A\\nB\":{}}", out.toString());
    }finally{__CLR4_1_101s5g1s5glusqkjvi.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101s5g1s5glusqkjvi.R.globalSliceStart(getClass().getName(),83199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61s73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s5g1s5glusqkjvi.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s5g1s5glusqkjvi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.MapSerializerTest.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83199,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61s73() throws Exception{try{__CLR4_1_101s5g1s5glusqkjvi.R.inc(83199);
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83200);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83201);Map<String, Object> map = new LinkedHashMap<String, Object>();
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83202);map.put("TOP", "value");
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83203);map.put("bytes", new byte[] { 1, 2 });

        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83204);MapSerializer mapSerializer = new MapSerializer();
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83205);mapSerializer.write(new JSONSerializer(out), map, null, null, 0);

        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83206);String text = out.toString();
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83207);Assert.assertEquals("{\"TOP\":\"value\",\"bytes\":\"AQI=\"}", text);
        
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83208);JSONObject json = JSON.parseObject(text);
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83209);byte[] bytes = json.getBytes("bytes");
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83210);Assert.assertEquals(1, bytes[0]);
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83211);Assert.assertEquals(2, bytes[1]);
        __CLR4_1_101s5g1s5glusqkjvi.R.inc(83212);Assert.assertEquals(2, bytes.length);
    }finally{__CLR4_1_101s5g1s5glusqkjvi.R.flushNeeded();}}
}
