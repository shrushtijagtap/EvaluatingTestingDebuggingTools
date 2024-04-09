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

import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONObject;

public class JSONObjectTest extends TestCase {static class __CLR4_1_10xuoxuolusqjy3x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,43992,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_toJSONObject() throws Exception {__CLR4_1_10xuoxuolusqjy3x.R.globalSliceStart(getClass().getName(),43872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hnfugmxuo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xuoxuolusqjy3x.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xuoxuolusqjy3x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_toJSONObject",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43872,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hnfugmxuo() throws Exception{try{__CLR4_1_10xuoxuolusqjy3x.R.inc(43872);
        {
            __CLR4_1_10xuoxuolusqjy3x.R.inc(43873);Assert.assertNull(JSONObject.parse(null));
        }
    }finally{__CLR4_1_10xuoxuolusqjy3x.R.flushNeeded();}}

    public void test_writeJSONString() throws Exception {__CLR4_1_10xuoxuolusqjy3x.R.globalSliceStart(getClass().getName(),43874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10w80lf6xuq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xuoxuolusqjy3x.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xuoxuolusqjy3x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_writeJSONString",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43874,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10w80lf6xuq() throws Exception{try{__CLR4_1_10xuoxuolusqjy3x.R.inc(43874);
        {
            __CLR4_1_10xuoxuolusqjy3x.R.inc(43875);StringWriter out = new StringWriter();
            __CLR4_1_10xuoxuolusqjy3x.R.inc(43876);new JSONObject().writeJSONString(out);
            __CLR4_1_10xuoxuolusqjy3x.R.inc(43877);Assert.assertEquals("{}", out.toString());
        }
    }finally{__CLR4_1_10xuoxuolusqjy3x.R.flushNeeded();}}

    public void test_getLong() throws Exception {__CLR4_1_10xuoxuolusqjy3x.R.globalSliceStart(getClass().getName(),43878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ijf9xwxuu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xuoxuolusqjy3x.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xuoxuolusqjy3x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_getLong",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43878,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ijf9xwxuu() throws Exception{try{__CLR4_1_10xuoxuolusqjy3x.R.inc(43878);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43879);JSONObject json = new JSONObject(true);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43880);json.put("A", 55L);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43881);json.put("B", 55);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43882);json.put("K", true);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43883);Assert.assertEquals(json.getLong("A").longValue(), 55L);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43884);Assert.assertEquals(json.getLong("B").longValue(), 55L);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43885);Assert.assertEquals(json.getLong("C"), null);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43886);Assert.assertEquals(json.getBooleanValue("K"), true);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43887);Assert.assertEquals(json.getBoolean("K"), Boolean.TRUE);
    }finally{__CLR4_1_10xuoxuolusqjy3x.R.flushNeeded();}}

    public void test_getLong_1() throws Exception {__CLR4_1_10xuoxuolusqjy3x.R.globalSliceStart(getClass().getName(),43888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gf9oguxv4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xuoxuolusqjy3x.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xuoxuolusqjy3x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_getLong_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43888,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gf9oguxv4() throws Exception{try{__CLR4_1_10xuoxuolusqjy3x.R.inc(43888);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43889);JSONObject json = new JSONObject(false);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43890);json.put("A", 55L);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43891);json.put("B", 55);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43892);Assert.assertEquals(json.getLong("A").longValue(), 55L);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43893);Assert.assertEquals(json.getLong("B").longValue(), 55L);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43894);Assert.assertEquals(json.getLong("C"), null);
    }finally{__CLR4_1_10xuoxuolusqjy3x.R.flushNeeded();}}

    public void test_getDate() throws Exception {__CLR4_1_10xuoxuolusqjy3x.R.globalSliceStart(getClass().getName(),43895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1029ym72xvb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xuoxuolusqjy3x.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xuoxuolusqjy3x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_getDate",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43895,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1029ym72xvb() throws Exception{try{__CLR4_1_10xuoxuolusqjy3x.R.inc(43895);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43896);long currentTimeMillis = System.currentTimeMillis();
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43897);JSONObject json = new JSONObject();
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43898);json.put("A", new Date(currentTimeMillis));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43899);json.put("B", currentTimeMillis);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43900);Assert.assertEquals(json.getDate("A").getTime(), currentTimeMillis);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43901);Assert.assertEquals(json.getDate("B").getTime(), currentTimeMillis);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43902);Assert.assertEquals(json.getLong("C"), null);
    }finally{__CLR4_1_10xuoxuolusqjy3x.R.flushNeeded();}}

    public void test_getBoolean() throws Exception {__CLR4_1_10xuoxuolusqjy3x.R.globalSliceStart(getClass().getName(),43903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m4q76ixvj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xuoxuolusqjy3x.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xuoxuolusqjy3x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_getBoolean",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43903,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m4q76ixvj() throws Exception{try{__CLR4_1_10xuoxuolusqjy3x.R.inc(43903);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43904);JSONObject json = new JSONObject();
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43905);json.put("A", true);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43906);Assert.assertEquals(json.getBoolean("A").booleanValue(), true);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43907);Assert.assertEquals(json.getLong("C"), null);
    }finally{__CLR4_1_10xuoxuolusqjy3x.R.flushNeeded();}}

    public void test_getInt() throws Exception {__CLR4_1_10xuoxuolusqjy3x.R.globalSliceStart(getClass().getName(),43908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n0r4p9xvo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xuoxuolusqjy3x.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xuoxuolusqjy3x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_getInt",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43908,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n0r4p9xvo() throws Exception{try{__CLR4_1_10xuoxuolusqjy3x.R.inc(43908);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43909);JSONObject json = new JSONObject();
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43910);json.put("A", 55L);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43911);json.put("B", 55);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43912);Assert.assertEquals(json.getInteger("A").intValue(), 55);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43913);Assert.assertEquals(json.getInteger("B").intValue(), 55);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43914);Assert.assertEquals(json.getInteger("C"), null);
    }finally{__CLR4_1_10xuoxuolusqjy3x.R.flushNeeded();}}

    public void test_order() throws Exception {__CLR4_1_10xuoxuolusqjy3x.R.globalSliceStart(getClass().getName(),43915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101x194oxvv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xuoxuolusqjy3x.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xuoxuolusqjy3x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_order",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43915,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101x194oxvv() throws Exception{try{__CLR4_1_10xuoxuolusqjy3x.R.inc(43915);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43916);JSONObject json = new JSONObject(true);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43917);json.put("C", 55L);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43918);json.put("B", 55);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43919);json.put("A", 55);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43920);Assert.assertEquals("C", json.keySet().toArray()[0]);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43921);Assert.assertEquals("B", json.keySet().toArray()[1]);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43922);Assert.assertEquals("A", json.keySet().toArray()[2]);

        __CLR4_1_10xuoxuolusqjy3x.R.inc(43923);Assert.assertEquals(0, json.getIntValue("D"));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43924);Assert.assertEquals(0L, json.getLongValue("D"));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43925);Assert.assertEquals(false, json.getBooleanValue("D"));
    }finally{__CLR4_1_10xuoxuolusqjy3x.R.flushNeeded();}}

    public void test_all() throws Exception {__CLR4_1_10xuoxuolusqjy3x.R.globalSliceStart(getClass().getName(),43926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pxmdolxw6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xuoxuolusqjy3x.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xuoxuolusqjy3x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_all",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43926,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pxmdolxw6() throws Exception{try{__CLR4_1_10xuoxuolusqjy3x.R.inc(43926);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43927);JSONObject json = new JSONObject();
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43928);Assert.assertEquals(true, json.isEmpty());
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43929);json.put("C", 51L);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43930);json.put("B", 52);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43931);json.put("A", 53);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43932);Assert.assertEquals(false, json.isEmpty());
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43933);Assert.assertEquals(true, json.containsKey("C"));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43934);Assert.assertEquals(false, json.containsKey("D"));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43935);Assert.assertEquals(true, json.containsValue(52));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43936);Assert.assertEquals(false, json.containsValue(33));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43937);Assert.assertEquals(null, json.remove("D"));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43938);Assert.assertEquals(51L, json.remove("C"));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43939);Assert.assertEquals(2, json.keySet().size());
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43940);Assert.assertEquals(2, json.values().size());
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43941);Assert.assertEquals(new BigDecimal("53"), json.getBigDecimal("A"));

        __CLR4_1_10xuoxuolusqjy3x.R.inc(43942);json.putAll(Collections.singletonMap("E", 99));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43943);Assert.assertEquals(3, json.values().size());
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43944);json.clear();
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43945);Assert.assertEquals(0, json.values().size());
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43946);json.putAll(Collections.singletonMap("E", 99));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43947);Assert.assertEquals(99L, json.getLongValue("E"));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43948);Assert.assertEquals(99, json.getIntValue("E"));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43949);Assert.assertEquals("99", json.getString("E"));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43950);Assert.assertEquals(null, json.getString("F"));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43951);Assert.assertEquals(null, json.getDate("F"));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43952);Assert.assertEquals(null, json.getBoolean("F"));
    }finally{__CLR4_1_10xuoxuolusqjy3x.R.flushNeeded();}}

    public void test_all_2() throws Exception {__CLR4_1_10xuoxuolusqjy3x.R.globalSliceStart(getClass().getName(),43953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10grw972xwx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xuoxuolusqjy3x.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xuoxuolusqjy3x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_all_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43953,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10grw972xwx() throws Exception{try{__CLR4_1_10xuoxuolusqjy3x.R.inc(43953);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43954);JSONObject array = new JSONObject();
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43955);array.put("0", 123);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43956);array.put("1", "222");
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43957);array.put("2", 3);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43958);array.put("3", true);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43959);array.put("4", "true");
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43960);array.put("5", "2.0");

        __CLR4_1_10xuoxuolusqjy3x.R.inc(43961);Assert.assertEquals(123, array.getIntValue("0"));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43962);Assert.assertEquals(123, array.getLongValue("0"));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43963);Assert.assertEquals(new BigDecimal("123"), array.getBigDecimal("0"));

        __CLR4_1_10xuoxuolusqjy3x.R.inc(43964);Assert.assertEquals(222, array.getIntValue("1"));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43965);Assert.assertEquals(3, array.getByte("2").byteValue());
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43966);Assert.assertEquals(3, array.getByteValue("2"));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43967);Assert.assertEquals(3, array.getShort("2").shortValue());
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43968);Assert.assertEquals(3, array.getShortValue("2"));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43969);Assert.assertEquals(new Integer(222), array.getInteger("1"));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43970);Assert.assertEquals(new Long(222), array.getLong("1"));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43971);Assert.assertEquals(new BigDecimal("222"), array.getBigDecimal("1"));

        __CLR4_1_10xuoxuolusqjy3x.R.inc(43972);Assert.assertEquals(true, array.getBooleanValue("4"));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43973);Assert.assertTrue(2.0F == array.getFloat("5").floatValue());
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43974);Assert.assertTrue(2.0F == array.getFloatValue("5"));
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43975);Assert.assertTrue(2.0D == array.getDouble("5").doubleValue());
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43976);Assert.assertTrue(2.0D == array.getDoubleValue("5"));
    }finally{__CLR4_1_10xuoxuolusqjy3x.R.flushNeeded();}}

    public void test_getObject_null() throws Exception {__CLR4_1_10xuoxuolusqjy3x.R.globalSliceStart(getClass().getName(),43977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yydx3vxxl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xuoxuolusqjy3x.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xuoxuolusqjy3x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_getObject_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43977,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yydx3vxxl() throws Exception{try{__CLR4_1_10xuoxuolusqjy3x.R.inc(43977);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43978);JSONObject json = new JSONObject();
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43979);json.put("obj", null);

        __CLR4_1_10xuoxuolusqjy3x.R.inc(43980);Assert.assertTrue(json.getJSONObject("obj") == null);
    }finally{__CLR4_1_10xuoxuolusqjy3x.R.flushNeeded();}}
    
    public void test_bytes () throws Exception {__CLR4_1_10xuoxuolusqjy3x.R.globalSliceStart(getClass().getName(),43981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yidwclxxp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xuoxuolusqjy3x.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xuoxuolusqjy3x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_bytes",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43981,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yidwclxxp() throws Exception{try{__CLR4_1_10xuoxuolusqjy3x.R.inc(43981);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43982);JSONObject object = new JSONObject();
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43983);Assert.assertNull(object.getBytes("bytes"));
    }finally{__CLR4_1_10xuoxuolusqjy3x.R.flushNeeded();}}

    public void test_getObject() throws Exception {__CLR4_1_10xuoxuolusqjy3x.R.globalSliceStart(getClass().getName(),43984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ccr5e7xxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xuoxuolusqjy3x.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xuoxuolusqjy3x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_getObject",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43984,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ccr5e7xxs() throws Exception{try{__CLR4_1_10xuoxuolusqjy3x.R.inc(43984);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43985);JSONObject json = new JSONObject();
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43986);json.put("obj", new JSONObject());

        __CLR4_1_10xuoxuolusqjy3x.R.inc(43987);Assert.assertEquals(0, json.getJSONObject("obj").size());
    }finally{__CLR4_1_10xuoxuolusqjy3x.R.flushNeeded();}}

    public void test_getObject_map() throws Exception {__CLR4_1_10xuoxuolusqjy3x.R.globalSliceStart(getClass().getName(),43988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103c9p8sxxw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xuoxuolusqjy3x.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xuoxuolusqjy3x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_getObject_map",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43988,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103c9p8sxxw() throws Exception{try{__CLR4_1_10xuoxuolusqjy3x.R.inc(43988);
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43989);JSONObject json = new JSONObject();
        __CLR4_1_10xuoxuolusqjy3x.R.inc(43990);json.put("obj", new HashMap());

        __CLR4_1_10xuoxuolusqjy3x.R.inc(43991);Assert.assertEquals(0, json.getJSONObject("obj").size());
    }finally{__CLR4_1_10xuoxuolusqjy3x.R.flushNeeded();}}
}
