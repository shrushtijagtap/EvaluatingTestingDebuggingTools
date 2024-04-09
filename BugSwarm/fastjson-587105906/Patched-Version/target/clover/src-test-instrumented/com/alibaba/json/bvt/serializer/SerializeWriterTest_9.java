/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;
import java.nio.charset.Charset;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.serializer.SerializeWriter;

public class SerializeWriterTest_9 extends TestCase {static class __CLR4_5_21u161u16lusvngk1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,85618,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_error() throws Exception {__CLR4_5_21u161u16lusvngk1.R.globalSliceStart(getClass().getName(),85578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1u16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u161u16lusvngk1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u161u16lusvngk1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_9.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85578,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1u16() throws Exception{try{__CLR4_5_21u161u16lusvngk1.R.inc(85578);
        __CLR4_5_21u161u16lusvngk1.R.inc(85579);SerializeWriter writer = new SerializeWriter(new StringWriter());
        __CLR4_5_21u161u16lusvngk1.R.inc(85580);Exception error = null;
        __CLR4_5_21u161u16lusvngk1.R.inc(85581);try {
            __CLR4_5_21u161u16lusvngk1.R.inc(85582);writer.writeTo(new StringWriter());
        } catch (Exception ex) {
            __CLR4_5_21u161u16lusvngk1.R.inc(85583);error = ex;
        }
        __CLR4_5_21u161u16lusvngk1.R.inc(85584);Assert.assertNotNull(error);
        __CLR4_5_21u161u16lusvngk1.R.inc(85585);writer.close();
    }finally{__CLR4_5_21u161u16lusvngk1.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21u161u16lusvngk1.R.globalSliceStart(getClass().getName(),85586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1u1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u161u16lusvngk1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u161u16lusvngk1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_9.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85586,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1u1e() throws Exception{try{__CLR4_5_21u161u16lusvngk1.R.inc(85586);
        __CLR4_5_21u161u16lusvngk1.R.inc(85587);SerializeWriter writer = new SerializeWriter(new StringWriter());
        __CLR4_5_21u161u16lusvngk1.R.inc(85588);Exception error = null;
        __CLR4_5_21u161u16lusvngk1.R.inc(85589);try {
            __CLR4_5_21u161u16lusvngk1.R.inc(85590);writer.writeTo(new ByteArrayOutputStream(), Charset.forName("UTF-8"));
        } catch (Exception ex) {
            __CLR4_5_21u161u16lusvngk1.R.inc(85591);error = ex;
        }
        __CLR4_5_21u161u16lusvngk1.R.inc(85592);Assert.assertNotNull(error);
        __CLR4_5_21u161u16lusvngk1.R.inc(85593);writer.close();
    }finally{__CLR4_5_21u161u16lusvngk1.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_5_21u161u16lusvngk1.R.globalSliceStart(getClass().getName(),85594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1u1m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u161u16lusvngk1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u161u16lusvngk1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_9.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85594,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1u1m() throws Exception{try{__CLR4_5_21u161u16lusvngk1.R.inc(85594);
        __CLR4_5_21u161u16lusvngk1.R.inc(85595);SerializeWriter writer = new SerializeWriter(new StringWriter());
        __CLR4_5_21u161u16lusvngk1.R.inc(85596);Exception error = null;
        __CLR4_5_21u161u16lusvngk1.R.inc(85597);try {
            __CLR4_5_21u161u16lusvngk1.R.inc(85598);writer.writeTo(new ByteArrayOutputStream(), "UTF-8");
        } catch (Exception ex) {
            __CLR4_5_21u161u16lusvngk1.R.inc(85599);error = ex;
        }
        __CLR4_5_21u161u16lusvngk1.R.inc(85600);Assert.assertNotNull(error);
        __CLR4_5_21u161u16lusvngk1.R.inc(85601);writer.close();
    }finally{__CLR4_5_21u161u16lusvngk1.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_5_21u161u16lusvngk1.R.globalSliceStart(getClass().getName(),85602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1u1u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u161u16lusvngk1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u161u16lusvngk1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_9.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85602,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1u1u() throws Exception{try{__CLR4_5_21u161u16lusvngk1.R.inc(85602);
        __CLR4_5_21u161u16lusvngk1.R.inc(85603);SerializeWriter writer = new SerializeWriter(new StringWriter());
        __CLR4_5_21u161u16lusvngk1.R.inc(85604);Exception error = null;
        __CLR4_5_21u161u16lusvngk1.R.inc(85605);try {
            __CLR4_5_21u161u16lusvngk1.R.inc(85606);writer.toCharArray();
        } catch (Exception ex) {
            __CLR4_5_21u161u16lusvngk1.R.inc(85607);error = ex;
        }
        __CLR4_5_21u161u16lusvngk1.R.inc(85608);Assert.assertNotNull(error);
        __CLR4_5_21u161u16lusvngk1.R.inc(85609);writer.close();
    }finally{__CLR4_5_21u161u16lusvngk1.R.flushNeeded();}}
    
    public void test_error_5() throws Exception {__CLR4_5_21u161u16lusvngk1.R.globalSliceStart(getClass().getName(),85610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw81u22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u161u16lusvngk1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u161u16lusvngk1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_9.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85610,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw81u22() throws Exception{try{__CLR4_5_21u161u16lusvngk1.R.inc(85610);
        __CLR4_5_21u161u16lusvngk1.R.inc(85611);SerializeWriter writer = new SerializeWriter(new StringWriter());
        __CLR4_5_21u161u16lusvngk1.R.inc(85612);Exception error = null;
        __CLR4_5_21u161u16lusvngk1.R.inc(85613);try {
            __CLR4_5_21u161u16lusvngk1.R.inc(85614);writer.toBytes("UTF-8");
        } catch (Exception ex) {
            __CLR4_5_21u161u16lusvngk1.R.inc(85615);error = ex;
        }
        __CLR4_5_21u161u16lusvngk1.R.inc(85616);Assert.assertNotNull(error);
        __CLR4_5_21u161u16lusvngk1.R.inc(85617);writer.close();
    }finally{__CLR4_5_21u161u16lusvngk1.R.flushNeeded();}}
}
