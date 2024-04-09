/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Bug_for_leupom_2 extends TestCase {static class __CLR4_1_10154f154flusqk49b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,53316,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_10154f154flusqk49b.R.globalSliceStart(getClass().getName(),53295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp2154f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10154f154flusqk49b.R.rethrow($CLV_t2$);}finally{__CLR4_1_10154f154flusqk49b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_leupom_2.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),53295,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp2154f() throws Exception{try{__CLR4_1_10154f154flusqk49b.R.inc(53295);
        __CLR4_1_10154f154flusqk49b.R.inc(53296);Time time = new Time(1000, TimeUnit.MILLISECONDS);

        __CLR4_1_10154f154flusqk49b.R.inc(53297);String text = JSON.toJSONString(time);

        __CLR4_1_10154f154flusqk49b.R.inc(53298);System.out.println(text);

        __CLR4_1_10154f154flusqk49b.R.inc(53299);Time time2 = JSON.parseObject(text, Time.class);
        
        __CLR4_1_10154f154flusqk49b.R.inc(53300);Assert.assertEquals(time2.getValue(), time.getValue());
        __CLR4_1_10154f154flusqk49b.R.inc(53301);Assert.assertEquals(time2.getUnit(), time.getUnit());
    }finally{__CLR4_1_10154f154flusqk49b.R.flushNeeded();}}

    public static class Time {

        private long     value;
        private TimeUnit unit;

        public Time(){
            super();__CLR4_1_10154f154flusqk49b.R.inc(53303);try{__CLR4_1_10154f154flusqk49b.R.inc(53302);
        }finally{__CLR4_1_10154f154flusqk49b.R.flushNeeded();}}

        public Time(long value, TimeUnit unit){
            super();__CLR4_1_10154f154flusqk49b.R.inc(53305);try{__CLR4_1_10154f154flusqk49b.R.inc(53304);
            __CLR4_1_10154f154flusqk49b.R.inc(53306);this.value = value;
            __CLR4_1_10154f154flusqk49b.R.inc(53307);this.unit = unit;
        }finally{__CLR4_1_10154f154flusqk49b.R.flushNeeded();}}

        public long getValue() {try{__CLR4_1_10154f154flusqk49b.R.inc(53308);
            __CLR4_1_10154f154flusqk49b.R.inc(53309);return value;
        }finally{__CLR4_1_10154f154flusqk49b.R.flushNeeded();}}

        @JSONField(serialzeFeatures={SerializerFeature.WriteEnumUsingToString})
        public TimeUnit getUnit() {try{__CLR4_1_10154f154flusqk49b.R.inc(53310);
            __CLR4_1_10154f154flusqk49b.R.inc(53311);return unit;
        }finally{__CLR4_1_10154f154flusqk49b.R.flushNeeded();}}

        public void setValue(long value) {try{__CLR4_1_10154f154flusqk49b.R.inc(53312);
            __CLR4_1_10154f154flusqk49b.R.inc(53313);this.value = value;
        }finally{__CLR4_1_10154f154flusqk49b.R.flushNeeded();}}

        public void setUnit(TimeUnit unit) {try{__CLR4_1_10154f154flusqk49b.R.inc(53314);
            __CLR4_1_10154f154flusqk49b.R.inc(53315);this.unit = unit;
        }finally{__CLR4_1_10154f154flusqk49b.R.flushNeeded();}}

    }
}
