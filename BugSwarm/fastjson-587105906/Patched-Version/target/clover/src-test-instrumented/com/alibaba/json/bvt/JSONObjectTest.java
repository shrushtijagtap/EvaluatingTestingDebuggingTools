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

import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONObject;

public class JSONObjectTest extends TestCase {static class __CLR4_5_2xukxuklusvn2wf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,43988,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_toJSONObject() throws Exception {__CLR4_5_2xukxuklusvn2wf.R.globalSliceStart(getClass().getName(),43868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hnfugmxuk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xukxuklusvn2wf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xukxuklusvn2wf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_toJSONObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43868,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hnfugmxuk() throws Exception{try{__CLR4_5_2xukxuklusvn2wf.R.inc(43868);
        {
            __CLR4_5_2xukxuklusvn2wf.R.inc(43869);Assert.assertNull(JSONObject.parse(null));
        }
    }finally{__CLR4_5_2xukxuklusvn2wf.R.flushNeeded();}}

    public void test_writeJSONString() throws Exception {__CLR4_5_2xukxuklusvn2wf.R.globalSliceStart(getClass().getName(),43870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w80lf6xum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xukxuklusvn2wf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xukxuklusvn2wf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_writeJSONString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43870,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w80lf6xum() throws Exception{try{__CLR4_5_2xukxuklusvn2wf.R.inc(43870);
        {
            __CLR4_5_2xukxuklusvn2wf.R.inc(43871);StringWriter out = new StringWriter();
            __CLR4_5_2xukxuklusvn2wf.R.inc(43872);new JSONObject().writeJSONString(out);
            __CLR4_5_2xukxuklusvn2wf.R.inc(43873);Assert.assertEquals("{}", out.toString());
        }
    }finally{__CLR4_5_2xukxuklusvn2wf.R.flushNeeded();}}

    public void test_getLong() throws Exception {__CLR4_5_2xukxuklusvn2wf.R.globalSliceStart(getClass().getName(),43874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ijf9xwxuq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xukxuklusvn2wf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xukxuklusvn2wf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_getLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43874,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ijf9xwxuq() throws Exception{try{__CLR4_5_2xukxuklusvn2wf.R.inc(43874);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43875);JSONObject json = new JSONObject(true);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43876);json.put("A", 55L);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43877);json.put("B", 55);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43878);json.put("K", true);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43879);Assert.assertEquals(json.getLong("A").longValue(), 55L);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43880);Assert.assertEquals(json.getLong("B").longValue(), 55L);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43881);Assert.assertEquals(json.getLong("C"), null);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43882);Assert.assertEquals(json.getBooleanValue("K"), true);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43883);Assert.assertEquals(json.getBoolean("K"), Boolean.TRUE);
    }finally{__CLR4_5_2xukxuklusvn2wf.R.flushNeeded();}}

    public void test_getLong_1() throws Exception {__CLR4_5_2xukxuklusvn2wf.R.globalSliceStart(getClass().getName(),43884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gf9oguxv0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xukxuklusvn2wf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xukxuklusvn2wf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_getLong_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43884,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gf9oguxv0() throws Exception{try{__CLR4_5_2xukxuklusvn2wf.R.inc(43884);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43885);JSONObject json = new JSONObject(false);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43886);json.put("A", 55L);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43887);json.put("B", 55);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43888);Assert.assertEquals(json.getLong("A").longValue(), 55L);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43889);Assert.assertEquals(json.getLong("B").longValue(), 55L);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43890);Assert.assertEquals(json.getLong("C"), null);
    }finally{__CLR4_5_2xukxuklusvn2wf.R.flushNeeded();}}

    public void test_getDate() throws Exception {__CLR4_5_2xukxuklusvn2wf.R.globalSliceStart(getClass().getName(),43891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_229ym72xv7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xukxuklusvn2wf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xukxuklusvn2wf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_getDate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43891,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_229ym72xv7() throws Exception{try{__CLR4_5_2xukxuklusvn2wf.R.inc(43891);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43892);long currentTimeMillis = System.currentTimeMillis();
        __CLR4_5_2xukxuklusvn2wf.R.inc(43893);JSONObject json = new JSONObject();
        __CLR4_5_2xukxuklusvn2wf.R.inc(43894);json.put("A", new Date(currentTimeMillis));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43895);json.put("B", currentTimeMillis);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43896);Assert.assertEquals(json.getDate("A").getTime(), currentTimeMillis);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43897);Assert.assertEquals(json.getDate("B").getTime(), currentTimeMillis);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43898);Assert.assertEquals(json.getLong("C"), null);
    }finally{__CLR4_5_2xukxuklusvn2wf.R.flushNeeded();}}

    public void test_getBoolean() throws Exception {__CLR4_5_2xukxuklusvn2wf.R.globalSliceStart(getClass().getName(),43899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m4q76ixvf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xukxuklusvn2wf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xukxuklusvn2wf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_getBoolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43899,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m4q76ixvf() throws Exception{try{__CLR4_5_2xukxuklusvn2wf.R.inc(43899);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43900);JSONObject json = new JSONObject();
        __CLR4_5_2xukxuklusvn2wf.R.inc(43901);json.put("A", true);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43902);Assert.assertEquals(json.getBoolean("A").booleanValue(), true);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43903);Assert.assertEquals(json.getLong("C"), null);
    }finally{__CLR4_5_2xukxuklusvn2wf.R.flushNeeded();}}

    public void test_getInt() throws Exception {__CLR4_5_2xukxuklusvn2wf.R.globalSliceStart(getClass().getName(),43904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n0r4p9xvk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xukxuklusvn2wf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xukxuklusvn2wf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_getInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43904,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n0r4p9xvk() throws Exception{try{__CLR4_5_2xukxuklusvn2wf.R.inc(43904);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43905);JSONObject json = new JSONObject();
        __CLR4_5_2xukxuklusvn2wf.R.inc(43906);json.put("A", 55L);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43907);json.put("B", 55);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43908);Assert.assertEquals(json.getInteger("A").intValue(), 55);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43909);Assert.assertEquals(json.getInteger("B").intValue(), 55);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43910);Assert.assertEquals(json.getInteger("C"), null);
    }finally{__CLR4_5_2xukxuklusvn2wf.R.flushNeeded();}}

    public void test_order() throws Exception {__CLR4_5_2xukxuklusvn2wf.R.globalSliceStart(getClass().getName(),43911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21x194oxvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xukxuklusvn2wf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xukxuklusvn2wf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_order",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43911,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21x194oxvr() throws Exception{try{__CLR4_5_2xukxuklusvn2wf.R.inc(43911);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43912);JSONObject json = new JSONObject(true);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43913);json.put("C", 55L);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43914);json.put("B", 55);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43915);json.put("A", 55);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43916);Assert.assertEquals("C", json.keySet().toArray()[0]);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43917);Assert.assertEquals("B", json.keySet().toArray()[1]);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43918);Assert.assertEquals("A", json.keySet().toArray()[2]);

        __CLR4_5_2xukxuklusvn2wf.R.inc(43919);Assert.assertEquals(0, json.getIntValue("D"));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43920);Assert.assertEquals(0L, json.getLongValue("D"));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43921);Assert.assertEquals(false, json.getBooleanValue("D"));
    }finally{__CLR4_5_2xukxuklusvn2wf.R.flushNeeded();}}

    public void test_all() throws Exception {__CLR4_5_2xukxuklusvn2wf.R.globalSliceStart(getClass().getName(),43922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pxmdolxw2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xukxuklusvn2wf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xukxuklusvn2wf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_all",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43922,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pxmdolxw2() throws Exception{try{__CLR4_5_2xukxuklusvn2wf.R.inc(43922);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43923);JSONObject json = new JSONObject();
        __CLR4_5_2xukxuklusvn2wf.R.inc(43924);Assert.assertEquals(true, json.isEmpty());
        __CLR4_5_2xukxuklusvn2wf.R.inc(43925);json.put("C", 51L);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43926);json.put("B", 52);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43927);json.put("A", 53);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43928);Assert.assertEquals(false, json.isEmpty());
        __CLR4_5_2xukxuklusvn2wf.R.inc(43929);Assert.assertEquals(true, json.containsKey("C"));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43930);Assert.assertEquals(false, json.containsKey("D"));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43931);Assert.assertEquals(true, json.containsValue(52));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43932);Assert.assertEquals(false, json.containsValue(33));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43933);Assert.assertEquals(null, json.remove("D"));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43934);Assert.assertEquals(51L, json.remove("C"));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43935);Assert.assertEquals(2, json.keySet().size());
        __CLR4_5_2xukxuklusvn2wf.R.inc(43936);Assert.assertEquals(2, json.values().size());
        __CLR4_5_2xukxuklusvn2wf.R.inc(43937);Assert.assertEquals(new BigDecimal("53"), json.getBigDecimal("A"));

        __CLR4_5_2xukxuklusvn2wf.R.inc(43938);json.putAll(Collections.singletonMap("E", 99));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43939);Assert.assertEquals(3, json.values().size());
        __CLR4_5_2xukxuklusvn2wf.R.inc(43940);json.clear();
        __CLR4_5_2xukxuklusvn2wf.R.inc(43941);Assert.assertEquals(0, json.values().size());
        __CLR4_5_2xukxuklusvn2wf.R.inc(43942);json.putAll(Collections.singletonMap("E", 99));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43943);Assert.assertEquals(99L, json.getLongValue("E"));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43944);Assert.assertEquals(99, json.getIntValue("E"));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43945);Assert.assertEquals("99", json.getString("E"));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43946);Assert.assertEquals(null, json.getString("F"));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43947);Assert.assertEquals(null, json.getDate("F"));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43948);Assert.assertEquals(null, json.getBoolean("F"));
    }finally{__CLR4_5_2xukxuklusvn2wf.R.flushNeeded();}}

    public void test_all_2() throws Exception {__CLR4_5_2xukxuklusvn2wf.R.globalSliceStart(getClass().getName(),43949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2grw972xwt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xukxuklusvn2wf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xukxuklusvn2wf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_all_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43949,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2grw972xwt() throws Exception{try{__CLR4_5_2xukxuklusvn2wf.R.inc(43949);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43950);JSONObject array = new JSONObject();
        __CLR4_5_2xukxuklusvn2wf.R.inc(43951);array.put("0", 123);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43952);array.put("1", "222");
        __CLR4_5_2xukxuklusvn2wf.R.inc(43953);array.put("2", 3);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43954);array.put("3", true);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43955);array.put("4", "true");
        __CLR4_5_2xukxuklusvn2wf.R.inc(43956);array.put("5", "2.0");

        __CLR4_5_2xukxuklusvn2wf.R.inc(43957);Assert.assertEquals(123, array.getIntValue("0"));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43958);Assert.assertEquals(123, array.getLongValue("0"));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43959);Assert.assertEquals(new BigDecimal("123"), array.getBigDecimal("0"));

        __CLR4_5_2xukxuklusvn2wf.R.inc(43960);Assert.assertEquals(222, array.getIntValue("1"));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43961);Assert.assertEquals(3, array.getByte("2").byteValue());
        __CLR4_5_2xukxuklusvn2wf.R.inc(43962);Assert.assertEquals(3, array.getByteValue("2"));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43963);Assert.assertEquals(3, array.getShort("2").shortValue());
        __CLR4_5_2xukxuklusvn2wf.R.inc(43964);Assert.assertEquals(3, array.getShortValue("2"));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43965);Assert.assertEquals(new Integer(222), array.getInteger("1"));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43966);Assert.assertEquals(new Long(222), array.getLong("1"));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43967);Assert.assertEquals(new BigDecimal("222"), array.getBigDecimal("1"));

        __CLR4_5_2xukxuklusvn2wf.R.inc(43968);Assert.assertEquals(true, array.getBooleanValue("4"));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43969);Assert.assertTrue(2.0F == array.getFloat("5").floatValue());
        __CLR4_5_2xukxuklusvn2wf.R.inc(43970);Assert.assertTrue(2.0F == array.getFloatValue("5"));
        __CLR4_5_2xukxuklusvn2wf.R.inc(43971);Assert.assertTrue(2.0D == array.getDouble("5").doubleValue());
        __CLR4_5_2xukxuklusvn2wf.R.inc(43972);Assert.assertTrue(2.0D == array.getDoubleValue("5"));
    }finally{__CLR4_5_2xukxuklusvn2wf.R.flushNeeded();}}

    public void test_getObject_null() throws Exception {__CLR4_5_2xukxuklusvn2wf.R.globalSliceStart(getClass().getName(),43973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yydx3vxxh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xukxuklusvn2wf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xukxuklusvn2wf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_getObject_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43973,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yydx3vxxh() throws Exception{try{__CLR4_5_2xukxuklusvn2wf.R.inc(43973);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43974);JSONObject json = new JSONObject();
        __CLR4_5_2xukxuklusvn2wf.R.inc(43975);json.put("obj", null);

        __CLR4_5_2xukxuklusvn2wf.R.inc(43976);Assert.assertTrue(json.getJSONObject("obj") == null);
    }finally{__CLR4_5_2xukxuklusvn2wf.R.flushNeeded();}}
    
    public void test_bytes () throws Exception {__CLR4_5_2xukxuklusvn2wf.R.globalSliceStart(getClass().getName(),43977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yidwclxxl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xukxuklusvn2wf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xukxuklusvn2wf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_bytes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43977,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yidwclxxl() throws Exception{try{__CLR4_5_2xukxuklusvn2wf.R.inc(43977);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43978);JSONObject object = new JSONObject();
        __CLR4_5_2xukxuklusvn2wf.R.inc(43979);Assert.assertNull(object.getBytes("bytes"));
    }finally{__CLR4_5_2xukxuklusvn2wf.R.flushNeeded();}}

    public void test_getObject() throws Exception {__CLR4_5_2xukxuklusvn2wf.R.globalSliceStart(getClass().getName(),43980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ccr5e7xxo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xukxuklusvn2wf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xukxuklusvn2wf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_getObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43980,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ccr5e7xxo() throws Exception{try{__CLR4_5_2xukxuklusvn2wf.R.inc(43980);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43981);JSONObject json = new JSONObject();
        __CLR4_5_2xukxuklusvn2wf.R.inc(43982);json.put("obj", new JSONObject());

        __CLR4_5_2xukxuklusvn2wf.R.inc(43983);Assert.assertEquals(0, json.getJSONObject("obj").size());
    }finally{__CLR4_5_2xukxuklusvn2wf.R.flushNeeded();}}

    public void test_getObject_map() throws Exception {__CLR4_5_2xukxuklusvn2wf.R.globalSliceStart(getClass().getName(),43984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23c9p8sxxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xukxuklusvn2wf.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xukxuklusvn2wf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONObjectTest.test_getObject_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43984,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23c9p8sxxs() throws Exception{try{__CLR4_5_2xukxuklusvn2wf.R.inc(43984);
        __CLR4_5_2xukxuklusvn2wf.R.inc(43985);JSONObject json = new JSONObject();
        __CLR4_5_2xukxuklusvn2wf.R.inc(43986);json.put("obj", new HashMap());

        __CLR4_5_2xukxuklusvn2wf.R.inc(43987);Assert.assertEquals(0, json.getJSONObject("obj").size());
    }finally{__CLR4_5_2xukxuklusvn2wf.R.flushNeeded();}}
}
