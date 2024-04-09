/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class Bug_7 extends TestCase {static class __CLR4_5_213s813s8lusvn58p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,51590,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_floatArray() throws Exception {__CLR4_5_213s813s8lusvn58p.R.globalSliceStart(getClass().getName(),51560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j6cibz13s8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213s813s8lusvn58p.R.rethrow($CLV_t2$);}finally{__CLR4_5_213s813s8lusvn58p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_7.test_floatArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51560,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j6cibz13s8() throws Exception{try{__CLR4_5_213s813s8lusvn58p.R.inc(51560);
        __CLR4_5_213s813s8lusvn58p.R.inc(51561);float[] a = new float[] { 1, 2 };
        __CLR4_5_213s813s8lusvn58p.R.inc(51562);String text = JSON.toJSONString(a);
        __CLR4_5_213s813s8lusvn58p.R.inc(51563);JSON json = (JSON) JSON.parse(text);
        __CLR4_5_213s813s8lusvn58p.R.inc(51564);Assert.assertEquals("[1.0,2.0]", json.toJSONString());
    }finally{__CLR4_5_213s813s8lusvn58p.R.flushNeeded();}}

    public void test_doubleArray() throws Exception {__CLR4_5_213s813s8lusvn58p.R.globalSliceStart(getClass().getName(),51565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23p8zwi13sd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213s813s8lusvn58p.R.rethrow($CLV_t2$);}finally{__CLR4_5_213s813s8lusvn58p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_7.test_doubleArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51565,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23p8zwi13sd() throws Exception{try{__CLR4_5_213s813s8lusvn58p.R.inc(51565);
        __CLR4_5_213s813s8lusvn58p.R.inc(51566);double[] a = new double[] { 1, 2 };
        __CLR4_5_213s813s8lusvn58p.R.inc(51567);String text = JSON.toJSONString(a);
        __CLR4_5_213s813s8lusvn58p.R.inc(51568);JSON json = (JSON) JSON.parse(text);
        __CLR4_5_213s813s8lusvn58p.R.inc(51569);Assert.assertEquals("[1.0,2.0]", json.toJSONString());
    }finally{__CLR4_5_213s813s8lusvn58p.R.flushNeeded();}}

    public void test_bigintegerArray() throws Exception {__CLR4_5_213s813s8lusvn58p.R.globalSliceStart(getClass().getName(),51570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21j17yt13si();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213s813s8lusvn58p.R.rethrow($CLV_t2$);}finally{__CLR4_5_213s813s8lusvn58p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_7.test_bigintegerArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51570,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21j17yt13si() throws Exception{try{__CLR4_5_213s813s8lusvn58p.R.inc(51570);
        __CLR4_5_213s813s8lusvn58p.R.inc(51571);BigInteger[] a = new BigInteger[] { new BigInteger("214748364812"), new BigInteger("2147483648123") };
        __CLR4_5_213s813s8lusvn58p.R.inc(51572);String text = JSON.toJSONString(a);
        __CLR4_5_213s813s8lusvn58p.R.inc(51573);Assert.assertEquals("[214748364812,2147483648123]", text);
        __CLR4_5_213s813s8lusvn58p.R.inc(51574);JSON json = (JSON) JSON.parse(text);
        __CLR4_5_213s813s8lusvn58p.R.inc(51575);Assert.assertEquals("[214748364812,2147483648123]", json.toJSONString());
    }finally{__CLR4_5_213s813s8lusvn58p.R.flushNeeded();}}

    public void test_AtomicIntegerArray() throws Exception {__CLR4_5_213s813s8lusvn58p.R.globalSliceStart(getClass().getName(),51576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d2fcka13so();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213s813s8lusvn58p.R.rethrow($CLV_t2$);}finally{__CLR4_5_213s813s8lusvn58p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_7.test_AtomicIntegerArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51576,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d2fcka13so() throws Exception{try{__CLR4_5_213s813s8lusvn58p.R.inc(51576);
        __CLR4_5_213s813s8lusvn58p.R.inc(51577);AtomicIntegerArray array = new AtomicIntegerArray(3);
        __CLR4_5_213s813s8lusvn58p.R.inc(51578);array.set(0, 1);
        __CLR4_5_213s813s8lusvn58p.R.inc(51579);array.set(1, 2);
        __CLR4_5_213s813s8lusvn58p.R.inc(51580);array.set(2, 3);
        __CLR4_5_213s813s8lusvn58p.R.inc(51581);String text = JSON.toJSONString(array);
        __CLR4_5_213s813s8lusvn58p.R.inc(51582);Assert.assertEquals("[1,2,3]", text);
    }finally{__CLR4_5_213s813s8lusvn58p.R.flushNeeded();}}

    public void test_AtomicLongArray() throws Exception {__CLR4_5_213s813s8lusvn58p.R.globalSliceStart(getClass().getName(),51583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kvwzbo13sv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213s813s8lusvn58p.R.rethrow($CLV_t2$);}finally{__CLR4_5_213s813s8lusvn58p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_7.test_AtomicLongArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51583,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kvwzbo13sv() throws Exception{try{__CLR4_5_213s813s8lusvn58p.R.inc(51583);
        __CLR4_5_213s813s8lusvn58p.R.inc(51584);AtomicLongArray array = new AtomicLongArray(3);
        __CLR4_5_213s813s8lusvn58p.R.inc(51585);array.set(0, 1);
        __CLR4_5_213s813s8lusvn58p.R.inc(51586);array.set(1, 2);
        __CLR4_5_213s813s8lusvn58p.R.inc(51587);array.set(2, 3);
        __CLR4_5_213s813s8lusvn58p.R.inc(51588);String text = JSON.toJSONString(array);
        __CLR4_5_213s813s8lusvn58p.R.inc(51589);Assert.assertEquals("[1,2,3]", text);
    }finally{__CLR4_5_213s813s8lusvn58p.R.flushNeeded();}}
}
   
