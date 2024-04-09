/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.support.retrofit;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/**
 * @author ligboy, wenshao
 * @author Victor.Zxy
 */
public class Retrofit2ConverterFactory extends Converter.Factory {public static class __CLR4_5_2oouooulusvmwl2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,32056,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final MediaType MEDIA_TYPE = MediaType.parse("application/json; charset=UTF-8");

    private FastJsonConfig fastJsonConfig;

    @Deprecated
    private static final Feature[] EMPTY_SERIALIZER_FEATURES = new Feature[0];
    @Deprecated
    private ParserConfig parserConfig = ParserConfig.getGlobalInstance();
    @Deprecated
    private int featureValues = JSON.DEFAULT_PARSER_FEATURE;
    @Deprecated
    private Feature[] features;
    @Deprecated
    private SerializeConfig serializeConfig;
    @Deprecated
    private SerializerFeature[] serializerFeatures;

    public Retrofit2ConverterFactory() {try{__CLR4_5_2oouooulusvmwl2.R.inc(31998);
        __CLR4_5_2oouooulusvmwl2.R.inc(31999);this.fastJsonConfig = new FastJsonConfig();
    }finally{__CLR4_5_2oouooulusvmwl2.R.flushNeeded();}}

    public Retrofit2ConverterFactory(FastJsonConfig fastJsonConfig) {try{__CLR4_5_2oouooulusvmwl2.R.inc(32000);
        __CLR4_5_2oouooulusvmwl2.R.inc(32001);this.fastJsonConfig = fastJsonConfig;
    }finally{__CLR4_5_2oouooulusvmwl2.R.flushNeeded();}}

    public static Retrofit2ConverterFactory create() {try{__CLR4_5_2oouooulusvmwl2.R.inc(32002);
        __CLR4_5_2oouooulusvmwl2.R.inc(32003);return create(new FastJsonConfig());
    }finally{__CLR4_5_2oouooulusvmwl2.R.flushNeeded();}}

    public static Retrofit2ConverterFactory create(FastJsonConfig fastJsonConfig) {try{__CLR4_5_2oouooulusvmwl2.R.inc(32004);
        __CLR4_5_2oouooulusvmwl2.R.inc(32005);if ((((fastJsonConfig == null)&&(__CLR4_5_2oouooulusvmwl2.R.iget(32006)!=0|true))||(__CLR4_5_2oouooulusvmwl2.R.iget(32007)==0&false))) {__CLR4_5_2oouooulusvmwl2.R.inc(32008);throw new NullPointerException("fastJsonConfig == null");
        }__CLR4_5_2oouooulusvmwl2.R.inc(32009);return new Retrofit2ConverterFactory(fastJsonConfig);
    }finally{__CLR4_5_2oouooulusvmwl2.R.flushNeeded();}}

    @Override
    public Converter<ResponseBody, Object> responseBodyConverter(Type type, //
                                                                 Annotation[] annotations, //
                                                                 Retrofit retrofit) {try{__CLR4_5_2oouooulusvmwl2.R.inc(32010);
        __CLR4_5_2oouooulusvmwl2.R.inc(32011);return new ResponseBodyConverter<Object>(type);
    }finally{__CLR4_5_2oouooulusvmwl2.R.flushNeeded();}}

    @Override
    public Converter<Object, RequestBody> requestBodyConverter(Type type, //
                                                               Annotation[] parameterAnnotations, //
                                                               Annotation[] methodAnnotations, //
                                                               Retrofit retrofit) {try{__CLR4_5_2oouooulusvmwl2.R.inc(32012);
        __CLR4_5_2oouooulusvmwl2.R.inc(32013);return new RequestBodyConverter<Object>();
    }finally{__CLR4_5_2oouooulusvmwl2.R.flushNeeded();}}

    public FastJsonConfig getFastJsonConfig() {try{__CLR4_5_2oouooulusvmwl2.R.inc(32014);
        __CLR4_5_2oouooulusvmwl2.R.inc(32015);return fastJsonConfig;
    }finally{__CLR4_5_2oouooulusvmwl2.R.flushNeeded();}}

    public Retrofit2ConverterFactory setFastJsonConfig(FastJsonConfig fastJsonConfig) {try{__CLR4_5_2oouooulusvmwl2.R.inc(32016);
        __CLR4_5_2oouooulusvmwl2.R.inc(32017);this.fastJsonConfig = fastJsonConfig;
        __CLR4_5_2oouooulusvmwl2.R.inc(32018);return this;
    }finally{__CLR4_5_2oouooulusvmwl2.R.flushNeeded();}}

    /**
     * Gets parser config.
     *
     * @return the parser config
     * @see FastJsonConfig#getParserConfig()
     * @deprecated
     */
    @Deprecated
    public ParserConfig getParserConfig() {try{__CLR4_5_2oouooulusvmwl2.R.inc(32019);
        __CLR4_5_2oouooulusvmwl2.R.inc(32020);return fastJsonConfig.getParserConfig();
    }finally{__CLR4_5_2oouooulusvmwl2.R.flushNeeded();}}

    /**
     * Sets parser config.
     *
     * @param config the config
     * @return the parser config
     * @see FastJsonConfig#setParserConfig(ParserConfig)
     * @deprecated
     */
    @Deprecated
    public Retrofit2ConverterFactory setParserConfig(ParserConfig config) {try{__CLR4_5_2oouooulusvmwl2.R.inc(32021);
        __CLR4_5_2oouooulusvmwl2.R.inc(32022);fastJsonConfig.setParserConfig(config);
        __CLR4_5_2oouooulusvmwl2.R.inc(32023);return this;
    }finally{__CLR4_5_2oouooulusvmwl2.R.flushNeeded();}}

    /**
     * Gets parser feature values.
     *
     * @return the parser feature values
     * @see JSON#DEFAULT_PARSER_FEATURE
     * @deprecated
     */
    @Deprecated
    public int getParserFeatureValues() {try{__CLR4_5_2oouooulusvmwl2.R.inc(32024);
        __CLR4_5_2oouooulusvmwl2.R.inc(32025);return JSON.DEFAULT_PARSER_FEATURE;
    }finally{__CLR4_5_2oouooulusvmwl2.R.flushNeeded();}}

    /**
     * Sets parser feature values.
     *
     * @param featureValues the feature values
     * @return the parser feature values
     * @see JSON#DEFAULT_PARSER_FEATURE
     * @deprecated
     */
    @Deprecated
    public Retrofit2ConverterFactory setParserFeatureValues(int featureValues) {try{__CLR4_5_2oouooulusvmwl2.R.inc(32026);
        __CLR4_5_2oouooulusvmwl2.R.inc(32027);return this;
    }finally{__CLR4_5_2oouooulusvmwl2.R.flushNeeded();}}

    /**
     * Get parser features feature [].
     *
     * @return the feature []
     * @see FastJsonConfig#getFeatures()
     * @deprecated
     */
    @Deprecated
    public Feature[] getParserFeatures() {try{__CLR4_5_2oouooulusvmwl2.R.inc(32028);
        __CLR4_5_2oouooulusvmwl2.R.inc(32029);return fastJsonConfig.getFeatures();
    }finally{__CLR4_5_2oouooulusvmwl2.R.flushNeeded();}}

    /**
     * Sets parser features.
     *
     * @param features the features
     * @return the parser features
     * @see FastJsonConfig#setFeatures(Feature...)
     * @deprecated
     */
    @Deprecated
    public Retrofit2ConverterFactory setParserFeatures(Feature[] features) {try{__CLR4_5_2oouooulusvmwl2.R.inc(32030);
        __CLR4_5_2oouooulusvmwl2.R.inc(32031);fastJsonConfig.setFeatures(features);
        __CLR4_5_2oouooulusvmwl2.R.inc(32032);return this;
    }finally{__CLR4_5_2oouooulusvmwl2.R.flushNeeded();}}

    /**
     * Gets serialize config.
     *
     * @return the serialize config
     * @see FastJsonConfig#getSerializeConfig()
     * @deprecated
     */
    @Deprecated
    public SerializeConfig getSerializeConfig() {try{__CLR4_5_2oouooulusvmwl2.R.inc(32033);
        __CLR4_5_2oouooulusvmwl2.R.inc(32034);return fastJsonConfig.getSerializeConfig();
    }finally{__CLR4_5_2oouooulusvmwl2.R.flushNeeded();}}

    /**
     * Sets serialize config.
     *
     * @param serializeConfig the serialize config
     * @return the serialize config
     * @see FastJsonConfig#setSerializeConfig(SerializeConfig)
     * @deprecated
     */
    @Deprecated
    public Retrofit2ConverterFactory setSerializeConfig(SerializeConfig serializeConfig) {try{__CLR4_5_2oouooulusvmwl2.R.inc(32035);
        __CLR4_5_2oouooulusvmwl2.R.inc(32036);fastJsonConfig.setSerializeConfig(serializeConfig);
        __CLR4_5_2oouooulusvmwl2.R.inc(32037);return this;
    }finally{__CLR4_5_2oouooulusvmwl2.R.flushNeeded();}}

    /**
     * Get serializer features serializer feature [].
     *
     * @return the serializer feature []
     * @see FastJsonConfig#getSerializerFeatures()
     * @deprecated
     */
    @Deprecated
    public SerializerFeature[] getSerializerFeatures() {try{__CLR4_5_2oouooulusvmwl2.R.inc(32038);
        __CLR4_5_2oouooulusvmwl2.R.inc(32039);return fastJsonConfig.getSerializerFeatures();
    }finally{__CLR4_5_2oouooulusvmwl2.R.flushNeeded();}}

    /**
     * Sets serializer features.
     *
     * @param features the features
     * @return the serializer features
     * @see FastJsonConfig#setSerializerFeatures(SerializerFeature...)
     * @deprecated
     */
    @Deprecated
    public Retrofit2ConverterFactory setSerializerFeatures(SerializerFeature[] features) {try{__CLR4_5_2oouooulusvmwl2.R.inc(32040);
        __CLR4_5_2oouooulusvmwl2.R.inc(32041);fastJsonConfig.setSerializerFeatures(features);
        __CLR4_5_2oouooulusvmwl2.R.inc(32042);return this;
    }finally{__CLR4_5_2oouooulusvmwl2.R.flushNeeded();}}

    final class ResponseBodyConverter<T> implements Converter<ResponseBody, T> {
        private Type type;

        ResponseBodyConverter(Type type) {try{__CLR4_5_2oouooulusvmwl2.R.inc(32043);
            __CLR4_5_2oouooulusvmwl2.R.inc(32044);this.type = type;
        }finally{__CLR4_5_2oouooulusvmwl2.R.flushNeeded();}}

        public T convert(ResponseBody value) throws IOException {try{__CLR4_5_2oouooulusvmwl2.R.inc(32045);
            __CLR4_5_2oouooulusvmwl2.R.inc(32046);try {
                __CLR4_5_2oouooulusvmwl2.R.inc(32047);return JSON.parseObject(value.bytes()
                        , fastJsonConfig.getCharset()
                        , type
                        , fastJsonConfig.getParserConfig()
                        , fastJsonConfig.getParseProcess()
                        , JSON.DEFAULT_PARSER_FEATURE
                        , fastJsonConfig.getFeatures()
                );
            } catch (Exception e) {
                __CLR4_5_2oouooulusvmwl2.R.inc(32048);throw new IOException("JSON parse error: " + e.getMessage(), e);
            } finally {
                __CLR4_5_2oouooulusvmwl2.R.inc(32049);value.close();
            }
        }finally{__CLR4_5_2oouooulusvmwl2.R.flushNeeded();}}
    }

    final class RequestBodyConverter<T> implements Converter<T, RequestBody> {
        RequestBodyConverter() {try{__CLR4_5_2oouooulusvmwl2.R.inc(32050);
        }finally{__CLR4_5_2oouooulusvmwl2.R.flushNeeded();}}

        public RequestBody convert(T value) throws IOException {try{__CLR4_5_2oouooulusvmwl2.R.inc(32051);
            __CLR4_5_2oouooulusvmwl2.R.inc(32052);try {
                __CLR4_5_2oouooulusvmwl2.R.inc(32053);byte[] content = JSON.toJSONBytes(fastJsonConfig.getCharset()
                        , value
                        , fastJsonConfig.getSerializeConfig()
                        , fastJsonConfig.getSerializeFilters()
                        , fastJsonConfig.getDateFormat()
                        , JSON.DEFAULT_GENERATE_FEATURE
                        , fastJsonConfig.getSerializerFeatures()
                );
                __CLR4_5_2oouooulusvmwl2.R.inc(32054);return RequestBody.create(MEDIA_TYPE, content);
            } catch (Exception e) {
                __CLR4_5_2oouooulusvmwl2.R.inc(32055);throw new IOException("Could not write JSON: " + e.getMessage(), e);
            }
        }finally{__CLR4_5_2oouooulusvmwl2.R.flushNeeded();}}
    }
}
