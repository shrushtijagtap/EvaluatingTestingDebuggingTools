/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class bug_for_pengsong0302 extends TestCase {static class __CLR4_5_218z018z0lusvn8ul{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,58299,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_218z018z0lusvn8ul.R.globalSliceStart(getClass().getName(),58284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp218z0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218z018z0lusvn8ul.R.rethrow($CLV_t2$);}finally{__CLR4_5_218z018z0lusvn8ul.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.bug_for_pengsong0302.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58284,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp218z0() throws Exception{try{__CLR4_5_218z018z0lusvn8ul.R.inc(58284);
        __CLR4_5_218z018z0lusvn8ul.R.inc(58285);Assert.assertEquals("\"a\\u2028b\"", JSON.toJSONString("a\u2028b"));
    }finally{__CLR4_5_218z018z0lusvn8ul.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_5_218z018z0lusvn8ul.R.globalSliceStart(getClass().getName(),58286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl18z2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218z018z0lusvn8ul.R.rethrow($CLV_t2$);}finally{__CLR4_5_218z018z0lusvn8ul.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.bug_for_pengsong0302.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58286,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl18z2() throws Exception{try{__CLR4_5_218z018z0lusvn8ul.R.inc(58286);
        __CLR4_5_218z018z0lusvn8ul.R.inc(58287);Assert.assertEquals("{\"value\":\"a\\u2028b\"}", JSON.toJSONString(new A("a\u2028b")));
    }finally{__CLR4_5_218z018z0lusvn8ul.R.flushNeeded();}}

    public void test_2029() throws Exception {__CLR4_5_218z018z0lusvn8ul.R.globalSliceStart(getClass().getName(),58288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24xl3dz18z4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218z018z0lusvn8ul.R.rethrow($CLV_t2$);}finally{__CLR4_5_218z018z0lusvn8ul.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.bug_for_pengsong0302.test_2029",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58288,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24xl3dz18z4() throws Exception{try{__CLR4_5_218z018z0lusvn8ul.R.inc(58288);
        __CLR4_5_218z018z0lusvn8ul.R.inc(58289);Assert.assertEquals("\"a\\u2029b\"", JSON.toJSONString("a\u2029b"));
    }finally{__CLR4_5_218z018z0lusvn8ul.R.flushNeeded();}}

    public void test_2029_1() throws Exception {__CLR4_5_218z018z0lusvn8ul.R.globalSliceStart(getClass().getName(),58290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mp8iob18z6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218z018z0lusvn8ul.R.rethrow($CLV_t2$);}finally{__CLR4_5_218z018z0lusvn8ul.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.bug_for_pengsong0302.test_2029_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58290,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mp8iob18z6() throws Exception{try{__CLR4_5_218z018z0lusvn8ul.R.inc(58290);
        __CLR4_5_218z018z0lusvn8ul.R.inc(58291);Assert.assertEquals("{\"value\":\"a\\u2029b\"}", JSON.toJSONString(new A("a\u2029b")));
    }finally{__CLR4_5_218z018z0lusvn8ul.R.flushNeeded();}}

    public static class A {

        private String value;

        public A(String value){
            super();__CLR4_5_218z018z0lusvn8ul.R.inc(58293);try{__CLR4_5_218z018z0lusvn8ul.R.inc(58292);
            __CLR4_5_218z018z0lusvn8ul.R.inc(58294);this.value = value;
        }finally{__CLR4_5_218z018z0lusvn8ul.R.flushNeeded();}}

        public String getValue() {try{__CLR4_5_218z018z0lusvn8ul.R.inc(58295);
            __CLR4_5_218z018z0lusvn8ul.R.inc(58296);return value;
        }finally{__CLR4_5_218z018z0lusvn8ul.R.flushNeeded();}}

        public void setValue(String value) {try{__CLR4_5_218z018z0lusvn8ul.R.inc(58297);
            __CLR4_5_218z018z0lusvn8ul.R.inc(58298);this.value = value;
        }finally{__CLR4_5_218z018z0lusvn8ul.R.flushNeeded();}}

    }
}
