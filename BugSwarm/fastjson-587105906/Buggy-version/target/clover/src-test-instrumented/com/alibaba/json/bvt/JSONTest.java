/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//*
 * Copyright 1999-2017 Alibaba Group.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.json.bvt;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.HashMap;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class JSONTest extends TestCase {static class __CLR4_1_10y5qy5qluszw5la{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,44356,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_number() throws Exception {__CLR4_1_10y5qy5qluszw5la.R.globalSliceStart(getClass().getName(),44270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nvgwdfy5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y5qy5qluszw5la.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y5qy5qluszw5la.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_number",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44270,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nvgwdfy5q() throws Exception{try{__CLR4_1_10y5qy5qluszw5la.R.inc(44270);
        __CLR4_1_10y5qy5qluszw5la.R.inc(44271);Assert.assertEquals("3", JSON.parse("3").toString());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44272);Assert.assertEquals("34", JSON.parse("34").toString());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44273);Assert.assertEquals("922337203685477580755", JSON.parse("922337203685477580755").toString());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44274);Assert.assertEquals("-34", JSON.parse("-34").toString());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44275);Assert.assertEquals(new BigDecimal("9.223372036854776E18"), new BigDecimal(JSON.parse("9.223372036854776E18").toString()));
        __CLR4_1_10y5qy5qluszw5la.R.inc(44276);Assert.assertEquals(new BigDecimal("9.223372036854776E+18"), new BigDecimal(JSON.parse("9.223372036854776E+18").toString()));
        __CLR4_1_10y5qy5qluszw5la.R.inc(44277);Assert.assertEquals(new BigDecimal("9.223372036854776E-18"), new BigDecimal(JSON.parse("9.223372036854776E-18").toString()));
    }finally{__CLR4_1_10y5qy5qluszw5la.R.flushNeeded();}}

    public void test_string() throws Exception {__CLR4_1_10y5qy5qluszw5la.R.globalSliceStart(getClass().getName(),44278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10d3tq79y5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y5qy5qluszw5la.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y5qy5qluszw5la.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_string",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44278,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10d3tq79y5y() throws Exception{try{__CLR4_1_10y5qy5qluszw5la.R.inc(44278);
        __CLR4_1_10y5qy5qluszw5la.R.inc(44279);Assert.assertEquals("", JSON.parse("\"\"").toString());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44280);Assert.assertEquals("3", JSON.parse("\"3\"").toString());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44281);Assert.assertEquals("34", JSON.parse("\"34\"").toString());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44282);Assert.assertEquals("3\\4", JSON.parse("\"3\\\\4\"").toString());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44283);Assert.assertEquals("3\"4", JSON.parse("\"3\\\"4\"").toString());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44284);Assert.assertEquals("3\\b4", JSON.parse("\"3\\\\b4\"").toString());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44285);Assert.assertEquals("3\\f4", JSON.parse("\"3\\\\f4\"").toString());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44286);Assert.assertEquals("3\\n4", JSON.parse("\"3\\\\n4\"").toString());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44287);Assert.assertEquals("3\\r4", JSON.parse("\"3\\\\r4\"").toString());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44288);Assert.assertEquals("3\\t4", JSON.parse("\"3\\\\t4\"").toString());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44289);Assert.assertEquals("\u4e2d\u56fd", JSON.parse("\"\u4e2d\u56fd\"").toString());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44290);Assert.assertEquals("\u4e2d\u56fd", JSON.parse("\"\\u4E2D\\u56FD\"").toString());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44291);Assert.assertEquals("", JSON.parse("\"\\u001F\"").toString());
    }finally{__CLR4_1_10y5qy5qluszw5la.R.flushNeeded();}}
    
    public void test_for_jh() throws Exception {__CLR4_1_10y5qy5qluszw5la.R.globalSliceStart(getClass().getName(),44292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10by5onsy6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y5qy5qluszw5la.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y5qy5qluszw5la.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_for_jh",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44292,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10by5onsy6c() throws Exception{try{__CLR4_1_10y5qy5qluszw5la.R.inc(44292);
        __CLR4_1_10y5qy5qluszw5la.R.inc(44293);String text = "[{\"I.13\":\"XEMwXFMweGEuMHhjOFxGy87M5VxUxOO6ww==\",\"I.18\":\"MA==\"},{\"I.13\":\"XEMwXFMweGEuMHhjOFxGy87M5VxUxOO6ww==\",\"I.18\":\"MA==\"}]";
        __CLR4_1_10y5qy5qluszw5la.R.inc(44294);JSON.parse(text);
        __CLR4_1_10y5qy5qluszw5la.R.inc(44295);JSON.parseArray(text);
    }finally{__CLR4_1_10y5qy5qluszw5la.R.flushNeeded();}}

    public void test_value() throws Exception {__CLR4_1_10y5qy5qluszw5la.R.globalSliceStart(getClass().getName(),44296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10z4o0nfy6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y5qy5qluszw5la.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y5qy5qluszw5la.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_value",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44296,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10z4o0nfy6g() throws Exception{try{__CLR4_1_10y5qy5qluszw5la.R.inc(44296);
        __CLR4_1_10y5qy5qluszw5la.R.inc(44297);Assert.assertEquals(Boolean.TRUE, JSON.parse("true"));
        __CLR4_1_10y5qy5qluszw5la.R.inc(44298);Assert.assertEquals(Boolean.FALSE, JSON.parse("false"));
        __CLR4_1_10y5qy5qluszw5la.R.inc(44299);Assert.assertEquals(null, JSON.parse("null"));
    }finally{__CLR4_1_10y5qy5qluszw5la.R.flushNeeded();}}

    public void test_object() throws Exception {__CLR4_1_10y5qy5qluszw5la.R.globalSliceStart(getClass().getName(),44300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102k5qaby6k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y5qy5qluszw5la.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y5qy5qluszw5la.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_object",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44300,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102k5qaby6k() throws Exception{try{__CLR4_1_10y5qy5qluszw5la.R.inc(44300);
        __CLR4_1_10y5qy5qluszw5la.R.inc(44301);Assert.assertTrue(JSON.parseObject("{}").size() == 0);
        __CLR4_1_10y5qy5qluszw5la.R.inc(44302);Assert.assertEquals(1, JSON.parseObject("{\"K\":3}").size());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44303);Assert.assertEquals(3, ((Number) JSON.parseObject("{\"K\":3}").get("K")).intValue());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44304);Assert.assertEquals(2, JSON.parseObject("{\"K1\":3,\"K2\":4}").size());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44305);Assert.assertEquals(3, ((Number) JSON.parseObject("{\"K1\":3,\"K2\":4}").get("K1")).intValue());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44306);Assert.assertEquals(4, ((Number) JSON.parseObject("{\"K1\":3,\"K2\":4}").get("K2")).intValue());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44307);Assert.assertEquals(1, JSON.parseObject("{\"K\":{}}").size());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44308);Assert.assertEquals(1, JSON.parseObject("{\"K\":[]}").size());
    }finally{__CLR4_1_10y5qy5qluszw5la.R.flushNeeded();}}

    public void test_array() throws Exception {__CLR4_1_10y5qy5qluszw5la.R.globalSliceStart(getClass().getName(),44309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vw0vd9y6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y5qy5qluszw5la.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y5qy5qluszw5la.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_array",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44309,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vw0vd9y6t() throws Exception{try{__CLR4_1_10y5qy5qluszw5la.R.inc(44309);
        __CLR4_1_10y5qy5qluszw5la.R.inc(44310);Assert.assertEquals(0, JSON.parseArray("[]").size());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44311);Assert.assertEquals(1, JSON.parseArray("[1]").size());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44312);Assert.assertEquals(1, ((Number) JSON.parseArray("[1]").get(0)).intValue());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44313);Assert.assertEquals(3, JSON.parseArray("[1,2, 3]").size());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44314);Assert.assertEquals(1, ((Number) JSON.parseArray("[1,2, 3]").get(0)).intValue());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44315);Assert.assertEquals(2, ((Number) JSON.parseArray("[1,2, 3]").get(1)).intValue());
        __CLR4_1_10y5qy5qluszw5la.R.inc(44316);Assert.assertEquals(3, ((Number) JSON.parseArray("[1,2, 3]").get(2)).intValue());
    }finally{__CLR4_1_10y5qy5qluszw5la.R.flushNeeded();}}

    public void test_all() throws Exception {__CLR4_1_10y5qy5qluszw5la.R.globalSliceStart(getClass().getName(),44317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pxmdoly71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y5qy5qluszw5la.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y5qy5qluszw5la.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_all",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44317,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pxmdoly71() throws Exception{try{__CLR4_1_10y5qy5qluszw5la.R.inc(44317);
        __CLR4_1_10y5qy5qluszw5la.R.inc(44318);Assert.assertEquals(null, JSON.parse(null));
        __CLR4_1_10y5qy5qluszw5la.R.inc(44319);Assert.assertEquals("{}", JSON.toJSONString(new HashMap<String, Object>()));
        __CLR4_1_10y5qy5qluszw5la.R.inc(44320);Assert.assertEquals("{}", JSON.toJSONString(new HashMap<String, Object>(), true));
        __CLR4_1_10y5qy5qluszw5la.R.inc(44321);Assert.assertEquals("{}", JSON.toJSONString(new HashMap<String, Object>(), true));
        __CLR4_1_10y5qy5qluszw5la.R.inc(44322);Assert.assertEquals(null, JSON.parseObject(null));
        __CLR4_1_10y5qy5qluszw5la.R.inc(44323);Assert.assertEquals(null, JSON.parseArray(null));
        __CLR4_1_10y5qy5qluszw5la.R.inc(44324);Assert.assertEquals(null, JSON.parseObject(null, Object.class));
        __CLR4_1_10y5qy5qluszw5la.R.inc(44325);Assert.assertEquals(null, JSON.parseArray(null, Object.class));
    }finally{__CLR4_1_10y5qy5qluszw5la.R.flushNeeded();}}

    public void test_writeTo_0() throws Exception {__CLR4_1_10y5qy5qluszw5la.R.globalSliceStart(getClass().getName(),44326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10imn8jpy7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y5qy5qluszw5la.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y5qy5qluszw5la.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_writeTo_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44326,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10imn8jpy7a() throws Exception{try{__CLR4_1_10y5qy5qluszw5la.R.inc(44326);
        __CLR4_1_10y5qy5qluszw5la.R.inc(44327);SerializeWriter out = new SerializeWriter();

        __CLR4_1_10y5qy5qluszw5la.R.inc(44328);JSONObject json = new JSONObject();
        __CLR4_1_10y5qy5qluszw5la.R.inc(44329);json.writeJSONString(out);

        __CLR4_1_10y5qy5qluszw5la.R.inc(44330);Assert.assertEquals("{}", out.toString());
    }finally{__CLR4_1_10y5qy5qluszw5la.R.flushNeeded();}}

    public void test_writeTo_1() throws Exception {__CLR4_1_10y5qy5qluszw5la.R.globalSliceStart(getClass().getName(),44331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lvn7c6y7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y5qy5qluszw5la.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y5qy5qluszw5la.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_writeTo_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44331,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lvn7c6y7f() throws Exception{try{__CLR4_1_10y5qy5qluszw5la.R.inc(44331);
        __CLR4_1_10y5qy5qluszw5la.R.inc(44332);StringWriter out = new StringWriter();

        __CLR4_1_10y5qy5qluszw5la.R.inc(44333);JSONObject json = new JSONObject();
        __CLR4_1_10y5qy5qluszw5la.R.inc(44334);json.writeJSONString(out);

        __CLR4_1_10y5qy5qluszw5la.R.inc(44335);Assert.assertEquals("{}", out.toString());
    }finally{__CLR4_1_10y5qy5qluszw5la.R.flushNeeded();}}

    public void test_writeTo_2() throws Exception {__CLR4_1_10y5qy5qluszw5la.R.globalSliceStart(getClass().getName(),44336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10p4n64ny7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y5qy5qluszw5la.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y5qy5qluszw5la.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_writeTo_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44336,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10p4n64ny7k() throws Exception{try{__CLR4_1_10y5qy5qluszw5la.R.inc(44336);
        __CLR4_1_10y5qy5qluszw5la.R.inc(44337);StringBuffer out = new StringBuffer();

        __CLR4_1_10y5qy5qluszw5la.R.inc(44338);JSONObject json = new JSONObject();
        __CLR4_1_10y5qy5qluszw5la.R.inc(44339);json.writeJSONString(out);

        __CLR4_1_10y5qy5qluszw5la.R.inc(44340);Assert.assertEquals("{}", out.toString());
    }finally{__CLR4_1_10y5qy5qluszw5la.R.flushNeeded();}}

    public void test_writeTo_error() throws Exception {__CLR4_1_10y5qy5qluszw5la.R.globalSliceStart(getClass().getName(),44341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fnjajny7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y5qy5qluszw5la.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y5qy5qluszw5la.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_writeTo_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44341,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fnjajny7p() throws Exception{try{__CLR4_1_10y5qy5qluszw5la.R.inc(44341);
        __CLR4_1_10y5qy5qluszw5la.R.inc(44342);JSONException error = null;
        __CLR4_1_10y5qy5qluszw5la.R.inc(44343);try {
            __CLR4_1_10y5qy5qluszw5la.R.inc(44344);JSONObject json = new JSONObject();
            __CLR4_1_10y5qy5qluszw5la.R.inc(44345);json.writeJSONString(new ErrorAppendable());
        } catch (JSONException e) {
            __CLR4_1_10y5qy5qluszw5la.R.inc(44346);error = e;
        }
        __CLR4_1_10y5qy5qluszw5la.R.inc(44347);Assert.assertNotNull(error);
    }finally{__CLR4_1_10y5qy5qluszw5la.R.flushNeeded();}}

    public void test_fromJavaObject_null() throws Exception {__CLR4_1_10y5qy5qluszw5la.R.globalSliceStart(getClass().getName(),44348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102xidedy7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10y5qy5qluszw5la.R.rethrow($CLV_t2$);}finally{__CLR4_1_10y5qy5qluszw5la.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_fromJavaObject_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44348,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102xidedy7w() throws Exception{try{__CLR4_1_10y5qy5qluszw5la.R.inc(44348);
        __CLR4_1_10y5qy5qluszw5la.R.inc(44349);Assert.assertEquals(null, JSON.toJSON(null));
    }finally{__CLR4_1_10y5qy5qluszw5la.R.flushNeeded();}}

    private final class ErrorAppendable implements Appendable {

        public Appendable append(CharSequence csq, int start, int end) throws IOException {try{__CLR4_1_10y5qy5qluszw5la.R.inc(44350);
            __CLR4_1_10y5qy5qluszw5la.R.inc(44351);throw new IOException("");
        }finally{__CLR4_1_10y5qy5qluszw5la.R.flushNeeded();}}

        public Appendable append(char c) throws IOException {try{__CLR4_1_10y5qy5qluszw5la.R.inc(44352);
            __CLR4_1_10y5qy5qluszw5la.R.inc(44353);throw new IOException("");
        }finally{__CLR4_1_10y5qy5qluszw5la.R.flushNeeded();}}

        public Appendable append(CharSequence csq) throws IOException {try{__CLR4_1_10y5qy5qluszw5la.R.inc(44354);
            __CLR4_1_10y5qy5qluszw5la.R.inc(44355);throw new IOException("");
        }finally{__CLR4_1_10y5qy5qluszw5la.R.flushNeeded();}}
    }
}
