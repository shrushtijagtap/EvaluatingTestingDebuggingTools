/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.writeClassName;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

/**
 * Created by wenshao on 14/08/2017.
 */
public class WriteClassNameTest5 extends TestCase {static class __CLR4_1_101yu51yu5lusqkodd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,91826,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_writeClassName() throws Exception {__CLR4_1_101yu51yu5lusqkodd.R.globalSliceStart(getClass().getName(),91805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101oliem1yu5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yu51yu5lusqkodd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yu51yu5lusqkodd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeClassName.WriteClassNameTest5.test_for_writeClassName",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91805,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101oliem1yu5() throws Exception{try{__CLR4_1_101yu51yu5lusqkodd.R.inc(91805);
        __CLR4_1_101yu51yu5lusqkodd.R.inc(91806);Model model = new Model();
        __CLR4_1_101yu51yu5lusqkodd.R.inc(91807);B b = new B();
        __CLR4_1_101yu51yu5lusqkodd.R.inc(91808);b.id = 1001;
        __CLR4_1_101yu51yu5lusqkodd.R.inc(91809);b.value = 2017;
        __CLR4_1_101yu51yu5lusqkodd.R.inc(91810);model.a = b;

        __CLR4_1_101yu51yu5lusqkodd.R.inc(91811);String str = JSON.toJSONString(model);
        __CLR4_1_101yu51yu5lusqkodd.R.inc(91812);System.out.println(str);
        __CLR4_1_101yu51yu5lusqkodd.R.inc(91813);assertEquals("{\"a\":{\"@type\":\"com.alibaba.json.bvt.writeClassName.WriteClassNameTest5$B\",\"id\":1001,\"value\":2017}}", str);

        __CLR4_1_101yu51yu5lusqkodd.R.inc(91814);Model model2 = JSON.parseObject(str, Model.class);
        __CLR4_1_101yu51yu5lusqkodd.R.inc(91815);assertTrue(model2.a instanceof B);
    }finally{__CLR4_1_101yu51yu5lusqkodd.R.flushNeeded();}}

    public void test_for_writeClassName_no() throws Exception {__CLR4_1_101yu51yu5lusqkodd.R.globalSliceStart(getClass().getName(),91816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jxpv4w1yug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yu51yu5lusqkodd.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yu51yu5lusqkodd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeClassName.WriteClassNameTest5.test_for_writeClassName_no",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91816,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jxpv4w1yug() throws Exception{try{__CLR4_1_101yu51yu5lusqkodd.R.inc(91816);
        __CLR4_1_101yu51yu5lusqkodd.R.inc(91817);Model model = new Model();
        __CLR4_1_101yu51yu5lusqkodd.R.inc(91818);A a = new A();
        __CLR4_1_101yu51yu5lusqkodd.R.inc(91819);a.id = 1001;
        __CLR4_1_101yu51yu5lusqkodd.R.inc(91820);model.a = a;

        __CLR4_1_101yu51yu5lusqkodd.R.inc(91821);String str = JSON.toJSONString(model);
        __CLR4_1_101yu51yu5lusqkodd.R.inc(91822);System.out.println(str);
        __CLR4_1_101yu51yu5lusqkodd.R.inc(91823);assertEquals("{\"a\":{\"id\":1001}}", str);

        __CLR4_1_101yu51yu5lusqkodd.R.inc(91824);Model model2 = JSON.parseObject(str, Model.class);
        __CLR4_1_101yu51yu5lusqkodd.R.inc(91825);assertSame(A.class, model2.a.getClass());
    }finally{__CLR4_1_101yu51yu5lusqkodd.R.flushNeeded();}}

    public static class Model {
        @JSONField(serialzeFeatures = SerializerFeature.WriteClassName)
        public A a;
    }

    public static class A {
        public int id;
    }

    public static class B extends A {
        public int value;
    }
}
