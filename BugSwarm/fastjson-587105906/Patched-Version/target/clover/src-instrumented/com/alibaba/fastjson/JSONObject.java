/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
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
package com.alibaba.fastjson;

import static com.alibaba.fastjson.util.TypeUtils.castToBigDecimal;
import static com.alibaba.fastjson.util.TypeUtils.castToBigInteger;
import static com.alibaba.fastjson.util.TypeUtils.castToBoolean;
import static com.alibaba.fastjson.util.TypeUtils.castToByte;
import static com.alibaba.fastjson.util.TypeUtils.castToBytes;
import static com.alibaba.fastjson.util.TypeUtils.castToDate;
import static com.alibaba.fastjson.util.TypeUtils.castToDouble;
import static com.alibaba.fastjson.util.TypeUtils.castToFloat;
import static com.alibaba.fastjson.util.TypeUtils.castToInt;
import static com.alibaba.fastjson.util.TypeUtils.castToLong;
import static com.alibaba.fastjson.util.TypeUtils.castToShort;
import static com.alibaba.fastjson.util.TypeUtils.castToSqlDate;
import static com.alibaba.fastjson.util.TypeUtils.castToTimestamp;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.TypeUtils;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class JSONObject extends JSON implements Map<String, Object>, Cloneable, Serializable, InvocationHandler {public static class __CLR4_5_2pypylusyjhrg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,1334,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long         serialVersionUID         = 1L;
    private static final int          DEFAULT_INITIAL_CAPACITY = 16;

    private final Map<String, Object> map;

    public JSONObject(){
        this(DEFAULT_INITIAL_CAPACITY, false);__CLR4_5_2pypylusyjhrg.R.inc(935);try{__CLR4_5_2pypylusyjhrg.R.inc(934);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public JSONObject(Map<String, Object> map){try{__CLR4_5_2pypylusyjhrg.R.inc(936);
        __CLR4_5_2pypylusyjhrg.R.inc(937);if ((((map == null)&&(__CLR4_5_2pypylusyjhrg.R.iget(938)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(939)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(940);throw new IllegalArgumentException("map is null.");
        }
        }__CLR4_5_2pypylusyjhrg.R.inc(941);this.map = map;
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public JSONObject(boolean ordered){
        this(DEFAULT_INITIAL_CAPACITY, ordered);__CLR4_5_2pypylusyjhrg.R.inc(943);try{__CLR4_5_2pypylusyjhrg.R.inc(942);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public JSONObject(int initialCapacity){
        this(initialCapacity, false);__CLR4_5_2pypylusyjhrg.R.inc(945);try{__CLR4_5_2pypylusyjhrg.R.inc(944);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public JSONObject(int initialCapacity, boolean ordered){try{__CLR4_5_2pypylusyjhrg.R.inc(946);
        __CLR4_5_2pypylusyjhrg.R.inc(947);if ((((ordered)&&(__CLR4_5_2pypylusyjhrg.R.iget(948)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(949)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(950);map = new LinkedHashMap<String, Object>(initialCapacity);
        } }else {{
            __CLR4_5_2pypylusyjhrg.R.inc(951);map = new HashMap<String, Object>(initialCapacity);
        }
    }}finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public int size() {try{__CLR4_5_2pypylusyjhrg.R.inc(952);
        __CLR4_5_2pypylusyjhrg.R.inc(953);return map.size();
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public boolean isEmpty() {try{__CLR4_5_2pypylusyjhrg.R.inc(954);
        __CLR4_5_2pypylusyjhrg.R.inc(955);return map.isEmpty();
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public boolean containsKey(Object key) {try{__CLR4_5_2pypylusyjhrg.R.inc(956);
        __CLR4_5_2pypylusyjhrg.R.inc(957);return map.containsKey(key);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public boolean containsValue(Object value) {try{__CLR4_5_2pypylusyjhrg.R.inc(958);
        __CLR4_5_2pypylusyjhrg.R.inc(959);return map.containsValue(value);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public Object get(Object key) {try{__CLR4_5_2pypylusyjhrg.R.inc(960);
        __CLR4_5_2pypylusyjhrg.R.inc(961);Object val = map.get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(962);if ((((val == null && key instanceof Number)&&(__CLR4_5_2pypylusyjhrg.R.iget(963)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(964)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(965);val = map.get(key.toString());
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(966);return val;
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public JSONObject getJSONObject(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(967);
        __CLR4_5_2pypylusyjhrg.R.inc(968);Object value = map.get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(969);if ((((value instanceof JSONObject)&&(__CLR4_5_2pypylusyjhrg.R.iget(970)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(971)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(972);return (JSONObject) value;
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(973);if ((((value instanceof Map)&&(__CLR4_5_2pypylusyjhrg.R.iget(974)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(975)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(976);return new JSONObject((Map) value);
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(977);if ((((value instanceof String)&&(__CLR4_5_2pypylusyjhrg.R.iget(978)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(979)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(980);return JSON.parseObject((String) value);
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(981);return (JSONObject) toJSON(value);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public JSONArray getJSONArray(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(982);
        __CLR4_5_2pypylusyjhrg.R.inc(983);Object value = map.get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(984);if ((((value instanceof JSONArray)&&(__CLR4_5_2pypylusyjhrg.R.iget(985)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(986)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(987);return (JSONArray) value;
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(988);if ((((value instanceof List)&&(__CLR4_5_2pypylusyjhrg.R.iget(989)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(990)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(991);return new JSONArray((List) value);
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(992);if ((((value instanceof String)&&(__CLR4_5_2pypylusyjhrg.R.iget(993)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(994)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(995);return (JSONArray) JSON.parse((String) value);
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(996);return (JSONArray) toJSON(value);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public <T> T getObject(String key, Class<T> clazz) {try{__CLR4_5_2pypylusyjhrg.R.inc(997);
        __CLR4_5_2pypylusyjhrg.R.inc(998);Object obj = map.get(key);
        __CLR4_5_2pypylusyjhrg.R.inc(999);return TypeUtils.castToJavaBean(obj, clazz);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public <T> T getObject(String key, Type type) {try{__CLR4_5_2pypylusyjhrg.R.inc(1000);
        __CLR4_5_2pypylusyjhrg.R.inc(1001);Object obj = map.get(key);
        __CLR4_5_2pypylusyjhrg.R.inc(1002);return TypeUtils.cast(obj, type, ParserConfig.getGlobalInstance());
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public <T> T getObject(String key, TypeReference typeReference) {try{__CLR4_5_2pypylusyjhrg.R.inc(1003);
        __CLR4_5_2pypylusyjhrg.R.inc(1004);Object obj = map.get(key);
        __CLR4_5_2pypylusyjhrg.R.inc(1005);if ((((typeReference == null)&&(__CLR4_5_2pypylusyjhrg.R.iget(1006)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1007)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(1008);return (T) obj;
        }
        }__CLR4_5_2pypylusyjhrg.R.inc(1009);return TypeUtils.cast(obj, typeReference.getType(), ParserConfig.getGlobalInstance());
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public Boolean getBoolean(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1010);
        __CLR4_5_2pypylusyjhrg.R.inc(1011);Object value = get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(1012);if ((((value == null)&&(__CLR4_5_2pypylusyjhrg.R.iget(1013)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1014)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(1015);return null;
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(1016);return castToBoolean(value);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public byte[] getBytes(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1017);
        __CLR4_5_2pypylusyjhrg.R.inc(1018);Object value = get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(1019);if ((((value == null)&&(__CLR4_5_2pypylusyjhrg.R.iget(1020)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1021)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(1022);return null;
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(1023);return castToBytes(value);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public boolean getBooleanValue(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1024);
        __CLR4_5_2pypylusyjhrg.R.inc(1025);Object value = get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(1026);Boolean booleanVal = castToBoolean(value);
        __CLR4_5_2pypylusyjhrg.R.inc(1027);if ((((booleanVal == null)&&(__CLR4_5_2pypylusyjhrg.R.iget(1028)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1029)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(1030);return false;
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(1031);return booleanVal.booleanValue();
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public Byte getByte(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1032);
        __CLR4_5_2pypylusyjhrg.R.inc(1033);Object value = get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(1034);return castToByte(value);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public byte getByteValue(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1035);
        __CLR4_5_2pypylusyjhrg.R.inc(1036);Object value = get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(1037);Byte byteVal = castToByte(value);
        __CLR4_5_2pypylusyjhrg.R.inc(1038);if ((((byteVal == null)&&(__CLR4_5_2pypylusyjhrg.R.iget(1039)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1040)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(1041);return 0;
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(1042);return byteVal.byteValue();
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public Short getShort(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1043);
        __CLR4_5_2pypylusyjhrg.R.inc(1044);Object value = get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(1045);return castToShort(value);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public short getShortValue(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1046);
        __CLR4_5_2pypylusyjhrg.R.inc(1047);Object value = get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(1048);Short shortVal = castToShort(value);
        __CLR4_5_2pypylusyjhrg.R.inc(1049);if ((((shortVal == null)&&(__CLR4_5_2pypylusyjhrg.R.iget(1050)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1051)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(1052);return 0;
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(1053);return shortVal.shortValue();
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public Integer getInteger(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1054);
        __CLR4_5_2pypylusyjhrg.R.inc(1055);Object value = get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(1056);return castToInt(value);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public int getIntValue(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1057);
        __CLR4_5_2pypylusyjhrg.R.inc(1058);Object value = get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(1059);Integer intVal = castToInt(value);
        __CLR4_5_2pypylusyjhrg.R.inc(1060);if ((((intVal == null)&&(__CLR4_5_2pypylusyjhrg.R.iget(1061)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1062)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(1063);return 0;
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(1064);return intVal.intValue();
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public Long getLong(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1065);
        __CLR4_5_2pypylusyjhrg.R.inc(1066);Object value = get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(1067);return castToLong(value);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public long getLongValue(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1068);
        __CLR4_5_2pypylusyjhrg.R.inc(1069);Object value = get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(1070);Long longVal = castToLong(value);
        __CLR4_5_2pypylusyjhrg.R.inc(1071);if ((((longVal == null)&&(__CLR4_5_2pypylusyjhrg.R.iget(1072)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1073)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(1074);return 0L;
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(1075);return longVal.longValue();
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public Float getFloat(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1076);
        __CLR4_5_2pypylusyjhrg.R.inc(1077);Object value = get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(1078);return castToFloat(value);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public float getFloatValue(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1079);
        __CLR4_5_2pypylusyjhrg.R.inc(1080);Object value = get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(1081);Float floatValue = castToFloat(value);
        __CLR4_5_2pypylusyjhrg.R.inc(1082);if ((((floatValue == null)&&(__CLR4_5_2pypylusyjhrg.R.iget(1083)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1084)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(1085);return 0F;
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(1086);return floatValue.floatValue();
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public Double getDouble(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1087);
        __CLR4_5_2pypylusyjhrg.R.inc(1088);Object value = get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(1089);return castToDouble(value);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public double getDoubleValue(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1090);
        __CLR4_5_2pypylusyjhrg.R.inc(1091);Object value = get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(1092);Double doubleValue = castToDouble(value);
        __CLR4_5_2pypylusyjhrg.R.inc(1093);if ((((doubleValue == null)&&(__CLR4_5_2pypylusyjhrg.R.iget(1094)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1095)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(1096);return 0D;
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(1097);return doubleValue.doubleValue();
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public BigDecimal getBigDecimal(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1098);
        __CLR4_5_2pypylusyjhrg.R.inc(1099);Object value = get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(1100);return castToBigDecimal(value);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public BigInteger getBigInteger(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1101);
        __CLR4_5_2pypylusyjhrg.R.inc(1102);Object value = get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(1103);return castToBigInteger(value);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public String getString(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1104);
        __CLR4_5_2pypylusyjhrg.R.inc(1105);Object value = get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(1106);if ((((value == null)&&(__CLR4_5_2pypylusyjhrg.R.iget(1107)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1108)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(1109);return null;
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(1110);return value.toString();
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public Date getDate(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1111);
        __CLR4_5_2pypylusyjhrg.R.inc(1112);Object value = get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(1113);return castToDate(value);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public java.sql.Date getSqlDate(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1114);
        __CLR4_5_2pypylusyjhrg.R.inc(1115);Object value = get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(1116);return castToSqlDate(value);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public java.sql.Timestamp getTimestamp(String key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1117);
        __CLR4_5_2pypylusyjhrg.R.inc(1118);Object value = get(key);

        __CLR4_5_2pypylusyjhrg.R.inc(1119);return castToTimestamp(value);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public Object put(String key, Object value) {try{__CLR4_5_2pypylusyjhrg.R.inc(1120);
        __CLR4_5_2pypylusyjhrg.R.inc(1121);return map.put(key, value);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public JSONObject fluentPut(String key, Object value) {try{__CLR4_5_2pypylusyjhrg.R.inc(1122);
        __CLR4_5_2pypylusyjhrg.R.inc(1123);map.put(key, value);
        __CLR4_5_2pypylusyjhrg.R.inc(1124);return this;
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public void putAll(Map<? extends String, ? extends Object> m) {try{__CLR4_5_2pypylusyjhrg.R.inc(1125);
        __CLR4_5_2pypylusyjhrg.R.inc(1126);map.putAll(m);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public JSONObject fluentPutAll(Map<? extends String, ? extends Object> m) {try{__CLR4_5_2pypylusyjhrg.R.inc(1127);
        __CLR4_5_2pypylusyjhrg.R.inc(1128);map.putAll(m);
        __CLR4_5_2pypylusyjhrg.R.inc(1129);return this;
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public void clear() {try{__CLR4_5_2pypylusyjhrg.R.inc(1130);
        __CLR4_5_2pypylusyjhrg.R.inc(1131);map.clear();
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public JSONObject fluentClear() {try{__CLR4_5_2pypylusyjhrg.R.inc(1132);
        __CLR4_5_2pypylusyjhrg.R.inc(1133);map.clear();
        __CLR4_5_2pypylusyjhrg.R.inc(1134);return this;
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public Object remove(Object key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1135);
        __CLR4_5_2pypylusyjhrg.R.inc(1136);return map.remove(key);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public JSONObject fluentRemove(Object key) {try{__CLR4_5_2pypylusyjhrg.R.inc(1137);
        __CLR4_5_2pypylusyjhrg.R.inc(1138);map.remove(key);
        __CLR4_5_2pypylusyjhrg.R.inc(1139);return this;
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public Set<String> keySet() {try{__CLR4_5_2pypylusyjhrg.R.inc(1140);
        __CLR4_5_2pypylusyjhrg.R.inc(1141);return map.keySet();
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public Collection<Object> values() {try{__CLR4_5_2pypylusyjhrg.R.inc(1142);
        __CLR4_5_2pypylusyjhrg.R.inc(1143);return map.values();
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public Set<Map.Entry<String, Object>> entrySet() {try{__CLR4_5_2pypylusyjhrg.R.inc(1144);
        __CLR4_5_2pypylusyjhrg.R.inc(1145);return map.entrySet();
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    @Override
    public Object clone() {try{__CLR4_5_2pypylusyjhrg.R.inc(1146);
        __CLR4_5_2pypylusyjhrg.R.inc(1147);return new JSONObject((((map instanceof LinkedHashMap //
                )&&(__CLR4_5_2pypylusyjhrg.R.iget(1148)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1149)==0&false))? new LinkedHashMap<String, Object>(map) //
                : new HashMap<String, Object>(map)
        );
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public boolean equals(Object obj) {try{__CLR4_5_2pypylusyjhrg.R.inc(1150);
        __CLR4_5_2pypylusyjhrg.R.inc(1151);return this.map.equals(obj);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public int hashCode() {try{__CLR4_5_2pypylusyjhrg.R.inc(1152);
        __CLR4_5_2pypylusyjhrg.R.inc(1153);return this.map.hashCode();
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {try{__CLR4_5_2pypylusyjhrg.R.inc(1154);
        __CLR4_5_2pypylusyjhrg.R.inc(1155);Class<?>[] parameterTypes = method.getParameterTypes();
        __CLR4_5_2pypylusyjhrg.R.inc(1156);if ((((parameterTypes.length == 1)&&(__CLR4_5_2pypylusyjhrg.R.iget(1157)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1158)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(1159);if ((((method.getName().equals("equals"))&&(__CLR4_5_2pypylusyjhrg.R.iget(1160)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1161)==0&false))) {{
                __CLR4_5_2pypylusyjhrg.R.inc(1162);return this.equals(args[0]);
            }

            }__CLR4_5_2pypylusyjhrg.R.inc(1163);Class<?> returnType = method.getReturnType();
            __CLR4_5_2pypylusyjhrg.R.inc(1164);if ((((returnType != void.class)&&(__CLR4_5_2pypylusyjhrg.R.iget(1165)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1166)==0&false))) {{
                __CLR4_5_2pypylusyjhrg.R.inc(1167);throw new JSONException("illegal setter");
            }

            }__CLR4_5_2pypylusyjhrg.R.inc(1168);String name = null;
            __CLR4_5_2pypylusyjhrg.R.inc(1169);JSONField annotation = TypeUtils.getAnnotation(method, JSONField.class);
            __CLR4_5_2pypylusyjhrg.R.inc(1170);if ((((annotation != null)&&(__CLR4_5_2pypylusyjhrg.R.iget(1171)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1172)==0&false))) {{
                __CLR4_5_2pypylusyjhrg.R.inc(1173);if ((((annotation.name().length() != 0)&&(__CLR4_5_2pypylusyjhrg.R.iget(1174)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1175)==0&false))) {{
                    __CLR4_5_2pypylusyjhrg.R.inc(1176);name = annotation.name();
                }
            }}

            }__CLR4_5_2pypylusyjhrg.R.inc(1177);if ((((name == null)&&(__CLR4_5_2pypylusyjhrg.R.iget(1178)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1179)==0&false))) {{
                __CLR4_5_2pypylusyjhrg.R.inc(1180);name = method.getName();

                __CLR4_5_2pypylusyjhrg.R.inc(1181);if ((((!name.startsWith("set"))&&(__CLR4_5_2pypylusyjhrg.R.iget(1182)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1183)==0&false))) {{
                    __CLR4_5_2pypylusyjhrg.R.inc(1184);throw new JSONException("illegal setter");
                }

                }__CLR4_5_2pypylusyjhrg.R.inc(1185);name = name.substring(3);
                __CLR4_5_2pypylusyjhrg.R.inc(1186);if ((((name.length() == 0)&&(__CLR4_5_2pypylusyjhrg.R.iget(1187)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1188)==0&false))) {{
                    __CLR4_5_2pypylusyjhrg.R.inc(1189);throw new JSONException("illegal setter");
                }
                }__CLR4_5_2pypylusyjhrg.R.inc(1190);name = Character.toLowerCase(name.charAt(0)) + name.substring(1);
            }

            }__CLR4_5_2pypylusyjhrg.R.inc(1191);map.put(name, args[0]);
            __CLR4_5_2pypylusyjhrg.R.inc(1192);return null;
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(1193);if ((((parameterTypes.length == 0)&&(__CLR4_5_2pypylusyjhrg.R.iget(1194)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1195)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(1196);Class<?> returnType = method.getReturnType();
            __CLR4_5_2pypylusyjhrg.R.inc(1197);if ((((returnType == void.class)&&(__CLR4_5_2pypylusyjhrg.R.iget(1198)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1199)==0&false))) {{
                __CLR4_5_2pypylusyjhrg.R.inc(1200);throw new JSONException("illegal getter");
            }

            }__CLR4_5_2pypylusyjhrg.R.inc(1201);String name = null;
            __CLR4_5_2pypylusyjhrg.R.inc(1202);JSONField annotation = TypeUtils.getAnnotation(method, JSONField.class);
            __CLR4_5_2pypylusyjhrg.R.inc(1203);if ((((annotation != null)&&(__CLR4_5_2pypylusyjhrg.R.iget(1204)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1205)==0&false))) {{
                __CLR4_5_2pypylusyjhrg.R.inc(1206);if ((((annotation.name().length() != 0)&&(__CLR4_5_2pypylusyjhrg.R.iget(1207)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1208)==0&false))) {{
                    __CLR4_5_2pypylusyjhrg.R.inc(1209);name = annotation.name();
                }
            }}

            }__CLR4_5_2pypylusyjhrg.R.inc(1210);if ((((name == null)&&(__CLR4_5_2pypylusyjhrg.R.iget(1211)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1212)==0&false))) {{
                __CLR4_5_2pypylusyjhrg.R.inc(1213);name = method.getName();
                __CLR4_5_2pypylusyjhrg.R.inc(1214);if ((((name.startsWith("get"))&&(__CLR4_5_2pypylusyjhrg.R.iget(1215)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1216)==0&false))) {{
                    __CLR4_5_2pypylusyjhrg.R.inc(1217);name = name.substring(3);
                    __CLR4_5_2pypylusyjhrg.R.inc(1218);if ((((name.length() == 0)&&(__CLR4_5_2pypylusyjhrg.R.iget(1219)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1220)==0&false))) {{
                        __CLR4_5_2pypylusyjhrg.R.inc(1221);throw new JSONException("illegal getter");
                    }
                    }__CLR4_5_2pypylusyjhrg.R.inc(1222);name = Character.toLowerCase(name.charAt(0)) + name.substring(1);
                } }else {__CLR4_5_2pypylusyjhrg.R.inc(1223);if ((((name.startsWith("is"))&&(__CLR4_5_2pypylusyjhrg.R.iget(1224)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1225)==0&false))) {{
                    __CLR4_5_2pypylusyjhrg.R.inc(1226);name = name.substring(2);
                    __CLR4_5_2pypylusyjhrg.R.inc(1227);if ((((name.length() == 0)&&(__CLR4_5_2pypylusyjhrg.R.iget(1228)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1229)==0&false))) {{
                        __CLR4_5_2pypylusyjhrg.R.inc(1230);throw new JSONException("illegal getter");
                    }
                    }__CLR4_5_2pypylusyjhrg.R.inc(1231);name = Character.toLowerCase(name.charAt(0)) + name.substring(1);
                } }else {__CLR4_5_2pypylusyjhrg.R.inc(1232);if ((((name.startsWith("hashCode"))&&(__CLR4_5_2pypylusyjhrg.R.iget(1233)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1234)==0&false))) {{
                    __CLR4_5_2pypylusyjhrg.R.inc(1235);return this.hashCode();
                } }else {__CLR4_5_2pypylusyjhrg.R.inc(1236);if ((((name.startsWith("toString"))&&(__CLR4_5_2pypylusyjhrg.R.iget(1237)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1238)==0&false))) {{
                    __CLR4_5_2pypylusyjhrg.R.inc(1239);return this.toString();
                } }else {{
                    __CLR4_5_2pypylusyjhrg.R.inc(1240);throw new JSONException("illegal getter");
                }
            }}}}}

            }__CLR4_5_2pypylusyjhrg.R.inc(1241);Object value = map.get(name);
            __CLR4_5_2pypylusyjhrg.R.inc(1242);return TypeUtils.cast(value, method.getGenericReturnType(), ParserConfig.getGlobalInstance());
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(1243);throw new UnsupportedOperationException(method.toGenericString());
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public Map<String, Object> getInnerMap() {try{__CLR4_5_2pypylusyjhrg.R.inc(1244);
        __CLR4_5_2pypylusyjhrg.R.inc(1245);return this.map;
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}



    private void readObject(final java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {try{__CLR4_5_2pypylusyjhrg.R.inc(1246);
        __CLR4_5_2pypylusyjhrg.R.inc(1247);SecureObjectInputStream.ensureFields();
        __CLR4_5_2pypylusyjhrg.R.inc(1248);if ((((SecureObjectInputStream.fields != null && !SecureObjectInputStream.fields_error)&&(__CLR4_5_2pypylusyjhrg.R.iget(1249)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1250)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(1251);ObjectInputStream secIn = new SecureObjectInputStream(in);
            __CLR4_5_2pypylusyjhrg.R.inc(1252);try {
                __CLR4_5_2pypylusyjhrg.R.inc(1253);secIn.defaultReadObject();
                __CLR4_5_2pypylusyjhrg.R.inc(1254);return;
            } catch (java.io.NotActiveException e) {
                // skip
            }
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(1255);in.defaultReadObject();
        __CLR4_5_2pypylusyjhrg.R.inc(1256);for (Entry entry : map.entrySet()) {{
            __CLR4_5_2pypylusyjhrg.R.inc(1257);final Object key = entry.getKey();
            __CLR4_5_2pypylusyjhrg.R.inc(1258);if ((((key != null)&&(__CLR4_5_2pypylusyjhrg.R.iget(1259)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1260)==0&false))) {{
                __CLR4_5_2pypylusyjhrg.R.inc(1261);ParserConfig.global.checkAutoType(key.getClass());
            }

            }__CLR4_5_2pypylusyjhrg.R.inc(1262);final Object value = entry.getValue();
            __CLR4_5_2pypylusyjhrg.R.inc(1263);if ((((value != null)&&(__CLR4_5_2pypylusyjhrg.R.iget(1264)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1265)==0&false))) {{
                __CLR4_5_2pypylusyjhrg.R.inc(1266);ParserConfig.global.checkAutoType(value.getClass());
            }
        }}
    }}finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    static class SecureObjectInputStream extends ObjectInputStream {
        static Field[] fields;
        static volatile boolean fields_error;

        static void ensureFields() {try{__CLR4_5_2pypylusyjhrg.R.inc(1267);
            __CLR4_5_2pypylusyjhrg.R.inc(1268);if ((((fields == null && !fields_error)&&(__CLR4_5_2pypylusyjhrg.R.iget(1269)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1270)==0&false))) {{
                __CLR4_5_2pypylusyjhrg.R.inc(1271);try {
                    __CLR4_5_2pypylusyjhrg.R.inc(1272);final Field[] declaredFields = ObjectInputStream.class.getDeclaredFields();
                    __CLR4_5_2pypylusyjhrg.R.inc(1273);String[] fieldnames = new String[]{"bin", "passHandle", "handles", "curContext"};
                    __CLR4_5_2pypylusyjhrg.R.inc(1274);Field[] array = new Field[fieldnames.length];
                    __CLR4_5_2pypylusyjhrg.R.inc(1275);for (int i = 0; (((i < fieldnames.length)&&(__CLR4_5_2pypylusyjhrg.R.iget(1276)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1277)==0&false)); i++) {{
                        __CLR4_5_2pypylusyjhrg.R.inc(1278);Field field = TypeUtils
                                .getField(ObjectInputStream.class
                                        , fieldnames[i]
                                        , declaredFields
                                );
                        __CLR4_5_2pypylusyjhrg.R.inc(1279);field.setAccessible(true);
                        __CLR4_5_2pypylusyjhrg.R.inc(1280);array[i] = field;
                    }
                    }__CLR4_5_2pypylusyjhrg.R.inc(1281);fields = array;
                } catch (Throwable error) {
                    __CLR4_5_2pypylusyjhrg.R.inc(1282);fields_error = true;
                }
            }
        }}finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

        public SecureObjectInputStream(ObjectInputStream in) throws IOException {
            super(in);__CLR4_5_2pypylusyjhrg.R.inc(1284);try{__CLR4_5_2pypylusyjhrg.R.inc(1283);
            __CLR4_5_2pypylusyjhrg.R.inc(1285);try {
                __CLR4_5_2pypylusyjhrg.R.inc(1286);for (int i = 0; (((i < fields.length)&&(__CLR4_5_2pypylusyjhrg.R.iget(1287)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1288)==0&false)); i++) {{
                    __CLR4_5_2pypylusyjhrg.R.inc(1289);final Field field = fields[i];
                    __CLR4_5_2pypylusyjhrg.R.inc(1290);final Object value = field.get(in);
                    __CLR4_5_2pypylusyjhrg.R.inc(1291);field.set(this, value);
                }
            }} catch (IllegalAccessException e) {
                __CLR4_5_2pypylusyjhrg.R.inc(1292);fields_error = true;
            }
        }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

        protected Class<?> resolveClass(ObjectStreamClass desc)
                throws IOException, ClassNotFoundException {try{__CLR4_5_2pypylusyjhrg.R.inc(1293);
            __CLR4_5_2pypylusyjhrg.R.inc(1294);String name = desc.getName();
            __CLR4_5_2pypylusyjhrg.R.inc(1295);if ((((name.length() > 2)&&(__CLR4_5_2pypylusyjhrg.R.iget(1296)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1297)==0&false))) {{
                __CLR4_5_2pypylusyjhrg.R.inc(1298);int index = name.lastIndexOf('[');
                __CLR4_5_2pypylusyjhrg.R.inc(1299);if ((((index != -1)&&(__CLR4_5_2pypylusyjhrg.R.iget(1300)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1301)==0&false))) {{
                    __CLR4_5_2pypylusyjhrg.R.inc(1302);name = name.substring(index + 1);
                }
                }__CLR4_5_2pypylusyjhrg.R.inc(1303);if ((((name.length() > 2 && name.charAt(0) == 'L' && name.charAt(name.length() - 1) == ';')&&(__CLR4_5_2pypylusyjhrg.R.iget(1304)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1305)==0&false))) {{
                    __CLR4_5_2pypylusyjhrg.R.inc(1306);name = name.substring(1, name.length() - 1);
                }
                }__CLR4_5_2pypylusyjhrg.R.inc(1307);ParserConfig.global.checkAutoType(name, null, Feature.SupportAutoType.mask);
            }
            }__CLR4_5_2pypylusyjhrg.R.inc(1308);return super.resolveClass(desc);
        }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

        protected Class<?> resolveProxyClass(String[] interfaces)
                throws IOException, ClassNotFoundException {try{__CLR4_5_2pypylusyjhrg.R.inc(1309);
            __CLR4_5_2pypylusyjhrg.R.inc(1310);for (String interfacename : interfaces) {{
                //\u68c0\u67e5\u662f\u5426\u5904\u4e8e\u9ed1\u540d\u5355
                __CLR4_5_2pypylusyjhrg.R.inc(1311);ParserConfig.global.checkAutoType(interfacename, null);
            }
            }__CLR4_5_2pypylusyjhrg.R.inc(1312);return super.resolveProxyClass(interfaces);
        }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

        //Hack:\u9ed8\u8ba4\u6784\u9020\u65b9\u6cd5\u4f1a\u8c03\u7528\u8fd9\u4e2a\u65b9\u6cd5\uff0c\u91cd\u5199\u6b64\u65b9\u6cd5\u4f7f\u7528\u53cd\u5c04\u8fd8\u539f\u90e8\u5206\u5173\u952e\u5c5e\u6027
        protected void readStreamHeader() throws IOException, StreamCorruptedException {try{__CLR4_5_2pypylusyjhrg.R.inc(1313);

        }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}
    }

    public <T> T toJavaObject(Class<T> clazz) {try{__CLR4_5_2pypylusyjhrg.R.inc(1314);
        __CLR4_5_2pypylusyjhrg.R.inc(1315);if ((((clazz == Map.class || clazz == JSONObject.class || clazz == JSON.class)&&(__CLR4_5_2pypylusyjhrg.R.iget(1316)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1317)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(1318);return (T) this;
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(1319);if ((((clazz == Object.class && !containsKey(JSON.DEFAULT_TYPE_KEY))&&(__CLR4_5_2pypylusyjhrg.R.iget(1320)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1321)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(1322);return (T) this;
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(1323);return TypeUtils.castToJavaBean(this, clazz, ParserConfig.getGlobalInstance());
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}

    public <T> T toJavaObject(Class<T> clazz, ParserConfig config, int features) {try{__CLR4_5_2pypylusyjhrg.R.inc(1324);
        __CLR4_5_2pypylusyjhrg.R.inc(1325);if ((((clazz == Map.class)&&(__CLR4_5_2pypylusyjhrg.R.iget(1326)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1327)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(1328);return (T) this;
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(1329);if ((((clazz == Object.class && !containsKey(JSON.DEFAULT_TYPE_KEY))&&(__CLR4_5_2pypylusyjhrg.R.iget(1330)!=0|true))||(__CLR4_5_2pypylusyjhrg.R.iget(1331)==0&false))) {{
            __CLR4_5_2pypylusyjhrg.R.inc(1332);return (T) this;
        }

        }__CLR4_5_2pypylusyjhrg.R.inc(1333);return TypeUtils.castToJavaBean(this, clazz, config);
    }finally{__CLR4_5_2pypylusyjhrg.R.flushNeeded();}}
}
