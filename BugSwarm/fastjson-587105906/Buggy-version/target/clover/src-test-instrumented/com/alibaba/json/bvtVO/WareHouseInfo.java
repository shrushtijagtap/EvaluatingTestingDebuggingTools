/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvtVO;

import java.io.Serializable;

/**
 * \ufffd\ufffdWarehouseInfo.java\ufffd\ufffd\u02b5\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05bf\ufffd\ufffd\ufffd\u03e2\ufffd\ufffd\ufffd\ufffd
 * 
 * @author maik.wangz 2011-12-12 \ufffd\ufffd\ufffd\ufffd09:50:32
 */
public class WareHouseInfo implements Serializable {public static class __CLR4_1_1020t120t1luszwh3i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,94389,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 6102232214244738211L;
    // \u02a1\ufffd\ufffdID
    private String            provinceId;
    // \u02a1\ufffd\ufffd\ufffd\ufffd\ufffd
    private String            provinceName;
    // \ufffd\ufffd\ufffd\ufffdID
    private String            cityId;
    // \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd
    private String            cityName;
    // \ufffd\ufffd\ufffd\ufffdID
    private String            areaId;
    // \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd
    private String            areaName;
    // \ufffd\u05bf\ufffd\ufffd\ufffd\ufffd
    private String            houseArea;
    // \ufffd\u05bf\ufffd\u037c\u01ac
    private Image[]           images;

    public String getProvinceId() {try{__CLR4_1_1020t120t1luszwh3i.R.inc(94357);
        __CLR4_1_1020t120t1luszwh3i.R.inc(94358);return provinceId;
    }finally{__CLR4_1_1020t120t1luszwh3i.R.flushNeeded();}}

    public void setProvinceId(String provinceId) {try{__CLR4_1_1020t120t1luszwh3i.R.inc(94359);
        __CLR4_1_1020t120t1luszwh3i.R.inc(94360);this.provinceId = provinceId;
    }finally{__CLR4_1_1020t120t1luszwh3i.R.flushNeeded();}}

    public String getProvinceName() {try{__CLR4_1_1020t120t1luszwh3i.R.inc(94361);
        __CLR4_1_1020t120t1luszwh3i.R.inc(94362);return provinceName;
    }finally{__CLR4_1_1020t120t1luszwh3i.R.flushNeeded();}}

    public void setProvinceName(String provinceName) {try{__CLR4_1_1020t120t1luszwh3i.R.inc(94363);
        __CLR4_1_1020t120t1luszwh3i.R.inc(94364);this.provinceName = provinceName;
    }finally{__CLR4_1_1020t120t1luszwh3i.R.flushNeeded();}}

    public String getCityId() {try{__CLR4_1_1020t120t1luszwh3i.R.inc(94365);
        __CLR4_1_1020t120t1luszwh3i.R.inc(94366);return cityId;
    }finally{__CLR4_1_1020t120t1luszwh3i.R.flushNeeded();}}

    public void setCityId(String cityId) {try{__CLR4_1_1020t120t1luszwh3i.R.inc(94367);
        __CLR4_1_1020t120t1luszwh3i.R.inc(94368);this.cityId = cityId;
    }finally{__CLR4_1_1020t120t1luszwh3i.R.flushNeeded();}}

    public String getCityName() {try{__CLR4_1_1020t120t1luszwh3i.R.inc(94369);
        __CLR4_1_1020t120t1luszwh3i.R.inc(94370);return cityName;
    }finally{__CLR4_1_1020t120t1luszwh3i.R.flushNeeded();}}

    public void setCityName(String cityName) {try{__CLR4_1_1020t120t1luszwh3i.R.inc(94371);
        __CLR4_1_1020t120t1luszwh3i.R.inc(94372);this.cityName = cityName;
    }finally{__CLR4_1_1020t120t1luszwh3i.R.flushNeeded();}}

    public String getAreaId() {try{__CLR4_1_1020t120t1luszwh3i.R.inc(94373);
        __CLR4_1_1020t120t1luszwh3i.R.inc(94374);return areaId;
    }finally{__CLR4_1_1020t120t1luszwh3i.R.flushNeeded();}}

    public void setAreaId(String areaId) {try{__CLR4_1_1020t120t1luszwh3i.R.inc(94375);
        __CLR4_1_1020t120t1luszwh3i.R.inc(94376);this.areaId = areaId;
    }finally{__CLR4_1_1020t120t1luszwh3i.R.flushNeeded();}}

    public String getAreaName() {try{__CLR4_1_1020t120t1luszwh3i.R.inc(94377);
        __CLR4_1_1020t120t1luszwh3i.R.inc(94378);return areaName;
    }finally{__CLR4_1_1020t120t1luszwh3i.R.flushNeeded();}}

    public void setAreaName(String areaName) {try{__CLR4_1_1020t120t1luszwh3i.R.inc(94379);
        __CLR4_1_1020t120t1luszwh3i.R.inc(94380);this.areaName = areaName;
    }finally{__CLR4_1_1020t120t1luszwh3i.R.flushNeeded();}}

    public String getHouseArea() {try{__CLR4_1_1020t120t1luszwh3i.R.inc(94381);
        __CLR4_1_1020t120t1luszwh3i.R.inc(94382);return houseArea;
    }finally{__CLR4_1_1020t120t1luszwh3i.R.flushNeeded();}}

    public void setHouseArea(String houseArea) {try{__CLR4_1_1020t120t1luszwh3i.R.inc(94383);
        __CLR4_1_1020t120t1luszwh3i.R.inc(94384);this.houseArea = houseArea;
    }finally{__CLR4_1_1020t120t1luszwh3i.R.flushNeeded();}}

    public Image[] getImages() {try{__CLR4_1_1020t120t1luszwh3i.R.inc(94385);
        __CLR4_1_1020t120t1luszwh3i.R.inc(94386);return images;
    }finally{__CLR4_1_1020t120t1luszwh3i.R.flushNeeded();}}

    public void setImages(Image[] images) {try{__CLR4_1_1020t120t1luszwh3i.R.inc(94387);
        __CLR4_1_1020t120t1luszwh3i.R.inc(94388);this.images = images;
    }finally{__CLR4_1_1020t120t1luszwh3i.R.flushNeeded();}}

}
