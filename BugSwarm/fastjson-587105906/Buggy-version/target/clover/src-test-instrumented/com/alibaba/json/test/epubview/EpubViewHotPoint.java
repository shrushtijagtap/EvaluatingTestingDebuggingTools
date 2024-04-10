/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.epubview;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * \u70ed\u70b9
 * @author renci
 *
 */
public class EpubViewHotPoint implements Serializable  {public static class __CLR4_1_1027s427s4luszwilw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,103482,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	private static final long serialVersionUID = 2430184364840193603L;
	
	/**
	 * \u70ed\u70b9\u7c7b\u578b\uff1a
	 * Normal\uff1a\u666e\u901a\u70ed\u70b9\uff0c\u663e\u793a\u56fe\u6807\uff0c\u6709iconzone\u3001iconsrc\u6807\u7b7e
	 * Hide\uff1a\u9690\u85cf\u70ed\u70b9\uff0c\u4e0d\u4f1a\u663e\u793a\u56fe\u6807\uff0c\u65e0iconzone\u3001iconsrc\u6807\u7b7e
	 * BkHightLight\uff1a\u80cc\u666f\u9ad8\u4eae\u70ed\u70b9
	 */
	private String type;
	/**
	 * \u70ed\u70b9\u884c\u4e3a\u540d\u79f0
	 */
	private String actionname;
	
	/**
	 * \u70ed\u70b9\u6587\u4ef6\u7c7b\u578b\uff1a
	 * text/plain\uff1a\u6587\u672c
	 * audio/mpeg\uff1a\u97f3\u9891
	 * video/mpeg\uff1a\u89c6\u9891
	 * image/jpeg\uff1a\u56fe\u7247
	 * application/x-book\uff1a\u8bfe\u6587\u70ed\u70b9\u5f39\u51fa\u6846
	 * application/x-practice\uff1a\u8bfe\u6587\u7ec3\u4e60
	 * office\uff1aoffice\u6587\u6863\u683c\u5f0f
	 * audio/highlight\uff1a\u97f3\u9891\u80cc\u666f\u9ad8\u4eae
	 * webview/swf\uff1aflash
	 */
	private String actiontype;
	
	/**
	 * \u70ed\u70b9\u6587\u4ef6\u4f4d\u7f6e
	 */
	private String src;
	
	/**
	 * \u52a0\u5bc6\u70ed\u70b9\u6587\u4ef6\u4f4d\u7f6e
	 */
	private String dcfSrc;
	
	/**
	 * \u9ed8\u8ba4\u70ed\u70b9\u6587\u4ef6\u539f\u6587\u4ef6\u540d
	 */
	private String description;
	
	/**
	 * application/x-book\uff1a\u8bfe\u6587\u70ed\u70b9\u5f39\u51fa\u6846\uff08\u81ea\u5b9a\u4e49\u70ed\u70b9\uff09\u7684\u6807\u9898
	 */
	private String title;
	
	/**
	 * application/x-book\uff1a\u8bfe\u6587\u70ed\u70b9\u5f39\u51fa\u6846\uff08\u81ea\u5b9a\u4e49\u70ed\u70b9\uff09\u7684\u5185\u5bb9
	 */
	private String content;
	
	/**
	 * application/x-book\uff1a\u8bfe\u6587\u70ed\u70b9\u5f39\u51fa\u6846\uff08\u81ea\u5b9a\u4e49\u70ed\u70b9\uff09\u7684\u9644\u52a0\u83dc\u5355\u5217\u8868
	 */
	private String menulist;
	
	/**
	 * application/x-book\uff1a\u8bfe\u6587\u70ed\u70b9\u5f39\u51fa\u6846\uff08\u81ea\u5b9a\u4e49\u70ed\u70b9\uff09\u7684\u80cc\u666f\u6717\u8bfb\u97f3\u9891\u6e90\u8def\u5f84.
	 */
	private String reading;
	
	/**
	 * application/x-book\uff1a\u8bfe\u6587\u70ed\u70b9\u5f39\u51fa\u6846\uff08\u81ea\u5b9a\u4e49\u70ed\u70b9\uff09\u662f\u5426\u652f\u6301\u753b\u7b14
	 */
	private String pen;
	
	/**
	 * application/x-book\uff1a\u8bfe\u6587\u70ed\u70b9\u5f39\u51fa\u6846\uff08\u81ea\u5b9a\u4e49\u70ed\u70b9\uff09\u662f\u5426\u652f\u6301\u5b57\u5178
	 */
	private String dictionary;
	
	/**
	 * \u53c2\u6570
	 */
	private Map<String, String> parameters;
	
	/**
	 * \u56fe\u7247\u533a\u57df\u5de6\u4e0a\u89d2X\u503c
	 */
	private String left;
	
	/**
	 * \u56fe\u7247\u533a\u57df\u5de6\u4e0a\u89d2Y\u503c
	 */
	private String top;
	
	/**
	 * \u56fe\u7247\u533a\u57df\u53f3\u4e0b\u89d2X\u503c
	 */
	private String right;
	
	/**
	 * \u56fe\u7247\u533a\u57df\u53f3\u4e0b\u89d2Y\u503c
	 */
	private String bottom;
	
	/**
	 * \u70ed\u70b9\u56fe\u6807\u5b58\u653e\u8def\u5f84\uff0c\u9690\u85cf\u70ed\u70b9\u3001\u80cc\u666f\u9ad8\u4eae\u70ed\u70b9\u53ef\u4ee5\u4e0d\u542b\u8be5\u503c
	 */
	private String iconSrc;
	
	private String starttime;
	private String endtime;
	
	/**
	 * \u70ed\u70b9\u533a\u57df
	 */
	private List<EpubViewHotPointZone> zoneList;

	public String getType() {try{__CLR4_1_1027s427s4luszwilw.R.inc(103396);
		__CLR4_1_1027s427s4luszwilw.R.inc(103397);return type;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public void setType(String type) {try{__CLR4_1_1027s427s4luszwilw.R.inc(103398);
		__CLR4_1_1027s427s4luszwilw.R.inc(103399);this.type = type;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public String getActionname() {try{__CLR4_1_1027s427s4luszwilw.R.inc(103400);
		__CLR4_1_1027s427s4luszwilw.R.inc(103401);return actionname;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public void setActionname(String actionname) {try{__CLR4_1_1027s427s4luszwilw.R.inc(103402);
		__CLR4_1_1027s427s4luszwilw.R.inc(103403);this.actionname = actionname;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public String getActiontype() {try{__CLR4_1_1027s427s4luszwilw.R.inc(103404);
		__CLR4_1_1027s427s4luszwilw.R.inc(103405);return actiontype;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public void setActiontype(String actiontype) {try{__CLR4_1_1027s427s4luszwilw.R.inc(103406);
		__CLR4_1_1027s427s4luszwilw.R.inc(103407);this.actiontype = actiontype;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public String getSrc() {try{__CLR4_1_1027s427s4luszwilw.R.inc(103408);
		__CLR4_1_1027s427s4luszwilw.R.inc(103409);return src;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public void setSrc(String src) {try{__CLR4_1_1027s427s4luszwilw.R.inc(103410);
		__CLR4_1_1027s427s4luszwilw.R.inc(103411);this.src = src;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public String getDcfSrc() {try{__CLR4_1_1027s427s4luszwilw.R.inc(103412);
		__CLR4_1_1027s427s4luszwilw.R.inc(103413);return dcfSrc;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public void setDcfSrc(String dcfSrc) {try{__CLR4_1_1027s427s4luszwilw.R.inc(103414);
		__CLR4_1_1027s427s4luszwilw.R.inc(103415);this.dcfSrc = dcfSrc;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public String getDescription() {try{__CLR4_1_1027s427s4luszwilw.R.inc(103416);
		__CLR4_1_1027s427s4luszwilw.R.inc(103417);return description;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public void setDescription(String description) {try{__CLR4_1_1027s427s4luszwilw.R.inc(103418);
		__CLR4_1_1027s427s4luszwilw.R.inc(103419);this.description = description;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public String getTitle() {try{__CLR4_1_1027s427s4luszwilw.R.inc(103420);
		__CLR4_1_1027s427s4luszwilw.R.inc(103421);return title;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public void setTitle(String title) {try{__CLR4_1_1027s427s4luszwilw.R.inc(103422);
		__CLR4_1_1027s427s4luszwilw.R.inc(103423);this.title = title;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public String getContent() {try{__CLR4_1_1027s427s4luszwilw.R.inc(103424);
		__CLR4_1_1027s427s4luszwilw.R.inc(103425);return content;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public void setContent(String content) {try{__CLR4_1_1027s427s4luszwilw.R.inc(103426);
		__CLR4_1_1027s427s4luszwilw.R.inc(103427);this.content = content;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public String getMenulist() {try{__CLR4_1_1027s427s4luszwilw.R.inc(103428);
		__CLR4_1_1027s427s4luszwilw.R.inc(103429);return menulist;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public void setMenulist(String menulist) {try{__CLR4_1_1027s427s4luszwilw.R.inc(103430);
		__CLR4_1_1027s427s4luszwilw.R.inc(103431);this.menulist = menulist;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public String getReading() {try{__CLR4_1_1027s427s4luszwilw.R.inc(103432);
		__CLR4_1_1027s427s4luszwilw.R.inc(103433);return reading;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public void setReading(String reading) {try{__CLR4_1_1027s427s4luszwilw.R.inc(103434);
		__CLR4_1_1027s427s4luszwilw.R.inc(103435);this.reading = reading;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public String getPen() {try{__CLR4_1_1027s427s4luszwilw.R.inc(103436);
		__CLR4_1_1027s427s4luszwilw.R.inc(103437);return pen;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public void setPen(String pen) {try{__CLR4_1_1027s427s4luszwilw.R.inc(103438);
		__CLR4_1_1027s427s4luszwilw.R.inc(103439);this.pen = pen;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public String getDictionary() {try{__CLR4_1_1027s427s4luszwilw.R.inc(103440);
		__CLR4_1_1027s427s4luszwilw.R.inc(103441);return dictionary;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public void setDictionary(String dictionary) {try{__CLR4_1_1027s427s4luszwilw.R.inc(103442);
		__CLR4_1_1027s427s4luszwilw.R.inc(103443);this.dictionary = dictionary;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public Map<String, String> getParameters() {try{__CLR4_1_1027s427s4luszwilw.R.inc(103444);
		__CLR4_1_1027s427s4luszwilw.R.inc(103445);return parameters;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public void setParameters(Map<String, String> parameters) {try{__CLR4_1_1027s427s4luszwilw.R.inc(103446);
		__CLR4_1_1027s427s4luszwilw.R.inc(103447);this.parameters = parameters;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public static long getSerialversionuid() {try{__CLR4_1_1027s427s4luszwilw.R.inc(103448);
		__CLR4_1_1027s427s4luszwilw.R.inc(103449);return serialVersionUID;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public String getLeft() {try{__CLR4_1_1027s427s4luszwilw.R.inc(103450);
		__CLR4_1_1027s427s4luszwilw.R.inc(103451);return left;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public void setLeft(String left) {try{__CLR4_1_1027s427s4luszwilw.R.inc(103452);
		__CLR4_1_1027s427s4luszwilw.R.inc(103453);this.left = left;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public String getTop() {try{__CLR4_1_1027s427s4luszwilw.R.inc(103454);
		__CLR4_1_1027s427s4luszwilw.R.inc(103455);return top;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public void setTop(String top) {try{__CLR4_1_1027s427s4luszwilw.R.inc(103456);
		__CLR4_1_1027s427s4luszwilw.R.inc(103457);this.top = top;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public String getRight() {try{__CLR4_1_1027s427s4luszwilw.R.inc(103458);
		__CLR4_1_1027s427s4luszwilw.R.inc(103459);return right;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public void setRight(String right) {try{__CLR4_1_1027s427s4luszwilw.R.inc(103460);
		__CLR4_1_1027s427s4luszwilw.R.inc(103461);this.right = right;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public String getBottom() {try{__CLR4_1_1027s427s4luszwilw.R.inc(103462);
		__CLR4_1_1027s427s4luszwilw.R.inc(103463);return bottom;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public void setBottom(String bottom) {try{__CLR4_1_1027s427s4luszwilw.R.inc(103464);
		__CLR4_1_1027s427s4luszwilw.R.inc(103465);this.bottom = bottom;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public String getIconSrc() {try{__CLR4_1_1027s427s4luszwilw.R.inc(103466);
		__CLR4_1_1027s427s4luszwilw.R.inc(103467);return iconSrc;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public void setIconSrc(String iconSrc) {try{__CLR4_1_1027s427s4luszwilw.R.inc(103468);
		__CLR4_1_1027s427s4luszwilw.R.inc(103469);this.iconSrc = iconSrc;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public List<EpubViewHotPointZone> getZoneList() {try{__CLR4_1_1027s427s4luszwilw.R.inc(103470);
		__CLR4_1_1027s427s4luszwilw.R.inc(103471);return zoneList;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

	public void setZoneList(List<EpubViewHotPointZone> zoneList) {try{__CLR4_1_1027s427s4luszwilw.R.inc(103472);
		__CLR4_1_1027s427s4luszwilw.R.inc(103473);this.zoneList = zoneList;
	}finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

    public String getStarttime()
    {try{__CLR4_1_1027s427s4luszwilw.R.inc(103474);
        __CLR4_1_1027s427s4luszwilw.R.inc(103475);return starttime;
    }finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

    public void setStarttime(String starttime)
    {try{__CLR4_1_1027s427s4luszwilw.R.inc(103476);
        __CLR4_1_1027s427s4luszwilw.R.inc(103477);this.starttime = starttime;
    }finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

    public String getEndtime()
    {try{__CLR4_1_1027s427s4luszwilw.R.inc(103478);
        __CLR4_1_1027s427s4luszwilw.R.inc(103479);return endtime;
    }finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

    public void setEndtime(String endtime)
    {try{__CLR4_1_1027s427s4luszwilw.R.inc(103480);
        __CLR4_1_1027s427s4luszwilw.R.inc(103481);this.endtime = endtime;
    }finally{__CLR4_1_1027s427s4luszwilw.R.flushNeeded();}}

    
}
