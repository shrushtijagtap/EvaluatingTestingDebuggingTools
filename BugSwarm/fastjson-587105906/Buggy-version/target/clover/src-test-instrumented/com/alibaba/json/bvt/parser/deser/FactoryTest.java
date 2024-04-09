/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;

public class FactoryTest extends TestCase {static class __CLR4_1_101ksd1ksdlusqkfw6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,73641,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_factory() throws Exception {__CLR4_1_101ksd1ksdlusqkfw6.R.globalSliceStart(getClass().getName(),73597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hy95vo1ksd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ksd1ksdlusqkfw6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ksd1ksdlusqkfw6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.FactoryTest.test_factory",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),73597,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hy95vo1ksd() throws Exception{try{__CLR4_1_101ksd1ksdlusqkfw6.R.inc(73597);
        __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73598);VO vo = JSON.parseObject("{\"b\":true,\"i\":33,\"l\":34,\"f\":45.}", VO.class);
        __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73599);Assert.assertEquals(true, vo.isB());
        __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73600);Assert.assertEquals(33, vo.getI());
        __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73601);Assert.assertEquals(34L, vo.getL());
        __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73602);Assert.assertTrue(45f == vo.getF());
        __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73603);JSON.parseObject("{\"b\":1,\"i\":33,\"l\":34,\"f\":45.}", VO.class);
    }finally{__CLR4_1_101ksd1ksdlusqkfw6.R.flushNeeded();}}
    
    public void test_factory1() throws Exception {__CLR4_1_101ksd1ksdlusqkfw6.R.globalSliceStart(getClass().getName(),73604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rsfwaj1ksk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ksd1ksdlusqkfw6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ksd1ksdlusqkfw6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.FactoryTest.test_factory1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),73604,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rsfwaj1ksk() throws Exception{try{__CLR4_1_101ksd1ksdlusqkfw6.R.inc(73604);
        __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73605);V1 vo = JSON.parseObject("{\"b\":true,\"i\":33,\"l\":34,\"f\":45.}", V1.class);
        __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73606);Assert.assertEquals(true, vo.isB());
        __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73607);Assert.assertEquals(33, vo.getI());
        __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73608);Assert.assertEquals(34L, vo.getL());
        __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73609);Assert.assertTrue(45f == vo.getF());
        __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73610);JSON.parseObject("{\"b\":1,\"i\":33,\"l\":34,\"f\":45.}", V1.class);
        
        // JSON.parseObject("{\"b\":true,\"i\":33,\"l\":34,\"f\":45.}").toJavaObject(V1.class);
    }finally{__CLR4_1_101ksd1ksdlusqkfw6.R.flushNeeded();}}

    public static class VO {

        private final boolean b;
        private final int     i;
        private final long    l;
        private final float   f;

        @JSONCreator
        public VO(@JSONField(name = "b") boolean b, @JSONField(name = "i") int i, @JSONField(name = "l") long l,
                  @JSONField(name = "f") float f){
            super();__CLR4_1_101ksd1ksdlusqkfw6.R.inc(73612);try{__CLR4_1_101ksd1ksdlusqkfw6.R.inc(73611);
            __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73613);this.b = b;
            __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73614);this.i = i;
            __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73615);this.l = l;
            __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73616);this.f = f;
        }finally{__CLR4_1_101ksd1ksdlusqkfw6.R.flushNeeded();}}

        public float getF() {try{__CLR4_1_101ksd1ksdlusqkfw6.R.inc(73617);
            __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73618);return f;
        }finally{__CLR4_1_101ksd1ksdlusqkfw6.R.flushNeeded();}}

        public boolean isB() {try{__CLR4_1_101ksd1ksdlusqkfw6.R.inc(73619);
            __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73620);return b;
        }finally{__CLR4_1_101ksd1ksdlusqkfw6.R.flushNeeded();}}

        public int getI() {try{__CLR4_1_101ksd1ksdlusqkfw6.R.inc(73621);
            __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73622);return i;
        }finally{__CLR4_1_101ksd1ksdlusqkfw6.R.flushNeeded();}}

        public long getL() {try{__CLR4_1_101ksd1ksdlusqkfw6.R.inc(73623);
            __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73624);return l;
        }finally{__CLR4_1_101ksd1ksdlusqkfw6.R.flushNeeded();}}

    }

    public static class V1 {

        private boolean b;
        private int     i;
        private long    l;
        private float   f;
        
        private V1(boolean b) {try{__CLR4_1_101ksd1ksdlusqkfw6.R.inc(73625);
            __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73626);this.b = b;
        }finally{__CLR4_1_101ksd1ksdlusqkfw6.R.flushNeeded();}}

        @JSONCreator
        public static V1 create(@JSONField(name = "b") boolean b, @JSONField(name = "i") int i,
                                @JSONField(name = "l") long l, @JSONField(name = "f") float f) {try{__CLR4_1_101ksd1ksdlusqkfw6.R.inc(73627);
            __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73628);V1 v = new V1(b);
            __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73629);v.i = i;
            __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73630);v.l = l;
            __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73631);v.f = f;

            __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73632);return v;
        }finally{__CLR4_1_101ksd1ksdlusqkfw6.R.flushNeeded();}}

        public float getF() {try{__CLR4_1_101ksd1ksdlusqkfw6.R.inc(73633);
            __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73634);return f;
        }finally{__CLR4_1_101ksd1ksdlusqkfw6.R.flushNeeded();}}

        public boolean isB() {try{__CLR4_1_101ksd1ksdlusqkfw6.R.inc(73635);
            __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73636);return b;
        }finally{__CLR4_1_101ksd1ksdlusqkfw6.R.flushNeeded();}}

        public int getI() {try{__CLR4_1_101ksd1ksdlusqkfw6.R.inc(73637);
            __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73638);return i;
        }finally{__CLR4_1_101ksd1ksdlusqkfw6.R.flushNeeded();}}

        public long getL() {try{__CLR4_1_101ksd1ksdlusqkfw6.R.inc(73639);
            __CLR4_1_101ksd1ksdlusqkfw6.R.inc(73640);return l;
        }finally{__CLR4_1_101ksd1ksdlusqkfw6.R.flushNeeded();}}

    }
}
