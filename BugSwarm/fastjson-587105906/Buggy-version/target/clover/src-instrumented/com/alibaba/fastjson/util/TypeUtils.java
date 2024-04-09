/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//*
 * Copyright 1999-2017 Alibaba Group.
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
package com.alibaba.fastjson.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.EnumDeserializer;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.CalendarCodec;
import com.alibaba.fastjson.serializer.SerializeBeanInfo;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.AccessControlException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class TypeUtils{public static class __CLR4_1_10s4ss4slusqjrhg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,39306,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static boolean compatibleWithJavaBean = false;
    /** \u6839\u636efield name\u7684\u5927\u5c0f\u5199\u8f93\u51fa\u8f93\u5165\u6570\u636e */
    public static boolean compatibleWithFieldName = false;
    private static boolean setAccessibleEnable = true;
    private static boolean oracleTimestampMethodInited = false;
    private static Method oracleTimestampMethod;
    private static boolean oracleDateMethodInited = false;
    private static Method oracleDateMethod;
    private static boolean optionalClassInited = false;
    private static Class<?> optionalClass;
    private static boolean transientClassInited = false;
    private static Class<? extends Annotation> transientClass;

    private static Class<? extends Annotation> class_OneToMany = null;
    private static boolean class_OneToMany_error = false;
    private static Class<? extends Annotation> class_ManyToMany = null;
    private static boolean class_ManyToMany_error = false;

    private static Method method_HibernateIsInitialized = null;
    private static boolean method_HibernateIsInitialized_error = false;
    private static volatile Class kotlin_metadata;
    private static volatile boolean kotlin_metadata_error;
    private static volatile boolean kotlin_class_klass_error;
    private static volatile Constructor kotlin_kclass_constructor;
    private static volatile Method kotlin_kclass_getConstructors;
    private static volatile Method kotlin_kfunction_getParameters;
    private static volatile Method kotlin_kparameter_getName;
    private static volatile boolean kotlin_error;
    private static volatile Map<Class,String[]> kotlinIgnores;
    private static volatile boolean kotlinIgnores_error;
    private static ConcurrentMap<String,Class<?>> mappings = new ConcurrentHashMap<String,Class<?>>(256, 0.75f, 1);
    private static Class<?> pathClass;
    private static boolean pathClass_error = false;

    private static Class<? extends Annotation> class_JacksonCreator = null;
    private static boolean class_JacksonCreator_error = false;

    private static volatile Class class_Clob = null;
    private static volatile boolean class_Clob_error = false;

    private static volatile Class class_XmlAccessType = null;
    private static volatile Class class_XmlAccessorType = null;
    private static volatile boolean classXmlAccessorType_error = false;
    private static volatile Method method_XmlAccessorType_value = null;
    private static volatile Field field_XmlAccessType_FIELD = null;
    private static volatile Object field_XmlAccessType_FIELD_VALUE = null;

    static{try{__CLR4_1_10s4ss4slusqjrhg.R.inc(36460);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36461);try{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36462);TypeUtils.compatibleWithJavaBean = "true".equals(IOUtils.getStringProperty(IOUtils.FASTJSON_COMPATIBLEWITHJAVABEAN));
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36463);TypeUtils.compatibleWithFieldName = "true".equals(IOUtils.getStringProperty(IOUtils.FASTJSON_COMPATIBLEWITHFIELDNAME));
        } catch(Throwable e){
            // skip
        }
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    static{try{__CLR4_1_10s4ss4slusqjrhg.R.inc(36464);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36465);addBaseClassMappings();
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}


    public static boolean isXmlField(Class clazz) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(36466);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36467);if ((((class_XmlAccessorType == null && !classXmlAccessorType_error)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36468)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36469)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36470);try {
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36471);class_XmlAccessorType = Class.forName("javax.xml.bind.annotation.XmlAccessorType");
            } catch(Throwable ex){
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36472);classXmlAccessorType_error = true;
            }
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36473);if ((((class_XmlAccessorType == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36474)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36475)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36476);return false;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36477);Annotation annotation = TypeUtils.getAnnotation(clazz, class_XmlAccessorType);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36478);if ((((annotation == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36479)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36480)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36481);return false;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36482);if ((((method_XmlAccessorType_value == null && !classXmlAccessorType_error)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36483)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36484)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36485);try {
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36486);method_XmlAccessorType_value = class_XmlAccessorType.getMethod("value");
            } catch(Throwable ex){
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36487);classXmlAccessorType_error = true;
            }
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36488);if ((((method_XmlAccessorType_value == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36489)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36490)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36491);return false;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36492);Object value = null;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36493);if ((((!classXmlAccessorType_error)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36494)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36495)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36496);try {
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36497);value = method_XmlAccessorType_value.invoke(annotation);
            } catch (Throwable ex) {
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36498);classXmlAccessorType_error = true;
            }
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36499);if ((((value == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36500)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36501)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36502);return false;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36503);if ((((class_XmlAccessType == null && !classXmlAccessorType_error)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36504)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36505)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36506);try {
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36507);class_XmlAccessType = Class.forName("javax.xml.bind.annotation.XmlAccessType");
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36508);field_XmlAccessType_FIELD = class_XmlAccessType.getField("FIELD");
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36509);field_XmlAccessType_FIELD_VALUE = field_XmlAccessType_FIELD.get(null);
            } catch(Throwable ex){
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36510);classXmlAccessorType_error = true;
            }
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36511);return value == field_XmlAccessType_FIELD_VALUE;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Annotation getXmlAccessorType(Class clazz) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(36512);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36513);if ((((class_XmlAccessorType == null && !classXmlAccessorType_error)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36514)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36515)==0&false))) {{

            __CLR4_1_10s4ss4slusqjrhg.R.inc(36516);try{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36517);class_XmlAccessorType = Class.forName("javax.xml.bind.annotation.XmlAccessorType");
            } catch(Throwable ex){
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36518);classXmlAccessorType_error = true;
            }
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36519);if ((((class_XmlAccessorType == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36520)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36521)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36522);return null;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36523);return  TypeUtils.getAnnotation(clazz, class_XmlAccessorType);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

//
//    public static boolean isXmlAccessType(Class clazz) {
//        if (class_XmlAccessType == null && !class_XmlAccessType_error) {
//
//            try{
//                class_XmlAccessType = Class.forName("javax.xml.bind.annotation.XmlAccessType");
//            } catch(Throwable ex){
//                class_XmlAccessType_error = true;
//            }
//        }
//
//        if (class_XmlAccessType == null) {
//            return false;
//        }
//
//        return  class_XmlAccessType.isAssignableFrom(clazz);
//    }

    public static boolean isClob(Class clazz) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(36524);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36525);if ((((class_Clob == null && !class_Clob_error)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36526)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36527)==0&false))) {{

            __CLR4_1_10s4ss4slusqjrhg.R.inc(36528);try{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36529);class_Clob = Class.forName("java.sql.Clob");
            } catch(Throwable ex){
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36530);class_Clob_error = true;
            }
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36531);if ((((class_Clob == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36532)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36533)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36534);return false;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36535);return  class_Clob.isAssignableFrom(clazz);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static String castToString(Object value){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(36536);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36537);if((((value == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36538)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36539)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36540);return null;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36541);return value.toString();
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Byte castToByte(Object value){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(36542);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36543);if((((value == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36544)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36545)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36546);return null;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36547);if((((value instanceof BigDecimal)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36548)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36549)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36550);return byteValue((BigDecimal) value);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36551);if((((value instanceof Number)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36552)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36553)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36554);return ((Number) value).byteValue();
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36555);if((((value instanceof String)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36556)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36557)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36558);String strVal = (String) value;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36559);if((((strVal.length() == 0 //
                    || "null".equals(strVal) //
                    || "NULL".equals(strVal))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36560)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36561)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36562);return null;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(36563);return Byte.parseByte(strVal);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36564);throw new JSONException("can not cast to byte, value : " + value);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Character castToChar(Object value){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(36565);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36566);if((((value == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36567)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36568)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36569);return null;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36570);if((((value instanceof Character)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36571)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36572)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36573);return (Character) value;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36574);if((((value instanceof String)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36575)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36576)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36577);String strVal = (String) value;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36578);if((((strVal.length() == 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36579)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36580)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36581);return null;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(36582);if((((strVal.length() != 1)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36583)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36584)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36585);throw new JSONException("can not cast to char, value : " + value);
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(36586);return strVal.charAt(0);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36587);throw new JSONException("can not cast to char, value : " + value);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Short castToShort(Object value){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(36588);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36589);if((((value == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36590)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36591)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36592);return null;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36593);if((((value instanceof BigDecimal)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36594)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36595)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36596);return shortValue((BigDecimal) value);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36597);if((((value instanceof Number)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36598)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36599)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36600);return ((Number) value).shortValue();
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36601);if((((value instanceof String)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36602)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36603)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36604);String strVal = (String) value;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36605);if((((strVal.length() == 0 //
                    || "null".equals(strVal) //
                    || "NULL".equals(strVal))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36606)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36607)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36608);return null;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(36609);return Short.parseShort(strVal);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36610);throw new JSONException("can not cast to short, value : " + value);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static BigDecimal castToBigDecimal(Object value){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(36611);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36612);if((((value == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36613)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36614)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36615);return null;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36616);if((((value instanceof BigDecimal)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36617)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36618)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36619);return (BigDecimal) value;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36620);if((((value instanceof BigInteger)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36621)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36622)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36623);return new BigDecimal((BigInteger) value);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36624);String strVal = value.toString();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36625);if((((strVal.length() == 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36626)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36627)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36628);return null;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36629);if((((value instanceof Map && ((Map) value).size() == 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36630)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36631)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36632);return null;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36633);return new BigDecimal(strVal);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static BigInteger castToBigInteger(Object value){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(36634);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36635);if((((value == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36636)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36637)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36638);return null;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36639);if((((value instanceof BigInteger)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36640)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36641)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36642);return (BigInteger) value;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36643);if((((value instanceof Float || value instanceof Double)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36644)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36645)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36646);return BigInteger.valueOf(((Number) value).longValue());
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36647);if((((value instanceof BigDecimal)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36648)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36649)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36650);BigDecimal decimal = (BigDecimal) value;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36651);int scale = decimal.scale();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36652);if ((((scale > -1000 && scale < 1000)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36653)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36654)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36655);return ((BigDecimal) value).toBigInteger();
            }
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36656);String strVal = value.toString();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36657);if((((strVal.length() == 0 //
                || "null".equals(strVal) //
                || "NULL".equals(strVal))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36658)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36659)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36660);return null;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36661);return new BigInteger(strVal);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Float castToFloat(Object value){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(36662);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36663);if((((value == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36664)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36665)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36666);return null;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36667);if((((value instanceof Number)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36668)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36669)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36670);return ((Number) value).floatValue();
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36671);if((((value instanceof String)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36672)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36673)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36674);String strVal = value.toString();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36675);if((((strVal.length() == 0 //
                    || "null".equals(strVal) //
                    || "NULL".equals(strVal))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36676)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36677)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36678);return null;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(36679);if((((strVal.indexOf(',') != 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36680)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36681)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36682);strVal = strVal.replaceAll(",", "");
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(36683);return Float.parseFloat(strVal);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36684);throw new JSONException("can not cast to float, value : " + value);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Double castToDouble(Object value){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(36685);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36686);if((((value == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36687)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36688)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36689);return null;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36690);if((((value instanceof Number)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36691)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36692)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36693);return ((Number) value).doubleValue();
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36694);if((((value instanceof String)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36695)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36696)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36697);String strVal = value.toString();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36698);if((((strVal.length() == 0 //
                    || "null".equals(strVal) //
                    || "NULL".equals(strVal))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36699)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36700)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36701);return null;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(36702);if((((strVal.indexOf(',') != 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36703)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36704)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36705);strVal = strVal.replaceAll(",", "");
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(36706);return Double.parseDouble(strVal);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36707);throw new JSONException("can not cast to double, value : " + value);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Date castToDate(Object value){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(36708);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36709);return castToDate(value, null);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Date castToDate(Object value, String format){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(36710);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36711);if((((value == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36712)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36713)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36714);return null;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36715);if((((value instanceof Date)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36716)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36717)==0&false))){{ // \u4f7f\u7528\u9891\u7387\u6700\u9ad8\u7684\uff0c\u5e94\u4f18\u5148\u5904\u7406
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36718);return (Date) value;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36719);if((((value instanceof Calendar)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36720)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36721)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36722);return ((Calendar) value).getTime();
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36723);long longValue = -1;

        __CLR4_1_10s4ss4slusqjrhg.R.inc(36724);if((((value instanceof BigDecimal)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36725)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36726)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36727);longValue = longValue((BigDecimal) value);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36728);return new Date(longValue);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36729);if((((value instanceof Number)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36730)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36731)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36732);longValue = ((Number) value).longValue();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36733);if (((("unixtime".equals(format))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36734)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36735)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36736);longValue *= 1000;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(36737);return new Date(longValue);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36738);if((((value instanceof String)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36739)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36740)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36741);String strVal = (String) value;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36742);JSONScanner dateLexer = new JSONScanner(strVal);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36743);try{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36744);if((((dateLexer.scanISO8601DateIfMatch(false))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36745)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36746)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(36747);Calendar calendar = dateLexer.getCalendar();
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(36748);return calendar.getTime();
                }
            }} finally{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36749);dateLexer.close();
            }

            __CLR4_1_10s4ss4slusqjrhg.R.inc(36750);if ((((strVal.startsWith("/Date(") && strVal.endsWith(")/"))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36751)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36752)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36753);strVal = strVal.substring(6, strVal.length() - 2);
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(36754);if ((((strVal.indexOf('-') > 0 || strVal.indexOf('+') > 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36755)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36756)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36757);if ((((format == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36758)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36759)==0&false))) {{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(36760);if ((((strVal.length() == JSON.DEFFAULT_DATE_FORMAT.length()
                            || (strVal.length() == 22 && JSON.DEFFAULT_DATE_FORMAT.equals("yyyyMMddHHmmssSSSZ")))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36761)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36762)==0&false))) {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(36763);format = JSON.DEFFAULT_DATE_FORMAT;
                    } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(36764);if ((((strVal.length() == 10)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36765)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36766)==0&false))) {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(36767);format = "yyyy-MM-dd";
                    } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(36768);if ((((strVal.length() == "yyyy-MM-dd HH:mm:ss".length())&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36769)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36770)==0&false))) {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(36771);format = "yyyy-MM-dd HH:mm:ss";
                    } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(36772);if ((((strVal.length() == 29
                            && strVal.charAt(26) == ':'
                            && strVal.charAt(28) == '0')&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36773)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36774)==0&false))) {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(36775);format = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
                    } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(36776);if ((((strVal.length() == 23 && strVal.charAt(19) == ',')&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36777)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36778)==0&false))) {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(36779);format = "yyyy-MM-dd HH:mm:ss,SSS";
                    } }else {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(36780);format = "yyyy-MM-dd HH:mm:ss.SSS";
                    }
                }}}}}}

                }__CLR4_1_10s4ss4slusqjrhg.R.inc(36781);SimpleDateFormat dateFormat = new SimpleDateFormat(format, JSON.defaultLocale);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36782);dateFormat.setTimeZone(JSON.defaultTimeZone);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36783);try{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(36784);return dateFormat.parse(strVal);
                } catch(ParseException e){
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(36785);throw new JSONException("can not cast to Date, value : " + strVal);
                }
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(36786);if((((strVal.length() == 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36787)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36788)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36789);return null;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(36790);longValue = Long.parseLong(strVal);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36791);if ((((longValue == -1)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36792)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36793)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36794);Class<?> clazz = value.getClass();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36795);if(((("oracle.sql.TIMESTAMP".equals(clazz.getName()))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36796)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36797)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36798);if((((oracleTimestampMethod == null && !oracleTimestampMethodInited)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36799)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36800)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(36801);try{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(36802);oracleTimestampMethod = clazz.getMethod("toJdbc");
                    } catch(NoSuchMethodException e){
                        // skip
                    } finally{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(36803);oracleTimestampMethodInited = true;
                    }
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(36804);Object result;
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36805);try{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(36806);result = oracleTimestampMethod.invoke(value);
                } catch(Exception e){
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(36807);throw new JSONException("can not cast oracle.sql.TIMESTAMP to Date", e);
                }
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36808);return (Date) result;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(36809);if(((("oracle.sql.DATE".equals(clazz.getName()))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36810)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36811)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36812);if((((oracleDateMethod == null && !oracleDateMethodInited)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36813)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36814)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(36815);try{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(36816);oracleDateMethod = clazz.getMethod("toJdbc");
                    } catch(NoSuchMethodException e){
                        // skip
                    } finally{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(36817);oracleDateMethodInited = true;
                    }
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(36818);Object result;
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36819);try{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(36820);result = oracleDateMethod.invoke(value);
                } catch(Exception e){
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(36821);throw new JSONException("can not cast oracle.sql.DATE to Date", e);
                }
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36822);return (Date) result;
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(36823);throw new JSONException("can not cast to Date, value : " + value);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36824);return new Date(longValue);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static java.sql.Date castToSqlDate(Object value){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(36825);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36826);if((((value == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36827)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36828)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36829);return null;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36830);if((((value instanceof java.sql.Date)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36831)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36832)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36833);return (java.sql.Date) value;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36834);if((((value instanceof java.util.Date)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36835)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36836)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36837);return new java.sql.Date(((java.util.Date) value).getTime());
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36838);if((((value instanceof Calendar)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36839)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36840)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36841);return new java.sql.Date(((Calendar) value).getTimeInMillis());
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36842);long longValue = 0;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36843);if((((value instanceof BigDecimal)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36844)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36845)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36846);longValue = longValue((BigDecimal) value);
        } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(36847);if((((value instanceof Number)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36848)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36849)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36850);longValue = ((Number) value).longValue();
        }

        }}__CLR4_1_10s4ss4slusqjrhg.R.inc(36851);if((((value instanceof String)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36852)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36853)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36854);String strVal = (String) value;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36855);if((((strVal.length() == 0 //
                    || "null".equals(strVal) //
                    || "NULL".equals(strVal))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36856)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36857)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36858);return null;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(36859);if((((isNumber(strVal))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36860)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36861)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36862);longValue = Long.parseLong(strVal);
            } }else{{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36863);JSONScanner scanner = new JSONScanner(strVal);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36864);if((((scanner.scanISO8601DateIfMatch(false))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36865)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36866)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(36867);longValue = scanner.getCalendar().getTime().getTime();
                } }else{{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(36868);throw new JSONException("can not cast to Timestamp, value : " + strVal);
                }
            }}
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36869);if((((longValue <= 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36870)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36871)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36872);throw new JSONException("can not cast to Date, value : " + value); // TODO \u5ffd\u7565 1970-01-01 \u4e4b\u524d\u7684\u65f6\u95f4\u5904\u7406\uff1f
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36873);return new java.sql.Date(longValue);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static long longExtractValue(Number number) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(36874);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36875);if ((((number instanceof BigDecimal)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36876)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36877)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36878);return ((BigDecimal) number).longValueExact();
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36879);return number.longValue();
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static java.sql.Time castToSqlTime(Object value){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(36880);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36881);if((((value == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36882)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36883)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36884);return null;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36885);if((((value instanceof java.sql.Time)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36886)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36887)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36888);return (java.sql.Time) value;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36889);if((((value instanceof java.util.Date)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36890)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36891)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36892);return new java.sql.Time(((java.util.Date) value).getTime());
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36893);if((((value instanceof Calendar)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36894)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36895)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36896);return new java.sql.Time(((Calendar) value).getTimeInMillis());
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36897);long longValue = 0;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36898);if((((value instanceof BigDecimal)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36899)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36900)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36901);longValue = longValue((BigDecimal) value);
        } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(36902);if((((value instanceof Number)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36903)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36904)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36905);longValue = ((Number) value).longValue();
        }

        }}__CLR4_1_10s4ss4slusqjrhg.R.inc(36906);if((((value instanceof String)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36907)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36908)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36909);String strVal = (String) value;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36910);if((((strVal.length() == 0 //
                    || "null".equalsIgnoreCase(strVal))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36911)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36912)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36913);return null;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(36914);if((((isNumber(strVal))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36915)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36916)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36917);longValue = Long.parseLong(strVal);
            } }else{{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36918);JSONScanner scanner = new JSONScanner(strVal);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36919);if((((scanner.scanISO8601DateIfMatch(false))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36920)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36921)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(36922);longValue = scanner.getCalendar().getTime().getTime();
                } }else{{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(36923);throw new JSONException("can not cast to Timestamp, value : " + strVal);
                }
            }}
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36924);if((((longValue <= 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36925)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36926)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36927);throw new JSONException("can not cast to Date, value : " + value); // TODO \u5ffd\u7565 1970-01-01 \u4e4b\u524d\u7684\u65f6\u95f4\u5904\u7406\uff1f
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36928);return new java.sql.Time(longValue);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static java.sql.Timestamp castToTimestamp(Object value){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(36929);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36930);if((((value == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36931)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36932)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36933);return null;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36934);if((((value instanceof Calendar)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36935)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36936)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36937);return new java.sql.Timestamp(((Calendar) value).getTimeInMillis());
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36938);if((((value instanceof java.sql.Timestamp)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36939)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36940)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36941);return (java.sql.Timestamp) value;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36942);if((((value instanceof java.util.Date)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36943)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36944)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36945);return new java.sql.Timestamp(((java.util.Date) value).getTime());
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36946);long longValue = 0;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36947);if((((value instanceof BigDecimal)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36948)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36949)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36950);longValue = longValue((BigDecimal) value);
        } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(36951);if((((value instanceof Number)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36952)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36953)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36954);longValue = ((Number) value).longValue();
        }
        }}__CLR4_1_10s4ss4slusqjrhg.R.inc(36955);if((((value instanceof String)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36956)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36957)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36958);String strVal = (String) value;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36959);if((((strVal.length() == 0 //
                    || "null".equals(strVal) //
                    || "NULL".equals(strVal))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36960)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36961)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36962);return null;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(36963);if((((strVal.endsWith(".000000000"))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36964)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36965)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36966);strVal = strVal.substring(0, strVal.length() - 10);
            } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(36967);if((((strVal.endsWith(".000000"))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36968)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36969)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36970);strVal = strVal.substring(0, strVal.length() - 7);
            }
            }}__CLR4_1_10s4ss4slusqjrhg.R.inc(36971);if((((isNumber(strVal))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36972)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36973)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36974);longValue = Long.parseLong(strVal);
            } }else{{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36975);JSONScanner scanner = new JSONScanner(strVal);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36976);if((((scanner.scanISO8601DateIfMatch(false))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36977)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36978)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(36979);longValue = scanner.getCalendar().getTime().getTime();
                } }else{{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(36980);throw new JSONException("can not cast to Timestamp, value : " + strVal);
                }
            }}
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36981);if((((longValue <= 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36982)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36983)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36984);throw new JSONException("can not cast to Timestamp, value : " + value);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(36985);return new java.sql.Timestamp(longValue);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static boolean isNumber(String str){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(36986);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(36987);for(int i = 0; (((i < str.length())&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36988)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36989)==0&false)); ++i){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36990);char ch = str.charAt(i);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(36991);if((((ch == '+' || ch == '-')&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36992)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36993)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(36994);if((((i != 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36995)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(36996)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(36997);return false;
                } 
            }} }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(36998);if((((ch < '0' || ch > '9')&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(36999)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37000)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37001);return false;
            }
        }}}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37002);return true;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Long castToLong(Object value){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37003);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37004);if((((value == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37005)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37006)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37007);return null;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37008);if((((value instanceof BigDecimal)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37009)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37010)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37011);return longValue((BigDecimal) value);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37012);if((((value instanceof Number)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37013)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37014)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37015);return ((Number) value).longValue();
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37016);if((((value instanceof String)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37017)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37018)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37019);String strVal = (String) value;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37020);if((((strVal.length() == 0 //
                    || "null".equals(strVal) //
                    || "NULL".equals(strVal))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37021)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37022)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37023);return null;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37024);if((((strVal.indexOf(',') != 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37025)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37026)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37027);strVal = strVal.replaceAll(",", "");
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37028);try{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37029);return Long.parseLong(strVal);
            } catch(NumberFormatException ex){
                //
            }
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37030);JSONScanner dateParser = new JSONScanner(strVal);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37031);Calendar calendar = null;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37032);if((((dateParser.scanISO8601DateIfMatch(false))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37033)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37034)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37035);calendar = dateParser.getCalendar();
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37036);dateParser.close();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37037);if((((calendar != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37038)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37039)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37040);return calendar.getTimeInMillis();
            }
        }}

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37041);if((((value instanceof Map)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37042)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37043)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37044);Map map = (Map) value;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37045);if((((map.size() == 2
                    && map.containsKey("andIncrement")
                    && map.containsKey("andDecrement"))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37046)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37047)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37048);Iterator iter = map.values().iterator();
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37049);iter.next();
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37050);Object value2 = iter.next();
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37051);return castToLong(value2);
            }
        }}
        
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37052);throw new JSONException("can not cast to long, value : " + value);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static byte byteValue(BigDecimal decimal) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37053);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37054);if ((((decimal == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37055)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37056)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37057);return 0;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37058);int scale = decimal.scale();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37059);if ((((scale >= -100 && scale <= 100)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37060)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37061)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37062);return decimal.byteValue();
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37063);return decimal.byteValueExact();
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static short shortValue(BigDecimal decimal) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37064);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37065);if ((((decimal == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37066)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37067)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37068);return 0;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37069);int scale = decimal.scale();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37070);if ((((scale >= -100 && scale <= 100)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37071)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37072)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37073);return decimal.shortValue();
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37074);return decimal.shortValueExact();
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static int intValue(BigDecimal decimal) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37075);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37076);if ((((decimal == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37077)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37078)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37079);return 0;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37080);int scale = decimal.scale();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37081);if ((((scale >= -100 && scale <= 100)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37082)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37083)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37084);return decimal.intValue();
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37085);return decimal.intValueExact();
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static long longValue(BigDecimal decimal) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37086);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37087);if ((((decimal == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37088)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37089)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37090);return 0;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37091);int scale = decimal.scale();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37092);if ((((scale >= -100 && scale <= 100)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37093)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37094)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37095);return decimal.longValue();
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37096);return decimal.longValueExact();
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Integer castToInt(Object value){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37097);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37098);if((((value == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37099)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37100)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37101);return null;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37102);if((((value instanceof Integer)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37103)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37104)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37105);return (Integer) value;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37106);if((((value instanceof BigDecimal)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37107)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37108)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37109);return intValue((BigDecimal) value);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37110);if((((value instanceof Number)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37111)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37112)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37113);return ((Number) value).intValue();
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37114);if((((value instanceof String)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37115)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37116)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37117);String strVal = (String) value;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37118);if((((strVal.length() == 0 //
                    || "null".equals(strVal) //
                    || "NULL".equals(strVal))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37119)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37120)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37121);return null;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37122);if((((strVal.indexOf(',') != 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37123)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37124)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37125);strVal = strVal.replaceAll(",", "");
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37126);return Integer.parseInt(strVal);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37127);if((((value instanceof Boolean)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37128)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37129)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37130);return (((((Boolean) value).booleanValue() )&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37131)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37132)==0&false))? 1 : 0;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37133);if((((value instanceof Map)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37134)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37135)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37136);Map map = (Map) value;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37137);if((((map.size() == 2
                    && map.containsKey("andIncrement")
                    && map.containsKey("andDecrement"))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37138)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37139)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37140);Iterator iter = map.values().iterator();
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37141);iter.next();
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37142);Object value2 = iter.next();
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37143);return castToInt(value2);
            }
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37144);throw new JSONException("can not cast to int, value : " + value);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static byte[] castToBytes(Object value){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37145);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37146);if((((value instanceof byte[])&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37147)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37148)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37149);return (byte[]) value;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37150);if((((value instanceof String)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37151)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37152)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37153);return IOUtils.decodeBase64((String) value);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37154);throw new JSONException("can not cast to int, value : " + value);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Boolean castToBoolean(Object value){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37155);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37156);if((((value == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37157)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37158)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37159);return null;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37160);if((((value instanceof Boolean)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37161)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37162)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37163);return (Boolean) value;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37164);if((((value instanceof BigDecimal)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37165)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37166)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37167);return intValue((BigDecimal) value) == 1;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37168);if((((value instanceof Number)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37169)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37170)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37171);return ((Number) value).intValue() == 1;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37172);if((((value instanceof String)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37173)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37174)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37175);String strVal = (String) value;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37176);if((((strVal.length() == 0 //
                    || "null".equals(strVal) //
                    || "NULL".equals(strVal))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37177)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37178)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37179);return null;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37180);if(((("true".equalsIgnoreCase(strVal) //
                    || "1".equals(strVal))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37181)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37182)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37183);return Boolean.TRUE;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37184);if(((("false".equalsIgnoreCase(strVal) //
                    || "0".equals(strVal))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37185)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37186)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37187);return Boolean.FALSE;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37188);if(((("Y".equalsIgnoreCase(strVal) //
                    || "T".equals(strVal))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37189)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37190)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37191);return Boolean.TRUE;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37192);if(((("F".equalsIgnoreCase(strVal) //
                    || "N".equals(strVal))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37193)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37194)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37195);return Boolean.FALSE;
            }
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37196);throw new JSONException("can not cast to boolean, value : " + value);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static <T> T castToJavaBean(Object obj, Class<T> clazz){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37197);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37198);return cast(obj, clazz, ParserConfig.getGlobalInstance());
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static <T> T cast(Object obj, Class<T> clazz, ParserConfig config){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37199);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37200);if((((obj == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37201)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37202)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37203);if((((clazz == int.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37204)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37205)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37206);return (T) Integer.valueOf(0);
            } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(37207);if((((clazz == long.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37208)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37209)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37210);return (T) Long.valueOf(0);
            } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(37211);if((((clazz == short.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37212)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37213)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37214);return (T) Short.valueOf((short) 0);
            } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(37215);if((((clazz == byte.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37216)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37217)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37218);return (T) Byte.valueOf((byte) 0);
            } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(37219);if((((clazz == float.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37220)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37221)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37222);return (T) Float.valueOf(0);
            } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(37223);if((((clazz == double.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37224)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37225)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37226);return (T) Double.valueOf(0);
            } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(37227);if((((clazz == boolean.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37228)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37229)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37230);return (T) Boolean.FALSE;
            }
            }}}}}}}__CLR4_1_10s4ss4slusqjrhg.R.inc(37231);return null;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37232);if((((clazz == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37233)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37234)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37235);throw new IllegalArgumentException("clazz is null");
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37236);if((((clazz == obj.getClass())&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37237)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37238)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37239);return (T) obj;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37240);if((((obj instanceof Map)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37241)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37242)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37243);if((((clazz == Map.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37244)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37245)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37246);return (T) obj;
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37247);Map map = (Map) obj;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37248);if((((clazz == Object.class && !map.containsKey(JSON.DEFAULT_TYPE_KEY))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37249)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37250)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37251);return (T) obj;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37252);return castToJavaBean((Map<String,Object>) obj, clazz, config);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37253);if((((clazz.isArray())&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37254)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37255)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37256);if((((obj instanceof Collection)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37257)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37258)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37259);Collection collection = (Collection) obj;
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37260);int index = 0;
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37261);Object array = Array.newInstance(clazz.getComponentType(), collection.size());
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37262);for(Object item : collection){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37263);Object value = cast(item, clazz.getComponentType(), config);
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37264);Array.set(array, index, value);
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37265);index++;
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(37266);return (T) array;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37267);if((((clazz == byte[].class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37268)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37269)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37270);return (T) castToBytes(obj);
            }
        }}

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37271);if((((clazz.isAssignableFrom(obj.getClass()))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37272)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37273)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37274);return (T) obj;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37275);if((((clazz == boolean.class || clazz == Boolean.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37276)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37277)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37278);return (T) castToBoolean(obj);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37279);if((((clazz == byte.class || clazz == Byte.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37280)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37281)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37282);return (T) castToByte(obj);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37283);if((((clazz == char.class || clazz == Character.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37284)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37285)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37286);return (T) castToChar(obj);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37287);if((((clazz == short.class || clazz == Short.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37288)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37289)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37290);return (T) castToShort(obj);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37291);if((((clazz == int.class || clazz == Integer.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37292)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37293)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37294);return (T) castToInt(obj);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37295);if((((clazz == long.class || clazz == Long.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37296)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37297)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37298);return (T) castToLong(obj);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37299);if((((clazz == float.class || clazz == Float.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37300)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37301)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37302);return (T) castToFloat(obj);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37303);if((((clazz == double.class || clazz == Double.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37304)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37305)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37306);return (T) castToDouble(obj);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37307);if((((clazz == String.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37308)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37309)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37310);return (T) castToString(obj);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37311);if((((clazz == BigDecimal.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37312)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37313)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37314);return (T) castToBigDecimal(obj);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37315);if((((clazz == BigInteger.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37316)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37317)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37318);return (T) castToBigInteger(obj);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37319);if((((clazz == Date.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37320)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37321)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37322);return (T) castToDate(obj);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37323);if((((clazz == java.sql.Date.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37324)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37325)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37326);return (T) castToSqlDate(obj);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37327);if((((clazz == java.sql.Time.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37328)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37329)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37330);return (T) castToSqlTime(obj);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37331);if((((clazz == java.sql.Timestamp.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37332)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37333)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37334);return (T) castToTimestamp(obj);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37335);if((((clazz.isEnum())&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37336)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37337)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37338);return castToEnum(obj, clazz, config);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37339);if((((Calendar.class.isAssignableFrom(clazz))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37340)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37341)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37342);Date date = castToDate(obj);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37343);Calendar calendar;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37344);if((((clazz == Calendar.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37345)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37346)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37347);calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
            } }else{{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37348);try{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37349);calendar = (Calendar) clazz.newInstance();
                } catch(Exception e){
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37350);throw new JSONException("can not cast to : " + clazz.getName(), e);
                }
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37351);calendar.setTime(date);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37352);return (T) calendar;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37353);String className = clazz.getName();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37354);if((((className.equals("javax.xml.datatype.XMLGregorianCalendar"))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37355)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37356)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37357);Date date = castToDate(obj);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37358);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37359);calendar.setTime(date);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37360);return (T) CalendarCodec.instance.createXMLGregorianCalendar(calendar);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37361);if((((obj instanceof String)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37362)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37363)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37364);String strVal = (String) obj;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37365);if((((strVal.length() == 0 //
                    || "null".equals(strVal) //
                    || "NULL".equals(strVal))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37366)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37367)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37368);return null;
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37369);if((((clazz == java.util.Currency.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37370)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37371)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37372);return (T) java.util.Currency.getInstance(strVal);
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37373);if((((clazz == java.util.Locale.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37374)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37375)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37376);return (T) toLocale(strVal);
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37377);if ((((className.startsWith("java.time."))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37378)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37379)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37380);String json = JSON.toJSONString(strVal);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37381);return JSON.parseObject(json, clazz);
            }
        }}

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37382);final ObjectDeserializer objectDeserializer = config.get(clazz);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37383);if ((((objectDeserializer != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37384)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37385)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37386);String str = JSON.toJSONString(obj);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37387);return JSON.parseObject(str, clazz);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37388);throw new JSONException("can not cast to : " + clazz.getName());
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Locale toLocale(String strVal){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37389);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37390);String[] items = strVal.split("_");
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37391);if((((items.length == 1)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37392)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37393)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37394);return new Locale(items[0]);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37395);if((((items.length == 2)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37396)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37397)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37398);return new Locale(items[0], items[1]);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37399);return new Locale(items[0], items[1], items[2]);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static <T> T castToEnum(Object obj, Class<T> clazz, ParserConfig mapping){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37400);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37401);try{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37402);if((((obj instanceof String)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37403)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37404)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37405);String name = (String) obj;
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37406);if((((name.length() == 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37407)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37408)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37409);return null;
                }

                }__CLR4_1_10s4ss4slusqjrhg.R.inc(37410);if ((((mapping == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37411)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37412)==0&false))) {{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37413);mapping = ParserConfig.getGlobalInstance();
                }

                }__CLR4_1_10s4ss4slusqjrhg.R.inc(37414);ObjectDeserializer deserializer = mapping.getDeserializer(clazz);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37415);if ((((deserializer instanceof EnumDeserializer)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37416)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37417)==0&false))) {{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37418);EnumDeserializer enumDeserializer = (EnumDeserializer) deserializer;
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37419);return (T) enumDeserializer.getEnumByHashCode(TypeUtils.fnv1a_64(name));
                }

                }__CLR4_1_10s4ss4slusqjrhg.R.inc(37420);return (T) Enum.valueOf((Class<? extends Enum>) clazz, name);
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37421);if((((obj instanceof BigDecimal)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37422)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37423)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37424);int ordinal = intValue((BigDecimal) obj);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37425);Object[] values = clazz.getEnumConstants();
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37426);if((((ordinal < values.length)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37427)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37428)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37429);return (T) values[ordinal];
                }
            }}

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37430);if((((obj instanceof Number)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37431)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37432)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37433);int ordinal = ((Number) obj).intValue();
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37434);Object[] values = clazz.getEnumConstants();
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37435);if((((ordinal < values.length)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37436)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37437)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37438);return (T) values[ordinal];
                }
            }}
        }} catch(Exception ex){
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37439);throw new JSONException("can not cast to : " + clazz.getName(), ex);
        }
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37440);throw new JSONException("can not cast to : " + clazz.getName());
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public static <T> T cast(Object obj, Type type, ParserConfig mapping){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37441);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37442);if((((obj == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37443)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37444)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37445);return null;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37446);if((((type instanceof Class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37447)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37448)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37449);return cast(obj, (Class<T>) type, mapping);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37450);if((((type instanceof ParameterizedType)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37451)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37452)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37453);return (T) cast(obj, (ParameterizedType) type, mapping);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37454);if((((obj instanceof String)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37455)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37456)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37457);String strVal = (String) obj;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37458);if((((strVal.length() == 0 //
                    || "null".equals(strVal) //
                    || "NULL".equals(strVal))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37459)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37460)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37461);return null;
            }
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37462);if((((type instanceof TypeVariable)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37463)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37464)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37465);return (T) obj;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37466);throw new JSONException("can not cast to : " + type);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static <T> T cast(Object obj, ParameterizedType type, ParserConfig mapping){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37467);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37468);Type rawTye = type.getRawType();

        __CLR4_1_10s4ss4slusqjrhg.R.inc(37469);if((((rawTye == List.class || rawTye == ArrayList.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37470)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37471)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37472);Type itemType = type.getActualTypeArguments()[0];
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37473);if((((obj instanceof List)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37474)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37475)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37476);List listObj = (List) obj;
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37477);List arrayList = new ArrayList(listObj.size());

                __CLR4_1_10s4ss4slusqjrhg.R.inc(37478);for (int i = 0; (((i < listObj.size())&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37479)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37480)==0&false)); i++) {{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37481);Object item = listObj.get(i);

                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37482);Object itemValue;
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37483);if ((((itemType instanceof Class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37484)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37485)==0&false))) {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(37486);if ((((item != null && item.getClass() == JSONObject.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37487)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37488)==0&false))) {{
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(37489);itemValue = ((JSONObject) item).toJavaObject((Class<T>) itemType, mapping, 0);
                        } }else {{
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(37490);itemValue = cast(item, (Class<T>) itemType, mapping);
                        }
                    }} }else {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(37491);itemValue = cast(item, itemType, mapping);
                    }

                    }__CLR4_1_10s4ss4slusqjrhg.R.inc(37492);arrayList.add(itemValue);
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(37493);return (T) arrayList;
            }
        }}

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37494);if((((rawTye == Set.class || rawTye == HashSet.class //
                || rawTye == TreeSet.class //
                || rawTye == Collection.class //
                || rawTye == List.class //
                || rawTye == ArrayList.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37495)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37496)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37497);Type itemType = type.getActualTypeArguments()[0];
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37498);if((((obj instanceof Iterable)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37499)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37500)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37501);Collection collection;
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37502);if((((rawTye == Set.class || rawTye == HashSet.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37503)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37504)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37505);collection = new HashSet();
                } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(37506);if((((rawTye == TreeSet.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37507)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37508)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37509);collection = new TreeSet();
                } }else{{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37510);collection = new ArrayList();
                }
                }}__CLR4_1_10s4ss4slusqjrhg.R.inc(37511);for(Iterator it = ((Iterable) obj).iterator(); (((it.hasNext())&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37512)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37513)==0&false)); ){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37514);Object item = it.next();

                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37515);Object itemValue;
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37516);if ((((itemType instanceof Class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37517)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37518)==0&false))) {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(37519);if ((((item != null && item.getClass() == JSONObject.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37520)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37521)==0&false))) {{
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(37522);itemValue = ((JSONObject) item).toJavaObject((Class<T>) itemType, mapping, 0);
                        } }else {{
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(37523);itemValue = cast(item, (Class<T>) itemType, mapping);
                        }
                    }} }else {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(37524);itemValue = cast(item, itemType, mapping);
                    }

                    }__CLR4_1_10s4ss4slusqjrhg.R.inc(37525);collection.add(itemValue);
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(37526);return (T) collection;
            }
        }}

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37527);if((((rawTye == Map.class || rawTye == HashMap.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37528)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37529)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37530);Type keyType = type.getActualTypeArguments()[0];
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37531);Type valueType = type.getActualTypeArguments()[1];
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37532);if((((obj instanceof Map)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37533)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37534)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37535);Map map = new HashMap();
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37536);for(Map.Entry entry : ((Map<?,?>) obj).entrySet()){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37537);Object key = cast(entry.getKey(), keyType, mapping);
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37538);Object value = cast(entry.getValue(), valueType, mapping);
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37539);map.put(key, value);
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(37540);return (T) map;
            }
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37541);if((((obj instanceof String)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37542)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37543)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37544);String strVal = (String) obj;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37545);if((((strVal.length() == 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37546)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37547)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37548);return null;
            }
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37549);if((((type.getActualTypeArguments().length == 1)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37550)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37551)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37552);Type argType = type.getActualTypeArguments()[0];
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37553);if((((argType instanceof WildcardType)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37554)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37555)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37556);return (T) cast(obj, rawTye, mapping);
            }
        }}

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37557);if ((((rawTye == Map.Entry.class && obj instanceof Map && ((Map) obj).size() == 1)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37558)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37559)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37560);Map.Entry entry = (Map.Entry) ((Map) obj).entrySet().iterator().next();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37561);return (T) entry;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37562);if ((((rawTye instanceof Class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37563)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37564)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37565);if ((((mapping == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37566)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37567)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37568);mapping = ParserConfig.global;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37569);ObjectDeserializer deserializer = mapping.getDeserializer(rawTye);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37570);if ((((deserializer != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37571)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37572)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37573);String str = JSON.toJSONString(obj);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37574);DefaultJSONParser parser = new DefaultJSONParser(str, mapping);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37575);return (T) deserializer.deserialze(parser, type, null);
            }
        }}

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37576);throw new JSONException("can not cast to : " + type);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    @SuppressWarnings({"unchecked"})
    public static <T> T castToJavaBean(Map<String,Object> map, Class<T> clazz, ParserConfig config){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37577);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37578);try{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37579);if((((clazz == StackTraceElement.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37580)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37581)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37582);String declaringClass = (String) map.get("className");
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37583);String methodName = (String) map.get("methodName");
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37584);String fileName = (String) map.get("fileName");
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37585);int lineNumber;
                {
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37586);Number value = (Number) map.get("lineNumber");
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37587);if((((value == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37588)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37589)==0&false))) {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(37590);lineNumber = 0;
                    } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(37591);if ((((value instanceof BigDecimal)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37592)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37593)==0&false))) {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(37594);lineNumber = ((BigDecimal) value).intValueExact();
                    } }else{{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(37595);lineNumber = value.intValue();
                    }
                }}}
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37596);return (T) new StackTraceElement(declaringClass, methodName, fileName, lineNumber);
            }

            }{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37597);Object iClassObject = map.get(JSON.DEFAULT_TYPE_KEY);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37598);if((((iClassObject instanceof String)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37599)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37600)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37601);String className = (String) iClassObject;
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37602);Class<?> loadClazz;
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37603);if((((config == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37604)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37605)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(37606);config = ParserConfig.global;
                    }
                    }__CLR4_1_10s4ss4slusqjrhg.R.inc(37607);loadClazz = config.checkAutoType(className, null);
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37608);if((((loadClazz == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37609)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37610)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(37611);throw new ClassNotFoundException(className + " not found");
                    }
                    }__CLR4_1_10s4ss4slusqjrhg.R.inc(37612);if((((!loadClazz.equals(clazz))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37613)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37614)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(37615);return (T) castToJavaBean(map, loadClazz, config);
                    }
                }}
            }}

            __CLR4_1_10s4ss4slusqjrhg.R.inc(37616);if((((clazz.isInterface())&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37617)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37618)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37619);JSONObject object;
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37620);if((((map instanceof JSONObject)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37621)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37622)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37623);object = (JSONObject) map;
                } }else{{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37624);object = new JSONObject(map);
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(37625);if((((config == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37626)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37627)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37628);config = ParserConfig.getGlobalInstance();
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(37629);ObjectDeserializer deserializer = config.get(clazz);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37630);if((((deserializer != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37631)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37632)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37633);String json = JSON.toJSONString(object);
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37634);return JSON.parseObject(json, clazz);
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(37635);return (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                        new Class<?>[]{clazz}, object);
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37636);if((((clazz == Locale.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37637)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37638)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37639);Object arg0 = map.get("language");
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37640);Object arg1 = map.get("country");
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37641);if((((arg0 instanceof String)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37642)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37643)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37644);String language = (String) arg0;
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37645);if((((arg1 instanceof String)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37646)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37647)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(37648);String country = (String) arg1;
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(37649);return (T) new Locale(language, country);
                    } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(37650);if((((arg1 == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37651)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37652)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(37653);return (T) new Locale(language);
                    }
                }}}
            }}

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37654);if ((((clazz == String.class && map instanceof JSONObject)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37655)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37656)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37657);return (T) map.toString();
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37658);if ((((clazz == JSON.class && map instanceof JSONObject)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37659)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37660)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37661);return (T) map;
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37662);if ((((clazz == LinkedHashMap.class && map instanceof JSONObject)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37663)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37664)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37665);JSONObject jsonObject = (JSONObject) map;
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37666);Map innerMap = jsonObject.getInnerMap();
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37667);if ((((innerMap instanceof LinkedHashMap)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37668)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37669)==0&false))) {{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37670);return (T) innerMap;
                } }else {{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37671);LinkedHashMap linkedHashMap = new LinkedHashMap();
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37672);linkedHashMap.putAll(innerMap);
                }
            }}

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37673);if ((((clazz.isInstance(map))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37674)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37675)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37676);return (T) map;
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37677);if ((((clazz == JSONObject.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37678)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37679)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37680);return (T) new JSONObject(map);
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37681);if ((((config == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37682)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37683)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37684);config = ParserConfig.getGlobalInstance();
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37685);JavaBeanDeserializer javaBeanDeser = null;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37686);ObjectDeserializer deserializer = config.getDeserializer(clazz);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37687);if ((((deserializer instanceof JavaBeanDeserializer)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37688)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37689)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37690);javaBeanDeser = (JavaBeanDeserializer) deserializer;
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37691);if((((javaBeanDeser == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37692)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37693)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37694);throw new JSONException("can not get javaBeanDeserializer. " + clazz.getName());
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37695);return (T) javaBeanDeser.createInstance(map, config);
        } catch(Exception e){
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37696);throw new JSONException(e.getMessage(), e);
        }
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    private static void addBaseClassMappings(){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37697);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37698);mappings.put("byte", byte.class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37699);mappings.put("short", short.class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37700);mappings.put("int", int.class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37701);mappings.put("long", long.class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37702);mappings.put("float", float.class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37703);mappings.put("double", double.class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37704);mappings.put("boolean", boolean.class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37705);mappings.put("char", char.class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37706);mappings.put("[byte", byte[].class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37707);mappings.put("[short", short[].class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37708);mappings.put("[int", int[].class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37709);mappings.put("[long", long[].class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37710);mappings.put("[float", float[].class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37711);mappings.put("[double", double[].class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37712);mappings.put("[boolean", boolean[].class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37713);mappings.put("[char", char[].class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37714);mappings.put("[B", byte[].class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37715);mappings.put("[S", short[].class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37716);mappings.put("[I", int[].class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37717);mappings.put("[J", long[].class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37718);mappings.put("[F", float[].class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37719);mappings.put("[D", double[].class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37720);mappings.put("[C", char[].class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37721);mappings.put("[Z", boolean[].class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37722);Class<?>[] classes = new Class[]{
                Object.class,
                java.lang.Cloneable.class,
                loadClass("java.lang.AutoCloseable"),
                java.lang.Exception.class,
                java.lang.RuntimeException.class,
                java.lang.IllegalAccessError.class,
                java.lang.IllegalAccessException.class,
                java.lang.IllegalArgumentException.class,
                java.lang.IllegalMonitorStateException.class,
                java.lang.IllegalStateException.class,
                java.lang.IllegalThreadStateException.class,
                java.lang.IndexOutOfBoundsException.class,
                java.lang.InstantiationError.class,
                java.lang.InstantiationException.class,
                java.lang.InternalError.class,
                java.lang.InterruptedException.class,
                java.lang.LinkageError.class,
                java.lang.NegativeArraySizeException.class,
                java.lang.NoClassDefFoundError.class,
                java.lang.NoSuchFieldError.class,
                java.lang.NoSuchFieldException.class,
                java.lang.NoSuchMethodError.class,
                java.lang.NoSuchMethodException.class,
                java.lang.NullPointerException.class,
                java.lang.NumberFormatException.class,
                java.lang.OutOfMemoryError.class,
                java.lang.SecurityException.class,
                java.lang.StackOverflowError.class,
                java.lang.StringIndexOutOfBoundsException.class,
                java.lang.TypeNotPresentException.class,
                java.lang.VerifyError.class,
                java.lang.StackTraceElement.class,
                java.util.HashMap.class,
                java.util.Hashtable.class,
                java.util.TreeMap.class,
                java.util.IdentityHashMap.class,
                java.util.WeakHashMap.class,
                java.util.LinkedHashMap.class,
                java.util.HashSet.class,
                java.util.LinkedHashSet.class,
                java.util.TreeSet.class,
                java.util.ArrayList.class,
                java.util.concurrent.TimeUnit.class,
                java.util.concurrent.ConcurrentHashMap.class,
                loadClass("java.util.concurrent.ConcurrentSkipListMap"),
                loadClass("java.util.concurrent.ConcurrentSkipListSet"),
                java.util.concurrent.atomic.AtomicInteger.class,
                java.util.concurrent.atomic.AtomicLong.class,
                java.util.Collections.EMPTY_MAP.getClass(),
                java.lang.Boolean.class,
                java.lang.Character.class,
                java.lang.Byte.class,
                java.lang.Short.class,
                java.lang.Integer.class,
                java.lang.Long.class,
                java.lang.Float.class,
                java.lang.Double.class,
                java.lang.Number.class,
                java.lang.String.class,
                java.math.BigDecimal.class,
                java.math.BigInteger.class,
                java.util.BitSet.class,
                java.util.Calendar.class,
                java.util.Date.class,
                java.util.Locale.class,
                java.util.UUID.class,
                java.sql.Time.class,
                java.sql.Date.class,
                java.sql.Timestamp.class,
                java.text.SimpleDateFormat.class,
                com.alibaba.fastjson.JSONObject.class,
                com.alibaba.fastjson.JSONPObject.class,
                com.alibaba.fastjson.JSONArray.class,
        };
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37723);for(Class clazz : classes){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37724);if((((clazz == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37725)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37726)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37727);continue;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37728);mappings.put(clazz.getName(), clazz);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37729);String[] w = new String[]{
                "java.util.Collections$UnmodifiableMap"
        };
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37730);for(String className : w){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37731);Class<?> clazz = loadClass(className);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37732);if((((clazz == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37733)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37734)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37735);break;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37736);mappings.put(clazz.getName(), clazz);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37737);String[] awt = new String[]{
                "java.awt.Rectangle",
                "java.awt.Point",
                "java.awt.Font",
                "java.awt.Color"};
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37738);for(String className : awt){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37739);Class<?> clazz = loadClass(className);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37740);if((((clazz == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37741)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37742)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37743);break;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37744);mappings.put(clazz.getName(), clazz);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37745);String[] spring = new String[]{
                "org.springframework.util.LinkedMultiValueMap",
                "org.springframework.util.LinkedCaseInsensitiveMap",
                "org.springframework.remoting.support.RemoteInvocation",
                "org.springframework.remoting.support.RemoteInvocationResult",
                "org.springframework.security.web.savedrequest.DefaultSavedRequest",
                "org.springframework.security.web.savedrequest.SavedCookie",
                "org.springframework.security.web.csrf.DefaultCsrfToken",
                "org.springframework.security.web.authentication.WebAuthenticationDetails",
                "org.springframework.security.core.context.SecurityContextImpl",
                "org.springframework.security.authentication.UsernamePasswordAuthenticationToken",
                "org.springframework.security.core.authority.SimpleGrantedAuthority",
                "org.springframework.security.core.userdetails.User",
                "org.springframework.security.oauth2.common.DefaultExpiringOAuth2RefreshToken",
                "org.springframework.security.oauth2.common.DefaultOAuth2AccessToken",
                "org.springframework.security.oauth2.common.DefaultOAuth2RefreshToken",
                "org.springframework.cache.support.NullValue",
                "org.springframework.jdbc.UncategorizedSQLException",
                "org.springframework.dao.CannotAcquireLockException",
                "org.springframework.dao.DuplicateKeyException",
                "org.springframework.dao.QueryTimeoutException",
                "org.springframework.dao.TransientDataAccessException",
                "org.springframework.dao.TypeMismatchDataAccessException",
                "org.springframework.dao.UncategorizedDataAccessException",
                "org.springframework.dao.DataAccessResourceFailureException",
        };
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37746);for(String className : spring){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37747);Class<?> clazz = loadClass(className);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37748);if((((clazz == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37749)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37750)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37751);continue;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37752);mappings.put(clazz.getName(), clazz);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37753);String[] sofa = new String[] {
                "com.alipay.sofa.rpc.core.exception.SofaTimeOutException",
        };

        __CLR4_1_10s4ss4slusqjrhg.R.inc(37754);for(String className : sofa){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37755);Class<?> clazz = loadClass(className);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37756);if((((clazz == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37757)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37758)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37759);continue;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37760);mappings.put(clazz.getName(), clazz);
        }
    }}finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static void clearClassMapping(){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37761);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37762);mappings.clear();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37763);addBaseClassMappings();
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static void addMapping(String className, Class<?> clazz) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37764);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37765);mappings.put(className, clazz);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Class<?> loadClass(String className){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37766);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37767);return loadClass(className, null);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static boolean isPath(Class<?> clazz){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37768);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37769);if((((pathClass == null && !pathClass_error)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37770)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37771)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37772);try{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37773);pathClass = Class.forName("java.nio.file.Path");
            } catch(Throwable ex){
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37774);pathClass_error = true;
            }
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37775);if((((pathClass != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37776)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37777)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37778);return pathClass.isAssignableFrom(clazz);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37779);return false;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Class<?> getClassFromMapping(String className){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37780);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37781);return mappings.get(className);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Class<?> loadClass(String className, ClassLoader classLoader) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37782);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37783);return loadClass(className, classLoader, false);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Class<?> loadClass(String className, ClassLoader classLoader, boolean cache) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37784);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37785);if((((className == null || className.length() == 0 || className.length() > 128)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37786)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37787)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37788);return null;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37789);Class<?> clazz = mappings.get(className);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37790);if((((clazz != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37791)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37792)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37793);return clazz;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37794);if((((className.charAt(0) == '[')&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37795)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37796)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37797);Class<?> componentType = loadClass(className.substring(1), classLoader);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37798);return Array.newInstance(componentType, 0).getClass();
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37799);if((((className.startsWith("L") && className.endsWith(";"))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37800)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37801)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37802);String newClassName = className.substring(1, className.length() - 1);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37803);return loadClass(newClassName, classLoader);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37804);try{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37805);if((((classLoader != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37806)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37807)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37808);clazz = classLoader.loadClass(className);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37809);if ((((cache)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37810)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37811)==0&false))) {{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37812);mappings.put(className, clazz);
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(37813);return clazz;
            }
        }} catch(Throwable e){
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37814);e.printStackTrace();
            // skip
        }
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37815);try{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37816);ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37817);if((((contextClassLoader != null && contextClassLoader != classLoader)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37818)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37819)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37820);clazz = contextClassLoader.loadClass(className);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37821);if ((((cache)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37822)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37823)==0&false))) {{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37824);mappings.put(className, clazz);
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(37825);return clazz;
            }
        }} catch(Throwable e){
            // skip
        }
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37826);try{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37827);clazz = Class.forName(className);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37828);if ((((cache)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37829)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37830)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37831);mappings.put(className, clazz);
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37832);return clazz;
        } catch(Throwable e){
            // skip
        }
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37833);return clazz;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static SerializeBeanInfo buildBeanInfo(Class<?> beanType //
            , Map<String,String> aliasMap //
            , PropertyNamingStrategy propertyNamingStrategy){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37834);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37835);return buildBeanInfo(beanType, aliasMap, propertyNamingStrategy, false);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static SerializeBeanInfo buildBeanInfo(Class<?> beanType //
            , Map<String,String> aliasMap //
            , PropertyNamingStrategy propertyNamingStrategy //
            , boolean fieldBased //
    ){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37836);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37837);JSONType jsonType = TypeUtils.getAnnotation(beanType,JSONType.class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37838);String[] orders = null;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37839);final int features;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37840);String typeName = null, typeKey = null;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37841);if((((jsonType != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37842)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37843)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37844);orders = jsonType.orders();

            __CLR4_1_10s4ss4slusqjrhg.R.inc(37845);typeName = jsonType.typeName();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37846);if((((typeName.length() == 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37847)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37848)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37849);typeName = null;
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37850);PropertyNamingStrategy jsonTypeNaming = jsonType.naming();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37851);if ((((jsonTypeNaming != PropertyNamingStrategy.CamelCase)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37852)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37853)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37854);propertyNamingStrategy = jsonTypeNaming;
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37855);features = SerializerFeature.of(jsonType.serialzeFeatures());
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37856);for(Class<?> supperClass = beanType.getSuperclass()
                ; (((supperClass != null && supperClass != Object.class
                    )&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37857)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37858)==0&false)); supperClass = supperClass.getSuperclass()){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37859);JSONType superJsonType = TypeUtils.getAnnotation(supperClass,JSONType.class);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37860);if((((superJsonType == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37861)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37862)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37863);break;
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(37864);typeKey = superJsonType.typeKey();
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37865);if((((typeKey.length() != 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37866)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37867)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37868);break;
                }
            }}

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37869);for(Class<?> interfaceClass : beanType.getInterfaces()){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37870);JSONType superJsonType = TypeUtils.getAnnotation(interfaceClass,JSONType.class);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37871);if((((superJsonType != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37872)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37873)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37874);typeKey = superJsonType.typeKey();
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37875);if((((typeKey.length() != 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37876)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37877)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(37878);break;
                    }
                }}
            }}

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37879);if((((typeKey != null && typeKey.length() == 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37880)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37881)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37882);typeKey = null;
            }
        }} }else{{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37883);features = 0;
        }
        // fieldName,field \uff0c\u5148\u751f\u6210fieldName\u7684\u5feb\u7167\uff0c\u51cf\u5c11\u4e4b\u540e\u7684findField\u7684\u8f6e\u8be2
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37884);Map<String,Field> fieldCacheMap = new HashMap<String,Field>();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37885);ParserConfig.parserAllFieldToCache(beanType, fieldCacheMap);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37886);List<FieldInfo> fieldInfoList = (((fieldBased
                )&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37887)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37888)==0&false))? computeGettersWithFieldBase(beanType, aliasMap, false, propertyNamingStrategy) //
                : computeGetters(beanType, jsonType, aliasMap, fieldCacheMap, false, propertyNamingStrategy);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37889);FieldInfo[] fields = new FieldInfo[fieldInfoList.size()];
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37890);fieldInfoList.toArray(fields);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37891);FieldInfo[] sortedFields;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37892);List<FieldInfo> sortedFieldList;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37893);if((((orders != null && orders.length != 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37894)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37895)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37896);sortedFieldList = (((fieldBased
                    )&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37897)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37898)==0&false))? computeGettersWithFieldBase(beanType, aliasMap, true, propertyNamingStrategy) //
                    : computeGetters(beanType, jsonType, aliasMap, fieldCacheMap, true, propertyNamingStrategy);
        } }else{{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37899);sortedFieldList = new ArrayList<FieldInfo>(fieldInfoList);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37900);Collections.sort(sortedFieldList);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37901);sortedFields = new FieldInfo[sortedFieldList.size()];
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37902);sortedFieldList.toArray(sortedFields);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37903);if((((Arrays.equals(sortedFields, fields))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37904)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37905)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37906);sortedFields = fields;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37907);return new SerializeBeanInfo(beanType, jsonType, typeName, typeKey, features, fields, sortedFields);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static List<FieldInfo> computeGettersWithFieldBase(
            Class<?> clazz, //
            Map<String,String> aliasMap, //
            boolean sorted, //
            PropertyNamingStrategy propertyNamingStrategy){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37908);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37909);Map<String,FieldInfo> fieldInfoMap = new LinkedHashMap<String,FieldInfo>();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37910);for(Class<?> currentClass = clazz; (((currentClass != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37911)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37912)==0&false)); currentClass = currentClass.getSuperclass()){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37913);Field[] fields = currentClass.getDeclaredFields();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37914);computeFields(currentClass, aliasMap, propertyNamingStrategy, fieldInfoMap, fields);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(37915);return getFieldInfos(clazz, sorted, fieldInfoMap);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static List<FieldInfo> computeGetters(Class<?> clazz, Map<String,String> aliasMap){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37916);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37917);return computeGetters(clazz, aliasMap, true);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static List<FieldInfo> computeGetters(Class<?> clazz, Map<String,String> aliasMap, boolean sorted){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37918);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37919);JSONType jsonType = TypeUtils.getAnnotation(clazz,JSONType.class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37920);Map<String,Field> fieldCacheMap = new HashMap<String,Field>();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37921);ParserConfig.parserAllFieldToCache(clazz, fieldCacheMap);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37922);return computeGetters(clazz, jsonType, aliasMap, fieldCacheMap, sorted, PropertyNamingStrategy.CamelCase);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static List<FieldInfo> computeGetters(Class<?> clazz, //
                                                 JSONType jsonType, //
                                                 Map<String,String> aliasMap, //
                                                 Map<String,Field> fieldCacheMap, //
                                                 boolean sorted, //
                                                 PropertyNamingStrategy propertyNamingStrategy //
    ){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(37923);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37924);Map<String,FieldInfo> fieldInfoMap = new LinkedHashMap<String,FieldInfo>();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37925);boolean kotlin = TypeUtils.isKotlin(clazz);
        // for kotlin
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37926);Constructor[] constructors = null;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37927);Annotation[][] paramAnnotationArrays = null;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37928);String[] paramNames = null;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37929);short[] paramNameMapping = null;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37930);Method[] methods = clazz.getMethods();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(37931);for(Method method : methods){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37932);String methodName = method.getName();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37933);int ordinal = 0, serialzeFeatures = 0, parserFeatures = 0;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37934);String label = null;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37935);if((((Modifier.isStatic(method.getModifiers()))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37936)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37937)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37938);continue;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37939);if((((method.getReturnType().equals(Void.TYPE))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37940)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37941)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37942);continue;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37943);if((((method.getParameterTypes().length != 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37944)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37945)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37946);continue;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37947);if((((method.getReturnType() == ClassLoader.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37948)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37949)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37950);continue;
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37951);if((((methodName.equals("getMetaClass")
                    && method.getReturnType().getName().equals("groovy.lang.MetaClass"))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37952)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37953)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37954);continue;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37955);if((((methodName.equals("getSuppressed")
                    && method.getDeclaringClass() == Throwable.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37956)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37957)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37958);continue;
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37959);if((((kotlin && isKotlinIgnore(clazz, methodName))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37960)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37961)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37962);continue;
            }
            /**
             *  \u5982\u679c\u5728\u5c5e\u6027\u6216\u8005\u65b9\u6cd5\u4e0a\u5b58\u5728JSONField\u6ce8\u89e3\uff0c\u5e76\u4e14\u5b9a\u5236\u4e86name\u5c5e\u6027\uff0c\u4e0d\u4ee5\u7c7b\u4e0a\u7684propertyNamingStrategy\u8bbe\u7f6e\u4e3a\u51c6\uff0c\u4ee5\u6b64\u5b57\u6bb5\u7684JSONField\u7684name\u5b9a\u5236\u4e3a\u51c6\u3002
             */
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37963);Boolean fieldAnnotationAndNameExists = false;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37964);JSONField annotation = TypeUtils.getAnnotation(method, JSONField.class);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(37965);if((((annotation == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37966)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37967)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37968);annotation = getSuperMethodAnnotation(clazz, method);
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37969);if((((annotation == null && kotlin)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37970)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37971)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(37972);if((((constructors == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37973)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37974)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37975);constructors = clazz.getDeclaredConstructors();
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37976);Constructor creatorConstructor = TypeUtils.getKoltinConstructor(constructors);
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37977);if((((creatorConstructor != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37978)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37979)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(37980);paramAnnotationArrays = TypeUtils.getParameterAnnotations(creatorConstructor);
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(37981);paramNames = TypeUtils.getKoltinConstructorParameters(clazz);
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(37982);if((((paramNames != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37983)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37984)==0&false))){{
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(37985);String[] paramNames_sorted = new String[paramNames.length];
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(37986);System.arraycopy(paramNames, 0, paramNames_sorted, 0, paramNames.length);

                            __CLR4_1_10s4ss4slusqjrhg.R.inc(37987);Arrays.sort(paramNames_sorted);
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(37988);paramNameMapping = new short[paramNames.length];
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(37989);for(short p = 0; (((p < paramNames.length)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37990)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37991)==0&false)); p++){{
                                __CLR4_1_10s4ss4slusqjrhg.R.inc(37992);int index = Arrays.binarySearch(paramNames_sorted, paramNames[p]);
                                __CLR4_1_10s4ss4slusqjrhg.R.inc(37993);paramNameMapping[index] = p;
                            }
                            }__CLR4_1_10s4ss4slusqjrhg.R.inc(37994);paramNames = paramNames_sorted;
                        }
                    }}
                }}
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(37995);if((((paramNames != null && paramNameMapping != null && methodName.startsWith("get"))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(37996)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(37997)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37998);String propertyName = decapitalize(methodName.substring(3));
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(37999);int p = Arrays.binarySearch(paramNames, propertyName);
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38000);if ((((p < 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38001)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38002)==0&false))) {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38003);for (int i = 0; (((i < paramNames.length)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38004)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38005)==0&false)); i++) {{
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(38006);if ((((propertyName.equalsIgnoreCase(paramNames[i]))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38007)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38008)==0&false))) {{
                                __CLR4_1_10s4ss4slusqjrhg.R.inc(38009);p = i;
                                __CLR4_1_10s4ss4slusqjrhg.R.inc(38010);break;
                            }
                        }}
                    }}
                    }__CLR4_1_10s4ss4slusqjrhg.R.inc(38011);if((((p >= 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38012)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38013)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38014);short index = paramNameMapping[p];
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38015);Annotation[] paramAnnotations = paramAnnotationArrays[index];
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38016);if((((paramAnnotations != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38017)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38018)==0&false))){{
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(38019);for(Annotation paramAnnotation : paramAnnotations){{
                                __CLR4_1_10s4ss4slusqjrhg.R.inc(38020);if((((paramAnnotation instanceof JSONField)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38021)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38022)==0&false))){{
                                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38023);annotation = (JSONField) paramAnnotation;
                                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38024);break;
                                }
                            }}
                        }}
                        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38025);if((((annotation == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38026)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38027)==0&false))){{
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(38028);Field field = ParserConfig.getFieldFromCache(propertyName, fieldCacheMap);
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(38029);if((((field != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38030)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38031)==0&false))){{
                                __CLR4_1_10s4ss4slusqjrhg.R.inc(38032);annotation = TypeUtils.getAnnotation(field, JSONField.class);
                            }
                        }}
                    }}
                }}
            }}
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38033);if((((annotation != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38034)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38035)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38036);if((((!annotation.serialize())&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38037)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38038)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38039);continue;
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38040);ordinal = annotation.ordinal();
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38041);serialzeFeatures = SerializerFeature.of(annotation.serialzeFeatures());
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38042);parserFeatures = Feature.of(annotation.parseFeatures());
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38043);if((((annotation.name().length() != 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38044)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38045)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38046);String propertyName = annotation.name();
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38047);if((((aliasMap != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38048)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38049)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38050);propertyName = aliasMap.get(propertyName);
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38051);if((((propertyName == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38052)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38053)==0&false))){{
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(38054);continue;
                        }
                    }}
                    }__CLR4_1_10s4ss4slusqjrhg.R.inc(38055);FieldInfo fieldInfo = new FieldInfo(propertyName, method, null, clazz, null, ordinal,
                            serialzeFeatures, parserFeatures, annotation, null, label);
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38056);fieldInfoMap.put(propertyName, fieldInfo);
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38057);continue;
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38058);if((((annotation.label().length() != 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38059)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38060)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38061);label = annotation.label();
                }
            }}
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38062);if((((methodName.startsWith("get"))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38063)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38064)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38065);if((((methodName.length() < 4)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38066)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38067)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38068);continue;
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38069);if((((methodName.equals("getClass"))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38070)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38071)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38072);continue;
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38073);if((((methodName.equals("getDeclaringClass") && clazz.isEnum())&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38074)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38075)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38076);continue;
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38077);char c3 = methodName.charAt(3);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38078);String propertyName;
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38079);if((((Character.isUpperCase(c3) //
                        || c3 > 512 // for unicode method name
                        )&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38080)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38081)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38082);if((((compatibleWithJavaBean)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38083)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38084)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38085);propertyName = decapitalize(methodName.substring(3));
                    } }else{{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38086);propertyName = Character.toLowerCase(methodName.charAt(3)) + methodName.substring(4);
                    }
                    }__CLR4_1_10s4ss4slusqjrhg.R.inc(38087);propertyName = getPropertyNameByCompatibleFieldName(fieldCacheMap, methodName, propertyName, 3);
                } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(38088);if((((c3 == '_')&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38089)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38090)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38091);propertyName = methodName.substring(4);
                } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(38092);if((((c3 == 'f')&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38093)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38094)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38095);propertyName = methodName.substring(3);
                } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(38096);if((((methodName.length() >= 5 && Character.isUpperCase(methodName.charAt(4)))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38097)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38098)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38099);propertyName = decapitalize(methodName.substring(3));
                } }else{{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38100);continue;
                }
                }}}}__CLR4_1_10s4ss4slusqjrhg.R.inc(38101);boolean ignore = isJSONTypeIgnore(clazz, propertyName);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38102);if((((ignore)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38103)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38104)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38105);continue;
                }
                //\u5047\u5982bean\u7684field\u5f88\u591a\u7684\u60c5\u51b5\u4e00\u4e0b\uff0c\u8f6e\u8be2\u65f6\u5c06\u5927\u5927\u964d\u4f4e\u6548\u7387
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38106);Field field = ParserConfig.getFieldFromCache(propertyName, fieldCacheMap);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38107);if((((field == null && propertyName.length() > 1)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38108)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38109)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38110);char ch = propertyName.charAt(1);
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38111);if((((ch >= 'A' && ch <= 'Z')&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38112)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38113)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38114);String javaBeanCompatiblePropertyName = decapitalize(methodName.substring(3));
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38115);field = ParserConfig.getFieldFromCache(javaBeanCompatiblePropertyName, fieldCacheMap);
                    }
                }}
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38116);JSONField fieldAnnotation = null;
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38117);if((((field != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38118)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38119)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38120);fieldAnnotation = TypeUtils.getAnnotation(field, JSONField.class);
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38121);if((((fieldAnnotation != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38122)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38123)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38124);if((((!fieldAnnotation.serialize())&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38125)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38126)==0&false))){{
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(38127);continue;
                        }
                        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38128);ordinal = fieldAnnotation.ordinal();
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38129);serialzeFeatures = SerializerFeature.of(fieldAnnotation.serialzeFeatures());
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38130);parserFeatures = Feature.of(fieldAnnotation.parseFeatures());
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38131);if((((fieldAnnotation.name().length() != 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38132)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38133)==0&false))){{
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(38134);fieldAnnotationAndNameExists = true;
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(38135);propertyName = fieldAnnotation.name();
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(38136);if((((aliasMap != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38137)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38138)==0&false))){{
                                __CLR4_1_10s4ss4slusqjrhg.R.inc(38139);propertyName = aliasMap.get(propertyName);
                                __CLR4_1_10s4ss4slusqjrhg.R.inc(38140);if((((propertyName == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38141)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38142)==0&false))){{
                                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38143);continue;
                                }
                            }}
                        }}
                        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38144);if((((fieldAnnotation.label().length() != 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38145)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38146)==0&false))){{
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(38147);label = fieldAnnotation.label();
                        }
                    }}
                }}
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38148);if((((aliasMap != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38149)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38150)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38151);propertyName = aliasMap.get(propertyName);
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38152);if((((propertyName == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38153)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38154)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38155);continue;
                    }
                }}
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38156);if((((propertyNamingStrategy != null && !fieldAnnotationAndNameExists)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38157)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38158)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38159);propertyName = propertyNamingStrategy.translate(propertyName);
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38160);FieldInfo fieldInfo = new FieldInfo(propertyName, method, field, clazz, null, ordinal, serialzeFeatures, parserFeatures,
                        annotation, fieldAnnotation, label);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38161);fieldInfoMap.put(propertyName, fieldInfo);
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38162);if((((methodName.startsWith("is"))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38163)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38164)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38165);if((((methodName.length() < 3)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38166)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38167)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38168);continue;
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38169);if((((method.getReturnType() != Boolean.TYPE
                        && method.getReturnType() != Boolean.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38170)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38171)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38172);continue;
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38173);char c2 = methodName.charAt(2);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38174);String propertyName;
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38175);if((((Character.isUpperCase(c2))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38176)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38177)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38178);if((((compatibleWithJavaBean)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38179)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38180)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38181);propertyName = decapitalize(methodName.substring(2));
                    } }else{{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38182);propertyName = Character.toLowerCase(methodName.charAt(2)) + methodName.substring(3);
                    }
                    }__CLR4_1_10s4ss4slusqjrhg.R.inc(38183);propertyName = getPropertyNameByCompatibleFieldName(fieldCacheMap, methodName, propertyName, 2);
                } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(38184);if((((c2 == '_')&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38185)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38186)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38187);propertyName = methodName.substring(3);
                } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(38188);if((((c2 == 'f')&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38189)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38190)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38191);propertyName = methodName.substring(2);
                } }else{{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38192);continue;
                }
                }}}__CLR4_1_10s4ss4slusqjrhg.R.inc(38193);boolean ignore = isJSONTypeIgnore(clazz, propertyName);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38194);if((((ignore)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38195)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38196)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38197);continue;
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38198);Field field = ParserConfig.getFieldFromCache(propertyName, fieldCacheMap);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38199);if((((field == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38200)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38201)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38202);field = ParserConfig.getFieldFromCache(methodName, fieldCacheMap);
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38203);JSONField fieldAnnotation = null;
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38204);if((((field != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38205)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38206)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38207);fieldAnnotation = TypeUtils.getAnnotation(field, JSONField.class);
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38208);if((((fieldAnnotation != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38209)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38210)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38211);if((((!fieldAnnotation.serialize())&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38212)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38213)==0&false))){{
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(38214);continue;
                        }
                        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38215);ordinal = fieldAnnotation.ordinal();
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38216);serialzeFeatures = SerializerFeature.of(fieldAnnotation.serialzeFeatures());
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38217);parserFeatures = Feature.of(fieldAnnotation.parseFeatures());
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38218);if((((fieldAnnotation.name().length() != 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38219)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38220)==0&false))){{
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(38221);propertyName = fieldAnnotation.name();
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(38222);if((((aliasMap != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38223)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38224)==0&false))){{
                                __CLR4_1_10s4ss4slusqjrhg.R.inc(38225);propertyName = aliasMap.get(propertyName);
                                __CLR4_1_10s4ss4slusqjrhg.R.inc(38226);if((((propertyName == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38227)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38228)==0&false))){{
                                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38229);continue;
                                }
                            }}
                        }}
                        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38230);if((((fieldAnnotation.label().length() != 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38231)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38232)==0&false))){{
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(38233);label = fieldAnnotation.label();
                        }
                    }}
                }}
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38234);if((((aliasMap != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38235)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38236)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38237);propertyName = aliasMap.get(propertyName);
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38238);if((((propertyName == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38239)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38240)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38241);continue;
                    }
                }}
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38242);if((((propertyNamingStrategy != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38243)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38244)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38245);propertyName = propertyNamingStrategy.translate(propertyName);
                }
                //\u4f18\u5148\u9009\u62e9get
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38246);if((((fieldInfoMap.containsKey(propertyName))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38247)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38248)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38249);continue;
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38250);FieldInfo fieldInfo = new FieldInfo(propertyName, method, field, clazz, null, ordinal, serialzeFeatures, parserFeatures,
                        annotation, fieldAnnotation, label);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38251);fieldInfoMap.put(propertyName, fieldInfo);
            }
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38252);Field[] fields = clazz.getFields();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38253);computeFields(clazz, aliasMap, propertyNamingStrategy, fieldInfoMap, fields);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38254);return getFieldInfos(clazz, sorted, fieldInfoMap);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    private static List<FieldInfo> getFieldInfos(Class<?> clazz, boolean sorted, Map<String,FieldInfo> fieldInfoMap){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38255);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38256);List<FieldInfo> fieldInfoList = new ArrayList<FieldInfo>();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38257);String[] orders = null;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38258);JSONType annotation = TypeUtils.getAnnotation(clazz,JSONType.class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38259);if((((annotation != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38260)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38261)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38262);orders = annotation.orders();
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38263);if((((orders != null && orders.length > 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38264)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38265)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38266);LinkedHashMap<String,FieldInfo> map = new LinkedHashMap<String,FieldInfo>(fieldInfoList.size());
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38267);for(FieldInfo field : fieldInfoMap.values()){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38268);map.put(field.name, field);
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38269);int i = 0;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38270);for(String item : orders){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38271);FieldInfo field = map.get(item);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38272);if((((field != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38273)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38274)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38275);fieldInfoList.add(field);
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38276);map.remove(item);
                }
            }}
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38277);for(FieldInfo field : map.values()){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38278);fieldInfoList.add(field);
            }
        }} }else{{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38279);for(FieldInfo fieldInfo : fieldInfoMap.values()){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38280);fieldInfoList.add(fieldInfo);
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38281);if((((sorted)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38282)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38283)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38284);Collections.sort(fieldInfoList);
            }
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38285);return fieldInfoList;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    private static void computeFields(
            Class<?> clazz, //
            Map<String,String> aliasMap, //
            PropertyNamingStrategy propertyNamingStrategy, //
            Map<String,FieldInfo> fieldInfoMap, //
            Field[] fields){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38286);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38287);for(Field field : fields){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38288);if((((Modifier.isStatic(field.getModifiers()))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38289)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38290)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38291);continue;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38292);JSONField fieldAnnotation = TypeUtils.getAnnotation(field, JSONField.class);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38293);int ordinal = 0, serialzeFeatures = 0, parserFeatures = 0;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38294);String propertyName = field.getName();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38295);String label = null;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38296);if((((fieldAnnotation != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38297)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38298)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38299);if((((!fieldAnnotation.serialize())&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38300)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38301)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38302);continue;
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38303);ordinal = fieldAnnotation.ordinal();
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38304);serialzeFeatures = SerializerFeature.of(fieldAnnotation.serialzeFeatures());
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38305);parserFeatures = Feature.of(fieldAnnotation.parseFeatures());
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38306);if((((fieldAnnotation.name().length() != 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38307)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38308)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38309);propertyName = fieldAnnotation.name();
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38310);if((((fieldAnnotation.label().length() != 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38311)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38312)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38313);label = fieldAnnotation.label();
                }
            }}
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38314);if((((aliasMap != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38315)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38316)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38317);propertyName = aliasMap.get(propertyName);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38318);if((((propertyName == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38319)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38320)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38321);continue;
                }
            }}
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38322);if((((propertyNamingStrategy != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38323)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38324)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38325);propertyName = propertyNamingStrategy.translate(propertyName);
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38326);if((((!fieldInfoMap.containsKey(propertyName))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38327)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38328)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38329);FieldInfo fieldInfo = new FieldInfo(propertyName, null, field, clazz, null, ordinal, serialzeFeatures, parserFeatures,
                        null, fieldAnnotation, label);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38330);fieldInfoMap.put(propertyName, fieldInfo);
            }
        }}
    }}finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    private static String getPropertyNameByCompatibleFieldName(Map<String,Field> fieldCacheMap, String methodName,
                                                               String propertyName, int fromIdx){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38331);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38332);if((((compatibleWithFieldName)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38333)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38334)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38335);if((((!fieldCacheMap.containsKey(propertyName))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38336)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38337)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38338);String tempPropertyName = methodName.substring(fromIdx);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38339);return (((fieldCacheMap.containsKey(tempPropertyName) )&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38340)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38341)==0&false))? tempPropertyName : propertyName;
            }
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38342);return propertyName;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static JSONField getSuperMethodAnnotation(final Class<?> clazz, final Method method){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38343);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38344);Class<?>[] interfaces = clazz.getInterfaces();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38345);if((((interfaces.length > 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38346)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38347)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38348);Class<?>[] types = method.getParameterTypes();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38349);for(Class<?> interfaceClass : interfaces){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38350);for(Method interfaceMethod : interfaceClass.getMethods()){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38351);Class<?>[] interfaceTypes = interfaceMethod.getParameterTypes();
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38352);if((((interfaceTypes.length != types.length)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38353)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38354)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38355);continue;
                    }
                    }__CLR4_1_10s4ss4slusqjrhg.R.inc(38356);if((((!interfaceMethod.getName().equals(method.getName()))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38357)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38358)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38359);continue;
                    }
                    }__CLR4_1_10s4ss4slusqjrhg.R.inc(38360);boolean match = true;
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38361);for(int i = 0; (((i < types.length)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38362)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38363)==0&false)); ++i){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38364);if((((!interfaceTypes[i].equals(types[i]))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38365)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38366)==0&false))){{
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(38367);match = false;
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(38368);break;
                        }
                    }}
                    }__CLR4_1_10s4ss4slusqjrhg.R.inc(38369);if((((!match)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38370)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38371)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38372);continue;
                    }
                    }__CLR4_1_10s4ss4slusqjrhg.R.inc(38373);JSONField annotation = TypeUtils.getAnnotation(interfaceMethod, JSONField.class);
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38374);if((((annotation != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38375)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38376)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38377);return annotation;
                    }
                }}
            }}
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38378);Class<?> superClass = clazz.getSuperclass();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38379);if((((superClass == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38380)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38381)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38382);return null;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38383);if((((Modifier.isAbstract(superClass.getModifiers()))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38384)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38385)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38386);Class<?>[] types = method.getParameterTypes();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38387);for(Method interfaceMethod : superClass.getMethods()){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38388);Class<?>[] interfaceTypes = interfaceMethod.getParameterTypes();
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38389);if((((interfaceTypes.length != types.length)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38390)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38391)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38392);continue;
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38393);if((((!interfaceMethod.getName().equals(method.getName()))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38394)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38395)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38396);continue;
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38397);boolean match = true;
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38398);for(int i = 0; (((i < types.length)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38399)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38400)==0&false)); ++i){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38401);if((((!interfaceTypes[i].equals(types[i]))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38402)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38403)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38404);match = false;
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38405);break;
                    }
                }}
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38406);if((((!match)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38407)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38408)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38409);continue;
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38410);JSONField annotation = TypeUtils.getAnnotation(interfaceMethod, JSONField.class);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38411);if((((annotation != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38412)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38413)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38414);return annotation;
                }
            }}
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38415);return null;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    private static boolean isJSONTypeIgnore(Class<?> clazz, String propertyName){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38416);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38417);JSONType jsonType = TypeUtils.getAnnotation(clazz,JSONType.class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38418);if((((jsonType != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38419)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38420)==0&false))){{
            // 1\u3001\u65b0\u589e includes \u652f\u6301\uff0c\u5982\u679c JSONType \u540c\u65f6\u8bbe\u7f6e\u4e86includes \u548c ignores \u5c5e\u6027\uff0c\u5219\u4ee5includes\u4e3a\u51c6\u3002
            // 2\u3001\u4e2a\u4eba\u8ba4\u4e3a\u5bf9\u4e8e\u5927\u5c0f\u5199\u654f\u611f\u7684Java\u548cJS\u800c\u8a00\uff0c\u4f7f\u7528 equals() \u6bd4 equalsIgnoreCase() \u66f4\u597d\uff0c\u6539\u52a8\u7684\u552f\u4e00\u98ce\u9669\u5c31\u662f\u5411\u540e\u517c\u5bb9\u6027\u7684\u95ee\u9898
            // \u4e0d\u8fc7\uff0c\u76f8\u4fe1\u5f00\u53d1\u8005\u5e94\u8be5\u90fd\u662f\u4e25\u683c\u6309\u7167\u5927\u5c0f\u5199\u654f\u611f\u7684\u65b9\u5f0f\u8fdb\u884c\u5c5e\u6027\u8bbe\u7f6e\u7684
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38421);String[] fields = jsonType.includes();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38422);if((((fields.length > 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38423)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38424)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38425);for(int i = 0; (((i < fields.length)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38426)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38427)==0&false)); i++){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38428);if((((propertyName.equals(fields[i]))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38429)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38430)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38431);return false;
                    }
                }}
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38432);return true;
            } }else{{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38433);fields = jsonType.ignores();
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38434);for(int i = 0; (((i < fields.length)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38435)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38436)==0&false)); i++){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38437);if((((propertyName.equals(fields[i]))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38438)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38439)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38440);return true;
                    }
                }}
            }}
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38441);if((((clazz.getSuperclass() != Object.class && clazz.getSuperclass() != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38442)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38443)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38444);return isJSONTypeIgnore(clazz.getSuperclass(), propertyName);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38445);return false;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static boolean isGenericParamType(Type type){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38446);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38447);if((((type instanceof ParameterizedType)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38448)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38449)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38450);return true;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38451);if((((type instanceof Class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38452)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38453)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38454);Type superType = ((Class<?>) type).getGenericSuperclass();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38455);return superType != Object.class && isGenericParamType(superType);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38456);return false;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Type getGenericParamType(Type type){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38457);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38458);if((((type instanceof ParameterizedType)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38459)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38460)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38461);return type;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38462);if((((type instanceof Class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38463)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38464)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38465);return getGenericParamType(((Class<?>) type).getGenericSuperclass());
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38466);return type;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Type unwrapOptional(Type type){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38467);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38468);if((((!optionalClassInited)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38469)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38470)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38471);try{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38472);optionalClass = Class.forName("java.util.Optional");
            } catch(Exception e){
                // skip
            } finally{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38473);optionalClassInited = true;
            }
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38474);if((((type instanceof ParameterizedType)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38475)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38476)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38477);ParameterizedType parameterizedType = (ParameterizedType) type;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38478);if((((parameterizedType.getRawType() == optionalClass)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38479)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38480)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38481);return parameterizedType.getActualTypeArguments()[0];
            }
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38482);return type;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Class<?> getClass(Type type){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38483);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38484);if((((type.getClass() == Class.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38485)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38486)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38487);return (Class<?>) type;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38488);if((((type instanceof ParameterizedType)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38489)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38490)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38491);return getClass(((ParameterizedType) type).getRawType());
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38492);if((((type instanceof TypeVariable)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38493)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38494)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38495);Type boundType = ((TypeVariable<?>) type).getBounds()[0];
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38496);if ((((boundType instanceof Class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38497)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38498)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38499);return (Class) boundType;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38500);return getClass(boundType);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38501);if((((type instanceof WildcardType)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38502)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38503)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38504);Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38505);if ((((upperBounds.length == 1)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38506)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38507)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38508);return getClass(upperBounds[0]);
            }
        }}

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38509);return Object.class;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Field getField(Class<?> clazz, String fieldName, Field[] declaredFields){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38510);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38511);for(Field field : declaredFields){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38512);String itemName = field.getName();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38513);if((((fieldName.equals(itemName))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38514)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38515)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38516);return field;
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38517);char c0, c1;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38518);if (fieldName.length() > 2
                    && (c0 = fieldName.charAt(0)) >= 'a' && c0 <= 'z'
                    && (c1 = fieldName.charAt(1)) >= 'A' && c1 <= 'Z'
                    && fieldName.equalsIgnoreCase(itemName)) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38521);return field;
            }
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38522);Class<?> superClass = clazz.getSuperclass();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38523);if((((superClass != null && superClass != Object.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38524)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38525)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38526);return getField(superClass, fieldName, superClass.getDeclaredFields());
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38527);return null;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    /**
     * @deprecated
     */
    public static int getSerializeFeatures(Class<?> clazz){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38528);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38529);JSONType annotation = TypeUtils.getAnnotation(clazz,JSONType.class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38530);if((((annotation == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38531)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38532)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38533);return 0;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38534);return SerializerFeature.of(annotation.serialzeFeatures());
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static int getParserFeatures(Class<?> clazz){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38535);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38536);JSONType annotation = TypeUtils.getAnnotation(clazz,JSONType.class);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38537);if((((annotation == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38538)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38539)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38540);return 0;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38541);return Feature.of(annotation.parseFeatures());
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static String decapitalize(String name){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38542);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38543);if((((name == null || name.length() == 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38544)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38545)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38546);return name;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38547);if((((name.length() > 1 && Character.isUpperCase(name.charAt(1)) && Character.isUpperCase(name.charAt(0)))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38548)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38549)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38550);return name;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38551);char[] chars = name.toCharArray();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38552);chars[0] = Character.toLowerCase(chars[0]);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38553);return new String(chars);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    static void setAccessible(AccessibleObject obj){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38554);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38555);if((((!setAccessibleEnable)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38556)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38557)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38558);return;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38559);if((((obj.isAccessible())&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38560)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38561)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38562);return;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38563);try{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38564);obj.setAccessible(true);
        } catch(AccessControlException error){
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38565);setAccessibleEnable = false;
        }
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Type getCollectionItemType(Type fieldType) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38566);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38567);if ((((fieldType instanceof ParameterizedType)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38568)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38569)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38570);return getCollectionItemType((ParameterizedType) fieldType);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38571);if ((((fieldType instanceof Class<?>)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38572)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38573)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38574);return getCollectionItemType((Class<?>) fieldType);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38575);return Object.class;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    private static Type getCollectionItemType(Class<?> clazz) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38576);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38577);return (((clazz.getName().startsWith("java.")
                )&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38578)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38579)==0&false))? Object.class
                : getCollectionItemType(getCollectionSuperType(clazz));
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    private static Type getCollectionItemType(ParameterizedType parameterizedType) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38580);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38581);Type rawType = parameterizedType.getRawType();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38582);Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38583);if ((((rawType == Collection.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38584)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38585)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38586);return getWildcardTypeUpperBounds(actualTypeArguments[0]);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38587);Class<?> rawClass = (Class<?>) rawType;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38588);Map<TypeVariable, Type> actualTypeMap = createActualTypeMap(rawClass.getTypeParameters(), actualTypeArguments);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38589);Type superType = getCollectionSuperType(rawClass);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38590);if ((((superType instanceof ParameterizedType)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38591)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38592)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38593);Class<?> superClass = getRawClass(superType);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38594);Type[] superClassTypeParameters = ((ParameterizedType) superType).getActualTypeArguments();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38595);return (((superClassTypeParameters.length > 0
                    )&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38596)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38597)==0&false))? getCollectionItemType(makeParameterizedType(superClass, superClassTypeParameters, actualTypeMap))
                    : getCollectionItemType(superClass);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38598);return getCollectionItemType((Class<?>) superType);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    private static Type getCollectionSuperType(Class<?> clazz) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38599);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38600);Type assignable = null;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38601);for (Type type : clazz.getGenericInterfaces()) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38602);Class<?> rawClass = getRawClass(type);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38603);if ((((rawClass == Collection.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38604)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38605)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38606);return type;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38607);if ((((Collection.class.isAssignableFrom(rawClass))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38608)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38609)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38610);assignable = type;
            }
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38611);return (((assignable == null )&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38612)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38613)==0&false))? clazz.getGenericSuperclass() : assignable;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    private static Map<TypeVariable, Type> createActualTypeMap(TypeVariable[] typeParameters, Type[] actualTypeArguments) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38614);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38615);int length = typeParameters.length;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38616);Map<TypeVariable, Type> actualTypeMap = new HashMap<TypeVariable, Type>(length);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38617);for (int i = 0; (((i < length)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38618)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38619)==0&false)); i++) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38620);actualTypeMap.put(typeParameters[i], actualTypeArguments[i]);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38621);return actualTypeMap;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    private static ParameterizedType makeParameterizedType(Class<?> rawClass, Type[] typeParameters, Map<TypeVariable, Type> actualTypeMap) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38622);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38623);int length = typeParameters.length;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38624);Type[] actualTypeArguments = new Type[length];
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38625);for (int i = 0; (((i < length)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38626)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38627)==0&false)); i++) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38628);actualTypeArguments[i] = getActualType(typeParameters[i], actualTypeMap);
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38629);return new ParameterizedTypeImpl(actualTypeArguments, null, rawClass);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    private static Type getActualType(Type typeParameter, Map<TypeVariable, Type> actualTypeMap) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38630);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38631);if ((((typeParameter instanceof TypeVariable)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38632)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38633)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38634);return actualTypeMap.get(typeParameter);
        } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(38635);if ((((typeParameter instanceof ParameterizedType)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38636)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38637)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38638);return makeParameterizedType(getRawClass(typeParameter), ((ParameterizedType) typeParameter).getActualTypeArguments(), actualTypeMap);
        } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(38639);if ((((typeParameter instanceof GenericArrayType)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38640)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38641)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38642);return new GenericArrayTypeImpl(getActualType(((GenericArrayType) typeParameter).getGenericComponentType(), actualTypeMap));
        }
        }}}__CLR4_1_10s4ss4slusqjrhg.R.inc(38643);return typeParameter;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    private static Type getWildcardTypeUpperBounds(Type type) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38644);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38645);if ((((type instanceof WildcardType)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38646)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38647)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38648);WildcardType wildcardType = (WildcardType) type;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38649);Type[] upperBounds = wildcardType.getUpperBounds();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38650);return (((upperBounds.length > 0 )&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38651)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38652)==0&false))? upperBounds[0] : Object.class;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38653);return type;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Class<?> getCollectionItemClass(Type fieldType){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38654);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38655);if((((fieldType instanceof ParameterizedType)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38656)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38657)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38658);Class<?> itemClass;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38659);Type actualTypeArgument = ((ParameterizedType) fieldType).getActualTypeArguments()[0];
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38660);if((((actualTypeArgument instanceof WildcardType)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38661)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38662)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38663);WildcardType wildcardType = (WildcardType) actualTypeArgument;
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38664);Type[] upperBounds = wildcardType.getUpperBounds();
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38665);if((((upperBounds.length == 1)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38666)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38667)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38668);actualTypeArgument = upperBounds[0];
                }
            }}
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38669);if((((actualTypeArgument instanceof Class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38670)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38671)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38672);itemClass = (Class<?>) actualTypeArgument;
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38673);if((((!Modifier.isPublic(itemClass.getModifiers()))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38674)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38675)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38676);throw new JSONException("can not create ASMParser");
                }
            }} }else{{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38677);throw new JSONException("can not create ASMParser");
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38678);return itemClass;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38679);return Object.class;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Type checkPrimitiveArray(GenericArrayType genericArrayType) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38680);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38681);Type clz = genericArrayType;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38682);Type genericComponentType  = genericArrayType.getGenericComponentType();

        __CLR4_1_10s4ss4slusqjrhg.R.inc(38683);String prefix = "[";
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38684);while ((((genericComponentType instanceof GenericArrayType)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38685)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38686)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38687);genericComponentType = ((GenericArrayType) genericComponentType)
                    .getGenericComponentType();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38688);prefix += prefix;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38689);if ((((genericComponentType instanceof Class<?>)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38690)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38691)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38692);Class<?> ck = (Class<?>) genericComponentType;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38693);if ((((ck.isPrimitive())&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38694)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38695)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38696);try {
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38697);if ((((ck == boolean.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38698)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38699)==0&false))) {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38700);clz = Class.forName(prefix + "Z");
                    } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(38701);if ((((ck == char.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38702)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38703)==0&false))) {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38704);clz = Class.forName(prefix + "C");
                    } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(38705);if ((((ck == byte.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38706)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38707)==0&false))) {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38708);clz = Class.forName(prefix + "B");
                    } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(38709);if ((((ck == short.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38710)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38711)==0&false))) {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38712);clz = Class.forName(prefix + "S");
                    } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(38713);if ((((ck == int.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38714)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38715)==0&false))) {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38716);clz = Class.forName(prefix + "I");
                    } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(38717);if ((((ck == long.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38718)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38719)==0&false))) {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38720);clz = Class.forName(prefix + "J");
                    } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(38721);if ((((ck == float.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38722)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38723)==0&false))) {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38724);clz = Class.forName(prefix + "F");
                    } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(38725);if ((((ck == double.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38726)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38727)==0&false))) {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(38728);clz = Class.forName(prefix + "D");
                    }
                }}}}}}}}} catch (ClassNotFoundException e) {
                }
            }
        }}

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38729);return clz;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static Collection createCollection(Type type) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38730);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38731);Class<?> rawClass = getRawClass(type);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38732);Collection list;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38733);if((((rawClass == AbstractCollection.class //
                || rawClass == Collection.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38734)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38735)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38736);list = new ArrayList();
        } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(38737);if((((rawClass.isAssignableFrom(HashSet.class))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38738)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38739)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38740);list = new HashSet();
        } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(38741);if((((rawClass.isAssignableFrom(LinkedHashSet.class))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38742)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38743)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38744);list = new LinkedHashSet();
        } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(38745);if((((rawClass.isAssignableFrom(TreeSet.class))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38746)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38747)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38748);list = new TreeSet();
        } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(38749);if((((rawClass.isAssignableFrom(ArrayList.class))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38750)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38751)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38752);list = new ArrayList();
        } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(38753);if((((rawClass.isAssignableFrom(EnumSet.class))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38754)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38755)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38756);Type itemType;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38757);if((((type instanceof ParameterizedType)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38758)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38759)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38760);itemType = ((ParameterizedType) type).getActualTypeArguments()[0];
            } }else{{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38761);itemType = Object.class;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38762);list = EnumSet.noneOf((Class<Enum>) itemType);
        } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(38763);if((((rawClass.isAssignableFrom(Queue.class))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38764)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38765)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38766);list = new LinkedList();
        } }else{{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38767);try{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38768);list = (Collection) rawClass.newInstance();
            } catch(Exception e){
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38769);throw new JSONException("create instance error, class " + rawClass.getName());
            }
        }
        }}}}}}}__CLR4_1_10s4ss4slusqjrhg.R.inc(38770);return list;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Class<?> getRawClass(Type type){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38771);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38772);if((((type instanceof Class<?>)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38773)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38774)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38775);return (Class<?>) type;
        } }else {__CLR4_1_10s4ss4slusqjrhg.R.inc(38776);if((((type instanceof ParameterizedType)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38777)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38778)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38779);return getRawClass(((ParameterizedType) type).getRawType());
        } }else{{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38780);throw new JSONException("TODO");
        }
    }}}finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static boolean isProxy(Class<?> clazz){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38781);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38782);for(Class<?> item : clazz.getInterfaces()){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38783);String interfaceName = item.getName();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38784);if((((interfaceName.equals("net.sf.cglib.proxy.Factory") //
                    || interfaceName.equals("org.springframework.cglib.proxy.Factory"))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38785)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38786)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38787);return true;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38788);if((((interfaceName.equals("javassist.util.proxy.ProxyObject") //
                    || interfaceName.equals("org.apache.ibatis.javassist.util.proxy.ProxyObject")
                    )&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38789)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38790)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38791);return true;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38792);if ((((interfaceName.equals("org.hibernate.proxy.HibernateProxy"))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38793)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38794)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38795);return true;
            }
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38796);return false;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static boolean isTransient(Method method){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38797);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38798);if((((method == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38799)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38800)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38801);return false;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38802);if((((!transientClassInited)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38803)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38804)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38805);try{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38806);transientClass = (Class<? extends Annotation>) Class.forName("java.beans.Transient");
            } catch(Exception e){
                // skip
            } finally{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38807);transientClassInited = true;
            }
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38808);if((((transientClass != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38809)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38810)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38811);Annotation annotation = TypeUtils.getAnnotation(method, transientClass);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38812);return annotation != null;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38813);return false;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static boolean isAnnotationPresentOneToMany(Method method) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38814);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38815);if ((((method == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38816)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38817)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38818);return false;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38819);if ((((class_OneToMany == null && !class_OneToMany_error)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38820)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38821)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38822);try {
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38823);class_OneToMany = (Class<? extends Annotation>) Class.forName("javax.persistence.OneToMany");
            } catch (Throwable e) {
                // skip
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38824);class_OneToMany_error = true;
            }
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38825);return class_OneToMany != null && method.isAnnotationPresent(class_OneToMany);

    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static boolean isAnnotationPresentManyToMany(Method method) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38826);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38827);if ((((method == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38828)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38829)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38830);return false;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38831);if ((((class_ManyToMany == null && !class_ManyToMany_error)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38832)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38833)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38834);try {
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38835);class_ManyToMany = (Class<? extends Annotation>) Class.forName("javax.persistence.ManyToMany");
            } catch (Throwable e) {
                // skip
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38836);class_ManyToMany_error = true;
            }
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38837);return class_ManyToMany != null && (method.isAnnotationPresent(class_OneToMany) || method.isAnnotationPresent(class_ManyToMany));

    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static boolean isHibernateInitialized(Object object){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38838);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38839);if((((object == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38840)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38841)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38842);return false;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38843);if((((method_HibernateIsInitialized == null && !method_HibernateIsInitialized_error)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38844)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38845)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38846);try{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38847);Class<?> class_Hibernate = Class.forName("org.hibernate.Hibernate");
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38848);method_HibernateIsInitialized = class_Hibernate.getMethod("isInitialized", Object.class);
            } catch(Throwable e){
                // skip
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38849);method_HibernateIsInitialized_error = true;
            }
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38850);if((((method_HibernateIsInitialized != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38851)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38852)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38853);try{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38854);Boolean initialized = (Boolean) method_HibernateIsInitialized.invoke(null, object);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38855);return initialized.booleanValue();
            } catch(Throwable e){
                // skip
            }
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38856);return true;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static double parseDouble(String str) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38857);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38858);final int len = str.length();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38859);if ((((len > 10)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38860)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38861)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38862);return Double.parseDouble(str);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38863);boolean negative = false;

        __CLR4_1_10s4ss4slusqjrhg.R.inc(38864);long longValue = 0;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38865);int scale = 0;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38866);for (int i = 0; (((i < len)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38867)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38868)==0&false)); ++i) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38869);char ch = str.charAt(i);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38870);if ((((ch == '-' && i == 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38871)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38872)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38873);negative = true;
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38874);continue;
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38875);if ((((ch == '.')&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38876)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38877)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38878);if ((((scale != 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38879)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38880)==0&false))) {{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38881);return Double.parseDouble(str);
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38882);scale = len - i - 1;
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38883);continue;
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38884);if ((((ch >= '0' && ch <= '9')&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38885)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38886)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38887);int digit = ch - '0';
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38888);longValue = longValue * 10 + digit;
            } }else {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38889);return Double.parseDouble(str);
            }
        }}

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38890);if ((((negative)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38891)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38892)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38893);longValue = -longValue;
        }

        }boolean __CLB4_1_10_bool0=false;__CLR4_1_10s4ss4slusqjrhg.R.inc(38894);switch (scale) {
            case 0:if (!__CLB4_1_10_bool0) {__CLR4_1_10s4ss4slusqjrhg.R.inc(38895);__CLB4_1_10_bool0=true;}
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38896);return (double) longValue;
            case 1:if (!__CLB4_1_10_bool0) {__CLR4_1_10s4ss4slusqjrhg.R.inc(38897);__CLB4_1_10_bool0=true;}
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38898);return ((double) longValue) / 10;
            case 2:if (!__CLB4_1_10_bool0) {__CLR4_1_10s4ss4slusqjrhg.R.inc(38899);__CLB4_1_10_bool0=true;}
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38900);return ((double) longValue) / 100;
            case 3:if (!__CLB4_1_10_bool0) {__CLR4_1_10s4ss4slusqjrhg.R.inc(38901);__CLB4_1_10_bool0=true;}
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38902);return ((double) longValue) / 1000;
            case 4:if (!__CLB4_1_10_bool0) {__CLR4_1_10s4ss4slusqjrhg.R.inc(38903);__CLB4_1_10_bool0=true;}
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38904);return ((double) longValue) / 10000;
            case 5:if (!__CLB4_1_10_bool0) {__CLR4_1_10s4ss4slusqjrhg.R.inc(38905);__CLB4_1_10_bool0=true;}
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38906);return ((double) longValue) / 100000;
            case 6:if (!__CLB4_1_10_bool0) {__CLR4_1_10s4ss4slusqjrhg.R.inc(38907);__CLB4_1_10_bool0=true;}
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38908);return ((double) longValue) / 1000000;
            case 7:if (!__CLB4_1_10_bool0) {__CLR4_1_10s4ss4slusqjrhg.R.inc(38909);__CLB4_1_10_bool0=true;}
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38910);return ((double) longValue) / 10000000;
            case 8:if (!__CLB4_1_10_bool0) {__CLR4_1_10s4ss4slusqjrhg.R.inc(38911);__CLB4_1_10_bool0=true;}
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38912);return ((double) longValue) / 100000000;
            case 9:if (!__CLB4_1_10_bool0) {__CLR4_1_10s4ss4slusqjrhg.R.inc(38913);__CLB4_1_10_bool0=true;}
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38914);return ((double) longValue) / 1000000000;
        }

        __CLR4_1_10s4ss4slusqjrhg.R.inc(38915);return Double.parseDouble(str);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static float parseFloat(String str) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38916);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38917);final int len = str.length();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38918);if ((((len >= 10)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38919)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38920)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38921);return Float.parseFloat(str);
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38922);boolean negative = false;

        __CLR4_1_10s4ss4slusqjrhg.R.inc(38923);long longValue = 0;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38924);int scale = 0;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38925);for (int i = 0; (((i < len)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38926)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38927)==0&false)); ++i) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38928);char ch = str.charAt(i);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38929);if ((((ch == '-' && i == 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38930)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38931)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38932);negative = true;
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38933);continue;
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38934);if ((((ch == '.')&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38935)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38936)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38937);if ((((scale != 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38938)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38939)==0&false))) {{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(38940);return Float.parseFloat(str);
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(38941);scale = len - i - 1;
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38942);continue;
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38943);if ((((ch >= '0' && ch <= '9')&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38944)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38945)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38946);int digit = ch - '0';
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38947);longValue = longValue * 10 + digit;
            } }else {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38948);return Float.parseFloat(str);
            }
        }}

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38949);if ((((negative)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38950)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38951)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38952);longValue = -longValue;
        }

        }boolean __CLB4_1_10_bool1=false;__CLR4_1_10s4ss4slusqjrhg.R.inc(38953);switch (scale) {
            case 0:if (!__CLB4_1_10_bool1) {__CLR4_1_10s4ss4slusqjrhg.R.inc(38954);__CLB4_1_10_bool1=true;}
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38955);return (float) longValue;
            case 1:if (!__CLB4_1_10_bool1) {__CLR4_1_10s4ss4slusqjrhg.R.inc(38956);__CLB4_1_10_bool1=true;}
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38957);return ((float) longValue) / 10;
            case 2:if (!__CLB4_1_10_bool1) {__CLR4_1_10s4ss4slusqjrhg.R.inc(38958);__CLB4_1_10_bool1=true;}
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38959);return ((float) longValue) / 100;
            case 3:if (!__CLB4_1_10_bool1) {__CLR4_1_10s4ss4slusqjrhg.R.inc(38960);__CLB4_1_10_bool1=true;}
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38961);return ((float) longValue) / 1000;
            case 4:if (!__CLB4_1_10_bool1) {__CLR4_1_10s4ss4slusqjrhg.R.inc(38962);__CLB4_1_10_bool1=true;}
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38963);return ((float) longValue) / 10000;
            case 5:if (!__CLB4_1_10_bool1) {__CLR4_1_10s4ss4slusqjrhg.R.inc(38964);__CLB4_1_10_bool1=true;}
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38965);return ((float) longValue) / 100000;
            case 6:if (!__CLB4_1_10_bool1) {__CLR4_1_10s4ss4slusqjrhg.R.inc(38966);__CLB4_1_10_bool1=true;}
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38967);return ((float) longValue) / 1000000;
            case 7:if (!__CLB4_1_10_bool1) {__CLR4_1_10s4ss4slusqjrhg.R.inc(38968);__CLB4_1_10_bool1=true;}
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38969);return ((float) longValue) / 10000000;
            case 8:if (!__CLB4_1_10_bool1) {__CLR4_1_10s4ss4slusqjrhg.R.inc(38970);__CLB4_1_10_bool1=true;}
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38971);return ((float) longValue) / 100000000;
            case 9:if (!__CLB4_1_10_bool1) {__CLR4_1_10s4ss4slusqjrhg.R.inc(38972);__CLB4_1_10_bool1=true;}
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38973);return ((float) longValue) / 1000000000;
        }

        __CLR4_1_10s4ss4slusqjrhg.R.inc(38974);return Float.parseFloat(str);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static long fnv1a_64_lower(String key){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38975);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38976);long hashCode = 0xcbf29ce484222325L;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38977);for(int i = 0; (((i < key.length())&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38978)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38979)==0&false)); ++i){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38980);char ch = key.charAt(i);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38981);if((((ch == '_' || ch == '-')&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38982)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38983)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38984);continue;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38985);if((((ch >= 'A' && ch <= 'Z')&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38986)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38987)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(38988);ch = (char) (ch + 32);
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(38989);hashCode ^= ch;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38990);hashCode *= 0x100000001b3L;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(38991);return hashCode;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static long fnv1a_64(String key){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(38992);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38993);long hashCode = 0xcbf29ce484222325L;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(38994);for(int i = 0; (((i < key.length())&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(38995)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(38996)==0&false)); ++i){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38997);char ch = key.charAt(i);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38998);hashCode ^= ch;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(38999);hashCode *= 0x100000001b3L;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39000);return hashCode;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static boolean isKotlin(Class clazz) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(39001);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39002);if ((((kotlin_metadata == null && !kotlin_metadata_error)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39003)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39004)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39005);try {
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39006);kotlin_metadata = Class.forName("kotlin.Metadata");
            } catch (Throwable e) {
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39007);kotlin_metadata_error = true;
            }
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39008);return kotlin_metadata != null && clazz.isAnnotationPresent(kotlin_metadata);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Constructor getKoltinConstructor(Constructor[] constructors){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(39009);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39010);return getKoltinConstructor(constructors, null);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Constructor getKoltinConstructor(Constructor[] constructors, String[] paramNames){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(39011);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39012);Constructor creatorConstructor = null;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39013);for(Constructor<?> constructor : constructors){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39014);Class<?>[] parameterTypes = constructor.getParameterTypes();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39015);if ((((paramNames != null && parameterTypes.length != paramNames.length)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39016)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39017)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39018);continue;
            }

            }__CLR4_1_10s4ss4slusqjrhg.R.inc(39019);if((((parameterTypes.length > 0 && parameterTypes[parameterTypes.length - 1].getName().equals("kotlin.jvm.internal.DefaultConstructorMarker"))&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39020)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39021)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39022);continue;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(39023);if((((creatorConstructor != null && creatorConstructor.getParameterTypes().length >= parameterTypes.length)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39024)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39025)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39026);continue;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(39027);creatorConstructor = constructor;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39028);return creatorConstructor;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static String[] getKoltinConstructorParameters(Class clazz){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(39029);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39030);if((((kotlin_kclass_constructor == null && !kotlin_class_klass_error)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39031)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39032)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39033);try{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39034);Class class_kotlin_kclass = Class.forName("kotlin.reflect.jvm.internal.KClassImpl");
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39035);kotlin_kclass_constructor = class_kotlin_kclass.getConstructor(Class.class);
            } catch(Throwable e){
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39036);kotlin_class_klass_error = true;
            }
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39037);if ((((kotlin_kclass_constructor == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39038)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39039)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39040);return null;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39041);if ((((kotlin_kclass_getConstructors == null && !kotlin_class_klass_error)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39042)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39043)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39044);try{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39045);Class class_kotlin_kclass = Class.forName("kotlin.reflect.jvm.internal.KClassImpl");
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39046);kotlin_kclass_getConstructors = class_kotlin_kclass.getMethod("getConstructors");
            } catch(Throwable e){
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39047);kotlin_class_klass_error = true;
            }
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39048);if ((((kotlin_kfunction_getParameters == null && !kotlin_class_klass_error)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39049)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39050)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39051);try{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39052);Class class_kotlin_kfunction = Class.forName("kotlin.reflect.KFunction");
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39053);kotlin_kfunction_getParameters = class_kotlin_kfunction.getMethod("getParameters");
            } catch(Throwable e){
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39054);kotlin_class_klass_error = true;
            }
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39055);if ((((kotlin_kparameter_getName == null && !kotlin_class_klass_error)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39056)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39057)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39058);try{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39059);Class class_kotlinn_kparameter = Class.forName("kotlin.reflect.KParameter");
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39060);kotlin_kparameter_getName = class_kotlinn_kparameter.getMethod("getName");
            } catch(Throwable e){
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39061);kotlin_class_klass_error = true;
            }
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39062);if ((((kotlin_error)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39063)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39064)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39065);return null;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39066);try{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39067);Object constructor = null;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39068);Object kclassImpl = kotlin_kclass_constructor.newInstance(clazz);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39069);Iterable it = (Iterable) kotlin_kclass_getConstructors.invoke(kclassImpl);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39070);for(Iterator iterator = it.iterator(); (((iterator.hasNext())&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39071)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39072)==0&false)); iterator.hasNext()){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39073);Object item = iterator.next();
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39074);List parameters = (List) kotlin_kfunction_getParameters.invoke(item);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39075);if ((((constructor != null && parameters.size() == 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39076)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39077)==0&false))) {{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(39078);continue;
                }
                }__CLR4_1_10s4ss4slusqjrhg.R.inc(39079);constructor = item;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(39080);List parameters = (List) kotlin_kfunction_getParameters.invoke(constructor);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39081);String[] names = new String[parameters.size()];
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39082);for(int i = 0; (((i < parameters.size())&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39083)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39084)==0&false)); i++){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39085);Object param = parameters.get(i);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39086);names[i] = (String) kotlin_kparameter_getName.invoke(param);
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(39087);return names;
        } catch(Throwable e){
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39088);e.printStackTrace();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39089);kotlin_error = true;
        }
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39090);return null;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    private static boolean isKotlinIgnore(Class clazz, String methodName) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(39091);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39092);if ((((kotlinIgnores == null && !kotlinIgnores_error)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39093)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39094)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39095);try {
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39096);Map<Class, String[]> map = new HashMap<Class, String[]>();
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39097);Class charRangeClass = Class.forName("kotlin.ranges.CharRange");
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39098);map.put(charRangeClass, new String[]{"getEndInclusive", "isEmpty"});
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39099);Class intRangeClass = Class.forName("kotlin.ranges.IntRange");
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39100);map.put(intRangeClass, new String[]{"getEndInclusive", "isEmpty"});
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39101);Class longRangeClass = Class.forName("kotlin.ranges.LongRange");
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39102);map.put(longRangeClass, new String[]{"getEndInclusive", "isEmpty"});
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39103);Class floatRangeClass = Class.forName("kotlin.ranges.ClosedFloatRange");
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39104);map.put(floatRangeClass, new String[]{"getEndInclusive", "isEmpty"});
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39105);Class doubleRangeClass = Class.forName("kotlin.ranges.ClosedDoubleRange");
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39106);map.put(doubleRangeClass, new String[]{"getEndInclusive", "isEmpty"});
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39107);kotlinIgnores = map;
            } catch (Throwable error) {
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39108);kotlinIgnores_error = true;
            }
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39109);if ((((kotlinIgnores == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39110)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39111)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39112);return false;
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39113);String[] ignores = kotlinIgnores.get(clazz);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39114);return ignores != null && Arrays.binarySearch(ignores, methodName) >= 0;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static <A extends Annotation> A getAnnotation(Class<?> targetClass, Class<A> annotationClass){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(39115);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39116);A targetAnnotation = targetClass.getAnnotation(annotationClass);

        __CLR4_1_10s4ss4slusqjrhg.R.inc(39117);Class<?> mixInClass = null;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39118);Type type = JSON.getMixInAnnotations(targetClass);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39119);if ((((type instanceof Class<?>)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39120)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39121)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39122);mixInClass = (Class<?>) type;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39123);if((((mixInClass != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39124)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39125)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39126);A mixInAnnotation = mixInClass.getAnnotation(annotationClass);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39127);if((((mixInAnnotation == null && mixInClass.getAnnotations().length > 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39128)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39129)==0&false))){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39130);for(Annotation annotation : mixInClass.getAnnotations()){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(39131);mixInAnnotation = annotation.annotationType().getAnnotation(annotationClass);
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(39132);if((((mixInAnnotation != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39133)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39134)==0&false))){{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(39135);break;
                    }
                }}
            }}
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(39136);if ((((mixInAnnotation != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39137)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39138)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39139);return mixInAnnotation;
            }
        }}

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39140);if((((targetAnnotation == null && targetClass.getAnnotations().length > 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39141)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39142)==0&false))){{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39143);for(Annotation annotation : targetClass.getAnnotations()){{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39144);targetAnnotation = annotation.annotationType().getAnnotation(annotationClass);
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39145);if((((targetAnnotation != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39146)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39147)==0&false))){{
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(39148);break;
                }
            }}
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39149);return targetAnnotation;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static <A extends Annotation> A getAnnotation(Field field, Class<A> annotationClass){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(39150);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39151);A targetAnnotation = field.getAnnotation(annotationClass);

        __CLR4_1_10s4ss4slusqjrhg.R.inc(39152);Class<?> clazz = field.getDeclaringClass();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39153);A mixInAnnotation;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39154);Class<?> mixInClass = null;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39155);Type type = JSON.getMixInAnnotations(clazz);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39156);if ((((type instanceof Class<?>)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39157)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39158)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39159);mixInClass = (Class<?>) type;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39160);if ((((mixInClass != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39161)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39162)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39163);Field mixInField = null;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39164);String fieldName = field.getName();
            // \u9012\u5f52\u4eceMixIn\u7c7b\u7684\u7236\u7c7b\u4e2d\u67e5\u627e\u6ce8\u89e3\uff08\u5982\u679c\u6709\u7236\u7c7b\u7684\u8bdd\uff09
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39165);for (Class<?> currClass = mixInClass; (((currClass != null && currClass != Object.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39166)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39167)==0&false));
                 currClass = currClass.getSuperclass()) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39168);try {
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(39169);mixInField = currClass.getDeclaredField(fieldName);
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(39170);break;
                } catch (NoSuchFieldException e) {
                    // skip
                }
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(39171);if ((((mixInField == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39172)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39173)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39174);return targetAnnotation;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(39175);mixInAnnotation = mixInField.getAnnotation(annotationClass);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39176);if ((((mixInAnnotation != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39177)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39178)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39179);return mixInAnnotation;
            }
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39180);return targetAnnotation;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static <A extends Annotation> A getAnnotation(Method method, Class<A> annotationClass){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(39181);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39182);A targetAnnotation = method.getAnnotation(annotationClass);

        __CLR4_1_10s4ss4slusqjrhg.R.inc(39183);Class<?> clazz = method.getDeclaringClass();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39184);A mixInAnnotation;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39185);Class<?> mixInClass = null;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39186);Type type = JSON.getMixInAnnotations(clazz);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39187);if ((((type instanceof Class<?>)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39188)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39189)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39190);mixInClass = (Class<?>) type;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39191);if ((((mixInClass != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39192)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39193)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39194);Method mixInMethod = null;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39195);String methodName = method.getName();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39196);Class<?>[] parameterTypes = method.getParameterTypes();
            // \u9012\u5f52\u4eceMixIn\u7c7b\u7684\u7236\u7c7b\u4e2d\u67e5\u627e\u6ce8\u89e3\uff08\u5982\u679c\u6709\u7236\u7c7b\u7684\u8bdd\uff09
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39197);for (Class<?> currClass = mixInClass; (((currClass != null && currClass != Object.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39198)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39199)==0&false));
                 currClass = currClass.getSuperclass()) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39200);try {
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(39201);mixInMethod = currClass.getDeclaredMethod(methodName, parameterTypes);
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(39202);break;
                } catch (NoSuchMethodException e) {
                    // skip
                }
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(39203);if ((((mixInMethod == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39204)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39205)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39206);return targetAnnotation;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(39207);mixInAnnotation = mixInMethod.getAnnotation(annotationClass);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39208);if ((((mixInAnnotation != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39209)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39210)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39211);return mixInAnnotation;
            }
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39212);return targetAnnotation;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Annotation[][] getParameterAnnotations(Method method){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(39213);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39214);Annotation[][] targetAnnotations = method.getParameterAnnotations();

        __CLR4_1_10s4ss4slusqjrhg.R.inc(39215);Class<?> clazz = method.getDeclaringClass();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39216);Annotation[][] mixInAnnotations;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39217);Class<?> mixInClass = null;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39218);Type type = JSON.getMixInAnnotations(clazz);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39219);if ((((type instanceof Class<?>)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39220)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39221)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39222);mixInClass = (Class<?>) type;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39223);if ((((mixInClass != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39224)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39225)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39226);Method mixInMethod = null;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39227);String methodName = method.getName();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39228);Class<?>[] parameterTypes = method.getParameterTypes();
            // \u9012\u5f52\u4eceMixIn\u7c7b\u7684\u7236\u7c7b\u4e2d\u67e5\u627e\u6ce8\u89e3\uff08\u5982\u679c\u6709\u7236\u7c7b\u7684\u8bdd\uff09
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39229);for (Class<?> currClass = mixInClass; (((currClass != null && currClass != Object.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39230)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39231)==0&false));
                 currClass = currClass.getSuperclass()) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39232);try {
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(39233);mixInMethod = currClass.getDeclaredMethod(methodName, parameterTypes);
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(39234);break;
                } catch (NoSuchMethodException e) {
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(39235);continue;
                }
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(39236);if ((((mixInMethod == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39237)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39238)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39239);return targetAnnotations;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(39240);mixInAnnotations = mixInMethod.getParameterAnnotations();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39241);if ((((mixInAnnotations != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39242)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39243)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39244);return mixInAnnotations;
            }
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39245);return targetAnnotations;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static Annotation[][] getParameterAnnotations(Constructor constructor){try{__CLR4_1_10s4ss4slusqjrhg.R.inc(39246);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39247);Annotation[][] targetAnnotations = constructor.getParameterAnnotations();

        __CLR4_1_10s4ss4slusqjrhg.R.inc(39248);Class<?> clazz = constructor.getDeclaringClass();
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39249);Annotation[][] mixInAnnotations;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39250);Class<?> mixInClass = null;
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39251);Type type = JSON.getMixInAnnotations(clazz);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39252);if ((((type instanceof Class<?>)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39253)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39254)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39255);mixInClass = (Class<?>) type;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39256);if ((((mixInClass != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39257)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39258)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39259);Constructor mixInConstructor = null;
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39260);Class<?>[] parameterTypes = constructor.getParameterTypes();
            // \u6784\u5efa\u53c2\u6570\u5217\u8868\uff0c\u56e0\u4e3a\u5185\u90e8\u7c7b\u7684\u6784\u9020\u51fd\u6570\u9700\u8981\u4f20\u5165\u5916\u90e8\u7c7b\u7684\u5f15\u7528
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39261);List<Class<?>> enclosingClasses = new ArrayList<Class<?>>(2);
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39262);for (Class<?> enclosingClass = mixInClass.getEnclosingClass(); (((enclosingClass != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39263)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39264)==0&false)); enclosingClass = enclosingClass.getEnclosingClass()) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39265);enclosingClasses.add(enclosingClass);
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(39266);int level = enclosingClasses.size();
            // \u9012\u5f52\u4eceMixIn\u7c7b\u7684\u7236\u7c7b\u4e2d\u67e5\u627e\u6ce8\u89e3\uff08\u5982\u679c\u6709\u7236\u7c7b\u7684\u8bdd\uff09
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39267);for (Class<?> currClass = mixInClass; (((currClass != null && currClass != Object.class)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39268)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39269)==0&false));
                 currClass = currClass.getSuperclass()) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39270);try {
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(39271);if ((((level != 0)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39272)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39273)==0&false))) {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(39274);Class<?>[] outerClassAndParameterTypes = new Class[level + parameterTypes.length];
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(39275);System.arraycopy(parameterTypes, 0, outerClassAndParameterTypes, level, parameterTypes.length);
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(39276);for (int i = level; (((i > 0 )&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39277)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39278)==0&false)); i--) {{
                            __CLR4_1_10s4ss4slusqjrhg.R.inc(39279);outerClassAndParameterTypes[i - 1] = enclosingClasses.get(i - 1);
                        }
                        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39280);mixInConstructor = mixInClass.getDeclaredConstructor(outerClassAndParameterTypes);
                    } }else {{
                        __CLR4_1_10s4ss4slusqjrhg.R.inc(39281);mixInConstructor = mixInClass.getDeclaredConstructor(parameterTypes);
                    }
                    }__CLR4_1_10s4ss4slusqjrhg.R.inc(39282);break;
                } catch (NoSuchMethodException e) {
                    __CLR4_1_10s4ss4slusqjrhg.R.inc(39283);level--;
                }
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(39284);if ((((mixInConstructor == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39285)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39286)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39287);return targetAnnotations;
            }
            }__CLR4_1_10s4ss4slusqjrhg.R.inc(39288);mixInAnnotations = mixInConstructor.getParameterAnnotations();
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39289);if ((((mixInAnnotations != null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39290)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39291)==0&false))) {{
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39292);return mixInAnnotations;
            }
        }}
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39293);return targetAnnotations;
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}

    public static boolean isJacksonCreator(Method method) {try{__CLR4_1_10s4ss4slusqjrhg.R.inc(39294);
        __CLR4_1_10s4ss4slusqjrhg.R.inc(39295);if ((((method == null)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39296)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39297)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39298);return false;
        }

        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39299);if ((((class_JacksonCreator == null && !class_JacksonCreator_error)&&(__CLR4_1_10s4ss4slusqjrhg.R.iget(39300)!=0|true))||(__CLR4_1_10s4ss4slusqjrhg.R.iget(39301)==0&false))) {{
            __CLR4_1_10s4ss4slusqjrhg.R.inc(39302);try {
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39303);class_JacksonCreator = (Class<? extends Annotation>) Class.forName("com.fasterxml.jackson.annotation.JsonCreator");
            } catch (Throwable e) {
                // skip
                __CLR4_1_10s4ss4slusqjrhg.R.inc(39304);class_JacksonCreator_error = true;
            }
        }
        }__CLR4_1_10s4ss4slusqjrhg.R.inc(39305);return class_JacksonCreator != null && method.isAnnotationPresent(class_JacksonCreator);
    }finally{__CLR4_1_10s4ss4slusqjrhg.R.flushNeeded();}}
}
