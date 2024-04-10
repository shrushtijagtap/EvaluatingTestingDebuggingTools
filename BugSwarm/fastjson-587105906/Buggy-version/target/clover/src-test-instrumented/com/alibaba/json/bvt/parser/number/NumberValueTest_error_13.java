/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.number;

import com.alibaba.fastjson.*;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;
import org.junit.Assert;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class NumberValueTest_error_13 extends TestCase {static class __CLR4_1_101onl1onlluszwe0y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,78831,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21onl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78609,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21onl() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78609);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78610);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78611);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78612);JSON.parseObject("{\"v0\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78613);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78614);assertNotNull(error);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78615);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1ons();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78616,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1ons() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78616);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78617);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78618);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78619);JSON.parseObject("{\"v1\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78620);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78621);assertNotNull(error);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78622);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441onz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78623,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441onz() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78623);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78624);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78625);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78626);JSON.parseObject("{\"v2\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78627);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78628);assertNotNull(error);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78629);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1oo6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78630,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1oo6() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78630);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78631);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78632);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78633);JSON.parseObject("{\"v3\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78634);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78635);assertNotNull(error);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78636);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61ood();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78637,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61ood() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78637);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78638);BigDecimal b = new BigDecimal("49e999999999");

        __CLR4_1_101onl1onlluszwe0y.R.inc(78639);assertEquals("4.9E+1000000000", JSON.toJSONString(b, SerializerFeature.WriteBigDecimalAsPlain));
        __CLR4_1_101onl1onlluszwe0y.R.inc(78640);assertEquals("{\"val\":4.9E+1000000000}", JSON.toJSONString(new M1(b), SerializerFeature.WriteBigDecimalAsPlain));
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1ooh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78641,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1ooh() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78641);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78642);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78643);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78644);JSON.parseObject("{\"v5\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78645);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78646);assertNotNull(error);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78647);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81ooo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78648,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81ooo() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78648);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78649);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78650);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78651);JSON.parseObject("{\"v6\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78652);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78653);assertNotNull(error);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78654);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1oov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78655,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1oov() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78655);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78656);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78657);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78658);JSON.parseObject("{\"v7\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78659);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78660);assertNotNull(error);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78661);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102uw8mq1op2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78662,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102uw8mq1op2() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78662);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78663);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78664);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78665);JSON.parseObject("{\"v8\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78666);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78667);assertNotNull(error);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78668);assertEquals(NumberFormatException.class, error.getCause().getClass());
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1063w7f71op9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78669,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1063w7f71op9() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78669);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78670);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78671);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78672);JSON.parseObject("{\"v9\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78673);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78674);assertNotNull(error);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78675);assertEquals(ArithmeticException.class, error.getCause().getClass());
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c3oj7x1opg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78676,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c3oj7x1opg() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78676);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78677);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78678);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78679);JSON.parseObject("{\"v10\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78680);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78681);assertNotNull(error);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78682);assertEquals(ArithmeticException.class, error.getCause().getClass());
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108uokfg1opn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78683,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108uokfg1opn() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78683);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78684);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78685);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78686);JSON.parseObject("{\"v11\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78687);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78688);assertNotNull(error);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78689);assertEquals(ArithmeticException.class, error.getCause().getClass());
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_11_new() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1018ehwr1opu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_11_new",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78690,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1018ehwr1opu() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78690);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78691);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78692);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78693);JSON.parseObject("{\"v11\":new Date(49e99999999)}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78694);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78695);assertNotNull(error);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105lolmz1oq0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78696,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105lolmz1oq0() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78696);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78697);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78698);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78699);JSON.parseObject("{\"v12\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78700);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78701);assertNotNull(error);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78702);assertEquals(ArithmeticException.class, error.getCause().getClass());
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_13() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102comui1oq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78703,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102comui1oq7() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78703);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78704);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78705);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78706);JSON.parseObject("{\"v13\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78707);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78708);assertNotNull(error);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78709);assertEquals(ArithmeticException.class, error.getCause().getClass());
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}


    public void test_14() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wbbxz1oqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_14",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78710,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wbbxz1oqe() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78710);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78711);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78712);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78713);JSON.parseObject("{\"v14\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78714);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78715);assertNotNull(error);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78716);assertEquals(UnsupportedOperationException.class, error.getCause().getClass());
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_15() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1045baqg1oql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_15",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78717,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1045baqg1oql() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78717);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78718);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78719);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78720);JSON.parseObject("{\"v15\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78721);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78722);assertNotNull(error);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}


    public void test_16() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107eb9ix1oqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_16",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78723,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107eb9ix1oqr() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78723);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78724);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78725);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78726);JSON.parseObject("{\"v16\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78727);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78728);assertNotNull(error);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_17() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10anb8be1oqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_17",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78729,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10anb8be1oqx() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78729);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78730);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78731);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78732);JSON.parseObject("{\"v17\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78733);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78734);assertNotNull(error);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_17_1() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1081ddvw1or3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_17_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78735,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1081ddvw1or3() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78735);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78736);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78737);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78738);JSONObject jsonObject = JSON.parseObject("{\"v17\":49e99999999}");
            __CLR4_1_101onl1onlluszwe0y.R.inc(78739);jsonObject.getObject("v17", TimeUnit.class);
        } catch (JSONException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78740);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78741);assertNotNull(error);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}


    public void test_18() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dwb73v1ora();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_18",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78742,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dwb73v1ora() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78742);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78743);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78744);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78745);JSON.parseObject("{\"v18\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78746);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78747);assertNotNull(error);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}


    public void test_20() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hm6dbm1org();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_20",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78748,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hm6dbm1org() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78748);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78749);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_1_101onl1onlluszwe0y.R.inc(78750);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78751);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78752);jsonObject.getIntValue("v");
        } catch (ArithmeticException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78753);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78754);assertNotNull(error);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_21() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kv6c431orn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_21",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78755,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kv6c431orn() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78755);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78756);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_1_101onl1onlluszwe0y.R.inc(78757);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78758);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78759);jsonObject.getDate("v");
        } catch (ArithmeticException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78760);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78761);assertNotNull(error);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_22() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10o46awk1oru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_22",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78762,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10o46awk1oru() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78762);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78763);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_1_101onl1onlluszwe0y.R.inc(78764);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78765);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78766);jsonObject.getObject("v", java.sql.Date.class);
        } catch (ArithmeticException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78767);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78768);assertNotNull(error);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_23() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rd69p11os1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_23",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78769,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rd69p11os1() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78769);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78770);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_1_101onl1onlluszwe0y.R.inc(78771);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78772);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78773);jsonObject.getObject("v", java.sql.Timestamp.class);
        } catch (ArithmeticException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78774);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78775);assertNotNull(error);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_24() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10um68hi1os8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_24",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78776,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10um68hi1os8() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78776);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78777);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_1_101onl1onlluszwe0y.R.inc(78778);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78779);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78780);jsonObject.getObject("v", java.time.LocalDateTime.class);
        } catch (JSONException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78781);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78782);assertNotNull(error);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_25() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xv679z1osf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_25",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78783,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xv679z1osf() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78783);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78784);JSONObject jsonObject = JSON.parseObject("{\"lineNumber\":49e99999999}");
        __CLR4_1_101onl1onlluszwe0y.R.inc(78785);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78786);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78787);jsonObject.toJavaObject(StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78788);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78789);assertNotNull(error);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_26() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xwxvwo1osm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_26",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78790,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xwxvwo1osm() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78790);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78791);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_1_101onl1onlluszwe0y.R.inc(78792);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78793);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78794);jsonObject.getObject("v", java.sql.Time.class);
        } catch (ArithmeticException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78795);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78796);assertNotNull(error);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_jsonpath() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10paavc11ost();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_jsonpath",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78797,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10paavc11ost() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78797);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78798);JSONObject jsonObject = JSON.parseObject("{\"v\":0}");
        __CLR4_1_101onl1onlluszwe0y.R.inc(78799);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78800);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78801);JSONPath.eval(jsonObject, "$.v in (49e99999999)");
        } catch (JSONPathException ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78802);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78803);assertNotNull(error);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_jsonpath_1() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bmfytv1ot0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_jsonpath_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78804,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bmfytv1ot0() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78804);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78805);JSONArray jsonObject = JSON.parseArray("[{\"v\":49e99999999}]");
        __CLR4_1_101onl1onlluszwe0y.R.inc(78806);JSONPath.eval(jsonObject, "[v=0]");
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_jsonpath_2() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10evfxmc1ot3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_jsonpath_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78807,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10evfxmc1ot3() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78807);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78808);Model[] array = JSON.parseObject("[{\"v2\":0}]", Model[].class);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78809);JSONPath.eval(array, "[v='49e99999999']");
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_jsonpath_3() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i4fwet1ot6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_jsonpath_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78810,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i4fwet1ot6() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78810);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78811);Model[] array = JSON.parseObject("[{\"v2\":0}]", Model[].class);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78812);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78813);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78814);JSONPath.read("{\"a\":49e9999999}","[a in (123,2,3)]");
        } catch (Exception ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78815);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78816);assertNotNull(error);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_jsonpath_4() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ldfv7a1otd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_jsonpath_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78817,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ldfv7a1otd() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78817);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78818);Model[] array = JSON.parseObject("[{\"v2\":0}]", Model[].class);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78819);Exception error = null;
        __CLR4_1_101onl1onlluszwe0y.R.inc(78820);try {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78821);JSONPath.read("{\"a\":49e9999999}","[a between 1 and 3]");
        } catch (Exception ex) {
            __CLR4_1_101onl1onlluszwe0y.R.inc(78822);error = ex;
        }
        __CLR4_1_101onl1onlluszwe0y.R.inc(78823);assertNotNull(error);
    }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public void test_27() throws Exception {__CLR4_1_101onl1onlluszwe0y.R.globalSliceStart(getClass().getName(),78824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10unxx471otk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101onl1onlluszwe0y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101onl1onlluszwe0y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_27",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78824,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10unxx471otk() throws Exception{try{__CLR4_1_101onl1onlluszwe0y.R.inc(78824);
        __CLR4_1_101onl1onlluszwe0y.R.inc(78825);JSONObject object = JSON.parseObject("{\n" +
                "    \"connection_health\": {\"status\": \"good\", \"max_value\": 2.0, \"min_value\": 2.0, \"average_value\": 2.0}, \n" +
                "    \"qps_health\": {\"status\": \"good\", \"max_value\": 5.3, \"min_value\": 4.29, \"average_value\": 4.6},\n" +
                "    \"disksize_health\": {\"status\": \"good\", \"max_value\": 3089.0, \"min_value\": 3089.0, \"average_value\": 3089.0},\n" +
                "     \"cpu_health\": {\"status\": \"good\", \"max_value\": 0.0, \"min_value\": 0.0, \"average_value\": 0.0}, \n" +
                "     \"memory_health\": {\"status\": \"good\", \"max_value\": 17.1, \"min_value\": 17.1, \"average_value\": 17.1}, \n" +
                "    \"iops_health\": {\"status\": \"good\", \"max_value\": 0.09, \"min_value\": 0.07, \"average_value\": 0.08}\n" +
                "}");

        __CLR4_1_101onl1onlluszwe0y.R.inc(78826);for(String key : object.keySet()) {{
            __CLR4_1_101onl1onlluszwe0y.R.inc(78827);System.out.println("key = " + key);
            __CLR4_1_101onl1onlluszwe0y.R.inc(78828);System.out.println("vaue = " + object.getJSONObject(key).getIntValue("max_value"));
        }
    }}finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}

    public static class Model {
        public byte v0;
        public short v1;
        public int v2;
        public long v3;
        public Byte v4;

        public Short v5;
        public Integer v6;
        public Long v7;
        public BigInteger v8;

        public Timestamp v9;
        public java.sql.Date v10;
        public java.util.Date v11;
        public java.util.Calendar v12;
        public java.sql.Timestamp v13;
        public java.time.LocalDateTime v14;

        public boolean v15;
        public Boolean v16;
        public TimeUnit v17;
        public java.sql.Time v18;
    }

    public static class M1 {
        public BigDecimal val;

        public M1(BigDecimal val) {try{__CLR4_1_101onl1onlluszwe0y.R.inc(78829);
            __CLR4_1_101onl1onlluszwe0y.R.inc(78830);this.val = val;
        }finally{__CLR4_1_101onl1onlluszwe0y.R.flushNeeded();}}
    }
}
