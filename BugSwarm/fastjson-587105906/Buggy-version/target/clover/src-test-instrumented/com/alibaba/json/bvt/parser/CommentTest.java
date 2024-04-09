/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import junit.framework.TestCase;

public class CommentTest extends TestCase {static class __CLR4_1_101f8k1f8klusqkcvv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,66447,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101f8k1f8klusqkcvv.R.globalSliceStart(getClass().getName(),66404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21f8k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f8k1f8klusqkcvv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f8k1f8klusqkcvv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66404,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21f8k() throws Exception{try{__CLR4_1_101f8k1f8klusqkcvv.R.inc(66404);
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66405);String text = "{ // aa" //
                      + "\n}";
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66406);JSONObject obj = (JSONObject) JSON.parse(text);
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66407);Assert.assertEquals(0, obj.size());
    }finally{__CLR4_1_101f8k1f8klusqkcvv.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101f8k1f8klusqkcvv.R.globalSliceStart(getClass().getName(),66408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1f8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f8k1f8klusqkcvv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f8k1f8klusqkcvv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66408,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1f8o() throws Exception{try{__CLR4_1_101f8k1f8klusqkcvv.R.inc(66408);
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66409);String text = "{ // aa" //
                      + "\n\"value\":1001}";
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66410);JSONObject obj = (JSONObject) JSON.parse(text);
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66411);Assert.assertEquals(1, obj.size());
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66412);Assert.assertEquals(1001, obj.get("value"));
    }finally{__CLR4_1_101f8k1f8klusqkcvv.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101f8k1f8klusqkcvv.R.globalSliceStart(getClass().getName(),66413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441f8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f8k1f8klusqkcvv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f8k1f8klusqkcvv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66413,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441f8t() throws Exception{try{__CLR4_1_101f8k1f8klusqkcvv.R.inc(66413);
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66414);String text = "{ /* aa */ \"value\":1001}";
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66415);JSONObject obj = (JSONObject) JSON.parse(text);
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66416);Assert.assertEquals(1, obj.size());
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66417);Assert.assertEquals(1001, obj.get("value"));
    }finally{__CLR4_1_101f8k1f8klusqkcvv.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101f8k1f8klusqkcvv.R.globalSliceStart(getClass().getName(),66418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1f8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f8k1f8klusqkcvv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f8k1f8klusqkcvv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66418,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1f8y() throws Exception{try{__CLR4_1_101f8k1f8klusqkcvv.R.inc(66418);
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66419);String text = "{ \"value\":/* aa */1001}";
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66420);JSONObject obj = (JSONObject) JSON.parse(text);
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66421);Assert.assertEquals(1, obj.size());
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66422);Assert.assertEquals(1001, obj.get("value"));
    }finally{__CLR4_1_101f8k1f8klusqkcvv.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101f8k1f8klusqkcvv.R.globalSliceStart(getClass().getName(),66423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61f93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f8k1f8klusqkcvv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f8k1f8klusqkcvv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66423,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61f93() throws Exception{try{__CLR4_1_101f8k1f8klusqkcvv.R.inc(66423);
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66424);String text = "{ \"value\":1001/* aa */}";
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66425);JSONObject obj = (JSONObject) JSON.parse(text);
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66426);Assert.assertEquals(1, obj.size());
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66427);Assert.assertEquals(1001, obj.get("value"));
    }finally{__CLR4_1_101f8k1f8klusqkcvv.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101f8k1f8klusqkcvv.R.globalSliceStart(getClass().getName(),66428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1f98();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f8k1f8klusqkcvv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f8k1f8klusqkcvv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66428,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1f98() throws Exception{try{__CLR4_1_101f8k1f8klusqkcvv.R.inc(66428);
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66429);Exception error = null;
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66430);try {
            __CLR4_1_101f8k1f8klusqkcvv.R.inc(66431);String text = "{ \"value\":1001/ * aa */}";
            __CLR4_1_101f8k1f8klusqkcvv.R.inc(66432);JSON.parse(text);
        } catch (JSONException ex) {
            __CLR4_1_101f8k1f8klusqkcvv.R.inc(66433);error = ex;
        }
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66434);Assert.assertNotNull(error);
    }finally{__CLR4_1_101f8k1f8klusqkcvv.R.flushNeeded();}}
    
    public void test_6() throws Exception {__CLR4_1_101f8k1f8klusqkcvv.R.globalSliceStart(getClass().getName(),66435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81f9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f8k1f8klusqkcvv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f8k1f8klusqkcvv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66435,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81f9f() throws Exception{try{__CLR4_1_101f8k1f8klusqkcvv.R.inc(66435);
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66436);String text = "{'a':1, 'b':2 /***/ }";
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66437);JSONObject obj = (JSONObject) JSON.parse(text);
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66438);Assert.assertEquals(2, obj.size());
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66439);Assert.assertEquals(1, obj.get("a"));
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66440);Assert.assertEquals(2, obj.get("b"));
    }finally{__CLR4_1_101f8k1f8klusqkcvv.R.flushNeeded();}}
    
    public void test_7() throws Exception {__CLR4_1_101f8k1f8klusqkcvv.R.globalSliceStart(getClass().getName(),66441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1f9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f8k1f8klusqkcvv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f8k1f8klusqkcvv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66441,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1f9l() throws Exception{try{__CLR4_1_101f8k1f8klusqkcvv.R.inc(66441);
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66442);String text = "{'a':1, 'b':2 /**/ }";
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66443);JSONObject obj = (JSONObject) JSON.parse(text);
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66444);Assert.assertEquals(2, obj.size());
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66445);Assert.assertEquals(1, obj.get("a"));
        __CLR4_1_101f8k1f8klusqkcvv.R.inc(66446);Assert.assertEquals(2, obj.get("b"));
    }finally{__CLR4_1_101f8k1f8klusqkcvv.R.flushNeeded();}}
}
