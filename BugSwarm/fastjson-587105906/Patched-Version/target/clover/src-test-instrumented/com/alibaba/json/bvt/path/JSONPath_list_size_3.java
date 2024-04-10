/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

import junit.framework.TestCase;

public class JSONPath_list_size_3 extends TestCase {static class __CLR4_5_21po11po1lusyjuoc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,79935,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_java_bean() throws Exception {__CLR4_5_21po11po1lusyjuoc.R.globalSliceStart(getClass().getName(),79921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22sxklj1po1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21po11po1lusyjuoc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21po11po1lusyjuoc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_list_size_3.test_java_bean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79921,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22sxklj1po1() throws Exception{try{__CLR4_5_21po11po1lusyjuoc.R.inc(79921);
        __CLR4_5_21po11po1lusyjuoc.R.inc(79922);Model model = new Model();
        __CLR4_5_21po11po1lusyjuoc.R.inc(79923);model.id = 1001;
        __CLR4_5_21po11po1lusyjuoc.R.inc(79924);model.name = "wenshao";
        __CLR4_5_21po11po1lusyjuoc.R.inc(79925);JSONPath path = new JSONPath("$.size()");
        __CLR4_5_21po11po1lusyjuoc.R.inc(79926);Integer result = (Integer) path.eval(model);
        __CLR4_5_21po11po1lusyjuoc.R.inc(79927);Assert.assertEquals(2, result.intValue());
    }finally{__CLR4_5_21po11po1lusyjuoc.R.flushNeeded();}}
    
    public void test_java_bean_field_null() throws Exception {__CLR4_5_21po11po1lusyjuoc.R.globalSliceStart(getClass().getName(),79928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21dzqq61po8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21po11po1lusyjuoc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21po11po1lusyjuoc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_list_size_3.test_java_bean_field_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79928,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21dzqq61po8() throws Exception{try{__CLR4_5_21po11po1lusyjuoc.R.inc(79928);
        __CLR4_5_21po11po1lusyjuoc.R.inc(79929);Model model = new Model();
        __CLR4_5_21po11po1lusyjuoc.R.inc(79930);model.id = 1001;
        __CLR4_5_21po11po1lusyjuoc.R.inc(79931);model.name = null;
        __CLR4_5_21po11po1lusyjuoc.R.inc(79932);JSONPath path = new JSONPath("$.size()");
        __CLR4_5_21po11po1lusyjuoc.R.inc(79933);Integer result = (Integer) path.eval(model);
        __CLR4_5_21po11po1lusyjuoc.R.inc(79934);Assert.assertEquals(1, result.intValue());
    }finally{__CLR4_5_21po11po1lusyjuoc.R.flushNeeded();}}
    
    public static class Model {
        public int id;
        public String name;
    }
}
