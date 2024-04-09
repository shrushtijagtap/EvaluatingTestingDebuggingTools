/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONPOJOBuilder;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class JavaBeanInfo {public static class __CLR4_5_2qoiqoilusvmy13{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,35450,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final Class<?> clazz;
    public final Class<?> builderClass;
    public final Constructor<?> defaultConstructor;
    public final Constructor<?> creatorConstructor;
    public final Method factoryMethod;
    public final Method buildMethod;

    public final int defaultConstructorParameterSize;

    public final FieldInfo[] fields;
    public final FieldInfo[] sortedFields;

    public final int parserFeatures;

    public final JSONType jsonType;

    public final String typeName;
    public final String typeKey;

    public String[] orders;

    public Type[] creatorConstructorParameterTypes;
    public String[] creatorConstructorParameters;

    public boolean kotlin;
    public Constructor<?> kotlinDefaultConstructor;

    public JavaBeanInfo(Class<?> clazz, //
                        Class<?> builderClass, //
                        Constructor<?> defaultConstructor, //
                        Constructor<?> creatorConstructor, //
                        Method factoryMethod, //
                        Method buildMethod, //
                        JSONType jsonType, //
                        List<FieldInfo> fieldList) {try{__CLR4_5_2qoiqoilusvmy13.R.inc(34578);
        __CLR4_5_2qoiqoilusvmy13.R.inc(34579);this.clazz = clazz;
        __CLR4_5_2qoiqoilusvmy13.R.inc(34580);this.builderClass = builderClass;
        __CLR4_5_2qoiqoilusvmy13.R.inc(34581);this.defaultConstructor = defaultConstructor;
        __CLR4_5_2qoiqoilusvmy13.R.inc(34582);this.creatorConstructor = creatorConstructor;
        __CLR4_5_2qoiqoilusvmy13.R.inc(34583);this.factoryMethod = factoryMethod;
        __CLR4_5_2qoiqoilusvmy13.R.inc(34584);this.parserFeatures = TypeUtils.getParserFeatures(clazz);
        __CLR4_5_2qoiqoilusvmy13.R.inc(34585);this.buildMethod = buildMethod;

        __CLR4_5_2qoiqoilusvmy13.R.inc(34586);this.jsonType = jsonType;
        __CLR4_5_2qoiqoilusvmy13.R.inc(34587);if ((((jsonType != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34588)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34589)==0&false))) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(34590);String typeName = jsonType.typeName();
            __CLR4_5_2qoiqoilusvmy13.R.inc(34591);String typeKey = jsonType.typeKey();
            __CLR4_5_2qoiqoilusvmy13.R.inc(34592);this.typeKey = (((typeKey.length() > 0 )&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34593)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34594)==0&false))? typeKey : null;

            __CLR4_5_2qoiqoilusvmy13.R.inc(34595);if ((((typeName.length() != 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34596)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34597)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(34598);this.typeName = typeName;
            } }else {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(34599);this.typeName = clazz.getName();
            }
            }__CLR4_5_2qoiqoilusvmy13.R.inc(34600);String[] orders = jsonType.orders();
            __CLR4_5_2qoiqoilusvmy13.R.inc(34601);this.orders = (((orders.length == 0 )&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34602)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34603)==0&false))? null : orders;
        } }else {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(34604);this.typeName = clazz.getName();
            __CLR4_5_2qoiqoilusvmy13.R.inc(34605);this.typeKey = null;
            __CLR4_5_2qoiqoilusvmy13.R.inc(34606);this.orders = null;
        }

        }__CLR4_5_2qoiqoilusvmy13.R.inc(34607);fields = new FieldInfo[fieldList.size()];
        __CLR4_5_2qoiqoilusvmy13.R.inc(34608);fieldList.toArray(fields);

        __CLR4_5_2qoiqoilusvmy13.R.inc(34609);FieldInfo[] sortedFields = new FieldInfo[fields.length];
        __CLR4_5_2qoiqoilusvmy13.R.inc(34610);if ((((orders != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34611)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34612)==0&false))) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(34613);LinkedHashMap<String, FieldInfo> map = new LinkedHashMap<String, FieldInfo>(fieldList.size());
            __CLR4_5_2qoiqoilusvmy13.R.inc(34614);for (FieldInfo field : fields) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(34615);map.put(field.name, field);
            }
            }__CLR4_5_2qoiqoilusvmy13.R.inc(34616);int i = 0;
            __CLR4_5_2qoiqoilusvmy13.R.inc(34617);for (String item : orders) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(34618);FieldInfo field = map.get(item);
                __CLR4_5_2qoiqoilusvmy13.R.inc(34619);if ((((field != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34620)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34621)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34622);sortedFields[i++] = field;
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34623);map.remove(item);
                }
            }}
            }__CLR4_5_2qoiqoilusvmy13.R.inc(34624);for (FieldInfo field : map.values()) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(34625);sortedFields[i++] = field;
            }
        }} }else {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(34626);System.arraycopy(fields, 0, sortedFields, 0, fields.length);
            __CLR4_5_2qoiqoilusvmy13.R.inc(34627);Arrays.sort(sortedFields);
        }

        }__CLR4_5_2qoiqoilusvmy13.R.inc(34628);if ((((Arrays.equals(fields, sortedFields))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34629)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34630)==0&false))) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(34631);sortedFields = fields;
        }
        }__CLR4_5_2qoiqoilusvmy13.R.inc(34632);this.sortedFields = sortedFields;

        __CLR4_5_2qoiqoilusvmy13.R.inc(34633);if ((((defaultConstructor != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34634)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34635)==0&false))) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(34636);defaultConstructorParameterSize = defaultConstructor.getParameterTypes().length;
        } }else {__CLR4_5_2qoiqoilusvmy13.R.inc(34637);if ((((factoryMethod != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34638)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34639)==0&false))) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(34640);defaultConstructorParameterSize = factoryMethod.getParameterTypes().length;
        } }else {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(34641);defaultConstructorParameterSize = 0;
        }

        }}__CLR4_5_2qoiqoilusvmy13.R.inc(34642);if ((((creatorConstructor != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34643)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34644)==0&false))) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(34645);this.creatorConstructorParameterTypes = creatorConstructor.getParameterTypes();


            __CLR4_5_2qoiqoilusvmy13.R.inc(34646);kotlin = TypeUtils.isKotlin(clazz);
            __CLR4_5_2qoiqoilusvmy13.R.inc(34647);if ((((kotlin)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34648)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34649)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(34650);this.creatorConstructorParameters = TypeUtils.getKoltinConstructorParameters(clazz);
                __CLR4_5_2qoiqoilusvmy13.R.inc(34651);try {
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34652);this.kotlinDefaultConstructor = clazz.getConstructor();
                } catch (Throwable ex) {
                    // skip
                }

                __CLR4_5_2qoiqoilusvmy13.R.inc(34653);Annotation[][] paramAnnotationArrays = TypeUtils.getParameterAnnotations(creatorConstructor);
                __CLR4_5_2qoiqoilusvmy13.R.inc(34654);for (int i = 0; (((i < creatorConstructorParameters.length && i < paramAnnotationArrays.length)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34655)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34656)==0&false)); ++i) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34657);Annotation[] paramAnnotations = paramAnnotationArrays[i];
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34658);JSONField fieldAnnotation = null;
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34659);for (Annotation paramAnnotation : paramAnnotations) {{
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34660);if ((((paramAnnotation instanceof JSONField)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34661)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34662)==0&false))) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34663);fieldAnnotation = (JSONField) paramAnnotation;
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34664);break;
                        }
                    }}
                    }__CLR4_5_2qoiqoilusvmy13.R.inc(34665);if ((((fieldAnnotation != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34666)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34667)==0&false))) {{
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34668);String fieldAnnotationName = fieldAnnotation.name();
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34669);if ((((fieldAnnotationName.length() > 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34670)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34671)==0&false))) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34672);creatorConstructorParameters[i] = fieldAnnotationName;
                        }
                    }}
                }}
            }} }else {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(34673);boolean match;
                __CLR4_5_2qoiqoilusvmy13.R.inc(34674);if ((((creatorConstructorParameterTypes.length != fields.length)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34675)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34676)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34677);match = false;
                } }else {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34678);match = true;
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34679);for (int i = 0; (((i < creatorConstructorParameterTypes.length)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34680)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34681)==0&false)); i++) {{
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34682);if ((((creatorConstructorParameterTypes[i] != fields[i].fieldClass)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34683)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34684)==0&false))) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34685);match = false;
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34686);break;
                        }
                    }}
                }}

                }__CLR4_5_2qoiqoilusvmy13.R.inc(34687);if ((((!match)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34688)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34689)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34690);this.creatorConstructorParameters = ASMUtils.lookupParameterNames(creatorConstructor);
                }
            }}
        }}
    }}finally{__CLR4_5_2qoiqoilusvmy13.R.flushNeeded();}}

    private static FieldInfo getField(List<FieldInfo> fieldList, String propertyName) {try{__CLR4_5_2qoiqoilusvmy13.R.inc(34691);
        __CLR4_5_2qoiqoilusvmy13.R.inc(34692);for (FieldInfo item : fieldList) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(34693);if ((((item.name.equals(propertyName))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34694)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34695)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(34696);return item;
            }

            }__CLR4_5_2qoiqoilusvmy13.R.inc(34697);Field field = item.field;
            __CLR4_5_2qoiqoilusvmy13.R.inc(34698);if ((((field != null && item.getAnnotation() != null && field.getName().equals(propertyName))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34699)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34700)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(34701);return item;
            }
        }}
        }__CLR4_5_2qoiqoilusvmy13.R.inc(34702);return null;
    }finally{__CLR4_5_2qoiqoilusvmy13.R.flushNeeded();}}


    static boolean add(List<FieldInfo> fieldList, FieldInfo field) {try{__CLR4_5_2qoiqoilusvmy13.R.inc(34703);
        __CLR4_5_2qoiqoilusvmy13.R.inc(34704);for (int i = fieldList.size() - 1; (((i >= 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34705)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34706)==0&false)); --i) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(34707);FieldInfo item = fieldList.get(i);

            __CLR4_5_2qoiqoilusvmy13.R.inc(34708);if ((((item.name.equals(field.name))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34709)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34710)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(34711);if ((((item.getOnly && !field.getOnly)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34712)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34713)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34714);continue;
                }

                }__CLR4_5_2qoiqoilusvmy13.R.inc(34715);if ((((item.fieldClass.isAssignableFrom(field.fieldClass))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34716)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34717)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34718);fieldList.set(i, field);
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34719);return true;
                }

                }__CLR4_5_2qoiqoilusvmy13.R.inc(34720);int result = item.compareTo(field);

                __CLR4_5_2qoiqoilusvmy13.R.inc(34721);if ((((result < 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34722)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34723)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34724);fieldList.set(i, field);
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34725);return true;
                } }else {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34726);return false;
                }
            }}
        }}
        }__CLR4_5_2qoiqoilusvmy13.R.inc(34727);fieldList.add(field);

        __CLR4_5_2qoiqoilusvmy13.R.inc(34728);return true;
    }finally{__CLR4_5_2qoiqoilusvmy13.R.flushNeeded();}}

    public static JavaBeanInfo build(Class<?> clazz, Type type, PropertyNamingStrategy propertyNamingStrategy) {try{__CLR4_5_2qoiqoilusvmy13.R.inc(34729);
        __CLR4_5_2qoiqoilusvmy13.R.inc(34730);return build(clazz, type, propertyNamingStrategy, false, TypeUtils.compatibleWithJavaBean, false);
    }finally{__CLR4_5_2qoiqoilusvmy13.R.flushNeeded();}}

    public static JavaBeanInfo build(Class<?> clazz //
            , Type type //
            , PropertyNamingStrategy propertyNamingStrategy //
            , boolean fieldBased //
            , boolean compatibleWithJavaBean
    ) {try{__CLR4_5_2qoiqoilusvmy13.R.inc(34731);
        __CLR4_5_2qoiqoilusvmy13.R.inc(34732);return build(clazz, type, propertyNamingStrategy, fieldBased, compatibleWithJavaBean, false);
    }finally{__CLR4_5_2qoiqoilusvmy13.R.flushNeeded();}}

    public static JavaBeanInfo build(Class<?> clazz //
            , Type type //
            , PropertyNamingStrategy propertyNamingStrategy //
            , boolean fieldBased //
            , boolean compatibleWithJavaBean
            , boolean jacksonCompatible
    ) {try{__CLR4_5_2qoiqoilusvmy13.R.inc(34733);
        __CLR4_5_2qoiqoilusvmy13.R.inc(34734);JSONType jsonType = TypeUtils.getAnnotation(clazz,JSONType.class);
        __CLR4_5_2qoiqoilusvmy13.R.inc(34735);if ((((jsonType != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34736)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34737)==0&false))) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(34738);PropertyNamingStrategy jsonTypeNaming = jsonType.naming();
            __CLR4_5_2qoiqoilusvmy13.R.inc(34739);if ((((jsonTypeNaming != null && jsonTypeNaming != PropertyNamingStrategy.CamelCase)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34740)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34741)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(34742);propertyNamingStrategy = jsonTypeNaming;
            }
        }}

        }__CLR4_5_2qoiqoilusvmy13.R.inc(34743);Class<?> builderClass = getBuilderClass(clazz, jsonType);

        __CLR4_5_2qoiqoilusvmy13.R.inc(34744);Field[] declaredFields = clazz.getDeclaredFields();
        __CLR4_5_2qoiqoilusvmy13.R.inc(34745);Method[] methods = clazz.getMethods();

        __CLR4_5_2qoiqoilusvmy13.R.inc(34746);boolean kotlin = TypeUtils.isKotlin(clazz);
        __CLR4_5_2qoiqoilusvmy13.R.inc(34747);Constructor[] constructors = clazz.getDeclaredConstructors();

        __CLR4_5_2qoiqoilusvmy13.R.inc(34748);Constructor<?> defaultConstructor = null;
        __CLR4_5_2qoiqoilusvmy13.R.inc(34749);if (((((!kotlin) || constructors.length == 1)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34750)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34751)==0&false))) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(34752);if ((((builderClass == null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34753)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34754)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(34755);defaultConstructor = getDefaultConstructor(clazz, constructors);
            } }else {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(34756);defaultConstructor = getDefaultConstructor(builderClass, builderClass.getDeclaredConstructors());
            }
        }}

        }__CLR4_5_2qoiqoilusvmy13.R.inc(34757);Constructor<?> creatorConstructor = null;
        __CLR4_5_2qoiqoilusvmy13.R.inc(34758);Method buildMethod = null;
        __CLR4_5_2qoiqoilusvmy13.R.inc(34759);Method factoryMethod = null;

        __CLR4_5_2qoiqoilusvmy13.R.inc(34760);List<FieldInfo> fieldList = new ArrayList<FieldInfo>();

        __CLR4_5_2qoiqoilusvmy13.R.inc(34761);if ((((fieldBased)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34762)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34763)==0&false))) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(34764);for (Class<?> currentClass = clazz; (((currentClass != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34765)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34766)==0&false)); currentClass = currentClass.getSuperclass()) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(34767);Field[] fields = currentClass.getDeclaredFields();

                __CLR4_5_2qoiqoilusvmy13.R.inc(34768);computeFields(clazz, type, propertyNamingStrategy, fieldList, fields);
            }
            }__CLR4_5_2qoiqoilusvmy13.R.inc(34769);return new JavaBeanInfo(clazz, builderClass, defaultConstructor, null, factoryMethod, buildMethod, jsonType, fieldList);
        }

        }__CLR4_5_2qoiqoilusvmy13.R.inc(34770);boolean isInterfaceOrAbstract = clazz.isInterface() || Modifier.isAbstract(clazz.getModifiers());
        __CLR4_5_2qoiqoilusvmy13.R.inc(34771);if (((((defaultConstructor == null && builderClass == null) || isInterfaceOrAbstract)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34772)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34773)==0&false))) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(34774);creatorConstructor = getCreatorConstructor(constructors);

            __CLR4_5_2qoiqoilusvmy13.R.inc(34775);if ((((creatorConstructor != null && !isInterfaceOrAbstract)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34776)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34777)==0&false))) {{ // \u57fa\u4e8e\u6807\u8bb0 JSONCreator \u6ce8\u89e3\u7684\u6784\u9020\u65b9\u6cd5
                __CLR4_5_2qoiqoilusvmy13.R.inc(34778);TypeUtils.setAccessible(creatorConstructor);

                __CLR4_5_2qoiqoilusvmy13.R.inc(34779);Class<?>[] types = creatorConstructor.getParameterTypes();

                __CLR4_5_2qoiqoilusvmy13.R.inc(34780);String[] lookupParameterNames = null;
                __CLR4_5_2qoiqoilusvmy13.R.inc(34781);if ((((types.length > 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34782)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34783)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34784);Annotation[][] paramAnnotationArrays = TypeUtils.getParameterAnnotations(creatorConstructor);
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34785);for (int i = 0; (((i < types.length)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34786)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34787)==0&false)); ++i) {{
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34788);Annotation[] paramAnnotations = paramAnnotationArrays[i];
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34789);JSONField fieldAnnotation = null;
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34790);for (Annotation paramAnnotation : paramAnnotations) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34791);if ((((paramAnnotation instanceof JSONField)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34792)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34793)==0&false))) {{
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34794);fieldAnnotation = (JSONField) paramAnnotation;
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34795);break;
                            }
                        }}

                        }__CLR4_5_2qoiqoilusvmy13.R.inc(34796);Class<?> fieldClass = types[i];
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34797);Type fieldType = creatorConstructor.getGenericParameterTypes()[i];

                        __CLR4_5_2qoiqoilusvmy13.R.inc(34798);String fieldName = null;
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34799);Field field = null;
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34800);int ordinal = 0, serialzeFeatures = 0, parserFeatures = 0;
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34801);if ((((fieldAnnotation != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34802)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34803)==0&false))) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34804);field = TypeUtils.getField(clazz, fieldAnnotation.name(), declaredFields);
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34805);ordinal = fieldAnnotation.ordinal();
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34806);serialzeFeatures = SerializerFeature.of(fieldAnnotation.serialzeFeatures());
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34807);parserFeatures = Feature.of(fieldAnnotation.parseFeatures());
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34808);fieldName = fieldAnnotation.name();
                        }

                        }__CLR4_5_2qoiqoilusvmy13.R.inc(34809);if ((((fieldName == null || fieldName.length() == 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34810)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34811)==0&false))) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34812);if ((((lookupParameterNames == null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34813)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34814)==0&false))) {{
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34815);lookupParameterNames = ASMUtils.lookupParameterNames(creatorConstructor);
                            }
                            }__CLR4_5_2qoiqoilusvmy13.R.inc(34816);fieldName = lookupParameterNames[i];
                        }

                        }__CLR4_5_2qoiqoilusvmy13.R.inc(34817);if ((((field == null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34818)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34819)==0&false))) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34820);if ((((lookupParameterNames == null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34821)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34822)==0&false))) {{
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34823);if ((((kotlin)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34824)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34825)==0&false))) {{
                                    __CLR4_5_2qoiqoilusvmy13.R.inc(34826);lookupParameterNames = TypeUtils.getKoltinConstructorParameters(clazz);
                                } }else {{
                                    __CLR4_5_2qoiqoilusvmy13.R.inc(34827);lookupParameterNames = ASMUtils.lookupParameterNames(creatorConstructor);
                                }
                            }}

                            }__CLR4_5_2qoiqoilusvmy13.R.inc(34828);if ((((lookupParameterNames.length > i)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34829)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34830)==0&false))) {{
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34831);String parameterName = lookupParameterNames[i];
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34832);field = TypeUtils.getField(clazz, parameterName, declaredFields);
                            }
                        }}

                        }__CLR4_5_2qoiqoilusvmy13.R.inc(34833);FieldInfo fieldInfo = new FieldInfo(fieldName, clazz, fieldClass, fieldType, field,
                                ordinal, serialzeFeatures, parserFeatures);
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34834);add(fieldList, fieldInfo);
                    }
                }}

                //return new JavaBeanInfo(clazz, builderClass, null, creatorConstructor, null, null, jsonType, fieldList);
            }} }else {__CLR4_5_2qoiqoilusvmy13.R.inc(34835);if ((factoryMethod = getFactoryMethod(clazz, methods, jacksonCompatible)) != null) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(34838);TypeUtils.setAccessible(factoryMethod);

                __CLR4_5_2qoiqoilusvmy13.R.inc(34839);String[] lookupParameterNames = null;
                __CLR4_5_2qoiqoilusvmy13.R.inc(34840);Class<?>[] types = factoryMethod.getParameterTypes();
                __CLR4_5_2qoiqoilusvmy13.R.inc(34841);if ((((types.length > 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34842)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34843)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34844);Annotation[][] paramAnnotationArrays = TypeUtils.getParameterAnnotations(factoryMethod);
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34845);for (int i = 0; (((i < types.length)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34846)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34847)==0&false)); ++i) {{
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34848);Annotation[] paramAnnotations = paramAnnotationArrays[i];
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34849);JSONField fieldAnnotation = null;
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34850);for (Annotation paramAnnotation : paramAnnotations) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34851);if ((((paramAnnotation instanceof JSONField)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34852)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34853)==0&false))) {{
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34854);fieldAnnotation = (JSONField) paramAnnotation;
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34855);break;
                            }
                        }}
                        }__CLR4_5_2qoiqoilusvmy13.R.inc(34856);if ((((fieldAnnotation == null && !(jacksonCompatible && TypeUtils.isJacksonCreator(factoryMethod)))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34857)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34858)==0&false))) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34859);throw new JSONException("illegal json creator");
                        }

                        }__CLR4_5_2qoiqoilusvmy13.R.inc(34860);String fieldName = null;
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34861);int ordinal = 0, serialzeFeatures = 0, parserFeatures = 0;

                        __CLR4_5_2qoiqoilusvmy13.R.inc(34862);if ((((fieldAnnotation != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34863)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34864)==0&false))) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34865);fieldName = fieldAnnotation.name();
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34866);ordinal = fieldAnnotation.ordinal();
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34867);serialzeFeatures = SerializerFeature.of(fieldAnnotation.serialzeFeatures());
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34868);parserFeatures = Feature.of(fieldAnnotation.parseFeatures());
                        }

                        }__CLR4_5_2qoiqoilusvmy13.R.inc(34869);if ((((fieldName == null || fieldName.length() == 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34870)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34871)==0&false))) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34872);if ((((lookupParameterNames == null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34873)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34874)==0&false))) {{
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34875);lookupParameterNames = ASMUtils.lookupParameterNames(factoryMethod);
                            }
                            }__CLR4_5_2qoiqoilusvmy13.R.inc(34876);fieldName = lookupParameterNames[i];
                        }

                        }__CLR4_5_2qoiqoilusvmy13.R.inc(34877);Class<?> fieldClass = types[i];
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34878);Type fieldType = factoryMethod.getGenericParameterTypes()[i];

                        __CLR4_5_2qoiqoilusvmy13.R.inc(34879);Field field = TypeUtils.getField(clazz, fieldName, declaredFields);
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34880);FieldInfo fieldInfo = new FieldInfo(fieldName, clazz, fieldClass, fieldType, field,
                                ordinal, serialzeFeatures, parserFeatures);
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34881);add(fieldList, fieldInfo);
                    }

                    }__CLR4_5_2qoiqoilusvmy13.R.inc(34882);return new JavaBeanInfo(clazz, builderClass, null, null, factoryMethod, null, jsonType, fieldList);
                }
            }} }else {__CLR4_5_2qoiqoilusvmy13.R.inc(34883);if ((((!isInterfaceOrAbstract)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34884)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34885)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(34886);String className = clazz.getName();

                __CLR4_5_2qoiqoilusvmy13.R.inc(34887);String[] paramNames = null;
                __CLR4_5_2qoiqoilusvmy13.R.inc(34888);if ((((kotlin && constructors.length > 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34889)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34890)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34891);paramNames = TypeUtils.getKoltinConstructorParameters(clazz);
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34892);creatorConstructor = TypeUtils.getKoltinConstructor(constructors, paramNames);
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34893);TypeUtils.setAccessible(creatorConstructor);
                } }else {{

                    __CLR4_5_2qoiqoilusvmy13.R.inc(34894);for (Constructor constructor : constructors) {{
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34895);Class<?>[] parameterTypes = constructor.getParameterTypes();

                        __CLR4_5_2qoiqoilusvmy13.R.inc(34896);if ((((className.equals("org.springframework.security.web.authentication.WebAuthenticationDetails"))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34897)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34898)==0&false))) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34899);if ((((parameterTypes.length == 2 && parameterTypes[0] == String.class && parameterTypes[1] == String.class)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34900)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34901)==0&false))) {{
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34902);creatorConstructor = constructor;
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34903);creatorConstructor.setAccessible(true);
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34904);paramNames = ASMUtils.lookupParameterNames(constructor);
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34905);break;
                            }
                        }}

                        }__CLR4_5_2qoiqoilusvmy13.R.inc(34906);if ((((className.equals("org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken"))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34907)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34908)==0&false))) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34909);if ((((parameterTypes.length == 3
                                    && parameterTypes[0] == Object.class
                                    && parameterTypes[1] == Object.class
                                    && parameterTypes[2] == Collection.class)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34910)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34911)==0&false))) {{
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34912);creatorConstructor = constructor;
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34913);creatorConstructor.setAccessible(true);
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34914);paramNames = new String[] {"principal", "credentials", "authorities"};
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34915);break;
                            }
                        }}

                        }__CLR4_5_2qoiqoilusvmy13.R.inc(34916);if ((((className.equals("org.springframework.security.core.authority.SimpleGrantedAuthority"))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34917)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34918)==0&false))) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34919);if ((((parameterTypes.length == 1
                                    && parameterTypes[0] == String.class)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34920)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34921)==0&false))) {{
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34922);creatorConstructor = constructor;
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34923);paramNames = new String[] {"authority"};
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34924);break;
                            }
                        }}

                        //


                        }__CLR4_5_2qoiqoilusvmy13.R.inc(34925);boolean is_public = (constructor.getModifiers() & Modifier.PUBLIC) != 0;
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34926);if ((((!is_public)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34927)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34928)==0&false))) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34929);continue;
                        }
                        }__CLR4_5_2qoiqoilusvmy13.R.inc(34930);String[] lookupParameterNames = ASMUtils.lookupParameterNames(constructor);
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34931);if ((((lookupParameterNames == null || lookupParameterNames.length == 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34932)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34933)==0&false))) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34934);continue;
                        }

                        }__CLR4_5_2qoiqoilusvmy13.R.inc(34935);if ((((creatorConstructor != null
                                && paramNames != null && lookupParameterNames.length <= paramNames.length)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34936)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34937)==0&false))) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34938);continue;
                        }

                        }__CLR4_5_2qoiqoilusvmy13.R.inc(34939);paramNames = lookupParameterNames;
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34940);creatorConstructor = constructor;
                    }
                }}

                }__CLR4_5_2qoiqoilusvmy13.R.inc(34941);Class<?>[] types = null;
                __CLR4_5_2qoiqoilusvmy13.R.inc(34942);if ((((paramNames != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34943)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34944)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34945);types = creatorConstructor.getParameterTypes();
                }

                }__CLR4_5_2qoiqoilusvmy13.R.inc(34946);if ((((paramNames != null
                        && types.length == paramNames.length)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34947)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34948)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34949);Annotation[][] paramAnnotationArrays = TypeUtils.getParameterAnnotations(creatorConstructor);
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34950);for (int i = 0; (((i < types.length)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34951)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34952)==0&false)); ++i) {{
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34953);Annotation[] paramAnnotations = paramAnnotationArrays[i];
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34954);String paramName = paramNames[i];

                        __CLR4_5_2qoiqoilusvmy13.R.inc(34955);JSONField fieldAnnotation = null;
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34956);for (Annotation paramAnnotation : paramAnnotations) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34957);if ((((paramAnnotation instanceof JSONField)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34958)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34959)==0&false))) {{
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34960);fieldAnnotation = (JSONField) paramAnnotation;
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34961);break;
                            }
                        }}

                        }__CLR4_5_2qoiqoilusvmy13.R.inc(34962);Class<?> fieldClass = types[i];
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34963);Type fieldType = creatorConstructor.getGenericParameterTypes()[i];
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34964);Field field = TypeUtils.getField(clazz, paramName, declaredFields);
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34965);if ((((field != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34966)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34967)==0&false))) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34968);if ((((fieldAnnotation == null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34969)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34970)==0&false))) {{
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34971);fieldAnnotation = TypeUtils.getAnnotation(field, JSONField.class);
                            }
                        }}
                        }__CLR4_5_2qoiqoilusvmy13.R.inc(34972);final int ordinal, serialzeFeatures, parserFeatures;
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34973);if ((((fieldAnnotation == null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34974)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34975)==0&false))) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34976);ordinal = 0;
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34977);serialzeFeatures = 0;

                            __CLR4_5_2qoiqoilusvmy13.R.inc(34978);if (((("org.springframework.security.core.userdetails.User".equals(className)
                                    && "password".equals(paramName))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34979)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34980)==0&false))) {{
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34981);parserFeatures = Feature.InitStringFieldAsEmpty.mask;
                            } }else {{
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34982);parserFeatures = 0;
                            }
                        }} }else {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34983);String nameAnnotated = fieldAnnotation.name();
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34984);if ((((nameAnnotated.length() != 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34985)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34986)==0&false))) {{
                                __CLR4_5_2qoiqoilusvmy13.R.inc(34987);paramName = nameAnnotated;
                            }
                            }__CLR4_5_2qoiqoilusvmy13.R.inc(34988);ordinal = fieldAnnotation.ordinal();
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34989);serialzeFeatures = SerializerFeature.of(fieldAnnotation.serialzeFeatures());
                            __CLR4_5_2qoiqoilusvmy13.R.inc(34990);parserFeatures = Feature.of(fieldAnnotation.parseFeatures());
                        }
                        }__CLR4_5_2qoiqoilusvmy13.R.inc(34991);FieldInfo fieldInfo = new FieldInfo(paramName, clazz, fieldClass, fieldType, field,
                                ordinal, serialzeFeatures, parserFeatures);
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34992);add(fieldList, fieldInfo);
                    }

                    }__CLR4_5_2qoiqoilusvmy13.R.inc(34993);if (((((!kotlin)
                            && !clazz.getName().equals("javax.servlet.http.Cookie"))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34994)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(34995)==0&false))) {{
                        __CLR4_5_2qoiqoilusvmy13.R.inc(34996);return new JavaBeanInfo(clazz, builderClass, null, creatorConstructor, null, null, jsonType, fieldList);
                    }
                }} }else {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(34997);throw new JSONException("default constructor not found. " + clazz);
                }
            }}
        }}}}

        }__CLR4_5_2qoiqoilusvmy13.R.inc(34998);if ((((defaultConstructor != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(34999)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35000)==0&false))) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(35001);TypeUtils.setAccessible(defaultConstructor);
        }

        }__CLR4_5_2qoiqoilusvmy13.R.inc(35002);if ((((builderClass != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35003)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35004)==0&false))) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(35005);String withPrefix = null;

            __CLR4_5_2qoiqoilusvmy13.R.inc(35006);JSONPOJOBuilder builderAnno = TypeUtils.getAnnotation(builderClass, JSONPOJOBuilder.class);
            __CLR4_5_2qoiqoilusvmy13.R.inc(35007);if ((((builderAnno != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35008)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35009)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35010);withPrefix = builderAnno.withPrefix();
            }

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35011);if ((((withPrefix == null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35012)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35013)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35014);withPrefix = "with";
            }

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35015);for (Method method : builderClass.getMethods()) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35016);if ((((Modifier.isStatic(method.getModifiers()))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35017)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35018)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35019);continue;
                }

                }__CLR4_5_2qoiqoilusvmy13.R.inc(35020);if ((((!(method.getReturnType().equals(builderClass)))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35021)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35022)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35023);continue;
                }

                }__CLR4_5_2qoiqoilusvmy13.R.inc(35024);int ordinal = 0, serialzeFeatures = 0, parserFeatures = 0;

                __CLR4_5_2qoiqoilusvmy13.R.inc(35025);JSONField annotation = TypeUtils.getAnnotation(method, JSONField.class);

                __CLR4_5_2qoiqoilusvmy13.R.inc(35026);if ((((annotation == null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35027)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35028)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35029);annotation = TypeUtils.getSuperMethodAnnotation(clazz, method);
                }

                }__CLR4_5_2qoiqoilusvmy13.R.inc(35030);if ((((annotation != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35031)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35032)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35033);if ((((!annotation.deserialize())&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35034)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35035)==0&false))) {{
                        __CLR4_5_2qoiqoilusvmy13.R.inc(35036);continue;
                    }

                    }__CLR4_5_2qoiqoilusvmy13.R.inc(35037);ordinal = annotation.ordinal();
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35038);serialzeFeatures = SerializerFeature.of(annotation.serialzeFeatures());
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35039);parserFeatures = Feature.of(annotation.parseFeatures());

                    __CLR4_5_2qoiqoilusvmy13.R.inc(35040);if ((((annotation.name().length() != 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35041)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35042)==0&false))) {{
                        __CLR4_5_2qoiqoilusvmy13.R.inc(35043);String propertyName = annotation.name();
                        __CLR4_5_2qoiqoilusvmy13.R.inc(35044);add(fieldList, new FieldInfo(propertyName, method, null, clazz, type, ordinal, serialzeFeatures, parserFeatures,
                                annotation, null, null));
                        __CLR4_5_2qoiqoilusvmy13.R.inc(35045);continue;
                    }
                }}

                }__CLR4_5_2qoiqoilusvmy13.R.inc(35046);String methodName = method.getName();
                __CLR4_5_2qoiqoilusvmy13.R.inc(35047);StringBuilder properNameBuilder;
                __CLR4_5_2qoiqoilusvmy13.R.inc(35048);if ((((methodName.startsWith("set") && methodName.length() > 3)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35049)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35050)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35051);properNameBuilder = new StringBuilder(methodName.substring(3));
                } }else {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35052);if ((((withPrefix.length() == 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35053)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35054)==0&false))){{
                        __CLR4_5_2qoiqoilusvmy13.R.inc(35055);properNameBuilder = new StringBuilder(methodName);
                    } }else {{
                        __CLR4_5_2qoiqoilusvmy13.R.inc(35056);if ((((!methodName.startsWith(withPrefix))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35057)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35058)==0&false))) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(35059);continue;
                        }
    
                        }__CLR4_5_2qoiqoilusvmy13.R.inc(35060);if ((((methodName.length() <= withPrefix.length())&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35061)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35062)==0&false))) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(35063);continue;
                        }
    
                        }__CLR4_5_2qoiqoilusvmy13.R.inc(35064);properNameBuilder = new StringBuilder(methodName.substring(withPrefix.length()));
                    }
                }}

                }__CLR4_5_2qoiqoilusvmy13.R.inc(35065);char c0 = properNameBuilder.charAt(0);
                __CLR4_5_2qoiqoilusvmy13.R.inc(35066);if ((((withPrefix.length() != 0 && !Character.isUpperCase(c0))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35067)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35068)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35069);continue;
                }

                }__CLR4_5_2qoiqoilusvmy13.R.inc(35070);properNameBuilder.setCharAt(0, Character.toLowerCase(c0));

                __CLR4_5_2qoiqoilusvmy13.R.inc(35071);String propertyName = properNameBuilder.toString();

                __CLR4_5_2qoiqoilusvmy13.R.inc(35072);add(fieldList, new FieldInfo(propertyName, method, null, clazz, type, ordinal, serialzeFeatures, parserFeatures,
                        annotation, null, null));
            }

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35073);if ((((builderClass != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35074)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35075)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35076);JSONPOJOBuilder builderAnnotation = TypeUtils.getAnnotation(builderClass, JSONPOJOBuilder.class);

                __CLR4_5_2qoiqoilusvmy13.R.inc(35077);String buildMethodName = null;
                __CLR4_5_2qoiqoilusvmy13.R.inc(35078);if ((((builderAnnotation != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35079)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35080)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35081);buildMethodName = builderAnnotation.buildMethod();
                }

                }__CLR4_5_2qoiqoilusvmy13.R.inc(35082);if ((((buildMethodName == null || buildMethodName.length() == 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35083)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35084)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35085);buildMethodName = "build";
                }

                }__CLR4_5_2qoiqoilusvmy13.R.inc(35086);try {
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35087);buildMethod = builderClass.getMethod(buildMethodName);
                } catch (NoSuchMethodException e) {
                    // skip
                } catch (SecurityException e) {
                    // skip
                }

                __CLR4_5_2qoiqoilusvmy13.R.inc(35088);if ((((buildMethod == null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35089)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35090)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35091);try {
                        __CLR4_5_2qoiqoilusvmy13.R.inc(35092);buildMethod = builderClass.getMethod("create");
                    } catch (NoSuchMethodException e) {
                        // skip
                    } catch (SecurityException e) {
                        // skip
                    }
                }

                }__CLR4_5_2qoiqoilusvmy13.R.inc(35093);if ((((buildMethod == null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35094)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35095)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35096);throw new JSONException("buildMethod not found.");
                }

                }__CLR4_5_2qoiqoilusvmy13.R.inc(35097);TypeUtils.setAccessible(buildMethod);
            }
        }}

        }__CLR4_5_2qoiqoilusvmy13.R.inc(35098);for (Method method : methods) {{ //
            __CLR4_5_2qoiqoilusvmy13.R.inc(35099);int ordinal = 0, serialzeFeatures = 0, parserFeatures = 0;
            __CLR4_5_2qoiqoilusvmy13.R.inc(35100);String methodName = method.getName();

            __CLR4_5_2qoiqoilusvmy13.R.inc(35101);if ((((Modifier.isStatic(method.getModifiers()))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35102)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35103)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35104);continue;
            }

            // support builder set
            }__CLR4_5_2qoiqoilusvmy13.R.inc(35105);Class<?> returnType = method.getReturnType();
            __CLR4_5_2qoiqoilusvmy13.R.inc(35106);if ((((!(returnType.equals(Void.TYPE) || returnType.equals(method.getDeclaringClass())))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35107)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35108)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35109);continue;
            }

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35110);if ((((method.getDeclaringClass() == Object.class)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35111)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35112)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35113);continue;
            }

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35114);Class<?>[] types = method.getParameterTypes();

            __CLR4_5_2qoiqoilusvmy13.R.inc(35115);if ((((types.length == 0 || types.length > 2)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35116)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35117)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35118);continue;
            }

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35119);JSONField annotation = TypeUtils.getAnnotation(method, JSONField.class);
            __CLR4_5_2qoiqoilusvmy13.R.inc(35120);if ((((annotation != null
                    && types.length == 2
                    && types[0] == String.class
                    && types[1] == Object.class)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35121)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35122)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35123);add(fieldList, new FieldInfo("", method, null, clazz, type, ordinal,
                        serialzeFeatures, parserFeatures, annotation, null, null));
                __CLR4_5_2qoiqoilusvmy13.R.inc(35124);continue;
            }

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35125);if ((((types.length != 1)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35126)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35127)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35128);continue;
            }

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35129);if ((((annotation == null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35130)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35131)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35132);annotation = TypeUtils.getSuperMethodAnnotation(clazz, method);
            }

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35133);if ((((annotation == null && methodName.length() < 4)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35134)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35135)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35136);continue;
            }

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35137);if ((((annotation != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35138)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35139)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35140);if ((((!annotation.deserialize())&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35141)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35142)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35143);continue;
                }

                }__CLR4_5_2qoiqoilusvmy13.R.inc(35144);ordinal = annotation.ordinal();
                __CLR4_5_2qoiqoilusvmy13.R.inc(35145);serialzeFeatures = SerializerFeature.of(annotation.serialzeFeatures());
                __CLR4_5_2qoiqoilusvmy13.R.inc(35146);parserFeatures = Feature.of(annotation.parseFeatures());

                __CLR4_5_2qoiqoilusvmy13.R.inc(35147);if ((((annotation.name().length() != 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35148)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35149)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35150);String propertyName = annotation.name();
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35151);add(fieldList, new FieldInfo(propertyName, method, null, clazz, type, ordinal, serialzeFeatures, parserFeatures,
                            annotation, null, null));
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35152);continue;
                }
            }}

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35153);if ((((annotation == null && !methodName.startsWith("set") || builderClass != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35154)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35155)==0&false))) {{ // TODO "set"\u7684\u5224\u65ad\u653e\u5728 JSONField \u6ce8\u89e3\u540e\u9762\uff0c\u610f\u601d\u662f\u5141\u8bb8\u975e setter \u65b9\u6cd5\u6807\u8bb0 JSONField \u6ce8\u89e3\uff1f
                __CLR4_5_2qoiqoilusvmy13.R.inc(35156);continue;
            }

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35157);char c3 = methodName.charAt(3);

            __CLR4_5_2qoiqoilusvmy13.R.inc(35158);String propertyName;
            __CLR4_5_2qoiqoilusvmy13.R.inc(35159);if ((((Character.isUpperCase(c3) //
                    || c3 > 512 // for unicode method name
                    )&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35160)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35161)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35162);if ((((TypeUtils.compatibleWithJavaBean)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35163)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35164)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35165);propertyName = TypeUtils.decapitalize(methodName.substring(3));
                } }else {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35166);propertyName = Character.toLowerCase(methodName.charAt(3)) + methodName.substring(4);
                }
            }} }else {__CLR4_5_2qoiqoilusvmy13.R.inc(35167);if ((((c3 == '_')&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35168)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35169)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35170);propertyName = methodName.substring(4);
            } }else {__CLR4_5_2qoiqoilusvmy13.R.inc(35171);if ((((c3 == 'f')&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35172)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35173)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35174);propertyName = methodName.substring(3);
            } }else {__CLR4_5_2qoiqoilusvmy13.R.inc(35175);if ((((methodName.length() >= 5 && Character.isUpperCase(methodName.charAt(4)))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35176)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35177)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35178);propertyName = TypeUtils.decapitalize(methodName.substring(3));
            } }else {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35179);continue;
            }

            }}}}__CLR4_5_2qoiqoilusvmy13.R.inc(35180);Field field = TypeUtils.getField(clazz, propertyName, declaredFields);
            __CLR4_5_2qoiqoilusvmy13.R.inc(35181);if ((((field == null && types[0] == boolean.class)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35182)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35183)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35184);String isFieldName = "is" + Character.toUpperCase(propertyName.charAt(0)) + propertyName.substring(1);
                __CLR4_5_2qoiqoilusvmy13.R.inc(35185);field = TypeUtils.getField(clazz, isFieldName, declaredFields);
            }

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35186);JSONField fieldAnnotation = null;
            __CLR4_5_2qoiqoilusvmy13.R.inc(35187);if ((((field != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35188)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35189)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35190);fieldAnnotation = TypeUtils.getAnnotation(field, JSONField.class);

                __CLR4_5_2qoiqoilusvmy13.R.inc(35191);if ((((fieldAnnotation != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35192)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35193)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35194);if ((((!fieldAnnotation.deserialize())&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35195)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35196)==0&false))) {{
                        __CLR4_5_2qoiqoilusvmy13.R.inc(35197);continue;
                    }

                    }__CLR4_5_2qoiqoilusvmy13.R.inc(35198);ordinal = fieldAnnotation.ordinal();
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35199);serialzeFeatures = SerializerFeature.of(fieldAnnotation.serialzeFeatures());
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35200);parserFeatures = Feature.of(fieldAnnotation.parseFeatures());

                    __CLR4_5_2qoiqoilusvmy13.R.inc(35201);if ((((fieldAnnotation.name().length() != 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35202)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35203)==0&false))) {{
                        __CLR4_5_2qoiqoilusvmy13.R.inc(35204);propertyName = fieldAnnotation.name();
                        __CLR4_5_2qoiqoilusvmy13.R.inc(35205);add(fieldList, new FieldInfo(propertyName, method, field, clazz, type, ordinal,
                                serialzeFeatures, parserFeatures, annotation, fieldAnnotation, null));
                        __CLR4_5_2qoiqoilusvmy13.R.inc(35206);continue;
                    }
                }}

            }}

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35207);if ((((propertyNamingStrategy != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35208)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35209)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35210);propertyName = propertyNamingStrategy.translate(propertyName);
            }

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35211);add(fieldList, new FieldInfo(propertyName, method, field, clazz, type, ordinal, serialzeFeatures, parserFeatures,
                    annotation, fieldAnnotation, null));
        }

        }__CLR4_5_2qoiqoilusvmy13.R.inc(35212);Field[] fields = clazz.getFields();
        __CLR4_5_2qoiqoilusvmy13.R.inc(35213);computeFields(clazz, type, propertyNamingStrategy, fieldList, fields);

        __CLR4_5_2qoiqoilusvmy13.R.inc(35214);for (Method method : clazz.getMethods()) {{ // getter methods
            __CLR4_5_2qoiqoilusvmy13.R.inc(35215);String methodName = method.getName();
            __CLR4_5_2qoiqoilusvmy13.R.inc(35216);if ((((methodName.length() < 4)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35217)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35218)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35219);continue;
            }

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35220);if ((((Modifier.isStatic(method.getModifiers()))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35221)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35222)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35223);continue;
            }

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35224);if ((((builderClass == null && methodName.startsWith("get") && Character.isUpperCase(methodName.charAt(3)))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35225)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35226)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35227);if ((((method.getParameterTypes().length != 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35228)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35229)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35230);continue;
                }

                }__CLR4_5_2qoiqoilusvmy13.R.inc(35231);if ((((Collection.class.isAssignableFrom(method.getReturnType()) //
                        || Map.class.isAssignableFrom(method.getReturnType()) //
                        || AtomicBoolean.class == method.getReturnType() //
                        || AtomicInteger.class == method.getReturnType() //
                        || AtomicLong.class == method.getReturnType() //
                        )&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35232)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35233)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35234);String propertyName;

                    __CLR4_5_2qoiqoilusvmy13.R.inc(35235);JSONField annotation = TypeUtils.getAnnotation(method, JSONField.class);
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35236);if ((((annotation != null && annotation.deserialize())&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35237)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35238)==0&false))) {{
                        __CLR4_5_2qoiqoilusvmy13.R.inc(35239);continue;
                    }

                    }__CLR4_5_2qoiqoilusvmy13.R.inc(35240);if ((((annotation != null && annotation.name().length() > 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35241)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35242)==0&false))) {{
                        __CLR4_5_2qoiqoilusvmy13.R.inc(35243);propertyName = annotation.name();
                    } }else {{
                        __CLR4_5_2qoiqoilusvmy13.R.inc(35244);propertyName = Character.toLowerCase(methodName.charAt(3)) + methodName.substring(4);

                        __CLR4_5_2qoiqoilusvmy13.R.inc(35245);Field field = TypeUtils.getField(clazz, propertyName, declaredFields);
                        __CLR4_5_2qoiqoilusvmy13.R.inc(35246);if ((((field != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35247)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35248)==0&false))) {{
                            __CLR4_5_2qoiqoilusvmy13.R.inc(35249);JSONField fieldAnnotation = TypeUtils.getAnnotation(field, JSONField.class);
                            __CLR4_5_2qoiqoilusvmy13.R.inc(35250);if ((((fieldAnnotation != null && !fieldAnnotation.deserialize())&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35251)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35252)==0&false))) {{
                                __CLR4_5_2qoiqoilusvmy13.R.inc(35253);continue;
                            }
                        }}
                    }}

                    }__CLR4_5_2qoiqoilusvmy13.R.inc(35254);if ((((propertyNamingStrategy != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35255)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35256)==0&false))) {{
                        __CLR4_5_2qoiqoilusvmy13.R.inc(35257);propertyName = propertyNamingStrategy.translate(propertyName);
                    }

                    }__CLR4_5_2qoiqoilusvmy13.R.inc(35258);FieldInfo fieldInfo = getField(fieldList, propertyName);
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35259);if ((((fieldInfo != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35260)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35261)==0&false))) {{
                        __CLR4_5_2qoiqoilusvmy13.R.inc(35262);continue;
                    }

                    }__CLR4_5_2qoiqoilusvmy13.R.inc(35263);add(fieldList, new FieldInfo(propertyName, method, null, clazz, type, 0, 0, 0, annotation, null, null));
                }
            }}
        }}

        }__CLR4_5_2qoiqoilusvmy13.R.inc(35264);if ((((fieldList.size() == 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35265)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35266)==0&false))) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(35267);if ((((TypeUtils.isXmlField(clazz))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35268)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35269)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35270);fieldBased = true;
            }

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35271);if ((((fieldBased)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35272)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35273)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35274);for (Class<?> currentClass = clazz; (((currentClass != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35275)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35276)==0&false)); currentClass = currentClass.getSuperclass()) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35277);computeFields(clazz, type, propertyNamingStrategy, fieldList, declaredFields);
                }
            }}
        }}

        }__CLR4_5_2qoiqoilusvmy13.R.inc(35278);return new JavaBeanInfo(clazz, builderClass, defaultConstructor, creatorConstructor, factoryMethod, buildMethod, jsonType, fieldList);
    }finally{__CLR4_5_2qoiqoilusvmy13.R.flushNeeded();}}

    private static void computeFields(Class<?> clazz, Type type, PropertyNamingStrategy propertyNamingStrategy, List<FieldInfo> fieldList, Field[] fields) {try{__CLR4_5_2qoiqoilusvmy13.R.inc(35279);
        __CLR4_5_2qoiqoilusvmy13.R.inc(35280);for (Field field : fields) {{ // public static fields
            __CLR4_5_2qoiqoilusvmy13.R.inc(35281);int modifiers = field.getModifiers();
            __CLR4_5_2qoiqoilusvmy13.R.inc(35282);if (((((modifiers & Modifier.STATIC) != 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35283)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35284)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35285);continue;
            }

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35286);if (((((modifiers & Modifier.FINAL) != 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35287)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35288)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35289);Class<?> fieldType = field.getType();
                __CLR4_5_2qoiqoilusvmy13.R.inc(35290);boolean supportReadOnly = Map.class.isAssignableFrom(fieldType)
                        || Collection.class.isAssignableFrom(fieldType)
                        || AtomicLong.class.equals(fieldType) //
                        || AtomicInteger.class.equals(fieldType) //
                        || AtomicBoolean.class.equals(fieldType);
                __CLR4_5_2qoiqoilusvmy13.R.inc(35291);if ((((!supportReadOnly)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35292)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35293)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35294);continue;
                }
            }}

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35295);boolean contains = false;
            __CLR4_5_2qoiqoilusvmy13.R.inc(35296);for (FieldInfo item : fieldList) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35297);if ((((item.name.equals(field.getName()))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35298)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35299)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35300);contains = true;
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35301);break; // \u5df2\u7ecf\u662f contains = true\uff0c\u65e0\u9700\u7ee7\u7eed\u904d\u5386
                }
            }}

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35302);if ((((contains)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35303)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35304)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35305);continue;
            }

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35306);int ordinal = 0, serialzeFeatures = 0, parserFeatures = 0;
            __CLR4_5_2qoiqoilusvmy13.R.inc(35307);String propertyName = field.getName();

            __CLR4_5_2qoiqoilusvmy13.R.inc(35308);JSONField fieldAnnotation = TypeUtils.getAnnotation(field, JSONField.class);

            __CLR4_5_2qoiqoilusvmy13.R.inc(35309);if ((((fieldAnnotation != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35310)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35311)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35312);if ((((!fieldAnnotation.deserialize())&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35313)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35314)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35315);continue;
                }

                }__CLR4_5_2qoiqoilusvmy13.R.inc(35316);ordinal = fieldAnnotation.ordinal();
                __CLR4_5_2qoiqoilusvmy13.R.inc(35317);serialzeFeatures = SerializerFeature.of(fieldAnnotation.serialzeFeatures());
                __CLR4_5_2qoiqoilusvmy13.R.inc(35318);parserFeatures = Feature.of(fieldAnnotation.parseFeatures());

                __CLR4_5_2qoiqoilusvmy13.R.inc(35319);if ((((fieldAnnotation.name().length() != 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35320)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35321)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35322);propertyName = fieldAnnotation.name();
                }
            }}

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35323);if ((((propertyNamingStrategy != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35324)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35325)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35326);propertyName = propertyNamingStrategy.translate(propertyName);
            }

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35327);add(fieldList, new FieldInfo(propertyName, null, field, clazz, type, ordinal, serialzeFeatures, parserFeatures, null,
                    fieldAnnotation, null));
        }
    }}finally{__CLR4_5_2qoiqoilusvmy13.R.flushNeeded();}}

    static Constructor<?> getDefaultConstructor(Class<?> clazz, final Constructor<?>[] constructors) {try{__CLR4_5_2qoiqoilusvmy13.R.inc(35328);
        __CLR4_5_2qoiqoilusvmy13.R.inc(35329);if ((((Modifier.isAbstract(clazz.getModifiers()))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35330)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35331)==0&false))) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(35332);return null;
        }

        }__CLR4_5_2qoiqoilusvmy13.R.inc(35333);Constructor<?> defaultConstructor = null;

        __CLR4_5_2qoiqoilusvmy13.R.inc(35334);for (Constructor<?> constructor : constructors) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(35335);if ((((constructor.getParameterTypes().length == 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35336)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35337)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35338);defaultConstructor = constructor;
                __CLR4_5_2qoiqoilusvmy13.R.inc(35339);break;
            }
        }}

        }__CLR4_5_2qoiqoilusvmy13.R.inc(35340);if ((((defaultConstructor == null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35341)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35342)==0&false))) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(35343);if ((((clazz.isMemberClass() && !Modifier.isStatic(clazz.getModifiers()))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35344)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35345)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35346);Class<?>[] types;
                __CLR4_5_2qoiqoilusvmy13.R.inc(35347);for (Constructor<?> constructor : constructors) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35348);if ((types = constructor.getParameterTypes()).length == 1
                            && types[0].equals(clazz.getDeclaringClass())) {{
                        __CLR4_5_2qoiqoilusvmy13.R.inc(35351);defaultConstructor = constructor;
                        __CLR4_5_2qoiqoilusvmy13.R.inc(35352);break;
                    }
                }}
            }}
        }}

        }__CLR4_5_2qoiqoilusvmy13.R.inc(35353);return defaultConstructor;
    }finally{__CLR4_5_2qoiqoilusvmy13.R.flushNeeded();}}

    public static Constructor<?> getCreatorConstructor(Constructor[] constructors) {try{__CLR4_5_2qoiqoilusvmy13.R.inc(35354);
        __CLR4_5_2qoiqoilusvmy13.R.inc(35355);Constructor<?> creatorConstructor = null;

        __CLR4_5_2qoiqoilusvmy13.R.inc(35356);for (Constructor<?> constructor : constructors) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(35357);JSONCreator annotation = constructor.getAnnotation(JSONCreator.class);
            __CLR4_5_2qoiqoilusvmy13.R.inc(35358);if ((((annotation != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35359)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35360)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35361);if ((((creatorConstructor != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35362)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35363)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35364);throw new JSONException("multi-JSONCreator");
                }

                }__CLR4_5_2qoiqoilusvmy13.R.inc(35365);creatorConstructor = constructor;
                // \u4e0d\u5e94\u8be5break\uff0c\u5426\u5219\u591a\u4e2a\u6784\u9020\u65b9\u6cd5\u4e0a\u5b58\u5728 JSONCreator \u6ce8\u89e3\u65f6\uff0c\u5e76\u4e0d\u4f1a\u89e6\u53d1\u4e0a\u8ff0\u5f02\u5e38\u629b\u51fa
            }
        }}
        }__CLR4_5_2qoiqoilusvmy13.R.inc(35366);if ((((creatorConstructor != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35367)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35368)==0&false))) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(35369);return creatorConstructor;
        }

        }__CLR4_5_2qoiqoilusvmy13.R.inc(35370);for (Constructor constructor : constructors) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(35371);Annotation[][] paramAnnotationArrays = TypeUtils.getParameterAnnotations(constructor);
            __CLR4_5_2qoiqoilusvmy13.R.inc(35372);if ((((paramAnnotationArrays.length == 0)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35373)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35374)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35375);continue;
            }
            }__CLR4_5_2qoiqoilusvmy13.R.inc(35376);boolean match = true;
            __CLR4_5_2qoiqoilusvmy13.R.inc(35377);for (Annotation[] paramAnnotationArray : paramAnnotationArrays) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35378);boolean paramMatch = false;
                __CLR4_5_2qoiqoilusvmy13.R.inc(35379);for (Annotation paramAnnotation : paramAnnotationArray) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35380);if ((((paramAnnotation instanceof JSONField)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35381)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35382)==0&false))) {{
                        __CLR4_5_2qoiqoilusvmy13.R.inc(35383);paramMatch = true;
                        __CLR4_5_2qoiqoilusvmy13.R.inc(35384);break;
                    }
                }}
                }__CLR4_5_2qoiqoilusvmy13.R.inc(35385);if ((((!paramMatch)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35386)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35387)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35388);match = false;
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35389);break;
                }
            }}

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35390);if ((((match)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35391)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35392)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35393);if ((((creatorConstructor != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35394)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35395)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35396);throw new JSONException("multi-JSONCreator");
                }

                }__CLR4_5_2qoiqoilusvmy13.R.inc(35397);creatorConstructor = constructor;
            }
        }}

        }__CLR4_5_2qoiqoilusvmy13.R.inc(35398);if ((((creatorConstructor != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35399)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35400)==0&false))) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(35401);return creatorConstructor;
        }

        }__CLR4_5_2qoiqoilusvmy13.R.inc(35402);return creatorConstructor;
    }finally{__CLR4_5_2qoiqoilusvmy13.R.flushNeeded();}}

    private static Method getFactoryMethod(Class<?> clazz, Method[] methods, boolean jacksonCompatible) {try{__CLR4_5_2qoiqoilusvmy13.R.inc(35403);
        __CLR4_5_2qoiqoilusvmy13.R.inc(35404);Method factoryMethod = null;

        __CLR4_5_2qoiqoilusvmy13.R.inc(35405);for (Method method : methods) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(35406);if ((((!Modifier.isStatic(method.getModifiers()))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35407)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35408)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35409);continue;
            }

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35410);if ((((!clazz.isAssignableFrom(method.getReturnType()))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35411)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35412)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35413);continue;
            }

            }__CLR4_5_2qoiqoilusvmy13.R.inc(35414);JSONCreator annotation = TypeUtils.getAnnotation(method, JSONCreator.class);
            __CLR4_5_2qoiqoilusvmy13.R.inc(35415);if ((((annotation != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35416)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35417)==0&false))) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35418);if ((((factoryMethod != null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35419)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35420)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35421);throw new JSONException("multi-JSONCreator");
                }

                }__CLR4_5_2qoiqoilusvmy13.R.inc(35422);factoryMethod = method;
                // \u4e0d\u5e94\u8be5break\uff0c\u5426\u5219\u591a\u4e2a\u9759\u6001\u5de5\u5382\u65b9\u6cd5\u4e0a\u5b58\u5728 JSONCreator \u6ce8\u89e3\u65f6\uff0c\u5e76\u4e0d\u4f1a\u89e6\u53d1\u4e0a\u8ff0\u5f02\u5e38\u629b\u51fa
            }
        }}

        }__CLR4_5_2qoiqoilusvmy13.R.inc(35423);if ((((factoryMethod == null && jacksonCompatible)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35424)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35425)==0&false))) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(35426);for (Method method : methods) {{
                __CLR4_5_2qoiqoilusvmy13.R.inc(35427);if ((((TypeUtils.isJacksonCreator(method))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35428)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35429)==0&false))) {{
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35430);factoryMethod = method;
                    __CLR4_5_2qoiqoilusvmy13.R.inc(35431);break;
                }
            }}
        }}
        }__CLR4_5_2qoiqoilusvmy13.R.inc(35432);return factoryMethod;
    }finally{__CLR4_5_2qoiqoilusvmy13.R.flushNeeded();}}

    /**
     * @deprecated
     */
    public static Class<?> getBuilderClass(JSONType type) {try{__CLR4_5_2qoiqoilusvmy13.R.inc(35433);
        __CLR4_5_2qoiqoilusvmy13.R.inc(35434);return getBuilderClass(null, type);
    }finally{__CLR4_5_2qoiqoilusvmy13.R.flushNeeded();}}

    public static Class<?> getBuilderClass(Class<?> clazz, JSONType type) {try{__CLR4_5_2qoiqoilusvmy13.R.inc(35435);
        __CLR4_5_2qoiqoilusvmy13.R.inc(35436);if ((((clazz != null && clazz.getName().equals("org.springframework.security.web.savedrequest.DefaultSavedRequest"))&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35437)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35438)==0&false))) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(35439);return TypeUtils.loadClass("org.springframework.security.web.savedrequest.DefaultSavedRequest$Builder");
        }

        }__CLR4_5_2qoiqoilusvmy13.R.inc(35440);if ((((type == null)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35441)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35442)==0&false))) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(35443);return null;
        }

        }__CLR4_5_2qoiqoilusvmy13.R.inc(35444);Class<?> builderClass = type.builder();

        __CLR4_5_2qoiqoilusvmy13.R.inc(35445);if ((((builderClass == Void.class)&&(__CLR4_5_2qoiqoilusvmy13.R.iget(35446)!=0|true))||(__CLR4_5_2qoiqoilusvmy13.R.iget(35447)==0&false))) {{
            __CLR4_5_2qoiqoilusvmy13.R.inc(35448);return null;
        }

        }__CLR4_5_2qoiqoilusvmy13.R.inc(35449);return builderClass;
    }finally{__CLR4_5_2qoiqoilusvmy13.R.flushNeeded();}}
}
