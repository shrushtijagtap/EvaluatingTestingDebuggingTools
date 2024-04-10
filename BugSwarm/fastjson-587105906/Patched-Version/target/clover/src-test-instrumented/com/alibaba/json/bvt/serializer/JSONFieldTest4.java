/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

public class JSONFieldTest4 extends TestCase {static class __CLR4_5_21rha1rhalusyjuw3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,82288,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	public void test_jsonField() throws Exception {__CLR4_5_21rha1rhalusyjuw3.R.globalSliceStart(getClass().getName(),82270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2onqrpw1rha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rha1rhalusyjuw3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rha1rhalusyjuw3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONFieldTest4.test_jsonField",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82270,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2onqrpw1rha() throws Exception{try{__CLR4_5_21rha1rhalusyjuw3.R.inc(82270);
		__CLR4_5_21rha1rhalusyjuw3.R.inc(82271);VO vo = new VO();

		__CLR4_5_21rha1rhalusyjuw3.R.inc(82272);vo.setId(123);
		__CLR4_5_21rha1rhalusyjuw3.R.inc(82273);vo.setFlag(true);

		__CLR4_5_21rha1rhalusyjuw3.R.inc(82274);String text = JSON.toJSONString(vo);
		__CLR4_5_21rha1rhalusyjuw3.R.inc(82275);Assert.assertEquals("{\"id\":123}", text);
	}finally{__CLR4_5_21rha1rhalusyjuw3.R.flushNeeded();}}

	public static class VO {
		private int id;

		@JSONField(serialize = false)
		private boolean m_flag;
		
		@JSONField(serialize = false)
		private int m_id2;

		public int getId() {try{__CLR4_5_21rha1rhalusyjuw3.R.inc(82276);
			__CLR4_5_21rha1rhalusyjuw3.R.inc(82277);return id;
		}finally{__CLR4_5_21rha1rhalusyjuw3.R.flushNeeded();}}

		public void setId(int id) {try{__CLR4_5_21rha1rhalusyjuw3.R.inc(82278);
			__CLR4_5_21rha1rhalusyjuw3.R.inc(82279);this.id = id;
		}finally{__CLR4_5_21rha1rhalusyjuw3.R.flushNeeded();}}

		public boolean isFlag() {try{__CLR4_5_21rha1rhalusyjuw3.R.inc(82280);
			__CLR4_5_21rha1rhalusyjuw3.R.inc(82281);return m_flag;
		}finally{__CLR4_5_21rha1rhalusyjuw3.R.flushNeeded();}}

		public void setFlag(boolean flag) {try{__CLR4_5_21rha1rhalusyjuw3.R.inc(82282);
			__CLR4_5_21rha1rhalusyjuw3.R.inc(82283);this.m_flag = flag;
		}finally{__CLR4_5_21rha1rhalusyjuw3.R.flushNeeded();}}

        
        public int getId2() {try{__CLR4_5_21rha1rhalusyjuw3.R.inc(82284);
            __CLR4_5_21rha1rhalusyjuw3.R.inc(82285);return m_id2;
        }finally{__CLR4_5_21rha1rhalusyjuw3.R.flushNeeded();}}

        
        public void setId2(int id2) {try{__CLR4_5_21rha1rhalusyjuw3.R.inc(82286);
            __CLR4_5_21rha1rhalusyjuw3.R.inc(82287);this.m_id2 = id2;
        }finally{__CLR4_5_21rha1rhalusyjuw3.R.flushNeeded();}}
		
		
	}
}
