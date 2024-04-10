/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.feature;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class FeaturesTest3 extends TestCase {static class __CLR4_5_2194g194glusyjskw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,58492,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_2194g194glusyjskw.R.globalSliceStart(getClass().getName(),58480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp2194g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2194g194glusyjskw.R.rethrow($CLV_t2$);}finally{__CLR4_5_2194g194glusyjskw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.feature.FeaturesTest3.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58480,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp2194g() throws Exception{try{__CLR4_5_2194g194glusyjskw.R.inc(58480);
        __CLR4_5_2194g194glusyjskw.R.inc(58481);SerializeConfig config = new SerializeConfig();
        __CLR4_5_2194g194glusyjskw.R.inc(58482);config.setAsmEnable(false);
        
        __CLR4_5_2194g194glusyjskw.R.inc(58483);String text = JSON.toJSONString(new Entity(), config);
        __CLR4_5_2194g194glusyjskw.R.inc(58484);Assert.assertEquals("{\"value\":0}", text);
    }finally{__CLR4_5_2194g194glusyjskw.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_5_2194g194glusyjskw.R.globalSliceStart(getClass().getName(),58485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl194l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2194g194glusyjskw.R.rethrow($CLV_t2$);}finally{__CLR4_5_2194g194glusyjskw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.feature.FeaturesTest3.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58485,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl194l() throws Exception{try{__CLR4_5_2194g194glusyjskw.R.inc(58485);
        __CLR4_5_2194g194glusyjskw.R.inc(58486);SerializeConfig config = new SerializeConfig();
        __CLR4_5_2194g194glusyjskw.R.inc(58487);config.setAsmEnable(true);
        
        __CLR4_5_2194g194glusyjskw.R.inc(58488);String text = JSON.toJSONString(new Entity(), config);
        __CLR4_5_2194g194glusyjskw.R.inc(58489);Assert.assertEquals("{\"value\":0}", text);
    }finally{__CLR4_5_2194g194glusyjskw.R.flushNeeded();}}

    public static class Entity {

        private Integer value;

        @JSONField(serialzeFeatures = { SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullNumberAsZero })
        public Integer getValue() {try{__CLR4_5_2194g194glusyjskw.R.inc(58490);
            __CLR4_5_2194g194glusyjskw.R.inc(58491);return value;
        }finally{__CLR4_5_2194g194glusyjskw.R.flushNeeded();}}


    }
}
