/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//**
 * Project: eve.services
 * 
 * File Created at 2011-12-21
 * $Id$
 * 
 * Copyright 2008 Alibaba.com Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
package com.alibaba.json.bvtVO;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Map;

/**
 * \ufffd\u00bc\ufffd\ufffd\ufffd\ufffd\ufffd
 * 
 * @author wb_jianhui.shijh
 */
public class IEvent implements Serializable {public static class __CLR4_5_21zd61zd6lusyjw6g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,92512,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long   serialVersionUID = -791431935700654454L;

    /**
     * \ufffd\u00bc\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd
     */
    private String              name;

    /**
     * \ufffd\u00bc\ufffd\ufffd\ufffd\ufffd\ufffd\u0534
     */
    private String              source;

    /**
     * \ufffd\u00bc\ufffd\ufffd\ufffd\ufffd
     */
    private Map<String, Object> detailData;

    /**
     * \ufffd\u00bc\ufffd\ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd
     */
    private Timestamp           generateTime;

    /**
     * \ufffd\ufffd\ufffd\u00bc\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04bb\ufffd\ufffd\u03a8\u04bb\ufffd\ufffd\u05be\ufffd\ufffdID.
     */
    private String              externalId;

    public String getExternalId() {try{__CLR4_5_21zd61zd6lusyjw6g.R.inc(92490);
        __CLR4_5_21zd61zd6lusyjw6g.R.inc(92491);return externalId;
    }finally{__CLR4_5_21zd61zd6lusyjw6g.R.flushNeeded();}}

    public void setExternalId(String externalId) {try{__CLR4_5_21zd61zd6lusyjw6g.R.inc(92492);
        __CLR4_5_21zd61zd6lusyjw6g.R.inc(92493);this.externalId = externalId;
    }finally{__CLR4_5_21zd61zd6lusyjw6g.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_21zd61zd6lusyjw6g.R.inc(92494);
        __CLR4_5_21zd61zd6lusyjw6g.R.inc(92495);return name;
    }finally{__CLR4_5_21zd61zd6lusyjw6g.R.flushNeeded();}}

    public void setName(String name) {try{__CLR4_5_21zd61zd6lusyjw6g.R.inc(92496);
        __CLR4_5_21zd61zd6lusyjw6g.R.inc(92497);this.name = name;
    }finally{__CLR4_5_21zd61zd6lusyjw6g.R.flushNeeded();}}

    public String getSource() {try{__CLR4_5_21zd61zd6lusyjw6g.R.inc(92498);
        __CLR4_5_21zd61zd6lusyjw6g.R.inc(92499);return source;
    }finally{__CLR4_5_21zd61zd6lusyjw6g.R.flushNeeded();}}

    public void setSource(String source) {try{__CLR4_5_21zd61zd6lusyjw6g.R.inc(92500);
        __CLR4_5_21zd61zd6lusyjw6g.R.inc(92501);this.source = source;
    }finally{__CLR4_5_21zd61zd6lusyjw6g.R.flushNeeded();}}

    public Map<String, Object> getDetailData() {try{__CLR4_5_21zd61zd6lusyjw6g.R.inc(92502);
        __CLR4_5_21zd61zd6lusyjw6g.R.inc(92503);return detailData;
    }finally{__CLR4_5_21zd61zd6lusyjw6g.R.flushNeeded();}}

    public void setDetailData(Map<String, Object> detailData) {try{__CLR4_5_21zd61zd6lusyjw6g.R.inc(92504);
        __CLR4_5_21zd61zd6lusyjw6g.R.inc(92505);this.detailData = detailData;
    }finally{__CLR4_5_21zd61zd6lusyjw6g.R.flushNeeded();}}

    public Timestamp getGenerateTime() {try{__CLR4_5_21zd61zd6lusyjw6g.R.inc(92506);
        __CLR4_5_21zd61zd6lusyjw6g.R.inc(92507);return generateTime;
    }finally{__CLR4_5_21zd61zd6lusyjw6g.R.flushNeeded();}}

    public void setGenerateTime(Timestamp generateTime) {try{__CLR4_5_21zd61zd6lusyjw6g.R.inc(92508);
        __CLR4_5_21zd61zd6lusyjw6g.R.inc(92509);this.generateTime = generateTime;
    }finally{__CLR4_5_21zd61zd6lusyjw6g.R.flushNeeded();}}

    @Override
    public String toString() {try{__CLR4_5_21zd61zd6lusyjw6g.R.inc(92510);
        __CLR4_5_21zd61zd6lusyjw6g.R.inc(92511);return "IEvent [name=" + name + ", source=" + source + ", externalId=" + externalId
                + ", generateTime=" + generateTime + ", detailData=" + detailData + "]";
    }finally{__CLR4_5_21zd61zd6lusyjw6g.R.flushNeeded();}}

}
