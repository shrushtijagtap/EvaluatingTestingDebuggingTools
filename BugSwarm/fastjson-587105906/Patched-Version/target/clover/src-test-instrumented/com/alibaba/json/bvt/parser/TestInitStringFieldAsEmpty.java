/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;

public class TestInitStringFieldAsEmpty extends TestCase {static class __CLR4_5_21jhb1jhblusvndll{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,71918,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_private() throws Exception {__CLR4_5_21jhb1jhblusvndll.R.globalSliceStart(getClass().getName(),71903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o69xgj1jhb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jhb1jhblusvndll.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jhb1jhblusvndll.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TestInitStringFieldAsEmpty.test_private",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71903,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o69xgj1jhb() throws Exception{try{__CLR4_5_21jhb1jhblusvndll.R.inc(71903);
        __CLR4_5_21jhb1jhblusvndll.R.inc(71904);VO1 vo1 = JSON.parseObject("{}", VO1.class, Feature.InitStringFieldAsEmpty);
        __CLR4_5_21jhb1jhblusvndll.R.inc(71905);Assert.assertEquals("", vo1.getValue());
    }finally{__CLR4_5_21jhb1jhblusvndll.R.flushNeeded();}}

    public void test_public() throws Exception {__CLR4_5_21jhb1jhblusvndll.R.globalSliceStart(getClass().getName(),71906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27b2uv71jhe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jhb1jhblusvndll.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jhb1jhblusvndll.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TestInitStringFieldAsEmpty.test_public",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71906,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27b2uv71jhe() throws Exception{try{__CLR4_5_21jhb1jhblusvndll.R.inc(71906);
        __CLR4_5_21jhb1jhblusvndll.R.inc(71907);VO2 vo2 = JSON.parseObject("{}", VO2.class, Feature.InitStringFieldAsEmpty);
        __CLR4_5_21jhb1jhblusvndll.R.inc(71908);Assert.assertEquals("", vo2.getValue());
    }finally{__CLR4_5_21jhb1jhblusvndll.R.flushNeeded();}}
    
    private static class VO1 {

        private String value;

        public String getValue() {try{__CLR4_5_21jhb1jhblusvndll.R.inc(71909);
            __CLR4_5_21jhb1jhblusvndll.R.inc(71910);return value;
        }finally{__CLR4_5_21jhb1jhblusvndll.R.flushNeeded();}}

        public void setValue(String value) {try{__CLR4_5_21jhb1jhblusvndll.R.inc(71911);
            __CLR4_5_21jhb1jhblusvndll.R.inc(71912);this.value = value;
        }finally{__CLR4_5_21jhb1jhblusvndll.R.flushNeeded();}}
    }
    
    public static class VO2 {

        private String value;
        
        public VO2() {try{__CLR4_5_21jhb1jhblusvndll.R.inc(71913);
            
        }finally{__CLR4_5_21jhb1jhblusvndll.R.flushNeeded();}}

        public String getValue() {try{__CLR4_5_21jhb1jhblusvndll.R.inc(71914);
            __CLR4_5_21jhb1jhblusvndll.R.inc(71915);return value;
        }finally{__CLR4_5_21jhb1jhblusvndll.R.flushNeeded();}}

        public void setValue(String value) {try{__CLR4_5_21jhb1jhblusvndll.R.inc(71916);
            __CLR4_5_21jhb1jhblusvndll.R.inc(71917);this.value = value;
        }finally{__CLR4_5_21jhb1jhblusvndll.R.flushNeeded();}}
    }
}
