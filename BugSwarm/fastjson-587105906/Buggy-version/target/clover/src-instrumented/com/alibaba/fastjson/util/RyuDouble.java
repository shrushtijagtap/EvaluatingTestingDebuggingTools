/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */// Copyright 2018 Ulf Adams
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.alibaba.fastjson.util;

import java.math.BigInteger;

/**
 * An implementation of Ryu for double.
 */
public final class RyuDouble {public static class __CLR4_1_10rdyrdyluszw1vn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,36038,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final int[][] POW5_SPLIT = new int[326][4];
    private static final int[][] POW5_INV_SPLIT = new int[291][4];

    static {try{__CLR4_1_10rdyrdyluszw1vn.R.inc(35494);
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35495);BigInteger mask = BigInteger.ONE.shiftLeft(31).subtract(BigInteger.ONE);
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35496);BigInteger invMask = BigInteger.ONE.shiftLeft(31).subtract(BigInteger.ONE);
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35497);for (int i = 0; (((i < 326)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35498)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35499)==0&false)); i++) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35500);BigInteger pow = BigInteger.valueOf(5).pow(i);
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35501);int pow5len = pow.bitLength();
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35502);int expectedPow5Bits = (((i == 0 )&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35503)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35504)==0&false))? 1 : (int) ((i * 23219280L + 10000000L - 1) / 10000000L);
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35505);if ((((expectedPow5Bits != pow5len)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35506)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35507)==0&false))) {{
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35508);throw new IllegalStateException(pow5len + " != " + expectedPow5Bits);
            }
            }__CLR4_1_10rdyrdyluszw1vn.R.inc(35509);if ((((i < POW5_SPLIT.length)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35510)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35511)==0&false))) {{
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35512);for (int j = 0; (((j < 4)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35513)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35514)==0&false)); j++) {{
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(35515);POW5_SPLIT[i][j] = pow
                            .shiftRight(pow5len - 121 + (3 - j) * 31)
                            .and(mask)
                            .intValue();
                }
            }}

            }__CLR4_1_10rdyrdyluszw1vn.R.inc(35516);if ((((i < POW5_INV_SPLIT.length)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35517)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35518)==0&false))) {{
                // We want floor(log_2 5^q) here, which is pow5len - 1.
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35519);int j = pow5len + 121;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35520);BigInteger inv = BigInteger.ONE
                        .shiftLeft(j)
                        .divide(pow)
                        .add(BigInteger.ONE);
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35521);for (int k = 0; (((k < 4)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35522)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35523)==0&false)); k++) {{
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(35524);if ((((k == 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35525)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35526)==0&false))) {{
                        __CLR4_1_10rdyrdyluszw1vn.R.inc(35527);POW5_INV_SPLIT[i][k] = inv
                                .shiftRight((3 - k) * 31)
                                .intValue();
                    } }else {{
                        __CLR4_1_10rdyrdyluszw1vn.R.inc(35528);POW5_INV_SPLIT[i][k] = inv
                                .shiftRight((3 - k) * 31)
                                .and(invMask)
                                .intValue();
                    }
                }}
            }}
        }}
    }}finally{__CLR4_1_10rdyrdyluszw1vn.R.flushNeeded();}}

    public static String toString(double value) {try{__CLR4_1_10rdyrdyluszw1vn.R.inc(35529);
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35530);char[] result = new char[24];
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35531);int len = toString(value, result, 0);
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35532);return new String(result, 0, len);
    }finally{__CLR4_1_10rdyrdyluszw1vn.R.flushNeeded();}}

    public static int toString(double value, char[] result, int off) {try{__CLR4_1_10rdyrdyluszw1vn.R.inc(35533);
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35534);final long DOUBLE_MANTISSA_MASK = 4503599627370495L; // (1L << 52) - 1;
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35535);final int DOUBLE_EXPONENT_MASK = 2047; // (1 << 11) - 1;
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35536);final int DOUBLE_EXPONENT_BIAS = 1023; // (1 << (11 - 1)) - 1;
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35537);final long LOG10_5_NUMERATOR = 6989700L; // (long) (10000000L * Math.log10(5));
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35538);final long LOG10_2_NUMERATOR = 3010299L; // (long) (10000000L * Math.log10(2));

        // Step 1: Decode the floating point number, and unify normalized and subnormal cases.
        // First, handle all the trivial cases.
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35539);int index = off;
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35540);if ((((Double.isNaN(value))&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35541)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35542)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35543);result[index++] = 'N';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35544);result[index++] = 'a';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35545);result[index++] = 'N';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35546);return index - off;
        }

        }__CLR4_1_10rdyrdyluszw1vn.R.inc(35547);if ((((value == Double.POSITIVE_INFINITY)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35548)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35549)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35550);result[index++] = 'I';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35551);result[index++] = 'n';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35552);result[index++] = 'f';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35553);result[index++] = 'i';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35554);result[index++] = 'n';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35555);result[index++] = 'i';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35556);result[index++] = 't';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35557);result[index++] = 'y';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35558);return index - off;
        }

        }__CLR4_1_10rdyrdyluszw1vn.R.inc(35559);if ((((value == Double.NEGATIVE_INFINITY)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35560)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35561)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35562);result[index++] = '-';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35563);result[index++] = 'I';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35564);result[index++] = 'n';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35565);result[index++] = 'f';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35566);result[index++] = 'i';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35567);result[index++] = 'n';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35568);result[index++] = 'i';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35569);result[index++] = 't';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35570);result[index++] = 'y';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35571);return index - off;
        }

        }__CLR4_1_10rdyrdyluszw1vn.R.inc(35572);long bits = Double.doubleToLongBits(value);
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35573);if ((((bits == 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35574)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35575)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35576);result[index++] = '0';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35577);result[index++] = '.';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35578);result[index++] = '0';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35579);return index - off;
        }
        }__CLR4_1_10rdyrdyluszw1vn.R.inc(35580);if ((((bits == 0x8000000000000000L)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35581)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35582)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35583);result[index++] = '-';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35584);result[index++] = '0';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35585);result[index++] = '.';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35586);result[index++] = '0';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35587);return index - off;
        }

        }__CLR4_1_10rdyrdyluszw1vn.R.inc(35588);final int DOUBLE_MANTISSA_BITS = 52;
        // Otherwise extract the mantissa and exponent bits and run the full algorithm.
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35589);int ieeeExponent = (int) ((bits >>> DOUBLE_MANTISSA_BITS) & DOUBLE_EXPONENT_MASK);
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35590);long ieeeMantissa = bits & DOUBLE_MANTISSA_MASK;
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35591);int e2;
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35592);long m2;
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35593);if ((((ieeeExponent == 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35594)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35595)==0&false))) {{
            // Denormal number - no implicit leading 1, and the exponent is 1, not 0.
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35596);e2 = 1 - DOUBLE_EXPONENT_BIAS - DOUBLE_MANTISSA_BITS;
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35597);m2 = ieeeMantissa;
        } }else {{
            // Add implicit leading 1.
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35598);e2 = ieeeExponent - DOUBLE_EXPONENT_BIAS - DOUBLE_MANTISSA_BITS;
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35599);m2 = ieeeMantissa | (1L << DOUBLE_MANTISSA_BITS);
        }

        }__CLR4_1_10rdyrdyluszw1vn.R.inc(35600);boolean sign = bits < 0;

        // Step 2: Determine the interval of legal decimal representations.
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35601);boolean even = (m2 & 1) == 0;
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35602);final long mv = 4 * m2;
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35603);final long mp = 4 * m2 + 2;
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35604);final int mmShift = (((((m2 != (1L << DOUBLE_MANTISSA_BITS)) || (ieeeExponent <= 1)) )&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35605)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35606)==0&false))? 1 : 0;
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35607);final long mm = 4 * m2 - 1 - mmShift;
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35608);e2 -= 2;

        // Step 3: Convert to a decimal power base using 128-bit arithmetic.
        // -1077 = 1 - 1023 - 53 - 2 <= e_2 - 2 <= 2046 - 1023 - 53 - 2 = 968
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35609);long dv, dp, dm;
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35610);final int e10;
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35611);boolean dmIsTrailingZeros = false, dvIsTrailingZeros = false;
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35612);if ((((e2 >= 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35613)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35614)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35615);final int q = Math.max(0, (int) (e2 * LOG10_2_NUMERATOR / 10000000L) - 1);
            // k = constant + floor(log_2(5^q))
            // q == 0 ? 1 : (int) ((q * 23219280L + 10000000L - 1) / 10000000L)
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35616);final int k = 122 + ((((q == 0 )&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35617)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35618)==0&false))? 1 : (int) ((q * 23219280L + 10000000L - 1) / 10000000L)) - 1;
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35619);final int i = -e2 + q + k;

            __CLR4_1_10rdyrdyluszw1vn.R.inc(35620);int actualShift = i - 3 * 31 - 21;
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35621);if ((((actualShift < 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35622)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35623)==0&false))) {{
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35624);throw new IllegalArgumentException("" + actualShift);
            }

            }__CLR4_1_10rdyrdyluszw1vn.R.inc(35625);final int[] ints = POW5_INV_SPLIT[q];
            {
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35626);long mHigh = mv >>> 31;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35627);long mLow = mv & 0x7fffffff;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35628);long bits13 = mHigh * ints[0];
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35629);long bits03 = mLow * ints[0];
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35630);long bits12 = mHigh * ints[1];
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35631);long bits02 = mLow * ints[1];
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35632);long bits11 = mHigh * ints[2];
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35633);long bits01 = mLow * ints[2];
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35634);long bits10 = mHigh * ints[3];
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35635);long bits00 = mLow * ints[3];


                __CLR4_1_10rdyrdyluszw1vn.R.inc(35636);dv = ((((((
                        ((bits00 >>> 31) + bits01 + bits10) >>> 31)
                        + bits02 + bits11) >>> 31)
                        + bits03 + bits12) >>> 21)
                        + (bits13 << 10)) >>> actualShift;
            }
            {
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35637);long mHigh = mp >>> 31;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35638);long mLow = mp & 0x7fffffff;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35639);long bits13 = mHigh * ints[0];
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35640);long bits03 = mLow * ints[0];
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35641);long bits12 = mHigh * ints[1];
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35642);long bits02 = mLow * ints[1];
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35643);long bits11 = mHigh * ints[2];
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35644);long bits01 = mLow * ints[2];
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35645);long bits10 = mHigh * ints[3];
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35646);long bits00 = mLow * ints[3];

                __CLR4_1_10rdyrdyluszw1vn.R.inc(35647);dp = ((((((
                        ((bits00 >>> 31) + bits01 + bits10) >>> 31)
                        + bits02 + bits11) >>> 31)
                        + bits03 + bits12) >>> 21)
                        + (bits13 << 10)) >>> actualShift;
            }
            {
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35648);long mHigh = mm >>> 31;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35649);long mLow = mm & 0x7fffffff;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35650);long bits13 = mHigh * ints[0];
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35651);long bits03 = mLow * ints[0];
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35652);long bits12 = mHigh * ints[1];
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35653);long bits02 = mLow * ints[1];
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35654);long bits11 = mHigh * ints[2];
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35655);long bits01 = mLow * ints[2];
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35656);long bits10 = mHigh * ints[3];
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35657);long bits00 = mLow * ints[3];

                __CLR4_1_10rdyrdyluszw1vn.R.inc(35658);dm = ((((((
                        ((bits00 >>> 31) + bits01 + bits10) >>> 31)
                        + bits02 + bits11) >>> 31)
                        + bits03 + bits12) >>> 21)
                        + (bits13 << 10)) >>> actualShift;
            }

            __CLR4_1_10rdyrdyluszw1vn.R.inc(35659);e10 = q;

            __CLR4_1_10rdyrdyluszw1vn.R.inc(35660);if ((((q <= 21)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35661)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35662)==0&false))) {{
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35663);if ((((mv % 5 == 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35664)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35665)==0&false))) {{
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(35666);int pow5Factor_mv;
                    {
                        __CLR4_1_10rdyrdyluszw1vn.R.inc(35667);long v = mv;
                        __CLR4_1_10rdyrdyluszw1vn.R.inc(35668);if (((((v % 5) != 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35669)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35670)==0&false))) {{
                            __CLR4_1_10rdyrdyluszw1vn.R.inc(35671);pow5Factor_mv = 0;
                        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35672);if (((((v % 25) != 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35673)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35674)==0&false))) {{
                            __CLR4_1_10rdyrdyluszw1vn.R.inc(35675);pow5Factor_mv = 1;
                        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35676);if (((((v % 125) != 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35677)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35678)==0&false))) {{
                            __CLR4_1_10rdyrdyluszw1vn.R.inc(35679);pow5Factor_mv = 2;
                        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35680);if (((((v % 625) != 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35681)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35682)==0&false))) {{
                            __CLR4_1_10rdyrdyluszw1vn.R.inc(35683);pow5Factor_mv = 3;
                        } }else {{
                            __CLR4_1_10rdyrdyluszw1vn.R.inc(35684);pow5Factor_mv = 4;
                            __CLR4_1_10rdyrdyluszw1vn.R.inc(35685);v /= 625;
                            __CLR4_1_10rdyrdyluszw1vn.R.inc(35686);while ((((v > 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35687)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35688)==0&false))) {{
                                __CLR4_1_10rdyrdyluszw1vn.R.inc(35689);if ((((v % 5 != 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35690)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35691)==0&false))) {{
                                    __CLR4_1_10rdyrdyluszw1vn.R.inc(35692);break;
                                }
                                }__CLR4_1_10rdyrdyluszw1vn.R.inc(35693);v /= 5;
                                __CLR4_1_10rdyrdyluszw1vn.R.inc(35694);pow5Factor_mv++;
                            }
                        }}
                    }}}}}
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(35695);dvIsTrailingZeros = pow5Factor_mv >= q;
                } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35696);if ((((even)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35697)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35698)==0&false))) {{
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(35699);int pow5Factor_mm;
                    {
                        __CLR4_1_10rdyrdyluszw1vn.R.inc(35700);long v = mm;
                        __CLR4_1_10rdyrdyluszw1vn.R.inc(35701);if (((((v % 5) != 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35702)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35703)==0&false))) {{
                            __CLR4_1_10rdyrdyluszw1vn.R.inc(35704);pow5Factor_mm = 0;
                        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35705);if (((((v % 25) != 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35706)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35707)==0&false))) {{
                            __CLR4_1_10rdyrdyluszw1vn.R.inc(35708);pow5Factor_mm = 1;
                        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35709);if (((((v % 125) != 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35710)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35711)==0&false))) {{
                            __CLR4_1_10rdyrdyluszw1vn.R.inc(35712);pow5Factor_mm = 2;
                        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35713);if (((((v % 625) != 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35714)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35715)==0&false))) {{
                            __CLR4_1_10rdyrdyluszw1vn.R.inc(35716);pow5Factor_mm = 3;
                        } }else {{
                            __CLR4_1_10rdyrdyluszw1vn.R.inc(35717);pow5Factor_mm = 4;
                            __CLR4_1_10rdyrdyluszw1vn.R.inc(35718);v /= 625;
                            __CLR4_1_10rdyrdyluszw1vn.R.inc(35719);while ((((v > 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35720)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35721)==0&false))) {{
                                __CLR4_1_10rdyrdyluszw1vn.R.inc(35722);if ((((v % 5 != 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35723)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35724)==0&false))) {{
                                    __CLR4_1_10rdyrdyluszw1vn.R.inc(35725);break;
                                }
                                }__CLR4_1_10rdyrdyluszw1vn.R.inc(35726);v /= 5;
                                __CLR4_1_10rdyrdyluszw1vn.R.inc(35727);pow5Factor_mm++;
                            }
                        }}
                    }}}}}

                    __CLR4_1_10rdyrdyluszw1vn.R.inc(35728);dmIsTrailingZeros = pow5Factor_mm >= q; //
                } }else {{
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(35729);int pow5Factor_mp;
                    {
                        __CLR4_1_10rdyrdyluszw1vn.R.inc(35730);long v = mp;
                        __CLR4_1_10rdyrdyluszw1vn.R.inc(35731);if (((((v % 5) != 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35732)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35733)==0&false))) {{
                            __CLR4_1_10rdyrdyluszw1vn.R.inc(35734);pow5Factor_mp = 0;
                        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35735);if (((((v % 25) != 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35736)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35737)==0&false))) {{
                            __CLR4_1_10rdyrdyluszw1vn.R.inc(35738);pow5Factor_mp = 1;
                        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35739);if (((((v % 125) != 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35740)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35741)==0&false))) {{
                            __CLR4_1_10rdyrdyluszw1vn.R.inc(35742);pow5Factor_mp = 2;
                        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35743);if (((((v % 625) != 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35744)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35745)==0&false))) {{
                            __CLR4_1_10rdyrdyluszw1vn.R.inc(35746);pow5Factor_mp = 3;
                        } }else {{
                            __CLR4_1_10rdyrdyluszw1vn.R.inc(35747);pow5Factor_mp = 4;
                            __CLR4_1_10rdyrdyluszw1vn.R.inc(35748);v /= 625;
                            __CLR4_1_10rdyrdyluszw1vn.R.inc(35749);while ((((v > 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35750)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35751)==0&false))) {{
                                __CLR4_1_10rdyrdyluszw1vn.R.inc(35752);if ((((v % 5 != 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35753)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35754)==0&false))) {{
                                    __CLR4_1_10rdyrdyluszw1vn.R.inc(35755);break;
                                }
                                }__CLR4_1_10rdyrdyluszw1vn.R.inc(35756);v /= 5;
                                __CLR4_1_10rdyrdyluszw1vn.R.inc(35757);pow5Factor_mp++;
                            }
                        }}
                    }}}}}

                    __CLR4_1_10rdyrdyluszw1vn.R.inc(35758);if ((((pow5Factor_mp >= q)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35759)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35760)==0&false))) {{
                        __CLR4_1_10rdyrdyluszw1vn.R.inc(35761);dp--;
                    }
                }}
            }}}
        }} }else {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35762);final int q = Math.max(0, (int) (-e2 * LOG10_5_NUMERATOR / 10000000L) - 1);
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35763);final int i = -e2 - q;
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35764);final int k = ((((i == 0 )&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35765)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35766)==0&false))? 1 : (int) ((i * 23219280L + 10000000L - 1) / 10000000L)) - 121;
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35767);final int j = q - k;

            __CLR4_1_10rdyrdyluszw1vn.R.inc(35768);int actualShift = j - 3 * 31 - 21;
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35769);if ((((actualShift < 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35770)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35771)==0&false))) {{
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35772);throw new IllegalArgumentException("" + actualShift);
            }
            }__CLR4_1_10rdyrdyluszw1vn.R.inc(35773);int[] ints = POW5_SPLIT[i];
            {
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35774);long mHigh = mv >>> 31;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35775);long mLow = mv & 0x7fffffff;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35776);long bits13 = mHigh * ints[0]; // 124
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35777);long bits03 = mLow * ints[0];  // 93
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35778);long bits12 = mHigh * ints[1]; // 93
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35779);long bits02 = mLow * ints[1];  // 62
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35780);long bits11 = mHigh * ints[2]; // 62
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35781);long bits01 = mLow * ints[2];  // 31
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35782);long bits10 = mHigh * ints[3]; // 31
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35783);long bits00 = mLow * ints[3];  // 0

                __CLR4_1_10rdyrdyluszw1vn.R.inc(35784);dv = ((((((
                        ((bits00 >>> 31) + bits01 + bits10) >>> 31)
                        + bits02 + bits11) >>> 31)
                        + bits03 + bits12) >>> 21)
                        + (bits13 << 10)) >>> actualShift;
            }
            {
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35785);long mHigh = mp >>> 31;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35786);long mLow = mp & 0x7fffffff;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35787);long bits13 = mHigh * ints[0]; // 124
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35788);long bits03 = mLow * ints[0];  // 93
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35789);long bits12 = mHigh * ints[1]; // 93
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35790);long bits02 = mLow * ints[1];  // 62
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35791);long bits11 = mHigh * ints[2]; // 62
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35792);long bits01 = mLow * ints[2];  // 31
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35793);long bits10 = mHigh * ints[3]; // 31
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35794);long bits00 = mLow * ints[3];  // 0
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35795);dp = ((((((
                        ((bits00 >>> 31) + bits01 + bits10) >>> 31)
                        + bits02 + bits11) >>> 31)
                        + bits03 + bits12) >>> 21)
                        + (bits13 << 10)) >>> actualShift;
            }
            {
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35796);long mHigh = mm >>> 31;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35797);long mLow = mm & 0x7fffffff;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35798);long bits13 = mHigh * ints[0]; // 124
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35799);long bits03 = mLow * ints[0];  // 93
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35800);long bits12 = mHigh * ints[1]; // 93
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35801);long bits02 = mLow * ints[1];  // 62
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35802);long bits11 = mHigh * ints[2]; // 62
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35803);long bits01 = mLow * ints[2];  // 31
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35804);long bits10 = mHigh * ints[3]; // 31
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35805);long bits00 = mLow * ints[3];  // 0
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35806);dm = ((((((
                        ((bits00 >>> 31) + bits01 + bits10) >>> 31)
                        + bits02 + bits11) >>> 31)
                        + bits03 + bits12) >>> 21)
                        + (bits13 << 10)) >>> actualShift;
            }

            __CLR4_1_10rdyrdyluszw1vn.R.inc(35807);e10 = q + e2;
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35808);if ((((q <= 1)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35809)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35810)==0&false))) {{
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35811);dvIsTrailingZeros = true;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35812);if ((((even)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35813)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35814)==0&false))) {{
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(35815);dmIsTrailingZeros = mmShift == 1;
                } }else {{
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(35816);dp--;
                }
            }} }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35817);if ((((q < 63)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35818)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35819)==0&false))) {{
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35820);dvIsTrailingZeros = (mv & ((1L << (q - 1)) - 1)) == 0;
            }
        }}}

        // Step 4: Find the shortest decimal representation in the interval of legal representations.
        //
        // We do some extra work here in order to follow Float/Double.toString semantics. In particular,
        // that requires printing in scientific format if and only if the exponent is between -3 and 7,
        // and it requires printing at least two decimal digits.
        //
        // Above, we moved the decimal dot all the way to the right, so now we need to count digits to
        // figure out the correct exponent for scientific notation.
        }__CLR4_1_10rdyrdyluszw1vn.R.inc(35821);final int vplength; //  = decimalLength(dp);
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35822);if ((((dp >=        1000000000000000000L)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35823)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35824)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35825);vplength= 19;
        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35826);if ((((dp >= 100000000000000000L)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35827)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35828)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35829);vplength=  18;
        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35830);if ((((dp >= 10000000000000000L)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35831)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35832)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35833);vplength = 17;
        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35834);if ((((dp >= 1000000000000000L)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35835)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35836)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35837);vplength = 16;
        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35838);if ((((dp >= 100000000000000L)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35839)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35840)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35841);vplength = 15;
        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35842);if ((((dp >= 10000000000000L)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35843)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35844)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35845);vplength = 14;
        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35846);if ((((dp >= 1000000000000L)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35847)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35848)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35849);vplength = 13;
        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35850);if ((((dp >= 100000000000L)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35851)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35852)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35853);vplength = 12;
        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35854);if ((((dp >= 10000000000L)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35855)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35856)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35857);vplength = 11;
        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35858);if ((((dp >= 1000000000L)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35859)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35860)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35861);vplength = 10;
        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35862);if ((((dp >= 100000000L)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35863)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35864)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35865);vplength = 9;
        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35866);if ((((dp >= 10000000L)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35867)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35868)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35869);vplength = 8;
        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35870);if ((((dp >= 1000000L)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35871)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35872)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35873);vplength = 7;
        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35874);if ((((dp >= 100000L)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35875)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35876)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35877);vplength = 6;
        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35878);if ((((dp >= 10000L)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35879)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35880)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35881);vplength = 5;
        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35882);if ((((dp >= 1000L)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35883)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35884)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35885);vplength = 4;
        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35886);if ((((dp >= 100L)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35887)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35888)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35889);vplength = 3;
        } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35890);if ((((dp >= 10L)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35891)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35892)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35893);vplength = 2;
        } }else {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35894);vplength = 1;
        }

        }}}}}}}}}}}}}}}}}}__CLR4_1_10rdyrdyluszw1vn.R.inc(35895);int exp = e10 + vplength - 1;

        // Double.toString semantics requires using scientific notation if and only if outside this range.
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35896);boolean scientificNotation = !((exp >= -3) && (exp < 7));

        __CLR4_1_10rdyrdyluszw1vn.R.inc(35897);int removed = 0;

        __CLR4_1_10rdyrdyluszw1vn.R.inc(35898);int lastRemovedDigit = 0;
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35899);long output;
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35900);if ((((dmIsTrailingZeros || dvIsTrailingZeros)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35901)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35902)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35903);while ((((dp / 10 > dm / 10)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35904)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35905)==0&false))) {{
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35906);if (((((dp < 100) && scientificNotation)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35907)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35908)==0&false))) {{
                    // Double.toString semantics requires printing at least two digits.
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(35909);break;
                }
                }__CLR4_1_10rdyrdyluszw1vn.R.inc(35910);dmIsTrailingZeros &= dm % 10 == 0;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35911);dvIsTrailingZeros &= lastRemovedDigit == 0;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35912);lastRemovedDigit = (int) (dv % 10);
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35913);dp /= 10;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35914);dv /= 10;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35915);dm /= 10;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35916);removed++;
            }
            }__CLR4_1_10rdyrdyluszw1vn.R.inc(35917);if ((((dmIsTrailingZeros && even)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35918)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35919)==0&false))) {{
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35920);while ((((dm % 10 == 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35921)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35922)==0&false))) {{
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(35923);if (((((dp < 100) && scientificNotation)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35924)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35925)==0&false))) {{
                        // Double.toString semantics requires printing at least two digits.
                        __CLR4_1_10rdyrdyluszw1vn.R.inc(35926);break;
                    }
                    }__CLR4_1_10rdyrdyluszw1vn.R.inc(35927);dvIsTrailingZeros &= lastRemovedDigit == 0;
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(35928);lastRemovedDigit = (int) (dv % 10);
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(35929);dp /= 10;
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(35930);dv /= 10;
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(35931);dm /= 10;
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(35932);removed++;
                }
            }}
            }__CLR4_1_10rdyrdyluszw1vn.R.inc(35933);if ((((dvIsTrailingZeros && (lastRemovedDigit == 5) && (dv % 2 == 0))&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35934)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35935)==0&false))) {{
                // Round even if the exact numbers is .....50..0.
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35936);lastRemovedDigit = 4;
            }
            }__CLR4_1_10rdyrdyluszw1vn.R.inc(35937);output = dv +
                    (((((dv == dm && !(dmIsTrailingZeros && even)) || (lastRemovedDigit >= 5) )&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35938)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35939)==0&false))? 1 : 0);
        } }else {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35940);while ((((dp / 10 > dm / 10)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35941)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35942)==0&false))) {{
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35943);if (((((dp < 100) && scientificNotation)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35944)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35945)==0&false))) {{
                    // Double.toString semantics requires printing at least two digits.
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(35946);break;
                }
                }__CLR4_1_10rdyrdyluszw1vn.R.inc(35947);lastRemovedDigit = (int) (dv % 10);
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35948);dp /= 10;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35949);dv /= 10;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35950);dm /= 10;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35951);removed++;
            }
            }__CLR4_1_10rdyrdyluszw1vn.R.inc(35952);output = dv + (((((dv == dm || (lastRemovedDigit >= 5)) )&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35953)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35954)==0&false))? 1 : 0);
        }
        }__CLR4_1_10rdyrdyluszw1vn.R.inc(35955);int olength = vplength - removed;

        // Step 5: Print the decimal representation.
        // We follow Double.toString semantics here.
        __CLR4_1_10rdyrdyluszw1vn.R.inc(35956);if ((((sign)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35957)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35958)==0&false))) {{
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35959);result[index++] = '-';
        }

        // Values in the interval [1E-3, 1E7) are special.
        }__CLR4_1_10rdyrdyluszw1vn.R.inc(35960);if ((((scientificNotation)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35961)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35962)==0&false))) {{
            // Print in the format x.xxxxxE-yy.
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35963);for (int i = 0; (((i < olength - 1)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35964)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35965)==0&false)); i++) {{
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35966);int c = (int) (output % 10);
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35967);output /= 10;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35968);result[index + olength - i] = (char) ('0' + c);
            }
            }__CLR4_1_10rdyrdyluszw1vn.R.inc(35969);result[index] = (char) ('0' + output % 10);
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35970);result[index + 1] = '.';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35971);index += olength + 1;
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35972);if ((((olength == 1)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35973)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35974)==0&false))) {{
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35975);result[index++] = '0';
            }

            // Print 'E', the exponent sign, and the exponent, which has at most three digits.
            }__CLR4_1_10rdyrdyluszw1vn.R.inc(35976);result[index++] = 'E';
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35977);if ((((exp < 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35978)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35979)==0&false))) {{
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35980);result[index++] = '-';
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35981);exp = -exp;
            }
            }__CLR4_1_10rdyrdyluszw1vn.R.inc(35982);if ((((exp >= 100)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35983)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35984)==0&false))) {{
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35985);result[index++] = (char) ('0' + exp / 100);
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35986);exp %= 100;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35987);result[index++] = (char) ('0' + exp / 10);
            } }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(35988);if ((((exp >= 10)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35989)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35990)==0&false))) {{
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35991);result[index++] = (char) ('0' + exp / 10);
            }
            }}__CLR4_1_10rdyrdyluszw1vn.R.inc(35992);result[index++] = (char) ('0' + exp % 10);
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35993);return index - off;
        } }else {{
            // Otherwise follow the Java spec for values in the interval [1E-3, 1E7).
            __CLR4_1_10rdyrdyluszw1vn.R.inc(35994);if ((((exp < 0)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(35995)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(35996)==0&false))) {{
                // Decimal dot is before any of the digits.
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35997);result[index++] = '0';
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35998);result[index++] = '.';
                __CLR4_1_10rdyrdyluszw1vn.R.inc(35999);for (int i = -1; (((i > exp)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(36000)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(36001)==0&false)); i--) {{
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(36002);result[index++] = '0';
                }
                }__CLR4_1_10rdyrdyluszw1vn.R.inc(36003);int current = index;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(36004);for (int i = 0; (((i < olength)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(36005)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(36006)==0&false)); i++) {{
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(36007);result[current + olength - i - 1] = (char) ('0' + output % 10);
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(36008);output /= 10;
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(36009);index++;
                }
            }} }else {__CLR4_1_10rdyrdyluszw1vn.R.inc(36010);if ((((exp + 1 >= olength)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(36011)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(36012)==0&false))) {{
                // Decimal dot is after any of the digits.
                __CLR4_1_10rdyrdyluszw1vn.R.inc(36013);for (int i = 0; (((i < olength)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(36014)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(36015)==0&false)); i++) {{
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(36016);result[index + olength - i - 1] = (char) ('0' + output % 10);
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(36017);output /= 10;
                }
                }__CLR4_1_10rdyrdyluszw1vn.R.inc(36018);index += olength;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(36019);for (int i = olength; (((i < exp + 1)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(36020)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(36021)==0&false)); i++) {{
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(36022);result[index++] = '0';
                }
                }__CLR4_1_10rdyrdyluszw1vn.R.inc(36023);result[index++] = '.';
                __CLR4_1_10rdyrdyluszw1vn.R.inc(36024);result[index++] = '0';
            } }else {{
                // Decimal dot is somewhere between the digits.
                __CLR4_1_10rdyrdyluszw1vn.R.inc(36025);int current = index + 1;
                __CLR4_1_10rdyrdyluszw1vn.R.inc(36026);for (int i = 0; (((i < olength)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(36027)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(36028)==0&false)); i++) {{
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(36029);if ((((olength - i - 1 == exp)&&(__CLR4_1_10rdyrdyluszw1vn.R.iget(36030)!=0|true))||(__CLR4_1_10rdyrdyluszw1vn.R.iget(36031)==0&false))) {{
                        __CLR4_1_10rdyrdyluszw1vn.R.inc(36032);result[current + olength - i - 1] = '.';
                        __CLR4_1_10rdyrdyluszw1vn.R.inc(36033);current--;
                    }
                    }__CLR4_1_10rdyrdyluszw1vn.R.inc(36034);result[current + olength - i - 1] = (char) ('0' + output % 10);
                    __CLR4_1_10rdyrdyluszw1vn.R.inc(36035);output /= 10;
                }
                }__CLR4_1_10rdyrdyluszw1vn.R.inc(36036);index += olength + 1;
            }
            }}__CLR4_1_10rdyrdyluszw1vn.R.inc(36037);return index - off;
        }
    }}finally{__CLR4_1_10rdyrdyluszw1vn.R.flushNeeded();}}

}
