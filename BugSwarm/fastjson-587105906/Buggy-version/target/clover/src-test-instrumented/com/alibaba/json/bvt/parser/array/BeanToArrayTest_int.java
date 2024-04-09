/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.array;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;

import junit.framework.TestCase;

public class BeanToArrayTest_int extends TestCase {static class __CLR4_1_101jd71jd7lusqkern{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,71787,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_int() throws Exception {__CLR4_1_101jd71jd7lusqkern.R.globalSliceStart(getClass().getName(),71755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10sluf5j1jd7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jd71jd7lusqkern.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jd71jd7lusqkern.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_int.test_int",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71755,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10sluf5j1jd7() throws Exception{try{__CLR4_1_101jd71jd7lusqkern.R.inc(71755);
        __CLR4_1_101jd71jd7lusqkern.R.inc(71756);Model model = JSON.parseObject("[-100,100]", Model.class, Feature.SupportArrayToBean);
        __CLR4_1_101jd71jd7lusqkern.R.inc(71757);Assert.assertEquals(-100L, model.v1);
        __CLR4_1_101jd71jd7lusqkern.R.inc(71758);Assert.assertEquals(100L, model.v2);
    }finally{__CLR4_1_101jd71jd7lusqkern.R.flushNeeded();}}
    
    public void test_int_space() throws Exception {__CLR4_1_101jd71jd7lusqkern.R.globalSliceStart(getClass().getName(),71759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1027prao1jdb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jd71jd7lusqkern.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jd71jd7lusqkern.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_int.test_int_space",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71759,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1027prao1jdb() throws Exception{try{__CLR4_1_101jd71jd7lusqkern.R.inc(71759);
        __CLR4_1_101jd71jd7lusqkern.R.inc(71760);Model model = JSON.parseObject("[-100 ,100 ]", Model.class, Feature.SupportArrayToBean);
        __CLR4_1_101jd71jd7lusqkern.R.inc(71761);Assert.assertEquals(-100L, model.v1);
        __CLR4_1_101jd71jd7lusqkern.R.inc(71762);Assert.assertEquals(100L, model.v2);
    }finally{__CLR4_1_101jd71jd7lusqkern.R.flushNeeded();}}

    public void test_int_error() throws Exception {__CLR4_1_101jd71jd7lusqkern.R.globalSliceStart(getClass().getName(),71763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qoirim1jdf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jd71jd7lusqkern.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jd71jd7lusqkern.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_int.test_int_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71763,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qoirim1jdf() throws Exception{try{__CLR4_1_101jd71jd7lusqkern.R.inc(71763);
        __CLR4_1_101jd71jd7lusqkern.R.inc(71764);Exception error = null;
        __CLR4_1_101jd71jd7lusqkern.R.inc(71765);try {
            __CLR4_1_101jd71jd7lusqkern.R.inc(71766);JSON.parseObject("[-", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101jd71jd7lusqkern.R.inc(71767);error = ex;
        }
        __CLR4_1_101jd71jd7lusqkern.R.inc(71768);Assert.assertNotNull(error);
    }finally{__CLR4_1_101jd71jd7lusqkern.R.flushNeeded();}}
    
    public void test_int_error_1() throws Exception {__CLR4_1_101jd71jd7lusqkern.R.globalSliceStart(getClass().getName(),71769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105rjjl01jdl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jd71jd7lusqkern.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jd71jd7lusqkern.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_int.test_int_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71769,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105rjjl01jdl() throws Exception{try{__CLR4_1_101jd71jd7lusqkern.R.inc(71769);
        __CLR4_1_101jd71jd7lusqkern.R.inc(71770);Exception error = null;
        __CLR4_1_101jd71jd7lusqkern.R.inc(71771);try {
            __CLR4_1_101jd71jd7lusqkern.R.inc(71772);JSON.parseObject("[-1:", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101jd71jd7lusqkern.R.inc(71773);error = ex;
        }
        __CLR4_1_101jd71jd7lusqkern.R.inc(71774);Assert.assertNotNull(error);
    }finally{__CLR4_1_101jd71jd7lusqkern.R.flushNeeded();}}
    
    public void test_int_error_max() throws Exception {__CLR4_1_101jd71jd7lusqkern.R.globalSliceStart(getClass().getName(),71775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10o1znav1jdr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jd71jd7lusqkern.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jd71jd7lusqkern.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_int.test_int_error_max",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71775,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10o1znav1jdr() throws Exception{try{__CLR4_1_101jd71jd7lusqkern.R.inc(71775);
        __CLR4_1_101jd71jd7lusqkern.R.inc(71776);Exception error = null;
        __CLR4_1_101jd71jd7lusqkern.R.inc(71777);try {
            __CLR4_1_101jd71jd7lusqkern.R.inc(71778);JSON.parseObject("[1,92233720368547758000}", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101jd71jd7lusqkern.R.inc(71779);error = ex;
        }
        __CLR4_1_101jd71jd7lusqkern.R.inc(71780);Assert.assertNotNull(error);
    }finally{__CLR4_1_101jd71jd7lusqkern.R.flushNeeded();}}
    
    public void test_bool_error_min() throws Exception {__CLR4_1_101jd71jd7lusqkern.R.globalSliceStart(getClass().getName(),71781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m4l7461jdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jd71jd7lusqkern.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jd71jd7lusqkern.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_int.test_bool_error_min",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71781,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m4l7461jdx() throws Exception{try{__CLR4_1_101jd71jd7lusqkern.R.inc(71781);
        __CLR4_1_101jd71jd7lusqkern.R.inc(71782);Exception error = null;
        __CLR4_1_101jd71jd7lusqkern.R.inc(71783);try {
            __CLR4_1_101jd71jd7lusqkern.R.inc(71784);JSON.parseObject("[1,-92233720368547758000}", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101jd71jd7lusqkern.R.inc(71785);error = ex;
        }
        __CLR4_1_101jd71jd7lusqkern.R.inc(71786);Assert.assertNotNull(error);
    }finally{__CLR4_1_101jd71jd7lusqkern.R.flushNeeded();}}

    public static class Model {
        public int v1;
        public int v2;
    }
}
