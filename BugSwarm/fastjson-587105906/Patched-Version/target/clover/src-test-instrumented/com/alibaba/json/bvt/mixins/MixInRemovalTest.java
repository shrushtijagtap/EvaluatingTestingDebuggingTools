/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.mixins;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;
import org.junit.Assert;

public class MixInRemovalTest extends TestCase {static class __CLR4_5_21epu1epulusyjtgy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,65758,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static class BaseClass {
        public int a;
        public int b;

        public  BaseClass() {try{__CLR4_5_21epu1epulusyjtgy.R.inc(65730);

        }finally{__CLR4_5_21epu1epulusyjtgy.R.flushNeeded();}}

        public BaseClass(int a, int b) {try{__CLR4_5_21epu1epulusyjtgy.R.inc(65731);
            __CLR4_5_21epu1epulusyjtgy.R.inc(65732);this.a = a;
            __CLR4_5_21epu1epulusyjtgy.R.inc(65733);this.b = b;
        }finally{__CLR4_5_21epu1epulusyjtgy.R.flushNeeded();}}
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

    public void test_mixInRemoval_serialize() throws Exception {__CLR4_5_21epu1epulusyjtgy.R.globalSliceStart(getClass().getName(),65734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263jwtc1epy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21epu1epulusyjtgy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21epu1epulusyjtgy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixInRemovalTest.test_mixInRemoval_serialize",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65734,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263jwtc1epy() throws Exception{try{__CLR4_5_21epu1epulusyjtgy.R.inc(65734);
        __CLR4_5_21epu1epulusyjtgy.R.inc(65735);BaseClass base = new BaseClass(1, 2);
        __CLR4_5_21epu1epulusyjtgy.R.inc(65736);Assert.assertEquals("{\"a\":1,\"b\":2}", JSON.toJSONString(base));

        __CLR4_5_21epu1epulusyjtgy.R.inc(65737);JSON.addMixInAnnotations(BaseClass.class, MixIn1.class);
        __CLR4_5_21epu1epulusyjtgy.R.inc(65738);Assert.assertEquals("{\"apple\":1,\"banana\":2}", JSON.toJSONString(base));
        __CLR4_5_21epu1epulusyjtgy.R.inc(65739);JSON.removeMixInAnnotations(BaseClass.class);

        __CLR4_5_21epu1epulusyjtgy.R.inc(65740);JSON.addMixInAnnotations(BaseClass.class, MixIn2.class);
        __CLR4_5_21epu1epulusyjtgy.R.inc(65741);Assert.assertEquals("{\"ariston\":1,\"brilliant\":2}", JSON.toJSONString(base));
        __CLR4_5_21epu1epulusyjtgy.R.inc(65742);JSON.removeMixInAnnotations(BaseClass.class);

        __CLR4_5_21epu1epulusyjtgy.R.inc(65743);Assert.assertEquals("{\"a\":1,\"b\":2}", JSON.toJSONString(base));
    }finally{__CLR4_5_21epu1epulusyjtgy.R.flushNeeded();}}

    public void test_mixInRemoval_deserialize() throws Exception {__CLR4_5_21epu1epulusyjtgy.R.globalSliceStart(getClass().getName(),65744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oejbmn1eq8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21epu1epulusyjtgy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21epu1epulusyjtgy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixInRemovalTest.test_mixInRemoval_deserialize",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65744,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oejbmn1eq8() throws Exception{try{__CLR4_5_21epu1epulusyjtgy.R.inc(65744);
        __CLR4_5_21epu1epulusyjtgy.R.inc(65745);BaseClass base = JSON.parseObject("{\"a\":1,\"b\":2}", BaseClass.class);
        __CLR4_5_21epu1epulusyjtgy.R.inc(65746);Assert.assertEquals(1, base.a);
        __CLR4_5_21epu1epulusyjtgy.R.inc(65747);Assert.assertEquals(2, base.b);

        __CLR4_5_21epu1epulusyjtgy.R.inc(65748);JSON.addMixInAnnotations(BaseClass.class, MixIn1.class);
        __CLR4_5_21epu1epulusyjtgy.R.inc(65749);BaseClass base2 = JSON.parseObject("{\"apple\":3,\"banana\":4}", BaseClass.class);
        __CLR4_5_21epu1epulusyjtgy.R.inc(65750);Assert.assertEquals(3, base2.a);
        __CLR4_5_21epu1epulusyjtgy.R.inc(65751);Assert.assertEquals(4, base2.b);
        __CLR4_5_21epu1epulusyjtgy.R.inc(65752);JSON.removeMixInAnnotations(BaseClass.class);

        __CLR4_5_21epu1epulusyjtgy.R.inc(65753);JSON.addMixInAnnotations(BaseClass.class, MixIn2.class);
        __CLR4_5_21epu1epulusyjtgy.R.inc(65754);BaseClass base3 = JSON.parseObject("{\"ariston\":5,\"brilliant\":6}", BaseClass.class);
        __CLR4_5_21epu1epulusyjtgy.R.inc(65755);Assert.assertEquals(5, base3.a);
        __CLR4_5_21epu1epulusyjtgy.R.inc(65756);Assert.assertEquals(6, base3.b);
        __CLR4_5_21epu1epulusyjtgy.R.inc(65757);JSON.removeMixInAnnotations(BaseClass.class);
    }finally{__CLR4_5_21epu1epulusyjtgy.R.flushNeeded();}}
}
