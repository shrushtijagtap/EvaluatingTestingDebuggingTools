/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1600.issue_1699.obj;

import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.json.bvt.issue_1600.issue_1699.def.InnerTypeMEnum;
import com.alibaba.json.bvt.issue_1600.issue_1699.def.RatingDetailIsJoinMEnum;
import com.alibaba.json.bvt.issue_1600.issue_1699.def.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.Map;

/**
 *
 */
public class RatingDetailBO implements Serializable {public static class __CLR4_5_21d441d44lusvnato{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,63792,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long serialVersionUID = 6413142622719509002L;

    /**
     * *
     */
    private Long id;

    /**
     * \u7528\u6237ID
     */
    private Long userId;

    /**
     * \u7528\u6237NICK
     */
    private String userNick;

    /**
     * \u6d88\u606fID
     */
    private Long mesId;

    /**
     * \u4e8b\u4ef6\u7c7b\u578b\uff0c \u679a\u4e3e\u503c\u53c2\u7167\uff1ara_event_object.type
     */
    private String eventType;

    /**
     * \u552f\u4e00\u53bb\u91cd\u53f7
     */
    private String bizId;

    /**
     * \u5e8f\u5217\u53f7
     */
    private Integer indexNum;

    /**
     * \u4e1a\u52a1\u7c7b\u578b\uff08\u540c\u539f\u59cb\u6d88\u606f)
     */
    private String bizType;

    /**
     * \u4e1a\u52a1\u4ea4\u6613\u53f7
     */
    private String outBizId;

    /**
     * \u4e3b\u8ba2\u5355ID
     */
    private Long pTradeId;

    /**
     * \u5b50\u8ba2\u5355ID
     */
    private Long tradeId;

    /**
     * \u4e1a\u52a1\u4ea4\u6613\u65f6\u95f4
     */
    private Date bizTime;

    /**
     * \u6d88\u606f\u63a5\u6536\u65f6\u95f4
     */
    private Date mesReceiveTime;

    /**
     * \u5904\u7406\u65f6\u95f4
     */
    private Date dealTime;

    /**
     * \u8be6\u5355\u79d1\u76ee\u7f16\u53f7
     */
    private Long itemId;

    /**
     * \u8be6\u5355\u7c7b\u578b\uff1a 1\u3001\u666e\u901a\u8be6\u5355 2\u3001\u5206\u6210\u8be6\u5355 3\u3001\u9884\u6536\u5206\u6210\u8be6\u5355
     */
    private RatingDetailTypeMEnum detailType;

    /**
     * \u539f\u59cb\u91d1\u989d
     */
    private BigDecimal quantity;

    /**
     * \u91d1\u989d
     */
    private BigDecimal amount;

    /**
     * \u8d39\u7387\u7f16\u53f7
     */
    private Long rateDefineId;

    /**
     * \u8ba1\u8d39\u56e0\u5b50
     */
    private BigDecimal proration;

    /**
     * \u4ea7\u54c1\u7f16\u53f7
     */
    private Long prodId;

    /**
     * \u6269\u5c55\u4fe1\u606f
     */
    private Map<String, String> extendInfo;

    private Map<String, String> rateParams;

    private Currency currency;

    private InnerTypeMEnum innerTable;
    private Long innerId;

    public Map<String, String> getRateParams() {try{__CLR4_5_21d441d44lusvnato.R.inc(63652);
        __CLR4_5_21d441d44lusvnato.R.inc(63653);return rateParams;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setRateParams(Map<String, String> rateParams) {try{__CLR4_5_21d441d44lusvnato.R.inc(63654);
        __CLR4_5_21d441d44lusvnato.R.inc(63655);this.rateParams = rateParams;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public Currency getCurrency() {try{__CLR4_5_21d441d44lusvnato.R.inc(63656);
        __CLR4_5_21d441d44lusvnato.R.inc(63657);return currency;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setCurrency(Currency currency) {try{__CLR4_5_21d441d44lusvnato.R.inc(63658);
        __CLR4_5_21d441d44lusvnato.R.inc(63659);this.currency = currency;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public InnerTypeMEnum getInnerTable() {try{__CLR4_5_21d441d44lusvnato.R.inc(63660);
        __CLR4_5_21d441d44lusvnato.R.inc(63661);return innerTable;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setInnerTable(InnerTypeMEnum innerTable) {try{__CLR4_5_21d441d44lusvnato.R.inc(63662);
        __CLR4_5_21d441d44lusvnato.R.inc(63663);this.innerTable = innerTable;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public Long getInnerId() {try{__CLR4_5_21d441d44lusvnato.R.inc(63664);
        __CLR4_5_21d441d44lusvnato.R.inc(63665);return innerId;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setInnerId(Long innerId) {try{__CLR4_5_21d441d44lusvnato.R.inc(63666);
        __CLR4_5_21d441d44lusvnato.R.inc(63667);this.innerId = innerId;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setExtendInfo(Map<String, String> extendInfo) {try{__CLR4_5_21d441d44lusvnato.R.inc(63668);
        __CLR4_5_21d441d44lusvnato.R.inc(63669);this.extendInfo = extendInfo;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    /**
     * \u73af\u5883\u6807\u8bc6
     */
    private String ownSign;

    /**
     * \u5e10\u5355ID\uff0c \u8bb0\u8d26\u7ed3\u675f\u540e\u56de\u5199
     */
    private Long billId;

    /**
     * \u7248\u672c\u7f16\u53f7
     */
    private Integer version;

    /**
     * \u662f\u5426\u5408\u5e76\u4ed8\u6b3e\uff1a 0\u3001\u5426 1\u3001\u662f
     */
    private RatingDetailIsJoinMEnum isJoin;

    /**
     * \u4f18\u5148\u7ea7\uff0c \u503c\u8d8a\u5927\uff0c\u4f18\u5148\u7ea7\u8d8a\u9ad8
     */
    private Integer priority;

    /**
     * \u72b6\u6001\uff1a 0\u3001\u521d\u59cb 1\u3001\u5904\u7406\u6210\u529f\uff1b 2\u3001\u5904\u7406\u5931\u8d25\uff1b 3\u3001\u7b49\u5f85\u5408\u5e76\uff1b
     */
    private RatingDetailStatusMEnum status;

    /**
     * \u521b\u5efa\u65f6\u95f4
     */
    private Date gmtCreate;

    /**
     * \u4fee\u6539\u65f6\u95f4
     */
    private Date gmtModified;

    /**
     * \u4ea4\u6613\u9879\u76ee\uff1a0\u3001\u4ea4\u6613\uff1b1\u3001\u9000\u6b3e
     */
    private FeeTypeMEnum feeType;

    public Long getId() {try{__CLR4_5_21d441d44lusvnato.R.inc(63670);
        __CLR4_5_21d441d44lusvnato.R.inc(63671);return id;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setId(Long id) {try{__CLR4_5_21d441d44lusvnato.R.inc(63672);
        __CLR4_5_21d441d44lusvnato.R.inc(63673);this.id = id;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public Long getUserId() {try{__CLR4_5_21d441d44lusvnato.R.inc(63674);
        __CLR4_5_21d441d44lusvnato.R.inc(63675);return userId;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setUserId(Long userId) {try{__CLR4_5_21d441d44lusvnato.R.inc(63676);
        __CLR4_5_21d441d44lusvnato.R.inc(63677);this.userId = userId;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public String getUserNick() {try{__CLR4_5_21d441d44lusvnato.R.inc(63678);
        __CLR4_5_21d441d44lusvnato.R.inc(63679);return userNick;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setUserNick(String userNick) {try{__CLR4_5_21d441d44lusvnato.R.inc(63680);
        __CLR4_5_21d441d44lusvnato.R.inc(63681);this.userNick = userNick;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public Long getMesId() {try{__CLR4_5_21d441d44lusvnato.R.inc(63682);
        __CLR4_5_21d441d44lusvnato.R.inc(63683);return mesId;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setMesId(Long mesId) {try{__CLR4_5_21d441d44lusvnato.R.inc(63684);
        __CLR4_5_21d441d44lusvnato.R.inc(63685);this.mesId = mesId;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public String getEventType() {try{__CLR4_5_21d441d44lusvnato.R.inc(63686);
        __CLR4_5_21d441d44lusvnato.R.inc(63687);return eventType;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setEventType(String eventType) {try{__CLR4_5_21d441d44lusvnato.R.inc(63688);
        __CLR4_5_21d441d44lusvnato.R.inc(63689);this.eventType = eventType;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public String getBizId() {try{__CLR4_5_21d441d44lusvnato.R.inc(63690);
        __CLR4_5_21d441d44lusvnato.R.inc(63691);return bizId;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setBizId(String bizId) {try{__CLR4_5_21d441d44lusvnato.R.inc(63692);
        __CLR4_5_21d441d44lusvnato.R.inc(63693);this.bizId = bizId;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public String getBizType() {try{__CLR4_5_21d441d44lusvnato.R.inc(63694);
        __CLR4_5_21d441d44lusvnato.R.inc(63695);return bizType;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setBizType(String bizType) {try{__CLR4_5_21d441d44lusvnato.R.inc(63696);
        __CLR4_5_21d441d44lusvnato.R.inc(63697);this.bizType = bizType;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public String getOutBizId() {try{__CLR4_5_21d441d44lusvnato.R.inc(63698);
        __CLR4_5_21d441d44lusvnato.R.inc(63699);return outBizId;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setOutBizId(String outBizId) {try{__CLR4_5_21d441d44lusvnato.R.inc(63700);
        __CLR4_5_21d441d44lusvnato.R.inc(63701);this.outBizId = outBizId;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public Long getpTradeId() {try{__CLR4_5_21d441d44lusvnato.R.inc(63702);
        __CLR4_5_21d441d44lusvnato.R.inc(63703);return pTradeId;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setpTradeId(Long pTradeId) {try{__CLR4_5_21d441d44lusvnato.R.inc(63704);
        __CLR4_5_21d441d44lusvnato.R.inc(63705);this.pTradeId = pTradeId;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public Long getTradeId() {try{__CLR4_5_21d441d44lusvnato.R.inc(63706);
        __CLR4_5_21d441d44lusvnato.R.inc(63707);return tradeId;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setTradeId(Long tradeId) {try{__CLR4_5_21d441d44lusvnato.R.inc(63708);
        __CLR4_5_21d441d44lusvnato.R.inc(63709);this.tradeId = tradeId;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public Date getBizTime() {try{__CLR4_5_21d441d44lusvnato.R.inc(63710);
        __CLR4_5_21d441d44lusvnato.R.inc(63711);return bizTime;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setBizTime(Date bizTime) {try{__CLR4_5_21d441d44lusvnato.R.inc(63712);
        __CLR4_5_21d441d44lusvnato.R.inc(63713);this.bizTime = bizTime;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public Date getMesReceiveTime() {try{__CLR4_5_21d441d44lusvnato.R.inc(63714);
        __CLR4_5_21d441d44lusvnato.R.inc(63715);return mesReceiveTime;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setMesReceiveTime(Date mesReceiveTime) {try{__CLR4_5_21d441d44lusvnato.R.inc(63716);
        __CLR4_5_21d441d44lusvnato.R.inc(63717);this.mesReceiveTime = mesReceiveTime;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public Date getDealTime() {try{__CLR4_5_21d441d44lusvnato.R.inc(63718);
        __CLR4_5_21d441d44lusvnato.R.inc(63719);return dealTime;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setDealTime(Date dealTime) {try{__CLR4_5_21d441d44lusvnato.R.inc(63720);
        __CLR4_5_21d441d44lusvnato.R.inc(63721);this.dealTime = dealTime;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public Long getItemId() {try{__CLR4_5_21d441d44lusvnato.R.inc(63722);
        __CLR4_5_21d441d44lusvnato.R.inc(63723);return itemId;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setItemId(Long itemId) {try{__CLR4_5_21d441d44lusvnato.R.inc(63724);
        __CLR4_5_21d441d44lusvnato.R.inc(63725);this.itemId = itemId;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public Long getRateDefineId() {try{__CLR4_5_21d441d44lusvnato.R.inc(63726);
        __CLR4_5_21d441d44lusvnato.R.inc(63727);return rateDefineId;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setRateDefineId(Long rateDefineId) {try{__CLR4_5_21d441d44lusvnato.R.inc(63728);
        __CLR4_5_21d441d44lusvnato.R.inc(63729);this.rateDefineId = rateDefineId;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public Long getProdId() {try{__CLR4_5_21d441d44lusvnato.R.inc(63730);
        __CLR4_5_21d441d44lusvnato.R.inc(63731);return prodId;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setProdId(Long prodId) {try{__CLR4_5_21d441d44lusvnato.R.inc(63732);
        __CLR4_5_21d441d44lusvnato.R.inc(63733);this.prodId = prodId;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public String getOwnSign() {try{__CLR4_5_21d441d44lusvnato.R.inc(63734);
        __CLR4_5_21d441d44lusvnato.R.inc(63735);return ownSign;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setOwnSign(String ownSign) {try{__CLR4_5_21d441d44lusvnato.R.inc(63736);
        __CLR4_5_21d441d44lusvnato.R.inc(63737);this.ownSign = ownSign;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public Long getBillId() {try{__CLR4_5_21d441d44lusvnato.R.inc(63738);
        __CLR4_5_21d441d44lusvnato.R.inc(63739);return billId;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setBillId(Long billId) {try{__CLR4_5_21d441d44lusvnato.R.inc(63740);
        __CLR4_5_21d441d44lusvnato.R.inc(63741);this.billId = billId;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public Integer getVersion() {try{__CLR4_5_21d441d44lusvnato.R.inc(63742);
        __CLR4_5_21d441d44lusvnato.R.inc(63743);return version;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setVersion(Integer version) {try{__CLR4_5_21d441d44lusvnato.R.inc(63744);
        __CLR4_5_21d441d44lusvnato.R.inc(63745);this.version = version;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public Integer getPriority() {try{__CLR4_5_21d441d44lusvnato.R.inc(63746);
        __CLR4_5_21d441d44lusvnato.R.inc(63747);return priority;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setPriority(Integer priority) {try{__CLR4_5_21d441d44lusvnato.R.inc(63748);
        __CLR4_5_21d441d44lusvnato.R.inc(63749);this.priority = priority;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public Date getGmtCreate() {try{__CLR4_5_21d441d44lusvnato.R.inc(63750);
        __CLR4_5_21d441d44lusvnato.R.inc(63751);return gmtCreate;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setGmtCreate(Date gmtCreate) {try{__CLR4_5_21d441d44lusvnato.R.inc(63752);
        __CLR4_5_21d441d44lusvnato.R.inc(63753);this.gmtCreate = gmtCreate;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public Date getGmtModified() {try{__CLR4_5_21d441d44lusvnato.R.inc(63754);
        __CLR4_5_21d441d44lusvnato.R.inc(63755);return gmtModified;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setGmtModified(Date gmtModified) {try{__CLR4_5_21d441d44lusvnato.R.inc(63756);
        __CLR4_5_21d441d44lusvnato.R.inc(63757);this.gmtModified = gmtModified;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public RatingDetailTypeMEnum getDetailType() {try{__CLR4_5_21d441d44lusvnato.R.inc(63758);
        __CLR4_5_21d441d44lusvnato.R.inc(63759);return detailType;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setDetailType(RatingDetailTypeMEnum detailType) {try{__CLR4_5_21d441d44lusvnato.R.inc(63760);
        __CLR4_5_21d441d44lusvnato.R.inc(63761);this.detailType = detailType;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public RatingDetailIsJoinMEnum getIsJoin() {try{__CLR4_5_21d441d44lusvnato.R.inc(63762);
        __CLR4_5_21d441d44lusvnato.R.inc(63763);return isJoin;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setIsJoin(RatingDetailIsJoinMEnum isJoin) {try{__CLR4_5_21d441d44lusvnato.R.inc(63764);
        __CLR4_5_21d441d44lusvnato.R.inc(63765);this.isJoin = isJoin;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public RatingDetailStatusMEnum getStatus() {try{__CLR4_5_21d441d44lusvnato.R.inc(63766);
        __CLR4_5_21d441d44lusvnato.R.inc(63767);return status;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setStatus(RatingDetailStatusMEnum status) {try{__CLR4_5_21d441d44lusvnato.R.inc(63768);
        __CLR4_5_21d441d44lusvnato.R.inc(63769);this.status = status;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public FeeTypeMEnum getFeeType() {try{__CLR4_5_21d441d44lusvnato.R.inc(63770);
        __CLR4_5_21d441d44lusvnato.R.inc(63771);return feeType;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setFeeType(FeeTypeMEnum feeType) {try{__CLR4_5_21d441d44lusvnato.R.inc(63772);
        __CLR4_5_21d441d44lusvnato.R.inc(63773);this.feeType = feeType;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public Map<String, String> getExtendInfo() {try{__CLR4_5_21d441d44lusvnato.R.inc(63774);
        __CLR4_5_21d441d44lusvnato.R.inc(63775);return extendInfo;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public BigDecimal getQuantity() {try{__CLR4_5_21d441d44lusvnato.R.inc(63776);
        __CLR4_5_21d441d44lusvnato.R.inc(63777);return quantity;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setQuantity(BigDecimal quantity) {try{__CLR4_5_21d441d44lusvnato.R.inc(63778);
        __CLR4_5_21d441d44lusvnato.R.inc(63779);this.quantity = quantity;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public BigDecimal getAmount() {try{__CLR4_5_21d441d44lusvnato.R.inc(63780);
        __CLR4_5_21d441d44lusvnato.R.inc(63781);return amount;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setAmount(BigDecimal amount) {try{__CLR4_5_21d441d44lusvnato.R.inc(63782);
        __CLR4_5_21d441d44lusvnato.R.inc(63783);this.amount = amount;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public BigDecimal getProration() {try{__CLR4_5_21d441d44lusvnato.R.inc(63784);
        __CLR4_5_21d441d44lusvnato.R.inc(63785);return proration;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setProration(BigDecimal proration) {try{__CLR4_5_21d441d44lusvnato.R.inc(63786);
        __CLR4_5_21d441d44lusvnato.R.inc(63787);this.proration = proration;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public Integer getIndexNum() {try{__CLR4_5_21d441d44lusvnato.R.inc(63788);
        __CLR4_5_21d441d44lusvnato.R.inc(63789);return indexNum;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

    public void setIndexNum(Integer indexNum) {try{__CLR4_5_21d441d44lusvnato.R.inc(63790);
        __CLR4_5_21d441d44lusvnato.R.inc(63791);this.indexNum = indexNum;
    }finally{__CLR4_5_21d441d44lusvnato.R.flushNeeded();}}

}
