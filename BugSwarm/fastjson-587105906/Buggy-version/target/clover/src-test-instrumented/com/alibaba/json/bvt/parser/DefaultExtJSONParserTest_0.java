/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;

public class DefaultExtJSONParserTest_0 extends TestCase {static class __CLR4_1_101gkx1gkxluszwca9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,68226,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	protected void setUp() throws Exception {try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68145);
	}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

	public void test_0() throws Exception {__CLR4_1_101gkx1gkxluszwca9.R.globalSliceStart(getClass().getName(),68146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21gky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gkx1gkxluszwca9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gkx1gkxluszwca9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68146,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21gky() throws Exception{try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68146);
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68147);DefaultJSONParser parser = new DefaultJSONParser("123");
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68148);Assert.assertEquals(new Integer(123), (Integer) parser.parse());

		__CLR4_1_101gkx1gkxluszwca9.R.inc(68149);parser.config(Feature.IgnoreNotMatch, false);
	}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

	public void test_1() throws Exception {__CLR4_1_101gkx1gkxluszwca9.R.globalSliceStart(getClass().getName(),68150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1gl2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gkx1gkxluszwca9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gkx1gkxluszwca9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68150,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1gl2() throws Exception{try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68150);
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68151);DefaultJSONParser parser = new DefaultJSONParser("[]");
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68152);parser.parseArray(Class.class);
	}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

	public void test_2() throws Exception {__CLR4_1_101gkx1gkxluszwca9.R.globalSliceStart(getClass().getName(),68153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441gl5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gkx1gkxluszwca9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gkx1gkxluszwca9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68153,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441gl5() throws Exception{try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68153);
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68154);DefaultJSONParser parser = new DefaultJSONParser("{}");
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68155);parser.parseObject(Object.class);
	}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

	public void test_3() throws Exception {__CLR4_1_101gkx1gkxluszwca9.R.globalSliceStart(getClass().getName(),68156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1gl8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gkx1gkxluszwca9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gkx1gkxluszwca9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68156,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1gl8() throws Exception{try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68156);
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68157);DefaultJSONParser parser = new DefaultJSONParser("{}");
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68158);parser.parseObject(User.class);
	}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

	public void test_error_0() throws Exception {__CLR4_1_101gkx1gkxluszwca9.R.globalSliceStart(getClass().getName(),68159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1glb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gkx1gkxluszwca9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gkx1gkxluszwca9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68159,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1glb() throws Exception{try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68159);
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68160);JSONException error = null;
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68161);try {
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68162);DefaultJSONParser parser = new DefaultJSONParser("123");
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68163);parser.parseObject(Class.class);
		} catch (JSONException e) {
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68164);error = e;
		}
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68165);Assert.assertNotNull(error);
	}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

	public void test_error_1() throws Exception {__CLR4_1_101gkx1gkxluszwca9.R.globalSliceStart(getClass().getName(),68166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1gli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gkx1gkxluszwca9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gkx1gkxluszwca9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68166,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1gli() throws Exception{try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68166);
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68167);JSONException error = null;
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68168);try {
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68169);DefaultJSONParser parser = new DefaultJSONParser("[{}]");
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68170);parser.parseArray(Class.class);
		} catch (JSONException e) {
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68171);error = e;
		}
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68172);Assert.assertNotNull(error);
	}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

	public void test_error_2() throws Exception {__CLR4_1_101gkx1gkxluszwca9.R.globalSliceStart(getClass().getName(),68173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1glp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gkx1gkxluszwca9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gkx1gkxluszwca9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68173,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1glp() throws Exception{try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68173);
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68174);JSONException error = null;
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68175);try {
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68176);DefaultJSONParser parser = new DefaultJSONParser(
					"{\"errorValue\":33}");
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68177);parser.parseArray(User.class);
		} catch (JSONException e) {
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68178);error = e;
		}
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68179);Assert.assertNotNull(error);
	}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

	public void test_error_3() throws Exception {__CLR4_1_101gkx1gkxluszwca9.R.globalSliceStart(getClass().getName(),68180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1glw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gkx1gkxluszwca9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gkx1gkxluszwca9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68180,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1glw() throws Exception{try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68180);
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68181);JSONException error = null;
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68182);try {
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68183);DefaultJSONParser parser = new DefaultJSONParser(
					"{\"age\"33}");
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68184);parser.parseArray(User.class);
		} catch (JSONException e) {
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68185);error = e;
		}
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68186);Assert.assertNotNull(error);
	}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

	public void test_error_4() throws Exception {__CLR4_1_101gkx1gkxluszwca9.R.globalSliceStart(getClass().getName(),68187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1gm3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gkx1gkxluszwca9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gkx1gkxluszwca9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68187,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1gm3() throws Exception{try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68187);
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68188);JSONException error = null;
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68189);try {
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68190);DefaultJSONParser parser = new DefaultJSONParser(
					"[\"age\":33}");
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68191);parser.parseObject(new User());
		} catch (JSONException e) {
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68192);error = e;
		}
		__CLR4_1_101gkx1gkxluszwca9.R.inc(68193);Assert.assertNotNull(error);
	}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

	public static class User {

		private String name;
		private int age;
		private BigDecimal salary;
		private Date birthdate;
		private boolean old;

		public boolean isOld() {try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68194);
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68195);return old;
		}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

		public void setOld(boolean old) {try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68196);
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68197);this.old = old;
		}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

		public Date getBirthdate() {try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68198);
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68199);return birthdate;
		}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

		public void setBirthdate(Date birthdate) {try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68200);
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68201);this.birthdate = birthdate;
		}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

		public String getName() {try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68202);
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68203);return name;
		}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

		public void setName(String name) {try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68204);
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68205);this.name = name;
		}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

		public int getAge() {try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68206);
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68207);return age;
		}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

		public void setAge(int age) {try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68208);
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68209);this.age = age;
		}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

		public void setage(int age) {try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68210);
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68211);throw new UnsupportedOperationException();
		}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

		public void set(int age) {try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68212);
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68213);throw new UnsupportedOperationException();
		}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

		public void get(int age) {try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68214);
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68215);throw new UnsupportedOperationException();
		}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

		public void is(int age) {try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68216);
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68217);throw new UnsupportedOperationException();
		}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

		public BigDecimal getSalary() {try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68218);
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68219);return salary;
		}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

		public void setSalary(BigDecimal salary) {try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68220);
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68221);this.salary = salary;
		}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

		public static void setFF() {try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68222);

		}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

		public void setErrorValue(int value) {try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68223);
			__CLR4_1_101gkx1gkxluszwca9.R.inc(68224);throw new RuntimeException();
		}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}

		void setXX() {try{__CLR4_1_101gkx1gkxluszwca9.R.inc(68225);

		}finally{__CLR4_1_101gkx1gkxluszwca9.R.flushNeeded();}}
	}
}
