/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1600;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;

public class Issue_for_gaorui extends TestCase {static class __CLR4_5_21d2u1d2ulusvnaou{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,63645,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_21d2u1d2ulusvnaou.R.globalSliceStart(getClass().getName(),63606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1d2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21d2u1d2ulusvnaou.R.rethrow($CLV_t2$);}finally{__CLR4_5_21d2u1d2ulusvnaou.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1600.Issue_for_gaorui.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63606,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1d2u() throws Exception{try{__CLR4_5_21d2u1d2ulusvnaou.R.inc(63606);
        __CLR4_5_21d2u1d2ulusvnaou.R.inc(63607);String json = "{\"@type\":\"java.util.HashMap\",\"COUPON\":[{\"@type\":\"com.alibaba.json.bvt.issue_1600.Issue_for_gaorui.PromotionTermDetail\",\"activityId\":\"1584034\",\"choose\":true,\"couponId\":1251068987,\"couponType\":\"limitp\",\"match\":true,\"realPrice\":{\"amount\":0.6,\"currency\":\"USD\"}}],\"grayTrade\":\"true\"}";

        __CLR4_5_21d2u1d2ulusvnaou.R.inc(63608);JSON.parseObject(json, Object.class, Feature.SupportAutoType);
    }finally{__CLR4_5_21d2u1d2ulusvnaou.R.flushNeeded();}}

    public static class PromotionTermDetail {
        /**
         * \u5361\u5238Id
         */
        private Long couponId;
        /**
         * \u8425\u9500Id
         */
        private String promotionId;
        /**
         * \u5b9e\u9645\u5355\u4ef7
         */
        private Money realPrice;
        /**
         * \u6d3b\u52a8Id
         */
        private String activityId;

        /**
         * \u5361\u5238\u7c7b\u578b
         */
        private String couponType;

        /**
         * \u662f\u5426\u80fd\u591f\u83b7\u53d6\u5230\u8be5\u4f18\u60e0
         */
        private boolean isMatch = false;
        /**
         * \u662f\u5426\u9009\u62e9\u4e86\u8be5\u4f18\u60e0
         */
        private boolean isChoose = false;
        /**
         * \u672a\u83b7\u53d6\u5230\u4f18\u60e0\u7684\u539f\u56e0
         */
        private String reasonForLose;
        /**
         * \u672a\u83b7\u53d6\u4f18\u60e0\u7684\u6807\u8bc6\u7801
         */
        private String codeForLose;

        public Long getCouponId() {try{__CLR4_5_21d2u1d2ulusvnaou.R.inc(63609);
            __CLR4_5_21d2u1d2ulusvnaou.R.inc(63610);return couponId;
        }finally{__CLR4_5_21d2u1d2ulusvnaou.R.flushNeeded();}}

        public void setCouponId(Long couponId) {try{__CLR4_5_21d2u1d2ulusvnaou.R.inc(63611);
            __CLR4_5_21d2u1d2ulusvnaou.R.inc(63612);this.couponId = couponId;
        }finally{__CLR4_5_21d2u1d2ulusvnaou.R.flushNeeded();}}

        public String getPromotionId() {try{__CLR4_5_21d2u1d2ulusvnaou.R.inc(63613);
            __CLR4_5_21d2u1d2ulusvnaou.R.inc(63614);return promotionId;
        }finally{__CLR4_5_21d2u1d2ulusvnaou.R.flushNeeded();}}

        public void setPromotionId(String promotionId) {try{__CLR4_5_21d2u1d2ulusvnaou.R.inc(63615);
            __CLR4_5_21d2u1d2ulusvnaou.R.inc(63616);this.promotionId = promotionId;
        }finally{__CLR4_5_21d2u1d2ulusvnaou.R.flushNeeded();}}

        public Money getRealPrice() {try{__CLR4_5_21d2u1d2ulusvnaou.R.inc(63617);
            __CLR4_5_21d2u1d2ulusvnaou.R.inc(63618);return realPrice;
        }finally{__CLR4_5_21d2u1d2ulusvnaou.R.flushNeeded();}}

        public void setRealPrice(Money realPrice) {try{__CLR4_5_21d2u1d2ulusvnaou.R.inc(63619);
            __CLR4_5_21d2u1d2ulusvnaou.R.inc(63620);this.realPrice = realPrice;
        }finally{__CLR4_5_21d2u1d2ulusvnaou.R.flushNeeded();}}

        public String getActivityId() {try{__CLR4_5_21d2u1d2ulusvnaou.R.inc(63621);
            __CLR4_5_21d2u1d2ulusvnaou.R.inc(63622);return activityId;
        }finally{__CLR4_5_21d2u1d2ulusvnaou.R.flushNeeded();}}

        public void setActivityId(String activityId) {try{__CLR4_5_21d2u1d2ulusvnaou.R.inc(63623);
            __CLR4_5_21d2u1d2ulusvnaou.R.inc(63624);this.activityId = activityId;
        }finally{__CLR4_5_21d2u1d2ulusvnaou.R.flushNeeded();}}

        public String getCouponType() {try{__CLR4_5_21d2u1d2ulusvnaou.R.inc(63625);
            __CLR4_5_21d2u1d2ulusvnaou.R.inc(63626);return couponType;
        }finally{__CLR4_5_21d2u1d2ulusvnaou.R.flushNeeded();}}

        public void setCouponType(String couponType) {try{__CLR4_5_21d2u1d2ulusvnaou.R.inc(63627);
            __CLR4_5_21d2u1d2ulusvnaou.R.inc(63628);this.couponType = couponType;
        }finally{__CLR4_5_21d2u1d2ulusvnaou.R.flushNeeded();}}

        public boolean isMatch() {try{__CLR4_5_21d2u1d2ulusvnaou.R.inc(63629);
            __CLR4_5_21d2u1d2ulusvnaou.R.inc(63630);return isMatch;
        }finally{__CLR4_5_21d2u1d2ulusvnaou.R.flushNeeded();}}

        public void setMatch(boolean match) {try{__CLR4_5_21d2u1d2ulusvnaou.R.inc(63631);
            __CLR4_5_21d2u1d2ulusvnaou.R.inc(63632);isMatch = match;
        }finally{__CLR4_5_21d2u1d2ulusvnaou.R.flushNeeded();}}

        public boolean isChoose() {try{__CLR4_5_21d2u1d2ulusvnaou.R.inc(63633);
            __CLR4_5_21d2u1d2ulusvnaou.R.inc(63634);return isChoose;
        }finally{__CLR4_5_21d2u1d2ulusvnaou.R.flushNeeded();}}

        public void setChoose(boolean choose) {try{__CLR4_5_21d2u1d2ulusvnaou.R.inc(63635);
            __CLR4_5_21d2u1d2ulusvnaou.R.inc(63636);isChoose = choose;
        }finally{__CLR4_5_21d2u1d2ulusvnaou.R.flushNeeded();}}

        public String getReasonForLose() {try{__CLR4_5_21d2u1d2ulusvnaou.R.inc(63637);
            __CLR4_5_21d2u1d2ulusvnaou.R.inc(63638);return reasonForLose;
        }finally{__CLR4_5_21d2u1d2ulusvnaou.R.flushNeeded();}}

        public void setReasonForLose(String reasonForLose) {try{__CLR4_5_21d2u1d2ulusvnaou.R.inc(63639);
            __CLR4_5_21d2u1d2ulusvnaou.R.inc(63640);this.reasonForLose = reasonForLose;
        }finally{__CLR4_5_21d2u1d2ulusvnaou.R.flushNeeded();}}

        public String getCodeForLose() {try{__CLR4_5_21d2u1d2ulusvnaou.R.inc(63641);
            __CLR4_5_21d2u1d2ulusvnaou.R.inc(63642);return codeForLose;
        }finally{__CLR4_5_21d2u1d2ulusvnaou.R.flushNeeded();}}

        public void setCodeForLose(String codeForLose) {try{__CLR4_5_21d2u1d2ulusvnaou.R.inc(63643);
            __CLR4_5_21d2u1d2ulusvnaou.R.inc(63644);this.codeForLose = codeForLose;
        }finally{__CLR4_5_21d2u1d2ulusvnaou.R.flushNeeded();}}
    }

    public static class Money {

    }
}
