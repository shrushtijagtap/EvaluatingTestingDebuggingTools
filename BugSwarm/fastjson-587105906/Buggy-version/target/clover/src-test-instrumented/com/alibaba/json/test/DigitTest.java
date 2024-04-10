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

@java.lang.SuppressWarnings({"fallthrough"}) public class DigitTest extends TestCase {static class __CLR4_1_1022082208luszwhng{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,96001,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private char[] text  = "[-5.041598256063065E-20,-7210028408342716000]".toCharArray();
    private int    COUNT = 1000 * 1000;

    public void test_perf() throws Exception {__CLR4_1_1022082208luszwhng.R.globalSliceStart(getClass().getName(),95912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10t12wvx2208();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1022082208luszwhng.R.rethrow($CLV_t2$);}finally{__CLR4_1_1022082208luszwhng.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.DigitTest.test_perf",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),95912,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10t12wvx2208() throws Exception{try{__CLR4_1_1022082208luszwhng.R.inc(95912);
        __CLR4_1_1022082208luszwhng.R.inc(95913);for (int i = 0; (((i < 50)&&(__CLR4_1_1022082208luszwhng.R.iget(95914)!=0|true))||(__CLR4_1_1022082208luszwhng.R.iget(95915)==0&false)); ++i) {{
            __CLR4_1_1022082208luszwhng.R.inc(95916);f_isDigitBitSet();
            __CLR4_1_1022082208luszwhng.R.inc(95917);f_isDigitArray();
            __CLR4_1_1022082208luszwhng.R.inc(95918);f_isDigitRange();
            __CLR4_1_1022082208luszwhng.R.inc(95919);f_isDigitSwitch();
            __CLR4_1_1022082208luszwhng.R.inc(95920);f_isDigitProhibit();

            __CLR4_1_1022082208luszwhng.R.inc(95921);System.out.println();
            __CLR4_1_1022082208luszwhng.R.inc(95922);System.out.println();
        }
    }}finally{__CLR4_1_1022082208luszwhng.R.flushNeeded();}}

    public void f_isDigitBitSet() throws Exception {try{__CLR4_1_1022082208luszwhng.R.inc(95923);
        __CLR4_1_1022082208luszwhng.R.inc(95924);long startNano = System.nanoTime();
        __CLR4_1_1022082208luszwhng.R.inc(95925);for (int i = 0; (((i < COUNT)&&(__CLR4_1_1022082208luszwhng.R.iget(95926)!=0|true))||(__CLR4_1_1022082208luszwhng.R.iget(95927)==0&false)); ++i) {{
            __CLR4_1_1022082208luszwhng.R.inc(95928);for (char ch : text) {{
                __CLR4_1_1022082208luszwhng.R.inc(95929);isDigitBitSet(ch);
            }
        }}
        }__CLR4_1_1022082208luszwhng.R.inc(95930);long nano = System.nanoTime() - startNano;
        __CLR4_1_1022082208luszwhng.R.inc(95931);System.out.println("bitset \t: " + NumberFormat.getInstance().format(nano));
    }finally{__CLR4_1_1022082208luszwhng.R.flushNeeded();}}

    public void f_isDigitRange() throws Exception {try{__CLR4_1_1022082208luszwhng.R.inc(95932);
        __CLR4_1_1022082208luszwhng.R.inc(95933);long startNano = System.nanoTime();
        __CLR4_1_1022082208luszwhng.R.inc(95934);for (int i = 0; (((i < COUNT)&&(__CLR4_1_1022082208luszwhng.R.iget(95935)!=0|true))||(__CLR4_1_1022082208luszwhng.R.iget(95936)==0&false)); ++i) {{
            __CLR4_1_1022082208luszwhng.R.inc(95937);for (char ch : text) {{
                __CLR4_1_1022082208luszwhng.R.inc(95938);isDigitRange(ch);
            }
        }}
        }__CLR4_1_1022082208luszwhng.R.inc(95939);long nano = System.nanoTime() - startNano;
        __CLR4_1_1022082208luszwhng.R.inc(95940);System.out.println("range \t: " + NumberFormat.getInstance().format(nano));
    }finally{__CLR4_1_1022082208luszwhng.R.flushNeeded();}}

    public void f_isDigitArray() throws Exception {try{__CLR4_1_1022082208luszwhng.R.inc(95941);
        __CLR4_1_1022082208luszwhng.R.inc(95942);long startNano = System.nanoTime();
        __CLR4_1_1022082208luszwhng.R.inc(95943);for (int i = 0; (((i < COUNT)&&(__CLR4_1_1022082208luszwhng.R.iget(95944)!=0|true))||(__CLR4_1_1022082208luszwhng.R.iget(95945)==0&false)); ++i) {{
            __CLR4_1_1022082208luszwhng.R.inc(95946);for (char ch : text) {{
                __CLR4_1_1022082208luszwhng.R.inc(95947);isDigitArray(ch);
            }
        }}
        }__CLR4_1_1022082208luszwhng.R.inc(95948);long nano = System.nanoTime() - startNano;
        __CLR4_1_1022082208luszwhng.R.inc(95949);System.out.println("array \t: " + NumberFormat.getInstance().format(nano));
    }finally{__CLR4_1_1022082208luszwhng.R.flushNeeded();}}

    public void f_isDigitSwitch() throws Exception {try{__CLR4_1_1022082208luszwhng.R.inc(95950);
        __CLR4_1_1022082208luszwhng.R.inc(95951);long startNano = System.nanoTime();
        __CLR4_1_1022082208luszwhng.R.inc(95952);for (int i = 0; (((i < COUNT)&&(__CLR4_1_1022082208luszwhng.R.iget(95953)!=0|true))||(__CLR4_1_1022082208luszwhng.R.iget(95954)==0&false)); ++i) {{
            __CLR4_1_1022082208luszwhng.R.inc(95955);for (char ch : text) {{
                __CLR4_1_1022082208luszwhng.R.inc(95956);isDigitSwitch(ch);
            }
        }}
        }__CLR4_1_1022082208luszwhng.R.inc(95957);long nano = System.nanoTime() - startNano;
        __CLR4_1_1022082208luszwhng.R.inc(95958);System.out.println("swtich \t: " + NumberFormat.getInstance().format(nano));
    }finally{__CLR4_1_1022082208luszwhng.R.flushNeeded();}}

    public void f_isDigitProhibit() throws Exception {try{__CLR4_1_1022082208luszwhng.R.inc(95959);
        __CLR4_1_1022082208luszwhng.R.inc(95960);long startNano = System.nanoTime();
        __CLR4_1_1022082208luszwhng.R.inc(95961);for (int i = 0; (((i < COUNT)&&(__CLR4_1_1022082208luszwhng.R.iget(95962)!=0|true))||(__CLR4_1_1022082208luszwhng.R.iget(95963)==0&false)); ++i) {{
            __CLR4_1_1022082208luszwhng.R.inc(95964);for (char ch : text) {{
                __CLR4_1_1022082208luszwhng.R.inc(95965);isDigitProhibit(ch);
            }
        }}
        }__CLR4_1_1022082208luszwhng.R.inc(95966);long nano = System.nanoTime() - startNano;
        __CLR4_1_1022082208luszwhng.R.inc(95967);System.out.println("prohi \t: " + NumberFormat.getInstance().format(nano));
    }finally{__CLR4_1_1022082208luszwhng.R.flushNeeded();}}

    private static final boolean[] digitBits = new boolean[256];
    static {try{__CLR4_1_1022082208luszwhng.R.inc(95968);
        __CLR4_1_1022082208luszwhng.R.inc(95969);for (char ch = '0'; (((ch <= '9')&&(__CLR4_1_1022082208luszwhng.R.iget(95970)!=0|true))||(__CLR4_1_1022082208luszwhng.R.iget(95971)==0&false)); ++ch) {{
            __CLR4_1_1022082208luszwhng.R.inc(95972);digitBits[ch] = true;
        }
    }}finally{__CLR4_1_1022082208luszwhng.R.flushNeeded();}}

    public final boolean isDigitArray(char ch) {try{__CLR4_1_1022082208luszwhng.R.inc(95973);
        __CLR4_1_1022082208luszwhng.R.inc(95974);return digitBits[ch];
    }finally{__CLR4_1_1022082208luszwhng.R.flushNeeded();}}

    private static final DetectProhibitChar digitDetectProhibitChar = new DetectProhibitChar(new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' });

    public final boolean isDigitProhibit(char ch) {try{__CLR4_1_1022082208luszwhng.R.inc(95975);
        __CLR4_1_1022082208luszwhng.R.inc(95976);return digitDetectProhibitChar.isProhibitChar(ch);
    }finally{__CLR4_1_1022082208luszwhng.R.flushNeeded();}}

    public final boolean isDigitRange(char ch) {try{__CLR4_1_1022082208luszwhng.R.inc(95977);
        __CLR4_1_1022082208luszwhng.R.inc(95978);return ch >= '0' && ch <= '9';
    }finally{__CLR4_1_1022082208luszwhng.R.flushNeeded();}}

    private static final BitSet bits = new BitSet();
    static {try{__CLR4_1_1022082208luszwhng.R.inc(95979);
        __CLR4_1_1022082208luszwhng.R.inc(95980);for (char ch = '0'; (((ch <= '9')&&(__CLR4_1_1022082208luszwhng.R.iget(95981)!=0|true))||(__CLR4_1_1022082208luszwhng.R.iget(95982)==0&false)); ++ch) {{
            __CLR4_1_1022082208luszwhng.R.inc(95983);bits.set(ch, true);
        }
    }}finally{__CLR4_1_1022082208luszwhng.R.flushNeeded();}}

    public final boolean isDigitBitSet(char ch) {try{__CLR4_1_1022082208luszwhng.R.inc(95984);
        __CLR4_1_1022082208luszwhng.R.inc(95985);return bits.get(ch);
    }finally{__CLR4_1_1022082208luszwhng.R.flushNeeded();}}

    private final boolean isDigitSwitch(char ch) {try{__CLR4_1_1022082208luszwhng.R.inc(95986);
        boolean __CLB4_1_10_bool0=false;__CLR4_1_1022082208luszwhng.R.inc(95987);switch (ch) {
            case '0':if (!__CLB4_1_10_bool0) {__CLR4_1_1022082208luszwhng.R.inc(95988);__CLB4_1_10_bool0=true;}
            case '1':if (!__CLB4_1_10_bool0) {__CLR4_1_1022082208luszwhng.R.inc(95989);__CLB4_1_10_bool0=true;}
            case '2':if (!__CLB4_1_10_bool0) {__CLR4_1_1022082208luszwhng.R.inc(95990);__CLB4_1_10_bool0=true;}
            case '3':if (!__CLB4_1_10_bool0) {__CLR4_1_1022082208luszwhng.R.inc(95991);__CLB4_1_10_bool0=true;}
            case '4':if (!__CLB4_1_10_bool0) {__CLR4_1_1022082208luszwhng.R.inc(95992);__CLB4_1_10_bool0=true;}
            case '5':if (!__CLB4_1_10_bool0) {__CLR4_1_1022082208luszwhng.R.inc(95993);__CLB4_1_10_bool0=true;}
            case '6':if (!__CLB4_1_10_bool0) {__CLR4_1_1022082208luszwhng.R.inc(95994);__CLB4_1_10_bool0=true;}
            case '7':if (!__CLB4_1_10_bool0) {__CLR4_1_1022082208luszwhng.R.inc(95995);__CLB4_1_10_bool0=true;}
            case '8':if (!__CLB4_1_10_bool0) {__CLR4_1_1022082208luszwhng.R.inc(95996);__CLB4_1_10_bool0=true;}
            case '9':if (!__CLB4_1_10_bool0) {__CLR4_1_1022082208luszwhng.R.inc(95997);__CLB4_1_10_bool0=true;}
                __CLR4_1_1022082208luszwhng.R.inc(95998);return true;
            default:if (!__CLB4_1_10_bool0) {__CLR4_1_1022082208luszwhng.R.inc(95999);__CLB4_1_10_bool0=true;}
                __CLR4_1_1022082208luszwhng.R.inc(96000);return false;
        }
    }finally{__CLR4_1_1022082208luszwhng.R.flushNeeded();}}
}
