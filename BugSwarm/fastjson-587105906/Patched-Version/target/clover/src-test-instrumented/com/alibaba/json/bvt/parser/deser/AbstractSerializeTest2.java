/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.ParserConfig;

public class AbstractSerializeTest2 extends TestCase {static class __CLR4_5_21ldv1ldvlusvne6b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,74407,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected void setUp() throws Exception {try{__CLR4_5_21ldv1ldvlusvne6b.R.inc(74371);
        __CLR4_5_21ldv1ldvlusvne6b.R.inc(74372);ParserConfig.global.addAccept("com.alibaba.json.bvt.bug.AbstractSerializeTest2");
        __CLR4_5_21ldv1ldvlusvne6b.R.inc(74373);ParserConfig.global.addAccept("com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2");
    }finally{__CLR4_5_21ldv1ldvlusvne6b.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_5_21ldv1ldvlusvne6b.R.inc(74374);
        __CLR4_5_21ldv1ldvlusvne6b.R.inc(74375);ParserConfig.getGlobalInstance().putDeserializer(A.class, null);
    }finally{__CLR4_5_21ldv1ldvlusvne6b.R.flushNeeded();}}

    public void test_mapping_0() throws Exception {__CLR4_5_21ldv1ldvlusvne6b.R.globalSliceStart(getClass().getName(),74376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21hbdsp1le0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ldv1ldvlusvne6b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ldv1ldvlusvne6b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2.test_mapping_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74376,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21hbdsp1le0() throws Exception{try{__CLR4_5_21ldv1ldvlusvne6b.R.inc(74376);
        __CLR4_5_21ldv1ldvlusvne6b.R.inc(74377);String text = "{\"@type\":\"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2$A\"}";

        __CLR4_5_21ldv1ldvlusvne6b.R.inc(74378);B b = (B) JSON.parse(text);
        __CLR4_5_21ldv1ldvlusvne6b.R.inc(74379);Assert.assertNotNull(b);
    }finally{__CLR4_5_21ldv1ldvlusvne6b.R.flushNeeded();}}

    public void test_mapping_1() throws Exception {__CLR4_5_21ldv1ldvlusvne6b.R.globalSliceStart(getClass().getName(),74380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24qbcl61le4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ldv1ldvlusvne6b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ldv1ldvlusvne6b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2.test_mapping_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74380,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24qbcl61le4() throws Exception{try{__CLR4_5_21ldv1ldvlusvne6b.R.inc(74380);
        __CLR4_5_21ldv1ldvlusvne6b.R.inc(74381);String text = "{\"@type\":\"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2$A\",\"id\":123}";

        __CLR4_5_21ldv1ldvlusvne6b.R.inc(74382);B b = (B) JSON.parse(text);
        __CLR4_5_21ldv1ldvlusvne6b.R.inc(74383);Assert.assertNotNull(b);
        __CLR4_5_21ldv1ldvlusvne6b.R.inc(74384);Assert.assertEquals(123, b.getId());
    }finally{__CLR4_5_21ldv1ldvlusvne6b.R.flushNeeded();}}

    public void test_mapping_2() throws Exception {__CLR4_5_21ldv1ldvlusvne6b.R.globalSliceStart(getClass().getName(),74385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27zbbdn1le9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ldv1ldvlusvne6b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ldv1ldvlusvne6b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2.test_mapping_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74385,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27zbbdn1le9() throws Exception{try{__CLR4_5_21ldv1ldvlusvne6b.R.inc(74385);
        __CLR4_5_21ldv1ldvlusvne6b.R.inc(74386);String text = "{\"@type\":\"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2$A\",\"id\":234,\"name\":\"abc\"}";

        __CLR4_5_21ldv1ldvlusvne6b.R.inc(74387);B b = (B) JSON.parse(text);
        __CLR4_5_21ldv1ldvlusvne6b.R.inc(74388);Assert.assertNotNull(b);
        __CLR4_5_21ldv1ldvlusvne6b.R.inc(74389);Assert.assertEquals(234, b.getId());
        __CLR4_5_21ldv1ldvlusvne6b.R.inc(74390);Assert.assertEquals("abc", b.getName());
    }finally{__CLR4_5_21ldv1ldvlusvne6b.R.flushNeeded();}}

    public void test_mapping_group() throws Exception {__CLR4_5_21ldv1ldvlusvne6b.R.globalSliceStart(getClass().getName(),74391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jx3f2g1lef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ldv1ldvlusvne6b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ldv1ldvlusvne6b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2.test_mapping_group",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74391,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jx3f2g1lef() throws Exception{try{__CLR4_5_21ldv1ldvlusvne6b.R.inc(74391);
        __CLR4_5_21ldv1ldvlusvne6b.R.inc(74392);String text = "{\"a\":{\"id\":234,\"name\":\"abc\"}}";

        __CLR4_5_21ldv1ldvlusvne6b.R.inc(74393);G g = JSON.parseObject(text, G.class);
        __CLR4_5_21ldv1ldvlusvne6b.R.inc(74394);Assert.assertTrue(g.getA() instanceof B);
    }finally{__CLR4_5_21ldv1ldvlusvne6b.R.flushNeeded();}}

    public static class G {

        private A a;

        public A getA() {try{__CLR4_5_21ldv1ldvlusvne6b.R.inc(74395);
            __CLR4_5_21ldv1ldvlusvne6b.R.inc(74396);return a;
        }finally{__CLR4_5_21ldv1ldvlusvne6b.R.flushNeeded();}}

        public void setA(A a) {try{__CLR4_5_21ldv1ldvlusvne6b.R.inc(74397);
            __CLR4_5_21ldv1ldvlusvne6b.R.inc(74398);this.a = a;
        }finally{__CLR4_5_21ldv1ldvlusvne6b.R.flushNeeded();}}

    }

    @JSONType(mappingTo = B.class)
    public static abstract class A {

        private int id;

        public int getId() {try{__CLR4_5_21ldv1ldvlusvne6b.R.inc(74399);
            __CLR4_5_21ldv1ldvlusvne6b.R.inc(74400);return id;
        }finally{__CLR4_5_21ldv1ldvlusvne6b.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21ldv1ldvlusvne6b.R.inc(74401);
            __CLR4_5_21ldv1ldvlusvne6b.R.inc(74402);this.id = id;
        }finally{__CLR4_5_21ldv1ldvlusvne6b.R.flushNeeded();}}
    }

    public static class B extends A {

        private String name;

        public String getName() {try{__CLR4_5_21ldv1ldvlusvne6b.R.inc(74403);
            __CLR4_5_21ldv1ldvlusvne6b.R.inc(74404);return name;
        }finally{__CLR4_5_21ldv1ldvlusvne6b.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21ldv1ldvlusvne6b.R.inc(74405);
            __CLR4_5_21ldv1ldvlusvne6b.R.inc(74406);this.name = name;
        }finally{__CLR4_5_21ldv1ldvlusvne6b.R.flushNeeded();}}
    }
}
