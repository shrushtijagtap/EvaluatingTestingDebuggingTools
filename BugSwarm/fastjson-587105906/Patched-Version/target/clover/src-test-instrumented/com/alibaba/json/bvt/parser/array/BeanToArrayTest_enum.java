/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.array;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;

import junit.framework.TestCase;

public class BeanToArrayTest_enum extends TestCase {static class __CLR4_5_21jbw1jbwlusyjtw6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,71726,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_enum() throws Exception {__CLR4_5_21jbw1jbwlusyjtw6.R.globalSliceStart(getClass().getName(),71708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22onyzv1jbw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jbw1jbwlusyjtw6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jbw1jbwlusyjtw6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_enum.test_enum",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71708,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22onyzv1jbw() throws Exception{try{__CLR4_5_21jbw1jbwlusyjtw6.R.inc(71708);
        __CLR4_5_21jbw1jbwlusyjtw6.R.inc(71709);Model model = JSON.parseObject("[\"A\",\"B\"]", Model.class, Feature.SupportArrayToBean);
        __CLR4_5_21jbw1jbwlusyjtw6.R.inc(71710);Assert.assertEquals(Type.A, model.v1);
        __CLR4_5_21jbw1jbwlusyjtw6.R.inc(71711);Assert.assertEquals(Type.B, model.v2);
    }finally{__CLR4_5_21jbw1jbwlusyjtw6.R.flushNeeded();}}
    
    public void test_enum_space() throws Exception {__CLR4_5_21jbw1jbwlusyjtw6.R.globalSliceStart(getClass().getName(),71712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2647vss1jc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jbw1jbwlusyjtw6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jbw1jbwlusyjtw6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_enum.test_enum_space",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71712,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2647vss1jc0() throws Exception{try{__CLR4_5_21jbw1jbwlusyjtw6.R.inc(71712);
        __CLR4_5_21jbw1jbwlusyjtw6.R.inc(71713);Model model = JSON.parseObject("[\"A\" ,\"B\" ]", Model.class, Feature.SupportArrayToBean);
        __CLR4_5_21jbw1jbwlusyjtw6.R.inc(71714);Assert.assertEquals(Type.A, model.v1);
        __CLR4_5_21jbw1jbwlusyjtw6.R.inc(71715);Assert.assertEquals(Type.B, model.v2);
    }finally{__CLR4_5_21jbw1jbwlusyjtw6.R.flushNeeded();}}

    public void test_enum_num() throws Exception {__CLR4_5_21jbw1jbwlusyjtw6.R.globalSliceStart(getClass().getName(),71716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2et5ipo1jc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jbw1jbwlusyjtw6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jbw1jbwlusyjtw6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_enum.test_enum_num",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71716,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2et5ipo1jc4() throws Exception{try{__CLR4_5_21jbw1jbwlusyjtw6.R.inc(71716);
        __CLR4_5_21jbw1jbwlusyjtw6.R.inc(71717);Model model = JSON.parseObject("[1,0]", Model.class, Feature.SupportArrayToBean);
        __CLR4_5_21jbw1jbwlusyjtw6.R.inc(71718);Assert.assertEquals(Type.B, model.v1);
        __CLR4_5_21jbw1jbwlusyjtw6.R.inc(71719);Assert.assertEquals(Type.A, model.v2);
    }finally{__CLR4_5_21jbw1jbwlusyjtw6.R.flushNeeded();}}

    public void test_enum_error() throws Exception {__CLR4_5_21jbw1jbwlusyjtw6.R.globalSliceStart(getClass().getName(),71720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ms0n0i1jc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jbw1jbwlusyjtw6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jbw1jbwlusyjtw6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_enum.test_enum_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71720,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ms0n0i1jc8() throws Exception{try{__CLR4_5_21jbw1jbwlusyjtw6.R.inc(71720);
        __CLR4_5_21jbw1jbwlusyjtw6.R.inc(71721);Exception error = null;
        __CLR4_5_21jbw1jbwlusyjtw6.R.inc(71722);try {
            __CLR4_5_21jbw1jbwlusyjtw6.R.inc(71723);JSON.parseObject("[t,0]", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21jbw1jbwlusyjtw6.R.inc(71724);error = ex;
        }
        __CLR4_5_21jbw1jbwlusyjtw6.R.inc(71725);Assert.assertNotNull(error);
    }finally{__CLR4_5_21jbw1jbwlusyjtw6.R.flushNeeded();}}

    public static class Model {

        public Type v1;
        public Type v2;
    }
    
    public static enum Type {
        A, B, C
    }
}
