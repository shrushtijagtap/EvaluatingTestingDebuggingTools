/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.ParserConfig;

public class AbstractSerializeTest2 extends TestCase {static class __CLR4_5_21kfn1kfnlusyju1s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,73175,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected void setUp() throws Exception {try{__CLR4_5_21kfn1kfnlusyju1s.R.inc(73139);
        __CLR4_5_21kfn1kfnlusyju1s.R.inc(73140);ParserConfig.global.addAccept("com.alibaba.json.bvt.bug.AbstractSerializeTest2");
        __CLR4_5_21kfn1kfnlusyju1s.R.inc(73141);ParserConfig.global.addAccept("com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2");
    }finally{__CLR4_5_21kfn1kfnlusyju1s.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_5_21kfn1kfnlusyju1s.R.inc(73142);
        __CLR4_5_21kfn1kfnlusyju1s.R.inc(73143);ParserConfig.getGlobalInstance().putDeserializer(A.class, null);
    }finally{__CLR4_5_21kfn1kfnlusyju1s.R.flushNeeded();}}

    public void test_mapping_0() throws Exception {__CLR4_5_21kfn1kfnlusyju1s.R.globalSliceStart(getClass().getName(),73144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21hbdsp1kfs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kfn1kfnlusyju1s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kfn1kfnlusyju1s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2.test_mapping_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73144,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21hbdsp1kfs() throws Exception{try{__CLR4_5_21kfn1kfnlusyju1s.R.inc(73144);
        __CLR4_5_21kfn1kfnlusyju1s.R.inc(73145);String text = "{\"@type\":\"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2$A\"}";

        __CLR4_5_21kfn1kfnlusyju1s.R.inc(73146);B b = (B) JSON.parse(text);
        __CLR4_5_21kfn1kfnlusyju1s.R.inc(73147);Assert.assertNotNull(b);
    }finally{__CLR4_5_21kfn1kfnlusyju1s.R.flushNeeded();}}

    public void test_mapping_1() throws Exception {__CLR4_5_21kfn1kfnlusyju1s.R.globalSliceStart(getClass().getName(),73148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24qbcl61kfw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kfn1kfnlusyju1s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kfn1kfnlusyju1s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2.test_mapping_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73148,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24qbcl61kfw() throws Exception{try{__CLR4_5_21kfn1kfnlusyju1s.R.inc(73148);
        __CLR4_5_21kfn1kfnlusyju1s.R.inc(73149);String text = "{\"@type\":\"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2$A\",\"id\":123}";

        __CLR4_5_21kfn1kfnlusyju1s.R.inc(73150);B b = (B) JSON.parse(text);
        __CLR4_5_21kfn1kfnlusyju1s.R.inc(73151);Assert.assertNotNull(b);
        __CLR4_5_21kfn1kfnlusyju1s.R.inc(73152);Assert.assertEquals(123, b.getId());
    }finally{__CLR4_5_21kfn1kfnlusyju1s.R.flushNeeded();}}

    public void test_mapping_2() throws Exception {__CLR4_5_21kfn1kfnlusyju1s.R.globalSliceStart(getClass().getName(),73153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27zbbdn1kg1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kfn1kfnlusyju1s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kfn1kfnlusyju1s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2.test_mapping_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73153,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27zbbdn1kg1() throws Exception{try{__CLR4_5_21kfn1kfnlusyju1s.R.inc(73153);
        __CLR4_5_21kfn1kfnlusyju1s.R.inc(73154);String text = "{\"@type\":\"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2$A\",\"id\":234,\"name\":\"abc\"}";

        __CLR4_5_21kfn1kfnlusyju1s.R.inc(73155);B b = (B) JSON.parse(text);
        __CLR4_5_21kfn1kfnlusyju1s.R.inc(73156);Assert.assertNotNull(b);
        __CLR4_5_21kfn1kfnlusyju1s.R.inc(73157);Assert.assertEquals(234, b.getId());
        __CLR4_5_21kfn1kfnlusyju1s.R.inc(73158);Assert.assertEquals("abc", b.getName());
    }finally{__CLR4_5_21kfn1kfnlusyju1s.R.flushNeeded();}}

    public void test_mapping_group() throws Exception {__CLR4_5_21kfn1kfnlusyju1s.R.globalSliceStart(getClass().getName(),73159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jx3f2g1kg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kfn1kfnlusyju1s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kfn1kfnlusyju1s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2.test_mapping_group",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73159,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jx3f2g1kg7() throws Exception{try{__CLR4_5_21kfn1kfnlusyju1s.R.inc(73159);
        __CLR4_5_21kfn1kfnlusyju1s.R.inc(73160);String text = "{\"a\":{\"id\":234,\"name\":\"abc\"}}";

        __CLR4_5_21kfn1kfnlusyju1s.R.inc(73161);G g = JSON.parseObject(text, G.class);
        __CLR4_5_21kfn1kfnlusyju1s.R.inc(73162);Assert.assertTrue(g.getA() instanceof B);
    }finally{__CLR4_5_21kfn1kfnlusyju1s.R.flushNeeded();}}

    public static class G {

        private A a;

        public A getA() {try{__CLR4_5_21kfn1kfnlusyju1s.R.inc(73163);
            __CLR4_5_21kfn1kfnlusyju1s.R.inc(73164);return a;
        }finally{__CLR4_5_21kfn1kfnlusyju1s.R.flushNeeded();}}

        public void setA(A a) {try{__CLR4_5_21kfn1kfnlusyju1s.R.inc(73165);
            __CLR4_5_21kfn1kfnlusyju1s.R.inc(73166);this.a = a;
        }finally{__CLR4_5_21kfn1kfnlusyju1s.R.flushNeeded();}}

    }

    @JSONType(mappingTo = B.class)
    public static abstract class A {

        private int id;

        public int getId() {try{__CLR4_5_21kfn1kfnlusyju1s.R.inc(73167);
            __CLR4_5_21kfn1kfnlusyju1s.R.inc(73168);return id;
        }finally{__CLR4_5_21kfn1kfnlusyju1s.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21kfn1kfnlusyju1s.R.inc(73169);
            __CLR4_5_21kfn1kfnlusyju1s.R.inc(73170);this.id = id;
        }finally{__CLR4_5_21kfn1kfnlusyju1s.R.flushNeeded();}}
    }

    public static class B extends A {

        private String name;

        public String getName() {try{__CLR4_5_21kfn1kfnlusyju1s.R.inc(73171);
            __CLR4_5_21kfn1kfnlusyju1s.R.inc(73172);return name;
        }finally{__CLR4_5_21kfn1kfnlusyju1s.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21kfn1kfnlusyju1s.R.inc(73173);
            __CLR4_5_21kfn1kfnlusyju1s.R.inc(73174);this.name = name;
        }finally{__CLR4_5_21kfn1kfnlusyju1s.R.flushNeeded();}}
    }
}
