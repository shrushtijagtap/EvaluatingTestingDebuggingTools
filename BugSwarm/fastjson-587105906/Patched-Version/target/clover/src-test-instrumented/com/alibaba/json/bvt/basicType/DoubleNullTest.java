/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.basicType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;

import java.io.StringReader;

/**
 * Created by wenshao on 10/08/2017.
 */
public class DoubleNullTest extends TestCase {static class __CLR4_5_2125j125jlusyjqvt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,49478,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_null() throws Exception {__CLR4_5_2125j125jlusyjqvt.R.globalSliceStart(getClass().getName(),49447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl125j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2125j125jlusyjqvt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2125j125jlusyjqvt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.DoubleNullTest.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49447,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl125j() throws Exception{try{__CLR4_5_2125j125jlusyjqvt.R.inc(49447);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49448);Model model = JSON.parseObject("{\"v1\":null,\"v2\":null}", Model.class);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49449);assertNotNull(model);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49450);assertNull(model.v1);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49451);assertNull(model.v2);
    }finally{__CLR4_5_2125j125jlusyjqvt.R.flushNeeded();}}

    public void test_null_quote() throws Exception {__CLR4_5_2125j125jlusyjqvt.R.globalSliceStart(getClass().getName(),49452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b6cso125o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2125j125jlusyjqvt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2125j125jlusyjqvt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.DoubleNullTest.test_null_quote",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49452,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b6cso125o() throws Exception{try{__CLR4_5_2125j125jlusyjqvt.R.inc(49452);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49453);Model model = JSON.parseObject("{\"v1\":\"null\",\"v2\":\"null\"}", Model.class);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49454);assertNotNull(model);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49455);assertNull(model.v1);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49456);assertNull(model.v2);
    }finally{__CLR4_5_2125j125jlusyjqvt.R.flushNeeded();}}

    public void test_null_1() throws Exception {__CLR4_5_2125j125jlusyjqvt.R.globalSliceStart(getClass().getName(),49457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dg3d0z125t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2125j125jlusyjqvt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2125j125jlusyjqvt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.DoubleNullTest.test_null_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49457,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dg3d0z125t() throws Exception{try{__CLR4_5_2125j125jlusyjqvt.R.inc(49457);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49458);Model model = JSON.parseObject("{\"v1\":null ,\"v2\":null }", Model.class);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49459);assertNotNull(model);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49460);assertNull(model.v1);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49461);assertNull(model.v2);
    }finally{__CLR4_5_2125j125jlusyjqvt.R.flushNeeded();}}

    public void test_null_1_quote() throws Exception {__CLR4_5_2125j125jlusyjqvt.R.globalSliceStart(getClass().getName(),49462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a2dacq125y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2125j125jlusyjqvt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2125j125jlusyjqvt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.DoubleNullTest.test_null_1_quote",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49462,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a2dacq125y() throws Exception{try{__CLR4_5_2125j125jlusyjqvt.R.inc(49462);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49463);Model model = JSON.parseObject("{\"v1\":\"null\" ,\"v2\":\"null\" }", Model.class);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49464);assertNotNull(model);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49465);assertNull(model.v1);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49466);assertNull(model.v2);
    }finally{__CLR4_5_2125j125jlusyjqvt.R.flushNeeded();}}

    public void test_null_array() throws Exception {__CLR4_5_2125j125jlusyjqvt.R.globalSliceStart(getClass().getName(),49467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ff1q8b1263();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2125j125jlusyjqvt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2125j125jlusyjqvt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.DoubleNullTest.test_null_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49467,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ff1q8b1263() throws Exception{try{__CLR4_5_2125j125jlusyjqvt.R.inc(49467);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49468);Model model = JSON.parseObject("[\"null\" ,\"null\"]", Model.class, Feature.SupportArrayToBean);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49469);assertNotNull(model);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49470);assertNull(model.v1);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49471);assertNull(model.v2);
    }finally{__CLR4_5_2125j125jlusyjqvt.R.flushNeeded();}}

    public void test_null_array_reader() throws Exception {__CLR4_5_2125j125jlusyjqvt.R.globalSliceStart(getClass().getName(),49472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26zw8ed1268();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2125j125jlusyjqvt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2125j125jlusyjqvt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.DoubleNullTest.test_null_array_reader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49472,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26zw8ed1268() throws Exception{try{__CLR4_5_2125j125jlusyjqvt.R.inc(49472);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49473);JSONReader reader = new JSONReader(new StringReader("[\"null\" ,\"null\"]"), Feature.SupportArrayToBean);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49474);Model model = reader.readObject(Model.class);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49475);assertNotNull(model);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49476);assertNull(model.v1);
        __CLR4_5_2125j125jlusyjqvt.R.inc(49477);assertNull(model.v2);
    }finally{__CLR4_5_2125j125jlusyjqvt.R.flushNeeded();}}

    public static class Model {
        public Double v1;
        public Double v2;
    }
}
