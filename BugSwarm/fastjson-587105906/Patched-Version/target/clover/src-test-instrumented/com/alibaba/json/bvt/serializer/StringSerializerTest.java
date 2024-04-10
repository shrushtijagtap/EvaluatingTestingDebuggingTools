/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringWriter;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class StringSerializerTest extends TestCase {static class __CLR4_5_21te31te3lusyjv3n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,84867,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	public void test_0() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21te3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84747,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21te3() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84747);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84748);Assert.assertEquals("{\"value\":null}", JSON.toJSONString(
				new TestEntity(null), SerializerFeature.WriteMapNullValue));

		__CLR4_5_21te31te3lusyjv3n.R.inc(84749);SerializeWriter out = new SerializeWriter();

		__CLR4_5_21te31te3lusyjv3n.R.inc(84750);JSONSerializer.write(out, (Object) "123");
		__CLR4_5_21te31te3lusyjv3n.R.inc(84751);Assert.assertEquals("\"123\"", out.toString());

		__CLR4_5_21te31te3lusyjv3n.R.inc(84752);JSONSerializer.write(out, (Object) "456");
		__CLR4_5_21te31te3lusyjv3n.R.inc(84753);Assert.assertEquals("\"123\"\"456\"", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public void test_2() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441tea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84754,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441tea() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84754);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84755);StringWriter out = new StringWriter();

		__CLR4_5_21te31te3lusyjv3n.R.inc(84756);JSONSerializer.write(out, new TestEntity(null));
		__CLR4_5_21te31te3lusyjv3n.R.inc(84757);Assert.assertEquals("{}", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public void test_2_s() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2529ops1tee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84758,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2529ops1tee() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84758);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84759);SerializeWriter out = new SerializeWriter();

		__CLR4_5_21te31te3lusyjv3n.R.inc(84760);JSONSerializer.write(out, new TestEntity(null));
		__CLR4_5_21te31te3lusyjv3n.R.inc(84761);Assert.assertEquals("{}", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public void test_3() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1tei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84762,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1tei() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84762);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84763);SerializeWriter out = new SerializeWriter();
		__CLR4_5_21te31te3lusyjv3n.R.inc(84764);JSONSerializer serializer = new JSONSerializer(out);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84765);serializer.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_5_21te31te3lusyjv3n.R.inc(84766);serializer.write(new TestEntity("\u5f20\u4e09"));
		__CLR4_5_21te31te3lusyjv3n.R.inc(84767);Assert.assertEquals("{'value':'\u5f20\u4e09'}", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public void test_4() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61teo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84768,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61teo() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84768);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84769);StringWriter out = new StringWriter();

		__CLR4_5_21te31te3lusyjv3n.R.inc(84770);JSONSerializer.write(out, new TestEntity("\u5f20\u4e09"));
		__CLR4_5_21te31te3lusyjv3n.R.inc(84771);Assert.assertEquals("{\"value\":\"\u5f20\u4e09\"}", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public void test_5() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1tes();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84772,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1tes() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84772);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84773);SerializeWriter out = new SerializeWriter();
		__CLR4_5_21te31te3lusyjv3n.R.inc(84774);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_5_21te31te3lusyjv3n.R.inc(84775);out.writeString((String) null);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84776);Assert.assertEquals("null", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public void test_5_d() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2atast01tex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_5_d",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84777,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2atast01tex() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84777);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84778);SerializeWriter out = new SerializeWriter();
		__CLR4_5_21te31te3lusyjv3n.R.inc(84779);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_5_21te31te3lusyjv3n.R.inc(84780);out.writeString((String) null);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84781);Assert.assertEquals("null", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public void test_6() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81tf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84782,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81tf2() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84782);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84783);SerializeWriter out = new SerializeWriter(1);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84784);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_5_21te31te3lusyjv3n.R.inc(84785);out.writeString((String) null);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84786);Assert.assertEquals("null", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public void test_6_d() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28og3xx1tf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_6_d",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84787,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28og3xx1tf7() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84787);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84788);SerializeWriter out = new SerializeWriter(1);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84789);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_5_21te31te3lusyjv3n.R.inc(84790);out.writeString((String) null);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84791);Assert.assertEquals("null", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public void test_7() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1tfc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84792,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1tfc() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84792);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84793);SerializeWriter out = new SerializeWriter(1);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84794);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_5_21te31te3lusyjv3n.R.inc(84795);out.writeString("\u4e2d\u56fd");
		__CLR4_5_21te31te3lusyjv3n.R.inc(84796);Assert.assertEquals("'\u4e2d\u56fd'", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public void test_7_d() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26jlf2u1tfh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_7_d",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84797,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26jlf2u1tfh() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84797);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84798);SerializeWriter out = new SerializeWriter(1);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84799);out.config(SerializerFeature.UseSingleQuotes, false);

		__CLR4_5_21te31te3lusyjv3n.R.inc(84800);out.writeString("\u4e2d\u56fd");
		__CLR4_5_21te31te3lusyjv3n.R.inc(84801);Assert.assertEquals("\"\u4e2d\u56fd\"", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public void test_8() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq1tfm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84802,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq1tfm() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84802);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84803);SerializeWriter out = new SerializeWriter();
		__CLR4_5_21te31te3lusyjv3n.R.inc(84804);out = new SerializeWriter();
		__CLR4_5_21te31te3lusyjv3n.R.inc(84805);out.config(SerializerFeature.UseSingleQuotes, false);

		__CLR4_5_21te31te3lusyjv3n.R.inc(84806);out.writeString("\na\nb\nc\nd\"'");
		__CLR4_5_21te31te3lusyjv3n.R.inc(84807);Assert.assertEquals("\"\\na\\nb\\nc\\nd\\\"'\"", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public void test_8_s() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hvdtwa1tfs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_8_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84808,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hvdtwa1tfs() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84808);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84809);SerializeWriter out = new SerializeWriter();
		__CLR4_5_21te31te3lusyjv3n.R.inc(84810);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_5_21te31te3lusyjv3n.R.inc(84811);out.writeString("\na\nb\nc\nd\"'");
		__CLR4_5_21te31te3lusyjv3n.R.inc(84812);Assert.assertEquals("'\\na\\nb\\nc\\nd\"\\''", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public void test_9() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f71tfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84813,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f71tfx() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84813);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84814);SerializeWriter out = new SerializeWriter(1);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84815);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84816);out.writeFieldName("\na\nb\nc\nd\"'e");
		__CLR4_5_21te31te3lusyjv3n.R.inc(84817);Assert.assertEquals("'\\na\\nb\\nc\\nd\"\\'e':", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public void test_9_d() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_229w1co1tg2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_9_d",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84818,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_229w1co1tg2() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84818);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84819);SerializeWriter out = new SerializeWriter(1);

		__CLR4_5_21te31te3lusyjv3n.R.inc(84820);out.writeFieldName("\na\nb\nc\nd\"'e");
		__CLR4_5_21te31te3lusyjv3n.R.inc(84821);Assert.assertEquals("\"\\na\\nb\\nc\\nd\\\"'e\":", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public void test_10() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3oj7x1tg6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84822,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3oj7x1tg6() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84822);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84823);SerializeWriter out = new SerializeWriter();
		__CLR4_5_21te31te3lusyjv3n.R.inc(84824);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84825);out.writeFieldName("123\na\nb\nc\nd\"'e");
		__CLR4_5_21te31te3lusyjv3n.R.inc(84826);Assert.assertEquals("'123\\na\\nb\\nc\\nd\"\\'e':", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public void test_10_d() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2od1nns1tgb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_10_d",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84827,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2od1nns1tgb() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84827);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84828);SerializeWriter out = new SerializeWriter();

		__CLR4_5_21te31te3lusyjv3n.R.inc(84829);out.writeFieldName("123\na\nb\nc\nd\"'e", true);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84830);Assert.assertEquals("\"123\\na\\nb\\nc\\nd\\\"'e\":", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public void test_11() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uokfg1tgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84831,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uokfg1tgf() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84831);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84832);SerializeWriter out = new SerializeWriter();
		__CLR4_5_21te31te3lusyjv3n.R.inc(84833);out.config(SerializerFeature.QuoteFieldNames, true);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84834);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84835);out.writeFieldName("123\na\nb\nc\nd\"'e");
		__CLR4_5_21te31te3lusyjv3n.R.inc(84836);Assert.assertEquals("'123\\na\\nb\\nc\\nd\"\\'e':", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public void test_11_d() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qhwciv1tgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_11_d",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84837,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qhwciv1tgl() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84837);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84838);SerializeWriter out = new SerializeWriter();

		__CLR4_5_21te31te3lusyjv3n.R.inc(84839);out.writeString("123\na\nb\nc\nd\"'e", ':');
		__CLR4_5_21te31te3lusyjv3n.R.inc(84840);Assert.assertEquals("\"123\\na\\nb\\nc\\nd\\\"'e\":", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public void test_12() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lolmz1tgp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84841,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lolmz1tgp() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84841);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84842);SerializeWriter out = new SerializeWriter(1);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84843);out.config(SerializerFeature.QuoteFieldNames, true);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84844);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84845);out.writeFieldName("123\na\nb\nc\nd\"'e");
		__CLR4_5_21te31te3lusyjv3n.R.inc(84846);Assert.assertEquals("'123\\na\\nb\\nc\\nd\"\\'e':", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public void test_12_d() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2smr1dy1tgv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_12_d",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84847,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2smr1dy1tgv() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84847);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84848);SerializeWriter out = new SerializeWriter(1);

		__CLR4_5_21te31te3lusyjv3n.R.inc(84849);out.writeString("123\na\nb\nc\nd\"'e", ':');
		__CLR4_5_21te31te3lusyjv3n.R.inc(84850);Assert.assertEquals("\"123\\na\\nb\\nc\\nd\\\"'e\":", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public void test_13() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22comui1tgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84851,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22comui1tgz() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84851);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84852);SerializeWriter out = new SerializeWriter(4);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84853);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_5_21te31te3lusyjv3n.R.inc(84854);out.writeString("1'");
		__CLR4_5_21te31te3lusyjv3n.R.inc(84855);Assert.assertEquals("'1\\''", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public void test_14() throws Exception {__CLR4_5_21te31te3lusyjv3n.R.globalSliceStart(getClass().getName(),84856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wbbxz1th4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21te31te3lusyjv3n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21te31te3lusyjv3n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84856,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wbbxz1th4() throws Exception{try{__CLR4_5_21te31te3lusyjv3n.R.inc(84856);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84857);SerializeWriter out = new SerializeWriter(4);
		__CLR4_5_21te31te3lusyjv3n.R.inc(84858);out.config(SerializerFeature.UseSingleQuotes, false);

		__CLR4_5_21te31te3lusyjv3n.R.inc(84859);out.writeString("1\"");
		__CLR4_5_21te31te3lusyjv3n.R.inc(84860);Assert.assertEquals("\"1\\\"\"", out.toString());
	}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	public static class TestEntity {

		private String value;

		public TestEntity(String value) {try{__CLR4_5_21te31te3lusyjv3n.R.inc(84861);
			__CLR4_5_21te31te3lusyjv3n.R.inc(84862);this.value = value;
		}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

		public String getValue() {try{__CLR4_5_21te31te3lusyjv3n.R.inc(84863);
			__CLR4_5_21te31te3lusyjv3n.R.inc(84864);return value;
		}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

		public void setValue(String value) {try{__CLR4_5_21te31te3lusyjv3n.R.inc(84865);
			__CLR4_5_21te31te3lusyjv3n.R.inc(84866);this.value = value;
		}finally{__CLR4_5_21te31te3lusyjv3n.R.flushNeeded();}}

	}
}
