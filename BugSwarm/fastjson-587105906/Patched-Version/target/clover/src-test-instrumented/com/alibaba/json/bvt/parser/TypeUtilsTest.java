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
public class TypeUtilsTest extends TestCase {static class __CLR4_5_21jl31jl3lusvndp7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,72272,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21jl3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72039,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21jl3() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72039);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72040);HashMap map = new HashMap();

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72041);Assert.assertTrue(map == TypeUtils.castToJavaBean(map, Map.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1jl6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72042,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1jl6() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72042);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72043);JSONObject map = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72044);Assert.assertTrue(map == TypeUtils.castToJavaBean(map, Map.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441jl9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72045,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441jl9() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72045);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72046);JSONObject map = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72047);map.put("id", 1);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72048);map.put("name", "panlei");

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72049);User user = TypeUtils.castToJavaBean(map, User.class);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72050);Assert.assertEquals(1L, user.getId());
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72051);Assert.assertEquals("panlei", user.getName());
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_Integer() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tucuqa1jlg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_Integer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72052,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tucuqa1jlg() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72052);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72053);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72054);json.put("id", 1L);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72055);Assert.assertEquals(new Integer(1), json.getObject("id", int.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_Integer_2() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29ollgb1jlk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_Integer_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72056,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29ollgb1jlk() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72056);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72057);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72058);json.put("id", 1L);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72059);Assert.assertEquals(new Integer(1), json.getObject("id", Integer.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_long() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2et4vsk1jlo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72060,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2et4vsk1jlo() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72060);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72061);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72062);json.put("id", 1);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72063);Assert.assertEquals(new Long(1), json.getObject("id", long.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_Long() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21lgd1w1jls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72064,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21lgd1w1jls() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72064);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72065);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72066);json.put("id", 1);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72067);Assert.assertEquals(new Long(1), json.getObject("id", Long.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_short() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28og4y1jlw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_short",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72068,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28og4y1jlw() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72068);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72069);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72070);json.put("id", 1);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72071);Assert.assertEquals(new Short((short) 1), json.getObject("id", short.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_Short() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gt8n0y1jm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Short",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72072,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gt8n0y1jm0() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72072);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72073);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72074);json.put("id", 1);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72075);Assert.assertEquals(new Short((short) 1), json.getObject("id", Short.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_byte() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pbb37k1jm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_byte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72076,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pbb37k1jm4() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72076);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72077);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72078);json.put("id", 1);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72079);Assert.assertEquals(new Byte((byte) 1), json.getObject("id", byte.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_Byte() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wi4g0w1jm8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Byte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72080,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wi4g0w1jm8() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72080);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72081);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72082);json.put("id", 1);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72083);Assert.assertEquals(new Byte((byte) 1), json.getObject("id", Byte.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_BigInteger() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rv0gc61jmc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_BigInteger",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72084,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rv0gc61jmc() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72084);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72085);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72086);json.put("id", 1);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72087);Assert.assertEquals(new BigInteger("1"), json.getObject("id", BigInteger.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_BigDecimal() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_275lnc91jmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_BigDecimal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72088,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_275lnc91jmg() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72088);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72089);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72090);json.put("id", 1);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72091);Assert.assertEquals(new BigDecimal("1"), json.getObject("id", BigDecimal.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_boolean() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yos5b61jmk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72092,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yos5b61jmk() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72092);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72093);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72094);json.put("id", 1);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72095);Assert.assertEquals(Boolean.TRUE, json.getObject("id", boolean.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_Boolean() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kr0jk21jmo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72096,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kr0jk21jmo() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72096);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72097);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72098);json.put("id", 1);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72099);Assert.assertEquals(Boolean.TRUE, json.getObject("id", Boolean.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_null() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gxilup1jms();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72100,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gxilup1jms() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72100);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72101);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72102);json.put("id", null);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72103);Assert.assertEquals(null, json.getObject("id", Boolean.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_String() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iar0vr1jmw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_String",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72104,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iar0vr1jmw() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72104);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72105);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72106);json.put("id", 1);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72107);Assert.assertEquals("1", json.getObject("id", String.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_Date() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2meu96u1jn0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Date",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72108,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2meu96u1jn0() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72108);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72109);long millis = System.currentTimeMillis();

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72110);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72111);json.put("date", millis);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72112);Assert.assertEquals(new Date(millis), json.getObject("date", Date.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_SqlDate() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2si5csu1jn5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72113,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2si5csu1jn5() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72113);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72114);long millis = System.currentTimeMillis();

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72115);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72116);json.put("date", millis);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72117);Assert.assertEquals(new java.sql.Date(millis), json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_SqlDate_string() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dnsvbo1jna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_string",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72118,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dnsvbo1jna() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72118);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72119);long millis = System.currentTimeMillis();

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72120);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72121);json.put("date", Long.toString(millis));
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72122);Assert.assertEquals(new java.sql.Date(millis), json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_SqlDate_null() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uhy5su1jnf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72123,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uhy5su1jnf() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72123);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72124);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72125);json.put("date", null);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72126);Assert.assertEquals(null, json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_SqlDate_null2() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kqhygu1jnj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_null2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72127,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kqhygu1jnj() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72127);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72128);Assert.assertEquals(null, TypeUtils.castToSqlDate(null));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_SqlDate_util_Date() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lo5tzy1jnl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_util_Date",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72129,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lo5tzy1jnl() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72129);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72130);long millis = System.currentTimeMillis();

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72131);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72132);json.put("date", new Date(millis));
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72133);Assert.assertEquals(new java.sql.Date(millis), json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_SqlDate_sql_Date() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jzs5kq1jnq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_sql_Date",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72134,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jzs5kq1jnq() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72134);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72135);long millis = System.currentTimeMillis();

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72136);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72137);json.put("date", new java.sql.Date(millis));
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72138);Assert.assertEquals(new java.sql.Date(millis), json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_SqlDate_sql_Date2() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nbojom1jnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_sql_Date2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72139,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nbojom1jnv() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72139);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72140);long millis = System.currentTimeMillis();

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72141);java.sql.Date date = new java.sql.Date(millis);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72142);Assert.assertEquals(date, TypeUtils.castToSqlDate(date));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_SqlDate_calendar() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vu3j0n1jnz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_calendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72143,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vu3j0n1jnz() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72143);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72144);long millis = System.currentTimeMillis();

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72145);Calendar calendar = Calendar.getInstance();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72146);calendar.setTimeInMillis(millis);

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72147);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72148);json.put("date", calendar);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72149);Assert.assertEquals(new java.sql.Date(millis), json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_SqlDate_error() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_226je6z1jo6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72150,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_226je6z1jo6() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72150);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72151);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72152);json.put("date", 0);

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72153);JSONException error = null;
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72154);try {
            __CLR4_5_21jl31jl3lusvndp7.R.inc(72155);json.getObject("date", java.sql.Date.class);
        } catch (JSONException e) {
            __CLR4_5_21jl31jl3lusvndp7.R.inc(72156);error = e;
        }
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72157);Assert.assertNotNull(error);
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_Timestamp() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mdqc2c1joe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72158,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mdqc2c1joe() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72158);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72159);long millis = System.currentTimeMillis();

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72160);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72161);json.put("date", millis);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72162);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_Timestamp_string() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27q2j4e1joj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_string",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72163,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27q2j4e1joj() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72163);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72164);long millis = System.currentTimeMillis();

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72165);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72166);json.put("date", Long.toString(millis));
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72167);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_Timestamp_number() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qbqwa21joo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_number",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72168,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qbqwa21joo() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72168);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72169);long millis = System.currentTimeMillis();

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72170);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72171);json.put("date", new BigDecimal(Long.toString(millis)));
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72172);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_Timestamp_null() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r8nb4o1jot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72173,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r8nb4o1jot() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72173);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72174);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72175);json.put("date", null);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72176);Assert.assertEquals(null, json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_Timestamp_null2() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kbdqo81jox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_null2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72177,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kbdqo81jox() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72177);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72178);Assert.assertEquals(null, TypeUtils.castToTimestamp(null));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_BigDecimal_same() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g24yru1joz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_BigDecimal_same",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72179,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g24yru1joz() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72179);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72180);BigDecimal value = new BigDecimal("123");
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72181);Assert.assertEquals(true, value == TypeUtils.castToBigDecimal(value));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_BigInteger_same() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yrbkmb1jp2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_BigInteger_same",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72182,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yrbkmb1jp2() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72182);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72183);BigInteger value = new BigInteger("123");
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72184);Assert.assertEquals(true, value == TypeUtils.castToBigInteger(value));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_Array() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2355tgz1jp5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_Array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72185,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2355tgz1jp5() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72185);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72186);Assert.assertEquals(Integer[].class, TypeUtils.cast(new ArrayList(), Integer[].class, null).getClass());
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_Timestamp_util_Date() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nkwu1k1jp7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_util_Date",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72187,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nkwu1k1jp7() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72187);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72188);long millis = System.currentTimeMillis();

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72189);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72190);json.put("date", new Date(millis));
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72191);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_Timestamp_sql_Date() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s28k5c1jpc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_sql_Date",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72192,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s28k5c1jpc() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72192);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72193);long millis = System.currentTimeMillis();

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72194);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72195);json.put("date", new java.sql.Date(millis));
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72196);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_Timestamp_sql_Timestamp() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nb45zi1jph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_sql_Timestamp",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72197,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nb45zi1jph() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72197);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72198);long millis = System.currentTimeMillis();

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72199);java.sql.Timestamp date = new java.sql.Timestamp(millis);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72200);Assert.assertEquals(date, TypeUtils.castToTimestamp(date));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_Timestamp_calendar() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28v06rl1jpl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_calendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72201,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28v06rl1jpl() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72201);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72202);long millis = System.currentTimeMillis();

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72203);Calendar calendar = Calendar.getInstance();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72204);calendar.setTimeInMillis(millis);

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72205);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72206);json.put("date", calendar);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72207);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_to_Timestamp_error() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w5rr111jps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72208,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w5rr111jps() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72208);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72209);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72210);json.put("date", 0);

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72211);JSONException error = null;
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72212);try {
            __CLR4_5_21jl31jl3lusvndp7.R.inc(72213);json.getObject("date", java.sql.Timestamp.class);
        } catch (JSONException e) {
            __CLR4_5_21jl31jl3lusvndp7.R.inc(72214);error = e;
        }
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72215);Assert.assertNotNull(error);
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_ab() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26s2ekb1jq0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_ab",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72216,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26s2ekb1jq0() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72216);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72217);B b = new B();

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72218);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72219);json.put("value", b);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72220);Assert.assertEquals(b, json.getObject("value", A.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_ab_1() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ffdzdf1jq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_ab_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72221,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ffdzdf1jq5() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72221);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72222);B b = new B();

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72223);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72224);json.put("value", b);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72225);Assert.assertEquals(b, json.getObject("value", IA.class));
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_cast_ab_error() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_232jehw1jqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_ab_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72226,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_232jehw1jqa() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72226);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72227);A a = new A();

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72228);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72229);json.put("value", a);

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72230);JSONException error = null;
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72231);try {
            __CLR4_5_21jl31jl3lusvndp7.R.inc(72232);json.getObject("value", B.class);
        } catch (JSONException e) {
            __CLR4_5_21jl31jl3lusvndp7.R.inc(72233);error = e;
        }
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72234);Assert.assertNotNull(error);
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1jqj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72235,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1jqj() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72235);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72236);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72237);json.put("id", 1);

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72238);JSONException error = null;
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72239);try {
            __CLR4_5_21jl31jl3lusvndp7.R.inc(72240);TypeUtils.castToJavaBean(json, C.class, ParserConfig.getGlobalInstance());
        } catch (JSONException e) {
            __CLR4_5_21jl31jl3lusvndp7.R.inc(72241);error = e;
        }
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72242);Assert.assertNotNull(error);
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1jqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72243,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1jqr() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72243);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72244);JSONObject json = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72245);json.put("id", 1);

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72246);Method method = TypeUtilsTest.class.getMethod("f", List.class);

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72247);Throwable error = null;
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72248);try {
            __CLR4_5_21jl31jl3lusvndp7.R.inc(72249);TypeUtils.cast(json, method.getGenericParameterTypes()[0], ParserConfig.getGlobalInstance());
        } catch (JSONException ex) {
            __CLR4_5_21jl31jl3lusvndp7.R.inc(72250);error = ex;
        }
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72251);assertNotNull(error);
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21jl31jl3lusvndp7.R.globalSliceStart(getClass().getName(),72252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1jr0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jl31jl3lusvndp7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jl31jl3lusvndp7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72252,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1jr0() throws Exception{try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72252);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72253);JSONObject map = new JSONObject();
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72254);map.put("id", 1);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72255);map.put("name", "panlei");

        __CLR4_5_21jl31jl3lusvndp7.R.inc(72256);User user = JSON.toJavaObject(map, User.class);
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72257);Assert.assertEquals(1L, user.getId());
        __CLR4_5_21jl31jl3lusvndp7.R.inc(72258);Assert.assertEquals("panlei", user.getName());
    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

    public static class User {

        private long   id;
        private String name;

        public long getId() {try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72259);
            __CLR4_5_21jl31jl3lusvndp7.R.inc(72260);return id;
        }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

        public void setId(long id) {try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72261);
            __CLR4_5_21jl31jl3lusvndp7.R.inc(72262);this.id = id;
        }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72263);
            __CLR4_5_21jl31jl3lusvndp7.R.inc(72264);return name;
        }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72265);
            __CLR4_5_21jl31jl3lusvndp7.R.inc(72266);this.name = name;
        }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}
    }

    public static class A implements IA {

    }

    public static interface IA {

    }

    public static class B extends A {

    }

    public static class C extends B {

        public int getId() {try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72267);
            __CLR4_5_21jl31jl3lusvndp7.R.inc(72268);throw new UnsupportedOperationException();
        }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72269);
            __CLR4_5_21jl31jl3lusvndp7.R.inc(72270);throw new UnsupportedOperationException();
        }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}
    }

    public static void f(List<?> list) {try{__CLR4_5_21jl31jl3lusvndp7.R.inc(72271);

    }finally{__CLR4_5_21jl31jl3lusvndp7.R.flushNeeded();}}
}
