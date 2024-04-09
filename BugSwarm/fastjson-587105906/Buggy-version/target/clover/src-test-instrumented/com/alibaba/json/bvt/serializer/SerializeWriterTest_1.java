/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.io.ByteArrayOutputStream;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class SerializeWriterTest_1 extends TestCase {static class __CLR4_1_101srx1srxlusqkk2t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,83979,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0 () throws Exception {__CLR4_1_101srx1srxlusqkk2t.R.globalSliceStart(getClass().getName(),83949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21srx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101srx1srxlusqkk2t.R.rethrow($CLV_t2$);}finally{__CLR4_1_101srx1srxlusqkk2t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_1.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83949,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21srx() throws Exception{try{__CLR4_1_101srx1srxlusqkk2t.R.inc(83949);
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83950);SerializeWriter out = new SerializeWriter(SerializerFeature.UseSingleQuotes);
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83951);out.writeString("abc");
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83952);Assert.assertEquals("'abc'", out.toString());
    }finally{__CLR4_1_101srx1srxlusqkk2t.R.flushNeeded();}}
    
    public void test_1 () throws Exception {__CLR4_1_101srx1srxlusqkk2t.R.globalSliceStart(getClass().getName(),83953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1ss1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101srx1srxlusqkk2t.R.rethrow($CLV_t2$);}finally{__CLR4_1_101srx1srxlusqkk2t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_1.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83953,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1ss1() throws Exception{try{__CLR4_1_101srx1srxlusqkk2t.R.inc(83953);
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83954);SerializeWriter out = new SerializeWriter(SerializerFeature.UseSingleQuotes);
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83955);out.writeString("abc\u4e2d\u6587");
        
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83956);ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83957);out.writeTo(byteOut, "UTF-8");
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83958);Assert.assertEquals("'abc\u4e2d\u6587'", new String(byteOut.toByteArray(), "UTF-8"));
    }finally{__CLR4_1_101srx1srxlusqkk2t.R.flushNeeded();}}
    
    public void test_2 () throws Exception {__CLR4_1_101srx1srxlusqkk2t.R.globalSliceStart(getClass().getName(),83959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441ss7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101srx1srxlusqkk2t.R.rethrow($CLV_t2$);}finally{__CLR4_1_101srx1srxlusqkk2t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_1.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83959,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441ss7() throws Exception{try{__CLR4_1_101srx1srxlusqkk2t.R.inc(83959);
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83960);SerializeWriter out = new SerializeWriter(SerializerFeature.UseSingleQuotes);
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83961);out.writeString("abc");
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83962);Assert.assertEquals("'abc'", new String(out.toBytes((String) null), "ISO-8859-1"));
    }finally{__CLR4_1_101srx1srxlusqkk2t.R.flushNeeded();}}
    
    public void test_3 () throws Exception {__CLR4_1_101srx1srxlusqkk2t.R.globalSliceStart(getClass().getName(),83963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1ssb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101srx1srxlusqkk2t.R.rethrow($CLV_t2$);}finally{__CLR4_1_101srx1srxlusqkk2t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_1.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83963,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1ssb() throws Exception{try{__CLR4_1_101srx1srxlusqkk2t.R.inc(83963);
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83964);SerializeWriter out = new SerializeWriter(SerializerFeature.UseSingleQuotes);
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83965);out.writeString("abc");
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83966);Assert.assertEquals("'abc'", new String(out.toBytes("UTF-16"), "UTF-16"));
    }finally{__CLR4_1_101srx1srxlusqkk2t.R.flushNeeded();}}
    
    public void test_5 () throws Exception {__CLR4_1_101srx1srxlusqkk2t.R.globalSliceStart(getClass().getName(),83967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1ssf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101srx1srxlusqkk2t.R.rethrow($CLV_t2$);}finally{__CLR4_1_101srx1srxlusqkk2t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_1.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83967,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1ssf() throws Exception{try{__CLR4_1_101srx1srxlusqkk2t.R.inc(83967);
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83968);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83969);out.write((String) null);
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83970);Assert.assertEquals("null", new String(out.toBytes("UTF-16"), "UTF-16"));
    }finally{__CLR4_1_101srx1srxlusqkk2t.R.flushNeeded();}}
    
    public void test_6 () throws Exception {__CLR4_1_101srx1srxlusqkk2t.R.globalSliceStart(getClass().getName(),83971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81ssj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101srx1srxlusqkk2t.R.rethrow($CLV_t2$);}finally{__CLR4_1_101srx1srxlusqkk2t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_1.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83971,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81ssj() throws Exception{try{__CLR4_1_101srx1srxlusqkk2t.R.inc(83971);
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83972);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83973);out.writeString("\u4e2d\u6587");
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83974);Assert.assertEquals("\"\u4e2d\u6587\"", new String(out.toBytes("UTF-16"), "UTF-16"));
    }finally{__CLR4_1_101srx1srxlusqkk2t.R.flushNeeded();}}
    
    public void test_null () throws Exception {__CLR4_1_101srx1srxlusqkk2t.R.globalSliceStart(getClass().getName(),83975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1ssn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101srx1srxlusqkk2t.R.rethrow($CLV_t2$);}finally{__CLR4_1_101srx1srxlusqkk2t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_1.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83975,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1ssn() throws Exception{try{__CLR4_1_101srx1srxlusqkk2t.R.inc(83975);
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83976);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83977);out.writeString((String) null);
        __CLR4_1_101srx1srxlusqkk2t.R.inc(83978);Assert.assertEquals("null", new String(out.toBytes("UTF-16"), "UTF-16"));
    }finally{__CLR4_1_101srx1srxlusqkk2t.R.flushNeeded();}}
}
