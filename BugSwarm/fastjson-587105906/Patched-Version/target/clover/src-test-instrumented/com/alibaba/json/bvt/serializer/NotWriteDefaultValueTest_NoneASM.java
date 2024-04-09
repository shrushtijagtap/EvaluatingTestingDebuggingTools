/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class NotWriteDefaultValueTest_NoneASM extends TestCase {static class __CLR4_5_21tbk1tbklusvngg2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,84741,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_byte() throws Exception {__CLR4_5_21tbk1tbklusvngg2.R.globalSliceStart(getClass().getName(),84656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yzydzi1tbk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tbk1tbklusvngg2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tbk1tbklusvngg2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest_NoneASM.test_for_byte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84656,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yzydzi1tbk() throws Exception{try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84656);
        __CLR4_5_21tbk1tbklusvngg2.R.inc(84657);VO_Byte vo = new VO_Byte();
        __CLR4_5_21tbk1tbklusvngg2.R.inc(84658);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_5_21tbk1tbklusvngg2.R.inc(84659);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

    public void test_for_short() throws Exception {__CLR4_5_21tbk1tbklusvngg2.R.globalSliceStart(getClass().getName(),84660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fuxm0w1tbo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tbk1tbklusvngg2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tbk1tbklusvngg2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest_NoneASM.test_for_short",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84660,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fuxm0w1tbo() throws Exception{try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84660);
        __CLR4_5_21tbk1tbklusvngg2.R.inc(84661);VO_Short vo = new VO_Short();
        __CLR4_5_21tbk1tbklusvngg2.R.inc(84662);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_5_21tbk1tbklusvngg2.R.inc(84663);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

    public void test_for_int() throws Exception {__CLR4_5_21tbk1tbklusvngg2.R.globalSliceStart(getClass().getName(),84664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23pm5il1tbs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tbk1tbklusvngg2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tbk1tbklusvngg2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest_NoneASM.test_for_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84664,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23pm5il1tbs() throws Exception{try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84664);
        __CLR4_5_21tbk1tbklusvngg2.R.inc(84665);VO_Int vo = new VO_Int();
        __CLR4_5_21tbk1tbklusvngg2.R.inc(84666);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_5_21tbk1tbklusvngg2.R.inc(84667);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

    public void test_for_long() throws Exception {__CLR4_5_21tbk1tbklusvngg2.R.globalSliceStart(getClass().getName(),84668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_254hl0m1tbw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tbk1tbklusvngg2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tbk1tbklusvngg2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest_NoneASM.test_for_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84668,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_254hl0m1tbw() throws Exception{try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84668);
        __CLR4_5_21tbk1tbklusvngg2.R.inc(84669);VO_Long vo = new VO_Long();
        __CLR4_5_21tbk1tbklusvngg2.R.inc(84670);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_5_21tbk1tbklusvngg2.R.inc(84671);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

    public void test_for_float() throws Exception {__CLR4_5_21tbk1tbklusvngg2.R.globalSliceStart(getClass().getName(),84672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sx9pgg1tc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tbk1tbklusvngg2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tbk1tbklusvngg2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest_NoneASM.test_for_float",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84672,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sx9pgg1tc0() throws Exception{try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84672);
        __CLR4_5_21tbk1tbklusvngg2.R.inc(84673);VO_Float vo = new VO_Float();
        __CLR4_5_21tbk1tbklusvngg2.R.inc(84674);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_5_21tbk1tbklusvngg2.R.inc(84675);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

    public void test_for_double() throws Exception {__CLR4_5_21tbk1tbklusvngg2.R.globalSliceStart(getClass().getName(),84676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p2bm1x1tc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tbk1tbklusvngg2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tbk1tbklusvngg2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest_NoneASM.test_for_double",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84676,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p2bm1x1tc4() throws Exception{try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84676);
        __CLR4_5_21tbk1tbklusvngg2.R.inc(84677);VO_Double vo = new VO_Double();
        __CLR4_5_21tbk1tbklusvngg2.R.inc(84678);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_5_21tbk1tbklusvngg2.R.inc(84679);Assert.assertEquals("{}", text);
    }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}
    
    public void test_for_boolean() throws Exception {__CLR4_5_21tbk1tbklusvngg2.R.globalSliceStart(getClass().getName(),84680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2me3wes1tc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tbk1tbklusvngg2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tbk1tbklusvngg2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest_NoneASM.test_for_boolean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84680,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2me3wes1tc8() throws Exception{try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84680);
        __CLR4_5_21tbk1tbklusvngg2.R.inc(84681);VO_Boolean vo = new VO_Boolean();
        __CLR4_5_21tbk1tbklusvngg2.R.inc(84682);vo.f1 = true;
        __CLR4_5_21tbk1tbklusvngg2.R.inc(84683);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_5_21tbk1tbklusvngg2.R.inc(84684);Assert.assertEquals("{\"f1\":true}", text);
    }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

    private static class VO_Byte {

        private byte f0;
        private byte f1;

        public byte getF0() {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84685);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84686);return f0;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

        public void setF0(byte f0) {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84687);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84688);this.f0 = f0;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

        public byte getF1() {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84689);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84690);return f1;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

        public void setF1(byte f1) {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84691);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84692);this.f1 = f1;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

    }

    private static class VO_Short {

        private short f0;
        private short f1;

        public short getF0() {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84693);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84694);return f0;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

        public void setF0(short f0) {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84695);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84696);this.f0 = f0;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

        public short getF1() {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84697);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84698);return f1;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

        public void setF1(short f1) {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84699);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84700);this.f1 = f1;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

    }

    private static class VO_Int {

        private int f0;
        private int f1;

        public int getF0() {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84701);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84702);return f0;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

        public void setF0(int f0) {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84703);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84704);this.f0 = f0;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

        public int getF1() {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84705);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84706);return f1;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

        public void setF1(int f1) {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84707);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84708);this.f1 = f1;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}
    }

    private static class VO_Long {

        private long f0;
        private long f1;

        public long getF0() {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84709);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84710);return f0;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

        public void setF0(long f0) {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84711);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84712);this.f0 = f0;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

        public long getF1() {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84713);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84714);return f1;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

        public void setF1(long f1) {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84715);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84716);this.f1 = f1;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

    }

    private static class VO_Float {

        private float f0;
        private float f1;

        public float getF0() {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84717);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84718);return f0;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

        public void setF0(float f0) {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84719);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84720);this.f0 = f0;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

        public float getF1() {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84721);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84722);return f1;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

        public void setF1(float f1) {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84723);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84724);this.f1 = f1;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

    }

    private static class VO_Double {

        private double f0;
        private double f1;

        public double getF0() {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84725);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84726);return f0;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

        public void setF0(double f0) {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84727);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84728);this.f0 = f0;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

        public double getF1() {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84729);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84730);return f1;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

        public void setF1(double f1) {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84731);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84732);this.f1 = f1;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

    }

    private static class VO_Boolean {

        private boolean f0;
        private boolean f1;

        public boolean isF0() {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84733);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84734);return f0;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

        public void setF0(boolean f0) {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84735);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84736);this.f0 = f0;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

        public boolean isF1() {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84737);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84738);return f1;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

        public void setF1(boolean f1) {try{__CLR4_5_21tbk1tbklusvngg2.R.inc(84739);
            __CLR4_5_21tbk1tbklusvngg2.R.inc(84740);this.f1 = f1;
        }finally{__CLR4_5_21tbk1tbklusvngg2.R.flushNeeded();}}

    }
}
