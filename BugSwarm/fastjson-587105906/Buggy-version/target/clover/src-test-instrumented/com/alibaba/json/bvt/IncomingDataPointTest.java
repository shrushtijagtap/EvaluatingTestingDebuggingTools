/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import com.alibaba.fastjson.JSON;
import com.alibaba.json.bvtVO.IncomingDataPoint;
import junit.framework.TestCase;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by wenshao on 03/08/2017.
 */
public class IncomingDataPointTest extends TestCase {static class __CLR4_1_10xdexdelusqjxnm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,43273,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_1_10xdexdelusqjxnm.R.globalSliceStart(getClass().getName(),43250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp2xde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xdexdelusqjxnm.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xdexdelusqjxnm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.IncomingDataPointTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43250,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp2xde() throws Exception{try{__CLR4_1_10xdexdelusqjxnm.R.inc(43250);
        __CLR4_1_10xdexdelusqjxnm.R.inc(43251);Map<String, String> tags = new LinkedHashMap<String, String>();
        __CLR4_1_10xdexdelusqjxnm.R.inc(43252);tags.put("site", "et2");
        __CLR4_1_10xdexdelusqjxnm.R.inc(43253);tags.put("appname", "histore");
        __CLR4_1_10xdexdelusqjxnm.R.inc(43254);tags.put("ip", "1.1.1.1");

        __CLR4_1_10xdexdelusqjxnm.R.inc(43255);IncomingDataPoint point = new IncomingDataPoint();
        __CLR4_1_10xdexdelusqjxnm.R.inc(43256);point.setMetric("mem.usage.GB");
        __CLR4_1_10xdexdelusqjxnm.R.inc(43257);point.setTimestamp(1501760861298L);
        __CLR4_1_10xdexdelusqjxnm.R.inc(43258);point.setTags(tags);
        __CLR4_1_10xdexdelusqjxnm.R.inc(43259);point.setValue("58.41");
        __CLR4_1_10xdexdelusqjxnm.R.inc(43260);point.setTSUID("");
        __CLR4_1_10xdexdelusqjxnm.R.inc(43261);point.setAggregator("");
        __CLR4_1_10xdexdelusqjxnm.R.inc(43262);IncomingDataPoint[] array = new IncomingDataPoint[] {point};

        __CLR4_1_10xdexdelusqjxnm.R.inc(43263);String json = JSON.toJSONString(array);
        __CLR4_1_10xdexdelusqjxnm.R.inc(43264);System.out.println(json);

        __CLR4_1_10xdexdelusqjxnm.R.inc(43265);JSON.parseArray(json, IncomingDataPoint.class);

        __CLR4_1_10xdexdelusqjxnm.R.inc(43266);IncomingDataPoint p2 = JSON.parseObject("[\"mem.usage.GB\",1501833776283,\"58.41\",{\"site\":\"et2\",\"appname\":\"histore\",\"ip\":\"1.1.1.1\"}]", IncomingDataPoint.class);
        __CLR4_1_10xdexdelusqjxnm.R.inc(43267);IncomingDataPoint p3 = JSON.parseObject("[\"mem.usage.GB\",1501833776283,\"58.41\",{\"site\":\"et2\",\"appname\":\"histore\",\"ip\":\"1.1.1.1\"},null]", IncomingDataPoint.class);
        __CLR4_1_10xdexdelusqjxnm.R.inc(43268);System.out.println(JSON.toJSONString(p2));
//        JSON.parseObject(json, IncomingDataPoint[].class);
    }finally{__CLR4_1_10xdexdelusqjxnm.R.flushNeeded();}}
    public void test_for_IncomingDataPoint() throws Exception {__CLR4_1_10xdexdelusqjxnm.R.globalSliceStart(getClass().getName(),43269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hcj290xdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xdexdelusqjxnm.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xdexdelusqjxnm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.IncomingDataPointTest.test_for_IncomingDataPoint",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43269,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hcj290xdx() throws Exception{try{__CLR4_1_10xdexdelusqjxnm.R.inc(43269);
        // "metric", "timestamp", "value", "tags", "tsuid", "granularity", "aggregator"
        __CLR4_1_10xdexdelusqjxnm.R.inc(43270);String text = "[[\"DataAdaptor.LbMultiGroupPersonalityDataAdaptor.stddev.aggregate_sum\",\"1501812639932\",\"95.52667633256902\",{\"appName\":\"aladdin\",\"hostIdc\":\"et2\",\"hostunit\":\"CENTER\",\"nodegroup\":\"aladdin_prehost\",\"idc\":\"ET2\",\"agg_version\":\"100\",\"group\":\"DEFAULT\"},\"\",\"\",\"\"]]";
        __CLR4_1_10xdexdelusqjxnm.R.inc(43271);System.out.println(text);
        __CLR4_1_10xdexdelusqjxnm.R.inc(43272);JSON.parseArray(text, IncomingDataPoint.class);
    }finally{__CLR4_1_10xdexdelusqjxnm.R.flushNeeded();}}
}
