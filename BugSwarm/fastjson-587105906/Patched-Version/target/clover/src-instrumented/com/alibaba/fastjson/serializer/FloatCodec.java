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
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.TypeUtils;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class FloatCodec implements ObjectSerializer, ObjectDeserializer {public static class __CLR4_5_2jygjyglusvmtnr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,25909,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private NumberFormat decimalFormat;

    public static FloatCodec instance = new FloatCodec();

    public FloatCodec(){try{__CLR4_5_2jygjyglusvmtnr.R.inc(25864);

    }finally{__CLR4_5_2jygjyglusvmtnr.R.flushNeeded();}}

    public FloatCodec(DecimalFormat decimalFormat){try{__CLR4_5_2jygjyglusvmtnr.R.inc(25865);
        __CLR4_5_2jygjyglusvmtnr.R.inc(25866);this.decimalFormat = decimalFormat;
    }finally{__CLR4_5_2jygjyglusvmtnr.R.flushNeeded();}}

    public FloatCodec(String decimalFormat){
        this(new DecimalFormat(decimalFormat));__CLR4_5_2jygjyglusvmtnr.R.inc(25868);try{__CLR4_5_2jygjyglusvmtnr.R.inc(25867);
    }finally{__CLR4_5_2jygjyglusvmtnr.R.flushNeeded();}}

    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {try{__CLR4_5_2jygjyglusvmtnr.R.inc(25869);
        __CLR4_5_2jygjyglusvmtnr.R.inc(25870);SerializeWriter out = serializer.out;
        
        __CLR4_5_2jygjyglusvmtnr.R.inc(25871);if ((((object == null)&&(__CLR4_5_2jygjyglusvmtnr.R.iget(25872)!=0|true))||(__CLR4_5_2jygjyglusvmtnr.R.iget(25873)==0&false))) {{
            __CLR4_5_2jygjyglusvmtnr.R.inc(25874);out.writeNull(SerializerFeature.WriteNullNumberAsZero);
            __CLR4_5_2jygjyglusvmtnr.R.inc(25875);return;
        }

        }__CLR4_5_2jygjyglusvmtnr.R.inc(25876);float floatValue = ((Float) object).floatValue();
        __CLR4_5_2jygjyglusvmtnr.R.inc(25877);if ((((decimalFormat != null)&&(__CLR4_5_2jygjyglusvmtnr.R.iget(25878)!=0|true))||(__CLR4_5_2jygjyglusvmtnr.R.iget(25879)==0&false))) {{
            __CLR4_5_2jygjyglusvmtnr.R.inc(25880);String floatText = decimalFormat.format(floatValue);
            __CLR4_5_2jygjyglusvmtnr.R.inc(25881);out.write(floatText);
        } }else {{
            __CLR4_5_2jygjyglusvmtnr.R.inc(25882);out.writeFloat(floatValue, true);
        }
    }}finally{__CLR4_5_2jygjyglusvmtnr.R.flushNeeded();}}
    
    @SuppressWarnings("unchecked")
    public <T> T deserialze(DefaultJSONParser parser, Type clazz, Object fieldName) {try{__CLR4_5_2jygjyglusvmtnr.R.inc(25883);
        __CLR4_5_2jygjyglusvmtnr.R.inc(25884);try {
            __CLR4_5_2jygjyglusvmtnr.R.inc(25885);return (T) deserialze(parser);
        } catch (Exception ex) {
            __CLR4_5_2jygjyglusvmtnr.R.inc(25886);throw new JSONException("parseLong error, field : " + fieldName, ex);
        }
    }finally{__CLR4_5_2jygjyglusvmtnr.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public static <T> T deserialze(DefaultJSONParser parser) {try{__CLR4_5_2jygjyglusvmtnr.R.inc(25887);
        __CLR4_5_2jygjyglusvmtnr.R.inc(25888);final JSONLexer lexer = parser.lexer;

        __CLR4_5_2jygjyglusvmtnr.R.inc(25889);if ((((lexer.token() == JSONToken.LITERAL_INT)&&(__CLR4_5_2jygjyglusvmtnr.R.iget(25890)!=0|true))||(__CLR4_5_2jygjyglusvmtnr.R.iget(25891)==0&false))) {{
            __CLR4_5_2jygjyglusvmtnr.R.inc(25892);String val = lexer.numberString();
            __CLR4_5_2jygjyglusvmtnr.R.inc(25893);lexer.nextToken(JSONToken.COMMA);
            __CLR4_5_2jygjyglusvmtnr.R.inc(25894);return (T) Float.valueOf(Float.parseFloat(val));
        }

        }__CLR4_5_2jygjyglusvmtnr.R.inc(25895);if ((((lexer.token() == JSONToken.LITERAL_FLOAT)&&(__CLR4_5_2jygjyglusvmtnr.R.iget(25896)!=0|true))||(__CLR4_5_2jygjyglusvmtnr.R.iget(25897)==0&false))) {{
            __CLR4_5_2jygjyglusvmtnr.R.inc(25898);float val = lexer.floatValue();
            __CLR4_5_2jygjyglusvmtnr.R.inc(25899);lexer.nextToken(JSONToken.COMMA);
            __CLR4_5_2jygjyglusvmtnr.R.inc(25900);return (T) Float.valueOf(val);
        }

        }__CLR4_5_2jygjyglusvmtnr.R.inc(25901);Object value = parser.parse();

        __CLR4_5_2jygjyglusvmtnr.R.inc(25902);if ((((value == null)&&(__CLR4_5_2jygjyglusvmtnr.R.iget(25903)!=0|true))||(__CLR4_5_2jygjyglusvmtnr.R.iget(25904)==0&false))) {{
            __CLR4_5_2jygjyglusvmtnr.R.inc(25905);return null;
        }

        }__CLR4_5_2jygjyglusvmtnr.R.inc(25906);return (T) TypeUtils.castToFloat(value);
    }finally{__CLR4_5_2jygjyglusvmtnr.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_5_2jygjyglusvmtnr.R.inc(25907);
        __CLR4_5_2jygjyglusvmtnr.R.inc(25908);return JSONToken.LITERAL_INT;
    }finally{__CLR4_5_2jygjyglusvmtnr.R.flushNeeded();}}
}
