/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;

import junit.framework.TestCase;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

public class JSONTest2 extends TestCase {static class __CLR4_1_10y84y84luszw5m2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,44403,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_10y84y84luszw5m2.R.globalSliceStart(getClass().getName(),44356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp2y84();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y84y84luszw5m2.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y84y84luszw5m2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest2.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44356,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp2y84() throws Exception{try{__CLR4_1_10y84y84luszw5m2.R.inc(44356);
        __CLR4_1_10y84y84luszw5m2.R.inc(44357);StringReader reader = new StringReader("{a:1,b:2}");
        __CLR4_1_10y84y84luszw5m2.R.inc(44358);String text = IOUtils.toString(reader);
        __CLR4_1_10y84y84luszw5m2.R.inc(44359);JSONObject json = (JSONObject) JSON.parse(text);
        __CLR4_1_10y84y84luszw5m2.R.inc(44360);Assert.assertEquals(2, json.size());
        __CLR4_1_10y84y84luszw5m2.R.inc(44361);Assert.assertEquals(1, json.getIntValue("a"));
        __CLR4_1_10y84y84luszw5m2.R.inc(44362);Assert.assertEquals(2, json.getIntValue("b"));
    }finally{__CLR4_1_10y84y84luszw5m2.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_10y84y84luszw5m2.R.globalSliceStart(getClass().getName(),44363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwly8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y84y84luszw5m2.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y84y84luszw5m2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest2.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44363,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwly8b() throws Exception{try{__CLR4_1_10y84y84luszw5m2.R.inc(44363);
        __CLR4_1_10y84y84luszw5m2.R.inc(44364);InputStream input = new ByteArrayInputStream("{a:1,b:2}".getBytes());
        __CLR4_1_10y84y84luszw5m2.R.inc(44365);String text = IOUtils.toString(input);
        __CLR4_1_10y84y84luszw5m2.R.inc(44366);JSONObject json = (JSONObject) JSON.parse(text);
        __CLR4_1_10y84y84luszw5m2.R.inc(44367);Assert.assertEquals(2, json.size());
        __CLR4_1_10y84y84luszw5m2.R.inc(44368);Assert.assertEquals(1, json.getIntValue("a"));
        __CLR4_1_10y84y84luszw5m2.R.inc(44369);Assert.assertEquals(2, json.getIntValue("b"));
    }finally{__CLR4_1_10y84y84luszw5m2.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_10y84y84luszw5m2.R.globalSliceStart(getClass().getName(),44370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k44y8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y84y84luszw5m2.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y84y84luszw5m2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest2.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44370,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k44y8i() throws Exception{try{__CLR4_1_10y84y84luszw5m2.R.inc(44370);
        __CLR4_1_10y84y84luszw5m2.R.inc(44371);Assert.assertEquals(new Byte((byte) 1), JSON.parseObject("1", Byte.class));
        __CLR4_1_10y84y84luszw5m2.R.inc(44372);Assert.assertEquals(new Short((short) 1), JSON.parseObject("1", Short.class));
        __CLR4_1_10y84y84luszw5m2.R.inc(44373);Assert.assertEquals(new Integer((int) 1), JSON.parseObject("1", Integer.class));
        __CLR4_1_10y84y84luszw5m2.R.inc(44374);Assert.assertEquals(new Long((long) 1), JSON.parseObject("1", Long.class));
        __CLR4_1_10y84y84luszw5m2.R.inc(44375);Assert.assertEquals(new Float((float) 1), JSON.parseObject("1", Float.class));
        __CLR4_1_10y84y84luszw5m2.R.inc(44376);Assert.assertEquals(new Double((double) 1), JSON.parseObject("1", Double.class));
    }finally{__CLR4_1_10y84y84luszw5m2.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_10y84y84luszw5m2.R.globalSliceStart(getClass().getName(),44377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbny8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y84y84luszw5m2.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y84y84luszw5m2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest2.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44377,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbny8p() throws Exception{try{__CLR4_1_10y84y84luszw5m2.R.inc(44377);
        __CLR4_1_10y84y84luszw5m2.R.inc(44378);Assert.assertEquals(new Byte((byte) 1), JSON.parseObject("1", byte.class));
        __CLR4_1_10y84y84luszw5m2.R.inc(44379);Assert.assertEquals(new Short((short) 1), JSON.parseObject("1", short.class));
        __CLR4_1_10y84y84luszw5m2.R.inc(44380);Assert.assertEquals(new Integer((int) 1), JSON.parseObject("1", int.class));
        __CLR4_1_10y84y84luszw5m2.R.inc(44381);Assert.assertEquals(new Long((long) 1), JSON.parseObject("1", long.class));
        __CLR4_1_10y84y84luszw5m2.R.inc(44382);Assert.assertEquals(new Float((float) 1), JSON.parseObject("1", float.class));
        __CLR4_1_10y84y84luszw5m2.R.inc(44383);Assert.assertEquals(new Double((double) 1), JSON.parseObject("1", double.class));
    }finally{__CLR4_1_10y84y84luszw5m2.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_10y84y84luszw5m2.R.globalSliceStart(getClass().getName(),44384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj6y8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y84y84luszw5m2.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y84y84luszw5m2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest2.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44384,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj6y8w() throws Exception{try{__CLR4_1_10y84y84luszw5m2.R.inc(44384);
        __CLR4_1_10y84y84luszw5m2.R.inc(44385);Assert.assertEquals(new BigInteger("1"), JSON.parseObject("1", BigInteger.class));
        __CLR4_1_10y84y84luszw5m2.R.inc(44386);Assert.assertEquals(new BigDecimal("1"), JSON.parseObject("1", BigDecimal.class));
    }finally{__CLR4_1_10y84y84luszw5m2.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_10y84y84luszw5m2.R.globalSliceStart(getClass().getName(),44387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqpy8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y84y84luszw5m2.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y84y84luszw5m2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest2.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44387,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqpy8z() throws Exception{try{__CLR4_1_10y84y84luszw5m2.R.inc(44387);
        __CLR4_1_10y84y84luszw5m2.R.inc(44388);Assert.assertArrayEquals(new byte[] { 1 }, (byte[]) JSON.parseObject("[1]", byte[].class));
        __CLR4_1_10y84y84luszw5m2.R.inc(44389);Assert.assertArrayEquals(new short[] { 1 }, (short[]) JSON.parseObject("[1]", short[].class));
        __CLR4_1_10y84y84luszw5m2.R.inc(44390);Assert.assertArrayEquals(new int[] { 1 }, (int[]) JSON.parseObject("[1]", int[].class));
        __CLR4_1_10y84y84luszw5m2.R.inc(44391);Assert.assertArrayEquals(new long[] { 1 }, (long[]) JSON.parseObject("[1]", long[].class));
        __CLR4_1_10y84y84luszw5m2.R.inc(44392);float[] array1 = JSON.parseObject("[1]", float[].class);
        __CLR4_1_10y84y84luszw5m2.R.inc(44393);double[] array2 = JSON.parseObject("[1]", double[].class);
    }finally{__CLR4_1_10y84y84luszw5m2.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_10y84y84luszw5m2.R.globalSliceStart(getClass().getName(),44394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy8y96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y84y84luszw5m2.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y84y84luszw5m2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest2.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44394,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy8y96() throws Exception{try{__CLR4_1_10y84y84luszw5m2.R.inc(44394);
        __CLR4_1_10y84y84luszw5m2.R.inc(44395);Assert.assertArrayEquals(new Byte[] { 1 }, (Byte[]) JSON.parseObject("[1]", Byte[].class));
        __CLR4_1_10y84y84luszw5m2.R.inc(44396);Assert.assertArrayEquals(new Short[] { 1 }, (Short[]) JSON.parseObject("[1]", Short[].class));
        __CLR4_1_10y84y84luszw5m2.R.inc(44397);Assert.assertArrayEquals(new Integer[] { 1 }, (Integer[]) JSON.parseObject("[1]", Integer[].class));
        __CLR4_1_10y84y84luszw5m2.R.inc(44398);Assert.assertArrayEquals(new Long[] { 1L }, (Long[]) JSON.parseObject("[1]", Long[].class));
        __CLR4_1_10y84y84luszw5m2.R.inc(44399);Float[] array1 = JSON.parseObject("[1]", Float[].class);
        __CLR4_1_10y84y84luszw5m2.R.inc(44400);Double[] array2 = JSON.parseObject("[1]", Double[].class);
    }finally{__CLR4_1_10y84y84luszw5m2.R.flushNeeded();}}
    
    public void test_7() throws Exception {__CLR4_1_10y84y84luszw5m2.R.globalSliceStart(getClass().getName(),44401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5ry9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y84y84luszw5m2.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y84y84luszw5m2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest2.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44401,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5ry9d() throws Exception{try{__CLR4_1_10y84y84luszw5m2.R.inc(44401);
        __CLR4_1_10y84y84luszw5m2.R.inc(44402);Assert.assertNull(JSON.parseObject(null, new TypeReference<Integer>() {}.getType(), 0));
    }finally{__CLR4_1_10y84y84luszw5m2.R.flushNeeded();}}
}
