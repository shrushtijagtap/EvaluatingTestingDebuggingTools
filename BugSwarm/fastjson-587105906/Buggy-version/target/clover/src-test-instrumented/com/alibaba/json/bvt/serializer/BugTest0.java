/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.sql.Date;
import java.sql.Timestamp;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class BugTest0 extends TestCase {static class __CLR4_1_101rk71rk7luszwetx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,82435,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101rk71rk7luszwetx.R.globalSliceStart(getClass().getName(),82375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21rk7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rk71rk7luszwetx.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rk71rk7luszwetx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82375,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21rk7() throws Exception{try{__CLR4_1_101rk71rk7luszwetx.R.inc(82375);
        __CLR4_1_101rk71rk7luszwetx.R.inc(82376);Timestamp t = new Timestamp(System.currentTimeMillis());

        __CLR4_1_101rk71rk7luszwetx.R.inc(82377);String text = JSON.toJSONString(t);

        __CLR4_1_101rk71rk7luszwetx.R.inc(82378);Timestamp t1 = JSON.parseObject(text, Timestamp.class);
        __CLR4_1_101rk71rk7luszwetx.R.inc(82379);Assert.assertEquals(t, t1);
    }finally{__CLR4_1_101rk71rk7luszwetx.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101rk71rk7luszwetx.R.globalSliceStart(getClass().getName(),82380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1rkc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rk71rk7luszwetx.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rk71rk7luszwetx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82380,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1rkc() throws Exception{try{__CLR4_1_101rk71rk7luszwetx.R.inc(82380);
        __CLR4_1_101rk71rk7luszwetx.R.inc(82381);long t1 = System.currentTimeMillis();
        __CLR4_1_101rk71rk7luszwetx.R.inc(82382);String text = JSON.toJSONString(t1);

        __CLR4_1_101rk71rk7luszwetx.R.inc(82383);Timestamp t2 = JSON.parseObject(text, Timestamp.class);
        __CLR4_1_101rk71rk7luszwetx.R.inc(82384);Assert.assertEquals(t1, t2.getTime());
    }finally{__CLR4_1_101rk71rk7luszwetx.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101rk71rk7luszwetx.R.globalSliceStart(getClass().getName(),82385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441rkh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rk71rk7luszwetx.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rk71rk7luszwetx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82385,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441rkh() throws Exception{try{__CLR4_1_101rk71rk7luszwetx.R.inc(82385);
        __CLR4_1_101rk71rk7luszwetx.R.inc(82386);Date t = new Date(System.currentTimeMillis());

        __CLR4_1_101rk71rk7luszwetx.R.inc(82387);String text = JSON.toJSONString(t);

        __CLR4_1_101rk71rk7luszwetx.R.inc(82388);Date t1 = JSON.parseObject(text, Date.class);
        __CLR4_1_101rk71rk7luszwetx.R.inc(82389);Assert.assertEquals(t, t1);
    }finally{__CLR4_1_101rk71rk7luszwetx.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101rk71rk7luszwetx.R.globalSliceStart(getClass().getName(),82390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1rkm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rk71rk7luszwetx.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rk71rk7luszwetx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82390,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1rkm() throws Exception{try{__CLR4_1_101rk71rk7luszwetx.R.inc(82390);
        __CLR4_1_101rk71rk7luszwetx.R.inc(82391);long t1 = System.currentTimeMillis();
        __CLR4_1_101rk71rk7luszwetx.R.inc(82392);String text = JSON.toJSONString(t1);

        __CLR4_1_101rk71rk7luszwetx.R.inc(82393);Date t2 = JSON.parseObject(text, Date.class);
        __CLR4_1_101rk71rk7luszwetx.R.inc(82394);Assert.assertEquals(t1, t2.getTime());
    }finally{__CLR4_1_101rk71rk7luszwetx.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101rk71rk7luszwetx.R.globalSliceStart(getClass().getName(),82395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61rkr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rk71rk7luszwetx.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rk71rk7luszwetx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82395,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61rkr() throws Exception{try{__CLR4_1_101rk71rk7luszwetx.R.inc(82395);
        __CLR4_1_101rk71rk7luszwetx.R.inc(82396);A a = new A();
        __CLR4_1_101rk71rk7luszwetx.R.inc(82397);a.setDate(new java.sql.Date(System.currentTimeMillis()));
        __CLR4_1_101rk71rk7luszwetx.R.inc(82398);a.setTime(new java.sql.Timestamp(System.currentTimeMillis()));
        __CLR4_1_101rk71rk7luszwetx.R.inc(82399);String text = JSON.toJSONString(a);

        __CLR4_1_101rk71rk7luszwetx.R.inc(82400);A a1 = JSON.parseObject(text, A.class);

        __CLR4_1_101rk71rk7luszwetx.R.inc(82401);Assert.assertEquals(a.getDate(), a1.getDate());
        __CLR4_1_101rk71rk7luszwetx.R.inc(82402);Assert.assertEquals(a.getTime(), a1.getTime());
    }finally{__CLR4_1_101rk71rk7luszwetx.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_1_101rk71rk7luszwetx.R.globalSliceStart(getClass().getName(),82403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1rkz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rk71rk7luszwetx.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rk71rk7luszwetx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82403,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1rkz() throws Exception{try{__CLR4_1_101rk71rk7luszwetx.R.inc(82403);
        __CLR4_1_101rk71rk7luszwetx.R.inc(82404);Exception error = null;
        __CLR4_1_101rk71rk7luszwetx.R.inc(82405);try {
            __CLR4_1_101rk71rk7luszwetx.R.inc(82406);JSON.parseObject("\"222A\"", Timestamp.class);
        } catch (JSONException e) {
            __CLR4_1_101rk71rk7luszwetx.R.inc(82407);error = e;
        }
        __CLR4_1_101rk71rk7luszwetx.R.inc(82408);Assert.assertNotNull(error);
    }finally{__CLR4_1_101rk71rk7luszwetx.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101rk71rk7luszwetx.R.globalSliceStart(getClass().getName(),82409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1rl5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rk71rk7luszwetx.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rk71rk7luszwetx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82409,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1rl5() throws Exception{try{__CLR4_1_101rk71rk7luszwetx.R.inc(82409);
        __CLR4_1_101rk71rk7luszwetx.R.inc(82410);Exception error = null;
        __CLR4_1_101rk71rk7luszwetx.R.inc(82411);try {
            __CLR4_1_101rk71rk7luszwetx.R.inc(82412);JSON.parseObject("\"222B\"", Date.class);
        } catch (JSONException e) {
            __CLR4_1_101rk71rk7luszwetx.R.inc(82413);error = e;
        }
        __CLR4_1_101rk71rk7luszwetx.R.inc(82414);Assert.assertNotNull(error);
    }finally{__CLR4_1_101rk71rk7luszwetx.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_1_101rk71rk7luszwetx.R.globalSliceStart(getClass().getName(),82415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1rlb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rk71rk7luszwetx.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rk71rk7luszwetx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82415,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1rlb() throws Exception{try{__CLR4_1_101rk71rk7luszwetx.R.inc(82415);
        __CLR4_1_101rk71rk7luszwetx.R.inc(82416);Exception error = null;
        __CLR4_1_101rk71rk7luszwetx.R.inc(82417);try {
            __CLR4_1_101rk71rk7luszwetx.R.inc(82418);JSON.parseObject("true", Timestamp.class);
        } catch (JSONException e) {
            __CLR4_1_101rk71rk7luszwetx.R.inc(82419);error = e;
        }
        __CLR4_1_101rk71rk7luszwetx.R.inc(82420);Assert.assertNotNull(error);
    }finally{__CLR4_1_101rk71rk7luszwetx.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_1_101rk71rk7luszwetx.R.globalSliceStart(getClass().getName(),82421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1rlh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rk71rk7luszwetx.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rk71rk7luszwetx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82421,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1rlh() throws Exception{try{__CLR4_1_101rk71rk7luszwetx.R.inc(82421);
        __CLR4_1_101rk71rk7luszwetx.R.inc(82422);Exception error = null;
        __CLR4_1_101rk71rk7luszwetx.R.inc(82423);try {
            __CLR4_1_101rk71rk7luszwetx.R.inc(82424);JSON.parseObject("true", Date.class);
        } catch (JSONException e) {
            __CLR4_1_101rk71rk7luszwetx.R.inc(82425);error = e;
        }
        __CLR4_1_101rk71rk7luszwetx.R.inc(82426);Assert.assertNotNull(error);
    }finally{__CLR4_1_101rk71rk7luszwetx.R.flushNeeded();}}

    public static class A {

        private java.sql.Timestamp time;
        private java.sql.Date      date;

        public java.sql.Timestamp getTime() {try{__CLR4_1_101rk71rk7luszwetx.R.inc(82427);
            __CLR4_1_101rk71rk7luszwetx.R.inc(82428);return time;
        }finally{__CLR4_1_101rk71rk7luszwetx.R.flushNeeded();}}

        public void setTime(java.sql.Timestamp time) {try{__CLR4_1_101rk71rk7luszwetx.R.inc(82429);
            __CLR4_1_101rk71rk7luszwetx.R.inc(82430);this.time = time;
        }finally{__CLR4_1_101rk71rk7luszwetx.R.flushNeeded();}}

        public java.sql.Date getDate() {try{__CLR4_1_101rk71rk7luszwetx.R.inc(82431);
            __CLR4_1_101rk71rk7luszwetx.R.inc(82432);return date;
        }finally{__CLR4_1_101rk71rk7luszwetx.R.flushNeeded();}}

        public void setDate(java.sql.Date date) {try{__CLR4_1_101rk71rk7luszwetx.R.inc(82433);
            __CLR4_1_101rk71rk7luszwetx.R.inc(82434);this.date = date;
        }finally{__CLR4_1_101rk71rk7luszwetx.R.flushNeeded();}}

    }
}
