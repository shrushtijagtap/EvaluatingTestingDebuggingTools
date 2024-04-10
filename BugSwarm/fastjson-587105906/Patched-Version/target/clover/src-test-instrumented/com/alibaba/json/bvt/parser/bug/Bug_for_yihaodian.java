/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.bug;

import java.util.List;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class Bug_for_yihaodian extends TestCase {static class __CLR4_5_21jmh1jmhlusyjtxl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,72685,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_long_list() throws Exception {__CLR4_5_21jmh1jmhlusyjtxl.R.globalSliceStart(getClass().getName(),72089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lfy02j1jmh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jmh1jmhlusyjtxl.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jmh1jmhlusyjtxl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.bug.Bug_for_yihaodian.test_for_long_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72089,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lfy02j1jmh() throws Exception{try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72089);
        __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72090);String str = "{\"backOperatorId\":14281,\"batchNum\":0,\"canPurchase\":1,\"categoryId\":955063}";
        __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72091);Te ob = JSON.parseObject(str, Te.class);
    }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

    public static class Te {

        /** \u4ea7\u54c1ID */
        private Long         id;
        /** \u8981\u5220\u9664\u4ea7\u54c1\u7684ID */
        private String       deletedProductId;
        /** \u4ea7\u54c1\u7f16\u7801 */
        private String       productCode;
        /** \u4ea7\u54c1\u540d */
        private String       productCname;
        /** \u4ea7\u54c1\u540d\u524d\u9762\u7684\u54c1\u724c\u540d */
        private String       productBrandName;
        /** \u4ea7\u54c1\u540d\u82f1\u6587 */
        private String       productEname;
        /** \u4ea7\u54c1\u9500\u552e\u7c7b\u522b */
        private Integer      productSaleType;
        /** \u4ea7\u54c1\u54c1\u724cId */
        private Long         brandId;
        /** \u4ea7\u54c1\u54c1\u724c */
        private String       brandName;

        /** \u5e02\u573a\u4ef7 */
        private Double       productListPrice;
        /** \u5206\u7c7bId */
        private Long         categoryId;
        /** \u65e7\u5206\u7c7bId */
        private Long         oldCategoryId;
        /** \u65e7\u6269\u5c55\u7c7b\u522b **/
        private Long         oldExtendCategoryId;
        /** \u5382\u5546ID,\u9ed8\u8ba4\u4e3a1 */
        private Long         mfid;
        /** productCanBeChange */
        private Integer      productCanBeChange;
        /** productChangeDay */
        private Integer      productChangeDay;
        /** productCanBeReturn */
        private Integer      productCanBeReturn;
        /** productReturnDay */
        private Integer      productReturnDay;
        /** \u80fd\u5426\u7ef4\u4fee */
        private Integer      productCanBeRepair;
        /** \u80fd\u5426\u7ef4\u4fee */
        private Integer      productCanBeRepairDay;
        /** \u5b89\u88c5\u4fe1\u606f */
        private Integer      productNeedInstallation;
        /** \u6761\u5f62\u7801 */
        private String       ean13;
        /** sku */
        private String       sku;
        /** \u957f */
        private Double       length;
        /** \u5bbd */
        private Double       width;
        /** \u9ad8 */
        private Double       height;
        /** \u51c0\u91cd */
        private Double       weight;
        /** keepTemperature */
        private String       keepTemperature;
        /** keepHumidity */
        private String       keepHumidity;
        /** \u4ea7\u54c1\u7b80\u79f0 */
        private String       productSname;
        /** keepSpecCondition */
        private String       keepSpecCondition;
        /** productQualityAssuranceDay */
        private Integer      productQualityAssuranceDay;
        /** \u662f\u5426\u5df2\u5220\u9664 */
        private Integer      isDeleted;
        /** \u5355\u4f4d */
        private String       unit;
        /** \u8fdb\u4ef7 */
        private Double       inPrice;
        /** volume */
        private Double       volume;
        /** countryOfOrgn */
        private Long         countryOfOrgn;
        /** \u4e3b\u56feID */
        private Long         defaultPictureId;
        /** \u4e3b\u56feURL */
        private String       defaultPictureUrl;
        /** color */
        private String       color;
        /** currencyId */
        private Long         currencyId;
        /** \u6bdb\u91cd */
        private Double       grossWeight;
        /** format */
        private String       format;
        /** \u6613\u788e\u54c1 0 \u4e0d\u662f 1\u662f */
        private String       isFragile;
        /** \u5411\u4e0a0 \u4e0d\u662f 1\u662f */
        private String       putOnDirection;
        /** \u8d35\u91cd\u54c10 \u4e0d\u662f 1\u662f */
        private String       isValuables;
        /** \u6db2\u4f530 \u4e0d\u662f 1\u662f */
        private String       isLiquid;
        /** \u9632\u4ea4\u53c9\u6c61\u67d30 \u4e0d\u662f 1\u662f */
        private String       isCrossContamination;
        /** 16\u8fdb\u5236\u7684\u989c\u8272\u4ee3\u7801,\u5982#FF00AA */
        private String       colorNumber;
        /** \u5c3a\u7801 */
        private String       productSize;
        /** \u66ff\u6362\u540e\u7684\u5c3a\u7801 */
        private String       replaceProductSize;
        /** \u9500\u552e\u6280\u5de7 */
        private String       saleSkill;
        /** \u672c\u5546\u54c1\u4f5c\u4e3a\u8d60\u54c1\u65f6\u7684\u5904\u7406\u65b9\u6cd5 */
        private String       dispositionInstruct;
        /** \u4ea7\u5730 */
        private String       placeOfOrigin;
        /** \u4ea7\u54c1\u9875\u9762\u6807\u9898 */
        private String       productSeoTitle;
        /** \u4ea7\u54c1\u9875\u9762\u5c5e\u6027\u5173\u952e\u5b57 */
        private String       productSeoKeyword;
        /** \u4ea7\u54c1\u9875\u9762\u5c5e\u6027\u63cf\u8ff0 */
        private String       productSeoDescription;
        /** \u540e\u53f0\u4ea7\u54c1\u914d\u4ef6\u8bf4\u660e */
        private String       accessoryDescription;
        /** \u662f\u5426\u9700\u8981\u5355\u72ec\u5f00\u7968 */
        private Integer      needInvoice;
        /** \u6e05\u4ed3\u539f\u56e0 */
        private String       clearCause;
        /** \u9ed8\u8ba4\u5546\u54c1\u6761\u7801ID */
        private Long         defaultBarcodeId;
        /** \u5e7f\u544a\u8bcd */
        private String       adWord;
        /** \u662f\u5426\u662f3c\u4ea7\u54c1\uff080:\u975e3C,1:3C\u4ea7\u54c1\uff09 */
        private Integer      isCcc;
        /** N\u4ef6\u8d2d */
        private Integer      shoppingCount;
        /** \u662f\u5426\u4e3a\u8d60\u54c1 */
        private Integer      productIsGift;
        /** \u662f\u5426\u53ef\u4ee5\u9000\u6362\u8d27 0\uff1a\u4e0d\u53ef\u4ee5 1\uff1a\u53ef\u4ee5 */
        private Integer      canReturnAndChange;
        /** \u662f\u5426\u9700\u8981\u68c0\u6d4b 0\uff1a\u4e0d\u9700\u8981 1\uff1a\u9700\u8981 */
        private Integer      needExamine;
        /** 1:\u65b0\u589e\u672a\u5ba1\u6838;2:\u7f16\u8f91\u5f85\u5ba1\u6838;3:\u5ba1\u6838\u672a\u901a\u8fc7;4:\u5ba1\u6838\u901a\u8fc7;5:\u6587\u63cf\u5ba1\u6838\u5931\u8d25;6:\u56fe\u7247\u5ba1\u6838\u5931\u8d25 */
        private Integer      verifyFlg;
        /** \u5ba1\u6838\u8005 */
        private Long         verifyBy;
        /** \u5ba1\u6838\u65e5\u65f6 */

        /** \u5546\u54c1\u767b\u8bb0\u8005 */
        private Long         registerBy;
        /** \u5546\u54c1\u767b\u8bb0\u65e5\u65f6 */

        /** \u5546\u54c1\u767b\u8bb0\u8005\u8054\u7cfb\u7535\u8bdd */
        private String       registerPhone;
        /** \u5ba1\u6838\u5907\u6ce8 */
        private String       verifyRemark;
        /** \u6279\u91cf\u6570 */
        private Integer      batchNum;
        /** \u662f\u5426\u53ea\u9650\u672c\u5730\u914d\u90010: \u4e0d\u9650\u5236 1:\u9650\u5236 (\u7c89\u72b6/\u6db2\u4f53/\u818f\u72b6) */
        private Integer      localLimit;
        /** \u4e00\u5305\u7684\u6570\u91cf */
        private Integer      stdPackQty;
        /** \u6b63\u5f0f\u8868\u4ea7\u54c1ID */
        private Long         fromalProductId;
        /** \u662f\u5426\u5f3a\u5236\u53d1\u7968 */
        private Integer      isMustInvoice;
        /** \u5ba1\u6838\u5931\u8d25\u539f\u56e0 */
        private Integer      verifyFailureType;
        /** \u4ea7\u54c1\u7c7b\u578b 0\uff1a\u666e\u901a\u4ea7\u54c1 1\uff1a\u4e3b\u7cfb\u5217\u4ea7\u54c1 2\uff1a\u5b50\u7cfb\u5217\u4ea7\u54c1 3\uff1a\u6346\u7ed1\u4ea7\u54c1 4\uff1a\u793c\u54c1\u5361 5: \u865a\u62df\u5546\u54c1 6:\u589e\u503c\u670d\u52a1 */
        private Integer      productType;
        /** \u662f\u5426\u80fd\u88ab\u91c7\u8d2d */
        private Integer      canPurchase;
        /** \u6807\u51c6\u5305\u88c5\u7bb1sku */
        private String       stdPackageSku;
        /** \u662f\u5426\u9700\u8981\u542f\u7528\u4fdd\u8d28\u671f\u63a7\u5236 0:\u4e0d\u542f\u7528 1\uff1a\u542f\u7528 */
        private Integer      userExpireControl;
        /** \u6279\u6b21\u89c4\u5219ID */
        private Long         batchRuleId;
        /** \u4ea7\u54c1\u540d\u79f0\u526f\u6807\u9898 */
        private String       nameSubtitle;
        private String       specialType;
        /** \u7ed9\u7ecf\u9500\u5546\u7684\u6279\u53d1\u4ef7 */
        private Double       batchPrice;
        /** \u662f\u5426\u9700\u8981\u6279\u6b21\u63a7\u5236 0\uff1a\u4e0d\u9700\u8981 1\uff1a\u9700\u8981 */
        private Integer      needBatchControl;
        /** \u9500\u552e\u7a0e\u7387 */
        private Double       salesTax;
        /** \u5916\u90e8\u4ea7\u54c1\u7f16\u7801 */
        private String       outerId;
        /** \u5546\u5bb6ID */
        private Long         merchantId;
        /** \u5546\u5bb6\u540d\u79f0 */
        private String       merchantName;
        /** \u5546\u5bb6\u4ea7\u54c1\u4e3b\u7c7b\u522b\uff08\u7528\u4e8e\u62a5\u8868\u7edf\u8ba1\uff09 */
        private Long         masterCategoryId;

        private Integer      concernLevel;
        /** \u5173\u6ce8\u7406\u7531 */
        private String       concernReason;
        /** \u662f\u5426\u53ef\u552e */
        private Integer      canSale;
        /** \u662f\u5426\u663e\u793a */
        private Integer      canShow;
        /** \u4ea7\u54c1\u9500\u552e\u7a0e\u7387 */
        private Long         prodcutTaxRate;
        /** \u662f\u5426\u652f\u6301VIP0:\u4e0d\u652f\u63011:\u652f\u6301 */
        private Integer      canVipDiscount;
        /** \u5206\u7c7b\u540d\u79f0 */
        private String       categoryName;
        /** \u9500\u552e\u4ef7\u683c */
        private Double       salePrice;
        /** \u5e93\u5b58 */
        private Long         stockNum;
        /** \u5546\u5bb6\u7c7b\u522b\u540d\u79f0 */
        private String       merchantCategoryName;
        /** \u5546\u5bb6\u8be6\u60c5 */
        private String       productDescription;
        /** \u662f\u5426\u53ef\u8c03\u62e8 0\uff1a\u4e0d\u53ef\u4ee5 1\uff1a\u53ef\u4ee5 */
        private Integer      isTransfer;
        /** \u662f\u5426\u9700\u8981\u5ba1\u68380\uff1a\u65b0\u589e\u672a\u63d0\u4ea4\uff1b1\uff1a\u9700\u8981\u5ba1\u6838\uff1b2\uff1a\u7f16\u8f91\u672a\u63d0\u4ea4 */
        private Integer      isSubmit;
        /** \u5ba1\u6838\u5931\u8d25\u7c7b\u578b */
        private Integer      verifyFailueType;
        /** \u4ea7\u54c1\u62fc\u97f3 */
        private String       productSpell;
        /** \u4ea7\u54c1\u540d\u79f0\u524d\u7f00 */
        private String       productNamePrefix;
        /** \u5ba1\u6838\u5931\u8d25\u539f\u56e0 */
        private String       failueReason;
        /** orgPicUrl */
        private String       orgPicUrl;
        /** \u6269\u5c55\u5206\u7c7b\u540d\u79f0 */
        private String       subCategoryName;
        /** \u6269\u5c55\u5206\u7c7bID */
        private Long         subCategoryId;
        /** 7\u5929\u5185\u65e5\u5747\u9500\u91cf */
        private Integer      dailySale;
        /** \u67e5\u770b\u662f\u5426\u6709\u4e3b\u56fe */
        private Integer      picCount;
        /** \u5f3a\u5236\u4e0b\u67b6\u539f\u56e0 */
        private Integer      underCarriageReason;
        /** \u5f3a\u5236\u4e0b\u67b6\u539f\u56e0-\u4e2d\u6587\u4fe1\u606f */
        private String       underCarriageReasonStr;
        /** \u5f02\u5e38\u4fe1\u606f */
        private String       errorMessage;
        /** \u5e93\u5b58\u9884\u8b66\u6570\u91cf */
        private Integer      alertStockCount;

        private String       deliveryInfo;
        /** \u4e3b\u56fe\u94fe\u63a5 */
        private String       picUrl;

        /** \u662f\u5426\u80fd\u5206\u671f0\uff1a\u4e0d\u80fd 1\uff1a\u80fd */
        private Integer      canFenqi;

        private String       season;
        /** \u662f\u5426\u662f\u4e8c\u6b21\u5ba1\u6838 */
        private Integer      isDupAudit;

        private Integer      viewFromTag;

        /** \u4ea7\u54c1\u552e\u4ef7 */
        private Double       productNonMemberPrice;
        /** \u4ea7\u54c1\u56fe\u7247 */

        /** \u662f\u5426\u66f4\u65b0\u64cd\u4f5c */
        private Integer      isUpdate;
        /** merchantRpcVo */

        /** \u7cfb\u5217\u4ea7\u54c1\u7684\u989c\u8272\u56fe\u7247 */

        /** \u7cfb\u5217\u4ea7\u54c1\u7684\u5c3a\u7801 */
        private List<String> productSizeSet;

        /** \u662f\u5426\u4e3b\u4ea7\u54c1 */
        private Boolean      isMainProduct;
        /** \u4ece\u56fe\u7247\u7a7a\u95f4\u4e2d\u8fd4\u56de\u56fe\u7247ID\u548cURL */
        private String       productPicIdAndURL;

        private Integer      isTemp;
        /** \u5e02\u573a\u4ef7\u548c\u552e\u4ef7\u7684\u6bd4\u4f8b */
        private Double       priceRate;

        private Integer      picSpecialType;
        private Integer      exemptStatus;

        private String       violationReasonIds;

        private String       violationReasons;

        private Long         remainTime;

        private Integer      submitOrder;

        private Integer      productSource;

        private Integer      isKa;
        /** KA\u5546\u5bb6\u521b\u5efa\u65f6\u95f4 */
        private Integer      kaMCreateTime;
        /** \u914d\u9001\u5ef6\u957f\u671f */
        private Integer      deliveryDay;
        /** \u4ea7\u54c1\u72b6\u6001 */
        private Integer      isEdit;
        /** \u64cd\u4f5c\u4eba */
        private Long         backOperatorId;
        /** \u6b63\u5f0f\u5e93pm_info_id */
        private Long         formalPmInfoId;
        /** \u7c7b\u522b\u62fc\u63a5\u5b57\u7b26\u4e32 */
        private String       categoryStr;
        /** \u7c7b\u522bid\u62fc\u63a5\u5b57\u7b26\u4e32 */
        private String       categoryIdStr;
        /** \u6269\u5c55\u7c7b\u522b\u62fc\u63a5\u5b57\u7b26\u4e32 */
        private String       extendCategoryStr;
        /** \u6269\u5c55\u7c7b\u522bid\u62fc\u63a5\u5b57\u7b26\u4e32 */
        private String       extendCategoryIdStr;
        /** \u5546\u5bb6\u7c7b\u522bID */
        private List<Long>   masterCategoryIdList;

        private Long         defaultWarehouseId;

        public Long getBackOperatorId() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72092);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72093);return backOperatorId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setBackOperatorId(Long backOperatorId) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72094);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72095);this.backOperatorId = backOperatorId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public Integer getIsDupAudit() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72096);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72097);return isDupAudit;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setIsDupAudit(Integer isDupAudit) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72098);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72099);this.isDupAudit = isDupAudit;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public Long getId() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72100);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72101);return id;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public String getUnderCarriageReasonStr() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72102);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72103);return underCarriageReasonStr;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setUnderCarriageReasonStr(String underCarriageReasonStr) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72104);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72105);this.underCarriageReasonStr = underCarriageReasonStr;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1ID
         * 
         * @param id \u4ea7\u54c1ID
         */

        public void setId(Long id) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72106);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72107);this.id = id;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u7f16\u7801
         * 
         * @return productCode
         */

        public String getProductCode() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72108);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72109);return productCode;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u7f16\u7801
         * 
         * @param productCode \u4ea7\u54c1\u7f16\u7801
         */

        public void setProductCode(String productCode) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72110);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72111);this.productCode = productCode;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u540d
         * 
         * @return productCname
         */

        public String getProductCname() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72112);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72113);return productCname;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u540d
         * 
         * @param productCname \u4ea7\u54c1\u540d
         */

        public void setProductCname(String productCname) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72114);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72115);this.productCname = productCname;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u540d\u82f1\u6587
         * 
         * @return productEname
         */

        public String getProductEname() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72116);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72117);return productEname;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u540d\u82f1\u6587
         * 
         * @param productEname \u4ea7\u54c1\u540d\u82f1\u6587
         */

        public void setProductEname(String productEname) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72118);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72119);this.productEname = productEname;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}


        /**
         * \u4ea7\u54c1\u9500\u552e\u7c7b\u522b
         * 
         * @param productSaleType \u4ea7\u54c1\u9500\u552e\u7c7b\u522b
         */

        public void setProductSaleType(Integer productSaleType) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72120);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72121);this.productSaleType = productSaleType;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u54c1\u724cId
         * 
         * @return brandId
         */

        public Long getBrandId() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72122);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72123);return brandId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u54c1\u724cId
         * 
         * @param brandId \u4ea7\u54c1\u54c1\u724cId
         */

        public void setBrandId(Long brandId) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72124);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72125);this.brandId = brandId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u54c1\u724c
         * 
         * @return brandName
         */

        public String getBrandName() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72126);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72127);return brandName;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u54c1\u724c
         * 
         * @param brandName \u4ea7\u54c1\u54c1\u724c
         */

        public void setBrandName(String brandName) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72128);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72129);this.brandName = brandName;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u521b\u5efa\u65f6\u95f4
         * 
         * @return createTime
         */

        /**
         * \u4ea7\u54c1\u521b\u5efa\u65f6\u95f4
         * 
         * @param createTime \u4ea7\u54c1\u521b\u5efa\u65f6\u95f4
         */

        /**
         * \u5e02\u573a\u4ef7
         * 
         * @return productListPrice
         */

        public Double getProductListPrice() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72130);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72131);return productListPrice;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5e02\u573a\u4ef7
         * 
         * @param productListPrice \u5e02\u573a\u4ef7
         */

        public void setProductListPrice(Double productListPrice) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72132);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72133);this.productListPrice = productListPrice;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5206\u7c7bId
         * 
         * @return categoryId
         */

        public Long getCategoryId() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72134);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72135);return categoryId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5206\u7c7bId
         * 
         * @param categoryId \u5206\u7c7bId
         */

        public void setCategoryId(Long categoryId) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72136);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72137);this.categoryId = categoryId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5382\u5546ID\u9ed8\u8ba4\u4e3a1
         * 
         * @return mfid
         */

        public Long getMfid() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72138);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72139);return mfid;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5382\u5546ID\u9ed8\u8ba4\u4e3a1
         * 
         * @param mfid \u5382\u5546ID\u9ed8\u8ba4\u4e3a1
         */

        public void setMfid(Long mfid) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72140);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72141);this.mfid = mfid;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * productCanBeChange
         * 
         * @return productCanBeChange
         */

        public Integer getProductCanBeChange() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72142);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72143);return productCanBeChange;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * productCanBeChange
         * 
         * @param productCanBeChange productCanBeChange
         */

        public void setProductCanBeChange(Integer productCanBeChange) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72144);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72145);this.productCanBeChange = productCanBeChange;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * productChangeDay
         * 
         * @return productChangeDay
         */

        public Integer getProductChangeDay() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72146);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72147);return productChangeDay;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * productChangeDay
         * 
         * @param productChangeDay productChangeDay
         */

        public void setProductChangeDay(Integer productChangeDay) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72148);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72149);this.productChangeDay = productChangeDay;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * productCanBeReturn
         * 
         * @return productCanBeReturn
         */

        public Integer getProductCanBeReturn() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72150);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72151);return productCanBeReturn;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * productCanBeReturn
         * 
         * @param productCanBeReturn productCanBeReturn
         */

        public void setProductCanBeReturn(Integer productCanBeReturn) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72152);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72153);this.productCanBeReturn = productCanBeReturn;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * productReturnDay
         * 
         * @return productReturnDay
         */

        public Integer getProductReturnDay() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72154);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72155);return productReturnDay;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * productReturnDay
         * 
         * @param productReturnDay productReturnDay
         */

        public void setProductReturnDay(Integer productReturnDay) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72156);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72157);this.productReturnDay = productReturnDay;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u80fd\u5426\u7ef4\u4fee
         * 
         * @return productCanBeRepair
         */

        public Integer getProductCanBeRepair() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72158);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72159);return productCanBeRepair;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u80fd\u5426\u7ef4\u4fee
         * 
         * @param productCanBeRepair \u80fd\u5426\u7ef4\u4fee
         */

        public void setProductCanBeRepair(Integer productCanBeRepair) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72160);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72161);this.productCanBeRepair = productCanBeRepair;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u80fd\u5426\u7ef4\u4fee
         * 
         * @return productCanBeRepairDay
         */

        public Integer getProductCanBeRepairDay() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72162);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72163);return productCanBeRepairDay;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u80fd\u5426\u7ef4\u4fee
         * 
         * @param productCanBeRepairDay \u80fd\u5426\u7ef4\u4fee
         */

        public void setProductCanBeRepairDay(Integer productCanBeRepairDay) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72164);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72165);this.productCanBeRepairDay = productCanBeRepairDay;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5b89\u88c5\u4fe1\u606f
         * 
         * @return productNeedInstallation
         */

        public Integer getProductNeedInstallation() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72166);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72167);return productNeedInstallation;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5b89\u88c5\u4fe1\u606f
         * 
         * @param productNeedInstallation \u5b89\u88c5\u4fe1\u606f
         */

        public void setProductNeedInstallation(Integer productNeedInstallation) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72168);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72169);this.productNeedInstallation = productNeedInstallation;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6761\u5f62\u7801
         * 
         * @return ean13
         */

        public String getEan13() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72170);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72171);return ean13;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6761\u5f62\u7801
         * 
         * @param ean13 \u6761\u5f62\u7801
         */

        public void setEan13(String ean13) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72172);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72173);this.ean13 = ean13;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * sku
         * 
         * @return sku
         */

        public String getSku() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72174);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72175);return sku;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * sku
         * 
         * @param sku sku
         */

        public void setSku(String sku) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72176);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72177);this.sku = sku;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u957f
         * 
         * @return length
         */

        public Double getLength() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72178);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72179);return length;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u957f
         * 
         * @param length \u957f
         */

        public void setLength(Double length) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72180);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72181);this.length = length;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5bbd
         * 
         * @return width
         */

        public Double getWidth() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72182);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72183);return width;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5bbd
         * 
         * @param width \u5bbd
         */

        public void setWidth(Double width) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72184);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72185);this.width = width;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u9ad8
         * 
         * @return height
         */

        public Double getHeight() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72186);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72187);return height;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u9ad8
         * 
         * @param height \u9ad8
         */

        public void setHeight(Double height) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72188);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72189);this.height = height;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u51c0\u91cd
         * 
         * @return weight
         */

        public Double getWeight() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72190);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72191);return weight;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u51c0\u91cd
         * 
         * @param weight \u51c0\u91cd
         */

        public void setWeight(Double weight) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72192);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72193);this.weight = weight;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * keepTemperature
         * 
         * @return keepTemperature
         */

        public String getKeepTemperature() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72194);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72195);return keepTemperature;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * keepTemperature
         * 
         * @param keepTemperature keepTemperature
         */

        public void setKeepTemperature(String keepTemperature) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72196);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72197);this.keepTemperature = keepTemperature;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * keepHumidity
         * 
         * @return keepHumidity
         */

        public String getKeepHumidity() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72198);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72199);return keepHumidity;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * keepHumidity
         * 
         * @param keepHumidity keepHumidity
         */

        public void setKeepHumidity(String keepHumidity) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72200);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72201);this.keepHumidity = keepHumidity;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * keepSpecCondition
         * 
         * @return keepSpecCondition
         */

        public String getKeepSpecCondition() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72202);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72203);return keepSpecCondition;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * keepSpecCondition
         * 
         * @param keepSpecCondition keepSpecCondition
         */

        public void setKeepSpecCondition(String keepSpecCondition) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72204);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72205);this.keepSpecCondition = keepSpecCondition;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * productQualityAssuranceDay
         * 
         * @return productQualityAssuranceDay
         */

        public Integer getProductQualityAssuranceDay() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72206);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72207);return productQualityAssuranceDay;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * productQualityAssuranceDay
         * 
         * @param productQualityAssuranceDay productQualityAssuranceDay
         */

        public void setProductQualityAssuranceDay(Integer productQualityAssuranceDay) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72208);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72209);this.productQualityAssuranceDay = productQualityAssuranceDay;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u5df2\u5220\u9664
         * 
         * @return isDeleted
         */

        public Integer getIsDeleted() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72210);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72211);return isDeleted;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u5df2\u5220\u9664
         * 
         * @param isDeleted \u662f\u5426\u5df2\u5220\u9664
         */

        public void setIsDeleted(Integer isDeleted) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72212);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72213);this.isDeleted = isDeleted;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5355\u4f4d
         * 
         * @return unit
         */

        public String getUnit() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72214);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72215);return unit;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5355\u4f4d
         * 
         * @param unit \u5355\u4f4d
         */

        public void setUnit(String unit) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72216);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72217);this.unit = unit;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u8fdb\u4ef7
         * 
         * @return inPrice
         */

        public Double getInPrice() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72218);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72219);return inPrice;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u8fdb\u4ef7
         * 
         * @param inPrice \u8fdb\u4ef7
         */

        public void setInPrice(Double inPrice) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72220);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72221);this.inPrice = inPrice;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * volume
         * 
         * @return volume
         */

        public Double getVolume() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72222);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72223);return volume;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * volume
         * 
         * @param volume volume
         */

        public void setVolume(Double volume) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72224);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72225);this.volume = volume;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * countryOfOrgn
         * 
         * @return countryOfOrgn
         */

        public Long getCountryOfOrgn() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72226);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72227);return countryOfOrgn;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * countryOfOrgn
         * 
         * @param countryOfOrgn countryOfOrgn
         */

        public void setCountryOfOrgn(Long countryOfOrgn) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72228);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72229);this.countryOfOrgn = countryOfOrgn;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4e3b\u56feID
         * 
         * @return defaultPictureId
         */

        public Long getDefaultPictureId() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72230);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72231);return defaultPictureId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4e3b\u56feID
         * 
         * @param defaultPictureId \u4e3b\u56feID
         */

        public void setDefaultPictureId(Long defaultPictureId) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72232);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72233);this.defaultPictureId = defaultPictureId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4e3b\u56feURL
         * 
         * @return defaultPictureUrl
         */

        public String getDefaultPictureUrl() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72234);

            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72235);return defaultPictureUrl;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4e3b\u56feURL
         * 
         * @param defaultPictureUrl \u4e3b\u56feURL
         */

        public void setDefaultPictureUrl(String defaultPictureUrl) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72236);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72237);this.defaultPictureUrl = defaultPictureUrl;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * color
         * 
         * @return color
         */

        public String getColor() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72238);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72239);return color;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * color
         * 
         * @param color color
         */

        public void setColor(String color) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72240);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72241);this.color = color;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * currencyId
         * 
         * @return currencyId
         */

        public Long getCurrencyId() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72242);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72243);return currencyId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * currencyId
         * 
         * @param currencyId currencyId
         */

        public void setCurrencyId(Long currencyId) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72244);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72245);this.currencyId = currencyId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6bdb\u91cd
         * 
         * @return grossWeight
         */

        public Double getGrossWeight() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72246);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72247);return grossWeight;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6bdb\u91cd
         * 
         * @param grossWeight \u6bdb\u91cd
         */

        public void setGrossWeight(Double grossWeight) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72248);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72249);this.grossWeight = grossWeight;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * format
         * 
         * @return format
         */

        public String getFormat() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72250);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72251);return format;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * format
         * 
         * @param format format
         */

        public void setFormat(String format) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72252);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72253);this.format = format;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6613\u788e\u54c10\u4e0d\u662f1\u662f
         * 
         * @return isFragile
         */

        public String getIsFragile() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72254);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72255);return isFragile;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6613\u788e\u54c10\u4e0d\u662f1\u662f
         * 
         * @param isFragile \u6613\u788e\u54c10\u4e0d\u662f1\u662f
         */

        public void setIsFragile(String isFragile) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72256);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72257);this.isFragile = isFragile;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5411\u4e0a0\u4e0d\u662f1\u662f
         * 
         * @return putOnDirection
         */

        public String getPutOnDirection() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72258);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72259);return putOnDirection;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5411\u4e0a0\u4e0d\u662f1\u662f
         * 
         * @param putOnDirection \u5411\u4e0a0\u4e0d\u662f1\u662f
         */

        public void setPutOnDirection(String putOnDirection) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72260);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72261);this.putOnDirection = putOnDirection;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u8d35\u91cd\u54c10\u4e0d\u662f1\u662f
         * 
         * @return isValuables
         */

        public String getIsValuables() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72262);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72263);return isValuables;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u8d35\u91cd\u54c10\u4e0d\u662f1\u662f
         * 
         * @param isValuables \u8d35\u91cd\u54c10\u4e0d\u662f1\u662f
         */

        public void setIsValuables(String isValuables) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72264);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72265);this.isValuables = isValuables;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6db2\u4f530\u4e0d\u662f1\u662f
         * 
         * @return isLiquid
         */

        public String getIsLiquid() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72266);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72267);return isLiquid;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6db2\u4f530\u4e0d\u662f1\u662f
         * 
         * @param isLiquid \u6db2\u4f530\u4e0d\u662f1\u662f
         */

        public void setIsLiquid(String isLiquid) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72268);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72269);this.isLiquid = isLiquid;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u9632\u4ea4\u53c9\u6c61\u67d30\u4e0d\u662f1\u662f
         * 
         * @return isCrossContamination
         */

        public String getIsCrossContamination() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72270);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72271);return isCrossContamination;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u9632\u4ea4\u53c9\u6c61\u67d30\u4e0d\u662f1\u662f
         * 
         * @param isCrossContamination \u9632\u4ea4\u53c9\u6c61\u67d30\u4e0d\u662f1\u662f
         */

        public void setIsCrossContamination(String isCrossContamination) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72272);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72273);this.isCrossContamination = isCrossContamination;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * 16\u8fdb\u5236\u7684\u989c\u8272\u4ee3\u7801\u5982#FF00AA
         * 
         * @return colorNumber
         */

        public String getColorNumber() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72274);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72275);return colorNumber;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * 16\u8fdb\u5236\u7684\u989c\u8272\u4ee3\u7801\u5982#FF00AA
         * 
         * @param colorNumber 16\u8fdb\u5236\u7684\u989c\u8272\u4ee3\u7801\u5982#FF00AA
         */

        public void setColorNumber(String colorNumber) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72276);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72277);this.colorNumber = colorNumber;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5c3a\u7801
         * 
         * @return productSize
         */

        public String getProductSize() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72278);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72279);return productSize;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5c3a\u7801
         * 
         * @param productSize \u5c3a\u7801
         */

        public void setProductSize(String productSize) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72280);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72281);this.productSize = productSize;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u9500\u552e\u6280\u5de7
         * 
         * @return saleSkill
         */

        public String getSaleSkill() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72282);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72283);return saleSkill;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u9500\u552e\u6280\u5de7
         * 
         * @param saleSkill \u9500\u552e\u6280\u5de7
         */

        public void setSaleSkill(String saleSkill) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72284);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72285);this.saleSkill = saleSkill;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u672c\u5546\u54c1\u4f5c\u4e3a\u8d60\u54c1\u65f6\u7684\u5904\u7406\u65b9\u6cd5
         * 
         * @return dispositionInstruct
         */

        public String getDispositionInstruct() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72286);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72287);return dispositionInstruct;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u672c\u5546\u54c1\u4f5c\u4e3a\u8d60\u54c1\u65f6\u7684\u5904\u7406\u65b9\u6cd5
         * 
         * @param dispositionInstruct \u672c\u5546\u54c1\u4f5c\u4e3a\u8d60\u54c1\u65f6\u7684\u5904\u7406\u65b9\u6cd5
         */

        public void setDispositionInstruct(String dispositionInstruct) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72288);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72289);this.dispositionInstruct = dispositionInstruct;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u5730
         * 
         * @return placeOfOrigin
         */

        public String getPlaceOfOrigin() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72290);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72291);return placeOfOrigin;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u5730
         * 
         * @param placeOfOrigin \u4ea7\u5730
         */

        public void setPlaceOfOrigin(String placeOfOrigin) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72292);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72293);this.placeOfOrigin = placeOfOrigin;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u9875\u9762\u6807\u9898
         * 
         * @return productSeoTitle
         */

        public String getProductSeoTitle() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72294);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72295);return productSeoTitle;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u9875\u9762\u6807\u9898
         * 
         * @param productSeoTitle \u4ea7\u54c1\u9875\u9762\u6807\u9898
         */

        public void setProductSeoTitle(String productSeoTitle) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72296);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72297);this.productSeoTitle = productSeoTitle;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u9875\u9762\u5c5e\u6027\u5173\u952e\u5b57
         * 
         * @return productSeoKeyword
         */

        public String getProductSeoKeyword() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72298);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72299);return productSeoKeyword;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u9875\u9762\u5c5e\u6027\u5173\u952e\u5b57
         * 
         * @param productSeoKeyword \u4ea7\u54c1\u9875\u9762\u5c5e\u6027\u5173\u952e\u5b57
         */

        public void setProductSeoKeyword(String productSeoKeyword) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72300);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72301);this.productSeoKeyword = productSeoKeyword;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u9875\u9762\u5c5e\u6027\u63cf\u8ff0
         * 
         * @return productSeoDescription
         */

        public String getProductSeoDescription() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72302);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72303);return productSeoDescription;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u9875\u9762\u5c5e\u6027\u63cf\u8ff0
         * 
         * @param productSeoDescription \u4ea7\u54c1\u9875\u9762\u5c5e\u6027\u63cf\u8ff0
         */

        public void setProductSeoDescription(String productSeoDescription) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72304);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72305);this.productSeoDescription = productSeoDescription;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u540e\u53f0\u4ea7\u54c1\u914d\u4ef6\u8bf4\u660e
         * 
         * @return accessoryDescription
         */

        public String getAccessoryDescription() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72306);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72307);return accessoryDescription;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u540e\u53f0\u4ea7\u54c1\u914d\u4ef6\u8bf4\u660e
         * 
         * @param accessoryDescription \u540e\u53f0\u4ea7\u54c1\u914d\u4ef6\u8bf4\u660e
         */

        public void setAccessoryDescription(String accessoryDescription) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72308);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72309);this.accessoryDescription = accessoryDescription;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u9700\u8981\u5355\u72ec\u5f00\u7968
         * 
         * @return needInvoice
         */

        public Integer getNeedInvoice() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72310);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72311);return needInvoice;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u9700\u8981\u5355\u72ec\u5f00\u7968
         * 
         * @param needInvoice \u662f\u5426\u9700\u8981\u5355\u72ec\u5f00\u7968
         */

        public void setNeedInvoice(Integer needInvoice) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72312);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72313);this.needInvoice = needInvoice;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6e05\u4ed3\u539f\u56e0
         * 
         * @return clearCause
         */

        public String getClearCause() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72314);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72315);return clearCause;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6e05\u4ed3\u539f\u56e0
         * 
         * @param clearCause \u6e05\u4ed3\u539f\u56e0
         */

        public void setClearCause(String clearCause) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72316);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72317);this.clearCause = clearCause;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u9ed8\u8ba4\u5546\u54c1\u6761\u7801ID
         * 
         * @return defaultBarcodeId
         */

        public Long getDefaultBarcodeId() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72318);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72319);return defaultBarcodeId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u9ed8\u8ba4\u5546\u54c1\u6761\u7801ID
         * 
         * @param defaultBarcodeId \u9ed8\u8ba4\u5546\u54c1\u6761\u7801ID
         */

        public void setDefaultBarcodeId(Long defaultBarcodeId) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72320);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72321);this.defaultBarcodeId = defaultBarcodeId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5e7f\u544a\u8bcd
         * 
         * @return adWord
         */

        public String getAdWord() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72322);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72323);return adWord;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5e7f\u544a\u8bcd
         * 
         * @param adWord \u5e7f\u544a\u8bcd
         */

        public void setAdWord(String adWord) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72324);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72325);this.adWord = adWord;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u662f3c\u4ea7\u54c1\uff080:\u975e3C1:3C\u4ea7\u54c1\uff09
         * 
         * @return isCcc
         */

        public Integer getIsCcc() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72326);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72327);return isCcc;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u662f3c\u4ea7\u54c1\uff080:\u975e3C1:3C\u4ea7\u54c1\uff09
         * 
         * @param isCcc \u662f\u5426\u662f3c\u4ea7\u54c1\uff080:\u975e3C1:3C\u4ea7\u54c1\uff09
         */

        public void setIsCcc(Integer isCcc) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72328);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72329);this.isCcc = isCcc;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * N\u4ef6\u8d2d
         * 
         * @return shoppingCount
         */

        public Integer getShoppingCount() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72330);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72331);return shoppingCount;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * N\u4ef6\u8d2d
         * 
         * @param shoppingCount N\u4ef6\u8d2d
         */

        public void setShoppingCount(Integer shoppingCount) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72332);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72333);this.shoppingCount = shoppingCount;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u4e3a\u8d60\u54c1
         * 
         * @return productIsGift
         */

        public Integer getProductIsGift() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72334);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72335);return productIsGift;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u4e3a\u8d60\u54c1
         * 
         * @param productIsGift \u662f\u5426\u4e3a\u8d60\u54c1
         */

        public void setProductIsGift(Integer productIsGift) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72336);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72337);this.productIsGift = productIsGift;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u53ef\u4ee5\u9000\u6362\u8d270\uff1a\u4e0d\u53ef\u4ee51\uff1a\u53ef\u4ee5
         * 
         * @return canReturnAndChange
         */

        public Integer getCanReturnAndChange() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72338);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72339);return canReturnAndChange;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u53ef\u4ee5\u9000\u6362\u8d270\uff1a\u4e0d\u53ef\u4ee51\uff1a\u53ef\u4ee5
         * 
         * @param canReturnAndChange \u662f\u5426\u53ef\u4ee5\u9000\u6362\u8d270\uff1a\u4e0d\u53ef\u4ee51\uff1a\u53ef\u4ee5
         */

        public void setCanReturnAndChange(Integer canReturnAndChange) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72340);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72341);this.canReturnAndChange = canReturnAndChange;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u9700\u8981\u68c0\u6d4b0\uff1a\u4e0d\u9700\u89811\uff1a\u9700\u8981
         * 
         * @return needExamine
         */

        public Integer getNeedExamine() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72342);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72343);return needExamine;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u9700\u8981\u68c0\u6d4b0\uff1a\u4e0d\u9700\u89811\uff1a\u9700\u8981
         * 
         * @param needExamine \u662f\u5426\u9700\u8981\u68c0\u6d4b0\uff1a\u4e0d\u9700\u89811\uff1a\u9700\u8981
         */

        public void setNeedExamine(Integer needExamine) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72344);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72345);this.needExamine = needExamine;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * 1:\u65b0\u589e\u672a\u5ba1\u6838;2:\u7f16\u8f91\u5f85\u5ba1\u6838;3:\u5ba1\u6838\u672a\u901a\u8fc7;4:\u5ba1\u6838\u901a\u8fc7;5:\u6587\u63cf\u5ba1\u6838\u5931\u8d25;6:\u56fe\u7247\u5ba1\u6838\u5931\u8d25
         * 
         * @return verifyFlg
         */

        public Integer getVerifyFlg() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72346);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72347);return verifyFlg;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * 1:\u65b0\u589e\u672a\u5ba1\u6838;2:\u7f16\u8f91\u5f85\u5ba1\u6838;3:\u5ba1\u6838\u672a\u901a\u8fc7;4:\u5ba1\u6838\u901a\u8fc7;5:\u6587\u63cf\u5ba1\u6838\u5931\u8d25;6:\u56fe\u7247\u5ba1\u6838\u5931\u8d25
         * 
         * @param verifyFlg 1:\u65b0\u589e\u672a\u5ba1\u6838;2:\u7f16\u8f91\u5f85\u5ba1\u6838;3:\u5ba1\u6838\u672a\u901a\u8fc7;4:\u5ba1\u6838\u901a\u8fc7;5:\u6587\u63cf\u5ba1\u6838\u5931\u8d25;6:\u56fe\u7247\u5ba1\u6838\u5931\u8d25
         */

        public void setVerifyFlg(Integer verifyFlg) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72348);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72349);this.verifyFlg = verifyFlg;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5ba1\u6838\u8005
         * 
         * @return verifyBy
         */

        public Long getVerifyBy() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72350);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72351);return verifyBy;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5ba1\u6838\u8005
         * 
         * @param verifyBy \u5ba1\u6838\u8005
         */

        public void setVerifyBy(Long verifyBy) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72352);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72353);this.verifyBy = verifyBy;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5ba1\u6838\u65e5\u65f6
         * 
         * @return verifyAt
         */

        /**
         * \u5ba1\u6838\u65e5\u65f6
         * 
         * @param verifyAt \u5ba1\u6838\u65e5\u65f6
         */

        /**
         * \u5546\u54c1\u767b\u8bb0\u8005
         * 
         * @return registerBy
         */

        public Long getRegisterBy() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72354);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72355);return registerBy;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5546\u54c1\u767b\u8bb0\u8005
         * 
         * @param registerBy \u5546\u54c1\u767b\u8bb0\u8005
         */

        public void setRegisterBy(Long registerBy) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72356);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72357);this.registerBy = registerBy;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5546\u54c1\u767b\u8bb0\u65e5\u65f6
         * 
         * @return registerAt
         */

        /**
         * \u5546\u54c1\u767b\u8bb0\u65e5\u65f6
         * 
         * @param registerAt \u5546\u54c1\u767b\u8bb0\u65e5\u65f6
         */

        /**
         * \u5546\u54c1\u767b\u8bb0\u8005\u8054\u7cfb\u7535\u8bdd
         * 
         * @return registerPhone
         */

        public String getRegisterPhone() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72358);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72359);return registerPhone;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5546\u54c1\u767b\u8bb0\u8005\u8054\u7cfb\u7535\u8bdd
         * 
         * @param registerPhone \u5546\u54c1\u767b\u8bb0\u8005\u8054\u7cfb\u7535\u8bdd
         */

        public void setRegisterPhone(String registerPhone) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72360);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72361);this.registerPhone = registerPhone;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5ba1\u6838\u5907\u6ce8
         * 
         * @return verifyRemark
         */

        public String getVerifyRemark() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72362);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72363);return verifyRemark;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5ba1\u6838\u5907\u6ce8
         * 
         * @param verifyRemark \u5ba1\u6838\u5907\u6ce8
         */

        public void setVerifyRemark(String verifyRemark) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72364);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72365);this.verifyRemark = verifyRemark;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6279\u91cf\u6570
         * 
         * @return batchNum
         */

        public Integer getBatchNum() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72366);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72367);return batchNum;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6279\u91cf\u6570
         * 
         * @param batchNum \u6279\u91cf\u6570
         */

        public void setBatchNum(Integer batchNum) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72368);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72369);this.batchNum = batchNum;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u53ea\u9650\u672c\u5730\u914d\u90010:\u4e0d\u9650\u52361:\u9650\u5236(\u7c89\u72b6\u6db2\u4f53\u818f\u72b6)
         * 
         * @return localLimit
         */

        public Integer getLocalLimit() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72370);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72371);return localLimit;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u53ea\u9650\u672c\u5730\u914d\u90010:\u4e0d\u9650\u52361:\u9650\u5236(\u7c89\u72b6\u6db2\u4f53\u818f\u72b6)
         * 
         * @param localLimit \u662f\u5426\u53ea\u9650\u672c\u5730\u914d\u90010:\u4e0d\u9650\u52361:\u9650\u5236(\u7c89\u72b6\u6db2\u4f53\u818f\u72b6)
         */

        public void setLocalLimit(Integer localLimit) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72372);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72373);this.localLimit = localLimit;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4e00\u5305\u7684\u6570\u91cf
         * 
         * @return stdPackQty
         */

        public Integer getStdPackQty() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72374);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72375);return stdPackQty;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4e00\u5305\u7684\u6570\u91cf
         * 
         * @param stdPackQty \u4e00\u5305\u7684\u6570\u91cf
         */

        public void setStdPackQty(Integer stdPackQty) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72376);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72377);this.stdPackQty = stdPackQty;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6b63\u5f0f\u8868\u4ea7\u54c1ID
         * 
         * @return fromalProductId
         */

        public Long getFromalProductId() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72378);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72379);return fromalProductId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6b63\u5f0f\u8868\u4ea7\u54c1ID
         * 
         * @param fromalProductId \u6b63\u5f0f\u8868\u4ea7\u54c1ID
         */

        public void setFromalProductId(Long fromalProductId) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72380);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72381);this.fromalProductId = fromalProductId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u5f3a\u5236\u53d1\u7968
         * 
         * @return isMustInvoice
         */

        public Integer getIsMustInvoice() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72382);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72383);return isMustInvoice;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u5f3a\u5236\u53d1\u7968
         * 
         * @param isMustInvoice \u662f\u5426\u5f3a\u5236\u53d1\u7968
         */

        public void setIsMustInvoice(Integer isMustInvoice) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72384);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72385);this.isMustInvoice = isMustInvoice;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5ba1\u6838\u5931\u8d25\u539f\u56e0
         * 
         * @return verifyFailureType
         */

        public Integer getVerifyFailureType() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72386);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72387);return verifyFailureType;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5ba1\u6838\u5931\u8d25\u539f\u56e0
         * 
         * @param verifyFailureType \u5ba1\u6838\u5931\u8d25\u539f\u56e0
         */

        public void setVerifyFailureType(Integer verifyFailureType) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72388);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72389);this.verifyFailureType = verifyFailureType;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u7c7b\u578b0\uff1a\u666e\u901a\u4ea7\u54c11\uff1a\u4e3b\u7cfb\u5217\u4ea7\u54c12\uff1a\u5b50\u7cfb\u5217\u4ea7\u54c13\uff1a\u6346\u7ed1\u4ea7\u54c14\uff1a\u793c\u54c1\u53615:\u865a\u62df\u5546\u54c16:\u589e\u503c\u670d\u52a1
         * 
         * @return productType
         */

        public Integer getProductType() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72390);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72391);return productType;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u7c7b\u578b0\uff1a\u666e\u901a\u4ea7\u54c11\uff1a\u4e3b\u7cfb\u5217\u4ea7\u54c12\uff1a\u5b50\u7cfb\u5217\u4ea7\u54c13\uff1a\u6346\u7ed1\u4ea7\u54c14\uff1a\u793c\u54c1\u53615:\u865a\u62df\u5546\u54c16:\u589e\u503c\u670d\u52a1
         * 
         * @param productType \u4ea7\u54c1\u7c7b\u578b0\uff1a\u666e\u901a\u4ea7\u54c11\uff1a\u4e3b\u7cfb\u5217\u4ea7\u54c12\uff1a\u5b50\u7cfb\u5217\u4ea7\u54c13\uff1a\u6346\u7ed1\u4ea7\u54c14\uff1a\u793c\u54c1\u53615:\u865a\u62df\u5546\u54c16:\u589e\u503c\u670d\u52a1
         */

        public void setProductType(Integer productType) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72392);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72393);this.productType = productType;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u80fd\u88ab\u91c7\u8d2d
         * 
         * @return canPurchase
         */

        public Integer getCanPurchase() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72394);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72395);return canPurchase;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u80fd\u88ab\u91c7\u8d2d
         * 
         * @param canPurchase \u662f\u5426\u80fd\u88ab\u91c7\u8d2d
         */

        public void setCanPurchase(Integer canPurchase) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72396);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72397);this.canPurchase = canPurchase;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6807\u51c6\u5305\u88c5\u7bb1sku
         * 
         * @return stdPackageSku
         */

        public String getStdPackageSku() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72398);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72399);return stdPackageSku;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6807\u51c6\u5305\u88c5\u7bb1sku
         * 
         * @param stdPackageSku \u6807\u51c6\u5305\u88c5\u7bb1sku
         */

        public void setStdPackageSku(String stdPackageSku) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72400);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72401);this.stdPackageSku = stdPackageSku;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u9700\u8981\u542f\u7528\u4fdd\u8d28\u671f\u63a7\u52360:\u4e0d\u542f\u75281\uff1a\u542f\u7528
         * 
         * @return userExpireControl
         */

        public Integer getUserExpireControl() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72402);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72403);return userExpireControl;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u9700\u8981\u542f\u7528\u4fdd\u8d28\u671f\u63a7\u52360:\u4e0d\u542f\u75281\uff1a\u542f\u7528
         * 
         * @param userExpireControl \u662f\u5426\u9700\u8981\u542f\u7528\u4fdd\u8d28\u671f\u63a7\u52360:\u4e0d\u542f\u75281\uff1a\u542f\u7528
         */

        public void setUserExpireControl(Integer userExpireControl) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72404);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72405);this.userExpireControl = userExpireControl;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6279\u6b21\u89c4\u5219ID
         * 
         * @return batchRuleId
         */

        public Long getBatchRuleId() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72406);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72407);return batchRuleId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6279\u6b21\u89c4\u5219ID
         * 
         * @param batchRuleId \u6279\u6b21\u89c4\u5219ID
         */

        public void setBatchRuleId(Long batchRuleId) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72408);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72409);this.batchRuleId = batchRuleId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u540d\u79f0\u526f\u6807\u9898
         * 
         * @return nameSubtitle
         */

        public String getNameSubtitle() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72410);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72411);return nameSubtitle;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u540d\u79f0\u526f\u6807\u9898
         * 
         * @param nameSubtitle \u4ea7\u54c1\u540d\u79f0\u526f\u6807\u9898
         */

        public void setNameSubtitle(String nameSubtitle) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72412);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72413);this.nameSubtitle = nameSubtitle;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u7279\u6b8a\u7c7b\u578b\uff1a1\uff1a\u533b\u836f\uff1b11\uff1a\u836f\u54c1\uff1b12\u5668\u68b0\uff1b14-18:\u5904\u65b9\u836f\uff1b50\uff1a\u7535\u5b50\u51ed\u8bc1
         * 
         * @return specialType
         */

        public String getSpecialType() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72414);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72415);return specialType;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u7279\u6b8a\u7c7b\u578b\uff1a1\uff1a\u533b\u836f\uff1b11\uff1a\u836f\u54c1\uff1b12\u5668\u68b0\uff1b14-18:\u5904\u65b9\u836f\uff1b50\uff1a\u7535\u5b50\u51ed\u8bc1
         * 
         * @param specialType \u4ea7\u54c1\u7279\u6b8a\u7c7b\u578b\uff1a1\uff1a\u533b\u836f\uff1b11\uff1a\u836f\u54c1\uff1b12\u5668\u68b0\uff1b14-18:\u5904\u65b9\u836f\uff1b50\uff1a\u7535\u5b50\u51ed\u8bc1
         */

        public void setSpecialType(String specialType) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72416);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72417);this.specialType = specialType;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u7ed9\u7ecf\u9500\u5546\u7684\u6279\u53d1\u4ef7
         * 
         * @return batchPrice
         */

        public Double getBatchPrice() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72418);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72419);return batchPrice;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u7ed9\u7ecf\u9500\u5546\u7684\u6279\u53d1\u4ef7
         * 
         * @param batchPrice \u7ed9\u7ecf\u9500\u5546\u7684\u6279\u53d1\u4ef7
         */

        public void setBatchPrice(Double batchPrice) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72420);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72421);this.batchPrice = batchPrice;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u9700\u8981\u6279\u6b21\u63a7\u52360\uff1a\u4e0d\u9700\u89811\uff1a\u9700\u8981
         * 
         * @return needBatchControl
         */

        public Integer getNeedBatchControl() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72422);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72423);return needBatchControl;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u9700\u8981\u6279\u6b21\u63a7\u52360\uff1a\u4e0d\u9700\u89811\uff1a\u9700\u8981
         * 
         * @param needBatchControl \u662f\u5426\u9700\u8981\u6279\u6b21\u63a7\u52360\uff1a\u4e0d\u9700\u89811\uff1a\u9700\u8981
         */

        public void setNeedBatchControl(Integer needBatchControl) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72424);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72425);this.needBatchControl = needBatchControl;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u9500\u552e\u7a0e\u7387
         * 
         * @return salesTax
         */

        public Double getSalesTax() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72426);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72427);return salesTax;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u9500\u552e\u7a0e\u7387
         * 
         * @param salesTax \u9500\u552e\u7a0e\u7387
         */

        public void setSalesTax(Double salesTax) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72428);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72429);this.salesTax = salesTax;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5916\u90e8\u4ea7\u54c1\u7f16\u7801
         * 
         * @return outerId
         */

        public String getOuterId() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72430);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72431);return outerId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5916\u90e8\u4ea7\u54c1\u7f16\u7801
         * 
         * @param outerId \u5916\u90e8\u4ea7\u54c1\u7f16\u7801
         */

        public void setOuterId(String outerId) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72432);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72433);this.outerId = outerId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5546\u5bb6ID
         * 
         * @return merchantId
         */

        public Long getMerchantId() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72434);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72435);return merchantId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5546\u5bb6ID
         * 
         * @param merchantId \u5546\u5bb6ID
         */

        public void setMerchantId(Long merchantId) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72436);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72437);this.merchantId = merchantId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5546\u5bb6\u540d\u79f0
         * 
         * @return merchantName
         */

        public String getMerchantName() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72438);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72439);return merchantName;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5546\u5bb6\u540d\u79f0
         * 
         * @param merchantName \u5546\u5bb6\u540d\u79f0
         */

        public void setMerchantName(String merchantName) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72440);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72441);this.merchantName = merchantName;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5546\u5bb6\u4ea7\u54c1\u4e3b\u7c7b\u522b\uff08\u7528\u4e8e\u62a5\u8868\u7edf\u8ba1\uff09
         * 
         * @return masterCategoryId
         */

        public Long getMasterCategoryId() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72442);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72443);return masterCategoryId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5546\u5bb6\u4ea7\u54c1\u4e3b\u7c7b\u522b\uff08\u7528\u4e8e\u62a5\u8868\u7edf\u8ba1\uff09
         * 
         * @param masterCategoryId \u5546\u5bb6\u4ea7\u54c1\u4e3b\u7c7b\u522b\uff08\u7528\u4e8e\u62a5\u8868\u7edf\u8ba1\uff09
         */

        public void setMasterCategoryId(Long masterCategoryId) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72444);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72445);this.masterCategoryId = masterCategoryId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5173\u6ce8\u7b49\u7ea7\u8bbe\u7f6e
         * 
         * @return concernLevel
         */

        public Integer getConcernLevel() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72446);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72447);return concernLevel;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5173\u6ce8\u7b49\u7ea7\u8bbe\u7f6e
         * 
         * @param concernLevel \u5173\u6ce8\u7b49\u7ea7\u8bbe\u7f6e
         */

        public void setConcernLevel(Integer concernLevel) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72448);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72449);this.concernLevel = concernLevel;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5173\u6ce8\u7406\u7531
         * 
         * @return concernReason
         */

        public String getConcernReason() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72450);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72451);return concernReason;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5173\u6ce8\u7406\u7531
         * 
         * @param concernReason \u5173\u6ce8\u7406\u7531
         */

        public void setConcernReason(String concernReason) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72452);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72453);this.concernReason = concernReason;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u53ef\u552e
         * 
         * @return canSale
         */

        public Integer getCanSale() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72454);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72455);return canSale;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u53ef\u552e
         * 
         * @param canSale \u662f\u5426\u53ef\u552e
         */

        public void setCanSale(Integer canSale) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72456);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72457);this.canSale = canSale;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u663e\u793a
         * 
         * @return canShow
         */

        public Integer getCanShow() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72458);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72459);return canShow;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u663e\u793a
         * 
         * @param canShow \u662f\u5426\u663e\u793a
         */

        public void setCanShow(Integer canShow) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72460);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72461);this.canShow = canShow;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u9500\u552e\u7a0e\u7387
         * 
         * @return prodcutTaxRate
         */

        public Long getProdcutTaxRate() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72462);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72463);return prodcutTaxRate;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u9500\u552e\u7a0e\u7387
         * 
         * @param prodcutTaxRate \u4ea7\u54c1\u9500\u552e\u7a0e\u7387
         */

        public void setProdcutTaxRate(Long prodcutTaxRate) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72464);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72465);this.prodcutTaxRate = prodcutTaxRate;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u652f\u6301VIP0:\u4e0d\u652f\u63011:\u652f\u6301
         * 
         * @return canVipDiscount
         */

        public Integer getCanVipDiscount() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72466);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72467);return canVipDiscount;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u652f\u6301VIP0:\u4e0d\u652f\u63011:\u652f\u6301
         * 
         * @param canVipDiscount \u662f\u5426\u652f\u6301VIP0:\u4e0d\u652f\u63011:\u652f\u6301
         */

        public void setCanVipDiscount(Integer canVipDiscount) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72468);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72469);this.canVipDiscount = canVipDiscount;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5206\u7c7b\u540d\u79f0
         * 
         * @return categoryName
         */

        public String getCategoryName() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72470);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72471);return categoryName;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5206\u7c7b\u540d\u79f0
         * 
         * @param categoryName \u5206\u7c7b\u540d\u79f0
         */

        public void setCategoryName(String categoryName) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72472);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72473);this.categoryName = categoryName;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u9500\u552e\u4ef7\u683c
         * 
         * @return salePrice
         */

        public Double getSalePrice() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72474);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72475);return salePrice;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u9500\u552e\u4ef7\u683c
         * 
         * @param salePrice \u9500\u552e\u4ef7\u683c
         */

        public void setSalePrice(Double salePrice) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72476);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72477);this.salePrice = salePrice;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5e93\u5b58
         * 
         * @return stockNum
         */

        public Long getStockNum() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72478);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72479);return stockNum;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5e93\u5b58
         * 
         * @param stockNum \u5e93\u5b58
         */

        public void setStockNum(Long stockNum) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72480);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72481);this.stockNum = stockNum;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5546\u5bb6\u7c7b\u522b\u540d\u79f0
         * 
         * @return merchantCategoryName
         */

        public String getMerchantCategoryName() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72482);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72483);return merchantCategoryName;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5546\u5bb6\u7c7b\u522b\u540d\u79f0
         * 
         * @param merchantCategoryName \u5546\u5bb6\u7c7b\u522b\u540d\u79f0
         */

        public void setMerchantCategoryName(String merchantCategoryName) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72484);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72485);this.merchantCategoryName = merchantCategoryName;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5546\u5bb6\u8be6\u60c5
         * 
         * @return productDescription
         */

        public String getProductDescription() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72486);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72487);return productDescription;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5546\u5bb6\u8be6\u60c5
         * 
         * @param productDescription \u5546\u5bb6\u8be6\u60c5
         */

        public void setProductDescription(String productDescription) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72488);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72489);this.productDescription = productDescription;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u53ef\u8c03\u62e80\uff1a\u4e0d\u53ef\u4ee51\uff1a\u53ef\u4ee5
         * 
         * @return isTransfer
         */

        public Integer getIsTransfer() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72490);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72491);return isTransfer;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u53ef\u8c03\u62e80\uff1a\u4e0d\u53ef\u4ee51\uff1a\u53ef\u4ee5
         * 
         * @param isTransfer \u662f\u5426\u53ef\u8c03\u62e80\uff1a\u4e0d\u53ef\u4ee51\uff1a\u53ef\u4ee5
         */

        public void setIsTransfer(Integer isTransfer) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72492);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72493);this.isTransfer = isTransfer;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u9700\u8981\u5ba1\u68380\uff1a\u65b0\u589e\u672a\u63d0\u4ea4\uff1b1\uff1a\u9700\u8981\u5ba1\u6838\uff1b2\uff1a\u7f16\u8f91\u672a\u63d0\u4ea4
         * 
         * @return isSubmit
         */

        public Integer getIsSubmit() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72494);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72495);return isSubmit;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u9700\u8981\u5ba1\u68380\uff1a\u65b0\u589e\u672a\u63d0\u4ea4\uff1b1\uff1a\u9700\u8981\u5ba1\u6838\uff1b2\uff1a\u7f16\u8f91\u672a\u63d0\u4ea4
         * 
         * @param isSubmit \u662f\u5426\u9700\u8981\u5ba1\u68380\uff1a\u65b0\u589e\u672a\u63d0\u4ea4\uff1b1\uff1a\u9700\u8981\u5ba1\u6838\uff1b2\uff1a\u7f16\u8f91\u672a\u63d0\u4ea4
         */

        public void setIsSubmit(Integer isSubmit) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72496);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72497);this.isSubmit = isSubmit;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5ba1\u6838\u5931\u8d25\u7c7b\u578b
         * 
         * @return verifyFailueType
         */

        public Integer getVerifyFailueType() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72498);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72499);return verifyFailueType;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5ba1\u6838\u5931\u8d25\u7c7b\u578b
         * 
         * @param verifyFailueType \u5ba1\u6838\u5931\u8d25\u7c7b\u578b
         */

        public void setVerifyFailueType(Integer verifyFailueType) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72500);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72501);this.verifyFailueType = verifyFailueType;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u62fc\u97f3
         * 
         * @return productSpell
         */

        public String getProductSpell() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72502);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72503);return productSpell;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u62fc\u97f3
         * 
         * @param productSpell \u4ea7\u54c1\u62fc\u97f3
         */

        public void setProductSpell(String productSpell) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72504);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72505);this.productSpell = productSpell;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u540d\u79f0\u524d\u7f00
         * 
         * @return productNamePrefix
         */

        public String getProductNamePrefix() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72506);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72507);return productNamePrefix;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u540d\u79f0\u524d\u7f00
         * 
         * @param productNamePrefix \u4ea7\u54c1\u540d\u79f0\u524d\u7f00
         */

        public void setProductNamePrefix(String productNamePrefix) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72508);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72509);this.productNamePrefix = productNamePrefix;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5ba1\u6838\u5931\u8d25\u539f\u56e0
         * 
         * @return failueReason
         */

        public String getFailueReason() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72510);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72511);return failueReason;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5ba1\u6838\u5931\u8d25\u539f\u56e0
         * 
         * @param failueReason \u5ba1\u6838\u5931\u8d25\u539f\u56e0
         */

        public void setFailueReason(String failueReason) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72512);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72513);this.failueReason = failueReason;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * orgPicUrl
         * 
         * @return orgPicUrl
         */

        public String getOrgPicUrl() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72514);

            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72515);return orgPicUrl;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * orgPicUrl
         * 
         * @param orgPicUrl orgPicUrl
         */

        public void setOrgPicUrl(String orgPicUrl) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72516);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72517);this.orgPicUrl = orgPicUrl;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6269\u5c55\u5206\u7c7b\u540d\u79f0
         * 
         * @return subCategoryName
         */

        public String getSubCategoryName() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72518);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72519);return subCategoryName;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6269\u5c55\u5206\u7c7b\u540d\u79f0
         * 
         * @param subCategoryName \u6269\u5c55\u5206\u7c7b\u540d\u79f0
         */

        public void setSubCategoryName(String subCategoryName) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72520);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72521);this.subCategoryName = subCategoryName;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6269\u5c55\u5206\u7c7bID
         * 
         * @return subCategoryId
         */

        public Long getSubCategoryId() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72522);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72523);return subCategoryId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6269\u5c55\u5206\u7c7bID
         * 
         * @param subCategoryId \u6269\u5c55\u5206\u7c7bID
         */

        public void setSubCategoryId(Long subCategoryId) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72524);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72525);this.subCategoryId = subCategoryId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * 7\u5929\u5185\u65e5\u5747\u9500\u91cf
         * 
         * @return dailySale
         */

        public Integer getDailySale() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72526);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72527);return dailySale;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * 7\u5929\u5185\u65e5\u5747\u9500\u91cf
         * 
         * @param dailySale 7\u5929\u5185\u65e5\u5747\u9500\u91cf
         */

        public void setDailySale(Integer dailySale) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72528);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72529);this.dailySale = dailySale;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u67e5\u770b\u662f\u5426\u6709\u4e3b\u56fe
         * 
         * @return picCount
         */

        public Integer getPicCount() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72530);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72531);return picCount;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u67e5\u770b\u662f\u5426\u6709\u4e3b\u56fe
         * 
         * @param picCount \u67e5\u770b\u662f\u5426\u6709\u4e3b\u56fe
         */

        public void setPicCount(Integer picCount) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72532);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72533);this.picCount = picCount;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5f3a\u5236\u4e0b\u67b6\u539f\u56e0
         * 
         * @return underCarriageReason
         */

        public Integer getUnderCarriageReason() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72534);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72535);return underCarriageReason;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5f3a\u5236\u4e0b\u67b6\u539f\u56e0
         * 
         * @param underCarriageReason \u5f3a\u5236\u4e0b\u67b6\u539f\u56e0
         */

        public void setUnderCarriageReason(Integer underCarriageReason) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72536);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72537);this.underCarriageReason = underCarriageReason;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5f02\u5e38\u4fe1\u606f
         * 
         * @return errorMessage
         */

        public String getErrorMessage() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72538);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72539);return errorMessage;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5f02\u5e38\u4fe1\u606f
         * 
         * @param errorMessage \u5f02\u5e38\u4fe1\u606f
         */
        /**
         * public void setErrorMessage(String errorMessage) { this.errorMessage = errorMessage; } \u5e93\u5b58\u9884\u8b66\u6570\u91cf
         * 
         * @return alertStockCount
         */

        public Integer getAlertStockCount() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72540);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72541);return alertStockCount;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5e93\u5b58\u9884\u8b66\u6570\u91cf
         * 
         * @param alertStockCount \u5e93\u5b58\u9884\u8b66\u6570\u91cf
         */

        public void setAlertStockCount(Integer alertStockCount) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72542);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72543);this.alertStockCount = alertStockCount;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u63d0\u4ea4\u65f6\u95f4
         * 
         * @return submitTime
         */
        /**
         * public Date getSubmitTime() { return submitTime; } \u63d0\u4ea4\u65f6\u95f4
         * 
         * @param submitTime \u63d0\u4ea4\u65f6\u95f4
         */
        /**
         * public void setSubmitTime(Date submitTime) { this.submitTime = submitTime; } holdPmPriceRpcVo
         * 
         * @return holdPmPriceRpcVo
         */

        /**
         * holdPmPriceRpcVo
         * 
         * @param holdPmPrice holdPmPriceRpcVo
         */

        /**
         * pmPriceRpcVo
         * 
         * @return pmPriceRpcVo
         */
        /**
         * public PmPriceRpcVo getPmPrice() { return pmPrice; } pmPriceRpcVo
         * 
         * @param pmPrice pmPriceRpcVo public void setPmPrice(PmPriceRpcVo pmPrice) { this.pmPrice = pmPrice; }
         */
        public Long getFormalPmInfoId() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72544);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72545);return formalPmInfoId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setFormalPmInfoId(Long formalPmInfoId) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72546);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72547);this.formalPmInfoId = formalPmInfoId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5e93\u5b58\u72b6\u51b5\uff08\u4ea7\u54c1\u9884\u89c8\u9875\u7528\uff09
         * 
         * @return deliveryInfo
         */

        public String getDeliveryInfo() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72548);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72549);return deliveryInfo;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u5e93\u5b58\u72b6\u51b5\uff08\u4ea7\u54c1\u9884\u89c8\u9875\u7528\uff09
         * 
         * @param deliveryInfo \u5e93\u5b58\u72b6\u51b5\uff08\u4ea7\u54c1\u9884\u89c8\u9875\u7528\uff09
         */

        public void setDeliveryInfo(String deliveryInfo) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72550);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72551);this.deliveryInfo = deliveryInfo;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4e3b\u56fe\u94fe\u63a5
         * 
         * @return picUrl
         */

        public String getPicUrl() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72552);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72553);return picUrl;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4e3b\u56fe\u94fe\u63a5
         * 
         * @param picUrl \u4e3b\u56fe\u94fe\u63a5
         */

        public void setPicUrl(String picUrl) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72554);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72555);this.picUrl = picUrl;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u8df3\u5230\u5546\u54c1\u8be6\u60c5\u9875\u7684\u6765\u6e900:\u9996\u6b21\u5ba1\u6838\u9875\u97621\uff1a\u4e8c\u6b21\u5ba1\u6838\u9875\u97622\uff1a\u5ba1\u6838\u5931\u8d25\u9875\u9762
         * 
         * @return viewFromTag
         */

        public Integer getViewFromTag() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72556);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72557);return viewFromTag;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u8df3\u5230\u5546\u54c1\u8be6\u60c5\u9875\u7684\u6765\u6e900:\u9996\u6b21\u5ba1\u6838\u9875\u97621\uff1a\u4e8c\u6b21\u5ba1\u6838\u9875\u97622\uff1a\u5ba1\u6838\u5931\u8d25\u9875\u9762
         * 
         * @param viewFromTag \u8df3\u5230\u5546\u54c1\u8be6\u60c5\u9875\u7684\u6765\u6e900:\u9996\u6b21\u5ba1\u6838\u9875\u97621\uff1a\u4e8c\u6b21\u5ba1\u6838\u9875\u97622\uff1a\u5ba1\u6838\u5931\u8d25\u9875\u9762
         */

        public void setViewFromTag(Integer viewFromTag) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72558);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72559);this.viewFromTag = viewFromTag;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public Double getProductNonMemberPrice() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72560);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72561);return productNonMemberPrice;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u552e\u4ef7
         * 
         * @param productNonMemberPrice \u4ea7\u54c1\u552e\u4ef7
         */

        public void setProductNonMemberPrice(Double productNonMemberPrice) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72562);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72563);this.productNonMemberPrice = productNonMemberPrice;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public Integer getIsUpdate() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72564);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72565);return isUpdate;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u66f4\u65b0\u64cd\u4f5c
         * 
         * @param isUpdate \u662f\u5426\u66f4\u65b0\u64cd\u4f5c
         */

        public void setIsUpdate(Integer isUpdate) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72566);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72567);this.isUpdate = isUpdate;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public List<String> getProductSizeSet() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72568);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72569);return productSizeSet;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setProductSizeSet(List<String> productSizeSet) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72570);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72571);this.productSizeSet = productSizeSet;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public Boolean getIsMainProduct() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72572);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72573);return isMainProduct;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u662f\u5426\u4e3b\u4ea7\u54c1
         * 
         * @param isMainProduct \u662f\u5426\u4e3b\u4ea7\u54c1
         */

        public void setIsMainProduct(Boolean isMainProduct) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72574);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72575);this.isMainProduct = isMainProduct;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ece\u56fe\u7247\u7a7a\u95f4\u4e2d\u8fd4\u56de\u56fe\u7247ID\u548cURL
         * 
         * @return productPicIdAndURL
         */

        public String getProductPicIdAndURL() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72576);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72577);return productPicIdAndURL;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u4ece\u56fe\u7247\u7a7a\u95f4\u4e2d\u8fd4\u56de\u56fe\u7247ID\u548cURL
         * 
         * @param productPicIdAndURL \u4ece\u56fe\u7247\u7a7a\u95f4\u4e2d\u8fd4\u56de\u56fe\u7247ID\u548cURL
         */

        public void setProductPicIdAndURL(String productPicIdAndURL) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72578);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72579);this.productPicIdAndURL = productPicIdAndURL;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public Integer getIsTemp() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72580);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72581);return isTemp;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * isTemp
         * 
         * @param isTemp isTemp
         */

        public void setIsTemp(Integer isTemp) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72582);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72583);this.isTemp = isTemp;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public Double getPriceRate() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72584);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72585);return priceRate;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setPriceRate(Double priceRate) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72586);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72587);this.priceRate = priceRate;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public Integer getPicSpecialType() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72588);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72589);return picSpecialType;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setPicSpecialType(Integer picSpecialType) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72590);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72591);this.picSpecialType = picSpecialType;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public Integer getExemptStatus() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72592);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72593);return exemptStatus;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setExemptStatus(Integer exemptStatus) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72594);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72595);this.exemptStatus = exemptStatus;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public String getViolationReasonIds() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72596);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72597);return violationReasonIds;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u514d\u5ba1\u5546\u5bb6\u65b0\u589e\u5b57\u6bb5:\u8bb0\u5f55\u8fdd\u89c4\u7684\u539f\u56e0
         * 
         * @param violationReasonIds \u514d\u5ba1\u5546\u5bb6\u65b0\u589e\u5b57\u6bb5:\u8bb0\u5f55\u8fdd\u89c4\u7684\u539f\u56e0
         */

        public void setViolationReasonIds(String violationReasonIds) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72598);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72599);this.violationReasonIds = violationReasonIds;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u514d\u5ba1\u5546\u5bb6\u65b0\u589e\u5b57\u6bb5:\u8bb0\u5f55\u8fdd\u89c4\u7684\u539f\u56e0\u6587\u5b57\u4fe1\u606f\uff0c\u9017\u53f7\u5206\u9694
         * 
         * @return violationReasons
         */

        public String getViolationReasons() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72600);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72601);return violationReasons;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setViolationReasons(String violationReasons) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72602);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72603);this.violationReasons = violationReasons;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u8fdd\u89c4\u9650\u5b9a\u4fee\u6539\u5269\u4f59\u65f6\u95f4\uff08\u6beb\u79d2\u6570\uff09
         * 
         * @return remainTime
         */

        public Long getRemainTime() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72604);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72605);return remainTime;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u8fdd\u89c4\u9650\u5b9a\u4fee\u6539\u5269\u4f59\u65f6\u95f4\uff08\u6beb\u79d2\u6570\uff09
         * 
         * @param remainTime \u8fdd\u89c4\u9650\u5b9a\u4fee\u6539\u5269\u4f59\u65f6\u95f4\uff08\u6beb\u79d2\u6570\uff09
         */

        public void setRemainTime(Long remainTime) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72606);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72607);this.remainTime = remainTime;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public Integer getSubmitOrder() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72608);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72609);return submitOrder;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setSubmitOrder(Integer submitOrder) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72610);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72611);this.submitOrder = submitOrder;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public Integer getProductSource() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72612);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72613);return productSource;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setProductSource(Integer productSource) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72614);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72615);this.productSource = productSource;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public String getProductSname() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72616);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72617);return productSname;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setProductSname(String productSname) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72618);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72619);this.productSname = productSname;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public Integer getCanFenqi() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72620);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72621);return canFenqi;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setCanFenqi(Integer canFenqi) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72622);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72623);this.canFenqi = canFenqi;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public String getSeason() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72624);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72625);return season;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setSeason(String season) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72626);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72627);this.season = season;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public Integer getIsKa() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72628);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72629);return isKa;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setIsKa(Integer isKa) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72630);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72631);this.isKa = isKa;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public Integer getKaMCreateTime() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72632);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72633);return kaMCreateTime;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setKaMCreateTime(Integer kaMCreateTime) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72634);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72635);this.kaMCreateTime = kaMCreateTime;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public Integer getDeliveryDay() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72636);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72637);return deliveryDay;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setDeliveryDay(Integer deliveryDay) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72638);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72639);this.deliveryDay = deliveryDay;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public Integer getIsEdit() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72640);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72641);return isEdit;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setIsEdit(Integer isEdit) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72642);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72643);this.isEdit = isEdit;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public String getProductBrandName() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72644);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72645);return productBrandName;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setProductBrandName(String productBrandName) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72646);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72647);this.productBrandName = productBrandName;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u7c7b\u522b\u62fc\u63a5\u5b57\u7b26\u4e32
         * 
         * @return categoryStr
         */

        public String getCategoryStr() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72648);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72649);return categoryStr;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u7c7b\u522b\u62fc\u63a5\u5b57\u7b26\u4e32
         * 
         * @param categoryStr \u7c7b\u522b\u62fc\u63a5\u5b57\u7b26\u4e32
         */

        public void setCategoryStr(String categoryStr) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72650);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72651);this.categoryStr = categoryStr;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6269\u5c55\u7c7b\u522b\u62fc\u63a5\u5b57\u7b26\u4e32
         * 
         * @return extendCategoryStr
         */

        public String getExtendCategoryStr() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72652);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72653);return extendCategoryStr;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        /**
         * \u6269\u5c55\u7c7b\u522b\u62fc\u63a5\u5b57\u7b26\u4e32
         * 
         * @param extendCategoryStr \u6269\u5c55\u7c7b\u522b\u62fc\u63a5\u5b57\u7b26\u4e32
         */

        public void setExtendCategoryStr(String extendCategoryStr) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72654);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72655);this.extendCategoryStr = extendCategoryStr;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public String getCategoryIdStr() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72656);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72657);return categoryIdStr;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setCategoryIdStr(String categoryIdStr) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72658);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72659);this.categoryIdStr = categoryIdStr;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public String getExtendCategoryIdStr() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72660);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72661);return extendCategoryIdStr;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}


        public Long getDefaultWarehouseId() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72662);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72663);return defaultWarehouseId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setDefaultWarehouseId(Long defaultWarehouseId) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72664);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72665);this.defaultWarehouseId = defaultWarehouseId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public Long getOldCategoryId() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72666);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72667);return oldCategoryId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setOldCategoryId(Long oldCategoryId) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72668);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72669);this.oldCategoryId = oldCategoryId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public Long getOldExtendCategoryId() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72670);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72671);return oldExtendCategoryId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setOldExtendCategoryId(Long oldExtendCategoryId) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72672);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72673);this.oldExtendCategoryId = oldExtendCategoryId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public String getDeletedProductId() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72674);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72675);return deletedProductId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setDeletedProductId(String deletedProductId) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72676);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72677);this.deletedProductId = deletedProductId;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public String getReplaceProductSize() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72678);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72679);return replaceProductSize;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setReplaceProductSize(String replaceProductSize) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72680);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72681);this.replaceProductSize = replaceProductSize;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public List<Long> getMasterCategoryIdList() {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72682);
            __CLR4_5_21jmh1jmhlusyjtxl.R.inc(72683);return masterCategoryIdList;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

        public void setMasterCategoryIdList(List<Long> masterCategoryIdList) {try{__CLR4_5_21jmh1jmhlusyjtxl.R.inc(72684);
            //this.masterCategoryIdList = masterCategoryIdList;
        }finally{__CLR4_5_21jmh1jmhlusyjtxl.R.flushNeeded();}}

    }

}
