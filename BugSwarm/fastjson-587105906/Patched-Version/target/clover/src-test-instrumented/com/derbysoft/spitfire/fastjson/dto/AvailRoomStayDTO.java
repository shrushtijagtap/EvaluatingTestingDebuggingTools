/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.derbysoft.spitfire.fastjson.dto;

import com.alibaba.fastjson.annotation.JSONField;

public class AvailRoomStayDTO extends AbstractDTO {public static class __CLR4_5_2292t292tlusvnlrt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,105105,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private RoomTypeDTO roomType;

    private RatePlanDTO ratePlan;

    private RoomRateDTO roomRate;

    private Integer quantity;

    private ProviderChainDTO providerChain;

    private LanguageType languageType;

    private TPAExtensionsDTO tpaExtensions;

    public RoomTypeDTO getRoomType() {try{__CLR4_5_2292t292tlusvnlrt.R.inc(105077);
        __CLR4_5_2292t292tlusvnlrt.R.inc(105078);return roomType;
    }finally{__CLR4_5_2292t292tlusvnlrt.R.flushNeeded();}}

    public void setRoomType(RoomTypeDTO roomType) {try{__CLR4_5_2292t292tlusvnlrt.R.inc(105079);
        __CLR4_5_2292t292tlusvnlrt.R.inc(105080);this.roomType = roomType;
    }finally{__CLR4_5_2292t292tlusvnlrt.R.flushNeeded();}}

    public RatePlanDTO getRatePlan() {try{__CLR4_5_2292t292tlusvnlrt.R.inc(105081);
        __CLR4_5_2292t292tlusvnlrt.R.inc(105082);return ratePlan;
    }finally{__CLR4_5_2292t292tlusvnlrt.R.flushNeeded();}}

    public void setRatePlan(RatePlanDTO ratePlan) {try{__CLR4_5_2292t292tlusvnlrt.R.inc(105083);
        __CLR4_5_2292t292tlusvnlrt.R.inc(105084);this.ratePlan = ratePlan;
    }finally{__CLR4_5_2292t292tlusvnlrt.R.flushNeeded();}}

    public RoomRateDTO getRoomRate() {try{__CLR4_5_2292t292tlusvnlrt.R.inc(105085);
        __CLR4_5_2292t292tlusvnlrt.R.inc(105086);return roomRate;
    }finally{__CLR4_5_2292t292tlusvnlrt.R.flushNeeded();}}

    public void setRoomRate(RoomRateDTO roomRate) {try{__CLR4_5_2292t292tlusvnlrt.R.inc(105087);
        __CLR4_5_2292t292tlusvnlrt.R.inc(105088);this.roomRate = roomRate;
    }finally{__CLR4_5_2292t292tlusvnlrt.R.flushNeeded();}}

    public Integer getQuantity() {try{__CLR4_5_2292t292tlusvnlrt.R.inc(105089);
        __CLR4_5_2292t292tlusvnlrt.R.inc(105090);return quantity;
    }finally{__CLR4_5_2292t292tlusvnlrt.R.flushNeeded();}}

    public void setQuantity(Integer quantity) {try{__CLR4_5_2292t292tlusvnlrt.R.inc(105091);
        __CLR4_5_2292t292tlusvnlrt.R.inc(105092);this.quantity = quantity;
    }finally{__CLR4_5_2292t292tlusvnlrt.R.flushNeeded();}}

    @JSONField(name="PC")
    public ProviderChainDTO getProviderChain() {try{__CLR4_5_2292t292tlusvnlrt.R.inc(105093);
        __CLR4_5_2292t292tlusvnlrt.R.inc(105094);return providerChain;
    }finally{__CLR4_5_2292t292tlusvnlrt.R.flushNeeded();}}

    @JSONField(name="PC")
    public void setProviderChain(ProviderChainDTO providerChain) {try{__CLR4_5_2292t292tlusvnlrt.R.inc(105095);
        __CLR4_5_2292t292tlusvnlrt.R.inc(105096);this.providerChain = providerChain;
    }finally{__CLR4_5_2292t292tlusvnlrt.R.flushNeeded();}}

    @JSONField(name="LT")
    public LanguageType getLanguageType() {try{__CLR4_5_2292t292tlusvnlrt.R.inc(105097);
        __CLR4_5_2292t292tlusvnlrt.R.inc(105098);return languageType;
    }finally{__CLR4_5_2292t292tlusvnlrt.R.flushNeeded();}}

    @JSONField(name="LT")
    public void setLanguageType(LanguageType languageType) {try{__CLR4_5_2292t292tlusvnlrt.R.inc(105099);
        __CLR4_5_2292t292tlusvnlrt.R.inc(105100);this.languageType = languageType;
    }finally{__CLR4_5_2292t292tlusvnlrt.R.flushNeeded();}}

    public TPAExtensionsDTO getTpaExtensions() {try{__CLR4_5_2292t292tlusvnlrt.R.inc(105101);
        __CLR4_5_2292t292tlusvnlrt.R.inc(105102);return tpaExtensions;
    }finally{__CLR4_5_2292t292tlusvnlrt.R.flushNeeded();}}

    public void setTpaExtensions(TPAExtensionsDTO tpaExtensions) {try{__CLR4_5_2292t292tlusvnlrt.R.inc(105103);
        __CLR4_5_2292t292tlusvnlrt.R.inc(105104);this.tpaExtensions = tpaExtensions;
    }finally{__CLR4_5_2292t292tlusvnlrt.R.flushNeeded();}}
}
