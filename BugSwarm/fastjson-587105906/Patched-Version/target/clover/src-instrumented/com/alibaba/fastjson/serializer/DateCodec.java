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
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.deserializer.AbstractDateDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.TypeUtils;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class DateCodec extends AbstractDateDeserializer implements ObjectSerializer, ObjectDeserializer {public static class __CLR4_5_2jiyjiylusvmtki{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,25527,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final static DateCodec instance = new DateCodec();
    
    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {try{__CLR4_5_2jiyjiylusvmtki.R.inc(25306);
        __CLR4_5_2jiyjiylusvmtki.R.inc(25307);SerializeWriter out = serializer.out;

        __CLR4_5_2jiyjiylusvmtki.R.inc(25308);if ((((object == null)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25309)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25310)==0&false))) {{
            __CLR4_5_2jiyjiylusvmtki.R.inc(25311);out.writeNull();
            __CLR4_5_2jiyjiylusvmtki.R.inc(25312);return;
        }

        }__CLR4_5_2jiyjiylusvmtki.R.inc(25313);Class<?> clazz = object.getClass();
        __CLR4_5_2jiyjiylusvmtki.R.inc(25314);if ((((clazz == java.sql.Date.class)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25315)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25316)==0&false))) {{
            __CLR4_5_2jiyjiylusvmtki.R.inc(25317);long millis = ((java.sql.Date) object).getTime();
            __CLR4_5_2jiyjiylusvmtki.R.inc(25318);TimeZone timeZone = serializer.timeZone;
            __CLR4_5_2jiyjiylusvmtki.R.inc(25319);int offset = timeZone.getOffset(millis);
            //
            __CLR4_5_2jiyjiylusvmtki.R.inc(25320);if (((((millis + offset) % (24 * 1000 * 3600) == 0
                    && !SerializerFeature.isEnabled(out.features, features, SerializerFeature.WriteClassName))&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25321)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25322)==0&false))) {{
                __CLR4_5_2jiyjiylusvmtki.R.inc(25323);out.writeString(object.toString());
                __CLR4_5_2jiyjiylusvmtki.R.inc(25324);return;
            }
        }}

        }__CLR4_5_2jiyjiylusvmtki.R.inc(25325);if ((((clazz == java.sql.Time.class)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25326)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25327)==0&false))) {{
            __CLR4_5_2jiyjiylusvmtki.R.inc(25328);long millis = ((java.sql.Time) object).getTime();
            __CLR4_5_2jiyjiylusvmtki.R.inc(25329);if ((((millis < 24L * 60L * 60L * 1000L)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25330)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25331)==0&false))) {{
                __CLR4_5_2jiyjiylusvmtki.R.inc(25332);out.writeString(object.toString());
                __CLR4_5_2jiyjiylusvmtki.R.inc(25333);return;
            }
        }}
        
        }__CLR4_5_2jiyjiylusvmtki.R.inc(25334);Date date;
        __CLR4_5_2jiyjiylusvmtki.R.inc(25335);if ((((object instanceof Date)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25336)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25337)==0&false))) {{
            __CLR4_5_2jiyjiylusvmtki.R.inc(25338);date = (Date) object;
        } }else {{
            __CLR4_5_2jiyjiylusvmtki.R.inc(25339);date = TypeUtils.castToDate(object);
        }
        
        }__CLR4_5_2jiyjiylusvmtki.R.inc(25340);if ((((out.isEnabled(SerializerFeature.WriteDateUseDateFormat))&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25341)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25342)==0&false))) {{
            __CLR4_5_2jiyjiylusvmtki.R.inc(25343);DateFormat format = serializer.getDateFormat();
            __CLR4_5_2jiyjiylusvmtki.R.inc(25344);if ((((format == null)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25345)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25346)==0&false))) {{
                __CLR4_5_2jiyjiylusvmtki.R.inc(25347);format = new SimpleDateFormat(JSON.DEFFAULT_DATE_FORMAT, serializer.locale);
                __CLR4_5_2jiyjiylusvmtki.R.inc(25348);format.setTimeZone(serializer.timeZone);
            }
            }__CLR4_5_2jiyjiylusvmtki.R.inc(25349);String text = format.format(date);
            __CLR4_5_2jiyjiylusvmtki.R.inc(25350);out.writeString(text);
            __CLR4_5_2jiyjiylusvmtki.R.inc(25351);return;
        }
        
        }__CLR4_5_2jiyjiylusvmtki.R.inc(25352);if ((((out.isEnabled(SerializerFeature.WriteClassName))&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25353)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25354)==0&false))) {{
            __CLR4_5_2jiyjiylusvmtki.R.inc(25355);if ((((clazz != fieldType)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25356)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25357)==0&false))) {{
                __CLR4_5_2jiyjiylusvmtki.R.inc(25358);if ((((clazz == java.util.Date.class)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25359)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25360)==0&false))) {{
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25361);out.write("new Date(");
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25362);out.writeLong(((Date) object).getTime());
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25363);out.write(')');
                } }else {{
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25364);out.write('{');
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25365);out.writeFieldName(JSON.DEFAULT_TYPE_KEY);
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25366);serializer.write(clazz.getName());
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25367);out.writeFieldValue(',', "val", ((Date) object).getTime());
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25368);out.write('}');
                }
                }__CLR4_5_2jiyjiylusvmtki.R.inc(25369);return;
            }
        }}

        }__CLR4_5_2jiyjiylusvmtki.R.inc(25370);long time = date.getTime();
        __CLR4_5_2jiyjiylusvmtki.R.inc(25371);if ((((out.isEnabled(SerializerFeature.UseISO8601DateFormat))&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25372)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25373)==0&false))) {{
            __CLR4_5_2jiyjiylusvmtki.R.inc(25374);char quote = (((out.isEnabled(SerializerFeature.UseSingleQuotes) )&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25375)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25376)==0&false))? '\'' : '\"'; 
            __CLR4_5_2jiyjiylusvmtki.R.inc(25377);out.write(quote);

            __CLR4_5_2jiyjiylusvmtki.R.inc(25378);Calendar calendar = Calendar.getInstance(serializer.timeZone, serializer.locale);
            __CLR4_5_2jiyjiylusvmtki.R.inc(25379);calendar.setTimeInMillis(time);

            __CLR4_5_2jiyjiylusvmtki.R.inc(25380);int year = calendar.get(Calendar.YEAR);
            __CLR4_5_2jiyjiylusvmtki.R.inc(25381);int month = calendar.get(Calendar.MONTH) + 1;
            __CLR4_5_2jiyjiylusvmtki.R.inc(25382);int day = calendar.get(Calendar.DAY_OF_MONTH);
            __CLR4_5_2jiyjiylusvmtki.R.inc(25383);int hour = calendar.get(Calendar.HOUR_OF_DAY);
            __CLR4_5_2jiyjiylusvmtki.R.inc(25384);int minute = calendar.get(Calendar.MINUTE);
            __CLR4_5_2jiyjiylusvmtki.R.inc(25385);int second = calendar.get(Calendar.SECOND);
            __CLR4_5_2jiyjiylusvmtki.R.inc(25386);int millis = calendar.get(Calendar.MILLISECOND);

            __CLR4_5_2jiyjiylusvmtki.R.inc(25387);char[] buf;
            __CLR4_5_2jiyjiylusvmtki.R.inc(25388);if ((((millis != 0)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25389)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25390)==0&false))) {{
                __CLR4_5_2jiyjiylusvmtki.R.inc(25391);buf = "0000-00-00T00:00:00.000".toCharArray();
                __CLR4_5_2jiyjiylusvmtki.R.inc(25392);IOUtils.getChars(millis, 23, buf);
                __CLR4_5_2jiyjiylusvmtki.R.inc(25393);IOUtils.getChars(second, 19, buf);
                __CLR4_5_2jiyjiylusvmtki.R.inc(25394);IOUtils.getChars(minute, 16, buf);
                __CLR4_5_2jiyjiylusvmtki.R.inc(25395);IOUtils.getChars(hour, 13, buf);
                __CLR4_5_2jiyjiylusvmtki.R.inc(25396);IOUtils.getChars(day, 10, buf);
                __CLR4_5_2jiyjiylusvmtki.R.inc(25397);IOUtils.getChars(month, 7, buf);
                __CLR4_5_2jiyjiylusvmtki.R.inc(25398);IOUtils.getChars(year, 4, buf);

            } }else {{
                __CLR4_5_2jiyjiylusvmtki.R.inc(25399);if ((((second == 0 && minute == 0 && hour == 0)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25400)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25401)==0&false))) {{
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25402);buf = "0000-00-00".toCharArray();
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25403);IOUtils.getChars(day, 10, buf);
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25404);IOUtils.getChars(month, 7, buf);
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25405);IOUtils.getChars(year, 4, buf);
                } }else {{
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25406);buf = "0000-00-00T00:00:00".toCharArray();
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25407);IOUtils.getChars(second, 19, buf);
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25408);IOUtils.getChars(minute, 16, buf);
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25409);IOUtils.getChars(hour, 13, buf);
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25410);IOUtils.getChars(day, 10, buf);
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25411);IOUtils.getChars(month, 7, buf);
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25412);IOUtils.getChars(year, 4, buf);
                }
            }}
            
            }__CLR4_5_2jiyjiylusvmtki.R.inc(25413);out.write(buf);

            __CLR4_5_2jiyjiylusvmtki.R.inc(25414);float timeZoneF = calendar.getTimeZone().getOffset(calendar.getTimeInMillis()) / (3600.0f * 1000);
            __CLR4_5_2jiyjiylusvmtki.R.inc(25415);int timeZone = (int)timeZoneF;
            __CLR4_5_2jiyjiylusvmtki.R.inc(25416);if ((((timeZone == 0.0)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25417)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25418)==0&false))) {{
                __CLR4_5_2jiyjiylusvmtki.R.inc(25419);out.write('Z');
            } }else {{
                __CLR4_5_2jiyjiylusvmtki.R.inc(25420);if ((((timeZone > 9)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25421)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25422)==0&false))) {{
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25423);out.write('+');
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25424);out.writeInt(timeZone);
                } }else {__CLR4_5_2jiyjiylusvmtki.R.inc(25425);if ((((timeZone > 0)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25426)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25427)==0&false))) {{
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25428);out.write('+');
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25429);out.write('0');
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25430);out.writeInt(timeZone);
                } }else {__CLR4_5_2jiyjiylusvmtki.R.inc(25431);if ((((timeZone < -9)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25432)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25433)==0&false))) {{
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25434);out.write('-');
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25435);out.writeInt(timeZone);
                } }else {__CLR4_5_2jiyjiylusvmtki.R.inc(25436);if ((((timeZone < 0)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25437)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25438)==0&false))) {{
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25439);out.write('-');
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25440);out.write('0');
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25441);out.writeInt(-timeZone);
                }
                }}}}__CLR4_5_2jiyjiylusvmtki.R.inc(25442);out.write(':');
                // handles uneven timeZones 30 mins, 45 mins
                // this would always be less than 60
                __CLR4_5_2jiyjiylusvmtki.R.inc(25443);int offSet = (int)((timeZoneF - timeZone) * 60);
                __CLR4_5_2jiyjiylusvmtki.R.inc(25444);out.append(String.format("%02d", offSet));
            }

            }__CLR4_5_2jiyjiylusvmtki.R.inc(25445);out.write(quote);
        } }else {{
            __CLR4_5_2jiyjiylusvmtki.R.inc(25446);out.writeLong(time);
        }
    }}finally{__CLR4_5_2jiyjiylusvmtki.R.flushNeeded();}}
    
    @SuppressWarnings("unchecked")
    public <T> T cast(DefaultJSONParser parser, Type clazz, Object fieldName, Object val) {try{__CLR4_5_2jiyjiylusvmtki.R.inc(25447);

        __CLR4_5_2jiyjiylusvmtki.R.inc(25448);if ((((val == null)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25449)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25450)==0&false))) {{
            __CLR4_5_2jiyjiylusvmtki.R.inc(25451);return null;
        }

        }__CLR4_5_2jiyjiylusvmtki.R.inc(25452);if ((((val instanceof java.util.Date)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25453)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25454)==0&false))) {{
            __CLR4_5_2jiyjiylusvmtki.R.inc(25455);return (T) val;
        } }else {__CLR4_5_2jiyjiylusvmtki.R.inc(25456);if ((((val instanceof BigDecimal)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25457)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25458)==0&false))) {{
            __CLR4_5_2jiyjiylusvmtki.R.inc(25459);return (T) new java.util.Date(TypeUtils.longValue((BigDecimal) val));
        } }else {__CLR4_5_2jiyjiylusvmtki.R.inc(25460);if ((((val instanceof Number)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25461)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25462)==0&false))) {{
            __CLR4_5_2jiyjiylusvmtki.R.inc(25463);return (T) new java.util.Date(((Number) val).longValue());
        } }else {__CLR4_5_2jiyjiylusvmtki.R.inc(25464);if ((((val instanceof String)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25465)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25466)==0&false))) {{
            __CLR4_5_2jiyjiylusvmtki.R.inc(25467);String strVal = (String) val;
            __CLR4_5_2jiyjiylusvmtki.R.inc(25468);if ((((strVal.length() == 0)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25469)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25470)==0&false))) {{
                __CLR4_5_2jiyjiylusvmtki.R.inc(25471);return null;
            }

            }{
                __CLR4_5_2jiyjiylusvmtki.R.inc(25472);JSONScanner dateLexer = new JSONScanner(strVal);
                __CLR4_5_2jiyjiylusvmtki.R.inc(25473);try {
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25474);if ((((dateLexer.scanISO8601DateIfMatch(false))&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25475)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25476)==0&false))) {{
                        __CLR4_5_2jiyjiylusvmtki.R.inc(25477);Calendar calendar = dateLexer.getCalendar();

                        __CLR4_5_2jiyjiylusvmtki.R.inc(25478);if ((((clazz == Calendar.class)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25479)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25480)==0&false))) {{
                            __CLR4_5_2jiyjiylusvmtki.R.inc(25481);return (T) calendar;
                        }

                        }__CLR4_5_2jiyjiylusvmtki.R.inc(25482);return (T) calendar.getTime();
                    }
                }} finally {
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25483);dateLexer.close();
                }
            }
            
            __CLR4_5_2jiyjiylusvmtki.R.inc(25484);if ((((strVal.length() == parser.getDateFomartPattern().length()
                    || (strVal.length() == 22 && parser.getDateFomartPattern().equals("yyyyMMddHHmmssSSSZ")))&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25485)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25486)==0&false))) {{
                __CLR4_5_2jiyjiylusvmtki.R.inc(25487);DateFormat dateFormat = parser.getDateFormat();
                __CLR4_5_2jiyjiylusvmtki.R.inc(25488);try {
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25489);return (T) dateFormat.parse(strVal);
                } catch (ParseException e) {
                    // skip
                }
            }
            
            }__CLR4_5_2jiyjiylusvmtki.R.inc(25490);if ((((strVal.startsWith("/Date(") && strVal.endsWith(")/"))&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25491)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25492)==0&false))) {{
                __CLR4_5_2jiyjiylusvmtki.R.inc(25493);String dotnetDateStr = strVal.substring(6, strVal.length() - 2);
                __CLR4_5_2jiyjiylusvmtki.R.inc(25494);strVal = dotnetDateStr;
            }

            }__CLR4_5_2jiyjiylusvmtki.R.inc(25495);if (((("0000-00-00".equals(strVal)
                    || "0000-00-00T00:00:00".equalsIgnoreCase(strVal)
                    || "0001-01-01T00:00:00+08:00".equalsIgnoreCase(strVal))&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25496)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25497)==0&false))) {{
                __CLR4_5_2jiyjiylusvmtki.R.inc(25498);return null;
            }

            }__CLR4_5_2jiyjiylusvmtki.R.inc(25499);int index = strVal.lastIndexOf('|');
            __CLR4_5_2jiyjiylusvmtki.R.inc(25500);if ((((index > 20)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25501)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25502)==0&false))) {{
                __CLR4_5_2jiyjiylusvmtki.R.inc(25503);String tzStr = strVal.substring(index + 1);
                __CLR4_5_2jiyjiylusvmtki.R.inc(25504);TimeZone timeZone = TimeZone.getTimeZone(tzStr);
                __CLR4_5_2jiyjiylusvmtki.R.inc(25505);if ((((!"GMT".equals(timeZone.getID()))&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25506)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25507)==0&false))) {{
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25508);String subStr = strVal.substring(0, index);
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25509);JSONScanner dateLexer = new JSONScanner(subStr);
                    __CLR4_5_2jiyjiylusvmtki.R.inc(25510);try {
                        __CLR4_5_2jiyjiylusvmtki.R.inc(25511);if ((((dateLexer.scanISO8601DateIfMatch(false))&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25512)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25513)==0&false))) {{
                            __CLR4_5_2jiyjiylusvmtki.R.inc(25514);Calendar calendar = dateLexer.getCalendar();

                            __CLR4_5_2jiyjiylusvmtki.R.inc(25515);calendar.setTimeZone(timeZone);

                            __CLR4_5_2jiyjiylusvmtki.R.inc(25516);if ((((clazz == Calendar.class)&&(__CLR4_5_2jiyjiylusvmtki.R.iget(25517)!=0|true))||(__CLR4_5_2jiyjiylusvmtki.R.iget(25518)==0&false))) {{
                                __CLR4_5_2jiyjiylusvmtki.R.inc(25519);return (T) calendar;
                            }

                            }__CLR4_5_2jiyjiylusvmtki.R.inc(25520);return (T) calendar.getTime();
                        }
                    }} finally {
                        __CLR4_5_2jiyjiylusvmtki.R.inc(25521);dateLexer.close();
                    }
                }
            }}

            // 2017-08-14 19:05:30.000|America/Los_Angeles
//            
            }__CLR4_5_2jiyjiylusvmtki.R.inc(25522);long longVal = Long.parseLong(strVal);
            __CLR4_5_2jiyjiylusvmtki.R.inc(25523);return (T) new java.util.Date(longVal);
        }

        }}}}__CLR4_5_2jiyjiylusvmtki.R.inc(25524);throw new JSONException("parse error");
    }finally{__CLR4_5_2jiyjiylusvmtki.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_5_2jiyjiylusvmtki.R.inc(25525);
        __CLR4_5_2jiyjiylusvmtki.R.inc(25526);return JSONToken.LITERAL_INT;
    }finally{__CLR4_5_2jiyjiylusvmtki.R.flushNeeded();}}

}
