/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.bug;

import java.util.List;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class Bug_for_yihaodian extends TestCase {static class __CLR4_5_21kkp1kkplusvne3t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,73917,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_long_list() throws Exception {__CLR4_5_21kkp1kkplusvne3t.R.globalSliceStart(getClass().getName(),73321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lfy02j1kkp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kkp1kkplusvne3t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kkp1kkplusvne3t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.bug.Bug_for_yihaodian.test_for_long_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73321,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lfy02j1kkp() throws Exception{try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73321);
        __CLR4_5_21kkp1kkplusvne3t.R.inc(73322);String str = "{\"backOperatorId\":14281,\"batchNum\":0,\"canPurchase\":1,\"categoryId\":955063}";
        __CLR4_5_21kkp1kkplusvne3t.R.inc(73323);Te ob = JSON.parseObject(str, Te.class);
    }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

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

        public Long getBackOperatorId() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73324);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73325);return backOperatorId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setBackOperatorId(Long backOperatorId) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73326);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73327);this.backOperatorId = backOperatorId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public Integer getIsDupAudit() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73328);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73329);return isDupAudit;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setIsDupAudit(Integer isDupAudit) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73330);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73331);this.isDupAudit = isDupAudit;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public Long getId() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73332);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73333);return id;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public String getUnderCarriageReasonStr() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73334);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73335);return underCarriageReasonStr;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setUnderCarriageReasonStr(String underCarriageReasonStr) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73336);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73337);this.underCarriageReasonStr = underCarriageReasonStr;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1ID
         * 
         * @param id \u4ea7\u54c1ID
         */

        public void setId(Long id) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73338);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73339);this.id = id;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u7f16\u7801
         * 
         * @return productCode
         */

        public String getProductCode() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73340);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73341);return productCode;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u7f16\u7801
         * 
         * @param productCode \u4ea7\u54c1\u7f16\u7801
         */

        public void setProductCode(String productCode) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73342);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73343);this.productCode = productCode;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u540d
         * 
         * @return productCname
         */

        public String getProductCname() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73344);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73345);return productCname;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u540d
         * 
         * @param productCname \u4ea7\u54c1\u540d
         */

        public void setProductCname(String productCname) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73346);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73347);this.productCname = productCname;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u540d\u82f1\u6587
         * 
         * @return productEname
         */

        public String getProductEname() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73348);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73349);return productEname;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u540d\u82f1\u6587
         * 
         * @param productEname \u4ea7\u54c1\u540d\u82f1\u6587
         */

        public void setProductEname(String productEname) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73350);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73351);this.productEname = productEname;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}


        /**
         * \u4ea7\u54c1\u9500\u552e\u7c7b\u522b
         * 
         * @param productSaleType \u4ea7\u54c1\u9500\u552e\u7c7b\u522b
         */

        public void setProductSaleType(Integer productSaleType) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73352);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73353);this.productSaleType = productSaleType;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u54c1\u724cId
         * 
         * @return brandId
         */

        public Long getBrandId() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73354);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73355);return brandId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u54c1\u724cId
         * 
         * @param brandId \u4ea7\u54c1\u54c1\u724cId
         */

        public void setBrandId(Long brandId) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73356);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73357);this.brandId = brandId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u54c1\u724c
         * 
         * @return brandName
         */

        public String getBrandName() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73358);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73359);return brandName;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u54c1\u724c
         * 
         * @param brandName \u4ea7\u54c1\u54c1\u724c
         */

        public void setBrandName(String brandName) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73360);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73361);this.brandName = brandName;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

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

        public Double getProductListPrice() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73362);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73363);return productListPrice;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5e02\u573a\u4ef7
         * 
         * @param productListPrice \u5e02\u573a\u4ef7
         */

        public void setProductListPrice(Double productListPrice) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73364);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73365);this.productListPrice = productListPrice;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5206\u7c7bId
         * 
         * @return categoryId
         */

        public Long getCategoryId() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73366);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73367);return categoryId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5206\u7c7bId
         * 
         * @param categoryId \u5206\u7c7bId
         */

        public void setCategoryId(Long categoryId) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73368);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73369);this.categoryId = categoryId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5382\u5546ID\u9ed8\u8ba4\u4e3a1
         * 
         * @return mfid
         */

        public Long getMfid() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73370);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73371);return mfid;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5382\u5546ID\u9ed8\u8ba4\u4e3a1
         * 
         * @param mfid \u5382\u5546ID\u9ed8\u8ba4\u4e3a1
         */

        public void setMfid(Long mfid) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73372);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73373);this.mfid = mfid;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * productCanBeChange
         * 
         * @return productCanBeChange
         */

        public Integer getProductCanBeChange() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73374);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73375);return productCanBeChange;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * productCanBeChange
         * 
         * @param productCanBeChange productCanBeChange
         */

        public void setProductCanBeChange(Integer productCanBeChange) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73376);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73377);this.productCanBeChange = productCanBeChange;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * productChangeDay
         * 
         * @return productChangeDay
         */

        public Integer getProductChangeDay() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73378);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73379);return productChangeDay;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * productChangeDay
         * 
         * @param productChangeDay productChangeDay
         */

        public void setProductChangeDay(Integer productChangeDay) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73380);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73381);this.productChangeDay = productChangeDay;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * productCanBeReturn
         * 
         * @return productCanBeReturn
         */

        public Integer getProductCanBeReturn() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73382);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73383);return productCanBeReturn;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * productCanBeReturn
         * 
         * @param productCanBeReturn productCanBeReturn
         */

        public void setProductCanBeReturn(Integer productCanBeReturn) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73384);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73385);this.productCanBeReturn = productCanBeReturn;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * productReturnDay
         * 
         * @return productReturnDay
         */

        public Integer getProductReturnDay() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73386);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73387);return productReturnDay;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * productReturnDay
         * 
         * @param productReturnDay productReturnDay
         */

        public void setProductReturnDay(Integer productReturnDay) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73388);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73389);this.productReturnDay = productReturnDay;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u80fd\u5426\u7ef4\u4fee
         * 
         * @return productCanBeRepair
         */

        public Integer getProductCanBeRepair() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73390);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73391);return productCanBeRepair;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u80fd\u5426\u7ef4\u4fee
         * 
         * @param productCanBeRepair \u80fd\u5426\u7ef4\u4fee
         */

        public void setProductCanBeRepair(Integer productCanBeRepair) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73392);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73393);this.productCanBeRepair = productCanBeRepair;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u80fd\u5426\u7ef4\u4fee
         * 
         * @return productCanBeRepairDay
         */

        public Integer getProductCanBeRepairDay() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73394);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73395);return productCanBeRepairDay;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u80fd\u5426\u7ef4\u4fee
         * 
         * @param productCanBeRepairDay \u80fd\u5426\u7ef4\u4fee
         */

        public void setProductCanBeRepairDay(Integer productCanBeRepairDay) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73396);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73397);this.productCanBeRepairDay = productCanBeRepairDay;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5b89\u88c5\u4fe1\u606f
         * 
         * @return productNeedInstallation
         */

        public Integer getProductNeedInstallation() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73398);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73399);return productNeedInstallation;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5b89\u88c5\u4fe1\u606f
         * 
         * @param productNeedInstallation \u5b89\u88c5\u4fe1\u606f
         */

        public void setProductNeedInstallation(Integer productNeedInstallation) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73400);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73401);this.productNeedInstallation = productNeedInstallation;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6761\u5f62\u7801
         * 
         * @return ean13
         */

        public String getEan13() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73402);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73403);return ean13;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6761\u5f62\u7801
         * 
         * @param ean13 \u6761\u5f62\u7801
         */

        public void setEan13(String ean13) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73404);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73405);this.ean13 = ean13;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * sku
         * 
         * @return sku
         */

        public String getSku() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73406);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73407);return sku;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * sku
         * 
         * @param sku sku
         */

        public void setSku(String sku) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73408);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73409);this.sku = sku;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u957f
         * 
         * @return length
         */

        public Double getLength() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73410);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73411);return length;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u957f
         * 
         * @param length \u957f
         */

        public void setLength(Double length) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73412);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73413);this.length = length;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5bbd
         * 
         * @return width
         */

        public Double getWidth() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73414);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73415);return width;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5bbd
         * 
         * @param width \u5bbd
         */

        public void setWidth(Double width) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73416);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73417);this.width = width;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u9ad8
         * 
         * @return height
         */

        public Double getHeight() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73418);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73419);return height;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u9ad8
         * 
         * @param height \u9ad8
         */

        public void setHeight(Double height) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73420);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73421);this.height = height;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u51c0\u91cd
         * 
         * @return weight
         */

        public Double getWeight() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73422);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73423);return weight;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u51c0\u91cd
         * 
         * @param weight \u51c0\u91cd
         */

        public void setWeight(Double weight) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73424);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73425);this.weight = weight;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * keepTemperature
         * 
         * @return keepTemperature
         */

        public String getKeepTemperature() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73426);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73427);return keepTemperature;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * keepTemperature
         * 
         * @param keepTemperature keepTemperature
         */

        public void setKeepTemperature(String keepTemperature) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73428);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73429);this.keepTemperature = keepTemperature;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * keepHumidity
         * 
         * @return keepHumidity
         */

        public String getKeepHumidity() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73430);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73431);return keepHumidity;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * keepHumidity
         * 
         * @param keepHumidity keepHumidity
         */

        public void setKeepHumidity(String keepHumidity) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73432);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73433);this.keepHumidity = keepHumidity;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * keepSpecCondition
         * 
         * @return keepSpecCondition
         */

        public String getKeepSpecCondition() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73434);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73435);return keepSpecCondition;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * keepSpecCondition
         * 
         * @param keepSpecCondition keepSpecCondition
         */

        public void setKeepSpecCondition(String keepSpecCondition) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73436);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73437);this.keepSpecCondition = keepSpecCondition;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * productQualityAssuranceDay
         * 
         * @return productQualityAssuranceDay
         */

        public Integer getProductQualityAssuranceDay() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73438);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73439);return productQualityAssuranceDay;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * productQualityAssuranceDay
         * 
         * @param productQualityAssuranceDay productQualityAssuranceDay
         */

        public void setProductQualityAssuranceDay(Integer productQualityAssuranceDay) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73440);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73441);this.productQualityAssuranceDay = productQualityAssuranceDay;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u5df2\u5220\u9664
         * 
         * @return isDeleted
         */

        public Integer getIsDeleted() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73442);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73443);return isDeleted;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u5df2\u5220\u9664
         * 
         * @param isDeleted \u662f\u5426\u5df2\u5220\u9664
         */

        public void setIsDeleted(Integer isDeleted) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73444);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73445);this.isDeleted = isDeleted;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5355\u4f4d
         * 
         * @return unit
         */

        public String getUnit() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73446);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73447);return unit;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5355\u4f4d
         * 
         * @param unit \u5355\u4f4d
         */

        public void setUnit(String unit) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73448);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73449);this.unit = unit;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u8fdb\u4ef7
         * 
         * @return inPrice
         */

        public Double getInPrice() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73450);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73451);return inPrice;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u8fdb\u4ef7
         * 
         * @param inPrice \u8fdb\u4ef7
         */

        public void setInPrice(Double inPrice) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73452);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73453);this.inPrice = inPrice;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * volume
         * 
         * @return volume
         */

        public Double getVolume() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73454);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73455);return volume;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * volume
         * 
         * @param volume volume
         */

        public void setVolume(Double volume) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73456);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73457);this.volume = volume;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * countryOfOrgn
         * 
         * @return countryOfOrgn
         */

        public Long getCountryOfOrgn() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73458);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73459);return countryOfOrgn;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * countryOfOrgn
         * 
         * @param countryOfOrgn countryOfOrgn
         */

        public void setCountryOfOrgn(Long countryOfOrgn) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73460);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73461);this.countryOfOrgn = countryOfOrgn;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4e3b\u56feID
         * 
         * @return defaultPictureId
         */

        public Long getDefaultPictureId() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73462);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73463);return defaultPictureId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4e3b\u56feID
         * 
         * @param defaultPictureId \u4e3b\u56feID
         */

        public void setDefaultPictureId(Long defaultPictureId) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73464);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73465);this.defaultPictureId = defaultPictureId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4e3b\u56feURL
         * 
         * @return defaultPictureUrl
         */

        public String getDefaultPictureUrl() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73466);

            __CLR4_5_21kkp1kkplusvne3t.R.inc(73467);return defaultPictureUrl;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4e3b\u56feURL
         * 
         * @param defaultPictureUrl \u4e3b\u56feURL
         */

        public void setDefaultPictureUrl(String defaultPictureUrl) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73468);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73469);this.defaultPictureUrl = defaultPictureUrl;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * color
         * 
         * @return color
         */

        public String getColor() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73470);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73471);return color;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * color
         * 
         * @param color color
         */

        public void setColor(String color) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73472);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73473);this.color = color;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * currencyId
         * 
         * @return currencyId
         */

        public Long getCurrencyId() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73474);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73475);return currencyId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * currencyId
         * 
         * @param currencyId currencyId
         */

        public void setCurrencyId(Long currencyId) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73476);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73477);this.currencyId = currencyId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6bdb\u91cd
         * 
         * @return grossWeight
         */

        public Double getGrossWeight() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73478);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73479);return grossWeight;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6bdb\u91cd
         * 
         * @param grossWeight \u6bdb\u91cd
         */

        public void setGrossWeight(Double grossWeight) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73480);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73481);this.grossWeight = grossWeight;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * format
         * 
         * @return format
         */

        public String getFormat() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73482);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73483);return format;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * format
         * 
         * @param format format
         */

        public void setFormat(String format) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73484);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73485);this.format = format;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6613\u788e\u54c10\u4e0d\u662f1\u662f
         * 
         * @return isFragile
         */

        public String getIsFragile() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73486);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73487);return isFragile;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6613\u788e\u54c10\u4e0d\u662f1\u662f
         * 
         * @param isFragile \u6613\u788e\u54c10\u4e0d\u662f1\u662f
         */

        public void setIsFragile(String isFragile) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73488);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73489);this.isFragile = isFragile;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5411\u4e0a0\u4e0d\u662f1\u662f
         * 
         * @return putOnDirection
         */

        public String getPutOnDirection() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73490);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73491);return putOnDirection;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5411\u4e0a0\u4e0d\u662f1\u662f
         * 
         * @param putOnDirection \u5411\u4e0a0\u4e0d\u662f1\u662f
         */

        public void setPutOnDirection(String putOnDirection) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73492);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73493);this.putOnDirection = putOnDirection;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u8d35\u91cd\u54c10\u4e0d\u662f1\u662f
         * 
         * @return isValuables
         */

        public String getIsValuables() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73494);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73495);return isValuables;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u8d35\u91cd\u54c10\u4e0d\u662f1\u662f
         * 
         * @param isValuables \u8d35\u91cd\u54c10\u4e0d\u662f1\u662f
         */

        public void setIsValuables(String isValuables) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73496);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73497);this.isValuables = isValuables;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6db2\u4f530\u4e0d\u662f1\u662f
         * 
         * @return isLiquid
         */

        public String getIsLiquid() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73498);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73499);return isLiquid;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6db2\u4f530\u4e0d\u662f1\u662f
         * 
         * @param isLiquid \u6db2\u4f530\u4e0d\u662f1\u662f
         */

        public void setIsLiquid(String isLiquid) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73500);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73501);this.isLiquid = isLiquid;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u9632\u4ea4\u53c9\u6c61\u67d30\u4e0d\u662f1\u662f
         * 
         * @return isCrossContamination
         */

        public String getIsCrossContamination() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73502);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73503);return isCrossContamination;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u9632\u4ea4\u53c9\u6c61\u67d30\u4e0d\u662f1\u662f
         * 
         * @param isCrossContamination \u9632\u4ea4\u53c9\u6c61\u67d30\u4e0d\u662f1\u662f
         */

        public void setIsCrossContamination(String isCrossContamination) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73504);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73505);this.isCrossContamination = isCrossContamination;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * 16\u8fdb\u5236\u7684\u989c\u8272\u4ee3\u7801\u5982#FF00AA
         * 
         * @return colorNumber
         */

        public String getColorNumber() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73506);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73507);return colorNumber;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * 16\u8fdb\u5236\u7684\u989c\u8272\u4ee3\u7801\u5982#FF00AA
         * 
         * @param colorNumber 16\u8fdb\u5236\u7684\u989c\u8272\u4ee3\u7801\u5982#FF00AA
         */

        public void setColorNumber(String colorNumber) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73508);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73509);this.colorNumber = colorNumber;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5c3a\u7801
         * 
         * @return productSize
         */

        public String getProductSize() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73510);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73511);return productSize;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5c3a\u7801
         * 
         * @param productSize \u5c3a\u7801
         */

        public void setProductSize(String productSize) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73512);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73513);this.productSize = productSize;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u9500\u552e\u6280\u5de7
         * 
         * @return saleSkill
         */

        public String getSaleSkill() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73514);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73515);return saleSkill;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u9500\u552e\u6280\u5de7
         * 
         * @param saleSkill \u9500\u552e\u6280\u5de7
         */

        public void setSaleSkill(String saleSkill) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73516);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73517);this.saleSkill = saleSkill;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u672c\u5546\u54c1\u4f5c\u4e3a\u8d60\u54c1\u65f6\u7684\u5904\u7406\u65b9\u6cd5
         * 
         * @return dispositionInstruct
         */

        public String getDispositionInstruct() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73518);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73519);return dispositionInstruct;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u672c\u5546\u54c1\u4f5c\u4e3a\u8d60\u54c1\u65f6\u7684\u5904\u7406\u65b9\u6cd5
         * 
         * @param dispositionInstruct \u672c\u5546\u54c1\u4f5c\u4e3a\u8d60\u54c1\u65f6\u7684\u5904\u7406\u65b9\u6cd5
         */

        public void setDispositionInstruct(String dispositionInstruct) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73520);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73521);this.dispositionInstruct = dispositionInstruct;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u5730
         * 
         * @return placeOfOrigin
         */

        public String getPlaceOfOrigin() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73522);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73523);return placeOfOrigin;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u5730
         * 
         * @param placeOfOrigin \u4ea7\u5730
         */

        public void setPlaceOfOrigin(String placeOfOrigin) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73524);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73525);this.placeOfOrigin = placeOfOrigin;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u9875\u9762\u6807\u9898
         * 
         * @return productSeoTitle
         */

        public String getProductSeoTitle() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73526);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73527);return productSeoTitle;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u9875\u9762\u6807\u9898
         * 
         * @param productSeoTitle \u4ea7\u54c1\u9875\u9762\u6807\u9898
         */

        public void setProductSeoTitle(String productSeoTitle) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73528);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73529);this.productSeoTitle = productSeoTitle;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u9875\u9762\u5c5e\u6027\u5173\u952e\u5b57
         * 
         * @return productSeoKeyword
         */

        public String getProductSeoKeyword() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73530);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73531);return productSeoKeyword;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u9875\u9762\u5c5e\u6027\u5173\u952e\u5b57
         * 
         * @param productSeoKeyword \u4ea7\u54c1\u9875\u9762\u5c5e\u6027\u5173\u952e\u5b57
         */

        public void setProductSeoKeyword(String productSeoKeyword) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73532);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73533);this.productSeoKeyword = productSeoKeyword;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u9875\u9762\u5c5e\u6027\u63cf\u8ff0
         * 
         * @return productSeoDescription
         */

        public String getProductSeoDescription() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73534);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73535);return productSeoDescription;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u9875\u9762\u5c5e\u6027\u63cf\u8ff0
         * 
         * @param productSeoDescription \u4ea7\u54c1\u9875\u9762\u5c5e\u6027\u63cf\u8ff0
         */

        public void setProductSeoDescription(String productSeoDescription) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73536);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73537);this.productSeoDescription = productSeoDescription;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u540e\u53f0\u4ea7\u54c1\u914d\u4ef6\u8bf4\u660e
         * 
         * @return accessoryDescription
         */

        public String getAccessoryDescription() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73538);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73539);return accessoryDescription;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u540e\u53f0\u4ea7\u54c1\u914d\u4ef6\u8bf4\u660e
         * 
         * @param accessoryDescription \u540e\u53f0\u4ea7\u54c1\u914d\u4ef6\u8bf4\u660e
         */

        public void setAccessoryDescription(String accessoryDescription) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73540);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73541);this.accessoryDescription = accessoryDescription;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u9700\u8981\u5355\u72ec\u5f00\u7968
         * 
         * @return needInvoice
         */

        public Integer getNeedInvoice() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73542);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73543);return needInvoice;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u9700\u8981\u5355\u72ec\u5f00\u7968
         * 
         * @param needInvoice \u662f\u5426\u9700\u8981\u5355\u72ec\u5f00\u7968
         */

        public void setNeedInvoice(Integer needInvoice) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73544);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73545);this.needInvoice = needInvoice;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6e05\u4ed3\u539f\u56e0
         * 
         * @return clearCause
         */

        public String getClearCause() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73546);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73547);return clearCause;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6e05\u4ed3\u539f\u56e0
         * 
         * @param clearCause \u6e05\u4ed3\u539f\u56e0
         */

        public void setClearCause(String clearCause) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73548);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73549);this.clearCause = clearCause;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u9ed8\u8ba4\u5546\u54c1\u6761\u7801ID
         * 
         * @return defaultBarcodeId
         */

        public Long getDefaultBarcodeId() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73550);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73551);return defaultBarcodeId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u9ed8\u8ba4\u5546\u54c1\u6761\u7801ID
         * 
         * @param defaultBarcodeId \u9ed8\u8ba4\u5546\u54c1\u6761\u7801ID
         */

        public void setDefaultBarcodeId(Long defaultBarcodeId) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73552);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73553);this.defaultBarcodeId = defaultBarcodeId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5e7f\u544a\u8bcd
         * 
         * @return adWord
         */

        public String getAdWord() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73554);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73555);return adWord;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5e7f\u544a\u8bcd
         * 
         * @param adWord \u5e7f\u544a\u8bcd
         */

        public void setAdWord(String adWord) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73556);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73557);this.adWord = adWord;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u662f3c\u4ea7\u54c1\uff080:\u975e3C1:3C\u4ea7\u54c1\uff09
         * 
         * @return isCcc
         */

        public Integer getIsCcc() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73558);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73559);return isCcc;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u662f3c\u4ea7\u54c1\uff080:\u975e3C1:3C\u4ea7\u54c1\uff09
         * 
         * @param isCcc \u662f\u5426\u662f3c\u4ea7\u54c1\uff080:\u975e3C1:3C\u4ea7\u54c1\uff09
         */

        public void setIsCcc(Integer isCcc) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73560);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73561);this.isCcc = isCcc;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * N\u4ef6\u8d2d
         * 
         * @return shoppingCount
         */

        public Integer getShoppingCount() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73562);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73563);return shoppingCount;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * N\u4ef6\u8d2d
         * 
         * @param shoppingCount N\u4ef6\u8d2d
         */

        public void setShoppingCount(Integer shoppingCount) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73564);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73565);this.shoppingCount = shoppingCount;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u4e3a\u8d60\u54c1
         * 
         * @return productIsGift
         */

        public Integer getProductIsGift() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73566);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73567);return productIsGift;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u4e3a\u8d60\u54c1
         * 
         * @param productIsGift \u662f\u5426\u4e3a\u8d60\u54c1
         */

        public void setProductIsGift(Integer productIsGift) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73568);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73569);this.productIsGift = productIsGift;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u53ef\u4ee5\u9000\u6362\u8d270\uff1a\u4e0d\u53ef\u4ee51\uff1a\u53ef\u4ee5
         * 
         * @return canReturnAndChange
         */

        public Integer getCanReturnAndChange() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73570);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73571);return canReturnAndChange;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u53ef\u4ee5\u9000\u6362\u8d270\uff1a\u4e0d\u53ef\u4ee51\uff1a\u53ef\u4ee5
         * 
         * @param canReturnAndChange \u662f\u5426\u53ef\u4ee5\u9000\u6362\u8d270\uff1a\u4e0d\u53ef\u4ee51\uff1a\u53ef\u4ee5
         */

        public void setCanReturnAndChange(Integer canReturnAndChange) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73572);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73573);this.canReturnAndChange = canReturnAndChange;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u9700\u8981\u68c0\u6d4b0\uff1a\u4e0d\u9700\u89811\uff1a\u9700\u8981
         * 
         * @return needExamine
         */

        public Integer getNeedExamine() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73574);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73575);return needExamine;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u9700\u8981\u68c0\u6d4b0\uff1a\u4e0d\u9700\u89811\uff1a\u9700\u8981
         * 
         * @param needExamine \u662f\u5426\u9700\u8981\u68c0\u6d4b0\uff1a\u4e0d\u9700\u89811\uff1a\u9700\u8981
         */

        public void setNeedExamine(Integer needExamine) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73576);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73577);this.needExamine = needExamine;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * 1:\u65b0\u589e\u672a\u5ba1\u6838;2:\u7f16\u8f91\u5f85\u5ba1\u6838;3:\u5ba1\u6838\u672a\u901a\u8fc7;4:\u5ba1\u6838\u901a\u8fc7;5:\u6587\u63cf\u5ba1\u6838\u5931\u8d25;6:\u56fe\u7247\u5ba1\u6838\u5931\u8d25
         * 
         * @return verifyFlg
         */

        public Integer getVerifyFlg() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73578);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73579);return verifyFlg;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * 1:\u65b0\u589e\u672a\u5ba1\u6838;2:\u7f16\u8f91\u5f85\u5ba1\u6838;3:\u5ba1\u6838\u672a\u901a\u8fc7;4:\u5ba1\u6838\u901a\u8fc7;5:\u6587\u63cf\u5ba1\u6838\u5931\u8d25;6:\u56fe\u7247\u5ba1\u6838\u5931\u8d25
         * 
         * @param verifyFlg 1:\u65b0\u589e\u672a\u5ba1\u6838;2:\u7f16\u8f91\u5f85\u5ba1\u6838;3:\u5ba1\u6838\u672a\u901a\u8fc7;4:\u5ba1\u6838\u901a\u8fc7;5:\u6587\u63cf\u5ba1\u6838\u5931\u8d25;6:\u56fe\u7247\u5ba1\u6838\u5931\u8d25
         */

        public void setVerifyFlg(Integer verifyFlg) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73580);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73581);this.verifyFlg = verifyFlg;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5ba1\u6838\u8005
         * 
         * @return verifyBy
         */

        public Long getVerifyBy() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73582);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73583);return verifyBy;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5ba1\u6838\u8005
         * 
         * @param verifyBy \u5ba1\u6838\u8005
         */

        public void setVerifyBy(Long verifyBy) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73584);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73585);this.verifyBy = verifyBy;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

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

        public Long getRegisterBy() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73586);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73587);return registerBy;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5546\u54c1\u767b\u8bb0\u8005
         * 
         * @param registerBy \u5546\u54c1\u767b\u8bb0\u8005
         */

        public void setRegisterBy(Long registerBy) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73588);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73589);this.registerBy = registerBy;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

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

        public String getRegisterPhone() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73590);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73591);return registerPhone;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5546\u54c1\u767b\u8bb0\u8005\u8054\u7cfb\u7535\u8bdd
         * 
         * @param registerPhone \u5546\u54c1\u767b\u8bb0\u8005\u8054\u7cfb\u7535\u8bdd
         */

        public void setRegisterPhone(String registerPhone) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73592);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73593);this.registerPhone = registerPhone;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5ba1\u6838\u5907\u6ce8
         * 
         * @return verifyRemark
         */

        public String getVerifyRemark() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73594);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73595);return verifyRemark;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5ba1\u6838\u5907\u6ce8
         * 
         * @param verifyRemark \u5ba1\u6838\u5907\u6ce8
         */

        public void setVerifyRemark(String verifyRemark) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73596);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73597);this.verifyRemark = verifyRemark;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6279\u91cf\u6570
         * 
         * @return batchNum
         */

        public Integer getBatchNum() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73598);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73599);return batchNum;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6279\u91cf\u6570
         * 
         * @param batchNum \u6279\u91cf\u6570
         */

        public void setBatchNum(Integer batchNum) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73600);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73601);this.batchNum = batchNum;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u53ea\u9650\u672c\u5730\u914d\u90010:\u4e0d\u9650\u52361:\u9650\u5236(\u7c89\u72b6\u6db2\u4f53\u818f\u72b6)
         * 
         * @return localLimit
         */

        public Integer getLocalLimit() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73602);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73603);return localLimit;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u53ea\u9650\u672c\u5730\u914d\u90010:\u4e0d\u9650\u52361:\u9650\u5236(\u7c89\u72b6\u6db2\u4f53\u818f\u72b6)
         * 
         * @param localLimit \u662f\u5426\u53ea\u9650\u672c\u5730\u914d\u90010:\u4e0d\u9650\u52361:\u9650\u5236(\u7c89\u72b6\u6db2\u4f53\u818f\u72b6)
         */

        public void setLocalLimit(Integer localLimit) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73604);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73605);this.localLimit = localLimit;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4e00\u5305\u7684\u6570\u91cf
         * 
         * @return stdPackQty
         */

        public Integer getStdPackQty() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73606);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73607);return stdPackQty;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4e00\u5305\u7684\u6570\u91cf
         * 
         * @param stdPackQty \u4e00\u5305\u7684\u6570\u91cf
         */

        public void setStdPackQty(Integer stdPackQty) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73608);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73609);this.stdPackQty = stdPackQty;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6b63\u5f0f\u8868\u4ea7\u54c1ID
         * 
         * @return fromalProductId
         */

        public Long getFromalProductId() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73610);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73611);return fromalProductId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6b63\u5f0f\u8868\u4ea7\u54c1ID
         * 
         * @param fromalProductId \u6b63\u5f0f\u8868\u4ea7\u54c1ID
         */

        public void setFromalProductId(Long fromalProductId) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73612);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73613);this.fromalProductId = fromalProductId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u5f3a\u5236\u53d1\u7968
         * 
         * @return isMustInvoice
         */

        public Integer getIsMustInvoice() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73614);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73615);return isMustInvoice;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u5f3a\u5236\u53d1\u7968
         * 
         * @param isMustInvoice \u662f\u5426\u5f3a\u5236\u53d1\u7968
         */

        public void setIsMustInvoice(Integer isMustInvoice) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73616);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73617);this.isMustInvoice = isMustInvoice;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5ba1\u6838\u5931\u8d25\u539f\u56e0
         * 
         * @return verifyFailureType
         */

        public Integer getVerifyFailureType() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73618);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73619);return verifyFailureType;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5ba1\u6838\u5931\u8d25\u539f\u56e0
         * 
         * @param verifyFailureType \u5ba1\u6838\u5931\u8d25\u539f\u56e0
         */

        public void setVerifyFailureType(Integer verifyFailureType) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73620);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73621);this.verifyFailureType = verifyFailureType;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u7c7b\u578b0\uff1a\u666e\u901a\u4ea7\u54c11\uff1a\u4e3b\u7cfb\u5217\u4ea7\u54c12\uff1a\u5b50\u7cfb\u5217\u4ea7\u54c13\uff1a\u6346\u7ed1\u4ea7\u54c14\uff1a\u793c\u54c1\u53615:\u865a\u62df\u5546\u54c16:\u589e\u503c\u670d\u52a1
         * 
         * @return productType
         */

        public Integer getProductType() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73622);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73623);return productType;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u7c7b\u578b0\uff1a\u666e\u901a\u4ea7\u54c11\uff1a\u4e3b\u7cfb\u5217\u4ea7\u54c12\uff1a\u5b50\u7cfb\u5217\u4ea7\u54c13\uff1a\u6346\u7ed1\u4ea7\u54c14\uff1a\u793c\u54c1\u53615:\u865a\u62df\u5546\u54c16:\u589e\u503c\u670d\u52a1
         * 
         * @param productType \u4ea7\u54c1\u7c7b\u578b0\uff1a\u666e\u901a\u4ea7\u54c11\uff1a\u4e3b\u7cfb\u5217\u4ea7\u54c12\uff1a\u5b50\u7cfb\u5217\u4ea7\u54c13\uff1a\u6346\u7ed1\u4ea7\u54c14\uff1a\u793c\u54c1\u53615:\u865a\u62df\u5546\u54c16:\u589e\u503c\u670d\u52a1
         */

        public void setProductType(Integer productType) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73624);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73625);this.productType = productType;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u80fd\u88ab\u91c7\u8d2d
         * 
         * @return canPurchase
         */

        public Integer getCanPurchase() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73626);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73627);return canPurchase;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u80fd\u88ab\u91c7\u8d2d
         * 
         * @param canPurchase \u662f\u5426\u80fd\u88ab\u91c7\u8d2d
         */

        public void setCanPurchase(Integer canPurchase) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73628);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73629);this.canPurchase = canPurchase;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6807\u51c6\u5305\u88c5\u7bb1sku
         * 
         * @return stdPackageSku
         */

        public String getStdPackageSku() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73630);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73631);return stdPackageSku;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6807\u51c6\u5305\u88c5\u7bb1sku
         * 
         * @param stdPackageSku \u6807\u51c6\u5305\u88c5\u7bb1sku
         */

        public void setStdPackageSku(String stdPackageSku) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73632);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73633);this.stdPackageSku = stdPackageSku;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u9700\u8981\u542f\u7528\u4fdd\u8d28\u671f\u63a7\u52360:\u4e0d\u542f\u75281\uff1a\u542f\u7528
         * 
         * @return userExpireControl
         */

        public Integer getUserExpireControl() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73634);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73635);return userExpireControl;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u9700\u8981\u542f\u7528\u4fdd\u8d28\u671f\u63a7\u52360:\u4e0d\u542f\u75281\uff1a\u542f\u7528
         * 
         * @param userExpireControl \u662f\u5426\u9700\u8981\u542f\u7528\u4fdd\u8d28\u671f\u63a7\u52360:\u4e0d\u542f\u75281\uff1a\u542f\u7528
         */

        public void setUserExpireControl(Integer userExpireControl) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73636);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73637);this.userExpireControl = userExpireControl;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6279\u6b21\u89c4\u5219ID
         * 
         * @return batchRuleId
         */

        public Long getBatchRuleId() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73638);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73639);return batchRuleId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6279\u6b21\u89c4\u5219ID
         * 
         * @param batchRuleId \u6279\u6b21\u89c4\u5219ID
         */

        public void setBatchRuleId(Long batchRuleId) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73640);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73641);this.batchRuleId = batchRuleId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u540d\u79f0\u526f\u6807\u9898
         * 
         * @return nameSubtitle
         */

        public String getNameSubtitle() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73642);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73643);return nameSubtitle;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u540d\u79f0\u526f\u6807\u9898
         * 
         * @param nameSubtitle \u4ea7\u54c1\u540d\u79f0\u526f\u6807\u9898
         */

        public void setNameSubtitle(String nameSubtitle) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73644);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73645);this.nameSubtitle = nameSubtitle;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u7279\u6b8a\u7c7b\u578b\uff1a1\uff1a\u533b\u836f\uff1b11\uff1a\u836f\u54c1\uff1b12\u5668\u68b0\uff1b14-18:\u5904\u65b9\u836f\uff1b50\uff1a\u7535\u5b50\u51ed\u8bc1
         * 
         * @return specialType
         */

        public String getSpecialType() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73646);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73647);return specialType;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u7279\u6b8a\u7c7b\u578b\uff1a1\uff1a\u533b\u836f\uff1b11\uff1a\u836f\u54c1\uff1b12\u5668\u68b0\uff1b14-18:\u5904\u65b9\u836f\uff1b50\uff1a\u7535\u5b50\u51ed\u8bc1
         * 
         * @param specialType \u4ea7\u54c1\u7279\u6b8a\u7c7b\u578b\uff1a1\uff1a\u533b\u836f\uff1b11\uff1a\u836f\u54c1\uff1b12\u5668\u68b0\uff1b14-18:\u5904\u65b9\u836f\uff1b50\uff1a\u7535\u5b50\u51ed\u8bc1
         */

        public void setSpecialType(String specialType) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73648);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73649);this.specialType = specialType;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u7ed9\u7ecf\u9500\u5546\u7684\u6279\u53d1\u4ef7
         * 
         * @return batchPrice
         */

        public Double getBatchPrice() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73650);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73651);return batchPrice;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u7ed9\u7ecf\u9500\u5546\u7684\u6279\u53d1\u4ef7
         * 
         * @param batchPrice \u7ed9\u7ecf\u9500\u5546\u7684\u6279\u53d1\u4ef7
         */

        public void setBatchPrice(Double batchPrice) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73652);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73653);this.batchPrice = batchPrice;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u9700\u8981\u6279\u6b21\u63a7\u52360\uff1a\u4e0d\u9700\u89811\uff1a\u9700\u8981
         * 
         * @return needBatchControl
         */

        public Integer getNeedBatchControl() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73654);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73655);return needBatchControl;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u9700\u8981\u6279\u6b21\u63a7\u52360\uff1a\u4e0d\u9700\u89811\uff1a\u9700\u8981
         * 
         * @param needBatchControl \u662f\u5426\u9700\u8981\u6279\u6b21\u63a7\u52360\uff1a\u4e0d\u9700\u89811\uff1a\u9700\u8981
         */

        public void setNeedBatchControl(Integer needBatchControl) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73656);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73657);this.needBatchControl = needBatchControl;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u9500\u552e\u7a0e\u7387
         * 
         * @return salesTax
         */

        public Double getSalesTax() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73658);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73659);return salesTax;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u9500\u552e\u7a0e\u7387
         * 
         * @param salesTax \u9500\u552e\u7a0e\u7387
         */

        public void setSalesTax(Double salesTax) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73660);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73661);this.salesTax = salesTax;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5916\u90e8\u4ea7\u54c1\u7f16\u7801
         * 
         * @return outerId
         */

        public String getOuterId() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73662);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73663);return outerId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5916\u90e8\u4ea7\u54c1\u7f16\u7801
         * 
         * @param outerId \u5916\u90e8\u4ea7\u54c1\u7f16\u7801
         */

        public void setOuterId(String outerId) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73664);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73665);this.outerId = outerId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5546\u5bb6ID
         * 
         * @return merchantId
         */

        public Long getMerchantId() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73666);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73667);return merchantId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5546\u5bb6ID
         * 
         * @param merchantId \u5546\u5bb6ID
         */

        public void setMerchantId(Long merchantId) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73668);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73669);this.merchantId = merchantId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5546\u5bb6\u540d\u79f0
         * 
         * @return merchantName
         */

        public String getMerchantName() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73670);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73671);return merchantName;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5546\u5bb6\u540d\u79f0
         * 
         * @param merchantName \u5546\u5bb6\u540d\u79f0
         */

        public void setMerchantName(String merchantName) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73672);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73673);this.merchantName = merchantName;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5546\u5bb6\u4ea7\u54c1\u4e3b\u7c7b\u522b\uff08\u7528\u4e8e\u62a5\u8868\u7edf\u8ba1\uff09
         * 
         * @return masterCategoryId
         */

        public Long getMasterCategoryId() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73674);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73675);return masterCategoryId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5546\u5bb6\u4ea7\u54c1\u4e3b\u7c7b\u522b\uff08\u7528\u4e8e\u62a5\u8868\u7edf\u8ba1\uff09
         * 
         * @param masterCategoryId \u5546\u5bb6\u4ea7\u54c1\u4e3b\u7c7b\u522b\uff08\u7528\u4e8e\u62a5\u8868\u7edf\u8ba1\uff09
         */

        public void setMasterCategoryId(Long masterCategoryId) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73676);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73677);this.masterCategoryId = masterCategoryId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5173\u6ce8\u7b49\u7ea7\u8bbe\u7f6e
         * 
         * @return concernLevel
         */

        public Integer getConcernLevel() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73678);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73679);return concernLevel;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5173\u6ce8\u7b49\u7ea7\u8bbe\u7f6e
         * 
         * @param concernLevel \u5173\u6ce8\u7b49\u7ea7\u8bbe\u7f6e
         */

        public void setConcernLevel(Integer concernLevel) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73680);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73681);this.concernLevel = concernLevel;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5173\u6ce8\u7406\u7531
         * 
         * @return concernReason
         */

        public String getConcernReason() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73682);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73683);return concernReason;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5173\u6ce8\u7406\u7531
         * 
         * @param concernReason \u5173\u6ce8\u7406\u7531
         */

        public void setConcernReason(String concernReason) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73684);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73685);this.concernReason = concernReason;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u53ef\u552e
         * 
         * @return canSale
         */

        public Integer getCanSale() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73686);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73687);return canSale;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u53ef\u552e
         * 
         * @param canSale \u662f\u5426\u53ef\u552e
         */

        public void setCanSale(Integer canSale) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73688);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73689);this.canSale = canSale;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u663e\u793a
         * 
         * @return canShow
         */

        public Integer getCanShow() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73690);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73691);return canShow;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u663e\u793a
         * 
         * @param canShow \u662f\u5426\u663e\u793a
         */

        public void setCanShow(Integer canShow) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73692);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73693);this.canShow = canShow;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u9500\u552e\u7a0e\u7387
         * 
         * @return prodcutTaxRate
         */

        public Long getProdcutTaxRate() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73694);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73695);return prodcutTaxRate;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u9500\u552e\u7a0e\u7387
         * 
         * @param prodcutTaxRate \u4ea7\u54c1\u9500\u552e\u7a0e\u7387
         */

        public void setProdcutTaxRate(Long prodcutTaxRate) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73696);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73697);this.prodcutTaxRate = prodcutTaxRate;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u652f\u6301VIP0:\u4e0d\u652f\u63011:\u652f\u6301
         * 
         * @return canVipDiscount
         */

        public Integer getCanVipDiscount() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73698);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73699);return canVipDiscount;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u652f\u6301VIP0:\u4e0d\u652f\u63011:\u652f\u6301
         * 
         * @param canVipDiscount \u662f\u5426\u652f\u6301VIP0:\u4e0d\u652f\u63011:\u652f\u6301
         */

        public void setCanVipDiscount(Integer canVipDiscount) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73700);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73701);this.canVipDiscount = canVipDiscount;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5206\u7c7b\u540d\u79f0
         * 
         * @return categoryName
         */

        public String getCategoryName() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73702);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73703);return categoryName;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5206\u7c7b\u540d\u79f0
         * 
         * @param categoryName \u5206\u7c7b\u540d\u79f0
         */

        public void setCategoryName(String categoryName) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73704);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73705);this.categoryName = categoryName;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u9500\u552e\u4ef7\u683c
         * 
         * @return salePrice
         */

        public Double getSalePrice() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73706);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73707);return salePrice;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u9500\u552e\u4ef7\u683c
         * 
         * @param salePrice \u9500\u552e\u4ef7\u683c
         */

        public void setSalePrice(Double salePrice) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73708);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73709);this.salePrice = salePrice;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5e93\u5b58
         * 
         * @return stockNum
         */

        public Long getStockNum() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73710);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73711);return stockNum;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5e93\u5b58
         * 
         * @param stockNum \u5e93\u5b58
         */

        public void setStockNum(Long stockNum) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73712);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73713);this.stockNum = stockNum;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5546\u5bb6\u7c7b\u522b\u540d\u79f0
         * 
         * @return merchantCategoryName
         */

        public String getMerchantCategoryName() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73714);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73715);return merchantCategoryName;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5546\u5bb6\u7c7b\u522b\u540d\u79f0
         * 
         * @param merchantCategoryName \u5546\u5bb6\u7c7b\u522b\u540d\u79f0
         */

        public void setMerchantCategoryName(String merchantCategoryName) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73716);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73717);this.merchantCategoryName = merchantCategoryName;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5546\u5bb6\u8be6\u60c5
         * 
         * @return productDescription
         */

        public String getProductDescription() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73718);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73719);return productDescription;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5546\u5bb6\u8be6\u60c5
         * 
         * @param productDescription \u5546\u5bb6\u8be6\u60c5
         */

        public void setProductDescription(String productDescription) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73720);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73721);this.productDescription = productDescription;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u53ef\u8c03\u62e80\uff1a\u4e0d\u53ef\u4ee51\uff1a\u53ef\u4ee5
         * 
         * @return isTransfer
         */

        public Integer getIsTransfer() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73722);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73723);return isTransfer;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u53ef\u8c03\u62e80\uff1a\u4e0d\u53ef\u4ee51\uff1a\u53ef\u4ee5
         * 
         * @param isTransfer \u662f\u5426\u53ef\u8c03\u62e80\uff1a\u4e0d\u53ef\u4ee51\uff1a\u53ef\u4ee5
         */

        public void setIsTransfer(Integer isTransfer) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73724);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73725);this.isTransfer = isTransfer;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u9700\u8981\u5ba1\u68380\uff1a\u65b0\u589e\u672a\u63d0\u4ea4\uff1b1\uff1a\u9700\u8981\u5ba1\u6838\uff1b2\uff1a\u7f16\u8f91\u672a\u63d0\u4ea4
         * 
         * @return isSubmit
         */

        public Integer getIsSubmit() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73726);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73727);return isSubmit;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u9700\u8981\u5ba1\u68380\uff1a\u65b0\u589e\u672a\u63d0\u4ea4\uff1b1\uff1a\u9700\u8981\u5ba1\u6838\uff1b2\uff1a\u7f16\u8f91\u672a\u63d0\u4ea4
         * 
         * @param isSubmit \u662f\u5426\u9700\u8981\u5ba1\u68380\uff1a\u65b0\u589e\u672a\u63d0\u4ea4\uff1b1\uff1a\u9700\u8981\u5ba1\u6838\uff1b2\uff1a\u7f16\u8f91\u672a\u63d0\u4ea4
         */

        public void setIsSubmit(Integer isSubmit) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73728);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73729);this.isSubmit = isSubmit;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5ba1\u6838\u5931\u8d25\u7c7b\u578b
         * 
         * @return verifyFailueType
         */

        public Integer getVerifyFailueType() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73730);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73731);return verifyFailueType;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5ba1\u6838\u5931\u8d25\u7c7b\u578b
         * 
         * @param verifyFailueType \u5ba1\u6838\u5931\u8d25\u7c7b\u578b
         */

        public void setVerifyFailueType(Integer verifyFailueType) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73732);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73733);this.verifyFailueType = verifyFailueType;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u62fc\u97f3
         * 
         * @return productSpell
         */

        public String getProductSpell() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73734);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73735);return productSpell;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u62fc\u97f3
         * 
         * @param productSpell \u4ea7\u54c1\u62fc\u97f3
         */

        public void setProductSpell(String productSpell) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73736);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73737);this.productSpell = productSpell;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u540d\u79f0\u524d\u7f00
         * 
         * @return productNamePrefix
         */

        public String getProductNamePrefix() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73738);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73739);return productNamePrefix;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u540d\u79f0\u524d\u7f00
         * 
         * @param productNamePrefix \u4ea7\u54c1\u540d\u79f0\u524d\u7f00
         */

        public void setProductNamePrefix(String productNamePrefix) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73740);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73741);this.productNamePrefix = productNamePrefix;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5ba1\u6838\u5931\u8d25\u539f\u56e0
         * 
         * @return failueReason
         */

        public String getFailueReason() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73742);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73743);return failueReason;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5ba1\u6838\u5931\u8d25\u539f\u56e0
         * 
         * @param failueReason \u5ba1\u6838\u5931\u8d25\u539f\u56e0
         */

        public void setFailueReason(String failueReason) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73744);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73745);this.failueReason = failueReason;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * orgPicUrl
         * 
         * @return orgPicUrl
         */

        public String getOrgPicUrl() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73746);

            __CLR4_5_21kkp1kkplusvne3t.R.inc(73747);return orgPicUrl;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * orgPicUrl
         * 
         * @param orgPicUrl orgPicUrl
         */

        public void setOrgPicUrl(String orgPicUrl) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73748);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73749);this.orgPicUrl = orgPicUrl;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6269\u5c55\u5206\u7c7b\u540d\u79f0
         * 
         * @return subCategoryName
         */

        public String getSubCategoryName() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73750);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73751);return subCategoryName;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6269\u5c55\u5206\u7c7b\u540d\u79f0
         * 
         * @param subCategoryName \u6269\u5c55\u5206\u7c7b\u540d\u79f0
         */

        public void setSubCategoryName(String subCategoryName) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73752);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73753);this.subCategoryName = subCategoryName;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6269\u5c55\u5206\u7c7bID
         * 
         * @return subCategoryId
         */

        public Long getSubCategoryId() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73754);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73755);return subCategoryId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6269\u5c55\u5206\u7c7bID
         * 
         * @param subCategoryId \u6269\u5c55\u5206\u7c7bID
         */

        public void setSubCategoryId(Long subCategoryId) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73756);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73757);this.subCategoryId = subCategoryId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * 7\u5929\u5185\u65e5\u5747\u9500\u91cf
         * 
         * @return dailySale
         */

        public Integer getDailySale() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73758);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73759);return dailySale;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * 7\u5929\u5185\u65e5\u5747\u9500\u91cf
         * 
         * @param dailySale 7\u5929\u5185\u65e5\u5747\u9500\u91cf
         */

        public void setDailySale(Integer dailySale) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73760);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73761);this.dailySale = dailySale;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u67e5\u770b\u662f\u5426\u6709\u4e3b\u56fe
         * 
         * @return picCount
         */

        public Integer getPicCount() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73762);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73763);return picCount;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u67e5\u770b\u662f\u5426\u6709\u4e3b\u56fe
         * 
         * @param picCount \u67e5\u770b\u662f\u5426\u6709\u4e3b\u56fe
         */

        public void setPicCount(Integer picCount) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73764);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73765);this.picCount = picCount;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5f3a\u5236\u4e0b\u67b6\u539f\u56e0
         * 
         * @return underCarriageReason
         */

        public Integer getUnderCarriageReason() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73766);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73767);return underCarriageReason;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5f3a\u5236\u4e0b\u67b6\u539f\u56e0
         * 
         * @param underCarriageReason \u5f3a\u5236\u4e0b\u67b6\u539f\u56e0
         */

        public void setUnderCarriageReason(Integer underCarriageReason) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73768);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73769);this.underCarriageReason = underCarriageReason;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5f02\u5e38\u4fe1\u606f
         * 
         * @return errorMessage
         */

        public String getErrorMessage() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73770);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73771);return errorMessage;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

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

        public Integer getAlertStockCount() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73772);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73773);return alertStockCount;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5e93\u5b58\u9884\u8b66\u6570\u91cf
         * 
         * @param alertStockCount \u5e93\u5b58\u9884\u8b66\u6570\u91cf
         */

        public void setAlertStockCount(Integer alertStockCount) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73774);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73775);this.alertStockCount = alertStockCount;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

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
        public Long getFormalPmInfoId() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73776);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73777);return formalPmInfoId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setFormalPmInfoId(Long formalPmInfoId) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73778);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73779);this.formalPmInfoId = formalPmInfoId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5e93\u5b58\u72b6\u51b5\uff08\u4ea7\u54c1\u9884\u89c8\u9875\u7528\uff09
         * 
         * @return deliveryInfo
         */

        public String getDeliveryInfo() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73780);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73781);return deliveryInfo;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u5e93\u5b58\u72b6\u51b5\uff08\u4ea7\u54c1\u9884\u89c8\u9875\u7528\uff09
         * 
         * @param deliveryInfo \u5e93\u5b58\u72b6\u51b5\uff08\u4ea7\u54c1\u9884\u89c8\u9875\u7528\uff09
         */

        public void setDeliveryInfo(String deliveryInfo) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73782);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73783);this.deliveryInfo = deliveryInfo;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4e3b\u56fe\u94fe\u63a5
         * 
         * @return picUrl
         */

        public String getPicUrl() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73784);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73785);return picUrl;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4e3b\u56fe\u94fe\u63a5
         * 
         * @param picUrl \u4e3b\u56fe\u94fe\u63a5
         */

        public void setPicUrl(String picUrl) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73786);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73787);this.picUrl = picUrl;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u8df3\u5230\u5546\u54c1\u8be6\u60c5\u9875\u7684\u6765\u6e900:\u9996\u6b21\u5ba1\u6838\u9875\u97621\uff1a\u4e8c\u6b21\u5ba1\u6838\u9875\u97622\uff1a\u5ba1\u6838\u5931\u8d25\u9875\u9762
         * 
         * @return viewFromTag
         */

        public Integer getViewFromTag() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73788);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73789);return viewFromTag;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u8df3\u5230\u5546\u54c1\u8be6\u60c5\u9875\u7684\u6765\u6e900:\u9996\u6b21\u5ba1\u6838\u9875\u97621\uff1a\u4e8c\u6b21\u5ba1\u6838\u9875\u97622\uff1a\u5ba1\u6838\u5931\u8d25\u9875\u9762
         * 
         * @param viewFromTag \u8df3\u5230\u5546\u54c1\u8be6\u60c5\u9875\u7684\u6765\u6e900:\u9996\u6b21\u5ba1\u6838\u9875\u97621\uff1a\u4e8c\u6b21\u5ba1\u6838\u9875\u97622\uff1a\u5ba1\u6838\u5931\u8d25\u9875\u9762
         */

        public void setViewFromTag(Integer viewFromTag) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73790);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73791);this.viewFromTag = viewFromTag;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public Double getProductNonMemberPrice() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73792);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73793);return productNonMemberPrice;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ea7\u54c1\u552e\u4ef7
         * 
         * @param productNonMemberPrice \u4ea7\u54c1\u552e\u4ef7
         */

        public void setProductNonMemberPrice(Double productNonMemberPrice) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73794);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73795);this.productNonMemberPrice = productNonMemberPrice;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public Integer getIsUpdate() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73796);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73797);return isUpdate;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u66f4\u65b0\u64cd\u4f5c
         * 
         * @param isUpdate \u662f\u5426\u66f4\u65b0\u64cd\u4f5c
         */

        public void setIsUpdate(Integer isUpdate) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73798);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73799);this.isUpdate = isUpdate;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public List<String> getProductSizeSet() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73800);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73801);return productSizeSet;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setProductSizeSet(List<String> productSizeSet) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73802);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73803);this.productSizeSet = productSizeSet;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public Boolean getIsMainProduct() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73804);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73805);return isMainProduct;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u662f\u5426\u4e3b\u4ea7\u54c1
         * 
         * @param isMainProduct \u662f\u5426\u4e3b\u4ea7\u54c1
         */

        public void setIsMainProduct(Boolean isMainProduct) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73806);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73807);this.isMainProduct = isMainProduct;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ece\u56fe\u7247\u7a7a\u95f4\u4e2d\u8fd4\u56de\u56fe\u7247ID\u548cURL
         * 
         * @return productPicIdAndURL
         */

        public String getProductPicIdAndURL() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73808);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73809);return productPicIdAndURL;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u4ece\u56fe\u7247\u7a7a\u95f4\u4e2d\u8fd4\u56de\u56fe\u7247ID\u548cURL
         * 
         * @param productPicIdAndURL \u4ece\u56fe\u7247\u7a7a\u95f4\u4e2d\u8fd4\u56de\u56fe\u7247ID\u548cURL
         */

        public void setProductPicIdAndURL(String productPicIdAndURL) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73810);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73811);this.productPicIdAndURL = productPicIdAndURL;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public Integer getIsTemp() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73812);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73813);return isTemp;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * isTemp
         * 
         * @param isTemp isTemp
         */

        public void setIsTemp(Integer isTemp) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73814);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73815);this.isTemp = isTemp;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public Double getPriceRate() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73816);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73817);return priceRate;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setPriceRate(Double priceRate) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73818);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73819);this.priceRate = priceRate;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public Integer getPicSpecialType() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73820);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73821);return picSpecialType;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setPicSpecialType(Integer picSpecialType) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73822);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73823);this.picSpecialType = picSpecialType;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public Integer getExemptStatus() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73824);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73825);return exemptStatus;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setExemptStatus(Integer exemptStatus) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73826);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73827);this.exemptStatus = exemptStatus;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public String getViolationReasonIds() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73828);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73829);return violationReasonIds;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u514d\u5ba1\u5546\u5bb6\u65b0\u589e\u5b57\u6bb5:\u8bb0\u5f55\u8fdd\u89c4\u7684\u539f\u56e0
         * 
         * @param violationReasonIds \u514d\u5ba1\u5546\u5bb6\u65b0\u589e\u5b57\u6bb5:\u8bb0\u5f55\u8fdd\u89c4\u7684\u539f\u56e0
         */

        public void setViolationReasonIds(String violationReasonIds) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73830);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73831);this.violationReasonIds = violationReasonIds;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u514d\u5ba1\u5546\u5bb6\u65b0\u589e\u5b57\u6bb5:\u8bb0\u5f55\u8fdd\u89c4\u7684\u539f\u56e0\u6587\u5b57\u4fe1\u606f\uff0c\u9017\u53f7\u5206\u9694
         * 
         * @return violationReasons
         */

        public String getViolationReasons() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73832);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73833);return violationReasons;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setViolationReasons(String violationReasons) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73834);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73835);this.violationReasons = violationReasons;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u8fdd\u89c4\u9650\u5b9a\u4fee\u6539\u5269\u4f59\u65f6\u95f4\uff08\u6beb\u79d2\u6570\uff09
         * 
         * @return remainTime
         */

        public Long getRemainTime() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73836);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73837);return remainTime;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u8fdd\u89c4\u9650\u5b9a\u4fee\u6539\u5269\u4f59\u65f6\u95f4\uff08\u6beb\u79d2\u6570\uff09
         * 
         * @param remainTime \u8fdd\u89c4\u9650\u5b9a\u4fee\u6539\u5269\u4f59\u65f6\u95f4\uff08\u6beb\u79d2\u6570\uff09
         */

        public void setRemainTime(Long remainTime) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73838);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73839);this.remainTime = remainTime;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public Integer getSubmitOrder() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73840);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73841);return submitOrder;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setSubmitOrder(Integer submitOrder) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73842);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73843);this.submitOrder = submitOrder;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public Integer getProductSource() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73844);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73845);return productSource;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setProductSource(Integer productSource) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73846);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73847);this.productSource = productSource;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public String getProductSname() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73848);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73849);return productSname;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setProductSname(String productSname) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73850);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73851);this.productSname = productSname;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public Integer getCanFenqi() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73852);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73853);return canFenqi;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setCanFenqi(Integer canFenqi) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73854);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73855);this.canFenqi = canFenqi;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public String getSeason() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73856);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73857);return season;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setSeason(String season) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73858);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73859);this.season = season;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public Integer getIsKa() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73860);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73861);return isKa;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setIsKa(Integer isKa) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73862);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73863);this.isKa = isKa;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public Integer getKaMCreateTime() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73864);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73865);return kaMCreateTime;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setKaMCreateTime(Integer kaMCreateTime) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73866);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73867);this.kaMCreateTime = kaMCreateTime;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public Integer getDeliveryDay() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73868);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73869);return deliveryDay;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setDeliveryDay(Integer deliveryDay) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73870);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73871);this.deliveryDay = deliveryDay;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public Integer getIsEdit() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73872);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73873);return isEdit;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setIsEdit(Integer isEdit) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73874);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73875);this.isEdit = isEdit;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public String getProductBrandName() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73876);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73877);return productBrandName;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setProductBrandName(String productBrandName) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73878);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73879);this.productBrandName = productBrandName;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u7c7b\u522b\u62fc\u63a5\u5b57\u7b26\u4e32
         * 
         * @return categoryStr
         */

        public String getCategoryStr() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73880);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73881);return categoryStr;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u7c7b\u522b\u62fc\u63a5\u5b57\u7b26\u4e32
         * 
         * @param categoryStr \u7c7b\u522b\u62fc\u63a5\u5b57\u7b26\u4e32
         */

        public void setCategoryStr(String categoryStr) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73882);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73883);this.categoryStr = categoryStr;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6269\u5c55\u7c7b\u522b\u62fc\u63a5\u5b57\u7b26\u4e32
         * 
         * @return extendCategoryStr
         */

        public String getExtendCategoryStr() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73884);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73885);return extendCategoryStr;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        /**
         * \u6269\u5c55\u7c7b\u522b\u62fc\u63a5\u5b57\u7b26\u4e32
         * 
         * @param extendCategoryStr \u6269\u5c55\u7c7b\u522b\u62fc\u63a5\u5b57\u7b26\u4e32
         */

        public void setExtendCategoryStr(String extendCategoryStr) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73886);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73887);this.extendCategoryStr = extendCategoryStr;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public String getCategoryIdStr() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73888);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73889);return categoryIdStr;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setCategoryIdStr(String categoryIdStr) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73890);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73891);this.categoryIdStr = categoryIdStr;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public String getExtendCategoryIdStr() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73892);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73893);return extendCategoryIdStr;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}


        public Long getDefaultWarehouseId() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73894);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73895);return defaultWarehouseId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setDefaultWarehouseId(Long defaultWarehouseId) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73896);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73897);this.defaultWarehouseId = defaultWarehouseId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public Long getOldCategoryId() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73898);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73899);return oldCategoryId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setOldCategoryId(Long oldCategoryId) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73900);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73901);this.oldCategoryId = oldCategoryId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public Long getOldExtendCategoryId() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73902);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73903);return oldExtendCategoryId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setOldExtendCategoryId(Long oldExtendCategoryId) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73904);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73905);this.oldExtendCategoryId = oldExtendCategoryId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public String getDeletedProductId() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73906);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73907);return deletedProductId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setDeletedProductId(String deletedProductId) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73908);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73909);this.deletedProductId = deletedProductId;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public String getReplaceProductSize() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73910);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73911);return replaceProductSize;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setReplaceProductSize(String replaceProductSize) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73912);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73913);this.replaceProductSize = replaceProductSize;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public List<Long> getMasterCategoryIdList() {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73914);
            __CLR4_5_21kkp1kkplusvne3t.R.inc(73915);return masterCategoryIdList;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

        public void setMasterCategoryIdList(List<Long> masterCategoryIdList) {try{__CLR4_5_21kkp1kkplusvne3t.R.inc(73916);
            //this.masterCategoryIdList = masterCategoryIdList;
        }finally{__CLR4_5_21kkp1kkplusvne3t.R.flushNeeded();}}

    }

}
