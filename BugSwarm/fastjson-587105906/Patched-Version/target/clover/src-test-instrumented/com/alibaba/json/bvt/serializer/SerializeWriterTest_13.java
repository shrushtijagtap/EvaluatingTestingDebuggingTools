/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringWriter;
import java.util.Collections;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class SerializeWriterTest_13 extends TestCase {static class __CLR4_5_21tsc1tsclusvngiv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,85279,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_default() throws Exception {__CLR4_5_21tsc1tsclusvngiv.R.globalSliceStart(getClass().getName(),85260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hzlw2t1tsc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tsc1tsclusvngiv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tsc1tsclusvngiv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_13.test_default",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85260,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hzlw2t1tsc() throws Exception{try{__CLR4_5_21tsc1tsclusvngiv.R.inc(85260);
        __CLR4_5_21tsc1tsclusvngiv.R.inc(85261);Assert.assertEquals("{\"\":\"\"}", //
                            JSON.toJSONStringZ(Collections.singletonMap("", ""), //
                                               SerializeConfig.getGlobalInstance()));
    }finally{__CLR4_5_21tsc1tsclusvngiv.R.flushNeeded();}}

    public void test_single() throws Exception {__CLR4_5_21tsc1tsclusvngiv.R.globalSliceStart(getClass().getName(),85262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hvnqh01tse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tsc1tsclusvngiv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tsc1tsclusvngiv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_13.test_single",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85262,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hvnqh01tse() throws Exception{try{__CLR4_5_21tsc1tsclusvngiv.R.inc(85262);
        __CLR4_5_21tsc1tsclusvngiv.R.inc(85263);Assert.assertEquals("{'':''}", //
                            JSON.toJSONStringZ(Collections.singletonMap("", ""), //
                                               SerializeConfig.getGlobalInstance(), SerializerFeature.UseSingleQuotes));
    }finally{__CLR4_5_21tsc1tsclusvngiv.R.flushNeeded();}}

    public void test_writer() throws Exception {__CLR4_5_21tsc1tsclusvngiv.R.globalSliceStart(getClass().getName(),85264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nz04qv1tsg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tsc1tsclusvngiv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tsc1tsclusvngiv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_13.test_writer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85264,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nz04qv1tsg() throws Exception{try{__CLR4_5_21tsc1tsclusvngiv.R.inc(85264);
        __CLR4_5_21tsc1tsclusvngiv.R.inc(85265);SerializeWriter out = new SerializeWriter(3);

        __CLR4_5_21tsc1tsclusvngiv.R.inc(85266);try {
            __CLR4_5_21tsc1tsclusvngiv.R.inc(85267);JSONSerializer serializer = new JSONSerializer(out);

            __CLR4_5_21tsc1tsclusvngiv.R.inc(85268);serializer.write(Collections.singletonMap("", ""));
            __CLR4_5_21tsc1tsclusvngiv.R.inc(85269);Assert.assertEquals("{\"\":\"\"}", out.toString());
        } finally {
            __CLR4_5_21tsc1tsclusvngiv.R.inc(85270);out.close();
        }
    }finally{__CLR4_5_21tsc1tsclusvngiv.R.flushNeeded();}}

    public void test_writer_single() throws Exception {__CLR4_5_21tsc1tsclusvngiv.R.globalSliceStart(getClass().getName(),85271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25wiozy1tsn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tsc1tsclusvngiv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tsc1tsclusvngiv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_13.test_writer_single",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85271,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25wiozy1tsn() throws Exception{try{__CLR4_5_21tsc1tsclusvngiv.R.inc(85271);
        __CLR4_5_21tsc1tsclusvngiv.R.inc(85272);SerializeWriter out = new SerializeWriter(3);
        __CLR4_5_21tsc1tsclusvngiv.R.inc(85273);out.config(SerializerFeature.UseSingleQuotes, true);

        __CLR4_5_21tsc1tsclusvngiv.R.inc(85274);try {
            __CLR4_5_21tsc1tsclusvngiv.R.inc(85275);JSONSerializer serializer = new JSONSerializer(out);

            __CLR4_5_21tsc1tsclusvngiv.R.inc(85276);serializer.write(Collections.singletonMap("", ""));
            __CLR4_5_21tsc1tsclusvngiv.R.inc(85277);Assert.assertEquals("{'':''}", out.toString());
        } finally {
            __CLR4_5_21tsc1tsclusvngiv.R.inc(85278);out.close();
        }
    }finally{__CLR4_5_21tsc1tsclusvngiv.R.flushNeeded();}}
    
}
