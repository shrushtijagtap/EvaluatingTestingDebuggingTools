/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class ClassTest extends TestCase {static class __CLR4_5_21kjx1kjxlusyju24{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,73315,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_null() throws Exception {__CLR4_5_21kjx1kjxlusyju24.R.globalSliceStart(getClass().getName(),73293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1kjx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kjx1kjxlusyju24.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kjx1kjxlusyju24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.ClassTest.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73293,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1kjx() throws Exception{try{__CLR4_5_21kjx1kjxlusyju24.R.inc(73293);
        __CLR4_5_21kjx1kjxlusyju24.R.inc(73294);Assert.assertNull(JSON.parseObject("null", Class.class));
        __CLR4_5_21kjx1kjxlusyju24.R.inc(73295);Assert.assertNull(JSON.parseObject("null", Class[].class));
        __CLR4_5_21kjx1kjxlusyju24.R.inc(73296);Assert.assertNull(JSON.parseArray("null", Class.class));
        __CLR4_5_21kjx1kjxlusyju24.R.inc(73297);Assert.assertNull(JSON.parseObject("{value:null}", VO.class).getValue());
    }finally{__CLR4_5_21kjx1kjxlusyju24.R.flushNeeded();}}

    public void test_primitive() throws Exception {__CLR4_5_21kjx1kjxlusyju24.R.globalSliceStart(getClass().getName(),73298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21gyxdr1kk2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kjx1kjxlusyju24.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kjx1kjxlusyju24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.ClassTest.test_primitive",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73298,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21gyxdr1kk2() throws Exception{try{__CLR4_5_21kjx1kjxlusyju24.R.inc(73298);
        __CLR4_5_21kjx1kjxlusyju24.R.inc(73299);Assert.assertEquals(byte.class, JSON.parseObject("\"byte\"", Class.class));
        __CLR4_5_21kjx1kjxlusyju24.R.inc(73300);Assert.assertEquals(short.class, JSON.parseObject("\"short\"", Class.class));
        __CLR4_5_21kjx1kjxlusyju24.R.inc(73301);Assert.assertEquals(int.class, JSON.parseObject("\"int\"", Class.class));
        __CLR4_5_21kjx1kjxlusyju24.R.inc(73302);Assert.assertEquals(long.class, JSON.parseObject("\"long\"", Class.class));
        __CLR4_5_21kjx1kjxlusyju24.R.inc(73303);Assert.assertEquals(float.class, JSON.parseObject("\"float\"", Class.class));
        __CLR4_5_21kjx1kjxlusyju24.R.inc(73304);Assert.assertEquals(double.class, JSON.parseObject("\"double\"", Class.class));
        __CLR4_5_21kjx1kjxlusyju24.R.inc(73305);Assert.assertEquals(char.class, JSON.parseObject("\"char\"", Class.class));
        __CLR4_5_21kjx1kjxlusyju24.R.inc(73306);Assert.assertEquals(boolean.class, JSON.parseObject("\"boolean\"", Class.class));
    }finally{__CLR4_5_21kjx1kjxlusyju24.R.flushNeeded();}}

    public void test_array() throws Exception {__CLR4_5_21kjx1kjxlusyju24.R.globalSliceStart(getClass().getName(),73307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vw0vd91kkb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kjx1kjxlusyju24.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kjx1kjxlusyju24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.ClassTest.test_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73307,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vw0vd91kkb() throws Exception{try{__CLR4_5_21kjx1kjxlusyju24.R.inc(73307);
        __CLR4_5_21kjx1kjxlusyju24.R.inc(73308);Assert.assertEquals(int[].class, JSON.parseObject("\"[int\"", Class.class));
        __CLR4_5_21kjx1kjxlusyju24.R.inc(73309);Assert.assertEquals(int[][].class, JSON.parseObject("\"[[int\"", Class.class));
        __CLR4_5_21kjx1kjxlusyju24.R.inc(73310);Assert.assertEquals(int[][][][].class, JSON.parseObject("\"[[[[int\"", Class.class));
    }finally{__CLR4_5_21kjx1kjxlusyju24.R.flushNeeded();}}

    public static class VO {

        private Class<?> value;

        public Class<?> getValue() {try{__CLR4_5_21kjx1kjxlusyju24.R.inc(73311);
            __CLR4_5_21kjx1kjxlusyju24.R.inc(73312);return value;
        }finally{__CLR4_5_21kjx1kjxlusyju24.R.flushNeeded();}}

        public void setValue(Class<?> value) {try{__CLR4_5_21kjx1kjxlusyju24.R.inc(73313);
            __CLR4_5_21kjx1kjxlusyju24.R.inc(73314);this.value = value;
        }finally{__CLR4_5_21kjx1kjxlusyju24.R.flushNeeded();}}

    }
}
