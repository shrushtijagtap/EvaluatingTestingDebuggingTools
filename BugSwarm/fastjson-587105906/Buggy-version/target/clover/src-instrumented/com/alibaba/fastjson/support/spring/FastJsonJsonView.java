/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.support.spring;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONPObject;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.util.IOUtils;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.view.AbstractView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Fastjson for Spring MVC View.
 *
 * @author libinsong1204@gmail.com
 * @author VictorZeng
 * @see AbstractView
 * @since 1.2.9
 */

public class FastJsonJsonView extends AbstractView {public static class __CLR4_1_10ovwovwluszw0g7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,32358,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    /**
     * default content type
     */
    public static final String DEFAULT_CONTENT_TYPE = "application/json;charset=UTF-8";

    /**
     * Default content type for JSONP: "application/javascript".
     */
    public static final String DEFAULT_JSONP_CONTENT_TYPE = "application/javascript";

    /**
     * Pattern for validating jsonp callback parameter values.
     */
    private static final Pattern CALLBACK_PARAM_PATTERN = Pattern.compile("[0-9A-Za-z_\\.]*");

    @Deprecated
    protected Charset charset = Charset.forName("UTF-8");

    @Deprecated
    protected SerializerFeature[] features = new SerializerFeature[0];

    @Deprecated
    protected SerializeFilter[] filters = new SerializeFilter[0];

    @Deprecated
    protected String dateFormat;

    /**
     * renderedAttributes
     */
    private Set<String> renderedAttributes;

    /**
     * disableCaching
     */
    private boolean disableCaching = true;

    /**
     * updateContentLength
     */
    private boolean updateContentLength = true;

    /**
     * extractValueFromSingleKeyModel
     */
    private boolean extractValueFromSingleKeyModel = false;

    /**
     * with fastJson config
     */
    private FastJsonConfig fastJsonConfig = new FastJsonConfig();

    /**
     * jsonp parameter name
     */
    private String[] jsonpParameterNames = {"jsonp", "callback"};

    /**
     * Set default param.
     */
    public FastJsonJsonView() {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32252);

        __CLR4_1_10ovwovwluszw0g7.R.inc(32253);setContentType(DEFAULT_CONTENT_TYPE);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32254);setExposePathVariables(false);
    }finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}

    /**
     * @return the fastJsonConfig.
     * @since 1.2.11
     */
    public FastJsonConfig getFastJsonConfig() {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32255);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32256);return fastJsonConfig;
    }finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}

    /**
     * @param fastJsonConfig the fastJsonConfig to set.
     * @since 1.2.11
     */
    public void setFastJsonConfig(FastJsonConfig fastJsonConfig) {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32257);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32258);this.fastJsonConfig = fastJsonConfig;
    }finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}

    /**
     * Sets serializer feature.
     *
     * @param features the features
     * @see FastJsonConfig#setSerializerFeatures(SerializerFeature...)
     * @deprecated
     */
    @Deprecated
    public void setSerializerFeature(SerializerFeature... features) {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32259);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32260);this.fastJsonConfig.setSerializerFeatures(features);
    }finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}

    /**
     * Gets charset.
     *
     * @return the charset
     * @see FastJsonConfig#getCharset()
     * @deprecated
     */
    @Deprecated
    public Charset getCharset() {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32261);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32262);return this.fastJsonConfig.getCharset();
    }finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}

    /**
     * Sets charset.
     *
     * @param charset the charset
     * @see FastJsonConfig#setCharset(Charset)
     * @deprecated
     */
    @Deprecated
    public void setCharset(Charset charset) {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32263);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32264);this.fastJsonConfig.setCharset(charset);
    }finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}

    /**
     * Gets date format.
     *
     * @return the date format
     * @see FastJsonConfig#getDateFormat()
     * @deprecated
     */
    @Deprecated
    public String getDateFormat() {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32265);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32266);return this.fastJsonConfig.getDateFormat();
    }finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}

    /**
     * Sets date format.
     *
     * @param dateFormat the date format
     * @see FastJsonConfig#setDateFormat(String)
     * @deprecated
     */
    @Deprecated
    public void setDateFormat(String dateFormat) {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32267);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32268);this.fastJsonConfig.setDateFormat(dateFormat);
    }finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}

    /**
     * Get features serializer feature [].
     *
     * @return the serializer feature []
     * @see FastJsonConfig#getSerializerFeatures()
     * @deprecated
     */
    @Deprecated
    public SerializerFeature[] getFeatures() {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32269);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32270);return this.fastJsonConfig.getSerializerFeatures();
    }finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}

    /**
     * Sets features.
     *
     * @param features the features
     * @see FastJsonConfig#setSerializerFeatures(SerializerFeature...)
     * @deprecated
     */
    @Deprecated
    public void setFeatures(SerializerFeature... features) {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32271);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32272);this.fastJsonConfig.setSerializerFeatures(features);
    }finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}

    /**
     * Get filters serialize filter [].
     *
     * @return the serialize filter []
     * @see FastJsonConfig#getSerializeFilters()
     * @deprecated
     */
    @Deprecated
    public SerializeFilter[] getFilters() {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32273);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32274);return this.fastJsonConfig.getSerializeFilters();
    }finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}

    /**
     * Sets filters.
     *
     * @param filters the filters
     * @see FastJsonConfig#setSerializeFilters(SerializeFilter...)
     * @deprecated
     */
    @Deprecated
    public void setFilters(SerializeFilter... filters) {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32275);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32276);this.fastJsonConfig.setSerializeFilters(filters);
    }finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}

    /**
     * Set renderedAttributes.
     *
     * @param renderedAttributes renderedAttributes
     */
    public void setRenderedAttributes(Set<String> renderedAttributes) {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32277);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32278);this.renderedAttributes = renderedAttributes;
    }finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}

    /**
     * Check extractValueFromSingleKeyModel.
     *
     * @return extractValueFromSingleKeyModel
     */
    public boolean isExtractValueFromSingleKeyModel() {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32279);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32280);return extractValueFromSingleKeyModel;
    }finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}

    /**
     * Set extractValueFromSingleKeyModel.
     *
     * @param extractValueFromSingleKeyModel
     */
    public void setExtractValueFromSingleKeyModel(boolean extractValueFromSingleKeyModel) {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32281);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32282);this.extractValueFromSingleKeyModel = extractValueFromSingleKeyModel;
    }finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}

    /**
     * Set JSONP request parameter names. Each time a request has one of those
     * parameters, the resulting JSON will be wrapped into a function named as
     * specified by the JSONP request parameter value.
     * <p>The parameter names configured by default are "jsonp" and "callback".
     *
     * @see <a href="http://en.wikipedia.org/wiki/JSONP">JSONP Wikipedia article</a>
     * @since 4.1
     */
    public void setJsonpParameterNames(Set<String> jsonpParameterNames) {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32283);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32284);Assert.notEmpty(jsonpParameterNames, "jsonpParameterName cannot be empty");
        __CLR4_1_10ovwovwluszw0g7.R.inc(32285);this.jsonpParameterNames = jsonpParameterNames.toArray(new String[jsonpParameterNames.size()]);
    }finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}


    private String getJsonpParameterValue(HttpServletRequest request) {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32286);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32287);if ((((this.jsonpParameterNames != null)&&(__CLR4_1_10ovwovwluszw0g7.R.iget(32288)!=0|true))||(__CLR4_1_10ovwovwluszw0g7.R.iget(32289)==0&false))) {{
            __CLR4_1_10ovwovwluszw0g7.R.inc(32290);for (String name : this.jsonpParameterNames) {{
                __CLR4_1_10ovwovwluszw0g7.R.inc(32291);String value = request.getParameter(name);

                __CLR4_1_10ovwovwluszw0g7.R.inc(32292);if ((((IOUtils.isValidJsonpQueryParam(value))&&(__CLR4_1_10ovwovwluszw0g7.R.iget(32293)!=0|true))||(__CLR4_1_10ovwovwluszw0g7.R.iget(32294)==0&false))) {{
                    __CLR4_1_10ovwovwluszw0g7.R.inc(32295);return value;
                }

                }__CLR4_1_10ovwovwluszw0g7.R.inc(32296);if ((((logger.isDebugEnabled())&&(__CLR4_1_10ovwovwluszw0g7.R.iget(32297)!=0|true))||(__CLR4_1_10ovwovwluszw0g7.R.iget(32298)==0&false))) {{
                    __CLR4_1_10ovwovwluszw0g7.R.inc(32299);logger.debug("Ignoring invalid jsonp parameter value: " + value);
                }
            }}
        }}
        }__CLR4_1_10ovwovwluszw0g7.R.inc(32300);return null;
    }finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}


    @Override
    protected void renderMergedOutputModel(Map<String, Object> model, //
                                           HttpServletRequest request, //
                                           HttpServletResponse response) throws Exception {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32301);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32302);Object value = filterModel(model);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32303);String jsonpParameterValue = getJsonpParameterValue(request);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32304);if ((((jsonpParameterValue != null)&&(__CLR4_1_10ovwovwluszw0g7.R.iget(32305)!=0|true))||(__CLR4_1_10ovwovwluszw0g7.R.iget(32306)==0&false))) {{
            __CLR4_1_10ovwovwluszw0g7.R.inc(32307);JSONPObject jsonpObject = new JSONPObject(jsonpParameterValue);
            __CLR4_1_10ovwovwluszw0g7.R.inc(32308);jsonpObject.addParameter(value);
            __CLR4_1_10ovwovwluszw0g7.R.inc(32309);value = jsonpObject;
        }

        }__CLR4_1_10ovwovwluszw0g7.R.inc(32310);ByteArrayOutputStream outnew = new ByteArrayOutputStream();

        __CLR4_1_10ovwovwluszw0g7.R.inc(32311);int len = JSON.writeJSONString(outnew, //
                fastJsonConfig.getCharset(), //
                value, //
                fastJsonConfig.getSerializeConfig(), //
                fastJsonConfig.getSerializeFilters(), //
                fastJsonConfig.getDateFormat(), //
                JSON.DEFAULT_GENERATE_FEATURE, //
                fastJsonConfig.getSerializerFeatures());

        __CLR4_1_10ovwovwluszw0g7.R.inc(32312);if ((((this.updateContentLength)&&(__CLR4_1_10ovwovwluszw0g7.R.iget(32313)!=0|true))||(__CLR4_1_10ovwovwluszw0g7.R.iget(32314)==0&false))) {{
            // Write content length (determined via byte array).
            __CLR4_1_10ovwovwluszw0g7.R.inc(32315);response.setContentLength(len);
        }

        // Flush byte array to servlet output stream.
        }__CLR4_1_10ovwovwluszw0g7.R.inc(32316);ServletOutputStream out = response.getOutputStream();
        __CLR4_1_10ovwovwluszw0g7.R.inc(32317);outnew.writeTo(out);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32318);outnew.close();
        __CLR4_1_10ovwovwluszw0g7.R.inc(32319);out.flush();
    }finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}

    @Override
    protected void prepareResponse(HttpServletRequest request, //
                                   HttpServletResponse response) {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32320);

        __CLR4_1_10ovwovwluszw0g7.R.inc(32321);setResponseContentType(request, response);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32322);response.setCharacterEncoding(fastJsonConfig.getCharset().name());
        __CLR4_1_10ovwovwluszw0g7.R.inc(32323);if ((((this.disableCaching)&&(__CLR4_1_10ovwovwluszw0g7.R.iget(32324)!=0|true))||(__CLR4_1_10ovwovwluszw0g7.R.iget(32325)==0&false))) {{
            __CLR4_1_10ovwovwluszw0g7.R.inc(32326);response.addHeader("Pragma", "no-cache");
            __CLR4_1_10ovwovwluszw0g7.R.inc(32327);response.addHeader("Cache-Control", "no-cache, no-store, max-age=0");
            __CLR4_1_10ovwovwluszw0g7.R.inc(32328);response.addDateHeader("Expires", 1L);
        }
    }}finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}

    /**
     * Disables caching of the generated JSON.
     * <p>
     * Default is {@code true}, which will prevent the client from caching the
     * generated JSON.
     */
    public void setDisableCaching(boolean disableCaching) {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32329);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32330);this.disableCaching = disableCaching;
    }finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}

    /**
     * Whether to update the 'Content-Length' header of the response. When set
     * to {@code true}, the response is buffered in order to determine the
     * content length and set the 'Content-Length' header of the response.
     * <p>
     * The default setting is {@code false}.
     */
    public void setUpdateContentLength(boolean updateContentLength) {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32331);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32332);this.updateContentLength = updateContentLength;
    }finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}

    /**
     * Filters out undesired attributes from the given model. The return value
     * can be either another {@link Map}, or a single value object.
     * <p>
     * Default implementation removes {@link BindingResult} instances and
     * entries not included in the {@link #setRenderedAttributes(Set)
     * renderedAttributes} property.
     *
     * @param model the model, as passed on to {@link #renderMergedOutputModel}
     * @return the object to be rendered
     */
    protected Object filterModel(Map<String, Object> model) {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32333);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32334);Map<String, Object> result = new HashMap<String, Object>(model.size());
        __CLR4_1_10ovwovwluszw0g7.R.inc(32335);Set<String> renderedAttributes = (((!CollectionUtils.isEmpty(this.renderedAttributes) )&&(__CLR4_1_10ovwovwluszw0g7.R.iget(32336)!=0|true))||(__CLR4_1_10ovwovwluszw0g7.R.iget(32337)==0&false))? //
                this.renderedAttributes //
                : model.keySet();

        __CLR4_1_10ovwovwluszw0g7.R.inc(32338);for (Map.Entry<String, Object> entry : model.entrySet()) {{
            __CLR4_1_10ovwovwluszw0g7.R.inc(32339);if ((((!(entry.getValue() instanceof BindingResult)
                    && renderedAttributes.contains(entry.getKey()))&&(__CLR4_1_10ovwovwluszw0g7.R.iget(32340)!=0|true))||(__CLR4_1_10ovwovwluszw0g7.R.iget(32341)==0&false))) {{
                __CLR4_1_10ovwovwluszw0g7.R.inc(32342);result.put(entry.getKey(), entry.getValue());
            }
        }}
        }__CLR4_1_10ovwovwluszw0g7.R.inc(32343);if ((((extractValueFromSingleKeyModel)&&(__CLR4_1_10ovwovwluszw0g7.R.iget(32344)!=0|true))||(__CLR4_1_10ovwovwluszw0g7.R.iget(32345)==0&false))) {{
            __CLR4_1_10ovwovwluszw0g7.R.inc(32346);if ((((result.size() == 1)&&(__CLR4_1_10ovwovwluszw0g7.R.iget(32347)!=0|true))||(__CLR4_1_10ovwovwluszw0g7.R.iget(32348)==0&false))) {{
                __CLR4_1_10ovwovwluszw0g7.R.inc(32349);for (Map.Entry<String, Object> entry : result.entrySet()) {{
                    __CLR4_1_10ovwovwluszw0g7.R.inc(32350);return entry.getValue();
                }
            }}
        }}
        }__CLR4_1_10ovwovwluszw0g7.R.inc(32351);return result;
    }finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}

    @Override
    protected void setResponseContentType(HttpServletRequest request, HttpServletResponse response) {try{__CLR4_1_10ovwovwluszw0g7.R.inc(32352);
        __CLR4_1_10ovwovwluszw0g7.R.inc(32353);if ((((getJsonpParameterValue(request) != null)&&(__CLR4_1_10ovwovwluszw0g7.R.iget(32354)!=0|true))||(__CLR4_1_10ovwovwluszw0g7.R.iget(32355)==0&false))) {{
            __CLR4_1_10ovwovwluszw0g7.R.inc(32356);response.setContentType(DEFAULT_JSONP_CONTENT_TYPE);
        } }else {{
            __CLR4_1_10ovwovwluszw0g7.R.inc(32357);super.setResponseContentType(request, response);
        }
    }}finally{__CLR4_1_10ovwovwluszw0g7.R.flushNeeded();}}


}