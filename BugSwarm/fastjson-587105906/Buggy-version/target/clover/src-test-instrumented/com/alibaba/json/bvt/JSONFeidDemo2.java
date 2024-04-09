/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class JSONFeidDemo2 extends TestCase {static class __CLR4_1_10xo0xo0lusqjxuj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,43664,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	public void test_0() throws Exception {__CLR4_1_10xo0xo0lusqjxuj.R.globalSliceStart(getClass().getName(),43632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp2xo0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xo0xo0lusqjxuj.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xo0xo0lusqjxuj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONFeidDemo2.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43632,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp2xo0() throws Exception{try{__CLR4_1_10xo0xo0lusqjxuj.R.inc(43632);
		__CLR4_1_10xo0xo0lusqjxuj.R.inc(43633);Z_OA_MM_PR_INFO_IN in = new Z_OA_MM_PR_INFO_IN();
		__CLR4_1_10xo0xo0lusqjxuj.R.inc(43634);in.setIM_PREQ_NO("111111");
		__CLR4_1_10xo0xo0lusqjxuj.R.inc(43635);TB_PR_INFO t1 = new TB_PR_INFO("t1");
		__CLR4_1_10xo0xo0lusqjxuj.R.inc(43636);TB_PR_INFO t2 = new TB_PR_INFO("t2");
		__CLR4_1_10xo0xo0lusqjxuj.R.inc(43637);List<TB_PR_INFO> tb_pr_infos = new ArrayList<TB_PR_INFO>();
		__CLR4_1_10xo0xo0lusqjxuj.R.inc(43638);tb_pr_infos.add(t1);
		__CLR4_1_10xo0xo0lusqjxuj.R.inc(43639);tb_pr_infos.add(t2);
		__CLR4_1_10xo0xo0lusqjxuj.R.inc(43640);in.setTB_PR_INFO(tb_pr_infos);

		__CLR4_1_10xo0xo0lusqjxuj.R.inc(43641);String text = JSON.toJSONString(in);
		__CLR4_1_10xo0xo0lusqjxuj.R.inc(43642);System.out.println(text);

		__CLR4_1_10xo0xo0lusqjxuj.R.inc(43643);assertEquals(
				"{\"IM_PREQ_NO\":\"111111\",\"TB_PR_INFO\":[{\"PREQ_NO\":\"t1\"},{\"PREQ_NO\":\"t2\"}]}",
				text);

	}finally{__CLR4_1_10xo0xo0lusqjxuj.R.flushNeeded();}}

	public void test_1() throws Exception {__CLR4_1_10xo0xo0lusqjxuj.R.globalSliceStart(getClass().getName(),43644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwlxoc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xo0xo0lusqjxuj.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xo0xo0lusqjxuj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONFeidDemo2.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43644,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwlxoc() throws Exception{try{__CLR4_1_10xo0xo0lusqjxuj.R.inc(43644);
		__CLR4_1_10xo0xo0lusqjxuj.R.inc(43645);String text = "{\"IM_PREQ_NO\":\"111111\",\"TB_PR_INFO\":[{\"pREQ_NO\":\"t1\"},{\"pREQ_NO\":\"t2\"}]}";
		__CLR4_1_10xo0xo0lusqjxuj.R.inc(43646);Z_OA_MM_PR_INFO_IN in = JSON
				.parseObject(text, Z_OA_MM_PR_INFO_IN.class);
		__CLR4_1_10xo0xo0lusqjxuj.R.inc(43647);assertEquals("111111", in.getIM_PREQ_NO());
		__CLR4_1_10xo0xo0lusqjxuj.R.inc(43648);assertNotNull(in.getTB_PR_INFO());

	}finally{__CLR4_1_10xo0xo0lusqjxuj.R.flushNeeded();}}

	public static class Z_OA_MM_PR_INFO_IN {
		@JSONField(name = "IM_PREQ_NO")
		private String IM_PREQ_NO;
		@JSONField(name = "TB_PR_INFO")
		private List<TB_PR_INFO> TB_PR_INFO;

		public List<JSONFeidDemo2.TB_PR_INFO> getTB_PR_INFO() {try{__CLR4_1_10xo0xo0lusqjxuj.R.inc(43649);
			__CLR4_1_10xo0xo0lusqjxuj.R.inc(43650);return TB_PR_INFO;
		}finally{__CLR4_1_10xo0xo0lusqjxuj.R.flushNeeded();}}

		public void setTB_PR_INFO(List<JSONFeidDemo2.TB_PR_INFO> TB_PR_INFO) {try{__CLR4_1_10xo0xo0lusqjxuj.R.inc(43651);
			__CLR4_1_10xo0xo0lusqjxuj.R.inc(43652);this.TB_PR_INFO = TB_PR_INFO;
		}finally{__CLR4_1_10xo0xo0lusqjxuj.R.flushNeeded();}}

		public String getIM_PREQ_NO() {try{__CLR4_1_10xo0xo0lusqjxuj.R.inc(43653);
			__CLR4_1_10xo0xo0lusqjxuj.R.inc(43654);return IM_PREQ_NO;
		}finally{__CLR4_1_10xo0xo0lusqjxuj.R.flushNeeded();}}

		public void setIM_PREQ_NO(String IM_PREQ_NO) {try{__CLR4_1_10xo0xo0lusqjxuj.R.inc(43655);
			__CLR4_1_10xo0xo0lusqjxuj.R.inc(43656);this.IM_PREQ_NO = IM_PREQ_NO;
		}finally{__CLR4_1_10xo0xo0lusqjxuj.R.flushNeeded();}}
	}

	public static class TB_PR_INFO {
		@JSONField(name = "PREQ_NO")
		private String PREQ_NO;

		public TB_PR_INFO() {try{__CLR4_1_10xo0xo0lusqjxuj.R.inc(43657);
		}finally{__CLR4_1_10xo0xo0lusqjxuj.R.flushNeeded();}}

		public TB_PR_INFO(String PREQ_NO) {try{__CLR4_1_10xo0xo0lusqjxuj.R.inc(43658);
			__CLR4_1_10xo0xo0lusqjxuj.R.inc(43659);this.PREQ_NO = PREQ_NO;
		}finally{__CLR4_1_10xo0xo0lusqjxuj.R.flushNeeded();}}
		@JSONField(name = "PREQ_NO")
		public String getPREQ_NO() {try{__CLR4_1_10xo0xo0lusqjxuj.R.inc(43660);
			__CLR4_1_10xo0xo0lusqjxuj.R.inc(43661);return PREQ_NO;
		}finally{__CLR4_1_10xo0xo0lusqjxuj.R.flushNeeded();}}

		public void setPREQ_NO(String PREQ_NO) {try{__CLR4_1_10xo0xo0lusqjxuj.R.inc(43662);
			__CLR4_1_10xo0xo0lusqjxuj.R.inc(43663);this.PREQ_NO = PREQ_NO;
		}finally{__CLR4_1_10xo0xo0lusqjxuj.R.flushNeeded();}}
	}
}
