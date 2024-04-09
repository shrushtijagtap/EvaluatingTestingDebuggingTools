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

/**
 * An implementation of Ryu for float.
 */
public final class RyuFloat {public static class __CLR4_1_10rt2rt2lusqjqme{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,36337,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final int[][] POW5_SPLIT = {
            {536870912, 0},
            {671088640, 0},
            {838860800, 0},
            {1048576000, 0},
            {655360000, 0},
            {819200000, 0},
            {1024000000, 0},
            {640000000, 0},
            {800000000, 0},
            {1000000000, 0},
            {625000000, 0},
            {781250000, 0},
            {976562500, 0},
            {610351562, 1073741824},
            {762939453, 268435456},
            {953674316, 872415232},
            {596046447, 1619001344},
            {745058059, 1486880768},
            {931322574, 1321730048},
            {582076609, 289210368},
            {727595761, 898383872},
            {909494701, 1659850752},
            {568434188, 1305842176},
            {710542735, 1632302720},
            {888178419, 1503507488},
            {555111512, 671256724},
            {693889390, 839070905},
            {867361737, 2122580455},
            {542101086, 521306416},
            {677626357, 1725374844},
            {847032947, 546105819},
            {1058791184, 145761362},
            {661744490, 91100851},
            {827180612, 1187617888},
            {1033975765, 1484522360},
            {646234853, 1196261931},
            {807793566, 2032198326},
            {1009741958, 1466506084},
            {631088724, 379695390},
            {788860905, 474619238},
            {986076131, 1130144959},
            {616297582, 437905143},
            {770371977, 1621123253},
            {962964972, 415791331},
            {601853107, 1333611405},
            {752316384, 1130143345},
            {940395480, 1412679181},
    };

    private static final int[][] POW5_INV_SPLIT = {
            {268435456, 1},
            {214748364, 1717986919},
            {171798691, 1803886265},
            {137438953, 1013612282},
            {219902325, 1192282922},
            {175921860, 953826338},
            {140737488, 763061070},
            {225179981, 791400982},
            {180143985, 203624056},
            {144115188, 162899245},
            {230584300, 1978625710},
            {184467440, 1582900568},
            {147573952, 1266320455},
            {236118324, 308125809},
            {188894659, 675997377},
            {151115727, 970294631},
            {241785163, 1981968139},
            {193428131, 297084323},
            {154742504, 1955654377},
            {247588007, 1840556814},
            {198070406, 613451992},
            {158456325, 61264864},
            {253530120, 98023782},
            {202824096, 78419026},
            {162259276, 1780722139},
            {259614842, 1990161963},
            {207691874, 733136111},
            {166153499, 1016005619},
            {265845599, 337118801},
            {212676479, 699191770},
            {170141183, 988850146},
    };

    public static String toString(float value) {try{__CLR4_1_10rt2rt2lusqjqme.R.inc(36038);
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36039);char[] result = new char[15];
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36040);int len = toString(value, result, 0);
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36041);return new String(result, 0, len);
    }finally{__CLR4_1_10rt2rt2lusqjqme.R.flushNeeded();}}

    public static int toString(float value, char[] result, int off) {try{__CLR4_1_10rt2rt2lusqjqme.R.inc(36042);
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36043);final int FLOAT_MANTISSA_MASK = 8388607; // (1 << 23) - 1;
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36044);final int FLOAT_EXPONENT_MASK = 255; // (1 << 8) - 1;
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36045);final int FLOAT_EXPONENT_BIAS = 127; // (1 << (8 - 1)) - 1;
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36046);final long LOG10_2_NUMERATOR = 3010299; // (long) (10000000L * Math.log10(2));
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36047);final long LOG10_5_DENOMINATOR = 10000000L;
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36048);final long LOG10_5_NUMERATOR = 6989700L; // (long) (LOG10_5_DENOMINATOR * Math.log10(5));


        // Step 1: Decode the floating point number, and unify normalized and subnormal cases.
        // First, handle all the trivial cases.
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36049);int index = off;
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36050);if ((((Float.isNaN(value))&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36051)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36052)==0&false))) {{
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36053);result[index++] = 'N';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36054);result[index++] = 'a';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36055);result[index++] = 'N';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36056);return index - off;
        }

        }__CLR4_1_10rt2rt2lusqjqme.R.inc(36057);if ((((value == Float.POSITIVE_INFINITY)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36058)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36059)==0&false))) {{
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36060);result[index++] = 'I';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36061);result[index++] = 'n';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36062);result[index++] = 'f';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36063);result[index++] = 'i';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36064);result[index++] = 'n';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36065);result[index++] = 'i';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36066);result[index++] = 't';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36067);result[index++] = 'y';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36068);return index - off;
        }

        }__CLR4_1_10rt2rt2lusqjqme.R.inc(36069);if ((((value == Float.NEGATIVE_INFINITY)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36070)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36071)==0&false))) {{
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36072);result[index++] = '-';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36073);result[index++] = 'I';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36074);result[index++] = 'n';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36075);result[index++] = 'f';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36076);result[index++] = 'i';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36077);result[index++] = 'n';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36078);result[index++] = 'i';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36079);result[index++] = 't';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36080);result[index++] = 'y';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36081);return index - off;
        }

        }__CLR4_1_10rt2rt2lusqjqme.R.inc(36082);int bits = Float.floatToIntBits(value);
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36083);if ((((bits == 0)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36084)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36085)==0&false))) {{
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36086);result[index++] = '0';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36087);result[index++] = '.';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36088);result[index++] = '0';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36089);return index - off;
        }
        }__CLR4_1_10rt2rt2lusqjqme.R.inc(36090);if ((((bits == 0x80000000)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36091)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36092)==0&false))) {{
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36093);result[index++] = '-';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36094);result[index++] = '0';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36095);result[index++] = '.';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36096);result[index++] = '0';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36097);return index - off;
        }

        // Otherwise extract the mantissa and exponent bits and run the full algorithm.
        }__CLR4_1_10rt2rt2lusqjqme.R.inc(36098);int ieeeExponent = (bits >> 23) & FLOAT_EXPONENT_MASK;
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36099);int ieeeMantissa = bits & FLOAT_MANTISSA_MASK;
        // By default, the correct mantissa starts with a 1, except for denormal numbers.
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36100);int e2;
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36101);int m2;
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36102);if ((((ieeeExponent == 0)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36103)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36104)==0&false))) {{
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36105);e2 = 1 - FLOAT_EXPONENT_BIAS - 23;
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36106);m2 = ieeeMantissa;
        } }else {{
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36107);e2 = ieeeExponent - FLOAT_EXPONENT_BIAS - 23;
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36108);m2 = ieeeMantissa | (1 << 23);
        }

        }__CLR4_1_10rt2rt2lusqjqme.R.inc(36109);boolean sign = bits < 0;

        // Step 2: Determine the interval of legal decimal representations.
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36110);boolean even = (m2 & 1) == 0;
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36111);int mv = 4 * m2;
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36112);int mp = 4 * m2 + 2;
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36113);int mm = 4 * m2 - (((((m2 != (1L << 23)) || (ieeeExponent <= 1) )&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36114)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36115)==0&false))? 2 : 1);
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36116);e2 -= 2;

        // Step 3: Convert to a decimal power base using 128-bit arithmetic.
        // -151 = 1 - 127 - 23 - 2 <= e_2 - 2 <= 254 - 127 - 23 - 2 = 102
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36117);int dp, dv, dm;
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36118);int e10;
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36119);boolean dpIsTrailingZeros, dvIsTrailingZeros, dmIsTrailingZeros;
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36120);int lastRemovedDigit = 0;
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36121);if ((((e2 >= 0)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36122)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36123)==0&false))) {{
            // Compute m * 2^e_2 / 10^q = m * 2^(e_2 - q) / 5^q
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36124);int q = (int) (e2 * LOG10_2_NUMERATOR / 10000000L);
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36125);int k = 59 + ((((q == 0 )&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36126)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36127)==0&false))? 1 : (int) ((q * 23219280L + 10000000L - 1) / 10000000L)) - 1;
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36128);int i = -e2 + q + k;
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36129);long pis0 = (long) POW5_INV_SPLIT[q][0];
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36130);long pis1 = (long) POW5_INV_SPLIT[q][1];
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36131);dv = (int) ((mv * pis0 + ((mv * pis1) >> 31)) >> (i - 31));
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36132);dp = (int) ((mp * pis0 + ((mp * pis1) >> 31)) >> (i - 31));
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36133);dm = (int) ((mm * pis0 + ((mm * pis1) >> 31)) >> (i - 31));
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36134);if ((((q != 0 && ((dp - 1) / 10 <= dm / 10))&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36135)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36136)==0&false))) {{
                // We need to know one removed digit even if we are not going to loop below. We could use
                // q = X - 1 above, except that would require 33 bits for the result, and we've found that
                // 32-bit arithmetic is faster even on 64-bit machines.
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36137);int e = q - 1;
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36138);int l = 59 + ((((e == 0 )&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36139)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36140)==0&false))? 1 : (int) ((e * 23219280L + 10000000L - 1) / 10000000L)) - 1;
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36141);int qx = q - 1, ii = -e2 + q - 1 + l;
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36142);long mulPow5InvDivPow2 =  (mv * (long) POW5_INV_SPLIT[qx][0] + ((mv * (long) POW5_INV_SPLIT[qx][1]) >> 31)) >> (ii - 31);
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36143);lastRemovedDigit = (int) (mulPow5InvDivPow2 % 10);
            }
            }__CLR4_1_10rt2rt2lusqjqme.R.inc(36144);e10 = q;

            __CLR4_1_10rt2rt2lusqjqme.R.inc(36145);int pow5Factor_mp = 0;
            {
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36146);int v = mp;
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36147);while ((((v > 0)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36148)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36149)==0&false))) {{
                    __CLR4_1_10rt2rt2lusqjqme.R.inc(36150);if ((((v % 5 != 0)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36151)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36152)==0&false))) {{
                        __CLR4_1_10rt2rt2lusqjqme.R.inc(36153);break;
                    }
                    }__CLR4_1_10rt2rt2lusqjqme.R.inc(36154);v /= 5;
                    __CLR4_1_10rt2rt2lusqjqme.R.inc(36155);pow5Factor_mp++;
                }
            }}

            __CLR4_1_10rt2rt2lusqjqme.R.inc(36156);int pow5Factor_mv = 0;
            {
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36157);int v = mv;
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36158);while ((((v > 0)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36159)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36160)==0&false))) {{
                    __CLR4_1_10rt2rt2lusqjqme.R.inc(36161);if ((((v % 5 != 0)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36162)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36163)==0&false))) {{
                        __CLR4_1_10rt2rt2lusqjqme.R.inc(36164);break;
                    }
                    }__CLR4_1_10rt2rt2lusqjqme.R.inc(36165);v /= 5;
                    __CLR4_1_10rt2rt2lusqjqme.R.inc(36166);pow5Factor_mv++;
                }
            }}

            __CLR4_1_10rt2rt2lusqjqme.R.inc(36167);int pow5Factor_mm = 0;
            {
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36168);int v = mm;
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36169);while ((((v > 0)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36170)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36171)==0&false))) {{
                    __CLR4_1_10rt2rt2lusqjqme.R.inc(36172);if ((((v % 5 != 0)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36173)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36174)==0&false))) {{
                        __CLR4_1_10rt2rt2lusqjqme.R.inc(36175);break;
                    }
                    }__CLR4_1_10rt2rt2lusqjqme.R.inc(36176);v /= 5;
                    __CLR4_1_10rt2rt2lusqjqme.R.inc(36177);pow5Factor_mm++;
                }
            }}

            __CLR4_1_10rt2rt2lusqjqme.R.inc(36178);dpIsTrailingZeros = pow5Factor_mp >= q;
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36179);dvIsTrailingZeros = pow5Factor_mv >= q;
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36180);dmIsTrailingZeros = pow5Factor_mm >= q;
        } }else {{
            // Compute m * 5^(-e_2) / 10^q = m * 5^(-e_2 - q) / 2^q
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36181);int q = (int) (-e2 * LOG10_5_NUMERATOR / LOG10_5_DENOMINATOR);
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36182);int i = -e2 - q;
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36183);int k = ((((i == 0 )&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36184)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36185)==0&false))? 1 : (int) ((i * 23219280L + 10000000L - 1) / 10000000L)) - 61;
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36186);int j = q - k;

            __CLR4_1_10rt2rt2lusqjqme.R.inc(36187);long ps0 = POW5_SPLIT[i][0];
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36188);long ps1 = POW5_SPLIT[i][1];
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36189);int j31 = j - 31;
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36190);dv = (int) ((mv * ps0 + ((mv * ps1) >> 31)) >> j31);
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36191);dp = (int) ((mp * ps0 + ((mp * ps1) >> 31)) >> j31);
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36192);dm = (int) ((mm * ps0 + ((mm * ps1) >> 31)) >> j31);

            __CLR4_1_10rt2rt2lusqjqme.R.inc(36193);if ((((q != 0 && ((dp - 1) / 10 <= dm / 10))&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36194)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36195)==0&false))) {{
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36196);int e = i + 1;
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36197);j = q - 1 - (((((e == 0 )&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36198)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36199)==0&false))? 1 : (int) ((e * 23219280L + 10000000L - 1) / 10000000L)) - 61);
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36200);int ix = i + 1;
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36201);long mulPow5divPow2 = (mv * (long) POW5_SPLIT[ix][0] + ((mv * (long) POW5_SPLIT[ix][1]) >> 31)) >> (j - 31);
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36202);lastRemovedDigit = (int) (mulPow5divPow2 % 10);
            }
            }__CLR4_1_10rt2rt2lusqjqme.R.inc(36203);e10 = q + e2; // Note: e2 and e10 are both negative here.

            __CLR4_1_10rt2rt2lusqjqme.R.inc(36204);dpIsTrailingZeros = 1 >= q;
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36205);dvIsTrailingZeros = (q < 23) && (mv & ((1 << (q - 1)) - 1)) == 0;
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36206);dmIsTrailingZeros = ((((mm % 2 == 1 )&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36207)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36208)==0&false))? 0 : 1) >= q;
        }

        // Step 4: Find the shortest decimal representation in the interval of legal representations.
        //
        // We do some extra work here in order to follow Float/Double.toString semantics. In particular,
        // that requires printing in scientific format if and only if the exponent is between -3 and 7,
        // and it requires printing at least two decimal digits.
        //
        // Above, we moved the decimal dot all the way to the right, so now we need to count digits to
        // figure out the correct exponent for scientific notation.

        }__CLR4_1_10rt2rt2lusqjqme.R.inc(36209);int dplength = 10;
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36210);int factor = 1000000000;
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36211);for (; (((dplength > 0)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36212)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36213)==0&false)); dplength--) {{
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36214);if ((((dp >= factor)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36215)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36216)==0&false))) {{
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36217);break;
            }
            }__CLR4_1_10rt2rt2lusqjqme.R.inc(36218);factor /= 10;
        }
        }__CLR4_1_10rt2rt2lusqjqme.R.inc(36219);int exp = e10 + dplength - 1;

        // Float.toString semantics requires using scientific notation if and only if outside this range.
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36220);boolean scientificNotation = !((exp >= -3) && (exp < 7));

        __CLR4_1_10rt2rt2lusqjqme.R.inc(36221);int removed = 0;
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36222);if ((((dpIsTrailingZeros && !even)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36223)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36224)==0&false))) {{
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36225);dp--;
        }

        }__CLR4_1_10rt2rt2lusqjqme.R.inc(36226);while ((((dp / 10 > dm / 10)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36227)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36228)==0&false))) {{
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36229);if (((((dp < 100) && scientificNotation)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36230)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36231)==0&false))) {{
                // We print at least two digits, so we might as well stop now.
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36232);break;
            }
            }__CLR4_1_10rt2rt2lusqjqme.R.inc(36233);dmIsTrailingZeros &= dm % 10 == 0;
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36234);dp /= 10;
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36235);lastRemovedDigit = dv % 10;
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36236);dv /= 10;
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36237);dm /= 10;
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36238);removed++;
        }
        }__CLR4_1_10rt2rt2lusqjqme.R.inc(36239);if ((((dmIsTrailingZeros && even)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36240)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36241)==0&false))) {{
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36242);while ((((dm % 10 == 0)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36243)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36244)==0&false))) {{
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36245);if (((((dp < 100) && scientificNotation)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36246)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36247)==0&false))) {{
                    // We print at least two digits, so we might as well stop now.
                    __CLR4_1_10rt2rt2lusqjqme.R.inc(36248);break;
                }
                }__CLR4_1_10rt2rt2lusqjqme.R.inc(36249);dp /= 10;
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36250);lastRemovedDigit = dv % 10;
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36251);dv /= 10;
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36252);dm /= 10;
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36253);removed++;
            }
        }}

        }__CLR4_1_10rt2rt2lusqjqme.R.inc(36254);if ((((dvIsTrailingZeros && (lastRemovedDigit == 5) && (dv % 2 == 0))&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36255)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36256)==0&false))) {{
            // Round down not up if the number ends in X50000 and the number is even.
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36257);lastRemovedDigit = 4;
        }
        }__CLR4_1_10rt2rt2lusqjqme.R.inc(36258);int output = dv +
                (((((dv == dm && !(dmIsTrailingZeros && even)) || (lastRemovedDigit >= 5) )&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36259)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36260)==0&false))? 1 : 0);
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36261);int olength = dplength - removed;

        // Step 5: Print the decimal representation.
        // We follow Float.toString semantics here.
        __CLR4_1_10rt2rt2lusqjqme.R.inc(36262);if ((((sign)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36263)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36264)==0&false))) {{
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36265);result[index++] = '-';
        }

        }__CLR4_1_10rt2rt2lusqjqme.R.inc(36266);if ((((scientificNotation)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36267)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36268)==0&false))) {{
            // Print in the format x.xxxxxE-yy.
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36269);for (int i = 0; (((i < olength - 1)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36270)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36271)==0&false)); i++) {{
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36272);int c = output % 10;
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36273);output /= 10;
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36274);result[index + olength - i] = (char) ('0' + c);
            }
            }__CLR4_1_10rt2rt2lusqjqme.R.inc(36275);result[index] = (char) ('0' + output % 10);
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36276);result[index + 1] = '.';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36277);index += olength + 1;
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36278);if ((((olength == 1)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36279)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36280)==0&false))) {{
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36281);result[index++] = '0';
            }

            // Print 'E', the exponent sign, and the exponent, which has at most two digits.
            }__CLR4_1_10rt2rt2lusqjqme.R.inc(36282);result[index++] = 'E';
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36283);if ((((exp < 0)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36284)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36285)==0&false))) {{
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36286);result[index++] = '-';
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36287);exp = -exp;
            }
            }__CLR4_1_10rt2rt2lusqjqme.R.inc(36288);if ((((exp >= 10)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36289)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36290)==0&false))) {{
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36291);result[index++] = (char) ('0' + exp / 10);
            }
            }__CLR4_1_10rt2rt2lusqjqme.R.inc(36292);result[index++] = (char) ('0' + exp % 10);
        } }else {{
            // Otherwise follow the Java spec for values in the interval [1E-3, 1E7).
            __CLR4_1_10rt2rt2lusqjqme.R.inc(36293);if ((((exp < 0)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36294)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36295)==0&false))) {{
                // Decimal dot is before any of the digits.
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36296);result[index++] = '0';
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36297);result[index++] = '.';
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36298);for (int i = -1; (((i > exp)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36299)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36300)==0&false)); i--) {{
                    __CLR4_1_10rt2rt2lusqjqme.R.inc(36301);result[index++] = '0';
                }
                }__CLR4_1_10rt2rt2lusqjqme.R.inc(36302);int current = index;
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36303);for (int i = 0; (((i < olength)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36304)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36305)==0&false)); i++) {{
                    __CLR4_1_10rt2rt2lusqjqme.R.inc(36306);result[current + olength - i - 1] = (char) ('0' + output % 10);
                    __CLR4_1_10rt2rt2lusqjqme.R.inc(36307);output /= 10;
                    __CLR4_1_10rt2rt2lusqjqme.R.inc(36308);index++;
                }
            }} }else {__CLR4_1_10rt2rt2lusqjqme.R.inc(36309);if ((((exp + 1 >= olength)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36310)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36311)==0&false))) {{
                // Decimal dot is after any of the digits.
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36312);for (int i = 0; (((i < olength)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36313)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36314)==0&false)); i++) {{
                    __CLR4_1_10rt2rt2lusqjqme.R.inc(36315);result[index + olength - i - 1] = (char) ('0' + output % 10);
                    __CLR4_1_10rt2rt2lusqjqme.R.inc(36316);output /= 10;
                }
                }__CLR4_1_10rt2rt2lusqjqme.R.inc(36317);index += olength;
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36318);for (int i = olength; (((i < exp + 1)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36319)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36320)==0&false)); i++) {{
                    __CLR4_1_10rt2rt2lusqjqme.R.inc(36321);result[index++] = '0';
                }
                }__CLR4_1_10rt2rt2lusqjqme.R.inc(36322);result[index++] = '.';
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36323);result[index++] = '0';
            } }else {{
                // Decimal dot is somewhere between the digits.
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36324);int current = index + 1;
                __CLR4_1_10rt2rt2lusqjqme.R.inc(36325);for (int i = 0; (((i < olength)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36326)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36327)==0&false)); i++) {{
                    __CLR4_1_10rt2rt2lusqjqme.R.inc(36328);if ((((olength - i - 1 == exp)&&(__CLR4_1_10rt2rt2lusqjqme.R.iget(36329)!=0|true))||(__CLR4_1_10rt2rt2lusqjqme.R.iget(36330)==0&false))) {{
                        __CLR4_1_10rt2rt2lusqjqme.R.inc(36331);result[current + olength - i - 1] = '.';
                        __CLR4_1_10rt2rt2lusqjqme.R.inc(36332);current--;
                    }
                    }__CLR4_1_10rt2rt2lusqjqme.R.inc(36333);result[current + olength - i - 1] = (char) ('0' + output % 10);
                    __CLR4_1_10rt2rt2lusqjqme.R.inc(36334);output /= 10;
                }
                }__CLR4_1_10rt2rt2lusqjqme.R.inc(36335);index += olength + 1;
            }
        }}}
        }__CLR4_1_10rt2rt2lusqjqme.R.inc(36336);return index - off;
    }finally{__CLR4_1_10rt2rt2lusqjqme.R.flushNeeded();}}

}
