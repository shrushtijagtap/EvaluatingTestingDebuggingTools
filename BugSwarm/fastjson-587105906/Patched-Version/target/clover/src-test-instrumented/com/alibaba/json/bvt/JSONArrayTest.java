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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JSONArrayTest extends TestCase {static class __CLR4_5_2xhdxhdlusvn2ql{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,43519,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_toString() throws Exception {__CLR4_5_2xhdxhdlusvn2ql.R.globalSliceStart(getClass().getName(),43393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s4d7c0xhd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xhdxhdlusvn2ql.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xhdxhdlusvn2ql.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONArrayTest.test_toString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43393,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s4d7c0xhd() throws Exception{try{__CLR4_5_2xhdxhdlusvn2ql.R.inc(43393);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43394);StringWriter out = new StringWriter();
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43395);new JSONArray().writeJSONString(out);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43396);Assert.assertEquals("[]", out.toString());
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43397);Assert.assertEquals("[]", new JSONArray().toString());
    }finally{__CLR4_5_2xhdxhdlusvn2ql.R.flushNeeded();}}

    public void test_toJSONString() throws Exception {__CLR4_5_2xhdxhdlusvn2ql.R.globalSliceStart(getClass().getName(),43398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s73udkxhi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xhdxhdlusvn2ql.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xhdxhdlusvn2ql.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONArrayTest.test_toJSONString",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43398,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s73udkxhi() throws Exception{try{__CLR4_5_2xhdxhdlusvn2ql.R.inc(43398);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43399);Assert.assertEquals("null", JSONArray.toJSONString(null));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43400);Assert.assertEquals("[null]", JSONArray.toJSONString(Collections.singletonList(null)));
    }finally{__CLR4_5_2xhdxhdlusvn2ql.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_2xhdxhdlusvn2ql.R.globalSliceStart(getClass().getName(),43401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwlxhl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xhdxhdlusvn2ql.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xhdxhdlusvn2ql.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONArrayTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43401,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwlxhl() throws Exception{try{__CLR4_5_2xhdxhdlusvn2ql.R.inc(43401);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43402);JSONArray array = new JSONArray(3);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43403);Assert.assertEquals(true, array.isEmpty());
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43404);array.add(1);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43405);Assert.assertEquals(false, array.isEmpty());
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43406);Assert.assertEquals(true, array.contains(1));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43407);Assert.assertEquals(1, array.toArray()[0]);
        {
            __CLR4_5_2xhdxhdlusvn2ql.R.inc(43408);Object[] items = new Object[1];
            __CLR4_5_2xhdxhdlusvn2ql.R.inc(43409);array.toArray(items);
            __CLR4_5_2xhdxhdlusvn2ql.R.inc(43410);Assert.assertEquals(1, items[0]);
        }
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43411);Assert.assertEquals(true, array.containsAll(Collections.singletonList(1)));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43412);Assert.assertEquals(true, array.remove(Integer.valueOf(1)));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43413);Assert.assertEquals(true, array.isEmpty());
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43414);array.addAll(Collections.singletonList(1));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43415);Assert.assertEquals(1, array.size());
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43416);array.removeAll(Collections.singletonList(1));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43417);Assert.assertEquals(0, array.size());
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43418);array.addAll(0, Arrays.asList(1, 2, 3));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43419);Assert.assertEquals(3, array.size());
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43420);array.clear();
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43421);array.addAll(0, Arrays.asList(1, 2, 3));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43422);Assert.assertEquals(true, array.retainAll(Arrays.asList(1, 2)));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43423);Assert.assertEquals(2, array.size());
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43424);Assert.assertEquals(true, array.retainAll(Arrays.asList(2, 4)));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43425);Assert.assertEquals(1, array.size());
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43426);array.set(0, 4);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43427);Assert.assertEquals(4, array.toArray()[0]);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43428);array.add(0, 4);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43429);Assert.assertEquals(4, array.toArray()[0]);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43430);array.remove(0);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43431);array.remove(0);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43432);Assert.assertEquals(0, array.size());
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43433);array.addAll(Arrays.asList(1, 2, 3, 4, 5, 4, 3));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43434);Assert.assertEquals(2, array.indexOf(3));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43435);Assert.assertEquals(6, array.lastIndexOf(3));
        {
            __CLR4_5_2xhdxhdlusvn2ql.R.inc(43436);AtomicInteger count = new AtomicInteger();
            __CLR4_5_2xhdxhdlusvn2ql.R.inc(43437);for (ListIterator<Object> iter = array.listIterator(); (((iter.hasNext())&&(__CLR4_5_2xhdxhdlusvn2ql.R.iget(43438)!=0|true))||(__CLR4_5_2xhdxhdlusvn2ql.R.iget(43439)==0&false)); iter.next()) {{
                __CLR4_5_2xhdxhdlusvn2ql.R.inc(43440);count.incrementAndGet();
            }
            }__CLR4_5_2xhdxhdlusvn2ql.R.inc(43441);Assert.assertEquals(7, count.get());
        }
        {
            __CLR4_5_2xhdxhdlusvn2ql.R.inc(43442);AtomicInteger count = new AtomicInteger();
            __CLR4_5_2xhdxhdlusvn2ql.R.inc(43443);for (ListIterator<Object> iter = array.listIterator(2); (((iter.hasNext())&&(__CLR4_5_2xhdxhdlusvn2ql.R.iget(43444)!=0|true))||(__CLR4_5_2xhdxhdlusvn2ql.R.iget(43445)==0&false)); iter.next()) {{
                __CLR4_5_2xhdxhdlusvn2ql.R.inc(43446);count.incrementAndGet();
            }
            }__CLR4_5_2xhdxhdlusvn2ql.R.inc(43447);Assert.assertEquals(5, count.get());
        }
        {
            __CLR4_5_2xhdxhdlusvn2ql.R.inc(43448);Assert.assertEquals(2, array.subList(2, 4).size());
        }
    }finally{__CLR4_5_2xhdxhdlusvn2ql.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_2xhdxhdlusvn2ql.R.globalSliceStart(getClass().getName(),43449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k44xix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xhdxhdlusvn2ql.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xhdxhdlusvn2ql.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONArrayTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43449,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k44xix() throws Exception{try{__CLR4_5_2xhdxhdlusvn2ql.R.inc(43449);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43450);JSONArray array = new JSONArray();
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43451);array.add(123);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43452);array.add("222");
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43453);array.add(3);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43454);array.add(true);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43455);array.add("true");
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43456);array.add(null);

        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43457);Assert.assertEquals(123, array.getByte(0).byteValue());
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43458);Assert.assertEquals(123, array.getByteValue(0));

        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43459);Assert.assertEquals(123, array.getShort(0).shortValue());
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43460);Assert.assertEquals(123, array.getShortValue(0));

        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43461);Assert.assertTrue(123F == array.getFloat(0).floatValue());
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43462);Assert.assertTrue(123F == array.getFloatValue(0));

        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43463);Assert.assertTrue(123D == array.getDouble(0).doubleValue());
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43464);Assert.assertTrue(123D == array.getDoubleValue(0));

        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43465);Assert.assertEquals(123, array.getIntValue(0));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43466);Assert.assertEquals(123, array.getLongValue(0));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43467);Assert.assertEquals(new BigDecimal("123"), array.getBigDecimal(0));

        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43468);Assert.assertEquals(222, array.getIntValue(1));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43469);Assert.assertEquals(new Integer(222), array.getInteger(1));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43470);Assert.assertEquals(new Long(222), array.getLong(1));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43471);Assert.assertEquals(new BigDecimal("222"), array.getBigDecimal(1));

        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43472);Assert.assertEquals(true, array.getBooleanValue(4));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43473);Assert.assertEquals(Boolean.TRUE, array.getBoolean(4));

        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43474);Assert.assertEquals(0, array.getIntValue(5));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43475);Assert.assertEquals(0, array.getLongValue(5));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43476);Assert.assertEquals(null, array.getInteger(5));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43477);Assert.assertEquals(null, array.getLong(5));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43478);Assert.assertEquals(null, array.getBigDecimal(5));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43479);Assert.assertEquals(null, array.getBoolean(5));
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43480);Assert.assertEquals(false, array.getBooleanValue(5));
    }finally{__CLR4_5_2xhdxhdlusvn2ql.R.flushNeeded();}}

    public void test_getObject_null() throws Exception {__CLR4_5_2xhdxhdlusvn2ql.R.globalSliceStart(getClass().getName(),43481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yydx3vxjt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xhdxhdlusvn2ql.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xhdxhdlusvn2ql.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONArrayTest.test_getObject_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43481,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yydx3vxjt() throws Exception{try{__CLR4_5_2xhdxhdlusvn2ql.R.inc(43481);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43482);JSONArray array = new JSONArray();
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43483);array.add(null);

        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43484);Assert.assertTrue(array.getJSONObject(0) == null);
    }finally{__CLR4_5_2xhdxhdlusvn2ql.R.flushNeeded();}}

    public void test_getObject() throws Exception {__CLR4_5_2xhdxhdlusvn2ql.R.globalSliceStart(getClass().getName(),43485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ccr5e7xjx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xhdxhdlusvn2ql.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xhdxhdlusvn2ql.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONArrayTest.test_getObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43485,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ccr5e7xjx() throws Exception{try{__CLR4_5_2xhdxhdlusvn2ql.R.inc(43485);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43486);JSONArray array = new JSONArray();
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43487);array.add(new JSONObject());

        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43488);Assert.assertEquals(0, array.getJSONObject(0).size());
    }finally{__CLR4_5_2xhdxhdlusvn2ql.R.flushNeeded();}}

    public void test_getObject_map() throws Exception {__CLR4_5_2xhdxhdlusvn2ql.R.globalSliceStart(getClass().getName(),43489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23c9p8sxk1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xhdxhdlusvn2ql.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xhdxhdlusvn2ql.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONArrayTest.test_getObject_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43489,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23c9p8sxk1() throws Exception{try{__CLR4_5_2xhdxhdlusvn2ql.R.inc(43489);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43490);JSONArray array = new JSONArray();
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43491);array.add(new HashMap());

        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43492);Assert.assertEquals(0, array.getJSONObject(0).size());
    }finally{__CLR4_5_2xhdxhdlusvn2ql.R.flushNeeded();}}

    public void test_getArray() throws Exception {__CLR4_5_2xhdxhdlusvn2ql.R.globalSliceStart(getClass().getName(),43493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22snugnxk5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xhdxhdlusvn2ql.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xhdxhdlusvn2ql.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONArrayTest.test_getArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43493,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22snugnxk5() throws Exception{try{__CLR4_5_2xhdxhdlusvn2ql.R.inc(43493);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43494);JSONArray array = new JSONArray();
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43495);array.add(new ArrayList());

        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43496);Assert.assertEquals(0, array.getJSONArray(0).size());
    }finally{__CLR4_5_2xhdxhdlusvn2ql.R.flushNeeded();}}

    public void test_getArray_1() throws Exception {__CLR4_5_2xhdxhdlusvn2ql.R.globalSliceStart(getClass().getName(),43497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27uxml3xk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xhdxhdlusvn2ql.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xhdxhdlusvn2ql.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONArrayTest.test_getArray_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43497,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27uxml3xk9() throws Exception{try{__CLR4_5_2xhdxhdlusvn2ql.R.inc(43497);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43498);JSONArray array = new JSONArray();
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43499);array.add(new JSONArray());

        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43500);Assert.assertEquals(0, array.getJSONArray(0).size());
    }finally{__CLR4_5_2xhdxhdlusvn2ql.R.flushNeeded();}}

    public void test_constructor() throws Exception {__CLR4_5_2xhdxhdlusvn2ql.R.globalSliceStart(getClass().getName(),43501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24im07gxkd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xhdxhdlusvn2ql.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xhdxhdlusvn2ql.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONArrayTest.test_constructor",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43501,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24im07gxkd() throws Exception{try{__CLR4_5_2xhdxhdlusvn2ql.R.inc(43501);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43502);List<Object> list = new ArrayList();
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43503);JSONArray array = new JSONArray(list);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43504);array.add(3);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43505);Assert.assertEquals(1, list.size());
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43506);Assert.assertEquals(3, list.get(0));
    }finally{__CLR4_5_2xhdxhdlusvn2ql.R.flushNeeded();}}

    public void test_getJavaBean() throws Exception {__CLR4_5_2xhdxhdlusvn2ql.R.globalSliceStart(getClass().getName(),43507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e2b6xqxkj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xhdxhdlusvn2ql.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xhdxhdlusvn2ql.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONArrayTest.test_getJavaBean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43507,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e2b6xqxkj() throws Exception{try{__CLR4_5_2xhdxhdlusvn2ql.R.inc(43507);
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43508);JSONArray array = JSON.parseArray("[{id:123, name:'aaa'}]");
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43509);Assert.assertEquals(1, array.size());
        __CLR4_5_2xhdxhdlusvn2ql.R.inc(43510);Assert.assertEquals(123, array.getObject(0, User.class).getId());
    }finally{__CLR4_5_2xhdxhdlusvn2ql.R.flushNeeded();}}

    public static class User {

        private long   id;
        private String name;

        public long getId() {try{__CLR4_5_2xhdxhdlusvn2ql.R.inc(43511);
            __CLR4_5_2xhdxhdlusvn2ql.R.inc(43512);return id;
        }finally{__CLR4_5_2xhdxhdlusvn2ql.R.flushNeeded();}}

        public void setId(long id) {try{__CLR4_5_2xhdxhdlusvn2ql.R.inc(43513);
            __CLR4_5_2xhdxhdlusvn2ql.R.inc(43514);this.id = id;
        }finally{__CLR4_5_2xhdxhdlusvn2ql.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_2xhdxhdlusvn2ql.R.inc(43515);
            __CLR4_5_2xhdxhdlusvn2ql.R.inc(43516);return name;
        }finally{__CLR4_5_2xhdxhdlusvn2ql.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_2xhdxhdlusvn2ql.R.inc(43517);
            __CLR4_5_2xhdxhdlusvn2ql.R.inc(43518);this.name = name;
        }finally{__CLR4_5_2xhdxhdlusvn2ql.R.flushNeeded();}}

    }
}
