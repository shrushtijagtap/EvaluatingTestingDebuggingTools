/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.basicType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;

import java.io.StringReader;

/**
 * Created by wenshao on 10/08/2017.
 */
public class IntegerNullTest extends TestCase {static class __CLR4_5_212fr12frlusyjqz9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,49852,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_null() throws Exception {__CLR4_5_212fr12frlusyjqz9.R.globalSliceStart(getClass().getName(),49815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl12fr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212fr12frlusyjqz9.R.rethrow($CLV_t2$);}finally{__CLR4_5_212fr12frlusyjqz9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.IntegerNullTest.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49815,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl12fr() throws Exception{try{__CLR4_5_212fr12frlusyjqz9.R.inc(49815);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49816);Model model = JSON.parseObject("{\"v1\":null,\"v2\":null}", Model.class);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49817);assertNotNull(model);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49818);assertNull(model.v1);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49819);assertNull(model.v2);
    }finally{__CLR4_5_212fr12frlusyjqz9.R.flushNeeded();}}

    public void test_null_quote() throws Exception {__CLR4_5_212fr12frlusyjqz9.R.globalSliceStart(getClass().getName(),49820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b6cso12fw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212fr12frlusyjqz9.R.rethrow($CLV_t2$);}finally{__CLR4_5_212fr12frlusyjqz9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.IntegerNullTest.test_null_quote",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49820,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b6cso12fw() throws Exception{try{__CLR4_5_212fr12frlusyjqz9.R.inc(49820);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49821);Model model = JSON.parseObject("{\"v1\":\"null\",\"v2\":\"null\"}", Model.class);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49822);assertNotNull(model);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49823);assertNull(model.v1);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49824);assertNull(model.v2);
    }finally{__CLR4_5_212fr12frlusyjqz9.R.flushNeeded();}}

    public void test_null_1() throws Exception {__CLR4_5_212fr12frlusyjqz9.R.globalSliceStart(getClass().getName(),49825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dg3d0z12g1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212fr12frlusyjqz9.R.rethrow($CLV_t2$);}finally{__CLR4_5_212fr12frlusyjqz9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.IntegerNullTest.test_null_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49825,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dg3d0z12g1() throws Exception{try{__CLR4_5_212fr12frlusyjqz9.R.inc(49825);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49826);Model model = JSON.parseObject("{\"v1\":null ,\"v2\":null }", Model.class);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49827);assertNotNull(model);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49828);assertNull(model.v1);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49829);assertNull(model.v2);
    }finally{__CLR4_5_212fr12frlusyjqz9.R.flushNeeded();}}

    public void test_null_1_quote() throws Exception {__CLR4_5_212fr12frlusyjqz9.R.globalSliceStart(getClass().getName(),49830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a2dacq12g6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212fr12frlusyjqz9.R.rethrow($CLV_t2$);}finally{__CLR4_5_212fr12frlusyjqz9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.IntegerNullTest.test_null_1_quote",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49830,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a2dacq12g6() throws Exception{try{__CLR4_5_212fr12frlusyjqz9.R.inc(49830);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49831);Model model = JSON.parseObject("{\"v1\":\"null\" ,\"v2\":\"null\" }", Model.class);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49832);assertNotNull(model);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49833);assertNull(model.v1);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49834);assertNull(model.v2);
    }finally{__CLR4_5_212fr12frlusyjqz9.R.flushNeeded();}}

    public void test_null_array() throws Exception {__CLR4_5_212fr12frlusyjqz9.R.globalSliceStart(getClass().getName(),49835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ff1q8b12gb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212fr12frlusyjqz9.R.rethrow($CLV_t2$);}finally{__CLR4_5_212fr12frlusyjqz9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.IntegerNullTest.test_null_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49835,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ff1q8b12gb() throws Exception{try{__CLR4_5_212fr12frlusyjqz9.R.inc(49835);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49836);Model model = JSON.parseObject("[\"null\" ,\"null\"]", Model.class, Feature.SupportArrayToBean);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49837);assertNotNull(model);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49838);assertNull(model.v1);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49839);assertNull(model.v2);
    }finally{__CLR4_5_212fr12frlusyjqz9.R.flushNeeded();}}

    public void test_null_array_reader() throws Exception {__CLR4_5_212fr12frlusyjqz9.R.globalSliceStart(getClass().getName(),49840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26zw8ed12gg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212fr12frlusyjqz9.R.rethrow($CLV_t2$);}finally{__CLR4_5_212fr12frlusyjqz9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.IntegerNullTest.test_null_array_reader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49840,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26zw8ed12gg() throws Exception{try{__CLR4_5_212fr12frlusyjqz9.R.inc(49840);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49841);JSONReader reader = new JSONReader(new StringReader("[\"null\" ,\"null\"]"), Feature.SupportArrayToBean);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49842);Model model = reader.readObject(Model.class);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49843);assertNotNull(model);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49844);assertNull(model.v1);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49845);assertNull(model.v2);
    }finally{__CLR4_5_212fr12frlusyjqz9.R.flushNeeded();}}

    public void test_null_array_reader_1() throws Exception {__CLR4_5_212fr12frlusyjqz9.R.globalSliceStart(getClass().getName(),49846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rx1alp12gm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212fr12frlusyjqz9.R.rethrow($CLV_t2$);}finally{__CLR4_5_212fr12frlusyjqz9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.IntegerNullTest.test_null_array_reader_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49846,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rx1alp12gm() throws Exception{try{__CLR4_5_212fr12frlusyjqz9.R.inc(49846);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49847);JSONReader reader = new JSONReader(new StringReader("[null ,null]"), Feature.SupportArrayToBean);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49848);Model model = reader.readObject(Model.class);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49849);assertNotNull(model);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49850);assertNull(model.v1);
        __CLR4_5_212fr12frlusyjqz9.R.inc(49851);assertNull(model.v2);
    }finally{__CLR4_5_212fr12frlusyjqz9.R.flushNeeded();}}

    public static class Model {
        public Integer v1;
        public Integer v2;
    }
}
