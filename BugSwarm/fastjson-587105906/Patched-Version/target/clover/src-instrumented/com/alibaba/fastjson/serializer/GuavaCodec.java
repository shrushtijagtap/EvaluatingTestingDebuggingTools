/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by wenshao on 15/01/2017.
 */
public class GuavaCodec implements ObjectSerializer, ObjectDeserializer {public static class __CLR4_5_2jzpjzplusvmto6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,25938,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static GuavaCodec instance = new GuavaCodec();

    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {try{__CLR4_5_2jzpjzplusvmto6.R.inc(25909);
        __CLR4_5_2jzpjzplusvmto6.R.inc(25910);SerializeWriter out = serializer.out;
        __CLR4_5_2jzpjzplusvmto6.R.inc(25911);if ((((object instanceof Multimap)&&(__CLR4_5_2jzpjzplusvmto6.R.iget(25912)!=0|true))||(__CLR4_5_2jzpjzplusvmto6.R.iget(25913)==0&false))) {{
            __CLR4_5_2jzpjzplusvmto6.R.inc(25914);Multimap multimap = (Multimap) object;
            __CLR4_5_2jzpjzplusvmto6.R.inc(25915);serializer.write(multimap.asMap());
        }
    }}finally{__CLR4_5_2jzpjzplusvmto6.R.flushNeeded();}}

    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_2jzpjzplusvmto6.R.inc(25916);
        __CLR4_5_2jzpjzplusvmto6.R.inc(25917);Type rawType = type;
        __CLR4_5_2jzpjzplusvmto6.R.inc(25918);if ((((type instanceof ParameterizedType)&&(__CLR4_5_2jzpjzplusvmto6.R.iget(25919)!=0|true))||(__CLR4_5_2jzpjzplusvmto6.R.iget(25920)==0&false))) {{
            __CLR4_5_2jzpjzplusvmto6.R.inc(25921);rawType = ((ParameterizedType) type).getRawType();
        }

        }__CLR4_5_2jzpjzplusvmto6.R.inc(25922);if ((((rawType == ArrayListMultimap.class)&&(__CLR4_5_2jzpjzplusvmto6.R.iget(25923)!=0|true))||(__CLR4_5_2jzpjzplusvmto6.R.iget(25924)==0&false))) {{
            __CLR4_5_2jzpjzplusvmto6.R.inc(25925);ArrayListMultimap multimap = ArrayListMultimap.create();
            __CLR4_5_2jzpjzplusvmto6.R.inc(25926);JSONObject object = parser.parseObject();
            __CLR4_5_2jzpjzplusvmto6.R.inc(25927);for (Map.Entry entry : object.entrySet()) {{
                __CLR4_5_2jzpjzplusvmto6.R.inc(25928);Object value = entry.getValue();
                __CLR4_5_2jzpjzplusvmto6.R.inc(25929);if ((((value instanceof Collection)&&(__CLR4_5_2jzpjzplusvmto6.R.iget(25930)!=0|true))||(__CLR4_5_2jzpjzplusvmto6.R.iget(25931)==0&false))) {{
                    __CLR4_5_2jzpjzplusvmto6.R.inc(25932);multimap.putAll(entry.getKey(), (List) value);
                } }else {{
                    __CLR4_5_2jzpjzplusvmto6.R.inc(25933);multimap.put(entry.getKey(), value);
                }
            }}

            }__CLR4_5_2jzpjzplusvmto6.R.inc(25934);return (T) multimap;
        }
        }__CLR4_5_2jzpjzplusvmto6.R.inc(25935);return null;
    }finally{__CLR4_5_2jzpjzplusvmto6.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_5_2jzpjzplusvmto6.R.inc(25936);
        __CLR4_5_2jzpjzplusvmto6.R.inc(25937);return 0;
    }finally{__CLR4_5_2jzpjzplusvmto6.R.flushNeeded();}}
}
