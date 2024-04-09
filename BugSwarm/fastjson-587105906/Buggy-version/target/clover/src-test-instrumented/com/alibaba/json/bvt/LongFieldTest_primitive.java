/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class LongFieldTest_primitive extends TestCase {static class __CLR4_1_10z1fz1flusqjyje{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,45447,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	public void test_codec() throws Exception {__CLR4_1_10z1fz1flusqjyje.R.globalSliceStart(getClass().getName(),45411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nht31sz1f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10z1fz1flusqjyje.R.rethrow($CLV_t2$);}finally{__CLR4_1_10z1fz1flusqjyje.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LongFieldTest_primitive.test_codec",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45411,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nht31sz1f() throws Exception{try{__CLR4_1_10z1fz1flusqjyje.R.inc(45411);
		__CLR4_1_10z1fz1flusqjyje.R.inc(45412);V0 v = new V0();
		__CLR4_1_10z1fz1flusqjyje.R.inc(45413);v.setValue(1001L);

		__CLR4_1_10z1fz1flusqjyje.R.inc(45414);String text = JSON.toJSONString(v);

		__CLR4_1_10z1fz1flusqjyje.R.inc(45415);V0 v1 = JSON.parseObject(text, V0.class);

		__CLR4_1_10z1fz1flusqjyje.R.inc(45416);Assert.assertEquals(v1.getValue(), v.getValue());
	}finally{__CLR4_1_10z1fz1flusqjyje.R.flushNeeded();}}

	public void test_codec_null() throws Exception {__CLR4_1_10z1fz1flusqjyje.R.globalSliceStart(getClass().getName(),45417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105ncl18z1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10z1fz1flusqjyje.R.rethrow($CLV_t2$);}finally{__CLR4_1_10z1fz1flusqjyje.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LongFieldTest_primitive.test_codec_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45417,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105ncl18z1l() throws Exception{try{__CLR4_1_10z1fz1flusqjyje.R.inc(45417);
		__CLR4_1_10z1fz1flusqjyje.R.inc(45418);V0 v = new V0();

		__CLR4_1_10z1fz1flusqjyje.R.inc(45419);SerializeConfig mapping = new SerializeConfig();
		__CLR4_1_10z1fz1flusqjyje.R.inc(45420);mapping.setAsmEnable(false);

		__CLR4_1_10z1fz1flusqjyje.R.inc(45421);String text = JSON.toJSONString(v, mapping,
				SerializerFeature.WriteMapNullValue);
		__CLR4_1_10z1fz1flusqjyje.R.inc(45422);Assert.assertEquals("{\"value\":123}", text);

		__CLR4_1_10z1fz1flusqjyje.R.inc(45423);V0 v1 = JSON.parseObject(text, V0.class);

		__CLR4_1_10z1fz1flusqjyje.R.inc(45424);Assert.assertEquals(v1.getValue(), v.getValue());
	}finally{__CLR4_1_10z1fz1flusqjyje.R.flushNeeded();}}

	public void test_codec_null_asm() throws Exception {__CLR4_1_10z1fz1flusqjyje.R.globalSliceStart(getClass().getName(),45425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1097oyf4z1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10z1fz1flusqjyje.R.rethrow($CLV_t2$);}finally{__CLR4_1_10z1fz1flusqjyje.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LongFieldTest_primitive.test_codec_null_asm",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45425,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1097oyf4z1t() throws Exception{try{__CLR4_1_10z1fz1flusqjyje.R.inc(45425);
		__CLR4_1_10z1fz1flusqjyje.R.inc(45426);V0 v = new V0();

		__CLR4_1_10z1fz1flusqjyje.R.inc(45427);SerializeConfig mapping = new SerializeConfig();
		__CLR4_1_10z1fz1flusqjyje.R.inc(45428);mapping.setAsmEnable(true);

		__CLR4_1_10z1fz1flusqjyje.R.inc(45429);String text = JSON.toJSONString(v, mapping,
				SerializerFeature.WriteMapNullValue);
		__CLR4_1_10z1fz1flusqjyje.R.inc(45430);Assert.assertEquals("{\"value\":123}", text);

		__CLR4_1_10z1fz1flusqjyje.R.inc(45431);ParserConfig config = new ParserConfig();
		__CLR4_1_10z1fz1flusqjyje.R.inc(45432);config.setAsmEnable(false);

		__CLR4_1_10z1fz1flusqjyje.R.inc(45433);V0 v1 = JSON.parseObject(text, V0.class, config,
				JSON.DEFAULT_PARSER_FEATURE);

		__CLR4_1_10z1fz1flusqjyje.R.inc(45434);Assert.assertEquals(v1.getValue(), v.getValue());
	}finally{__CLR4_1_10z1fz1flusqjyje.R.flushNeeded();}}

	public void test_codec_null_1() throws Exception {__CLR4_1_10z1fz1flusqjyje.R.globalSliceStart(getClass().getName(),45435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10prl16yz23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10z1fz1flusqjyje.R.rethrow($CLV_t2$);}finally{__CLR4_1_10z1fz1flusqjyje.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LongFieldTest_primitive.test_codec_null_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45435,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10prl16yz23() throws Exception{try{__CLR4_1_10z1fz1flusqjyje.R.inc(45435);
		__CLR4_1_10z1fz1flusqjyje.R.inc(45436);V0 v = new V0();

		__CLR4_1_10z1fz1flusqjyje.R.inc(45437);SerializeConfig mapping = new SerializeConfig();
		__CLR4_1_10z1fz1flusqjyje.R.inc(45438);mapping.setAsmEnable(false);

		__CLR4_1_10z1fz1flusqjyje.R.inc(45439);String text = JSON.toJSONString(v, mapping,
				SerializerFeature.WriteMapNullValue,
				SerializerFeature.WriteNullNumberAsZero);
		__CLR4_1_10z1fz1flusqjyje.R.inc(45440);Assert.assertEquals("{\"value\":123}", text);

		__CLR4_1_10z1fz1flusqjyje.R.inc(45441);V0 v1 = JSON.parseObject(text, V0.class);

		__CLR4_1_10z1fz1flusqjyje.R.inc(45442);Assert.assertEquals(123, v1.getValue());
	}finally{__CLR4_1_10z1fz1flusqjyje.R.flushNeeded();}}

	public static class V0 {

		private long value = 123L;

		public long getValue() {try{__CLR4_1_10z1fz1flusqjyje.R.inc(45443);
			__CLR4_1_10z1fz1flusqjyje.R.inc(45444);return value;
		}finally{__CLR4_1_10z1fz1flusqjyje.R.flushNeeded();}}

		public void setValue(long value) {try{__CLR4_1_10z1fz1flusqjyje.R.inc(45445);
			__CLR4_1_10z1fz1flusqjyje.R.inc(45446);this.value = value;
		}finally{__CLR4_1_10z1fz1flusqjyje.R.flushNeeded();}}

	}
}
