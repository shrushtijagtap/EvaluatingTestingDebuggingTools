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

import com.alibaba.fastjson.util.TypeUtils;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public final class ListSerializer implements ObjectSerializer {public static class __CLR4_1_10l6ql6qluszvzi5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,27561,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final ListSerializer instance = new ListSerializer();

    public final void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features)
                                                                                                       throws IOException {try{__CLR4_1_10l6ql6qluszvzi5.R.inc(27458);

        __CLR4_1_10l6ql6qluszvzi5.R.inc(27459);boolean writeClassName = serializer.out.isEnabled(SerializerFeature.WriteClassName)
                || SerializerFeature.isEnabled(features, SerializerFeature.WriteClassName);

        __CLR4_1_10l6ql6qluszvzi5.R.inc(27460);SerializeWriter out = serializer.out;

        __CLR4_1_10l6ql6qluszvzi5.R.inc(27461);Type elementType = null;
        __CLR4_1_10l6ql6qluszvzi5.R.inc(27462);if ((((writeClassName)&&(__CLR4_1_10l6ql6qluszvzi5.R.iget(27463)!=0|true))||(__CLR4_1_10l6ql6qluszvzi5.R.iget(27464)==0&false))) {{
            __CLR4_1_10l6ql6qluszvzi5.R.inc(27465);elementType = TypeUtils.getCollectionItemType(fieldType);
        }

        }__CLR4_1_10l6ql6qluszvzi5.R.inc(27466);if ((((object == null)&&(__CLR4_1_10l6ql6qluszvzi5.R.iget(27467)!=0|true))||(__CLR4_1_10l6ql6qluszvzi5.R.iget(27468)==0&false))) {{
            __CLR4_1_10l6ql6qluszvzi5.R.inc(27469);out.writeNull(SerializerFeature.WriteNullListAsEmpty);
            __CLR4_1_10l6ql6qluszvzi5.R.inc(27470);return;
        }

        }__CLR4_1_10l6ql6qluszvzi5.R.inc(27471);List<?> list = (List<?>) object;

        __CLR4_1_10l6ql6qluszvzi5.R.inc(27472);if ((((list.size() == 0)&&(__CLR4_1_10l6ql6qluszvzi5.R.iget(27473)!=0|true))||(__CLR4_1_10l6ql6qluszvzi5.R.iget(27474)==0&false))) {{
            __CLR4_1_10l6ql6qluszvzi5.R.inc(27475);out.append("[]");
            __CLR4_1_10l6ql6qluszvzi5.R.inc(27476);return;
        }

        }__CLR4_1_10l6ql6qluszvzi5.R.inc(27477);SerialContext context = serializer.context;
        __CLR4_1_10l6ql6qluszvzi5.R.inc(27478);serializer.setContext(context, object, fieldName, 0);

        __CLR4_1_10l6ql6qluszvzi5.R.inc(27479);ObjectSerializer itemSerializer = null;
        __CLR4_1_10l6ql6qluszvzi5.R.inc(27480);try {
            __CLR4_1_10l6ql6qluszvzi5.R.inc(27481);if ((((out.isEnabled(SerializerFeature.PrettyFormat))&&(__CLR4_1_10l6ql6qluszvzi5.R.iget(27482)!=0|true))||(__CLR4_1_10l6ql6qluszvzi5.R.iget(27483)==0&false))) {{
                __CLR4_1_10l6ql6qluszvzi5.R.inc(27484);out.append('[');
                __CLR4_1_10l6ql6qluszvzi5.R.inc(27485);serializer.incrementIndent();

                __CLR4_1_10l6ql6qluszvzi5.R.inc(27486);int i = 0;
                __CLR4_1_10l6ql6qluszvzi5.R.inc(27487);for (Object item : list) {{
                    __CLR4_1_10l6ql6qluszvzi5.R.inc(27488);if ((((i != 0)&&(__CLR4_1_10l6ql6qluszvzi5.R.iget(27489)!=0|true))||(__CLR4_1_10l6ql6qluszvzi5.R.iget(27490)==0&false))) {{
                        __CLR4_1_10l6ql6qluszvzi5.R.inc(27491);out.append(',');
                    }

                    }__CLR4_1_10l6ql6qluszvzi5.R.inc(27492);serializer.println();
                    __CLR4_1_10l6ql6qluszvzi5.R.inc(27493);if ((((item != null)&&(__CLR4_1_10l6ql6qluszvzi5.R.iget(27494)!=0|true))||(__CLR4_1_10l6ql6qluszvzi5.R.iget(27495)==0&false))) {{
                        __CLR4_1_10l6ql6qluszvzi5.R.inc(27496);if ((((serializer.containsReference(item))&&(__CLR4_1_10l6ql6qluszvzi5.R.iget(27497)!=0|true))||(__CLR4_1_10l6ql6qluszvzi5.R.iget(27498)==0&false))) {{
                            __CLR4_1_10l6ql6qluszvzi5.R.inc(27499);serializer.writeReference(item);
                        } }else {{
                            __CLR4_1_10l6ql6qluszvzi5.R.inc(27500);itemSerializer = serializer.getObjectWriter(item.getClass());
                            __CLR4_1_10l6ql6qluszvzi5.R.inc(27501);SerialContext itemContext = new SerialContext(context, object, fieldName, 0, 0);
                            __CLR4_1_10l6ql6qluszvzi5.R.inc(27502);serializer.context = itemContext;
                            __CLR4_1_10l6ql6qluszvzi5.R.inc(27503);itemSerializer.write(serializer, item, i, elementType, features);
                        }
                    }} }else {{
                        __CLR4_1_10l6ql6qluszvzi5.R.inc(27504);serializer.out.writeNull();
                    }
                    }__CLR4_1_10l6ql6qluszvzi5.R.inc(27505);i++;
                }

                }__CLR4_1_10l6ql6qluszvzi5.R.inc(27506);serializer.decrementIdent();
                __CLR4_1_10l6ql6qluszvzi5.R.inc(27507);serializer.println();
                __CLR4_1_10l6ql6qluszvzi5.R.inc(27508);out.append(']');
                __CLR4_1_10l6ql6qluszvzi5.R.inc(27509);return;
            }

            }__CLR4_1_10l6ql6qluszvzi5.R.inc(27510);out.append('[');
            __CLR4_1_10l6ql6qluszvzi5.R.inc(27511);for (int i = 0, size = list.size(); (((i < size)&&(__CLR4_1_10l6ql6qluszvzi5.R.iget(27512)!=0|true))||(__CLR4_1_10l6ql6qluszvzi5.R.iget(27513)==0&false)); ++i) {{
                __CLR4_1_10l6ql6qluszvzi5.R.inc(27514);Object item = list.get(i);
                __CLR4_1_10l6ql6qluszvzi5.R.inc(27515);if ((((i != 0)&&(__CLR4_1_10l6ql6qluszvzi5.R.iget(27516)!=0|true))||(__CLR4_1_10l6ql6qluszvzi5.R.iget(27517)==0&false))) {{
                    __CLR4_1_10l6ql6qluszvzi5.R.inc(27518);out.append(',');
                }
                
                }__CLR4_1_10l6ql6qluszvzi5.R.inc(27519);if ((((item == null)&&(__CLR4_1_10l6ql6qluszvzi5.R.iget(27520)!=0|true))||(__CLR4_1_10l6ql6qluszvzi5.R.iget(27521)==0&false))) {{
                    __CLR4_1_10l6ql6qluszvzi5.R.inc(27522);out.append("null");
                } }else {{
                    __CLR4_1_10l6ql6qluszvzi5.R.inc(27523);Class<?> clazz = item.getClass();

                    __CLR4_1_10l6ql6qluszvzi5.R.inc(27524);if ((((clazz == Integer.class)&&(__CLR4_1_10l6ql6qluszvzi5.R.iget(27525)!=0|true))||(__CLR4_1_10l6ql6qluszvzi5.R.iget(27526)==0&false))) {{
                        __CLR4_1_10l6ql6qluszvzi5.R.inc(27527);out.writeInt(((Integer) item).intValue());
                    } }else {__CLR4_1_10l6ql6qluszvzi5.R.inc(27528);if ((((clazz == Long.class)&&(__CLR4_1_10l6ql6qluszvzi5.R.iget(27529)!=0|true))||(__CLR4_1_10l6ql6qluszvzi5.R.iget(27530)==0&false))) {{
                        __CLR4_1_10l6ql6qluszvzi5.R.inc(27531);long val = ((Long) item).longValue();
                        __CLR4_1_10l6ql6qluszvzi5.R.inc(27532);if ((((writeClassName)&&(__CLR4_1_10l6ql6qluszvzi5.R.iget(27533)!=0|true))||(__CLR4_1_10l6ql6qluszvzi5.R.iget(27534)==0&false))) {{
                            __CLR4_1_10l6ql6qluszvzi5.R.inc(27535);out.writeLong(val);
                            __CLR4_1_10l6ql6qluszvzi5.R.inc(27536);out.write('L');
                        } }else {{
                            __CLR4_1_10l6ql6qluszvzi5.R.inc(27537);out.writeLong(val);
                        }
                    }} }else {{
                        __CLR4_1_10l6ql6qluszvzi5.R.inc(27538);if (((((SerializerFeature.DisableCircularReferenceDetect.mask & features) != 0)&&(__CLR4_1_10l6ql6qluszvzi5.R.iget(27539)!=0|true))||(__CLR4_1_10l6ql6qluszvzi5.R.iget(27540)==0&false))){{
                            __CLR4_1_10l6ql6qluszvzi5.R.inc(27541);itemSerializer = serializer.getObjectWriter(item.getClass());
                            __CLR4_1_10l6ql6qluszvzi5.R.inc(27542);itemSerializer.write(serializer, item, i, elementType, features);
                        }}else {{
                            __CLR4_1_10l6ql6qluszvzi5.R.inc(27543);if ((((!out.disableCircularReferenceDetect)&&(__CLR4_1_10l6ql6qluszvzi5.R.iget(27544)!=0|true))||(__CLR4_1_10l6ql6qluszvzi5.R.iget(27545)==0&false))) {{
                                __CLR4_1_10l6ql6qluszvzi5.R.inc(27546);SerialContext itemContext = new SerialContext(context, object, fieldName, 0, 0);
                                __CLR4_1_10l6ql6qluszvzi5.R.inc(27547);serializer.context = itemContext;
                            }

                            }__CLR4_1_10l6ql6qluszvzi5.R.inc(27548);if ((((serializer.containsReference(item))&&(__CLR4_1_10l6ql6qluszvzi5.R.iget(27549)!=0|true))||(__CLR4_1_10l6ql6qluszvzi5.R.iget(27550)==0&false))) {{
                                __CLR4_1_10l6ql6qluszvzi5.R.inc(27551);serializer.writeReference(item);
                            } }else {{
                                __CLR4_1_10l6ql6qluszvzi5.R.inc(27552);itemSerializer = serializer.getObjectWriter(item.getClass());
                                __CLR4_1_10l6ql6qluszvzi5.R.inc(27553);if (((((SerializerFeature.WriteClassName.mask & features) != 0
                                        && itemSerializer instanceof JavaBeanSerializer)&&(__CLR4_1_10l6ql6qluszvzi5.R.iget(27554)!=0|true))||(__CLR4_1_10l6ql6qluszvzi5.R.iget(27555)==0&false)))
                                {{
                                    __CLR4_1_10l6ql6qluszvzi5.R.inc(27556);JavaBeanSerializer javaBeanSerializer = (JavaBeanSerializer) itemSerializer;
                                    __CLR4_1_10l6ql6qluszvzi5.R.inc(27557);javaBeanSerializer.writeNoneASM(serializer, item, i, elementType, features);
                                } }else {{
                                    __CLR4_1_10l6ql6qluszvzi5.R.inc(27558);itemSerializer.write(serializer, item, i, elementType, features);
                                }
                            }}
                        }}
                    }}
                }}}
            }}
            }__CLR4_1_10l6ql6qluszvzi5.R.inc(27559);out.append(']');
        } finally {
            __CLR4_1_10l6ql6qluszvzi5.R.inc(27560);serializer.context = context;
        }
    }finally{__CLR4_1_10l6ql6qluszvzi5.R.flushNeeded();}}

}
