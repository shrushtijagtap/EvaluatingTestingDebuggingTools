/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.serializer;

import java.util.HashSet;
import java.util.Set;

/*
 * Copyright 1999-2018 Alibaba Group.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class SimplePropertyPreFilter implements PropertyPreFilter {public static class __CLR4_5_2ockocklusvmw83{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,31608,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Class<?>    clazz;
    private final Set<String> includes = new HashSet<String>();
    private final Set<String> excludes = new HashSet<String>();
    private int               maxLevel = 0;

    public SimplePropertyPreFilter(String... properties){
        this(null, properties);__CLR4_5_2ockocklusvmw83.R.inc(31557);try{__CLR4_5_2ockocklusvmw83.R.inc(31556);
    }finally{__CLR4_5_2ockocklusvmw83.R.flushNeeded();}}

    public SimplePropertyPreFilter(Class<?> clazz, String... properties){
        super();__CLR4_5_2ockocklusvmw83.R.inc(31559);try{__CLR4_5_2ockocklusvmw83.R.inc(31558);
        __CLR4_5_2ockocklusvmw83.R.inc(31560);this.clazz = clazz;
        __CLR4_5_2ockocklusvmw83.R.inc(31561);for (String item : properties) {{
            __CLR4_5_2ockocklusvmw83.R.inc(31562);if ((((item != null)&&(__CLR4_5_2ockocklusvmw83.R.iget(31563)!=0|true))||(__CLR4_5_2ockocklusvmw83.R.iget(31564)==0&false))) {{
                __CLR4_5_2ockocklusvmw83.R.inc(31565);this.includes.add(item);
            }
        }}
    }}finally{__CLR4_5_2ockocklusvmw83.R.flushNeeded();}}
    
    /**
     * @since 1.2.9
     */
    public int getMaxLevel() {try{__CLR4_5_2ockocklusvmw83.R.inc(31566);
        __CLR4_5_2ockocklusvmw83.R.inc(31567);return maxLevel;
    }finally{__CLR4_5_2ockocklusvmw83.R.flushNeeded();}}
    
    /**
     * @since 1.2.9
     */
    public void setMaxLevel(int maxLevel) {try{__CLR4_5_2ockocklusvmw83.R.inc(31568);
        __CLR4_5_2ockocklusvmw83.R.inc(31569);this.maxLevel = maxLevel;
    }finally{__CLR4_5_2ockocklusvmw83.R.flushNeeded();}}

    public Class<?> getClazz() {try{__CLR4_5_2ockocklusvmw83.R.inc(31570);
        __CLR4_5_2ockocklusvmw83.R.inc(31571);return clazz;
    }finally{__CLR4_5_2ockocklusvmw83.R.flushNeeded();}}

    public Set<String> getIncludes() {try{__CLR4_5_2ockocklusvmw83.R.inc(31572);
        __CLR4_5_2ockocklusvmw83.R.inc(31573);return includes;
    }finally{__CLR4_5_2ockocklusvmw83.R.flushNeeded();}}

    public Set<String> getExcludes() {try{__CLR4_5_2ockocklusvmw83.R.inc(31574);
        __CLR4_5_2ockocklusvmw83.R.inc(31575);return excludes;
    }finally{__CLR4_5_2ockocklusvmw83.R.flushNeeded();}}

    public boolean apply(JSONSerializer serializer, Object source, String name) {try{__CLR4_5_2ockocklusvmw83.R.inc(31576);
        __CLR4_5_2ockocklusvmw83.R.inc(31577);if ((((source == null)&&(__CLR4_5_2ockocklusvmw83.R.iget(31578)!=0|true))||(__CLR4_5_2ockocklusvmw83.R.iget(31579)==0&false))) {{
            __CLR4_5_2ockocklusvmw83.R.inc(31580);return true;
        }

        }__CLR4_5_2ockocklusvmw83.R.inc(31581);if ((((clazz != null && !clazz.isInstance(source))&&(__CLR4_5_2ockocklusvmw83.R.iget(31582)!=0|true))||(__CLR4_5_2ockocklusvmw83.R.iget(31583)==0&false))) {{
            __CLR4_5_2ockocklusvmw83.R.inc(31584);return true;
        }

        }__CLR4_5_2ockocklusvmw83.R.inc(31585);if ((((this.excludes.contains(name))&&(__CLR4_5_2ockocklusvmw83.R.iget(31586)!=0|true))||(__CLR4_5_2ockocklusvmw83.R.iget(31587)==0&false))) {{
            __CLR4_5_2ockocklusvmw83.R.inc(31588);return false;
        }
        
        }__CLR4_5_2ockocklusvmw83.R.inc(31589);if ((((maxLevel > 0)&&(__CLR4_5_2ockocklusvmw83.R.iget(31590)!=0|true))||(__CLR4_5_2ockocklusvmw83.R.iget(31591)==0&false))) {{
            __CLR4_5_2ockocklusvmw83.R.inc(31592);int level = 0;
            __CLR4_5_2ockocklusvmw83.R.inc(31593);SerialContext context = serializer.context;
            __CLR4_5_2ockocklusvmw83.R.inc(31594);while ((((context != null)&&(__CLR4_5_2ockocklusvmw83.R.iget(31595)!=0|true))||(__CLR4_5_2ockocklusvmw83.R.iget(31596)==0&false))) {{
                __CLR4_5_2ockocklusvmw83.R.inc(31597);level++;
                __CLR4_5_2ockocklusvmw83.R.inc(31598);if ((((level > maxLevel)&&(__CLR4_5_2ockocklusvmw83.R.iget(31599)!=0|true))||(__CLR4_5_2ockocklusvmw83.R.iget(31600)==0&false))) {{
                    __CLR4_5_2ockocklusvmw83.R.inc(31601);return false;
                }
                }__CLR4_5_2ockocklusvmw83.R.inc(31602);context = context.parent;
            }
        }}

        }__CLR4_5_2ockocklusvmw83.R.inc(31603);if ((((includes.size() == 0 || includes.contains(name))&&(__CLR4_5_2ockocklusvmw83.R.iget(31604)!=0|true))||(__CLR4_5_2ockocklusvmw83.R.iget(31605)==0&false))) {{
            __CLR4_5_2ockocklusvmw83.R.inc(31606);return true;
        }
        
        }__CLR4_5_2ockocklusvmw83.R.inc(31607);return false;
    }finally{__CLR4_5_2ockocklusvmw83.R.flushNeeded();}}

}
