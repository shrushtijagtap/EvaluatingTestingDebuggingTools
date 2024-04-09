/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//*
 * Copyright 1999-2018 Alibaba Group.
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
package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.TypeUtils;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class ObjectArrayCodec implements ObjectSerializer, ObjectDeserializer {public static class __CLR4_1_10lqnlqnlusqjlil{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,28363,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final ObjectArrayCodec instance = new ObjectArrayCodec();

    public ObjectArrayCodec(){try{__CLR4_1_10lqnlqnlusqjlil.R.inc(28175);
    }finally{__CLR4_1_10lqnlqnlusqjlil.R.flushNeeded();}}

    public final void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features)
                                                                                                       throws IOException {try{__CLR4_1_10lqnlqnlusqjlil.R.inc(28176);
        __CLR4_1_10lqnlqnlusqjlil.R.inc(28177);SerializeWriter out = serializer.out;

        __CLR4_1_10lqnlqnlusqjlil.R.inc(28178);Object[] array = (Object[]) object;

        __CLR4_1_10lqnlqnlusqjlil.R.inc(28179);if ((((object == null)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28180)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28181)==0&false))) {{
            __CLR4_1_10lqnlqnlusqjlil.R.inc(28182);out.writeNull(SerializerFeature.WriteNullListAsEmpty);
            __CLR4_1_10lqnlqnlusqjlil.R.inc(28183);return;
        }

        }__CLR4_1_10lqnlqnlusqjlil.R.inc(28184);int size = array.length;

        __CLR4_1_10lqnlqnlusqjlil.R.inc(28185);int end = size - 1;

        __CLR4_1_10lqnlqnlusqjlil.R.inc(28186);if ((((end == -1)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28187)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28188)==0&false))) {{
            __CLR4_1_10lqnlqnlusqjlil.R.inc(28189);out.append("[]");
            __CLR4_1_10lqnlqnlusqjlil.R.inc(28190);return;
        }

        }__CLR4_1_10lqnlqnlusqjlil.R.inc(28191);SerialContext context = serializer.context;
        __CLR4_1_10lqnlqnlusqjlil.R.inc(28192);serializer.setContext(context, object, fieldName, 0);

        __CLR4_1_10lqnlqnlusqjlil.R.inc(28193);try {
            __CLR4_1_10lqnlqnlusqjlil.R.inc(28194);Class<?> preClazz = null;
            __CLR4_1_10lqnlqnlusqjlil.R.inc(28195);ObjectSerializer preWriter = null;
            __CLR4_1_10lqnlqnlusqjlil.R.inc(28196);out.append('[');

            __CLR4_1_10lqnlqnlusqjlil.R.inc(28197);if ((((out.isEnabled(SerializerFeature.PrettyFormat))&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28198)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28199)==0&false))) {{
                __CLR4_1_10lqnlqnlusqjlil.R.inc(28200);serializer.incrementIndent();
                __CLR4_1_10lqnlqnlusqjlil.R.inc(28201);serializer.println();
                __CLR4_1_10lqnlqnlusqjlil.R.inc(28202);for (int i = 0; (((i < size)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28203)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28204)==0&false)); ++i) {{
                    __CLR4_1_10lqnlqnlusqjlil.R.inc(28205);if ((((i != 0)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28206)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28207)==0&false))) {{
                        __CLR4_1_10lqnlqnlusqjlil.R.inc(28208);out.write(',');
                        __CLR4_1_10lqnlqnlusqjlil.R.inc(28209);serializer.println();
                    }
                    }__CLR4_1_10lqnlqnlusqjlil.R.inc(28210);serializer.write(array[i]);
                }
                }__CLR4_1_10lqnlqnlusqjlil.R.inc(28211);serializer.decrementIdent();
                __CLR4_1_10lqnlqnlusqjlil.R.inc(28212);serializer.println();
                __CLR4_1_10lqnlqnlusqjlil.R.inc(28213);out.write(']');
                __CLR4_1_10lqnlqnlusqjlil.R.inc(28214);return;
            }

            }__CLR4_1_10lqnlqnlusqjlil.R.inc(28215);for (int i = 0; (((i < end)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28216)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28217)==0&false)); ++i) {{
                __CLR4_1_10lqnlqnlusqjlil.R.inc(28218);Object item = array[i];

                __CLR4_1_10lqnlqnlusqjlil.R.inc(28219);if ((((item == null)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28220)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28221)==0&false))) {{
                    __CLR4_1_10lqnlqnlusqjlil.R.inc(28222);out.append("null,");
                } }else {{
                    __CLR4_1_10lqnlqnlusqjlil.R.inc(28223);if ((((serializer.containsReference(item))&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28224)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28225)==0&false))) {{
                        __CLR4_1_10lqnlqnlusqjlil.R.inc(28226);serializer.writeReference(item);
                    } }else {{
                        __CLR4_1_10lqnlqnlusqjlil.R.inc(28227);Class<?> clazz = item.getClass();

                        __CLR4_1_10lqnlqnlusqjlil.R.inc(28228);if ((((clazz == preClazz)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28229)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28230)==0&false))) {{
                            __CLR4_1_10lqnlqnlusqjlil.R.inc(28231);preWriter.write(serializer, item, i, null, 0);
                        } }else {{
                            __CLR4_1_10lqnlqnlusqjlil.R.inc(28232);preClazz = clazz;
                            __CLR4_1_10lqnlqnlusqjlil.R.inc(28233);preWriter = serializer.getObjectWriter(clazz);

                            __CLR4_1_10lqnlqnlusqjlil.R.inc(28234);preWriter.write(serializer, item, i, null, 0);
                        }
                    }}
                    }__CLR4_1_10lqnlqnlusqjlil.R.inc(28235);out.append(',');
                }
            }}

            }__CLR4_1_10lqnlqnlusqjlil.R.inc(28236);Object item = array[end];

            __CLR4_1_10lqnlqnlusqjlil.R.inc(28237);if ((((item == null)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28238)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28239)==0&false))) {{
                __CLR4_1_10lqnlqnlusqjlil.R.inc(28240);out.append("null]");
            } }else {{
                __CLR4_1_10lqnlqnlusqjlil.R.inc(28241);if ((((serializer.containsReference(item))&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28242)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28243)==0&false))) {{
                    __CLR4_1_10lqnlqnlusqjlil.R.inc(28244);serializer.writeReference(item);
                } }else {{
                    __CLR4_1_10lqnlqnlusqjlil.R.inc(28245);serializer.writeWithFieldName(item, end);
                }
                }__CLR4_1_10lqnlqnlusqjlil.R.inc(28246);out.append(']');
            }
        }} finally {
            __CLR4_1_10lqnlqnlusqjlil.R.inc(28247);serializer.context = context;
        }
    }finally{__CLR4_1_10lqnlqnlusqjlil.R.flushNeeded();}}
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_1_10lqnlqnlusqjlil.R.inc(28248);
        __CLR4_1_10lqnlqnlusqjlil.R.inc(28249);final JSONLexer lexer = parser.lexer;
        __CLR4_1_10lqnlqnlusqjlil.R.inc(28250);int token = lexer.token();
        __CLR4_1_10lqnlqnlusqjlil.R.inc(28251);if ((((token == JSONToken.NULL)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28252)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28253)==0&false))) {{
            __CLR4_1_10lqnlqnlusqjlil.R.inc(28254);lexer.nextToken(JSONToken.COMMA);
            __CLR4_1_10lqnlqnlusqjlil.R.inc(28255);return null;
        }

        }__CLR4_1_10lqnlqnlusqjlil.R.inc(28256);if ((((token == JSONToken.LITERAL_STRING || token == JSONToken.HEX)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28257)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28258)==0&false))) {{
            __CLR4_1_10lqnlqnlusqjlil.R.inc(28259);byte[] bytes = lexer.bytesValue();
            __CLR4_1_10lqnlqnlusqjlil.R.inc(28260);lexer.nextToken(JSONToken.COMMA);

            __CLR4_1_10lqnlqnlusqjlil.R.inc(28261);if ((((bytes.length == 0 && type != byte[].class)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28262)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28263)==0&false))) {{
                __CLR4_1_10lqnlqnlusqjlil.R.inc(28264);return null;
            }

            }__CLR4_1_10lqnlqnlusqjlil.R.inc(28265);return (T) bytes;
        }

        }__CLR4_1_10lqnlqnlusqjlil.R.inc(28266);Class componentClass;
        __CLR4_1_10lqnlqnlusqjlil.R.inc(28267);Type componentType;
        __CLR4_1_10lqnlqnlusqjlil.R.inc(28268);if ((((type instanceof GenericArrayType)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28269)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28270)==0&false))) {{
            __CLR4_1_10lqnlqnlusqjlil.R.inc(28271);GenericArrayType clazz = (GenericArrayType) type;
            __CLR4_1_10lqnlqnlusqjlil.R.inc(28272);componentType = clazz.getGenericComponentType();
            __CLR4_1_10lqnlqnlusqjlil.R.inc(28273);if ((((componentType instanceof TypeVariable)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28274)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28275)==0&false))) {{
                __CLR4_1_10lqnlqnlusqjlil.R.inc(28276);TypeVariable typeVar = (TypeVariable) componentType;
                __CLR4_1_10lqnlqnlusqjlil.R.inc(28277);Type objType = parser.getContext().type;
                __CLR4_1_10lqnlqnlusqjlil.R.inc(28278);if ((((objType instanceof ParameterizedType)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28279)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28280)==0&false))) {{
                    __CLR4_1_10lqnlqnlusqjlil.R.inc(28281);ParameterizedType objParamType = (ParameterizedType) objType;
                    __CLR4_1_10lqnlqnlusqjlil.R.inc(28282);Type objRawType = objParamType.getRawType();
                    __CLR4_1_10lqnlqnlusqjlil.R.inc(28283);Type actualType = null;
                    __CLR4_1_10lqnlqnlusqjlil.R.inc(28284);if ((((objRawType instanceof Class)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28285)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28286)==0&false))) {{
                        __CLR4_1_10lqnlqnlusqjlil.R.inc(28287);TypeVariable[] objTypeParams = ((Class) objRawType).getTypeParameters();
                        __CLR4_1_10lqnlqnlusqjlil.R.inc(28288);for (int i = 0; (((i < objTypeParams.length)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28289)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28290)==0&false)); ++i) {{
                            __CLR4_1_10lqnlqnlusqjlil.R.inc(28291);if ((((objTypeParams[i].getName().equals(typeVar.getName()))&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28292)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28293)==0&false))) {{
                                __CLR4_1_10lqnlqnlusqjlil.R.inc(28294);actualType = objParamType.getActualTypeArguments()[i];
                            }
                        }}
                    }}
                    }__CLR4_1_10lqnlqnlusqjlil.R.inc(28295);if ((((actualType instanceof Class)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28296)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28297)==0&false))) {{
                        __CLR4_1_10lqnlqnlusqjlil.R.inc(28298);componentClass = (Class) actualType;
                    } }else {{
                        __CLR4_1_10lqnlqnlusqjlil.R.inc(28299);componentClass = Object.class;
                    }
                }} }else {{
                    __CLR4_1_10lqnlqnlusqjlil.R.inc(28300);componentClass = TypeUtils.getClass(typeVar.getBounds()[0]);
                }
            }} }else {{
                __CLR4_1_10lqnlqnlusqjlil.R.inc(28301);componentClass = TypeUtils.getClass(componentType);
            }
        }} }else {{
            __CLR4_1_10lqnlqnlusqjlil.R.inc(28302);Class clazz = (Class) type;
            __CLR4_1_10lqnlqnlusqjlil.R.inc(28303);componentType = componentClass = clazz.getComponentType();
        }
        }__CLR4_1_10lqnlqnlusqjlil.R.inc(28304);JSONArray array = new JSONArray();
        __CLR4_1_10lqnlqnlusqjlil.R.inc(28305);parser.parseArray(componentType, array, fieldName);

        __CLR4_1_10lqnlqnlusqjlil.R.inc(28306);return (T) toObjectArray(parser, componentClass, array);
    }finally{__CLR4_1_10lqnlqnlusqjlil.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    private <T> T toObjectArray(DefaultJSONParser parser, Class<?> componentType, JSONArray array) {try{__CLR4_1_10lqnlqnlusqjlil.R.inc(28307);
        __CLR4_1_10lqnlqnlusqjlil.R.inc(28308);if ((((array == null)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28309)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28310)==0&false))) {{
            __CLR4_1_10lqnlqnlusqjlil.R.inc(28311);return null;
        }

        }__CLR4_1_10lqnlqnlusqjlil.R.inc(28312);int size = array.size();

        __CLR4_1_10lqnlqnlusqjlil.R.inc(28313);Object objArray = Array.newInstance(componentType, size);
        __CLR4_1_10lqnlqnlusqjlil.R.inc(28314);for (int i = 0; (((i < size)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28315)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28316)==0&false)); ++i) {{
            __CLR4_1_10lqnlqnlusqjlil.R.inc(28317);Object value = array.get(i);

            __CLR4_1_10lqnlqnlusqjlil.R.inc(28318);if ((((value == array)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28319)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28320)==0&false))) {{
                __CLR4_1_10lqnlqnlusqjlil.R.inc(28321);Array.set(objArray, i, objArray);
                __CLR4_1_10lqnlqnlusqjlil.R.inc(28322);continue;
            }

            }__CLR4_1_10lqnlqnlusqjlil.R.inc(28323);if ((((componentType.isArray())&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28324)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28325)==0&false))) {{
                __CLR4_1_10lqnlqnlusqjlil.R.inc(28326);Object element;
                __CLR4_1_10lqnlqnlusqjlil.R.inc(28327);if ((((componentType.isInstance(value))&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28328)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28329)==0&false))) {{
                    __CLR4_1_10lqnlqnlusqjlil.R.inc(28330);element = value;
                } }else {{
                    __CLR4_1_10lqnlqnlusqjlil.R.inc(28331);element = toObjectArray(parser, componentType, (JSONArray) value);
                }

                }__CLR4_1_10lqnlqnlusqjlil.R.inc(28332);Array.set(objArray, i, element);
            } }else {{
                __CLR4_1_10lqnlqnlusqjlil.R.inc(28333);Object element = null;
                __CLR4_1_10lqnlqnlusqjlil.R.inc(28334);if ((((value instanceof JSONArray)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28335)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28336)==0&false))) {{
                    __CLR4_1_10lqnlqnlusqjlil.R.inc(28337);boolean contains = false;
                    __CLR4_1_10lqnlqnlusqjlil.R.inc(28338);JSONArray valueArray = (JSONArray) value;
                    __CLR4_1_10lqnlqnlusqjlil.R.inc(28339);int valueArraySize = valueArray.size();
                    __CLR4_1_10lqnlqnlusqjlil.R.inc(28340);for (int y = 0; (((y < valueArraySize)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28341)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28342)==0&false)); ++y) {{
                        __CLR4_1_10lqnlqnlusqjlil.R.inc(28343);Object valueItem = valueArray.get(y);
                        __CLR4_1_10lqnlqnlusqjlil.R.inc(28344);if ((((valueItem == array)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28345)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28346)==0&false))) {{
                            __CLR4_1_10lqnlqnlusqjlil.R.inc(28347);valueArray.set(i, objArray);
                            __CLR4_1_10lqnlqnlusqjlil.R.inc(28348);contains = true;
                        }
                    }}
                    }__CLR4_1_10lqnlqnlusqjlil.R.inc(28349);if ((((contains)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28350)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28351)==0&false))) {{
                        __CLR4_1_10lqnlqnlusqjlil.R.inc(28352);element = valueArray.toArray();
                    }
                }}

                }__CLR4_1_10lqnlqnlusqjlil.R.inc(28353);if ((((element == null)&&(__CLR4_1_10lqnlqnlusqjlil.R.iget(28354)!=0|true))||(__CLR4_1_10lqnlqnlusqjlil.R.iget(28355)==0&false))) {{
                    __CLR4_1_10lqnlqnlusqjlil.R.inc(28356);element = TypeUtils.cast(value, componentType, parser.getConfig());
                }
                }__CLR4_1_10lqnlqnlusqjlil.R.inc(28357);Array.set(objArray, i, element);

            }
        }}

        }__CLR4_1_10lqnlqnlusqjlil.R.inc(28358);array.setRelatedArray(objArray);
        __CLR4_1_10lqnlqnlusqjlil.R.inc(28359);array.setComponentType(componentType);
        __CLR4_1_10lqnlqnlusqjlil.R.inc(28360);return (T) objArray; // TODO
    }finally{__CLR4_1_10lqnlqnlusqjlil.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_1_10lqnlqnlusqjlil.R.inc(28361);
        __CLR4_1_10lqnlqnlusqjlil.R.inc(28362);return JSONToken.LBRACKET;
    }finally{__CLR4_1_10lqnlqnlusqjlil.R.flushNeeded();}}
}
