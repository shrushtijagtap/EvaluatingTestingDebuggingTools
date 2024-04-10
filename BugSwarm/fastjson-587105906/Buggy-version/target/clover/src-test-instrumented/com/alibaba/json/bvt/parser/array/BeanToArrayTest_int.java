/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.array;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;

import junit.framework.TestCase;

public class BeanToArrayTest_int extends TestCase {static class __CLR4_1_101kbf1kbfluszwd22{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,73019,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_int() throws Exception {__CLR4_1_101kbf1kbfluszwd22.R.globalSliceStart(getClass().getName(),72987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10sluf5j1kbf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101kbf1kbfluszwd22.R.rethrow($CLV_t2$);}finally{__CLR4_1_101kbf1kbfluszwd22.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_int.test_int",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72987,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10sluf5j1kbf() throws Exception{try{__CLR4_1_101kbf1kbfluszwd22.R.inc(72987);
        __CLR4_1_101kbf1kbfluszwd22.R.inc(72988);Model model = JSON.parseObject("[-100,100]", Model.class, Feature.SupportArrayToBean);
        __CLR4_1_101kbf1kbfluszwd22.R.inc(72989);Assert.assertEquals(-100L, model.v1);
        __CLR4_1_101kbf1kbfluszwd22.R.inc(72990);Assert.assertEquals(100L, model.v2);
    }finally{__CLR4_1_101kbf1kbfluszwd22.R.flushNeeded();}}
    
    public void test_int_space() throws Exception {__CLR4_1_101kbf1kbfluszwd22.R.globalSliceStart(getClass().getName(),72991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1027prao1kbj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101kbf1kbfluszwd22.R.rethrow($CLV_t2$);}finally{__CLR4_1_101kbf1kbfluszwd22.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_int.test_int_space",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72991,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1027prao1kbj() throws Exception{try{__CLR4_1_101kbf1kbfluszwd22.R.inc(72991);
        __CLR4_1_101kbf1kbfluszwd22.R.inc(72992);Model model = JSON.parseObject("[-100 ,100 ]", Model.class, Feature.SupportArrayToBean);
        __CLR4_1_101kbf1kbfluszwd22.R.inc(72993);Assert.assertEquals(-100L, model.v1);
        __CLR4_1_101kbf1kbfluszwd22.R.inc(72994);Assert.assertEquals(100L, model.v2);
    }finally{__CLR4_1_101kbf1kbfluszwd22.R.flushNeeded();}}

    public void test_int_error() throws Exception {__CLR4_1_101kbf1kbfluszwd22.R.globalSliceStart(getClass().getName(),72995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qoirim1kbn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101kbf1kbfluszwd22.R.rethrow($CLV_t2$);}finally{__CLR4_1_101kbf1kbfluszwd22.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_int.test_int_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72995,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qoirim1kbn() throws Exception{try{__CLR4_1_101kbf1kbfluszwd22.R.inc(72995);
        __CLR4_1_101kbf1kbfluszwd22.R.inc(72996);Exception error = null;
        __CLR4_1_101kbf1kbfluszwd22.R.inc(72997);try {
            __CLR4_1_101kbf1kbfluszwd22.R.inc(72998);JSON.parseObject("[-", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101kbf1kbfluszwd22.R.inc(72999);error = ex;
        }
        __CLR4_1_101kbf1kbfluszwd22.R.inc(73000);Assert.assertNotNull(error);
    }finally{__CLR4_1_101kbf1kbfluszwd22.R.flushNeeded();}}
    
    public void test_int_error_1() throws Exception {__CLR4_1_101kbf1kbfluszwd22.R.globalSliceStart(getClass().getName(),73001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105rjjl01kbt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101kbf1kbfluszwd22.R.rethrow($CLV_t2$);}finally{__CLR4_1_101kbf1kbfluszwd22.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_int.test_int_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),73001,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105rjjl01kbt() throws Exception{try{__CLR4_1_101kbf1kbfluszwd22.R.inc(73001);
        __CLR4_1_101kbf1kbfluszwd22.R.inc(73002);Exception error = null;
        __CLR4_1_101kbf1kbfluszwd22.R.inc(73003);try {
            __CLR4_1_101kbf1kbfluszwd22.R.inc(73004);JSON.parseObject("[-1:", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101kbf1kbfluszwd22.R.inc(73005);error = ex;
        }
        __CLR4_1_101kbf1kbfluszwd22.R.inc(73006);Assert.assertNotNull(error);
    }finally{__CLR4_1_101kbf1kbfluszwd22.R.flushNeeded();}}
    
    public void test_int_error_max() throws Exception {__CLR4_1_101kbf1kbfluszwd22.R.globalSliceStart(getClass().getName(),73007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10o1znav1kbz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101kbf1kbfluszwd22.R.rethrow($CLV_t2$);}finally{__CLR4_1_101kbf1kbfluszwd22.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_int.test_int_error_max",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),73007,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10o1znav1kbz() throws Exception{try{__CLR4_1_101kbf1kbfluszwd22.R.inc(73007);
        __CLR4_1_101kbf1kbfluszwd22.R.inc(73008);Exception error = null;
        __CLR4_1_101kbf1kbfluszwd22.R.inc(73009);try {
            __CLR4_1_101kbf1kbfluszwd22.R.inc(73010);JSON.parseObject("[1,92233720368547758000}", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101kbf1kbfluszwd22.R.inc(73011);error = ex;
        }
        __CLR4_1_101kbf1kbfluszwd22.R.inc(73012);Assert.assertNotNull(error);
    }finally{__CLR4_1_101kbf1kbfluszwd22.R.flushNeeded();}}
    
    public void test_bool_error_min() throws Exception {__CLR4_1_101kbf1kbfluszwd22.R.globalSliceStart(getClass().getName(),73013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m4l7461kc5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101kbf1kbfluszwd22.R.rethrow($CLV_t2$);}finally{__CLR4_1_101kbf1kbfluszwd22.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_int.test_bool_error_min",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),73013,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m4l7461kc5() throws Exception{try{__CLR4_1_101kbf1kbfluszwd22.R.inc(73013);
        __CLR4_1_101kbf1kbfluszwd22.R.inc(73014);Exception error = null;
        __CLR4_1_101kbf1kbfluszwd22.R.inc(73015);try {
            __CLR4_1_101kbf1kbfluszwd22.R.inc(73016);JSON.parseObject("[1,-92233720368547758000}", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101kbf1kbfluszwd22.R.inc(73017);error = ex;
        }
        __CLR4_1_101kbf1kbfluszwd22.R.inc(73018);Assert.assertNotNull(error);
    }finally{__CLR4_1_101kbf1kbfluszwd22.R.flushNeeded();}}

    public static class Model {
        public int v1;
        public int v2;
    }
}
