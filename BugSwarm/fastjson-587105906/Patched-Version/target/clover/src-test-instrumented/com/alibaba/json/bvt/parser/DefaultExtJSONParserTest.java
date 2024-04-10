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

public class DefaultExtJSONParserTest extends TestCase {static class __CLR4_5_21fe21fe2lusyjtki{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,66902,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_parseObject() {__CLR4_5_21fe21fe2lusyjtki.R.globalSliceStart(getClass().getName(),66602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rbp5mc1fe2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fe21fe2lusyjtki.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fe21fe2lusyjtki.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_parseObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66602,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rbp5mc1fe2(){try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66602);
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66603);new DefaultJSONParser("".toCharArray(), 0, ParserConfig.getGlobalInstance(), 0).close();
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66604);User user = new User();
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66605);user.setName("\u6821\u957f");
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66606);user.setAge(3);
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66607);user.setSalary(new BigDecimal("123456789.0123"));

        __CLR4_5_21fe21fe2lusyjtki.R.inc(66608);String jsonString = JSON.toJSONString(user);

        __CLR4_5_21fe21fe2lusyjtki.R.inc(66609);System.out.println(jsonString);

        __CLR4_5_21fe21fe2lusyjtki.R.inc(66610);JSON.parseObject(jsonString);

        __CLR4_5_21fe21fe2lusyjtki.R.inc(66611);DefaultJSONParser parser = new DefaultJSONParser(jsonString);
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66612);User user1 = new User();
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66613);parser.parseObject(user1);

        __CLR4_5_21fe21fe2lusyjtki.R.inc(66614);Assert.assertEquals(user.getAge(), user1.getAge());
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66615);Assert.assertEquals(user.getName(), user1.getName());
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66616);Assert.assertEquals(user.getSalary(), user1.getSalary());
    }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

    public void testCastCalendar() throws Exception {__CLR4_5_21fe21fe2lusyjtki.R.globalSliceStart(getClass().getName(),66617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gke1xm1feh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fe21fe2lusyjtki.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fe21fe2lusyjtki.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.testCastCalendar",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66617,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gke1xm1feh() throws Exception{try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66617);
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66618);Calendar c = Calendar.getInstance();
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66619);Date d = TypeUtils.castToDate(c);
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66620);Assert.assertEquals(c.getTime(), d);
    }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

    public void testCast() throws Exception {__CLR4_5_21fe21fe2lusyjtki.R.globalSliceStart(getClass().getName(),66621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2173km01fel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fe21fe2lusyjtki.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fe21fe2lusyjtki.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.testCast",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66621,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2173km01fel() throws Exception{try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66621);
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66622);new TypeUtils();
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66623);DefaultJSONParser parser = new DefaultJSONParser("");

        __CLR4_5_21fe21fe2lusyjtki.R.inc(66624);Assert.assertNull(castToByte(null));
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66625);Assert.assertNull(castToShort(null));
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66626);Assert.assertNull(castToInt(null));
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66627);Assert.assertNull(castToLong(null));
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66628);Assert.assertNull(castToBigInteger(null));
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66629);Assert.assertNull(castToBigDecimal(null));
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66630);Assert.assertNull(castToFloat(null));
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66631);Assert.assertNull(castToDouble(null));
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66632);Assert.assertNull(castToBoolean(null));
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66633);Assert.assertNull(castToDate(null));
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66634);Assert.assertNull(castToString(null));

        __CLR4_5_21fe21fe2lusyjtki.R.inc(66635);Assert.assertEquals(12, castToByte("12").intValue());
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66636);Assert.assertEquals(1234, castToShort("1234").intValue());
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66637);Assert.assertEquals(1234, castToInt("1234").intValue());
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66638);Assert.assertEquals(1234, castToLong("1234").intValue());
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66639);Assert.assertEquals(1234, castToBigInteger("1234").intValue());
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66640);Assert.assertEquals(1234, castToBigDecimal("1234").intValue());
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66641);Assert.assertEquals(1234, castToFloat("1234").intValue());
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66642);Assert.assertEquals(1234, castToDouble("1234").intValue());

        __CLR4_5_21fe21fe2lusyjtki.R.inc(66643);Assert.assertEquals(12, castToByte(12).intValue());
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66644);Assert.assertEquals(1234, castToShort(1234).intValue());
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66645);Assert.assertEquals(1234, castToInt(1234).intValue());
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66646);Assert.assertEquals(1234, castToLong(1234).intValue());
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66647);Assert.assertEquals(1234, castToBigInteger(1234).intValue());
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66648);Assert.assertEquals(1234, castToBigDecimal(1234).intValue());
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66649);Assert.assertEquals(1234, castToFloat(1234).intValue());
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66650);Assert.assertEquals(1234, castToDouble(1234).intValue());

        __CLR4_5_21fe21fe2lusyjtki.R.inc(66651);Assert.assertEquals(Boolean.TRUE, castToBoolean(true));
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66652);Assert.assertEquals(Boolean.FALSE, castToBoolean(false));
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66653);Assert.assertEquals(Boolean.TRUE, castToBoolean(1));
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66654);Assert.assertEquals(Boolean.FALSE, castToBoolean(0));
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66655);Assert.assertEquals(Boolean.TRUE, castToBoolean("true"));
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66656);Assert.assertEquals(Boolean.FALSE, castToBoolean("false"));

        __CLR4_5_21fe21fe2lusyjtki.R.inc(66657);long time = System.currentTimeMillis();
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66658);Assert.assertEquals(time, castToDate(new Date(time)).getTime());
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66659);Assert.assertEquals(time, castToDate(time).getTime());
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66660);Assert.assertEquals(time, castToDate(Long.toString(time)).getTime());

        __CLR4_5_21fe21fe2lusyjtki.R.inc(66661);Assert.assertEquals("true", castToString("true"));
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66662);Assert.assertEquals("true", castToString(true));
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66663);Assert.assertEquals("123", castToString(123));

        __CLR4_5_21fe21fe2lusyjtki.R.inc(66664);Assert.assertEquals(new BigDecimal("2"), castToBigDecimal("2"));
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66665);Assert.assertEquals(new BigDecimal("2"), castToBigDecimal(new BigInteger("2")));

    }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

    public void test_casterror2() {__CLR4_5_21fe21fe2lusyjtki.R.globalSliceStart(getClass().getName(),66666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ufcx371ffu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fe21fe2lusyjtki.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fe21fe2lusyjtki.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_casterror2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66666,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ufcx371ffu(){try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66666);
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66667);DefaultJSONParser parser = new DefaultJSONParser("");
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66668);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66669);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66670);castToByte(new Object());
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66671);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66672);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66673);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66674);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66675);castToShort(new Object());
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66676);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66677);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66678);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66679);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66680);castToInt(new Object());
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66681);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66682);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66683);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66684);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66685);castToLong(new Object());
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66686);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66687);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66688);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66689);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66690);castToFloat(new Object());
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66691);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66692);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66693);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66694);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66695);castToDouble(new Object());
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66696);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66697);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66698);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66699);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66700);castToBigInteger(new Object());
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66701);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66702);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66703);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66704);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66705);castToBigDecimal(new Object());
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66706);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66707);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66708);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66709);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66710);castToDate(new Object());
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66711);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66712);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66713);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66714);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66715);castToBoolean(new Object());
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66716);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66717);Assert.assertNotNull(error);
        }
    }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

    public void test_casterror() {__CLR4_5_21fe21fe2lusyjtki.R.globalSliceStart(getClass().getName(),66718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2biz5311fha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fe21fe2lusyjtki.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fe21fe2lusyjtki.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_casterror",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66718,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2biz5311fha(){try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66718);
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66719);DefaultJSONParser parser = new DefaultJSONParser("");

        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66720);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66721);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66722);castToByte("xx");
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66723);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66724);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66725);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66726);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66727);castToShort("xx");
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66728);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66729);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66730);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66731);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66732);castToInt("xx");
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66733);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66734);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66735);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66736);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66737);castToLong("xx");
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66738);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66739);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66740);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66741);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66742);castToFloat("xx");
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66743);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66744);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66745);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66746);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66747);castToDouble("xx");
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66748);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66749);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66750);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66751);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66752);castToBigInteger("xx");
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66753);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66754);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66755);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66756);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66757);castToBigDecimal("xx");
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66758);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66759);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66760);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66761);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66762);castToDate("xx");
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66763);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66764);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66765);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66766);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66767);castToBoolean("xx");
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66768);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66769);Assert.assertNotNull(error);
        }
    }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

    @SuppressWarnings("rawtypes")
    public void test_parseArrayWithType() throws Exception {__CLR4_5_21fe21fe2lusyjtki.R.globalSliceStart(getClass().getName(),66770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ab99p61fiq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fe21fe2lusyjtki.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fe21fe2lusyjtki.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_parseArrayWithType",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66770,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ab99p61fiq() throws Exception{try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66770);

        __CLR4_5_21fe21fe2lusyjtki.R.inc(66771);Method method = DefaultExtJSONParserTest.class.getMethod("f", Collection.class, Collection.class, Collection.class, Collection.class, Collection.class,
                                                                 Collection.class, Collection.class);
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66772);Type[] types = method.getGenericParameterTypes();
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66773);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66774);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66775);Assert.assertEquals(true, ((List) parser.parseArrayWithType(types[0])).get(0) instanceof Map);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66776);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66777);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66778);Assert.assertEquals(true, ((List) parser.parseArrayWithType(types[1])).get(0) instanceof User);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66779);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66780);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66781);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66782);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66783);parser.parseArrayWithType(types[2]);
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66784);;
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66785);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66786);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66787);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66788);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66789);Assert.assertEquals(true, ((List) parser.parseArrayWithType(types[3])).get(0) instanceof User);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66790);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66791);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66792);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66793);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66794);parser.parseArrayWithType(types[4]);
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66795);;
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66796);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66797);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66798);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66799);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66800);Assert.assertEquals(true, ((List) parser.parseArrayWithType(types[5])).get(0) instanceof User);
        }

        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66801);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66802);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66803);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66804);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66805);parser.parseArrayWithType(types[6]);
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66806);;
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66807);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66808);Assert.assertNotNull(error);
        }
    }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

    public void test_parseArrayWithType_error_1() throws Exception {__CLR4_5_21fe21fe2lusyjtki.R.globalSliceStart(getClass().getName(),66809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w6gwi31fjt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fe21fe2lusyjtki.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fe21fe2lusyjtki.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_parseArrayWithType_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66809,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w6gwi31fjt() throws Exception{try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66809);
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66810);Method method = DefaultExtJSONParserTest.class.getMethod("f", Collection.class, Collection.class, Collection.class, Collection.class, Collection.class,
                                                                 Collection.class, Collection.class);
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66811);Type[] types = method.getGenericParameterTypes();

        __CLR4_5_21fe21fe2lusyjtki.R.inc(66812);Exception error = null;
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66813);try {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66814);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66815);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66816);parser.parseArrayWithType(types[6]);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66817);;
        } catch (Exception ex) {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66818);error = ex;
        }
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66819);Assert.assertNotNull(error);
    }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

    public static <T extends Object & Comparable<? super T>, T1 extends User> void f(Collection<?> p0, Collection<? extends User> p1,
                                                                                     Collection<? super User> p2, Collection<User> p3, Collection<T> p4,
                                                                                     Collection<T1> p5, Collection<T[]> p6) {try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66820);

    }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

    public void test_not_match() throws Exception {__CLR4_5_21fe21fe2lusyjtki.R.globalSliceStart(getClass().getName(),66821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kg6urx1fk5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fe21fe2lusyjtki.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fe21fe2lusyjtki.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_not_match",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66821,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kg6urx1fk5() throws Exception{try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66821);
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66822);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123, \"kxxx\":33}]";
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66823);DefaultJSONParser parser = new DefaultJSONParser(text);
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66824);Assert.assertEquals(true, (parser.parseArray(User.class).get(0) instanceof User));
    }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

    public void test_not_match_error() throws Exception {__CLR4_5_21fe21fe2lusyjtki.R.globalSliceStart(getClass().getName(),66825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b68w9w1fk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fe21fe2lusyjtki.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fe21fe2lusyjtki.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_not_match_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66825,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b68w9w1fk9() throws Exception{try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66825);
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66826);Exception error = null;
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66827);try {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66828);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123, \"kxxx\":33}]";
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66829);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66830);parser.config(Feature.IgnoreNotMatch, false);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66831);Assert.assertEquals(true, (parser.parseArray(User.class).get(0) instanceof User));
        } catch (Exception ex) {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66832);error = ex;
        }
        __CLR4_5_21fe21fe2lusyjtki.R.inc(66833);Assert.assertNotNull(error);
    }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21fe21fe2lusyjtki.R.globalSliceStart(getClass().getName(),66834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1fki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fe21fe2lusyjtki.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fe21fe2lusyjtki.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66834,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1fki() throws Exception{try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66834);
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66835);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66836);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66837);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123]";
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66838);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66839);parser.parseArray(User.class);
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66840);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66841);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66842);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66843);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66844);String text = "{\"reader\":3}";
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66845);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66846);parser.parseObject(ErrorObject.class);
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66847);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66848);Assert.assertNotNull(error);
        }
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66849);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66850);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66851);String text = "{\"name\":3}";
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66852);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66853);parser.parseObject(ErrorObject2.class);
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66854);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66855);Assert.assertNotNull(error);
        }
    }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

    public static class ErrorObject {

        private Reader reader;

        public Reader getReader() {try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66856);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66857);return reader;
        }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

        public void setReader(Reader reader) {try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66858);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66859);this.reader = reader;
        }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}
    }

    public static class ErrorObject2 {

        private String name;

        public String getName() {try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66860);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66861);return name;
        }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66862);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66863);throw new UnsupportedOperationException();
        }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

    }

    public void test_error2() throws Exception {__CLR4_5_21fe21fe2lusyjtki.R.globalSliceStart(getClass().getName(),66864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24vg1sy1flc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fe21fe2lusyjtki.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fe21fe2lusyjtki.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_error2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66864,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24vg1sy1flc() throws Exception{try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66864);
        {
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66865);Exception error = null;
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66866);try {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66867);String text = "{}";
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66868);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66869);parser.parseArray(User.class);
            } catch (Exception ex) {
                __CLR4_5_21fe21fe2lusyjtki.R.inc(66870);error = ex;
            }
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66871);Assert.assertNotNull(error);
        }
    }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

    public static class User {

        private String     name;
        private int        age;
        private BigDecimal salary;
        private Date       birthdate;
        private boolean    old;

        public boolean isOld() {try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66872);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66873);return old;
        }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

        public void setOld(boolean old) {try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66874);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66875);this.old = old;
        }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

        public Date getBirthdate() {try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66876);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66877);return birthdate;
        }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

        public void setBirthdate(Date birthdate) {try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66878);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66879);this.birthdate = birthdate;
        }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66880);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66881);return name;
        }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66882);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66883);this.name = name;
        }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

        public int getAge() {try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66884);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66885);return age;
        }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

        public void setAge(int age) {try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66886);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66887);this.age = age;
        }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

        public void setage(int age) {try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66888);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66889);throw new UnsupportedOperationException();
        }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

        public void set(int age) {try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66890);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66891);throw new UnsupportedOperationException();
        }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

        public void get(int age) {try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66892);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66893);throw new UnsupportedOperationException();
        }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

        public void is(int age) {try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66894);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66895);throw new UnsupportedOperationException();
        }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

        public BigDecimal getSalary() {try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66896);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66897);return salary;
        }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

        public void setSalary(BigDecimal salary) {try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66898);
            __CLR4_5_21fe21fe2lusyjtki.R.inc(66899);this.salary = salary;
        }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

        public static void setFF() {try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66900);

        }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}

        void setXX() {try{__CLR4_5_21fe21fe2lusyjtki.R.inc(66901);

        }finally{__CLR4_5_21fe21fe2lusyjtki.R.flushNeeded();}}
    }
}
