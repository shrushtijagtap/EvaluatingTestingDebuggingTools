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

public class ListSerializerTest extends TestCase {static class __CLR4_5_21s1r1s1rlusyjuyy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,83074,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0_s() throws Exception {__CLR4_5_21s1r1s1rlusyjuyy.R.globalSliceStart(getClass().getName(),83007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2skazm1s1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s1r1s1rlusyjuyy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s1r1s1rlusyjuyy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_0_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83007,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2skazm1s1r() throws Exception{try{__CLR4_5_21s1r1s1rlusyjuyy.R.inc(83007);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83008);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83009);ListSerializer listSerializer = new ListSerializer();
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83010);listSerializer.write(new JSONSerializer(out), Collections.EMPTY_LIST, null, null, 0);

        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83011);Assert.assertEquals("[]", out.toString());
    }finally{__CLR4_5_21s1r1s1rlusyjuyy.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_5_21s1r1s1rlusyjuyy.R.globalSliceStart(getClass().getName(),83012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2529ops1s1w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s1r1s1rlusyjuyy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s1r1s1rlusyjuyy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83012,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2529ops1s1w() throws Exception{try{__CLR4_5_21s1r1s1rlusyjuyy.R.inc(83012);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83013);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83014);ListSerializer listSerializer = new ListSerializer();
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83015);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83016);list.add(1);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83017);list.add(2);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83018);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83019);Assert.assertEquals("[1,2]", out.toString());
    }finally{__CLR4_5_21s1r1s1rlusyjuyy.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_5_21s1r1s1rlusyjuyy.R.globalSliceStart(getClass().getName(),83020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2774dkv1s24();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s1r1s1rlusyjuyy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s1r1s1rlusyjuyy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_3_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83020,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2774dkv1s24() throws Exception{try{__CLR4_5_21s1r1s1rlusyjuyy.R.inc(83020);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83021);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83022);ListSerializer listSerializer = new ListSerializer();
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83023);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83024);list.add(1);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83025);list.add(2);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83026);list.add(3);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83027);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83028);Assert.assertEquals("[1,2,3]", out.toString());
    }finally{__CLR4_5_21s1r1s1rlusyjuyy.R.flushNeeded();}}

    public void test_4_s() throws Exception {__CLR4_5_21s1r1s1rlusyjuyy.R.globalSliceStart(getClass().getName(),83029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29bz2fy1s2d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s1r1s1rlusyjuyy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s1r1s1rlusyjuyy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_4_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83029,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29bz2fy1s2d() throws Exception{try{__CLR4_5_21s1r1s1rlusyjuyy.R.inc(83029);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83030);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83031);ListSerializer listSerializer = new ListSerializer();
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83032);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83033);list.add(1L);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83034);list.add(2L);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83035);list.add(3L);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83036);list.add(Collections.emptyMap());
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83037);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83038);Assert.assertEquals("[1,2,3,{}]", out.toString());
    }finally{__CLR4_5_21s1r1s1rlusyjuyy.R.flushNeeded();}}

    public void test_5_s() throws Exception {__CLR4_5_21s1r1s1rlusyjuyy.R.globalSliceStart(getClass().getName(),83039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bgtrb11s2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s1r1s1rlusyjuyy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s1r1s1rlusyjuyy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_5_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83039,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bgtrb11s2n() throws Exception{try{__CLR4_5_21s1r1s1rlusyjuyy.R.inc(83039);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83040);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83041);ListSerializer listSerializer = new ListSerializer();
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83042);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83043);list.add(1L);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83044);list.add(21474836480L);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83045);list.add(null);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83046);list.add(Collections.emptyMap());
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83047);list.add(21474836480L);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83048);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83049);Assert.assertEquals("[1,21474836480,null,{},21474836480]", out.toString());
    }finally{__CLR4_5_21s1r1s1rlusyjuyy.R.flushNeeded();}}

    public void test_6_s() throws Exception {__CLR4_5_21s1r1s1rlusyjuyy.R.globalSliceStart(getClass().getName(),83050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dlog641s2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s1r1s1rlusyjuyy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s1r1s1rlusyjuyy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_6_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83050,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dlog641s2y() throws Exception{try{__CLR4_5_21s1r1s1rlusyjuyy.R.inc(83050);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83051);SerializeWriter out = new SerializeWriter(SerializerFeature.BrowserCompatible);

        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83052);ListSerializer listSerializer = new ListSerializer();
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83053);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83054);list.add(1L);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83055);list.add(1453964515792017682L);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83056);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83057);Assert.assertEquals("[1,\"1453964515792017682\"]", out.toString());
    }finally{__CLR4_5_21s1r1s1rlusyjuyy.R.flushNeeded();}}

    public void test_7_s() throws Exception {__CLR4_5_21s1r1s1rlusyjuyy.R.globalSliceStart(getClass().getName(),83058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fqj5171s36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s1r1s1rlusyjuyy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s1r1s1rlusyjuyy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_7_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83058,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fqj5171s36() throws Exception{try{__CLR4_5_21s1r1s1rlusyjuyy.R.inc(83058);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83059);SerializeWriter out = new SerializeWriter(
                SerializerFeature.BrowserCompatible, SerializerFeature.WriteClassName
        );

        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83060);ListSerializer listSerializer = new ListSerializer();
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83061);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83062);list.add(1L);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83063);list.add(1453964515792017682L);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83064);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83065);Assert.assertEquals("[1L,1453964515792017682L]", out.toString());
    }finally{__CLR4_5_21s1r1s1rlusyjuyy.R.flushNeeded();}}

    public void test_8_s() throws Exception {__CLR4_5_21s1r1s1rlusyjuyy.R.globalSliceStart(getClass().getName(),83066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hvdtwa1s3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21s1r1s1rlusyjuyy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21s1r1s1rlusyjuyy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ListSerializerTest.test_8_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83066,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hvdtwa1s3e() throws Exception{try{__CLR4_5_21s1r1s1rlusyjuyy.R.inc(83066);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83067);SerializeWriter out = new SerializeWriter(SerializerFeature.WriteClassName);

        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83068);ListSerializer listSerializer = new ListSerializer();
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83069);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83070);list.add(1L);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83071);list.add(1453964515792017682L);
        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83072);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_5_21s1r1s1rlusyjuyy.R.inc(83073);Assert.assertEquals("[1L,1453964515792017682L]", out.toString());
    }finally{__CLR4_5_21s1r1s1rlusyjuyy.R.flushNeeded();}}
}
