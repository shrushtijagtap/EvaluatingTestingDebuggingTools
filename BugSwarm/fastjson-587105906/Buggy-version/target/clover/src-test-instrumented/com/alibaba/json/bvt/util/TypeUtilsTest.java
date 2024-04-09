/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.util;

import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.TypeUtils;
import com.alibaba.json.bvt.parser.deser.generic.GenericArrayTest;
import com.jsoniter.spi.GenericArrayTypeImpl;
import junit.framework.TestCase;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;

public class TypeUtilsTest extends TestCase {static class __CLR4_1_101xzs1xzslusqknoz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,90726,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_1_101xzs1xzslusqknoz.R.globalSliceStart(getClass().getName(),90712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21xzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xzs1xzslusqknoz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xzs1xzslusqknoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.TypeUtilsTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90712,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21xzs() throws Exception{try{__CLR4_1_101xzs1xzslusqknoz.R.inc(90712);
        __CLR4_1_101xzs1xzslusqknoz.R.inc(90713);assertEquals(0, TypeUtils.getSerializeFeatures(Object.class));
        __CLR4_1_101xzs1xzslusqknoz.R.inc(90714);assertEquals(SerializerFeature.WriteMapNullValue.mask, TypeUtils.getSerializeFeatures(Model.class));
    }finally{__CLR4_1_101xzs1xzslusqknoz.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101xzs1xzslusqknoz.R.globalSliceStart(getClass().getName(),90715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1xzv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xzs1xzslusqknoz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xzs1xzslusqknoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.TypeUtilsTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90715,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1xzv() throws Exception{try{__CLR4_1_101xzs1xzslusqknoz.R.inc(90715);
        __CLR4_1_101xzs1xzslusqknoz.R.inc(90716);TypeUtils.checkPrimitiveArray((GenericArrayType) A.class.getField("values").getGenericType());
    }finally{__CLR4_1_101xzs1xzslusqknoz.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101xzs1xzslusqknoz.R.globalSliceStart(getClass().getName(),90717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1xzx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xzs1xzslusqknoz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xzs1xzslusqknoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.TypeUtilsTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90717,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1xzx() throws Exception{try{__CLR4_1_101xzs1xzslusqknoz.R.inc(90717);
        __CLR4_1_101xzs1xzslusqknoz.R.inc(90718);assertTrue(TypeUtils.isHibernateInitialized(new Object()));
    }finally{__CLR4_1_101xzs1xzslusqknoz.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101xzs1xzslusqknoz.R.globalSliceStart(getClass().getName(),90719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441xzz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xzs1xzslusqknoz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xzs1xzslusqknoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.TypeUtilsTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90719,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441xzz() throws Exception{try{__CLR4_1_101xzs1xzslusqknoz.R.inc(90719);
        __CLR4_1_101xzs1xzslusqknoz.R.inc(90720);Constructor<?> constructor = GenericArrayTypeImpl.class.getDeclaredConstructors()[0];
        __CLR4_1_101xzs1xzslusqknoz.R.inc(90721);constructor.setAccessible(true);

        __CLR4_1_101xzs1xzslusqknoz.R.inc(90722);Class[] classes = new Class[] {
            boolean[].class,
            byte[].class,
            short[].class,
            int[].class,
            long[].class,
            float[].class,
            double[].class,
            char[].class,
        };

        __CLR4_1_101xzs1xzslusqknoz.R.inc(90723);for (Class clazz : classes) {{
            __CLR4_1_101xzs1xzslusqknoz.R.inc(90724);GenericArrayType type = (GenericArrayType) constructor.newInstance(clazz.getComponentType());
            __CLR4_1_101xzs1xzslusqknoz.R.inc(90725);assertEquals(clazz, TypeUtils.checkPrimitiveArray(type));
        }

    }}finally{__CLR4_1_101xzs1xzslusqknoz.R.flushNeeded();}}

    @JSONType(serialzeFeatures = SerializerFeature.WriteMapNullValue)
    public static class Model {

    }

    public static class A<T extends Number> {
        public T[] values;
    }

    public static class VO extends GenericArrayTest.A {

    }
}
