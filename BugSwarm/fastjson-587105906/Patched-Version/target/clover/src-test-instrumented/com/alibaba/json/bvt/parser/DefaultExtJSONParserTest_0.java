/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;

public class DefaultExtJSONParserTest_0 extends TestCase {static class __CLR4_5_21gkm1gkmlusvncgm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,68215,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	protected void setUp() throws Exception {try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68134);
	}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

	public void test_0() throws Exception {__CLR4_5_21gkm1gkmlusvncgm.R.globalSliceStart(getClass().getName(),68135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21gkn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gkm1gkmlusvncgm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gkm1gkmlusvncgm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68135,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21gkn() throws Exception{try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68135);
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68136);DefaultJSONParser parser = new DefaultJSONParser("123");
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68137);Assert.assertEquals(new Integer(123), (Integer) parser.parse());

		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68138);parser.config(Feature.IgnoreNotMatch, false);
	}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

	public void test_1() throws Exception {__CLR4_5_21gkm1gkmlusvncgm.R.globalSliceStart(getClass().getName(),68139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1gkr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gkm1gkmlusvncgm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gkm1gkmlusvncgm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68139,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1gkr() throws Exception{try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68139);
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68140);DefaultJSONParser parser = new DefaultJSONParser("[]");
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68141);parser.parseArray(Class.class);
	}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

	public void test_2() throws Exception {__CLR4_5_21gkm1gkmlusvncgm.R.globalSliceStart(getClass().getName(),68142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441gku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gkm1gkmlusvncgm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gkm1gkmlusvncgm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68142,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441gku() throws Exception{try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68142);
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68143);DefaultJSONParser parser = new DefaultJSONParser("{}");
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68144);parser.parseObject(Object.class);
	}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

	public void test_3() throws Exception {__CLR4_5_21gkm1gkmlusvncgm.R.globalSliceStart(getClass().getName(),68145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1gkx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gkm1gkmlusvncgm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gkm1gkmlusvncgm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68145,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1gkx() throws Exception{try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68145);
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68146);DefaultJSONParser parser = new DefaultJSONParser("{}");
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68147);parser.parseObject(User.class);
	}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

	public void test_error_0() throws Exception {__CLR4_5_21gkm1gkmlusvncgm.R.globalSliceStart(getClass().getName(),68148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxv1gl0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gkm1gkmlusvncgm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gkm1gkmlusvncgm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68148,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxv1gl0() throws Exception{try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68148);
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68149);JSONException error = null;
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68150);try {
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68151);DefaultJSONParser parser = new DefaultJSONParser("123");
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68152);parser.parseObject(Class.class);
		} catch (JSONException e) {
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68153);error = e;
		}
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68154);Assert.assertNotNull(error);
	}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

	public void test_error_1() throws Exception {__CLR4_5_21gkm1gkmlusvncgm.R.globalSliceStart(getClass().getName(),68155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1gl7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gkm1gkmlusvncgm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gkm1gkmlusvncgm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68155,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1gl7() throws Exception{try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68155);
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68156);JSONException error = null;
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68157);try {
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68158);DefaultJSONParser parser = new DefaultJSONParser("[{}]");
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68159);parser.parseArray(Class.class);
		} catch (JSONException e) {
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68160);error = e;
		}
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68161);Assert.assertNotNull(error);
	}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

	public void test_error_2() throws Exception {__CLR4_5_21gkm1gkmlusvncgm.R.globalSliceStart(getClass().getName(),68162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1gle();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gkm1gkmlusvncgm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gkm1gkmlusvncgm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68162,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1gle() throws Exception{try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68162);
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68163);JSONException error = null;
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68164);try {
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68165);DefaultJSONParser parser = new DefaultJSONParser(
					"{\"errorValue\":33}");
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68166);parser.parseArray(User.class);
		} catch (JSONException e) {
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68167);error = e;
		}
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68168);Assert.assertNotNull(error);
	}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

	public void test_error_3() throws Exception {__CLR4_5_21gkm1gkmlusvncgm.R.globalSliceStart(getClass().getName(),68169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1gll();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gkm1gkmlusvncgm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gkm1gkmlusvncgm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68169,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1gll() throws Exception{try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68169);
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68170);JSONException error = null;
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68171);try {
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68172);DefaultJSONParser parser = new DefaultJSONParser(
					"{\"age\"33}");
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68173);parser.parseArray(User.class);
		} catch (JSONException e) {
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68174);error = e;
		}
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68175);Assert.assertNotNull(error);
	}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

	public void test_error_4() throws Exception {__CLR4_5_21gkm1gkmlusvncgm.R.globalSliceStart(getClass().getName(),68176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1gls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gkm1gkmlusvncgm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gkm1gkmlusvncgm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68176,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1gls() throws Exception{try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68176);
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68177);JSONException error = null;
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68178);try {
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68179);DefaultJSONParser parser = new DefaultJSONParser(
					"[\"age\":33}");
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68180);parser.parseObject(new User());
		} catch (JSONException e) {
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68181);error = e;
		}
		__CLR4_5_21gkm1gkmlusvncgm.R.inc(68182);Assert.assertNotNull(error);
	}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

	public static class User {

		private String name;
		private int age;
		private BigDecimal salary;
		private Date birthdate;
		private boolean old;

		public boolean isOld() {try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68183);
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68184);return old;
		}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

		public void setOld(boolean old) {try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68185);
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68186);this.old = old;
		}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

		public Date getBirthdate() {try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68187);
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68188);return birthdate;
		}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

		public void setBirthdate(Date birthdate) {try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68189);
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68190);this.birthdate = birthdate;
		}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

		public String getName() {try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68191);
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68192);return name;
		}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

		public void setName(String name) {try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68193);
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68194);this.name = name;
		}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

		public int getAge() {try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68195);
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68196);return age;
		}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

		public void setAge(int age) {try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68197);
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68198);this.age = age;
		}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

		public void setage(int age) {try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68199);
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68200);throw new UnsupportedOperationException();
		}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

		public void set(int age) {try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68201);
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68202);throw new UnsupportedOperationException();
		}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

		public void get(int age) {try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68203);
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68204);throw new UnsupportedOperationException();
		}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

		public void is(int age) {try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68205);
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68206);throw new UnsupportedOperationException();
		}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

		public BigDecimal getSalary() {try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68207);
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68208);return salary;
		}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

		public void setSalary(BigDecimal salary) {try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68209);
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68210);this.salary = salary;
		}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

		public static void setFF() {try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68211);

		}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

		public void setErrorValue(int value) {try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68212);
			__CLR4_5_21gkm1gkmlusvncgm.R.inc(68213);throw new RuntimeException();
		}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}

		void setXX() {try{__CLR4_5_21gkm1gkmlusvncgm.R.inc(68214);

		}finally{__CLR4_5_21gkm1gkmlusvncgm.R.flushNeeded();}}
	}
}
