/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.array;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;

import junit.framework.TestCase;

public class BeanToArrayTest_long extends TestCase {static class __CLR4_1_101je31je3lusqket3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,71819,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_long() throws Exception {__CLR4_1_101je31je3lusqket3.R.globalSliceStart(getClass().getName(),71787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10eplvzk1je3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101je31je3lusqket3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101je31je3lusqket3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_long.test_long",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71787,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10eplvzk1je3() throws Exception{try{__CLR4_1_101je31je3lusqket3.R.inc(71787);
        __CLR4_1_101je31je3lusqket3.R.inc(71788);Model model = JSON.parseObject("[-100,100]", Model.class, Feature.SupportArrayToBean);
        __CLR4_1_101je31je3lusqket3.R.inc(71789);Assert.assertEquals(-100L, model.v1);
        __CLR4_1_101je31je3lusqket3.R.inc(71790);Assert.assertEquals(100L, model.v2);
    }finally{__CLR4_1_101je31je3lusqket3.R.flushNeeded();}}
    
    public void test_long_space() throws Exception {__CLR4_1_101je31je3lusqket3.R.globalSliceStart(getClass().getName(),71791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10da9xg71je7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101je31je3lusqket3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101je31je3lusqket3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_long.test_long_space",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71791,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10da9xg71je7() throws Exception{try{__CLR4_1_101je31je3lusqket3.R.inc(71791);
        __CLR4_1_101je31je3lusqket3.R.inc(71792);Model model = JSON.parseObject("[-100 ,100 ]", Model.class, Feature.SupportArrayToBean);
        __CLR4_1_101je31je3lusqket3.R.inc(71793);Assert.assertEquals(-100L, model.v1);
        __CLR4_1_101je31je3lusqket3.R.inc(71794);Assert.assertEquals(100L, model.v2);
    }finally{__CLR4_1_101je31je3lusqket3.R.flushNeeded();}}

    public void test_long_error() throws Exception {__CLR4_1_101je31je3lusqket3.R.globalSliceStart(getClass().getName(),71795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10flyld31jeb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101je31je3lusqket3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101je31je3lusqket3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_long.test_long_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71795,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10flyld31jeb() throws Exception{try{__CLR4_1_101je31je3lusqket3.R.inc(71795);
        __CLR4_1_101je31je3lusqket3.R.inc(71796);Exception error = null;
        __CLR4_1_101je31je3lusqket3.R.inc(71797);try {
            __CLR4_1_101je31je3lusqket3.R.inc(71798);JSON.parseObject("[-", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101je31je3lusqket3.R.inc(71799);error = ex;
        }
        __CLR4_1_101je31je3lusqket3.R.inc(71800);Assert.assertNotNull(error);
    }finally{__CLR4_1_101je31je3lusqket3.R.flushNeeded();}}
    
    public void test_long_error_2() throws Exception {__CLR4_1_101je31je3lusqket3.R.globalSliceStart(getClass().getName(),71801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1069wgd01jeh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101je31je3lusqket3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101je31je3lusqket3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_long.test_long_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71801,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1069wgd01jeh() throws Exception{try{__CLR4_1_101je31je3lusqket3.R.inc(71801);
        __CLR4_1_101je31je3lusqket3.R.inc(71802);Exception error = null;
        __CLR4_1_101je31je3lusqket3.R.inc(71803);try {
            __CLR4_1_101je31je3lusqket3.R.inc(71804);JSON.parseObject("[-1:", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101je31je3lusqket3.R.inc(71805);error = ex;
        }
        __CLR4_1_101je31je3lusqket3.R.inc(71806);Assert.assertNotNull(error);
    }finally{__CLR4_1_101je31je3lusqket3.R.flushNeeded();}}
    
    public void test_long_error_max() throws Exception {__CLR4_1_101je31je3lusqket3.R.globalSliceStart(getClass().getName(),71807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xo4rj21jen();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101je31je3lusqket3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101je31je3lusqket3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_long.test_long_error_max",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71807,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xo4rj21jen() throws Exception{try{__CLR4_1_101je31je3lusqket3.R.inc(71807);
        __CLR4_1_101je31je3lusqket3.R.inc(71808);Exception error = null;
        __CLR4_1_101je31je3lusqket3.R.inc(71809);try {
            __CLR4_1_101je31je3lusqket3.R.inc(71810);JSON.parseObject("[1,92233720368547758000}", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101je31je3lusqket3.R.inc(71811);error = ex;
        }
        __CLR4_1_101je31je3lusqket3.R.inc(71812);Assert.assertNotNull(error);
    }finally{__CLR4_1_101je31je3lusqket3.R.flushNeeded();}}
    
    public void test_long_error_min() throws Exception {__CLR4_1_101je31je3lusqket3.R.globalSliceStart(getClass().getName(),71813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pto6181jet();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101je31je3lusqket3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101je31je3lusqket3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_long.test_long_error_min",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71813,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pto6181jet() throws Exception{try{__CLR4_1_101je31je3lusqket3.R.inc(71813);
        __CLR4_1_101je31je3lusqket3.R.inc(71814);Exception error = null;
        __CLR4_1_101je31je3lusqket3.R.inc(71815);try {
            __CLR4_1_101je31je3lusqket3.R.inc(71816);JSON.parseObject("[1,-92233720368547758000}", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101je31je3lusqket3.R.inc(71817);error = ex;
        }
        __CLR4_1_101je31je3lusqket3.R.inc(71818);Assert.assertNotNull(error);
    }finally{__CLR4_1_101je31je3lusqket3.R.flushNeeded();}}

    public static class Model {
        public long v1;
        public long v2;
    }
}
