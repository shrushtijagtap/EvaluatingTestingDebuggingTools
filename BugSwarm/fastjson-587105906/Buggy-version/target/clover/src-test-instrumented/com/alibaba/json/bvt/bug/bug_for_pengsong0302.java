/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class bug_for_pengsong0302 extends TestCase {static class __CLR4_1_1018131813lusqk7h2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,57078,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_1018131813lusqk7h2.R.globalSliceStart(getClass().getName(),57063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21813();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018131813lusqk7h2.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018131813lusqk7h2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.bug_for_pengsong0302.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57063,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21813() throws Exception{try{__CLR4_1_1018131813lusqk7h2.R.inc(57063);
        __CLR4_1_1018131813lusqk7h2.R.inc(57064);Assert.assertEquals("\"a\\u2028b\"", JSON.toJSONString("a\u2028b"));
    }finally{__CLR4_1_1018131813lusqk7h2.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_1_1018131813lusqk7h2.R.globalSliceStart(getClass().getName(),57065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1815();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018131813lusqk7h2.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018131813lusqk7h2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.bug_for_pengsong0302.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57065,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1815() throws Exception{try{__CLR4_1_1018131813lusqk7h2.R.inc(57065);
        __CLR4_1_1018131813lusqk7h2.R.inc(57066);Assert.assertEquals("{\"value\":\"a\\u2028b\"}", JSON.toJSONString(new A("a\u2028b")));
    }finally{__CLR4_1_1018131813lusqk7h2.R.flushNeeded();}}

    public void test_2029() throws Exception {__CLR4_1_1018131813lusqk7h2.R.globalSliceStart(getClass().getName(),57067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104xl3dz1817();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018131813lusqk7h2.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018131813lusqk7h2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.bug_for_pengsong0302.test_2029",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57067,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104xl3dz1817() throws Exception{try{__CLR4_1_1018131813lusqk7h2.R.inc(57067);
        __CLR4_1_1018131813lusqk7h2.R.inc(57068);Assert.assertEquals("\"a\\u2029b\"", JSON.toJSONString("a\u2029b"));
    }finally{__CLR4_1_1018131813lusqk7h2.R.flushNeeded();}}

    public void test_2029_1() throws Exception {__CLR4_1_1018131813lusqk7h2.R.globalSliceStart(getClass().getName(),57069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mp8iob1819();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018131813lusqk7h2.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018131813lusqk7h2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.bug_for_pengsong0302.test_2029_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57069,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mp8iob1819() throws Exception{try{__CLR4_1_1018131813lusqk7h2.R.inc(57069);
        __CLR4_1_1018131813lusqk7h2.R.inc(57070);Assert.assertEquals("{\"value\":\"a\\u2029b\"}", JSON.toJSONString(new A("a\u2029b")));
    }finally{__CLR4_1_1018131813lusqk7h2.R.flushNeeded();}}

    public static class A {

        private String value;

        public A(String value){
            super();__CLR4_1_1018131813lusqk7h2.R.inc(57072);try{__CLR4_1_1018131813lusqk7h2.R.inc(57071);
            __CLR4_1_1018131813lusqk7h2.R.inc(57073);this.value = value;
        }finally{__CLR4_1_1018131813lusqk7h2.R.flushNeeded();}}

        public String getValue() {try{__CLR4_1_1018131813lusqk7h2.R.inc(57074);
            __CLR4_1_1018131813lusqk7h2.R.inc(57075);return value;
        }finally{__CLR4_1_1018131813lusqk7h2.R.flushNeeded();}}

        public void setValue(String value) {try{__CLR4_1_1018131813lusqk7h2.R.inc(57076);
            __CLR4_1_1018131813lusqk7h2.R.inc(57077);this.value = value;
        }finally{__CLR4_1_1018131813lusqk7h2.R.flushNeeded();}}

    }
}
