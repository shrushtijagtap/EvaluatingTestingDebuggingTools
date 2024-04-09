/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//**
 * Project: dubbo.test
 * 
 * File Created at 2010-11-17
 * $Id: Person.java 77622 2011-03-03 08:31:45Z ding.lid $
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
 * TODO Comment of Person
 * 
 * @author tony.chenl
 */
public class Person implements Serializable {public static class __CLR4_5_225nr25nrlusvnl0h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,100770,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    String                    personId;

    String                    loginName;

    PersonStatus              status;

    String                    email;

    String                    penName;

    PersonInfo                infoProfile;

    public Person() {try{__CLR4_5_225nr25nrlusvnl0h.R.inc(100647);

    }finally{__CLR4_5_225nr25nrlusvnl0h.R.flushNeeded();}}

    public Person(String id) {try{__CLR4_5_225nr25nrlusvnl0h.R.inc(100648);
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100649);this.personId = id;
    }finally{__CLR4_5_225nr25nrlusvnl0h.R.flushNeeded();}}

    public String getPersonId() {try{__CLR4_5_225nr25nrlusvnl0h.R.inc(100650);
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100651);return personId;
    }finally{__CLR4_5_225nr25nrlusvnl0h.R.flushNeeded();}}

    public void setPersonId(String personId) {try{__CLR4_5_225nr25nrlusvnl0h.R.inc(100652);
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100653);this.personId = personId;
    }finally{__CLR4_5_225nr25nrlusvnl0h.R.flushNeeded();}}

    public PersonInfo getInfoProfile() {try{__CLR4_5_225nr25nrlusvnl0h.R.inc(100654);
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100655);return infoProfile;
    }finally{__CLR4_5_225nr25nrlusvnl0h.R.flushNeeded();}}

    public void setInfoProfile(PersonInfo infoProfile) {try{__CLR4_5_225nr25nrlusvnl0h.R.inc(100656);
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100657);this.infoProfile = infoProfile;
    }finally{__CLR4_5_225nr25nrlusvnl0h.R.flushNeeded();}}

    public void setLoginName(String loginName) {try{__CLR4_5_225nr25nrlusvnl0h.R.inc(100658);
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100659);this.loginName = loginName;
    }finally{__CLR4_5_225nr25nrlusvnl0h.R.flushNeeded();}}

    public void setStatus(PersonStatus status) {try{__CLR4_5_225nr25nrlusvnl0h.R.inc(100660);
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100661);this.status = status;
    }finally{__CLR4_5_225nr25nrlusvnl0h.R.flushNeeded();}}

    public void setEmail(String email) {try{__CLR4_5_225nr25nrlusvnl0h.R.inc(100662);
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100663);this.email = email;
    }finally{__CLR4_5_225nr25nrlusvnl0h.R.flushNeeded();}}

    public void setPenName(String penName) {try{__CLR4_5_225nr25nrlusvnl0h.R.inc(100664);
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100665);this.penName = penName;
    }finally{__CLR4_5_225nr25nrlusvnl0h.R.flushNeeded();}}

    public String getEmail() {try{__CLR4_5_225nr25nrlusvnl0h.R.inc(100666);
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100667);return this.email;
    }finally{__CLR4_5_225nr25nrlusvnl0h.R.flushNeeded();}}

    public String getLoginName() {try{__CLR4_5_225nr25nrlusvnl0h.R.inc(100668);
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100669);return this.loginName;
    }finally{__CLR4_5_225nr25nrlusvnl0h.R.flushNeeded();}}

    public PersonStatus getStatus() {try{__CLR4_5_225nr25nrlusvnl0h.R.inc(100670);
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100671);return this.status;
    }finally{__CLR4_5_225nr25nrlusvnl0h.R.flushNeeded();}}

    public String getPenName() {try{__CLR4_5_225nr25nrlusvnl0h.R.inc(100672);
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100673);return penName;
    }finally{__CLR4_5_225nr25nrlusvnl0h.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_225nr25nrlusvnl0h.R.inc(100674);
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100675);final int prime = 31;
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100676);int result = 1;
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100677);result = prime * result + (((((email == null) )&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100678)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100679)==0&false))? 0 : email.hashCode());
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100680);result = prime * result + (((((infoProfile == null) )&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100681)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100682)==0&false))? 0 : infoProfile.hashCode());
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100683);result = prime * result + (((((loginName == null) )&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100684)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100685)==0&false))? 0 : loginName.hashCode());
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100686);result = prime * result + (((((penName == null) )&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100687)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100688)==0&false))? 0 : penName.hashCode());
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100689);result = prime * result + (((((personId == null) )&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100690)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100691)==0&false))? 0 : personId.hashCode());
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100692);result = prime * result + (((((status == null) )&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100693)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100694)==0&false))? 0 : status.hashCode());
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100695);return result;
    }finally{__CLR4_5_225nr25nrlusvnl0h.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_5_225nr25nrlusvnl0h.R.inc(100696);
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100697);if ((((this == obj)&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100698)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100699)==0&false)))
            {__CLR4_5_225nr25nrlusvnl0h.R.inc(100700);return true;
        }__CLR4_5_225nr25nrlusvnl0h.R.inc(100701);if ((((obj == null)&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100702)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100703)==0&false)))
            {__CLR4_5_225nr25nrlusvnl0h.R.inc(100704);return false;
        }__CLR4_5_225nr25nrlusvnl0h.R.inc(100705);if ((((getClass() != obj.getClass())&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100706)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100707)==0&false)))
            {__CLR4_5_225nr25nrlusvnl0h.R.inc(100708);return false;
        }__CLR4_5_225nr25nrlusvnl0h.R.inc(100709);Person other = (Person) obj;
        __CLR4_5_225nr25nrlusvnl0h.R.inc(100710);if ((((email == null)&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100711)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100712)==0&false))) {{
            __CLR4_5_225nr25nrlusvnl0h.R.inc(100713);if ((((other.email != null)&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100714)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100715)==0&false)))
                {__CLR4_5_225nr25nrlusvnl0h.R.inc(100716);return false;
        }} }else {__CLR4_5_225nr25nrlusvnl0h.R.inc(100717);if ((((!email.equals(other.email))&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100718)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100719)==0&false)))
            {__CLR4_5_225nr25nrlusvnl0h.R.inc(100720);return false;
        }}__CLR4_5_225nr25nrlusvnl0h.R.inc(100721);if ((((infoProfile == null)&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100722)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100723)==0&false))) {{
            __CLR4_5_225nr25nrlusvnl0h.R.inc(100724);if ((((other.infoProfile != null)&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100725)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100726)==0&false)))
                {__CLR4_5_225nr25nrlusvnl0h.R.inc(100727);return false;
        }} }else {__CLR4_5_225nr25nrlusvnl0h.R.inc(100728);if ((((!infoProfile.equals(other.infoProfile))&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100729)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100730)==0&false)))
            {__CLR4_5_225nr25nrlusvnl0h.R.inc(100731);return false;
        }}__CLR4_5_225nr25nrlusvnl0h.R.inc(100732);if ((((loginName == null)&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100733)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100734)==0&false))) {{
            __CLR4_5_225nr25nrlusvnl0h.R.inc(100735);if ((((other.loginName != null)&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100736)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100737)==0&false)))
                {__CLR4_5_225nr25nrlusvnl0h.R.inc(100738);return false;
        }} }else {__CLR4_5_225nr25nrlusvnl0h.R.inc(100739);if ((((!loginName.equals(other.loginName))&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100740)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100741)==0&false)))
            {__CLR4_5_225nr25nrlusvnl0h.R.inc(100742);return false;
        }}__CLR4_5_225nr25nrlusvnl0h.R.inc(100743);if ((((penName == null)&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100744)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100745)==0&false))) {{
            __CLR4_5_225nr25nrlusvnl0h.R.inc(100746);if ((((other.penName != null)&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100747)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100748)==0&false)))
                {__CLR4_5_225nr25nrlusvnl0h.R.inc(100749);return false;
        }} }else {__CLR4_5_225nr25nrlusvnl0h.R.inc(100750);if ((((!penName.equals(other.penName))&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100751)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100752)==0&false)))
            {__CLR4_5_225nr25nrlusvnl0h.R.inc(100753);return false;
        }}__CLR4_5_225nr25nrlusvnl0h.R.inc(100754);if ((((personId == null)&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100755)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100756)==0&false))) {{
            __CLR4_5_225nr25nrlusvnl0h.R.inc(100757);if ((((other.personId != null)&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100758)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100759)==0&false)))
                {__CLR4_5_225nr25nrlusvnl0h.R.inc(100760);return false;
        }} }else {__CLR4_5_225nr25nrlusvnl0h.R.inc(100761);if ((((!personId.equals(other.personId))&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100762)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100763)==0&false)))
            {__CLR4_5_225nr25nrlusvnl0h.R.inc(100764);return false;
        }}__CLR4_5_225nr25nrlusvnl0h.R.inc(100765);if ((((status != other.status)&&(__CLR4_5_225nr25nrlusvnl0h.R.iget(100766)!=0|true))||(__CLR4_5_225nr25nrlusvnl0h.R.iget(100767)==0&false)))
            {__CLR4_5_225nr25nrlusvnl0h.R.inc(100768);return false;
        }__CLR4_5_225nr25nrlusvnl0h.R.inc(100769);return true;
    }finally{__CLR4_5_225nr25nrlusvnl0h.R.flushNeeded();}}

}
