/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//**
 * Project: dubbo.hello.sample.service
 *
 * File Created at 2009-6-12
 * $Id$
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

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;


/**
 * TODO Comment of HelloServiceImpl
 * 
 * @author tony.chenl
 */
public class HelloServiceImpl {public static class __CLR4_5_224o424o4lusyjwxp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,99407,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public Tigers eatTiger(Tiger tiger) {try{__CLR4_5_224o424o4lusyjwxp.R.inc(99364);

        __CLR4_5_224o424o4lusyjwxp.R.inc(99365);return new Tigers(tiger);
    }finally{__CLR4_5_224o424o4lusyjwxp.R.flushNeeded();}}

    public String eatTiger() {try{__CLR4_5_224o424o4lusyjwxp.R.inc(99366);
        __CLR4_5_224o424o4lusyjwxp.R.inc(99367);return "\u60f3\u5403\u8001\u864e";
    }finally{__CLR4_5_224o424o4lusyjwxp.R.flushNeeded();}}

    public String eatTiger(String number) {try{__CLR4_5_224o424o4lusyjwxp.R.inc(99368);
        __CLR4_5_224o424o4lusyjwxp.R.inc(99369);return number;
    }finally{__CLR4_5_224o424o4lusyjwxp.R.flushNeeded();}}

    public HashSet<String> eatTigers(String name, HashSet<String> tigers) {try{__CLR4_5_224o424o4lusyjwxp.R.inc(99370);
        __CLR4_5_224o424o4lusyjwxp.R.inc(99371);return tigers;
    }finally{__CLR4_5_224o424o4lusyjwxp.R.flushNeeded();}}

    public Map<String, Collection<String>> eatTiger(String name, HashSet<String> tigers) {try{__CLR4_5_224o424o4lusyjwxp.R.inc(99372);
        __CLR4_5_224o424o4lusyjwxp.R.inc(99373);HashMap<String, Collection<String>> tiger = new HashMap<String, Collection<String>>();
        __CLR4_5_224o424o4lusyjwxp.R.inc(99374);tiger.put(name, tigers);
        __CLR4_5_224o424o4lusyjwxp.R.inc(99375);return tiger;
    }finally{__CLR4_5_224o424o4lusyjwxp.R.flushNeeded();}}

    public String eatTiger(String name, Tiger tiger) {try{__CLR4_5_224o424o4lusyjwxp.R.inc(99376);
        __CLR4_5_224o424o4lusyjwxp.R.inc(99377);return name + "\u60f3\u5403" + tiger.getTigerName() + tiger.getTigerSex();
    }finally{__CLR4_5_224o424o4lusyjwxp.R.flushNeeded();}}

    public EnumTest eatEnums(EnumTest... enums) {try{__CLR4_5_224o424o4lusyjwxp.R.inc(99378);
        __CLR4_5_224o424o4lusyjwxp.R.inc(99379);if ((((enums.length > 0)&&(__CLR4_5_224o424o4lusyjwxp.R.iget(99380)!=0|true))||(__CLR4_5_224o424o4lusyjwxp.R.iget(99381)==0&false))) {{
            __CLR4_5_224o424o4lusyjwxp.R.inc(99382);return enums[enums.length - 1];
        } }else {{
            __CLR4_5_224o424o4lusyjwxp.R.inc(99383);return EnumTest.Cat;
        }
    }}finally{__CLR4_5_224o424o4lusyjwxp.R.flushNeeded();}}

    public Date eatTime(Date date) {try{__CLR4_5_224o424o4lusyjwxp.R.inc(99384);
        __CLR4_5_224o424o4lusyjwxp.R.inc(99385);return date;
    }finally{__CLR4_5_224o424o4lusyjwxp.R.flushNeeded();}}

    @SuppressWarnings("rawtypes")
    public Map eatTiger(Map map) {try{__CLR4_5_224o424o4lusyjwxp.R.inc(99386);
        __CLR4_5_224o424o4lusyjwxp.R.inc(99387);return map;
    }finally{__CLR4_5_224o424o4lusyjwxp.R.flushNeeded();}}

    public Map<String, String> eatTigerMap(Map<String, String> map) {try{__CLR4_5_224o424o4lusyjwxp.R.inc(99388);
        __CLR4_5_224o424o4lusyjwxp.R.inc(99389);return map;
    }finally{__CLR4_5_224o424o4lusyjwxp.R.flushNeeded();}}

    public LinkedHashMap<String, String> eatTiger(LinkedHashMap<String, String> map) {try{__CLR4_5_224o424o4lusyjwxp.R.inc(99390);
        __CLR4_5_224o424o4lusyjwxp.R.inc(99391);return map;
    }finally{__CLR4_5_224o424o4lusyjwxp.R.flushNeeded();}}

    public ConcurrentHashMap<String, String> eatTiger(ConcurrentHashMap<String, String> map) {try{__CLR4_5_224o424o4lusyjwxp.R.inc(99392);
        __CLR4_5_224o424o4lusyjwxp.R.inc(99393);return map;
    }finally{__CLR4_5_224o424o4lusyjwxp.R.flushNeeded();}}

    public String sayHello(String hello) {try{__CLR4_5_224o424o4lusyjwxp.R.inc(99394);
        __CLR4_5_224o424o4lusyjwxp.R.inc(99395);for (int i = 0; (((i < 10000)&&(__CLR4_5_224o424o4lusyjwxp.R.iget(99396)!=0|true))||(__CLR4_5_224o424o4lusyjwxp.R.iget(99397)==0&false)); i++) {{
            __CLR4_5_224o424o4lusyjwxp.R.inc(99398);StringBuffer sb = new StringBuffer();
            __CLR4_5_224o424o4lusyjwxp.R.inc(99399);sb.append(new Random().nextInt(5000));
        }
        }__CLR4_5_224o424o4lusyjwxp.R.inc(99400);return hello;
    }finally{__CLR4_5_224o424o4lusyjwxp.R.flushNeeded();}}

    public Person showPerson(Person person) {try{__CLR4_5_224o424o4lusyjwxp.R.inc(99401);
        __CLR4_5_224o424o4lusyjwxp.R.inc(99402);return person;
    }finally{__CLR4_5_224o424o4lusyjwxp.R.flushNeeded();}}

    public List<Person> eatTiger(List<Person> list) {try{__CLR4_5_224o424o4lusyjwxp.R.inc(99403);
        __CLR4_5_224o424o4lusyjwxp.R.inc(99404);return list;
    }finally{__CLR4_5_224o424o4lusyjwxp.R.flushNeeded();}}

    public String[] eatTiger(String[] args) {try{__CLR4_5_224o424o4lusyjwxp.R.inc(99405);
        __CLR4_5_224o424o4lusyjwxp.R.inc(99406);return args;
    }finally{__CLR4_5_224o424o4lusyjwxp.R.flushNeeded();}}
}
