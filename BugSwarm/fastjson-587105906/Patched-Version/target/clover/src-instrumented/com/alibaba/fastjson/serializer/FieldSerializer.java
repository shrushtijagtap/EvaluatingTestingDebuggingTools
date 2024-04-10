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

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.TypeUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Collection;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class FieldSerializer implements Comparable<FieldSerializer> {public static class __CLR4_5_2jqwjqwlusyjmua{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,25864,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final FieldInfo        fieldInfo;
    protected final boolean       writeNull;
    protected int                 features;

    private final String          double_quoted_fieldPrefix;
    private String                single_quoted_fieldPrefix;
    private String                un_quoted_fieldPrefix;

    protected BeanContext         fieldContext;

    private String                format;
    protected boolean             writeEnumUsingToString  = false;
    protected boolean             writeEnumUsingName      = false;
    protected boolean             disableCircularReferenceDetect = false;

    protected boolean             serializeUsing          = false;

    protected boolean             persistenceXToMany      = false; // OneToMany or ManyToMany
    protected boolean             browserCompatible;

    private RuntimeSerializerInfo runtimeInfo;
    
    public FieldSerializer(Class<?> beanType, FieldInfo fieldInfo) {try{__CLR4_5_2jqwjqwlusyjmua.R.inc(25592);
        __CLR4_5_2jqwjqwlusyjmua.R.inc(25593);this.fieldInfo = fieldInfo;
        __CLR4_5_2jqwjqwlusyjmua.R.inc(25594);this.fieldContext = new BeanContext(beanType, fieldInfo);

        __CLR4_5_2jqwjqwlusyjmua.R.inc(25595);if ((((beanType != null
                && (fieldInfo.isEnum
                    || fieldInfo.fieldClass == long.class
                    || fieldInfo.fieldClass == Long.class
                    || fieldInfo.fieldClass == BigInteger.class
                    || fieldInfo.fieldClass == BigDecimal.class)
        )&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25596)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25597)==0&false))) {{
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25598);JSONType jsonType = TypeUtils.getAnnotation(beanType,JSONType.class);
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25599);if ((((jsonType != null)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25600)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25601)==0&false))) {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25602);for (SerializerFeature feature : jsonType.serialzeFeatures()) {{
                    __CLR4_5_2jqwjqwlusyjmua.R.inc(25603);if ((((feature == SerializerFeature.WriteEnumUsingToString)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25604)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25605)==0&false))) {{
                        __CLR4_5_2jqwjqwlusyjmua.R.inc(25606);writeEnumUsingToString = true;
                    } }else {__CLR4_5_2jqwjqwlusyjmua.R.inc(25607);if((((feature == SerializerFeature.WriteEnumUsingName)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25608)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25609)==0&false))){{
                        __CLR4_5_2jqwjqwlusyjmua.R.inc(25610);writeEnumUsingName = true;
                    } }else {__CLR4_5_2jqwjqwlusyjmua.R.inc(25611);if((((feature == SerializerFeature.DisableCircularReferenceDetect)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25612)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25613)==0&false))){{
                        __CLR4_5_2jqwjqwlusyjmua.R.inc(25614);disableCircularReferenceDetect = true;
                    } }else {__CLR4_5_2jqwjqwlusyjmua.R.inc(25615);if((((feature == SerializerFeature.BrowserCompatible)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25616)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25617)==0&false))){{
                        __CLR4_5_2jqwjqwlusyjmua.R.inc(25618);features |= SerializerFeature.BrowserCompatible.mask;
                        __CLR4_5_2jqwjqwlusyjmua.R.inc(25619);browserCompatible = true;
                    }
                }}}}}
            }}
        }}
        
        }__CLR4_5_2jqwjqwlusyjmua.R.inc(25620);fieldInfo.setAccessible();

        __CLR4_5_2jqwjqwlusyjmua.R.inc(25621);this.double_quoted_fieldPrefix = '"' + fieldInfo.name + "\":";

        __CLR4_5_2jqwjqwlusyjmua.R.inc(25622);boolean writeNull = false;
        __CLR4_5_2jqwjqwlusyjmua.R.inc(25623);JSONField annotation = fieldInfo.getAnnotation();
        __CLR4_5_2jqwjqwlusyjmua.R.inc(25624);if ((((annotation != null)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25625)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25626)==0&false))) {{
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25627);for (SerializerFeature feature : annotation.serialzeFeatures()) {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25628);if (((((feature.getMask() & SerializerFeature.WRITE_MAP_NULL_FEATURES) != 0)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25629)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25630)==0&false))) {{
                    __CLR4_5_2jqwjqwlusyjmua.R.inc(25631);writeNull = true;
                    __CLR4_5_2jqwjqwlusyjmua.R.inc(25632);break;
                }
            }}

            }__CLR4_5_2jqwjqwlusyjmua.R.inc(25633);format = annotation.format();

            __CLR4_5_2jqwjqwlusyjmua.R.inc(25634);if ((((format.trim().length() == 0)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25635)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25636)==0&false))) {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25637);format = null;
            }

            }__CLR4_5_2jqwjqwlusyjmua.R.inc(25638);for (SerializerFeature feature : annotation.serialzeFeatures()) {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25639);if ((((feature == SerializerFeature.WriteEnumUsingToString)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25640)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25641)==0&false))) {{
                    __CLR4_5_2jqwjqwlusyjmua.R.inc(25642);writeEnumUsingToString = true;
                } }else {__CLR4_5_2jqwjqwlusyjmua.R.inc(25643);if((((feature == SerializerFeature.WriteEnumUsingName)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25644)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25645)==0&false))){{
                    __CLR4_5_2jqwjqwlusyjmua.R.inc(25646);writeEnumUsingName = true;
                } }else {__CLR4_5_2jqwjqwlusyjmua.R.inc(25647);if((((feature == SerializerFeature.DisableCircularReferenceDetect)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25648)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25649)==0&false))){{
                    __CLR4_5_2jqwjqwlusyjmua.R.inc(25650);disableCircularReferenceDetect = true;
                } }else {__CLR4_5_2jqwjqwlusyjmua.R.inc(25651);if((((feature == SerializerFeature.BrowserCompatible)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25652)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25653)==0&false))){{
                    __CLR4_5_2jqwjqwlusyjmua.R.inc(25654);browserCompatible = true;
                }
            }}}}}
            
            }__CLR4_5_2jqwjqwlusyjmua.R.inc(25655);features = SerializerFeature.of(annotation.serialzeFeatures());
        }
        
        }__CLR4_5_2jqwjqwlusyjmua.R.inc(25656);this.writeNull = writeNull;

        __CLR4_5_2jqwjqwlusyjmua.R.inc(25657);persistenceXToMany = TypeUtils.isAnnotationPresentOneToMany(fieldInfo.method)
                || TypeUtils.isAnnotationPresentManyToMany(fieldInfo.method);
    }finally{__CLR4_5_2jqwjqwlusyjmua.R.flushNeeded();}}

    public void writePrefix(JSONSerializer serializer) throws IOException {try{__CLR4_5_2jqwjqwlusyjmua.R.inc(25658);
        __CLR4_5_2jqwjqwlusyjmua.R.inc(25659);SerializeWriter out = serializer.out;

        __CLR4_5_2jqwjqwlusyjmua.R.inc(25660);if ((((out.quoteFieldNames)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25661)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25662)==0&false))) {{
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25663);boolean useSingleQuotes = SerializerFeature.isEnabled(out.features, fieldInfo.serialzeFeatures, SerializerFeature.UseSingleQuotes);
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25664);if ((((useSingleQuotes)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25665)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25666)==0&false))) {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25667);if ((((single_quoted_fieldPrefix == null)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25668)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25669)==0&false))) {{
                    __CLR4_5_2jqwjqwlusyjmua.R.inc(25670);single_quoted_fieldPrefix = '\'' + fieldInfo.name + "\':";
                }
                }__CLR4_5_2jqwjqwlusyjmua.R.inc(25671);out.write(single_quoted_fieldPrefix);
            } }else {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25672);out.write(double_quoted_fieldPrefix);
            }
        }} }else {{
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25673);if ((((un_quoted_fieldPrefix == null)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25674)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25675)==0&false))) {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25676);this.un_quoted_fieldPrefix = fieldInfo.name + ":";
            }
            }__CLR4_5_2jqwjqwlusyjmua.R.inc(25677);out.write(un_quoted_fieldPrefix);
        }
    }}finally{__CLR4_5_2jqwjqwlusyjmua.R.flushNeeded();}}

    public Object getPropertyValueDirect(Object object) throws InvocationTargetException, IllegalAccessException {try{__CLR4_5_2jqwjqwlusyjmua.R.inc(25678);
        __CLR4_5_2jqwjqwlusyjmua.R.inc(25679);Object fieldValue =  fieldInfo.get(object);
        __CLR4_5_2jqwjqwlusyjmua.R.inc(25680);if ((((persistenceXToMany && !TypeUtils.isHibernateInitialized(fieldValue))&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25681)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25682)==0&false))) {{
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25683);return null;
        }
        }__CLR4_5_2jqwjqwlusyjmua.R.inc(25684);return fieldValue;
    }finally{__CLR4_5_2jqwjqwlusyjmua.R.flushNeeded();}}

    public Object getPropertyValue(Object object) throws InvocationTargetException, IllegalAccessException {try{__CLR4_5_2jqwjqwlusyjmua.R.inc(25685);
        __CLR4_5_2jqwjqwlusyjmua.R.inc(25686);Object propertyValue =  fieldInfo.get(object);
        __CLR4_5_2jqwjqwlusyjmua.R.inc(25687);if ((((format != null && propertyValue != null)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25688)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25689)==0&false))) {{
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25690);if ((((fieldInfo.fieldClass == java.util.Date.class || fieldInfo.fieldClass == java.sql.Date.class)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25691)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25692)==0&false))) {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25693);SimpleDateFormat dateFormat = new SimpleDateFormat(format, JSON.defaultLocale);
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25694);dateFormat.setTimeZone(JSON.defaultTimeZone);
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25695);return dateFormat.format(propertyValue);
            }
        }}
        }__CLR4_5_2jqwjqwlusyjmua.R.inc(25696);return propertyValue;
    }finally{__CLR4_5_2jqwjqwlusyjmua.R.flushNeeded();}}
    
    public int compareTo(FieldSerializer o) {try{__CLR4_5_2jqwjqwlusyjmua.R.inc(25697);
        __CLR4_5_2jqwjqwlusyjmua.R.inc(25698);return this.fieldInfo.compareTo(o.fieldInfo);
    }finally{__CLR4_5_2jqwjqwlusyjmua.R.flushNeeded();}}
    

    public void writeValue(JSONSerializer serializer, Object propertyValue) throws Exception {try{__CLR4_5_2jqwjqwlusyjmua.R.inc(25699);
        __CLR4_5_2jqwjqwlusyjmua.R.inc(25700);if ((((runtimeInfo == null)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25701)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25702)==0&false))) {{

            __CLR4_5_2jqwjqwlusyjmua.R.inc(25703);Class<?> runtimeFieldClass;
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25704);if ((((propertyValue == null)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25705)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25706)==0&false))) {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25707);runtimeFieldClass = this.fieldInfo.fieldClass;
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25708);if ((((runtimeFieldClass == byte.class)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25709)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25710)==0&false))) {{
                    __CLR4_5_2jqwjqwlusyjmua.R.inc(25711);runtimeFieldClass = Byte.class;
                } }else {__CLR4_5_2jqwjqwlusyjmua.R.inc(25712);if ((((runtimeFieldClass == short.class)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25713)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25714)==0&false))) {{
                    __CLR4_5_2jqwjqwlusyjmua.R.inc(25715);runtimeFieldClass = Short.class;
                } }else {__CLR4_5_2jqwjqwlusyjmua.R.inc(25716);if ((((runtimeFieldClass == int.class)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25717)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25718)==0&false))) {{
                    __CLR4_5_2jqwjqwlusyjmua.R.inc(25719);runtimeFieldClass = Integer.class;
                } }else {__CLR4_5_2jqwjqwlusyjmua.R.inc(25720);if ((((runtimeFieldClass == long.class)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25721)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25722)==0&false))) {{
                    __CLR4_5_2jqwjqwlusyjmua.R.inc(25723);runtimeFieldClass = Long.class;
                } }else {__CLR4_5_2jqwjqwlusyjmua.R.inc(25724);if ((((runtimeFieldClass == float.class)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25725)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25726)==0&false))) {{
                    __CLR4_5_2jqwjqwlusyjmua.R.inc(25727);runtimeFieldClass = Float.class;
                } }else {__CLR4_5_2jqwjqwlusyjmua.R.inc(25728);if ((((runtimeFieldClass == double.class)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25729)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25730)==0&false))) {{
                    __CLR4_5_2jqwjqwlusyjmua.R.inc(25731);runtimeFieldClass = Double.class;
                } }else {__CLR4_5_2jqwjqwlusyjmua.R.inc(25732);if ((((runtimeFieldClass == boolean.class)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25733)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25734)==0&false))) {{
                    __CLR4_5_2jqwjqwlusyjmua.R.inc(25735);runtimeFieldClass = Boolean.class;
                }
            }}}}}}}} }else {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25736);runtimeFieldClass = propertyValue.getClass();
            }

            }__CLR4_5_2jqwjqwlusyjmua.R.inc(25737);ObjectSerializer fieldSerializer = null;
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25738);JSONField fieldAnnotation = fieldInfo.getAnnotation();

            __CLR4_5_2jqwjqwlusyjmua.R.inc(25739);if ((((fieldAnnotation != null && fieldAnnotation.serializeUsing() != Void.class)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25740)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25741)==0&false))) {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25742);fieldSerializer = (ObjectSerializer) fieldAnnotation.serializeUsing().newInstance();
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25743);serializeUsing = true;
            } }else {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25744);if ((((format != null)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25745)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25746)==0&false))) {{
                    __CLR4_5_2jqwjqwlusyjmua.R.inc(25747);if ((((runtimeFieldClass == double.class || runtimeFieldClass == Double.class)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25748)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25749)==0&false))) {{
                        __CLR4_5_2jqwjqwlusyjmua.R.inc(25750);fieldSerializer = new DoubleSerializer(format);
                    } }else {__CLR4_5_2jqwjqwlusyjmua.R.inc(25751);if ((((runtimeFieldClass == float.class || runtimeFieldClass == Float.class)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25752)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25753)==0&false))) {{
                        __CLR4_5_2jqwjqwlusyjmua.R.inc(25754);fieldSerializer = new FloatCodec(format);
                    }
                }}}

                }__CLR4_5_2jqwjqwlusyjmua.R.inc(25755);if ((((fieldSerializer == null)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25756)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25757)==0&false))) {{
                    __CLR4_5_2jqwjqwlusyjmua.R.inc(25758);fieldSerializer = serializer.getObjectWriter(runtimeFieldClass);
                }
            }}

            }__CLR4_5_2jqwjqwlusyjmua.R.inc(25759);runtimeInfo = new RuntimeSerializerInfo(fieldSerializer, runtimeFieldClass);
        }
        
        }__CLR4_5_2jqwjqwlusyjmua.R.inc(25760);final RuntimeSerializerInfo runtimeInfo = this.runtimeInfo;
        
        __CLR4_5_2jqwjqwlusyjmua.R.inc(25761);final int fieldFeatures
                = ((((disableCircularReferenceDetect
                )&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25762)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25763)==0&false))? (fieldInfo.serialzeFeatures | SerializerFeature.DisableCircularReferenceDetect.mask)
                : fieldInfo.serialzeFeatures) | features;

        __CLR4_5_2jqwjqwlusyjmua.R.inc(25764);if ((((propertyValue == null)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25765)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25766)==0&false))) {{
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25767);SerializeWriter out  = serializer.out;

            __CLR4_5_2jqwjqwlusyjmua.R.inc(25768);if ((((fieldInfo.fieldClass == Object.class
                    && out.isEnabled(SerializerFeature.WRITE_MAP_NULL_FEATURES))&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25769)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25770)==0&false))) {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25771);out.writeNull();
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25772);return;
            }

            }__CLR4_5_2jqwjqwlusyjmua.R.inc(25773);Class<?> runtimeFieldClass = runtimeInfo.runtimeFieldClass;

            __CLR4_5_2jqwjqwlusyjmua.R.inc(25774);if ((((Number.class.isAssignableFrom(runtimeFieldClass))&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25775)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25776)==0&false))) {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25777);out.writeNull(features, SerializerFeature.WriteNullNumberAsZero.mask);
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25778);return;
            } }else {__CLR4_5_2jqwjqwlusyjmua.R.inc(25779);if ((((String.class == runtimeFieldClass)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25780)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25781)==0&false))) {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25782);out.writeNull(features, SerializerFeature.WriteNullStringAsEmpty.mask);
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25783);return;
            } }else {__CLR4_5_2jqwjqwlusyjmua.R.inc(25784);if ((((Boolean.class == runtimeFieldClass)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25785)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25786)==0&false))) {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25787);out.writeNull(features, SerializerFeature.WriteNullBooleanAsFalse.mask);
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25788);return;
            } }else {__CLR4_5_2jqwjqwlusyjmua.R.inc(25789);if ((((Collection.class.isAssignableFrom(runtimeFieldClass))&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25790)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25791)==0&false))) {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25792);out.writeNull(features, SerializerFeature.WriteNullListAsEmpty.mask);
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25793);return;
            }

            }}}}__CLR4_5_2jqwjqwlusyjmua.R.inc(25794);ObjectSerializer fieldSerializer = runtimeInfo.fieldSerializer;

            __CLR4_5_2jqwjqwlusyjmua.R.inc(25795);if (((((out.isEnabled(SerializerFeature.WRITE_MAP_NULL_FEATURES))
                    && fieldSerializer instanceof JavaBeanSerializer)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25796)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25797)==0&false))) {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25798);out.writeNull();
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25799);return;
            }

            }__CLR4_5_2jqwjqwlusyjmua.R.inc(25800);fieldSerializer.write(serializer, null, fieldInfo.name, fieldInfo.fieldType, fieldFeatures);
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25801);return;
        }

        }__CLR4_5_2jqwjqwlusyjmua.R.inc(25802);if ((((fieldInfo.isEnum)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25803)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25804)==0&false))) {{
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25805);if ((((writeEnumUsingName)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25806)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25807)==0&false))) {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25808);serializer.out.writeString(((Enum<?>) propertyValue).name());
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25809);return;
            }

            }__CLR4_5_2jqwjqwlusyjmua.R.inc(25810);if ((((writeEnumUsingToString)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25811)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25812)==0&false))) {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25813);serializer.out.writeString(((Enum<?>) propertyValue).toString());
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25814);return;
            }
        }}
        
        }__CLR4_5_2jqwjqwlusyjmua.R.inc(25815);Class<?> valueClass = propertyValue.getClass();
        __CLR4_5_2jqwjqwlusyjmua.R.inc(25816);ObjectSerializer valueSerializer;
        __CLR4_5_2jqwjqwlusyjmua.R.inc(25817);if ((((valueClass == runtimeInfo.runtimeFieldClass || serializeUsing)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25818)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25819)==0&false))) {{
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25820);valueSerializer = runtimeInfo.fieldSerializer;
        } }else {{
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25821);valueSerializer = serializer.getObjectWriter(valueClass);
        }
        
        }__CLR4_5_2jqwjqwlusyjmua.R.inc(25822);if ((((format != null && !(valueSerializer instanceof DoubleSerializer || valueSerializer instanceof FloatCodec))&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25823)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25824)==0&false))) {{
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25825);if ((((valueSerializer instanceof ContextObjectSerializer)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25826)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25827)==0&false))) {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25828);((ContextObjectSerializer) valueSerializer).write(serializer, propertyValue, this.fieldContext);    
            } }else {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25829);serializer.writeWithFormat(propertyValue, format);
            }
            }__CLR4_5_2jqwjqwlusyjmua.R.inc(25830);return;
        }

        }__CLR4_5_2jqwjqwlusyjmua.R.inc(25831);if ((((fieldInfo.unwrapped)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25832)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25833)==0&false))) {{
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25834);if ((((valueSerializer instanceof JavaBeanSerializer)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25835)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25836)==0&false))) {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25837);JavaBeanSerializer javaBeanSerializer = (JavaBeanSerializer) valueSerializer;
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25838);javaBeanSerializer.write(serializer, propertyValue, fieldInfo.name, fieldInfo.fieldType, fieldFeatures, true);
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25839);return;
            }

            }__CLR4_5_2jqwjqwlusyjmua.R.inc(25840);if ((((valueSerializer instanceof MapSerializer)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25841)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25842)==0&false))) {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25843);MapSerializer mapSerializer = (MapSerializer) valueSerializer;
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25844);mapSerializer.write(serializer, propertyValue, fieldInfo.name, fieldInfo.fieldType, fieldFeatures, true);
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25845);return;
            }
        }}

        }__CLR4_5_2jqwjqwlusyjmua.R.inc(25846);if (((((features & SerializerFeature.WriteClassName.mask) != 0
                && valueClass != fieldInfo.fieldClass
                && JavaBeanSerializer.class.isInstance(valueSerializer))&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25847)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25848)==0&false))) {{
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25849);((JavaBeanSerializer) valueSerializer).write(serializer, propertyValue, fieldInfo.name, fieldInfo.fieldType, fieldFeatures, false);
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25850);return;
        }

        }__CLR4_5_2jqwjqwlusyjmua.R.inc(25851);if ((((browserCompatible && propertyValue != null
                && (fieldInfo.fieldClass == long.class || fieldInfo.fieldClass == Long.class))&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25852)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25853)==0&false))) {{
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25854);long value = (Long) propertyValue;
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25855);if ((((value > 9007199254740991L || value < -9007199254740991L)&&(__CLR4_5_2jqwjqwlusyjmua.R.iget(25856)!=0|true))||(__CLR4_5_2jqwjqwlusyjmua.R.iget(25857)==0&false))) {{
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25858);serializer.getWriter().writeString(Long.toString(value));
                __CLR4_5_2jqwjqwlusyjmua.R.inc(25859);return;
            }
        }}

        }__CLR4_5_2jqwjqwlusyjmua.R.inc(25860);valueSerializer.write(serializer, propertyValue, fieldInfo.name, fieldInfo.fieldType, fieldFeatures);
    }finally{__CLR4_5_2jqwjqwlusyjmua.R.flushNeeded();}}

    static class RuntimeSerializerInfo {
        final ObjectSerializer fieldSerializer;
        final Class<?>         runtimeFieldClass;

        public RuntimeSerializerInfo(ObjectSerializer fieldSerializer, Class<?> runtimeFieldClass){try{__CLR4_5_2jqwjqwlusyjmua.R.inc(25861);
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25862);this.fieldSerializer = fieldSerializer;
            __CLR4_5_2jqwjqwlusyjmua.R.inc(25863);this.runtimeFieldClass = runtimeFieldClass;
        }finally{__CLR4_5_2jqwjqwlusyjmua.R.flushNeeded();}}
    }
}
