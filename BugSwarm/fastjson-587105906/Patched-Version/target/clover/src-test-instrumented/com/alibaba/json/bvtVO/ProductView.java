/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvtVO;

public class ProductView {public static class __CLR4_5_21zkq1zkqlusyjw75{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,92786,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Integer id;
    private String  keyword;
    private boolean hasProduct;
    private boolean hasCompany;
    private boolean hasBuyLead;
    private String  country;

    public Integer getId() {try{__CLR4_5_21zkq1zkqlusyjw75.R.inc(92762);
        __CLR4_5_21zkq1zkqlusyjw75.R.inc(92763);return id;
    }finally{__CLR4_5_21zkq1zkqlusyjw75.R.flushNeeded();}}

    public void setId(Integer id) {try{__CLR4_5_21zkq1zkqlusyjw75.R.inc(92764);
        __CLR4_5_21zkq1zkqlusyjw75.R.inc(92765);this.id = id;
    }finally{__CLR4_5_21zkq1zkqlusyjw75.R.flushNeeded();}}

    public String getKeyword() {try{__CLR4_5_21zkq1zkqlusyjw75.R.inc(92766);
        __CLR4_5_21zkq1zkqlusyjw75.R.inc(92767);return keyword;
    }finally{__CLR4_5_21zkq1zkqlusyjw75.R.flushNeeded();}}

    public void setKeyword(String keyword) {try{__CLR4_5_21zkq1zkqlusyjw75.R.inc(92768);
        __CLR4_5_21zkq1zkqlusyjw75.R.inc(92769);this.keyword = keyword;
    }finally{__CLR4_5_21zkq1zkqlusyjw75.R.flushNeeded();}}

    public boolean isHasProduct() {try{__CLR4_5_21zkq1zkqlusyjw75.R.inc(92770);
        __CLR4_5_21zkq1zkqlusyjw75.R.inc(92771);return hasProduct;
    }finally{__CLR4_5_21zkq1zkqlusyjw75.R.flushNeeded();}}

    public void setHasProduct(boolean hasProduct) {try{__CLR4_5_21zkq1zkqlusyjw75.R.inc(92772);
        __CLR4_5_21zkq1zkqlusyjw75.R.inc(92773);this.hasProduct = hasProduct;
    }finally{__CLR4_5_21zkq1zkqlusyjw75.R.flushNeeded();}}

    public boolean isHasCompany() {try{__CLR4_5_21zkq1zkqlusyjw75.R.inc(92774);
        __CLR4_5_21zkq1zkqlusyjw75.R.inc(92775);return hasCompany;
    }finally{__CLR4_5_21zkq1zkqlusyjw75.R.flushNeeded();}}

    public void setHasCompany(boolean hasCompany) {try{__CLR4_5_21zkq1zkqlusyjw75.R.inc(92776);
        __CLR4_5_21zkq1zkqlusyjw75.R.inc(92777);this.hasCompany = hasCompany;
    }finally{__CLR4_5_21zkq1zkqlusyjw75.R.flushNeeded();}}

    public boolean isHasBuyLead() {try{__CLR4_5_21zkq1zkqlusyjw75.R.inc(92778);
        __CLR4_5_21zkq1zkqlusyjw75.R.inc(92779);return hasBuyLead;
    }finally{__CLR4_5_21zkq1zkqlusyjw75.R.flushNeeded();}}

    public void setHasBuyLead(boolean hasBuyLead) {try{__CLR4_5_21zkq1zkqlusyjw75.R.inc(92780);
        __CLR4_5_21zkq1zkqlusyjw75.R.inc(92781);this.hasBuyLead = hasBuyLead;
    }finally{__CLR4_5_21zkq1zkqlusyjw75.R.flushNeeded();}}

    public String getCountry() {try{__CLR4_5_21zkq1zkqlusyjw75.R.inc(92782);
        __CLR4_5_21zkq1zkqlusyjw75.R.inc(92783);return country;
    }finally{__CLR4_5_21zkq1zkqlusyjw75.R.flushNeeded();}}

    public void setCountry(String country) {try{__CLR4_5_21zkq1zkqlusyjw75.R.inc(92784);
        __CLR4_5_21zkq1zkqlusyjw75.R.inc(92785);this.country = country;
    }finally{__CLR4_5_21zkq1zkqlusyjw75.R.flushNeeded();}}
}
