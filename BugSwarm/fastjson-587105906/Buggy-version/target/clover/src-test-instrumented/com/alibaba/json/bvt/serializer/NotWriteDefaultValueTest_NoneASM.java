/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class NotWriteDefaultValueTest_NoneASM extends TestCase {static class __CLR4_1_101tbv1tbvluszwf3w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,84752,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_byte() throws Exception {__CLR4_1_101tbv1tbvluszwf3w.R.globalSliceStart(getClass().getName(),84667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yzydzi1tbv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tbv1tbvluszwf3w.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tbv1tbvluszwf3w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest_NoneASM.test_for_byte",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84667,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yzydzi1tbv() throws Exception{try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84667);
        __CLR4_1_101tbv1tbvluszwf3w.R.inc(84668);VO_Byte vo = new VO_Byte();
        __CLR4_1_101tbv1tbvluszwf3w.R.inc(84669);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_1_101tbv1tbvluszwf3w.R.inc(84670);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

    public void test_for_short() throws Exception {__CLR4_1_101tbv1tbvluszwf3w.R.globalSliceStart(getClass().getName(),84671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fuxm0w1tbz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tbv1tbvluszwf3w.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tbv1tbvluszwf3w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest_NoneASM.test_for_short",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84671,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fuxm0w1tbz() throws Exception{try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84671);
        __CLR4_1_101tbv1tbvluszwf3w.R.inc(84672);VO_Short vo = new VO_Short();
        __CLR4_1_101tbv1tbvluszwf3w.R.inc(84673);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_1_101tbv1tbvluszwf3w.R.inc(84674);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

    public void test_for_int() throws Exception {__CLR4_1_101tbv1tbvluszwf3w.R.globalSliceStart(getClass().getName(),84675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103pm5il1tc3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tbv1tbvluszwf3w.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tbv1tbvluszwf3w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest_NoneASM.test_for_int",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84675,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103pm5il1tc3() throws Exception{try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84675);
        __CLR4_1_101tbv1tbvluszwf3w.R.inc(84676);VO_Int vo = new VO_Int();
        __CLR4_1_101tbv1tbvluszwf3w.R.inc(84677);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_1_101tbv1tbvluszwf3w.R.inc(84678);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

    public void test_for_long() throws Exception {__CLR4_1_101tbv1tbvluszwf3w.R.globalSliceStart(getClass().getName(),84679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1054hl0m1tc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tbv1tbvluszwf3w.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tbv1tbvluszwf3w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest_NoneASM.test_for_long",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84679,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1054hl0m1tc7() throws Exception{try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84679);
        __CLR4_1_101tbv1tbvluszwf3w.R.inc(84680);VO_Long vo = new VO_Long();
        __CLR4_1_101tbv1tbvluszwf3w.R.inc(84681);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_1_101tbv1tbvluszwf3w.R.inc(84682);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

    public void test_for_float() throws Exception {__CLR4_1_101tbv1tbvluszwf3w.R.globalSliceStart(getClass().getName(),84683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10sx9pgg1tcb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tbv1tbvluszwf3w.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tbv1tbvluszwf3w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest_NoneASM.test_for_float",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84683,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10sx9pgg1tcb() throws Exception{try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84683);
        __CLR4_1_101tbv1tbvluszwf3w.R.inc(84684);VO_Float vo = new VO_Float();
        __CLR4_1_101tbv1tbvluszwf3w.R.inc(84685);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_1_101tbv1tbvluszwf3w.R.inc(84686);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

    public void test_for_double() throws Exception {__CLR4_1_101tbv1tbvluszwf3w.R.globalSliceStart(getClass().getName(),84687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10p2bm1x1tcf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tbv1tbvluszwf3w.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tbv1tbvluszwf3w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest_NoneASM.test_for_double",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84687,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10p2bm1x1tcf() throws Exception{try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84687);
        __CLR4_1_101tbv1tbvluszwf3w.R.inc(84688);VO_Double vo = new VO_Double();
        __CLR4_1_101tbv1tbvluszwf3w.R.inc(84689);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_1_101tbv1tbvluszwf3w.R.inc(84690);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}
    
    public void test_for_boolean() throws Exception {__CLR4_1_101tbv1tbvluszwf3w.R.globalSliceStart(getClass().getName(),84691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10me3wes1tcj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tbv1tbvluszwf3w.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tbv1tbvluszwf3w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest_NoneASM.test_for_boolean",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84691,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10me3wes1tcj() throws Exception{try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84691);
        __CLR4_1_101tbv1tbvluszwf3w.R.inc(84692);VO_Boolean vo = new VO_Boolean();
        __CLR4_1_101tbv1tbvluszwf3w.R.inc(84693);vo.f1 = true;
        __CLR4_1_101tbv1tbvluszwf3w.R.inc(84694);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_1_101tbv1tbvluszwf3w.R.inc(84695);Assert.assertEquals("{\"f1\":true}", text);
    }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

    private static class VO_Byte {

        private byte f0;
        private byte f1;

        public byte getF0() {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84696);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84697);return f0;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

        public void setF0(byte f0) {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84698);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84699);this.f0 = f0;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

        public byte getF1() {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84700);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84701);return f1;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

        public void setF1(byte f1) {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84702);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84703);this.f1 = f1;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

    }

    private static class VO_Short {

        private short f0;
        private short f1;

        public short getF0() {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84704);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84705);return f0;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

        public void setF0(short f0) {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84706);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84707);this.f0 = f0;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

        public short getF1() {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84708);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84709);return f1;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

        public void setF1(short f1) {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84710);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84711);this.f1 = f1;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

    }

    private static class VO_Int {

        private int f0;
        private int f1;

        public int getF0() {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84712);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84713);return f0;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

        public void setF0(int f0) {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84714);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84715);this.f0 = f0;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

        public int getF1() {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84716);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84717);return f1;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

        public void setF1(int f1) {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84718);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84719);this.f1 = f1;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}
    }

    private static class VO_Long {

        private long f0;
        private long f1;

        public long getF0() {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84720);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84721);return f0;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

        public void setF0(long f0) {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84722);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84723);this.f0 = f0;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

        public long getF1() {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84724);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84725);return f1;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

        public void setF1(long f1) {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84726);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84727);this.f1 = f1;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

    }

    private static class VO_Float {

        private float f0;
        private float f1;

        public float getF0() {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84728);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84729);return f0;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

        public void setF0(float f0) {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84730);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84731);this.f0 = f0;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

        public float getF1() {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84732);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84733);return f1;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

        public void setF1(float f1) {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84734);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84735);this.f1 = f1;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

    }

    private static class VO_Double {

        private double f0;
        private double f1;

        public double getF0() {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84736);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84737);return f0;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

        public void setF0(double f0) {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84738);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84739);this.f0 = f0;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

        public double getF1() {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84740);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84741);return f1;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

        public void setF1(double f1) {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84742);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84743);this.f1 = f1;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

    }

    private static class VO_Boolean {

        private boolean f0;
        private boolean f1;

        public boolean isF0() {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84744);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84745);return f0;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

        public void setF0(boolean f0) {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84746);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84747);this.f0 = f0;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

        public boolean isF1() {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84748);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84749);return f1;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

        public void setF1(boolean f1) {try{__CLR4_1_101tbv1tbvluszwf3w.R.inc(84750);
            __CLR4_1_101tbv1tbvluszwf3w.R.inc(84751);this.f1 = f1;
        }finally{__CLR4_1_101tbv1tbvluszwf3w.R.flushNeeded();}}

    }
}
