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
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.TypeUtils;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class CollectionCodec implements ObjectSerializer, ObjectDeserializer {public static class __CLR4_1_10jgpjgpluszvz1h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,25306,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final static CollectionCodec instance = new CollectionCodec();

    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {try{__CLR4_1_10jgpjgpluszvz1h.R.inc(25225);
        __CLR4_1_10jgpjgpluszvz1h.R.inc(25226);SerializeWriter out = serializer.out;

        __CLR4_1_10jgpjgpluszvz1h.R.inc(25227);if ((((object == null)&&(__CLR4_1_10jgpjgpluszvz1h.R.iget(25228)!=0|true))||(__CLR4_1_10jgpjgpluszvz1h.R.iget(25229)==0&false))) {{
            __CLR4_1_10jgpjgpluszvz1h.R.inc(25230);out.writeNull(SerializerFeature.WriteNullListAsEmpty);
            __CLR4_1_10jgpjgpluszvz1h.R.inc(25231);return;
        }

        }__CLR4_1_10jgpjgpluszvz1h.R.inc(25232);Type elementType = null;
        __CLR4_1_10jgpjgpluszvz1h.R.inc(25233);if ((((out.isEnabled(SerializerFeature.WriteClassName)
                || SerializerFeature.isEnabled(features, SerializerFeature.WriteClassName))&&(__CLR4_1_10jgpjgpluszvz1h.R.iget(25234)!=0|true))||(__CLR4_1_10jgpjgpluszvz1h.R.iget(25235)==0&false)))
        {{
            __CLR4_1_10jgpjgpluszvz1h.R.inc(25236);elementType = TypeUtils.getCollectionItemType(fieldType);
        }

        }__CLR4_1_10jgpjgpluszvz1h.R.inc(25237);Collection<?> collection = (Collection<?>) object;

        __CLR4_1_10jgpjgpluszvz1h.R.inc(25238);SerialContext context = serializer.context;
        __CLR4_1_10jgpjgpluszvz1h.R.inc(25239);serializer.setContext(context, object, fieldName, 0);

        __CLR4_1_10jgpjgpluszvz1h.R.inc(25240);if ((((out.isEnabled(SerializerFeature.WriteClassName))&&(__CLR4_1_10jgpjgpluszvz1h.R.iget(25241)!=0|true))||(__CLR4_1_10jgpjgpluszvz1h.R.iget(25242)==0&false))) {{
            __CLR4_1_10jgpjgpluszvz1h.R.inc(25243);if ((((HashSet.class == collection.getClass())&&(__CLR4_1_10jgpjgpluszvz1h.R.iget(25244)!=0|true))||(__CLR4_1_10jgpjgpluszvz1h.R.iget(25245)==0&false))) {{
                __CLR4_1_10jgpjgpluszvz1h.R.inc(25246);out.append("Set");
            } }else {__CLR4_1_10jgpjgpluszvz1h.R.inc(25247);if ((((TreeSet.class == collection.getClass())&&(__CLR4_1_10jgpjgpluszvz1h.R.iget(25248)!=0|true))||(__CLR4_1_10jgpjgpluszvz1h.R.iget(25249)==0&false))) {{
                __CLR4_1_10jgpjgpluszvz1h.R.inc(25250);out.append("TreeSet");
            }
        }}}

        }__CLR4_1_10jgpjgpluszvz1h.R.inc(25251);try {
            __CLR4_1_10jgpjgpluszvz1h.R.inc(25252);int i = 0;
            __CLR4_1_10jgpjgpluszvz1h.R.inc(25253);out.append('[');
            __CLR4_1_10jgpjgpluszvz1h.R.inc(25254);for (Object item : collection) {{

                __CLR4_1_10jgpjgpluszvz1h.R.inc(25255);if ((((i++ != 0)&&(__CLR4_1_10jgpjgpluszvz1h.R.iget(25256)!=0|true))||(__CLR4_1_10jgpjgpluszvz1h.R.iget(25257)==0&false))) {{
                    __CLR4_1_10jgpjgpluszvz1h.R.inc(25258);out.append(',');
                }

                }__CLR4_1_10jgpjgpluszvz1h.R.inc(25259);if ((((item == null)&&(__CLR4_1_10jgpjgpluszvz1h.R.iget(25260)!=0|true))||(__CLR4_1_10jgpjgpluszvz1h.R.iget(25261)==0&false))) {{
                    __CLR4_1_10jgpjgpluszvz1h.R.inc(25262);out.writeNull();
                    __CLR4_1_10jgpjgpluszvz1h.R.inc(25263);continue;
                }

                }__CLR4_1_10jgpjgpluszvz1h.R.inc(25264);Class<?> clazz = item.getClass();

                __CLR4_1_10jgpjgpluszvz1h.R.inc(25265);if ((((clazz == Integer.class)&&(__CLR4_1_10jgpjgpluszvz1h.R.iget(25266)!=0|true))||(__CLR4_1_10jgpjgpluszvz1h.R.iget(25267)==0&false))) {{
                    __CLR4_1_10jgpjgpluszvz1h.R.inc(25268);out.writeInt(((Integer) item).intValue());
                    __CLR4_1_10jgpjgpluszvz1h.R.inc(25269);continue;
                }

                }__CLR4_1_10jgpjgpluszvz1h.R.inc(25270);if ((((clazz == Long.class)&&(__CLR4_1_10jgpjgpluszvz1h.R.iget(25271)!=0|true))||(__CLR4_1_10jgpjgpluszvz1h.R.iget(25272)==0&false))) {{
                    __CLR4_1_10jgpjgpluszvz1h.R.inc(25273);out.writeLong(((Long) item).longValue());

                    __CLR4_1_10jgpjgpluszvz1h.R.inc(25274);if ((((out.isEnabled(SerializerFeature.WriteClassName))&&(__CLR4_1_10jgpjgpluszvz1h.R.iget(25275)!=0|true))||(__CLR4_1_10jgpjgpluszvz1h.R.iget(25276)==0&false))) {{
                        __CLR4_1_10jgpjgpluszvz1h.R.inc(25277);out.write('L');
                    }
                    }__CLR4_1_10jgpjgpluszvz1h.R.inc(25278);continue;
                }

                }__CLR4_1_10jgpjgpluszvz1h.R.inc(25279);ObjectSerializer itemSerializer = serializer.getObjectWriter(clazz);
                __CLR4_1_10jgpjgpluszvz1h.R.inc(25280);if ((((SerializerFeature.isEnabled(features, SerializerFeature.WriteClassName)
                        && itemSerializer instanceof JavaBeanSerializer)&&(__CLR4_1_10jgpjgpluszvz1h.R.iget(25281)!=0|true))||(__CLR4_1_10jgpjgpluszvz1h.R.iget(25282)==0&false))) {{
                    __CLR4_1_10jgpjgpluszvz1h.R.inc(25283);JavaBeanSerializer javaBeanSerializer = (JavaBeanSerializer) itemSerializer;
                    __CLR4_1_10jgpjgpluszvz1h.R.inc(25284);javaBeanSerializer.writeNoneASM(serializer, item, i - 1, elementType, features);
                } }else {{
                    __CLR4_1_10jgpjgpluszvz1h.R.inc(25285);itemSerializer.write(serializer, item, i - 1, elementType, features);
                }
            }}
            }__CLR4_1_10jgpjgpluszvz1h.R.inc(25286);out.append(']');
        } finally {
            __CLR4_1_10jgpjgpluszvz1h.R.inc(25287);serializer.context = context;
        }
    }finally{__CLR4_1_10jgpjgpluszvz1h.R.flushNeeded();}}

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_1_10jgpjgpluszvz1h.R.inc(25288);
        __CLR4_1_10jgpjgpluszvz1h.R.inc(25289);if ((((parser.lexer.token() == JSONToken.NULL)&&(__CLR4_1_10jgpjgpluszvz1h.R.iget(25290)!=0|true))||(__CLR4_1_10jgpjgpluszvz1h.R.iget(25291)==0&false))) {{
            __CLR4_1_10jgpjgpluszvz1h.R.inc(25292);parser.lexer.nextToken(JSONToken.COMMA);
            __CLR4_1_10jgpjgpluszvz1h.R.inc(25293);return null;
        }
        
        }__CLR4_1_10jgpjgpluszvz1h.R.inc(25294);if ((((type == JSONArray.class)&&(__CLR4_1_10jgpjgpluszvz1h.R.iget(25295)!=0|true))||(__CLR4_1_10jgpjgpluszvz1h.R.iget(25296)==0&false))) {{
            __CLR4_1_10jgpjgpluszvz1h.R.inc(25297);JSONArray array = new JSONArray();
            __CLR4_1_10jgpjgpluszvz1h.R.inc(25298);parser.parseArray(array);
            __CLR4_1_10jgpjgpluszvz1h.R.inc(25299);return (T) array;
        }

        }__CLR4_1_10jgpjgpluszvz1h.R.inc(25300);Collection list = TypeUtils.createCollection(type);

        __CLR4_1_10jgpjgpluszvz1h.R.inc(25301);Type itemType = TypeUtils.getCollectionItemType(type);
        __CLR4_1_10jgpjgpluszvz1h.R.inc(25302);parser.parseArray(itemType, list, fieldName);

        __CLR4_1_10jgpjgpluszvz1h.R.inc(25303);return (T) list;
    }finally{__CLR4_1_10jgpjgpluszvz1h.R.flushNeeded();}}

  

    public int getFastMatchToken() {try{__CLR4_1_10jgpjgpluszvz1h.R.inc(25304);
        __CLR4_1_10jgpjgpluszvz1h.R.inc(25305);return JSONToken.LBRACKET;
    }finally{__CLR4_1_10jgpjgpluszvz1h.R.flushNeeded();}}
}
