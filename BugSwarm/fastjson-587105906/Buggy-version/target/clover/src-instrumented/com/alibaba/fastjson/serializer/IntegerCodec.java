/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//*
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
import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicInteger;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.TypeUtils;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class IntegerCodec implements ObjectSerializer, ObjectDeserializer {public static class __CLR4_1_10k0ik0iluszvz69{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,26006,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static IntegerCodec instance = new IntegerCodec();

    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {try{__CLR4_1_10k0ik0iluszvz69.R.inc(25938);
        __CLR4_1_10k0ik0iluszvz69.R.inc(25939);SerializeWriter out = serializer.out;

        __CLR4_1_10k0ik0iluszvz69.R.inc(25940);Number value = (Number) object;
        
        __CLR4_1_10k0ik0iluszvz69.R.inc(25941);if ((((value == null)&&(__CLR4_1_10k0ik0iluszvz69.R.iget(25942)!=0|true))||(__CLR4_1_10k0ik0iluszvz69.R.iget(25943)==0&false))) {{
            __CLR4_1_10k0ik0iluszvz69.R.inc(25944);out.writeNull(SerializerFeature.WriteNullNumberAsZero);
            __CLR4_1_10k0ik0iluszvz69.R.inc(25945);return;
        }
        
        }__CLR4_1_10k0ik0iluszvz69.R.inc(25946);if ((((object instanceof Long)&&(__CLR4_1_10k0ik0iluszvz69.R.iget(25947)!=0|true))||(__CLR4_1_10k0ik0iluszvz69.R.iget(25948)==0&false))) {{
            __CLR4_1_10k0ik0iluszvz69.R.inc(25949);out.writeLong(value.longValue());
        } }else {{
            __CLR4_1_10k0ik0iluszvz69.R.inc(25950);out.writeInt(value.intValue());
        }
        
        }__CLR4_1_10k0ik0iluszvz69.R.inc(25951);if ((((out.isEnabled(SerializerFeature.WriteClassName))&&(__CLR4_1_10k0ik0iluszvz69.R.iget(25952)!=0|true))||(__CLR4_1_10k0ik0iluszvz69.R.iget(25953)==0&false))) {{
            __CLR4_1_10k0ik0iluszvz69.R.inc(25954);Class<?> clazz = value.getClass();
            __CLR4_1_10k0ik0iluszvz69.R.inc(25955);if ((((clazz == Byte.class)&&(__CLR4_1_10k0ik0iluszvz69.R.iget(25956)!=0|true))||(__CLR4_1_10k0ik0iluszvz69.R.iget(25957)==0&false))) {{
                __CLR4_1_10k0ik0iluszvz69.R.inc(25958);out.write('B');
            } }else {__CLR4_1_10k0ik0iluszvz69.R.inc(25959);if ((((clazz == Short.class)&&(__CLR4_1_10k0ik0iluszvz69.R.iget(25960)!=0|true))||(__CLR4_1_10k0ik0iluszvz69.R.iget(25961)==0&false))) {{
                __CLR4_1_10k0ik0iluszvz69.R.inc(25962);out.write('S');
            }
        }}}
    }}finally{__CLR4_1_10k0ik0iluszvz69.R.flushNeeded();}}
    
    @SuppressWarnings("unchecked")
    public <T> T deserialze(DefaultJSONParser parser, Type clazz, Object fieldName) {try{__CLR4_1_10k0ik0iluszvz69.R.inc(25963);
        __CLR4_1_10k0ik0iluszvz69.R.inc(25964);final JSONLexer lexer = parser.lexer;

        __CLR4_1_10k0ik0iluszvz69.R.inc(25965);final int token = lexer.token();

        __CLR4_1_10k0ik0iluszvz69.R.inc(25966);if ((((token == JSONToken.NULL)&&(__CLR4_1_10k0ik0iluszvz69.R.iget(25967)!=0|true))||(__CLR4_1_10k0ik0iluszvz69.R.iget(25968)==0&false))) {{
            __CLR4_1_10k0ik0iluszvz69.R.inc(25969);lexer.nextToken(JSONToken.COMMA);
            __CLR4_1_10k0ik0iluszvz69.R.inc(25970);return null;
        }


        }__CLR4_1_10k0ik0iluszvz69.R.inc(25971);Integer intObj;
        __CLR4_1_10k0ik0iluszvz69.R.inc(25972);try {
            __CLR4_1_10k0ik0iluszvz69.R.inc(25973);if ((((token == JSONToken.LITERAL_INT)&&(__CLR4_1_10k0ik0iluszvz69.R.iget(25974)!=0|true))||(__CLR4_1_10k0ik0iluszvz69.R.iget(25975)==0&false))) {{
                __CLR4_1_10k0ik0iluszvz69.R.inc(25976);int val = lexer.intValue();
                __CLR4_1_10k0ik0iluszvz69.R.inc(25977);lexer.nextToken(JSONToken.COMMA);
                __CLR4_1_10k0ik0iluszvz69.R.inc(25978);intObj = Integer.valueOf(val);
            } }else {__CLR4_1_10k0ik0iluszvz69.R.inc(25979);if ((((token == JSONToken.LITERAL_FLOAT)&&(__CLR4_1_10k0ik0iluszvz69.R.iget(25980)!=0|true))||(__CLR4_1_10k0ik0iluszvz69.R.iget(25981)==0&false))) {{
                __CLR4_1_10k0ik0iluszvz69.R.inc(25982);BigDecimal number = lexer.decimalValue();
                __CLR4_1_10k0ik0iluszvz69.R.inc(25983);intObj = TypeUtils.intValue(number);
                __CLR4_1_10k0ik0iluszvz69.R.inc(25984);lexer.nextToken(JSONToken.COMMA);
            } }else {{
                __CLR4_1_10k0ik0iluszvz69.R.inc(25985);if ((((token == JSONToken.LBRACE)&&(__CLR4_1_10k0ik0iluszvz69.R.iget(25986)!=0|true))||(__CLR4_1_10k0ik0iluszvz69.R.iget(25987)==0&false))) {{
                    __CLR4_1_10k0ik0iluszvz69.R.inc(25988);JSONObject jsonObject = new JSONObject(true);
                    __CLR4_1_10k0ik0iluszvz69.R.inc(25989);parser.parseObject(jsonObject);
                    __CLR4_1_10k0ik0iluszvz69.R.inc(25990);intObj = TypeUtils.castToInt(jsonObject);
                } }else {{
                    __CLR4_1_10k0ik0iluszvz69.R.inc(25991);Object value = parser.parse();
                    __CLR4_1_10k0ik0iluszvz69.R.inc(25992);intObj = TypeUtils.castToInt(value);
                }
            }}
        }}} catch (Exception ex) {
            __CLR4_1_10k0ik0iluszvz69.R.inc(25993);String message = "parseInt error";
            __CLR4_1_10k0ik0iluszvz69.R.inc(25994);if ((((fieldName != null)&&(__CLR4_1_10k0ik0iluszvz69.R.iget(25995)!=0|true))||(__CLR4_1_10k0ik0iluszvz69.R.iget(25996)==0&false))) {{
                __CLR4_1_10k0ik0iluszvz69.R.inc(25997);message += (", field : " + fieldName);
            }
            }__CLR4_1_10k0ik0iluszvz69.R.inc(25998);throw new JSONException(message, ex);
        }

        
        __CLR4_1_10k0ik0iluszvz69.R.inc(25999);if ((((clazz == AtomicInteger.class)&&(__CLR4_1_10k0ik0iluszvz69.R.iget(26000)!=0|true))||(__CLR4_1_10k0ik0iluszvz69.R.iget(26001)==0&false))) {{
            __CLR4_1_10k0ik0iluszvz69.R.inc(26002);return (T) new AtomicInteger(intObj.intValue());
        }
        
        }__CLR4_1_10k0ik0iluszvz69.R.inc(26003);return (T) intObj;
    }finally{__CLR4_1_10k0ik0iluszvz69.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_1_10k0ik0iluszvz69.R.inc(26004);
        __CLR4_1_10k0ik0iluszvz69.R.inc(26005);return JSONToken.LITERAL_INT;
    }finally{__CLR4_1_10k0ik0iluszvz69.R.flushNeeded();}}
}
