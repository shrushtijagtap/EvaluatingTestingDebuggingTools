/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.parser.deserializer;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.util.TypeUtils;

public class SqlDateDeserializer extends AbstractDateDeserializer implements ObjectDeserializer {public static class __CLR4_1_10h1ih1iluszvyij{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,22178,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final static SqlDateDeserializer instance = new SqlDateDeserializer();
    public final static SqlDateDeserializer instance_timestamp = new SqlDateDeserializer(true);
    
    private boolean                           timestamp = false;
    
    public SqlDateDeserializer() {try{__CLR4_1_10h1ih1iluszvyij.R.inc(22086);
        
    }finally{__CLR4_1_10h1ih1iluszvyij.R.flushNeeded();}}
    
    public SqlDateDeserializer(boolean timestmap) {try{__CLR4_1_10h1ih1iluszvyij.R.inc(22087);
        __CLR4_1_10h1ih1iluszvyij.R.inc(22088);this.timestamp = true;
    }finally{__CLR4_1_10h1ih1iluszvyij.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    protected <T> T cast(DefaultJSONParser parser, Type clazz, Object fieldName, Object val) {try{__CLR4_1_10h1ih1iluszvyij.R.inc(22089);
        __CLR4_1_10h1ih1iluszvyij.R.inc(22090);if ((((timestamp)&&(__CLR4_1_10h1ih1iluszvyij.R.iget(22091)!=0|true))||(__CLR4_1_10h1ih1iluszvyij.R.iget(22092)==0&false))) {{
            __CLR4_1_10h1ih1iluszvyij.R.inc(22093);return castTimestamp(parser, clazz, fieldName, val);
        }
        
        }__CLR4_1_10h1ih1iluszvyij.R.inc(22094);if ((((val == null)&&(__CLR4_1_10h1ih1iluszvyij.R.iget(22095)!=0|true))||(__CLR4_1_10h1ih1iluszvyij.R.iget(22096)==0&false))) {{
            __CLR4_1_10h1ih1iluszvyij.R.inc(22097);return null;
        }

        }__CLR4_1_10h1ih1iluszvyij.R.inc(22098);if ((((val instanceof java.util.Date)&&(__CLR4_1_10h1ih1iluszvyij.R.iget(22099)!=0|true))||(__CLR4_1_10h1ih1iluszvyij.R.iget(22100)==0&false))) {{
            __CLR4_1_10h1ih1iluszvyij.R.inc(22101);val = new java.sql.Date(((Date) val).getTime());
        } }else {__CLR4_1_10h1ih1iluszvyij.R.inc(22102);if ((((val instanceof BigDecimal)&&(__CLR4_1_10h1ih1iluszvyij.R.iget(22103)!=0|true))||(__CLR4_1_10h1ih1iluszvyij.R.iget(22104)==0&false))) {{
            __CLR4_1_10h1ih1iluszvyij.R.inc(22105);val = (T) new java.sql.Date(TypeUtils.longValue((BigDecimal) val));
        } }else {__CLR4_1_10h1ih1iluszvyij.R.inc(22106);if ((((val instanceof Number)&&(__CLR4_1_10h1ih1iluszvyij.R.iget(22107)!=0|true))||(__CLR4_1_10h1ih1iluszvyij.R.iget(22108)==0&false))) {{
            __CLR4_1_10h1ih1iluszvyij.R.inc(22109);val = (T) new java.sql.Date(((Number) val).longValue());
        } }else {__CLR4_1_10h1ih1iluszvyij.R.inc(22110);if ((((val instanceof String)&&(__CLR4_1_10h1ih1iluszvyij.R.iget(22111)!=0|true))||(__CLR4_1_10h1ih1iluszvyij.R.iget(22112)==0&false))) {{
            __CLR4_1_10h1ih1iluszvyij.R.inc(22113);String strVal = (String) val;
            __CLR4_1_10h1ih1iluszvyij.R.inc(22114);if ((((strVal.length() == 0)&&(__CLR4_1_10h1ih1iluszvyij.R.iget(22115)!=0|true))||(__CLR4_1_10h1ih1iluszvyij.R.iget(22116)==0&false))) {{
                __CLR4_1_10h1ih1iluszvyij.R.inc(22117);return null;
            }

            }__CLR4_1_10h1ih1iluszvyij.R.inc(22118);long longVal;

            __CLR4_1_10h1ih1iluszvyij.R.inc(22119);JSONScanner dateLexer = new JSONScanner(strVal);
            __CLR4_1_10h1ih1iluszvyij.R.inc(22120);try {
                __CLR4_1_10h1ih1iluszvyij.R.inc(22121);if ((((dateLexer.scanISO8601DateIfMatch())&&(__CLR4_1_10h1ih1iluszvyij.R.iget(22122)!=0|true))||(__CLR4_1_10h1ih1iluszvyij.R.iget(22123)==0&false))) {{
                    __CLR4_1_10h1ih1iluszvyij.R.inc(22124);longVal = dateLexer.getCalendar().getTimeInMillis();
                } }else {{

                    __CLR4_1_10h1ih1iluszvyij.R.inc(22125);DateFormat dateFormat = parser.getDateFormat();
                    __CLR4_1_10h1ih1iluszvyij.R.inc(22126);try {
                        __CLR4_1_10h1ih1iluszvyij.R.inc(22127);java.util.Date date = (java.util.Date) dateFormat.parse(strVal);
                        __CLR4_1_10h1ih1iluszvyij.R.inc(22128);java.sql.Date sqlDate = new java.sql.Date(date.getTime());
                        __CLR4_1_10h1ih1iluszvyij.R.inc(22129);return (T) sqlDate;
                    } catch (ParseException e) {
                        // skip
                    }

                    __CLR4_1_10h1ih1iluszvyij.R.inc(22130);longVal = Long.parseLong(strVal);
                }
            }} finally {
                __CLR4_1_10h1ih1iluszvyij.R.inc(22131);dateLexer.close();
            }
            __CLR4_1_10h1ih1iluszvyij.R.inc(22132);return (T) new java.sql.Date(longVal);
        } }else {{
            __CLR4_1_10h1ih1iluszvyij.R.inc(22133);throw new JSONException("parse error : " + val);
        }

        }}}}__CLR4_1_10h1ih1iluszvyij.R.inc(22134);return (T) val;
    }finally{__CLR4_1_10h1ih1iluszvyij.R.flushNeeded();}}
    
    @SuppressWarnings("unchecked")
    protected <T> T castTimestamp(DefaultJSONParser parser, Type clazz, Object fieldName, Object val) {try{__CLR4_1_10h1ih1iluszvyij.R.inc(22135);

        __CLR4_1_10h1ih1iluszvyij.R.inc(22136);if ((((val == null)&&(__CLR4_1_10h1ih1iluszvyij.R.iget(22137)!=0|true))||(__CLR4_1_10h1ih1iluszvyij.R.iget(22138)==0&false))) {{
            __CLR4_1_10h1ih1iluszvyij.R.inc(22139);return null;
        }

        }__CLR4_1_10h1ih1iluszvyij.R.inc(22140);if ((((val instanceof java.util.Date)&&(__CLR4_1_10h1ih1iluszvyij.R.iget(22141)!=0|true))||(__CLR4_1_10h1ih1iluszvyij.R.iget(22142)==0&false))) {{
            __CLR4_1_10h1ih1iluszvyij.R.inc(22143);return (T) new java.sql.Timestamp(((Date) val).getTime());
        }

        }__CLR4_1_10h1ih1iluszvyij.R.inc(22144);if ((((val instanceof BigDecimal)&&(__CLR4_1_10h1ih1iluszvyij.R.iget(22145)!=0|true))||(__CLR4_1_10h1ih1iluszvyij.R.iget(22146)==0&false))) {{
            __CLR4_1_10h1ih1iluszvyij.R.inc(22147);return (T) new java.sql.Timestamp(TypeUtils.longValue((BigDecimal) val));
        }

        }__CLR4_1_10h1ih1iluszvyij.R.inc(22148);if ((((val instanceof Number)&&(__CLR4_1_10h1ih1iluszvyij.R.iget(22149)!=0|true))||(__CLR4_1_10h1ih1iluszvyij.R.iget(22150)==0&false))) {{
            __CLR4_1_10h1ih1iluszvyij.R.inc(22151);return (T) new java.sql.Timestamp(((Number) val).longValue());
        }

        }__CLR4_1_10h1ih1iluszvyij.R.inc(22152);if ((((val instanceof String)&&(__CLR4_1_10h1ih1iluszvyij.R.iget(22153)!=0|true))||(__CLR4_1_10h1ih1iluszvyij.R.iget(22154)==0&false))) {{
            __CLR4_1_10h1ih1iluszvyij.R.inc(22155);String strVal = (String) val;
            __CLR4_1_10h1ih1iluszvyij.R.inc(22156);if ((((strVal.length() == 0)&&(__CLR4_1_10h1ih1iluszvyij.R.iget(22157)!=0|true))||(__CLR4_1_10h1ih1iluszvyij.R.iget(22158)==0&false))) {{
                __CLR4_1_10h1ih1iluszvyij.R.inc(22159);return null;
            }

            }__CLR4_1_10h1ih1iluszvyij.R.inc(22160);long longVal;
            __CLR4_1_10h1ih1iluszvyij.R.inc(22161);JSONScanner dateLexer = new JSONScanner(strVal);
            __CLR4_1_10h1ih1iluszvyij.R.inc(22162);try {
                __CLR4_1_10h1ih1iluszvyij.R.inc(22163);if ((((dateLexer.scanISO8601DateIfMatch(false))&&(__CLR4_1_10h1ih1iluszvyij.R.iget(22164)!=0|true))||(__CLR4_1_10h1ih1iluszvyij.R.iget(22165)==0&false))) {{
                    __CLR4_1_10h1ih1iluszvyij.R.inc(22166);longVal = dateLexer.getCalendar().getTimeInMillis();
                } }else {{

                    __CLR4_1_10h1ih1iluszvyij.R.inc(22167);DateFormat dateFormat = parser.getDateFormat();
                    __CLR4_1_10h1ih1iluszvyij.R.inc(22168);try {
                        __CLR4_1_10h1ih1iluszvyij.R.inc(22169);java.util.Date date = (java.util.Date) dateFormat.parse(strVal);
                        __CLR4_1_10h1ih1iluszvyij.R.inc(22170);java.sql.Timestamp sqlDate = new java.sql.Timestamp(date.getTime());
                        __CLR4_1_10h1ih1iluszvyij.R.inc(22171);return (T) sqlDate;
                    } catch (ParseException e) {
                        // skip
                    }

                    __CLR4_1_10h1ih1iluszvyij.R.inc(22172);longVal = Long.parseLong(strVal);
                }
            }} finally {
                __CLR4_1_10h1ih1iluszvyij.R.inc(22173);dateLexer.close();
            }

            __CLR4_1_10h1ih1iluszvyij.R.inc(22174);return (T) new java.sql.Timestamp(longVal);
        }

        }__CLR4_1_10h1ih1iluszvyij.R.inc(22175);throw new JSONException("parse error");
    }finally{__CLR4_1_10h1ih1iluszvyij.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_1_10h1ih1iluszvyij.R.inc(22176);
        __CLR4_1_10h1ih1iluszvyij.R.inc(22177);return JSONToken.LITERAL_INT;
    }finally{__CLR4_1_10h1ih1iluszvyij.R.flushNeeded();}}
}
