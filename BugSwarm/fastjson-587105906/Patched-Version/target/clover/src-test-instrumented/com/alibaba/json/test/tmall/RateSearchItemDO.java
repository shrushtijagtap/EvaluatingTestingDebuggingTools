/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.tmall;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd
 * User: jingxian.lzg
 * Date: 2015/8/17
 * Time: 16:26
 */
public class RateSearchItemDO {public static class __CLR4_5_227qb27qblusyjx8v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,103525,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public long getFeedId () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103331);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103332);return feedId;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setFeedId (long feedId) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103333);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103334);this.feedId = feedId;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public long getRatedUid () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103335);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103336);return ratedUid;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setRatedUid (long ratedUid) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103337);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103338);this.ratedUid = ratedUid;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public long getRaterUid () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103339);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103340);return raterUid;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setRaterUid (long raterUid) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103341);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103342);this.raterUid = raterUid;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public String getRaterUserNick () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103343);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103344);return raterUserNick;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setRaterUserNick (String raterUserNick) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103345);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103346);this.raterUserNick = raterUserNick;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public String getFeedback () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103347);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103348);return feedback;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setFeedback (String feedback) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103349);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103350);this.feedback = feedback;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public int getRate () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103351);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103352);return rate;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setRate (int rate) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103353);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103354);this.rate = rate;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public int getStatus () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103355);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103356);return status;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setStatus (int status) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103357);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103358);this.status = status;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public String getReply () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103359);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103360);return reply;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setReply (String reply) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103361);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103362);this.reply = reply;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public int getBizType () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103363);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103364);return bizType;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setBizType (int bizType) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103365);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103366);this.bizType = bizType;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public int getSortWeight () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103367);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103368);return sortWeight;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setSortWeight (int sortWeight) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103369);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103370);this.sortWeight = sortWeight;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public int getVoteUseful () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103371);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103372);return voteUseful;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setVoteUseful (int voteUseful) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103373);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103374);this.voteUseful = voteUseful;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public String getAttributes () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103375);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103376);return attributes;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setAttributes (String attributes) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103377);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103378);this.attributes = attributes;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public String getProperties () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103379);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103380);return properties;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setProperties (String properties) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103381);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103382);this.properties = properties;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public int getAppendStatus () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103383);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103384);return appendStatus;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setAppendStatus (int appendStatus) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103385);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103386);this.appendStatus = appendStatus;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public String getAppendFeedback () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103387);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103388);return appendFeedback;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setAppendFeedback (String appendFeedback) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103389);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103390);this.appendFeedback = appendFeedback;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public String getAppendReply () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103391);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103392);return appendReply;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setAppendReply (String appendReply) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103393);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103394);this.appendReply = appendReply;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public long getAppendFeedId () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103395);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103396);return appendFeedId;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setAppendFeedId (long appendFeedId) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103397);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103398);this.appendFeedId = appendFeedId;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public String getAppendAttributes () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103399);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103400);return appendAttributes;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setAppendAttributes (String appendAttributes) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103401);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103402);this.appendAttributes = appendAttributes;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public String getAppendProperties () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103403);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103404);return appendProperties;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setAppendProperties (String appendProperties) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103405);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103406);this.appendProperties = appendProperties;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public int getRaterPic () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103407);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103408);return raterPic;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setRaterPic (int raterPic) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103409);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103410);this.raterPic = raterPic;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public int getValidfeedback () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103411);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103412);return validfeedback;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setValidfeedback (int validfeedback) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103413);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103414);this.validfeedback = validfeedback;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public int getAppendPic () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103415);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103416);return appendPic;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setAppendPic (int appendPic) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103417);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103418);this.appendPic = appendPic;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public long getGmtCreateStamp () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103419);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103420);return gmtCreateStamp;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setGmtCreateStamp (long gmtCreateStamp) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103421);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103422);this.gmtCreateStamp = gmtCreateStamp;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public long getAppendCreateStamp () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103423);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103424);return appendCreateStamp;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setAppendCreateStamp (long appendCreateStamp) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103425);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103426);this.appendCreateStamp = appendCreateStamp;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public int getAppend () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103427);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103428);return append;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setAppend (int append) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103429);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103430);this.append = append;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public boolean haveAppend () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103431);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103432);return append == 1;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public String getRatedUserNick () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103433);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103434);return ratedUserNick;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setRatedUserNick (String ratedUserNick) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103435);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103436);this.ratedUserNick = ratedUserNick;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public int getAnony () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103437);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103438);return anony;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setAnony (int anony) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103439);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103440);this.anony = anony;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public long getGmtTradeFinishedStamp () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103441);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103442);return gmtTradeFinishedStamp;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setGmtTradeFinishedStamp (long gmtTradeFinishedStamp) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103443);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103444);this.gmtTradeFinishedStamp = gmtTradeFinishedStamp;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public int getRaterType () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103445);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103446);return raterType;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setRaterType (int raterType) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103447);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103448);this.raterType = raterType;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public int getValidscore () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103449);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103450);return validscore;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setValidscore (int validscore) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103451);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103452);this.validscore = validscore;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public long getAlgoSort () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103453);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103454);return algoSort;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setAlgoSort (long algoSort) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103455);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103456);this.algoSort = algoSort;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public int getFoldFlag () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103457);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103458);return foldFlag;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setFoldFlag (int foldFlag) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103459);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103460);this.foldFlag = foldFlag;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public String getReason () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103461);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103462);return reason;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setReason (String reason) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103463);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103464);this.reason = reason;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public String getOther () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103465);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103466);return other;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setOther (String other) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103467);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103468);this.other = other;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public String getExpressionAuc () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103469);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103470);return expressionAuc;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setExpressionAuc (String expressionAuc) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103471);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103472);this.expressionAuc = expressionAuc;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public String getPosition () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103473);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103474);return position;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setPosition (String position) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103475);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103476);this.position = position;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public long getAucNumId () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103477);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103478);return aucNumId;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setAucNumId (long aucNumId) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103479);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103480);this.aucNumId = aucNumId;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public long getSource () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103481);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103482);return source;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setSource (long source) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103483);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103484);this.source = source;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public long getRootCatId () {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103485);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103486);return rootCatId;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setRootCatId (long rootCatId) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103487);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103488);this.rootCatId = rootCatId;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public long getLeafCatId() {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103489);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103490);return leafCatId;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setLeafCatId(long leafCatId) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103491);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103492);this.leafCatId = leafCatId;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public String getMainPicJson() {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103493);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103494);return mainPicJson;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setMainPicJson(String mainPicJson) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103495);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103496);this.mainPicJson = mainPicJson;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public String getAppendPicJson() {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103497);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103498);return appendPicJson;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setAppendPicJson(String appendPicJson) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103499);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103500);this.appendPicJson = appendPicJson;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public String getMainComponentJson() {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103501);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103502);return mainComponentJson;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setMainComponentJson(String mainComponentJson) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103503);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103504);this.mainComponentJson = mainComponentJson;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public String getAppendComponentJson() {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103505);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103506);return appendComponentJson;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setAppendComponentJson(String appendComponentJson) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103507);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103508);this.appendComponentJson = appendComponentJson;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public String getAuto() {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103509);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103510);return auto;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setAuto(String auto) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103511);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103512);this.auto = auto;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public long getParentTradeId() {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103513);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103514);return parentTradeId;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setParentTradeId(long parentTradeId) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103515);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103516);this.parentTradeId = parentTradeId;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public long getTradeId() {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103517);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103518);return tradeId;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setTradeId(long tradeId) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103519);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103520);this.tradeId = tradeId;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public String getPersonalizedTag() {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103521);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103522);return personalizedTag;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

    public void setPersonalizedTag(String personalizedTag) {try{__CLR4_5_227qb27qblusyjx8v.R.inc(103523);
        __CLR4_5_227qb27qblusyjx8v.R.inc(103524);this.personalizedTag = personalizedTag;
    }finally{__CLR4_5_227qb27qblusyjx8v.R.flushNeeded();}}

}
