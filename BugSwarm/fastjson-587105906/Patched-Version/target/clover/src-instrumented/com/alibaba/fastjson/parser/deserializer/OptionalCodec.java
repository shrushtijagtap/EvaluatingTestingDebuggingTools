/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.parser.deserializer;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.util.TypeUtils;

public class OptionalCodec implements ObjectSerializer, ObjectDeserializer {public static class __CLR4_5_2gx6gx6lusvmrwq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,22019,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static OptionalCodec instance = new OptionalCodec();

    @SuppressWarnings("unchecked")
    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_2gx6gx6lusvmrwq.R.inc(21930);
        
        __CLR4_5_2gx6gx6lusvmrwq.R.inc(21931);if ((((type == OptionalInt.class)&&(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21932)!=0|true))||(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21933)==0&false))) {{
            __CLR4_5_2gx6gx6lusvmrwq.R.inc(21934);Object obj = parser.parseObject(Integer.class);
            __CLR4_5_2gx6gx6lusvmrwq.R.inc(21935);Integer value = TypeUtils.castToInt(obj);
            __CLR4_5_2gx6gx6lusvmrwq.R.inc(21936);if ((((value == null)&&(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21937)!=0|true))||(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21938)==0&false))) {{
                __CLR4_5_2gx6gx6lusvmrwq.R.inc(21939);return (T) OptionalInt.empty();
            } }else {{
                __CLR4_5_2gx6gx6lusvmrwq.R.inc(21940);return (T) OptionalInt.of(value);
            }
        }}
        
        }__CLR4_5_2gx6gx6lusvmrwq.R.inc(21941);if ((((type == OptionalLong.class)&&(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21942)!=0|true))||(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21943)==0&false))) {{
            __CLR4_5_2gx6gx6lusvmrwq.R.inc(21944);Object obj = parser.parseObject(Long.class);
            __CLR4_5_2gx6gx6lusvmrwq.R.inc(21945);Long value = TypeUtils.castToLong(obj);
            __CLR4_5_2gx6gx6lusvmrwq.R.inc(21946);if ((((value == null)&&(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21947)!=0|true))||(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21948)==0&false))) {{
                __CLR4_5_2gx6gx6lusvmrwq.R.inc(21949);return (T) OptionalLong.empty();
            } }else {{
                __CLR4_5_2gx6gx6lusvmrwq.R.inc(21950);return (T) OptionalLong.of(value);
            }
        }}
        
        }__CLR4_5_2gx6gx6lusvmrwq.R.inc(21951);if ((((type == OptionalDouble.class)&&(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21952)!=0|true))||(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21953)==0&false))) {{
            __CLR4_5_2gx6gx6lusvmrwq.R.inc(21954);Object obj = parser.parseObject(Double.class);
            __CLR4_5_2gx6gx6lusvmrwq.R.inc(21955);Double value = TypeUtils.castToDouble(obj);
            __CLR4_5_2gx6gx6lusvmrwq.R.inc(21956);if ((((value == null)&&(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21957)!=0|true))||(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21958)==0&false))) {{
                __CLR4_5_2gx6gx6lusvmrwq.R.inc(21959);return (T) OptionalDouble.empty();
            } }else {{
                __CLR4_5_2gx6gx6lusvmrwq.R.inc(21960);return (T) OptionalDouble.of(value);
            }
        }}
        
        }__CLR4_5_2gx6gx6lusvmrwq.R.inc(21961);type = TypeUtils.unwrapOptional(type);
        __CLR4_5_2gx6gx6lusvmrwq.R.inc(21962);Object value = parser.parseObject(type);
        
        __CLR4_5_2gx6gx6lusvmrwq.R.inc(21963);if ((((value == null)&&(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21964)!=0|true))||(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21965)==0&false))) {{
            __CLR4_5_2gx6gx6lusvmrwq.R.inc(21966);return (T) Optional.empty();
        }
        
        }__CLR4_5_2gx6gx6lusvmrwq.R.inc(21967);return (T) Optional.of(value);
    }finally{__CLR4_5_2gx6gx6lusvmrwq.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_5_2gx6gx6lusvmrwq.R.inc(21968);
        __CLR4_5_2gx6gx6lusvmrwq.R.inc(21969);return JSONToken.LBRACE;
    }finally{__CLR4_5_2gx6gx6lusvmrwq.R.flushNeeded();}}

    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType,
                      int features) throws IOException {try{__CLR4_5_2gx6gx6lusvmrwq.R.inc(21970);

        __CLR4_5_2gx6gx6lusvmrwq.R.inc(21971);if ((((object == null)&&(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21972)!=0|true))||(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21973)==0&false))) {{
            __CLR4_5_2gx6gx6lusvmrwq.R.inc(21974);serializer.writeNull();
            __CLR4_5_2gx6gx6lusvmrwq.R.inc(21975);return;
        }

        }__CLR4_5_2gx6gx6lusvmrwq.R.inc(21976);if ((((object instanceof Optional)&&(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21977)!=0|true))||(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21978)==0&false))) {{
            __CLR4_5_2gx6gx6lusvmrwq.R.inc(21979);Optional<?> optional = (Optional<?>) object;
            __CLR4_5_2gx6gx6lusvmrwq.R.inc(21980);Object value = (((optional.isPresent() )&&(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21981)!=0|true))||(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21982)==0&false))? optional.get() : null;
            __CLR4_5_2gx6gx6lusvmrwq.R.inc(21983);serializer.write(value);
            __CLR4_5_2gx6gx6lusvmrwq.R.inc(21984);return;
        }

        }__CLR4_5_2gx6gx6lusvmrwq.R.inc(21985);if ((((object instanceof OptionalDouble)&&(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21986)!=0|true))||(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21987)==0&false))) {{
            __CLR4_5_2gx6gx6lusvmrwq.R.inc(21988);OptionalDouble optional = (OptionalDouble) object;
            __CLR4_5_2gx6gx6lusvmrwq.R.inc(21989);if ((((optional.isPresent())&&(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21990)!=0|true))||(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21991)==0&false))) {{
                __CLR4_5_2gx6gx6lusvmrwq.R.inc(21992);double value = optional.getAsDouble();
                __CLR4_5_2gx6gx6lusvmrwq.R.inc(21993);serializer.write(value);
            } }else {{
                __CLR4_5_2gx6gx6lusvmrwq.R.inc(21994);serializer.writeNull();
            }
            }__CLR4_5_2gx6gx6lusvmrwq.R.inc(21995);return;
        }
        
        }__CLR4_5_2gx6gx6lusvmrwq.R.inc(21996);if ((((object instanceof OptionalInt)&&(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21997)!=0|true))||(__CLR4_5_2gx6gx6lusvmrwq.R.iget(21998)==0&false))) {{
            __CLR4_5_2gx6gx6lusvmrwq.R.inc(21999);OptionalInt optional = (OptionalInt) object;
            __CLR4_5_2gx6gx6lusvmrwq.R.inc(22000);if ((((optional.isPresent())&&(__CLR4_5_2gx6gx6lusvmrwq.R.iget(22001)!=0|true))||(__CLR4_5_2gx6gx6lusvmrwq.R.iget(22002)==0&false))) {{
                __CLR4_5_2gx6gx6lusvmrwq.R.inc(22003);int value = optional.getAsInt();
                __CLR4_5_2gx6gx6lusvmrwq.R.inc(22004);serializer.out.writeInt(value);
            } }else {{
                __CLR4_5_2gx6gx6lusvmrwq.R.inc(22005);serializer.writeNull();
            }
            }__CLR4_5_2gx6gx6lusvmrwq.R.inc(22006);return;
        }
        
        }__CLR4_5_2gx6gx6lusvmrwq.R.inc(22007);if ((((object instanceof OptionalLong)&&(__CLR4_5_2gx6gx6lusvmrwq.R.iget(22008)!=0|true))||(__CLR4_5_2gx6gx6lusvmrwq.R.iget(22009)==0&false))) {{
            __CLR4_5_2gx6gx6lusvmrwq.R.inc(22010);OptionalLong optional = (OptionalLong) object;
            __CLR4_5_2gx6gx6lusvmrwq.R.inc(22011);if ((((optional.isPresent())&&(__CLR4_5_2gx6gx6lusvmrwq.R.iget(22012)!=0|true))||(__CLR4_5_2gx6gx6lusvmrwq.R.iget(22013)==0&false))) {{
                __CLR4_5_2gx6gx6lusvmrwq.R.inc(22014);long value = optional.getAsLong();
                __CLR4_5_2gx6gx6lusvmrwq.R.inc(22015);serializer.out.writeLong(value);
            } }else {{
                __CLR4_5_2gx6gx6lusvmrwq.R.inc(22016);serializer.writeNull();
            }
            }__CLR4_5_2gx6gx6lusvmrwq.R.inc(22017);return;
        }
        
        }__CLR4_5_2gx6gx6lusvmrwq.R.inc(22018);throw new JSONException("not support optional : " + object.getClass());
    }finally{__CLR4_5_2gx6gx6lusvmrwq.R.flushNeeded();}}

}
