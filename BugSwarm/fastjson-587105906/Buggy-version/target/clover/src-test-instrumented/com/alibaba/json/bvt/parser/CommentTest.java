/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import junit.framework.TestCase;

public class CommentTest extends TestCase {static class __CLR4_1_101g6s1g6sluszwc68{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,67679,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101g6s1g6sluszwc68.R.globalSliceStart(getClass().getName(),67636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21g6s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g6s1g6sluszwc68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g6s1g6sluszwc68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67636,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21g6s() throws Exception{try{__CLR4_1_101g6s1g6sluszwc68.R.inc(67636);
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67637);String text = "{ // aa" //
                      + "\n}";
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67638);JSONObject obj = (JSONObject) JSON.parse(text);
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67639);Assert.assertEquals(0, obj.size());
    }finally{__CLR4_1_101g6s1g6sluszwc68.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101g6s1g6sluszwc68.R.globalSliceStart(getClass().getName(),67640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1g6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g6s1g6sluszwc68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g6s1g6sluszwc68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67640,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1g6w() throws Exception{try{__CLR4_1_101g6s1g6sluszwc68.R.inc(67640);
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67641);String text = "{ // aa" //
                      + "\n\"value\":1001}";
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67642);JSONObject obj = (JSONObject) JSON.parse(text);
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67643);Assert.assertEquals(1, obj.size());
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67644);Assert.assertEquals(1001, obj.get("value"));
    }finally{__CLR4_1_101g6s1g6sluszwc68.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101g6s1g6sluszwc68.R.globalSliceStart(getClass().getName(),67645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441g71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g6s1g6sluszwc68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g6s1g6sluszwc68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67645,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441g71() throws Exception{try{__CLR4_1_101g6s1g6sluszwc68.R.inc(67645);
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67646);String text = "{ /* aa */ \"value\":1001}";
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67647);JSONObject obj = (JSONObject) JSON.parse(text);
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67648);Assert.assertEquals(1, obj.size());
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67649);Assert.assertEquals(1001, obj.get("value"));
    }finally{__CLR4_1_101g6s1g6sluszwc68.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101g6s1g6sluszwc68.R.globalSliceStart(getClass().getName(),67650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1g76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g6s1g6sluszwc68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g6s1g6sluszwc68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67650,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1g76() throws Exception{try{__CLR4_1_101g6s1g6sluszwc68.R.inc(67650);
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67651);String text = "{ \"value\":/* aa */1001}";
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67652);JSONObject obj = (JSONObject) JSON.parse(text);
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67653);Assert.assertEquals(1, obj.size());
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67654);Assert.assertEquals(1001, obj.get("value"));
    }finally{__CLR4_1_101g6s1g6sluszwc68.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101g6s1g6sluszwc68.R.globalSliceStart(getClass().getName(),67655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61g7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g6s1g6sluszwc68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g6s1g6sluszwc68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67655,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61g7b() throws Exception{try{__CLR4_1_101g6s1g6sluszwc68.R.inc(67655);
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67656);String text = "{ \"value\":1001/* aa */}";
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67657);JSONObject obj = (JSONObject) JSON.parse(text);
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67658);Assert.assertEquals(1, obj.size());
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67659);Assert.assertEquals(1001, obj.get("value"));
    }finally{__CLR4_1_101g6s1g6sluszwc68.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101g6s1g6sluszwc68.R.globalSliceStart(getClass().getName(),67660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1g7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g6s1g6sluszwc68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g6s1g6sluszwc68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67660,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1g7g() throws Exception{try{__CLR4_1_101g6s1g6sluszwc68.R.inc(67660);
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67661);Exception error = null;
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67662);try {
            __CLR4_1_101g6s1g6sluszwc68.R.inc(67663);String text = "{ \"value\":1001/ * aa */}";
            __CLR4_1_101g6s1g6sluszwc68.R.inc(67664);JSON.parse(text);
        } catch (JSONException ex) {
            __CLR4_1_101g6s1g6sluszwc68.R.inc(67665);error = ex;
        }
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67666);Assert.assertNotNull(error);
    }finally{__CLR4_1_101g6s1g6sluszwc68.R.flushNeeded();}}
    
    public void test_6() throws Exception {__CLR4_1_101g6s1g6sluszwc68.R.globalSliceStart(getClass().getName(),67667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81g7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g6s1g6sluszwc68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g6s1g6sluszwc68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67667,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81g7n() throws Exception{try{__CLR4_1_101g6s1g6sluszwc68.R.inc(67667);
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67668);String text = "{'a':1, 'b':2 /***/ }";
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67669);JSONObject obj = (JSONObject) JSON.parse(text);
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67670);Assert.assertEquals(2, obj.size());
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67671);Assert.assertEquals(1, obj.get("a"));
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67672);Assert.assertEquals(2, obj.get("b"));
    }finally{__CLR4_1_101g6s1g6sluszwc68.R.flushNeeded();}}
    
    public void test_7() throws Exception {__CLR4_1_101g6s1g6sluszwc68.R.globalSliceStart(getClass().getName(),67673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1g7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101g6s1g6sluszwc68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101g6s1g6sluszwc68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.CommentTest.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67673,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1g7t() throws Exception{try{__CLR4_1_101g6s1g6sluszwc68.R.inc(67673);
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67674);String text = "{'a':1, 'b':2 /**/ }";
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67675);JSONObject obj = (JSONObject) JSON.parse(text);
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67676);Assert.assertEquals(2, obj.size());
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67677);Assert.assertEquals(1, obj.get("a"));
        __CLR4_1_101g6s1g6sluszwc68.R.inc(67678);Assert.assertEquals(2, obj.get("b"));
    }finally{__CLR4_1_101g6s1g6sluszwc68.R.flushNeeded();}}
}
