/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class SerializeWriterTest_7 extends TestCase {static class __CLR4_5_21tz61tz6lusvngjw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,85534,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	public void test_0() throws Exception {__CLR4_5_21tz61tz6lusvngjw.R.globalSliceStart(getClass().getName(),85506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21tz6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tz61tz6lusvngjw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tz61tz6lusvngjw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_7.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85506,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21tz6() throws Exception{try{__CLR4_5_21tz61tz6lusvngjw.R.inc(85506);
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85507);SerializeWriter out = new SerializeWriter(1);
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85508);out.config(SerializerFeature.QuoteFieldNames, true);
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85509);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85510);out.writeFieldValue(',', "name", (Enum) null);
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85511);Assert.assertEquals(",'name':null", out.toString());
	}finally{__CLR4_5_21tz61tz6lusvngjw.R.flushNeeded();}}

	public void test_1() throws Exception {__CLR4_5_21tz61tz6lusvngjw.R.globalSliceStart(getClass().getName(),85512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1tzc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tz61tz6lusvngjw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tz61tz6lusvngjw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_7.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85512,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1tzc() throws Exception{try{__CLR4_5_21tz61tz6lusvngjw.R.inc(85512);
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85513);SerializeWriter out = new SerializeWriter(1);
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85514);out.config(SerializerFeature.QuoteFieldNames, true);
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85515);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85516);out.writeFieldName("\u540d\u79f0");
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85517);Assert.assertEquals("'\u540d\u79f0':", out.toString());
	}finally{__CLR4_5_21tz61tz6lusvngjw.R.flushNeeded();}}

	public void test_2() throws Exception {__CLR4_5_21tz61tz6lusvngjw.R.globalSliceStart(getClass().getName(),85518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441tzi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tz61tz6lusvngjw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tz61tz6lusvngjw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_7.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85518,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441tzi() throws Exception{try{__CLR4_5_21tz61tz6lusvngjw.R.inc(85518);
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85519);SerializeWriter out = new SerializeWriter(1);
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85520);out.config(SerializerFeature.QuoteFieldNames, false);
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85521);out.writeFieldName("\u540d\u79f0");
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85522);Assert.assertEquals("\u540d\u79f0:", out.toString());
	}finally{__CLR4_5_21tz61tz6lusvngjw.R.flushNeeded();}}

	public void test_3() throws Exception {__CLR4_5_21tz61tz6lusvngjw.R.globalSliceStart(getClass().getName(),85523);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1tzn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tz61tz6lusvngjw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tz61tz6lusvngjw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_7.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85523,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1tzn() throws Exception{try{__CLR4_5_21tz61tz6lusvngjw.R.inc(85523);
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85524);SerializeWriter out = new SerializeWriter(1);
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85525);out.config(SerializerFeature.QuoteFieldNames, false);
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85526);out.writeFieldName("a\n\n\n\n");
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85527);Assert.assertEquals("\"a\\n\\n\\n\\n\":", out.toString());
	}finally{__CLR4_5_21tz61tz6lusvngjw.R.flushNeeded();}}
	
	public void test_4() throws Exception {__CLR4_5_21tz61tz6lusvngjw.R.globalSliceStart(getClass().getName(),85528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61tzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tz61tz6lusvngjw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tz61tz6lusvngjw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_7.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85528,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61tzs() throws Exception{try{__CLR4_5_21tz61tz6lusvngjw.R.inc(85528);
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85529);SerializeWriter out = new SerializeWriter(1);
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85530);out.config(SerializerFeature.QuoteFieldNames, false);
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85531);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85532);out.writeFieldName("a\n\n\n\n");
		__CLR4_5_21tz61tz6lusvngjw.R.inc(85533);Assert.assertEquals("'a\\n\\n\\n\\n':", out.toString());
	}finally{__CLR4_5_21tz61tz6lusvngjw.R.flushNeeded();}}
}
