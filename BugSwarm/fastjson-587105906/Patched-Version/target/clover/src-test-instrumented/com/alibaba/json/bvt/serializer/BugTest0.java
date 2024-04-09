/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.sql.Date;
import java.sql.Timestamp;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class BugTest0 extends TestCase {static class __CLR4_5_21rjw1rjwlusvng0b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,82424,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21rjw1rjwlusvng0b.R.globalSliceStart(getClass().getName(),82364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21rjw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rjw1rjwlusvng0b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rjw1rjwlusvng0b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82364,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21rjw() throws Exception{try{__CLR4_5_21rjw1rjwlusvng0b.R.inc(82364);
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82365);Timestamp t = new Timestamp(System.currentTimeMillis());

        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82366);String text = JSON.toJSONString(t);

        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82367);Timestamp t1 = JSON.parseObject(text, Timestamp.class);
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82368);Assert.assertEquals(t, t1);
    }finally{__CLR4_5_21rjw1rjwlusvng0b.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21rjw1rjwlusvng0b.R.globalSliceStart(getClass().getName(),82369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1rk1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rjw1rjwlusvng0b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rjw1rjwlusvng0b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82369,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1rk1() throws Exception{try{__CLR4_5_21rjw1rjwlusvng0b.R.inc(82369);
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82370);long t1 = System.currentTimeMillis();
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82371);String text = JSON.toJSONString(t1);

        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82372);Timestamp t2 = JSON.parseObject(text, Timestamp.class);
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82373);Assert.assertEquals(t1, t2.getTime());
    }finally{__CLR4_5_21rjw1rjwlusvng0b.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21rjw1rjwlusvng0b.R.globalSliceStart(getClass().getName(),82374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441rk6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rjw1rjwlusvng0b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rjw1rjwlusvng0b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82374,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441rk6() throws Exception{try{__CLR4_5_21rjw1rjwlusvng0b.R.inc(82374);
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82375);Date t = new Date(System.currentTimeMillis());

        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82376);String text = JSON.toJSONString(t);

        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82377);Date t1 = JSON.parseObject(text, Date.class);
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82378);Assert.assertEquals(t, t1);
    }finally{__CLR4_5_21rjw1rjwlusvng0b.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21rjw1rjwlusvng0b.R.globalSliceStart(getClass().getName(),82379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1rkb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rjw1rjwlusvng0b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rjw1rjwlusvng0b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82379,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1rkb() throws Exception{try{__CLR4_5_21rjw1rjwlusvng0b.R.inc(82379);
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82380);long t1 = System.currentTimeMillis();
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82381);String text = JSON.toJSONString(t1);

        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82382);Date t2 = JSON.parseObject(text, Date.class);
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82383);Assert.assertEquals(t1, t2.getTime());
    }finally{__CLR4_5_21rjw1rjwlusvng0b.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21rjw1rjwlusvng0b.R.globalSliceStart(getClass().getName(),82384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61rkg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rjw1rjwlusvng0b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rjw1rjwlusvng0b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82384,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61rkg() throws Exception{try{__CLR4_5_21rjw1rjwlusvng0b.R.inc(82384);
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82385);A a = new A();
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82386);a.setDate(new java.sql.Date(System.currentTimeMillis()));
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82387);a.setTime(new java.sql.Timestamp(System.currentTimeMillis()));
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82388);String text = JSON.toJSONString(a);

        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82389);A a1 = JSON.parseObject(text, A.class);

        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82390);Assert.assertEquals(a.getDate(), a1.getDate());
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82391);Assert.assertEquals(a.getTime(), a1.getTime());
    }finally{__CLR4_5_21rjw1rjwlusvng0b.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_5_21rjw1rjwlusvng0b.R.globalSliceStart(getClass().getName(),82392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxv1rko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rjw1rjwlusvng0b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rjw1rjwlusvng0b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82392,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxv1rko() throws Exception{try{__CLR4_5_21rjw1rjwlusvng0b.R.inc(82392);
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82393);Exception error = null;
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82394);try {
            __CLR4_5_21rjw1rjwlusvng0b.R.inc(82395);JSON.parseObject("\"222A\"", Timestamp.class);
        } catch (JSONException e) {
            __CLR4_5_21rjw1rjwlusvng0b.R.inc(82396);error = e;
        }
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82397);Assert.assertNotNull(error);
    }finally{__CLR4_5_21rjw1rjwlusvng0b.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_5_21rjw1rjwlusvng0b.R.globalSliceStart(getClass().getName(),82398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1rku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rjw1rjwlusvng0b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rjw1rjwlusvng0b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82398,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1rku() throws Exception{try{__CLR4_5_21rjw1rjwlusvng0b.R.inc(82398);
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82399);Exception error = null;
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82400);try {
            __CLR4_5_21rjw1rjwlusvng0b.R.inc(82401);JSON.parseObject("\"222B\"", Date.class);
        } catch (JSONException e) {
            __CLR4_5_21rjw1rjwlusvng0b.R.inc(82402);error = e;
        }
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82403);Assert.assertNotNull(error);
    }finally{__CLR4_5_21rjw1rjwlusvng0b.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_5_21rjw1rjwlusvng0b.R.globalSliceStart(getClass().getName(),82404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1rl0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rjw1rjwlusvng0b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rjw1rjwlusvng0b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82404,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1rl0() throws Exception{try{__CLR4_5_21rjw1rjwlusvng0b.R.inc(82404);
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82405);Exception error = null;
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82406);try {
            __CLR4_5_21rjw1rjwlusvng0b.R.inc(82407);JSON.parseObject("true", Timestamp.class);
        } catch (JSONException e) {
            __CLR4_5_21rjw1rjwlusvng0b.R.inc(82408);error = e;
        }
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82409);Assert.assertNotNull(error);
    }finally{__CLR4_5_21rjw1rjwlusvng0b.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_5_21rjw1rjwlusvng0b.R.globalSliceStart(getClass().getName(),82410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1rl6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rjw1rjwlusvng0b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rjw1rjwlusvng0b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82410,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1rl6() throws Exception{try{__CLR4_5_21rjw1rjwlusvng0b.R.inc(82410);
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82411);Exception error = null;
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82412);try {
            __CLR4_5_21rjw1rjwlusvng0b.R.inc(82413);JSON.parseObject("true", Date.class);
        } catch (JSONException e) {
            __CLR4_5_21rjw1rjwlusvng0b.R.inc(82414);error = e;
        }
        __CLR4_5_21rjw1rjwlusvng0b.R.inc(82415);Assert.assertNotNull(error);
    }finally{__CLR4_5_21rjw1rjwlusvng0b.R.flushNeeded();}}

    public static class A {

        private java.sql.Timestamp time;
        private java.sql.Date      date;

        public java.sql.Timestamp getTime() {try{__CLR4_5_21rjw1rjwlusvng0b.R.inc(82416);
            __CLR4_5_21rjw1rjwlusvng0b.R.inc(82417);return time;
        }finally{__CLR4_5_21rjw1rjwlusvng0b.R.flushNeeded();}}

        public void setTime(java.sql.Timestamp time) {try{__CLR4_5_21rjw1rjwlusvng0b.R.inc(82418);
            __CLR4_5_21rjw1rjwlusvng0b.R.inc(82419);this.time = time;
        }finally{__CLR4_5_21rjw1rjwlusvng0b.R.flushNeeded();}}

        public java.sql.Date getDate() {try{__CLR4_5_21rjw1rjwlusvng0b.R.inc(82420);
            __CLR4_5_21rjw1rjwlusvng0b.R.inc(82421);return date;
        }finally{__CLR4_5_21rjw1rjwlusvng0b.R.flushNeeded();}}

        public void setDate(java.sql.Date date) {try{__CLR4_5_21rjw1rjwlusvng0b.R.inc(82422);
            __CLR4_5_21rjw1rjwlusvng0b.R.inc(82423);this.date = date;
        }finally{__CLR4_5_21rjw1rjwlusvng0b.R.flushNeeded();}}

    }
}
