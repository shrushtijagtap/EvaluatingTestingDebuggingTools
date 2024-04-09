/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.parser.deserializer;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.zip.GZIPInputStream;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.FieldInfo;

public class DefaultFieldDeserializer extends FieldDeserializer {public static class __CLR4_1_10enoenolusqjhf9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,19090,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected ObjectDeserializer fieldValueDeserilizer;
    protected boolean            customDeserilizer     = false;

    public DefaultFieldDeserializer(ParserConfig config, Class<?> clazz, FieldInfo fieldInfo){
        super(clazz, fieldInfo);__CLR4_1_10enoenolusqjhf9.R.inc(18997);try{__CLR4_1_10enoenolusqjhf9.R.inc(18996);
        __CLR4_1_10enoenolusqjhf9.R.inc(18998);JSONField annotation = fieldInfo.getAnnotation();
        __CLR4_1_10enoenolusqjhf9.R.inc(18999);if ((((annotation != null)&&(__CLR4_1_10enoenolusqjhf9.R.iget(19000)!=0|true))||(__CLR4_1_10enoenolusqjhf9.R.iget(19001)==0&false))) {{
            __CLR4_1_10enoenolusqjhf9.R.inc(19002);Class<?> deserializeUsing = annotation.deserializeUsing();
            __CLR4_1_10enoenolusqjhf9.R.inc(19003);customDeserilizer = deserializeUsing != null && deserializeUsing != Void.class;
        }
    }}finally{__CLR4_1_10enoenolusqjhf9.R.flushNeeded();}}

    public ObjectDeserializer getFieldValueDeserilizer(ParserConfig config) {try{__CLR4_1_10enoenolusqjhf9.R.inc(19004);
        __CLR4_1_10enoenolusqjhf9.R.inc(19005);if ((((fieldValueDeserilizer == null)&&(__CLR4_1_10enoenolusqjhf9.R.iget(19006)!=0|true))||(__CLR4_1_10enoenolusqjhf9.R.iget(19007)==0&false))) {{
            __CLR4_1_10enoenolusqjhf9.R.inc(19008);JSONField annotation = fieldInfo.getAnnotation();
            __CLR4_1_10enoenolusqjhf9.R.inc(19009);if ((((annotation != null && annotation.deserializeUsing() != Void.class)&&(__CLR4_1_10enoenolusqjhf9.R.iget(19010)!=0|true))||(__CLR4_1_10enoenolusqjhf9.R.iget(19011)==0&false))) {{
                __CLR4_1_10enoenolusqjhf9.R.inc(19012);Class<?> deserializeUsing = annotation.deserializeUsing();
                __CLR4_1_10enoenolusqjhf9.R.inc(19013);try {
                    __CLR4_1_10enoenolusqjhf9.R.inc(19014);fieldValueDeserilizer = (ObjectDeserializer) deserializeUsing.newInstance();
                } catch (Exception ex) {
                    __CLR4_1_10enoenolusqjhf9.R.inc(19015);throw new JSONException("create deserializeUsing ObjectDeserializer error", ex);
                }
            } }else {{
                __CLR4_1_10enoenolusqjhf9.R.inc(19016);fieldValueDeserilizer = config.getDeserializer(fieldInfo.fieldClass, fieldInfo.fieldType);
            }
        }}

        }__CLR4_1_10enoenolusqjhf9.R.inc(19017);return fieldValueDeserilizer;
    }finally{__CLR4_1_10enoenolusqjhf9.R.flushNeeded();}}

    @Override
    public void parseField(DefaultJSONParser parser, Object object, Type objectType, Map<String, Object> fieldValues) {try{__CLR4_1_10enoenolusqjhf9.R.inc(19018);
        __CLR4_1_10enoenolusqjhf9.R.inc(19019);if ((((this.fieldValueDeserilizer == null)&&(__CLR4_1_10enoenolusqjhf9.R.iget(19020)!=0|true))||(__CLR4_1_10enoenolusqjhf9.R.iget(19021)==0&false))) {{
            __CLR4_1_10enoenolusqjhf9.R.inc(19022);getFieldValueDeserilizer(parser.getConfig());
        }

        }__CLR4_1_10enoenolusqjhf9.R.inc(19023);ObjectDeserializer fieldValueDeserilizer = this.fieldValueDeserilizer;
        __CLR4_1_10enoenolusqjhf9.R.inc(19024);Type fieldType = fieldInfo.fieldType;
        __CLR4_1_10enoenolusqjhf9.R.inc(19025);if ((((objectType instanceof ParameterizedType)&&(__CLR4_1_10enoenolusqjhf9.R.iget(19026)!=0|true))||(__CLR4_1_10enoenolusqjhf9.R.iget(19027)==0&false))) {{
            __CLR4_1_10enoenolusqjhf9.R.inc(19028);ParseContext objContext = parser.getContext();
            __CLR4_1_10enoenolusqjhf9.R.inc(19029);if ((((objContext != null)&&(__CLR4_1_10enoenolusqjhf9.R.iget(19030)!=0|true))||(__CLR4_1_10enoenolusqjhf9.R.iget(19031)==0&false))) {{
                __CLR4_1_10enoenolusqjhf9.R.inc(19032);objContext.type = objectType;
            }
            }__CLR4_1_10enoenolusqjhf9.R.inc(19033);if ((((fieldType != objectType)&&(__CLR4_1_10enoenolusqjhf9.R.iget(19034)!=0|true))||(__CLR4_1_10enoenolusqjhf9.R.iget(19035)==0&false))) {{
                __CLR4_1_10enoenolusqjhf9.R.inc(19036);fieldType = FieldInfo.getFieldType(this.clazz, objectType, fieldType);
                __CLR4_1_10enoenolusqjhf9.R.inc(19037);fieldValueDeserilizer = parser.getConfig().getDeserializer(fieldType);
            }
        }}

        // ContextObjectDeserializer
        }__CLR4_1_10enoenolusqjhf9.R.inc(19038);Object value;
        __CLR4_1_10enoenolusqjhf9.R.inc(19039);if ((((fieldValueDeserilizer instanceof JavaBeanDeserializer && fieldInfo.parserFeatures != 0)&&(__CLR4_1_10enoenolusqjhf9.R.iget(19040)!=0|true))||(__CLR4_1_10enoenolusqjhf9.R.iget(19041)==0&false))) {{
            __CLR4_1_10enoenolusqjhf9.R.inc(19042);JavaBeanDeserializer javaBeanDeser = (JavaBeanDeserializer) fieldValueDeserilizer;
            __CLR4_1_10enoenolusqjhf9.R.inc(19043);value = javaBeanDeser.deserialze(parser, fieldType, fieldInfo.name, fieldInfo.parserFeatures);
        } }else {{
            __CLR4_1_10enoenolusqjhf9.R.inc(19044);if ((((this.fieldInfo.format != null && fieldValueDeserilizer instanceof ContextObjectDeserializer)&&(__CLR4_1_10enoenolusqjhf9.R.iget(19045)!=0|true))||(__CLR4_1_10enoenolusqjhf9.R.iget(19046)==0&false))) {{
                __CLR4_1_10enoenolusqjhf9.R.inc(19047);value = ((ContextObjectDeserializer) fieldValueDeserilizer) //
                                        .deserialze(parser,
                                                    fieldType,
                                                    fieldInfo.name,
                                                    fieldInfo.format,
                                                    fieldInfo.parserFeatures);
            } }else {{
                __CLR4_1_10enoenolusqjhf9.R.inc(19048);value = fieldValueDeserilizer.deserialze(parser, fieldType, fieldInfo.name);
            }
        }}

        }__CLR4_1_10enoenolusqjhf9.R.inc(19049);if ((((value instanceof byte[]
                && ("gzip".equals(fieldInfo.format) || "gzip,base64".equals(fieldInfo.format)))&&(__CLR4_1_10enoenolusqjhf9.R.iget(19050)!=0|true))||(__CLR4_1_10enoenolusqjhf9.R.iget(19051)==0&false))) {{
            __CLR4_1_10enoenolusqjhf9.R.inc(19052);byte[] bytes = (byte[]) value;
            __CLR4_1_10enoenolusqjhf9.R.inc(19053);GZIPInputStream gzipIn = null;
            __CLR4_1_10enoenolusqjhf9.R.inc(19054);try {
                __CLR4_1_10enoenolusqjhf9.R.inc(19055);gzipIn = new GZIPInputStream(new ByteArrayInputStream(bytes));

                __CLR4_1_10enoenolusqjhf9.R.inc(19056);ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
                __CLR4_1_10enoenolusqjhf9.R.inc(19057);for (;;) {{
                    __CLR4_1_10enoenolusqjhf9.R.inc(19058);byte[] buf = new byte[1024];
                    __CLR4_1_10enoenolusqjhf9.R.inc(19059);int len = gzipIn.read(buf);
                    __CLR4_1_10enoenolusqjhf9.R.inc(19060);if ((((len == -1)&&(__CLR4_1_10enoenolusqjhf9.R.iget(19061)!=0|true))||(__CLR4_1_10enoenolusqjhf9.R.iget(19062)==0&false))) {{
                        __CLR4_1_10enoenolusqjhf9.R.inc(19063);break;
                    }
                    }__CLR4_1_10enoenolusqjhf9.R.inc(19064);if ((((len > 0)&&(__CLR4_1_10enoenolusqjhf9.R.iget(19065)!=0|true))||(__CLR4_1_10enoenolusqjhf9.R.iget(19066)==0&false))) {{
                        __CLR4_1_10enoenolusqjhf9.R.inc(19067);byteOut.write(buf, 0, len);
                    }
                }}
                }__CLR4_1_10enoenolusqjhf9.R.inc(19068);value = byteOut.toByteArray();

            } catch (IOException ex) {
                __CLR4_1_10enoenolusqjhf9.R.inc(19069);throw new JSONException("unzip bytes error.", ex);
            }
        }

        }__CLR4_1_10enoenolusqjhf9.R.inc(19070);if ((((parser.getResolveStatus() == DefaultJSONParser.NeedToResolve)&&(__CLR4_1_10enoenolusqjhf9.R.iget(19071)!=0|true))||(__CLR4_1_10enoenolusqjhf9.R.iget(19072)==0&false))) {{
            __CLR4_1_10enoenolusqjhf9.R.inc(19073);ResolveTask task = parser.getLastResolveTask();
            __CLR4_1_10enoenolusqjhf9.R.inc(19074);task.fieldDeserializer = this;
            __CLR4_1_10enoenolusqjhf9.R.inc(19075);task.ownerContext = parser.getContext();
            __CLR4_1_10enoenolusqjhf9.R.inc(19076);parser.setResolveStatus(DefaultJSONParser.NONE);
        } }else {{
            __CLR4_1_10enoenolusqjhf9.R.inc(19077);if ((((object == null)&&(__CLR4_1_10enoenolusqjhf9.R.iget(19078)!=0|true))||(__CLR4_1_10enoenolusqjhf9.R.iget(19079)==0&false))) {{
                __CLR4_1_10enoenolusqjhf9.R.inc(19080);fieldValues.put(fieldInfo.name, value);
            } }else {{
                __CLR4_1_10enoenolusqjhf9.R.inc(19081);setValue(object, value);
            }
        }}
    }}finally{__CLR4_1_10enoenolusqjhf9.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_1_10enoenolusqjhf9.R.inc(19082);
        __CLR4_1_10enoenolusqjhf9.R.inc(19083);if ((((fieldValueDeserilizer != null)&&(__CLR4_1_10enoenolusqjhf9.R.iget(19084)!=0|true))||(__CLR4_1_10enoenolusqjhf9.R.iget(19085)==0&false))) {{
            __CLR4_1_10enoenolusqjhf9.R.inc(19086);return fieldValueDeserilizer.getFastMatchToken();
        }

        }__CLR4_1_10enoenolusqjhf9.R.inc(19087);return JSONToken.LITERAL_INT;
    }finally{__CLR4_1_10enoenolusqjhf9.R.flushNeeded();}}

    public void parseFieldUnwrapped(DefaultJSONParser parser, Object object, Type objectType, Map<String, Object> fieldValues) {try{__CLR4_1_10enoenolusqjhf9.R.inc(19088);
        __CLR4_1_10enoenolusqjhf9.R.inc(19089);throw new JSONException("TODO");
    }finally{__CLR4_1_10enoenolusqjhf9.R.flushNeeded();}}
}
