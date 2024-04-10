/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.parser.deserializer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.ParserConfig;

public class ThrowableDeserializer extends JavaBeanDeserializer {public static class __CLR4_1_10h8ih8iluszvyjm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,22511,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public ThrowableDeserializer(ParserConfig mapping, Class<?> clazz){
        super(mapping, clazz, clazz);__CLR4_1_10h8ih8iluszvyjm.R.inc(22339);try{__CLR4_1_10h8ih8iluszvyjm.R.inc(22338);
    }finally{__CLR4_1_10h8ih8iluszvyjm.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_1_10h8ih8iluszvyjm.R.inc(22340);
        __CLR4_1_10h8ih8iluszvyjm.R.inc(22341);JSONLexer lexer = parser.lexer;
        
        __CLR4_1_10h8ih8iluszvyjm.R.inc(22342);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22343)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22344)==0&false))) {{
            __CLR4_1_10h8ih8iluszvyjm.R.inc(22345);lexer.nextToken();
            __CLR4_1_10h8ih8iluszvyjm.R.inc(22346);return null;
        }

        }__CLR4_1_10h8ih8iluszvyjm.R.inc(22347);if ((((parser.getResolveStatus() == DefaultJSONParser.TypeNameRedirect)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22348)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22349)==0&false))) {{
            __CLR4_1_10h8ih8iluszvyjm.R.inc(22350);parser.setResolveStatus(DefaultJSONParser.NONE);
        } }else {{
            __CLR4_1_10h8ih8iluszvyjm.R.inc(22351);if ((((lexer.token() != JSONToken.LBRACE)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22352)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22353)==0&false))) {{
                __CLR4_1_10h8ih8iluszvyjm.R.inc(22354);throw new JSONException("syntax error");
            }
        }}

        }__CLR4_1_10h8ih8iluszvyjm.R.inc(22355);Throwable cause = null;
        __CLR4_1_10h8ih8iluszvyjm.R.inc(22356);Class<?> exClass = null;
        
        __CLR4_1_10h8ih8iluszvyjm.R.inc(22357);if ((((type != null && type instanceof Class)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22358)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22359)==0&false))) {{
        	__CLR4_1_10h8ih8iluszvyjm.R.inc(22360);Class<?> clazz = (Class<?>) type;
        	__CLR4_1_10h8ih8iluszvyjm.R.inc(22361);if ((((Throwable.class.isAssignableFrom(clazz))&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22362)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22363)==0&false))) {{
        		__CLR4_1_10h8ih8iluszvyjm.R.inc(22364);exClass = clazz;
        	}
        }}
        
        }__CLR4_1_10h8ih8iluszvyjm.R.inc(22365);String message = null;
        __CLR4_1_10h8ih8iluszvyjm.R.inc(22366);StackTraceElement[] stackTrace = null;
        __CLR4_1_10h8ih8iluszvyjm.R.inc(22367);Map<String, Object> otherValues = null;


        __CLR4_1_10h8ih8iluszvyjm.R.inc(22368);for (;;) {{
            // lexer.scanSymbol
            __CLR4_1_10h8ih8iluszvyjm.R.inc(22369);String key = lexer.scanSymbol(parser.getSymbolTable());

            __CLR4_1_10h8ih8iluszvyjm.R.inc(22370);if ((((key == null)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22371)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22372)==0&false))) {{
                __CLR4_1_10h8ih8iluszvyjm.R.inc(22373);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22374)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22375)==0&false))) {{
                    __CLR4_1_10h8ih8iluszvyjm.R.inc(22376);lexer.nextToken(JSONToken.COMMA);
                    __CLR4_1_10h8ih8iluszvyjm.R.inc(22377);break;
                }
                }__CLR4_1_10h8ih8iluszvyjm.R.inc(22378);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22379)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22380)==0&false))) {{
                    __CLR4_1_10h8ih8iluszvyjm.R.inc(22381);if ((((lexer.isEnabled(Feature.AllowArbitraryCommas))&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22382)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22383)==0&false))) {{
                        __CLR4_1_10h8ih8iluszvyjm.R.inc(22384);continue;
                    }
                }}
            }}

            }__CLR4_1_10h8ih8iluszvyjm.R.inc(22385);lexer.nextTokenWithColon(JSONToken.LITERAL_STRING);

            __CLR4_1_10h8ih8iluszvyjm.R.inc(22386);if ((((JSON.DEFAULT_TYPE_KEY.equals(key))&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22387)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22388)==0&false))) {{
                __CLR4_1_10h8ih8iluszvyjm.R.inc(22389);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22390)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22391)==0&false))) {{
                    __CLR4_1_10h8ih8iluszvyjm.R.inc(22392);String exClassName = lexer.stringVal();
                    __CLR4_1_10h8ih8iluszvyjm.R.inc(22393);exClass = parser.getConfig().checkAutoType(exClassName, Throwable.class, lexer.getFeatures());
                } }else {{
                    __CLR4_1_10h8ih8iluszvyjm.R.inc(22394);throw new JSONException("syntax error");
                }
                }__CLR4_1_10h8ih8iluszvyjm.R.inc(22395);lexer.nextToken(JSONToken.COMMA);
            } }else {__CLR4_1_10h8ih8iluszvyjm.R.inc(22396);if (((("message".equals(key))&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22397)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22398)==0&false))) {{
                __CLR4_1_10h8ih8iluszvyjm.R.inc(22399);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22400)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22401)==0&false))) {{
                    __CLR4_1_10h8ih8iluszvyjm.R.inc(22402);message = null;
                } }else {__CLR4_1_10h8ih8iluszvyjm.R.inc(22403);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22404)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22405)==0&false))) {{
                    __CLR4_1_10h8ih8iluszvyjm.R.inc(22406);message = lexer.stringVal();
                } }else {{
                    __CLR4_1_10h8ih8iluszvyjm.R.inc(22407);throw new JSONException("syntax error");
                }
                }}__CLR4_1_10h8ih8iluszvyjm.R.inc(22408);lexer.nextToken();
            } }else {__CLR4_1_10h8ih8iluszvyjm.R.inc(22409);if (((("cause".equals(key))&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22410)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22411)==0&false))) {{
                __CLR4_1_10h8ih8iluszvyjm.R.inc(22412);cause = deserialze(parser, null, "cause");
            } }else {__CLR4_1_10h8ih8iluszvyjm.R.inc(22413);if (((("stackTrace".equals(key))&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22414)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22415)==0&false))) {{
                __CLR4_1_10h8ih8iluszvyjm.R.inc(22416);stackTrace = parser.parseObject(StackTraceElement[].class);
            } }else {{
                __CLR4_1_10h8ih8iluszvyjm.R.inc(22417);if ((((otherValues == null)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22418)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22419)==0&false))) {{
                    __CLR4_1_10h8ih8iluszvyjm.R.inc(22420);otherValues = new HashMap<String, Object>();
                }
                }__CLR4_1_10h8ih8iluszvyjm.R.inc(22421);otherValues.put(key, parser.parse());
            }

            }}}}__CLR4_1_10h8ih8iluszvyjm.R.inc(22422);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22423)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22424)==0&false))) {{
                __CLR4_1_10h8ih8iluszvyjm.R.inc(22425);lexer.nextToken(JSONToken.COMMA);
                __CLR4_1_10h8ih8iluszvyjm.R.inc(22426);break;
            }
        }}

        }__CLR4_1_10h8ih8iluszvyjm.R.inc(22427);Throwable ex = null;
        __CLR4_1_10h8ih8iluszvyjm.R.inc(22428);if ((((exClass == null)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22429)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22430)==0&false))) {{
            __CLR4_1_10h8ih8iluszvyjm.R.inc(22431);ex = new Exception(message, cause);
        } }else {{
            __CLR4_1_10h8ih8iluszvyjm.R.inc(22432);if ((((!Throwable.class.isAssignableFrom(exClass))&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22433)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22434)==0&false))) {{
                __CLR4_1_10h8ih8iluszvyjm.R.inc(22435);throw new JSONException("type not match, not Throwable. " + exClass.getName());
            }

            }__CLR4_1_10h8ih8iluszvyjm.R.inc(22436);try {
                __CLR4_1_10h8ih8iluszvyjm.R.inc(22437);ex = createException(message, cause, exClass);
                __CLR4_1_10h8ih8iluszvyjm.R.inc(22438);if ((((ex == null)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22439)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22440)==0&false))) {{
                    __CLR4_1_10h8ih8iluszvyjm.R.inc(22441);ex = new Exception(message, cause);
                }
            }} catch (Exception e) {
                __CLR4_1_10h8ih8iluszvyjm.R.inc(22442);throw new JSONException("create instance error", e);
            }
        }

        }__CLR4_1_10h8ih8iluszvyjm.R.inc(22443);if ((((stackTrace != null)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22444)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22445)==0&false))) {{
            __CLR4_1_10h8ih8iluszvyjm.R.inc(22446);ex.setStackTrace(stackTrace);
        }

        }__CLR4_1_10h8ih8iluszvyjm.R.inc(22447);if ((((otherValues != null)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22448)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22449)==0&false))) {{
            __CLR4_1_10h8ih8iluszvyjm.R.inc(22450);JavaBeanDeserializer exBeanDeser = null;

            __CLR4_1_10h8ih8iluszvyjm.R.inc(22451);if ((((exClass != null)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22452)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22453)==0&false))) {{
                __CLR4_1_10h8ih8iluszvyjm.R.inc(22454);if ((((exClass == clazz)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22455)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22456)==0&false))) {{
                    __CLR4_1_10h8ih8iluszvyjm.R.inc(22457);exBeanDeser = this;
                } }else {{
                    __CLR4_1_10h8ih8iluszvyjm.R.inc(22458);ObjectDeserializer exDeser = parser.getConfig().getDeserializer(exClass);
                    __CLR4_1_10h8ih8iluszvyjm.R.inc(22459);if ((((exDeser instanceof JavaBeanDeserializer)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22460)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22461)==0&false))) {{
                        __CLR4_1_10h8ih8iluszvyjm.R.inc(22462);exBeanDeser = (JavaBeanDeserializer) exDeser;
                    }
                }}
            }}

            }__CLR4_1_10h8ih8iluszvyjm.R.inc(22463);if ((((exBeanDeser != null)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22464)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22465)==0&false))) {{
                __CLR4_1_10h8ih8iluszvyjm.R.inc(22466);for (Map.Entry<String, Object> entry : otherValues.entrySet()) {{
                    __CLR4_1_10h8ih8iluszvyjm.R.inc(22467);String key = entry.getKey();
                    __CLR4_1_10h8ih8iluszvyjm.R.inc(22468);Object value = entry.getValue();

                    __CLR4_1_10h8ih8iluszvyjm.R.inc(22469);FieldDeserializer fieldDeserializer = exBeanDeser.getFieldDeserializer(key);
                    __CLR4_1_10h8ih8iluszvyjm.R.inc(22470);if ((((fieldDeserializer != null)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22471)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22472)==0&false))) {{
                        __CLR4_1_10h8ih8iluszvyjm.R.inc(22473);fieldDeserializer.setValue(ex, value);
                    }
                }}
            }}
        }}

        }__CLR4_1_10h8ih8iluszvyjm.R.inc(22474);return (T) ex;
    }finally{__CLR4_1_10h8ih8iluszvyjm.R.flushNeeded();}}

    private Throwable createException(String message, Throwable cause, Class<?> exClass) throws Exception {try{__CLR4_1_10h8ih8iluszvyjm.R.inc(22475);
        __CLR4_1_10h8ih8iluszvyjm.R.inc(22476);Constructor<?> defaultConstructor = null;
        __CLR4_1_10h8ih8iluszvyjm.R.inc(22477);Constructor<?> messageConstructor = null;
        __CLR4_1_10h8ih8iluszvyjm.R.inc(22478);Constructor<?> causeConstructor = null;
        __CLR4_1_10h8ih8iluszvyjm.R.inc(22479);for (Constructor<?> constructor : exClass.getConstructors()) {{
        	__CLR4_1_10h8ih8iluszvyjm.R.inc(22480);Class<?>[] types = constructor.getParameterTypes();
            __CLR4_1_10h8ih8iluszvyjm.R.inc(22481);if ((((types.length == 0)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22482)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22483)==0&false))) {{
                __CLR4_1_10h8ih8iluszvyjm.R.inc(22484);defaultConstructor = constructor;
                __CLR4_1_10h8ih8iluszvyjm.R.inc(22485);continue;
            }

            }__CLR4_1_10h8ih8iluszvyjm.R.inc(22486);if ((((types.length == 1 && types[0] == String.class)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22487)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22488)==0&false))) {{
                __CLR4_1_10h8ih8iluszvyjm.R.inc(22489);messageConstructor = constructor;
                __CLR4_1_10h8ih8iluszvyjm.R.inc(22490);continue;
            }

            }__CLR4_1_10h8ih8iluszvyjm.R.inc(22491);if ((((types.length == 2 && types[0] == String.class && types[1] == Throwable.class)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22492)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22493)==0&false))) {{
                __CLR4_1_10h8ih8iluszvyjm.R.inc(22494);causeConstructor = constructor;
                __CLR4_1_10h8ih8iluszvyjm.R.inc(22495);continue;
            }
        }}

        }__CLR4_1_10h8ih8iluszvyjm.R.inc(22496);if ((((causeConstructor != null)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22497)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22498)==0&false))) {{
            __CLR4_1_10h8ih8iluszvyjm.R.inc(22499);return (Throwable) causeConstructor.newInstance(message, cause);
        }

        }__CLR4_1_10h8ih8iluszvyjm.R.inc(22500);if ((((messageConstructor != null)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22501)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22502)==0&false))) {{
            __CLR4_1_10h8ih8iluszvyjm.R.inc(22503);return (Throwable) messageConstructor.newInstance(message);
        }

        }__CLR4_1_10h8ih8iluszvyjm.R.inc(22504);if ((((defaultConstructor != null)&&(__CLR4_1_10h8ih8iluszvyjm.R.iget(22505)!=0|true))||(__CLR4_1_10h8ih8iluszvyjm.R.iget(22506)==0&false))) {{
            __CLR4_1_10h8ih8iluszvyjm.R.inc(22507);return (Throwable) defaultConstructor.newInstance();
        }

        }__CLR4_1_10h8ih8iluszvyjm.R.inc(22508);return null;
    }finally{__CLR4_1_10h8ih8iluszvyjm.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_1_10h8ih8iluszvyjm.R.inc(22509);
        __CLR4_1_10h8ih8iluszvyjm.R.inc(22510);return JSONToken.LBRACE;
    }finally{__CLR4_1_10h8ih8iluszvyjm.R.flushNeeded();}}
}
