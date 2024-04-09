/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.math.BigDecimal;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class SerializeWriterTest_5 extends TestCase {static class __CLR4_5_21ty91ty9lusvngjs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,85500,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21ty91ty9lusvngjs.R.globalSliceStart(getClass().getName(),85473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21ty9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ty91ty9lusvngjs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ty91ty9lusvngjs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_5.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85473,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21ty9() throws Exception{try{__CLR4_5_21ty91ty9lusvngjs.R.inc(85473);
        __CLR4_5_21ty91ty9lusvngjs.R.inc(85474);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21ty91ty9lusvngjs.R.inc(85475);out.config(SerializerFeature.QuoteFieldNames, true);
        __CLR4_5_21ty91ty9lusvngjs.R.inc(85476);out.writeFieldValue(',', "name", (Enum) null);
        __CLR4_5_21ty91ty9lusvngjs.R.inc(85477);Assert.assertEquals(",\"name\":null", out.toString());
    }finally{__CLR4_5_21ty91ty9lusvngjs.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_5_21ty91ty9lusvngjs.R.globalSliceStart(getClass().getName(),85478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1tye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ty91ty9lusvngjs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ty91ty9lusvngjs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_5.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85478,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1tye() throws Exception{try{__CLR4_5_21ty91ty9lusvngjs.R.inc(85478);
        __CLR4_5_21ty91ty9lusvngjs.R.inc(85479);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21ty91ty9lusvngjs.R.inc(85480);out.config(SerializerFeature.QuoteFieldNames, true);
        __CLR4_5_21ty91ty9lusvngjs.R.inc(85481);out.writeFieldValue(',', "name", (BigDecimal) null);
        __CLR4_5_21ty91ty9lusvngjs.R.inc(85482);Assert.assertEquals(",\"name\":null", out.toString());
    }finally{__CLR4_5_21ty91ty9lusvngjs.R.flushNeeded();}}
    
    public void test_2() throws Exception {__CLR4_5_21ty91ty9lusvngjs.R.globalSliceStart(getClass().getName(),85483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441tyj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ty91ty9lusvngjs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ty91ty9lusvngjs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_5.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85483,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441tyj() throws Exception{try{__CLR4_5_21ty91ty9lusvngjs.R.inc(85483);
        __CLR4_5_21ty91ty9lusvngjs.R.inc(85484);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21ty91ty9lusvngjs.R.inc(85485);out.config(SerializerFeature.QuoteFieldNames, true);
        __CLR4_5_21ty91ty9lusvngjs.R.inc(85486);out.writeFieldValue(',', "name", (String) null);
        __CLR4_5_21ty91ty9lusvngjs.R.inc(85487);Assert.assertEquals(",\"name\":null", out.toString());
    }finally{__CLR4_5_21ty91ty9lusvngjs.R.flushNeeded();}}
    
    public void test_3() throws Exception {__CLR4_5_21ty91ty9lusvngjs.R.globalSliceStart(getClass().getName(),85488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1tyo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ty91ty9lusvngjs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ty91ty9lusvngjs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_5.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85488,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1tyo() throws Exception{try{__CLR4_5_21ty91ty9lusvngjs.R.inc(85488);
        __CLR4_5_21ty91ty9lusvngjs.R.inc(85489);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21ty91ty9lusvngjs.R.inc(85490);out.config(SerializerFeature.QuoteFieldNames, true);
        __CLR4_5_21ty91ty9lusvngjs.R.inc(85491);out.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21ty91ty9lusvngjs.R.inc(85492);out.writeFieldValue(',', "name", (String) null);
        __CLR4_5_21ty91ty9lusvngjs.R.inc(85493);Assert.assertEquals(",'name':null", out.toString());
    }finally{__CLR4_5_21ty91ty9lusvngjs.R.flushNeeded();}}
    
    public void test_4() throws Exception {__CLR4_5_21ty91ty9lusvngjs.R.globalSliceStart(getClass().getName(),85494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61tyu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ty91ty9lusvngjs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ty91ty9lusvngjs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_5.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85494,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61tyu() throws Exception{try{__CLR4_5_21ty91ty9lusvngjs.R.inc(85494);
        __CLR4_5_21ty91ty9lusvngjs.R.inc(85495);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21ty91ty9lusvngjs.R.inc(85496);out.config(SerializerFeature.QuoteFieldNames, true);
        __CLR4_5_21ty91ty9lusvngjs.R.inc(85497);out.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21ty91ty9lusvngjs.R.inc(85498);out.writeFieldValue(',', "name", (String) null);
        __CLR4_5_21ty91ty9lusvngjs.R.inc(85499);Assert.assertEquals(",'name':null", out.toString());
    }finally{__CLR4_5_21ty91ty9lusvngjs.R.flushNeeded();}}

}
