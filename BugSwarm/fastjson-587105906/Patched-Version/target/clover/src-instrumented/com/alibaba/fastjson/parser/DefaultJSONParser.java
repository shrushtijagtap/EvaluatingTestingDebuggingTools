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

import static com.alibaba.fastjson.parser.JSONLexer.EOI;
import static com.alibaba.fastjson.parser.JSONToken.*;

import java.io.Closeable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import com.alibaba.fastjson.*;
import com.alibaba.fastjson.parser.deserializer.*;
import com.alibaba.fastjson.serializer.*;
import com.alibaba.fastjson.util.TypeUtils;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class DefaultJSONParser implements Closeable {public static class __CLR4_5_253a53alusyjjnb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,8082,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final Object                input;
    public final SymbolTable           symbolTable;
    protected ParserConfig             config;

    private final static Set<Class<?>> primitiveClasses   = new HashSet<Class<?>>();

    private String                     dateFormatPattern  = JSON.DEFFAULT_DATE_FORMAT;
    private DateFormat                 dateFormat;

    public final JSONLexer             lexer;

    protected ParseContext             context;

    private ParseContext[]             contextArray;
    private int                        contextArrayIndex  = 0;

    private List<ResolveTask>          resolveTaskList;

    public final static int            NONE               = 0;
    public final static int            NeedToResolve      = 1;
    public final static int            TypeNameRedirect   = 2;

    public int                         resolveStatus      = NONE;

    private List<ExtraTypeProvider>    extraTypeProviders = null;
    private List<ExtraProcessor>       extraProcessors    = null;
    protected FieldTypeResolver        fieldTypeResolver  = null;

    private boolean                    autoTypeEnable;
    private String[]                   autoTypeAccept     = null;

    protected transient BeanContext    lastBeanContext;

    static {try{__CLR4_5_253a53alusyjjnb.R.inc(6598);
        __CLR4_5_253a53alusyjjnb.R.inc(6599);Class<?>[] classes = new Class[] {
                boolean.class,
                byte.class,
                short.class,
                int.class,
                long.class,
                float.class,
                double.class,

                Boolean.class,
                Byte.class,
                Short.class,
                Integer.class,
                Long.class,
                Float.class,
                Double.class,

                BigInteger.class,
                BigDecimal.class,
                String.class
        };

        __CLR4_5_253a53alusyjjnb.R.inc(6600);for (Class<?> clazz : classes) {{
            __CLR4_5_253a53alusyjjnb.R.inc(6601);primitiveClasses.add(clazz);
        }
    }}finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public String getDateFomartPattern() {try{__CLR4_5_253a53alusyjjnb.R.inc(6602);
        __CLR4_5_253a53alusyjjnb.R.inc(6603);return dateFormatPattern;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public DateFormat getDateFormat() {try{__CLR4_5_253a53alusyjjnb.R.inc(6604);
        __CLR4_5_253a53alusyjjnb.R.inc(6605);if ((((dateFormat == null)&&(__CLR4_5_253a53alusyjjnb.R.iget(6606)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6607)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(6608);dateFormat = new SimpleDateFormat(dateFormatPattern, lexer.getLocale());
            __CLR4_5_253a53alusyjjnb.R.inc(6609);dateFormat.setTimeZone(lexer.getTimeZone());
        }
        }__CLR4_5_253a53alusyjjnb.R.inc(6610);return dateFormat;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public void setDateFormat(String dateFormat) {try{__CLR4_5_253a53alusyjjnb.R.inc(6611);
        __CLR4_5_253a53alusyjjnb.R.inc(6612);this.dateFormatPattern = dateFormat;
        __CLR4_5_253a53alusyjjnb.R.inc(6613);this.dateFormat = null;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public void setDateFomrat(DateFormat dateFormat) {try{__CLR4_5_253a53alusyjjnb.R.inc(6614);
        __CLR4_5_253a53alusyjjnb.R.inc(6615);this.dateFormat = dateFormat;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public DefaultJSONParser(String input){
        this(input, ParserConfig.getGlobalInstance(), JSON.DEFAULT_PARSER_FEATURE);__CLR4_5_253a53alusyjjnb.R.inc(6617);try{__CLR4_5_253a53alusyjjnb.R.inc(6616);
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public DefaultJSONParser(final String input, final ParserConfig config){
        this(input, new JSONScanner(input, JSON.DEFAULT_PARSER_FEATURE), config);__CLR4_5_253a53alusyjjnb.R.inc(6619);try{__CLR4_5_253a53alusyjjnb.R.inc(6618);
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public DefaultJSONParser(final String input, final ParserConfig config, int features){
        this(input, new JSONScanner(input, features), config);__CLR4_5_253a53alusyjjnb.R.inc(6621);try{__CLR4_5_253a53alusyjjnb.R.inc(6620);
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public DefaultJSONParser(final char[] input, int length, final ParserConfig config, int features){
        this(input, new JSONScanner(input, length, features), config);__CLR4_5_253a53alusyjjnb.R.inc(6623);try{__CLR4_5_253a53alusyjjnb.R.inc(6622);
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public DefaultJSONParser(final JSONLexer lexer){
        this(lexer, ParserConfig.getGlobalInstance());__CLR4_5_253a53alusyjjnb.R.inc(6625);try{__CLR4_5_253a53alusyjjnb.R.inc(6624);
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public DefaultJSONParser(final JSONLexer lexer, final ParserConfig config){
        this(null, lexer, config);__CLR4_5_253a53alusyjjnb.R.inc(6627);try{__CLR4_5_253a53alusyjjnb.R.inc(6626);
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public DefaultJSONParser(final Object input, final JSONLexer lexer, final ParserConfig config){try{__CLR4_5_253a53alusyjjnb.R.inc(6628);
        __CLR4_5_253a53alusyjjnb.R.inc(6629);this.lexer = lexer;
        __CLR4_5_253a53alusyjjnb.R.inc(6630);this.input = input;
        __CLR4_5_253a53alusyjjnb.R.inc(6631);this.config = config;
        __CLR4_5_253a53alusyjjnb.R.inc(6632);this.symbolTable = config.symbolTable;

        __CLR4_5_253a53alusyjjnb.R.inc(6633);int ch = lexer.getCurrent();
        __CLR4_5_253a53alusyjjnb.R.inc(6634);if ((((ch == '{')&&(__CLR4_5_253a53alusyjjnb.R.iget(6635)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6636)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(6637);lexer.next();
            __CLR4_5_253a53alusyjjnb.R.inc(6638);((JSONLexerBase) lexer).token = JSONToken.LBRACE;
        } }else {__CLR4_5_253a53alusyjjnb.R.inc(6639);if ((((ch == '[')&&(__CLR4_5_253a53alusyjjnb.R.iget(6640)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6641)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(6642);lexer.next();
            __CLR4_5_253a53alusyjjnb.R.inc(6643);((JSONLexerBase) lexer).token = JSONToken.LBRACKET;
        } }else {{
            __CLR4_5_253a53alusyjjnb.R.inc(6644);lexer.nextToken(); // prime the pump
        }
    }}}finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public SymbolTable getSymbolTable() {try{__CLR4_5_253a53alusyjjnb.R.inc(6645);
        __CLR4_5_253a53alusyjjnb.R.inc(6646);return symbolTable;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public String getInput() {try{__CLR4_5_253a53alusyjjnb.R.inc(6647);
        __CLR4_5_253a53alusyjjnb.R.inc(6648);if ((((input instanceof char[])&&(__CLR4_5_253a53alusyjjnb.R.iget(6649)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6650)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(6651);return new String((char[]) input);
        }
        }__CLR4_5_253a53alusyjjnb.R.inc(6652);return input.toString();
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public final Object parseObject(final Map object, Object fieldName) {try{__CLR4_5_253a53alusyjjnb.R.inc(6653);
        __CLR4_5_253a53alusyjjnb.R.inc(6654);final JSONLexer lexer = this.lexer;

        __CLR4_5_253a53alusyjjnb.R.inc(6655);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_5_253a53alusyjjnb.R.iget(6656)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6657)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(6658);lexer.nextToken();
            __CLR4_5_253a53alusyjjnb.R.inc(6659);return null;
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(6660);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_5_253a53alusyjjnb.R.iget(6661)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6662)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(6663);lexer.nextToken();
            __CLR4_5_253a53alusyjjnb.R.inc(6664);return object;
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(6665);if ((((lexer.token() == JSONToken.LITERAL_STRING && lexer.stringVal().length() == 0)&&(__CLR4_5_253a53alusyjjnb.R.iget(6666)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6667)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(6668);lexer.nextToken();
            __CLR4_5_253a53alusyjjnb.R.inc(6669);return object;
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(6670);if ((((lexer.token() != JSONToken.LBRACE && lexer.token() != JSONToken.COMMA)&&(__CLR4_5_253a53alusyjjnb.R.iget(6671)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6672)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(6673);throw new JSONException("syntax error, expect {, actual " + lexer.tokenName() + ", " + lexer.info());
        }

       }__CLR4_5_253a53alusyjjnb.R.inc(6674);ParseContext context = this.context;
        __CLR4_5_253a53alusyjjnb.R.inc(6675);try {
            __CLR4_5_253a53alusyjjnb.R.inc(6676);boolean isJsonObjectMap = object instanceof JSONObject;
            __CLR4_5_253a53alusyjjnb.R.inc(6677);Map map = (((isJsonObjectMap )&&(__CLR4_5_253a53alusyjjnb.R.iget(6678)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6679)==0&false))? ((JSONObject) object).getInnerMap() : object;

            __CLR4_5_253a53alusyjjnb.R.inc(6680);boolean setContextFlag = false;
            __CLR4_5_253a53alusyjjnb.R.inc(6681);for (;;) {{
                __CLR4_5_253a53alusyjjnb.R.inc(6682);lexer.skipWhitespace();
                __CLR4_5_253a53alusyjjnb.R.inc(6683);char ch = lexer.getCurrent();
                __CLR4_5_253a53alusyjjnb.R.inc(6684);if ((((lexer.isEnabled(Feature.AllowArbitraryCommas))&&(__CLR4_5_253a53alusyjjnb.R.iget(6685)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6686)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(6687);while ((((ch == ',')&&(__CLR4_5_253a53alusyjjnb.R.iget(6688)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6689)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6690);lexer.next();
                        __CLR4_5_253a53alusyjjnb.R.inc(6691);lexer.skipWhitespace();
                        __CLR4_5_253a53alusyjjnb.R.inc(6692);ch = lexer.getCurrent();
                    }
                }}

                }__CLR4_5_253a53alusyjjnb.R.inc(6693);boolean isObjectKey = false;
                __CLR4_5_253a53alusyjjnb.R.inc(6694);Object key;
                __CLR4_5_253a53alusyjjnb.R.inc(6695);if ((((ch == '"')&&(__CLR4_5_253a53alusyjjnb.R.iget(6696)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6697)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(6698);key = lexer.scanSymbol(symbolTable, '"');
                    __CLR4_5_253a53alusyjjnb.R.inc(6699);lexer.skipWhitespace();
                    __CLR4_5_253a53alusyjjnb.R.inc(6700);ch = lexer.getCurrent();
                    __CLR4_5_253a53alusyjjnb.R.inc(6701);if ((((ch != ':')&&(__CLR4_5_253a53alusyjjnb.R.iget(6702)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6703)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6704);throw new JSONException("expect ':' at " + lexer.pos() + ", name " + key);
                    }
                }} }else {__CLR4_5_253a53alusyjjnb.R.inc(6705);if ((((ch == '}')&&(__CLR4_5_253a53alusyjjnb.R.iget(6706)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6707)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(6708);lexer.next();
                    __CLR4_5_253a53alusyjjnb.R.inc(6709);lexer.resetStringPosition();
                    __CLR4_5_253a53alusyjjnb.R.inc(6710);lexer.nextToken();

                    __CLR4_5_253a53alusyjjnb.R.inc(6711);if ((((!setContextFlag)&&(__CLR4_5_253a53alusyjjnb.R.iget(6712)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6713)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6714);if ((((this.context != null && fieldName == this.context.fieldName && object == this.context.object)&&(__CLR4_5_253a53alusyjjnb.R.iget(6715)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6716)==0&false))) {{
                            __CLR4_5_253a53alusyjjnb.R.inc(6717);context = this.context;
                        } }else {{
                            __CLR4_5_253a53alusyjjnb.R.inc(6718);ParseContext contextR = setContext(object, fieldName);
                            __CLR4_5_253a53alusyjjnb.R.inc(6719);if ((((context == null)&&(__CLR4_5_253a53alusyjjnb.R.iget(6720)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6721)==0&false))) {{
                                __CLR4_5_253a53alusyjjnb.R.inc(6722);context = contextR;
                            }
                            }__CLR4_5_253a53alusyjjnb.R.inc(6723);setContextFlag = true;
                        }
                    }}

                    }__CLR4_5_253a53alusyjjnb.R.inc(6724);return object;
                } }else {__CLR4_5_253a53alusyjjnb.R.inc(6725);if ((((ch == '\'')&&(__CLR4_5_253a53alusyjjnb.R.iget(6726)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6727)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(6728);if ((((!lexer.isEnabled(Feature.AllowSingleQuotes))&&(__CLR4_5_253a53alusyjjnb.R.iget(6729)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6730)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6731);throw new JSONException("syntax error");
                    }

                    }__CLR4_5_253a53alusyjjnb.R.inc(6732);key = lexer.scanSymbol(symbolTable, '\'');
                    __CLR4_5_253a53alusyjjnb.R.inc(6733);lexer.skipWhitespace();
                    __CLR4_5_253a53alusyjjnb.R.inc(6734);ch = lexer.getCurrent();
                    __CLR4_5_253a53alusyjjnb.R.inc(6735);if ((((ch != ':')&&(__CLR4_5_253a53alusyjjnb.R.iget(6736)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6737)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6738);throw new JSONException("expect ':' at " + lexer.pos());
                    }
                }} }else {__CLR4_5_253a53alusyjjnb.R.inc(6739);if ((((ch == EOI)&&(__CLR4_5_253a53alusyjjnb.R.iget(6740)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6741)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(6742);throw new JSONException("syntax error");
                } }else {__CLR4_5_253a53alusyjjnb.R.inc(6743);if ((((ch == ',')&&(__CLR4_5_253a53alusyjjnb.R.iget(6744)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6745)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(6746);throw new JSONException("syntax error");
                } }else {__CLR4_5_253a53alusyjjnb.R.inc(6747);if (((((ch >= '0' && ch <= '9') || ch == '-')&&(__CLR4_5_253a53alusyjjnb.R.iget(6748)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6749)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(6750);lexer.resetStringPosition();
                    __CLR4_5_253a53alusyjjnb.R.inc(6751);lexer.scanNumber();
                    __CLR4_5_253a53alusyjjnb.R.inc(6752);try {
                        __CLR4_5_253a53alusyjjnb.R.inc(6753);if ((((lexer.token() == JSONToken.LITERAL_INT)&&(__CLR4_5_253a53alusyjjnb.R.iget(6754)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6755)==0&false))) {{
                            __CLR4_5_253a53alusyjjnb.R.inc(6756);key = lexer.integerValue();
                        } }else {{
                            __CLR4_5_253a53alusyjjnb.R.inc(6757);key = lexer.decimalValue(true);
                        }
                        }__CLR4_5_253a53alusyjjnb.R.inc(6758);if ((((lexer.isEnabled(Feature.NonStringKeyAsString) || isJsonObjectMap)&&(__CLR4_5_253a53alusyjjnb.R.iget(6759)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6760)==0&false))) {{
                            __CLR4_5_253a53alusyjjnb.R.inc(6761);key = key.toString();
                        }
                    }} catch (NumberFormatException e) {
                        __CLR4_5_253a53alusyjjnb.R.inc(6762);throw new JSONException("parse number key error" + lexer.info());
                    }
                    __CLR4_5_253a53alusyjjnb.R.inc(6763);ch = lexer.getCurrent();
                    __CLR4_5_253a53alusyjjnb.R.inc(6764);if ((((ch != ':')&&(__CLR4_5_253a53alusyjjnb.R.iget(6765)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6766)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6767);throw new JSONException("parse number key error" + lexer.info());
                    }
                }} }else {__CLR4_5_253a53alusyjjnb.R.inc(6768);if ((((ch == '{' || ch == '[')&&(__CLR4_5_253a53alusyjjnb.R.iget(6769)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6770)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(6771);lexer.nextToken();
                    __CLR4_5_253a53alusyjjnb.R.inc(6772);key = parse();
                    __CLR4_5_253a53alusyjjnb.R.inc(6773);isObjectKey = true;
                } }else {{
                    __CLR4_5_253a53alusyjjnb.R.inc(6774);if ((((!lexer.isEnabled(Feature.AllowUnQuotedFieldNames))&&(__CLR4_5_253a53alusyjjnb.R.iget(6775)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6776)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6777);throw new JSONException("syntax error");
                    }

                    }__CLR4_5_253a53alusyjjnb.R.inc(6778);key = lexer.scanSymbolUnQuoted(symbolTable);
                    __CLR4_5_253a53alusyjjnb.R.inc(6779);lexer.skipWhitespace();
                    __CLR4_5_253a53alusyjjnb.R.inc(6780);ch = lexer.getCurrent();
                    __CLR4_5_253a53alusyjjnb.R.inc(6781);if ((((ch != ':')&&(__CLR4_5_253a53alusyjjnb.R.iget(6782)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6783)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6784);throw new JSONException("expect ':' at " + lexer.pos() + ", actual " + ch);
                    }
                }}

                }}}}}}}__CLR4_5_253a53alusyjjnb.R.inc(6785);if ((((!isObjectKey)&&(__CLR4_5_253a53alusyjjnb.R.iget(6786)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6787)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(6788);lexer.next();
                    __CLR4_5_253a53alusyjjnb.R.inc(6789);lexer.skipWhitespace();
                }

                }__CLR4_5_253a53alusyjjnb.R.inc(6790);ch = lexer.getCurrent();

                __CLR4_5_253a53alusyjjnb.R.inc(6791);lexer.resetStringPosition();

                __CLR4_5_253a53alusyjjnb.R.inc(6792);if ((((key == JSON.DEFAULT_TYPE_KEY
                        && !lexer.isEnabled(Feature.DisableSpecialKeyDetect))&&(__CLR4_5_253a53alusyjjnb.R.iget(6793)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6794)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(6795);String typeName = lexer.scanSymbol(symbolTable, '"');

                    __CLR4_5_253a53alusyjjnb.R.inc(6796);if ((((lexer.isEnabled(Feature.IgnoreAutoType))&&(__CLR4_5_253a53alusyjjnb.R.iget(6797)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6798)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6799);continue;
                    }

                    }__CLR4_5_253a53alusyjjnb.R.inc(6800);Class<?> clazz = null;
                    __CLR4_5_253a53alusyjjnb.R.inc(6801);if ((((object != null
                            && object.getClass().getName().equals(typeName))&&(__CLR4_5_253a53alusyjjnb.R.iget(6802)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6803)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6804);clazz = object.getClass();
                    } }else {{

                        __CLR4_5_253a53alusyjjnb.R.inc(6805);boolean allDigits = true;
                        __CLR4_5_253a53alusyjjnb.R.inc(6806);for (int i = 0; (((i < typeName.length())&&(__CLR4_5_253a53alusyjjnb.R.iget(6807)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6808)==0&false)); ++i) {{
                            __CLR4_5_253a53alusyjjnb.R.inc(6809);char c = typeName.charAt(i);
                            __CLR4_5_253a53alusyjjnb.R.inc(6810);if ((((c < '0' || c > '9')&&(__CLR4_5_253a53alusyjjnb.R.iget(6811)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6812)==0&false))) {{
                                __CLR4_5_253a53alusyjjnb.R.inc(6813);allDigits = false;
                                __CLR4_5_253a53alusyjjnb.R.inc(6814);break;
                            }
                        }}

                        }__CLR4_5_253a53alusyjjnb.R.inc(6815);if ((((!allDigits)&&(__CLR4_5_253a53alusyjjnb.R.iget(6816)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6817)==0&false))) {{
                            __CLR4_5_253a53alusyjjnb.R.inc(6818);clazz = config.checkAutoType(typeName, null, lexer.getFeatures());
                        }
                    }}

                    }__CLR4_5_253a53alusyjjnb.R.inc(6819);if ((((clazz == null)&&(__CLR4_5_253a53alusyjjnb.R.iget(6820)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6821)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6822);map.put(JSON.DEFAULT_TYPE_KEY, typeName);
                        __CLR4_5_253a53alusyjjnb.R.inc(6823);continue;
                    }

                    }__CLR4_5_253a53alusyjjnb.R.inc(6824);lexer.nextToken(JSONToken.COMMA);
                    __CLR4_5_253a53alusyjjnb.R.inc(6825);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_5_253a53alusyjjnb.R.iget(6826)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6827)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6828);lexer.nextToken(JSONToken.COMMA);
                        __CLR4_5_253a53alusyjjnb.R.inc(6829);try {
                            __CLR4_5_253a53alusyjjnb.R.inc(6830);Object instance = null;
                            __CLR4_5_253a53alusyjjnb.R.inc(6831);ObjectDeserializer deserializer = this.config.getDeserializer(clazz);
                            __CLR4_5_253a53alusyjjnb.R.inc(6832);if ((((deserializer instanceof JavaBeanDeserializer)&&(__CLR4_5_253a53alusyjjnb.R.iget(6833)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6834)==0&false))) {{
                            	__CLR4_5_253a53alusyjjnb.R.inc(6835);instance = TypeUtils.cast(object, clazz, this.config);
                            }

                            }__CLR4_5_253a53alusyjjnb.R.inc(6836);if ((((instance == null)&&(__CLR4_5_253a53alusyjjnb.R.iget(6837)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6838)==0&false))) {{
                                __CLR4_5_253a53alusyjjnb.R.inc(6839);if ((((clazz == Cloneable.class)&&(__CLR4_5_253a53alusyjjnb.R.iget(6840)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6841)==0&false))) {{
                                    __CLR4_5_253a53alusyjjnb.R.inc(6842);instance = new HashMap();
                                } }else {__CLR4_5_253a53alusyjjnb.R.inc(6843);if (((("java.util.Collections$EmptyMap".equals(typeName))&&(__CLR4_5_253a53alusyjjnb.R.iget(6844)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6845)==0&false))) {{
                                    __CLR4_5_253a53alusyjjnb.R.inc(6846);instance = Collections.emptyMap();
                                } }else {__CLR4_5_253a53alusyjjnb.R.inc(6847);if (((("java.util.Collections$UnmodifiableMap".equals(typeName))&&(__CLR4_5_253a53alusyjjnb.R.iget(6848)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6849)==0&false))) {{
                                    __CLR4_5_253a53alusyjjnb.R.inc(6850);instance = Collections.unmodifiableMap(new HashMap());
                                } }else {{
                                    __CLR4_5_253a53alusyjjnb.R.inc(6851);instance = clazz.newInstance();
                                }
                            }}}}

                            }__CLR4_5_253a53alusyjjnb.R.inc(6852);return instance;
                        } catch (Exception e) {
                            __CLR4_5_253a53alusyjjnb.R.inc(6853);throw new JSONException("create instance error", e);
                        }
                    }

                    }__CLR4_5_253a53alusyjjnb.R.inc(6854);this.setResolveStatus(TypeNameRedirect);

                    __CLR4_5_253a53alusyjjnb.R.inc(6855);if ((((this.context != null
                            && fieldName != null
                            && !(fieldName instanceof Integer)
                            && !(this.context.fieldName instanceof Integer))&&(__CLR4_5_253a53alusyjjnb.R.iget(6856)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6857)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6858);this.popContext();
                    }

                    }__CLR4_5_253a53alusyjjnb.R.inc(6859);if ((((object.size() > 0)&&(__CLR4_5_253a53alusyjjnb.R.iget(6860)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6861)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6862);Object newObj = TypeUtils.cast(object, clazz, this.config);
                        __CLR4_5_253a53alusyjjnb.R.inc(6863);this.setResolveStatus(NONE);
                        __CLR4_5_253a53alusyjjnb.R.inc(6864);this.parseObject(newObj);
                        __CLR4_5_253a53alusyjjnb.R.inc(6865);return newObj;
                    }

                    }__CLR4_5_253a53alusyjjnb.R.inc(6866);ObjectDeserializer deserializer = config.getDeserializer(clazz);
                    __CLR4_5_253a53alusyjjnb.R.inc(6867);Class deserClass = deserializer.getClass();
                    __CLR4_5_253a53alusyjjnb.R.inc(6868);if ((((JavaBeanDeserializer.class.isAssignableFrom(deserClass)
                            && deserClass != JavaBeanDeserializer.class
                            && deserClass != ThrowableDeserializer.class)&&(__CLR4_5_253a53alusyjjnb.R.iget(6869)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6870)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6871);this.setResolveStatus(NONE);
                    } }else {__CLR4_5_253a53alusyjjnb.R.inc(6872);if ((((deserializer instanceof MapDeserializer)&&(__CLR4_5_253a53alusyjjnb.R.iget(6873)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6874)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6875);this.setResolveStatus(NONE);
                    }
                    }}__CLR4_5_253a53alusyjjnb.R.inc(6876);Object obj = deserializer.deserialze(this, clazz, fieldName);
                    __CLR4_5_253a53alusyjjnb.R.inc(6877);return obj;
                }

                }__CLR4_5_253a53alusyjjnb.R.inc(6878);if ((((key == "$ref"
                        && context != null
                        && !lexer.isEnabled(Feature.DisableSpecialKeyDetect))&&(__CLR4_5_253a53alusyjjnb.R.iget(6879)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6880)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(6881);lexer.nextToken(JSONToken.LITERAL_STRING);
                    __CLR4_5_253a53alusyjjnb.R.inc(6882);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_5_253a53alusyjjnb.R.iget(6883)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6884)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6885);String ref = lexer.stringVal();
                        __CLR4_5_253a53alusyjjnb.R.inc(6886);lexer.nextToken(JSONToken.RBRACE);

                        __CLR4_5_253a53alusyjjnb.R.inc(6887);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_5_253a53alusyjjnb.R.iget(6888)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6889)==0&false))) {{
                            __CLR4_5_253a53alusyjjnb.R.inc(6890);map.put(key, ref);
                            __CLR4_5_253a53alusyjjnb.R.inc(6891);continue;
                        }

                        }__CLR4_5_253a53alusyjjnb.R.inc(6892);Object refValue = null;
                        __CLR4_5_253a53alusyjjnb.R.inc(6893);if (((("@".equals(ref))&&(__CLR4_5_253a53alusyjjnb.R.iget(6894)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6895)==0&false))) {{
                            __CLR4_5_253a53alusyjjnb.R.inc(6896);if ((((this.context != null)&&(__CLR4_5_253a53alusyjjnb.R.iget(6897)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6898)==0&false))) {{
                                __CLR4_5_253a53alusyjjnb.R.inc(6899);ParseContext thisContext = this.context;
                                __CLR4_5_253a53alusyjjnb.R.inc(6900);Object thisObj = thisContext.object;
                                __CLR4_5_253a53alusyjjnb.R.inc(6901);if ((((thisObj instanceof Object[] || thisObj instanceof Collection<?>)&&(__CLR4_5_253a53alusyjjnb.R.iget(6902)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6903)==0&false))) {{
                                    __CLR4_5_253a53alusyjjnb.R.inc(6904);refValue = thisObj;
                                } }else {__CLR4_5_253a53alusyjjnb.R.inc(6905);if ((((thisContext.parent != null)&&(__CLR4_5_253a53alusyjjnb.R.iget(6906)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6907)==0&false))) {{
                                    __CLR4_5_253a53alusyjjnb.R.inc(6908);refValue = thisContext.parent.object;
                                }
                            }}}
                        }} }else {__CLR4_5_253a53alusyjjnb.R.inc(6909);if (((("..".equals(ref))&&(__CLR4_5_253a53alusyjjnb.R.iget(6910)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6911)==0&false))) {{
                            __CLR4_5_253a53alusyjjnb.R.inc(6912);if ((((context.object != null)&&(__CLR4_5_253a53alusyjjnb.R.iget(6913)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6914)==0&false))) {{
                                __CLR4_5_253a53alusyjjnb.R.inc(6915);refValue = context.object;
                            } }else {{
                                __CLR4_5_253a53alusyjjnb.R.inc(6916);addResolveTask(new ResolveTask(context, ref));
                                __CLR4_5_253a53alusyjjnb.R.inc(6917);setResolveStatus(DefaultJSONParser.NeedToResolve);
                            }
                        }} }else {__CLR4_5_253a53alusyjjnb.R.inc(6918);if (((("$".equals(ref))&&(__CLR4_5_253a53alusyjjnb.R.iget(6919)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6920)==0&false))) {{
                            __CLR4_5_253a53alusyjjnb.R.inc(6921);ParseContext rootContext = context;
                            __CLR4_5_253a53alusyjjnb.R.inc(6922);while ((((rootContext.parent != null)&&(__CLR4_5_253a53alusyjjnb.R.iget(6923)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6924)==0&false))) {{
                                __CLR4_5_253a53alusyjjnb.R.inc(6925);rootContext = rootContext.parent;
                            }

                            }__CLR4_5_253a53alusyjjnb.R.inc(6926);if ((((rootContext.object != null)&&(__CLR4_5_253a53alusyjjnb.R.iget(6927)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6928)==0&false))) {{
                                __CLR4_5_253a53alusyjjnb.R.inc(6929);refValue = rootContext.object;
                            } }else {{
                                __CLR4_5_253a53alusyjjnb.R.inc(6930);addResolveTask(new ResolveTask(rootContext, ref));
                                __CLR4_5_253a53alusyjjnb.R.inc(6931);setResolveStatus(DefaultJSONParser.NeedToResolve);
                            }
                        }} }else {{
                            __CLR4_5_253a53alusyjjnb.R.inc(6932);addResolveTask(new ResolveTask(context, ref));
                            __CLR4_5_253a53alusyjjnb.R.inc(6933);setResolveStatus(DefaultJSONParser.NeedToResolve);
                        }

                        }}}__CLR4_5_253a53alusyjjnb.R.inc(6934);if ((((lexer.token() != JSONToken.RBRACE)&&(__CLR4_5_253a53alusyjjnb.R.iget(6935)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6936)==0&false))) {{
                            __CLR4_5_253a53alusyjjnb.R.inc(6937);throw new JSONException("syntax error, " + lexer.info());
                        }
                        }__CLR4_5_253a53alusyjjnb.R.inc(6938);lexer.nextToken(JSONToken.COMMA);

                        __CLR4_5_253a53alusyjjnb.R.inc(6939);return refValue;
                    } }else {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6940);throw new JSONException("illegal ref, " + JSONToken.name(lexer.token()));
                    }
                }}

                }__CLR4_5_253a53alusyjjnb.R.inc(6941);if ((((!setContextFlag)&&(__CLR4_5_253a53alusyjjnb.R.iget(6942)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6943)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(6944);if ((((this.context != null && fieldName == this.context.fieldName && object == this.context.object)&&(__CLR4_5_253a53alusyjjnb.R.iget(6945)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6946)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6947);context = this.context;
                    } }else {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6948);ParseContext contextR = setContext(object, fieldName);
                        __CLR4_5_253a53alusyjjnb.R.inc(6949);if ((((context == null)&&(__CLR4_5_253a53alusyjjnb.R.iget(6950)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6951)==0&false))) {{
                            __CLR4_5_253a53alusyjjnb.R.inc(6952);context = contextR;
                        }
                        }__CLR4_5_253a53alusyjjnb.R.inc(6953);setContextFlag = true;
                    }
                }}

                }__CLR4_5_253a53alusyjjnb.R.inc(6954);if ((((object.getClass() == JSONObject.class)&&(__CLR4_5_253a53alusyjjnb.R.iget(6955)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6956)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(6957);if ((((key == null)&&(__CLR4_5_253a53alusyjjnb.R.iget(6958)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6959)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6960);key = "null";
                    }
                }}

                }__CLR4_5_253a53alusyjjnb.R.inc(6961);Object value;
                __CLR4_5_253a53alusyjjnb.R.inc(6962);if ((((ch == '"')&&(__CLR4_5_253a53alusyjjnb.R.iget(6963)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6964)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(6965);lexer.scanString();
                    __CLR4_5_253a53alusyjjnb.R.inc(6966);String strValue = lexer.stringVal();
                    __CLR4_5_253a53alusyjjnb.R.inc(6967);value = strValue;

                    __CLR4_5_253a53alusyjjnb.R.inc(6968);if ((((lexer.isEnabled(Feature.AllowISO8601DateFormat))&&(__CLR4_5_253a53alusyjjnb.R.iget(6969)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6970)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6971);JSONScanner iso8601Lexer = new JSONScanner(strValue);
                        __CLR4_5_253a53alusyjjnb.R.inc(6972);if ((((iso8601Lexer.scanISO8601DateIfMatch())&&(__CLR4_5_253a53alusyjjnb.R.iget(6973)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6974)==0&false))) {{
                            __CLR4_5_253a53alusyjjnb.R.inc(6975);value = iso8601Lexer.getCalendar().getTime();
                        }
                        }__CLR4_5_253a53alusyjjnb.R.inc(6976);iso8601Lexer.close();
                    }

                    }__CLR4_5_253a53alusyjjnb.R.inc(6977);map.put(key, value);
                } }else {__CLR4_5_253a53alusyjjnb.R.inc(6978);if ((((ch >= '0' && ch <= '9' || ch == '-')&&(__CLR4_5_253a53alusyjjnb.R.iget(6979)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6980)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(6981);lexer.scanNumber();
                    __CLR4_5_253a53alusyjjnb.R.inc(6982);if ((((lexer.token() == JSONToken.LITERAL_INT)&&(__CLR4_5_253a53alusyjjnb.R.iget(6983)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6984)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6985);value = lexer.integerValue();
                    } }else {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6986);value = lexer.decimalValue(lexer.isEnabled(Feature.UseBigDecimal));
                    }

                    }__CLR4_5_253a53alusyjjnb.R.inc(6987);map.put(key, value);
                } }else {__CLR4_5_253a53alusyjjnb.R.inc(6988);if ((((ch == '[')&&(__CLR4_5_253a53alusyjjnb.R.iget(6989)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6990)==0&false))) {{ // \u51cf\u5c11\u5d4c\u5957\uff0c\u517c\u5bb9android
                    __CLR4_5_253a53alusyjjnb.R.inc(6991);lexer.nextToken();

                    __CLR4_5_253a53alusyjjnb.R.inc(6992);JSONArray list = new JSONArray();

                    __CLR4_5_253a53alusyjjnb.R.inc(6993);final boolean parentIsArray = fieldName != null && fieldName.getClass() == Integer.class;
//                    if (!parentIsArray) {
//                        this.setContext(context);
//                    }
                    __CLR4_5_253a53alusyjjnb.R.inc(6994);if ((((fieldName == null)&&(__CLR4_5_253a53alusyjjnb.R.iget(6995)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(6996)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(6997);this.setContext(context);
                    }

                    }__CLR4_5_253a53alusyjjnb.R.inc(6998);this.parseArray(list, key);

                    __CLR4_5_253a53alusyjjnb.R.inc(6999);if ((((lexer.isEnabled(Feature.UseObjectArray))&&(__CLR4_5_253a53alusyjjnb.R.iget(7000)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7001)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7002);value = list.toArray();
                    } }else {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7003);value = list;
                    }
                    }__CLR4_5_253a53alusyjjnb.R.inc(7004);map.put(key, value);

                    __CLR4_5_253a53alusyjjnb.R.inc(7005);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_5_253a53alusyjjnb.R.iget(7006)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7007)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7008);lexer.nextToken();
                        __CLR4_5_253a53alusyjjnb.R.inc(7009);return object;
                    } }else {__CLR4_5_253a53alusyjjnb.R.inc(7010);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_5_253a53alusyjjnb.R.iget(7011)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7012)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7013);continue;
                    } }else {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7014);throw new JSONException("syntax error");
                    }
                }}} }else {__CLR4_5_253a53alusyjjnb.R.inc(7015);if ((((ch == '{')&&(__CLR4_5_253a53alusyjjnb.R.iget(7016)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7017)==0&false))) {{ // \u51cf\u5c11\u5d4c\u5957\uff0c\u517c\u5bb9 Android
                    __CLR4_5_253a53alusyjjnb.R.inc(7018);lexer.nextToken();

                    __CLR4_5_253a53alusyjjnb.R.inc(7019);final boolean parentIsArray = fieldName != null && fieldName.getClass() == Integer.class;

                    __CLR4_5_253a53alusyjjnb.R.inc(7020);Map input;
                    __CLR4_5_253a53alusyjjnb.R.inc(7021);if ((((lexer.isEnabled(Feature.CustomMapDeserializer))&&(__CLR4_5_253a53alusyjjnb.R.iget(7022)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7023)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7024);MapDeserializer mapDeserializer = (MapDeserializer) config.getDeserializer(Map.class);


                        __CLR4_5_253a53alusyjjnb.R.inc(7025);input = ((((lexer.getFeatures() & Feature.OrderedField.mask) != 0
                                )&&(__CLR4_5_253a53alusyjjnb.R.iget(7026)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7027)==0&false))? mapDeserializer.createMap(Map.class, lexer.getFeatures())
                                : mapDeserializer.createMap(Map.class);
                    } }else {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7028);input = new JSONObject(lexer.isEnabled(Feature.OrderedField));
                    }
                    }__CLR4_5_253a53alusyjjnb.R.inc(7029);ParseContext ctxLocal = null;

                    __CLR4_5_253a53alusyjjnb.R.inc(7030);if ((((!parentIsArray)&&(__CLR4_5_253a53alusyjjnb.R.iget(7031)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7032)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7033);ctxLocal = setContext(context, input, key);
                    }

                    }__CLR4_5_253a53alusyjjnb.R.inc(7034);Object obj = null;
                    __CLR4_5_253a53alusyjjnb.R.inc(7035);boolean objParsed = false;
                    __CLR4_5_253a53alusyjjnb.R.inc(7036);if ((((fieldTypeResolver != null)&&(__CLR4_5_253a53alusyjjnb.R.iget(7037)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7038)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7039);String resolveFieldName = (((key != null )&&(__CLR4_5_253a53alusyjjnb.R.iget(7040)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7041)==0&false))? key.toString() : null;
                        __CLR4_5_253a53alusyjjnb.R.inc(7042);Type fieldType = fieldTypeResolver.resolve(object, resolveFieldName);
                        __CLR4_5_253a53alusyjjnb.R.inc(7043);if ((((fieldType != null)&&(__CLR4_5_253a53alusyjjnb.R.iget(7044)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7045)==0&false))) {{
                            __CLR4_5_253a53alusyjjnb.R.inc(7046);ObjectDeserializer fieldDeser = config.getDeserializer(fieldType);
                            __CLR4_5_253a53alusyjjnb.R.inc(7047);obj = fieldDeser.deserialze(this, fieldType, key);
                            __CLR4_5_253a53alusyjjnb.R.inc(7048);objParsed = true;
                        }
                    }}
                    }__CLR4_5_253a53alusyjjnb.R.inc(7049);if ((((!objParsed)&&(__CLR4_5_253a53alusyjjnb.R.iget(7050)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7051)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7052);obj = this.parseObject(input, key);
                    }

                    }__CLR4_5_253a53alusyjjnb.R.inc(7053);if ((((ctxLocal != null && input != obj)&&(__CLR4_5_253a53alusyjjnb.R.iget(7054)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7055)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7056);ctxLocal.object = object;
                    }

                    }__CLR4_5_253a53alusyjjnb.R.inc(7057);if ((((key != null)&&(__CLR4_5_253a53alusyjjnb.R.iget(7058)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7059)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7060);checkMapResolve(object, key.toString());
                    }

                    }__CLR4_5_253a53alusyjjnb.R.inc(7061);map.put(key, obj);

                    __CLR4_5_253a53alusyjjnb.R.inc(7062);if ((((parentIsArray)&&(__CLR4_5_253a53alusyjjnb.R.iget(7063)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7064)==0&false))) {{
                        //setContext(context, obj, key);
                        __CLR4_5_253a53alusyjjnb.R.inc(7065);setContext(obj, key);
                    }

                    }__CLR4_5_253a53alusyjjnb.R.inc(7066);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_5_253a53alusyjjnb.R.iget(7067)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7068)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7069);lexer.nextToken();

                        __CLR4_5_253a53alusyjjnb.R.inc(7070);setContext(context);
                        __CLR4_5_253a53alusyjjnb.R.inc(7071);return object;
                    } }else {__CLR4_5_253a53alusyjjnb.R.inc(7072);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_5_253a53alusyjjnb.R.iget(7073)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7074)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7075);if ((((parentIsArray)&&(__CLR4_5_253a53alusyjjnb.R.iget(7076)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7077)==0&false))) {{
                            __CLR4_5_253a53alusyjjnb.R.inc(7078);this.popContext();
                        } }else {{
                            __CLR4_5_253a53alusyjjnb.R.inc(7079);this.setContext(context);
                        }
                        }__CLR4_5_253a53alusyjjnb.R.inc(7080);continue;
                    } }else {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7081);throw new JSONException("syntax error, " + lexer.tokenName());
                    }
                }}} }else {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7082);lexer.nextToken();
                    __CLR4_5_253a53alusyjjnb.R.inc(7083);value = parse();

                    __CLR4_5_253a53alusyjjnb.R.inc(7084);map.put(key, value);

                    __CLR4_5_253a53alusyjjnb.R.inc(7085);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_5_253a53alusyjjnb.R.iget(7086)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7087)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7088);lexer.nextToken();
                        __CLR4_5_253a53alusyjjnb.R.inc(7089);return object;
                    } }else {__CLR4_5_253a53alusyjjnb.R.inc(7090);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_5_253a53alusyjjnb.R.iget(7091)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7092)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7093);continue;
                    } }else {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7094);throw new JSONException("syntax error, position at " + lexer.pos() + ", name " + key);
                    }
                }}}

                }}}}__CLR4_5_253a53alusyjjnb.R.inc(7095);lexer.skipWhitespace();
                __CLR4_5_253a53alusyjjnb.R.inc(7096);ch = lexer.getCurrent();
                __CLR4_5_253a53alusyjjnb.R.inc(7097);if ((((ch == ',')&&(__CLR4_5_253a53alusyjjnb.R.iget(7098)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7099)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7100);lexer.next();
                    __CLR4_5_253a53alusyjjnb.R.inc(7101);continue;
                } }else {__CLR4_5_253a53alusyjjnb.R.inc(7102);if ((((ch == '}')&&(__CLR4_5_253a53alusyjjnb.R.iget(7103)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7104)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7105);lexer.next();
                    __CLR4_5_253a53alusyjjnb.R.inc(7106);lexer.resetStringPosition();
                    __CLR4_5_253a53alusyjjnb.R.inc(7107);lexer.nextToken();

                    // this.setContext(object, fieldName);
                    __CLR4_5_253a53alusyjjnb.R.inc(7108);this.setContext(value, key);

                    __CLR4_5_253a53alusyjjnb.R.inc(7109);return object;
                } }else {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7110);throw new JSONException("syntax error, position at " + lexer.pos() + ", name " + key);
                }

            }}}
        }} finally {
            __CLR4_5_253a53alusyjjnb.R.inc(7111);this.setContext(context);
        }

    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public ParserConfig getConfig() {try{__CLR4_5_253a53alusyjjnb.R.inc(7112);
        __CLR4_5_253a53alusyjjnb.R.inc(7113);return config;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public void setConfig(ParserConfig config) {try{__CLR4_5_253a53alusyjjnb.R.inc(7114);
        __CLR4_5_253a53alusyjjnb.R.inc(7115);this.config = config;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    // compatible
    @SuppressWarnings("unchecked")
    public <T> T parseObject(Class<T> clazz) {try{__CLR4_5_253a53alusyjjnb.R.inc(7116);
        __CLR4_5_253a53alusyjjnb.R.inc(7117);return (T) parseObject(clazz, null);
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public <T> T parseObject(Type type) {try{__CLR4_5_253a53alusyjjnb.R.inc(7118);
        __CLR4_5_253a53alusyjjnb.R.inc(7119);return parseObject(type, null);
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public <T> T parseObject(Type type, Object fieldName) {try{__CLR4_5_253a53alusyjjnb.R.inc(7120);
        __CLR4_5_253a53alusyjjnb.R.inc(7121);int token = lexer.token();
        __CLR4_5_253a53alusyjjnb.R.inc(7122);if ((((token == JSONToken.NULL)&&(__CLR4_5_253a53alusyjjnb.R.iget(7123)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7124)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7125);lexer.nextToken();
            __CLR4_5_253a53alusyjjnb.R.inc(7126);return null;
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7127);if ((((token == JSONToken.LITERAL_STRING)&&(__CLR4_5_253a53alusyjjnb.R.iget(7128)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7129)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7130);if ((((type == byte[].class)&&(__CLR4_5_253a53alusyjjnb.R.iget(7131)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7132)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7133);byte[] bytes = lexer.bytesValue();
                __CLR4_5_253a53alusyjjnb.R.inc(7134);lexer.nextToken();
                __CLR4_5_253a53alusyjjnb.R.inc(7135);return (T) bytes;
            }

            }__CLR4_5_253a53alusyjjnb.R.inc(7136);if ((((type == char[].class)&&(__CLR4_5_253a53alusyjjnb.R.iget(7137)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7138)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7139);String strVal = lexer.stringVal();
                __CLR4_5_253a53alusyjjnb.R.inc(7140);lexer.nextToken();
                __CLR4_5_253a53alusyjjnb.R.inc(7141);return (T) strVal.toCharArray();
            }
        }}

        }__CLR4_5_253a53alusyjjnb.R.inc(7142);ObjectDeserializer deserializer = config.getDeserializer(type);

        __CLR4_5_253a53alusyjjnb.R.inc(7143);try {
            __CLR4_5_253a53alusyjjnb.R.inc(7144);if ((((deserializer.getClass() == JavaBeanDeserializer.class)&&(__CLR4_5_253a53alusyjjnb.R.iget(7145)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7146)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7147);if ((((lexer.token()!= JSONToken.LBRACE && lexer.token()!=JSONToken.LBRACKET)&&(__CLR4_5_253a53alusyjjnb.R.iget(7148)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7149)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7150);throw new JSONException("syntax error,except start with { or [,but actually start with "+ lexer.tokenName());
            }
                }__CLR4_5_253a53alusyjjnb.R.inc(7151);return (T) ((JavaBeanDeserializer) deserializer).deserialze(this, type, fieldName, 0);
            } }else {{
                __CLR4_5_253a53alusyjjnb.R.inc(7152);return (T) deserializer.deserialze(this, type, fieldName);
            }
        }} catch (JSONException e) {
            __CLR4_5_253a53alusyjjnb.R.inc(7153);throw e;
        } catch (Throwable e) {
            __CLR4_5_253a53alusyjjnb.R.inc(7154);throw new JSONException(e.getMessage(), e);
        }
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public <T> List<T> parseArray(Class<T> clazz) {try{__CLR4_5_253a53alusyjjnb.R.inc(7155);
        __CLR4_5_253a53alusyjjnb.R.inc(7156);List<T> array = new ArrayList<T>();
        __CLR4_5_253a53alusyjjnb.R.inc(7157);parseArray(clazz, array);
        __CLR4_5_253a53alusyjjnb.R.inc(7158);return array;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public void parseArray(Class<?> clazz, @SuppressWarnings("rawtypes") Collection array) {try{__CLR4_5_253a53alusyjjnb.R.inc(7159);
        __CLR4_5_253a53alusyjjnb.R.inc(7160);parseArray((Type) clazz, array);
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    @SuppressWarnings("rawtypes")
    public void parseArray(Type type, Collection array) {try{__CLR4_5_253a53alusyjjnb.R.inc(7161);
        __CLR4_5_253a53alusyjjnb.R.inc(7162);parseArray(type, array, null);
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void parseArray(Type type, Collection array, Object fieldName) {try{__CLR4_5_253a53alusyjjnb.R.inc(7163);
        __CLR4_5_253a53alusyjjnb.R.inc(7164);int token = lexer.token();
        __CLR4_5_253a53alusyjjnb.R.inc(7165);if ((((token == JSONToken.SET || token == JSONToken.TREE_SET)&&(__CLR4_5_253a53alusyjjnb.R.iget(7166)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7167)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7168);lexer.nextToken();
            __CLR4_5_253a53alusyjjnb.R.inc(7169);token = lexer.token();
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7170);if ((((token != JSONToken.LBRACKET)&&(__CLR4_5_253a53alusyjjnb.R.iget(7171)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7172)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7173);throw new JSONException("expect '[', but " + JSONToken.name(token) + ", " + lexer.info());
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7174);ObjectDeserializer deserializer = null;
        __CLR4_5_253a53alusyjjnb.R.inc(7175);if ((((int.class == type)&&(__CLR4_5_253a53alusyjjnb.R.iget(7176)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7177)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7178);deserializer = IntegerCodec.instance;
            __CLR4_5_253a53alusyjjnb.R.inc(7179);lexer.nextToken(JSONToken.LITERAL_INT);
        } }else {__CLR4_5_253a53alusyjjnb.R.inc(7180);if ((((String.class == type)&&(__CLR4_5_253a53alusyjjnb.R.iget(7181)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7182)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7183);deserializer = StringCodec.instance;
            __CLR4_5_253a53alusyjjnb.R.inc(7184);lexer.nextToken(JSONToken.LITERAL_STRING);
        } }else {{
            __CLR4_5_253a53alusyjjnb.R.inc(7185);deserializer = config.getDeserializer(type);
            __CLR4_5_253a53alusyjjnb.R.inc(7186);lexer.nextToken(deserializer.getFastMatchToken());
        }

        }}__CLR4_5_253a53alusyjjnb.R.inc(7187);ParseContext context = this.context;
        __CLR4_5_253a53alusyjjnb.R.inc(7188);this.setContext(array, fieldName);
        __CLR4_5_253a53alusyjjnb.R.inc(7189);try {
            __CLR4_5_253a53alusyjjnb.R.inc(7190);for (int i = 0;; ++i) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7191);if ((((lexer.isEnabled(Feature.AllowArbitraryCommas))&&(__CLR4_5_253a53alusyjjnb.R.iget(7192)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7193)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7194);while ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_5_253a53alusyjjnb.R.iget(7195)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7196)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7197);lexer.nextToken();
                        __CLR4_5_253a53alusyjjnb.R.inc(7198);continue;
                    }
                }}

                }__CLR4_5_253a53alusyjjnb.R.inc(7199);if ((((lexer.token() == JSONToken.RBRACKET)&&(__CLR4_5_253a53alusyjjnb.R.iget(7200)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7201)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7202);break;
                }

                }__CLR4_5_253a53alusyjjnb.R.inc(7203);if ((((int.class == type)&&(__CLR4_5_253a53alusyjjnb.R.iget(7204)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7205)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7206);Object val = IntegerCodec.instance.deserialze(this, null, null);
                    __CLR4_5_253a53alusyjjnb.R.inc(7207);array.add(val);
                } }else {__CLR4_5_253a53alusyjjnb.R.inc(7208);if ((((String.class == type)&&(__CLR4_5_253a53alusyjjnb.R.iget(7209)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7210)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7211);String value;
                    __CLR4_5_253a53alusyjjnb.R.inc(7212);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_5_253a53alusyjjnb.R.iget(7213)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7214)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7215);value = lexer.stringVal();
                        __CLR4_5_253a53alusyjjnb.R.inc(7216);lexer.nextToken(JSONToken.COMMA);
                    } }else {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7217);Object obj = this.parse();
                        __CLR4_5_253a53alusyjjnb.R.inc(7218);if ((((obj == null)&&(__CLR4_5_253a53alusyjjnb.R.iget(7219)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7220)==0&false))) {{
                            __CLR4_5_253a53alusyjjnb.R.inc(7221);value = null;
                        } }else {{
                            __CLR4_5_253a53alusyjjnb.R.inc(7222);value = obj.toString();
                        }
                    }}

                    }__CLR4_5_253a53alusyjjnb.R.inc(7223);array.add(value);
                } }else {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7224);Object val;
                    __CLR4_5_253a53alusyjjnb.R.inc(7225);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_5_253a53alusyjjnb.R.iget(7226)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7227)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7228);lexer.nextToken();
                        __CLR4_5_253a53alusyjjnb.R.inc(7229);val = null;
                    } }else {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7230);val = deserializer.deserialze(this, type, i);
                    }
                    }__CLR4_5_253a53alusyjjnb.R.inc(7231);array.add(val);
                    __CLR4_5_253a53alusyjjnb.R.inc(7232);checkListResolve(array);
                }

                }}__CLR4_5_253a53alusyjjnb.R.inc(7233);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_5_253a53alusyjjnb.R.iget(7234)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7235)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7236);lexer.nextToken(deserializer.getFastMatchToken());
                    __CLR4_5_253a53alusyjjnb.R.inc(7237);continue;
                }
            }}
        }} finally {
            __CLR4_5_253a53alusyjjnb.R.inc(7238);this.setContext(context);
        }

        __CLR4_5_253a53alusyjjnb.R.inc(7239);lexer.nextToken(JSONToken.COMMA);
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public Object[] parseArray(Type[] types) {try{__CLR4_5_253a53alusyjjnb.R.inc(7240);
        __CLR4_5_253a53alusyjjnb.R.inc(7241);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_5_253a53alusyjjnb.R.iget(7242)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7243)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7244);lexer.nextToken(JSONToken.COMMA);
            __CLR4_5_253a53alusyjjnb.R.inc(7245);return null;
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7246);if ((((lexer.token() != JSONToken.LBRACKET)&&(__CLR4_5_253a53alusyjjnb.R.iget(7247)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7248)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7249);throw new JSONException("syntax error : " + lexer.tokenName());
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7250);Object[] list = new Object[types.length];
        __CLR4_5_253a53alusyjjnb.R.inc(7251);if ((((types.length == 0)&&(__CLR4_5_253a53alusyjjnb.R.iget(7252)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7253)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7254);lexer.nextToken(JSONToken.RBRACKET);

            __CLR4_5_253a53alusyjjnb.R.inc(7255);if ((((lexer.token() != JSONToken.RBRACKET)&&(__CLR4_5_253a53alusyjjnb.R.iget(7256)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7257)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7258);throw new JSONException("syntax error");
            }

            }__CLR4_5_253a53alusyjjnb.R.inc(7259);lexer.nextToken(JSONToken.COMMA);
            __CLR4_5_253a53alusyjjnb.R.inc(7260);return new Object[0];
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7261);lexer.nextToken(JSONToken.LITERAL_INT);

        __CLR4_5_253a53alusyjjnb.R.inc(7262);for (int i = 0; (((i < types.length)&&(__CLR4_5_253a53alusyjjnb.R.iget(7263)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7264)==0&false)); ++i) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7265);Object value;

            __CLR4_5_253a53alusyjjnb.R.inc(7266);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_5_253a53alusyjjnb.R.iget(7267)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7268)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7269);value = null;
                __CLR4_5_253a53alusyjjnb.R.inc(7270);lexer.nextToken(JSONToken.COMMA);
            } }else {{
                __CLR4_5_253a53alusyjjnb.R.inc(7271);Type type = types[i];
                __CLR4_5_253a53alusyjjnb.R.inc(7272);if ((((type == int.class || type == Integer.class)&&(__CLR4_5_253a53alusyjjnb.R.iget(7273)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7274)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7275);if ((((lexer.token() == JSONToken.LITERAL_INT)&&(__CLR4_5_253a53alusyjjnb.R.iget(7276)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7277)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7278);value = Integer.valueOf(lexer.intValue());
                        __CLR4_5_253a53alusyjjnb.R.inc(7279);lexer.nextToken(JSONToken.COMMA);
                    } }else {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7280);value = this.parse();
                        __CLR4_5_253a53alusyjjnb.R.inc(7281);value = TypeUtils.cast(value, type, config);
                    }
                }} }else {__CLR4_5_253a53alusyjjnb.R.inc(7282);if ((((type == String.class)&&(__CLR4_5_253a53alusyjjnb.R.iget(7283)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7284)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7285);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_5_253a53alusyjjnb.R.iget(7286)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7287)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7288);value = lexer.stringVal();
                        __CLR4_5_253a53alusyjjnb.R.inc(7289);lexer.nextToken(JSONToken.COMMA);
                    } }else {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7290);value = this.parse();
                        __CLR4_5_253a53alusyjjnb.R.inc(7291);value = TypeUtils.cast(value, type, config);
                    }
                }} }else {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7292);boolean isArray = false;
                    __CLR4_5_253a53alusyjjnb.R.inc(7293);Class<?> componentType = null;
                    __CLR4_5_253a53alusyjjnb.R.inc(7294);if ((((i == types.length - 1)&&(__CLR4_5_253a53alusyjjnb.R.iget(7295)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7296)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7297);if ((((type instanceof Class)&&(__CLR4_5_253a53alusyjjnb.R.iget(7298)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7299)==0&false))) {{
                            __CLR4_5_253a53alusyjjnb.R.inc(7300);Class<?> clazz = (Class<?>) type;
                            //\u5982\u679c\u6700\u540e\u4e00\u4e2atype\u662f\u5b57\u8282\u6570\u7ec4\uff0c\u4e14\u5f53\u524dtoken\u4e3a\u5b57\u7b26\u4e32\u7c7b\u578b\uff0c\u4e0d\u5e94\u8be5\u5f53\u4f5c\u53ef\u53d8\u957f\u53c2\u6570\u8fdb\u884c\u5904\u7406
                            //\u800c\u662f\u4f5c\u4e3a\u4e00\u4e2a\u6574\u4f53\u7684Base64\u5b57\u7b26\u4e32\u8fdb\u884c\u53cd\u5e8f\u5217\u5316
                            __CLR4_5_253a53alusyjjnb.R.inc(7301);if ((((!((clazz == byte[].class || clazz == char[].class) && lexer.token() == LITERAL_STRING))&&(__CLR4_5_253a53alusyjjnb.R.iget(7302)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7303)==0&false))) {{
                                __CLR4_5_253a53alusyjjnb.R.inc(7304);isArray = clazz.isArray();
                                __CLR4_5_253a53alusyjjnb.R.inc(7305);componentType = clazz.getComponentType();
                            }
                        }}
                    }}

                    // support varArgs
                    }__CLR4_5_253a53alusyjjnb.R.inc(7306);if ((((isArray && lexer.token() != JSONToken.LBRACKET)&&(__CLR4_5_253a53alusyjjnb.R.iget(7307)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7308)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7309);List<Object> varList = new ArrayList<Object>();

                        __CLR4_5_253a53alusyjjnb.R.inc(7310);ObjectDeserializer deserializer = config.getDeserializer(componentType);
                        __CLR4_5_253a53alusyjjnb.R.inc(7311);int fastMatch = deserializer.getFastMatchToken();

                        __CLR4_5_253a53alusyjjnb.R.inc(7312);if ((((lexer.token() != JSONToken.RBRACKET)&&(__CLR4_5_253a53alusyjjnb.R.iget(7313)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7314)==0&false))) {{
                            __CLR4_5_253a53alusyjjnb.R.inc(7315);for (;;) {{
                                __CLR4_5_253a53alusyjjnb.R.inc(7316);Object item = deserializer.deserialze(this, type, null);
                                __CLR4_5_253a53alusyjjnb.R.inc(7317);varList.add(item);

                                __CLR4_5_253a53alusyjjnb.R.inc(7318);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_5_253a53alusyjjnb.R.iget(7319)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7320)==0&false))) {{
                                    __CLR4_5_253a53alusyjjnb.R.inc(7321);lexer.nextToken(fastMatch);
                                } }else {__CLR4_5_253a53alusyjjnb.R.inc(7322);if ((((lexer.token() == JSONToken.RBRACKET)&&(__CLR4_5_253a53alusyjjnb.R.iget(7323)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7324)==0&false))) {{
                                    __CLR4_5_253a53alusyjjnb.R.inc(7325);break;
                                } }else {{
                                    __CLR4_5_253a53alusyjjnb.R.inc(7326);throw new JSONException("syntax error :" + JSONToken.name(lexer.token()));
                                }
                            }}}
                        }}

                        }__CLR4_5_253a53alusyjjnb.R.inc(7327);value = TypeUtils.cast(varList, type, config);
                    } }else {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7328);ObjectDeserializer deserializer = config.getDeserializer(type);
                        __CLR4_5_253a53alusyjjnb.R.inc(7329);value = deserializer.deserialze(this, type, i);
                    }
                }}
            }}}
            }__CLR4_5_253a53alusyjjnb.R.inc(7330);list[i] = value;

            __CLR4_5_253a53alusyjjnb.R.inc(7331);if ((((lexer.token() == JSONToken.RBRACKET)&&(__CLR4_5_253a53alusyjjnb.R.iget(7332)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7333)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7334);break;
            }

            }__CLR4_5_253a53alusyjjnb.R.inc(7335);if ((((lexer.token() != JSONToken.COMMA)&&(__CLR4_5_253a53alusyjjnb.R.iget(7336)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7337)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7338);throw new JSONException("syntax error :" + JSONToken.name(lexer.token()));
            }

            }__CLR4_5_253a53alusyjjnb.R.inc(7339);if ((((i == types.length - 1)&&(__CLR4_5_253a53alusyjjnb.R.iget(7340)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7341)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7342);lexer.nextToken(JSONToken.RBRACKET);
            } }else {{
                __CLR4_5_253a53alusyjjnb.R.inc(7343);lexer.nextToken(JSONToken.LITERAL_INT);
            }
        }}

        }__CLR4_5_253a53alusyjjnb.R.inc(7344);if ((((lexer.token() != JSONToken.RBRACKET)&&(__CLR4_5_253a53alusyjjnb.R.iget(7345)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7346)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7347);throw new JSONException("syntax error");
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7348);lexer.nextToken(JSONToken.COMMA);

        __CLR4_5_253a53alusyjjnb.R.inc(7349);return list;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public void parseObject(Object object) {try{__CLR4_5_253a53alusyjjnb.R.inc(7350);
        __CLR4_5_253a53alusyjjnb.R.inc(7351);Class<?> clazz = object.getClass();
        __CLR4_5_253a53alusyjjnb.R.inc(7352);JavaBeanDeserializer beanDeser = null;
        __CLR4_5_253a53alusyjjnb.R.inc(7353);ObjectDeserializer deserializer = config.getDeserializer(clazz);
        __CLR4_5_253a53alusyjjnb.R.inc(7354);if ((((deserializer instanceof JavaBeanDeserializer)&&(__CLR4_5_253a53alusyjjnb.R.iget(7355)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7356)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7357);beanDeser = (JavaBeanDeserializer) deserializer;
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7358);if ((((lexer.token() != JSONToken.LBRACE && lexer.token() != JSONToken.COMMA)&&(__CLR4_5_253a53alusyjjnb.R.iget(7359)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7360)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7361);throw new JSONException("syntax error, expect {, actual " + lexer.tokenName());
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7362);for (;;) {{
            // lexer.scanSymbol
            __CLR4_5_253a53alusyjjnb.R.inc(7363);String key = lexer.scanSymbol(symbolTable);

            __CLR4_5_253a53alusyjjnb.R.inc(7364);if ((((key == null)&&(__CLR4_5_253a53alusyjjnb.R.iget(7365)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7366)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7367);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_5_253a53alusyjjnb.R.iget(7368)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7369)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7370);lexer.nextToken(JSONToken.COMMA);
                    __CLR4_5_253a53alusyjjnb.R.inc(7371);break;
                }
                }__CLR4_5_253a53alusyjjnb.R.inc(7372);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_5_253a53alusyjjnb.R.iget(7373)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7374)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7375);if ((((lexer.isEnabled(Feature.AllowArbitraryCommas))&&(__CLR4_5_253a53alusyjjnb.R.iget(7376)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7377)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7378);continue;
                    }
                }}
            }}

            }__CLR4_5_253a53alusyjjnb.R.inc(7379);FieldDeserializer fieldDeser = null;
            __CLR4_5_253a53alusyjjnb.R.inc(7380);if ((((beanDeser != null)&&(__CLR4_5_253a53alusyjjnb.R.iget(7381)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7382)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7383);fieldDeser = beanDeser.getFieldDeserializer(key);
            }

            }__CLR4_5_253a53alusyjjnb.R.inc(7384);if ((((fieldDeser == null)&&(__CLR4_5_253a53alusyjjnb.R.iget(7385)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7386)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7387);if ((((!lexer.isEnabled(Feature.IgnoreNotMatch))&&(__CLR4_5_253a53alusyjjnb.R.iget(7388)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7389)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7390);throw new JSONException("setter not found, class " + clazz.getName() + ", property " + key);
                }

                }__CLR4_5_253a53alusyjjnb.R.inc(7391);lexer.nextTokenWithColon();
                __CLR4_5_253a53alusyjjnb.R.inc(7392);parse(); // skip

                __CLR4_5_253a53alusyjjnb.R.inc(7393);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_5_253a53alusyjjnb.R.iget(7394)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7395)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7396);lexer.nextToken();
                    __CLR4_5_253a53alusyjjnb.R.inc(7397);return;
                }

                }__CLR4_5_253a53alusyjjnb.R.inc(7398);continue;
            } }else {{
                __CLR4_5_253a53alusyjjnb.R.inc(7399);Class<?> fieldClass = fieldDeser.fieldInfo.fieldClass;
                __CLR4_5_253a53alusyjjnb.R.inc(7400);Type fieldType = fieldDeser.fieldInfo.fieldType;
                __CLR4_5_253a53alusyjjnb.R.inc(7401);Object fieldValue;
                __CLR4_5_253a53alusyjjnb.R.inc(7402);if ((((fieldClass == int.class)&&(__CLR4_5_253a53alusyjjnb.R.iget(7403)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7404)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7405);lexer.nextTokenWithColon(JSONToken.LITERAL_INT);
                    __CLR4_5_253a53alusyjjnb.R.inc(7406);fieldValue = IntegerCodec.instance.deserialze(this, fieldType, null);
                } }else {__CLR4_5_253a53alusyjjnb.R.inc(7407);if ((((fieldClass == String.class)&&(__CLR4_5_253a53alusyjjnb.R.iget(7408)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7409)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7410);lexer.nextTokenWithColon(JSONToken.LITERAL_STRING);
                    __CLR4_5_253a53alusyjjnb.R.inc(7411);fieldValue = StringCodec.deserialze(this);
                } }else {__CLR4_5_253a53alusyjjnb.R.inc(7412);if ((((fieldClass == long.class)&&(__CLR4_5_253a53alusyjjnb.R.iget(7413)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7414)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7415);lexer.nextTokenWithColon(JSONToken.LITERAL_INT);
                    __CLR4_5_253a53alusyjjnb.R.inc(7416);fieldValue = LongCodec.instance.deserialze(this, fieldType, null);
                } }else {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7417);ObjectDeserializer fieldValueDeserializer = config.getDeserializer(fieldClass, fieldType);

                    __CLR4_5_253a53alusyjjnb.R.inc(7418);lexer.nextTokenWithColon(fieldValueDeserializer.getFastMatchToken());
                    __CLR4_5_253a53alusyjjnb.R.inc(7419);fieldValue = fieldValueDeserializer.deserialze(this, fieldType, null);
                }

                }}}__CLR4_5_253a53alusyjjnb.R.inc(7420);fieldDeser.setValue(object, fieldValue);
            }

            }__CLR4_5_253a53alusyjjnb.R.inc(7421);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_5_253a53alusyjjnb.R.iget(7422)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7423)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7424);continue;
            }

            }__CLR4_5_253a53alusyjjnb.R.inc(7425);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_5_253a53alusyjjnb.R.iget(7426)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7427)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7428);lexer.nextToken(JSONToken.COMMA);
                __CLR4_5_253a53alusyjjnb.R.inc(7429);return;
            }
        }}
    }}finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public Object parseArrayWithType(Type collectionType) {try{__CLR4_5_253a53alusyjjnb.R.inc(7430);
        __CLR4_5_253a53alusyjjnb.R.inc(7431);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_5_253a53alusyjjnb.R.iget(7432)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7433)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7434);lexer.nextToken();
            __CLR4_5_253a53alusyjjnb.R.inc(7435);return null;
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7436);Type[] actualTypes = ((ParameterizedType) collectionType).getActualTypeArguments();

        __CLR4_5_253a53alusyjjnb.R.inc(7437);if ((((actualTypes.length != 1)&&(__CLR4_5_253a53alusyjjnb.R.iget(7438)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7439)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7440);throw new JSONException("not support type " + collectionType);
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7441);Type actualTypeArgument = actualTypes[0];

        __CLR4_5_253a53alusyjjnb.R.inc(7442);if ((((actualTypeArgument instanceof Class)&&(__CLR4_5_253a53alusyjjnb.R.iget(7443)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7444)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7445);List<Object> array = new ArrayList<Object>();
            __CLR4_5_253a53alusyjjnb.R.inc(7446);this.parseArray((Class<?>) actualTypeArgument, array);
            __CLR4_5_253a53alusyjjnb.R.inc(7447);return array;
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7448);if ((((actualTypeArgument instanceof WildcardType)&&(__CLR4_5_253a53alusyjjnb.R.iget(7449)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7450)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7451);WildcardType wildcardType = (WildcardType) actualTypeArgument;

            // assert wildcardType.getUpperBounds().length == 1;
            __CLR4_5_253a53alusyjjnb.R.inc(7452);Type upperBoundType = wildcardType.getUpperBounds()[0];

            // assert upperBoundType instanceof Class;
            __CLR4_5_253a53alusyjjnb.R.inc(7453);if ((((Object.class.equals(upperBoundType))&&(__CLR4_5_253a53alusyjjnb.R.iget(7454)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7455)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7456);if ((((wildcardType.getLowerBounds().length == 0)&&(__CLR4_5_253a53alusyjjnb.R.iget(7457)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7458)==0&false))) {{
                    // Collection<?>
                    __CLR4_5_253a53alusyjjnb.R.inc(7459);return parse();
                } }else {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7460);throw new JSONException("not support type : " + collectionType);
                }
            }}

            }__CLR4_5_253a53alusyjjnb.R.inc(7461);List<Object> array = new ArrayList<Object>();
            __CLR4_5_253a53alusyjjnb.R.inc(7462);this.parseArray((Class<?>) upperBoundType, array);
            __CLR4_5_253a53alusyjjnb.R.inc(7463);return array;

            // throw new JSONException("not support type : " +
            // collectionType);return parse();
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7464);if ((((actualTypeArgument instanceof TypeVariable)&&(__CLR4_5_253a53alusyjjnb.R.iget(7465)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7466)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7467);TypeVariable<?> typeVariable = (TypeVariable<?>) actualTypeArgument;
            __CLR4_5_253a53alusyjjnb.R.inc(7468);Type[] bounds = typeVariable.getBounds();

            __CLR4_5_253a53alusyjjnb.R.inc(7469);if ((((bounds.length != 1)&&(__CLR4_5_253a53alusyjjnb.R.iget(7470)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7471)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7472);throw new JSONException("not support : " + typeVariable);
            }

            }__CLR4_5_253a53alusyjjnb.R.inc(7473);Type boundType = bounds[0];
            __CLR4_5_253a53alusyjjnb.R.inc(7474);if ((((boundType instanceof Class)&&(__CLR4_5_253a53alusyjjnb.R.iget(7475)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7476)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7477);List<Object> array = new ArrayList<Object>();
                __CLR4_5_253a53alusyjjnb.R.inc(7478);this.parseArray((Class<?>) boundType, array);
                __CLR4_5_253a53alusyjjnb.R.inc(7479);return array;
            }
        }}

        }__CLR4_5_253a53alusyjjnb.R.inc(7480);if ((((actualTypeArgument instanceof ParameterizedType)&&(__CLR4_5_253a53alusyjjnb.R.iget(7481)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7482)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7483);ParameterizedType parameterizedType = (ParameterizedType) actualTypeArgument;

            __CLR4_5_253a53alusyjjnb.R.inc(7484);List<Object> array = new ArrayList<Object>();
            __CLR4_5_253a53alusyjjnb.R.inc(7485);this.parseArray(parameterizedType, array);
            __CLR4_5_253a53alusyjjnb.R.inc(7486);return array;
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7487);throw new JSONException("TODO : " + collectionType);
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public void acceptType(String typeName) {try{__CLR4_5_253a53alusyjjnb.R.inc(7488);
        __CLR4_5_253a53alusyjjnb.R.inc(7489);JSONLexer lexer = this.lexer;

        __CLR4_5_253a53alusyjjnb.R.inc(7490);lexer.nextTokenWithColon();

        __CLR4_5_253a53alusyjjnb.R.inc(7491);if ((((lexer.token() != JSONToken.LITERAL_STRING)&&(__CLR4_5_253a53alusyjjnb.R.iget(7492)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7493)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7494);throw new JSONException("type not match error");
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7495);if ((((typeName.equals(lexer.stringVal()))&&(__CLR4_5_253a53alusyjjnb.R.iget(7496)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7497)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7498);lexer.nextToken();
            __CLR4_5_253a53alusyjjnb.R.inc(7499);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_5_253a53alusyjjnb.R.iget(7500)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7501)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7502);lexer.nextToken();
            }
        }} }else {{
            __CLR4_5_253a53alusyjjnb.R.inc(7503);throw new JSONException("type not match error");
        }
    }}finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public int getResolveStatus() {try{__CLR4_5_253a53alusyjjnb.R.inc(7504);
        __CLR4_5_253a53alusyjjnb.R.inc(7505);return resolveStatus;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public void setResolveStatus(int resolveStatus) {try{__CLR4_5_253a53alusyjjnb.R.inc(7506);
        __CLR4_5_253a53alusyjjnb.R.inc(7507);this.resolveStatus = resolveStatus;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public Object getObject(String path) {try{__CLR4_5_253a53alusyjjnb.R.inc(7508);
        __CLR4_5_253a53alusyjjnb.R.inc(7509);for (int i = 0; (((i < contextArrayIndex)&&(__CLR4_5_253a53alusyjjnb.R.iget(7510)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7511)==0&false)); ++i) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7512);if ((((path.equals(contextArray[i].toString()))&&(__CLR4_5_253a53alusyjjnb.R.iget(7513)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7514)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7515);return contextArray[i].object;
            }
        }}

        }__CLR4_5_253a53alusyjjnb.R.inc(7516);return null;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    @SuppressWarnings("rawtypes")
    public void checkListResolve(Collection array) {try{__CLR4_5_253a53alusyjjnb.R.inc(7517);
        __CLR4_5_253a53alusyjjnb.R.inc(7518);if ((((resolveStatus == NeedToResolve)&&(__CLR4_5_253a53alusyjjnb.R.iget(7519)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7520)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7521);if ((((array instanceof List)&&(__CLR4_5_253a53alusyjjnb.R.iget(7522)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7523)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7524);final int index = array.size() - 1;
                __CLR4_5_253a53alusyjjnb.R.inc(7525);final List list = (List) array;
                __CLR4_5_253a53alusyjjnb.R.inc(7526);ResolveTask task = getLastResolveTask();
                __CLR4_5_253a53alusyjjnb.R.inc(7527);task.fieldDeserializer = new ResolveFieldDeserializer(this, list, index);
                __CLR4_5_253a53alusyjjnb.R.inc(7528);task.ownerContext = context;
                __CLR4_5_253a53alusyjjnb.R.inc(7529);setResolveStatus(DefaultJSONParser.NONE);
            } }else {{
                __CLR4_5_253a53alusyjjnb.R.inc(7530);ResolveTask task = getLastResolveTask();
                __CLR4_5_253a53alusyjjnb.R.inc(7531);task.fieldDeserializer  = new ResolveFieldDeserializer(array);
                __CLR4_5_253a53alusyjjnb.R.inc(7532);task.ownerContext = context;
                __CLR4_5_253a53alusyjjnb.R.inc(7533);setResolveStatus(DefaultJSONParser.NONE);
            }
        }}
    }}finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    @SuppressWarnings("rawtypes")
    public void checkMapResolve(Map object, Object fieldName) {try{__CLR4_5_253a53alusyjjnb.R.inc(7534);
        __CLR4_5_253a53alusyjjnb.R.inc(7535);if ((((resolveStatus == NeedToResolve)&&(__CLR4_5_253a53alusyjjnb.R.iget(7536)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7537)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7538);ResolveFieldDeserializer fieldResolver = new ResolveFieldDeserializer(object, fieldName);
            __CLR4_5_253a53alusyjjnb.R.inc(7539);ResolveTask task = getLastResolveTask();
            __CLR4_5_253a53alusyjjnb.R.inc(7540);task.fieldDeserializer = fieldResolver;
            __CLR4_5_253a53alusyjjnb.R.inc(7541);task.ownerContext = context;
            __CLR4_5_253a53alusyjjnb.R.inc(7542);setResolveStatus(DefaultJSONParser.NONE);
        }
    }}finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    @SuppressWarnings("rawtypes")
    public Object parseObject(final Map object) {try{__CLR4_5_253a53alusyjjnb.R.inc(7543);
        __CLR4_5_253a53alusyjjnb.R.inc(7544);return parseObject(object, null);
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public JSONObject parseObject() {try{__CLR4_5_253a53alusyjjnb.R.inc(7545);
        __CLR4_5_253a53alusyjjnb.R.inc(7546);JSONObject object = new JSONObject(lexer.isEnabled(Feature.OrderedField));
        __CLR4_5_253a53alusyjjnb.R.inc(7547);Object parsedObject = parseObject(object);

        __CLR4_5_253a53alusyjjnb.R.inc(7548);if ((((parsedObject instanceof JSONObject)&&(__CLR4_5_253a53alusyjjnb.R.iget(7549)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7550)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7551);return (JSONObject) parsedObject;
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7552);if ((((parsedObject == null)&&(__CLR4_5_253a53alusyjjnb.R.iget(7553)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7554)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7555);return null;
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7556);return new JSONObject((Map) parsedObject);
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    @SuppressWarnings("rawtypes")
    public final void parseArray(final Collection array) {try{__CLR4_5_253a53alusyjjnb.R.inc(7557);
        __CLR4_5_253a53alusyjjnb.R.inc(7558);parseArray(array, null);
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public final void parseArray(final Collection array, Object fieldName) {try{__CLR4_5_253a53alusyjjnb.R.inc(7559);
        __CLR4_5_253a53alusyjjnb.R.inc(7560);final JSONLexer lexer = this.lexer;

        __CLR4_5_253a53alusyjjnb.R.inc(7561);if ((((lexer.token() == JSONToken.SET || lexer.token() == JSONToken.TREE_SET)&&(__CLR4_5_253a53alusyjjnb.R.iget(7562)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7563)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7564);lexer.nextToken();
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7565);if ((((lexer.token() != JSONToken.LBRACKET)&&(__CLR4_5_253a53alusyjjnb.R.iget(7566)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7567)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7568);throw new JSONException("syntax error, expect [, actual " + JSONToken.name(lexer.token()) + ", pos "
                                    + lexer.pos() + ", fieldName " + fieldName);
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7569);lexer.nextToken(JSONToken.LITERAL_STRING);

        __CLR4_5_253a53alusyjjnb.R.inc(7570);ParseContext context = this.context;
        __CLR4_5_253a53alusyjjnb.R.inc(7571);this.setContext(array, fieldName);
        __CLR4_5_253a53alusyjjnb.R.inc(7572);try {
            __CLR4_5_253a53alusyjjnb.R.inc(7573);for (int i = 0;; ++i) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7574);if ((((lexer.isEnabled(Feature.AllowArbitraryCommas))&&(__CLR4_5_253a53alusyjjnb.R.iget(7575)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7576)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7577);while ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_5_253a53alusyjjnb.R.iget(7578)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7579)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7580);lexer.nextToken();
                        __CLR4_5_253a53alusyjjnb.R.inc(7581);continue;
                    }
                }}

                }__CLR4_5_253a53alusyjjnb.R.inc(7582);Object value;
                boolean __CLB4_5_2_bool0=false;__CLR4_5_253a53alusyjjnb.R.inc(7583);switch (lexer.token()) {
                    case LITERAL_INT:if (!__CLB4_5_2_bool0) {__CLR4_5_253a53alusyjjnb.R.inc(7584);__CLB4_5_2_bool0=true;}
                        __CLR4_5_253a53alusyjjnb.R.inc(7585);value = lexer.integerValue();
                        __CLR4_5_253a53alusyjjnb.R.inc(7586);lexer.nextToken(JSONToken.COMMA);
                        __CLR4_5_253a53alusyjjnb.R.inc(7587);break;
                    case LITERAL_FLOAT:if (!__CLB4_5_2_bool0) {__CLR4_5_253a53alusyjjnb.R.inc(7588);__CLB4_5_2_bool0=true;}
                        __CLR4_5_253a53alusyjjnb.R.inc(7589);if ((((lexer.isEnabled(Feature.UseBigDecimal))&&(__CLR4_5_253a53alusyjjnb.R.iget(7590)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7591)==0&false))) {{
                            __CLR4_5_253a53alusyjjnb.R.inc(7592);value = lexer.decimalValue(true);
                        } }else {{
                            __CLR4_5_253a53alusyjjnb.R.inc(7593);value = lexer.decimalValue(false);
                        }
                        }__CLR4_5_253a53alusyjjnb.R.inc(7594);lexer.nextToken(JSONToken.COMMA);
                        __CLR4_5_253a53alusyjjnb.R.inc(7595);break;
                    case LITERAL_STRING:if (!__CLB4_5_2_bool0) {__CLR4_5_253a53alusyjjnb.R.inc(7596);__CLB4_5_2_bool0=true;}
                        __CLR4_5_253a53alusyjjnb.R.inc(7597);String stringLiteral = lexer.stringVal();
                        __CLR4_5_253a53alusyjjnb.R.inc(7598);lexer.nextToken(JSONToken.COMMA);

                        __CLR4_5_253a53alusyjjnb.R.inc(7599);if ((((lexer.isEnabled(Feature.AllowISO8601DateFormat))&&(__CLR4_5_253a53alusyjjnb.R.iget(7600)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7601)==0&false))) {{
                            __CLR4_5_253a53alusyjjnb.R.inc(7602);JSONScanner iso8601Lexer = new JSONScanner(stringLiteral);
                            __CLR4_5_253a53alusyjjnb.R.inc(7603);if ((((iso8601Lexer.scanISO8601DateIfMatch())&&(__CLR4_5_253a53alusyjjnb.R.iget(7604)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7605)==0&false))) {{
                                __CLR4_5_253a53alusyjjnb.R.inc(7606);value = iso8601Lexer.getCalendar().getTime();
                            } }else {{
                                __CLR4_5_253a53alusyjjnb.R.inc(7607);value = stringLiteral;
                            }
                            }__CLR4_5_253a53alusyjjnb.R.inc(7608);iso8601Lexer.close();
                        } }else {{
                            __CLR4_5_253a53alusyjjnb.R.inc(7609);value = stringLiteral;
                        }

                        }__CLR4_5_253a53alusyjjnb.R.inc(7610);break;
                    case TRUE:if (!__CLB4_5_2_bool0) {__CLR4_5_253a53alusyjjnb.R.inc(7611);__CLB4_5_2_bool0=true;}
                        __CLR4_5_253a53alusyjjnb.R.inc(7612);value = Boolean.TRUE;
                        __CLR4_5_253a53alusyjjnb.R.inc(7613);lexer.nextToken(JSONToken.COMMA);
                        __CLR4_5_253a53alusyjjnb.R.inc(7614);break;
                    case FALSE:if (!__CLB4_5_2_bool0) {__CLR4_5_253a53alusyjjnb.R.inc(7615);__CLB4_5_2_bool0=true;}
                        __CLR4_5_253a53alusyjjnb.R.inc(7616);value = Boolean.FALSE;
                        __CLR4_5_253a53alusyjjnb.R.inc(7617);lexer.nextToken(JSONToken.COMMA);
                        __CLR4_5_253a53alusyjjnb.R.inc(7618);break;
                    case LBRACE:if (!__CLB4_5_2_bool0) {__CLR4_5_253a53alusyjjnb.R.inc(7619);__CLB4_5_2_bool0=true;}
                        __CLR4_5_253a53alusyjjnb.R.inc(7620);JSONObject object = new JSONObject(lexer.isEnabled(Feature.OrderedField));
                        __CLR4_5_253a53alusyjjnb.R.inc(7621);value = parseObject(object, i);
                        __CLR4_5_253a53alusyjjnb.R.inc(7622);break;
                    case LBRACKET:if (!__CLB4_5_2_bool0) {__CLR4_5_253a53alusyjjnb.R.inc(7623);__CLB4_5_2_bool0=true;}
                        __CLR4_5_253a53alusyjjnb.R.inc(7624);Collection items = new JSONArray();
                        __CLR4_5_253a53alusyjjnb.R.inc(7625);parseArray(items, i);
                        __CLR4_5_253a53alusyjjnb.R.inc(7626);if ((((lexer.isEnabled(Feature.UseObjectArray))&&(__CLR4_5_253a53alusyjjnb.R.iget(7627)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7628)==0&false))) {{
                            __CLR4_5_253a53alusyjjnb.R.inc(7629);value = items.toArray();
                        } }else {{
                            __CLR4_5_253a53alusyjjnb.R.inc(7630);value = items;
                        }
                        }__CLR4_5_253a53alusyjjnb.R.inc(7631);break;
                    case NULL:if (!__CLB4_5_2_bool0) {__CLR4_5_253a53alusyjjnb.R.inc(7632);__CLB4_5_2_bool0=true;}
                        __CLR4_5_253a53alusyjjnb.R.inc(7633);value = null;
                        __CLR4_5_253a53alusyjjnb.R.inc(7634);lexer.nextToken(JSONToken.LITERAL_STRING);
                        __CLR4_5_253a53alusyjjnb.R.inc(7635);break;
                    case UNDEFINED:if (!__CLB4_5_2_bool0) {__CLR4_5_253a53alusyjjnb.R.inc(7636);__CLB4_5_2_bool0=true;}
                        __CLR4_5_253a53alusyjjnb.R.inc(7637);value = null;
                        __CLR4_5_253a53alusyjjnb.R.inc(7638);lexer.nextToken(JSONToken.LITERAL_STRING);
                        __CLR4_5_253a53alusyjjnb.R.inc(7639);break;
                    case RBRACKET:if (!__CLB4_5_2_bool0) {__CLR4_5_253a53alusyjjnb.R.inc(7640);__CLB4_5_2_bool0=true;}
                        __CLR4_5_253a53alusyjjnb.R.inc(7641);lexer.nextToken(JSONToken.COMMA);
                        __CLR4_5_253a53alusyjjnb.R.inc(7642);return;
                    case EOF:if (!__CLB4_5_2_bool0) {__CLR4_5_253a53alusyjjnb.R.inc(7643);__CLB4_5_2_bool0=true;}
                        __CLR4_5_253a53alusyjjnb.R.inc(7644);throw new JSONException("unclosed jsonArray");
                    default:if (!__CLB4_5_2_bool0) {__CLR4_5_253a53alusyjjnb.R.inc(7645);__CLB4_5_2_bool0=true;}
                        __CLR4_5_253a53alusyjjnb.R.inc(7646);value = parse();
                        __CLR4_5_253a53alusyjjnb.R.inc(7647);break;
                }

                __CLR4_5_253a53alusyjjnb.R.inc(7648);array.add(value);
                __CLR4_5_253a53alusyjjnb.R.inc(7649);checkListResolve(array);

                __CLR4_5_253a53alusyjjnb.R.inc(7650);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_5_253a53alusyjjnb.R.iget(7651)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7652)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7653);lexer.nextToken(JSONToken.LITERAL_STRING);
                    __CLR4_5_253a53alusyjjnb.R.inc(7654);continue;
                }
            }}
        }} finally {
            __CLR4_5_253a53alusyjjnb.R.inc(7655);this.setContext(context);
        }
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public ParseContext getContext() {try{__CLR4_5_253a53alusyjjnb.R.inc(7656);
        __CLR4_5_253a53alusyjjnb.R.inc(7657);return context;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public List<ResolveTask> getResolveTaskList() {try{__CLR4_5_253a53alusyjjnb.R.inc(7658);
        __CLR4_5_253a53alusyjjnb.R.inc(7659);if ((((resolveTaskList == null)&&(__CLR4_5_253a53alusyjjnb.R.iget(7660)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7661)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7662);resolveTaskList = new ArrayList<ResolveTask>(2);
        }
        }__CLR4_5_253a53alusyjjnb.R.inc(7663);return resolveTaskList;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public void addResolveTask(ResolveTask task) {try{__CLR4_5_253a53alusyjjnb.R.inc(7664);
        __CLR4_5_253a53alusyjjnb.R.inc(7665);if ((((resolveTaskList == null)&&(__CLR4_5_253a53alusyjjnb.R.iget(7666)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7667)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7668);resolveTaskList = new ArrayList<ResolveTask>(2);
        }
        }__CLR4_5_253a53alusyjjnb.R.inc(7669);resolveTaskList.add(task);
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public ResolveTask getLastResolveTask() {try{__CLR4_5_253a53alusyjjnb.R.inc(7670);
        __CLR4_5_253a53alusyjjnb.R.inc(7671);return resolveTaskList.get(resolveTaskList.size() - 1);
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public List<ExtraProcessor> getExtraProcessors() {try{__CLR4_5_253a53alusyjjnb.R.inc(7672);
        __CLR4_5_253a53alusyjjnb.R.inc(7673);if ((((extraProcessors == null)&&(__CLR4_5_253a53alusyjjnb.R.iget(7674)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7675)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7676);extraProcessors = new ArrayList<ExtraProcessor>(2);
        }
        }__CLR4_5_253a53alusyjjnb.R.inc(7677);return extraProcessors;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public List<ExtraTypeProvider> getExtraTypeProviders() {try{__CLR4_5_253a53alusyjjnb.R.inc(7678);
        __CLR4_5_253a53alusyjjnb.R.inc(7679);if ((((extraTypeProviders == null)&&(__CLR4_5_253a53alusyjjnb.R.iget(7680)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7681)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7682);extraTypeProviders = new ArrayList<ExtraTypeProvider>(2);
        }
        }__CLR4_5_253a53alusyjjnb.R.inc(7683);return extraTypeProviders;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public FieldTypeResolver getFieldTypeResolver() {try{__CLR4_5_253a53alusyjjnb.R.inc(7684);
        __CLR4_5_253a53alusyjjnb.R.inc(7685);return fieldTypeResolver;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public void setFieldTypeResolver(FieldTypeResolver fieldTypeResolver) {try{__CLR4_5_253a53alusyjjnb.R.inc(7686);
        __CLR4_5_253a53alusyjjnb.R.inc(7687);this.fieldTypeResolver = fieldTypeResolver;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public void setContext(ParseContext context) {try{__CLR4_5_253a53alusyjjnb.R.inc(7688);
        __CLR4_5_253a53alusyjjnb.R.inc(7689);if ((((lexer.isEnabled(Feature.DisableCircularReferenceDetect))&&(__CLR4_5_253a53alusyjjnb.R.iget(7690)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7691)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7692);return;
        }
        }__CLR4_5_253a53alusyjjnb.R.inc(7693);this.context = context;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public void popContext() {try{__CLR4_5_253a53alusyjjnb.R.inc(7694);
        __CLR4_5_253a53alusyjjnb.R.inc(7695);if ((((lexer.isEnabled(Feature.DisableCircularReferenceDetect))&&(__CLR4_5_253a53alusyjjnb.R.iget(7696)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7697)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7698);return;
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7699);this.context = this.context.parent;

        __CLR4_5_253a53alusyjjnb.R.inc(7700);if ((((contextArrayIndex <= 0)&&(__CLR4_5_253a53alusyjjnb.R.iget(7701)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7702)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7703);return;
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7704);contextArrayIndex--;
        __CLR4_5_253a53alusyjjnb.R.inc(7705);contextArray[contextArrayIndex] = null;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public ParseContext setContext(Object object, Object fieldName) {try{__CLR4_5_253a53alusyjjnb.R.inc(7706);
        __CLR4_5_253a53alusyjjnb.R.inc(7707);if ((((lexer.isEnabled(Feature.DisableCircularReferenceDetect))&&(__CLR4_5_253a53alusyjjnb.R.iget(7708)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7709)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7710);return null;
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7711);return setContext(this.context, object, fieldName);
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public ParseContext setContext(ParseContext parent, Object object, Object fieldName) {try{__CLR4_5_253a53alusyjjnb.R.inc(7712);
        __CLR4_5_253a53alusyjjnb.R.inc(7713);if ((((lexer.isEnabled(Feature.DisableCircularReferenceDetect))&&(__CLR4_5_253a53alusyjjnb.R.iget(7714)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7715)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7716);return null;
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7717);this.context = new ParseContext(parent, object, fieldName);
        __CLR4_5_253a53alusyjjnb.R.inc(7718);addContext(this.context);

        __CLR4_5_253a53alusyjjnb.R.inc(7719);return this.context;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    private void addContext(ParseContext context) {try{__CLR4_5_253a53alusyjjnb.R.inc(7720);
        __CLR4_5_253a53alusyjjnb.R.inc(7721);int i = contextArrayIndex++;
        __CLR4_5_253a53alusyjjnb.R.inc(7722);if ((((contextArray == null)&&(__CLR4_5_253a53alusyjjnb.R.iget(7723)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7724)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7725);contextArray = new ParseContext[8];
        } }else {__CLR4_5_253a53alusyjjnb.R.inc(7726);if ((((i >= contextArray.length)&&(__CLR4_5_253a53alusyjjnb.R.iget(7727)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7728)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7729);int newLen = (contextArray.length * 3) / 2;
            __CLR4_5_253a53alusyjjnb.R.inc(7730);ParseContext[] newArray = new ParseContext[newLen];
            __CLR4_5_253a53alusyjjnb.R.inc(7731);System.arraycopy(contextArray, 0, newArray, 0, contextArray.length);
            __CLR4_5_253a53alusyjjnb.R.inc(7732);contextArray = newArray;
        }
        }}__CLR4_5_253a53alusyjjnb.R.inc(7733);contextArray[i] = context;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public Object parse() {try{__CLR4_5_253a53alusyjjnb.R.inc(7734);
        __CLR4_5_253a53alusyjjnb.R.inc(7735);return parse(null);
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public Object parseKey() {try{__CLR4_5_253a53alusyjjnb.R.inc(7736);
        __CLR4_5_253a53alusyjjnb.R.inc(7737);if ((((lexer.token() == JSONToken.IDENTIFIER)&&(__CLR4_5_253a53alusyjjnb.R.iget(7738)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7739)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7740);String value = lexer.stringVal();
            __CLR4_5_253a53alusyjjnb.R.inc(7741);lexer.nextToken(JSONToken.COMMA);
            __CLR4_5_253a53alusyjjnb.R.inc(7742);return value;
        }
        }__CLR4_5_253a53alusyjjnb.R.inc(7743);return parse(null);
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public Object parse(Object fieldName) {try{__CLR4_5_253a53alusyjjnb.R.inc(7744);
        __CLR4_5_253a53alusyjjnb.R.inc(7745);final JSONLexer lexer = this.lexer;
        boolean __CLB4_5_2_bool1=false;__CLR4_5_253a53alusyjjnb.R.inc(7746);switch (lexer.token()) {
            case SET:if (!__CLB4_5_2_bool1) {__CLR4_5_253a53alusyjjnb.R.inc(7747);__CLB4_5_2_bool1=true;}
                __CLR4_5_253a53alusyjjnb.R.inc(7748);lexer.nextToken();
                __CLR4_5_253a53alusyjjnb.R.inc(7749);HashSet<Object> set = new HashSet<Object>();
                __CLR4_5_253a53alusyjjnb.R.inc(7750);parseArray(set, fieldName);
                __CLR4_5_253a53alusyjjnb.R.inc(7751);return set;
            case TREE_SET:if (!__CLB4_5_2_bool1) {__CLR4_5_253a53alusyjjnb.R.inc(7752);__CLB4_5_2_bool1=true;}
                __CLR4_5_253a53alusyjjnb.R.inc(7753);lexer.nextToken();
                __CLR4_5_253a53alusyjjnb.R.inc(7754);TreeSet<Object> treeSet = new TreeSet<Object>();
                __CLR4_5_253a53alusyjjnb.R.inc(7755);parseArray(treeSet, fieldName);
                __CLR4_5_253a53alusyjjnb.R.inc(7756);return treeSet;
            case LBRACKET:if (!__CLB4_5_2_bool1) {__CLR4_5_253a53alusyjjnb.R.inc(7757);__CLB4_5_2_bool1=true;}
                __CLR4_5_253a53alusyjjnb.R.inc(7758);JSONArray array = new JSONArray();
                __CLR4_5_253a53alusyjjnb.R.inc(7759);parseArray(array, fieldName);
                __CLR4_5_253a53alusyjjnb.R.inc(7760);if ((((lexer.isEnabled(Feature.UseObjectArray))&&(__CLR4_5_253a53alusyjjnb.R.iget(7761)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7762)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7763);return array.toArray();
                }
                }__CLR4_5_253a53alusyjjnb.R.inc(7764);return array;
            case LBRACE:if (!__CLB4_5_2_bool1) {__CLR4_5_253a53alusyjjnb.R.inc(7765);__CLB4_5_2_bool1=true;}
                __CLR4_5_253a53alusyjjnb.R.inc(7766);JSONObject object = new JSONObject(lexer.isEnabled(Feature.OrderedField));
                __CLR4_5_253a53alusyjjnb.R.inc(7767);return parseObject(object, fieldName);
//            case LBRACE: {
//                Map<String, Object> map = lexer.isEnabled(Feature.OrderedField)
//                        ? new LinkedHashMap<String, Object>()
//                        : new HashMap<String, Object>();
//                Object obj = parseObject(map, fieldName);
//                if (obj != map) {
//                    return obj;
//                }
//                return new JSONObject(map);
//            }
            case LITERAL_INT:if (!__CLB4_5_2_bool1) {__CLR4_5_253a53alusyjjnb.R.inc(7768);__CLB4_5_2_bool1=true;}
                __CLR4_5_253a53alusyjjnb.R.inc(7769);Number intValue = lexer.integerValue();
                __CLR4_5_253a53alusyjjnb.R.inc(7770);lexer.nextToken();
                __CLR4_5_253a53alusyjjnb.R.inc(7771);return intValue;
            case LITERAL_FLOAT:if (!__CLB4_5_2_bool1) {__CLR4_5_253a53alusyjjnb.R.inc(7772);__CLB4_5_2_bool1=true;}
                __CLR4_5_253a53alusyjjnb.R.inc(7773);Object value = lexer.decimalValue(lexer.isEnabled(Feature.UseBigDecimal));
                __CLR4_5_253a53alusyjjnb.R.inc(7774);lexer.nextToken();
                __CLR4_5_253a53alusyjjnb.R.inc(7775);return value;
            case LITERAL_STRING:if (!__CLB4_5_2_bool1) {__CLR4_5_253a53alusyjjnb.R.inc(7776);__CLB4_5_2_bool1=true;}
                __CLR4_5_253a53alusyjjnb.R.inc(7777);String stringLiteral = lexer.stringVal();
                __CLR4_5_253a53alusyjjnb.R.inc(7778);lexer.nextToken(JSONToken.COMMA);

                __CLR4_5_253a53alusyjjnb.R.inc(7779);if ((((lexer.isEnabled(Feature.AllowISO8601DateFormat))&&(__CLR4_5_253a53alusyjjnb.R.iget(7780)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7781)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7782);JSONScanner iso8601Lexer = new JSONScanner(stringLiteral);
                    __CLR4_5_253a53alusyjjnb.R.inc(7783);try {
                        __CLR4_5_253a53alusyjjnb.R.inc(7784);if ((((iso8601Lexer.scanISO8601DateIfMatch())&&(__CLR4_5_253a53alusyjjnb.R.iget(7785)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7786)==0&false))) {{
                            __CLR4_5_253a53alusyjjnb.R.inc(7787);return iso8601Lexer.getCalendar().getTime();
                        }
                    }} finally {
                        __CLR4_5_253a53alusyjjnb.R.inc(7788);iso8601Lexer.close();
                    }
                }

                }__CLR4_5_253a53alusyjjnb.R.inc(7789);return stringLiteral;
            case NULL:if (!__CLB4_5_2_bool1) {__CLR4_5_253a53alusyjjnb.R.inc(7790);__CLB4_5_2_bool1=true;}
                __CLR4_5_253a53alusyjjnb.R.inc(7791);lexer.nextToken();
                __CLR4_5_253a53alusyjjnb.R.inc(7792);return null;
            case UNDEFINED:if (!__CLB4_5_2_bool1) {__CLR4_5_253a53alusyjjnb.R.inc(7793);__CLB4_5_2_bool1=true;}
                __CLR4_5_253a53alusyjjnb.R.inc(7794);lexer.nextToken();
                __CLR4_5_253a53alusyjjnb.R.inc(7795);return null;
            case TRUE:if (!__CLB4_5_2_bool1) {__CLR4_5_253a53alusyjjnb.R.inc(7796);__CLB4_5_2_bool1=true;}
                __CLR4_5_253a53alusyjjnb.R.inc(7797);lexer.nextToken();
                __CLR4_5_253a53alusyjjnb.R.inc(7798);return Boolean.TRUE;
            case FALSE:if (!__CLB4_5_2_bool1) {__CLR4_5_253a53alusyjjnb.R.inc(7799);__CLB4_5_2_bool1=true;}
                __CLR4_5_253a53alusyjjnb.R.inc(7800);lexer.nextToken();
                __CLR4_5_253a53alusyjjnb.R.inc(7801);return Boolean.FALSE;
            case NEW:if (!__CLB4_5_2_bool1) {__CLR4_5_253a53alusyjjnb.R.inc(7802);__CLB4_5_2_bool1=true;}
                __CLR4_5_253a53alusyjjnb.R.inc(7803);lexer.nextToken(JSONToken.IDENTIFIER);

                __CLR4_5_253a53alusyjjnb.R.inc(7804);if ((((lexer.token() != JSONToken.IDENTIFIER)&&(__CLR4_5_253a53alusyjjnb.R.iget(7805)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7806)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7807);throw new JSONException("syntax error");
                }
                }__CLR4_5_253a53alusyjjnb.R.inc(7808);lexer.nextToken(JSONToken.LPAREN);

                __CLR4_5_253a53alusyjjnb.R.inc(7809);accept(JSONToken.LPAREN);
                __CLR4_5_253a53alusyjjnb.R.inc(7810);long time = lexer.integerValue().longValue();
                __CLR4_5_253a53alusyjjnb.R.inc(7811);accept(JSONToken.LITERAL_INT);

                __CLR4_5_253a53alusyjjnb.R.inc(7812);accept(JSONToken.RPAREN);

                __CLR4_5_253a53alusyjjnb.R.inc(7813);return new Date(time);
            case EOF:if (!__CLB4_5_2_bool1) {__CLR4_5_253a53alusyjjnb.R.inc(7814);__CLB4_5_2_bool1=true;}
                __CLR4_5_253a53alusyjjnb.R.inc(7815);if ((((lexer.isBlankInput())&&(__CLR4_5_253a53alusyjjnb.R.iget(7816)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7817)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7818);return null;
                }
                }__CLR4_5_253a53alusyjjnb.R.inc(7819);throw new JSONException("unterminated json string, " + lexer.info());
            case HEX:if (!__CLB4_5_2_bool1) {__CLR4_5_253a53alusyjjnb.R.inc(7820);__CLB4_5_2_bool1=true;}
                __CLR4_5_253a53alusyjjnb.R.inc(7821);byte[] bytes = lexer.bytesValue();
                __CLR4_5_253a53alusyjjnb.R.inc(7822);lexer.nextToken();
                __CLR4_5_253a53alusyjjnb.R.inc(7823);return bytes;
            case IDENTIFIER:if (!__CLB4_5_2_bool1) {__CLR4_5_253a53alusyjjnb.R.inc(7824);__CLB4_5_2_bool1=true;}
                __CLR4_5_253a53alusyjjnb.R.inc(7825);String identifier = lexer.stringVal();
                __CLR4_5_253a53alusyjjnb.R.inc(7826);if (((("NaN".equals(identifier))&&(__CLR4_5_253a53alusyjjnb.R.iget(7827)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7828)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7829);lexer.nextToken();
                    __CLR4_5_253a53alusyjjnb.R.inc(7830);return null;
                }
                }__CLR4_5_253a53alusyjjnb.R.inc(7831);throw new JSONException("syntax error, " + lexer.info());
            case ERROR:if (!__CLB4_5_2_bool1) {__CLR4_5_253a53alusyjjnb.R.inc(7832);__CLB4_5_2_bool1=true;}
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_253a53alusyjjnb.R.inc(7833);__CLB4_5_2_bool1=true;}
                __CLR4_5_253a53alusyjjnb.R.inc(7834);throw new JSONException("syntax error, " + lexer.info());
        }
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public void config(Feature feature, boolean state) {try{__CLR4_5_253a53alusyjjnb.R.inc(7835);
        __CLR4_5_253a53alusyjjnb.R.inc(7836);this.lexer.config(feature, state);
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public boolean isEnabled(Feature feature) {try{__CLR4_5_253a53alusyjjnb.R.inc(7837);
        __CLR4_5_253a53alusyjjnb.R.inc(7838);return lexer.isEnabled(feature);
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public JSONLexer getLexer() {try{__CLR4_5_253a53alusyjjnb.R.inc(7839);
        __CLR4_5_253a53alusyjjnb.R.inc(7840);return lexer;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public final void accept(final int token) {try{__CLR4_5_253a53alusyjjnb.R.inc(7841);
        __CLR4_5_253a53alusyjjnb.R.inc(7842);final JSONLexer lexer = this.lexer;
        __CLR4_5_253a53alusyjjnb.R.inc(7843);if ((((lexer.token() == token)&&(__CLR4_5_253a53alusyjjnb.R.iget(7844)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7845)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7846);lexer.nextToken();
        } }else {{
            __CLR4_5_253a53alusyjjnb.R.inc(7847);throw new JSONException("syntax error, expect " + JSONToken.name(token) + ", actual "
                                    + JSONToken.name(lexer.token()));
        }
    }}finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public final void accept(final int token, int nextExpectToken) {try{__CLR4_5_253a53alusyjjnb.R.inc(7848);
        __CLR4_5_253a53alusyjjnb.R.inc(7849);final JSONLexer lexer = this.lexer;
        __CLR4_5_253a53alusyjjnb.R.inc(7850);if ((((lexer.token() == token)&&(__CLR4_5_253a53alusyjjnb.R.iget(7851)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7852)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7853);lexer.nextToken(nextExpectToken);
        } }else {{
            __CLR4_5_253a53alusyjjnb.R.inc(7854);throwException(token);
        }
    }}finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public void throwException(int token) {try{__CLR4_5_253a53alusyjjnb.R.inc(7855);
        __CLR4_5_253a53alusyjjnb.R.inc(7856);throw new JSONException("syntax error, expect " + JSONToken.name(token) + ", actual "
                                + JSONToken.name(lexer.token()));
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public void close() {try{__CLR4_5_253a53alusyjjnb.R.inc(7857);
        __CLR4_5_253a53alusyjjnb.R.inc(7858);final JSONLexer lexer = this.lexer;

        __CLR4_5_253a53alusyjjnb.R.inc(7859);try {
            __CLR4_5_253a53alusyjjnb.R.inc(7860);if ((((lexer.isEnabled(Feature.AutoCloseSource))&&(__CLR4_5_253a53alusyjjnb.R.iget(7861)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7862)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7863);if ((((lexer.token() != JSONToken.EOF)&&(__CLR4_5_253a53alusyjjnb.R.iget(7864)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7865)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7866);throw new JSONException("not close json text, token : " + JSONToken.name(lexer.token()));
                }
            }}
        }} finally {
            __CLR4_5_253a53alusyjjnb.R.inc(7867);lexer.close();
        }
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public Object resolveReference(String ref) {try{__CLR4_5_253a53alusyjjnb.R.inc(7868);
        __CLR4_5_253a53alusyjjnb.R.inc(7869);if((((contextArray == null)&&(__CLR4_5_253a53alusyjjnb.R.iget(7870)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7871)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7872);return null;
        }
        }__CLR4_5_253a53alusyjjnb.R.inc(7873);for (int i = 0; (((i < contextArray.length && i < contextArrayIndex)&&(__CLR4_5_253a53alusyjjnb.R.iget(7874)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7875)==0&false)); i++) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7876);ParseContext context = contextArray[i];
            __CLR4_5_253a53alusyjjnb.R.inc(7877);if ((((context.toString().equals(ref))&&(__CLR4_5_253a53alusyjjnb.R.iget(7878)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7879)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7880);return context.object;
            }
        }}
        }__CLR4_5_253a53alusyjjnb.R.inc(7881);return null;
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public void handleResovleTask(Object value) {try{__CLR4_5_253a53alusyjjnb.R.inc(7882);
        __CLR4_5_253a53alusyjjnb.R.inc(7883);if ((((resolveTaskList == null)&&(__CLR4_5_253a53alusyjjnb.R.iget(7884)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7885)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7886);return;
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7887);for (int i = 0, size = resolveTaskList.size(); (((i < size)&&(__CLR4_5_253a53alusyjjnb.R.iget(7888)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7889)==0&false)); ++i) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7890);ResolveTask task = resolveTaskList.get(i);
            __CLR4_5_253a53alusyjjnb.R.inc(7891);String ref = task.referenceValue;

            __CLR4_5_253a53alusyjjnb.R.inc(7892);Object object = null;
            __CLR4_5_253a53alusyjjnb.R.inc(7893);if ((((task.ownerContext != null)&&(__CLR4_5_253a53alusyjjnb.R.iget(7894)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7895)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7896);object = task.ownerContext.object;
            }

            }__CLR4_5_253a53alusyjjnb.R.inc(7897);Object refValue;

            __CLR4_5_253a53alusyjjnb.R.inc(7898);if ((((ref.startsWith("$"))&&(__CLR4_5_253a53alusyjjnb.R.iget(7899)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7900)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7901);refValue = getObject(ref);
                __CLR4_5_253a53alusyjjnb.R.inc(7902);if ((((refValue == null)&&(__CLR4_5_253a53alusyjjnb.R.iget(7903)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7904)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7905);try {
                        __CLR4_5_253a53alusyjjnb.R.inc(7906);refValue = JSONPath.eval(value, ref);
                    } catch (JSONPathException ex) {
                        // skip
                    }
                }
            }} }else {{
                __CLR4_5_253a53alusyjjnb.R.inc(7907);refValue = task.context.object;
            }

            }__CLR4_5_253a53alusyjjnb.R.inc(7908);FieldDeserializer fieldDeser = task.fieldDeserializer;

            __CLR4_5_253a53alusyjjnb.R.inc(7909);if ((((fieldDeser != null)&&(__CLR4_5_253a53alusyjjnb.R.iget(7910)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7911)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7912);if ((((refValue != null
                        && refValue.getClass() == JSONObject.class
                        && fieldDeser.fieldInfo != null
                        && !Map.class.isAssignableFrom(fieldDeser.fieldInfo.fieldClass))&&(__CLR4_5_253a53alusyjjnb.R.iget(7913)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7914)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7915);Object root = this.contextArray[0].object;
                    __CLR4_5_253a53alusyjjnb.R.inc(7916);refValue = JSONPath.eval(root, ref);
                }

                }__CLR4_5_253a53alusyjjnb.R.inc(7917);fieldDeser.setValue(object, refValue);
            }
        }}
    }}finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public static class ResolveTask {

        public final ParseContext context;
        public final String       referenceValue;
        public FieldDeserializer  fieldDeserializer;
        public ParseContext       ownerContext;

        public ResolveTask(ParseContext context, String referenceValue){try{__CLR4_5_253a53alusyjjnb.R.inc(7918);
            __CLR4_5_253a53alusyjjnb.R.inc(7919);this.context = context;
            __CLR4_5_253a53alusyjjnb.R.inc(7920);this.referenceValue = referenceValue;
        }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}
    }

    public void parseExtra(Object object, String key) {try{__CLR4_5_253a53alusyjjnb.R.inc(7921);
        __CLR4_5_253a53alusyjjnb.R.inc(7922);final JSONLexer lexer = this.lexer; // xxx
        __CLR4_5_253a53alusyjjnb.R.inc(7923);lexer.nextTokenWithColon();
        __CLR4_5_253a53alusyjjnb.R.inc(7924);Type type = null;

        __CLR4_5_253a53alusyjjnb.R.inc(7925);if ((((extraTypeProviders != null)&&(__CLR4_5_253a53alusyjjnb.R.iget(7926)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7927)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7928);for (ExtraTypeProvider extraProvider : extraTypeProviders) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7929);type = extraProvider.getExtraType(object, key);
            }
        }}
        }__CLR4_5_253a53alusyjjnb.R.inc(7930);Object value = (((type == null //
            )&&(__CLR4_5_253a53alusyjjnb.R.iget(7931)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7932)==0&false))? parse() // skip
            : parseObject(type);

        __CLR4_5_253a53alusyjjnb.R.inc(7933);if ((((object instanceof ExtraProcessable)&&(__CLR4_5_253a53alusyjjnb.R.iget(7934)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7935)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7936);ExtraProcessable extraProcessable = ((ExtraProcessable) object);
            __CLR4_5_253a53alusyjjnb.R.inc(7937);extraProcessable.processExtra(key, value);
            __CLR4_5_253a53alusyjjnb.R.inc(7938);return;
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7939);if ((((extraProcessors != null)&&(__CLR4_5_253a53alusyjjnb.R.iget(7940)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7941)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7942);for (ExtraProcessor process : extraProcessors) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7943);process.processExtra(object, key, value);
            }
        }}

        }__CLR4_5_253a53alusyjjnb.R.inc(7944);if ((((resolveStatus == NeedToResolve)&&(__CLR4_5_253a53alusyjjnb.R.iget(7945)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7946)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7947);resolveStatus = NONE;
        }
    }}finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

    public Object parse(PropertyProcessable object, Object fieldName) {try{__CLR4_5_253a53alusyjjnb.R.inc(7948);
        __CLR4_5_253a53alusyjjnb.R.inc(7949);if ((((lexer.token() != JSONToken.LBRACE)&&(__CLR4_5_253a53alusyjjnb.R.iget(7950)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7951)==0&false))) {{
            __CLR4_5_253a53alusyjjnb.R.inc(7952);String msg = "syntax error, expect {, actual " + lexer.tokenName();
            __CLR4_5_253a53alusyjjnb.R.inc(7953);if ((((fieldName instanceof String)&&(__CLR4_5_253a53alusyjjnb.R.iget(7954)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7955)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7956);msg += ", fieldName ";
                __CLR4_5_253a53alusyjjnb.R.inc(7957);msg += fieldName;
            }
            }__CLR4_5_253a53alusyjjnb.R.inc(7958);msg += ", ";
            __CLR4_5_253a53alusyjjnb.R.inc(7959);msg += lexer.info();

            __CLR4_5_253a53alusyjjnb.R.inc(7960);JSONArray array = new JSONArray();
            __CLR4_5_253a53alusyjjnb.R.inc(7961);parseArray(array, fieldName);

            __CLR4_5_253a53alusyjjnb.R.inc(7962);if ((((array.size() == 1)&&(__CLR4_5_253a53alusyjjnb.R.iget(7963)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7964)==0&false))) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7965);Object first = array.get(0);
                __CLR4_5_253a53alusyjjnb.R.inc(7966);if ((((first instanceof JSONObject)&&(__CLR4_5_253a53alusyjjnb.R.iget(7967)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7968)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7969);return (JSONObject) first;
                }
            }}

            }__CLR4_5_253a53alusyjjnb.R.inc(7970);throw new JSONException(msg);
        }

        }__CLR4_5_253a53alusyjjnb.R.inc(7971);ParseContext context = this.context;
        __CLR4_5_253a53alusyjjnb.R.inc(7972);try {
            __CLR4_5_253a53alusyjjnb.R.inc(7973);for (int i = 0;;++i) {{
                __CLR4_5_253a53alusyjjnb.R.inc(7974);lexer.skipWhitespace();
                __CLR4_5_253a53alusyjjnb.R.inc(7975);char ch = lexer.getCurrent();
                __CLR4_5_253a53alusyjjnb.R.inc(7976);if ((((lexer.isEnabled(Feature.AllowArbitraryCommas))&&(__CLR4_5_253a53alusyjjnb.R.iget(7977)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7978)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7979);while ((((ch == ',')&&(__CLR4_5_253a53alusyjjnb.R.iget(7980)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7981)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7982);lexer.next();
                        __CLR4_5_253a53alusyjjnb.R.inc(7983);lexer.skipWhitespace();
                        __CLR4_5_253a53alusyjjnb.R.inc(7984);ch = lexer.getCurrent();
                    }
                }}

                }__CLR4_5_253a53alusyjjnb.R.inc(7985);String key;
                __CLR4_5_253a53alusyjjnb.R.inc(7986);if ((((ch == '"')&&(__CLR4_5_253a53alusyjjnb.R.iget(7987)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7988)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7989);key = lexer.scanSymbol(symbolTable, '"');
                    __CLR4_5_253a53alusyjjnb.R.inc(7990);lexer.skipWhitespace();
                    __CLR4_5_253a53alusyjjnb.R.inc(7991);ch = lexer.getCurrent();
                    __CLR4_5_253a53alusyjjnb.R.inc(7992);if ((((ch != ':')&&(__CLR4_5_253a53alusyjjnb.R.iget(7993)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7994)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(7995);throw new JSONException("expect ':' at " + lexer.pos());
                    }
                }} }else {__CLR4_5_253a53alusyjjnb.R.inc(7996);if ((((ch == '}')&&(__CLR4_5_253a53alusyjjnb.R.iget(7997)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(7998)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(7999);lexer.next();
                    __CLR4_5_253a53alusyjjnb.R.inc(8000);lexer.resetStringPosition();
                    __CLR4_5_253a53alusyjjnb.R.inc(8001);lexer.nextToken(JSONToken.COMMA);
                    __CLR4_5_253a53alusyjjnb.R.inc(8002);return object;
                } }else {__CLR4_5_253a53alusyjjnb.R.inc(8003);if ((((ch == '\'')&&(__CLR4_5_253a53alusyjjnb.R.iget(8004)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(8005)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(8006);if ((((!lexer.isEnabled(Feature.AllowSingleQuotes))&&(__CLR4_5_253a53alusyjjnb.R.iget(8007)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(8008)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(8009);throw new JSONException("syntax error");
                    }

                    }__CLR4_5_253a53alusyjjnb.R.inc(8010);key = lexer.scanSymbol(symbolTable, '\'');
                    __CLR4_5_253a53alusyjjnb.R.inc(8011);lexer.skipWhitespace();
                    __CLR4_5_253a53alusyjjnb.R.inc(8012);ch = lexer.getCurrent();
                    __CLR4_5_253a53alusyjjnb.R.inc(8013);if ((((ch != ':')&&(__CLR4_5_253a53alusyjjnb.R.iget(8014)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(8015)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(8016);throw new JSONException("expect ':' at " + lexer.pos());
                    }
                }} }else {{
                    __CLR4_5_253a53alusyjjnb.R.inc(8017);if ((((!lexer.isEnabled(Feature.AllowUnQuotedFieldNames))&&(__CLR4_5_253a53alusyjjnb.R.iget(8018)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(8019)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(8020);throw new JSONException("syntax error");
                    }

                    }__CLR4_5_253a53alusyjjnb.R.inc(8021);key = lexer.scanSymbolUnQuoted(symbolTable);
                    __CLR4_5_253a53alusyjjnb.R.inc(8022);lexer.skipWhitespace();
                    __CLR4_5_253a53alusyjjnb.R.inc(8023);ch = lexer.getCurrent();
                    __CLR4_5_253a53alusyjjnb.R.inc(8024);if ((((ch != ':')&&(__CLR4_5_253a53alusyjjnb.R.iget(8025)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(8026)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(8027);throw new JSONException("expect ':' at " + lexer.pos() + ", actual " + ch);
                    }
                }}

                }}}__CLR4_5_253a53alusyjjnb.R.inc(8028);lexer.next();
                __CLR4_5_253a53alusyjjnb.R.inc(8029);lexer.skipWhitespace();
                __CLR4_5_253a53alusyjjnb.R.inc(8030);ch = lexer.getCurrent();

                __CLR4_5_253a53alusyjjnb.R.inc(8031);lexer.resetStringPosition();

                __CLR4_5_253a53alusyjjnb.R.inc(8032);if ((((key == JSON.DEFAULT_TYPE_KEY && !lexer.isEnabled(Feature.DisableSpecialKeyDetect))&&(__CLR4_5_253a53alusyjjnb.R.iget(8033)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(8034)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(8035);String typeName = lexer.scanSymbol(symbolTable, '"');

                    __CLR4_5_253a53alusyjjnb.R.inc(8036);Class<?> clazz = config.checkAutoType(typeName, null, lexer.getFeatures());

                    __CLR4_5_253a53alusyjjnb.R.inc(8037);if ((((Map.class.isAssignableFrom(clazz) )&&(__CLR4_5_253a53alusyjjnb.R.iget(8038)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(8039)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(8040);lexer.nextToken(JSONToken.COMMA);
                        __CLR4_5_253a53alusyjjnb.R.inc(8041);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_5_253a53alusyjjnb.R.iget(8042)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(8043)==0&false))) {{
                            __CLR4_5_253a53alusyjjnb.R.inc(8044);lexer.nextToken(JSONToken.COMMA);
                            __CLR4_5_253a53alusyjjnb.R.inc(8045);return object;
                        }
                        }__CLR4_5_253a53alusyjjnb.R.inc(8046);continue;
                    }

                    }__CLR4_5_253a53alusyjjnb.R.inc(8047);ObjectDeserializer deserializer = config.getDeserializer(clazz);

                    __CLR4_5_253a53alusyjjnb.R.inc(8048);lexer.nextToken(JSONToken.COMMA);

                    __CLR4_5_253a53alusyjjnb.R.inc(8049);setResolveStatus(DefaultJSONParser.TypeNameRedirect);

                    __CLR4_5_253a53alusyjjnb.R.inc(8050);if ((((context != null && !(fieldName instanceof Integer))&&(__CLR4_5_253a53alusyjjnb.R.iget(8051)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(8052)==0&false))) {{
                        __CLR4_5_253a53alusyjjnb.R.inc(8053);popContext();
                    }

                    }__CLR4_5_253a53alusyjjnb.R.inc(8054);return (Map) deserializer.deserialze(this, clazz, fieldName);
                }

                }__CLR4_5_253a53alusyjjnb.R.inc(8055);Object value;
                __CLR4_5_253a53alusyjjnb.R.inc(8056);lexer.nextToken();

                __CLR4_5_253a53alusyjjnb.R.inc(8057);if ((((i != 0)&&(__CLR4_5_253a53alusyjjnb.R.iget(8058)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(8059)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(8060);setContext(context);
                }

                }__CLR4_5_253a53alusyjjnb.R.inc(8061);Type valueType = object.getType(key);

                __CLR4_5_253a53alusyjjnb.R.inc(8062);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_5_253a53alusyjjnb.R.iget(8063)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(8064)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(8065);value = null;
                    __CLR4_5_253a53alusyjjnb.R.inc(8066);lexer.nextToken();
                } }else {{
                    __CLR4_5_253a53alusyjjnb.R.inc(8067);value = parseObject(valueType, key);
                }

                }__CLR4_5_253a53alusyjjnb.R.inc(8068);object.apply(key, value);

                __CLR4_5_253a53alusyjjnb.R.inc(8069);setContext(context, value, key);
                __CLR4_5_253a53alusyjjnb.R.inc(8070);setContext(context);

                __CLR4_5_253a53alusyjjnb.R.inc(8071);final int tok = lexer.token();
                __CLR4_5_253a53alusyjjnb.R.inc(8072);if ((((tok == JSONToken.EOF || tok == JSONToken.RBRACKET)&&(__CLR4_5_253a53alusyjjnb.R.iget(8073)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(8074)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(8075);return object;
                }

                }__CLR4_5_253a53alusyjjnb.R.inc(8076);if ((((tok == JSONToken.RBRACE)&&(__CLR4_5_253a53alusyjjnb.R.iget(8077)!=0|true))||(__CLR4_5_253a53alusyjjnb.R.iget(8078)==0&false))) {{
                    __CLR4_5_253a53alusyjjnb.R.inc(8079);lexer.nextToken();
                    __CLR4_5_253a53alusyjjnb.R.inc(8080);return object;
                }
            }}
        }} finally {
            __CLR4_5_253a53alusyjjnb.R.inc(8081);setContext(context);
        }
    }finally{__CLR4_5_253a53alusyjjnb.R.flushNeeded();}}

}
