/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.math.BigDecimal;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class SerializeWriterTest_5 extends TestCase {static class __CLR4_1_101t0c1t0clusqkk5i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,84279,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101t0c1t0clusqkk5i.R.globalSliceStart(getClass().getName(),84252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21t0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t0c1t0clusqkk5i.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t0c1t0clusqkk5i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_5.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84252,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21t0c() throws Exception{try{__CLR4_1_101t0c1t0clusqkk5i.R.inc(84252);
        __CLR4_1_101t0c1t0clusqkk5i.R.inc(84253);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101t0c1t0clusqkk5i.R.inc(84254);out.config(SerializerFeature.QuoteFieldNames, true);
        __CLR4_1_101t0c1t0clusqkk5i.R.inc(84255);out.writeFieldValue(',', "name", (Enum) null);
        __CLR4_1_101t0c1t0clusqkk5i.R.inc(84256);Assert.assertEquals(",\"name\":null", out.toString());
    }finally{__CLR4_1_101t0c1t0clusqkk5i.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_1_101t0c1t0clusqkk5i.R.globalSliceStart(getClass().getName(),84257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1t0h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t0c1t0clusqkk5i.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t0c1t0clusqkk5i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_5.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84257,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1t0h() throws Exception{try{__CLR4_1_101t0c1t0clusqkk5i.R.inc(84257);
        __CLR4_1_101t0c1t0clusqkk5i.R.inc(84258);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101t0c1t0clusqkk5i.R.inc(84259);out.config(SerializerFeature.QuoteFieldNames, true);
        __CLR4_1_101t0c1t0clusqkk5i.R.inc(84260);out.writeFieldValue(',', "name", (BigDecimal) null);
        __CLR4_1_101t0c1t0clusqkk5i.R.inc(84261);Assert.assertEquals(",\"name\":null", out.toString());
    }finally{__CLR4_1_101t0c1t0clusqkk5i.R.flushNeeded();}}
    
    public void test_2() throws Exception {__CLR4_1_101t0c1t0clusqkk5i.R.globalSliceStart(getClass().getName(),84262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441t0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t0c1t0clusqkk5i.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t0c1t0clusqkk5i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_5.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84262,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441t0m() throws Exception{try{__CLR4_1_101t0c1t0clusqkk5i.R.inc(84262);
        __CLR4_1_101t0c1t0clusqkk5i.R.inc(84263);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101t0c1t0clusqkk5i.R.inc(84264);out.config(SerializerFeature.QuoteFieldNames, true);
        __CLR4_1_101t0c1t0clusqkk5i.R.inc(84265);out.writeFieldValue(',', "name", (String) null);
        __CLR4_1_101t0c1t0clusqkk5i.R.inc(84266);Assert.assertEquals(",\"name\":null", out.toString());
    }finally{__CLR4_1_101t0c1t0clusqkk5i.R.flushNeeded();}}
    
    public void test_3() throws Exception {__CLR4_1_101t0c1t0clusqkk5i.R.globalSliceStart(getClass().getName(),84267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1t0r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t0c1t0clusqkk5i.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t0c1t0clusqkk5i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_5.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84267,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1t0r() throws Exception{try{__CLR4_1_101t0c1t0clusqkk5i.R.inc(84267);
        __CLR4_1_101t0c1t0clusqkk5i.R.inc(84268);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101t0c1t0clusqkk5i.R.inc(84269);out.config(SerializerFeature.QuoteFieldNames, true);
        __CLR4_1_101t0c1t0clusqkk5i.R.inc(84270);out.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101t0c1t0clusqkk5i.R.inc(84271);out.writeFieldValue(',', "name", (String) null);
        __CLR4_1_101t0c1t0clusqkk5i.R.inc(84272);Assert.assertEquals(",'name':null", out.toString());
    }finally{__CLR4_1_101t0c1t0clusqkk5i.R.flushNeeded();}}
    
    public void test_4() throws Exception {__CLR4_1_101t0c1t0clusqkk5i.R.globalSliceStart(getClass().getName(),84273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61t0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t0c1t0clusqkk5i.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t0c1t0clusqkk5i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_5.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84273,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61t0x() throws Exception{try{__CLR4_1_101t0c1t0clusqkk5i.R.inc(84273);
        __CLR4_1_101t0c1t0clusqkk5i.R.inc(84274);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101t0c1t0clusqkk5i.R.inc(84275);out.config(SerializerFeature.QuoteFieldNames, true);
        __CLR4_1_101t0c1t0clusqkk5i.R.inc(84276);out.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101t0c1t0clusqkk5i.R.inc(84277);out.writeFieldValue(',', "name", (String) null);
        __CLR4_1_101t0c1t0clusqkk5i.R.inc(84278);Assert.assertEquals(",'name':null", out.toString());
    }finally{__CLR4_1_101t0c1t0clusqkk5i.R.flushNeeded();}}

}
