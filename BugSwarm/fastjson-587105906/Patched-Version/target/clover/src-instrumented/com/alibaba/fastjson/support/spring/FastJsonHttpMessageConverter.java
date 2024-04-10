/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.support.spring;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONPObject;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import org.springframework.core.ResolvableType;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.GenericHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StringUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Fastjson for Spring MVC Converter.
 * <p>
 * Compatible Spring MVC version 3.2+
 *
 * @author VictorZeng
 * @see AbstractHttpMessageConverter
 * @see GenericHttpMessageConverter
 * @since 1.2.10
 * <p>
 * <p>
 * <p>
 * Supported return type:
 * </p>
 * Simple object: Object
 * <p>
 * <p>
 * With property filter :FastJsonContainer[Object]
 * </p>
 * <p>
 * Jsonp :MappingFastJsonValue[Object]
 * </p>
 * Jsonp with property filter: MappingFastJsonValue[FastJsonContainer[Object]]
 */

public class FastJsonHttpMessageConverter extends AbstractHttpMessageConverter<Object>//
        implements GenericHttpMessageConverter<Object> {public static class __CLR4_5_2oqqoqqlusyjnwk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,32238,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final MediaType APPLICATION_JAVASCRIPT = new MediaType("application", "javascript");

    @Deprecated
    protected SerializerFeature[] features = new SerializerFeature[0];

    @Deprecated
    protected SerializeFilter[] filters = new SerializeFilter[0];

    @Deprecated
    protected String dateFormat;

    /**
     * with fastJson config
     */
    private FastJsonConfig fastJsonConfig = new FastJsonConfig();

    /**
     * @return the fastJsonConfig.
     * @since 1.2.11
     */
    public FastJsonConfig getFastJsonConfig() {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32066);
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32067);return fastJsonConfig;
    }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}

    /**
     * @param fastJsonConfig the fastJsonConfig to set.
     * @since 1.2.11
     */
    public void setFastJsonConfig(FastJsonConfig fastJsonConfig) {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32068);
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32069);this.fastJsonConfig = fastJsonConfig;
    }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}

    /**
     * Can serialize/deserialize all types.
     */
    public FastJsonHttpMessageConverter() {

        super(MediaType.ALL);__CLR4_5_2oqqoqqlusyjnwk.R.inc(32071);try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32070);
    }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}

    /**
     * Gets charset.
     *
     * @return the charset
     * @see FastJsonConfig#getCharset()
     * @deprecated
     */
    @Deprecated
    public Charset getCharset() {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32072);
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32073);return this.fastJsonConfig.getCharset();
    }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}

    /**
     * Sets charset.
     *
     * @param charset the charset
     * @see FastJsonConfig#setCharset(Charset)
     * @deprecated
     */
    @Deprecated
    public void setCharset(Charset charset) {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32074);
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32075);this.fastJsonConfig.setCharset(charset);
    }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}

    /**
     * Gets date format.
     *
     * @return the date format
     * @see FastJsonConfig#getDateFormat()
     * @deprecated
     */
    @Deprecated
    public String getDateFormat() {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32076);
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32077);return this.fastJsonConfig.getDateFormat();
    }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}

    /**
     * Sets date format.
     *
     * @param dateFormat the date format
     * @see FastJsonConfig#setDateFormat(String)
     * @deprecated
     */
    @Deprecated
    public void setDateFormat(String dateFormat) {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32078);
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32079);this.fastJsonConfig.setDateFormat(dateFormat);
    }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}

    /**
     * Get features serializer feature [].
     *
     * @return the serializer feature []
     * @see FastJsonConfig#getSerializerFeatures()
     * @deprecated
     */
    @Deprecated
    public SerializerFeature[] getFeatures() {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32080);
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32081);return this.fastJsonConfig.getSerializerFeatures();
    }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}

    /**
     * Sets features.
     *
     * @param features the features
     * @see FastJsonConfig#setSerializerFeatures(SerializerFeature...)
     * @deprecated
     */
    @Deprecated
    public void setFeatures(SerializerFeature... features) {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32082);
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32083);this.fastJsonConfig.setSerializerFeatures(features);
    }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}

    /**
     * Get filters serialize filter [].
     *
     * @return the serialize filter []
     * @see FastJsonConfig#getSerializeFilters()
     * @deprecated
     */
    @Deprecated
    public SerializeFilter[] getFilters() {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32084);
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32085);return this.fastJsonConfig.getSerializeFilters();
    }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}

    /**
     * Sets filters.
     *
     * @param filters the filters
     * @see FastJsonConfig#setSerializeFilters(SerializeFilter...)
     * @deprecated
     */
    @Deprecated
    public void setFilters(SerializeFilter... filters) {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32086);
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32087);this.fastJsonConfig.setSerializeFilters(filters);
    }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}

    /**
     * Add serialize filter.
     *
     * @param filter the filter
     * @see FastJsonConfig#setSerializeFilters(SerializeFilter...)
     * @deprecated
     */
    @Deprecated
    public void addSerializeFilter(SerializeFilter filter) {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32088);
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32089);if ((((filter == null)&&(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32090)!=0|true))||(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32091)==0&false))) {{
            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32092);return;
        }

        }__CLR4_5_2oqqoqqlusyjnwk.R.inc(32093);int length = this.fastJsonConfig.getSerializeFilters().length;
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32094);SerializeFilter[] filters = new SerializeFilter[length + 1];
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32095);System.arraycopy(this.fastJsonConfig.getSerializeFilters(), 0, filters, 0, length);
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32096);filters[filters.length - 1] = filter;
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32097);this.fastJsonConfig.setSerializeFilters(filters);
    }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}

    @Override
    protected boolean supports(Class<?> clazz) {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32098);
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32099);return true;
    }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}


    public boolean canRead(Type type, Class<?> contextClass, MediaType mediaType) {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32100);
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32101);return super.canRead(contextClass, mediaType);
    }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}


    public boolean canWrite(Type type, Class<?> clazz, MediaType mediaType) {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32102);
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32103);return super.canWrite(clazz, mediaType);
    }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}

    /*
     * @see org.springframework.http.converter.GenericHttpMessageConverter#read(java.lang.reflect.Type, java.lang.Class, org.springframework.http.HttpInputMessage)
     */
    public Object read(Type type, //
                       Class<?> contextClass, //
                       HttpInputMessage inputMessage //
    ) throws IOException, HttpMessageNotReadableException {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32104);
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32105);return readType(getType(type, contextClass), inputMessage);
    }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}

    /*
     * @see org.springframework.http.converter.GenericHttpMessageConverter.write
     */
    public void write(Object o, Type type, MediaType contentType, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32106);
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32107);super.write(o, contentType, outputMessage);// support StreamingHttpOutputMessage in spring4.0+
        //writeInternal(o, outputMessage);
    }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}


    /*
     * @see org.springframework.http.converter.AbstractHttpMessageConverter#readInternal(java.lang.Class, org.springframework.http.HttpInputMessage)
     */
    @Override
    protected Object readInternal(Class<? extends Object> clazz, //
                                  HttpInputMessage inputMessage //
    ) throws IOException, HttpMessageNotReadableException {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32108);
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32109);return readType(getType(clazz, null), inputMessage);
    }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}

    private Object readType(Type type, HttpInputMessage inputMessage) {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32110);

        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32111);try {
            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32112);InputStream in = inputMessage.getBody();
            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32113);return JSON.parseObject(in,
                    fastJsonConfig.getCharset(),
                    type,
                    fastJsonConfig.getParserConfig(),
                    fastJsonConfig.getParseProcess(),
                    JSON.DEFAULT_PARSER_FEATURE,
                    fastJsonConfig.getFeatures());
        } catch (JSONException ex) {
            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32114);throw new HttpMessageNotReadableException("JSON parse error: " + ex.getMessage(), ex);
        } catch (IOException ex) {
            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32115);throw new HttpMessageNotReadableException("I/O error while reading input message", ex);
        }
    }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}

    @Override
    protected void writeInternal(Object object, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32116);

        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32117);ByteArrayOutputStream outnew = new ByteArrayOutputStream();
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32118);try {
            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32119);HttpHeaders headers = outputMessage.getHeaders();

            //\u83b7\u53d6\u5168\u5c40\u914d\u7f6e\u7684filter
            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32120);SerializeFilter[] globalFilters = fastJsonConfig.getSerializeFilters();
            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32121);List<SerializeFilter> allFilters = new ArrayList<SerializeFilter>(Arrays.asList(globalFilters));

            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32122);boolean isJsonp = false;

            //\u4e0d\u77e5\u9053\u4e3a\u4ec0\u4e48\u4f1a\u6709\u8fd9\u884c\u4ee3\u7801\uff0c \u4f46\u662f\u4e3a\u4e86\u4fdd\u6301\u548c\u539f\u6765\u7684\u884c\u4e3a\u4e00\u81f4\uff0c\u8fd8\u662f\u4fdd\u7559\u4e0b\u6765
            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32123);Object value = strangeCodeForJackson(object);

            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32124);if ((((value instanceof FastJsonContainer)&&(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32125)!=0|true))||(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32126)==0&false))) {{
                __CLR4_5_2oqqoqqlusyjnwk.R.inc(32127);FastJsonContainer fastJsonContainer = (FastJsonContainer) value;
                __CLR4_5_2oqqoqqlusyjnwk.R.inc(32128);PropertyPreFilters filters = fastJsonContainer.getFilters();
                __CLR4_5_2oqqoqqlusyjnwk.R.inc(32129);allFilters.addAll(filters.getFilters());
                __CLR4_5_2oqqoqqlusyjnwk.R.inc(32130);value = fastJsonContainer.getValue();
            }

            //revise 2017-10-23 ,
            // \u4fdd\u6301\u539f\u6709\u7684MappingFastJsonValue\u5bf9\u8c61\u7684contentType\u4e0d\u505a\u4fee\u6539 \u4fdd\u6301\u65e7\u7248\u517c\u5bb9\u3002
            // \u4f46\u662f\u65b0\u7684JSONPObject\u5c06\u8fd4\u56de\u6807\u51c6\u7684contentType\uff1aapplication/javascript \uff0c\u4e0d\u5bf9\u662f\u5426\u6709function\u8fdb\u884c\u5224\u65ad
            }__CLR4_5_2oqqoqqlusyjnwk.R.inc(32131);if ((((value instanceof MappingFastJsonValue)&&(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32132)!=0|true))||(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32133)==0&false))) {{
                __CLR4_5_2oqqoqqlusyjnwk.R.inc(32134);if ((((!StringUtils.isEmpty(((MappingFastJsonValue) value).getJsonpFunction()))&&(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32135)!=0|true))||(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32136)==0&false))) {{
                    __CLR4_5_2oqqoqqlusyjnwk.R.inc(32137);isJsonp = true;
                }
            }} }else {__CLR4_5_2oqqoqqlusyjnwk.R.inc(32138);if ((((value instanceof JSONPObject)&&(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32139)!=0|true))||(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32140)==0&false))) {{
                __CLR4_5_2oqqoqqlusyjnwk.R.inc(32141);isJsonp = true;
            }


            }}__CLR4_5_2oqqoqqlusyjnwk.R.inc(32142);int len = JSON.writeJSONString(outnew, //
                    fastJsonConfig.getCharset(), //
                    value, //
                    fastJsonConfig.getSerializeConfig(), //
                    //fastJsonConfig.getSerializeFilters(), //
                    allFilters.toArray(new SerializeFilter[allFilters.size()]),
                    fastJsonConfig.getDateFormat(), //
                    JSON.DEFAULT_GENERATE_FEATURE, //
                    fastJsonConfig.getSerializerFeatures());

            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32143);if ((((isJsonp)&&(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32144)!=0|true))||(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32145)==0&false))) {{
                __CLR4_5_2oqqoqqlusyjnwk.R.inc(32146);headers.setContentType(APPLICATION_JAVASCRIPT);
            }

            }__CLR4_5_2oqqoqqlusyjnwk.R.inc(32147);if ((((fastJsonConfig.isWriteContentLength())&&(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32148)!=0|true))||(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32149)==0&false))) {{
                __CLR4_5_2oqqoqqlusyjnwk.R.inc(32150);headers.setContentLength(len);
            }

            }__CLR4_5_2oqqoqqlusyjnwk.R.inc(32151);outnew.writeTo(outputMessage.getBody());

        } catch (JSONException ex) {
            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32152);throw new HttpMessageNotWritableException("Could not write JSON: " + ex.getMessage(), ex);
        } finally {
            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32153);outnew.close();
        }
    }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}

    private Object strangeCodeForJackson(Object obj) {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32154);
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32155);if ((((obj != null)&&(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32156)!=0|true))||(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32157)==0&false))) {{
            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32158);String className = obj.getClass().getName();
            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32159);if (((("com.fasterxml.jackson.databind.node.ObjectNode".equals(className))&&(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32160)!=0|true))||(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32161)==0&false))) {{
                __CLR4_5_2oqqoqqlusyjnwk.R.inc(32162);return obj.toString();
            }
        }}
        }__CLR4_5_2oqqoqqlusyjnwk.R.inc(32163);return obj;
    }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}

    protected Type getType(Type type, Class<?> contextClass) {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32164);
        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32165);if ((((Spring4TypeResolvableHelper.isSupport())&&(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32166)!=0|true))||(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32167)==0&false))) {{
            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32168);return Spring4TypeResolvableHelper.getType(type, contextClass);
        }

        }__CLR4_5_2oqqoqqlusyjnwk.R.inc(32169);return type;
    }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}


    private static class Spring4TypeResolvableHelper {
        private static boolean hasClazzResolvableType;

        static {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32170);
            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32171);try {
                __CLR4_5_2oqqoqqlusyjnwk.R.inc(32172);Class.forName("org.springframework.core.ResolvableType");
                __CLR4_5_2oqqoqqlusyjnwk.R.inc(32173);hasClazzResolvableType = true;
            } catch (ClassNotFoundException e) {
                __CLR4_5_2oqqoqqlusyjnwk.R.inc(32174);hasClazzResolvableType = false;
            }
        }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}

        private static boolean isSupport() {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32175);
            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32176);return hasClazzResolvableType;
        }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}


        private static Type getType(Type type, Class<?> contextClass) {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32177);
            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32178);if ((((contextClass != null)&&(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32179)!=0|true))||(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32180)==0&false))) {{
                __CLR4_5_2oqqoqqlusyjnwk.R.inc(32181);ResolvableType resolvedType = ResolvableType.forType(type);
                __CLR4_5_2oqqoqqlusyjnwk.R.inc(32182);if ((((type instanceof TypeVariable)&&(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32183)!=0|true))||(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32184)==0&false))) {{
                    __CLR4_5_2oqqoqqlusyjnwk.R.inc(32185);ResolvableType resolvedTypeVariable = resolveVariable((TypeVariable) type, ResolvableType.forClass(contextClass));
                    __CLR4_5_2oqqoqqlusyjnwk.R.inc(32186);if ((((resolvedTypeVariable != ResolvableType.NONE)&&(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32187)!=0|true))||(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32188)==0&false))) {{
                        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32189);return resolvedTypeVariable.resolve();
                    }
                }} }else {__CLR4_5_2oqqoqqlusyjnwk.R.inc(32190);if ((((type instanceof ParameterizedType && resolvedType.hasUnresolvableGenerics())&&(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32191)!=0|true))||(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32192)==0&false))) {{
                    __CLR4_5_2oqqoqqlusyjnwk.R.inc(32193);ParameterizedType parameterizedType = (ParameterizedType) type;
                    __CLR4_5_2oqqoqqlusyjnwk.R.inc(32194);Class<?>[] generics = new Class[parameterizedType.getActualTypeArguments().length];
                    __CLR4_5_2oqqoqqlusyjnwk.R.inc(32195);Type[] typeArguments = parameterizedType.getActualTypeArguments();

                    __CLR4_5_2oqqoqqlusyjnwk.R.inc(32196);for (int i = 0; (((i < typeArguments.length)&&(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32197)!=0|true))||(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32198)==0&false)); ++i) {{
                        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32199);Type typeArgument = typeArguments[i];
                        __CLR4_5_2oqqoqqlusyjnwk.R.inc(32200);if ((((typeArgument instanceof TypeVariable)&&(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32201)!=0|true))||(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32202)==0&false))) {{
                            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32203);ResolvableType resolvedTypeArgument = resolveVariable((TypeVariable) typeArgument, ResolvableType.forClass(contextClass));
                            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32204);if ((((resolvedTypeArgument != ResolvableType.NONE)&&(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32205)!=0|true))||(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32206)==0&false))) {{
                                __CLR4_5_2oqqoqqlusyjnwk.R.inc(32207);generics[i] = resolvedTypeArgument.resolve();
                            } }else {{
                                __CLR4_5_2oqqoqqlusyjnwk.R.inc(32208);generics[i] = ResolvableType.forType(typeArgument).resolve();
                            }
                        }} }else {{
                            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32209);generics[i] = ResolvableType.forType(typeArgument).resolve();
                        }
                    }}

                    }__CLR4_5_2oqqoqqlusyjnwk.R.inc(32210);return ResolvableType.forClassWithGenerics(resolvedType.getRawClass(), generics).getType();
                }
            }}}

            }__CLR4_5_2oqqoqqlusyjnwk.R.inc(32211);return type;
        }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}

        private static ResolvableType resolveVariable(TypeVariable<?> typeVariable, ResolvableType contextType) {try{__CLR4_5_2oqqoqqlusyjnwk.R.inc(32212);
            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32213);ResolvableType resolvedType;
            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32214);if ((((contextType.hasGenerics())&&(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32215)!=0|true))||(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32216)==0&false))) {{
                __CLR4_5_2oqqoqqlusyjnwk.R.inc(32217);resolvedType = ResolvableType.forType(typeVariable, contextType);
                __CLR4_5_2oqqoqqlusyjnwk.R.inc(32218);if ((((resolvedType.resolve() != null)&&(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32219)!=0|true))||(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32220)==0&false))) {{
                    __CLR4_5_2oqqoqqlusyjnwk.R.inc(32221);return resolvedType;
                }
            }}

            }__CLR4_5_2oqqoqqlusyjnwk.R.inc(32222);ResolvableType superType = contextType.getSuperType();
            __CLR4_5_2oqqoqqlusyjnwk.R.inc(32223);if ((((superType != ResolvableType.NONE)&&(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32224)!=0|true))||(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32225)==0&false))) {{
                __CLR4_5_2oqqoqqlusyjnwk.R.inc(32226);resolvedType = resolveVariable(typeVariable, superType);
                __CLR4_5_2oqqoqqlusyjnwk.R.inc(32227);if ((((resolvedType.resolve() != null)&&(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32228)!=0|true))||(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32229)==0&false))) {{
                    __CLR4_5_2oqqoqqlusyjnwk.R.inc(32230);return resolvedType;
                }
            }}
            }__CLR4_5_2oqqoqqlusyjnwk.R.inc(32231);for (ResolvableType ifc : contextType.getInterfaces()) {{
                __CLR4_5_2oqqoqqlusyjnwk.R.inc(32232);resolvedType = resolveVariable(typeVariable, ifc);
                __CLR4_5_2oqqoqqlusyjnwk.R.inc(32233);if ((((resolvedType.resolve() != null)&&(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32234)!=0|true))||(__CLR4_5_2oqqoqqlusyjnwk.R.iget(32235)==0&false))) {{
                    __CLR4_5_2oqqoqqlusyjnwk.R.inc(32236);return resolvedType;
                }
            }}
            }__CLR4_5_2oqqoqqlusyjnwk.R.inc(32237);return ResolvableType.NONE;
        }finally{__CLR4_5_2oqqoqqlusyjnwk.R.flushNeeded();}}
    }


}
