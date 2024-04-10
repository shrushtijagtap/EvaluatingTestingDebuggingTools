/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_list_size extends TestCase {static class __CLR4_5_21pmw1pmwlusyjuo7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,79896,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_list_size() throws Exception {__CLR4_5_21pmw1pmwlusyjuo7.R.globalSliceStart(getClass().getName(),79880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23ae6gs1pmw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pmw1pmwlusyjuo7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pmw1pmwlusyjuo7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_list_size.test_list_size",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79880,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23ae6gs1pmw() throws Exception{try{__CLR4_5_21pmw1pmwlusyjuo7.R.inc(79880);
        __CLR4_5_21pmw1pmwlusyjuo7.R.inc(79881);List list = new ArrayList();
        __CLR4_5_21pmw1pmwlusyjuo7.R.inc(79882);list.add(new Object());
        __CLR4_5_21pmw1pmwlusyjuo7.R.inc(79883);list.add(new Object());
        __CLR4_5_21pmw1pmwlusyjuo7.R.inc(79884);list.add(new Object());
        __CLR4_5_21pmw1pmwlusyjuo7.R.inc(79885);JSONPath path = new JSONPath("$.size()");
        __CLR4_5_21pmw1pmwlusyjuo7.R.inc(79886);Integer result = (Integer) path.eval(list);
        __CLR4_5_21pmw1pmwlusyjuo7.R.inc(79887);Assert.assertEquals(list.size(), result.intValue());
    }finally{__CLR4_5_21pmw1pmwlusyjuo7.R.flushNeeded();}}

    public void test_list_size2() throws Exception {__CLR4_5_21pmw1pmwlusyjuo7.R.globalSliceStart(getClass().getName(),79888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22ofp441pn4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pmw1pmwlusyjuo7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pmw1pmwlusyjuo7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_list_size.test_list_size2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79888,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22ofp441pn4() throws Exception{try{__CLR4_5_21pmw1pmwlusyjuo7.R.inc(79888);
        __CLR4_5_21pmw1pmwlusyjuo7.R.inc(79889);List list = new ArrayList();
        __CLR4_5_21pmw1pmwlusyjuo7.R.inc(79890);list.add(new Object());
        __CLR4_5_21pmw1pmwlusyjuo7.R.inc(79891);list.add(new Object());
        __CLR4_5_21pmw1pmwlusyjuo7.R.inc(79892);list.add(new Object());
        __CLR4_5_21pmw1pmwlusyjuo7.R.inc(79893);JSONPath path = new JSONPath("$.size");
        __CLR4_5_21pmw1pmwlusyjuo7.R.inc(79894);Integer result = (Integer) path.eval(list);
        __CLR4_5_21pmw1pmwlusyjuo7.R.inc(79895);Assert.assertEquals(list.size(), result.intValue());
    }finally{__CLR4_5_21pmw1pmwlusyjuo7.R.flushNeeded();}}
}
