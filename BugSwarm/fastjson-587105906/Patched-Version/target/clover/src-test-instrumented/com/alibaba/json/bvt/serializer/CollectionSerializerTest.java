/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.CollectionCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class CollectionSerializerTest extends TestCase {static class __CLR4_5_21quh1quhlusyjutf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,81497,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21quh1quhlusyjutf.R.globalSliceStart(getClass().getName(),81449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21quh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21quh1quhlusyjutf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21quh1quhlusyjutf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.CollectionSerializerTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81449,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21quh() throws Exception{try{__CLR4_5_21quh1quhlusyjutf.R.inc(81449);
        __CLR4_5_21quh1quhlusyjutf.R.inc(81450);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21quh1quhlusyjutf.R.inc(81451);CollectionCodec listSerializer = new CollectionCodec();
        __CLR4_5_21quh1quhlusyjutf.R.inc(81452);listSerializer.write(new JSONSerializer(out), Collections.EMPTY_LIST, null, null, 0);

        __CLR4_5_21quh1quhlusyjutf.R.inc(81453);Assert.assertEquals("[]", out.toString());
    }finally{__CLR4_5_21quh1quhlusyjutf.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21quh1quhlusyjutf.R.globalSliceStart(getClass().getName(),81454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1qum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21quh1quhlusyjutf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21quh1quhlusyjutf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.CollectionSerializerTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81454,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1qum() throws Exception{try{__CLR4_5_21quh1quhlusyjutf.R.inc(81454);
        __CLR4_5_21quh1quhlusyjutf.R.inc(81455);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21quh1quhlusyjutf.R.inc(81456);CollectionCodec listSerializer = new CollectionCodec();
        __CLR4_5_21quh1quhlusyjutf.R.inc(81457);listSerializer.write(new JSONSerializer(out), Collections.singletonList(1), null, null, 0);

        __CLR4_5_21quh1quhlusyjutf.R.inc(81458);Assert.assertEquals("[1]", out.toString());
    }finally{__CLR4_5_21quh1quhlusyjutf.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_5_21quh1quhlusyjutf.R.globalSliceStart(getClass().getName(),81459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2529ops1qur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21quh1quhlusyjutf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21quh1quhlusyjutf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.CollectionSerializerTest.test_2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81459,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2529ops1qur() throws Exception{try{__CLR4_5_21quh1quhlusyjutf.R.inc(81459);
        __CLR4_5_21quh1quhlusyjutf.R.inc(81460);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21quh1quhlusyjutf.R.inc(81461);CollectionCodec listSerializer = new CollectionCodec();
        __CLR4_5_21quh1quhlusyjutf.R.inc(81462);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21quh1quhlusyjutf.R.inc(81463);list.add(1);
        __CLR4_5_21quh1quhlusyjutf.R.inc(81464);list.add(2);
        __CLR4_5_21quh1quhlusyjutf.R.inc(81465);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_5_21quh1quhlusyjutf.R.inc(81466);Assert.assertEquals("[1,2]", out.toString());
    }finally{__CLR4_5_21quh1quhlusyjutf.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_5_21quh1quhlusyjutf.R.globalSliceStart(getClass().getName(),81467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2774dkv1quz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21quh1quhlusyjutf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21quh1quhlusyjutf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.CollectionSerializerTest.test_3_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81467,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2774dkv1quz() throws Exception{try{__CLR4_5_21quh1quhlusyjutf.R.inc(81467);
        __CLR4_5_21quh1quhlusyjutf.R.inc(81468);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21quh1quhlusyjutf.R.inc(81469);CollectionCodec listSerializer = new CollectionCodec();
        __CLR4_5_21quh1quhlusyjutf.R.inc(81470);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21quh1quhlusyjutf.R.inc(81471);list.add(1);
        __CLR4_5_21quh1quhlusyjutf.R.inc(81472);list.add(2);
        __CLR4_5_21quh1quhlusyjutf.R.inc(81473);list.add(3);
        __CLR4_5_21quh1quhlusyjutf.R.inc(81474);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_5_21quh1quhlusyjutf.R.inc(81475);Assert.assertEquals("[1,2,3]", out.toString());
    }finally{__CLR4_5_21quh1quhlusyjutf.R.flushNeeded();}}

    public void test_4_s() throws Exception {__CLR4_5_21quh1quhlusyjutf.R.globalSliceStart(getClass().getName(),81476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29bz2fy1qv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21quh1quhlusyjutf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21quh1quhlusyjutf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.CollectionSerializerTest.test_4_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81476,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29bz2fy1qv8() throws Exception{try{__CLR4_5_21quh1quhlusyjutf.R.inc(81476);
        __CLR4_5_21quh1quhlusyjutf.R.inc(81477);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21quh1quhlusyjutf.R.inc(81478);CollectionCodec listSerializer = new CollectionCodec();
        __CLR4_5_21quh1quhlusyjutf.R.inc(81479);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21quh1quhlusyjutf.R.inc(81480);list.add(1L);
        __CLR4_5_21quh1quhlusyjutf.R.inc(81481);list.add(2L);
        __CLR4_5_21quh1quhlusyjutf.R.inc(81482);list.add(3L);
        __CLR4_5_21quh1quhlusyjutf.R.inc(81483);list.add(Collections.emptyMap());
        __CLR4_5_21quh1quhlusyjutf.R.inc(81484);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_5_21quh1quhlusyjutf.R.inc(81485);Assert.assertEquals("[1,2,3,{}]", out.toString());
    }finally{__CLR4_5_21quh1quhlusyjutf.R.flushNeeded();}}

    public void test_5_s() throws Exception {__CLR4_5_21quh1quhlusyjutf.R.globalSliceStart(getClass().getName(),81486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bgtrb11qvi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21quh1quhlusyjutf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21quh1quhlusyjutf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.CollectionSerializerTest.test_5_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81486,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bgtrb11qvi() throws Exception{try{__CLR4_5_21quh1quhlusyjutf.R.inc(81486);
        __CLR4_5_21quh1quhlusyjutf.R.inc(81487);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21quh1quhlusyjutf.R.inc(81488);CollectionCodec listSerializer = new CollectionCodec();
        __CLR4_5_21quh1quhlusyjutf.R.inc(81489);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21quh1quhlusyjutf.R.inc(81490);list.add(1L);
        __CLR4_5_21quh1quhlusyjutf.R.inc(81491);list.add(21474836480L);
        __CLR4_5_21quh1quhlusyjutf.R.inc(81492);list.add(null);
        __CLR4_5_21quh1quhlusyjutf.R.inc(81493);list.add(Collections.emptyMap());
        __CLR4_5_21quh1quhlusyjutf.R.inc(81494);list.add(21474836480L);
        __CLR4_5_21quh1quhlusyjutf.R.inc(81495);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_5_21quh1quhlusyjutf.R.inc(81496);Assert.assertEquals("[1,21474836480,null,{},21474836480]", out.toString());
    }finally{__CLR4_5_21quh1quhlusyjutf.R.flushNeeded();}}
}
