/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt;

import java.math.BigInteger;

import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONArray;

public class JSONArrayTest2 extends TestCase {static class __CLR4_5_2xkvxkvlusvn2qt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,43547,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_2xkvxkvlusvn2qt.R.globalSliceStart(getClass().getName(),43519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp2xkv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xkvxkvlusvn2qt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xkvxkvlusvn2qt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONArrayTest2.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43519,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp2xkv() throws Exception{try{__CLR4_5_2xkvxkvlusvn2qt.R.inc(43519);
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43520);long time = System.currentTimeMillis();
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43521);JSONArray array = new JSONArray();
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43522);array.add(null);
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43523);array.add(1);
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43524);array.add(time);
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43525);Assert.assertEquals(0, array.getByteValue(0));
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43526);Assert.assertEquals(0, array.getShortValue(0));
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43527);Assert.assertTrue(0F == array.getFloatValue(0));
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43528);Assert.assertTrue(0D == array.getDoubleValue(0));
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43529);Assert.assertEquals(new BigInteger("1"), array.getBigInteger(1));
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43530);Assert.assertEquals("1", array.getString(1));
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43531);Assert.assertEquals(new java.util.Date(time), array.getDate(2));
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43532);Assert.assertEquals(new java.sql.Date(time), array.getSqlDate(2));
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43533);Assert.assertEquals(new java.sql.Timestamp(time), array.getTimestamp(2));

        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43534);JSONArray array2 = (JSONArray) array.clone();
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43535);Assert.assertEquals(0, array2.getByteValue(0));
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43536);Assert.assertEquals(0, array2.getShortValue(0));
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43537);Assert.assertTrue(0F == array2.getFloatValue(0));
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43538);Assert.assertTrue(0D == array2.getDoubleValue(0));
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43539);Assert.assertEquals(new BigInteger("1"), array2.getBigInteger(1));
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43540);Assert.assertEquals("1", array2.getString(1));
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43541);Assert.assertEquals(new java.util.Date(time), array2.getDate(2));
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43542);Assert.assertEquals(new java.sql.Date(time), array2.getSqlDate(2));
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43543);Assert.assertEquals(new java.sql.Timestamp(time), array2.getTimestamp(2));
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43544);Assert.assertEquals(array2.size(), array2.size());

        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43545);JSON.parseArray("//arplatform.alicdn.com/images/874/1504512065305.png");
        __CLR4_5_2xkvxkvlusvn2qt.R.inc(43546);JSON.parseArray("//arplatform.alicdn.com/images/874/1504512065305.png");
    }finally{__CLR4_5_2xkvxkvlusvn2qt.R.flushNeeded();}}
}
