/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.array;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;

import junit.framework.TestCase;

public class BeanToArrayTest_int extends TestCase {static class __CLR4_5_21jcw1jcwlusyjtwa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,71776,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_int() throws Exception {__CLR4_5_21jcw1jcwlusyjtwa.R.globalSliceStart(getClass().getName(),71744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sluf5j1jcw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jcw1jcwlusyjtwa.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jcw1jcwlusyjtwa.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_int.test_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71744,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sluf5j1jcw() throws Exception{try{__CLR4_5_21jcw1jcwlusyjtwa.R.inc(71744);
        __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71745);Model model = JSON.parseObject("[-100,100]", Model.class, Feature.SupportArrayToBean);
        __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71746);Assert.assertEquals(-100L, model.v1);
        __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71747);Assert.assertEquals(100L, model.v2);
    }finally{__CLR4_5_21jcw1jcwlusyjtwa.R.flushNeeded();}}
    
    public void test_int_space() throws Exception {__CLR4_5_21jcw1jcwlusyjtwa.R.globalSliceStart(getClass().getName(),71748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_227prao1jd0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jcw1jcwlusyjtwa.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jcw1jcwlusyjtwa.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_int.test_int_space",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71748,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_227prao1jd0() throws Exception{try{__CLR4_5_21jcw1jcwlusyjtwa.R.inc(71748);
        __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71749);Model model = JSON.parseObject("[-100 ,100 ]", Model.class, Feature.SupportArrayToBean);
        __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71750);Assert.assertEquals(-100L, model.v1);
        __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71751);Assert.assertEquals(100L, model.v2);
    }finally{__CLR4_5_21jcw1jcwlusyjtwa.R.flushNeeded();}}

    public void test_int_error() throws Exception {__CLR4_5_21jcw1jcwlusyjtwa.R.globalSliceStart(getClass().getName(),71752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qoirim1jd4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jcw1jcwlusyjtwa.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jcw1jcwlusyjtwa.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_int.test_int_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71752,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qoirim1jd4() throws Exception{try{__CLR4_5_21jcw1jcwlusyjtwa.R.inc(71752);
        __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71753);Exception error = null;
        __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71754);try {
            __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71755);JSON.parseObject("[-", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71756);error = ex;
        }
        __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71757);Assert.assertNotNull(error);
    }finally{__CLR4_5_21jcw1jcwlusyjtwa.R.flushNeeded();}}
    
    public void test_int_error_1() throws Exception {__CLR4_5_21jcw1jcwlusyjtwa.R.globalSliceStart(getClass().getName(),71758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25rjjl01jda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jcw1jcwlusyjtwa.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jcw1jcwlusyjtwa.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_int.test_int_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71758,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25rjjl01jda() throws Exception{try{__CLR4_5_21jcw1jcwlusyjtwa.R.inc(71758);
        __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71759);Exception error = null;
        __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71760);try {
            __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71761);JSON.parseObject("[-1:", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71762);error = ex;
        }
        __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71763);Assert.assertNotNull(error);
    }finally{__CLR4_5_21jcw1jcwlusyjtwa.R.flushNeeded();}}
    
    public void test_int_error_max() throws Exception {__CLR4_5_21jcw1jcwlusyjtwa.R.globalSliceStart(getClass().getName(),71764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o1znav1jdg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jcw1jcwlusyjtwa.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jcw1jcwlusyjtwa.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_int.test_int_error_max",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71764,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o1znav1jdg() throws Exception{try{__CLR4_5_21jcw1jcwlusyjtwa.R.inc(71764);
        __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71765);Exception error = null;
        __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71766);try {
            __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71767);JSON.parseObject("[1,92233720368547758000}", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71768);error = ex;
        }
        __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71769);Assert.assertNotNull(error);
    }finally{__CLR4_5_21jcw1jcwlusyjtwa.R.flushNeeded();}}
    
    public void test_bool_error_min() throws Exception {__CLR4_5_21jcw1jcwlusyjtwa.R.globalSliceStart(getClass().getName(),71770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m4l7461jdm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jcw1jcwlusyjtwa.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jcw1jcwlusyjtwa.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_int.test_bool_error_min",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71770,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m4l7461jdm() throws Exception{try{__CLR4_5_21jcw1jcwlusyjtwa.R.inc(71770);
        __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71771);Exception error = null;
        __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71772);try {
            __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71773);JSON.parseObject("[1,-92233720368547758000}", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71774);error = ex;
        }
        __CLR4_5_21jcw1jcwlusyjtwa.R.inc(71775);Assert.assertNotNull(error);
    }finally{__CLR4_5_21jcw1jcwlusyjtwa.R.flushNeeded();}}

    public static class Model {
        public int v1;
        public int v2;
    }
}
