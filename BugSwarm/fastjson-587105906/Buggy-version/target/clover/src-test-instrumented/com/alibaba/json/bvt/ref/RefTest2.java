/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.ref;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class RefTest2 extends TestCase {static class __CLR4_1_101q8a1q8alusqkj19{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,80678,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_ref() throws Exception {__CLR4_1_101q8a1q8alusqkj19.R.globalSliceStart(getClass().getName(),80650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105mo1031q8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q8a1q8alusqkj19.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q8a1q8alusqkj19.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest2.test_ref",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80650,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105mo1031q8a() throws Exception{try{__CLR4_1_101q8a1q8alusqkj19.R.inc(80650);
        __CLR4_1_101q8a1q8alusqkj19.R.inc(80651);Object[] array = new Object[1];
        __CLR4_1_101q8a1q8alusqkj19.R.inc(80652);array[0] = array;
        __CLR4_1_101q8a1q8alusqkj19.R.inc(80653);Assert.assertEquals("[{\"$ref\":\"@\"}]", JSON.toJSONString(array));
    }finally{__CLR4_1_101q8a1q8alusqkj19.R.flushNeeded();}}

    public void test_ref_1() throws Exception {__CLR4_1_101q8a1q8alusqkj19.R.globalSliceStart(getClass().getName(),80654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107k2ash1q8e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q8a1q8alusqkj19.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q8a1q8alusqkj19.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest2.test_ref_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80654,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107k2ash1q8e() throws Exception{try{__CLR4_1_101q8a1q8alusqkj19.R.inc(80654);
        __CLR4_1_101q8a1q8alusqkj19.R.inc(80655);Object[] array = new Object[3];
        __CLR4_1_101q8a1q8alusqkj19.R.inc(80656);array[0] = array;
        __CLR4_1_101q8a1q8alusqkj19.R.inc(80657);array[1] = new Object();
        __CLR4_1_101q8a1q8alusqkj19.R.inc(80658);array[2] = new Object();
        __CLR4_1_101q8a1q8alusqkj19.R.inc(80659);Assert.assertEquals("[{\"$ref\":\"@\"},{},{}]", JSON.toJSONString(array));
    }finally{__CLR4_1_101q8a1q8alusqkj19.R.flushNeeded();}}

    public void test_ref_2() throws Exception {__CLR4_1_101q8a1q8alusqkj19.R.globalSliceStart(getClass().getName(),80660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104b2c001q8k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q8a1q8alusqkj19.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q8a1q8alusqkj19.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest2.test_ref_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80660,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104b2c001q8k() throws Exception{try{__CLR4_1_101q8a1q8alusqkj19.R.inc(80660);
        __CLR4_1_101q8a1q8alusqkj19.R.inc(80661);Object[] array = new Object[3];
        __CLR4_1_101q8a1q8alusqkj19.R.inc(80662);array[0] = new Object();
        __CLR4_1_101q8a1q8alusqkj19.R.inc(80663);array[1] = array;
        __CLR4_1_101q8a1q8alusqkj19.R.inc(80664);array[2] = new Object();
        __CLR4_1_101q8a1q8alusqkj19.R.inc(80665);Assert.assertEquals("[{},{\"$ref\":\"@\"},{}]", JSON.toJSONString(array));
    }finally{__CLR4_1_101q8a1q8alusqkj19.R.flushNeeded();}}

    public void test_ref_3() throws Exception {__CLR4_1_101q8a1q8alusqkj19.R.globalSliceStart(getClass().getName(),80666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10122d7j1q8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q8a1q8alusqkj19.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q8a1q8alusqkj19.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest2.test_ref_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80666,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10122d7j1q8q() throws Exception{try{__CLR4_1_101q8a1q8alusqkj19.R.inc(80666);
        __CLR4_1_101q8a1q8alusqkj19.R.inc(80667);Object[] array = new Object[3];
        __CLR4_1_101q8a1q8alusqkj19.R.inc(80668);array[0] = new Object();
        __CLR4_1_101q8a1q8alusqkj19.R.inc(80669);array[1] = new Object();
        __CLR4_1_101q8a1q8alusqkj19.R.inc(80670);array[2] = array;
        __CLR4_1_101q8a1q8alusqkj19.R.inc(80671);Assert.assertEquals("[{},{},{\"$ref\":\"@\"}]", JSON.toJSONString(array));
    }finally{__CLR4_1_101q8a1q8alusqkj19.R.flushNeeded();}}

    public void test_parse() throws Exception {__CLR4_1_101q8a1q8alusqkj19.R.globalSliceStart(getClass().getName(),80672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g914tv1q8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q8a1q8alusqkj19.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q8a1q8alusqkj19.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest2.test_parse",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80672,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g914tv1q8w() throws Exception{try{__CLR4_1_101q8a1q8alusqkj19.R.inc(80672);
        __CLR4_1_101q8a1q8alusqkj19.R.inc(80673);Object[] array2 = JSON.parseObject("[{\"$ref\":\"$\"}]", Object[].class);
        __CLR4_1_101q8a1q8alusqkj19.R.inc(80674);Assert.assertSame(array2, array2[0]);
    }finally{__CLR4_1_101q8a1q8alusqkj19.R.flushNeeded();}}

    public void test_parse_1() throws Exception {__CLR4_1_101q8a1q8alusqkj19.R.globalSliceStart(getClass().getName(),80675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dwafr31q8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q8a1q8alusqkj19.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q8a1q8alusqkj19.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest2.test_parse_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80675,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dwafr31q8z() throws Exception{try{__CLR4_1_101q8a1q8alusqkj19.R.inc(80675);
        __CLR4_1_101q8a1q8alusqkj19.R.inc(80676);Object[] array2 = JSON.parseObject("[{\"$ref\":\"@\"}]", Object[].class);
        __CLR4_1_101q8a1q8alusqkj19.R.inc(80677);Assert.assertSame(array2, array2[0]);
    }finally{__CLR4_1_101q8a1q8alusqkj19.R.flushNeeded();}}
}
