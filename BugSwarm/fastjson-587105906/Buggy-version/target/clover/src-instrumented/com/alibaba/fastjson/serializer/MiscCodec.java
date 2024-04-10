/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//*
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

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

import com.alibaba.fastjson.*;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.TypeUtils;
import org.w3c.dom.Node;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class MiscCodec implements ObjectSerializer, ObjectDeserializer {public static class __CLR4_1_10lhflhfluszvzpb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,28175,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static      boolean   FILE_RELATIVE_PATH_SUPPORT = false;
    public final static MiscCodec instance                   = new MiscCodec();
    private static      Method    method_paths_get;
    private static      boolean   method_paths_get_error     = false;

    static {try{__CLR4_1_10lhflhfluszvzpb.R.inc(27843);
        __CLR4_1_10lhflhfluszvzpb.R.inc(27844);FILE_RELATIVE_PATH_SUPPORT = "true".equals(IOUtils.getStringProperty("fastjson.deserializer.fileRelativePathSupport"));
    }finally{__CLR4_1_10lhflhfluszvzpb.R.flushNeeded();}}

    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType,
                      int features) throws IOException {try{__CLR4_1_10lhflhfluszvzpb.R.inc(27845);
        __CLR4_1_10lhflhfluszvzpb.R.inc(27846);SerializeWriter out = serializer.out;

        __CLR4_1_10lhflhfluszvzpb.R.inc(27847);if ((((object == null)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27848)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27849)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(27850);out.writeNull();
            __CLR4_1_10lhflhfluszvzpb.R.inc(27851);return;
        }

        }__CLR4_1_10lhflhfluszvzpb.R.inc(27852);Class<?> objClass = object.getClass();

        __CLR4_1_10lhflhfluszvzpb.R.inc(27853);String strVal;
        __CLR4_1_10lhflhfluszvzpb.R.inc(27854);if ((((objClass == SimpleDateFormat.class)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27855)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27856)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(27857);String pattern = ((SimpleDateFormat) object).toPattern();

            __CLR4_1_10lhflhfluszvzpb.R.inc(27858);if ((((out.isEnabled(SerializerFeature.WriteClassName))&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27859)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27860)==0&false))) {{
                __CLR4_1_10lhflhfluszvzpb.R.inc(27861);if ((((object.getClass() != fieldType)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27862)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27863)==0&false))) {{
                    __CLR4_1_10lhflhfluszvzpb.R.inc(27864);out.write('{');
                    __CLR4_1_10lhflhfluszvzpb.R.inc(27865);out.writeFieldName(JSON.DEFAULT_TYPE_KEY);
                    __CLR4_1_10lhflhfluszvzpb.R.inc(27866);serializer.write(object.getClass().getName());
                    __CLR4_1_10lhflhfluszvzpb.R.inc(27867);out.writeFieldValue(',', "val", pattern);
                    __CLR4_1_10lhflhfluszvzpb.R.inc(27868);out.write('}');
                    __CLR4_1_10lhflhfluszvzpb.R.inc(27869);return;
                }
            }}

            }__CLR4_1_10lhflhfluszvzpb.R.inc(27870);strVal = pattern;
        } }else {__CLR4_1_10lhflhfluszvzpb.R.inc(27871);if ((((objClass == Class.class)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27872)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27873)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(27874);Class<?> clazz = (Class<?>) object;
            __CLR4_1_10lhflhfluszvzpb.R.inc(27875);strVal = clazz.getName();
        } }else {__CLR4_1_10lhflhfluszvzpb.R.inc(27876);if ((((objClass == InetSocketAddress.class)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27877)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27878)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(27879);InetSocketAddress address = (InetSocketAddress) object;

            __CLR4_1_10lhflhfluszvzpb.R.inc(27880);InetAddress inetAddress = address.getAddress();

            __CLR4_1_10lhflhfluszvzpb.R.inc(27881);out.write('{');
            __CLR4_1_10lhflhfluszvzpb.R.inc(27882);if ((((inetAddress != null)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27883)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27884)==0&false))) {{
                __CLR4_1_10lhflhfluszvzpb.R.inc(27885);out.writeFieldName("address");
                __CLR4_1_10lhflhfluszvzpb.R.inc(27886);serializer.write(inetAddress);
                __CLR4_1_10lhflhfluszvzpb.R.inc(27887);out.write(',');
            }
            }__CLR4_1_10lhflhfluszvzpb.R.inc(27888);out.writeFieldName("port");
            __CLR4_1_10lhflhfluszvzpb.R.inc(27889);out.writeInt(address.getPort());
            __CLR4_1_10lhflhfluszvzpb.R.inc(27890);out.write('}');
            __CLR4_1_10lhflhfluszvzpb.R.inc(27891);return;
        } }else {__CLR4_1_10lhflhfluszvzpb.R.inc(27892);if ((((object instanceof File)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27893)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27894)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(27895);strVal = ((File) object).getPath();
        } }else {__CLR4_1_10lhflhfluszvzpb.R.inc(27896);if ((((object instanceof InetAddress)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27897)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27898)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(27899);strVal = ((InetAddress) object).getHostAddress();
        } }else {__CLR4_1_10lhflhfluszvzpb.R.inc(27900);if ((((object instanceof TimeZone)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27901)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27902)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(27903);TimeZone timeZone = (TimeZone) object;
            __CLR4_1_10lhflhfluszvzpb.R.inc(27904);strVal = timeZone.getID();
        } }else {__CLR4_1_10lhflhfluszvzpb.R.inc(27905);if ((((object instanceof Currency)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27906)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27907)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(27908);Currency currency = (Currency) object;
            __CLR4_1_10lhflhfluszvzpb.R.inc(27909);strVal = currency.getCurrencyCode();
        } }else {__CLR4_1_10lhflhfluszvzpb.R.inc(27910);if ((((object instanceof JSONStreamAware)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27911)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27912)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(27913);JSONStreamAware aware = (JSONStreamAware) object;
            __CLR4_1_10lhflhfluszvzpb.R.inc(27914);aware.writeJSONString(out);
            __CLR4_1_10lhflhfluszvzpb.R.inc(27915);return;
        } }else {__CLR4_1_10lhflhfluszvzpb.R.inc(27916);if ((((object instanceof Iterator)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27917)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27918)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(27919);Iterator<?> it = ((Iterator<?>) object);
            __CLR4_1_10lhflhfluszvzpb.R.inc(27920);writeIterator(serializer, out, it);
            __CLR4_1_10lhflhfluszvzpb.R.inc(27921);return;
        } }else {__CLR4_1_10lhflhfluszvzpb.R.inc(27922);if ((((object instanceof Iterable)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27923)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27924)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(27925);Iterator<?> it = ((Iterable<?>) object).iterator();
            __CLR4_1_10lhflhfluszvzpb.R.inc(27926);writeIterator(serializer, out, it);
            __CLR4_1_10lhflhfluszvzpb.R.inc(27927);return;
        } }else {__CLR4_1_10lhflhfluszvzpb.R.inc(27928);if ((((object instanceof Map.Entry)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27929)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27930)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(27931);Map.Entry entry = (Map.Entry) object;
            __CLR4_1_10lhflhfluszvzpb.R.inc(27932);Object objKey = entry.getKey();
            __CLR4_1_10lhflhfluszvzpb.R.inc(27933);Object objVal = entry.getValue();

            __CLR4_1_10lhflhfluszvzpb.R.inc(27934);if ((((objKey instanceof String)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27935)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27936)==0&false))) {{
                __CLR4_1_10lhflhfluszvzpb.R.inc(27937);String key = (String) objKey;

                __CLR4_1_10lhflhfluszvzpb.R.inc(27938);if ((((objVal instanceof String)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27939)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27940)==0&false))) {{
                    __CLR4_1_10lhflhfluszvzpb.R.inc(27941);String value = (String) objVal;
                    __CLR4_1_10lhflhfluszvzpb.R.inc(27942);out.writeFieldValueStringWithDoubleQuoteCheck('{', key, value);
                } }else {{
                    __CLR4_1_10lhflhfluszvzpb.R.inc(27943);out.write('{');
                    __CLR4_1_10lhflhfluszvzpb.R.inc(27944);out.writeFieldName(key);
                    __CLR4_1_10lhflhfluszvzpb.R.inc(27945);serializer.write(objVal);
                }
            }} }else {{
                __CLR4_1_10lhflhfluszvzpb.R.inc(27946);out.write('{');
                __CLR4_1_10lhflhfluszvzpb.R.inc(27947);serializer.write(objKey);
                __CLR4_1_10lhflhfluszvzpb.R.inc(27948);out.write(':');
                __CLR4_1_10lhflhfluszvzpb.R.inc(27949);serializer.write(objVal);
            }
            }__CLR4_1_10lhflhfluszvzpb.R.inc(27950);out.write('}');
            __CLR4_1_10lhflhfluszvzpb.R.inc(27951);return;
        } }else {__CLR4_1_10lhflhfluszvzpb.R.inc(27952);if ((((object.getClass().getName().equals("net.sf.json.JSONNull"))&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27953)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27954)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(27955);out.writeNull();
            __CLR4_1_10lhflhfluszvzpb.R.inc(27956);return;
        } }else {__CLR4_1_10lhflhfluszvzpb.R.inc(27957);if ((((object instanceof org.w3c.dom.Node)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27958)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27959)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(27960);strVal = toString((Node) object);
        } }else {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(27961);throw new JSONException("not support class : " + objClass);
        }

        }}}}}}}}}}}}}__CLR4_1_10lhflhfluszvzpb.R.inc(27962);out.writeString(strVal);
    }finally{__CLR4_1_10lhflhfluszvzpb.R.flushNeeded();}}

    private static String toString(org.w3c.dom.Node node) {try{__CLR4_1_10lhflhfluszvzpb.R.inc(27963);
        __CLR4_1_10lhflhfluszvzpb.R.inc(27964);try {
            __CLR4_1_10lhflhfluszvzpb.R.inc(27965);TransformerFactory transFactory = TransformerFactory.newInstance();
            __CLR4_1_10lhflhfluszvzpb.R.inc(27966);Transformer transformer = transFactory.newTransformer();
            __CLR4_1_10lhflhfluszvzpb.R.inc(27967);DOMSource domSource = new DOMSource(node);

            __CLR4_1_10lhflhfluszvzpb.R.inc(27968);StringWriter out = new StringWriter();
            __CLR4_1_10lhflhfluszvzpb.R.inc(27969);transformer.transform(domSource, new StreamResult(out));
            __CLR4_1_10lhflhfluszvzpb.R.inc(27970);return out.toString();
        } catch (TransformerException e) {
            __CLR4_1_10lhflhfluszvzpb.R.inc(27971);throw new JSONException("xml node to string error", e);
        }
    }finally{__CLR4_1_10lhflhfluszvzpb.R.flushNeeded();}}

    protected void writeIterator(JSONSerializer serializer, SerializeWriter out, Iterator<?> it) {try{__CLR4_1_10lhflhfluszvzpb.R.inc(27972);
        __CLR4_1_10lhflhfluszvzpb.R.inc(27973);int i = 0;
        __CLR4_1_10lhflhfluszvzpb.R.inc(27974);out.write('[');
        __CLR4_1_10lhflhfluszvzpb.R.inc(27975);while ((((it.hasNext())&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27976)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27977)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(27978);if ((((i != 0)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27979)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27980)==0&false))) {{
                __CLR4_1_10lhflhfluszvzpb.R.inc(27981);out.write(',');
            }
            }__CLR4_1_10lhflhfluszvzpb.R.inc(27982);Object item = it.next();
            __CLR4_1_10lhflhfluszvzpb.R.inc(27983);serializer.write(item);
            __CLR4_1_10lhflhfluszvzpb.R.inc(27984);++i;
        }
        }__CLR4_1_10lhflhfluszvzpb.R.inc(27985);out.write(']');
        __CLR4_1_10lhflhfluszvzpb.R.inc(27986);return;
    }finally{__CLR4_1_10lhflhfluszvzpb.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public <T> T deserialze(DefaultJSONParser parser, Type clazz, Object fieldName) {try{__CLR4_1_10lhflhfluszvzpb.R.inc(27987);
        __CLR4_1_10lhflhfluszvzpb.R.inc(27988);JSONLexer lexer = parser.lexer;

        __CLR4_1_10lhflhfluszvzpb.R.inc(27989);if ((((clazz == InetSocketAddress.class)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27990)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27991)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(27992);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(27993)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(27994)==0&false))) {{
                __CLR4_1_10lhflhfluszvzpb.R.inc(27995);lexer.nextToken();
                __CLR4_1_10lhflhfluszvzpb.R.inc(27996);return null;
            }

            }__CLR4_1_10lhflhfluszvzpb.R.inc(27997);parser.accept(JSONToken.LBRACE);

            __CLR4_1_10lhflhfluszvzpb.R.inc(27998);InetAddress address = null;
            __CLR4_1_10lhflhfluszvzpb.R.inc(27999);int port = 0;
            __CLR4_1_10lhflhfluszvzpb.R.inc(28000);for (;;) {{
                __CLR4_1_10lhflhfluszvzpb.R.inc(28001);String key = lexer.stringVal();
                __CLR4_1_10lhflhfluszvzpb.R.inc(28002);lexer.nextToken(JSONToken.COLON);

                __CLR4_1_10lhflhfluszvzpb.R.inc(28003);if ((((key.equals("address"))&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28004)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28005)==0&false))) {{
                    __CLR4_1_10lhflhfluszvzpb.R.inc(28006);parser.accept(JSONToken.COLON);
                    __CLR4_1_10lhflhfluszvzpb.R.inc(28007);address = parser.parseObject(InetAddress.class);
                } }else {__CLR4_1_10lhflhfluszvzpb.R.inc(28008);if ((((key.equals("port"))&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28009)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28010)==0&false))) {{
                    __CLR4_1_10lhflhfluszvzpb.R.inc(28011);parser.accept(JSONToken.COLON);
                    __CLR4_1_10lhflhfluszvzpb.R.inc(28012);if ((((lexer.token() != JSONToken.LITERAL_INT)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28013)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28014)==0&false))) {{
                        __CLR4_1_10lhflhfluszvzpb.R.inc(28015);throw new JSONException("port is not int");
                    }
                    }__CLR4_1_10lhflhfluszvzpb.R.inc(28016);port = lexer.intValue();
                    __CLR4_1_10lhflhfluszvzpb.R.inc(28017);lexer.nextToken();
                } }else {{
                    __CLR4_1_10lhflhfluszvzpb.R.inc(28018);parser.accept(JSONToken.COLON);
                    __CLR4_1_10lhflhfluszvzpb.R.inc(28019);parser.parse();
                }

                }}__CLR4_1_10lhflhfluszvzpb.R.inc(28020);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28021)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28022)==0&false))) {{
                    __CLR4_1_10lhflhfluszvzpb.R.inc(28023);lexer.nextToken();
                    __CLR4_1_10lhflhfluszvzpb.R.inc(28024);continue;
                }

                }__CLR4_1_10lhflhfluszvzpb.R.inc(28025);break;
            }

            }__CLR4_1_10lhflhfluszvzpb.R.inc(28026);parser.accept(JSONToken.RBRACE);

            __CLR4_1_10lhflhfluszvzpb.R.inc(28027);return (T) new InetSocketAddress(address, port);
        }

        }__CLR4_1_10lhflhfluszvzpb.R.inc(28028);Object objVal;

        __CLR4_1_10lhflhfluszvzpb.R.inc(28029);if ((((parser.resolveStatus == DefaultJSONParser.TypeNameRedirect)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28030)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28031)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(28032);parser.resolveStatus = DefaultJSONParser.NONE;
            __CLR4_1_10lhflhfluszvzpb.R.inc(28033);parser.accept(JSONToken.COMMA);

            __CLR4_1_10lhflhfluszvzpb.R.inc(28034);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28035)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28036)==0&false))) {{
                __CLR4_1_10lhflhfluszvzpb.R.inc(28037);if ((((!"val".equals(lexer.stringVal()))&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28038)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28039)==0&false))) {{
                    __CLR4_1_10lhflhfluszvzpb.R.inc(28040);throw new JSONException("syntax error");
                }
                }__CLR4_1_10lhflhfluszvzpb.R.inc(28041);lexer.nextToken();
            } }else {{
                __CLR4_1_10lhflhfluszvzpb.R.inc(28042);throw new JSONException("syntax error");
            }

            }__CLR4_1_10lhflhfluszvzpb.R.inc(28043);parser.accept(JSONToken.COLON);

            __CLR4_1_10lhflhfluszvzpb.R.inc(28044);objVal = parser.parse();

            __CLR4_1_10lhflhfluszvzpb.R.inc(28045);parser.accept(JSONToken.RBRACE);
        } }else {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(28046);objVal = parser.parse();
        }

        }__CLR4_1_10lhflhfluszvzpb.R.inc(28047);String strVal;

        __CLR4_1_10lhflhfluszvzpb.R.inc(28048);if ((((objVal == null)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28049)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28050)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(28051);strVal = null;
        } }else {__CLR4_1_10lhflhfluszvzpb.R.inc(28052);if ((((objVal instanceof String)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28053)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28054)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(28055);strVal = (String) objVal;
        } }else {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(28056);if ((((objVal instanceof JSONObject)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28057)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28058)==0&false))) {{
                __CLR4_1_10lhflhfluszvzpb.R.inc(28059);JSONObject jsonObject = (JSONObject) objVal;

                __CLR4_1_10lhflhfluszvzpb.R.inc(28060);if ((((clazz == Currency.class)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28061)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28062)==0&false))) {{
                    __CLR4_1_10lhflhfluszvzpb.R.inc(28063);String currency = jsonObject.getString("currency");
                    __CLR4_1_10lhflhfluszvzpb.R.inc(28064);if ((((currency != null)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28065)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28066)==0&false))) {{
                        __CLR4_1_10lhflhfluszvzpb.R.inc(28067);return (T) Currency.getInstance(currency);
                    }

                    }__CLR4_1_10lhflhfluszvzpb.R.inc(28068);String symbol = jsonObject.getString("currencyCode");
                    __CLR4_1_10lhflhfluszvzpb.R.inc(28069);if ((((symbol != null)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28070)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28071)==0&false))) {{
                        __CLR4_1_10lhflhfluszvzpb.R.inc(28072);return (T) Currency.getInstance(symbol);
                    }
                }}

                }__CLR4_1_10lhflhfluszvzpb.R.inc(28073);if ((((clazz == Map.Entry.class)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28074)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28075)==0&false))) {{
                   __CLR4_1_10lhflhfluszvzpb.R.inc(28076);return (T) jsonObject.entrySet().iterator().next();
                }

                }__CLR4_1_10lhflhfluszvzpb.R.inc(28077);return jsonObject.toJavaObject(clazz);
            }
            }__CLR4_1_10lhflhfluszvzpb.R.inc(28078);throw new JSONException("expect string");
        }

        }}__CLR4_1_10lhflhfluszvzpb.R.inc(28079);if ((((strVal == null || strVal.length() == 0)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28080)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28081)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(28082);return null;
        }

        }__CLR4_1_10lhflhfluszvzpb.R.inc(28083);if ((((clazz == UUID.class)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28084)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28085)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(28086);return (T) UUID.fromString(strVal);
        }

        }__CLR4_1_10lhflhfluszvzpb.R.inc(28087);if ((((clazz == URI.class)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28088)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28089)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(28090);return (T) URI.create(strVal);
        }

        }__CLR4_1_10lhflhfluszvzpb.R.inc(28091);if ((((clazz == URL.class)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28092)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28093)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(28094);try {
                __CLR4_1_10lhflhfluszvzpb.R.inc(28095);return (T) new URL(strVal);
            } catch (MalformedURLException e) {
                __CLR4_1_10lhflhfluszvzpb.R.inc(28096);throw new JSONException("create url error", e);
            }
        }

        }__CLR4_1_10lhflhfluszvzpb.R.inc(28097);if ((((clazz == Pattern.class)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28098)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28099)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(28100);return (T) Pattern.compile(strVal);
        }

        }__CLR4_1_10lhflhfluszvzpb.R.inc(28101);if ((((clazz == Locale.class)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28102)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28103)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(28104);return (T) TypeUtils.toLocale(strVal);
        }

        }__CLR4_1_10lhflhfluszvzpb.R.inc(28105);if ((((clazz == SimpleDateFormat.class)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28106)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28107)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(28108);SimpleDateFormat dateFormat = new SimpleDateFormat(strVal, lexer.getLocale());
            __CLR4_1_10lhflhfluszvzpb.R.inc(28109);dateFormat.setTimeZone(lexer.getTimeZone());
            __CLR4_1_10lhflhfluszvzpb.R.inc(28110);return (T) dateFormat;
        }

        }__CLR4_1_10lhflhfluszvzpb.R.inc(28111);if ((((clazz == InetAddress.class || clazz == Inet4Address.class || clazz == Inet6Address.class)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28112)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28113)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(28114);try {
                __CLR4_1_10lhflhfluszvzpb.R.inc(28115);return (T) InetAddress.getByName(strVal);
            } catch (UnknownHostException e) {
                __CLR4_1_10lhflhfluszvzpb.R.inc(28116);throw new JSONException("deserialize inet adress error", e);
            }
        }

        }__CLR4_1_10lhflhfluszvzpb.R.inc(28117);if ((((clazz == File.class)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28118)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28119)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(28120);if ((((strVal.indexOf("..") >= 0 && !FILE_RELATIVE_PATH_SUPPORT)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28121)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28122)==0&false))) {{
                __CLR4_1_10lhflhfluszvzpb.R.inc(28123);throw new JSONException("file relative path not support.");
            }

            }__CLR4_1_10lhflhfluszvzpb.R.inc(28124);return (T) new File(strVal);
        }

        }__CLR4_1_10lhflhfluszvzpb.R.inc(28125);if ((((clazz == TimeZone.class)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28126)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28127)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(28128);return (T) TimeZone.getTimeZone(strVal);
        }

        }__CLR4_1_10lhflhfluszvzpb.R.inc(28129);if ((((clazz instanceof ParameterizedType)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28130)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28131)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(28132);ParameterizedType parmeterizedType = (ParameterizedType) clazz;
            __CLR4_1_10lhflhfluszvzpb.R.inc(28133);clazz = parmeterizedType.getRawType();
        }

        }__CLR4_1_10lhflhfluszvzpb.R.inc(28134);if ((((clazz == Class.class)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28135)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28136)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(28137);return (T) TypeUtils.loadClass(strVal, parser.getConfig().getDefaultClassLoader(), false);
        }

        }__CLR4_1_10lhflhfluszvzpb.R.inc(28138);if ((((clazz == Charset.class)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28139)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28140)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(28141);return (T) Charset.forName(strVal);
        }

        }__CLR4_1_10lhflhfluszvzpb.R.inc(28142);if ((((clazz == Currency.class)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28143)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28144)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(28145);return (T) Currency.getInstance(strVal);
        }

        }__CLR4_1_10lhflhfluszvzpb.R.inc(28146);if ((((clazz == JSONPath.class)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28147)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28148)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(28149);return (T) new JSONPath(strVal);
        }



        }__CLR4_1_10lhflhfluszvzpb.R.inc(28150);if ((((clazz instanceof Class)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28151)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28152)==0&false))) {{
            __CLR4_1_10lhflhfluszvzpb.R.inc(28153);String className = ((Class) clazz).getName();

            __CLR4_1_10lhflhfluszvzpb.R.inc(28154);if ((((className.equals("java.nio.file.Path"))&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28155)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28156)==0&false))) {{
                __CLR4_1_10lhflhfluszvzpb.R.inc(28157);try {
                    __CLR4_1_10lhflhfluszvzpb.R.inc(28158);if ((((method_paths_get == null && !method_paths_get_error)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28159)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28160)==0&false))) {{
                        __CLR4_1_10lhflhfluszvzpb.R.inc(28161);Class<?> paths = TypeUtils.loadClass("java.nio.file.Paths");
                        __CLR4_1_10lhflhfluszvzpb.R.inc(28162);method_paths_get = paths.getMethod("get", String.class, String[].class);
                    }
                    }__CLR4_1_10lhflhfluszvzpb.R.inc(28163);if ((((method_paths_get != null)&&(__CLR4_1_10lhflhfluszvzpb.R.iget(28164)!=0|true))||(__CLR4_1_10lhflhfluszvzpb.R.iget(28165)==0&false))) {{
                        __CLR4_1_10lhflhfluszvzpb.R.inc(28166);return (T) method_paths_get.invoke(null, strVal, new String[0]);
                    }

                    }__CLR4_1_10lhflhfluszvzpb.R.inc(28167);throw new JSONException("Path deserialize erorr");
                } catch (NoSuchMethodException ex) {
                    __CLR4_1_10lhflhfluszvzpb.R.inc(28168);method_paths_get_error = true;
                } catch (IllegalAccessException ex) {
                    __CLR4_1_10lhflhfluszvzpb.R.inc(28169);throw new JSONException("Path deserialize erorr", ex);
                } catch (InvocationTargetException ex) {
                    __CLR4_1_10lhflhfluszvzpb.R.inc(28170);throw new JSONException("Path deserialize erorr", ex);
                }
            }

            }__CLR4_1_10lhflhfluszvzpb.R.inc(28171);throw new JSONException("MiscCodec not support " + className);
        }

        }__CLR4_1_10lhflhfluszvzpb.R.inc(28172);throw new JSONException("MiscCodec not support " + clazz.toString());
    }finally{__CLR4_1_10lhflhfluszvzpb.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_1_10lhflhfluszvzpb.R.inc(28173);
        __CLR4_1_10lhflhfluszvzpb.R.inc(28174);return JSONToken.LITERAL_STRING;
    }finally{__CLR4_1_10lhflhfluszvzpb.R.flushNeeded();}}
}
