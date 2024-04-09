/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

import java.util.List;

/**
 * Created by wenshao on 18/01/2017.
 */
public class Issue1005 extends TestCase {static class __CLR4_5_217ca17calusvn7ny{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,56184,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_217ca17calusvn7ny.R.globalSliceStart(getClass().getName(),56170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb17ca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217ca17calusvn7ny.R.rethrow($CLV_t2$);}finally{__CLR4_5_217ca17calusvn7ny.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue1005.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56170,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb17ca() throws Exception{try{__CLR4_5_217ca17calusvn7ny.R.inc(56170);
        __CLR4_5_217ca17calusvn7ny.R.inc(56171);Model model = JSON.parseObject("{\"values\":[[1,2,3]]}", Model.class);

        __CLR4_5_217ca17calusvn7ny.R.inc(56172);assertNotNull(model.values);
        __CLR4_5_217ca17calusvn7ny.R.inc(56173);assertEquals(3, model.values[0].size());
        __CLR4_5_217ca17calusvn7ny.R.inc(56174);assertEquals(Byte.class, model.values[0].get(0).getClass());
        __CLR4_5_217ca17calusvn7ny.R.inc(56175);assertEquals(Byte.class, model.values[0].get(1).getClass());
        __CLR4_5_217ca17calusvn7ny.R.inc(56176);assertEquals(Byte.class, model.values[0].get(2).getClass());
    }finally{__CLR4_5_217ca17calusvn7ny.R.flushNeeded();}}

    public void test_for_List() throws Exception {__CLR4_5_217ca17calusvn7ny.R.globalSliceStart(getClass().getName(),56177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hj4vh417ch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217ca17calusvn7ny.R.rethrow($CLV_t2$);}finally{__CLR4_5_217ca17calusvn7ny.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue1005.test_for_List",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56177,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hj4vh417ch() throws Exception{try{__CLR4_5_217ca17calusvn7ny.R.inc(56177);
        __CLR4_5_217ca17calusvn7ny.R.inc(56178);Model2 model = JSON.parseObject("{\"values\":[1,2,3]}", Model2.class);

        __CLR4_5_217ca17calusvn7ny.R.inc(56179);assertNotNull(model.values);
        __CLR4_5_217ca17calusvn7ny.R.inc(56180);assertEquals(3, model.values.size());
        __CLR4_5_217ca17calusvn7ny.R.inc(56181);assertEquals(Byte.class, model.values.get(0).getClass());
        __CLR4_5_217ca17calusvn7ny.R.inc(56182);assertEquals(Byte.class, model.values.get(1).getClass());
        __CLR4_5_217ca17calusvn7ny.R.inc(56183);assertEquals(Byte.class, model.values.get(2).getClass());
    }finally{__CLR4_5_217ca17calusvn7ny.R.flushNeeded();}}

    public static class Model {
        public List<Byte>[] values;
    }

    public static class Model2 {
        public List<Byte> values;
    }
}
