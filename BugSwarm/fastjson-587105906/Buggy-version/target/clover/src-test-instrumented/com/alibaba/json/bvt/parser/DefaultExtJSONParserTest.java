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

public class DefaultExtJSONParserTest extends TestCase {static class __CLR4_1_101fed1fedlusqkczv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,66913,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_parseObject() {__CLR4_1_101fed1fedlusqkczv.R.globalSliceStart(getClass().getName(),66613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rbp5mc1fed();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fed1fedlusqkczv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fed1fedlusqkczv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_parseObject",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66613,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rbp5mc1fed(){try{__CLR4_1_101fed1fedlusqkczv.R.inc(66613);
        __CLR4_1_101fed1fedlusqkczv.R.inc(66614);new DefaultJSONParser("".toCharArray(), 0, ParserConfig.getGlobalInstance(), 0).close();
        __CLR4_1_101fed1fedlusqkczv.R.inc(66615);User user = new User();
        __CLR4_1_101fed1fedlusqkczv.R.inc(66616);user.setName("\u6821\u957f");
        __CLR4_1_101fed1fedlusqkczv.R.inc(66617);user.setAge(3);
        __CLR4_1_101fed1fedlusqkczv.R.inc(66618);user.setSalary(new BigDecimal("123456789.0123"));

        __CLR4_1_101fed1fedlusqkczv.R.inc(66619);String jsonString = JSON.toJSONString(user);

        __CLR4_1_101fed1fedlusqkczv.R.inc(66620);System.out.println(jsonString);

        __CLR4_1_101fed1fedlusqkczv.R.inc(66621);JSON.parseObject(jsonString);

        __CLR4_1_101fed1fedlusqkczv.R.inc(66622);DefaultJSONParser parser = new DefaultJSONParser(jsonString);
        __CLR4_1_101fed1fedlusqkczv.R.inc(66623);User user1 = new User();
        __CLR4_1_101fed1fedlusqkczv.R.inc(66624);parser.parseObject(user1);

        __CLR4_1_101fed1fedlusqkczv.R.inc(66625);Assert.assertEquals(user.getAge(), user1.getAge());
        __CLR4_1_101fed1fedlusqkczv.R.inc(66626);Assert.assertEquals(user.getName(), user1.getName());
        __CLR4_1_101fed1fedlusqkczv.R.inc(66627);Assert.assertEquals(user.getSalary(), user1.getSalary());
    }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

    public void testCastCalendar() throws Exception {__CLR4_1_101fed1fedlusqkczv.R.globalSliceStart(getClass().getName(),66628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gke1xm1fes();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fed1fedlusqkczv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fed1fedlusqkczv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.testCastCalendar",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66628,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gke1xm1fes() throws Exception{try{__CLR4_1_101fed1fedlusqkczv.R.inc(66628);
        __CLR4_1_101fed1fedlusqkczv.R.inc(66629);Calendar c = Calendar.getInstance();
        __CLR4_1_101fed1fedlusqkczv.R.inc(66630);Date d = TypeUtils.castToDate(c);
        __CLR4_1_101fed1fedlusqkczv.R.inc(66631);Assert.assertEquals(c.getTime(), d);
    }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

    public void testCast() throws Exception {__CLR4_1_101fed1fedlusqkczv.R.globalSliceStart(getClass().getName(),66632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10173km01few();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fed1fedlusqkczv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fed1fedlusqkczv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.testCast",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66632,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10173km01few() throws Exception{try{__CLR4_1_101fed1fedlusqkczv.R.inc(66632);
        __CLR4_1_101fed1fedlusqkczv.R.inc(66633);new TypeUtils();
        __CLR4_1_101fed1fedlusqkczv.R.inc(66634);DefaultJSONParser parser = new DefaultJSONParser("");

        __CLR4_1_101fed1fedlusqkczv.R.inc(66635);Assert.assertNull(castToByte(null));
        __CLR4_1_101fed1fedlusqkczv.R.inc(66636);Assert.assertNull(castToShort(null));
        __CLR4_1_101fed1fedlusqkczv.R.inc(66637);Assert.assertNull(castToInt(null));
        __CLR4_1_101fed1fedlusqkczv.R.inc(66638);Assert.assertNull(castToLong(null));
        __CLR4_1_101fed1fedlusqkczv.R.inc(66639);Assert.assertNull(castToBigInteger(null));
        __CLR4_1_101fed1fedlusqkczv.R.inc(66640);Assert.assertNull(castToBigDecimal(null));
        __CLR4_1_101fed1fedlusqkczv.R.inc(66641);Assert.assertNull(castToFloat(null));
        __CLR4_1_101fed1fedlusqkczv.R.inc(66642);Assert.assertNull(castToDouble(null));
        __CLR4_1_101fed1fedlusqkczv.R.inc(66643);Assert.assertNull(castToBoolean(null));
        __CLR4_1_101fed1fedlusqkczv.R.inc(66644);Assert.assertNull(castToDate(null));
        __CLR4_1_101fed1fedlusqkczv.R.inc(66645);Assert.assertNull(castToString(null));

        __CLR4_1_101fed1fedlusqkczv.R.inc(66646);Assert.assertEquals(12, castToByte("12").intValue());
        __CLR4_1_101fed1fedlusqkczv.R.inc(66647);Assert.assertEquals(1234, castToShort("1234").intValue());
        __CLR4_1_101fed1fedlusqkczv.R.inc(66648);Assert.assertEquals(1234, castToInt("1234").intValue());
        __CLR4_1_101fed1fedlusqkczv.R.inc(66649);Assert.assertEquals(1234, castToLong("1234").intValue());
        __CLR4_1_101fed1fedlusqkczv.R.inc(66650);Assert.assertEquals(1234, castToBigInteger("1234").intValue());
        __CLR4_1_101fed1fedlusqkczv.R.inc(66651);Assert.assertEquals(1234, castToBigDecimal("1234").intValue());
        __CLR4_1_101fed1fedlusqkczv.R.inc(66652);Assert.assertEquals(1234, castToFloat("1234").intValue());
        __CLR4_1_101fed1fedlusqkczv.R.inc(66653);Assert.assertEquals(1234, castToDouble("1234").intValue());

        __CLR4_1_101fed1fedlusqkczv.R.inc(66654);Assert.assertEquals(12, castToByte(12).intValue());
        __CLR4_1_101fed1fedlusqkczv.R.inc(66655);Assert.assertEquals(1234, castToShort(1234).intValue());
        __CLR4_1_101fed1fedlusqkczv.R.inc(66656);Assert.assertEquals(1234, castToInt(1234).intValue());
        __CLR4_1_101fed1fedlusqkczv.R.inc(66657);Assert.assertEquals(1234, castToLong(1234).intValue());
        __CLR4_1_101fed1fedlusqkczv.R.inc(66658);Assert.assertEquals(1234, castToBigInteger(1234).intValue());
        __CLR4_1_101fed1fedlusqkczv.R.inc(66659);Assert.assertEquals(1234, castToBigDecimal(1234).intValue());
        __CLR4_1_101fed1fedlusqkczv.R.inc(66660);Assert.assertEquals(1234, castToFloat(1234).intValue());
        __CLR4_1_101fed1fedlusqkczv.R.inc(66661);Assert.assertEquals(1234, castToDouble(1234).intValue());

        __CLR4_1_101fed1fedlusqkczv.R.inc(66662);Assert.assertEquals(Boolean.TRUE, castToBoolean(true));
        __CLR4_1_101fed1fedlusqkczv.R.inc(66663);Assert.assertEquals(Boolean.FALSE, castToBoolean(false));
        __CLR4_1_101fed1fedlusqkczv.R.inc(66664);Assert.assertEquals(Boolean.TRUE, castToBoolean(1));
        __CLR4_1_101fed1fedlusqkczv.R.inc(66665);Assert.assertEquals(Boolean.FALSE, castToBoolean(0));
        __CLR4_1_101fed1fedlusqkczv.R.inc(66666);Assert.assertEquals(Boolean.TRUE, castToBoolean("true"));
        __CLR4_1_101fed1fedlusqkczv.R.inc(66667);Assert.assertEquals(Boolean.FALSE, castToBoolean("false"));

        __CLR4_1_101fed1fedlusqkczv.R.inc(66668);long time = System.currentTimeMillis();
        __CLR4_1_101fed1fedlusqkczv.R.inc(66669);Assert.assertEquals(time, castToDate(new Date(time)).getTime());
        __CLR4_1_101fed1fedlusqkczv.R.inc(66670);Assert.assertEquals(time, castToDate(time).getTime());
        __CLR4_1_101fed1fedlusqkczv.R.inc(66671);Assert.assertEquals(time, castToDate(Long.toString(time)).getTime());

        __CLR4_1_101fed1fedlusqkczv.R.inc(66672);Assert.assertEquals("true", castToString("true"));
        __CLR4_1_101fed1fedlusqkczv.R.inc(66673);Assert.assertEquals("true", castToString(true));
        __CLR4_1_101fed1fedlusqkczv.R.inc(66674);Assert.assertEquals("123", castToString(123));

        __CLR4_1_101fed1fedlusqkczv.R.inc(66675);Assert.assertEquals(new BigDecimal("2"), castToBigDecimal("2"));
        __CLR4_1_101fed1fedlusqkczv.R.inc(66676);Assert.assertEquals(new BigDecimal("2"), castToBigDecimal(new BigInteger("2")));

    }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

    public void test_casterror2() {__CLR4_1_101fed1fedlusqkczv.R.globalSliceStart(getClass().getName(),66677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ufcx371fg5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fed1fedlusqkczv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fed1fedlusqkczv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_casterror2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66677,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ufcx371fg5(){try{__CLR4_1_101fed1fedlusqkczv.R.inc(66677);
        __CLR4_1_101fed1fedlusqkczv.R.inc(66678);DefaultJSONParser parser = new DefaultJSONParser("");
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66679);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66680);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66681);castToByte(new Object());
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66682);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66683);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66684);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66685);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66686);castToShort(new Object());
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66687);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66688);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66689);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66690);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66691);castToInt(new Object());
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66692);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66693);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66694);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66695);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66696);castToLong(new Object());
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66697);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66698);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66699);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66700);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66701);castToFloat(new Object());
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66702);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66703);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66704);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66705);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66706);castToDouble(new Object());
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66707);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66708);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66709);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66710);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66711);castToBigInteger(new Object());
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66712);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66713);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66714);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66715);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66716);castToBigDecimal(new Object());
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66717);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66718);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66719);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66720);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66721);castToDate(new Object());
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66722);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66723);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66724);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66725);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66726);castToBoolean(new Object());
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66727);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66728);Assert.assertNotNull(error);
        }
    }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

    public void test_casterror() {__CLR4_1_101fed1fedlusqkczv.R.globalSliceStart(getClass().getName(),66729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10biz5311fhl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fed1fedlusqkczv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fed1fedlusqkczv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_casterror",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66729,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10biz5311fhl(){try{__CLR4_1_101fed1fedlusqkczv.R.inc(66729);
        __CLR4_1_101fed1fedlusqkczv.R.inc(66730);DefaultJSONParser parser = new DefaultJSONParser("");

        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66731);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66732);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66733);castToByte("xx");
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66734);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66735);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66736);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66737);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66738);castToShort("xx");
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66739);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66740);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66741);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66742);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66743);castToInt("xx");
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66744);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66745);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66746);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66747);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66748);castToLong("xx");
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66749);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66750);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66751);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66752);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66753);castToFloat("xx");
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66754);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66755);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66756);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66757);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66758);castToDouble("xx");
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66759);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66760);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66761);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66762);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66763);castToBigInteger("xx");
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66764);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66765);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66766);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66767);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66768);castToBigDecimal("xx");
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66769);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66770);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66771);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66772);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66773);castToDate("xx");
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66774);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66775);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66776);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66777);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66778);castToBoolean("xx");
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66779);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66780);Assert.assertNotNull(error);
        }
    }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

    @SuppressWarnings("rawtypes")
    public void test_parseArrayWithType() throws Exception {__CLR4_1_101fed1fedlusqkczv.R.globalSliceStart(getClass().getName(),66781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ab99p61fj1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fed1fedlusqkczv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fed1fedlusqkczv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_parseArrayWithType",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66781,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ab99p61fj1() throws Exception{try{__CLR4_1_101fed1fedlusqkczv.R.inc(66781);

        __CLR4_1_101fed1fedlusqkczv.R.inc(66782);Method method = DefaultExtJSONParserTest.class.getMethod("f", Collection.class, Collection.class, Collection.class, Collection.class, Collection.class,
                                                                 Collection.class, Collection.class);
        __CLR4_1_101fed1fedlusqkczv.R.inc(66783);Type[] types = method.getGenericParameterTypes();
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66784);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
            __CLR4_1_101fed1fedlusqkczv.R.inc(66785);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66786);Assert.assertEquals(true, ((List) parser.parseArrayWithType(types[0])).get(0) instanceof Map);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66787);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
            __CLR4_1_101fed1fedlusqkczv.R.inc(66788);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66789);Assert.assertEquals(true, ((List) parser.parseArrayWithType(types[1])).get(0) instanceof User);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66790);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66791);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66792);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
                __CLR4_1_101fed1fedlusqkczv.R.inc(66793);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_1_101fed1fedlusqkczv.R.inc(66794);parser.parseArrayWithType(types[2]);
                __CLR4_1_101fed1fedlusqkczv.R.inc(66795);;
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66796);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66797);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66798);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
            __CLR4_1_101fed1fedlusqkczv.R.inc(66799);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66800);Assert.assertEquals(true, ((List) parser.parseArrayWithType(types[3])).get(0) instanceof User);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66801);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66802);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66803);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
                __CLR4_1_101fed1fedlusqkczv.R.inc(66804);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_1_101fed1fedlusqkczv.R.inc(66805);parser.parseArrayWithType(types[4]);
                __CLR4_1_101fed1fedlusqkczv.R.inc(66806);;
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66807);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66808);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66809);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
            __CLR4_1_101fed1fedlusqkczv.R.inc(66810);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66811);Assert.assertEquals(true, ((List) parser.parseArrayWithType(types[5])).get(0) instanceof User);
        }

        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66812);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66813);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66814);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
                __CLR4_1_101fed1fedlusqkczv.R.inc(66815);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_1_101fed1fedlusqkczv.R.inc(66816);parser.parseArrayWithType(types[6]);
                __CLR4_1_101fed1fedlusqkczv.R.inc(66817);;
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66818);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66819);Assert.assertNotNull(error);
        }
    }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

    public void test_parseArrayWithType_error_1() throws Exception {__CLR4_1_101fed1fedlusqkczv.R.globalSliceStart(getClass().getName(),66820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10w6gwi31fk4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fed1fedlusqkczv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fed1fedlusqkczv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_parseArrayWithType_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66820,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10w6gwi31fk4() throws Exception{try{__CLR4_1_101fed1fedlusqkczv.R.inc(66820);
        __CLR4_1_101fed1fedlusqkczv.R.inc(66821);Method method = DefaultExtJSONParserTest.class.getMethod("f", Collection.class, Collection.class, Collection.class, Collection.class, Collection.class,
                                                                 Collection.class, Collection.class);
        __CLR4_1_101fed1fedlusqkczv.R.inc(66822);Type[] types = method.getGenericParameterTypes();

        __CLR4_1_101fed1fedlusqkczv.R.inc(66823);Exception error = null;
        __CLR4_1_101fed1fedlusqkczv.R.inc(66824);try {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66825);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123}]";
            __CLR4_1_101fed1fedlusqkczv.R.inc(66826);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66827);parser.parseArrayWithType(types[6]);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66828);;
        } catch (Exception ex) {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66829);error = ex;
        }
        __CLR4_1_101fed1fedlusqkczv.R.inc(66830);Assert.assertNotNull(error);
    }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

    public static <T extends Object & Comparable<? super T>, T1 extends User> void f(Collection<?> p0, Collection<? extends User> p1,
                                                                                     Collection<? super User> p2, Collection<User> p3, Collection<T> p4,
                                                                                     Collection<T1> p5, Collection<T[]> p6) {try{__CLR4_1_101fed1fedlusqkczv.R.inc(66831);

    }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

    public void test_not_match() throws Exception {__CLR4_1_101fed1fedlusqkczv.R.globalSliceStart(getClass().getName(),66832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kg6urx1fkg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fed1fedlusqkczv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fed1fedlusqkczv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_not_match",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66832,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kg6urx1fkg() throws Exception{try{__CLR4_1_101fed1fedlusqkczv.R.inc(66832);
        __CLR4_1_101fed1fedlusqkczv.R.inc(66833);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123, \"kxxx\":33}]";
        __CLR4_1_101fed1fedlusqkczv.R.inc(66834);DefaultJSONParser parser = new DefaultJSONParser(text);
        __CLR4_1_101fed1fedlusqkczv.R.inc(66835);Assert.assertEquals(true, (parser.parseArray(User.class).get(0) instanceof User));
    }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

    public void test_not_match_error() throws Exception {__CLR4_1_101fed1fedlusqkczv.R.globalSliceStart(getClass().getName(),66836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10b68w9w1fkk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fed1fedlusqkczv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fed1fedlusqkczv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_not_match_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66836,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10b68w9w1fkk() throws Exception{try{__CLR4_1_101fed1fedlusqkczv.R.inc(66836);
        __CLR4_1_101fed1fedlusqkczv.R.inc(66837);Exception error = null;
        __CLR4_1_101fed1fedlusqkczv.R.inc(66838);try {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66839);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123, \"kxxx\":33}]";
            __CLR4_1_101fed1fedlusqkczv.R.inc(66840);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66841);parser.config(Feature.IgnoreNotMatch, false);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66842);Assert.assertEquals(true, (parser.parseArray(User.class).get(0) instanceof User));
        } catch (Exception ex) {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66843);error = ex;
        }
        __CLR4_1_101fed1fedlusqkczv.R.inc(66844);Assert.assertNotNull(error);
    }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101fed1fedlusqkczv.R.globalSliceStart(getClass().getName(),66845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1fkt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fed1fedlusqkczv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fed1fedlusqkczv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66845,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1fkt() throws Exception{try{__CLR4_1_101fed1fedlusqkczv.R.inc(66845);
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66846);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66847);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66848);String text = "[{\"old\":false,\"name\":\"\u6821\u957f\",\"age\":3,\"salary\":123456789.0123]";
                __CLR4_1_101fed1fedlusqkczv.R.inc(66849);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_1_101fed1fedlusqkczv.R.inc(66850);parser.parseArray(User.class);
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66851);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66852);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66853);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66854);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66855);String text = "{\"reader\":3}";
                __CLR4_1_101fed1fedlusqkczv.R.inc(66856);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_1_101fed1fedlusqkczv.R.inc(66857);parser.parseObject(ErrorObject.class);
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66858);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66859);Assert.assertNotNull(error);
        }
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66860);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66861);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66862);String text = "{\"name\":3}";
                __CLR4_1_101fed1fedlusqkczv.R.inc(66863);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_1_101fed1fedlusqkczv.R.inc(66864);parser.parseObject(ErrorObject2.class);
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66865);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66866);Assert.assertNotNull(error);
        }
    }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

    public static class ErrorObject {

        private Reader reader;

        public Reader getReader() {try{__CLR4_1_101fed1fedlusqkczv.R.inc(66867);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66868);return reader;
        }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

        public void setReader(Reader reader) {try{__CLR4_1_101fed1fedlusqkczv.R.inc(66869);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66870);this.reader = reader;
        }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}
    }

    public static class ErrorObject2 {

        private String name;

        public String getName() {try{__CLR4_1_101fed1fedlusqkczv.R.inc(66871);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66872);return name;
        }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101fed1fedlusqkczv.R.inc(66873);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66874);throw new UnsupportedOperationException();
        }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

    }

    public void test_error2() throws Exception {__CLR4_1_101fed1fedlusqkczv.R.globalSliceStart(getClass().getName(),66875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104vg1sy1fln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fed1fedlusqkczv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fed1fedlusqkczv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest.test_error2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66875,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104vg1sy1fln() throws Exception{try{__CLR4_1_101fed1fedlusqkczv.R.inc(66875);
        {
            __CLR4_1_101fed1fedlusqkczv.R.inc(66876);Exception error = null;
            __CLR4_1_101fed1fedlusqkczv.R.inc(66877);try {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66878);String text = "{}";
                __CLR4_1_101fed1fedlusqkczv.R.inc(66879);DefaultJSONParser parser = new DefaultJSONParser(text);
                __CLR4_1_101fed1fedlusqkczv.R.inc(66880);parser.parseArray(User.class);
            } catch (Exception ex) {
                __CLR4_1_101fed1fedlusqkczv.R.inc(66881);error = ex;
            }
            __CLR4_1_101fed1fedlusqkczv.R.inc(66882);Assert.assertNotNull(error);
        }
    }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

    public static class User {

        private String     name;
        private int        age;
        private BigDecimal salary;
        private Date       birthdate;
        private boolean    old;

        public boolean isOld() {try{__CLR4_1_101fed1fedlusqkczv.R.inc(66883);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66884);return old;
        }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

        public void setOld(boolean old) {try{__CLR4_1_101fed1fedlusqkczv.R.inc(66885);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66886);this.old = old;
        }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

        public Date getBirthdate() {try{__CLR4_1_101fed1fedlusqkczv.R.inc(66887);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66888);return birthdate;
        }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

        public void setBirthdate(Date birthdate) {try{__CLR4_1_101fed1fedlusqkczv.R.inc(66889);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66890);this.birthdate = birthdate;
        }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101fed1fedlusqkczv.R.inc(66891);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66892);return name;
        }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101fed1fedlusqkczv.R.inc(66893);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66894);this.name = name;
        }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

        public int getAge() {try{__CLR4_1_101fed1fedlusqkczv.R.inc(66895);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66896);return age;
        }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

        public void setAge(int age) {try{__CLR4_1_101fed1fedlusqkczv.R.inc(66897);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66898);this.age = age;
        }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

        public void setage(int age) {try{__CLR4_1_101fed1fedlusqkczv.R.inc(66899);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66900);throw new UnsupportedOperationException();
        }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

        public void set(int age) {try{__CLR4_1_101fed1fedlusqkczv.R.inc(66901);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66902);throw new UnsupportedOperationException();
        }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

        public void get(int age) {try{__CLR4_1_101fed1fedlusqkczv.R.inc(66903);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66904);throw new UnsupportedOperationException();
        }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

        public void is(int age) {try{__CLR4_1_101fed1fedlusqkczv.R.inc(66905);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66906);throw new UnsupportedOperationException();
        }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

        public BigDecimal getSalary() {try{__CLR4_1_101fed1fedlusqkczv.R.inc(66907);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66908);return salary;
        }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

        public void setSalary(BigDecimal salary) {try{__CLR4_1_101fed1fedlusqkczv.R.inc(66909);
            __CLR4_1_101fed1fedlusqkczv.R.inc(66910);this.salary = salary;
        }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

        public static void setFF() {try{__CLR4_1_101fed1fedlusqkczv.R.inc(66911);

        }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}

        void setXX() {try{__CLR4_1_101fed1fedlusqkczv.R.inc(66912);

        }finally{__CLR4_1_101fed1fedlusqkczv.R.flushNeeded();}}
    }
}
