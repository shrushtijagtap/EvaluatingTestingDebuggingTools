/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.epubview;

import java.io.Serializable;

public class EpubViewHotPointZone implements Serializable {public static class __CLR4_5_226vz26vzlusyjx0l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,102263,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	private static final long serialVersionUID = 7467644447749652248L;

	/**
	 * \u70ed\u70b9\u533a\u57df\u5de6\u4e0a\u89d2X\u503c
	 */
	private String left;
	
	/**
	 * \u70ed\u70b9\u533a\u57df\u5de6\u4e0a\u89d2Y\u503c
	 */
	private String top;
	
	/**
	 * \u70ed\u70b9\u533a\u57df\u53f3\u4e0b\u89d2X\u503c
	 */
	private String right;
	
	/**
	 * \u70ed\u70b9\u533a\u57df\u53f3\u4e0b\u89d2Y\u503c
	 */
	private String bottom;
	
	/**
	 * \u70ed\u70b9\u533a\u57df\u80cc\u666f\u989c\u8272
	 */
	private String color;
	
	/**
	 * \u70ed\u70b9\u533a\u57df\u900f\u660e\u5ea6\uff08\u767e\u5206\u6bd4\uff09\uff0c\u4e24\u4f4d\u5c0f\u6570
	 */
	private String transparency;

	public String getLeft() {try{__CLR4_5_226vz26vzlusyjx0l.R.inc(102239);
		__CLR4_5_226vz26vzlusyjx0l.R.inc(102240);return left;
	}finally{__CLR4_5_226vz26vzlusyjx0l.R.flushNeeded();}}

	public void setLeft(String left) {try{__CLR4_5_226vz26vzlusyjx0l.R.inc(102241);
		__CLR4_5_226vz26vzlusyjx0l.R.inc(102242);this.left = left;
	}finally{__CLR4_5_226vz26vzlusyjx0l.R.flushNeeded();}}

	public String getTop() {try{__CLR4_5_226vz26vzlusyjx0l.R.inc(102243);
		__CLR4_5_226vz26vzlusyjx0l.R.inc(102244);return top;
	}finally{__CLR4_5_226vz26vzlusyjx0l.R.flushNeeded();}}

	public void setTop(String top) {try{__CLR4_5_226vz26vzlusyjx0l.R.inc(102245);
		__CLR4_5_226vz26vzlusyjx0l.R.inc(102246);this.top = top;
	}finally{__CLR4_5_226vz26vzlusyjx0l.R.flushNeeded();}}

	public String getRight() {try{__CLR4_5_226vz26vzlusyjx0l.R.inc(102247);
		__CLR4_5_226vz26vzlusyjx0l.R.inc(102248);return right;
	}finally{__CLR4_5_226vz26vzlusyjx0l.R.flushNeeded();}}

	public void setRight(String right) {try{__CLR4_5_226vz26vzlusyjx0l.R.inc(102249);
		__CLR4_5_226vz26vzlusyjx0l.R.inc(102250);this.right = right;
	}finally{__CLR4_5_226vz26vzlusyjx0l.R.flushNeeded();}}

	public String getBottom() {try{__CLR4_5_226vz26vzlusyjx0l.R.inc(102251);
		__CLR4_5_226vz26vzlusyjx0l.R.inc(102252);return bottom;
	}finally{__CLR4_5_226vz26vzlusyjx0l.R.flushNeeded();}}

	public void setBottom(String bottom) {try{__CLR4_5_226vz26vzlusyjx0l.R.inc(102253);
		__CLR4_5_226vz26vzlusyjx0l.R.inc(102254);this.bottom = bottom;
	}finally{__CLR4_5_226vz26vzlusyjx0l.R.flushNeeded();}}

	public String getTransparency() {try{__CLR4_5_226vz26vzlusyjx0l.R.inc(102255);
		__CLR4_5_226vz26vzlusyjx0l.R.inc(102256);return transparency;
	}finally{__CLR4_5_226vz26vzlusyjx0l.R.flushNeeded();}}

	public void setTransparency(String transparency) {try{__CLR4_5_226vz26vzlusyjx0l.R.inc(102257);
		__CLR4_5_226vz26vzlusyjx0l.R.inc(102258);this.transparency = transparency;
	}finally{__CLR4_5_226vz26vzlusyjx0l.R.flushNeeded();}}

	public void setColor(String color) {try{__CLR4_5_226vz26vzlusyjx0l.R.inc(102259);
		__CLR4_5_226vz26vzlusyjx0l.R.inc(102260);this.color = color;
	}finally{__CLR4_5_226vz26vzlusyjx0l.R.flushNeeded();}}

	public String getColor() {try{__CLR4_5_226vz26vzlusyjx0l.R.inc(102261);
		__CLR4_5_226vz26vzlusyjx0l.R.inc(102262);return color;
	}finally{__CLR4_5_226vz26vzlusyjx0l.R.flushNeeded();}}
}
