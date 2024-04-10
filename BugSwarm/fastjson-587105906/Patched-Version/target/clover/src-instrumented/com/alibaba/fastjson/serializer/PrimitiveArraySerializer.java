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
public class PrimitiveArraySerializer implements ObjectSerializer {public static class __CLR4_5_2lw4lw4lusyjn4q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,28487,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static PrimitiveArraySerializer instance = new PrimitiveArraySerializer();

    public final void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {try{__CLR4_5_2lw4lw4lusyjn4q.R.inc(28372);
        __CLR4_5_2lw4lw4lusyjn4q.R.inc(28373);SerializeWriter out = serializer.out;
        
        __CLR4_5_2lw4lw4lusyjn4q.R.inc(28374);if ((((object == null)&&(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28375)!=0|true))||(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28376)==0&false))) {{
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28377);out.writeNull(SerializerFeature.WriteNullListAsEmpty);
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28378);return;
        }
        
        }__CLR4_5_2lw4lw4lusyjn4q.R.inc(28379);if ((((object instanceof int[])&&(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28380)!=0|true))||(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28381)==0&false))) {{
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28382);int[] array = (int[]) object;
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28383);out.write('[');
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28384);for (int i = 0; (((i < array.length)&&(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28385)!=0|true))||(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28386)==0&false)); ++i) {{
                __CLR4_5_2lw4lw4lusyjn4q.R.inc(28387);if ((((i != 0)&&(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28388)!=0|true))||(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28389)==0&false))) {{
                    __CLR4_5_2lw4lw4lusyjn4q.R.inc(28390);out.write(',');
                }
                }__CLR4_5_2lw4lw4lusyjn4q.R.inc(28391);out.writeInt(array[i]);
            }
            }__CLR4_5_2lw4lw4lusyjn4q.R.inc(28392);out.write(']');
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28393);return;
        }
        
        }__CLR4_5_2lw4lw4lusyjn4q.R.inc(28394);if ((((object instanceof short[])&&(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28395)!=0|true))||(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28396)==0&false))) {{
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28397);short[] array = (short[]) object;
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28398);out.write('[');
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28399);for (int i = 0; (((i < array.length)&&(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28400)!=0|true))||(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28401)==0&false)); ++i) {{
                __CLR4_5_2lw4lw4lusyjn4q.R.inc(28402);if ((((i != 0)&&(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28403)!=0|true))||(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28404)==0&false))) {{
                    __CLR4_5_2lw4lw4lusyjn4q.R.inc(28405);out.write(',');
                }
                }__CLR4_5_2lw4lw4lusyjn4q.R.inc(28406);out.writeInt(array[i]);
            }
            }__CLR4_5_2lw4lw4lusyjn4q.R.inc(28407);out.write(']');
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28408);return;
        }
        
        }__CLR4_5_2lw4lw4lusyjn4q.R.inc(28409);if ((((object instanceof long[])&&(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28410)!=0|true))||(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28411)==0&false))) {{
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28412);long[] array = (long[]) object;

            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28413);out.write('[');
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28414);for (int i = 0; (((i < array.length)&&(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28415)!=0|true))||(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28416)==0&false)); ++i) {{
                __CLR4_5_2lw4lw4lusyjn4q.R.inc(28417);if ((((i != 0)&&(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28418)!=0|true))||(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28419)==0&false))) {{
                    __CLR4_5_2lw4lw4lusyjn4q.R.inc(28420);out.write(',');
                }
                }__CLR4_5_2lw4lw4lusyjn4q.R.inc(28421);out.writeLong(array[i]);
            }
            }__CLR4_5_2lw4lw4lusyjn4q.R.inc(28422);out.write(']');
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28423);return;
        }
        
        }__CLR4_5_2lw4lw4lusyjn4q.R.inc(28424);if ((((object instanceof boolean[])&&(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28425)!=0|true))||(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28426)==0&false))) {{
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28427);boolean[] array = (boolean[]) object;
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28428);out.write('[');
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28429);for (int i = 0; (((i < array.length)&&(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28430)!=0|true))||(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28431)==0&false)); ++i) {{
                __CLR4_5_2lw4lw4lusyjn4q.R.inc(28432);if ((((i != 0)&&(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28433)!=0|true))||(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28434)==0&false))) {{
                    __CLR4_5_2lw4lw4lusyjn4q.R.inc(28435);out.write(',');
                }
                }__CLR4_5_2lw4lw4lusyjn4q.R.inc(28436);out.write(array[i]);
            }
            }__CLR4_5_2lw4lw4lusyjn4q.R.inc(28437);out.write(']');
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28438);return;
        }
        
        }__CLR4_5_2lw4lw4lusyjn4q.R.inc(28439);if ((((object instanceof float[])&&(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28440)!=0|true))||(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28441)==0&false))) {{
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28442);float[] array = (float[]) object;
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28443);out.write('[');
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28444);for (int i = 0; (((i < array.length)&&(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28445)!=0|true))||(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28446)==0&false)); ++i) {{
                __CLR4_5_2lw4lw4lusyjn4q.R.inc(28447);if ((((i != 0)&&(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28448)!=0|true))||(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28449)==0&false))) {{
                    __CLR4_5_2lw4lw4lusyjn4q.R.inc(28450);out.write(',');
                }
                
                }__CLR4_5_2lw4lw4lusyjn4q.R.inc(28451);float item = array[i];
                __CLR4_5_2lw4lw4lusyjn4q.R.inc(28452);if ((((Float.isNaN(item))&&(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28453)!=0|true))||(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28454)==0&false))) {{
                    __CLR4_5_2lw4lw4lusyjn4q.R.inc(28455);out.writeNull();
                } }else {{
                    __CLR4_5_2lw4lw4lusyjn4q.R.inc(28456);out.append(Float.toString(item));
                }
            }}
            }__CLR4_5_2lw4lw4lusyjn4q.R.inc(28457);out.write(']');
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28458);return;
        }
        
        }__CLR4_5_2lw4lw4lusyjn4q.R.inc(28459);if ((((object instanceof double[])&&(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28460)!=0|true))||(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28461)==0&false))) {{
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28462);double[] array = (double[]) object;
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28463);out.write('[');
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28464);for (int i = 0; (((i < array.length)&&(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28465)!=0|true))||(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28466)==0&false)); ++i) {{
                __CLR4_5_2lw4lw4lusyjn4q.R.inc(28467);if ((((i != 0)&&(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28468)!=0|true))||(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28469)==0&false))) {{
                    __CLR4_5_2lw4lw4lusyjn4q.R.inc(28470);out.write(',');
                }
                
                }__CLR4_5_2lw4lw4lusyjn4q.R.inc(28471);double item = array[i];
                __CLR4_5_2lw4lw4lusyjn4q.R.inc(28472);if ((((Double.isNaN(item))&&(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28473)!=0|true))||(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28474)==0&false))) {{
                    __CLR4_5_2lw4lw4lusyjn4q.R.inc(28475);out.writeNull();
                } }else {{
                    __CLR4_5_2lw4lw4lusyjn4q.R.inc(28476);out.append(Double.toString(item));
                }
            }}
            }__CLR4_5_2lw4lw4lusyjn4q.R.inc(28477);out.write(']');
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28478);return;
        }
        
        }__CLR4_5_2lw4lw4lusyjn4q.R.inc(28479);if ((((object instanceof byte[])&&(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28480)!=0|true))||(__CLR4_5_2lw4lw4lusyjn4q.R.iget(28481)==0&false))) {{
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28482);byte[] array = (byte[]) object;
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28483);out.writeByteArray(array);
            __CLR4_5_2lw4lw4lusyjn4q.R.inc(28484);return;
        }
        
        }__CLR4_5_2lw4lw4lusyjn4q.R.inc(28485);char[] chars = (char[]) object;
        __CLR4_5_2lw4lw4lusyjn4q.R.inc(28486);out.writeString(chars);
    }finally{__CLR4_5_2lw4lw4lusyjn4q.R.flushNeeded();}}
}
