/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.parser.deserializer;

import java.lang.reflect.Type;
import java.math.BigDecimal;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.util.TypeUtils;

public class NumberDeserializer implements ObjectDeserializer {public static class __CLR4_5_2gueguelusyjlzc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,21930,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final static NumberDeserializer instance = new NumberDeserializer();

    @SuppressWarnings("unchecked")
    public <T> T deserialze(DefaultJSONParser parser, Type clazz, Object fieldName) {try{__CLR4_5_2gueguelusyjlzc.R.inc(21830);
        __CLR4_5_2gueguelusyjlzc.R.inc(21831);final JSONLexer lexer = parser.lexer;
        __CLR4_5_2gueguelusyjlzc.R.inc(21832);if ((((lexer.token() == JSONToken.LITERAL_INT)&&(__CLR4_5_2gueguelusyjlzc.R.iget(21833)!=0|true))||(__CLR4_5_2gueguelusyjlzc.R.iget(21834)==0&false))) {{
            __CLR4_5_2gueguelusyjlzc.R.inc(21835);if ((((clazz == double.class || clazz  == Double.class)&&(__CLR4_5_2gueguelusyjlzc.R.iget(21836)!=0|true))||(__CLR4_5_2gueguelusyjlzc.R.iget(21837)==0&false))) {{
                __CLR4_5_2gueguelusyjlzc.R.inc(21838);String val = lexer.numberString();
                __CLR4_5_2gueguelusyjlzc.R.inc(21839);lexer.nextToken(JSONToken.COMMA);
                __CLR4_5_2gueguelusyjlzc.R.inc(21840);return (T) Double.valueOf(Double.parseDouble(val));
            }
            
            }__CLR4_5_2gueguelusyjlzc.R.inc(21841);long val = lexer.longValue();
            __CLR4_5_2gueguelusyjlzc.R.inc(21842);lexer.nextToken(JSONToken.COMMA);

            __CLR4_5_2gueguelusyjlzc.R.inc(21843);if ((((clazz == short.class || clazz == Short.class)&&(__CLR4_5_2gueguelusyjlzc.R.iget(21844)!=0|true))||(__CLR4_5_2gueguelusyjlzc.R.iget(21845)==0&false))) {{
                __CLR4_5_2gueguelusyjlzc.R.inc(21846);if ((((val > Short.MAX_VALUE || val < Short.MIN_VALUE)&&(__CLR4_5_2gueguelusyjlzc.R.iget(21847)!=0|true))||(__CLR4_5_2gueguelusyjlzc.R.iget(21848)==0&false))) {{
                    __CLR4_5_2gueguelusyjlzc.R.inc(21849);throw new JSONException("short overflow : " + val);
                }
                }__CLR4_5_2gueguelusyjlzc.R.inc(21850);return (T) Short.valueOf((short) val);
            }

            }__CLR4_5_2gueguelusyjlzc.R.inc(21851);if ((((clazz == byte.class || clazz == Byte.class)&&(__CLR4_5_2gueguelusyjlzc.R.iget(21852)!=0|true))||(__CLR4_5_2gueguelusyjlzc.R.iget(21853)==0&false))) {{
                __CLR4_5_2gueguelusyjlzc.R.inc(21854);if ((((val > Byte.MAX_VALUE || val < Byte.MIN_VALUE)&&(__CLR4_5_2gueguelusyjlzc.R.iget(21855)!=0|true))||(__CLR4_5_2gueguelusyjlzc.R.iget(21856)==0&false))) {{
                    __CLR4_5_2gueguelusyjlzc.R.inc(21857);throw new JSONException("short overflow : " + val);
                }

                }__CLR4_5_2gueguelusyjlzc.R.inc(21858);return (T) Byte.valueOf((byte) val);
            }

            }__CLR4_5_2gueguelusyjlzc.R.inc(21859);if ((((val >= Integer.MIN_VALUE && val <= Integer.MAX_VALUE)&&(__CLR4_5_2gueguelusyjlzc.R.iget(21860)!=0|true))||(__CLR4_5_2gueguelusyjlzc.R.iget(21861)==0&false))) {{
                __CLR4_5_2gueguelusyjlzc.R.inc(21862);return (T) Integer.valueOf((int) val);
            }
            }__CLR4_5_2gueguelusyjlzc.R.inc(21863);return (T) Long.valueOf(val);
        }

        }__CLR4_5_2gueguelusyjlzc.R.inc(21864);if ((((lexer.token() == JSONToken.LITERAL_FLOAT)&&(__CLR4_5_2gueguelusyjlzc.R.iget(21865)!=0|true))||(__CLR4_5_2gueguelusyjlzc.R.iget(21866)==0&false))) {{
            __CLR4_5_2gueguelusyjlzc.R.inc(21867);if ((((clazz == double.class || clazz == Double.class)&&(__CLR4_5_2gueguelusyjlzc.R.iget(21868)!=0|true))||(__CLR4_5_2gueguelusyjlzc.R.iget(21869)==0&false))) {{
                __CLR4_5_2gueguelusyjlzc.R.inc(21870);String val = lexer.numberString();
                __CLR4_5_2gueguelusyjlzc.R.inc(21871);lexer.nextToken(JSONToken.COMMA);
                __CLR4_5_2gueguelusyjlzc.R.inc(21872);return (T) Double.valueOf(Double.parseDouble(val));
            }

            }__CLR4_5_2gueguelusyjlzc.R.inc(21873);if ((((clazz == short.class || clazz == Short.class)&&(__CLR4_5_2gueguelusyjlzc.R.iget(21874)!=0|true))||(__CLR4_5_2gueguelusyjlzc.R.iget(21875)==0&false))) {{
                __CLR4_5_2gueguelusyjlzc.R.inc(21876);BigDecimal val = lexer.decimalValue();
                __CLR4_5_2gueguelusyjlzc.R.inc(21877);lexer.nextToken(JSONToken.COMMA);
                __CLR4_5_2gueguelusyjlzc.R.inc(21878);short shortValue = TypeUtils.shortValue(val);
                __CLR4_5_2gueguelusyjlzc.R.inc(21879);return (T) Short.valueOf(shortValue);
            }

            }__CLR4_5_2gueguelusyjlzc.R.inc(21880);if ((((clazz == byte.class || clazz == Byte.class)&&(__CLR4_5_2gueguelusyjlzc.R.iget(21881)!=0|true))||(__CLR4_5_2gueguelusyjlzc.R.iget(21882)==0&false))) {{
                __CLR4_5_2gueguelusyjlzc.R.inc(21883);BigDecimal val = lexer.decimalValue();
                __CLR4_5_2gueguelusyjlzc.R.inc(21884);lexer.nextToken(JSONToken.COMMA);
                __CLR4_5_2gueguelusyjlzc.R.inc(21885);byte byteValue = TypeUtils.byteValue(val);
                __CLR4_5_2gueguelusyjlzc.R.inc(21886);return (T) Byte.valueOf(byteValue);
            }

            }__CLR4_5_2gueguelusyjlzc.R.inc(21887);BigDecimal val = lexer.decimalValue();
            __CLR4_5_2gueguelusyjlzc.R.inc(21888);lexer.nextToken(JSONToken.COMMA);



            __CLR4_5_2gueguelusyjlzc.R.inc(21889);return (T) val;
        }

        }__CLR4_5_2gueguelusyjlzc.R.inc(21890);if ((((lexer.token() == JSONToken.IDENTIFIER && "NaN".equals(lexer.stringVal()))&&(__CLR4_5_2gueguelusyjlzc.R.iget(21891)!=0|true))||(__CLR4_5_2gueguelusyjlzc.R.iget(21892)==0&false))) {{
            __CLR4_5_2gueguelusyjlzc.R.inc(21893);lexer.nextToken();
            __CLR4_5_2gueguelusyjlzc.R.inc(21894);Object nan = null;
            __CLR4_5_2gueguelusyjlzc.R.inc(21895);if ((((clazz == Double.class)&&(__CLR4_5_2gueguelusyjlzc.R.iget(21896)!=0|true))||(__CLR4_5_2gueguelusyjlzc.R.iget(21897)==0&false))) {{
                __CLR4_5_2gueguelusyjlzc.R.inc(21898);nan = Double.NaN;
            } }else {__CLR4_5_2gueguelusyjlzc.R.inc(21899);if ((((clazz == Float.class)&&(__CLR4_5_2gueguelusyjlzc.R.iget(21900)!=0|true))||(__CLR4_5_2gueguelusyjlzc.R.iget(21901)==0&false))) {{
                __CLR4_5_2gueguelusyjlzc.R.inc(21902);nan = Float.NaN;
            }
            }}__CLR4_5_2gueguelusyjlzc.R.inc(21903);return (T) nan;
        }

        }__CLR4_5_2gueguelusyjlzc.R.inc(21904);Object value = parser.parse();

        __CLR4_5_2gueguelusyjlzc.R.inc(21905);if ((((value == null)&&(__CLR4_5_2gueguelusyjlzc.R.iget(21906)!=0|true))||(__CLR4_5_2gueguelusyjlzc.R.iget(21907)==0&false))) {{
            __CLR4_5_2gueguelusyjlzc.R.inc(21908);return null;
        }

        }__CLR4_5_2gueguelusyjlzc.R.inc(21909);if ((((clazz == double.class || clazz == Double.class)&&(__CLR4_5_2gueguelusyjlzc.R.iget(21910)!=0|true))||(__CLR4_5_2gueguelusyjlzc.R.iget(21911)==0&false))) {{
            __CLR4_5_2gueguelusyjlzc.R.inc(21912);try {
                __CLR4_5_2gueguelusyjlzc.R.inc(21913);return (T) TypeUtils.castToDouble(value);
            } catch (Exception ex) {
                __CLR4_5_2gueguelusyjlzc.R.inc(21914);throw new JSONException("parseDouble error, field : " + fieldName, ex);
            }
        }

        }__CLR4_5_2gueguelusyjlzc.R.inc(21915);if ((((clazz == short.class || clazz == Short.class)&&(__CLR4_5_2gueguelusyjlzc.R.iget(21916)!=0|true))||(__CLR4_5_2gueguelusyjlzc.R.iget(21917)==0&false))) {{
            __CLR4_5_2gueguelusyjlzc.R.inc(21918);try {
                __CLR4_5_2gueguelusyjlzc.R.inc(21919);return (T) TypeUtils.castToShort(value);
            } catch (Exception ex) {
                __CLR4_5_2gueguelusyjlzc.R.inc(21920);throw new JSONException("parseShort error, field : " + fieldName, ex);
            }
        }

        }__CLR4_5_2gueguelusyjlzc.R.inc(21921);if ((((clazz == byte.class || clazz == Byte.class)&&(__CLR4_5_2gueguelusyjlzc.R.iget(21922)!=0|true))||(__CLR4_5_2gueguelusyjlzc.R.iget(21923)==0&false))) {{
            __CLR4_5_2gueguelusyjlzc.R.inc(21924);try {
                __CLR4_5_2gueguelusyjlzc.R.inc(21925);return (T) TypeUtils.castToByte(value);
            } catch (Exception ex) {
                __CLR4_5_2gueguelusyjlzc.R.inc(21926);throw new JSONException("parseByte error, field : " + fieldName, ex);
            }
        }

        }__CLR4_5_2gueguelusyjlzc.R.inc(21927);return (T) TypeUtils.castToBigDecimal(value);
    }finally{__CLR4_5_2gueguelusyjlzc.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_5_2gueguelusyjlzc.R.inc(21928);
        __CLR4_5_2gueguelusyjlzc.R.inc(21929);return JSONToken.LITERAL_INT;
    }finally{__CLR4_5_2gueguelusyjlzc.R.flushNeeded();}}
}
