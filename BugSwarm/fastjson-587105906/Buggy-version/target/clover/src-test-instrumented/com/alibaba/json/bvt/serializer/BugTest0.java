/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.sql.Date;
import java.sql.Timestamp;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class BugTest0 extends TestCase {static class __CLR4_1_101qlz1qlzlusqkj73{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,81203,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101qlz1qlzlusqkj73.R.globalSliceStart(getClass().getName(),81143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21qlz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qlz1qlzlusqkj73.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qlz1qlzlusqkj73.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81143,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21qlz() throws Exception{try{__CLR4_1_101qlz1qlzlusqkj73.R.inc(81143);
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81144);Timestamp t = new Timestamp(System.currentTimeMillis());

        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81145);String text = JSON.toJSONString(t);

        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81146);Timestamp t1 = JSON.parseObject(text, Timestamp.class);
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81147);Assert.assertEquals(t, t1);
    }finally{__CLR4_1_101qlz1qlzlusqkj73.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101qlz1qlzlusqkj73.R.globalSliceStart(getClass().getName(),81148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1qm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qlz1qlzlusqkj73.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qlz1qlzlusqkj73.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81148,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1qm4() throws Exception{try{__CLR4_1_101qlz1qlzlusqkj73.R.inc(81148);
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81149);long t1 = System.currentTimeMillis();
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81150);String text = JSON.toJSONString(t1);

        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81151);Timestamp t2 = JSON.parseObject(text, Timestamp.class);
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81152);Assert.assertEquals(t1, t2.getTime());
    }finally{__CLR4_1_101qlz1qlzlusqkj73.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101qlz1qlzlusqkj73.R.globalSliceStart(getClass().getName(),81153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441qm9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qlz1qlzlusqkj73.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qlz1qlzlusqkj73.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81153,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441qm9() throws Exception{try{__CLR4_1_101qlz1qlzlusqkj73.R.inc(81153);
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81154);Date t = new Date(System.currentTimeMillis());

        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81155);String text = JSON.toJSONString(t);

        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81156);Date t1 = JSON.parseObject(text, Date.class);
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81157);Assert.assertEquals(t, t1);
    }finally{__CLR4_1_101qlz1qlzlusqkj73.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101qlz1qlzlusqkj73.R.globalSliceStart(getClass().getName(),81158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1qme();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qlz1qlzlusqkj73.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qlz1qlzlusqkj73.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81158,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1qme() throws Exception{try{__CLR4_1_101qlz1qlzlusqkj73.R.inc(81158);
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81159);long t1 = System.currentTimeMillis();
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81160);String text = JSON.toJSONString(t1);

        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81161);Date t2 = JSON.parseObject(text, Date.class);
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81162);Assert.assertEquals(t1, t2.getTime());
    }finally{__CLR4_1_101qlz1qlzlusqkj73.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101qlz1qlzlusqkj73.R.globalSliceStart(getClass().getName(),81163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61qmj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qlz1qlzlusqkj73.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qlz1qlzlusqkj73.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81163,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61qmj() throws Exception{try{__CLR4_1_101qlz1qlzlusqkj73.R.inc(81163);
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81164);A a = new A();
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81165);a.setDate(new java.sql.Date(System.currentTimeMillis()));
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81166);a.setTime(new java.sql.Timestamp(System.currentTimeMillis()));
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81167);String text = JSON.toJSONString(a);

        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81168);A a1 = JSON.parseObject(text, A.class);

        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81169);Assert.assertEquals(a.getDate(), a1.getDate());
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81170);Assert.assertEquals(a.getTime(), a1.getTime());
    }finally{__CLR4_1_101qlz1qlzlusqkj73.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_1_101qlz1qlzlusqkj73.R.globalSliceStart(getClass().getName(),81171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1qmr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qlz1qlzlusqkj73.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qlz1qlzlusqkj73.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81171,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1qmr() throws Exception{try{__CLR4_1_101qlz1qlzlusqkj73.R.inc(81171);
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81172);Exception error = null;
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81173);try {
            __CLR4_1_101qlz1qlzlusqkj73.R.inc(81174);JSON.parseObject("\"222A\"", Timestamp.class);
        } catch (JSONException e) {
            __CLR4_1_101qlz1qlzlusqkj73.R.inc(81175);error = e;
        }
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81176);Assert.assertNotNull(error);
    }finally{__CLR4_1_101qlz1qlzlusqkj73.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101qlz1qlzlusqkj73.R.globalSliceStart(getClass().getName(),81177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1qmx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qlz1qlzlusqkj73.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qlz1qlzlusqkj73.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81177,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1qmx() throws Exception{try{__CLR4_1_101qlz1qlzlusqkj73.R.inc(81177);
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81178);Exception error = null;
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81179);try {
            __CLR4_1_101qlz1qlzlusqkj73.R.inc(81180);JSON.parseObject("\"222B\"", Date.class);
        } catch (JSONException e) {
            __CLR4_1_101qlz1qlzlusqkj73.R.inc(81181);error = e;
        }
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81182);Assert.assertNotNull(error);
    }finally{__CLR4_1_101qlz1qlzlusqkj73.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_1_101qlz1qlzlusqkj73.R.globalSliceStart(getClass().getName(),81183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1qn3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qlz1qlzlusqkj73.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qlz1qlzlusqkj73.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81183,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1qn3() throws Exception{try{__CLR4_1_101qlz1qlzlusqkj73.R.inc(81183);
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81184);Exception error = null;
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81185);try {
            __CLR4_1_101qlz1qlzlusqkj73.R.inc(81186);JSON.parseObject("true", Timestamp.class);
        } catch (JSONException e) {
            __CLR4_1_101qlz1qlzlusqkj73.R.inc(81187);error = e;
        }
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81188);Assert.assertNotNull(error);
    }finally{__CLR4_1_101qlz1qlzlusqkj73.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_1_101qlz1qlzlusqkj73.R.globalSliceStart(getClass().getName(),81189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1qn9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qlz1qlzlusqkj73.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qlz1qlzlusqkj73.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BugTest0.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81189,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1qn9() throws Exception{try{__CLR4_1_101qlz1qlzlusqkj73.R.inc(81189);
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81190);Exception error = null;
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81191);try {
            __CLR4_1_101qlz1qlzlusqkj73.R.inc(81192);JSON.parseObject("true", Date.class);
        } catch (JSONException e) {
            __CLR4_1_101qlz1qlzlusqkj73.R.inc(81193);error = e;
        }
        __CLR4_1_101qlz1qlzlusqkj73.R.inc(81194);Assert.assertNotNull(error);
    }finally{__CLR4_1_101qlz1qlzlusqkj73.R.flushNeeded();}}

    public static class A {

        private java.sql.Timestamp time;
        private java.sql.Date      date;

        public java.sql.Timestamp getTime() {try{__CLR4_1_101qlz1qlzlusqkj73.R.inc(81195);
            __CLR4_1_101qlz1qlzlusqkj73.R.inc(81196);return time;
        }finally{__CLR4_1_101qlz1qlzlusqkj73.R.flushNeeded();}}

        public void setTime(java.sql.Timestamp time) {try{__CLR4_1_101qlz1qlzlusqkj73.R.inc(81197);
            __CLR4_1_101qlz1qlzlusqkj73.R.inc(81198);this.time = time;
        }finally{__CLR4_1_101qlz1qlzlusqkj73.R.flushNeeded();}}

        public java.sql.Date getDate() {try{__CLR4_1_101qlz1qlzlusqkj73.R.inc(81199);
            __CLR4_1_101qlz1qlzlusqkj73.R.inc(81200);return date;
        }finally{__CLR4_1_101qlz1qlzlusqkj73.R.flushNeeded();}}

        public void setDate(java.sql.Date date) {try{__CLR4_1_101qlz1qlzlusqkj73.R.inc(81201);
            __CLR4_1_101qlz1qlzlusqkj73.R.inc(81202);this.date = date;
        }finally{__CLR4_1_101qlz1qlzlusqkj73.R.flushNeeded();}}

    }
}
