/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//*
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
package com.alibaba.fastjson.serializer;

import java.util.Arrays;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class Labels {public static class __CLR4_1_10l63l63lusqjksq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,27458,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static class DefaultLabelFilter implements LabelFilter {

        private String[] includes;
        private String[] excludes;

        public DefaultLabelFilter(String[] includes, String[] excludes){try{__CLR4_1_10l63l63lusqjksq.R.inc(27435);
            __CLR4_1_10l63l63lusqjksq.R.inc(27436);if ((((includes != null)&&(__CLR4_1_10l63l63lusqjksq.R.iget(27437)!=0|true))||(__CLR4_1_10l63l63lusqjksq.R.iget(27438)==0&false))) {{
                __CLR4_1_10l63l63lusqjksq.R.inc(27439);this.includes = new String[includes.length];
                __CLR4_1_10l63l63lusqjksq.R.inc(27440);System.arraycopy(includes, 0, this.includes, 0, includes.length);
                __CLR4_1_10l63l63lusqjksq.R.inc(27441);Arrays.sort(this.includes);
            }
            }__CLR4_1_10l63l63lusqjksq.R.inc(27442);if ((((excludes != null)&&(__CLR4_1_10l63l63lusqjksq.R.iget(27443)!=0|true))||(__CLR4_1_10l63l63lusqjksq.R.iget(27444)==0&false))) {{
                __CLR4_1_10l63l63lusqjksq.R.inc(27445);this.excludes = new String[excludes.length];
                __CLR4_1_10l63l63lusqjksq.R.inc(27446);System.arraycopy(excludes, 0, this.excludes, 0, excludes.length);
                __CLR4_1_10l63l63lusqjksq.R.inc(27447);Arrays.sort(this.excludes);
            }
        }}finally{__CLR4_1_10l63l63lusqjksq.R.flushNeeded();}}

        public boolean apply(String label) {try{__CLR4_1_10l63l63lusqjksq.R.inc(27448);
            __CLR4_1_10l63l63lusqjksq.R.inc(27449);if ((((excludes != null)&&(__CLR4_1_10l63l63lusqjksq.R.iget(27450)!=0|true))||(__CLR4_1_10l63l63lusqjksq.R.iget(27451)==0&false))) {{
                __CLR4_1_10l63l63lusqjksq.R.inc(27452);return Arrays.binarySearch(excludes, label) < 0;
            }

            }__CLR4_1_10l63l63lusqjksq.R.inc(27453);return includes != null // 
                    && Arrays.binarySearch(includes, label) >= 0;
        }finally{__CLR4_1_10l63l63lusqjksq.R.flushNeeded();}}
    }

    public static LabelFilter includes(String... views) {try{__CLR4_1_10l63l63lusqjksq.R.inc(27454);
        __CLR4_1_10l63l63lusqjksq.R.inc(27455);return new DefaultLabelFilter(views, null);
    }finally{__CLR4_1_10l63l63lusqjksq.R.flushNeeded();}}

    public static LabelFilter excludes(String... views) {try{__CLR4_1_10l63l63lusqjksq.R.inc(27456);
        __CLR4_1_10l63l63lusqjksq.R.inc(27457);return new DefaultLabelFilter(null, views);
    }finally{__CLR4_1_10l63l63lusqjksq.R.flushNeeded();}}
}
