/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//*
 * Copyright 1999-2017 Alibaba Group.
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
package com.alibaba.fastjson.util;

import java.util.Arrays;

/**
 * for concurrent IdentityHashMap
 * 
 * @author wenshao[szujobs@hotmail.com]
 */
@SuppressWarnings("unchecked")
public class IdentityHashMap<K, V> {public static class __CLR4_1_10qmuqmulusqjp0k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,34578,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final Entry<K, V>[] buckets;
    private final int           indexMask;
    public final static int DEFAULT_SIZE = 8192;

    public IdentityHashMap(){
        this(DEFAULT_SIZE);__CLR4_1_10qmuqmulusqjp0k.R.inc(34519);try{__CLR4_1_10qmuqmulusqjp0k.R.inc(34518);
    }finally{__CLR4_1_10qmuqmulusqjp0k.R.flushNeeded();}}

    public IdentityHashMap(int tableSize){try{__CLR4_1_10qmuqmulusqjp0k.R.inc(34520);
        __CLR4_1_10qmuqmulusqjp0k.R.inc(34521);this.indexMask = tableSize - 1;
        __CLR4_1_10qmuqmulusqjp0k.R.inc(34522);this.buckets = new Entry[tableSize];
    }finally{__CLR4_1_10qmuqmulusqjp0k.R.flushNeeded();}}

    public final V get(K key) {try{__CLR4_1_10qmuqmulusqjp0k.R.inc(34523);
        __CLR4_1_10qmuqmulusqjp0k.R.inc(34524);final int hash = System.identityHashCode(key);
        __CLR4_1_10qmuqmulusqjp0k.R.inc(34525);final int bucket = hash & indexMask;

        __CLR4_1_10qmuqmulusqjp0k.R.inc(34526);for (Entry<K, V> entry = buckets[bucket]; (((entry != null)&&(__CLR4_1_10qmuqmulusqjp0k.R.iget(34527)!=0|true))||(__CLR4_1_10qmuqmulusqjp0k.R.iget(34528)==0&false)); entry = entry.next) {{
            __CLR4_1_10qmuqmulusqjp0k.R.inc(34529);if ((((key == entry.key)&&(__CLR4_1_10qmuqmulusqjp0k.R.iget(34530)!=0|true))||(__CLR4_1_10qmuqmulusqjp0k.R.iget(34531)==0&false))) {{
                __CLR4_1_10qmuqmulusqjp0k.R.inc(34532);return (V) entry.value;
            }
        }}

        }__CLR4_1_10qmuqmulusqjp0k.R.inc(34533);return null;
    }finally{__CLR4_1_10qmuqmulusqjp0k.R.flushNeeded();}}

    public Class findClass(String keyString) {try{__CLR4_1_10qmuqmulusqjp0k.R.inc(34534);
        __CLR4_1_10qmuqmulusqjp0k.R.inc(34535);for (int i = 0; (((i < buckets.length)&&(__CLR4_1_10qmuqmulusqjp0k.R.iget(34536)!=0|true))||(__CLR4_1_10qmuqmulusqjp0k.R.iget(34537)==0&false)); i++) {{
            __CLR4_1_10qmuqmulusqjp0k.R.inc(34538);Entry bucket = buckets[i];

            __CLR4_1_10qmuqmulusqjp0k.R.inc(34539);if ((((bucket == null)&&(__CLR4_1_10qmuqmulusqjp0k.R.iget(34540)!=0|true))||(__CLR4_1_10qmuqmulusqjp0k.R.iget(34541)==0&false))) {{
                __CLR4_1_10qmuqmulusqjp0k.R.inc(34542);continue;
            }

            }__CLR4_1_10qmuqmulusqjp0k.R.inc(34543);for (Entry<K, V> entry = bucket; (((entry != null)&&(__CLR4_1_10qmuqmulusqjp0k.R.iget(34544)!=0|true))||(__CLR4_1_10qmuqmulusqjp0k.R.iget(34545)==0&false)); entry = entry.next) {{
                __CLR4_1_10qmuqmulusqjp0k.R.inc(34546);Object key = bucket.key;
                __CLR4_1_10qmuqmulusqjp0k.R.inc(34547);if ((((key instanceof Class)&&(__CLR4_1_10qmuqmulusqjp0k.R.iget(34548)!=0|true))||(__CLR4_1_10qmuqmulusqjp0k.R.iget(34549)==0&false))) {{
                    __CLR4_1_10qmuqmulusqjp0k.R.inc(34550);Class clazz = ((Class) key);
                    __CLR4_1_10qmuqmulusqjp0k.R.inc(34551);String className = clazz.getName();
                    __CLR4_1_10qmuqmulusqjp0k.R.inc(34552);if ((((className.equals(keyString))&&(__CLR4_1_10qmuqmulusqjp0k.R.iget(34553)!=0|true))||(__CLR4_1_10qmuqmulusqjp0k.R.iget(34554)==0&false))) {{
                        __CLR4_1_10qmuqmulusqjp0k.R.inc(34555);return clazz;
                    }
                }}
            }}
        }}

        }__CLR4_1_10qmuqmulusqjp0k.R.inc(34556);return null;
    }finally{__CLR4_1_10qmuqmulusqjp0k.R.flushNeeded();}}

    public boolean put(K key, V value) {try{__CLR4_1_10qmuqmulusqjp0k.R.inc(34557);
        __CLR4_1_10qmuqmulusqjp0k.R.inc(34558);final int hash = System.identityHashCode(key);
        __CLR4_1_10qmuqmulusqjp0k.R.inc(34559);final int bucket = hash & indexMask;

        __CLR4_1_10qmuqmulusqjp0k.R.inc(34560);for (Entry<K, V> entry = buckets[bucket]; (((entry != null)&&(__CLR4_1_10qmuqmulusqjp0k.R.iget(34561)!=0|true))||(__CLR4_1_10qmuqmulusqjp0k.R.iget(34562)==0&false)); entry = entry.next) {{
            __CLR4_1_10qmuqmulusqjp0k.R.inc(34563);if ((((key == entry.key)&&(__CLR4_1_10qmuqmulusqjp0k.R.iget(34564)!=0|true))||(__CLR4_1_10qmuqmulusqjp0k.R.iget(34565)==0&false))) {{
                __CLR4_1_10qmuqmulusqjp0k.R.inc(34566);entry.value = value;
                __CLR4_1_10qmuqmulusqjp0k.R.inc(34567);return true;
            }
        }}

        }__CLR4_1_10qmuqmulusqjp0k.R.inc(34568);Entry<K, V> entry = new Entry<K, V>(key, value, hash, buckets[bucket]);
        __CLR4_1_10qmuqmulusqjp0k.R.inc(34569);buckets[bucket] = entry;  // \u5e76\u53d1\u662f\u5904\u7406\u65f6\u4f1a\u53ef\u80fd\u5bfc\u81f4\u7f13\u5b58\u4e22\u5931\uff0c\u4f46\u4e0d\u5f71\u54cd\u6b63\u786e\u6027

        __CLR4_1_10qmuqmulusqjp0k.R.inc(34570);return false;
    }finally{__CLR4_1_10qmuqmulusqjp0k.R.flushNeeded();}}

    protected static final class Entry<K, V> {

        public final int   hashCode;
        public final K     key;
        public V     value;

        public final Entry<K, V> next;

        public Entry(K key, V value, int hash, Entry<K, V> next){try{__CLR4_1_10qmuqmulusqjp0k.R.inc(34571);
            __CLR4_1_10qmuqmulusqjp0k.R.inc(34572);this.key = key;
            __CLR4_1_10qmuqmulusqjp0k.R.inc(34573);this.value = value;
            __CLR4_1_10qmuqmulusqjp0k.R.inc(34574);this.next = next;
            __CLR4_1_10qmuqmulusqjp0k.R.inc(34575);this.hashCode = hash;
        }finally{__CLR4_1_10qmuqmulusqjp0k.R.flushNeeded();}}
    }

    public void clear() {try{__CLR4_1_10qmuqmulusqjp0k.R.inc(34576);
        __CLR4_1_10qmuqmulusqjp0k.R.inc(34577);Arrays.fill(this.buckets, null);
    }finally{__CLR4_1_10qmuqmulusqjp0k.R.flushNeeded();}}
}
