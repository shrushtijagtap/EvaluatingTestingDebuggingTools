/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.mixins;

import com.alibaba.fastjson.annotation.JSONPOJOBuilder;
import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class MixinJSONTypeTest extends TestCase {static class __CLR4_5_21frb1frblusvnc83{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,67133,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	public void test_1() {__CLR4_5_21frb1frblusvnc83.R.globalSliceStart(getClass().getName(),67079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1frb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21frb1frblusvnc83.R.rethrow($CLV_t2$);}finally{__CLR4_5_21frb1frblusvnc83.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixinJSONTypeTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67079,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1frb(){try{__CLR4_5_21frb1frblusvnc83.R.inc(67079);
		__CLR4_5_21frb1frblusvnc83.R.inc(67080);User user1 = new User("zhangsan", "male", 19);
		__CLR4_5_21frb1frblusvnc83.R.inc(67081);Assert.assertEquals("{\"age\":19,\"sex\":\"male\",\"userName\":\"zhangsan\"}", JSON.toJSONString(user1));

		__CLR4_5_21frb1frblusvnc83.R.inc(67082);JSON.addMixInAnnotations(user1.getClass(), Mixin.class);
		__CLR4_5_21frb1frblusvnc83.R.inc(67083);Assert.assertEquals("{\"age\":19,\"userName\":\"zhangsan\",\"sex\":\"male\"}", JSON.toJSONString(user1));

		__CLR4_5_21frb1frblusvnc83.R.inc(67084);JSON.removeMixInAnnotations(user1.getClass());
	}finally{__CLR4_5_21frb1frblusvnc83.R.flushNeeded();}}

	public void test_2() {__CLR4_5_21frb1frblusvnc83.R.globalSliceStart(getClass().getName(),67085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441frh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21frb1frblusvnc83.R.rethrow($CLV_t2$);}finally{__CLR4_5_21frb1frblusvnc83.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixinJSONTypeTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67085,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441frh(){try{__CLR4_5_21frb1frblusvnc83.R.inc(67085);
		__CLR4_5_21frb1frblusvnc83.R.inc(67086);User user1 = new User("lisi", "male", 20);
		__CLR4_5_21frb1frblusvnc83.R.inc(67087);Assert.assertEquals("{\"age\":20,\"sex\":\"male\",\"userName\":\"lisi\"}", JSON.toJSONString(user1));

		__CLR4_5_21frb1frblusvnc83.R.inc(67088);JSON.addMixInAnnotations(user1.getClass(), Mixin2.class);
		__CLR4_5_21frb1frblusvnc83.R.inc(67089);Assert.assertEquals("{\"userName\":\"lisi\"}", JSON.toJSONString(user1));

		__CLR4_5_21frb1frblusvnc83.R.inc(67090);JSON.removeMixInAnnotations(user1.getClass());
	}finally{__CLR4_5_21frb1frblusvnc83.R.flushNeeded();}}

	public void test_3() {__CLR4_5_21frb1frblusvnc83.R.globalSliceStart(getClass().getName(),67091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1frn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21frb1frblusvnc83.R.rethrow($CLV_t2$);}finally{__CLR4_5_21frb1frblusvnc83.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixinJSONTypeTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67091,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1frn(){try{__CLR4_5_21frb1frblusvnc83.R.inc(67091);
		__CLR4_5_21frb1frblusvnc83.R.inc(67092);User user1 = new User("wangwu", "male", 31);
		__CLR4_5_21frb1frblusvnc83.R.inc(67093);Assert.assertEquals("{\"age\":31,\"sex\":\"male\",\"userName\":\"wangwu\"}", JSON.toJSONString(user1));

		__CLR4_5_21frb1frblusvnc83.R.inc(67094);JSON.addMixInAnnotations(user1.getClass(), Mixin3.class);
		__CLR4_5_21frb1frblusvnc83.R.inc(67095);Assert.assertEquals("{\"age\":31,\"sex\":\"male\"}", JSON.toJSONString(user1));

		__CLR4_5_21frb1frblusvnc83.R.inc(67096);JSON.removeMixInAnnotations(user1.getClass());
	}finally{__CLR4_5_21frb1frblusvnc83.R.flushNeeded();}}

	public void test_4() throws Exception {__CLR4_5_21frb1frblusvnc83.R.globalSliceStart(getClass().getName(),67097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61frt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21frb1frblusvnc83.R.rethrow($CLV_t2$);}finally{__CLR4_5_21frb1frblusvnc83.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixinJSONTypeTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67097,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61frt() throws Exception{try{__CLR4_5_21frb1frblusvnc83.R.inc(67097);
		__CLR4_5_21frb1frblusvnc83.R.inc(67098);JSON.addMixInAnnotations(VO.class, Mixin5.class);
		__CLR4_5_21frb1frblusvnc83.R.inc(67099);JSON.addMixInAnnotations(VOBuilder.class, Mixin6.class);

		__CLR4_5_21frb1frblusvnc83.R.inc(67100);VO vo = JSON.parseObject("{\"id\":12304,\"name\":\"ljw\"}", VO.class);

		__CLR4_5_21frb1frblusvnc83.R.inc(67101);Assert.assertEquals(12304, vo.getId());
		__CLR4_5_21frb1frblusvnc83.R.inc(67102);Assert.assertEquals("ljw", vo.getName());

		__CLR4_5_21frb1frblusvnc83.R.inc(67103);JSON.removeMixInAnnotations(VO.class);
		__CLR4_5_21frb1frblusvnc83.R.inc(67104);JSON.removeMixInAnnotations(VOBuilder.class);
	}finally{__CLR4_5_21frb1frblusvnc83.R.flushNeeded();}}

	@JSONType(serialzeFeatures = { SerializerFeature.QuoteFieldNames })
	public class User {
		private String userName;
		private String sex;
		private int age;

		public User(String userName, String sex, int age) {try{__CLR4_5_21frb1frblusvnc83.R.inc(67105);
			__CLR4_5_21frb1frblusvnc83.R.inc(67106);this.userName = userName;
			__CLR4_5_21frb1frblusvnc83.R.inc(67107);this.sex = sex;
			__CLR4_5_21frb1frblusvnc83.R.inc(67108);this.age = age;
		}finally{__CLR4_5_21frb1frblusvnc83.R.flushNeeded();}}

		public String getUserName() {try{__CLR4_5_21frb1frblusvnc83.R.inc(67109);
			__CLR4_5_21frb1frblusvnc83.R.inc(67110);return userName;
		}finally{__CLR4_5_21frb1frblusvnc83.R.flushNeeded();}}

		public void setUserName(String userName) {try{__CLR4_5_21frb1frblusvnc83.R.inc(67111);
			__CLR4_5_21frb1frblusvnc83.R.inc(67112);this.userName = userName;
		}finally{__CLR4_5_21frb1frblusvnc83.R.flushNeeded();}}

		public String getSex() {try{__CLR4_5_21frb1frblusvnc83.R.inc(67113);
			__CLR4_5_21frb1frblusvnc83.R.inc(67114);return sex;
		}finally{__CLR4_5_21frb1frblusvnc83.R.flushNeeded();}}

		public void setSex(String sex) {try{__CLR4_5_21frb1frblusvnc83.R.inc(67115);
			__CLR4_5_21frb1frblusvnc83.R.inc(67116);this.sex = sex;
		}finally{__CLR4_5_21frb1frblusvnc83.R.flushNeeded();}}

		public int getAge() {try{__CLR4_5_21frb1frblusvnc83.R.inc(67117);
			__CLR4_5_21frb1frblusvnc83.R.inc(67118);return age;
		}finally{__CLR4_5_21frb1frblusvnc83.R.flushNeeded();}}

		public void setAge(int age) {try{__CLR4_5_21frb1frblusvnc83.R.inc(67119);
			__CLR4_5_21frb1frblusvnc83.R.inc(67120);this.age = age;
		}finally{__CLR4_5_21frb1frblusvnc83.R.flushNeeded();}}

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

		public int getId() {try{__CLR4_5_21frb1frblusvnc83.R.inc(67121);
			__CLR4_5_21frb1frblusvnc83.R.inc(67122);return id;
		}finally{__CLR4_5_21frb1frblusvnc83.R.flushNeeded();}}

		public String getName() {try{__CLR4_5_21frb1frblusvnc83.R.inc(67123);
			__CLR4_5_21frb1frblusvnc83.R.inc(67124);return name;
		}finally{__CLR4_5_21frb1frblusvnc83.R.flushNeeded();}}
	}

	private static class VOBuilder {

		private VO vo = new VO();

		public VO xxx() {try{__CLR4_5_21frb1frblusvnc83.R.inc(67125);
			__CLR4_5_21frb1frblusvnc83.R.inc(67126);return vo;
		}finally{__CLR4_5_21frb1frblusvnc83.R.flushNeeded();}}

		public VOBuilder withId(int id) {try{__CLR4_5_21frb1frblusvnc83.R.inc(67127);
			__CLR4_5_21frb1frblusvnc83.R.inc(67128);vo.id = id;
			__CLR4_5_21frb1frblusvnc83.R.inc(67129);return this;
		}finally{__CLR4_5_21frb1frblusvnc83.R.flushNeeded();}}

		public VOBuilder withName(String name) {try{__CLR4_5_21frb1frblusvnc83.R.inc(67130);
			__CLR4_5_21frb1frblusvnc83.R.inc(67131);vo.name = name;
			__CLR4_5_21frb1frblusvnc83.R.inc(67132);return this;
		}finally{__CLR4_5_21frb1frblusvnc83.R.flushNeeded();}}
	}

	@JSONType(builder= VOBuilder.class)
	class Mixin5{ }
	@JSONPOJOBuilder(buildMethod="xxx")
	class Mixin6{ }
}
