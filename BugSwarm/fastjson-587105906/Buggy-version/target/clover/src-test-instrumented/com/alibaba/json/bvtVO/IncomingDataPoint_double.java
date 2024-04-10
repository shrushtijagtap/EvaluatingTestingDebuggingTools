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
public class IncomingDataPoint_double {public static class __CLR4_1_1020et20etluszwgzw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,93899,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** The incoming metric name */
    private String metric;

    /** The incoming timestamp in Unix epoch seconds or milliseconds */
    private long timestamp;

    /** The incoming value as a string, we'll parse it to float or int later */
    private double value;

    /** A hash map of tag name/values */
    private Map<String, String> tags;

    /** TSUID for the data point */
    private String tsuid;

    private String granularity;

    private String aggregator;

    /**
     * Empty constructor necessary for some de/serializers
     */
    public IncomingDataPoint_double() {try{__CLR4_1_1020et20etluszwgzw.R.inc(93845);

    }finally{__CLR4_1_1020et20etluszwgzw.R.flushNeeded();}}

    /**
     * Constructor used when working with a metric and tags
     * @param metric The metric name
     * @param timestamp The Unix epoch timestamp
     * @param value The value as a string
     * @param tags The tag name/value map
     */
    public IncomingDataPoint_double(final String metric,
                                    final long timestamp,
                                    final double value,
                                    final HashMap<String, String> tags,
                                    final String granularity,
                                    final String aggregator) {try{__CLR4_1_1020et20etluszwgzw.R.inc(93846);
        __CLR4_1_1020et20etluszwgzw.R.inc(93847);this.metric = metric;
        __CLR4_1_1020et20etluszwgzw.R.inc(93848);this.granularity = granularity;
        __CLR4_1_1020et20etluszwgzw.R.inc(93849);this.timestamp = timestamp;
        __CLR4_1_1020et20etluszwgzw.R.inc(93850);this.value = value;
        __CLR4_1_1020et20etluszwgzw.R.inc(93851);this.tags = tags;
        __CLR4_1_1020et20etluszwgzw.R.inc(93852);this.aggregator = aggregator;
    }finally{__CLR4_1_1020et20etluszwgzw.R.flushNeeded();}}

    /**
     * Constructor used when working with tsuids
     * @param tsuid The TSUID
     * @param timestamp The Unix epoch timestamp
     * @param value The value as a string
     */
    public IncomingDataPoint_double(final String tsuid,
                                    final String granularity,
                                    final long timestamp,
                                    final double value) {try{__CLR4_1_1020et20etluszwgzw.R.inc(93853);
        __CLR4_1_1020et20etluszwgzw.R.inc(93854);this.tsuid = tsuid;
        __CLR4_1_1020et20etluszwgzw.R.inc(93855);this.granularity = granularity;
        __CLR4_1_1020et20etluszwgzw.R.inc(93856);this.timestamp = timestamp;
        __CLR4_1_1020et20etluszwgzw.R.inc(93857);this.value = value;
    }finally{__CLR4_1_1020et20etluszwgzw.R.flushNeeded();}}

    /**
     * @return information about this object
     */
    @Override
    public String toString() {try{__CLR4_1_1020et20etluszwgzw.R.inc(93858);
        __CLR4_1_1020et20etluszwgzw.R.inc(93859);final StringBuilder buf = new StringBuilder();
        __CLR4_1_1020et20etluszwgzw.R.inc(93860);buf.append(" metric=").append(this.metric);
        __CLR4_1_1020et20etluszwgzw.R.inc(93861);buf.append(" granularity=").append(this.granularity);
        __CLR4_1_1020et20etluszwgzw.R.inc(93862);buf.append(" aggregator=").append(this.aggregator);
        __CLR4_1_1020et20etluszwgzw.R.inc(93863);buf.append(" ts=").append(this.timestamp);
        __CLR4_1_1020et20etluszwgzw.R.inc(93864);buf.append(" value=").append(this.value);
        __CLR4_1_1020et20etluszwgzw.R.inc(93865);if ((((this.tags != null)&&(__CLR4_1_1020et20etluszwgzw.R.iget(93866)!=0|true))||(__CLR4_1_1020et20etluszwgzw.R.iget(93867)==0&false))) {{
            __CLR4_1_1020et20etluszwgzw.R.inc(93868);for (Map.Entry<String, String> entry : this.tags.entrySet()) {{
                __CLR4_1_1020et20etluszwgzw.R.inc(93869);buf.append(" ").append(entry.getKey()).append("=").append(entry.getValue());
            }
        }}
        }__CLR4_1_1020et20etluszwgzw.R.inc(93870);return buf.toString();
    }finally{__CLR4_1_1020et20etluszwgzw.R.flushNeeded();}}

    /** @return the metric */
    public final String getMetric() {try{__CLR4_1_1020et20etluszwgzw.R.inc(93871);
        __CLR4_1_1020et20etluszwgzw.R.inc(93872);return metric;
    }finally{__CLR4_1_1020et20etluszwgzw.R.flushNeeded();}}

    /** @return the timestamp */
    public final long getTimestamp() {try{__CLR4_1_1020et20etluszwgzw.R.inc(93873);
        __CLR4_1_1020et20etluszwgzw.R.inc(93874);return timestamp;
    }finally{__CLR4_1_1020et20etluszwgzw.R.flushNeeded();}}

    /** @return the value */
    public final double getValue() {try{__CLR4_1_1020et20etluszwgzw.R.inc(93875);
        __CLR4_1_1020et20etluszwgzw.R.inc(93876);return value;
    }finally{__CLR4_1_1020et20etluszwgzw.R.flushNeeded();}}

    /** @return the tags */
    public final Map<String, String> getTags() {try{__CLR4_1_1020et20etluszwgzw.R.inc(93877);
        __CLR4_1_1020et20etluszwgzw.R.inc(93878);return tags;
    }finally{__CLR4_1_1020et20etluszwgzw.R.flushNeeded();}}

    /** @return the TSUID */
    @JSONField(name = "tsuid")
    public final String getTSUID() {try{__CLR4_1_1020et20etluszwgzw.R.inc(93879);
        __CLR4_1_1020et20etluszwgzw.R.inc(93880);return tsuid;
    }finally{__CLR4_1_1020et20etluszwgzw.R.flushNeeded();}}

    public final String getGranularity() {try{__CLR4_1_1020et20etluszwgzw.R.inc(93881);
        __CLR4_1_1020et20etluszwgzw.R.inc(93882);return granularity;
    }finally{__CLR4_1_1020et20etluszwgzw.R.flushNeeded();}}

    public final String getAggregator() {try{__CLR4_1_1020et20etluszwgzw.R.inc(93883);
        __CLR4_1_1020et20etluszwgzw.R.inc(93884);return aggregator;
    }finally{__CLR4_1_1020et20etluszwgzw.R.flushNeeded();}}

    public final void setGranularity(String granularity) {try{__CLR4_1_1020et20etluszwgzw.R.inc(93885);
        __CLR4_1_1020et20etluszwgzw.R.inc(93886);this.granularity = granularity;
    }finally{__CLR4_1_1020et20etluszwgzw.R.flushNeeded();}}

    public final void setAggregator(String aggregator) {try{__CLR4_1_1020et20etluszwgzw.R.inc(93887);
        __CLR4_1_1020et20etluszwgzw.R.inc(93888);this.aggregator = aggregator;
    }finally{__CLR4_1_1020et20etluszwgzw.R.flushNeeded();}}

    /** @param metric the metric to set */
    public final void setMetric(String metric) {try{__CLR4_1_1020et20etluszwgzw.R.inc(93889);
        __CLR4_1_1020et20etluszwgzw.R.inc(93890);this.metric = metric;
    }finally{__CLR4_1_1020et20etluszwgzw.R.flushNeeded();}}

    /** @param timestamp the timestamp to set */
    public final void setTimestamp(long timestamp) {try{__CLR4_1_1020et20etluszwgzw.R.inc(93891);
        __CLR4_1_1020et20etluszwgzw.R.inc(93892);this.timestamp = timestamp;
    }finally{__CLR4_1_1020et20etluszwgzw.R.flushNeeded();}}

    /** @param value the value to set */
    public final void setValue(double value) {try{__CLR4_1_1020et20etluszwgzw.R.inc(93893);
        __CLR4_1_1020et20etluszwgzw.R.inc(93894);this.value = value;
    }finally{__CLR4_1_1020et20etluszwgzw.R.flushNeeded();}}

    /** @param tags the tags to set */
    public final void setTags(Map<String, String> tags) {try{__CLR4_1_1020et20etluszwgzw.R.inc(93895);
        __CLR4_1_1020et20etluszwgzw.R.inc(93896);this.tags = tags;
    }finally{__CLR4_1_1020et20etluszwgzw.R.flushNeeded();}}

    /** @param tsuid the TSUID to set */
    @JSONField(name = "tsuid")
    public final void setTSUID(String tsuid) {try{__CLR4_1_1020et20etluszwgzw.R.inc(93897);
        __CLR4_1_1020et20etluszwgzw.R.inc(93898);this.tsuid = tsuid;
    }finally{__CLR4_1_1020et20etluszwgzw.R.flushNeeded();}}
}