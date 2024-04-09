/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.tmall;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd
 * User: jingxian.lzg
 * Date: 2015/8/17
 * Time: 16:26
 */
public class RateSearchItemDO {public static class __CLR4_5_228oj28ojlusvnlpg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,104757,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * \ufffd\ufffd\ufffd\ufffdid
     */
    @JSONField(name = "feed_id")
    private long feedId;
    /**
     * \ufffd\ufffd\u01b7id
     */
    @JSONField(name = "item_id")
    private long aucNumId;
    /**
     * \ufffd\ufffd\ufffd\u0432\ufffd\ufffd\ufffd\u05b5
     */
    @JSONField(name = "rate")
    private int rate;
    /**
     * \ufffd\ufffd\ufffd\ufffd\ufffd\u01f7\ufffd\ufffd\ufffd\u037c\u01ac
     */
    @JSONField(name = "rater_pic")
    private int raterPic;
    /**
     * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd(\ufffd\ufffd\ufffd\ufffdid)
     */
    @JSONField(name = "rated_uid")
    private long ratedUid;
    /**
     * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd(\ufffd\ufffd\ufffdid)
     */
    @JSONField(name = "rater_uid")
    private long raterUid;
    /**
     * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u01f3\ufffd
     */
    @JSONField(name = "rated_user_nick")
    private String ratedUserNick;
    /**
     * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u01f3\ufffd
     */
    @JSONField(name = "rater_user_nick")
    private String raterUserNick;
    /**
     * \ufffd\ufffd\ufffd\ufffd\u05f4\u032c
     */
    @JSONField(name = "status")
    private int status;
    /**
     * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd
     */
    @JSONField(name = "feedback")
    private String feedback;
    /**
     * \ufffd\ufffd\ufffd\ufffd\ufffd\u01f7\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd
     */
    @JSONField(name = "validfeedback")
    private int validfeedback;
    /**
     * \ufffd\u0638\ufffd
     */
    @JSONField(name = "reply")
    private String reply;
    /**
     * \u04b5\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd
     */
    @JSONField(name = "biz_type")
    private int bizType;
    /**
     * \ufffd\u3de8\ufffd\ufffd\ufffd\u05b5
     */
    @JSONField(name = "sort_weight")
    private int sortWeight;
    /**
     * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd\ufffd
     */
    @JSONField(name = "gmt_create")
    private long gmtCreateStamp;
    /**
     * \ufffd\ufffd\ufffd\u00fc\ufffd\ufffd\ufffd
     */
    @JSONField(name = "vote_useful")
    private int voteUseful;
    /**
     * \ufffd\ufffd\ufffd\ufffd\ufffd\u05b6\ufffd
     */
    @JSONField(name = "attributes")
    private String attributes;
    /**
     * \ufffd\ufffd\ufffd\u053b\ufffd\ufffd\u0134\ufffd\u05b1\ufffd\ufffd\ufffd\ufffd
     */
    @JSONField(name = "details")
    private String properties;
    /**
     * \ufffd\u01f7\ufffd\ufffd\ufffd\ufffd\ufffd
     */
    @JSONField(name = "anony")
    private int anony;
    /**
     * \ufffd\ufffd\u01fc\ufffd\u00bc\ufffd\ufffd\u0534
     */
    @JSONField(name = "source")
    private long source;
    /**
     * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd
     */
    @JSONField(name = "gmt_trade_finished")
    private long gmtTradeFinishedStamp;
    /**
     * \ufffd\ufffd\ufffd\ufffd\ufffd\u07fd\ufffd\ufffd\u05fd\ufffd\u026b
     */
    @JSONField(name = "rater_type")
    private int raterType;
    /**
     * \ufffd\ufffd\ufffd\u06fc\u01b7\ufffd\u05f4\u032c
     */
    @JSONField(name = "validscore")
    private int validscore;
    /**
     * \ufffd\ufffd\u01b7\u04bb\ufffd\ufffd\ufffd\ufffd\u013fid
     */
    @JSONField(name = "cate_level1_id")
    private long rootCatId;
    /**
     * \ufffd\ufffd\u01b7\u04b6\ufffd\ufffd\ufffd\ufffd\u013f
     */
    @JSONField(name = "cate_id")
    private long leafCatId;
    /**
     * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffdId
     * */
    @JSONField(name = "mord_id")
    private long parentTradeId;
    /**
     * \ufffd\u04f6\ufffd\ufffd\ufffdId
     * */
    @JSONField(name = "order_id")
    private long tradeId;
    /**
     * \ufffd\u01f7\ufffd\ufffd\ufffd\ufffd\u05f7\ufffd\ufffd
     */
    @JSONField(name = "append")
    private int append;
    /**
     * \u05f7\ufffd\ufffd\u05f4\u032c
     */
    @JSONField(name = "append_status")
    private int appendStatus;
    /**
     * \u05f7\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd
     */
    @JSONField(name = "append_feedback")
    private String appendFeedback;
    /**
     * \u05f7\ufffd\ufffd\ufffd\u0638\ufffd\ufffd\ufffd\ufffd\ufffd
     */
    @JSONField(name = "append_reply")
    private String appendReply;
    /**
     * \u05f7\ufffd\ufffd\u02b1\ufffd\ufffd\ufffd
     */
    @JSONField(name = "append_create")
    private long appendCreateStamp;
    /**
     * \u05f7\ufffd\ufffd\ufffd\u01f7\ufffd\ufffd\ufffd\ufffd\u037c\u01ac
     */
    @JSONField(name = "append_pic")
    private int appendPic;
    /**
     * \u05f7\ufffd\ufffd\ufffd\ufffd\u00bcid
     */
    @JSONField(name = "append_feed_id")
    private long appendFeedId;
    /**
     * \u05f7\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05b6\ufffd
     */
    @JSONField(name = "append_attributes")
    private String appendAttributes;
    /**
     * \u05f7\ufffd\ufffd\ufffd\ufffd\u05b1\ufffd\ufffd\ufffd\ufffd\ufffd\u05b6\ufffd
     */
    @JSONField(name = "append_properties")
    private String appendProperties;
    /**
     * \ufffd\u3de8\ufffd\ufffd\ufffd\ufffd\ufffd\u05b5
     */
    @JSONField(name = "algo_sort")
    private long algoSort;
    /**
     * \ufffd\u06f5\ufffd\ufffd\ufffd\u05be
     */
    @JSONField(name = "fold_flag")
    private int foldFlag;
    /**
     * \ufffd\u3de8\ufffd\ufffd\ufffd\ufffd\ufffd\u05b6\ufffd
     */
    @JSONField(name = "reason")
    private String reason;
    /**
     * \ufffd\u3de8\ufffd\ufffd\ufffd\ufffd\ufffd\u05b6\ufffd
     */
    @JSONField(name = "other")
    private String other;
    /**
     * \ufffd\ufffd\ufffd\u04e1\ufffd\ufffd\ufffd\u01e9
     */
    @JSONField(name = "expression_auc")
    private String expressionAuc;
    /**
     * \ufffd\ufffd\ufffd\u04e1\ufffd\ufffd\ufffd\u01e9\ufffd\ufffd\ufffd\ufffd\u03bb\ufffd\ufffd
     */
    @JSONField(name = "position")
    private String position;
    /**
     * \ufffd\ufffd\ufffd\u053b\ufffd\ufffd\u00fb\ufffd\ufffd\ufffd\u01e9
     * */
    @JSONField(name = "personalized_tag")
    private String personalizedTag;
    /**
     * \ufffd\ufffd\ufffd\ufffd\u037c\u01ac
     */
    @JSONField(name = "main_pic_json")
    private String mainPicJson;
    /**
     * \u05f7\ufffd\ufffd\u037c\u01ac
     */
    @JSONField(name = "append_pic_json")
    private String appendPicJson;
    /**
     * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u03e2
     */
    @JSONField(name = "main_component_json")
    private String mainComponentJson;
    /**
     * \u05f7\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u03e2
     */
    @JSONField(name = "append_component_json")
    private String appendComponentJson;
    /**
     * \ufffd\u01f7\ufffd\u03aa\u03f5\u0373\ufffd\ufffd\ufffd\ufffd
     */
    @JSONField(name = "is_auto")
    private String auto;

    public long getFeedId () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104563);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104564);return feedId;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setFeedId (long feedId) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104565);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104566);this.feedId = feedId;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public long getRatedUid () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104567);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104568);return ratedUid;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setRatedUid (long ratedUid) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104569);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104570);this.ratedUid = ratedUid;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public long getRaterUid () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104571);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104572);return raterUid;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setRaterUid (long raterUid) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104573);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104574);this.raterUid = raterUid;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public String getRaterUserNick () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104575);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104576);return raterUserNick;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setRaterUserNick (String raterUserNick) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104577);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104578);this.raterUserNick = raterUserNick;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public String getFeedback () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104579);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104580);return feedback;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setFeedback (String feedback) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104581);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104582);this.feedback = feedback;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public int getRate () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104583);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104584);return rate;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setRate (int rate) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104585);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104586);this.rate = rate;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public int getStatus () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104587);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104588);return status;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setStatus (int status) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104589);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104590);this.status = status;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public String getReply () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104591);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104592);return reply;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setReply (String reply) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104593);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104594);this.reply = reply;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public int getBizType () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104595);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104596);return bizType;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setBizType (int bizType) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104597);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104598);this.bizType = bizType;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public int getSortWeight () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104599);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104600);return sortWeight;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setSortWeight (int sortWeight) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104601);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104602);this.sortWeight = sortWeight;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public int getVoteUseful () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104603);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104604);return voteUseful;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setVoteUseful (int voteUseful) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104605);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104606);this.voteUseful = voteUseful;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public String getAttributes () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104607);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104608);return attributes;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setAttributes (String attributes) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104609);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104610);this.attributes = attributes;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public String getProperties () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104611);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104612);return properties;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setProperties (String properties) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104613);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104614);this.properties = properties;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public int getAppendStatus () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104615);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104616);return appendStatus;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setAppendStatus (int appendStatus) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104617);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104618);this.appendStatus = appendStatus;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public String getAppendFeedback () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104619);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104620);return appendFeedback;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setAppendFeedback (String appendFeedback) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104621);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104622);this.appendFeedback = appendFeedback;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public String getAppendReply () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104623);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104624);return appendReply;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setAppendReply (String appendReply) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104625);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104626);this.appendReply = appendReply;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public long getAppendFeedId () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104627);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104628);return appendFeedId;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setAppendFeedId (long appendFeedId) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104629);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104630);this.appendFeedId = appendFeedId;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public String getAppendAttributes () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104631);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104632);return appendAttributes;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setAppendAttributes (String appendAttributes) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104633);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104634);this.appendAttributes = appendAttributes;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public String getAppendProperties () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104635);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104636);return appendProperties;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setAppendProperties (String appendProperties) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104637);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104638);this.appendProperties = appendProperties;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public int getRaterPic () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104639);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104640);return raterPic;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setRaterPic (int raterPic) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104641);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104642);this.raterPic = raterPic;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public int getValidfeedback () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104643);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104644);return validfeedback;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setValidfeedback (int validfeedback) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104645);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104646);this.validfeedback = validfeedback;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public int getAppendPic () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104647);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104648);return appendPic;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setAppendPic (int appendPic) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104649);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104650);this.appendPic = appendPic;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public long getGmtCreateStamp () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104651);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104652);return gmtCreateStamp;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setGmtCreateStamp (long gmtCreateStamp) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104653);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104654);this.gmtCreateStamp = gmtCreateStamp;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public long getAppendCreateStamp () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104655);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104656);return appendCreateStamp;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setAppendCreateStamp (long appendCreateStamp) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104657);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104658);this.appendCreateStamp = appendCreateStamp;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public int getAppend () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104659);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104660);return append;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setAppend (int append) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104661);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104662);this.append = append;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public boolean haveAppend () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104663);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104664);return append == 1;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public String getRatedUserNick () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104665);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104666);return ratedUserNick;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setRatedUserNick (String ratedUserNick) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104667);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104668);this.ratedUserNick = ratedUserNick;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public int getAnony () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104669);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104670);return anony;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setAnony (int anony) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104671);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104672);this.anony = anony;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public long getGmtTradeFinishedStamp () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104673);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104674);return gmtTradeFinishedStamp;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setGmtTradeFinishedStamp (long gmtTradeFinishedStamp) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104675);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104676);this.gmtTradeFinishedStamp = gmtTradeFinishedStamp;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public int getRaterType () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104677);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104678);return raterType;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setRaterType (int raterType) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104679);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104680);this.raterType = raterType;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public int getValidscore () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104681);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104682);return validscore;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setValidscore (int validscore) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104683);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104684);this.validscore = validscore;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public long getAlgoSort () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104685);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104686);return algoSort;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setAlgoSort (long algoSort) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104687);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104688);this.algoSort = algoSort;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public int getFoldFlag () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104689);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104690);return foldFlag;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setFoldFlag (int foldFlag) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104691);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104692);this.foldFlag = foldFlag;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public String getReason () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104693);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104694);return reason;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setReason (String reason) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104695);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104696);this.reason = reason;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public String getOther () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104697);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104698);return other;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setOther (String other) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104699);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104700);this.other = other;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public String getExpressionAuc () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104701);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104702);return expressionAuc;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setExpressionAuc (String expressionAuc) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104703);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104704);this.expressionAuc = expressionAuc;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public String getPosition () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104705);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104706);return position;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setPosition (String position) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104707);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104708);this.position = position;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public long getAucNumId () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104709);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104710);return aucNumId;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setAucNumId (long aucNumId) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104711);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104712);this.aucNumId = aucNumId;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public long getSource () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104713);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104714);return source;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setSource (long source) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104715);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104716);this.source = source;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public long getRootCatId () {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104717);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104718);return rootCatId;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setRootCatId (long rootCatId) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104719);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104720);this.rootCatId = rootCatId;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public long getLeafCatId() {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104721);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104722);return leafCatId;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setLeafCatId(long leafCatId) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104723);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104724);this.leafCatId = leafCatId;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public String getMainPicJson() {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104725);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104726);return mainPicJson;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setMainPicJson(String mainPicJson) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104727);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104728);this.mainPicJson = mainPicJson;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public String getAppendPicJson() {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104729);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104730);return appendPicJson;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setAppendPicJson(String appendPicJson) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104731);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104732);this.appendPicJson = appendPicJson;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public String getMainComponentJson() {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104733);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104734);return mainComponentJson;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setMainComponentJson(String mainComponentJson) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104735);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104736);this.mainComponentJson = mainComponentJson;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public String getAppendComponentJson() {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104737);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104738);return appendComponentJson;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setAppendComponentJson(String appendComponentJson) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104739);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104740);this.appendComponentJson = appendComponentJson;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public String getAuto() {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104741);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104742);return auto;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setAuto(String auto) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104743);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104744);this.auto = auto;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public long getParentTradeId() {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104745);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104746);return parentTradeId;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setParentTradeId(long parentTradeId) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104747);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104748);this.parentTradeId = parentTradeId;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public long getTradeId() {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104749);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104750);return tradeId;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setTradeId(long tradeId) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104751);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104752);this.tradeId = tradeId;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public String getPersonalizedTag() {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104753);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104754);return personalizedTag;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

    public void setPersonalizedTag(String personalizedTag) {try{__CLR4_5_228oj28ojlusvnlpg.R.inc(104755);
        __CLR4_5_228oj28ojlusvnlpg.R.inc(104756);this.personalizedTag = personalizedTag;
    }finally{__CLR4_5_228oj28ojlusvnlpg.R.flushNeeded();}}

}
