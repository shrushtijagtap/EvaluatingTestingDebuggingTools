/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//**
 * Project: dubbo.test
 * 
 * File Created at 2010-11-17
 * $Id: PersonInfo.java 77622 2011-03-03 08:31:45Z ding.lid $
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
import java.util.List;

/**
 * TODO Comment of PersonInfoModel
 * 
 * @author tony.chenl
 */
public class PersonInfo implements Serializable {public static class __CLR4_5_225r625r6lusvnl0v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,100955,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final long serialVersionUID = 7443011149612231882L;

    List<Phone>               phones;

    Phone                     fax;

    FullAddress               fullAddress;

    String                    mobileNo;

    String                    name;

    boolean                   male;

    boolean                   female;

    String                    department;

    String                    jobTitle;

    String                    homepageUrl;

    public List<Phone> getPhones() {try{__CLR4_5_225r625r6lusvnl0v.R.inc(100770);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100771);return phones;
    }finally{__CLR4_5_225r625r6lusvnl0v.R.flushNeeded();}}

    public void setPhones(List<Phone> phones) {try{__CLR4_5_225r625r6lusvnl0v.R.inc(100772);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100773);this.phones = phones;
    }finally{__CLR4_5_225r625r6lusvnl0v.R.flushNeeded();}}

    public boolean isMale() {try{__CLR4_5_225r625r6lusvnl0v.R.inc(100774);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100775);return male;
    }finally{__CLR4_5_225r625r6lusvnl0v.R.flushNeeded();}}

    public void setMale(boolean male) {try{__CLR4_5_225r625r6lusvnl0v.R.inc(100776);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100777);this.male = male;
    }finally{__CLR4_5_225r625r6lusvnl0v.R.flushNeeded();}}

    public boolean isFemale() {try{__CLR4_5_225r625r6lusvnl0v.R.inc(100778);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100779);return female;
    }finally{__CLR4_5_225r625r6lusvnl0v.R.flushNeeded();}}

    public void setFemale(boolean female) {try{__CLR4_5_225r625r6lusvnl0v.R.inc(100780);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100781);this.female = female;
    }finally{__CLR4_5_225r625r6lusvnl0v.R.flushNeeded();}}

    public void setFax(Phone fax) {try{__CLR4_5_225r625r6lusvnl0v.R.inc(100782);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100783);this.fax = fax;
    }finally{__CLR4_5_225r625r6lusvnl0v.R.flushNeeded();}}

    public void setFullAddress(FullAddress fullAddress) {try{__CLR4_5_225r625r6lusvnl0v.R.inc(100784);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100785);this.fullAddress = fullAddress;
    }finally{__CLR4_5_225r625r6lusvnl0v.R.flushNeeded();}}

    public void setMobileNo(String mobileNo) {try{__CLR4_5_225r625r6lusvnl0v.R.inc(100786);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100787);this.mobileNo = mobileNo;
    }finally{__CLR4_5_225r625r6lusvnl0v.R.flushNeeded();}}

    public void setName(String name) {try{__CLR4_5_225r625r6lusvnl0v.R.inc(100788);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100789);this.name = name;
    }finally{__CLR4_5_225r625r6lusvnl0v.R.flushNeeded();}}

    public void setDepartment(String department) {try{__CLR4_5_225r625r6lusvnl0v.R.inc(100790);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100791);this.department = department;
    }finally{__CLR4_5_225r625r6lusvnl0v.R.flushNeeded();}}

    public void setJobTitle(String jobTitle) {try{__CLR4_5_225r625r6lusvnl0v.R.inc(100792);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100793);this.jobTitle = jobTitle;
    }finally{__CLR4_5_225r625r6lusvnl0v.R.flushNeeded();}}

    public void setHomepageUrl(String homepageUrl) {try{__CLR4_5_225r625r6lusvnl0v.R.inc(100794);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100795);this.homepageUrl = homepageUrl;
    }finally{__CLR4_5_225r625r6lusvnl0v.R.flushNeeded();}}

    public String getDepartment() {try{__CLR4_5_225r625r6lusvnl0v.R.inc(100796);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100797);return department;
    }finally{__CLR4_5_225r625r6lusvnl0v.R.flushNeeded();}}

    public Phone getFax() {try{__CLR4_5_225r625r6lusvnl0v.R.inc(100798);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100799);return fax;
    }finally{__CLR4_5_225r625r6lusvnl0v.R.flushNeeded();}}

    public FullAddress getFullAddress() {try{__CLR4_5_225r625r6lusvnl0v.R.inc(100800);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100801);return fullAddress;
    }finally{__CLR4_5_225r625r6lusvnl0v.R.flushNeeded();}}

    public String getHomepageUrl() {try{__CLR4_5_225r625r6lusvnl0v.R.inc(100802);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100803);return homepageUrl;
    }finally{__CLR4_5_225r625r6lusvnl0v.R.flushNeeded();}}

    public String getJobTitle() {try{__CLR4_5_225r625r6lusvnl0v.R.inc(100804);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100805);return jobTitle;
    }finally{__CLR4_5_225r625r6lusvnl0v.R.flushNeeded();}}

    public String getMobileNo() {try{__CLR4_5_225r625r6lusvnl0v.R.inc(100806);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100807);return mobileNo;
    }finally{__CLR4_5_225r625r6lusvnl0v.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_225r625r6lusvnl0v.R.inc(100808);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100809);return name;
    }finally{__CLR4_5_225r625r6lusvnl0v.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_225r625r6lusvnl0v.R.inc(100810);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100811);final int prime = 31;
        __CLR4_5_225r625r6lusvnl0v.R.inc(100812);int result = 1;
        __CLR4_5_225r625r6lusvnl0v.R.inc(100813);result = prime * result + (((((department == null) )&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100814)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100815)==0&false))? 0 : department.hashCode());
        __CLR4_5_225r625r6lusvnl0v.R.inc(100816);result = prime * result + (((((fax == null) )&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100817)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100818)==0&false))? 0 : fax.hashCode());
        __CLR4_5_225r625r6lusvnl0v.R.inc(100819);result = prime * result + ((((female )&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100820)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100821)==0&false))? 1231 : 1237);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100822);result = prime * result + (((((fullAddress == null) )&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100823)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100824)==0&false))? 0 : fullAddress.hashCode());
        __CLR4_5_225r625r6lusvnl0v.R.inc(100825);result = prime * result + (((((homepageUrl == null) )&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100826)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100827)==0&false))? 0 : homepageUrl.hashCode());
        __CLR4_5_225r625r6lusvnl0v.R.inc(100828);result = prime * result + (((((jobTitle == null) )&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100829)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100830)==0&false))? 0 : jobTitle.hashCode());
        __CLR4_5_225r625r6lusvnl0v.R.inc(100831);result = prime * result + ((((male )&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100832)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100833)==0&false))? 1231 : 1237);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100834);result = prime * result + (((((mobileNo == null) )&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100835)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100836)==0&false))? 0 : mobileNo.hashCode());
        __CLR4_5_225r625r6lusvnl0v.R.inc(100837);result = prime * result + (((((name == null) )&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100838)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100839)==0&false))? 0 : name.hashCode());
        __CLR4_5_225r625r6lusvnl0v.R.inc(100840);result = prime * result + (((((phones == null) )&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100841)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100842)==0&false))? 0 : phones.hashCode());
        __CLR4_5_225r625r6lusvnl0v.R.inc(100843);return result;
    }finally{__CLR4_5_225r625r6lusvnl0v.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_225r625r6lusvnl0v.R.inc(100844);
        __CLR4_5_225r625r6lusvnl0v.R.inc(100845);if ((((this == obj)&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100846)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100847)==0&false)))
            {__CLR4_5_225r625r6lusvnl0v.R.inc(100848);return true;
        }__CLR4_5_225r625r6lusvnl0v.R.inc(100849);if ((((obj == null)&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100850)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100851)==0&false)))
            {__CLR4_5_225r625r6lusvnl0v.R.inc(100852);return false;
        }__CLR4_5_225r625r6lusvnl0v.R.inc(100853);if ((((getClass() != obj.getClass())&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100854)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100855)==0&false)))
            {__CLR4_5_225r625r6lusvnl0v.R.inc(100856);return false;
        }__CLR4_5_225r625r6lusvnl0v.R.inc(100857);PersonInfo other = (PersonInfo) obj;
        __CLR4_5_225r625r6lusvnl0v.R.inc(100858);if ((((department == null)&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100859)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100860)==0&false))) {{
            __CLR4_5_225r625r6lusvnl0v.R.inc(100861);if ((((other.department != null)&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100862)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100863)==0&false)))
                {__CLR4_5_225r625r6lusvnl0v.R.inc(100864);return false;
        }} }else {__CLR4_5_225r625r6lusvnl0v.R.inc(100865);if ((((!department.equals(other.department))&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100866)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100867)==0&false)))
            {__CLR4_5_225r625r6lusvnl0v.R.inc(100868);return false;
        }}__CLR4_5_225r625r6lusvnl0v.R.inc(100869);if ((((fax == null)&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100870)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100871)==0&false))) {{
            __CLR4_5_225r625r6lusvnl0v.R.inc(100872);if ((((other.fax != null)&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100873)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100874)==0&false)))
                {__CLR4_5_225r625r6lusvnl0v.R.inc(100875);return false;
        }} }else {__CLR4_5_225r625r6lusvnl0v.R.inc(100876);if ((((!fax.equals(other.fax))&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100877)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100878)==0&false)))
            {__CLR4_5_225r625r6lusvnl0v.R.inc(100879);return false;
        }}__CLR4_5_225r625r6lusvnl0v.R.inc(100880);if ((((female != other.female)&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100881)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100882)==0&false)))
            {__CLR4_5_225r625r6lusvnl0v.R.inc(100883);return false;
        }__CLR4_5_225r625r6lusvnl0v.R.inc(100884);if ((((fullAddress == null)&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100885)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100886)==0&false))) {{
            __CLR4_5_225r625r6lusvnl0v.R.inc(100887);if ((((other.fullAddress != null)&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100888)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100889)==0&false)))
                {__CLR4_5_225r625r6lusvnl0v.R.inc(100890);return false;
        }} }else {__CLR4_5_225r625r6lusvnl0v.R.inc(100891);if ((((!fullAddress.equals(other.fullAddress))&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100892)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100893)==0&false)))
            {__CLR4_5_225r625r6lusvnl0v.R.inc(100894);return false;
        }}__CLR4_5_225r625r6lusvnl0v.R.inc(100895);if ((((homepageUrl == null)&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100896)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100897)==0&false))) {{
            __CLR4_5_225r625r6lusvnl0v.R.inc(100898);if ((((other.homepageUrl != null)&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100899)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100900)==0&false)))
                {__CLR4_5_225r625r6lusvnl0v.R.inc(100901);return false;
        }} }else {__CLR4_5_225r625r6lusvnl0v.R.inc(100902);if ((((!homepageUrl.equals(other.homepageUrl))&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100903)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100904)==0&false)))
            {__CLR4_5_225r625r6lusvnl0v.R.inc(100905);return false;
        }}__CLR4_5_225r625r6lusvnl0v.R.inc(100906);if ((((jobTitle == null)&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100907)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100908)==0&false))) {{
            __CLR4_5_225r625r6lusvnl0v.R.inc(100909);if ((((other.jobTitle != null)&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100910)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100911)==0&false)))
                {__CLR4_5_225r625r6lusvnl0v.R.inc(100912);return false;
        }} }else {__CLR4_5_225r625r6lusvnl0v.R.inc(100913);if ((((!jobTitle.equals(other.jobTitle))&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100914)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100915)==0&false)))
            {__CLR4_5_225r625r6lusvnl0v.R.inc(100916);return false;
        }}__CLR4_5_225r625r6lusvnl0v.R.inc(100917);if ((((male != other.male)&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100918)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100919)==0&false)))
            {__CLR4_5_225r625r6lusvnl0v.R.inc(100920);return false;
        }__CLR4_5_225r625r6lusvnl0v.R.inc(100921);if ((((mobileNo == null)&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100922)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100923)==0&false))) {{
            __CLR4_5_225r625r6lusvnl0v.R.inc(100924);if ((((other.mobileNo != null)&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100925)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100926)==0&false)))
                {__CLR4_5_225r625r6lusvnl0v.R.inc(100927);return false;
        }} }else {__CLR4_5_225r625r6lusvnl0v.R.inc(100928);if ((((!mobileNo.equals(other.mobileNo))&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100929)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100930)==0&false)))
            {__CLR4_5_225r625r6lusvnl0v.R.inc(100931);return false;
        }}__CLR4_5_225r625r6lusvnl0v.R.inc(100932);if ((((name == null)&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100933)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100934)==0&false))) {{
            __CLR4_5_225r625r6lusvnl0v.R.inc(100935);if ((((other.name != null)&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100936)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100937)==0&false)))
                {__CLR4_5_225r625r6lusvnl0v.R.inc(100938);return false;
        }} }else {__CLR4_5_225r625r6lusvnl0v.R.inc(100939);if ((((!name.equals(other.name))&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100940)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100941)==0&false)))
            {__CLR4_5_225r625r6lusvnl0v.R.inc(100942);return false;
        }}__CLR4_5_225r625r6lusvnl0v.R.inc(100943);if ((((phones == null)&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100944)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100945)==0&false))) {{
            __CLR4_5_225r625r6lusvnl0v.R.inc(100946);if ((((other.phones != null)&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100947)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100948)==0&false)))
                {__CLR4_5_225r625r6lusvnl0v.R.inc(100949);return false;
        }} }else {__CLR4_5_225r625r6lusvnl0v.R.inc(100950);if ((((!phones.equals(other.phones))&&(__CLR4_5_225r625r6lusvnl0v.R.iget(100951)!=0|true))||(__CLR4_5_225r625r6lusvnl0v.R.iget(100952)==0&false)))
            {__CLR4_5_225r625r6lusvnl0v.R.inc(100953);return false;
        }}__CLR4_5_225r625r6lusvnl0v.R.inc(100954);return true;
    }finally{__CLR4_5_225r625r6lusvnl0v.R.flushNeeded();}}

}
