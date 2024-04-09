/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.asm;

import org.junit.Assert;
import junit.framework.TestCase;

import java.util.LinkedHashMap;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class SortFieldTest extends TestCase {static class __CLR4_5_212vz12vzlusvn4do{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,50494,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_212vz12vzlusvn4do.R.globalSliceStart(getClass().getName(),50399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp212vz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212vz12vzlusvn4do.R.rethrow($CLV_t2$);}finally{__CLR4_5_212vz12vzlusvn4do.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.asm.SortFieldTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50399,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp212vz() throws Exception{try{__CLR4_5_212vz12vzlusvn4do.R.inc(50399);
        __CLR4_5_212vz12vzlusvn4do.R.inc(50400);V0 entity = new V0();

        __CLR4_5_212vz12vzlusvn4do.R.inc(50401);String text = JSON.toJSONString(entity, SerializerFeature.UseSingleQuotes, SerializerFeature.SortField);

        __CLR4_5_212vz12vzlusvn4do.R.inc(50402);Assert.assertEquals("{'f0':0,'f1':0,'f10':0,'f11':0,'f12':0,'f13':0,'f14':0,'f2':0,'f3':0,'f4':0,'f5':0,'f6':0,'f7':0,'f8':0,'f9':0}", text);

        __CLR4_5_212vz12vzlusvn4do.R.inc(50403);LinkedHashMap object = JSON.parseObject(text, LinkedHashMap.class);
        __CLR4_5_212vz12vzlusvn4do.R.inc(50404);text = JSON.toJSONString(object, SerializerFeature.UseSingleQuotes, SerializerFeature.SortField);
        __CLR4_5_212vz12vzlusvn4do.R.inc(50405);Assert.assertEquals("{'f0':0,'f1':0,'f10':0,'f11':0,'f12':0,'f13':0,'f14':0,'f2':0,'f3':0,'f4':0,'f5':0,'f6':0,'f7':0,'f8':0,'f9':0}", text);

    }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}
    
public void test_1() throws Exception {__CLR4_5_212vz12vzlusvn4do.R.globalSliceStart(getClass().getName(),50406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl12w6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212vz12vzlusvn4do.R.rethrow($CLV_t2$);}finally{__CLR4_5_212vz12vzlusvn4do.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.asm.SortFieldTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50406,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl12w6() throws Exception{try{__CLR4_5_212vz12vzlusvn4do.R.inc(50406);
    __CLR4_5_212vz12vzlusvn4do.R.inc(50407);V1 entity = new V1();

    __CLR4_5_212vz12vzlusvn4do.R.inc(50408);String text = JSON.toJSONString(entity, SerializerFeature.SortField);
    __CLR4_5_212vz12vzlusvn4do.R.inc(50409);System.out.println(text);

    // \u6309\u5b57\u6bb5\u987a\u5e8f\u8f93\u51fa
    // {"f1":0,"f2":0,"f3":0,"f4":0,"f5":0} 
    __CLR4_5_212vz12vzlusvn4do.R.inc(50410);Assert.assertEquals("{\"f1\":0,\"f2\":0,\"f3\":0,\"f4\":0,\"f5\":0}", text);

    __CLR4_5_212vz12vzlusvn4do.R.inc(50411);JSONObject object = JSON.parseObject(text);
    __CLR4_5_212vz12vzlusvn4do.R.inc(50412);text = JSON.toJSONString(object, SerializerFeature.SortField);
    __CLR4_5_212vz12vzlusvn4do.R.inc(50413);Assert.assertEquals("{\"f1\":0,\"f2\":0,\"f3\":0,\"f4\":0,\"f5\":0}", text);

}finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

public static class V1 {

    private int f2;
    private int f1;
    private int f4;
    private int f3;
    private int f5;

    public int getF2() {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50414); __CLR4_5_212vz12vzlusvn4do.R.inc(50415);return f2;}finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}
    public void setF2(int f2) {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50416);__CLR4_5_212vz12vzlusvn4do.R.inc(50417);this.f2 = f2;}finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}
    public int getF1() {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50418);__CLR4_5_212vz12vzlusvn4do.R.inc(50419);return f1;}finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}
    public void setF1(int f1) {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50420);__CLR4_5_212vz12vzlusvn4do.R.inc(50421);this.f1 = f1;}finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}
    public int getF4() {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50422);__CLR4_5_212vz12vzlusvn4do.R.inc(50423);return f4;}finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}
    public void setF4(int f4) {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50424);__CLR4_5_212vz12vzlusvn4do.R.inc(50425);this.f4 = f4;}finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}
    public int getF3() {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50426);__CLR4_5_212vz12vzlusvn4do.R.inc(50427);return f3;}finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}
    public void setF3(int f3) {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50428);__CLR4_5_212vz12vzlusvn4do.R.inc(50429);this.f3 = f3;}finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}
    public int getF5() {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50430);__CLR4_5_212vz12vzlusvn4do.R.inc(50431);return f5;}finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}
    public void setF5(int f5) {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50432);__CLR4_5_212vz12vzlusvn4do.R.inc(50433);this.f5 = f5;}finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}
}

    public static class V0 {

        private int f5;
        private int f4;
        private int f3;
        private int f2;
        private int f1;
        private int f0;
        private int f6;
        private int f7;
        private int f8;
        private int f9;
        private int f14;
        private int f13;
        private int f12;
        private int f11;
        private int f10;

        public int getF5() {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50434);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50435);return f5;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public void setF5(int f5) {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50436);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50437);this.f5 = f5;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public int getF4() {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50438);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50439);return f4;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public void setF4(int f4) {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50440);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50441);this.f4 = f4;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public int getF3() {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50442);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50443);return f3;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public void setF3(int f3) {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50444);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50445);this.f3 = f3;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public int getF2() {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50446);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50447);return f2;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public void setF2(int f2) {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50448);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50449);this.f2 = f2;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public int getF1() {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50450);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50451);return f1;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public void setF1(int f1) {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50452);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50453);this.f1 = f1;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public int getF0() {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50454);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50455);return f0;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public void setF0(int f0) {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50456);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50457);this.f0 = f0;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public int getF6() {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50458);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50459);return f6;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public void setF6(int f6) {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50460);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50461);this.f6 = f6;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public int getF7() {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50462);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50463);return f7;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public void setF7(int f7) {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50464);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50465);this.f7 = f7;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public int getF8() {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50466);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50467);return f8;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public void setF8(int f8) {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50468);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50469);this.f8 = f8;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public int getF9() {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50470);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50471);return f9;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public void setF9(int f9) {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50472);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50473);this.f9 = f9;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public int getF14() {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50474);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50475);return f14;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public void setF14(int f14) {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50476);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50477);this.f14 = f14;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public int getF13() {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50478);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50479);return f13;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public void setF13(int f13) {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50480);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50481);this.f13 = f13;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public int getF12() {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50482);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50483);return f12;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public void setF12(int f12) {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50484);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50485);this.f12 = f12;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public int getF11() {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50486);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50487);return f11;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public void setF11(int f11) {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50488);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50489);this.f11 = f11;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public int getF10() {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50490);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50491);return f10;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

        public void setF10(int f10) {try{__CLR4_5_212vz12vzlusvn4do.R.inc(50492);
            __CLR4_5_212vz12vzlusvn4do.R.inc(50493);this.f10 = f10;
        }finally{__CLR4_5_212vz12vzlusvn4do.R.flushNeeded();}}

    }

}
