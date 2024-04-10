/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;

public class DefaultExtJSONParserTest_0 extends TestCase {static class __CLR4_5_21fme1fmelusyjtkm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,66983,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	protected void setUp() throws Exception {try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66902);
	}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

	public void test_0() throws Exception {__CLR4_5_21fme1fmelusyjtkm.R.globalSliceStart(getClass().getName(),66903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21fmf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fme1fmelusyjtkm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fme1fmelusyjtkm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66903,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21fmf() throws Exception{try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66903);
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66904);DefaultJSONParser parser = new DefaultJSONParser("123");
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66905);Assert.assertEquals(new Integer(123), (Integer) parser.parse());

		__CLR4_5_21fme1fmelusyjtkm.R.inc(66906);parser.config(Feature.IgnoreNotMatch, false);
	}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

	public void test_1() throws Exception {__CLR4_5_21fme1fmelusyjtkm.R.globalSliceStart(getClass().getName(),66907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1fmj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fme1fmelusyjtkm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fme1fmelusyjtkm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66907,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1fmj() throws Exception{try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66907);
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66908);DefaultJSONParser parser = new DefaultJSONParser("[]");
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66909);parser.parseArray(Class.class);
	}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

	public void test_2() throws Exception {__CLR4_5_21fme1fmelusyjtkm.R.globalSliceStart(getClass().getName(),66910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441fmm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fme1fmelusyjtkm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fme1fmelusyjtkm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66910,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441fmm() throws Exception{try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66910);
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66911);DefaultJSONParser parser = new DefaultJSONParser("{}");
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66912);parser.parseObject(Object.class);
	}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

	public void test_3() throws Exception {__CLR4_5_21fme1fmelusyjtkm.R.globalSliceStart(getClass().getName(),66913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1fmp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fme1fmelusyjtkm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fme1fmelusyjtkm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66913,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1fmp() throws Exception{try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66913);
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66914);DefaultJSONParser parser = new DefaultJSONParser("{}");
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66915);parser.parseObject(User.class);
	}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

	public void test_error_0() throws Exception {__CLR4_5_21fme1fmelusyjtkm.R.globalSliceStart(getClass().getName(),66916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxv1fms();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fme1fmelusyjtkm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fme1fmelusyjtkm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66916,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxv1fms() throws Exception{try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66916);
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66917);JSONException error = null;
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66918);try {
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66919);DefaultJSONParser parser = new DefaultJSONParser("123");
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66920);parser.parseObject(Class.class);
		} catch (JSONException e) {
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66921);error = e;
		}
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66922);Assert.assertNotNull(error);
	}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

	public void test_error_1() throws Exception {__CLR4_5_21fme1fmelusyjtkm.R.globalSliceStart(getClass().getName(),66923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1fmz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fme1fmelusyjtkm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fme1fmelusyjtkm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66923,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1fmz() throws Exception{try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66923);
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66924);JSONException error = null;
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66925);try {
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66926);DefaultJSONParser parser = new DefaultJSONParser("[{}]");
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66927);parser.parseArray(Class.class);
		} catch (JSONException e) {
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66928);error = e;
		}
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66929);Assert.assertNotNull(error);
	}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

	public void test_error_2() throws Exception {__CLR4_5_21fme1fmelusyjtkm.R.globalSliceStart(getClass().getName(),66930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1fn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fme1fmelusyjtkm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fme1fmelusyjtkm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66930,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1fn6() throws Exception{try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66930);
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66931);JSONException error = null;
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66932);try {
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66933);DefaultJSONParser parser = new DefaultJSONParser(
					"{\"errorValue\":33}");
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66934);parser.parseArray(User.class);
		} catch (JSONException e) {
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66935);error = e;
		}
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66936);Assert.assertNotNull(error);
	}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

	public void test_error_3() throws Exception {__CLR4_5_21fme1fmelusyjtkm.R.globalSliceStart(getClass().getName(),66937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1fnd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fme1fmelusyjtkm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fme1fmelusyjtkm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66937,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1fnd() throws Exception{try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66937);
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66938);JSONException error = null;
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66939);try {
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66940);DefaultJSONParser parser = new DefaultJSONParser(
					"{\"age\"33}");
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66941);parser.parseArray(User.class);
		} catch (JSONException e) {
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66942);error = e;
		}
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66943);Assert.assertNotNull(error);
	}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

	public void test_error_4() throws Exception {__CLR4_5_21fme1fmelusyjtkm.R.globalSliceStart(getClass().getName(),66944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1fnk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fme1fmelusyjtkm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fme1fmelusyjtkm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_0.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66944,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1fnk() throws Exception{try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66944);
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66945);JSONException error = null;
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66946);try {
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66947);DefaultJSONParser parser = new DefaultJSONParser(
					"[\"age\":33}");
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66948);parser.parseObject(new User());
		} catch (JSONException e) {
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66949);error = e;
		}
		__CLR4_5_21fme1fmelusyjtkm.R.inc(66950);Assert.assertNotNull(error);
	}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

	public static class User {

		private String name;
		private int age;
		private BigDecimal salary;
		private Date birthdate;
		private boolean old;

		public boolean isOld() {try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66951);
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66952);return old;
		}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

		public void setOld(boolean old) {try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66953);
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66954);this.old = old;
		}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

		public Date getBirthdate() {try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66955);
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66956);return birthdate;
		}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

		public void setBirthdate(Date birthdate) {try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66957);
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66958);this.birthdate = birthdate;
		}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

		public String getName() {try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66959);
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66960);return name;
		}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

		public void setName(String name) {try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66961);
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66962);this.name = name;
		}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

		public int getAge() {try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66963);
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66964);return age;
		}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

		public void setAge(int age) {try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66965);
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66966);this.age = age;
		}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

		public void setage(int age) {try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66967);
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66968);throw new UnsupportedOperationException();
		}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

		public void set(int age) {try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66969);
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66970);throw new UnsupportedOperationException();
		}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

		public void get(int age) {try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66971);
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66972);throw new UnsupportedOperationException();
		}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

		public void is(int age) {try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66973);
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66974);throw new UnsupportedOperationException();
		}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

		public BigDecimal getSalary() {try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66975);
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66976);return salary;
		}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

		public void setSalary(BigDecimal salary) {try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66977);
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66978);this.salary = salary;
		}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

		public static void setFF() {try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66979);

		}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

		public void setErrorValue(int value) {try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66980);
			__CLR4_5_21fme1fmelusyjtkm.R.inc(66981);throw new RuntimeException();
		}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}

		void setXX() {try{__CLR4_5_21fme1fmelusyjtkm.R.inc(66982);

		}finally{__CLR4_5_21fme1fmelusyjtkm.R.flushNeeded();}}
	}
}
