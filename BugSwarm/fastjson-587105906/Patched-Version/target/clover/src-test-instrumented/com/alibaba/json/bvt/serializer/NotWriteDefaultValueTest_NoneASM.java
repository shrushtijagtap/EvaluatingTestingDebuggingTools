/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class NotWriteDefaultValueTest_NoneASM extends TestCase {static class __CLR4_5_21sdc1sdclusyjuzs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,83509,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_byte() throws Exception {__CLR4_5_21sdc1sdclusyjuzs.R.globalSliceStart(getClass().getName(),83424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yzydzi1sdc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sdc1sdclusyjuzs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sdc1sdclusyjuzs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest_NoneASM.test_for_byte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83424,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yzydzi1sdc() throws Exception{try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83424);
        __CLR4_5_21sdc1sdclusyjuzs.R.inc(83425);VO_Byte vo = new VO_Byte();
        __CLR4_5_21sdc1sdclusyjuzs.R.inc(83426);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_5_21sdc1sdclusyjuzs.R.inc(83427);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

    public void test_for_short() throws Exception {__CLR4_5_21sdc1sdclusyjuzs.R.globalSliceStart(getClass().getName(),83428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fuxm0w1sdg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sdc1sdclusyjuzs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sdc1sdclusyjuzs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest_NoneASM.test_for_short",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83428,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fuxm0w1sdg() throws Exception{try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83428);
        __CLR4_5_21sdc1sdclusyjuzs.R.inc(83429);VO_Short vo = new VO_Short();
        __CLR4_5_21sdc1sdclusyjuzs.R.inc(83430);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_5_21sdc1sdclusyjuzs.R.inc(83431);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

    public void test_for_int() throws Exception {__CLR4_5_21sdc1sdclusyjuzs.R.globalSliceStart(getClass().getName(),83432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23pm5il1sdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sdc1sdclusyjuzs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sdc1sdclusyjuzs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest_NoneASM.test_for_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83432,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23pm5il1sdk() throws Exception{try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83432);
        __CLR4_5_21sdc1sdclusyjuzs.R.inc(83433);VO_Int vo = new VO_Int();
        __CLR4_5_21sdc1sdclusyjuzs.R.inc(83434);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_5_21sdc1sdclusyjuzs.R.inc(83435);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

    public void test_for_long() throws Exception {__CLR4_5_21sdc1sdclusyjuzs.R.globalSliceStart(getClass().getName(),83436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_254hl0m1sdo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sdc1sdclusyjuzs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sdc1sdclusyjuzs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest_NoneASM.test_for_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83436,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_254hl0m1sdo() throws Exception{try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83436);
        __CLR4_5_21sdc1sdclusyjuzs.R.inc(83437);VO_Long vo = new VO_Long();
        __CLR4_5_21sdc1sdclusyjuzs.R.inc(83438);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_5_21sdc1sdclusyjuzs.R.inc(83439);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

    public void test_for_float() throws Exception {__CLR4_5_21sdc1sdclusyjuzs.R.globalSliceStart(getClass().getName(),83440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sx9pgg1sds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sdc1sdclusyjuzs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sdc1sdclusyjuzs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest_NoneASM.test_for_float",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83440,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sx9pgg1sds() throws Exception{try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83440);
        __CLR4_5_21sdc1sdclusyjuzs.R.inc(83441);VO_Float vo = new VO_Float();
        __CLR4_5_21sdc1sdclusyjuzs.R.inc(83442);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_5_21sdc1sdclusyjuzs.R.inc(83443);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

    public void test_for_double() throws Exception {__CLR4_5_21sdc1sdclusyjuzs.R.globalSliceStart(getClass().getName(),83444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p2bm1x1sdw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sdc1sdclusyjuzs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sdc1sdclusyjuzs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest_NoneASM.test_for_double",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83444,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p2bm1x1sdw() throws Exception{try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83444);
        __CLR4_5_21sdc1sdclusyjuzs.R.inc(83445);VO_Double vo = new VO_Double();
        __CLR4_5_21sdc1sdclusyjuzs.R.inc(83446);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_5_21sdc1sdclusyjuzs.R.inc(83447);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}
    
    public void test_for_boolean() throws Exception {__CLR4_5_21sdc1sdclusyjuzs.R.globalSliceStart(getClass().getName(),83448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2me3wes1se0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sdc1sdclusyjuzs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sdc1sdclusyjuzs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest_NoneASM.test_for_boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83448,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2me3wes1se0() throws Exception{try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83448);
        __CLR4_5_21sdc1sdclusyjuzs.R.inc(83449);VO_Boolean vo = new VO_Boolean();
        __CLR4_5_21sdc1sdclusyjuzs.R.inc(83450);vo.f1 = true;
        __CLR4_5_21sdc1sdclusyjuzs.R.inc(83451);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_5_21sdc1sdclusyjuzs.R.inc(83452);Assert.assertEquals("{\"f1\":true}", text);
    }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

    private static class VO_Byte {

        private byte f0;
        private byte f1;

        public byte getF0() {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83453);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83454);return f0;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

        public void setF0(byte f0) {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83455);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83456);this.f0 = f0;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

        public byte getF1() {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83457);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83458);return f1;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

        public void setF1(byte f1) {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83459);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83460);this.f1 = f1;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

    }

    private static class VO_Short {

        private short f0;
        private short f1;

        public short getF0() {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83461);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83462);return f0;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

        public void setF0(short f0) {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83463);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83464);this.f0 = f0;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

        public short getF1() {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83465);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83466);return f1;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

        public void setF1(short f1) {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83467);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83468);this.f1 = f1;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

    }

    private static class VO_Int {

        private int f0;
        private int f1;

        public int getF0() {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83469);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83470);return f0;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

        public void setF0(int f0) {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83471);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83472);this.f0 = f0;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

        public int getF1() {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83473);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83474);return f1;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

        public void setF1(int f1) {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83475);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83476);this.f1 = f1;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}
    }

    private static class VO_Long {

        private long f0;
        private long f1;

        public long getF0() {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83477);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83478);return f0;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

        public void setF0(long f0) {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83479);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83480);this.f0 = f0;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

        public long getF1() {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83481);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83482);return f1;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

        public void setF1(long f1) {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83483);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83484);this.f1 = f1;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

    }

    private static class VO_Float {

        private float f0;
        private float f1;

        public float getF0() {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83485);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83486);return f0;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

        public void setF0(float f0) {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83487);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83488);this.f0 = f0;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

        public float getF1() {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83489);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83490);return f1;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

        public void setF1(float f1) {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83491);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83492);this.f1 = f1;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

    }

    private static class VO_Double {

        private double f0;
        private double f1;

        public double getF0() {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83493);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83494);return f0;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

        public void setF0(double f0) {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83495);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83496);this.f0 = f0;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

        public double getF1() {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83497);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83498);return f1;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

        public void setF1(double f1) {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83499);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83500);this.f1 = f1;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

    }

    private static class VO_Boolean {

        private boolean f0;
        private boolean f1;

        public boolean isF0() {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83501);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83502);return f0;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

        public void setF0(boolean f0) {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83503);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83504);this.f0 = f0;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

        public boolean isF1() {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83505);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83506);return f1;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

        public void setF1(boolean f1) {try{__CLR4_5_21sdc1sdclusyjuzs.R.inc(83507);
            __CLR4_5_21sdc1sdclusyjuzs.R.inc(83508);this.f1 = f1;
        }finally{__CLR4_5_21sdc1sdclusyjuzs.R.flushNeeded();}}

    }
}
