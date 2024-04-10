/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;

public class JSONTypeTest extends TestCase {static class __CLR4_1_10ybqybqluszw5o9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,44540,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	public void test_0() throws Exception {__CLR4_1_10ybqybqluszw5o9.R.globalSliceStart(getClass().getName(),44486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp2ybq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ybqybqluszw5o9.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ybqybqluszw5o9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTypeTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44486,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp2ybq() throws Exception{try{__CLR4_1_10ybqybqluszw5o9.R.inc(44486);
		__CLR4_1_10ybqybqluszw5o9.R.inc(44487);VO vo = new VO();
		__CLR4_1_10ybqybqluszw5o9.R.inc(44488);vo.setId(1001);
		__CLR4_1_10ybqybqluszw5o9.R.inc(44489);vo.setName("xx");
		__CLR4_1_10ybqybqluszw5o9.R.inc(44490);vo.setAge(33);

		__CLR4_1_10ybqybqluszw5o9.R.inc(44491);Assert.assertEquals("{\"age\":33,\"id\":1001,\"name\":\"xx\"}",
				JSON.toJSONString(vo));
	}finally{__CLR4_1_10ybqybqluszw5o9.R.flushNeeded();}}
	
	public void test_1() throws Exception {__CLR4_1_10ybqybqluszw5o9.R.globalSliceStart(getClass().getName(),44492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwlybw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ybqybqluszw5o9.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ybqybqluszw5o9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTypeTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44492,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwlybw() throws Exception{try{__CLR4_1_10ybqybqluszw5o9.R.inc(44492);
		__CLR4_1_10ybqybqluszw5o9.R.inc(44493);V1 vo = new V1();
		__CLR4_1_10ybqybqluszw5o9.R.inc(44494);vo.setId(1001);
		__CLR4_1_10ybqybqluszw5o9.R.inc(44495);vo.setName("xx");
		__CLR4_1_10ybqybqluszw5o9.R.inc(44496);vo.setAge(33);
		
		__CLR4_1_10ybqybqluszw5o9.R.inc(44497);Assert.assertEquals("{\"id\":1001,\"name\":\"xx\",\"age\":33}",
				JSON.toJSONString(vo));
	}finally{__CLR4_1_10ybqybqluszw5o9.R.flushNeeded();}}
	
	public void test_2() throws Exception {__CLR4_1_10ybqybqluszw5o9.R.globalSliceStart(getClass().getName(),44498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k44yc2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10ybqybqluszw5o9.R.rethrow($CLV_t2$);}finally{__CLR4_1_10ybqybqluszw5o9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONTypeTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),44498,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k44yc2() throws Exception{try{__CLR4_1_10ybqybqluszw5o9.R.inc(44498);
		__CLR4_1_10ybqybqluszw5o9.R.inc(44499);V1 vo = new V1();
		__CLR4_1_10ybqybqluszw5o9.R.inc(44500);vo.setId(1001);
		__CLR4_1_10ybqybqluszw5o9.R.inc(44501);vo.setName("xx");
		__CLR4_1_10ybqybqluszw5o9.R.inc(44502);vo.setAge(33);
		
		__CLR4_1_10ybqybqluszw5o9.R.inc(44503);Assert.assertEquals("{\"id\":1001,\"name\":\"xx\",\"age\":33}",
				JSON.toJSONString(vo));
	}finally{__CLR4_1_10ybqybqluszw5o9.R.flushNeeded();}}

	@JSONType
	public static class VO {
		private int id;
		private String name;
		private int age;

		public int getId() {try{__CLR4_1_10ybqybqluszw5o9.R.inc(44504);
			__CLR4_1_10ybqybqluszw5o9.R.inc(44505);return id;
		}finally{__CLR4_1_10ybqybqluszw5o9.R.flushNeeded();}}

		public void setId(int id) {try{__CLR4_1_10ybqybqluszw5o9.R.inc(44506);
			__CLR4_1_10ybqybqluszw5o9.R.inc(44507);this.id = id;
		}finally{__CLR4_1_10ybqybqluszw5o9.R.flushNeeded();}}

		public String getName() {try{__CLR4_1_10ybqybqluszw5o9.R.inc(44508);
			__CLR4_1_10ybqybqluszw5o9.R.inc(44509);return name;
		}finally{__CLR4_1_10ybqybqluszw5o9.R.flushNeeded();}}

		public void setName(String name) {try{__CLR4_1_10ybqybqluszw5o9.R.inc(44510);
			__CLR4_1_10ybqybqluszw5o9.R.inc(44511);this.name = name;
		}finally{__CLR4_1_10ybqybqluszw5o9.R.flushNeeded();}}

		public int getAge() {try{__CLR4_1_10ybqybqluszw5o9.R.inc(44512);
			__CLR4_1_10ybqybqluszw5o9.R.inc(44513);return age;
		}finally{__CLR4_1_10ybqybqluszw5o9.R.flushNeeded();}}

		public void setAge(int age) {try{__CLR4_1_10ybqybqluszw5o9.R.inc(44514);
			__CLR4_1_10ybqybqluszw5o9.R.inc(44515);this.age = age;
		}finally{__CLR4_1_10ybqybqluszw5o9.R.flushNeeded();}}
	}

	@JSONType(orders = { "id", "name", "age" })
	public static class V1 {
		private int id;
		private String name;
		private int age;

		public int getId() {try{__CLR4_1_10ybqybqluszw5o9.R.inc(44516);
			__CLR4_1_10ybqybqluszw5o9.R.inc(44517);return id;
		}finally{__CLR4_1_10ybqybqluszw5o9.R.flushNeeded();}}

		public void setId(int id) {try{__CLR4_1_10ybqybqluszw5o9.R.inc(44518);
			__CLR4_1_10ybqybqluszw5o9.R.inc(44519);this.id = id;
		}finally{__CLR4_1_10ybqybqluszw5o9.R.flushNeeded();}}

		public String getName() {try{__CLR4_1_10ybqybqluszw5o9.R.inc(44520);
			__CLR4_1_10ybqybqluszw5o9.R.inc(44521);return name;
		}finally{__CLR4_1_10ybqybqluszw5o9.R.flushNeeded();}}

		public void setName(String name) {try{__CLR4_1_10ybqybqluszw5o9.R.inc(44522);
			__CLR4_1_10ybqybqluszw5o9.R.inc(44523);this.name = name;
		}finally{__CLR4_1_10ybqybqluszw5o9.R.flushNeeded();}}

		public int getAge() {try{__CLR4_1_10ybqybqluszw5o9.R.inc(44524);
			__CLR4_1_10ybqybqluszw5o9.R.inc(44525);return age;
		}finally{__CLR4_1_10ybqybqluszw5o9.R.flushNeeded();}}

		public void setAge(int age) {try{__CLR4_1_10ybqybqluszw5o9.R.inc(44526);
			__CLR4_1_10ybqybqluszw5o9.R.inc(44527);this.age = age;
		}finally{__CLR4_1_10ybqybqluszw5o9.R.flushNeeded();}}
	}
	
	@JSONType(orders = { "id", "name", "age" },asm=false)
	private class V2 {
		private int id;
		private String name;
		private int age;
		
		public int getId() {try{__CLR4_1_10ybqybqluszw5o9.R.inc(44528);
			__CLR4_1_10ybqybqluszw5o9.R.inc(44529);return id;
		}finally{__CLR4_1_10ybqybqluszw5o9.R.flushNeeded();}}
		
		public void setId(int id) {try{__CLR4_1_10ybqybqluszw5o9.R.inc(44530);
			__CLR4_1_10ybqybqluszw5o9.R.inc(44531);this.id = id;
		}finally{__CLR4_1_10ybqybqluszw5o9.R.flushNeeded();}}
		
		public String getName() {try{__CLR4_1_10ybqybqluszw5o9.R.inc(44532);
			__CLR4_1_10ybqybqluszw5o9.R.inc(44533);return name;
		}finally{__CLR4_1_10ybqybqluszw5o9.R.flushNeeded();}}
		
		public void setName(String name) {try{__CLR4_1_10ybqybqluszw5o9.R.inc(44534);
			__CLR4_1_10ybqybqluszw5o9.R.inc(44535);this.name = name;
		}finally{__CLR4_1_10ybqybqluszw5o9.R.flushNeeded();}}
		
		public int getAge() {try{__CLR4_1_10ybqybqluszw5o9.R.inc(44536);
			__CLR4_1_10ybqybqluszw5o9.R.inc(44537);return age;
		}finally{__CLR4_1_10ybqybqluszw5o9.R.flushNeeded();}}
		
		public void setAge(int age) {try{__CLR4_1_10ybqybqluszw5o9.R.inc(44538);
			__CLR4_1_10ybqybqluszw5o9.R.inc(44539);this.age = age;
		}finally{__CLR4_1_10ybqybqluszw5o9.R.flushNeeded();}}
	}
}
