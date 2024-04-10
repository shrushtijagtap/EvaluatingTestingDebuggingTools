/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class Bug_for_Double2Tag extends TestCase {static class __CLR4_5_2130l130llusyjr7x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,50605,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	public void test_double() throws Exception {__CLR4_5_2130l130llusyjr7x.R.globalSliceStart(getClass().getName(),50565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oq25yd130l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2130l130llusyjr7x.R.rethrow($CLV_t2$);}finally{__CLR4_5_2130l130llusyjr7x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_Double2Tag.test_double",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50565,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oq25yd130l() throws Exception{try{__CLR4_5_2130l130llusyjr7x.R.inc(50565);
		__CLR4_5_2130l130llusyjr7x.R.inc(50566);Double2Tag tag = new Double2Tag();
		__CLR4_5_2130l130llusyjr7x.R.inc(50567);String str = JSON.toJSONString(tag);
		__CLR4_5_2130l130llusyjr7x.R.inc(50568);JSON.parseObject(str, Double2Tag.class);
	}finally{__CLR4_5_2130l130llusyjr7x.R.flushNeeded();}}
	
	public static class Double2Tag {
		public String data_time;
		public String data_id;
		public String hour_id;
		public String minute_id;
		public String tag3_id;
		public double ali_fee;
		public double total_ali_fee;
		public long seller_cnt;

		public Double2Tag() {try{__CLR4_5_2130l130llusyjr7x.R.inc(50569);
			__CLR4_5_2130l130llusyjr7x.R.inc(50570);ali_fee = 0.0;
			__CLR4_5_2130l130llusyjr7x.R.inc(50571);total_ali_fee = 0.0;
			__CLR4_5_2130l130llusyjr7x.R.inc(50572);seller_cnt = 0;
		}finally{__CLR4_5_2130l130llusyjr7x.R.flushNeeded();}}

		public String getData_time() {try{__CLR4_5_2130l130llusyjr7x.R.inc(50573);
			__CLR4_5_2130l130llusyjr7x.R.inc(50574);return data_time;
		}finally{__CLR4_5_2130l130llusyjr7x.R.flushNeeded();}}

		public void setData_time(String data_time) {try{__CLR4_5_2130l130llusyjr7x.R.inc(50575);
			__CLR4_5_2130l130llusyjr7x.R.inc(50576);this.data_time = data_time;
		}finally{__CLR4_5_2130l130llusyjr7x.R.flushNeeded();}}

		public String getData_id() {try{__CLR4_5_2130l130llusyjr7x.R.inc(50577);
			__CLR4_5_2130l130llusyjr7x.R.inc(50578);return data_id;
		}finally{__CLR4_5_2130l130llusyjr7x.R.flushNeeded();}}

		public void setData_id(String data_id) {try{__CLR4_5_2130l130llusyjr7x.R.inc(50579);
			__CLR4_5_2130l130llusyjr7x.R.inc(50580);this.data_id = data_id;
		}finally{__CLR4_5_2130l130llusyjr7x.R.flushNeeded();}}

		public String getHour_id() {try{__CLR4_5_2130l130llusyjr7x.R.inc(50581);
			__CLR4_5_2130l130llusyjr7x.R.inc(50582);return hour_id;
		}finally{__CLR4_5_2130l130llusyjr7x.R.flushNeeded();}}

		public void setHour_id(String hour_id) {try{__CLR4_5_2130l130llusyjr7x.R.inc(50583);
			__CLR4_5_2130l130llusyjr7x.R.inc(50584);this.hour_id = hour_id;
		}finally{__CLR4_5_2130l130llusyjr7x.R.flushNeeded();}}

		public String getMinute_id() {try{__CLR4_5_2130l130llusyjr7x.R.inc(50585);
			__CLR4_5_2130l130llusyjr7x.R.inc(50586);return minute_id;
		}finally{__CLR4_5_2130l130llusyjr7x.R.flushNeeded();}}

		public void setMinute_id(String minute_id) {try{__CLR4_5_2130l130llusyjr7x.R.inc(50587);
			__CLR4_5_2130l130llusyjr7x.R.inc(50588);this.minute_id = minute_id;
		}finally{__CLR4_5_2130l130llusyjr7x.R.flushNeeded();}}

		public String getTag3_id() {try{__CLR4_5_2130l130llusyjr7x.R.inc(50589);
			__CLR4_5_2130l130llusyjr7x.R.inc(50590);return tag3_id;
		}finally{__CLR4_5_2130l130llusyjr7x.R.flushNeeded();}}

		public void setTag3_id(String tag3_id) {try{__CLR4_5_2130l130llusyjr7x.R.inc(50591);
			__CLR4_5_2130l130llusyjr7x.R.inc(50592);this.tag3_id = tag3_id;
		}finally{__CLR4_5_2130l130llusyjr7x.R.flushNeeded();}}

		public double getAli_fee() {try{__CLR4_5_2130l130llusyjr7x.R.inc(50593);
			__CLR4_5_2130l130llusyjr7x.R.inc(50594);return ali_fee;
		}finally{__CLR4_5_2130l130llusyjr7x.R.flushNeeded();}}

		public void setAli_fee(double ali_fee) {try{__CLR4_5_2130l130llusyjr7x.R.inc(50595);
			__CLR4_5_2130l130llusyjr7x.R.inc(50596);this.ali_fee = ali_fee;
		}finally{__CLR4_5_2130l130llusyjr7x.R.flushNeeded();}}

		public double getTotal_ali_fee() {try{__CLR4_5_2130l130llusyjr7x.R.inc(50597);
			__CLR4_5_2130l130llusyjr7x.R.inc(50598);return total_ali_fee;
		}finally{__CLR4_5_2130l130llusyjr7x.R.flushNeeded();}}

		public void setTotal_ali_fee(double total_ali_fee) {try{__CLR4_5_2130l130llusyjr7x.R.inc(50599);
			__CLR4_5_2130l130llusyjr7x.R.inc(50600);this.total_ali_fee = total_ali_fee;
		}finally{__CLR4_5_2130l130llusyjr7x.R.flushNeeded();}}

		public long getSeller_cnt() {try{__CLR4_5_2130l130llusyjr7x.R.inc(50601);
			__CLR4_5_2130l130llusyjr7x.R.inc(50602);return seller_cnt;
		}finally{__CLR4_5_2130l130llusyjr7x.R.flushNeeded();}}

		public void setSeller_cnt(long seller_cnt) {try{__CLR4_5_2130l130llusyjr7x.R.inc(50603);
			__CLR4_5_2130l130llusyjr7x.R.inc(50604);this.seller_cnt = seller_cnt;
		}finally{__CLR4_5_2130l130llusyjr7x.R.flushNeeded();}}

	}
}
