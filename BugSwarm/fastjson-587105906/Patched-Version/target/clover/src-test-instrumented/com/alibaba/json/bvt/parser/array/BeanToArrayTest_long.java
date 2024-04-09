/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.array;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;

import junit.framework.TestCase;

public class BeanToArrayTest_long extends TestCase {static class __CLR4_5_21kc01kc0lusvnduy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,73040,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_long() throws Exception {__CLR4_5_21kc01kc0lusvnduy.R.globalSliceStart(getClass().getName(),73008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eplvzk1kc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kc01kc0lusvnduy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kc01kc0lusvnduy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_long.test_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73008,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eplvzk1kc0() throws Exception{try{__CLR4_5_21kc01kc0lusvnduy.R.inc(73008);
        __CLR4_5_21kc01kc0lusvnduy.R.inc(73009);Model model = JSON.parseObject("[-100,100]", Model.class, Feature.SupportArrayToBean);
        __CLR4_5_21kc01kc0lusvnduy.R.inc(73010);Assert.assertEquals(-100L, model.v1);
        __CLR4_5_21kc01kc0lusvnduy.R.inc(73011);Assert.assertEquals(100L, model.v2);
    }finally{__CLR4_5_21kc01kc0lusvnduy.R.flushNeeded();}}
    
    public void test_long_space() throws Exception {__CLR4_5_21kc01kc0lusvnduy.R.globalSliceStart(getClass().getName(),73012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2da9xg71kc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kc01kc0lusvnduy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kc01kc0lusvnduy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_long.test_long_space",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73012,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2da9xg71kc4() throws Exception{try{__CLR4_5_21kc01kc0lusvnduy.R.inc(73012);
        __CLR4_5_21kc01kc0lusvnduy.R.inc(73013);Model model = JSON.parseObject("[-100 ,100 ]", Model.class, Feature.SupportArrayToBean);
        __CLR4_5_21kc01kc0lusvnduy.R.inc(73014);Assert.assertEquals(-100L, model.v1);
        __CLR4_5_21kc01kc0lusvnduy.R.inc(73015);Assert.assertEquals(100L, model.v2);
    }finally{__CLR4_5_21kc01kc0lusvnduy.R.flushNeeded();}}

    public void test_long_error() throws Exception {__CLR4_5_21kc01kc0lusvnduy.R.globalSliceStart(getClass().getName(),73016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2flyld31kc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kc01kc0lusvnduy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kc01kc0lusvnduy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_long.test_long_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73016,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2flyld31kc8() throws Exception{try{__CLR4_5_21kc01kc0lusvnduy.R.inc(73016);
        __CLR4_5_21kc01kc0lusvnduy.R.inc(73017);Exception error = null;
        __CLR4_5_21kc01kc0lusvnduy.R.inc(73018);try {
            __CLR4_5_21kc01kc0lusvnduy.R.inc(73019);JSON.parseObject("[-", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21kc01kc0lusvnduy.R.inc(73020);error = ex;
        }
        __CLR4_5_21kc01kc0lusvnduy.R.inc(73021);Assert.assertNotNull(error);
    }finally{__CLR4_5_21kc01kc0lusvnduy.R.flushNeeded();}}
    
    public void test_long_error_2() throws Exception {__CLR4_5_21kc01kc0lusvnduy.R.globalSliceStart(getClass().getName(),73022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_269wgd01kce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kc01kc0lusvnduy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kc01kc0lusvnduy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_long.test_long_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73022,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_269wgd01kce() throws Exception{try{__CLR4_5_21kc01kc0lusvnduy.R.inc(73022);
        __CLR4_5_21kc01kc0lusvnduy.R.inc(73023);Exception error = null;
        __CLR4_5_21kc01kc0lusvnduy.R.inc(73024);try {
            __CLR4_5_21kc01kc0lusvnduy.R.inc(73025);JSON.parseObject("[-1:", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21kc01kc0lusvnduy.R.inc(73026);error = ex;
        }
        __CLR4_5_21kc01kc0lusvnduy.R.inc(73027);Assert.assertNotNull(error);
    }finally{__CLR4_5_21kc01kc0lusvnduy.R.flushNeeded();}}
    
    public void test_long_error_max() throws Exception {__CLR4_5_21kc01kc0lusvnduy.R.globalSliceStart(getClass().getName(),73028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xo4rj21kck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kc01kc0lusvnduy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kc01kc0lusvnduy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_long.test_long_error_max",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73028,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xo4rj21kck() throws Exception{try{__CLR4_5_21kc01kc0lusvnduy.R.inc(73028);
        __CLR4_5_21kc01kc0lusvnduy.R.inc(73029);Exception error = null;
        __CLR4_5_21kc01kc0lusvnduy.R.inc(73030);try {
            __CLR4_5_21kc01kc0lusvnduy.R.inc(73031);JSON.parseObject("[1,92233720368547758000}", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21kc01kc0lusvnduy.R.inc(73032);error = ex;
        }
        __CLR4_5_21kc01kc0lusvnduy.R.inc(73033);Assert.assertNotNull(error);
    }finally{__CLR4_5_21kc01kc0lusvnduy.R.flushNeeded();}}
    
    public void test_long_error_min() throws Exception {__CLR4_5_21kc01kc0lusvnduy.R.globalSliceStart(getClass().getName(),73034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pto6181kcq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kc01kc0lusvnduy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kc01kc0lusvnduy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.array.BeanToArrayTest_long.test_long_error_min",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73034,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pto6181kcq() throws Exception{try{__CLR4_5_21kc01kc0lusvnduy.R.inc(73034);
        __CLR4_5_21kc01kc0lusvnduy.R.inc(73035);Exception error = null;
        __CLR4_5_21kc01kc0lusvnduy.R.inc(73036);try {
            __CLR4_5_21kc01kc0lusvnduy.R.inc(73037);JSON.parseObject("[1,-92233720368547758000}", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21kc01kc0lusvnduy.R.inc(73038);error = ex;
        }
        __CLR4_5_21kc01kc0lusvnduy.R.inc(73039);Assert.assertNotNull(error);
    }finally{__CLR4_5_21kc01kc0lusvnduy.R.flushNeeded();}}

    public static class Model {
        public long v1;
        public long v2;
    }
}
