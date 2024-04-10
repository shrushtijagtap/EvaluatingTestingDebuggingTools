/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//**
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
public class FullAddress implements Serializable {public static class __CLR4_5_224j024j0lusyjwxl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,99364,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 5163979984269419831L;

    private String            countryId;

    private String            countryName;

    private String            provinceName;

    private String            cityId;

    private String            cityName;

    private String            streetAddress;

    private String            zipCode;

    public void setCountryId(String countryId) {try{__CLR4_5_224j024j0lusyjwxl.R.inc(99180);
        __CLR4_5_224j024j0lusyjwxl.R.inc(99181);this.countryId = countryId;
    }finally{__CLR4_5_224j024j0lusyjwxl.R.flushNeeded();}}

    public void setCountryName(String countryName) {try{__CLR4_5_224j024j0lusyjwxl.R.inc(99182);
        __CLR4_5_224j024j0lusyjwxl.R.inc(99183);this.countryName = countryName;
    }finally{__CLR4_5_224j024j0lusyjwxl.R.flushNeeded();}}

    public void setProvinceName(String provinceName) {try{__CLR4_5_224j024j0lusyjwxl.R.inc(99184);
        __CLR4_5_224j024j0lusyjwxl.R.inc(99185);this.provinceName = provinceName;
    }finally{__CLR4_5_224j024j0lusyjwxl.R.flushNeeded();}}

    public void setCityId(String cityId) {try{__CLR4_5_224j024j0lusyjwxl.R.inc(99186);
        __CLR4_5_224j024j0lusyjwxl.R.inc(99187);this.cityId = cityId;
    }finally{__CLR4_5_224j024j0lusyjwxl.R.flushNeeded();}}

    public void setCityName(String cityName) {try{__CLR4_5_224j024j0lusyjwxl.R.inc(99188);
        __CLR4_5_224j024j0lusyjwxl.R.inc(99189);this.cityName = cityName;
    }finally{__CLR4_5_224j024j0lusyjwxl.R.flushNeeded();}}

    public void setStreetAddress(String streetAddress) {try{__CLR4_5_224j024j0lusyjwxl.R.inc(99190);
        __CLR4_5_224j024j0lusyjwxl.R.inc(99191);this.streetAddress = streetAddress;
    }finally{__CLR4_5_224j024j0lusyjwxl.R.flushNeeded();}}

    public void setZipCode(String zipCode) {try{__CLR4_5_224j024j0lusyjwxl.R.inc(99192);
        __CLR4_5_224j024j0lusyjwxl.R.inc(99193);this.zipCode = zipCode;
    }finally{__CLR4_5_224j024j0lusyjwxl.R.flushNeeded();}}

    public String getCountryId() {try{__CLR4_5_224j024j0lusyjwxl.R.inc(99194);
        __CLR4_5_224j024j0lusyjwxl.R.inc(99195);return countryId;
    }finally{__CLR4_5_224j024j0lusyjwxl.R.flushNeeded();}}

    public String getCountryName() {try{__CLR4_5_224j024j0lusyjwxl.R.inc(99196);
        __CLR4_5_224j024j0lusyjwxl.R.inc(99197);return countryName;
    }finally{__CLR4_5_224j024j0lusyjwxl.R.flushNeeded();}}

    public String getProvinceName() {try{__CLR4_5_224j024j0lusyjwxl.R.inc(99198);
        __CLR4_5_224j024j0lusyjwxl.R.inc(99199);return provinceName;
    }finally{__CLR4_5_224j024j0lusyjwxl.R.flushNeeded();}}

    public String getCityId() {try{__CLR4_5_224j024j0lusyjwxl.R.inc(99200);
        __CLR4_5_224j024j0lusyjwxl.R.inc(99201);return cityId;
    }finally{__CLR4_5_224j024j0lusyjwxl.R.flushNeeded();}}

    public String getCityName() {try{__CLR4_5_224j024j0lusyjwxl.R.inc(99202);
        __CLR4_5_224j024j0lusyjwxl.R.inc(99203);return cityName;
    }finally{__CLR4_5_224j024j0lusyjwxl.R.flushNeeded();}}

    public String getStreetAddress() {try{__CLR4_5_224j024j0lusyjwxl.R.inc(99204);
        __CLR4_5_224j024j0lusyjwxl.R.inc(99205);return streetAddress;
    }finally{__CLR4_5_224j024j0lusyjwxl.R.flushNeeded();}}

    public String getZipCode() {try{__CLR4_5_224j024j0lusyjwxl.R.inc(99206);
        __CLR4_5_224j024j0lusyjwxl.R.inc(99207);return zipCode;
    }finally{__CLR4_5_224j024j0lusyjwxl.R.flushNeeded();}}

    public FullAddress() {try{__CLR4_5_224j024j0lusyjwxl.R.inc(99208);
    }finally{__CLR4_5_224j024j0lusyjwxl.R.flushNeeded();}}

    public FullAddress(String countryId, String provinceName, String cityId, String streetAddress,
                       String zipCode) {try{__CLR4_5_224j024j0lusyjwxl.R.inc(99209);
        __CLR4_5_224j024j0lusyjwxl.R.inc(99210);this.countryId = countryId;
        __CLR4_5_224j024j0lusyjwxl.R.inc(99211);this.countryName = countryId;
        __CLR4_5_224j024j0lusyjwxl.R.inc(99212);this.provinceName = provinceName;
        __CLR4_5_224j024j0lusyjwxl.R.inc(99213);this.cityId = cityId;
        __CLR4_5_224j024j0lusyjwxl.R.inc(99214);this.cityName = cityId;
        __CLR4_5_224j024j0lusyjwxl.R.inc(99215);this.streetAddress = streetAddress;
        __CLR4_5_224j024j0lusyjwxl.R.inc(99216);this.zipCode = zipCode;
    }finally{__CLR4_5_224j024j0lusyjwxl.R.flushNeeded();}}

    public FullAddress(String countryId, String countryName, String provinceName, String cityId,
                       String cityName, String streetAddress, String zipCode) {try{__CLR4_5_224j024j0lusyjwxl.R.inc(99217);
        __CLR4_5_224j024j0lusyjwxl.R.inc(99218);this.countryId = countryId;
        __CLR4_5_224j024j0lusyjwxl.R.inc(99219);this.countryName = countryName;
        __CLR4_5_224j024j0lusyjwxl.R.inc(99220);this.provinceName = provinceName;
        __CLR4_5_224j024j0lusyjwxl.R.inc(99221);this.cityId = cityId;
        __CLR4_5_224j024j0lusyjwxl.R.inc(99222);this.cityName = cityName;
        __CLR4_5_224j024j0lusyjwxl.R.inc(99223);this.streetAddress = streetAddress;
        __CLR4_5_224j024j0lusyjwxl.R.inc(99224);this.zipCode = zipCode;
    }finally{__CLR4_5_224j024j0lusyjwxl.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_224j024j0lusyjwxl.R.inc(99225);
        __CLR4_5_224j024j0lusyjwxl.R.inc(99226);final int prime = 31;
        __CLR4_5_224j024j0lusyjwxl.R.inc(99227);int result = 1;
        __CLR4_5_224j024j0lusyjwxl.R.inc(99228);result = prime * result + (((((cityId == null) )&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99229)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99230)==0&false))? 0 : cityId.hashCode());
        __CLR4_5_224j024j0lusyjwxl.R.inc(99231);result = prime * result + (((((cityName == null) )&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99232)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99233)==0&false))? 0 : cityName.hashCode());
        __CLR4_5_224j024j0lusyjwxl.R.inc(99234);result = prime * result + (((((countryId == null) )&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99235)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99236)==0&false))? 0 : countryId.hashCode());
        __CLR4_5_224j024j0lusyjwxl.R.inc(99237);result = prime * result + (((((countryName == null) )&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99238)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99239)==0&false))? 0 : countryName.hashCode());
        __CLR4_5_224j024j0lusyjwxl.R.inc(99240);result = prime * result + (((((provinceName == null) )&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99241)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99242)==0&false))? 0 : provinceName.hashCode());
        __CLR4_5_224j024j0lusyjwxl.R.inc(99243);result = prime * result + (((((streetAddress == null) )&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99244)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99245)==0&false))? 0 : streetAddress.hashCode());
        __CLR4_5_224j024j0lusyjwxl.R.inc(99246);result = prime * result + (((((zipCode == null) )&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99247)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99248)==0&false))? 0 : zipCode.hashCode());
        __CLR4_5_224j024j0lusyjwxl.R.inc(99249);return result;
    }finally{__CLR4_5_224j024j0lusyjwxl.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_224j024j0lusyjwxl.R.inc(99250);
        __CLR4_5_224j024j0lusyjwxl.R.inc(99251);if ((((this == obj)&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99252)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99253)==0&false)))
            {__CLR4_5_224j024j0lusyjwxl.R.inc(99254);return true;
        }__CLR4_5_224j024j0lusyjwxl.R.inc(99255);if ((((obj == null)&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99256)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99257)==0&false)))
            {__CLR4_5_224j024j0lusyjwxl.R.inc(99258);return false;
        }__CLR4_5_224j024j0lusyjwxl.R.inc(99259);if ((((getClass() != obj.getClass())&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99260)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99261)==0&false)))
            {__CLR4_5_224j024j0lusyjwxl.R.inc(99262);return false;
        }__CLR4_5_224j024j0lusyjwxl.R.inc(99263);FullAddress other = (FullAddress) obj;
        __CLR4_5_224j024j0lusyjwxl.R.inc(99264);if ((((cityId == null)&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99265)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99266)==0&false))) {{
            __CLR4_5_224j024j0lusyjwxl.R.inc(99267);if ((((other.cityId != null)&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99268)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99269)==0&false)))
                {__CLR4_5_224j024j0lusyjwxl.R.inc(99270);return false;
        }} }else {__CLR4_5_224j024j0lusyjwxl.R.inc(99271);if ((((!cityId.equals(other.cityId))&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99272)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99273)==0&false)))
            {__CLR4_5_224j024j0lusyjwxl.R.inc(99274);return false;
        }}__CLR4_5_224j024j0lusyjwxl.R.inc(99275);if ((((cityName == null)&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99276)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99277)==0&false))) {{
            __CLR4_5_224j024j0lusyjwxl.R.inc(99278);if ((((other.cityName != null)&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99279)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99280)==0&false)))
                {__CLR4_5_224j024j0lusyjwxl.R.inc(99281);return false;
        }} }else {__CLR4_5_224j024j0lusyjwxl.R.inc(99282);if ((((!cityName.equals(other.cityName))&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99283)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99284)==0&false)))
            {__CLR4_5_224j024j0lusyjwxl.R.inc(99285);return false;
        }}__CLR4_5_224j024j0lusyjwxl.R.inc(99286);if ((((countryId == null)&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99287)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99288)==0&false))) {{
            __CLR4_5_224j024j0lusyjwxl.R.inc(99289);if ((((other.countryId != null)&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99290)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99291)==0&false)))
                {__CLR4_5_224j024j0lusyjwxl.R.inc(99292);return false;
        }} }else {__CLR4_5_224j024j0lusyjwxl.R.inc(99293);if ((((!countryId.equals(other.countryId))&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99294)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99295)==0&false)))
            {__CLR4_5_224j024j0lusyjwxl.R.inc(99296);return false;
        }}__CLR4_5_224j024j0lusyjwxl.R.inc(99297);if ((((countryName == null)&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99298)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99299)==0&false))) {{
            __CLR4_5_224j024j0lusyjwxl.R.inc(99300);if ((((other.countryName != null)&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99301)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99302)==0&false)))
                {__CLR4_5_224j024j0lusyjwxl.R.inc(99303);return false;
        }} }else {__CLR4_5_224j024j0lusyjwxl.R.inc(99304);if ((((!countryName.equals(other.countryName))&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99305)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99306)==0&false)))
            {__CLR4_5_224j024j0lusyjwxl.R.inc(99307);return false;
        }}__CLR4_5_224j024j0lusyjwxl.R.inc(99308);if ((((provinceName == null)&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99309)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99310)==0&false))) {{
            __CLR4_5_224j024j0lusyjwxl.R.inc(99311);if ((((other.provinceName != null)&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99312)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99313)==0&false)))
                {__CLR4_5_224j024j0lusyjwxl.R.inc(99314);return false;
        }} }else {__CLR4_5_224j024j0lusyjwxl.R.inc(99315);if ((((!provinceName.equals(other.provinceName))&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99316)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99317)==0&false)))
            {__CLR4_5_224j024j0lusyjwxl.R.inc(99318);return false;
        }}__CLR4_5_224j024j0lusyjwxl.R.inc(99319);if ((((streetAddress == null)&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99320)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99321)==0&false))) {{
            __CLR4_5_224j024j0lusyjwxl.R.inc(99322);if ((((other.streetAddress != null)&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99323)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99324)==0&false)))
                {__CLR4_5_224j024j0lusyjwxl.R.inc(99325);return false;
        }} }else {__CLR4_5_224j024j0lusyjwxl.R.inc(99326);if ((((!streetAddress.equals(other.streetAddress))&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99327)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99328)==0&false)))
            {__CLR4_5_224j024j0lusyjwxl.R.inc(99329);return false;
        }}__CLR4_5_224j024j0lusyjwxl.R.inc(99330);if ((((zipCode == null)&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99331)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99332)==0&false))) {{
            __CLR4_5_224j024j0lusyjwxl.R.inc(99333);if ((((other.zipCode != null)&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99334)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99335)==0&false)))
                {__CLR4_5_224j024j0lusyjwxl.R.inc(99336);return false;
        }} }else {__CLR4_5_224j024j0lusyjwxl.R.inc(99337);if ((((!zipCode.equals(other.zipCode))&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99338)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99339)==0&false)))
            {__CLR4_5_224j024j0lusyjwxl.R.inc(99340);return false;
        }}__CLR4_5_224j024j0lusyjwxl.R.inc(99341);return true;
    }finally{__CLR4_5_224j024j0lusyjwxl.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_224j024j0lusyjwxl.R.inc(99342);
        __CLR4_5_224j024j0lusyjwxl.R.inc(99343);StringBuilder sb = new StringBuilder();
        __CLR4_5_224j024j0lusyjwxl.R.inc(99344);if ((((countryName != null && countryName.length() > 0)&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99345)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99346)==0&false))) {{
            __CLR4_5_224j024j0lusyjwxl.R.inc(99347);sb.append(countryName);
        }
        }__CLR4_5_224j024j0lusyjwxl.R.inc(99348);if ((((provinceName != null && provinceName.length() > 0)&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99349)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99350)==0&false))) {{
            __CLR4_5_224j024j0lusyjwxl.R.inc(99351);sb.append(" ");
            __CLR4_5_224j024j0lusyjwxl.R.inc(99352);sb.append(provinceName);
        }
        }__CLR4_5_224j024j0lusyjwxl.R.inc(99353);if ((((cityName != null && cityName.length() > 0)&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99354)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99355)==0&false))) {{
            __CLR4_5_224j024j0lusyjwxl.R.inc(99356);sb.append(" ");
            __CLR4_5_224j024j0lusyjwxl.R.inc(99357);sb.append(cityName);
        }
        }__CLR4_5_224j024j0lusyjwxl.R.inc(99358);if ((((streetAddress != null && streetAddress.length() > 0)&&(__CLR4_5_224j024j0lusyjwxl.R.iget(99359)!=0|true))||(__CLR4_5_224j024j0lusyjwxl.R.iget(99360)==0&false))) {{
            __CLR4_5_224j024j0lusyjwxl.R.inc(99361);sb.append(" ");
            __CLR4_5_224j024j0lusyjwxl.R.inc(99362);sb.append(streetAddress);
        }
        }__CLR4_5_224j024j0lusyjwxl.R.inc(99363);return sb.toString();
    }finally{__CLR4_5_224j024j0lusyjwxl.R.flushNeeded();}}

}
