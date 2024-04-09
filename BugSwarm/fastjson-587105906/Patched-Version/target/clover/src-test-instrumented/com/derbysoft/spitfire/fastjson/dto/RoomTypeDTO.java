/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.derbysoft.spitfire.fastjson.dto;

import java.util.ArrayList;
import java.util.List;

public class RoomTypeDTO extends AbstractDTO {public static class __CLR4_5_229982998lusvnltu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,105376,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private String code;

    private String name;

    private String description;

    private List<String> amenities = new ArrayList<String>();

    private CompositeType compositeType = CompositeType.UNKNOWN;

    private Integer floor;

    private SmokingType smokingType = SmokingType.INDIFFERENT;

    private String sizeMeasurement;

    private Integer bedCount;

    private Integer adultCount;

    private Integer childCount;

    private Integer maxGuestCount;

    private Integer extraBedCount;

    private BathType bathType;

    private InternetDTO internet;

    private TPAExtensionsDTO tpaExtensions;

    public RoomTypeDTO() {try{__CLR4_5_229982998lusvnltu.R.inc(105308);
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public RoomTypeDTO(String code, String name) {try{__CLR4_5_229982998lusvnltu.R.inc(105309);
        __CLR4_5_229982998lusvnltu.R.inc(105310);this.code = code;
        __CLR4_5_229982998lusvnltu.R.inc(105311);this.name = name;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public String getCode() {try{__CLR4_5_229982998lusvnltu.R.inc(105312);
        __CLR4_5_229982998lusvnltu.R.inc(105313);return code;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public void setCode(String code) {try{__CLR4_5_229982998lusvnltu.R.inc(105314);
        __CLR4_5_229982998lusvnltu.R.inc(105315);this.code = code;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_229982998lusvnltu.R.inc(105316);
        __CLR4_5_229982998lusvnltu.R.inc(105317);return name;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public void setName(String name) {try{__CLR4_5_229982998lusvnltu.R.inc(105318);
        __CLR4_5_229982998lusvnltu.R.inc(105319);this.name = name;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public String getDescription() {try{__CLR4_5_229982998lusvnltu.R.inc(105320);
        __CLR4_5_229982998lusvnltu.R.inc(105321);return description;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public void setDescription(String description) {try{__CLR4_5_229982998lusvnltu.R.inc(105322);
        __CLR4_5_229982998lusvnltu.R.inc(105323);this.description = description;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public List<String> getAmenities() {try{__CLR4_5_229982998lusvnltu.R.inc(105324);
        __CLR4_5_229982998lusvnltu.R.inc(105325);return amenities;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public void setAmenities(List<String> amenities) {try{__CLR4_5_229982998lusvnltu.R.inc(105326);
        __CLR4_5_229982998lusvnltu.R.inc(105327);this.amenities = amenities;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public CompositeType getCompositeType() {try{__CLR4_5_229982998lusvnltu.R.inc(105328);
        __CLR4_5_229982998lusvnltu.R.inc(105329);return compositeType;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public void setCompositeType(CompositeType compositeType) {try{__CLR4_5_229982998lusvnltu.R.inc(105330);
        __CLR4_5_229982998lusvnltu.R.inc(105331);this.compositeType = compositeType;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public Integer getFloor() {try{__CLR4_5_229982998lusvnltu.R.inc(105332);
        __CLR4_5_229982998lusvnltu.R.inc(105333);return floor;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public void setFloor(Integer floor) {try{__CLR4_5_229982998lusvnltu.R.inc(105334);
        __CLR4_5_229982998lusvnltu.R.inc(105335);this.floor = floor;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public SmokingType getSmokingType() {try{__CLR4_5_229982998lusvnltu.R.inc(105336);
        __CLR4_5_229982998lusvnltu.R.inc(105337);return smokingType;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public void setSmokingType(SmokingType smokingType) {try{__CLR4_5_229982998lusvnltu.R.inc(105338);
        __CLR4_5_229982998lusvnltu.R.inc(105339);this.smokingType = smokingType;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public String getSizeMeasurement() {try{__CLR4_5_229982998lusvnltu.R.inc(105340);
        __CLR4_5_229982998lusvnltu.R.inc(105341);return sizeMeasurement;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public void setSizeMeasurement(String sizeMeasurement) {try{__CLR4_5_229982998lusvnltu.R.inc(105342);
        __CLR4_5_229982998lusvnltu.R.inc(105343);this.sizeMeasurement = sizeMeasurement;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public TPAExtensionsDTO getTpaExtensions() {try{__CLR4_5_229982998lusvnltu.R.inc(105344);
        __CLR4_5_229982998lusvnltu.R.inc(105345);return tpaExtensions;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public void setTpaExtensions(TPAExtensionsDTO tpaExtensions) {try{__CLR4_5_229982998lusvnltu.R.inc(105346);
        __CLR4_5_229982998lusvnltu.R.inc(105347);this.tpaExtensions = tpaExtensions;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public Integer getAdultCount() {try{__CLR4_5_229982998lusvnltu.R.inc(105348);
        __CLR4_5_229982998lusvnltu.R.inc(105349);return adultCount;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public void setAdultCount(Integer adultCount) {try{__CLR4_5_229982998lusvnltu.R.inc(105350);
        __CLR4_5_229982998lusvnltu.R.inc(105351);this.adultCount = adultCount;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public Integer getChildCount() {try{__CLR4_5_229982998lusvnltu.R.inc(105352);
        __CLR4_5_229982998lusvnltu.R.inc(105353);return childCount;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public void setChildCount(Integer childCount) {try{__CLR4_5_229982998lusvnltu.R.inc(105354);
        __CLR4_5_229982998lusvnltu.R.inc(105355);this.childCount = childCount;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public Integer getMaxGuestCount() {try{__CLR4_5_229982998lusvnltu.R.inc(105356);
        __CLR4_5_229982998lusvnltu.R.inc(105357);return maxGuestCount;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public void setMaxGuestCount(Integer maxGuestCount) {try{__CLR4_5_229982998lusvnltu.R.inc(105358);
        __CLR4_5_229982998lusvnltu.R.inc(105359);this.maxGuestCount = maxGuestCount;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public Integer getExtraBedCount() {try{__CLR4_5_229982998lusvnltu.R.inc(105360);
        __CLR4_5_229982998lusvnltu.R.inc(105361);return extraBedCount;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public void setExtraBedCount(Integer extraBedCount) {try{__CLR4_5_229982998lusvnltu.R.inc(105362);
        __CLR4_5_229982998lusvnltu.R.inc(105363);this.extraBedCount = extraBedCount;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public BathType getBathType() {try{__CLR4_5_229982998lusvnltu.R.inc(105364);
        __CLR4_5_229982998lusvnltu.R.inc(105365);return bathType;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public void setBathType(BathType bathType) {try{__CLR4_5_229982998lusvnltu.R.inc(105366);
        __CLR4_5_229982998lusvnltu.R.inc(105367);this.bathType = bathType;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public Integer getBedCount() {try{__CLR4_5_229982998lusvnltu.R.inc(105368);
        __CLR4_5_229982998lusvnltu.R.inc(105369);return bedCount;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public void setBedCount(Integer bedCount) {try{__CLR4_5_229982998lusvnltu.R.inc(105370);
        __CLR4_5_229982998lusvnltu.R.inc(105371);this.bedCount = bedCount;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public InternetDTO getInternet() {try{__CLR4_5_229982998lusvnltu.R.inc(105372);
        __CLR4_5_229982998lusvnltu.R.inc(105373);return internet;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}

    public void setInternet(InternetDTO internet) {try{__CLR4_5_229982998lusvnltu.R.inc(105374);
        __CLR4_5_229982998lusvnltu.R.inc(105375);this.internet = internet;
    }finally{__CLR4_5_229982998lusvnltu.R.flushNeeded();}}
}
