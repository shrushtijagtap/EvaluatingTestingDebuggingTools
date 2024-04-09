/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.number;

import com.alibaba.fastjson.*;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;
import org.junit.Assert;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class NumberValueTest_error_13 extends TestCase {static class __CLR4_1_101npd1npdlusqkhfw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,77599,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21npd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77377,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21npd() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77377);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77378);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77379);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77380);JSON.parseObject("{\"v0\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77381);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77382);assertNotNull(error);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77383);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1npk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77384,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1npk() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77384);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77385);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77386);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77387);JSON.parseObject("{\"v1\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77388);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77389);assertNotNull(error);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77390);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441npr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77391,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441npr() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77391);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77392);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77393);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77394);JSON.parseObject("{\"v2\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77395);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77396);assertNotNull(error);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77397);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1npy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77398,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1npy() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77398);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77399);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77400);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77401);JSON.parseObject("{\"v3\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77402);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77403);assertNotNull(error);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77404);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61nq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77405,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61nq5() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77405);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77406);BigDecimal b = new BigDecimal("49e999999999");

        __CLR4_1_101npd1npdlusqkhfw.R.inc(77407);assertEquals("4.9E+1000000000", JSON.toJSONString(b, SerializerFeature.WriteBigDecimalAsPlain));
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77408);assertEquals("{\"val\":4.9E+1000000000}", JSON.toJSONString(new M1(b), SerializerFeature.WriteBigDecimalAsPlain));
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1nq9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77409,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1nq9() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77409);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77410);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77411);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77412);JSON.parseObject("{\"v5\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77413);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77414);assertNotNull(error);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77415);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81nqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77416,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81nqg() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77416);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77417);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77418);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77419);JSON.parseObject("{\"v6\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77420);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77421);assertNotNull(error);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77422);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1nqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77423,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1nqn() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77423);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77424);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77425);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77426);JSON.parseObject("{\"v7\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77427);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77428);assertNotNull(error);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77429);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102uw8mq1nqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77430,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102uw8mq1nqu() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77430);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77431);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77432);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77433);JSON.parseObject("{\"v8\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77434);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77435);assertNotNull(error);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77436);assertEquals(NumberFormatException.class, error.getCause().getClass());
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1063w7f71nr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77437,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1063w7f71nr1() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77437);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77438);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77439);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77440);JSON.parseObject("{\"v9\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77441);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77442);assertNotNull(error);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77443);assertEquals(ArithmeticException.class, error.getCause().getClass());
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c3oj7x1nr8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77444,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c3oj7x1nr8() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77444);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77445);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77446);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77447);JSON.parseObject("{\"v10\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77448);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77449);assertNotNull(error);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77450);assertEquals(ArithmeticException.class, error.getCause().getClass());
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108uokfg1nrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77451,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108uokfg1nrf() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77451);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77452);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77453);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77454);JSON.parseObject("{\"v11\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77455);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77456);assertNotNull(error);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77457);assertEquals(ArithmeticException.class, error.getCause().getClass());
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_11_new() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1018ehwr1nrm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_11_new",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77458,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1018ehwr1nrm() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77458);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77459);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77460);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77461);JSON.parseObject("{\"v11\":new Date(49e99999999)}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77462);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77463);assertNotNull(error);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105lolmz1nrs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77464,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105lolmz1nrs() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77464);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77465);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77466);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77467);JSON.parseObject("{\"v12\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77468);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77469);assertNotNull(error);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77470);assertEquals(ArithmeticException.class, error.getCause().getClass());
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_13() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102comui1nrz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77471,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102comui1nrz() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77471);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77472);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77473);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77474);JSON.parseObject("{\"v13\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77475);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77476);assertNotNull(error);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77477);assertEquals(ArithmeticException.class, error.getCause().getClass());
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}


    public void test_14() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wbbxz1ns6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_14",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77478,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wbbxz1ns6() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77478);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77479);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77480);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77481);JSON.parseObject("{\"v14\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77482);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77483);assertNotNull(error);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77484);assertEquals(UnsupportedOperationException.class, error.getCause().getClass());
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_15() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1045baqg1nsd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_15",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77485,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1045baqg1nsd() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77485);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77486);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77487);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77488);JSON.parseObject("{\"v15\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77489);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77490);assertNotNull(error);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}


    public void test_16() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107eb9ix1nsj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_16",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77491,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107eb9ix1nsj() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77491);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77492);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77493);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77494);JSON.parseObject("{\"v16\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77495);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77496);assertNotNull(error);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_17() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10anb8be1nsp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_17",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77497,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10anb8be1nsp() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77497);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77498);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77499);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77500);JSON.parseObject("{\"v17\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77501);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77502);assertNotNull(error);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_17_1() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1081ddvw1nsv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_17_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77503,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1081ddvw1nsv() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77503);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77504);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77505);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77506);JSONObject jsonObject = JSON.parseObject("{\"v17\":49e99999999}");
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77507);jsonObject.getObject("v17", TimeUnit.class);
        } catch (JSONException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77508);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77509);assertNotNull(error);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}


    public void test_18() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dwb73v1nt2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_18",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77510,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dwb73v1nt2() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77510);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77511);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77512);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77513);JSON.parseObject("{\"v18\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77514);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77515);assertNotNull(error);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}


    public void test_20() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hm6dbm1nt8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_20",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77516,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hm6dbm1nt8() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77516);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77517);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77518);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77519);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77520);jsonObject.getIntValue("v");
        } catch (ArithmeticException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77521);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77522);assertNotNull(error);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_21() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kv6c431ntf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_21",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77523,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kv6c431ntf() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77523);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77524);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77525);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77526);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77527);jsonObject.getDate("v");
        } catch (ArithmeticException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77528);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77529);assertNotNull(error);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_22() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10o46awk1ntm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_22",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77530,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10o46awk1ntm() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77530);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77531);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77532);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77533);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77534);jsonObject.getObject("v", java.sql.Date.class);
        } catch (ArithmeticException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77535);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77536);assertNotNull(error);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_23() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rd69p11ntt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_23",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77537,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rd69p11ntt() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77537);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77538);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77539);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77540);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77541);jsonObject.getObject("v", java.sql.Timestamp.class);
        } catch (ArithmeticException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77542);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77543);assertNotNull(error);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_24() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10um68hi1nu0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_24",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77544,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10um68hi1nu0() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77544);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77545);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77546);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77547);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77548);jsonObject.getObject("v", java.time.LocalDateTime.class);
        } catch (JSONException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77549);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77550);assertNotNull(error);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_25() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xv679z1nu7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_25",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77551,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xv679z1nu7() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77551);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77552);JSONObject jsonObject = JSON.parseObject("{\"lineNumber\":49e99999999}");
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77553);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77554);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77555);jsonObject.toJavaObject(StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77556);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77557);assertNotNull(error);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_26() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xwxvwo1nue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_26",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77558,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xwxvwo1nue() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77558);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77559);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77560);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77561);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77562);jsonObject.getObject("v", java.sql.Time.class);
        } catch (ArithmeticException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77563);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77564);assertNotNull(error);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_jsonpath() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10paavc11nul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_jsonpath",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77565,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10paavc11nul() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77565);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77566);JSONObject jsonObject = JSON.parseObject("{\"v\":0}");
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77567);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77568);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77569);JSONPath.eval(jsonObject, "$.v in (49e99999999)");
        } catch (JSONPathException ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77570);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77571);assertNotNull(error);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_jsonpath_1() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bmfytv1nus();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_jsonpath_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77572,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bmfytv1nus() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77572);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77573);JSONArray jsonObject = JSON.parseArray("[{\"v\":49e99999999}]");
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77574);JSONPath.eval(jsonObject, "[v=0]");
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_jsonpath_2() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10evfxmc1nuv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_jsonpath_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77575,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10evfxmc1nuv() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77575);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77576);Model[] array = JSON.parseObject("[{\"v2\":0}]", Model[].class);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77577);JSONPath.eval(array, "[v='49e99999999']");
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_jsonpath_3() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i4fwet1nuy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_jsonpath_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77578,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i4fwet1nuy() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77578);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77579);Model[] array = JSON.parseObject("[{\"v2\":0}]", Model[].class);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77580);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77581);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77582);JSONPath.read("{\"a\":49e9999999}","[a in (123,2,3)]");
        } catch (Exception ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77583);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77584);assertNotNull(error);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_jsonpath_4() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ldfv7a1nv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_jsonpath_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77585,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ldfv7a1nv5() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77585);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77586);Model[] array = JSON.parseObject("[{\"v2\":0}]", Model[].class);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77587);Exception error = null;
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77588);try {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77589);JSONPath.read("{\"a\":49e9999999}","[a between 1 and 3]");
        } catch (Exception ex) {
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77590);error = ex;
        }
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77591);assertNotNull(error);
    }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

    public void test_27() throws Exception {__CLR4_1_101npd1npdlusqkhfw.R.globalSliceStart(getClass().getName(),77592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10unxx471nvc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101npd1npdlusqkhfw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101npd1npdlusqkhfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_27",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77592,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10unxx471nvc() throws Exception{try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77592);
        __CLR4_1_101npd1npdlusqkhfw.R.inc(77593);JSONObject object = JSON.parseObject("{\n" +
                "    \"connection_health\": {\"status\": \"good\", \"max_value\": 2.0, \"min_value\": 2.0, \"average_value\": 2.0}, \n" +
                "    \"qps_health\": {\"status\": \"good\", \"max_value\": 5.3, \"min_value\": 4.29, \"average_value\": 4.6},\n" +
                "    \"disksize_health\": {\"status\": \"good\", \"max_value\": 3089.0, \"min_value\": 3089.0, \"average_value\": 3089.0},\n" +
                "     \"cpu_health\": {\"status\": \"good\", \"max_value\": 0.0, \"min_value\": 0.0, \"average_value\": 0.0}, \n" +
                "     \"memory_health\": {\"status\": \"good\", \"max_value\": 17.1, \"min_value\": 17.1, \"average_value\": 17.1}, \n" +
                "    \"iops_health\": {\"status\": \"good\", \"max_value\": 0.09, \"min_value\": 0.07, \"average_value\": 0.08}\n" +
                "}");

        __CLR4_1_101npd1npdlusqkhfw.R.inc(77594);for(String key : object.keySet()) {{
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77595);System.out.println("key = " + key);
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77596);System.out.println("vaue = " + object.getJSONObject(key).getIntValue("max_value"));
        }
    }}finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}

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

        public M1(BigDecimal val) {try{__CLR4_1_101npd1npdlusqkhfw.R.inc(77597);
            __CLR4_1_101npd1npdlusqkhfw.R.inc(77598);this.val = val;
        }finally{__CLR4_1_101npd1npdlusqkhfw.R.flushNeeded();}}
    }
}
