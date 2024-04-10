/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 1999-2019 Alibaba Group.
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

import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.util.IOUtils;

import static com.alibaba.fastjson.parser.JSONToken.*;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
@java.lang.SuppressWarnings({"fallthrough"}) public abstract class JSONLexerBase implements JSONLexer, Closeable {public static class __CLR4_5_2694694lusyjkeu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,13044,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected void lexError(String key, Object... args) {try{__CLR4_5_2694694lusyjkeu.R.inc(8104);
        __CLR4_5_2694694lusyjkeu.R.inc(8105);token = ERROR;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    protected int                            token;
    protected int                            pos;
    protected int                            features;

    protected char                           ch;
    protected int                            bp;

    protected int                            eofPos;

    /**
     * A character buffer for literals.
     */
    protected char[]                         sbuf;
    protected int                            sp;

    /**
     * number start position
     */
    protected int                            np;

    protected boolean                        hasSpecial;

    protected Calendar                       calendar           = null;
    protected TimeZone                       timeZone           = JSON.defaultTimeZone;
    protected Locale                         locale             = JSON.defaultLocale;

    public int                               matchStat          = UNKNOWN;

    private final static ThreadLocal<char[]> SBUF_LOCAL         = new ThreadLocal<char[]>();

    protected String                         stringDefaultValue = null;

    public JSONLexerBase(int features){try{__CLR4_5_2694694lusyjkeu.R.inc(8106);
        __CLR4_5_2694694lusyjkeu.R.inc(8107);this.features = features;

        __CLR4_5_2694694lusyjkeu.R.inc(8108);if (((((features & Feature.InitStringFieldAsEmpty.mask) != 0)&&(__CLR4_5_2694694lusyjkeu.R.iget(8109)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8110)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8111);stringDefaultValue = "";
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(8112);sbuf = SBUF_LOCAL.get();

        __CLR4_5_2694694lusyjkeu.R.inc(8113);if ((((sbuf == null)&&(__CLR4_5_2694694lusyjkeu.R.iget(8114)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8115)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8116);sbuf = new char[512];
        }
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final int matchStat() {try{__CLR4_5_2694694lusyjkeu.R.inc(8117);
        __CLR4_5_2694694lusyjkeu.R.inc(8118);return matchStat;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    /**
     * internal method, don't invoke
     * @param token
     */
    public void setToken(int token) {try{__CLR4_5_2694694lusyjkeu.R.inc(8119);
        __CLR4_5_2694694lusyjkeu.R.inc(8120);this.token = token;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final void nextToken() {try{__CLR4_5_2694694lusyjkeu.R.inc(8121);
        __CLR4_5_2694694lusyjkeu.R.inc(8122);sp = 0;

        __CLR4_5_2694694lusyjkeu.R.inc(8123);for (;;) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8124);pos = bp;

            __CLR4_5_2694694lusyjkeu.R.inc(8125);if ((((ch == '/')&&(__CLR4_5_2694694lusyjkeu.R.iget(8126)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8127)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8128);skipComment();
                __CLR4_5_2694694lusyjkeu.R.inc(8129);continue;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(8130);if ((((ch == '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(8131)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8132)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8133);scanString();
                __CLR4_5_2694694lusyjkeu.R.inc(8134);return;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(8135);if ((((ch == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(8136)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8137)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8138);next();
                __CLR4_5_2694694lusyjkeu.R.inc(8139);token = COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(8140);return;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(8141);if ((((ch >= '0' && ch <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(8142)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8143)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8144);scanNumber();
                __CLR4_5_2694694lusyjkeu.R.inc(8145);return;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(8146);if ((((ch == '-')&&(__CLR4_5_2694694lusyjkeu.R.iget(8147)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8148)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8149);scanNumber();
                __CLR4_5_2694694lusyjkeu.R.inc(8150);return;
            }

            }boolean __CLB4_5_2_bool0=false;__CLR4_5_2694694lusyjkeu.R.inc(8151);switch (ch) {
                case '\'':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8152);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8153);if ((((!isEnabled(Feature.AllowSingleQuotes))&&(__CLR4_5_2694694lusyjkeu.R.iget(8154)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8155)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8156);throw new JSONException("Feature.AllowSingleQuotes is false");
                    }
                    }__CLR4_5_2694694lusyjkeu.R.inc(8157);scanStringSingleQuote();
                    __CLR4_5_2694694lusyjkeu.R.inc(8158);return;
                case ' ':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8159);__CLB4_5_2_bool0=true;}
                case '\t':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8160);__CLB4_5_2_bool0=true;}
                case '\b':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8161);__CLB4_5_2_bool0=true;}
                case '\f':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8162);__CLB4_5_2_bool0=true;}
                case '\n':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8163);__CLB4_5_2_bool0=true;}
                case '\r':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8164);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8165);next();
                    __CLR4_5_2694694lusyjkeu.R.inc(8166);break;
                case 't':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8167);__CLB4_5_2_bool0=true;} // true
                    __CLR4_5_2694694lusyjkeu.R.inc(8168);scanTrue();
                    __CLR4_5_2694694lusyjkeu.R.inc(8169);return;
                case 'f':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8170);__CLB4_5_2_bool0=true;} // false
                    __CLR4_5_2694694lusyjkeu.R.inc(8171);scanFalse();
                    __CLR4_5_2694694lusyjkeu.R.inc(8172);return;
                case 'n':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8173);__CLB4_5_2_bool0=true;} // new,null
                    __CLR4_5_2694694lusyjkeu.R.inc(8174);scanNullOrNew();
                    __CLR4_5_2694694lusyjkeu.R.inc(8175);return;
                case 'T':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8176);__CLB4_5_2_bool0=true;}
                case 'N':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8177);__CLB4_5_2_bool0=true;} // NULL
                case 'S':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8178);__CLB4_5_2_bool0=true;}
                case 'u':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8179);__CLB4_5_2_bool0=true;} // undefined
                    __CLR4_5_2694694lusyjkeu.R.inc(8180);scanIdent();
                    __CLR4_5_2694694lusyjkeu.R.inc(8181);return;
                case '(':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8182);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8183);next();
                    __CLR4_5_2694694lusyjkeu.R.inc(8184);token = LPAREN;
                    __CLR4_5_2694694lusyjkeu.R.inc(8185);return;
                case ')':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8186);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8187);next();
                    __CLR4_5_2694694lusyjkeu.R.inc(8188);token = RPAREN;
                    __CLR4_5_2694694lusyjkeu.R.inc(8189);return;
                case '[':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8190);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8191);next();
                    __CLR4_5_2694694lusyjkeu.R.inc(8192);token = LBRACKET;
                    __CLR4_5_2694694lusyjkeu.R.inc(8193);return;
                case ']':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8194);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8195);next();
                    __CLR4_5_2694694lusyjkeu.R.inc(8196);token = RBRACKET;
                    __CLR4_5_2694694lusyjkeu.R.inc(8197);return;
                case '{':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8198);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8199);next();
                    __CLR4_5_2694694lusyjkeu.R.inc(8200);token = LBRACE;
                    __CLR4_5_2694694lusyjkeu.R.inc(8201);return;
                case '}':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8202);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8203);next();
                    __CLR4_5_2694694lusyjkeu.R.inc(8204);token = RBRACE;
                    __CLR4_5_2694694lusyjkeu.R.inc(8205);return;
                case ':':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8206);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8207);next();
                    __CLR4_5_2694694lusyjkeu.R.inc(8208);token = COLON;
                    __CLR4_5_2694694lusyjkeu.R.inc(8209);return;
                case ';':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8210);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8211);next();
                    __CLR4_5_2694694lusyjkeu.R.inc(8212);token = SEMI;
                    __CLR4_5_2694694lusyjkeu.R.inc(8213);return;
                case '.':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8214);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8215);next();
                    __CLR4_5_2694694lusyjkeu.R.inc(8216);token = DOT;
                    __CLR4_5_2694694lusyjkeu.R.inc(8217);return;
                case '+':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8218);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8219);next();
                    __CLR4_5_2694694lusyjkeu.R.inc(8220);scanNumber();
                    __CLR4_5_2694694lusyjkeu.R.inc(8221);return;
                case 'x':if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8222);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8223);scanHex();
                    __CLR4_5_2694694lusyjkeu.R.inc(8224);return;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_2694694lusyjkeu.R.inc(8225);__CLB4_5_2_bool0=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8226);if ((((isEOF())&&(__CLR4_5_2694694lusyjkeu.R.iget(8227)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8228)==0&false))) {{ // JLS
                        __CLR4_5_2694694lusyjkeu.R.inc(8229);if ((((token == EOF)&&(__CLR4_5_2694694lusyjkeu.R.iget(8230)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8231)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(8232);throw new JSONException("EOF error");
                        }

                        }__CLR4_5_2694694lusyjkeu.R.inc(8233);token = EOF;
                        __CLR4_5_2694694lusyjkeu.R.inc(8234);eofPos = pos = bp;
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8235);if ((((ch <= 31 || ch == 127)&&(__CLR4_5_2694694lusyjkeu.R.iget(8236)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8237)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(8238);next();
                            __CLR4_5_2694694lusyjkeu.R.inc(8239);break;
                        }

                        }__CLR4_5_2694694lusyjkeu.R.inc(8240);lexError("illegal.char", String.valueOf((int) ch));
                        __CLR4_5_2694694lusyjkeu.R.inc(8241);next();
                    }

                    }__CLR4_5_2694694lusyjkeu.R.inc(8242);return;
            }
        }

    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final void nextToken(int expect) {try{__CLR4_5_2694694lusyjkeu.R.inc(8243);
        __CLR4_5_2694694lusyjkeu.R.inc(8244);sp = 0;

        __CLR4_5_2694694lusyjkeu.R.inc(8245);for (;;) {{
            boolean __CLB4_5_2_bool1=false;__CLR4_5_2694694lusyjkeu.R.inc(8246);switch (expect) {
                case JSONToken.LBRACE:if (!__CLB4_5_2_bool1) {__CLR4_5_2694694lusyjkeu.R.inc(8247);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8248);if ((((ch == '{')&&(__CLR4_5_2694694lusyjkeu.R.iget(8249)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8250)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8251);token = JSONToken.LBRACE;
                        __CLR4_5_2694694lusyjkeu.R.inc(8252);next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8253);return;
                    }
                    }__CLR4_5_2694694lusyjkeu.R.inc(8254);if ((((ch == '[')&&(__CLR4_5_2694694lusyjkeu.R.iget(8255)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8256)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8257);token = JSONToken.LBRACKET;
                        __CLR4_5_2694694lusyjkeu.R.inc(8258);next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8259);return;
                    }
                    }__CLR4_5_2694694lusyjkeu.R.inc(8260);break;
                case JSONToken.COMMA:if (!__CLB4_5_2_bool1) {__CLR4_5_2694694lusyjkeu.R.inc(8261);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8262);if ((((ch == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(8263)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8264)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8265);token = JSONToken.COMMA;
                        __CLR4_5_2694694lusyjkeu.R.inc(8266);next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8267);return;
                    }

                    }__CLR4_5_2694694lusyjkeu.R.inc(8268);if ((((ch == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(8269)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8270)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8271);token = JSONToken.RBRACE;
                        __CLR4_5_2694694lusyjkeu.R.inc(8272);next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8273);return;
                    }

                    }__CLR4_5_2694694lusyjkeu.R.inc(8274);if ((((ch == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(8275)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8276)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8277);token = JSONToken.RBRACKET;
                        __CLR4_5_2694694lusyjkeu.R.inc(8278);next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8279);return;
                    }

                    }__CLR4_5_2694694lusyjkeu.R.inc(8280);if ((((ch == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(8281)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8282)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8283);token = JSONToken.EOF;
                        __CLR4_5_2694694lusyjkeu.R.inc(8284);return;
                    }

                    }__CLR4_5_2694694lusyjkeu.R.inc(8285);if ((((ch == 'n')&&(__CLR4_5_2694694lusyjkeu.R.iget(8286)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8287)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8288);scanNullOrNew(false);
                        __CLR4_5_2694694lusyjkeu.R.inc(8289);return;
                    }
                    }__CLR4_5_2694694lusyjkeu.R.inc(8290);break;
                case JSONToken.LITERAL_INT:if (!__CLB4_5_2_bool1) {__CLR4_5_2694694lusyjkeu.R.inc(8291);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8292);if ((((ch >= '0' && ch <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(8293)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8294)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8295);pos = bp;
                        __CLR4_5_2694694lusyjkeu.R.inc(8296);scanNumber();
                        __CLR4_5_2694694lusyjkeu.R.inc(8297);return;
                    }

                    }__CLR4_5_2694694lusyjkeu.R.inc(8298);if ((((ch == '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(8299)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8300)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8301);pos = bp;
                        __CLR4_5_2694694lusyjkeu.R.inc(8302);scanString();
                        __CLR4_5_2694694lusyjkeu.R.inc(8303);return;
                    }

                    }__CLR4_5_2694694lusyjkeu.R.inc(8304);if ((((ch == '[')&&(__CLR4_5_2694694lusyjkeu.R.iget(8305)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8306)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8307);token = JSONToken.LBRACKET;
                        __CLR4_5_2694694lusyjkeu.R.inc(8308);next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8309);return;
                    }

                    }__CLR4_5_2694694lusyjkeu.R.inc(8310);if ((((ch == '{')&&(__CLR4_5_2694694lusyjkeu.R.iget(8311)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8312)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8313);token = JSONToken.LBRACE;
                        __CLR4_5_2694694lusyjkeu.R.inc(8314);next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8315);return;
                    }

                    }__CLR4_5_2694694lusyjkeu.R.inc(8316);break;
                case JSONToken.LITERAL_STRING:if (!__CLB4_5_2_bool1) {__CLR4_5_2694694lusyjkeu.R.inc(8317);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8318);if ((((ch == '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(8319)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8320)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8321);pos = bp;
                        __CLR4_5_2694694lusyjkeu.R.inc(8322);scanString();
                        __CLR4_5_2694694lusyjkeu.R.inc(8323);return;
                    }

                    }__CLR4_5_2694694lusyjkeu.R.inc(8324);if ((((ch >= '0' && ch <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(8325)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8326)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8327);pos = bp;
                        __CLR4_5_2694694lusyjkeu.R.inc(8328);scanNumber();
                        __CLR4_5_2694694lusyjkeu.R.inc(8329);return;
                    }

                    }__CLR4_5_2694694lusyjkeu.R.inc(8330);if ((((ch == '[')&&(__CLR4_5_2694694lusyjkeu.R.iget(8331)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8332)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8333);token = JSONToken.LBRACKET;
                        __CLR4_5_2694694lusyjkeu.R.inc(8334);next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8335);return;
                    }

                    }__CLR4_5_2694694lusyjkeu.R.inc(8336);if ((((ch == '{')&&(__CLR4_5_2694694lusyjkeu.R.iget(8337)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8338)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8339);token = JSONToken.LBRACE;
                        __CLR4_5_2694694lusyjkeu.R.inc(8340);next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8341);return;
                    }
                    }__CLR4_5_2694694lusyjkeu.R.inc(8342);break;
                case JSONToken.LBRACKET:if (!__CLB4_5_2_bool1) {__CLR4_5_2694694lusyjkeu.R.inc(8343);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8344);if ((((ch == '[')&&(__CLR4_5_2694694lusyjkeu.R.iget(8345)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8346)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8347);token = JSONToken.LBRACKET;
                        __CLR4_5_2694694lusyjkeu.R.inc(8348);next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8349);return;
                    }

                    }__CLR4_5_2694694lusyjkeu.R.inc(8350);if ((((ch == '{')&&(__CLR4_5_2694694lusyjkeu.R.iget(8351)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8352)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8353);token = JSONToken.LBRACE;
                        __CLR4_5_2694694lusyjkeu.R.inc(8354);next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8355);return;
                    }
                    }__CLR4_5_2694694lusyjkeu.R.inc(8356);break;
                case JSONToken.RBRACKET:if (!__CLB4_5_2_bool1) {__CLR4_5_2694694lusyjkeu.R.inc(8357);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8358);if ((((ch == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(8359)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8360)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8361);token = JSONToken.RBRACKET;
                        __CLR4_5_2694694lusyjkeu.R.inc(8362);next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8363);return;
                    }
                }case JSONToken.EOF:if (!__CLB4_5_2_bool1) {__CLR4_5_2694694lusyjkeu.R.inc(8364);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8365);if ((((ch == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(8366)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8367)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8368);token = JSONToken.EOF;
                        __CLR4_5_2694694lusyjkeu.R.inc(8369);return;
                    }
                    }__CLR4_5_2694694lusyjkeu.R.inc(8370);break;
                case JSONToken.IDENTIFIER:if (!__CLB4_5_2_bool1) {__CLR4_5_2694694lusyjkeu.R.inc(8371);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8372);nextIdent();
                    __CLR4_5_2694694lusyjkeu.R.inc(8373);return;
                default:if (!__CLB4_5_2_bool1) {__CLR4_5_2694694lusyjkeu.R.inc(8374);__CLB4_5_2_bool1=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(8375);break;
            }

            __CLR4_5_2694694lusyjkeu.R.inc(8376);if ((((ch == ' ' || ch == '\n' || ch == '\r' || ch == '\t' || ch == '\f' || ch == '\b')&&(__CLR4_5_2694694lusyjkeu.R.iget(8377)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8378)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8379);next();
                __CLR4_5_2694694lusyjkeu.R.inc(8380);continue;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(8381);nextToken();
            __CLR4_5_2694694lusyjkeu.R.inc(8382);break;
        }
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final void nextIdent() {try{__CLR4_5_2694694lusyjkeu.R.inc(8383);
        __CLR4_5_2694694lusyjkeu.R.inc(8384);while ((((isWhitespace(ch))&&(__CLR4_5_2694694lusyjkeu.R.iget(8385)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8386)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8387);next();
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(8388);if ((((ch == '_' || ch == '$' || Character.isLetter(ch))&&(__CLR4_5_2694694lusyjkeu.R.iget(8389)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8390)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8391);scanIdent();
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(8392);nextToken();
        }
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final void nextTokenWithColon() {try{__CLR4_5_2694694lusyjkeu.R.inc(8393);
        __CLR4_5_2694694lusyjkeu.R.inc(8394);nextTokenWithChar(':');
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final void nextTokenWithChar(char expect) {try{__CLR4_5_2694694lusyjkeu.R.inc(8395);
        __CLR4_5_2694694lusyjkeu.R.inc(8396);sp = 0;

        __CLR4_5_2694694lusyjkeu.R.inc(8397);for (;;) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8398);if ((((ch == expect)&&(__CLR4_5_2694694lusyjkeu.R.iget(8399)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8400)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8401);next();
                __CLR4_5_2694694lusyjkeu.R.inc(8402);nextToken();
                __CLR4_5_2694694lusyjkeu.R.inc(8403);return;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(8404);if ((((ch == ' ' || ch == '\n' || ch == '\r' || ch == '\t' || ch == '\f' || ch == '\b')&&(__CLR4_5_2694694lusyjkeu.R.iget(8405)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8406)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8407);next();
                __CLR4_5_2694694lusyjkeu.R.inc(8408);continue;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(8409);throw new JSONException("not match " + expect + " - " + ch + ", info : " + this.info());
        }
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final int token() {try{__CLR4_5_2694694lusyjkeu.R.inc(8410);
        __CLR4_5_2694694lusyjkeu.R.inc(8411);return token;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final String tokenName() {try{__CLR4_5_2694694lusyjkeu.R.inc(8412);
        __CLR4_5_2694694lusyjkeu.R.inc(8413);return JSONToken.name(token);
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final int pos() {try{__CLR4_5_2694694lusyjkeu.R.inc(8414);
        __CLR4_5_2694694lusyjkeu.R.inc(8415);return pos;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final String stringDefaultValue() {try{__CLR4_5_2694694lusyjkeu.R.inc(8416);
        __CLR4_5_2694694lusyjkeu.R.inc(8417);return stringDefaultValue;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final Number integerValue() throws NumberFormatException {try{__CLR4_5_2694694lusyjkeu.R.inc(8418);
        __CLR4_5_2694694lusyjkeu.R.inc(8419);long result = 0;
        __CLR4_5_2694694lusyjkeu.R.inc(8420);boolean negative = false;
        __CLR4_5_2694694lusyjkeu.R.inc(8421);if ((((np == -1)&&(__CLR4_5_2694694lusyjkeu.R.iget(8422)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8423)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8424);np = 0;
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(8425);int i = np, max = np + sp;
        __CLR4_5_2694694lusyjkeu.R.inc(8426);long limit;
        __CLR4_5_2694694lusyjkeu.R.inc(8427);long multmin;
        __CLR4_5_2694694lusyjkeu.R.inc(8428);int digit;

        __CLR4_5_2694694lusyjkeu.R.inc(8429);char type = ' ';

        boolean __CLB4_5_2_bool2=false;__CLR4_5_2694694lusyjkeu.R.inc(8430);switch (charAt(max - 1)) {
            case 'L':if (!__CLB4_5_2_bool2) {__CLR4_5_2694694lusyjkeu.R.inc(8431);__CLB4_5_2_bool2=true;}
                __CLR4_5_2694694lusyjkeu.R.inc(8432);max--;
                __CLR4_5_2694694lusyjkeu.R.inc(8433);type = 'L';
                __CLR4_5_2694694lusyjkeu.R.inc(8434);break;
            case 'S':if (!__CLB4_5_2_bool2) {__CLR4_5_2694694lusyjkeu.R.inc(8435);__CLB4_5_2_bool2=true;}
                __CLR4_5_2694694lusyjkeu.R.inc(8436);max--;
                __CLR4_5_2694694lusyjkeu.R.inc(8437);type = 'S';
                __CLR4_5_2694694lusyjkeu.R.inc(8438);break;
            case 'B':if (!__CLB4_5_2_bool2) {__CLR4_5_2694694lusyjkeu.R.inc(8439);__CLB4_5_2_bool2=true;}
                __CLR4_5_2694694lusyjkeu.R.inc(8440);max--;
                __CLR4_5_2694694lusyjkeu.R.inc(8441);type = 'B';
                __CLR4_5_2694694lusyjkeu.R.inc(8442);break;
            default:if (!__CLB4_5_2_bool2) {__CLR4_5_2694694lusyjkeu.R.inc(8443);__CLB4_5_2_bool2=true;}
                __CLR4_5_2694694lusyjkeu.R.inc(8444);break;
        }

        __CLR4_5_2694694lusyjkeu.R.inc(8445);if ((((charAt(np) == '-')&&(__CLR4_5_2694694lusyjkeu.R.iget(8446)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8447)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8448);negative = true;
            __CLR4_5_2694694lusyjkeu.R.inc(8449);limit = Long.MIN_VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(8450);i++;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(8451);limit = -Long.MAX_VALUE;
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(8452);multmin = MULTMIN_RADIX_TEN;
        __CLR4_5_2694694lusyjkeu.R.inc(8453);if ((((i < max)&&(__CLR4_5_2694694lusyjkeu.R.iget(8454)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8455)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8456);digit = charAt(i++) - '0';
            __CLR4_5_2694694lusyjkeu.R.inc(8457);result = -digit;
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(8458);while ((((i < max)&&(__CLR4_5_2694694lusyjkeu.R.iget(8459)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8460)==0&false))) {{
            // Accumulating negatively avoids surprises near MAX_VALUE
            __CLR4_5_2694694lusyjkeu.R.inc(8461);digit = charAt(i++) - '0';
            __CLR4_5_2694694lusyjkeu.R.inc(8462);if ((((result < multmin)&&(__CLR4_5_2694694lusyjkeu.R.iget(8463)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8464)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8465);return new BigInteger(numberString());
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(8466);result *= 10;
            __CLR4_5_2694694lusyjkeu.R.inc(8467);if ((((result < limit + digit)&&(__CLR4_5_2694694lusyjkeu.R.iget(8468)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8469)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8470);return new BigInteger(numberString());
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(8471);result -= digit;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(8472);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(8473)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8474)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8475);if ((((i > np + 1)&&(__CLR4_5_2694694lusyjkeu.R.iget(8476)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8477)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8478);if ((((result >= Integer.MIN_VALUE && type != 'L')&&(__CLR4_5_2694694lusyjkeu.R.iget(8479)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8480)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(8481);if ((((type == 'S')&&(__CLR4_5_2694694lusyjkeu.R.iget(8482)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8483)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8484);return (short) result;
                    }

                    }__CLR4_5_2694694lusyjkeu.R.inc(8485);if ((((type == 'B')&&(__CLR4_5_2694694lusyjkeu.R.iget(8486)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8487)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8488);return (byte) result;
                    }

                    }__CLR4_5_2694694lusyjkeu.R.inc(8489);return (int) result;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(8490);return result;
            } }else {{ /* Only got "-" */
                __CLR4_5_2694694lusyjkeu.R.inc(8491);throw new NumberFormatException(numberString());
            }
        }} }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(8492);result = -result;
            __CLR4_5_2694694lusyjkeu.R.inc(8493);if ((((result <= Integer.MAX_VALUE && type != 'L')&&(__CLR4_5_2694694lusyjkeu.R.iget(8494)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8495)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8496);if ((((type == 'S')&&(__CLR4_5_2694694lusyjkeu.R.iget(8497)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8498)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(8499);return (short) result;
                }

                }__CLR4_5_2694694lusyjkeu.R.inc(8500);if ((((type == 'B')&&(__CLR4_5_2694694lusyjkeu.R.iget(8501)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8502)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(8503);return (byte) result;
                }

                }__CLR4_5_2694694lusyjkeu.R.inc(8504);return (int) result;
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(8505);return result;
        }
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final void nextTokenWithColon(int expect) {try{__CLR4_5_2694694lusyjkeu.R.inc(8506);
        __CLR4_5_2694694lusyjkeu.R.inc(8507);nextTokenWithChar(':');
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public float floatValue() {try{__CLR4_5_2694694lusyjkeu.R.inc(8508);
        __CLR4_5_2694694lusyjkeu.R.inc(8509);String strVal = numberString();
        __CLR4_5_2694694lusyjkeu.R.inc(8510);float floatValue = Float.parseFloat(strVal);
        __CLR4_5_2694694lusyjkeu.R.inc(8511);if ((((floatValue == 0 || floatValue == Float.POSITIVE_INFINITY)&&(__CLR4_5_2694694lusyjkeu.R.iget(8512)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8513)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8514);char c0 = strVal.charAt(0);
            __CLR4_5_2694694lusyjkeu.R.inc(8515);if ((((c0 > '0' && c0 <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(8516)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8517)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8518);throw new JSONException("float overflow : " + strVal);
            }
        }}
        }__CLR4_5_2694694lusyjkeu.R.inc(8519);return floatValue;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public double doubleValue() {try{__CLR4_5_2694694lusyjkeu.R.inc(8520);
        __CLR4_5_2694694lusyjkeu.R.inc(8521);return Double.parseDouble(numberString());
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public void config(Feature feature, boolean state) {try{__CLR4_5_2694694lusyjkeu.R.inc(8522);
        __CLR4_5_2694694lusyjkeu.R.inc(8523);features = Feature.config(features, feature, state);

        __CLR4_5_2694694lusyjkeu.R.inc(8524);if (((((features & Feature.InitStringFieldAsEmpty.mask) != 0)&&(__CLR4_5_2694694lusyjkeu.R.iget(8525)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8526)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8527);stringDefaultValue = "";
        }
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final boolean isEnabled(Feature feature) {try{__CLR4_5_2694694lusyjkeu.R.inc(8528);
        __CLR4_5_2694694lusyjkeu.R.inc(8529);return isEnabled(feature.mask);
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final boolean isEnabled(int feature) {try{__CLR4_5_2694694lusyjkeu.R.inc(8530);
        __CLR4_5_2694694lusyjkeu.R.inc(8531);return (this.features & feature) != 0;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final boolean isEnabled(int features, int feature) {try{__CLR4_5_2694694lusyjkeu.R.inc(8532);
        __CLR4_5_2694694lusyjkeu.R.inc(8533);return (this.features & feature) != 0 || (features & feature) != 0;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public abstract String numberString();

    public abstract boolean isEOF();

    public final char getCurrent() {try{__CLR4_5_2694694lusyjkeu.R.inc(8534);
        __CLR4_5_2694694lusyjkeu.R.inc(8535);return ch;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public abstract char charAt(int index);

    // public final char next() {
    // ch = doNext();
    //// if (ch == '/' && (this.features & Feature.AllowComment.mask) != 0) {
    //// skipComment();
    //// }
    // return ch;
    // }

    public abstract char next();

    protected void skipComment() {try{__CLR4_5_2694694lusyjkeu.R.inc(8536);
        __CLR4_5_2694694lusyjkeu.R.inc(8537);next();
        __CLR4_5_2694694lusyjkeu.R.inc(8538);if ((((ch == '/')&&(__CLR4_5_2694694lusyjkeu.R.iget(8539)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8540)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8541);for (;;) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8542);next();
                __CLR4_5_2694694lusyjkeu.R.inc(8543);if ((((ch == '\n')&&(__CLR4_5_2694694lusyjkeu.R.iget(8544)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8545)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(8546);next();
                    __CLR4_5_2694694lusyjkeu.R.inc(8547);return;
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(8548);if ((((ch == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(8549)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8550)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(8551);return;
                }
            }}}
        }} }else {__CLR4_5_2694694lusyjkeu.R.inc(8552);if ((((ch == '*')&&(__CLR4_5_2694694lusyjkeu.R.iget(8553)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8554)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8555);next();

            __CLR4_5_2694694lusyjkeu.R.inc(8556);for (; (((ch != EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(8557)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8558)==0&false));) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8559);if ((((ch == '*')&&(__CLR4_5_2694694lusyjkeu.R.iget(8560)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8561)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(8562);next();
                    __CLR4_5_2694694lusyjkeu.R.inc(8563);if ((((ch == '/')&&(__CLR4_5_2694694lusyjkeu.R.iget(8564)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8565)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8566);next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8567);return;
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8568);continue;
                    }
                }}
                }__CLR4_5_2694694lusyjkeu.R.inc(8569);next();
            }
        }} }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(8570);throw new JSONException("invalid comment");
        }
    }}}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final String scanSymbol(final SymbolTable symbolTable) {try{__CLR4_5_2694694lusyjkeu.R.inc(8571);
        __CLR4_5_2694694lusyjkeu.R.inc(8572);skipWhitespace();

        __CLR4_5_2694694lusyjkeu.R.inc(8573);if ((((ch == '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(8574)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8575)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8576);return scanSymbol(symbolTable, '"');
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(8577);if ((((ch == '\'')&&(__CLR4_5_2694694lusyjkeu.R.iget(8578)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8579)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8580);if ((((!isEnabled(Feature.AllowSingleQuotes))&&(__CLR4_5_2694694lusyjkeu.R.iget(8581)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8582)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8583);throw new JSONException("syntax error");
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(8584);return scanSymbol(symbolTable, '\'');
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(8585);if ((((ch == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(8586)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8587)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8588);next();
            __CLR4_5_2694694lusyjkeu.R.inc(8589);token = JSONToken.RBRACE;
            __CLR4_5_2694694lusyjkeu.R.inc(8590);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(8591);if ((((ch == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(8592)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8593)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8594);next();
            __CLR4_5_2694694lusyjkeu.R.inc(8595);token = JSONToken.COMMA;
            __CLR4_5_2694694lusyjkeu.R.inc(8596);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(8597);if ((((ch == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(8598)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8599)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8600);token = JSONToken.EOF;
            __CLR4_5_2694694lusyjkeu.R.inc(8601);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(8602);if ((((!isEnabled(Feature.AllowUnQuotedFieldNames))&&(__CLR4_5_2694694lusyjkeu.R.iget(8603)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8604)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8605);throw new JSONException("syntax error");
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(8606);return scanSymbolUnQuoted(symbolTable);
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    // public abstract String scanSymbol(final SymbolTable symbolTable, final char quote);

    protected abstract void arrayCopy(int srcPos, char[] dest, int destPos, int length);

    public final String scanSymbol(final SymbolTable symbolTable, final char quote) {try{__CLR4_5_2694694lusyjkeu.R.inc(8607);
        __CLR4_5_2694694lusyjkeu.R.inc(8608);int hash = 0;

        __CLR4_5_2694694lusyjkeu.R.inc(8609);np = bp;
        __CLR4_5_2694694lusyjkeu.R.inc(8610);sp = 0;
        __CLR4_5_2694694lusyjkeu.R.inc(8611);boolean hasSpecial = false;
        __CLR4_5_2694694lusyjkeu.R.inc(8612);char chLocal;
        __CLR4_5_2694694lusyjkeu.R.inc(8613);for (;;) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8614);chLocal = next();

            __CLR4_5_2694694lusyjkeu.R.inc(8615);if ((((chLocal == quote)&&(__CLR4_5_2694694lusyjkeu.R.iget(8616)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8617)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8618);break;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(8619);if ((((chLocal == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(8620)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8621)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8622);throw new JSONException("unclosed.str");
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(8623);if ((((chLocal == '\\')&&(__CLR4_5_2694694lusyjkeu.R.iget(8624)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8625)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8626);if ((((!hasSpecial)&&(__CLR4_5_2694694lusyjkeu.R.iget(8627)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8628)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(8629);hasSpecial = true;

                    __CLR4_5_2694694lusyjkeu.R.inc(8630);if ((((sp >= sbuf.length)&&(__CLR4_5_2694694lusyjkeu.R.iget(8631)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8632)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8633);int newCapcity = sbuf.length * 2;
                        __CLR4_5_2694694lusyjkeu.R.inc(8634);if ((((sp > newCapcity)&&(__CLR4_5_2694694lusyjkeu.R.iget(8635)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8636)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(8637);newCapcity = sp;
                        }
                        }__CLR4_5_2694694lusyjkeu.R.inc(8638);char[] newsbuf = new char[newCapcity];
                        __CLR4_5_2694694lusyjkeu.R.inc(8639);System.arraycopy(sbuf, 0, newsbuf, 0, sbuf.length);
                        __CLR4_5_2694694lusyjkeu.R.inc(8640);sbuf = newsbuf;
                    }

                    // text.getChars(np + 1, np + 1 + sp, sbuf, 0);
                    // System.arraycopy(this.buf, np + 1, sbuf, 0, sp);
                    }__CLR4_5_2694694lusyjkeu.R.inc(8641);arrayCopy(np + 1, sbuf, 0, sp);
                }

                }__CLR4_5_2694694lusyjkeu.R.inc(8642);chLocal = next();

                boolean __CLB4_5_2_bool3=false;__CLR4_5_2694694lusyjkeu.R.inc(8643);switch (chLocal) {
                    case '0':if (!__CLB4_5_2_bool3) {__CLR4_5_2694694lusyjkeu.R.inc(8644);__CLB4_5_2_bool3=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8645);hash = 31 * hash + (int) chLocal;
                        __CLR4_5_2694694lusyjkeu.R.inc(8646);putChar('\0');
                        __CLR4_5_2694694lusyjkeu.R.inc(8647);break;
                    case '1':if (!__CLB4_5_2_bool3) {__CLR4_5_2694694lusyjkeu.R.inc(8648);__CLB4_5_2_bool3=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8649);hash = 31 * hash + (int) chLocal;
                        __CLR4_5_2694694lusyjkeu.R.inc(8650);putChar('\1');
                        __CLR4_5_2694694lusyjkeu.R.inc(8651);break;
                    case '2':if (!__CLB4_5_2_bool3) {__CLR4_5_2694694lusyjkeu.R.inc(8652);__CLB4_5_2_bool3=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8653);hash = 31 * hash + (int) chLocal;
                        __CLR4_5_2694694lusyjkeu.R.inc(8654);putChar('\2');
                        __CLR4_5_2694694lusyjkeu.R.inc(8655);break;
                    case '3':if (!__CLB4_5_2_bool3) {__CLR4_5_2694694lusyjkeu.R.inc(8656);__CLB4_5_2_bool3=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8657);hash = 31 * hash + (int) chLocal;
                        __CLR4_5_2694694lusyjkeu.R.inc(8658);putChar('\3');
                        __CLR4_5_2694694lusyjkeu.R.inc(8659);break;
                    case '4':if (!__CLB4_5_2_bool3) {__CLR4_5_2694694lusyjkeu.R.inc(8660);__CLB4_5_2_bool3=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8661);hash = 31 * hash + (int) chLocal;
                        __CLR4_5_2694694lusyjkeu.R.inc(8662);putChar('\4');
                        __CLR4_5_2694694lusyjkeu.R.inc(8663);break;
                    case '5':if (!__CLB4_5_2_bool3) {__CLR4_5_2694694lusyjkeu.R.inc(8664);__CLB4_5_2_bool3=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8665);hash = 31 * hash + (int) chLocal;
                        __CLR4_5_2694694lusyjkeu.R.inc(8666);putChar('\5');
                        __CLR4_5_2694694lusyjkeu.R.inc(8667);break;
                    case '6':if (!__CLB4_5_2_bool3) {__CLR4_5_2694694lusyjkeu.R.inc(8668);__CLB4_5_2_bool3=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8669);hash = 31 * hash + (int) chLocal;
                        __CLR4_5_2694694lusyjkeu.R.inc(8670);putChar('\6');
                        __CLR4_5_2694694lusyjkeu.R.inc(8671);break;
                    case '7':if (!__CLB4_5_2_bool3) {__CLR4_5_2694694lusyjkeu.R.inc(8672);__CLB4_5_2_bool3=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8673);hash = 31 * hash + (int) chLocal;
                        __CLR4_5_2694694lusyjkeu.R.inc(8674);putChar('\7');
                        __CLR4_5_2694694lusyjkeu.R.inc(8675);break;
                    case 'b':if (!__CLB4_5_2_bool3) {__CLR4_5_2694694lusyjkeu.R.inc(8676);__CLB4_5_2_bool3=true;} // 8
                        __CLR4_5_2694694lusyjkeu.R.inc(8677);hash = 31 * hash + (int) '\b';
                        __CLR4_5_2694694lusyjkeu.R.inc(8678);putChar('\b');
                        __CLR4_5_2694694lusyjkeu.R.inc(8679);break;
                    case 't':if (!__CLB4_5_2_bool3) {__CLR4_5_2694694lusyjkeu.R.inc(8680);__CLB4_5_2_bool3=true;} // 9
                        __CLR4_5_2694694lusyjkeu.R.inc(8681);hash = 31 * hash + (int) '\t';
                        __CLR4_5_2694694lusyjkeu.R.inc(8682);putChar('\t');
                        __CLR4_5_2694694lusyjkeu.R.inc(8683);break;
                    case 'n':if (!__CLB4_5_2_bool3) {__CLR4_5_2694694lusyjkeu.R.inc(8684);__CLB4_5_2_bool3=true;} // 10
                        __CLR4_5_2694694lusyjkeu.R.inc(8685);hash = 31 * hash + (int) '\n';
                        __CLR4_5_2694694lusyjkeu.R.inc(8686);putChar('\n');
                        __CLR4_5_2694694lusyjkeu.R.inc(8687);break;
                    case 'v':if (!__CLB4_5_2_bool3) {__CLR4_5_2694694lusyjkeu.R.inc(8688);__CLB4_5_2_bool3=true;} // 11
                        __CLR4_5_2694694lusyjkeu.R.inc(8689);hash = 31 * hash + (int) '';
                        __CLR4_5_2694694lusyjkeu.R.inc(8690);putChar('');
                        __CLR4_5_2694694lusyjkeu.R.inc(8691);break;
                    case 'f':if (!__CLB4_5_2_bool3) {__CLR4_5_2694694lusyjkeu.R.inc(8692);__CLB4_5_2_bool3=true;} // 12
                    case 'F':if (!__CLB4_5_2_bool3) {__CLR4_5_2694694lusyjkeu.R.inc(8693);__CLB4_5_2_bool3=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8694);hash = 31 * hash + (int) '\f';
                        __CLR4_5_2694694lusyjkeu.R.inc(8695);putChar('\f');
                        __CLR4_5_2694694lusyjkeu.R.inc(8696);break;
                    case 'r':if (!__CLB4_5_2_bool3) {__CLR4_5_2694694lusyjkeu.R.inc(8697);__CLB4_5_2_bool3=true;} // 13
                        __CLR4_5_2694694lusyjkeu.R.inc(8698);hash = 31 * hash + (int) '\r';
                        __CLR4_5_2694694lusyjkeu.R.inc(8699);putChar('\r');
                        __CLR4_5_2694694lusyjkeu.R.inc(8700);break;
                    case '"':if (!__CLB4_5_2_bool3) {__CLR4_5_2694694lusyjkeu.R.inc(8701);__CLB4_5_2_bool3=true;} // 34
                        __CLR4_5_2694694lusyjkeu.R.inc(8702);hash = 31 * hash + (int) '"';
                        __CLR4_5_2694694lusyjkeu.R.inc(8703);putChar('"');
                        __CLR4_5_2694694lusyjkeu.R.inc(8704);break;
                    case '\'':if (!__CLB4_5_2_bool3) {__CLR4_5_2694694lusyjkeu.R.inc(8705);__CLB4_5_2_bool3=true;} // 39
                        __CLR4_5_2694694lusyjkeu.R.inc(8706);hash = 31 * hash + (int) '\'';
                        __CLR4_5_2694694lusyjkeu.R.inc(8707);putChar('\'');
                        __CLR4_5_2694694lusyjkeu.R.inc(8708);break;
                    case '/':if (!__CLB4_5_2_bool3) {__CLR4_5_2694694lusyjkeu.R.inc(8709);__CLB4_5_2_bool3=true;} // 47
                        __CLR4_5_2694694lusyjkeu.R.inc(8710);hash = 31 * hash + (int) '/';
                        __CLR4_5_2694694lusyjkeu.R.inc(8711);putChar('/');
                        __CLR4_5_2694694lusyjkeu.R.inc(8712);break;
                    case '\\':if (!__CLB4_5_2_bool3) {__CLR4_5_2694694lusyjkeu.R.inc(8713);__CLB4_5_2_bool3=true;} // 92
                        __CLR4_5_2694694lusyjkeu.R.inc(8714);hash = 31 * hash + (int) '\\';
                        __CLR4_5_2694694lusyjkeu.R.inc(8715);putChar('\\');
                        __CLR4_5_2694694lusyjkeu.R.inc(8716);break;
                    case 'x':if (!__CLB4_5_2_bool3) {__CLR4_5_2694694lusyjkeu.R.inc(8717);__CLB4_5_2_bool3=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8718);char x1 = ch = next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8719);char x2 = ch = next();

                        __CLR4_5_2694694lusyjkeu.R.inc(8720);int x_val = digits[x1] * 16 + digits[x2];
                        __CLR4_5_2694694lusyjkeu.R.inc(8721);char x_char = (char) x_val;
                        __CLR4_5_2694694lusyjkeu.R.inc(8722);hash = 31 * hash + (int) x_char;
                        __CLR4_5_2694694lusyjkeu.R.inc(8723);putChar(x_char);
                        __CLR4_5_2694694lusyjkeu.R.inc(8724);break;
                    case 'u':if (!__CLB4_5_2_bool3) {__CLR4_5_2694694lusyjkeu.R.inc(8725);__CLB4_5_2_bool3=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8726);char c1 = chLocal = next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8727);char c2 = chLocal = next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8728);char c3 = chLocal = next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8729);char c4 = chLocal = next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8730);int val = Integer.parseInt(new String(new char[] { c1, c2, c3, c4 }), 16);
                        __CLR4_5_2694694lusyjkeu.R.inc(8731);hash = 31 * hash + val;
                        __CLR4_5_2694694lusyjkeu.R.inc(8732);putChar((char) val);
                        __CLR4_5_2694694lusyjkeu.R.inc(8733);break;
                    default:if (!__CLB4_5_2_bool3) {__CLR4_5_2694694lusyjkeu.R.inc(8734);__CLB4_5_2_bool3=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8735);this.ch = chLocal;
                        __CLR4_5_2694694lusyjkeu.R.inc(8736);throw new JSONException("unclosed.str.lit");
                }
                __CLR4_5_2694694lusyjkeu.R.inc(8737);continue;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(8738);hash = 31 * hash + chLocal;

            __CLR4_5_2694694lusyjkeu.R.inc(8739);if ((((!hasSpecial)&&(__CLR4_5_2694694lusyjkeu.R.iget(8740)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8741)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8742);sp++;
                __CLR4_5_2694694lusyjkeu.R.inc(8743);continue;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(8744);if ((((sp == sbuf.length)&&(__CLR4_5_2694694lusyjkeu.R.iget(8745)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8746)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8747);putChar(chLocal);
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(8748);sbuf[sp++] = chLocal;
            }
        }}

        }__CLR4_5_2694694lusyjkeu.R.inc(8749);token = LITERAL_STRING;

        __CLR4_5_2694694lusyjkeu.R.inc(8750);String value;
        __CLR4_5_2694694lusyjkeu.R.inc(8751);if ((((!hasSpecial)&&(__CLR4_5_2694694lusyjkeu.R.iget(8752)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8753)==0&false))) {{
            // return this.text.substring(np + 1, np + 1 + sp).intern();
            __CLR4_5_2694694lusyjkeu.R.inc(8754);int offset;
            __CLR4_5_2694694lusyjkeu.R.inc(8755);if ((((np == -1)&&(__CLR4_5_2694694lusyjkeu.R.iget(8756)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8757)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8758);offset = 0;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(8759);offset = np + 1;
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(8760);value = addSymbol(offset, sp, hash, symbolTable);
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(8761);value = symbolTable.addSymbol(sbuf, 0, sp, hash);
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(8762);sp = 0;
        __CLR4_5_2694694lusyjkeu.R.inc(8763);this.next();

        __CLR4_5_2694694lusyjkeu.R.inc(8764);return value;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final void resetStringPosition() {try{__CLR4_5_2694694lusyjkeu.R.inc(8765);
        __CLR4_5_2694694lusyjkeu.R.inc(8766);this.sp = 0;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public String info() {try{__CLR4_5_2694694lusyjkeu.R.inc(8767);
        __CLR4_5_2694694lusyjkeu.R.inc(8768);return "";
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final String scanSymbolUnQuoted(final SymbolTable symbolTable) {try{__CLR4_5_2694694lusyjkeu.R.inc(8769);
        __CLR4_5_2694694lusyjkeu.R.inc(8770);if ((((token == JSONToken.ERROR && pos == 0 && bp == 1)&&(__CLR4_5_2694694lusyjkeu.R.iget(8771)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8772)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8773);bp = 0; // adjust
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(8774);final boolean[] firstIdentifierFlags = IOUtils.firstIdentifierFlags;
        __CLR4_5_2694694lusyjkeu.R.inc(8775);final char first = ch;

        __CLR4_5_2694694lusyjkeu.R.inc(8776);final boolean firstFlag = ch >= firstIdentifierFlags.length || firstIdentifierFlags[first];
        __CLR4_5_2694694lusyjkeu.R.inc(8777);if ((((!firstFlag)&&(__CLR4_5_2694694lusyjkeu.R.iget(8778)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8779)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8780);throw new JSONException("illegal identifier : " + ch //
                    + info());
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(8781);final boolean[] identifierFlags = IOUtils.identifierFlags;

        __CLR4_5_2694694lusyjkeu.R.inc(8782);int hash = first;

        __CLR4_5_2694694lusyjkeu.R.inc(8783);np = bp;
        __CLR4_5_2694694lusyjkeu.R.inc(8784);sp = 1;
        __CLR4_5_2694694lusyjkeu.R.inc(8785);char chLocal;
        __CLR4_5_2694694lusyjkeu.R.inc(8786);for (;;) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8787);chLocal = next();

            __CLR4_5_2694694lusyjkeu.R.inc(8788);if ((((chLocal < identifierFlags.length)&&(__CLR4_5_2694694lusyjkeu.R.iget(8789)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8790)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8791);if ((((!identifierFlags[chLocal])&&(__CLR4_5_2694694lusyjkeu.R.iget(8792)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8793)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(8794);break;
                }
            }}

            }__CLR4_5_2694694lusyjkeu.R.inc(8795);hash = 31 * hash + chLocal;

            __CLR4_5_2694694lusyjkeu.R.inc(8796);sp++;
            __CLR4_5_2694694lusyjkeu.R.inc(8797);continue;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(8798);this.ch = charAt(bp);
        __CLR4_5_2694694lusyjkeu.R.inc(8799);token = JSONToken.IDENTIFIER;

        __CLR4_5_2694694lusyjkeu.R.inc(8800);final int NULL_HASH = 3392903;
        __CLR4_5_2694694lusyjkeu.R.inc(8801);if ((((sp == 4 && hash == NULL_HASH && charAt(np) == 'n' && charAt(np + 1) == 'u' && charAt(np + 2) == 'l'
                && charAt(np + 3) == 'l')&&(__CLR4_5_2694694lusyjkeu.R.iget(8802)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8803)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8804);return null;
        }

        // return text.substring(np, np + sp).intern();

        }__CLR4_5_2694694lusyjkeu.R.inc(8805);if ((((symbolTable == null)&&(__CLR4_5_2694694lusyjkeu.R.iget(8806)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8807)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8808);return subString(np, sp);
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(8809);return this.addSymbol(np, sp, hash, symbolTable);
        // return symbolTable.addSymbol(buf, np, sp, hash);
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    protected abstract void copyTo(int offset, int count, char[] dest);

    public final void scanString() {try{__CLR4_5_2694694lusyjkeu.R.inc(8810);
        __CLR4_5_2694694lusyjkeu.R.inc(8811);np = bp;
        __CLR4_5_2694694lusyjkeu.R.inc(8812);hasSpecial = false;
        __CLR4_5_2694694lusyjkeu.R.inc(8813);char ch;
        __CLR4_5_2694694lusyjkeu.R.inc(8814);for (;;) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8815);ch = next();

            __CLR4_5_2694694lusyjkeu.R.inc(8816);if ((((ch == '\"')&&(__CLR4_5_2694694lusyjkeu.R.iget(8817)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8818)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8819);break;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(8820);if ((((ch == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(8821)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8822)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8823);if ((((!isEOF())&&(__CLR4_5_2694694lusyjkeu.R.iget(8824)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8825)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(8826);putChar((char) EOI);
                    __CLR4_5_2694694lusyjkeu.R.inc(8827);continue;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(8828);throw new JSONException("unclosed string : " + ch);
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(8829);if ((((ch == '\\')&&(__CLR4_5_2694694lusyjkeu.R.iget(8830)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8831)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8832);if ((((!hasSpecial)&&(__CLR4_5_2694694lusyjkeu.R.iget(8833)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8834)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(8835);hasSpecial = true;

                    __CLR4_5_2694694lusyjkeu.R.inc(8836);if ((((sp >= sbuf.length)&&(__CLR4_5_2694694lusyjkeu.R.iget(8837)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8838)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(8839);int newCapcity = sbuf.length * 2;
                        __CLR4_5_2694694lusyjkeu.R.inc(8840);if ((((sp > newCapcity)&&(__CLR4_5_2694694lusyjkeu.R.iget(8841)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8842)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(8843);newCapcity = sp;
                        }
                        }__CLR4_5_2694694lusyjkeu.R.inc(8844);char[] newsbuf = new char[newCapcity];
                        __CLR4_5_2694694lusyjkeu.R.inc(8845);System.arraycopy(sbuf, 0, newsbuf, 0, sbuf.length);
                        __CLR4_5_2694694lusyjkeu.R.inc(8846);sbuf = newsbuf;
                    }

                    }__CLR4_5_2694694lusyjkeu.R.inc(8847);copyTo(np + 1, sp, sbuf);
                    // text.getChars(np + 1, np + 1 + sp, sbuf, 0);
                    // System.arraycopy(buf, np + 1, sbuf, 0, sp);
                }

                }__CLR4_5_2694694lusyjkeu.R.inc(8848);ch = next();

                boolean __CLB4_5_2_bool4=false;__CLR4_5_2694694lusyjkeu.R.inc(8849);switch (ch) {
                    case '0':if (!__CLB4_5_2_bool4) {__CLR4_5_2694694lusyjkeu.R.inc(8850);__CLB4_5_2_bool4=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8851);putChar('\0');
                        __CLR4_5_2694694lusyjkeu.R.inc(8852);break;
                    case '1':if (!__CLB4_5_2_bool4) {__CLR4_5_2694694lusyjkeu.R.inc(8853);__CLB4_5_2_bool4=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8854);putChar('\1');
                        __CLR4_5_2694694lusyjkeu.R.inc(8855);break;
                    case '2':if (!__CLB4_5_2_bool4) {__CLR4_5_2694694lusyjkeu.R.inc(8856);__CLB4_5_2_bool4=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8857);putChar('\2');
                        __CLR4_5_2694694lusyjkeu.R.inc(8858);break;
                    case '3':if (!__CLB4_5_2_bool4) {__CLR4_5_2694694lusyjkeu.R.inc(8859);__CLB4_5_2_bool4=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8860);putChar('\3');
                        __CLR4_5_2694694lusyjkeu.R.inc(8861);break;
                    case '4':if (!__CLB4_5_2_bool4) {__CLR4_5_2694694lusyjkeu.R.inc(8862);__CLB4_5_2_bool4=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8863);putChar('\4');
                        __CLR4_5_2694694lusyjkeu.R.inc(8864);break;
                    case '5':if (!__CLB4_5_2_bool4) {__CLR4_5_2694694lusyjkeu.R.inc(8865);__CLB4_5_2_bool4=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8866);putChar('\5');
                        __CLR4_5_2694694lusyjkeu.R.inc(8867);break;
                    case '6':if (!__CLB4_5_2_bool4) {__CLR4_5_2694694lusyjkeu.R.inc(8868);__CLB4_5_2_bool4=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8869);putChar('\6');
                        __CLR4_5_2694694lusyjkeu.R.inc(8870);break;
                    case '7':if (!__CLB4_5_2_bool4) {__CLR4_5_2694694lusyjkeu.R.inc(8871);__CLB4_5_2_bool4=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8872);putChar('\7');
                        __CLR4_5_2694694lusyjkeu.R.inc(8873);break;
                    case 'b':if (!__CLB4_5_2_bool4) {__CLR4_5_2694694lusyjkeu.R.inc(8874);__CLB4_5_2_bool4=true;} // 8
                        __CLR4_5_2694694lusyjkeu.R.inc(8875);putChar('\b');
                        __CLR4_5_2694694lusyjkeu.R.inc(8876);break;
                    case 't':if (!__CLB4_5_2_bool4) {__CLR4_5_2694694lusyjkeu.R.inc(8877);__CLB4_5_2_bool4=true;} // 9
                        __CLR4_5_2694694lusyjkeu.R.inc(8878);putChar('\t');
                        __CLR4_5_2694694lusyjkeu.R.inc(8879);break;
                    case 'n':if (!__CLB4_5_2_bool4) {__CLR4_5_2694694lusyjkeu.R.inc(8880);__CLB4_5_2_bool4=true;} // 10
                        __CLR4_5_2694694lusyjkeu.R.inc(8881);putChar('\n');
                        __CLR4_5_2694694lusyjkeu.R.inc(8882);break;
                    case 'v':if (!__CLB4_5_2_bool4) {__CLR4_5_2694694lusyjkeu.R.inc(8883);__CLB4_5_2_bool4=true;} // 11
                        __CLR4_5_2694694lusyjkeu.R.inc(8884);putChar('');
                        __CLR4_5_2694694lusyjkeu.R.inc(8885);break;
                    case 'f':if (!__CLB4_5_2_bool4) {__CLR4_5_2694694lusyjkeu.R.inc(8886);__CLB4_5_2_bool4=true;} // 12
                    case 'F':if (!__CLB4_5_2_bool4) {__CLR4_5_2694694lusyjkeu.R.inc(8887);__CLB4_5_2_bool4=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8888);putChar('\f');
                        __CLR4_5_2694694lusyjkeu.R.inc(8889);break;
                    case 'r':if (!__CLB4_5_2_bool4) {__CLR4_5_2694694lusyjkeu.R.inc(8890);__CLB4_5_2_bool4=true;} // 13
                        __CLR4_5_2694694lusyjkeu.R.inc(8891);putChar('\r');
                        __CLR4_5_2694694lusyjkeu.R.inc(8892);break;
                    case '"':if (!__CLB4_5_2_bool4) {__CLR4_5_2694694lusyjkeu.R.inc(8893);__CLB4_5_2_bool4=true;} // 34
                        __CLR4_5_2694694lusyjkeu.R.inc(8894);putChar('"');
                        __CLR4_5_2694694lusyjkeu.R.inc(8895);break;
                    case '\'':if (!__CLB4_5_2_bool4) {__CLR4_5_2694694lusyjkeu.R.inc(8896);__CLB4_5_2_bool4=true;} // 39
                        __CLR4_5_2694694lusyjkeu.R.inc(8897);putChar('\'');
                        __CLR4_5_2694694lusyjkeu.R.inc(8898);break;
                    case '/':if (!__CLB4_5_2_bool4) {__CLR4_5_2694694lusyjkeu.R.inc(8899);__CLB4_5_2_bool4=true;} // 47
                        __CLR4_5_2694694lusyjkeu.R.inc(8900);putChar('/');
                        __CLR4_5_2694694lusyjkeu.R.inc(8901);break;
                    case '\\':if (!__CLB4_5_2_bool4) {__CLR4_5_2694694lusyjkeu.R.inc(8902);__CLB4_5_2_bool4=true;} // 92
                        __CLR4_5_2694694lusyjkeu.R.inc(8903);putChar('\\');
                        __CLR4_5_2694694lusyjkeu.R.inc(8904);break;
                    case 'x':if (!__CLB4_5_2_bool4) {__CLR4_5_2694694lusyjkeu.R.inc(8905);__CLB4_5_2_bool4=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8906);char x1 = next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8907);char x2 = next();

                        __CLR4_5_2694694lusyjkeu.R.inc(8908);boolean hex1 = (x1 >= '0' && x1 <= '9')
                                || (x1 >= 'a' && x1 <= 'f')
                                || (x1 >= 'A' && x1 <= 'F');
                        __CLR4_5_2694694lusyjkeu.R.inc(8909);boolean hex2 = (x2 >= '0' && x2 <= '9')
                                || (x2 >= 'a' && x2 <= 'f')
                                || (x2 >= 'A' && x2 <= 'F');
                        __CLR4_5_2694694lusyjkeu.R.inc(8910);if ((((!hex1 || !hex2)&&(__CLR4_5_2694694lusyjkeu.R.iget(8911)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8912)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(8913);throw new JSONException("invalid escape character \\x" + x1 + x2);
                        }

                        }__CLR4_5_2694694lusyjkeu.R.inc(8914);char x_char = (char) (digits[x1] * 16 + digits[x2]);
                        __CLR4_5_2694694lusyjkeu.R.inc(8915);putChar(x_char);
                        __CLR4_5_2694694lusyjkeu.R.inc(8916);break;
                    case 'u':if (!__CLB4_5_2_bool4) {__CLR4_5_2694694lusyjkeu.R.inc(8917);__CLB4_5_2_bool4=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8918);char u1 = next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8919);char u2 = next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8920);char u3 = next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8921);char u4 = next();
                        __CLR4_5_2694694lusyjkeu.R.inc(8922);int val = Integer.parseInt(new String(new char[] { u1, u2, u3, u4 }), 16);
                        __CLR4_5_2694694lusyjkeu.R.inc(8923);putChar((char) val);
                        __CLR4_5_2694694lusyjkeu.R.inc(8924);break;
                    default:if (!__CLB4_5_2_bool4) {__CLR4_5_2694694lusyjkeu.R.inc(8925);__CLB4_5_2_bool4=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(8926);this.ch = ch;
                        __CLR4_5_2694694lusyjkeu.R.inc(8927);throw new JSONException("unclosed string : " + ch);
                }
                __CLR4_5_2694694lusyjkeu.R.inc(8928);continue;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(8929);if ((((!hasSpecial)&&(__CLR4_5_2694694lusyjkeu.R.iget(8930)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8931)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8932);sp++;
                __CLR4_5_2694694lusyjkeu.R.inc(8933);continue;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(8934);if ((((sp == sbuf.length)&&(__CLR4_5_2694694lusyjkeu.R.iget(8935)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8936)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8937);putChar(ch);
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(8938);sbuf[sp++] = ch;
            }
        }}

        }__CLR4_5_2694694lusyjkeu.R.inc(8939);token = JSONToken.LITERAL_STRING;
        __CLR4_5_2694694lusyjkeu.R.inc(8940);this.ch = next();
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public Calendar getCalendar() {try{__CLR4_5_2694694lusyjkeu.R.inc(8941);
        __CLR4_5_2694694lusyjkeu.R.inc(8942);return this.calendar;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public TimeZone getTimeZone() {try{__CLR4_5_2694694lusyjkeu.R.inc(8943);
        __CLR4_5_2694694lusyjkeu.R.inc(8944);return timeZone;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public void setTimeZone(TimeZone timeZone) {try{__CLR4_5_2694694lusyjkeu.R.inc(8945);
        __CLR4_5_2694694lusyjkeu.R.inc(8946);this.timeZone = timeZone;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public Locale getLocale() {try{__CLR4_5_2694694lusyjkeu.R.inc(8947);
        __CLR4_5_2694694lusyjkeu.R.inc(8948);return locale;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public void setLocale(Locale locale) {try{__CLR4_5_2694694lusyjkeu.R.inc(8949);
        __CLR4_5_2694694lusyjkeu.R.inc(8950);this.locale = locale;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final int intValue() {try{__CLR4_5_2694694lusyjkeu.R.inc(8951);
        __CLR4_5_2694694lusyjkeu.R.inc(8952);if ((((np == -1)&&(__CLR4_5_2694694lusyjkeu.R.iget(8953)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8954)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8955);np = 0;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(8956);int result = 0;
        __CLR4_5_2694694lusyjkeu.R.inc(8957);boolean negative = false;
        __CLR4_5_2694694lusyjkeu.R.inc(8958);int i = np, max = np + sp;
        __CLR4_5_2694694lusyjkeu.R.inc(8959);int limit;
        __CLR4_5_2694694lusyjkeu.R.inc(8960);int digit;

        __CLR4_5_2694694lusyjkeu.R.inc(8961);if ((((charAt(np) == '-')&&(__CLR4_5_2694694lusyjkeu.R.iget(8962)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8963)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8964);negative = true;
            __CLR4_5_2694694lusyjkeu.R.inc(8965);limit = Integer.MIN_VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(8966);i++;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(8967);limit = -Integer.MAX_VALUE;
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(8968);long multmin = INT_MULTMIN_RADIX_TEN;
        __CLR4_5_2694694lusyjkeu.R.inc(8969);if ((((i < max)&&(__CLR4_5_2694694lusyjkeu.R.iget(8970)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8971)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8972);digit = charAt(i++) - '0';
            __CLR4_5_2694694lusyjkeu.R.inc(8973);result = -digit;
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(8974);while ((((i < max)&&(__CLR4_5_2694694lusyjkeu.R.iget(8975)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8976)==0&false))) {{
            // Accumulating negatively avoids surprises near MAX_VALUE
            __CLR4_5_2694694lusyjkeu.R.inc(8977);char chLocal = charAt(i++);

            __CLR4_5_2694694lusyjkeu.R.inc(8978);if ((((chLocal == 'L' || chLocal == 'S' || chLocal == 'B')&&(__CLR4_5_2694694lusyjkeu.R.iget(8979)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8980)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8981);break;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(8982);digit = chLocal - '0';

            __CLR4_5_2694694lusyjkeu.R.inc(8983);if ((((result < multmin)&&(__CLR4_5_2694694lusyjkeu.R.iget(8984)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8985)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8986);throw new NumberFormatException(numberString());
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(8987);result *= 10;
            __CLR4_5_2694694lusyjkeu.R.inc(8988);if ((((result < limit + digit)&&(__CLR4_5_2694694lusyjkeu.R.iget(8989)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8990)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8991);throw new NumberFormatException(numberString());
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(8992);result -= digit;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(8993);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(8994)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8995)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(8996);if ((((i > np + 1)&&(__CLR4_5_2694694lusyjkeu.R.iget(8997)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(8998)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(8999);return result;
            } }else {{ /* Only got "-" */
                __CLR4_5_2694694lusyjkeu.R.inc(9000);throw new NumberFormatException(numberString());
            }
        }} }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(9001);return -result;
        }
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public abstract byte[] bytesValue();

    public void close() {try{__CLR4_5_2694694lusyjkeu.R.inc(9002);
        __CLR4_5_2694694lusyjkeu.R.inc(9003);if ((((sbuf.length <= 1024 * 8)&&(__CLR4_5_2694694lusyjkeu.R.iget(9004)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9005)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9006);SBUF_LOCAL.set(sbuf);
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(9007);this.sbuf = null;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final boolean isRef() {try{__CLR4_5_2694694lusyjkeu.R.inc(9008);
        __CLR4_5_2694694lusyjkeu.R.inc(9009);if ((((sp != 4)&&(__CLR4_5_2694694lusyjkeu.R.iget(9010)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9011)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9012);return false;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9013);return charAt(np + 1) == '$' //
                && charAt(np + 2) == 'r' //
                && charAt(np + 3) == 'e' //
                && charAt(np + 4) == 'f';
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    protected final static char[] typeFieldName = ("\"" + JSON.DEFAULT_TYPE_KEY + "\":\"").toCharArray();

    public final int scanType(String type) {try{__CLR4_5_2694694lusyjkeu.R.inc(9014);
        __CLR4_5_2694694lusyjkeu.R.inc(9015);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(9016);if ((((!charArrayCompare(typeFieldName))&&(__CLR4_5_2694694lusyjkeu.R.iget(9017)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9018)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9019);return NOT_MATCH_NAME;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9020);int bpLocal = this.bp + typeFieldName.length;

        __CLR4_5_2694694lusyjkeu.R.inc(9021);final int typeLength = type.length();
        __CLR4_5_2694694lusyjkeu.R.inc(9022);for (int i = 0; (((i < typeLength)&&(__CLR4_5_2694694lusyjkeu.R.iget(9023)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9024)==0&false)); ++i) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9025);if ((((type.charAt(i) != charAt(bpLocal + i))&&(__CLR4_5_2694694lusyjkeu.R.iget(9026)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9027)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9028);return NOT_MATCH;
            }
        }}
        }__CLR4_5_2694694lusyjkeu.R.inc(9029);bpLocal += typeLength;
        __CLR4_5_2694694lusyjkeu.R.inc(9030);if ((((charAt(bpLocal) != '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(9031)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9032)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9033);return NOT_MATCH;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9034);this.ch = charAt(++bpLocal);

        __CLR4_5_2694694lusyjkeu.R.inc(9035);if ((((ch == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(9036)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9037)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9038);this.ch = charAt(++bpLocal);
            __CLR4_5_2694694lusyjkeu.R.inc(9039);this.bp = bpLocal;
            __CLR4_5_2694694lusyjkeu.R.inc(9040);token = JSONToken.COMMA;
            __CLR4_5_2694694lusyjkeu.R.inc(9041);return VALUE;
        } }else {__CLR4_5_2694694lusyjkeu.R.inc(9042);if ((((ch == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(9043)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9044)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9045);ch = charAt(++bpLocal);
            __CLR4_5_2694694lusyjkeu.R.inc(9046);if ((((ch == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(9047)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9048)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9049);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(9050);this.ch = charAt(++bpLocal);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9051);if ((((ch == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(9052)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9053)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9054);token = JSONToken.RBRACKET;
                __CLR4_5_2694694lusyjkeu.R.inc(9055);this.ch = charAt(++bpLocal);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9056);if ((((ch == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(9057)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9058)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9059);token = JSONToken.RBRACE;
                __CLR4_5_2694694lusyjkeu.R.inc(9060);this.ch = charAt(++bpLocal);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9061);if ((((ch == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(9062)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9063)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9064);token = JSONToken.EOF;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(9065);return NOT_MATCH;
            }
            }}}}__CLR4_5_2694694lusyjkeu.R.inc(9066);matchStat = END;
        }

        }}__CLR4_5_2694694lusyjkeu.R.inc(9067);this.bp = bpLocal;
        __CLR4_5_2694694lusyjkeu.R.inc(9068);return matchStat;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final boolean matchField(char[] fieldName) {try{__CLR4_5_2694694lusyjkeu.R.inc(9069);
        __CLR4_5_2694694lusyjkeu.R.inc(9070);for (;;) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9071);if ((((!charArrayCompare(fieldName))&&(__CLR4_5_2694694lusyjkeu.R.iget(9072)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9073)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9074);if ((((isWhitespace(ch))&&(__CLR4_5_2694694lusyjkeu.R.iget(9075)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9076)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(9077);next();
                    __CLR4_5_2694694lusyjkeu.R.inc(9078);continue;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(9079);return false;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(9080);break;
            }
        }}

        }__CLR4_5_2694694lusyjkeu.R.inc(9081);bp = bp + fieldName.length;
        __CLR4_5_2694694lusyjkeu.R.inc(9082);ch = charAt(bp);

        __CLR4_5_2694694lusyjkeu.R.inc(9083);if ((((ch == '{')&&(__CLR4_5_2694694lusyjkeu.R.iget(9084)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9085)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9086);next();
            __CLR4_5_2694694lusyjkeu.R.inc(9087);token = JSONToken.LBRACE;
        } }else {__CLR4_5_2694694lusyjkeu.R.inc(9088);if ((((ch == '[')&&(__CLR4_5_2694694lusyjkeu.R.iget(9089)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9090)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9091);next();
            __CLR4_5_2694694lusyjkeu.R.inc(9092);token = JSONToken.LBRACKET;
        } }else {__CLR4_5_2694694lusyjkeu.R.inc(9093);if ((((ch == 'S' && charAt(bp + 1) == 'e' && charAt(bp + 2) == 't' && charAt(bp + 3) == '[')&&(__CLR4_5_2694694lusyjkeu.R.iget(9094)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9095)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9096);bp += 3;
            __CLR4_5_2694694lusyjkeu.R.inc(9097);ch = charAt(bp);
            __CLR4_5_2694694lusyjkeu.R.inc(9098);token = JSONToken.SET;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(9099);nextToken();
        }

        }}}__CLR4_5_2694694lusyjkeu.R.inc(9100);return true;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public int matchField(long fieldNameHash) {try{__CLR4_5_2694694lusyjkeu.R.inc(9101);
        __CLR4_5_2694694lusyjkeu.R.inc(9102);throw new UnsupportedOperationException();
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public boolean seekArrayToItem(int index) {try{__CLR4_5_2694694lusyjkeu.R.inc(9103);
        __CLR4_5_2694694lusyjkeu.R.inc(9104);throw new UnsupportedOperationException();
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public int seekObjectToField(long fieldNameHash, boolean deepScan) {try{__CLR4_5_2694694lusyjkeu.R.inc(9105);
        __CLR4_5_2694694lusyjkeu.R.inc(9106);throw new UnsupportedOperationException();
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public int seekObjectToField(long[] fieldNameHash) {try{__CLR4_5_2694694lusyjkeu.R.inc(9107);
        __CLR4_5_2694694lusyjkeu.R.inc(9108);throw new UnsupportedOperationException();
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public int seekObjectToFieldDeepScan(long fieldNameHash) {try{__CLR4_5_2694694lusyjkeu.R.inc(9109);
        __CLR4_5_2694694lusyjkeu.R.inc(9110);throw new UnsupportedOperationException();
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public void skipObject() {try{__CLR4_5_2694694lusyjkeu.R.inc(9111);
        __CLR4_5_2694694lusyjkeu.R.inc(9112);throw new UnsupportedOperationException();
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public void skipObject(boolean valid) {try{__CLR4_5_2694694lusyjkeu.R.inc(9113);
        __CLR4_5_2694694lusyjkeu.R.inc(9114);throw new UnsupportedOperationException();
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public void skipArray() {try{__CLR4_5_2694694lusyjkeu.R.inc(9115);
        __CLR4_5_2694694lusyjkeu.R.inc(9116);throw new UnsupportedOperationException();
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public abstract int indexOf(char ch, int startIndex);

    public abstract String addSymbol(int offset, int len, int hash, final SymbolTable symbolTable);

    public String scanFieldString(char[] fieldName) {try{__CLR4_5_2694694lusyjkeu.R.inc(9117);
        __CLR4_5_2694694lusyjkeu.R.inc(9118);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(9119);if ((((!charArrayCompare(fieldName))&&(__CLR4_5_2694694lusyjkeu.R.iget(9120)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9121)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9122);matchStat = NOT_MATCH_NAME;
            __CLR4_5_2694694lusyjkeu.R.inc(9123);return stringDefaultValue();
        }

        // int index = bp + fieldName.length;

        }__CLR4_5_2694694lusyjkeu.R.inc(9124);int offset = fieldName.length;
        __CLR4_5_2694694lusyjkeu.R.inc(9125);char chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(9126);if ((((chLocal != '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(9127)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9128)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9129);matchStat = NOT_MATCH;

            __CLR4_5_2694694lusyjkeu.R.inc(9130);return stringDefaultValue();
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9131);final String strVal;
        {
            __CLR4_5_2694694lusyjkeu.R.inc(9132);int startIndex = bp + fieldName.length + 1;
            __CLR4_5_2694694lusyjkeu.R.inc(9133);int endIndex = indexOf('"', startIndex);
            __CLR4_5_2694694lusyjkeu.R.inc(9134);if ((((endIndex == -1)&&(__CLR4_5_2694694lusyjkeu.R.iget(9135)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9136)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9137);throw new JSONException("unclosed str");
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(9138);int startIndex2 = bp + fieldName.length + 1; // must re compute
            __CLR4_5_2694694lusyjkeu.R.inc(9139);String stringVal = subString(startIndex2, endIndex - startIndex2);
            __CLR4_5_2694694lusyjkeu.R.inc(9140);if ((((stringVal.indexOf('\\') != -1)&&(__CLR4_5_2694694lusyjkeu.R.iget(9141)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9142)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9143);for (;;) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(9144);int slashCount = 0;
                    __CLR4_5_2694694lusyjkeu.R.inc(9145);for (int i = endIndex - 1; (((i >= 0)&&(__CLR4_5_2694694lusyjkeu.R.iget(9146)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9147)==0&false)); --i) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(9148);if ((((charAt(i) == '\\')&&(__CLR4_5_2694694lusyjkeu.R.iget(9149)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9150)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(9151);slashCount++;
                        } }else {{
                            __CLR4_5_2694694lusyjkeu.R.inc(9152);break;
                        }
                    }}
                    }__CLR4_5_2694694lusyjkeu.R.inc(9153);if ((((slashCount % 2 == 0)&&(__CLR4_5_2694694lusyjkeu.R.iget(9154)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9155)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(9156);break;
                    }
                    }__CLR4_5_2694694lusyjkeu.R.inc(9157);endIndex = indexOf('"', endIndex + 1);
                }

                }__CLR4_5_2694694lusyjkeu.R.inc(9158);int chars_len = endIndex - (bp + fieldName.length + 1);
                __CLR4_5_2694694lusyjkeu.R.inc(9159);char[] chars = sub_chars( bp + fieldName.length + 1, chars_len);

                __CLR4_5_2694694lusyjkeu.R.inc(9160);stringVal = readString(chars, chars_len);
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(9161);offset += (endIndex - (bp + fieldName.length + 1) + 1);
            __CLR4_5_2694694lusyjkeu.R.inc(9162);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(9163);strVal = stringVal;
        }

        __CLR4_5_2694694lusyjkeu.R.inc(9164);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(9165)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9166)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9167);bp += offset;
            __CLR4_5_2694694lusyjkeu.R.inc(9168);this.ch = this.charAt(bp);
            __CLR4_5_2694694lusyjkeu.R.inc(9169);matchStat = VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(9170);return strVal;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9171);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(9172)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9173)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9174);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(9175);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(9176)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9177)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9178);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(9179);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9180);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9181);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(9182)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9183)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9184);token = JSONToken.RBRACKET;
                __CLR4_5_2694694lusyjkeu.R.inc(9185);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9186);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9187);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(9188)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9189)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9190);token = JSONToken.RBRACE;
                __CLR4_5_2694694lusyjkeu.R.inc(9191);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9192);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9193);if ((((chLocal == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(9194)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9195)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9196);token = JSONToken.EOF;
                __CLR4_5_2694694lusyjkeu.R.inc(9197);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(9198);ch = EOI;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(9199);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(9200);return stringDefaultValue();
            }
            }}}}__CLR4_5_2694694lusyjkeu.R.inc(9201);matchStat = END;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(9202);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(9203);return stringDefaultValue();
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9204);return strVal;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public String scanString(char expectNextChar) {try{__CLR4_5_2694694lusyjkeu.R.inc(9205);
        __CLR4_5_2694694lusyjkeu.R.inc(9206);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(9207);int offset = 0;
        __CLR4_5_2694694lusyjkeu.R.inc(9208);char chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(9209);if ((((chLocal == 'n')&&(__CLR4_5_2694694lusyjkeu.R.iget(9210)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9211)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9212);if ((((charAt(bp + offset) == 'u' && charAt(bp + offset + 1) == 'l' && charAt(bp + offset + 2) == 'l')&&(__CLR4_5_2694694lusyjkeu.R.iget(9213)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9214)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9215);offset += 3;
                __CLR4_5_2694694lusyjkeu.R.inc(9216);chLocal = charAt(bp + (offset++));
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(9217);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(9218);return null;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(9219);if ((((chLocal == expectNextChar)&&(__CLR4_5_2694694lusyjkeu.R.iget(9220)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9221)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9222);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9223);this.ch = this.charAt(bp);
                __CLR4_5_2694694lusyjkeu.R.inc(9224);matchStat = VALUE;
                __CLR4_5_2694694lusyjkeu.R.inc(9225);return null;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(9226);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(9227);return null;
            }
        }}

        }__CLR4_5_2694694lusyjkeu.R.inc(9228);final String strVal;
        __CLR4_5_2694694lusyjkeu.R.inc(9229);for (;;) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9230);if ((((chLocal == '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(9231)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9232)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9233);int startIndex = bp + offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9234);int endIndex = indexOf('"', startIndex);
                __CLR4_5_2694694lusyjkeu.R.inc(9235);if ((((endIndex == -1)&&(__CLR4_5_2694694lusyjkeu.R.iget(9236)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9237)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(9238);throw new JSONException("unclosed str");
                }

                }__CLR4_5_2694694lusyjkeu.R.inc(9239);String stringVal = subString(bp + offset, endIndex - startIndex);
                __CLR4_5_2694694lusyjkeu.R.inc(9240);if ((((stringVal.indexOf('\\') != -1)&&(__CLR4_5_2694694lusyjkeu.R.iget(9241)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9242)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(9243);for (; ; ) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(9244);int slashCount = 0;
                        __CLR4_5_2694694lusyjkeu.R.inc(9245);for (int i = endIndex - 1; (((i >= 0)&&(__CLR4_5_2694694lusyjkeu.R.iget(9246)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9247)==0&false)); --i) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(9248);if ((((charAt(i) == '\\')&&(__CLR4_5_2694694lusyjkeu.R.iget(9249)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9250)==0&false))) {{
                                __CLR4_5_2694694lusyjkeu.R.inc(9251);slashCount++;
                            } }else {{
                                __CLR4_5_2694694lusyjkeu.R.inc(9252);break;
                            }
                        }}
                        }__CLR4_5_2694694lusyjkeu.R.inc(9253);if ((((slashCount % 2 == 0)&&(__CLR4_5_2694694lusyjkeu.R.iget(9254)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9255)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(9256);break;
                        }
                        }__CLR4_5_2694694lusyjkeu.R.inc(9257);endIndex = indexOf('"', endIndex + 1);
                    }

                    }__CLR4_5_2694694lusyjkeu.R.inc(9258);int chars_len = endIndex - startIndex;
                    __CLR4_5_2694694lusyjkeu.R.inc(9259);char[] chars = sub_chars(bp + 1, chars_len);

                    __CLR4_5_2694694lusyjkeu.R.inc(9260);stringVal = readString(chars, chars_len);
                }

                }__CLR4_5_2694694lusyjkeu.R.inc(9261);offset += (endIndex - startIndex + 1);
                __CLR4_5_2694694lusyjkeu.R.inc(9262);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(9263);strVal = stringVal;
                __CLR4_5_2694694lusyjkeu.R.inc(9264);break;
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9265);if ((((isWhitespace(chLocal))&&(__CLR4_5_2694694lusyjkeu.R.iget(9266)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9267)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9268);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(9269);continue;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(9270);matchStat = NOT_MATCH;

                __CLR4_5_2694694lusyjkeu.R.inc(9271);return stringDefaultValue();
            }
        }}}

        }__CLR4_5_2694694lusyjkeu.R.inc(9272);for (;;) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9273);if ((((chLocal == expectNextChar)&&(__CLR4_5_2694694lusyjkeu.R.iget(9274)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9275)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9276);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9277);this.ch = charAt(bp);
                __CLR4_5_2694694lusyjkeu.R.inc(9278);matchStat = VALUE;
                __CLR4_5_2694694lusyjkeu.R.inc(9279);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(9280);return strVal;
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9281);if ((((isWhitespace(chLocal))&&(__CLR4_5_2694694lusyjkeu.R.iget(9282)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9283)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9284);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(9285);continue;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(9286);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(9287);return strVal;
            }
        }}}
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public long scanFieldSymbol(char[] fieldName) {try{__CLR4_5_2694694lusyjkeu.R.inc(9288);
        __CLR4_5_2694694lusyjkeu.R.inc(9289);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(9290);if ((((!charArrayCompare(fieldName))&&(__CLR4_5_2694694lusyjkeu.R.iget(9291)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9292)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9293);matchStat = NOT_MATCH_NAME;
            __CLR4_5_2694694lusyjkeu.R.inc(9294);return 0;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9295);int offset = fieldName.length;
        __CLR4_5_2694694lusyjkeu.R.inc(9296);char chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(9297);if ((((chLocal != '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(9298)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9299)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9300);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(9301);return 0;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9302);long hash = 0xcbf29ce484222325L;
        __CLR4_5_2694694lusyjkeu.R.inc(9303);for (;;) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9304);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(9305);if ((((chLocal == '\"')&&(__CLR4_5_2694694lusyjkeu.R.iget(9306)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9307)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9308);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(9309);break;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(9310);hash ^= chLocal;
            __CLR4_5_2694694lusyjkeu.R.inc(9311);hash *= 0x100000001b3L;

            __CLR4_5_2694694lusyjkeu.R.inc(9312);if ((((chLocal == '\\')&&(__CLR4_5_2694694lusyjkeu.R.iget(9313)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9314)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9315);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(9316);return 0;
            }
        }}

        }__CLR4_5_2694694lusyjkeu.R.inc(9317);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(9318)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9319)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9320);bp += offset;
            __CLR4_5_2694694lusyjkeu.R.inc(9321);this.ch = this.charAt(bp);
            __CLR4_5_2694694lusyjkeu.R.inc(9322);matchStat = VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(9323);return hash;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9324);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(9325)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9326)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9327);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(9328);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(9329)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9330)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9331);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(9332);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9333);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9334);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(9335)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9336)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9337);token = JSONToken.RBRACKET;
                __CLR4_5_2694694lusyjkeu.R.inc(9338);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9339);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9340);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(9341)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9342)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9343);token = JSONToken.RBRACE;
                __CLR4_5_2694694lusyjkeu.R.inc(9344);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9345);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9346);if ((((chLocal == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(9347)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9348)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9349);token = JSONToken.EOF;
                __CLR4_5_2694694lusyjkeu.R.inc(9350);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(9351);ch = EOI;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(9352);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(9353);return 0;
            }
            }}}}__CLR4_5_2694694lusyjkeu.R.inc(9354);matchStat = END;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(9355);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(9356);return 0;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9357);return hash;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public long scanEnumSymbol(char[] fieldName) {try{__CLR4_5_2694694lusyjkeu.R.inc(9358);
        __CLR4_5_2694694lusyjkeu.R.inc(9359);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(9360);if ((((!charArrayCompare(fieldName))&&(__CLR4_5_2694694lusyjkeu.R.iget(9361)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9362)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9363);matchStat = NOT_MATCH_NAME;
            __CLR4_5_2694694lusyjkeu.R.inc(9364);return 0;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9365);int offset = fieldName.length;
        __CLR4_5_2694694lusyjkeu.R.inc(9366);char chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(9367);if ((((chLocal != '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(9368)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9369)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9370);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(9371);return 0;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9372);long hash = 0xcbf29ce484222325L;
        __CLR4_5_2694694lusyjkeu.R.inc(9373);for (;;) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9374);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(9375);if ((((chLocal == '\"')&&(__CLR4_5_2694694lusyjkeu.R.iget(9376)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9377)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9378);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(9379);break;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(9380);hash ^= (((((chLocal >= 'A' && chLocal <= 'Z') )&&(__CLR4_5_2694694lusyjkeu.R.iget(9381)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9382)==0&false))? (chLocal + 32) : chLocal);
            __CLR4_5_2694694lusyjkeu.R.inc(9383);hash *= 0x100000001b3L;

            __CLR4_5_2694694lusyjkeu.R.inc(9384);if ((((chLocal == '\\')&&(__CLR4_5_2694694lusyjkeu.R.iget(9385)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9386)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9387);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(9388);return 0;
            }
        }}

        }__CLR4_5_2694694lusyjkeu.R.inc(9389);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(9390)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9391)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9392);bp += offset;
            __CLR4_5_2694694lusyjkeu.R.inc(9393);this.ch = this.charAt(bp);
            __CLR4_5_2694694lusyjkeu.R.inc(9394);matchStat = VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(9395);return hash;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9396);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(9397)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9398)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9399);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(9400);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(9401)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9402)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9403);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(9404);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9405);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9406);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(9407)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9408)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9409);token = JSONToken.RBRACKET;
                __CLR4_5_2694694lusyjkeu.R.inc(9410);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9411);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9412);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(9413)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9414)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9415);token = JSONToken.RBRACE;
                __CLR4_5_2694694lusyjkeu.R.inc(9416);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9417);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9418);if ((((chLocal == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(9419)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9420)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9421);token = JSONToken.EOF;
                __CLR4_5_2694694lusyjkeu.R.inc(9422);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(9423);ch = EOI;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(9424);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(9425);return 0;
            }
            }}}}__CLR4_5_2694694lusyjkeu.R.inc(9426);matchStat = END;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(9427);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(9428);return 0;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9429);return hash;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Enum<?> scanEnum(Class<?> enumClass, final SymbolTable symbolTable, char serperator) {try{__CLR4_5_2694694lusyjkeu.R.inc(9430);
        __CLR4_5_2694694lusyjkeu.R.inc(9431);String name = scanSymbolWithSeperator(symbolTable, serperator);
        __CLR4_5_2694694lusyjkeu.R.inc(9432);if ((((name == null)&&(__CLR4_5_2694694lusyjkeu.R.iget(9433)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9434)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9435);return null;
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(9436);return Enum.valueOf((Class<? extends Enum>) enumClass, name);
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public String scanSymbolWithSeperator(final SymbolTable symbolTable, char serperator) {try{__CLR4_5_2694694lusyjkeu.R.inc(9437);
        __CLR4_5_2694694lusyjkeu.R.inc(9438);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(9439);int offset = 0;
        __CLR4_5_2694694lusyjkeu.R.inc(9440);char chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(9441);if ((((chLocal == 'n')&&(__CLR4_5_2694694lusyjkeu.R.iget(9442)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9443)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9444);if ((((charAt(bp + offset) == 'u' && charAt(bp + offset + 1) == 'l' && charAt(bp + offset + 2) == 'l')&&(__CLR4_5_2694694lusyjkeu.R.iget(9445)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9446)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9447);offset += 3;
                __CLR4_5_2694694lusyjkeu.R.inc(9448);chLocal = charAt(bp + (offset++));
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(9449);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(9450);return null;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(9451);if ((((chLocal == serperator)&&(__CLR4_5_2694694lusyjkeu.R.iget(9452)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9453)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9454);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9455);this.ch = this.charAt(bp);
                __CLR4_5_2694694lusyjkeu.R.inc(9456);matchStat = VALUE;
                __CLR4_5_2694694lusyjkeu.R.inc(9457);return null;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(9458);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(9459);return null;
            }
        }}

        }__CLR4_5_2694694lusyjkeu.R.inc(9460);if ((((chLocal != '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(9461)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9462)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9463);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(9464);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9465);String strVal;
        // int start = index;
        __CLR4_5_2694694lusyjkeu.R.inc(9466);int hash = 0;
        __CLR4_5_2694694lusyjkeu.R.inc(9467);for (;;) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9468);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(9469);if ((((chLocal == '\"')&&(__CLR4_5_2694694lusyjkeu.R.iget(9470)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9471)==0&false))) {{
                // bp = index;
                // this.ch = chLocal = charAt(bp);
                __CLR4_5_2694694lusyjkeu.R.inc(9472);int start = bp + 0 + 1;
                __CLR4_5_2694694lusyjkeu.R.inc(9473);int len = bp + offset - start - 1;
                __CLR4_5_2694694lusyjkeu.R.inc(9474);strVal = addSymbol(start, len, hash, symbolTable);
                __CLR4_5_2694694lusyjkeu.R.inc(9475);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(9476);break;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(9477);hash = 31 * hash + chLocal;

            __CLR4_5_2694694lusyjkeu.R.inc(9478);if ((((chLocal == '\\')&&(__CLR4_5_2694694lusyjkeu.R.iget(9479)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9480)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9481);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(9482);return null;
            }
        }}

        }__CLR4_5_2694694lusyjkeu.R.inc(9483);for (;;) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9484);if ((((chLocal == serperator)&&(__CLR4_5_2694694lusyjkeu.R.iget(9485)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9486)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9487);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9488);this.ch = this.charAt(bp);
                __CLR4_5_2694694lusyjkeu.R.inc(9489);matchStat = VALUE;
                __CLR4_5_2694694lusyjkeu.R.inc(9490);return strVal;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(9491);if ((((isWhitespace(chLocal))&&(__CLR4_5_2694694lusyjkeu.R.iget(9492)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9493)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(9494);chLocal = charAt(bp + (offset++));
                    __CLR4_5_2694694lusyjkeu.R.inc(9495);continue;
                }

                }__CLR4_5_2694694lusyjkeu.R.inc(9496);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(9497);return strVal;
            }
        }}
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public Collection<String> newCollectionByType(Class<?> type){try{__CLR4_5_2694694lusyjkeu.R.inc(9498);
        __CLR4_5_2694694lusyjkeu.R.inc(9499);if ((((type.isAssignableFrom(HashSet.class))&&(__CLR4_5_2694694lusyjkeu.R.iget(9500)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9501)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9502);HashSet<String> list = new HashSet<String>();
            __CLR4_5_2694694lusyjkeu.R.inc(9503);return list;
        } }else {__CLR4_5_2694694lusyjkeu.R.inc(9504);if ((((type.isAssignableFrom(ArrayList.class))&&(__CLR4_5_2694694lusyjkeu.R.iget(9505)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9506)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9507);ArrayList<String> list2 = new ArrayList<String>();
            __CLR4_5_2694694lusyjkeu.R.inc(9508);return list2;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(9509);try {
                __CLR4_5_2694694lusyjkeu.R.inc(9510);Collection<String> list = (Collection<String>) type.newInstance();
                __CLR4_5_2694694lusyjkeu.R.inc(9511);return list;
            } catch (Exception e) {
                __CLR4_5_2694694lusyjkeu.R.inc(9512);throw new JSONException(e.getMessage(), e);
            }
        }
    }}}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public Collection<String> scanFieldStringArray(char[] fieldName, Class<?> type) {try{__CLR4_5_2694694lusyjkeu.R.inc(9513);
        __CLR4_5_2694694lusyjkeu.R.inc(9514);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(9515);if ((((!charArrayCompare(fieldName))&&(__CLR4_5_2694694lusyjkeu.R.iget(9516)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9517)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9518);matchStat = NOT_MATCH_NAME;
            __CLR4_5_2694694lusyjkeu.R.inc(9519);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9520);Collection<String> list = newCollectionByType(type);

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

        // int index = bp + fieldName.length;

        __CLR4_5_2694694lusyjkeu.R.inc(9521);int offset = fieldName.length;
        __CLR4_5_2694694lusyjkeu.R.inc(9522);char chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(9523);if ((((chLocal != '[')&&(__CLR4_5_2694694lusyjkeu.R.iget(9524)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9525)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9526);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(9527);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9528);chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(9529);for (;;) {{
            // int start = index;
            __CLR4_5_2694694lusyjkeu.R.inc(9530);if ((((chLocal == '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(9531)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9532)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9533);int startIndex = bp + offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9534);int endIndex = indexOf('"', startIndex);
                __CLR4_5_2694694lusyjkeu.R.inc(9535);if ((((endIndex == -1)&&(__CLR4_5_2694694lusyjkeu.R.iget(9536)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9537)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(9538);throw new JSONException("unclosed str");
                }

                }__CLR4_5_2694694lusyjkeu.R.inc(9539);int startIndex2 = bp + offset; // must re compute
                __CLR4_5_2694694lusyjkeu.R.inc(9540);String stringVal = subString(startIndex2, endIndex - startIndex2);
                __CLR4_5_2694694lusyjkeu.R.inc(9541);if ((((stringVal.indexOf('\\') != -1)&&(__CLR4_5_2694694lusyjkeu.R.iget(9542)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9543)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(9544);for (;;) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(9545);int slashCount = 0;
                        __CLR4_5_2694694lusyjkeu.R.inc(9546);for (int i = endIndex - 1; (((i >= 0)&&(__CLR4_5_2694694lusyjkeu.R.iget(9547)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9548)==0&false)); --i) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(9549);if ((((charAt(i) == '\\')&&(__CLR4_5_2694694lusyjkeu.R.iget(9550)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9551)==0&false))) {{
                                __CLR4_5_2694694lusyjkeu.R.inc(9552);slashCount++;
                            } }else {{
                                __CLR4_5_2694694lusyjkeu.R.inc(9553);break;
                            }
                        }}
                        }__CLR4_5_2694694lusyjkeu.R.inc(9554);if ((((slashCount % 2 == 0)&&(__CLR4_5_2694694lusyjkeu.R.iget(9555)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9556)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(9557);break;
                        }
                        }__CLR4_5_2694694lusyjkeu.R.inc(9558);endIndex = indexOf('"', endIndex + 1);
                    }

                    }__CLR4_5_2694694lusyjkeu.R.inc(9559);int chars_len = endIndex - (bp + offset);
                    __CLR4_5_2694694lusyjkeu.R.inc(9560);char[] chars = sub_chars(bp + offset, chars_len);

                    __CLR4_5_2694694lusyjkeu.R.inc(9561);stringVal = readString(chars, chars_len);
                }

                }__CLR4_5_2694694lusyjkeu.R.inc(9562);offset += (endIndex - (bp + offset) + 1);
                __CLR4_5_2694694lusyjkeu.R.inc(9563);chLocal = charAt(bp + (offset++));

                __CLR4_5_2694694lusyjkeu.R.inc(9564);list.add(stringVal);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9565);if ((((chLocal == 'n' //
                    && charAt(bp + offset) == 'u' //
                    && charAt(bp + offset + 1) == 'l' //
                    && charAt(bp + offset + 2) == 'l')&&(__CLR4_5_2694694lusyjkeu.R.iget(9566)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9567)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9568);offset += 3;
                __CLR4_5_2694694lusyjkeu.R.inc(9569);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(9570);list.add(null);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9571);if ((((chLocal == ']' && list.size() == 0)&&(__CLR4_5_2694694lusyjkeu.R.iget(9572)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9573)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9574);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(9575);break;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(9576);throw new JSONException("illega str");
            }

            }}}__CLR4_5_2694694lusyjkeu.R.inc(9577);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(9578)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9579)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9580);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(9581);continue;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(9582);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(9583)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9584)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9585);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(9586);break;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(9587);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(9588);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9589);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(9590)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9591)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9592);bp += offset;
            __CLR4_5_2694694lusyjkeu.R.inc(9593);this.ch = this.charAt(bp);
            __CLR4_5_2694694lusyjkeu.R.inc(9594);matchStat = VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(9595);return list;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9596);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(9597)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9598)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9599);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(9600);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(9601)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9602)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9603);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(9604);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9605);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9606);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(9607)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9608)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9609);token = JSONToken.RBRACKET;
                __CLR4_5_2694694lusyjkeu.R.inc(9610);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9611);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9612);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(9613)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9614)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9615);token = JSONToken.RBRACE;
                __CLR4_5_2694694lusyjkeu.R.inc(9616);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9617);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9618);if ((((chLocal == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(9619)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9620)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9621);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(9622);token = JSONToken.EOF;
                __CLR4_5_2694694lusyjkeu.R.inc(9623);this.ch = EOI;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(9624);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(9625);return null;
            }
            }}}}__CLR4_5_2694694lusyjkeu.R.inc(9626);matchStat = END;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(9627);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(9628);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9629);return list;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public void scanStringArray(Collection<String> list, char seperator) {try{__CLR4_5_2694694lusyjkeu.R.inc(9630);
        __CLR4_5_2694694lusyjkeu.R.inc(9631);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(9632);int offset = 0;
        __CLR4_5_2694694lusyjkeu.R.inc(9633);char chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(9634);if ((((chLocal == 'n'
                && charAt(bp + offset) == 'u'
                && charAt(bp + offset + 1) == 'l'
                && charAt(bp + offset + 2) == 'l'
                && charAt(bp + offset + 3) == seperator
        )&&(__CLR4_5_2694694lusyjkeu.R.iget(9635)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9636)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9637);bp += 5;
            __CLR4_5_2694694lusyjkeu.R.inc(9638);ch = charAt(bp);
            __CLR4_5_2694694lusyjkeu.R.inc(9639);matchStat = VALUE_NULL;
            __CLR4_5_2694694lusyjkeu.R.inc(9640);return;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9641);if ((((chLocal != '[')&&(__CLR4_5_2694694lusyjkeu.R.iget(9642)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9643)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9644);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(9645);return;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9646);chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(9647);for (;;) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9648);if ((((chLocal == 'n' //
                    && charAt(bp + offset) == 'u' //
                    && charAt(bp + offset + 1) == 'l' //
                    && charAt(bp + offset + 2) == 'l')&&(__CLR4_5_2694694lusyjkeu.R.iget(9649)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9650)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9651);offset += 3;
                __CLR4_5_2694694lusyjkeu.R.inc(9652);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(9653);list.add(null);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9654);if ((((chLocal == ']' && list.size() == 0)&&(__CLR4_5_2694694lusyjkeu.R.iget(9655)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9656)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9657);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(9658);break;
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9659);if ((((chLocal != '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(9660)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9661)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9662);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(9663);return;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(9664);int startIndex = bp + offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9665);int endIndex = indexOf('"', startIndex);
                __CLR4_5_2694694lusyjkeu.R.inc(9666);if ((((endIndex == -1)&&(__CLR4_5_2694694lusyjkeu.R.iget(9667)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9668)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(9669);throw new JSONException("unclosed str");
                }

                }__CLR4_5_2694694lusyjkeu.R.inc(9670);String stringVal = subString(bp + offset, endIndex - startIndex);
                __CLR4_5_2694694lusyjkeu.R.inc(9671);if ((((stringVal.indexOf('\\') != -1)&&(__CLR4_5_2694694lusyjkeu.R.iget(9672)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9673)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(9674);for (;;) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(9675);int slashCount = 0;
                        __CLR4_5_2694694lusyjkeu.R.inc(9676);for (int i = endIndex - 1; (((i >= 0)&&(__CLR4_5_2694694lusyjkeu.R.iget(9677)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9678)==0&false)); --i) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(9679);if ((((charAt(i) == '\\')&&(__CLR4_5_2694694lusyjkeu.R.iget(9680)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9681)==0&false))) {{
                                __CLR4_5_2694694lusyjkeu.R.inc(9682);slashCount++;
                            } }else {{
                                __CLR4_5_2694694lusyjkeu.R.inc(9683);break;
                            }
                        }}
                        }__CLR4_5_2694694lusyjkeu.R.inc(9684);if ((((slashCount % 2 == 0)&&(__CLR4_5_2694694lusyjkeu.R.iget(9685)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9686)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(9687);break;
                        }
                        }__CLR4_5_2694694lusyjkeu.R.inc(9688);endIndex = indexOf('"', endIndex + 1);
                    }

                    }__CLR4_5_2694694lusyjkeu.R.inc(9689);int chars_len = endIndex - startIndex;
                    __CLR4_5_2694694lusyjkeu.R.inc(9690);char[] chars = sub_chars(bp + offset, chars_len);

                    __CLR4_5_2694694lusyjkeu.R.inc(9691);stringVal = readString(chars, chars_len);
                }

                }__CLR4_5_2694694lusyjkeu.R.inc(9692);offset += (endIndex - (bp + offset) + 1);
                __CLR4_5_2694694lusyjkeu.R.inc(9693);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(9694);list.add(stringVal);
            }

            }}}__CLR4_5_2694694lusyjkeu.R.inc(9695);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(9696)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9697)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9698);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(9699);continue;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(9700);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(9701)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9702)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9703);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(9704);break;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(9705);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(9706);return;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9707);if ((((chLocal == seperator)&&(__CLR4_5_2694694lusyjkeu.R.iget(9708)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9709)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9710);bp += offset;
            __CLR4_5_2694694lusyjkeu.R.inc(9711);this.ch = this.charAt(bp);
            __CLR4_5_2694694lusyjkeu.R.inc(9712);matchStat = VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(9713);return;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(9714);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(9715);return;
        }
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public int scanFieldInt(char[] fieldName) {try{__CLR4_5_2694694lusyjkeu.R.inc(9716);
        __CLR4_5_2694694lusyjkeu.R.inc(9717);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(9718);if ((((!charArrayCompare(fieldName))&&(__CLR4_5_2694694lusyjkeu.R.iget(9719)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9720)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9721);matchStat = NOT_MATCH_NAME;
            __CLR4_5_2694694lusyjkeu.R.inc(9722);return 0;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9723);int offset = fieldName.length;
        __CLR4_5_2694694lusyjkeu.R.inc(9724);char chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(9725);final boolean negative = chLocal == '-';
        __CLR4_5_2694694lusyjkeu.R.inc(9726);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(9727)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9728)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9729);chLocal = charAt(bp + (offset++));
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9730);int value;
        __CLR4_5_2694694lusyjkeu.R.inc(9731);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(9732)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9733)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9734);value = chLocal - '0';
            __CLR4_5_2694694lusyjkeu.R.inc(9735);for (;;) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9736);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(9737);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(9738)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9739)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(9740);value = value * 10 + (chLocal - '0');
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(9741);if ((((chLocal == '.')&&(__CLR4_5_2694694lusyjkeu.R.iget(9742)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9743)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(9744);matchStat = NOT_MATCH;
                    __CLR4_5_2694694lusyjkeu.R.inc(9745);return 0;
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(9746);break;
                }
            }}}
            }__CLR4_5_2694694lusyjkeu.R.inc(9747);if ((((value < 0 //
                    || offset > 11 + 3 + fieldName.length)&&(__CLR4_5_2694694lusyjkeu.R.iget(9748)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9749)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9750);if ((((value != Integer.MIN_VALUE //
                        || offset != 17 //
                        || !negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(9751)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9752)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(9753);matchStat = NOT_MATCH;
                    __CLR4_5_2694694lusyjkeu.R.inc(9754);return 0;
                }
            }}
        }} }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(9755);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(9756);return 0;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9757);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(9758)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9759)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9760);bp += offset;
            __CLR4_5_2694694lusyjkeu.R.inc(9761);this.ch = this.charAt(bp);
            __CLR4_5_2694694lusyjkeu.R.inc(9762);matchStat = VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(9763);token = JSONToken.COMMA;
            __CLR4_5_2694694lusyjkeu.R.inc(9764);return (((negative )&&(__CLR4_5_2694694lusyjkeu.R.iget(9765)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9766)==0&false))? -value : value;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9767);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(9768)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9769)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9770);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(9771);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(9772)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9773)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9774);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(9775);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9776);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9777);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(9778)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9779)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9780);token = JSONToken.RBRACKET;
                __CLR4_5_2694694lusyjkeu.R.inc(9781);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9782);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9783);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(9784)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9785)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9786);token = JSONToken.RBRACE;
                __CLR4_5_2694694lusyjkeu.R.inc(9787);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9788);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9789);if ((((chLocal == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(9790)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9791)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9792);token = JSONToken.EOF;
                __CLR4_5_2694694lusyjkeu.R.inc(9793);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(9794);ch = EOI;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(9795);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(9796);return 0;
            }
            }}}}__CLR4_5_2694694lusyjkeu.R.inc(9797);matchStat = END;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(9798);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(9799);return 0;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9800);return (((negative )&&(__CLR4_5_2694694lusyjkeu.R.iget(9801)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9802)==0&false))? -value : value;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final int[] scanFieldIntArray(char[] fieldName) {try{__CLR4_5_2694694lusyjkeu.R.inc(9803);
        __CLR4_5_2694694lusyjkeu.R.inc(9804);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(9805);if ((((!charArrayCompare(fieldName))&&(__CLR4_5_2694694lusyjkeu.R.iget(9806)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9807)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9808);matchStat = NOT_MATCH_NAME;
            __CLR4_5_2694694lusyjkeu.R.inc(9809);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9810);int offset = fieldName.length;
        __CLR4_5_2694694lusyjkeu.R.inc(9811);char chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(9812);if ((((chLocal != '[')&&(__CLR4_5_2694694lusyjkeu.R.iget(9813)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9814)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9815);matchStat = NOT_MATCH_NAME;
            __CLR4_5_2694694lusyjkeu.R.inc(9816);return null;
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(9817);chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(9818);int[] array = new int[16];
        __CLR4_5_2694694lusyjkeu.R.inc(9819);int arrayIndex = 0;

        __CLR4_5_2694694lusyjkeu.R.inc(9820);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(9821)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9822)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9823);chLocal = charAt(bp + (offset++));
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(9824);for (;;) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9825);boolean nagative = false;
                __CLR4_5_2694694lusyjkeu.R.inc(9826);if ((((chLocal == '-')&&(__CLR4_5_2694694lusyjkeu.R.iget(9827)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9828)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(9829);chLocal = charAt(bp + (offset++));
                    __CLR4_5_2694694lusyjkeu.R.inc(9830);nagative = true;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(9831);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(9832)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9833)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(9834);int value = chLocal - '0';
                    __CLR4_5_2694694lusyjkeu.R.inc(9835);for (; ; ) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(9836);chLocal = charAt(bp + (offset++));

                        __CLR4_5_2694694lusyjkeu.R.inc(9837);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(9838)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9839)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(9840);value = value * 10 + (chLocal - '0');
                        } }else {{
                            __CLR4_5_2694694lusyjkeu.R.inc(9841);break;
                        }
                    }}

                    }__CLR4_5_2694694lusyjkeu.R.inc(9842);if ((((arrayIndex >= array.length)&&(__CLR4_5_2694694lusyjkeu.R.iget(9843)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9844)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(9845);int[] tmp = new int[array.length * 3 / 2];
                        __CLR4_5_2694694lusyjkeu.R.inc(9846);System.arraycopy(array, 0, tmp, 0, arrayIndex);
                        __CLR4_5_2694694lusyjkeu.R.inc(9847);array = tmp;
                    }
                    }__CLR4_5_2694694lusyjkeu.R.inc(9848);array[arrayIndex++] = (((nagative )&&(__CLR4_5_2694694lusyjkeu.R.iget(9849)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9850)==0&false))? -value : value;

                    __CLR4_5_2694694lusyjkeu.R.inc(9851);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(9852)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9853)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(9854);chLocal = charAt(bp + (offset++));
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(9855);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(9856)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9857)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(9858);chLocal = charAt(bp + (offset++));
                        __CLR4_5_2694694lusyjkeu.R.inc(9859);break;
                    }
                }}} }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(9860);matchStat = NOT_MATCH;
                    __CLR4_5_2694694lusyjkeu.R.inc(9861);return null;
                }
            }}
        }}


        }__CLR4_5_2694694lusyjkeu.R.inc(9862);if ((((arrayIndex != array.length)&&(__CLR4_5_2694694lusyjkeu.R.iget(9863)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9864)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9865);int[] tmp = new int[arrayIndex];
            __CLR4_5_2694694lusyjkeu.R.inc(9866);System.arraycopy(array, 0, tmp, 0, arrayIndex);
            __CLR4_5_2694694lusyjkeu.R.inc(9867);array = tmp;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9868);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(9869)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9870)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9871);bp += (offset - 1);
            __CLR4_5_2694694lusyjkeu.R.inc(9872);this.next();
            __CLR4_5_2694694lusyjkeu.R.inc(9873);matchStat = VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(9874);token = JSONToken.COMMA;
            __CLR4_5_2694694lusyjkeu.R.inc(9875);return array;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9876);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(9877)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9878)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9879);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(9880);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(9881)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9882)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9883);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(9884);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(9885);this.next();
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9886);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(9887)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9888)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9889);token = JSONToken.RBRACKET;
                __CLR4_5_2694694lusyjkeu.R.inc(9890);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(9891);this.next();
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9892);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(9893)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9894)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9895);token = JSONToken.RBRACE;
                __CLR4_5_2694694lusyjkeu.R.inc(9896);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(9897);this.next();
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(9898);if ((((chLocal == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(9899)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9900)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9901);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(9902);token = JSONToken.EOF;
                __CLR4_5_2694694lusyjkeu.R.inc(9903);ch = EOI;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(9904);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(9905);return null;
            }
            }}}}__CLR4_5_2694694lusyjkeu.R.inc(9906);matchStat = END;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(9907);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(9908);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9909);return array;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public boolean scanBoolean(char expectNext) {try{__CLR4_5_2694694lusyjkeu.R.inc(9910);
        __CLR4_5_2694694lusyjkeu.R.inc(9911);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(9912);int offset = 0;
        __CLR4_5_2694694lusyjkeu.R.inc(9913);char chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(9914);boolean value = false;
        __CLR4_5_2694694lusyjkeu.R.inc(9915);if ((((chLocal == 't')&&(__CLR4_5_2694694lusyjkeu.R.iget(9916)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9917)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9918);if ((((charAt(bp + offset) == 'r' //
                    && charAt(bp + offset + 1) == 'u' //
                    && charAt(bp + offset + 2) == 'e')&&(__CLR4_5_2694694lusyjkeu.R.iget(9919)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9920)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9921);offset += 3;
                __CLR4_5_2694694lusyjkeu.R.inc(9922);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(9923);value = true;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(9924);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(9925);return false;
            }
        }} }else {__CLR4_5_2694694lusyjkeu.R.inc(9926);if ((((chLocal == 'f')&&(__CLR4_5_2694694lusyjkeu.R.iget(9927)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9928)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9929);if ((((charAt(bp + offset) == 'a' //
                    && charAt(bp + offset + 1) == 'l' //
                    && charAt(bp + offset + 2) == 's' //
                    && charAt(bp + offset + 3) == 'e')&&(__CLR4_5_2694694lusyjkeu.R.iget(9930)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9931)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9932);offset += 4;
                __CLR4_5_2694694lusyjkeu.R.inc(9933);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(9934);value = false;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(9935);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(9936);return false;
            }
        }} }else {__CLR4_5_2694694lusyjkeu.R.inc(9937);if ((((chLocal == '1')&&(__CLR4_5_2694694lusyjkeu.R.iget(9938)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9939)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9940);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(9941);value = true;
        } }else {__CLR4_5_2694694lusyjkeu.R.inc(9942);if ((((chLocal == '0')&&(__CLR4_5_2694694lusyjkeu.R.iget(9943)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9944)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9945);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(9946);value = false;
        }

        }}}}__CLR4_5_2694694lusyjkeu.R.inc(9947);for (;;) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9948);if ((((chLocal == expectNext)&&(__CLR4_5_2694694lusyjkeu.R.iget(9949)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9950)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9951);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(9952);this.ch = this.charAt(bp);
                __CLR4_5_2694694lusyjkeu.R.inc(9953);matchStat = VALUE;
                __CLR4_5_2694694lusyjkeu.R.inc(9954);return value;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(9955);if ((((isWhitespace(chLocal))&&(__CLR4_5_2694694lusyjkeu.R.iget(9956)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9957)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(9958);chLocal = charAt(bp + (offset++));
                    __CLR4_5_2694694lusyjkeu.R.inc(9959);continue;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(9960);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(9961);return value;
            }
        }}
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public int scanInt(char expectNext) {try{__CLR4_5_2694694lusyjkeu.R.inc(9962);
        __CLR4_5_2694694lusyjkeu.R.inc(9963);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(9964);int offset = 0;
        __CLR4_5_2694694lusyjkeu.R.inc(9965);char chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(9966);final boolean quote = chLocal == '"';
        __CLR4_5_2694694lusyjkeu.R.inc(9967);if ((((quote)&&(__CLR4_5_2694694lusyjkeu.R.iget(9968)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9969)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9970);chLocal = charAt(bp + (offset++));
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9971);final boolean negative = chLocal == '-';
        __CLR4_5_2694694lusyjkeu.R.inc(9972);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(9973)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9974)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9975);chLocal = charAt(bp + (offset++));
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(9976);int value;
        __CLR4_5_2694694lusyjkeu.R.inc(9977);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(9978)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9979)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(9980);value = chLocal - '0';
            __CLR4_5_2694694lusyjkeu.R.inc(9981);for (;;) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9982);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(9983);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(9984)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9985)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(9986);value = value * 10 + (chLocal - '0');
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(9987);if ((((chLocal == '.')&&(__CLR4_5_2694694lusyjkeu.R.iget(9988)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9989)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(9990);matchStat = NOT_MATCH;
                    __CLR4_5_2694694lusyjkeu.R.inc(9991);return 0;
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(9992);break;
                }
            }}}
            }__CLR4_5_2694694lusyjkeu.R.inc(9993);if ((((value < 0)&&(__CLR4_5_2694694lusyjkeu.R.iget(9994)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(9995)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(9996);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(9997);return 0;
            }
        }} }else {__CLR4_5_2694694lusyjkeu.R.inc(9998);if ((((chLocal == 'n' && charAt(bp + offset) == 'u' && charAt(bp + offset + 1) == 'l' && charAt(bp + offset + 2) == 'l')&&(__CLR4_5_2694694lusyjkeu.R.iget(9999)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10000)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10001);matchStat = VALUE_NULL;
            __CLR4_5_2694694lusyjkeu.R.inc(10002);value = 0;
            __CLR4_5_2694694lusyjkeu.R.inc(10003);offset += 3;
            __CLR4_5_2694694lusyjkeu.R.inc(10004);chLocal = charAt(bp + offset++);

            __CLR4_5_2694694lusyjkeu.R.inc(10005);if ((((quote && chLocal == '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(10006)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10007)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10008);chLocal = charAt(bp + offset++);
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(10009);for (;;) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10010);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(10011)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10012)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10013);bp += offset;
                    __CLR4_5_2694694lusyjkeu.R.inc(10014);this.ch = charAt(bp);
                    __CLR4_5_2694694lusyjkeu.R.inc(10015);matchStat = VALUE_NULL;
                    __CLR4_5_2694694lusyjkeu.R.inc(10016);token = JSONToken.COMMA;
                    __CLR4_5_2694694lusyjkeu.R.inc(10017);return value;
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(10018);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(10019)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10020)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10021);bp += offset;
                    __CLR4_5_2694694lusyjkeu.R.inc(10022);this.ch = charAt(bp);
                    __CLR4_5_2694694lusyjkeu.R.inc(10023);matchStat = VALUE_NULL;
                    __CLR4_5_2694694lusyjkeu.R.inc(10024);token = JSONToken.RBRACKET;
                    __CLR4_5_2694694lusyjkeu.R.inc(10025);return value;
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(10026);if ((((isWhitespace(chLocal))&&(__CLR4_5_2694694lusyjkeu.R.iget(10027)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10028)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10029);chLocal = charAt(bp + offset++);
                    __CLR4_5_2694694lusyjkeu.R.inc(10030);continue;
                }
                }}}__CLR4_5_2694694lusyjkeu.R.inc(10031);break;
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(10032);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(10033);return 0;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(10034);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(10035);return 0;
        }

        }}__CLR4_5_2694694lusyjkeu.R.inc(10036);for (;;) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10037);if ((((chLocal == expectNext)&&(__CLR4_5_2694694lusyjkeu.R.iget(10038)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10039)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10040);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(10041);this.ch = this.charAt(bp);
                __CLR4_5_2694694lusyjkeu.R.inc(10042);matchStat = VALUE;
                __CLR4_5_2694694lusyjkeu.R.inc(10043);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(10044);return (((negative )&&(__CLR4_5_2694694lusyjkeu.R.iget(10045)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10046)==0&false))? -value : value;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(10047);if ((((isWhitespace(chLocal))&&(__CLR4_5_2694694lusyjkeu.R.iget(10048)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10049)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10050);chLocal = charAt(bp + (offset++));
                    __CLR4_5_2694694lusyjkeu.R.inc(10051);continue;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(10052);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(10053);return (((negative )&&(__CLR4_5_2694694lusyjkeu.R.iget(10054)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10055)==0&false))? -value : value;
            }
        }}
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public boolean scanFieldBoolean(char[] fieldName) {try{__CLR4_5_2694694lusyjkeu.R.inc(10056);
        __CLR4_5_2694694lusyjkeu.R.inc(10057);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(10058);if ((((!charArrayCompare(fieldName))&&(__CLR4_5_2694694lusyjkeu.R.iget(10059)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10060)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10061);matchStat = NOT_MATCH_NAME;
            __CLR4_5_2694694lusyjkeu.R.inc(10062);return false;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10063);int offset = fieldName.length;
        __CLR4_5_2694694lusyjkeu.R.inc(10064);char chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(10065);boolean value;
        __CLR4_5_2694694lusyjkeu.R.inc(10066);if ((((chLocal == 't')&&(__CLR4_5_2694694lusyjkeu.R.iget(10067)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10068)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10069);if ((((charAt(bp + (offset++)) != 'r')&&(__CLR4_5_2694694lusyjkeu.R.iget(10070)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10071)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10072);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(10073);return false;
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(10074);if ((((charAt(bp + (offset++)) != 'u')&&(__CLR4_5_2694694lusyjkeu.R.iget(10075)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10076)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10077);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(10078);return false;
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(10079);if ((((charAt(bp + (offset++)) != 'e')&&(__CLR4_5_2694694lusyjkeu.R.iget(10080)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10081)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10082);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(10083);return false;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(10084);value = true;
        } }else {__CLR4_5_2694694lusyjkeu.R.inc(10085);if ((((chLocal == 'f')&&(__CLR4_5_2694694lusyjkeu.R.iget(10086)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10087)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10088);if ((((charAt(bp + (offset++)) != 'a')&&(__CLR4_5_2694694lusyjkeu.R.iget(10089)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10090)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10091);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(10092);return false;
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(10093);if ((((charAt(bp + (offset++)) != 'l')&&(__CLR4_5_2694694lusyjkeu.R.iget(10094)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10095)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10096);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(10097);return false;
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(10098);if ((((charAt(bp + (offset++)) != 's')&&(__CLR4_5_2694694lusyjkeu.R.iget(10099)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10100)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10101);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(10102);return false;
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(10103);if ((((charAt(bp + (offset++)) != 'e')&&(__CLR4_5_2694694lusyjkeu.R.iget(10104)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10105)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10106);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(10107);return false;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(10108);value = false;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(10109);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(10110);return false;
        }

        }}__CLR4_5_2694694lusyjkeu.R.inc(10111);chLocal = charAt(bp + offset++);
        __CLR4_5_2694694lusyjkeu.R.inc(10112);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(10113)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10114)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10115);bp += offset;
            __CLR4_5_2694694lusyjkeu.R.inc(10116);this.ch = this.charAt(bp);
            __CLR4_5_2694694lusyjkeu.R.inc(10117);matchStat = VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(10118);token = JSONToken.COMMA;

            __CLR4_5_2694694lusyjkeu.R.inc(10119);return value;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10120);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(10121)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10122)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10123);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(10124);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(10125)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10126)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10127);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(10128);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(10129);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(10130);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(10131)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10132)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10133);token = JSONToken.RBRACKET;
                __CLR4_5_2694694lusyjkeu.R.inc(10134);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(10135);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(10136);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(10137)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10138)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10139);token = JSONToken.RBRACE;
                __CLR4_5_2694694lusyjkeu.R.inc(10140);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(10141);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(10142);if ((((chLocal == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(10143)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10144)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10145);token = JSONToken.EOF;
                __CLR4_5_2694694lusyjkeu.R.inc(10146);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(10147);ch = EOI;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(10148);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(10149);return false;
            }
            }}}}__CLR4_5_2694694lusyjkeu.R.inc(10150);matchStat = END;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(10151);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(10152);return false;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10153);return value;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public long scanFieldLong(char[] fieldName) {try{__CLR4_5_2694694lusyjkeu.R.inc(10154);
        __CLR4_5_2694694lusyjkeu.R.inc(10155);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(10156);if ((((!charArrayCompare(fieldName))&&(__CLR4_5_2694694lusyjkeu.R.iget(10157)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10158)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10159);matchStat = NOT_MATCH_NAME;
            __CLR4_5_2694694lusyjkeu.R.inc(10160);return 0;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10161);int offset = fieldName.length;
        __CLR4_5_2694694lusyjkeu.R.inc(10162);char chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(10163);boolean negative = false;
        __CLR4_5_2694694lusyjkeu.R.inc(10164);if ((((chLocal == '-')&&(__CLR4_5_2694694lusyjkeu.R.iget(10165)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10166)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10167);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(10168);negative = true;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10169);long value;
        __CLR4_5_2694694lusyjkeu.R.inc(10170);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10171)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10172)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10173);value = chLocal - '0';
            __CLR4_5_2694694lusyjkeu.R.inc(10174);for (;;) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10175);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(10176);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10177)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10178)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10179);value = value * 10 + (chLocal - '0');
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(10180);if ((((chLocal == '.')&&(__CLR4_5_2694694lusyjkeu.R.iget(10181)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10182)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10183);matchStat = NOT_MATCH;
                    __CLR4_5_2694694lusyjkeu.R.inc(10184);return 0;
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10185);break;
                }
            }}}

            }__CLR4_5_2694694lusyjkeu.R.inc(10186);boolean valid = offset - fieldName.length < 21
                    && (value >= 0 || (value == -9223372036854775808L && negative));
            __CLR4_5_2694694lusyjkeu.R.inc(10187);if ((((!valid)&&(__CLR4_5_2694694lusyjkeu.R.iget(10188)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10189)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10190);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(10191);return 0;
            }
        }} }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(10192);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(10193);return 0;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10194);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(10195)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10196)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10197);bp += offset;
            __CLR4_5_2694694lusyjkeu.R.inc(10198);this.ch = this.charAt(bp);
            __CLR4_5_2694694lusyjkeu.R.inc(10199);matchStat = VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(10200);token = JSONToken.COMMA;
            __CLR4_5_2694694lusyjkeu.R.inc(10201);return (((negative )&&(__CLR4_5_2694694lusyjkeu.R.iget(10202)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10203)==0&false))? -value : value;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10204);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(10205)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10206)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10207);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(10208);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(10209)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10210)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10211);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(10212);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(10213);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(10214);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(10215)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10216)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10217);token = JSONToken.RBRACKET;
                __CLR4_5_2694694lusyjkeu.R.inc(10218);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(10219);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(10220);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(10221)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10222)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10223);token = JSONToken.RBRACE;
                __CLR4_5_2694694lusyjkeu.R.inc(10224);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(10225);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(10226);if ((((chLocal == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(10227)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10228)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10229);token = JSONToken.EOF;
                __CLR4_5_2694694lusyjkeu.R.inc(10230);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(10231);ch = EOI;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(10232);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(10233);return 0;
            }
            }}}}__CLR4_5_2694694lusyjkeu.R.inc(10234);matchStat = END;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(10235);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(10236);return 0;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10237);return (((negative )&&(__CLR4_5_2694694lusyjkeu.R.iget(10238)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10239)==0&false))? -value : value;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public long scanLong(char expectNextChar) {try{__CLR4_5_2694694lusyjkeu.R.inc(10240);
        __CLR4_5_2694694lusyjkeu.R.inc(10241);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(10242);int offset = 0;
        __CLR4_5_2694694lusyjkeu.R.inc(10243);char chLocal = charAt(bp + (offset++));
        __CLR4_5_2694694lusyjkeu.R.inc(10244);final boolean quote = chLocal == '"';
        __CLR4_5_2694694lusyjkeu.R.inc(10245);if ((((quote)&&(__CLR4_5_2694694lusyjkeu.R.iget(10246)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10247)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10248);chLocal = charAt(bp + (offset++));
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10249);final boolean negative = chLocal == '-';
        __CLR4_5_2694694lusyjkeu.R.inc(10250);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(10251)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10252)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10253);chLocal = charAt(bp + (offset++));
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10254);long value;
        __CLR4_5_2694694lusyjkeu.R.inc(10255);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10256)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10257)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10258);value = chLocal - '0';
            __CLR4_5_2694694lusyjkeu.R.inc(10259);for (;;) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10260);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(10261);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10262)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10263)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10264);value = value * 10 + (chLocal - '0');
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(10265);if ((((chLocal == '.')&&(__CLR4_5_2694694lusyjkeu.R.iget(10266)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10267)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10268);matchStat = NOT_MATCH;
                    __CLR4_5_2694694lusyjkeu.R.inc(10269);return 0;
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10270);break;
                }
            }}}
            }__CLR4_5_2694694lusyjkeu.R.inc(10271);boolean valid = value >= 0 || (value == -9223372036854775808L && negative);
            __CLR4_5_2694694lusyjkeu.R.inc(10272);if ((((!valid)&&(__CLR4_5_2694694lusyjkeu.R.iget(10273)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10274)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10275);String val = subString(bp, offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(10276);throw new NumberFormatException(val);
            }
        }} }else {__CLR4_5_2694694lusyjkeu.R.inc(10277);if ((((chLocal == 'n' && charAt(bp + offset) == 'u' && charAt(bp + offset + 1) == 'l' && charAt(bp + offset + 2) == 'l')&&(__CLR4_5_2694694lusyjkeu.R.iget(10278)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10279)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10280);matchStat = VALUE_NULL;
            __CLR4_5_2694694lusyjkeu.R.inc(10281);value = 0;
            __CLR4_5_2694694lusyjkeu.R.inc(10282);offset += 3;
            __CLR4_5_2694694lusyjkeu.R.inc(10283);chLocal = charAt(bp + offset++);

            __CLR4_5_2694694lusyjkeu.R.inc(10284);if ((((quote && chLocal == '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(10285)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10286)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10287);chLocal = charAt(bp + offset++);
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(10288);for (;;) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10289);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(10290)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10291)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10292);bp += offset;
                    __CLR4_5_2694694lusyjkeu.R.inc(10293);this.ch = charAt(bp);
                    __CLR4_5_2694694lusyjkeu.R.inc(10294);matchStat = VALUE_NULL;
                    __CLR4_5_2694694lusyjkeu.R.inc(10295);token = JSONToken.COMMA;
                    __CLR4_5_2694694lusyjkeu.R.inc(10296);return value;
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(10297);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(10298)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10299)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10300);bp += offset;
                    __CLR4_5_2694694lusyjkeu.R.inc(10301);this.ch = charAt(bp);
                    __CLR4_5_2694694lusyjkeu.R.inc(10302);matchStat = VALUE_NULL;
                    __CLR4_5_2694694lusyjkeu.R.inc(10303);token = JSONToken.RBRACKET;
                    __CLR4_5_2694694lusyjkeu.R.inc(10304);return value;
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(10305);if ((((isWhitespace(chLocal))&&(__CLR4_5_2694694lusyjkeu.R.iget(10306)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10307)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10308);chLocal = charAt(bp + offset++);
                    __CLR4_5_2694694lusyjkeu.R.inc(10309);continue;
                }
                }}}__CLR4_5_2694694lusyjkeu.R.inc(10310);break;
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(10311);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(10312);return 0;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(10313);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(10314);return 0;
        }

        }}__CLR4_5_2694694lusyjkeu.R.inc(10315);if ((((quote)&&(__CLR4_5_2694694lusyjkeu.R.iget(10316)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10317)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10318);if ((((chLocal != '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(10319)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10320)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10321);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(10322);return 0;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(10323);chLocal = charAt(bp + (offset++));
            }
        }}

        }__CLR4_5_2694694lusyjkeu.R.inc(10324);for (;;) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10325);if ((((chLocal == expectNextChar)&&(__CLR4_5_2694694lusyjkeu.R.iget(10326)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10327)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10328);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(10329);this.ch = this.charAt(bp);
                __CLR4_5_2694694lusyjkeu.R.inc(10330);matchStat = VALUE;
                __CLR4_5_2694694lusyjkeu.R.inc(10331);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(10332);return (((negative )&&(__CLR4_5_2694694lusyjkeu.R.iget(10333)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10334)==0&false))? -value : value;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(10335);if ((((isWhitespace(chLocal))&&(__CLR4_5_2694694lusyjkeu.R.iget(10336)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10337)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10338);chLocal = charAt(bp + (offset++));
                    __CLR4_5_2694694lusyjkeu.R.inc(10339);continue;
                }

                }__CLR4_5_2694694lusyjkeu.R.inc(10340);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(10341);return value;
            }
        }}
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final float scanFieldFloat(char[] fieldName) {try{__CLR4_5_2694694lusyjkeu.R.inc(10342);
        __CLR4_5_2694694lusyjkeu.R.inc(10343);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(10344);if ((((!charArrayCompare(fieldName))&&(__CLR4_5_2694694lusyjkeu.R.iget(10345)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10346)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10347);matchStat = NOT_MATCH_NAME;
            __CLR4_5_2694694lusyjkeu.R.inc(10348);return 0;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10349);int offset = fieldName.length;
        __CLR4_5_2694694lusyjkeu.R.inc(10350);char chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(10351);final boolean quote = chLocal == '"';
        __CLR4_5_2694694lusyjkeu.R.inc(10352);if ((((quote)&&(__CLR4_5_2694694lusyjkeu.R.iget(10353)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10354)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10355);chLocal = charAt(bp + (offset++));
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10356);boolean negative = chLocal == '-';
        __CLR4_5_2694694lusyjkeu.R.inc(10357);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(10358)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10359)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10360);chLocal = charAt(bp + (offset++));
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10361);float value;
        __CLR4_5_2694694lusyjkeu.R.inc(10362);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10363)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10364)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10365);long intVal = chLocal - '0';
            __CLR4_5_2694694lusyjkeu.R.inc(10366);for (;;) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10367);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(10368);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10369)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10370)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10371);intVal = intVal * 10 + (chLocal - '0');
                    __CLR4_5_2694694lusyjkeu.R.inc(10372);continue;
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10373);break;
                }
            }}

            }__CLR4_5_2694694lusyjkeu.R.inc(10374);long power = 1;
            __CLR4_5_2694694lusyjkeu.R.inc(10375);boolean small = (chLocal == '.');
            __CLR4_5_2694694lusyjkeu.R.inc(10376);if ((((small)&&(__CLR4_5_2694694lusyjkeu.R.iget(10377)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10378)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10379);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(10380);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10381)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10382)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10383);intVal = intVal * 10 + (chLocal - '0');
                    __CLR4_5_2694694lusyjkeu.R.inc(10384);power = 10;
                    __CLR4_5_2694694lusyjkeu.R.inc(10385);for (;;) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(10386);chLocal = charAt(bp + (offset++));
                        __CLR4_5_2694694lusyjkeu.R.inc(10387);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10388)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10389)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(10390);intVal = intVal * 10 + (chLocal - '0');
                            __CLR4_5_2694694lusyjkeu.R.inc(10391);power *= 10;
                            __CLR4_5_2694694lusyjkeu.R.inc(10392);continue;
                        } }else {{
                            __CLR4_5_2694694lusyjkeu.R.inc(10393);break;
                        }
                    }}
                }} }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10394);matchStat = NOT_MATCH;
                    __CLR4_5_2694694lusyjkeu.R.inc(10395);return 0;
                }
            }}

            }__CLR4_5_2694694lusyjkeu.R.inc(10396);boolean exp = chLocal == 'e' || chLocal == 'E';
            __CLR4_5_2694694lusyjkeu.R.inc(10397);if ((((exp)&&(__CLR4_5_2694694lusyjkeu.R.iget(10398)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10399)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10400);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(10401);if ((((chLocal == '+' || chLocal == '-')&&(__CLR4_5_2694694lusyjkeu.R.iget(10402)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10403)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10404);chLocal = charAt(bp + (offset++));
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(10405);for (;;) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10406);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10407)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10408)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(10409);chLocal = charAt(bp + (offset++));
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(10410);break;
                    }
                }}
            }}

            }__CLR4_5_2694694lusyjkeu.R.inc(10411);int start, count;
            __CLR4_5_2694694lusyjkeu.R.inc(10412);if ((((quote)&&(__CLR4_5_2694694lusyjkeu.R.iget(10413)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10414)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10415);if ((((chLocal != '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(10416)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10417)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10418);matchStat = NOT_MATCH;
                    __CLR4_5_2694694lusyjkeu.R.inc(10419);return 0;
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10420);chLocal = charAt(bp + (offset++));
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(10421);start = bp + fieldName.length + 1;
                __CLR4_5_2694694lusyjkeu.R.inc(10422);count = bp + offset - start - 2;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(10423);start = bp + fieldName.length;
                __CLR4_5_2694694lusyjkeu.R.inc(10424);count = bp + offset - start - 1;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(10425);if (((((!exp) && count < 17)&&(__CLR4_5_2694694lusyjkeu.R.iget(10426)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10427)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10428);value = (float) (((double) intVal) / power);
                __CLR4_5_2694694lusyjkeu.R.inc(10429);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(10430)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10431)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10432);value = -value;
                }
            }} }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(10433);String text = this.subString(start, count);
                __CLR4_5_2694694lusyjkeu.R.inc(10434);value = Float.parseFloat(text);
            }
        }} }else {__CLR4_5_2694694lusyjkeu.R.inc(10435);if ((((chLocal == 'n' && charAt(bp + offset) == 'u' && charAt(bp + offset + 1) == 'l' && charAt(bp + offset + 2) == 'l')&&(__CLR4_5_2694694lusyjkeu.R.iget(10436)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10437)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10438);matchStat = VALUE_NULL;
            __CLR4_5_2694694lusyjkeu.R.inc(10439);value = 0;
            __CLR4_5_2694694lusyjkeu.R.inc(10440);offset += 3;
            __CLR4_5_2694694lusyjkeu.R.inc(10441);chLocal = charAt(bp + offset++);

            __CLR4_5_2694694lusyjkeu.R.inc(10442);if ((((quote && chLocal == '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(10443)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10444)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10445);chLocal = charAt(bp + offset++);
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(10446);for (;;) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10447);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(10448)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10449)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10450);bp += offset;
                    __CLR4_5_2694694lusyjkeu.R.inc(10451);this.ch = charAt(bp);
                    __CLR4_5_2694694lusyjkeu.R.inc(10452);matchStat = VALUE_NULL;
                    __CLR4_5_2694694lusyjkeu.R.inc(10453);token = JSONToken.COMMA;
                    __CLR4_5_2694694lusyjkeu.R.inc(10454);return value;
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(10455);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(10456)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10457)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10458);bp += offset;
                    __CLR4_5_2694694lusyjkeu.R.inc(10459);this.ch = charAt(bp);
                    __CLR4_5_2694694lusyjkeu.R.inc(10460);matchStat = VALUE_NULL;
                    __CLR4_5_2694694lusyjkeu.R.inc(10461);token = JSONToken.RBRACE;
                    __CLR4_5_2694694lusyjkeu.R.inc(10462);return value;
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(10463);if ((((isWhitespace(chLocal))&&(__CLR4_5_2694694lusyjkeu.R.iget(10464)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10465)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10466);chLocal = charAt(bp + offset++);
                    __CLR4_5_2694694lusyjkeu.R.inc(10467);continue;
                }
                }}}__CLR4_5_2694694lusyjkeu.R.inc(10468);break;
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(10469);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(10470);return 0;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(10471);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(10472);return 0;
        }

        }}__CLR4_5_2694694lusyjkeu.R.inc(10473);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(10474)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10475)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10476);bp += offset;
            __CLR4_5_2694694lusyjkeu.R.inc(10477);this.ch = this.charAt(bp);
            __CLR4_5_2694694lusyjkeu.R.inc(10478);matchStat = VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(10479);token = JSONToken.COMMA;
            __CLR4_5_2694694lusyjkeu.R.inc(10480);return value;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10481);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(10482)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10483)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10484);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(10485);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(10486)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10487)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10488);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(10489);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(10490);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(10491);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(10492)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10493)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10494);token = JSONToken.RBRACKET;
                __CLR4_5_2694694lusyjkeu.R.inc(10495);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(10496);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(10497);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(10498)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10499)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10500);token = JSONToken.RBRACE;
                __CLR4_5_2694694lusyjkeu.R.inc(10501);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(10502);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(10503);if ((((chLocal == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(10504)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10505)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10506);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(10507);token = JSONToken.EOF;
                __CLR4_5_2694694lusyjkeu.R.inc(10508);ch = EOI;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(10509);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(10510);return 0;
            }
            }}}}__CLR4_5_2694694lusyjkeu.R.inc(10511);matchStat = END;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(10512);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(10513);return 0;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10514);return value;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final float scanFloat(char seperator) {try{__CLR4_5_2694694lusyjkeu.R.inc(10515);
        __CLR4_5_2694694lusyjkeu.R.inc(10516);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(10517);int offset = 0;
        __CLR4_5_2694694lusyjkeu.R.inc(10518);char chLocal = charAt(bp + (offset++));
        __CLR4_5_2694694lusyjkeu.R.inc(10519);final boolean quote = chLocal == '"';
        __CLR4_5_2694694lusyjkeu.R.inc(10520);if ((((quote)&&(__CLR4_5_2694694lusyjkeu.R.iget(10521)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10522)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10523);chLocal = charAt(bp + (offset++));
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10524);boolean negative = chLocal == '-';
        __CLR4_5_2694694lusyjkeu.R.inc(10525);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(10526)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10527)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10528);chLocal = charAt(bp + (offset++));
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10529);float value;
        __CLR4_5_2694694lusyjkeu.R.inc(10530);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10531)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10532)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10533);long intVal = chLocal - '0';
            __CLR4_5_2694694lusyjkeu.R.inc(10534);for (; ; ) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10535);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(10536);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10537)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10538)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10539);intVal = intVal * 10 + (chLocal - '0');
                    __CLR4_5_2694694lusyjkeu.R.inc(10540);continue;
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10541);break;
                }
            }}

            }__CLR4_5_2694694lusyjkeu.R.inc(10542);long power = 1;
            __CLR4_5_2694694lusyjkeu.R.inc(10543);boolean small = (chLocal == '.');
            __CLR4_5_2694694lusyjkeu.R.inc(10544);if ((((small)&&(__CLR4_5_2694694lusyjkeu.R.iget(10545)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10546)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10547);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(10548);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10549)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10550)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10551);intVal = intVal * 10 + (chLocal - '0');
                    __CLR4_5_2694694lusyjkeu.R.inc(10552);power = 10;
                    __CLR4_5_2694694lusyjkeu.R.inc(10553);for (; ; ) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(10554);chLocal = charAt(bp + (offset++));
                        __CLR4_5_2694694lusyjkeu.R.inc(10555);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10556)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10557)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(10558);intVal = intVal * 10 + (chLocal - '0');
                            __CLR4_5_2694694lusyjkeu.R.inc(10559);power *= 10;
                            __CLR4_5_2694694lusyjkeu.R.inc(10560);continue;
                        } }else {{
                            __CLR4_5_2694694lusyjkeu.R.inc(10561);break;
                        }
                    }}
                }} }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10562);matchStat = NOT_MATCH;
                    __CLR4_5_2694694lusyjkeu.R.inc(10563);return 0;
                }
            }}

            }__CLR4_5_2694694lusyjkeu.R.inc(10564);boolean exp = chLocal == 'e' || chLocal == 'E';
            __CLR4_5_2694694lusyjkeu.R.inc(10565);if ((((exp)&&(__CLR4_5_2694694lusyjkeu.R.iget(10566)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10567)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10568);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(10569);if ((((chLocal == '+' || chLocal == '-')&&(__CLR4_5_2694694lusyjkeu.R.iget(10570)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10571)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10572);chLocal = charAt(bp + (offset++));
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(10573);for (; ; ) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10574);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10575)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10576)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(10577);chLocal = charAt(bp + (offset++));
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(10578);break;
                    }
                }}
            }}
//            int start, count;
//            if (quote) {
//                if (chLocal != '"') {
//                    matchStat = NOT_MATCH;
//                    return 0;
//                } else {
//                    chLocal = charAt(bp + (offset++));
//                }
//                start = bp + 1;
//                count = bp + offset - start - 2;
//            } else {
//                start = bp;
//                count = bp + offset - start - 1;
//            }
//            String text = this.subString(start, count);
//            value = Float.parseFloat(text);
            }__CLR4_5_2694694lusyjkeu.R.inc(10579);int start, count;
            __CLR4_5_2694694lusyjkeu.R.inc(10580);if ((((quote)&&(__CLR4_5_2694694lusyjkeu.R.iget(10581)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10582)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10583);if ((((chLocal != '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(10584)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10585)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10586);matchStat = NOT_MATCH;
                    __CLR4_5_2694694lusyjkeu.R.inc(10587);return 0;
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10588);chLocal = charAt(bp + (offset++));
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(10589);start = bp + 1;
                __CLR4_5_2694694lusyjkeu.R.inc(10590);count = bp + offset - start - 2;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(10591);start = bp;
                __CLR4_5_2694694lusyjkeu.R.inc(10592);count = bp + offset - start - 1;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(10593);if (((((!exp) && count < 17)&&(__CLR4_5_2694694lusyjkeu.R.iget(10594)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10595)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10596);value = (float) (((double) intVal) / power);
                __CLR4_5_2694694lusyjkeu.R.inc(10597);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(10598)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10599)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10600);value = -value;
                }
            }} }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(10601);String text = this.subString(start, count);
                __CLR4_5_2694694lusyjkeu.R.inc(10602);value = Float.parseFloat(text);
            }
        }} }else {__CLR4_5_2694694lusyjkeu.R.inc(10603);if ((((chLocal == 'n' && charAt(bp + offset) == 'u' && charAt(bp + offset + 1) == 'l' && charAt(bp + offset + 2) == 'l')&&(__CLR4_5_2694694lusyjkeu.R.iget(10604)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10605)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10606);matchStat = VALUE_NULL;
            __CLR4_5_2694694lusyjkeu.R.inc(10607);value = 0;
            __CLR4_5_2694694lusyjkeu.R.inc(10608);offset += 3;
            __CLR4_5_2694694lusyjkeu.R.inc(10609);chLocal = charAt(bp + offset++);

            __CLR4_5_2694694lusyjkeu.R.inc(10610);if ((((quote && chLocal == '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(10611)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10612)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10613);chLocal = charAt(bp + offset++);
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(10614);for (;;) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10615);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(10616)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10617)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10618);bp += offset;
                    __CLR4_5_2694694lusyjkeu.R.inc(10619);this.ch = charAt(bp);
                    __CLR4_5_2694694lusyjkeu.R.inc(10620);matchStat = VALUE_NULL;
                    __CLR4_5_2694694lusyjkeu.R.inc(10621);token = JSONToken.COMMA;
                    __CLR4_5_2694694lusyjkeu.R.inc(10622);return value;
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(10623);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(10624)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10625)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10626);bp += offset;
                    __CLR4_5_2694694lusyjkeu.R.inc(10627);this.ch = charAt(bp);
                    __CLR4_5_2694694lusyjkeu.R.inc(10628);matchStat = VALUE_NULL;
                    __CLR4_5_2694694lusyjkeu.R.inc(10629);token = JSONToken.RBRACKET;
                    __CLR4_5_2694694lusyjkeu.R.inc(10630);return value;
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(10631);if ((((isWhitespace(chLocal))&&(__CLR4_5_2694694lusyjkeu.R.iget(10632)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10633)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10634);chLocal = charAt(bp + offset++);
                    __CLR4_5_2694694lusyjkeu.R.inc(10635);continue;
                }
                }}}__CLR4_5_2694694lusyjkeu.R.inc(10636);break;
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(10637);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(10638);return 0;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(10639);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(10640);return 0;
        }

        }}__CLR4_5_2694694lusyjkeu.R.inc(10641);if ((((chLocal == seperator)&&(__CLR4_5_2694694lusyjkeu.R.iget(10642)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10643)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10644);bp += offset;
            __CLR4_5_2694694lusyjkeu.R.inc(10645);this.ch = this.charAt(bp);
            __CLR4_5_2694694lusyjkeu.R.inc(10646);matchStat = VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(10647);token = JSONToken.COMMA;
            __CLR4_5_2694694lusyjkeu.R.inc(10648);return value;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(10649);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(10650);return value;
        }
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public double scanDouble(char seperator) {try{__CLR4_5_2694694lusyjkeu.R.inc(10651);
        __CLR4_5_2694694lusyjkeu.R.inc(10652);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(10653);int offset = 0;
        __CLR4_5_2694694lusyjkeu.R.inc(10654);char chLocal = charAt(bp + (offset++));
        __CLR4_5_2694694lusyjkeu.R.inc(10655);final boolean quote = chLocal == '"';
        __CLR4_5_2694694lusyjkeu.R.inc(10656);if ((((quote)&&(__CLR4_5_2694694lusyjkeu.R.iget(10657)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10658)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10659);chLocal = charAt(bp + (offset++));
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10660);boolean negative = chLocal == '-';
        __CLR4_5_2694694lusyjkeu.R.inc(10661);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(10662)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10663)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10664);chLocal = charAt(bp + (offset++));
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10665);double value;
        __CLR4_5_2694694lusyjkeu.R.inc(10666);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10667)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10668)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10669);long intVal = chLocal - '0';
            __CLR4_5_2694694lusyjkeu.R.inc(10670);for (; ; ) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10671);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(10672);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10673)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10674)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10675);intVal = intVal * 10 + (chLocal - '0');
                    __CLR4_5_2694694lusyjkeu.R.inc(10676);continue;
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10677);break;
                }
            }}

            }__CLR4_5_2694694lusyjkeu.R.inc(10678);long power = 1;
            __CLR4_5_2694694lusyjkeu.R.inc(10679);boolean small = (chLocal == '.');
            __CLR4_5_2694694lusyjkeu.R.inc(10680);if ((((small)&&(__CLR4_5_2694694lusyjkeu.R.iget(10681)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10682)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10683);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(10684);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10685)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10686)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10687);intVal = intVal * 10 + (chLocal - '0');
                    __CLR4_5_2694694lusyjkeu.R.inc(10688);power = 10;
                    __CLR4_5_2694694lusyjkeu.R.inc(10689);for (; ; ) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(10690);chLocal = charAt(bp + (offset++));
                        __CLR4_5_2694694lusyjkeu.R.inc(10691);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10692)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10693)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(10694);intVal = intVal * 10 + (chLocal - '0');
                            __CLR4_5_2694694lusyjkeu.R.inc(10695);power *= 10;
                            __CLR4_5_2694694lusyjkeu.R.inc(10696);continue;
                        } }else {{
                            __CLR4_5_2694694lusyjkeu.R.inc(10697);break;
                        }
                    }}
                }} }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10698);matchStat = NOT_MATCH;
                    __CLR4_5_2694694lusyjkeu.R.inc(10699);return 0;
                }
            }}

            }__CLR4_5_2694694lusyjkeu.R.inc(10700);boolean exp = chLocal == 'e' || chLocal == 'E';
            __CLR4_5_2694694lusyjkeu.R.inc(10701);if ((((exp)&&(__CLR4_5_2694694lusyjkeu.R.iget(10702)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10703)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10704);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(10705);if ((((chLocal == '+' || chLocal == '-')&&(__CLR4_5_2694694lusyjkeu.R.iget(10706)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10707)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10708);chLocal = charAt(bp + (offset++));
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(10709);for (; ; ) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10710);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10711)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10712)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(10713);chLocal = charAt(bp + (offset++));
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(10714);break;
                    }
                }}
            }}

            }__CLR4_5_2694694lusyjkeu.R.inc(10715);int start, count;
            __CLR4_5_2694694lusyjkeu.R.inc(10716);if ((((quote)&&(__CLR4_5_2694694lusyjkeu.R.iget(10717)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10718)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10719);if ((((chLocal != '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(10720)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10721)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10722);matchStat = NOT_MATCH;
                    __CLR4_5_2694694lusyjkeu.R.inc(10723);return 0;
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10724);chLocal = charAt(bp + (offset++));
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(10725);start = bp + 1;
                __CLR4_5_2694694lusyjkeu.R.inc(10726);count = bp + offset - start - 2;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(10727);start = bp;
                __CLR4_5_2694694lusyjkeu.R.inc(10728);count = bp + offset - start - 1;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(10729);if ((((!exp && count < 17)&&(__CLR4_5_2694694lusyjkeu.R.iget(10730)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10731)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10732);value = ((double) intVal) / power;
                __CLR4_5_2694694lusyjkeu.R.inc(10733);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(10734)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10735)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10736);value = -value;
                }
            }} }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(10737);String text = this.subString(start, count);
                __CLR4_5_2694694lusyjkeu.R.inc(10738);value = Double.parseDouble(text);
            }
        }} }else {__CLR4_5_2694694lusyjkeu.R.inc(10739);if ((((chLocal == 'n' && charAt(bp + offset) == 'u' && charAt(bp + offset + 1) == 'l' && charAt(bp + offset + 2) == 'l')&&(__CLR4_5_2694694lusyjkeu.R.iget(10740)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10741)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10742);matchStat = VALUE_NULL;
            __CLR4_5_2694694lusyjkeu.R.inc(10743);value = 0;
            __CLR4_5_2694694lusyjkeu.R.inc(10744);offset += 3;
            __CLR4_5_2694694lusyjkeu.R.inc(10745);chLocal = charAt(bp + offset++);

            __CLR4_5_2694694lusyjkeu.R.inc(10746);if ((((quote && chLocal == '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(10747)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10748)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10749);chLocal = charAt(bp + offset++);
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(10750);for (;;) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10751);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(10752)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10753)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10754);bp += offset;
                    __CLR4_5_2694694lusyjkeu.R.inc(10755);this.ch = charAt(bp);
                    __CLR4_5_2694694lusyjkeu.R.inc(10756);matchStat = VALUE_NULL;
                    __CLR4_5_2694694lusyjkeu.R.inc(10757);token = JSONToken.COMMA;
                    __CLR4_5_2694694lusyjkeu.R.inc(10758);return value;
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(10759);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(10760)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10761)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10762);bp += offset;
                    __CLR4_5_2694694lusyjkeu.R.inc(10763);this.ch = charAt(bp);
                    __CLR4_5_2694694lusyjkeu.R.inc(10764);matchStat = VALUE_NULL;
                    __CLR4_5_2694694lusyjkeu.R.inc(10765);token = JSONToken.RBRACKET;
                    __CLR4_5_2694694lusyjkeu.R.inc(10766);return value;
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(10767);if ((((isWhitespace(chLocal))&&(__CLR4_5_2694694lusyjkeu.R.iget(10768)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10769)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10770);chLocal = charAt(bp + offset++);
                    __CLR4_5_2694694lusyjkeu.R.inc(10771);continue;
                }
                }}}__CLR4_5_2694694lusyjkeu.R.inc(10772);break;
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(10773);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(10774);return 0;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(10775);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(10776);return 0;
        }

        }}__CLR4_5_2694694lusyjkeu.R.inc(10777);if ((((chLocal == seperator)&&(__CLR4_5_2694694lusyjkeu.R.iget(10778)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10779)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10780);bp += offset;
            __CLR4_5_2694694lusyjkeu.R.inc(10781);this.ch = this.charAt(bp);
            __CLR4_5_2694694lusyjkeu.R.inc(10782);matchStat = VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(10783);token = JSONToken.COMMA;
            __CLR4_5_2694694lusyjkeu.R.inc(10784);return value;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(10785);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(10786);return value;
        }
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public BigDecimal scanDecimal(char seperator) {try{__CLR4_5_2694694lusyjkeu.R.inc(10787);
        __CLR4_5_2694694lusyjkeu.R.inc(10788);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(10789);int offset = 0;
        __CLR4_5_2694694lusyjkeu.R.inc(10790);char chLocal = charAt(bp + (offset++));
        __CLR4_5_2694694lusyjkeu.R.inc(10791);final boolean quote = chLocal == '"';
        __CLR4_5_2694694lusyjkeu.R.inc(10792);if ((((quote)&&(__CLR4_5_2694694lusyjkeu.R.iget(10793)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10794)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10795);chLocal = charAt(bp + (offset++));
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10796);boolean negative = chLocal == '-';
        __CLR4_5_2694694lusyjkeu.R.inc(10797);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(10798)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10799)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10800);chLocal = charAt(bp + (offset++));
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10801);BigDecimal value;
        __CLR4_5_2694694lusyjkeu.R.inc(10802);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10803)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10804)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10805);for (;;) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10806);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(10807);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10808)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10809)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10810);continue;
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10811);break;
                }
            }}

            }__CLR4_5_2694694lusyjkeu.R.inc(10812);boolean small = (chLocal == '.');
            __CLR4_5_2694694lusyjkeu.R.inc(10813);if ((((small)&&(__CLR4_5_2694694lusyjkeu.R.iget(10814)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10815)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10816);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(10817);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10818)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10819)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10820);for (;;) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(10821);chLocal = charAt(bp + (offset++));
                        __CLR4_5_2694694lusyjkeu.R.inc(10822);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10823)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10824)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(10825);continue;
                        } }else {{
                            __CLR4_5_2694694lusyjkeu.R.inc(10826);break;
                        }
                    }}
                }} }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10827);matchStat = NOT_MATCH;
                    __CLR4_5_2694694lusyjkeu.R.inc(10828);return null;
                }
            }}

            }__CLR4_5_2694694lusyjkeu.R.inc(10829);boolean exp = chLocal == 'e' || chLocal == 'E';
            __CLR4_5_2694694lusyjkeu.R.inc(10830);if ((((exp)&&(__CLR4_5_2694694lusyjkeu.R.iget(10831)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10832)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10833);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(10834);if ((((chLocal == '+' || chLocal == '-')&&(__CLR4_5_2694694lusyjkeu.R.iget(10835)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10836)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10837);chLocal = charAt(bp + (offset++));
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(10838);for (;;) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10839);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10840)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10841)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(10842);chLocal = charAt(bp + (offset++));
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(10843);break;
                    }
                }}
            }}

            }__CLR4_5_2694694lusyjkeu.R.inc(10844);int start, count;
            __CLR4_5_2694694lusyjkeu.R.inc(10845);if ((((quote)&&(__CLR4_5_2694694lusyjkeu.R.iget(10846)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10847)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10848);if ((((chLocal != '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(10849)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10850)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10851);matchStat = NOT_MATCH;
                    __CLR4_5_2694694lusyjkeu.R.inc(10852);return null;
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10853);chLocal = charAt(bp + (offset++));
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(10854);start = bp + 1;
                __CLR4_5_2694694lusyjkeu.R.inc(10855);count = bp + offset - start - 2;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(10856);start = bp;
                __CLR4_5_2694694lusyjkeu.R.inc(10857);count = bp + offset - start - 1;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(10858);char[] chars = this.sub_chars(start, count);
            __CLR4_5_2694694lusyjkeu.R.inc(10859);value = new BigDecimal(chars);
        } }else {__CLR4_5_2694694lusyjkeu.R.inc(10860);if ((((chLocal == 'n' && charAt(bp + offset) == 'u' && charAt(bp + offset + 1) == 'l' && charAt(bp + offset + 2) == 'l')&&(__CLR4_5_2694694lusyjkeu.R.iget(10861)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10862)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10863);matchStat = VALUE_NULL;
            __CLR4_5_2694694lusyjkeu.R.inc(10864);value = null;
            __CLR4_5_2694694lusyjkeu.R.inc(10865);offset += 3;
            __CLR4_5_2694694lusyjkeu.R.inc(10866);chLocal = charAt(bp + offset++);

            __CLR4_5_2694694lusyjkeu.R.inc(10867);if ((((quote && chLocal == '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(10868)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10869)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10870);chLocal = charAt(bp + offset++);
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(10871);for (;;) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10872);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(10873)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10874)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10875);bp += offset;
                    __CLR4_5_2694694lusyjkeu.R.inc(10876);this.ch = charAt(bp);
                    __CLR4_5_2694694lusyjkeu.R.inc(10877);matchStat = VALUE_NULL;
                    __CLR4_5_2694694lusyjkeu.R.inc(10878);token = JSONToken.COMMA;
                    __CLR4_5_2694694lusyjkeu.R.inc(10879);return value;
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(10880);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(10881)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10882)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10883);bp += offset;
                    __CLR4_5_2694694lusyjkeu.R.inc(10884);this.ch = charAt(bp);
                    __CLR4_5_2694694lusyjkeu.R.inc(10885);matchStat = VALUE_NULL;
                    __CLR4_5_2694694lusyjkeu.R.inc(10886);token = JSONToken.RBRACE;
                    __CLR4_5_2694694lusyjkeu.R.inc(10887);return value;
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(10888);if ((((isWhitespace(chLocal))&&(__CLR4_5_2694694lusyjkeu.R.iget(10889)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10890)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10891);chLocal = charAt(bp + offset++);
                    __CLR4_5_2694694lusyjkeu.R.inc(10892);continue;
                }
                }}}__CLR4_5_2694694lusyjkeu.R.inc(10893);break;
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(10894);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(10895);return null;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(10896);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(10897);return null;
        }

        }}__CLR4_5_2694694lusyjkeu.R.inc(10898);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(10899)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10900)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10901);bp += offset;
            __CLR4_5_2694694lusyjkeu.R.inc(10902);this.ch = this.charAt(bp);
            __CLR4_5_2694694lusyjkeu.R.inc(10903);matchStat = VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(10904);token = JSONToken.COMMA;
            __CLR4_5_2694694lusyjkeu.R.inc(10905);return value;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10906);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(10907)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10908)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10909);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(10910);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(10911)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10912)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10913);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(10914);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(10915);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(10916);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(10917)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10918)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10919);token = JSONToken.RBRACKET;
                __CLR4_5_2694694lusyjkeu.R.inc(10920);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(10921);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(10922);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(10923)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10924)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10925);token = JSONToken.RBRACE;
                __CLR4_5_2694694lusyjkeu.R.inc(10926);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(10927);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(10928);if ((((chLocal == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(10929)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10930)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10931);token = JSONToken.EOF;
                __CLR4_5_2694694lusyjkeu.R.inc(10932);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(10933);ch = EOI;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(10934);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(10935);return null;
            }
            }}}}__CLR4_5_2694694lusyjkeu.R.inc(10936);matchStat = END;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(10937);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(10938);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10939);return value;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final float[] scanFieldFloatArray(char[] fieldName) {try{__CLR4_5_2694694lusyjkeu.R.inc(10940);
        __CLR4_5_2694694lusyjkeu.R.inc(10941);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(10942);if ((((!charArrayCompare(fieldName))&&(__CLR4_5_2694694lusyjkeu.R.iget(10943)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10944)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10945);matchStat = NOT_MATCH_NAME;
            __CLR4_5_2694694lusyjkeu.R.inc(10946);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(10947);int offset = fieldName.length;
        __CLR4_5_2694694lusyjkeu.R.inc(10948);char chLocal = charAt(bp + (offset++));
        __CLR4_5_2694694lusyjkeu.R.inc(10949);if ((((chLocal != '[')&&(__CLR4_5_2694694lusyjkeu.R.iget(10950)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10951)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10952);matchStat = NOT_MATCH_NAME;
            __CLR4_5_2694694lusyjkeu.R.inc(10953);return null;
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(10954);chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(10955);float[] array = new float[16];
        __CLR4_5_2694694lusyjkeu.R.inc(10956);int arrayIndex = 0;

        __CLR4_5_2694694lusyjkeu.R.inc(10957);for (;;) {{
            __CLR4_5_2694694lusyjkeu.R.inc(10958);int start = bp + offset - 1;

            __CLR4_5_2694694lusyjkeu.R.inc(10959);boolean negative = chLocal == '-';
            __CLR4_5_2694694lusyjkeu.R.inc(10960);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(10961)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10962)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10963);chLocal = charAt(bp + (offset++));
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(10964);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10965)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10966)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(10967);int intVal = chLocal - '0';
                __CLR4_5_2694694lusyjkeu.R.inc(10968);for (; ; ) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10969);chLocal = charAt(bp + (offset++));
                    __CLR4_5_2694694lusyjkeu.R.inc(10970);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10971)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10972)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(10973);intVal = intVal * 10 + (chLocal - '0');
                        __CLR4_5_2694694lusyjkeu.R.inc(10974);continue;
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(10975);break;
                    }
                }}

                }__CLR4_5_2694694lusyjkeu.R.inc(10976);int power = 1;
                __CLR4_5_2694694lusyjkeu.R.inc(10977);boolean small = (chLocal == '.');
                __CLR4_5_2694694lusyjkeu.R.inc(10978);if ((((small)&&(__CLR4_5_2694694lusyjkeu.R.iget(10979)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10980)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(10981);chLocal = charAt(bp + (offset++));
                    __CLR4_5_2694694lusyjkeu.R.inc(10982);power = 10;
                    __CLR4_5_2694694lusyjkeu.R.inc(10983);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10984)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10985)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(10986);intVal = intVal * 10 + (chLocal - '0');
                        __CLR4_5_2694694lusyjkeu.R.inc(10987);for (; ; ) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(10988);chLocal = charAt(bp + (offset++));

                            __CLR4_5_2694694lusyjkeu.R.inc(10989);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(10990)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(10991)==0&false))) {{
                                __CLR4_5_2694694lusyjkeu.R.inc(10992);intVal = intVal * 10 + (chLocal - '0');
                                __CLR4_5_2694694lusyjkeu.R.inc(10993);power *= 10;
                                __CLR4_5_2694694lusyjkeu.R.inc(10994);continue;
                            } }else {{
                                __CLR4_5_2694694lusyjkeu.R.inc(10995);break;
                            }
                        }}
                    }} }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(10996);matchStat = NOT_MATCH;
                        __CLR4_5_2694694lusyjkeu.R.inc(10997);return null;
                    }
                }}

                }__CLR4_5_2694694lusyjkeu.R.inc(10998);boolean exp = chLocal == 'e' || chLocal == 'E';
                __CLR4_5_2694694lusyjkeu.R.inc(10999);if ((((exp)&&(__CLR4_5_2694694lusyjkeu.R.iget(11000)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11001)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11002);chLocal = charAt(bp + (offset++));
                    __CLR4_5_2694694lusyjkeu.R.inc(11003);if ((((chLocal == '+' || chLocal == '-')&&(__CLR4_5_2694694lusyjkeu.R.iget(11004)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11005)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(11006);chLocal = charAt(bp + (offset++));
                    }
                    }__CLR4_5_2694694lusyjkeu.R.inc(11007);for (;;) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(11008);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(11009)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11010)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(11011);chLocal = charAt(bp + (offset++));
                        } }else {{
                            __CLR4_5_2694694lusyjkeu.R.inc(11012);break;
                        }
                    }}
                }}

                }__CLR4_5_2694694lusyjkeu.R.inc(11013);int count = bp + offset - start - 1;

                __CLR4_5_2694694lusyjkeu.R.inc(11014);float value;
                __CLR4_5_2694694lusyjkeu.R.inc(11015);if ((((!exp && count < 10)&&(__CLR4_5_2694694lusyjkeu.R.iget(11016)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11017)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11018);value = ((float) intVal) / power;
                    __CLR4_5_2694694lusyjkeu.R.inc(11019);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(11020)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11021)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(11022);value = -value;
                    }
                }} }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11023);String text = this.subString(start, count);
                    __CLR4_5_2694694lusyjkeu.R.inc(11024);value = Float.parseFloat(text);
                }

                }__CLR4_5_2694694lusyjkeu.R.inc(11025);if ((((arrayIndex >= array.length)&&(__CLR4_5_2694694lusyjkeu.R.iget(11026)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11027)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11028);float[] tmp = new float[array.length * 3 / 2];
                    __CLR4_5_2694694lusyjkeu.R.inc(11029);System.arraycopy(array, 0, tmp, 0, arrayIndex);
                    __CLR4_5_2694694lusyjkeu.R.inc(11030);array = tmp;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(11031);array[arrayIndex++] = value;

                __CLR4_5_2694694lusyjkeu.R.inc(11032);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(11033)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11034)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11035);chLocal = charAt(bp + (offset++));
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(11036);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(11037)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11038)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11039);chLocal = charAt(bp + (offset++));
                    __CLR4_5_2694694lusyjkeu.R.inc(11040);break;
                }
            }}} }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(11041);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(11042);return null;
            }
        }}


        }__CLR4_5_2694694lusyjkeu.R.inc(11043);if ((((arrayIndex != array.length)&&(__CLR4_5_2694694lusyjkeu.R.iget(11044)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11045)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11046);float[] tmp = new float[arrayIndex];
            __CLR4_5_2694694lusyjkeu.R.inc(11047);System.arraycopy(array, 0, tmp, 0, arrayIndex);
            __CLR4_5_2694694lusyjkeu.R.inc(11048);array = tmp;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11049);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(11050)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11051)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11052);bp += (offset - 1);
            __CLR4_5_2694694lusyjkeu.R.inc(11053);this.next();
            __CLR4_5_2694694lusyjkeu.R.inc(11054);matchStat = VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(11055);token = JSONToken.COMMA;
            __CLR4_5_2694694lusyjkeu.R.inc(11056);return array;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11057);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(11058)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11059)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11060);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(11061);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(11062)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11063)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11064);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(11065);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(11066);this.next();
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(11067);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(11068)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11069)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11070);token = JSONToken.RBRACKET;
                __CLR4_5_2694694lusyjkeu.R.inc(11071);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(11072);this.next();
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(11073);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(11074)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11075)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11076);token = JSONToken.RBRACE;
                __CLR4_5_2694694lusyjkeu.R.inc(11077);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(11078);this.next();
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(11079);if ((((chLocal == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(11080)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11081)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11082);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(11083);token = JSONToken.EOF;
                __CLR4_5_2694694lusyjkeu.R.inc(11084);ch = EOI;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(11085);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(11086);return null;
            }
            }}}}__CLR4_5_2694694lusyjkeu.R.inc(11087);matchStat = END;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(11088);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(11089);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11090);return array;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final float[][] scanFieldFloatArray2(char[] fieldName) {try{__CLR4_5_2694694lusyjkeu.R.inc(11091);
        __CLR4_5_2694694lusyjkeu.R.inc(11092);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(11093);if ((((!charArrayCompare(fieldName))&&(__CLR4_5_2694694lusyjkeu.R.iget(11094)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11095)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11096);matchStat = NOT_MATCH_NAME;
            __CLR4_5_2694694lusyjkeu.R.inc(11097);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11098);int offset = fieldName.length;
        __CLR4_5_2694694lusyjkeu.R.inc(11099);char chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(11100);if ((((chLocal != '[')&&(__CLR4_5_2694694lusyjkeu.R.iget(11101)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11102)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11103);matchStat = NOT_MATCH_NAME;
            __CLR4_5_2694694lusyjkeu.R.inc(11104);return null;
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(11105);chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(11106);float[][] arrayarray = new float[16][];
        __CLR4_5_2694694lusyjkeu.R.inc(11107);int arrayarrayIndex = 0;

        __CLR4_5_2694694lusyjkeu.R.inc(11108);for (;;) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11109);if ((((chLocal == '[')&&(__CLR4_5_2694694lusyjkeu.R.iget(11110)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11111)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11112);chLocal = charAt(bp + (offset++));

                __CLR4_5_2694694lusyjkeu.R.inc(11113);float[] array = new float[16];
                __CLR4_5_2694694lusyjkeu.R.inc(11114);int arrayIndex = 0;

                __CLR4_5_2694694lusyjkeu.R.inc(11115);for (; ; ) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11116);int start = bp + offset - 1;
                    __CLR4_5_2694694lusyjkeu.R.inc(11117);boolean negative = chLocal == '-';
                    __CLR4_5_2694694lusyjkeu.R.inc(11118);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(11119)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11120)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(11121);chLocal = charAt(bp + (offset++));
                    }

                    }__CLR4_5_2694694lusyjkeu.R.inc(11122);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(11123)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11124)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(11125);int intVal = chLocal - '0';
                        __CLR4_5_2694694lusyjkeu.R.inc(11126);for (; ; ) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(11127);chLocal = charAt(bp + (offset++));

                            __CLR4_5_2694694lusyjkeu.R.inc(11128);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(11129)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11130)==0&false))) {{
                                __CLR4_5_2694694lusyjkeu.R.inc(11131);intVal = intVal * 10 + (chLocal - '0');
                                __CLR4_5_2694694lusyjkeu.R.inc(11132);continue;
                            } }else {{
                                __CLR4_5_2694694lusyjkeu.R.inc(11133);break;
                            }
                        }}

                        }__CLR4_5_2694694lusyjkeu.R.inc(11134);int power = 1;
                        __CLR4_5_2694694lusyjkeu.R.inc(11135);if ((((chLocal == '.')&&(__CLR4_5_2694694lusyjkeu.R.iget(11136)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11137)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(11138);chLocal = charAt(bp + (offset++));

                            __CLR4_5_2694694lusyjkeu.R.inc(11139);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(11140)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11141)==0&false))) {{
                                __CLR4_5_2694694lusyjkeu.R.inc(11142);intVal = intVal * 10 + (chLocal - '0');
                                __CLR4_5_2694694lusyjkeu.R.inc(11143);power = 10;
                                __CLR4_5_2694694lusyjkeu.R.inc(11144);for (; ; ) {{
                                    __CLR4_5_2694694lusyjkeu.R.inc(11145);chLocal = charAt(bp + (offset++));

                                    __CLR4_5_2694694lusyjkeu.R.inc(11146);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(11147)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11148)==0&false))) {{
                                        __CLR4_5_2694694lusyjkeu.R.inc(11149);intVal = intVal * 10 + (chLocal - '0');
                                        __CLR4_5_2694694lusyjkeu.R.inc(11150);power *= 10;
                                        __CLR4_5_2694694lusyjkeu.R.inc(11151);continue;
                                    } }else {{
                                        __CLR4_5_2694694lusyjkeu.R.inc(11152);break;
                                    }
                                }}
                            }} }else {{
                                __CLR4_5_2694694lusyjkeu.R.inc(11153);matchStat = NOT_MATCH;
                                __CLR4_5_2694694lusyjkeu.R.inc(11154);return null;
                            }
                        }}

                        }__CLR4_5_2694694lusyjkeu.R.inc(11155);boolean exp = chLocal == 'e' || chLocal == 'E';
                        __CLR4_5_2694694lusyjkeu.R.inc(11156);if ((((exp)&&(__CLR4_5_2694694lusyjkeu.R.iget(11157)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11158)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(11159);chLocal = charAt(bp + (offset++));
                            __CLR4_5_2694694lusyjkeu.R.inc(11160);if ((((chLocal == '+' || chLocal == '-')&&(__CLR4_5_2694694lusyjkeu.R.iget(11161)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11162)==0&false))) {{
                                __CLR4_5_2694694lusyjkeu.R.inc(11163);chLocal = charAt(bp + (offset++));
                            }
                            }__CLR4_5_2694694lusyjkeu.R.inc(11164);for (;;) {{
                                __CLR4_5_2694694lusyjkeu.R.inc(11165);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(11166)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11167)==0&false))) {{
                                    __CLR4_5_2694694lusyjkeu.R.inc(11168);chLocal = charAt(bp + (offset++));
                                } }else {{
                                    __CLR4_5_2694694lusyjkeu.R.inc(11169);break;
                                }
                            }}
                        }}

                        }__CLR4_5_2694694lusyjkeu.R.inc(11170);int count = bp + offset - start - 1;
                        __CLR4_5_2694694lusyjkeu.R.inc(11171);float value;
                        __CLR4_5_2694694lusyjkeu.R.inc(11172);if ((((!exp && count < 10)&&(__CLR4_5_2694694lusyjkeu.R.iget(11173)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11174)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(11175);value = ((float) intVal) / power;
                            __CLR4_5_2694694lusyjkeu.R.inc(11176);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(11177)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11178)==0&false))) {{
                                __CLR4_5_2694694lusyjkeu.R.inc(11179);value = -value;
                            }
                        }} }else {{
                            __CLR4_5_2694694lusyjkeu.R.inc(11180);String text = this.subString(start, count);
                            __CLR4_5_2694694lusyjkeu.R.inc(11181);value = Float.parseFloat(text);
                        }

                        }__CLR4_5_2694694lusyjkeu.R.inc(11182);if ((((arrayIndex >= array.length)&&(__CLR4_5_2694694lusyjkeu.R.iget(11183)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11184)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(11185);float[] tmp = new float[array.length * 3 / 2];
                            __CLR4_5_2694694lusyjkeu.R.inc(11186);System.arraycopy(array, 0, tmp, 0, arrayIndex);
                            __CLR4_5_2694694lusyjkeu.R.inc(11187);array = tmp;
                        }
                        }__CLR4_5_2694694lusyjkeu.R.inc(11188);array[arrayIndex++] = value;

                        __CLR4_5_2694694lusyjkeu.R.inc(11189);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(11190)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11191)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(11192);chLocal = charAt(bp + (offset++));
                        } }else {__CLR4_5_2694694lusyjkeu.R.inc(11193);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(11194)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11195)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(11196);chLocal = charAt(bp + (offset++));
                            __CLR4_5_2694694lusyjkeu.R.inc(11197);break;
                        }
                    }}} }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(11198);matchStat = NOT_MATCH;
                        __CLR4_5_2694694lusyjkeu.R.inc(11199);return null;
                    }
                }}

                // compact
                }__CLR4_5_2694694lusyjkeu.R.inc(11200);if ((((arrayIndex != array.length)&&(__CLR4_5_2694694lusyjkeu.R.iget(11201)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11202)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11203);float[] tmp = new float[arrayIndex];
                    __CLR4_5_2694694lusyjkeu.R.inc(11204);System.arraycopy(array, 0, tmp, 0, arrayIndex);
                    __CLR4_5_2694694lusyjkeu.R.inc(11205);array = tmp;
                }

                }__CLR4_5_2694694lusyjkeu.R.inc(11206);if ((((arrayarrayIndex >= arrayarray.length)&&(__CLR4_5_2694694lusyjkeu.R.iget(11207)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11208)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11209);float[][] tmp = new float[arrayarray.length * 3 / 2][];
                    __CLR4_5_2694694lusyjkeu.R.inc(11210);System.arraycopy(array, 0, tmp, 0, arrayIndex);
                    __CLR4_5_2694694lusyjkeu.R.inc(11211);arrayarray = tmp;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(11212);arrayarray[arrayarrayIndex++] = array;

                __CLR4_5_2694694lusyjkeu.R.inc(11213);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(11214)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11215)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11216);chLocal = charAt(bp + (offset++));
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(11217);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(11218)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11219)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11220);chLocal = charAt(bp + (offset++));
                    __CLR4_5_2694694lusyjkeu.R.inc(11221);break;
                }
            }}} }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(11222);break;
            }
        }}

        // compact
        }__CLR4_5_2694694lusyjkeu.R.inc(11223);if ((((arrayarrayIndex != arrayarray.length)&&(__CLR4_5_2694694lusyjkeu.R.iget(11224)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11225)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11226);float[][] tmp = new float[arrayarrayIndex][];
            __CLR4_5_2694694lusyjkeu.R.inc(11227);System.arraycopy(arrayarray, 0, tmp, 0, arrayarrayIndex);
            __CLR4_5_2694694lusyjkeu.R.inc(11228);arrayarray = tmp;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11229);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(11230)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11231)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11232);bp += (offset - 1);
            __CLR4_5_2694694lusyjkeu.R.inc(11233);this.next();
            __CLR4_5_2694694lusyjkeu.R.inc(11234);matchStat = VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(11235);token = JSONToken.COMMA;
            __CLR4_5_2694694lusyjkeu.R.inc(11236);return arrayarray;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11237);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(11238)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11239)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11240);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(11241);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(11242)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11243)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11244);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(11245);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(11246);this.next();
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(11247);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(11248)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11249)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11250);token = JSONToken.RBRACKET;
                __CLR4_5_2694694lusyjkeu.R.inc(11251);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(11252);this.next();
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(11253);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(11254)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11255)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11256);token = JSONToken.RBRACE;
                __CLR4_5_2694694lusyjkeu.R.inc(11257);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(11258);this.next();
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(11259);if ((((chLocal == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(11260)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11261)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11262);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(11263);token = JSONToken.EOF;
                __CLR4_5_2694694lusyjkeu.R.inc(11264);ch = EOI;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(11265);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(11266);return null;
            }
            }}}}__CLR4_5_2694694lusyjkeu.R.inc(11267);matchStat = END;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(11268);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(11269);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11270);return arrayarray;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final double scanFieldDouble(char[] fieldName) {try{__CLR4_5_2694694lusyjkeu.R.inc(11271);
        __CLR4_5_2694694lusyjkeu.R.inc(11272);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(11273);if ((((!charArrayCompare(fieldName))&&(__CLR4_5_2694694lusyjkeu.R.iget(11274)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11275)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11276);matchStat = NOT_MATCH_NAME;
            __CLR4_5_2694694lusyjkeu.R.inc(11277);return 0;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11278);int offset = fieldName.length;
        __CLR4_5_2694694lusyjkeu.R.inc(11279);char chLocal = charAt(bp + (offset++));
        __CLR4_5_2694694lusyjkeu.R.inc(11280);final boolean quote = chLocal == '"';
        __CLR4_5_2694694lusyjkeu.R.inc(11281);if ((((quote)&&(__CLR4_5_2694694lusyjkeu.R.iget(11282)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11283)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11284);chLocal = charAt(bp + (offset++));
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11285);boolean negative = chLocal == '-';
        __CLR4_5_2694694lusyjkeu.R.inc(11286);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(11287)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11288)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11289);chLocal = charAt(bp + (offset++));
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11290);double value;
        __CLR4_5_2694694lusyjkeu.R.inc(11291);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(11292)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11293)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11294);long intVal = chLocal - '0';

            __CLR4_5_2694694lusyjkeu.R.inc(11295);for (;;) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11296);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(11297);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(11298)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11299)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11300);intVal = intVal * 10 + (chLocal - '0');
                    __CLR4_5_2694694lusyjkeu.R.inc(11301);continue;
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11302);break;
                }
            }}

            }__CLR4_5_2694694lusyjkeu.R.inc(11303);long power = 1;
            __CLR4_5_2694694lusyjkeu.R.inc(11304);boolean small = (chLocal == '.');
            __CLR4_5_2694694lusyjkeu.R.inc(11305);if ((((small)&&(__CLR4_5_2694694lusyjkeu.R.iget(11306)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11307)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11308);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(11309);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(11310)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11311)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11312);intVal = intVal * 10 + (chLocal - '0');
                    __CLR4_5_2694694lusyjkeu.R.inc(11313);power = 10;
                    __CLR4_5_2694694lusyjkeu.R.inc(11314);for (;;) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(11315);chLocal = charAt(bp + (offset++));
                        __CLR4_5_2694694lusyjkeu.R.inc(11316);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(11317)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11318)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(11319);intVal = intVal * 10 + (chLocal - '0');
                            __CLR4_5_2694694lusyjkeu.R.inc(11320);power *= 10;
                            __CLR4_5_2694694lusyjkeu.R.inc(11321);continue;
                        } }else {{
                            __CLR4_5_2694694lusyjkeu.R.inc(11322);break;
                        }
                    }}
                }} }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11323);matchStat = NOT_MATCH;
                    __CLR4_5_2694694lusyjkeu.R.inc(11324);return 0;
                }
            }}

            }__CLR4_5_2694694lusyjkeu.R.inc(11325);boolean exp = chLocal == 'e' || chLocal == 'E';
            __CLR4_5_2694694lusyjkeu.R.inc(11326);if ((((exp)&&(__CLR4_5_2694694lusyjkeu.R.iget(11327)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11328)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11329);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(11330);if ((((chLocal == '+' || chLocal == '-')&&(__CLR4_5_2694694lusyjkeu.R.iget(11331)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11332)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11333);chLocal = charAt(bp + (offset++));
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(11334);for (;;) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11335);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(11336)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11337)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(11338);chLocal = charAt(bp + (offset++));
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(11339);break;
                    }
                }}
            }}

            }__CLR4_5_2694694lusyjkeu.R.inc(11340);int start, count;
            __CLR4_5_2694694lusyjkeu.R.inc(11341);if ((((quote)&&(__CLR4_5_2694694lusyjkeu.R.iget(11342)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11343)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11344);if ((((chLocal != '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(11345)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11346)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11347);matchStat = NOT_MATCH;
                    __CLR4_5_2694694lusyjkeu.R.inc(11348);return 0;
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11349);chLocal = charAt(bp + (offset++));
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(11350);start = bp + fieldName.length + 1;
                __CLR4_5_2694694lusyjkeu.R.inc(11351);count = bp + offset - start - 2;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(11352);start = bp + fieldName.length;
                __CLR4_5_2694694lusyjkeu.R.inc(11353);count = bp + offset - start - 1;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(11354);if ((((!exp && count < 17)&&(__CLR4_5_2694694lusyjkeu.R.iget(11355)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11356)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11357);value = ((double) intVal) / power;
                __CLR4_5_2694694lusyjkeu.R.inc(11358);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(11359)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11360)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11361);value = -value;
                }
            }} }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(11362);String text = this.subString(start, count);
                __CLR4_5_2694694lusyjkeu.R.inc(11363);value = Double.parseDouble(text);
            }
        }} }else {__CLR4_5_2694694lusyjkeu.R.inc(11364);if ((((chLocal == 'n' &&
                   charAt(bp + offset) == 'u' &&
                   charAt(bp + offset + 1) == 'l' &&
                   charAt(bp + offset + 2) == 'l')&&(__CLR4_5_2694694lusyjkeu.R.iget(11365)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11366)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11367);matchStat = VALUE_NULL;
            __CLR4_5_2694694lusyjkeu.R.inc(11368);value = 0;
            __CLR4_5_2694694lusyjkeu.R.inc(11369);offset += 3;
            __CLR4_5_2694694lusyjkeu.R.inc(11370);chLocal = charAt(bp + offset++);

            __CLR4_5_2694694lusyjkeu.R.inc(11371);if ((((quote && chLocal == '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(11372)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11373)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11374);chLocal = charAt(bp + offset++);
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(11375);for (;;) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11376);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(11377)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11378)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11379);bp += offset;
                    __CLR4_5_2694694lusyjkeu.R.inc(11380);this.ch = charAt(bp);
                    __CLR4_5_2694694lusyjkeu.R.inc(11381);matchStat = VALUE_NULL;
                    __CLR4_5_2694694lusyjkeu.R.inc(11382);token = JSONToken.COMMA;
                    __CLR4_5_2694694lusyjkeu.R.inc(11383);return value;
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(11384);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(11385)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11386)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11387);bp += offset;
                    __CLR4_5_2694694lusyjkeu.R.inc(11388);this.ch = charAt(bp);
                    __CLR4_5_2694694lusyjkeu.R.inc(11389);matchStat = VALUE_NULL;
                    __CLR4_5_2694694lusyjkeu.R.inc(11390);token = JSONToken.RBRACE;
                    __CLR4_5_2694694lusyjkeu.R.inc(11391);return value;
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(11392);if ((((isWhitespace(chLocal))&&(__CLR4_5_2694694lusyjkeu.R.iget(11393)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11394)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11395);chLocal = charAt(bp + offset++);
                    __CLR4_5_2694694lusyjkeu.R.inc(11396);continue;
                }
                }}}__CLR4_5_2694694lusyjkeu.R.inc(11397);break;
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(11398);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(11399);return 0;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(11400);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(11401);return 0;
        }

        }}__CLR4_5_2694694lusyjkeu.R.inc(11402);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(11403)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11404)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11405);bp += offset;
            __CLR4_5_2694694lusyjkeu.R.inc(11406);this.ch = this.charAt(bp);
            __CLR4_5_2694694lusyjkeu.R.inc(11407);matchStat = VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(11408);token = JSONToken.COMMA;
            __CLR4_5_2694694lusyjkeu.R.inc(11409);return value;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11410);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(11411)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11412)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11413);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(11414);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(11415)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11416)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11417);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(11418);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(11419);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(11420);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(11421)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11422)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11423);token = JSONToken.RBRACKET;
                __CLR4_5_2694694lusyjkeu.R.inc(11424);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(11425);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(11426);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(11427)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11428)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11429);token = JSONToken.RBRACE;
                __CLR4_5_2694694lusyjkeu.R.inc(11430);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(11431);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(11432);if ((((chLocal == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(11433)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11434)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11435);token = JSONToken.EOF;
                __CLR4_5_2694694lusyjkeu.R.inc(11436);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(11437);ch = EOI;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(11438);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(11439);return 0;
            }
            }}}}__CLR4_5_2694694lusyjkeu.R.inc(11440);matchStat = END;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(11441);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(11442);return 0;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11443);return value;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public BigDecimal scanFieldDecimal(char[] fieldName) {try{__CLR4_5_2694694lusyjkeu.R.inc(11444);
        __CLR4_5_2694694lusyjkeu.R.inc(11445);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(11446);if ((((!charArrayCompare(fieldName))&&(__CLR4_5_2694694lusyjkeu.R.iget(11447)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11448)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11449);matchStat = NOT_MATCH_NAME;
            __CLR4_5_2694694lusyjkeu.R.inc(11450);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11451);int offset = fieldName.length;
        __CLR4_5_2694694lusyjkeu.R.inc(11452);char chLocal = charAt(bp + (offset++));
        __CLR4_5_2694694lusyjkeu.R.inc(11453);final boolean quote = chLocal == '"';
        __CLR4_5_2694694lusyjkeu.R.inc(11454);if ((((quote)&&(__CLR4_5_2694694lusyjkeu.R.iget(11455)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11456)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11457);chLocal = charAt(bp + (offset++));
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11458);boolean negative = chLocal == '-';
        __CLR4_5_2694694lusyjkeu.R.inc(11459);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(11460)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11461)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11462);chLocal = charAt(bp + (offset++));
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11463);BigDecimal value;
        __CLR4_5_2694694lusyjkeu.R.inc(11464);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(11465)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11466)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11467);for (;;) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11468);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(11469);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(11470)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11471)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11472);continue;
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11473);break;
                }
            }}

            }__CLR4_5_2694694lusyjkeu.R.inc(11474);boolean small = (chLocal == '.');
            __CLR4_5_2694694lusyjkeu.R.inc(11475);if ((((small)&&(__CLR4_5_2694694lusyjkeu.R.iget(11476)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11477)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11478);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(11479);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(11480)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11481)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11482);for (;;) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(11483);chLocal = charAt(bp + (offset++));
                        __CLR4_5_2694694lusyjkeu.R.inc(11484);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(11485)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11486)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(11487);continue;
                        } }else {{
                            __CLR4_5_2694694lusyjkeu.R.inc(11488);break;
                        }
                    }}
                }} }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11489);matchStat = NOT_MATCH;
                    __CLR4_5_2694694lusyjkeu.R.inc(11490);return null;
                }
            }}

            }__CLR4_5_2694694lusyjkeu.R.inc(11491);boolean exp = chLocal == 'e' || chLocal == 'E';
            __CLR4_5_2694694lusyjkeu.R.inc(11492);if ((((exp)&&(__CLR4_5_2694694lusyjkeu.R.iget(11493)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11494)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11495);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(11496);if ((((chLocal == '+' || chLocal == '-')&&(__CLR4_5_2694694lusyjkeu.R.iget(11497)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11498)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11499);chLocal = charAt(bp + (offset++));
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(11500);for (;;) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11501);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(11502)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11503)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(11504);chLocal = charAt(bp + (offset++));
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(11505);break;
                    }
                }}
            }}

            }__CLR4_5_2694694lusyjkeu.R.inc(11506);int start, count;
            __CLR4_5_2694694lusyjkeu.R.inc(11507);if ((((quote)&&(__CLR4_5_2694694lusyjkeu.R.iget(11508)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11509)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11510);if ((((chLocal != '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(11511)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11512)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11513);matchStat = NOT_MATCH;
                    __CLR4_5_2694694lusyjkeu.R.inc(11514);return null;
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11515);chLocal = charAt(bp + (offset++));
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(11516);start = bp + fieldName.length + 1;
                __CLR4_5_2694694lusyjkeu.R.inc(11517);count = bp + offset - start - 2;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(11518);start = bp + fieldName.length;
                __CLR4_5_2694694lusyjkeu.R.inc(11519);count = bp + offset - start - 1;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(11520);char[] chars = this.sub_chars(start, count);
            __CLR4_5_2694694lusyjkeu.R.inc(11521);value = new BigDecimal(chars);
        } }else {__CLR4_5_2694694lusyjkeu.R.inc(11522);if ((((chLocal == 'n' &&
                   charAt(bp + offset) == 'u' &&
                   charAt(bp + offset + 1) == 'l' &&
                   charAt(bp + offset + 2) == 'l')&&(__CLR4_5_2694694lusyjkeu.R.iget(11523)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11524)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11525);matchStat = VALUE_NULL;
            __CLR4_5_2694694lusyjkeu.R.inc(11526);value = null;
            __CLR4_5_2694694lusyjkeu.R.inc(11527);offset += 3;
            __CLR4_5_2694694lusyjkeu.R.inc(11528);chLocal = charAt(bp + offset++);

            __CLR4_5_2694694lusyjkeu.R.inc(11529);if ((((quote && chLocal == '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(11530)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11531)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11532);chLocal = charAt(bp + offset++);
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(11533);for (;;) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11534);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(11535)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11536)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11537);bp += offset;
                    __CLR4_5_2694694lusyjkeu.R.inc(11538);this.ch = charAt(bp);
                    __CLR4_5_2694694lusyjkeu.R.inc(11539);matchStat = VALUE_NULL;
                    __CLR4_5_2694694lusyjkeu.R.inc(11540);token = JSONToken.COMMA;
                    __CLR4_5_2694694lusyjkeu.R.inc(11541);return value;
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(11542);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(11543)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11544)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11545);bp += offset;
                    __CLR4_5_2694694lusyjkeu.R.inc(11546);this.ch = charAt(bp);
                    __CLR4_5_2694694lusyjkeu.R.inc(11547);matchStat = VALUE_NULL;
                    __CLR4_5_2694694lusyjkeu.R.inc(11548);token = JSONToken.RBRACE;
                    __CLR4_5_2694694lusyjkeu.R.inc(11549);return value;
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(11550);if ((((isWhitespace(chLocal))&&(__CLR4_5_2694694lusyjkeu.R.iget(11551)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11552)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11553);chLocal = charAt(bp + offset++);
                    __CLR4_5_2694694lusyjkeu.R.inc(11554);continue;
                }
                }}}__CLR4_5_2694694lusyjkeu.R.inc(11555);break;
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(11556);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(11557);return null;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(11558);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(11559);return null;
        }

        }}__CLR4_5_2694694lusyjkeu.R.inc(11560);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(11561)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11562)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11563);bp += offset;
            __CLR4_5_2694694lusyjkeu.R.inc(11564);this.ch = this.charAt(bp);
            __CLR4_5_2694694lusyjkeu.R.inc(11565);matchStat = VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(11566);token = JSONToken.COMMA;
            __CLR4_5_2694694lusyjkeu.R.inc(11567);return value;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11568);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(11569)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11570)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11571);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(11572);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(11573)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11574)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11575);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(11576);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(11577);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(11578);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(11579)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11580)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11581);token = JSONToken.RBRACKET;
                __CLR4_5_2694694lusyjkeu.R.inc(11582);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(11583);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(11584);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(11585)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11586)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11587);token = JSONToken.RBRACE;
                __CLR4_5_2694694lusyjkeu.R.inc(11588);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(11589);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(11590);if ((((chLocal == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(11591)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11592)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11593);token = JSONToken.EOF;
                __CLR4_5_2694694lusyjkeu.R.inc(11594);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(11595);ch = EOI;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(11596);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(11597);return null;
            }
            }}}}__CLR4_5_2694694lusyjkeu.R.inc(11598);matchStat = END;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(11599);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(11600);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11601);return value;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public BigInteger scanFieldBigInteger(char[] fieldName) {try{__CLR4_5_2694694lusyjkeu.R.inc(11602);
        __CLR4_5_2694694lusyjkeu.R.inc(11603);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(11604);if ((((!charArrayCompare(fieldName))&&(__CLR4_5_2694694lusyjkeu.R.iget(11605)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11606)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11607);matchStat = NOT_MATCH_NAME;
            __CLR4_5_2694694lusyjkeu.R.inc(11608);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11609);int offset = fieldName.length;
        __CLR4_5_2694694lusyjkeu.R.inc(11610);char chLocal = charAt(bp + (offset++));
        __CLR4_5_2694694lusyjkeu.R.inc(11611);final boolean quote = chLocal == '"';
        __CLR4_5_2694694lusyjkeu.R.inc(11612);if ((((quote)&&(__CLR4_5_2694694lusyjkeu.R.iget(11613)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11614)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11615);chLocal = charAt(bp + (offset++));
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11616);boolean negative = chLocal == '-';
        __CLR4_5_2694694lusyjkeu.R.inc(11617);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(11618)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11619)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11620);chLocal = charAt(bp + (offset++));
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11621);BigInteger value;
        __CLR4_5_2694694lusyjkeu.R.inc(11622);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(11623)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11624)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11625);long intVal = chLocal - '0';
            __CLR4_5_2694694lusyjkeu.R.inc(11626);boolean overflow = false;
            __CLR4_5_2694694lusyjkeu.R.inc(11627);long temp;
            __CLR4_5_2694694lusyjkeu.R.inc(11628);for (;;) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11629);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(11630);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(11631)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11632)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11633);temp = intVal * 10 + (chLocal - '0');
                    __CLR4_5_2694694lusyjkeu.R.inc(11634);if ((((temp < intVal)&&(__CLR4_5_2694694lusyjkeu.R.iget(11635)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11636)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(11637);overflow = true;
                        __CLR4_5_2694694lusyjkeu.R.inc(11638);break;
                    }
                    }__CLR4_5_2694694lusyjkeu.R.inc(11639);intVal = temp;
                    __CLR4_5_2694694lusyjkeu.R.inc(11640);continue;
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11641);break;
                }
            }}

            }__CLR4_5_2694694lusyjkeu.R.inc(11642);int start, count;
            __CLR4_5_2694694lusyjkeu.R.inc(11643);if ((((quote)&&(__CLR4_5_2694694lusyjkeu.R.iget(11644)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11645)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11646);if ((((chLocal != '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(11647)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11648)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11649);matchStat = NOT_MATCH;
                    __CLR4_5_2694694lusyjkeu.R.inc(11650);return null;
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11651);chLocal = charAt(bp + (offset++));
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(11652);start = bp + fieldName.length + 1;
                __CLR4_5_2694694lusyjkeu.R.inc(11653);count = bp + offset - start - 2;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(11654);start = bp + fieldName.length;
                __CLR4_5_2694694lusyjkeu.R.inc(11655);count = bp + offset - start - 1;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(11656);if ((((!overflow && (count < 20 || (negative && count < 21)))&&(__CLR4_5_2694694lusyjkeu.R.iget(11657)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11658)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11659);value = BigInteger.valueOf((((negative )&&(__CLR4_5_2694694lusyjkeu.R.iget(11660)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11661)==0&false))? -intVal : intVal);
            } }else {{

//            char[] chars = this.sub_chars(negative ? start + 1 : start, count);
//            value = new BigInteger(chars, )
                __CLR4_5_2694694lusyjkeu.R.inc(11662);String strVal = this.subString(start, count);
                __CLR4_5_2694694lusyjkeu.R.inc(11663);value = new BigInteger(strVal);
            }
        }} }else {__CLR4_5_2694694lusyjkeu.R.inc(11664);if ((((chLocal == 'n' &&
                   charAt(bp + offset) == 'u' &&
                   charAt(bp + offset + 1) == 'l' &&
                   charAt(bp + offset + 2) == 'l')&&(__CLR4_5_2694694lusyjkeu.R.iget(11665)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11666)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11667);matchStat = VALUE_NULL;
            __CLR4_5_2694694lusyjkeu.R.inc(11668);value = null;
            __CLR4_5_2694694lusyjkeu.R.inc(11669);offset += 3;
            __CLR4_5_2694694lusyjkeu.R.inc(11670);chLocal = charAt(bp + offset++);

            __CLR4_5_2694694lusyjkeu.R.inc(11671);if ((((quote && chLocal == '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(11672)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11673)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11674);chLocal = charAt(bp + offset++);
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(11675);for (;;) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11676);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(11677)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11678)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11679);bp += offset;
                    __CLR4_5_2694694lusyjkeu.R.inc(11680);this.ch = charAt(bp);
                    __CLR4_5_2694694lusyjkeu.R.inc(11681);matchStat = VALUE_NULL;
                    __CLR4_5_2694694lusyjkeu.R.inc(11682);token = JSONToken.COMMA;
                    __CLR4_5_2694694lusyjkeu.R.inc(11683);return value;
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(11684);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(11685)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11686)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11687);bp += offset;
                    __CLR4_5_2694694lusyjkeu.R.inc(11688);this.ch = charAt(bp);
                    __CLR4_5_2694694lusyjkeu.R.inc(11689);matchStat = VALUE_NULL;
                    __CLR4_5_2694694lusyjkeu.R.inc(11690);token = JSONToken.RBRACE;
                    __CLR4_5_2694694lusyjkeu.R.inc(11691);return value;
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(11692);if ((((isWhitespace(chLocal))&&(__CLR4_5_2694694lusyjkeu.R.iget(11693)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11694)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11695);chLocal = charAt(bp + offset++);
                    __CLR4_5_2694694lusyjkeu.R.inc(11696);continue;
                }
                }}}__CLR4_5_2694694lusyjkeu.R.inc(11697);break;
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(11698);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(11699);return null;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(11700);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(11701);return null;
        }

        }}__CLR4_5_2694694lusyjkeu.R.inc(11702);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(11703)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11704)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11705);bp += offset;
            __CLR4_5_2694694lusyjkeu.R.inc(11706);this.ch = this.charAt(bp);
            __CLR4_5_2694694lusyjkeu.R.inc(11707);matchStat = VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(11708);token = JSONToken.COMMA;
            __CLR4_5_2694694lusyjkeu.R.inc(11709);return value;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11710);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(11711)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11712)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11713);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(11714);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(11715)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11716)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11717);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(11718);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(11719);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(11720);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(11721)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11722)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11723);token = JSONToken.RBRACKET;
                __CLR4_5_2694694lusyjkeu.R.inc(11724);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(11725);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(11726);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(11727)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11728)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11729);token = JSONToken.RBRACE;
                __CLR4_5_2694694lusyjkeu.R.inc(11730);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(11731);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(11732);if ((((chLocal == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(11733)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11734)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11735);token = JSONToken.EOF;
                __CLR4_5_2694694lusyjkeu.R.inc(11736);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(11737);ch = EOI;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(11738);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(11739);return null;
            }
            }}}}__CLR4_5_2694694lusyjkeu.R.inc(11740);matchStat = END;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(11741);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(11742);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11743);return value;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public java.util.Date scanFieldDate(char[] fieldName) {try{__CLR4_5_2694694lusyjkeu.R.inc(11744);
        __CLR4_5_2694694lusyjkeu.R.inc(11745);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(11746);if ((((!charArrayCompare(fieldName))&&(__CLR4_5_2694694lusyjkeu.R.iget(11747)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11748)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11749);matchStat = NOT_MATCH_NAME;
            __CLR4_5_2694694lusyjkeu.R.inc(11750);return null;
        }

        // int index = bp + fieldName.length;

        }__CLR4_5_2694694lusyjkeu.R.inc(11751);int offset = fieldName.length;
        __CLR4_5_2694694lusyjkeu.R.inc(11752);char chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(11753);final java.util.Date dateVal;
        __CLR4_5_2694694lusyjkeu.R.inc(11754);if ((((chLocal == '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(11755)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11756)==0&false))){{
            __CLR4_5_2694694lusyjkeu.R.inc(11757);int startIndex = bp + fieldName.length + 1;
            __CLR4_5_2694694lusyjkeu.R.inc(11758);int endIndex = indexOf('"', startIndex);
            __CLR4_5_2694694lusyjkeu.R.inc(11759);if ((((endIndex == -1)&&(__CLR4_5_2694694lusyjkeu.R.iget(11760)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11761)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11762);throw new JSONException("unclosed str");
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(11763);int startIndex2 = bp + fieldName.length + 1; // must re compute
            __CLR4_5_2694694lusyjkeu.R.inc(11764);String stringVal = subString(startIndex2, endIndex - startIndex2);
            __CLR4_5_2694694lusyjkeu.R.inc(11765);if ((((stringVal.indexOf('\\') != -1)&&(__CLR4_5_2694694lusyjkeu.R.iget(11766)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11767)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11768);for (;;) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11769);int slashCount = 0;
                    __CLR4_5_2694694lusyjkeu.R.inc(11770);for (int i = endIndex - 1; (((i >= 0)&&(__CLR4_5_2694694lusyjkeu.R.iget(11771)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11772)==0&false)); --i) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(11773);if ((((charAt(i) == '\\')&&(__CLR4_5_2694694lusyjkeu.R.iget(11774)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11775)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(11776);slashCount++;
                        } }else {{
                            __CLR4_5_2694694lusyjkeu.R.inc(11777);break;
                        }
                    }}
                    }__CLR4_5_2694694lusyjkeu.R.inc(11778);if ((((slashCount % 2 == 0)&&(__CLR4_5_2694694lusyjkeu.R.iget(11779)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11780)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(11781);break;
                    }
                    }__CLR4_5_2694694lusyjkeu.R.inc(11782);endIndex = indexOf('"', endIndex + 1);
                }

                }__CLR4_5_2694694lusyjkeu.R.inc(11783);int chars_len = endIndex - (bp + fieldName.length + 1);
                __CLR4_5_2694694lusyjkeu.R.inc(11784);char[] chars = sub_chars( bp + fieldName.length + 1, chars_len);

                __CLR4_5_2694694lusyjkeu.R.inc(11785);stringVal = readString(chars, chars_len);
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(11786);offset += (endIndex - (bp + fieldName.length + 1) + 1);
            __CLR4_5_2694694lusyjkeu.R.inc(11787);chLocal = charAt(bp + (offset++));

            __CLR4_5_2694694lusyjkeu.R.inc(11788);JSONScanner dateLexer = new JSONScanner(stringVal);
            __CLR4_5_2694694lusyjkeu.R.inc(11789);try {
                __CLR4_5_2694694lusyjkeu.R.inc(11790);if ((((dateLexer.scanISO8601DateIfMatch(false))&&(__CLR4_5_2694694lusyjkeu.R.iget(11791)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11792)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11793);Calendar calendar = dateLexer.getCalendar();
                    __CLR4_5_2694694lusyjkeu.R.inc(11794);dateVal = calendar.getTime();
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11795);matchStat = NOT_MATCH;
                    __CLR4_5_2694694lusyjkeu.R.inc(11796);return null;
                }
            }} finally {
                __CLR4_5_2694694lusyjkeu.R.inc(11797);dateLexer.close();
            }
        } }else {__CLR4_5_2694694lusyjkeu.R.inc(11798);if ((((chLocal == '-' || (chLocal >= '0' && chLocal <= '9'))&&(__CLR4_5_2694694lusyjkeu.R.iget(11799)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11800)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11801);long millis = 0;

            __CLR4_5_2694694lusyjkeu.R.inc(11802);boolean negative = false;
            __CLR4_5_2694694lusyjkeu.R.inc(11803);if ((((chLocal == '-')&&(__CLR4_5_2694694lusyjkeu.R.iget(11804)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11805)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11806);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(11807);negative = true;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(11808);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(11809)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11810)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11811);millis = chLocal - '0';
                __CLR4_5_2694694lusyjkeu.R.inc(11812);for (; ; ) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11813);chLocal = charAt(bp + (offset++));
                    __CLR4_5_2694694lusyjkeu.R.inc(11814);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(11815)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11816)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(11817);millis = millis * 10 + (chLocal - '0');
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(11818);break;
                    }
                }}
            }}

            }__CLR4_5_2694694lusyjkeu.R.inc(11819);if ((((millis < 0)&&(__CLR4_5_2694694lusyjkeu.R.iget(11820)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11821)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11822);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(11823);return null;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(11824);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(11825)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11826)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11827);millis = -millis;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(11828);dateVal = new java.util.Date(millis);
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(11829);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(11830);return null;
        }

        }}__CLR4_5_2694694lusyjkeu.R.inc(11831);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(11832)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11833)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11834);bp += offset;
            __CLR4_5_2694694lusyjkeu.R.inc(11835);this.ch = this.charAt(bp);
            __CLR4_5_2694694lusyjkeu.R.inc(11836);matchStat = VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(11837);return dateVal;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11838);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(11839)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11840)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11841);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(11842);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(11843)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11844)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11845);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(11846);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(11847);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(11848);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(11849)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11850)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11851);token = JSONToken.RBRACKET;
                __CLR4_5_2694694lusyjkeu.R.inc(11852);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(11853);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(11854);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(11855)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11856)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11857);token = JSONToken.RBRACE;
                __CLR4_5_2694694lusyjkeu.R.inc(11858);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(11859);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(11860);if ((((chLocal == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(11861)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11862)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11863);token = JSONToken.EOF;
                __CLR4_5_2694694lusyjkeu.R.inc(11864);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(11865);ch = EOI;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(11866);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(11867);return null;
            }
            }}}}__CLR4_5_2694694lusyjkeu.R.inc(11868);matchStat = END;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(11869);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(11870);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11871);return dateVal;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public java.util.Date scanDate(char seperator) {try{__CLR4_5_2694694lusyjkeu.R.inc(11872);
        __CLR4_5_2694694lusyjkeu.R.inc(11873);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(11874);int offset = 0;
        __CLR4_5_2694694lusyjkeu.R.inc(11875);char chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(11876);final java.util.Date dateVal;
        __CLR4_5_2694694lusyjkeu.R.inc(11877);if ((((chLocal == '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(11878)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11879)==0&false))){{
            __CLR4_5_2694694lusyjkeu.R.inc(11880);int startIndex = bp + 1;
            __CLR4_5_2694694lusyjkeu.R.inc(11881);int endIndex = indexOf('"', startIndex);
            __CLR4_5_2694694lusyjkeu.R.inc(11882);if ((((endIndex == -1)&&(__CLR4_5_2694694lusyjkeu.R.iget(11883)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11884)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11885);throw new JSONException("unclosed str");
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(11886);int startIndex2 = bp + 1; // must re compute
            __CLR4_5_2694694lusyjkeu.R.inc(11887);String stringVal = subString(startIndex2, endIndex - startIndex2);
            __CLR4_5_2694694lusyjkeu.R.inc(11888);if ((((stringVal.indexOf('\\') != -1)&&(__CLR4_5_2694694lusyjkeu.R.iget(11889)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11890)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11891);for (;;) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11892);int slashCount = 0;
                    __CLR4_5_2694694lusyjkeu.R.inc(11893);for (int i = endIndex - 1; (((i >= 0)&&(__CLR4_5_2694694lusyjkeu.R.iget(11894)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11895)==0&false)); --i) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(11896);if ((((charAt(i) == '\\')&&(__CLR4_5_2694694lusyjkeu.R.iget(11897)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11898)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(11899);slashCount++;
                        } }else {{
                            __CLR4_5_2694694lusyjkeu.R.inc(11900);break;
                        }
                    }}
                    }__CLR4_5_2694694lusyjkeu.R.inc(11901);if ((((slashCount % 2 == 0)&&(__CLR4_5_2694694lusyjkeu.R.iget(11902)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11903)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(11904);break;
                    }
                    }__CLR4_5_2694694lusyjkeu.R.inc(11905);endIndex = indexOf('"', endIndex + 1);
                }

                }__CLR4_5_2694694lusyjkeu.R.inc(11906);int chars_len = endIndex - (bp + 1);
                __CLR4_5_2694694lusyjkeu.R.inc(11907);char[] chars = sub_chars( bp + 1, chars_len);

                __CLR4_5_2694694lusyjkeu.R.inc(11908);stringVal = readString(chars, chars_len);
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(11909);offset += (endIndex - (bp + 1) + 1);
            __CLR4_5_2694694lusyjkeu.R.inc(11910);chLocal = charAt(bp + (offset++));

            __CLR4_5_2694694lusyjkeu.R.inc(11911);JSONScanner dateLexer = new JSONScanner(stringVal);
            __CLR4_5_2694694lusyjkeu.R.inc(11912);try {
                __CLR4_5_2694694lusyjkeu.R.inc(11913);if ((((dateLexer.scanISO8601DateIfMatch(false))&&(__CLR4_5_2694694lusyjkeu.R.iget(11914)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11915)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11916);Calendar calendar = dateLexer.getCalendar();
                    __CLR4_5_2694694lusyjkeu.R.inc(11917);dateVal = calendar.getTime();
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11918);matchStat = NOT_MATCH;
                    __CLR4_5_2694694lusyjkeu.R.inc(11919);return null;
                }
            }} finally {
                __CLR4_5_2694694lusyjkeu.R.inc(11920);dateLexer.close();
            }
        } }else {__CLR4_5_2694694lusyjkeu.R.inc(11921);if ((((chLocal == '-' || (chLocal >= '0' && chLocal <= '9'))&&(__CLR4_5_2694694lusyjkeu.R.iget(11922)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11923)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11924);long millis = 0;

            __CLR4_5_2694694lusyjkeu.R.inc(11925);boolean negative = false;
            __CLR4_5_2694694lusyjkeu.R.inc(11926);if ((((chLocal == '-')&&(__CLR4_5_2694694lusyjkeu.R.iget(11927)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11928)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11929);chLocal = charAt(bp + (offset++));
                __CLR4_5_2694694lusyjkeu.R.inc(11930);negative = true;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(11931);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(11932)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11933)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11934);millis = chLocal - '0';
                __CLR4_5_2694694lusyjkeu.R.inc(11935);for (; ; ) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(11936);chLocal = charAt(bp + (offset++));
                    __CLR4_5_2694694lusyjkeu.R.inc(11937);if ((((chLocal >= '0' && chLocal <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(11938)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11939)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(11940);millis = millis * 10 + (chLocal - '0');
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(11941);break;
                    }
                }}
            }}

            }__CLR4_5_2694694lusyjkeu.R.inc(11942);if ((((millis < 0)&&(__CLR4_5_2694694lusyjkeu.R.iget(11943)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11944)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11945);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(11946);return null;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(11947);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(11948)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11949)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11950);millis = -millis;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(11951);dateVal = new java.util.Date(millis);
        } }else {__CLR4_5_2694694lusyjkeu.R.inc(11952);if ((((chLocal == 'n' &&
                   charAt(bp + offset) == 'u' &&
                   charAt(bp + offset + 1) == 'l' &&
                   charAt(bp + offset + 2) == 'l')&&(__CLR4_5_2694694lusyjkeu.R.iget(11953)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11954)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11955);matchStat = VALUE_NULL;
            __CLR4_5_2694694lusyjkeu.R.inc(11956);dateVal = null;
            __CLR4_5_2694694lusyjkeu.R.inc(11957);offset += 3;
            __CLR4_5_2694694lusyjkeu.R.inc(11958);chLocal = charAt(bp + offset++);
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(11959);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(11960);return null;
        }

        }}}__CLR4_5_2694694lusyjkeu.R.inc(11961);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(11962)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11963)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11964);bp += offset;
            __CLR4_5_2694694lusyjkeu.R.inc(11965);this.ch = this.charAt(bp);
            __CLR4_5_2694694lusyjkeu.R.inc(11966);matchStat = VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(11967);token = JSONToken.COMMA;
            __CLR4_5_2694694lusyjkeu.R.inc(11968);return dateVal;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(11969);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(11970)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11971)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(11972);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(11973);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(11974)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11975)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11976);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(11977);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(11978);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(11979);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(11980)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11981)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11982);token = JSONToken.RBRACKET;
                __CLR4_5_2694694lusyjkeu.R.inc(11983);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(11984);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(11985);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(11986)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11987)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11988);token = JSONToken.RBRACE;
                __CLR4_5_2694694lusyjkeu.R.inc(11989);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(11990);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(11991);if ((((chLocal == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(11992)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(11993)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(11994);token = JSONToken.EOF;
                __CLR4_5_2694694lusyjkeu.R.inc(11995);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(11996);ch = EOI;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(11997);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(11998);return null;
            }
            }}}}__CLR4_5_2694694lusyjkeu.R.inc(11999);matchStat = END;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(12000);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(12001);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(12002);return dateVal;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public java.util.UUID scanFieldUUID(char[] fieldName) {try{__CLR4_5_2694694lusyjkeu.R.inc(12003);
        __CLR4_5_2694694lusyjkeu.R.inc(12004);matchStat = UNKNOWN;

        __CLR4_5_2694694lusyjkeu.R.inc(12005);if ((((!charArrayCompare(fieldName))&&(__CLR4_5_2694694lusyjkeu.R.iget(12006)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12007)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12008);matchStat = NOT_MATCH_NAME;
            __CLR4_5_2694694lusyjkeu.R.inc(12009);return null;
        }

        // int index = bp + fieldName.length;

        }__CLR4_5_2694694lusyjkeu.R.inc(12010);int offset = fieldName.length;
        __CLR4_5_2694694lusyjkeu.R.inc(12011);char chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(12012);final java.util.UUID uuid;
        __CLR4_5_2694694lusyjkeu.R.inc(12013);if ((((chLocal == '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(12014)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12015)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12016);int startIndex = bp + fieldName.length + 1;
            __CLR4_5_2694694lusyjkeu.R.inc(12017);int endIndex = indexOf('"', startIndex);
            __CLR4_5_2694694lusyjkeu.R.inc(12018);if ((((endIndex == -1)&&(__CLR4_5_2694694lusyjkeu.R.iget(12019)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12020)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12021);throw new JSONException("unclosed str");
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(12022);int startIndex2 = bp + fieldName.length + 1; // must re compute
            __CLR4_5_2694694lusyjkeu.R.inc(12023);int len = endIndex - startIndex2;
            __CLR4_5_2694694lusyjkeu.R.inc(12024);if ((((len == 36)&&(__CLR4_5_2694694lusyjkeu.R.iget(12025)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12026)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12027);long mostSigBits = 0, leastSigBits = 0;
                __CLR4_5_2694694lusyjkeu.R.inc(12028);for (int i = 0; (((i < 8)&&(__CLR4_5_2694694lusyjkeu.R.iget(12029)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12030)==0&false)); ++i) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12031);char ch = charAt(startIndex2 + i);
                    __CLR4_5_2694694lusyjkeu.R.inc(12032);int num;
                    __CLR4_5_2694694lusyjkeu.R.inc(12033);if ((((ch >= '0' && ch <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(12034)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12035)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12036);num = ch - '0';
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12037);if ((((ch >= 'a' && ch <= 'f')&&(__CLR4_5_2694694lusyjkeu.R.iget(12038)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12039)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12040);num = 10 + (ch - 'a');
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12041);if ((((ch >= 'A' && ch <= 'F')&&(__CLR4_5_2694694lusyjkeu.R.iget(12042)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12043)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12044);num = 10 + (ch - 'A');
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12045);matchStat = NOT_MATCH_NAME;
                        __CLR4_5_2694694lusyjkeu.R.inc(12046);return null;
                    }

                    }}}__CLR4_5_2694694lusyjkeu.R.inc(12047);mostSigBits <<= 4;
                    __CLR4_5_2694694lusyjkeu.R.inc(12048);mostSigBits |= num;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(12049);for (int i = 9; (((i < 13)&&(__CLR4_5_2694694lusyjkeu.R.iget(12050)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12051)==0&false)); ++i) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12052);char ch = charAt(startIndex2 + i);
                    __CLR4_5_2694694lusyjkeu.R.inc(12053);int num;
                    __CLR4_5_2694694lusyjkeu.R.inc(12054);if ((((ch >= '0' && ch <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(12055)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12056)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12057);num = ch - '0';
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12058);if ((((ch >= 'a' && ch <= 'f')&&(__CLR4_5_2694694lusyjkeu.R.iget(12059)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12060)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12061);num = 10 + (ch - 'a');
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12062);if ((((ch >= 'A' && ch <= 'F')&&(__CLR4_5_2694694lusyjkeu.R.iget(12063)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12064)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12065);num = 10 + (ch - 'A');
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12066);matchStat = NOT_MATCH_NAME;
                        __CLR4_5_2694694lusyjkeu.R.inc(12067);return null;
                    }

                    }}}__CLR4_5_2694694lusyjkeu.R.inc(12068);mostSigBits <<= 4;
                    __CLR4_5_2694694lusyjkeu.R.inc(12069);mostSigBits |= num;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(12070);for (int i = 14; (((i < 18)&&(__CLR4_5_2694694lusyjkeu.R.iget(12071)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12072)==0&false)); ++i) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12073);char ch = charAt(startIndex2 + i);
                    __CLR4_5_2694694lusyjkeu.R.inc(12074);int num;
                    __CLR4_5_2694694lusyjkeu.R.inc(12075);if ((((ch >= '0' && ch <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(12076)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12077)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12078);num = ch - '0';
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12079);if ((((ch >= 'a' && ch <= 'f')&&(__CLR4_5_2694694lusyjkeu.R.iget(12080)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12081)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12082);num = 10 + (ch - 'a');
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12083);if ((((ch >= 'A' && ch <= 'F')&&(__CLR4_5_2694694lusyjkeu.R.iget(12084)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12085)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12086);num = 10 + (ch - 'A');
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12087);matchStat = NOT_MATCH_NAME;
                        __CLR4_5_2694694lusyjkeu.R.inc(12088);return null;
                    }

                    }}}__CLR4_5_2694694lusyjkeu.R.inc(12089);mostSigBits <<= 4;
                    __CLR4_5_2694694lusyjkeu.R.inc(12090);mostSigBits |= num;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(12091);for (int i = 19; (((i < 23)&&(__CLR4_5_2694694lusyjkeu.R.iget(12092)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12093)==0&false)); ++i) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12094);char ch = charAt(startIndex2 + i);
                    __CLR4_5_2694694lusyjkeu.R.inc(12095);int num;
                    __CLR4_5_2694694lusyjkeu.R.inc(12096);if ((((ch >= '0' && ch <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(12097)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12098)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12099);num = ch - '0';
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12100);if ((((ch >= 'a' && ch <= 'f')&&(__CLR4_5_2694694lusyjkeu.R.iget(12101)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12102)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12103);num = 10 + (ch - 'a');
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12104);if ((((ch >= 'A' && ch <= 'F')&&(__CLR4_5_2694694lusyjkeu.R.iget(12105)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12106)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12107);num = 10 + (ch - 'A');
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12108);matchStat = NOT_MATCH_NAME;
                        __CLR4_5_2694694lusyjkeu.R.inc(12109);return null;
                    }

                    }}}__CLR4_5_2694694lusyjkeu.R.inc(12110);leastSigBits <<= 4;
                    __CLR4_5_2694694lusyjkeu.R.inc(12111);leastSigBits |= num;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(12112);for (int i = 24; (((i < 36)&&(__CLR4_5_2694694lusyjkeu.R.iget(12113)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12114)==0&false)); ++i) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12115);char ch = charAt(startIndex2 + i);
                    __CLR4_5_2694694lusyjkeu.R.inc(12116);int num;
                    __CLR4_5_2694694lusyjkeu.R.inc(12117);if ((((ch >= '0' && ch <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(12118)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12119)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12120);num = ch - '0';
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12121);if ((((ch >= 'a' && ch <= 'f')&&(__CLR4_5_2694694lusyjkeu.R.iget(12122)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12123)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12124);num = 10 + (ch - 'a');
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12125);if ((((ch >= 'A' && ch <= 'F')&&(__CLR4_5_2694694lusyjkeu.R.iget(12126)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12127)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12128);num = 10 + (ch - 'A');
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12129);matchStat = NOT_MATCH_NAME;
                        __CLR4_5_2694694lusyjkeu.R.inc(12130);return null;
                    }

                    }}}__CLR4_5_2694694lusyjkeu.R.inc(12131);leastSigBits <<= 4;
                    __CLR4_5_2694694lusyjkeu.R.inc(12132);leastSigBits |= num;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(12133);uuid = new UUID(mostSigBits, leastSigBits);

                __CLR4_5_2694694lusyjkeu.R.inc(12134);offset += (endIndex - (bp + fieldName.length + 1) + 1);
                __CLR4_5_2694694lusyjkeu.R.inc(12135);chLocal = charAt(bp + (offset++));
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(12136);if ((((len == 32)&&(__CLR4_5_2694694lusyjkeu.R.iget(12137)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12138)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12139);long mostSigBits = 0, leastSigBits = 0;
                __CLR4_5_2694694lusyjkeu.R.inc(12140);for (int i = 0; (((i < 16)&&(__CLR4_5_2694694lusyjkeu.R.iget(12141)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12142)==0&false)); ++i) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12143);char ch = charAt(startIndex2 + i);
                    __CLR4_5_2694694lusyjkeu.R.inc(12144);int num;
                    __CLR4_5_2694694lusyjkeu.R.inc(12145);if ((((ch >= '0' && ch <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(12146)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12147)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12148);num = ch - '0';
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12149);if ((((ch >= 'a' && ch <= 'f')&&(__CLR4_5_2694694lusyjkeu.R.iget(12150)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12151)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12152);num = 10 + (ch - 'a');
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12153);if ((((ch >= 'A' && ch <= 'F')&&(__CLR4_5_2694694lusyjkeu.R.iget(12154)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12155)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12156);num = 10 + (ch - 'A');
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12157);matchStat = NOT_MATCH_NAME;
                        __CLR4_5_2694694lusyjkeu.R.inc(12158);return null;
                    }

                    }}}__CLR4_5_2694694lusyjkeu.R.inc(12159);mostSigBits <<= 4;
                    __CLR4_5_2694694lusyjkeu.R.inc(12160);mostSigBits |= num;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(12161);for (int i = 16; (((i < 32)&&(__CLR4_5_2694694lusyjkeu.R.iget(12162)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12163)==0&false)); ++i) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12164);char ch = charAt(startIndex2 + i);
                    __CLR4_5_2694694lusyjkeu.R.inc(12165);int num;
                    __CLR4_5_2694694lusyjkeu.R.inc(12166);if ((((ch >= '0' && ch <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(12167)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12168)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12169);num = ch - '0';
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12170);if ((((ch >= 'a' && ch <= 'f')&&(__CLR4_5_2694694lusyjkeu.R.iget(12171)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12172)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12173);num = 10 + (ch - 'a');
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12174);if ((((ch >= 'A' && ch <= 'F')&&(__CLR4_5_2694694lusyjkeu.R.iget(12175)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12176)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12177);num = 10 + (ch - 'A');
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12178);matchStat = NOT_MATCH_NAME;
                        __CLR4_5_2694694lusyjkeu.R.inc(12179);return null;
                    }

                    }}}__CLR4_5_2694694lusyjkeu.R.inc(12180);leastSigBits <<= 4;
                    __CLR4_5_2694694lusyjkeu.R.inc(12181);leastSigBits |= num;
                }

                }__CLR4_5_2694694lusyjkeu.R.inc(12182);uuid = new UUID(mostSigBits, leastSigBits);

                __CLR4_5_2694694lusyjkeu.R.inc(12183);offset += (endIndex - (bp + fieldName.length + 1) + 1);
                __CLR4_5_2694694lusyjkeu.R.inc(12184);chLocal = charAt(bp + (offset++));
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(12185);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(12186);return null;
            }
        }}} }else {__CLR4_5_2694694lusyjkeu.R.inc(12187);if ((((chLocal == 'n'
                && charAt(bp + (offset++)) == 'u'
                && charAt(bp + (offset++)) == 'l'
                && charAt(bp + (offset++)) == 'l')&&(__CLR4_5_2694694lusyjkeu.R.iget(12188)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12189)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12190);uuid = null;
            __CLR4_5_2694694lusyjkeu.R.inc(12191);chLocal = charAt(bp + (offset++));
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(12192);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(12193);return null;
        }

        }}__CLR4_5_2694694lusyjkeu.R.inc(12194);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(12195)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12196)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12197);bp += offset;
            __CLR4_5_2694694lusyjkeu.R.inc(12198);this.ch = this.charAt(bp);
            __CLR4_5_2694694lusyjkeu.R.inc(12199);matchStat = VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(12200);return uuid;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(12201);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(12202)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12203)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12204);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(12205);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(12206)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12207)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12208);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(12209);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(12210);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(12211);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(12212)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12213)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12214);token = JSONToken.RBRACKET;
                __CLR4_5_2694694lusyjkeu.R.inc(12215);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(12216);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(12217);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(12218)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12219)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12220);token = JSONToken.RBRACE;
                __CLR4_5_2694694lusyjkeu.R.inc(12221);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(12222);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(12223);if ((((chLocal == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(12224)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12225)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12226);token = JSONToken.EOF;
                __CLR4_5_2694694lusyjkeu.R.inc(12227);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(12228);ch = EOI;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(12229);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(12230);return null;
            }
            }}}}__CLR4_5_2694694lusyjkeu.R.inc(12231);matchStat = END;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(12232);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(12233);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(12234);return uuid;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public java.util.UUID scanUUID(char seperator) {try{__CLR4_5_2694694lusyjkeu.R.inc(12235);
        __CLR4_5_2694694lusyjkeu.R.inc(12236);matchStat = UNKNOWN;

        // int index = bp + fieldName.length;

        __CLR4_5_2694694lusyjkeu.R.inc(12237);int offset = 0;
        __CLR4_5_2694694lusyjkeu.R.inc(12238);char chLocal = charAt(bp + (offset++));

        __CLR4_5_2694694lusyjkeu.R.inc(12239);final java.util.UUID uuid;
        __CLR4_5_2694694lusyjkeu.R.inc(12240);if ((((chLocal == '"')&&(__CLR4_5_2694694lusyjkeu.R.iget(12241)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12242)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12243);int startIndex = bp + 1;
            __CLR4_5_2694694lusyjkeu.R.inc(12244);int endIndex = indexOf('"', startIndex);
            __CLR4_5_2694694lusyjkeu.R.inc(12245);if ((((endIndex == -1)&&(__CLR4_5_2694694lusyjkeu.R.iget(12246)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12247)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12248);throw new JSONException("unclosed str");
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(12249);int startIndex2 = bp + 1; // must re compute
            __CLR4_5_2694694lusyjkeu.R.inc(12250);int len = endIndex - startIndex2;
            __CLR4_5_2694694lusyjkeu.R.inc(12251);if ((((len == 36)&&(__CLR4_5_2694694lusyjkeu.R.iget(12252)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12253)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12254);long mostSigBits = 0, leastSigBits = 0;
                __CLR4_5_2694694lusyjkeu.R.inc(12255);for (int i = 0; (((i < 8)&&(__CLR4_5_2694694lusyjkeu.R.iget(12256)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12257)==0&false)); ++i) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12258);char ch = charAt(startIndex2 + i);
                    __CLR4_5_2694694lusyjkeu.R.inc(12259);int num;
                    __CLR4_5_2694694lusyjkeu.R.inc(12260);if ((((ch >= '0' && ch <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(12261)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12262)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12263);num = ch - '0';
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12264);if ((((ch >= 'a' && ch <= 'f')&&(__CLR4_5_2694694lusyjkeu.R.iget(12265)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12266)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12267);num = 10 + (ch - 'a');
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12268);if ((((ch >= 'A' && ch <= 'F')&&(__CLR4_5_2694694lusyjkeu.R.iget(12269)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12270)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12271);num = 10 + (ch - 'A');
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12272);matchStat = NOT_MATCH_NAME;
                        __CLR4_5_2694694lusyjkeu.R.inc(12273);return null;
                    }

                    }}}__CLR4_5_2694694lusyjkeu.R.inc(12274);mostSigBits <<= 4;
                    __CLR4_5_2694694lusyjkeu.R.inc(12275);mostSigBits |= num;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(12276);for (int i = 9; (((i < 13)&&(__CLR4_5_2694694lusyjkeu.R.iget(12277)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12278)==0&false)); ++i) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12279);char ch = charAt(startIndex2 + i);
                    __CLR4_5_2694694lusyjkeu.R.inc(12280);int num;
                    __CLR4_5_2694694lusyjkeu.R.inc(12281);if ((((ch >= '0' && ch <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(12282)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12283)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12284);num = ch - '0';
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12285);if ((((ch >= 'a' && ch <= 'f')&&(__CLR4_5_2694694lusyjkeu.R.iget(12286)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12287)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12288);num = 10 + (ch - 'a');
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12289);if ((((ch >= 'A' && ch <= 'F')&&(__CLR4_5_2694694lusyjkeu.R.iget(12290)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12291)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12292);num = 10 + (ch - 'A');
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12293);matchStat = NOT_MATCH_NAME;
                        __CLR4_5_2694694lusyjkeu.R.inc(12294);return null;
                    }

                    }}}__CLR4_5_2694694lusyjkeu.R.inc(12295);mostSigBits <<= 4;
                    __CLR4_5_2694694lusyjkeu.R.inc(12296);mostSigBits |= num;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(12297);for (int i = 14; (((i < 18)&&(__CLR4_5_2694694lusyjkeu.R.iget(12298)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12299)==0&false)); ++i) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12300);char ch = charAt(startIndex2 + i);
                    __CLR4_5_2694694lusyjkeu.R.inc(12301);int num;
                    __CLR4_5_2694694lusyjkeu.R.inc(12302);if ((((ch >= '0' && ch <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(12303)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12304)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12305);num = ch - '0';
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12306);if ((((ch >= 'a' && ch <= 'f')&&(__CLR4_5_2694694lusyjkeu.R.iget(12307)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12308)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12309);num = 10 + (ch - 'a');
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12310);if ((((ch >= 'A' && ch <= 'F')&&(__CLR4_5_2694694lusyjkeu.R.iget(12311)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12312)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12313);num = 10 + (ch - 'A');
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12314);matchStat = NOT_MATCH_NAME;
                        __CLR4_5_2694694lusyjkeu.R.inc(12315);return null;
                    }

                    }}}__CLR4_5_2694694lusyjkeu.R.inc(12316);mostSigBits <<= 4;
                    __CLR4_5_2694694lusyjkeu.R.inc(12317);mostSigBits |= num;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(12318);for (int i = 19; (((i < 23)&&(__CLR4_5_2694694lusyjkeu.R.iget(12319)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12320)==0&false)); ++i) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12321);char ch = charAt(startIndex2 + i);
                    __CLR4_5_2694694lusyjkeu.R.inc(12322);int num;
                    __CLR4_5_2694694lusyjkeu.R.inc(12323);if ((((ch >= '0' && ch <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(12324)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12325)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12326);num = ch - '0';
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12327);if ((((ch >= 'a' && ch <= 'f')&&(__CLR4_5_2694694lusyjkeu.R.iget(12328)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12329)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12330);num = 10 + (ch - 'a');
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12331);if ((((ch >= 'A' && ch <= 'F')&&(__CLR4_5_2694694lusyjkeu.R.iget(12332)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12333)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12334);num = 10 + (ch - 'A');
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12335);matchStat = NOT_MATCH_NAME;
                        __CLR4_5_2694694lusyjkeu.R.inc(12336);return null;
                    }

                    }}}__CLR4_5_2694694lusyjkeu.R.inc(12337);leastSigBits <<= 4;
                    __CLR4_5_2694694lusyjkeu.R.inc(12338);leastSigBits |= num;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(12339);for (int i = 24; (((i < 36)&&(__CLR4_5_2694694lusyjkeu.R.iget(12340)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12341)==0&false)); ++i) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12342);char ch = charAt(startIndex2 + i);
                    __CLR4_5_2694694lusyjkeu.R.inc(12343);int num;
                    __CLR4_5_2694694lusyjkeu.R.inc(12344);if ((((ch >= '0' && ch <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(12345)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12346)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12347);num = ch - '0';
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12348);if ((((ch >= 'a' && ch <= 'f')&&(__CLR4_5_2694694lusyjkeu.R.iget(12349)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12350)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12351);num = 10 + (ch - 'a');
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12352);if ((((ch >= 'A' && ch <= 'F')&&(__CLR4_5_2694694lusyjkeu.R.iget(12353)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12354)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12355);num = 10 + (ch - 'A');
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12356);matchStat = NOT_MATCH_NAME;
                        __CLR4_5_2694694lusyjkeu.R.inc(12357);return null;
                    }

                    }}}__CLR4_5_2694694lusyjkeu.R.inc(12358);leastSigBits <<= 4;
                    __CLR4_5_2694694lusyjkeu.R.inc(12359);leastSigBits |= num;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(12360);uuid = new UUID(mostSigBits, leastSigBits);

                __CLR4_5_2694694lusyjkeu.R.inc(12361);offset += (endIndex - (bp + 1) + 1);
                __CLR4_5_2694694lusyjkeu.R.inc(12362);chLocal = charAt(bp + (offset++));
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(12363);if ((((len == 32)&&(__CLR4_5_2694694lusyjkeu.R.iget(12364)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12365)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12366);long mostSigBits = 0, leastSigBits = 0;
                __CLR4_5_2694694lusyjkeu.R.inc(12367);for (int i = 0; (((i < 16)&&(__CLR4_5_2694694lusyjkeu.R.iget(12368)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12369)==0&false)); ++i) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12370);char ch = charAt(startIndex2 + i);
                    __CLR4_5_2694694lusyjkeu.R.inc(12371);int num;
                    __CLR4_5_2694694lusyjkeu.R.inc(12372);if ((((ch >= '0' && ch <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(12373)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12374)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12375);num = ch - '0';
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12376);if ((((ch >= 'a' && ch <= 'f')&&(__CLR4_5_2694694lusyjkeu.R.iget(12377)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12378)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12379);num = 10 + (ch - 'a');
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12380);if ((((ch >= 'A' && ch <= 'F')&&(__CLR4_5_2694694lusyjkeu.R.iget(12381)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12382)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12383);num = 10 + (ch - 'A');
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12384);matchStat = NOT_MATCH_NAME;
                        __CLR4_5_2694694lusyjkeu.R.inc(12385);return null;
                    }

                    }}}__CLR4_5_2694694lusyjkeu.R.inc(12386);mostSigBits <<= 4;
                    __CLR4_5_2694694lusyjkeu.R.inc(12387);mostSigBits |= num;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(12388);for (int i = 16; (((i < 32)&&(__CLR4_5_2694694lusyjkeu.R.iget(12389)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12390)==0&false)); ++i) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12391);char ch = charAt(startIndex2 + i);
                    __CLR4_5_2694694lusyjkeu.R.inc(12392);int num;
                    __CLR4_5_2694694lusyjkeu.R.inc(12393);if ((((ch >= '0' && ch <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(12394)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12395)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12396);num = ch - '0';
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12397);if ((((ch >= 'a' && ch <= 'f')&&(__CLR4_5_2694694lusyjkeu.R.iget(12398)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12399)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12400);num = 10 + (ch - 'a');
                    } }else {__CLR4_5_2694694lusyjkeu.R.inc(12401);if ((((ch >= 'A' && ch <= 'F')&&(__CLR4_5_2694694lusyjkeu.R.iget(12402)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12403)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12404);num = 10 + (ch - 'A');
                    } }else {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12405);matchStat = NOT_MATCH_NAME;
                        __CLR4_5_2694694lusyjkeu.R.inc(12406);return null;
                    }

                    }}}__CLR4_5_2694694lusyjkeu.R.inc(12407);leastSigBits <<= 4;
                    __CLR4_5_2694694lusyjkeu.R.inc(12408);leastSigBits |= num;
                }

                }__CLR4_5_2694694lusyjkeu.R.inc(12409);uuid = new UUID(mostSigBits, leastSigBits);

                __CLR4_5_2694694lusyjkeu.R.inc(12410);offset += (endIndex - (bp + 1) + 1);
                __CLR4_5_2694694lusyjkeu.R.inc(12411);chLocal = charAt(bp + (offset++));
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(12412);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(12413);return null;
            }
        }}} }else {__CLR4_5_2694694lusyjkeu.R.inc(12414);if ((((chLocal == 'n'
                && charAt(bp + (offset++)) == 'u'
                && charAt(bp + (offset++)) == 'l'
                && charAt(bp + (offset++)) == 'l')&&(__CLR4_5_2694694lusyjkeu.R.iget(12415)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12416)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12417);uuid = null;
            __CLR4_5_2694694lusyjkeu.R.inc(12418);chLocal = charAt(bp + (offset++));
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(12419);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(12420);return null;
        }

        }}__CLR4_5_2694694lusyjkeu.R.inc(12421);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(12422)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12423)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12424);bp += offset;
            __CLR4_5_2694694lusyjkeu.R.inc(12425);this.ch = this.charAt(bp);
            __CLR4_5_2694694lusyjkeu.R.inc(12426);matchStat = VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(12427);return uuid;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(12428);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(12429)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12430)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12431);chLocal = charAt(bp + (offset++));
            __CLR4_5_2694694lusyjkeu.R.inc(12432);if ((((chLocal == ',')&&(__CLR4_5_2694694lusyjkeu.R.iget(12433)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12434)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12435);token = JSONToken.COMMA;
                __CLR4_5_2694694lusyjkeu.R.inc(12436);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(12437);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(12438);if ((((chLocal == ']')&&(__CLR4_5_2694694lusyjkeu.R.iget(12439)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12440)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12441);token = JSONToken.RBRACKET;
                __CLR4_5_2694694lusyjkeu.R.inc(12442);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(12443);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(12444);if ((((chLocal == '}')&&(__CLR4_5_2694694lusyjkeu.R.iget(12445)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12446)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12447);token = JSONToken.RBRACE;
                __CLR4_5_2694694lusyjkeu.R.inc(12448);bp += offset;
                __CLR4_5_2694694lusyjkeu.R.inc(12449);this.ch = this.charAt(bp);
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(12450);if ((((chLocal == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(12451)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12452)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12453);token = JSONToken.EOF;
                __CLR4_5_2694694lusyjkeu.R.inc(12454);bp += (offset - 1);
                __CLR4_5_2694694lusyjkeu.R.inc(12455);ch = EOI;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(12456);matchStat = NOT_MATCH;
                __CLR4_5_2694694lusyjkeu.R.inc(12457);return null;
            }
            }}}}__CLR4_5_2694694lusyjkeu.R.inc(12458);matchStat = END;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(12459);matchStat = NOT_MATCH;
            __CLR4_5_2694694lusyjkeu.R.inc(12460);return null;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(12461);return uuid;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final void scanTrue() {try{__CLR4_5_2694694lusyjkeu.R.inc(12462);
        __CLR4_5_2694694lusyjkeu.R.inc(12463);if ((((ch != 't')&&(__CLR4_5_2694694lusyjkeu.R.iget(12464)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12465)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12466);throw new JSONException("error parse true");
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(12467);next();

        __CLR4_5_2694694lusyjkeu.R.inc(12468);if ((((ch != 'r')&&(__CLR4_5_2694694lusyjkeu.R.iget(12469)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12470)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12471);throw new JSONException("error parse true");
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(12472);next();

        __CLR4_5_2694694lusyjkeu.R.inc(12473);if ((((ch != 'u')&&(__CLR4_5_2694694lusyjkeu.R.iget(12474)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12475)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12476);throw new JSONException("error parse true");
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(12477);next();

        __CLR4_5_2694694lusyjkeu.R.inc(12478);if ((((ch != 'e')&&(__CLR4_5_2694694lusyjkeu.R.iget(12479)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12480)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12481);throw new JSONException("error parse true");
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(12482);next();

        __CLR4_5_2694694lusyjkeu.R.inc(12483);if ((((ch == ' '  ||
            ch == ','  ||
            ch == '}'  ||
            ch == ']'  ||
            ch == '\n' ||
            ch == '\r' ||
            ch == '\t' ||
            ch == EOI  ||
            ch == '\f' ||
            ch == '\b' ||
            ch == ':'  ||
            ch == '/')&&(__CLR4_5_2694694lusyjkeu.R.iget(12484)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12485)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12486);token = JSONToken.TRUE;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(12487);throw new JSONException("scan true error");
        }
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final void scanNullOrNew() {try{__CLR4_5_2694694lusyjkeu.R.inc(12488);
        __CLR4_5_2694694lusyjkeu.R.inc(12489);scanNullOrNew(true);
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final void scanNullOrNew(boolean acceptColon) {try{__CLR4_5_2694694lusyjkeu.R.inc(12490);
        __CLR4_5_2694694lusyjkeu.R.inc(12491);if ((((ch != 'n')&&(__CLR4_5_2694694lusyjkeu.R.iget(12492)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12493)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12494);throw new JSONException("error parse null or new");
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(12495);next();

        __CLR4_5_2694694lusyjkeu.R.inc(12496);if ((((ch == 'u')&&(__CLR4_5_2694694lusyjkeu.R.iget(12497)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12498)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12499);next();
            __CLR4_5_2694694lusyjkeu.R.inc(12500);if ((((ch != 'l')&&(__CLR4_5_2694694lusyjkeu.R.iget(12501)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12502)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12503);throw new JSONException("error parse null");
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(12504);next();

            __CLR4_5_2694694lusyjkeu.R.inc(12505);if ((((ch != 'l')&&(__CLR4_5_2694694lusyjkeu.R.iget(12506)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12507)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12508);throw new JSONException("error parse null");
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(12509);next();


            __CLR4_5_2694694lusyjkeu.R.inc(12510);if ((((ch == ' '
                    || ch == ','
                    || ch == '}'
                    || ch == ']'
                    || ch == '\n'
                    || ch == '\r'
                    || ch == '\t'
                    || ch == EOI
                    || (ch == ':' && acceptColon)
                    || ch == '\f'
                    || ch == '\b')&&(__CLR4_5_2694694lusyjkeu.R.iget(12511)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12512)==0&false))) {{

                __CLR4_5_2694694lusyjkeu.R.inc(12513);token = JSONToken.NULL;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(12514);throw new JSONException("scan null error");
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(12515);return;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(12516);if ((((ch != 'e')&&(__CLR4_5_2694694lusyjkeu.R.iget(12517)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12518)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12519);throw new JSONException("error parse new");
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(12520);next();

        __CLR4_5_2694694lusyjkeu.R.inc(12521);if ((((ch != 'w')&&(__CLR4_5_2694694lusyjkeu.R.iget(12522)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12523)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12524);throw new JSONException("error parse new");
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(12525);next();

        __CLR4_5_2694694lusyjkeu.R.inc(12526);if ((((ch == ' '  ||
            ch == ','  ||
            ch == '}'  ||
            ch == ']'  ||
            ch == '\n' ||
            ch == '\r' ||
            ch == '\t' ||
            ch == EOI  ||
            ch == '\f' ||
            ch == '\b')&&(__CLR4_5_2694694lusyjkeu.R.iget(12527)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12528)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12529);token = JSONToken.NEW;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(12530);throw new JSONException("scan new error");
        }
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final void scanFalse() {try{__CLR4_5_2694694lusyjkeu.R.inc(12531);
        __CLR4_5_2694694lusyjkeu.R.inc(12532);if ((((ch != 'f')&&(__CLR4_5_2694694lusyjkeu.R.iget(12533)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12534)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12535);throw new JSONException("error parse false");
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(12536);next();

        __CLR4_5_2694694lusyjkeu.R.inc(12537);if ((((ch != 'a')&&(__CLR4_5_2694694lusyjkeu.R.iget(12538)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12539)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12540);throw new JSONException("error parse false");
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(12541);next();

        __CLR4_5_2694694lusyjkeu.R.inc(12542);if ((((ch != 'l')&&(__CLR4_5_2694694lusyjkeu.R.iget(12543)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12544)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12545);throw new JSONException("error parse false");
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(12546);next();

        __CLR4_5_2694694lusyjkeu.R.inc(12547);if ((((ch != 's')&&(__CLR4_5_2694694lusyjkeu.R.iget(12548)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12549)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12550);throw new JSONException("error parse false");
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(12551);next();

        __CLR4_5_2694694lusyjkeu.R.inc(12552);if ((((ch != 'e')&&(__CLR4_5_2694694lusyjkeu.R.iget(12553)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12554)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12555);throw new JSONException("error parse false");
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(12556);next();

        __CLR4_5_2694694lusyjkeu.R.inc(12557);if ((((ch == ' '  ||
            ch == ','  ||
            ch == '}'  ||
            ch == ']'  ||
            ch == '\n' ||
            ch == '\r' ||
            ch == '\t' ||
            ch == EOI  ||
            ch == '\f' ||
            ch == '\b' ||
            ch == ':'  ||
            ch == '/')&&(__CLR4_5_2694694lusyjkeu.R.iget(12558)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12559)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12560);token = JSONToken.FALSE;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(12561);throw new JSONException("scan false error");
        }
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final void scanIdent() {try{__CLR4_5_2694694lusyjkeu.R.inc(12562);
        __CLR4_5_2694694lusyjkeu.R.inc(12563);np = bp - 1;
        __CLR4_5_2694694lusyjkeu.R.inc(12564);hasSpecial = false;

        __CLR4_5_2694694lusyjkeu.R.inc(12565);for (;;) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12566);sp++;

            __CLR4_5_2694694lusyjkeu.R.inc(12567);next();
            __CLR4_5_2694694lusyjkeu.R.inc(12568);if ((((Character.isLetterOrDigit(ch))&&(__CLR4_5_2694694lusyjkeu.R.iget(12569)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12570)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12571);continue;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(12572);String ident = stringVal();

            __CLR4_5_2694694lusyjkeu.R.inc(12573);if (((("null".equalsIgnoreCase(ident))&&(__CLR4_5_2694694lusyjkeu.R.iget(12574)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12575)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12576);token = JSONToken.NULL;
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(12577);if (((("new".equals(ident))&&(__CLR4_5_2694694lusyjkeu.R.iget(12578)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12579)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12580);token = JSONToken.NEW;
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(12581);if (((("true".equals(ident))&&(__CLR4_5_2694694lusyjkeu.R.iget(12582)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12583)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12584);token = JSONToken.TRUE;
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(12585);if (((("false".equals(ident))&&(__CLR4_5_2694694lusyjkeu.R.iget(12586)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12587)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12588);token = JSONToken.FALSE;
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(12589);if (((("undefined".equals(ident))&&(__CLR4_5_2694694lusyjkeu.R.iget(12590)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12591)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12592);token = JSONToken.UNDEFINED;
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(12593);if (((("Set".equals(ident))&&(__CLR4_5_2694694lusyjkeu.R.iget(12594)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12595)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12596);token = JSONToken.SET;
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(12597);if (((("TreeSet".equals(ident))&&(__CLR4_5_2694694lusyjkeu.R.iget(12598)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12599)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12600);token = JSONToken.TREE_SET;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(12601);token = JSONToken.IDENTIFIER;
            }
            }}}}}}}__CLR4_5_2694694lusyjkeu.R.inc(12602);return;
        }
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public abstract String stringVal();

    public abstract String subString(int offset, int count);

    protected abstract char[] sub_chars(int offset, int count);

    public static String readString(char[] chars, int chars_len) {try{__CLR4_5_2694694lusyjkeu.R.inc(12603);
        __CLR4_5_2694694lusyjkeu.R.inc(12604);char[] sbuf = new char[chars_len];
        __CLR4_5_2694694lusyjkeu.R.inc(12605);int len = 0;
        __CLR4_5_2694694lusyjkeu.R.inc(12606);for (int i = 0; (((i < chars_len)&&(__CLR4_5_2694694lusyjkeu.R.iget(12607)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12608)==0&false)); ++i) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12609);char ch = chars[i];

            __CLR4_5_2694694lusyjkeu.R.inc(12610);if ((((ch != '\\')&&(__CLR4_5_2694694lusyjkeu.R.iget(12611)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12612)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12613);sbuf[len++] = ch;
                __CLR4_5_2694694lusyjkeu.R.inc(12614);continue;
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(12615);ch = chars[++i];

            boolean __CLB4_5_2_bool5=false;__CLR4_5_2694694lusyjkeu.R.inc(12616);switch (ch) {
                case '0':if (!__CLB4_5_2_bool5) {__CLR4_5_2694694lusyjkeu.R.inc(12617);__CLB4_5_2_bool5=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(12618);sbuf[len++] = '\0';
                    __CLR4_5_2694694lusyjkeu.R.inc(12619);break;
                case '1':if (!__CLB4_5_2_bool5) {__CLR4_5_2694694lusyjkeu.R.inc(12620);__CLB4_5_2_bool5=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(12621);sbuf[len++] = '\1';
                    __CLR4_5_2694694lusyjkeu.R.inc(12622);break;
                case '2':if (!__CLB4_5_2_bool5) {__CLR4_5_2694694lusyjkeu.R.inc(12623);__CLB4_5_2_bool5=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(12624);sbuf[len++] = '\2';
                    __CLR4_5_2694694lusyjkeu.R.inc(12625);break;
                case '3':if (!__CLB4_5_2_bool5) {__CLR4_5_2694694lusyjkeu.R.inc(12626);__CLB4_5_2_bool5=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(12627);sbuf[len++] = '\3';
                    __CLR4_5_2694694lusyjkeu.R.inc(12628);break;
                case '4':if (!__CLB4_5_2_bool5) {__CLR4_5_2694694lusyjkeu.R.inc(12629);__CLB4_5_2_bool5=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(12630);sbuf[len++] = '\4';
                    __CLR4_5_2694694lusyjkeu.R.inc(12631);break;
                case '5':if (!__CLB4_5_2_bool5) {__CLR4_5_2694694lusyjkeu.R.inc(12632);__CLB4_5_2_bool5=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(12633);sbuf[len++] = '\5';
                    __CLR4_5_2694694lusyjkeu.R.inc(12634);break;
                case '6':if (!__CLB4_5_2_bool5) {__CLR4_5_2694694lusyjkeu.R.inc(12635);__CLB4_5_2_bool5=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(12636);sbuf[len++] = '\6';
                    __CLR4_5_2694694lusyjkeu.R.inc(12637);break;
                case '7':if (!__CLB4_5_2_bool5) {__CLR4_5_2694694lusyjkeu.R.inc(12638);__CLB4_5_2_bool5=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(12639);sbuf[len++] = '\7';
                    __CLR4_5_2694694lusyjkeu.R.inc(12640);break;
                case 'b':if (!__CLB4_5_2_bool5) {__CLR4_5_2694694lusyjkeu.R.inc(12641);__CLB4_5_2_bool5=true;} // 8
                    __CLR4_5_2694694lusyjkeu.R.inc(12642);sbuf[len++] = '\b';
                    __CLR4_5_2694694lusyjkeu.R.inc(12643);break;
                case 't':if (!__CLB4_5_2_bool5) {__CLR4_5_2694694lusyjkeu.R.inc(12644);__CLB4_5_2_bool5=true;} // 9
                    __CLR4_5_2694694lusyjkeu.R.inc(12645);sbuf[len++] = '\t';
                    __CLR4_5_2694694lusyjkeu.R.inc(12646);break;
                case 'n':if (!__CLB4_5_2_bool5) {__CLR4_5_2694694lusyjkeu.R.inc(12647);__CLB4_5_2_bool5=true;} // 10
                    __CLR4_5_2694694lusyjkeu.R.inc(12648);sbuf[len++] = '\n';
                    __CLR4_5_2694694lusyjkeu.R.inc(12649);break;
                case 'v':if (!__CLB4_5_2_bool5) {__CLR4_5_2694694lusyjkeu.R.inc(12650);__CLB4_5_2_bool5=true;} // 11
                    __CLR4_5_2694694lusyjkeu.R.inc(12651);sbuf[len++] = '';
                    __CLR4_5_2694694lusyjkeu.R.inc(12652);break;
                case 'f':if (!__CLB4_5_2_bool5) {__CLR4_5_2694694lusyjkeu.R.inc(12653);__CLB4_5_2_bool5=true;} // 12
                case 'F':if (!__CLB4_5_2_bool5) {__CLR4_5_2694694lusyjkeu.R.inc(12654);__CLB4_5_2_bool5=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(12655);sbuf[len++] = '\f';
                    __CLR4_5_2694694lusyjkeu.R.inc(12656);break;
                case 'r':if (!__CLB4_5_2_bool5) {__CLR4_5_2694694lusyjkeu.R.inc(12657);__CLB4_5_2_bool5=true;} // 13
                    __CLR4_5_2694694lusyjkeu.R.inc(12658);sbuf[len++] = '\r';
                    __CLR4_5_2694694lusyjkeu.R.inc(12659);break;
                case '"':if (!__CLB4_5_2_bool5) {__CLR4_5_2694694lusyjkeu.R.inc(12660);__CLB4_5_2_bool5=true;} // 34
                    __CLR4_5_2694694lusyjkeu.R.inc(12661);sbuf[len++] = '"';
                    __CLR4_5_2694694lusyjkeu.R.inc(12662);break;
                case '\'':if (!__CLB4_5_2_bool5) {__CLR4_5_2694694lusyjkeu.R.inc(12663);__CLB4_5_2_bool5=true;} // 39
                    __CLR4_5_2694694lusyjkeu.R.inc(12664);sbuf[len++] = '\'';
                    __CLR4_5_2694694lusyjkeu.R.inc(12665);break;
                case '/':if (!__CLB4_5_2_bool5) {__CLR4_5_2694694lusyjkeu.R.inc(12666);__CLB4_5_2_bool5=true;} // 47
                    __CLR4_5_2694694lusyjkeu.R.inc(12667);sbuf[len++] = '/';
                    __CLR4_5_2694694lusyjkeu.R.inc(12668);break;
                case '\\':if (!__CLB4_5_2_bool5) {__CLR4_5_2694694lusyjkeu.R.inc(12669);__CLB4_5_2_bool5=true;} // 92
                    __CLR4_5_2694694lusyjkeu.R.inc(12670);sbuf[len++] = '\\';
                    __CLR4_5_2694694lusyjkeu.R.inc(12671);break;
                case 'x':if (!__CLB4_5_2_bool5) {__CLR4_5_2694694lusyjkeu.R.inc(12672);__CLB4_5_2_bool5=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(12673);sbuf[len++] = (char) (digits[chars[++i]] * 16 + digits[chars[++i]]);
                    __CLR4_5_2694694lusyjkeu.R.inc(12674);break;
                case 'u':if (!__CLB4_5_2_bool5) {__CLR4_5_2694694lusyjkeu.R.inc(12675);__CLB4_5_2_bool5=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(12676);sbuf[len++] = (char) Integer.parseInt(new String(new char[] { chars[++i], //
                                    chars[++i], //
                                    chars[++i], //
                                    chars[++i] }),
                            16);
                    __CLR4_5_2694694lusyjkeu.R.inc(12677);break;
                default:if (!__CLB4_5_2_bool5) {__CLR4_5_2694694lusyjkeu.R.inc(12678);__CLB4_5_2_bool5=true;}
                    __CLR4_5_2694694lusyjkeu.R.inc(12679);throw new JSONException("unclosed.str.lit");
            }
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(12680);return new String(sbuf, 0, len);
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    protected abstract boolean charArrayCompare(char[] chars);

    public boolean isBlankInput() {try{__CLR4_5_2694694lusyjkeu.R.inc(12681);
        __CLR4_5_2694694lusyjkeu.R.inc(12682);for (int i = 0;; ++i) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12683);char chLocal = charAt(i);
            __CLR4_5_2694694lusyjkeu.R.inc(12684);if ((((chLocal == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(12685)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12686)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12687);token = JSONToken.EOF;
                __CLR4_5_2694694lusyjkeu.R.inc(12688);break;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(12689);if ((((!isWhitespace(chLocal))&&(__CLR4_5_2694694lusyjkeu.R.iget(12690)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12691)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12692);return false;
            }
        }}

        }__CLR4_5_2694694lusyjkeu.R.inc(12693);return true;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final void skipWhitespace() {try{__CLR4_5_2694694lusyjkeu.R.inc(12694);
        __CLR4_5_2694694lusyjkeu.R.inc(12695);for (;;) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12696);if ((((ch <= '/')&&(__CLR4_5_2694694lusyjkeu.R.iget(12697)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12698)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12699);if ((((ch == ' '  ||
                    ch == '\r' ||
                    ch == '\n' ||
                    ch == '\t' ||
                    ch == '\f' ||
                    ch == '\b')&&(__CLR4_5_2694694lusyjkeu.R.iget(12700)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12701)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12702);next();
                    __CLR4_5_2694694lusyjkeu.R.inc(12703);continue;
                } }else {__CLR4_5_2694694lusyjkeu.R.inc(12704);if ((((ch == '/')&&(__CLR4_5_2694694lusyjkeu.R.iget(12705)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12706)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12707);skipComment();
                    __CLR4_5_2694694lusyjkeu.R.inc(12708);continue;
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12709);break;
                }
            }}} }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(12710);break;
            }
        }}
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    private void scanStringSingleQuote() {try{__CLR4_5_2694694lusyjkeu.R.inc(12711);
        __CLR4_5_2694694lusyjkeu.R.inc(12712);np = bp;
        __CLR4_5_2694694lusyjkeu.R.inc(12713);hasSpecial = false;
        __CLR4_5_2694694lusyjkeu.R.inc(12714);char chLocal;
        __CLR4_5_2694694lusyjkeu.R.inc(12715);for (;;) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12716);chLocal = next();

            __CLR4_5_2694694lusyjkeu.R.inc(12717);if ((((chLocal == '\'')&&(__CLR4_5_2694694lusyjkeu.R.iget(12718)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12719)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12720);break;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(12721);if ((((chLocal == EOI)&&(__CLR4_5_2694694lusyjkeu.R.iget(12722)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12723)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12724);if ((((!isEOF())&&(__CLR4_5_2694694lusyjkeu.R.iget(12725)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12726)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12727);putChar((char) EOI);
                    __CLR4_5_2694694lusyjkeu.R.inc(12728);continue;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(12729);throw new JSONException("unclosed single-quote string");
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(12730);if ((((chLocal == '\\')&&(__CLR4_5_2694694lusyjkeu.R.iget(12731)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12732)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12733);if ((((!hasSpecial)&&(__CLR4_5_2694694lusyjkeu.R.iget(12734)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12735)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12736);hasSpecial = true;

                    __CLR4_5_2694694lusyjkeu.R.inc(12737);if ((((sp > sbuf.length)&&(__CLR4_5_2694694lusyjkeu.R.iget(12738)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12739)==0&false))) {{
                        __CLR4_5_2694694lusyjkeu.R.inc(12740);char[] newsbuf = new char[sp * 2];
                        __CLR4_5_2694694lusyjkeu.R.inc(12741);System.arraycopy(sbuf, 0, newsbuf, 0, sbuf.length);
                        __CLR4_5_2694694lusyjkeu.R.inc(12742);sbuf = newsbuf;
                    }

                    // text.getChars(offset, offset + count, dest, 0);
                    }__CLR4_5_2694694lusyjkeu.R.inc(12743);this.copyTo(np + 1, sp, sbuf);
                    // System.arraycopy(buf, np + 1, sbuf, 0, sp);
                }

                }__CLR4_5_2694694lusyjkeu.R.inc(12744);chLocal = next();

                boolean __CLB4_5_2_bool6=false;__CLR4_5_2694694lusyjkeu.R.inc(12745);switch (chLocal) {
                    case '0':if (!__CLB4_5_2_bool6) {__CLR4_5_2694694lusyjkeu.R.inc(12746);__CLB4_5_2_bool6=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(12747);putChar('\0');
                        __CLR4_5_2694694lusyjkeu.R.inc(12748);break;
                    case '1':if (!__CLB4_5_2_bool6) {__CLR4_5_2694694lusyjkeu.R.inc(12749);__CLB4_5_2_bool6=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(12750);putChar('\1');
                        __CLR4_5_2694694lusyjkeu.R.inc(12751);break;
                    case '2':if (!__CLB4_5_2_bool6) {__CLR4_5_2694694lusyjkeu.R.inc(12752);__CLB4_5_2_bool6=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(12753);putChar('\2');
                        __CLR4_5_2694694lusyjkeu.R.inc(12754);break;
                    case '3':if (!__CLB4_5_2_bool6) {__CLR4_5_2694694lusyjkeu.R.inc(12755);__CLB4_5_2_bool6=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(12756);putChar('\3');
                        __CLR4_5_2694694lusyjkeu.R.inc(12757);break;
                    case '4':if (!__CLB4_5_2_bool6) {__CLR4_5_2694694lusyjkeu.R.inc(12758);__CLB4_5_2_bool6=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(12759);putChar('\4');
                        __CLR4_5_2694694lusyjkeu.R.inc(12760);break;
                    case '5':if (!__CLB4_5_2_bool6) {__CLR4_5_2694694lusyjkeu.R.inc(12761);__CLB4_5_2_bool6=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(12762);putChar('\5');
                        __CLR4_5_2694694lusyjkeu.R.inc(12763);break;
                    case '6':if (!__CLB4_5_2_bool6) {__CLR4_5_2694694lusyjkeu.R.inc(12764);__CLB4_5_2_bool6=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(12765);putChar('\6');
                        __CLR4_5_2694694lusyjkeu.R.inc(12766);break;
                    case '7':if (!__CLB4_5_2_bool6) {__CLR4_5_2694694lusyjkeu.R.inc(12767);__CLB4_5_2_bool6=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(12768);putChar('\7');
                        __CLR4_5_2694694lusyjkeu.R.inc(12769);break;
                    case 'b':if (!__CLB4_5_2_bool6) {__CLR4_5_2694694lusyjkeu.R.inc(12770);__CLB4_5_2_bool6=true;} // 8
                        __CLR4_5_2694694lusyjkeu.R.inc(12771);putChar('\b');
                        __CLR4_5_2694694lusyjkeu.R.inc(12772);break;
                    case 't':if (!__CLB4_5_2_bool6) {__CLR4_5_2694694lusyjkeu.R.inc(12773);__CLB4_5_2_bool6=true;} // 9
                        __CLR4_5_2694694lusyjkeu.R.inc(12774);putChar('\t');
                        __CLR4_5_2694694lusyjkeu.R.inc(12775);break;
                    case 'n':if (!__CLB4_5_2_bool6) {__CLR4_5_2694694lusyjkeu.R.inc(12776);__CLB4_5_2_bool6=true;} // 10
                        __CLR4_5_2694694lusyjkeu.R.inc(12777);putChar('\n');
                        __CLR4_5_2694694lusyjkeu.R.inc(12778);break;
                    case 'v':if (!__CLB4_5_2_bool6) {__CLR4_5_2694694lusyjkeu.R.inc(12779);__CLB4_5_2_bool6=true;} // 11
                        __CLR4_5_2694694lusyjkeu.R.inc(12780);putChar('');
                        __CLR4_5_2694694lusyjkeu.R.inc(12781);break;
                    case 'f':if (!__CLB4_5_2_bool6) {__CLR4_5_2694694lusyjkeu.R.inc(12782);__CLB4_5_2_bool6=true;} // 12
                    case 'F':if (!__CLB4_5_2_bool6) {__CLR4_5_2694694lusyjkeu.R.inc(12783);__CLB4_5_2_bool6=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(12784);putChar('\f');
                        __CLR4_5_2694694lusyjkeu.R.inc(12785);break;
                    case 'r':if (!__CLB4_5_2_bool6) {__CLR4_5_2694694lusyjkeu.R.inc(12786);__CLB4_5_2_bool6=true;} // 13
                        __CLR4_5_2694694lusyjkeu.R.inc(12787);putChar('\r');
                        __CLR4_5_2694694lusyjkeu.R.inc(12788);break;
                    case '"':if (!__CLB4_5_2_bool6) {__CLR4_5_2694694lusyjkeu.R.inc(12789);__CLB4_5_2_bool6=true;} // 34
                        __CLR4_5_2694694lusyjkeu.R.inc(12790);putChar('"');
                        __CLR4_5_2694694lusyjkeu.R.inc(12791);break;
                    case '\'':if (!__CLB4_5_2_bool6) {__CLR4_5_2694694lusyjkeu.R.inc(12792);__CLB4_5_2_bool6=true;} // 39
                        __CLR4_5_2694694lusyjkeu.R.inc(12793);putChar('\'');
                        __CLR4_5_2694694lusyjkeu.R.inc(12794);break;
                    case '/':if (!__CLB4_5_2_bool6) {__CLR4_5_2694694lusyjkeu.R.inc(12795);__CLB4_5_2_bool6=true;} // 47
                        __CLR4_5_2694694lusyjkeu.R.inc(12796);putChar('/');
                        __CLR4_5_2694694lusyjkeu.R.inc(12797);break;
                    case '\\':if (!__CLB4_5_2_bool6) {__CLR4_5_2694694lusyjkeu.R.inc(12798);__CLB4_5_2_bool6=true;} // 92
                        __CLR4_5_2694694lusyjkeu.R.inc(12799);putChar('\\');
                        __CLR4_5_2694694lusyjkeu.R.inc(12800);break;
                    case 'x':if (!__CLB4_5_2_bool6) {__CLR4_5_2694694lusyjkeu.R.inc(12801);__CLB4_5_2_bool6=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(12802);char x1 = next();
                        __CLR4_5_2694694lusyjkeu.R.inc(12803);char x2 = next();

                        __CLR4_5_2694694lusyjkeu.R.inc(12804);boolean hex1 = (x1 >= '0' && x1 <= '9')
                                || (x1 >= 'a' && x1 <= 'f')
                                || (x1 >= 'A' && x1 <= 'F');
                        __CLR4_5_2694694lusyjkeu.R.inc(12805);boolean hex2 = (x2 >= '0' && x2 <= '9')
                                || (x2 >= 'a' && x2 <= 'f')
                                || (x2 >= 'A' && x2 <= 'F');
                        __CLR4_5_2694694lusyjkeu.R.inc(12806);if ((((!hex1 || !hex2)&&(__CLR4_5_2694694lusyjkeu.R.iget(12807)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12808)==0&false))) {{
                            __CLR4_5_2694694lusyjkeu.R.inc(12809);throw new JSONException("invalid escape character \\x" + x1 + x2);
                        }

                        }__CLR4_5_2694694lusyjkeu.R.inc(12810);putChar((char) (digits[x1] * 16 + digits[x2]));
                        __CLR4_5_2694694lusyjkeu.R.inc(12811);break;
                    case 'u':if (!__CLB4_5_2_bool6) {__CLR4_5_2694694lusyjkeu.R.inc(12812);__CLB4_5_2_bool6=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(12813);putChar((char) Integer.parseInt(new String(new char[] { next(), next(), next(), next() }), 16));
                        __CLR4_5_2694694lusyjkeu.R.inc(12814);break;
                    default:if (!__CLB4_5_2_bool6) {__CLR4_5_2694694lusyjkeu.R.inc(12815);__CLB4_5_2_bool6=true;}
                        __CLR4_5_2694694lusyjkeu.R.inc(12816);this.ch = chLocal;
                        __CLR4_5_2694694lusyjkeu.R.inc(12817);throw new JSONException("unclosed single-quote string");
                }
                __CLR4_5_2694694lusyjkeu.R.inc(12818);continue;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(12819);if ((((!hasSpecial)&&(__CLR4_5_2694694lusyjkeu.R.iget(12820)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12821)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12822);sp++;
                __CLR4_5_2694694lusyjkeu.R.inc(12823);continue;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(12824);if ((((sp == sbuf.length)&&(__CLR4_5_2694694lusyjkeu.R.iget(12825)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12826)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12827);putChar(chLocal);
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(12828);sbuf[sp++] = chLocal;
            }
        }}

        }__CLR4_5_2694694lusyjkeu.R.inc(12829);token = LITERAL_STRING;
        __CLR4_5_2694694lusyjkeu.R.inc(12830);this.next();
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    /**
     * Append a character to sbuf.
     */
    protected final void putChar(char ch) {try{__CLR4_5_2694694lusyjkeu.R.inc(12831);
        __CLR4_5_2694694lusyjkeu.R.inc(12832);if ((((sp == sbuf.length)&&(__CLR4_5_2694694lusyjkeu.R.iget(12833)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12834)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12835);char[] newsbuf = new char[sbuf.length * 2];
            __CLR4_5_2694694lusyjkeu.R.inc(12836);System.arraycopy(sbuf, 0, newsbuf, 0, sbuf.length);
            __CLR4_5_2694694lusyjkeu.R.inc(12837);sbuf = newsbuf;
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(12838);sbuf[sp++] = ch;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final void scanHex() {try{__CLR4_5_2694694lusyjkeu.R.inc(12839);
        __CLR4_5_2694694lusyjkeu.R.inc(12840);if ((((ch != 'x')&&(__CLR4_5_2694694lusyjkeu.R.iget(12841)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12842)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12843);throw new JSONException("illegal state. " + ch);
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(12844);next();
        __CLR4_5_2694694lusyjkeu.R.inc(12845);if ((((ch != '\'')&&(__CLR4_5_2694694lusyjkeu.R.iget(12846)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12847)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12848);throw new JSONException("illegal state. " + ch);
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(12849);np = bp;
        __CLR4_5_2694694lusyjkeu.R.inc(12850);next();

        __CLR4_5_2694694lusyjkeu.R.inc(12851);if ((((ch == '\'')&&(__CLR4_5_2694694lusyjkeu.R.iget(12852)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12853)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12854);next();
            __CLR4_5_2694694lusyjkeu.R.inc(12855);token = JSONToken.HEX;
            __CLR4_5_2694694lusyjkeu.R.inc(12856);return;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(12857);for (int i = 0;;++i) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12858);char ch = next();
            __CLR4_5_2694694lusyjkeu.R.inc(12859);if (((((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F'))&&(__CLR4_5_2694694lusyjkeu.R.iget(12860)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12861)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12862);sp++;
                __CLR4_5_2694694lusyjkeu.R.inc(12863);continue;
            } }else {__CLR4_5_2694694lusyjkeu.R.inc(12864);if ((((ch == '\'')&&(__CLR4_5_2694694lusyjkeu.R.iget(12865)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12866)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12867);sp++;
                __CLR4_5_2694694lusyjkeu.R.inc(12868);next();
                __CLR4_5_2694694lusyjkeu.R.inc(12869);break;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(12870);throw new JSONException("illegal state. " + ch);
            }
        }}}
        }__CLR4_5_2694694lusyjkeu.R.inc(12871);token = JSONToken.HEX;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final void scanNumber() {try{__CLR4_5_2694694lusyjkeu.R.inc(12872);
        __CLR4_5_2694694lusyjkeu.R.inc(12873);np = bp;

        __CLR4_5_2694694lusyjkeu.R.inc(12874);if ((((ch == '-')&&(__CLR4_5_2694694lusyjkeu.R.iget(12875)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12876)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12877);sp++;
            __CLR4_5_2694694lusyjkeu.R.inc(12878);next();
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(12879);for (;;) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12880);if ((((ch >= '0' && ch <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(12881)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12882)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12883);sp++;
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(12884);break;
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(12885);next();
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(12886);boolean isDouble = false;

        __CLR4_5_2694694lusyjkeu.R.inc(12887);if ((((ch == '.')&&(__CLR4_5_2694694lusyjkeu.R.iget(12888)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12889)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12890);sp++;
            __CLR4_5_2694694lusyjkeu.R.inc(12891);next();
            __CLR4_5_2694694lusyjkeu.R.inc(12892);isDouble = true;

            __CLR4_5_2694694lusyjkeu.R.inc(12893);for (;;) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12894);if ((((ch >= '0' && ch <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(12895)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12896)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12897);sp++;
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12898);break;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(12899);next();
            }
        }}

        }__CLR4_5_2694694lusyjkeu.R.inc(12900);if ((((ch == 'L')&&(__CLR4_5_2694694lusyjkeu.R.iget(12901)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12902)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12903);sp++;
            __CLR4_5_2694694lusyjkeu.R.inc(12904);next();
        } }else {__CLR4_5_2694694lusyjkeu.R.inc(12905);if ((((ch == 'S')&&(__CLR4_5_2694694lusyjkeu.R.iget(12906)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12907)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12908);sp++;
            __CLR4_5_2694694lusyjkeu.R.inc(12909);next();
        } }else {__CLR4_5_2694694lusyjkeu.R.inc(12910);if ((((ch == 'B')&&(__CLR4_5_2694694lusyjkeu.R.iget(12911)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12912)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12913);sp++;
            __CLR4_5_2694694lusyjkeu.R.inc(12914);next();
        } }else {__CLR4_5_2694694lusyjkeu.R.inc(12915);if ((((ch == 'F')&&(__CLR4_5_2694694lusyjkeu.R.iget(12916)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12917)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12918);sp++;
            __CLR4_5_2694694lusyjkeu.R.inc(12919);next();
            __CLR4_5_2694694lusyjkeu.R.inc(12920);isDouble = true;
        } }else {__CLR4_5_2694694lusyjkeu.R.inc(12921);if ((((ch == 'D')&&(__CLR4_5_2694694lusyjkeu.R.iget(12922)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12923)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12924);sp++;
            __CLR4_5_2694694lusyjkeu.R.inc(12925);next();
            __CLR4_5_2694694lusyjkeu.R.inc(12926);isDouble = true;
        } }else {__CLR4_5_2694694lusyjkeu.R.inc(12927);if ((((ch == 'e' || ch == 'E')&&(__CLR4_5_2694694lusyjkeu.R.iget(12928)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12929)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12930);sp++;
            __CLR4_5_2694694lusyjkeu.R.inc(12931);next();

            __CLR4_5_2694694lusyjkeu.R.inc(12932);if ((((ch == '+' || ch == '-')&&(__CLR4_5_2694694lusyjkeu.R.iget(12933)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12934)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12935);sp++;
                __CLR4_5_2694694lusyjkeu.R.inc(12936);next();
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(12937);for (;;) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12938);if ((((ch >= '0' && ch <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(12939)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12940)==0&false))) {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12941);sp++;
                } }else {{
                    __CLR4_5_2694694lusyjkeu.R.inc(12942);break;
                }
                }__CLR4_5_2694694lusyjkeu.R.inc(12943);next();
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(12944);if ((((ch == 'D' || ch == 'F')&&(__CLR4_5_2694694lusyjkeu.R.iget(12945)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12946)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12947);sp++;
                __CLR4_5_2694694lusyjkeu.R.inc(12948);next();
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(12949);isDouble = true;
        }

        }}}}}}__CLR4_5_2694694lusyjkeu.R.inc(12950);if ((((isDouble)&&(__CLR4_5_2694694lusyjkeu.R.iget(12951)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12952)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12953);token = JSONToken.LITERAL_FLOAT;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(12954);token = JSONToken.LITERAL_INT;
        }
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final long longValue() throws NumberFormatException {try{__CLR4_5_2694694lusyjkeu.R.inc(12955);
        __CLR4_5_2694694lusyjkeu.R.inc(12956);long result = 0;
        __CLR4_5_2694694lusyjkeu.R.inc(12957);boolean negative = false;
        __CLR4_5_2694694lusyjkeu.R.inc(12958);long limit;
        __CLR4_5_2694694lusyjkeu.R.inc(12959);int digit;

        __CLR4_5_2694694lusyjkeu.R.inc(12960);if ((((np == -1)&&(__CLR4_5_2694694lusyjkeu.R.iget(12961)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12962)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12963);np = 0;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(12964);int i = np, max = np + sp;

        __CLR4_5_2694694lusyjkeu.R.inc(12965);if ((((charAt(np) == '-')&&(__CLR4_5_2694694lusyjkeu.R.iget(12966)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12967)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12968);negative = true;
            __CLR4_5_2694694lusyjkeu.R.inc(12969);limit = Long.MIN_VALUE;
            __CLR4_5_2694694lusyjkeu.R.inc(12970);i++;
        } }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(12971);limit = -Long.MAX_VALUE;
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(12972);long multmin = MULTMIN_RADIX_TEN;
        __CLR4_5_2694694lusyjkeu.R.inc(12973);if ((((i < max)&&(__CLR4_5_2694694lusyjkeu.R.iget(12974)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12975)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(12976);digit = charAt(i++) - '0';
            __CLR4_5_2694694lusyjkeu.R.inc(12977);result = -digit;
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(12978);while ((((i < max)&&(__CLR4_5_2694694lusyjkeu.R.iget(12979)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12980)==0&false))) {{
            // Accumulating negatively avoids surprises near MAX_VALUE
            __CLR4_5_2694694lusyjkeu.R.inc(12981);char chLocal = charAt(i++);

            __CLR4_5_2694694lusyjkeu.R.inc(12982);if ((((chLocal == 'L' || chLocal == 'S' || chLocal == 'B')&&(__CLR4_5_2694694lusyjkeu.R.iget(12983)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12984)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12985);break;
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(12986);digit = chLocal - '0';
            __CLR4_5_2694694lusyjkeu.R.inc(12987);if ((((result < multmin)&&(__CLR4_5_2694694lusyjkeu.R.iget(12988)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12989)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12990);throw new NumberFormatException(numberString());
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(12991);result *= 10;
            __CLR4_5_2694694lusyjkeu.R.inc(12992);if ((((result < limit + digit)&&(__CLR4_5_2694694lusyjkeu.R.iget(12993)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12994)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(12995);throw new NumberFormatException(numberString());
            }
            }__CLR4_5_2694694lusyjkeu.R.inc(12996);result -= digit;
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(12997);if ((((negative)&&(__CLR4_5_2694694lusyjkeu.R.iget(12998)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(12999)==0&false))) {{
            __CLR4_5_2694694lusyjkeu.R.inc(13000);if ((((i > np + 1)&&(__CLR4_5_2694694lusyjkeu.R.iget(13001)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(13002)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(13003);return result;
            } }else {{ /* Only got "-" */
                __CLR4_5_2694694lusyjkeu.R.inc(13004);throw new NumberFormatException(numberString());
            }
        }} }else {{
            __CLR4_5_2694694lusyjkeu.R.inc(13005);return -result;
        }
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public final Number decimalValue(boolean decimal) {try{__CLR4_5_2694694lusyjkeu.R.inc(13006);
        __CLR4_5_2694694lusyjkeu.R.inc(13007);char chLocal = charAt(np + sp - 1);
        __CLR4_5_2694694lusyjkeu.R.inc(13008);try {
            __CLR4_5_2694694lusyjkeu.R.inc(13009);if ((((chLocal == 'F')&&(__CLR4_5_2694694lusyjkeu.R.iget(13010)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(13011)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(13012);return Float.parseFloat(numberString());
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(13013);if ((((chLocal == 'D')&&(__CLR4_5_2694694lusyjkeu.R.iget(13014)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(13015)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(13016);return Double.parseDouble(numberString());
            }

            }__CLR4_5_2694694lusyjkeu.R.inc(13017);if ((((decimal)&&(__CLR4_5_2694694lusyjkeu.R.iget(13018)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(13019)==0&false))) {{
                __CLR4_5_2694694lusyjkeu.R.inc(13020);return decimalValue();
            } }else {{
                __CLR4_5_2694694lusyjkeu.R.inc(13021);return doubleValue();
            }
        }} catch (NumberFormatException ex) {
            __CLR4_5_2694694lusyjkeu.R.inc(13022);throw new JSONException(ex.getMessage() + ", " + info());
        }
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public abstract BigDecimal decimalValue();

    public static boolean isWhitespace(char ch) {try{__CLR4_5_2694694lusyjkeu.R.inc(13023);
        // \u4e13\u95e8\u8c03\u6574\u4e86\u5224\u65ad\u987a\u5e8f
        __CLR4_5_2694694lusyjkeu.R.inc(13024);return ch <= ' '  &&
              (ch == ' '  ||
               ch == '\n' ||
               ch == '\r' ||
               ch == '\t' ||
               ch == '\f' ||
               ch == '\b');
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    protected static final long  MULTMIN_RADIX_TEN     = Long.MIN_VALUE / 10;
    protected static final int   INT_MULTMIN_RADIX_TEN = Integer.MIN_VALUE / 10;

    protected final static int[] digits                = new int[(int) 'f' + 1];

    static {try{__CLR4_5_2694694lusyjkeu.R.inc(13025);
        __CLR4_5_2694694lusyjkeu.R.inc(13026);for (int i = '0'; (((i <= '9')&&(__CLR4_5_2694694lusyjkeu.R.iget(13027)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(13028)==0&false)); ++i) {{
            __CLR4_5_2694694lusyjkeu.R.inc(13029);digits[i] = i - '0';
        }

        }__CLR4_5_2694694lusyjkeu.R.inc(13030);for (int i = 'a'; (((i <= 'f')&&(__CLR4_5_2694694lusyjkeu.R.iget(13031)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(13032)==0&false)); ++i) {{
            __CLR4_5_2694694lusyjkeu.R.inc(13033);digits[i] = (i - 'a') + 10;
        }
        }__CLR4_5_2694694lusyjkeu.R.inc(13034);for (int i = 'A'; (((i <= 'F')&&(__CLR4_5_2694694lusyjkeu.R.iget(13035)!=0|true))||(__CLR4_5_2694694lusyjkeu.R.iget(13036)==0&false)); ++i) {{
            __CLR4_5_2694694lusyjkeu.R.inc(13037);digits[i] = (i - 'A') + 10;
        }
    }}finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    /**
     * hsf support
     * @param fieldName
     * @param argTypesCount
     * @param typeSymbolTable
     * @return
     */
    public String[] scanFieldStringArray(char[] fieldName, int argTypesCount, SymbolTable typeSymbolTable) {try{__CLR4_5_2694694lusyjkeu.R.inc(13038);
        __CLR4_5_2694694lusyjkeu.R.inc(13039);throw new UnsupportedOperationException();
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public boolean matchField2(char[] fieldName) {try{__CLR4_5_2694694lusyjkeu.R.inc(13040);
        __CLR4_5_2694694lusyjkeu.R.inc(13041);throw new UnsupportedOperationException();
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}

    public int getFeatures() {try{__CLR4_5_2694694lusyjkeu.R.inc(13042);
        __CLR4_5_2694694lusyjkeu.R.inc(13043);return this.features;
    }finally{__CLR4_5_2694694lusyjkeu.R.flushNeeded();}}
}
