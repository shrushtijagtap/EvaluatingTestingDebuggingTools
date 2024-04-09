/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//**
 * Project: morgan.domain
 * 
 * File Created at 2009-6-11
 * $Id: FullAddress.java 77622 2011-03-03 08:31:45Z ding.lid $
 * 
 * Copyright 2008 Alibaba.com Croporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
package com.alibaba.json.test.dubbo;

import java.io.Serializable;

/**
 * @author xk1430
 */
public class FullAddress implements Serializable {public static class __CLR4_1_1024jb24jblusqkuux{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,99375,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 5163979984269419831L;

    private String            countryId;

    private String            countryName;

    private String            provinceName;

    private String            cityId;

    private String            cityName;

    private String            streetAddress;

    private String            zipCode;

    public void setCountryId(String countryId) {try{__CLR4_1_1024jb24jblusqkuux.R.inc(99191);
        __CLR4_1_1024jb24jblusqkuux.R.inc(99192);this.countryId = countryId;
    }finally{__CLR4_1_1024jb24jblusqkuux.R.flushNeeded();}}

    public void setCountryName(String countryName) {try{__CLR4_1_1024jb24jblusqkuux.R.inc(99193);
        __CLR4_1_1024jb24jblusqkuux.R.inc(99194);this.countryName = countryName;
    }finally{__CLR4_1_1024jb24jblusqkuux.R.flushNeeded();}}

    public void setProvinceName(String provinceName) {try{__CLR4_1_1024jb24jblusqkuux.R.inc(99195);
        __CLR4_1_1024jb24jblusqkuux.R.inc(99196);this.provinceName = provinceName;
    }finally{__CLR4_1_1024jb24jblusqkuux.R.flushNeeded();}}

    public void setCityId(String cityId) {try{__CLR4_1_1024jb24jblusqkuux.R.inc(99197);
        __CLR4_1_1024jb24jblusqkuux.R.inc(99198);this.cityId = cityId;
    }finally{__CLR4_1_1024jb24jblusqkuux.R.flushNeeded();}}

    public void setCityName(String cityName) {try{__CLR4_1_1024jb24jblusqkuux.R.inc(99199);
        __CLR4_1_1024jb24jblusqkuux.R.inc(99200);this.cityName = cityName;
    }finally{__CLR4_1_1024jb24jblusqkuux.R.flushNeeded();}}

    public void setStreetAddress(String streetAddress) {try{__CLR4_1_1024jb24jblusqkuux.R.inc(99201);
        __CLR4_1_1024jb24jblusqkuux.R.inc(99202);this.streetAddress = streetAddress;
    }finally{__CLR4_1_1024jb24jblusqkuux.R.flushNeeded();}}

    public void setZipCode(String zipCode) {try{__CLR4_1_1024jb24jblusqkuux.R.inc(99203);
        __CLR4_1_1024jb24jblusqkuux.R.inc(99204);this.zipCode = zipCode;
    }finally{__CLR4_1_1024jb24jblusqkuux.R.flushNeeded();}}

    public String getCountryId() {try{__CLR4_1_1024jb24jblusqkuux.R.inc(99205);
        __CLR4_1_1024jb24jblusqkuux.R.inc(99206);return countryId;
    }finally{__CLR4_1_1024jb24jblusqkuux.R.flushNeeded();}}

    public String getCountryName() {try{__CLR4_1_1024jb24jblusqkuux.R.inc(99207);
        __CLR4_1_1024jb24jblusqkuux.R.inc(99208);return countryName;
    }finally{__CLR4_1_1024jb24jblusqkuux.R.flushNeeded();}}

    public String getProvinceName() {try{__CLR4_1_1024jb24jblusqkuux.R.inc(99209);
        __CLR4_1_1024jb24jblusqkuux.R.inc(99210);return provinceName;
    }finally{__CLR4_1_1024jb24jblusqkuux.R.flushNeeded();}}

    public String getCityId() {try{__CLR4_1_1024jb24jblusqkuux.R.inc(99211);
        __CLR4_1_1024jb24jblusqkuux.R.inc(99212);return cityId;
    }finally{__CLR4_1_1024jb24jblusqkuux.R.flushNeeded();}}

    public String getCityName() {try{__CLR4_1_1024jb24jblusqkuux.R.inc(99213);
        __CLR4_1_1024jb24jblusqkuux.R.inc(99214);return cityName;
    }finally{__CLR4_1_1024jb24jblusqkuux.R.flushNeeded();}}

    public String getStreetAddress() {try{__CLR4_1_1024jb24jblusqkuux.R.inc(99215);
        __CLR4_1_1024jb24jblusqkuux.R.inc(99216);return streetAddress;
    }finally{__CLR4_1_1024jb24jblusqkuux.R.flushNeeded();}}

    public String getZipCode() {try{__CLR4_1_1024jb24jblusqkuux.R.inc(99217);
        __CLR4_1_1024jb24jblusqkuux.R.inc(99218);return zipCode;
    }finally{__CLR4_1_1024jb24jblusqkuux.R.flushNeeded();}}

    public FullAddress() {try{__CLR4_1_1024jb24jblusqkuux.R.inc(99219);
    }finally{__CLR4_1_1024jb24jblusqkuux.R.flushNeeded();}}

    public FullAddress(String countryId, String provinceName, String cityId, String streetAddress,
                       String zipCode) {try{__CLR4_1_1024jb24jblusqkuux.R.inc(99220);
        __CLR4_1_1024jb24jblusqkuux.R.inc(99221);this.countryId = countryId;
        __CLR4_1_1024jb24jblusqkuux.R.inc(99222);this.countryName = countryId;
        __CLR4_1_1024jb24jblusqkuux.R.inc(99223);this.provinceName = provinceName;
        __CLR4_1_1024jb24jblusqkuux.R.inc(99224);this.cityId = cityId;
        __CLR4_1_1024jb24jblusqkuux.R.inc(99225);this.cityName = cityId;
        __CLR4_1_1024jb24jblusqkuux.R.inc(99226);this.streetAddress = streetAddress;
        __CLR4_1_1024jb24jblusqkuux.R.inc(99227);this.zipCode = zipCode;
    }finally{__CLR4_1_1024jb24jblusqkuux.R.flushNeeded();}}

    public FullAddress(String countryId, String countryName, String provinceName, String cityId,
                       String cityName, String streetAddress, String zipCode) {try{__CLR4_1_1024jb24jblusqkuux.R.inc(99228);
        __CLR4_1_1024jb24jblusqkuux.R.inc(99229);this.countryId = countryId;
        __CLR4_1_1024jb24jblusqkuux.R.inc(99230);this.countryName = countryName;
        __CLR4_1_1024jb24jblusqkuux.R.inc(99231);this.provinceName = provinceName;
        __CLR4_1_1024jb24jblusqkuux.R.inc(99232);this.cityId = cityId;
        __CLR4_1_1024jb24jblusqkuux.R.inc(99233);this.cityName = cityName;
        __CLR4_1_1024jb24jblusqkuux.R.inc(99234);this.streetAddress = streetAddress;
        __CLR4_1_1024jb24jblusqkuux.R.inc(99235);this.zipCode = zipCode;
    }finally{__CLR4_1_1024jb24jblusqkuux.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_1_1024jb24jblusqkuux.R.inc(99236);
        __CLR4_1_1024jb24jblusqkuux.R.inc(99237);final int prime = 31;
        __CLR4_1_1024jb24jblusqkuux.R.inc(99238);int result = 1;
        __CLR4_1_1024jb24jblusqkuux.R.inc(99239);result = prime * result + (((((cityId == null) )&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99240)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99241)==0&false))? 0 : cityId.hashCode());
        __CLR4_1_1024jb24jblusqkuux.R.inc(99242);result = prime * result + (((((cityName == null) )&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99243)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99244)==0&false))? 0 : cityName.hashCode());
        __CLR4_1_1024jb24jblusqkuux.R.inc(99245);result = prime * result + (((((countryId == null) )&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99246)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99247)==0&false))? 0 : countryId.hashCode());
        __CLR4_1_1024jb24jblusqkuux.R.inc(99248);result = prime * result + (((((countryName == null) )&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99249)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99250)==0&false))? 0 : countryName.hashCode());
        __CLR4_1_1024jb24jblusqkuux.R.inc(99251);result = prime * result + (((((provinceName == null) )&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99252)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99253)==0&false))? 0 : provinceName.hashCode());
        __CLR4_1_1024jb24jblusqkuux.R.inc(99254);result = prime * result + (((((streetAddress == null) )&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99255)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99256)==0&false))? 0 : streetAddress.hashCode());
        __CLR4_1_1024jb24jblusqkuux.R.inc(99257);result = prime * result + (((((zipCode == null) )&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99258)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99259)==0&false))? 0 : zipCode.hashCode());
        __CLR4_1_1024jb24jblusqkuux.R.inc(99260);return result;
    }finally{__CLR4_1_1024jb24jblusqkuux.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_1_1024jb24jblusqkuux.R.inc(99261);
        __CLR4_1_1024jb24jblusqkuux.R.inc(99262);if ((((this == obj)&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99263)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99264)==0&false)))
            {__CLR4_1_1024jb24jblusqkuux.R.inc(99265);return true;
        }__CLR4_1_1024jb24jblusqkuux.R.inc(99266);if ((((obj == null)&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99267)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99268)==0&false)))
            {__CLR4_1_1024jb24jblusqkuux.R.inc(99269);return false;
        }__CLR4_1_1024jb24jblusqkuux.R.inc(99270);if ((((getClass() != obj.getClass())&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99271)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99272)==0&false)))
            {__CLR4_1_1024jb24jblusqkuux.R.inc(99273);return false;
        }__CLR4_1_1024jb24jblusqkuux.R.inc(99274);FullAddress other = (FullAddress) obj;
        __CLR4_1_1024jb24jblusqkuux.R.inc(99275);if ((((cityId == null)&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99276)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99277)==0&false))) {{
            __CLR4_1_1024jb24jblusqkuux.R.inc(99278);if ((((other.cityId != null)&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99279)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99280)==0&false)))
                {__CLR4_1_1024jb24jblusqkuux.R.inc(99281);return false;
        }} }else {__CLR4_1_1024jb24jblusqkuux.R.inc(99282);if ((((!cityId.equals(other.cityId))&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99283)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99284)==0&false)))
            {__CLR4_1_1024jb24jblusqkuux.R.inc(99285);return false;
        }}__CLR4_1_1024jb24jblusqkuux.R.inc(99286);if ((((cityName == null)&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99287)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99288)==0&false))) {{
            __CLR4_1_1024jb24jblusqkuux.R.inc(99289);if ((((other.cityName != null)&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99290)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99291)==0&false)))
                {__CLR4_1_1024jb24jblusqkuux.R.inc(99292);return false;
        }} }else {__CLR4_1_1024jb24jblusqkuux.R.inc(99293);if ((((!cityName.equals(other.cityName))&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99294)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99295)==0&false)))
            {__CLR4_1_1024jb24jblusqkuux.R.inc(99296);return false;
        }}__CLR4_1_1024jb24jblusqkuux.R.inc(99297);if ((((countryId == null)&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99298)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99299)==0&false))) {{
            __CLR4_1_1024jb24jblusqkuux.R.inc(99300);if ((((other.countryId != null)&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99301)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99302)==0&false)))
                {__CLR4_1_1024jb24jblusqkuux.R.inc(99303);return false;
        }} }else {__CLR4_1_1024jb24jblusqkuux.R.inc(99304);if ((((!countryId.equals(other.countryId))&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99305)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99306)==0&false)))
            {__CLR4_1_1024jb24jblusqkuux.R.inc(99307);return false;
        }}__CLR4_1_1024jb24jblusqkuux.R.inc(99308);if ((((countryName == null)&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99309)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99310)==0&false))) {{
            __CLR4_1_1024jb24jblusqkuux.R.inc(99311);if ((((other.countryName != null)&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99312)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99313)==0&false)))
                {__CLR4_1_1024jb24jblusqkuux.R.inc(99314);return false;
        }} }else {__CLR4_1_1024jb24jblusqkuux.R.inc(99315);if ((((!countryName.equals(other.countryName))&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99316)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99317)==0&false)))
            {__CLR4_1_1024jb24jblusqkuux.R.inc(99318);return false;
        }}__CLR4_1_1024jb24jblusqkuux.R.inc(99319);if ((((provinceName == null)&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99320)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99321)==0&false))) {{
            __CLR4_1_1024jb24jblusqkuux.R.inc(99322);if ((((other.provinceName != null)&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99323)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99324)==0&false)))
                {__CLR4_1_1024jb24jblusqkuux.R.inc(99325);return false;
        }} }else {__CLR4_1_1024jb24jblusqkuux.R.inc(99326);if ((((!provinceName.equals(other.provinceName))&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99327)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99328)==0&false)))
            {__CLR4_1_1024jb24jblusqkuux.R.inc(99329);return false;
        }}__CLR4_1_1024jb24jblusqkuux.R.inc(99330);if ((((streetAddress == null)&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99331)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99332)==0&false))) {{
            __CLR4_1_1024jb24jblusqkuux.R.inc(99333);if ((((other.streetAddress != null)&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99334)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99335)==0&false)))
                {__CLR4_1_1024jb24jblusqkuux.R.inc(99336);return false;
        }} }else {__CLR4_1_1024jb24jblusqkuux.R.inc(99337);if ((((!streetAddress.equals(other.streetAddress))&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99338)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99339)==0&false)))
            {__CLR4_1_1024jb24jblusqkuux.R.inc(99340);return false;
        }}__CLR4_1_1024jb24jblusqkuux.R.inc(99341);if ((((zipCode == null)&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99342)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99343)==0&false))) {{
            __CLR4_1_1024jb24jblusqkuux.R.inc(99344);if ((((other.zipCode != null)&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99345)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99346)==0&false)))
                {__CLR4_1_1024jb24jblusqkuux.R.inc(99347);return false;
        }} }else {__CLR4_1_1024jb24jblusqkuux.R.inc(99348);if ((((!zipCode.equals(other.zipCode))&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99349)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99350)==0&false)))
            {__CLR4_1_1024jb24jblusqkuux.R.inc(99351);return false;
        }}__CLR4_1_1024jb24jblusqkuux.R.inc(99352);return true;
    }finally{__CLR4_1_1024jb24jblusqkuux.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_1_1024jb24jblusqkuux.R.inc(99353);
        __CLR4_1_1024jb24jblusqkuux.R.inc(99354);StringBuilder sb = new StringBuilder();
        __CLR4_1_1024jb24jblusqkuux.R.inc(99355);if ((((countryName != null && countryName.length() > 0)&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99356)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99357)==0&false))) {{
            __CLR4_1_1024jb24jblusqkuux.R.inc(99358);sb.append(countryName);
        }
        }__CLR4_1_1024jb24jblusqkuux.R.inc(99359);if ((((provinceName != null && provinceName.length() > 0)&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99360)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99361)==0&false))) {{
            __CLR4_1_1024jb24jblusqkuux.R.inc(99362);sb.append(" ");
            __CLR4_1_1024jb24jblusqkuux.R.inc(99363);sb.append(provinceName);
        }
        }__CLR4_1_1024jb24jblusqkuux.R.inc(99364);if ((((cityName != null && cityName.length() > 0)&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99365)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99366)==0&false))) {{
            __CLR4_1_1024jb24jblusqkuux.R.inc(99367);sb.append(" ");
            __CLR4_1_1024jb24jblusqkuux.R.inc(99368);sb.append(cityName);
        }
        }__CLR4_1_1024jb24jblusqkuux.R.inc(99369);if ((((streetAddress != null && streetAddress.length() > 0)&&(__CLR4_1_1024jb24jblusqkuux.R.iget(99370)!=0|true))||(__CLR4_1_1024jb24jblusqkuux.R.iget(99371)==0&false))) {{
            __CLR4_1_1024jb24jblusqkuux.R.inc(99372);sb.append(" ");
            __CLR4_1_1024jb24jblusqkuux.R.inc(99373);sb.append(streetAddress);
        }
        }__CLR4_1_1024jb24jblusqkuux.R.inc(99374);return sb.toString();
    }finally{__CLR4_1_1024jb24jblusqkuux.R.flushNeeded();}}

}
