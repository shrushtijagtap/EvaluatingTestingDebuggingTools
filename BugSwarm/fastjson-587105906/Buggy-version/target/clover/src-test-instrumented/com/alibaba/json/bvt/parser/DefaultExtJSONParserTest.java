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

public class DefaultExtJSONParserTest extends TestCase {static class __CLR4_1_101gcl1gclluszwc9u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,68145,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_parseObject() {__CLR4_1_101gcl1gclluszwc9u.R.globalSliceStart(getClass().getName(),67845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rbp5mc1gcl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gcl1gclluszwc9u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gcl1gclluszwc9u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_parseObject",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67845,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rbp5mc1gcl(){try{__CLR4_1_101gcl1gclluszwc9u.R.inc(67845);
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67846);new DefaultJSONParser("".toCharArray(), 0, ParserConfig.getGlobalInstance(), 0).close();
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67847);User user = new User();
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67848);user.setName("\u6821\u957f");
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67849);user.setAge(3);
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67850);user.setSalary(new BigDecimal("123456789.0123"));

        __CLR4_1_101gcl1gclluszwc9u.R.inc(67851);String jsonString = JSON.toJSONString(user);

        __CLR4_1_101gcl1gclluszwc9u.R.inc(67852);System.out.println(jsonString);

        __CLR4_1_101gcl1gclluszwc9u.R.inc(67853);JSON.parseObject(jsonString);

        __CLR4_1_101gcl1gclluszwc9u.R.inc(67854);DefaultJSONParser parser = new DefaultJSONParser(jsonString);
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67855);User user1 = new User();
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67856);parser.parseObject(user1);

        __CLR4_1_101gcl1gclluszwc9u.R.inc(67857);Assert.assertEquals(user.getAge(), user1.getAge());
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67858);Assert.assertEquals(user.getName(), user1.getName());
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67859);Assert.assertEquals(user.getSalary(), user1.getSalary());
    }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

    public void testCastCalendar() throws Exception {__CLR4_1_101gcl1gclluszwc9u.R.globalSliceStart(getClass().getName(),67860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gke1xm1gd0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gcl1gclluszwc9u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gcl1gclluszwc9u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.testCastCalendar",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67860,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gke1xm1gd0() throws Exception{try{__CLR4_1_101gcl1gclluszwc9u.R.inc(67860);
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67861);Calendar c = Calendar.getInstance();
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67862);Date d = TypeUtils.castToDate(c);
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67863);Assert.assertEquals(c.getTime(), d);
    }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

    public void testCast() throws Exception {__CLR4_1_101gcl1gclluszwc9u.R.globalSliceStart(getClass().getName(),67864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10173km01gd4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gcl1gclluszwc9u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gcl1gclluszwc9u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.testCast",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67864,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10173km01gd4() throws Exception{try{__CLR4_1_101gcl1gclluszwc9u.R.inc(67864);
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67865);new TypeUtils();
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67866);DefaultJSONParser parser = new DefaultJSONParser("");

        __CLR4_1_101gcl1gclluszwc9u.R.inc(67867);Assert.assertNull(castToByte(null));
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67868);Assert.assertNull(castToShort(null));
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67869);Assert.assertNull(castToInt(null));
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67870);Assert.assertNull(castToLong(null));
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67871);Assert.assertNull(castToBigInteger(null));
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67872);Assert.assertNull(castToBigDecimal(null));
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67873);Assert.assertNull(castToFloat(null));
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67874);Assert.assertNull(castToDouble(null));
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67875);Assert.assertNull(castToBoolean(null));
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67876);Assert.assertNull(castToDate(null));
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67877);Assert.assertNull(castToString(null));

        __CLR4_1_101gcl1gclluszwc9u.R.inc(67878);Assert.assertEquals(12, castToByte("12").intValue());
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67879);Assert.assertEquals(1234, castToShort("1234").intValue());
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67880);Assert.assertEquals(1234, castToInt("1234").intValue());
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67881);Assert.assertEquals(1234, castToLong("1234").intValue());
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67882);Assert.assertEquals(1234, castToBigInteger("1234").intValue());
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67883);Assert.assertEquals(1234, castToBigDecimal("1234").intValue());
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67884);Assert.assertEquals(1234, castToFloat("1234").intValue());
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67885);Assert.assertEquals(1234, castToDouble("1234").intValue());

        __CLR4_1_101gcl1gclluszwc9u.R.inc(67886);Assert.assertEquals(12, castToByte(12).intValue());
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67887);Assert.assertEquals(1234, castToShort(1234).intValue());
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67888);Assert.assertEquals(1234, castToInt(1234).intValue());
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67889);Assert.assertEquals(1234, castToLong(1234).intValue());
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67890);Assert.assertEquals(1234, castToBigInteger(1234).intValue());
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67891);Assert.assertEquals(1234, castToBigDecimal(1234).intValue());
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67892);Assert.assertEquals(1234, castToFloat(1234).intValue());
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67893);Assert.assertEquals(1234, castToDouble(1234).intValue());

        __CLR4_1_101gcl1gclluszwc9u.R.inc(67894);Assert.assertEquals(Boolean.TRUE, castToBoolean(true));
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67895);Assert.assertEquals(Boolean.FALSE, castToBoolean(false));
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67896);Assert.assertEquals(Boolean.TRUE, castToBoolean(1));
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67897);Assert.assertEquals(Boolean.FALSE, castToBoolean(0));
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67898);Assert.assertEquals(Boolean.TRUE, castToBoolean("true"));
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67899);Assert.assertEquals(Boolean.FALSE, castToBoolean("false"));

        __CLR4_1_101gcl1gclluszwc9u.R.inc(67900);long time = System.currentTimeMillis();
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67901);Assert.assertEquals(time, castToDate(new Date(time)).getTime());
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67902);Assert.assertEquals(time, castToDate(time).getTime());
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67903);Assert.assertEquals(time, castToDate(Long.toString(time)).getTime());

        __CLR4_1_101gcl1gclluszwc9u.R.inc(67904);Assert.assertEquals("true", castToString("true"));
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67905);Assert.assertEquals("true", castToString(true));
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67906);Assert.assertEquals("123", castToString(123));

        __CLR4_1_101gcl1gclluszwc9u.R.inc(67907);Assert.assertEquals(new BigDecimal("2"), castToBigDecimal("2"));
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67908);Assert.assertEquals(new BigDecimal("2"), castToBigDecimal(new BigInteger("2")));

    }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

    public void test_casterror2() {__CLR4_1_101gcl1gclluszwc9u.R.globalSliceStart(getClass().getName(),67909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ufcx371ged();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gcl1gclluszwc9u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gcl1gclluszwc9u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_casterror2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67909,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ufcx371ged(){try{__CLR4_1_101gcl1gclluszwc9u.R.inc(67909);
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67910);DefaultJSONParser parser = new DefaultJSONParser("");
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67911);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67912);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67913);castToByte(new Object());
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67914);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67915);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67916);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67917);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67918);castToShort(new Object());
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67919);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67920);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67921);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67922);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67923);castToInt(new Object());
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67924);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67925);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67926);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67927);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67928);castToLong(new Object());
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67929);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67930);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67931);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67932);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67933);castToFloat(new Object());
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67934);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67935);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67936);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67937);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67938);castToDouble(new Object());
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67939);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67940);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67941);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67942);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67943);castToBigInteger(new Object());
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67944);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67945);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67946);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67947);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67948);castToBigDecimal(new Object());
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67949);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67950);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67951);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67952);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67953);castToDate(new Object());
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67954);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67955);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67956);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67957);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67958);castToBoolean(new Object());
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67959);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67960);Assert.assertNotNull(error);
        }
    }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

    public void test_casterror() {__CLR4_1_101gcl1gclluszwc9u.R.globalSliceStart(getClass().getName(),67961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10biz5311gft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gcl1gclluszwc9u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gcl1gclluszwc9u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_casterror",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67961,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10biz5311gft(){try{__CLR4_1_101gcl1gclluszwc9u.R.inc(67961);
        __CLR4_1_101gcl1gclluszwc9u.R.inc(67962);DefaultJSONParser parser = new DefaultJSONParser("");

        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67963);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67964);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67965);castToByte("xx");
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67966);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67967);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67968);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67969);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67970);castToShort("xx");
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67971);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67972);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67973);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67974);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67975);castToInt("xx");
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67976);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67977);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67978);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67979);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67980);castToLong("xx");
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67981);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67982);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67983);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67984);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67985);castToFloat("xx");
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67986);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67987);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67988);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67989);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67990);castToDouble("xx");
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67991);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67992);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67993);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67994);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67995);castToBigInteger("xx");
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(67996);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67997);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67998);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(67999);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68000);castToBigDecimal("xx");
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68001);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68002);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68003);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68004);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68005);castToDate("xx");
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68006);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68007);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68008);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68009);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68010);castToBoolean("xx");
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68011);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68012);Assert.assertNotNull(error);
        }
    }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

    @SuppressWarnings("rawtypes")
    public void test_parseArrayWithType() throws Exception {__CLR4_1_101gcl1gclluszwc9u.R.globalSliceStart(getClass().getName(),68013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ab99p61gh9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gcl1gclluszwc9u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gcl1gclluszwc9u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_parseArrayWithType",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68013,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ab99p61gh9() throws Exception{try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68013);

        __CLR4_1_101gcl1gclluszwc9u.R.inc(68014);Method method = DefaultExtJSONParserTest.class.getMethod("f", Collection.class, Collection.class, Collection.class, Collection.class, Collection.class,
                                                                 Collection.class, Collection.class);
        __CLR4_1_101gcl1gclluszwc9u.R.inc(68015);Type[] types = method.getGenericParameterTypes();
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68016);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68017);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68018);Assert.assertEquals(true, ((List) parser.parseArrayWithType(types[0])).get(0) instanceof Map);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68019);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68020);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68021);Assert.assertEquals(true, ((List) parser.parseArrayWithType(types[1])).get(0) instanceof User);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68022);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68023);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68024);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68025);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68026);parser.parseArrayWithType(types[2]);
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68027);;
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68028);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68029);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68030);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68031);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68032);Assert.assertEquals(true, ((List) parser.parseArrayWithType(types[3])).get(0) instanceof User);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68033);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68034);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68035);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68036);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68037);parser.parseArrayWithType(types[4]);
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68038);;
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68039);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68040);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68041);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68042);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68043);Assert.assertEquals(true, ((List) parser.parseArrayWithType(types[5])).get(0) instanceof User);
        }

        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68044);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68045);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68046);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68047);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68048);parser.parseArrayWithType(types[6]);
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68049);;
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68050);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68051);Assert.assertNotNull(error);
        }
    }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

    public void test_parseArrayWithType_error_1() throws Exception {__CLR4_1_101gcl1gclluszwc9u.R.globalSliceStart(getClass().getName(),68052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10w6gwi31gic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gcl1gclluszwc9u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gcl1gclluszwc9u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_parseArrayWithType_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68052,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10w6gwi31gic() throws Exception{try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68052);
        __CLR4_1_101gcl1gclluszwc9u.R.inc(68053);Method method = DefaultExtJSONParserTest.class.getMethod("f", Collection.class, Collection.class, Collection.class, Collection.class, Collection.class,
                                                                 Collection.class, Collection.class);
        __CLR4_1_101gcl1gclluszwc9u.R.inc(68054);Type[] types = method.getGenericParameterTypes();

        __CLR4_1_101gcl1gclluszwc9u.R.inc(68055);Exception error = null;
        __CLR4_1_101gcl1gclluszwc9u.R.inc(68056);try {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68057);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68058);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68059);parser.parseArrayWithType(types[6]);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68060);;
        } catch (Exception ex) {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68061);error = ex;
        }
        __CLR4_1_101gcl1gclluszwc9u.R.inc(68062);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

    public static <T extends Object & Comparable<? super T>, T1 extends User> void f(Collection<?> p0, Collection<? extends User> p1,
                                                                                     Collection<? super User> p2, Collection<User> p3, Collection<T> p4,
                                                                                     Collection<T1> p5, Collection<T[]> p6) {try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68063);

    }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

    public void test_not_match() throws Exception {__CLR4_1_101gcl1gclluszwc9u.R.globalSliceStart(getClass().getName(),68064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kg6urx1gio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gcl1gclluszwc9u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gcl1gclluszwc9u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_not_match",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68064,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kg6urx1gio() throws Exception{try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68064);
        __CLR4_1_101gcl1gclluszwc9u.R.inc(68065);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123, \"kxxx\":33}]";
        __CLR4_1_101gcl1gclluszwc9u.R.inc(68066);DefaultJSONParser parser = new DefaultJSONParser(text);
        __CLR4_1_101gcl1gclluszwc9u.R.inc(68067);Assert.assertEquals(true, (parser.parseArray(User.class).get(0) instanceof User));
    }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

    public void test_not_match_error() throws Exception {__CLR4_1_101gcl1gclluszwc9u.R.globalSliceStart(getClass().getName(),68068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10b68w9w1gis();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gcl1gclluszwc9u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gcl1gclluszwc9u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_not_match_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68068,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10b68w9w1gis() throws Exception{try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68068);
        __CLR4_1_101gcl1gclluszwc9u.R.inc(68069);Exception error = null;
        __CLR4_1_101gcl1gclluszwc9u.R.inc(68070);try {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68071);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123, \"kxxx\":33}]";
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68072);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68073);parser.config(Feature.IgnoreNotMatch, false);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68074);Assert.assertEquals(true, (parser.parseArray(User.class).get(0) instanceof User));
        } catch (Exception ex) {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68075);error = ex;
        }
        __CLR4_1_101gcl1gclluszwc9u.R.inc(68076);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101gcl1gclluszwc9u.R.globalSliceStart(getClass().getName(),68077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1gj1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gcl1gclluszwc9u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gcl1gclluszwc9u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68077,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1gj1() throws Exception{try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68077);
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68078);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68079);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68080);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123]";
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68081);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68082);parser.parseArray(User.class);
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68083);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68084);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68085);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68086);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68087);String text = "{\"reader\":3}";
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68088);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68089);parser.parseObject(ErrorObject.class);
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68090);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68091);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68092);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68093);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68094);String text = "{\"name\":3}";
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68095);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68096);parser.parseObject(ErrorObject2.class);
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68097);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68098);Assert.assertNotNull(error);
        }
    }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

    public static class ErrorObject {

        private Reader reader;

        public Reader getReader() {try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68099);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68100);return reader;
        }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

        public void setReader(Reader reader) {try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68101);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68102);this.reader = reader;
        }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}
    }

    public static class ErrorObject2 {

        private String name;

        public String getName() {try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68103);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68104);return name;
        }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68105);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68106);throw new UnsupportedOperationException();
        }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

    }

    public void test_error2() throws Exception {__CLR4_1_101gcl1gclluszwc9u.R.globalSliceStart(getClass().getName(),68107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104vg1sy1gjv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gcl1gclluszwc9u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gcl1gclluszwc9u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_error2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68107,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104vg1sy1gjv() throws Exception{try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68107);
        {
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68108);Exception error = null;
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68109);try {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68110);String text = "{}";
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68111);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68112);parser.parseArray(User.class);
            } catch (Exception ex) {
                __CLR4_1_101gcl1gclluszwc9u.R.inc(68113);error = ex;
            }
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68114);Assert.assertNotNull(error);
        }
    }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

    public static class User {

        private String     name;
        private int        age;
        private BigDecimal salary;
        private Date       birthdate;
        private boolean    old;

        public boolean isOld() {try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68115);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68116);return old;
        }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

        public void setOld(boolean old) {try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68117);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68118);this.old = old;
        }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

        public Date getBirthdate() {try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68119);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68120);return birthdate;
        }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

        public void setBirthdate(Date birthdate) {try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68121);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68122);this.birthdate = birthdate;
        }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68123);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68124);return name;
        }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68125);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68126);this.name = name;
        }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

        public int getAge() {try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68127);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68128);return age;
        }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

        public void setAge(int age) {try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68129);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68130);this.age = age;
        }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

        public void setage(int age) {try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68131);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68132);throw new UnsupportedOperationException();
        }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

        public void set(int age) {try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68133);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68134);throw new UnsupportedOperationException();
        }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

        public void get(int age) {try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68135);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68136);throw new UnsupportedOperationException();
        }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

        public void is(int age) {try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68137);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68138);throw new UnsupportedOperationException();
        }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

        public BigDecimal getSalary() {try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68139);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68140);return salary;
        }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

        public void setSalary(BigDecimal salary) {try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68141);
            __CLR4_1_101gcl1gclluszwc9u.R.inc(68142);this.salary = salary;
        }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

        public static void setFF() {try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68143);

        }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}

        void setXX() {try{__CLR4_1_101gcl1gclluszwc9u.R.inc(68144);

        }finally{__CLR4_1_101gcl1gclluszwc9u.R.flushNeeded();}}
    }
}
