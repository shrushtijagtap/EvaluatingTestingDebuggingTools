/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.TimeZone;

import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import org.joda.time.*;
import org.joda.time.format.*;

public class JodaCodec implements ObjectSerializer, ContextObjectSerializer, ObjectDeserializer {public static class __CLR4_5_2ku5ku5lusvmu3o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,27435,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public final static JodaCodec instance = new JodaCodec();

    private final static String            defaultPatttern     = "yyyy-MM-dd HH:mm:ss";
    private final static DateTimeFormatter defaultFormatter    = DateTimeFormat.forPattern(defaultPatttern);
    private final static DateTimeFormatter defaultFormatter_23 = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.SSS");
    private final static DateTimeFormatter formatter_dt19_tw   = DateTimeFormat.forPattern("yyyy/MM/dd HH:mm:ss");
    private final static DateTimeFormatter formatter_dt19_cn   = DateTimeFormat.forPattern("yyyy\u5e74M\u6708d\u65e5 HH:mm:ss");
    private final static DateTimeFormatter formatter_dt19_cn_1 = DateTimeFormat.forPattern("yyyy\u5e74M\u6708d\u65e5 H\u65f6m\u5206s\u79d2");
    private final static DateTimeFormatter formatter_dt19_kr   = DateTimeFormat.forPattern("yyyy\ub144M\uc6d4d\uc77c HH:mm:ss");
    private final static DateTimeFormatter formatter_dt19_us   = DateTimeFormat.forPattern("MM/dd/yyyy HH:mm:ss");
    private final static DateTimeFormatter formatter_dt19_eur  = DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss");
    private final static DateTimeFormatter formatter_dt19_de   = DateTimeFormat.forPattern("dd.MM.yyyy HH:mm:ss");
    private final static DateTimeFormatter formatter_dt19_in   = DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss");

    private final static DateTimeFormatter formatter_d8        = DateTimeFormat.forPattern("yyyyMMdd");
    private final static DateTimeFormatter formatter_d10_tw    = DateTimeFormat.forPattern("yyyy/MM/dd");
    private final static DateTimeFormatter formatter_d10_cn    = DateTimeFormat.forPattern("yyyy\u5e74M\u6708d\u65e5");
    private final static DateTimeFormatter formatter_d10_kr    = DateTimeFormat.forPattern("yyyy\ub144M\uc6d4d\uc77c");
    private final static DateTimeFormatter formatter_d10_us    = DateTimeFormat.forPattern("MM/dd/yyyy");
    private final static DateTimeFormatter formatter_d10_eur   = DateTimeFormat.forPattern("dd/MM/yyyy");
    private final static DateTimeFormatter formatter_d10_de    = DateTimeFormat.forPattern("dd.MM.yyyy");
    private final static DateTimeFormatter formatter_d10_in    = DateTimeFormat.forPattern("dd-MM-yyyy");

    private final static DateTimeFormatter ISO_FIXED_FORMAT =
            DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss").withZone(DateTimeZone.getDefault());

    private final static String formatter_iso8601_pattern     = "yyyy-MM-dd'T'HH:mm:ss";
    private final static String formatter_iso8601_pattern_23     = "yyyy-MM-dd'T'HH:mm:ss.SSS";
    private final static String formatter_iso8601_pattern_29     = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS";
    private final static DateTimeFormatter formatter_iso8601  = DateTimeFormat.forPattern(formatter_iso8601_pattern);


    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_2ku5ku5lusvmu3o.R.inc(27005);
        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27006);return deserialze(parser, type, fieldName, null, 0);
    }finally{__CLR4_5_2ku5ku5lusvmu3o.R.flushNeeded();}}

    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName, String format, int feature) {try{__CLR4_5_2ku5ku5lusvmu3o.R.inc(27007);
        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27008);JSONLexer lexer = parser.lexer;
        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27009);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27010)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27011)==0&false))){{
            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27012);lexer.nextToken();
            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27013);return null;
        }

        }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27014);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27015)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27016)==0&false))) {{
            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27017);String text = lexer.stringVal();
            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27018);lexer.nextToken();

            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27019);DateTimeFormatter formatter = null;
            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27020);if ((((format != null)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27021)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27022)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27023);if ((((defaultPatttern.equals(format))&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27024)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27025)==0&false))) {{
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27026);formatter = defaultFormatter;
                } }else {{
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27027);formatter = DateTimeFormat.forPattern(format);
                }
            }}

            }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27028);if (((("".equals(text))&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27029)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27030)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27031);return null;
            }

            }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27032);if ((((type == LocalDateTime.class)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27033)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27034)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27035);LocalDateTime localDateTime;
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27036);if ((((text.length() == 10 || text.length() == 8)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27037)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27038)==0&false))) {{
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27039);LocalDate localDate = parseLocalDate(text, format, formatter);
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27040);localDateTime = localDate.toLocalDateTime(LocalTime.MIDNIGHT);
                } }else {{
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27041);localDateTime = parseDateTime(text, formatter);
                }
                }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27042);return (T) localDateTime;
            } }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27043);if ((((type == LocalDate.class)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27044)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27045)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27046);LocalDate localDate;
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27047);if ((((text.length() == 23)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27048)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27049)==0&false))) {{
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27050);LocalDateTime localDateTime = LocalDateTime.parse(text);
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27051);localDate = localDateTime.toLocalDate();
                } }else {{
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27052);localDate = parseLocalDate(text, format, formatter);
                }

                }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27053);return (T) localDate;
            } }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27054);if ((((type == LocalTime.class)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27055)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27056)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27057);LocalTime localDate;
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27058);if ((((text.length() == 23)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27059)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27060)==0&false))) {{
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27061);LocalDateTime localDateTime = LocalDateTime.parse(text);
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27062);localDate = localDateTime.toLocalTime();
                } }else {{
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27063);localDate = LocalTime.parse(text);
                }
                }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27064);return (T) localDate;
            } }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27065);if ((((type == DateTime.class)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27066)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27067)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27068);if ((((formatter == defaultFormatter)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27069)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27070)==0&false))) {{
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27071);formatter = ISO_FIXED_FORMAT;
                }

                }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27072);DateTime zonedDateTime = parseZonedDateTime(text, formatter);

                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27073);return (T) zonedDateTime;
            } }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27074);if ((((type == DateTimeZone.class)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27075)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27076)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27077);DateTimeZone offsetTime = DateTimeZone.forID(text);

                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27078);return (T) offsetTime;
            } }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27079);if ((((type == Period.class)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27080)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27081)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27082);Period period = Period.parse(text);

                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27083);return (T) period;
            } }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27084);if ((((type == Duration.class)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27085)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27086)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27087);Duration duration = Duration.parse(text);

                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27088);return (T) duration;
            } }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27089);if ((((type == Instant.class)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27090)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27091)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27092);Instant instant = Instant.parse(text);

                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27093);return (T) instant;
            } }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27094);if ((((type == DateTimeFormatter.class)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27095)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27096)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27097);return (T) DateTimeFormat.forPattern(text);
            }
        }}}}}}}}}} }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27098);if ((((lexer.token() == JSONToken.LITERAL_INT)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27099)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27100)==0&false))) {{
            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27101);long millis = lexer.longValue();
            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27102);lexer.nextToken();

            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27103);TimeZone timeZone = JSON.defaultTimeZone;
            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27104);if ((((timeZone == null)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27105)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27106)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27107);timeZone = TimeZone.getDefault();
            }

            }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27108);if ((((type == DateTime.class)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27109)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27110)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27111);return (T) new DateTime(millis, DateTimeZone.forTimeZone(timeZone));
            }

            }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27112);LocalDateTime localDateTime =  new LocalDateTime(millis, DateTimeZone.forTimeZone(timeZone));
            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27113);if ((((type == LocalDateTime.class)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27114)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27115)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27116);return (T) localDateTime;
            }

            }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27117);if ((((type == LocalDate.class)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27118)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27119)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27120);return (T) localDateTime.toLocalDate();
            }

            }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27121);if ((((type == LocalTime.class)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27122)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27123)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27124);return (T) localDateTime.toLocalTime();
            }

            }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27125);if ((((type == Instant.class)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27126)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27127)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27128);Instant instant = new Instant(millis);

                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27129);return (T) instant;
            }

            }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27130);throw new UnsupportedOperationException();
        } }else {{
            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27131);throw new UnsupportedOperationException();
        }
        }}__CLR4_5_2ku5ku5lusvmu3o.R.inc(27132);return null;
    }finally{__CLR4_5_2ku5ku5lusvmu3o.R.flushNeeded();}}

    protected LocalDateTime parseDateTime(String text, DateTimeFormatter formatter) {try{__CLR4_5_2ku5ku5lusvmu3o.R.inc(27133);
        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27134);if ((((formatter == null)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27135)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27136)==0&false))) {{
            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27137);if ((((text.length() == 19)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27138)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27139)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27140);char c4 = text.charAt(4);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27141);char c7 = text.charAt(7);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27142);char c10 = text.charAt(10);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27143);char c13 = text.charAt(13);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27144);char c16 = text.charAt(16);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27145);if ((((c13 == ':' && c16 == ':')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27146)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27147)==0&false))) {{
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27148);if ((((c4 == '-' && c7 == '-')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27149)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27150)==0&false))) {{ // yyyy-MM-dd  or  yyyy-MM-dd'T'
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27151);if ((((c10 == 'T')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27152)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27153)==0&false))) {{
                            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27154);formatter = formatter_iso8601;
                        } }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27155);if ((((c10 == ' ')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27156)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27157)==0&false))) {{
                            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27158);formatter = defaultFormatter;
                        }
                    }}} }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27159);if ((((c4 == '/' && c7 == '/')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27160)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27161)==0&false))) {{ // tw yyyy/mm/dd
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27162);formatter = formatter_dt19_tw;
                    } }else {{
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27163);char c0 = text.charAt(0);
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27164);char c1 = text.charAt(1);
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27165);char c2 = text.charAt(2);
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27166);char c3 = text.charAt(3);
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27167);char c5 = text.charAt(5);
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27168);if ((((c2 == '/' && c5 == '/')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27169)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27170)==0&false))) {{ // mm/dd/yyyy or mm/dd/yyyy
                            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27171);int v0 = (c0 - '0') * 10 + (c1 - '0');
                            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27172);int v1 = (c3 - '0') * 10 + (c4 - '0');
                            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27173);if ((((v0 > 12)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27174)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27175)==0&false))) {{
                                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27176);formatter = formatter_dt19_eur;
                            } }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27177);if ((((v1 > 12)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27178)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27179)==0&false))) {{
                                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27180);formatter = formatter_dt19_us;
                            } }else {{
                                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27181);String country = Locale.getDefault().getCountry();

                                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27182);if ((((country.equals("US"))&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27183)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27184)==0&false))) {{
                                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27185);formatter = formatter_dt19_us;
                                } }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27186);if ((((country.equals("BR") //
                                        || country.equals("AU"))&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27187)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27188)==0&false))) {{
                                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27189);formatter = formatter_dt19_eur;
                                }
                            }}}
                        }}} }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27190);if ((((c2 == '.' && c5 == '.')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27191)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27192)==0&false))) {{ // dd.mm.yyyy
                            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27193);formatter = formatter_dt19_de;
                        } }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27194);if ((((c2 == '-' && c5 == '-')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27195)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27196)==0&false))) {{ // dd-mm-yyyy
                            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27197);formatter = formatter_dt19_in;
                        }
                    }}}}
                }}}
            }} }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27198);if ((((text.length() == 23)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27199)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27200)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27201);char c4 = text.charAt(4);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27202);char c7 = text.charAt(7);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27203);char c10 = text.charAt(10);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27204);char c13 = text.charAt(13);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27205);char c16 = text.charAt(16);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27206);char c19 = text.charAt(19);

                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27207);if ((((c13 == ':'
                        && c16 == ':'
                        && c4 == '-'
                        && c7 == '-'
                        && c10 == ' '
                        && c19 == '.'
                )&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27208)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27209)==0&false))) {{
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27210);formatter = defaultFormatter_23;
                }
            }}

            }}__CLR4_5_2ku5ku5lusvmu3o.R.inc(27211);if ((((text.length() >= 17)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27212)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27213)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27214);char c4 = text.charAt(4);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27215);if ((((c4 == '\u5e74')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27216)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27217)==0&false))) {{
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27218);if ((((text.charAt(text.length() - 1) == '\u79d2')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27219)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27220)==0&false))) {{
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27221);formatter = formatter_dt19_cn_1;
                    } }else {{
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27222);formatter = formatter_dt19_cn;
                    }
                }} }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27223);if ((((c4 == '\ub144')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27224)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27225)==0&false))) {{
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27226);formatter = formatter_dt19_kr;
                }
            }}}
        }}

        }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27227);return (((formatter == null )&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27228)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27229)==0&false))? //
                LocalDateTime.parse(text) //
                : LocalDateTime.parse(text, formatter);
    }finally{__CLR4_5_2ku5ku5lusvmu3o.R.flushNeeded();}}

    protected LocalDate parseLocalDate(String text, String format, DateTimeFormatter formatter) {try{__CLR4_5_2ku5ku5lusvmu3o.R.inc(27230);
        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27231);if ((((formatter == null)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27232)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27233)==0&false))) {{
            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27234);if ((((text.length() == 8)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27235)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27236)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27237);formatter = formatter_d8;
            }

            }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27238);if ((((text.length() == 10)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27239)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27240)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27241);char c4 = text.charAt(4);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27242);char c7 = text.charAt(7);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27243);if ((((c4 == '/' && c7 == '/')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27244)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27245)==0&false))) {{ // tw yyyy/mm/dd
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27246);formatter = formatter_d10_tw;
                }

                }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27247);char c0 = text.charAt(0);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27248);char c1 = text.charAt(1);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27249);char c2 = text.charAt(2);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27250);char c3 = text.charAt(3);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27251);char c5 = text.charAt(5);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27252);if ((((c2 == '/' && c5 == '/')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27253)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27254)==0&false))) {{ // mm/dd/yyyy or mm/dd/yyyy
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27255);int v0 = (c0 - '0') * 10 + (c1 - '0');
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27256);int v1 = (c3 - '0') * 10 + (c4 - '0');
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27257);if ((((v0 > 12)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27258)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27259)==0&false))) {{
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27260);formatter = formatter_d10_eur;
                    } }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27261);if ((((v1 > 12)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27262)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27263)==0&false))) {{
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27264);formatter = formatter_d10_us;
                    } }else {{
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27265);String country = Locale.getDefault().getCountry();

                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27266);if ((((country.equals("US"))&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27267)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27268)==0&false))) {{
                            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27269);formatter = formatter_d10_us;
                        } }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27270);if ((((country.equals("BR") //
                                || country.equals("AU"))&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27271)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27272)==0&false))) {{
                            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27273);formatter = formatter_d10_eur;
                        }
                    }}}
                }}} }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27274);if ((((c2 == '.' && c5 == '.')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27275)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27276)==0&false))) {{ // dd.mm.yyyy
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27277);formatter = formatter_d10_de;
                } }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27278);if ((((c2 == '-' && c5 == '-')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27279)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27280)==0&false))) {{ // dd-mm-yyyy
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27281);formatter = formatter_d10_in;
                }
            }}}}

            }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27282);if ((((text.length() >= 9)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27283)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27284)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27285);char c4 = text.charAt(4);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27286);if ((((c4 == '\u5e74')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27287)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27288)==0&false))) {{
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27289);formatter = formatter_d10_cn;
                } }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27290);if ((((c4 == '\ub144')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27291)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27292)==0&false))) {{
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27293);formatter = formatter_d10_kr;
                }
            }}}
        }}

        }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27294);return (((formatter == null )&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27295)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27296)==0&false))? //
                LocalDate.parse(text) //
                : LocalDate.parse(text, formatter);
    }finally{__CLR4_5_2ku5ku5lusvmu3o.R.flushNeeded();}}

    protected DateTime parseZonedDateTime(String text, DateTimeFormatter formatter) {try{__CLR4_5_2ku5ku5lusvmu3o.R.inc(27297);
        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27298);if ((((formatter == null)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27299)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27300)==0&false))) {{
            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27301);if ((((text.length() == 19)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27302)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27303)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27304);char c4 = text.charAt(4);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27305);char c7 = text.charAt(7);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27306);char c10 = text.charAt(10);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27307);char c13 = text.charAt(13);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27308);char c16 = text.charAt(16);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27309);if ((((c13 == ':' && c16 == ':')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27310)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27311)==0&false))) {{
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27312);if ((((c4 == '-' && c7 == '-')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27313)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27314)==0&false))) {{ // yyyy-MM-dd  or  yyyy-MM-dd'T'
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27315);if ((((c10 == 'T')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27316)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27317)==0&false))) {{
                            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27318);formatter = formatter_iso8601;
                        } }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27319);if ((((c10 == ' ')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27320)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27321)==0&false))) {{
                            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27322);formatter = defaultFormatter;
                        }
                    }}} }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27323);if ((((c4 == '/' && c7 == '/')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27324)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27325)==0&false))) {{ // tw yyyy/mm/dd
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27326);formatter = formatter_dt19_tw;
                    } }else {{
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27327);char c0 = text.charAt(0);
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27328);char c1 = text.charAt(1);
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27329);char c2 = text.charAt(2);
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27330);char c3 = text.charAt(3);
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27331);char c5 = text.charAt(5);
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27332);if ((((c2 == '/' && c5 == '/')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27333)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27334)==0&false))) {{ // mm/dd/yyyy or mm/dd/yyyy
                            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27335);int v0 = (c0 - '0') * 10 + (c1 - '0');
                            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27336);int v1 = (c3 - '0') * 10 + (c4 - '0');
                            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27337);if ((((v0 > 12)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27338)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27339)==0&false))) {{
                                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27340);formatter = formatter_dt19_eur;
                            } }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27341);if ((((v1 > 12)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27342)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27343)==0&false))) {{
                                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27344);formatter = formatter_dt19_us;
                            } }else {{
                                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27345);String country = Locale.getDefault().getCountry();

                                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27346);if ((((country.equals("US"))&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27347)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27348)==0&false))) {{
                                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27349);formatter = formatter_dt19_us;
                                } }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27350);if ((((country.equals("BR") //
                                        || country.equals("AU"))&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27351)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27352)==0&false))) {{
                                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27353);formatter = formatter_dt19_eur;
                                }
                            }}}
                        }}} }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27354);if ((((c2 == '.' && c5 == '.')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27355)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27356)==0&false))) {{ // dd.mm.yyyy
                            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27357);formatter = formatter_dt19_de;
                        } }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27358);if ((((c2 == '-' && c5 == '-')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27359)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27360)==0&false))) {{ // dd-mm-yyyy
                            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27361);formatter = formatter_dt19_in;
                        }
                    }}}}
                }}}
            }}

            }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27362);if ((((text.length() >= 17)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27363)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27364)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27365);char c4 = text.charAt(4);
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27366);if ((((c4 == '\u5e74')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27367)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27368)==0&false))) {{
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27369);if ((((text.charAt(text.length() - 1) == '\u79d2')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27370)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27371)==0&false))) {{
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27372);formatter = formatter_dt19_cn_1;
                    } }else {{
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27373);formatter = formatter_dt19_cn;
                    }
                }} }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27374);if ((((c4 == '\ub144')&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27375)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27376)==0&false))) {{
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27377);formatter = formatter_dt19_kr;
                }
            }}}
        }}

        }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27378);return (((formatter == null )&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27379)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27380)==0&false))? //
                DateTime.parse(text) //
                : DateTime.parse(text, formatter);
    }finally{__CLR4_5_2ku5ku5lusvmu3o.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_5_2ku5ku5lusvmu3o.R.inc(27381);
        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27382);return JSONToken.LITERAL_STRING;
    }finally{__CLR4_5_2ku5ku5lusvmu3o.R.flushNeeded();}}

    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType,
                      int features) throws IOException {try{__CLR4_5_2ku5ku5lusvmu3o.R.inc(27383);
        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27384);SerializeWriter out = serializer.out;
        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27385);if ((((object == null)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27386)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27387)==0&false))) {{
            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27388);out.writeNull();
        } }else {{
            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27389);if ((((fieldType == null)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27390)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27391)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27392);fieldType = object.getClass();
            }

            }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27393);if ((((fieldType == LocalDateTime.class)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27394)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27395)==0&false))) {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27396);final int mask = SerializerFeature.UseISO8601DateFormat.getMask();
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27397);LocalDateTime dateTime = (LocalDateTime) object;
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27398);String format = serializer.getDateFormatPattern();

                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27399);if ((((format == null)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27400)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27401)==0&false))) {{
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27402);if (((((features & mask) != 0 || serializer.isEnabled(SerializerFeature.UseISO8601DateFormat))&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27403)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27404)==0&false))) {{
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27405);format = formatter_iso8601_pattern;
                    } }else {{
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27406);int millis = dateTime.getMillisOfSecond();
                        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27407);if ((((millis == 0)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27408)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27409)==0&false))) {{
                            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27410);format = formatter_iso8601_pattern_23;
                        } }else {{
                            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27411);format = formatter_iso8601_pattern_29;
                        }
                    }}
                }}

                }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27412);if ((((format != null)&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27413)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27414)==0&false))) {{
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27415);write(out, dateTime, format);
                } }else {__CLR4_5_2ku5ku5lusvmu3o.R.inc(27416);if ((((out.isEnabled(SerializerFeature.WriteDateUseDateFormat))&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27417)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27418)==0&false))) {{
                    //\u4f7f\u7528\u56fa\u5b9a\u683c\u5f0f\u8f6c\u5316\u65f6\u95f4
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27419);write(out, dateTime, JSON.DEFFAULT_DATE_FORMAT);
                } }else {{
                    __CLR4_5_2ku5ku5lusvmu3o.R.inc(27420);out.writeLong(dateTime.toDateTime(DateTimeZone.forTimeZone(JSON.defaultTimeZone)).toInstant().getMillis());
                }
            }}} }else {{
                __CLR4_5_2ku5ku5lusvmu3o.R.inc(27421);out.writeString(object.toString());
            }
        }}
    }}finally{__CLR4_5_2ku5ku5lusvmu3o.R.flushNeeded();}}

    public void write(JSONSerializer serializer, Object object, BeanContext context) throws IOException {try{__CLR4_5_2ku5ku5lusvmu3o.R.inc(27422);
        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27423);SerializeWriter out = serializer.out;
        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27424);String format = context.getFormat();
        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27425);write(out, (ReadablePartial) object, format);
    }finally{__CLR4_5_2ku5ku5lusvmu3o.R.flushNeeded();}}

    private void write(SerializeWriter out, ReadablePartial object, String format) {try{__CLR4_5_2ku5ku5lusvmu3o.R.inc(27426);
        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27427);DateTimeFormatter formatter;
        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27428);if ((((format.equals(formatter_iso8601_pattern))&&(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27429)!=0|true))||(__CLR4_5_2ku5ku5lusvmu3o.R.iget(27430)==0&false))) {{
            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27431);formatter = formatter_iso8601;
        } }else {{
            __CLR4_5_2ku5ku5lusvmu3o.R.inc(27432);formatter = DateTimeFormat.forPattern(format);
        }

        }__CLR4_5_2ku5ku5lusvmu3o.R.inc(27433);String text = formatter.print(object);
        __CLR4_5_2ku5ku5lusvmu3o.R.inc(27434);out.writeString(text);
    }finally{__CLR4_5_2ku5ku5lusvmu3o.R.flushNeeded();}}
}
