/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class StringArraySerializerTest extends TestCase {static class __CLR4_5_21tdn1tdnlusyjv3h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,84747,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21tdn1tdnlusyjv3h.R.globalSliceStart(getClass().getName(),84731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21tdn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tdn1tdnlusyjv3h.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tdn1tdnlusyjv3h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringArraySerializerTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84731,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21tdn() throws Exception{try{__CLR4_5_21tdn1tdnlusyjv3h.R.inc(84731);
        __CLR4_5_21tdn1tdnlusyjv3h.R.inc(84732);SerializeWriter out = new SerializeWriter(1);

        __CLR4_5_21tdn1tdnlusyjv3h.R.inc(84733);JSONSerializer.write(out, new String[] { "a12", "b34" });

        __CLR4_5_21tdn1tdnlusyjv3h.R.inc(84734);Assert.assertEquals("[\"a12\",\"b34\"]", out.toString());
    }finally{__CLR4_5_21tdn1tdnlusyjv3h.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21tdn1tdnlusyjv3h.R.globalSliceStart(getClass().getName(),84735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1tdr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tdn1tdnlusyjv3h.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tdn1tdnlusyjv3h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringArraySerializerTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84735,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1tdr() throws Exception{try{__CLR4_5_21tdn1tdnlusyjv3h.R.inc(84735);
        __CLR4_5_21tdn1tdnlusyjv3h.R.inc(84736);SerializeWriter out = new SerializeWriter(1);

        __CLR4_5_21tdn1tdnlusyjv3h.R.inc(84737);JSONSerializer.write(out, new String[] { "a12", "\na\nb\nc\nd\"'", "b34" });

        __CLR4_5_21tdn1tdnlusyjv3h.R.inc(84738);Assert.assertEquals("[\"a12\",\"\\na\\nb\\nc\\nd\\\"'\",\"b34\"]", out.toString());
    }finally{__CLR4_5_21tdn1tdnlusyjv3h.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21tdn1tdnlusyjv3h.R.globalSliceStart(getClass().getName(),84739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441tdv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tdn1tdnlusyjv3h.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tdn1tdnlusyjv3h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringArraySerializerTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84739,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441tdv() throws Exception{try{__CLR4_5_21tdn1tdnlusyjv3h.R.inc(84739);
        __CLR4_5_21tdn1tdnlusyjv3h.R.inc(84740);SerializeWriter out = new SerializeWriter(1);

        __CLR4_5_21tdn1tdnlusyjv3h.R.inc(84741);JSONSerializer.write(out, new String[] { "a12", null });

        __CLR4_5_21tdn1tdnlusyjv3h.R.inc(84742);Assert.assertEquals("[\"a12\",null]", out.toString());
    }finally{__CLR4_5_21tdn1tdnlusyjv3h.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21tdn1tdnlusyjv3h.R.globalSliceStart(getClass().getName(),84743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1tdz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tdn1tdnlusyjv3h.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tdn1tdnlusyjv3h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringArraySerializerTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84743,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1tdz() throws Exception{try{__CLR4_5_21tdn1tdnlusyjv3h.R.inc(84743);
        __CLR4_5_21tdn1tdnlusyjv3h.R.inc(84744);SerializeWriter out = new SerializeWriter(1024);

        __CLR4_5_21tdn1tdnlusyjv3h.R.inc(84745);JSONSerializer.write(out, new String[] { "a12", null });

        __CLR4_5_21tdn1tdnlusyjv3h.R.inc(84746);Assert.assertEquals("[\"a12\",null]", out.toString());
    }finally{__CLR4_5_21tdn1tdnlusyjv3h.R.flushNeeded();}}
}
