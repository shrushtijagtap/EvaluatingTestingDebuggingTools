/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.asm;

import org.junit.Assert;
import junit.framework.TestCase;

import java.util.LinkedHashMap;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class SortFieldTest extends TestCase {static class __CLR4_1_1012wa12waluszw6uy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,50505,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_1012wa12waluszw6uy.R.globalSliceStart(getClass().getName(),50410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp212wa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012wa12waluszw6uy.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012wa12waluszw6uy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.asm.SortFieldTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50410,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp212wa() throws Exception{try{__CLR4_1_1012wa12waluszw6uy.R.inc(50410);
        __CLR4_1_1012wa12waluszw6uy.R.inc(50411);V0 entity = new V0();

        __CLR4_1_1012wa12waluszw6uy.R.inc(50412);String text = JSON.toJSONString(entity, SerializerFeature.UseSingleQuotes, SerializerFeature.SortField);

        __CLR4_1_1012wa12waluszw6uy.R.inc(50413);Assert.assertEquals("{'f0':0,'f1':0,'f10':0,'f11':0,'f12':0,'f13':0,'f14':0,'f2':0,'f3':0,'f4':0,'f5':0,'f6':0,'f7':0,'f8':0,'f9':0}", text);

        __CLR4_1_1012wa12waluszw6uy.R.inc(50414);LinkedHashMap object = JSON.parseObject(text, LinkedHashMap.class);
        __CLR4_1_1012wa12waluszw6uy.R.inc(50415);text = JSON.toJSONString(object, SerializerFeature.UseSingleQuotes, SerializerFeature.SortField);
        __CLR4_1_1012wa12waluszw6uy.R.inc(50416);Assert.assertEquals("{'f0':0,'f1':0,'f10':0,'f11':0,'f12':0,'f13':0,'f14':0,'f2':0,'f3':0,'f4':0,'f5':0,'f6':0,'f7':0,'f8':0,'f9':0}", text);

    }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}
    
public void test_1() throws Exception {__CLR4_1_1012wa12waluszw6uy.R.globalSliceStart(getClass().getName(),50417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl12wh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012wa12waluszw6uy.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012wa12waluszw6uy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.asm.SortFieldTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50417,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl12wh() throws Exception{try{__CLR4_1_1012wa12waluszw6uy.R.inc(50417);
    __CLR4_1_1012wa12waluszw6uy.R.inc(50418);V1 entity = new V1();

    __CLR4_1_1012wa12waluszw6uy.R.inc(50419);String text = JSON.toJSONString(entity, SerializerFeature.SortField);
    __CLR4_1_1012wa12waluszw6uy.R.inc(50420);System.out.println(text);

    // \u6309\u5b57\u6bb5\u987a\u5e8f\u8f93\u51fa
    // {"f1":0,"f2":0,"f3":0,"f4":0,"f5":0} 
    __CLR4_1_1012wa12waluszw6uy.R.inc(50421);Assert.assertEquals("{\"f1\":0,\"f2\":0,\"f3\":0,\"f4\":0,\"f5\":0}", text);

    __CLR4_1_1012wa12waluszw6uy.R.inc(50422);JSONObject object = JSON.parseObject(text);
    __CLR4_1_1012wa12waluszw6uy.R.inc(50423);text = JSON.toJSONString(object, SerializerFeature.SortField);
    __CLR4_1_1012wa12waluszw6uy.R.inc(50424);Assert.assertEquals("{\"f1\":0,\"f2\":0,\"f3\":0,\"f4\":0,\"f5\":0}", text);

}finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

public static class V1 {

    private int f2;
    private int f1;
    private int f4;
    private int f3;
    private int f5;

    public int getF2() {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50425); __CLR4_1_1012wa12waluszw6uy.R.inc(50426);return f2;}finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}
    public void setF2(int f2) {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50427);__CLR4_1_1012wa12waluszw6uy.R.inc(50428);this.f2 = f2;}finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}
    public int getF1() {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50429);__CLR4_1_1012wa12waluszw6uy.R.inc(50430);return f1;}finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}
    public void setF1(int f1) {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50431);__CLR4_1_1012wa12waluszw6uy.R.inc(50432);this.f1 = f1;}finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}
    public int getF4() {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50433);__CLR4_1_1012wa12waluszw6uy.R.inc(50434);return f4;}finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}
    public void setF4(int f4) {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50435);__CLR4_1_1012wa12waluszw6uy.R.inc(50436);this.f4 = f4;}finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}
    public int getF3() {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50437);__CLR4_1_1012wa12waluszw6uy.R.inc(50438);return f3;}finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}
    public void setF3(int f3) {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50439);__CLR4_1_1012wa12waluszw6uy.R.inc(50440);this.f3 = f3;}finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}
    public int getF5() {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50441);__CLR4_1_1012wa12waluszw6uy.R.inc(50442);return f5;}finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}
    public void setF5(int f5) {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50443);__CLR4_1_1012wa12waluszw6uy.R.inc(50444);this.f5 = f5;}finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}
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

        public int getF5() {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50445);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50446);return f5;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public void setF5(int f5) {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50447);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50448);this.f5 = f5;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public int getF4() {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50449);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50450);return f4;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public void setF4(int f4) {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50451);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50452);this.f4 = f4;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public int getF3() {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50453);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50454);return f3;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public void setF3(int f3) {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50455);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50456);this.f3 = f3;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public int getF2() {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50457);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50458);return f2;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public void setF2(int f2) {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50459);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50460);this.f2 = f2;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public int getF1() {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50461);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50462);return f1;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public void setF1(int f1) {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50463);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50464);this.f1 = f1;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public int getF0() {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50465);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50466);return f0;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public void setF0(int f0) {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50467);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50468);this.f0 = f0;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public int getF6() {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50469);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50470);return f6;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public void setF6(int f6) {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50471);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50472);this.f6 = f6;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public int getF7() {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50473);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50474);return f7;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public void setF7(int f7) {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50475);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50476);this.f7 = f7;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public int getF8() {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50477);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50478);return f8;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public void setF8(int f8) {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50479);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50480);this.f8 = f8;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public int getF9() {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50481);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50482);return f9;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public void setF9(int f9) {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50483);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50484);this.f9 = f9;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public int getF14() {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50485);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50486);return f14;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public void setF14(int f14) {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50487);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50488);this.f14 = f14;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public int getF13() {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50489);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50490);return f13;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public void setF13(int f13) {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50491);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50492);this.f13 = f13;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public int getF12() {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50493);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50494);return f12;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public void setF12(int f12) {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50495);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50496);this.f12 = f12;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public int getF11() {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50497);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50498);return f11;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public void setF11(int f11) {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50499);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50500);this.f11 = f11;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public int getF10() {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50501);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50502);return f10;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

        public void setF10(int f10) {try{__CLR4_1_1012wa12waluszw6uy.R.inc(50503);
            __CLR4_1_1012wa12waluszw6uy.R.inc(50504);this.f10 = f10;
        }finally{__CLR4_1_1012wa12waluszw6uy.R.flushNeeded();}}

    }

}
