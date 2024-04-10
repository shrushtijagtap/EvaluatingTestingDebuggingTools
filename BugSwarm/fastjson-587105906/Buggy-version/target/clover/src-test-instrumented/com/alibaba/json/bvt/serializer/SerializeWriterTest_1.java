/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.io.ByteArrayOutputStream;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class SerializeWriterTest_1 extends TestCase {static class __CLR4_1_101tq51tq5luszwf67{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,85211,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0 () throws Exception {__CLR4_1_101tq51tq5luszwf67.R.globalSliceStart(getClass().getName(),85181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21tq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tq51tq5luszwf67.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tq51tq5luszwf67.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_1.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85181,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21tq5() throws Exception{try{__CLR4_1_101tq51tq5luszwf67.R.inc(85181);
        __CLR4_1_101tq51tq5luszwf67.R.inc(85182);SerializeWriter out = new SerializeWriter(SerializerFeature.UseSingleQuotes);
        __CLR4_1_101tq51tq5luszwf67.R.inc(85183);out.writeString("abc");
        __CLR4_1_101tq51tq5luszwf67.R.inc(85184);Assert.assertEquals("'abc'", out.toString());
    }finally{__CLR4_1_101tq51tq5luszwf67.R.flushNeeded();}}
    
    public void test_1 () throws Exception {__CLR4_1_101tq51tq5luszwf67.R.globalSliceStart(getClass().getName(),85185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1tq9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tq51tq5luszwf67.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tq51tq5luszwf67.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_1.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85185,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1tq9() throws Exception{try{__CLR4_1_101tq51tq5luszwf67.R.inc(85185);
        __CLR4_1_101tq51tq5luszwf67.R.inc(85186);SerializeWriter out = new SerializeWriter(SerializerFeature.UseSingleQuotes);
        __CLR4_1_101tq51tq5luszwf67.R.inc(85187);out.writeString("abc\u4e2d\u6587");
        
        __CLR4_1_101tq51tq5luszwf67.R.inc(85188);ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        __CLR4_1_101tq51tq5luszwf67.R.inc(85189);out.writeTo(byteOut, "UTF-8");
        __CLR4_1_101tq51tq5luszwf67.R.inc(85190);Assert.assertEquals("'abc\u4e2d\u6587'", new String(byteOut.toByteArray(), "UTF-8"));
    }finally{__CLR4_1_101tq51tq5luszwf67.R.flushNeeded();}}
    
    public void test_2 () throws Exception {__CLR4_1_101tq51tq5luszwf67.R.globalSliceStart(getClass().getName(),85191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441tqf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tq51tq5luszwf67.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tq51tq5luszwf67.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_1.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85191,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441tqf() throws Exception{try{__CLR4_1_101tq51tq5luszwf67.R.inc(85191);
        __CLR4_1_101tq51tq5luszwf67.R.inc(85192);SerializeWriter out = new SerializeWriter(SerializerFeature.UseSingleQuotes);
        __CLR4_1_101tq51tq5luszwf67.R.inc(85193);out.writeString("abc");
        __CLR4_1_101tq51tq5luszwf67.R.inc(85194);Assert.assertEquals("'abc'", new String(out.toBytes((String) null), "ISO-8859-1"));
    }finally{__CLR4_1_101tq51tq5luszwf67.R.flushNeeded();}}
    
    public void test_3 () throws Exception {__CLR4_1_101tq51tq5luszwf67.R.globalSliceStart(getClass().getName(),85195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1tqj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tq51tq5luszwf67.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tq51tq5luszwf67.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_1.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85195,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1tqj() throws Exception{try{__CLR4_1_101tq51tq5luszwf67.R.inc(85195);
        __CLR4_1_101tq51tq5luszwf67.R.inc(85196);SerializeWriter out = new SerializeWriter(SerializerFeature.UseSingleQuotes);
        __CLR4_1_101tq51tq5luszwf67.R.inc(85197);out.writeString("abc");
        __CLR4_1_101tq51tq5luszwf67.R.inc(85198);Assert.assertEquals("'abc'", new String(out.toBytes("UTF-16"), "UTF-16"));
    }finally{__CLR4_1_101tq51tq5luszwf67.R.flushNeeded();}}
    
    public void test_5 () throws Exception {__CLR4_1_101tq51tq5luszwf67.R.globalSliceStart(getClass().getName(),85199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1tqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tq51tq5luszwf67.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tq51tq5luszwf67.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_1.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85199,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1tqn() throws Exception{try{__CLR4_1_101tq51tq5luszwf67.R.inc(85199);
        __CLR4_1_101tq51tq5luszwf67.R.inc(85200);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101tq51tq5luszwf67.R.inc(85201);out.write((String) null);
        __CLR4_1_101tq51tq5luszwf67.R.inc(85202);Assert.assertEquals("null", new String(out.toBytes("UTF-16"), "UTF-16"));
    }finally{__CLR4_1_101tq51tq5luszwf67.R.flushNeeded();}}
    
    public void test_6 () throws Exception {__CLR4_1_101tq51tq5luszwf67.R.globalSliceStart(getClass().getName(),85203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81tqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tq51tq5luszwf67.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tq51tq5luszwf67.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_1.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85203,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81tqr() throws Exception{try{__CLR4_1_101tq51tq5luszwf67.R.inc(85203);
        __CLR4_1_101tq51tq5luszwf67.R.inc(85204);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101tq51tq5luszwf67.R.inc(85205);out.writeString("\u4e2d\u6587");
        __CLR4_1_101tq51tq5luszwf67.R.inc(85206);Assert.assertEquals("\"\u4e2d\u6587\"", new String(out.toBytes("UTF-16"), "UTF-16"));
    }finally{__CLR4_1_101tq51tq5luszwf67.R.flushNeeded();}}
    
    public void test_null () throws Exception {__CLR4_1_101tq51tq5luszwf67.R.globalSliceStart(getClass().getName(),85207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1tqv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tq51tq5luszwf67.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tq51tq5luszwf67.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_1.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85207,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1tqv() throws Exception{try{__CLR4_1_101tq51tq5luszwf67.R.inc(85207);
        __CLR4_1_101tq51tq5luszwf67.R.inc(85208);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101tq51tq5luszwf67.R.inc(85209);out.writeString((String) null);
        __CLR4_1_101tq51tq5luszwf67.R.inc(85210);Assert.assertEquals("null", new String(out.toBytes("UTF-16"), "UTF-16"));
    }finally{__CLR4_1_101tq51tq5luszwf67.R.flushNeeded();}}
}
