/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class Bug_for_issue_479 extends TestCase {static class __CLR4_1_1015l315l3luszw8lv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,53926,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue_blankinput() throws Exception {__CLR4_1_1015l315l3luszw8lv.R.globalSliceStart(getClass().getName(),53895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hhv5tm15l3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1015l315l3luszw8lv.R.rethrow($CLV_t2$);}finally{__CLR4_1_1015l315l3luszw8lv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_479.test_for_issue_blankinput",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),53895,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hhv5tm15l3() throws Exception{try{__CLR4_1_1015l315l3luszw8lv.R.inc(53895);
        __CLR4_1_1015l315l3luszw8lv.R.inc(53896);VO vo = JSON.parseObject("", VO.class);
        __CLR4_1_1015l315l3luszw8lv.R.inc(53897);Assert.assertNull(vo);
    }finally{__CLR4_1_1015l315l3luszw8lv.R.flushNeeded();}}

    public void test_for_issue() throws Exception {__CLR4_1_1015l315l3luszw8lv.R.globalSliceStart(getClass().getName(),53898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb15l6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1015l315l3luszw8lv.R.rethrow($CLV_t2$);}finally{__CLR4_1_1015l315l3luszw8lv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_479.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),53898,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb15l6() throws Exception{try{__CLR4_1_1015l315l3luszw8lv.R.inc(53898);
        __CLR4_1_1015l315l3luszw8lv.R.inc(53899);VO vo = JSON.parseObject("{\"doubleParam\":\"\",\"floatParam\":\"\",\"intParam\":\"\",\"longParam\":\"\"}",
                                 VO.class);
        __CLR4_1_1015l315l3luszw8lv.R.inc(53900);Assert.assertTrue(vo.doubleParam == 0);
        __CLR4_1_1015l315l3luszw8lv.R.inc(53901);Assert.assertTrue(vo.floatParam == 0);
        __CLR4_1_1015l315l3luszw8lv.R.inc(53902);Assert.assertTrue(vo.intParam == 0);
        __CLR4_1_1015l315l3luszw8lv.R.inc(53903);Assert.assertTrue(vo.longParam == 0);
    }finally{__CLR4_1_1015l315l3luszw8lv.R.flushNeeded();}}

    public void test_for_issue_private() throws Exception {__CLR4_1_1015l315l3luszw8lv.R.globalSliceStart(getClass().getName(),53904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jzto0115lc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1015l315l3luszw8lv.R.rethrow($CLV_t2$);}finally{__CLR4_1_1015l315l3luszw8lv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_479.test_for_issue_private",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),53904,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jzto0115lc() throws Exception{try{__CLR4_1_1015l315l3luszw8lv.R.inc(53904);
        __CLR4_1_1015l315l3luszw8lv.R.inc(53905);V1 vo = JSON.parseObject("{\"doubleParam\":\"\",\"floatParam\":\"\",\"intParam\":\"\",\"longParam\":\"\"}",
                                 V1.class);
        __CLR4_1_1015l315l3luszw8lv.R.inc(53906);Assert.assertTrue(vo.doubleParam == 0);
        __CLR4_1_1015l315l3luszw8lv.R.inc(53907);Assert.assertTrue(vo.floatParam == 0);
        __CLR4_1_1015l315l3luszw8lv.R.inc(53908);Assert.assertTrue(vo.intParam == 0);
        __CLR4_1_1015l315l3luszw8lv.R.inc(53909);Assert.assertTrue(vo.longParam == 0);
    }finally{__CLR4_1_1015l315l3luszw8lv.R.flushNeeded();}}

    public static class VO {

        public long  doubleParam;
        public float floatParam;
        public int   intParam;
        public long  longParam;
    }

    private static class V1 {

        public long  doubleParam;
        public float floatParam;
        public int   intParam;
        public long  longParam;
    }

    public static class V2 {

        private long  doubleParam;
        private float floatParam;
        private int   intParam;
        private long  longParam;

        public long getDoubleParam() {try{__CLR4_1_1015l315l3luszw8lv.R.inc(53910);
            __CLR4_1_1015l315l3luszw8lv.R.inc(53911);return doubleParam;
        }finally{__CLR4_1_1015l315l3luszw8lv.R.flushNeeded();}}

        public void setDoubleParam(long doubleParam) {try{__CLR4_1_1015l315l3luszw8lv.R.inc(53912);
            __CLR4_1_1015l315l3luszw8lv.R.inc(53913);this.doubleParam = doubleParam;
        }finally{__CLR4_1_1015l315l3luszw8lv.R.flushNeeded();}}

        public float getFloatParam() {try{__CLR4_1_1015l315l3luszw8lv.R.inc(53914);
            __CLR4_1_1015l315l3luszw8lv.R.inc(53915);return floatParam;
        }finally{__CLR4_1_1015l315l3luszw8lv.R.flushNeeded();}}

        public void setFloatParam(float floatParam) {try{__CLR4_1_1015l315l3luszw8lv.R.inc(53916);
            __CLR4_1_1015l315l3luszw8lv.R.inc(53917);this.floatParam = floatParam;
        }finally{__CLR4_1_1015l315l3luszw8lv.R.flushNeeded();}}

        public int getIntParam() {try{__CLR4_1_1015l315l3luszw8lv.R.inc(53918);
            __CLR4_1_1015l315l3luszw8lv.R.inc(53919);return intParam;
        }finally{__CLR4_1_1015l315l3luszw8lv.R.flushNeeded();}}

        public void setIntParam(int intParam) {try{__CLR4_1_1015l315l3luszw8lv.R.inc(53920);
            __CLR4_1_1015l315l3luszw8lv.R.inc(53921);this.intParam = intParam;
        }finally{__CLR4_1_1015l315l3luszw8lv.R.flushNeeded();}}

        public long getLongParam() {try{__CLR4_1_1015l315l3luszw8lv.R.inc(53922);
            __CLR4_1_1015l315l3luszw8lv.R.inc(53923);return longParam;
        }finally{__CLR4_1_1015l315l3luszw8lv.R.flushNeeded();}}

        public void setLongParam(long longParam) {try{__CLR4_1_1015l315l3luszw8lv.R.inc(53924);
            __CLR4_1_1015l315l3luszw8lv.R.inc(53925);this.longParam = longParam;
        }finally{__CLR4_1_1015l315l3luszw8lv.R.flushNeeded();}}

    }
}
