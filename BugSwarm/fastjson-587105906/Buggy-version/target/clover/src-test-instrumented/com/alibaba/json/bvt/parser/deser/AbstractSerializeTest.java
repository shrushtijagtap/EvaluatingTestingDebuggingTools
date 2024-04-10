/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

public class AbstractSerializeTest extends TestCase {static class __CLR4_1_101ld51ld5luszwdad{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,74382,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_101ld51ld5luszwdad.R.inc(74345);
        __CLR4_1_101ld51ld5luszwdad.R.inc(74346);ParserConfig.global.addAccept("com.alibaba.json.bvt.bug.AbstractSerializeTest");

        __CLR4_1_101ld51ld5luszwdad.R.inc(74347);ObjectDeserializer serializerB = ParserConfig.getGlobalInstance().getDeserializer(B.class);
        __CLR4_1_101ld51ld5luszwdad.R.inc(74348);ParserConfig.getGlobalInstance().putDeserializer(A.class, serializerB);
    }finally{__CLR4_1_101ld51ld5luszwdad.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_1_101ld51ld5luszwdad.R.inc(74349);
        __CLR4_1_101ld51ld5luszwdad.R.inc(74350);ParserConfig.getGlobalInstance().putDeserializer(A.class, null);
    }finally{__CLR4_1_101ld51ld5luszwdad.R.flushNeeded();}}

    public void test_mapping_0() throws Exception {__CLR4_1_101ld51ld5luszwdad.R.globalSliceStart(getClass().getName(),74351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101hbdsp1ldb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ld51ld5luszwdad.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ld51ld5luszwdad.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest.test_mapping_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74351,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101hbdsp1ldb() throws Exception{try{__CLR4_1_101ld51ld5luszwdad.R.inc(74351);
        __CLR4_1_101ld51ld5luszwdad.R.inc(74352);String text = "{\"@type\":\"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest$A\"}";

        __CLR4_1_101ld51ld5luszwdad.R.inc(74353);B b = (B) JSON.parse(text);
        __CLR4_1_101ld51ld5luszwdad.R.inc(74354);Assert.assertNotNull(b);
    }finally{__CLR4_1_101ld51ld5luszwdad.R.flushNeeded();}}

    public void test_mapping_1() throws Exception {__CLR4_1_101ld51ld5luszwdad.R.globalSliceStart(getClass().getName(),74355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104qbcl61ldf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ld51ld5luszwdad.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ld51ld5luszwdad.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest.test_mapping_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74355,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104qbcl61ldf() throws Exception{try{__CLR4_1_101ld51ld5luszwdad.R.inc(74355);
        __CLR4_1_101ld51ld5luszwdad.R.inc(74356);String text = "{\"@type\":\"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest$A\",\"id\":123}";

        __CLR4_1_101ld51ld5luszwdad.R.inc(74357);B b = (B) JSON.parse(text);
        __CLR4_1_101ld51ld5luszwdad.R.inc(74358);Assert.assertNotNull(b);
        __CLR4_1_101ld51ld5luszwdad.R.inc(74359);Assert.assertEquals(123, b.getId());
    }finally{__CLR4_1_101ld51ld5luszwdad.R.flushNeeded();}}

    public void test_mapping_2() throws Exception {__CLR4_1_101ld51ld5luszwdad.R.globalSliceStart(getClass().getName(),74360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107zbbdn1ldk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ld51ld5luszwdad.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ld51ld5luszwdad.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest.test_mapping_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74360,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107zbbdn1ldk() throws Exception{try{__CLR4_1_101ld51ld5luszwdad.R.inc(74360);
        __CLR4_1_101ld51ld5luszwdad.R.inc(74361);String text = "{\"@type\":\"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest$A\",\"id\":234,\"name\":\"abc\"}";

        __CLR4_1_101ld51ld5luszwdad.R.inc(74362);B b = (B) JSON.parse(text);
        __CLR4_1_101ld51ld5luszwdad.R.inc(74363);Assert.assertNotNull(b);
        __CLR4_1_101ld51ld5luszwdad.R.inc(74364);Assert.assertEquals(234, b.getId());
        __CLR4_1_101ld51ld5luszwdad.R.inc(74365);Assert.assertEquals("abc", b.getName());
    }finally{__CLR4_1_101ld51ld5luszwdad.R.flushNeeded();}}

    public void test_mapping_group() throws Exception {__CLR4_1_101ld51ld5luszwdad.R.globalSliceStart(getClass().getName(),74366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jx3f2g1ldq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ld51ld5luszwdad.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ld51ld5luszwdad.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.AbstractSerializeTest.test_mapping_group",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74366,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jx3f2g1ldq() throws Exception{try{__CLR4_1_101ld51ld5luszwdad.R.inc(74366);
        __CLR4_1_101ld51ld5luszwdad.R.inc(74367);String text = "{\"a\":{\"id\":234,\"name\":\"abc\"}}";

        __CLR4_1_101ld51ld5luszwdad.R.inc(74368);G g = JSON.parseObject(text, G.class);
        __CLR4_1_101ld51ld5luszwdad.R.inc(74369);Assert.assertTrue(g.getA() instanceof B);
    }finally{__CLR4_1_101ld51ld5luszwdad.R.flushNeeded();}}

    public static class G {

        private A a;

        public A getA() {try{__CLR4_1_101ld51ld5luszwdad.R.inc(74370);
            __CLR4_1_101ld51ld5luszwdad.R.inc(74371);return a;
        }finally{__CLR4_1_101ld51ld5luszwdad.R.flushNeeded();}}

        public void setA(A a) {try{__CLR4_1_101ld51ld5luszwdad.R.inc(74372);
            __CLR4_1_101ld51ld5luszwdad.R.inc(74373);this.a = a;
        }finally{__CLR4_1_101ld51ld5luszwdad.R.flushNeeded();}}

    }

    public static abstract class A {

        private int id;

        public int getId() {try{__CLR4_1_101ld51ld5luszwdad.R.inc(74374);
            __CLR4_1_101ld51ld5luszwdad.R.inc(74375);return id;
        }finally{__CLR4_1_101ld51ld5luszwdad.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101ld51ld5luszwdad.R.inc(74376);
            __CLR4_1_101ld51ld5luszwdad.R.inc(74377);this.id = id;
        }finally{__CLR4_1_101ld51ld5luszwdad.R.flushNeeded();}}
    }

    public static class B extends A {

        private String name;

        public String getName() {try{__CLR4_1_101ld51ld5luszwdad.R.inc(74378);
            __CLR4_1_101ld51ld5luszwdad.R.inc(74379);return name;
        }finally{__CLR4_1_101ld51ld5luszwdad.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101ld51ld5luszwdad.R.inc(74380);
            __CLR4_1_101ld51ld5luszwdad.R.inc(74381);this.name = name;
        }finally{__CLR4_1_101ld51ld5luszwdad.R.flushNeeded();}}
    }
}
