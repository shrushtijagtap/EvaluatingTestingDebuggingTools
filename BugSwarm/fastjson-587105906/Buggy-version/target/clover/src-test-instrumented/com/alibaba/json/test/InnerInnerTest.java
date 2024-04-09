/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.json.test.Outter.Inner;
import com.alibaba.json.test.Outter.Inner.InnerInner;
import com.google.gson.Gson;

import junit.framework.TestCase;

class Outter{public static class __CLR4_1_1021es21eslusqkrjy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,95152,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	private String name;
	private InnerInner ii;
	
	public String getName() {try{__CLR4_1_1021es21eslusqkrjy.R.inc(95140);
		__CLR4_1_1021es21eslusqkrjy.R.inc(95141);return name;
	}finally{__CLR4_1_1021es21eslusqkrjy.R.flushNeeded();}}


	public void setName(String name) {try{__CLR4_1_1021es21eslusqkrjy.R.inc(95142);
		__CLR4_1_1021es21eslusqkrjy.R.inc(95143);this.name = name;
	}finally{__CLR4_1_1021es21eslusqkrjy.R.flushNeeded();}}


	public InnerInner getIi() {try{__CLR4_1_1021es21eslusqkrjy.R.inc(95144);
		__CLR4_1_1021es21eslusqkrjy.R.inc(95145);return ii;
	}finally{__CLR4_1_1021es21eslusqkrjy.R.flushNeeded();}}


	public void setIi(InnerInner ii) {try{__CLR4_1_1021es21eslusqkrjy.R.inc(95146);
		__CLR4_1_1021es21eslusqkrjy.R.inc(95147);this.ii = ii;
	}finally{__CLR4_1_1021es21eslusqkrjy.R.flushNeeded();}}

	class Inner{
		class InnerInner{
			private String name;

			public String getName() {try{__CLR4_1_1021es21eslusqkrjy.R.inc(95148);
				__CLR4_1_1021es21eslusqkrjy.R.inc(95149);return name;
			}finally{__CLR4_1_1021es21eslusqkrjy.R.flushNeeded();}}

			public void setName(String name) {try{__CLR4_1_1021es21eslusqkrjy.R.inc(95150);
				__CLR4_1_1021es21eslusqkrjy.R.inc(95151);this.name = name;
			}finally{__CLR4_1_1021es21eslusqkrjy.R.flushNeeded();}}
		}
	}
}

public class InnerInnerTest extends TestCase{static class __CLR4_1_1021es21f4lusqkrjy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,95179,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;//\u6df1\u5c42\u5185\u90e8\u7c7b\u7684\u5e8f\u5217\u5316\u53cd\u5e8f\u5217\u5316\u6d4b\u8bd5

	public void testDeserialize(){__CLR4_1_1021es21f4lusqkrjy.R.globalSliceStart(getClass().getName(),95152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10epc82421f4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1021es21f4lusqkrjy.R.rethrow($CLV_t2$);}finally{__CLR4_1_1021es21f4lusqkrjy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.InnerInnerTest.testDeserialize",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),95152,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10epc82421f4(){try{__CLR4_1_1021es21f4lusqkrjy.R.inc(95152);//
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95153);String json = "{\"ii\":{\"name\":\"iicls\"},\"name\":\"ocls\"}";
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95154);Outter o = JSON.parseObject(json, Outter.class);
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95155);assertEquals("ocls", o.getName());
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95156);assertEquals("iicls", o.getIi().getName());
	}finally{__CLR4_1_1021es21f4lusqkrjy.R.flushNeeded();}}
	
	public void testSerialize(){__CLR4_1_1021es21f4lusqkrjy.R.globalSliceStart(getClass().getName(),95157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wt9p8521f9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1021es21f4lusqkrjy.R.rethrow($CLV_t2$);}finally{__CLR4_1_1021es21f4lusqkrjy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.InnerInnerTest.testSerialize",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),95157,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wt9p8521f9(){try{__CLR4_1_1021es21f4lusqkrjy.R.inc(95157);
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95158);Outter o = new Outter();
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95159);Inner i = o.new Inner();
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95160);InnerInner ii = i.new InnerInner();
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95161);ii.setName("iicls");
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95162);o.setIi(ii);
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95163);o.setName("ocls");
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95164);String json = JSON.toJSONString(o);
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95165);assertEquals("{\"ii\":{\"name\":\"iicls\"},\"name\":\"ocls\"}", json);
	}finally{__CLR4_1_1021es21f4lusqkrjy.R.flushNeeded();}}
	
	public void testGson(){__CLR4_1_1021es21f4lusqkrjy.R.globalSliceStart(getClass().getName(),95166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e4pl2421fi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1021es21f4lusqkrjy.R.rethrow($CLV_t2$);}finally{__CLR4_1_1021es21f4lusqkrjy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.InnerInnerTest.testGson",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),95166,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e4pl2421fi(){try{__CLR4_1_1021es21f4lusqkrjy.R.inc(95166);
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95167);Outter o = new Outter();
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95168);Inner i = o.new Inner();
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95169);InnerInner ii = i.new InnerInner();
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95170);ii.setName("iicls");
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95171);o.setIi(ii);
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95172);o.setName("ocls");
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95173);Gson gson = new Gson();//default setting
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95174);String json = gson.toJson(o);
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95175);assertEquals("{\"name\":\"ocls\",\"ii\":{\"name\":\"iicls\"}}", json);
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95176);Outter newO = gson.fromJson(json, Outter.class);
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95177);assertEquals("ocls", newO.getName());
		__CLR4_1_1021es21f4lusqkrjy.R.inc(95178);assertEquals("iicls", newO.getIi().getName());
	}finally{__CLR4_1_1021es21f4lusqkrjy.R.flushNeeded();}}
	
}
