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

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.util.IOUtils;

//\u8fd9\u4e2a\u7c7b\uff0c\u4e3a\u4e86\u6027\u80fd\u4f18\u5316\u505a\u4e86\u5f88\u591a\u7279\u522b\u5904\u7406\uff0c\u4e00\u5207\u90fd\u662f\u4e3a\u4e86\u6027\u80fd\uff01\uff01\uff01

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public final class JSONReaderScanner extends JSONLexerBase {public static class __CLR4_1_10a2ca2cluszvvy2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,13279,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final static ThreadLocal<char[]> BUF_LOCAL = new ThreadLocal<char[]>();

    private Reader                           reader;
    private char[]                           buf;
    private int                              bufLength;

    public JSONReaderScanner(String input){
        this(input, JSON.DEFAULT_PARSER_FEATURE);__CLR4_1_10a2ca2cluszvvy2.R.inc(13045);try{__CLR4_1_10a2ca2cluszvvy2.R.inc(13044);
    }finally{__CLR4_1_10a2ca2cluszvvy2.R.flushNeeded();}}

    public JSONReaderScanner(String input, int features){
        this(new StringReader(input), features);__CLR4_1_10a2ca2cluszvvy2.R.inc(13047);try{__CLR4_1_10a2ca2cluszvvy2.R.inc(13046);
    }finally{__CLR4_1_10a2ca2cluszvvy2.R.flushNeeded();}}

    public JSONReaderScanner(char[] input, int inputLength){
        this(input, inputLength, JSON.DEFAULT_PARSER_FEATURE);__CLR4_1_10a2ca2cluszvvy2.R.inc(13049);try{__CLR4_1_10a2ca2cluszvvy2.R.inc(13048);
    }finally{__CLR4_1_10a2ca2cluszvvy2.R.flushNeeded();}}

    public JSONReaderScanner(Reader reader){
        this(reader, JSON.DEFAULT_PARSER_FEATURE);__CLR4_1_10a2ca2cluszvvy2.R.inc(13051);try{__CLR4_1_10a2ca2cluszvvy2.R.inc(13050);
    }finally{__CLR4_1_10a2ca2cluszvvy2.R.flushNeeded();}}

    public JSONReaderScanner(Reader reader, int features){
        super(features);__CLR4_1_10a2ca2cluszvvy2.R.inc(13053);try{__CLR4_1_10a2ca2cluszvvy2.R.inc(13052);
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13054);this.reader = reader;

        __CLR4_1_10a2ca2cluszvvy2.R.inc(13055);buf = BUF_LOCAL.get();
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13056);if ((((buf != null)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13057)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13058)==0&false))) {{
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13059);BUF_LOCAL.set(null);
        }

        }__CLR4_1_10a2ca2cluszvvy2.R.inc(13060);if ((((buf == null)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13061)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13062)==0&false))) {{
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13063);buf = new char[1024 * 16];
        }

        }__CLR4_1_10a2ca2cluszvvy2.R.inc(13064);try {
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13065);bufLength = reader.read(buf);
        } catch (IOException e) {
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13066);throw new JSONException(e.getMessage(), e);
        }

        __CLR4_1_10a2ca2cluszvvy2.R.inc(13067);bp = -1;

        __CLR4_1_10a2ca2cluszvvy2.R.inc(13068);next();
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13069);if ((((ch == 65279)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13070)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13071)==0&false))) {{ // utf8 bom
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13072);next();
        }
    }}finally{__CLR4_1_10a2ca2cluszvvy2.R.flushNeeded();}}

    public JSONReaderScanner(char[] input, int inputLength, int features){
        this(new CharArrayReader(input, 0, inputLength), features);__CLR4_1_10a2ca2cluszvvy2.R.inc(13074);try{__CLR4_1_10a2ca2cluszvvy2.R.inc(13073);
    }finally{__CLR4_1_10a2ca2cluszvvy2.R.flushNeeded();}}

    public final char charAt(int index) {try{__CLR4_1_10a2ca2cluszvvy2.R.inc(13075);
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13076);if ((((index >= bufLength)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13077)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13078)==0&false))) {{
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13079);if ((((bufLength == -1)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13080)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13081)==0&false))) {{
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13082);if ((((index < sp)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13083)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13084)==0&false))) {{
                    __CLR4_1_10a2ca2cluszvvy2.R.inc(13085);return buf[index];
                }
                }__CLR4_1_10a2ca2cluszvvy2.R.inc(13086);return EOI;
            }

            }__CLR4_1_10a2ca2cluszvvy2.R.inc(13087);if ((((bp == 0)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13088)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13089)==0&false))) {{
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13090);char[] buf = new char[(this.buf.length * 3) / 2];
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13091);System.arraycopy(this.buf, bp, buf, 0, bufLength);

                __CLR4_1_10a2ca2cluszvvy2.R.inc(13092);int rest = buf.length - bufLength;
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13093);try {
                    __CLR4_1_10a2ca2cluszvvy2.R.inc(13094);int len = reader.read(buf, bufLength, rest);
                    __CLR4_1_10a2ca2cluszvvy2.R.inc(13095);bufLength += len;
                    __CLR4_1_10a2ca2cluszvvy2.R.inc(13096);this.buf = buf;
                } catch (IOException e) {
                    __CLR4_1_10a2ca2cluszvvy2.R.inc(13097);throw new JSONException(e.getMessage(), e);
                }
            } }else {{
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13098);int rest = bufLength - bp;
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13099);if ((((rest > 0)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13100)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13101)==0&false))) {{
                    __CLR4_1_10a2ca2cluszvvy2.R.inc(13102);System.arraycopy(buf, bp, buf, 0, rest);
                }

                }__CLR4_1_10a2ca2cluszvvy2.R.inc(13103);try {
                    __CLR4_1_10a2ca2cluszvvy2.R.inc(13104);bufLength = reader.read(buf, rest, buf.length - rest);
                } catch (IOException e) {
                    __CLR4_1_10a2ca2cluszvvy2.R.inc(13105);throw new JSONException(e.getMessage(), e);
                }

                __CLR4_1_10a2ca2cluszvvy2.R.inc(13106);if ((((bufLength == 0)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13107)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13108)==0&false))) {{
                    __CLR4_1_10a2ca2cluszvvy2.R.inc(13109);throw new JSONException("illegal state, textLength is zero");
                }

                }__CLR4_1_10a2ca2cluszvvy2.R.inc(13110);if ((((bufLength == -1)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13111)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13112)==0&false))) {{
                    __CLR4_1_10a2ca2cluszvvy2.R.inc(13113);return EOI;
                }

                }__CLR4_1_10a2ca2cluszvvy2.R.inc(13114);bufLength += rest;
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13115);index -= bp;
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13116);np -= bp;
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13117);bp = 0;
            }
        }}

        }__CLR4_1_10a2ca2cluszvvy2.R.inc(13118);return buf[index];
    }finally{__CLR4_1_10a2ca2cluszvvy2.R.flushNeeded();}}

    public final int indexOf(char ch, int startIndex) {try{__CLR4_1_10a2ca2cluszvvy2.R.inc(13119);
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13120);int offset = startIndex - bp;
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13121);for (;; ++offset) {{
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13122);final int index = bp + offset;
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13123);char chLoal = charAt(index);
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13124);if ((((ch == chLoal)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13125)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13126)==0&false))) {{
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13127);return offset + bp;
            }
            }__CLR4_1_10a2ca2cluszvvy2.R.inc(13128);if ((((chLoal == EOI)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13129)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13130)==0&false))) {{
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13131);return -1;
            }
        }}
    }}finally{__CLR4_1_10a2ca2cluszvvy2.R.flushNeeded();}}

    public final String addSymbol(int offset, int len, int hash, final SymbolTable symbolTable) {try{__CLR4_1_10a2ca2cluszvvy2.R.inc(13132);
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13133);return symbolTable.addSymbol(buf, offset, len, hash);
    }finally{__CLR4_1_10a2ca2cluszvvy2.R.flushNeeded();}}

    public final char next() {try{__CLR4_1_10a2ca2cluszvvy2.R.inc(13134);
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13135);int index = ++bp;

        __CLR4_1_10a2ca2cluszvvy2.R.inc(13136);if ((((index >= bufLength)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13137)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13138)==0&false))) {{
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13139);if ((((bufLength == -1)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13140)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13141)==0&false))) {{
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13142);return EOI;
            }

            }__CLR4_1_10a2ca2cluszvvy2.R.inc(13143);if ((((sp > 0)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13144)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13145)==0&false))) {{
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13146);int offset;
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13147);offset = bufLength - sp;
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13148);if ((((ch == '"' && offset > 0)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13149)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13150)==0&false))) {{
                    __CLR4_1_10a2ca2cluszvvy2.R.inc(13151);offset--;
                }
                }__CLR4_1_10a2ca2cluszvvy2.R.inc(13152);System.arraycopy(buf, offset, buf, 0, sp);
            }
            }__CLR4_1_10a2ca2cluszvvy2.R.inc(13153);np = -1;

            __CLR4_1_10a2ca2cluszvvy2.R.inc(13154);index = bp = sp;

            __CLR4_1_10a2ca2cluszvvy2.R.inc(13155);try {
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13156);int startPos = bp;
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13157);int readLength = buf.length - startPos;
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13158);if ((((readLength == 0)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13159)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13160)==0&false))) {{
                    __CLR4_1_10a2ca2cluszvvy2.R.inc(13161);char[] newBuf = new char[buf.length * 2];
                    __CLR4_1_10a2ca2cluszvvy2.R.inc(13162);System.arraycopy(buf, 0, newBuf, 0, buf.length);
                    __CLR4_1_10a2ca2cluszvvy2.R.inc(13163);buf = newBuf;
                    __CLR4_1_10a2ca2cluszvvy2.R.inc(13164);readLength = buf.length - startPos;
                }
                }__CLR4_1_10a2ca2cluszvvy2.R.inc(13165);bufLength = reader.read(buf, bp, readLength);
            } catch (IOException e) {
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13166);throw new JSONException(e.getMessage(), e);
            }

            __CLR4_1_10a2ca2cluszvvy2.R.inc(13167);if ((((bufLength == 0)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13168)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13169)==0&false))) {{
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13170);throw new JSONException("illegal stat, textLength is zero");
            }

            }__CLR4_1_10a2ca2cluszvvy2.R.inc(13171);if ((((bufLength == -1)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13172)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13173)==0&false))) {{
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13174);return ch = EOI;
            }

            }__CLR4_1_10a2ca2cluszvvy2.R.inc(13175);bufLength += bp;
        }

        }__CLR4_1_10a2ca2cluszvvy2.R.inc(13176);return ch = buf[index];
    }finally{__CLR4_1_10a2ca2cluszvvy2.R.flushNeeded();}}

    protected final void copyTo(int offset, int count, char[] dest) {try{__CLR4_1_10a2ca2cluszvvy2.R.inc(13177);
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13178);System.arraycopy(buf, offset, dest, 0, count);
    }finally{__CLR4_1_10a2ca2cluszvvy2.R.flushNeeded();}}

    public final boolean charArrayCompare(char[] chars) {try{__CLR4_1_10a2ca2cluszvvy2.R.inc(13179);
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13180);for (int i = 0; (((i < chars.length)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13181)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13182)==0&false)); ++i) {{
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13183);if ((((charAt(bp + i) != chars[i])&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13184)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13185)==0&false))) {{
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13186);return false;
            }
        }}

        }__CLR4_1_10a2ca2cluszvvy2.R.inc(13187);return true;
    }finally{__CLR4_1_10a2ca2cluszvvy2.R.flushNeeded();}}

    public byte[] bytesValue() {try{__CLR4_1_10a2ca2cluszvvy2.R.inc(13188);
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13189);if ((((token == JSONToken.HEX)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13190)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13191)==0&false))) {{
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13192);throw new JSONException("TODO");
        }

        }__CLR4_1_10a2ca2cluszvvy2.R.inc(13193);return IOUtils.decodeBase64(buf, np + 1, sp);
    }finally{__CLR4_1_10a2ca2cluszvvy2.R.flushNeeded();}}

    protected final void arrayCopy(int srcPos, char[] dest, int destPos, int length) {try{__CLR4_1_10a2ca2cluszvvy2.R.inc(13194);
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13195);System.arraycopy(buf, srcPos, dest, destPos, length);
    }finally{__CLR4_1_10a2ca2cluszvvy2.R.flushNeeded();}}

    /**
     * The value of a literal token, recorded as a string. For integers, leading 0x and 'l' suffixes are suppressed.
     */
    public final String stringVal() {try{__CLR4_1_10a2ca2cluszvvy2.R.inc(13196);
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13197);if ((((!hasSpecial)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13198)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13199)==0&false))) {{
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13200);int offset = np + 1;
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13201);if ((((offset < 0)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13202)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13203)==0&false))) {{
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13204);throw new IllegalStateException();
            }
            }__CLR4_1_10a2ca2cluszvvy2.R.inc(13205);if ((((offset > buf.length - sp)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13206)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13207)==0&false))) {{
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13208);throw new IllegalStateException();
            }
            }__CLR4_1_10a2ca2cluszvvy2.R.inc(13209);return new String(buf, offset, sp);
            // return text.substring(np + 1, np + 1 + sp);
        } }else {{
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13210);return new String(sbuf, 0, sp);
        }
    }}finally{__CLR4_1_10a2ca2cluszvvy2.R.flushNeeded();}}

    public final String subString(int offset, int count) {try{__CLR4_1_10a2ca2cluszvvy2.R.inc(13211);
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13212);if ((((count < 0)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13213)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13214)==0&false))) {{
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13215);throw new StringIndexOutOfBoundsException(count);
        }
        }__CLR4_1_10a2ca2cluszvvy2.R.inc(13216);return new String(buf, offset, count);
        // return text.substring(offset, offset + count);
    }finally{__CLR4_1_10a2ca2cluszvvy2.R.flushNeeded();}}

    public final char[] sub_chars(int offset, int count) {try{__CLR4_1_10a2ca2cluszvvy2.R.inc(13217);
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13218);if ((((count < 0)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13219)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13220)==0&false))) {{
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13221);throw new StringIndexOutOfBoundsException(count);
        }
        
        }__CLR4_1_10a2ca2cluszvvy2.R.inc(13222);if ((((offset == 0)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13223)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13224)==0&false))) {{
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13225);return buf;
        }
        }__CLR4_1_10a2ca2cluszvvy2.R.inc(13226);char[] chars = new char[count];
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13227);System.arraycopy(buf, offset, chars, 0, count);
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13228);return chars;
    }finally{__CLR4_1_10a2ca2cluszvvy2.R.flushNeeded();}}

    public final String numberString() {try{__CLR4_1_10a2ca2cluszvvy2.R.inc(13229);
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13230);int offset = np;
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13231);if ((((offset == -1)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13232)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13233)==0&false))) {{
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13234);offset = 0;
        }
        }__CLR4_1_10a2ca2cluszvvy2.R.inc(13235);char chLocal = charAt(offset + sp - 1);

        __CLR4_1_10a2ca2cluszvvy2.R.inc(13236);int sp = this.sp;
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13237);if ((((chLocal == 'L' || chLocal == 'S' || chLocal == 'B' || chLocal == 'F' || chLocal == 'D')&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13238)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13239)==0&false))) {{
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13240);sp--;
        }

        }__CLR4_1_10a2ca2cluszvvy2.R.inc(13241);String value = new String(buf, offset, sp);
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13242);return value;
    }finally{__CLR4_1_10a2ca2cluszvvy2.R.flushNeeded();}}

    public final BigDecimal decimalValue() {try{__CLR4_1_10a2ca2cluszvvy2.R.inc(13243);
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13244);int offset = np;
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13245);if ((((offset == -1)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13246)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13247)==0&false))) {{
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13248);offset = 0;
        }
        }__CLR4_1_10a2ca2cluszvvy2.R.inc(13249);char chLocal = charAt(offset + sp - 1);

        __CLR4_1_10a2ca2cluszvvy2.R.inc(13250);int sp = this.sp;
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13251);if ((((chLocal == 'L' || chLocal == 'S' || chLocal == 'B' || chLocal == 'F' || chLocal == 'D')&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13252)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13253)==0&false))) {{
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13254);sp--;
        }

        }__CLR4_1_10a2ca2cluszvvy2.R.inc(13255);return new BigDecimal(buf, offset, sp);
    }finally{__CLR4_1_10a2ca2cluszvvy2.R.flushNeeded();}}

    public void close() {try{__CLR4_1_10a2ca2cluszvvy2.R.inc(13256);
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13257);super.close();

        __CLR4_1_10a2ca2cluszvvy2.R.inc(13258);if ((((buf.length <= 1024 * 64)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13259)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13260)==0&false))) {{
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13261);BUF_LOCAL.set(buf);
        }
        }__CLR4_1_10a2ca2cluszvvy2.R.inc(13262);this.buf = null;

        __CLR4_1_10a2ca2cluszvvy2.R.inc(13263);IOUtils.close(reader);
    }finally{__CLR4_1_10a2ca2cluszvvy2.R.flushNeeded();}}

    @Override
    public boolean isEOF() {try{__CLR4_1_10a2ca2cluszvvy2.R.inc(13264);
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13265);return bufLength == -1 || bp == buf.length || ch == EOI && bp + 1 >= buf.length;
    }finally{__CLR4_1_10a2ca2cluszvvy2.R.flushNeeded();}}

    public final boolean isBlankInput() {try{__CLR4_1_10a2ca2cluszvvy2.R.inc(13266);
        __CLR4_1_10a2ca2cluszvvy2.R.inc(13267);for (int i = 0;; ++i) {{
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13268);char chLocal = buf[i];
            __CLR4_1_10a2ca2cluszvvy2.R.inc(13269);if ((((chLocal == EOI)&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13270)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13271)==0&false))) {{
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13272);token = JSONToken.EOF;
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13273);break;
            }

            }__CLR4_1_10a2ca2cluszvvy2.R.inc(13274);if ((((!isWhitespace(chLocal))&&(__CLR4_1_10a2ca2cluszvvy2.R.iget(13275)!=0|true))||(__CLR4_1_10a2ca2cluszvvy2.R.iget(13276)==0&false))) {{
                __CLR4_1_10a2ca2cluszvvy2.R.inc(13277);return false;
            }
        }}

        }__CLR4_1_10a2ca2cluszvvy2.R.inc(13278);return true;
    }finally{__CLR4_1_10a2ca2cluszvvy2.R.flushNeeded();}}
}
