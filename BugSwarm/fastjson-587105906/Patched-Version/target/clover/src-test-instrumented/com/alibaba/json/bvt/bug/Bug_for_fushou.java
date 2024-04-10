/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import junit.framework.TestCase;
import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import junit.framework.Assert;

import java.util.List;

public class Bug_for_fushou extends TestCase{static class __CLR4_5_213sx13sxlusyjrk1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,51608,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	public void test_case1() {__CLR4_5_213sx13sxlusyjrk1.R.globalSliceStart(getClass().getName(),51585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21tokkl13sx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213sx13sxlusyjrk1.R.rethrow($CLV_t2$);}finally{__CLR4_5_213sx13sxlusyjrk1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_fushou.test_case1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51585,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21tokkl13sx(){try{__CLR4_5_213sx13sxlusyjrk1.R.inc(51585);
		__CLR4_5_213sx13sxlusyjrk1.R.inc(51586);String text = "{\"modules\":{}}";
		__CLR4_5_213sx13sxlusyjrk1.R.inc(51587);L1<?> r1 = JSONObject.parseObject(text, new TypeReference<L1<L2>>() {
		});
		__CLR4_5_213sx13sxlusyjrk1.R.inc(51588);assertEquals(true, r1.getModules() instanceof L2);

		__CLR4_5_213sx13sxlusyjrk1.R.inc(51589);L1 r2 = JSONObject.parseObject(text, new TypeReference<L1>() {
		});
		__CLR4_5_213sx13sxlusyjrk1.R.inc(51590);assertEquals(true, r2.getModules() instanceof JSONObject);
		__CLR4_5_213sx13sxlusyjrk1.R.inc(51591);assertEquals(false, r2.getModules() instanceof L2);
	}finally{__CLR4_5_213sx13sxlusyjrk1.R.flushNeeded();}}

	public void test_case2() {__CLR4_5_213sx13sxlusyjrk1.R.globalSliceStart(getClass().getName(),51592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21fbe7w13t4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213sx13sxlusyjrk1.R.rethrow($CLV_t2$);}finally{__CLR4_5_213sx13sxlusyjrk1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_fushou.test_case2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51592,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21fbe7w13t4(){try{__CLR4_5_213sx13sxlusyjrk1.R.inc(51592);
		__CLR4_5_213sx13sxlusyjrk1.R.inc(51593);String text = "{\"modules\":{}}";
		__CLR4_5_213sx13sxlusyjrk1.R.inc(51594);L1<?> r0 = JSONObject.parseObject(text, new TypeReference<L1>() {
		});
		__CLR4_5_213sx13sxlusyjrk1.R.inc(51595);assertEquals(JSONObject.class, r0.getModules().getClass());

		__CLR4_5_213sx13sxlusyjrk1.R.inc(51596);L1<?> r1 = JSONObject.parseObject(text, new TypeReference<L1<L2>>() {
		});
		__CLR4_5_213sx13sxlusyjrk1.R.inc(51597);assertEquals(L2.class, r1.getModules().getClass());

		__CLR4_5_213sx13sxlusyjrk1.R.inc(51598);L1 r2 = JSONObject.parseObject(text, new TypeReference<L1>() {
		});
		__CLR4_5_213sx13sxlusyjrk1.R.inc(51599);assertEquals(JSONObject.class, r2.getModules().getClass());

        __CLR4_5_213sx13sxlusyjrk1.R.inc(51600);L1<?> r3 = JSONObject.parseObject(text, new TypeReference<L1<L3>>() {
        });
        __CLR4_5_213sx13sxlusyjrk1.R.inc(51601);assertEquals(L3.class, r3.getModules().getClass());
	}finally{__CLR4_5_213sx13sxlusyjrk1.R.flushNeeded();}}

	public static class L1<T> {
		private T modules;

		public T getModules() {try{__CLR4_5_213sx13sxlusyjrk1.R.inc(51602);
			__CLR4_5_213sx13sxlusyjrk1.R.inc(51603);return modules;
		}finally{__CLR4_5_213sx13sxlusyjrk1.R.flushNeeded();}}

		public void setModules(T modules) {try{__CLR4_5_213sx13sxlusyjrk1.R.inc(51604);
			__CLR4_5_213sx13sxlusyjrk1.R.inc(51605);this.modules = modules;
		}finally{__CLR4_5_213sx13sxlusyjrk1.R.flushNeeded();}}
	}

	public static class L2 {
		public String name;

		public L2() {try{__CLR4_5_213sx13sxlusyjrk1.R.inc(51606);

		}finally{__CLR4_5_213sx13sxlusyjrk1.R.flushNeeded();}}
	}

	public static class L3 {

		public L3() {try{__CLR4_5_213sx13sxlusyjrk1.R.inc(51607);

		}finally{__CLR4_5_213sx13sxlusyjrk1.R.flushNeeded();}}
	}
}
