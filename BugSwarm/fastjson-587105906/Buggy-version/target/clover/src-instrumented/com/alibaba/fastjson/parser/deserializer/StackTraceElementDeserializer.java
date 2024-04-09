/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.parser.deserializer;

import java.lang.reflect.Type;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONToken;

public class StackTraceElementDeserializer implements ObjectDeserializer {public static class __CLR4_1_10h42h42lusqjj5x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,22338,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final static StackTraceElementDeserializer instance = new StackTraceElementDeserializer();

    @SuppressWarnings({ "unchecked", "unused" })
    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_1_10h42h42lusqjj5x.R.inc(22178);
        __CLR4_1_10h42h42lusqjj5x.R.inc(22179);JSONLexer lexer = parser.lexer;
        __CLR4_1_10h42h42lusqjj5x.R.inc(22180);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22181)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22182)==0&false))) {{
            __CLR4_1_10h42h42lusqjj5x.R.inc(22183);lexer.nextToken();
            __CLR4_1_10h42h42lusqjj5x.R.inc(22184);return null;
        }

        }__CLR4_1_10h42h42lusqjj5x.R.inc(22185);if ((((lexer.token() != JSONToken.LBRACE && lexer.token() != JSONToken.COMMA)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22186)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22187)==0&false))) {{
            __CLR4_1_10h42h42lusqjj5x.R.inc(22188);throw new JSONException("syntax error: " + JSONToken.name(lexer.token()));
        }

        }__CLR4_1_10h42h42lusqjj5x.R.inc(22189);String declaringClass = null;
        __CLR4_1_10h42h42lusqjj5x.R.inc(22190);String methodName = null;
        __CLR4_1_10h42h42lusqjj5x.R.inc(22191);String fileName = null;
        __CLR4_1_10h42h42lusqjj5x.R.inc(22192);int lineNumber = 0;
        __CLR4_1_10h42h42lusqjj5x.R.inc(22193);String moduleName = null;
        __CLR4_1_10h42h42lusqjj5x.R.inc(22194);String moduleVersion = null;
        __CLR4_1_10h42h42lusqjj5x.R.inc(22195);String classLoaderName = null;

        __CLR4_1_10h42h42lusqjj5x.R.inc(22196);for (;;) {{
            // lexer.scanSymbol
            __CLR4_1_10h42h42lusqjj5x.R.inc(22197);String key = lexer.scanSymbol(parser.getSymbolTable());

            __CLR4_1_10h42h42lusqjj5x.R.inc(22198);if ((((key == null)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22199)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22200)==0&false))) {{
                __CLR4_1_10h42h42lusqjj5x.R.inc(22201);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22202)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22203)==0&false))) {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22204);lexer.nextToken(JSONToken.COMMA);
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22205);break;
                }
                }__CLR4_1_10h42h42lusqjj5x.R.inc(22206);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22207)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22208)==0&false))) {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22209);if ((((lexer.isEnabled(Feature.AllowArbitraryCommas))&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22210)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22211)==0&false))) {{
                        __CLR4_1_10h42h42lusqjj5x.R.inc(22212);continue;
                    }
                }}
            }}

            }__CLR4_1_10h42h42lusqjj5x.R.inc(22213);lexer.nextTokenWithColon(JSONToken.LITERAL_STRING);
            __CLR4_1_10h42h42lusqjj5x.R.inc(22214);if (((("className".equals(key))&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22215)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22216)==0&false))) {{
                __CLR4_1_10h42h42lusqjj5x.R.inc(22217);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22218)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22219)==0&false))) {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22220);declaringClass = null;
                } }else {__CLR4_1_10h42h42lusqjj5x.R.inc(22221);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22222)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22223)==0&false))) {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22224);declaringClass = lexer.stringVal();
                } }else {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22225);throw new JSONException("syntax error");
                }
            }}} }else {__CLR4_1_10h42h42lusqjj5x.R.inc(22226);if (((("methodName".equals(key))&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22227)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22228)==0&false))) {{
                __CLR4_1_10h42h42lusqjj5x.R.inc(22229);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22230)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22231)==0&false))) {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22232);methodName = null;
                } }else {__CLR4_1_10h42h42lusqjj5x.R.inc(22233);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22234)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22235)==0&false))) {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22236);methodName = lexer.stringVal();
                } }else {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22237);throw new JSONException("syntax error");
                }
            }}} }else {__CLR4_1_10h42h42lusqjj5x.R.inc(22238);if (((("fileName".equals(key))&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22239)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22240)==0&false))) {{
                __CLR4_1_10h42h42lusqjj5x.R.inc(22241);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22242)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22243)==0&false))) {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22244);fileName = null;
                } }else {__CLR4_1_10h42h42lusqjj5x.R.inc(22245);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22246)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22247)==0&false))) {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22248);fileName = lexer.stringVal();
                } }else {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22249);throw new JSONException("syntax error");
                }
            }}} }else {__CLR4_1_10h42h42lusqjj5x.R.inc(22250);if (((("lineNumber".equals(key))&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22251)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22252)==0&false))) {{
                __CLR4_1_10h42h42lusqjj5x.R.inc(22253);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22254)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22255)==0&false))) {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22256);lineNumber = 0;
                } }else {__CLR4_1_10h42h42lusqjj5x.R.inc(22257);if ((((lexer.token() == JSONToken.LITERAL_INT)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22258)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22259)==0&false))) {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22260);lineNumber = lexer.intValue();
                } }else {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22261);throw new JSONException("syntax error");
                }
            }}} }else {__CLR4_1_10h42h42lusqjj5x.R.inc(22262);if (((("nativeMethod".equals(key))&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22263)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22264)==0&false))) {{
                __CLR4_1_10h42h42lusqjj5x.R.inc(22265);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22266)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22267)==0&false))) {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22268);lexer.nextToken(JSONToken.COMMA);
                } }else {__CLR4_1_10h42h42lusqjj5x.R.inc(22269);if ((((lexer.token() == JSONToken.TRUE)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22270)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22271)==0&false))) {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22272);lexer.nextToken(JSONToken.COMMA);
                } }else {__CLR4_1_10h42h42lusqjj5x.R.inc(22273);if ((((lexer.token() == JSONToken.FALSE)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22274)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22275)==0&false))) {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22276);lexer.nextToken(JSONToken.COMMA);
                } }else {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22277);throw new JSONException("syntax error");
                }
            }}}} }else {__CLR4_1_10h42h42lusqjj5x.R.inc(22278);if ((((key == JSON.DEFAULT_TYPE_KEY)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22279)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22280)==0&false))) {{
               __CLR4_1_10h42h42lusqjj5x.R.inc(22281);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22282)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22283)==0&false))) {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22284);String elementType = lexer.stringVal();
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22285);if ((((!elementType.equals("java.lang.StackTraceElement"))&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22286)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22287)==0&false))) {{
                        __CLR4_1_10h42h42lusqjj5x.R.inc(22288);throw new JSONException("syntax error : " + elementType);    
                    }
                }} }else {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22289);if ((((lexer.token() != JSONToken.NULL)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22290)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22291)==0&false))) {{
                        __CLR4_1_10h42h42lusqjj5x.R.inc(22292);throw new JSONException("syntax error");
                    }
                }}
            }} }else {__CLR4_1_10h42h42lusqjj5x.R.inc(22293);if (((("moduleName".equals(key))&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22294)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22295)==0&false))) {{
                __CLR4_1_10h42h42lusqjj5x.R.inc(22296);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22297)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22298)==0&false))) {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22299);moduleName = null;
                } }else {__CLR4_1_10h42h42lusqjj5x.R.inc(22300);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22301)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22302)==0&false))) {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22303);moduleName = lexer.stringVal();
                } }else {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22304);throw new JSONException("syntax error");
                }
            }}} }else {__CLR4_1_10h42h42lusqjj5x.R.inc(22305);if (((("moduleVersion".equals(key))&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22306)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22307)==0&false))) {{
                __CLR4_1_10h42h42lusqjj5x.R.inc(22308);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22309)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22310)==0&false))) {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22311);moduleVersion = null;
                } }else {__CLR4_1_10h42h42lusqjj5x.R.inc(22312);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22313)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22314)==0&false))) {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22315);moduleVersion = lexer.stringVal();
                } }else {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22316);throw new JSONException("syntax error");
                }
            }}} }else {__CLR4_1_10h42h42lusqjj5x.R.inc(22317);if (((("classLoaderName".equals(key))&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22318)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22319)==0&false))) {{
                __CLR4_1_10h42h42lusqjj5x.R.inc(22320);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22321)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22322)==0&false))) {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22323);classLoaderName = null;
                } }else {__CLR4_1_10h42h42lusqjj5x.R.inc(22324);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22325)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22326)==0&false))) {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22327);classLoaderName = lexer.stringVal();
                } }else {{
                    __CLR4_1_10h42h42lusqjj5x.R.inc(22328);throw new JSONException("syntax error");
                }
            }}} }else {{
                __CLR4_1_10h42h42lusqjj5x.R.inc(22329);throw new JSONException("syntax error : " + key);
            }

            }}}}}}}}}__CLR4_1_10h42h42lusqjj5x.R.inc(22330);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_1_10h42h42lusqjj5x.R.iget(22331)!=0|true))||(__CLR4_1_10h42h42lusqjj5x.R.iget(22332)==0&false))) {{
                __CLR4_1_10h42h42lusqjj5x.R.inc(22333);lexer.nextToken(JSONToken.COMMA);
                __CLR4_1_10h42h42lusqjj5x.R.inc(22334);break;
            }
        }}
        }__CLR4_1_10h42h42lusqjj5x.R.inc(22335);return (T) new StackTraceElement(declaringClass, methodName, fileName, lineNumber);
    }finally{__CLR4_1_10h42h42lusqjj5x.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_1_10h42h42lusqjj5x.R.inc(22336);
        __CLR4_1_10h42h42lusqjj5x.R.inc(22337);return JSONToken.LBRACE;
    }finally{__CLR4_1_10h42h42lusqjj5x.R.flushNeeded();}}
}
