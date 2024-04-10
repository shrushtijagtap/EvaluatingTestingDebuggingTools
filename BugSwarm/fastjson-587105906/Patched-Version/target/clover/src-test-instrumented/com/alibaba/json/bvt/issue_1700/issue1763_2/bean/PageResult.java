/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1700.issue1763_2.bean;

import java.util.List;

/**
 * \u5206\u9875\u4fe1\u606f
 * @param <T>
 *
 * @author cnlyml
 */
public class PageResult<T> {public static class __CLR4_5_21cia1cialusyjt19{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,62898,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Integer pageNum;
    private Integer pageSize;
    private Integer size;
    private Integer startRow;
    private Integer endRow;
    private Integer total;
    private Integer pages;

    private List<T> list;

    public Integer getPageNum() {try{__CLR4_5_21cia1cialusyjt19.R.inc(62866);
        __CLR4_5_21cia1cialusyjt19.R.inc(62867);return pageNum;
    }finally{__CLR4_5_21cia1cialusyjt19.R.flushNeeded();}}

    public void setPageNum(Integer pageNum) {try{__CLR4_5_21cia1cialusyjt19.R.inc(62868);
        __CLR4_5_21cia1cialusyjt19.R.inc(62869);this.pageNum = pageNum;
    }finally{__CLR4_5_21cia1cialusyjt19.R.flushNeeded();}}

    public Integer getPageSize() {try{__CLR4_5_21cia1cialusyjt19.R.inc(62870);
        __CLR4_5_21cia1cialusyjt19.R.inc(62871);return pageSize;
    }finally{__CLR4_5_21cia1cialusyjt19.R.flushNeeded();}}

    public void setPageSize(Integer pageSize) {try{__CLR4_5_21cia1cialusyjt19.R.inc(62872);
        __CLR4_5_21cia1cialusyjt19.R.inc(62873);this.pageSize = pageSize;
    }finally{__CLR4_5_21cia1cialusyjt19.R.flushNeeded();}}

    public Integer getSize() {try{__CLR4_5_21cia1cialusyjt19.R.inc(62874);
        __CLR4_5_21cia1cialusyjt19.R.inc(62875);return size;
    }finally{__CLR4_5_21cia1cialusyjt19.R.flushNeeded();}}

    public void setSize(Integer size) {try{__CLR4_5_21cia1cialusyjt19.R.inc(62876);
        __CLR4_5_21cia1cialusyjt19.R.inc(62877);this.size = size;
    }finally{__CLR4_5_21cia1cialusyjt19.R.flushNeeded();}}

    public Integer getStartRow() {try{__CLR4_5_21cia1cialusyjt19.R.inc(62878);
        __CLR4_5_21cia1cialusyjt19.R.inc(62879);return startRow;
    }finally{__CLR4_5_21cia1cialusyjt19.R.flushNeeded();}}

    public void setStartRow(Integer startRow) {try{__CLR4_5_21cia1cialusyjt19.R.inc(62880);
        __CLR4_5_21cia1cialusyjt19.R.inc(62881);this.startRow = startRow;
    }finally{__CLR4_5_21cia1cialusyjt19.R.flushNeeded();}}

    public Integer getEndRow() {try{__CLR4_5_21cia1cialusyjt19.R.inc(62882);
        __CLR4_5_21cia1cialusyjt19.R.inc(62883);return endRow;
    }finally{__CLR4_5_21cia1cialusyjt19.R.flushNeeded();}}

    public void setEndRow(Integer endRow) {try{__CLR4_5_21cia1cialusyjt19.R.inc(62884);
        __CLR4_5_21cia1cialusyjt19.R.inc(62885);this.endRow = endRow;
    }finally{__CLR4_5_21cia1cialusyjt19.R.flushNeeded();}}

    public Integer getTotal() {try{__CLR4_5_21cia1cialusyjt19.R.inc(62886);
        __CLR4_5_21cia1cialusyjt19.R.inc(62887);return total;
    }finally{__CLR4_5_21cia1cialusyjt19.R.flushNeeded();}}

    public void setTotal(Integer total) {try{__CLR4_5_21cia1cialusyjt19.R.inc(62888);
        __CLR4_5_21cia1cialusyjt19.R.inc(62889);this.total = total;
    }finally{__CLR4_5_21cia1cialusyjt19.R.flushNeeded();}}

    public Integer getPages() {try{__CLR4_5_21cia1cialusyjt19.R.inc(62890);
        __CLR4_5_21cia1cialusyjt19.R.inc(62891);return pages;
    }finally{__CLR4_5_21cia1cialusyjt19.R.flushNeeded();}}

    public void setPages(Integer pages) {try{__CLR4_5_21cia1cialusyjt19.R.inc(62892);
        __CLR4_5_21cia1cialusyjt19.R.inc(62893);this.pages = pages;
    }finally{__CLR4_5_21cia1cialusyjt19.R.flushNeeded();}}

    public List<T> getList() {try{__CLR4_5_21cia1cialusyjt19.R.inc(62894);
        __CLR4_5_21cia1cialusyjt19.R.inc(62895);return list;
    }finally{__CLR4_5_21cia1cialusyjt19.R.flushNeeded();}}

    public void setList(List<T> list) {try{__CLR4_5_21cia1cialusyjt19.R.inc(62896);
        __CLR4_5_21cia1cialusyjt19.R.inc(62897);this.list = list;
    }finally{__CLR4_5_21cia1cialusyjt19.R.flushNeeded();}}
}
