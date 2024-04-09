/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_array_multi extends TestCase {static class __CLR4_5_21ph21ph2lusvnfcx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,79689,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    Object[] list = new Object[10];

    public JSONPath_array_multi(){try{__CLR4_5_21ph21ph2lusvnfcx.R.inc(79670);
        __CLR4_5_21ph21ph2lusvnfcx.R.inc(79671);for (int i = 0; (((i < list.length)&&(__CLR4_5_21ph21ph2lusvnfcx.R.iget(79672)!=0|true))||(__CLR4_5_21ph21ph2lusvnfcx.R.iget(79673)==0&false)); ++i) {{
            __CLR4_5_21ph21ph2lusvnfcx.R.inc(79674);list[i] = new Object();
        }
    }}finally{__CLR4_5_21ph21ph2lusvnfcx.R.flushNeeded();}}

    public void test_list_multi() throws Exception {__CLR4_5_21ph21ph2lusvnfcx.R.globalSliceStart(getClass().getName(),79675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pvf2do1ph7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ph21ph2lusvnfcx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ph21ph2lusvnfcx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_multi.test_list_multi",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79675,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pvf2do1ph7() throws Exception{try{__CLR4_5_21ph21ph2lusvnfcx.R.inc(79675);
        __CLR4_5_21ph21ph2lusvnfcx.R.inc(79676);List<Object> result = (List<Object>) new JSONPath("$[2,4,5,8,100]").eval(list);
        __CLR4_5_21ph21ph2lusvnfcx.R.inc(79677);Assert.assertEquals(5, result.size());
        __CLR4_5_21ph21ph2lusvnfcx.R.inc(79678);Assert.assertSame(list[2], result.get(0));
        __CLR4_5_21ph21ph2lusvnfcx.R.inc(79679);Assert.assertSame(list[4], result.get(1));
        __CLR4_5_21ph21ph2lusvnfcx.R.inc(79680);Assert.assertSame(list[5], result.get(2));
        __CLR4_5_21ph21ph2lusvnfcx.R.inc(79681);Assert.assertSame(list[8], result.get(3));
        __CLR4_5_21ph21ph2lusvnfcx.R.inc(79682);Assert.assertNull(result.get(4));
    }finally{__CLR4_5_21ph21ph2lusvnfcx.R.flushNeeded();}}

    public void test_list_multi_negative() throws Exception {__CLR4_5_21ph21ph2lusvnfcx.R.globalSliceStart(getClass().getName(),79683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fhy1ze1phf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ph21ph2lusvnfcx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ph21ph2lusvnfcx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_multi.test_list_multi_negative",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79683,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fhy1ze1phf() throws Exception{try{__CLR4_5_21ph21ph2lusvnfcx.R.inc(79683);
        __CLR4_5_21ph21ph2lusvnfcx.R.inc(79684);List<Object> result = (List<Object>) new JSONPath("$[-1,-2,-100]")
                .eval(list);
        __CLR4_5_21ph21ph2lusvnfcx.R.inc(79685);Assert.assertEquals(3, result.size());
        __CLR4_5_21ph21ph2lusvnfcx.R.inc(79686);Assert.assertSame(list[9], result.get(0));
        __CLR4_5_21ph21ph2lusvnfcx.R.inc(79687);Assert.assertSame(list[8], result.get(1));
        __CLR4_5_21ph21ph2lusvnfcx.R.inc(79688);Assert.assertNull(result.get(2));
    }finally{__CLR4_5_21ph21ph2lusvnfcx.R.flushNeeded();}}
}
