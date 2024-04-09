/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class Issue199 extends TestCase {static class __CLR4_5_217ry17rylusvn7t8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,56768,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_5_217ry17rylusvn7t8.R.globalSliceStart(getClass().getName(),56734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb17ry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217ry17rylusvn7t8.R.rethrow($CLV_t2$);}finally{__CLR4_5_217ry17rylusvn7t8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue199.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56734,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb17ry() throws Exception{try{__CLR4_5_217ry17rylusvn7t8.R.inc(56734);
        __CLR4_5_217ry17rylusvn7t8.R.inc(56735);ConsumeStatus vo = new ConsumeStatus();
        __CLR4_5_217ry17rylusvn7t8.R.inc(56736);vo.pullRT = 101.01D;
        __CLR4_5_217ry17rylusvn7t8.R.inc(56737);vo.pullTPS = 102.01D;
        __CLR4_5_217ry17rylusvn7t8.R.inc(56738);vo.consumeRT = 103.01D;
        __CLR4_5_217ry17rylusvn7t8.R.inc(56739);vo.consumeOKTPS = 104.01D;
        __CLR4_5_217ry17rylusvn7t8.R.inc(56740);vo.consumeFailedTPS = 105.01D;

        __CLR4_5_217ry17rylusvn7t8.R.inc(56741);String text = JSON.toJSONString(vo);
        __CLR4_5_217ry17rylusvn7t8.R.inc(56742);ConsumeStatus vo1 = JSON.parseObject(text, ConsumeStatus.class);
        __CLR4_5_217ry17rylusvn7t8.R.inc(56743);Assert.assertTrue(vo.pullRT == vo1.pullRT);
        __CLR4_5_217ry17rylusvn7t8.R.inc(56744);Assert.assertTrue(vo.pullTPS == vo1.pullTPS);
        __CLR4_5_217ry17rylusvn7t8.R.inc(56745);Assert.assertTrue(vo.consumeRT == vo1.consumeRT);
        __CLR4_5_217ry17rylusvn7t8.R.inc(56746);Assert.assertTrue(vo.consumeOKTPS == vo1.consumeOKTPS);
        __CLR4_5_217ry17rylusvn7t8.R.inc(56747);Assert.assertTrue(vo.consumeFailedTPS == vo1.consumeFailedTPS);
    }finally{__CLR4_5_217ry17rylusvn7t8.R.flushNeeded();}}

    public static class ConsumeStatus {

        private double pullRT;
        private double pullTPS;
        private double consumeRT;
        private double consumeOKTPS;
        private double consumeFailedTPS;

        public double getPullRT() {try{__CLR4_5_217ry17rylusvn7t8.R.inc(56748);
            __CLR4_5_217ry17rylusvn7t8.R.inc(56749);return pullRT;
        }finally{__CLR4_5_217ry17rylusvn7t8.R.flushNeeded();}}

        public void setPullRT(double pullRT) {try{__CLR4_5_217ry17rylusvn7t8.R.inc(56750);
            __CLR4_5_217ry17rylusvn7t8.R.inc(56751);this.pullRT = pullRT;
        }finally{__CLR4_5_217ry17rylusvn7t8.R.flushNeeded();}}

        public double getPullTPS() {try{__CLR4_5_217ry17rylusvn7t8.R.inc(56752);
            __CLR4_5_217ry17rylusvn7t8.R.inc(56753);return pullTPS;
        }finally{__CLR4_5_217ry17rylusvn7t8.R.flushNeeded();}}

        public void setPullTPS(double pullTPS) {try{__CLR4_5_217ry17rylusvn7t8.R.inc(56754);
            __CLR4_5_217ry17rylusvn7t8.R.inc(56755);this.pullTPS = pullTPS;
        }finally{__CLR4_5_217ry17rylusvn7t8.R.flushNeeded();}}

        public double getConsumeRT() {try{__CLR4_5_217ry17rylusvn7t8.R.inc(56756);
            __CLR4_5_217ry17rylusvn7t8.R.inc(56757);return consumeRT;
        }finally{__CLR4_5_217ry17rylusvn7t8.R.flushNeeded();}}

        public void setConsumeRT(double consumeRT) {try{__CLR4_5_217ry17rylusvn7t8.R.inc(56758);
            __CLR4_5_217ry17rylusvn7t8.R.inc(56759);this.consumeRT = consumeRT;
        }finally{__CLR4_5_217ry17rylusvn7t8.R.flushNeeded();}}

        public double getConsumeOKTPS() {try{__CLR4_5_217ry17rylusvn7t8.R.inc(56760);
            __CLR4_5_217ry17rylusvn7t8.R.inc(56761);return consumeOKTPS;
        }finally{__CLR4_5_217ry17rylusvn7t8.R.flushNeeded();}}

        public void setConsumeOKTPS(double consumeOKTPS) {try{__CLR4_5_217ry17rylusvn7t8.R.inc(56762);
            __CLR4_5_217ry17rylusvn7t8.R.inc(56763);this.consumeOKTPS = consumeOKTPS;
        }finally{__CLR4_5_217ry17rylusvn7t8.R.flushNeeded();}}

        public double getConsumeFailedTPS() {try{__CLR4_5_217ry17rylusvn7t8.R.inc(56764);
            __CLR4_5_217ry17rylusvn7t8.R.inc(56765);return consumeFailedTPS;
        }finally{__CLR4_5_217ry17rylusvn7t8.R.flushNeeded();}}

        public void setConsumeFailedTPS(double consumeFailedTPS) {try{__CLR4_5_217ry17rylusvn7t8.R.inc(56766);
            __CLR4_5_217ry17rylusvn7t8.R.inc(56767);this.consumeFailedTPS = consumeFailedTPS;
        }finally{__CLR4_5_217ry17rylusvn7t8.R.flushNeeded();}}
    }
}
