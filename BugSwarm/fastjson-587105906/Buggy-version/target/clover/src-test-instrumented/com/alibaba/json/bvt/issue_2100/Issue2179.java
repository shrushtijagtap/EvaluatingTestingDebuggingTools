/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_2100;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.StringCodec;
import com.alibaba.fastjson.spi.Module;

import junit.framework.TestCase;

@java.lang.SuppressWarnings({"fallthrough"}) public class Issue2179 extends TestCase {static class __CLR4_1_101dvk1dvkluszwbmk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,64777,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	// \u573a\u666f\uff1a\u5e8f\u5217\u5316
	public void test_for_issue() throws Exception {__CLR4_1_101dvk1dvkluszwbmk.R.globalSliceStart(getClass().getName(),64640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1dvk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101dvk1dvkluszwbmk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101dvk1dvkluszwbmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2179.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),64640,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1dvk() throws Exception{try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64640);
		__CLR4_1_101dvk1dvkluszwbmk.R.inc(64641);Model1 model = new Model1(ProductType1.Phone, ProductType1.Computer);
		__CLR4_1_101dvk1dvkluszwbmk.R.inc(64642);String out = "{\"l_k_assbalv4\":{\"code\":1,\"prompt\":\"\u624b\u673a\"},\"type1\":{\"code\":2,\"prompt\":\"\u7535\u8111\"}}";
		__CLR4_1_101dvk1dvkluszwbmk.R.inc(64643);Assert.assertEquals(out, JSON.toJSONString(model));
	}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

	// \u573a\u666f\uff1a\u4f7f\u7528@JSONType\u7684deserializer = EnumAwareSerializer1.class\u6d4b\u8bd5\u81ea\u5b9a\u4e49\u53cd\u5e8f\u5217\u5316\u5668
	public void test_for_issue2() {__CLR4_1_101dvk1dvkluszwbmk.R.globalSliceStart(getClass().getName(),64644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rx8ytf1dvo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101dvk1dvkluszwbmk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101dvk1dvkluszwbmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2179.test_for_issue2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),64644,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rx8ytf1dvo(){try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64644);
		__CLR4_1_101dvk1dvkluszwbmk.R.inc(64645);String str = "{\"l_k_assbalv4\":{\"code\":1,\"prompt\":\"\u624b\u673a\"},\"type1\":{\"code\":2,\"prompt\":\"\u7535\u8111\"}}";
		__CLR4_1_101dvk1dvkluszwbmk.R.inc(64646);Model1 model = JSON.parseObject(str, Model1.class);
		__CLR4_1_101dvk1dvkluszwbmk.R.inc(64647);String out = "{\"l_k_assbalv4\":{\"code\":1,\"prompt\":\"\u624b\u673a\"},\"type1\":{\"code\":2,\"prompt\":\"\u7535\u8111\"}}";
		__CLR4_1_101dvk1dvkluszwbmk.R.inc(64648);Assert.assertEquals(out, JSON.toJSONString(model));
	}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

	// \u573a\u666f\uff1a\u4f7f\u7528@JSONField\u7684deserializeUsing = EnumAwareSerializer2.class\u6d4b\u8bd5\u81ea\u5b9a\u4e49\u6d4b\u8bd5\u81ea\u5b9a\u4e49\u53cd\u5e8f\u5316\u5668
	public void test_for_issue3() {__CLR4_1_101dvk1dvkluszwbmk.R.globalSliceStart(getClass().getName(),64649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v68xlw1dvt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101dvk1dvkluszwbmk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101dvk1dvkluszwbmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2179.test_for_issue3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),64649,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v68xlw1dvt(){try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64649);
		// l_k_assbalv4\u5bf9\u5e94Model2\u4e2d\u7684Type\u8d70\u81ea\u5b9a\u4e49\uff0ctype1\u8d70\u9ed8\u8ba4\u679a\u4e3e\u53cd\u5e8f\u5217\u5316
		__CLR4_1_101dvk1dvkluszwbmk.R.inc(64650);String str = "{\"l_k_assbalv4\":{\"code\":1,\"prompt\":\"\u624b\u673a\"},\"type1\":\"Computer\"}";
		__CLR4_1_101dvk1dvkluszwbmk.R.inc(64651);Model2 model = JSON.parseObject(str, Model2.class);
		__CLR4_1_101dvk1dvkluszwbmk.R.inc(64652);String out = "{\"l_k_assbalv4\":{\"code\":1,\"prompt\":\"\u624b\u673a\"},\"type1\":{\"code\":2,\"prompt\":\"\u7535\u8111\"}}";
		__CLR4_1_101dvk1dvkluszwbmk.R.inc(64653);Assert.assertEquals(out, JSON.toJSONString(model));
	}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

	// \u573a\u666f\uff1a\u4f7f\u7528Module
	public void test_for_issue4() {__CLR4_1_101dvk1dvkluszwbmk.R.globalSliceStart(getClass().getName(),64654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yf8wed1dvy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101dvk1dvkluszwbmk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101dvk1dvkluszwbmk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2179.test_for_issue4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),64654,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yf8wed1dvy(){try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64654);
		__CLR4_1_101dvk1dvkluszwbmk.R.inc(64655);ParserConfig config = new ParserConfig();
		__CLR4_1_101dvk1dvkluszwbmk.R.inc(64656);config.register(new MyModuel());

		__CLR4_1_101dvk1dvkluszwbmk.R.inc(64657);String str = "{\"type\":\"Phone\",\"type1\":\"Computer\"}";
		__CLR4_1_101dvk1dvkluszwbmk.R.inc(64658);Model3 model = JSON.parseObject(str, Model3.class, config);
		__CLR4_1_101dvk1dvkluszwbmk.R.inc(64659);String out = "{\"type\":{\"code\":2,\"prompt\":\"\u7535\u8111\"},\"type1\":{\"code\":1,\"prompt\":\"\u624b\u673a\"}}";
		__CLR4_1_101dvk1dvkluszwbmk.R.inc(64660);Assert.assertEquals(out, JSON.toJSONString(model));
	}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

	interface EnumAware {
		int getCode();

		String getPrompt();
	}

	@JSONType(serializeEnumAsJavaBean = true, deserializer = EnumAwareSerializer1.class)
	public static enum ProductType1 implements EnumAware {
		Phone(1, "\u624b\u673a"), Computer(2, "\u7535\u8111");

		public final int code;
		public final String prompt;

		ProductType1(int code, String prompt) {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64661);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64662);this.code = code;
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64663);this.prompt = prompt;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		@Override
		public int getCode() {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64664);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64665);return this.code;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		@Override
		public String getPrompt() {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64666);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64667);return this.prompt;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		public static ProductType1 get(int code) {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64668);
			boolean __CLB4_1_10_bool0=false;__CLR4_1_101dvk1dvkluszwbmk.R.inc(64669);switch (code) {
			case 1:if (!__CLB4_1_10_bool0) {__CLR4_1_101dvk1dvkluszwbmk.R.inc(64670);__CLB4_1_10_bool0=true;}
				__CLR4_1_101dvk1dvkluszwbmk.R.inc(64671);return Phone;
			case 2:if (!__CLB4_1_10_bool0) {__CLR4_1_101dvk1dvkluszwbmk.R.inc(64672);__CLB4_1_10_bool0=true;}
				__CLR4_1_101dvk1dvkluszwbmk.R.inc(64673);return Computer;
			default:if (!__CLB4_1_10_bool0) {__CLR4_1_101dvk1dvkluszwbmk.R.inc(64674);__CLB4_1_10_bool0=true;}
				__CLR4_1_101dvk1dvkluszwbmk.R.inc(64675);return null;
			}
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}
	}

	public static class Model1 {
		@JSONField(name = "l_k_assbalv4")
		private ProductType1 type;
		private ProductType1 type1;

		public Model1(ProductType1 type, ProductType1 type1) {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64676);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64677);this.type = type;
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64678);this.type1 = type1;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		public ProductType1 getType() {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64679);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64680);return type;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		public void setType(ProductType1 type) {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64681);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64682);this.type = type;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		public ProductType1 getType1() {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64683);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64684);return type1;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		public void setType1(ProductType1 type1) {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64685);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64686);this.type1 = type1;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}
	}

	@JSONType(serializeEnumAsJavaBean = true)
	public static enum ProductType2 implements EnumAware {
		Phone(1, "\u624b\u673a"), Computer(2, "\u7535\u8111");

		public final int code;
		public final String prompt;

		ProductType2(int code, String prompt) {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64687);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64688);this.code = code;
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64689);this.prompt = prompt;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		@Override
		public int getCode() {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64690);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64691);return this.code;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		@Override
		public String getPrompt() {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64692);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64693);return this.prompt;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		public static ProductType2 get(int code) {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64694);
			boolean __CLB4_1_10_bool1=false;__CLR4_1_101dvk1dvkluszwbmk.R.inc(64695);switch (code) {
			case 1:if (!__CLB4_1_10_bool1) {__CLR4_1_101dvk1dvkluszwbmk.R.inc(64696);__CLB4_1_10_bool1=true;}
				__CLR4_1_101dvk1dvkluszwbmk.R.inc(64697);return Phone;
			case 2:if (!__CLB4_1_10_bool1) {__CLR4_1_101dvk1dvkluszwbmk.R.inc(64698);__CLB4_1_10_bool1=true;}
				__CLR4_1_101dvk1dvkluszwbmk.R.inc(64699);return Computer;
			default:if (!__CLB4_1_10_bool1) {__CLR4_1_101dvk1dvkluszwbmk.R.inc(64700);__CLB4_1_10_bool1=true;}
				__CLR4_1_101dvk1dvkluszwbmk.R.inc(64701);return null;
			}
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}
	}

	public static class Model2 {
		@JSONField(name = "l_k_assbalv4", deserializeUsing = EnumAwareSerializer2.class)
		private ProductType2 type;
		private ProductType2 type1;

		public Model2(ProductType2 type, ProductType2 type1) {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64702);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64703);this.type = type;
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64704);this.type1 = type1;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		public ProductType2 getType() {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64705);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64706);return type;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		public void setType(ProductType2 type) {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64707);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64708);this.type = type;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		public ProductType2 getType1() {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64709);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64710);return type1;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		public void setType1(ProductType2 type1) {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64711);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64712);this.type1 = type1;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}
	}

	@JSONType(serializeEnumAsJavaBean = true)
	public static enum ProductType3 implements EnumAware {
		Phone(1, "\u624b\u673a"), Computer(2, "\u7535\u8111");

		public final int code;
		public final String prompt;

		@Override
		public int getCode() {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64713);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64714);return this.code;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		ProductType3(int code, String prompt) {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64715);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64716);this.code = code;
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64717);this.prompt = prompt;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		@Override
		public String getPrompt() {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64718);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64719);return this.prompt;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		public static ProductType3 get(int code) {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64720);
			boolean __CLB4_1_10_bool2=false;__CLR4_1_101dvk1dvkluszwbmk.R.inc(64721);switch (code) {
			case 1:if (!__CLB4_1_10_bool2) {__CLR4_1_101dvk1dvkluszwbmk.R.inc(64722);__CLB4_1_10_bool2=true;}
				__CLR4_1_101dvk1dvkluszwbmk.R.inc(64723);return Phone;
			case 2:if (!__CLB4_1_10_bool2) {__CLR4_1_101dvk1dvkluszwbmk.R.inc(64724);__CLB4_1_10_bool2=true;}
				__CLR4_1_101dvk1dvkluszwbmk.R.inc(64725);return Computer;
			default:if (!__CLB4_1_10_bool2) {__CLR4_1_101dvk1dvkluszwbmk.R.inc(64726);__CLB4_1_10_bool2=true;}
				__CLR4_1_101dvk1dvkluszwbmk.R.inc(64727);return null;
			}
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}
	}

	public static class Model3 {
		private ProductType3 type;
		private ProductType3 type1;

		public Model3(ProductType3 type, ProductType3 type1) {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64728);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64729);this.type = type;
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64730);this.type1 = type1;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		public ProductType3 getType() {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64731);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64732);return type;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		public void setType(ProductType3 type) {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64733);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64734);this.type = type;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		public ProductType3 getType1() {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64735);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64736);return type1;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		public void setType1(ProductType3 type1) {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64737);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64738);this.type1 = type1;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}
	}

	public static class EnumAwareSerializer1 implements ObjectDeserializer {
		@SuppressWarnings("unchecked")
		public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64739);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64740);String val = StringCodec.instance.deserialze(parser, type, fieldName);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64741);System.out.println("-----------------EnumAwareSerializer1.deserialze-----------------------------");
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64742);System.out.println(val);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64743);return (T) ProductType1.get(JSON.parseObject(val).getInteger("code"));
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		@Override
		public int getFastMatchToken() {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64744);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64745);return JSONToken.LITERAL_STRING;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}
	}

	public static class EnumAwareSerializer2 implements ObjectDeserializer {
		@SuppressWarnings("unchecked")
		public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64746);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64747);String val = StringCodec.instance.deserialze(parser, type, fieldName);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64748);System.out.println("-----------------EnumAwareSerializer2.deserialze-----------------------------");
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64749);System.out.println(val);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64750);return (T) ProductType2.get(JSON.parseObject(val).getInteger("code"));
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		@Override
		public int getFastMatchToken() {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64751);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64752);return JSONToken.LITERAL_STRING;
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}
	}

	public static class MyModuel implements Module {

		@SuppressWarnings("rawtypes")
		@Override
		public ObjectDeserializer createDeserializer(ParserConfig config, Class type) {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64753);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64754);return new ObjectDeserializer() {
				@SuppressWarnings("unchecked")
				@Override
				public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64755);
					__CLR4_1_101dvk1dvkluszwbmk.R.inc(64756);String val = StringCodec.instance.deserialze(parser, type, fieldName);
					__CLR4_1_101dvk1dvkluszwbmk.R.inc(64757);System.out.println("-----------MyModuel.deserialze------------------------");
					__CLR4_1_101dvk1dvkluszwbmk.R.inc(64758);System.out.println(val);
					__CLR4_1_101dvk1dvkluszwbmk.R.inc(64759);try {
						__CLR4_1_101dvk1dvkluszwbmk.R.inc(64760);Constructor c = Class.forName(type.getTypeName()).getDeclaredConstructor(ProductType3.class,
								ProductType3.class);
						__CLR4_1_101dvk1dvkluszwbmk.R.inc(64761);return (T) c.newInstance(ProductType3.Computer, ProductType3.Phone);
					} catch (Exception e) {
						__CLR4_1_101dvk1dvkluszwbmk.R.inc(64762);e.printStackTrace();
						__CLR4_1_101dvk1dvkluszwbmk.R.inc(64763);return null;
					}
				}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

				@Override
				public int getFastMatchToken() {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64764);
					__CLR4_1_101dvk1dvkluszwbmk.R.inc(64765);return JSONToken.LITERAL_STRING;
				}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}
			};
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}

		@SuppressWarnings("rawtypes")
		@Override
		public ObjectSerializer createSerializer(SerializeConfig config, Class type) {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64766);
			__CLR4_1_101dvk1dvkluszwbmk.R.inc(64767);return new ObjectSerializer() {
				@Override
				public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType,
						int features) throws IOException {try{__CLR4_1_101dvk1dvkluszwbmk.R.inc(64768);
					__CLR4_1_101dvk1dvkluszwbmk.R.inc(64769);SerializeWriter out = serializer.out;
					__CLR4_1_101dvk1dvkluszwbmk.R.inc(64770);if ((((object == null)&&(__CLR4_1_101dvk1dvkluszwbmk.R.iget(64771)!=0|true))||(__CLR4_1_101dvk1dvkluszwbmk.R.iget(64772)==0&false))) {{
						__CLR4_1_101dvk1dvkluszwbmk.R.inc(64773);out.writeNull();
						__CLR4_1_101dvk1dvkluszwbmk.R.inc(64774);return;
					}
					}__CLR4_1_101dvk1dvkluszwbmk.R.inc(64775);System.err.println("--------------MyModuel.write-------------------------");

					__CLR4_1_101dvk1dvkluszwbmk.R.inc(64776);StringCodec.instance.write(serializer, ((ProductType3) object).name(), fieldName, fieldType,
							features);
				}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}
			};
		}finally{__CLR4_1_101dvk1dvkluszwbmk.R.flushNeeded();}}
	}

}
