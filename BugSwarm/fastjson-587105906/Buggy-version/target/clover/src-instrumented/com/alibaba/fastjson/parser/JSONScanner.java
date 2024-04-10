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
package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.util.ASMUtils;
import com.alibaba.fastjson.util.IOUtils;

import java.math.BigDecimal;
import java.util.*;

//\u8fd9\u4e2a\u7c7b\uff0c\u4e3a\u4e86\u6027\u80fd\u4f18\u5316\u505a\u4e86\u5f88\u591a\u7279\u522b\u5904\u7406\uff0c\u4e00\u5207\u90fd\u662f\u4e3a\u4e86\u6027\u80fd\uff01\uff01\uff01

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public final class JSONScanner extends JSONLexerBase {public static class __CLR4_1_10a8va8vluszvw9w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,16195,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final String text;
    private final int    len;

    public JSONScanner(String input){
        this(input, JSON.DEFAULT_PARSER_FEATURE);__CLR4_1_10a8va8vluszvw9w.R.inc(13280);try{__CLR4_1_10a8va8vluszvw9w.R.inc(13279);
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public JSONScanner(String input, int features){
        super(features);__CLR4_1_10a8va8vluszvw9w.R.inc(13282);try{__CLR4_1_10a8va8vluszvw9w.R.inc(13281);

        __CLR4_1_10a8va8vluszvw9w.R.inc(13283);text = input;
        __CLR4_1_10a8va8vluszvw9w.R.inc(13284);len = text.length();
        __CLR4_1_10a8va8vluszvw9w.R.inc(13285);bp = -1;

        __CLR4_1_10a8va8vluszvw9w.R.inc(13286);next();
        __CLR4_1_10a8va8vluszvw9w.R.inc(13287);if ((((ch == 65279)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13288)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13289)==0&false))) {{ // utf-8 bom
            __CLR4_1_10a8va8vluszvw9w.R.inc(13290);next();
        }
    }}finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public final char charAt(int index) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(13291);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13292);if ((((index >= len)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13293)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13294)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13295);return EOI;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(13296);return text.charAt(index);
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public final char next() {try{__CLR4_1_10a8va8vluszvw9w.R.inc(13297);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13298);int index = ++bp;
        __CLR4_1_10a8va8vluszvw9w.R.inc(13299);return ch = ((((index >= this.len )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13300)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13301)==0&false))? //
                EOI //
                : text.charAt(index));
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public JSONScanner(char[] input, int inputLength){
        this(input, inputLength, JSON.DEFAULT_PARSER_FEATURE);__CLR4_1_10a8va8vluszvw9w.R.inc(13303);try{__CLR4_1_10a8va8vluszvw9w.R.inc(13302);
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public JSONScanner(char[] input, int inputLength, int features){
        this(new String(input, 0, inputLength), features);__CLR4_1_10a8va8vluszvw9w.R.inc(13305);try{__CLR4_1_10a8va8vluszvw9w.R.inc(13304);
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    protected final void copyTo(int offset, int count, char[] dest) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(13306);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13307);text.getChars(offset, offset + count, dest, 0);
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    static boolean charArrayCompare(String src, int offset, char[] dest) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(13308);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13309);final int destLen = dest.length;
        __CLR4_1_10a8va8vluszvw9w.R.inc(13310);if ((((destLen + offset > src.length())&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13311)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13312)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13313);return false;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(13314);for (int i = 0; (((i < destLen)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13315)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13316)==0&false)); ++i) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13317);if ((((dest[i] != src.charAt(offset + i))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13318)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13319)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13320);return false;
            }
        }}

        }__CLR4_1_10a8va8vluszvw9w.R.inc(13321);return true;
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public final boolean charArrayCompare(char[] chars) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(13322);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13323);return charArrayCompare(text, bp, chars);
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public final int indexOf(char ch, int startIndex) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(13324);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13325);return text.indexOf(ch, startIndex);
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public final String addSymbol(int offset, int len, int hash, final SymbolTable symbolTable) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(13326);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13327);return symbolTable.addSymbol(text, offset, len, hash);
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public byte[] bytesValue() {try{__CLR4_1_10a8va8vluszvw9w.R.inc(13328);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13329);if ((((token == JSONToken.HEX)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13330)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13331)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13332);int start = np + 1, len = sp;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13333);if ((((len % 2 != 0)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13334)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13335)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13336);throw new JSONException("illegal state. " + len);
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(13337);byte[] bytes = new byte[len / 2];
            __CLR4_1_10a8va8vluszvw9w.R.inc(13338);for (int i = 0; (((i < bytes.length)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13339)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13340)==0&false)); ++i) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13341);char c0 = text.charAt(start + i * 2);
                __CLR4_1_10a8va8vluszvw9w.R.inc(13342);char c1 = text.charAt(start + i * 2 + 1);

                __CLR4_1_10a8va8vluszvw9w.R.inc(13343);int b0 = c0 - ((((c0 <= 57 )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13344)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13345)==0&false))? 48 : 55);
                __CLR4_1_10a8va8vluszvw9w.R.inc(13346);int b1 = c1 - ((((c1 <= 57 )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13347)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13348)==0&false))? 48 : 55);
                __CLR4_1_10a8va8vluszvw9w.R.inc(13349);bytes[i] = (byte) ((b0 << 4) | b1);
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(13350);return bytes;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(13351);if ((((!hasSpecial)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13352)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13353)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13354);return IOUtils.decodeBase64(text, np + 1, sp);
        } }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13355);String escapedText = new String(sbuf, 0, sp);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13356);return IOUtils.decodeBase64(escapedText);
        }
    }}finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    /**
     * The value of a literal token, recorded as a string. For integers, leading 0x and 'l' suffixes are suppressed.
     */
    public final String stringVal() {try{__CLR4_1_10a8va8vluszvw9w.R.inc(13357);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13358);if ((((!hasSpecial)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13359)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13360)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13361);return this.subString(np + 1, sp);
        } }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13362);return new String(sbuf, 0, sp);
        }
    }}finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public final String subString(int offset, int count) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(13363);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13364);if ((((ASMUtils.IS_ANDROID)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13365)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13366)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13367);if ((((count < sbuf.length)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13368)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13369)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13370);text.getChars(offset, offset + count, sbuf, 0);
                __CLR4_1_10a8va8vluszvw9w.R.inc(13371);return new String(sbuf, 0, count);
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13372);char[] chars = new char[count];
                __CLR4_1_10a8va8vluszvw9w.R.inc(13373);text.getChars(offset, offset + count, chars, 0);
                __CLR4_1_10a8va8vluszvw9w.R.inc(13374);return new String(chars);
            }
        }} }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13375);return text.substring(offset, offset + count);
        }
    }}finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public final char[] sub_chars(int offset, int count) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(13376);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13377);if ((((ASMUtils.IS_ANDROID && count < sbuf.length)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13378)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13379)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13380);text.getChars(offset, offset + count, sbuf, 0);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13381);return sbuf;
        } }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13382);char[] chars = new char[count];
            __CLR4_1_10a8va8vluszvw9w.R.inc(13383);text.getChars(offset, offset + count, chars, 0);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13384);return chars;
        }
    }}finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public final String numberString() {try{__CLR4_1_10a8va8vluszvw9w.R.inc(13385);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13386);char chLocal = charAt(np + sp - 1);

        __CLR4_1_10a8va8vluszvw9w.R.inc(13387);int sp = this.sp;
        __CLR4_1_10a8va8vluszvw9w.R.inc(13388);if ((((chLocal == 'L' || chLocal == 'S' || chLocal == 'B' || chLocal == 'F' || chLocal == 'D')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13389)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13390)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13391);sp--;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(13392);return this.subString(np, sp);
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public final BigDecimal decimalValue() {try{__CLR4_1_10a8va8vluszvw9w.R.inc(13393);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13394);char chLocal = charAt(np + sp - 1);

        __CLR4_1_10a8va8vluszvw9w.R.inc(13395);int sp = this.sp;
        __CLR4_1_10a8va8vluszvw9w.R.inc(13396);if ((((chLocal == 'L' || chLocal == 'S' || chLocal == 'B' || chLocal == 'F' || chLocal == 'D')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13397)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13398)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13399);sp--;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(13400);int offset = np, count = sp;
        __CLR4_1_10a8va8vluszvw9w.R.inc(13401);if ((((count < sbuf.length)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13402)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13403)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13404);text.getChars(offset, offset + count, sbuf, 0);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13405);return new BigDecimal(sbuf, 0, count);
        } }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13406);char[] chars = new char[count];
            __CLR4_1_10a8va8vluszvw9w.R.inc(13407);text.getChars(offset, offset + count, chars, 0);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13408);return new BigDecimal(chars);
        }
    }}finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public boolean scanISO8601DateIfMatch() {try{__CLR4_1_10a8va8vluszvw9w.R.inc(13409);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13410);return scanISO8601DateIfMatch(true);
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public boolean scanISO8601DateIfMatch(boolean strict) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(13411);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13412);int rest = len - bp;
        __CLR4_1_10a8va8vluszvw9w.R.inc(13413);return scanISO8601DateIfMatch(strict, rest);
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    private boolean scanISO8601DateIfMatch(boolean strict, int rest) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(13414);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13415);if ((((rest < 8)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13416)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13417)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13418);return false;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(13419);char c0 = charAt(bp);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13420);char c1 = charAt(bp + 1);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13421);char c2 = charAt(bp + 2);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13422);char c3 = charAt(bp + 3);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13423);char c4 = charAt(bp + 4);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13424);char c5 = charAt(bp + 5);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13425);char c6 = charAt(bp + 6);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13426);char c7 = charAt(bp + 7);

        __CLR4_1_10a8va8vluszvw9w.R.inc(13427);if (((((!strict) && rest > 13)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13428)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13429)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13430);char c_r0 = charAt(bp + rest - 1);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13431);char c_r1 = charAt(bp + rest - 2);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13432);if ((((c0 == '/' && c1 == 'D' && c2 == 'a' && c3 == 't' && c4 == 'e' && c5 == '(' && c_r0 == '/'
                    && c_r1 == ')')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13433)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13434)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13435);int plusIndex = -1;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13436);for (int i = 6; (((i < rest)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13437)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13438)==0&false)); ++i) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13439);char c = charAt(bp + i);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13440);if ((((c == '+')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13441)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13442)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(13443);plusIndex = i;
                    } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(13444);if ((((c < '0' || c > '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13445)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13446)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(13447);break;
                    }
                }}}
                }__CLR4_1_10a8va8vluszvw9w.R.inc(13448);if ((((plusIndex == -1)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13449)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13450)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13451);return false;
                }
                }__CLR4_1_10a8va8vluszvw9w.R.inc(13452);int offset = bp + 6;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13453);String numberText = this.subString(offset, bp + plusIndex - offset);
                __CLR4_1_10a8va8vluszvw9w.R.inc(13454);long millis = Long.parseLong(numberText);

                __CLR4_1_10a8va8vluszvw9w.R.inc(13455);calendar = Calendar.getInstance(timeZone, locale);
                __CLR4_1_10a8va8vluszvw9w.R.inc(13456);calendar.setTimeInMillis(millis);

                __CLR4_1_10a8va8vluszvw9w.R.inc(13457);token = JSONToken.LITERAL_ISO8601_DATE;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13458);return true;
            }
        }}

        }__CLR4_1_10a8va8vluszvw9w.R.inc(13459);char c10;
        __CLR4_1_10a8va8vluszvw9w.R.inc(13460);if (rest == 8
                || rest == 14
                || (rest == 16 && ((c10 = charAt(bp + 10)) == 'T' || c10 == ' '))
                || (rest == 17 && charAt(bp + 6) != '-')) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13463);if ((((strict)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13464)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13465)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13466);return false;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(13467);char y0, y1, y2, y3, M0, M1, d0, d1;



            __CLR4_1_10a8va8vluszvw9w.R.inc(13468);char c8 = charAt(bp + 8);

            __CLR4_1_10a8va8vluszvw9w.R.inc(13469);final boolean c_47 = c4 == '-' && c7 == '-';
            __CLR4_1_10a8va8vluszvw9w.R.inc(13470);final boolean sperate16 = c_47 && rest == 16;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13471);final boolean sperate17 = c_47 && rest == 17;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13472);if ((((sperate17 || sperate16)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13473)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13474)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13475);y0 = c0;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13476);y1 = c1;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13477);y2 = c2;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13478);y3 = c3;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13479);M0 = c5;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13480);M1 = c6;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13481);d0 = c8;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13482);d1 = charAt(bp + 9);
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(13483);if ((((c4 == '-' && c6 == '-')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13484)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13485)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13486);y0 = c0;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13487);y1 = c1;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13488);y2 = c2;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13489);y3 = c3;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13490);M0 = '0';
                __CLR4_1_10a8va8vluszvw9w.R.inc(13491);M1 = c5;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13492);d0 = '0';
                __CLR4_1_10a8va8vluszvw9w.R.inc(13493);d1 = c7;
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13494);y0 = c0;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13495);y1 = c1;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13496);y2 = c2;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13497);y3 = c3;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13498);M0 = c4;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13499);M1 = c5;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13500);d0 = c6;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13501);d1 = c7;
            }


            }}__CLR4_1_10a8va8vluszvw9w.R.inc(13502);if ((((!checkDate(y0, y1, y2, y3, M0, M1, d0, d1))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13503)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13504)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13505);return false;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(13506);setCalendar(y0, y1, y2, y3, M0, M1, d0, d1);

            __CLR4_1_10a8va8vluszvw9w.R.inc(13507);int hour, minute, seconds, millis;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13508);if ((((rest != 8)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13509)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13510)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13511);char c9 = charAt(bp + 9);
                __CLR4_1_10a8va8vluszvw9w.R.inc(13512);c10 = charAt(bp + 10);
                __CLR4_1_10a8va8vluszvw9w.R.inc(13513);char c11 = charAt(bp + 11);
                __CLR4_1_10a8va8vluszvw9w.R.inc(13514);char c12 = charAt(bp + 12);
                __CLR4_1_10a8va8vluszvw9w.R.inc(13515);char c13 = charAt(bp + 13);

                __CLR4_1_10a8va8vluszvw9w.R.inc(13516);char h0, h1, m0, m1, s0, s1;

                __CLR4_1_10a8va8vluszvw9w.R.inc(13517);if (((((sperate17 && c10 == 'T' && c13 == ':' && charAt(bp + 16) == 'Z')
                        || (sperate16 && (c10 == ' ' || c10 == 'T') && c13 == ':'))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13518)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13519)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13520);h0 = c11;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13521);h1 = c12;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13522);m0 = charAt(bp + 14);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13523);m1 = charAt(bp + 15);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13524);s0 = '0';
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13525);s1 = '0';
                } }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13526);h0 = c8;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13527);h1 = c9;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13528);m0 = c10;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13529);m1 = c11;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13530);s0 = c12;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13531);s1 = c13;
                }

                }__CLR4_1_10a8va8vluszvw9w.R.inc(13532);if ((((!checkTime(h0, h1, m0, m1, s0, s1))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13533)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13534)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13535);return false;
                }

                }__CLR4_1_10a8va8vluszvw9w.R.inc(13536);if ((((rest == 17 && !sperate17)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13537)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13538)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13539);char S0 = charAt(bp + 14);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13540);char S1 = charAt(bp + 15);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13541);char S2 = charAt(bp + 16);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13542);if ((((S0 < '0' || S0 > '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13543)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13544)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(13545);return false;
                    }
                    }__CLR4_1_10a8va8vluszvw9w.R.inc(13546);if ((((S1 < '0' || S1 > '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13547)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13548)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(13549);return false;
                    }
                    }__CLR4_1_10a8va8vluszvw9w.R.inc(13550);if ((((S2 < '0' || S2 > '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13551)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13552)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(13553);return false;
                    }

                    }__CLR4_1_10a8va8vluszvw9w.R.inc(13554);millis = (S0 - '0') * 100 + (S1 - '0') * 10 + (S2 - '0');
                } }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13555);millis = 0;
                }

                }__CLR4_1_10a8va8vluszvw9w.R.inc(13556);hour = (h0 - '0') * 10 + (h1 - '0');
                __CLR4_1_10a8va8vluszvw9w.R.inc(13557);minute = (m0 - '0') * 10 + (m1 - '0');
                __CLR4_1_10a8va8vluszvw9w.R.inc(13558);seconds = (s0 - '0') * 10 + (s1 - '0');
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13559);hour = 0;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13560);minute = 0;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13561);seconds = 0;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13562);millis = 0;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(13563);calendar.set(Calendar.HOUR_OF_DAY, hour);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13564);calendar.set(Calendar.MINUTE, minute);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13565);calendar.set(Calendar.SECOND, seconds);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13566);calendar.set(Calendar.MILLISECOND, millis);

            __CLR4_1_10a8va8vluszvw9w.R.inc(13567);token = JSONToken.LITERAL_ISO8601_DATE;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13568);return true;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(13569);if ((((rest < 9)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13570)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13571)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13572);return false;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(13573);char c8 = charAt(bp + 8);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13574);char c9 = charAt(bp + 9);

        __CLR4_1_10a8va8vluszvw9w.R.inc(13575);int date_len = 10;
        __CLR4_1_10a8va8vluszvw9w.R.inc(13576);char y0, y1, y2, y3, M0, M1, d0, d1;
        __CLR4_1_10a8va8vluszvw9w.R.inc(13577);if (((((c4 == '-' && c7 == '-') // cn
                ||  (c4 == '/' && c7 == '/') // tw yyyy/mm/dd
        )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13578)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13579)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13580);y0 = c0;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13581);y1 = c1;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13582);y2 = c2;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13583);y3 = c3;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13584);M0 = c5;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13585);M1 = c6;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13586);d0 = c8;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13587);d1 = c9;
        } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(13588);if (((((c4 == '-' && c6 == '-') // cn yyyy-m-dd
        )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13589)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13590)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13591);y0 = c0;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13592);y1 = c1;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13593);y2 = c2;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13594);y3 = c3;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13595);M0 = '0';
            __CLR4_1_10a8va8vluszvw9w.R.inc(13596);M1 = c5;

            __CLR4_1_10a8va8vluszvw9w.R.inc(13597);if ((((c8 == ' ')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13598)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13599)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13600);d0 = '0';
                __CLR4_1_10a8va8vluszvw9w.R.inc(13601);d1 = c7;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13602);date_len = 8;
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13603);d0 = c7;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13604);d1 = c8;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13605);date_len = 9;
            }
        }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(13606);if (((((c2 == '.' && c5 == '.') // de dd.mm.yyyy
                || (c2 == '-' && c5 == '-') // in dd-mm-yyyy
        )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13607)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13608)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13609);d0 = c0;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13610);d1 = c1;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13611);M0 = c3;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13612);M1 = c4;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13613);y0 = c6;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13614);y1 = c7;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13615);y2 = c8;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13616);y3 = c9;
        } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(13617);if ((((c8 == 'T')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13618)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13619)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13620);y0 = c0;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13621);y1 = c1;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13622);y2 = c2;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13623);y3 = c3;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13624);M0 = c4;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13625);M1 = c5;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13626);d0 = c6;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13627);d1 = c7;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13628);date_len = 8;
        } }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13629);if ((((c4 == '\u5e74' || c4 == '\ub144')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13630)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13631)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13632);y0 = c0;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13633);y1 = c1;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13634);y2 = c2;
                __CLR4_1_10a8va8vluszvw9w.R.inc(13635);y3 = c3;

                __CLR4_1_10a8va8vluszvw9w.R.inc(13636);if ((((c7 == '\u6708' || c7 == '\uc6d4')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13637)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13638)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13639);M0 = c5;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13640);M1 = c6;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13641);if ((((c9 == '\u65e5' || c9 == '\uc77c')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13642)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13643)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(13644);d0 = '0';
                        __CLR4_1_10a8va8vluszvw9w.R.inc(13645);d1 = c8;
                    } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(13646);if ((((charAt(bp + 10) == '\u65e5' || charAt(bp + 10) == '\uc77c')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13647)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13648)==0&false))){{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(13649);d0 = c8;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(13650);d1 = c9;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(13651);date_len = 11;
                    } }else {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(13652);return false;
                    }
                }}} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(13653);if ((((c6 == '\u6708' || c6 == '\uc6d4')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13654)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13655)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13656);M0 = '0';
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13657);M1 = c5;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13658);if ((((c8 == '\u65e5' || c8 == '\uc77c')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13659)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13660)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(13661);d0 = '0';
                        __CLR4_1_10a8va8vluszvw9w.R.inc(13662);d1 = c7;
                    } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(13663);if ((((c9 == '\u65e5' || c9 == '\uc77c')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13664)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13665)==0&false))){{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(13666);d0 = c7;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(13667);d1 = c8;
                    } }else {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(13668);return false;
                    }
                }}} }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13669);return false;
                }
            }}} }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13670);return false;
            }
        }}

        }}}}__CLR4_1_10a8va8vluszvw9w.R.inc(13671);if ((((!checkDate(y0, y1, y2, y3, M0, M1, d0, d1))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13672)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13673)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13674);return false;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(13675);setCalendar(y0, y1, y2, y3, M0, M1, d0, d1);

        __CLR4_1_10a8va8vluszvw9w.R.inc(13676);char t = charAt(bp + date_len);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13677);if ((((t == 'T' && rest == 16 && date_len == 8 && charAt(bp + 15) == 'Z')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13678)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13679)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13680);char h0 = charAt(bp + date_len + 1);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13681);char h1 = charAt(bp + date_len + 2);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13682);char m0 = charAt(bp + date_len + 3);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13683);char m1 = charAt(bp + date_len + 4);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13684);char s0 = charAt(bp + date_len + 5);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13685);char s1 = charAt(bp + date_len + 6);

            __CLR4_1_10a8va8vluszvw9w.R.inc(13686);if ((((!checkTime(h0, h1, m0, m1, s0, s1))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13687)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13688)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13689);return false;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(13690);setTime(h0, h1, m0, m1, s0, s1);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13691);calendar.set(Calendar.MILLISECOND, 0);

            __CLR4_1_10a8va8vluszvw9w.R.inc(13692);if ((((calendar.getTimeZone().getRawOffset() != 0)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13693)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13694)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13695);String[] timeZoneIDs = TimeZone.getAvailableIDs(0);
                __CLR4_1_10a8va8vluszvw9w.R.inc(13696);if ((((timeZoneIDs.length > 0)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13697)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13698)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13699);TimeZone timeZone = TimeZone.getTimeZone(timeZoneIDs[0]);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13700);calendar.setTimeZone(timeZone);
                }
            }}

            }__CLR4_1_10a8va8vluszvw9w.R.inc(13701);token = JSONToken.LITERAL_ISO8601_DATE;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13702);return true;
        } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(13703);if ((((t == 'T' || (t == ' ' && !strict))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13704)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13705)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13706);if ((((rest < date_len + 9)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13707)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13708)==0&false))) {{ // "0000-00-00T00:00:00".length()
                __CLR4_1_10a8va8vluszvw9w.R.inc(13709);return false;
            }
        }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(13710);if ((((t == '"' || t == EOI || t == '\u65e5' || t == '\uc77c')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13711)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13712)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13713);calendar.set(Calendar.HOUR_OF_DAY, 0);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13714);calendar.set(Calendar.MINUTE, 0);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13715);calendar.set(Calendar.SECOND, 0);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13716);calendar.set(Calendar.MILLISECOND, 0);

            __CLR4_1_10a8va8vluszvw9w.R.inc(13717);ch = charAt(bp += date_len);

            __CLR4_1_10a8va8vluszvw9w.R.inc(13718);token = JSONToken.LITERAL_ISO8601_DATE;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13719);return true;
        } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(13720);if ((((t == '+' || t == '-')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13721)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13722)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13723);if ((((len == date_len + 6)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13724)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13725)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13726);if ((((charAt(bp + date_len + 3) != ':' //
                        || charAt(bp + date_len + 4) != '0' //
                        || charAt(bp + date_len + 5) != '0')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13727)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13728)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13729);return false;
                }

                }__CLR4_1_10a8va8vluszvw9w.R.inc(13730);setTime('0', '0', '0', '0', '0', '0');
                __CLR4_1_10a8va8vluszvw9w.R.inc(13731);calendar.set(Calendar.MILLISECOND, 0);
                __CLR4_1_10a8va8vluszvw9w.R.inc(13732);setTimeZone(t, charAt(bp + date_len + 1), charAt(bp + date_len + 2));
                __CLR4_1_10a8va8vluszvw9w.R.inc(13733);return true;
            }
            }__CLR4_1_10a8va8vluszvw9w.R.inc(13734);return false;
        } }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13735);return false;
        }

        }}}}__CLR4_1_10a8va8vluszvw9w.R.inc(13736);if ((((charAt(bp + date_len + 3) != ':')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13737)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13738)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13739);return false;
        }
        }__CLR4_1_10a8va8vluszvw9w.R.inc(13740);if ((((charAt(bp + date_len + 6) != ':')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13741)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13742)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13743);return false;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(13744);char h0 = charAt(bp + date_len + 1);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13745);char h1 = charAt(bp + date_len + 2);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13746);char m0 = charAt(bp + date_len + 4);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13747);char m1 = charAt(bp + date_len + 5);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13748);char s0 = charAt(bp + date_len + 7);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13749);char s1 = charAt(bp + date_len + 8);

        __CLR4_1_10a8va8vluszvw9w.R.inc(13750);if ((((!checkTime(h0, h1, m0, m1, s0, s1))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13751)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13752)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13753);return false;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(13754);setTime(h0, h1, m0, m1, s0, s1);

        __CLR4_1_10a8va8vluszvw9w.R.inc(13755);char dot = charAt(bp + date_len + 9);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13756);int millisLen = -1; // \u6709\u53ef\u80fd\u6ca1\u6709\u6beb\u79d2\u533a\u57df\uff0c\u6ca1\u6709\u6beb\u79d2\u533a\u57df\u7684\u65f6\u5019\u4e0b\u4e00\u4e2a\u5b57\u7b26\u4f4d\u7f6e\u6709\u53ef\u80fd\u662f'Z'\u3001'+'\u3001'-'
        __CLR4_1_10a8va8vluszvw9w.R.inc(13757);int millis = 0;
        __CLR4_1_10a8va8vluszvw9w.R.inc(13758);if ((((dot == '.')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13759)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13760)==0&false))) {{ // 0000-00-00T00:00:00.000
            __CLR4_1_10a8va8vluszvw9w.R.inc(13761);if ((((rest < date_len + 11)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13762)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13763)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13764);return false;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(13765);char S0 = charAt(bp + date_len + 10);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13766);if ((((S0 < '0' || S0 > '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13767)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13768)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13769);return false;
            }
            }__CLR4_1_10a8va8vluszvw9w.R.inc(13770);millis = S0 - '0';
            __CLR4_1_10a8va8vluszvw9w.R.inc(13771);millisLen = 1;

            __CLR4_1_10a8va8vluszvw9w.R.inc(13772);if ((((rest > date_len + 11)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13773)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13774)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13775);char S1 = charAt(bp + date_len + 11);
                __CLR4_1_10a8va8vluszvw9w.R.inc(13776);if ((((S1 >= '0' && S1 <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13777)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13778)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13779);millis = millis * 10 + (S1 - '0');
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13780);millisLen = 2;
                }
            }}

            }__CLR4_1_10a8va8vluszvw9w.R.inc(13781);if ((((millisLen == 2)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13782)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13783)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13784);char S2 = charAt(bp + date_len + 12);
                __CLR4_1_10a8va8vluszvw9w.R.inc(13785);if ((((S2 >= '0' && S2 <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13786)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13787)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13788);millis = millis * 10 + (S2 - '0');
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13789);millisLen = 3;
                }
            }}
        }}
        }__CLR4_1_10a8va8vluszvw9w.R.inc(13790);calendar.set(Calendar.MILLISECOND, millis);

        __CLR4_1_10a8va8vluszvw9w.R.inc(13791);int timzeZoneLength = 0;
        __CLR4_1_10a8va8vluszvw9w.R.inc(13792);char timeZoneFlag = charAt(bp + date_len + 10 + millisLen);

        __CLR4_1_10a8va8vluszvw9w.R.inc(13793);if ((((timeZoneFlag == ' ')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13794)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13795)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13796);millisLen++;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13797);timeZoneFlag = charAt(bp + date_len + 10 + millisLen);
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(13798);if ((((timeZoneFlag == '+' || timeZoneFlag == '-')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13799)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13800)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13801);char t0 = charAt(bp + date_len + 10 + millisLen + 1);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13802);if ((((t0 < '0' || t0 > '1')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13803)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13804)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13805);return false;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(13806);char t1 = charAt(bp + date_len + 10 + millisLen + 2);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13807);if ((((t1 < '0' || t1 > '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13808)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13809)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13810);return false;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(13811);char t2 = charAt(bp + date_len + 10 + millisLen + 3);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13812);char t3 = '0', t4 = '0';
            __CLR4_1_10a8va8vluszvw9w.R.inc(13813);if ((((t2 == ':')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13814)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13815)==0&false))) {{ // ThreeLetterISO8601TimeZone
                __CLR4_1_10a8va8vluszvw9w.R.inc(13816);t3 = charAt(bp + date_len + 10 + millisLen + 4);
                __CLR4_1_10a8va8vluszvw9w.R.inc(13817);if ((((t3 != '0' && t3 != '3')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13818)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13819)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13820);return false;
                }

                }__CLR4_1_10a8va8vluszvw9w.R.inc(13821);t4 = charAt(bp + date_len + 10 + millisLen + 5);
                __CLR4_1_10a8va8vluszvw9w.R.inc(13822);if ((((t4 != '0')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13823)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13824)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13825);return false;
                }
                }__CLR4_1_10a8va8vluszvw9w.R.inc(13826);timzeZoneLength = 6;
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(13827);if ((((t2 == '0')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13828)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13829)==0&false))) {{ // TwoLetterISO8601TimeZone
                __CLR4_1_10a8va8vluszvw9w.R.inc(13830);t3 = charAt(bp + date_len + 10 + millisLen + 4);
                __CLR4_1_10a8va8vluszvw9w.R.inc(13831);if ((((t3 != '0' && t3 != '3')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13832)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13833)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13834);return false;
                }
                }__CLR4_1_10a8va8vluszvw9w.R.inc(13835);timzeZoneLength = 5;
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(13836);if ((((t2 == '3' && charAt(bp + date_len + 10 + millisLen + 4) == '0')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13837)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13838)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13839);t3 = '3';
                __CLR4_1_10a8va8vluszvw9w.R.inc(13840);t4 = '0';
                __CLR4_1_10a8va8vluszvw9w.R.inc(13841);timzeZoneLength = 5;
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(13842);if ((((t2 == '4' && charAt(bp + date_len + 10 + millisLen + 4) == '5')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13843)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13844)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13845);t3 = '4';
                __CLR4_1_10a8va8vluszvw9w.R.inc(13846);t4 = '5';
                __CLR4_1_10a8va8vluszvw9w.R.inc(13847);timzeZoneLength = 5;
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13848);timzeZoneLength = 3;
            }

            }}}}__CLR4_1_10a8va8vluszvw9w.R.inc(13849);setTimeZone(timeZoneFlag, t0, t1, t3, t4);

        } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(13850);if ((((timeZoneFlag == 'Z')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13851)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13852)==0&false))) {{// UTC
            __CLR4_1_10a8va8vluszvw9w.R.inc(13853);timzeZoneLength = 1;
            __CLR4_1_10a8va8vluszvw9w.R.inc(13854);if ((((calendar.getTimeZone().getRawOffset() != 0)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13855)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13856)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13857);String[] timeZoneIDs = TimeZone.getAvailableIDs(0);
                __CLR4_1_10a8va8vluszvw9w.R.inc(13858);if ((((timeZoneIDs.length > 0)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13859)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13860)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13861);TimeZone timeZone = TimeZone.getTimeZone(timeZoneIDs[0]);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(13862);calendar.setTimeZone(timeZone);
                }
            }}
        }}

        }}__CLR4_1_10a8va8vluszvw9w.R.inc(13863);char end = charAt(bp + (date_len + 10 + millisLen + timzeZoneLength));
        __CLR4_1_10a8va8vluszvw9w.R.inc(13864);if ((((end != EOI && end != '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13865)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13866)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13867);return false;
        }
        }__CLR4_1_10a8va8vluszvw9w.R.inc(13868);ch = charAt(bp += (date_len + 10 + millisLen + timzeZoneLength));

        __CLR4_1_10a8va8vluszvw9w.R.inc(13869);token = JSONToken.LITERAL_ISO8601_DATE;
        __CLR4_1_10a8va8vluszvw9w.R.inc(13870);return true;
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    protected void setTime(char h0, char h1, char m0, char m1, char s0, char s1) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(13871);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13872);int hour = (h0 - '0') * 10 + (h1 - '0');
        __CLR4_1_10a8va8vluszvw9w.R.inc(13873);int minute = (m0 - '0') * 10 + (m1 - '0');
        __CLR4_1_10a8va8vluszvw9w.R.inc(13874);int seconds = (s0 - '0') * 10 + (s1 - '0');
        __CLR4_1_10a8va8vluszvw9w.R.inc(13875);calendar.set(Calendar.HOUR_OF_DAY, hour);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13876);calendar.set(Calendar.MINUTE, minute);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13877);calendar.set(Calendar.SECOND, seconds);
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    protected void setTimeZone(char timeZoneFlag, char t0, char t1) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(13878);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13879);setTimeZone(timeZoneFlag, t0, t1, '0', '0');
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    protected void setTimeZone(char timeZoneFlag, char t0, char t1, char t3, char t4) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(13880);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13881);int timeZoneOffset = ((t0 - '0') * 10 + (t1 - '0')) * 3600 * 1000;

        __CLR4_1_10a8va8vluszvw9w.R.inc(13882);timeZoneOffset += ((t3 - '0') * 10 + (t4 - '0')) * 60 * 1000;

        __CLR4_1_10a8va8vluszvw9w.R.inc(13883);if ((((timeZoneFlag == '-')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13884)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13885)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13886);timeZoneOffset = -timeZoneOffset;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(13887);if ((((calendar.getTimeZone().getRawOffset() != timeZoneOffset)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13888)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13889)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13890);String[] timeZoneIDs = TimeZone.getAvailableIDs(timeZoneOffset);
            __CLR4_1_10a8va8vluszvw9w.R.inc(13891);if ((((timeZoneIDs.length > 0)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13892)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13893)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13894);TimeZone timeZone = TimeZone.getTimeZone(timeZoneIDs[0]);
                __CLR4_1_10a8va8vluszvw9w.R.inc(13895);calendar.setTimeZone(timeZone);
            }
        }}
    }}finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    private boolean checkTime(char h0, char h1, char m0, char m1, char s0, char s1) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(13896);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13897);if ((((h0 == '0')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13898)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13899)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13900);if ((((h1 < '0' || h1 > '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13901)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13902)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13903);return false;
            }
        }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(13904);if ((((h0 == '1')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13905)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13906)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13907);if ((((h1 < '0' || h1 > '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13908)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13909)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13910);return false;
            }
        }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(13911);if ((((h0 == '2')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13912)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13913)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13914);if ((((h1 < '0' || h1 > '4')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13915)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13916)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13917);return false;
            }
        }} }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13918);return false;
        }

        }}}__CLR4_1_10a8va8vluszvw9w.R.inc(13919);if ((((m0 >= '0' && m0 <= '5')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13920)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13921)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13922);if ((((m1 < '0' || m1 > '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13923)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13924)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13925);return false;
            }
        }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(13926);if ((((m0 == '6')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13927)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13928)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13929);if ((((m1 != '0')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13930)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13931)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13932);return false;
            }
        }} }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13933);return false;
        }

        }}__CLR4_1_10a8va8vluszvw9w.R.inc(13934);if ((((s0 >= '0' && s0 <= '5')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13935)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13936)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13937);if ((((s1 < '0' || s1 > '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13938)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13939)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13940);return false;
            }
        }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(13941);if ((((s0 == '6')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13942)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13943)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13944);if ((((s1 != '0')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13945)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13946)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13947);return false;
            }
        }} }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13948);return false;
        }

        }}__CLR4_1_10a8va8vluszvw9w.R.inc(13949);return true;
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    private void setCalendar(char y0, char y1, char y2, char y3, char M0, char M1, char d0, char d1) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(13950);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13951);calendar = Calendar.getInstance(timeZone, locale);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13952);int year = (y0 - '0') * 1000 + (y1 - '0') * 100 + (y2 - '0') * 10 + (y3 - '0');
        __CLR4_1_10a8va8vluszvw9w.R.inc(13953);int month = (M0 - '0') * 10 + (M1 - '0') - 1;
        __CLR4_1_10a8va8vluszvw9w.R.inc(13954);int day = (d0 - '0') * 10 + (d1 - '0');
//        calendar.set(year, month, day);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13955);calendar.set(Calendar.YEAR, year);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13956);calendar.set(Calendar.MONTH, month);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13957);calendar.set(Calendar.DAY_OF_MONTH, day);
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    static boolean checkDate(char y0, char y1, char y2, char y3, char M0, char M1, int d0, int d1) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(13958);
        __CLR4_1_10a8va8vluszvw9w.R.inc(13959);if ((((y0 < '0' || y0 > '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13960)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13961)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13962);return false;
        }
        }__CLR4_1_10a8va8vluszvw9w.R.inc(13963);if ((((y1 < '0' || y1 > '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13964)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13965)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13966);return false;
        }
        }__CLR4_1_10a8va8vluszvw9w.R.inc(13967);if ((((y2 < '0' || y2 > '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13968)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13969)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13970);return false;
        }
        }__CLR4_1_10a8va8vluszvw9w.R.inc(13971);if ((((y3 < '0' || y3 > '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13972)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13973)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13974);return false;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(13975);if ((((M0 == '0')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13976)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13977)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13978);if ((((M1 < '1' || M1 > '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13979)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13980)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13981);return false;
            }
        }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(13982);if ((((M0 == '1')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13983)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13984)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13985);if ((((M1 != '0' && M1 != '1' && M1 != '2')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13986)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13987)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13988);return false;
            }
        }} }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13989);return false;
        }

        }}__CLR4_1_10a8va8vluszvw9w.R.inc(13990);if ((((d0 == '0')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13991)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13992)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(13993);if ((((d1 < '1' || d1 > '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13994)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13995)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(13996);return false;
            }
        }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(13997);if ((((d0 == '1' || d0 == '2')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(13998)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(13999)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14000);if ((((d1 < '0' || d1 > '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14001)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14002)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14003);return false;
            }
        }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14004);if ((((d0 == '3')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14005)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14006)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14007);if ((((d1 != '0' && d1 != '1')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14008)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14009)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14010);return false;
            }
        }} }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14011);return false;
        }

        }}}__CLR4_1_10a8va8vluszvw9w.R.inc(14012);return true;
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    @Override
    public boolean isEOF() {try{__CLR4_1_10a8va8vluszvw9w.R.inc(14013);
        __CLR4_1_10a8va8vluszvw9w.R.inc(14014);return bp == len || (ch == EOI && bp + 1 >= len);
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public int scanFieldInt(char[] fieldName) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(14015);
        __CLR4_1_10a8va8vluszvw9w.R.inc(14016);matchStat = UNKNOWN;
        __CLR4_1_10a8va8vluszvw9w.R.inc(14017);int startPos = this.bp;
        __CLR4_1_10a8va8vluszvw9w.R.inc(14018);char startChar = this.ch;

        __CLR4_1_10a8va8vluszvw9w.R.inc(14019);if ((((!charArrayCompare(text, bp, fieldName))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14020)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14021)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14022);matchStat = NOT_MATCH_NAME;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14023);return 0;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14024);int index = bp + fieldName.length;

        __CLR4_1_10a8va8vluszvw9w.R.inc(14025);char ch = charAt(index++);

        __CLR4_1_10a8va8vluszvw9w.R.inc(14026);final boolean quote = ch == '"';

        __CLR4_1_10a8va8vluszvw9w.R.inc(14027);if ((((quote)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14028)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14029)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14030);ch = charAt(index++);
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14031);final boolean negative = ch == '-';
        __CLR4_1_10a8va8vluszvw9w.R.inc(14032);if ((((negative)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14033)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14034)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14035);ch = charAt(index++);
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14036);int value;
        __CLR4_1_10a8va8vluszvw9w.R.inc(14037);if ((((ch >= '0' && ch <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14038)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14039)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14040);value = ch - '0';
            __CLR4_1_10a8va8vluszvw9w.R.inc(14041);for (;;) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14042);ch = charAt(index++);
                __CLR4_1_10a8va8vluszvw9w.R.inc(14043);if ((((ch >= '0' && ch <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14044)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14045)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14046);int value_10 = value * 10;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14047);if ((((value_10 < value)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14048)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14049)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14050);matchStat = NOT_MATCH;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14051);return 0;
                    }

                    }__CLR4_1_10a8va8vluszvw9w.R.inc(14052);value = value_10 + (ch - '0');
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14053);if ((((ch == '.')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14054)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14055)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14056);matchStat = NOT_MATCH;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14057);return 0;
                } }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14058);break;
                }
            }}}

            }__CLR4_1_10a8va8vluszvw9w.R.inc(14059);if ((((value < 0)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14060)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14061)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14062);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14063);return 0;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(14064);if ((((quote)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14065)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14066)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14067);if ((((ch != '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14068)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14069)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14070);matchStat = NOT_MATCH;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14071);return 0;
                } }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14072);ch = charAt(index++);
                }
            }}

            }__CLR4_1_10a8va8vluszvw9w.R.inc(14073);for (;;) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14074);if ((((ch == ',' || ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14075)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14076)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14077);bp = index - 1;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14078);break;
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14079);if((((isWhitespace(ch))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14080)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14081)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14082);ch = charAt(index++);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14083);continue;
                } }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14084);matchStat = NOT_MATCH;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14085);return 0;
                }
            }}}
        }} }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14086);matchStat = NOT_MATCH;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14087);return 0;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14088);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14089)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14090)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14091);this.ch = charAt(++bp);
            __CLR4_1_10a8va8vluszvw9w.R.inc(14092);matchStat = VALUE;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14093);token = JSONToken.COMMA;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14094);return (((negative )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14095)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14096)==0&false))? -value : value;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14097);if ((((ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14098)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14099)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14100);bp = index - 1;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14101);ch = charAt(++bp);
            __CLR4_1_10a8va8vluszvw9w.R.inc(14102);for (; ; ) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14103);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14104)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14105)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14106);token = JSONToken.COMMA;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14107);this.ch = charAt(++bp);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14108);break;
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14109);if ((((ch == ']')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14110)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14111)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14112);token = JSONToken.RBRACKET;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14113);this.ch = charAt(++bp);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14114);break;
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14115);if ((((ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14116)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14117)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14118);token = JSONToken.RBRACE;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14119);this.ch = charAt(++bp);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14120);break;
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14121);if ((((ch == EOI)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14122)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14123)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14124);token = JSONToken.EOF;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14125);break;
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14126);if ((((isWhitespace(ch))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14127)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14128)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14129);ch = charAt(++bp);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14130);continue;
                } }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14131);this.bp = startPos;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14132);this.ch = startChar;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14133);matchStat = NOT_MATCH;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14134);return 0;
                }
            }}}}}}
            }__CLR4_1_10a8va8vluszvw9w.R.inc(14135);matchStat = END;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14136);return (((negative )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14137)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14138)==0&false))? -value : value;
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public String scanFieldString(char[] fieldName) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(14139);
        __CLR4_1_10a8va8vluszvw9w.R.inc(14140);matchStat = UNKNOWN;
        __CLR4_1_10a8va8vluszvw9w.R.inc(14141);int startPos = this.bp;
        __CLR4_1_10a8va8vluszvw9w.R.inc(14142);char startChar = this.ch;

        __CLR4_1_10a8va8vluszvw9w.R.inc(14143);for (;;) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14144);if ((((!charArrayCompare(text, bp, fieldName))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14145)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14146)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14147);if ((((isWhitespace(ch))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14148)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14149)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14150);next();
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14151);continue;
                }
                }__CLR4_1_10a8va8vluszvw9w.R.inc(14152);matchStat = NOT_MATCH_NAME;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14153);return stringDefaultValue();
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14154);break;
            }
        }}

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14155);int index = bp + fieldName.length;

        __CLR4_1_10a8va8vluszvw9w.R.inc(14156);char ch = charAt(index++);
        __CLR4_1_10a8va8vluszvw9w.R.inc(14157);if ((((ch != '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14158)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14159)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14160);matchStat = NOT_MATCH;

            __CLR4_1_10a8va8vluszvw9w.R.inc(14161);return stringDefaultValue();
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14162);final String strVal;
        {
            __CLR4_1_10a8va8vluszvw9w.R.inc(14163);int startIndex = index;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14164);int endIndex = indexOf('"', startIndex);
            __CLR4_1_10a8va8vluszvw9w.R.inc(14165);if ((((endIndex == -1)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14166)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14167)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14168);throw new JSONException("unclosed str");
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(14169);String stringVal = subString(startIndex, endIndex - startIndex);
            __CLR4_1_10a8va8vluszvw9w.R.inc(14170);if ((((stringVal.indexOf('\\') != -1)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14171)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14172)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14173);for (;;) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14174);int slashCount = 0;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14175);for (int i = endIndex - 1; (((i >= 0)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14176)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14177)==0&false)); --i) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14178);if ((((charAt(i) == '\\')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14179)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14180)==0&false))) {{
                            __CLR4_1_10a8va8vluszvw9w.R.inc(14181);slashCount++;
                        } }else {{
                            __CLR4_1_10a8va8vluszvw9w.R.inc(14182);break;
                        }
                    }}
                    }__CLR4_1_10a8va8vluszvw9w.R.inc(14183);if ((((slashCount % 2 == 0)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14184)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14185)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14186);break;
                    }
                    }__CLR4_1_10a8va8vluszvw9w.R.inc(14187);endIndex = indexOf('"', endIndex + 1);
                }

                }__CLR4_1_10a8va8vluszvw9w.R.inc(14188);int chars_len = endIndex - (bp + fieldName.length + 1);
                __CLR4_1_10a8va8vluszvw9w.R.inc(14189);char[] chars = sub_chars(bp + fieldName.length + 1, chars_len);

                __CLR4_1_10a8va8vluszvw9w.R.inc(14190);stringVal = readString(chars, chars_len);
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(14191);ch = charAt(endIndex + 1);

            __CLR4_1_10a8va8vluszvw9w.R.inc(14192);for (;;) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14193);if ((((ch == ',' || ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14194)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14195)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14196);bp = endIndex + 1;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14197);this.ch = ch;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14198);strVal = stringVal;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14199);break;
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14200);if ((((isWhitespace(ch))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14201)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14202)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14203);endIndex++;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14204);ch = charAt(endIndex + 1);
                } }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14205);matchStat = NOT_MATCH;

                    __CLR4_1_10a8va8vluszvw9w.R.inc(14206);return stringDefaultValue();
                }
            }}}
        }}

        __CLR4_1_10a8va8vluszvw9w.R.inc(14207);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14208)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14209)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14210);this.ch = charAt(++bp);
            __CLR4_1_10a8va8vluszvw9w.R.inc(14211);matchStat = VALUE;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14212);return strVal;
        } }else {{
            //condition ch == '}' is always 'true'
            __CLR4_1_10a8va8vluszvw9w.R.inc(14213);ch = charAt(++bp);
            __CLR4_1_10a8va8vluszvw9w.R.inc(14214);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14215)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14216)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14217);token = JSONToken.COMMA;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14218);this.ch = charAt(++bp);
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14219);if ((((ch == ']')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14220)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14221)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14222);token = JSONToken.RBRACKET;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14223);this.ch = charAt(++bp);
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14224);if ((((ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14225)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14226)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14227);token = JSONToken.RBRACE;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14228);this.ch = charAt(++bp);
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14229);if ((((ch == EOI)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14230)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14231)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14232);token = JSONToken.EOF;
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14233);this.bp = startPos;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14234);this.ch = startChar;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14235);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14236);return stringDefaultValue();
            }
            }}}}__CLR4_1_10a8va8vluszvw9w.R.inc(14237);matchStat = END;
        }
        }__CLR4_1_10a8va8vluszvw9w.R.inc(14238);return strVal;
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public java.util.Date scanFieldDate(char[] fieldName) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(14239);
        __CLR4_1_10a8va8vluszvw9w.R.inc(14240);matchStat = UNKNOWN;
        __CLR4_1_10a8va8vluszvw9w.R.inc(14241);int startPos = this.bp;
        __CLR4_1_10a8va8vluszvw9w.R.inc(14242);char startChar = this.ch;

        __CLR4_1_10a8va8vluszvw9w.R.inc(14243);if ((((!charArrayCompare(text, bp, fieldName))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14244)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14245)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14246);matchStat = NOT_MATCH_NAME;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14247);return null;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14248);int index = bp + fieldName.length;

        __CLR4_1_10a8va8vluszvw9w.R.inc(14249);char ch = charAt(index++);

        __CLR4_1_10a8va8vluszvw9w.R.inc(14250);final java.util.Date dateVal;
        __CLR4_1_10a8va8vluszvw9w.R.inc(14251);if ((((ch == '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14252)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14253)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14254);int startIndex = index;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14255);int endIndex = indexOf('"', startIndex);
            __CLR4_1_10a8va8vluszvw9w.R.inc(14256);if ((((endIndex == -1)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14257)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14258)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14259);throw new JSONException("unclosed str");
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(14260);int rest = endIndex - startIndex;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14261);bp = index;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14262);if ((((scanISO8601DateIfMatch(false, rest))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14263)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14264)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14265);dateVal = calendar.getTime();
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14266);bp = startPos;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14267);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14268);return null;
            }
            }__CLR4_1_10a8va8vluszvw9w.R.inc(14269);ch = charAt(endIndex + 1);
            __CLR4_1_10a8va8vluszvw9w.R.inc(14270);bp = startPos;

            __CLR4_1_10a8va8vluszvw9w.R.inc(14271);for (; ; ) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14272);if ((((ch == ',' || ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14273)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14274)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14275);bp = endIndex + 1;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14276);this.ch = ch;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14277);break;
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14278);if ((((isWhitespace(ch))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14279)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14280)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14281);endIndex++;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14282);ch = charAt(endIndex + 1);
                } }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14283);matchStat = NOT_MATCH;

                    __CLR4_1_10a8va8vluszvw9w.R.inc(14284);return null;
                }
            }}}
        }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14285);if ((((ch == '-' || (ch >= '0' && ch <= '9'))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14286)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14287)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14288);long millis = 0;

            __CLR4_1_10a8va8vluszvw9w.R.inc(14289);boolean negative = false;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14290);if ((((ch == '-')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14291)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14292)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14293);ch = charAt(index++);
                __CLR4_1_10a8va8vluszvw9w.R.inc(14294);negative = true;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(14295);if ((((ch >= '0' && ch <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14296)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14297)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14298);millis = ch - '0';
                __CLR4_1_10a8va8vluszvw9w.R.inc(14299);for (; ; ) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14300);ch = charAt(index++);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14301);if ((((ch >= '0' && ch <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14302)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14303)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14304);millis = millis * 10 + (ch - '0');
                    } }else {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14305);if ((((ch == ',' || ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14306)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14307)==0&false))) {{
                            __CLR4_1_10a8va8vluszvw9w.R.inc(14308);bp = index - 1;
                        }
                        }__CLR4_1_10a8va8vluszvw9w.R.inc(14309);break;
                    }
                }}
            }}

            }__CLR4_1_10a8va8vluszvw9w.R.inc(14310);if ((((millis < 0)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14311)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14312)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14313);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14314);return null;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(14315);if ((((negative)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14316)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14317)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14318);millis = -millis;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(14319);dateVal = new java.util.Date(millis);
        } }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14320);matchStat = NOT_MATCH;

            __CLR4_1_10a8va8vluszvw9w.R.inc(14321);return null;
        }

        }}__CLR4_1_10a8va8vluszvw9w.R.inc(14322);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14323)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14324)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14325);this.ch = charAt(++bp);
            __CLR4_1_10a8va8vluszvw9w.R.inc(14326);matchStat = VALUE;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14327);token = JSONToken.COMMA;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14328);return dateVal;
        } }else {{
            //condition ch == '}' is always 'true'
            __CLR4_1_10a8va8vluszvw9w.R.inc(14329);ch = charAt(++bp);
            __CLR4_1_10a8va8vluszvw9w.R.inc(14330);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14331)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14332)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14333);token = JSONToken.COMMA;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14334);this.ch = charAt(++bp);
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14335);if ((((ch == ']')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14336)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14337)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14338);token = JSONToken.RBRACKET;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14339);this.ch = charAt(++bp);
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14340);if ((((ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14341)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14342)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14343);token = JSONToken.RBRACE;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14344);this.ch = charAt(++bp);
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14345);if ((((ch == EOI)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14346)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14347)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14348);token = JSONToken.EOF;
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14349);this.bp = startPos;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14350);this.ch = startChar;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14351);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14352);return null;
            }
            }}}}__CLR4_1_10a8va8vluszvw9w.R.inc(14353);matchStat = END;
        }
        }__CLR4_1_10a8va8vluszvw9w.R.inc(14354);return dateVal;
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public long scanFieldSymbol(char[] fieldName) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(14355);
        __CLR4_1_10a8va8vluszvw9w.R.inc(14356);matchStat = UNKNOWN;

        __CLR4_1_10a8va8vluszvw9w.R.inc(14357);if ((((!charArrayCompare(text, bp, fieldName))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14358)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14359)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14360);matchStat = NOT_MATCH_NAME;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14361);return 0;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14362);int index = bp + fieldName.length;

        __CLR4_1_10a8va8vluszvw9w.R.inc(14363);char ch = charAt(index++);
        __CLR4_1_10a8va8vluszvw9w.R.inc(14364);if ((((ch != '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14365)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14366)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14367);matchStat = NOT_MATCH;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14368);return 0;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14369);long hash = 0xcbf29ce484222325L;
        __CLR4_1_10a8va8vluszvw9w.R.inc(14370);for (;;) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14371);ch = charAt(index++);
            __CLR4_1_10a8va8vluszvw9w.R.inc(14372);if ((((ch == '\"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14373)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14374)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14375);bp = index;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14376);this.ch = ch = charAt(bp);
                __CLR4_1_10a8va8vluszvw9w.R.inc(14377);break;
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14378);if ((((index > len)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14379)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14380)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14381);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14382);return 0;
            }

            }}__CLR4_1_10a8va8vluszvw9w.R.inc(14383);hash ^= ch;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14384);hash *= 0x100000001b3L;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14385);for (;;) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14386);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14387)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14388)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14389);this.ch = charAt(++bp);
                __CLR4_1_10a8va8vluszvw9w.R.inc(14390);matchStat = VALUE;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14391);return hash;
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14392);if ((((ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14393)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14394)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14395);next();
                __CLR4_1_10a8va8vluszvw9w.R.inc(14396);skipWhitespace();
                __CLR4_1_10a8va8vluszvw9w.R.inc(14397);ch = getCurrent();
                __CLR4_1_10a8va8vluszvw9w.R.inc(14398);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14399)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14400)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14401);token = JSONToken.COMMA;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14402);this.ch = charAt(++bp);
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14403);if ((((ch == ']')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14404)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14405)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14406);token = JSONToken.RBRACKET;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14407);this.ch = charAt(++bp);
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14408);if ((((ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14409)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14410)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14411);token = JSONToken.RBRACE;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14412);this.ch = charAt(++bp);
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14413);if ((((ch == EOI)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14414)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14415)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14416);token = JSONToken.EOF;
                } }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14417);matchStat = NOT_MATCH;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14418);return 0;
                }
                }}}}__CLR4_1_10a8va8vluszvw9w.R.inc(14419);matchStat = END;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14420);break;
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14421);if ((((isWhitespace(ch))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14422)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14423)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14424);ch = charAt(++bp);
                __CLR4_1_10a8va8vluszvw9w.R.inc(14425);continue;
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14426);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14427);return 0;
            }
        }}}}

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14428);return hash;
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public Collection<String> newCollectionByType(Class<?> type){try{__CLR4_1_10a8va8vluszvw9w.R.inc(14429);
        __CLR4_1_10a8va8vluszvw9w.R.inc(14430);if ((((type.isAssignableFrom(HashSet.class))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14431)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14432)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14433);HashSet<String> list = new HashSet<String>();
            __CLR4_1_10a8va8vluszvw9w.R.inc(14434);return list;
        } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14435);if ((((type.isAssignableFrom(ArrayList.class))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14436)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14437)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14438);ArrayList<String> list2 = new ArrayList<String>();
            __CLR4_1_10a8va8vluszvw9w.R.inc(14439);return list2;
        } }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14440);try {
                __CLR4_1_10a8va8vluszvw9w.R.inc(14441);Collection<String> list = (Collection<String>) type.newInstance();
                __CLR4_1_10a8va8vluszvw9w.R.inc(14442);return list;
            } catch (Exception e) {
                __CLR4_1_10a8va8vluszvw9w.R.inc(14443);throw new JSONException(e.getMessage(), e);
            }
        }
    }}}finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public Collection<String> scanFieldStringArray(char[] fieldName, Class<?> type) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(14444);
        __CLR4_1_10a8va8vluszvw9w.R.inc(14445);matchStat = UNKNOWN;

        __CLR4_1_10a8va8vluszvw9w.R.inc(14446);while ((((ch == '\n' || ch == ' ')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14447)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14448)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14449);int index = ++bp;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14450);ch = ((((index >= this.len )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14451)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14452)==0&false))? //
                    EOI //
                    : text.charAt(index));
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14453);if ((((!charArrayCompare(text, bp, fieldName))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14454)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14455)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14456);matchStat = NOT_MATCH_NAME;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14457);return null;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14458);Collection<String> list = newCollectionByType(type);

//        if (type.isAssignableFrom(HashSet.class)) {
//            list = new HashSet<String>();
//        } else if (type.isAssignableFrom(ArrayList.class)) {
//            list = new ArrayList<String>();
//        } else {
//            try {
//                list = (Collection<String>) type.newInstance();
//            } catch (Exception e) {
//                throw new JSONException(e.getMessage(), e);
//            }
//        }

        __CLR4_1_10a8va8vluszvw9w.R.inc(14459);int startPos = this.bp;
        __CLR4_1_10a8va8vluszvw9w.R.inc(14460);char startChar = this.ch;

        __CLR4_1_10a8va8vluszvw9w.R.inc(14461);int index = bp + fieldName.length;

        __CLR4_1_10a8va8vluszvw9w.R.inc(14462);char ch = charAt(index++);

        __CLR4_1_10a8va8vluszvw9w.R.inc(14463);if ((((ch == '[')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14464)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14465)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14466);ch = charAt(index++);

            __CLR4_1_10a8va8vluszvw9w.R.inc(14467);for (;;) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14468);if ((((ch == '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14469)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14470)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14471);int startIndex = index;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14472);int endIndex = indexOf('"', startIndex);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14473);if ((((endIndex == -1)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14474)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14475)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14476);throw new JSONException("unclosed str");
                    }

                    }__CLR4_1_10a8va8vluszvw9w.R.inc(14477);String stringVal = subString(startIndex, endIndex - startIndex);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14478);if ((((stringVal.indexOf('\\') != -1)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14479)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14480)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14481);for (;;) {{
                            __CLR4_1_10a8va8vluszvw9w.R.inc(14482);int slashCount = 0;
                            __CLR4_1_10a8va8vluszvw9w.R.inc(14483);for (int i = endIndex - 1; (((i >= 0)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14484)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14485)==0&false)); --i) {{
                                __CLR4_1_10a8va8vluszvw9w.R.inc(14486);if ((((charAt(i) == '\\')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14487)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14488)==0&false))) {{
                                    __CLR4_1_10a8va8vluszvw9w.R.inc(14489);slashCount++;
                                } }else {{
                                    __CLR4_1_10a8va8vluszvw9w.R.inc(14490);break;
                                }
                            }}
                            }__CLR4_1_10a8va8vluszvw9w.R.inc(14491);if ((((slashCount % 2 == 0)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14492)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14493)==0&false))) {{
                                __CLR4_1_10a8va8vluszvw9w.R.inc(14494);break;
                            }
                            }__CLR4_1_10a8va8vluszvw9w.R.inc(14495);endIndex = indexOf('"', endIndex + 1);
                        }

                        }__CLR4_1_10a8va8vluszvw9w.R.inc(14496);int chars_len = endIndex - startIndex;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14497);char[] chars = sub_chars(startIndex, chars_len);

                        __CLR4_1_10a8va8vluszvw9w.R.inc(14498);stringVal = readString(chars, chars_len);
                    }

                    }__CLR4_1_10a8va8vluszvw9w.R.inc(14499);index = endIndex + 1;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14500);ch = charAt(index++);

                    __CLR4_1_10a8va8vluszvw9w.R.inc(14501);list.add(stringVal);
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14502);if ((((ch == 'n' && text.startsWith("ull", index))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14503)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14504)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14505);index += 3;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14506);ch = charAt(index++);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14507);list.add(null);
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14508);if ((((ch == ']' && list.size() == 0)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14509)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14510)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14511);ch = charAt(index++);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14512);break;
                } }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14513);matchStat = NOT_MATCH;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14514);return null;
                }

                }}}__CLR4_1_10a8va8vluszvw9w.R.inc(14515);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14516)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14517)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14518);ch = charAt(index++);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14519);continue;
                }

                }__CLR4_1_10a8va8vluszvw9w.R.inc(14520);if ((((ch == ']')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14521)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14522)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14523);ch = charAt(index++);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14524);while ((((isWhitespace(ch))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14525)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14526)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14527);ch = charAt(index++);
                    }
                    }__CLR4_1_10a8va8vluszvw9w.R.inc(14528);break;
                }

                }__CLR4_1_10a8va8vluszvw9w.R.inc(14529);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14530);return null;
            }
        }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14531);if ((((text.startsWith("ull", index))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14532)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14533)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14534);index += 3;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14535);ch = charAt(index++);
            __CLR4_1_10a8va8vluszvw9w.R.inc(14536);list = null;
        } }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14537);matchStat = NOT_MATCH;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14538);return null;
        }

        }}__CLR4_1_10a8va8vluszvw9w.R.inc(14539);bp = index;
        __CLR4_1_10a8va8vluszvw9w.R.inc(14540);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14541)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14542)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14543);this.ch = charAt(bp);
            __CLR4_1_10a8va8vluszvw9w.R.inc(14544);matchStat = VALUE;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14545);return list;
        } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14546);if ((((ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14547)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14548)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14549);ch = charAt(bp);
            __CLR4_1_10a8va8vluszvw9w.R.inc(14550);for (;;) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14551);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14552)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14553)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14554);token = JSONToken.COMMA;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14555);this.ch = charAt(++bp);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14556);break;
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14557);if ((((ch == ']')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14558)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14559)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14560);token = JSONToken.RBRACKET;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14561);this.ch = charAt(++bp);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14562);break;
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14563);if ((((ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14564)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14565)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14566);token = JSONToken.RBRACE;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14567);this.ch = charAt(++bp);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14568);break;
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14569);if ((((ch == EOI)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14570)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14571)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14572);token = JSONToken.EOF;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14573);this.ch = ch;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14574);break;
                } }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14575);boolean space = false;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14576);while ((((isWhitespace(ch))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14577)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14578)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14579);ch = charAt(index++);
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14580);bp = index;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14581);space = true;
                    }
                    }__CLR4_1_10a8va8vluszvw9w.R.inc(14582);if ((((space)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14583)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14584)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14585);continue;
                    }

                    }__CLR4_1_10a8va8vluszvw9w.R.inc(14586);matchStat = NOT_MATCH;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14587);return null;
                }
            }}}}}

            }__CLR4_1_10a8va8vluszvw9w.R.inc(14588);matchStat = END;
        } }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14589);this.ch = startChar;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14590);bp = startPos;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14591);matchStat = NOT_MATCH;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14592);return null;
        }

        }}__CLR4_1_10a8va8vluszvw9w.R.inc(14593);return list;
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public long scanFieldLong(char[] fieldName) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(14594);
        __CLR4_1_10a8va8vluszvw9w.R.inc(14595);matchStat = UNKNOWN;
        __CLR4_1_10a8va8vluszvw9w.R.inc(14596);int startPos = this.bp;
        __CLR4_1_10a8va8vluszvw9w.R.inc(14597);char startChar = this.ch;

        __CLR4_1_10a8va8vluszvw9w.R.inc(14598);if ((((!charArrayCompare(text, bp, fieldName))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14599)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14600)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14601);matchStat = NOT_MATCH_NAME;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14602);return 0;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14603);int index = bp + fieldName.length;

        __CLR4_1_10a8va8vluszvw9w.R.inc(14604);char ch = charAt(index++);

        __CLR4_1_10a8va8vluszvw9w.R.inc(14605);final boolean quote = ch == '"';
        __CLR4_1_10a8va8vluszvw9w.R.inc(14606);if ((((quote)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14607)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14608)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14609);ch = charAt(index++);
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14610);boolean negative = false;
        __CLR4_1_10a8va8vluszvw9w.R.inc(14611);if ((((ch == '-')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14612)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14613)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14614);ch = charAt(index++);
            __CLR4_1_10a8va8vluszvw9w.R.inc(14615);negative = true;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14616);long value;
        __CLR4_1_10a8va8vluszvw9w.R.inc(14617);if ((((ch >= '0' && ch <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14618)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14619)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14620);value = ch - '0';
            __CLR4_1_10a8va8vluszvw9w.R.inc(14621);for (;;) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14622);ch = charAt(index++);
                __CLR4_1_10a8va8vluszvw9w.R.inc(14623);if ((((ch >= '0' && ch <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14624)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14625)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14626);value = value * 10 + (ch - '0');
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14627);if ((((ch == '.')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14628)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14629)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14630);matchStat = NOT_MATCH;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14631);return 0;
                } }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14632);if ((((quote)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14633)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14634)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14635);if ((((ch != '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14636)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14637)==0&false))) {{
                            __CLR4_1_10a8va8vluszvw9w.R.inc(14638);matchStat = NOT_MATCH;
                            __CLR4_1_10a8va8vluszvw9w.R.inc(14639);return 0;
                        } }else {{
                            __CLR4_1_10a8va8vluszvw9w.R.inc(14640);ch = charAt(index++);
                        }
                    }}

                    }__CLR4_1_10a8va8vluszvw9w.R.inc(14641);if ((((ch == ',' || ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14642)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14643)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14644);bp = index - 1;
                    }
                    }__CLR4_1_10a8va8vluszvw9w.R.inc(14645);break;
                }
            }}}

            }__CLR4_1_10a8va8vluszvw9w.R.inc(14646);boolean valid = value >= 0 || (value == -9223372036854775808L && negative);
            __CLR4_1_10a8va8vluszvw9w.R.inc(14647);if ((((!valid)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14648)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14649)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14650);this.bp = startPos;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14651);this.ch = startChar;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14652);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14653);return 0;
            }
        }} }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14654);this.bp = startPos;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14655);this.ch = startChar;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14656);matchStat = NOT_MATCH;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14657);return 0;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14658);for (;;) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14659);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14660)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14661)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14662);this.ch = charAt(++bp);
                __CLR4_1_10a8va8vluszvw9w.R.inc(14663);matchStat = VALUE;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14664);token = JSONToken.COMMA;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14665);return (((negative )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14666)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14667)==0&false))? -value : value;
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14668);if ((((ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14669)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14670)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14671);ch = charAt(++bp);
                __CLR4_1_10a8va8vluszvw9w.R.inc(14672);for (;;) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14673);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14674)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14675)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14676);token = JSONToken.COMMA;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14677);this.ch = charAt(++bp);
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14678);break;
                    } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14679);if ((((ch == ']')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14680)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14681)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14682);token = JSONToken.RBRACKET;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14683);this.ch = charAt(++bp);
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14684);break;
                    } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14685);if ((((ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14686)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14687)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14688);token = JSONToken.RBRACE;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14689);this.ch = charAt(++bp);
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14690);break;
                    } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14691);if ((((ch == EOI)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14692)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14693)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14694);token = JSONToken.EOF;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14695);break;
                    } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14696);if ((((isWhitespace(ch))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14697)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14698)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14699);ch = charAt(++bp);
                    } }else {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14700);this.bp = startPos;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14701);this.ch = startChar;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14702);matchStat = NOT_MATCH;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14703);return 0;
                    }
                }}}}}}
                }__CLR4_1_10a8va8vluszvw9w.R.inc(14704);matchStat = END;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14705);break;
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14706);if ((((isWhitespace(ch))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14707)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14708)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14709);bp = index;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14710);ch = charAt(index++);
                __CLR4_1_10a8va8vluszvw9w.R.inc(14711);continue;
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14712);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14713);return 0;
            }
        }}}}

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14714);return (((negative )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14715)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14716)==0&false))? -value : value;
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public boolean scanFieldBoolean(char[] fieldName) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(14717);
        __CLR4_1_10a8va8vluszvw9w.R.inc(14718);matchStat = UNKNOWN;

        __CLR4_1_10a8va8vluszvw9w.R.inc(14719);if ((((!charArrayCompare(text, bp, fieldName))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14720)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14721)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14722);matchStat = NOT_MATCH_NAME;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14723);return false;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14724);int startPos = bp;
        __CLR4_1_10a8va8vluszvw9w.R.inc(14725);int index = bp + fieldName.length;

        __CLR4_1_10a8va8vluszvw9w.R.inc(14726);char ch = charAt(index++);

        __CLR4_1_10a8va8vluszvw9w.R.inc(14727);final boolean quote = ch == '"';
        __CLR4_1_10a8va8vluszvw9w.R.inc(14728);if ((((quote)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14729)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14730)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14731);ch = charAt(index++);
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14732);boolean value;
        __CLR4_1_10a8va8vluszvw9w.R.inc(14733);if ((((ch == 't')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14734)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14735)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14736);if ((((charAt(index++) != 'r')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14737)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14738)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14739);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14740);return false;
            }
            }__CLR4_1_10a8va8vluszvw9w.R.inc(14741);if ((((charAt(index++) != 'u')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14742)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14743)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14744);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14745);return false;
            }
            }__CLR4_1_10a8va8vluszvw9w.R.inc(14746);if ((((charAt(index++) != 'e')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14747)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14748)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14749);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14750);return false;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(14751);if ((((quote && charAt(index++) != '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14752)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14753)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14754);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14755);return false;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(14756);bp = index;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14757);ch = charAt(bp);
            __CLR4_1_10a8va8vluszvw9w.R.inc(14758);value = true;
        } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14759);if ((((ch == 'f')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14760)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14761)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14762);if ((((charAt(index++) != 'a')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14763)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14764)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14765);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14766);return false;
            }
            }__CLR4_1_10a8va8vluszvw9w.R.inc(14767);if ((((charAt(index++) != 'l')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14768)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14769)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14770);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14771);return false;
            }
            }__CLR4_1_10a8va8vluszvw9w.R.inc(14772);if ((((charAt(index++) != 's')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14773)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14774)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14775);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14776);return false;
            }
            }__CLR4_1_10a8va8vluszvw9w.R.inc(14777);if ((((charAt(index++) != 'e')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14778)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14779)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14780);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14781);return false;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(14782);if ((((quote && charAt(index++) != '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14783)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14784)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14785);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14786);return false;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(14787);bp = index;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14788);ch = charAt(bp);
            __CLR4_1_10a8va8vluszvw9w.R.inc(14789);value = false;
        } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14790);if ((((ch == '1')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14791)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14792)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14793);if ((((quote && charAt(index++) != '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14794)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14795)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14796);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14797);return false;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(14798);bp = index;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14799);ch = charAt(bp);
            __CLR4_1_10a8va8vluszvw9w.R.inc(14800);value = true;
        } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14801);if ((((ch == '0')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14802)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14803)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14804);if ((((quote && charAt(index++) != '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14805)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14806)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14807);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14808);return false;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(14809);bp = index;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14810);ch = charAt(bp);
            __CLR4_1_10a8va8vluszvw9w.R.inc(14811);value = false;
        } }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14812);matchStat = NOT_MATCH;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14813);return false;
        }

        }}}}__CLR4_1_10a8va8vluszvw9w.R.inc(14814);for (;;) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14815);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14816)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14817)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14818);this.ch = charAt(++bp);
                __CLR4_1_10a8va8vluszvw9w.R.inc(14819);matchStat = VALUE;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14820);token = JSONToken.COMMA;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14821);break;
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14822);if ((((ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14823)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14824)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14825);ch = charAt(++bp);
                __CLR4_1_10a8va8vluszvw9w.R.inc(14826);for (;;) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14827);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14828)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14829)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14830);token = JSONToken.COMMA;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14831);this.ch = charAt(++bp);
                    } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14832);if ((((ch == ']')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14833)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14834)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14835);token = JSONToken.RBRACKET;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14836);this.ch = charAt(++bp);
                    } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14837);if ((((ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14838)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14839)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14840);token = JSONToken.RBRACE;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14841);this.ch = charAt(++bp);
                    } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14842);if ((((ch == EOI)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14843)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14844)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14845);token = JSONToken.EOF;
                    } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14846);if ((((isWhitespace(ch))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14847)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14848)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14849);ch = charAt(++bp);
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14850);continue;
                    } }else {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14851);matchStat = NOT_MATCH;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14852);return false;
                    }
                    }}}}}__CLR4_1_10a8va8vluszvw9w.R.inc(14853);break;
                }
                }__CLR4_1_10a8va8vluszvw9w.R.inc(14854);matchStat = END;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14855);break;
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14856);if ((((isWhitespace(ch))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14857)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14858)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14859);ch = charAt(++bp);
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14860);bp = startPos;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14861);ch = charAt(bp);
                __CLR4_1_10a8va8vluszvw9w.R.inc(14862);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14863);return false;
            }
        }}}}

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14864);return value;
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public final int scanInt(char expectNext) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(14865);
        __CLR4_1_10a8va8vluszvw9w.R.inc(14866);matchStat = UNKNOWN;

        __CLR4_1_10a8va8vluszvw9w.R.inc(14867);final int mark = bp;
        __CLR4_1_10a8va8vluszvw9w.R.inc(14868);int offset = bp;
        __CLR4_1_10a8va8vluszvw9w.R.inc(14869);char chLocal = charAt(offset++);

        __CLR4_1_10a8va8vluszvw9w.R.inc(14870);while ((((isWhitespace(chLocal))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14871)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14872)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14873);chLocal = charAt(offset++);
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14874);final boolean quote = chLocal == '"';

        __CLR4_1_10a8va8vluszvw9w.R.inc(14875);if ((((quote)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14876)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14877)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14878);chLocal = charAt(offset++);
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14879);final boolean negative = chLocal == '-';
        __CLR4_1_10a8va8vluszvw9w.R.inc(14880);if ((((negative)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14881)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14882)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14883);chLocal = charAt(offset++);
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14884);int value;
        __CLR4_1_10a8va8vluszvw9w.R.inc(14885);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14886)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14887)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14888);value = chLocal - '0';
            __CLR4_1_10a8va8vluszvw9w.R.inc(14889);for (;;) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14890);chLocal = charAt(offset++);
                __CLR4_1_10a8va8vluszvw9w.R.inc(14891);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14892)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14893)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14894);int value_10 = value * 10;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14895);if ((((value_10 < value)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14896)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14897)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14898);throw new JSONException("parseInt error : "
                                + subString(mark, offset - 1));
                    }
                    }__CLR4_1_10a8va8vluszvw9w.R.inc(14899);value = value_10 + (chLocal - '0');
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14900);if ((((chLocal == '.')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14901)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14902)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14903);matchStat = NOT_MATCH;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14904);return 0;
                } }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14905);if ((((quote)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14906)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14907)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(14908);if ((((chLocal != '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14909)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14910)==0&false))) {{
                            __CLR4_1_10a8va8vluszvw9w.R.inc(14911);matchStat = NOT_MATCH;
                            __CLR4_1_10a8va8vluszvw9w.R.inc(14912);return 0;
                        } }else {{
                            __CLR4_1_10a8va8vluszvw9w.R.inc(14913);chLocal = charAt(offset++);
                        }
                    }}
                    }__CLR4_1_10a8va8vluszvw9w.R.inc(14914);break;
                }
            }}}
            }__CLR4_1_10a8va8vluszvw9w.R.inc(14915);if ((((value < 0)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14916)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14917)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14918);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14919);return 0;
            }
        }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14920);if ((((chLocal == 'n'
                && charAt(offset++) == 'u'
                && charAt(offset++) == 'l'
                && charAt(offset++) == 'l')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14921)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14922)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14923);matchStat = VALUE_NULL;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14924);value = 0;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14925);chLocal = charAt(offset++);

            __CLR4_1_10a8va8vluszvw9w.R.inc(14926);if ((((quote && chLocal == '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14927)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14928)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14929);chLocal = charAt(offset++);
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(14930);for (;;) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14931);if ((((chLocal == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14932)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14933)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14934);bp = offset;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14935);this.ch = charAt(bp);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14936);matchStat = VALUE_NULL;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14937);token = JSONToken.COMMA;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14938);return value;
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14939);if ((((chLocal == ']')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14940)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14941)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14942);bp = offset;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14943);this.ch = charAt(bp);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14944);matchStat = VALUE_NULL;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14945);token = JSONToken.RBRACKET;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14946);return value;
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(14947);if ((((isWhitespace(chLocal))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14948)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14949)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14950);chLocal = charAt(offset++);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14951);continue;
                }
                }}}__CLR4_1_10a8va8vluszvw9w.R.inc(14952);break;
            }
            }__CLR4_1_10a8va8vluszvw9w.R.inc(14953);matchStat = NOT_MATCH;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14954);return 0;
        } }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14955);matchStat = NOT_MATCH;
            __CLR4_1_10a8va8vluszvw9w.R.inc(14956);return 0;
        }

        }}__CLR4_1_10a8va8vluszvw9w.R.inc(14957);for (;;) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14958);if ((((chLocal == expectNext)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14959)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14960)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14961);bp = offset;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14962);this.ch = charAt(bp);
                __CLR4_1_10a8va8vluszvw9w.R.inc(14963);matchStat = VALUE;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14964);token = JSONToken.COMMA;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14965);return (((negative )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14966)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14967)==0&false))? -value : value;
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14968);if ((((isWhitespace(chLocal))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14969)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14970)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14971);chLocal = charAt(offset++);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(14972);continue;
                }
                }__CLR4_1_10a8va8vluszvw9w.R.inc(14973);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(14974);return (((negative )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14975)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14976)==0&false))? -value : value;
            }
        }}
    }}finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public  double scanDouble(char seperator) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(14977);
        __CLR4_1_10a8va8vluszvw9w.R.inc(14978);matchStat = UNKNOWN;

        __CLR4_1_10a8va8vluszvw9w.R.inc(14979);int offset = bp;
        __CLR4_1_10a8va8vluszvw9w.R.inc(14980);char chLocal = charAt(offset++);
        __CLR4_1_10a8va8vluszvw9w.R.inc(14981);final boolean quote = chLocal == '"';
        __CLR4_1_10a8va8vluszvw9w.R.inc(14982);if ((((quote)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14983)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14984)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14985);chLocal = charAt(offset++);
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14986);boolean negative = chLocal == '-';
        __CLR4_1_10a8va8vluszvw9w.R.inc(14987);if ((((negative)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14988)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14989)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14990);chLocal = charAt(offset++);
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(14991);double value;
        __CLR4_1_10a8va8vluszvw9w.R.inc(14992);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14993)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(14994)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(14995);long intVal = chLocal - '0';
            __CLR4_1_10a8va8vluszvw9w.R.inc(14996);for (; ; ) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(14997);chLocal = charAt(offset++);
                __CLR4_1_10a8va8vluszvw9w.R.inc(14998);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(14999)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15000)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15001);intVal = intVal * 10 + (chLocal - '0');
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15002);continue;
                } }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15003);break;
                }
            }}

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15004);long power = 1;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15005);boolean small = (chLocal == '.');
            __CLR4_1_10a8va8vluszvw9w.R.inc(15006);if ((((small)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15007)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15008)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15009);chLocal = charAt(offset++);
                __CLR4_1_10a8va8vluszvw9w.R.inc(15010);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15011)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15012)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15013);intVal = intVal * 10 + (chLocal - '0');
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15014);power = 10;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15015);for (; ; ) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15016);chLocal = charAt(offset++);
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15017);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15018)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15019)==0&false))) {{
                            __CLR4_1_10a8va8vluszvw9w.R.inc(15020);intVal = intVal * 10 + (chLocal - '0');
                            __CLR4_1_10a8va8vluszvw9w.R.inc(15021);power *= 10;
                            __CLR4_1_10a8va8vluszvw9w.R.inc(15022);continue;
                        } }else {{
                            __CLR4_1_10a8va8vluszvw9w.R.inc(15023);break;
                        }
                    }}
                }} }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15024);matchStat = NOT_MATCH;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15025);return 0;
                }
            }}

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15026);boolean exp = chLocal == 'e' || chLocal == 'E';
            __CLR4_1_10a8va8vluszvw9w.R.inc(15027);if ((((exp)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15028)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15029)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15030);chLocal = charAt(offset++);
                __CLR4_1_10a8va8vluszvw9w.R.inc(15031);if ((((chLocal == '+' || chLocal == '-')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15032)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15033)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15034);chLocal = charAt(offset++);
                }
                }__CLR4_1_10a8va8vluszvw9w.R.inc(15035);for (; ; ) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15036);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15037)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15038)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15039);chLocal = charAt(offset++);
                    } }else {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15040);break;
                    }
                }}
            }}

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15041);int start, count;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15042);if ((((quote)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15043)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15044)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15045);if ((((chLocal != '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15046)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15047)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15048);matchStat = NOT_MATCH;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15049);return 0;
                } }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15050);chLocal = charAt(offset++);
                }
                }__CLR4_1_10a8va8vluszvw9w.R.inc(15051);start = bp + 1;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15052);count = offset - start - 2;
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15053);start = bp;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15054);count = offset - start - 1;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15055);if ((((!exp && count < 18)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15056)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15057)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15058);value = ((double) intVal) / power;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15059);if ((((negative)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15060)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15061)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15062);value = -value;
                }
            }} }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15063);String text = this.subString(start, count);
                __CLR4_1_10a8va8vluszvw9w.R.inc(15064);value = Double.parseDouble(text);
            }
        }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15065);if ((((chLocal == 'n'
                && charAt(offset++) == 'u'
                && charAt(offset++) == 'l'
                && charAt(offset++) == 'l')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15066)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15067)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15068);matchStat = VALUE_NULL;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15069);value = 0;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15070);chLocal = charAt(offset++);

            __CLR4_1_10a8va8vluszvw9w.R.inc(15071);if ((((quote && chLocal == '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15072)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15073)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15074);chLocal = charAt(offset++);
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15075);for (;;) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15076);if ((((chLocal == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15077)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15078)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15079);bp = offset;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15080);this.ch = charAt(bp);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15081);matchStat = VALUE_NULL;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15082);token = JSONToken.COMMA;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15083);return value;
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15084);if ((((chLocal == ']')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15085)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15086)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15087);bp = offset;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15088);this.ch = charAt(bp);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15089);matchStat = VALUE_NULL;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15090);token = JSONToken.RBRACKET;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15091);return value;
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15092);if ((((isWhitespace(chLocal))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15093)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15094)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15095);chLocal = charAt(offset++);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15096);continue;
                }
                }}}__CLR4_1_10a8va8vluszvw9w.R.inc(15097);break;
            }
            }__CLR4_1_10a8va8vluszvw9w.R.inc(15098);matchStat = NOT_MATCH;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15099);return 0;
        } }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15100);matchStat = NOT_MATCH;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15101);return 0;
        }

        }}__CLR4_1_10a8va8vluszvw9w.R.inc(15102);if ((((chLocal == seperator)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15103)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15104)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15105);bp = offset;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15106);this.ch = this.charAt(bp);
            __CLR4_1_10a8va8vluszvw9w.R.inc(15107);matchStat = VALUE;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15108);token = JSONToken.COMMA;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15109);return value;
        } }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15110);matchStat = NOT_MATCH;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15111);return value;
        }
    }}finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public long scanLong(char seperator) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(15112);
        __CLR4_1_10a8va8vluszvw9w.R.inc(15113);matchStat = UNKNOWN;

        __CLR4_1_10a8va8vluszvw9w.R.inc(15114);int offset = bp;
        __CLR4_1_10a8va8vluszvw9w.R.inc(15115);char chLocal = charAt(offset++);
        __CLR4_1_10a8va8vluszvw9w.R.inc(15116);final boolean quote = chLocal == '"';

        __CLR4_1_10a8va8vluszvw9w.R.inc(15117);if ((((quote)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15118)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15119)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15120);chLocal = charAt(offset++);
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(15121);final boolean negative = chLocal == '-';
        __CLR4_1_10a8va8vluszvw9w.R.inc(15122);if ((((negative)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15123)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15124)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15125);chLocal = charAt(offset++);
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(15126);long value;
        __CLR4_1_10a8va8vluszvw9w.R.inc(15127);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15128)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15129)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15130);value = chLocal - '0';
            __CLR4_1_10a8va8vluszvw9w.R.inc(15131);for (;;) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15132);chLocal = charAt(offset++);
                __CLR4_1_10a8va8vluszvw9w.R.inc(15133);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15134)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15135)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15136);value = value * 10 + (chLocal - '0');
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15137);if ((((chLocal == '.')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15138)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15139)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15140);matchStat = NOT_MATCH;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15141);return 0;
                } }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15142);if ((((quote)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15143)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15144)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15145);if ((((chLocal != '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15146)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15147)==0&false))) {{
                            __CLR4_1_10a8va8vluszvw9w.R.inc(15148);matchStat = NOT_MATCH;
                            __CLR4_1_10a8va8vluszvw9w.R.inc(15149);return 0;
                        } }else {{
                            __CLR4_1_10a8va8vluszvw9w.R.inc(15150);chLocal = charAt(offset++);
                        }
                    }}
                    }__CLR4_1_10a8va8vluszvw9w.R.inc(15151);break;
                }
            }}}

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15152);boolean valid = value >= 0 || (value == -9223372036854775808L && negative);
            __CLR4_1_10a8va8vluszvw9w.R.inc(15153);if ((((!valid)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15154)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15155)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15156);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15157);return 0;
            }
        }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15158);if ((((chLocal == 'n'
                && charAt(offset++) == 'u'
                && charAt(offset++) == 'l'
                && charAt(offset++) == 'l')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15159)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15160)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15161);matchStat = VALUE_NULL;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15162);value = 0;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15163);chLocal = charAt(offset++);

            __CLR4_1_10a8va8vluszvw9w.R.inc(15164);if ((((quote && chLocal == '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15165)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15166)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15167);chLocal = charAt(offset++);
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15168);for (;;) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15169);if ((((chLocal == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15170)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15171)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15172);bp = offset;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15173);this.ch = charAt(bp);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15174);matchStat = VALUE_NULL;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15175);token = JSONToken.COMMA;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15176);return value;
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15177);if ((((chLocal == ']')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15178)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15179)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15180);bp = offset;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15181);this.ch = charAt(bp);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15182);matchStat = VALUE_NULL;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15183);token = JSONToken.RBRACKET;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15184);return value;
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15185);if ((((isWhitespace(chLocal))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15186)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15187)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15188);chLocal = charAt(offset++);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15189);continue;
                }
                }}}__CLR4_1_10a8va8vluszvw9w.R.inc(15190);break;
            }
            }__CLR4_1_10a8va8vluszvw9w.R.inc(15191);matchStat = NOT_MATCH;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15192);return 0;
        } }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15193);matchStat = NOT_MATCH;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15194);return 0;
        }

        }}__CLR4_1_10a8va8vluszvw9w.R.inc(15195);for (;;) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15196);if ((((chLocal == seperator)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15197)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15198)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15199);bp = offset;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15200);this.ch = charAt(bp);
                __CLR4_1_10a8va8vluszvw9w.R.inc(15201);matchStat = VALUE;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15202);token = JSONToken.COMMA;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15203);return (((negative )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15204)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15205)==0&false))? -value : value;
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15206);if ((((isWhitespace(chLocal))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15207)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15208)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15209);chLocal = charAt(offset++);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15210);continue;
                }

                }__CLR4_1_10a8va8vluszvw9w.R.inc(15211);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15212);return value;
            }
        }}
    }}finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public java.util.Date scanDate(char seperator) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(15213);
        __CLR4_1_10a8va8vluszvw9w.R.inc(15214);matchStat = UNKNOWN;
        __CLR4_1_10a8va8vluszvw9w.R.inc(15215);int startPos = this.bp;
        __CLR4_1_10a8va8vluszvw9w.R.inc(15216);char startChar = this.ch;

        __CLR4_1_10a8va8vluszvw9w.R.inc(15217);int index = bp;

        __CLR4_1_10a8va8vluszvw9w.R.inc(15218);char ch = charAt(index++);

        __CLR4_1_10a8va8vluszvw9w.R.inc(15219);final java.util.Date dateVal;
        __CLR4_1_10a8va8vluszvw9w.R.inc(15220);if ((((ch == '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15221)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15222)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15223);int startIndex = index;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15224);int endIndex = indexOf('"', startIndex);
            __CLR4_1_10a8va8vluszvw9w.R.inc(15225);if ((((endIndex == -1)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15226)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15227)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15228);throw new JSONException("unclosed str");
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15229);int rest = endIndex - startIndex;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15230);bp = index;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15231);if ((((scanISO8601DateIfMatch(false, rest))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15232)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15233)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15234);dateVal = calendar.getTime();
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15235);bp = startPos;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15236);this.ch = startChar;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15237);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15238);return null;
            }
            }__CLR4_1_10a8va8vluszvw9w.R.inc(15239);ch = charAt(endIndex + 1);
            __CLR4_1_10a8va8vluszvw9w.R.inc(15240);bp = startPos;

            __CLR4_1_10a8va8vluszvw9w.R.inc(15241);for (; ; ) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15242);if ((((ch == ',' || ch == ']')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15243)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15244)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15245);bp = endIndex + 1;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15246);this.ch = ch;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15247);break;
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15248);if ((((isWhitespace(ch))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15249)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15250)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15251);endIndex++;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15252);ch = charAt(endIndex + 1);
                } }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15253);this.bp = startPos;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15254);this.ch = startChar;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15255);matchStat = NOT_MATCH;

                    __CLR4_1_10a8va8vluszvw9w.R.inc(15256);return null;
                }
            }}}
        }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15257);if ((((ch == '-' || (ch >= '0' && ch <= '9'))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15258)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15259)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15260);long millis = 0;

            __CLR4_1_10a8va8vluszvw9w.R.inc(15261);boolean negative = false;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15262);if ((((ch == '-')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15263)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15264)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15265);ch = charAt(index++);
                __CLR4_1_10a8va8vluszvw9w.R.inc(15266);negative = true;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15267);if ((((ch >= '0' && ch <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15268)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15269)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15270);millis = ch - '0';
                __CLR4_1_10a8va8vluszvw9w.R.inc(15271);for (; ; ) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15272);ch = charAt(index++);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15273);if ((((ch >= '0' && ch <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15274)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15275)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15276);millis = millis * 10 + (ch - '0');
                    } }else {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15277);if ((((ch == ',' || ch == ']')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15278)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15279)==0&false))) {{
                            __CLR4_1_10a8va8vluszvw9w.R.inc(15280);bp = index - 1;
                        }
                        }__CLR4_1_10a8va8vluszvw9w.R.inc(15281);break;
                    }
                }}
            }}

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15282);if ((((millis < 0)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15283)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15284)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15285);this.bp = startPos;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15286);this.ch = startChar;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15287);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15288);return null;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15289);if ((((negative)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15290)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15291)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15292);millis = -millis;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15293);dateVal = new java.util.Date(millis);
        } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15294);if ((((ch == 'n'
                && charAt(index++) == 'u'
                && charAt(index++) == 'l'
                && charAt(index++) == 'l')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15295)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15296)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15297);dateVal = null;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15298);ch = charAt(index);
            __CLR4_1_10a8va8vluszvw9w.R.inc(15299);bp = index;
        } }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15300);this.bp = startPos;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15301);this.ch = startChar;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15302);matchStat = NOT_MATCH;

            __CLR4_1_10a8va8vluszvw9w.R.inc(15303);return null;
        }

        }}}__CLR4_1_10a8va8vluszvw9w.R.inc(15304);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15305)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15306)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15307);this.ch = charAt(++bp);
            __CLR4_1_10a8va8vluszvw9w.R.inc(15308);matchStat = VALUE;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15309);return dateVal;
        } }else {{
            //condition ch == '}' is always 'true'
            __CLR4_1_10a8va8vluszvw9w.R.inc(15310);ch = charAt(++bp);
            __CLR4_1_10a8va8vluszvw9w.R.inc(15311);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15312)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15313)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15314);token = JSONToken.COMMA;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15315);this.ch = charAt(++bp);
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15316);if ((((ch == ']')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15317)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15318)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15319);token = JSONToken.RBRACKET;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15320);this.ch = charAt(++bp);
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15321);if ((((ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15322)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15323)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15324);token = JSONToken.RBRACE;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15325);this.ch = charAt(++bp);
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15326);if ((((ch == EOI)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15327)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15328)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15329);this.ch = EOI;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15330);token = JSONToken.EOF;
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15331);this.bp = startPos;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15332);this.ch = startChar;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15333);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15334);return null;
            }
            }}}}__CLR4_1_10a8va8vluszvw9w.R.inc(15335);matchStat = END;
        }
        }__CLR4_1_10a8va8vluszvw9w.R.inc(15336);return dateVal;
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    protected final void arrayCopy(int srcPos, char[] dest, int destPos, int length) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(15337);
        __CLR4_1_10a8va8vluszvw9w.R.inc(15338);text.getChars(srcPos, srcPos + length, dest, destPos);
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public String info() {try{__CLR4_1_10a8va8vluszvw9w.R.inc(15339);
        __CLR4_1_10a8va8vluszvw9w.R.inc(15340);StringBuilder buf = new StringBuilder();

//        buf.append("pos ").append(bp);
//        return "pos " + bp //
//                + ", json : " //
//                + (text.length() < 65536 //
//                ? text //
//                : text.substring(0, 65536));

        __CLR4_1_10a8va8vluszvw9w.R.inc(15341);int line = 1;
        __CLR4_1_10a8va8vluszvw9w.R.inc(15342);int column = 1;
        __CLR4_1_10a8va8vluszvw9w.R.inc(15343);for (int i = 0; (((i < bp)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15344)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15345)==0&false)); ++i, column++) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15346);char ch = text.charAt(i);
            __CLR4_1_10a8va8vluszvw9w.R.inc(15347);if ((((ch == '\n')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15348)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15349)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15350);column = 1;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15351);line++;
            }
        }}

        }__CLR4_1_10a8va8vluszvw9w.R.inc(15352);buf.append("pos ").append(bp)
                .append(", line ").append(line)
                .append(", column ").append(column);

        __CLR4_1_10a8va8vluszvw9w.R.inc(15353);if ((((text.length() < 65535)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15354)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15355)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15356);buf.append(text);
        } }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15357);buf.append(text.substring(0, 65535));
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(15358);return buf.toString();
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    // for hsf support
    public String[] scanFieldStringArray(char[] fieldName, int argTypesCount, SymbolTable typeSymbolTable) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(15359);
        __CLR4_1_10a8va8vluszvw9w.R.inc(15360);int startPos = bp;
        __CLR4_1_10a8va8vluszvw9w.R.inc(15361);char starChar = ch;

        __CLR4_1_10a8va8vluszvw9w.R.inc(15362);while ((((isWhitespace(ch))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15363)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15364)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15365);next();
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(15366);int offset;
        __CLR4_1_10a8va8vluszvw9w.R.inc(15367);char ch;
        __CLR4_1_10a8va8vluszvw9w.R.inc(15368);if ((((fieldName != null)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15369)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15370)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15371);matchStat = UNKNOWN;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15372);if ((((!charArrayCompare(fieldName))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15373)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15374)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15375);matchStat = NOT_MATCH_NAME;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15376);return null;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15377);offset = bp + fieldName.length;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15378);ch = text.charAt(offset++);
            __CLR4_1_10a8va8vluszvw9w.R.inc(15379);while ((((isWhitespace(ch))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15380)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15381)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15382);ch = text.charAt(offset++);
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15383);if ((((ch == ':')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15384)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15385)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15386);ch = text.charAt(offset++);
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15387);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15388);return null;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15389);while ((((isWhitespace(ch))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15390)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15391)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15392);ch = text.charAt(offset++);
            }
        }} }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15393);offset = bp + 1;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15394);ch = this.ch;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(15395);if ((((ch == '[')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15396)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15397)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15398);bp = offset;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15399);this.ch = text.charAt(bp);
        } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15400);if ((((ch == 'n' && text.startsWith("ull", bp + 1))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15401)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15402)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15403);bp += 4;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15404);this.ch = text.charAt(bp);
            __CLR4_1_10a8va8vluszvw9w.R.inc(15405);return null;
        } }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15406);matchStat = NOT_MATCH;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15407);return null;
        }

        }}__CLR4_1_10a8va8vluszvw9w.R.inc(15408);String[] types = (((argTypesCount >= 0 )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15409)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15410)==0&false))? new String[argTypesCount] : new String[4];
        __CLR4_1_10a8va8vluszvw9w.R.inc(15411);int typeIndex = 0;
        __CLR4_1_10a8va8vluszvw9w.R.inc(15412);for (;;) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15413);while ((((isWhitespace(this.ch))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15414)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15415)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15416);next();
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15417);if ((((this.ch != '\"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15418)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15419)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15420);this.bp = startPos;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15421);this.ch = starChar;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15422);matchStat = NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15423);return null;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15424);String type = scanSymbol(typeSymbolTable, '"');
            __CLR4_1_10a8va8vluszvw9w.R.inc(15425);if ((((typeIndex == types.length)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15426)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15427)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15428);int newCapacity = types.length + (types.length >> 1) + 1;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15429);String[] array = new String[newCapacity];
                __CLR4_1_10a8va8vluszvw9w.R.inc(15430);System.arraycopy(types, 0, array, 0, types.length);
                __CLR4_1_10a8va8vluszvw9w.R.inc(15431);types = array;
            }
            }__CLR4_1_10a8va8vluszvw9w.R.inc(15432);types[typeIndex++] = type;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15433);while ((((isWhitespace(this.ch))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15434)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15435)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15436);next();
            }
            }__CLR4_1_10a8va8vluszvw9w.R.inc(15437);if ((((this.ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15438)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15439)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15440);next();
                __CLR4_1_10a8va8vluszvw9w.R.inc(15441);continue;
            }
            }__CLR4_1_10a8va8vluszvw9w.R.inc(15442);break;
        }
        }__CLR4_1_10a8va8vluszvw9w.R.inc(15443);if ((((types.length != typeIndex)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15444)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15445)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15446);String[] array = new String[typeIndex];
            __CLR4_1_10a8va8vluszvw9w.R.inc(15447);System.arraycopy(types, 0, array, 0, typeIndex);
            __CLR4_1_10a8va8vluszvw9w.R.inc(15448);types = array;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(15449);while ((((isWhitespace(this.ch))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15450)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15451)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15452);next();
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(15453);if ((((this.ch == ']')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15454)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15455)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15456);next();
        } }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15457);this.bp = startPos;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15458);this.ch = starChar;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15459);matchStat = NOT_MATCH;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15460);return null;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(15461);return types;
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public boolean matchField2(char[] fieldName) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(15462);
        __CLR4_1_10a8va8vluszvw9w.R.inc(15463);while ((((isWhitespace(ch))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15464)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15465)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15466);next();
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(15467);if ((((!charArrayCompare(fieldName))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15468)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15469)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15470);matchStat = NOT_MATCH_NAME;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15471);return false;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(15472);int offset = bp + fieldName.length;
        __CLR4_1_10a8va8vluszvw9w.R.inc(15473);char ch = text.charAt(offset++);
        __CLR4_1_10a8va8vluszvw9w.R.inc(15474);while ((((isWhitespace(ch))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15475)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15476)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15477);ch = text.charAt(offset++);
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(15478);if ((((ch == ':')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15479)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15480)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15481);this.bp = offset;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15482);this.ch = charAt(bp);
            __CLR4_1_10a8va8vluszvw9w.R.inc(15483);return true;
        } }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15484);matchStat = NOT_MATCH_NAME;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15485);return false;
        }
    }}finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public final void skipObject() {try{__CLR4_1_10a8va8vluszvw9w.R.inc(15486);
        __CLR4_1_10a8va8vluszvw9w.R.inc(15487);skipObject(false);
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public final void skipObject(boolean valid) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(15488);
        __CLR4_1_10a8va8vluszvw9w.R.inc(15489);boolean quote = false;
        __CLR4_1_10a8va8vluszvw9w.R.inc(15490);int braceCnt = 0;
        __CLR4_1_10a8va8vluszvw9w.R.inc(15491);int i = bp;
        __CLR4_1_10a8va8vluszvw9w.R.inc(15492);for (; (((i < text.length())&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15493)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15494)==0&false)); ++i) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15495);final char ch = text.charAt(i);
            __CLR4_1_10a8va8vluszvw9w.R.inc(15496);if ((((ch == '\\')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15497)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15498)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15499);if ((((i < len - 1)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15500)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15501)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15502);++i;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15503);continue;
                } }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15504);this.ch = ch;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15505);this.bp = i;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15506);throw new JSONException("illegal str, " + info());
                }
            }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15507);if ((((ch == '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15508)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15509)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15510);quote = !quote;
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15511);if ((((ch == '{')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15512)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15513)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15514);if ((((quote)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15515)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15516)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15517);continue;
                }
                }__CLR4_1_10a8va8vluszvw9w.R.inc(15518);braceCnt++;
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15519);if ((((ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15520)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15521)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15522);if ((((quote)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15523)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15524)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15525);continue;
                } }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15526);braceCnt--;
                }
                }__CLR4_1_10a8va8vluszvw9w.R.inc(15527);if ((((braceCnt == -1)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15528)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15529)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15530);this.bp = i + 1;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15531);if ((((this.bp == text.length())&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15532)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15533)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15534);this.ch = EOI;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15535);this.token = JSONToken.EOF;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15536);return;
                    }
                    }__CLR4_1_10a8va8vluszvw9w.R.inc(15537);this.ch = text.charAt(this.bp);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15538);if ((((this.ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15539)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15540)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15541);token = JSONToken.COMMA;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15542);int index = ++bp;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15543);this.ch = ((((index >= text.length() //
                                )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15544)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15545)==0&false))? EOI //
                                : text.charAt(index));
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15546);return;
                    } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15547);if ((((this.ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15548)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15549)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15550);token = JSONToken.RBRACE;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15551);next();
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15552);return;
                    } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15553);if ((((this.ch == ']')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15554)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15555)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15556);token = JSONToken.RBRACKET;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15557);next();
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15558);return;
                    } }else {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15559);nextToken(JSONToken.COMMA);
                    }
                    }}}__CLR4_1_10a8va8vluszvw9w.R.inc(15560);return;
                }
            }}
        }}}}}

        }__CLR4_1_10a8va8vluszvw9w.R.inc(15561);if ((((i == text.length())&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15562)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15563)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15564);throw new JSONException("illegal str, " + info());
        }
    }}finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public final void skipArray() {try{__CLR4_1_10a8va8vluszvw9w.R.inc(15565);
        __CLR4_1_10a8va8vluszvw9w.R.inc(15566);skipArray(false);
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public final void skipArray(boolean valid) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(15567);
        __CLR4_1_10a8va8vluszvw9w.R.inc(15568);boolean quote = false;
        __CLR4_1_10a8va8vluszvw9w.R.inc(15569);int bracketCnt = 0;
        __CLR4_1_10a8va8vluszvw9w.R.inc(15570);int i = bp;
        __CLR4_1_10a8va8vluszvw9w.R.inc(15571);for (; (((i < text.length())&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15572)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15573)==0&false)); ++i) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15574);char ch = text.charAt(i);
            __CLR4_1_10a8va8vluszvw9w.R.inc(15575);if ((((ch == '\\')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15576)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15577)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15578);if ((((i < len - 1)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15579)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15580)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15581);++i;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15582);continue;
                } }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15583);this.ch = ch;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15584);this.bp = i;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15585);throw new JSONException("illegal str, " + info());
                }
            }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15586);if ((((ch == '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15587)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15588)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15589);quote = !quote;
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15590);if ((((ch == '[')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15591)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15592)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15593);if ((((quote)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15594)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15595)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15596);continue;
                }
                }__CLR4_1_10a8va8vluszvw9w.R.inc(15597);bracketCnt++;
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15598);if ((((ch == '{' && valid)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15599)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15600)==0&false))) {{
                {
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15601);int index = ++bp;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15602);this.ch = ((((index >= text.length() //
                            )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15603)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15604)==0&false))? EOI //
                            : text.charAt(index));
                }

                __CLR4_1_10a8va8vluszvw9w.R.inc(15605);skipObject(valid);
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15606);if ((((ch == ']')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15607)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15608)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15609);if ((((quote)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15610)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15611)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15612);continue;
                } }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15613);bracketCnt--;
                }
                }__CLR4_1_10a8va8vluszvw9w.R.inc(15614);if ((((bracketCnt == -1)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15615)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15616)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15617);this.bp = i + 1;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15618);if ((((this.bp == text.length())&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15619)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15620)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15621);this.ch = EOI;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15622);token = JSONToken.EOF;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15623);return;
                    }
                    }__CLR4_1_10a8va8vluszvw9w.R.inc(15624);this.ch = text.charAt(this.bp);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15625);nextToken(JSONToken.COMMA);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15626);return;
                }
            }}
        }}}}}}

        }__CLR4_1_10a8va8vluszvw9w.R.inc(15627);if ((((i == text.length())&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15628)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15629)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15630);throw new JSONException("illegal str, " + info());
        }
    }}finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public final void skipString() {try{__CLR4_1_10a8va8vluszvw9w.R.inc(15631);
        __CLR4_1_10a8va8vluszvw9w.R.inc(15632);if ((((ch == '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15633)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15634)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15635);for (int i = bp + 1; (((i < text.length())&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15636)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15637)==0&false)); ++i) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15638);char c = text.charAt(i);
                __CLR4_1_10a8va8vluszvw9w.R.inc(15639);if ((((c == '\\')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15640)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15641)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15642);if ((((i < len - 1)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15643)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15644)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15645);++i;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15646);continue;
                    }
                }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15647);if ((((c == '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15648)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15649)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15650);this.ch = text.charAt(bp = i + 1);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15651);return;
                }
            }}}
            }__CLR4_1_10a8va8vluszvw9w.R.inc(15652);throw new JSONException("unclosed str");
        } }else {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15653);throw new UnsupportedOperationException();
        }
    }}finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public boolean seekArrayToItem(int index) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(15654);
        __CLR4_1_10a8va8vluszvw9w.R.inc(15655);if ((((index < 0)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15656)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15657)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15658);throw new IllegalArgumentException("index must > 0, but " + index);
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(15659);if ((((token == JSONToken.EOF)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15660)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15661)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15662);return false;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(15663);if ((((token != JSONToken.LBRACKET)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15664)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15665)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15666);throw new UnsupportedOperationException();
        }
//        nextToken();

        }__CLR4_1_10a8va8vluszvw9w.R.inc(15667);for (int i = 0; (((i < index)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15668)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15669)==0&false)); ++i) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15670);skipWhitespace();
            __CLR4_1_10a8va8vluszvw9w.R.inc(15671);if ((((ch == '"' || ch == '\'')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15672)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15673)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15674);skipString();
                __CLR4_1_10a8va8vluszvw9w.R.inc(15675);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15676)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15677)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15678);next();
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15679);continue;
                } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15680);if ((((ch == ']')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15681)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15682)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15683);next();
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15684);nextToken(JSONToken.COMMA);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15685);return false;
                } }else {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15686);throw new JSONException("illegal json.");
                }
            }}} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15687);if ((((ch == '{')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15688)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15689)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15690);next();
                __CLR4_1_10a8va8vluszvw9w.R.inc(15691);token = JSONToken.LBRACE;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15692);skipObject(false);
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15693);if ((((ch == '[')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15694)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15695)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15696);next();
                __CLR4_1_10a8va8vluszvw9w.R.inc(15697);token = JSONToken.LBRACKET;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15698);skipArray(false);
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15699);boolean match = false;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15700);for (int j = bp + 1; (((j < text.length())&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15701)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15702)==0&false)); ++j) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15703);char c = text.charAt(j);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15704);if ((((c == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15705)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15706)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15707);match = true;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15708);bp = j + 1;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15709);ch = charAt(bp);
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15710);break;
                    } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15711);if ((((c == ']')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15712)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15713)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15714);bp = j + 1;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15715);ch = charAt(bp);
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15716);nextToken();
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15717);return false;
                    }
                }}}

                }__CLR4_1_10a8va8vluszvw9w.R.inc(15718);if ((((!match)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15719)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15720)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15721);throw new JSONException("illegal json.");
                }

                }__CLR4_1_10a8va8vluszvw9w.R.inc(15722);continue;
            }

            }}}__CLR4_1_10a8va8vluszvw9w.R.inc(15723);if ((((token == JSONToken.COMMA)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15724)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15725)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15726);continue;
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15727);if ((((token == JSONToken.RBRACKET)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15728)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15729)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15730);return false;
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15731);throw new UnsupportedOperationException();
            }

        }}}

        }__CLR4_1_10a8va8vluszvw9w.R.inc(15732);nextToken();
        __CLR4_1_10a8va8vluszvw9w.R.inc(15733);return true;
    }finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public int seekObjectToField(long fieldNameHash, boolean deepScan) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(15734);
        __CLR4_1_10a8va8vluszvw9w.R.inc(15735);if ((((token == JSONToken.EOF)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15736)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15737)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15738);return JSONLexer.NOT_MATCH;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(15739);if ((((token == JSONToken.RBRACE || token == JSONToken.RBRACKET)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15740)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15741)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15742);nextToken();
            __CLR4_1_10a8va8vluszvw9w.R.inc(15743);return JSONLexer.NOT_MATCH;
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(15744);if ((((token != JSONToken.LBRACE && token != JSONToken.COMMA)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15745)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15746)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15747);throw new UnsupportedOperationException(JSONToken.name(token));
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(15748);for (;;) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(15749);if ((((ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15750)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15751)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15752);next();
                __CLR4_1_10a8va8vluszvw9w.R.inc(15753);nextToken();
                __CLR4_1_10a8va8vluszvw9w.R.inc(15754);return JSONLexer.NOT_MATCH;
            }
            }__CLR4_1_10a8va8vluszvw9w.R.inc(15755);if ((((ch == EOI)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15756)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15757)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15758);return JSONLexer.NOT_MATCH;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15759);if ((((ch != '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15760)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15761)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15762);skipWhitespace();
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15763);long hash;
            __CLR4_1_10a8va8vluszvw9w.R.inc(15764);if ((((ch == '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15765)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15766)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15767);hash = 0xcbf29ce484222325L;

                __CLR4_1_10a8va8vluszvw9w.R.inc(15768);for (int i = bp + 1; (((i < text.length())&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15769)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15770)==0&false)); ++i) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15771);char c = text.charAt(i);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15772);if ((((c == '\\')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15773)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15774)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15775);++i;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15776);if ((((i == text.length())&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15777)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15778)==0&false))) {{
                            __CLR4_1_10a8va8vluszvw9w.R.inc(15779);throw new JSONException("unclosed str, " + info());
                        }
                        }__CLR4_1_10a8va8vluszvw9w.R.inc(15780);c = text.charAt(i);
                    }

                    }__CLR4_1_10a8va8vluszvw9w.R.inc(15781);if ((((c == '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15782)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15783)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15784);bp = i + 1;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15785);ch = ((((bp >= text.length() //
                                )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15786)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15787)==0&false))? EOI //
                                : text.charAt(bp));
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15788);break;
                    }

                    }__CLR4_1_10a8va8vluszvw9w.R.inc(15789);hash ^= c;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15790);hash *= 0x100000001b3L;
                }
            }} }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15791);throw new UnsupportedOperationException();
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15792);if ((((hash == fieldNameHash)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15793)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15794)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15795);if ((((ch != ':')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15796)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15797)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15798);skipWhitespace();
                }
                }__CLR4_1_10a8va8vluszvw9w.R.inc(15799);if ((((ch == ':')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15800)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15801)==0&false))) {{
                    {
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15802);int index = ++bp;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15803);ch = ((((index >= text.length() //
                                )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15804)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15805)==0&false))? EOI //
                                : text.charAt(index));
                    }
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15806);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15807)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15808)==0&false))) {{
                        {
                            __CLR4_1_10a8va8vluszvw9w.R.inc(15809);int index = ++bp;
                            __CLR4_1_10a8va8vluszvw9w.R.inc(15810);ch = ((((index >= text.length() //
                                    )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15811)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15812)==0&false))? EOI //
                                    : text.charAt(index));
                        }
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15813);token = JSONToken.COMMA;
                    } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15814);if ((((ch == ']')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15815)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15816)==0&false))) {{
                        {
                            __CLR4_1_10a8va8vluszvw9w.R.inc(15817);int index = ++bp;
                            __CLR4_1_10a8va8vluszvw9w.R.inc(15818);ch = ((((index >= text.length() //
                                    )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15819)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15820)==0&false))? EOI //
                                    : text.charAt(index));
                        }
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15821);token = JSONToken.RBRACKET;
                    } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15822);if ((((ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15823)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15824)==0&false))) {{
                        {
                            __CLR4_1_10a8va8vluszvw9w.R.inc(15825);int index = ++bp;
                            __CLR4_1_10a8va8vluszvw9w.R.inc(15826);ch = ((((index >= text.length() //
                                    )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15827)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15828)==0&false))? EOI //
                                    : text.charAt(index));
                        }
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15829);token = JSONToken.RBRACE;
                    } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15830);if ((((ch >= '0' && ch <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15831)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15832)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15833);sp = 0;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15834);pos = bp;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15835);scanNumber();
                    } }else {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15836);nextToken(JSONToken.LITERAL_INT);
                    }
                }}}}}
                }__CLR4_1_10a8va8vluszvw9w.R.inc(15837);return VALUE;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15838);if ((((ch != ':')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15839)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15840)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15841);skipWhitespace();
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15842);if ((((ch == ':')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15843)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15844)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15845);int index = ++bp;
                __CLR4_1_10a8va8vluszvw9w.R.inc(15846);ch = ((((index >= text.length() //
                        )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15847)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15848)==0&false))? EOI //
                        : text.charAt(index));
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15849);throw new JSONException("illegal json, " + info());
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(15850);if ((((ch != '"'
                    && ch != '\''
                    && ch != '{'
                    && ch != '['
                    && ch != '0'
                    && ch != '1'
                    && ch != '2'
                    && ch != '3'
                    && ch != '4'
                    && ch != '5'
                    && ch != '6'
                    && ch != '7'
                    && ch != '8'
                    && ch != '9'
                    && ch != '+'
                    && ch != '-')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15851)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15852)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15853);skipWhitespace();
            }

            // skip fieldValues
            }__CLR4_1_10a8va8vluszvw9w.R.inc(15854);if ((((ch == '-' || ch == '+' || (ch >= '0' && ch <= '9'))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15855)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15856)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15857);next();
                __CLR4_1_10a8va8vluszvw9w.R.inc(15858);while ((((ch >= '0' && ch <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15859)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15860)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15861);next();
                }

                // scale
                }__CLR4_1_10a8va8vluszvw9w.R.inc(15862);if ((((ch == '.')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15863)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15864)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15865);next();
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15866);while ((((ch >= '0' && ch <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15867)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15868)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15869);next();
                    }
                }}

                // exp
                }__CLR4_1_10a8va8vluszvw9w.R.inc(15870);if ((((ch == 'E' || ch == 'e')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15871)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15872)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15873);next();
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15874);if ((((ch == '-' || ch == '+')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15875)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15876)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15877);next();
                    }
                    }__CLR4_1_10a8va8vluszvw9w.R.inc(15878);while ((((ch >= '0' && ch <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15879)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15880)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15881);next();
                    }
                }}

                }__CLR4_1_10a8va8vluszvw9w.R.inc(15882);if ((((ch != ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15883)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15884)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15885);skipWhitespace();
                }
                }__CLR4_1_10a8va8vluszvw9w.R.inc(15886);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15887)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15888)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15889);next();
                }
            }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15890);if ((((ch == '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15891)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15892)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15893);skipString();

                __CLR4_1_10a8va8vluszvw9w.R.inc(15894);if ((((ch != ',' && ch != '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15895)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15896)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15897);skipWhitespace();
                }

                }__CLR4_1_10a8va8vluszvw9w.R.inc(15898);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15899)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15900)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15901);next();
                }
            }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15902);if ((((ch == 't')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15903)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15904)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15905);next();
                __CLR4_1_10a8va8vluszvw9w.R.inc(15906);if ((((ch == 'r')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15907)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15908)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15909);next();
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15910);if ((((ch == 'u')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15911)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15912)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15913);next();
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15914);if ((((ch == 'e')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15915)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15916)==0&false))) {{
                            __CLR4_1_10a8va8vluszvw9w.R.inc(15917);next();
                        }
                    }}
                }}

                }__CLR4_1_10a8va8vluszvw9w.R.inc(15918);if ((((ch != ',' && ch != '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15919)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15920)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15921);skipWhitespace();
                }

                }__CLR4_1_10a8va8vluszvw9w.R.inc(15922);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15923)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15924)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15925);next();
                }
            }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15926);if ((((ch == 'n')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15927)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15928)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15929);next();
                __CLR4_1_10a8va8vluszvw9w.R.inc(15930);if ((((ch == 'u')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15931)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15932)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15933);next();
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15934);if ((((ch == 'l')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15935)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15936)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15937);next();
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15938);if ((((ch == 'l')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15939)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15940)==0&false))) {{
                            __CLR4_1_10a8va8vluszvw9w.R.inc(15941);next();
                        }
                    }}
                }}

                }__CLR4_1_10a8va8vluszvw9w.R.inc(15942);if ((((ch != ',' && ch != '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15943)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15944)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15945);skipWhitespace();
                }

                }__CLR4_1_10a8va8vluszvw9w.R.inc(15946);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15947)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15948)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15949);next();
                }
            }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15950);if ((((ch == 'f')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15951)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15952)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15953);next();
                __CLR4_1_10a8va8vluszvw9w.R.inc(15954);if ((((ch == 'a')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15955)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15956)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15957);next();
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15958);if ((((ch == 'l')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15959)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15960)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15961);next();
                        __CLR4_1_10a8va8vluszvw9w.R.inc(15962);if ((((ch == 's')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15963)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15964)==0&false))) {{
                            __CLR4_1_10a8va8vluszvw9w.R.inc(15965);next();
                            __CLR4_1_10a8va8vluszvw9w.R.inc(15966);if ((((ch == 'e')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15967)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15968)==0&false))) {{
                                __CLR4_1_10a8va8vluszvw9w.R.inc(15969);next();
                            }
                        }}
                    }}
                }}

                }__CLR4_1_10a8va8vluszvw9w.R.inc(15970);if ((((ch != ',' && ch != '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15971)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15972)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15973);skipWhitespace();
                }

                }__CLR4_1_10a8va8vluszvw9w.R.inc(15974);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15975)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15976)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15977);next();
                }
            }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15978);if ((((ch == '{')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15979)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15980)==0&false))) {{
                {
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15981);int index = ++bp;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15982);ch = ((((index >= text.length() //
                            )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15983)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15984)==0&false))? EOI //
                            : text.charAt(index));
                }
                __CLR4_1_10a8va8vluszvw9w.R.inc(15985);if ((((deepScan)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15986)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15987)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15988);token = JSONToken.LBRACE;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15989);return OBJECT;
                }

                }__CLR4_1_10a8va8vluszvw9w.R.inc(15990);skipObject(false);
                __CLR4_1_10a8va8vluszvw9w.R.inc(15991);if ((((token == JSONToken.RBRACE)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15992)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15993)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(15994);return JSONLexer.NOT_MATCH;
                }
            }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(15995);if ((((ch == '[')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(15996)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(15997)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(15998);next();
                __CLR4_1_10a8va8vluszvw9w.R.inc(15999);if ((((deepScan)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16000)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16001)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(16002);token = JSONToken.LBRACKET;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(16003);return ARRAY;
                }
                }__CLR4_1_10a8va8vluszvw9w.R.inc(16004);skipArray(false);
                __CLR4_1_10a8va8vluszvw9w.R.inc(16005);if ((((token == JSONToken.RBRACE)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16006)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16007)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(16008);return JSONLexer.NOT_MATCH;
                }
            }} }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(16009);throw new UnsupportedOperationException();
            }
        }}}}}}}}
    }}finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}

    public int seekObjectToField(long[] fieldNameHash) {try{__CLR4_1_10a8va8vluszvw9w.R.inc(16010);
        __CLR4_1_10a8va8vluszvw9w.R.inc(16011);if ((((token != JSONToken.LBRACE && token != JSONToken.COMMA)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16012)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16013)==0&false))) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(16014);throw new UnsupportedOperationException();
        }

        }__CLR4_1_10a8va8vluszvw9w.R.inc(16015);for (;;) {{
            __CLR4_1_10a8va8vluszvw9w.R.inc(16016);if ((((ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16017)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16018)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(16019);next();
                __CLR4_1_10a8va8vluszvw9w.R.inc(16020);nextToken();
                __CLR4_1_10a8va8vluszvw9w.R.inc(16021);this.matchStat = JSONLexer.NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(16022);return -1;
            }
            }__CLR4_1_10a8va8vluszvw9w.R.inc(16023);if ((((ch == EOI)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16024)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16025)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(16026);this.matchStat = JSONLexer.NOT_MATCH;
                __CLR4_1_10a8va8vluszvw9w.R.inc(16027);return -1;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(16028);if ((((ch != '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16029)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16030)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(16031);skipWhitespace();
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(16032);long hash;
            __CLR4_1_10a8va8vluszvw9w.R.inc(16033);if ((((ch == '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16034)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16035)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(16036);hash = 0xcbf29ce484222325L;

                __CLR4_1_10a8va8vluszvw9w.R.inc(16037);for (int i = bp + 1; (((i < text.length())&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16038)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16039)==0&false)); ++i) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(16040);char c = text.charAt(i);
                    __CLR4_1_10a8va8vluszvw9w.R.inc(16041);if ((((c == '\\')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16042)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16043)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(16044);++i;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(16045);if ((((i == text.length())&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16046)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16047)==0&false))) {{
                            __CLR4_1_10a8va8vluszvw9w.R.inc(16048);throw new JSONException("unclosed str, " + info());
                        }
                        }__CLR4_1_10a8va8vluszvw9w.R.inc(16049);c = text.charAt(i);
                    }

                    }__CLR4_1_10a8va8vluszvw9w.R.inc(16050);if ((((c == '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16051)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16052)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(16053);bp = i + 1;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(16054);ch = ((((bp >= text.length() //
                                )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16055)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16056)==0&false))? EOI //
                                : text.charAt(bp));
                        __CLR4_1_10a8va8vluszvw9w.R.inc(16057);break;
                    }

                    }__CLR4_1_10a8va8vluszvw9w.R.inc(16058);hash ^= c;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(16059);hash *= 0x100000001b3L;
                }
            }} }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(16060);throw new UnsupportedOperationException();
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(16061);int matchIndex = -1;
            __CLR4_1_10a8va8vluszvw9w.R.inc(16062);for (int i = 0; (((i < fieldNameHash.length)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16063)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16064)==0&false)); i++) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(16065);if ((((hash == fieldNameHash[i])&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16066)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16067)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(16068);matchIndex = i;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(16069);break;
                }
            }}

            }__CLR4_1_10a8va8vluszvw9w.R.inc(16070);if ((((matchIndex != -1)&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16071)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16072)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(16073);if ((((ch != ':')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16074)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16075)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(16076);skipWhitespace();
                }
                }__CLR4_1_10a8va8vluszvw9w.R.inc(16077);if ((((ch == ':')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16078)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16079)==0&false))) {{
                    {
                        __CLR4_1_10a8va8vluszvw9w.R.inc(16080);int index = ++bp;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(16081);ch = ((((index >= text.length() //
                                )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16082)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16083)==0&false))? EOI //
                                : text.charAt(index));
                    }
                    __CLR4_1_10a8va8vluszvw9w.R.inc(16084);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16085)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16086)==0&false))) {{
                        {
                            __CLR4_1_10a8va8vluszvw9w.R.inc(16087);int index = ++bp;
                            __CLR4_1_10a8va8vluszvw9w.R.inc(16088);ch = ((((index >= text.length() //
                                    )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16089)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16090)==0&false))? EOI //
                                    : text.charAt(index));
                        }
                        __CLR4_1_10a8va8vluszvw9w.R.inc(16091);token = JSONToken.COMMA;
                    } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(16092);if ((((ch == ']')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16093)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16094)==0&false))) {{
                        {
                            __CLR4_1_10a8va8vluszvw9w.R.inc(16095);int index = ++bp;
                            __CLR4_1_10a8va8vluszvw9w.R.inc(16096);ch = ((((index >= text.length() //
                                    )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16097)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16098)==0&false))? EOI //
                                    : text.charAt(index));
                        }
                        __CLR4_1_10a8va8vluszvw9w.R.inc(16099);token = JSONToken.RBRACKET;
                    } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(16100);if ((((ch == '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16101)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16102)==0&false))) {{
                        {
                            __CLR4_1_10a8va8vluszvw9w.R.inc(16103);int index = ++bp;
                            __CLR4_1_10a8va8vluszvw9w.R.inc(16104);ch = ((((index >= text.length() //
                                    )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16105)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16106)==0&false))? EOI //
                                    : text.charAt(index));
                        }
                        __CLR4_1_10a8va8vluszvw9w.R.inc(16107);token = JSONToken.RBRACE;
                    } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(16108);if ((((ch >= '0' && ch <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16109)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16110)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(16111);sp = 0;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(16112);pos = bp;
                        __CLR4_1_10a8va8vluszvw9w.R.inc(16113);scanNumber();
                    } }else {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(16114);nextToken(JSONToken.LITERAL_INT);
                    }
                }}}}}

                }__CLR4_1_10a8va8vluszvw9w.R.inc(16115);matchStat = VALUE;
                __CLR4_1_10a8va8vluszvw9w.R.inc(16116);return matchIndex;
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(16117);if ((((ch != ':')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16118)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16119)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(16120);skipWhitespace();
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(16121);if ((((ch == ':')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16122)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16123)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(16124);int index = ++bp;
                __CLR4_1_10a8va8vluszvw9w.R.inc(16125);ch = ((((index >= text.length() //
                        )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16126)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16127)==0&false))? EOI //
                        : text.charAt(index));
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(16128);throw new JSONException("illegal json, " + info());
            }

            }__CLR4_1_10a8va8vluszvw9w.R.inc(16129);if ((((ch != '"'
                    && ch != '\''
                    && ch != '{'
                    && ch != '['
                    && ch != '0'
                    && ch != '1'
                    && ch != '2'
                    && ch != '3'
                    && ch != '4'
                    && ch != '5'
                    && ch != '6'
                    && ch != '7'
                    && ch != '8'
                    && ch != '9'
                    && ch != '+'
                    && ch != '-')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16130)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16131)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(16132);skipWhitespace();
            }

            // skip fieldValues
            }__CLR4_1_10a8va8vluszvw9w.R.inc(16133);if ((((ch == '-' || ch == '+' || (ch >= '0' && ch <= '9'))&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16134)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16135)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(16136);next();
                __CLR4_1_10a8va8vluszvw9w.R.inc(16137);while ((((ch >= '0' && ch <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16138)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16139)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(16140);next();
                }

                // scale
                }__CLR4_1_10a8va8vluszvw9w.R.inc(16141);if ((((ch == '.')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16142)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16143)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(16144);next();
                    __CLR4_1_10a8va8vluszvw9w.R.inc(16145);while ((((ch >= '0' && ch <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16146)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16147)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(16148);next();
                    }
                }}

                // exp
                }__CLR4_1_10a8va8vluszvw9w.R.inc(16149);if ((((ch == 'E' || ch == 'e')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16150)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16151)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(16152);next();
                    __CLR4_1_10a8va8vluszvw9w.R.inc(16153);if ((((ch == '-' || ch == '+')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16154)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16155)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(16156);next();
                    }
                    }__CLR4_1_10a8va8vluszvw9w.R.inc(16157);while ((((ch >= '0' && ch <= '9')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16158)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16159)==0&false))) {{
                        __CLR4_1_10a8va8vluszvw9w.R.inc(16160);next();
                    }
                }}

                }__CLR4_1_10a8va8vluszvw9w.R.inc(16161);if ((((ch != ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16162)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16163)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(16164);skipWhitespace();
                }
                }__CLR4_1_10a8va8vluszvw9w.R.inc(16165);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16166)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16167)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(16168);next();
                }
            }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(16169);if ((((ch == '"')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16170)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16171)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(16172);skipString();

                __CLR4_1_10a8va8vluszvw9w.R.inc(16173);if ((((ch != ',' && ch != '}')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16174)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16175)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(16176);skipWhitespace();
                }

                }__CLR4_1_10a8va8vluszvw9w.R.inc(16177);if ((((ch == ',')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16178)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16179)==0&false))) {{
                    __CLR4_1_10a8va8vluszvw9w.R.inc(16180);next();
                }
            }} }else {__CLR4_1_10a8va8vluszvw9w.R.inc(16181);if ((((ch == '{')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16182)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16183)==0&false))) {{
                {
                    __CLR4_1_10a8va8vluszvw9w.R.inc(16184);int index = ++bp;
                    __CLR4_1_10a8va8vluszvw9w.R.inc(16185);ch = ((((index >= text.length() //
                            )&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16186)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16187)==0&false))? EOI //
                            : text.charAt(index));
                }

                __CLR4_1_10a8va8vluszvw9w.R.inc(16188);skipObject(false);
            } }else {__CLR4_1_10a8va8vluszvw9w.R.inc(16189);if ((((ch == '[')&&(__CLR4_1_10a8va8vluszvw9w.R.iget(16190)!=0|true))||(__CLR4_1_10a8va8vluszvw9w.R.iget(16191)==0&false))) {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(16192);next();

                __CLR4_1_10a8va8vluszvw9w.R.inc(16193);skipArray(false);
            } }else {{
                __CLR4_1_10a8va8vluszvw9w.R.inc(16194);throw new UnsupportedOperationException();
            }
        }}}}}
    }}finally{__CLR4_1_10a8va8vluszvw9w.R.flushNeeded();}}
}
