/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.stream;

import java.io.StringReader;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONReader;

public class JSONReader_obj_3 extends TestCase {static class __CLR4_5_21o731o73lusyjuh0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,78045,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_obj() throws Exception {__CLR4_5_21o731o73lusyjuh0.R.globalSliceStart(getClass().getName(),78015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24ckqwf1o73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o731o73lusyjuh0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o731o73lusyjuh0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReader_obj_3.test_obj",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78015,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24ckqwf1o73() throws Exception{try{__CLR4_5_21o731o73lusyjuh0.R.inc(78015);
        __CLR4_5_21o731o73lusyjuh0.R.inc(78016);JSONReader reader = new JSONReader(new StringReader("{\"id\":123}"));

        __CLR4_5_21o731o73lusyjuh0.R.inc(78017);reader.startObject();
        __CLR4_5_21o731o73lusyjuh0.R.inc(78018);Assert.assertEquals("id", reader.readString());
        __CLR4_5_21o731o73lusyjuh0.R.inc(78019);Assert.assertEquals(Integer.valueOf(123), reader.readInteger());
        __CLR4_5_21o731o73lusyjuh0.R.inc(78020);reader.endObject();

        __CLR4_5_21o731o73lusyjuh0.R.inc(78021);reader.close();
    }finally{__CLR4_5_21o731o73lusyjuh0.R.flushNeeded();}}

    public void test_obj_2() throws Exception {__CLR4_5_21o731o73lusyjuh0.R.globalSliceStart(getClass().getName(),78022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ijleas1o7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o731o73lusyjuh0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o731o73lusyjuh0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReader_obj_3.test_obj_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78022,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ijleas1o7a() throws Exception{try{__CLR4_5_21o731o73lusyjuh0.R.inc(78022);
        __CLR4_5_21o731o73lusyjuh0.R.inc(78023);JSONReader reader = new JSONReader(new StringReader("{\"val\":{\"id\":123}}"));

        __CLR4_5_21o731o73lusyjuh0.R.inc(78024);reader.startObject();

        __CLR4_5_21o731o73lusyjuh0.R.inc(78025);Assert.assertEquals("val", reader.readString());

        __CLR4_5_21o731o73lusyjuh0.R.inc(78026);reader.startObject();
        __CLR4_5_21o731o73lusyjuh0.R.inc(78027);Assert.assertEquals("id", reader.readString());
        __CLR4_5_21o731o73lusyjuh0.R.inc(78028);Assert.assertEquals(Integer.valueOf(123), reader.readInteger());
        __CLR4_5_21o731o73lusyjuh0.R.inc(78029);reader.endObject();

        __CLR4_5_21o731o73lusyjuh0.R.inc(78030);reader.endObject();

        __CLR4_5_21o731o73lusyjuh0.R.inc(78031);reader.close();
    }finally{__CLR4_5_21o731o73lusyjuh0.R.flushNeeded();}}
    
    public void test_obj_3() throws Exception {__CLR4_5_21o731o73lusyjuh0.R.globalSliceStart(getClass().getName(),78032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lsld391o7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o731o73lusyjuh0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o731o73lusyjuh0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReader_obj_3.test_obj_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78032,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lsld391o7k() throws Exception{try{__CLR4_5_21o731o73lusyjuh0.R.inc(78032);
        __CLR4_5_21o731o73lusyjuh0.R.inc(78033);JSONReader reader = new JSONReader(new StringReader("{\"val\":{\"val\":{\"id\":123}}}"));

        __CLR4_5_21o731o73lusyjuh0.R.inc(78034);reader.startObject();
        __CLR4_5_21o731o73lusyjuh0.R.inc(78035);Assert.assertEquals("val", reader.readString());
        
        __CLR4_5_21o731o73lusyjuh0.R.inc(78036);reader.startObject();
        __CLR4_5_21o731o73lusyjuh0.R.inc(78037);Assert.assertEquals("val", reader.readString());

        __CLR4_5_21o731o73lusyjuh0.R.inc(78038);reader.startObject();
        __CLR4_5_21o731o73lusyjuh0.R.inc(78039);Assert.assertEquals("id", reader.readString());
        __CLR4_5_21o731o73lusyjuh0.R.inc(78040);Assert.assertEquals(Long.valueOf(123), reader.readLong());
        __CLR4_5_21o731o73lusyjuh0.R.inc(78041);reader.endObject();

        __CLR4_5_21o731o73lusyjuh0.R.inc(78042);reader.endObject();
        __CLR4_5_21o731o73lusyjuh0.R.inc(78043);reader.endObject();

        __CLR4_5_21o731o73lusyjuh0.R.inc(78044);reader.close();
    }finally{__CLR4_5_21o731o73lusyjuh0.R.flushNeeded();}}

}
