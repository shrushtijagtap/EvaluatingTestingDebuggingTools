/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.parser.deserializer;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.*;

public abstract class AbstractDateDeserializer extends ContextObjectDeserializer implements ObjectDeserializer {public static class __CLR4_5_2ef4ef4lusyjlfb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,18827,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public <T> T deserialze(DefaultJSONParser parser, Type clazz, Object fieldName) {try{__CLR4_5_2ef4ef4lusyjlfb.R.inc(18688);
        __CLR4_5_2ef4ef4lusyjlfb.R.inc(18689);return deserialze(parser, clazz, fieldName, null, 0);
    }finally{__CLR4_5_2ef4ef4lusyjlfb.R.flushNeeded();}}
    
    @Override
    @SuppressWarnings("unchecked")
    public <T> T deserialze(DefaultJSONParser parser, Type clazz, Object fieldName, String format, int features) {try{__CLR4_5_2ef4ef4lusyjlfb.R.inc(18690);
        __CLR4_5_2ef4ef4lusyjlfb.R.inc(18691);JSONLexer lexer = parser.lexer;

        __CLR4_5_2ef4ef4lusyjlfb.R.inc(18692);Object val;
        __CLR4_5_2ef4ef4lusyjlfb.R.inc(18693);if ((((lexer.token() == JSONToken.LITERAL_INT)&&(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18694)!=0|true))||(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18695)==0&false))) {{
            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18696);long millis = lexer.longValue();
            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18697);lexer.nextToken(JSONToken.COMMA);
            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18698);if (((("unixtime".equals(format))&&(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18699)!=0|true))||(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18700)==0&false))) {{
                __CLR4_5_2ef4ef4lusyjlfb.R.inc(18701);millis *= 1000;
            }
            }__CLR4_5_2ef4ef4lusyjlfb.R.inc(18702);val = millis;
        } }else {__CLR4_5_2ef4ef4lusyjlfb.R.inc(18703);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18704)!=0|true))||(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18705)==0&false))) {{
            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18706);String strVal = lexer.stringVal();
            
            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18707);if ((((format != null)&&(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18708)!=0|true))||(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18709)==0&false))) {{
                __CLR4_5_2ef4ef4lusyjlfb.R.inc(18710);SimpleDateFormat simpleDateFormat = null;
                __CLR4_5_2ef4ef4lusyjlfb.R.inc(18711);try {
                    __CLR4_5_2ef4ef4lusyjlfb.R.inc(18712);simpleDateFormat = new SimpleDateFormat(format, parser.lexer.getLocale());
                } catch (IllegalArgumentException ex) {
                    __CLR4_5_2ef4ef4lusyjlfb.R.inc(18713);if ((((format.contains("T"))&&(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18714)!=0|true))||(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18715)==0&false))) {{
                        __CLR4_5_2ef4ef4lusyjlfb.R.inc(18716);String fromat2 = format.replaceAll("T", "'T'");
                        __CLR4_5_2ef4ef4lusyjlfb.R.inc(18717);try {
                        __CLR4_5_2ef4ef4lusyjlfb.R.inc(18718);simpleDateFormat = new SimpleDateFormat(fromat2, parser.lexer.getLocale());
                        } catch (IllegalArgumentException e2) {
                            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18719);throw ex;
                        }
                    }
                }}

                __CLR4_5_2ef4ef4lusyjlfb.R.inc(18720);if ((((JSON.defaultTimeZone != null)&&(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18721)!=0|true))||(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18722)==0&false))) {{
                    __CLR4_5_2ef4ef4lusyjlfb.R.inc(18723);simpleDateFormat.setTimeZone(parser.lexer.getTimeZone());
                }

                }__CLR4_5_2ef4ef4lusyjlfb.R.inc(18724);try {
                    __CLR4_5_2ef4ef4lusyjlfb.R.inc(18725);val = simpleDateFormat.parse(strVal);
                } catch (ParseException ex) {
                    __CLR4_5_2ef4ef4lusyjlfb.R.inc(18726);val = null;
                    // skip
                }

                __CLR4_5_2ef4ef4lusyjlfb.R.inc(18727);if ((((val == null && JSON.defaultLocale == Locale.CHINA)&&(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18728)!=0|true))||(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18729)==0&false))) {{
                    __CLR4_5_2ef4ef4lusyjlfb.R.inc(18730);try {
                        __CLR4_5_2ef4ef4lusyjlfb.R.inc(18731);simpleDateFormat = new SimpleDateFormat(format, Locale.US);
                    } catch (IllegalArgumentException ex) {
                        __CLR4_5_2ef4ef4lusyjlfb.R.inc(18732);if ((((format.contains("T"))&&(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18733)!=0|true))||(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18734)==0&false))) {{
                            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18735);String fromat2 = format.replaceAll("T", "'T'");
                            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18736);try {
                                __CLR4_5_2ef4ef4lusyjlfb.R.inc(18737);simpleDateFormat = new SimpleDateFormat(fromat2, parser.lexer.getLocale());
                            } catch (IllegalArgumentException e2) {
                                __CLR4_5_2ef4ef4lusyjlfb.R.inc(18738);throw ex;
                            }
                        }
                    }}
                    __CLR4_5_2ef4ef4lusyjlfb.R.inc(18739);simpleDateFormat.setTimeZone(parser.lexer.getTimeZone());

                    __CLR4_5_2ef4ef4lusyjlfb.R.inc(18740);try {
                        __CLR4_5_2ef4ef4lusyjlfb.R.inc(18741);val = simpleDateFormat.parse(strVal);
                    } catch (ParseException ex) {
                        __CLR4_5_2ef4ef4lusyjlfb.R.inc(18742);val = null;
                        // skip
                    }
                }

                }__CLR4_5_2ef4ef4lusyjlfb.R.inc(18743);if ((((val == null)&&(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18744)!=0|true))||(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18745)==0&false))) {{
                    __CLR4_5_2ef4ef4lusyjlfb.R.inc(18746);if ((((format.equals("yyyy-MM-dd'T'HH:mm:ss.SSS") //
                            && strVal.length() == 19)&&(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18747)!=0|true))||(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18748)==0&false))) {{
                        __CLR4_5_2ef4ef4lusyjlfb.R.inc(18749);try {
                            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18750);SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", JSON.defaultLocale);
                            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18751);df.setTimeZone(JSON.defaultTimeZone);
                            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18752);val = df.parse(strVal);
                        } catch (ParseException ex2) {
                            // skip
                            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18753);val = null;
                        }
                    } }else {{
                        // skip
                        __CLR4_5_2ef4ef4lusyjlfb.R.inc(18754);val = null;
                    }
                }}
            }} }else {{
                __CLR4_5_2ef4ef4lusyjlfb.R.inc(18755);val = null;
            }
            
            }__CLR4_5_2ef4ef4lusyjlfb.R.inc(18756);if ((((val == null)&&(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18757)!=0|true))||(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18758)==0&false))) {{
                __CLR4_5_2ef4ef4lusyjlfb.R.inc(18759);val = strVal;
                __CLR4_5_2ef4ef4lusyjlfb.R.inc(18760);lexer.nextToken(JSONToken.COMMA);
                
                __CLR4_5_2ef4ef4lusyjlfb.R.inc(18761);if ((((lexer.isEnabled(Feature.AllowISO8601DateFormat))&&(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18762)!=0|true))||(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18763)==0&false))) {{
                    __CLR4_5_2ef4ef4lusyjlfb.R.inc(18764);JSONScanner iso8601Lexer = new JSONScanner(strVal);
                    __CLR4_5_2ef4ef4lusyjlfb.R.inc(18765);if ((((iso8601Lexer.scanISO8601DateIfMatch())&&(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18766)!=0|true))||(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18767)==0&false))) {{
                        __CLR4_5_2ef4ef4lusyjlfb.R.inc(18768);val = iso8601Lexer.getCalendar().getTime();
                    }
                    }__CLR4_5_2ef4ef4lusyjlfb.R.inc(18769);iso8601Lexer.close();
                }
            }}
        }} }else {__CLR4_5_2ef4ef4lusyjlfb.R.inc(18770);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18771)!=0|true))||(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18772)==0&false))) {{
            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18773);lexer.nextToken();
            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18774);val = null;
        } }else {__CLR4_5_2ef4ef4lusyjlfb.R.inc(18775);if ((((lexer.token() == JSONToken.LBRACE)&&(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18776)!=0|true))||(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18777)==0&false))) {{
            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18778);lexer.nextToken();
            
            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18779);String key;
            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18780);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18781)!=0|true))||(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18782)==0&false))) {{
                __CLR4_5_2ef4ef4lusyjlfb.R.inc(18783);key = lexer.stringVal();
                
                __CLR4_5_2ef4ef4lusyjlfb.R.inc(18784);if ((((JSON.DEFAULT_TYPE_KEY.equals(key))&&(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18785)!=0|true))||(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18786)==0&false))) {{
                    __CLR4_5_2ef4ef4lusyjlfb.R.inc(18787);lexer.nextToken();
                    __CLR4_5_2ef4ef4lusyjlfb.R.inc(18788);parser.accept(JSONToken.COLON);
                    
                    __CLR4_5_2ef4ef4lusyjlfb.R.inc(18789);String typeName = lexer.stringVal();
                    __CLR4_5_2ef4ef4lusyjlfb.R.inc(18790);Class<?> type = parser.getConfig().checkAutoType(typeName, null, lexer.getFeatures());
                    __CLR4_5_2ef4ef4lusyjlfb.R.inc(18791);if ((((type != null)&&(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18792)!=0|true))||(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18793)==0&false))) {{
                        __CLR4_5_2ef4ef4lusyjlfb.R.inc(18794);clazz = type;
                    }
                    
                    }__CLR4_5_2ef4ef4lusyjlfb.R.inc(18795);parser.accept(JSONToken.LITERAL_STRING);
                    __CLR4_5_2ef4ef4lusyjlfb.R.inc(18796);parser.accept(JSONToken.COMMA);
                }
                
                }__CLR4_5_2ef4ef4lusyjlfb.R.inc(18797);lexer.nextTokenWithColon(JSONToken.LITERAL_INT);
            } }else {{
                __CLR4_5_2ef4ef4lusyjlfb.R.inc(18798);throw new JSONException("syntax error");
            }
            
            }__CLR4_5_2ef4ef4lusyjlfb.R.inc(18799);long timeMillis;
            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18800);if ((((lexer.token() == JSONToken.LITERAL_INT)&&(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18801)!=0|true))||(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18802)==0&false))) {{
                __CLR4_5_2ef4ef4lusyjlfb.R.inc(18803);timeMillis = lexer.longValue();
                __CLR4_5_2ef4ef4lusyjlfb.R.inc(18804);lexer.nextToken();
            } }else {{
                __CLR4_5_2ef4ef4lusyjlfb.R.inc(18805);throw new JSONException("syntax error : " + lexer.tokenName());
            }
            
            }__CLR4_5_2ef4ef4lusyjlfb.R.inc(18806);val = timeMillis;
            
            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18807);parser.accept(JSONToken.RBRACE);
        } }else {__CLR4_5_2ef4ef4lusyjlfb.R.inc(18808);if ((((parser.getResolveStatus() == DefaultJSONParser.TypeNameRedirect)&&(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18809)!=0|true))||(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18810)==0&false))) {{
            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18811);parser.setResolveStatus(DefaultJSONParser.NONE);
            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18812);parser.accept(JSONToken.COMMA);

            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18813);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18814)!=0|true))||(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18815)==0&false))) {{
                __CLR4_5_2ef4ef4lusyjlfb.R.inc(18816);if ((((!"val".equals(lexer.stringVal()))&&(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18817)!=0|true))||(__CLR4_5_2ef4ef4lusyjlfb.R.iget(18818)==0&false))) {{
                    __CLR4_5_2ef4ef4lusyjlfb.R.inc(18819);throw new JSONException("syntax error");
                }
                }__CLR4_5_2ef4ef4lusyjlfb.R.inc(18820);lexer.nextToken();
            } }else {{
                __CLR4_5_2ef4ef4lusyjlfb.R.inc(18821);throw new JSONException("syntax error");
            }

            }__CLR4_5_2ef4ef4lusyjlfb.R.inc(18822);parser.accept(JSONToken.COLON);

            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18823);val = parser.parse();

            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18824);parser.accept(JSONToken.RBRACE);
        } }else {{
            __CLR4_5_2ef4ef4lusyjlfb.R.inc(18825);val = parser.parse();
        }

        }}}}}__CLR4_5_2ef4ef4lusyjlfb.R.inc(18826);return (T) cast(parser, clazz, fieldName, val);
    }finally{__CLR4_5_2ef4ef4lusyjlfb.R.flushNeeded();}}

    protected abstract <T> T cast(DefaultJSONParser parser, Type clazz, Object fieldName, Object value);
}
