/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class FloatTest extends TestCase {static class __CLR4_1_101s7c1s7cluszwexx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,83236,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101s7c1s7cluszwexx.R.globalSliceStart(getClass().getName(),83208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21s7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101s7c1s7cluszwexx.R.rethrow($CLV_t2$);}finally{__CLR4_1_101s7c1s7cluszwexx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.FloatTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83208,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21s7c() throws Exception{try{__CLR4_1_101s7c1s7cluszwexx.R.inc(83208);
        __CLR4_1_101s7c1s7cluszwexx.R.inc(83209);Assert.assertEquals("null", JSON.toJSONString(Float.NaN));
        __CLR4_1_101s7c1s7cluszwexx.R.inc(83210);Assert.assertEquals("null", JSON.toJSONString(Double.NaN));
        __CLR4_1_101s7c1s7cluszwexx.R.inc(83211);Assert.assertEquals("null", JSON.toJSONString(Float.POSITIVE_INFINITY));
        __CLR4_1_101s7c1s7cluszwexx.R.inc(83212);Assert.assertEquals("null", JSON.toJSONString(Float.NEGATIVE_INFINITY));
        __CLR4_1_101s7c1s7cluszwexx.R.inc(83213);Assert.assertEquals("null", JSON.toJSONString(Double.NaN));
        __CLR4_1_101s7c1s7cluszwexx.R.inc(83214);Assert.assertEquals("null", JSON.toJSONString(Double.POSITIVE_INFINITY));
        __CLR4_1_101s7c1s7cluszwexx.R.inc(83215);Assert.assertEquals("null", JSON.toJSONString(Double.NEGATIVE_INFINITY));
        __CLR4_1_101s7c1s7cluszwexx.R.inc(83216);Assert.assertEquals("null", JSON.toJSONString(new Float(Float.NaN)));
        __CLR4_1_101s7c1s7cluszwexx.R.inc(83217);Assert.assertEquals("null", JSON.toJSONString(new Double(Double.NaN)));
        
        //Assert.assertEquals("{\"f1\":null,\"f2\":null}", JSON.toJSONString(new Bean()));
        //Assert.assertEquals("{\"f1\":null,\"f2\":null}", JSON.toJSONString(new Bean(Float.POSITIVE_INFINITY, Double.POSITIVE_INFINITY)));
        //Assert.assertEquals("{\"f1\":null,\"f2\":null}", JSON.toJSONString(new Bean(Float.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY)));
        __CLR4_1_101s7c1s7cluszwexx.R.inc(83218);Assert.assertEquals(null, JSON.parseObject(JSON.toJSONString(new Bean())).get("f1"));
        __CLR4_1_101s7c1s7cluszwexx.R.inc(83219);Assert.assertEquals(null, JSON.parseObject(JSON.toJSONString(new Bean())).get("f2"));
        
        __CLR4_1_101s7c1s7cluszwexx.R.inc(83220);Assert.assertEquals(null, JSON.parseObject(JSON.toJSONString(new Bean(Float.POSITIVE_INFINITY, Double.POSITIVE_INFINITY))).get("f1"));
        __CLR4_1_101s7c1s7cluszwexx.R.inc(83221);Assert.assertEquals(null, JSON.parseObject(JSON.toJSONString(new Bean(Float.POSITIVE_INFINITY, Double.POSITIVE_INFINITY))).get("f2"));
        
        __CLR4_1_101s7c1s7cluszwexx.R.inc(83222);Assert.assertEquals(null, JSON.parseObject(JSON.toJSONString(new Bean(Float.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY))).get("f1"));
        __CLR4_1_101s7c1s7cluszwexx.R.inc(83223);Assert.assertEquals(null, JSON.parseObject(JSON.toJSONString(new Bean(Float.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY))).get("f2"));
    }finally{__CLR4_1_101s7c1s7cluszwexx.R.flushNeeded();}}

    public static class Bean {

        private float  f1 = Float.NaN;
        private double f2 = Double.NaN;
        
        public Bean() {try{__CLR4_1_101s7c1s7cluszwexx.R.inc(83224);
            
        }finally{__CLR4_1_101s7c1s7cluszwexx.R.flushNeeded();}}
        
        public Bean(float f1, double f2) {try{__CLR4_1_101s7c1s7cluszwexx.R.inc(83225);
            __CLR4_1_101s7c1s7cluszwexx.R.inc(83226);this.f1 = f1;
            __CLR4_1_101s7c1s7cluszwexx.R.inc(83227);this.f2 = f2;
        }finally{__CLR4_1_101s7c1s7cluszwexx.R.flushNeeded();}}

        public float getF1() {try{__CLR4_1_101s7c1s7cluszwexx.R.inc(83228);
            __CLR4_1_101s7c1s7cluszwexx.R.inc(83229);return f1;
        }finally{__CLR4_1_101s7c1s7cluszwexx.R.flushNeeded();}}

        public void setF1(float f1) {try{__CLR4_1_101s7c1s7cluszwexx.R.inc(83230);
            __CLR4_1_101s7c1s7cluszwexx.R.inc(83231);this.f1 = f1;
        }finally{__CLR4_1_101s7c1s7cluszwexx.R.flushNeeded();}}

        public double getF2() {try{__CLR4_1_101s7c1s7cluszwexx.R.inc(83232);
            __CLR4_1_101s7c1s7cluszwexx.R.inc(83233);return f2;
        }finally{__CLR4_1_101s7c1s7cluszwexx.R.flushNeeded();}}

        public void setF2(double f2) {try{__CLR4_1_101s7c1s7cluszwexx.R.inc(83234);
            __CLR4_1_101s7c1s7cluszwexx.R.inc(83235);this.f2 = f2;
        }finally{__CLR4_1_101s7c1s7cluszwexx.R.flushNeeded();}}

    }
}
