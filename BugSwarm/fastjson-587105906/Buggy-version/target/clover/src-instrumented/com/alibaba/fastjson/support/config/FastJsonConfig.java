/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */
package com.alibaba.fastjson.support.config;

import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ParseProcess;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.IOUtils;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Config for FastJson.
 *
 * @author VictorZeng
 * @see SerializeConfig
 * @see ParserConfig
 * @see ParseProcess
 * @see SerializerFeature
 * @see SerializeFilter
 * @see Feature
 * @since 1.2.11
 */

public class FastJsonConfig {public static class __CLR4_1_10og3og3lusqjmzf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,31737,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * default charset
     */
    private Charset charset;

    /**
     * serializeConfig
     */
    private SerializeConfig serializeConfig;

    /**
     * parserConfig
     */
    private ParserConfig parserConfig;

    /**
     * parseProcess
     */
    private ParseProcess parseProcess;

    /**
     * serializerFeatures
     */
    private SerializerFeature[] serializerFeatures;

    /**
     * serializeFilters
     */
    private SerializeFilter[] serializeFilters;

    /**
     * features
     */
    private Feature[] features;

    /**
     * class level serializeFilter
     */
    private Map<Class<?>, SerializeFilter> classSerializeFilters;

    /**
     * format date type
     */
    private String dateFormat;

    /**
     * The Write content length.
     */
    private boolean writeContentLength;

    /**
     * init param.
     */
    public FastJsonConfig() {try{__CLR4_1_10og3og3lusqjmzf.R.inc(31683);

        __CLR4_1_10og3og3lusqjmzf.R.inc(31684);this.charset = IOUtils.UTF8;

        __CLR4_1_10og3og3lusqjmzf.R.inc(31685);this.serializeConfig = SerializeConfig.getGlobalInstance();
        __CLR4_1_10og3og3lusqjmzf.R.inc(31686);this.parserConfig = ParserConfig.getGlobalInstance();

        __CLR4_1_10og3og3lusqjmzf.R.inc(31687);this.serializerFeatures = new SerializerFeature[] {
                SerializerFeature.BrowserSecure
        };

        __CLR4_1_10og3og3lusqjmzf.R.inc(31688);this.serializeFilters = new SerializeFilter[0];
        __CLR4_1_10og3og3lusqjmzf.R.inc(31689);this.features = new Feature[0];

        __CLR4_1_10og3og3lusqjmzf.R.inc(31690);this.writeContentLength = true;
    }finally{__CLR4_1_10og3og3lusqjmzf.R.flushNeeded();}}

    /**
     * @return the serializeConfig
     */
    public SerializeConfig getSerializeConfig() {try{__CLR4_1_10og3og3lusqjmzf.R.inc(31691);
        __CLR4_1_10og3og3lusqjmzf.R.inc(31692);return serializeConfig;
    }finally{__CLR4_1_10og3og3lusqjmzf.R.flushNeeded();}}

    /**
     * @param serializeConfig the serializeConfig to set
     */
    public void setSerializeConfig(SerializeConfig serializeConfig) {try{__CLR4_1_10og3og3lusqjmzf.R.inc(31693);
        __CLR4_1_10og3og3lusqjmzf.R.inc(31694);this.serializeConfig = serializeConfig;
    }finally{__CLR4_1_10og3og3lusqjmzf.R.flushNeeded();}}

    /**
     * @return the parserConfig
     */
    public ParserConfig getParserConfig() {try{__CLR4_1_10og3og3lusqjmzf.R.inc(31695);
        __CLR4_1_10og3og3lusqjmzf.R.inc(31696);return parserConfig;
    }finally{__CLR4_1_10og3og3lusqjmzf.R.flushNeeded();}}

    /**
     * @param parserConfig the parserConfig to set
     */
    public void setParserConfig(ParserConfig parserConfig) {try{__CLR4_1_10og3og3lusqjmzf.R.inc(31697);
        __CLR4_1_10og3og3lusqjmzf.R.inc(31698);this.parserConfig = parserConfig;
    }finally{__CLR4_1_10og3og3lusqjmzf.R.flushNeeded();}}

    /**
     * @return the serializerFeatures
     */
    public SerializerFeature[] getSerializerFeatures() {try{__CLR4_1_10og3og3lusqjmzf.R.inc(31699);
        __CLR4_1_10og3og3lusqjmzf.R.inc(31700);return serializerFeatures;
    }finally{__CLR4_1_10og3og3lusqjmzf.R.flushNeeded();}}

    /**
     * @param serializerFeatures the serializerFeatures to set
     */
    public void setSerializerFeatures(SerializerFeature... serializerFeatures) {try{__CLR4_1_10og3og3lusqjmzf.R.inc(31701);
        __CLR4_1_10og3og3lusqjmzf.R.inc(31702);this.serializerFeatures = serializerFeatures;
    }finally{__CLR4_1_10og3og3lusqjmzf.R.flushNeeded();}}

    /**
     * @return the serializeFilters
     */
    public SerializeFilter[] getSerializeFilters() {try{__CLR4_1_10og3og3lusqjmzf.R.inc(31703);
        __CLR4_1_10og3og3lusqjmzf.R.inc(31704);return serializeFilters;
    }finally{__CLR4_1_10og3og3lusqjmzf.R.flushNeeded();}}

    /**
     * @param serializeFilters the serializeFilters to set
     */
    public void setSerializeFilters(SerializeFilter... serializeFilters) {try{__CLR4_1_10og3og3lusqjmzf.R.inc(31705);
        __CLR4_1_10og3og3lusqjmzf.R.inc(31706);this.serializeFilters = serializeFilters;
    }finally{__CLR4_1_10og3og3lusqjmzf.R.flushNeeded();}}

    /**
     * @return the features
     */
    public Feature[] getFeatures() {try{__CLR4_1_10og3og3lusqjmzf.R.inc(31707);
        __CLR4_1_10og3og3lusqjmzf.R.inc(31708);return features;
    }finally{__CLR4_1_10og3og3lusqjmzf.R.flushNeeded();}}

    /**
     * @param features the features to set
     */
    public void setFeatures(Feature... features) {try{__CLR4_1_10og3og3lusqjmzf.R.inc(31709);
        __CLR4_1_10og3og3lusqjmzf.R.inc(31710);this.features = features;
    }finally{__CLR4_1_10og3og3lusqjmzf.R.flushNeeded();}}

    /**
     * @return the classSerializeFilters
     */
    public Map<Class<?>, SerializeFilter> getClassSerializeFilters() {try{__CLR4_1_10og3og3lusqjmzf.R.inc(31711);
        __CLR4_1_10og3og3lusqjmzf.R.inc(31712);return classSerializeFilters;
    }finally{__CLR4_1_10og3og3lusqjmzf.R.flushNeeded();}}

    /**
     * @param classSerializeFilters the classSerializeFilters to set
     */
    public void setClassSerializeFilters(
            Map<Class<?>, SerializeFilter> classSerializeFilters) {try{__CLR4_1_10og3og3lusqjmzf.R.inc(31713);

        __CLR4_1_10og3og3lusqjmzf.R.inc(31714);if ((((classSerializeFilters == null)&&(__CLR4_1_10og3og3lusqjmzf.R.iget(31715)!=0|true))||(__CLR4_1_10og3og3lusqjmzf.R.iget(31716)==0&false)))
            {__CLR4_1_10og3og3lusqjmzf.R.inc(31717);return;

        }__CLR4_1_10og3og3lusqjmzf.R.inc(31718);for (Entry<Class<?>, SerializeFilter> entry : classSerializeFilters.entrySet())

            {__CLR4_1_10og3og3lusqjmzf.R.inc(31719);this.serializeConfig.addFilter(entry.getKey(), entry.getValue());

        }__CLR4_1_10og3og3lusqjmzf.R.inc(31720);this.classSerializeFilters = classSerializeFilters;
    }finally{__CLR4_1_10og3og3lusqjmzf.R.flushNeeded();}}

    /**
     * @return the dateFormat
     */
    public String getDateFormat() {try{__CLR4_1_10og3og3lusqjmzf.R.inc(31721);
        __CLR4_1_10og3og3lusqjmzf.R.inc(31722);return dateFormat;
    }finally{__CLR4_1_10og3og3lusqjmzf.R.flushNeeded();}}

    /**
     * @param dateFormat the dateFormat to set
     */
    public void setDateFormat(String dateFormat) {try{__CLR4_1_10og3og3lusqjmzf.R.inc(31723);
        __CLR4_1_10og3og3lusqjmzf.R.inc(31724);this.dateFormat = dateFormat;
    }finally{__CLR4_1_10og3og3lusqjmzf.R.flushNeeded();}}

    /**
     * @return the charset
     */
    public Charset getCharset() {try{__CLR4_1_10og3og3lusqjmzf.R.inc(31725);
        __CLR4_1_10og3og3lusqjmzf.R.inc(31726);return charset;
    }finally{__CLR4_1_10og3og3lusqjmzf.R.flushNeeded();}}

    /**
     * @param charset the charset to set
     */
    public void setCharset(Charset charset) {try{__CLR4_1_10og3og3lusqjmzf.R.inc(31727);
        __CLR4_1_10og3og3lusqjmzf.R.inc(31728);this.charset = charset;
    }finally{__CLR4_1_10og3og3lusqjmzf.R.flushNeeded();}}

    /**
     * Is write content length boolean.
     *
     * @return the boolean
     */
    public boolean isWriteContentLength() {try{__CLR4_1_10og3og3lusqjmzf.R.inc(31729);
        __CLR4_1_10og3og3lusqjmzf.R.inc(31730);return writeContentLength;
    }finally{__CLR4_1_10og3og3lusqjmzf.R.flushNeeded();}}

    /**
     * Sets write content length.
     *
     * @param writeContentLength the write content length
     */
    public void setWriteContentLength(boolean writeContentLength) {try{__CLR4_1_10og3og3lusqjmzf.R.inc(31731);
        __CLR4_1_10og3og3lusqjmzf.R.inc(31732);this.writeContentLength = writeContentLength;
    }finally{__CLR4_1_10og3og3lusqjmzf.R.flushNeeded();}}

    /**
     * Gets parse process.
     *
     * @return the parse process
     */
    public ParseProcess getParseProcess() {try{__CLR4_1_10og3og3lusqjmzf.R.inc(31733);
        __CLR4_1_10og3og3lusqjmzf.R.inc(31734);return parseProcess;
    }finally{__CLR4_1_10og3og3lusqjmzf.R.flushNeeded();}}

    /**
     * Sets parse process.
     *
     * @param parseProcess the parse process
     */
    public void setParseProcess(ParseProcess parseProcess) {try{__CLR4_1_10og3og3lusqjmzf.R.inc(31735);
        __CLR4_1_10og3og3lusqjmzf.R.inc(31736);this.parseProcess = parseProcess;
    }finally{__CLR4_1_10og3og3lusqjmzf.R.flushNeeded();}}
}
