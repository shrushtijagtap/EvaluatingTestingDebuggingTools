/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.mixins;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;
import org.junit.Assert;

public class MixInRemovalTest extends TestCase {static class __CLR4_5_21fo21fo2lusvnc6n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,66990,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static class BaseClass {
        public int a;
        public int b;

        public  BaseClass() {try{__CLR4_5_21fo21fo2lusvnc6n.R.inc(66962);

        }finally{__CLR4_5_21fo21fo2lusvnc6n.R.flushNeeded();}}

        public BaseClass(int a, int b) {try{__CLR4_5_21fo21fo2lusvnc6n.R.inc(66963);
            __CLR4_5_21fo21fo2lusvnc6n.R.inc(66964);this.a = a;
            __CLR4_5_21fo21fo2lusvnc6n.R.inc(66965);this.b = b;
        }finally{__CLR4_5_21fo21fo2lusvnc6n.R.flushNeeded();}}
    }

    class MixIn1 {
        @JSONField(name = "apple")
        public int a;
        @JSONField(name = "banana")
        public int b;
    }

    class MixIn2 {
        @JSONField(name = "ariston")
        public int a;
        @JSONField(name = "brilliant")
        public int b;
    }

    public void test_mixInRemoval_serialize() throws Exception {__CLR4_5_21fo21fo2lusvnc6n.R.globalSliceStart(getClass().getName(),66966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263jwtc1fo6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fo21fo2lusvnc6n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fo21fo2lusvnc6n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixInRemovalTest.test_mixInRemoval_serialize",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66966,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263jwtc1fo6() throws Exception{try{__CLR4_5_21fo21fo2lusvnc6n.R.inc(66966);
        __CLR4_5_21fo21fo2lusvnc6n.R.inc(66967);BaseClass base = new BaseClass(1, 2);
        __CLR4_5_21fo21fo2lusvnc6n.R.inc(66968);Assert.assertEquals("{\"a\":1,\"b\":2}", JSON.toJSONString(base));

        __CLR4_5_21fo21fo2lusvnc6n.R.inc(66969);JSON.addMixInAnnotations(BaseClass.class, MixIn1.class);
        __CLR4_5_21fo21fo2lusvnc6n.R.inc(66970);Assert.assertEquals("{\"apple\":1,\"banana\":2}", JSON.toJSONString(base));
        __CLR4_5_21fo21fo2lusvnc6n.R.inc(66971);JSON.removeMixInAnnotations(BaseClass.class);

        __CLR4_5_21fo21fo2lusvnc6n.R.inc(66972);JSON.addMixInAnnotations(BaseClass.class, MixIn2.class);
        __CLR4_5_21fo21fo2lusvnc6n.R.inc(66973);Assert.assertEquals("{\"ariston\":1,\"brilliant\":2}", JSON.toJSONString(base));
        __CLR4_5_21fo21fo2lusvnc6n.R.inc(66974);JSON.removeMixInAnnotations(BaseClass.class);

        __CLR4_5_21fo21fo2lusvnc6n.R.inc(66975);Assert.assertEquals("{\"a\":1,\"b\":2}", JSON.toJSONString(base));
    }finally{__CLR4_5_21fo21fo2lusvnc6n.R.flushNeeded();}}

    public void test_mixInRemoval_deserialize() throws Exception {__CLR4_5_21fo21fo2lusvnc6n.R.globalSliceStart(getClass().getName(),66976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oejbmn1fog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fo21fo2lusvnc6n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fo21fo2lusvnc6n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixInRemovalTest.test_mixInRemoval_deserialize",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66976,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oejbmn1fog() throws Exception{try{__CLR4_5_21fo21fo2lusvnc6n.R.inc(66976);
        __CLR4_5_21fo21fo2lusvnc6n.R.inc(66977);BaseClass base = JSON.parseObject("{\"a\":1,\"b\":2}", BaseClass.class);
        __CLR4_5_21fo21fo2lusvnc6n.R.inc(66978);Assert.assertEquals(1, base.a);
        __CLR4_5_21fo21fo2lusvnc6n.R.inc(66979);Assert.assertEquals(2, base.b);

        __CLR4_5_21fo21fo2lusvnc6n.R.inc(66980);JSON.addMixInAnnotations(BaseClass.class, MixIn1.class);
        __CLR4_5_21fo21fo2lusvnc6n.R.inc(66981);BaseClass base2 = JSON.parseObject("{\"apple\":3,\"banana\":4}", BaseClass.class);
        __CLR4_5_21fo21fo2lusvnc6n.R.inc(66982);Assert.assertEquals(3, base2.a);
        __CLR4_5_21fo21fo2lusvnc6n.R.inc(66983);Assert.assertEquals(4, base2.b);
        __CLR4_5_21fo21fo2lusvnc6n.R.inc(66984);JSON.removeMixInAnnotations(BaseClass.class);

        __CLR4_5_21fo21fo2lusvnc6n.R.inc(66985);JSON.addMixInAnnotations(BaseClass.class, MixIn2.class);
        __CLR4_5_21fo21fo2lusvnc6n.R.inc(66986);BaseClass base3 = JSON.parseObject("{\"ariston\":5,\"brilliant\":6}", BaseClass.class);
        __CLR4_5_21fo21fo2lusvnc6n.R.inc(66987);Assert.assertEquals(5, base3.a);
        __CLR4_5_21fo21fo2lusvnc6n.R.inc(66988);Assert.assertEquals(6, base3.b);
        __CLR4_5_21fo21fo2lusvnc6n.R.inc(66989);JSON.removeMixInAnnotations(BaseClass.class);
    }finally{__CLR4_5_21fo21fo2lusvnc6n.R.flushNeeded();}}
}
