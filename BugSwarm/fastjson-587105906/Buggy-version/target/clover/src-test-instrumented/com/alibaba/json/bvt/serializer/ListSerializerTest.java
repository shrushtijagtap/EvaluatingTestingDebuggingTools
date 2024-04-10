/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ListSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSerializerTest extends TestCase {static class __CLR4_1_101t0a1t0aluszwf24{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,84317,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0_s() throws Exception {__CLR4_1_101t0a1t0aluszwf24.R.globalSliceStart(getClass().getName(),84250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10skazm1t0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t0a1t0aluszwf24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t0a1t0aluszwf24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_0_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84250,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10skazm1t0a() throws Exception{try{__CLR4_1_101t0a1t0aluszwf24.R.inc(84250);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84251);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101t0a1t0aluszwf24.R.inc(84252);ListSerializer listSerializer = new ListSerializer();
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84253);listSerializer.write(new JSONSerializer(out), Collections.EMPTY_LIST, null, null, 0);

        __CLR4_1_101t0a1t0aluszwf24.R.inc(84254);Assert.assertEquals("[]", out.toString());
    }finally{__CLR4_1_101t0a1t0aluszwf24.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_1_101t0a1t0aluszwf24.R.globalSliceStart(getClass().getName(),84255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10529ops1t0f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t0a1t0aluszwf24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t0a1t0aluszwf24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_2_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84255,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10529ops1t0f() throws Exception{try{__CLR4_1_101t0a1t0aluszwf24.R.inc(84255);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84256);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101t0a1t0aluszwf24.R.inc(84257);ListSerializer listSerializer = new ListSerializer();
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84258);List<Object> list = new ArrayList<Object>();
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84259);list.add(1);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84260);list.add(2);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84261);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_1_101t0a1t0aluszwf24.R.inc(84262);Assert.assertEquals("[1,2]", out.toString());
    }finally{__CLR4_1_101t0a1t0aluszwf24.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_1_101t0a1t0aluszwf24.R.globalSliceStart(getClass().getName(),84263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10774dkv1t0n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t0a1t0aluszwf24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t0a1t0aluszwf24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_3_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84263,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10774dkv1t0n() throws Exception{try{__CLR4_1_101t0a1t0aluszwf24.R.inc(84263);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84264);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101t0a1t0aluszwf24.R.inc(84265);ListSerializer listSerializer = new ListSerializer();
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84266);List<Object> list = new ArrayList<Object>();
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84267);list.add(1);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84268);list.add(2);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84269);list.add(3);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84270);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_1_101t0a1t0aluszwf24.R.inc(84271);Assert.assertEquals("[1,2,3]", out.toString());
    }finally{__CLR4_1_101t0a1t0aluszwf24.R.flushNeeded();}}

    public void test_4_s() throws Exception {__CLR4_1_101t0a1t0aluszwf24.R.globalSliceStart(getClass().getName(),84272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109bz2fy1t0w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t0a1t0aluszwf24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t0a1t0aluszwf24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_4_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84272,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109bz2fy1t0w() throws Exception{try{__CLR4_1_101t0a1t0aluszwf24.R.inc(84272);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84273);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101t0a1t0aluszwf24.R.inc(84274);ListSerializer listSerializer = new ListSerializer();
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84275);List<Object> list = new ArrayList<Object>();
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84276);list.add(1L);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84277);list.add(2L);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84278);list.add(3L);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84279);list.add(Collections.emptyMap());
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84280);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_1_101t0a1t0aluszwf24.R.inc(84281);Assert.assertEquals("[1,2,3,{}]", out.toString());
    }finally{__CLR4_1_101t0a1t0aluszwf24.R.flushNeeded();}}

    public void test_5_s() throws Exception {__CLR4_1_101t0a1t0aluszwf24.R.globalSliceStart(getClass().getName(),84282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bgtrb11t16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t0a1t0aluszwf24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t0a1t0aluszwf24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_5_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84282,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bgtrb11t16() throws Exception{try{__CLR4_1_101t0a1t0aluszwf24.R.inc(84282);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84283);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101t0a1t0aluszwf24.R.inc(84284);ListSerializer listSerializer = new ListSerializer();
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84285);List<Object> list = new ArrayList<Object>();
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84286);list.add(1L);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84287);list.add(21474836480L);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84288);list.add(null);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84289);list.add(Collections.emptyMap());
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84290);list.add(21474836480L);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84291);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_1_101t0a1t0aluszwf24.R.inc(84292);Assert.assertEquals("[1,21474836480,null,{},21474836480]", out.toString());
    }finally{__CLR4_1_101t0a1t0aluszwf24.R.flushNeeded();}}

    public void test_6_s() throws Exception {__CLR4_1_101t0a1t0aluszwf24.R.globalSliceStart(getClass().getName(),84293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dlog641t1h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t0a1t0aluszwf24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t0a1t0aluszwf24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_6_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84293,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dlog641t1h() throws Exception{try{__CLR4_1_101t0a1t0aluszwf24.R.inc(84293);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84294);SerializeWriter out = new SerializeWriter(SerializerFeature.BrowserCompatible);

        __CLR4_1_101t0a1t0aluszwf24.R.inc(84295);ListSerializer listSerializer = new ListSerializer();
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84296);List<Object> list = new ArrayList<Object>();
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84297);list.add(1L);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84298);list.add(1453964515792017682L);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84299);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_1_101t0a1t0aluszwf24.R.inc(84300);Assert.assertEquals("[1,\"1453964515792017682\"]", out.toString());
    }finally{__CLR4_1_101t0a1t0aluszwf24.R.flushNeeded();}}

    public void test_7_s() throws Exception {__CLR4_1_101t0a1t0aluszwf24.R.globalSliceStart(getClass().getName(),84301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fqj5171t1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t0a1t0aluszwf24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t0a1t0aluszwf24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_7_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84301,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fqj5171t1p() throws Exception{try{__CLR4_1_101t0a1t0aluszwf24.R.inc(84301);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84302);SerializeWriter out = new SerializeWriter(
                SerializerFeature.BrowserCompatible, SerializerFeature.WriteClassName
        );

        __CLR4_1_101t0a1t0aluszwf24.R.inc(84303);ListSerializer listSerializer = new ListSerializer();
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84304);List<Object> list = new ArrayList<Object>();
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84305);list.add(1L);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84306);list.add(1453964515792017682L);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84307);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_1_101t0a1t0aluszwf24.R.inc(84308);Assert.assertEquals("[1L,1453964515792017682L]", out.toString());
    }finally{__CLR4_1_101t0a1t0aluszwf24.R.flushNeeded();}}

    public void test_8_s() throws Exception {__CLR4_1_101t0a1t0aluszwf24.R.globalSliceStart(getClass().getName(),84309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hvdtwa1t1x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t0a1t0aluszwf24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t0a1t0aluszwf24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_8_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84309,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hvdtwa1t1x() throws Exception{try{__CLR4_1_101t0a1t0aluszwf24.R.inc(84309);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84310);SerializeWriter out = new SerializeWriter(SerializerFeature.WriteClassName);

        __CLR4_1_101t0a1t0aluszwf24.R.inc(84311);ListSerializer listSerializer = new ListSerializer();
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84312);List<Object> list = new ArrayList<Object>();
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84313);list.add(1L);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84314);list.add(1453964515792017682L);
        __CLR4_1_101t0a1t0aluszwf24.R.inc(84315);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_1_101t0a1t0aluszwf24.R.inc(84316);Assert.assertEquals("[1L,1453964515792017682L]", out.toString());
    }finally{__CLR4_1_101t0a1t0aluszwf24.R.flushNeeded();}}
}
