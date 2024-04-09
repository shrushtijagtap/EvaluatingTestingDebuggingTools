/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1500;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;

import java.io.Serializable;
import java.util.List;

public class Issue1548 extends TestCase {static class __CLR4_5_21brw1brwlusvna8l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,61928,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_21brw1brwlusvna8l.R.globalSliceStart(getClass().getName(),61916);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1brw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21brw1brwlusvna8l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21brw1brwlusvna8l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1500.Issue1548.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),61916,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1brw() throws Exception{try{__CLR4_5_21brw1brwlusvna8l.R.inc(61916);
        __CLR4_5_21brw1brwlusvna8l.R.inc(61917);String msg = "[{\"doc\":{\"bottomprice\":80,\"cashpool_isdeleted\":0,\"shopcityid\":190,\"timerange\":\"2017-10-25;2017-10-26\",\"launchentityid\":3048,\"bidprice\":700,\"targetitems\":\"{}\",\"type\":0,\"slottagid\":44,\"targetid\":330048,\"entity_isdeleted\":0,\"bu\":2,\"target_isdeleted\":0,\"shopid\":6067941,\"slotids\":\"50041,10233,50051,10033,50061,50001,10099,10133,50101,10051\",\"launchscope\":0,\"productid\":74,\"creativeid\":300048,\"dpentitystatus\":1,\"accountid\":20151002,\"entitytype\":4,\"launchplatforms\":\"\",\"iszhuantou\":0,\"dpentityid\":6067941,\"timeslotperiod\":\"0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167\",\"templateid\":23,\"category1\":246,\"launch_isdeleted\":0,\"cashpoolid\":20151002,\"creative_isdeleted\":0,\"settlementstatus\":1,\"cityid\":\"190\",\"planid\":1042007,\"categoryid\":\"10 246\",\"price\":700,\"shoptype\":10,\"plan_isdeleted\":0,\"launchid\":30000048,\"creativeext\":\"{\\\"content\\\":\\\"\u554a\u554a\u554a\u554a\u554a\u554a\u554a\u554a\\\",\\\"title\\\":\\\"\u554a\u554a\u554a\u554a\u554a\\\",\\\"smartPic\\\":0,\\\"mobUrl\\\":\\\"https://evt.dianping.com/midas/1activities/3809/index.html?dpid=7997757988618737578&cityid=1&longitude=121.41543&latitude=31.21684&token=&product=dpapp&area=pc\\\",\\\"mtMobUrl\\\":\\\"https://evt.dianping.com/midas/1activities/3809/index.html?dpid=7997757988618737578&cityid=1&longitude=121.41543&latitude=31.21684&token=&product=dpapp&area=mtapp\\\"}\",\"chargetype\":1,\"channel\":0,\"generatedchannel\":0,\"promotype\":2},\"meta\":{\"LSN\":2077395,\"AREA\":\"engine-searchcpc\",\"PRIMARY_KEY\":[\"creativeid\",\"targetid\"],\"SECONDARY_KEY\":[\"planid\",\"shopid\",\"launchentityid\",\"launchid\",\"cashpoolid\"],\"TYPE\":\"UPDATE\"}}]";
        // JSONArray.parse(msg);
        __CLR4_5_21brw1brwlusvna8l.R.inc(61918);JSON.parseArray(msg).toJavaList(PublishDoc.class);
    }finally{__CLR4_5_21brw1brwlusvna8l.R.flushNeeded();}}

    public static class PublishDoc implements Serializable {

        public static final String LSN_META_NAME = "LSN";
        public static final String DOCTYPE_META_NAME = "TYPE";
        public static final String AREA_META_NAME = "AREA";
        public static final String PRIMARY_KEY_META_NAME = "PRIMARY_KEY";
        public static final String SECONDARY_KEY_META_NAME = "SECONDARY_KEY";

        private JSONObject meta;
        private JSONObject doc;

        public PublishDoc() {try{__CLR4_5_21brw1brwlusvna8l.R.inc(61919);
            __CLR4_5_21brw1brwlusvna8l.R.inc(61920);this.meta = new JSONObject();
            __CLR4_5_21brw1brwlusvna8l.R.inc(61921);this.doc = new JSONObject();
        }finally{__CLR4_5_21brw1brwlusvna8l.R.flushNeeded();}}


        @JSONField(serialize = false)
        public void addMeta(String name, Object value) {try{__CLR4_5_21brw1brwlusvna8l.R.inc(61922);
            __CLR4_5_21brw1brwlusvna8l.R.inc(61923);this.meta.put(name, value);
        }finally{__CLR4_5_21brw1brwlusvna8l.R.flushNeeded();}}

        @JSONField(serialize = false)
        public Object getMeta(String name) {try{__CLR4_5_21brw1brwlusvna8l.R.inc(61924);
            __CLR4_5_21brw1brwlusvna8l.R.inc(61925);return this.meta.get(name);
        }finally{__CLR4_5_21brw1brwlusvna8l.R.flushNeeded();}}



        @Override
        public String toString() {try{__CLR4_5_21brw1brwlusvna8l.R.inc(61926);
            __CLR4_5_21brw1brwlusvna8l.R.inc(61927);return JSON.toJSONString(this);
        }finally{__CLR4_5_21brw1brwlusvna8l.R.flushNeeded();}}
    }

    public static enum DocType{

    }
}
