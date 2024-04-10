/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class Bug_for_Double2Tag extends TestCase {static class __CLR4_1_1013z413z4luszw7ob{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,51848,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	public void test_double() throws Exception {__CLR4_1_1013z413z4luszw7ob.R.globalSliceStart(getClass().getName(),51808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10oq25yd13z4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013z413z4luszw7ob.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013z413z4luszw7ob.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_Double2Tag.test_double",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51808,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10oq25yd13z4() throws Exception{try{__CLR4_1_1013z413z4luszw7ob.R.inc(51808);
		__CLR4_1_1013z413z4luszw7ob.R.inc(51809);Double2Tag tag = new Double2Tag();
		__CLR4_1_1013z413z4luszw7ob.R.inc(51810);String str = JSON.toJSONString(tag);
		__CLR4_1_1013z413z4luszw7ob.R.inc(51811);JSON.parseObject(str, Double2Tag.class);
	}finally{__CLR4_1_1013z413z4luszw7ob.R.flushNeeded();}}
	
	public static class Double2Tag {
		public String data_time;
		public String data_id;
		public String hour_id;
		public String minute_id;
		public String tag3_id;
		public double ali_fee;
		public double total_ali_fee;
		public long seller_cnt;

		public Double2Tag() {try{__CLR4_1_1013z413z4luszw7ob.R.inc(51812);
			__CLR4_1_1013z413z4luszw7ob.R.inc(51813);ali_fee = 0.0;
			__CLR4_1_1013z413z4luszw7ob.R.inc(51814);total_ali_fee = 0.0;
			__CLR4_1_1013z413z4luszw7ob.R.inc(51815);seller_cnt = 0;
		}finally{__CLR4_1_1013z413z4luszw7ob.R.flushNeeded();}}

		public String getData_time() {try{__CLR4_1_1013z413z4luszw7ob.R.inc(51816);
			__CLR4_1_1013z413z4luszw7ob.R.inc(51817);return data_time;
		}finally{__CLR4_1_1013z413z4luszw7ob.R.flushNeeded();}}

		public void setData_time(String data_time) {try{__CLR4_1_1013z413z4luszw7ob.R.inc(51818);
			__CLR4_1_1013z413z4luszw7ob.R.inc(51819);this.data_time = data_time;
		}finally{__CLR4_1_1013z413z4luszw7ob.R.flushNeeded();}}

		public String getData_id() {try{__CLR4_1_1013z413z4luszw7ob.R.inc(51820);
			__CLR4_1_1013z413z4luszw7ob.R.inc(51821);return data_id;
		}finally{__CLR4_1_1013z413z4luszw7ob.R.flushNeeded();}}

		public void setData_id(String data_id) {try{__CLR4_1_1013z413z4luszw7ob.R.inc(51822);
			__CLR4_1_1013z413z4luszw7ob.R.inc(51823);this.data_id = data_id;
		}finally{__CLR4_1_1013z413z4luszw7ob.R.flushNeeded();}}

		public String getHour_id() {try{__CLR4_1_1013z413z4luszw7ob.R.inc(51824);
			__CLR4_1_1013z413z4luszw7ob.R.inc(51825);return hour_id;
		}finally{__CLR4_1_1013z413z4luszw7ob.R.flushNeeded();}}

		public void setHour_id(String hour_id) {try{__CLR4_1_1013z413z4luszw7ob.R.inc(51826);
			__CLR4_1_1013z413z4luszw7ob.R.inc(51827);this.hour_id = hour_id;
		}finally{__CLR4_1_1013z413z4luszw7ob.R.flushNeeded();}}

		public String getMinute_id() {try{__CLR4_1_1013z413z4luszw7ob.R.inc(51828);
			__CLR4_1_1013z413z4luszw7ob.R.inc(51829);return minute_id;
		}finally{__CLR4_1_1013z413z4luszw7ob.R.flushNeeded();}}

		public void setMinute_id(String minute_id) {try{__CLR4_1_1013z413z4luszw7ob.R.inc(51830);
			__CLR4_1_1013z413z4luszw7ob.R.inc(51831);this.minute_id = minute_id;
		}finally{__CLR4_1_1013z413z4luszw7ob.R.flushNeeded();}}

		public String getTag3_id() {try{__CLR4_1_1013z413z4luszw7ob.R.inc(51832);
			__CLR4_1_1013z413z4luszw7ob.R.inc(51833);return tag3_id;
		}finally{__CLR4_1_1013z413z4luszw7ob.R.flushNeeded();}}

		public void setTag3_id(String tag3_id) {try{__CLR4_1_1013z413z4luszw7ob.R.inc(51834);
			__CLR4_1_1013z413z4luszw7ob.R.inc(51835);this.tag3_id = tag3_id;
		}finally{__CLR4_1_1013z413z4luszw7ob.R.flushNeeded();}}

		public double getAli_fee() {try{__CLR4_1_1013z413z4luszw7ob.R.inc(51836);
			__CLR4_1_1013z413z4luszw7ob.R.inc(51837);return ali_fee;
		}finally{__CLR4_1_1013z413z4luszw7ob.R.flushNeeded();}}

		public void setAli_fee(double ali_fee) {try{__CLR4_1_1013z413z4luszw7ob.R.inc(51838);
			__CLR4_1_1013z413z4luszw7ob.R.inc(51839);this.ali_fee = ali_fee;
		}finally{__CLR4_1_1013z413z4luszw7ob.R.flushNeeded();}}

		public double getTotal_ali_fee() {try{__CLR4_1_1013z413z4luszw7ob.R.inc(51840);
			__CLR4_1_1013z413z4luszw7ob.R.inc(51841);return total_ali_fee;
		}finally{__CLR4_1_1013z413z4luszw7ob.R.flushNeeded();}}

		public void setTotal_ali_fee(double total_ali_fee) {try{__CLR4_1_1013z413z4luszw7ob.R.inc(51842);
			__CLR4_1_1013z413z4luszw7ob.R.inc(51843);this.total_ali_fee = total_ali_fee;
		}finally{__CLR4_1_1013z413z4luszw7ob.R.flushNeeded();}}

		public long getSeller_cnt() {try{__CLR4_1_1013z413z4luszw7ob.R.inc(51844);
			__CLR4_1_1013z413z4luszw7ob.R.inc(51845);return seller_cnt;
		}finally{__CLR4_1_1013z413z4luszw7ob.R.flushNeeded();}}

		public void setSeller_cnt(long seller_cnt) {try{__CLR4_1_1013z413z4luszw7ob.R.inc(51846);
			__CLR4_1_1013z413z4luszw7ob.R.inc(51847);this.seller_cnt = seller_cnt;
		}finally{__CLR4_1_1013z413z4luszw7ob.R.flushNeeded();}}

	}
}
