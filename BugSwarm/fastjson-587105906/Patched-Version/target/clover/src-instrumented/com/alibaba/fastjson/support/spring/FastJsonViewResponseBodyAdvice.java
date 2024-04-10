/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.support.spring;

import com.alibaba.fastjson.support.spring.annotation.FastJsonFilter;
import com.alibaba.fastjson.support.spring.annotation.FastJsonView;
import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.Order;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * A convenient base class for {@code ResponseBodyAdvice} implementations
 * that customize the response before JSON serialization with {@link FastJsonHttpMessageConverter4}'s concrete
 * subclasses.
 * <p>
 *
 * @author yanquanyu
 * @author liuming
 */
@Order
@ControllerAdvice
public class FastJsonViewResponseBodyAdvice implements ResponseBodyAdvice<Object> {public static class __CLR4_5_2ozgozglusyjnxe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,32400,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {try{__CLR4_5_2ozgozglusyjnxe.R.inc(32380);
        __CLR4_5_2ozgozglusyjnxe.R.inc(32381);return FastJsonHttpMessageConverter.class.isAssignableFrom(converterType) && returnType.hasMethodAnnotation(FastJsonView.class);
    }finally{__CLR4_5_2ozgozglusyjnxe.R.flushNeeded();}}

    public FastJsonContainer beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {try{__CLR4_5_2ozgozglusyjnxe.R.inc(32382);
        __CLR4_5_2ozgozglusyjnxe.R.inc(32383);FastJsonContainer container = getOrCreateContainer(body);
        __CLR4_5_2ozgozglusyjnxe.R.inc(32384);beforeBodyWriteInternal(container, selectedContentType, returnType, request, response);
        __CLR4_5_2ozgozglusyjnxe.R.inc(32385);return container;
    }finally{__CLR4_5_2ozgozglusyjnxe.R.flushNeeded();}}

    private FastJsonContainer getOrCreateContainer(Object body) {try{__CLR4_5_2ozgozglusyjnxe.R.inc(32386);
        __CLR4_5_2ozgozglusyjnxe.R.inc(32387);return ((((body instanceof FastJsonContainer )&&(__CLR4_5_2ozgozglusyjnxe.R.iget(32388)!=0|true))||(__CLR4_5_2ozgozglusyjnxe.R.iget(32389)==0&false))? (FastJsonContainer) body : new FastJsonContainer(body));

    }finally{__CLR4_5_2ozgozglusyjnxe.R.flushNeeded();}}

    protected void beforeBodyWriteInternal(FastJsonContainer container, MediaType contentType,
                                           MethodParameter returnType, ServerHttpRequest request, ServerHttpResponse response) {try{__CLR4_5_2ozgozglusyjnxe.R.inc(32390);
        __CLR4_5_2ozgozglusyjnxe.R.inc(32391);FastJsonView annotation = returnType.getMethodAnnotation(FastJsonView.class);

        __CLR4_5_2ozgozglusyjnxe.R.inc(32392);FastJsonFilter[] include = annotation.include();
        __CLR4_5_2ozgozglusyjnxe.R.inc(32393);FastJsonFilter[] exclude = annotation.exclude();
        __CLR4_5_2ozgozglusyjnxe.R.inc(32394);PropertyPreFilters filters = new PropertyPreFilters();
        __CLR4_5_2ozgozglusyjnxe.R.inc(32395);for (FastJsonFilter item : include) {{
            __CLR4_5_2ozgozglusyjnxe.R.inc(32396);filters.addFilter(item.clazz(),item.props());
        }
        }__CLR4_5_2ozgozglusyjnxe.R.inc(32397);for (FastJsonFilter item : exclude) {{
            __CLR4_5_2ozgozglusyjnxe.R.inc(32398);filters.addFilter(item.clazz()).addExcludes(item.props());
        }
        }__CLR4_5_2ozgozglusyjnxe.R.inc(32399);container.setFilters(filters);
    }finally{__CLR4_5_2ozgozglusyjnxe.R.flushNeeded();}}
}
