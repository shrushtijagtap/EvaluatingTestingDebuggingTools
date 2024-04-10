/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//**
 * Project: morgan.domain
 * 
 * File Created at 2009-6-11
 * $Id: Phone.java 77622 2011-03-03 08:31:45Z ding.lid $
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
 * \u7535\u8bdd\u53f7\u7801
 * 
 * @author xk1430
 */
public class Phone implements Serializable {public static class __CLR4_5_224y324y3lusyjwy2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,99842,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 4399060521859707703L;

    private String            country;

    private String            area;

    private String            number;

    private String            extensionNumber;

    public Phone() {try{__CLR4_5_224y324y3lusyjwy2.R.inc(99723);
    }finally{__CLR4_5_224y324y3lusyjwy2.R.flushNeeded();}}

    public Phone(String country, String area, String number, String extensionNumber) {try{__CLR4_5_224y324y3lusyjwy2.R.inc(99724);
        __CLR4_5_224y324y3lusyjwy2.R.inc(99725);this.country = country;
        __CLR4_5_224y324y3lusyjwy2.R.inc(99726);this.area = area;
        __CLR4_5_224y324y3lusyjwy2.R.inc(99727);this.number = number;
        __CLR4_5_224y324y3lusyjwy2.R.inc(99728);this.extensionNumber = extensionNumber;
    }finally{__CLR4_5_224y324y3lusyjwy2.R.flushNeeded();}}

    public void setCountry(String country) {try{__CLR4_5_224y324y3lusyjwy2.R.inc(99729);
        __CLR4_5_224y324y3lusyjwy2.R.inc(99730);this.country = country;
    }finally{__CLR4_5_224y324y3lusyjwy2.R.flushNeeded();}}

    public void setArea(String area) {try{__CLR4_5_224y324y3lusyjwy2.R.inc(99731);
        __CLR4_5_224y324y3lusyjwy2.R.inc(99732);this.area = area;
    }finally{__CLR4_5_224y324y3lusyjwy2.R.flushNeeded();}}

    public void setNumber(String number) {try{__CLR4_5_224y324y3lusyjwy2.R.inc(99733);
        __CLR4_5_224y324y3lusyjwy2.R.inc(99734);this.number = number;
    }finally{__CLR4_5_224y324y3lusyjwy2.R.flushNeeded();}}

    public void setExtensionNumber(String extensionNumber) {try{__CLR4_5_224y324y3lusyjwy2.R.inc(99735);
        __CLR4_5_224y324y3lusyjwy2.R.inc(99736);this.extensionNumber = extensionNumber;
    }finally{__CLR4_5_224y324y3lusyjwy2.R.flushNeeded();}}

    public String getCountry() {try{__CLR4_5_224y324y3lusyjwy2.R.inc(99737);
        __CLR4_5_224y324y3lusyjwy2.R.inc(99738);return country;
    }finally{__CLR4_5_224y324y3lusyjwy2.R.flushNeeded();}}

    public String getArea() {try{__CLR4_5_224y324y3lusyjwy2.R.inc(99739);
        __CLR4_5_224y324y3lusyjwy2.R.inc(99740);return area;
    }finally{__CLR4_5_224y324y3lusyjwy2.R.flushNeeded();}}

    public String getNumber() {try{__CLR4_5_224y324y3lusyjwy2.R.inc(99741);
        __CLR4_5_224y324y3lusyjwy2.R.inc(99742);return number;
    }finally{__CLR4_5_224y324y3lusyjwy2.R.flushNeeded();}}

    public String getExtensionNumber() {try{__CLR4_5_224y324y3lusyjwy2.R.inc(99743);
        __CLR4_5_224y324y3lusyjwy2.R.inc(99744);return extensionNumber;
    }finally{__CLR4_5_224y324y3lusyjwy2.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_224y324y3lusyjwy2.R.inc(99745);
        __CLR4_5_224y324y3lusyjwy2.R.inc(99746);final int prime = 31;
        __CLR4_5_224y324y3lusyjwy2.R.inc(99747);int result = 1;
        __CLR4_5_224y324y3lusyjwy2.R.inc(99748);result = prime * result + (((((area == null) )&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99749)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99750)==0&false))? 0 : area.hashCode());
        __CLR4_5_224y324y3lusyjwy2.R.inc(99751);result = prime * result + (((((country == null) )&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99752)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99753)==0&false))? 0 : country.hashCode());
        __CLR4_5_224y324y3lusyjwy2.R.inc(99754);result = prime * result + (((((extensionNumber == null) )&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99755)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99756)==0&false))? 0 : extensionNumber.hashCode());
        __CLR4_5_224y324y3lusyjwy2.R.inc(99757);result = prime * result + (((((number == null) )&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99758)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99759)==0&false))? 0 : number.hashCode());
        __CLR4_5_224y324y3lusyjwy2.R.inc(99760);return result;
    }finally{__CLR4_5_224y324y3lusyjwy2.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_224y324y3lusyjwy2.R.inc(99761);
        __CLR4_5_224y324y3lusyjwy2.R.inc(99762);if ((((this == obj)&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99763)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99764)==0&false)))
            {__CLR4_5_224y324y3lusyjwy2.R.inc(99765);return true;
        }__CLR4_5_224y324y3lusyjwy2.R.inc(99766);if ((((obj == null)&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99767)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99768)==0&false)))
            {__CLR4_5_224y324y3lusyjwy2.R.inc(99769);return false;
        }__CLR4_5_224y324y3lusyjwy2.R.inc(99770);if ((((getClass() != obj.getClass())&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99771)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99772)==0&false)))
            {__CLR4_5_224y324y3lusyjwy2.R.inc(99773);return false;
        }__CLR4_5_224y324y3lusyjwy2.R.inc(99774);Phone other = (Phone) obj;
        __CLR4_5_224y324y3lusyjwy2.R.inc(99775);if ((((area == null)&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99776)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99777)==0&false))) {{
            __CLR4_5_224y324y3lusyjwy2.R.inc(99778);if ((((other.area != null)&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99779)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99780)==0&false)))
                {__CLR4_5_224y324y3lusyjwy2.R.inc(99781);return false;
        }} }else {__CLR4_5_224y324y3lusyjwy2.R.inc(99782);if ((((!area.equals(other.area))&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99783)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99784)==0&false)))
            {__CLR4_5_224y324y3lusyjwy2.R.inc(99785);return false;
        }}__CLR4_5_224y324y3lusyjwy2.R.inc(99786);if ((((country == null)&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99787)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99788)==0&false))) {{
            __CLR4_5_224y324y3lusyjwy2.R.inc(99789);if ((((other.country != null)&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99790)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99791)==0&false)))
                {__CLR4_5_224y324y3lusyjwy2.R.inc(99792);return false;
        }} }else {__CLR4_5_224y324y3lusyjwy2.R.inc(99793);if ((((!country.equals(other.country))&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99794)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99795)==0&false)))
            {__CLR4_5_224y324y3lusyjwy2.R.inc(99796);return false;
        }}__CLR4_5_224y324y3lusyjwy2.R.inc(99797);if ((((extensionNumber == null)&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99798)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99799)==0&false))) {{
            __CLR4_5_224y324y3lusyjwy2.R.inc(99800);if ((((other.extensionNumber != null)&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99801)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99802)==0&false)))
                {__CLR4_5_224y324y3lusyjwy2.R.inc(99803);return false;
        }} }else {__CLR4_5_224y324y3lusyjwy2.R.inc(99804);if ((((!extensionNumber.equals(other.extensionNumber))&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99805)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99806)==0&false)))
            {__CLR4_5_224y324y3lusyjwy2.R.inc(99807);return false;
        }}__CLR4_5_224y324y3lusyjwy2.R.inc(99808);if ((((number == null)&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99809)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99810)==0&false))) {{
            __CLR4_5_224y324y3lusyjwy2.R.inc(99811);if ((((other.number != null)&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99812)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99813)==0&false)))
                {__CLR4_5_224y324y3lusyjwy2.R.inc(99814);return false;
        }} }else {__CLR4_5_224y324y3lusyjwy2.R.inc(99815);if ((((!number.equals(other.number))&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99816)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99817)==0&false)))
            {__CLR4_5_224y324y3lusyjwy2.R.inc(99818);return false;
        }}__CLR4_5_224y324y3lusyjwy2.R.inc(99819);return true;
    }finally{__CLR4_5_224y324y3lusyjwy2.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_224y324y3lusyjwy2.R.inc(99820);
        __CLR4_5_224y324y3lusyjwy2.R.inc(99821);StringBuilder sb = new StringBuilder();
        __CLR4_5_224y324y3lusyjwy2.R.inc(99822);if ((((country != null && country.length() > 0)&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99823)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99824)==0&false))) {{
            __CLR4_5_224y324y3lusyjwy2.R.inc(99825);sb.append(country);
            __CLR4_5_224y324y3lusyjwy2.R.inc(99826);sb.append("-");
        }
        }__CLR4_5_224y324y3lusyjwy2.R.inc(99827);if ((((area != null && area.length() > 0)&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99828)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99829)==0&false))) {{
            __CLR4_5_224y324y3lusyjwy2.R.inc(99830);sb.append(area);
            __CLR4_5_224y324y3lusyjwy2.R.inc(99831);sb.append("-");
        }
        }__CLR4_5_224y324y3lusyjwy2.R.inc(99832);if ((((number != null && number.length() > 0)&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99833)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99834)==0&false))) {{
            __CLR4_5_224y324y3lusyjwy2.R.inc(99835);sb.append(number);
        }
        }__CLR4_5_224y324y3lusyjwy2.R.inc(99836);if ((((extensionNumber != null && extensionNumber.length() > 0)&&(__CLR4_5_224y324y3lusyjwy2.R.iget(99837)!=0|true))||(__CLR4_5_224y324y3lusyjwy2.R.iget(99838)==0&false))) {{
            __CLR4_5_224y324y3lusyjwy2.R.inc(99839);sb.append("-");
            __CLR4_5_224y324y3lusyjwy2.R.inc(99840);sb.append(extensionNumber);
        }
        }__CLR4_5_224y324y3lusyjwy2.R.inc(99841);return sb.toString();
    }finally{__CLR4_5_224y324y3lusyjwy2.R.flushNeeded();}}

}
