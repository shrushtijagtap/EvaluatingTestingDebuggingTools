/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;

public class DefaultExtJSONParserTest_0 extends TestCase {static class __CLR4_1_101fmp1fmplusqkd0b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,66994,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	protected void setUp() throws Exception {try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66913);
	}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

	public void test_0() throws Exception {__CLR4_1_101fmp1fmplusqkd0b.R.globalSliceStart(getClass().getName(),66914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21fmq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fmp1fmplusqkd0b.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fmp1fmplusqkd0b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66914,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21fmq() throws Exception{try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66914);
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66915);DefaultJSONParser parser = new DefaultJSONParser("123");
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66916);Assert.assertEquals(new Integer(123), (Integer) parser.parse());

		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66917);parser.config(Feature.IgnoreNotMatch, false);
	}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

	public void test_1() throws Exception {__CLR4_1_101fmp1fmplusqkd0b.R.globalSliceStart(getClass().getName(),66918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1fmu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fmp1fmplusqkd0b.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fmp1fmplusqkd0b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66918,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1fmu() throws Exception{try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66918);
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66919);DefaultJSONParser parser = new DefaultJSONParser("[]");
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66920);parser.parseArray(Class.class);
	}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

	public void test_2() throws Exception {__CLR4_1_101fmp1fmplusqkd0b.R.globalSliceStart(getClass().getName(),66921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441fmx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fmp1fmplusqkd0b.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fmp1fmplusqkd0b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66921,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441fmx() throws Exception{try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66921);
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66922);DefaultJSONParser parser = new DefaultJSONParser("{}");
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66923);parser.parseObject(Object.class);
	}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

	public void test_3() throws Exception {__CLR4_1_101fmp1fmplusqkd0b.R.globalSliceStart(getClass().getName(),66924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1fn0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fmp1fmplusqkd0b.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fmp1fmplusqkd0b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66924,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1fn0() throws Exception{try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66924);
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66925);DefaultJSONParser parser = new DefaultJSONParser("{}");
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66926);parser.parseObject(User.class);
	}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

	public void test_error_0() throws Exception {__CLR4_1_101fmp1fmplusqkd0b.R.globalSliceStart(getClass().getName(),66927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1fn3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fmp1fmplusqkd0b.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fmp1fmplusqkd0b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66927,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1fn3() throws Exception{try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66927);
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66928);JSONException error = null;
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66929);try {
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66930);DefaultJSONParser parser = new DefaultJSONParser("123");
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66931);parser.parseObject(Class.class);
		} catch (JSONException e) {
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66932);error = e;
		}
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66933);Assert.assertNotNull(error);
	}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

	public void test_error_1() throws Exception {__CLR4_1_101fmp1fmplusqkd0b.R.globalSliceStart(getClass().getName(),66934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1fna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fmp1fmplusqkd0b.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fmp1fmplusqkd0b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66934,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1fna() throws Exception{try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66934);
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66935);JSONException error = null;
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66936);try {
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66937);DefaultJSONParser parser = new DefaultJSONParser("[{}]");
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66938);parser.parseArray(Class.class);
		} catch (JSONException e) {
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66939);error = e;
		}
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66940);Assert.assertNotNull(error);
	}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

	public void test_error_2() throws Exception {__CLR4_1_101fmp1fmplusqkd0b.R.globalSliceStart(getClass().getName(),66941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1fnh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fmp1fmplusqkd0b.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fmp1fmplusqkd0b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66941,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1fnh() throws Exception{try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66941);
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66942);JSONException error = null;
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66943);try {
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66944);DefaultJSONParser parser = new DefaultJSONParser(
					"{\"errorValue\":33}");
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66945);parser.parseArray(User.class);
		} catch (JSONException e) {
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66946);error = e;
		}
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66947);Assert.assertNotNull(error);
	}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

	public void test_error_3() throws Exception {__CLR4_1_101fmp1fmplusqkd0b.R.globalSliceStart(getClass().getName(),66948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1fno();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fmp1fmplusqkd0b.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fmp1fmplusqkd0b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66948,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1fno() throws Exception{try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66948);
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66949);JSONException error = null;
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66950);try {
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66951);DefaultJSONParser parser = new DefaultJSONParser(
					"{\"age\"33}");
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66952);parser.parseArray(User.class);
		} catch (JSONException e) {
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66953);error = e;
		}
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66954);Assert.assertNotNull(error);
	}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

	public void test_error_4() throws Exception {__CLR4_1_101fmp1fmplusqkd0b.R.globalSliceStart(getClass().getName(),66955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1fnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fmp1fmplusqkd0b.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fmp1fmplusqkd0b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66955,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1fnv() throws Exception{try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66955);
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66956);JSONException error = null;
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66957);try {
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66958);DefaultJSONParser parser = new DefaultJSONParser(
					"[\"age\":33}");
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66959);parser.parseObject(new User());
		} catch (JSONException e) {
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66960);error = e;
		}
		__CLR4_1_101fmp1fmplusqkd0b.R.inc(66961);Assert.assertNotNull(error);
	}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

	public static class User {

		private String name;
		private int age;
		private BigDecimal salary;
		private Date birthdate;
		private boolean old;

		public boolean isOld() {try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66962);
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66963);return old;
		}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

		public void setOld(boolean old) {try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66964);
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66965);this.old = old;
		}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

		public Date getBirthdate() {try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66966);
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66967);return birthdate;
		}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

		public void setBirthdate(Date birthdate) {try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66968);
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66969);this.birthdate = birthdate;
		}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

		public String getName() {try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66970);
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66971);return name;
		}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

		public void setName(String name) {try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66972);
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66973);this.name = name;
		}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

		public int getAge() {try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66974);
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66975);return age;
		}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

		public void setAge(int age) {try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66976);
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66977);this.age = age;
		}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

		public void setage(int age) {try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66978);
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66979);throw new UnsupportedOperationException();
		}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

		public void set(int age) {try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66980);
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66981);throw new UnsupportedOperationException();
		}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

		public void get(int age) {try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66982);
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66983);throw new UnsupportedOperationException();
		}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

		public void is(int age) {try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66984);
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66985);throw new UnsupportedOperationException();
		}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

		public BigDecimal getSalary() {try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66986);
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66987);return salary;
		}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

		public void setSalary(BigDecimal salary) {try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66988);
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66989);this.salary = salary;
		}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

		public static void setFF() {try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66990);

		}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

		public void setErrorValue(int value) {try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66991);
			__CLR4_1_101fmp1fmplusqkd0b.R.inc(66992);throw new RuntimeException();
		}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}

		void setXX() {try{__CLR4_1_101fmp1fmplusqkd0b.R.inc(66993);

		}finally{__CLR4_1_101fmp1fmplusqkd0b.R.flushNeeded();}}
	}
}
