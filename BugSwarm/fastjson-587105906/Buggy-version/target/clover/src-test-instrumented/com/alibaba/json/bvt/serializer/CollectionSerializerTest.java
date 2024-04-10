/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.CollectionCodec;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class CollectionSerializerTest extends TestCase {static class __CLR4_1_101rt01rt0luszwevj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,82740,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101rt01rt0luszwevj.R.globalSliceStart(getClass().getName(),82692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21rt0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rt01rt0luszwevj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rt01rt0luszwevj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.CollectionSerializerTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82692,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21rt0() throws Exception{try{__CLR4_1_101rt01rt0luszwevj.R.inc(82692);
        __CLR4_1_101rt01rt0luszwevj.R.inc(82693);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101rt01rt0luszwevj.R.inc(82694);CollectionCodec listSerializer = new CollectionCodec();
        __CLR4_1_101rt01rt0luszwevj.R.inc(82695);listSerializer.write(new JSONSerializer(out), Collections.EMPTY_LIST, null, null, 0);

        __CLR4_1_101rt01rt0luszwevj.R.inc(82696);Assert.assertEquals("[]", out.toString());
    }finally{__CLR4_1_101rt01rt0luszwevj.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101rt01rt0luszwevj.R.globalSliceStart(getClass().getName(),82697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1rt5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rt01rt0luszwevj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rt01rt0luszwevj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.CollectionSerializerTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82697,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1rt5() throws Exception{try{__CLR4_1_101rt01rt0luszwevj.R.inc(82697);
        __CLR4_1_101rt01rt0luszwevj.R.inc(82698);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101rt01rt0luszwevj.R.inc(82699);CollectionCodec listSerializer = new CollectionCodec();
        __CLR4_1_101rt01rt0luszwevj.R.inc(82700);listSerializer.write(new JSONSerializer(out), Collections.singletonList(1), null, null, 0);

        __CLR4_1_101rt01rt0luszwevj.R.inc(82701);Assert.assertEquals("[1]", out.toString());
    }finally{__CLR4_1_101rt01rt0luszwevj.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_1_101rt01rt0luszwevj.R.globalSliceStart(getClass().getName(),82702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10529ops1rta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rt01rt0luszwevj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rt01rt0luszwevj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.CollectionSerializerTest.test_2_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82702,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10529ops1rta() throws Exception{try{__CLR4_1_101rt01rt0luszwevj.R.inc(82702);
        __CLR4_1_101rt01rt0luszwevj.R.inc(82703);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101rt01rt0luszwevj.R.inc(82704);CollectionCodec listSerializer = new CollectionCodec();
        __CLR4_1_101rt01rt0luszwevj.R.inc(82705);List<Object> list = new ArrayList<Object>();
        __CLR4_1_101rt01rt0luszwevj.R.inc(82706);list.add(1);
        __CLR4_1_101rt01rt0luszwevj.R.inc(82707);list.add(2);
        __CLR4_1_101rt01rt0luszwevj.R.inc(82708);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_1_101rt01rt0luszwevj.R.inc(82709);Assert.assertEquals("[1,2]", out.toString());
    }finally{__CLR4_1_101rt01rt0luszwevj.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_1_101rt01rt0luszwevj.R.globalSliceStart(getClass().getName(),82710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10774dkv1rti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rt01rt0luszwevj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rt01rt0luszwevj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.CollectionSerializerTest.test_3_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82710,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10774dkv1rti() throws Exception{try{__CLR4_1_101rt01rt0luszwevj.R.inc(82710);
        __CLR4_1_101rt01rt0luszwevj.R.inc(82711);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101rt01rt0luszwevj.R.inc(82712);CollectionCodec listSerializer = new CollectionCodec();
        __CLR4_1_101rt01rt0luszwevj.R.inc(82713);List<Object> list = new ArrayList<Object>();
        __CLR4_1_101rt01rt0luszwevj.R.inc(82714);list.add(1);
        __CLR4_1_101rt01rt0luszwevj.R.inc(82715);list.add(2);
        __CLR4_1_101rt01rt0luszwevj.R.inc(82716);list.add(3);
        __CLR4_1_101rt01rt0luszwevj.R.inc(82717);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_1_101rt01rt0luszwevj.R.inc(82718);Assert.assertEquals("[1,2,3]", out.toString());
    }finally{__CLR4_1_101rt01rt0luszwevj.R.flushNeeded();}}

    public void test_4_s() throws Exception {__CLR4_1_101rt01rt0luszwevj.R.globalSliceStart(getClass().getName(),82719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109bz2fy1rtr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rt01rt0luszwevj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rt01rt0luszwevj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.CollectionSerializerTest.test_4_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82719,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109bz2fy1rtr() throws Exception{try{__CLR4_1_101rt01rt0luszwevj.R.inc(82719);
        __CLR4_1_101rt01rt0luszwevj.R.inc(82720);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101rt01rt0luszwevj.R.inc(82721);CollectionCodec listSerializer = new CollectionCodec();
        __CLR4_1_101rt01rt0luszwevj.R.inc(82722);List<Object> list = new ArrayList<Object>();
        __CLR4_1_101rt01rt0luszwevj.R.inc(82723);list.add(1L);
        __CLR4_1_101rt01rt0luszwevj.R.inc(82724);list.add(2L);
        __CLR4_1_101rt01rt0luszwevj.R.inc(82725);list.add(3L);
        __CLR4_1_101rt01rt0luszwevj.R.inc(82726);list.add(Collections.emptyMap());
        __CLR4_1_101rt01rt0luszwevj.R.inc(82727);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_1_101rt01rt0luszwevj.R.inc(82728);Assert.assertEquals("[1,2,3,{}]", out.toString());
    }finally{__CLR4_1_101rt01rt0luszwevj.R.flushNeeded();}}

    public void test_5_s() throws Exception {__CLR4_1_101rt01rt0luszwevj.R.globalSliceStart(getClass().getName(),82729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bgtrb11ru1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rt01rt0luszwevj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rt01rt0luszwevj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.CollectionSerializerTest.test_5_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82729,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bgtrb11ru1() throws Exception{try{__CLR4_1_101rt01rt0luszwevj.R.inc(82729);
        __CLR4_1_101rt01rt0luszwevj.R.inc(82730);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101rt01rt0luszwevj.R.inc(82731);CollectionCodec listSerializer = new CollectionCodec();
        __CLR4_1_101rt01rt0luszwevj.R.inc(82732);List<Object> list = new ArrayList<Object>();
        __CLR4_1_101rt01rt0luszwevj.R.inc(82733);list.add(1L);
        __CLR4_1_101rt01rt0luszwevj.R.inc(82734);list.add(21474836480L);
        __CLR4_1_101rt01rt0luszwevj.R.inc(82735);list.add(null);
        __CLR4_1_101rt01rt0luszwevj.R.inc(82736);list.add(Collections.emptyMap());
        __CLR4_1_101rt01rt0luszwevj.R.inc(82737);list.add(21474836480L);
        __CLR4_1_101rt01rt0luszwevj.R.inc(82738);listSerializer.write(new JSONSerializer(out), list, null, null, 0);

        __CLR4_1_101rt01rt0luszwevj.R.inc(82739);Assert.assertEquals("[1,21474836480,null,{},21474836480]", out.toString());
    }finally{__CLR4_1_101rt01rt0luszwevj.R.flushNeeded();}}
}
