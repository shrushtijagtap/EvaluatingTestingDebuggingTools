/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Issue101_field_NoneASM extends TestCase {static class __CLR4_5_217fr17frlusvn7ox{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,56314,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issure() throws Exception {__CLR4_5_217fr17frlusvn7ox.R.globalSliceStart(getClass().getName(),56295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2brgkeh17fr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217fr17frlusvn7ox.R.rethrow($CLV_t2$);}finally{__CLR4_5_217fr17frlusvn7ox.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue101_field_NoneASM.test_for_issure",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56295,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2brgkeh17fr() throws Exception{try{__CLR4_5_217fr17frlusvn7ox.R.inc(56295);
        __CLR4_5_217fr17frlusvn7ox.R.inc(56296);VO vo = new VO();
        __CLR4_5_217fr17frlusvn7ox.R.inc(56297);vo.a = new Object();
        __CLR4_5_217fr17frlusvn7ox.R.inc(56298);vo.b = vo.a;
        __CLR4_5_217fr17frlusvn7ox.R.inc(56299);vo.c = vo.a;
        
        __CLR4_5_217fr17frlusvn7ox.R.inc(56300);String text = JSON.toJSONString(vo);
        __CLR4_5_217fr17frlusvn7ox.R.inc(56301);Assert.assertEquals("{\"a\":{},\"b\":{},\"c\":{\"$ref\":\"$.b\"}}", text);
    }finally{__CLR4_5_217fr17frlusvn7ox.R.flushNeeded();}}

    private static class VO {

        private Object a;
        private Object b;
        private Object c;

        public Object getA() {try{__CLR4_5_217fr17frlusvn7ox.R.inc(56302);
            __CLR4_5_217fr17frlusvn7ox.R.inc(56303);return a;
        }finally{__CLR4_5_217fr17frlusvn7ox.R.flushNeeded();}}

        public void setA(Object a) {try{__CLR4_5_217fr17frlusvn7ox.R.inc(56304);
            __CLR4_5_217fr17frlusvn7ox.R.inc(56305);this.a = a;
        }finally{__CLR4_5_217fr17frlusvn7ox.R.flushNeeded();}}

        @JSONField(serialzeFeatures=SerializerFeature.DisableCircularReferenceDetect)
        public Object getB() {try{__CLR4_5_217fr17frlusvn7ox.R.inc(56306);
            __CLR4_5_217fr17frlusvn7ox.R.inc(56307);return b;
        }finally{__CLR4_5_217fr17frlusvn7ox.R.flushNeeded();}}

        public void setB(Object b) {try{__CLR4_5_217fr17frlusvn7ox.R.inc(56308);
            __CLR4_5_217fr17frlusvn7ox.R.inc(56309);this.b = b;
        }finally{__CLR4_5_217fr17frlusvn7ox.R.flushNeeded();}}

        public Object getC() {try{__CLR4_5_217fr17frlusvn7ox.R.inc(56310);
            __CLR4_5_217fr17frlusvn7ox.R.inc(56311);return c;
        }finally{__CLR4_5_217fr17frlusvn7ox.R.flushNeeded();}}

        public void setC(Object c) {try{__CLR4_5_217fr17frlusvn7ox.R.inc(56312);
            __CLR4_5_217fr17frlusvn7ox.R.inc(56313);this.c = c;
        }finally{__CLR4_5_217fr17frlusvn7ox.R.flushNeeded();}}

    }
}
