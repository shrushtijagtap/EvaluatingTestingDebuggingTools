/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.util.IOUtils;

public class ByteArraySerializerTest extends TestCase {static class __CLR4_5_21rn81rn8lusvng0q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,82502,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_b_0() {__CLR4_5_21rn81rn8lusvng0q.R.globalSliceStart(getClass().getName(),82484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tvfoq51rn8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rn81rn8lusvng0q.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rn81rn8lusvng0q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ByteArraySerializerTest.test_b_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82484,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tvfoq51rn8(){try{__CLR4_5_21rn81rn8lusvng0q.R.inc(82484);
        __CLR4_5_21rn81rn8lusvng0q.R.inc(82485);char[] buf = new char[4];
        __CLR4_5_21rn81rn8lusvng0q.R.inc(82486);IOUtils.getChars((byte) -127, 4, buf);
    }finally{__CLR4_5_21rn81rn8lusvng0q.R.flushNeeded();}}

    public void test_0() {__CLR4_5_21rn81rn8lusvng0q.R.globalSliceStart(getClass().getName(),82487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21rnb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rn81rn8lusvng0q.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rn81rn8lusvng0q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ByteArraySerializerTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82487,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21rnb(){try{__CLR4_5_21rn81rn8lusvng0q.R.inc(82487);
        __CLR4_5_21rn81rn8lusvng0q.R.inc(82488);Assert.assertEquals("\"\"", JSON.toJSONString(new byte[0]));
        __CLR4_5_21rn81rn8lusvng0q.R.inc(82489);Assert.assertEquals("\"AQI=\"", JSON.toJSONString(new byte[] { 1, 2 }));
        __CLR4_5_21rn81rn8lusvng0q.R.inc(82490);Assert.assertEquals("\"AQID\"", JSON.toJSONString(new byte[] { 1, 2, 3 }));

        __CLR4_5_21rn81rn8lusvng0q.R.inc(82491);Assert.assertEquals("1", JSON.toJSONString((byte) 1));
        __CLR4_5_21rn81rn8lusvng0q.R.inc(82492);Assert.assertEquals("1", JSON.toJSONString((short) 1));
        __CLR4_5_21rn81rn8lusvng0q.R.inc(82493);Assert.assertEquals("true", JSON.toJSONString(true));
    }finally{__CLR4_5_21rn81rn8lusvng0q.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21rn81rn8lusvng0q.R.globalSliceStart(getClass().getName(),82494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1rni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rn81rn8lusvng0q.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rn81rn8lusvng0q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ByteArraySerializerTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82494,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1rni() throws Exception{try{__CLR4_5_21rn81rn8lusvng0q.R.inc(82494);
        __CLR4_5_21rn81rn8lusvng0q.R.inc(82495);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21rn81rn8lusvng0q.R.inc(82496);out.writeByteArray(new byte[] { 1, 2, 3 });
        __CLR4_5_21rn81rn8lusvng0q.R.inc(82497);Assert.assertEquals("\"AQID\"", out.toString());
    }finally{__CLR4_5_21rn81rn8lusvng0q.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21rn81rn8lusvng0q.R.globalSliceStart(getClass().getName(),82498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441rnm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rn81rn8lusvng0q.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rn81rn8lusvng0q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ByteArraySerializerTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82498,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441rnm() throws Exception{try{__CLR4_5_21rn81rn8lusvng0q.R.inc(82498);
        __CLR4_5_21rn81rn8lusvng0q.R.inc(82499);SerializeWriter out = new SerializeWriter(100);
        __CLR4_5_21rn81rn8lusvng0q.R.inc(82500);out.writeByteArray(new byte[] { 1, 2, 3 });
        __CLR4_5_21rn81rn8lusvng0q.R.inc(82501);Assert.assertEquals("\"AQID\"", out.toString());
    }finally{__CLR4_5_21rn81rn8lusvng0q.R.flushNeeded();}}
}
