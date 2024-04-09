/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ListSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSerializerTest extends TestCase {static class __CLR4_5_21szz1szzlusvngdp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,84306,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0_s() throws Exception {__CLR4_5_21szz1szzlusvngdp.R.globalSliceStart(getClass().getName(),84239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2skazm1szz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21szz1szzlusvngdp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21szz1szzlusvngdp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_0_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84239,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2skazm1szz() throws Exception{try{__CLR4_5_21szz1szzlusvngdp.R.inc(84239);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84240);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21szz1szzlusvngdp.R.inc(84241);ListSerializer listSerializer = new ListSerializer();
        __CLR4_5_21szz1szzlusvngdp.R.inc(84242);listSerializer.write(new JSONSerializer(out), Collections.EMPTY_LIST, null, null, 0);

        __CLR4_5_21szz1szzlusvngdp.R.inc(84243);Assert.assertEquals("[]", out.toString());
    }finally{__CLR4_5_21szz1szzlusvngdp.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_5_21szz1szzlusvngdp.R.globalSliceStart(getClass().getName(),84244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2529ops1t04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21szz1szzlusvngdp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21szz1szzlusvngdp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84244,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2529ops1t04() throws Exception{try{__CLR4_5_21szz1szzlusvngdp.R.inc(84244);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84245);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21szz1szzlusvngdp.R.inc(84246);ListSerializer listSerializer = new ListSerializer();
        __CLR4_5_21szz1szzlusvngdp.R.inc(84247);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21szz1szzlusvngdp.R.inc(84248);list.add(1);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84249);list.add(2);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84250);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_5_21szz1szzlusvngdp.R.inc(84251);Assert.assertEquals("[1,2]", out.toString());
    }finally{__CLR4_5_21szz1szzlusvngdp.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_5_21szz1szzlusvngdp.R.globalSliceStart(getClass().getName(),84252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2774dkv1t0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21szz1szzlusvngdp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21szz1szzlusvngdp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_3_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84252,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2774dkv1t0c() throws Exception{try{__CLR4_5_21szz1szzlusvngdp.R.inc(84252);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84253);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21szz1szzlusvngdp.R.inc(84254);ListSerializer listSerializer = new ListSerializer();
        __CLR4_5_21szz1szzlusvngdp.R.inc(84255);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21szz1szzlusvngdp.R.inc(84256);list.add(1);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84257);list.add(2);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84258);list.add(3);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84259);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_5_21szz1szzlusvngdp.R.inc(84260);Assert.assertEquals("[1,2,3]", out.toString());
    }finally{__CLR4_5_21szz1szzlusvngdp.R.flushNeeded();}}

    public void test_4_s() throws Exception {__CLR4_5_21szz1szzlusvngdp.R.globalSliceStart(getClass().getName(),84261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29bz2fy1t0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21szz1szzlusvngdp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21szz1szzlusvngdp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_4_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84261,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29bz2fy1t0l() throws Exception{try{__CLR4_5_21szz1szzlusvngdp.R.inc(84261);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84262);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21szz1szzlusvngdp.R.inc(84263);ListSerializer listSerializer = new ListSerializer();
        __CLR4_5_21szz1szzlusvngdp.R.inc(84264);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21szz1szzlusvngdp.R.inc(84265);list.add(1L);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84266);list.add(2L);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84267);list.add(3L);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84268);list.add(Collections.emptyMap());
        __CLR4_5_21szz1szzlusvngdp.R.inc(84269);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_5_21szz1szzlusvngdp.R.inc(84270);Assert.assertEquals("[1,2,3,{}]", out.toString());
    }finally{__CLR4_5_21szz1szzlusvngdp.R.flushNeeded();}}

    public void test_5_s() throws Exception {__CLR4_5_21szz1szzlusvngdp.R.globalSliceStart(getClass().getName(),84271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bgtrb11t0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21szz1szzlusvngdp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21szz1szzlusvngdp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_5_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84271,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bgtrb11t0v() throws Exception{try{__CLR4_5_21szz1szzlusvngdp.R.inc(84271);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84272);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21szz1szzlusvngdp.R.inc(84273);ListSerializer listSerializer = new ListSerializer();
        __CLR4_5_21szz1szzlusvngdp.R.inc(84274);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21szz1szzlusvngdp.R.inc(84275);list.add(1L);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84276);list.add(21474836480L);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84277);list.add(null);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84278);list.add(Collections.emptyMap());
        __CLR4_5_21szz1szzlusvngdp.R.inc(84279);list.add(21474836480L);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84280);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_5_21szz1szzlusvngdp.R.inc(84281);Assert.assertEquals("[1,21474836480,null,{},21474836480]", out.toString());
    }finally{__CLR4_5_21szz1szzlusvngdp.R.flushNeeded();}}

    public void test_6_s() throws Exception {__CLR4_5_21szz1szzlusvngdp.R.globalSliceStart(getClass().getName(),84282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dlog641t16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21szz1szzlusvngdp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21szz1szzlusvngdp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_6_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84282,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dlog641t16() throws Exception{try{__CLR4_5_21szz1szzlusvngdp.R.inc(84282);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84283);SerializeWriter out = new SerializeWriter(SerializerFeature.BrowserCompatible);

        __CLR4_5_21szz1szzlusvngdp.R.inc(84284);ListSerializer listSerializer = new ListSerializer();
        __CLR4_5_21szz1szzlusvngdp.R.inc(84285);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21szz1szzlusvngdp.R.inc(84286);list.add(1L);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84287);list.add(1453964515792017682L);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84288);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_5_21szz1szzlusvngdp.R.inc(84289);Assert.assertEquals("[1,\"1453964515792017682\"]", out.toString());
    }finally{__CLR4_5_21szz1szzlusvngdp.R.flushNeeded();}}

    public void test_7_s() throws Exception {__CLR4_5_21szz1szzlusvngdp.R.globalSliceStart(getClass().getName(),84290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fqj5171t1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21szz1szzlusvngdp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21szz1szzlusvngdp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_7_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84290,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fqj5171t1e() throws Exception{try{__CLR4_5_21szz1szzlusvngdp.R.inc(84290);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84291);SerializeWriter out = new SerializeWriter(
                SerializerFeature.BrowserCompatible, SerializerFeature.WriteClassName
        );

        __CLR4_5_21szz1szzlusvngdp.R.inc(84292);ListSerializer listSerializer = new ListSerializer();
        __CLR4_5_21szz1szzlusvngdp.R.inc(84293);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21szz1szzlusvngdp.R.inc(84294);list.add(1L);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84295);list.add(1453964515792017682L);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84296);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_5_21szz1szzlusvngdp.R.inc(84297);Assert.assertEquals("[1L,1453964515792017682L]", out.toString());
    }finally{__CLR4_5_21szz1szzlusvngdp.R.flushNeeded();}}

    public void test_8_s() throws Exception {__CLR4_5_21szz1szzlusvngdp.R.globalSliceStart(getClass().getName(),84298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hvdtwa1t1m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21szz1szzlusvngdp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21szz1szzlusvngdp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_8_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84298,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hvdtwa1t1m() throws Exception{try{__CLR4_5_21szz1szzlusvngdp.R.inc(84298);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84299);SerializeWriter out = new SerializeWriter(SerializerFeature.WriteClassName);

        __CLR4_5_21szz1szzlusvngdp.R.inc(84300);ListSerializer listSerializer = new ListSerializer();
        __CLR4_5_21szz1szzlusvngdp.R.inc(84301);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21szz1szzlusvngdp.R.inc(84302);list.add(1L);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84303);list.add(1453964515792017682L);
        __CLR4_5_21szz1szzlusvngdp.R.inc(84304);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_5_21szz1szzlusvngdp.R.inc(84305);Assert.assertEquals("[1L,1453964515792017682L]", out.toString());
    }finally{__CLR4_5_21szz1szzlusvngdp.R.flushNeeded();}}
}
