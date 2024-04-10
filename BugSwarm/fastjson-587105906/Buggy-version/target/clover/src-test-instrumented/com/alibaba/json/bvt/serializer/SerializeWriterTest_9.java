/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;
import java.nio.charset.Charset;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.serializer.SerializeWriter;

public class SerializeWriterTest_9 extends TestCase {static class __CLR4_1_101u1h1u1hluszwf78{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,85629,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_error() throws Exception {__CLR4_1_101u1h1u1hluszwf78.R.globalSliceStart(getClass().getName(),85589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1u1h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u1h1u1hluszwf78.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u1h1u1hluszwf78.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_9.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85589,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1u1h() throws Exception{try{__CLR4_1_101u1h1u1hluszwf78.R.inc(85589);
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85590);SerializeWriter writer = new SerializeWriter(new StringWriter());
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85591);Exception error = null;
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85592);try {
            __CLR4_1_101u1h1u1hluszwf78.R.inc(85593);writer.writeTo(new StringWriter());
        } catch (Exception ex) {
            __CLR4_1_101u1h1u1hluszwf78.R.inc(85594);error = ex;
        }
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85595);Assert.assertNotNull(error);
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85596);writer.close();
    }finally{__CLR4_1_101u1h1u1hluszwf78.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101u1h1u1hluszwf78.R.globalSliceStart(getClass().getName(),85597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1u1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u1h1u1hluszwf78.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u1h1u1hluszwf78.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_9.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85597,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1u1p() throws Exception{try{__CLR4_1_101u1h1u1hluszwf78.R.inc(85597);
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85598);SerializeWriter writer = new SerializeWriter(new StringWriter());
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85599);Exception error = null;
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85600);try {
            __CLR4_1_101u1h1u1hluszwf78.R.inc(85601);writer.writeTo(new ByteArrayOutputStream(), Charset.forName("UTF-8"));
        } catch (Exception ex) {
            __CLR4_1_101u1h1u1hluszwf78.R.inc(85602);error = ex;
        }
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85603);Assert.assertNotNull(error);
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85604);writer.close();
    }finally{__CLR4_1_101u1h1u1hluszwf78.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_1_101u1h1u1hluszwf78.R.globalSliceStart(getClass().getName(),85605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1u1x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u1h1u1hluszwf78.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u1h1u1hluszwf78.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_9.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85605,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1u1x() throws Exception{try{__CLR4_1_101u1h1u1hluszwf78.R.inc(85605);
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85606);SerializeWriter writer = new SerializeWriter(new StringWriter());
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85607);Exception error = null;
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85608);try {
            __CLR4_1_101u1h1u1hluszwf78.R.inc(85609);writer.writeTo(new ByteArrayOutputStream(), "UTF-8");
        } catch (Exception ex) {
            __CLR4_1_101u1h1u1hluszwf78.R.inc(85610);error = ex;
        }
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85611);Assert.assertNotNull(error);
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85612);writer.close();
    }finally{__CLR4_1_101u1h1u1hluszwf78.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_1_101u1h1u1hluszwf78.R.globalSliceStart(getClass().getName(),85613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1u25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u1h1u1hluszwf78.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u1h1u1hluszwf78.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_9.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85613,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1u25() throws Exception{try{__CLR4_1_101u1h1u1hluszwf78.R.inc(85613);
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85614);SerializeWriter writer = new SerializeWriter(new StringWriter());
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85615);Exception error = null;
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85616);try {
            __CLR4_1_101u1h1u1hluszwf78.R.inc(85617);writer.toCharArray();
        } catch (Exception ex) {
            __CLR4_1_101u1h1u1hluszwf78.R.inc(85618);error = ex;
        }
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85619);Assert.assertNotNull(error);
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85620);writer.close();
    }finally{__CLR4_1_101u1h1u1hluszwf78.R.flushNeeded();}}
    
    public void test_error_5() throws Exception {__CLR4_1_101u1h1u1hluszwf78.R.globalSliceStart(getClass().getName(),85621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v9cbw81u2d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u1h1u1hluszwf78.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u1h1u1hluszwf78.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_9.test_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85621,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v9cbw81u2d() throws Exception{try{__CLR4_1_101u1h1u1hluszwf78.R.inc(85621);
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85622);SerializeWriter writer = new SerializeWriter(new StringWriter());
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85623);Exception error = null;
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85624);try {
            __CLR4_1_101u1h1u1hluszwf78.R.inc(85625);writer.toBytes("UTF-8");
        } catch (Exception ex) {
            __CLR4_1_101u1h1u1hluszwf78.R.inc(85626);error = ex;
        }
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85627);Assert.assertNotNull(error);
        __CLR4_1_101u1h1u1hluszwf78.R.inc(85628);writer.close();
    }finally{__CLR4_1_101u1h1u1hluszwf78.R.flushNeeded();}}
}
