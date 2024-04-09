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

public class ListSerializerTest extends TestCase {static class __CLR4_1_101s221s22lusqkjtt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,83085,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0_s() throws Exception {__CLR4_1_101s221s22lusqkjtt.R.globalSliceStart(getClass().getName(),83018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10skazm1s22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s221s22lusqkjtt.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s221s22lusqkjtt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_0_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83018,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10skazm1s22() throws Exception{try{__CLR4_1_101s221s22lusqkjtt.R.inc(83018);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83019);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101s221s22lusqkjtt.R.inc(83020);ListSerializer listSerializer = new ListSerializer();
        __CLR4_1_101s221s22lusqkjtt.R.inc(83021);listSerializer.write(new JSONSerializer(out), Collections.EMPTY_LIST, null, null, 0);

        __CLR4_1_101s221s22lusqkjtt.R.inc(83022);Assert.assertEquals("[]", out.toString());
    }finally{__CLR4_1_101s221s22lusqkjtt.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_1_101s221s22lusqkjtt.R.globalSliceStart(getClass().getName(),83023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10529ops1s27();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s221s22lusqkjtt.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s221s22lusqkjtt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_2_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83023,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10529ops1s27() throws Exception{try{__CLR4_1_101s221s22lusqkjtt.R.inc(83023);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83024);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101s221s22lusqkjtt.R.inc(83025);ListSerializer listSerializer = new ListSerializer();
        __CLR4_1_101s221s22lusqkjtt.R.inc(83026);List<Object> list = new ArrayList<Object>();
        __CLR4_1_101s221s22lusqkjtt.R.inc(83027);list.add(1);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83028);list.add(2);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83029);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_1_101s221s22lusqkjtt.R.inc(83030);Assert.assertEquals("[1,2]", out.toString());
    }finally{__CLR4_1_101s221s22lusqkjtt.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_1_101s221s22lusqkjtt.R.globalSliceStart(getClass().getName(),83031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10774dkv1s2f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s221s22lusqkjtt.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s221s22lusqkjtt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_3_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83031,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10774dkv1s2f() throws Exception{try{__CLR4_1_101s221s22lusqkjtt.R.inc(83031);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83032);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101s221s22lusqkjtt.R.inc(83033);ListSerializer listSerializer = new ListSerializer();
        __CLR4_1_101s221s22lusqkjtt.R.inc(83034);List<Object> list = new ArrayList<Object>();
        __CLR4_1_101s221s22lusqkjtt.R.inc(83035);list.add(1);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83036);list.add(2);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83037);list.add(3);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83038);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_1_101s221s22lusqkjtt.R.inc(83039);Assert.assertEquals("[1,2,3]", out.toString());
    }finally{__CLR4_1_101s221s22lusqkjtt.R.flushNeeded();}}

    public void test_4_s() throws Exception {__CLR4_1_101s221s22lusqkjtt.R.globalSliceStart(getClass().getName(),83040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109bz2fy1s2o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s221s22lusqkjtt.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s221s22lusqkjtt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_4_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83040,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109bz2fy1s2o() throws Exception{try{__CLR4_1_101s221s22lusqkjtt.R.inc(83040);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83041);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101s221s22lusqkjtt.R.inc(83042);ListSerializer listSerializer = new ListSerializer();
        __CLR4_1_101s221s22lusqkjtt.R.inc(83043);List<Object> list = new ArrayList<Object>();
        __CLR4_1_101s221s22lusqkjtt.R.inc(83044);list.add(1L);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83045);list.add(2L);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83046);list.add(3L);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83047);list.add(Collections.emptyMap());
        __CLR4_1_101s221s22lusqkjtt.R.inc(83048);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_1_101s221s22lusqkjtt.R.inc(83049);Assert.assertEquals("[1,2,3,{}]", out.toString());
    }finally{__CLR4_1_101s221s22lusqkjtt.R.flushNeeded();}}

    public void test_5_s() throws Exception {__CLR4_1_101s221s22lusqkjtt.R.globalSliceStart(getClass().getName(),83050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bgtrb11s2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s221s22lusqkjtt.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s221s22lusqkjtt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_5_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83050,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bgtrb11s2y() throws Exception{try{__CLR4_1_101s221s22lusqkjtt.R.inc(83050);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83051);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101s221s22lusqkjtt.R.inc(83052);ListSerializer listSerializer = new ListSerializer();
        __CLR4_1_101s221s22lusqkjtt.R.inc(83053);List<Object> list = new ArrayList<Object>();
        __CLR4_1_101s221s22lusqkjtt.R.inc(83054);list.add(1L);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83055);list.add(21474836480L);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83056);list.add(null);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83057);list.add(Collections.emptyMap());
        __CLR4_1_101s221s22lusqkjtt.R.inc(83058);list.add(21474836480L);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83059);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_1_101s221s22lusqkjtt.R.inc(83060);Assert.assertEquals("[1,21474836480,null,{},21474836480]", out.toString());
    }finally{__CLR4_1_101s221s22lusqkjtt.R.flushNeeded();}}

    public void test_6_s() throws Exception {__CLR4_1_101s221s22lusqkjtt.R.globalSliceStart(getClass().getName(),83061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dlog641s39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s221s22lusqkjtt.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s221s22lusqkjtt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_6_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83061,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dlog641s39() throws Exception{try{__CLR4_1_101s221s22lusqkjtt.R.inc(83061);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83062);SerializeWriter out = new SerializeWriter(SerializerFeature.BrowserCompatible);

        __CLR4_1_101s221s22lusqkjtt.R.inc(83063);ListSerializer listSerializer = new ListSerializer();
        __CLR4_1_101s221s22lusqkjtt.R.inc(83064);List<Object> list = new ArrayList<Object>();
        __CLR4_1_101s221s22lusqkjtt.R.inc(83065);list.add(1L);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83066);list.add(1453964515792017682L);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83067);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_1_101s221s22lusqkjtt.R.inc(83068);Assert.assertEquals("[1,\"1453964515792017682\"]", out.toString());
    }finally{__CLR4_1_101s221s22lusqkjtt.R.flushNeeded();}}

    public void test_7_s() throws Exception {__CLR4_1_101s221s22lusqkjtt.R.globalSliceStart(getClass().getName(),83069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fqj5171s3h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s221s22lusqkjtt.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s221s22lusqkjtt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_7_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83069,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fqj5171s3h() throws Exception{try{__CLR4_1_101s221s22lusqkjtt.R.inc(83069);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83070);SerializeWriter out = new SerializeWriter(
                SerializerFeature.BrowserCompatible, SerializerFeature.WriteClassName
        );

        __CLR4_1_101s221s22lusqkjtt.R.inc(83071);ListSerializer listSerializer = new ListSerializer();
        __CLR4_1_101s221s22lusqkjtt.R.inc(83072);List<Object> list = new ArrayList<Object>();
        __CLR4_1_101s221s22lusqkjtt.R.inc(83073);list.add(1L);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83074);list.add(1453964515792017682L);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83075);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_1_101s221s22lusqkjtt.R.inc(83076);Assert.assertEquals("[1L,1453964515792017682L]", out.toString());
    }finally{__CLR4_1_101s221s22lusqkjtt.R.flushNeeded();}}

    public void test_8_s() throws Exception {__CLR4_1_101s221s22lusqkjtt.R.globalSliceStart(getClass().getName(),83077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hvdtwa1s3p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s221s22lusqkjtt.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s221s22lusqkjtt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_8_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83077,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hvdtwa1s3p() throws Exception{try{__CLR4_1_101s221s22lusqkjtt.R.inc(83077);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83078);SerializeWriter out = new SerializeWriter(SerializerFeature.WriteClassName);

        __CLR4_1_101s221s22lusqkjtt.R.inc(83079);ListSerializer listSerializer = new ListSerializer();
        __CLR4_1_101s221s22lusqkjtt.R.inc(83080);List<Object> list = new ArrayList<Object>();
        __CLR4_1_101s221s22lusqkjtt.R.inc(83081);list.add(1L);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83082);list.add(1453964515792017682L);
        __CLR4_1_101s221s22lusqkjtt.R.inc(83083);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_1_101s221s22lusqkjtt.R.inc(83084);Assert.assertEquals("[1L,1453964515792017682L]", out.toString());
    }finally{__CLR4_1_101s221s22lusqkjtt.R.flushNeeded();}}
}
