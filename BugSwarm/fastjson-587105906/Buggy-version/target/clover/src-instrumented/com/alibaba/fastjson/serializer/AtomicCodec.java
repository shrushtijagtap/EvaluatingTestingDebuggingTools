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
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class AtomicCodec implements ObjectSerializer, ObjectDeserializer {public static class __CLR4_1_10iu8iu8lusqjjrl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,24498,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final static AtomicCodec instance = new AtomicCodec();

    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {try{__CLR4_1_10iu8iu8lusqjjrl.R.inc(24416);
        __CLR4_1_10iu8iu8lusqjjrl.R.inc(24417);SerializeWriter out = serializer.out;
        
        __CLR4_1_10iu8iu8lusqjjrl.R.inc(24418);if ((((object instanceof AtomicInteger)&&(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24419)!=0|true))||(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24420)==0&false))) {{
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24421);AtomicInteger val = (AtomicInteger) object;
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24422);out.writeInt(val.get());
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24423);return;
        }
        
        }__CLR4_1_10iu8iu8lusqjjrl.R.inc(24424);if ((((object instanceof AtomicLong)&&(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24425)!=0|true))||(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24426)==0&false))) {{
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24427);AtomicLong val = (AtomicLong) object;
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24428);out.writeLong(val.get());
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24429);return;
        }
        
        }__CLR4_1_10iu8iu8lusqjjrl.R.inc(24430);if ((((object instanceof AtomicBoolean)&&(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24431)!=0|true))||(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24432)==0&false))) {{
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24433);AtomicBoolean val = (AtomicBoolean) object;
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24434);out.append((((val.get() )&&(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24435)!=0|true))||(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24436)==0&false))? "true" : "false");
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24437);return;
        }

        }__CLR4_1_10iu8iu8lusqjjrl.R.inc(24438);if ((((object == null)&&(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24439)!=0|true))||(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24440)==0&false))) {{
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24441);out.writeNull(SerializerFeature.WriteNullListAsEmpty);
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24442);return;
        }

        }__CLR4_1_10iu8iu8lusqjjrl.R.inc(24443);if ((((object instanceof AtomicIntegerArray)&&(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24444)!=0|true))||(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24445)==0&false))) {{
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24446);AtomicIntegerArray array = (AtomicIntegerArray) object;
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24447);int len = array.length();
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24448);out.write('[');
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24449);for (int i = 0; (((i < len)&&(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24450)!=0|true))||(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24451)==0&false)); ++i) {{
                __CLR4_1_10iu8iu8lusqjjrl.R.inc(24452);int val = array.get(i);
                __CLR4_1_10iu8iu8lusqjjrl.R.inc(24453);if ((((i != 0)&&(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24454)!=0|true))||(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24455)==0&false))) {{
                    __CLR4_1_10iu8iu8lusqjjrl.R.inc(24456);out.write(',');
                }
                }__CLR4_1_10iu8iu8lusqjjrl.R.inc(24457);out.writeInt(val);
            }
            }__CLR4_1_10iu8iu8lusqjjrl.R.inc(24458);out.write(']');
            
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24459);return;
        }
        
        }__CLR4_1_10iu8iu8lusqjjrl.R.inc(24460);AtomicLongArray array = (AtomicLongArray) object;
        __CLR4_1_10iu8iu8lusqjjrl.R.inc(24461);int len = array.length();
        __CLR4_1_10iu8iu8lusqjjrl.R.inc(24462);out.write('[');
        __CLR4_1_10iu8iu8lusqjjrl.R.inc(24463);for (int i = 0; (((i < len)&&(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24464)!=0|true))||(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24465)==0&false)); ++i) {{
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24466);long val = array.get(i);
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24467);if ((((i != 0)&&(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24468)!=0|true))||(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24469)==0&false))) {{
                __CLR4_1_10iu8iu8lusqjjrl.R.inc(24470);out.write(',');
            }
            }__CLR4_1_10iu8iu8lusqjjrl.R.inc(24471);out.writeLong(val);
        }
        }__CLR4_1_10iu8iu8lusqjjrl.R.inc(24472);out.write(']');
    }finally{__CLR4_1_10iu8iu8lusqjjrl.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public <T> T deserialze(DefaultJSONParser parser, Type clazz, Object fieldName) {try{__CLR4_1_10iu8iu8lusqjjrl.R.inc(24473);
        __CLR4_1_10iu8iu8lusqjjrl.R.inc(24474);if ((((parser.lexer.token() == JSONToken.NULL)&&(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24475)!=0|true))||(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24476)==0&false))) {{
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24477);parser.lexer.nextToken(JSONToken.COMMA);
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24478);return null;
        }

        }__CLR4_1_10iu8iu8lusqjjrl.R.inc(24479);JSONArray array = new JSONArray();
        __CLR4_1_10iu8iu8lusqjjrl.R.inc(24480);parser.parseArray(array);

        __CLR4_1_10iu8iu8lusqjjrl.R.inc(24481);if ((((clazz == AtomicIntegerArray.class)&&(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24482)!=0|true))||(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24483)==0&false))) {{
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24484);AtomicIntegerArray atomicArray = new AtomicIntegerArray(array.size());
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24485);for (int i = 0; (((i < array.size())&&(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24486)!=0|true))||(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24487)==0&false)); ++i) {{
                __CLR4_1_10iu8iu8lusqjjrl.R.inc(24488);atomicArray.set(i, array.getInteger(i));
            }
    
            }__CLR4_1_10iu8iu8lusqjjrl.R.inc(24489);return (T) atomicArray;
        }
        
        }__CLR4_1_10iu8iu8lusqjjrl.R.inc(24490);AtomicLongArray atomicArray = new AtomicLongArray(array.size());
        __CLR4_1_10iu8iu8lusqjjrl.R.inc(24491);for (int i = 0; (((i < array.size())&&(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24492)!=0|true))||(__CLR4_1_10iu8iu8lusqjjrl.R.iget(24493)==0&false)); ++i) {{
            __CLR4_1_10iu8iu8lusqjjrl.R.inc(24494);atomicArray.set(i, array.getLong(i));
        }

        }__CLR4_1_10iu8iu8lusqjjrl.R.inc(24495);return (T) atomicArray;
    }finally{__CLR4_1_10iu8iu8lusqjjrl.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_1_10iu8iu8lusqjjrl.R.inc(24496);
        __CLR4_1_10iu8iu8lusqjjrl.R.inc(24497);return JSONToken.LBRACKET;
    }finally{__CLR4_1_10iu8iu8lusqjjrl.R.flushNeeded();}}
}
