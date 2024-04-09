/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class Bug_for_ludong extends TestCase {static class __CLR4_1_10156j156jlusqk4c2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,53595,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_ludong() throws Exception {__CLR4_1_10156j156jlusqk4c2.R.globalSliceStart(getClass().getName(),53371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105kgxex156j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10156j156jlusqk4c2.R.rethrow($CLV_t2$);}finally{__CLR4_1_10156j156jlusqk4c2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_ludong.test_for_ludong",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),53371,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105kgxex156j() throws Exception{try{__CLR4_1_10156j156jlusqk4c2.R.inc(53371);
        __CLR4_1_10156j156jlusqk4c2.R.inc(53372);String msg = "{\"changedItems\":[{\"attribute\":\"new\",\"benefitCustomer\":\"chance130320584431\",\"benefitCustomerContactor\":5809917,\"benefitCustomerId\":2001385618,\"bizStatus\":\"audit_pass\",\"creator\":\"dowjons\",\"defaultBiz\":true,\"discountRate\":100,\"domain\":\"nirvana\",\"executeAmount\":3688,\"gmtCreate\":1367856000000,\"gmtModified\":1368374400000,\"gmtSign\":1367856000000,\"id\":321600616,\"isDeleted\":\"n\",\"itemNum\":\"W1305070000053_1\",\"lastOperType\":\"finance_pass_rollback\",\"memberId\":\"3592950865\",\"modifier\":\"haiquan.zhanghq\",\"num\":12,\"oppId\":103722314,\"orderId\":315749401,\"parentId\":0,\"paymentAmount\":0,\"paymentStatus\":\"payment_none\",\"policyId\":63149,\"price\":3688,\"productCode\":\"pc060\",\"purchaseType\":\"bought\",\"quotedPrice\":3688,\"salesId\":\"tiandan\",\"salesOrgFullid\":\"/10/1/30/101/160/1001/1051/\",\"serviceSupplyCompany\":\"B50\",\"signSalesId\":\"tiandan\",\"signSalesOrgFullId\":\"/10/1/30/101/160/1001/1051/\",\"traceChange\":true,\"ultimatePrice\":3688,\"unServiceDay\":0,\"unit\":\"M\",\"unvoucherAmount\":3688,\"voucherStatus\":\"voucher_none\"}],\"context\":{\"payAmount\":3688,\"payDate\":1368442850437,\"paymentStatus\":\"payment_success\"},\"generateTime\":1368442868624,\"msgType\":\"PAYMENT\",\"orderNumber\":\"W1305070000053\"}";

        __CLR4_1_10156j156jlusqk4c2.R.inc(53373);OrderInternalDto dto = JSON.parseObject(msg, OrderInternalDto.class);
    }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

    public static class OrderInternalDto implements Serializable {

        private static final long   serialVersionUID = 3228508302993121205L;

        /* \u5bf9\u8c61\u751f\u6210\u7684\u65f6\u95f4 */

        private Date                generateTime;

        /** \u8ba2\u5355\u53f7 */

        private String              orderNumber;

        /** \u5bf9\u8c61\u7684\u4e1a\u52a1\u72b6\u6001 */

        private MSGTYPE             msgType;

        /** \u8ba2\u5355\u7684\u77ac\u65f6\u72b6\u6001 */

        // private List<OrdOrderItemDto> instantItems;

        /** \u53d1\u751f\u72b6\u6001\u53d8\u5316\u7684\u8ba2\u5355\u884c\u5217,\u6bd4\u5982\u5230\u6b3e\u53ea\u662f\u5bf9\u4e00\u4e2a\u8ba2\u5355\u884c\u53d1\u751f\u5230\u8d26\u884c\u4e3a */

        private List<OrdOrderItem>  changedItems;

        /** \u4e0a\u4e0b\u6587\u53c2\u6570 */

        private Map<String, Object> context;

        public OrderInternalDto(){try{__CLR4_1_10156j156jlusqk4c2.R.inc(53374);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53375);this.generateTime = new Date();

            __CLR4_1_10156j156jlusqk4c2.R.inc(53376);context = new HashMap<String, Object>();

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setContext(Map<String, Object> context) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53377);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53378);if ((((context == null)&&(__CLR4_1_10156j156jlusqk4c2.R.iget(53379)!=0|true))||(__CLR4_1_10156j156jlusqk4c2.R.iget(53380)==0&false))) {__CLR4_1_10156j156jlusqk4c2.R.inc(53381);return;

            }__CLR4_1_10156j156jlusqk4c2.R.inc(53382);this.context = context;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53383);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53384);return JSON.toJSONString(this);

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

    }

    public static class OrdOrderItem implements Cloneable, Serializable {

        public static String         ORDER_ID                   = "orderId";

        private Object               orderId;

        public static String         PARENT_ID                  = "parentId";

        private Integer              parentId;

        public static String         SERIAL_NUM                 = "serialNum";

        private String               serialNum;

        public static String         ITEM_NUM                   = "itemNum";

        private String               itemNum;

        public static String         PURCHASE_TYPE              = "purchaseType";

        private String               purchaseType;

        public static String         ATTRIBUTE                  = "attribute";

        private String               attribute;

        public static String         MEMBER_ID                  = "memberId";

        private String               memberId;

        public static String         PRODUCT_CODE               = "productCode";

        private String               productCode;

        public static String         NUM                        = "num";

        private Integer              num;

        public static String         UNIT                       = "unit";

        private String               unit;

        public static String         PRICE                      = "price";

        private java.math.BigDecimal price;

        public static String         DISCOUNT_RATE              = "discountRate";

        private java.math.BigDecimal discountRate;

        public static String         QUOTED_PRICE               = "quotedPrice";

        private java.math.BigDecimal quotedPrice;

        public static String         ULTIMATE_PRICE             = "ultimatePrice";

        private java.math.BigDecimal ultimatePrice;

        public static String         EXECUTE_AMOUNT             = "executeAmount";

        private java.math.BigDecimal executeAmount;

        public static String         GMT_TARGET_BEGIN           = "gmtTargetBegin";

        private java.util.Date       gmtTargetBegin;

        public static String         GMT_TARGET_END             = "gmtTargetEnd";

        private java.util.Date       gmtTargetEnd;

        public static String         GMT_ACTUAL_BEGIN           = "gmtActualBegin";

        private java.util.Date       gmtActualBegin;

        public static String         GMT_ACTUAL_END             = "gmtActualEnd";

        private java.util.Date       gmtActualEnd;

        public static String         SERVICE_SUPPLY_COMPANY     = "serviceSupplyCompany";

        private String               serviceSupplyCompany;

        public static String         BENEFIT_CUSTOMER           = "benefitCustomer";

        private String               benefitCustomer;

        public static String         BENEFIT_CUSTOMER_ID        = "benefitCustomerId";

        private Integer              benefitCustomerId;

        public static String         BENEFIT_CUSTOMER_CONTACTOR = "benefitCustomerContactor";

        private Integer              benefitCustomerContactor;

        public static String         BIZ_STATUS                 = "bizStatus";

        private String               bizStatus;

        public static String         VOUCHER_STATUS             = "voucherStatus";

        private String               voucherStatus;

        public static String         PAYMENT_STATUS             = "paymentStatus";

        private String               paymentStatus;

        public static String         PAYMENT_AMOUNT             = "paymentAmount";

        private java.math.BigDecimal paymentAmount;

        public static String         POLICY_ID                  = "policyId";

        private Integer              policyId;

        public static String         MEMO                       = "memo";

        private String               memo;

        public static String         SUPPORTER                  = "supporter";

        private String               supporter;

        public static String         SUPPORTER_ORG_ID           = "supporterOrgId";

        private Integer              supporterOrgId;

        public static String         SUPPORTER_ORG_FULLID       = "supporterOrgFullid";

        private String               supporterOrgFullid;

        public static String         SALES_ORG_FULLID           = "salesOrgFullid";

        private String               salesOrgFullid;

        public static String         SIGN_SALES_ORG_FULLID      = "signSalesOrgFullId";

        private String               signSalesOrgFullId;

        public static String         OPP_ID                     = "oppId";

        private Integer              oppId;

        public static String         DOMAIN                     = "domain";

        private String               domain;

        public static String         UN_SERVICE_DAY             = "unServiceDay";

        private java.math.BigDecimal unServiceDay;

        public static String         PROCESS_ID                 = "processId";

        private Long                 processId;

        public static String         LAST_OPER_TYPE             = "lastOperType";

        private String               lastOperType;

        public static String         UNVOUCHER_AMOUNT           = "unvoucherAmount";

        private java.math.BigDecimal unvoucherAmount;

        public static String         GMT_VOUCHER_RECEIVE        = "gmtVoucherReceive";

        private java.util.Date       gmtVoucherReceive;

        public static String         GMT_PAYMENT_REMIT          = "gmtPaymentRemit";

        private java.util.Date       gmtPaymentRemit;

        public static String         SERVICE_JUMP_DAYS          = "serviceJumpDays";

        private Integer              serviceJumpDays;

        public static String         SIGN_SALES_ID              = "signSalesId";

        private String               signSalesId;

        public static String         SALES_ORG_ID               = "salesOrgId";

        private Integer              salesOrgId;

        public static String         SIGN_SALES_ORG_ID          = "signSalesOrgId";

        private Integer              signSalesOrgId;

        public Integer getSignSalesOrgId() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53385);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53386);return signSalesOrgId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setSignSalesOrgId(Integer signSalesOrgId) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53387);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53388);this.signSalesOrgId = signSalesOrgId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public Integer getSalesOrgId() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53389);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53390);return salesOrgId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setSalesOrgId(Integer salesOrgId) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53391);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53392);this.salesOrgId = salesOrgId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public static String SIGN_SELLER_COMPANY = "signSellerCompany";

        private String       signSellerCompany;

        public static String BARGAIN_ID          = "bargainId";

        private Integer      bargainId;

        public Integer getBargainId() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53393);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53394);return bargainId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setBargainId(Integer bargainId) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53395);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53396);this.bargainId = bargainId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public String getSignSellerCompany() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53397);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53398);return signSellerCompany;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setSignSellerCompany(String signSellerCompany) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53399);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53400);this.signSellerCompany = signSellerCompany;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        // \u589e\u52a0\u4e86\u65b0\u7b7e\u548c\u7eed\u7b7e\u9500\u552e\u7684id

        public static String SALES_ID = "salesId";

        private String       salesId;

        public String getSalesId() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53401);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53402);return salesId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setSalesId(String salesId) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53403);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53404);this.salesId = salesId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public String getRenewSalesId() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53405);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53406);return renewSalesId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setRenewSalesId(String renewSalesId) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53407);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53408);this.renewSalesId = renewSalesId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public static String   RENEW_SALES_ID = "renewSalesId";

        private String         renewSalesId;

        public static String   GMT_SIGN       = "gmtSign";

        private java.util.Date gmtSign;

        public Object getOrderId() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53409);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53410);return this.orderId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setOrderId(Object orderId) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53411);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53412);this.orderId = orderId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public Integer getParentId() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53413);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53414);return this.parentId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setParentId(Integer parentId) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53415);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53416);this.parentId = parentId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public String getSerialNum() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53417);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53418);return this.serialNum;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setSerialNum(String serialNum) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53419);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53420);this.serialNum = serialNum;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public String getItemNum() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53421);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53422);return this.itemNum;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setItemNum(String itemNum) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53423);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53424);this.itemNum = itemNum;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public String getPurchaseType() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53425);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53426);return this.purchaseType;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setPurchaseType(String purchaseType) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53427);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53428);this.purchaseType = purchaseType;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public String getAttribute() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53429);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53430);return this.attribute;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setAttribute(String attribute) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53431);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53432);this.attribute = attribute;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public String getMemberId() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53433);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53434);return this.memberId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setMemberId(String memberId) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53435);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53436);this.memberId = memberId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public String getProductCode() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53437);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53438);return this.productCode;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setProductCode(String productCode) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53439);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53440);this.productCode = productCode;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public Integer getNum() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53441);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53442);return this.num;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setNum(Integer num) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53443);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53444);this.num = num;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public String getUnit() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53445);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53446);return this.unit;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setUnit(String unit) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53447);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53448);this.unit = unit;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public java.math.BigDecimal getPrice() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53449);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53450);return this.price;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setPrice(java.math.BigDecimal price) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53451);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53452);this.price = price;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public java.math.BigDecimal getDiscountRate() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53453);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53454);return this.discountRate;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setDiscountRate(java.math.BigDecimal discountRate) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53455);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53456);this.discountRate = discountRate;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public java.math.BigDecimal getQuotedPrice() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53457);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53458);return this.quotedPrice;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setQuotedPrice(java.math.BigDecimal quotedPrice) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53459);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53460);this.quotedPrice = quotedPrice;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public java.math.BigDecimal getUltimatePrice() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53461);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53462);return this.ultimatePrice;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setUltimatePrice(java.math.BigDecimal ultimatePrice) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53463);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53464);this.ultimatePrice = ultimatePrice;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public java.math.BigDecimal getExecuteAmount() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53465);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53466);return this.executeAmount;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setExecuteAmount(java.math.BigDecimal executeAmount) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53467);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53468);this.executeAmount = executeAmount;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public java.util.Date getGmtTargetBegin() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53469);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53470);return this.gmtTargetBegin;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setGmtTargetBegin(java.util.Date gmtTargetBegin) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53471);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53472);this.gmtTargetBegin = gmtTargetBegin;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public java.util.Date getGmtTargetEnd() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53473);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53474);return this.gmtTargetEnd;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setGmtTargetEnd(java.util.Date gmtTargetEnd) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53475);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53476);this.gmtTargetEnd = gmtTargetEnd;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public java.util.Date getGmtActualBegin() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53477);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53478);return this.gmtActualBegin;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setGmtActualBegin(java.util.Date gmtActualBegin) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53479);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53480);this.gmtActualBegin = gmtActualBegin;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public java.util.Date getGmtActualEnd() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53481);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53482);return this.gmtActualEnd;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setGmtActualEnd(java.util.Date gmtActualEnd) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53483);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53484);this.gmtActualEnd = gmtActualEnd;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public String getServiceSupplyCompany() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53485);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53486);return this.serviceSupplyCompany;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setServiceSupplyCompany(String serviceSupplyCompany) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53487);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53488);this.serviceSupplyCompany = serviceSupplyCompany;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public String getBenefitCustomer() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53489);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53490);return this.benefitCustomer;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setBenefitCustomer(String benefitCustomer) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53491);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53492);this.benefitCustomer = benefitCustomer;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public Integer getBenefitCustomerId() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53493);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53494);return this.benefitCustomerId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setBenefitCustomerId(Integer benefitCustomerId) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53495);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53496);this.benefitCustomerId = benefitCustomerId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public Integer getBenefitCustomerContactor() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53497);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53498);return this.benefitCustomerContactor;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setBenefitCustomerContactor(Integer benefitCustomerContactor) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53499);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53500);this.benefitCustomerContactor = benefitCustomerContactor;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public String getBizStatus() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53501);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53502);return this.bizStatus;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setBizStatus(String bizStatus) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53503);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53504);this.bizStatus = bizStatus;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public String getVoucherStatus() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53505);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53506);return this.voucherStatus;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setVoucherStatus(String voucherStatus) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53507);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53508);this.voucherStatus = voucherStatus;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public String getPaymentStatus() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53509);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53510);return this.paymentStatus;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setPaymentStatus(String paymentStatus) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53511);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53512);this.paymentStatus = paymentStatus;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public java.math.BigDecimal getPaymentAmount() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53513);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53514);return this.paymentAmount;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setPaymentAmount(java.math.BigDecimal paymentAmount) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53515);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53516);this.paymentAmount = paymentAmount;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public Integer getPolicyId() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53517);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53518);return this.policyId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setPolicyId(Integer policyId) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53519);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53520);this.policyId = policyId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public String getMemo() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53521);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53522);return this.memo;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setMemo(String memo) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53523);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53524);this.memo = memo;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public String getSupporter() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53525);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53526);return this.supporter;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setSupporter(String supporter) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53527);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53528);this.supporter = supporter;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public Integer getSupporterOrgId() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53529);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53530);return this.supporterOrgId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setSupporterOrgId(Integer supporterOrgId) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53531);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53532);this.supporterOrgId = supporterOrgId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public String getSupporterOrgFullid() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53533);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53534);return this.supporterOrgFullid;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setSupporterOrgFullid(String supporterOrgFullid) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53535);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53536);this.supporterOrgFullid = supporterOrgFullid;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public Integer getOppId() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53537);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53538);return this.oppId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setOppId(Integer oppId) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53539);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53540);this.oppId = oppId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public String getDomain() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53541);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53542);return this.domain;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setDomain(String domain) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53543);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53544);this.domain = domain;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public java.math.BigDecimal getUnServiceDay() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53545);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53546);return this.unServiceDay;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setUnServiceDay(java.math.BigDecimal unServiceDay) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53547);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53548);this.unServiceDay = unServiceDay;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public Long getProcessId() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53549);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53550);return this.processId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setProcessId(Long processId) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53551);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53552);this.processId = processId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public String getLastOperType() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53553);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53554);return this.lastOperType;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setLastOperType(String lastOperType) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53555);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53556);this.lastOperType = lastOperType;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public java.math.BigDecimal getUnvoucherAmount() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53557);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53558);return this.unvoucherAmount;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setUnvoucherAmount(java.math.BigDecimal unvoucherAmount) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53559);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53560);this.unvoucherAmount = unvoucherAmount;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public java.util.Date getGmtVoucherReceive() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53561);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53562);return this.gmtVoucherReceive;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setGmtVoucherReceive(java.util.Date gmtVoucherReceive) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53563);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53564);this.gmtVoucherReceive = gmtVoucherReceive;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public java.util.Date getGmtPaymentRemit() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53565);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53566);return this.gmtPaymentRemit;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setGmtPaymentRemit(java.util.Date gmtPaymentRemit) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53567);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53568);this.gmtPaymentRemit = gmtPaymentRemit;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public Integer getServiceJumpDays() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53569);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53570);return this.serviceJumpDays;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setServiceJumpDays(Integer serviceJumpDays) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53571);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53572);this.serviceJumpDays = serviceJumpDays;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        @Override
        public Object clone() throws CloneNotSupportedException {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53573);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53574);return super.clone();

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public String getSignSalesId() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53575);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53576);return signSalesId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setSignSalesId(String signSalesId) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53577);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53578);this.signSalesId = signSalesId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public String getSalesOrgFullid() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53579);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53580);return salesOrgFullid;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setSalesOrgFullid(String salesOrgFullid) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53581);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53582);this.salesOrgFullid = salesOrgFullid;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public String getSignSalesOrgFullId() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53583);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53584);return signSalesOrgFullId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setSignSalesOrgFullId(String signSalesOrgFullId) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53585);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53586);this.signSalesOrgFullId = signSalesOrgFullId;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public java.util.Date getGmtSign() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53587);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53588);return gmtSign;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setGmtSign(java.util.Date gmtSign) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53589);

            __CLR4_1_10156j156jlusqk4c2.R.inc(53590);this.gmtSign = gmtSign;

        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

    }

    public static class MSGTYPE {

        private String name;

        public String getName() {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53591);
            __CLR4_1_10156j156jlusqk4c2.R.inc(53592);return name;
        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_10156j156jlusqk4c2.R.inc(53593);
            __CLR4_1_10156j156jlusqk4c2.R.inc(53594);this.name = name;
        }finally{__CLR4_1_10156j156jlusqk4c2.R.flushNeeded();}}

    }
}
