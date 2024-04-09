/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.util.IOUtils;

public class ArraySerializerTest extends TestCase {static class __CLR4_1_101u821u82lusqkkxl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,85840,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101u821u82lusqkkxl.R.globalSliceStart(getClass().getName(),85826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21u82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u821u82lusqkkxl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u821u82lusqkkxl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ArraySerializerTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85826,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21u82() throws Exception{try{__CLR4_1_101u821u82lusqkkxl.R.inc(85826);
        __CLR4_1_101u821u82lusqkkxl.R.inc(85827);SerializeWriter out = new SerializeWriter(1);

        __CLR4_1_101u821u82lusqkkxl.R.inc(85828);JSONSerializer.write(out, new A[] { new A(), null, null });

        __CLR4_1_101u821u82lusqkkxl.R.inc(85829);Assert.assertEquals("[{},null,null]", out.toString());
    }finally{__CLR4_1_101u821u82lusqkkxl.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101u821u82lusqkkxl.R.globalSliceStart(getClass().getName(),85830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1u86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u821u82lusqkkxl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u821u82lusqkkxl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ArraySerializerTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85830,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1u86() throws Exception{try{__CLR4_1_101u821u82lusqkkxl.R.inc(85830);
        __CLR4_1_101u821u82lusqkkxl.R.inc(85831);SerializeWriter out = new SerializeWriter(1);

        __CLR4_1_101u821u82lusqkkxl.R.inc(85832);JSONSerializer.write(out, new A[] {});

        __CLR4_1_101u821u82lusqkkxl.R.inc(85833);Assert.assertEquals("[]", out.toString());

        __CLR4_1_101u821u82lusqkkxl.R.inc(85834);new IOUtils();
    }finally{__CLR4_1_101u821u82lusqkkxl.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101u821u82lusqkkxl.R.globalSliceStart(getClass().getName(),85835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441u8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u821u82lusqkkxl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u821u82lusqkkxl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.ArraySerializerTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85835,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441u8b() throws Exception{try{__CLR4_1_101u821u82lusqkkxl.R.inc(85835);
        __CLR4_1_101u821u82lusqkkxl.R.inc(85836);SerializeWriter out = new SerializeWriter(1);

        __CLR4_1_101u821u82lusqkkxl.R.inc(85837);JSONSerializer.write(out, new A[] { new A() });

        __CLR4_1_101u821u82lusqkkxl.R.inc(85838);Assert.assertEquals("[{}]", out.toString());

        __CLR4_1_101u821u82lusqkkxl.R.inc(85839);new IOUtils();
    }finally{__CLR4_1_101u821u82lusqkkxl.R.flushNeeded();}}

    public static class A {

    }
}
