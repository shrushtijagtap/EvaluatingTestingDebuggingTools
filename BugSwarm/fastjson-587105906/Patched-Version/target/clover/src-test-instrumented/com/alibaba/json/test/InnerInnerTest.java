/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.json.test.Outter.Inner;
import com.alibaba.json.test.Outter.Inner.InnerInner;
import com.google.gson.Gson;

import junit.framework.TestCase;

class Outter{public static class __CLR4_5_221eh21ehlusyjwfw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,95141,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	private String name;
	private InnerInner ii;
	
	public String getName() {try{__CLR4_5_221eh21ehlusyjwfw.R.inc(95129);
		__CLR4_5_221eh21ehlusyjwfw.R.inc(95130);return name;
	}finally{__CLR4_5_221eh21ehlusyjwfw.R.flushNeeded();}}


	public void setName(String name) {try{__CLR4_5_221eh21ehlusyjwfw.R.inc(95131);
		__CLR4_5_221eh21ehlusyjwfw.R.inc(95132);this.name = name;
	}finally{__CLR4_5_221eh21ehlusyjwfw.R.flushNeeded();}}


	public InnerInner getIi() {try{__CLR4_5_221eh21ehlusyjwfw.R.inc(95133);
		__CLR4_5_221eh21ehlusyjwfw.R.inc(95134);return ii;
	}finally{__CLR4_5_221eh21ehlusyjwfw.R.flushNeeded();}}


	public void setIi(InnerInner ii) {try{__CLR4_5_221eh21ehlusyjwfw.R.inc(95135);
		__CLR4_5_221eh21ehlusyjwfw.R.inc(95136);this.ii = ii;
	}finally{__CLR4_5_221eh21ehlusyjwfw.R.flushNeeded();}}

	class Inner{
		class InnerInner{
			private String name;

			public String getName() {try{__CLR4_5_221eh21ehlusyjwfw.R.inc(95137);
				__CLR4_5_221eh21ehlusyjwfw.R.inc(95138);return name;
			}finally{__CLR4_5_221eh21ehlusyjwfw.R.flushNeeded();}}

			public void setName(String name) {try{__CLR4_5_221eh21ehlusyjwfw.R.inc(95139);
				__CLR4_5_221eh21ehlusyjwfw.R.inc(95140);this.name = name;
			}finally{__CLR4_5_221eh21ehlusyjwfw.R.flushNeeded();}}
		}
	}
}

public class InnerInnerTest extends TestCase{static class __CLR4_5_221eh21etlusyjwfw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,95168,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;//\u6df1\u5c42\u5185\u90e8\u7c7b\u7684\u5e8f\u5217\u5316\u53cd\u5e8f\u5217\u5316\u6d4b\u8bd5

	public void testDeserialize(){__CLR4_5_221eh21etlusyjwfw.R.globalSliceStart(getClass().getName(),95141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2epc82421et();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_221eh21etlusyjwfw.R.rethrow($CLV_t2$);}finally{__CLR4_5_221eh21etlusyjwfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.InnerInnerTest.testDeserialize",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),95141,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2epc82421et(){try{__CLR4_5_221eh21etlusyjwfw.R.inc(95141);//
		__CLR4_5_221eh21etlusyjwfw.R.inc(95142);String json = "{\"ii\":{\"name\":\"iicls\"},\"name\":\"ocls\"}";
		__CLR4_5_221eh21etlusyjwfw.R.inc(95143);Outter o = JSON.parseObject(json, Outter.class);
		__CLR4_5_221eh21etlusyjwfw.R.inc(95144);assertEquals("ocls", o.getName());
		__CLR4_5_221eh21etlusyjwfw.R.inc(95145);assertEquals("iicls", o.getIi().getName());
	}finally{__CLR4_5_221eh21etlusyjwfw.R.flushNeeded();}}
	
	public void testSerialize(){__CLR4_5_221eh21etlusyjwfw.R.globalSliceStart(getClass().getName(),95146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wt9p8521ey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_221eh21etlusyjwfw.R.rethrow($CLV_t2$);}finally{__CLR4_5_221eh21etlusyjwfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.InnerInnerTest.testSerialize",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),95146,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wt9p8521ey(){try{__CLR4_5_221eh21etlusyjwfw.R.inc(95146);
		__CLR4_5_221eh21etlusyjwfw.R.inc(95147);Outter o = new Outter();
		__CLR4_5_221eh21etlusyjwfw.R.inc(95148);Inner i = o.new Inner();
		__CLR4_5_221eh21etlusyjwfw.R.inc(95149);InnerInner ii = i.new InnerInner();
		__CLR4_5_221eh21etlusyjwfw.R.inc(95150);ii.setName("iicls");
		__CLR4_5_221eh21etlusyjwfw.R.inc(95151);o.setIi(ii);
		__CLR4_5_221eh21etlusyjwfw.R.inc(95152);o.setName("ocls");
		__CLR4_5_221eh21etlusyjwfw.R.inc(95153);String json = JSON.toJSONString(o);
		__CLR4_5_221eh21etlusyjwfw.R.inc(95154);assertEquals("{\"ii\":{\"name\":\"iicls\"},\"name\":\"ocls\"}", json);
	}finally{__CLR4_5_221eh21etlusyjwfw.R.flushNeeded();}}
	
	public void testGson(){__CLR4_5_221eh21etlusyjwfw.R.globalSliceStart(getClass().getName(),95155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e4pl2421f7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_221eh21etlusyjwfw.R.rethrow($CLV_t2$);}finally{__CLR4_5_221eh21etlusyjwfw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.InnerInnerTest.testGson",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),95155,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e4pl2421f7(){try{__CLR4_5_221eh21etlusyjwfw.R.inc(95155);
		__CLR4_5_221eh21etlusyjwfw.R.inc(95156);Outter o = new Outter();
		__CLR4_5_221eh21etlusyjwfw.R.inc(95157);Inner i = o.new Inner();
		__CLR4_5_221eh21etlusyjwfw.R.inc(95158);InnerInner ii = i.new InnerInner();
		__CLR4_5_221eh21etlusyjwfw.R.inc(95159);ii.setName("iicls");
		__CLR4_5_221eh21etlusyjwfw.R.inc(95160);o.setIi(ii);
		__CLR4_5_221eh21etlusyjwfw.R.inc(95161);o.setName("ocls");
		__CLR4_5_221eh21etlusyjwfw.R.inc(95162);Gson gson = new Gson();//default setting
		__CLR4_5_221eh21etlusyjwfw.R.inc(95163);String json = gson.toJson(o);
		__CLR4_5_221eh21etlusyjwfw.R.inc(95164);assertEquals("{\"name\":\"ocls\",\"ii\":{\"name\":\"iicls\"}}", json);
		__CLR4_5_221eh21etlusyjwfw.R.inc(95165);Outter newO = gson.fromJson(json, Outter.class);
		__CLR4_5_221eh21etlusyjwfw.R.inc(95166);assertEquals("ocls", newO.getName());
		__CLR4_5_221eh21etlusyjwfw.R.inc(95167);assertEquals("iicls", newO.getIi().getName());
	}finally{__CLR4_5_221eh21etlusyjwfw.R.flushNeeded();}}
	
}
