/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.IOUtils;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class CalendarCodec extends ContextObjectDeserializer implements ObjectSerializer, ObjectDeserializer, ContextObjectSerializer {public static class __CLR4_1_10ja9ja9lusqjjxu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,25130,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final static CalendarCodec instance = new CalendarCodec();

    private DatatypeFactory dateFactory;

    public void write(JSONSerializer serializer, Object object, BeanContext context) throws IOException {try{__CLR4_1_10ja9ja9lusqjjxu.R.inc(24993);
        __CLR4_1_10ja9ja9lusqjjxu.R.inc(24994);SerializeWriter out = serializer.out;
        __CLR4_1_10ja9ja9lusqjjxu.R.inc(24995);String format = context.getFormat();
        __CLR4_1_10ja9ja9lusqjjxu.R.inc(24996);Calendar calendar = (Calendar) object;

        __CLR4_1_10ja9ja9lusqjjxu.R.inc(24997);if ((((format.equals("unixtime"))&&(__CLR4_1_10ja9ja9lusqjjxu.R.iget(24998)!=0|true))||(__CLR4_1_10ja9ja9lusqjjxu.R.iget(24999)==0&false))) {{
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25000);long seconds = calendar.getTimeInMillis() / 1000L;
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25001);out.writeInt((int) seconds);
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25002);return;
        }

        }__CLR4_1_10ja9ja9lusqjjxu.R.inc(25003);DateFormat dateFormat = new SimpleDateFormat(format);
        __CLR4_1_10ja9ja9lusqjjxu.R.inc(25004);if ((((dateFormat == null)&&(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25005)!=0|true))||(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25006)==0&false))) {{
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25007);dateFormat = new SimpleDateFormat(JSON.DEFFAULT_DATE_FORMAT, serializer.locale);
        }
        }__CLR4_1_10ja9ja9lusqjjxu.R.inc(25008);dateFormat.setTimeZone(serializer.timeZone);
        __CLR4_1_10ja9ja9lusqjjxu.R.inc(25009);String text = dateFormat.format(calendar.getTime());
        __CLR4_1_10ja9ja9lusqjjxu.R.inc(25010);out.writeString(text);
    }finally{__CLR4_1_10ja9ja9lusqjjxu.R.flushNeeded();}}


    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features)
                                                                                                               throws IOException {try{__CLR4_1_10ja9ja9lusqjjxu.R.inc(25011);
        __CLR4_1_10ja9ja9lusqjjxu.R.inc(25012);SerializeWriter out = serializer.out;

        __CLR4_1_10ja9ja9lusqjjxu.R.inc(25013);if ((((object == null)&&(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25014)!=0|true))||(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25015)==0&false))) {{
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25016);out.writeNull();
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25017);return;
        }

        }__CLR4_1_10ja9ja9lusqjjxu.R.inc(25018);Calendar calendar;
        __CLR4_1_10ja9ja9lusqjjxu.R.inc(25019);if ((((object instanceof XMLGregorianCalendar)&&(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25020)!=0|true))||(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25021)==0&false))) {{
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25022);calendar = ((XMLGregorianCalendar) object).toGregorianCalendar();
        } }else {{
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25023);calendar = (Calendar) object;
        }

        }__CLR4_1_10ja9ja9lusqjjxu.R.inc(25024);if ((((out.isEnabled(SerializerFeature.UseISO8601DateFormat))&&(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25025)!=0|true))||(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25026)==0&false))) {{
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25027);final char quote = (((out.isEnabled(SerializerFeature.UseSingleQuotes) //
                )&&(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25028)!=0|true))||(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25029)==0&false))? '\'' //
                : '\"';
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25030);out.append(quote);

            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25031);int year = calendar.get(Calendar.YEAR);
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25032);int month = calendar.get(Calendar.MONTH) + 1;
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25033);int day = calendar.get(Calendar.DAY_OF_MONTH);
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25034);int hour = calendar.get(Calendar.HOUR_OF_DAY);
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25035);int minute = calendar.get(Calendar.MINUTE);
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25036);int second = calendar.get(Calendar.SECOND);
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25037);int millis = calendar.get(Calendar.MILLISECOND);

            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25038);char[] buf;
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25039);if ((((millis != 0)&&(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25040)!=0|true))||(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25041)==0&false))) {{
                __CLR4_1_10ja9ja9lusqjjxu.R.inc(25042);buf = "0000-00-00T00:00:00.000".toCharArray();
                __CLR4_1_10ja9ja9lusqjjxu.R.inc(25043);IOUtils.getChars(millis, 23, buf);
                __CLR4_1_10ja9ja9lusqjjxu.R.inc(25044);IOUtils.getChars(second, 19, buf);
                __CLR4_1_10ja9ja9lusqjjxu.R.inc(25045);IOUtils.getChars(minute, 16, buf);
                __CLR4_1_10ja9ja9lusqjjxu.R.inc(25046);IOUtils.getChars(hour, 13, buf);
                __CLR4_1_10ja9ja9lusqjjxu.R.inc(25047);IOUtils.getChars(day, 10, buf);
                __CLR4_1_10ja9ja9lusqjjxu.R.inc(25048);IOUtils.getChars(month, 7, buf);
                __CLR4_1_10ja9ja9lusqjjxu.R.inc(25049);IOUtils.getChars(year, 4, buf);

            } }else {{
                __CLR4_1_10ja9ja9lusqjjxu.R.inc(25050);if ((((second == 0 && minute == 0 && hour == 0)&&(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25051)!=0|true))||(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25052)==0&false))) {{
                    __CLR4_1_10ja9ja9lusqjjxu.R.inc(25053);buf = "0000-00-00".toCharArray();
                    __CLR4_1_10ja9ja9lusqjjxu.R.inc(25054);IOUtils.getChars(day, 10, buf);
                    __CLR4_1_10ja9ja9lusqjjxu.R.inc(25055);IOUtils.getChars(month, 7, buf);
                    __CLR4_1_10ja9ja9lusqjjxu.R.inc(25056);IOUtils.getChars(year, 4, buf);
                } }else {{
                    __CLR4_1_10ja9ja9lusqjjxu.R.inc(25057);buf = "0000-00-00T00:00:00".toCharArray();
                    __CLR4_1_10ja9ja9lusqjjxu.R.inc(25058);IOUtils.getChars(second, 19, buf);
                    __CLR4_1_10ja9ja9lusqjjxu.R.inc(25059);IOUtils.getChars(minute, 16, buf);
                    __CLR4_1_10ja9ja9lusqjjxu.R.inc(25060);IOUtils.getChars(hour, 13, buf);
                    __CLR4_1_10ja9ja9lusqjjxu.R.inc(25061);IOUtils.getChars(day, 10, buf);
                    __CLR4_1_10ja9ja9lusqjjxu.R.inc(25062);IOUtils.getChars(month, 7, buf);
                    __CLR4_1_10ja9ja9lusqjjxu.R.inc(25063);IOUtils.getChars(year, 4, buf);
                }
            }}

            }__CLR4_1_10ja9ja9lusqjjxu.R.inc(25064);out.write(buf);

            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25065);float timeZoneF = calendar.getTimeZone().getOffset(calendar.getTimeInMillis()) / (3600.0f * 1000);
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25066);int timeZone = (int)timeZoneF;
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25067);if ((((timeZone == 0.0)&&(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25068)!=0|true))||(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25069)==0&false))) {{
                __CLR4_1_10ja9ja9lusqjjxu.R.inc(25070);out.write('Z');
            } }else {{
                __CLR4_1_10ja9ja9lusqjjxu.R.inc(25071);if ((((timeZone > 9)&&(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25072)!=0|true))||(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25073)==0&false))) {{
                    __CLR4_1_10ja9ja9lusqjjxu.R.inc(25074);out.write('+');
                    __CLR4_1_10ja9ja9lusqjjxu.R.inc(25075);out.writeInt(timeZone);
                } }else {__CLR4_1_10ja9ja9lusqjjxu.R.inc(25076);if ((((timeZone > 0)&&(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25077)!=0|true))||(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25078)==0&false))) {{
                    __CLR4_1_10ja9ja9lusqjjxu.R.inc(25079);out.write('+');
                    __CLR4_1_10ja9ja9lusqjjxu.R.inc(25080);out.write('0');
                    __CLR4_1_10ja9ja9lusqjjxu.R.inc(25081);out.writeInt(timeZone);
                } }else {__CLR4_1_10ja9ja9lusqjjxu.R.inc(25082);if ((((timeZone < -9)&&(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25083)!=0|true))||(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25084)==0&false))) {{
                    __CLR4_1_10ja9ja9lusqjjxu.R.inc(25085);out.write('-');
                    __CLR4_1_10ja9ja9lusqjjxu.R.inc(25086);out.writeInt(timeZone);
                } }else {__CLR4_1_10ja9ja9lusqjjxu.R.inc(25087);if ((((timeZone < 0)&&(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25088)!=0|true))||(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25089)==0&false))) {{
                    __CLR4_1_10ja9ja9lusqjjxu.R.inc(25090);out.write('-');
                    __CLR4_1_10ja9ja9lusqjjxu.R.inc(25091);out.write('0');
                    __CLR4_1_10ja9ja9lusqjjxu.R.inc(25092);out.writeInt(-timeZone);
                }
                }}}}__CLR4_1_10ja9ja9lusqjjxu.R.inc(25093);out.write(':');
                // handles uneven timeZones 30 mins, 45 mins
                // this would always be less than 60
                __CLR4_1_10ja9ja9lusqjjxu.R.inc(25094);int offSet = (int)((timeZoneF - timeZone) * 60);
                __CLR4_1_10ja9ja9lusqjjxu.R.inc(25095);out.append(String.format("%02d", offSet));
            }

            }__CLR4_1_10ja9ja9lusqjjxu.R.inc(25096);out.append(quote);
        } }else {{
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25097);Date date = calendar.getTime();
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25098);serializer.write(date);
        }
    }}finally{__CLR4_1_10ja9ja9lusqjjxu.R.flushNeeded();}}

    public <T> T deserialze(DefaultJSONParser parser, Type clazz, Object fieldName) {try{__CLR4_1_10ja9ja9lusqjjxu.R.inc(25099);
        __CLR4_1_10ja9ja9lusqjjxu.R.inc(25100);return deserialze(parser, clazz, fieldName, null, 0);
    }finally{__CLR4_1_10ja9ja9lusqjjxu.R.flushNeeded();}}

    @Override
    @SuppressWarnings("unchecked")
    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName, String format, int features) {try{__CLR4_1_10ja9ja9lusqjjxu.R.inc(25101);
        __CLR4_1_10ja9ja9lusqjjxu.R.inc(25102);Object value = DateCodec.instance.deserialze(parser, type, fieldName, format, features);

        __CLR4_1_10ja9ja9lusqjjxu.R.inc(25103);if ((((value instanceof Calendar)&&(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25104)!=0|true))||(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25105)==0&false))) {{
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25106);return (T) value;
        }

        }__CLR4_1_10ja9ja9lusqjjxu.R.inc(25107);Date date = (Date) value;
        __CLR4_1_10ja9ja9lusqjjxu.R.inc(25108);if ((((date == null)&&(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25109)!=0|true))||(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25110)==0&false))) {{
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25111);return null;
        }

        }__CLR4_1_10ja9ja9lusqjjxu.R.inc(25112);JSONLexer lexer = parser.lexer;
        __CLR4_1_10ja9ja9lusqjjxu.R.inc(25113);Calendar calendar = Calendar.getInstance(lexer.getTimeZone(), lexer.getLocale());
        __CLR4_1_10ja9ja9lusqjjxu.R.inc(25114);calendar.setTime(date);

        __CLR4_1_10ja9ja9lusqjjxu.R.inc(25115);if ((((type == XMLGregorianCalendar.class)&&(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25116)!=0|true))||(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25117)==0&false))) {{
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25118);return (T) createXMLGregorianCalendar((GregorianCalendar) calendar);
        }

        }__CLR4_1_10ja9ja9lusqjjxu.R.inc(25119);return (T) calendar;
    }finally{__CLR4_1_10ja9ja9lusqjjxu.R.flushNeeded();}}

    public XMLGregorianCalendar createXMLGregorianCalendar(Calendar calendar) {try{__CLR4_1_10ja9ja9lusqjjxu.R.inc(25120);
        __CLR4_1_10ja9ja9lusqjjxu.R.inc(25121);if ((((dateFactory == null)&&(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25122)!=0|true))||(__CLR4_1_10ja9ja9lusqjjxu.R.iget(25123)==0&false))) {{
            __CLR4_1_10ja9ja9lusqjjxu.R.inc(25124);try {
                __CLR4_1_10ja9ja9lusqjjxu.R.inc(25125);dateFactory = DatatypeFactory.newInstance();
            } catch (DatatypeConfigurationException e) {
                __CLR4_1_10ja9ja9lusqjjxu.R.inc(25126);throw new IllegalStateException("Could not obtain an instance of DatatypeFactory.", e);
            }
        }
        }__CLR4_1_10ja9ja9lusqjjxu.R.inc(25127);return dateFactory.newXMLGregorianCalendar((GregorianCalendar) calendar);
    }finally{__CLR4_1_10ja9ja9lusqjjxu.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_1_10ja9ja9lusqjjxu.R.inc(25128);
        __CLR4_1_10ja9ja9lusqjjxu.R.inc(25129);return JSONToken.LITERAL_INT;
    }finally{__CLR4_1_10ja9ja9lusqjjxu.R.flushNeeded();}}
}
