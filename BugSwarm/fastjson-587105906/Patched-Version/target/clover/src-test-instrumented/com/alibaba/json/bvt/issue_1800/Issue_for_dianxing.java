/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1800;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

public class Issue_for_dianxing extends TestCase {static class __CLR4_5_21cm41cm4lusyjt1r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,63033,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_5_21cm41cm4lusyjt1r.R.globalSliceStart(getClass().getName(),63004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21cm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cm41cm4lusyjt1r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cm41cm4lusyjt1r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1800.Issue_for_dianxing.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63004,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21cm4() throws Exception{try{__CLR4_5_21cm41cm4lusyjt1r.R.inc(63004);
        __CLR4_5_21cm41cm4lusyjt1r.R.inc(63005);String s = "{\"alarmLevel\":null,\"error\":null,\"errorCount\":0,\"maxAlarmCount\":10,\"warn\":null,"
                + "\"warnCount\":0}";
        __CLR4_5_21cm41cm4lusyjt1r.R.inc(63006);TopAlarm b = JSON.parseObject(s, TopAlarm.class);
        __CLR4_5_21cm41cm4lusyjt1r.R.inc(63007);System.out.println(JSON.toJSONString(b));
    }finally{__CLR4_5_21cm41cm4lusyjt1r.R.flushNeeded();}}

    public static class TopAlarm {

        private Double error;                                  //\u4e3anull\u8868\u793a\u4e0d\u62a5\u8b66
        private int errorCount;
        private Double warn;                                   //\u4e3anull\u8868\u793a\u4e0d\u62a5\u8b66
        private int warnCount;
        private Integer alarmLevel;
        private int maxAlarmCount = 10;

        public TopAlarm() {try{__CLR4_5_21cm41cm4lusyjt1r.R.inc(63008);
        }finally{__CLR4_5_21cm41cm4lusyjt1r.R.flushNeeded();}}

        public Double getError() {try{__CLR4_5_21cm41cm4lusyjt1r.R.inc(63009);
            __CLR4_5_21cm41cm4lusyjt1r.R.inc(63010);return error;
        }finally{__CLR4_5_21cm41cm4lusyjt1r.R.flushNeeded();}}

        public void setError(Double error) {try{__CLR4_5_21cm41cm4lusyjt1r.R.inc(63011);
            __CLR4_5_21cm41cm4lusyjt1r.R.inc(63012);this.error = error;
        }finally{__CLR4_5_21cm41cm4lusyjt1r.R.flushNeeded();}}

        public Double getWarn() {try{__CLR4_5_21cm41cm4lusyjt1r.R.inc(63013);
            __CLR4_5_21cm41cm4lusyjt1r.R.inc(63014);return warn;
        }finally{__CLR4_5_21cm41cm4lusyjt1r.R.flushNeeded();}}

        public void setWarn(Double warn) {try{__CLR4_5_21cm41cm4lusyjt1r.R.inc(63015);
            __CLR4_5_21cm41cm4lusyjt1r.R.inc(63016);this.warn = warn;
        }finally{__CLR4_5_21cm41cm4lusyjt1r.R.flushNeeded();}}

        public int getErrorCount() {try{__CLR4_5_21cm41cm4lusyjt1r.R.inc(63017);
            __CLR4_5_21cm41cm4lusyjt1r.R.inc(63018);return errorCount;
        }finally{__CLR4_5_21cm41cm4lusyjt1r.R.flushNeeded();}}

        public void setErrorCount(int errorCount) {try{__CLR4_5_21cm41cm4lusyjt1r.R.inc(63019);
            __CLR4_5_21cm41cm4lusyjt1r.R.inc(63020);this.errorCount = errorCount;
        }finally{__CLR4_5_21cm41cm4lusyjt1r.R.flushNeeded();}}

        public int getWarnCount() {try{__CLR4_5_21cm41cm4lusyjt1r.R.inc(63021);
            __CLR4_5_21cm41cm4lusyjt1r.R.inc(63022);return warnCount;
        }finally{__CLR4_5_21cm41cm4lusyjt1r.R.flushNeeded();}}

        public void setWarnCount(int warnCount) {try{__CLR4_5_21cm41cm4lusyjt1r.R.inc(63023);
            __CLR4_5_21cm41cm4lusyjt1r.R.inc(63024);this.warnCount = warnCount;
        }finally{__CLR4_5_21cm41cm4lusyjt1r.R.flushNeeded();}}

        public Integer getAlarmLevel() {try{__CLR4_5_21cm41cm4lusyjt1r.R.inc(63025);
            __CLR4_5_21cm41cm4lusyjt1r.R.inc(63026);return alarmLevel;
        }finally{__CLR4_5_21cm41cm4lusyjt1r.R.flushNeeded();}}

        public void setAlarmLevel(Integer alarmLevel) {try{__CLR4_5_21cm41cm4lusyjt1r.R.inc(63027);
            __CLR4_5_21cm41cm4lusyjt1r.R.inc(63028);this.alarmLevel = alarmLevel;
        }finally{__CLR4_5_21cm41cm4lusyjt1r.R.flushNeeded();}}

        public int getMaxAlarmCount() {try{__CLR4_5_21cm41cm4lusyjt1r.R.inc(63029);
            __CLR4_5_21cm41cm4lusyjt1r.R.inc(63030);return maxAlarmCount;
        }finally{__CLR4_5_21cm41cm4lusyjt1r.R.flushNeeded();}}

        public void setMaxAlarmCount(int maxAlarmCount) {try{__CLR4_5_21cm41cm4lusyjt1r.R.inc(63031);
            __CLR4_5_21cm41cm4lusyjt1r.R.inc(63032);this.maxAlarmCount = maxAlarmCount;
        }finally{__CLR4_5_21cm41cm4lusyjt1r.R.flushNeeded();}}

    }
}
