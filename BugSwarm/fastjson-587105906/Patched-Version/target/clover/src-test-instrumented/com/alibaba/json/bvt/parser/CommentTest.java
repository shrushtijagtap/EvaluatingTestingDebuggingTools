/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import junit.framework.TestCase;

public class CommentTest extends TestCase {static class __CLR4_5_21f891f89lusyjtjj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,66436,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21f891f89lusyjtjj.R.globalSliceStart(getClass().getName(),66393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21f89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f891f89lusyjtjj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f891f89lusyjtjj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66393,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21f89() throws Exception{try{__CLR4_5_21f891f89lusyjtjj.R.inc(66393);
        __CLR4_5_21f891f89lusyjtjj.R.inc(66394);String text = "{ // aa" //
                      + "\n}";
        __CLR4_5_21f891f89lusyjtjj.R.inc(66395);JSONObject obj = (JSONObject) JSON.parse(text);
        __CLR4_5_21f891f89lusyjtjj.R.inc(66396);Assert.assertEquals(0, obj.size());
    }finally{__CLR4_5_21f891f89lusyjtjj.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21f891f89lusyjtjj.R.globalSliceStart(getClass().getName(),66397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1f8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f891f89lusyjtjj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f891f89lusyjtjj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66397,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1f8d() throws Exception{try{__CLR4_5_21f891f89lusyjtjj.R.inc(66397);
        __CLR4_5_21f891f89lusyjtjj.R.inc(66398);String text = "{ // aa" //
                      + "\n\"value\":1001}";
        __CLR4_5_21f891f89lusyjtjj.R.inc(66399);JSONObject obj = (JSONObject) JSON.parse(text);
        __CLR4_5_21f891f89lusyjtjj.R.inc(66400);Assert.assertEquals(1, obj.size());
        __CLR4_5_21f891f89lusyjtjj.R.inc(66401);Assert.assertEquals(1001, obj.get("value"));
    }finally{__CLR4_5_21f891f89lusyjtjj.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21f891f89lusyjtjj.R.globalSliceStart(getClass().getName(),66402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441f8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f891f89lusyjtjj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f891f89lusyjtjj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66402,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441f8i() throws Exception{try{__CLR4_5_21f891f89lusyjtjj.R.inc(66402);
        __CLR4_5_21f891f89lusyjtjj.R.inc(66403);String text = "{ /* aa */ \"value\":1001}";
        __CLR4_5_21f891f89lusyjtjj.R.inc(66404);JSONObject obj = (JSONObject) JSON.parse(text);
        __CLR4_5_21f891f89lusyjtjj.R.inc(66405);Assert.assertEquals(1, obj.size());
        __CLR4_5_21f891f89lusyjtjj.R.inc(66406);Assert.assertEquals(1001, obj.get("value"));
    }finally{__CLR4_5_21f891f89lusyjtjj.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21f891f89lusyjtjj.R.globalSliceStart(getClass().getName(),66407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1f8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f891f89lusyjtjj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f891f89lusyjtjj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66407,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1f8n() throws Exception{try{__CLR4_5_21f891f89lusyjtjj.R.inc(66407);
        __CLR4_5_21f891f89lusyjtjj.R.inc(66408);String text = "{ \"value\":/* aa */1001}";
        __CLR4_5_21f891f89lusyjtjj.R.inc(66409);JSONObject obj = (JSONObject) JSON.parse(text);
        __CLR4_5_21f891f89lusyjtjj.R.inc(66410);Assert.assertEquals(1, obj.size());
        __CLR4_5_21f891f89lusyjtjj.R.inc(66411);Assert.assertEquals(1001, obj.get("value"));
    }finally{__CLR4_5_21f891f89lusyjtjj.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21f891f89lusyjtjj.R.globalSliceStart(getClass().getName(),66412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61f8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f891f89lusyjtjj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f891f89lusyjtjj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66412,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61f8s() throws Exception{try{__CLR4_5_21f891f89lusyjtjj.R.inc(66412);
        __CLR4_5_21f891f89lusyjtjj.R.inc(66413);String text = "{ \"value\":1001/* aa */}";
        __CLR4_5_21f891f89lusyjtjj.R.inc(66414);JSONObject obj = (JSONObject) JSON.parse(text);
        __CLR4_5_21f891f89lusyjtjj.R.inc(66415);Assert.assertEquals(1, obj.size());
        __CLR4_5_21f891f89lusyjtjj.R.inc(66416);Assert.assertEquals(1001, obj.get("value"));
    }finally{__CLR4_5_21f891f89lusyjtjj.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21f891f89lusyjtjj.R.globalSliceStart(getClass().getName(),66417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1f8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f891f89lusyjtjj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f891f89lusyjtjj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66417,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1f8x() throws Exception{try{__CLR4_5_21f891f89lusyjtjj.R.inc(66417);
        __CLR4_5_21f891f89lusyjtjj.R.inc(66418);Exception error = null;
        __CLR4_5_21f891f89lusyjtjj.R.inc(66419);try {
            __CLR4_5_21f891f89lusyjtjj.R.inc(66420);String text = "{ \"value\":1001/ * aa */}";
            __CLR4_5_21f891f89lusyjtjj.R.inc(66421);JSON.parse(text);
        } catch (JSONException ex) {
            __CLR4_5_21f891f89lusyjtjj.R.inc(66422);error = ex;
        }
        __CLR4_5_21f891f89lusyjtjj.R.inc(66423);Assert.assertNotNull(error);
    }finally{__CLR4_5_21f891f89lusyjtjj.R.flushNeeded();}}
    
    public void test_6() throws Exception {__CLR4_5_21f891f89lusyjtjj.R.globalSliceStart(getClass().getName(),66424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81f94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f891f89lusyjtjj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f891f89lusyjtjj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66424,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81f94() throws Exception{try{__CLR4_5_21f891f89lusyjtjj.R.inc(66424);
        __CLR4_5_21f891f89lusyjtjj.R.inc(66425);String text = "{'a':1, 'b':2 /***/ }";
        __CLR4_5_21f891f89lusyjtjj.R.inc(66426);JSONObject obj = (JSONObject) JSON.parse(text);
        __CLR4_5_21f891f89lusyjtjj.R.inc(66427);Assert.assertEquals(2, obj.size());
        __CLR4_5_21f891f89lusyjtjj.R.inc(66428);Assert.assertEquals(1, obj.get("a"));
        __CLR4_5_21f891f89lusyjtjj.R.inc(66429);Assert.assertEquals(2, obj.get("b"));
    }finally{__CLR4_5_21f891f89lusyjtjj.R.flushNeeded();}}
    
    public void test_7() throws Exception {__CLR4_5_21f891f89lusyjtjj.R.globalSliceStart(getClass().getName(),66430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1f9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21f891f89lusyjtjj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21f891f89lusyjtjj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66430,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1f9a() throws Exception{try{__CLR4_5_21f891f89lusyjtjj.R.inc(66430);
        __CLR4_5_21f891f89lusyjtjj.R.inc(66431);String text = "{'a':1, 'b':2 /**/ }";
        __CLR4_5_21f891f89lusyjtjj.R.inc(66432);JSONObject obj = (JSONObject) JSON.parse(text);
        __CLR4_5_21f891f89lusyjtjj.R.inc(66433);Assert.assertEquals(2, obj.size());
        __CLR4_5_21f891f89lusyjtjj.R.inc(66434);Assert.assertEquals(1, obj.get("a"));
        __CLR4_5_21f891f89lusyjtjj.R.inc(66435);Assert.assertEquals(2, obj.get("b"));
    }finally{__CLR4_5_21f891f89lusyjtjj.R.flushNeeded();}}
}
