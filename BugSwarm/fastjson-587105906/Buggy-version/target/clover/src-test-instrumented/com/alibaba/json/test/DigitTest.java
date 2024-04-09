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

import java.text.NumberFormat;
import java.util.BitSet;

import junit.framework.TestCase;

@java.lang.SuppressWarnings({"fallthrough"}) public class DigitTest extends TestCase {static class __CLR4_1_1021202120lusqkqrn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,94769,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private char[] text  = "[-5.041598256063065E-20,-7210028408342716000]".toCharArray();
    private int    COUNT = 1000 * 1000;

    public void test_perf() throws Exception {__CLR4_1_1021202120lusqkqrn.R.globalSliceStart(getClass().getName(),94680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10t12wvx2120();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1021202120lusqkqrn.R.rethrow($CLV_t2$);}finally{__CLR4_1_1021202120lusqkqrn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.DigitTest.test_perf",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),94680,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10t12wvx2120() throws Exception{try{__CLR4_1_1021202120lusqkqrn.R.inc(94680);
        __CLR4_1_1021202120lusqkqrn.R.inc(94681);for (int i = 0; (((i < 50)&&(__CLR4_1_1021202120lusqkqrn.R.iget(94682)!=0|true))||(__CLR4_1_1021202120lusqkqrn.R.iget(94683)==0&false)); ++i) {{
            __CLR4_1_1021202120lusqkqrn.R.inc(94684);f_isDigitBitSet();
            __CLR4_1_1021202120lusqkqrn.R.inc(94685);f_isDigitArray();
            __CLR4_1_1021202120lusqkqrn.R.inc(94686);f_isDigitRange();
            __CLR4_1_1021202120lusqkqrn.R.inc(94687);f_isDigitSwitch();
            __CLR4_1_1021202120lusqkqrn.R.inc(94688);f_isDigitProhibit();

            __CLR4_1_1021202120lusqkqrn.R.inc(94689);System.out.println();
            __CLR4_1_1021202120lusqkqrn.R.inc(94690);System.out.println();
        }
    }}finally{__CLR4_1_1021202120lusqkqrn.R.flushNeeded();}}

    public void f_isDigitBitSet() throws Exception {try{__CLR4_1_1021202120lusqkqrn.R.inc(94691);
        __CLR4_1_1021202120lusqkqrn.R.inc(94692);long startNano = System.nanoTime();
        __CLR4_1_1021202120lusqkqrn.R.inc(94693);for (int i = 0; (((i < COUNT)&&(__CLR4_1_1021202120lusqkqrn.R.iget(94694)!=0|true))||(__CLR4_1_1021202120lusqkqrn.R.iget(94695)==0&false)); ++i) {{
            __CLR4_1_1021202120lusqkqrn.R.inc(94696);for (char ch : text) {{
                __CLR4_1_1021202120lusqkqrn.R.inc(94697);isDigitBitSet(ch);
            }
        }}
        }__CLR4_1_1021202120lusqkqrn.R.inc(94698);long nano = System.nanoTime() - startNano;
        __CLR4_1_1021202120lusqkqrn.R.inc(94699);System.out.println("bitset \t: " + NumberFormat.getInstance().format(nano));
    }finally{__CLR4_1_1021202120lusqkqrn.R.flushNeeded();}}

    public void f_isDigitRange() throws Exception {try{__CLR4_1_1021202120lusqkqrn.R.inc(94700);
        __CLR4_1_1021202120lusqkqrn.R.inc(94701);long startNano = System.nanoTime();
        __CLR4_1_1021202120lusqkqrn.R.inc(94702);for (int i = 0; (((i < COUNT)&&(__CLR4_1_1021202120lusqkqrn.R.iget(94703)!=0|true))||(__CLR4_1_1021202120lusqkqrn.R.iget(94704)==0&false)); ++i) {{
            __CLR4_1_1021202120lusqkqrn.R.inc(94705);for (char ch : text) {{
                __CLR4_1_1021202120lusqkqrn.R.inc(94706);isDigitRange(ch);
            }
        }}
        }__CLR4_1_1021202120lusqkqrn.R.inc(94707);long nano = System.nanoTime() - startNano;
        __CLR4_1_1021202120lusqkqrn.R.inc(94708);System.out.println("range \t: " + NumberFormat.getInstance().format(nano));
    }finally{__CLR4_1_1021202120lusqkqrn.R.flushNeeded();}}

    public void f_isDigitArray() throws Exception {try{__CLR4_1_1021202120lusqkqrn.R.inc(94709);
        __CLR4_1_1021202120lusqkqrn.R.inc(94710);long startNano = System.nanoTime();
        __CLR4_1_1021202120lusqkqrn.R.inc(94711);for (int i = 0; (((i < COUNT)&&(__CLR4_1_1021202120lusqkqrn.R.iget(94712)!=0|true))||(__CLR4_1_1021202120lusqkqrn.R.iget(94713)==0&false)); ++i) {{
            __CLR4_1_1021202120lusqkqrn.R.inc(94714);for (char ch : text) {{
                __CLR4_1_1021202120lusqkqrn.R.inc(94715);isDigitArray(ch);
            }
        }}
        }__CLR4_1_1021202120lusqkqrn.R.inc(94716);long nano = System.nanoTime() - startNano;
        __CLR4_1_1021202120lusqkqrn.R.inc(94717);System.out.println("array \t: " + NumberFormat.getInstance().format(nano));
    }finally{__CLR4_1_1021202120lusqkqrn.R.flushNeeded();}}

    public void f_isDigitSwitch() throws Exception {try{__CLR4_1_1021202120lusqkqrn.R.inc(94718);
        __CLR4_1_1021202120lusqkqrn.R.inc(94719);long startNano = System.nanoTime();
        __CLR4_1_1021202120lusqkqrn.R.inc(94720);for (int i = 0; (((i < COUNT)&&(__CLR4_1_1021202120lusqkqrn.R.iget(94721)!=0|true))||(__CLR4_1_1021202120lusqkqrn.R.iget(94722)==0&false)); ++i) {{
            __CLR4_1_1021202120lusqkqrn.R.inc(94723);for (char ch : text) {{
                __CLR4_1_1021202120lusqkqrn.R.inc(94724);isDigitSwitch(ch);
            }
        }}
        }__CLR4_1_1021202120lusqkqrn.R.inc(94725);long nano = System.nanoTime() - startNano;
        __CLR4_1_1021202120lusqkqrn.R.inc(94726);System.out.println("swtich \t: " + NumberFormat.getInstance().format(nano));
    }finally{__CLR4_1_1021202120lusqkqrn.R.flushNeeded();}}

    public void f_isDigitProhibit() throws Exception {try{__CLR4_1_1021202120lusqkqrn.R.inc(94727);
        __CLR4_1_1021202120lusqkqrn.R.inc(94728);long startNano = System.nanoTime();
        __CLR4_1_1021202120lusqkqrn.R.inc(94729);for (int i = 0; (((i < COUNT)&&(__CLR4_1_1021202120lusqkqrn.R.iget(94730)!=0|true))||(__CLR4_1_1021202120lusqkqrn.R.iget(94731)==0&false)); ++i) {{
            __CLR4_1_1021202120lusqkqrn.R.inc(94732);for (char ch : text) {{
                __CLR4_1_1021202120lusqkqrn.R.inc(94733);isDigitProhibit(ch);
            }
        }}
        }__CLR4_1_1021202120lusqkqrn.R.inc(94734);long nano = System.nanoTime() - startNano;
        __CLR4_1_1021202120lusqkqrn.R.inc(94735);System.out.println("prohi \t: " + NumberFormat.getInstance().format(nano));
    }finally{__CLR4_1_1021202120lusqkqrn.R.flushNeeded();}}

    private static final boolean[] digitBits = new boolean[256];
    static {try{__CLR4_1_1021202120lusqkqrn.R.inc(94736);
        __CLR4_1_1021202120lusqkqrn.R.inc(94737);for (char ch = '0'; (((ch <= '9')&&(__CLR4_1_1021202120lusqkqrn.R.iget(94738)!=0|true))||(__CLR4_1_1021202120lusqkqrn.R.iget(94739)==0&false)); ++ch) {{
            __CLR4_1_1021202120lusqkqrn.R.inc(94740);digitBits[ch] = true;
        }
    }}finally{__CLR4_1_1021202120lusqkqrn.R.flushNeeded();}}

    public final boolean isDigitArray(char ch) {try{__CLR4_1_1021202120lusqkqrn.R.inc(94741);
        __CLR4_1_1021202120lusqkqrn.R.inc(94742);return digitBits[ch];
    }finally{__CLR4_1_1021202120lusqkqrn.R.flushNeeded();}}

    private static final DetectProhibitChar digitDetectProhibitChar = new DetectProhibitChar(new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' });

    public final boolean isDigitProhibit(char ch) {try{__CLR4_1_1021202120lusqkqrn.R.inc(94743);
        __CLR4_1_1021202120lusqkqrn.R.inc(94744);return digitDetectProhibitChar.isProhibitChar(ch);
    }finally{__CLR4_1_1021202120lusqkqrn.R.flushNeeded();}}

    public final boolean isDigitRange(char ch) {try{__CLR4_1_1021202120lusqkqrn.R.inc(94745);
        __CLR4_1_1021202120lusqkqrn.R.inc(94746);return ch >= '0' && ch <= '9';
    }finally{__CLR4_1_1021202120lusqkqrn.R.flushNeeded();}}

    private static final BitSet bits = new BitSet();
    static {try{__CLR4_1_1021202120lusqkqrn.R.inc(94747);
        __CLR4_1_1021202120lusqkqrn.R.inc(94748);for (char ch = '0'; (((ch <= '9')&&(__CLR4_1_1021202120lusqkqrn.R.iget(94749)!=0|true))||(__CLR4_1_1021202120lusqkqrn.R.iget(94750)==0&false)); ++ch) {{
            __CLR4_1_1021202120lusqkqrn.R.inc(94751);bits.set(ch, true);
        }
    }}finally{__CLR4_1_1021202120lusqkqrn.R.flushNeeded();}}

    public final boolean isDigitBitSet(char ch) {try{__CLR4_1_1021202120lusqkqrn.R.inc(94752);
        __CLR4_1_1021202120lusqkqrn.R.inc(94753);return bits.get(ch);
    }finally{__CLR4_1_1021202120lusqkqrn.R.flushNeeded();}}

    private final boolean isDigitSwitch(char ch) {try{__CLR4_1_1021202120lusqkqrn.R.inc(94754);
        boolean __CLB4_1_10_bool0=false;__CLR4_1_1021202120lusqkqrn.R.inc(94755);switch (ch) {
            case '0':if (!__CLB4_1_10_bool0) {__CLR4_1_1021202120lusqkqrn.R.inc(94756);__CLB4_1_10_bool0=true;}
            case '1':if (!__CLB4_1_10_bool0) {__CLR4_1_1021202120lusqkqrn.R.inc(94757);__CLB4_1_10_bool0=true;}
            case '2':if (!__CLB4_1_10_bool0) {__CLR4_1_1021202120lusqkqrn.R.inc(94758);__CLB4_1_10_bool0=true;}
            case '3':if (!__CLB4_1_10_bool0) {__CLR4_1_1021202120lusqkqrn.R.inc(94759);__CLB4_1_10_bool0=true;}
            case '4':if (!__CLB4_1_10_bool0) {__CLR4_1_1021202120lusqkqrn.R.inc(94760);__CLB4_1_10_bool0=true;}
            case '5':if (!__CLB4_1_10_bool0) {__CLR4_1_1021202120lusqkqrn.R.inc(94761);__CLB4_1_10_bool0=true;}
            case '6':if (!__CLB4_1_10_bool0) {__CLR4_1_1021202120lusqkqrn.R.inc(94762);__CLB4_1_10_bool0=true;}
            case '7':if (!__CLB4_1_10_bool0) {__CLR4_1_1021202120lusqkqrn.R.inc(94763);__CLB4_1_10_bool0=true;}
            case '8':if (!__CLB4_1_10_bool0) {__CLR4_1_1021202120lusqkqrn.R.inc(94764);__CLB4_1_10_bool0=true;}
            case '9':if (!__CLB4_1_10_bool0) {__CLR4_1_1021202120lusqkqrn.R.inc(94765);__CLB4_1_10_bool0=true;}
                __CLR4_1_1021202120lusqkqrn.R.inc(94766);return true;
            default:if (!__CLB4_1_10_bool0) {__CLR4_1_1021202120lusqkqrn.R.inc(94767);__CLB4_1_10_bool0=true;}
                __CLR4_1_1021202120lusqkqrn.R.inc(94768);return false;
        }
    }finally{__CLR4_1_1021202120lusqkqrn.R.flushNeeded();}}
}
