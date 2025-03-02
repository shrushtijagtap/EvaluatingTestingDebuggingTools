/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvtVO;

/**
 * Project: napoli.domain File Created at 2009-6-3 $Id: QueueEntity.java 55142 2010-08-24 01:43:14Z guolin.zhuanggl $ Copyright
 * 2008 Alibaba.com Croporation Limited. All rights reserved. This software is the confidential and proprietary
 * information of Alibaba Company. ("Confidential Information"). You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license agreement you entered into with Alibaba.com.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * \u7528\u4e8e\u5b58Queue\u914d\u7f6e\u4fe1\u606f\u7684\u7c7b\uff0c\u8fd9\u91cc\u7684Queue\u5c31\u662f\u6307\u4e1a\u52a1\u4e0a\u5bf9\u5e94\u7684\ufffd1\ufffd7\ufffd\u8f91Queue\uff0c\u53ef\u80fd\u4f1a\u5206\u5e03\u5230\u591a\u53f0\u673a\u5668\u4e0a
 * 
 * @author xiaosong.liangxs
 */
public class QueueEntity {public static class __CLR4_5_21zrm1zrmlusyjw7q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,93027,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private int                         id;
    private String                      description;

    private Map<Integer, PhysicalQueue> pqMap = new HashMap<Integer, PhysicalQueue>();

    /**
     * @return the pqMap
     */
    public Map<Integer, PhysicalQueue> getPqMap() {try{__CLR4_5_21zrm1zrmlusyjw7q.R.inc(93010);
        __CLR4_5_21zrm1zrmlusyjw7q.R.inc(93011);return pqMap;
    }finally{__CLR4_5_21zrm1zrmlusyjw7q.R.flushNeeded();}}

    /**
     * @param pqMap the pqMap to set
     */
    public void setPqMap(Map<Integer, PhysicalQueue> pqMap) {try{__CLR4_5_21zrm1zrmlusyjw7q.R.inc(93012);
        __CLR4_5_21zrm1zrmlusyjw7q.R.inc(93013);this.pqMap = pqMap;
    }finally{__CLR4_5_21zrm1zrmlusyjw7q.R.flushNeeded();}}

    public QueueEntity(){try{__CLR4_5_21zrm1zrmlusyjw7q.R.inc(93014);
    }finally{__CLR4_5_21zrm1zrmlusyjw7q.R.flushNeeded();}}

    /**
     * @return the pqMap
     */
    public Map<Integer, PhysicalQueue> getPhysicalQueueMap() {try{__CLR4_5_21zrm1zrmlusyjw7q.R.inc(93015);
        __CLR4_5_21zrm1zrmlusyjw7q.R.inc(93016);return pqMap;
    }finally{__CLR4_5_21zrm1zrmlusyjw7q.R.flushNeeded();}}

    /**
     * @param pqMap the pqMap to set
     */
    public void setPhysicalQueueMap(Map<Integer, PhysicalQueue> pqMap) {try{__CLR4_5_21zrm1zrmlusyjw7q.R.inc(93017);
        __CLR4_5_21zrm1zrmlusyjw7q.R.inc(93018);this.pqMap = pqMap;
    }finally{__CLR4_5_21zrm1zrmlusyjw7q.R.flushNeeded();}}

    public int getId() {try{__CLR4_5_21zrm1zrmlusyjw7q.R.inc(93019);
        __CLR4_5_21zrm1zrmlusyjw7q.R.inc(93020);return id;
    }finally{__CLR4_5_21zrm1zrmlusyjw7q.R.flushNeeded();}}

    public void setId(int id) {try{__CLR4_5_21zrm1zrmlusyjw7q.R.inc(93021);
        __CLR4_5_21zrm1zrmlusyjw7q.R.inc(93022);this.id = id;
    }finally{__CLR4_5_21zrm1zrmlusyjw7q.R.flushNeeded();}}

    public String getDescription() {try{__CLR4_5_21zrm1zrmlusyjw7q.R.inc(93023);
        __CLR4_5_21zrm1zrmlusyjw7q.R.inc(93024);return description;
    }finally{__CLR4_5_21zrm1zrmlusyjw7q.R.flushNeeded();}}

    public void setDescription(String description) {try{__CLR4_5_21zrm1zrmlusyjw7q.R.inc(93025);
        __CLR4_5_21zrm1zrmlusyjw7q.R.inc(93026);this.description = description;
    }finally{__CLR4_5_21zrm1zrmlusyjw7q.R.flushNeeded();}}

}
