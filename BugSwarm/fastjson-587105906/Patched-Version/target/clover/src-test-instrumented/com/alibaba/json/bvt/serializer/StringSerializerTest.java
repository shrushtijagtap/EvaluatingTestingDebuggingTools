/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringWriter;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class StringSerializerTest extends TestCase {static class __CLR4_5_21ucb1ucblusvngmk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,86099,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	public void test_0() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),85979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21ucb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85979,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21ucb() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(85979);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(85980);Assert.assertEquals("{\"value\":null}", JSON.toJSONString(
				new TestEntity(null), SerializerFeature.WriteMapNullValue));

		__CLR4_5_21ucb1ucblusvngmk.R.inc(85981);SerializeWriter out = new SerializeWriter();

		__CLR4_5_21ucb1ucblusvngmk.R.inc(85982);JSONSerializer.write(out, (Object) "123");
		__CLR4_5_21ucb1ucblusvngmk.R.inc(85983);Assert.assertEquals("\"123\"", out.toString());

		__CLR4_5_21ucb1ucblusvngmk.R.inc(85984);JSONSerializer.write(out, (Object) "456");
		__CLR4_5_21ucb1ucblusvngmk.R.inc(85985);Assert.assertEquals("\"123\"\"456\"", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public void test_2() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),85986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441uci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85986,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441uci() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(85986);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(85987);StringWriter out = new StringWriter();

		__CLR4_5_21ucb1ucblusvngmk.R.inc(85988);JSONSerializer.write(out, new TestEntity(null));
		__CLR4_5_21ucb1ucblusvngmk.R.inc(85989);Assert.assertEquals("{}", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public void test_2_s() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),85990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2529ops1ucm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85990,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2529ops1ucm() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(85990);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(85991);SerializeWriter out = new SerializeWriter();

		__CLR4_5_21ucb1ucblusvngmk.R.inc(85992);JSONSerializer.write(out, new TestEntity(null));
		__CLR4_5_21ucb1ucblusvngmk.R.inc(85993);Assert.assertEquals("{}", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public void test_3() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),85994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1ucq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85994,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1ucq() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(85994);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(85995);SerializeWriter out = new SerializeWriter();
		__CLR4_5_21ucb1ucblusvngmk.R.inc(85996);JSONSerializer serializer = new JSONSerializer(out);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(85997);serializer.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_5_21ucb1ucblusvngmk.R.inc(85998);serializer.write(new TestEntity("\u5f20\u4e09"));
		__CLR4_5_21ucb1ucblusvngmk.R.inc(85999);Assert.assertEquals("{'value':'\u5f20\u4e09'}", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public void test_4() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),86000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61ucw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86000,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61ucw() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(86000);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86001);StringWriter out = new StringWriter();

		__CLR4_5_21ucb1ucblusvngmk.R.inc(86002);JSONSerializer.write(out, new TestEntity("\u5f20\u4e09"));
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86003);Assert.assertEquals("{\"value\":\"\u5f20\u4e09\"}", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public void test_5() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),86004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1ud0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86004,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1ud0() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(86004);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86005);SerializeWriter out = new SerializeWriter();
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86006);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_5_21ucb1ucblusvngmk.R.inc(86007);out.writeString((String) null);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86008);Assert.assertEquals("null", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public void test_5_d() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),86009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2atast01ud5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_5_d",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86009,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2atast01ud5() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(86009);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86010);SerializeWriter out = new SerializeWriter();
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86011);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_5_21ucb1ucblusvngmk.R.inc(86012);out.writeString((String) null);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86013);Assert.assertEquals("null", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public void test_6() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),86014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81uda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86014,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81uda() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(86014);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86015);SerializeWriter out = new SerializeWriter(1);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86016);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_5_21ucb1ucblusvngmk.R.inc(86017);out.writeString((String) null);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86018);Assert.assertEquals("null", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public void test_6_d() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),86019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28og3xx1udf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_6_d",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86019,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28og3xx1udf() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(86019);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86020);SerializeWriter out = new SerializeWriter(1);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86021);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_5_21ucb1ucblusvngmk.R.inc(86022);out.writeString((String) null);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86023);Assert.assertEquals("null", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public void test_7() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),86024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1udk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86024,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1udk() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(86024);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86025);SerializeWriter out = new SerializeWriter(1);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86026);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_5_21ucb1ucblusvngmk.R.inc(86027);out.writeString("\u4e2d\u56fd");
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86028);Assert.assertEquals("'\u4e2d\u56fd'", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public void test_7_d() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),86029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26jlf2u1udp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_7_d",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86029,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26jlf2u1udp() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(86029);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86030);SerializeWriter out = new SerializeWriter(1);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86031);out.config(SerializerFeature.UseSingleQuotes, false);

		__CLR4_5_21ucb1ucblusvngmk.R.inc(86032);out.writeString("\u4e2d\u56fd");
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86033);Assert.assertEquals("\"\u4e2d\u56fd\"", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public void test_8() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),86034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq1udu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86034,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq1udu() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(86034);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86035);SerializeWriter out = new SerializeWriter();
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86036);out = new SerializeWriter();
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86037);out.config(SerializerFeature.UseSingleQuotes, false);

		__CLR4_5_21ucb1ucblusvngmk.R.inc(86038);out.writeString("\na\nb\nc\nd\"'");
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86039);Assert.assertEquals("\"\\na\\nb\\nc\\nd\\\"'\"", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public void test_8_s() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),86040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hvdtwa1ue0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_8_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86040,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hvdtwa1ue0() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(86040);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86041);SerializeWriter out = new SerializeWriter();
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86042);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_5_21ucb1ucblusvngmk.R.inc(86043);out.writeString("\na\nb\nc\nd\"'");
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86044);Assert.assertEquals("'\\na\\nb\\nc\\nd\"\\''", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public void test_9() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),86045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f71ue5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86045,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f71ue5() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(86045);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86046);SerializeWriter out = new SerializeWriter(1);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86047);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86048);out.writeFieldName("\na\nb\nc\nd\"'e");
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86049);Assert.assertEquals("'\\na\\nb\\nc\\nd\"\\'e':", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public void test_9_d() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),86050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_229w1co1uea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_9_d",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86050,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_229w1co1uea() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(86050);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86051);SerializeWriter out = new SerializeWriter(1);

		__CLR4_5_21ucb1ucblusvngmk.R.inc(86052);out.writeFieldName("\na\nb\nc\nd\"'e");
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86053);Assert.assertEquals("\"\\na\\nb\\nc\\nd\\\"'e\":", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public void test_10() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),86054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3oj7x1uee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86054,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3oj7x1uee() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(86054);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86055);SerializeWriter out = new SerializeWriter();
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86056);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86057);out.writeFieldName("123\na\nb\nc\nd\"'e");
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86058);Assert.assertEquals("'123\\na\\nb\\nc\\nd\"\\'e':", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public void test_10_d() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),86059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2od1nns1uej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_10_d",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86059,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2od1nns1uej() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(86059);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86060);SerializeWriter out = new SerializeWriter();

		__CLR4_5_21ucb1ucblusvngmk.R.inc(86061);out.writeFieldName("123\na\nb\nc\nd\"'e", true);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86062);Assert.assertEquals("\"123\\na\\nb\\nc\\nd\\\"'e\":", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public void test_11() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),86063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uokfg1uen();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86063,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uokfg1uen() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(86063);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86064);SerializeWriter out = new SerializeWriter();
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86065);out.config(SerializerFeature.QuoteFieldNames, true);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86066);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86067);out.writeFieldName("123\na\nb\nc\nd\"'e");
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86068);Assert.assertEquals("'123\\na\\nb\\nc\\nd\"\\'e':", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public void test_11_d() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),86069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qhwciv1uet();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_11_d",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86069,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qhwciv1uet() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(86069);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86070);SerializeWriter out = new SerializeWriter();

		__CLR4_5_21ucb1ucblusvngmk.R.inc(86071);out.writeString("123\na\nb\nc\nd\"'e", ':');
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86072);Assert.assertEquals("\"123\\na\\nb\\nc\\nd\\\"'e\":", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public void test_12() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),86073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lolmz1uex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86073,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lolmz1uex() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(86073);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86074);SerializeWriter out = new SerializeWriter(1);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86075);out.config(SerializerFeature.QuoteFieldNames, true);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86076);out.config(SerializerFeature.UseSingleQuotes, true);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86077);out.writeFieldName("123\na\nb\nc\nd\"'e");
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86078);Assert.assertEquals("'123\\na\\nb\\nc\\nd\"\\'e':", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public void test_12_d() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),86079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2smr1dy1uf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_12_d",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86079,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2smr1dy1uf3() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(86079);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86080);SerializeWriter out = new SerializeWriter(1);

		__CLR4_5_21ucb1ucblusvngmk.R.inc(86081);out.writeString("123\na\nb\nc\nd\"'e", ':');
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86082);Assert.assertEquals("\"123\\na\\nb\\nc\\nd\\\"'e\":", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public void test_13() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),86083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22comui1uf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86083,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22comui1uf7() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(86083);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86084);SerializeWriter out = new SerializeWriter(4);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86085);out.config(SerializerFeature.UseSingleQuotes, true);

		__CLR4_5_21ucb1ucblusvngmk.R.inc(86086);out.writeString("1'");
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86087);Assert.assertEquals("'1\\''", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public void test_14() throws Exception {__CLR4_5_21ucb1ucblusvngmk.R.globalSliceStart(getClass().getName(),86088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wbbxz1ufc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ucb1ucblusvngmk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ucb1ucblusvngmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.StringSerializerTest.test_14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86088,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wbbxz1ufc() throws Exception{try{__CLR4_5_21ucb1ucblusvngmk.R.inc(86088);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86089);SerializeWriter out = new SerializeWriter(4);
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86090);out.config(SerializerFeature.UseSingleQuotes, false);

		__CLR4_5_21ucb1ucblusvngmk.R.inc(86091);out.writeString("1\"");
		__CLR4_5_21ucb1ucblusvngmk.R.inc(86092);Assert.assertEquals("\"1\\\"\"", out.toString());
	}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	public static class TestEntity {

		private String value;

		public TestEntity(String value) {try{__CLR4_5_21ucb1ucblusvngmk.R.inc(86093);
			__CLR4_5_21ucb1ucblusvngmk.R.inc(86094);this.value = value;
		}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

		public String getValue() {try{__CLR4_5_21ucb1ucblusvngmk.R.inc(86095);
			__CLR4_5_21ucb1ucblusvngmk.R.inc(86096);return value;
		}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

		public void setValue(String value) {try{__CLR4_5_21ucb1ucblusvngmk.R.inc(86097);
			__CLR4_5_21ucb1ucblusvngmk.R.inc(86098);this.value = value;
		}finally{__CLR4_5_21ucb1ucblusvngmk.R.flushNeeded();}}

	}
}
