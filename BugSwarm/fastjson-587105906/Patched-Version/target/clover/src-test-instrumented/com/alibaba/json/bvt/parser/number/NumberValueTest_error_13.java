/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.number;

import com.alibaba.fastjson.*;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;
import org.junit.Assert;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class NumberValueTest_error_13 extends TestCase {static class __CLR4_5_21ona1onalusvnf0t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,78820,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21ona();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78598,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21ona() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78598);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78599);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78600);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78601);JSON.parseObject("{\"v0\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78602);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78603);assertNotNull(error);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78604);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1onh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78605,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1onh() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78605);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78606);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78607);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78608);JSON.parseObject("{\"v1\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78609);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78610);assertNotNull(error);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78611);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441ono();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78612,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441ono() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78612);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78613);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78614);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78615);JSON.parseObject("{\"v2\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78616);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78617);assertNotNull(error);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78618);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1onv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78619,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1onv() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78619);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78620);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78621);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78622);JSON.parseObject("{\"v3\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78623);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78624);assertNotNull(error);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78625);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61oo2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78626,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61oo2() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78626);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78627);BigDecimal b = new BigDecimal("49e999999999");

        __CLR4_5_21ona1onalusvnf0t.R.inc(78628);assertEquals("4.9E+1000000000", JSON.toJSONString(b, SerializerFeature.WriteBigDecimalAsPlain));
        __CLR4_5_21ona1onalusvnf0t.R.inc(78629);assertEquals("{\"val\":4.9E+1000000000}", JSON.toJSONString(new M1(b), SerializerFeature.WriteBigDecimalAsPlain));
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1oo6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78630,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1oo6() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78630);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78631);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78632);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78633);JSON.parseObject("{\"v5\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78634);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78635);assertNotNull(error);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78636);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81ood();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78637,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81ood() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78637);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78638);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78639);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78640);JSON.parseObject("{\"v6\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78641);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78642);assertNotNull(error);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78643);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1ook();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78644,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1ook() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78644);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78645);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78646);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78647);JSON.parseObject("{\"v7\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78648);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78649);assertNotNull(error);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78650);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq1oor();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78651,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq1oor() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78651);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78652);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78653);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78654);JSON.parseObject("{\"v8\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78655);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78656);assertNotNull(error);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78657);assertEquals(NumberFormatException.class, error.getCause().getClass());
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f71ooy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78658,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f71ooy() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78658);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78659);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78660);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78661);JSON.parseObject("{\"v9\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78662);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78663);assertNotNull(error);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78664);assertEquals(ArithmeticException.class, error.getCause().getClass());
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3oj7x1op5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78665,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3oj7x1op5() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78665);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78666);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78667);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78668);JSON.parseObject("{\"v10\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78669);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78670);assertNotNull(error);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78671);assertEquals(ArithmeticException.class, error.getCause().getClass());
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uokfg1opc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78672,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uokfg1opc() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78672);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78673);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78674);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78675);JSON.parseObject("{\"v11\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78676);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78677);assertNotNull(error);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78678);assertEquals(ArithmeticException.class, error.getCause().getClass());
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_11_new() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_218ehwr1opj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_11_new",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78679,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_218ehwr1opj() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78679);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78680);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78681);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78682);JSON.parseObject("{\"v11\":new Date(49e99999999)}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78683);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78684);assertNotNull(error);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lolmz1opp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78685,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lolmz1opp() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78685);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78686);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78687);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78688);JSON.parseObject("{\"v12\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78689);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78690);assertNotNull(error);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78691);assertEquals(ArithmeticException.class, error.getCause().getClass());
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_13() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22comui1opw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78692,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22comui1opw() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78692);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78693);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78694);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78695);JSON.parseObject("{\"v13\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78696);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78697);assertNotNull(error);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78698);assertEquals(ArithmeticException.class, error.getCause().getClass());
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}


    public void test_14() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wbbxz1oq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78699,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wbbxz1oq3() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78699);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78700);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78701);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78702);JSON.parseObject("{\"v14\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78703);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78704);assertNotNull(error);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78705);assertEquals(UnsupportedOperationException.class, error.getCause().getClass());
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_15() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_245baqg1oqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78706,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_245baqg1oqa() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78706);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78707);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78708);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78709);JSON.parseObject("{\"v15\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78710);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78711);assertNotNull(error);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}


    public void test_16() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27eb9ix1oqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_16",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78712,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27eb9ix1oqg() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78712);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78713);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78714);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78715);JSON.parseObject("{\"v16\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78716);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78717);assertNotNull(error);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_17() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2anb8be1oqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_17",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78718,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2anb8be1oqm() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78718);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78719);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78720);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78721);JSON.parseObject("{\"v17\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78722);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78723);assertNotNull(error);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_17_1() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_281ddvw1oqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_17_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78724,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_281ddvw1oqs() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78724);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78725);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78726);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78727);JSONObject jsonObject = JSON.parseObject("{\"v17\":49e99999999}");
            __CLR4_5_21ona1onalusvnf0t.R.inc(78728);jsonObject.getObject("v17", TimeUnit.class);
        } catch (JSONException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78729);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78730);assertNotNull(error);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}


    public void test_18() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dwb73v1oqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_18",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78731,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dwb73v1oqz() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78731);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78732);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78733);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78734);JSON.parseObject("{\"v18\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78735);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78736);assertNotNull(error);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}


    public void test_20() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hm6dbm1or5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_20",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78737,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hm6dbm1or5() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78737);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78738);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_5_21ona1onalusvnf0t.R.inc(78739);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78740);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78741);jsonObject.getIntValue("v");
        } catch (ArithmeticException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78742);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78743);assertNotNull(error);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_21() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kv6c431orc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_21",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78744,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kv6c431orc() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78744);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78745);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_5_21ona1onalusvnf0t.R.inc(78746);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78747);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78748);jsonObject.getDate("v");
        } catch (ArithmeticException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78749);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78750);assertNotNull(error);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_22() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o46awk1orj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_22",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78751,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o46awk1orj() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78751);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78752);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_5_21ona1onalusvnf0t.R.inc(78753);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78754);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78755);jsonObject.getObject("v", java.sql.Date.class);
        } catch (ArithmeticException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78756);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78757);assertNotNull(error);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_23() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rd69p11orq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_23",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78758,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rd69p11orq() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78758);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78759);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_5_21ona1onalusvnf0t.R.inc(78760);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78761);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78762);jsonObject.getObject("v", java.sql.Timestamp.class);
        } catch (ArithmeticException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78763);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78764);assertNotNull(error);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_24() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2um68hi1orx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_24",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78765,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2um68hi1orx() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78765);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78766);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_5_21ona1onalusvnf0t.R.inc(78767);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78768);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78769);jsonObject.getObject("v", java.time.LocalDateTime.class);
        } catch (JSONException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78770);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78771);assertNotNull(error);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_25() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xv679z1os4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_25",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78772,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xv679z1os4() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78772);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78773);JSONObject jsonObject = JSON.parseObject("{\"lineNumber\":49e99999999}");
        __CLR4_5_21ona1onalusvnf0t.R.inc(78774);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78775);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78776);jsonObject.toJavaObject(StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78777);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78778);assertNotNull(error);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_26() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xwxvwo1osb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_26",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78779,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xwxvwo1osb() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78779);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78780);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_5_21ona1onalusvnf0t.R.inc(78781);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78782);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78783);jsonObject.getObject("v", java.sql.Time.class);
        } catch (ArithmeticException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78784);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78785);assertNotNull(error);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_jsonpath() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2paavc11osi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_jsonpath",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78786,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2paavc11osi() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78786);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78787);JSONObject jsonObject = JSON.parseObject("{\"v\":0}");
        __CLR4_5_21ona1onalusvnf0t.R.inc(78788);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78789);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78790);JSONPath.eval(jsonObject, "$.v in (49e99999999)");
        } catch (JSONPathException ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78791);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78792);assertNotNull(error);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_jsonpath_1() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bmfytv1osp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_jsonpath_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78793,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bmfytv1osp() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78793);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78794);JSONArray jsonObject = JSON.parseArray("[{\"v\":49e99999999}]");
        __CLR4_5_21ona1onalusvnf0t.R.inc(78795);JSONPath.eval(jsonObject, "[v=0]");
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_jsonpath_2() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2evfxmc1oss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_jsonpath_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78796,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2evfxmc1oss() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78796);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78797);Model[] array = JSON.parseObject("[{\"v2\":0}]", Model[].class);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78798);JSONPath.eval(array, "[v='49e99999999']");
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_jsonpath_3() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i4fwet1osv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_jsonpath_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78799,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i4fwet1osv() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78799);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78800);Model[] array = JSON.parseObject("[{\"v2\":0}]", Model[].class);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78801);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78802);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78803);JSONPath.read("{\"a\":49e9999999}","[a in (123,2,3)]");
        } catch (Exception ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78804);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78805);assertNotNull(error);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_jsonpath_4() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ldfv7a1ot2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_jsonpath_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78806,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ldfv7a1ot2() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78806);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78807);Model[] array = JSON.parseObject("[{\"v2\":0}]", Model[].class);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78808);Exception error = null;
        __CLR4_5_21ona1onalusvnf0t.R.inc(78809);try {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78810);JSONPath.read("{\"a\":49e9999999}","[a between 1 and 3]");
        } catch (Exception ex) {
            __CLR4_5_21ona1onalusvnf0t.R.inc(78811);error = ex;
        }
        __CLR4_5_21ona1onalusvnf0t.R.inc(78812);assertNotNull(error);
    }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

    public void test_27() throws Exception {__CLR4_5_21ona1onalusvnf0t.R.globalSliceStart(getClass().getName(),78813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2unxx471ot9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ona1onalusvnf0t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ona1onalusvnf0t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_27",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78813,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2unxx471ot9() throws Exception{try{__CLR4_5_21ona1onalusvnf0t.R.inc(78813);
        __CLR4_5_21ona1onalusvnf0t.R.inc(78814);JSONObject object = JSON.parseObject("{\n" +
                "    \"connection_health\": {\"status\": \"good\", \"max_value\": 2.0, \"min_value\": 2.0, \"average_value\": 2.0}, \n" +
                "    \"qps_health\": {\"status\": \"good\", \"max_value\": 5.3, \"min_value\": 4.29, \"average_value\": 4.6},\n" +
                "    \"disksize_health\": {\"status\": \"good\", \"max_value\": 3089.0, \"min_value\": 3089.0, \"average_value\": 3089.0},\n" +
                "     \"cpu_health\": {\"status\": \"good\", \"max_value\": 0.0, \"min_value\": 0.0, \"average_value\": 0.0}, \n" +
                "     \"memory_health\": {\"status\": \"good\", \"max_value\": 17.1, \"min_value\": 17.1, \"average_value\": 17.1}, \n" +
                "    \"iops_health\": {\"status\": \"good\", \"max_value\": 0.09, \"min_value\": 0.07, \"average_value\": 0.08}\n" +
                "}");

        __CLR4_5_21ona1onalusvnf0t.R.inc(78815);for(String key : object.keySet()) {{
            __CLR4_5_21ona1onalusvnf0t.R.inc(78816);System.out.println("key = " + key);
            __CLR4_5_21ona1onalusvnf0t.R.inc(78817);System.out.println("vaue = " + object.getJSONObject(key).getIntValue("max_value"));
        }
    }}finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}

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

        public M1(BigDecimal val) {try{__CLR4_5_21ona1onalusvnf0t.R.inc(78818);
            __CLR4_5_21ona1onalusvnf0t.R.inc(78819);this.val = val;
        }finally{__CLR4_5_21ona1onalusvnf0t.R.flushNeeded();}}
    }
}
