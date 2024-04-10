/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.parser.deserializer;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.*;
import com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask;

public class MapDeserializer implements ObjectDeserializer {public static class __CLR4_1_10glhglhluszvygd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,21830,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static MapDeserializer instance = new MapDeserializer();
    
    
    @SuppressWarnings("unchecked")
    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_1_10glhglhluszvygd.R.inc(21509);
        __CLR4_1_10glhglhluszvygd.R.inc(21510);if ((((type == JSONObject.class && parser.getFieldTypeResolver() == null)&&(__CLR4_1_10glhglhluszvygd.R.iget(21511)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21512)==0&false))) {{
            __CLR4_1_10glhglhluszvygd.R.inc(21513);return (T) parser.parseObject();
        }
        
        }__CLR4_1_10glhglhluszvygd.R.inc(21514);final JSONLexer lexer = parser.lexer;
        __CLR4_1_10glhglhluszvygd.R.inc(21515);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_1_10glhglhluszvygd.R.iget(21516)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21517)==0&false))) {{
            __CLR4_1_10glhglhluszvygd.R.inc(21518);lexer.nextToken(JSONToken.COMMA);
            __CLR4_1_10glhglhluszvygd.R.inc(21519);return null;
        }

        }__CLR4_1_10glhglhluszvygd.R.inc(21520);boolean unmodifiableMap = type instanceof Class
                && "java.util.Collections$UnmodifiableMap".equals(((Class) type).getName());

        __CLR4_1_10glhglhluszvygd.R.inc(21521);Map<Object, Object> map = ((((lexer.getFeatures() & Feature.OrderedField.mask) != 0
                )&&(__CLR4_1_10glhglhluszvygd.R.iget(21522)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21523)==0&false))? createMap(type, lexer.getFeatures())
                : createMap(type);

        __CLR4_1_10glhglhluszvygd.R.inc(21524);ParseContext context = parser.getContext();

        __CLR4_1_10glhglhluszvygd.R.inc(21525);try {
            __CLR4_1_10glhglhluszvygd.R.inc(21526);parser.setContext(context, map, fieldName);
            __CLR4_1_10glhglhluszvygd.R.inc(21527);T t = (T) deserialze(parser, type, fieldName, map);
            __CLR4_1_10glhglhluszvygd.R.inc(21528);if ((((unmodifiableMap)&&(__CLR4_1_10glhglhluszvygd.R.iget(21529)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21530)==0&false))) {{
                __CLR4_1_10glhglhluszvygd.R.inc(21531);t = (T) Collections.unmodifiableMap((Map) t);
            }
            }__CLR4_1_10glhglhluszvygd.R.inc(21532);return t;
        } finally {
            __CLR4_1_10glhglhluszvygd.R.inc(21533);parser.setContext(context);
        }
    }finally{__CLR4_1_10glhglhluszvygd.R.flushNeeded();}}

    @SuppressWarnings({ "rawtypes", "unchecked" })
    protected Object deserialze(DefaultJSONParser parser, Type type, Object fieldName, Map map) {try{__CLR4_1_10glhglhluszvygd.R.inc(21534);
        __CLR4_1_10glhglhluszvygd.R.inc(21535);if ((((type instanceof ParameterizedType)&&(__CLR4_1_10glhglhluszvygd.R.iget(21536)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21537)==0&false))) {{
            __CLR4_1_10glhglhluszvygd.R.inc(21538);ParameterizedType parameterizedType = (ParameterizedType) type;
            __CLR4_1_10glhglhluszvygd.R.inc(21539);Type keyType = parameterizedType.getActualTypeArguments()[0];
            __CLR4_1_10glhglhluszvygd.R.inc(21540);Type valueType = null;
            __CLR4_1_10glhglhluszvygd.R.inc(21541);if((((map.getClass().getName().equals("org.springframework.util.LinkedMultiValueMap"))&&(__CLR4_1_10glhglhluszvygd.R.iget(21542)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21543)==0&false))){{
                __CLR4_1_10glhglhluszvygd.R.inc(21544);valueType = List.class;
            }}else{{
                __CLR4_1_10glhglhluszvygd.R.inc(21545);valueType = parameterizedType.getActualTypeArguments()[1];
            }
            }__CLR4_1_10glhglhluszvygd.R.inc(21546);if ((((String.class == keyType)&&(__CLR4_1_10glhglhluszvygd.R.iget(21547)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21548)==0&false))) {{
                __CLR4_1_10glhglhluszvygd.R.inc(21549);return parseMap(parser, (Map<String, Object>) map, valueType, fieldName);
            } }else {{
                __CLR4_1_10glhglhluszvygd.R.inc(21550);return parseMap(parser, map, keyType, valueType, fieldName);
            }
        }} }else {{
            __CLR4_1_10glhglhluszvygd.R.inc(21551);return parser.parseObject(map, fieldName);
        }
    }}finally{__CLR4_1_10glhglhluszvygd.R.flushNeeded();}}
    
    @SuppressWarnings("rawtypes")
    public static Map parseMap(DefaultJSONParser parser, Map<String, Object> map, Type valueType, Object fieldName) {try{__CLR4_1_10glhglhluszvygd.R.inc(21552);
        __CLR4_1_10glhglhluszvygd.R.inc(21553);JSONLexer lexer = parser.lexer;

        __CLR4_1_10glhglhluszvygd.R.inc(21554);int token = lexer.token();
        __CLR4_1_10glhglhluszvygd.R.inc(21555);if ((((token != JSONToken.LBRACE)&&(__CLR4_1_10glhglhluszvygd.R.iget(21556)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21557)==0&false))) {{
            __CLR4_1_10glhglhluszvygd.R.inc(21558);String msg = "syntax error, expect {, actual " + lexer.tokenName();
            __CLR4_1_10glhglhluszvygd.R.inc(21559);if ((((fieldName instanceof String)&&(__CLR4_1_10glhglhluszvygd.R.iget(21560)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21561)==0&false))) {{
                __CLR4_1_10glhglhluszvygd.R.inc(21562);msg += ", fieldName ";
                __CLR4_1_10glhglhluszvygd.R.inc(21563);msg += fieldName;
            }
            }__CLR4_1_10glhglhluszvygd.R.inc(21564);msg += ", ";
            __CLR4_1_10glhglhluszvygd.R.inc(21565);msg += lexer.info();

            __CLR4_1_10glhglhluszvygd.R.inc(21566);if ((((token != JSONToken.LITERAL_STRING)&&(__CLR4_1_10glhglhluszvygd.R.iget(21567)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21568)==0&false))) {{
                __CLR4_1_10glhglhluszvygd.R.inc(21569);JSONArray array = new JSONArray();
                __CLR4_1_10glhglhluszvygd.R.inc(21570);parser.parseArray(array, fieldName);

                __CLR4_1_10glhglhluszvygd.R.inc(21571);if ((((array.size() == 1)&&(__CLR4_1_10glhglhluszvygd.R.iget(21572)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21573)==0&false))) {{
                    __CLR4_1_10glhglhluszvygd.R.inc(21574);Object first = array.get(0);
                    __CLR4_1_10glhglhluszvygd.R.inc(21575);if ((((first instanceof JSONObject)&&(__CLR4_1_10glhglhluszvygd.R.iget(21576)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21577)==0&false))) {{
                        __CLR4_1_10glhglhluszvygd.R.inc(21578);return (JSONObject) first;
                    }
                }}
            }}

            }__CLR4_1_10glhglhluszvygd.R.inc(21579);throw new JSONException(msg);
        }

        }__CLR4_1_10glhglhluszvygd.R.inc(21580);ParseContext context = parser.getContext();
        __CLR4_1_10glhglhluszvygd.R.inc(21581);try {
            __CLR4_1_10glhglhluszvygd.R.inc(21582);for (int i = 0;;++i) {{
                __CLR4_1_10glhglhluszvygd.R.inc(21583);lexer.skipWhitespace();
                __CLR4_1_10glhglhluszvygd.R.inc(21584);char ch = lexer.getCurrent();
                __CLR4_1_10glhglhluszvygd.R.inc(21585);if ((((lexer.isEnabled(Feature.AllowArbitraryCommas))&&(__CLR4_1_10glhglhluszvygd.R.iget(21586)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21587)==0&false))) {{
                    __CLR4_1_10glhglhluszvygd.R.inc(21588);while ((((ch == ',')&&(__CLR4_1_10glhglhluszvygd.R.iget(21589)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21590)==0&false))) {{
                        __CLR4_1_10glhglhluszvygd.R.inc(21591);lexer.next();
                        __CLR4_1_10glhglhluszvygd.R.inc(21592);lexer.skipWhitespace();
                        __CLR4_1_10glhglhluszvygd.R.inc(21593);ch = lexer.getCurrent();
                    }
                }}

                }__CLR4_1_10glhglhluszvygd.R.inc(21594);String key;
                __CLR4_1_10glhglhluszvygd.R.inc(21595);if ((((ch == '"')&&(__CLR4_1_10glhglhluszvygd.R.iget(21596)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21597)==0&false))) {{
                    __CLR4_1_10glhglhluszvygd.R.inc(21598);key = lexer.scanSymbol(parser.getSymbolTable(), '"');
                    __CLR4_1_10glhglhluszvygd.R.inc(21599);lexer.skipWhitespace();
                    __CLR4_1_10glhglhluszvygd.R.inc(21600);ch = lexer.getCurrent();
                    __CLR4_1_10glhglhluszvygd.R.inc(21601);if ((((ch != ':')&&(__CLR4_1_10glhglhluszvygd.R.iget(21602)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21603)==0&false))) {{
                        __CLR4_1_10glhglhluszvygd.R.inc(21604);throw new JSONException("expect ':' at " + lexer.pos());
                    }
                }} }else {__CLR4_1_10glhglhluszvygd.R.inc(21605);if ((((ch == '}')&&(__CLR4_1_10glhglhluszvygd.R.iget(21606)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21607)==0&false))) {{
                    __CLR4_1_10glhglhluszvygd.R.inc(21608);lexer.next();
                    __CLR4_1_10glhglhluszvygd.R.inc(21609);lexer.resetStringPosition();
                    __CLR4_1_10glhglhluszvygd.R.inc(21610);lexer.nextToken(JSONToken.COMMA);
                    __CLR4_1_10glhglhluszvygd.R.inc(21611);return map;
                } }else {__CLR4_1_10glhglhluszvygd.R.inc(21612);if ((((ch == '\'')&&(__CLR4_1_10glhglhluszvygd.R.iget(21613)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21614)==0&false))) {{
                    __CLR4_1_10glhglhluszvygd.R.inc(21615);if ((((!lexer.isEnabled(Feature.AllowSingleQuotes))&&(__CLR4_1_10glhglhluszvygd.R.iget(21616)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21617)==0&false))) {{
                        __CLR4_1_10glhglhluszvygd.R.inc(21618);throw new JSONException("syntax error");
                    }

                    }__CLR4_1_10glhglhluszvygd.R.inc(21619);key = lexer.scanSymbol(parser.getSymbolTable(), '\'');
                    __CLR4_1_10glhglhluszvygd.R.inc(21620);lexer.skipWhitespace();
                    __CLR4_1_10glhglhluszvygd.R.inc(21621);ch = lexer.getCurrent();
                    __CLR4_1_10glhglhluszvygd.R.inc(21622);if ((((ch != ':')&&(__CLR4_1_10glhglhluszvygd.R.iget(21623)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21624)==0&false))) {{
                        __CLR4_1_10glhglhluszvygd.R.inc(21625);throw new JSONException("expect ':' at " + lexer.pos());
                    }
                }} }else {{
                    __CLR4_1_10glhglhluszvygd.R.inc(21626);if ((((!lexer.isEnabled(Feature.AllowUnQuotedFieldNames))&&(__CLR4_1_10glhglhluszvygd.R.iget(21627)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21628)==0&false))) {{
                        __CLR4_1_10glhglhluszvygd.R.inc(21629);throw new JSONException("syntax error");
                    }

                    }__CLR4_1_10glhglhluszvygd.R.inc(21630);key = lexer.scanSymbolUnQuoted(parser.getSymbolTable());
                    __CLR4_1_10glhglhluszvygd.R.inc(21631);lexer.skipWhitespace();
                    __CLR4_1_10glhglhluszvygd.R.inc(21632);ch = lexer.getCurrent();
                    __CLR4_1_10glhglhluszvygd.R.inc(21633);if ((((ch != ':')&&(__CLR4_1_10glhglhluszvygd.R.iget(21634)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21635)==0&false))) {{
                        __CLR4_1_10glhglhluszvygd.R.inc(21636);throw new JSONException("expect ':' at " + lexer.pos() + ", actual " + ch);
                    }
                }}

                }}}__CLR4_1_10glhglhluszvygd.R.inc(21637);lexer.next();
                __CLR4_1_10glhglhluszvygd.R.inc(21638);lexer.skipWhitespace();
                __CLR4_1_10glhglhluszvygd.R.inc(21639);ch = lexer.getCurrent();

                __CLR4_1_10glhglhluszvygd.R.inc(21640);lexer.resetStringPosition();

                __CLR4_1_10glhglhluszvygd.R.inc(21641);if ((((key == JSON.DEFAULT_TYPE_KEY && !lexer.isEnabled(Feature.DisableSpecialKeyDetect))&&(__CLR4_1_10glhglhluszvygd.R.iget(21642)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21643)==0&false))) {{
                    __CLR4_1_10glhglhluszvygd.R.inc(21644);String typeName = lexer.scanSymbol(parser.getSymbolTable(), '"');
                    __CLR4_1_10glhglhluszvygd.R.inc(21645);final ParserConfig config = parser.getConfig();

                    __CLR4_1_10glhglhluszvygd.R.inc(21646);Class<?> clazz = config.checkAutoType(typeName, null, lexer.getFeatures());

                    __CLR4_1_10glhglhluszvygd.R.inc(21647);if ((((Map.class.isAssignableFrom(clazz) )&&(__CLR4_1_10glhglhluszvygd.R.iget(21648)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21649)==0&false))) {{
                        __CLR4_1_10glhglhluszvygd.R.inc(21650);lexer.nextToken(JSONToken.COMMA);
                        __CLR4_1_10glhglhluszvygd.R.inc(21651);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_1_10glhglhluszvygd.R.iget(21652)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21653)==0&false))) {{
                            __CLR4_1_10glhglhluszvygd.R.inc(21654);lexer.nextToken(JSONToken.COMMA);
                            __CLR4_1_10glhglhluszvygd.R.inc(21655);return map;
                        }
                        }__CLR4_1_10glhglhluszvygd.R.inc(21656);continue;
                    }

                    }__CLR4_1_10glhglhluszvygd.R.inc(21657);ObjectDeserializer deserializer = config.getDeserializer(clazz);

                    __CLR4_1_10glhglhluszvygd.R.inc(21658);lexer.nextToken(JSONToken.COMMA);

                    __CLR4_1_10glhglhluszvygd.R.inc(21659);parser.setResolveStatus(DefaultJSONParser.TypeNameRedirect);

                    __CLR4_1_10glhglhluszvygd.R.inc(21660);if ((((context != null && !(fieldName instanceof Integer))&&(__CLR4_1_10glhglhluszvygd.R.iget(21661)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21662)==0&false))) {{
                        __CLR4_1_10glhglhluszvygd.R.inc(21663);parser.popContext();
                    }

                    }__CLR4_1_10glhglhluszvygd.R.inc(21664);return (Map) deserializer.deserialze(parser, clazz, fieldName);
                }

                }__CLR4_1_10glhglhluszvygd.R.inc(21665);Object value;
                __CLR4_1_10glhglhluszvygd.R.inc(21666);lexer.nextToken();

                __CLR4_1_10glhglhluszvygd.R.inc(21667);if ((((i != 0)&&(__CLR4_1_10glhglhluszvygd.R.iget(21668)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21669)==0&false))) {{
                    __CLR4_1_10glhglhluszvygd.R.inc(21670);parser.setContext(context);
                }
                
                }__CLR4_1_10glhglhluszvygd.R.inc(21671);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_1_10glhglhluszvygd.R.iget(21672)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21673)==0&false))) {{
                    __CLR4_1_10glhglhluszvygd.R.inc(21674);value = null;
                    __CLR4_1_10glhglhluszvygd.R.inc(21675);lexer.nextToken();
                } }else {{
                    __CLR4_1_10glhglhluszvygd.R.inc(21676);value = parser.parseObject(valueType, key);
                }

                }__CLR4_1_10glhglhluszvygd.R.inc(21677);map.put(key, value);
                __CLR4_1_10glhglhluszvygd.R.inc(21678);parser.checkMapResolve(map, key);

                __CLR4_1_10glhglhluszvygd.R.inc(21679);parser.setContext(context, value, key);
                __CLR4_1_10glhglhluszvygd.R.inc(21680);parser.setContext(context);

                __CLR4_1_10glhglhluszvygd.R.inc(21681);final int tok = lexer.token();
                __CLR4_1_10glhglhluszvygd.R.inc(21682);if ((((tok == JSONToken.EOF || tok == JSONToken.RBRACKET)&&(__CLR4_1_10glhglhluszvygd.R.iget(21683)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21684)==0&false))) {{
                    __CLR4_1_10glhglhluszvygd.R.inc(21685);return map;
                }

                }__CLR4_1_10glhglhluszvygd.R.inc(21686);if ((((tok == JSONToken.RBRACE)&&(__CLR4_1_10glhglhluszvygd.R.iget(21687)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21688)==0&false))) {{
                    __CLR4_1_10glhglhluszvygd.R.inc(21689);lexer.nextToken();
                    __CLR4_1_10glhglhluszvygd.R.inc(21690);return map;
                }
            }}
        }} finally {
            __CLR4_1_10glhglhluszvygd.R.inc(21691);parser.setContext(context);
        }

    }finally{__CLR4_1_10glhglhluszvygd.R.flushNeeded();}}
    
    public static Object parseMap(DefaultJSONParser parser, Map<Object, Object> map, Type keyType, Type valueType,
                                  Object fieldName) {try{__CLR4_1_10glhglhluszvygd.R.inc(21692);
        __CLR4_1_10glhglhluszvygd.R.inc(21693);JSONLexer lexer = parser.lexer;

        __CLR4_1_10glhglhluszvygd.R.inc(21694);if ((((lexer.token() != JSONToken.LBRACE && lexer.token() != JSONToken.COMMA)&&(__CLR4_1_10glhglhluszvygd.R.iget(21695)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21696)==0&false))) {{
            __CLR4_1_10glhglhluszvygd.R.inc(21697);throw new JSONException("syntax error, expect {, actual " + lexer.tokenName());
        }

        }__CLR4_1_10glhglhluszvygd.R.inc(21698);ObjectDeserializer keyDeserializer = parser.getConfig().getDeserializer(keyType);
        __CLR4_1_10glhglhluszvygd.R.inc(21699);ObjectDeserializer valueDeserializer = parser.getConfig().getDeserializer(valueType);
        __CLR4_1_10glhglhluszvygd.R.inc(21700);lexer.nextToken(keyDeserializer.getFastMatchToken());

        __CLR4_1_10glhglhluszvygd.R.inc(21701);ParseContext context = parser.getContext();
        __CLR4_1_10glhglhluszvygd.R.inc(21702);try {
            __CLR4_1_10glhglhluszvygd.R.inc(21703);for (;;) {{
                __CLR4_1_10glhglhluszvygd.R.inc(21704);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_1_10glhglhluszvygd.R.iget(21705)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21706)==0&false))) {{
                    __CLR4_1_10glhglhluszvygd.R.inc(21707);lexer.nextToken(JSONToken.COMMA);
                    __CLR4_1_10glhglhluszvygd.R.inc(21708);break;
                }

                }__CLR4_1_10glhglhluszvygd.R.inc(21709);if ((((lexer.token() == JSONToken.LITERAL_STRING //
                    && lexer.isRef() //
                    && !lexer.isEnabled(Feature.DisableSpecialKeyDetect) //
                )&&(__CLR4_1_10glhglhluszvygd.R.iget(21710)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21711)==0&false))) {{
                    __CLR4_1_10glhglhluszvygd.R.inc(21712);Object object = null;

                    __CLR4_1_10glhglhluszvygd.R.inc(21713);lexer.nextTokenWithColon(JSONToken.LITERAL_STRING);
                    __CLR4_1_10glhglhluszvygd.R.inc(21714);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_1_10glhglhluszvygd.R.iget(21715)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21716)==0&false))) {{
                        __CLR4_1_10glhglhluszvygd.R.inc(21717);String ref = lexer.stringVal();
                        __CLR4_1_10glhglhluszvygd.R.inc(21718);if (((("..".equals(ref))&&(__CLR4_1_10glhglhluszvygd.R.iget(21719)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21720)==0&false))) {{
                            __CLR4_1_10glhglhluszvygd.R.inc(21721);ParseContext parentContext = context.parent;
                            __CLR4_1_10glhglhluszvygd.R.inc(21722);object = parentContext.object;
                        } }else {__CLR4_1_10glhglhluszvygd.R.inc(21723);if (((("$".equals(ref))&&(__CLR4_1_10glhglhluszvygd.R.iget(21724)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21725)==0&false))) {{
                            __CLR4_1_10glhglhluszvygd.R.inc(21726);ParseContext rootContext = context;
                            __CLR4_1_10glhglhluszvygd.R.inc(21727);while ((((rootContext.parent != null)&&(__CLR4_1_10glhglhluszvygd.R.iget(21728)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21729)==0&false))) {{
                                __CLR4_1_10glhglhluszvygd.R.inc(21730);rootContext = rootContext.parent;
                            }

                            }__CLR4_1_10glhglhluszvygd.R.inc(21731);object = rootContext.object;
                        } }else {{
                            __CLR4_1_10glhglhluszvygd.R.inc(21732);parser.addResolveTask(new ResolveTask(context, ref));
                            __CLR4_1_10glhglhluszvygd.R.inc(21733);parser.setResolveStatus(DefaultJSONParser.NeedToResolve);
                        }
                    }}} }else {{
                        __CLR4_1_10glhglhluszvygd.R.inc(21734);throw new JSONException("illegal ref, " + JSONToken.name(lexer.token()));
                    }

                    }__CLR4_1_10glhglhluszvygd.R.inc(21735);lexer.nextToken(JSONToken.RBRACE);
                    __CLR4_1_10glhglhluszvygd.R.inc(21736);if ((((lexer.token() != JSONToken.RBRACE)&&(__CLR4_1_10glhglhluszvygd.R.iget(21737)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21738)==0&false))) {{
                        __CLR4_1_10glhglhluszvygd.R.inc(21739);throw new JSONException("illegal ref");
                    }
                    }__CLR4_1_10glhglhluszvygd.R.inc(21740);lexer.nextToken(JSONToken.COMMA);

                    // parser.setContext(context, map, fieldName);
                    // parser.setContext(context);

                    __CLR4_1_10glhglhluszvygd.R.inc(21741);return object;
                }

                }__CLR4_1_10glhglhluszvygd.R.inc(21742);if ((((map.size() == 0 //
                    && lexer.token() == JSONToken.LITERAL_STRING //
                    && JSON.DEFAULT_TYPE_KEY.equals(lexer.stringVal()) //
                    && !lexer.isEnabled(Feature.DisableSpecialKeyDetect))&&(__CLR4_1_10glhglhluszvygd.R.iget(21743)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21744)==0&false))) {{
                    __CLR4_1_10glhglhluszvygd.R.inc(21745);lexer.nextTokenWithColon(JSONToken.LITERAL_STRING);
                    __CLR4_1_10glhglhluszvygd.R.inc(21746);lexer.nextToken(JSONToken.COMMA);
                    __CLR4_1_10glhglhluszvygd.R.inc(21747);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_1_10glhglhluszvygd.R.iget(21748)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21749)==0&false))) {{
                        __CLR4_1_10glhglhluszvygd.R.inc(21750);lexer.nextToken();
                        __CLR4_1_10glhglhluszvygd.R.inc(21751);return map;
                    }
                    }__CLR4_1_10glhglhluszvygd.R.inc(21752);lexer.nextToken(keyDeserializer.getFastMatchToken());
                }

                }__CLR4_1_10glhglhluszvygd.R.inc(21753);Object key = keyDeserializer.deserialze(parser, keyType, null);

                __CLR4_1_10glhglhluszvygd.R.inc(21754);if ((((lexer.token() != JSONToken.COLON)&&(__CLR4_1_10glhglhluszvygd.R.iget(21755)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21756)==0&false))) {{
                    __CLR4_1_10glhglhluszvygd.R.inc(21757);throw new JSONException("syntax error, expect :, actual " + lexer.token());
                }

                }__CLR4_1_10glhglhluszvygd.R.inc(21758);lexer.nextToken(valueDeserializer.getFastMatchToken());

                __CLR4_1_10glhglhluszvygd.R.inc(21759);Object value = valueDeserializer.deserialze(parser, valueType, key);
                __CLR4_1_10glhglhluszvygd.R.inc(21760);parser.checkMapResolve(map, key);

                __CLR4_1_10glhglhluszvygd.R.inc(21761);map.put(key, value);

                __CLR4_1_10glhglhluszvygd.R.inc(21762);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_1_10glhglhluszvygd.R.iget(21763)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21764)==0&false))) {{
                    __CLR4_1_10glhglhluszvygd.R.inc(21765);lexer.nextToken(keyDeserializer.getFastMatchToken());
                }
            }}
        }} finally {
            __CLR4_1_10glhglhluszvygd.R.inc(21766);parser.setContext(context);
        }

        __CLR4_1_10glhglhluszvygd.R.inc(21767);return map;
    }finally{__CLR4_1_10glhglhluszvygd.R.flushNeeded();}}

    public Map<Object, Object> createMap(Type type) {try{__CLR4_1_10glhglhluszvygd.R.inc(21768);
        __CLR4_1_10glhglhluszvygd.R.inc(21769);return createMap(type, JSON.DEFAULT_GENERATE_FEATURE);
    }finally{__CLR4_1_10glhglhluszvygd.R.flushNeeded();}}

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Map<Object, Object> createMap(Type type, int featrues) {try{__CLR4_1_10glhglhluszvygd.R.inc(21770);
        __CLR4_1_10glhglhluszvygd.R.inc(21771);if ((((type == Properties.class)&&(__CLR4_1_10glhglhluszvygd.R.iget(21772)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21773)==0&false))) {{
            __CLR4_1_10glhglhluszvygd.R.inc(21774);return new Properties();
        }

        }__CLR4_1_10glhglhluszvygd.R.inc(21775);if ((((type == Hashtable.class)&&(__CLR4_1_10glhglhluszvygd.R.iget(21776)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21777)==0&false))) {{
            __CLR4_1_10glhglhluszvygd.R.inc(21778);return new Hashtable();
        }

        }__CLR4_1_10glhglhluszvygd.R.inc(21779);if ((((type == IdentityHashMap.class)&&(__CLR4_1_10glhglhluszvygd.R.iget(21780)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21781)==0&false))) {{
            __CLR4_1_10glhglhluszvygd.R.inc(21782);return new IdentityHashMap();
        }

        }__CLR4_1_10glhglhluszvygd.R.inc(21783);if ((((type == SortedMap.class || type == TreeMap.class)&&(__CLR4_1_10glhglhluszvygd.R.iget(21784)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21785)==0&false))) {{
            __CLR4_1_10glhglhluszvygd.R.inc(21786);return new TreeMap();
        }

        }__CLR4_1_10glhglhluszvygd.R.inc(21787);if ((((type == ConcurrentMap.class || type == ConcurrentHashMap.class)&&(__CLR4_1_10glhglhluszvygd.R.iget(21788)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21789)==0&false))) {{
            __CLR4_1_10glhglhluszvygd.R.inc(21790);return new ConcurrentHashMap();
        }
        
        }__CLR4_1_10glhglhluszvygd.R.inc(21791);if ((((type == Map.class)&&(__CLR4_1_10glhglhluszvygd.R.iget(21792)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21793)==0&false))) {{
            __CLR4_1_10glhglhluszvygd.R.inc(21794);return ((((featrues & Feature.OrderedField.mask) != 0
                    )&&(__CLR4_1_10glhglhluszvygd.R.iget(21795)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21796)==0&false))? new LinkedHashMap()
                    : new HashMap();
        }

        }__CLR4_1_10glhglhluszvygd.R.inc(21797);if ((((type == HashMap.class)&&(__CLR4_1_10glhglhluszvygd.R.iget(21798)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21799)==0&false))) {{
            __CLR4_1_10glhglhluszvygd.R.inc(21800);return new HashMap();
        }

        }__CLR4_1_10glhglhluszvygd.R.inc(21801);if ((((type == LinkedHashMap.class)&&(__CLR4_1_10glhglhluszvygd.R.iget(21802)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21803)==0&false))) {{
            __CLR4_1_10glhglhluszvygd.R.inc(21804);return new LinkedHashMap();
        }

        }__CLR4_1_10glhglhluszvygd.R.inc(21805);if ((((type instanceof ParameterizedType)&&(__CLR4_1_10glhglhluszvygd.R.iget(21806)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21807)==0&false))) {{
            __CLR4_1_10glhglhluszvygd.R.inc(21808);ParameterizedType parameterizedType = (ParameterizedType) type;

            __CLR4_1_10glhglhluszvygd.R.inc(21809);Type rawType = parameterizedType.getRawType();
            __CLR4_1_10glhglhluszvygd.R.inc(21810);if ((((EnumMap.class.equals(rawType))&&(__CLR4_1_10glhglhluszvygd.R.iget(21811)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21812)==0&false))) {{
                __CLR4_1_10glhglhluszvygd.R.inc(21813);Type[] actualArgs = parameterizedType.getActualTypeArguments();
                __CLR4_1_10glhglhluszvygd.R.inc(21814);return new EnumMap((Class) actualArgs[0]);
            }

            }__CLR4_1_10glhglhluszvygd.R.inc(21815);return createMap(rawType, featrues);
        }

        }__CLR4_1_10glhglhluszvygd.R.inc(21816);Class<?> clazz = (Class<?>) type;
        __CLR4_1_10glhglhluszvygd.R.inc(21817);if ((((clazz.isInterface())&&(__CLR4_1_10glhglhluszvygd.R.iget(21818)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21819)==0&false))) {{
            __CLR4_1_10glhglhluszvygd.R.inc(21820);throw new JSONException("unsupport type " + type);
        }

        }__CLR4_1_10glhglhluszvygd.R.inc(21821);if (((("java.util.Collections$UnmodifiableMap".equals(clazz.getName()))&&(__CLR4_1_10glhglhluszvygd.R.iget(21822)!=0|true))||(__CLR4_1_10glhglhluszvygd.R.iget(21823)==0&false))) {{
            __CLR4_1_10glhglhluszvygd.R.inc(21824);return new HashMap();
        }
        
        }__CLR4_1_10glhglhluszvygd.R.inc(21825);try {
            __CLR4_1_10glhglhluszvygd.R.inc(21826);return (Map<Object, Object>) clazz.newInstance();
        } catch (Exception e) {
            __CLR4_1_10glhglhluszvygd.R.inc(21827);throw new JSONException("unsupport type " + type, e);
        }
    }finally{__CLR4_1_10glhglhluszvygd.R.flushNeeded();}}
    

    public int getFastMatchToken() {try{__CLR4_1_10glhglhluszvygd.R.inc(21828);
        __CLR4_1_10glhglhluszvygd.R.inc(21829);return JSONToken.LBRACE;
    }finally{__CLR4_1_10glhglhluszvygd.R.flushNeeded();}}
}
