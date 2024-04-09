/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.serializer;

import java.lang.reflect.Type;
import java.util.Collection;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;


public class CharArrayCodec implements ObjectDeserializer {public static class __CLR4_5_2je2je2lusvmtgg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,25180,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @SuppressWarnings("unchecked")
    public <T> T deserialze(DefaultJSONParser parser, Type clazz, Object fieldName) {try{__CLR4_5_2je2je2lusvmtgg.R.inc(25130);
        __CLR4_5_2je2je2lusvmtgg.R.inc(25131);return (T) deserialze(parser);
    }finally{__CLR4_5_2je2je2lusvmtgg.R.flushNeeded();}}
    
    @SuppressWarnings("unchecked")
    public static <T> T deserialze(DefaultJSONParser parser) {try{__CLR4_5_2je2je2lusvmtgg.R.inc(25132);
        __CLR4_5_2je2je2lusvmtgg.R.inc(25133);final JSONLexer lexer = parser.lexer;
        __CLR4_5_2je2je2lusvmtgg.R.inc(25134);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_5_2je2je2lusvmtgg.R.iget(25135)!=0|true))||(__CLR4_5_2je2je2lusvmtgg.R.iget(25136)==0&false))) {{
            __CLR4_5_2je2je2lusvmtgg.R.inc(25137);String val = lexer.stringVal();
            __CLR4_5_2je2je2lusvmtgg.R.inc(25138);lexer.nextToken(JSONToken.COMMA);
            __CLR4_5_2je2je2lusvmtgg.R.inc(25139);return (T) val.toCharArray();
        }
        
        }__CLR4_5_2je2je2lusvmtgg.R.inc(25140);if ((((lexer.token() == JSONToken.LITERAL_INT)&&(__CLR4_5_2je2je2lusvmtgg.R.iget(25141)!=0|true))||(__CLR4_5_2je2je2lusvmtgg.R.iget(25142)==0&false))) {{
            __CLR4_5_2je2je2lusvmtgg.R.inc(25143);Number val = lexer.integerValue();
            __CLR4_5_2je2je2lusvmtgg.R.inc(25144);lexer.nextToken(JSONToken.COMMA);
            __CLR4_5_2je2je2lusvmtgg.R.inc(25145);return (T) val.toString().toCharArray();
        }

        }__CLR4_5_2je2je2lusvmtgg.R.inc(25146);Object value = parser.parse();

        __CLR4_5_2je2je2lusvmtgg.R.inc(25147);if ((((value instanceof  String)&&(__CLR4_5_2je2je2lusvmtgg.R.iget(25148)!=0|true))||(__CLR4_5_2je2je2lusvmtgg.R.iget(25149)==0&false))) {{
            __CLR4_5_2je2je2lusvmtgg.R.inc(25150);return (T) ((String) value).toCharArray();
        }

        }__CLR4_5_2je2je2lusvmtgg.R.inc(25151);if ((((value instanceof Collection)&&(__CLR4_5_2je2je2lusvmtgg.R.iget(25152)!=0|true))||(__CLR4_5_2je2je2lusvmtgg.R.iget(25153)==0&false))) {{
            __CLR4_5_2je2je2lusvmtgg.R.inc(25154);Collection<?> collection = (Collection) value;

            __CLR4_5_2je2je2lusvmtgg.R.inc(25155);boolean accept = true;
            __CLR4_5_2je2je2lusvmtgg.R.inc(25156);for (Object item : collection) {{
                __CLR4_5_2je2je2lusvmtgg.R.inc(25157);if ((((item instanceof String)&&(__CLR4_5_2je2je2lusvmtgg.R.iget(25158)!=0|true))||(__CLR4_5_2je2je2lusvmtgg.R.iget(25159)==0&false))) {{
                    __CLR4_5_2je2je2lusvmtgg.R.inc(25160);int itemLength = ((String) item).length();
                    __CLR4_5_2je2je2lusvmtgg.R.inc(25161);if ((((itemLength != 1)&&(__CLR4_5_2je2je2lusvmtgg.R.iget(25162)!=0|true))||(__CLR4_5_2je2je2lusvmtgg.R.iget(25163)==0&false))) {{
                        __CLR4_5_2je2je2lusvmtgg.R.inc(25164);accept = false;
                        __CLR4_5_2je2je2lusvmtgg.R.inc(25165);break;
                    }
                }}
            }}

            }__CLR4_5_2je2je2lusvmtgg.R.inc(25166);if ((((!accept)&&(__CLR4_5_2je2je2lusvmtgg.R.iget(25167)!=0|true))||(__CLR4_5_2je2je2lusvmtgg.R.iget(25168)==0&false))) {{
                __CLR4_5_2je2je2lusvmtgg.R.inc(25169);throw new JSONException("can not cast to char[]");
            }

            }__CLR4_5_2je2je2lusvmtgg.R.inc(25170);char[] chars = new char[collection.size()];
            __CLR4_5_2je2je2lusvmtgg.R.inc(25171);int pos = 0;
            __CLR4_5_2je2je2lusvmtgg.R.inc(25172);for (Object item : collection) {{
                __CLR4_5_2je2je2lusvmtgg.R.inc(25173);chars[pos++] = ((String) item).charAt(0);
            }
            }__CLR4_5_2je2je2lusvmtgg.R.inc(25174);return (T) chars;
        }

        }__CLR4_5_2je2je2lusvmtgg.R.inc(25175);return (((value == null //
            )&&(__CLR4_5_2je2je2lusvmtgg.R.iget(25176)!=0|true))||(__CLR4_5_2je2je2lusvmtgg.R.iget(25177)==0&false))? null //
            : (T) JSON.toJSONString(value).toCharArray();
    }finally{__CLR4_5_2je2je2lusvmtgg.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_5_2je2je2lusvmtgg.R.inc(25178);
        __CLR4_5_2je2je2lusvmtgg.R.inc(25179);return JSONToken.LITERAL_STRING;
    }finally{__CLR4_5_2je2je2lusvmtgg.R.flushNeeded();}}
}
