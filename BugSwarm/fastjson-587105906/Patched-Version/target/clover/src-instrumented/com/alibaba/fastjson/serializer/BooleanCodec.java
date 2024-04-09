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
import java.util.concurrent.atomic.AtomicBoolean;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.TypeUtils;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class BooleanCodec implements ObjectSerializer, ObjectDeserializer {public static class __CLR4_5_2j8aj8alusvmt8m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,24973,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final static BooleanCodec instance = new BooleanCodec();

    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {try{__CLR4_5_2j8aj8alusvmt8m.R.inc(24922);
        __CLR4_5_2j8aj8alusvmt8m.R.inc(24923);SerializeWriter out = serializer.out;

        __CLR4_5_2j8aj8alusvmt8m.R.inc(24924);Boolean value = (Boolean) object;
        __CLR4_5_2j8aj8alusvmt8m.R.inc(24925);if ((((value == null)&&(__CLR4_5_2j8aj8alusvmt8m.R.iget(24926)!=0|true))||(__CLR4_5_2j8aj8alusvmt8m.R.iget(24927)==0&false))) {{
            __CLR4_5_2j8aj8alusvmt8m.R.inc(24928);out.writeNull(SerializerFeature.WriteNullBooleanAsFalse);
            __CLR4_5_2j8aj8alusvmt8m.R.inc(24929);return;
        }

        }__CLR4_5_2j8aj8alusvmt8m.R.inc(24930);if ((((value.booleanValue())&&(__CLR4_5_2j8aj8alusvmt8m.R.iget(24931)!=0|true))||(__CLR4_5_2j8aj8alusvmt8m.R.iget(24932)==0&false))) {{
            __CLR4_5_2j8aj8alusvmt8m.R.inc(24933);out.write("true");
        } }else {{
            __CLR4_5_2j8aj8alusvmt8m.R.inc(24934);out.write("false");
        }
    }}finally{__CLR4_5_2j8aj8alusvmt8m.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public <T> T deserialze(DefaultJSONParser parser, Type clazz, Object fieldName) {try{__CLR4_5_2j8aj8alusvmt8m.R.inc(24935);
        __CLR4_5_2j8aj8alusvmt8m.R.inc(24936);final JSONLexer lexer = parser.lexer;

        __CLR4_5_2j8aj8alusvmt8m.R.inc(24937);Boolean boolObj;

        __CLR4_5_2j8aj8alusvmt8m.R.inc(24938);try {
            __CLR4_5_2j8aj8alusvmt8m.R.inc(24939);if ((((lexer.token() == JSONToken.TRUE)&&(__CLR4_5_2j8aj8alusvmt8m.R.iget(24940)!=0|true))||(__CLR4_5_2j8aj8alusvmt8m.R.iget(24941)==0&false))) {{
                __CLR4_5_2j8aj8alusvmt8m.R.inc(24942);lexer.nextToken(JSONToken.COMMA);
                __CLR4_5_2j8aj8alusvmt8m.R.inc(24943);boolObj = Boolean.TRUE;
            } }else {__CLR4_5_2j8aj8alusvmt8m.R.inc(24944);if ((((lexer.token() == JSONToken.FALSE)&&(__CLR4_5_2j8aj8alusvmt8m.R.iget(24945)!=0|true))||(__CLR4_5_2j8aj8alusvmt8m.R.iget(24946)==0&false))) {{
                __CLR4_5_2j8aj8alusvmt8m.R.inc(24947);lexer.nextToken(JSONToken.COMMA);
                __CLR4_5_2j8aj8alusvmt8m.R.inc(24948);boolObj = Boolean.FALSE;
            } }else {__CLR4_5_2j8aj8alusvmt8m.R.inc(24949);if ((((lexer.token() == JSONToken.LITERAL_INT)&&(__CLR4_5_2j8aj8alusvmt8m.R.iget(24950)!=0|true))||(__CLR4_5_2j8aj8alusvmt8m.R.iget(24951)==0&false))) {{
                __CLR4_5_2j8aj8alusvmt8m.R.inc(24952);int intValue = lexer.intValue();
                __CLR4_5_2j8aj8alusvmt8m.R.inc(24953);lexer.nextToken(JSONToken.COMMA);

                __CLR4_5_2j8aj8alusvmt8m.R.inc(24954);if ((((intValue == 1)&&(__CLR4_5_2j8aj8alusvmt8m.R.iget(24955)!=0|true))||(__CLR4_5_2j8aj8alusvmt8m.R.iget(24956)==0&false))) {{
                    __CLR4_5_2j8aj8alusvmt8m.R.inc(24957);boolObj = Boolean.TRUE;
                } }else {{
                    __CLR4_5_2j8aj8alusvmt8m.R.inc(24958);boolObj = Boolean.FALSE;
                }
            }} }else {{
                __CLR4_5_2j8aj8alusvmt8m.R.inc(24959);Object value = parser.parse();

                __CLR4_5_2j8aj8alusvmt8m.R.inc(24960);if ((((value == null)&&(__CLR4_5_2j8aj8alusvmt8m.R.iget(24961)!=0|true))||(__CLR4_5_2j8aj8alusvmt8m.R.iget(24962)==0&false))) {{
                    __CLR4_5_2j8aj8alusvmt8m.R.inc(24963);return null;
                }

                }__CLR4_5_2j8aj8alusvmt8m.R.inc(24964);boolObj = TypeUtils.castToBoolean(value);
            }
        }}}} catch (Exception ex) {
            __CLR4_5_2j8aj8alusvmt8m.R.inc(24965);throw new JSONException("parseBoolean error, field : " + fieldName, ex);
        }

        __CLR4_5_2j8aj8alusvmt8m.R.inc(24966);if ((((clazz == AtomicBoolean.class)&&(__CLR4_5_2j8aj8alusvmt8m.R.iget(24967)!=0|true))||(__CLR4_5_2j8aj8alusvmt8m.R.iget(24968)==0&false))) {{
            __CLR4_5_2j8aj8alusvmt8m.R.inc(24969);return (T) new AtomicBoolean(boolObj.booleanValue());
        }

        }__CLR4_5_2j8aj8alusvmt8m.R.inc(24970);return (T) boolObj;
    }finally{__CLR4_5_2j8aj8alusvmt8m.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_5_2j8aj8alusvmt8m.R.inc(24971);
        __CLR4_5_2j8aj8alusvmt8m.R.inc(24972);return JSONToken.TRUE;
    }finally{__CLR4_5_2j8aj8alusvmt8m.R.flushNeeded();}}
}
