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

@java.lang.SuppressWarnings({"fallthrough"}) public class Issue2179 extends TestCase {static class __CLR4_5_21cx11cx1lusyjt4w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,63534,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	// \u573a\u666f\uff1a\u5e8f\u5217\u5316
	public void test_for_issue() throws Exception {__CLR4_5_21cx11cx1lusyjt4w.R.globalSliceStart(getClass().getName(),63397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1cx1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cx11cx1lusyjt4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cx11cx1lusyjt4w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2179.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63397,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1cx1() throws Exception{try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63397);
		__CLR4_5_21cx11cx1lusyjt4w.R.inc(63398);Model1 model = new Model1(ProductType1.Phone, ProductType1.Computer);
		__CLR4_5_21cx11cx1lusyjt4w.R.inc(63399);String out = "{\"l_k_assbalv4\":{\"code\":1,\"prompt\":\"\u624b\u673a\"},\"type1\":{\"code\":2,\"prompt\":\"\u7535\u8111\"}}";
		__CLR4_5_21cx11cx1lusyjt4w.R.inc(63400);Assert.assertEquals(out, JSON.toJSONString(model));
	}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

	// \u573a\u666f\uff1a\u4f7f\u7528@JSONType\u7684deserializer = EnumAwareSerializer1.class\u6d4b\u8bd5\u81ea\u5b9a\u4e49\u53cd\u5e8f\u5217\u5316\u5668
	public void test_for_issue2() {__CLR4_5_21cx11cx1lusyjt4w.R.globalSliceStart(getClass().getName(),63401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rx8ytf1cx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cx11cx1lusyjt4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cx11cx1lusyjt4w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2179.test_for_issue2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63401,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rx8ytf1cx5(){try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63401);
		__CLR4_5_21cx11cx1lusyjt4w.R.inc(63402);String str = "{\"l_k_assbalv4\":{\"code\":1,\"prompt\":\"\u624b\u673a\"},\"type1\":{\"code\":2,\"prompt\":\"\u7535\u8111\"}}";
		__CLR4_5_21cx11cx1lusyjt4w.R.inc(63403);Model1 model = JSON.parseObject(str, Model1.class);
		__CLR4_5_21cx11cx1lusyjt4w.R.inc(63404);String out = "{\"l_k_assbalv4\":{\"code\":1,\"prompt\":\"\u624b\u673a\"},\"type1\":{\"code\":2,\"prompt\":\"\u7535\u8111\"}}";
		__CLR4_5_21cx11cx1lusyjt4w.R.inc(63405);Assert.assertEquals(out, JSON.toJSONString(model));
	}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

	// \u573a\u666f\uff1a\u4f7f\u7528@JSONField\u7684deserializeUsing = EnumAwareSerializer2.class\u6d4b\u8bd5\u81ea\u5b9a\u4e49\u6d4b\u8bd5\u81ea\u5b9a\u4e49\u53cd\u5e8f\u5316\u5668
	public void test_for_issue3() {__CLR4_5_21cx11cx1lusyjt4w.R.globalSliceStart(getClass().getName(),63406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v68xlw1cxa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cx11cx1lusyjt4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cx11cx1lusyjt4w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2179.test_for_issue3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63406,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v68xlw1cxa(){try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63406);
		// l_k_assbalv4\u5bf9\u5e94Model2\u4e2d\u7684Type\u8d70\u81ea\u5b9a\u4e49\uff0ctype1\u8d70\u9ed8\u8ba4\u679a\u4e3e\u53cd\u5e8f\u5217\u5316
		__CLR4_5_21cx11cx1lusyjt4w.R.inc(63407);String str = "{\"l_k_assbalv4\":{\"code\":1,\"prompt\":\"\u624b\u673a\"},\"type1\":\"Computer\"}";
		__CLR4_5_21cx11cx1lusyjt4w.R.inc(63408);Model2 model = JSON.parseObject(str, Model2.class);
		__CLR4_5_21cx11cx1lusyjt4w.R.inc(63409);String out = "{\"l_k_assbalv4\":{\"code\":1,\"prompt\":\"\u624b\u673a\"},\"type1\":{\"code\":2,\"prompt\":\"\u7535\u8111\"}}";
		__CLR4_5_21cx11cx1lusyjt4w.R.inc(63410);Assert.assertEquals(out, JSON.toJSONString(model));
	}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

	// \u573a\u666f\uff1a\u4f7f\u7528Module
	public void test_for_issue4() {__CLR4_5_21cx11cx1lusyjt4w.R.globalSliceStart(getClass().getName(),63411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yf8wed1cxf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cx11cx1lusyjt4w.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cx11cx1lusyjt4w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2179.test_for_issue4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63411,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yf8wed1cxf(){try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63411);
		__CLR4_5_21cx11cx1lusyjt4w.R.inc(63412);ParserConfig config = new ParserConfig();
		__CLR4_5_21cx11cx1lusyjt4w.R.inc(63413);config.register(new MyModuel());

		__CLR4_5_21cx11cx1lusyjt4w.R.inc(63414);String str = "{\"type\":\"Phone\",\"type1\":\"Computer\"}";
		__CLR4_5_21cx11cx1lusyjt4w.R.inc(63415);Model3 model = JSON.parseObject(str, Model3.class, config);
		__CLR4_5_21cx11cx1lusyjt4w.R.inc(63416);String out = "{\"type\":{\"code\":2,\"prompt\":\"\u7535\u8111\"},\"type1\":{\"code\":1,\"prompt\":\"\u624b\u673a\"}}";
		__CLR4_5_21cx11cx1lusyjt4w.R.inc(63417);Assert.assertEquals(out, JSON.toJSONString(model));
	}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

	interface EnumAware {
		int getCode();

		String getPrompt();
	}

	@JSONType(serializeEnumAsJavaBean = true, deserializer = EnumAwareSerializer1.class)
	public static enum ProductType1 implements EnumAware {
		Phone(1, "\u624b\u673a"), Computer(2, "\u7535\u8111");

		public final int code;
		public final String prompt;

		ProductType1(int code, String prompt) {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63418);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63419);this.code = code;
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63420);this.prompt = prompt;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		@Override
		public int getCode() {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63421);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63422);return this.code;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		@Override
		public String getPrompt() {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63423);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63424);return this.prompt;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		public static ProductType1 get(int code) {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63425);
			boolean __CLB4_5_2_bool0=false;__CLR4_5_21cx11cx1lusyjt4w.R.inc(63426);switch (code) {
			case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_21cx11cx1lusyjt4w.R.inc(63427);__CLB4_5_2_bool0=true;}
				__CLR4_5_21cx11cx1lusyjt4w.R.inc(63428);return Phone;
			case 2:if (!__CLB4_5_2_bool0) {__CLR4_5_21cx11cx1lusyjt4w.R.inc(63429);__CLB4_5_2_bool0=true;}
				__CLR4_5_21cx11cx1lusyjt4w.R.inc(63430);return Computer;
			default:if (!__CLB4_5_2_bool0) {__CLR4_5_21cx11cx1lusyjt4w.R.inc(63431);__CLB4_5_2_bool0=true;}
				__CLR4_5_21cx11cx1lusyjt4w.R.inc(63432);return null;
			}
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}
	}

	public static class Model1 {
		@JSONField(name = "l_k_assbalv4")
		private ProductType1 type;
		private ProductType1 type1;

		public Model1(ProductType1 type, ProductType1 type1) {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63433);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63434);this.type = type;
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63435);this.type1 = type1;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		public ProductType1 getType() {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63436);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63437);return type;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		public void setType(ProductType1 type) {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63438);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63439);this.type = type;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		public ProductType1 getType1() {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63440);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63441);return type1;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		public void setType1(ProductType1 type1) {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63442);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63443);this.type1 = type1;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}
	}

	@JSONType(serializeEnumAsJavaBean = true)
	public static enum ProductType2 implements EnumAware {
		Phone(1, "\u624b\u673a"), Computer(2, "\u7535\u8111");

		public final int code;
		public final String prompt;

		ProductType2(int code, String prompt) {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63444);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63445);this.code = code;
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63446);this.prompt = prompt;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		@Override
		public int getCode() {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63447);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63448);return this.code;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		@Override
		public String getPrompt() {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63449);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63450);return this.prompt;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		public static ProductType2 get(int code) {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63451);
			boolean __CLB4_5_2_bool1=false;__CLR4_5_21cx11cx1lusyjt4w.R.inc(63452);switch (code) {
			case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_21cx11cx1lusyjt4w.R.inc(63453);__CLB4_5_2_bool1=true;}
				__CLR4_5_21cx11cx1lusyjt4w.R.inc(63454);return Phone;
			case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_21cx11cx1lusyjt4w.R.inc(63455);__CLB4_5_2_bool1=true;}
				__CLR4_5_21cx11cx1lusyjt4w.R.inc(63456);return Computer;
			default:if (!__CLB4_5_2_bool1) {__CLR4_5_21cx11cx1lusyjt4w.R.inc(63457);__CLB4_5_2_bool1=true;}
				__CLR4_5_21cx11cx1lusyjt4w.R.inc(63458);return null;
			}
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}
	}

	public static class Model2 {
		@JSONField(name = "l_k_assbalv4", deserializeUsing = EnumAwareSerializer2.class)
		private ProductType2 type;
		private ProductType2 type1;

		public Model2(ProductType2 type, ProductType2 type1) {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63459);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63460);this.type = type;
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63461);this.type1 = type1;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		public ProductType2 getType() {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63462);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63463);return type;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		public void setType(ProductType2 type) {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63464);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63465);this.type = type;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		public ProductType2 getType1() {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63466);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63467);return type1;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		public void setType1(ProductType2 type1) {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63468);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63469);this.type1 = type1;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}
	}

	@JSONType(serializeEnumAsJavaBean = true)
	public static enum ProductType3 implements EnumAware {
		Phone(1, "\u624b\u673a"), Computer(2, "\u7535\u8111");

		public final int code;
		public final String prompt;

		@Override
		public int getCode() {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63470);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63471);return this.code;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		ProductType3(int code, String prompt) {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63472);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63473);this.code = code;
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63474);this.prompt = prompt;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		@Override
		public String getPrompt() {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63475);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63476);return this.prompt;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		public static ProductType3 get(int code) {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63477);
			boolean __CLB4_5_2_bool2=false;__CLR4_5_21cx11cx1lusyjt4w.R.inc(63478);switch (code) {
			case 1:if (!__CLB4_5_2_bool2) {__CLR4_5_21cx11cx1lusyjt4w.R.inc(63479);__CLB4_5_2_bool2=true;}
				__CLR4_5_21cx11cx1lusyjt4w.R.inc(63480);return Phone;
			case 2:if (!__CLB4_5_2_bool2) {__CLR4_5_21cx11cx1lusyjt4w.R.inc(63481);__CLB4_5_2_bool2=true;}
				__CLR4_5_21cx11cx1lusyjt4w.R.inc(63482);return Computer;
			default:if (!__CLB4_5_2_bool2) {__CLR4_5_21cx11cx1lusyjt4w.R.inc(63483);__CLB4_5_2_bool2=true;}
				__CLR4_5_21cx11cx1lusyjt4w.R.inc(63484);return null;
			}
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}
	}

	public static class Model3 {
		private ProductType3 type;
		private ProductType3 type1;

		public Model3(ProductType3 type, ProductType3 type1) {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63485);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63486);this.type = type;
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63487);this.type1 = type1;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		public ProductType3 getType() {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63488);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63489);return type;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		public void setType(ProductType3 type) {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63490);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63491);this.type = type;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		public ProductType3 getType1() {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63492);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63493);return type1;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		public void setType1(ProductType3 type1) {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63494);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63495);this.type1 = type1;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}
	}

	public static class EnumAwareSerializer1 implements ObjectDeserializer {
		@SuppressWarnings("unchecked")
		public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63496);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63497);String val = StringCodec.instance.deserialze(parser, type, fieldName);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63498);System.out.println("-----------------EnumAwareSerializer1.deserialze-----------------------------");
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63499);System.out.println(val);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63500);return (T) ProductType1.get(JSON.parseObject(val).getInteger("code"));
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		@Override
		public int getFastMatchToken() {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63501);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63502);return JSONToken.LITERAL_STRING;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}
	}

	public static class EnumAwareSerializer2 implements ObjectDeserializer {
		@SuppressWarnings("unchecked")
		public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63503);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63504);String val = StringCodec.instance.deserialze(parser, type, fieldName);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63505);System.out.println("-----------------EnumAwareSerializer2.deserialze-----------------------------");
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63506);System.out.println(val);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63507);return (T) ProductType2.get(JSON.parseObject(val).getInteger("code"));
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		@Override
		public int getFastMatchToken() {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63508);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63509);return JSONToken.LITERAL_STRING;
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}
	}

	public static class MyModuel implements Module {

		@SuppressWarnings("rawtypes")
		@Override
		public ObjectDeserializer createDeserializer(ParserConfig config, Class type) {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63510);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63511);return new ObjectDeserializer() {
				@SuppressWarnings("unchecked")
				@Override
				public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63512);
					__CLR4_5_21cx11cx1lusyjt4w.R.inc(63513);String val = StringCodec.instance.deserialze(parser, type, fieldName);
					__CLR4_5_21cx11cx1lusyjt4w.R.inc(63514);System.out.println("-----------MyModuel.deserialze------------------------");
					__CLR4_5_21cx11cx1lusyjt4w.R.inc(63515);System.out.println(val);
					__CLR4_5_21cx11cx1lusyjt4w.R.inc(63516);try {
						__CLR4_5_21cx11cx1lusyjt4w.R.inc(63517);Constructor c = Class.forName(type.getTypeName()).getDeclaredConstructor(ProductType3.class,
								ProductType3.class);
						__CLR4_5_21cx11cx1lusyjt4w.R.inc(63518);return (T) c.newInstance(ProductType3.Computer, ProductType3.Phone);
					} catch (Exception e) {
						__CLR4_5_21cx11cx1lusyjt4w.R.inc(63519);e.printStackTrace();
						__CLR4_5_21cx11cx1lusyjt4w.R.inc(63520);return null;
					}
				}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

				@Override
				public int getFastMatchToken() {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63521);
					__CLR4_5_21cx11cx1lusyjt4w.R.inc(63522);return JSONToken.LITERAL_STRING;
				}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}
			};
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}

		@SuppressWarnings("rawtypes")
		@Override
		public ObjectSerializer createSerializer(SerializeConfig config, Class type) {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63523);
			__CLR4_5_21cx11cx1lusyjt4w.R.inc(63524);return new ObjectSerializer() {
				@Override
				public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType,
						int features) throws IOException {try{__CLR4_5_21cx11cx1lusyjt4w.R.inc(63525);
					__CLR4_5_21cx11cx1lusyjt4w.R.inc(63526);SerializeWriter out = serializer.out;
					__CLR4_5_21cx11cx1lusyjt4w.R.inc(63527);if ((((object == null)&&(__CLR4_5_21cx11cx1lusyjt4w.R.iget(63528)!=0|true))||(__CLR4_5_21cx11cx1lusyjt4w.R.iget(63529)==0&false))) {{
						__CLR4_5_21cx11cx1lusyjt4w.R.inc(63530);out.writeNull();
						__CLR4_5_21cx11cx1lusyjt4w.R.inc(63531);return;
					}
					}__CLR4_5_21cx11cx1lusyjt4w.R.inc(63532);System.err.println("--------------MyModuel.write-------------------------");

					__CLR4_5_21cx11cx1lusyjt4w.R.inc(63533);StringCodec.instance.write(serializer, ((ProductType3) object).name(), fieldName, fieldType,
							features);
				}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}
			};
		}finally{__CLR4_5_21cx11cx1lusyjt4w.R.flushNeeded();}}
	}

}
