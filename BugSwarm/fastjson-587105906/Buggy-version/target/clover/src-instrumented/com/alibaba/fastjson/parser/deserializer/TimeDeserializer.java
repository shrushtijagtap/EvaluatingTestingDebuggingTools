/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.parser.deserializer;

import java.lang.reflect.Type;
import java.math.BigDecimal;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.util.TypeUtils;

public class TimeDeserializer implements ObjectDeserializer {public static class __CLR4_1_10hdbhdbluszvykh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,22586,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final static TimeDeserializer instance = new TimeDeserializer();

    @SuppressWarnings("unchecked")
    public <T> T deserialze(DefaultJSONParser parser, Type clazz, Object fieldName) {try{__CLR4_1_10hdbhdbluszvykh.R.inc(22511);
        __CLR4_1_10hdbhdbluszvykh.R.inc(22512);JSONLexer lexer = parser.lexer;
        
        __CLR4_1_10hdbhdbluszvykh.R.inc(22513);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_1_10hdbhdbluszvykh.R.iget(22514)!=0|true))||(__CLR4_1_10hdbhdbluszvykh.R.iget(22515)==0&false))) {{
            __CLR4_1_10hdbhdbluszvykh.R.inc(22516);lexer.nextToken(JSONToken.LITERAL_STRING);
            
            __CLR4_1_10hdbhdbluszvykh.R.inc(22517);if ((((lexer.token() != JSONToken.LITERAL_STRING)&&(__CLR4_1_10hdbhdbluszvykh.R.iget(22518)!=0|true))||(__CLR4_1_10hdbhdbluszvykh.R.iget(22519)==0&false))) {{
                __CLR4_1_10hdbhdbluszvykh.R.inc(22520);throw new JSONException("syntax error");
            }
            
            }__CLR4_1_10hdbhdbluszvykh.R.inc(22521);lexer.nextTokenWithColon(JSONToken.LITERAL_INT);
            
            __CLR4_1_10hdbhdbluszvykh.R.inc(22522);if ((((lexer.token() != JSONToken.LITERAL_INT)&&(__CLR4_1_10hdbhdbluszvykh.R.iget(22523)!=0|true))||(__CLR4_1_10hdbhdbluszvykh.R.iget(22524)==0&false))) {{
                __CLR4_1_10hdbhdbluszvykh.R.inc(22525);throw new JSONException("syntax error");
            }
            
            }__CLR4_1_10hdbhdbluszvykh.R.inc(22526);long time = lexer.longValue();
            __CLR4_1_10hdbhdbluszvykh.R.inc(22527);lexer.nextToken(JSONToken.RBRACE);
            __CLR4_1_10hdbhdbluszvykh.R.inc(22528);if ((((lexer.token() != JSONToken.RBRACE)&&(__CLR4_1_10hdbhdbluszvykh.R.iget(22529)!=0|true))||(__CLR4_1_10hdbhdbluszvykh.R.iget(22530)==0&false))) {{
                __CLR4_1_10hdbhdbluszvykh.R.inc(22531);throw new JSONException("syntax error");
            }
            }__CLR4_1_10hdbhdbluszvykh.R.inc(22532);lexer.nextToken(JSONToken.COMMA);
            
            __CLR4_1_10hdbhdbluszvykh.R.inc(22533);return (T) new java.sql.Time(time);
        }
        
        }__CLR4_1_10hdbhdbluszvykh.R.inc(22534);Object val = parser.parse();

        __CLR4_1_10hdbhdbluszvykh.R.inc(22535);if ((((val == null)&&(__CLR4_1_10hdbhdbluszvykh.R.iget(22536)!=0|true))||(__CLR4_1_10hdbhdbluszvykh.R.iget(22537)==0&false))) {{
            __CLR4_1_10hdbhdbluszvykh.R.inc(22538);return null;
        }

        }__CLR4_1_10hdbhdbluszvykh.R.inc(22539);if ((((val instanceof java.sql.Time)&&(__CLR4_1_10hdbhdbluszvykh.R.iget(22540)!=0|true))||(__CLR4_1_10hdbhdbluszvykh.R.iget(22541)==0&false))) {{
            __CLR4_1_10hdbhdbluszvykh.R.inc(22542);return (T) val;
        } }else {__CLR4_1_10hdbhdbluszvykh.R.inc(22543);if ((((val instanceof BigDecimal)&&(__CLR4_1_10hdbhdbluszvykh.R.iget(22544)!=0|true))||(__CLR4_1_10hdbhdbluszvykh.R.iget(22545)==0&false))) {{
            __CLR4_1_10hdbhdbluszvykh.R.inc(22546);return (T) new java.sql.Time(TypeUtils.longValue((BigDecimal) val));
        } }else {__CLR4_1_10hdbhdbluszvykh.R.inc(22547);if ((((val instanceof Number)&&(__CLR4_1_10hdbhdbluszvykh.R.iget(22548)!=0|true))||(__CLR4_1_10hdbhdbluszvykh.R.iget(22549)==0&false))) {{
            __CLR4_1_10hdbhdbluszvykh.R.inc(22550);return (T) new java.sql.Time(((Number) val).longValue());
        } }else {__CLR4_1_10hdbhdbluszvykh.R.inc(22551);if ((((val instanceof String)&&(__CLR4_1_10hdbhdbluszvykh.R.iget(22552)!=0|true))||(__CLR4_1_10hdbhdbluszvykh.R.iget(22553)==0&false))) {{
            __CLR4_1_10hdbhdbluszvykh.R.inc(22554);String strVal = (String) val;
            __CLR4_1_10hdbhdbluszvykh.R.inc(22555);if ((((strVal.length() == 0)&&(__CLR4_1_10hdbhdbluszvykh.R.iget(22556)!=0|true))||(__CLR4_1_10hdbhdbluszvykh.R.iget(22557)==0&false))) {{
                __CLR4_1_10hdbhdbluszvykh.R.inc(22558);return null;
            }
            
            }__CLR4_1_10hdbhdbluszvykh.R.inc(22559);long longVal;
            __CLR4_1_10hdbhdbluszvykh.R.inc(22560);JSONScanner dateLexer = new JSONScanner(strVal);
            __CLR4_1_10hdbhdbluszvykh.R.inc(22561);if ((((dateLexer.scanISO8601DateIfMatch())&&(__CLR4_1_10hdbhdbluszvykh.R.iget(22562)!=0|true))||(__CLR4_1_10hdbhdbluszvykh.R.iget(22563)==0&false))) {{
                __CLR4_1_10hdbhdbluszvykh.R.inc(22564);longVal = dateLexer.getCalendar().getTimeInMillis();
            } }else {{
                __CLR4_1_10hdbhdbluszvykh.R.inc(22565);boolean isDigit = true;
                __CLR4_1_10hdbhdbluszvykh.R.inc(22566);for (int i = 0; (((i< strVal.length())&&(__CLR4_1_10hdbhdbluszvykh.R.iget(22567)!=0|true))||(__CLR4_1_10hdbhdbluszvykh.R.iget(22568)==0&false)); ++i) {{
                    __CLR4_1_10hdbhdbluszvykh.R.inc(22569);char ch = strVal.charAt(i);
                    __CLR4_1_10hdbhdbluszvykh.R.inc(22570);if ((((ch < '0' || ch > '9')&&(__CLR4_1_10hdbhdbluszvykh.R.iget(22571)!=0|true))||(__CLR4_1_10hdbhdbluszvykh.R.iget(22572)==0&false))) {{
                        __CLR4_1_10hdbhdbluszvykh.R.inc(22573);isDigit = false;
                        __CLR4_1_10hdbhdbluszvykh.R.inc(22574);break;
                    }
                }}
                }__CLR4_1_10hdbhdbluszvykh.R.inc(22575);if ((((!isDigit)&&(__CLR4_1_10hdbhdbluszvykh.R.iget(22576)!=0|true))||(__CLR4_1_10hdbhdbluszvykh.R.iget(22577)==0&false))) {{
                    __CLR4_1_10hdbhdbluszvykh.R.inc(22578);dateLexer.close();
                    __CLR4_1_10hdbhdbluszvykh.R.inc(22579);return (T) java.sql.Time.valueOf(strVal);    
                }
                
                }__CLR4_1_10hdbhdbluszvykh.R.inc(22580);longVal = Long.parseLong(strVal);
            }
            }__CLR4_1_10hdbhdbluszvykh.R.inc(22581);dateLexer.close();
            __CLR4_1_10hdbhdbluszvykh.R.inc(22582);return (T) new java.sql.Time(longVal);
        }
        
        }}}}__CLR4_1_10hdbhdbluszvykh.R.inc(22583);throw new JSONException("parse error");
    }finally{__CLR4_1_10hdbhdbluszvykh.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_1_10hdbhdbluszvykh.R.inc(22584);
        __CLR4_1_10hdbhdbluszvykh.R.inc(22585);return JSONToken.LITERAL_INT;
    }finally{__CLR4_1_10hdbhdbluszvykh.R.flushNeeded();}}
}
