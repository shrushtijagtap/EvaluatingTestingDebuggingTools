/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.epubview;

import java.io.Serializable;
import java.util.List;

public class EpubViewPage implements Serializable {public static class __CLR4_1_1027vg27vgluszwim2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,103534,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	private static final long serialVersionUID = -2198407838110786606L;
	
	//\u666e\u901aEpub\u4e66\u65f6\u4f7f\u7528
	private String src;
	private String imageUrl;
	private String pageNum;
	private List<EpubViewHotPoint> hotPoints;
	public String getImageUrl() {try{__CLR4_1_1027vg27vgluszwim2.R.inc(103516);
		__CLR4_1_1027vg27vgluszwim2.R.inc(103517);return imageUrl;
	}finally{__CLR4_1_1027vg27vgluszwim2.R.flushNeeded();}}
	public void setImageUrl(String imageUrl) {try{__CLR4_1_1027vg27vgluszwim2.R.inc(103518);
		__CLR4_1_1027vg27vgluszwim2.R.inc(103519);this.imageUrl = imageUrl;
	}finally{__CLR4_1_1027vg27vgluszwim2.R.flushNeeded();}}
	public String getPageNum() {try{__CLR4_1_1027vg27vgluszwim2.R.inc(103520);
		__CLR4_1_1027vg27vgluszwim2.R.inc(103521);return pageNum;
	}finally{__CLR4_1_1027vg27vgluszwim2.R.flushNeeded();}}
	public void setPageNum(String pageNum) {try{__CLR4_1_1027vg27vgluszwim2.R.inc(103522);
		__CLR4_1_1027vg27vgluszwim2.R.inc(103523);this.pageNum = pageNum;
	}finally{__CLR4_1_1027vg27vgluszwim2.R.flushNeeded();}}
	public List<EpubViewHotPoint> getHotPoints() {try{__CLR4_1_1027vg27vgluszwim2.R.inc(103524);
		__CLR4_1_1027vg27vgluszwim2.R.inc(103525);return hotPoints;
	}finally{__CLR4_1_1027vg27vgluszwim2.R.flushNeeded();}}
	public void setHotPoints(List<EpubViewHotPoint> hotPoints) {try{__CLR4_1_1027vg27vgluszwim2.R.inc(103526);
		__CLR4_1_1027vg27vgluszwim2.R.inc(103527);this.hotPoints = hotPoints;
	}finally{__CLR4_1_1027vg27vgluszwim2.R.flushNeeded();}}
	public static long getSerialversionuid() {try{__CLR4_1_1027vg27vgluszwim2.R.inc(103528);
		__CLR4_1_1027vg27vgluszwim2.R.inc(103529);return serialVersionUID;
	}finally{__CLR4_1_1027vg27vgluszwim2.R.flushNeeded();}}
    public String getSrc()
    {try{__CLR4_1_1027vg27vgluszwim2.R.inc(103530);
        __CLR4_1_1027vg27vgluszwim2.R.inc(103531);return src;
    }finally{__CLR4_1_1027vg27vgluszwim2.R.flushNeeded();}}
    public void setSrc(String src)
    {try{__CLR4_1_1027vg27vgluszwim2.R.inc(103532);
        __CLR4_1_1027vg27vgluszwim2.R.inc(103533);this.src = src;
    }finally{__CLR4_1_1027vg27vgluszwim2.R.flushNeeded();}}
	
}
