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

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class ArraySerializer implements ObjectSerializer {public static class __CLR4_5_2it4it4lusvmt5a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,24416,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	private final Class<?> componentType;
    private final ObjectSerializer compObjectSerializer;

    public ArraySerializer(Class<?> componentType, ObjectSerializer compObjectSerializer){try{__CLR4_5_2it4it4lusvmt5a.R.inc(24376);
        __CLR4_5_2it4it4lusvmt5a.R.inc(24377);this.componentType = componentType;
        __CLR4_5_2it4it4lusvmt5a.R.inc(24378);this.compObjectSerializer = compObjectSerializer;
    }finally{__CLR4_5_2it4it4lusvmt5a.R.flushNeeded();}}

    public final void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features)
                                                                                                       throws IOException {try{__CLR4_5_2it4it4lusvmt5a.R.inc(24379);
        __CLR4_5_2it4it4lusvmt5a.R.inc(24380);SerializeWriter out = serializer.out;

        __CLR4_5_2it4it4lusvmt5a.R.inc(24381);if ((((object == null)&&(__CLR4_5_2it4it4lusvmt5a.R.iget(24382)!=0|true))||(__CLR4_5_2it4it4lusvmt5a.R.iget(24383)==0&false))) {{
            __CLR4_5_2it4it4lusvmt5a.R.inc(24384);out.writeNull(SerializerFeature.WriteNullListAsEmpty);
            __CLR4_5_2it4it4lusvmt5a.R.inc(24385);return;
        }

        }__CLR4_5_2it4it4lusvmt5a.R.inc(24386);Object[] array = (Object[]) object;
        __CLR4_5_2it4it4lusvmt5a.R.inc(24387);int size = array.length;

        __CLR4_5_2it4it4lusvmt5a.R.inc(24388);SerialContext context = serializer.context;
        __CLR4_5_2it4it4lusvmt5a.R.inc(24389);serializer.setContext(context, object, fieldName, 0);

        __CLR4_5_2it4it4lusvmt5a.R.inc(24390);try {
            __CLR4_5_2it4it4lusvmt5a.R.inc(24391);out.append('[');
            __CLR4_5_2it4it4lusvmt5a.R.inc(24392);for (int i = 0; (((i < size)&&(__CLR4_5_2it4it4lusvmt5a.R.iget(24393)!=0|true))||(__CLR4_5_2it4it4lusvmt5a.R.iget(24394)==0&false)); ++i) {{
            	__CLR4_5_2it4it4lusvmt5a.R.inc(24395);if ((((i != 0)&&(__CLR4_5_2it4it4lusvmt5a.R.iget(24396)!=0|true))||(__CLR4_5_2it4it4lusvmt5a.R.iget(24397)==0&false))) {{
            		__CLR4_5_2it4it4lusvmt5a.R.inc(24398);out.append(',');
            	}
                }__CLR4_5_2it4it4lusvmt5a.R.inc(24399);Object item = array[i];

                __CLR4_5_2it4it4lusvmt5a.R.inc(24400);if ((((item == null)&&(__CLR4_5_2it4it4lusvmt5a.R.iget(24401)!=0|true))||(__CLR4_5_2it4it4lusvmt5a.R.iget(24402)==0&false))) {{
                    __CLR4_5_2it4it4lusvmt5a.R.inc(24403);if ((((out.isEnabled(SerializerFeature.WriteNullStringAsEmpty) && object instanceof String[])&&(__CLR4_5_2it4it4lusvmt5a.R.iget(24404)!=0|true))||(__CLR4_5_2it4it4lusvmt5a.R.iget(24405)==0&false))) {{
                        __CLR4_5_2it4it4lusvmt5a.R.inc(24406);out.writeString("");
                    } }else {{
                        __CLR4_5_2it4it4lusvmt5a.R.inc(24407);out.append("null");
                    }
                }} }else {__CLR4_5_2it4it4lusvmt5a.R.inc(24408);if ((((item.getClass() == componentType)&&(__CLR4_5_2it4it4lusvmt5a.R.iget(24409)!=0|true))||(__CLR4_5_2it4it4lusvmt5a.R.iget(24410)==0&false))) {{
                	__CLR4_5_2it4it4lusvmt5a.R.inc(24411);compObjectSerializer.write(serializer, item, i, null, 0);
                } }else {{
                	__CLR4_5_2it4it4lusvmt5a.R.inc(24412);ObjectSerializer itemSerializer = serializer.getObjectWriter(item.getClass());
                	__CLR4_5_2it4it4lusvmt5a.R.inc(24413);itemSerializer.write(serializer, item, i, null, 0);
                }
            }}}
            }__CLR4_5_2it4it4lusvmt5a.R.inc(24414);out.append(']');
        } finally {
            __CLR4_5_2it4it4lusvmt5a.R.inc(24415);serializer.context = context;
        }
    }finally{__CLR4_5_2it4it4lusvmt5a.R.flushNeeded();}}
}
