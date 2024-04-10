/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.mixins;

import com.alibaba.fastjson.annotation.JSONPOJOBuilder;
import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class MixinJSONTypeTest extends TestCase {static class __CLR4_1_101frm1frmluszwc2u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,67144,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	public void test_1() {__CLR4_1_101frm1frmluszwc2u.R.globalSliceStart(getClass().getName(),67090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1frm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101frm1frmluszwc2u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101frm1frmluszwc2u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixinJSONTypeTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67090,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1frm(){try{__CLR4_1_101frm1frmluszwc2u.R.inc(67090);
		__CLR4_1_101frm1frmluszwc2u.R.inc(67091);User user1 = new User("zhangsan", "male", 19);
		__CLR4_1_101frm1frmluszwc2u.R.inc(67092);Assert.assertEquals("{\"age\":19,\"sex\":\"male\",\"userName\":\"zhangsan\"}", JSON.toJSONString(user1));

		__CLR4_1_101frm1frmluszwc2u.R.inc(67093);JSON.addMixInAnnotations(user1.getClass(), Mixin.class);
		__CLR4_1_101frm1frmluszwc2u.R.inc(67094);Assert.assertEquals("{\"age\":19,\"userName\":\"zhangsan\",\"sex\":\"male\"}", JSON.toJSONString(user1));

		__CLR4_1_101frm1frmluszwc2u.R.inc(67095);JSON.removeMixInAnnotations(user1.getClass());
	}finally{__CLR4_1_101frm1frmluszwc2u.R.flushNeeded();}}

	public void test_2() {__CLR4_1_101frm1frmluszwc2u.R.globalSliceStart(getClass().getName(),67096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441frs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101frm1frmluszwc2u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101frm1frmluszwc2u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixinJSONTypeTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67096,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441frs(){try{__CLR4_1_101frm1frmluszwc2u.R.inc(67096);
		__CLR4_1_101frm1frmluszwc2u.R.inc(67097);User user1 = new User("lisi", "male", 20);
		__CLR4_1_101frm1frmluszwc2u.R.inc(67098);Assert.assertEquals("{\"age\":20,\"sex\":\"male\",\"userName\":\"lisi\"}", JSON.toJSONString(user1));

		__CLR4_1_101frm1frmluszwc2u.R.inc(67099);JSON.addMixInAnnotations(user1.getClass(), Mixin2.class);
		__CLR4_1_101frm1frmluszwc2u.R.inc(67100);Assert.assertEquals("{\"userName\":\"lisi\"}", JSON.toJSONString(user1));

		__CLR4_1_101frm1frmluszwc2u.R.inc(67101);JSON.removeMixInAnnotations(user1.getClass());
	}finally{__CLR4_1_101frm1frmluszwc2u.R.flushNeeded();}}

	public void test_3() {__CLR4_1_101frm1frmluszwc2u.R.globalSliceStart(getClass().getName(),67102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1fry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101frm1frmluszwc2u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101frm1frmluszwc2u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixinJSONTypeTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67102,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1fry(){try{__CLR4_1_101frm1frmluszwc2u.R.inc(67102);
		__CLR4_1_101frm1frmluszwc2u.R.inc(67103);User user1 = new User("wangwu", "male", 31);
		__CLR4_1_101frm1frmluszwc2u.R.inc(67104);Assert.assertEquals("{\"age\":31,\"sex\":\"male\",\"userName\":\"wangwu\"}", JSON.toJSONString(user1));

		__CLR4_1_101frm1frmluszwc2u.R.inc(67105);JSON.addMixInAnnotations(user1.getClass(), Mixin3.class);
		__CLR4_1_101frm1frmluszwc2u.R.inc(67106);Assert.assertEquals("{\"age\":31,\"sex\":\"male\"}", JSON.toJSONString(user1));

		__CLR4_1_101frm1frmluszwc2u.R.inc(67107);JSON.removeMixInAnnotations(user1.getClass());
	}finally{__CLR4_1_101frm1frmluszwc2u.R.flushNeeded();}}

	public void test_4() throws Exception {__CLR4_1_101frm1frmluszwc2u.R.globalSliceStart(getClass().getName(),67108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61fs4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101frm1frmluszwc2u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101frm1frmluszwc2u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixinJSONTypeTest.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67108,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61fs4() throws Exception{try{__CLR4_1_101frm1frmluszwc2u.R.inc(67108);
		__CLR4_1_101frm1frmluszwc2u.R.inc(67109);JSON.addMixInAnnotations(VO.class, Mixin5.class);
		__CLR4_1_101frm1frmluszwc2u.R.inc(67110);JSON.addMixInAnnotations(VOBuilder.class, Mixin6.class);

		__CLR4_1_101frm1frmluszwc2u.R.inc(67111);VO vo = JSON.parseObject("{\"id\":12304,\"name\":\"ljw\"}", VO.class);

		__CLR4_1_101frm1frmluszwc2u.R.inc(67112);Assert.assertEquals(12304, vo.getId());
		__CLR4_1_101frm1frmluszwc2u.R.inc(67113);Assert.assertEquals("ljw", vo.getName());

		__CLR4_1_101frm1frmluszwc2u.R.inc(67114);JSON.removeMixInAnnotations(VO.class);
		__CLR4_1_101frm1frmluszwc2u.R.inc(67115);JSON.removeMixInAnnotations(VOBuilder.class);
	}finally{__CLR4_1_101frm1frmluszwc2u.R.flushNeeded();}}

	@JSONType(serialzeFeatures = { SerializerFeature.QuoteFieldNames })
	public class User {
		private String userName;
		private String sex;
		private int age;

		public User(String userName, String sex, int age) {try{__CLR4_1_101frm1frmluszwc2u.R.inc(67116);
			__CLR4_1_101frm1frmluszwc2u.R.inc(67117);this.userName = userName;
			__CLR4_1_101frm1frmluszwc2u.R.inc(67118);this.sex = sex;
			__CLR4_1_101frm1frmluszwc2u.R.inc(67119);this.age = age;
		}finally{__CLR4_1_101frm1frmluszwc2u.R.flushNeeded();}}

		public String getUserName() {try{__CLR4_1_101frm1frmluszwc2u.R.inc(67120);
			__CLR4_1_101frm1frmluszwc2u.R.inc(67121);return userName;
		}finally{__CLR4_1_101frm1frmluszwc2u.R.flushNeeded();}}

		public void setUserName(String userName) {try{__CLR4_1_101frm1frmluszwc2u.R.inc(67122);
			__CLR4_1_101frm1frmluszwc2u.R.inc(67123);this.userName = userName;
		}finally{__CLR4_1_101frm1frmluszwc2u.R.flushNeeded();}}

		public String getSex() {try{__CLR4_1_101frm1frmluszwc2u.R.inc(67124);
			__CLR4_1_101frm1frmluszwc2u.R.inc(67125);return sex;
		}finally{__CLR4_1_101frm1frmluszwc2u.R.flushNeeded();}}

		public void setSex(String sex) {try{__CLR4_1_101frm1frmluszwc2u.R.inc(67126);
			__CLR4_1_101frm1frmluszwc2u.R.inc(67127);this.sex = sex;
		}finally{__CLR4_1_101frm1frmluszwc2u.R.flushNeeded();}}

		public int getAge() {try{__CLR4_1_101frm1frmluszwc2u.R.inc(67128);
			__CLR4_1_101frm1frmluszwc2u.R.inc(67129);return age;
		}finally{__CLR4_1_101frm1frmluszwc2u.R.flushNeeded();}}

		public void setAge(int age) {try{__CLR4_1_101frm1frmluszwc2u.R.inc(67130);
			__CLR4_1_101frm1frmluszwc2u.R.inc(67131);this.age = age;
		}finally{__CLR4_1_101frm1frmluszwc2u.R.flushNeeded();}}

	}

	@JSONType(orders = { "age", "userName", "sex" })
	interface Mixin {
	}

	@JSONType(includes = { "userName" })
	interface Mixin2 {
	}

	@JSONType(ignores = { "userName" })
	interface Mixin3 {
	}

	@JSONType(serialzeFeatures = { SerializerFeature.PrettyFormat })
	interface Mixin4 {
	}

	public static class VO {
		private int id;
		private String name;

		public int getId() {try{__CLR4_1_101frm1frmluszwc2u.R.inc(67132);
			__CLR4_1_101frm1frmluszwc2u.R.inc(67133);return id;
		}finally{__CLR4_1_101frm1frmluszwc2u.R.flushNeeded();}}

		public String getName() {try{__CLR4_1_101frm1frmluszwc2u.R.inc(67134);
			__CLR4_1_101frm1frmluszwc2u.R.inc(67135);return name;
		}finally{__CLR4_1_101frm1frmluszwc2u.R.flushNeeded();}}
	}

	private static class VOBuilder {

		private VO vo = new VO();

		public VO xxx() {try{__CLR4_1_101frm1frmluszwc2u.R.inc(67136);
			__CLR4_1_101frm1frmluszwc2u.R.inc(67137);return vo;
		}finally{__CLR4_1_101frm1frmluszwc2u.R.flushNeeded();}}

		public VOBuilder withId(int id) {try{__CLR4_1_101frm1frmluszwc2u.R.inc(67138);
			__CLR4_1_101frm1frmluszwc2u.R.inc(67139);vo.id = id;
			__CLR4_1_101frm1frmluszwc2u.R.inc(67140);return this;
		}finally{__CLR4_1_101frm1frmluszwc2u.R.flushNeeded();}}

		public VOBuilder withName(String name) {try{__CLR4_1_101frm1frmluszwc2u.R.inc(67141);
			__CLR4_1_101frm1frmluszwc2u.R.inc(67142);vo.name = name;
			__CLR4_1_101frm1frmluszwc2u.R.inc(67143);return this;
		}finally{__CLR4_1_101frm1frmluszwc2u.R.flushNeeded();}}
	}

	@JSONType(builder= VOBuilder.class)
	class Mixin5{ }
	@JSONPOJOBuilder(buildMethod="xxx")
	class Mixin6{ }
}
