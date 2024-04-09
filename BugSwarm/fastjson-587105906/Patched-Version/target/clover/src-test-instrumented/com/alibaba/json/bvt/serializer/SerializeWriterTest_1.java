/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.io.ByteArrayOutputStream;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class SerializeWriterTest_1 extends TestCase {static class __CLR4_5_21tpu1tpulusvngik{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,85200,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0 () throws Exception {__CLR4_5_21tpu1tpulusvngik.R.globalSliceStart(getClass().getName(),85170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21tpu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tpu1tpulusvngik.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tpu1tpulusvngik.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_1.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85170,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21tpu() throws Exception{try{__CLR4_5_21tpu1tpulusvngik.R.inc(85170);
        __CLR4_5_21tpu1tpulusvngik.R.inc(85171);SerializeWriter out = new SerializeWriter(SerializerFeature.UseSingleQuotes);
        __CLR4_5_21tpu1tpulusvngik.R.inc(85172);out.writeString("abc");
        __CLR4_5_21tpu1tpulusvngik.R.inc(85173);Assert.assertEquals("'abc'", out.toString());
    }finally{__CLR4_5_21tpu1tpulusvngik.R.flushNeeded();}}
    
    public void test_1 () throws Exception {__CLR4_5_21tpu1tpulusvngik.R.globalSliceStart(getClass().getName(),85174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1tpy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tpu1tpulusvngik.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tpu1tpulusvngik.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_1.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85174,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1tpy() throws Exception{try{__CLR4_5_21tpu1tpulusvngik.R.inc(85174);
        __CLR4_5_21tpu1tpulusvngik.R.inc(85175);SerializeWriter out = new SerializeWriter(SerializerFeature.UseSingleQuotes);
        __CLR4_5_21tpu1tpulusvngik.R.inc(85176);out.writeString("abc\u4e2d\u6587");
        
        __CLR4_5_21tpu1tpulusvngik.R.inc(85177);ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        __CLR4_5_21tpu1tpulusvngik.R.inc(85178);out.writeTo(byteOut, "UTF-8");
        __CLR4_5_21tpu1tpulusvngik.R.inc(85179);Assert.assertEquals("'abc\u4e2d\u6587'", new String(byteOut.toByteArray(), "UTF-8"));
    }finally{__CLR4_5_21tpu1tpulusvngik.R.flushNeeded();}}
    
    public void test_2 () throws Exception {__CLR4_5_21tpu1tpulusvngik.R.globalSliceStart(getClass().getName(),85180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441tq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tpu1tpulusvngik.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tpu1tpulusvngik.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_1.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85180,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441tq4() throws Exception{try{__CLR4_5_21tpu1tpulusvngik.R.inc(85180);
        __CLR4_5_21tpu1tpulusvngik.R.inc(85181);SerializeWriter out = new SerializeWriter(SerializerFeature.UseSingleQuotes);
        __CLR4_5_21tpu1tpulusvngik.R.inc(85182);out.writeString("abc");
        __CLR4_5_21tpu1tpulusvngik.R.inc(85183);Assert.assertEquals("'abc'", new String(out.toBytes((String) null), "ISO-8859-1"));
    }finally{__CLR4_5_21tpu1tpulusvngik.R.flushNeeded();}}
    
    public void test_3 () throws Exception {__CLR4_5_21tpu1tpulusvngik.R.globalSliceStart(getClass().getName(),85184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1tq8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tpu1tpulusvngik.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tpu1tpulusvngik.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_1.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85184,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1tq8() throws Exception{try{__CLR4_5_21tpu1tpulusvngik.R.inc(85184);
        __CLR4_5_21tpu1tpulusvngik.R.inc(85185);SerializeWriter out = new SerializeWriter(SerializerFeature.UseSingleQuotes);
        __CLR4_5_21tpu1tpulusvngik.R.inc(85186);out.writeString("abc");
        __CLR4_5_21tpu1tpulusvngik.R.inc(85187);Assert.assertEquals("'abc'", new String(out.toBytes("UTF-16"), "UTF-16"));
    }finally{__CLR4_5_21tpu1tpulusvngik.R.flushNeeded();}}
    
    public void test_5 () throws Exception {__CLR4_5_21tpu1tpulusvngik.R.globalSliceStart(getClass().getName(),85188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1tqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tpu1tpulusvngik.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tpu1tpulusvngik.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_1.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85188,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1tqc() throws Exception{try{__CLR4_5_21tpu1tpulusvngik.R.inc(85188);
        __CLR4_5_21tpu1tpulusvngik.R.inc(85189);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21tpu1tpulusvngik.R.inc(85190);out.write((String) null);
        __CLR4_5_21tpu1tpulusvngik.R.inc(85191);Assert.assertEquals("null", new String(out.toBytes("UTF-16"), "UTF-16"));
    }finally{__CLR4_5_21tpu1tpulusvngik.R.flushNeeded();}}
    
    public void test_6 () throws Exception {__CLR4_5_21tpu1tpulusvngik.R.globalSliceStart(getClass().getName(),85192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81tqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tpu1tpulusvngik.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tpu1tpulusvngik.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_1.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85192,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81tqg() throws Exception{try{__CLR4_5_21tpu1tpulusvngik.R.inc(85192);
        __CLR4_5_21tpu1tpulusvngik.R.inc(85193);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21tpu1tpulusvngik.R.inc(85194);out.writeString("\u4e2d\u6587");
        __CLR4_5_21tpu1tpulusvngik.R.inc(85195);Assert.assertEquals("\"\u4e2d\u6587\"", new String(out.toBytes("UTF-16"), "UTF-16"));
    }finally{__CLR4_5_21tpu1tpulusvngik.R.flushNeeded();}}
    
    public void test_null () throws Exception {__CLR4_5_21tpu1tpulusvngik.R.globalSliceStart(getClass().getName(),85196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1tqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tpu1tpulusvngik.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tpu1tpulusvngik.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_1.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85196,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1tqk() throws Exception{try{__CLR4_5_21tpu1tpulusvngik.R.inc(85196);
        __CLR4_5_21tpu1tpulusvngik.R.inc(85197);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21tpu1tpulusvngik.R.inc(85198);out.writeString((String) null);
        __CLR4_5_21tpu1tpulusvngik.R.inc(85199);Assert.assertEquals("null", new String(out.toBytes("UTF-16"), "UTF-16"));
    }finally{__CLR4_5_21tpu1tpulusvngik.R.flushNeeded();}}
}
