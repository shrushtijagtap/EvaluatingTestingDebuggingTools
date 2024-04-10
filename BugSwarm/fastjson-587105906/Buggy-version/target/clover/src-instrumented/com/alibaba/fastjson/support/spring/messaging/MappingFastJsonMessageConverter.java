/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.support.spring.messaging;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.converter.AbstractMessageConverter;
import org.springframework.util.MimeType;

import java.nio.charset.Charset;

/**
 * Fastjson for Spring Messaging Json Converter.
 * <p>
 * Compatible Spring Messaging version 4+
 *
 * @author KimmKing
 * @author Victor.Zxy
 * @see AbstractMessageConverter
 * @since 1.2.47
 */
public class MappingFastJsonMessageConverter extends AbstractMessageConverter {public static class __CLR4_1_10p4hp4hluszw0ik{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,32601,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * with fastJson config
     */
    private FastJsonConfig fastJsonConfig = new FastJsonConfig();

    /**
     * @return the fastJsonConfig.
     * @since 1.2.47
     */
    public FastJsonConfig getFastJsonConfig() {try{__CLR4_1_10p4hp4hluszw0ik.R.inc(32561);
        __CLR4_1_10p4hp4hluszw0ik.R.inc(32562);return fastJsonConfig;
    }finally{__CLR4_1_10p4hp4hluszw0ik.R.flushNeeded();}}

    /**
     * @param fastJsonConfig the fastJsonConfig to set.
     * @since 1.2.47
     */
    public void setFastJsonConfig(FastJsonConfig fastJsonConfig) {try{__CLR4_1_10p4hp4hluszw0ik.R.inc(32563);
        __CLR4_1_10p4hp4hluszw0ik.R.inc(32564);this.fastJsonConfig = fastJsonConfig;
    }finally{__CLR4_1_10p4hp4hluszw0ik.R.flushNeeded();}}

    public MappingFastJsonMessageConverter() {
        super(new MimeType("application", "json", Charset.forName("UTF-8")));__CLR4_1_10p4hp4hluszw0ik.R.inc(32566);try{__CLR4_1_10p4hp4hluszw0ik.R.inc(32565);
    }finally{__CLR4_1_10p4hp4hluszw0ik.R.flushNeeded();}}

    protected boolean supports(Class<?> clazz) {try{__CLR4_1_10p4hp4hluszw0ik.R.inc(32567);
        __CLR4_1_10p4hp4hluszw0ik.R.inc(32568);return true;
    }finally{__CLR4_1_10p4hp4hluszw0ik.R.flushNeeded();}}

    @Override
    protected boolean canConvertFrom(Message<?> message, Class<?> targetClass) {try{__CLR4_1_10p4hp4hluszw0ik.R.inc(32569);
        __CLR4_1_10p4hp4hluszw0ik.R.inc(32570);return supports(targetClass);
    }finally{__CLR4_1_10p4hp4hluszw0ik.R.flushNeeded();}}

    @Override
    protected boolean canConvertTo(Object payload, MessageHeaders headers) {try{__CLR4_1_10p4hp4hluszw0ik.R.inc(32571);
        __CLR4_1_10p4hp4hluszw0ik.R.inc(32572);return supports(payload.getClass());
    }finally{__CLR4_1_10p4hp4hluszw0ik.R.flushNeeded();}}

    @Override
    protected Object convertFromInternal(Message<?> message, Class<?> targetClass, Object conversionHint) {try{__CLR4_1_10p4hp4hluszw0ik.R.inc(32573);
        // parse byte[] or String payload to Java Object
        __CLR4_1_10p4hp4hluszw0ik.R.inc(32574);Object payload = message.getPayload();
        __CLR4_1_10p4hp4hluszw0ik.R.inc(32575);Object obj = null;
        __CLR4_1_10p4hp4hluszw0ik.R.inc(32576);if ((((payload instanceof byte[])&&(__CLR4_1_10p4hp4hluszw0ik.R.iget(32577)!=0|true))||(__CLR4_1_10p4hp4hluszw0ik.R.iget(32578)==0&false))) {{
            __CLR4_1_10p4hp4hluszw0ik.R.inc(32579);obj = JSON.parseObject((byte[]) payload, fastJsonConfig.getCharset(), targetClass, fastJsonConfig.getParserConfig(),
                    fastJsonConfig.getParseProcess(), JSON.DEFAULT_PARSER_FEATURE, fastJsonConfig.getFeatures());
        } }else {__CLR4_1_10p4hp4hluszw0ik.R.inc(32580);if ((((payload instanceof String)&&(__CLR4_1_10p4hp4hluszw0ik.R.iget(32581)!=0|true))||(__CLR4_1_10p4hp4hluszw0ik.R.iget(32582)==0&false))) {{
            __CLR4_1_10p4hp4hluszw0ik.R.inc(32583);obj = JSON.parseObject((String) payload, targetClass, fastJsonConfig.getParserConfig(),
                    fastJsonConfig.getParseProcess(), JSON.DEFAULT_PARSER_FEATURE, fastJsonConfig.getFeatures());
        }

        }}__CLR4_1_10p4hp4hluszw0ik.R.inc(32584);return obj;
    }finally{__CLR4_1_10p4hp4hluszw0ik.R.flushNeeded();}}

    @Override
    protected Object convertToInternal(Object payload, MessageHeaders headers, Object conversionHint) {try{__CLR4_1_10p4hp4hluszw0ik.R.inc(32585);
        // encode payload to json string or byte[]
        __CLR4_1_10p4hp4hluszw0ik.R.inc(32586);Object obj;
        __CLR4_1_10p4hp4hluszw0ik.R.inc(32587);if ((((byte[].class == getSerializedPayloadClass())&&(__CLR4_1_10p4hp4hluszw0ik.R.iget(32588)!=0|true))||(__CLR4_1_10p4hp4hluszw0ik.R.iget(32589)==0&false))) {{
            __CLR4_1_10p4hp4hluszw0ik.R.inc(32590);if ((((payload instanceof String && JSON.isValid((String) payload))&&(__CLR4_1_10p4hp4hluszw0ik.R.iget(32591)!=0|true))||(__CLR4_1_10p4hp4hluszw0ik.R.iget(32592)==0&false))) {{
                __CLR4_1_10p4hp4hluszw0ik.R.inc(32593);obj = ((String) payload).getBytes(fastJsonConfig.getCharset());
            } }else {{
                __CLR4_1_10p4hp4hluszw0ik.R.inc(32594);obj = JSON.toJSONBytes(fastJsonConfig.getCharset(), payload, fastJsonConfig.getSerializeConfig(), fastJsonConfig.getSerializeFilters(),
                        fastJsonConfig.getDateFormat(), JSON.DEFAULT_GENERATE_FEATURE, fastJsonConfig.getSerializerFeatures());
            }
        }} }else {{
            __CLR4_1_10p4hp4hluszw0ik.R.inc(32595);if ((((payload instanceof String && JSON.isValid((String) payload))&&(__CLR4_1_10p4hp4hluszw0ik.R.iget(32596)!=0|true))||(__CLR4_1_10p4hp4hluszw0ik.R.iget(32597)==0&false))) {{
                __CLR4_1_10p4hp4hluszw0ik.R.inc(32598);obj = payload;
            } }else {{
                __CLR4_1_10p4hp4hluszw0ik.R.inc(32599);obj = JSON.toJSONString(payload, fastJsonConfig.getSerializeConfig(), fastJsonConfig.getSerializeFilters(),
                        fastJsonConfig.getDateFormat(), JSON.DEFAULT_GENERATE_FEATURE, fastJsonConfig.getSerializerFeatures());
            }
        }}

        }__CLR4_1_10p4hp4hluszw0ik.R.inc(32600);return obj;
    }finally{__CLR4_1_10p4hp4hluszw0ik.R.flushNeeded();}}
}
