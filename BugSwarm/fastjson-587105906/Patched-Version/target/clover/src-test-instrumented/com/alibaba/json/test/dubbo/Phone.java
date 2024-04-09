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
public class Phone implements Serializable {public static class __CLR4_5_225wb25wblusvnl19{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,101074,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 4399060521859707703L;

    private String            country;

    private String            area;

    private String            number;

    private String            extensionNumber;

    public Phone() {try{__CLR4_5_225wb25wblusvnl19.R.inc(100955);
    }finally{__CLR4_5_225wb25wblusvnl19.R.flushNeeded();}}

    public Phone(String country, String area, String number, String extensionNumber) {try{__CLR4_5_225wb25wblusvnl19.R.inc(100956);
        __CLR4_5_225wb25wblusvnl19.R.inc(100957);this.country = country;
        __CLR4_5_225wb25wblusvnl19.R.inc(100958);this.area = area;
        __CLR4_5_225wb25wblusvnl19.R.inc(100959);this.number = number;
        __CLR4_5_225wb25wblusvnl19.R.inc(100960);this.extensionNumber = extensionNumber;
    }finally{__CLR4_5_225wb25wblusvnl19.R.flushNeeded();}}

    public void setCountry(String country) {try{__CLR4_5_225wb25wblusvnl19.R.inc(100961);
        __CLR4_5_225wb25wblusvnl19.R.inc(100962);this.country = country;
    }finally{__CLR4_5_225wb25wblusvnl19.R.flushNeeded();}}

    public void setArea(String area) {try{__CLR4_5_225wb25wblusvnl19.R.inc(100963);
        __CLR4_5_225wb25wblusvnl19.R.inc(100964);this.area = area;
    }finally{__CLR4_5_225wb25wblusvnl19.R.flushNeeded();}}

    public void setNumber(String number) {try{__CLR4_5_225wb25wblusvnl19.R.inc(100965);
        __CLR4_5_225wb25wblusvnl19.R.inc(100966);this.number = number;
    }finally{__CLR4_5_225wb25wblusvnl19.R.flushNeeded();}}

    public void setExtensionNumber(String extensionNumber) {try{__CLR4_5_225wb25wblusvnl19.R.inc(100967);
        __CLR4_5_225wb25wblusvnl19.R.inc(100968);this.extensionNumber = extensionNumber;
    }finally{__CLR4_5_225wb25wblusvnl19.R.flushNeeded();}}

    public String getCountry() {try{__CLR4_5_225wb25wblusvnl19.R.inc(100969);
        __CLR4_5_225wb25wblusvnl19.R.inc(100970);return country;
    }finally{__CLR4_5_225wb25wblusvnl19.R.flushNeeded();}}

    public String getArea() {try{__CLR4_5_225wb25wblusvnl19.R.inc(100971);
        __CLR4_5_225wb25wblusvnl19.R.inc(100972);return area;
    }finally{__CLR4_5_225wb25wblusvnl19.R.flushNeeded();}}

    public String getNumber() {try{__CLR4_5_225wb25wblusvnl19.R.inc(100973);
        __CLR4_5_225wb25wblusvnl19.R.inc(100974);return number;
    }finally{__CLR4_5_225wb25wblusvnl19.R.flushNeeded();}}

    public String getExtensionNumber() {try{__CLR4_5_225wb25wblusvnl19.R.inc(100975);
        __CLR4_5_225wb25wblusvnl19.R.inc(100976);return extensionNumber;
    }finally{__CLR4_5_225wb25wblusvnl19.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_225wb25wblusvnl19.R.inc(100977);
        __CLR4_5_225wb25wblusvnl19.R.inc(100978);final int prime = 31;
        __CLR4_5_225wb25wblusvnl19.R.inc(100979);int result = 1;
        __CLR4_5_225wb25wblusvnl19.R.inc(100980);result = prime * result + (((((area == null) )&&(__CLR4_5_225wb25wblusvnl19.R.iget(100981)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(100982)==0&false))? 0 : area.hashCode());
        __CLR4_5_225wb25wblusvnl19.R.inc(100983);result = prime * result + (((((country == null) )&&(__CLR4_5_225wb25wblusvnl19.R.iget(100984)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(100985)==0&false))? 0 : country.hashCode());
        __CLR4_5_225wb25wblusvnl19.R.inc(100986);result = prime * result + (((((extensionNumber == null) )&&(__CLR4_5_225wb25wblusvnl19.R.iget(100987)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(100988)==0&false))? 0 : extensionNumber.hashCode());
        __CLR4_5_225wb25wblusvnl19.R.inc(100989);result = prime * result + (((((number == null) )&&(__CLR4_5_225wb25wblusvnl19.R.iget(100990)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(100991)==0&false))? 0 : number.hashCode());
        __CLR4_5_225wb25wblusvnl19.R.inc(100992);return result;
    }finally{__CLR4_5_225wb25wblusvnl19.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_225wb25wblusvnl19.R.inc(100993);
        __CLR4_5_225wb25wblusvnl19.R.inc(100994);if ((((this == obj)&&(__CLR4_5_225wb25wblusvnl19.R.iget(100995)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(100996)==0&false)))
            {__CLR4_5_225wb25wblusvnl19.R.inc(100997);return true;
        }__CLR4_5_225wb25wblusvnl19.R.inc(100998);if ((((obj == null)&&(__CLR4_5_225wb25wblusvnl19.R.iget(100999)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(101000)==0&false)))
            {__CLR4_5_225wb25wblusvnl19.R.inc(101001);return false;
        }__CLR4_5_225wb25wblusvnl19.R.inc(101002);if ((((getClass() != obj.getClass())&&(__CLR4_5_225wb25wblusvnl19.R.iget(101003)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(101004)==0&false)))
            {__CLR4_5_225wb25wblusvnl19.R.inc(101005);return false;
        }__CLR4_5_225wb25wblusvnl19.R.inc(101006);Phone other = (Phone) obj;
        __CLR4_5_225wb25wblusvnl19.R.inc(101007);if ((((area == null)&&(__CLR4_5_225wb25wblusvnl19.R.iget(101008)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(101009)==0&false))) {{
            __CLR4_5_225wb25wblusvnl19.R.inc(101010);if ((((other.area != null)&&(__CLR4_5_225wb25wblusvnl19.R.iget(101011)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(101012)==0&false)))
                {__CLR4_5_225wb25wblusvnl19.R.inc(101013);return false;
        }} }else {__CLR4_5_225wb25wblusvnl19.R.inc(101014);if ((((!area.equals(other.area))&&(__CLR4_5_225wb25wblusvnl19.R.iget(101015)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(101016)==0&false)))
            {__CLR4_5_225wb25wblusvnl19.R.inc(101017);return false;
        }}__CLR4_5_225wb25wblusvnl19.R.inc(101018);if ((((country == null)&&(__CLR4_5_225wb25wblusvnl19.R.iget(101019)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(101020)==0&false))) {{
            __CLR4_5_225wb25wblusvnl19.R.inc(101021);if ((((other.country != null)&&(__CLR4_5_225wb25wblusvnl19.R.iget(101022)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(101023)==0&false)))
                {__CLR4_5_225wb25wblusvnl19.R.inc(101024);return false;
        }} }else {__CLR4_5_225wb25wblusvnl19.R.inc(101025);if ((((!country.equals(other.country))&&(__CLR4_5_225wb25wblusvnl19.R.iget(101026)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(101027)==0&false)))
            {__CLR4_5_225wb25wblusvnl19.R.inc(101028);return false;
        }}__CLR4_5_225wb25wblusvnl19.R.inc(101029);if ((((extensionNumber == null)&&(__CLR4_5_225wb25wblusvnl19.R.iget(101030)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(101031)==0&false))) {{
            __CLR4_5_225wb25wblusvnl19.R.inc(101032);if ((((other.extensionNumber != null)&&(__CLR4_5_225wb25wblusvnl19.R.iget(101033)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(101034)==0&false)))
                {__CLR4_5_225wb25wblusvnl19.R.inc(101035);return false;
        }} }else {__CLR4_5_225wb25wblusvnl19.R.inc(101036);if ((((!extensionNumber.equals(other.extensionNumber))&&(__CLR4_5_225wb25wblusvnl19.R.iget(101037)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(101038)==0&false)))
            {__CLR4_5_225wb25wblusvnl19.R.inc(101039);return false;
        }}__CLR4_5_225wb25wblusvnl19.R.inc(101040);if ((((number == null)&&(__CLR4_5_225wb25wblusvnl19.R.iget(101041)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(101042)==0&false))) {{
            __CLR4_5_225wb25wblusvnl19.R.inc(101043);if ((((other.number != null)&&(__CLR4_5_225wb25wblusvnl19.R.iget(101044)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(101045)==0&false)))
                {__CLR4_5_225wb25wblusvnl19.R.inc(101046);return false;
        }} }else {__CLR4_5_225wb25wblusvnl19.R.inc(101047);if ((((!number.equals(other.number))&&(__CLR4_5_225wb25wblusvnl19.R.iget(101048)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(101049)==0&false)))
            {__CLR4_5_225wb25wblusvnl19.R.inc(101050);return false;
        }}__CLR4_5_225wb25wblusvnl19.R.inc(101051);return true;
    }finally{__CLR4_5_225wb25wblusvnl19.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_225wb25wblusvnl19.R.inc(101052);
        __CLR4_5_225wb25wblusvnl19.R.inc(101053);StringBuilder sb = new StringBuilder();
        __CLR4_5_225wb25wblusvnl19.R.inc(101054);if ((((country != null && country.length() > 0)&&(__CLR4_5_225wb25wblusvnl19.R.iget(101055)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(101056)==0&false))) {{
            __CLR4_5_225wb25wblusvnl19.R.inc(101057);sb.append(country);
            __CLR4_5_225wb25wblusvnl19.R.inc(101058);sb.append("-");
        }
        }__CLR4_5_225wb25wblusvnl19.R.inc(101059);if ((((area != null && area.length() > 0)&&(__CLR4_5_225wb25wblusvnl19.R.iget(101060)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(101061)==0&false))) {{
            __CLR4_5_225wb25wblusvnl19.R.inc(101062);sb.append(area);
            __CLR4_5_225wb25wblusvnl19.R.inc(101063);sb.append("-");
        }
        }__CLR4_5_225wb25wblusvnl19.R.inc(101064);if ((((number != null && number.length() > 0)&&(__CLR4_5_225wb25wblusvnl19.R.iget(101065)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(101066)==0&false))) {{
            __CLR4_5_225wb25wblusvnl19.R.inc(101067);sb.append(number);
        }
        }__CLR4_5_225wb25wblusvnl19.R.inc(101068);if ((((extensionNumber != null && extensionNumber.length() > 0)&&(__CLR4_5_225wb25wblusvnl19.R.iget(101069)!=0|true))||(__CLR4_5_225wb25wblusvnl19.R.iget(101070)==0&false))) {{
            __CLR4_5_225wb25wblusvnl19.R.inc(101071);sb.append("-");
            __CLR4_5_225wb25wblusvnl19.R.inc(101072);sb.append(extensionNumber);
        }
        }__CLR4_5_225wb25wblusvnl19.R.inc(101073);return sb.toString();
    }finally{__CLR4_5_225wb25wblusvnl19.R.flushNeeded();}}

}
