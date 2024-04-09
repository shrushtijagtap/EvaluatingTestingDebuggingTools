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
public class TypeUtilsTest extends TestCase {static class __CLR4_1_101in61in6lusqke46{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,71051,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21in6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70818,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21in6() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70818);
        __CLR4_1_101in61in6lusqke46.R.inc(70819);HashMap map = new HashMap();

        __CLR4_1_101in61in6lusqke46.R.inc(70820);Assert.assertTrue(map == TypeUtils.castToJavaBean(map, Map.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1in9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70821,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1in9() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70821);
        __CLR4_1_101in61in6lusqke46.R.inc(70822);JSONObject map = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70823);Assert.assertTrue(map == TypeUtils.castToJavaBean(map, Map.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441inc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70824,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441inc() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70824);
        __CLR4_1_101in61in6lusqke46.R.inc(70825);JSONObject map = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70826);map.put("id", 1);
        __CLR4_1_101in61in6lusqke46.R.inc(70827);map.put("name", "panlei");

        __CLR4_1_101in61in6lusqke46.R.inc(70828);User user = TypeUtils.castToJavaBean(map, User.class);
        __CLR4_1_101in61in6lusqke46.R.inc(70829);Assert.assertEquals(1L, user.getId());
        __CLR4_1_101in61in6lusqke46.R.inc(70830);Assert.assertEquals("panlei", user.getName());
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_Integer() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tucuqa1inj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_Integer",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70831,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tucuqa1inj() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70831);
        __CLR4_1_101in61in6lusqke46.R.inc(70832);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70833);json.put("id", 1L);
        __CLR4_1_101in61in6lusqke46.R.inc(70834);Assert.assertEquals(new Integer(1), json.getObject("id", int.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_Integer_2() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109ollgb1inn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_Integer_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70835,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109ollgb1inn() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70835);
        __CLR4_1_101in61in6lusqke46.R.inc(70836);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70837);json.put("id", 1L);
        __CLR4_1_101in61in6lusqke46.R.inc(70838);Assert.assertEquals(new Integer(1), json.getObject("id", Integer.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_long() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10et4vsk1inr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_long",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70839,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10et4vsk1inr() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70839);
        __CLR4_1_101in61in6lusqke46.R.inc(70840);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70841);json.put("id", 1);
        __CLR4_1_101in61in6lusqke46.R.inc(70842);Assert.assertEquals(new Long(1), json.getObject("id", long.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_Long() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101lgd1w1inv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Long",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70843,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101lgd1w1inv() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70843);
        __CLR4_1_101in61in6lusqke46.R.inc(70844);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70845);json.put("id", 1);
        __CLR4_1_101in61in6lusqke46.R.inc(70846);Assert.assertEquals(new Long(1), json.getObject("id", Long.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_short() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108og4y1inz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_short",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70847,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108og4y1inz() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70847);
        __CLR4_1_101in61in6lusqke46.R.inc(70848);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70849);json.put("id", 1);
        __CLR4_1_101in61in6lusqke46.R.inc(70850);Assert.assertEquals(new Short((short) 1), json.getObject("id", short.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_Short() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gt8n0y1io3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Short",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70851,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gt8n0y1io3() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70851);
        __CLR4_1_101in61in6lusqke46.R.inc(70852);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70853);json.put("id", 1);
        __CLR4_1_101in61in6lusqke46.R.inc(70854);Assert.assertEquals(new Short((short) 1), json.getObject("id", Short.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_byte() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pbb37k1io7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_byte",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70855,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pbb37k1io7() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70855);
        __CLR4_1_101in61in6lusqke46.R.inc(70856);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70857);json.put("id", 1);
        __CLR4_1_101in61in6lusqke46.R.inc(70858);Assert.assertEquals(new Byte((byte) 1), json.getObject("id", byte.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_Byte() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wi4g0w1iob();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Byte",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70859,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wi4g0w1iob() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70859);
        __CLR4_1_101in61in6lusqke46.R.inc(70860);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70861);json.put("id", 1);
        __CLR4_1_101in61in6lusqke46.R.inc(70862);Assert.assertEquals(new Byte((byte) 1), json.getObject("id", Byte.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_BigInteger() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rv0gc61iof();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_BigInteger",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70863,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rv0gc61iof() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70863);
        __CLR4_1_101in61in6lusqke46.R.inc(70864);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70865);json.put("id", 1);
        __CLR4_1_101in61in6lusqke46.R.inc(70866);Assert.assertEquals(new BigInteger("1"), json.getObject("id", BigInteger.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_BigDecimal() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1075lnc91ioj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_BigDecimal",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70867,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1075lnc91ioj() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70867);
        __CLR4_1_101in61in6lusqke46.R.inc(70868);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70869);json.put("id", 1);
        __CLR4_1_101in61in6lusqke46.R.inc(70870);Assert.assertEquals(new BigDecimal("1"), json.getObject("id", BigDecimal.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_boolean() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yos5b61ion();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_boolean",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70871,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yos5b61ion() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70871);
        __CLR4_1_101in61in6lusqke46.R.inc(70872);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70873);json.put("id", 1);
        __CLR4_1_101in61in6lusqke46.R.inc(70874);Assert.assertEquals(Boolean.TRUE, json.getObject("id", boolean.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_Boolean() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kr0jk21ior();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Boolean",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70875,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kr0jk21ior() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70875);
        __CLR4_1_101in61in6lusqke46.R.inc(70876);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70877);json.put("id", 1);
        __CLR4_1_101in61in6lusqke46.R.inc(70878);Assert.assertEquals(Boolean.TRUE, json.getObject("id", Boolean.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_null() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gxilup1iov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70879,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gxilup1iov() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70879);
        __CLR4_1_101in61in6lusqke46.R.inc(70880);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70881);json.put("id", null);
        __CLR4_1_101in61in6lusqke46.R.inc(70882);Assert.assertEquals(null, json.getObject("id", Boolean.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_String() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10iar0vr1ioz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_String",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70883,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10iar0vr1ioz() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70883);
        __CLR4_1_101in61in6lusqke46.R.inc(70884);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70885);json.put("id", 1);
        __CLR4_1_101in61in6lusqke46.R.inc(70886);Assert.assertEquals("1", json.getObject("id", String.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_Date() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10meu96u1ip3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Date",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70887,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10meu96u1ip3() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70887);
        __CLR4_1_101in61in6lusqke46.R.inc(70888);long millis = System.currentTimeMillis();

        __CLR4_1_101in61in6lusqke46.R.inc(70889);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70890);json.put("date", millis);
        __CLR4_1_101in61in6lusqke46.R.inc(70891);Assert.assertEquals(new Date(millis), json.getObject("date", Date.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_SqlDate() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10si5csu1ip8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70892,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10si5csu1ip8() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70892);
        __CLR4_1_101in61in6lusqke46.R.inc(70893);long millis = System.currentTimeMillis();

        __CLR4_1_101in61in6lusqke46.R.inc(70894);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70895);json.put("date", millis);
        __CLR4_1_101in61in6lusqke46.R.inc(70896);Assert.assertEquals(new java.sql.Date(millis), json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_SqlDate_string() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dnsvbo1ipd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_string",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70897,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dnsvbo1ipd() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70897);
        __CLR4_1_101in61in6lusqke46.R.inc(70898);long millis = System.currentTimeMillis();

        __CLR4_1_101in61in6lusqke46.R.inc(70899);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70900);json.put("date", Long.toString(millis));
        __CLR4_1_101in61in6lusqke46.R.inc(70901);Assert.assertEquals(new java.sql.Date(millis), json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_SqlDate_null() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10uhy5su1ipi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70902,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10uhy5su1ipi() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70902);
        __CLR4_1_101in61in6lusqke46.R.inc(70903);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70904);json.put("date", null);
        __CLR4_1_101in61in6lusqke46.R.inc(70905);Assert.assertEquals(null, json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_SqlDate_null2() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kqhygu1ipm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_null2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70906,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kqhygu1ipm() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70906);
        __CLR4_1_101in61in6lusqke46.R.inc(70907);Assert.assertEquals(null, TypeUtils.castToSqlDate(null));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_SqlDate_util_Date() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lo5tzy1ipo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_util_Date",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70908,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lo5tzy1ipo() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70908);
        __CLR4_1_101in61in6lusqke46.R.inc(70909);long millis = System.currentTimeMillis();

        __CLR4_1_101in61in6lusqke46.R.inc(70910);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70911);json.put("date", new Date(millis));
        __CLR4_1_101in61in6lusqke46.R.inc(70912);Assert.assertEquals(new java.sql.Date(millis), json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_SqlDate_sql_Date() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jzs5kq1ipt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_sql_Date",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70913,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jzs5kq1ipt() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70913);
        __CLR4_1_101in61in6lusqke46.R.inc(70914);long millis = System.currentTimeMillis();

        __CLR4_1_101in61in6lusqke46.R.inc(70915);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70916);json.put("date", new java.sql.Date(millis));
        __CLR4_1_101in61in6lusqke46.R.inc(70917);Assert.assertEquals(new java.sql.Date(millis), json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_SqlDate_sql_Date2() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nbojom1ipy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_sql_Date2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70918,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nbojom1ipy() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70918);
        __CLR4_1_101in61in6lusqke46.R.inc(70919);long millis = System.currentTimeMillis();

        __CLR4_1_101in61in6lusqke46.R.inc(70920);java.sql.Date date = new java.sql.Date(millis);
        __CLR4_1_101in61in6lusqke46.R.inc(70921);Assert.assertEquals(date, TypeUtils.castToSqlDate(date));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_SqlDate_calendar() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vu3j0n1iq2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_calendar",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70922,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vu3j0n1iq2() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70922);
        __CLR4_1_101in61in6lusqke46.R.inc(70923);long millis = System.currentTimeMillis();

        __CLR4_1_101in61in6lusqke46.R.inc(70924);Calendar calendar = Calendar.getInstance();
        __CLR4_1_101in61in6lusqke46.R.inc(70925);calendar.setTimeInMillis(millis);

        __CLR4_1_101in61in6lusqke46.R.inc(70926);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70927);json.put("date", calendar);
        __CLR4_1_101in61in6lusqke46.R.inc(70928);Assert.assertEquals(new java.sql.Date(millis), json.getObject("date", java.sql.Date.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_SqlDate_error() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1026je6z1iq9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_SqlDate_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70929,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1026je6z1iq9() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70929);
        __CLR4_1_101in61in6lusqke46.R.inc(70930);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70931);json.put("date", 0);

        __CLR4_1_101in61in6lusqke46.R.inc(70932);JSONException error = null;
        __CLR4_1_101in61in6lusqke46.R.inc(70933);try {
            __CLR4_1_101in61in6lusqke46.R.inc(70934);json.getObject("date", java.sql.Date.class);
        } catch (JSONException e) {
            __CLR4_1_101in61in6lusqke46.R.inc(70935);error = e;
        }
        __CLR4_1_101in61in6lusqke46.R.inc(70936);Assert.assertNotNull(error);
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_Timestamp() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mdqc2c1iqh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70937,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mdqc2c1iqh() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70937);
        __CLR4_1_101in61in6lusqke46.R.inc(70938);long millis = System.currentTimeMillis();

        __CLR4_1_101in61in6lusqke46.R.inc(70939);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70940);json.put("date", millis);
        __CLR4_1_101in61in6lusqke46.R.inc(70941);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_Timestamp_string() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107q2j4e1iqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_string",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70942,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107q2j4e1iqm() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70942);
        __CLR4_1_101in61in6lusqke46.R.inc(70943);long millis = System.currentTimeMillis();

        __CLR4_1_101in61in6lusqke46.R.inc(70944);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70945);json.put("date", Long.toString(millis));
        __CLR4_1_101in61in6lusqke46.R.inc(70946);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_Timestamp_number() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qbqwa21iqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_number",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70947,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qbqwa21iqr() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70947);
        __CLR4_1_101in61in6lusqke46.R.inc(70948);long millis = System.currentTimeMillis();

        __CLR4_1_101in61in6lusqke46.R.inc(70949);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70950);json.put("date", new BigDecimal(Long.toString(millis)));
        __CLR4_1_101in61in6lusqke46.R.inc(70951);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_Timestamp_null() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10r8nb4o1iqw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70952,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10r8nb4o1iqw() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70952);
        __CLR4_1_101in61in6lusqke46.R.inc(70953);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70954);json.put("date", null);
        __CLR4_1_101in61in6lusqke46.R.inc(70955);Assert.assertEquals(null, json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_Timestamp_null2() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kbdqo81ir0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_null2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70956,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kbdqo81ir0() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70956);
        __CLR4_1_101in61in6lusqke46.R.inc(70957);Assert.assertEquals(null, TypeUtils.castToTimestamp(null));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_BigDecimal_same() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g24yru1ir2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_BigDecimal_same",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70958,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g24yru1ir2() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70958);
        __CLR4_1_101in61in6lusqke46.R.inc(70959);BigDecimal value = new BigDecimal("123");
        __CLR4_1_101in61in6lusqke46.R.inc(70960);Assert.assertEquals(true, value == TypeUtils.castToBigDecimal(value));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_BigInteger_same() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yrbkmb1ir5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_BigInteger_same",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70961,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yrbkmb1ir5() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70961);
        __CLR4_1_101in61in6lusqke46.R.inc(70962);BigInteger value = new BigInteger("123");
        __CLR4_1_101in61in6lusqke46.R.inc(70963);Assert.assertEquals(true, value == TypeUtils.castToBigInteger(value));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_Array() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10355tgz1ir8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_Array",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70964,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10355tgz1ir8() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70964);
        __CLR4_1_101in61in6lusqke46.R.inc(70965);Assert.assertEquals(Integer[].class, TypeUtils.cast(new ArrayList(), Integer[].class, null).getClass());
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_Timestamp_util_Date() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nkwu1k1ira();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_util_Date",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70966,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nkwu1k1ira() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70966);
        __CLR4_1_101in61in6lusqke46.R.inc(70967);long millis = System.currentTimeMillis();

        __CLR4_1_101in61in6lusqke46.R.inc(70968);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70969);json.put("date", new Date(millis));
        __CLR4_1_101in61in6lusqke46.R.inc(70970);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_Timestamp_sql_Date() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s28k5c1irf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_sql_Date",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70971,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s28k5c1irf() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70971);
        __CLR4_1_101in61in6lusqke46.R.inc(70972);long millis = System.currentTimeMillis();

        __CLR4_1_101in61in6lusqke46.R.inc(70973);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70974);json.put("date", new java.sql.Date(millis));
        __CLR4_1_101in61in6lusqke46.R.inc(70975);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_Timestamp_sql_Timestamp() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nb45zi1irk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_sql_Timestamp",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70976,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nb45zi1irk() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70976);
        __CLR4_1_101in61in6lusqke46.R.inc(70977);long millis = System.currentTimeMillis();

        __CLR4_1_101in61in6lusqke46.R.inc(70978);java.sql.Timestamp date = new java.sql.Timestamp(millis);
        __CLR4_1_101in61in6lusqke46.R.inc(70979);Assert.assertEquals(date, TypeUtils.castToTimestamp(date));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_Timestamp_calendar() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108v06rl1iro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_calendar",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70980,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108v06rl1iro() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70980);
        __CLR4_1_101in61in6lusqke46.R.inc(70981);long millis = System.currentTimeMillis();

        __CLR4_1_101in61in6lusqke46.R.inc(70982);Calendar calendar = Calendar.getInstance();
        __CLR4_1_101in61in6lusqke46.R.inc(70983);calendar.setTimeInMillis(millis);

        __CLR4_1_101in61in6lusqke46.R.inc(70984);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70985);json.put("date", calendar);
        __CLR4_1_101in61in6lusqke46.R.inc(70986);Assert.assertEquals(new java.sql.Timestamp(millis), json.getObject("date", java.sql.Timestamp.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_to_Timestamp_error() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10w5rr111irv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_to_Timestamp_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70987,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10w5rr111irv() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70987);
        __CLR4_1_101in61in6lusqke46.R.inc(70988);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70989);json.put("date", 0);

        __CLR4_1_101in61in6lusqke46.R.inc(70990);JSONException error = null;
        __CLR4_1_101in61in6lusqke46.R.inc(70991);try {
            __CLR4_1_101in61in6lusqke46.R.inc(70992);json.getObject("date", java.sql.Timestamp.class);
        } catch (JSONException e) {
            __CLR4_1_101in61in6lusqke46.R.inc(70993);error = e;
        }
        __CLR4_1_101in61in6lusqke46.R.inc(70994);Assert.assertNotNull(error);
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_ab() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),70995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106s2ekb1is3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_ab",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70995,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106s2ekb1is3() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(70995);
        __CLR4_1_101in61in6lusqke46.R.inc(70996);B b = new B();

        __CLR4_1_101in61in6lusqke46.R.inc(70997);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(70998);json.put("value", b);
        __CLR4_1_101in61in6lusqke46.R.inc(70999);Assert.assertEquals(b, json.getObject("value", A.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_ab_1() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),71000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ffdzdf1is8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_ab_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71000,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ffdzdf1is8() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(71000);
        __CLR4_1_101in61in6lusqke46.R.inc(71001);B b = new B();

        __CLR4_1_101in61in6lusqke46.R.inc(71002);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(71003);json.put("value", b);
        __CLR4_1_101in61in6lusqke46.R.inc(71004);Assert.assertEquals(b, json.getObject("value", IA.class));
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_cast_ab_error() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),71005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1032jehw1isd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_cast_ab_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71005,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1032jehw1isd() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(71005);
        __CLR4_1_101in61in6lusqke46.R.inc(71006);A a = new A();

        __CLR4_1_101in61in6lusqke46.R.inc(71007);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(71008);json.put("value", a);

        __CLR4_1_101in61in6lusqke46.R.inc(71009);JSONException error = null;
        __CLR4_1_101in61in6lusqke46.R.inc(71010);try {
            __CLR4_1_101in61in6lusqke46.R.inc(71011);json.getObject("value", B.class);
        } catch (JSONException e) {
            __CLR4_1_101in61in6lusqke46.R.inc(71012);error = e;
        }
        __CLR4_1_101in61in6lusqke46.R.inc(71013);Assert.assertNotNull(error);
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),71014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1ism();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71014,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1ism() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(71014);
        __CLR4_1_101in61in6lusqke46.R.inc(71015);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(71016);json.put("id", 1);

        __CLR4_1_101in61in6lusqke46.R.inc(71017);JSONException error = null;
        __CLR4_1_101in61in6lusqke46.R.inc(71018);try {
            __CLR4_1_101in61in6lusqke46.R.inc(71019);TypeUtils.castToJavaBean(json, C.class, ParserConfig.getGlobalInstance());
        } catch (JSONException e) {
            __CLR4_1_101in61in6lusqke46.R.inc(71020);error = e;
        }
        __CLR4_1_101in61in6lusqke46.R.inc(71021);Assert.assertNotNull(error);
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),71022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1isu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71022,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1isu() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(71022);
        __CLR4_1_101in61in6lusqke46.R.inc(71023);JSONObject json = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(71024);json.put("id", 1);

        __CLR4_1_101in61in6lusqke46.R.inc(71025);Method method = TypeUtilsTest.class.getMethod("f", List.class);

        __CLR4_1_101in61in6lusqke46.R.inc(71026);Throwable error = null;
        __CLR4_1_101in61in6lusqke46.R.inc(71027);try {
            __CLR4_1_101in61in6lusqke46.R.inc(71028);TypeUtils.cast(json, method.getGenericParameterTypes()[0], ParserConfig.getGlobalInstance());
        } catch (JSONException ex) {
            __CLR4_1_101in61in6lusqke46.R.inc(71029);error = ex;
        }
        __CLR4_1_101in61in6lusqke46.R.inc(71030);assertNotNull(error);
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101in61in6lusqke46.R.globalSliceStart(getClass().getName(),71031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1it3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101in61in6lusqke46.R.rethrow($CLV_t2$);}finally{__CLR4_1_101in61in6lusqke46.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71031,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1it3() throws Exception{try{__CLR4_1_101in61in6lusqke46.R.inc(71031);
        __CLR4_1_101in61in6lusqke46.R.inc(71032);JSONObject map = new JSONObject();
        __CLR4_1_101in61in6lusqke46.R.inc(71033);map.put("id", 1);
        __CLR4_1_101in61in6lusqke46.R.inc(71034);map.put("name", "panlei");

        __CLR4_1_101in61in6lusqke46.R.inc(71035);User user = JSON.toJavaObject(map, User.class);
        __CLR4_1_101in61in6lusqke46.R.inc(71036);Assert.assertEquals(1L, user.getId());
        __CLR4_1_101in61in6lusqke46.R.inc(71037);Assert.assertEquals("panlei", user.getName());
    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

    public static class User {

        private long   id;
        private String name;

        public long getId() {try{__CLR4_1_101in61in6lusqke46.R.inc(71038);
            __CLR4_1_101in61in6lusqke46.R.inc(71039);return id;
        }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

        public void setId(long id) {try{__CLR4_1_101in61in6lusqke46.R.inc(71040);
            __CLR4_1_101in61in6lusqke46.R.inc(71041);this.id = id;
        }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101in61in6lusqke46.R.inc(71042);
            __CLR4_1_101in61in6lusqke46.R.inc(71043);return name;
        }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101in61in6lusqke46.R.inc(71044);
            __CLR4_1_101in61in6lusqke46.R.inc(71045);this.name = name;
        }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}
    }

    public static class A implements IA {

    }

    public static interface IA {

    }

    public static class B extends A {

    }

    public static class C extends B {

        public int getId() {try{__CLR4_1_101in61in6lusqke46.R.inc(71046);
            __CLR4_1_101in61in6lusqke46.R.inc(71047);throw new UnsupportedOperationException();
        }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101in61in6lusqke46.R.inc(71048);
            __CLR4_1_101in61in6lusqke46.R.inc(71049);throw new UnsupportedOperationException();
        }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}
    }

    public static void f(List<?> list) {try{__CLR4_1_101in61in6lusqke46.R.inc(71050);

    }finally{__CLR4_1_101in61in6lusqke46.R.flushNeeded();}}
}
