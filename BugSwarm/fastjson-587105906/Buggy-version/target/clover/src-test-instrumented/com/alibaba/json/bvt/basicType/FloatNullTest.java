/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.basicType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;

import java.io.StringReader;

/**
 * Created by wenshao on 10/08/2017.
 */
public class FloatNullTest extends TestCase {static class __CLR4_1_1012a512a5lusqk0x5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,49644,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_null() throws Exception {__CLR4_1_1012a512a5lusqk0x5.R.globalSliceStart(getClass().getName(),49613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl12a5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012a512a5lusqk0x5.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012a512a5lusqk0x5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.FloatNullTest.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),49613,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl12a5() throws Exception{try{__CLR4_1_1012a512a5lusqk0x5.R.inc(49613);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49614);Model model = JSON.parseObject("{\"v1\":null,\"v2\":null}", Model.class);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49615);assertNotNull(model);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49616);assertNull(model.v1);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49617);assertNull(model.v2);
    }finally{__CLR4_1_1012a512a5lusqk0x5.R.flushNeeded();}}

    public void test_null_quote() throws Exception {__CLR4_1_1012a512a5lusqk0x5.R.globalSliceStart(getClass().getName(),49618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10b6cso12aa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012a512a5lusqk0x5.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012a512a5lusqk0x5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.FloatNullTest.test_null_quote",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),49618,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10b6cso12aa() throws Exception{try{__CLR4_1_1012a512a5lusqk0x5.R.inc(49618);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49619);Model model = JSON.parseObject("{\"v1\":\"null\",\"v2\":\"null\"}", Model.class);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49620);assertNotNull(model);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49621);assertNull(model.v1);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49622);assertNull(model.v2);
    }finally{__CLR4_1_1012a512a5lusqk0x5.R.flushNeeded();}}

    public void test_null_1() throws Exception {__CLR4_1_1012a512a5lusqk0x5.R.globalSliceStart(getClass().getName(),49623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dg3d0z12af();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012a512a5lusqk0x5.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012a512a5lusqk0x5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.FloatNullTest.test_null_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),49623,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dg3d0z12af() throws Exception{try{__CLR4_1_1012a512a5lusqk0x5.R.inc(49623);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49624);Model model = JSON.parseObject("{\"v1\":null ,\"v2\":null }", Model.class);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49625);assertNotNull(model);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49626);assertNull(model.v1);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49627);assertNull(model.v2);
    }finally{__CLR4_1_1012a512a5lusqk0x5.R.flushNeeded();}}

    public void test_null_1_quote() throws Exception {__CLR4_1_1012a512a5lusqk0x5.R.globalSliceStart(getClass().getName(),49628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a2dacq12ak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012a512a5lusqk0x5.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012a512a5lusqk0x5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.FloatNullTest.test_null_1_quote",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),49628,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a2dacq12ak() throws Exception{try{__CLR4_1_1012a512a5lusqk0x5.R.inc(49628);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49629);Model model = JSON.parseObject("{\"v1\":\"null\" ,\"v2\":\"null\" }", Model.class);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49630);assertNotNull(model);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49631);assertNull(model.v1);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49632);assertNull(model.v2);
    }finally{__CLR4_1_1012a512a5lusqk0x5.R.flushNeeded();}}

    public void test_null_array() throws Exception {__CLR4_1_1012a512a5lusqk0x5.R.globalSliceStart(getClass().getName(),49633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ff1q8b12ap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012a512a5lusqk0x5.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012a512a5lusqk0x5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.FloatNullTest.test_null_array",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),49633,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ff1q8b12ap() throws Exception{try{__CLR4_1_1012a512a5lusqk0x5.R.inc(49633);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49634);Model model = JSON.parseObject("[\"null\" ,\"null\"]", Model.class, Feature.SupportArrayToBean);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49635);assertNotNull(model);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49636);assertNull(model.v1);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49637);assertNull(model.v2);
    }finally{__CLR4_1_1012a512a5lusqk0x5.R.flushNeeded();}}

    public void test_null_array_reader() throws Exception {__CLR4_1_1012a512a5lusqk0x5.R.globalSliceStart(getClass().getName(),49638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106zw8ed12au();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012a512a5lusqk0x5.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012a512a5lusqk0x5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.FloatNullTest.test_null_array_reader",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),49638,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106zw8ed12au() throws Exception{try{__CLR4_1_1012a512a5lusqk0x5.R.inc(49638);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49639);JSONReader reader = new JSONReader(new StringReader("[\"null\" ,\"null\"]"), Feature.SupportArrayToBean);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49640);Model model = reader.readObject(Model.class);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49641);assertNotNull(model);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49642);assertNull(model.v1);
        __CLR4_1_1012a512a5lusqk0x5.R.inc(49643);assertNull(model.v2);
    }finally{__CLR4_1_1012a512a5lusqk0x5.R.flushNeeded();}}

    public static class Model {
        public Float v1;
        public Float v2;
    }
}
