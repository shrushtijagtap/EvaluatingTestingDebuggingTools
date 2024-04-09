/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.support.jaxrs;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.*;
import javax.ws.rs.ext.*;
import java.io.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Fastjson for JAX-RS Provider.
 *
 * @author smallnest
 * @author VictorZeng
 * @see MessageBodyReader
 * @see MessageBodyWriter
 * @since 1.2.9
 */

@Provider
@Consumes({MediaType.WILDCARD})
@Produces({MediaType.WILDCARD})
public class FastJsonProvider //
        implements MessageBodyReader<Object>, MessageBodyWriter<Object> {public static class __CLR4_1_10oknoknlusqjn5m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,31967,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * These are classes that we never use for reading
     * (never try to deserialize instances of these types).
     */
    public final static Class<?>[] DEFAULT_UNREADABLES = new Class<?>[]{
            InputStream.class, Reader.class
    };

    /**
     * These are classes that we never use for writing
     * (never try to serialize instances of these types).
     */
    public final static Class<?>[] DEFAULT_UNWRITABLES = new Class<?>[]{
            InputStream.class,
            OutputStream.class, Writer.class,
            StreamingOutput.class, Response.class
    };

    @Deprecated
    protected Charset charset = Charset.forName("UTF-8");

    @Deprecated
    protected SerializerFeature[] features = new SerializerFeature[0];

    @Deprecated
    protected SerializeFilter[] filters = new SerializeFilter[0];

    @Deprecated
    protected String dateFormat;

    /**
     * Injectable context object used to locate configured
     * instance of {@link FastJsonConfig} to use for actual
     * serialization.
     */
    @Context
    protected Providers providers;

    /**
     * with fastJson config
     */
    private FastJsonConfig fastJsonConfig = new FastJsonConfig();

    /**
     * allow serialize/deserialize types in clazzes
     */
    private Class<?>[] clazzes = null;

    /**
     * whether set PrettyFormat while exec WriteTo()
     */
    private boolean pretty;


    /**
     * @return the fastJsonConfig.
     * @since 1.2.11
     */
    public FastJsonConfig getFastJsonConfig() {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31847);
        __CLR4_1_10oknoknlusqjn5m.R.inc(31848);return fastJsonConfig;
    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

    /**
     * @param fastJsonConfig the fastJsonConfig to set.
     * @since 1.2.11
     */
    public void setFastJsonConfig(FastJsonConfig fastJsonConfig) {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31849);
        __CLR4_1_10oknoknlusqjn5m.R.inc(31850);this.fastJsonConfig = fastJsonConfig;
    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

    /**
     * Can serialize/deserialize all types.
     */
    public FastJsonProvider() {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31851);

    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

    /**
     * Only serialize/deserialize all types in clazzes.
     */
    public FastJsonProvider(Class<?>[] clazzes) {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31852);
        __CLR4_1_10oknoknlusqjn5m.R.inc(31853);this.clazzes = clazzes;
    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

    /**
     * Set pretty format
     */
    public FastJsonProvider setPretty(boolean p) {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31854);
        __CLR4_1_10oknoknlusqjn5m.R.inc(31855);this.pretty = p;
        __CLR4_1_10oknoknlusqjn5m.R.inc(31856);return this;
    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

    /**
     * Instantiates a new Fast json provider.
     *
     * @param charset the charset
     * @see FastJsonConfig#setCharset(Charset)
     * @deprecated
     */
    @Deprecated
    public FastJsonProvider(String charset) {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31857);
        __CLR4_1_10oknoknlusqjn5m.R.inc(31858);this.fastJsonConfig.setCharset(Charset.forName(charset));
    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

    /**
     * Gets charset.
     *
     * @return the charset
     * @see FastJsonConfig#getCharset()
     * @deprecated
     */
    @Deprecated
    public Charset getCharset() {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31859);
        __CLR4_1_10oknoknlusqjn5m.R.inc(31860);return this.fastJsonConfig.getCharset();
    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

    /**
     * Sets charset.
     *
     * @param charset the charset
     * @see FastJsonConfig#setCharset(Charset)
     * @deprecated
     */
    @Deprecated
    public void setCharset(Charset charset) {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31861);
        __CLR4_1_10oknoknlusqjn5m.R.inc(31862);this.fastJsonConfig.setCharset(charset);
    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

    /**
     * Gets date format.
     *
     * @return the date format
     * @see FastJsonConfig#getDateFormat()
     * @deprecated
     */
    @Deprecated
    public String getDateFormat() {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31863);
        __CLR4_1_10oknoknlusqjn5m.R.inc(31864);return this.fastJsonConfig.getDateFormat();
    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

    /**
     * Sets date format.
     *
     * @param dateFormat the date format
     * @see FastJsonConfig#setDateFormat(String)
     * @deprecated
     */
    @Deprecated
    public void setDateFormat(String dateFormat) {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31865);
        __CLR4_1_10oknoknlusqjn5m.R.inc(31866);this.fastJsonConfig.setDateFormat(dateFormat);
    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

    /**
     * Get features serializer feature [].
     *
     * @return the serializer feature []
     * @see FastJsonConfig#getFeatures()
     * @deprecated
     */
    @Deprecated
    public SerializerFeature[] getFeatures() {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31867);
        __CLR4_1_10oknoknlusqjn5m.R.inc(31868);return this.fastJsonConfig.getSerializerFeatures();
    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

    /**
     * Sets features.
     *
     * @param features the features
     * @see FastJsonConfig#setFeatures(Feature...)
     * @deprecated
     */
    @Deprecated
    public void setFeatures(SerializerFeature... features) {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31869);
        __CLR4_1_10oknoknlusqjn5m.R.inc(31870);this.fastJsonConfig.setSerializerFeatures(features);
    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

    /**
     * Get filters serialize filter [].
     *
     * @return the serialize filter []
     * @see FastJsonConfig#getSerializeFilters()
     * @deprecated
     */
    @Deprecated
    public SerializeFilter[] getFilters() {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31871);
        __CLR4_1_10oknoknlusqjn5m.R.inc(31872);return this.fastJsonConfig.getSerializeFilters();
    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

    /**
     * Sets filters.
     *
     * @param filters the filters
     * @see FastJsonConfig#setSerializeFilters(SerializeFilter...)
     * @deprecated
     */
    @Deprecated
    public void setFilters(SerializeFilter... filters) {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31873);
        __CLR4_1_10oknoknlusqjn5m.R.inc(31874);this.fastJsonConfig.setSerializeFilters(filters);
    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

    /**
     * Check some are interface/abstract classes to exclude.
     *
     * @param type    the type
     * @param classes the classes
     * @return the boolean
     */
    protected boolean isAssignableFrom(Class<?> type, Class<?>[] classes) {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31875);

        __CLR4_1_10oknoknlusqjn5m.R.inc(31876);if ((((type == null)&&(__CLR4_1_10oknoknlusqjn5m.R.iget(31877)!=0|true))||(__CLR4_1_10oknoknlusqjn5m.R.iget(31878)==0&false)))
            {__CLR4_1_10oknoknlusqjn5m.R.inc(31879);return false;

        //  there are some other abstract/interface types to exclude too:
        }__CLR4_1_10oknoknlusqjn5m.R.inc(31880);for (Class<?> cls : classes) {{
            __CLR4_1_10oknoknlusqjn5m.R.inc(31881);if ((((cls.isAssignableFrom(type))&&(__CLR4_1_10oknoknlusqjn5m.R.iget(31882)!=0|true))||(__CLR4_1_10oknoknlusqjn5m.R.iget(31883)==0&false))) {{
                __CLR4_1_10oknoknlusqjn5m.R.inc(31884);return false;
            }
        }}

        }__CLR4_1_10oknoknlusqjn5m.R.inc(31885);return true;
    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

    /**
     * Check whether a class can be serialized or deserialized. It can check
     * based on packages, annotations on entities or explicit classes.
     *
     * @param type class need to check
     * @return true if valid
     */
    protected boolean isValidType(Class<?> type, Annotation[] classAnnotations) {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31886);
        __CLR4_1_10oknoknlusqjn5m.R.inc(31887);if ((((type == null)&&(__CLR4_1_10oknoknlusqjn5m.R.iget(31888)!=0|true))||(__CLR4_1_10oknoknlusqjn5m.R.iget(31889)==0&false)))
            {__CLR4_1_10oknoknlusqjn5m.R.inc(31890);return false;

        }__CLR4_1_10oknoknlusqjn5m.R.inc(31891);if ((((clazzes != null)&&(__CLR4_1_10oknoknlusqjn5m.R.iget(31892)!=0|true))||(__CLR4_1_10oknoknlusqjn5m.R.iget(31893)==0&false))) {{
            __CLR4_1_10oknoknlusqjn5m.R.inc(31894);for (Class<?> cls : clazzes) {{ // must strictly equal. Don't check
                // inheritance
                __CLR4_1_10oknoknlusqjn5m.R.inc(31895);if ((((cls == type)&&(__CLR4_1_10oknoknlusqjn5m.R.iget(31896)!=0|true))||(__CLR4_1_10oknoknlusqjn5m.R.iget(31897)==0&false)))
                    {__CLR4_1_10oknoknlusqjn5m.R.inc(31898);return true;
            }}

            }__CLR4_1_10oknoknlusqjn5m.R.inc(31899);return false;
        }

        }__CLR4_1_10oknoknlusqjn5m.R.inc(31900);return true;
    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

    /**
     * Check media type like "application/json".
     *
     * @param mediaType media type
     * @return true if the media type is valid
     */
    protected boolean hasMatchingMediaType(MediaType mediaType) {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31901);
        __CLR4_1_10oknoknlusqjn5m.R.inc(31902);if ((((mediaType != null)&&(__CLR4_1_10oknoknlusqjn5m.R.iget(31903)!=0|true))||(__CLR4_1_10oknoknlusqjn5m.R.iget(31904)==0&false))) {{
            __CLR4_1_10oknoknlusqjn5m.R.inc(31905);String subtype = mediaType.getSubtype();

            __CLR4_1_10oknoknlusqjn5m.R.inc(31906);return (("json".equalsIgnoreCase(subtype)) //
                    || (subtype.endsWith("+json")) //
                    || ("javascript".equals(subtype)) //
                    || ("x-javascript".equals(subtype)) //
                    || ("x-json".equals(subtype)) //
                    || ("x-www-form-urlencoded".equalsIgnoreCase(subtype)) //
                    || (subtype.endsWith("x-www-form-urlencoded")));
        }
        }__CLR4_1_10oknoknlusqjn5m.R.inc(31907);return true;
    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

    /**
     * Method that JAX-RS container calls to try to check whether given value
     * (of specified type) can be serialized by this provider.
     */
    public boolean isWriteable(Class<?> type, //
                               Type genericType, //
                               Annotation[] annotations, //
                               MediaType mediaType) {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31908);
        __CLR4_1_10oknoknlusqjn5m.R.inc(31909);if ((((!hasMatchingMediaType(mediaType))&&(__CLR4_1_10oknoknlusqjn5m.R.iget(31910)!=0|true))||(__CLR4_1_10oknoknlusqjn5m.R.iget(31911)==0&false))) {{
            __CLR4_1_10oknoknlusqjn5m.R.inc(31912);return false;
        }

        }__CLR4_1_10oknoknlusqjn5m.R.inc(31913);if ((((!isAssignableFrom(type, DEFAULT_UNWRITABLES))&&(__CLR4_1_10oknoknlusqjn5m.R.iget(31914)!=0|true))||(__CLR4_1_10oknoknlusqjn5m.R.iget(31915)==0&false)))
            {__CLR4_1_10oknoknlusqjn5m.R.inc(31916);return false;

        }__CLR4_1_10oknoknlusqjn5m.R.inc(31917);return isValidType(type, annotations);
    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

    /**
     * Method that JAX-RS container calls to try to figure out serialized length
     * of given value. always return -1 to denote "not known".
     */
    public long getSize(Object t, //
                        Class<?> type, //
                        Type genericType, //
                        Annotation[] annotations, //
                        MediaType mediaType) {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31918);
        __CLR4_1_10oknoknlusqjn5m.R.inc(31919);return -1;
    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

    /**
     * Method that JAX-RS container calls to serialize given value.
     */
    public void writeTo(Object obj, //
                        Class<?> type, //
                        Type genericType, //
                        Annotation[] annotations, //
                        MediaType mediaType, //
                        MultivaluedMap<String, Object> httpHeaders, //
                        OutputStream entityStream //
    ) throws IOException, WebApplicationException {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31920);

        __CLR4_1_10oknoknlusqjn5m.R.inc(31921);FastJsonConfig fastJsonConfig = locateConfigProvider(type, mediaType);

        __CLR4_1_10oknoknlusqjn5m.R.inc(31922);SerializerFeature[] serializerFeatures = fastJsonConfig.getSerializerFeatures();

        __CLR4_1_10oknoknlusqjn5m.R.inc(31923);if ((((pretty)&&(__CLR4_1_10oknoknlusqjn5m.R.iget(31924)!=0|true))||(__CLR4_1_10oknoknlusqjn5m.R.iget(31925)==0&false))) {{
            __CLR4_1_10oknoknlusqjn5m.R.inc(31926);if ((((serializerFeatures == null)&&(__CLR4_1_10oknoknlusqjn5m.R.iget(31927)!=0|true))||(__CLR4_1_10oknoknlusqjn5m.R.iget(31928)==0&false)))
                {__CLR4_1_10oknoknlusqjn5m.R.inc(31929);serializerFeatures = new SerializerFeature[]{SerializerFeature.PrettyFormat};
            }else {{
                __CLR4_1_10oknoknlusqjn5m.R.inc(31930);List<SerializerFeature> featureList = new ArrayList<SerializerFeature>(Arrays.asList(serializerFeatures));
                __CLR4_1_10oknoknlusqjn5m.R.inc(31931);featureList.add(SerializerFeature.PrettyFormat);
                __CLR4_1_10oknoknlusqjn5m.R.inc(31932);serializerFeatures = featureList.toArray(serializerFeatures);
            }
            }__CLR4_1_10oknoknlusqjn5m.R.inc(31933);fastJsonConfig.setSerializerFeatures(serializerFeatures);
        }

        }__CLR4_1_10oknoknlusqjn5m.R.inc(31934);try {
            __CLR4_1_10oknoknlusqjn5m.R.inc(31935);JSON.writeJSONString(entityStream, //
                    fastJsonConfig.getCharset(), //
                    obj, //
                    fastJsonConfig.getSerializeConfig(), //
                    fastJsonConfig.getSerializeFilters(), //
                    fastJsonConfig.getDateFormat(), //
                    JSON.DEFAULT_GENERATE_FEATURE, //
                    fastJsonConfig.getSerializerFeatures());

            __CLR4_1_10oknoknlusqjn5m.R.inc(31936);entityStream.flush();

        } catch (JSONException ex) {

            __CLR4_1_10oknoknlusqjn5m.R.inc(31937);throw new WebApplicationException(ex);
        }
    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

    /**
     * Method that JAX-RS container calls to try to check whether values of
     * given type (and media type) can be deserialized by this provider.
     */
    public boolean isReadable(Class<?> type, //
                              Type genericType, //
                              Annotation[] annotations, //
                              MediaType mediaType) {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31938);

        __CLR4_1_10oknoknlusqjn5m.R.inc(31939);if ((((!hasMatchingMediaType(mediaType))&&(__CLR4_1_10oknoknlusqjn5m.R.iget(31940)!=0|true))||(__CLR4_1_10oknoknlusqjn5m.R.iget(31941)==0&false))) {{
            __CLR4_1_10oknoknlusqjn5m.R.inc(31942);return false;
        }

        }__CLR4_1_10oknoknlusqjn5m.R.inc(31943);if ((((!isAssignableFrom(type, DEFAULT_UNREADABLES))&&(__CLR4_1_10oknoknlusqjn5m.R.iget(31944)!=0|true))||(__CLR4_1_10oknoknlusqjn5m.R.iget(31945)==0&false)))
            {__CLR4_1_10oknoknlusqjn5m.R.inc(31946);return false;

        }__CLR4_1_10oknoknlusqjn5m.R.inc(31947);return isValidType(type, annotations);
    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

    /**
     * Method that JAX-RS container calls to deserialize given value.
     */
    public Object readFrom(Class<Object> type, //
                           Type genericType, //
                           Annotation[] annotations, //
                           MediaType mediaType, //
                           MultivaluedMap<String, String> httpHeaders, //
                           InputStream entityStream) throws IOException, WebApplicationException {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31948);

        __CLR4_1_10oknoknlusqjn5m.R.inc(31949);try {
            __CLR4_1_10oknoknlusqjn5m.R.inc(31950);FastJsonConfig fastJsonConfig = locateConfigProvider(type, mediaType);

            __CLR4_1_10oknoknlusqjn5m.R.inc(31951);return JSON.parseObject(entityStream,
                    fastJsonConfig.getCharset(),
                    genericType,
                    fastJsonConfig.getParserConfig(),
                    fastJsonConfig.getParseProcess(),
                    JSON.DEFAULT_PARSER_FEATURE,
                    fastJsonConfig.getFeatures());

        } catch (JSONException ex) {

            __CLR4_1_10oknoknlusqjn5m.R.inc(31952);throw new WebApplicationException(ex);
        }
    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

    /**
     * Helper method that is called if no config has been explicitly configured.
     */
    protected FastJsonConfig locateConfigProvider(Class<?> type, MediaType mediaType) {try{__CLR4_1_10oknoknlusqjn5m.R.inc(31953);

        __CLR4_1_10oknoknlusqjn5m.R.inc(31954);if ((((providers != null)&&(__CLR4_1_10oknoknlusqjn5m.R.iget(31955)!=0|true))||(__CLR4_1_10oknoknlusqjn5m.R.iget(31956)==0&false))) {{

            __CLR4_1_10oknoknlusqjn5m.R.inc(31957);ContextResolver<FastJsonConfig> resolver = providers.getContextResolver(FastJsonConfig.class, mediaType);

            __CLR4_1_10oknoknlusqjn5m.R.inc(31958);if ((((resolver == null)&&(__CLR4_1_10oknoknlusqjn5m.R.iget(31959)!=0|true))||(__CLR4_1_10oknoknlusqjn5m.R.iget(31960)==0&false))) {{

                __CLR4_1_10oknoknlusqjn5m.R.inc(31961);resolver = providers.getContextResolver(FastJsonConfig.class, null);
            }

            }__CLR4_1_10oknoknlusqjn5m.R.inc(31962);if ((((resolver != null)&&(__CLR4_1_10oknoknlusqjn5m.R.iget(31963)!=0|true))||(__CLR4_1_10oknoknlusqjn5m.R.iget(31964)==0&false))) {{

                __CLR4_1_10oknoknlusqjn5m.R.inc(31965);return resolver.getContext(type);
            }
        }}

        }__CLR4_1_10oknoknlusqjn5m.R.inc(31966);return fastJsonConfig;
    }finally{__CLR4_1_10oknoknlusqjn5m.R.flushNeeded();}}

}
