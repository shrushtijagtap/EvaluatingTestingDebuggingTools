/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.stream;

import java.io.StringReader;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONReader;

public class JSONReader_string extends TestCase {static class __CLR4_5_21o7x1o7xlusyjuh2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,78069,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_array() throws Exception {__CLR4_5_21o7x1o7xlusyjuh2.R.globalSliceStart(getClass().getName(),78045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vw0vd91o7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o7x1o7xlusyjuh2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o7x1o7xlusyjuh2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReader_string.test_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78045,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vw0vd91o7x() throws Exception{try{__CLR4_5_21o7x1o7xlusyjuh2.R.inc(78045);
        __CLR4_5_21o7x1o7xlusyjuh2.R.inc(78046);JSONReader reader = new JSONReader(new StringReader("[\"abc\"]"));

        __CLR4_5_21o7x1o7xlusyjuh2.R.inc(78047);reader.startArray();

        __CLR4_5_21o7x1o7xlusyjuh2.R.inc(78048);Assert.assertEquals("abc", reader.readString());

        __CLR4_5_21o7x1o7xlusyjuh2.R.inc(78049);reader.endArray();

        __CLR4_5_21o7x1o7xlusyjuh2.R.inc(78050);reader.close();
    }finally{__CLR4_5_21o7x1o7xlusyjuh2.R.flushNeeded();}}
    
    public void test_array_2() throws Exception {__CLR4_5_21o7x1o7xlusyjuh2.R.globalSliceStart(getClass().getName(),78051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o3xg8q1o83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o7x1o7xlusyjuh2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o7x1o7xlusyjuh2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReader_string.test_array_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78051,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o3xg8q1o83() throws Exception{try{__CLR4_5_21o7x1o7xlusyjuh2.R.inc(78051);
        __CLR4_5_21o7x1o7xlusyjuh2.R.inc(78052);JSONReader reader = new JSONReader(new StringReader("[[\"abc\"]]"));

        __CLR4_5_21o7x1o7xlusyjuh2.R.inc(78053);reader.startArray();
        __CLR4_5_21o7x1o7xlusyjuh2.R.inc(78054);reader.startArray();

        __CLR4_5_21o7x1o7xlusyjuh2.R.inc(78055);Assert.assertEquals("abc", reader.readString());

        __CLR4_5_21o7x1o7xlusyjuh2.R.inc(78056);reader.endArray();
        __CLR4_5_21o7x1o7xlusyjuh2.R.inc(78057);reader.endArray();

        __CLR4_5_21o7x1o7xlusyjuh2.R.inc(78058);reader.close();
    }finally{__CLR4_5_21o7x1o7xlusyjuh2.R.flushNeeded();}}
    
    public void test_array_3() throws Exception {__CLR4_5_21o7x1o7xlusyjuh2.R.globalSliceStart(getClass().getName(),78059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kuxhg91o8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o7x1o7xlusyjuh2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o7x1o7xlusyjuh2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReader_string.test_array_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78059,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kuxhg91o8b() throws Exception{try{__CLR4_5_21o7x1o7xlusyjuh2.R.inc(78059);
        __CLR4_5_21o7x1o7xlusyjuh2.R.inc(78060);JSONReader reader = new JSONReader(new StringReader("[[[\"abc\"]]]"));

        __CLR4_5_21o7x1o7xlusyjuh2.R.inc(78061);reader.startArray();
        __CLR4_5_21o7x1o7xlusyjuh2.R.inc(78062);reader.startArray();
        __CLR4_5_21o7x1o7xlusyjuh2.R.inc(78063);reader.startArray();

        __CLR4_5_21o7x1o7xlusyjuh2.R.inc(78064);Assert.assertEquals("abc", reader.readString());

        __CLR4_5_21o7x1o7xlusyjuh2.R.inc(78065);reader.endArray();
        __CLR4_5_21o7x1o7xlusyjuh2.R.inc(78066);reader.endArray();
        __CLR4_5_21o7x1o7xlusyjuh2.R.inc(78067);reader.endArray();

        __CLR4_5_21o7x1o7xlusyjuh2.R.inc(78068);reader.close();
    }finally{__CLR4_5_21o7x1o7xlusyjuh2.R.flushNeeded();}}

}
