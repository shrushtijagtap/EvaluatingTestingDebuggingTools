/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.stream;

import java.io.StringReader;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONReader;

public class JSONReader_string extends TestCase {static class __CLR4_1_101p6g1p6gluszwe4f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,79312,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_array() throws Exception {__CLR4_1_101p6g1p6gluszwe4f.R.globalSliceStart(getClass().getName(),79288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vw0vd91p6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101p6g1p6gluszwe4f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101p6g1p6gluszwe4f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReader_string.test_array",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79288,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vw0vd91p6g() throws Exception{try{__CLR4_1_101p6g1p6gluszwe4f.R.inc(79288);
        __CLR4_1_101p6g1p6gluszwe4f.R.inc(79289);JSONReader reader = new JSONReader(new StringReader("[\"abc\"]"));

        __CLR4_1_101p6g1p6gluszwe4f.R.inc(79290);reader.startArray();

        __CLR4_1_101p6g1p6gluszwe4f.R.inc(79291);Assert.assertEquals("abc", reader.readString());

        __CLR4_1_101p6g1p6gluszwe4f.R.inc(79292);reader.endArray();

        __CLR4_1_101p6g1p6gluszwe4f.R.inc(79293);reader.close();
    }finally{__CLR4_1_101p6g1p6gluszwe4f.R.flushNeeded();}}
    
    public void test_array_2() throws Exception {__CLR4_1_101p6g1p6gluszwe4f.R.globalSliceStart(getClass().getName(),79294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10o3xg8q1p6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101p6g1p6gluszwe4f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101p6g1p6gluszwe4f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReader_string.test_array_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79294,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10o3xg8q1p6m() throws Exception{try{__CLR4_1_101p6g1p6gluszwe4f.R.inc(79294);
        __CLR4_1_101p6g1p6gluszwe4f.R.inc(79295);JSONReader reader = new JSONReader(new StringReader("[[\"abc\"]]"));

        __CLR4_1_101p6g1p6gluszwe4f.R.inc(79296);reader.startArray();
        __CLR4_1_101p6g1p6gluszwe4f.R.inc(79297);reader.startArray();

        __CLR4_1_101p6g1p6gluszwe4f.R.inc(79298);Assert.assertEquals("abc", reader.readString());

        __CLR4_1_101p6g1p6gluszwe4f.R.inc(79299);reader.endArray();
        __CLR4_1_101p6g1p6gluszwe4f.R.inc(79300);reader.endArray();

        __CLR4_1_101p6g1p6gluszwe4f.R.inc(79301);reader.close();
    }finally{__CLR4_1_101p6g1p6gluszwe4f.R.flushNeeded();}}
    
    public void test_array_3() throws Exception {__CLR4_1_101p6g1p6gluszwe4f.R.globalSliceStart(getClass().getName(),79302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kuxhg91p6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101p6g1p6gluszwe4f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101p6g1p6gluszwe4f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReader_string.test_array_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79302,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kuxhg91p6u() throws Exception{try{__CLR4_1_101p6g1p6gluszwe4f.R.inc(79302);
        __CLR4_1_101p6g1p6gluszwe4f.R.inc(79303);JSONReader reader = new JSONReader(new StringReader("[[[\"abc\"]]]"));

        __CLR4_1_101p6g1p6gluszwe4f.R.inc(79304);reader.startArray();
        __CLR4_1_101p6g1p6gluszwe4f.R.inc(79305);reader.startArray();
        __CLR4_1_101p6g1p6gluszwe4f.R.inc(79306);reader.startArray();

        __CLR4_1_101p6g1p6gluszwe4f.R.inc(79307);Assert.assertEquals("abc", reader.readString());

        __CLR4_1_101p6g1p6gluszwe4f.R.inc(79308);reader.endArray();
        __CLR4_1_101p6g1p6gluszwe4f.R.inc(79309);reader.endArray();
        __CLR4_1_101p6g1p6gluszwe4f.R.inc(79310);reader.endArray();

        __CLR4_1_101p6g1p6gluszwe4f.R.inc(79311);reader.close();
    }finally{__CLR4_1_101p6g1p6gluszwe4f.R.flushNeeded();}}

}
