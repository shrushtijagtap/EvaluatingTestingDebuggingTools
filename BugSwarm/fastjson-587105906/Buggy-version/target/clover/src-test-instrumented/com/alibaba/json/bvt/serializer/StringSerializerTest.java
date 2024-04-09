/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringWriter;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class StringSerializerTest extends TestCase {static class __CLR4_1_101tee1teelusqkkbs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,84878,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	public void test_0() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21tee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84758,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21tee() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84758);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84759);Assert.assertEquals("{\"value\":null}", JSON.toJSONString(
				new TestEntity(null), SerializerFeature.WriteMapNullValue));

		__CLR4_1_101tee1teelusqkkbs.R.inc(84760);SerializeWriter out = new SerializeWriter();

		__CLR4_1_101tee1teelusqkkbs.R.inc(84761);JSONSerializer.write(out, (Object) "123");
		__CLR4_1_101tee1teelusqkkbs.R.inc(84762);Assert.assertEquals("\"123\"", out.toString());

		__CLR4_1_101tee1teelusqkkbs.R.inc(84763);JSONSerializer.write(out, (Object) "456");
		__CLR4_1_101tee1teelusqkkbs.R.inc(84764);Assert.assertEquals("\"123\"\"456\"", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public void test_2() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441tel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84765,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441tel() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84765);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84766);StringWriter out = new StringWriter();

		__CLR4_1_101tee1teelusqkkbs.R.inc(84767);JSONSerializer.write(out, new TestEntity(null));
		__CLR4_1_101tee1teelusqkkbs.R.inc(84768);Assert.assertEquals("{}", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public void test_2_s() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10529ops1tep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_2_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84769,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10529ops1tep() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84769);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84770);SerializeWriter out = new SerializeWriter();

		__CLR4_1_101tee1teelusqkkbs.R.inc(84771);JSONSerializer.write(out, new TestEntity(null));
		__CLR4_1_101tee1teelusqkkbs.R.inc(84772);Assert.assertEquals("{}", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public void test_3() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1tet();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84773,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1tet() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84773);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84774);SerializeWriter out = new SerializeWriter();
		__CLR4_1_101tee1teelusqkkbs.R.inc(84775);JSONSerializer serializer = new JSONSerializer(out);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84776);serializer.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_1_101tee1teelusqkkbs.R.inc(84777);serializer.write(new TestEntity("\u5f20\u4e09"));
		__CLR4_1_101tee1teelusqkkbs.R.inc(84778);Assert.assertEquals("{'value':'\u5f20\u4e09'}", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public void test_4() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61tez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84779,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61tez() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84779);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84780);StringWriter out = new StringWriter();

		__CLR4_1_101tee1teelusqkkbs.R.inc(84781);JSONSerializer.write(out, new TestEntity("\u5f20\u4e09"));
		__CLR4_1_101tee1teelusqkkbs.R.inc(84782);Assert.assertEquals("{\"value\":\"\u5f20\u4e09\"}", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public void test_5() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1tf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84783,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1tf3() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84783);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84784);SerializeWriter out = new SerializeWriter();
		__CLR4_1_101tee1teelusqkkbs.R.inc(84785);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_1_101tee1teelusqkkbs.R.inc(84786);out.writeString((String) null);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84787);Assert.assertEquals("null", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public void test_5_d() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10atast01tf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_5_d",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84788,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10atast01tf8() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84788);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84789);SerializeWriter out = new SerializeWriter();
		__CLR4_1_101tee1teelusqkkbs.R.inc(84790);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_1_101tee1teelusqkkbs.R.inc(84791);out.writeString((String) null);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84792);Assert.assertEquals("null", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public void test_6() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81tfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84793,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81tfd() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84793);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84794);SerializeWriter out = new SerializeWriter(1);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84795);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_1_101tee1teelusqkkbs.R.inc(84796);out.writeString((String) null);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84797);Assert.assertEquals("null", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public void test_6_d() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108og3xx1tfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_6_d",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84798,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108og3xx1tfi() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84798);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84799);SerializeWriter out = new SerializeWriter(1);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84800);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_1_101tee1teelusqkkbs.R.inc(84801);out.writeString((String) null);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84802);Assert.assertEquals("null", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public void test_7() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1tfn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84803,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1tfn() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84803);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84804);SerializeWriter out = new SerializeWriter(1);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84805);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_1_101tee1teelusqkkbs.R.inc(84806);out.writeString("\u4e2d\u56fd");
		__CLR4_1_101tee1teelusqkkbs.R.inc(84807);Assert.assertEquals("'\u4e2d\u56fd'", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public void test_7_d() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106jlf2u1tfs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_7_d",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84808,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106jlf2u1tfs() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84808);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84809);SerializeWriter out = new SerializeWriter(1);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84810);out.config(SerializerFeature.UseSingleQuotes, false);

		__CLR4_1_101tee1teelusqkkbs.R.inc(84811);out.writeString("\u4e2d\u56fd");
		__CLR4_1_101tee1teelusqkkbs.R.inc(84812);Assert.assertEquals("\"\u4e2d\u56fd\"", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public void test_8() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102uw8mq1tfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84813,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102uw8mq1tfx() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84813);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84814);SerializeWriter out = new SerializeWriter();
		__CLR4_1_101tee1teelusqkkbs.R.inc(84815);out = new SerializeWriter();
		__CLR4_1_101tee1teelusqkkbs.R.inc(84816);out.config(SerializerFeature.UseSingleQuotes, false);

		__CLR4_1_101tee1teelusqkkbs.R.inc(84817);out.writeString("\na\nb\nc\nd\"'");
		__CLR4_1_101tee1teelusqkkbs.R.inc(84818);Assert.assertEquals("\"\\na\\nb\\nc\\nd\\\"'\"", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public void test_8_s() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hvdtwa1tg3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_8_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84819,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hvdtwa1tg3() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84819);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84820);SerializeWriter out = new SerializeWriter();
		__CLR4_1_101tee1teelusqkkbs.R.inc(84821);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_1_101tee1teelusqkkbs.R.inc(84822);out.writeString("\na\nb\nc\nd\"'");
		__CLR4_1_101tee1teelusqkkbs.R.inc(84823);Assert.assertEquals("'\\na\\nb\\nc\\nd\"\\''", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public void test_9() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1063w7f71tg8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84824,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1063w7f71tg8() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84824);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84825);SerializeWriter out = new SerializeWriter(1);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84826);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84827);out.writeFieldName("\na\nb\nc\nd\"'e");
		__CLR4_1_101tee1teelusqkkbs.R.inc(84828);Assert.assertEquals("'\\na\\nb\\nc\\nd\"\\'e':", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public void test_9_d() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1029w1co1tgd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_9_d",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84829,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1029w1co1tgd() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84829);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84830);SerializeWriter out = new SerializeWriter(1);

		__CLR4_1_101tee1teelusqkkbs.R.inc(84831);out.writeFieldName("\na\nb\nc\nd\"'e");
		__CLR4_1_101tee1teelusqkkbs.R.inc(84832);Assert.assertEquals("\"\\na\\nb\\nc\\nd\\\"'e\":", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public void test_10() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c3oj7x1tgh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84833,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c3oj7x1tgh() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84833);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84834);SerializeWriter out = new SerializeWriter();
		__CLR4_1_101tee1teelusqkkbs.R.inc(84835);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84836);out.writeFieldName("123\na\nb\nc\nd\"'e");
		__CLR4_1_101tee1teelusqkkbs.R.inc(84837);Assert.assertEquals("'123\\na\\nb\\nc\\nd\"\\'e':", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public void test_10_d() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10od1nns1tgm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_10_d",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84838,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10od1nns1tgm() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84838);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84839);SerializeWriter out = new SerializeWriter();

		__CLR4_1_101tee1teelusqkkbs.R.inc(84840);out.writeFieldName("123\na\nb\nc\nd\"'e", true);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84841);Assert.assertEquals("\"123\\na\\nb\\nc\\nd\\\"'e\":", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public void test_11() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108uokfg1tgq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84842,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108uokfg1tgq() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84842);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84843);SerializeWriter out = new SerializeWriter();
		__CLR4_1_101tee1teelusqkkbs.R.inc(84844);out.config(SerializerFeature.QuoteFieldNames, true);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84845);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84846);out.writeFieldName("123\na\nb\nc\nd\"'e");
		__CLR4_1_101tee1teelusqkkbs.R.inc(84847);Assert.assertEquals("'123\\na\\nb\\nc\\nd\"\\'e':", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public void test_11_d() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qhwciv1tgw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_11_d",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84848,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qhwciv1tgw() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84848);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84849);SerializeWriter out = new SerializeWriter();

		__CLR4_1_101tee1teelusqkkbs.R.inc(84850);out.writeString("123\na\nb\nc\nd\"'e", ':');
		__CLR4_1_101tee1teelusqkkbs.R.inc(84851);Assert.assertEquals("\"123\\na\\nb\\nc\\nd\\\"'e\":", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public void test_12() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105lolmz1th0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84852,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105lolmz1th0() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84852);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84853);SerializeWriter out = new SerializeWriter(1);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84854);out.config(SerializerFeature.QuoteFieldNames, true);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84855);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84856);out.writeFieldName("123\na\nb\nc\nd\"'e");
		__CLR4_1_101tee1teelusqkkbs.R.inc(84857);Assert.assertEquals("'123\\na\\nb\\nc\\nd\"\\'e':", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public void test_12_d() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10smr1dy1th6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_12_d",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84858,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10smr1dy1th6() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84858);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84859);SerializeWriter out = new SerializeWriter(1);

		__CLR4_1_101tee1teelusqkkbs.R.inc(84860);out.writeString("123\na\nb\nc\nd\"'e", ':');
		__CLR4_1_101tee1teelusqkkbs.R.inc(84861);Assert.assertEquals("\"123\\na\\nb\\nc\\nd\\\"'e\":", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public void test_13() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102comui1tha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84862,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102comui1tha() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84862);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84863);SerializeWriter out = new SerializeWriter(4);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84864);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_1_101tee1teelusqkkbs.R.inc(84865);out.writeString("1'");
		__CLR4_1_101tee1teelusqkkbs.R.inc(84866);Assert.assertEquals("'1\\''", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public void test_14() throws Exception {__CLR4_1_101tee1teelusqkkbs.R.globalSliceStart(getClass().getName(),84867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wbbxz1thf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tee1teelusqkkbs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tee1teelusqkkbs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_14",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84867,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wbbxz1thf() throws Exception{try{__CLR4_1_101tee1teelusqkkbs.R.inc(84867);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84868);SerializeWriter out = new SerializeWriter(4);
		__CLR4_1_101tee1teelusqkkbs.R.inc(84869);out.config(SerializerFeature.UseSingleQuotes, false);

		__CLR4_1_101tee1teelusqkkbs.R.inc(84870);out.writeString("1\"");
		__CLR4_1_101tee1teelusqkkbs.R.inc(84871);Assert.assertEquals("\"1\\\"\"", out.toString());
	}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	public static class TestEntity {

		private String value;

		public TestEntity(String value) {try{__CLR4_1_101tee1teelusqkkbs.R.inc(84872);
			__CLR4_1_101tee1teelusqkkbs.R.inc(84873);this.value = value;
		}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

		public String getValue() {try{__CLR4_1_101tee1teelusqkkbs.R.inc(84874);
			__CLR4_1_101tee1teelusqkkbs.R.inc(84875);return value;
		}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

		public void setValue(String value) {try{__CLR4_1_101tee1teelusqkkbs.R.inc(84876);
			__CLR4_1_101tee1teelusqkkbs.R.inc(84877);this.value = value;
		}finally{__CLR4_1_101tee1teelusqkkbs.R.flushNeeded();}}

	}
}
