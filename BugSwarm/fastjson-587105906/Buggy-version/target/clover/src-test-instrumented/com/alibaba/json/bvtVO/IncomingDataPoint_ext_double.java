/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvtVO;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessable;
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
public class IncomingDataPoint_ext_double {public static class __CLR4_1_1020gb20gbluszwh03{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,93933,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** The incoming metric name */
    private String metric;

    /** The incoming timestamp in Unix epoch seconds or milliseconds */
    private long timestamp;

    /** The incoming value as a string, we'll parse it to float or int later */
    private double value;

    /** A hash map of tag name/values */
    private Tags tags;

    /** TSUID for the data point */
    private String tsuid;

    private String granularity;

    private String aggregator;

    /**
     * Empty constructor necessary for some de/serializers
     */
    public IncomingDataPoint_ext_double() {try{__CLR4_1_1020gb20gbluszwh03.R.inc(93899);

    }finally{__CLR4_1_1020gb20gbluszwh03.R.flushNeeded();}}

    /**
     * Constructor used when working with tsuids
     * @param tsuid The TSUID
     * @param timestamp The Unix epoch timestamp
     * @param value The value as a string
     */
    public IncomingDataPoint_ext_double(final String tsuid,
                                        final String granularity,
                                        final long timestamp,
                                        final double value) {try{__CLR4_1_1020gb20gbluszwh03.R.inc(93900);
        __CLR4_1_1020gb20gbluszwh03.R.inc(93901);this.tsuid = tsuid;
        __CLR4_1_1020gb20gbluszwh03.R.inc(93902);this.granularity = granularity;
        __CLR4_1_1020gb20gbluszwh03.R.inc(93903);this.timestamp = timestamp;
        __CLR4_1_1020gb20gbluszwh03.R.inc(93904);this.value = value;
    }finally{__CLR4_1_1020gb20gbluszwh03.R.flushNeeded();}}



    /** @return the metric */
    public final String getMetric() {try{__CLR4_1_1020gb20gbluszwh03.R.inc(93905);
        __CLR4_1_1020gb20gbluszwh03.R.inc(93906);return metric;
    }finally{__CLR4_1_1020gb20gbluszwh03.R.flushNeeded();}}

    /** @return the timestamp */
    public final long getTimestamp() {try{__CLR4_1_1020gb20gbluszwh03.R.inc(93907);
        __CLR4_1_1020gb20gbluszwh03.R.inc(93908);return timestamp;
    }finally{__CLR4_1_1020gb20gbluszwh03.R.flushNeeded();}}

    /** @return the value */
    public final double getValue() {try{__CLR4_1_1020gb20gbluszwh03.R.inc(93909);
        __CLR4_1_1020gb20gbluszwh03.R.inc(93910);return value;
    }finally{__CLR4_1_1020gb20gbluszwh03.R.flushNeeded();}}

    /** @return the tags */
    public final Tags getTags() {try{__CLR4_1_1020gb20gbluszwh03.R.inc(93911);
        __CLR4_1_1020gb20gbluszwh03.R.inc(93912);return tags;
    }finally{__CLR4_1_1020gb20gbluszwh03.R.flushNeeded();}}

    /** @return the TSUID */
    @JSONField(name = "tsuid")
    public final String getTSUID() {try{__CLR4_1_1020gb20gbluszwh03.R.inc(93913);
        __CLR4_1_1020gb20gbluszwh03.R.inc(93914);return tsuid;
    }finally{__CLR4_1_1020gb20gbluszwh03.R.flushNeeded();}}

    public final String getGranularity() {try{__CLR4_1_1020gb20gbluszwh03.R.inc(93915);
        __CLR4_1_1020gb20gbluszwh03.R.inc(93916);return granularity;
    }finally{__CLR4_1_1020gb20gbluszwh03.R.flushNeeded();}}

    public final String getAggregator() {try{__CLR4_1_1020gb20gbluszwh03.R.inc(93917);
        __CLR4_1_1020gb20gbluszwh03.R.inc(93918);return aggregator;
    }finally{__CLR4_1_1020gb20gbluszwh03.R.flushNeeded();}}

    public final void setGranularity(String granularity) {try{__CLR4_1_1020gb20gbluszwh03.R.inc(93919);
        __CLR4_1_1020gb20gbluszwh03.R.inc(93920);this.granularity = granularity;
    }finally{__CLR4_1_1020gb20gbluszwh03.R.flushNeeded();}}

    public final void setAggregator(String aggregator) {try{__CLR4_1_1020gb20gbluszwh03.R.inc(93921);
        __CLR4_1_1020gb20gbluszwh03.R.inc(93922);this.aggregator = aggregator;
    }finally{__CLR4_1_1020gb20gbluszwh03.R.flushNeeded();}}

    /** @param metric the metric to set */
    public final void setMetric(String metric) {try{__CLR4_1_1020gb20gbluszwh03.R.inc(93923);
        __CLR4_1_1020gb20gbluszwh03.R.inc(93924);this.metric = metric;
    }finally{__CLR4_1_1020gb20gbluszwh03.R.flushNeeded();}}

    /** @param timestamp the timestamp to set */
    public final void setTimestamp(long timestamp) {try{__CLR4_1_1020gb20gbluszwh03.R.inc(93925);
        __CLR4_1_1020gb20gbluszwh03.R.inc(93926);this.timestamp = timestamp;
    }finally{__CLR4_1_1020gb20gbluszwh03.R.flushNeeded();}}

    /** @param value the value to set */
    public final void setValue(double value) {try{__CLR4_1_1020gb20gbluszwh03.R.inc(93927);
        __CLR4_1_1020gb20gbluszwh03.R.inc(93928);this.value = value;
    }finally{__CLR4_1_1020gb20gbluszwh03.R.flushNeeded();}}

    /** @param tags the tags to set */
    public final void setTags(Tags tags) {try{__CLR4_1_1020gb20gbluszwh03.R.inc(93929);
        __CLR4_1_1020gb20gbluszwh03.R.inc(93930);this.tags = tags;
    }finally{__CLR4_1_1020gb20gbluszwh03.R.flushNeeded();}}

    /** @param tsuid the TSUID to set */
    @JSONField(name = "tsuid")
    public final void setTSUID(String tsuid) {try{__CLR4_1_1020gb20gbluszwh03.R.inc(93931);
        __CLR4_1_1020gb20gbluszwh03.R.inc(93932);this.tsuid = tsuid;
    }finally{__CLR4_1_1020gb20gbluszwh03.R.flushNeeded();}}

    @JSONType(orders = {"appName", "hostIdc", "hostunit", "nodegroup", "idc", "hostIp", "agg_version", "group"})
    public static class Tags {
        // \u5e38\u7528\u5b57\u6bb5
        public String appName;
        public String hostIdc;
        public String hostunit;
        public String nodegroup;
        public String idc;
        public String agg_version;
        public String hostIp;
        public String group;

        // \u975e\u5e38\u7528\u7684tag\u4f1a\u653e\u5728\u8fd9\u91cc\uff0c\u7531\u4e8e\u6807\u8bc6\u4e86unwrapped\uff0c\u5e8f\u5217\u5316\u65f6\u4f1a\u5c55\u5f00\u548c\u4e0a\u9762\u5b57\u6bb5\u5e76\u5217\uff0c\u53cd\u5e8f\u5217\u5316\u540c\u6837\u80fd\u8bc6\u522b
        @JSONField(unwrapped = true)
        public Map<String, String> attributes = new HashMap<String, String>();
    }
}