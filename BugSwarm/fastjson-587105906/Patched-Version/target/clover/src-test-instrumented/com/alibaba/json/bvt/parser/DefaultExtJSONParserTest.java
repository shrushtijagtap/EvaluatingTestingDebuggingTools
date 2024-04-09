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
package com.alibaba.json.bvt.parser;

import static com.alibaba.fastjson.util.TypeUtils.castToBigDecimal;
import static com.alibaba.fastjson.util.TypeUtils.castToBigInteger;
import static com.alibaba.fastjson.util.TypeUtils.castToBoolean;
import static com.alibaba.fastjson.util.TypeUtils.castToByte;
import static com.alibaba.fastjson.util.TypeUtils.castToDate;
import static com.alibaba.fastjson.util.TypeUtils.castToDouble;
import static com.alibaba.fastjson.util.TypeUtils.castToFloat;
import static com.alibaba.fastjson.util.TypeUtils.castToInt;
import static com.alibaba.fastjson.util.TypeUtils.castToLong;
import static com.alibaba.fastjson.util.TypeUtils.castToShort;
import static com.alibaba.fastjson.util.TypeUtils.castToString;

import java.io.Reader;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.TypeUtils;

import junit.framework.TestCase;

public class DefaultExtJSONParserTest extends TestCase {static class __CLR4_5_21gca1gcalusvncg3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,68134,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_parseObject() {__CLR4_5_21gca1gcalusvncg3.R.globalSliceStart(getClass().getName(),67834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rbp5mc1gca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gca1gcalusvncg3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gca1gcalusvncg3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_parseObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67834,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rbp5mc1gca(){try{__CLR4_5_21gca1gcalusvncg3.R.inc(67834);
        __CLR4_5_21gca1gcalusvncg3.R.inc(67835);new DefaultJSONParser("".toCharArray(), 0, ParserConfig.getGlobalInstance(), 0).close();
        __CLR4_5_21gca1gcalusvncg3.R.inc(67836);User user = new User();
        __CLR4_5_21gca1gcalusvncg3.R.inc(67837);user.setName("\u6821\u957f");
        __CLR4_5_21gca1gcalusvncg3.R.inc(67838);user.setAge(3);
        __CLR4_5_21gca1gcalusvncg3.R.inc(67839);user.setSalary(new BigDecimal("123456789.0123"));

        __CLR4_5_21gca1gcalusvncg3.R.inc(67840);String jsonString = JSON.toJSONString(user);

        __CLR4_5_21gca1gcalusvncg3.R.inc(67841);System.out.println(jsonString);

        __CLR4_5_21gca1gcalusvncg3.R.inc(67842);JSON.parseObject(jsonString);

        __CLR4_5_21gca1gcalusvncg3.R.inc(67843);DefaultJSONParser parser = new DefaultJSONParser(jsonString);
        __CLR4_5_21gca1gcalusvncg3.R.inc(67844);User user1 = new User();
        __CLR4_5_21gca1gcalusvncg3.R.inc(67845);parser.parseObject(user1);

        __CLR4_5_21gca1gcalusvncg3.R.inc(67846);Assert.assertEquals(user.getAge(), user1.getAge());
        __CLR4_5_21gca1gcalusvncg3.R.inc(67847);Assert.assertEquals(user.getName(), user1.getName());
        __CLR4_5_21gca1gcalusvncg3.R.inc(67848);Assert.assertEquals(user.getSalary(), user1.getSalary());
    }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

    public void testCastCalendar() throws Exception {__CLR4_5_21gca1gcalusvncg3.R.globalSliceStart(getClass().getName(),67849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gke1xm1gcp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gca1gcalusvncg3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gca1gcalusvncg3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.testCastCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67849,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gke1xm1gcp() throws Exception{try{__CLR4_5_21gca1gcalusvncg3.R.inc(67849);
        __CLR4_5_21gca1gcalusvncg3.R.inc(67850);Calendar c = Calendar.getInstance();
        __CLR4_5_21gca1gcalusvncg3.R.inc(67851);Date d = TypeUtils.castToDate(c);
        __CLR4_5_21gca1gcalusvncg3.R.inc(67852);Assert.assertEquals(c.getTime(), d);
    }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

    public void testCast() throws Exception {__CLR4_5_21gca1gcalusvncg3.R.globalSliceStart(getClass().getName(),67853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2173km01gct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gca1gcalusvncg3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gca1gcalusvncg3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.testCast",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67853,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2173km01gct() throws Exception{try{__CLR4_5_21gca1gcalusvncg3.R.inc(67853);
        __CLR4_5_21gca1gcalusvncg3.R.inc(67854);new TypeUtils();
        __CLR4_5_21gca1gcalusvncg3.R.inc(67855);DefaultJSONParser parser = new DefaultJSONParser("");

        __CLR4_5_21gca1gcalusvncg3.R.inc(67856);Assert.assertNull(castToByte(null));
        __CLR4_5_21gca1gcalusvncg3.R.inc(67857);Assert.assertNull(castToShort(null));
        __CLR4_5_21gca1gcalusvncg3.R.inc(67858);Assert.assertNull(castToInt(null));
        __CLR4_5_21gca1gcalusvncg3.R.inc(67859);Assert.assertNull(castToLong(null));
        __CLR4_5_21gca1gcalusvncg3.R.inc(67860);Assert.assertNull(castToBigInteger(null));
        __CLR4_5_21gca1gcalusvncg3.R.inc(67861);Assert.assertNull(castToBigDecimal(null));
        __CLR4_5_21gca1gcalusvncg3.R.inc(67862);Assert.assertNull(castToFloat(null));
        __CLR4_5_21gca1gcalusvncg3.R.inc(67863);Assert.assertNull(castToDouble(null));
        __CLR4_5_21gca1gcalusvncg3.R.inc(67864);Assert.assertNull(castToBoolean(null));
        __CLR4_5_21gca1gcalusvncg3.R.inc(67865);Assert.assertNull(castToDate(null));
        __CLR4_5_21gca1gcalusvncg3.R.inc(67866);Assert.assertNull(castToString(null));

        __CLR4_5_21gca1gcalusvncg3.R.inc(67867);Assert.assertEquals(12, castToByte("12").intValue());
        __CLR4_5_21gca1gcalusvncg3.R.inc(67868);Assert.assertEquals(1234, castToShort("1234").intValue());
        __CLR4_5_21gca1gcalusvncg3.R.inc(67869);Assert.assertEquals(1234, castToInt("1234").intValue());
        __CLR4_5_21gca1gcalusvncg3.R.inc(67870);Assert.assertEquals(1234, castToLong("1234").intValue());
        __CLR4_5_21gca1gcalusvncg3.R.inc(67871);Assert.assertEquals(1234, castToBigInteger("1234").intValue());
        __CLR4_5_21gca1gcalusvncg3.R.inc(67872);Assert.assertEquals(1234, castToBigDecimal("1234").intValue());
        __CLR4_5_21gca1gcalusvncg3.R.inc(67873);Assert.assertEquals(1234, castToFloat("1234").intValue());
        __CLR4_5_21gca1gcalusvncg3.R.inc(67874);Assert.assertEquals(1234, castToDouble("1234").intValue());

        __CLR4_5_21gca1gcalusvncg3.R.inc(67875);Assert.assertEquals(12, castToByte(12).intValue());
        __CLR4_5_21gca1gcalusvncg3.R.inc(67876);Assert.assertEquals(1234, castToShort(1234).intValue());
        __CLR4_5_21gca1gcalusvncg3.R.inc(67877);Assert.assertEquals(1234, castToInt(1234).intValue());
        __CLR4_5_21gca1gcalusvncg3.R.inc(67878);Assert.assertEquals(1234, castToLong(1234).intValue());
        __CLR4_5_21gca1gcalusvncg3.R.inc(67879);Assert.assertEquals(1234, castToBigInteger(1234).intValue());
        __CLR4_5_21gca1gcalusvncg3.R.inc(67880);Assert.assertEquals(1234, castToBigDecimal(1234).intValue());
        __CLR4_5_21gca1gcalusvncg3.R.inc(67881);Assert.assertEquals(1234, castToFloat(1234).intValue());
        __CLR4_5_21gca1gcalusvncg3.R.inc(67882);Assert.assertEquals(1234, castToDouble(1234).intValue());

        __CLR4_5_21gca1gcalusvncg3.R.inc(67883);Assert.assertEquals(Boolean.TRUE, castToBoolean(true));
        __CLR4_5_21gca1gcalusvncg3.R.inc(67884);Assert.assertEquals(Boolean.FALSE, castToBoolean(false));
        __CLR4_5_21gca1gcalusvncg3.R.inc(67885);Assert.assertEquals(Boolean.TRUE, castToBoolean(1));
        __CLR4_5_21gca1gcalusvncg3.R.inc(67886);Assert.assertEquals(Boolean.FALSE, castToBoolean(0));
        __CLR4_5_21gca1gcalusvncg3.R.inc(67887);Assert.assertEquals(Boolean.TRUE, castToBoolean("true"));
        __CLR4_5_21gca1gcalusvncg3.R.inc(67888);Assert.assertEquals(Boolean.FALSE, castToBoolean("false"));

        __CLR4_5_21gca1gcalusvncg3.R.inc(67889);long time = System.currentTimeMillis();
        __CLR4_5_21gca1gcalusvncg3.R.inc(67890);Assert.assertEquals(time, castToDate(new Date(time)).getTime());
        __CLR4_5_21gca1gcalusvncg3.R.inc(67891);Assert.assertEquals(time, castToDate(time).getTime());
        __CLR4_5_21gca1gcalusvncg3.R.inc(67892);Assert.assertEquals(time, castToDate(Long.toString(time)).getTime());

        __CLR4_5_21gca1gcalusvncg3.R.inc(67893);Assert.assertEquals("true", castToString("true"));
        __CLR4_5_21gca1gcalusvncg3.R.inc(67894);Assert.assertEquals("true", castToString(true));
        __CLR4_5_21gca1gcalusvncg3.R.inc(67895);Assert.assertEquals("123", castToString(123));

        __CLR4_5_21gca1gcalusvncg3.R.inc(67896);Assert.assertEquals(new BigDecimal("2"), castToBigDecimal("2"));
        __CLR4_5_21gca1gcalusvncg3.R.inc(67897);Assert.assertEquals(new BigDecimal("2"), castToBigDecimal(new BigInteger("2")));

    }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

    public void test_casterror2() {__CLR4_5_21gca1gcalusvncg3.R.globalSliceStart(getClass().getName(),67898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ufcx371ge2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gca1gcalusvncg3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gca1gcalusvncg3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_casterror2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67898,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ufcx371ge2(){try{__CLR4_5_21gca1gcalusvncg3.R.inc(67898);
        __CLR4_5_21gca1gcalusvncg3.R.inc(67899);DefaultJSONParser parser = new DefaultJSONParser("");
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(67900);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(67901);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67902);castToByte(new Object());
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67903);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(67904);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(67905);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(67906);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67907);castToShort(new Object());
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67908);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(67909);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(67910);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(67911);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67912);castToInt(new Object());
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67913);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(67914);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(67915);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(67916);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67917);castToLong(new Object());
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67918);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(67919);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(67920);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(67921);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67922);castToFloat(new Object());
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67923);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(67924);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(67925);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(67926);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67927);castToDouble(new Object());
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67928);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(67929);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(67930);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(67931);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67932);castToBigInteger(new Object());
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67933);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(67934);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(67935);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(67936);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67937);castToBigDecimal(new Object());
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67938);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(67939);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(67940);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(67941);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67942);castToDate(new Object());
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67943);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(67944);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(67945);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(67946);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67947);castToBoolean(new Object());
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67948);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(67949);Assert.assertNotNull(error);
        }
    }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

    public void test_casterror() {__CLR4_5_21gca1gcalusvncg3.R.globalSliceStart(getClass().getName(),67950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2biz5311gfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gca1gcalusvncg3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gca1gcalusvncg3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_casterror",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67950,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2biz5311gfi(){try{__CLR4_5_21gca1gcalusvncg3.R.inc(67950);
        __CLR4_5_21gca1gcalusvncg3.R.inc(67951);DefaultJSONParser parser = new DefaultJSONParser("");

        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(67952);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(67953);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67954);castToByte("xx");
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67955);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(67956);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(67957);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(67958);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67959);castToShort("xx");
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67960);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(67961);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(67962);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(67963);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67964);castToInt("xx");
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67965);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(67966);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(67967);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(67968);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67969);castToLong("xx");
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67970);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(67971);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(67972);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(67973);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67974);castToFloat("xx");
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67975);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(67976);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(67977);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(67978);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67979);castToDouble("xx");
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67980);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(67981);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(67982);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(67983);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67984);castToBigInteger("xx");
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67985);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(67986);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(67987);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(67988);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67989);castToBigDecimal("xx");
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67990);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(67991);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(67992);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(67993);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67994);castToDate("xx");
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67995);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(67996);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(67997);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(67998);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(67999);castToBoolean("xx");
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(68000);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(68001);Assert.assertNotNull(error);
        }
    }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

    @SuppressWarnings("rawtypes")
    public void test_parseArrayWithType() throws Exception {__CLR4_5_21gca1gcalusvncg3.R.globalSliceStart(getClass().getName(),68002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ab99p61ggy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gca1gcalusvncg3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gca1gcalusvncg3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_parseArrayWithType",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68002,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ab99p61ggy() throws Exception{try{__CLR4_5_21gca1gcalusvncg3.R.inc(68002);

        __CLR4_5_21gca1gcalusvncg3.R.inc(68003);Method method = DefaultExtJSONParserTest.class.getMethod("f", Collection.class, Collection.class, Collection.class, Collection.class, Collection.class,
                                                                 Collection.class, Collection.class);
        __CLR4_5_21gca1gcalusvncg3.R.inc(68004);Type[] types = method.getGenericParameterTypes();
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(68005);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
            __CLR4_5_21gca1gcalusvncg3.R.inc(68006);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68007);Assert.assertEquals(true, ((List) parser.parseArrayWithType(types[0])).get(0) instanceof Map);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(68008);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
            __CLR4_5_21gca1gcalusvncg3.R.inc(68009);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68010);Assert.assertEquals(true, ((List) parser.parseArrayWithType(types[1])).get(0) instanceof User);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(68011);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(68012);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(68013);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
                __CLR4_5_21gca1gcalusvncg3.R.inc(68014);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_5_21gca1gcalusvncg3.R.inc(68015);parser.parseArrayWithType(types[2]);
                __CLR4_5_21gca1gcalusvncg3.R.inc(68016);;
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(68017);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(68018);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(68019);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
            __CLR4_5_21gca1gcalusvncg3.R.inc(68020);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68021);Assert.assertEquals(true, ((List) parser.parseArrayWithType(types[3])).get(0) instanceof User);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(68022);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(68023);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(68024);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
                __CLR4_5_21gca1gcalusvncg3.R.inc(68025);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_5_21gca1gcalusvncg3.R.inc(68026);parser.parseArrayWithType(types[4]);
                __CLR4_5_21gca1gcalusvncg3.R.inc(68027);;
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(68028);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(68029);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(68030);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
            __CLR4_5_21gca1gcalusvncg3.R.inc(68031);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68032);Assert.assertEquals(true, ((List) parser.parseArrayWithType(types[5])).get(0) instanceof User);
        }

        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(68033);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(68034);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(68035);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
                __CLR4_5_21gca1gcalusvncg3.R.inc(68036);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_5_21gca1gcalusvncg3.R.inc(68037);parser.parseArrayWithType(types[6]);
                __CLR4_5_21gca1gcalusvncg3.R.inc(68038);;
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(68039);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(68040);Assert.assertNotNull(error);
        }
    }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

    public void test_parseArrayWithType_error_1() throws Exception {__CLR4_5_21gca1gcalusvncg3.R.globalSliceStart(getClass().getName(),68041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w6gwi31gi1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gca1gcalusvncg3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gca1gcalusvncg3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_parseArrayWithType_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68041,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w6gwi31gi1() throws Exception{try{__CLR4_5_21gca1gcalusvncg3.R.inc(68041);
        __CLR4_5_21gca1gcalusvncg3.R.inc(68042);Method method = DefaultExtJSONParserTest.class.getMethod("f", Collection.class, Collection.class, Collection.class, Collection.class, Collection.class,
                                                                 Collection.class, Collection.class);
        __CLR4_5_21gca1gcalusvncg3.R.inc(68043);Type[] types = method.getGenericParameterTypes();

        __CLR4_5_21gca1gcalusvncg3.R.inc(68044);Exception error = null;
        __CLR4_5_21gca1gcalusvncg3.R.inc(68045);try {
            __CLR4_5_21gca1gcalusvncg3.R.inc(68046);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
            __CLR4_5_21gca1gcalusvncg3.R.inc(68047);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68048);parser.parseArrayWithType(types[6]);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68049);;
        } catch (Exception ex) {
            __CLR4_5_21gca1gcalusvncg3.R.inc(68050);error = ex;
        }
        __CLR4_5_21gca1gcalusvncg3.R.inc(68051);Assert.assertNotNull(error);
    }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

    public static <T extends Object & Comparable<? super T>, T1 extends User> void f(Collection<?> p0, Collection<? extends User> p1,
                                                                                     Collection<? super User> p2, Collection<User> p3, Collection<T> p4,
                                                                                     Collection<T1> p5, Collection<T[]> p6) {try{__CLR4_5_21gca1gcalusvncg3.R.inc(68052);

    }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

    public void test_not_match() throws Exception {__CLR4_5_21gca1gcalusvncg3.R.globalSliceStart(getClass().getName(),68053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kg6urx1gid();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gca1gcalusvncg3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gca1gcalusvncg3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_not_match",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68053,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kg6urx1gid() throws Exception{try{__CLR4_5_21gca1gcalusvncg3.R.inc(68053);
        __CLR4_5_21gca1gcalusvncg3.R.inc(68054);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123, \"kxxx\":33}]";
        __CLR4_5_21gca1gcalusvncg3.R.inc(68055);DefaultJSONParser parser = new DefaultJSONParser(text);
        __CLR4_5_21gca1gcalusvncg3.R.inc(68056);Assert.assertEquals(true, (parser.parseArray(User.class).get(0) instanceof User));
    }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

    public void test_not_match_error() throws Exception {__CLR4_5_21gca1gcalusvncg3.R.globalSliceStart(getClass().getName(),68057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b68w9w1gih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gca1gcalusvncg3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gca1gcalusvncg3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_not_match_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68057,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b68w9w1gih() throws Exception{try{__CLR4_5_21gca1gcalusvncg3.R.inc(68057);
        __CLR4_5_21gca1gcalusvncg3.R.inc(68058);Exception error = null;
        __CLR4_5_21gca1gcalusvncg3.R.inc(68059);try {
            __CLR4_5_21gca1gcalusvncg3.R.inc(68060);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123, \"kxxx\":33}]";
            __CLR4_5_21gca1gcalusvncg3.R.inc(68061);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68062);parser.config(Feature.IgnoreNotMatch, false);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68063);Assert.assertEquals(true, (parser.parseArray(User.class).get(0) instanceof User));
        } catch (Exception ex) {
            __CLR4_5_21gca1gcalusvncg3.R.inc(68064);error = ex;
        }
        __CLR4_5_21gca1gcalusvncg3.R.inc(68065);Assert.assertNotNull(error);
    }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21gca1gcalusvncg3.R.globalSliceStart(getClass().getName(),68066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1giq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gca1gcalusvncg3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gca1gcalusvncg3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68066,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1giq() throws Exception{try{__CLR4_5_21gca1gcalusvncg3.R.inc(68066);
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(68067);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(68068);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(68069);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123]";
                __CLR4_5_21gca1gcalusvncg3.R.inc(68070);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_5_21gca1gcalusvncg3.R.inc(68071);parser.parseArray(User.class);
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(68072);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(68073);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(68074);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(68075);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(68076);String text = "{\"reader\":3}";
                __CLR4_5_21gca1gcalusvncg3.R.inc(68077);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_5_21gca1gcalusvncg3.R.inc(68078);parser.parseObject(ErrorObject.class);
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(68079);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(68080);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(68081);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(68082);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(68083);String text = "{\"name\":3}";
                __CLR4_5_21gca1gcalusvncg3.R.inc(68084);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_5_21gca1gcalusvncg3.R.inc(68085);parser.parseObject(ErrorObject2.class);
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(68086);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(68087);Assert.assertNotNull(error);
        }
    }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

    public static class ErrorObject {

        private Reader reader;

        public Reader getReader() {try{__CLR4_5_21gca1gcalusvncg3.R.inc(68088);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68089);return reader;
        }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

        public void setReader(Reader reader) {try{__CLR4_5_21gca1gcalusvncg3.R.inc(68090);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68091);this.reader = reader;
        }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}
    }

    public static class ErrorObject2 {

        private String name;

        public String getName() {try{__CLR4_5_21gca1gcalusvncg3.R.inc(68092);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68093);return name;
        }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21gca1gcalusvncg3.R.inc(68094);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68095);throw new UnsupportedOperationException();
        }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

    }

    public void test_error2() throws Exception {__CLR4_5_21gca1gcalusvncg3.R.globalSliceStart(getClass().getName(),68096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24vg1sy1gjk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gca1gcalusvncg3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gca1gcalusvncg3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_error2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68096,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24vg1sy1gjk() throws Exception{try{__CLR4_5_21gca1gcalusvncg3.R.inc(68096);
        {
            __CLR4_5_21gca1gcalusvncg3.R.inc(68097);Exception error = null;
            __CLR4_5_21gca1gcalusvncg3.R.inc(68098);try {
                __CLR4_5_21gca1gcalusvncg3.R.inc(68099);String text = "{}";
                __CLR4_5_21gca1gcalusvncg3.R.inc(68100);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_5_21gca1gcalusvncg3.R.inc(68101);parser.parseArray(User.class);
            } catch (Exception ex) {
                __CLR4_5_21gca1gcalusvncg3.R.inc(68102);error = ex;
            }
            __CLR4_5_21gca1gcalusvncg3.R.inc(68103);Assert.assertNotNull(error);
        }
    }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

    public static class User {

        private String     name;
        private int        age;
        private BigDecimal salary;
        private Date       birthdate;
        private boolean    old;

        public boolean isOld() {try{__CLR4_5_21gca1gcalusvncg3.R.inc(68104);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68105);return old;
        }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

        public void setOld(boolean old) {try{__CLR4_5_21gca1gcalusvncg3.R.inc(68106);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68107);this.old = old;
        }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

        public Date getBirthdate() {try{__CLR4_5_21gca1gcalusvncg3.R.inc(68108);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68109);return birthdate;
        }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

        public void setBirthdate(Date birthdate) {try{__CLR4_5_21gca1gcalusvncg3.R.inc(68110);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68111);this.birthdate = birthdate;
        }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21gca1gcalusvncg3.R.inc(68112);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68113);return name;
        }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21gca1gcalusvncg3.R.inc(68114);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68115);this.name = name;
        }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

        public int getAge() {try{__CLR4_5_21gca1gcalusvncg3.R.inc(68116);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68117);return age;
        }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

        public void setAge(int age) {try{__CLR4_5_21gca1gcalusvncg3.R.inc(68118);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68119);this.age = age;
        }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

        public void setage(int age) {try{__CLR4_5_21gca1gcalusvncg3.R.inc(68120);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68121);throw new UnsupportedOperationException();
        }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

        public void set(int age) {try{__CLR4_5_21gca1gcalusvncg3.R.inc(68122);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68123);throw new UnsupportedOperationException();
        }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

        public void get(int age) {try{__CLR4_5_21gca1gcalusvncg3.R.inc(68124);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68125);throw new UnsupportedOperationException();
        }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

        public void is(int age) {try{__CLR4_5_21gca1gcalusvncg3.R.inc(68126);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68127);throw new UnsupportedOperationException();
        }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

        public BigDecimal getSalary() {try{__CLR4_5_21gca1gcalusvncg3.R.inc(68128);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68129);return salary;
        }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

        public void setSalary(BigDecimal salary) {try{__CLR4_5_21gca1gcalusvncg3.R.inc(68130);
            __CLR4_5_21gca1gcalusvncg3.R.inc(68131);this.salary = salary;
        }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

        public static void setFF() {try{__CLR4_5_21gca1gcalusvncg3.R.inc(68132);

        }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}

        void setXX() {try{__CLR4_5_21gca1gcalusvncg3.R.inc(68133);

        }finally{__CLR4_5_21gca1gcalusvncg3.R.flushNeeded();}}
    }
}
