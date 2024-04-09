/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class NotWriteDefaultValueTest extends TestCase {static class __CLR4_5_21t971t97lusvngfx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,84656,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_byte() throws Exception {__CLR4_5_21t971t97lusvngfx.R.globalSliceStart(getClass().getName(),84571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yzydzi1t97();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t971t97lusvngfx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t971t97lusvngfx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest.test_for_byte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84571,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yzydzi1t97() throws Exception{try{__CLR4_5_21t971t97lusvngfx.R.inc(84571);
        __CLR4_5_21t971t97lusvngfx.R.inc(84572);VO_Byte vo = new VO_Byte();
        __CLR4_5_21t971t97lusvngfx.R.inc(84573);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_5_21t971t97lusvngfx.R.inc(84574);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

    public void test_for_short() throws Exception {__CLR4_5_21t971t97lusvngfx.R.globalSliceStart(getClass().getName(),84575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fuxm0w1t9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t971t97lusvngfx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t971t97lusvngfx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest.test_for_short",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84575,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fuxm0w1t9b() throws Exception{try{__CLR4_5_21t971t97lusvngfx.R.inc(84575);
        __CLR4_5_21t971t97lusvngfx.R.inc(84576);VO_Short vo = new VO_Short();
        __CLR4_5_21t971t97lusvngfx.R.inc(84577);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_5_21t971t97lusvngfx.R.inc(84578);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

    public void test_for_int() throws Exception {__CLR4_5_21t971t97lusvngfx.R.globalSliceStart(getClass().getName(),84579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23pm5il1t9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t971t97lusvngfx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t971t97lusvngfx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest.test_for_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84579,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23pm5il1t9f() throws Exception{try{__CLR4_5_21t971t97lusvngfx.R.inc(84579);
        __CLR4_5_21t971t97lusvngfx.R.inc(84580);VO_Int vo = new VO_Int();
        __CLR4_5_21t971t97lusvngfx.R.inc(84581);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_5_21t971t97lusvngfx.R.inc(84582);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

    public void test_for_long() throws Exception {__CLR4_5_21t971t97lusvngfx.R.globalSliceStart(getClass().getName(),84583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_254hl0m1t9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t971t97lusvngfx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t971t97lusvngfx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest.test_for_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84583,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_254hl0m1t9j() throws Exception{try{__CLR4_5_21t971t97lusvngfx.R.inc(84583);
        __CLR4_5_21t971t97lusvngfx.R.inc(84584);VO_Long vo = new VO_Long();
        __CLR4_5_21t971t97lusvngfx.R.inc(84585);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_5_21t971t97lusvngfx.R.inc(84586);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

    public void test_for_float() throws Exception {__CLR4_5_21t971t97lusvngfx.R.globalSliceStart(getClass().getName(),84587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sx9pgg1t9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t971t97lusvngfx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t971t97lusvngfx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest.test_for_float",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84587,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sx9pgg1t9n() throws Exception{try{__CLR4_5_21t971t97lusvngfx.R.inc(84587);
        __CLR4_5_21t971t97lusvngfx.R.inc(84588);VO_Float vo = new VO_Float();
        __CLR4_5_21t971t97lusvngfx.R.inc(84589);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_5_21t971t97lusvngfx.R.inc(84590);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

    public void test_for_double() throws Exception {__CLR4_5_21t971t97lusvngfx.R.globalSliceStart(getClass().getName(),84591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p2bm1x1t9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t971t97lusvngfx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t971t97lusvngfx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest.test_for_double",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84591,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p2bm1x1t9r() throws Exception{try{__CLR4_5_21t971t97lusvngfx.R.inc(84591);
        __CLR4_5_21t971t97lusvngfx.R.inc(84592);VO_Double vo = new VO_Double();
        __CLR4_5_21t971t97lusvngfx.R.inc(84593);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_5_21t971t97lusvngfx.R.inc(84594);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}
    
    public void test_for_boolean() throws Exception {__CLR4_5_21t971t97lusvngfx.R.globalSliceStart(getClass().getName(),84595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2me3wes1t9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t971t97lusvngfx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t971t97lusvngfx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest.test_for_boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84595,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2me3wes1t9v() throws Exception{try{__CLR4_5_21t971t97lusvngfx.R.inc(84595);
        __CLR4_5_21t971t97lusvngfx.R.inc(84596);VO_Boolean vo = new VO_Boolean();
        __CLR4_5_21t971t97lusvngfx.R.inc(84597);vo.f1 = true;
        __CLR4_5_21t971t97lusvngfx.R.inc(84598);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_5_21t971t97lusvngfx.R.inc(84599);Assert.assertEquals("{\"f1\":true}", text);
    }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

    public static class VO_Byte {

        private byte f0;
        private byte f1;

        public byte getF0() {try{__CLR4_5_21t971t97lusvngfx.R.inc(84600);
            __CLR4_5_21t971t97lusvngfx.R.inc(84601);return f0;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

        public void setF0(byte f0) {try{__CLR4_5_21t971t97lusvngfx.R.inc(84602);
            __CLR4_5_21t971t97lusvngfx.R.inc(84603);this.f0 = f0;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

        public byte getF1() {try{__CLR4_5_21t971t97lusvngfx.R.inc(84604);
            __CLR4_5_21t971t97lusvngfx.R.inc(84605);return f1;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

        public void setF1(byte f1) {try{__CLR4_5_21t971t97lusvngfx.R.inc(84606);
            __CLR4_5_21t971t97lusvngfx.R.inc(84607);this.f1 = f1;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

    }

    public static class VO_Short {

        private short f0;
        private short f1;

        public short getF0() {try{__CLR4_5_21t971t97lusvngfx.R.inc(84608);
            __CLR4_5_21t971t97lusvngfx.R.inc(84609);return f0;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

        public void setF0(short f0) {try{__CLR4_5_21t971t97lusvngfx.R.inc(84610);
            __CLR4_5_21t971t97lusvngfx.R.inc(84611);this.f0 = f0;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

        public short getF1() {try{__CLR4_5_21t971t97lusvngfx.R.inc(84612);
            __CLR4_5_21t971t97lusvngfx.R.inc(84613);return f1;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

        public void setF1(short f1) {try{__CLR4_5_21t971t97lusvngfx.R.inc(84614);
            __CLR4_5_21t971t97lusvngfx.R.inc(84615);this.f1 = f1;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

    }

    public static class VO_Int {

        private int f0;
        private int f1;

        public int getF0() {try{__CLR4_5_21t971t97lusvngfx.R.inc(84616);
            __CLR4_5_21t971t97lusvngfx.R.inc(84617);return f0;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

        public void setF0(int f0) {try{__CLR4_5_21t971t97lusvngfx.R.inc(84618);
            __CLR4_5_21t971t97lusvngfx.R.inc(84619);this.f0 = f0;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

        public int getF1() {try{__CLR4_5_21t971t97lusvngfx.R.inc(84620);
            __CLR4_5_21t971t97lusvngfx.R.inc(84621);return f1;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

        public void setF1(int f1) {try{__CLR4_5_21t971t97lusvngfx.R.inc(84622);
            __CLR4_5_21t971t97lusvngfx.R.inc(84623);this.f1 = f1;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}
    }

    public static class VO_Long {

        private long f0;
        private long f1;

        public long getF0() {try{__CLR4_5_21t971t97lusvngfx.R.inc(84624);
            __CLR4_5_21t971t97lusvngfx.R.inc(84625);return f0;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

        public void setF0(long f0) {try{__CLR4_5_21t971t97lusvngfx.R.inc(84626);
            __CLR4_5_21t971t97lusvngfx.R.inc(84627);this.f0 = f0;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

        public long getF1() {try{__CLR4_5_21t971t97lusvngfx.R.inc(84628);
            __CLR4_5_21t971t97lusvngfx.R.inc(84629);return f1;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

        public void setF1(long f1) {try{__CLR4_5_21t971t97lusvngfx.R.inc(84630);
            __CLR4_5_21t971t97lusvngfx.R.inc(84631);this.f1 = f1;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

    }

    public static class VO_Float {

        private float f0;
        private float f1;

        public float getF0() {try{__CLR4_5_21t971t97lusvngfx.R.inc(84632);
            __CLR4_5_21t971t97lusvngfx.R.inc(84633);return f0;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

        public void setF0(float f0) {try{__CLR4_5_21t971t97lusvngfx.R.inc(84634);
            __CLR4_5_21t971t97lusvngfx.R.inc(84635);this.f0 = f0;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

        public float getF1() {try{__CLR4_5_21t971t97lusvngfx.R.inc(84636);
            __CLR4_5_21t971t97lusvngfx.R.inc(84637);return f1;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

        public void setF1(float f1) {try{__CLR4_5_21t971t97lusvngfx.R.inc(84638);
            __CLR4_5_21t971t97lusvngfx.R.inc(84639);this.f1 = f1;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

    }

    public static class VO_Double {

        private double f0;
        private double f1;

        public double getF0() {try{__CLR4_5_21t971t97lusvngfx.R.inc(84640);
            __CLR4_5_21t971t97lusvngfx.R.inc(84641);return f0;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

        public void setF0(double f0) {try{__CLR4_5_21t971t97lusvngfx.R.inc(84642);
            __CLR4_5_21t971t97lusvngfx.R.inc(84643);this.f0 = f0;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

        public double getF1() {try{__CLR4_5_21t971t97lusvngfx.R.inc(84644);
            __CLR4_5_21t971t97lusvngfx.R.inc(84645);return f1;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

        public void setF1(double f1) {try{__CLR4_5_21t971t97lusvngfx.R.inc(84646);
            __CLR4_5_21t971t97lusvngfx.R.inc(84647);this.f1 = f1;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

    }
    
    public static class VO_Boolean {

        private boolean f0;
        private boolean f1;

        public boolean isF0() {try{__CLR4_5_21t971t97lusvngfx.R.inc(84648);
            __CLR4_5_21t971t97lusvngfx.R.inc(84649);return f0;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

        public void setF0(boolean f0) {try{__CLR4_5_21t971t97lusvngfx.R.inc(84650);
            __CLR4_5_21t971t97lusvngfx.R.inc(84651);this.f0 = f0;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

        public boolean isF1() {try{__CLR4_5_21t971t97lusvngfx.R.inc(84652);
            __CLR4_5_21t971t97lusvngfx.R.inc(84653);return f1;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

        public void setF1(boolean f1) {try{__CLR4_5_21t971t97lusvngfx.R.inc(84654);
            __CLR4_5_21t971t97lusvngfx.R.inc(84655);this.f1 = f1;
        }finally{__CLR4_5_21t971t97lusvngfx.R.flushNeeded();}}

    }
}
