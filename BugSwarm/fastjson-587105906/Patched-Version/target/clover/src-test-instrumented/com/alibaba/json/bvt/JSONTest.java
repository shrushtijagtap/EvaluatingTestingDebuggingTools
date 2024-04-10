/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
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

public class JSONTest extends TestCase {static class __CLR4_5_2y5my5mlusyjq0a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,44352,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_number() throws Exception {__CLR4_5_2y5my5mlusyjq0a.R.globalSliceStart(getClass().getName(),44266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nvgwdfy5m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y5my5mlusyjq0a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y5my5mlusyjq0a.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_number",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44266,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nvgwdfy5m() throws Exception{try{__CLR4_5_2y5my5mlusyjq0a.R.inc(44266);
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44267);Assert.assertEquals("3", JSON.parse("3").toString());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44268);Assert.assertEquals("34", JSON.parse("34").toString());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44269);Assert.assertEquals("922337203685477580755", JSON.parse("922337203685477580755").toString());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44270);Assert.assertEquals("-34", JSON.parse("-34").toString());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44271);Assert.assertEquals(new BigDecimal("9.223372036854776E18"), new BigDecimal(JSON.parse("9.223372036854776E18").toString()));
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44272);Assert.assertEquals(new BigDecimal("9.223372036854776E+18"), new BigDecimal(JSON.parse("9.223372036854776E+18").toString()));
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44273);Assert.assertEquals(new BigDecimal("9.223372036854776E-18"), new BigDecimal(JSON.parse("9.223372036854776E-18").toString()));
    }finally{__CLR4_5_2y5my5mlusyjq0a.R.flushNeeded();}}

    public void test_string() throws Exception {__CLR4_5_2y5my5mlusyjq0a.R.globalSliceStart(getClass().getName(),44274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d3tq79y5u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y5my5mlusyjq0a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y5my5mlusyjq0a.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_string",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44274,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d3tq79y5u() throws Exception{try{__CLR4_5_2y5my5mlusyjq0a.R.inc(44274);
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44275);Assert.assertEquals("", JSON.parse("\"\"").toString());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44276);Assert.assertEquals("3", JSON.parse("\"3\"").toString());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44277);Assert.assertEquals("34", JSON.parse("\"34\"").toString());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44278);Assert.assertEquals("3\\4", JSON.parse("\"3\\\\4\"").toString());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44279);Assert.assertEquals("3\"4", JSON.parse("\"3\\\"4\"").toString());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44280);Assert.assertEquals("3\\b4", JSON.parse("\"3\\\\b4\"").toString());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44281);Assert.assertEquals("3\\f4", JSON.parse("\"3\\\\f4\"").toString());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44282);Assert.assertEquals("3\\n4", JSON.parse("\"3\\\\n4\"").toString());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44283);Assert.assertEquals("3\\r4", JSON.parse("\"3\\\\r4\"").toString());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44284);Assert.assertEquals("3\\t4", JSON.parse("\"3\\\\t4\"").toString());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44285);Assert.assertEquals("\u4e2d\u56fd", JSON.parse("\"\u4e2d\u56fd\"").toString());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44286);Assert.assertEquals("\u4e2d\u56fd", JSON.parse("\"\\u4E2D\\u56FD\"").toString());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44287);Assert.assertEquals("", JSON.parse("\"\\u001F\"").toString());
    }finally{__CLR4_5_2y5my5mlusyjq0a.R.flushNeeded();}}
    
    public void test_for_jh() throws Exception {__CLR4_5_2y5my5mlusyjq0a.R.globalSliceStart(getClass().getName(),44288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2by5onsy68();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y5my5mlusyjq0a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y5my5mlusyjq0a.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_for_jh",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44288,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2by5onsy68() throws Exception{try{__CLR4_5_2y5my5mlusyjq0a.R.inc(44288);
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44289);String text = "[{\"I.13\":\"XEMwXFMweGEuMHhjOFxGy87M5VxUxOO6ww==\",\"I.18\":\"MA==\"},{\"I.13\":\"XEMwXFMweGEuMHhjOFxGy87M5VxUxOO6ww==\",\"I.18\":\"MA==\"}]";
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44290);JSON.parse(text);
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44291);JSON.parseArray(text);
    }finally{__CLR4_5_2y5my5mlusyjq0a.R.flushNeeded();}}

    public void test_value() throws Exception {__CLR4_5_2y5my5mlusyjq0a.R.globalSliceStart(getClass().getName(),44292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z4o0nfy6c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y5my5mlusyjq0a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y5my5mlusyjq0a.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_value",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44292,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z4o0nfy6c() throws Exception{try{__CLR4_5_2y5my5mlusyjq0a.R.inc(44292);
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44293);Assert.assertEquals(Boolean.TRUE, JSON.parse("true"));
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44294);Assert.assertEquals(Boolean.FALSE, JSON.parse("false"));
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44295);Assert.assertEquals(null, JSON.parse("null"));
    }finally{__CLR4_5_2y5my5mlusyjq0a.R.flushNeeded();}}

    public void test_object() throws Exception {__CLR4_5_2y5my5mlusyjq0a.R.globalSliceStart(getClass().getName(),44296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22k5qaby6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y5my5mlusyjq0a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y5my5mlusyjq0a.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_object",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44296,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22k5qaby6g() throws Exception{try{__CLR4_5_2y5my5mlusyjq0a.R.inc(44296);
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44297);Assert.assertTrue(JSON.parseObject("{}").size() == 0);
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44298);Assert.assertEquals(1, JSON.parseObject("{\"K\":3}").size());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44299);Assert.assertEquals(3, ((Number) JSON.parseObject("{\"K\":3}").get("K")).intValue());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44300);Assert.assertEquals(2, JSON.parseObject("{\"K1\":3,\"K2\":4}").size());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44301);Assert.assertEquals(3, ((Number) JSON.parseObject("{\"K1\":3,\"K2\":4}").get("K1")).intValue());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44302);Assert.assertEquals(4, ((Number) JSON.parseObject("{\"K1\":3,\"K2\":4}").get("K2")).intValue());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44303);Assert.assertEquals(1, JSON.parseObject("{\"K\":{}}").size());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44304);Assert.assertEquals(1, JSON.parseObject("{\"K\":[]}").size());
    }finally{__CLR4_5_2y5my5mlusyjq0a.R.flushNeeded();}}

    public void test_array() throws Exception {__CLR4_5_2y5my5mlusyjq0a.R.globalSliceStart(getClass().getName(),44305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vw0vd9y6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y5my5mlusyjq0a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y5my5mlusyjq0a.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44305,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vw0vd9y6p() throws Exception{try{__CLR4_5_2y5my5mlusyjq0a.R.inc(44305);
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44306);Assert.assertEquals(0, JSON.parseArray("[]").size());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44307);Assert.assertEquals(1, JSON.parseArray("[1]").size());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44308);Assert.assertEquals(1, ((Number) JSON.parseArray("[1]").get(0)).intValue());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44309);Assert.assertEquals(3, JSON.parseArray("[1,2, 3]").size());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44310);Assert.assertEquals(1, ((Number) JSON.parseArray("[1,2, 3]").get(0)).intValue());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44311);Assert.assertEquals(2, ((Number) JSON.parseArray("[1,2, 3]").get(1)).intValue());
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44312);Assert.assertEquals(3, ((Number) JSON.parseArray("[1,2, 3]").get(2)).intValue());
    }finally{__CLR4_5_2y5my5mlusyjq0a.R.flushNeeded();}}

    public void test_all() throws Exception {__CLR4_5_2y5my5mlusyjq0a.R.globalSliceStart(getClass().getName(),44313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pxmdoly6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y5my5mlusyjq0a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y5my5mlusyjq0a.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_all",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44313,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pxmdoly6x() throws Exception{try{__CLR4_5_2y5my5mlusyjq0a.R.inc(44313);
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44314);Assert.assertEquals(null, JSON.parse(null));
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44315);Assert.assertEquals("{}", JSON.toJSONString(new HashMap<String, Object>()));
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44316);Assert.assertEquals("{}", JSON.toJSONString(new HashMap<String, Object>(), true));
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44317);Assert.assertEquals("{}", JSON.toJSONString(new HashMap<String, Object>(), true));
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44318);Assert.assertEquals(null, JSON.parseObject(null));
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44319);Assert.assertEquals(null, JSON.parseArray(null));
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44320);Assert.assertEquals(null, JSON.parseObject(null, Object.class));
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44321);Assert.assertEquals(null, JSON.parseArray(null, Object.class));
    }finally{__CLR4_5_2y5my5mlusyjq0a.R.flushNeeded();}}

    public void test_writeTo_0() throws Exception {__CLR4_5_2y5my5mlusyjq0a.R.globalSliceStart(getClass().getName(),44322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2imn8jpy76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y5my5mlusyjq0a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y5my5mlusyjq0a.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_writeTo_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44322,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2imn8jpy76() throws Exception{try{__CLR4_5_2y5my5mlusyjq0a.R.inc(44322);
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44323);SerializeWriter out = new SerializeWriter();

        __CLR4_5_2y5my5mlusyjq0a.R.inc(44324);JSONObject json = new JSONObject();
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44325);json.writeJSONString(out);

        __CLR4_5_2y5my5mlusyjq0a.R.inc(44326);Assert.assertEquals("{}", out.toString());
    }finally{__CLR4_5_2y5my5mlusyjq0a.R.flushNeeded();}}

    public void test_writeTo_1() throws Exception {__CLR4_5_2y5my5mlusyjq0a.R.globalSliceStart(getClass().getName(),44327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lvn7c6y7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y5my5mlusyjq0a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y5my5mlusyjq0a.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_writeTo_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44327,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lvn7c6y7b() throws Exception{try{__CLR4_5_2y5my5mlusyjq0a.R.inc(44327);
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44328);StringWriter out = new StringWriter();

        __CLR4_5_2y5my5mlusyjq0a.R.inc(44329);JSONObject json = new JSONObject();
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44330);json.writeJSONString(out);

        __CLR4_5_2y5my5mlusyjq0a.R.inc(44331);Assert.assertEquals("{}", out.toString());
    }finally{__CLR4_5_2y5my5mlusyjq0a.R.flushNeeded();}}

    public void test_writeTo_2() throws Exception {__CLR4_5_2y5my5mlusyjq0a.R.globalSliceStart(getClass().getName(),44332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p4n64ny7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y5my5mlusyjq0a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y5my5mlusyjq0a.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_writeTo_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44332,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p4n64ny7g() throws Exception{try{__CLR4_5_2y5my5mlusyjq0a.R.inc(44332);
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44333);StringBuffer out = new StringBuffer();

        __CLR4_5_2y5my5mlusyjq0a.R.inc(44334);JSONObject json = new JSONObject();
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44335);json.writeJSONString(out);

        __CLR4_5_2y5my5mlusyjq0a.R.inc(44336);Assert.assertEquals("{}", out.toString());
    }finally{__CLR4_5_2y5my5mlusyjq0a.R.flushNeeded();}}

    public void test_writeTo_error() throws Exception {__CLR4_5_2y5my5mlusyjq0a.R.globalSliceStart(getClass().getName(),44337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fnjajny7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y5my5mlusyjq0a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y5my5mlusyjq0a.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_writeTo_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44337,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fnjajny7l() throws Exception{try{__CLR4_5_2y5my5mlusyjq0a.R.inc(44337);
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44338);JSONException error = null;
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44339);try {
            __CLR4_5_2y5my5mlusyjq0a.R.inc(44340);JSONObject json = new JSONObject();
            __CLR4_5_2y5my5mlusyjq0a.R.inc(44341);json.writeJSONString(new ErrorAppendable());
        } catch (JSONException e) {
            __CLR4_5_2y5my5mlusyjq0a.R.inc(44342);error = e;
        }
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44343);Assert.assertNotNull(error);
    }finally{__CLR4_5_2y5my5mlusyjq0a.R.flushNeeded();}}

    public void test_fromJavaObject_null() throws Exception {__CLR4_5_2y5my5mlusyjq0a.R.globalSliceStart(getClass().getName(),44344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22xidedy7s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2y5my5mlusyjq0a.R.rethrow($CLV_t2$);}finally{__CLR4_5_2y5my5mlusyjq0a.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTest.test_fromJavaObject_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),44344,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22xidedy7s() throws Exception{try{__CLR4_5_2y5my5mlusyjq0a.R.inc(44344);
        __CLR4_5_2y5my5mlusyjq0a.R.inc(44345);Assert.assertEquals(null, JSON.toJSON(null));
    }finally{__CLR4_5_2y5my5mlusyjq0a.R.flushNeeded();}}

    private final class ErrorAppendable implements Appendable {

        public Appendable append(CharSequence csq, int start, int end) throws IOException {try{__CLR4_5_2y5my5mlusyjq0a.R.inc(44346);
            __CLR4_5_2y5my5mlusyjq0a.R.inc(44347);throw new IOException("");
        }finally{__CLR4_5_2y5my5mlusyjq0a.R.flushNeeded();}}

        public Appendable append(char c) throws IOException {try{__CLR4_5_2y5my5mlusyjq0a.R.inc(44348);
            __CLR4_5_2y5my5mlusyjq0a.R.inc(44349);throw new IOException("");
        }finally{__CLR4_5_2y5my5mlusyjq0a.R.flushNeeded();}}

        public Appendable append(CharSequence csq) throws IOException {try{__CLR4_5_2y5my5mlusyjq0a.R.inc(44350);
            __CLR4_5_2y5my5mlusyjq0a.R.inc(44351);throw new IOException("");
        }finally{__CLR4_5_2y5my5mlusyjq0a.R.flushNeeded();}}
    }
}
