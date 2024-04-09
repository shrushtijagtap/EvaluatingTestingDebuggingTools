/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.parser.deserializer;

import java.io.IOException;
import java.lang.reflect.Type;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.serializer.*;

public class Jdk8DateCodec extends ContextObjectDeserializer implements ObjectSerializer, ContextObjectSerializer, ObjectDeserializer {public static class __CLR4_5_2g8gg8glusvmrqz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,21509,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final Jdk8DateCodec      instance            = new Jdk8DateCodec();

    private final static String            defaultPatttern     = "yyyy-MM-dd HH:mm:ss";
    private final static DateTimeFormatter defaultFormatter    = DateTimeFormatter.ofPattern(defaultPatttern);
    private final static DateTimeFormatter defaultFormatter_23 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    private final static DateTimeFormatter formatter_dt19_tw   = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    private final static DateTimeFormatter formatter_dt19_cn   = DateTimeFormatter.ofPattern("yyyy\u5e74M\u6708d\u65e5 HH:mm:ss");
    private final static DateTimeFormatter formatter_dt19_cn_1 = DateTimeFormatter.ofPattern("yyyy\u5e74M\u6708d\u65e5 H\u65f6m\u5206s\u79d2");
    private final static DateTimeFormatter formatter_dt19_kr   = DateTimeFormatter.ofPattern("yyyy\ub144M\uc6d4d\uc77c HH:mm:ss");
    private final static DateTimeFormatter formatter_dt19_us   = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    private final static DateTimeFormatter formatter_dt19_eur  = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private final static DateTimeFormatter formatter_dt19_de   = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    private final static DateTimeFormatter formatter_dt19_in   = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    private final static DateTimeFormatter formatter_d8        = DateTimeFormatter.ofPattern("yyyyMMdd");
    private final static DateTimeFormatter formatter_d10_tw    = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    private final static DateTimeFormatter formatter_d10_cn    = DateTimeFormatter.ofPattern("yyyy\u5e74M\u6708d\u65e5");
    private final static DateTimeFormatter formatter_d10_kr    = DateTimeFormatter.ofPattern("yyyy\ub144M\uc6d4d\uc77c");
    private final static DateTimeFormatter formatter_d10_us    = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    private final static DateTimeFormatter formatter_d10_eur   = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private final static DateTimeFormatter formatter_d10_de    = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private final static DateTimeFormatter formatter_d10_in    = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    private final static DateTimeFormatter ISO_FIXED_FORMAT =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.systemDefault());

    private final static String formatter_iso8601_pattern     = "yyyy-MM-dd'T'HH:mm:ss";
    private final static String formatter_iso8601_pattern_23     = "yyyy-MM-dd'T'HH:mm:ss.SSS";
    private final static String formatter_iso8601_pattern_29     = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS";
    private final static DateTimeFormatter formatter_iso8601  = DateTimeFormatter.ofPattern(formatter_iso8601_pattern);

    @SuppressWarnings("unchecked")
    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName, String format, int feature) {try{__CLR4_5_2g8gg8glusvmrqz.R.inc(21040);
        __CLR4_5_2g8gg8glusvmrqz.R.inc(21041);JSONLexer lexer = parser.lexer;
        __CLR4_5_2g8gg8glusvmrqz.R.inc(21042);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21043)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21044)==0&false))){{
            __CLR4_5_2g8gg8glusvmrqz.R.inc(21045);lexer.nextToken();
            __CLR4_5_2g8gg8glusvmrqz.R.inc(21046);return null;
        }

        }__CLR4_5_2g8gg8glusvmrqz.R.inc(21047);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21048)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21049)==0&false))) {{
            __CLR4_5_2g8gg8glusvmrqz.R.inc(21050);String text = lexer.stringVal();
            __CLR4_5_2g8gg8glusvmrqz.R.inc(21051);lexer.nextToken();

            __CLR4_5_2g8gg8glusvmrqz.R.inc(21052);DateTimeFormatter formatter = null;
            __CLR4_5_2g8gg8glusvmrqz.R.inc(21053);if ((((format != null)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21054)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21055)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21056);if ((((defaultPatttern.equals(format))&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21057)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21058)==0&false))) {{
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21059);formatter = defaultFormatter;
                } }else {{
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21060);formatter = DateTimeFormatter.ofPattern(format);
                }
            }}

            }__CLR4_5_2g8gg8glusvmrqz.R.inc(21061);if (((("".equals(text))&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21062)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21063)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21064);return null;
            }

            }__CLR4_5_2g8gg8glusvmrqz.R.inc(21065);if ((((type == LocalDateTime.class)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21066)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21067)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21068);LocalDateTime localDateTime;
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21069);if ((((text.length() == 10 || text.length() == 8)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21070)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21071)==0&false))) {{
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21072);LocalDate localDate = parseLocalDate(text, format, formatter);
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21073);localDateTime = LocalDateTime.of(localDate, LocalTime.MIN);
                } }else {{
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21074);localDateTime = parseDateTime(text, formatter);
                }
                }__CLR4_5_2g8gg8glusvmrqz.R.inc(21075);return (T) localDateTime;
            } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21076);if ((((type == LocalDate.class)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21077)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21078)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21079);LocalDate localDate;
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21080);if ((((text.length() == 23)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21081)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21082)==0&false))) {{
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21083);LocalDateTime localDateTime = LocalDateTime.parse(text);
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21084);localDate = LocalDate.of(localDateTime.getYear(), localDateTime.getMonthValue(),
                            localDateTime.getDayOfMonth());
                } }else {{
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21085);localDate = parseLocalDate(text, format, formatter);
                }

                }__CLR4_5_2g8gg8glusvmrqz.R.inc(21086);return (T) localDate;
            } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21087);if ((((type == LocalTime.class)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21088)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21089)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21090);LocalTime localDate;
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21091);if ((((text.length() == 23)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21092)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21093)==0&false))) {{
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21094);LocalDateTime localDateTime = LocalDateTime.parse(text);
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21095);localDate = LocalTime.of(localDateTime.getHour(), localDateTime.getMinute(),
                            localDateTime.getSecond(), localDateTime.getNano());
                } }else {{
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21096);localDate = LocalTime.parse(text);
                }
                }__CLR4_5_2g8gg8glusvmrqz.R.inc(21097);return (T) localDate;
            } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21098);if ((((type == ZonedDateTime.class)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21099)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21100)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21101);if ((((formatter == defaultFormatter)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21102)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21103)==0&false))) {{
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21104);formatter = ISO_FIXED_FORMAT;
                }

                }__CLR4_5_2g8gg8glusvmrqz.R.inc(21105);if ((((formatter == null)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21106)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21107)==0&false))) {{
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21108);if ((((text.length() <= 19)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21109)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21110)==0&false))) {{
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21111);JSONScanner s = new JSONScanner(text);
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21112);TimeZone timeZone = parser.lexer.getTimeZone();
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21113);s.setTimeZone(timeZone);
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21114);boolean match = s.scanISO8601DateIfMatch(false);
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21115);if ((((match)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21116)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21117)==0&false))) {{
                            __CLR4_5_2g8gg8glusvmrqz.R.inc(21118);Date date = s.getCalendar().getTime();
                            __CLR4_5_2g8gg8glusvmrqz.R.inc(21119);return (T) ZonedDateTime.ofInstant(date.toInstant(), timeZone.toZoneId());
                        }
                    }}

                }}

                }__CLR4_5_2g8gg8glusvmrqz.R.inc(21120);ZonedDateTime zonedDateTime = parseZonedDateTime(text, formatter);

                __CLR4_5_2g8gg8glusvmrqz.R.inc(21121);return (T) zonedDateTime;
            } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21122);if ((((type == OffsetDateTime.class)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21123)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21124)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21125);OffsetDateTime offsetDateTime = OffsetDateTime.parse(text);

                __CLR4_5_2g8gg8glusvmrqz.R.inc(21126);return (T) offsetDateTime;
            } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21127);if ((((type == OffsetTime.class)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21128)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21129)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21130);OffsetTime offsetTime = OffsetTime.parse(text);

                __CLR4_5_2g8gg8glusvmrqz.R.inc(21131);return (T) offsetTime;
            } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21132);if ((((type == ZoneId.class)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21133)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21134)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21135);ZoneId offsetTime = ZoneId.of(text);

                __CLR4_5_2g8gg8glusvmrqz.R.inc(21136);return (T) offsetTime;
            } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21137);if ((((type == Period.class)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21138)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21139)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21140);Period period = Period.parse(text);

                __CLR4_5_2g8gg8glusvmrqz.R.inc(21141);return (T) period;
            } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21142);if ((((type == Duration.class)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21143)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21144)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21145);Duration duration = Duration.parse(text);

                __CLR4_5_2g8gg8glusvmrqz.R.inc(21146);return (T) duration;
            } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21147);if ((((type == Instant.class)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21148)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21149)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21150);Instant instant = Instant.parse(text);

                __CLR4_5_2g8gg8glusvmrqz.R.inc(21151);return (T) instant;
            }
        }}}}}}}}}}} }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21152);if ((((lexer.token() == JSONToken.LITERAL_INT)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21153)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21154)==0&false))) {{
            __CLR4_5_2g8gg8glusvmrqz.R.inc(21155);long millis = lexer.longValue();
            __CLR4_5_2g8gg8glusvmrqz.R.inc(21156);lexer.nextToken();

            __CLR4_5_2g8gg8glusvmrqz.R.inc(21157);if (((("unixtime".equals(format))&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21158)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21159)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21160);millis *= 1000;
            }

            }__CLR4_5_2g8gg8glusvmrqz.R.inc(21161);if ((((type == LocalDateTime.class)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21162)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21163)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21164);return (T) LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), JSON.defaultTimeZone.toZoneId());
            }

            }__CLR4_5_2g8gg8glusvmrqz.R.inc(21165);if ((((type == LocalDate.class)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21166)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21167)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21168);return (T) LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), JSON.defaultTimeZone.toZoneId()).toLocalDate();
            }
            }__CLR4_5_2g8gg8glusvmrqz.R.inc(21169);if ((((type == LocalTime.class)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21170)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21171)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21172);return (T) LocalDateTime.ofInstant(Instant.ofEpochMilli(millis), JSON.defaultTimeZone.toZoneId()).toLocalTime();
            }

            }__CLR4_5_2g8gg8glusvmrqz.R.inc(21173);if ((((type == ZonedDateTime.class)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21174)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21175)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21176);return (T) ZonedDateTime.ofInstant(Instant.ofEpochMilli(millis), JSON.defaultTimeZone.toZoneId());
            }

            }__CLR4_5_2g8gg8glusvmrqz.R.inc(21177);throw new UnsupportedOperationException();
        } }else {{
            __CLR4_5_2g8gg8glusvmrqz.R.inc(21178);throw new UnsupportedOperationException();
        }
        }}__CLR4_5_2g8gg8glusvmrqz.R.inc(21179);return null;
    }finally{__CLR4_5_2g8gg8glusvmrqz.R.flushNeeded();}}

    protected LocalDateTime parseDateTime(String text, DateTimeFormatter formatter) {try{__CLR4_5_2g8gg8glusvmrqz.R.inc(21180);
        __CLR4_5_2g8gg8glusvmrqz.R.inc(21181);if ((((formatter == null)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21182)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21183)==0&false))) {{
            __CLR4_5_2g8gg8glusvmrqz.R.inc(21184);if ((((text.length() == 19)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21185)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21186)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21187);char c4 = text.charAt(4);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21188);char c7 = text.charAt(7);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21189);char c10 = text.charAt(10);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21190);char c13 = text.charAt(13);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21191);char c16 = text.charAt(16);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21192);if ((((c13 == ':' && c16 == ':')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21193)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21194)==0&false))) {{
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21195);if ((((c4 == '-' && c7 == '-')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21196)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21197)==0&false))) {{
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21198);if ((((c10 == 'T')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21199)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21200)==0&false))) {{
                            __CLR4_5_2g8gg8glusvmrqz.R.inc(21201);formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
                        } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21202);if ((((c10 == ' ')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21203)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21204)==0&false))) {{
                            __CLR4_5_2g8gg8glusvmrqz.R.inc(21205);formatter = defaultFormatter;
                        }
                    }}} }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21206);if ((((c4 == '-' && c7 == '-')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21207)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21208)==0&false))) {{
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21209);formatter = defaultFormatter;
                    } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21210);if ((((c4 == '/' && c7 == '/')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21211)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21212)==0&false))) {{ // tw yyyy/mm/dd
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21213);formatter = formatter_dt19_tw;
                    } }else {{
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21214);char c0 = text.charAt(0);
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21215);char c1 = text.charAt(1);
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21216);char c2 = text.charAt(2);
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21217);char c3 = text.charAt(3);
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21218);char c5 = text.charAt(5);
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21219);if ((((c2 == '/' && c5 == '/')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21220)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21221)==0&false))) {{ // mm/dd/yyyy or mm/dd/yyyy
                            __CLR4_5_2g8gg8glusvmrqz.R.inc(21222);int v0 = (c0 - '0') * 10 + (c1 - '0');
                            __CLR4_5_2g8gg8glusvmrqz.R.inc(21223);int v1 = (c3 - '0') * 10 + (c4 - '0');
                            __CLR4_5_2g8gg8glusvmrqz.R.inc(21224);if ((((v0 > 12)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21225)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21226)==0&false))) {{
                                __CLR4_5_2g8gg8glusvmrqz.R.inc(21227);formatter = formatter_dt19_eur;
                            } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21228);if ((((v1 > 12)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21229)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21230)==0&false))) {{
                                __CLR4_5_2g8gg8glusvmrqz.R.inc(21231);formatter = formatter_dt19_us;
                            } }else {{
                                __CLR4_5_2g8gg8glusvmrqz.R.inc(21232);String country = Locale.getDefault().getCountry();

                                __CLR4_5_2g8gg8glusvmrqz.R.inc(21233);if ((((country.equals("US"))&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21234)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21235)==0&false))) {{
                                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21236);formatter = formatter_dt19_us;
                                } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21237);if ((((country.equals("BR") //
                                           || country.equals("AU"))&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21238)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21239)==0&false))) {{
                                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21240);formatter = formatter_dt19_eur;
                                }
                            }}}
                        }}} }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21241);if ((((c2 == '.' && c5 == '.')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21242)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21243)==0&false))) {{ // dd.mm.yyyy
                            __CLR4_5_2g8gg8glusvmrqz.R.inc(21244);formatter = formatter_dt19_de;
                        } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21245);if ((((c2 == '-' && c5 == '-')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21246)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21247)==0&false))) {{ // dd-mm-yyyy
                            __CLR4_5_2g8gg8glusvmrqz.R.inc(21248);formatter = formatter_dt19_in;
                        }
                    }}}}
                }}}}
            }} }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21249);if ((((text.length() == 23)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21250)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21251)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21252);char c4 = text.charAt(4);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21253);char c7 = text.charAt(7);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21254);char c10 = text.charAt(10);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21255);char c13 = text.charAt(13);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21256);char c16 = text.charAt(16);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21257);char c19 = text.charAt(19);

                __CLR4_5_2g8gg8glusvmrqz.R.inc(21258);if ((((c13 == ':'
                        && c16 == ':'
                        && c4 == '-'
                        && c7 == '-'
                        && c10 == ' '
                        && c19 == '.'
                )&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21259)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21260)==0&false))) {{
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21261);formatter = defaultFormatter_23;
                }
            }}

            }}__CLR4_5_2g8gg8glusvmrqz.R.inc(21262);if ((((text.length() >= 17)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21263)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21264)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21265);char c4 = text.charAt(4);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21266);if ((((c4 == '\u5e74')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21267)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21268)==0&false))) {{
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21269);if ((((text.charAt(text.length() - 1) == '\u79d2')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21270)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21271)==0&false))) {{
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21272);formatter = formatter_dt19_cn_1;    
                    } }else {{
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21273);formatter = formatter_dt19_cn;
                    }
                }} }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21274);if ((((c4 == '\ub144')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21275)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21276)==0&false))) {{
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21277);formatter = formatter_dt19_kr;
                }
            }}}
        }}

        }__CLR4_5_2g8gg8glusvmrqz.R.inc(21278);if ((((formatter == null)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21279)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21280)==0&false))) {{
            __CLR4_5_2g8gg8glusvmrqz.R.inc(21281);JSONScanner dateScanner = new JSONScanner(text);
            __CLR4_5_2g8gg8glusvmrqz.R.inc(21282);if ((((dateScanner.scanISO8601DateIfMatch(false))&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21283)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21284)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21285);Instant instant = dateScanner.getCalendar().toInstant();
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21286);return LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
            }
        }}

        }__CLR4_5_2g8gg8glusvmrqz.R.inc(21287);return (((formatter == null )&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21288)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21289)==0&false))? //
            LocalDateTime.parse(text) //
            : LocalDateTime.parse(text, formatter);
    }finally{__CLR4_5_2g8gg8glusvmrqz.R.flushNeeded();}}

    protected LocalDate parseLocalDate(String text, String format, DateTimeFormatter formatter) {try{__CLR4_5_2g8gg8glusvmrqz.R.inc(21290);
        __CLR4_5_2g8gg8glusvmrqz.R.inc(21291);if ((((formatter == null)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21292)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21293)==0&false))) {{
            __CLR4_5_2g8gg8glusvmrqz.R.inc(21294);if ((((text.length() == 8)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21295)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21296)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21297);formatter = formatter_d8;
            }

            }__CLR4_5_2g8gg8glusvmrqz.R.inc(21298);if ((((text.length() == 10)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21299)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21300)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21301);char c4 = text.charAt(4);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21302);char c7 = text.charAt(7);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21303);if ((((c4 == '/' && c7 == '/')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21304)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21305)==0&false))) {{ // tw yyyy/mm/dd
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21306);formatter = formatter_d10_tw;
                }

                }__CLR4_5_2g8gg8glusvmrqz.R.inc(21307);char c0 = text.charAt(0);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21308);char c1 = text.charAt(1);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21309);char c2 = text.charAt(2);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21310);char c3 = text.charAt(3);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21311);char c5 = text.charAt(5);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21312);if ((((c2 == '/' && c5 == '/')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21313)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21314)==0&false))) {{ // mm/dd/yyyy or mm/dd/yyyy
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21315);int v0 = (c0 - '0') * 10 + (c1 - '0');
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21316);int v1 = (c3 - '0') * 10 + (c4 - '0');
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21317);if ((((v0 > 12)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21318)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21319)==0&false))) {{
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21320);formatter = formatter_d10_eur;
                    } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21321);if ((((v1 > 12)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21322)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21323)==0&false))) {{
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21324);formatter = formatter_d10_us;
                    } }else {{
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21325);String country = Locale.getDefault().getCountry();

                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21326);if ((((country.equals("US"))&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21327)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21328)==0&false))) {{
                            __CLR4_5_2g8gg8glusvmrqz.R.inc(21329);formatter = formatter_d10_us;
                        } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21330);if ((((country.equals("BR") //
                                   || country.equals("AU"))&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21331)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21332)==0&false))) {{
                            __CLR4_5_2g8gg8glusvmrqz.R.inc(21333);formatter = formatter_d10_eur;
                        }
                    }}}
                }}} }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21334);if ((((c2 == '.' && c5 == '.')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21335)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21336)==0&false))) {{ // dd.mm.yyyy
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21337);formatter = formatter_d10_de;
                } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21338);if ((((c2 == '-' && c5 == '-')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21339)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21340)==0&false))) {{ // dd-mm-yyyy
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21341);formatter = formatter_d10_in;
                }
            }}}}

            }__CLR4_5_2g8gg8glusvmrqz.R.inc(21342);if ((((text.length() >= 9)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21343)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21344)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21345);char c4 = text.charAt(4);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21346);if ((((c4 == '\u5e74')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21347)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21348)==0&false))) {{
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21349);formatter = formatter_d10_cn;
                } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21350);if ((((c4 == '\ub144')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21351)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21352)==0&false))) {{
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21353);formatter = formatter_d10_kr;
                }
            }}}
        }}

        }__CLR4_5_2g8gg8glusvmrqz.R.inc(21354);return (((formatter == null )&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21355)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21356)==0&false))? //
            LocalDate.parse(text) //
            : LocalDate.parse(text, formatter);
    }finally{__CLR4_5_2g8gg8glusvmrqz.R.flushNeeded();}}

    protected ZonedDateTime parseZonedDateTime(String text, DateTimeFormatter formatter) {try{__CLR4_5_2g8gg8glusvmrqz.R.inc(21357);
        __CLR4_5_2g8gg8glusvmrqz.R.inc(21358);if ((((formatter == null)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21359)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21360)==0&false))) {{
            __CLR4_5_2g8gg8glusvmrqz.R.inc(21361);if ((((text.length() == 19)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21362)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21363)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21364);char c4 = text.charAt(4);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21365);char c7 = text.charAt(7);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21366);char c10 = text.charAt(10);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21367);char c13 = text.charAt(13);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21368);char c16 = text.charAt(16);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21369);if ((((c13 == ':' && c16 == ':')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21370)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21371)==0&false))) {{
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21372);if ((((c4 == '-' && c7 == '-')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21373)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21374)==0&false))) {{
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21375);if ((((c10 == 'T')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21376)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21377)==0&false))) {{
                            __CLR4_5_2g8gg8glusvmrqz.R.inc(21378);formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
                        } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21379);if ((((c10 == ' ')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21380)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21381)==0&false))) {{
                            __CLR4_5_2g8gg8glusvmrqz.R.inc(21382);formatter = defaultFormatter;
                        }
                    }}} }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21383);if ((((c4 == '-' && c7 == '-')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21384)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21385)==0&false))) {{
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21386);formatter = defaultFormatter;
                    } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21387);if ((((c4 == '/' && c7 == '/')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21388)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21389)==0&false))) {{ // tw yyyy/mm/dd
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21390);formatter = formatter_dt19_tw;
                    } }else {{
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21391);char c0 = text.charAt(0);
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21392);char c1 = text.charAt(1);
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21393);char c2 = text.charAt(2);
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21394);char c3 = text.charAt(3);
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21395);char c5 = text.charAt(5);
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21396);if ((((c2 == '/' && c5 == '/')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21397)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21398)==0&false))) {{ // mm/dd/yyyy or mm/dd/yyyy
                            __CLR4_5_2g8gg8glusvmrqz.R.inc(21399);int v0 = (c0 - '0') * 10 + (c1 - '0');
                            __CLR4_5_2g8gg8glusvmrqz.R.inc(21400);int v1 = (c3 - '0') * 10 + (c4 - '0');
                            __CLR4_5_2g8gg8glusvmrqz.R.inc(21401);if ((((v0 > 12)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21402)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21403)==0&false))) {{
                                __CLR4_5_2g8gg8glusvmrqz.R.inc(21404);formatter = formatter_dt19_eur;
                            } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21405);if ((((v1 > 12)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21406)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21407)==0&false))) {{
                                __CLR4_5_2g8gg8glusvmrqz.R.inc(21408);formatter = formatter_dt19_us;
                            } }else {{
                                __CLR4_5_2g8gg8glusvmrqz.R.inc(21409);String country = Locale.getDefault().getCountry();

                                __CLR4_5_2g8gg8glusvmrqz.R.inc(21410);if ((((country.equals("US"))&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21411)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21412)==0&false))) {{
                                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21413);formatter = formatter_dt19_us;
                                } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21414);if ((((country.equals("BR") //
                                        || country.equals("AU"))&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21415)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21416)==0&false))) {{
                                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21417);formatter = formatter_dt19_eur;
                                }
                            }}}
                        }}} }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21418);if ((((c2 == '.' && c5 == '.')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21419)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21420)==0&false))) {{ // dd.mm.yyyy
                            __CLR4_5_2g8gg8glusvmrqz.R.inc(21421);formatter = formatter_dt19_de;
                        } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21422);if ((((c2 == '-' && c5 == '-')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21423)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21424)==0&false))) {{ // dd-mm-yyyy
                            __CLR4_5_2g8gg8glusvmrqz.R.inc(21425);formatter = formatter_dt19_in;
                        }
                    }}}}
                }}}}
            }}

            }__CLR4_5_2g8gg8glusvmrqz.R.inc(21426);if ((((text.length() >= 17)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21427)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21428)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21429);char c4 = text.charAt(4);
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21430);if ((((c4 == '\u5e74')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21431)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21432)==0&false))) {{
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21433);if ((((text.charAt(text.length() - 1) == '\u79d2')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21434)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21435)==0&false))) {{
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21436);formatter = formatter_dt19_cn_1;
                    } }else {{
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21437);formatter = formatter_dt19_cn;
                    }
                }} }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21438);if ((((c4 == '\ub144')&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21439)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21440)==0&false))) {{
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21441);formatter = formatter_dt19_kr;
                }
            }}}
        }}

        }__CLR4_5_2g8gg8glusvmrqz.R.inc(21442);return (((formatter == null )&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21443)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21444)==0&false))? //
                ZonedDateTime.parse(text) //
                : ZonedDateTime.parse(text, formatter);
    }finally{__CLR4_5_2g8gg8glusvmrqz.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_5_2g8gg8glusvmrqz.R.inc(21445);
        __CLR4_5_2g8gg8glusvmrqz.R.inc(21446);return JSONToken.LITERAL_STRING;
    }finally{__CLR4_5_2g8gg8glusvmrqz.R.flushNeeded();}}

    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType,
                      int features) throws IOException {try{__CLR4_5_2g8gg8glusvmrqz.R.inc(21447);
        __CLR4_5_2g8gg8glusvmrqz.R.inc(21448);SerializeWriter out = serializer.out;
        __CLR4_5_2g8gg8glusvmrqz.R.inc(21449);if ((((object == null)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21450)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21451)==0&false))) {{
            __CLR4_5_2g8gg8glusvmrqz.R.inc(21452);out.writeNull();
        } }else {{
            __CLR4_5_2g8gg8glusvmrqz.R.inc(21453);if ((((fieldType == null)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21454)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21455)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21456);fieldType = object.getClass();
            }

            }__CLR4_5_2g8gg8glusvmrqz.R.inc(21457);if ((((fieldType == LocalDateTime.class)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21458)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21459)==0&false))) {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21460);final int mask = SerializerFeature.UseISO8601DateFormat.getMask();
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21461);LocalDateTime dateTime = (LocalDateTime) object;
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21462);String format = serializer.getDateFormatPattern();

                __CLR4_5_2g8gg8glusvmrqz.R.inc(21463);if ((((format == null)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21464)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21465)==0&false))) {{
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21466);if (((((features & mask) != 0 || serializer.isEnabled(SerializerFeature.UseISO8601DateFormat))&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21467)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21468)==0&false))) {{
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21469);format = formatter_iso8601_pattern;
                    } }else {{
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21470);int nano = dateTime.getNano();
                        __CLR4_5_2g8gg8glusvmrqz.R.inc(21471);if ((((nano == 0)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21472)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21473)==0&false))) {{
                            __CLR4_5_2g8gg8glusvmrqz.R.inc(21474);format = formatter_iso8601_pattern;
                        } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21475);if ((((nano % 1000000 == 0)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21476)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21477)==0&false))) {{
                            __CLR4_5_2g8gg8glusvmrqz.R.inc(21478);format = formatter_iso8601_pattern_23;
                        } }else {{
                            __CLR4_5_2g8gg8glusvmrqz.R.inc(21479);format = formatter_iso8601_pattern_29;
                        }
                    }}}
                }}

                }__CLR4_5_2g8gg8glusvmrqz.R.inc(21480);if ((((format != null)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21481)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21482)==0&false))) {{
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21483);write(out, dateTime, format);
                } }else {__CLR4_5_2g8gg8glusvmrqz.R.inc(21484);if ((((out.isEnabled(SerializerFeature.WriteDateUseDateFormat))&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21485)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21486)==0&false))) {{
                    //\u4f7f\u7528\u56fa\u5b9a\u683c\u5f0f\u8f6c\u5316\u65f6\u95f4
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21487);write(out, dateTime, JSON.DEFFAULT_DATE_FORMAT);
                } }else {{
                    __CLR4_5_2g8gg8glusvmrqz.R.inc(21488);out.writeLong(dateTime.atZone(JSON.defaultTimeZone.toZoneId()).toInstant().toEpochMilli());
                }
            }}} }else {{
                __CLR4_5_2g8gg8glusvmrqz.R.inc(21489);out.writeString(object.toString());
            }
        }}
    }}finally{__CLR4_5_2g8gg8glusvmrqz.R.flushNeeded();}}

    public void write(JSONSerializer serializer, Object object, BeanContext context) throws IOException {try{__CLR4_5_2g8gg8glusvmrqz.R.inc(21490);
        __CLR4_5_2g8gg8glusvmrqz.R.inc(21491);SerializeWriter out = serializer.out;
        __CLR4_5_2g8gg8glusvmrqz.R.inc(21492);String format = context.getFormat();
        __CLR4_5_2g8gg8glusvmrqz.R.inc(21493);write(out, (TemporalAccessor) object, format);
    }finally{__CLR4_5_2g8gg8glusvmrqz.R.flushNeeded();}}

    private void write(SerializeWriter out, TemporalAccessor object, String format) {try{__CLR4_5_2g8gg8glusvmrqz.R.inc(21494);
        __CLR4_5_2g8gg8glusvmrqz.R.inc(21495);DateTimeFormatter formatter;
        __CLR4_5_2g8gg8glusvmrqz.R.inc(21496);if (((("unixtime".equals(format) && object instanceof ChronoZonedDateTime)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21497)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21498)==0&false))) {{
            __CLR4_5_2g8gg8glusvmrqz.R.inc(21499);long seconds = ((ChronoZonedDateTime) object).toEpochSecond();
            __CLR4_5_2g8gg8glusvmrqz.R.inc(21500);out.writeInt((int) seconds);
            __CLR4_5_2g8gg8glusvmrqz.R.inc(21501);return;
        }

        }__CLR4_5_2g8gg8glusvmrqz.R.inc(21502);if ((((format == formatter_iso8601_pattern)&&(__CLR4_5_2g8gg8glusvmrqz.R.iget(21503)!=0|true))||(__CLR4_5_2g8gg8glusvmrqz.R.iget(21504)==0&false))) {{
            __CLR4_5_2g8gg8glusvmrqz.R.inc(21505);formatter = formatter_iso8601;
        } }else {{
            __CLR4_5_2g8gg8glusvmrqz.R.inc(21506);formatter = DateTimeFormatter.ofPattern(format);
        }

        }__CLR4_5_2g8gg8glusvmrqz.R.inc(21507);String text = formatter.format((TemporalAccessor) object);
        __CLR4_5_2g8gg8glusvmrqz.R.inc(21508);out.writeString(text);
    }finally{__CLR4_5_2g8gg8glusvmrqz.R.flushNeeded();}}
}
