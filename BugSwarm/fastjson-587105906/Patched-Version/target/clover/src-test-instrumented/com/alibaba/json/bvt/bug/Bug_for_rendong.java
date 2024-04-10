/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class Bug_for_rendong extends TestCase {static class __CLR4_5_215gg15gglusyjrtl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,53756,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	public void test_0() throws Exception {__CLR4_5_215gg15gglusyjrtl.R.globalSliceStart(getClass().getName(),53728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp215gg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215gg15gglusyjrtl.R.rethrow($CLV_t2$);}finally{__CLR4_5_215gg15gglusyjrtl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_rendong.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53728,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp215gg() throws Exception{try{__CLR4_5_215gg15gglusyjrtl.R.inc(53728);
		__CLR4_5_215gg15gglusyjrtl.R.inc(53729);String text = "{\"BX-20110613-1739\":{\"repairNum\":\"BX-20110613-1739\",\"set\":[{\"employNum\":\"a1027\",\"isConfirm\":false,\"isReceive\":false,\"state\":11}]},\"BX-20110613-1749\":{\"repairNum\":\"BX-20110613-1749\",\"set\":[{\"employNum\":\"a1027\",\"isConfirm\":false,\"isReceive\":true,\"state\":1}]}}";

		__CLR4_5_215gg15gglusyjrtl.R.inc(53730);Map<String, TaskMobileStatusBean> map = JSON.parseObject(text,
				new TypeReference<Map<String, TaskMobileStatusBean>>() {
				});

		__CLR4_5_215gg15gglusyjrtl.R.inc(53731);Assert.assertEquals(2, map.size());
		// System.out.println(JSON.toJSONString(map,
		// SerializerFeature.PrettyFormat));
	}finally{__CLR4_5_215gg15gglusyjrtl.R.flushNeeded();}}

	public static class TaskMobileStatusBean {

		private String repairNum;

		private Set<PeopleTaskMobileStatusBean> set = new HashSet<PeopleTaskMobileStatusBean>();

		public String getRepairNum() {try{__CLR4_5_215gg15gglusyjrtl.R.inc(53732);
			__CLR4_5_215gg15gglusyjrtl.R.inc(53733);return repairNum;
		}finally{__CLR4_5_215gg15gglusyjrtl.R.flushNeeded();}}

		public void setRepairNum(String repairNum) {try{__CLR4_5_215gg15gglusyjrtl.R.inc(53734);
			__CLR4_5_215gg15gglusyjrtl.R.inc(53735);this.repairNum = repairNum;
		}finally{__CLR4_5_215gg15gglusyjrtl.R.flushNeeded();}}

		public Set<PeopleTaskMobileStatusBean> getSet() {try{__CLR4_5_215gg15gglusyjrtl.R.inc(53736);
			__CLR4_5_215gg15gglusyjrtl.R.inc(53737);return set;
		}finally{__CLR4_5_215gg15gglusyjrtl.R.flushNeeded();}}

		public void setSet(Set<PeopleTaskMobileStatusBean> set) {try{__CLR4_5_215gg15gglusyjrtl.R.inc(53738);
			__CLR4_5_215gg15gglusyjrtl.R.inc(53739);this.set = set;
		}finally{__CLR4_5_215gg15gglusyjrtl.R.flushNeeded();}}

	}

	public static class PeopleTaskMobileStatusBean {

		private String employNum;
		private Boolean isConfirm;
		private Boolean isReceive;
		private int state;

		public String getEmployNum() {try{__CLR4_5_215gg15gglusyjrtl.R.inc(53740);
			__CLR4_5_215gg15gglusyjrtl.R.inc(53741);return employNum;
		}finally{__CLR4_5_215gg15gglusyjrtl.R.flushNeeded();}}

		public void setEmployNum(String employNum) {try{__CLR4_5_215gg15gglusyjrtl.R.inc(53742);
			__CLR4_5_215gg15gglusyjrtl.R.inc(53743);this.employNum = employNum;
		}finally{__CLR4_5_215gg15gglusyjrtl.R.flushNeeded();}}

		public Boolean getIsConfirm() {try{__CLR4_5_215gg15gglusyjrtl.R.inc(53744);
			__CLR4_5_215gg15gglusyjrtl.R.inc(53745);return isConfirm;
		}finally{__CLR4_5_215gg15gglusyjrtl.R.flushNeeded();}}

		public void setIsConfirm(Boolean isConfirm) {try{__CLR4_5_215gg15gglusyjrtl.R.inc(53746);
			__CLR4_5_215gg15gglusyjrtl.R.inc(53747);this.isConfirm = isConfirm;
		}finally{__CLR4_5_215gg15gglusyjrtl.R.flushNeeded();}}

		public Boolean getIsReceive() {try{__CLR4_5_215gg15gglusyjrtl.R.inc(53748);
			__CLR4_5_215gg15gglusyjrtl.R.inc(53749);return isReceive;
		}finally{__CLR4_5_215gg15gglusyjrtl.R.flushNeeded();}}

		public void setIsReceive(Boolean isReceive) {try{__CLR4_5_215gg15gglusyjrtl.R.inc(53750);
			__CLR4_5_215gg15gglusyjrtl.R.inc(53751);this.isReceive = isReceive;
		}finally{__CLR4_5_215gg15gglusyjrtl.R.flushNeeded();}}

		public int getState() {try{__CLR4_5_215gg15gglusyjrtl.R.inc(53752);
			__CLR4_5_215gg15gglusyjrtl.R.inc(53753);return state;
		}finally{__CLR4_5_215gg15gglusyjrtl.R.flushNeeded();}}

		public void setState(int state) {try{__CLR4_5_215gg15gglusyjrtl.R.inc(53754);
			__CLR4_5_215gg15gglusyjrtl.R.inc(53755);this.state = state;
		}finally{__CLR4_5_215gg15gglusyjrtl.R.flushNeeded();}}

	}

}
