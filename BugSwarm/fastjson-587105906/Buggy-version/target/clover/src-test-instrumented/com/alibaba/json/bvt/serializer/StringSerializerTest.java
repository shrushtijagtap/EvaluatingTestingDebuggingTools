/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringWriter;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class StringSerializerTest extends TestCase {static class __CLR4_1_101ucm1ucmluszwf9c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,86110,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	public void test_0() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),85990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21ucm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85990,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21ucm() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(85990);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(85991);Assert.assertEquals("{\"value\":null}", JSON.toJSONString(
				new TestEntity(null), SerializerFeature.WriteMapNullValue));

		__CLR4_1_101ucm1ucmluszwf9c.R.inc(85992);SerializeWriter out = new SerializeWriter();

		__CLR4_1_101ucm1ucmluszwf9c.R.inc(85993);JSONSerializer.write(out, (Object) "123");
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(85994);Assert.assertEquals("\"123\"", out.toString());

		__CLR4_1_101ucm1ucmluszwf9c.R.inc(85995);JSONSerializer.write(out, (Object) "456");
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(85996);Assert.assertEquals("\"123\"\"456\"", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public void test_2() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),85997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441uct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85997,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441uct() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(85997);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(85998);StringWriter out = new StringWriter();

		__CLR4_1_101ucm1ucmluszwf9c.R.inc(85999);JSONSerializer.write(out, new TestEntity(null));
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86000);Assert.assertEquals("{}", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public void test_2_s() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),86001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10529ops1ucx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_2_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86001,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10529ops1ucx() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86001);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86002);SerializeWriter out = new SerializeWriter();

		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86003);JSONSerializer.write(out, new TestEntity(null));
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86004);Assert.assertEquals("{}", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public void test_3() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),86005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1ud1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86005,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1ud1() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86005);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86006);SerializeWriter out = new SerializeWriter();
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86007);JSONSerializer serializer = new JSONSerializer(out);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86008);serializer.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86009);serializer.write(new TestEntity("\u5f20\u4e09"));
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86010);Assert.assertEquals("{'value':'\u5f20\u4e09'}", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public void test_4() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),86011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61ud7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86011,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61ud7() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86011);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86012);StringWriter out = new StringWriter();

		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86013);JSONSerializer.write(out, new TestEntity("\u5f20\u4e09"));
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86014);Assert.assertEquals("{\"value\":\"\u5f20\u4e09\"}", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public void test_5() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),86015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1udb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86015,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1udb() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86015);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86016);SerializeWriter out = new SerializeWriter();
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86017);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86018);out.writeString((String) null);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86019);Assert.assertEquals("null", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public void test_5_d() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),86020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10atast01udg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_5_d",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86020,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10atast01udg() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86020);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86021);SerializeWriter out = new SerializeWriter();
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86022);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86023);out.writeString((String) null);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86024);Assert.assertEquals("null", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public void test_6() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),86025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81udl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86025,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81udl() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86025);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86026);SerializeWriter out = new SerializeWriter(1);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86027);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86028);out.writeString((String) null);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86029);Assert.assertEquals("null", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public void test_6_d() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),86030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108og3xx1udq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_6_d",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86030,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108og3xx1udq() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86030);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86031);SerializeWriter out = new SerializeWriter(1);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86032);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86033);out.writeString((String) null);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86034);Assert.assertEquals("null", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public void test_7() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),86035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1udv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86035,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1udv() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86035);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86036);SerializeWriter out = new SerializeWriter(1);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86037);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86038);out.writeString("\u4e2d\u56fd");
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86039);Assert.assertEquals("'\u4e2d\u56fd'", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public void test_7_d() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),86040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106jlf2u1ue0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_7_d",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86040,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106jlf2u1ue0() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86040);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86041);SerializeWriter out = new SerializeWriter(1);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86042);out.config(SerializerFeature.UseSingleQuotes, false);

		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86043);out.writeString("\u4e2d\u56fd");
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86044);Assert.assertEquals("\"\u4e2d\u56fd\"", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public void test_8() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),86045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102uw8mq1ue5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86045,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102uw8mq1ue5() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86045);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86046);SerializeWriter out = new SerializeWriter();
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86047);out = new SerializeWriter();
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86048);out.config(SerializerFeature.UseSingleQuotes, false);

		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86049);out.writeString("\na\nb\nc\nd\"'");
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86050);Assert.assertEquals("\"\\na\\nb\\nc\\nd\\\"'\"", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public void test_8_s() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),86051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hvdtwa1ueb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_8_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86051,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hvdtwa1ueb() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86051);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86052);SerializeWriter out = new SerializeWriter();
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86053);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86054);out.writeString("\na\nb\nc\nd\"'");
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86055);Assert.assertEquals("'\\na\\nb\\nc\\nd\"\\''", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public void test_9() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),86056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1063w7f71ueg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86056,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1063w7f71ueg() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86056);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86057);SerializeWriter out = new SerializeWriter(1);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86058);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86059);out.writeFieldName("\na\nb\nc\nd\"'e");
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86060);Assert.assertEquals("'\\na\\nb\\nc\\nd\"\\'e':", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public void test_9_d() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),86061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1029w1co1uel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_9_d",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86061,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1029w1co1uel() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86061);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86062);SerializeWriter out = new SerializeWriter(1);

		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86063);out.writeFieldName("\na\nb\nc\nd\"'e");
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86064);Assert.assertEquals("\"\\na\\nb\\nc\\nd\\\"'e\":", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public void test_10() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),86065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c3oj7x1uep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86065,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c3oj7x1uep() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86065);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86066);SerializeWriter out = new SerializeWriter();
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86067);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86068);out.writeFieldName("123\na\nb\nc\nd\"'e");
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86069);Assert.assertEquals("'123\\na\\nb\\nc\\nd\"\\'e':", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public void test_10_d() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),86070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10od1nns1ueu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_10_d",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86070,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10od1nns1ueu() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86070);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86071);SerializeWriter out = new SerializeWriter();

		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86072);out.writeFieldName("123\na\nb\nc\nd\"'e", true);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86073);Assert.assertEquals("\"123\\na\\nb\\nc\\nd\\\"'e\":", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public void test_11() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),86074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108uokfg1uey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86074,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108uokfg1uey() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86074);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86075);SerializeWriter out = new SerializeWriter();
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86076);out.config(SerializerFeature.QuoteFieldNames, true);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86077);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86078);out.writeFieldName("123\na\nb\nc\nd\"'e");
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86079);Assert.assertEquals("'123\\na\\nb\\nc\\nd\"\\'e':", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public void test_11_d() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),86080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qhwciv1uf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_11_d",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86080,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qhwciv1uf4() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86080);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86081);SerializeWriter out = new SerializeWriter();

		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86082);out.writeString("123\na\nb\nc\nd\"'e", ':');
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86083);Assert.assertEquals("\"123\\na\\nb\\nc\\nd\\\"'e\":", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public void test_12() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),86084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105lolmz1uf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86084,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105lolmz1uf8() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86084);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86085);SerializeWriter out = new SerializeWriter(1);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86086);out.config(SerializerFeature.QuoteFieldNames, true);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86087);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86088);out.writeFieldName("123\na\nb\nc\nd\"'e");
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86089);Assert.assertEquals("'123\\na\\nb\\nc\\nd\"\\'e':", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public void test_12_d() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),86090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10smr1dy1ufe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_12_d",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86090,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10smr1dy1ufe() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86090);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86091);SerializeWriter out = new SerializeWriter(1);

		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86092);out.writeString("123\na\nb\nc\nd\"'e", ':');
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86093);Assert.assertEquals("\"123\\na\\nb\\nc\\nd\\\"'e\":", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public void test_13() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),86094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102comui1ufi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86094,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102comui1ufi() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86094);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86095);SerializeWriter out = new SerializeWriter(4);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86096);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86097);out.writeString("1'");
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86098);Assert.assertEquals("'1\\''", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public void test_14() throws Exception {__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceStart(getClass().getName(),86099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wbbxz1ufn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ucm1ucmluszwf9c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ucm1ucmluszwf9c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_14",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86099,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wbbxz1ufn() throws Exception{try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86099);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86100);SerializeWriter out = new SerializeWriter(4);
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86101);out.config(SerializerFeature.UseSingleQuotes, false);

		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86102);out.writeString("1\"");
		__CLR4_1_101ucm1ucmluszwf9c.R.inc(86103);Assert.assertEquals("\"1\\\"\"", out.toString());
	}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	public static class TestEntity {

		private String value;

		public TestEntity(String value) {try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86104);
			__CLR4_1_101ucm1ucmluszwf9c.R.inc(86105);this.value = value;
		}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

		public String getValue() {try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86106);
			__CLR4_1_101ucm1ucmluszwf9c.R.inc(86107);return value;
		}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

		public void setValue(String value) {try{__CLR4_1_101ucm1ucmluszwf9c.R.inc(86108);
			__CLR4_1_101ucm1ucmluszwf9c.R.inc(86109);this.value = value;
		}finally{__CLR4_1_101ucm1ucmluszwf9c.R.flushNeeded();}}

	}
}
