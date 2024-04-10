/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.number;

import com.alibaba.fastjson.*;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;
import org.junit.Assert;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class NumberValueTest_error_13 extends TestCase {static class __CLR4_5_21np21np2lusyjuf6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,77588,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21np2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77366,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21np2() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77366);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77367);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77368);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77369);JSON.parseObject("{\"v0\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77370);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77371);assertNotNull(error);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77372);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1np9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77373,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1np9() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77373);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77374);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77375);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77376);JSON.parseObject("{\"v1\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77377);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77378);assertNotNull(error);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77379);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441npg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77380,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441npg() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77380);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77381);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77382);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77383);JSON.parseObject("{\"v2\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77384);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77385);assertNotNull(error);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77386);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1npn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77387,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1npn() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77387);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77388);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77389);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77390);JSON.parseObject("{\"v3\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77391);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77392);assertNotNull(error);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77393);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61npu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77394,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61npu() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77394);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77395);BigDecimal b = new BigDecimal("49e999999999");

        __CLR4_5_21np21np2lusyjuf6.R.inc(77396);assertEquals("4.9E+1000000000", JSON.toJSONString(b, SerializerFeature.WriteBigDecimalAsPlain));
        __CLR4_5_21np21np2lusyjuf6.R.inc(77397);assertEquals("{\"val\":4.9E+1000000000}", JSON.toJSONString(new M1(b), SerializerFeature.WriteBigDecimalAsPlain));
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1npy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77398,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1npy() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77398);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77399);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77400);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77401);JSON.parseObject("{\"v5\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77402);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77403);assertNotNull(error);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77404);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81nq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77405,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81nq5() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77405);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77406);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77407);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77408);JSON.parseObject("{\"v6\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77409);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77410);assertNotNull(error);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77411);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1nqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77412,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1nqc() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77412);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77413);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77414);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77415);JSON.parseObject("{\"v7\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77416);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77417);assertNotNull(error);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77418);assertTrue(error.getCause() instanceof ArithmeticException);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq1nqj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77419,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq1nqj() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77419);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77420);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77421);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77422);JSON.parseObject("{\"v8\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77423);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77424);assertNotNull(error);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77425);assertEquals(NumberFormatException.class, error.getCause().getClass());
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f71nqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77426,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f71nqq() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77426);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77427);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77428);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77429);JSON.parseObject("{\"v9\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77430);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77431);assertNotNull(error);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77432);assertEquals(ArithmeticException.class, error.getCause().getClass());
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3oj7x1nqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77433,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3oj7x1nqx() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77433);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77434);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77435);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77436);JSON.parseObject("{\"v10\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77437);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77438);assertNotNull(error);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77439);assertEquals(ArithmeticException.class, error.getCause().getClass());
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uokfg1nr4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77440,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uokfg1nr4() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77440);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77441);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77442);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77443);JSON.parseObject("{\"v11\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77444);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77445);assertNotNull(error);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77446);assertEquals(ArithmeticException.class, error.getCause().getClass());
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_11_new() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_218ehwr1nrb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_11_new",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77447,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_218ehwr1nrb() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77447);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77448);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77449);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77450);JSON.parseObject("{\"v11\":new Date(49e99999999)}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77451);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77452);assertNotNull(error);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lolmz1nrh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77453,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lolmz1nrh() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77453);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77454);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77455);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77456);JSON.parseObject("{\"v12\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77457);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77458);assertNotNull(error);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77459);assertEquals(ArithmeticException.class, error.getCause().getClass());
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_13() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22comui1nro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77460,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22comui1nro() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77460);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77461);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77462);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77463);JSON.parseObject("{\"v13\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77464);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77465);assertNotNull(error);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77466);assertEquals(ArithmeticException.class, error.getCause().getClass());
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}


    public void test_14() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wbbxz1nrv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77467,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wbbxz1nrv() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77467);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77468);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77469);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77470);JSON.parseObject("{\"v14\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77471);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77472);assertNotNull(error);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77473);assertEquals(UnsupportedOperationException.class, error.getCause().getClass());
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_15() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_245baqg1ns2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77474,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_245baqg1ns2() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77474);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77475);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77476);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77477);JSON.parseObject("{\"v15\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77478);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77479);assertNotNull(error);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}


    public void test_16() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27eb9ix1ns8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_16",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77480,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27eb9ix1ns8() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77480);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77481);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77482);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77483);JSON.parseObject("{\"v16\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77484);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77485);assertNotNull(error);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_17() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2anb8be1nse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_17",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77486,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2anb8be1nse() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77486);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77487);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77488);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77489);JSON.parseObject("{\"v17\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77490);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77491);assertNotNull(error);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_17_1() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_281ddvw1nsk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_17_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77492,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_281ddvw1nsk() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77492);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77493);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77494);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77495);JSONObject jsonObject = JSON.parseObject("{\"v17\":49e99999999}");
            __CLR4_5_21np21np2lusyjuf6.R.inc(77496);jsonObject.getObject("v17", TimeUnit.class);
        } catch (JSONException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77497);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77498);assertNotNull(error);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}


    public void test_18() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dwb73v1nsr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_18",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77499,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dwb73v1nsr() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77499);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77500);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77501);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77502);JSON.parseObject("{\"v18\":49e99999999}", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77503);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77504);assertNotNull(error);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}


    public void test_20() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hm6dbm1nsx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_20",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77505,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hm6dbm1nsx() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77505);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77506);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_5_21np21np2lusyjuf6.R.inc(77507);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77508);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77509);jsonObject.getIntValue("v");
        } catch (ArithmeticException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77510);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77511);assertNotNull(error);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_21() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kv6c431nt4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_21",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77512,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kv6c431nt4() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77512);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77513);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_5_21np21np2lusyjuf6.R.inc(77514);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77515);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77516);jsonObject.getDate("v");
        } catch (ArithmeticException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77517);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77518);assertNotNull(error);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_22() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o46awk1ntb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_22",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77519,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o46awk1ntb() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77519);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77520);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_5_21np21np2lusyjuf6.R.inc(77521);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77522);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77523);jsonObject.getObject("v", java.sql.Date.class);
        } catch (ArithmeticException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77524);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77525);assertNotNull(error);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_23() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rd69p11nti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_23",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77526,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rd69p11nti() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77526);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77527);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_5_21np21np2lusyjuf6.R.inc(77528);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77529);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77530);jsonObject.getObject("v", java.sql.Timestamp.class);
        } catch (ArithmeticException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77531);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77532);assertNotNull(error);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_24() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2um68hi1ntp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_24",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77533,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2um68hi1ntp() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77533);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77534);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_5_21np21np2lusyjuf6.R.inc(77535);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77536);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77537);jsonObject.getObject("v", java.time.LocalDateTime.class);
        } catch (JSONException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77538);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77539);assertNotNull(error);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_25() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xv679z1ntw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_25",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77540,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xv679z1ntw() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77540);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77541);JSONObject jsonObject = JSON.parseObject("{\"lineNumber\":49e99999999}");
        __CLR4_5_21np21np2lusyjuf6.R.inc(77542);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77543);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77544);jsonObject.toJavaObject(StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77545);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77546);assertNotNull(error);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_26() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xwxvwo1nu3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_26",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77547,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xwxvwo1nu3() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77547);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77548);JSONObject jsonObject = JSON.parseObject("{\"v\":49e99999999}");
        __CLR4_5_21np21np2lusyjuf6.R.inc(77549);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77550);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77551);jsonObject.getObject("v", java.sql.Time.class);
        } catch (ArithmeticException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77552);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77553);assertNotNull(error);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_jsonpath() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2paavc11nua();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_jsonpath",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77554,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2paavc11nua() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77554);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77555);JSONObject jsonObject = JSON.parseObject("{\"v\":0}");
        __CLR4_5_21np21np2lusyjuf6.R.inc(77556);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77557);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77558);JSONPath.eval(jsonObject, "$.v in (49e99999999)");
        } catch (JSONPathException ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77559);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77560);assertNotNull(error);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_jsonpath_1() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bmfytv1nuh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_jsonpath_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77561,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bmfytv1nuh() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77561);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77562);JSONArray jsonObject = JSON.parseArray("[{\"v\":49e99999999}]");
        __CLR4_5_21np21np2lusyjuf6.R.inc(77563);JSONPath.eval(jsonObject, "[v=0]");
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_jsonpath_2() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2evfxmc1nuk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_jsonpath_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77564,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2evfxmc1nuk() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77564);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77565);Model[] array = JSON.parseObject("[{\"v2\":0}]", Model[].class);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77566);JSONPath.eval(array, "[v='49e99999999']");
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_jsonpath_3() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i4fwet1nun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_jsonpath_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77567,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i4fwet1nun() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77567);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77568);Model[] array = JSON.parseObject("[{\"v2\":0}]", Model[].class);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77569);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77570);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77571);JSONPath.read("{\"a\":49e9999999}","[a in (123,2,3)]");
        } catch (Exception ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77572);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77573);assertNotNull(error);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_jsonpath_4() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ldfv7a1nuu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_jsonpath_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77574,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ldfv7a1nuu() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77574);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77575);Model[] array = JSON.parseObject("[{\"v2\":0}]", Model[].class);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77576);Exception error = null;
        __CLR4_5_21np21np2lusyjuf6.R.inc(77577);try {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77578);JSONPath.read("{\"a\":49e9999999}","[a between 1 and 3]");
        } catch (Exception ex) {
            __CLR4_5_21np21np2lusyjuf6.R.inc(77579);error = ex;
        }
        __CLR4_5_21np21np2lusyjuf6.R.inc(77580);assertNotNull(error);
    }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

    public void test_27() throws Exception {__CLR4_5_21np21np2lusyjuf6.R.globalSliceStart(getClass().getName(),77581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2unxx471nv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21np21np2lusyjuf6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21np21np2lusyjuf6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.number.NumberValueTest_error_13.test_27",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77581,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2unxx471nv1() throws Exception{try{__CLR4_5_21np21np2lusyjuf6.R.inc(77581);
        __CLR4_5_21np21np2lusyjuf6.R.inc(77582);JSONObject object = JSON.parseObject("{\n" +
                "    \"connection_health\": {\"status\": \"good\", \"max_value\": 2.0, \"min_value\": 2.0, \"average_value\": 2.0}, \n" +
                "    \"qps_health\": {\"status\": \"good\", \"max_value\": 5.3, \"min_value\": 4.29, \"average_value\": 4.6},\n" +
                "    \"disksize_health\": {\"status\": \"good\", \"max_value\": 3089.0, \"min_value\": 3089.0, \"average_value\": 3089.0},\n" +
                "     \"cpu_health\": {\"status\": \"good\", \"max_value\": 0.0, \"min_value\": 0.0, \"average_value\": 0.0}, \n" +
                "     \"memory_health\": {\"status\": \"good\", \"max_value\": 17.1, \"min_value\": 17.1, \"average_value\": 17.1}, \n" +
                "    \"iops_health\": {\"status\": \"good\", \"max_value\": 0.09, \"min_value\": 0.07, \"average_value\": 0.08}\n" +
                "}");

        __CLR4_5_21np21np2lusyjuf6.R.inc(77583);for(String key : object.keySet()) {{
            __CLR4_5_21np21np2lusyjuf6.R.inc(77584);System.out.println("key = " + key);
            __CLR4_5_21np21np2lusyjuf6.R.inc(77585);System.out.println("vaue = " + object.getJSONObject(key).getIntValue("max_value"));
        }
    }}finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}

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

        public M1(BigDecimal val) {try{__CLR4_5_21np21np2lusyjuf6.R.inc(77586);
            __CLR4_5_21np21np2lusyjuf6.R.inc(77587);this.val = val;
        }finally{__CLR4_5_21np21np2lusyjuf6.R.flushNeeded();}}
    }
}
