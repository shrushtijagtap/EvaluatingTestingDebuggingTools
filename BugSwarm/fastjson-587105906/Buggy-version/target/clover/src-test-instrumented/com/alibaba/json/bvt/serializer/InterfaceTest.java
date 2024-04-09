/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

public class InterfaceTest extends TestCase {static class __CLR4_1_101rfx1rfxlusqkjka{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,82235,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	public void test_interface() throws Exception {__CLR4_1_101rfx1rfxlusqkjka.R.globalSliceStart(getClass().getName(),82221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108tv72r1rfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rfx1rfxlusqkjka.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rfx1rfxlusqkjka.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.InterfaceTest.test_interface",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82221,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108tv72r1rfx() throws Exception{try{__CLR4_1_101rfx1rfxlusqkjka.R.inc(82221);
		__CLR4_1_101rfx1rfxlusqkjka.R.inc(82222);A a = new A();
		__CLR4_1_101rfx1rfxlusqkjka.R.inc(82223);a.setId(123);
		__CLR4_1_101rfx1rfxlusqkjka.R.inc(82224);a.setName("xasdf");
		
		__CLR4_1_101rfx1rfxlusqkjka.R.inc(82225);String text = JSON.toJSONString(a);
		__CLR4_1_101rfx1rfxlusqkjka.R.inc(82226);Assert.assertEquals("{\"ID\":123,\"Name\":\"xasdf\"}", text);
	}finally{__CLR4_1_101rfx1rfxlusqkjka.R.flushNeeded();}}
	
	public static class A implements IA, IB {
		private int id;
		private String name;
		public int getId() {try{__CLR4_1_101rfx1rfxlusqkjka.R.inc(82227);
			__CLR4_1_101rfx1rfxlusqkjka.R.inc(82228);return id;
		}finally{__CLR4_1_101rfx1rfxlusqkjka.R.flushNeeded();}}
		public void setId(int id) {try{__CLR4_1_101rfx1rfxlusqkjka.R.inc(82229);
			__CLR4_1_101rfx1rfxlusqkjka.R.inc(82230);this.id = id;
		}finally{__CLR4_1_101rfx1rfxlusqkjka.R.flushNeeded();}}
		public String getName() {try{__CLR4_1_101rfx1rfxlusqkjka.R.inc(82231);
			__CLR4_1_101rfx1rfxlusqkjka.R.inc(82232);return name;
		}finally{__CLR4_1_101rfx1rfxlusqkjka.R.flushNeeded();}}
		public void setName(String name) {try{__CLR4_1_101rfx1rfxlusqkjka.R.inc(82233);
			__CLR4_1_101rfx1rfxlusqkjka.R.inc(82234);this.name = name;
		}finally{__CLR4_1_101rfx1rfxlusqkjka.R.flushNeeded();}}
	}
	
	public static interface IA {
		@JSONField(name="ID")
		int getId();
	}
	
	public static interface IB {
		@JSONField(name="Name")
		String getName();
	}
}
