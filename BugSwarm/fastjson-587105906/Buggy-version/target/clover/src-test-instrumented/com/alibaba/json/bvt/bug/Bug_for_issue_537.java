/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

import junit.framework.TestCase;

public class Bug_for_issue_537 extends TestCase {static class __CLR4_1_1014ob14oblusqk34c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,52743,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_1_1014ob14oblusqk34c.R.globalSliceStart(getClass().getName(),52715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb14ob();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1014ob14oblusqk34c.R.rethrow($CLV_t2$);}finally{__CLR4_1_1014ob14oblusqk34c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_537.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),52715,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb14ob() throws Exception{try{__CLR4_1_1014ob14oblusqk34c.R.inc(52715);
        __CLR4_1_1014ob14oblusqk34c.R.inc(52716);String text = "{\"value\":2147483649}";
        __CLR4_1_1014ob14oblusqk34c.R.inc(52717);Exception error = null;
        __CLR4_1_1014ob14oblusqk34c.R.inc(52718);try {
            __CLR4_1_1014ob14oblusqk34c.R.inc(52719);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_1014ob14oblusqk34c.R.inc(52720);error = ex;
        }
        __CLR4_1_1014ob14oblusqk34c.R.inc(52721);Assert.assertNotNull(error);
        __CLR4_1_1014ob14oblusqk34c.R.inc(52722);Assert.assertTrue(error.getMessage().contains("field : value"));
    }finally{__CLR4_1_1014ob14oblusqk34c.R.flushNeeded();}}

    public void test_for_issue_private() throws Exception {__CLR4_1_1014ob14oblusqk34c.R.globalSliceStart(getClass().getName(),52723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jzto0114oj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1014ob14oblusqk34c.R.rethrow($CLV_t2$);}finally{__CLR4_1_1014ob14oblusqk34c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_537.test_for_issue_private",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),52723,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jzto0114oj() throws Exception{try{__CLR4_1_1014ob14oblusqk34c.R.inc(52723);
        __CLR4_1_1014ob14oblusqk34c.R.inc(52724);String text = "{\"value\":2147483649}";
        __CLR4_1_1014ob14oblusqk34c.R.inc(52725);Exception error = null;
        __CLR4_1_1014ob14oblusqk34c.R.inc(52726);try {
            __CLR4_1_1014ob14oblusqk34c.R.inc(52727);JSON.parseObject(text, V1.class);
        } catch (JSONException ex) {
            __CLR4_1_1014ob14oblusqk34c.R.inc(52728);error = ex;
        }
        __CLR4_1_1014ob14oblusqk34c.R.inc(52729);Assert.assertNotNull(error);
        __CLR4_1_1014ob14oblusqk34c.R.inc(52730);Assert.assertTrue(error.getMessage().contains("field : value"));
    }finally{__CLR4_1_1014ob14oblusqk34c.R.flushNeeded();}}
    

    public void test_for_issue_method() throws Exception {__CLR4_1_1014ob14oblusqk34c.R.globalSliceStart(getClass().getName(),52731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10meczpt14or();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1014ob14oblusqk34c.R.rethrow($CLV_t2$);}finally{__CLR4_1_1014ob14oblusqk34c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_537.test_for_issue_method",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),52731,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10meczpt14or() throws Exception{try{__CLR4_1_1014ob14oblusqk34c.R.inc(52731);
        __CLR4_1_1014ob14oblusqk34c.R.inc(52732);String text = "{\"value\":2147483649}";
        __CLR4_1_1014ob14oblusqk34c.R.inc(52733);Exception error = null;
        __CLR4_1_1014ob14oblusqk34c.R.inc(52734);try {
            __CLR4_1_1014ob14oblusqk34c.R.inc(52735);JSON.parseObject(text, V2.class);
        } catch (JSONException ex) {
            __CLR4_1_1014ob14oblusqk34c.R.inc(52736);error = ex;
        }
        __CLR4_1_1014ob14oblusqk34c.R.inc(52737);Assert.assertNotNull(error);
        __CLR4_1_1014ob14oblusqk34c.R.inc(52738);Assert.assertTrue(error.getMessage().contains("field : value"));
    }finally{__CLR4_1_1014ob14oblusqk34c.R.flushNeeded();}}

    public static class VO {

        public int value;
    }

    private static class V1 {

        public int value;
    }

    public static class V2 {

        private int value;

        public int getValue() {try{__CLR4_1_1014ob14oblusqk34c.R.inc(52739);
            __CLR4_1_1014ob14oblusqk34c.R.inc(52740);return value;
        }finally{__CLR4_1_1014ob14oblusqk34c.R.flushNeeded();}}

        public void setValue(int value) {try{__CLR4_1_1014ob14oblusqk34c.R.inc(52741);
            __CLR4_1_1014ob14oblusqk34c.R.inc(52742);this.value = value;
        }finally{__CLR4_1_1014ob14oblusqk34c.R.flushNeeded();}}

    }
}
