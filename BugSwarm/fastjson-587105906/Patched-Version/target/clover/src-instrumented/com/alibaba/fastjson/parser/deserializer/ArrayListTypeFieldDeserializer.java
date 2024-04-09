/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.parser.deserializer;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;

public class ArrayListTypeFieldDeserializer extends FieldDeserializer {public static class __CLR4_5_2eizeizlusvmqmx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,18994,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Type         itemType;
    private int                itemFastMatchToken;
    private ObjectDeserializer deserializer;

    public ArrayListTypeFieldDeserializer(ParserConfig mapping, Class<?> clazz, FieldInfo fieldInfo){
        super(clazz, fieldInfo);__CLR4_5_2eizeizlusvmqmx.R.inc(18828);try{__CLR4_5_2eizeizlusvmqmx.R.inc(18827);

        __CLR4_5_2eizeizlusvmqmx.R.inc(18829);Type fieldType = fieldInfo.fieldType;
        __CLR4_5_2eizeizlusvmqmx.R.inc(18830);if ((((fieldType instanceof ParameterizedType)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18831)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18832)==0&false))) {{
            __CLR4_5_2eizeizlusvmqmx.R.inc(18833);Type argType = ((ParameterizedType) fieldInfo.fieldType).getActualTypeArguments()[0];
            __CLR4_5_2eizeizlusvmqmx.R.inc(18834);if ((((argType instanceof WildcardType)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18835)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18836)==0&false))) {{
                __CLR4_5_2eizeizlusvmqmx.R.inc(18837);WildcardType wildcardType = (WildcardType) argType;
                __CLR4_5_2eizeizlusvmqmx.R.inc(18838);Type[] upperBounds = wildcardType.getUpperBounds();
                __CLR4_5_2eizeizlusvmqmx.R.inc(18839);if ((((upperBounds.length == 1)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18840)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18841)==0&false))) {{
                    __CLR4_5_2eizeizlusvmqmx.R.inc(18842);argType = upperBounds[0];
                }
            }}
            }__CLR4_5_2eizeizlusvmqmx.R.inc(18843);this.itemType = argType;
        } }else {{
            __CLR4_5_2eizeizlusvmqmx.R.inc(18844);this.itemType = Object.class;
        }
    }}finally{__CLR4_5_2eizeizlusvmqmx.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_5_2eizeizlusvmqmx.R.inc(18845);
        __CLR4_5_2eizeizlusvmqmx.R.inc(18846);return JSONToken.LBRACKET;
    }finally{__CLR4_5_2eizeizlusvmqmx.R.flushNeeded();}}

    @SuppressWarnings("rawtypes")
    @Override
    public void parseField(DefaultJSONParser parser, Object object, Type objectType, Map<String, Object> fieldValues) {try{__CLR4_5_2eizeizlusvmqmx.R.inc(18847);
        __CLR4_5_2eizeizlusvmqmx.R.inc(18848);JSONLexer lexer = parser.lexer;
        __CLR4_5_2eizeizlusvmqmx.R.inc(18849);final int token = lexer.token();
        __CLR4_5_2eizeizlusvmqmx.R.inc(18850);if ((((token == JSONToken.NULL
                || (token == JSONToken.LITERAL_STRING && lexer.stringVal().length() == 0))&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18851)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18852)==0&false))) {{
            __CLR4_5_2eizeizlusvmqmx.R.inc(18853);setValue(object, null);
            __CLR4_5_2eizeizlusvmqmx.R.inc(18854);return;
        }

        }__CLR4_5_2eizeizlusvmqmx.R.inc(18855);ArrayList list = new ArrayList();

        __CLR4_5_2eizeizlusvmqmx.R.inc(18856);ParseContext context = parser.getContext();

        __CLR4_5_2eizeizlusvmqmx.R.inc(18857);parser.setContext(context, object, fieldInfo.name);
        __CLR4_5_2eizeizlusvmqmx.R.inc(18858);parseArray(parser, objectType, list);
        __CLR4_5_2eizeizlusvmqmx.R.inc(18859);parser.setContext(context);

        __CLR4_5_2eizeizlusvmqmx.R.inc(18860);if ((((object == null)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18861)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18862)==0&false))) {{
            __CLR4_5_2eizeizlusvmqmx.R.inc(18863);fieldValues.put(fieldInfo.name, list);
        } }else {{
            __CLR4_5_2eizeizlusvmqmx.R.inc(18864);setValue(object, list);
        }
    }}finally{__CLR4_5_2eizeizlusvmqmx.R.flushNeeded();}}

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public final void parseArray(DefaultJSONParser parser, Type objectType, Collection array) {try{__CLR4_5_2eizeizlusvmqmx.R.inc(18865);
        __CLR4_5_2eizeizlusvmqmx.R.inc(18866);Type itemType = this.itemType;
        __CLR4_5_2eizeizlusvmqmx.R.inc(18867);ObjectDeserializer itemTypeDeser = this.deserializer;

        __CLR4_5_2eizeizlusvmqmx.R.inc(18868);if ((((objectType instanceof ParameterizedType)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18869)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18870)==0&false))) {{
            __CLR4_5_2eizeizlusvmqmx.R.inc(18871);if ((((itemType instanceof TypeVariable)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18872)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18873)==0&false))) {{
                __CLR4_5_2eizeizlusvmqmx.R.inc(18874);TypeVariable typeVar = (TypeVariable) itemType;
                __CLR4_5_2eizeizlusvmqmx.R.inc(18875);ParameterizedType paramType = (ParameterizedType) objectType;

                __CLR4_5_2eizeizlusvmqmx.R.inc(18876);Class<?> objectClass = null;
                __CLR4_5_2eizeizlusvmqmx.R.inc(18877);if ((((paramType.getRawType() instanceof Class)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18878)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18879)==0&false))) {{
                    __CLR4_5_2eizeizlusvmqmx.R.inc(18880);objectClass = (Class<?>) paramType.getRawType();
                }

                }__CLR4_5_2eizeizlusvmqmx.R.inc(18881);int paramIndex = -1;
                __CLR4_5_2eizeizlusvmqmx.R.inc(18882);if ((((objectClass != null)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18883)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18884)==0&false))) {{
                    __CLR4_5_2eizeizlusvmqmx.R.inc(18885);for (int i = 0, size = objectClass.getTypeParameters().length; (((i < size)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18886)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18887)==0&false)); ++i) {{
                        __CLR4_5_2eizeizlusvmqmx.R.inc(18888);TypeVariable item = objectClass.getTypeParameters()[i];
                        __CLR4_5_2eizeizlusvmqmx.R.inc(18889);if ((((item.getName().equals(typeVar.getName()))&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18890)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18891)==0&false))) {{
                            __CLR4_5_2eizeizlusvmqmx.R.inc(18892);paramIndex = i;
                            __CLR4_5_2eizeizlusvmqmx.R.inc(18893);break;
                        }
                    }}
                }}

                }__CLR4_5_2eizeizlusvmqmx.R.inc(18894);if ((((paramIndex != -1)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18895)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18896)==0&false))) {{
                    __CLR4_5_2eizeizlusvmqmx.R.inc(18897);itemType = paramType.getActualTypeArguments()[paramIndex];
                    __CLR4_5_2eizeizlusvmqmx.R.inc(18898);if ((((!itemType.equals(this.itemType))&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18899)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18900)==0&false))) {{
                        __CLR4_5_2eizeizlusvmqmx.R.inc(18901);itemTypeDeser = parser.getConfig().getDeserializer(itemType);
                    }
                }}
            }} }else {__CLR4_5_2eizeizlusvmqmx.R.inc(18902);if ((((itemType instanceof ParameterizedType)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18903)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18904)==0&false))) {{
                __CLR4_5_2eizeizlusvmqmx.R.inc(18905);ParameterizedType parameterizedItemType = (ParameterizedType) itemType;
                __CLR4_5_2eizeizlusvmqmx.R.inc(18906);Type[] itemActualTypeArgs = parameterizedItemType.getActualTypeArguments();
                __CLR4_5_2eizeizlusvmqmx.R.inc(18907);if ((((itemActualTypeArgs.length == 1 && itemActualTypeArgs[0] instanceof TypeVariable)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18908)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18909)==0&false))) {{
                    __CLR4_5_2eizeizlusvmqmx.R.inc(18910);TypeVariable typeVar = (TypeVariable) itemActualTypeArgs[0];
                    __CLR4_5_2eizeizlusvmqmx.R.inc(18911);ParameterizedType paramType = (ParameterizedType) objectType;

                    __CLR4_5_2eizeizlusvmqmx.R.inc(18912);Class<?> objectClass = null;
                    __CLR4_5_2eizeizlusvmqmx.R.inc(18913);if ((((paramType.getRawType() instanceof Class)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18914)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18915)==0&false))) {{
                        __CLR4_5_2eizeizlusvmqmx.R.inc(18916);objectClass = (Class<?>) paramType.getRawType();
                    }

                    }__CLR4_5_2eizeizlusvmqmx.R.inc(18917);int paramIndex = -1;
                    __CLR4_5_2eizeizlusvmqmx.R.inc(18918);if ((((objectClass != null)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18919)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18920)==0&false))) {{
                        __CLR4_5_2eizeizlusvmqmx.R.inc(18921);for (int i = 0, size = objectClass.getTypeParameters().length; (((i < size)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18922)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18923)==0&false)); ++i) {{
                            __CLR4_5_2eizeizlusvmqmx.R.inc(18924);TypeVariable item = objectClass.getTypeParameters()[i];
                            __CLR4_5_2eizeizlusvmqmx.R.inc(18925);if ((((item.getName().equals(typeVar.getName()))&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18926)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18927)==0&false))) {{
                                __CLR4_5_2eizeizlusvmqmx.R.inc(18928);paramIndex = i;
                                __CLR4_5_2eizeizlusvmqmx.R.inc(18929);break;
                            }
                        }}

                    }}

                    }__CLR4_5_2eizeizlusvmqmx.R.inc(18930);if ((((paramIndex != -1)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18931)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18932)==0&false))) {{
                        __CLR4_5_2eizeizlusvmqmx.R.inc(18933);itemActualTypeArgs[0] = paramType.getActualTypeArguments()[paramIndex];
                        __CLR4_5_2eizeizlusvmqmx.R.inc(18934);itemType = new ParameterizedTypeImpl(itemActualTypeArgs, parameterizedItemType.getOwnerType(), parameterizedItemType.getRawType());
                    }
                }}
            }}
        }}} }else {__CLR4_5_2eizeizlusvmqmx.R.inc(18935);if ((((itemType instanceof TypeVariable && objectType instanceof Class)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18936)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18937)==0&false))) {{
            __CLR4_5_2eizeizlusvmqmx.R.inc(18938);Class objectClass = (Class) objectType;
            __CLR4_5_2eizeizlusvmqmx.R.inc(18939);TypeVariable typeVar = (TypeVariable) itemType;
            __CLR4_5_2eizeizlusvmqmx.R.inc(18940);objectClass.getTypeParameters();

            __CLR4_5_2eizeizlusvmqmx.R.inc(18941);for (int i = 0, size = objectClass.getTypeParameters().length; (((i < size)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18942)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18943)==0&false)); ++i) {{
                __CLR4_5_2eizeizlusvmqmx.R.inc(18944);TypeVariable item = objectClass.getTypeParameters()[i];
                __CLR4_5_2eizeizlusvmqmx.R.inc(18945);if ((((item.getName().equals(typeVar.getName()))&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18946)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18947)==0&false))) {{
                    __CLR4_5_2eizeizlusvmqmx.R.inc(18948);Type[] bounds = item.getBounds();
                    __CLR4_5_2eizeizlusvmqmx.R.inc(18949);if ((((bounds.length == 1)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18950)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18951)==0&false))) {{
                        __CLR4_5_2eizeizlusvmqmx.R.inc(18952);itemType = bounds[0];
                    }
                    }__CLR4_5_2eizeizlusvmqmx.R.inc(18953);break;
                }
            }}
        }}

        }}__CLR4_5_2eizeizlusvmqmx.R.inc(18954);final JSONLexer lexer = parser.lexer;

        __CLR4_5_2eizeizlusvmqmx.R.inc(18955);final int token = lexer.token();
        __CLR4_5_2eizeizlusvmqmx.R.inc(18956);if ((((token == JSONToken.LBRACKET)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18957)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18958)==0&false))) {{
            __CLR4_5_2eizeizlusvmqmx.R.inc(18959);if ((((itemTypeDeser == null)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18960)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18961)==0&false))) {{
                __CLR4_5_2eizeizlusvmqmx.R.inc(18962);itemTypeDeser = deserializer = parser.getConfig().getDeserializer(itemType);
                __CLR4_5_2eizeizlusvmqmx.R.inc(18963);itemFastMatchToken = deserializer.getFastMatchToken();
            }

            }__CLR4_5_2eizeizlusvmqmx.R.inc(18964);lexer.nextToken(itemFastMatchToken);

            __CLR4_5_2eizeizlusvmqmx.R.inc(18965);for (int i = 0;; ++i) {{
                __CLR4_5_2eizeizlusvmqmx.R.inc(18966);if ((((lexer.isEnabled(Feature.AllowArbitraryCommas))&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18967)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18968)==0&false))) {{
                    __CLR4_5_2eizeizlusvmqmx.R.inc(18969);while ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18970)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18971)==0&false))) {{
                        __CLR4_5_2eizeizlusvmqmx.R.inc(18972);lexer.nextToken();
                        __CLR4_5_2eizeizlusvmqmx.R.inc(18973);continue;
                    }
                }}

                }__CLR4_5_2eizeizlusvmqmx.R.inc(18974);if ((((lexer.token() == JSONToken.RBRACKET)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18975)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18976)==0&false))) {{
                    __CLR4_5_2eizeizlusvmqmx.R.inc(18977);break;
                }

                }__CLR4_5_2eizeizlusvmqmx.R.inc(18978);Object val = itemTypeDeser.deserialze(parser, itemType, i);
                __CLR4_5_2eizeizlusvmqmx.R.inc(18979);array.add(val);

                __CLR4_5_2eizeizlusvmqmx.R.inc(18980);parser.checkListResolve(array);

                __CLR4_5_2eizeizlusvmqmx.R.inc(18981);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18982)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18983)==0&false))) {{
                    __CLR4_5_2eizeizlusvmqmx.R.inc(18984);lexer.nextToken(itemFastMatchToken);
                    __CLR4_5_2eizeizlusvmqmx.R.inc(18985);continue;
                }
            }}

            }__CLR4_5_2eizeizlusvmqmx.R.inc(18986);lexer.nextToken(JSONToken.COMMA);
        } }else {{
            __CLR4_5_2eizeizlusvmqmx.R.inc(18987);if ((((itemTypeDeser == null)&&(__CLR4_5_2eizeizlusvmqmx.R.iget(18988)!=0|true))||(__CLR4_5_2eizeizlusvmqmx.R.iget(18989)==0&false))) {{
                __CLR4_5_2eizeizlusvmqmx.R.inc(18990);itemTypeDeser = deserializer = parser.getConfig().getDeserializer(itemType);
            }
            }__CLR4_5_2eizeizlusvmqmx.R.inc(18991);Object val = itemTypeDeser.deserialze(parser, itemType, 0);
            __CLR4_5_2eizeizlusvmqmx.R.inc(18992);array.add(val);
            __CLR4_5_2eizeizlusvmqmx.R.inc(18993);parser.checkListResolve(array);
        }
    }}finally{__CLR4_5_2eizeizlusvmqmx.R.flushNeeded();}}
}
