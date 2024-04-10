/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.ParserConfig;

public class AbstractSerializeTest2 extends TestCase {static class __CLR4_1_101le61le6luszwdag{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,74418,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected void setUp() throws Exception {try{__CLR4_1_101le61le6luszwdag.R.inc(74382);
        __CLR4_1_101le61le6luszwdag.R.inc(74383);ParserConfig.global.addAccept("com.alibaba.json.bvt.bug.AbstractSerializeTest2");
        __CLR4_1_101le61le6luszwdag.R.inc(74384);ParserConfig.global.addAccept("com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2");
    }finally{__CLR4_1_101le61le6luszwdag.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_1_101le61le6luszwdag.R.inc(74385);
        __CLR4_1_101le61le6luszwdag.R.inc(74386);ParserConfig.getGlobalInstance().putDeserializer(A.class, null);
    }finally{__CLR4_1_101le61le6luszwdag.R.flushNeeded();}}

    public void test_mapping_0() throws Exception {__CLR4_1_101le61le6luszwdag.R.globalSliceStart(getClass().getName(),74387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101hbdsp1leb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101le61le6luszwdag.R.rethrow($CLV_t2$);}finally{__CLR4_1_101le61le6luszwdag.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2.test_mapping_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74387,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101hbdsp1leb() throws Exception{try{__CLR4_1_101le61le6luszwdag.R.inc(74387);
        __CLR4_1_101le61le6luszwdag.R.inc(74388);String text = "{\"@type\":\"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2$A\"}";

        __CLR4_1_101le61le6luszwdag.R.inc(74389);B b = (B) JSON.parse(text);
        __CLR4_1_101le61le6luszwdag.R.inc(74390);Assert.assertNotNull(b);
    }finally{__CLR4_1_101le61le6luszwdag.R.flushNeeded();}}

    public void test_mapping_1() throws Exception {__CLR4_1_101le61le6luszwdag.R.globalSliceStart(getClass().getName(),74391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104qbcl61lef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101le61le6luszwdag.R.rethrow($CLV_t2$);}finally{__CLR4_1_101le61le6luszwdag.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2.test_mapping_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74391,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104qbcl61lef() throws Exception{try{__CLR4_1_101le61le6luszwdag.R.inc(74391);
        __CLR4_1_101le61le6luszwdag.R.inc(74392);String text = "{\"@type\":\"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2$A\",\"id\":123}";

        __CLR4_1_101le61le6luszwdag.R.inc(74393);B b = (B) JSON.parse(text);
        __CLR4_1_101le61le6luszwdag.R.inc(74394);Assert.assertNotNull(b);
        __CLR4_1_101le61le6luszwdag.R.inc(74395);Assert.assertEquals(123, b.getId());
    }finally{__CLR4_1_101le61le6luszwdag.R.flushNeeded();}}

    public void test_mapping_2() throws Exception {__CLR4_1_101le61le6luszwdag.R.globalSliceStart(getClass().getName(),74396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107zbbdn1lek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101le61le6luszwdag.R.rethrow($CLV_t2$);}finally{__CLR4_1_101le61le6luszwdag.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2.test_mapping_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74396,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107zbbdn1lek() throws Exception{try{__CLR4_1_101le61le6luszwdag.R.inc(74396);
        __CLR4_1_101le61le6luszwdag.R.inc(74397);String text = "{\"@type\":\"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2$A\",\"id\":234,\"name\":\"abc\"}";

        __CLR4_1_101le61le6luszwdag.R.inc(74398);B b = (B) JSON.parse(text);
        __CLR4_1_101le61le6luszwdag.R.inc(74399);Assert.assertNotNull(b);
        __CLR4_1_101le61le6luszwdag.R.inc(74400);Assert.assertEquals(234, b.getId());
        __CLR4_1_101le61le6luszwdag.R.inc(74401);Assert.assertEquals("abc", b.getName());
    }finally{__CLR4_1_101le61le6luszwdag.R.flushNeeded();}}

    public void test_mapping_group() throws Exception {__CLR4_1_101le61le6luszwdag.R.globalSliceStart(getClass().getName(),74402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jx3f2g1leq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101le61le6luszwdag.R.rethrow($CLV_t2$);}finally{__CLR4_1_101le61le6luszwdag.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest2.test_mapping_group",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74402,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jx3f2g1leq() throws Exception{try{__CLR4_1_101le61le6luszwdag.R.inc(74402);
        __CLR4_1_101le61le6luszwdag.R.inc(74403);String text = "{\"a\":{\"id\":234,\"name\":\"abc\"}}";

        __CLR4_1_101le61le6luszwdag.R.inc(74404);G g = JSON.parseObject(text, G.class);
        __CLR4_1_101le61le6luszwdag.R.inc(74405);Assert.assertTrue(g.getA() instanceof B);
    }finally{__CLR4_1_101le61le6luszwdag.R.flushNeeded();}}

    public static class G {

        private A a;

        public A getA() {try{__CLR4_1_101le61le6luszwdag.R.inc(74406);
            __CLR4_1_101le61le6luszwdag.R.inc(74407);return a;
        }finally{__CLR4_1_101le61le6luszwdag.R.flushNeeded();}}

        public void setA(A a) {try{__CLR4_1_101le61le6luszwdag.R.inc(74408);
            __CLR4_1_101le61le6luszwdag.R.inc(74409);this.a = a;
        }finally{__CLR4_1_101le61le6luszwdag.R.flushNeeded();}}

    }

    @JSONType(mappingTo = B.class)
    public static abstract class A {

        private int id;

        public int getId() {try{__CLR4_1_101le61le6luszwdag.R.inc(74410);
            __CLR4_1_101le61le6luszwdag.R.inc(74411);return id;
        }finally{__CLR4_1_101le61le6luszwdag.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101le61le6luszwdag.R.inc(74412);
            __CLR4_1_101le61le6luszwdag.R.inc(74413);this.id = id;
        }finally{__CLR4_1_101le61le6luszwdag.R.flushNeeded();}}
    }

    public static class B extends A {

        private String name;

        public String getName() {try{__CLR4_1_101le61le6luszwdag.R.inc(74414);
            __CLR4_1_101le61le6luszwdag.R.inc(74415);return name;
        }finally{__CLR4_1_101le61le6luszwdag.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101le61le6luszwdag.R.inc(74416);
            __CLR4_1_101le61le6luszwdag.R.inc(74417);this.name = name;
        }finally{__CLR4_1_101le61le6luszwdag.R.flushNeeded();}}
    }
}
