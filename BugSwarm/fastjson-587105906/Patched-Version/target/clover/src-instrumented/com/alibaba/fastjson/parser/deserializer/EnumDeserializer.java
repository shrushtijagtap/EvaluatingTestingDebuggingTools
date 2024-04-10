/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.parser.deserializer;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.*;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.util.TypeUtils;

@SuppressWarnings("rawtypes")
public class EnumDeserializer implements ObjectDeserializer {public static class __CLR4_5_2eqaeqalusyjlhw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,19226,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected final Class<?> enumClass;
    protected final Enum[]   enums;
    protected final Enum[]   ordinalEnums;
    protected       long[]   enumNameHashCodes;

    public EnumDeserializer(Class<?> enumClass){try{__CLR4_5_2eqaeqalusyjlhw.R.inc(19090);
        __CLR4_5_2eqaeqalusyjlhw.R.inc(19091);this.enumClass = enumClass;

        __CLR4_5_2eqaeqalusyjlhw.R.inc(19092);ordinalEnums = (Enum[]) enumClass.getEnumConstants();

        __CLR4_5_2eqaeqalusyjlhw.R.inc(19093);Map<Long, Enum> enumMap = new HashMap<Long, Enum>();
        __CLR4_5_2eqaeqalusyjlhw.R.inc(19094);for (int i = 0; (((i < ordinalEnums.length)&&(__CLR4_5_2eqaeqalusyjlhw.R.iget(19095)!=0|true))||(__CLR4_5_2eqaeqalusyjlhw.R.iget(19096)==0&false)); ++i) {{
            __CLR4_5_2eqaeqalusyjlhw.R.inc(19097);Enum e = ordinalEnums[i];
            __CLR4_5_2eqaeqalusyjlhw.R.inc(19098);String name = e.name();

            __CLR4_5_2eqaeqalusyjlhw.R.inc(19099);JSONField jsonField = null;
            __CLR4_5_2eqaeqalusyjlhw.R.inc(19100);try {
                __CLR4_5_2eqaeqalusyjlhw.R.inc(19101);Field field = enumClass.getField(name);
                __CLR4_5_2eqaeqalusyjlhw.R.inc(19102);jsonField = TypeUtils.getAnnotation(field, JSONField.class);
                __CLR4_5_2eqaeqalusyjlhw.R.inc(19103);if ((((jsonField != null)&&(__CLR4_5_2eqaeqalusyjlhw.R.iget(19104)!=0|true))||(__CLR4_5_2eqaeqalusyjlhw.R.iget(19105)==0&false))) {{
                    __CLR4_5_2eqaeqalusyjlhw.R.inc(19106);String jsonFieldName = jsonField.name();
                    __CLR4_5_2eqaeqalusyjlhw.R.inc(19107);if ((((jsonFieldName != null && jsonFieldName.length() > 0)&&(__CLR4_5_2eqaeqalusyjlhw.R.iget(19108)!=0|true))||(__CLR4_5_2eqaeqalusyjlhw.R.iget(19109)==0&false))) {{
                        __CLR4_5_2eqaeqalusyjlhw.R.inc(19110);name = jsonFieldName;
                    }
                }}
            }} catch (Exception ex) {
                // skip
            }

            __CLR4_5_2eqaeqalusyjlhw.R.inc(19111);long hash = 0xcbf29ce484222325L;
            __CLR4_5_2eqaeqalusyjlhw.R.inc(19112);long hash_lower = 0xcbf29ce484222325L;
            __CLR4_5_2eqaeqalusyjlhw.R.inc(19113);for (int j = 0; (((j < name.length())&&(__CLR4_5_2eqaeqalusyjlhw.R.iget(19114)!=0|true))||(__CLR4_5_2eqaeqalusyjlhw.R.iget(19115)==0&false)); ++j) {{
                __CLR4_5_2eqaeqalusyjlhw.R.inc(19116);char ch = name.charAt(j);

                __CLR4_5_2eqaeqalusyjlhw.R.inc(19117);hash ^= ch;
                __CLR4_5_2eqaeqalusyjlhw.R.inc(19118);hash_lower ^= (((((ch >= 'A' && ch <= 'Z') )&&(__CLR4_5_2eqaeqalusyjlhw.R.iget(19119)!=0|true))||(__CLR4_5_2eqaeqalusyjlhw.R.iget(19120)==0&false))? (ch + 32) : ch);

                __CLR4_5_2eqaeqalusyjlhw.R.inc(19121);hash *= 0x100000001b3L;
                __CLR4_5_2eqaeqalusyjlhw.R.inc(19122);hash_lower *= 0x100000001b3L;
            }

            }__CLR4_5_2eqaeqalusyjlhw.R.inc(19123);enumMap.put(hash, e);
            __CLR4_5_2eqaeqalusyjlhw.R.inc(19124);if ((((hash != hash_lower)&&(__CLR4_5_2eqaeqalusyjlhw.R.iget(19125)!=0|true))||(__CLR4_5_2eqaeqalusyjlhw.R.iget(19126)==0&false))) {{
                __CLR4_5_2eqaeqalusyjlhw.R.inc(19127);enumMap.put(hash_lower, e);
            }

            }__CLR4_5_2eqaeqalusyjlhw.R.inc(19128);if ((((jsonField != null)&&(__CLR4_5_2eqaeqalusyjlhw.R.iget(19129)!=0|true))||(__CLR4_5_2eqaeqalusyjlhw.R.iget(19130)==0&false))) {{
                __CLR4_5_2eqaeqalusyjlhw.R.inc(19131);for (String alterName : jsonField.alternateNames()) {{
                    __CLR4_5_2eqaeqalusyjlhw.R.inc(19132);long alterNameHash = 0xcbf29ce484222325L;
                    __CLR4_5_2eqaeqalusyjlhw.R.inc(19133);for (int j = 0; (((j < alterName.length())&&(__CLR4_5_2eqaeqalusyjlhw.R.iget(19134)!=0|true))||(__CLR4_5_2eqaeqalusyjlhw.R.iget(19135)==0&false)); ++j) {{
                        __CLR4_5_2eqaeqalusyjlhw.R.inc(19136);char ch = alterName.charAt(j);
                        __CLR4_5_2eqaeqalusyjlhw.R.inc(19137);alterNameHash ^= ch;
                        __CLR4_5_2eqaeqalusyjlhw.R.inc(19138);alterNameHash *= 0x100000001b3L;
                    }
                    }__CLR4_5_2eqaeqalusyjlhw.R.inc(19139);if ((((alterNameHash != hash && alterNameHash != hash_lower)&&(__CLR4_5_2eqaeqalusyjlhw.R.iget(19140)!=0|true))||(__CLR4_5_2eqaeqalusyjlhw.R.iget(19141)==0&false))) {{
                        __CLR4_5_2eqaeqalusyjlhw.R.inc(19142);enumMap.put(alterNameHash, e);
                    }
                }}
            }}
        }}

        }__CLR4_5_2eqaeqalusyjlhw.R.inc(19143);this.enumNameHashCodes = new long[enumMap.size()];
        {
            __CLR4_5_2eqaeqalusyjlhw.R.inc(19144);int i = 0;
            __CLR4_5_2eqaeqalusyjlhw.R.inc(19145);for (Long h : enumMap.keySet()) {{
                __CLR4_5_2eqaeqalusyjlhw.R.inc(19146);enumNameHashCodes[i++] = h;
            }
            }__CLR4_5_2eqaeqalusyjlhw.R.inc(19147);Arrays.sort(this.enumNameHashCodes);
        }

        __CLR4_5_2eqaeqalusyjlhw.R.inc(19148);this.enums = new Enum[enumNameHashCodes.length];
        __CLR4_5_2eqaeqalusyjlhw.R.inc(19149);for (int i = 0; (((i < this.enumNameHashCodes.length)&&(__CLR4_5_2eqaeqalusyjlhw.R.iget(19150)!=0|true))||(__CLR4_5_2eqaeqalusyjlhw.R.iget(19151)==0&false)); ++i) {{
            __CLR4_5_2eqaeqalusyjlhw.R.inc(19152);long hash = enumNameHashCodes[i];
            __CLR4_5_2eqaeqalusyjlhw.R.inc(19153);Enum e = enumMap.get(hash);
            __CLR4_5_2eqaeqalusyjlhw.R.inc(19154);this.enums[i] = e;
        }
    }}finally{__CLR4_5_2eqaeqalusyjlhw.R.flushNeeded();}}

    public Enum getEnumByHashCode(long hashCode) {try{__CLR4_5_2eqaeqalusyjlhw.R.inc(19155);
        __CLR4_5_2eqaeqalusyjlhw.R.inc(19156);if ((((enums == null)&&(__CLR4_5_2eqaeqalusyjlhw.R.iget(19157)!=0|true))||(__CLR4_5_2eqaeqalusyjlhw.R.iget(19158)==0&false))) {{
            __CLR4_5_2eqaeqalusyjlhw.R.inc(19159);return null;
        }

        }__CLR4_5_2eqaeqalusyjlhw.R.inc(19160);int enumIndex = Arrays.binarySearch(this.enumNameHashCodes, hashCode);

        __CLR4_5_2eqaeqalusyjlhw.R.inc(19161);if ((((enumIndex < 0)&&(__CLR4_5_2eqaeqalusyjlhw.R.iget(19162)!=0|true))||(__CLR4_5_2eqaeqalusyjlhw.R.iget(19163)==0&false))) {{
            __CLR4_5_2eqaeqalusyjlhw.R.inc(19164);return null;
        }

        }__CLR4_5_2eqaeqalusyjlhw.R.inc(19165);return enums[enumIndex];
    }finally{__CLR4_5_2eqaeqalusyjlhw.R.flushNeeded();}}
    
    public Enum<?> valueOf(int ordinal) {try{__CLR4_5_2eqaeqalusyjlhw.R.inc(19166);
        __CLR4_5_2eqaeqalusyjlhw.R.inc(19167);return ordinalEnums[ordinal];
    }finally{__CLR4_5_2eqaeqalusyjlhw.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_2eqaeqalusyjlhw.R.inc(19168);
        __CLR4_5_2eqaeqalusyjlhw.R.inc(19169);try {
            __CLR4_5_2eqaeqalusyjlhw.R.inc(19170);Object value;
            __CLR4_5_2eqaeqalusyjlhw.R.inc(19171);final JSONLexer lexer = parser.lexer;
            __CLR4_5_2eqaeqalusyjlhw.R.inc(19172);final int token = lexer.token();
            __CLR4_5_2eqaeqalusyjlhw.R.inc(19173);if ((((token == JSONToken.LITERAL_INT)&&(__CLR4_5_2eqaeqalusyjlhw.R.iget(19174)!=0|true))||(__CLR4_5_2eqaeqalusyjlhw.R.iget(19175)==0&false))) {{
                __CLR4_5_2eqaeqalusyjlhw.R.inc(19176);int intValue = lexer.intValue();
                __CLR4_5_2eqaeqalusyjlhw.R.inc(19177);lexer.nextToken(JSONToken.COMMA);

                __CLR4_5_2eqaeqalusyjlhw.R.inc(19178);if ((((intValue < 0 || intValue > ordinalEnums.length)&&(__CLR4_5_2eqaeqalusyjlhw.R.iget(19179)!=0|true))||(__CLR4_5_2eqaeqalusyjlhw.R.iget(19180)==0&false))) {{
                    __CLR4_5_2eqaeqalusyjlhw.R.inc(19181);throw new JSONException("parse enum " + enumClass.getName() + " error, value : " + intValue);
                }

                }__CLR4_5_2eqaeqalusyjlhw.R.inc(19182);return (T) ordinalEnums[intValue];
            } }else {__CLR4_5_2eqaeqalusyjlhw.R.inc(19183);if ((((token == JSONToken.LITERAL_STRING)&&(__CLR4_5_2eqaeqalusyjlhw.R.iget(19184)!=0|true))||(__CLR4_5_2eqaeqalusyjlhw.R.iget(19185)==0&false))) {{
                __CLR4_5_2eqaeqalusyjlhw.R.inc(19186);String name = lexer.stringVal();
                __CLR4_5_2eqaeqalusyjlhw.R.inc(19187);lexer.nextToken(JSONToken.COMMA);

                __CLR4_5_2eqaeqalusyjlhw.R.inc(19188);if ((((name.length() == 0)&&(__CLR4_5_2eqaeqalusyjlhw.R.iget(19189)!=0|true))||(__CLR4_5_2eqaeqalusyjlhw.R.iget(19190)==0&false))) {{
                    __CLR4_5_2eqaeqalusyjlhw.R.inc(19191);return (T) null;
                }

                }__CLR4_5_2eqaeqalusyjlhw.R.inc(19192);long hash = 0xcbf29ce484222325L;
                __CLR4_5_2eqaeqalusyjlhw.R.inc(19193);long hash_lower = 0xcbf29ce484222325L;
                __CLR4_5_2eqaeqalusyjlhw.R.inc(19194);for (int j = 0; (((j < name.length())&&(__CLR4_5_2eqaeqalusyjlhw.R.iget(19195)!=0|true))||(__CLR4_5_2eqaeqalusyjlhw.R.iget(19196)==0&false)); ++j) {{
                    __CLR4_5_2eqaeqalusyjlhw.R.inc(19197);char ch = name.charAt(j);

                    __CLR4_5_2eqaeqalusyjlhw.R.inc(19198);hash ^= ch;
                    __CLR4_5_2eqaeqalusyjlhw.R.inc(19199);hash_lower ^= (((((ch >= 'A' && ch <= 'Z') )&&(__CLR4_5_2eqaeqalusyjlhw.R.iget(19200)!=0|true))||(__CLR4_5_2eqaeqalusyjlhw.R.iget(19201)==0&false))? (ch + 32) : ch);

                    __CLR4_5_2eqaeqalusyjlhw.R.inc(19202);hash *= 0x100000001b3L;
                    __CLR4_5_2eqaeqalusyjlhw.R.inc(19203);hash_lower *= 0x100000001b3L;
                }

                }__CLR4_5_2eqaeqalusyjlhw.R.inc(19204);Enum e = getEnumByHashCode(hash);
                __CLR4_5_2eqaeqalusyjlhw.R.inc(19205);if ((((e == null && hash_lower != hash)&&(__CLR4_5_2eqaeqalusyjlhw.R.iget(19206)!=0|true))||(__CLR4_5_2eqaeqalusyjlhw.R.iget(19207)==0&false))) {{
                    __CLR4_5_2eqaeqalusyjlhw.R.inc(19208);e = getEnumByHashCode(hash_lower);
                }

                }__CLR4_5_2eqaeqalusyjlhw.R.inc(19209);if ((((e == null && lexer.isEnabled(Feature.ErrorOnEnumNotMatch))&&(__CLR4_5_2eqaeqalusyjlhw.R.iget(19210)!=0|true))||(__CLR4_5_2eqaeqalusyjlhw.R.iget(19211)==0&false))) {{
                    __CLR4_5_2eqaeqalusyjlhw.R.inc(19212);throw new JSONException("not match enum value, " + enumClass.getName() + " : " + name);
                }
                }__CLR4_5_2eqaeqalusyjlhw.R.inc(19213);return (T) e;
            } }else {__CLR4_5_2eqaeqalusyjlhw.R.inc(19214);if ((((token == JSONToken.NULL)&&(__CLR4_5_2eqaeqalusyjlhw.R.iget(19215)!=0|true))||(__CLR4_5_2eqaeqalusyjlhw.R.iget(19216)==0&false))) {{
                __CLR4_5_2eqaeqalusyjlhw.R.inc(19217);value = null;
                __CLR4_5_2eqaeqalusyjlhw.R.inc(19218);lexer.nextToken(JSONToken.COMMA);

                __CLR4_5_2eqaeqalusyjlhw.R.inc(19219);return null;
            } }else {{
                __CLR4_5_2eqaeqalusyjlhw.R.inc(19220);value = parser.parse();
            }

            }}}__CLR4_5_2eqaeqalusyjlhw.R.inc(19221);throw new JSONException("parse enum " + enumClass.getName() + " error, value : " + value);
        } catch (JSONException e) {
            __CLR4_5_2eqaeqalusyjlhw.R.inc(19222);throw e;
        } catch (Exception e) {
            __CLR4_5_2eqaeqalusyjlhw.R.inc(19223);throw new JSONException(e.getMessage(), e);
        }
    }finally{__CLR4_5_2eqaeqalusyjlhw.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_5_2eqaeqalusyjlhw.R.inc(19224);
        __CLR4_5_2eqaeqalusyjlhw.R.inc(19225);return JSONToken.LITERAL_INT;
    }finally{__CLR4_5_2eqaeqalusyjlhw.R.flushNeeded();}}
}
