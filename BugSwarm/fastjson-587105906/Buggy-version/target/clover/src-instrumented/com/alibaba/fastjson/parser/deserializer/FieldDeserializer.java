/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.parser.deserializer;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.serializer.BeanContext;
import com.alibaba.fastjson.util.FieldInfo;

public abstract class FieldDeserializer {public static class __CLR4_1_10eu2eu2luszvxql{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,19360,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final FieldInfo fieldInfo;

    protected final Class<?>  clazz;
    
    protected BeanContext    beanContext;

    public FieldDeserializer(Class<?> clazz, FieldInfo fieldInfo){try{__CLR4_1_10eu2eu2luszvxql.R.inc(19226);
        __CLR4_1_10eu2eu2luszvxql.R.inc(19227);this.clazz = clazz;
        __CLR4_1_10eu2eu2luszvxql.R.inc(19228);this.fieldInfo = fieldInfo;
    }finally{__CLR4_1_10eu2eu2luszvxql.R.flushNeeded();}}
    
    public abstract void parseField(DefaultJSONParser parser, Object object, Type objectType,
                                    Map<String, Object> fieldValues);

    public int getFastMatchToken() {try{__CLR4_1_10eu2eu2luszvxql.R.inc(19229);
        __CLR4_1_10eu2eu2luszvxql.R.inc(19230);return 0;
    }finally{__CLR4_1_10eu2eu2luszvxql.R.flushNeeded();}}

    public void setValue(Object object, boolean value) {try{__CLR4_1_10eu2eu2luszvxql.R.inc(19231);
        __CLR4_1_10eu2eu2luszvxql.R.inc(19232);setValue(object, Boolean.valueOf(value));
    }finally{__CLR4_1_10eu2eu2luszvxql.R.flushNeeded();}}

    public void setValue(Object object, int value) {try{__CLR4_1_10eu2eu2luszvxql.R.inc(19233);
        __CLR4_1_10eu2eu2luszvxql.R.inc(19234);setValue(object, Integer.valueOf(value));
    }finally{__CLR4_1_10eu2eu2luszvxql.R.flushNeeded();}}

    public void setValue(Object object, long value) {try{__CLR4_1_10eu2eu2luszvxql.R.inc(19235);
        __CLR4_1_10eu2eu2luszvxql.R.inc(19236);setValue(object, Long.valueOf(value));
    }finally{__CLR4_1_10eu2eu2luszvxql.R.flushNeeded();}}

    public void setValue(Object object, String value) {try{__CLR4_1_10eu2eu2luszvxql.R.inc(19237);
        __CLR4_1_10eu2eu2luszvxql.R.inc(19238);setValue(object, (Object) value);
    }finally{__CLR4_1_10eu2eu2luszvxql.R.flushNeeded();}}

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void setValue(Object object, Object value) {try{__CLR4_1_10eu2eu2luszvxql.R.inc(19239);
        __CLR4_1_10eu2eu2luszvxql.R.inc(19240);if ((((value == null //
            && fieldInfo.fieldClass.isPrimitive())&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19241)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19242)==0&false))) {{
            __CLR4_1_10eu2eu2luszvxql.R.inc(19243);return;
        } }else {__CLR4_1_10eu2eu2luszvxql.R.inc(19244);if ((((fieldInfo.fieldClass == String.class
                && fieldInfo.format != null
                && fieldInfo.format.equals("trim"))&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19245)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19246)==0&false))){{
            __CLR4_1_10eu2eu2luszvxql.R.inc(19247);value = ((String) value).trim();
        }

        }}__CLR4_1_10eu2eu2luszvxql.R.inc(19248);try {
            __CLR4_1_10eu2eu2luszvxql.R.inc(19249);Method method = fieldInfo.method;
            __CLR4_1_10eu2eu2luszvxql.R.inc(19250);if ((((method != null)&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19251)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19252)==0&false))) {{
                __CLR4_1_10eu2eu2luszvxql.R.inc(19253);if ((((fieldInfo.getOnly)&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19254)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19255)==0&false))) {{
                    __CLR4_1_10eu2eu2luszvxql.R.inc(19256);if ((((fieldInfo.fieldClass == AtomicInteger.class)&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19257)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19258)==0&false))) {{
                        __CLR4_1_10eu2eu2luszvxql.R.inc(19259);AtomicInteger atomic = (AtomicInteger) method.invoke(object);
                        __CLR4_1_10eu2eu2luszvxql.R.inc(19260);if ((((atomic != null)&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19261)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19262)==0&false))) {{
                            __CLR4_1_10eu2eu2luszvxql.R.inc(19263);atomic.set(((AtomicInteger) value).get());
                        }
                    }} }else {__CLR4_1_10eu2eu2luszvxql.R.inc(19264);if ((((fieldInfo.fieldClass == AtomicLong.class)&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19265)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19266)==0&false))) {{
                        __CLR4_1_10eu2eu2luszvxql.R.inc(19267);AtomicLong atomic = (AtomicLong) method.invoke(object);
                        __CLR4_1_10eu2eu2luszvxql.R.inc(19268);if ((((atomic != null)&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19269)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19270)==0&false))) {{
                            __CLR4_1_10eu2eu2luszvxql.R.inc(19271);atomic.set(((AtomicLong) value).get());
                        }
                    }} }else {__CLR4_1_10eu2eu2luszvxql.R.inc(19272);if ((((fieldInfo.fieldClass == AtomicBoolean.class)&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19273)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19274)==0&false))) {{
                        __CLR4_1_10eu2eu2luszvxql.R.inc(19275);AtomicBoolean atomic = (AtomicBoolean) method.invoke(object);
                        __CLR4_1_10eu2eu2luszvxql.R.inc(19276);if ((((atomic != null)&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19277)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19278)==0&false))) {{
                            __CLR4_1_10eu2eu2luszvxql.R.inc(19279);atomic.set(((AtomicBoolean) value).get());
                        }
                    }} }else {__CLR4_1_10eu2eu2luszvxql.R.inc(19280);if ((((Map.class.isAssignableFrom(method.getReturnType()))&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19281)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19282)==0&false))) {{
                        __CLR4_1_10eu2eu2luszvxql.R.inc(19283);Map map = (Map) method.invoke(object);
                        __CLR4_1_10eu2eu2luszvxql.R.inc(19284);if ((((map != null)&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19285)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19286)==0&false))) {{
                            __CLR4_1_10eu2eu2luszvxql.R.inc(19287);if ((((map == Collections.emptyMap()
                                    || map.getClass().getName().startsWith("java.util.Collections$Unmodifiable"))&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19288)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19289)==0&false))) {{
                                // skip
                                __CLR4_1_10eu2eu2luszvxql.R.inc(19290);return;
                            }
                            
                            }__CLR4_1_10eu2eu2luszvxql.R.inc(19291);map.putAll((Map) value);
                        }
                    }} }else {{
                        __CLR4_1_10eu2eu2luszvxql.R.inc(19292);Collection collection = (Collection) method.invoke(object);
                        __CLR4_1_10eu2eu2luszvxql.R.inc(19293);if ((((collection != null && value != null)&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19294)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19295)==0&false))) {{
                            __CLR4_1_10eu2eu2luszvxql.R.inc(19296);if ((((collection == Collections.emptySet()
                                    || collection == Collections.emptyList()
                                    || collection.getClass().getName().startsWith("java.util.Collections$Unmodifiable"))&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19297)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19298)==0&false))) {{
                                // skip
                                __CLR4_1_10eu2eu2luszvxql.R.inc(19299);return;
                            }

                            }__CLR4_1_10eu2eu2luszvxql.R.inc(19300);collection.clear();
                            __CLR4_1_10eu2eu2luszvxql.R.inc(19301);collection.addAll((Collection) value);
                        }
                    }}
                }}}}} }else {{
                    __CLR4_1_10eu2eu2luszvxql.R.inc(19302);method.invoke(object, value);
                }
            }} }else {{
                __CLR4_1_10eu2eu2luszvxql.R.inc(19303);final Field field = fieldInfo.field;
                
                __CLR4_1_10eu2eu2luszvxql.R.inc(19304);if ((((fieldInfo.getOnly)&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19305)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19306)==0&false))) {{
                    __CLR4_1_10eu2eu2luszvxql.R.inc(19307);if ((((fieldInfo.fieldClass == AtomicInteger.class)&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19308)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19309)==0&false))) {{
                        __CLR4_1_10eu2eu2luszvxql.R.inc(19310);AtomicInteger atomic = (AtomicInteger) field.get(object);
                        __CLR4_1_10eu2eu2luszvxql.R.inc(19311);if ((((atomic != null)&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19312)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19313)==0&false))) {{
                            __CLR4_1_10eu2eu2luszvxql.R.inc(19314);atomic.set(((AtomicInteger) value).get());
                        }
                    }} }else {__CLR4_1_10eu2eu2luszvxql.R.inc(19315);if ((((fieldInfo.fieldClass == AtomicLong.class)&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19316)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19317)==0&false))) {{
                        __CLR4_1_10eu2eu2luszvxql.R.inc(19318);AtomicLong atomic = (AtomicLong) field.get(object);
                        __CLR4_1_10eu2eu2luszvxql.R.inc(19319);if ((((atomic != null)&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19320)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19321)==0&false))) {{
                            __CLR4_1_10eu2eu2luszvxql.R.inc(19322);atomic.set(((AtomicLong) value).get());
                        }
                    }} }else {__CLR4_1_10eu2eu2luszvxql.R.inc(19323);if ((((fieldInfo.fieldClass == AtomicBoolean.class)&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19324)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19325)==0&false))) {{
                        __CLR4_1_10eu2eu2luszvxql.R.inc(19326);AtomicBoolean atomic = (AtomicBoolean) field.get(object);
                        __CLR4_1_10eu2eu2luszvxql.R.inc(19327);if ((((atomic != null)&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19328)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19329)==0&false))) {{
                            __CLR4_1_10eu2eu2luszvxql.R.inc(19330);atomic.set(((AtomicBoolean) value).get());
                        }
                    }} }else {__CLR4_1_10eu2eu2luszvxql.R.inc(19331);if ((((Map.class.isAssignableFrom(fieldInfo.fieldClass))&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19332)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19333)==0&false))) {{
                        __CLR4_1_10eu2eu2luszvxql.R.inc(19334);Map map = (Map) field.get(object);
                        __CLR4_1_10eu2eu2luszvxql.R.inc(19335);if ((((map != null)&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19336)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19337)==0&false))) {{
                            __CLR4_1_10eu2eu2luszvxql.R.inc(19338);if ((((map == Collections.emptyMap()
                                    || map.getClass().getName().startsWith("java.util.Collections$Unmodifiable"))&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19339)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19340)==0&false))) {{
                                // skip
                                __CLR4_1_10eu2eu2luszvxql.R.inc(19341);return;
                            }
                            }__CLR4_1_10eu2eu2luszvxql.R.inc(19342);map.putAll((Map) value);
                        }
                    }} }else {{
                        __CLR4_1_10eu2eu2luszvxql.R.inc(19343);Collection collection = (Collection) field.get(object);
                        __CLR4_1_10eu2eu2luszvxql.R.inc(19344);if ((((collection != null && value != null)&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19345)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19346)==0&false))) {{
                            __CLR4_1_10eu2eu2luszvxql.R.inc(19347);if ((((collection == Collections.emptySet()
                                    || collection == Collections.emptyList()
                                    || collection.getClass().getName().startsWith("java.util.Collections$Unmodifiable"))&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19348)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19349)==0&false))) {{
                                // skip
                                __CLR4_1_10eu2eu2luszvxql.R.inc(19350);return;
                            }

                            }__CLR4_1_10eu2eu2luszvxql.R.inc(19351);collection.clear();
                            __CLR4_1_10eu2eu2luszvxql.R.inc(19352);collection.addAll((Collection) value);
                        }
                    }}
                }}}}} }else {{
                    __CLR4_1_10eu2eu2luszvxql.R.inc(19353);if ((((field != null)&&(__CLR4_1_10eu2eu2luszvxql.R.iget(19354)!=0|true))||(__CLR4_1_10eu2eu2luszvxql.R.iget(19355)==0&false))) {{
                        __CLR4_1_10eu2eu2luszvxql.R.inc(19356);field.set(object, value);
                    }
                }}
            }}
        }} catch (Exception e) {
            __CLR4_1_10eu2eu2luszvxql.R.inc(19357);throw new JSONException("set property error, " + clazz.getName() + "#" + fieldInfo.name, e);
        }
    }finally{__CLR4_1_10eu2eu2luszvxql.R.flushNeeded();}}

    public void setWrappedValue(String key, Object value) {try{__CLR4_1_10eu2eu2luszvxql.R.inc(19358);
        __CLR4_1_10eu2eu2luszvxql.R.inc(19359);throw new JSONException("TODO");
    }finally{__CLR4_1_10eu2eu2luszvxql.R.flushNeeded();}}
}
