/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class SerializeWriterTest_7 extends TestCase {static class __CLR4_1_101tzh1tzhluszwf74{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,85545,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	public void test_0() throws Exception {__CLR4_1_101tzh1tzhluszwf74.R.globalSliceStart(getClass().getName(),85517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21tzh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tzh1tzhluszwf74.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tzh1tzhluszwf74.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_7.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85517,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21tzh() throws Exception{try{__CLR4_1_101tzh1tzhluszwf74.R.inc(85517);
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85518);SerializeWriter out = new SerializeWriter(1);
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85519);out.config(SerializerFeature.QuoteFieldNames, true);
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85520);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85521);out.writeFieldValue(',', "name", (Enum) null);
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85522);Assert.assertEquals(",'name':null", out.toString());
	}finally{__CLR4_1_101tzh1tzhluszwf74.R.flushNeeded();}}

	public void test_1() throws Exception {__CLR4_1_101tzh1tzhluszwf74.R.globalSliceStart(getClass().getName(),85523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1tzn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tzh1tzhluszwf74.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tzh1tzhluszwf74.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_7.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85523,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1tzn() throws Exception{try{__CLR4_1_101tzh1tzhluszwf74.R.inc(85523);
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85524);SerializeWriter out = new SerializeWriter(1);
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85525);out.config(SerializerFeature.QuoteFieldNames, true);
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85526);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85527);out.writeFieldName("\u540d\u79f0");
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85528);Assert.assertEquals("'\u540d\u79f0':", out.toString());
	}finally{__CLR4_1_101tzh1tzhluszwf74.R.flushNeeded();}}

	public void test_2() throws Exception {__CLR4_1_101tzh1tzhluszwf74.R.globalSliceStart(getClass().getName(),85529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441tzt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tzh1tzhluszwf74.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tzh1tzhluszwf74.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_7.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85529,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441tzt() throws Exception{try{__CLR4_1_101tzh1tzhluszwf74.R.inc(85529);
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85530);SerializeWriter out = new SerializeWriter(1);
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85531);out.config(SerializerFeature.QuoteFieldNames, false);
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85532);out.writeFieldName("\u540d\u79f0");
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85533);Assert.assertEquals("\u540d\u79f0:", out.toString());
	}finally{__CLR4_1_101tzh1tzhluszwf74.R.flushNeeded();}}

	public void test_3() throws Exception {__CLR4_1_101tzh1tzhluszwf74.R.globalSliceStart(getClass().getName(),85534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1tzy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tzh1tzhluszwf74.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tzh1tzhluszwf74.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_7.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85534,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1tzy() throws Exception{try{__CLR4_1_101tzh1tzhluszwf74.R.inc(85534);
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85535);SerializeWriter out = new SerializeWriter(1);
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85536);out.config(SerializerFeature.QuoteFieldNames, false);
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85537);out.writeFieldName("a\n\n\n\n");
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85538);Assert.assertEquals("\"a\\n\\n\\n\\n\":", out.toString());
	}finally{__CLR4_1_101tzh1tzhluszwf74.R.flushNeeded();}}
	
	public void test_4() throws Exception {__CLR4_1_101tzh1tzhluszwf74.R.globalSliceStart(getClass().getName(),85539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61u03();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tzh1tzhluszwf74.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tzh1tzhluszwf74.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_7.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85539,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61u03() throws Exception{try{__CLR4_1_101tzh1tzhluszwf74.R.inc(85539);
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85540);SerializeWriter out = new SerializeWriter(1);
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85541);out.config(SerializerFeature.QuoteFieldNames, false);
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85542);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85543);out.writeFieldName("a\n\n\n\n");
		__CLR4_1_101tzh1tzhluszwf74.R.inc(85544);Assert.assertEquals("'a\\n\\n\\n\\n':", out.toString());
	}finally{__CLR4_1_101tzh1tzhluszwf74.R.flushNeeded();}}
}
