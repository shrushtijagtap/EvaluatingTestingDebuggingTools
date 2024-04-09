/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

@SuppressWarnings("deprecation")
public class SerializeWriterTest_4 extends TestCase {static class __CLR4_1_101szd1szdlusqkk5b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,84252,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101szd1szdlusqkk5b.R.globalSliceStart(getClass().getName(),84217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21szd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101szd1szdlusqkk5b.R.rethrow($CLV_t2$);}finally{__CLR4_1_101szd1szdlusqkk5b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_4.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84217,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21szd() throws Exception{try{__CLR4_1_101szd1szdlusqkk5b.R.inc(84217);
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84218);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84219);out.config(SerializerFeature.QuoteFieldNames, true);
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84220);out.config(SerializerFeature.WriteTabAsSpecial, true);
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84221);out.writeFieldValue(',', "name", "\t");
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84222);Assert.assertEquals(",\"name\":\"\\t\"", out.toString());
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84223);out.close();
    }finally{__CLR4_1_101szd1szdlusqkk5b.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_1_101szd1szdlusqkk5b.R.globalSliceStart(getClass().getName(),84224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1szk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101szd1szdlusqkk5b.R.rethrow($CLV_t2$);}finally{__CLR4_1_101szd1szdlusqkk5b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_4.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84224,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1szk() throws Exception{try{__CLR4_1_101szd1szdlusqkk5b.R.inc(84224);
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84225);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84226);out.config(SerializerFeature.QuoteFieldNames, true);
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84227);out.config(SerializerFeature.WriteTabAsSpecial, true);
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84228);out.writeFieldValue(',', "name", "\t\n");
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84229);Assert.assertEquals(",\"name\":\"\\t\\n\"", out.toString());
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84230);out.close();
    }finally{__CLR4_1_101szd1szdlusqkk5b.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101szd1szdlusqkk5b.R.globalSliceStart(getClass().getName(),84231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1szr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101szd1szdlusqkk5b.R.rethrow($CLV_t2$);}finally{__CLR4_1_101szd1szdlusqkk5b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_4.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84231,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1szr() throws Exception{try{__CLR4_1_101szd1szdlusqkk5b.R.inc(84231);
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84232);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84233);out.config(SerializerFeature.QuoteFieldNames, true);
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84234);out.config(SerializerFeature.WriteTabAsSpecial, true);
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84235);out.writeFieldValue(',', "name", "\t\n \b\n\r\f\\ \"");
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84236);Assert.assertEquals(",\"name\":\"\\t\\n \\b\\n\\r\\f\\\\ \\\"\"", out.toString());
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84237);out.close();
    }finally{__CLR4_1_101szd1szdlusqkk5b.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101szd1szdlusqkk5b.R.globalSliceStart(getClass().getName(),84238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61szy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101szd1szdlusqkk5b.R.rethrow($CLV_t2$);}finally{__CLR4_1_101szd1szdlusqkk5b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_4.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84238,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61szy() throws Exception{try{__CLR4_1_101szd1szdlusqkk5b.R.inc(84238);
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84239);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84240);out.config(SerializerFeature.QuoteFieldNames, true);
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84241);out.config(SerializerFeature.WriteTabAsSpecial, false);
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84242);out.writeFieldValue(',', "name", "\t\n \b\n\r\f\\ \"");
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84243);Assert.assertEquals(",\"name\":\"\\t\\n \\b\\n\\r\\f\\\\ \\\"\"", out.toString());
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84244);out.close();
    }finally{__CLR4_1_101szd1szdlusqkk5b.R.flushNeeded();}}
    
    public void test_5() throws Exception {__CLR4_1_101szd1szdlusqkk5b.R.globalSliceStart(getClass().getName(),84245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1t05();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101szd1szdlusqkk5b.R.rethrow($CLV_t2$);}finally{__CLR4_1_101szd1szdlusqkk5b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_4.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84245,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1t05() throws Exception{try{__CLR4_1_101szd1szdlusqkk5b.R.inc(84245);
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84246);SerializeWriter out = new SerializeWriter(1000);
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84247);out.config(SerializerFeature.QuoteFieldNames, true);
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84248);out.config(SerializerFeature.WriteTabAsSpecial, true);
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84249);out.writeString("\t\n \b\n\r\f\\ \"");
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84250);Assert.assertEquals("\"\\t\\n \\b\\n\\r\\f\\\\ \\\"\"", out.toString());
        __CLR4_1_101szd1szdlusqkk5b.R.inc(84251);out.close();
    }finally{__CLR4_1_101szd1szdlusqkk5b.R.flushNeeded();}}
}
