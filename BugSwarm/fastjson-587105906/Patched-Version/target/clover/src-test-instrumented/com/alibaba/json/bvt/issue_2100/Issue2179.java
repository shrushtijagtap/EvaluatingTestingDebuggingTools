/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_2100;

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

@java.lang.SuppressWarnings({"fallthrough"}) public class Issue2179 extends TestCase {static class __CLR4_5_21dv91dv9lusvnb9n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,64766,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	// \u573a\u666f\uff1a\u5e8f\u5217\u5316
	public void test_for_issue() throws Exception {__CLR4_5_21dv91dv9lusvnb9n.R.globalSliceStart(getClass().getName(),64629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1dv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dv91dv9lusvnb9n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dv91dv9lusvnb9n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2179.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64629,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1dv9() throws Exception{try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64629);
		__CLR4_5_21dv91dv9lusvnb9n.R.inc(64630);Model1 model = new Model1(ProductType1.Phone, ProductType1.Computer);
		__CLR4_5_21dv91dv9lusvnb9n.R.inc(64631);String out = "{\"l_k_assbalv4\":{\"code\":1,\"prompt\":\"\u624b\u673a\"},\"type1\":{\"code\":2,\"prompt\":\"\u7535\u8111\"}}";
		__CLR4_5_21dv91dv9lusvnb9n.R.inc(64632);Assert.assertEquals(out, JSON.toJSONString(model));
	}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

	// \u573a\u666f\uff1a\u4f7f\u7528@JSONType\u7684deserializer = EnumAwareSerializer1.class\u6d4b\u8bd5\u81ea\u5b9a\u4e49\u53cd\u5e8f\u5217\u5316\u5668
	public void test_for_issue2() {__CLR4_5_21dv91dv9lusvnb9n.R.globalSliceStart(getClass().getName(),64633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rx8ytf1dvd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dv91dv9lusvnb9n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dv91dv9lusvnb9n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2179.test_for_issue2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64633,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rx8ytf1dvd(){try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64633);
		__CLR4_5_21dv91dv9lusvnb9n.R.inc(64634);String str = "{\"l_k_assbalv4\":{\"code\":1,\"prompt\":\"\u624b\u673a\"},\"type1\":{\"code\":2,\"prompt\":\"\u7535\u8111\"}}";
		__CLR4_5_21dv91dv9lusvnb9n.R.inc(64635);Model1 model = JSON.parseObject(str, Model1.class);
		__CLR4_5_21dv91dv9lusvnb9n.R.inc(64636);String out = "{\"l_k_assbalv4\":{\"code\":1,\"prompt\":\"\u624b\u673a\"},\"type1\":{\"code\":2,\"prompt\":\"\u7535\u8111\"}}";
		__CLR4_5_21dv91dv9lusvnb9n.R.inc(64637);Assert.assertEquals(out, JSON.toJSONString(model));
	}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

	// \u573a\u666f\uff1a\u4f7f\u7528@JSONField\u7684deserializeUsing = EnumAwareSerializer2.class\u6d4b\u8bd5\u81ea\u5b9a\u4e49\u6d4b\u8bd5\u81ea\u5b9a\u4e49\u53cd\u5e8f\u5316\u5668
	public void test_for_issue3() {__CLR4_5_21dv91dv9lusvnb9n.R.globalSliceStart(getClass().getName(),64638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v68xlw1dvi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dv91dv9lusvnb9n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dv91dv9lusvnb9n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2179.test_for_issue3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64638,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v68xlw1dvi(){try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64638);
		// l_k_assbalv4\u5bf9\u5e94Model2\u4e2d\u7684Type\u8d70\u81ea\u5b9a\u4e49\uff0ctype1\u8d70\u9ed8\u8ba4\u679a\u4e3e\u53cd\u5e8f\u5217\u5316
		__CLR4_5_21dv91dv9lusvnb9n.R.inc(64639);String str = "{\"l_k_assbalv4\":{\"code\":1,\"prompt\":\"\u624b\u673a\"},\"type1\":\"Computer\"}";
		__CLR4_5_21dv91dv9lusvnb9n.R.inc(64640);Model2 model = JSON.parseObject(str, Model2.class);
		__CLR4_5_21dv91dv9lusvnb9n.R.inc(64641);String out = "{\"l_k_assbalv4\":{\"code\":1,\"prompt\":\"\u624b\u673a\"},\"type1\":{\"code\":2,\"prompt\":\"\u7535\u8111\"}}";
		__CLR4_5_21dv91dv9lusvnb9n.R.inc(64642);Assert.assertEquals(out, JSON.toJSONString(model));
	}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

	// \u573a\u666f\uff1a\u4f7f\u7528Module
	public void test_for_issue4() {__CLR4_5_21dv91dv9lusvnb9n.R.globalSliceStart(getClass().getName(),64643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yf8wed1dvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dv91dv9lusvnb9n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dv91dv9lusvnb9n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2179.test_for_issue4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64643,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yf8wed1dvn(){try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64643);
		__CLR4_5_21dv91dv9lusvnb9n.R.inc(64644);ParserConfig config = new ParserConfig();
		__CLR4_5_21dv91dv9lusvnb9n.R.inc(64645);config.register(new MyModuel());

		__CLR4_5_21dv91dv9lusvnb9n.R.inc(64646);String str = "{\"type\":\"Phone\",\"type1\":\"Computer\"}";
		__CLR4_5_21dv91dv9lusvnb9n.R.inc(64647);Model3 model = JSON.parseObject(str, Model3.class, config);
		__CLR4_5_21dv91dv9lusvnb9n.R.inc(64648);String out = "{\"type\":{\"code\":2,\"prompt\":\"\u7535\u8111\"},\"type1\":{\"code\":1,\"prompt\":\"\u624b\u673a\"}}";
		__CLR4_5_21dv91dv9lusvnb9n.R.inc(64649);Assert.assertEquals(out, JSON.toJSONString(model));
	}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

	interface EnumAware {
		int getCode();

		String getPrompt();
	}

	@JSONType(serializeEnumAsJavaBean = true, deserializer = EnumAwareSerializer1.class)
	public static enum ProductType1 implements EnumAware {
		Phone(1, "\u624b\u673a"), Computer(2, "\u7535\u8111");

		public final int code;
		public final String prompt;

		ProductType1(int code, String prompt) {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64650);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64651);this.code = code;
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64652);this.prompt = prompt;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		@Override
		public int getCode() {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64653);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64654);return this.code;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		@Override
		public String getPrompt() {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64655);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64656);return this.prompt;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		public static ProductType1 get(int code) {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64657);
			boolean __CLB4_5_2_bool0=false;__CLR4_5_21dv91dv9lusvnb9n.R.inc(64658);switch (code) {
			case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_21dv91dv9lusvnb9n.R.inc(64659);__CLB4_5_2_bool0=true;}
				__CLR4_5_21dv91dv9lusvnb9n.R.inc(64660);return Phone;
			case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_21dv91dv9lusvnb9n.R.inc(64661);__CLB4_5_2_bool0=true;}
				__CLR4_5_21dv91dv9lusvnb9n.R.inc(64662);return Computer;
			default:if (!__CLB4_5_2_bool0) {__CLR4_5_21dv91dv9lusvnb9n.R.inc(64663);__CLB4_5_2_bool0=true;}
				__CLR4_5_21dv91dv9lusvnb9n.R.inc(64664);return null;
			}
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}
	}

	public static class Model1 {
		@JSONField(name = "l_k_assbalv4")
		private ProductType1 type;
		private ProductType1 type1;

		public Model1(ProductType1 type, ProductType1 type1) {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64665);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64666);this.type = type;
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64667);this.type1 = type1;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		public ProductType1 getType() {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64668);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64669);return type;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		public void setType(ProductType1 type) {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64670);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64671);this.type = type;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		public ProductType1 getType1() {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64672);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64673);return type1;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		public void setType1(ProductType1 type1) {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64674);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64675);this.type1 = type1;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}
	}

	@JSONType(serializeEnumAsJavaBean = true)
	public static enum ProductType2 implements EnumAware {
		Phone(1, "\u624b\u673a"), Computer(2, "\u7535\u8111");

		public final int code;
		public final String prompt;

		ProductType2(int code, String prompt) {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64676);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64677);this.code = code;
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64678);this.prompt = prompt;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		@Override
		public int getCode() {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64679);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64680);return this.code;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		@Override
		public String getPrompt() {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64681);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64682);return this.prompt;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		public static ProductType2 get(int code) {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64683);
			boolean __CLB4_5_2_bool1=false;__CLR4_5_21dv91dv9lusvnb9n.R.inc(64684);switch (code) {
			case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_21dv91dv9lusvnb9n.R.inc(64685);__CLB4_5_2_bool1=true;}
				__CLR4_5_21dv91dv9lusvnb9n.R.inc(64686);return Phone;
			case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_21dv91dv9lusvnb9n.R.inc(64687);__CLB4_5_2_bool1=true;}
				__CLR4_5_21dv91dv9lusvnb9n.R.inc(64688);return Computer;
			default:if (!__CLB4_5_2_bool1) {__CLR4_5_21dv91dv9lusvnb9n.R.inc(64689);__CLB4_5_2_bool1=true;}
				__CLR4_5_21dv91dv9lusvnb9n.R.inc(64690);return null;
			}
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}
	}

	public static class Model2 {
		@JSONField(name = "l_k_assbalv4", deserializeUsing = EnumAwareSerializer2.class)
		private ProductType2 type;
		private ProductType2 type1;

		public Model2(ProductType2 type, ProductType2 type1) {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64691);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64692);this.type = type;
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64693);this.type1 = type1;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		public ProductType2 getType() {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64694);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64695);return type;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		public void setType(ProductType2 type) {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64696);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64697);this.type = type;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		public ProductType2 getType1() {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64698);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64699);return type1;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		public void setType1(ProductType2 type1) {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64700);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64701);this.type1 = type1;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}
	}

	@JSONType(serializeEnumAsJavaBean = true)
	public static enum ProductType3 implements EnumAware {
		Phone(1, "\u624b\u673a"), Computer(2, "\u7535\u8111");

		public final int code;
		public final String prompt;

		@Override
		public int getCode() {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64702);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64703);return this.code;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		ProductType3(int code, String prompt) {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64704);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64705);this.code = code;
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64706);this.prompt = prompt;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		@Override
		public String getPrompt() {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64707);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64708);return this.prompt;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		public static ProductType3 get(int code) {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64709);
			boolean __CLB4_5_2_bool2=false;__CLR4_5_21dv91dv9lusvnb9n.R.inc(64710);switch (code) {
			case 1:if (!__CLB4_5_2_bool2) {__CLR4_5_21dv91dv9lusvnb9n.R.inc(64711);__CLB4_5_2_bool2=true;}
				__CLR4_5_21dv91dv9lusvnb9n.R.inc(64712);return Phone;
			case 2:if (!__CLB4_5_2_bool2) {__CLR4_5_21dv91dv9lusvnb9n.R.inc(64713);__CLB4_5_2_bool2=true;}
				__CLR4_5_21dv91dv9lusvnb9n.R.inc(64714);return Computer;
			default:if (!__CLB4_5_2_bool2) {__CLR4_5_21dv91dv9lusvnb9n.R.inc(64715);__CLB4_5_2_bool2=true;}
				__CLR4_5_21dv91dv9lusvnb9n.R.inc(64716);return null;
			}
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}
	}

	public static class Model3 {
		private ProductType3 type;
		private ProductType3 type1;

		public Model3(ProductType3 type, ProductType3 type1) {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64717);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64718);this.type = type;
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64719);this.type1 = type1;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		public ProductType3 getType() {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64720);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64721);return type;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		public void setType(ProductType3 type) {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64722);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64723);this.type = type;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		public ProductType3 getType1() {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64724);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64725);return type1;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		public void setType1(ProductType3 type1) {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64726);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64727);this.type1 = type1;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}
	}

	public static class EnumAwareSerializer1 implements ObjectDeserializer {
		@SuppressWarnings("unchecked")
		public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64728);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64729);String val = StringCodec.instance.deserialze(parser, type, fieldName);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64730);System.out.println("-----------------EnumAwareSerializer1.deserialze-----------------------------");
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64731);System.out.println(val);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64732);return (T) ProductType1.get(JSON.parseObject(val).getInteger("code"));
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		@Override
		public int getFastMatchToken() {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64733);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64734);return JSONToken.LITERAL_STRING;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}
	}

	public static class EnumAwareSerializer2 implements ObjectDeserializer {
		@SuppressWarnings("unchecked")
		public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64735);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64736);String val = StringCodec.instance.deserialze(parser, type, fieldName);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64737);System.out.println("-----------------EnumAwareSerializer2.deserialze-----------------------------");
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64738);System.out.println(val);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64739);return (T) ProductType2.get(JSON.parseObject(val).getInteger("code"));
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		@Override
		public int getFastMatchToken() {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64740);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64741);return JSONToken.LITERAL_STRING;
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}
	}

	public static class MyModuel implements Module {

		@SuppressWarnings("rawtypes")
		@Override
		public ObjectDeserializer createDeserializer(ParserConfig config, Class type) {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64742);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64743);return new ObjectDeserializer() {
				@SuppressWarnings("unchecked")
				@Override
				public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64744);
					__CLR4_5_21dv91dv9lusvnb9n.R.inc(64745);String val = StringCodec.instance.deserialze(parser, type, fieldName);
					__CLR4_5_21dv91dv9lusvnb9n.R.inc(64746);System.out.println("-----------MyModuel.deserialze------------------------");
					__CLR4_5_21dv91dv9lusvnb9n.R.inc(64747);System.out.println(val);
					__CLR4_5_21dv91dv9lusvnb9n.R.inc(64748);try {
						__CLR4_5_21dv91dv9lusvnb9n.R.inc(64749);Constructor c = Class.forName(type.getTypeName()).getDeclaredConstructor(ProductType3.class,
								ProductType3.class);
						__CLR4_5_21dv91dv9lusvnb9n.R.inc(64750);return (T) c.newInstance(ProductType3.Computer, ProductType3.Phone);
					} catch (Exception e) {
						__CLR4_5_21dv91dv9lusvnb9n.R.inc(64751);e.printStackTrace();
						__CLR4_5_21dv91dv9lusvnb9n.R.inc(64752);return null;
					}
				}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

				@Override
				public int getFastMatchToken() {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64753);
					__CLR4_5_21dv91dv9lusvnb9n.R.inc(64754);return JSONToken.LITERAL_STRING;
				}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}
			};
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}

		@SuppressWarnings("rawtypes")
		@Override
		public ObjectSerializer createSerializer(SerializeConfig config, Class type) {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64755);
			__CLR4_5_21dv91dv9lusvnb9n.R.inc(64756);return new ObjectSerializer() {
				@Override
				public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType,
						int features) throws IOException {try{__CLR4_5_21dv91dv9lusvnb9n.R.inc(64757);
					__CLR4_5_21dv91dv9lusvnb9n.R.inc(64758);SerializeWriter out = serializer.out;
					__CLR4_5_21dv91dv9lusvnb9n.R.inc(64759);if ((((object == null)&&(__CLR4_5_21dv91dv9lusvnb9n.R.iget(64760)!=0|true))||(__CLR4_5_21dv91dv9lusvnb9n.R.iget(64761)==0&false))) {{
						__CLR4_5_21dv91dv9lusvnb9n.R.inc(64762);out.writeNull();
						__CLR4_5_21dv91dv9lusvnb9n.R.inc(64763);return;
					}
					}__CLR4_5_21dv91dv9lusvnb9n.R.inc(64764);System.err.println("--------------MyModuel.write-------------------------");

					__CLR4_5_21dv91dv9lusvnb9n.R.inc(64765);StringCodec.instance.write(serializer, ((ProductType3) object).name(), fieldName, fieldType,
							features);
				}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}
			};
		}finally{__CLR4_5_21dv91dv9lusvnb9n.R.flushNeeded();}}
	}

}
