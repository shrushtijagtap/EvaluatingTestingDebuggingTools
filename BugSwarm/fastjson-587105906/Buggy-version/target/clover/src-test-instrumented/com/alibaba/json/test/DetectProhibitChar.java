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
package com.alibaba.json.test;

/**
 * <pre>
 * \u5f53\u6709\u6bd4\u8f83\u591a\u7684\u5b57\u7b26\u4e0d\u80fd\u5728\u67d0\u4e2a\u4e32\u4e2d\u51fa\u73b0\uff0c \u901a\u8fc7\u4e00\u4e2a\u67e5\u8868\u7b97\u6cd5\u786e\u5b9a\u3002\u6bd4\u5982\u8bc6\u522b
 * \uff3ba,b,c,d\uff3d\u4e0d\u80fd\u5728\u4e00\u4e2astring\u4e2d\u51fa\u73b0\u3002
 * \u7531\u4e8e\u6d88\u8017\u6bd4\u8f83\u591a\u7684\u5185\u5b58\uff0c \u6700\u597d\u4f7f\u7528\u5355\u4e00\u5b9e\u4f8b\u3002 \u521d\u59cb\u5316\u8fc7\u7a0b\u5e76\u975e\u7ebf\u7a0b\u5b89\u5168\u3002 \u6700
 * \u597d\u4e00\u6b21\u5b8c\u6210\u521d\u59cb\u5316\u7684\u8fc7\u7a0b\u3002
 * \u4f7f\u7528\u65b9\u6cd5\uff1a
 * DetectProhibitChar p2 = new DetectProhibitChar();
 * p2.addProhibitChar(&quot;\u6211\u4eec\u662f\u4e2d\u56fd\u4eba\uff0a\uff0a\uff03W\uffe5\uff05\uff06\uff0a\uff08\uffe5\uff05
 * \uff06\uff0aAAAAAAAAAAAAAAAAAAAAAAA&quot;);
 * for (int i = 0; i &lt; 65536; i++) {
 * if (p2.isProhibitChar((char) i)) {
 * System.out.print((char) i);
 * }
 * }
 * </pre>
 * 
 * @author sdh5724
 */
public class DetectProhibitChar {public static class __CLR4_1_10210u210ulusqkqpt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,94680,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    byte[] masks = new byte[1024 * 8];

    public DetectProhibitChar(){try{__CLR4_1_10210u210ulusqkqpt.R.inc(94638);

    }finally{__CLR4_1_10210u210ulusqkqpt.R.flushNeeded();}}

    public DetectProhibitChar(char prohibits[]){try{__CLR4_1_10210u210ulusqkqpt.R.inc(94639);
        __CLR4_1_10210u210ulusqkqpt.R.inc(94640);addProhibitChar(prohibits);
    }finally{__CLR4_1_10210u210ulusqkqpt.R.flushNeeded();}}

    /**
     * \u589e\u52a0\u4e00\u4e2a\u8df3\u8d8a\u5b57\u7b26
     * 
     * @param c
     */
    public void addProhibitChar(char c) {try{__CLR4_1_10210u210ulusqkqpt.R.inc(94641);
        __CLR4_1_10210u210ulusqkqpt.R.inc(94642);int pos = c >> 3;
        __CLR4_1_10210u210ulusqkqpt.R.inc(94643);masks[pos] = (byte) ((masks[pos] & 0xFF) | (1 << (c % 8)));
    }finally{__CLR4_1_10210u210ulusqkqpt.R.flushNeeded();}}

    /**
     * \u589e\u52a0\u4e00\u4e2astring\u91cc\u7684\u6240\u6709\u5b57\u7b26
     * 
     * @param str
     */
    public void addProhibitChar(String str) {try{__CLR4_1_10210u210ulusqkqpt.R.inc(94644);
        __CLR4_1_10210u210ulusqkqpt.R.inc(94645);if ((((str != null)&&(__CLR4_1_10210u210ulusqkqpt.R.iget(94646)!=0|true))||(__CLR4_1_10210u210ulusqkqpt.R.iget(94647)==0&false))) {{
            __CLR4_1_10210u210ulusqkqpt.R.inc(94648);char cs[] = str.toCharArray();
            __CLR4_1_10210u210ulusqkqpt.R.inc(94649);for (char c : cs) {{
                __CLR4_1_10210u210ulusqkqpt.R.inc(94650);addProhibitChar(c);
            }
        }}
    }}finally{__CLR4_1_10210u210ulusqkqpt.R.flushNeeded();}}

    public void addProhibitChar(char prohibits[]) {try{__CLR4_1_10210u210ulusqkqpt.R.inc(94651);
        __CLR4_1_10210u210ulusqkqpt.R.inc(94652);if ((((prohibits != null)&&(__CLR4_1_10210u210ulusqkqpt.R.iget(94653)!=0|true))||(__CLR4_1_10210u210ulusqkqpt.R.iget(94654)==0&false))) {{
            __CLR4_1_10210u210ulusqkqpt.R.inc(94655);for (char c : prohibits) {{
                __CLR4_1_10210u210ulusqkqpt.R.inc(94656);addProhibitChar(c);
            }
        }}
    }}finally{__CLR4_1_10210u210ulusqkqpt.R.flushNeeded();}}

    public void removeProhibitChar(char c) {try{__CLR4_1_10210u210ulusqkqpt.R.inc(94657);
        __CLR4_1_10210u210ulusqkqpt.R.inc(94658);int pos = c >> 3;
        __CLR4_1_10210u210ulusqkqpt.R.inc(94659);masks[pos] = (byte) ((masks[pos] & 0xFF) & (~(1 << (c % 8))));
    }finally{__CLR4_1_10210u210ulusqkqpt.R.flushNeeded();}}

    public boolean isProhibitChar(char c) {try{__CLR4_1_10210u210ulusqkqpt.R.inc(94660);
        __CLR4_1_10210u210ulusqkqpt.R.inc(94661);int pos = c >> 3;
        __CLR4_1_10210u210ulusqkqpt.R.inc(94662);int i = (masks[pos] & 0xFF) & (1 << (c % 8));
        __CLR4_1_10210u210ulusqkqpt.R.inc(94663);return (i != 0);
    }finally{__CLR4_1_10210u210ulusqkqpt.R.flushNeeded();}}

    public boolean hasProhibitChar(char cs[]) {try{__CLR4_1_10210u210ulusqkqpt.R.inc(94664);
        __CLR4_1_10210u210ulusqkqpt.R.inc(94665);if ((((cs != null)&&(__CLR4_1_10210u210ulusqkqpt.R.iget(94666)!=0|true))||(__CLR4_1_10210u210ulusqkqpt.R.iget(94667)==0&false))) {{
            __CLR4_1_10210u210ulusqkqpt.R.inc(94668);for (char c : cs) {{
                __CLR4_1_10210u210ulusqkqpt.R.inc(94669);if ((((isProhibitChar(c))&&(__CLR4_1_10210u210ulusqkqpt.R.iget(94670)!=0|true))||(__CLR4_1_10210u210ulusqkqpt.R.iget(94671)==0&false))) {{
                    __CLR4_1_10210u210ulusqkqpt.R.inc(94672);return true;
                }
            }}
        }}
        }__CLR4_1_10210u210ulusqkqpt.R.inc(94673);return false;
    }finally{__CLR4_1_10210u210ulusqkqpt.R.flushNeeded();}}

    public boolean hasProhibitChar(String str) {try{__CLR4_1_10210u210ulusqkqpt.R.inc(94674);
        __CLR4_1_10210u210ulusqkqpt.R.inc(94675);if ((((str != null)&&(__CLR4_1_10210u210ulusqkqpt.R.iget(94676)!=0|true))||(__CLR4_1_10210u210ulusqkqpt.R.iget(94677)==0&false))) {{
            __CLR4_1_10210u210ulusqkqpt.R.inc(94678);return hasProhibitChar(str.toCharArray());
        }
        }__CLR4_1_10210u210ulusqkqpt.R.inc(94679);return false;
    }finally{__CLR4_1_10210u210ulusqkqpt.R.flushNeeded();}}

}
