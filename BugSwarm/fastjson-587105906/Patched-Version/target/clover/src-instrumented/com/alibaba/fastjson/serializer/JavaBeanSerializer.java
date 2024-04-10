/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
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
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.TypeUtils;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class JavaBeanSerializer extends SerializeFilterable implements ObjectSerializer {public static class __CLR4_5_2kb5kb5lusyjn0u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,27005,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // serializers
    protected final FieldSerializer[] getters;
    protected final FieldSerializer[] sortedGetters;
    
    protected SerializeBeanInfo       beanInfo;

    private transient volatile long[] hashArray;
    private transient volatile short[] hashArrayMapping;
    
    public JavaBeanSerializer(Class<?> beanType){
        this(beanType, (Map<String, String>) null);__CLR4_5_2kb5kb5lusyjn0u.R.inc(26322);try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26321);
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}

    public JavaBeanSerializer(Class<?> beanType, String... aliasList){
        this(beanType, createAliasMap(aliasList));__CLR4_5_2kb5kb5lusyjn0u.R.inc(26324);try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26323);
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}

    static Map<String, String> createAliasMap(String... aliasList) {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26325);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26326);Map<String, String> aliasMap = new HashMap<String, String>();
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26327);for (String alias : aliasList) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26328);aliasMap.put(alias, alias);
        }

        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26329);return aliasMap;
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}

    /**
     * @since 1.2.42
     */
    public Class<?> getType() {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26330);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26331);return beanInfo.beanType;
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}

    public JavaBeanSerializer(Class<?> beanType, Map<String, String> aliasMap){
        this(TypeUtils.buildBeanInfo(beanType, aliasMap, null));__CLR4_5_2kb5kb5lusyjn0u.R.inc(26333);try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26332);
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}
    
    public JavaBeanSerializer(SerializeBeanInfo beanInfo) {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26334);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26335);this.beanInfo = beanInfo;
        
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26336);sortedGetters = new FieldSerializer[beanInfo.sortedFields.length];
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26337);for (int i = 0; (((i < sortedGetters.length)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26338)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26339)==0&false)); ++i) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26340);sortedGetters[i] = new FieldSerializer(beanInfo.beanType, beanInfo.sortedFields[i]);
        }
        
        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26341);if ((((beanInfo.fields == beanInfo.sortedFields)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26342)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26343)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26344);getters = sortedGetters;
        } }else {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26345);getters = new FieldSerializer[beanInfo.fields.length];
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26346);boolean hashNotMatch = false;
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26347);for (int i = 0; (((i < getters.length)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26348)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26349)==0&false)); ++i) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26350);FieldSerializer fieldSerializer = getFieldSerializer(beanInfo.fields[i].name);
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26351);if ((((fieldSerializer == null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26352)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26353)==0&false))) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26354);hashNotMatch = true;
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26355);break;
                }
                }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26356);getters[i] = fieldSerializer;
            }
            }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26357);if ((((hashNotMatch)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26358)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26359)==0&false))) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26360);System.arraycopy(sortedGetters, 0, getters, 0, sortedGetters.length);
            }
        }}

        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26361);if ((((beanInfo.jsonType != null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26362)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26363)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26364);for (Class<? extends SerializeFilter> filterClass : beanInfo.jsonType.serialzeFilters()) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26365);try {
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26366);SerializeFilter filter = filterClass.getConstructor().newInstance();
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26367);this.addFilter(filter);
                } catch (Exception e) {
                    // skip
                }
            }
        }}

        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26368);if ((((beanInfo.jsonType != null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26369)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26370)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26371);for (Class<? extends SerializeFilter> filterClass : beanInfo.jsonType.serialzeFilters()) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26372);try {
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26373);SerializeFilter filter = filterClass.getConstructor().newInstance();
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26374);this.addFilter(filter);
                } catch (Exception e) {
                    // skip
                }
            }
        }}
    }}finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}

    public void writeDirectNonContext(JSONSerializer serializer, //
                      Object object, //
                      Object fieldName, //
                      Type fieldType, //
                      int features) throws IOException {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26375);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26376);write(serializer, object, fieldName, fieldType, features);
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}
    
    public void writeAsArray(JSONSerializer serializer, //
                                       Object object, //
                                       Object fieldName, //
                                       Type fieldType, //
                                       int features) throws IOException {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26377);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26378);write(serializer, object, fieldName, fieldType, features);
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}
    
    public void writeAsArrayNonContext(JSONSerializer serializer, //
                                       Object object, //
                                       Object fieldName, //
                                       Type fieldType, //
                                       int features) throws IOException {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26379);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26380);write(serializer, object, fieldName, fieldType, features);
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}

    public void write(JSONSerializer serializer, //
                      Object object, //
                      Object fieldName, //
                      Type fieldType, //
                      int features) throws IOException {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26381);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26382);write(serializer, object, fieldName, fieldType, features, false);
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}

    public void writeNoneASM(JSONSerializer serializer, //
                      Object object, //
                      Object fieldName, //
                      Type fieldType, //
                      int features) throws IOException {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26383);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26384);write(serializer, object, fieldName, fieldType, features, false);
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}

    protected void write(JSONSerializer serializer, //
                      Object object, //
                      Object fieldName, //
                      Type fieldType, //
                      int features,
                      boolean unwrapped
    ) throws IOException {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26385);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26386);SerializeWriter out = serializer.out;

        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26387);if ((((object == null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26388)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26389)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26390);out.writeNull();
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26391);return;
        }

        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26392);if ((((writeReference(serializer, object, features))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26393)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26394)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26395);return;
        }

        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26396);final FieldSerializer[] getters;

        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26397);if ((((out.sortField)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26398)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26399)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26400);getters = this.sortedGetters;
        } }else {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26401);getters = this.getters;
        }

        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26402);SerialContext parent = serializer.context;
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26403);if ((((!this.beanInfo.beanType.isEnum())&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26404)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26405)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26406);serializer.setContext(parent, object, fieldName, this.beanInfo.features, features);
        }

        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26407);final boolean writeAsArray = isWriteAsArray(serializer, features);

        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26408);FieldSerializer errorFieldSerializer = null;
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26409);try {
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26410);final char startSeperator = (((writeAsArray )&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26411)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26412)==0&false))? '[' : '{';
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26413);final char endSeperator = (((writeAsArray )&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26414)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26415)==0&false))? ']' : '}';
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26416);if ((((!unwrapped)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26417)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26418)==0&false))) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26419);out.append(startSeperator);
            }

            }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26420);if ((((getters.length > 0 && out.isEnabled(SerializerFeature.PrettyFormat))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26421)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26422)==0&false))) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26423);serializer.incrementIndent();
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26424);serializer.println();
            }

            }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26425);boolean commaFlag = false;

            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26426);if (((((this.beanInfo.features & SerializerFeature.WriteClassName.mask) != 0
                ||(features & SerializerFeature.WriteClassName.mask) != 0
                || serializer.isWriteClassName(fieldType, object))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26427)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26428)==0&false))) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26429);Class<?> objClass = object.getClass();

                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26430);final Type type;
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26431);if ((((objClass != fieldType && fieldType instanceof WildcardType)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26432)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26433)==0&false))) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26434);type = TypeUtils.getClass(fieldType);
                } }else {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26435);type = fieldType;
                }

                }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26436);if ((((objClass != type)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26437)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26438)==0&false))) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26439);writeClassName(serializer, beanInfo.typeKey, object);
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26440);commaFlag = true;
                }
            }}

            }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26441);char seperator = (((commaFlag )&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26442)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26443)==0&false))? ',' : '\0';

            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26444);final boolean writeClassName = out.isEnabled(SerializerFeature.WriteClassName);
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26445);char newSeperator = this.writeBefore(serializer, object, seperator);
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26446);commaFlag = newSeperator == ',';

            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26447);final boolean skipTransient = out.isEnabled(SerializerFeature.SkipTransientField);
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26448);final boolean ignoreNonFieldGetter = out.isEnabled(SerializerFeature.IgnoreNonFieldGetter);

            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26449);for (int i = 0; (((i < getters.length)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26450)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26451)==0&false)); ++i) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26452);FieldSerializer fieldSerializer = getters[i];

                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26453);Field field = fieldSerializer.fieldInfo.field;
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26454);FieldInfo fieldInfo = fieldSerializer.fieldInfo;
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26455);String fieldInfoName = fieldInfo.name;
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26456);Class<?> fieldClass = fieldInfo.fieldClass;

                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26457);final boolean fieldUseSingleQuotes = SerializerFeature.isEnabled(out.features, fieldInfo.serialzeFeatures, SerializerFeature.UseSingleQuotes);
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26458);final boolean directWritePrefix = out.quoteFieldNames && !fieldUseSingleQuotes;

                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26459);if ((((skipTransient)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26460)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26461)==0&false))) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26462);if ((((fieldInfo != null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26463)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26464)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26465);if ((((fieldInfo.fieldTransient)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26466)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26467)==0&false))) {{
                            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26468);continue;
                        }
                    }}
                }}

                }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26469);if ((((ignoreNonFieldGetter)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26470)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26471)==0&false))) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26472);if ((((field == null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26473)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26474)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26475);continue;
                    }
                }}

                }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26476);boolean notApply = false;
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26477);if (((((!this.applyName(serializer, object, fieldInfoName)) //
                    || !this.applyLabel(serializer, fieldInfo.label))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26478)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26479)==0&false))) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26480);if ((((writeAsArray)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26481)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26482)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26483);notApply = true;
                    } }else {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26484);continue;
                    }
                }}

                }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26485);if ((((beanInfo.typeKey != null
                        && fieldInfoName.equals(beanInfo.typeKey)
                        && serializer.isWriteClassName(fieldType, object))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26486)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26487)==0&false))) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26488);continue;
                }

                }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26489);Object propertyValue;

                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26490);if ((((notApply)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26491)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26492)==0&false))) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26493);propertyValue = null;
                } }else {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26494);try {
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26495);propertyValue = fieldSerializer.getPropertyValueDirect(object);
                    } catch (InvocationTargetException ex) {
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26496);errorFieldSerializer = fieldSerializer;
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26497);if ((((out.isEnabled(SerializerFeature.IgnoreErrorGetter))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26498)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26499)==0&false))) {{
                            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26500);propertyValue = null;
                        } }else {{
                            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26501);throw ex;
                        }
                    }}
                }

                }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26502);if ((((!this.apply(serializer, object, fieldInfoName, propertyValue))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26503)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26504)==0&false))) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26505);continue;
                }

                }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26506);if ((((fieldClass == String.class && "trim".equals(fieldInfo.format))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26507)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26508)==0&false))) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26509);if ((((propertyValue != null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26510)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26511)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26512);propertyValue = ((String) propertyValue).trim();
                    }
                }}

                }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26513);String key = fieldInfoName;
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26514);key = this.processKey(serializer, object, key, propertyValue);

                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26515);Object originalValue = propertyValue;
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26516);propertyValue = this.processValue(serializer, fieldSerializer.fieldContext, object, fieldInfoName,
                                                        propertyValue, features);

                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26517);if ((((propertyValue == null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26518)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26519)==0&false))) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26520);int serialzeFeatures = fieldInfo.serialzeFeatures;
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26521);JSONField jsonField = fieldInfo.getAnnotation();
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26522);if ((((beanInfo.jsonType != null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26523)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26524)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26525);serialzeFeatures |= SerializerFeature.of(beanInfo.jsonType.serialzeFeatures());
                    }
                    // beanInfo.jsonType
                    }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26526);if ((((jsonField != null && !"".equals(jsonField.defaultValue()))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26527)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26528)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26529);propertyValue = jsonField.defaultValue();
                    } }else {__CLR4_5_2kb5kb5lusyjn0u.R.inc(26530);if ((((fieldClass == Boolean.class)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26531)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26532)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26533);int defaultMask = SerializerFeature.WriteNullBooleanAsFalse.mask;
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26534);final int mask = defaultMask | SerializerFeature.WriteMapNullValue.mask;
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26535);if (((((!writeAsArray) && (serialzeFeatures & mask) == 0 && (out.features & mask) == 0)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26536)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26537)==0&false))) {{
                            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26538);continue;
                        } }else {__CLR4_5_2kb5kb5lusyjn0u.R.inc(26539);if (((((serialzeFeatures & defaultMask) != 0 || (out.features & defaultMask) != 0)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26540)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26541)==0&false))) {{
                            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26542);propertyValue = false;
                        }
                    }}} }else {__CLR4_5_2kb5kb5lusyjn0u.R.inc(26543);if ((((fieldClass == String.class)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26544)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26545)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26546);int defaultMask = SerializerFeature.WriteNullStringAsEmpty.mask;
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26547);final int mask = defaultMask | SerializerFeature.WriteMapNullValue.mask;
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26548);if (((((!writeAsArray) && (serialzeFeatures & mask) == 0 && (out.features & mask) == 0)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26549)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26550)==0&false))) {{
                            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26551);continue;
                        } }else {__CLR4_5_2kb5kb5lusyjn0u.R.inc(26552);if (((((serialzeFeatures & defaultMask) != 0 || (out.features & defaultMask) != 0)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26553)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26554)==0&false))) {{
                            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26555);propertyValue = "";
                        }
                    }}} }else {__CLR4_5_2kb5kb5lusyjn0u.R.inc(26556);if ((((Number.class.isAssignableFrom(fieldClass))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26557)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26558)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26559);int defaultMask = SerializerFeature.WriteNullNumberAsZero.mask;
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26560);final int mask = defaultMask | SerializerFeature.WriteMapNullValue.mask;
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26561);if (((((!writeAsArray) && (serialzeFeatures & mask) == 0 && (out.features & mask) == 0)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26562)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26563)==0&false))) {{
                            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26564);continue;
                        } }else {__CLR4_5_2kb5kb5lusyjn0u.R.inc(26565);if (((((serialzeFeatures & defaultMask) != 0 || (out.features & defaultMask) != 0)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26566)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26567)==0&false))) {{
                            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26568);propertyValue = 0;
                        }
                    }}} }else {__CLR4_5_2kb5kb5lusyjn0u.R.inc(26569);if ((((Collection.class.isAssignableFrom(fieldClass))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26570)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26571)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26572);int defaultMask = SerializerFeature.WriteNullListAsEmpty.mask;
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26573);final int mask = defaultMask | SerializerFeature.WriteMapNullValue.mask;
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26574);if (((((!writeAsArray) && (serialzeFeatures & mask) == 0 && (out.features & mask) == 0)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26575)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26576)==0&false))) {{
                            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26577);continue;
                        } }else {__CLR4_5_2kb5kb5lusyjn0u.R.inc(26578);if (((((serialzeFeatures & defaultMask) != 0 || (out.features & defaultMask) != 0)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26579)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26580)==0&false))) {{
                            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26581);propertyValue = Collections.emptyList();
                        }
                    }}} }else {__CLR4_5_2kb5kb5lusyjn0u.R.inc(26582);if (((((!writeAsArray) && (!fieldSerializer.writeNull) && !out.isEnabled(SerializerFeature.WriteMapNullValue.mask))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26583)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26584)==0&false))){{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26585);continue;
                    }
                }}}}}}}

                }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26586);if ((((propertyValue != null  //
                        && (out.notWriteDefaultValue //
                        || (fieldInfo.serialzeFeatures & SerializerFeature.NotWriteDefaultValue.mask) != 0 //
                        || (beanInfo.features & SerializerFeature.NotWriteDefaultValue.mask) != 0 //
                        ))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26587)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26588)==0&false))) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26589);Class<?> fieldCLass = fieldInfo.fieldClass;
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26590);if ((((fieldCLass == byte.class && propertyValue instanceof Byte
                        && ((Byte) propertyValue).byteValue() == 0)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26591)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26592)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26593);continue;
                    } }else {__CLR4_5_2kb5kb5lusyjn0u.R.inc(26594);if ((((fieldCLass == short.class && propertyValue instanceof Short
                               && ((Short) propertyValue).shortValue() == 0)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26595)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26596)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26597);continue;
                    } }else {__CLR4_5_2kb5kb5lusyjn0u.R.inc(26598);if ((((fieldCLass == int.class && propertyValue instanceof Integer
                               && ((Integer) propertyValue).intValue() == 0)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26599)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26600)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26601);continue;
                    } }else {__CLR4_5_2kb5kb5lusyjn0u.R.inc(26602);if ((((fieldCLass == long.class && propertyValue instanceof Long
                               && ((Long) propertyValue).longValue() == 0L)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26603)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26604)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26605);continue;
                    } }else {__CLR4_5_2kb5kb5lusyjn0u.R.inc(26606);if ((((fieldCLass == float.class && propertyValue instanceof Float
                               && ((Float) propertyValue).floatValue() == 0F)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26607)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26608)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26609);continue;
                    } }else {__CLR4_5_2kb5kb5lusyjn0u.R.inc(26610);if ((((fieldCLass == double.class && propertyValue instanceof Double
                               && ((Double) propertyValue).doubleValue() == 0D)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26611)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26612)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26613);continue;
                    } }else {__CLR4_5_2kb5kb5lusyjn0u.R.inc(26614);if ((((fieldCLass == boolean.class && propertyValue instanceof Boolean
                               && !((Boolean) propertyValue).booleanValue())&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26615)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26616)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26617);continue;
                    }
                }}}}}}}}

                }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26618);if ((((commaFlag)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26619)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26620)==0&false))) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26621);if ((((fieldInfo.unwrapped
                            && propertyValue instanceof Map
                            && ((Map) propertyValue).size() == 0)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26622)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26623)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26624);continue;
                    }

                    }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26625);out.write(',');
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26626);if ((((out.isEnabled(SerializerFeature.PrettyFormat))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26627)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26628)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26629);serializer.println();
                    }
                }}

                }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26630);if ((((key != fieldInfoName)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26631)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26632)==0&false))) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26633);if ((((!writeAsArray)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26634)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26635)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26636);out.writeFieldName(key, true);
                    }

                    }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26637);serializer.write(propertyValue);
                } }else {__CLR4_5_2kb5kb5lusyjn0u.R.inc(26638);if ((((originalValue != propertyValue)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26639)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26640)==0&false))) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26641);if ((((!writeAsArray)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26642)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26643)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26644);fieldSerializer.writePrefix(serializer);
                    }
                    }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26645);serializer.write(propertyValue);
                } }else {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26646);if ((((!writeAsArray)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26647)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26648)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26649);boolean isMap = Map.class.isAssignableFrom(fieldClass);
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26650);boolean isJavaBean = !fieldClass.isPrimitive() && !fieldClass.getName().startsWith("java.") || fieldClass == Object.class;
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26651);if ((((writeClassName || !fieldInfo.unwrapped || !(isMap || isJavaBean))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26652)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26653)==0&false))) {{
                            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26654);if ((((directWritePrefix)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26655)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26656)==0&false))) {{
                                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26657);out.write(fieldInfo.name_chars, 0, fieldInfo.name_chars.length);
                            } }else {{
                                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26658);fieldSerializer.writePrefix(serializer);
                            }
                        }}
                    }}

                    }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26659);if ((((!writeAsArray)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26660)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26661)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26662);JSONField fieldAnnotation = fieldInfo.getAnnotation();
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26663);if ((((fieldClass == String.class && (fieldAnnotation == null || fieldAnnotation.serializeUsing() == Void.class))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26664)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26665)==0&false))) {{
                            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26666);if ((((propertyValue == null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26667)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26668)==0&false))) {{
                                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26669);if (((((out.features & SerializerFeature.WriteNullStringAsEmpty.mask) != 0
                                    || (fieldSerializer.features & SerializerFeature.WriteNullStringAsEmpty.mask) != 0)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26670)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26671)==0&false))) {{
                                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26672);out.writeString("");
                                } }else {{
                                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26673);out.writeNull();
                                }
                            }} }else {{
                                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26674);String propertyValueString = (String) propertyValue;

                                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26675);if ((((fieldUseSingleQuotes)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26676)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26677)==0&false))) {{
                                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26678);out.writeStringWithSingleQuote(propertyValueString);
                                } }else {{
                                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26679);out.writeStringWithDoubleQuote(propertyValueString, (char) 0);
                                }
                            }}
                        }} }else {{
                            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26680);if ((((fieldInfo.unwrapped
                                    && propertyValue instanceof Map
                                    && ((Map) propertyValue).size() == 0)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26681)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26682)==0&false))) {{
                                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26683);commaFlag = false;
                                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26684);continue;
                            }

                            }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26685);fieldSerializer.writeValue(serializer, propertyValue);
                        }
                    }} }else {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26686);fieldSerializer.writeValue(serializer, propertyValue);
                    }
                }}

                }}__CLR4_5_2kb5kb5lusyjn0u.R.inc(26687);boolean fieldUnwrappedNull = false;
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26688);if ((((fieldInfo.unwrapped
                        && propertyValue instanceof Map)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26689)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26690)==0&false))) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26691);Map map = ((Map) propertyValue);
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26692);if ((((map.size() == 0)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26693)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26694)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26695);fieldUnwrappedNull = true;
                    } }else {__CLR4_5_2kb5kb5lusyjn0u.R.inc(26696);if ((((!serializer.isEnabled(SerializerFeature.WriteMapNullValue))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26697)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26698)==0&false))){{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26699);boolean hasNotNull = false;
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26700);for (Object value : map.values()) {{
                            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26701);if ((((value != null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26702)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26703)==0&false))) {{
                                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26704);hasNotNull = true;
                                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26705);break;
                            }
                        }}
                        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26706);if ((((!hasNotNull)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26707)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26708)==0&false))) {{
                            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26709);fieldUnwrappedNull = true;
                        }
                    }}
                }}}

                }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26710);if ((((!fieldUnwrappedNull)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26711)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26712)==0&false))) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26713);commaFlag = true;
                }
            }}

            }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26714);this.writeAfter(serializer, object, (((commaFlag )&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26715)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26716)==0&false))? ',' : '\0');

            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26717);if ((((getters.length > 0 && out.isEnabled(SerializerFeature.PrettyFormat))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26718)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26719)==0&false))) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26720);serializer.decrementIdent();
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26721);serializer.println();
            }

            }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26722);if ((((!unwrapped)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26723)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26724)==0&false))) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26725);out.append(endSeperator);
            }
        }} catch (Exception e) {
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26726);String errorMessage = "write javaBean error, fastjson version " + JSON.VERSION;
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26727);if ((((object != null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26728)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26729)==0&false))) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26730);errorMessage += ", class " + object.getClass().getName();
            }
            }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26731);if ((((fieldName != null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26732)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26733)==0&false))) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26734);errorMessage += ", fieldName : " + fieldName;
            } }else {__CLR4_5_2kb5kb5lusyjn0u.R.inc(26735);if ((((errorFieldSerializer != null && errorFieldSerializer.fieldInfo != null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26736)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26737)==0&false))) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26738);FieldInfo fieldInfo = errorFieldSerializer.fieldInfo;
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26739);if ((((fieldInfo.method != null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26740)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26741)==0&false))) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26742);errorMessage += ", method : " + fieldInfo.method.getName();
                } }else {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26743);errorMessage += ", fieldName : " + errorFieldSerializer.fieldInfo.name;
                }
            }}
            }}__CLR4_5_2kb5kb5lusyjn0u.R.inc(26744);if ((((e.getMessage() != null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26745)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26746)==0&false))) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26747);errorMessage += (", " + e.getMessage());
            }

            }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26748);Throwable cause = null;
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26749);if ((((e instanceof InvocationTargetException)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26750)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26751)==0&false))) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26752);cause = e.getCause();
            }
            }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26753);if ((((cause == null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26754)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26755)==0&false))) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26756);cause = e;
            }

            }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26757);throw new JSONException(errorMessage, cause);
        } finally {
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26758);serializer.context = parent;
        }
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}

    protected void writeClassName(JSONSerializer serializer, String typeKey, Object object) {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26759);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26760);if ((((typeKey == null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26761)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26762)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26763);typeKey = serializer.config.typeKey;
        }
        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26764);serializer.out.writeFieldName(typeKey, false);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26765);String typeName = this.beanInfo.typeName;
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26766);if ((((typeName == null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26767)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26768)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26769);Class<?> clazz = object.getClass();

            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26770);if ((((TypeUtils.isProxy(clazz))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26771)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26772)==0&false))) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26773);clazz = clazz.getSuperclass();
            }

            }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26774);typeName = clazz.getName();
        }
        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26775);serializer.write(typeName);
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}

    public boolean writeReference(JSONSerializer serializer, Object object, int fieldFeatures) {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26776);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26777);SerialContext context = serializer.context;
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26778);int mask = SerializerFeature.DisableCircularReferenceDetect.mask;
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26779);if ((((context == null || (context.features & mask) != 0 || (fieldFeatures & mask) != 0)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26780)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26781)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26782);return false;
        }

        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26783);if ((((serializer.references != null && serializer.references.containsKey(object))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26784)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26785)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26786);serializer.writeReference(object);
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26787);return true;
        } }else {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26788);return false;
        }
    }}finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}
    
    protected boolean isWriteAsArray(JSONSerializer serializer) {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26789);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26790);return isWriteAsArray(serializer, 0);   
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}

    protected boolean isWriteAsArray(JSONSerializer serializer, int fieldFeatrues) {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26791);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26792);final int mask = SerializerFeature.BeanToArray.mask;
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26793);return (beanInfo.features & mask) != 0 //
                || serializer.out.beanToArray //
                || (fieldFeatrues & mask) != 0;
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}
    
    public Object getFieldValue(Object object, String key) {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26794);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26795);FieldSerializer fieldDeser = getFieldSerializer(key);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26796);if ((((fieldDeser == null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26797)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26798)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26799);throw new JSONException("field not found. " + key);
        }
        
        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26800);try {
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26801);return fieldDeser.getPropertyValue(object);
        } catch (InvocationTargetException ex) {
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26802);throw new JSONException("getFieldValue error." + key, ex);
        } catch (IllegalAccessException ex) {
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26803);throw new JSONException("getFieldValue error." + key, ex);
        }
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}

    public Object getFieldValue(Object object, String key, long keyHash, boolean throwFieldNotFoundException) {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26804);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26805);FieldSerializer fieldDeser = getFieldSerializer(keyHash);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26806);if ((((fieldDeser == null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26807)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26808)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26809);if ((((throwFieldNotFoundException)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26810)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26811)==0&false))) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26812);throw new JSONException("field not found. " + key);
            }
            }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26813);return null;
        }

        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26814);try {
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26815);return fieldDeser.getPropertyValue(object);
        } catch (InvocationTargetException ex) {
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26816);throw new JSONException("getFieldValue error." + key, ex);
        } catch (IllegalAccessException ex) {
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26817);throw new JSONException("getFieldValue error." + key, ex);
        }
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}

    public FieldSerializer getFieldSerializer(String key) {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26818);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26819);if ((((key == null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26820)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26821)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26822);return null;
        }

        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26823);int low = 0;
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26824);int high = sortedGetters.length - 1;

        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26825);while ((((low <= high)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26826)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26827)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26828);int mid = (low + high) >>> 1;

            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26829);String fieldName = sortedGetters[mid].fieldInfo.name;

            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26830);int cmp = fieldName.compareTo(key);

            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26831);if ((((cmp < 0)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26832)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26833)==0&false))) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26834);low = mid + 1;
            } }else {__CLR4_5_2kb5kb5lusyjn0u.R.inc(26835);if ((((cmp > 0)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26836)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26837)==0&false))) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26838);high = mid - 1;
            } }else {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26839);return sortedGetters[mid]; // key found
            }
        }}}

        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26840);return null; // key not found.
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}

    public FieldSerializer getFieldSerializer(long hash) {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26841);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26842);PropertyNamingStrategy[] namingStrategies = null;
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26843);if ((((this.hashArray == null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26844)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26845)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26846);namingStrategies = PropertyNamingStrategy.values();

            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26847);long[] hashArray = new long[sortedGetters.length * namingStrategies.length];
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26848);int index = 0;
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26849);for (int i = 0; (((i < sortedGetters.length)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26850)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26851)==0&false)); i++) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26852);String name = sortedGetters[i].fieldInfo.name;
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26853);hashArray[index++] = TypeUtils.fnv1a_64(name);

                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26854);for (int j = 0; (((j < namingStrategies.length)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26855)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26856)==0&false)); j++) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26857);String name_t = namingStrategies[j].translate(name);
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26858);if ((((name.equals(name_t))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26859)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26860)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26861);continue;
                    }
                    }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26862);hashArray[index++] = TypeUtils.fnv1a_64(name_t);
                }
            }}
            }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26863);Arrays.sort(hashArray, 0, index);

            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26864);this.hashArray = new long[index];
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26865);System.arraycopy(hashArray, 0, this.hashArray, 0, index);
        }

        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26866);int pos = Arrays.binarySearch(hashArray, hash);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26867);if ((((pos < 0)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26868)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26869)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26870);return null;
        }

        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26871);if ((((hashArrayMapping == null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26872)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26873)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26874);if ((((namingStrategies == null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26875)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26876)==0&false))) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26877);namingStrategies = PropertyNamingStrategy.values();
            }

            }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26878);short[] mapping = new short[hashArray.length];
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26879);Arrays.fill(mapping, (short) -1);
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26880);for (int i = 0; (((i < sortedGetters.length)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26881)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26882)==0&false)); i++) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26883);String name = sortedGetters[i].fieldInfo.name;

                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26884);int p = Arrays.binarySearch(hashArray
                        , TypeUtils.fnv1a_64(name));
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26885);if ((((p >= 0)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26886)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26887)==0&false))) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26888);mapping[p] = (short) i;
                }

                }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26889);for (int j = 0; (((j < namingStrategies.length)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26890)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26891)==0&false)); j++) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26892);String name_t = namingStrategies[j].translate(name);
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26893);if ((((name.equals(name_t))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26894)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26895)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26896);continue;
                    }

                    }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26897);int p_t = Arrays.binarySearch(hashArray
                            , TypeUtils.fnv1a_64(name_t));
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26898);if ((((p_t >= 0)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26899)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26900)==0&false))) {{
                        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26901);mapping[p_t] = (short) i;
                    }
                }}
            }}
            }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26902);hashArrayMapping = mapping;
        }

        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26903);int getterIndex = hashArrayMapping[pos];
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26904);if ((((getterIndex != -1)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26905)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26906)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26907);return sortedGetters[getterIndex];
        }

        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26908);return null; // key not found.
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}

    public List<Object> getFieldValues(Object object) throws Exception {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26909);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26910);List<Object> fieldValues = new ArrayList<Object>(sortedGetters.length);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26911);for (FieldSerializer getter : sortedGetters) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26912);fieldValues.add(getter.getPropertyValue(object));
        }

        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26913);return fieldValues;
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}

    // for jsonpath deepSet
    public List<Object> getObjectFieldValues(Object object) throws Exception {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26914);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26915);List<Object> fieldValues = new ArrayList<Object>(sortedGetters.length);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26916);for (FieldSerializer getter : sortedGetters) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26917);Class fieldClass = getter.fieldInfo.fieldClass;
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26918);if ((((fieldClass.isPrimitive())&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26919)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26920)==0&false))) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26921);continue;
            }
            }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26922);if ((((fieldClass.getName().startsWith("java.lang."))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26923)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26924)==0&false))) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26925);continue;
            }
            }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26926);fieldValues.add(getter.getPropertyValue(object));
        }

        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26927);return fieldValues;
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}
    
    public int getSize(Object object) throws Exception {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26928);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26929);int size = 0;
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26930);for (FieldSerializer getter : sortedGetters) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26931);Object value = getter.getPropertyValueDirect(object);
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26932);if ((((value != null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26933)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26934)==0&false))) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26935);size ++;
            }
        }}
        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26936);return size;
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}
    
    /**
     * Get field names of not null fields. Keep the same logic as getSize.
     * 
     * @param object the object to be checked
     * @return field name set
     * @throws Exception
     * @see #getSize(Object)
     */
    public Set<String> getFieldNames(Object object) throws Exception {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26937);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26938);Set<String> fieldNames = new HashSet<String>();
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26939);for (FieldSerializer getter : sortedGetters) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26940);Object value = getter.getPropertyValueDirect(object);
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26941);if ((((value != null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26942)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26943)==0&false))) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26944);fieldNames.add(getter.fieldInfo.name);
            }
        }}
        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26945);return fieldNames;
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}

    public Map<String, Object> getFieldValuesMap(Object object) throws Exception {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26946);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26947);Map<String, Object> map = new LinkedHashMap<String, Object>(sortedGetters.length);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26948);boolean skipTransient = true;
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26949);FieldInfo fieldInfo = null;

        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26950);for (FieldSerializer getter : sortedGetters) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26951);skipTransient = SerializerFeature.isEnabled(getter.features, SerializerFeature.SkipTransientField);
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26952);fieldInfo = getter.fieldInfo;

            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26953);if ((((skipTransient && fieldInfo != null && fieldInfo.fieldTransient)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26954)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26955)==0&false))) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26956);continue;
            }

            }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26957);map.put(getter.fieldInfo.name, getter.getPropertyValue(object));
        }

        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26958);return map;
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}

    protected BeanContext getBeanContext(int orinal) {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26959);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26960);return sortedGetters[orinal].fieldContext;
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}
    
    protected Type getFieldType(int ordinal) {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26961);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26962);return sortedGetters[ordinal].fieldInfo.fieldType;
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}
    
    protected char writeBefore(JSONSerializer jsonBeanDeser, //
                            Object object, char seperator) {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26963);
        
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26964);if ((((jsonBeanDeser.beforeFilters != null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26965)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26966)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26967);for (BeforeFilter beforeFilter : jsonBeanDeser.beforeFilters) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26968);seperator = beforeFilter.writeBefore(jsonBeanDeser, object, seperator);
            }
        }}
        
        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26969);if ((((this.beforeFilters != null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26970)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26971)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26972);for (BeforeFilter beforeFilter : this.beforeFilters) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26973);seperator = beforeFilter.writeBefore(jsonBeanDeser, object, seperator);
            }
        }}
        
        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26974);return seperator;
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}
    
    protected char writeAfter(JSONSerializer jsonBeanDeser, // 
                           Object object, char seperator) {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26975);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26976);if ((((jsonBeanDeser.afterFilters != null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26977)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26978)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26979);for (AfterFilter afterFilter : jsonBeanDeser.afterFilters) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26980);seperator = afterFilter.writeAfter(jsonBeanDeser, object, seperator);
            }
        }}
        
        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26981);if ((((this.afterFilters != null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26982)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26983)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26984);for (AfterFilter afterFilter : this.afterFilters) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26985);seperator = afterFilter.writeAfter(jsonBeanDeser, object, seperator);
            }
        }}
        
        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26986);return seperator;
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}
    
    protected boolean applyLabel(JSONSerializer jsonBeanDeser, String label) {try{__CLR4_5_2kb5kb5lusyjn0u.R.inc(26987);
        __CLR4_5_2kb5kb5lusyjn0u.R.inc(26988);if ((((jsonBeanDeser.labelFilters != null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26989)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26990)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26991);for (LabelFilter propertyFilter : jsonBeanDeser.labelFilters) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(26992);if ((((!propertyFilter.apply(label))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26993)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26994)==0&false))) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(26995);return false;
                }
            }}
        }}
        
        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(26996);if ((((this.labelFilters != null)&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26997)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(26998)==0&false))) {{
            __CLR4_5_2kb5kb5lusyjn0u.R.inc(26999);for (LabelFilter propertyFilter : this.labelFilters) {{
                __CLR4_5_2kb5kb5lusyjn0u.R.inc(27000);if ((((!propertyFilter.apply(label))&&(__CLR4_5_2kb5kb5lusyjn0u.R.iget(27001)!=0|true))||(__CLR4_5_2kb5kb5lusyjn0u.R.iget(27002)==0&false))) {{
                    __CLR4_5_2kb5kb5lusyjn0u.R.inc(27003);return false;
                }
            }}
        }}
        
        }__CLR4_5_2kb5kb5lusyjn0u.R.inc(27004);return true;
    }finally{__CLR4_5_2kb5kb5lusyjn0u.R.flushNeeded();}}
}
