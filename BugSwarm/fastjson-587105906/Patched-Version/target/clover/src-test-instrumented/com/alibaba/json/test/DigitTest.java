/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
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

import java.text.NumberFormat;
import java.util.BitSet;

import junit.framework.TestCase;

@java.lang.SuppressWarnings({"fallthrough"}) public class DigitTest extends TestCase {static class __CLR4_5_221zx21zxlusvnjq6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,95990,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private char[] text  = "[-5.041598256063065E-20,-7210028408342716000]".toCharArray();
    private int    COUNT = 1000 * 1000;

    public void test_perf() throws Exception {__CLR4_5_221zx21zxlusvnjq6.R.globalSliceStart(getClass().getName(),95901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t12wvx21zx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_221zx21zxlusvnjq6.R.rethrow($CLV_t2$);}finally{__CLR4_5_221zx21zxlusvnjq6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.DigitTest.test_perf",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),95901,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t12wvx21zx() throws Exception{try{__CLR4_5_221zx21zxlusvnjq6.R.inc(95901);
        __CLR4_5_221zx21zxlusvnjq6.R.inc(95902);for (int i = 0; (((i < 50)&&(__CLR4_5_221zx21zxlusvnjq6.R.iget(95903)!=0|true))||(__CLR4_5_221zx21zxlusvnjq6.R.iget(95904)==0&false)); ++i) {{
            __CLR4_5_221zx21zxlusvnjq6.R.inc(95905);f_isDigitBitSet();
            __CLR4_5_221zx21zxlusvnjq6.R.inc(95906);f_isDigitArray();
            __CLR4_5_221zx21zxlusvnjq6.R.inc(95907);f_isDigitRange();
            __CLR4_5_221zx21zxlusvnjq6.R.inc(95908);f_isDigitSwitch();
            __CLR4_5_221zx21zxlusvnjq6.R.inc(95909);f_isDigitProhibit();

            __CLR4_5_221zx21zxlusvnjq6.R.inc(95910);System.out.println();
            __CLR4_5_221zx21zxlusvnjq6.R.inc(95911);System.out.println();
        }
    }}finally{__CLR4_5_221zx21zxlusvnjq6.R.flushNeeded();}}

    public void f_isDigitBitSet() throws Exception {try{__CLR4_5_221zx21zxlusvnjq6.R.inc(95912);
        __CLR4_5_221zx21zxlusvnjq6.R.inc(95913);long startNano = System.nanoTime();
        __CLR4_5_221zx21zxlusvnjq6.R.inc(95914);for (int i = 0; (((i < COUNT)&&(__CLR4_5_221zx21zxlusvnjq6.R.iget(95915)!=0|true))||(__CLR4_5_221zx21zxlusvnjq6.R.iget(95916)==0&false)); ++i) {{
            __CLR4_5_221zx21zxlusvnjq6.R.inc(95917);for (char ch : text) {{
                __CLR4_5_221zx21zxlusvnjq6.R.inc(95918);isDigitBitSet(ch);
            }
        }}
        }__CLR4_5_221zx21zxlusvnjq6.R.inc(95919);long nano = System.nanoTime() - startNano;
        __CLR4_5_221zx21zxlusvnjq6.R.inc(95920);System.out.println("bitset \t: " + NumberFormat.getInstance().format(nano));
    }finally{__CLR4_5_221zx21zxlusvnjq6.R.flushNeeded();}}

    public void f_isDigitRange() throws Exception {try{__CLR4_5_221zx21zxlusvnjq6.R.inc(95921);
        __CLR4_5_221zx21zxlusvnjq6.R.inc(95922);long startNano = System.nanoTime();
        __CLR4_5_221zx21zxlusvnjq6.R.inc(95923);for (int i = 0; (((i < COUNT)&&(__CLR4_5_221zx21zxlusvnjq6.R.iget(95924)!=0|true))||(__CLR4_5_221zx21zxlusvnjq6.R.iget(95925)==0&false)); ++i) {{
            __CLR4_5_221zx21zxlusvnjq6.R.inc(95926);for (char ch : text) {{
                __CLR4_5_221zx21zxlusvnjq6.R.inc(95927);isDigitRange(ch);
            }
        }}
        }__CLR4_5_221zx21zxlusvnjq6.R.inc(95928);long nano = System.nanoTime() - startNano;
        __CLR4_5_221zx21zxlusvnjq6.R.inc(95929);System.out.println("range \t: " + NumberFormat.getInstance().format(nano));
    }finally{__CLR4_5_221zx21zxlusvnjq6.R.flushNeeded();}}

    public void f_isDigitArray() throws Exception {try{__CLR4_5_221zx21zxlusvnjq6.R.inc(95930);
        __CLR4_5_221zx21zxlusvnjq6.R.inc(95931);long startNano = System.nanoTime();
        __CLR4_5_221zx21zxlusvnjq6.R.inc(95932);for (int i = 0; (((i < COUNT)&&(__CLR4_5_221zx21zxlusvnjq6.R.iget(95933)!=0|true))||(__CLR4_5_221zx21zxlusvnjq6.R.iget(95934)==0&false)); ++i) {{
            __CLR4_5_221zx21zxlusvnjq6.R.inc(95935);for (char ch : text) {{
                __CLR4_5_221zx21zxlusvnjq6.R.inc(95936);isDigitArray(ch);
            }
        }}
        }__CLR4_5_221zx21zxlusvnjq6.R.inc(95937);long nano = System.nanoTime() - startNano;
        __CLR4_5_221zx21zxlusvnjq6.R.inc(95938);System.out.println("array \t: " + NumberFormat.getInstance().format(nano));
    }finally{__CLR4_5_221zx21zxlusvnjq6.R.flushNeeded();}}

    public void f_isDigitSwitch() throws Exception {try{__CLR4_5_221zx21zxlusvnjq6.R.inc(95939);
        __CLR4_5_221zx21zxlusvnjq6.R.inc(95940);long startNano = System.nanoTime();
        __CLR4_5_221zx21zxlusvnjq6.R.inc(95941);for (int i = 0; (((i < COUNT)&&(__CLR4_5_221zx21zxlusvnjq6.R.iget(95942)!=0|true))||(__CLR4_5_221zx21zxlusvnjq6.R.iget(95943)==0&false)); ++i) {{
            __CLR4_5_221zx21zxlusvnjq6.R.inc(95944);for (char ch : text) {{
                __CLR4_5_221zx21zxlusvnjq6.R.inc(95945);isDigitSwitch(ch);
            }
        }}
        }__CLR4_5_221zx21zxlusvnjq6.R.inc(95946);long nano = System.nanoTime() - startNano;
        __CLR4_5_221zx21zxlusvnjq6.R.inc(95947);System.out.println("swtich \t: " + NumberFormat.getInstance().format(nano));
    }finally{__CLR4_5_221zx21zxlusvnjq6.R.flushNeeded();}}

    public void f_isDigitProhibit() throws Exception {try{__CLR4_5_221zx21zxlusvnjq6.R.inc(95948);
        __CLR4_5_221zx21zxlusvnjq6.R.inc(95949);long startNano = System.nanoTime();
        __CLR4_5_221zx21zxlusvnjq6.R.inc(95950);for (int i = 0; (((i < COUNT)&&(__CLR4_5_221zx21zxlusvnjq6.R.iget(95951)!=0|true))||(__CLR4_5_221zx21zxlusvnjq6.R.iget(95952)==0&false)); ++i) {{
            __CLR4_5_221zx21zxlusvnjq6.R.inc(95953);for (char ch : text) {{
                __CLR4_5_221zx21zxlusvnjq6.R.inc(95954);isDigitProhibit(ch);
            }
        }}
        }__CLR4_5_221zx21zxlusvnjq6.R.inc(95955);long nano = System.nanoTime() - startNano;
        __CLR4_5_221zx21zxlusvnjq6.R.inc(95956);System.out.println("prohi \t: " + NumberFormat.getInstance().format(nano));
    }finally{__CLR4_5_221zx21zxlusvnjq6.R.flushNeeded();}}

    private static final boolean[] digitBits = new boolean[256];
    static {try{__CLR4_5_221zx21zxlusvnjq6.R.inc(95957);
        __CLR4_5_221zx21zxlusvnjq6.R.inc(95958);for (char ch = '0'; (((ch <= '9')&&(__CLR4_5_221zx21zxlusvnjq6.R.iget(95959)!=0|true))||(__CLR4_5_221zx21zxlusvnjq6.R.iget(95960)==0&false)); ++ch) {{
            __CLR4_5_221zx21zxlusvnjq6.R.inc(95961);digitBits[ch] = true;
        }
    }}finally{__CLR4_5_221zx21zxlusvnjq6.R.flushNeeded();}}

    public final boolean isDigitArray(char ch) {try{__CLR4_5_221zx21zxlusvnjq6.R.inc(95962);
        __CLR4_5_221zx21zxlusvnjq6.R.inc(95963);return digitBits[ch];
    }finally{__CLR4_5_221zx21zxlusvnjq6.R.flushNeeded();}}

    private static final DetectProhibitChar digitDetectProhibitChar = new DetectProhibitChar(new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' });

    public final boolean isDigitProhibit(char ch) {try{__CLR4_5_221zx21zxlusvnjq6.R.inc(95964);
        __CLR4_5_221zx21zxlusvnjq6.R.inc(95965);return digitDetectProhibitChar.isProhibitChar(ch);
    }finally{__CLR4_5_221zx21zxlusvnjq6.R.flushNeeded();}}

    public final boolean isDigitRange(char ch) {try{__CLR4_5_221zx21zxlusvnjq6.R.inc(95966);
        __CLR4_5_221zx21zxlusvnjq6.R.inc(95967);return ch >= '0' && ch <= '9';
    }finally{__CLR4_5_221zx21zxlusvnjq6.R.flushNeeded();}}

    private static final BitSet bits = new BitSet();
    static {try{__CLR4_5_221zx21zxlusvnjq6.R.inc(95968);
        __CLR4_5_221zx21zxlusvnjq6.R.inc(95969);for (char ch = '0'; (((ch <= '9')&&(__CLR4_5_221zx21zxlusvnjq6.R.iget(95970)!=0|true))||(__CLR4_5_221zx21zxlusvnjq6.R.iget(95971)==0&false)); ++ch) {{
            __CLR4_5_221zx21zxlusvnjq6.R.inc(95972);bits.set(ch, true);
        }
    }}finally{__CLR4_5_221zx21zxlusvnjq6.R.flushNeeded();}}

    public final boolean isDigitBitSet(char ch) {try{__CLR4_5_221zx21zxlusvnjq6.R.inc(95973);
        __CLR4_5_221zx21zxlusvnjq6.R.inc(95974);return bits.get(ch);
    }finally{__CLR4_5_221zx21zxlusvnjq6.R.flushNeeded();}}

    private final boolean isDigitSwitch(char ch) {try{__CLR4_5_221zx21zxlusvnjq6.R.inc(95975);
        boolean __CLB4_5_2_bool0=false;__CLR4_5_221zx21zxlusvnjq6.R.inc(95976);switch (ch) {
            case '0':if (!__CLB4_5_2_bool0) {__CLR4_5_221zx21zxlusvnjq6.R.inc(95977);__CLB4_5_2_bool0=true;}
            case '1':if (!__CLB4_5_2_bool0) {__CLR4_5_221zx21zxlusvnjq6.R.inc(95978);__CLB4_5_2_bool0=true;}
            case '2':if (!__CLB4_5_2_bool0) {__CLR4_5_221zx21zxlusvnjq6.R.inc(95979);__CLB4_5_2_bool0=true;}
            case '3':if (!__CLB4_5_2_bool0) {__CLR4_5_221zx21zxlusvnjq6.R.inc(95980);__CLB4_5_2_bool0=true;}
            case '4':if (!__CLB4_5_2_bool0) {__CLR4_5_221zx21zxlusvnjq6.R.inc(95981);__CLB4_5_2_bool0=true;}
            case '5':if (!__CLB4_5_2_bool0) {__CLR4_5_221zx21zxlusvnjq6.R.inc(95982);__CLB4_5_2_bool0=true;}
            case '6':if (!__CLB4_5_2_bool0) {__CLR4_5_221zx21zxlusvnjq6.R.inc(95983);__CLB4_5_2_bool0=true;}
            case '7':if (!__CLB4_5_2_bool0) {__CLR4_5_221zx21zxlusvnjq6.R.inc(95984);__CLB4_5_2_bool0=true;}
            case '8':if (!__CLB4_5_2_bool0) {__CLR4_5_221zx21zxlusvnjq6.R.inc(95985);__CLB4_5_2_bool0=true;}
            case '9':if (!__CLB4_5_2_bool0) {__CLR4_5_221zx21zxlusvnjq6.R.inc(95986);__CLB4_5_2_bool0=true;}
                __CLR4_5_221zx21zxlusvnjq6.R.inc(95987);return true;
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_221zx21zxlusvnjq6.R.inc(95988);__CLB4_5_2_bool0=true;}
                __CLR4_5_221zx21zxlusvnjq6.R.inc(95989);return false;
        }
    }finally{__CLR4_5_221zx21zxlusvnjq6.R.flushNeeded();}}
}
