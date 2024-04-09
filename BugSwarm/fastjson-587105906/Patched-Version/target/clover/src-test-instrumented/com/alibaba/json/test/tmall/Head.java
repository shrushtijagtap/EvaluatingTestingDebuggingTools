/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//**
 * Taobao.com Inc.
 * Copyright (c) 2003-2012 All Rights Reserved.
 */
package com.alibaba.json.test.tmall;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;

/**
 * \u0377\ufffd\ufffd\ufffd\ufffd\u03e2
 * @author benxiang.hhq
 * @version $Id: Head.java, v 0.1 2012-12-26 \ufffd\ufffd\ufffd\ufffd5:48:58 benxiang.hhq Exp $
 */
public class Head {public static class __CLR4_5_228n728n7lusvnloy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,104551,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @JSONField(name = "Status")
    private String status;
    @JSONField(name = "SearchTime")
    private String searchTime;
    @JSONField(name = "Version")
    private String version;
    @JSONField(name = "DocsFound")
    private String docsFound;
    @JSONField(name = "DocsRestrict")
    private String docsRestrict;
    @JSONField(name = "DocsReturn")
    private String docsReturn;
    @JSONField(name = "DocsSearch")
    private String docsSearch;
    @JSONField(name="HasPrePage")
    private String hasPrePage;
	@JSONField(name="HasNextPage")
    private String hasNextPage;
	public String getHasPrePage() {try{__CLR4_5_228n728n7lusvnloy.R.inc(104515);
		__CLR4_5_228n728n7lusvnloy.R.inc(104516);return hasPrePage;
	}finally{__CLR4_5_228n728n7lusvnloy.R.flushNeeded();}}
	public void setHasPrePage(String hasPrePage) {try{__CLR4_5_228n728n7lusvnloy.R.inc(104517);
		__CLR4_5_228n728n7lusvnloy.R.inc(104518);this.hasPrePage = hasPrePage;
	}finally{__CLR4_5_228n728n7lusvnloy.R.flushNeeded();}}
	public String getHasNextPage() {try{__CLR4_5_228n728n7lusvnloy.R.inc(104519);
		__CLR4_5_228n728n7lusvnloy.R.inc(104520);return hasNextPage;
	}finally{__CLR4_5_228n728n7lusvnloy.R.flushNeeded();}}
	public void setHasNextPage(String hasNextPage) {try{__CLR4_5_228n728n7lusvnloy.R.inc(104521);
		__CLR4_5_228n728n7lusvnloy.R.inc(104522);this.hasNextPage = hasNextPage;
	}finally{__CLR4_5_228n728n7lusvnloy.R.flushNeeded();}}
    public String getDocsFound() {try{__CLR4_5_228n728n7lusvnloy.R.inc(104523);
        __CLR4_5_228n728n7lusvnloy.R.inc(104524);return docsFound;
    }finally{__CLR4_5_228n728n7lusvnloy.R.flushNeeded();}}
    public void setDocsFound(String docsFound) {try{__CLR4_5_228n728n7lusvnloy.R.inc(104525);
        __CLR4_5_228n728n7lusvnloy.R.inc(104526);this.docsFound = docsFound;
    }finally{__CLR4_5_228n728n7lusvnloy.R.flushNeeded();}}
    public String getDocsRestrict() {try{__CLR4_5_228n728n7lusvnloy.R.inc(104527);
        __CLR4_5_228n728n7lusvnloy.R.inc(104528);return docsRestrict;
    }finally{__CLR4_5_228n728n7lusvnloy.R.flushNeeded();}}
    public void setDocsRestrict(String docsRestrict) {try{__CLR4_5_228n728n7lusvnloy.R.inc(104529);
        __CLR4_5_228n728n7lusvnloy.R.inc(104530);this.docsRestrict = docsRestrict;
    }finally{__CLR4_5_228n728n7lusvnloy.R.flushNeeded();}}
    public String getDocsReturn() {try{__CLR4_5_228n728n7lusvnloy.R.inc(104531);
        __CLR4_5_228n728n7lusvnloy.R.inc(104532);return docsReturn;
    }finally{__CLR4_5_228n728n7lusvnloy.R.flushNeeded();}}
    public void setDocsReturn(String docsReturn) {try{__CLR4_5_228n728n7lusvnloy.R.inc(104533);
        __CLR4_5_228n728n7lusvnloy.R.inc(104534);this.docsReturn = docsReturn;
    }finally{__CLR4_5_228n728n7lusvnloy.R.flushNeeded();}}
    public String getDocsSearch() {try{__CLR4_5_228n728n7lusvnloy.R.inc(104535);
        __CLR4_5_228n728n7lusvnloy.R.inc(104536);return docsSearch;
    }finally{__CLR4_5_228n728n7lusvnloy.R.flushNeeded();}}
    public void setDocsSearch(String docsSearch) {try{__CLR4_5_228n728n7lusvnloy.R.inc(104537);
        __CLR4_5_228n728n7lusvnloy.R.inc(104538);this.docsSearch = docsSearch;
    }finally{__CLR4_5_228n728n7lusvnloy.R.flushNeeded();}}
    public String getStatus() {try{__CLR4_5_228n728n7lusvnloy.R.inc(104539);
        __CLR4_5_228n728n7lusvnloy.R.inc(104540);return status;
    }finally{__CLR4_5_228n728n7lusvnloy.R.flushNeeded();}}
    public void setStatus(String status) {try{__CLR4_5_228n728n7lusvnloy.R.inc(104541);
        __CLR4_5_228n728n7lusvnloy.R.inc(104542);this.status = status;
    }finally{__CLR4_5_228n728n7lusvnloy.R.flushNeeded();}}
    public String getSearchTime() {try{__CLR4_5_228n728n7lusvnloy.R.inc(104543);
        __CLR4_5_228n728n7lusvnloy.R.inc(104544);return searchTime;
    }finally{__CLR4_5_228n728n7lusvnloy.R.flushNeeded();}}
    public void setSearchTime(String searchTime) {try{__CLR4_5_228n728n7lusvnloy.R.inc(104545);
        __CLR4_5_228n728n7lusvnloy.R.inc(104546);this.searchTime = searchTime;
    }finally{__CLR4_5_228n728n7lusvnloy.R.flushNeeded();}}
    public String getVersion() {try{__CLR4_5_228n728n7lusvnloy.R.inc(104547);
        __CLR4_5_228n728n7lusvnloy.R.inc(104548);return version;
    }finally{__CLR4_5_228n728n7lusvnloy.R.flushNeeded();}}
    public void setVersion(String version) {try{__CLR4_5_228n728n7lusvnloy.R.inc(104549);
        __CLR4_5_228n728n7lusvnloy.R.inc(104550);this.version = version;
    }finally{__CLR4_5_228n728n7lusvnloy.R.flushNeeded();}}
}