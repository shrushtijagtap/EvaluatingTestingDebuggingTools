/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvtVO;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wenshao on 03/08/2017.
 */
@JSONType(serialzeFeatures= SerializerFeature.BeanToArray,
        parseFeatures= Feature.SupportArrayToBean,
        orders = {"metric", "timestamp", "value", "tags", "tsuid", "granularity", "aggregator"},
        asm = true
        )
public class IncomingDataPoint {public static class __CLR4_1_101zf31zf3lusqkp8b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,92613,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** The incoming metric name */
    private String metric;

    /** The incoming timestamp in Unix epoch seconds or milliseconds */
    private long timestamp;

    /** The incoming value as a string, we'll parse it to float or int later */
    private String value;

    /** A hash map of tag name/values */
    private Map<String, String> tags;

    /** TSUID for the data point */
    private String tsuid;

    private String granularity;

    private String aggregator;

    /**
     * Empty constructor necessary for some de/serializers
     */
    public IncomingDataPoint() {try{__CLR4_1_101zf31zf3lusqkp8b.R.inc(92559);

    }finally{__CLR4_1_101zf31zf3lusqkp8b.R.flushNeeded();}}

    /**
     * Constructor used when working with a metric and tags
     * @param metric The metric name
     * @param timestamp The Unix epoch timestamp
     * @param value The value as a string
     * @param tags The tag name/value map
     */
    public IncomingDataPoint(final String metric,
                             final long timestamp,
                             final String value,
                             final HashMap<String, String> tags,
                             final String granularity,
                             final String aggregator) {try{__CLR4_1_101zf31zf3lusqkp8b.R.inc(92560);
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92561);this.metric = metric;
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92562);this.granularity = granularity;
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92563);this.timestamp = timestamp;
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92564);this.value = value;
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92565);this.tags = tags;
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92566);this.aggregator = aggregator;
    }finally{__CLR4_1_101zf31zf3lusqkp8b.R.flushNeeded();}}

    /**
     * Constructor used when working with tsuids
     * @param tsuid The TSUID
     * @param timestamp The Unix epoch timestamp
     * @param value The value as a string
     */
    public IncomingDataPoint(final String tsuid,
                             final String granularity,
                             final long timestamp,
                             final String value) {try{__CLR4_1_101zf31zf3lusqkp8b.R.inc(92567);
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92568);this.tsuid = tsuid;
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92569);this.granularity = granularity;
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92570);this.timestamp = timestamp;
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92571);this.value = value;
    }finally{__CLR4_1_101zf31zf3lusqkp8b.R.flushNeeded();}}

    /**
     * @return information about this object
     */
    @Override
    public String toString() {try{__CLR4_1_101zf31zf3lusqkp8b.R.inc(92572);
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92573);final StringBuilder buf = new StringBuilder();
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92574);buf.append(" metric=").append(this.metric);
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92575);buf.append(" granularity=").append(this.granularity);
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92576);buf.append(" aggregator=").append(this.aggregator);
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92577);buf.append(" ts=").append(this.timestamp);
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92578);buf.append(" value=").append(this.value);
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92579);if ((((this.tags != null)&&(__CLR4_1_101zf31zf3lusqkp8b.R.iget(92580)!=0|true))||(__CLR4_1_101zf31zf3lusqkp8b.R.iget(92581)==0&false))) {{
            __CLR4_1_101zf31zf3lusqkp8b.R.inc(92582);for (Map.Entry<String, String> entry : this.tags.entrySet()) {{
                __CLR4_1_101zf31zf3lusqkp8b.R.inc(92583);buf.append(" ").append(entry.getKey()).append("=").append(entry.getValue());
            }
        }}
        }__CLR4_1_101zf31zf3lusqkp8b.R.inc(92584);return buf.toString();
    }finally{__CLR4_1_101zf31zf3lusqkp8b.R.flushNeeded();}}

    /** @return the metric */
    public final String getMetric() {try{__CLR4_1_101zf31zf3lusqkp8b.R.inc(92585);
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92586);return metric;
    }finally{__CLR4_1_101zf31zf3lusqkp8b.R.flushNeeded();}}

    /** @return the timestamp */
    public final long getTimestamp() {try{__CLR4_1_101zf31zf3lusqkp8b.R.inc(92587);
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92588);return timestamp;
    }finally{__CLR4_1_101zf31zf3lusqkp8b.R.flushNeeded();}}

    /** @return the value */
    public final String getValue() {try{__CLR4_1_101zf31zf3lusqkp8b.R.inc(92589);
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92590);return value;
    }finally{__CLR4_1_101zf31zf3lusqkp8b.R.flushNeeded();}}

    /** @return the tags */
    public final Map<String, String> getTags() {try{__CLR4_1_101zf31zf3lusqkp8b.R.inc(92591);
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92592);return tags;
    }finally{__CLR4_1_101zf31zf3lusqkp8b.R.flushNeeded();}}

    /** @return the TSUID */
    @JSONField(name = "tsuid")
    public final String getTSUID() {try{__CLR4_1_101zf31zf3lusqkp8b.R.inc(92593);
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92594);return tsuid;
    }finally{__CLR4_1_101zf31zf3lusqkp8b.R.flushNeeded();}}

    public final String getGranularity() {try{__CLR4_1_101zf31zf3lusqkp8b.R.inc(92595);
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92596);return granularity;
    }finally{__CLR4_1_101zf31zf3lusqkp8b.R.flushNeeded();}}

    public final String getAggregator() {try{__CLR4_1_101zf31zf3lusqkp8b.R.inc(92597);
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92598);return aggregator;
    }finally{__CLR4_1_101zf31zf3lusqkp8b.R.flushNeeded();}}

    public final void setGranularity(String granularity) {try{__CLR4_1_101zf31zf3lusqkp8b.R.inc(92599);
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92600);this.granularity = granularity;
    }finally{__CLR4_1_101zf31zf3lusqkp8b.R.flushNeeded();}}

    public final void setAggregator(String aggregator) {try{__CLR4_1_101zf31zf3lusqkp8b.R.inc(92601);
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92602);this.aggregator = aggregator;
    }finally{__CLR4_1_101zf31zf3lusqkp8b.R.flushNeeded();}}

    /** @param metric the metric to set */
    public final void setMetric(String metric) {try{__CLR4_1_101zf31zf3lusqkp8b.R.inc(92603);
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92604);this.metric = metric;
    }finally{__CLR4_1_101zf31zf3lusqkp8b.R.flushNeeded();}}

    /** @param timestamp the timestamp to set */
    public final void setTimestamp(long timestamp) {try{__CLR4_1_101zf31zf3lusqkp8b.R.inc(92605);
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92606);this.timestamp = timestamp;
    }finally{__CLR4_1_101zf31zf3lusqkp8b.R.flushNeeded();}}

    /** @param value the value to set */
    public final void setValue(String value) {try{__CLR4_1_101zf31zf3lusqkp8b.R.inc(92607);
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92608);this.value = value;
    }finally{__CLR4_1_101zf31zf3lusqkp8b.R.flushNeeded();}}

    /** @param tags the tags to set */
    public final void setTags(Map<String, String> tags) {try{__CLR4_1_101zf31zf3lusqkp8b.R.inc(92609);
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92610);this.tags = tags;
    }finally{__CLR4_1_101zf31zf3lusqkp8b.R.flushNeeded();}}

    /** @param tsuid the TSUID to set */
    @JSONField(name = "tsuid")
    public final void setTSUID(String tsuid) {try{__CLR4_1_101zf31zf3lusqkp8b.R.inc(92611);
        __CLR4_1_101zf31zf3lusqkp8b.R.inc(92612);this.tsuid = tsuid;
    }finally{__CLR4_1_101zf31zf3lusqkp8b.R.flushNeeded();}}
}