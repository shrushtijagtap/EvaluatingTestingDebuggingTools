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
public class FullAddress implements Serializable {public static class __CLR4_1_1025hj25hjluszwigi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,100607,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 5163979984269419831L;

    private String            countryId;

    private String            countryName;

    private String            provinceName;

    private String            cityId;

    private String            cityName;

    private String            streetAddress;

    private String            zipCode;

    public void setCountryId(String countryId) {try{__CLR4_1_1025hj25hjluszwigi.R.inc(100423);
        __CLR4_1_1025hj25hjluszwigi.R.inc(100424);this.countryId = countryId;
    }finally{__CLR4_1_1025hj25hjluszwigi.R.flushNeeded();}}

    public void setCountryName(String countryName) {try{__CLR4_1_1025hj25hjluszwigi.R.inc(100425);
        __CLR4_1_1025hj25hjluszwigi.R.inc(100426);this.countryName = countryName;
    }finally{__CLR4_1_1025hj25hjluszwigi.R.flushNeeded();}}

    public void setProvinceName(String provinceName) {try{__CLR4_1_1025hj25hjluszwigi.R.inc(100427);
        __CLR4_1_1025hj25hjluszwigi.R.inc(100428);this.provinceName = provinceName;
    }finally{__CLR4_1_1025hj25hjluszwigi.R.flushNeeded();}}

    public void setCityId(String cityId) {try{__CLR4_1_1025hj25hjluszwigi.R.inc(100429);
        __CLR4_1_1025hj25hjluszwigi.R.inc(100430);this.cityId = cityId;
    }finally{__CLR4_1_1025hj25hjluszwigi.R.flushNeeded();}}

    public void setCityName(String cityName) {try{__CLR4_1_1025hj25hjluszwigi.R.inc(100431);
        __CLR4_1_1025hj25hjluszwigi.R.inc(100432);this.cityName = cityName;
    }finally{__CLR4_1_1025hj25hjluszwigi.R.flushNeeded();}}

    public void setStreetAddress(String streetAddress) {try{__CLR4_1_1025hj25hjluszwigi.R.inc(100433);
        __CLR4_1_1025hj25hjluszwigi.R.inc(100434);this.streetAddress = streetAddress;
    }finally{__CLR4_1_1025hj25hjluszwigi.R.flushNeeded();}}

    public void setZipCode(String zipCode) {try{__CLR4_1_1025hj25hjluszwigi.R.inc(100435);
        __CLR4_1_1025hj25hjluszwigi.R.inc(100436);this.zipCode = zipCode;
    }finally{__CLR4_1_1025hj25hjluszwigi.R.flushNeeded();}}

    public String getCountryId() {try{__CLR4_1_1025hj25hjluszwigi.R.inc(100437);
        __CLR4_1_1025hj25hjluszwigi.R.inc(100438);return countryId;
    }finally{__CLR4_1_1025hj25hjluszwigi.R.flushNeeded();}}

    public String getCountryName() {try{__CLR4_1_1025hj25hjluszwigi.R.inc(100439);
        __CLR4_1_1025hj25hjluszwigi.R.inc(100440);return countryName;
    }finally{__CLR4_1_1025hj25hjluszwigi.R.flushNeeded();}}

    public String getProvinceName() {try{__CLR4_1_1025hj25hjluszwigi.R.inc(100441);
        __CLR4_1_1025hj25hjluszwigi.R.inc(100442);return provinceName;
    }finally{__CLR4_1_1025hj25hjluszwigi.R.flushNeeded();}}

    public String getCityId() {try{__CLR4_1_1025hj25hjluszwigi.R.inc(100443);
        __CLR4_1_1025hj25hjluszwigi.R.inc(100444);return cityId;
    }finally{__CLR4_1_1025hj25hjluszwigi.R.flushNeeded();}}

    public String getCityName() {try{__CLR4_1_1025hj25hjluszwigi.R.inc(100445);
        __CLR4_1_1025hj25hjluszwigi.R.inc(100446);return cityName;
    }finally{__CLR4_1_1025hj25hjluszwigi.R.flushNeeded();}}

    public String getStreetAddress() {try{__CLR4_1_1025hj25hjluszwigi.R.inc(100447);
        __CLR4_1_1025hj25hjluszwigi.R.inc(100448);return streetAddress;
    }finally{__CLR4_1_1025hj25hjluszwigi.R.flushNeeded();}}

    public String getZipCode() {try{__CLR4_1_1025hj25hjluszwigi.R.inc(100449);
        __CLR4_1_1025hj25hjluszwigi.R.inc(100450);return zipCode;
    }finally{__CLR4_1_1025hj25hjluszwigi.R.flushNeeded();}}

    public FullAddress() {try{__CLR4_1_1025hj25hjluszwigi.R.inc(100451);
    }finally{__CLR4_1_1025hj25hjluszwigi.R.flushNeeded();}}

    public FullAddress(String countryId, String provinceName, String cityId, String streetAddress,
                       String zipCode) {try{__CLR4_1_1025hj25hjluszwigi.R.inc(100452);
        __CLR4_1_1025hj25hjluszwigi.R.inc(100453);this.countryId = countryId;
        __CLR4_1_1025hj25hjluszwigi.R.inc(100454);this.countryName = countryId;
        __CLR4_1_1025hj25hjluszwigi.R.inc(100455);this.provinceName = provinceName;
        __CLR4_1_1025hj25hjluszwigi.R.inc(100456);this.cityId = cityId;
        __CLR4_1_1025hj25hjluszwigi.R.inc(100457);this.cityName = cityId;
        __CLR4_1_1025hj25hjluszwigi.R.inc(100458);this.streetAddress = streetAddress;
        __CLR4_1_1025hj25hjluszwigi.R.inc(100459);this.zipCode = zipCode;
    }finally{__CLR4_1_1025hj25hjluszwigi.R.flushNeeded();}}

    public FullAddress(String countryId, String countryName, String provinceName, String cityId,
                       String cityName, String streetAddress, String zipCode) {try{__CLR4_1_1025hj25hjluszwigi.R.inc(100460);
        __CLR4_1_1025hj25hjluszwigi.R.inc(100461);this.countryId = countryId;
        __CLR4_1_1025hj25hjluszwigi.R.inc(100462);this.countryName = countryName;
        __CLR4_1_1025hj25hjluszwigi.R.inc(100463);this.provinceName = provinceName;
        __CLR4_1_1025hj25hjluszwigi.R.inc(100464);this.cityId = cityId;
        __CLR4_1_1025hj25hjluszwigi.R.inc(100465);this.cityName = cityName;
        __CLR4_1_1025hj25hjluszwigi.R.inc(100466);this.streetAddress = streetAddress;
        __CLR4_1_1025hj25hjluszwigi.R.inc(100467);this.zipCode = zipCode;
    }finally{__CLR4_1_1025hj25hjluszwigi.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_1_1025hj25hjluszwigi.R.inc(100468);
        __CLR4_1_1025hj25hjluszwigi.R.inc(100469);final int prime = 31;
        __CLR4_1_1025hj25hjluszwigi.R.inc(100470);int result = 1;
        __CLR4_1_1025hj25hjluszwigi.R.inc(100471);result = prime * result + (((((cityId == null) )&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100472)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100473)==0&false))? 0 : cityId.hashCode());
        __CLR4_1_1025hj25hjluszwigi.R.inc(100474);result = prime * result + (((((cityName == null) )&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100475)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100476)==0&false))? 0 : cityName.hashCode());
        __CLR4_1_1025hj25hjluszwigi.R.inc(100477);result = prime * result + (((((countryId == null) )&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100478)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100479)==0&false))? 0 : countryId.hashCode());
        __CLR4_1_1025hj25hjluszwigi.R.inc(100480);result = prime * result + (((((countryName == null) )&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100481)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100482)==0&false))? 0 : countryName.hashCode());
        __CLR4_1_1025hj25hjluszwigi.R.inc(100483);result = prime * result + (((((provinceName == null) )&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100484)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100485)==0&false))? 0 : provinceName.hashCode());
        __CLR4_1_1025hj25hjluszwigi.R.inc(100486);result = prime * result + (((((streetAddress == null) )&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100487)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100488)==0&false))? 0 : streetAddress.hashCode());
        __CLR4_1_1025hj25hjluszwigi.R.inc(100489);result = prime * result + (((((zipCode == null) )&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100490)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100491)==0&false))? 0 : zipCode.hashCode());
        __CLR4_1_1025hj25hjluszwigi.R.inc(100492);return result;
    }finally{__CLR4_1_1025hj25hjluszwigi.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_1_1025hj25hjluszwigi.R.inc(100493);
        __CLR4_1_1025hj25hjluszwigi.R.inc(100494);if ((((this == obj)&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100495)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100496)==0&false)))
            {__CLR4_1_1025hj25hjluszwigi.R.inc(100497);return true;
        }__CLR4_1_1025hj25hjluszwigi.R.inc(100498);if ((((obj == null)&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100499)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100500)==0&false)))
            {__CLR4_1_1025hj25hjluszwigi.R.inc(100501);return false;
        }__CLR4_1_1025hj25hjluszwigi.R.inc(100502);if ((((getClass() != obj.getClass())&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100503)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100504)==0&false)))
            {__CLR4_1_1025hj25hjluszwigi.R.inc(100505);return false;
        }__CLR4_1_1025hj25hjluszwigi.R.inc(100506);FullAddress other = (FullAddress) obj;
        __CLR4_1_1025hj25hjluszwigi.R.inc(100507);if ((((cityId == null)&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100508)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100509)==0&false))) {{
            __CLR4_1_1025hj25hjluszwigi.R.inc(100510);if ((((other.cityId != null)&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100511)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100512)==0&false)))
                {__CLR4_1_1025hj25hjluszwigi.R.inc(100513);return false;
        }} }else {__CLR4_1_1025hj25hjluszwigi.R.inc(100514);if ((((!cityId.equals(other.cityId))&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100515)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100516)==0&false)))
            {__CLR4_1_1025hj25hjluszwigi.R.inc(100517);return false;
        }}__CLR4_1_1025hj25hjluszwigi.R.inc(100518);if ((((cityName == null)&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100519)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100520)==0&false))) {{
            __CLR4_1_1025hj25hjluszwigi.R.inc(100521);if ((((other.cityName != null)&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100522)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100523)==0&false)))
                {__CLR4_1_1025hj25hjluszwigi.R.inc(100524);return false;
        }} }else {__CLR4_1_1025hj25hjluszwigi.R.inc(100525);if ((((!cityName.equals(other.cityName))&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100526)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100527)==0&false)))
            {__CLR4_1_1025hj25hjluszwigi.R.inc(100528);return false;
        }}__CLR4_1_1025hj25hjluszwigi.R.inc(100529);if ((((countryId == null)&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100530)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100531)==0&false))) {{
            __CLR4_1_1025hj25hjluszwigi.R.inc(100532);if ((((other.countryId != null)&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100533)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100534)==0&false)))
                {__CLR4_1_1025hj25hjluszwigi.R.inc(100535);return false;
        }} }else {__CLR4_1_1025hj25hjluszwigi.R.inc(100536);if ((((!countryId.equals(other.countryId))&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100537)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100538)==0&false)))
            {__CLR4_1_1025hj25hjluszwigi.R.inc(100539);return false;
        }}__CLR4_1_1025hj25hjluszwigi.R.inc(100540);if ((((countryName == null)&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100541)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100542)==0&false))) {{
            __CLR4_1_1025hj25hjluszwigi.R.inc(100543);if ((((other.countryName != null)&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100544)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100545)==0&false)))
                {__CLR4_1_1025hj25hjluszwigi.R.inc(100546);return false;
        }} }else {__CLR4_1_1025hj25hjluszwigi.R.inc(100547);if ((((!countryName.equals(other.countryName))&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100548)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100549)==0&false)))
            {__CLR4_1_1025hj25hjluszwigi.R.inc(100550);return false;
        }}__CLR4_1_1025hj25hjluszwigi.R.inc(100551);if ((((provinceName == null)&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100552)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100553)==0&false))) {{
            __CLR4_1_1025hj25hjluszwigi.R.inc(100554);if ((((other.provinceName != null)&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100555)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100556)==0&false)))
                {__CLR4_1_1025hj25hjluszwigi.R.inc(100557);return false;
        }} }else {__CLR4_1_1025hj25hjluszwigi.R.inc(100558);if ((((!provinceName.equals(other.provinceName))&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100559)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100560)==0&false)))
            {__CLR4_1_1025hj25hjluszwigi.R.inc(100561);return false;
        }}__CLR4_1_1025hj25hjluszwigi.R.inc(100562);if ((((streetAddress == null)&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100563)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100564)==0&false))) {{
            __CLR4_1_1025hj25hjluszwigi.R.inc(100565);if ((((other.streetAddress != null)&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100566)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100567)==0&false)))
                {__CLR4_1_1025hj25hjluszwigi.R.inc(100568);return false;
        }} }else {__CLR4_1_1025hj25hjluszwigi.R.inc(100569);if ((((!streetAddress.equals(other.streetAddress))&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100570)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100571)==0&false)))
            {__CLR4_1_1025hj25hjluszwigi.R.inc(100572);return false;
        }}__CLR4_1_1025hj25hjluszwigi.R.inc(100573);if ((((zipCode == null)&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100574)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100575)==0&false))) {{
            __CLR4_1_1025hj25hjluszwigi.R.inc(100576);if ((((other.zipCode != null)&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100577)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100578)==0&false)))
                {__CLR4_1_1025hj25hjluszwigi.R.inc(100579);return false;
        }} }else {__CLR4_1_1025hj25hjluszwigi.R.inc(100580);if ((((!zipCode.equals(other.zipCode))&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100581)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100582)==0&false)))
            {__CLR4_1_1025hj25hjluszwigi.R.inc(100583);return false;
        }}__CLR4_1_1025hj25hjluszwigi.R.inc(100584);return true;
    }finally{__CLR4_1_1025hj25hjluszwigi.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_1_1025hj25hjluszwigi.R.inc(100585);
        __CLR4_1_1025hj25hjluszwigi.R.inc(100586);StringBuilder sb = new StringBuilder();
        __CLR4_1_1025hj25hjluszwigi.R.inc(100587);if ((((countryName != null && countryName.length() > 0)&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100588)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100589)==0&false))) {{
            __CLR4_1_1025hj25hjluszwigi.R.inc(100590);sb.append(countryName);
        }
        }__CLR4_1_1025hj25hjluszwigi.R.inc(100591);if ((((provinceName != null && provinceName.length() > 0)&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100592)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100593)==0&false))) {{
            __CLR4_1_1025hj25hjluszwigi.R.inc(100594);sb.append(" ");
            __CLR4_1_1025hj25hjluszwigi.R.inc(100595);sb.append(provinceName);
        }
        }__CLR4_1_1025hj25hjluszwigi.R.inc(100596);if ((((cityName != null && cityName.length() > 0)&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100597)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100598)==0&false))) {{
            __CLR4_1_1025hj25hjluszwigi.R.inc(100599);sb.append(" ");
            __CLR4_1_1025hj25hjluszwigi.R.inc(100600);sb.append(cityName);
        }
        }__CLR4_1_1025hj25hjluszwigi.R.inc(100601);if ((((streetAddress != null && streetAddress.length() > 0)&&(__CLR4_1_1025hj25hjluszwigi.R.iget(100602)!=0|true))||(__CLR4_1_1025hj25hjluszwigi.R.iget(100603)==0&false))) {{
            __CLR4_1_1025hj25hjluszwigi.R.inc(100604);sb.append(" ");
            __CLR4_1_1025hj25hjluszwigi.R.inc(100605);sb.append(streetAddress);
        }
        }__CLR4_1_1025hj25hjluszwigi.R.inc(100606);return sb.toString();
    }finally{__CLR4_1_1025hj25hjluszwigi.R.flushNeeded();}}

}
