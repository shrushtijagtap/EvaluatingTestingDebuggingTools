/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1600.issue_1699.obj;

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
public class RatingDetailBO implements Serializable {public static class __CLR4_1_101c671c67lusqkaex{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,62571,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public Map<String, String> getRateParams() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62431);
        __CLR4_1_101c671c67lusqkaex.R.inc(62432);return rateParams;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setRateParams(Map<String, String> rateParams) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62433);
        __CLR4_1_101c671c67lusqkaex.R.inc(62434);this.rateParams = rateParams;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public Currency getCurrency() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62435);
        __CLR4_1_101c671c67lusqkaex.R.inc(62436);return currency;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setCurrency(Currency currency) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62437);
        __CLR4_1_101c671c67lusqkaex.R.inc(62438);this.currency = currency;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public InnerTypeMEnum getInnerTable() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62439);
        __CLR4_1_101c671c67lusqkaex.R.inc(62440);return innerTable;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setInnerTable(InnerTypeMEnum innerTable) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62441);
        __CLR4_1_101c671c67lusqkaex.R.inc(62442);this.innerTable = innerTable;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public Long getInnerId() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62443);
        __CLR4_1_101c671c67lusqkaex.R.inc(62444);return innerId;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setInnerId(Long innerId) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62445);
        __CLR4_1_101c671c67lusqkaex.R.inc(62446);this.innerId = innerId;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setExtendInfo(Map<String, String> extendInfo) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62447);
        __CLR4_1_101c671c67lusqkaex.R.inc(62448);this.extendInfo = extendInfo;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

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

    public Long getId() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62449);
        __CLR4_1_101c671c67lusqkaex.R.inc(62450);return id;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setId(Long id) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62451);
        __CLR4_1_101c671c67lusqkaex.R.inc(62452);this.id = id;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public Long getUserId() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62453);
        __CLR4_1_101c671c67lusqkaex.R.inc(62454);return userId;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setUserId(Long userId) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62455);
        __CLR4_1_101c671c67lusqkaex.R.inc(62456);this.userId = userId;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public String getUserNick() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62457);
        __CLR4_1_101c671c67lusqkaex.R.inc(62458);return userNick;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setUserNick(String userNick) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62459);
        __CLR4_1_101c671c67lusqkaex.R.inc(62460);this.userNick = userNick;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public Long getMesId() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62461);
        __CLR4_1_101c671c67lusqkaex.R.inc(62462);return mesId;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setMesId(Long mesId) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62463);
        __CLR4_1_101c671c67lusqkaex.R.inc(62464);this.mesId = mesId;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public String getEventType() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62465);
        __CLR4_1_101c671c67lusqkaex.R.inc(62466);return eventType;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setEventType(String eventType) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62467);
        __CLR4_1_101c671c67lusqkaex.R.inc(62468);this.eventType = eventType;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public String getBizId() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62469);
        __CLR4_1_101c671c67lusqkaex.R.inc(62470);return bizId;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setBizId(String bizId) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62471);
        __CLR4_1_101c671c67lusqkaex.R.inc(62472);this.bizId = bizId;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public String getBizType() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62473);
        __CLR4_1_101c671c67lusqkaex.R.inc(62474);return bizType;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setBizType(String bizType) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62475);
        __CLR4_1_101c671c67lusqkaex.R.inc(62476);this.bizType = bizType;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public String getOutBizId() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62477);
        __CLR4_1_101c671c67lusqkaex.R.inc(62478);return outBizId;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setOutBizId(String outBizId) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62479);
        __CLR4_1_101c671c67lusqkaex.R.inc(62480);this.outBizId = outBizId;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public Long getpTradeId() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62481);
        __CLR4_1_101c671c67lusqkaex.R.inc(62482);return pTradeId;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setpTradeId(Long pTradeId) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62483);
        __CLR4_1_101c671c67lusqkaex.R.inc(62484);this.pTradeId = pTradeId;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public Long getTradeId() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62485);
        __CLR4_1_101c671c67lusqkaex.R.inc(62486);return tradeId;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setTradeId(Long tradeId) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62487);
        __CLR4_1_101c671c67lusqkaex.R.inc(62488);this.tradeId = tradeId;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public Date getBizTime() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62489);
        __CLR4_1_101c671c67lusqkaex.R.inc(62490);return bizTime;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setBizTime(Date bizTime) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62491);
        __CLR4_1_101c671c67lusqkaex.R.inc(62492);this.bizTime = bizTime;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public Date getMesReceiveTime() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62493);
        __CLR4_1_101c671c67lusqkaex.R.inc(62494);return mesReceiveTime;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setMesReceiveTime(Date mesReceiveTime) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62495);
        __CLR4_1_101c671c67lusqkaex.R.inc(62496);this.mesReceiveTime = mesReceiveTime;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public Date getDealTime() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62497);
        __CLR4_1_101c671c67lusqkaex.R.inc(62498);return dealTime;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setDealTime(Date dealTime) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62499);
        __CLR4_1_101c671c67lusqkaex.R.inc(62500);this.dealTime = dealTime;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public Long getItemId() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62501);
        __CLR4_1_101c671c67lusqkaex.R.inc(62502);return itemId;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setItemId(Long itemId) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62503);
        __CLR4_1_101c671c67lusqkaex.R.inc(62504);this.itemId = itemId;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public Long getRateDefineId() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62505);
        __CLR4_1_101c671c67lusqkaex.R.inc(62506);return rateDefineId;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setRateDefineId(Long rateDefineId) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62507);
        __CLR4_1_101c671c67lusqkaex.R.inc(62508);this.rateDefineId = rateDefineId;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public Long getProdId() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62509);
        __CLR4_1_101c671c67lusqkaex.R.inc(62510);return prodId;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setProdId(Long prodId) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62511);
        __CLR4_1_101c671c67lusqkaex.R.inc(62512);this.prodId = prodId;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public String getOwnSign() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62513);
        __CLR4_1_101c671c67lusqkaex.R.inc(62514);return ownSign;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setOwnSign(String ownSign) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62515);
        __CLR4_1_101c671c67lusqkaex.R.inc(62516);this.ownSign = ownSign;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public Long getBillId() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62517);
        __CLR4_1_101c671c67lusqkaex.R.inc(62518);return billId;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setBillId(Long billId) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62519);
        __CLR4_1_101c671c67lusqkaex.R.inc(62520);this.billId = billId;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public Integer getVersion() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62521);
        __CLR4_1_101c671c67lusqkaex.R.inc(62522);return version;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setVersion(Integer version) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62523);
        __CLR4_1_101c671c67lusqkaex.R.inc(62524);this.version = version;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public Integer getPriority() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62525);
        __CLR4_1_101c671c67lusqkaex.R.inc(62526);return priority;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setPriority(Integer priority) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62527);
        __CLR4_1_101c671c67lusqkaex.R.inc(62528);this.priority = priority;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public Date getGmtCreate() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62529);
        __CLR4_1_101c671c67lusqkaex.R.inc(62530);return gmtCreate;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setGmtCreate(Date gmtCreate) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62531);
        __CLR4_1_101c671c67lusqkaex.R.inc(62532);this.gmtCreate = gmtCreate;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public Date getGmtModified() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62533);
        __CLR4_1_101c671c67lusqkaex.R.inc(62534);return gmtModified;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setGmtModified(Date gmtModified) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62535);
        __CLR4_1_101c671c67lusqkaex.R.inc(62536);this.gmtModified = gmtModified;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public RatingDetailTypeMEnum getDetailType() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62537);
        __CLR4_1_101c671c67lusqkaex.R.inc(62538);return detailType;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setDetailType(RatingDetailTypeMEnum detailType) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62539);
        __CLR4_1_101c671c67lusqkaex.R.inc(62540);this.detailType = detailType;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public RatingDetailIsJoinMEnum getIsJoin() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62541);
        __CLR4_1_101c671c67lusqkaex.R.inc(62542);return isJoin;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setIsJoin(RatingDetailIsJoinMEnum isJoin) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62543);
        __CLR4_1_101c671c67lusqkaex.R.inc(62544);this.isJoin = isJoin;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public RatingDetailStatusMEnum getStatus() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62545);
        __CLR4_1_101c671c67lusqkaex.R.inc(62546);return status;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setStatus(RatingDetailStatusMEnum status) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62547);
        __CLR4_1_101c671c67lusqkaex.R.inc(62548);this.status = status;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public FeeTypeMEnum getFeeType() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62549);
        __CLR4_1_101c671c67lusqkaex.R.inc(62550);return feeType;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setFeeType(FeeTypeMEnum feeType) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62551);
        __CLR4_1_101c671c67lusqkaex.R.inc(62552);this.feeType = feeType;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public Map<String, String> getExtendInfo() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62553);
        __CLR4_1_101c671c67lusqkaex.R.inc(62554);return extendInfo;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public BigDecimal getQuantity() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62555);
        __CLR4_1_101c671c67lusqkaex.R.inc(62556);return quantity;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setQuantity(BigDecimal quantity) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62557);
        __CLR4_1_101c671c67lusqkaex.R.inc(62558);this.quantity = quantity;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public BigDecimal getAmount() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62559);
        __CLR4_1_101c671c67lusqkaex.R.inc(62560);return amount;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setAmount(BigDecimal amount) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62561);
        __CLR4_1_101c671c67lusqkaex.R.inc(62562);this.amount = amount;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public BigDecimal getProration() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62563);
        __CLR4_1_101c671c67lusqkaex.R.inc(62564);return proration;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setProration(BigDecimal proration) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62565);
        __CLR4_1_101c671c67lusqkaex.R.inc(62566);this.proration = proration;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public Integer getIndexNum() {try{__CLR4_1_101c671c67lusqkaex.R.inc(62567);
        __CLR4_1_101c671c67lusqkaex.R.inc(62568);return indexNum;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

    public void setIndexNum(Integer indexNum) {try{__CLR4_1_101c671c67lusqkaex.R.inc(62569);
        __CLR4_1_101c671c67lusqkaex.R.inc(62570);this.indexNum = indexNum;
    }finally{__CLR4_1_101c671c67lusqkaex.R.flushNeeded();}}

}
