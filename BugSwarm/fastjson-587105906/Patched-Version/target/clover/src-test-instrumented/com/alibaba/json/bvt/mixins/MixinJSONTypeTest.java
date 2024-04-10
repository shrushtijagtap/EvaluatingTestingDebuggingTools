/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.mixins;

import com.alibaba.fastjson.annotation.JSONPOJOBuilder;
import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class MixinJSONTypeTest extends TestCase {static class __CLR4_5_21et31et3lusyjths{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,65901,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	public void test_1() {__CLR4_5_21et31et3lusyjths.R.globalSliceStart(getClass().getName(),65847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1et3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21et31et3lusyjths.R.rethrow($CLV_t2$);}finally{__CLR4_5_21et31et3lusyjths.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixinJSONTypeTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65847,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1et3(){try{__CLR4_5_21et31et3lusyjths.R.inc(65847);
		__CLR4_5_21et31et3lusyjths.R.inc(65848);User user1 = new User("zhangsan", "male", 19);
		__CLR4_5_21et31et3lusyjths.R.inc(65849);Assert.assertEquals("{\"age\":19,\"sex\":\"male\",\"userName\":\"zhangsan\"}", JSON.toJSONString(user1));

		__CLR4_5_21et31et3lusyjths.R.inc(65850);JSON.addMixInAnnotations(user1.getClass(), Mixin.class);
		__CLR4_5_21et31et3lusyjths.R.inc(65851);Assert.assertEquals("{\"age\":19,\"userName\":\"zhangsan\",\"sex\":\"male\"}", JSON.toJSONString(user1));

		__CLR4_5_21et31et3lusyjths.R.inc(65852);JSON.removeMixInAnnotations(user1.getClass());
	}finally{__CLR4_5_21et31et3lusyjths.R.flushNeeded();}}

	public void test_2() {__CLR4_5_21et31et3lusyjths.R.globalSliceStart(getClass().getName(),65853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441et9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21et31et3lusyjths.R.rethrow($CLV_t2$);}finally{__CLR4_5_21et31et3lusyjths.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixinJSONTypeTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65853,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441et9(){try{__CLR4_5_21et31et3lusyjths.R.inc(65853);
		__CLR4_5_21et31et3lusyjths.R.inc(65854);User user1 = new User("lisi", "male", 20);
		__CLR4_5_21et31et3lusyjths.R.inc(65855);Assert.assertEquals("{\"age\":20,\"sex\":\"male\",\"userName\":\"lisi\"}", JSON.toJSONString(user1));

		__CLR4_5_21et31et3lusyjths.R.inc(65856);JSON.addMixInAnnotations(user1.getClass(), Mixin2.class);
		__CLR4_5_21et31et3lusyjths.R.inc(65857);Assert.assertEquals("{\"userName\":\"lisi\"}", JSON.toJSONString(user1));

		__CLR4_5_21et31et3lusyjths.R.inc(65858);JSON.removeMixInAnnotations(user1.getClass());
	}finally{__CLR4_5_21et31et3lusyjths.R.flushNeeded();}}

	public void test_3() {__CLR4_5_21et31et3lusyjths.R.globalSliceStart(getClass().getName(),65859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1etf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21et31et3lusyjths.R.rethrow($CLV_t2$);}finally{__CLR4_5_21et31et3lusyjths.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixinJSONTypeTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65859,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1etf(){try{__CLR4_5_21et31et3lusyjths.R.inc(65859);
		__CLR4_5_21et31et3lusyjths.R.inc(65860);User user1 = new User("wangwu", "male", 31);
		__CLR4_5_21et31et3lusyjths.R.inc(65861);Assert.assertEquals("{\"age\":31,\"sex\":\"male\",\"userName\":\"wangwu\"}", JSON.toJSONString(user1));

		__CLR4_5_21et31et3lusyjths.R.inc(65862);JSON.addMixInAnnotations(user1.getClass(), Mixin3.class);
		__CLR4_5_21et31et3lusyjths.R.inc(65863);Assert.assertEquals("{\"age\":31,\"sex\":\"male\"}", JSON.toJSONString(user1));

		__CLR4_5_21et31et3lusyjths.R.inc(65864);JSON.removeMixInAnnotations(user1.getClass());
	}finally{__CLR4_5_21et31et3lusyjths.R.flushNeeded();}}

	public void test_4() throws Exception {__CLR4_5_21et31et3lusyjths.R.globalSliceStart(getClass().getName(),65865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61etl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21et31et3lusyjths.R.rethrow($CLV_t2$);}finally{__CLR4_5_21et31et3lusyjths.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixinJSONTypeTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65865,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61etl() throws Exception{try{__CLR4_5_21et31et3lusyjths.R.inc(65865);
		__CLR4_5_21et31et3lusyjths.R.inc(65866);JSON.addMixInAnnotations(VO.class, Mixin5.class);
		__CLR4_5_21et31et3lusyjths.R.inc(65867);JSON.addMixInAnnotations(VOBuilder.class, Mixin6.class);

		__CLR4_5_21et31et3lusyjths.R.inc(65868);VO vo = JSON.parseObject("{\"id\":12304,\"name\":\"ljw\"}", VO.class);

		__CLR4_5_21et31et3lusyjths.R.inc(65869);Assert.assertEquals(12304, vo.getId());
		__CLR4_5_21et31et3lusyjths.R.inc(65870);Assert.assertEquals("ljw", vo.getName());

		__CLR4_5_21et31et3lusyjths.R.inc(65871);JSON.removeMixInAnnotations(VO.class);
		__CLR4_5_21et31et3lusyjths.R.inc(65872);JSON.removeMixInAnnotations(VOBuilder.class);
	}finally{__CLR4_5_21et31et3lusyjths.R.flushNeeded();}}

	@JSONType(serialzeFeatures = { SerializerFeature.QuoteFieldNames })
	public class User {
		private String userName;
		private String sex;
		private int age;

		public User(String userName, String sex, int age) {try{__CLR4_5_21et31et3lusyjths.R.inc(65873);
			__CLR4_5_21et31et3lusyjths.R.inc(65874);this.userName = userName;
			__CLR4_5_21et31et3lusyjths.R.inc(65875);this.sex = sex;
			__CLR4_5_21et31et3lusyjths.R.inc(65876);this.age = age;
		}finally{__CLR4_5_21et31et3lusyjths.R.flushNeeded();}}

		public String getUserName() {try{__CLR4_5_21et31et3lusyjths.R.inc(65877);
			__CLR4_5_21et31et3lusyjths.R.inc(65878);return userName;
		}finally{__CLR4_5_21et31et3lusyjths.R.flushNeeded();}}

		public void setUserName(String userName) {try{__CLR4_5_21et31et3lusyjths.R.inc(65879);
			__CLR4_5_21et31et3lusyjths.R.inc(65880);this.userName = userName;
		}finally{__CLR4_5_21et31et3lusyjths.R.flushNeeded();}}

		public String getSex() {try{__CLR4_5_21et31et3lusyjths.R.inc(65881);
			__CLR4_5_21et31et3lusyjths.R.inc(65882);return sex;
		}finally{__CLR4_5_21et31et3lusyjths.R.flushNeeded();}}

		public void setSex(String sex) {try{__CLR4_5_21et31et3lusyjths.R.inc(65883);
			__CLR4_5_21et31et3lusyjths.R.inc(65884);this.sex = sex;
		}finally{__CLR4_5_21et31et3lusyjths.R.flushNeeded();}}

		public int getAge() {try{__CLR4_5_21et31et3lusyjths.R.inc(65885);
			__CLR4_5_21et31et3lusyjths.R.inc(65886);return age;
		}finally{__CLR4_5_21et31et3lusyjths.R.flushNeeded();}}

		public void setAge(int age) {try{__CLR4_5_21et31et3lusyjths.R.inc(65887);
			__CLR4_5_21et31et3lusyjths.R.inc(65888);this.age = age;
		}finally{__CLR4_5_21et31et3lusyjths.R.flushNeeded();}}

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

		public int getId() {try{__CLR4_5_21et31et3lusyjths.R.inc(65889);
			__CLR4_5_21et31et3lusyjths.R.inc(65890);return id;
		}finally{__CLR4_5_21et31et3lusyjths.R.flushNeeded();}}

		public String getName() {try{__CLR4_5_21et31et3lusyjths.R.inc(65891);
			__CLR4_5_21et31et3lusyjths.R.inc(65892);return name;
		}finally{__CLR4_5_21et31et3lusyjths.R.flushNeeded();}}
	}

	private static class VOBuilder {

		private VO vo = new VO();

		public VO xxx() {try{__CLR4_5_21et31et3lusyjths.R.inc(65893);
			__CLR4_5_21et31et3lusyjths.R.inc(65894);return vo;
		}finally{__CLR4_5_21et31et3lusyjths.R.flushNeeded();}}

		public VOBuilder withId(int id) {try{__CLR4_5_21et31et3lusyjths.R.inc(65895);
			__CLR4_5_21et31et3lusyjths.R.inc(65896);vo.id = id;
			__CLR4_5_21et31et3lusyjths.R.inc(65897);return this;
		}finally{__CLR4_5_21et31et3lusyjths.R.flushNeeded();}}

		public VOBuilder withName(String name) {try{__CLR4_5_21et31et3lusyjths.R.inc(65898);
			__CLR4_5_21et31et3lusyjths.R.inc(65899);vo.name = name;
			__CLR4_5_21et31et3lusyjths.R.inc(65900);return this;
		}finally{__CLR4_5_21et31et3lusyjths.R.flushNeeded();}}
	}

	@JSONType(builder= VOBuilder.class)
	class Mixin5{ }
	@JSONPOJOBuilder(buildMethod="xxx")
	class Mixin6{ }
}
