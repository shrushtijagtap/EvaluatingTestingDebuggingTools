/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//**
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
public class Person implements Serializable {public static class __CLR4_1_1024pu24pulusqkuxf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,99549,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public Person() {try{__CLR4_1_1024pu24pulusqkuxf.R.inc(99426);

    }finally{__CLR4_1_1024pu24pulusqkuxf.R.flushNeeded();}}

    public Person(String id) {try{__CLR4_1_1024pu24pulusqkuxf.R.inc(99427);
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99428);this.personId = id;
    }finally{__CLR4_1_1024pu24pulusqkuxf.R.flushNeeded();}}

    public String getPersonId() {try{__CLR4_1_1024pu24pulusqkuxf.R.inc(99429);
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99430);return personId;
    }finally{__CLR4_1_1024pu24pulusqkuxf.R.flushNeeded();}}

    public void setPersonId(String personId) {try{__CLR4_1_1024pu24pulusqkuxf.R.inc(99431);
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99432);this.personId = personId;
    }finally{__CLR4_1_1024pu24pulusqkuxf.R.flushNeeded();}}

    public PersonInfo getInfoProfile() {try{__CLR4_1_1024pu24pulusqkuxf.R.inc(99433);
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99434);return infoProfile;
    }finally{__CLR4_1_1024pu24pulusqkuxf.R.flushNeeded();}}

    public void setInfoProfile(PersonInfo infoProfile) {try{__CLR4_1_1024pu24pulusqkuxf.R.inc(99435);
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99436);this.infoProfile = infoProfile;
    }finally{__CLR4_1_1024pu24pulusqkuxf.R.flushNeeded();}}

    public void setLoginName(String loginName) {try{__CLR4_1_1024pu24pulusqkuxf.R.inc(99437);
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99438);this.loginName = loginName;
    }finally{__CLR4_1_1024pu24pulusqkuxf.R.flushNeeded();}}

    public void setStatus(PersonStatus status) {try{__CLR4_1_1024pu24pulusqkuxf.R.inc(99439);
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99440);this.status = status;
    }finally{__CLR4_1_1024pu24pulusqkuxf.R.flushNeeded();}}

    public void setEmail(String email) {try{__CLR4_1_1024pu24pulusqkuxf.R.inc(99441);
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99442);this.email = email;
    }finally{__CLR4_1_1024pu24pulusqkuxf.R.flushNeeded();}}

    public void setPenName(String penName) {try{__CLR4_1_1024pu24pulusqkuxf.R.inc(99443);
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99444);this.penName = penName;
    }finally{__CLR4_1_1024pu24pulusqkuxf.R.flushNeeded();}}

    public String getEmail() {try{__CLR4_1_1024pu24pulusqkuxf.R.inc(99445);
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99446);return this.email;
    }finally{__CLR4_1_1024pu24pulusqkuxf.R.flushNeeded();}}

    public String getLoginName() {try{__CLR4_1_1024pu24pulusqkuxf.R.inc(99447);
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99448);return this.loginName;
    }finally{__CLR4_1_1024pu24pulusqkuxf.R.flushNeeded();}}

    public PersonStatus getStatus() {try{__CLR4_1_1024pu24pulusqkuxf.R.inc(99449);
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99450);return this.status;
    }finally{__CLR4_1_1024pu24pulusqkuxf.R.flushNeeded();}}

    public String getPenName() {try{__CLR4_1_1024pu24pulusqkuxf.R.inc(99451);
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99452);return penName;
    }finally{__CLR4_1_1024pu24pulusqkuxf.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_1_1024pu24pulusqkuxf.R.inc(99453);
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99454);final int prime = 31;
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99455);int result = 1;
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99456);result = prime * result + (((((email == null) )&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99457)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99458)==0&false))? 0 : email.hashCode());
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99459);result = prime * result + (((((infoProfile == null) )&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99460)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99461)==0&false))? 0 : infoProfile.hashCode());
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99462);result = prime * result + (((((loginName == null) )&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99463)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99464)==0&false))? 0 : loginName.hashCode());
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99465);result = prime * result + (((((penName == null) )&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99466)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99467)==0&false))? 0 : penName.hashCode());
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99468);result = prime * result + (((((personId == null) )&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99469)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99470)==0&false))? 0 : personId.hashCode());
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99471);result = prime * result + (((((status == null) )&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99472)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99473)==0&false))? 0 : status.hashCode());
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99474);return result;
    }finally{__CLR4_1_1024pu24pulusqkuxf.R.flushNeeded();}}

    @Override
    public boolean equals(Object obj) {try{__CLR4_1_1024pu24pulusqkuxf.R.inc(99475);
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99476);if ((((this == obj)&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99477)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99478)==0&false)))
            {__CLR4_1_1024pu24pulusqkuxf.R.inc(99479);return true;
        }__CLR4_1_1024pu24pulusqkuxf.R.inc(99480);if ((((obj == null)&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99481)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99482)==0&false)))
            {__CLR4_1_1024pu24pulusqkuxf.R.inc(99483);return false;
        }__CLR4_1_1024pu24pulusqkuxf.R.inc(99484);if ((((getClass() != obj.getClass())&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99485)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99486)==0&false)))
            {__CLR4_1_1024pu24pulusqkuxf.R.inc(99487);return false;
        }__CLR4_1_1024pu24pulusqkuxf.R.inc(99488);Person other = (Person) obj;
        __CLR4_1_1024pu24pulusqkuxf.R.inc(99489);if ((((email == null)&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99490)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99491)==0&false))) {{
            __CLR4_1_1024pu24pulusqkuxf.R.inc(99492);if ((((other.email != null)&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99493)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99494)==0&false)))
                {__CLR4_1_1024pu24pulusqkuxf.R.inc(99495);return false;
        }} }else {__CLR4_1_1024pu24pulusqkuxf.R.inc(99496);if ((((!email.equals(other.email))&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99497)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99498)==0&false)))
            {__CLR4_1_1024pu24pulusqkuxf.R.inc(99499);return false;
        }}__CLR4_1_1024pu24pulusqkuxf.R.inc(99500);if ((((infoProfile == null)&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99501)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99502)==0&false))) {{
            __CLR4_1_1024pu24pulusqkuxf.R.inc(99503);if ((((other.infoProfile != null)&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99504)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99505)==0&false)))
                {__CLR4_1_1024pu24pulusqkuxf.R.inc(99506);return false;
        }} }else {__CLR4_1_1024pu24pulusqkuxf.R.inc(99507);if ((((!infoProfile.equals(other.infoProfile))&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99508)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99509)==0&false)))
            {__CLR4_1_1024pu24pulusqkuxf.R.inc(99510);return false;
        }}__CLR4_1_1024pu24pulusqkuxf.R.inc(99511);if ((((loginName == null)&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99512)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99513)==0&false))) {{
            __CLR4_1_1024pu24pulusqkuxf.R.inc(99514);if ((((other.loginName != null)&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99515)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99516)==0&false)))
                {__CLR4_1_1024pu24pulusqkuxf.R.inc(99517);return false;
        }} }else {__CLR4_1_1024pu24pulusqkuxf.R.inc(99518);if ((((!loginName.equals(other.loginName))&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99519)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99520)==0&false)))
            {__CLR4_1_1024pu24pulusqkuxf.R.inc(99521);return false;
        }}__CLR4_1_1024pu24pulusqkuxf.R.inc(99522);if ((((penName == null)&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99523)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99524)==0&false))) {{
            __CLR4_1_1024pu24pulusqkuxf.R.inc(99525);if ((((other.penName != null)&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99526)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99527)==0&false)))
                {__CLR4_1_1024pu24pulusqkuxf.R.inc(99528);return false;
        }} }else {__CLR4_1_1024pu24pulusqkuxf.R.inc(99529);if ((((!penName.equals(other.penName))&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99530)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99531)==0&false)))
            {__CLR4_1_1024pu24pulusqkuxf.R.inc(99532);return false;
        }}__CLR4_1_1024pu24pulusqkuxf.R.inc(99533);if ((((personId == null)&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99534)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99535)==0&false))) {{
            __CLR4_1_1024pu24pulusqkuxf.R.inc(99536);if ((((other.personId != null)&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99537)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99538)==0&false)))
                {__CLR4_1_1024pu24pulusqkuxf.R.inc(99539);return false;
        }} }else {__CLR4_1_1024pu24pulusqkuxf.R.inc(99540);if ((((!personId.equals(other.personId))&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99541)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99542)==0&false)))
            {__CLR4_1_1024pu24pulusqkuxf.R.inc(99543);return false;
        }}__CLR4_1_1024pu24pulusqkuxf.R.inc(99544);if ((((status != other.status)&&(__CLR4_1_1024pu24pulusqkuxf.R.iget(99545)!=0|true))||(__CLR4_1_1024pu24pulusqkuxf.R.iget(99546)==0&false)))
            {__CLR4_1_1024pu24pulusqkuxf.R.inc(99547);return false;
        }__CLR4_1_1024pu24pulusqkuxf.R.inc(99548);return true;
    }finally{__CLR4_1_1024pu24pulusqkuxf.R.flushNeeded();}}

}
