/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.tmall;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd
 * User: jingxian.lzg
 * Date: 2015/8/17
 * Time: 16:26
 */
public class RateSearchItemDO {public static class __CLR4_1_1028ou28ouluszwixf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,104768,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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

    public long getFeedId () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104574);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104575);return feedId;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setFeedId (long feedId) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104576);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104577);this.feedId = feedId;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public long getRatedUid () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104578);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104579);return ratedUid;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setRatedUid (long ratedUid) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104580);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104581);this.ratedUid = ratedUid;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public long getRaterUid () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104582);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104583);return raterUid;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setRaterUid (long raterUid) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104584);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104585);this.raterUid = raterUid;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public String getRaterUserNick () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104586);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104587);return raterUserNick;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setRaterUserNick (String raterUserNick) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104588);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104589);this.raterUserNick = raterUserNick;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public String getFeedback () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104590);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104591);return feedback;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setFeedback (String feedback) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104592);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104593);this.feedback = feedback;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public int getRate () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104594);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104595);return rate;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setRate (int rate) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104596);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104597);this.rate = rate;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public int getStatus () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104598);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104599);return status;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setStatus (int status) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104600);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104601);this.status = status;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public String getReply () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104602);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104603);return reply;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setReply (String reply) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104604);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104605);this.reply = reply;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public int getBizType () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104606);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104607);return bizType;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setBizType (int bizType) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104608);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104609);this.bizType = bizType;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public int getSortWeight () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104610);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104611);return sortWeight;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setSortWeight (int sortWeight) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104612);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104613);this.sortWeight = sortWeight;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public int getVoteUseful () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104614);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104615);return voteUseful;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setVoteUseful (int voteUseful) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104616);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104617);this.voteUseful = voteUseful;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public String getAttributes () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104618);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104619);return attributes;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setAttributes (String attributes) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104620);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104621);this.attributes = attributes;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public String getProperties () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104622);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104623);return properties;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setProperties (String properties) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104624);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104625);this.properties = properties;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public int getAppendStatus () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104626);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104627);return appendStatus;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setAppendStatus (int appendStatus) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104628);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104629);this.appendStatus = appendStatus;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public String getAppendFeedback () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104630);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104631);return appendFeedback;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setAppendFeedback (String appendFeedback) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104632);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104633);this.appendFeedback = appendFeedback;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public String getAppendReply () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104634);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104635);return appendReply;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setAppendReply (String appendReply) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104636);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104637);this.appendReply = appendReply;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public long getAppendFeedId () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104638);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104639);return appendFeedId;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setAppendFeedId (long appendFeedId) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104640);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104641);this.appendFeedId = appendFeedId;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public String getAppendAttributes () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104642);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104643);return appendAttributes;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setAppendAttributes (String appendAttributes) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104644);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104645);this.appendAttributes = appendAttributes;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public String getAppendProperties () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104646);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104647);return appendProperties;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setAppendProperties (String appendProperties) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104648);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104649);this.appendProperties = appendProperties;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public int getRaterPic () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104650);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104651);return raterPic;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setRaterPic (int raterPic) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104652);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104653);this.raterPic = raterPic;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public int getValidfeedback () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104654);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104655);return validfeedback;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setValidfeedback (int validfeedback) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104656);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104657);this.validfeedback = validfeedback;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public int getAppendPic () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104658);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104659);return appendPic;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setAppendPic (int appendPic) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104660);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104661);this.appendPic = appendPic;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public long getGmtCreateStamp () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104662);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104663);return gmtCreateStamp;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setGmtCreateStamp (long gmtCreateStamp) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104664);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104665);this.gmtCreateStamp = gmtCreateStamp;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public long getAppendCreateStamp () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104666);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104667);return appendCreateStamp;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setAppendCreateStamp (long appendCreateStamp) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104668);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104669);this.appendCreateStamp = appendCreateStamp;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public int getAppend () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104670);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104671);return append;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setAppend (int append) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104672);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104673);this.append = append;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public boolean haveAppend () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104674);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104675);return append == 1;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public String getRatedUserNick () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104676);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104677);return ratedUserNick;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setRatedUserNick (String ratedUserNick) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104678);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104679);this.ratedUserNick = ratedUserNick;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public int getAnony () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104680);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104681);return anony;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setAnony (int anony) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104682);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104683);this.anony = anony;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public long getGmtTradeFinishedStamp () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104684);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104685);return gmtTradeFinishedStamp;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setGmtTradeFinishedStamp (long gmtTradeFinishedStamp) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104686);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104687);this.gmtTradeFinishedStamp = gmtTradeFinishedStamp;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public int getRaterType () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104688);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104689);return raterType;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setRaterType (int raterType) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104690);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104691);this.raterType = raterType;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public int getValidscore () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104692);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104693);return validscore;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setValidscore (int validscore) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104694);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104695);this.validscore = validscore;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public long getAlgoSort () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104696);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104697);return algoSort;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setAlgoSort (long algoSort) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104698);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104699);this.algoSort = algoSort;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public int getFoldFlag () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104700);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104701);return foldFlag;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setFoldFlag (int foldFlag) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104702);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104703);this.foldFlag = foldFlag;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public String getReason () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104704);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104705);return reason;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setReason (String reason) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104706);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104707);this.reason = reason;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public String getOther () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104708);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104709);return other;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setOther (String other) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104710);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104711);this.other = other;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public String getExpressionAuc () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104712);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104713);return expressionAuc;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setExpressionAuc (String expressionAuc) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104714);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104715);this.expressionAuc = expressionAuc;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public String getPosition () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104716);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104717);return position;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setPosition (String position) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104718);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104719);this.position = position;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public long getAucNumId () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104720);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104721);return aucNumId;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setAucNumId (long aucNumId) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104722);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104723);this.aucNumId = aucNumId;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public long getSource () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104724);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104725);return source;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setSource (long source) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104726);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104727);this.source = source;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public long getRootCatId () {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104728);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104729);return rootCatId;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setRootCatId (long rootCatId) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104730);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104731);this.rootCatId = rootCatId;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public long getLeafCatId() {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104732);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104733);return leafCatId;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setLeafCatId(long leafCatId) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104734);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104735);this.leafCatId = leafCatId;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public String getMainPicJson() {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104736);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104737);return mainPicJson;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setMainPicJson(String mainPicJson) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104738);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104739);this.mainPicJson = mainPicJson;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public String getAppendPicJson() {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104740);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104741);return appendPicJson;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setAppendPicJson(String appendPicJson) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104742);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104743);this.appendPicJson = appendPicJson;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public String getMainComponentJson() {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104744);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104745);return mainComponentJson;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setMainComponentJson(String mainComponentJson) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104746);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104747);this.mainComponentJson = mainComponentJson;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public String getAppendComponentJson() {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104748);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104749);return appendComponentJson;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setAppendComponentJson(String appendComponentJson) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104750);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104751);this.appendComponentJson = appendComponentJson;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public String getAuto() {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104752);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104753);return auto;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setAuto(String auto) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104754);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104755);this.auto = auto;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public long getParentTradeId() {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104756);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104757);return parentTradeId;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setParentTradeId(long parentTradeId) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104758);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104759);this.parentTradeId = parentTradeId;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public long getTradeId() {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104760);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104761);return tradeId;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setTradeId(long tradeId) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104762);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104763);this.tradeId = tradeId;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public String getPersonalizedTag() {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104764);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104765);return personalizedTag;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

    public void setPersonalizedTag(String personalizedTag) {try{__CLR4_1_1028ou28ouluszwixf.R.inc(104766);
        __CLR4_1_1028ou28ouluszwixf.R.inc(104767);this.personalizedTag = personalizedTag;
    }finally{__CLR4_1_1028ou28ouluszwixf.R.flushNeeded();}}

}
