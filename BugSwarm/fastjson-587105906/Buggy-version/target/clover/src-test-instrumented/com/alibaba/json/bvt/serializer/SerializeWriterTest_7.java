/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class SerializeWriterTest_7 extends TestCase {static class __CLR4_1_101t191t19lusqkk60{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,84313,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	public void test_0() throws Exception {__CLR4_1_101t191t19lusqkk60.R.globalSliceStart(getClass().getName(),84285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21t19();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t191t19lusqkk60.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t191t19lusqkk60.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_7.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84285,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21t19() throws Exception{try{__CLR4_1_101t191t19lusqkk60.R.inc(84285);
		__CLR4_1_101t191t19lusqkk60.R.inc(84286);SerializeWriter out = new SerializeWriter(1);
		__CLR4_1_101t191t19lusqkk60.R.inc(84287);out.config(SerializerFeature.QuoteFieldNames, true);
		__CLR4_1_101t191t19lusqkk60.R.inc(84288);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_1_101t191t19lusqkk60.R.inc(84289);out.writeFieldValue(',', "name", (Enum) null);
		__CLR4_1_101t191t19lusqkk60.R.inc(84290);Assert.assertEquals(",'name':null", out.toString());
	}finally{__CLR4_1_101t191t19lusqkk60.R.flushNeeded();}}

	public void test_1() throws Exception {__CLR4_1_101t191t19lusqkk60.R.globalSliceStart(getClass().getName(),84291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1t1f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t191t19lusqkk60.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t191t19lusqkk60.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_7.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84291,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1t1f() throws Exception{try{__CLR4_1_101t191t19lusqkk60.R.inc(84291);
		__CLR4_1_101t191t19lusqkk60.R.inc(84292);SerializeWriter out = new SerializeWriter(1);
		__CLR4_1_101t191t19lusqkk60.R.inc(84293);out.config(SerializerFeature.QuoteFieldNames, true);
		__CLR4_1_101t191t19lusqkk60.R.inc(84294);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_1_101t191t19lusqkk60.R.inc(84295);out.writeFieldName("\u540d\u79f0");
		__CLR4_1_101t191t19lusqkk60.R.inc(84296);Assert.assertEquals("'\u540d\u79f0':", out.toString());
	}finally{__CLR4_1_101t191t19lusqkk60.R.flushNeeded();}}

	public void test_2() throws Exception {__CLR4_1_101t191t19lusqkk60.R.globalSliceStart(getClass().getName(),84297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441t1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t191t19lusqkk60.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t191t19lusqkk60.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_7.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84297,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441t1l() throws Exception{try{__CLR4_1_101t191t19lusqkk60.R.inc(84297);
		__CLR4_1_101t191t19lusqkk60.R.inc(84298);SerializeWriter out = new SerializeWriter(1);
		__CLR4_1_101t191t19lusqkk60.R.inc(84299);out.config(SerializerFeature.QuoteFieldNames, false);
		__CLR4_1_101t191t19lusqkk60.R.inc(84300);out.writeFieldName("\u540d\u79f0");
		__CLR4_1_101t191t19lusqkk60.R.inc(84301);Assert.assertEquals("\u540d\u79f0:", out.toString());
	}finally{__CLR4_1_101t191t19lusqkk60.R.flushNeeded();}}

	public void test_3() throws Exception {__CLR4_1_101t191t19lusqkk60.R.globalSliceStart(getClass().getName(),84302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1t1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t191t19lusqkk60.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t191t19lusqkk60.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_7.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84302,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1t1q() throws Exception{try{__CLR4_1_101t191t19lusqkk60.R.inc(84302);
		__CLR4_1_101t191t19lusqkk60.R.inc(84303);SerializeWriter out = new SerializeWriter(1);
		__CLR4_1_101t191t19lusqkk60.R.inc(84304);out.config(SerializerFeature.QuoteFieldNames, false);
		__CLR4_1_101t191t19lusqkk60.R.inc(84305);out.writeFieldName("a\n\n\n\n");
		__CLR4_1_101t191t19lusqkk60.R.inc(84306);Assert.assertEquals("\"a\\n\\n\\n\\n\":", out.toString());
	}finally{__CLR4_1_101t191t19lusqkk60.R.flushNeeded();}}
	
	public void test_4() throws Exception {__CLR4_1_101t191t19lusqkk60.R.globalSliceStart(getClass().getName(),84307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61t1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t191t19lusqkk60.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t191t19lusqkk60.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_7.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84307,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61t1v() throws Exception{try{__CLR4_1_101t191t19lusqkk60.R.inc(84307);
		__CLR4_1_101t191t19lusqkk60.R.inc(84308);SerializeWriter out = new SerializeWriter(1);
		__CLR4_1_101t191t19lusqkk60.R.inc(84309);out.config(SerializerFeature.QuoteFieldNames, false);
		__CLR4_1_101t191t19lusqkk60.R.inc(84310);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_1_101t191t19lusqkk60.R.inc(84311);out.writeFieldName("a\n\n\n\n");
		__CLR4_1_101t191t19lusqkk60.R.inc(84312);Assert.assertEquals("'a\\n\\n\\n\\n':", out.toString());
	}finally{__CLR4_1_101t191t19lusqkk60.R.flushNeeded();}}
}
