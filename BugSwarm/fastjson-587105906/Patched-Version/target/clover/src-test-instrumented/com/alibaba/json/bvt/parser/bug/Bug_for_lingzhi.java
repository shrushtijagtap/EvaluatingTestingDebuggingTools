/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.bug;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

import java.util.List;

public class Bug_for_lingzhi extends TestCase {static class __CLR4_5_21ki71ki7lusvne30{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,73306,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_5_21ki71ki7lusvne30.R.globalSliceStart(getClass().getName(),73231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21ki7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ki71ki7lusvne30.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ki71ki7lusvne30.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.bug.Bug_for_lingzhi.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73231,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21ki7() throws Exception{try{__CLR4_5_21ki71ki7lusvne30.R.inc(73231);
        __CLR4_5_21ki71ki7lusvne30.R.inc(73232);String str = "[\n" +
                "{\n" +
                "\"isDefault\":false,\n" +
                "\"msgId\": \"expireTransitionChange\",\n" +
                "\"msgText\": \"xxx\",\n" +
                "\"extMsgId\": \"promptInformation\",\n" +
                "\"extMsgText\": \"xxx\",\n" +
                "\"instChangeType\": 1,\n" +
                "\"rule\": {\n" +
                "\"aliUid\":[39314],\n" +
                "\"regionNo\":[]\n" +
                "}\n" +
                "},\n" +
                "{\n" +
                "\"isDefault\":true,\n" +
                "\"msgId\": \"expireTransitionUnChange\",\n" +
                "\"msgText\": \"xxx\",\n" +
                "\"extMsgId\": \"Prompt information\",\n" +
                "\"extMsgText\": \"xxx\",\n" +
                "\"instChangeType\": 0,\n" +
                "\"rule\": {\n" +
                "\"aliUid\":[],\n" +
                "\"regionNo\":[]\n" +
                "}\n" +
                "},\n" +
                "{\n" +
                "\"isDefault\":false,\n" +
                "\"msgId\": \"expireTransitionChange\",\n" +
                "\"msgText\": \"xxx\",\n" +
                "\"extMsgId\": \"Prompt information\",\n" +
                "\"extMsgText\": \"\u4f60\u597dB\",\n" +
                "\"instChangeType\": 1,\n" +
                "\"rule\": {\n" +
                "\"aliUid\":[111],\n" +
                "\"regionNo\":[]\n" +
                "}\n" +
                "}\n" +
                "]";

//        String pstr = JSON.toJSONString(JSON.parse(str), SerializerFeature.PrettyFormat);
//        System.out.println(pstr);

        __CLR4_5_21ki71ki7lusvne30.R.inc(73233);JSON.parseObject(str, new TypeReference<List<EcsTransitionDisplayedMsgConfig>>(){});
    }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

    public static class EcsTransitionDisplayedMsgConfig {

        /**
         * \u662f\u5426\u9ed8\u8ba4\u6587\u6848
         */
        private Boolean isDefault;

        /**
         * \u5c55\u793a\u7684\u6587\u6848Id
         */
        private String msgId;

        /**
         * \u5c55\u793a\u7684\u6587\u6848\u4fe1\u606f
         */
        private String msgText;

        /**
         * \u6269\u5c55\u6587\u6848Id
         */
        private String extMsgId;

        /**
         * \u6269\u5c55\u6587\u6848\u4fe1\u606f
         */
        private String extMsgText;


        private Integer instChangeType;

        /**
         * \u6587\u6848\u5bf9\u5e94\u7684\u89c4\u5219
         */
        private EcsTransitionConfigRule rule;

        public String getMsgText() {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73234);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73235);return msgText;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public void setMsgText(String msgText) {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73236);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73237);this.msgText = msgText;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public String getMsgId() {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73238);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73239);return msgId;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public void setMsgId(String msgId) {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73240);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73241);this.msgId = msgId;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public EcsTransitionConfigRule getRule() {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73242);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73243);return rule;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public void setRule(EcsTransitionConfigRule rule) {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73244);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73245);this.rule = rule;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public Integer getInstChangeType() {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73246);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73247);return instChangeType;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public void setInstChangeType(Integer instChangeType) {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73248);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73249);this.instChangeType = instChangeType;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public Boolean getIsDefault() {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73250);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73251);return this.isDefault;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public void setIsDefault(Boolean isDefault) {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73252);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73253);this.isDefault = isDefault;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public String getExtMsgId() {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73254);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73255);return extMsgId;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public void setExtMsgId(String extMsgId) {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73256);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73257);this.extMsgId = extMsgId;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public String getExtMsgText() {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73258);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73259);return extMsgText;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public void setExtMsgText(String extMsgText) {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73260);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73261);this.extMsgText = extMsgText;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}
    }

    public static class EcsTransitionConfigRule {


        /** 0 \u8fc7\u4fdd\u8fc1\u79fb, 1 \u975e\u8fc7\u4fdd\u8fc1\u79fb **/
        private List<Integer> transType;

        /** \u6bd4\u5982\uff1acn-qingdao-cm5-a01 **/
        private List<String> regionNo;

        private List<Long> aliUid;

        private List<String> bid;

        /** ecs,disk **/
        private List<String> resourceType;

        private List<Long> zoneId;

        private List<Long> targetZoneId;

        private List<Integer> networkTransType;

        /** instance type \u5b9e\u4f8b\u89c4\u683c **/
        private List<String> instanceType;

        /** \u78c1\u76d8\u7c7b\u578b ioX **/
        private List<String> ioX;

        private List<String> instanceId;


        public List<Integer> getTransType() {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73262);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73263);return transType;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public void setTransType(List<Integer> transType) {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73264);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73265);this.transType = transType;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public List<String> getRegionNo() {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73266);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73267);return regionNo;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public void setRegionNo(List<String> regionNo) {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73268);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73269);this.regionNo = regionNo;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public List<Long> getAliUid() {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73270);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73271);return aliUid;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public void setAliUid(List<Long> aliUid) {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73272);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73273);this.aliUid = aliUid;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public List<String> getBid() {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73274);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73275);return bid;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public void setBid(List<String> bid) {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73276);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73277);this.bid = bid;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public List<String> getResourceType() {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73278);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73279);return resourceType;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public void setResourceType(List<String> resourceType) {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73280);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73281);this.resourceType = resourceType;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public List<Long> getZoneId() {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73282);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73283);return zoneId;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public void setZoneId(List<Long> zoneId) {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73284);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73285);this.zoneId = zoneId;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public List<Long> getTargetZoneId() {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73286);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73287);return targetZoneId;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public void setTargetZoneId(List<Long> targetZoneId) {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73288);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73289);this.targetZoneId = targetZoneId;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public List<Integer> getNetworkTransType() {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73290);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73291);return networkTransType;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public void setNetworkTransType(List<Integer> networkTransType) {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73292);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73293);this.networkTransType = networkTransType;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public List<String> getInstanceType() {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73294);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73295);return instanceType;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public void setInstanceType(List<String> instanceType) {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73296);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73297);this.instanceType = instanceType;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public List<String> getIoX() {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73298);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73299);return ioX;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public void setIoX(List<String> ioX) {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73300);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73301);this.ioX = ioX;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public List<String> getInstanceId() {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73302);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73303);return instanceId;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

        public void setInstanceId(List<String> instanceId) {try{__CLR4_5_21ki71ki7lusvne30.R.inc(73304);
            __CLR4_5_21ki71ki7lusvne30.R.inc(73305);this.instanceId = instanceId;
        }finally{__CLR4_5_21ki71ki7lusvne30.R.flushNeeded();}}

    }
}
