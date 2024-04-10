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
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class MapSerializer extends SerializeFilterable implements ObjectSerializer {public static class __CLR4_5_2lawlawlusyjn2h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,27843,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static MapSerializer instance = new MapSerializer();

    private static final int NON_STRINGKEY_AS_STRING = SerializerFeature.of(
            new SerializerFeature[] {
                    SerializerFeature.BrowserCompatible,
                    SerializerFeature.WriteNonStringKeyAsString,
                    SerializerFeature.BrowserSecure});

    public void write(JSONSerializer serializer
            , Object object
            , Object fieldName
            , Type fieldType
            , int features) throws IOException {try{__CLR4_5_2lawlawlusyjn2h.R.inc(27608);
        __CLR4_5_2lawlawlusyjn2h.R.inc(27609);write(serializer, object, fieldName, fieldType, features, false);
    }finally{__CLR4_5_2lawlawlusyjn2h.R.flushNeeded();}}

    @SuppressWarnings({ "rawtypes"})
    public void write(JSONSerializer serializer
            , Object object
            , Object fieldName
            , Type fieldType
            , int features //
            , boolean unwrapped) throws IOException {try{__CLR4_5_2lawlawlusyjn2h.R.inc(27610);
        __CLR4_5_2lawlawlusyjn2h.R.inc(27611);SerializeWriter out = serializer.out;

        __CLR4_5_2lawlawlusyjn2h.R.inc(27612);if ((((object == null)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27613)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27614)==0&false))) {{
            __CLR4_5_2lawlawlusyjn2h.R.inc(27615);out.writeNull();
            __CLR4_5_2lawlawlusyjn2h.R.inc(27616);return;
        }

        }__CLR4_5_2lawlawlusyjn2h.R.inc(27617);Map<?, ?> map = (Map<?, ?>) object;
        __CLR4_5_2lawlawlusyjn2h.R.inc(27618);final int mapSortFieldMask = SerializerFeature.MapSortField.mask;
        __CLR4_5_2lawlawlusyjn2h.R.inc(27619);if (((((out.features & mapSortFieldMask) != 0 || (features & mapSortFieldMask) != 0)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27620)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27621)==0&false))) {{
            __CLR4_5_2lawlawlusyjn2h.R.inc(27622);if ((((map instanceof JSONObject)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27623)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27624)==0&false))) {{
                __CLR4_5_2lawlawlusyjn2h.R.inc(27625);map = ((JSONObject) map).getInnerMap();
            }

            }__CLR4_5_2lawlawlusyjn2h.R.inc(27626);if (((((!(map instanceof SortedMap)) && !(map instanceof LinkedHashMap))&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27627)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27628)==0&false))) {{
                __CLR4_5_2lawlawlusyjn2h.R.inc(27629);try {
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27630);map = new TreeMap(map);
                } catch (Exception ex) {
                    // skip
                }
            }
        }}

        }__CLR4_5_2lawlawlusyjn2h.R.inc(27631);if ((((serializer.containsReference(object))&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27632)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27633)==0&false))) {{
            __CLR4_5_2lawlawlusyjn2h.R.inc(27634);serializer.writeReference(object);
            __CLR4_5_2lawlawlusyjn2h.R.inc(27635);return;
        }

        }__CLR4_5_2lawlawlusyjn2h.R.inc(27636);SerialContext parent = serializer.context;
        __CLR4_5_2lawlawlusyjn2h.R.inc(27637);serializer.setContext(parent, object, fieldName, 0);
        __CLR4_5_2lawlawlusyjn2h.R.inc(27638);try {
            __CLR4_5_2lawlawlusyjn2h.R.inc(27639);if ((((!unwrapped)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27640)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27641)==0&false))) {{
                __CLR4_5_2lawlawlusyjn2h.R.inc(27642);out.write('{');
            }

            }__CLR4_5_2lawlawlusyjn2h.R.inc(27643);serializer.incrementIndent();

            __CLR4_5_2lawlawlusyjn2h.R.inc(27644);Class<?> preClazz = null;
            __CLR4_5_2lawlawlusyjn2h.R.inc(27645);ObjectSerializer preWriter = null;

            __CLR4_5_2lawlawlusyjn2h.R.inc(27646);boolean first = true;

            __CLR4_5_2lawlawlusyjn2h.R.inc(27647);if ((((out.isEnabled(SerializerFeature.WriteClassName))&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27648)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27649)==0&false))) {{
                __CLR4_5_2lawlawlusyjn2h.R.inc(27650);String typeKey = serializer.config.typeKey;
                __CLR4_5_2lawlawlusyjn2h.R.inc(27651);Class<?> mapClass = map.getClass();
                __CLR4_5_2lawlawlusyjn2h.R.inc(27652);boolean containsKey = (mapClass == JSONObject.class || mapClass == HashMap.class || mapClass == LinkedHashMap.class) 
                        && map.containsKey(typeKey);
                __CLR4_5_2lawlawlusyjn2h.R.inc(27653);if ((((!containsKey)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27654)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27655)==0&false))) {{
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27656);out.writeFieldName(typeKey);
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27657);out.writeString(object.getClass().getName());
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27658);first = false;
                }
            }}

            }__CLR4_5_2lawlawlusyjn2h.R.inc(27659);for (Map.Entry entry : map.entrySet()) {{
                __CLR4_5_2lawlawlusyjn2h.R.inc(27660);Object value = entry.getValue();

                __CLR4_5_2lawlawlusyjn2h.R.inc(27661);Object entryKey = entry.getKey();

                {
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27662);List<PropertyPreFilter> preFilters = serializer.propertyPreFilters;
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27663);if ((((preFilters != null && preFilters.size() > 0)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27664)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27665)==0&false))) {{
                        __CLR4_5_2lawlawlusyjn2h.R.inc(27666);if ((((entryKey == null || entryKey instanceof String)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27667)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27668)==0&false))) {{
                            __CLR4_5_2lawlawlusyjn2h.R.inc(27669);if ((((!this.applyName(serializer, object, (String) entryKey))&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27670)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27671)==0&false))) {{
                                __CLR4_5_2lawlawlusyjn2h.R.inc(27672);continue;
                            }
                        }} }else {__CLR4_5_2lawlawlusyjn2h.R.inc(27673);if ((((entryKey.getClass().isPrimitive() || entryKey instanceof Number)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27674)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27675)==0&false))) {{
                            __CLR4_5_2lawlawlusyjn2h.R.inc(27676);String strKey = JSON.toJSONString(entryKey);
                            __CLR4_5_2lawlawlusyjn2h.R.inc(27677);if ((((!this.applyName(serializer, object, strKey))&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27678)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27679)==0&false))) {{
                                __CLR4_5_2lawlawlusyjn2h.R.inc(27680);continue;
                            }
                        }}
                    }}}
                }}
                {
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27681);List<PropertyPreFilter> preFilters = this.propertyPreFilters;
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27682);if ((((preFilters != null && preFilters.size() > 0)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27683)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27684)==0&false))) {{
                        __CLR4_5_2lawlawlusyjn2h.R.inc(27685);if ((((entryKey == null || entryKey instanceof String)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27686)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27687)==0&false))) {{
                            __CLR4_5_2lawlawlusyjn2h.R.inc(27688);if ((((!this.applyName(serializer, object, (String) entryKey))&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27689)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27690)==0&false))) {{
                                __CLR4_5_2lawlawlusyjn2h.R.inc(27691);continue;
                            }
                        }} }else {__CLR4_5_2lawlawlusyjn2h.R.inc(27692);if ((((entryKey.getClass().isPrimitive() || entryKey instanceof Number)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27693)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27694)==0&false))) {{
                            __CLR4_5_2lawlawlusyjn2h.R.inc(27695);String strKey = JSON.toJSONString(entryKey);
                            __CLR4_5_2lawlawlusyjn2h.R.inc(27696);if ((((!this.applyName(serializer, object, strKey))&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27697)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27698)==0&false))) {{
                                __CLR4_5_2lawlawlusyjn2h.R.inc(27699);continue;
                            }
                        }}
                    }}}
                }}
                
                {
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27700);List<PropertyFilter> propertyFilters = serializer.propertyFilters;
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27701);if ((((propertyFilters != null && propertyFilters.size() > 0)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27702)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27703)==0&false))) {{
                        __CLR4_5_2lawlawlusyjn2h.R.inc(27704);if ((((entryKey == null || entryKey instanceof String)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27705)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27706)==0&false))) {{
                            __CLR4_5_2lawlawlusyjn2h.R.inc(27707);if ((((!this.apply(serializer, object, (String) entryKey, value))&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27708)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27709)==0&false))) {{
                                __CLR4_5_2lawlawlusyjn2h.R.inc(27710);continue;
                            }
                        }} }else {__CLR4_5_2lawlawlusyjn2h.R.inc(27711);if ((((entryKey.getClass().isPrimitive() || entryKey instanceof Number)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27712)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27713)==0&false))) {{
                            __CLR4_5_2lawlawlusyjn2h.R.inc(27714);String strKey = JSON.toJSONString(entryKey);
                            __CLR4_5_2lawlawlusyjn2h.R.inc(27715);if ((((!this.apply(serializer, object, strKey, value))&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27716)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27717)==0&false))) {{
                                __CLR4_5_2lawlawlusyjn2h.R.inc(27718);continue;
                            }
                        }}
                    }}}
                }}
                {
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27719);List<PropertyFilter> propertyFilters = this.propertyFilters;
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27720);if ((((propertyFilters != null && propertyFilters.size() > 0)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27721)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27722)==0&false))) {{
                        __CLR4_5_2lawlawlusyjn2h.R.inc(27723);if ((((entryKey == null || entryKey instanceof String)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27724)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27725)==0&false))) {{
                            __CLR4_5_2lawlawlusyjn2h.R.inc(27726);if ((((!this.apply(serializer, object, (String) entryKey, value))&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27727)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27728)==0&false))) {{
                                __CLR4_5_2lawlawlusyjn2h.R.inc(27729);continue;
                            }
                        }} }else {__CLR4_5_2lawlawlusyjn2h.R.inc(27730);if ((((entryKey.getClass().isPrimitive() || entryKey instanceof Number)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27731)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27732)==0&false))) {{
                            __CLR4_5_2lawlawlusyjn2h.R.inc(27733);String strKey = JSON.toJSONString(entryKey);
                            __CLR4_5_2lawlawlusyjn2h.R.inc(27734);if ((((!this.apply(serializer, object, strKey, value))&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27735)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27736)==0&false))) {{
                                __CLR4_5_2lawlawlusyjn2h.R.inc(27737);continue;
                            }
                        }}
                    }}}
                }}
                
                {
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27738);List<NameFilter> nameFilters = serializer.nameFilters;
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27739);if ((((nameFilters != null && nameFilters.size() > 0)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27740)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27741)==0&false))) {{
                        __CLR4_5_2lawlawlusyjn2h.R.inc(27742);if ((((entryKey == null || entryKey instanceof String)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27743)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27744)==0&false))) {{
                            __CLR4_5_2lawlawlusyjn2h.R.inc(27745);entryKey = this.processKey(serializer, object, (String) entryKey, value);
                        } }else {__CLR4_5_2lawlawlusyjn2h.R.inc(27746);if ((((entryKey.getClass().isPrimitive() || entryKey instanceof Number)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27747)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27748)==0&false))) {{
                            __CLR4_5_2lawlawlusyjn2h.R.inc(27749);String strKey = JSON.toJSONString(entryKey);
                            __CLR4_5_2lawlawlusyjn2h.R.inc(27750);entryKey = this.processKey(serializer, object, strKey, value);
                        }
                    }}}
                }}
                {
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27751);List<NameFilter> nameFilters = this.nameFilters;
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27752);if ((((nameFilters != null && nameFilters.size() > 0)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27753)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27754)==0&false))) {{
                        __CLR4_5_2lawlawlusyjn2h.R.inc(27755);if ((((entryKey == null || entryKey instanceof String)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27756)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27757)==0&false))) {{
                            __CLR4_5_2lawlawlusyjn2h.R.inc(27758);entryKey = this.processKey(serializer, object, (String) entryKey, value);
                        } }else {__CLR4_5_2lawlawlusyjn2h.R.inc(27759);if ((((entryKey.getClass().isPrimitive() || entryKey instanceof Number)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27760)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27761)==0&false))) {{
                            __CLR4_5_2lawlawlusyjn2h.R.inc(27762);String strKey = JSON.toJSONString(entryKey);
                            __CLR4_5_2lawlawlusyjn2h.R.inc(27763);entryKey = this.processKey(serializer, object, strKey, value);
                        }
                    }}}
                }}

                {
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27764);if ((((entryKey == null || entryKey instanceof String)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27765)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27766)==0&false))) {{
                        __CLR4_5_2lawlawlusyjn2h.R.inc(27767);value = this.processValue(serializer, null, object, (String) entryKey, value, features);
                    } }else {{
                        __CLR4_5_2lawlawlusyjn2h.R.inc(27768);boolean objectOrArray = entryKey instanceof Map || entryKey instanceof Collection;
                        __CLR4_5_2lawlawlusyjn2h.R.inc(27769);if ((((!objectOrArray)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27770)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27771)==0&false))) {{
                            __CLR4_5_2lawlawlusyjn2h.R.inc(27772);String strKey = JSON.toJSONString(entryKey);
                            __CLR4_5_2lawlawlusyjn2h.R.inc(27773);value = this.processValue(serializer, null, object, strKey, value, features);
                        }
                    }}
                }}

                __CLR4_5_2lawlawlusyjn2h.R.inc(27774);if ((((value == null)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27775)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27776)==0&false))) {{
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27777);if ((((!SerializerFeature.isEnabled(out.features, features, SerializerFeature.WriteMapNullValue))&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27778)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27779)==0&false))) {{
                        __CLR4_5_2lawlawlusyjn2h.R.inc(27780);continue;
                    }
                }}

                }__CLR4_5_2lawlawlusyjn2h.R.inc(27781);if ((((entryKey instanceof String)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27782)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27783)==0&false))) {{
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27784);String key = (String) entryKey;

                    __CLR4_5_2lawlawlusyjn2h.R.inc(27785);if ((((!first)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27786)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27787)==0&false))) {{
                        __CLR4_5_2lawlawlusyjn2h.R.inc(27788);out.write(',');
                    }

                    }__CLR4_5_2lawlawlusyjn2h.R.inc(27789);if ((((out.isEnabled(SerializerFeature.PrettyFormat))&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27790)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27791)==0&false))) {{
                        __CLR4_5_2lawlawlusyjn2h.R.inc(27792);serializer.println();
                    }
                    }__CLR4_5_2lawlawlusyjn2h.R.inc(27793);out.writeFieldName(key, true);
                } }else {{
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27794);if ((((!first)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27795)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27796)==0&false))) {{
                        __CLR4_5_2lawlawlusyjn2h.R.inc(27797);out.write(',');
                    }

                    }__CLR4_5_2lawlawlusyjn2h.R.inc(27798);if (((((out.isEnabled(NON_STRINGKEY_AS_STRING) || SerializerFeature.isEnabled(features, SerializerFeature.WriteNonStringKeyAsString))
                            && !(entryKey instanceof Enum))&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27799)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27800)==0&false))) {{
                        __CLR4_5_2lawlawlusyjn2h.R.inc(27801);String strEntryKey = JSON.toJSONString(entryKey);
                        __CLR4_5_2lawlawlusyjn2h.R.inc(27802);serializer.write(strEntryKey);
                    } }else {{
                        __CLR4_5_2lawlawlusyjn2h.R.inc(27803);serializer.write(entryKey);
                    }

                    }__CLR4_5_2lawlawlusyjn2h.R.inc(27804);out.write(':');
                }

                }__CLR4_5_2lawlawlusyjn2h.R.inc(27805);first = false;

                __CLR4_5_2lawlawlusyjn2h.R.inc(27806);if ((((value == null)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27807)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27808)==0&false))) {{
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27809);out.writeNull();
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27810);continue;
                }

                }__CLR4_5_2lawlawlusyjn2h.R.inc(27811);Class<?> clazz = value.getClass();

                __CLR4_5_2lawlawlusyjn2h.R.inc(27812);if ((((clazz != preClazz)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27813)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27814)==0&false))) {{
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27815);preClazz = clazz;
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27816);preWriter = serializer.getObjectWriter(clazz);
                }

                }__CLR4_5_2lawlawlusyjn2h.R.inc(27817);if ((((SerializerFeature.isEnabled(features, SerializerFeature.WriteClassName)
                        && preWriter instanceof JavaBeanSerializer)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27818)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27819)==0&false))) {{
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27820);Type valueType = null;
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27821);if ((((fieldType instanceof ParameterizedType)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27822)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27823)==0&false))) {{
                        __CLR4_5_2lawlawlusyjn2h.R.inc(27824);ParameterizedType parameterizedType = (ParameterizedType) fieldType;
                        __CLR4_5_2lawlawlusyjn2h.R.inc(27825);Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        __CLR4_5_2lawlawlusyjn2h.R.inc(27826);if ((((actualTypeArguments.length == 2)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27827)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27828)==0&false))) {{
                            __CLR4_5_2lawlawlusyjn2h.R.inc(27829);valueType = actualTypeArguments[1];
                        }
                    }}

                    }__CLR4_5_2lawlawlusyjn2h.R.inc(27830);JavaBeanSerializer javaBeanSerializer = (JavaBeanSerializer) preWriter;
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27831);javaBeanSerializer.writeNoneASM(serializer, value, entryKey, valueType, features);
                } }else {{
                    __CLR4_5_2lawlawlusyjn2h.R.inc(27832);preWriter.write(serializer, value, entryKey, null, features);
                }
            }}
        }} finally {
            __CLR4_5_2lawlawlusyjn2h.R.inc(27833);serializer.context = parent;
        }

        __CLR4_5_2lawlawlusyjn2h.R.inc(27834);serializer.decrementIdent();
        __CLR4_5_2lawlawlusyjn2h.R.inc(27835);if ((((out.isEnabled(SerializerFeature.PrettyFormat) && map.size() > 0)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27836)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27837)==0&false))) {{
            __CLR4_5_2lawlawlusyjn2h.R.inc(27838);serializer.println();
        }

        }__CLR4_5_2lawlawlusyjn2h.R.inc(27839);if ((((!unwrapped)&&(__CLR4_5_2lawlawlusyjn2h.R.iget(27840)!=0|true))||(__CLR4_5_2lawlawlusyjn2h.R.iget(27841)==0&false))) {{
            __CLR4_5_2lawlawlusyjn2h.R.inc(27842);out.write('}');
        }
    }}finally{__CLR4_5_2lawlawlusyjn2h.R.flushNeeded();}}

}
