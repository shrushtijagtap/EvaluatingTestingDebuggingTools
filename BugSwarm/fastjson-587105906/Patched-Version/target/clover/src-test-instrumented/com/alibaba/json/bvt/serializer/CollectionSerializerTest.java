/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.CollectionCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class CollectionSerializerTest extends TestCase {static class __CLR4_5_21rsp1rsplusvng1o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,82729,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21rsp1rsplusvng1o.R.globalSliceStart(getClass().getName(),82681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21rsp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rsp1rsplusvng1o.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rsp1rsplusvng1o.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.CollectionSerializerTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82681,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21rsp() throws Exception{try{__CLR4_5_21rsp1rsplusvng1o.R.inc(82681);
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82682);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21rsp1rsplusvng1o.R.inc(82683);CollectionCodec listSerializer = new CollectionCodec();
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82684);listSerializer.write(new JSONSerializer(out), Collections.EMPTY_LIST, null, null, 0);

        __CLR4_5_21rsp1rsplusvng1o.R.inc(82685);Assert.assertEquals("[]", out.toString());
    }finally{__CLR4_5_21rsp1rsplusvng1o.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21rsp1rsplusvng1o.R.globalSliceStart(getClass().getName(),82686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1rsu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rsp1rsplusvng1o.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rsp1rsplusvng1o.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.CollectionSerializerTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82686,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1rsu() throws Exception{try{__CLR4_5_21rsp1rsplusvng1o.R.inc(82686);
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82687);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21rsp1rsplusvng1o.R.inc(82688);CollectionCodec listSerializer = new CollectionCodec();
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82689);listSerializer.write(new JSONSerializer(out), Collections.singletonList(1), null, null, 0);

        __CLR4_5_21rsp1rsplusvng1o.R.inc(82690);Assert.assertEquals("[1]", out.toString());
    }finally{__CLR4_5_21rsp1rsplusvng1o.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_5_21rsp1rsplusvng1o.R.globalSliceStart(getClass().getName(),82691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2529ops1rsz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rsp1rsplusvng1o.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rsp1rsplusvng1o.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.CollectionSerializerTest.test_2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82691,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2529ops1rsz() throws Exception{try{__CLR4_5_21rsp1rsplusvng1o.R.inc(82691);
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82692);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21rsp1rsplusvng1o.R.inc(82693);CollectionCodec listSerializer = new CollectionCodec();
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82694);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82695);list.add(1);
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82696);list.add(2);
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82697);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_5_21rsp1rsplusvng1o.R.inc(82698);Assert.assertEquals("[1,2]", out.toString());
    }finally{__CLR4_5_21rsp1rsplusvng1o.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_5_21rsp1rsplusvng1o.R.globalSliceStart(getClass().getName(),82699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2774dkv1rt7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rsp1rsplusvng1o.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rsp1rsplusvng1o.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.CollectionSerializerTest.test_3_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82699,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2774dkv1rt7() throws Exception{try{__CLR4_5_21rsp1rsplusvng1o.R.inc(82699);
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82700);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21rsp1rsplusvng1o.R.inc(82701);CollectionCodec listSerializer = new CollectionCodec();
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82702);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82703);list.add(1);
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82704);list.add(2);
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82705);list.add(3);
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82706);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_5_21rsp1rsplusvng1o.R.inc(82707);Assert.assertEquals("[1,2,3]", out.toString());
    }finally{__CLR4_5_21rsp1rsplusvng1o.R.flushNeeded();}}

    public void test_4_s() throws Exception {__CLR4_5_21rsp1rsplusvng1o.R.globalSliceStart(getClass().getName(),82708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29bz2fy1rtg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rsp1rsplusvng1o.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rsp1rsplusvng1o.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.CollectionSerializerTest.test_4_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82708,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29bz2fy1rtg() throws Exception{try{__CLR4_5_21rsp1rsplusvng1o.R.inc(82708);
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82709);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21rsp1rsplusvng1o.R.inc(82710);CollectionCodec listSerializer = new CollectionCodec();
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82711);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82712);list.add(1L);
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82713);list.add(2L);
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82714);list.add(3L);
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82715);list.add(Collections.emptyMap());
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82716);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_5_21rsp1rsplusvng1o.R.inc(82717);Assert.assertEquals("[1,2,3,{}]", out.toString());
    }finally{__CLR4_5_21rsp1rsplusvng1o.R.flushNeeded();}}

    public void test_5_s() throws Exception {__CLR4_5_21rsp1rsplusvng1o.R.globalSliceStart(getClass().getName(),82718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bgtrb11rtq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rsp1rsplusvng1o.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rsp1rsplusvng1o.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.CollectionSerializerTest.test_5_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82718,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bgtrb11rtq() throws Exception{try{__CLR4_5_21rsp1rsplusvng1o.R.inc(82718);
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82719);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21rsp1rsplusvng1o.R.inc(82720);CollectionCodec listSerializer = new CollectionCodec();
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82721);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82722);list.add(1L);
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82723);list.add(21474836480L);
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82724);list.add(null);
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82725);list.add(Collections.emptyMap());
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82726);list.add(21474836480L);
        __CLR4_5_21rsp1rsplusvng1o.R.inc(82727);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_5_21rsp1rsplusvng1o.R.inc(82728);Assert.assertEquals("[1,21474836480,null,{},21474836480]", out.toString());
    }finally{__CLR4_5_21rsp1rsplusvng1o.R.flushNeeded();}}
}
