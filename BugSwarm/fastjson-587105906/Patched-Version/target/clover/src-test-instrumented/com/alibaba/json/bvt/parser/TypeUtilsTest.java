/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.TypeUtils;

@SuppressWarnings("rawtypes")
public class TypeUtilsTest extends TestCase {static class __CLR4_5_21imv1imvlusyjtu7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,71040,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21imv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70807,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21imv() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70807);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70808);HashMap map = new HashMap();

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70809);Assert.assertTrue(map == TypeUtils.castToJavaBean(map, Map.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1imy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70810,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1imy() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70810);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70811);JSONObject map = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70812);Assert.assertTrue(map == TypeUtils.castToJavaBean(map, Map.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441in1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70813,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441in1() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70813);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70814);JSONObject map = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70815);map.put("id", 1);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70816);map.put("name", "panlei");

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70817);User user = TypeUtils.castToJavaBean(map, User.class);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70818);Assert.assertEquals(1L, user.getId());
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70819);Assert.assertEquals("panlei", user.getName());
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_Integer() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tucuqa1in8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_Integer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70820,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tucuqa1in8() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70820);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70821);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70822);json.put("id", 1L);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70823);Assert.assertEquals(new Integer(1), json.getObject("id", int.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_Integer_2() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29ollgb1inc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_Integer_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70824,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29ollgb1inc() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70824);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70825);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70826);json.put("id", 1L);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70827);Assert.assertEquals(new Integer(1), json.getObject("id", Integer.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_long() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2et4vsk1ing();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70828,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2et4vsk1ing() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70828);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70829);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70830);json.put("id", 1);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70831);Assert.assertEquals(new Long(1), json.getObject("id", long.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_Long() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21lgd1w1ink();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70832,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21lgd1w1ink() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70832);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70833);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70834);json.put("id", 1);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70835);Assert.assertEquals(new Long(1), json.getObject("id", Long.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_short() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28og4y1ino();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_short",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70836,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28og4y1ino() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70836);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70837);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70838);json.put("id", 1);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70839);Assert.assertEquals(new Short((short) 1), json.getObject("id", short.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_Short() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gt8n0y1ins();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Short",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70840,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gt8n0y1ins() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70840);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70841);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70842);json.put("id", 1);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70843);Assert.assertEquals(new Short((short) 1), json.getObject("id", Short.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_byte() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pbb37k1inw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_byte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70844,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pbb37k1inw() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70844);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70845);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70846);json.put("id", 1);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70847);Assert.assertEquals(new Byte((byte) 1), json.getObject("id", byte.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_Byte() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wi4g0w1io0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Byte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70848,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wi4g0w1io0() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70848);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70849);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70850);json.put("id", 1);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70851);Assert.assertEquals(new Byte((byte) 1), json.getObject("id", Byte.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_BigInteger() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rv0gc61io4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_BigInteger",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70852,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rv0gc61io4() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70852);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70853);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70854);json.put("id", 1);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70855);Assert.assertEquals(new BigInteger("1"), json.getObject("id", BigInteger.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_BigDecimal() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_275lnc91io8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_BigDecimal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70856,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_275lnc91io8() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70856);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70857);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70858);json.put("id", 1);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70859);Assert.assertEquals(new BigDecimal("1"), json.getObject("id", BigDecimal.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_boolean() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yos5b61ioc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70860,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yos5b61ioc() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70860);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70861);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70862);json.put("id", 1);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70863);Assert.assertEquals(Boolean.TRUE, json.getObject("id", boolean.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_Boolean() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kr0jk21iog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70864,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kr0jk21iog() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70864);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70865);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70866);json.put("id", 1);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70867);Assert.assertEquals(Boolean.TRUE, json.getObject("id", Boolean.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_null() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gxilup1iok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70868,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gxilup1iok() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70868);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70869);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70870);json.put("id", null);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70871);Assert.assertEquals(null, json.getObject("id", Boolean.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_String() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iar0vr1ioo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70872,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iar0vr1ioo() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70872);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70873);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70874);json.put("id", 1);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70875);Assert.assertEquals("1", json.getObject("id", String.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_Date() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2meu96u1ios();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Date",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70876,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2meu96u1ios() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70876);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70877);long millis = System.currentTimeMillis();

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70878);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70879);json.put("date", millis);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70880);Assert.assertEquals(new Date(millis), json.getObject("date", Date.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_SqlDate() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2si5csu1iox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70881,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2si5csu1iox() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70881);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70882);long millis = System.currentTimeMillis();

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70883);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70884);json.put("date", millis);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70885);Assert.assertEquals(new java.sql.Date(millis), json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_SqlDate_string() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dnsvbo1ip2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_string",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70886,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dnsvbo1ip2() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70886);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70887);long millis = System.currentTimeMillis();

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70888);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70889);json.put("date", Long.toString(millis));
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70890);Assert.assertEquals(new java.sql.Date(millis), json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_SqlDate_null() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uhy5su1ip7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70891,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uhy5su1ip7() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70891);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70892);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70893);json.put("date", null);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70894);Assert.assertEquals(null, json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_SqlDate_null2() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kqhygu1ipb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_null2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70895,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kqhygu1ipb() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70895);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70896);Assert.assertEquals(null, TypeUtils.castToSqlDate(null));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_SqlDate_util_Date() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lo5tzy1ipd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_util_Date",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70897,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lo5tzy1ipd() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70897);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70898);long millis = System.currentTimeMillis();

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70899);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70900);json.put("date", new Date(millis));
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70901);Assert.assertEquals(new java.sql.Date(millis), json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_SqlDate_sql_Date() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jzs5kq1ipi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_sql_Date",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70902,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jzs5kq1ipi() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70902);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70903);long millis = System.currentTimeMillis();

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70904);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70905);json.put("date", new java.sql.Date(millis));
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70906);Assert.assertEquals(new java.sql.Date(millis), json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_SqlDate_sql_Date2() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nbojom1ipn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_sql_Date2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70907,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nbojom1ipn() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70907);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70908);long millis = System.currentTimeMillis();

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70909);java.sql.Date date = new java.sql.Date(millis);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70910);Assert.assertEquals(date, TypeUtils.castToSqlDate(date));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_SqlDate_calendar() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vu3j0n1ipr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_calendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70911,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vu3j0n1ipr() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70911);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70912);long millis = System.currentTimeMillis();

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70913);Calendar calendar = Calendar.getInstance();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70914);calendar.setTimeInMillis(millis);

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70915);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70916);json.put("date", calendar);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70917);Assert.assertEquals(new java.sql.Date(millis), json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_SqlDate_error() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_226je6z1ipy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70918,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_226je6z1ipy() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70918);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70919);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70920);json.put("date", 0);

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70921);JSONException error = null;
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70922);try {
            __CLR4_5_21imv1imvlusyjtu7.R.inc(70923);json.getObject("date", java.sql.Date.class);
        } catch (JSONException e) {
            __CLR4_5_21imv1imvlusyjtu7.R.inc(70924);error = e;
        }
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70925);Assert.assertNotNull(error);
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_Timestamp() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mdqc2c1iq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70926,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mdqc2c1iq6() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70926);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70927);long millis = System.currentTimeMillis();

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70928);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70929);json.put("date", millis);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70930);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_Timestamp_string() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27q2j4e1iqb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_string",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70931,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27q2j4e1iqb() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70931);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70932);long millis = System.currentTimeMillis();

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70933);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70934);json.put("date", Long.toString(millis));
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70935);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_Timestamp_number() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qbqwa21iqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_number",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70936,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qbqwa21iqg() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70936);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70937);long millis = System.currentTimeMillis();

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70938);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70939);json.put("date", new BigDecimal(Long.toString(millis)));
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70940);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_Timestamp_null() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r8nb4o1iql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70941,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r8nb4o1iql() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70941);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70942);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70943);json.put("date", null);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70944);Assert.assertEquals(null, json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_Timestamp_null2() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kbdqo81iqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_null2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70945,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kbdqo81iqp() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70945);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70946);Assert.assertEquals(null, TypeUtils.castToTimestamp(null));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_BigDecimal_same() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g24yru1iqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_BigDecimal_same",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70947,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g24yru1iqr() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70947);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70948);BigDecimal value = new BigDecimal("123");
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70949);Assert.assertEquals(true, value == TypeUtils.castToBigDecimal(value));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_BigInteger_same() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yrbkmb1iqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_BigInteger_same",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70950,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yrbkmb1iqu() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70950);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70951);BigInteger value = new BigInteger("123");
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70952);Assert.assertEquals(true, value == TypeUtils.castToBigInteger(value));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_Array() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2355tgz1iqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_Array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70953,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2355tgz1iqx() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70953);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70954);Assert.assertEquals(Integer[].class, TypeUtils.cast(new ArrayList(), Integer[].class, null).getClass());
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_Timestamp_util_Date() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nkwu1k1iqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_util_Date",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70955,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nkwu1k1iqz() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70955);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70956);long millis = System.currentTimeMillis();

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70957);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70958);json.put("date", new Date(millis));
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70959);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_Timestamp_sql_Date() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s28k5c1ir4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_sql_Date",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70960,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s28k5c1ir4() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70960);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70961);long millis = System.currentTimeMillis();

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70962);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70963);json.put("date", new java.sql.Date(millis));
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70964);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_Timestamp_sql_Timestamp() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nb45zi1ir9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_sql_Timestamp",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70965,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nb45zi1ir9() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70965);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70966);long millis = System.currentTimeMillis();

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70967);java.sql.Timestamp date = new java.sql.Timestamp(millis);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70968);Assert.assertEquals(date, TypeUtils.castToTimestamp(date));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_Timestamp_calendar() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28v06rl1ird();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_calendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70969,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28v06rl1ird() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70969);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70970);long millis = System.currentTimeMillis();

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70971);Calendar calendar = Calendar.getInstance();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70972);calendar.setTimeInMillis(millis);

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70973);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70974);json.put("date", calendar);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70975);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_to_Timestamp_error() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w5rr111irk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70976,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w5rr111irk() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70976);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70977);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70978);json.put("date", 0);

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70979);JSONException error = null;
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70980);try {
            __CLR4_5_21imv1imvlusyjtu7.R.inc(70981);json.getObject("date", java.sql.Timestamp.class);
        } catch (JSONException e) {
            __CLR4_5_21imv1imvlusyjtu7.R.inc(70982);error = e;
        }
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70983);Assert.assertNotNull(error);
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_ab() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s2ekb1irs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_ab",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70984,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s2ekb1irs() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70984);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70985);B b = new B();

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70986);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70987);json.put("value", b);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70988);Assert.assertEquals(b, json.getObject("value", A.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_ab_1() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ffdzdf1irx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_ab_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70989,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ffdzdf1irx() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70989);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70990);B b = new B();

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70991);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70992);json.put("value", b);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70993);Assert.assertEquals(b, json.getObject("value", IA.class));
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_cast_ab_error() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),70994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_232jehw1is2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_ab_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70994,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_232jehw1is2() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(70994);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70995);A a = new A();

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70996);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70997);json.put("value", a);

        __CLR4_5_21imv1imvlusyjtu7.R.inc(70998);JSONException error = null;
        __CLR4_5_21imv1imvlusyjtu7.R.inc(70999);try {
            __CLR4_5_21imv1imvlusyjtu7.R.inc(71000);json.getObject("value", B.class);
        } catch (JSONException e) {
            __CLR4_5_21imv1imvlusyjtu7.R.inc(71001);error = e;
        }
        __CLR4_5_21imv1imvlusyjtu7.R.inc(71002);Assert.assertNotNull(error);
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),71003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1isb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71003,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1isb() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(71003);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(71004);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(71005);json.put("id", 1);

        __CLR4_5_21imv1imvlusyjtu7.R.inc(71006);JSONException error = null;
        __CLR4_5_21imv1imvlusyjtu7.R.inc(71007);try {
            __CLR4_5_21imv1imvlusyjtu7.R.inc(71008);TypeUtils.castToJavaBean(json, C.class, ParserConfig.getGlobalInstance());
        } catch (JSONException e) {
            __CLR4_5_21imv1imvlusyjtu7.R.inc(71009);error = e;
        }
        __CLR4_5_21imv1imvlusyjtu7.R.inc(71010);Assert.assertNotNull(error);
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),71011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1isj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71011,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1isj() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(71011);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(71012);JSONObject json = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(71013);json.put("id", 1);

        __CLR4_5_21imv1imvlusyjtu7.R.inc(71014);Method method = TypeUtilsTest.class.getMethod("f", List.class);

        __CLR4_5_21imv1imvlusyjtu7.R.inc(71015);Throwable error = null;
        __CLR4_5_21imv1imvlusyjtu7.R.inc(71016);try {
            __CLR4_5_21imv1imvlusyjtu7.R.inc(71017);TypeUtils.cast(json, method.getGenericParameterTypes()[0], ParserConfig.getGlobalInstance());
        } catch (JSONException ex) {
            __CLR4_5_21imv1imvlusyjtu7.R.inc(71018);error = ex;
        }
        __CLR4_5_21imv1imvlusyjtu7.R.inc(71019);assertNotNull(error);
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21imv1imvlusyjtu7.R.globalSliceStart(getClass().getName(),71020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1iss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21imv1imvlusyjtu7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21imv1imvlusyjtu7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71020,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1iss() throws Exception{try{__CLR4_5_21imv1imvlusyjtu7.R.inc(71020);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(71021);JSONObject map = new JSONObject();
        __CLR4_5_21imv1imvlusyjtu7.R.inc(71022);map.put("id", 1);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(71023);map.put("name", "panlei");

        __CLR4_5_21imv1imvlusyjtu7.R.inc(71024);User user = JSON.toJavaObject(map, User.class);
        __CLR4_5_21imv1imvlusyjtu7.R.inc(71025);Assert.assertEquals(1L, user.getId());
        __CLR4_5_21imv1imvlusyjtu7.R.inc(71026);Assert.assertEquals("panlei", user.getName());
    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

    public static class User {

        private long   id;
        private String name;

        public long getId() {try{__CLR4_5_21imv1imvlusyjtu7.R.inc(71027);
            __CLR4_5_21imv1imvlusyjtu7.R.inc(71028);return id;
        }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

        public void setId(long id) {try{__CLR4_5_21imv1imvlusyjtu7.R.inc(71029);
            __CLR4_5_21imv1imvlusyjtu7.R.inc(71030);this.id = id;
        }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21imv1imvlusyjtu7.R.inc(71031);
            __CLR4_5_21imv1imvlusyjtu7.R.inc(71032);return name;
        }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21imv1imvlusyjtu7.R.inc(71033);
            __CLR4_5_21imv1imvlusyjtu7.R.inc(71034);this.name = name;
        }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}
    }

    public static class A implements IA {

    }

    public static interface IA {

    }

    public static class B extends A {

    }

    public static class C extends B {

        public int getId() {try{__CLR4_5_21imv1imvlusyjtu7.R.inc(71035);
            __CLR4_5_21imv1imvlusyjtu7.R.inc(71036);throw new UnsupportedOperationException();
        }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21imv1imvlusyjtu7.R.inc(71037);
            __CLR4_5_21imv1imvlusyjtu7.R.inc(71038);throw new UnsupportedOperationException();
        }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}
    }

    public static void f(List<?> list) {try{__CLR4_5_21imv1imvlusyjtu7.R.inc(71039);

    }finally{__CLR4_5_21imv1imvlusyjtu7.R.flushNeeded();}}
}
