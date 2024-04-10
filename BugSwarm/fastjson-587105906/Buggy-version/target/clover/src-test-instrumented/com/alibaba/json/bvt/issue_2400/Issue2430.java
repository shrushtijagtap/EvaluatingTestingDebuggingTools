/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_2400;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.ArrayListMultimap;

import junit.framework.TestCase;

public class Issue2430 extends TestCase {static class __CLR4_1_101eo81eo8luszwbrk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,65696,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	public void testForIssue() {__CLR4_1_101eo81eo8luszwbrk.R.globalSliceStart(getClass().getName(),65672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n04zex1eo8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101eo81eo8luszwbrk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101eo81eo8luszwbrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2400.Issue2430.testForIssue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65672,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n04zex1eo8(){try{__CLR4_1_101eo81eo8luszwbrk.R.inc(65672);
		__CLR4_1_101eo81eo8luszwbrk.R.inc(65673);ArrayListMultimap<String, String> multimap = ArrayListMultimap.create();
		__CLR4_1_101eo81eo8luszwbrk.R.inc(65674);multimap.put("a", "1");
		__CLR4_1_101eo81eo8luszwbrk.R.inc(65675);multimap.put("a", "2");
		__CLR4_1_101eo81eo8luszwbrk.R.inc(65676);multimap.put("a", "3");
		__CLR4_1_101eo81eo8luszwbrk.R.inc(65677);multimap.put("b", "1");

		__CLR4_1_101eo81eo8luszwbrk.R.inc(65678);VO vo = new VO();
		__CLR4_1_101eo81eo8luszwbrk.R.inc(65679);vo.setMap(multimap);
		__CLR4_1_101eo81eo8luszwbrk.R.inc(65680);vo.setName("zhangsan");

		__CLR4_1_101eo81eo8luszwbrk.R.inc(65681);assertEquals("{\"map\":{\"a\":[\"1\",\"2\",\"3\"],\"b\":[\"1\"]},\"name\":\"zhangsan\"}",
				JSON.toJSONString(vo));
	}finally{__CLR4_1_101eo81eo8luszwbrk.R.flushNeeded();}}

	public void testForIssue2() {__CLR4_1_101eo81eo8luszwbrk.R.globalSliceStart(getClass().getName(),65682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pfhv9l1eoi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101eo81eo8luszwbrk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101eo81eo8luszwbrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2400.Issue2430.testForIssue2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65682,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pfhv9l1eoi(){try{__CLR4_1_101eo81eo8luszwbrk.R.inc(65682);
		__CLR4_1_101eo81eo8luszwbrk.R.inc(65683);String jsonString = "{\"map\":{\"a\":[\"1\",\"2\",\"3\"],\"b\":[\"1\"]},\"name\":\"zhangsan\"}";
		__CLR4_1_101eo81eo8luszwbrk.R.inc(65684);VO vo = JSON.parseObject(jsonString, VO.class);
		__CLR4_1_101eo81eo8luszwbrk.R.inc(65685);assertEquals("VO:{name->zhangsan,map->{a=[1, 2, 3], b=[1]}}", vo.toString());
	}finally{__CLR4_1_101eo81eo8luszwbrk.R.flushNeeded();}}

	public static class VO {
		private String name;
		private ArrayListMultimap<String, String> map;

		public String getName() {try{__CLR4_1_101eo81eo8luszwbrk.R.inc(65686);
			__CLR4_1_101eo81eo8luszwbrk.R.inc(65687);return name;
		}finally{__CLR4_1_101eo81eo8luszwbrk.R.flushNeeded();}}

		public void setName(String name) {try{__CLR4_1_101eo81eo8luszwbrk.R.inc(65688);
			__CLR4_1_101eo81eo8luszwbrk.R.inc(65689);this.name = name;
		}finally{__CLR4_1_101eo81eo8luszwbrk.R.flushNeeded();}}

		public ArrayListMultimap<String, String> getMap() {try{__CLR4_1_101eo81eo8luszwbrk.R.inc(65690);
			__CLR4_1_101eo81eo8luszwbrk.R.inc(65691);return map;
		}finally{__CLR4_1_101eo81eo8luszwbrk.R.flushNeeded();}}

		public void setMap(ArrayListMultimap<String, String> map) {try{__CLR4_1_101eo81eo8luszwbrk.R.inc(65692);
			__CLR4_1_101eo81eo8luszwbrk.R.inc(65693);this.map = map;
		}finally{__CLR4_1_101eo81eo8luszwbrk.R.flushNeeded();}}

		@Override
		public String toString() {try{__CLR4_1_101eo81eo8luszwbrk.R.inc(65694);
			__CLR4_1_101eo81eo8luszwbrk.R.inc(65695);return String.format("VO:{name->%s,map->%s}", this.name, this.map.toString());
		}finally{__CLR4_1_101eo81eo8luszwbrk.R.flushNeeded();}}
	}
}
