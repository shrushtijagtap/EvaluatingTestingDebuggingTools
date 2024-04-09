/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.support.spring;

import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.Order;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Pattern;

/**
 * A convenient base class for {@code ResponseBodyAdvice} implementations
 * that customize the response before JSON serialization with {@link FastJsonpHttpMessageConverter4}'s concrete
 * subclasses.
 * <p>
 * Compatible Spring MVC version 4.2+
 *
 * @author Jerry.Chen
 * @see JSONPResponseBodyAdvice
 * @since 1.2.20
 */
@Deprecated
@Order(Integer.MIN_VALUE) //before FastJsonViewResponseBodyAdvice
@ControllerAdvice
public class FastJsonpResponseBodyAdvice implements ResponseBodyAdvice<Object> {public static class __CLR4_5_2p0ep0elusvmwpc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,32446,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Pattern for validating jsonp callback parameter values.
     */
    private static final Pattern CALLBACK_PARAM_PATTERN = Pattern.compile("[0-9A-Za-z_\\.]*");
    private final String[] jsonpQueryParamNames;
    /**
     * Default JSONP query param names: callback/jsonp
     */
    public static final String[] DEFAULT_JSONP_QUERY_PARAM_NAMES = {"callback", "jsonp"};

    public FastJsonpResponseBodyAdvice() {try{__CLR4_5_2p0ep0elusvmwpc.R.inc(32414);
        __CLR4_5_2p0ep0elusvmwpc.R.inc(32415);this.jsonpQueryParamNames = DEFAULT_JSONP_QUERY_PARAM_NAMES;
    }finally{__CLR4_5_2p0ep0elusvmwpc.R.flushNeeded();}}

    public FastJsonpResponseBodyAdvice(String... queryParamNames) {try{__CLR4_5_2p0ep0elusvmwpc.R.inc(32416);
        __CLR4_5_2p0ep0elusvmwpc.R.inc(32417);Assert.isTrue(!ObjectUtils.isEmpty(queryParamNames), "At least one query param name is required");
        __CLR4_5_2p0ep0elusvmwpc.R.inc(32418);this.jsonpQueryParamNames = queryParamNames;
    }finally{__CLR4_5_2p0ep0elusvmwpc.R.flushNeeded();}}

    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {try{__CLR4_5_2p0ep0elusvmwpc.R.inc(32419);
        __CLR4_5_2p0ep0elusvmwpc.R.inc(32420);return FastJsonHttpMessageConverter.class.isAssignableFrom(converterType);
    }finally{__CLR4_5_2p0ep0elusvmwpc.R.flushNeeded();}}

    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
                                  Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
                                  ServerHttpResponse response) {try{__CLR4_5_2p0ep0elusvmwpc.R.inc(32421);
        __CLR4_5_2p0ep0elusvmwpc.R.inc(32422);MappingFastJsonValue container = getOrCreateContainer(body);
        __CLR4_5_2p0ep0elusvmwpc.R.inc(32423);beforeBodyWriteInternal(container, selectedContentType, returnType, request, response);
        __CLR4_5_2p0ep0elusvmwpc.R.inc(32424);return container;
    }finally{__CLR4_5_2p0ep0elusvmwpc.R.flushNeeded();}}

    /**
     * Wrap the body in a {@link MappingFastJsonValue} value container (for providing
     * additional serialization instructions) or simply cast it if already wrapped.
     */
    protected MappingFastJsonValue getOrCreateContainer(Object body) {try{__CLR4_5_2p0ep0elusvmwpc.R.inc(32425);
        __CLR4_5_2p0ep0elusvmwpc.R.inc(32426);return ((((body instanceof MappingFastJsonValue )&&(__CLR4_5_2p0ep0elusvmwpc.R.iget(32427)!=0|true))||(__CLR4_5_2p0ep0elusvmwpc.R.iget(32428)==0&false))? (MappingFastJsonValue) body : new MappingFastJsonValue(body));
    }finally{__CLR4_5_2p0ep0elusvmwpc.R.flushNeeded();}}

    /**
     * Invoked only if the converter type is {@code FastJsonpHttpMessageConverter4}.
     */
    public void beforeBodyWriteInternal(MappingFastJsonValue bodyContainer, MediaType contentType,
                                        MethodParameter returnType, ServerHttpRequest request, ServerHttpResponse response) {try{__CLR4_5_2p0ep0elusvmwpc.R.inc(32429);
        __CLR4_5_2p0ep0elusvmwpc.R.inc(32430);HttpServletRequest servletRequest = ((ServletServerHttpRequest) request).getServletRequest();
        __CLR4_5_2p0ep0elusvmwpc.R.inc(32431);for (String name : this.jsonpQueryParamNames) {{
            __CLR4_5_2p0ep0elusvmwpc.R.inc(32432);String value = servletRequest.getParameter(name);
            __CLR4_5_2p0ep0elusvmwpc.R.inc(32433);if ((((value != null)&&(__CLR4_5_2p0ep0elusvmwpc.R.iget(32434)!=0|true))||(__CLR4_5_2p0ep0elusvmwpc.R.iget(32435)==0&false))) {{
                __CLR4_5_2p0ep0elusvmwpc.R.inc(32436);if ((((!isValidJsonpQueryParam(value))&&(__CLR4_5_2p0ep0elusvmwpc.R.iget(32437)!=0|true))||(__CLR4_5_2p0ep0elusvmwpc.R.iget(32438)==0&false))) {{
                    __CLR4_5_2p0ep0elusvmwpc.R.inc(32439);continue;
                }
                // MediaType contentTypeToUse = getContentType(contentType, request, response);
                // response.getHeaders().setContentType(contentTypeToUse);
                }__CLR4_5_2p0ep0elusvmwpc.R.inc(32440);bodyContainer.setJsonpFunction(value);
                __CLR4_5_2p0ep0elusvmwpc.R.inc(32441);break;
            }
        }}
    }}finally{__CLR4_5_2p0ep0elusvmwpc.R.flushNeeded();}}

    /**
     * Validate the jsonp query parameter value. The default implementation
     * returns true if it consists of digits, letters, or "_" and ".".
     * Invalid parameter values are ignored.
     *
     * @param value the query param value, never {@code null}
     */
    protected boolean isValidJsonpQueryParam(String value) {try{__CLR4_5_2p0ep0elusvmwpc.R.inc(32442);
        __CLR4_5_2p0ep0elusvmwpc.R.inc(32443);return CALLBACK_PARAM_PATTERN.matcher(value).matches();
    }finally{__CLR4_5_2p0ep0elusvmwpc.R.flushNeeded();}}

    /**
     * Return the content type to set the response to.
     * This implementation always returns "application/javascript".
     *
     * @param contentType the content type selected through content negotiation
     * @param request     the current request
     * @param response    the current response
     * @return the content type to set the response to
     */
    protected MediaType getContentType(MediaType contentType, ServerHttpRequest request, ServerHttpResponse response) {try{__CLR4_5_2p0ep0elusvmwpc.R.inc(32444);
        __CLR4_5_2p0ep0elusvmwpc.R.inc(32445);return new MediaType("application", "javascript");
    }finally{__CLR4_5_2p0ep0elusvmwpc.R.flushNeeded();}}
}
