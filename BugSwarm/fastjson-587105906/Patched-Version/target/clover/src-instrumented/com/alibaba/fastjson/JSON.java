/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 1999-2017 Alibaba Group.
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
package com.alibaba.fastjson;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import com.alibaba.fastjson.parser.*;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider;
import com.alibaba.fastjson.parser.deserializer.FieldTypeResolver;
import com.alibaba.fastjson.parser.deserializer.ParseProcess;
import com.alibaba.fastjson.serializer.*;
import com.alibaba.fastjson.util.IOUtils;
import com.alibaba.fastjson.util.IdentityHashMap;
import com.alibaba.fastjson.util.TypeUtils;

/**
 * This is the main class for using Fastjson. You usually call these two methods {@link #toJSONString(Object)} and {@link #parseObject(String, Class)}.
 * 
 * <p>Here is an example of how fastjson is used for a simple Class:
 *
 * <pre>
 * Model model = new Model();
 * String json = JSON.toJSONString(model); // serializes model to Json
 * Model model2 = JSON.parseObject(json, Model.class); // deserializes json into model2
 * </pre>
 * 
* <p>If the object that your are serializing/deserializing is a {@code ParameterizedType}
 * (i.e. contains at least one type parameter and may be an array) then you must use the
 * {@link #toJSONString(Object)} or {@link #parseObject(String, Type, Feature[])} method.  Here is an
 * example for serializing and deserialing a {@code ParameterizedType}:
 * 
 * <pre>
 * String json = "[{},...]";
 * Type listType = new TypeReference&lt;List&lt;Model&gt;&gt;() {}.getType();
 * List&lt;Model&gt; modelList = JSON.parseObject(json, listType);
 * </pre>
 * 
 * @see com.alibaba.fastjson.TypeReference
 * 
 * @author wenshao[szujobs@hotmail.com]
 */
@java.lang.SuppressWarnings({"fallthrough"}) public abstract class JSON implements JSONStreamAware, JSONAware {public static class __CLR4_5_200lusvmdeo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,665,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static TimeZone         defaultTimeZone      = TimeZone.getDefault();
    public static Locale           defaultLocale        = Locale.getDefault();
    public static String           DEFAULT_TYPE_KEY     = "@type";
    static final SerializeFilter[] emptyFilters         = new SerializeFilter[0];
    public static String           DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static int              DEFAULT_PARSER_FEATURE;
    public static int              DEFAULT_GENERATE_FEATURE;

    private static final ConcurrentHashMap<Type, Type> mixInsMapper = new ConcurrentHashMap<Type, Type>(16);
    
    static {try{__CLR4_5_200lusvmdeo.R.inc(0);
        __CLR4_5_200lusvmdeo.R.inc(1);int features = 0;
        __CLR4_5_200lusvmdeo.R.inc(2);features |= Feature.AutoCloseSource.getMask();
        __CLR4_5_200lusvmdeo.R.inc(3);features |= Feature.InternFieldNames.getMask();
        __CLR4_5_200lusvmdeo.R.inc(4);features |= Feature.UseBigDecimal.getMask();
        __CLR4_5_200lusvmdeo.R.inc(5);features |= Feature.AllowUnQuotedFieldNames.getMask();
        __CLR4_5_200lusvmdeo.R.inc(6);features |= Feature.AllowSingleQuotes.getMask();
        __CLR4_5_200lusvmdeo.R.inc(7);features |= Feature.AllowArbitraryCommas.getMask();
        __CLR4_5_200lusvmdeo.R.inc(8);features |= Feature.SortFeidFastMatch.getMask();
        __CLR4_5_200lusvmdeo.R.inc(9);features |= Feature.IgnoreNotMatch.getMask();
        __CLR4_5_200lusvmdeo.R.inc(10);DEFAULT_PARSER_FEATURE = features;
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    static {try{__CLR4_5_200lusvmdeo.R.inc(11);
        __CLR4_5_200lusvmdeo.R.inc(12);int features = 0;
        __CLR4_5_200lusvmdeo.R.inc(13);features |= SerializerFeature.QuoteFieldNames.getMask();
        __CLR4_5_200lusvmdeo.R.inc(14);features |= SerializerFeature.SkipTransientField.getMask();
        __CLR4_5_200lusvmdeo.R.inc(15);features |= SerializerFeature.WriteEnumUsingName.getMask();
        __CLR4_5_200lusvmdeo.R.inc(16);features |= SerializerFeature.SortField.getMask();

        __CLR4_5_200lusvmdeo.R.inc(17);DEFAULT_GENERATE_FEATURE = features;

        __CLR4_5_200lusvmdeo.R.inc(18);config(IOUtils.DEFAULT_PROPERTIES);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    private static void config(Properties properties) {try{__CLR4_5_200lusvmdeo.R.inc(19);
        {
            __CLR4_5_200lusvmdeo.R.inc(20);String featuresProperty = properties.getProperty("fastjson.serializerFeatures.MapSortField");
            __CLR4_5_200lusvmdeo.R.inc(21);int mask = SerializerFeature.MapSortField.getMask();
            __CLR4_5_200lusvmdeo.R.inc(22);if (((("true".equals(featuresProperty))&&(__CLR4_5_200lusvmdeo.R.iget(23)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(24)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(25);DEFAULT_GENERATE_FEATURE |= mask;
            } }else {__CLR4_5_200lusvmdeo.R.inc(26);if (((("false".equals(featuresProperty))&&(__CLR4_5_200lusvmdeo.R.iget(27)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(28)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(29);DEFAULT_GENERATE_FEATURE &= ~mask;
            }
        }}}

        {
            __CLR4_5_200lusvmdeo.R.inc(30);if (((("true".equals(properties.getProperty("parser.features.NonStringKeyAsString")))&&(__CLR4_5_200lusvmdeo.R.iget(31)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(32)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(33);DEFAULT_PARSER_FEATURE |= Feature.NonStringKeyAsString.getMask();
            }
        }}

        {
            __CLR4_5_200lusvmdeo.R.inc(34);if (((("true".equals(properties.getProperty("parser.features.ErrorOnEnumNotMatch"))
                    || "true".equals(properties.getProperty("fastjson.parser.features.ErrorOnEnumNotMatch")))&&(__CLR4_5_200lusvmdeo.R.iget(35)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(36)==0&false)))
            {{
                __CLR4_5_200lusvmdeo.R.inc(37);DEFAULT_PARSER_FEATURE |= Feature.ErrorOnEnumNotMatch.getMask();
            }
        }}

        {
            __CLR4_5_200lusvmdeo.R.inc(38);if (((("false".equals(properties.getProperty("fastjson.asmEnable")))&&(__CLR4_5_200lusvmdeo.R.iget(39)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(40)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(41);ParserConfig.getGlobalInstance().setAsmEnable(false);
                __CLR4_5_200lusvmdeo.R.inc(42);SerializeConfig.getGlobalInstance().setAsmEnable(false);
            }
        }}
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     * config default type key
     * @since 1.2.14
     */
    public static void setDefaultTypeKey(String typeKey) {try{__CLR4_5_200lusvmdeo.R.inc(43);
        __CLR4_5_200lusvmdeo.R.inc(44);DEFAULT_TYPE_KEY = typeKey;
        __CLR4_5_200lusvmdeo.R.inc(45);ParserConfig.global.symbolTable.addSymbol(typeKey, 
                                                  0, 
                                                  typeKey.length(), 
                                                  typeKey.hashCode(), true);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}
    
    public static Object parse(String text) {try{__CLR4_5_200lusvmdeo.R.inc(46);
        __CLR4_5_200lusvmdeo.R.inc(47);return parse(text, DEFAULT_PARSER_FEATURE);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     *
     * @since 1.2.38
     */
    public static Object parse(String text, ParserConfig config) {try{__CLR4_5_200lusvmdeo.R.inc(48);
        __CLR4_5_200lusvmdeo.R.inc(49);return parse(text, config, DEFAULT_PARSER_FEATURE);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     *
     * @since 1.2.38
     */
    public static Object parse(String text, ParserConfig config, int features) {try{__CLR4_5_200lusvmdeo.R.inc(50);
        __CLR4_5_200lusvmdeo.R.inc(51);if ((((text == null)&&(__CLR4_5_200lusvmdeo.R.iget(52)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(53)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(54);return null;
        }

        }__CLR4_5_200lusvmdeo.R.inc(55);DefaultJSONParser parser = new DefaultJSONParser(text, config, features);
        __CLR4_5_200lusvmdeo.R.inc(56);Object value = parser.parse();

        __CLR4_5_200lusvmdeo.R.inc(57);parser.handleResovleTask(value);

        __CLR4_5_200lusvmdeo.R.inc(58);parser.close();

        __CLR4_5_200lusvmdeo.R.inc(59);return value;
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static Object parse(String text, int features) {try{__CLR4_5_200lusvmdeo.R.inc(60);
        __CLR4_5_200lusvmdeo.R.inc(61);return parse(text, ParserConfig.getGlobalInstance(), features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static Object parse(byte[] input, Feature... features) {try{__CLR4_5_200lusvmdeo.R.inc(62);
        __CLR4_5_200lusvmdeo.R.inc(63);char[] chars = allocateChars(input.length);
        __CLR4_5_200lusvmdeo.R.inc(64);int len = IOUtils.decodeUTF8(input, 0, input.length, chars);
        __CLR4_5_200lusvmdeo.R.inc(65);if ((((len < 0)&&(__CLR4_5_200lusvmdeo.R.iget(66)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(67)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(68);return null;
        }
        }__CLR4_5_200lusvmdeo.R.inc(69);return parse(new String(chars, 0, len), features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static Object parse(byte[] input, int off, int len, CharsetDecoder charsetDecoder, Feature... features) {try{__CLR4_5_200lusvmdeo.R.inc(70);
        __CLR4_5_200lusvmdeo.R.inc(71);if ((((input == null || input.length == 0)&&(__CLR4_5_200lusvmdeo.R.iget(72)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(73)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(74);return null;
        }

        }__CLR4_5_200lusvmdeo.R.inc(75);int featureValues = DEFAULT_PARSER_FEATURE;
        __CLR4_5_200lusvmdeo.R.inc(76);for (Feature feature : features) {{
            __CLR4_5_200lusvmdeo.R.inc(77);featureValues = Feature.config(featureValues, feature, true);
        }

        }__CLR4_5_200lusvmdeo.R.inc(78);return parse(input, off, len, charsetDecoder, featureValues);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static Object parse(byte[] input, int off, int len, CharsetDecoder charsetDecoder, int features) {try{__CLR4_5_200lusvmdeo.R.inc(79);
        __CLR4_5_200lusvmdeo.R.inc(80);charsetDecoder.reset();

        __CLR4_5_200lusvmdeo.R.inc(81);int scaleLength = (int) (len * (double) charsetDecoder.maxCharsPerByte());
        __CLR4_5_200lusvmdeo.R.inc(82);char[] chars = allocateChars(scaleLength);

        __CLR4_5_200lusvmdeo.R.inc(83);ByteBuffer byteBuf = ByteBuffer.wrap(input, off, len);
        __CLR4_5_200lusvmdeo.R.inc(84);CharBuffer charBuf = CharBuffer.wrap(chars);
        __CLR4_5_200lusvmdeo.R.inc(85);IOUtils.decode(charsetDecoder, byteBuf, charBuf);

        __CLR4_5_200lusvmdeo.R.inc(86);int position = charBuf.position();

        __CLR4_5_200lusvmdeo.R.inc(87);DefaultJSONParser parser = new DefaultJSONParser(chars, position, ParserConfig.getGlobalInstance(), features);
        __CLR4_5_200lusvmdeo.R.inc(88);Object value = parser.parse();

        __CLR4_5_200lusvmdeo.R.inc(89);parser.handleResovleTask(value);

        __CLR4_5_200lusvmdeo.R.inc(90);parser.close();

        __CLR4_5_200lusvmdeo.R.inc(91);return value;
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static Object parse(String text, Feature... features) {try{__CLR4_5_200lusvmdeo.R.inc(92);
        __CLR4_5_200lusvmdeo.R.inc(93);int featureValues = DEFAULT_PARSER_FEATURE;
        __CLR4_5_200lusvmdeo.R.inc(94);for (Feature feature : features) {{
            __CLR4_5_200lusvmdeo.R.inc(95);featureValues = Feature.config(featureValues, feature, true);
        }

        }__CLR4_5_200lusvmdeo.R.inc(96);return parse(text, featureValues);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static JSONObject parseObject(String text, Feature... features) {try{__CLR4_5_200lusvmdeo.R.inc(97);
        __CLR4_5_200lusvmdeo.R.inc(98);return (JSONObject) parse(text, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static JSONObject parseObject(String text) {try{__CLR4_5_200lusvmdeo.R.inc(99);
        __CLR4_5_200lusvmdeo.R.inc(100);Object obj = parse(text);
        __CLR4_5_200lusvmdeo.R.inc(101);if ((((obj instanceof JSONObject)&&(__CLR4_5_200lusvmdeo.R.iget(102)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(103)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(104);return (JSONObject) obj;
        }

        }__CLR4_5_200lusvmdeo.R.inc(105);try {
            __CLR4_5_200lusvmdeo.R.inc(106);return (JSONObject) JSON.toJSON(obj);
        } catch (RuntimeException e) {
            __CLR4_5_200lusvmdeo.R.inc(107);throw new JSONException("can not cast to JSONObject.", e);
        }
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     * <pre>
     * String jsonStr = "[{\"id\":1001,\"name\":\"Jobs\"}]";
     * List&lt;Model&gt; models = JSON.parseObject(jsonStr, new TypeReference&lt;List&lt;Model&gt;&gt;() {});
     * </pre>
     * @param text json string
     * @param type type refernce
     * @param features
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T parseObject(String text, TypeReference<T> type, Feature... features) {try{__CLR4_5_200lusvmdeo.R.inc(108);
        __CLR4_5_200lusvmdeo.R.inc(109);return (T) parseObject(text, type.type, ParserConfig.global, DEFAULT_PARSER_FEATURE, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     * 
     * This method deserializes the specified Json into an object of the specified class. It is not
     * suitable to use if the specified class is a generic type since it will not have the generic
     * type information because of the Type Erasure feature of Java. Therefore, this method should not
     * be used if the desired type is a generic type. Note that this method works fine if the any of
     * the fields of the specified object are generics, just the object itself should not be a
     * generic type. For the cases when the object is of generic type, invoke
     * {@link #parseObject(String, Type, Feature[])}. If you have the Json in a {@link InputStream} instead of
     * a String, use {@link #parseObject(InputStream, Type, Feature[])} instead.
     *
     * @param json the string from which the object is to be deserialized
     * @param clazz the class of T
     * @param features parser features
     * @return an object of type T from the string
     * classOfT
     */
    @SuppressWarnings("unchecked")
    public static <T> T parseObject(String json, Class<T> clazz, Feature... features) {try{__CLR4_5_200lusvmdeo.R.inc(110);
        __CLR4_5_200lusvmdeo.R.inc(111);return (T) parseObject(json, (Type) clazz, ParserConfig.global, null, DEFAULT_PARSER_FEATURE, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public static <T> T parseObject(String text, Class<T> clazz, ParseProcess processor, Feature... features) {try{__CLR4_5_200lusvmdeo.R.inc(112);
        __CLR4_5_200lusvmdeo.R.inc(113);return (T) parseObject(text, (Type) clazz, ParserConfig.global, processor, DEFAULT_PARSER_FEATURE,
                               features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     * This method deserializes the specified Json into an object of the specified type. This method
     * is useful if the specified object is a generic type. For non-generic objects, use
     * {@link #parseObject(String, Class, Feature[])} instead. If you have the Json in a {@link InputStream} instead of
     * a String, use {@link #parseObject(InputStream, Type, Feature[])} instead.
     *
     * @param <T> the type of the desired object
     * @param json the string from which the object is to be deserialized
     * @param type The specific genericized type of src. You can obtain this type by using the
     * {@link com.alibaba.fastjson.TypeReference} class. For example, to get the type for
     * {@code Collection<Foo>}, you should use:
     * <pre>
     * Type type = new TypeReference&lt;Collection&lt;Foo&gt;&gt;(){}.getType();
     * </pre>
     * @return an object of type T from the string
     */
    @SuppressWarnings("unchecked")
    public static <T> T parseObject(String json, Type type, Feature... features) {try{__CLR4_5_200lusvmdeo.R.inc(114);
        __CLR4_5_200lusvmdeo.R.inc(115);return (T) parseObject(json, type, ParserConfig.global, DEFAULT_PARSER_FEATURE, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public static <T> T parseObject(String input, Type clazz, ParseProcess processor, Feature... features) {try{__CLR4_5_200lusvmdeo.R.inc(116);
        __CLR4_5_200lusvmdeo.R.inc(117);return (T) parseObject(input, clazz, ParserConfig.global, processor, DEFAULT_PARSER_FEATURE, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public static <T> T parseObject(String input, Type clazz, int featureValues, Feature... features) {try{__CLR4_5_200lusvmdeo.R.inc(118);
        __CLR4_5_200lusvmdeo.R.inc(119);if ((((input == null)&&(__CLR4_5_200lusvmdeo.R.iget(120)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(121)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(122);return null;
        }

        }__CLR4_5_200lusvmdeo.R.inc(123);for (Feature feature : features) {{
            __CLR4_5_200lusvmdeo.R.inc(124);featureValues = Feature.config(featureValues, feature, true);
        }

        }__CLR4_5_200lusvmdeo.R.inc(125);DefaultJSONParser parser = new DefaultJSONParser(input, ParserConfig.getGlobalInstance(), featureValues);
        __CLR4_5_200lusvmdeo.R.inc(126);T value = (T) parser.parseObject(clazz);

        __CLR4_5_200lusvmdeo.R.inc(127);parser.handleResovleTask(value);

        __CLR4_5_200lusvmdeo.R.inc(128);parser.close();

        __CLR4_5_200lusvmdeo.R.inc(129);return (T) value;
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}
    
    /**
     * @since 1.2.11
     */
    public static <T> T parseObject(String input, Type clazz, ParserConfig config, Feature... features) {try{__CLR4_5_200lusvmdeo.R.inc(130);
        __CLR4_5_200lusvmdeo.R.inc(131);return parseObject(input, clazz, config, null, DEFAULT_PARSER_FEATURE, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static <T> T parseObject(String input, Type clazz, ParserConfig config, int featureValues,
                                          Feature... features) {try{__CLR4_5_200lusvmdeo.R.inc(132);
        __CLR4_5_200lusvmdeo.R.inc(133);return parseObject(input, clazz, config, null, featureValues, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public static <T> T parseObject(String input, Type clazz, ParserConfig config, ParseProcess processor,
                                          int featureValues, Feature... features) {try{__CLR4_5_200lusvmdeo.R.inc(134);
        __CLR4_5_200lusvmdeo.R.inc(135);if ((((input == null)&&(__CLR4_5_200lusvmdeo.R.iget(136)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(137)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(138);return null;
        }

        }__CLR4_5_200lusvmdeo.R.inc(139);if ((((features != null)&&(__CLR4_5_200lusvmdeo.R.iget(140)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(141)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(142);for (Feature feature : features) {{
                __CLR4_5_200lusvmdeo.R.inc(143);featureValues |= feature.mask;
            }
        }}

        }__CLR4_5_200lusvmdeo.R.inc(144);DefaultJSONParser parser = new DefaultJSONParser(input, config, featureValues);

        __CLR4_5_200lusvmdeo.R.inc(145);if ((((processor != null)&&(__CLR4_5_200lusvmdeo.R.iget(146)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(147)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(148);if ((((processor instanceof ExtraTypeProvider)&&(__CLR4_5_200lusvmdeo.R.iget(149)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(150)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(151);parser.getExtraTypeProviders().add((ExtraTypeProvider) processor);
            }

            }__CLR4_5_200lusvmdeo.R.inc(152);if ((((processor instanceof ExtraProcessor)&&(__CLR4_5_200lusvmdeo.R.iget(153)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(154)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(155);parser.getExtraProcessors().add((ExtraProcessor) processor);
            }

            }__CLR4_5_200lusvmdeo.R.inc(156);if ((((processor instanceof FieldTypeResolver)&&(__CLR4_5_200lusvmdeo.R.iget(157)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(158)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(159);parser.setFieldTypeResolver((FieldTypeResolver) processor);
            }
        }}

        }__CLR4_5_200lusvmdeo.R.inc(160);T value = (T) parser.parseObject(clazz, null);

        __CLR4_5_200lusvmdeo.R.inc(161);parser.handleResovleTask(value);

        __CLR4_5_200lusvmdeo.R.inc(162);parser.close();

        __CLR4_5_200lusvmdeo.R.inc(163);return (T) value;
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public static <T> T parseObject(byte[] bytes, Type clazz, Feature... features) {try{__CLR4_5_200lusvmdeo.R.inc(164);
        __CLR4_5_200lusvmdeo.R.inc(165);return (T) parseObject(bytes, 0, bytes.length, IOUtils.UTF8, clazz, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}
    
    /**
     * @since 1.2.11
     */
    @SuppressWarnings("unchecked")
    public static <T> T parseObject(byte[] bytes, int offset, int len, Charset charset, Type clazz, Feature... features) {try{__CLR4_5_200lusvmdeo.R.inc(166);
        __CLR4_5_200lusvmdeo.R.inc(167);return (T) parseObject(bytes, offset, len, charset, clazz, ParserConfig.global, null, DEFAULT_PARSER_FEATURE, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     * @since 1.2.55
     */
    @SuppressWarnings("unchecked")
    public static <T> T parseObject(byte[] bytes,
                                    Charset charset,
                                    Type clazz,
                                    ParserConfig config,
                                    ParseProcess processor,
                                    int featureValues,
                                    Feature... features) {try{__CLR4_5_200lusvmdeo.R.inc(168);
        __CLR4_5_200lusvmdeo.R.inc(169);return (T) parseObject(bytes, 0, bytes.length, charset, clazz, config, processor, featureValues, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     * @since 1.2.55
     */
    @SuppressWarnings("unchecked")
    public static <T> T parseObject(byte[] bytes, int offset, int len,
                                    Charset charset,
                                    Type clazz,
                                    ParserConfig config,
                                    ParseProcess processor,
                                    int featureValues,
                                    Feature... features) {try{__CLR4_5_200lusvmdeo.R.inc(170);
        __CLR4_5_200lusvmdeo.R.inc(171);if ((((charset == null)&&(__CLR4_5_200lusvmdeo.R.iget(172)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(173)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(174);charset = IOUtils.UTF8;
        }

        }__CLR4_5_200lusvmdeo.R.inc(175);String strVal;
        __CLR4_5_200lusvmdeo.R.inc(176);if ((((charset == IOUtils.UTF8)&&(__CLR4_5_200lusvmdeo.R.iget(177)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(178)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(179);char[] chars = allocateChars(bytes.length);
            __CLR4_5_200lusvmdeo.R.inc(180);int chars_len = IOUtils.decodeUTF8(bytes, offset, len, chars);
            __CLR4_5_200lusvmdeo.R.inc(181);if ((((chars_len < 0)&&(__CLR4_5_200lusvmdeo.R.iget(182)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(183)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(184);return null;
            }
            }__CLR4_5_200lusvmdeo.R.inc(185);strVal = new String(chars, 0, chars_len);
        } }else {{
            __CLR4_5_200lusvmdeo.R.inc(186);if ((((len < 0)&&(__CLR4_5_200lusvmdeo.R.iget(187)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(188)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(189);return null;
            }
            }__CLR4_5_200lusvmdeo.R.inc(190);strVal = new String(bytes, offset, len, charset);
        }
        }__CLR4_5_200lusvmdeo.R.inc(191);return (T) parseObject(strVal, clazz, config, processor, featureValues, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public static <T> T parseObject(byte[] input, //
                                    int off, //
                                    int len, //
                                    CharsetDecoder charsetDecoder, //
                                    Type clazz, //
                                    Feature... features) {try{__CLR4_5_200lusvmdeo.R.inc(192);
        __CLR4_5_200lusvmdeo.R.inc(193);charsetDecoder.reset();

        __CLR4_5_200lusvmdeo.R.inc(194);int scaleLength = (int) (len * (double) charsetDecoder.maxCharsPerByte());
        __CLR4_5_200lusvmdeo.R.inc(195);char[] chars = allocateChars(scaleLength);

        __CLR4_5_200lusvmdeo.R.inc(196);ByteBuffer byteBuf = ByteBuffer.wrap(input, off, len);
        __CLR4_5_200lusvmdeo.R.inc(197);CharBuffer charByte = CharBuffer.wrap(chars);
        __CLR4_5_200lusvmdeo.R.inc(198);IOUtils.decode(charsetDecoder, byteBuf, charByte);

        __CLR4_5_200lusvmdeo.R.inc(199);int position = charByte.position();

        __CLR4_5_200lusvmdeo.R.inc(200);return (T) parseObject(chars, position, clazz, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public static <T> T parseObject(char[] input, int length, Type clazz, Feature... features) {try{__CLR4_5_200lusvmdeo.R.inc(201);
        __CLR4_5_200lusvmdeo.R.inc(202);if ((((input == null || input.length == 0)&&(__CLR4_5_200lusvmdeo.R.iget(203)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(204)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(205);return null;
        }

        }__CLR4_5_200lusvmdeo.R.inc(206);int featureValues = DEFAULT_PARSER_FEATURE;
        __CLR4_5_200lusvmdeo.R.inc(207);for (Feature feature : features) {{
            __CLR4_5_200lusvmdeo.R.inc(208);featureValues = Feature.config(featureValues, feature, true);
        }

        }__CLR4_5_200lusvmdeo.R.inc(209);DefaultJSONParser parser = new DefaultJSONParser(input, length, ParserConfig.getGlobalInstance(), featureValues);
        __CLR4_5_200lusvmdeo.R.inc(210);T value = (T) parser.parseObject(clazz);

        __CLR4_5_200lusvmdeo.R.inc(211);parser.handleResovleTask(value);

        __CLR4_5_200lusvmdeo.R.inc(212);parser.close();

        __CLR4_5_200lusvmdeo.R.inc(213);return (T) value;
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}
    
    /**
     * @since 1.2.11
     */
    @SuppressWarnings("unchecked")
    public static <T> T parseObject(InputStream is, //
                                    Type type, //
                                    Feature... features) throws IOException {try{__CLR4_5_200lusvmdeo.R.inc(214);
        __CLR4_5_200lusvmdeo.R.inc(215);return (T) parseObject(is, IOUtils.UTF8, type, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}
    
    /**
     * @since 1.2.11
     */
    @SuppressWarnings("unchecked")
    public static <T> T parseObject(InputStream is, //
                                    Charset charset, //
                                    Type type, //
                                    Feature... features) throws IOException {try{__CLR4_5_200lusvmdeo.R.inc(216);
        __CLR4_5_200lusvmdeo.R.inc(217);return (T) parseObject(is, charset, type, ParserConfig.global, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     * @since 1.2.55
     */
    @SuppressWarnings("unchecked")
    public static <T> T parseObject(InputStream is, //
                                    Charset charset, //
                                    Type type, //
                                    ParserConfig config, //
                                    Feature... features) throws IOException {try{__CLR4_5_200lusvmdeo.R.inc(218);
        __CLR4_5_200lusvmdeo.R.inc(219);return (T) parseObject(is, charset, type, config, null, DEFAULT_PARSER_FEATURE, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     * @since 1.2.55
     */
    @SuppressWarnings("unchecked")
    public static <T> T parseObject(InputStream is, //
                                    Charset charset, //
                                    Type type, //
                                    ParserConfig config, //
                                    ParseProcess processor, //
                                    int featureValues, //
                                    Feature... features) throws IOException {try{__CLR4_5_200lusvmdeo.R.inc(220);
        __CLR4_5_200lusvmdeo.R.inc(221);if ((((charset == null)&&(__CLR4_5_200lusvmdeo.R.iget(222)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(223)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(224);charset = IOUtils.UTF8;
        }

        }__CLR4_5_200lusvmdeo.R.inc(225);byte[] bytes = allocateBytes(1024 * 64);
        __CLR4_5_200lusvmdeo.R.inc(226);int offset = 0;
        __CLR4_5_200lusvmdeo.R.inc(227);for (;;) {{
            __CLR4_5_200lusvmdeo.R.inc(228);int readCount = is.read(bytes, offset, bytes.length - offset);
            __CLR4_5_200lusvmdeo.R.inc(229);if ((((readCount == -1)&&(__CLR4_5_200lusvmdeo.R.iget(230)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(231)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(232);break;
            }
            }__CLR4_5_200lusvmdeo.R.inc(233);offset += readCount;
            __CLR4_5_200lusvmdeo.R.inc(234);if ((((offset == bytes.length)&&(__CLR4_5_200lusvmdeo.R.iget(235)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(236)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(237);byte[] newBytes = new byte[bytes.length * 3 / 2];
                __CLR4_5_200lusvmdeo.R.inc(238);System.arraycopy(bytes, 0, newBytes, 0, bytes.length);
                __CLR4_5_200lusvmdeo.R.inc(239);bytes = newBytes;
            }
        }}

        }__CLR4_5_200lusvmdeo.R.inc(240);return (T) parseObject(bytes, 0, offset, charset, type, config, processor, featureValues, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static <T> T parseObject(String text, Class<T> clazz) {try{__CLR4_5_200lusvmdeo.R.inc(241);
        __CLR4_5_200lusvmdeo.R.inc(242);return parseObject(text, clazz, new Feature[0]);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static JSONArray parseArray(String text) {try{__CLR4_5_200lusvmdeo.R.inc(243);
        __CLR4_5_200lusvmdeo.R.inc(244);if ((((text == null)&&(__CLR4_5_200lusvmdeo.R.iget(245)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(246)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(247);return null;
        }

        }__CLR4_5_200lusvmdeo.R.inc(248);DefaultJSONParser parser = new DefaultJSONParser(text, ParserConfig.getGlobalInstance());

        __CLR4_5_200lusvmdeo.R.inc(249);JSONArray array;

        __CLR4_5_200lusvmdeo.R.inc(250);JSONLexer lexer = parser.lexer;
        __CLR4_5_200lusvmdeo.R.inc(251);if ((((lexer.token() == JSONToken.NULL)&&(__CLR4_5_200lusvmdeo.R.iget(252)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(253)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(254);lexer.nextToken();
            __CLR4_5_200lusvmdeo.R.inc(255);array = null;
        } }else {__CLR4_5_200lusvmdeo.R.inc(256);if ((((lexer.token() == JSONToken.EOF)&&(__CLR4_5_200lusvmdeo.R.iget(257)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(258)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(259);array = null;
        } }else {{
            __CLR4_5_200lusvmdeo.R.inc(260);array = new JSONArray();
            __CLR4_5_200lusvmdeo.R.inc(261);parser.parseArray(array);

            __CLR4_5_200lusvmdeo.R.inc(262);parser.handleResovleTask(array);
        }

        }}__CLR4_5_200lusvmdeo.R.inc(263);parser.close();

        __CLR4_5_200lusvmdeo.R.inc(264);return array;
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static <T> List<T> parseArray(String text, Class<T> clazz) {try{__CLR4_5_200lusvmdeo.R.inc(265);
        __CLR4_5_200lusvmdeo.R.inc(266);if ((((text == null)&&(__CLR4_5_200lusvmdeo.R.iget(267)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(268)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(269);return null;
        }

        }__CLR4_5_200lusvmdeo.R.inc(270);List<T> list;

        __CLR4_5_200lusvmdeo.R.inc(271);DefaultJSONParser parser = new DefaultJSONParser(text, ParserConfig.getGlobalInstance());
        __CLR4_5_200lusvmdeo.R.inc(272);JSONLexer lexer = parser.lexer;
        __CLR4_5_200lusvmdeo.R.inc(273);int token = lexer.token();
        __CLR4_5_200lusvmdeo.R.inc(274);if ((((token == JSONToken.NULL)&&(__CLR4_5_200lusvmdeo.R.iget(275)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(276)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(277);lexer.nextToken();
            __CLR4_5_200lusvmdeo.R.inc(278);list = null;
        } }else {__CLR4_5_200lusvmdeo.R.inc(279);if ((((token == JSONToken.EOF && lexer.isBlankInput())&&(__CLR4_5_200lusvmdeo.R.iget(280)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(281)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(282);list = null;
        } }else {{
            __CLR4_5_200lusvmdeo.R.inc(283);list = new ArrayList<T>();
            __CLR4_5_200lusvmdeo.R.inc(284);parser.parseArray(clazz, list);

            __CLR4_5_200lusvmdeo.R.inc(285);parser.handleResovleTask(list);
        }

        }}__CLR4_5_200lusvmdeo.R.inc(286);parser.close();

        __CLR4_5_200lusvmdeo.R.inc(287);return list;
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static List<Object> parseArray(String text, Type[] types) {try{__CLR4_5_200lusvmdeo.R.inc(288);
        __CLR4_5_200lusvmdeo.R.inc(289);if ((((text == null)&&(__CLR4_5_200lusvmdeo.R.iget(290)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(291)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(292);return null;
        }

        }__CLR4_5_200lusvmdeo.R.inc(293);List<Object> list;

        __CLR4_5_200lusvmdeo.R.inc(294);DefaultJSONParser parser = new DefaultJSONParser(text, ParserConfig.getGlobalInstance());
        __CLR4_5_200lusvmdeo.R.inc(295);Object[] objectArray = parser.parseArray(types);
        __CLR4_5_200lusvmdeo.R.inc(296);if ((((objectArray == null)&&(__CLR4_5_200lusvmdeo.R.iget(297)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(298)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(299);list = null;
        } }else {{
            __CLR4_5_200lusvmdeo.R.inc(300);list = Arrays.asList(objectArray);
        }

        }__CLR4_5_200lusvmdeo.R.inc(301);parser.handleResovleTask(list);

        __CLR4_5_200lusvmdeo.R.inc(302);parser.close();

        __CLR4_5_200lusvmdeo.R.inc(303);return list;
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     * This method serializes the specified object into its equivalent Json representation. Note that this method works fine if the any of the object fields are of generic type,
     * just the object itself should not be of a generic type. If you want to write out the object to a
     * {@link Writer}, use {@link #writeJSONString(Writer, Object, SerializerFeature[])} instead.
     *
     * @param object the object for which json representation is to be created setting for fastjson
     * @return Json representation of {@code object}.
     */
    public static String toJSONString(Object object) {try{__CLR4_5_200lusvmdeo.R.inc(304);
        __CLR4_5_200lusvmdeo.R.inc(305);return toJSONString(object, emptyFilters);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static String toJSONString(Object object, SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(306);
        __CLR4_5_200lusvmdeo.R.inc(307);return toJSONString(object, DEFAULT_GENERATE_FEATURE, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}
    
    /**
     * @since 1.2.11
     */
    public static String toJSONString(Object object, int defaultFeatures, SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(308);
        __CLR4_5_200lusvmdeo.R.inc(309);SerializeWriter out = new SerializeWriter((Writer) null, defaultFeatures, features);

        __CLR4_5_200lusvmdeo.R.inc(310);try {
            __CLR4_5_200lusvmdeo.R.inc(311);JSONSerializer serializer = new JSONSerializer(out);
            __CLR4_5_200lusvmdeo.R.inc(312);serializer.write(object);
            __CLR4_5_200lusvmdeo.R.inc(313);return out.toString();
        } finally {
            __CLR4_5_200lusvmdeo.R.inc(314);out.close();
        }
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     * @since 1.1.14
     */
    public static String toJSONStringWithDateFormat(Object object, String dateFormat,
                                                          SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(315);
        __CLR4_5_200lusvmdeo.R.inc(316);return toJSONString(object, SerializeConfig.globalInstance, null, dateFormat, DEFAULT_GENERATE_FEATURE, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static String toJSONString(Object object, SerializeFilter filter, SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(317);
        __CLR4_5_200lusvmdeo.R.inc(318);return toJSONString(object, SerializeConfig.globalInstance, new SerializeFilter[] {filter}, null, DEFAULT_GENERATE_FEATURE, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static String toJSONString(Object object, SerializeFilter[] filters, SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(319);
        __CLR4_5_200lusvmdeo.R.inc(320);return toJSONString(object, SerializeConfig.globalInstance, filters, null, DEFAULT_GENERATE_FEATURE, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static byte[] toJSONBytes(Object object, SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(321);
        __CLR4_5_200lusvmdeo.R.inc(322);return toJSONBytes(object, DEFAULT_GENERATE_FEATURE, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static byte[] toJSONBytes(Object object, SerializeFilter filter, SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(323);
        __CLR4_5_200lusvmdeo.R.inc(324);return toJSONBytes(object, SerializeConfig.globalInstance, new SerializeFilter[] {filter}, DEFAULT_GENERATE_FEATURE, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}
    
    /**
     * @since 1.2.11 
     */
    public static byte[] toJSONBytes(Object object, int defaultFeatures, SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(325);
        __CLR4_5_200lusvmdeo.R.inc(326);return toJSONBytes(object, SerializeConfig.globalInstance, defaultFeatures, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static String toJSONString(Object object, SerializeConfig config, SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(327);
        __CLR4_5_200lusvmdeo.R.inc(328);return toJSONString(object, config, (SerializeFilter) null, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static String toJSONString(Object object, //
                                      SerializeConfig config, //
                                      SerializeFilter filter, //
                                      SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(329);
        __CLR4_5_200lusvmdeo.R.inc(330);return toJSONString(object, config, new SerializeFilter[] {filter}, null, DEFAULT_GENERATE_FEATURE, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static String toJSONString(Object object, //
                                      SerializeConfig config, //
                                      SerializeFilter[] filters, //
                                      SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(331);
        __CLR4_5_200lusvmdeo.R.inc(332);return toJSONString(object, config, filters, null, DEFAULT_GENERATE_FEATURE, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}
    
    /**
     * @since 1.2.9
     * @return
     */
    public static String toJSONString(Object object, // 
                                      SerializeConfig config, // 
                                      SerializeFilter[] filters, // 
                                      String dateFormat, //
                                      int defaultFeatures, // 
                                      SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(333);
        __CLR4_5_200lusvmdeo.R.inc(334);SerializeWriter out = new SerializeWriter(null, defaultFeatures, features);

        __CLR4_5_200lusvmdeo.R.inc(335);try {
            __CLR4_5_200lusvmdeo.R.inc(336);JSONSerializer serializer = new JSONSerializer(out, config);
            
            __CLR4_5_200lusvmdeo.R.inc(337);if ((((dateFormat != null && dateFormat.length() != 0)&&(__CLR4_5_200lusvmdeo.R.iget(338)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(339)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(340);serializer.setDateFormat(dateFormat);
                __CLR4_5_200lusvmdeo.R.inc(341);serializer.config(SerializerFeature.WriteDateUseDateFormat, true);
            }

            }__CLR4_5_200lusvmdeo.R.inc(342);if ((((filters != null)&&(__CLR4_5_200lusvmdeo.R.iget(343)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(344)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(345);for (SerializeFilter filter : filters) {{
                    __CLR4_5_200lusvmdeo.R.inc(346);serializer.addFilter(filter);
                }
            }}

            }__CLR4_5_200lusvmdeo.R.inc(347);serializer.write(object);

            __CLR4_5_200lusvmdeo.R.inc(348);return out.toString();
        } finally {
            __CLR4_5_200lusvmdeo.R.inc(349);out.close();
        }
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     * @deprecated
     */
    public static String toJSONStringZ(Object object, SerializeConfig mapping, SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(350);
        __CLR4_5_200lusvmdeo.R.inc(351);return toJSONString(object, mapping, emptyFilters, null, 0, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     * @since 1.2.42
     */
    public static byte[] toJSONBytes(Object object, SerializeConfig config, SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(352);
        __CLR4_5_200lusvmdeo.R.inc(353);return toJSONBytes(object, config, emptyFilters, DEFAULT_GENERATE_FEATURE, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     * @since 1.2.11
     */
    public static byte[] toJSONBytes(Object object, SerializeConfig config, int defaultFeatures, SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(354);
        __CLR4_5_200lusvmdeo.R.inc(355);return toJSONBytes(object, config, emptyFilters, defaultFeatures, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     * @since 1.2.42
     */
    public static byte[] toJSONBytes(Object object, SerializeFilter[] filters, SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(356);
        __CLR4_5_200lusvmdeo.R.inc(357);return toJSONBytes(object, SerializeConfig.globalInstance, filters, DEFAULT_GENERATE_FEATURE, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static byte[] toJSONBytes(Object object, SerializeConfig config, SerializeFilter filter, SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(358);
        __CLR4_5_200lusvmdeo.R.inc(359);return toJSONBytes(object, config, new SerializeFilter[] {filter}, DEFAULT_GENERATE_FEATURE, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}
    
    /**
     * @since 1.2.42
     */
    public static byte[] toJSONBytes(Object object, SerializeConfig config, SerializeFilter[] filters, int defaultFeatures, SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(360);
        __CLR4_5_200lusvmdeo.R.inc(361);return toJSONBytes(object, config, filters, null, defaultFeatures, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     * @since 1.2.55
     */
    public static byte[] toJSONBytes(Object object, SerializeConfig config, SerializeFilter[] filters, String dateFormat, int defaultFeatures, SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(362);
        __CLR4_5_200lusvmdeo.R.inc(363);return toJSONBytes(IOUtils.UTF8, object, config, filters, dateFormat, defaultFeatures, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     * @since 1.2.55
     */
    public static byte[] toJSONBytes(Charset charset, //
                                     Object object, //
                                     SerializeConfig config, //
                                     SerializeFilter[] filters, //
                                     String dateFormat, //
                                     int defaultFeatures, //
                                     SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(364);
        __CLR4_5_200lusvmdeo.R.inc(365);SerializeWriter out = new SerializeWriter(null, defaultFeatures, features);

        __CLR4_5_200lusvmdeo.R.inc(366);try {
            __CLR4_5_200lusvmdeo.R.inc(367);JSONSerializer serializer = new JSONSerializer(out, config);

            __CLR4_5_200lusvmdeo.R.inc(368);if ((((dateFormat != null && dateFormat.length() != 0)&&(__CLR4_5_200lusvmdeo.R.iget(369)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(370)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(371);serializer.setDateFormat(dateFormat);
                __CLR4_5_200lusvmdeo.R.inc(372);serializer.config(SerializerFeature.WriteDateUseDateFormat, true);
            }

            }__CLR4_5_200lusvmdeo.R.inc(373);if ((((filters != null)&&(__CLR4_5_200lusvmdeo.R.iget(374)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(375)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(376);for (SerializeFilter filter : filters) {{
                    __CLR4_5_200lusvmdeo.R.inc(377);serializer.addFilter(filter);
                }
            }}

            }__CLR4_5_200lusvmdeo.R.inc(378);serializer.write(object);
            __CLR4_5_200lusvmdeo.R.inc(379);return out.toBytes(charset);
        } finally {
            __CLR4_5_200lusvmdeo.R.inc(380);out.close();
        }
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static String toJSONString(Object object, boolean prettyFormat) {try{__CLR4_5_200lusvmdeo.R.inc(381);
        __CLR4_5_200lusvmdeo.R.inc(382);if ((((!prettyFormat)&&(__CLR4_5_200lusvmdeo.R.iget(383)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(384)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(385);return toJSONString(object);
        }

        }__CLR4_5_200lusvmdeo.R.inc(386);return toJSONString(object, SerializerFeature.PrettyFormat);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}
    
    /**
     * @deprecated use writeJSONString
     */
    public static void writeJSONStringTo(Object object, Writer writer, SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(387);
        __CLR4_5_200lusvmdeo.R.inc(388);writeJSONString(writer, object, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     * This method serializes the specified object into its equivalent json representation.
     *
     * @param writer Writer to which the json representation needs to be written
     * @param object the object for which json representation is to be created setting for fastjson
     * @param features serializer features
     * @since 1.2.11
     */
    public static void writeJSONString(Writer writer, Object object, SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(389);
        __CLR4_5_200lusvmdeo.R.inc(390);writeJSONString(writer, object, JSON.DEFAULT_GENERATE_FEATURE, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}
    
    /**
     * @since 1.2.11 
     */
    public static void writeJSONString(Writer writer, Object object, int defaultFeatures, SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(391);
        __CLR4_5_200lusvmdeo.R.inc(392);SerializeWriter out = new SerializeWriter(writer, defaultFeatures, features);

        __CLR4_5_200lusvmdeo.R.inc(393);try {
            __CLR4_5_200lusvmdeo.R.inc(394);JSONSerializer serializer = new JSONSerializer(out);
            __CLR4_5_200lusvmdeo.R.inc(395);serializer.write(object);
        } finally {
            __CLR4_5_200lusvmdeo.R.inc(396);out.close();
        }
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}
    
    /**
     * write object as json to OutputStream
     * @param os output stream
     * @param object
     * @param features serializer features
     * @since 1.2.11
     * @throws IOException
     */
    public static final int writeJSONString(OutputStream os, // 
                                             Object object, // 
                                             SerializerFeature... features) throws IOException {try{__CLR4_5_200lusvmdeo.R.inc(397);
        __CLR4_5_200lusvmdeo.R.inc(398);return writeJSONString(os, object, DEFAULT_GENERATE_FEATURE, features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}
    
    /**
     * @since 1.2.11 
     */
    public static final int writeJSONString(OutputStream os, // 
                                            Object object, // 
                                            int defaultFeatures, //
                                            SerializerFeature... features) throws IOException {try{__CLR4_5_200lusvmdeo.R.inc(399);
       __CLR4_5_200lusvmdeo.R.inc(400);return writeJSONString(os,  //
                              IOUtils.UTF8, //
                              object, //
                              SerializeConfig.globalInstance, //
                              null, //
                              null, // 
                              defaultFeatures, //
                              features);
   }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}
    
    public static final int writeJSONString(OutputStream os, // 
                                             Charset charset, // 
                                             Object object, // 
                                             SerializerFeature... features) throws IOException {try{__CLR4_5_200lusvmdeo.R.inc(401);
        __CLR4_5_200lusvmdeo.R.inc(402);return writeJSONString(os, //
                               charset, //
                               object, //
                               SerializeConfig.globalInstance, //
                               null, //
                               null, //
                               DEFAULT_GENERATE_FEATURE, //
                               features);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}
    
    public static final int writeJSONString(OutputStream os, // 
                                             Charset charset, // 
                                             Object object, // 
                                             SerializeConfig config, //
                                             SerializeFilter[] filters, //
                                             String dateFormat, //
                                             int defaultFeatures, //
                                             SerializerFeature... features) throws IOException {try{__CLR4_5_200lusvmdeo.R.inc(403);
        __CLR4_5_200lusvmdeo.R.inc(404);SerializeWriter writer = new SerializeWriter(null, defaultFeatures, features);

        __CLR4_5_200lusvmdeo.R.inc(405);try {
            __CLR4_5_200lusvmdeo.R.inc(406);JSONSerializer serializer = new JSONSerializer(writer, config);
            
            __CLR4_5_200lusvmdeo.R.inc(407);if ((((dateFormat != null && dateFormat.length() != 0)&&(__CLR4_5_200lusvmdeo.R.iget(408)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(409)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(410);serializer.setDateFormat(dateFormat);
                __CLR4_5_200lusvmdeo.R.inc(411);serializer.config(SerializerFeature.WriteDateUseDateFormat, true);
            }

            }__CLR4_5_200lusvmdeo.R.inc(412);if ((((filters != null)&&(__CLR4_5_200lusvmdeo.R.iget(413)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(414)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(415);for (SerializeFilter filter : filters) {{
                    __CLR4_5_200lusvmdeo.R.inc(416);serializer.addFilter(filter);
                }
            }}
            
            }__CLR4_5_200lusvmdeo.R.inc(417);serializer.write(object);
            
            __CLR4_5_200lusvmdeo.R.inc(418);int len = writer.writeToEx(os, charset);
            __CLR4_5_200lusvmdeo.R.inc(419);return len;
        } finally {
            __CLR4_5_200lusvmdeo.R.inc(420);writer.close();
        }
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    // ======================================
    @Override
    public String toString() {try{__CLR4_5_200lusvmdeo.R.inc(421);
        __CLR4_5_200lusvmdeo.R.inc(422);return toJSONString();
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public String toJSONString() {try{__CLR4_5_200lusvmdeo.R.inc(423);
        __CLR4_5_200lusvmdeo.R.inc(424);SerializeWriter out = new SerializeWriter();
        __CLR4_5_200lusvmdeo.R.inc(425);try {
            __CLR4_5_200lusvmdeo.R.inc(426);new JSONSerializer(out).write(this);
            __CLR4_5_200lusvmdeo.R.inc(427);return out.toString();
        } finally {
            __CLR4_5_200lusvmdeo.R.inc(428);out.close();
        }
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     * @since 1.2.57
     */
    public String toString(SerializerFeature... features) {try{__CLR4_5_200lusvmdeo.R.inc(429);
        __CLR4_5_200lusvmdeo.R.inc(430);SerializeWriter out = new SerializeWriter(null, JSON.DEFAULT_GENERATE_FEATURE, features);

        __CLR4_5_200lusvmdeo.R.inc(431);try {
            __CLR4_5_200lusvmdeo.R.inc(432);new JSONSerializer(out).write(this);
            __CLR4_5_200lusvmdeo.R.inc(433);return out.toString();
        } finally {
            __CLR4_5_200lusvmdeo.R.inc(434);out.close();
        }
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public void writeJSONString(Appendable appendable) {try{__CLR4_5_200lusvmdeo.R.inc(435);
        __CLR4_5_200lusvmdeo.R.inc(436);SerializeWriter out = new SerializeWriter();
        __CLR4_5_200lusvmdeo.R.inc(437);try {
            __CLR4_5_200lusvmdeo.R.inc(438);new JSONSerializer(out).write(this);
            __CLR4_5_200lusvmdeo.R.inc(439);appendable.append(out.toString());
        } catch (IOException e) {
            __CLR4_5_200lusvmdeo.R.inc(440);throw new JSONException(e.getMessage(), e);
        } finally {
            __CLR4_5_200lusvmdeo.R.inc(441);out.close();
        }
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     * This method serializes the specified object into its equivalent representation as a tree of
     * {@link JSONObject}s. 
     *
     */
    public static Object toJSON(Object javaObject) {try{__CLR4_5_200lusvmdeo.R.inc(442);
        __CLR4_5_200lusvmdeo.R.inc(443);return toJSON(javaObject, SerializeConfig.globalInstance);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     * @deprecated
     */
    public static Object toJSON(Object javaObject, ParserConfig parserConfig) {try{__CLR4_5_200lusvmdeo.R.inc(444);
        __CLR4_5_200lusvmdeo.R.inc(445);return toJSON(javaObject, SerializeConfig.globalInstance);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}
    
    @SuppressWarnings("unchecked")
    public static Object toJSON(Object javaObject, SerializeConfig config) {try{__CLR4_5_200lusvmdeo.R.inc(446);
        __CLR4_5_200lusvmdeo.R.inc(447);if ((((javaObject == null)&&(__CLR4_5_200lusvmdeo.R.iget(448)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(449)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(450);return null;
        }

        }__CLR4_5_200lusvmdeo.R.inc(451);if ((((javaObject instanceof JSON)&&(__CLR4_5_200lusvmdeo.R.iget(452)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(453)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(454);return javaObject;
        }

        }__CLR4_5_200lusvmdeo.R.inc(455);if ((((javaObject instanceof Map)&&(__CLR4_5_200lusvmdeo.R.iget(456)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(457)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(458);Map<Object, Object> map = (Map<Object, Object>) javaObject;

            __CLR4_5_200lusvmdeo.R.inc(459);int size = map.size();

            __CLR4_5_200lusvmdeo.R.inc(460);Map innerMap;
            __CLR4_5_200lusvmdeo.R.inc(461);if ((((map instanceof LinkedHashMap)&&(__CLR4_5_200lusvmdeo.R.iget(462)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(463)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(464);innerMap = new LinkedHashMap(size);
            } }else {__CLR4_5_200lusvmdeo.R.inc(465);if ((((map instanceof TreeMap)&&(__CLR4_5_200lusvmdeo.R.iget(466)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(467)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(468);innerMap = new TreeMap();
            } }else {{
                __CLR4_5_200lusvmdeo.R.inc(469);innerMap = new HashMap(size);
            }

            }}__CLR4_5_200lusvmdeo.R.inc(470);JSONObject json = new JSONObject(innerMap);

            __CLR4_5_200lusvmdeo.R.inc(471);for (Map.Entry<Object, Object> entry : map.entrySet()) {{
                __CLR4_5_200lusvmdeo.R.inc(472);Object key = entry.getKey();
                __CLR4_5_200lusvmdeo.R.inc(473);String jsonKey = TypeUtils.castToString(key);
                __CLR4_5_200lusvmdeo.R.inc(474);Object jsonValue = toJSON(entry.getValue(), config);
                __CLR4_5_200lusvmdeo.R.inc(475);json.put(jsonKey, jsonValue);
            }

            }__CLR4_5_200lusvmdeo.R.inc(476);return json;
        }

        }__CLR4_5_200lusvmdeo.R.inc(477);if ((((javaObject instanceof Collection)&&(__CLR4_5_200lusvmdeo.R.iget(478)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(479)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(480);Collection<Object> collection = (Collection<Object>) javaObject;

            __CLR4_5_200lusvmdeo.R.inc(481);JSONArray array = new JSONArray(collection.size());

            __CLR4_5_200lusvmdeo.R.inc(482);for (Object item : collection) {{
                __CLR4_5_200lusvmdeo.R.inc(483);Object jsonValue = toJSON(item, config);
                __CLR4_5_200lusvmdeo.R.inc(484);array.add(jsonValue);
            }

            }__CLR4_5_200lusvmdeo.R.inc(485);return array;
        }

        }__CLR4_5_200lusvmdeo.R.inc(486);if ((((javaObject instanceof JSONSerializable)&&(__CLR4_5_200lusvmdeo.R.iget(487)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(488)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(489);String json = JSON.toJSONString(javaObject);
            __CLR4_5_200lusvmdeo.R.inc(490);return JSON.parse(json);
        }

        }__CLR4_5_200lusvmdeo.R.inc(491);Class<?> clazz = javaObject.getClass();

        __CLR4_5_200lusvmdeo.R.inc(492);if ((((clazz.isEnum())&&(__CLR4_5_200lusvmdeo.R.iget(493)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(494)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(495);return ((Enum<?>) javaObject).name();
        }

        }__CLR4_5_200lusvmdeo.R.inc(496);if ((((clazz.isArray())&&(__CLR4_5_200lusvmdeo.R.iget(497)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(498)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(499);int len = Array.getLength(javaObject);

            __CLR4_5_200lusvmdeo.R.inc(500);JSONArray array = new JSONArray(len);

            __CLR4_5_200lusvmdeo.R.inc(501);for (int i = 0; (((i < len)&&(__CLR4_5_200lusvmdeo.R.iget(502)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(503)==0&false)); ++i) {{
                __CLR4_5_200lusvmdeo.R.inc(504);Object item = Array.get(javaObject, i);
                __CLR4_5_200lusvmdeo.R.inc(505);Object jsonValue = toJSON(item);
                __CLR4_5_200lusvmdeo.R.inc(506);array.add(jsonValue);
            }

            }__CLR4_5_200lusvmdeo.R.inc(507);return array;
        }

        }__CLR4_5_200lusvmdeo.R.inc(508);if ((((ParserConfig.isPrimitive2(clazz))&&(__CLR4_5_200lusvmdeo.R.iget(509)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(510)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(511);return javaObject;
        }

        }__CLR4_5_200lusvmdeo.R.inc(512);ObjectSerializer serializer = config.getObjectWriter(clazz);
        __CLR4_5_200lusvmdeo.R.inc(513);if ((((serializer instanceof JavaBeanSerializer)&&(__CLR4_5_200lusvmdeo.R.iget(514)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(515)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(516);JavaBeanSerializer javaBeanSerializer = (JavaBeanSerializer) serializer;
            
            __CLR4_5_200lusvmdeo.R.inc(517);JSONObject json = new JSONObject();
            __CLR4_5_200lusvmdeo.R.inc(518);try {
                __CLR4_5_200lusvmdeo.R.inc(519);Map<String, Object> values = javaBeanSerializer.getFieldValuesMap(javaObject);
                __CLR4_5_200lusvmdeo.R.inc(520);for (Map.Entry<String, Object> entry : values.entrySet()) {{
                    __CLR4_5_200lusvmdeo.R.inc(521);json.put(entry.getKey(), toJSON(entry.getValue(), config));
                }
            }} catch (Exception e) {
                __CLR4_5_200lusvmdeo.R.inc(522);throw new JSONException("toJSON error", e);
            }
            __CLR4_5_200lusvmdeo.R.inc(523);return json;
        }
        
        }__CLR4_5_200lusvmdeo.R.inc(524);String text = JSON.toJSONString(javaObject);
        __CLR4_5_200lusvmdeo.R.inc(525);return JSON.parse(text);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static <T> T toJavaObject(JSON json, Class<T> clazz) {try{__CLR4_5_200lusvmdeo.R.inc(526);
        __CLR4_5_200lusvmdeo.R.inc(527);return TypeUtils.cast(json, clazz, ParserConfig.getGlobalInstance());
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}
    
    /**
     * @since 1.2.9
     */
    public <T> T toJavaObject(Class<T> clazz) {try{__CLR4_5_200lusvmdeo.R.inc(528);
        __CLR4_5_200lusvmdeo.R.inc(529);if ((((clazz == JSONArray.class || clazz == JSON.class || clazz == Collection.class || clazz == List.class)&&(__CLR4_5_200lusvmdeo.R.iget(530)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(531)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(532);return (T) this;
        }

        }__CLR4_5_200lusvmdeo.R.inc(533);return TypeUtils.cast(this, clazz, ParserConfig.getGlobalInstance());
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     * @since 1.2.33
     */
    public <T> T toJavaObject(Type type) {try{__CLR4_5_200lusvmdeo.R.inc(534);
        __CLR4_5_200lusvmdeo.R.inc(535);return TypeUtils.cast(this, type, ParserConfig.getGlobalInstance());
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    /**
     * @since 1.2.33
     */
    public <T> T toJavaObject(TypeReference typeReference) {try{__CLR4_5_200lusvmdeo.R.inc(536);
        __CLR4_5_200lusvmdeo.R.inc(537);Type type = (((typeReference != null )&&(__CLR4_5_200lusvmdeo.R.iget(538)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(539)==0&false))? typeReference.getType() : null;
        __CLR4_5_200lusvmdeo.R.inc(540);return TypeUtils.cast(this, type, ParserConfig.getGlobalInstance());
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}
    
    private final static ThreadLocal<byte[]> bytesLocal = new ThreadLocal<byte[]>();
    private static byte[] allocateBytes(int length) {try{__CLR4_5_200lusvmdeo.R.inc(541);
        __CLR4_5_200lusvmdeo.R.inc(542);byte[] chars = bytesLocal.get();

        __CLR4_5_200lusvmdeo.R.inc(543);if ((((chars == null)&&(__CLR4_5_200lusvmdeo.R.iget(544)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(545)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(546);if ((((length <= 1024 * 64)&&(__CLR4_5_200lusvmdeo.R.iget(547)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(548)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(549);chars = new byte[1024 * 64];
                __CLR4_5_200lusvmdeo.R.inc(550);bytesLocal.set(chars);
            } }else {{
                __CLR4_5_200lusvmdeo.R.inc(551);chars = new byte[length];
            }
        }} }else {__CLR4_5_200lusvmdeo.R.inc(552);if ((((chars.length < length)&&(__CLR4_5_200lusvmdeo.R.iget(553)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(554)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(555);chars = new byte[length];
        }

        }}__CLR4_5_200lusvmdeo.R.inc(556);return chars;
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}
    
    private final static ThreadLocal<char[]> charsLocal = new ThreadLocal<char[]>();
    private static char[] allocateChars(int length) {try{__CLR4_5_200lusvmdeo.R.inc(557);
        __CLR4_5_200lusvmdeo.R.inc(558);char[] chars = charsLocal.get();

        __CLR4_5_200lusvmdeo.R.inc(559);if ((((chars == null)&&(__CLR4_5_200lusvmdeo.R.iget(560)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(561)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(562);if ((((length <= 1024 * 64)&&(__CLR4_5_200lusvmdeo.R.iget(563)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(564)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(565);chars = new char[1024 * 64];
                __CLR4_5_200lusvmdeo.R.inc(566);charsLocal.set(chars);
            } }else {{
                __CLR4_5_200lusvmdeo.R.inc(567);chars = new char[length];
            }
        }} }else {__CLR4_5_200lusvmdeo.R.inc(568);if ((((chars.length < length)&&(__CLR4_5_200lusvmdeo.R.iget(569)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(570)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(571);chars = new char[length];
        }

        }}__CLR4_5_200lusvmdeo.R.inc(572);return chars;
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static boolean isValid(String str) {try{__CLR4_5_200lusvmdeo.R.inc(573);
        __CLR4_5_200lusvmdeo.R.inc(574);if ((((str == null || str.length() == 0)&&(__CLR4_5_200lusvmdeo.R.iget(575)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(576)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(577);return false;
        }

        }__CLR4_5_200lusvmdeo.R.inc(578);JSONScanner lexer = new JSONScanner(str);
        __CLR4_5_200lusvmdeo.R.inc(579);try {
            __CLR4_5_200lusvmdeo.R.inc(580);lexer.nextToken();

            __CLR4_5_200lusvmdeo.R.inc(581);final int token = lexer.token();
            boolean __CLB4_5_2_bool0=false;__CLR4_5_200lusvmdeo.R.inc(582);switch (token) {
                case JSONToken.LBRACE:if (!__CLB4_5_2_bool0) {__CLR4_5_200lusvmdeo.R.inc(583);__CLB4_5_2_bool0=true;}
                    __CLR4_5_200lusvmdeo.R.inc(584);if ((((lexer.getCurrent() == JSONLexer.EOI)&&(__CLR4_5_200lusvmdeo.R.iget(585)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(586)==0&false))) {{
                        __CLR4_5_200lusvmdeo.R.inc(587);return false;
                    }
                    }__CLR4_5_200lusvmdeo.R.inc(588);lexer.skipObject(true);
                    __CLR4_5_200lusvmdeo.R.inc(589);break;
                case JSONToken.LBRACKET:if (!__CLB4_5_2_bool0) {__CLR4_5_200lusvmdeo.R.inc(590);__CLB4_5_2_bool0=true;}
                    __CLR4_5_200lusvmdeo.R.inc(591);lexer.skipArray(true);
                    __CLR4_5_200lusvmdeo.R.inc(592);break;
                case JSONToken.LITERAL_INT:if (!__CLB4_5_2_bool0) {__CLR4_5_200lusvmdeo.R.inc(593);__CLB4_5_2_bool0=true;}
                case JSONToken.LITERAL_STRING:if (!__CLB4_5_2_bool0) {__CLR4_5_200lusvmdeo.R.inc(594);__CLB4_5_2_bool0=true;}
                case JSONToken.LITERAL_FLOAT:if (!__CLB4_5_2_bool0) {__CLR4_5_200lusvmdeo.R.inc(595);__CLB4_5_2_bool0=true;}
                case JSONToken.LITERAL_ISO8601_DATE:if (!__CLB4_5_2_bool0) {__CLR4_5_200lusvmdeo.R.inc(596);__CLB4_5_2_bool0=true;}
                case JSONToken.NULL:if (!__CLB4_5_2_bool0) {__CLR4_5_200lusvmdeo.R.inc(597);__CLB4_5_2_bool0=true;}
                case JSONToken.TRUE:if (!__CLB4_5_2_bool0) {__CLR4_5_200lusvmdeo.R.inc(598);__CLB4_5_2_bool0=true;}
                case JSONToken.FALSE:if (!__CLB4_5_2_bool0) {__CLR4_5_200lusvmdeo.R.inc(599);__CLB4_5_2_bool0=true;}
                    __CLR4_5_200lusvmdeo.R.inc(600);lexer.nextToken();
                    __CLR4_5_200lusvmdeo.R.inc(601);break;
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_200lusvmdeo.R.inc(602);__CLB4_5_2_bool0=true;}
                    __CLR4_5_200lusvmdeo.R.inc(603);return false;
            }

            __CLR4_5_200lusvmdeo.R.inc(604);return lexer.token() == JSONToken.EOF;
        } catch (Exception ex) {
            __CLR4_5_200lusvmdeo.R.inc(605);return false;
        } finally {
            __CLR4_5_200lusvmdeo.R.inc(606);lexer.close();
        }
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static boolean isValidObject(String str) {try{__CLR4_5_200lusvmdeo.R.inc(607);
        __CLR4_5_200lusvmdeo.R.inc(608);if ((((str == null || str.length() == 0)&&(__CLR4_5_200lusvmdeo.R.iget(609)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(610)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(611);return false;
        }

        }__CLR4_5_200lusvmdeo.R.inc(612);JSONScanner lexer = new JSONScanner(str);

        __CLR4_5_200lusvmdeo.R.inc(613);try {
            __CLR4_5_200lusvmdeo.R.inc(614);lexer.nextToken();
            __CLR4_5_200lusvmdeo.R.inc(615);final int token = lexer.token();
            __CLR4_5_200lusvmdeo.R.inc(616);if ((((token == JSONToken.LBRACE)&&(__CLR4_5_200lusvmdeo.R.iget(617)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(618)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(619);if ((((lexer.getCurrent() == JSONLexer.EOI)&&(__CLR4_5_200lusvmdeo.R.iget(620)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(621)==0&false))) {{
                    __CLR4_5_200lusvmdeo.R.inc(622);return false;
                }
                }__CLR4_5_200lusvmdeo.R.inc(623);lexer.skipObject(true);
                __CLR4_5_200lusvmdeo.R.inc(624);return lexer.token() == JSONToken.EOF;
            }
            }__CLR4_5_200lusvmdeo.R.inc(625);return false;
        } catch (Exception ex) {
            __CLR4_5_200lusvmdeo.R.inc(626);return false;
        } finally {
            __CLR4_5_200lusvmdeo.R.inc(627);lexer.close();
        }
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static boolean isValidArray(String str) {try{__CLR4_5_200lusvmdeo.R.inc(628);
        __CLR4_5_200lusvmdeo.R.inc(629);if ((((str == null || str.length() == 0)&&(__CLR4_5_200lusvmdeo.R.iget(630)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(631)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(632);return false;
        }

        }__CLR4_5_200lusvmdeo.R.inc(633);JSONScanner lexer = new JSONScanner(str);
        __CLR4_5_200lusvmdeo.R.inc(634);try {
            __CLR4_5_200lusvmdeo.R.inc(635);lexer.nextToken();
            __CLR4_5_200lusvmdeo.R.inc(636);final int token = lexer.token();
            __CLR4_5_200lusvmdeo.R.inc(637);if ((((token == JSONToken.LBRACKET)&&(__CLR4_5_200lusvmdeo.R.iget(638)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(639)==0&false))) {{
                __CLR4_5_200lusvmdeo.R.inc(640);lexer.skipArray(true);
                __CLR4_5_200lusvmdeo.R.inc(641);return lexer.token() == JSONToken.EOF;
            }
            }__CLR4_5_200lusvmdeo.R.inc(642);return false;
        } catch (Exception ex) {
            __CLR4_5_200lusvmdeo.R.inc(643);return false;
        } finally {
            __CLR4_5_200lusvmdeo.R.inc(644);lexer.close();
        }
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static <T> void handleResovleTask(DefaultJSONParser parser, T value) {try{__CLR4_5_200lusvmdeo.R.inc(645);
        __CLR4_5_200lusvmdeo.R.inc(646);parser.handleResovleTask(value);
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}
    
    public static void addMixInAnnotations(Type target, Type mixinSource) {try{__CLR4_5_200lusvmdeo.R.inc(647);
        __CLR4_5_200lusvmdeo.R.inc(648);if ((((target != null && mixinSource != null)&&(__CLR4_5_200lusvmdeo.R.iget(649)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(650)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(651);mixInsMapper.put(target, mixinSource);
        }
    }}finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static void removeMixInAnnotations(Type target) {try{__CLR4_5_200lusvmdeo.R.inc(652);
        __CLR4_5_200lusvmdeo.R.inc(653);if ((((target != null)&&(__CLR4_5_200lusvmdeo.R.iget(654)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(655)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(656);mixInsMapper.remove(target);
        }
    }}finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static void clearMixInAnnotations() {try{__CLR4_5_200lusvmdeo.R.inc(657);
        __CLR4_5_200lusvmdeo.R.inc(658);mixInsMapper.clear();
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public static Type getMixInAnnotations(Type target) {try{__CLR4_5_200lusvmdeo.R.inc(659);
        __CLR4_5_200lusvmdeo.R.inc(660);if ((((target != null)&&(__CLR4_5_200lusvmdeo.R.iget(661)!=0|true))||(__CLR4_5_200lusvmdeo.R.iget(662)==0&false))) {{
            __CLR4_5_200lusvmdeo.R.inc(663);return mixInsMapper.get(target);
        }
        }__CLR4_5_200lusvmdeo.R.inc(664);return null;
    }finally{__CLR4_5_200lusvmdeo.R.flushNeeded();}}

    public final static String VERSION = "1.2.61";
}
