/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.ref;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class RefTest2 extends TestCase {static class __CLR4_5_21q7z1q7zlusyjurb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,80667,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_ref() throws Exception {__CLR4_5_21q7z1q7zlusyjurb.R.globalSliceStart(getClass().getName(),80639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25mo1031q7z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q7z1q7zlusyjurb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q7z1q7zlusyjurb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest2.test_ref",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80639,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25mo1031q7z() throws Exception{try{__CLR4_5_21q7z1q7zlusyjurb.R.inc(80639);
        __CLR4_5_21q7z1q7zlusyjurb.R.inc(80640);Object[] array = new Object[1];
        __CLR4_5_21q7z1q7zlusyjurb.R.inc(80641);array[0] = array;
        __CLR4_5_21q7z1q7zlusyjurb.R.inc(80642);Assert.assertEquals("[{\"$ref\":\"@\"}]", JSON.toJSONString(array));
    }finally{__CLR4_5_21q7z1q7zlusyjurb.R.flushNeeded();}}

    public void test_ref_1() throws Exception {__CLR4_5_21q7z1q7zlusyjurb.R.globalSliceStart(getClass().getName(),80643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27k2ash1q83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q7z1q7zlusyjurb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q7z1q7zlusyjurb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest2.test_ref_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80643,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27k2ash1q83() throws Exception{try{__CLR4_5_21q7z1q7zlusyjurb.R.inc(80643);
        __CLR4_5_21q7z1q7zlusyjurb.R.inc(80644);Object[] array = new Object[3];
        __CLR4_5_21q7z1q7zlusyjurb.R.inc(80645);array[0] = array;
        __CLR4_5_21q7z1q7zlusyjurb.R.inc(80646);array[1] = new Object();
        __CLR4_5_21q7z1q7zlusyjurb.R.inc(80647);array[2] = new Object();
        __CLR4_5_21q7z1q7zlusyjurb.R.inc(80648);Assert.assertEquals("[{\"$ref\":\"@\"},{},{}]", JSON.toJSONString(array));
    }finally{__CLR4_5_21q7z1q7zlusyjurb.R.flushNeeded();}}

    public void test_ref_2() throws Exception {__CLR4_5_21q7z1q7zlusyjurb.R.globalSliceStart(getClass().getName(),80649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24b2c001q89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q7z1q7zlusyjurb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q7z1q7zlusyjurb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest2.test_ref_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80649,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24b2c001q89() throws Exception{try{__CLR4_5_21q7z1q7zlusyjurb.R.inc(80649);
        __CLR4_5_21q7z1q7zlusyjurb.R.inc(80650);Object[] array = new Object[3];
        __CLR4_5_21q7z1q7zlusyjurb.R.inc(80651);array[0] = new Object();
        __CLR4_5_21q7z1q7zlusyjurb.R.inc(80652);array[1] = array;
        __CLR4_5_21q7z1q7zlusyjurb.R.inc(80653);array[2] = new Object();
        __CLR4_5_21q7z1q7zlusyjurb.R.inc(80654);Assert.assertEquals("[{},{\"$ref\":\"@\"},{}]", JSON.toJSONString(array));
    }finally{__CLR4_5_21q7z1q7zlusyjurb.R.flushNeeded();}}

    public void test_ref_3() throws Exception {__CLR4_5_21q7z1q7zlusyjurb.R.globalSliceStart(getClass().getName(),80655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2122d7j1q8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q7z1q7zlusyjurb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q7z1q7zlusyjurb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest2.test_ref_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80655,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2122d7j1q8f() throws Exception{try{__CLR4_5_21q7z1q7zlusyjurb.R.inc(80655);
        __CLR4_5_21q7z1q7zlusyjurb.R.inc(80656);Object[] array = new Object[3];
        __CLR4_5_21q7z1q7zlusyjurb.R.inc(80657);array[0] = new Object();
        __CLR4_5_21q7z1q7zlusyjurb.R.inc(80658);array[1] = new Object();
        __CLR4_5_21q7z1q7zlusyjurb.R.inc(80659);array[2] = array;
        __CLR4_5_21q7z1q7zlusyjurb.R.inc(80660);Assert.assertEquals("[{},{},{\"$ref\":\"@\"}]", JSON.toJSONString(array));
    }finally{__CLR4_5_21q7z1q7zlusyjurb.R.flushNeeded();}}

    public void test_parse() throws Exception {__CLR4_5_21q7z1q7zlusyjurb.R.globalSliceStart(getClass().getName(),80661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g914tv1q8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q7z1q7zlusyjurb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q7z1q7zlusyjurb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest2.test_parse",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80661,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g914tv1q8l() throws Exception{try{__CLR4_5_21q7z1q7zlusyjurb.R.inc(80661);
        __CLR4_5_21q7z1q7zlusyjurb.R.inc(80662);Object[] array2 = JSON.parseObject("[{\"$ref\":\"$\"}]", Object[].class);
        __CLR4_5_21q7z1q7zlusyjurb.R.inc(80663);Assert.assertSame(array2, array2[0]);
    }finally{__CLR4_5_21q7z1q7zlusyjurb.R.flushNeeded();}}

    public void test_parse_1() throws Exception {__CLR4_5_21q7z1q7zlusyjurb.R.globalSliceStart(getClass().getName(),80664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dwafr31q8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q7z1q7zlusyjurb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q7z1q7zlusyjurb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest2.test_parse_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80664,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dwafr31q8o() throws Exception{try{__CLR4_5_21q7z1q7zlusyjurb.R.inc(80664);
        __CLR4_5_21q7z1q7zlusyjurb.R.inc(80665);Object[] array2 = JSON.parseObject("[{\"$ref\":\"@\"}]", Object[].class);
        __CLR4_5_21q7z1q7zlusyjurb.R.inc(80666);Assert.assertSame(array2, array2[0]);
    }finally{__CLR4_5_21q7z1q7zlusyjurb.R.flushNeeded();}}
}
