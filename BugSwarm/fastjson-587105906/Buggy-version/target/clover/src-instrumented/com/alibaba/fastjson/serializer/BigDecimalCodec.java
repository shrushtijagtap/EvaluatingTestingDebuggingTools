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

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.TypeUtils;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class BigDecimalCodec implements ObjectSerializer, ObjectDeserializer {public static class __CLR4_1_10j60j60lusqjjtq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,24891,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    final static BigDecimal LOW = BigDecimal.valueOf(-9007199254740991L);
    final static BigDecimal HIGH = BigDecimal.valueOf(9007199254740991L);

    public final static BigDecimalCodec instance = new BigDecimalCodec();

    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {try{__CLR4_1_10j60j60lusqjjtq.R.inc(24840);
        __CLR4_1_10j60j60lusqjjtq.R.inc(24841);SerializeWriter out = serializer.out;

        __CLR4_1_10j60j60lusqjjtq.R.inc(24842);if ((((object == null)&&(__CLR4_1_10j60j60lusqjjtq.R.iget(24843)!=0|true))||(__CLR4_1_10j60j60lusqjjtq.R.iget(24844)==0&false))) {{
            __CLR4_1_10j60j60lusqjjtq.R.inc(24845);out.writeNull(SerializerFeature.WriteNullNumberAsZero);
        } }else {{
            __CLR4_1_10j60j60lusqjjtq.R.inc(24846);BigDecimal val = (BigDecimal) object;
            __CLR4_1_10j60j60lusqjjtq.R.inc(24847);int scale = val.scale();

            __CLR4_1_10j60j60lusqjjtq.R.inc(24848);String outText;
            __CLR4_1_10j60j60lusqjjtq.R.inc(24849);if ((((SerializerFeature.isEnabled(features, out.features, SerializerFeature.WriteBigDecimalAsPlain)
                    && scale >= -100 && scale < 100)&&(__CLR4_1_10j60j60lusqjjtq.R.iget(24850)!=0|true))||(__CLR4_1_10j60j60lusqjjtq.R.iget(24851)==0&false))) {{
                __CLR4_1_10j60j60lusqjjtq.R.inc(24852);outText = val.toPlainString();
            } }else {{
                __CLR4_1_10j60j60lusqjjtq.R.inc(24853);outText = val.toString();
            }

            }__CLR4_1_10j60j60lusqjjtq.R.inc(24854);if ((((scale == 0)&&(__CLR4_1_10j60j60lusqjjtq.R.iget(24855)!=0|true))||(__CLR4_1_10j60j60lusqjjtq.R.iget(24856)==0&false))) {{
                __CLR4_1_10j60j60lusqjjtq.R.inc(24857);if ((((outText.length() >= 16
                        && SerializerFeature.isEnabled(features, out.features, SerializerFeature.BrowserCompatible)
                        && (val.compareTo(LOW) < 0
                        || val.compareTo(HIGH) > 0))&&(__CLR4_1_10j60j60lusqjjtq.R.iget(24858)!=0|true))||(__CLR4_1_10j60j60lusqjjtq.R.iget(24859)==0&false)))
                {{
                    __CLR4_1_10j60j60lusqjjtq.R.inc(24860);out.writeString(outText);
                    __CLR4_1_10j60j60lusqjjtq.R.inc(24861);return;
                }
            }}

            }__CLR4_1_10j60j60lusqjjtq.R.inc(24862);out.write(outText);

            __CLR4_1_10j60j60lusqjjtq.R.inc(24863);if ((((out.isEnabled(SerializerFeature.WriteClassName) && fieldType != BigDecimal.class && val.scale() == 0)&&(__CLR4_1_10j60j60lusqjjtq.R.iget(24864)!=0|true))||(__CLR4_1_10j60j60lusqjjtq.R.iget(24865)==0&false))) {{
                __CLR4_1_10j60j60lusqjjtq.R.inc(24866);out.write('.');
            }
        }}
    }}finally{__CLR4_1_10j60j60lusqjjtq.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public <T> T deserialze(DefaultJSONParser parser, Type clazz, Object fieldName) {try{__CLR4_1_10j60j60lusqjjtq.R.inc(24867);
        __CLR4_1_10j60j60lusqjjtq.R.inc(24868);try {
            __CLR4_1_10j60j60lusqjjtq.R.inc(24869);return (T) deserialze(parser);
        } catch (Exception ex) {
            __CLR4_1_10j60j60lusqjjtq.R.inc(24870);throw new JSONException("parseDecimal error, field : " + fieldName, ex);
        }
    }finally{__CLR4_1_10j60j60lusqjjtq.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public static <T> T deserialze(DefaultJSONParser parser) {try{__CLR4_1_10j60j60lusqjjtq.R.inc(24871);
        __CLR4_1_10j60j60lusqjjtq.R.inc(24872);final JSONLexer lexer = parser.lexer;
        __CLR4_1_10j60j60lusqjjtq.R.inc(24873);if ((((lexer.token() == JSONToken.LITERAL_INT)&&(__CLR4_1_10j60j60lusqjjtq.R.iget(24874)!=0|true))||(__CLR4_1_10j60j60lusqjjtq.R.iget(24875)==0&false))) {{
            __CLR4_1_10j60j60lusqjjtq.R.inc(24876);BigDecimal decimalValue = lexer.decimalValue();
            __CLR4_1_10j60j60lusqjjtq.R.inc(24877);lexer.nextToken(JSONToken.COMMA);
            __CLR4_1_10j60j60lusqjjtq.R.inc(24878);return (T) decimalValue;
        }

        }__CLR4_1_10j60j60lusqjjtq.R.inc(24879);if ((((lexer.token() == JSONToken.LITERAL_FLOAT)&&(__CLR4_1_10j60j60lusqjjtq.R.iget(24880)!=0|true))||(__CLR4_1_10j60j60lusqjjtq.R.iget(24881)==0&false))) {{
            __CLR4_1_10j60j60lusqjjtq.R.inc(24882);BigDecimal val = lexer.decimalValue();
            __CLR4_1_10j60j60lusqjjtq.R.inc(24883);lexer.nextToken(JSONToken.COMMA);
            __CLR4_1_10j60j60lusqjjtq.R.inc(24884);return (T) val;
        }

        }__CLR4_1_10j60j60lusqjjtq.R.inc(24885);Object value = parser.parse();
        __CLR4_1_10j60j60lusqjjtq.R.inc(24886);return (((value == null //
            )&&(__CLR4_1_10j60j60lusqjjtq.R.iget(24887)!=0|true))||(__CLR4_1_10j60j60lusqjjtq.R.iget(24888)==0&false))? null //
            : (T) TypeUtils.castToBigDecimal(value);
    }finally{__CLR4_1_10j60j60lusqjjtq.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_1_10j60j60lusqjjtq.R.inc(24889);
        __CLR4_1_10j60j60lusqjjtq.R.inc(24890);return JSONToken.LITERAL_INT;
    }finally{__CLR4_1_10j60j60lusqjjtq.R.flushNeeded();}}
}
