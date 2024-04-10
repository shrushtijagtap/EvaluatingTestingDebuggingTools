/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.asm;

import org.junit.Assert;
import junit.framework.TestCase;

import java.util.LinkedHashMap;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class SortFieldTest extends TestCase {static class __CLR4_5_211xr11xrlusyjqsd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,49262,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_211xr11xrlusyjqsd.R.globalSliceStart(getClass().getName(),49167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp211xr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211xr11xrlusyjqsd.R.rethrow($CLV_t2$);}finally{__CLR4_5_211xr11xrlusyjqsd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.asm.SortFieldTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49167,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp211xr() throws Exception{try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49167);
        __CLR4_5_211xr11xrlusyjqsd.R.inc(49168);V0 entity = new V0();

        __CLR4_5_211xr11xrlusyjqsd.R.inc(49169);String text = JSON.toJSONString(entity, SerializerFeature.UseSingleQuotes, SerializerFeature.SortField);

        __CLR4_5_211xr11xrlusyjqsd.R.inc(49170);Assert.assertEquals("{'f0':0,'f1':0,'f10':0,'f11':0,'f12':0,'f13':0,'f14':0,'f2':0,'f3':0,'f4':0,'f5':0,'f6':0,'f7':0,'f8':0,'f9':0}", text);

        __CLR4_5_211xr11xrlusyjqsd.R.inc(49171);LinkedHashMap object = JSON.parseObject(text, LinkedHashMap.class);
        __CLR4_5_211xr11xrlusyjqsd.R.inc(49172);text = JSON.toJSONString(object, SerializerFeature.UseSingleQuotes, SerializerFeature.SortField);
        __CLR4_5_211xr11xrlusyjqsd.R.inc(49173);Assert.assertEquals("{'f0':0,'f1':0,'f10':0,'f11':0,'f12':0,'f13':0,'f14':0,'f2':0,'f3':0,'f4':0,'f5':0,'f6':0,'f7':0,'f8':0,'f9':0}", text);

    }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}
    
public void test_1() throws Exception {__CLR4_5_211xr11xrlusyjqsd.R.globalSliceStart(getClass().getName(),49174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl11xy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_211xr11xrlusyjqsd.R.rethrow($CLV_t2$);}finally{__CLR4_5_211xr11xrlusyjqsd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.asm.SortFieldTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49174,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl11xy() throws Exception{try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49174);
    __CLR4_5_211xr11xrlusyjqsd.R.inc(49175);V1 entity = new V1();

    __CLR4_5_211xr11xrlusyjqsd.R.inc(49176);String text = JSON.toJSONString(entity, SerializerFeature.SortField);
    __CLR4_5_211xr11xrlusyjqsd.R.inc(49177);System.out.println(text);

    // \u6309\u5b57\u6bb5\u987a\u5e8f\u8f93\u51fa
    // {"f1":0,"f2":0,"f3":0,"f4":0,"f5":0} 
    __CLR4_5_211xr11xrlusyjqsd.R.inc(49178);Assert.assertEquals("{\"f1\":0,\"f2\":0,\"f3\":0,\"f4\":0,\"f5\":0}", text);

    __CLR4_5_211xr11xrlusyjqsd.R.inc(49179);JSONObject object = JSON.parseObject(text);
    __CLR4_5_211xr11xrlusyjqsd.R.inc(49180);text = JSON.toJSONString(object, SerializerFeature.SortField);
    __CLR4_5_211xr11xrlusyjqsd.R.inc(49181);Assert.assertEquals("{\"f1\":0,\"f2\":0,\"f3\":0,\"f4\":0,\"f5\":0}", text);

}finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

public static class V1 {

    private int f2;
    private int f1;
    private int f4;
    private int f3;
    private int f5;

    public int getF2() {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49182); __CLR4_5_211xr11xrlusyjqsd.R.inc(49183);return f2;}finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}
    public void setF2(int f2) {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49184);__CLR4_5_211xr11xrlusyjqsd.R.inc(49185);this.f2 = f2;}finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}
    public int getF1() {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49186);__CLR4_5_211xr11xrlusyjqsd.R.inc(49187);return f1;}finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}
    public void setF1(int f1) {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49188);__CLR4_5_211xr11xrlusyjqsd.R.inc(49189);this.f1 = f1;}finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}
    public int getF4() {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49190);__CLR4_5_211xr11xrlusyjqsd.R.inc(49191);return f4;}finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}
    public void setF4(int f4) {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49192);__CLR4_5_211xr11xrlusyjqsd.R.inc(49193);this.f4 = f4;}finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}
    public int getF3() {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49194);__CLR4_5_211xr11xrlusyjqsd.R.inc(49195);return f3;}finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}
    public void setF3(int f3) {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49196);__CLR4_5_211xr11xrlusyjqsd.R.inc(49197);this.f3 = f3;}finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}
    public int getF5() {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49198);__CLR4_5_211xr11xrlusyjqsd.R.inc(49199);return f5;}finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}
    public void setF5(int f5) {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49200);__CLR4_5_211xr11xrlusyjqsd.R.inc(49201);this.f5 = f5;}finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}
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

        public int getF5() {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49202);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49203);return f5;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public void setF5(int f5) {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49204);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49205);this.f5 = f5;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public int getF4() {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49206);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49207);return f4;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public void setF4(int f4) {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49208);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49209);this.f4 = f4;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public int getF3() {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49210);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49211);return f3;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public void setF3(int f3) {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49212);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49213);this.f3 = f3;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public int getF2() {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49214);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49215);return f2;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public void setF2(int f2) {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49216);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49217);this.f2 = f2;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public int getF1() {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49218);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49219);return f1;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public void setF1(int f1) {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49220);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49221);this.f1 = f1;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public int getF0() {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49222);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49223);return f0;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public void setF0(int f0) {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49224);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49225);this.f0 = f0;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public int getF6() {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49226);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49227);return f6;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public void setF6(int f6) {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49228);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49229);this.f6 = f6;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public int getF7() {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49230);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49231);return f7;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public void setF7(int f7) {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49232);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49233);this.f7 = f7;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public int getF8() {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49234);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49235);return f8;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public void setF8(int f8) {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49236);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49237);this.f8 = f8;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public int getF9() {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49238);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49239);return f9;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public void setF9(int f9) {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49240);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49241);this.f9 = f9;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public int getF14() {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49242);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49243);return f14;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public void setF14(int f14) {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49244);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49245);this.f14 = f14;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public int getF13() {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49246);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49247);return f13;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public void setF13(int f13) {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49248);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49249);this.f13 = f13;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public int getF12() {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49250);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49251);return f12;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public void setF12(int f12) {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49252);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49253);this.f12 = f12;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public int getF11() {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49254);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49255);return f11;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public void setF11(int f11) {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49256);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49257);this.f11 = f11;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public int getF10() {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49258);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49259);return f10;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

        public void setF10(int f10) {try{__CLR4_5_211xr11xrlusyjqsd.R.inc(49260);
            __CLR4_5_211xr11xrlusyjqsd.R.inc(49261);this.f10 = f10;
        }finally{__CLR4_5_211xr11xrlusyjqsd.R.flushNeeded();}}

    }

}
