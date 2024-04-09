/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class NotWriteDefaultValueTest extends TestCase {static class __CLR4_1_101sba1sbalusqkjx5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,83435,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_byte() throws Exception {__CLR4_1_101sba1sbalusqkjx5.R.globalSliceStart(getClass().getName(),83350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yzydzi1sba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sba1sbalusqkjx5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sba1sbalusqkjx5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest.test_for_byte",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83350,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yzydzi1sba() throws Exception{try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83350);
        __CLR4_1_101sba1sbalusqkjx5.R.inc(83351);VO_Byte vo = new VO_Byte();
        __CLR4_1_101sba1sbalusqkjx5.R.inc(83352);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_1_101sba1sbalusqkjx5.R.inc(83353);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

    public void test_for_short() throws Exception {__CLR4_1_101sba1sbalusqkjx5.R.globalSliceStart(getClass().getName(),83354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fuxm0w1sbe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sba1sbalusqkjx5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sba1sbalusqkjx5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest.test_for_short",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83354,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fuxm0w1sbe() throws Exception{try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83354);
        __CLR4_1_101sba1sbalusqkjx5.R.inc(83355);VO_Short vo = new VO_Short();
        __CLR4_1_101sba1sbalusqkjx5.R.inc(83356);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_1_101sba1sbalusqkjx5.R.inc(83357);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

    public void test_for_int() throws Exception {__CLR4_1_101sba1sbalusqkjx5.R.globalSliceStart(getClass().getName(),83358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103pm5il1sbi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sba1sbalusqkjx5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sba1sbalusqkjx5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest.test_for_int",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83358,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103pm5il1sbi() throws Exception{try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83358);
        __CLR4_1_101sba1sbalusqkjx5.R.inc(83359);VO_Int vo = new VO_Int();
        __CLR4_1_101sba1sbalusqkjx5.R.inc(83360);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_1_101sba1sbalusqkjx5.R.inc(83361);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

    public void test_for_long() throws Exception {__CLR4_1_101sba1sbalusqkjx5.R.globalSliceStart(getClass().getName(),83362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1054hl0m1sbm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sba1sbalusqkjx5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sba1sbalusqkjx5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest.test_for_long",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83362,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1054hl0m1sbm() throws Exception{try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83362);
        __CLR4_1_101sba1sbalusqkjx5.R.inc(83363);VO_Long vo = new VO_Long();
        __CLR4_1_101sba1sbalusqkjx5.R.inc(83364);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_1_101sba1sbalusqkjx5.R.inc(83365);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

    public void test_for_float() throws Exception {__CLR4_1_101sba1sbalusqkjx5.R.globalSliceStart(getClass().getName(),83366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10sx9pgg1sbq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sba1sbalusqkjx5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sba1sbalusqkjx5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest.test_for_float",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83366,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10sx9pgg1sbq() throws Exception{try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83366);
        __CLR4_1_101sba1sbalusqkjx5.R.inc(83367);VO_Float vo = new VO_Float();
        __CLR4_1_101sba1sbalusqkjx5.R.inc(83368);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_1_101sba1sbalusqkjx5.R.inc(83369);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

    public void test_for_double() throws Exception {__CLR4_1_101sba1sbalusqkjx5.R.globalSliceStart(getClass().getName(),83370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10p2bm1x1sbu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sba1sbalusqkjx5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sba1sbalusqkjx5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest.test_for_double",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83370,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10p2bm1x1sbu() throws Exception{try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83370);
        __CLR4_1_101sba1sbalusqkjx5.R.inc(83371);VO_Double vo = new VO_Double();
        __CLR4_1_101sba1sbalusqkjx5.R.inc(83372);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_1_101sba1sbalusqkjx5.R.inc(83373);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}
    
    public void test_for_boolean() throws Exception {__CLR4_1_101sba1sbalusqkjx5.R.globalSliceStart(getClass().getName(),83374);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10me3wes1sby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sba1sbalusqkjx5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sba1sbalusqkjx5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NotWriteDefaultValueTest.test_for_boolean",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83374,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10me3wes1sby() throws Exception{try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83374);
        __CLR4_1_101sba1sbalusqkjx5.R.inc(83375);VO_Boolean vo = new VO_Boolean();
        __CLR4_1_101sba1sbalusqkjx5.R.inc(83376);vo.f1 = true;
        __CLR4_1_101sba1sbalusqkjx5.R.inc(83377);String text = JSON.toJSONString(vo, SerializerFeature.NotWriteDefaultValue);
        __CLR4_1_101sba1sbalusqkjx5.R.inc(83378);Assert.assertEquals("{\"f1\":true}", text);
    }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

    public static class VO_Byte {

        private byte f0;
        private byte f1;

        public byte getF0() {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83379);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83380);return f0;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

        public void setF0(byte f0) {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83381);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83382);this.f0 = f0;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

        public byte getF1() {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83383);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83384);return f1;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

        public void setF1(byte f1) {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83385);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83386);this.f1 = f1;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

    }

    public static class VO_Short {

        private short f0;
        private short f1;

        public short getF0() {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83387);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83388);return f0;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

        public void setF0(short f0) {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83389);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83390);this.f0 = f0;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

        public short getF1() {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83391);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83392);return f1;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

        public void setF1(short f1) {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83393);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83394);this.f1 = f1;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

    }

    public static class VO_Int {

        private int f0;
        private int f1;

        public int getF0() {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83395);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83396);return f0;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

        public void setF0(int f0) {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83397);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83398);this.f0 = f0;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

        public int getF1() {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83399);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83400);return f1;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

        public void setF1(int f1) {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83401);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83402);this.f1 = f1;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}
    }

    public static class VO_Long {

        private long f0;
        private long f1;

        public long getF0() {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83403);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83404);return f0;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

        public void setF0(long f0) {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83405);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83406);this.f0 = f0;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

        public long getF1() {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83407);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83408);return f1;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

        public void setF1(long f1) {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83409);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83410);this.f1 = f1;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

    }

    public static class VO_Float {

        private float f0;
        private float f1;

        public float getF0() {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83411);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83412);return f0;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

        public void setF0(float f0) {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83413);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83414);this.f0 = f0;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

        public float getF1() {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83415);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83416);return f1;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

        public void setF1(float f1) {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83417);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83418);this.f1 = f1;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

    }

    public static class VO_Double {

        private double f0;
        private double f1;

        public double getF0() {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83419);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83420);return f0;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

        public void setF0(double f0) {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83421);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83422);this.f0 = f0;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

        public double getF1() {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83423);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83424);return f1;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

        public void setF1(double f1) {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83425);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83426);this.f1 = f1;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

    }
    
    public static class VO_Boolean {

        private boolean f0;
        private boolean f1;

        public boolean isF0() {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83427);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83428);return f0;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

        public void setF0(boolean f0) {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83429);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83430);this.f0 = f0;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

        public boolean isF1() {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83431);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83432);return f1;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

        public void setF1(boolean f1) {try{__CLR4_1_101sba1sbalusqkjx5.R.inc(83433);
            __CLR4_1_101sba1sbalusqkjx5.R.inc(83434);this.f1 = f1;
        }finally{__CLR4_1_101sba1sbalusqkjx5.R.flushNeeded();}}

    }
}
