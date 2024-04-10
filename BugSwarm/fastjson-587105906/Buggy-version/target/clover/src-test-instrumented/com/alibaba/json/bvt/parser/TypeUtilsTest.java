/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

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
public class TypeUtilsTest extends TestCase {static class __CLR4_1_101jle1jleluszwct4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,72283,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21jle();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72050,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21jle() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72050);
        __CLR4_1_101jle1jleluszwct4.R.inc(72051);HashMap map = new HashMap();

        __CLR4_1_101jle1jleluszwct4.R.inc(72052);Assert.assertTrue(map == TypeUtils.castToJavaBean(map, Map.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1jlh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72053,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1jlh() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72053);
        __CLR4_1_101jle1jleluszwct4.R.inc(72054);JSONObject map = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72055);Assert.assertTrue(map == TypeUtils.castToJavaBean(map, Map.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441jlk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72056,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441jlk() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72056);
        __CLR4_1_101jle1jleluszwct4.R.inc(72057);JSONObject map = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72058);map.put("id", 1);
        __CLR4_1_101jle1jleluszwct4.R.inc(72059);map.put("name", "panlei");

        __CLR4_1_101jle1jleluszwct4.R.inc(72060);User user = TypeUtils.castToJavaBean(map, User.class);
        __CLR4_1_101jle1jleluszwct4.R.inc(72061);Assert.assertEquals(1L, user.getId());
        __CLR4_1_101jle1jleluszwct4.R.inc(72062);Assert.assertEquals("panlei", user.getName());
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_Integer() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tucuqa1jlr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_Integer",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72063,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tucuqa1jlr() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72063);
        __CLR4_1_101jle1jleluszwct4.R.inc(72064);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72065);json.put("id", 1L);
        __CLR4_1_101jle1jleluszwct4.R.inc(72066);Assert.assertEquals(new Integer(1), json.getObject("id", int.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_Integer_2() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109ollgb1jlv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_Integer_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72067,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109ollgb1jlv() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72067);
        __CLR4_1_101jle1jleluszwct4.R.inc(72068);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72069);json.put("id", 1L);
        __CLR4_1_101jle1jleluszwct4.R.inc(72070);Assert.assertEquals(new Integer(1), json.getObject("id", Integer.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_long() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10et4vsk1jlz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_long",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72071,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10et4vsk1jlz() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72071);
        __CLR4_1_101jle1jleluszwct4.R.inc(72072);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72073);json.put("id", 1);
        __CLR4_1_101jle1jleluszwct4.R.inc(72074);Assert.assertEquals(new Long(1), json.getObject("id", long.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_Long() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101lgd1w1jm3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Long",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72075,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101lgd1w1jm3() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72075);
        __CLR4_1_101jle1jleluszwct4.R.inc(72076);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72077);json.put("id", 1);
        __CLR4_1_101jle1jleluszwct4.R.inc(72078);Assert.assertEquals(new Long(1), json.getObject("id", Long.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_short() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108og4y1jm7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_short",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72079,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108og4y1jm7() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72079);
        __CLR4_1_101jle1jleluszwct4.R.inc(72080);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72081);json.put("id", 1);
        __CLR4_1_101jle1jleluszwct4.R.inc(72082);Assert.assertEquals(new Short((short) 1), json.getObject("id", short.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_Short() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gt8n0y1jmb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Short",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72083,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gt8n0y1jmb() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72083);
        __CLR4_1_101jle1jleluszwct4.R.inc(72084);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72085);json.put("id", 1);
        __CLR4_1_101jle1jleluszwct4.R.inc(72086);Assert.assertEquals(new Short((short) 1), json.getObject("id", Short.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_byte() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pbb37k1jmf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_byte",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72087,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pbb37k1jmf() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72087);
        __CLR4_1_101jle1jleluszwct4.R.inc(72088);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72089);json.put("id", 1);
        __CLR4_1_101jle1jleluszwct4.R.inc(72090);Assert.assertEquals(new Byte((byte) 1), json.getObject("id", byte.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_Byte() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wi4g0w1jmj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Byte",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72091,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wi4g0w1jmj() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72091);
        __CLR4_1_101jle1jleluszwct4.R.inc(72092);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72093);json.put("id", 1);
        __CLR4_1_101jle1jleluszwct4.R.inc(72094);Assert.assertEquals(new Byte((byte) 1), json.getObject("id", Byte.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_BigInteger() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rv0gc61jmn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_BigInteger",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72095,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rv0gc61jmn() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72095);
        __CLR4_1_101jle1jleluszwct4.R.inc(72096);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72097);json.put("id", 1);
        __CLR4_1_101jle1jleluszwct4.R.inc(72098);Assert.assertEquals(new BigInteger("1"), json.getObject("id", BigInteger.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_BigDecimal() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1075lnc91jmr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_BigDecimal",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72099,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1075lnc91jmr() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72099);
        __CLR4_1_101jle1jleluszwct4.R.inc(72100);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72101);json.put("id", 1);
        __CLR4_1_101jle1jleluszwct4.R.inc(72102);Assert.assertEquals(new BigDecimal("1"), json.getObject("id", BigDecimal.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_boolean() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yos5b61jmv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_boolean",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72103,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yos5b61jmv() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72103);
        __CLR4_1_101jle1jleluszwct4.R.inc(72104);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72105);json.put("id", 1);
        __CLR4_1_101jle1jleluszwct4.R.inc(72106);Assert.assertEquals(Boolean.TRUE, json.getObject("id", boolean.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_Boolean() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kr0jk21jmz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Boolean",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72107,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kr0jk21jmz() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72107);
        __CLR4_1_101jle1jleluszwct4.R.inc(72108);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72109);json.put("id", 1);
        __CLR4_1_101jle1jleluszwct4.R.inc(72110);Assert.assertEquals(Boolean.TRUE, json.getObject("id", Boolean.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_null() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gxilup1jn3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72111,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gxilup1jn3() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72111);
        __CLR4_1_101jle1jleluszwct4.R.inc(72112);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72113);json.put("id", null);
        __CLR4_1_101jle1jleluszwct4.R.inc(72114);Assert.assertEquals(null, json.getObject("id", Boolean.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_String() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10iar0vr1jn7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_String",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72115,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10iar0vr1jn7() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72115);
        __CLR4_1_101jle1jleluszwct4.R.inc(72116);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72117);json.put("id", 1);
        __CLR4_1_101jle1jleluszwct4.R.inc(72118);Assert.assertEquals("1", json.getObject("id", String.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_Date() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10meu96u1jnb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Date",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72119,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10meu96u1jnb() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72119);
        __CLR4_1_101jle1jleluszwct4.R.inc(72120);long millis = System.currentTimeMillis();

        __CLR4_1_101jle1jleluszwct4.R.inc(72121);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72122);json.put("date", millis);
        __CLR4_1_101jle1jleluszwct4.R.inc(72123);Assert.assertEquals(new Date(millis), json.getObject("date", Date.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_SqlDate() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10si5csu1jng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72124,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10si5csu1jng() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72124);
        __CLR4_1_101jle1jleluszwct4.R.inc(72125);long millis = System.currentTimeMillis();

        __CLR4_1_101jle1jleluszwct4.R.inc(72126);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72127);json.put("date", millis);
        __CLR4_1_101jle1jleluszwct4.R.inc(72128);Assert.assertEquals(new java.sql.Date(millis), json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_SqlDate_string() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dnsvbo1jnl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_string",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72129,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dnsvbo1jnl() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72129);
        __CLR4_1_101jle1jleluszwct4.R.inc(72130);long millis = System.currentTimeMillis();

        __CLR4_1_101jle1jleluszwct4.R.inc(72131);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72132);json.put("date", Long.toString(millis));
        __CLR4_1_101jle1jleluszwct4.R.inc(72133);Assert.assertEquals(new java.sql.Date(millis), json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_SqlDate_null() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10uhy5su1jnq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72134,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10uhy5su1jnq() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72134);
        __CLR4_1_101jle1jleluszwct4.R.inc(72135);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72136);json.put("date", null);
        __CLR4_1_101jle1jleluszwct4.R.inc(72137);Assert.assertEquals(null, json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_SqlDate_null2() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kqhygu1jnu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_null2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72138,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kqhygu1jnu() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72138);
        __CLR4_1_101jle1jleluszwct4.R.inc(72139);Assert.assertEquals(null, TypeUtils.castToSqlDate(null));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_SqlDate_util_Date() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lo5tzy1jnw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_util_Date",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72140,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lo5tzy1jnw() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72140);
        __CLR4_1_101jle1jleluszwct4.R.inc(72141);long millis = System.currentTimeMillis();

        __CLR4_1_101jle1jleluszwct4.R.inc(72142);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72143);json.put("date", new Date(millis));
        __CLR4_1_101jle1jleluszwct4.R.inc(72144);Assert.assertEquals(new java.sql.Date(millis), json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_SqlDate_sql_Date() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jzs5kq1jo1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_sql_Date",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72145,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jzs5kq1jo1() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72145);
        __CLR4_1_101jle1jleluszwct4.R.inc(72146);long millis = System.currentTimeMillis();

        __CLR4_1_101jle1jleluszwct4.R.inc(72147);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72148);json.put("date", new java.sql.Date(millis));
        __CLR4_1_101jle1jleluszwct4.R.inc(72149);Assert.assertEquals(new java.sql.Date(millis), json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_SqlDate_sql_Date2() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nbojom1jo6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_sql_Date2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72150,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nbojom1jo6() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72150);
        __CLR4_1_101jle1jleluszwct4.R.inc(72151);long millis = System.currentTimeMillis();

        __CLR4_1_101jle1jleluszwct4.R.inc(72152);java.sql.Date date = new java.sql.Date(millis);
        __CLR4_1_101jle1jleluszwct4.R.inc(72153);Assert.assertEquals(date, TypeUtils.castToSqlDate(date));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_SqlDate_calendar() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vu3j0n1joa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_calendar",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72154,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vu3j0n1joa() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72154);
        __CLR4_1_101jle1jleluszwct4.R.inc(72155);long millis = System.currentTimeMillis();

        __CLR4_1_101jle1jleluszwct4.R.inc(72156);Calendar calendar = Calendar.getInstance();
        __CLR4_1_101jle1jleluszwct4.R.inc(72157);calendar.setTimeInMillis(millis);

        __CLR4_1_101jle1jleluszwct4.R.inc(72158);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72159);json.put("date", calendar);
        __CLR4_1_101jle1jleluszwct4.R.inc(72160);Assert.assertEquals(new java.sql.Date(millis), json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_SqlDate_error() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1026je6z1joh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72161,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1026je6z1joh() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72161);
        __CLR4_1_101jle1jleluszwct4.R.inc(72162);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72163);json.put("date", 0);

        __CLR4_1_101jle1jleluszwct4.R.inc(72164);JSONException error = null;
        __CLR4_1_101jle1jleluszwct4.R.inc(72165);try {
            __CLR4_1_101jle1jleluszwct4.R.inc(72166);json.getObject("date", java.sql.Date.class);
        } catch (JSONException e) {
            __CLR4_1_101jle1jleluszwct4.R.inc(72167);error = e;
        }
        __CLR4_1_101jle1jleluszwct4.R.inc(72168);Assert.assertNotNull(error);
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_Timestamp() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mdqc2c1jop();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72169,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mdqc2c1jop() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72169);
        __CLR4_1_101jle1jleluszwct4.R.inc(72170);long millis = System.currentTimeMillis();

        __CLR4_1_101jle1jleluszwct4.R.inc(72171);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72172);json.put("date", millis);
        __CLR4_1_101jle1jleluszwct4.R.inc(72173);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_Timestamp_string() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107q2j4e1jou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_string",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72174,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107q2j4e1jou() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72174);
        __CLR4_1_101jle1jleluszwct4.R.inc(72175);long millis = System.currentTimeMillis();

        __CLR4_1_101jle1jleluszwct4.R.inc(72176);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72177);json.put("date", Long.toString(millis));
        __CLR4_1_101jle1jleluszwct4.R.inc(72178);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_Timestamp_number() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72179);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qbqwa21joz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_number",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72179,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qbqwa21joz() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72179);
        __CLR4_1_101jle1jleluszwct4.R.inc(72180);long millis = System.currentTimeMillis();

        __CLR4_1_101jle1jleluszwct4.R.inc(72181);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72182);json.put("date", new BigDecimal(Long.toString(millis)));
        __CLR4_1_101jle1jleluszwct4.R.inc(72183);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_Timestamp_null() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10r8nb4o1jp4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72184,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10r8nb4o1jp4() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72184);
        __CLR4_1_101jle1jleluszwct4.R.inc(72185);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72186);json.put("date", null);
        __CLR4_1_101jle1jleluszwct4.R.inc(72187);Assert.assertEquals(null, json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_Timestamp_null2() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kbdqo81jp8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_null2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72188,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kbdqo81jp8() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72188);
        __CLR4_1_101jle1jleluszwct4.R.inc(72189);Assert.assertEquals(null, TypeUtils.castToTimestamp(null));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_BigDecimal_same() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g24yru1jpa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_BigDecimal_same",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72190,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g24yru1jpa() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72190);
        __CLR4_1_101jle1jleluszwct4.R.inc(72191);BigDecimal value = new BigDecimal("123");
        __CLR4_1_101jle1jleluszwct4.R.inc(72192);Assert.assertEquals(true, value == TypeUtils.castToBigDecimal(value));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_BigInteger_same() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yrbkmb1jpd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_BigInteger_same",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72193,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yrbkmb1jpd() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72193);
        __CLR4_1_101jle1jleluszwct4.R.inc(72194);BigInteger value = new BigInteger("123");
        __CLR4_1_101jle1jleluszwct4.R.inc(72195);Assert.assertEquals(true, value == TypeUtils.castToBigInteger(value));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_Array() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10355tgz1jpg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_Array",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72196,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10355tgz1jpg() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72196);
        __CLR4_1_101jle1jleluszwct4.R.inc(72197);Assert.assertEquals(Integer[].class, TypeUtils.cast(new ArrayList(), Integer[].class, null).getClass());
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_Timestamp_util_Date() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nkwu1k1jpi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_util_Date",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72198,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nkwu1k1jpi() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72198);
        __CLR4_1_101jle1jleluszwct4.R.inc(72199);long millis = System.currentTimeMillis();

        __CLR4_1_101jle1jleluszwct4.R.inc(72200);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72201);json.put("date", new Date(millis));
        __CLR4_1_101jle1jleluszwct4.R.inc(72202);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_Timestamp_sql_Date() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s28k5c1jpn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_sql_Date",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72203,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s28k5c1jpn() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72203);
        __CLR4_1_101jle1jleluszwct4.R.inc(72204);long millis = System.currentTimeMillis();

        __CLR4_1_101jle1jleluszwct4.R.inc(72205);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72206);json.put("date", new java.sql.Date(millis));
        __CLR4_1_101jle1jleluszwct4.R.inc(72207);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_Timestamp_sql_Timestamp() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nb45zi1jps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_sql_Timestamp",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72208,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nb45zi1jps() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72208);
        __CLR4_1_101jle1jleluszwct4.R.inc(72209);long millis = System.currentTimeMillis();

        __CLR4_1_101jle1jleluszwct4.R.inc(72210);java.sql.Timestamp date = new java.sql.Timestamp(millis);
        __CLR4_1_101jle1jleluszwct4.R.inc(72211);Assert.assertEquals(date, TypeUtils.castToTimestamp(date));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_Timestamp_calendar() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108v06rl1jpw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_calendar",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72212,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108v06rl1jpw() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72212);
        __CLR4_1_101jle1jleluszwct4.R.inc(72213);long millis = System.currentTimeMillis();

        __CLR4_1_101jle1jleluszwct4.R.inc(72214);Calendar calendar = Calendar.getInstance();
        __CLR4_1_101jle1jleluszwct4.R.inc(72215);calendar.setTimeInMillis(millis);

        __CLR4_1_101jle1jleluszwct4.R.inc(72216);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72217);json.put("date", calendar);
        __CLR4_1_101jle1jleluszwct4.R.inc(72218);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_to_Timestamp_error() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10w5rr111jq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72219,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10w5rr111jq3() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72219);
        __CLR4_1_101jle1jleluszwct4.R.inc(72220);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72221);json.put("date", 0);

        __CLR4_1_101jle1jleluszwct4.R.inc(72222);JSONException error = null;
        __CLR4_1_101jle1jleluszwct4.R.inc(72223);try {
            __CLR4_1_101jle1jleluszwct4.R.inc(72224);json.getObject("date", java.sql.Timestamp.class);
        } catch (JSONException e) {
            __CLR4_1_101jle1jleluszwct4.R.inc(72225);error = e;
        }
        __CLR4_1_101jle1jleluszwct4.R.inc(72226);Assert.assertNotNull(error);
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_ab() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106s2ekb1jqb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_ab",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72227,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106s2ekb1jqb() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72227);
        __CLR4_1_101jle1jleluszwct4.R.inc(72228);B b = new B();

        __CLR4_1_101jle1jleluszwct4.R.inc(72229);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72230);json.put("value", b);
        __CLR4_1_101jle1jleluszwct4.R.inc(72231);Assert.assertEquals(b, json.getObject("value", A.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_ab_1() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ffdzdf1jqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_ab_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72232,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ffdzdf1jqg() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72232);
        __CLR4_1_101jle1jleluszwct4.R.inc(72233);B b = new B();

        __CLR4_1_101jle1jleluszwct4.R.inc(72234);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72235);json.put("value", b);
        __CLR4_1_101jle1jleluszwct4.R.inc(72236);Assert.assertEquals(b, json.getObject("value", IA.class));
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_cast_ab_error() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1032jehw1jql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_ab_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72237,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1032jehw1jql() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72237);
        __CLR4_1_101jle1jleluszwct4.R.inc(72238);A a = new A();

        __CLR4_1_101jle1jleluszwct4.R.inc(72239);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72240);json.put("value", a);

        __CLR4_1_101jle1jleluszwct4.R.inc(72241);JSONException error = null;
        __CLR4_1_101jle1jleluszwct4.R.inc(72242);try {
            __CLR4_1_101jle1jleluszwct4.R.inc(72243);json.getObject("value", B.class);
        } catch (JSONException e) {
            __CLR4_1_101jle1jleluszwct4.R.inc(72244);error = e;
        }
        __CLR4_1_101jle1jleluszwct4.R.inc(72245);Assert.assertNotNull(error);
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1jqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72246,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1jqu() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72246);
        __CLR4_1_101jle1jleluszwct4.R.inc(72247);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72248);json.put("id", 1);

        __CLR4_1_101jle1jleluszwct4.R.inc(72249);JSONException error = null;
        __CLR4_1_101jle1jleluszwct4.R.inc(72250);try {
            __CLR4_1_101jle1jleluszwct4.R.inc(72251);TypeUtils.castToJavaBean(json, C.class, ParserConfig.getGlobalInstance());
        } catch (JSONException e) {
            __CLR4_1_101jle1jleluszwct4.R.inc(72252);error = e;
        }
        __CLR4_1_101jle1jleluszwct4.R.inc(72253);Assert.assertNotNull(error);
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1jr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72254,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1jr2() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72254);
        __CLR4_1_101jle1jleluszwct4.R.inc(72255);JSONObject json = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72256);json.put("id", 1);

        __CLR4_1_101jle1jleluszwct4.R.inc(72257);Method method = TypeUtilsTest.class.getMethod("f", List.class);

        __CLR4_1_101jle1jleluszwct4.R.inc(72258);Throwable error = null;
        __CLR4_1_101jle1jleluszwct4.R.inc(72259);try {
            __CLR4_1_101jle1jleluszwct4.R.inc(72260);TypeUtils.cast(json, method.getGenericParameterTypes()[0], ParserConfig.getGlobalInstance());
        } catch (JSONException ex) {
            __CLR4_1_101jle1jleluszwct4.R.inc(72261);error = ex;
        }
        __CLR4_1_101jle1jleluszwct4.R.inc(72262);assertNotNull(error);
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101jle1jleluszwct4.R.globalSliceStart(getClass().getName(),72263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1jrb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jle1jleluszwct4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jle1jleluszwct4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72263,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1jrb() throws Exception{try{__CLR4_1_101jle1jleluszwct4.R.inc(72263);
        __CLR4_1_101jle1jleluszwct4.R.inc(72264);JSONObject map = new JSONObject();
        __CLR4_1_101jle1jleluszwct4.R.inc(72265);map.put("id", 1);
        __CLR4_1_101jle1jleluszwct4.R.inc(72266);map.put("name", "panlei");

        __CLR4_1_101jle1jleluszwct4.R.inc(72267);User user = JSON.toJavaObject(map, User.class);
        __CLR4_1_101jle1jleluszwct4.R.inc(72268);Assert.assertEquals(1L, user.getId());
        __CLR4_1_101jle1jleluszwct4.R.inc(72269);Assert.assertEquals("panlei", user.getName());
    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

    public static class User {

        private long   id;
        private String name;

        public long getId() {try{__CLR4_1_101jle1jleluszwct4.R.inc(72270);
            __CLR4_1_101jle1jleluszwct4.R.inc(72271);return id;
        }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

        public void setId(long id) {try{__CLR4_1_101jle1jleluszwct4.R.inc(72272);
            __CLR4_1_101jle1jleluszwct4.R.inc(72273);this.id = id;
        }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101jle1jleluszwct4.R.inc(72274);
            __CLR4_1_101jle1jleluszwct4.R.inc(72275);return name;
        }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101jle1jleluszwct4.R.inc(72276);
            __CLR4_1_101jle1jleluszwct4.R.inc(72277);this.name = name;
        }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}
    }

    public static class A implements IA {

    }

    public static interface IA {

    }

    public static class B extends A {

    }

    public static class C extends B {

        public int getId() {try{__CLR4_1_101jle1jleluszwct4.R.inc(72278);
            __CLR4_1_101jle1jleluszwct4.R.inc(72279);throw new UnsupportedOperationException();
        }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101jle1jleluszwct4.R.inc(72280);
            __CLR4_1_101jle1jleluszwct4.R.inc(72281);throw new UnsupportedOperationException();
        }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}
    }

    public static void f(List<?> list) {try{__CLR4_1_101jle1jleluszwct4.R.inc(72282);

    }finally{__CLR4_1_101jle1jleluszwct4.R.flushNeeded();}}
}
