/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;
import java.nio.charset.Charset;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.serializer.SerializeWriter;

public class SerializeWriterTest_9 extends TestCase {static class __CLR4_1_101t391t39lusqkk6e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,84397,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_error() throws Exception {__CLR4_1_101t391t39lusqkk6e.R.globalSliceStart(getClass().getName(),84357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1t39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t391t39lusqkk6e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t391t39lusqkk6e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_9.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84357,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1t39() throws Exception{try{__CLR4_1_101t391t39lusqkk6e.R.inc(84357);
        __CLR4_1_101t391t39lusqkk6e.R.inc(84358);SerializeWriter writer = new SerializeWriter(new StringWriter());
        __CLR4_1_101t391t39lusqkk6e.R.inc(84359);Exception error = null;
        __CLR4_1_101t391t39lusqkk6e.R.inc(84360);try {
            __CLR4_1_101t391t39lusqkk6e.R.inc(84361);writer.writeTo(new StringWriter());
        } catch (Exception ex) {
            __CLR4_1_101t391t39lusqkk6e.R.inc(84362);error = ex;
        }
        __CLR4_1_101t391t39lusqkk6e.R.inc(84363);Assert.assertNotNull(error);
        __CLR4_1_101t391t39lusqkk6e.R.inc(84364);writer.close();
    }finally{__CLR4_1_101t391t39lusqkk6e.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101t391t39lusqkk6e.R.globalSliceStart(getClass().getName(),84365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1t3h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t391t39lusqkk6e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t391t39lusqkk6e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_9.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84365,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1t3h() throws Exception{try{__CLR4_1_101t391t39lusqkk6e.R.inc(84365);
        __CLR4_1_101t391t39lusqkk6e.R.inc(84366);SerializeWriter writer = new SerializeWriter(new StringWriter());
        __CLR4_1_101t391t39lusqkk6e.R.inc(84367);Exception error = null;
        __CLR4_1_101t391t39lusqkk6e.R.inc(84368);try {
            __CLR4_1_101t391t39lusqkk6e.R.inc(84369);writer.writeTo(new ByteArrayOutputStream(), Charset.forName("UTF-8"));
        } catch (Exception ex) {
            __CLR4_1_101t391t39lusqkk6e.R.inc(84370);error = ex;
        }
        __CLR4_1_101t391t39lusqkk6e.R.inc(84371);Assert.assertNotNull(error);
        __CLR4_1_101t391t39lusqkk6e.R.inc(84372);writer.close();
    }finally{__CLR4_1_101t391t39lusqkk6e.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_1_101t391t39lusqkk6e.R.globalSliceStart(getClass().getName(),84373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1t3p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t391t39lusqkk6e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t391t39lusqkk6e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_9.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84373,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1t3p() throws Exception{try{__CLR4_1_101t391t39lusqkk6e.R.inc(84373);
        __CLR4_1_101t391t39lusqkk6e.R.inc(84374);SerializeWriter writer = new SerializeWriter(new StringWriter());
        __CLR4_1_101t391t39lusqkk6e.R.inc(84375);Exception error = null;
        __CLR4_1_101t391t39lusqkk6e.R.inc(84376);try {
            __CLR4_1_101t391t39lusqkk6e.R.inc(84377);writer.writeTo(new ByteArrayOutputStream(), "UTF-8");
        } catch (Exception ex) {
            __CLR4_1_101t391t39lusqkk6e.R.inc(84378);error = ex;
        }
        __CLR4_1_101t391t39lusqkk6e.R.inc(84379);Assert.assertNotNull(error);
        __CLR4_1_101t391t39lusqkk6e.R.inc(84380);writer.close();
    }finally{__CLR4_1_101t391t39lusqkk6e.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_1_101t391t39lusqkk6e.R.globalSliceStart(getClass().getName(),84381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1t3x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t391t39lusqkk6e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t391t39lusqkk6e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_9.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84381,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1t3x() throws Exception{try{__CLR4_1_101t391t39lusqkk6e.R.inc(84381);
        __CLR4_1_101t391t39lusqkk6e.R.inc(84382);SerializeWriter writer = new SerializeWriter(new StringWriter());
        __CLR4_1_101t391t39lusqkk6e.R.inc(84383);Exception error = null;
        __CLR4_1_101t391t39lusqkk6e.R.inc(84384);try {
            __CLR4_1_101t391t39lusqkk6e.R.inc(84385);writer.toCharArray();
        } catch (Exception ex) {
            __CLR4_1_101t391t39lusqkk6e.R.inc(84386);error = ex;
        }
        __CLR4_1_101t391t39lusqkk6e.R.inc(84387);Assert.assertNotNull(error);
        __CLR4_1_101t391t39lusqkk6e.R.inc(84388);writer.close();
    }finally{__CLR4_1_101t391t39lusqkk6e.R.flushNeeded();}}
    
    public void test_error_5() throws Exception {__CLR4_1_101t391t39lusqkk6e.R.globalSliceStart(getClass().getName(),84389);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v9cbw81t45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t391t39lusqkk6e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t391t39lusqkk6e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_9.test_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84389,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v9cbw81t45() throws Exception{try{__CLR4_1_101t391t39lusqkk6e.R.inc(84389);
        __CLR4_1_101t391t39lusqkk6e.R.inc(84390);SerializeWriter writer = new SerializeWriter(new StringWriter());
        __CLR4_1_101t391t39lusqkk6e.R.inc(84391);Exception error = null;
        __CLR4_1_101t391t39lusqkk6e.R.inc(84392);try {
            __CLR4_1_101t391t39lusqkk6e.R.inc(84393);writer.toBytes("UTF-8");
        } catch (Exception ex) {
            __CLR4_1_101t391t39lusqkk6e.R.inc(84394);error = ex;
        }
        __CLR4_1_101t391t39lusqkk6e.R.inc(84395);Assert.assertNotNull(error);
        __CLR4_1_101t391t39lusqkk6e.R.inc(84396);writer.close();
    }finally{__CLR4_1_101t391t39lusqkk6e.R.flushNeeded();}}
}
