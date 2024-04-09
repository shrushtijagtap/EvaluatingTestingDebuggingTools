/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.support.spring;

import com.alibaba.fastjson.JSONPObject;
import com.alibaba.fastjson.support.spring.annotation.ResponseJSONP;
import com.alibaba.fastjson.util.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.Order;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by SongLing.Dong on 7/22/2017.
 * <p>
 * Wrap with the return object from method annotated by <code>@ResponseJSONP</code>
 * in order to be serialized into jsonp format.
 * </p>
 * <p>
 * <p>
 * url: /path/to/your/api?<b>callback=functionName</b>
 * </p>
 *
 * @see JSONPObject
 * @see ResponseJSONP
 * @since Spring 4.2 when ResponseBodyAdvice is supported.
 * <p>
 * In Spring 3.x, use method directly return a <code>JSONPObject</code> instead.
 * </p>
 */
@Order(Integer.MIN_VALUE)//before FastJsonViewResponseBodyAdvice
@ControllerAdvice
public class JSONPResponseBodyAdvice implements ResponseBodyAdvice<Object> {public static class __CLR4_5_2p23p23lusvmwqt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,32501,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final Log logger = LogFactory.getLog(this.getClass());

    public JSONPResponseBodyAdvice() {try{__CLR4_5_2p23p23lusvmwqt.R.inc(32475);
    }finally{__CLR4_5_2p23p23lusvmwqt.R.flushNeeded();}}


    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {try{__CLR4_5_2p23p23lusvmwqt.R.inc(32476);


        __CLR4_5_2p23p23lusvmwqt.R.inc(32477);return FastJsonHttpMessageConverter.class.isAssignableFrom(converterType)
                &&
                (returnType.getContainingClass().isAnnotationPresent(ResponseJSONP.class) || returnType.hasMethodAnnotation(ResponseJSONP.class));
    }finally{__CLR4_5_2p23p23lusvmwqt.R.flushNeeded();}}

    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
                                  Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
                                  ServerHttpResponse response) {try{__CLR4_5_2p23p23lusvmwqt.R.inc(32478);

        __CLR4_5_2p23p23lusvmwqt.R.inc(32479);ResponseJSONP responseJsonp = returnType.getMethodAnnotation(ResponseJSONP.class);
        __CLR4_5_2p23p23lusvmwqt.R.inc(32480);if((((responseJsonp == null)&&(__CLR4_5_2p23p23lusvmwqt.R.iget(32481)!=0|true))||(__CLR4_5_2p23p23lusvmwqt.R.iget(32482)==0&false))){{
            __CLR4_5_2p23p23lusvmwqt.R.inc(32483);responseJsonp = returnType.getContainingClass().getAnnotation(ResponseJSONP.class);
        }

        }__CLR4_5_2p23p23lusvmwqt.R.inc(32484);HttpServletRequest servletRequest = ((ServletServerHttpRequest) request).getServletRequest();
        __CLR4_5_2p23p23lusvmwqt.R.inc(32485);String callbackMethodName = servletRequest.getParameter(responseJsonp.callback());

        __CLR4_5_2p23p23lusvmwqt.R.inc(32486);if ((((!IOUtils.isValidJsonpQueryParam(callbackMethodName))&&(__CLR4_5_2p23p23lusvmwqt.R.iget(32487)!=0|true))||(__CLR4_5_2p23p23lusvmwqt.R.iget(32488)==0&false))) {{
            __CLR4_5_2p23p23lusvmwqt.R.inc(32489);if ((((logger.isDebugEnabled())&&(__CLR4_5_2p23p23lusvmwqt.R.iget(32490)!=0|true))||(__CLR4_5_2p23p23lusvmwqt.R.iget(32491)==0&false))) {{
                __CLR4_5_2p23p23lusvmwqt.R.inc(32492);logger.debug("Invalid jsonp parameter value:" + callbackMethodName);
            }
            }__CLR4_5_2p23p23lusvmwqt.R.inc(32493);callbackMethodName = null;
        }

        }__CLR4_5_2p23p23lusvmwqt.R.inc(32494);JSONPObject jsonpObject = new JSONPObject(callbackMethodName);
        __CLR4_5_2p23p23lusvmwqt.R.inc(32495);jsonpObject.addParameter(body);
        __CLR4_5_2p23p23lusvmwqt.R.inc(32496);beforeBodyWriteInternal(jsonpObject, selectedContentType, returnType, request, response);
        __CLR4_5_2p23p23lusvmwqt.R.inc(32497);return jsonpObject;
    }finally{__CLR4_5_2p23p23lusvmwqt.R.flushNeeded();}}


    public void beforeBodyWriteInternal(JSONPObject jsonpObject, MediaType contentType,
                                        MethodParameter returnType, ServerHttpRequest request, ServerHttpResponse response) {try{__CLR4_5_2p23p23lusvmwqt.R.inc(32498);
        //MediaType contentTypeToUse = getContentType(contentType, request, response);
        //response.getHeaders().setContentType(contentTypeToUse);
    }finally{__CLR4_5_2p23p23lusvmwqt.R.flushNeeded();}}

    /**
     * Return the content type to set the response to.
     * This implementation always returns "application/javascript".
     *
     * @param contentType the content type selected through content negotiation
     * @param request     the current request
     * @param response    the current response
     * @return the content type to set the response to
     */
    protected MediaType getContentType(MediaType contentType, ServerHttpRequest request, ServerHttpResponse response) {try{__CLR4_5_2p23p23lusvmwqt.R.inc(32499);
        __CLR4_5_2p23p23lusvmwqt.R.inc(32500);return FastJsonHttpMessageConverter.APPLICATION_JAVASCRIPT;
    }finally{__CLR4_5_2p23p23lusvmwqt.R.flushNeeded();}}
}
