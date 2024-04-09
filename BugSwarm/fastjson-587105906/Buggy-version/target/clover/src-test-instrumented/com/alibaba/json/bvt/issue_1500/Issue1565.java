/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1500;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.serializer.SerializeConfig;
import junit.framework.TestCase;
import org.junit.Assert;

import java.io.Serializable;
import java.util.List;

/**
 * Created by SongLing.Dong on 11/7/2017.
 */
public class Issue1565 extends TestCase{static class __CLR4_1_101axz1axzlusqka27{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,61887,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_testLargeBeanContainsOver256Field(){__CLR4_1_101axz1axzlusqka27.R.globalSliceStart(getClass().getName(),60839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bydi5v1axz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101axz1axzlusqka27.R.rethrow($CLV_t2$);}finally{__CLR4_1_101axz1axzlusqka27.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1500.Issue1565.test_testLargeBeanContainsOver256Field",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),60839,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bydi5v1axz(){try{__CLR4_1_101axz1axzlusqka27.R.inc(60839);
        __CLR4_1_101axz1axzlusqka27.R.inc(60840);SerializeConfig serializeConfig = new SerializeConfig();
        __CLR4_1_101axz1axzlusqka27.R.inc(60841);serializeConfig.propertyNamingStrategy = PropertyNamingStrategy.SnakeCase;

//        SmallBean smallBean = new SmallBean();
//        smallBean.setId("S35669xxxxxxxxxxxxxx");
//        smallBean.setNetValueDate(20171105);
//
//        System.out.println(JSON.toJSONString(smallBean, serializeConfig));


        __CLR4_1_101axz1axzlusqka27.R.inc(60842);LargeBean expectedBean = new LargeBean();
        __CLR4_1_101axz1axzlusqka27.R.inc(60843);expectedBean.setId("S35669");
        __CLR4_1_101axz1axzlusqka27.R.inc(60844);expectedBean.setNetValueDate(20171105);
        __CLR4_1_101axz1axzlusqka27.R.inc(60845);String expectedStr = "{\"id\":\"S35669\",\"net_value_date\":20171105}";

        __CLR4_1_101axz1axzlusqka27.R.inc(60846);String actualStr = JSON.toJSONString(expectedBean, serializeConfig);
        __CLR4_1_101axz1axzlusqka27.R.inc(60847);JSONObject actualBean = JSON.parseObject(actualStr);
        __CLR4_1_101axz1axzlusqka27.R.inc(60848);Assert.assertEquals(expectedStr, actualStr);
        __CLR4_1_101axz1axzlusqka27.R.inc(60849);Assert.assertEquals(expectedBean.getId(), actualBean.getString("id"));
        __CLR4_1_101axz1axzlusqka27.R.inc(60850);Assert.assertEquals(expectedBean.getNetValueDate(), actualBean.getInteger("net_value_date"));



    }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

    public static class SmallBean implements Serializable{
        private String id;

        public String getId() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60851);
            __CLR4_1_101axz1axzlusqka27.R.inc(60852);return id;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setId(String id) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60853);
            __CLR4_1_101axz1axzlusqka27.R.inc(60854);this.id = id;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Integer getNetValueDate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60855);
            __CLR4_1_101axz1axzlusqka27.R.inc(60856);return netValueDate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNetValueDate(Integer netValueDate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60857);
            __CLR4_1_101axz1axzlusqka27.R.inc(60858);this.netValueDate = netValueDate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        private Integer netValueDate;
    }

    public static class LargeBean implements Serializable {

        /**
         * \u6bcf\u9875\u6570\u91cf
         */
        private Integer pageSize;

        /**
         * \u83b7\u53d6\u7b2c\u4e00\u4e2a\u8bb0\u5f55\u7684\u4e0b\u6807
         */
        private Integer firstResult;

        /**
         * \u83b7\u53d6\u6570\u91cf
         */
        private Integer fetchSize;

        /**
         * \u5f00\u59cb\u65f6\u95f4
         */
        private String startTime;

        /**
         * \u7ed3\u675f\u65f6\u95f4
         */
        private String endTime;

        /**
         * \u662f\u5426\u7ba1\u7406\u5458\u6807\u8bc6
         */
        private Boolean isAdministrator;

        /**
         * \u6392\u5e8f\u65b9\u5f0f 0:\u5347\u5e8f 1:\u5012\u5e8f
         */
        private Byte sortMode;

        /**
         * \u6392\u5e8f\u5b57\u6bb5\u540d
         */
        private String sortFieldName;

        /**
         * \u6392\u5e8f\u5b57\u6bb5\u503c
         */
        private String sortFieldValue;

        /**
         * \u521b\u5efa\u65f6\u95f4\u6233(\u6beb\u79d2)
         */
        private Long createTimestamp;

        /**
         * \u4e0a\u4e00\u6b21\u9875\u7801
         */
        private Integer lastPage;

        /**
         * \u67e5\u8be2\u7c7b\u578b
         */
        private Byte queryType;

        /**
         * \u5206\u7247\u952e
         */
        private String shard;

        /**
         * \u51c0\u503c\u65e5\u671f\uff0c\u683c\u5f0f\uff1ayyyyMMdd
         */
        private Integer netValueDate;

        /**
         * \u5355\u4f4d\u51c0\u503c
         */
        private Float unitNetValue;

        /**
         * \u7d2f\u8ba1\u51c0\u503c
         */
        private Float totalNetValue;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u7d2f\u8ba1\u6536\u76ca\u7387
         */
        private Float nomTotalYield;

        /**
         * \u8fd1\u534a\u5e74\u7d2f\u8ba1\u6536\u76ca\u7387
         */
        private Float nhyTotalYield;

        /**
         * \u8fd1\u4e00\u5e74\u7d2f\u8ba1\u6536\u76ca\u7387
         */
        private Float noyTotalYield;

        /**
         * \u672c\u6708\u7d2f\u8ba1\u6536\u76ca\u7387
         */
        private Float tmTotalYield;

        /**
         * \u672c\u5b63\u5ea6\u7d2f\u8ba1\u6536\u76ca\u7387
         */
        private Float tqTotalYield;

        /**
         * \u672c\u5e74\u7d2f\u8ba1\u6536\u76ca\u7387
         */
        private Float tyTotalYield;

        /**
         * \u6240\u6709\u7d2f\u8ba1\u6536\u76ca\u7387
         */
        private Float allTotalYield;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u5e74\u5316\u6536\u76ca\u7387
         */
        private Float nomAnnualizedReturn;

        /**
         * \u8fd1\u534a\u5e74\u5e74\u5316\u6536\u76ca\u7387
         */
        private Float nhyAnnualizedReturn;

        /**
         * \u8fd1\u4e00\u5e74\u5e74\u5316\u6536\u76ca\u7387
         */
        private Float noyAnnualizedReturn;

        /**
         * \u672c\u6708\u5e74\u5316\u6536\u76ca\u7387
         */
        private Float tmAnnualizedReturn;

        /**
         * \u672c\u5b63\u5ea6\u5e74\u5316\u6536\u76ca\u7387
         */
        private Float tqAnnualizedReturn;

        /**
         * \u672c\u5e74\u5e74\u5316\u6536\u76ca\u7387
         */
        private Float tyAnnualizedReturn;

        /**
         * \u6240\u6709\u5e74\u5316\u6536\u76ca\u7387
         */
        private Float allAnnualizedReturn;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u6700\u5927\u76c8\u5229\u5e45\u5ea6
         */
        private Float nomMaxProfitMargin;

        /**
         * \u8fd1\u534a\u5e74\u6700\u5927\u76c8\u5229\u5e45\u5ea6
         */
        private Float nhyMaxProfitMargin;

        /**
         * \u8fd1\u4e00\u5e74\u6700\u5927\u76c8\u5229\u5e45\u5ea6
         */
        private Float noyMaxProfitMargin;

        /**
         * \u672c\u6708\u6700\u5927\u76c8\u5229\u5e45\u5ea6
         */
        private Float tmMaxProfitMargin;

        /**
         * \u672c\u5b63\u5ea6\u6700\u5927\u76c8\u5229\u5e45\u5ea6
         */
        private Float tqMaxProfitMargin;

        /**
         * \u672c\u5e74\u6700\u5927\u76c8\u5229\u5e45\u5ea6
         */
        private Float tyMaxProfitMargin;

        /**
         * \u6240\u6709\u6700\u5927\u76c8\u5229\u5e45\u5ea6
         */
        private Float allMaxProfitMargin;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u6700\u5927\u5355\u6b21\u76c8\u5229
         */
        private Float nomMaxSingleProfit;

        /**
         * \u8fd1\u534a\u5e74\u6700\u5927\u5355\u6b21\u76c8\u5229
         */
        private Float nhyMaxSingleProfit;

        /**
         * \u8fd1\u4e00\u5e74\u6700\u5927\u5355\u6b21\u76c8\u5229
         */
        private Float noyMaxSingleProfit;

        /**
         * \u672c\u6708\u6700\u5927\u5355\u6b21\u76c8\u5229
         */
        private Float tmMaxSingleProfit;

        /**
         * \u672c\u5b63\u5ea6\u6700\u5927\u5355\u6b21\u76c8\u5229
         */
        private Float tqMaxSingleProfit;

        /**
         * \u672c\u5e74\u6700\u5927\u5355\u6b21\u76c8\u5229
         */
        private Float tyMaxSingleProfit;

        /**
         * \u6240\u6709\u6700\u5927\u5355\u6b21\u76c8\u5229
         */
        private Float allMaxSingleProfit;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u6700\u5927\u8fde\u7eed\u76c8\u5229\u6b21\u6570
         */
        private Integer nomMaxConProfitTime;

        /**
         * \u8fd1\u534a\u5e74\u6700\u5927\u8fde\u7eed\u76c8\u5229\u6b21\u6570
         */
        private Integer nhyMaxConProfitTime;

        /**
         * \u8fd1\u4e00\u5e74\u6700\u5927\u8fde\u7eed\u76c8\u5229\u6b21\u6570
         */
        private Integer noyMaxConProfitTime;

        /**
         * \u672c\u6708\u6700\u5927\u8fde\u7eed\u76c8\u5229\u6b21\u6570
         */
        private Integer tmMaxConProfitTime;

        /**
         * \u672c\u5b63\u5ea6\u6700\u5927\u8fde\u7eed\u76c8\u5229\u6b21\u6570
         */
        private Integer tqMaxConProfitTime;

        /**
         * \u672c\u5e74\u6700\u5927\u8fde\u7eed\u76c8\u5229\u6b21\u6570
         */
        private Integer tyMaxConProfitTime;

        /**
         * \u6240\u6709\u6700\u5927\u8fde\u7eed\u76c8\u5229\u6b21\u6570
         */
        private Integer allMaxConProfitTime;

        /**
         * \u6240\u6709\u6700\u5927\u8fde\u7eed\u76c8\u5229\u6b21\u6570\u51fa\u73b0\u65e5\u671f
         */
        private Integer allMaxConProfitTimeDate;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u6700\u5927\u56de\u64a4
         */
        private Float nomMaxDrawdown;

        /**
         * \u8fd1\u534a\u5e74\u6700\u5927\u56de\u64a4
         */
        private Float nhyMaxDrawdown;

        /**
         * \u8fd1\u4e00\u5e74\u6700\u5927\u56de\u64a4
         */
        private Float noyMaxDrawdown;

        /**
         * \u672c\u6708\u6700\u5927\u56de\u64a4
         */
        private Float tmMaxDrawdown;

        /**
         * \u672c\u5b63\u5ea6\u6700\u5927\u56de\u64a4
         */
        private Float tqMaxDrawdown;

        /**
         * \u672c\u5e74\u6700\u5927\u56de\u64a4
         */
        private Float tyMaxDrawdown;

        /**
         * \u6240\u6709\u6700\u5927\u56de\u64a4
         */
        private Float allMaxDrawdown;

        /**
         * \u6240\u6709\u6700\u5927\u56de\u64a4\u51fa\u73b0\u65e5\u671f
         */
        private Integer allMaxDrawdownDate;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u6700\u5927\u5355\u6b21\u56de\u64a4
         */
        private Float nomMaxSingleDrawdown;

        /**
         * \u8fd1\u534a\u5e74\u6700\u5927\u5355\u6b21\u56de\u64a4
         */
        private Float nhyMaxSingleDrawdown;

        /**
         * \u8fd1\u4e00\u5e74\u6700\u5927\u5355\u6b21\u56de\u64a4
         */
        private Float noyMaxSingleDrawdown;

        /**
         * \u672c\u6708\u6700\u5927\u5355\u6b21\u56de\u64a4
         */
        private Float tmMaxSingleDrawdown;

        /**
         * \u672c\u5b63\u5ea6\u6700\u5927\u5355\u6b21\u56de\u64a4
         */
        private Float tqMaxSingleDrawdown;

        /**
         * \u672c\u5e74\u6700\u5927\u5355\u6b21\u56de\u64a4
         */
        private Float tyMaxSingleDrawdown;

        /**
         * \u6240\u6709\u6700\u5927\u5355\u6b21\u56de\u64a4
         */
        private Float allMaxSingleDrawdown;

        /**
         * \u6240\u6709\u6700\u5927\u5355\u6b21\u56de\u64a4\u51fa\u73b0\u65e5\u671f
         */
        private Integer allMaxSingleDrawdownDate;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u6700\u5927\u8fde\u7eed\u56de\u64a4\u6b21\u6570
         */
        private Integer nomMaxConDrawdownTime;

        /**
         * \u8fd1\u534a\u5e74\u6700\u5927\u8fde\u7eed\u56de\u64a4\u6b21\u6570
         */
        private Integer nhyMaxConDrawdownTime;

        /**
         * \u8fd1\u4e00\u5e74\u6700\u5927\u8fde\u7eed\u56de\u64a4\u6b21\u6570
         */
        private Integer noyMaxConDrawdownTime;

        /**
         * \u672c\u6708\u6700\u5927\u8fde\u7eed\u56de\u64a4\u6b21\u6570
         */
        private Integer tmMaxConDrawdownTime;

        /**
         * \u672c\u5b63\u5ea6\u6700\u5927\u8fde\u7eed\u56de\u64a4\u6b21\u6570
         */
        private Integer tqMaxConDrawdownTime;

        /**
         * \u672c\u5e74\u6700\u5927\u8fde\u7eed\u56de\u64a4\u6b21\u6570
         */
        private Integer tyMaxConDrawdownTime;

        /**
         * \u6240\u6709\u6700\u5927\u8fde\u7eed\u56de\u64a4\u6b21\u6570
         */
        private Integer allMaxConDrawdownTime;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u6536\u76ca\u7387\u6807\u51c6\u5dee
         */
        private Float nomYieldStdDeviation;

        /**
         * \u8fd1\u534a\u5e74\u6536\u76ca\u7387\u6807\u51c6\u5dee
         */
        private Float nhyYieldStdDeviation;

        /**
         * \u8fd1\u4e00\u5e74\u6536\u76ca\u7387\u6807\u51c6\u5dee
         */
        private Float noyYieldStdDeviation;

        /**
         * \u672c\u6708\u6536\u76ca\u7387\u6807\u51c6\u5dee
         */
        private Float tmYieldStdDeviation;

        /**
         * \u672c\u5b63\u5ea6\u6536\u76ca\u7387\u6807\u51c6\u5dee
         */
        private Float tqYieldStdDeviation;

        /**
         * \u672c\u5e74\u6536\u76ca\u7387\u6807\u51c6\u5dee
         */
        private Float tyYieldStdDeviation;

        /**
         * \u6240\u6709\u6536\u76ca\u7387\u6807\u51c6\u5dee
         */
        private Float allYieldStdDeviation;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u4e0b\u884c\u6807\u51c6\u5dee
         */
        private Float nomDownStdDeviation;

        /**
         * \u8fd1\u534a\u5e74\u4e0b\u884c\u6807\u51c6\u5dee
         */
        private Float nhyDownStdDeviation;

        /**
         * \u8fd1\u4e00\u5e74\u4e0b\u884c\u6807\u51c6\u5dee
         */
        private Float noyDownStdDeviation;

        /**
         * \u672c\u6708\u4e0b\u884c\u6807\u51c6\u5dee
         */
        private Float tmDownStdDeviation;

        /**
         * \u672c\u5b63\u5ea6\u4e0b\u884c\u6807\u51c6\u5dee
         */
        private Float tqDownStdDeviation;

        /**
         * \u672c\u5e74\u4e0b\u884c\u6807\u51c6\u5dee
         */
        private Float tyDownStdDeviation;

        /**
         * \u6240\u6709\u4e0b\u884c\u6807\u51c6\u5dee
         */
        private Float allDownStdDeviation;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u80dc\u7387
         */
        private Float nomWinRatio;

        /**
         * \u8fd1\u534a\u5e74\u80dc\u7387
         */
        private Float nhyWinRatio;

        /**
         * \u8fd1\u4e00\u5e74\u80dc\u7387
         */
        private Float noyWinRatio;

        /**
         * \u672c\u6708\u80dc\u7387
         */
        private Float tmWinRatio;

        /**
         * \u672c\u5b63\u5ea6\u80dc\u7387
         */
        private Float tqWinRatio;

        /**
         * \u672c\u5e74\u80dc\u7387
         */
        private Float tyWinRatio;

        /**
         * \u6240\u6709\u80dc\u7387
         */
        private Float allWinRatio;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u8d1d\u5854\u7cfb\u6570
         */
        private Float nomBeta;

        /**
         * \u8fd1\u534a\u5e74\u8d1d\u5854\u7cfb\u6570
         */
        private Float nhyBeta;

        /**
         * \u8fd1\u4e00\u5e74\u8d1d\u5854\u7cfb\u6570
         */
        private Float noyBeta;

        /**
         * \u672c\u6708\u8d1d\u5854\u7cfb\u6570
         */
        private Float tmBeta;

        /**
         * \u672c\u5b63\u5ea6\u8d1d\u5854\u7cfb\u6570
         */
        private Float tqBeta;

        /**
         * \u672c\u5e74\u8d1d\u5854\u7cfb\u6570
         */
        private Float tyBeta;

        /**
         * \u6240\u6709\u8d1d\u5854\u7cfb\u6570
         */
        private Float allBeta;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u963f\u5c14\u6cd5\u7cfb\u6570
         */
        private Float nomAlpha;

        /**
         * \u8fd1\u534a\u5e74\u963f\u5c14\u6cd5\u7cfb\u6570
         */
        private Float nhyAlpha;

        /**
         * \u8fd1\u4e00\u5e74\u963f\u5c14\u6cd5\u7cfb\u6570
         */
        private Float noyAlpha;

        /**
         * \u672c\u6708\u963f\u5c14\u6cd5\u7cfb\u6570
         */
        private Float tmAlpha;

        /**
         * \u672c\u5b63\u5ea6\u963f\u5c14\u6cd5\u7cfb\u6570
         */
        private Float tqAlpha;

        /**
         * \u672c\u5e74\u963f\u5c14\u6cd5\u7cfb\u6570
         */
        private Float tyAlpha;

        /**
         * \u6240\u6709\u963f\u5c14\u6cd5\u7cfb\u6570
         */
        private Float allAlpha;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u8a79\u68ee\u6307\u6570
         */
        private Float nomJansen;

        /**
         * \u8fd1\u534a\u5e74\u8a79\u68ee\u6307\u6570
         */
        private Float nhyJansen;

        /**
         * \u8fd1\u4e00\u5e74\u8a79\u68ee\u6307\u6570
         */
        private Float noyJansen;

        /**
         * \u672c\u6708\u8a79\u68ee\u6307\u6570
         */
        private Float tmJansen;

        /**
         * \u672c\u5b63\u5ea6\u8a79\u68ee\u6307\u6570
         */
        private Float tqJansen;

        /**
         * \u672c\u5e74\u8a79\u68ee\u6307\u6570
         */
        private Float tyJansen;

        /**
         * \u6240\u6709\u8a79\u68ee\u6307\u6570
         */
        private Float allJansen;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u5361\u739b\u6bd4\u7387
         */
        private Float nomKumarRatio;

        /**
         * \u8fd1\u534a\u5e74\u5361\u739b\u6bd4\u7387
         */
        private Float nhyKumarRatio;

        /**
         * \u8fd1\u4e00\u5e74\u5361\u739b\u6bd4\u7387
         */
        private Float noyKumarRatio;

        /**
         * \u672c\u6708\u5361\u739b\u6bd4\u7387
         */
        private Float tmKumarRatio;

        /**
         * \u672c\u5b63\u5ea6\u5361\u739b\u6bd4\u7387
         */
        private Float tqKumarRatio;

        /**
         * \u672c\u5e74\u5361\u739b\u6bd4\u7387
         */
        private Float tyKumarRatio;

        /**
         * \u6240\u6709\u5361\u739b\u6bd4\u7387
         */
        private Float allKumarRatio;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u590f\u666e\u6bd4\u7387
         */
        private Float nomSharpeRatio;

        /**
         * \u8fd1\u534a\u5e74\u590f\u666e\u6bd4\u7387
         */
        private Float nhySharpeRatio;

        /**
         * \u8fd1\u4e00\u5e74\u590f\u666e\u6bd4\u7387
         */
        private Float noySharpeRatio;

        /**
         * \u672c\u6708\u590f\u666e\u6bd4\u7387
         */
        private Float tmSharpeRatio;

        /**
         * \u672c\u5b63\u5ea6\u590f\u666e\u6bd4\u7387
         */
        private Float tqSharpeRatio;

        /**
         * \u672c\u5e74\u590f\u666e\u6bd4\u7387
         */
        private Float tySharpeRatio;

        /**
         * \u6240\u6709\u590f\u666e\u6bd4\u7387
         */
        private Float allSharpeRatio;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u7d22\u63d0\u82e5\u6bd4\u7387
         */
        private Float nomSortinoRatio;

        /**
         * \u8fd1\u534a\u5e74\u7d22\u63d0\u82e5\u6bd4\u7387
         */
        private Float nhySortinoRatio;

        /**
         * \u8fd1\u4e00\u5e74\u7d22\u63d0\u82e5\u6bd4\u7387
         */
        private Float noySortinoRatio;

        /**
         * \u672c\u6708\u7d22\u63d0\u82e5\u6bd4\u7387
         */
        private Float tmSortinoRatio;

        /**
         * \u672c\u5b63\u5ea6\u7d22\u63d0\u82e5\u6bd4\u7387
         */
        private Float tqSortinoRatio;

        /**
         * \u672c\u5e74\u7d22\u63d0\u82e5\u6bd4\u7387
         */
        private Float tySortinoRatio;

        /**
         * \u6240\u6709\u7d22\u63d0\u82e5\u6bd4\u7387
         */
        private Float allSortinoRatio;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u8d6b\u65af\u7279\u6307\u6570
         */
        private Float nomHurstIndex;

        /**
         * \u8fd1\u534a\u5e74\u8d6b\u65af\u7279\u6307\u6570
         */
        private Float nhyHurstIndex;

        /**
         * \u8fd1\u4e00\u5e74\u8d6b\u65af\u7279\u6307\u6570
         */
        private Float noyHurstIndex;

        /**
         * \u672c\u6708\u8d6b\u65af\u7279\u6307\u6570
         */
        private Float tmHurstIndex;

        /**
         * \u672c\u5b63\u5ea6\u8d6b\u65af\u7279\u6307\u6570
         */
        private Float tqHurstIndex;

        /**
         * \u672c\u5e74\u8d6b\u65af\u7279\u6307\u6570
         */
        private Float tyHurstIndex;

        /**
         * \u6240\u6709\u8d6b\u65af\u7279\u6307\u6570
         */
        private Float allHurstIndex;

        /**
         * \u8fd1\u4e00\u4e2a\u6708VaR\u6307\u6807(95%)
         */
        private Float nomVarIndex;

        /**
         * \u8fd1\u534a\u5e74VaR\u6307\u6807(95%)
         */
        private Float nhyVarIndex;

        /**
         * \u8fd1\u4e00\u5e74VaR\u6307\u6807(95%)
         */
        private Float noyVarIndex;

        /**
         * \u672c\u6708VaR\u6307\u6807(95%)
         */
        private Float tmVarIndex;

        /**
         * \u672c\u5b63\u5ea6VaR\u6307\u6807(95%)
         */
        private Float tqVarIndex;

        /**
         * \u672c\u5e74VaR\u6307\u6807(95%)
         */
        private Float tyVarIndex;

        /**
         * \u6240\u6709VaR\u6307\u6807(95%)
         */
        private Float allVarIndex;

        /**
         * \u8fd1\u4e00\u4e2a\u6708VaR\u6307\u6807(99%)
         */
        private Float nomVarIndex99;

        /**
         * \u8fd1\u534a\u5e74VaR\u6307\u6807(99%)
         */
        private Float nhyVarIndex99;

        /**
         * \u8fd1\u4e00\u5e74VaR\u6307\u6807(99%)
         */
        private Float noyVarIndex99;

        /**
         * \u672c\u6708VaR\u6307\u6807(99%)
         */
        private Float tmVarIndex99;

        /**
         * \u672c\u5b63\u5ea6VaR\u6307\u6807(99%)
         */
        private Float tqVarIndex99;

        /**
         * \u672c\u5e74VaR\u6307\u6807(99%)
         */
        private Float tyVarIndex99;

        /**
         * \u6240\u6709VaR\u6307\u6807(99%)
         */
        private Float allVarIndex99;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u4e0a\u884c\u6355\u83b7\u7387
         */
        private Float nomUpCaptureRate;

        /**
         * \u8fd1\u534a\u5e74\u4e0a\u884c\u6355\u83b7\u7387
         */
        private Float nhyUpCaptureRate;

        /**
         * \u8fd1\u4e00\u5e74\u4e0a\u884c\u6355\u83b7\u7387
         */
        private Float noyUpCaptureRate;

        /**
         * \u672c\u6708\u4e0a\u884c\u6355\u83b7\u7387
         */
        private Float tmUpCaptureRate;

        /**
         * \u672c\u5b63\u5ea6\u4e0a\u884c\u6355\u83b7\u7387
         */
        private Float tqUpCaptureRate;

        /**
         * \u672c\u5e74\u4e0a\u884c\u6355\u83b7\u7387
         */
        private Float tyUpCaptureRate;

        /**
         * \u6240\u6709\u4e0a\u884c\u6355\u83b7\u7387
         */
        private Float allUpCaptureRate;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u4e0b\u884c\u6355\u83b7\u7387
         */
        private Float nomDownCaptureRate;

        /**
         * \u8fd1\u534a\u5e74\u4e0b\u884c\u6355\u83b7\u7387
         */
        private Float nhyDownCaptureRate;

        /**
         * \u8fd1\u4e00\u5e74\u4e0b\u884c\u6355\u83b7\u7387
         */
        private Float noyDownCaptureRate;

        /**
         * \u672c\u6708\u4e0b\u884c\u6355\u83b7\u7387
         */
        private Float tmDownCaptureRate;

        /**
         * \u672c\u5b63\u5ea6\u4e0b\u884c\u6355\u83b7\u7387
         */
        private Float tqDownCaptureRate;

        /**
         * \u672c\u5e74\u4e0b\u884c\u6355\u83b7\u7387
         */
        private Float tyDownCaptureRate;

        /**
         * \u6240\u6709\u4e0b\u884c\u6355\u83b7\u7387
         */
        private Float allDownCaptureRate;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u4fe1\u606f\u6bd4\u7387
         */
        private Float nomInfoRatio;

        /**
         * \u8fd1\u534a\u5e74\u4fe1\u606f\u6bd4\u7387
         */
        private Float nhyInfoRatio;

        /**
         * \u8fd1\u4e00\u5e74\u4fe1\u606f\u6bd4\u7387
         */
        private Float noyInfoRatio;

        /**
         * \u672c\u6708\u4fe1\u606f\u6bd4\u7387
         */
        private Float tmInfoRatio;

        /**
         * \u672c\u5b63\u5ea6\u4fe1\u606f\u6bd4\u7387
         */
        private Float tqInfoRatio;

        /**
         * \u672c\u5e74\u4fe1\u606f\u6bd4\u7387
         */
        private Float tyInfoRatio;

        /**
         * \u6240\u6709\u4fe1\u606f\u6bd4\u7387
         */
        private Float allInfoRatio;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u7b56\u7565\u6ce2\u52a8\u7387
         */
        private Float nomAlgorithmVolatility;

        /**
         * \u8fd1\u534a\u5e74\u7b56\u7565\u6ce2\u52a8\u7387
         */
        private Float nhyAlgorithmVolatility;

        /**
         * \u8fd1\u4e00\u5e74\u7b56\u7565\u6ce2\u52a8\u7387
         */
        private Float noyAlgorithmVolatility;

        /**
         * \u672c\u6708\u7b56\u7565\u6ce2\u52a8\u7387
         */
        private Float tmAlgorithmVolatility;

        /**
         * \u672c\u5b63\u5ea6\u7b56\u7565\u6ce2\u52a8\u7387
         */
        private Float tqAlgorithmVolatility;

        /**
         * \u672c\u5e74\u7b56\u7565\u6ce2\u52a8\u7387
         */
        private Float tyAlgorithmVolatility;

        /**
         * \u6240\u6709\u7b56\u7565\u6ce2\u52a8\u7387
         */
        private Float allAlgorithmVolatility;

        /**
         * \u8fd1\u4e00\u4e2a\u6708M\u5e73\u65b9
         */
        private Float nomMSquare;

        /**
         * \u8fd1\u534a\u5e74M\u5e73\u65b9
         */
        private Float nhyMSquare;

        /**
         * \u8fd1\u4e00\u5e74M\u5e73\u65b9
         */
        private Float noyMSquare;

        /**
         * \u672c\u6708M\u5e73\u65b9
         */
        private Float tmMSquare;

        /**
         * \u672c\u5b63\u5ea6M\u5e73\u65b9
         */
        private Float tqMSquare;

        /**
         * \u672c\u5e74M\u5e73\u65b9
         */
        private Float tyMSquare;

        /**
         * \u6240\u6709M\u5e73\u65b9
         */
        private Float allMSquare;

        /**
         * \u8fd1\u4e00\u4e2a\u6708\u7279\u96f7\u8bfa\u6307\u6570(TR)
         */
        private Float nomTreynorIndex;

        /**
         * \u8fd1\u534a\u5e74\u7279\u96f7\u8bfa\u6307\u6570(TR)
         */
        private Float nhyTreynorIndex;

        /**
         * \u8fd1\u4e00\u5e74\u7279\u96f7\u8bfa\u6307\u6570(TR)
         */
        private Float noyTreynorIndex;

        /**
         * \u672c\u6708\u7279\u96f7\u8bfa\u6307\u6570(TR)
         */
        private Float tmTreynorIndex;

        /**
         * \u672c\u5b63\u5ea6\u7279\u96f7\u8bfa\u6307\u6570(TR)
         */
        private Float tqTreynorIndex;

        /**
         * \u672c\u5e74\u7279\u96f7\u8bfa\u6307\u6570(TR)
         */
        private Float tyTreynorIndex;

        /**
         * \u6240\u6709\u7279\u96f7\u8bfa\u6307\u6570(TR)
         */
        private Float allTreynorIndex;

        /**
         * \u57fa\u91d1\u4ea7\u54c1ID(\u7247\u952e\u503c)
         */
        private String id;

        /**
         * \u57fa\u91d1\u4ea7\u54c1\u540d\u79f0
         */
        private String name;

        /**
         * \u57fa\u91d1\u4ea7\u54c1\u77ed\u540d\u79f0
         */
        private String shortName;

        /**
         * \u57fa\u91d1\u4ee3\u7801
         */
        private String code;

        /**
         * \u5907\u6848\u53f7
         */
        private String recordNumber;

        /**
         * \u57fa\u91d1\u7c7b\u578b 0:\u79c1\u52df\u57fa\u91d1 1:\u516c\u52df\u57fa\u91d1 2:\u79c1\u6709\u57fa\u91d1
         */
        private Byte fundType;

        /**
         * \u57fa\u91d1\u54c1\u79cd 0:\u5f00\u653e\u5f0f\u57fa\u91d1 1:\u8d27\u5e01\u578b\u57fa\u91d1 2:\u7406\u8d22\u578b\u57fa\u91d1 3:\u5206\u7ea7\u578b\u57fa\u91d1 4:\u573a\u5185\u4ea4\u6613\u578b\u57fa\u91d1
         */
        private Byte fundBreed;

        /**
         * \u57fa\u91d1\u72b6\u6001 0:\u5b58\u7eed\u4e2d 1:\u5df2\u6e05\u76d8
         */
        private Byte fundStatus;

        /**
         * \u7533\u8d2d\u72b6\u6001\uff0c\u5f53\u57fa\u91d1\u7c7b\u578b=1:\u516c\u52df\u57fa\u91d1\u65f6\u8be5\u5b57\u6bb5\u624d\u5b58\u5728
         */
        private String buyStatus;

        /**
         * \u8d4e\u56de\u72b6\u6001\uff0c\u5f53\u57fa\u91d1\u7c7b\u578b=1:\u516c\u52df\u57fa\u91d1\u65f6\u8be5\u5b57\u6bb5\u624d\u5b58\u5728
         */
        private String redeemStatus;

        /**
         * \u5907\u6848\u65e5\u671f\uff0c\u683c\u5f0f\uff1ayyyy-MM-dd
         */
        private String recordDate;

        /**
         * \u6210\u7acb\u65e5\u671f\uff0c\u683c\u5f0f\uff1ayyyy-MM-dd
         */
        private String createDate;

        /**
         * \u7ec8\u6b62\u65e5\u671f\uff0c\u683c\u5f0f\uff1ayyyy-MM-dd
         */
        private String stopDate;

        /**
         * \u57fa\u91d1\u5907\u6848\u9636\u6bb5
         */
        private String fundFilingStage;

        /**
         * \u57fa\u91d1\u6295\u8d44\u7c7b\u578b
         */
        private String fundInvestmentType;

        /**
         * \u5e01\u79cd
         */
        private String currency;

        /**
         * \u7ba1\u7406\u7c7b\u578b
         */
        private String managerType;

        /**
         * \u6258\u7ba1\u4eba\u540d\u79f0
         */
        private String managerName;

        /**
         * \u6295\u8d44\u76ee\u6807
         */
        private String investmentTarget;

        /**
         * \u4e3b\u8981\u6295\u8d44\u9886\u57df\uff0c\u5373\u6295\u8d44\u8303\u56f4
         */
        private String majorInvestAreas;

        /**
         * \u57fa\u91d1\u4fe1\u606f\u6700\u540e\u4fee\u6539\u65e5\u671f
         */
        private String fundLastModifyDate;

        /**
         * \u57fa\u91d1\u534f\u4f1a\u7279\u522b\u63d0\u793a\uff08\u9488\u5bf9\u57fa\u91d1\uff09
         */
        private String specialNote;

        /**
         * \u6ce8\u518c\u5730\u5740
         */
        private String registeredAddress;

        /**
         * \u6295\u8d44\u7b56\u7565
         */
        private String investmentStrategy;

        /**
         * \u6295\u8d44\u5b50\u7b56\u7565
         */
        private String investmentSubStrategy;

        /**
         * \u57fa\u91d1\u7ecf\u7406ID\u6570\u7ec4
         */
        private List<String> fundManagerIds;

        /**
         * \u6295\u987e\u516c\u53f8ID
         */
        private String companyId;

        /**
         * \u5e8f\u53f7
         */
        private Long orderNum;

        /**
         * \u6210\u7acb\u89c4\u6a21
         */
        private String createScale;

        /**
         * \u6700\u65b0\u89c4\u6a21
         */
        private String latestScale;

        /**
         * \u4ea7\u54c1\u57fa\u51c6\u4ee3\u7801
         */
        private String benchmark;

        /**
         * \u51c0\u503c\u66f4\u65b0\u9891\u7387
         */
        private Byte netValueUpdateRate;

        /**
         * \u57fa\u91d1\u4ea7\u54c1\u5916\u90e8ID
         */
        private String fundOuterId;

        /**
         * \u6807\u7b7e
         */
        private String tags;

        /**
         * \u5907\u6ce8
         */
        private String remark;

        /**
         * \u7b56\u7565\u5bb9\u91cf
         */
        private String strategyCapacity;

        /**
         * \u521b\u5efa\u65f6\u95f4
         */
        private Long createTime;

        /**
         * \u521b\u5efa\u8005ID
         */
        private String creatorId;

        /**
         * \u6700\u540e\u4fee\u6539\u65f6\u95f4
         */
        private Long lastModifyTime;

        /**
         * \u6700\u540e\u4fee\u6539\u8005ID
         */
        private String lastModifierId;

        /**
         * \u57fa\u91d1\u516c\u53f8\u5916\u90e8ID
         */
        private String companyOuterId;

        /**
         * \u57fa\u91d1\u516c\u53f8\u540d\u79f0
         */
        private String companyName;

        /**
         * \u57fa\u91d1\u7ecf\u7406\u5916\u90e8ID\u6570\u7ec4
         */
        private List<String> managerOuterIds;

        /**
         * \u57fa\u91d1\u4ea7\u54c1ID\u5217\u8868
         */
        private List<String> fundIds;

        /**
         * \u6295\u987e\u516c\u53f8ID\u5217\u8868
         */
        private List<String> companyIds;

        /**
         * \u5f00\u59cb\u5e74\u5316\u6536\u76ca\u7387
         */
        private Float startAnnualizedReturn;

        /**
         * \u7ed3\u675f\u5e74\u5316\u6536\u76ca\u7387
         */
        private Float endAnnualizedReturn;

        /**
         * \u65f6\u95f4\u533a\u95f4
         */
        private String timeInterval;

        /**
         * \u57fa\u91d1\u7ecf\u7406\u59d3\u540d\u6570\u7ec4
         */
        private List<String> fundManagerNames;

        /**
         * \u57fa\u91d1\u72b6\u6001\u540d\u79f0 0:\u5b58\u7eed\u4e2d 1:\u5df2\u6e05\u76d8
         */
        private String fundStatusName;

        /**
         * \u57fa\u91d1\u7c7b\u578b\u540d\u79f0  0:\u79c1\u52df\u57fa\u91d1 1:\u516c\u52df\u57fa\u91d1 2:\u79c1\u6709\u57fa\u91d1'
         */
        private String fundTypeName;

        /**
         * \u662f\u5426\u5173\u6ce8\u57fa\u91d1 0:\u5426 1:\u662f
         */
        private Byte isConcern;

        /**
         * \u914d\u7f6e\u6743\u91cd(%)
         */
        private Float configWeight;

        /**
         * \u51c0\u503c\u65e5\u671f\u5b57\u7b26\u4e32 yyyy-MM-dd\u683c\u5f0f
         */
        private String netValueDateString;

        /**
         * \u57fa\u91d1\u7ecf\u7406ID
         */
        private String managerId;

        /**
         * \u7528\u6237\u6807\u7b7eID
         */
        private String tagId;

        public Integer getPageSize() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60859);
            __CLR4_1_101axz1axzlusqka27.R.inc(60860);return pageSize;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setPageSize(Integer pageSize) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60861);
            __CLR4_1_101axz1axzlusqka27.R.inc(60862);this.pageSize = pageSize;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Integer getFirstResult() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60863);
            __CLR4_1_101axz1axzlusqka27.R.inc(60864);return firstResult;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setFirstResult(Integer firstResult) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60865);
            __CLR4_1_101axz1axzlusqka27.R.inc(60866);this.firstResult = firstResult;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Integer getFetchSize() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60867);
            __CLR4_1_101axz1axzlusqka27.R.inc(60868);return fetchSize;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setFetchSize(Integer fetchSize) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60869);
            __CLR4_1_101axz1axzlusqka27.R.inc(60870);this.fetchSize = fetchSize;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getStartTime() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60871);
            __CLR4_1_101axz1axzlusqka27.R.inc(60872);return startTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setStartTime(String startTime) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60873);
            __CLR4_1_101axz1axzlusqka27.R.inc(60874);this.startTime = startTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getEndTime() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60875);
            __CLR4_1_101axz1axzlusqka27.R.inc(60876);return endTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setEndTime(String endTime) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60877);
            __CLR4_1_101axz1axzlusqka27.R.inc(60878);this.endTime = endTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Boolean getAdministrator() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60879);
            __CLR4_1_101axz1axzlusqka27.R.inc(60880);return isAdministrator;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAdministrator(Boolean administrator) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60881);
            __CLR4_1_101axz1axzlusqka27.R.inc(60882);isAdministrator = administrator;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Byte getSortMode() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60883);
            __CLR4_1_101axz1axzlusqka27.R.inc(60884);return sortMode;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setSortMode(Byte sortMode) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60885);
            __CLR4_1_101axz1axzlusqka27.R.inc(60886);this.sortMode = sortMode;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getSortFieldName() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60887);
            __CLR4_1_101axz1axzlusqka27.R.inc(60888);return sortFieldName;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setSortFieldName(String sortFieldName) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60889);
            __CLR4_1_101axz1axzlusqka27.R.inc(60890);this.sortFieldName = sortFieldName;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getSortFieldValue() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60891);
            __CLR4_1_101axz1axzlusqka27.R.inc(60892);return sortFieldValue;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setSortFieldValue(String sortFieldValue) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60893);
            __CLR4_1_101axz1axzlusqka27.R.inc(60894);this.sortFieldValue = sortFieldValue;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Long getCreateTimestamp() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60895);
            __CLR4_1_101axz1axzlusqka27.R.inc(60896);return createTimestamp;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setCreateTimestamp(Long createTimestamp) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60897);
            __CLR4_1_101axz1axzlusqka27.R.inc(60898);this.createTimestamp = createTimestamp;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Integer getLastPage() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60899);
            __CLR4_1_101axz1axzlusqka27.R.inc(60900);return lastPage;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setLastPage(Integer lastPage) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60901);
            __CLR4_1_101axz1axzlusqka27.R.inc(60902);this.lastPage = lastPage;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Byte getQueryType() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60903);
            __CLR4_1_101axz1axzlusqka27.R.inc(60904);return queryType;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setQueryType(Byte queryType) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60905);
            __CLR4_1_101axz1axzlusqka27.R.inc(60906);this.queryType = queryType;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getShard() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60907);
            __CLR4_1_101axz1axzlusqka27.R.inc(60908);return shard;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setShard(String shard) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60909);
            __CLR4_1_101axz1axzlusqka27.R.inc(60910);this.shard = shard;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Integer getNetValueDate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60911);
            __CLR4_1_101axz1axzlusqka27.R.inc(60912);return netValueDate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNetValueDate(Integer netValueDate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60913);
            __CLR4_1_101axz1axzlusqka27.R.inc(60914);this.netValueDate = netValueDate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getUnitNetValue() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60915);
            __CLR4_1_101axz1axzlusqka27.R.inc(60916);return unitNetValue;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setUnitNetValue(Float unitNetValue) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60917);
            __CLR4_1_101axz1axzlusqka27.R.inc(60918);this.unitNetValue = unitNetValue;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTotalNetValue() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60919);
            __CLR4_1_101axz1axzlusqka27.R.inc(60920);return totalNetValue;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTotalNetValue(Float totalNetValue) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60921);
            __CLR4_1_101axz1axzlusqka27.R.inc(60922);this.totalNetValue = totalNetValue;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomTotalYield() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60923);
            __CLR4_1_101axz1axzlusqka27.R.inc(60924);return nomTotalYield;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomTotalYield(Float nomTotalYield) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60925);
            __CLR4_1_101axz1axzlusqka27.R.inc(60926);this.nomTotalYield = nomTotalYield;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhyTotalYield() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60927);
            __CLR4_1_101axz1axzlusqka27.R.inc(60928);return nhyTotalYield;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyTotalYield(Float nhyTotalYield) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60929);
            __CLR4_1_101axz1axzlusqka27.R.inc(60930);this.nhyTotalYield = nhyTotalYield;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoyTotalYield() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60931);
            __CLR4_1_101axz1axzlusqka27.R.inc(60932);return noyTotalYield;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyTotalYield(Float noyTotalYield) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60933);
            __CLR4_1_101axz1axzlusqka27.R.inc(60934);this.noyTotalYield = noyTotalYield;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmTotalYield() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60935);
            __CLR4_1_101axz1axzlusqka27.R.inc(60936);return tmTotalYield;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmTotalYield(Float tmTotalYield) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60937);
            __CLR4_1_101axz1axzlusqka27.R.inc(60938);this.tmTotalYield = tmTotalYield;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqTotalYield() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60939);
            __CLR4_1_101axz1axzlusqka27.R.inc(60940);return tqTotalYield;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqTotalYield(Float tqTotalYield) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60941);
            __CLR4_1_101axz1axzlusqka27.R.inc(60942);this.tqTotalYield = tqTotalYield;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTyTotalYield() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60943);
            __CLR4_1_101axz1axzlusqka27.R.inc(60944);return tyTotalYield;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyTotalYield(Float tyTotalYield) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60945);
            __CLR4_1_101axz1axzlusqka27.R.inc(60946);this.tyTotalYield = tyTotalYield;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllTotalYield() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60947);
            __CLR4_1_101axz1axzlusqka27.R.inc(60948);return allTotalYield;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllTotalYield(Float allTotalYield) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60949);
            __CLR4_1_101axz1axzlusqka27.R.inc(60950);this.allTotalYield = allTotalYield;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomAnnualizedReturn() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60951);
            __CLR4_1_101axz1axzlusqka27.R.inc(60952);return nomAnnualizedReturn;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomAnnualizedReturn(Float nomAnnualizedReturn) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60953);
            __CLR4_1_101axz1axzlusqka27.R.inc(60954);this.nomAnnualizedReturn = nomAnnualizedReturn;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhyAnnualizedReturn() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60955);
            __CLR4_1_101axz1axzlusqka27.R.inc(60956);return nhyAnnualizedReturn;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyAnnualizedReturn(Float nhyAnnualizedReturn) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60957);
            __CLR4_1_101axz1axzlusqka27.R.inc(60958);this.nhyAnnualizedReturn = nhyAnnualizedReturn;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoyAnnualizedReturn() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60959);
            __CLR4_1_101axz1axzlusqka27.R.inc(60960);return noyAnnualizedReturn;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyAnnualizedReturn(Float noyAnnualizedReturn) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60961);
            __CLR4_1_101axz1axzlusqka27.R.inc(60962);this.noyAnnualizedReturn = noyAnnualizedReturn;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmAnnualizedReturn() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60963);
            __CLR4_1_101axz1axzlusqka27.R.inc(60964);return tmAnnualizedReturn;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmAnnualizedReturn(Float tmAnnualizedReturn) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60965);
            __CLR4_1_101axz1axzlusqka27.R.inc(60966);this.tmAnnualizedReturn = tmAnnualizedReturn;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqAnnualizedReturn() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60967);
            __CLR4_1_101axz1axzlusqka27.R.inc(60968);return tqAnnualizedReturn;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqAnnualizedReturn(Float tqAnnualizedReturn) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60969);
            __CLR4_1_101axz1axzlusqka27.R.inc(60970);this.tqAnnualizedReturn = tqAnnualizedReturn;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTyAnnualizedReturn() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60971);
            __CLR4_1_101axz1axzlusqka27.R.inc(60972);return tyAnnualizedReturn;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyAnnualizedReturn(Float tyAnnualizedReturn) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60973);
            __CLR4_1_101axz1axzlusqka27.R.inc(60974);this.tyAnnualizedReturn = tyAnnualizedReturn;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllAnnualizedReturn() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60975);
            __CLR4_1_101axz1axzlusqka27.R.inc(60976);return allAnnualizedReturn;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllAnnualizedReturn(Float allAnnualizedReturn) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60977);
            __CLR4_1_101axz1axzlusqka27.R.inc(60978);this.allAnnualizedReturn = allAnnualizedReturn;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomMaxProfitMargin() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60979);
            __CLR4_1_101axz1axzlusqka27.R.inc(60980);return nomMaxProfitMargin;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomMaxProfitMargin(Float nomMaxProfitMargin) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60981);
            __CLR4_1_101axz1axzlusqka27.R.inc(60982);this.nomMaxProfitMargin = nomMaxProfitMargin;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhyMaxProfitMargin() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60983);
            __CLR4_1_101axz1axzlusqka27.R.inc(60984);return nhyMaxProfitMargin;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyMaxProfitMargin(Float nhyMaxProfitMargin) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60985);
            __CLR4_1_101axz1axzlusqka27.R.inc(60986);this.nhyMaxProfitMargin = nhyMaxProfitMargin;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoyMaxProfitMargin() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60987);
            __CLR4_1_101axz1axzlusqka27.R.inc(60988);return noyMaxProfitMargin;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyMaxProfitMargin(Float noyMaxProfitMargin) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60989);
            __CLR4_1_101axz1axzlusqka27.R.inc(60990);this.noyMaxProfitMargin = noyMaxProfitMargin;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmMaxProfitMargin() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60991);
            __CLR4_1_101axz1axzlusqka27.R.inc(60992);return tmMaxProfitMargin;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmMaxProfitMargin(Float tmMaxProfitMargin) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60993);
            __CLR4_1_101axz1axzlusqka27.R.inc(60994);this.tmMaxProfitMargin = tmMaxProfitMargin;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqMaxProfitMargin() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60995);
            __CLR4_1_101axz1axzlusqka27.R.inc(60996);return tqMaxProfitMargin;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqMaxProfitMargin(Float tqMaxProfitMargin) {try{__CLR4_1_101axz1axzlusqka27.R.inc(60997);
            __CLR4_1_101axz1axzlusqka27.R.inc(60998);this.tqMaxProfitMargin = tqMaxProfitMargin;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTyMaxProfitMargin() {try{__CLR4_1_101axz1axzlusqka27.R.inc(60999);
            __CLR4_1_101axz1axzlusqka27.R.inc(61000);return tyMaxProfitMargin;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyMaxProfitMargin(Float tyMaxProfitMargin) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61001);
            __CLR4_1_101axz1axzlusqka27.R.inc(61002);this.tyMaxProfitMargin = tyMaxProfitMargin;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllMaxProfitMargin() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61003);
            __CLR4_1_101axz1axzlusqka27.R.inc(61004);return allMaxProfitMargin;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllMaxProfitMargin(Float allMaxProfitMargin) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61005);
            __CLR4_1_101axz1axzlusqka27.R.inc(61006);this.allMaxProfitMargin = allMaxProfitMargin;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomMaxSingleProfit() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61007);
            __CLR4_1_101axz1axzlusqka27.R.inc(61008);return nomMaxSingleProfit;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomMaxSingleProfit(Float nomMaxSingleProfit) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61009);
            __CLR4_1_101axz1axzlusqka27.R.inc(61010);this.nomMaxSingleProfit = nomMaxSingleProfit;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhyMaxSingleProfit() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61011);
            __CLR4_1_101axz1axzlusqka27.R.inc(61012);return nhyMaxSingleProfit;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyMaxSingleProfit(Float nhyMaxSingleProfit) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61013);
            __CLR4_1_101axz1axzlusqka27.R.inc(61014);this.nhyMaxSingleProfit = nhyMaxSingleProfit;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoyMaxSingleProfit() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61015);
            __CLR4_1_101axz1axzlusqka27.R.inc(61016);return noyMaxSingleProfit;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyMaxSingleProfit(Float noyMaxSingleProfit) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61017);
            __CLR4_1_101axz1axzlusqka27.R.inc(61018);this.noyMaxSingleProfit = noyMaxSingleProfit;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmMaxSingleProfit() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61019);
            __CLR4_1_101axz1axzlusqka27.R.inc(61020);return tmMaxSingleProfit;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmMaxSingleProfit(Float tmMaxSingleProfit) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61021);
            __CLR4_1_101axz1axzlusqka27.R.inc(61022);this.tmMaxSingleProfit = tmMaxSingleProfit;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqMaxSingleProfit() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61023);
            __CLR4_1_101axz1axzlusqka27.R.inc(61024);return tqMaxSingleProfit;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqMaxSingleProfit(Float tqMaxSingleProfit) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61025);
            __CLR4_1_101axz1axzlusqka27.R.inc(61026);this.tqMaxSingleProfit = tqMaxSingleProfit;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTyMaxSingleProfit() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61027);
            __CLR4_1_101axz1axzlusqka27.R.inc(61028);return tyMaxSingleProfit;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyMaxSingleProfit(Float tyMaxSingleProfit) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61029);
            __CLR4_1_101axz1axzlusqka27.R.inc(61030);this.tyMaxSingleProfit = tyMaxSingleProfit;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllMaxSingleProfit() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61031);
            __CLR4_1_101axz1axzlusqka27.R.inc(61032);return allMaxSingleProfit;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllMaxSingleProfit(Float allMaxSingleProfit) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61033);
            __CLR4_1_101axz1axzlusqka27.R.inc(61034);this.allMaxSingleProfit = allMaxSingleProfit;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Integer getNomMaxConProfitTime() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61035);
            __CLR4_1_101axz1axzlusqka27.R.inc(61036);return nomMaxConProfitTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomMaxConProfitTime(Integer nomMaxConProfitTime) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61037);
            __CLR4_1_101axz1axzlusqka27.R.inc(61038);this.nomMaxConProfitTime = nomMaxConProfitTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Integer getNhyMaxConProfitTime() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61039);
            __CLR4_1_101axz1axzlusqka27.R.inc(61040);return nhyMaxConProfitTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyMaxConProfitTime(Integer nhyMaxConProfitTime) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61041);
            __CLR4_1_101axz1axzlusqka27.R.inc(61042);this.nhyMaxConProfitTime = nhyMaxConProfitTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Integer getNoyMaxConProfitTime() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61043);
            __CLR4_1_101axz1axzlusqka27.R.inc(61044);return noyMaxConProfitTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyMaxConProfitTime(Integer noyMaxConProfitTime) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61045);
            __CLR4_1_101axz1axzlusqka27.R.inc(61046);this.noyMaxConProfitTime = noyMaxConProfitTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Integer getTmMaxConProfitTime() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61047);
            __CLR4_1_101axz1axzlusqka27.R.inc(61048);return tmMaxConProfitTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmMaxConProfitTime(Integer tmMaxConProfitTime) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61049);
            __CLR4_1_101axz1axzlusqka27.R.inc(61050);this.tmMaxConProfitTime = tmMaxConProfitTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Integer getTqMaxConProfitTime() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61051);
            __CLR4_1_101axz1axzlusqka27.R.inc(61052);return tqMaxConProfitTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqMaxConProfitTime(Integer tqMaxConProfitTime) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61053);
            __CLR4_1_101axz1axzlusqka27.R.inc(61054);this.tqMaxConProfitTime = tqMaxConProfitTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Integer getTyMaxConProfitTime() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61055);
            __CLR4_1_101axz1axzlusqka27.R.inc(61056);return tyMaxConProfitTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyMaxConProfitTime(Integer tyMaxConProfitTime) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61057);
            __CLR4_1_101axz1axzlusqka27.R.inc(61058);this.tyMaxConProfitTime = tyMaxConProfitTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Integer getAllMaxConProfitTime() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61059);
            __CLR4_1_101axz1axzlusqka27.R.inc(61060);return allMaxConProfitTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllMaxConProfitTime(Integer allMaxConProfitTime) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61061);
            __CLR4_1_101axz1axzlusqka27.R.inc(61062);this.allMaxConProfitTime = allMaxConProfitTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Integer getAllMaxConProfitTimeDate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61063);
            __CLR4_1_101axz1axzlusqka27.R.inc(61064);return allMaxConProfitTimeDate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllMaxConProfitTimeDate(Integer allMaxConProfitTimeDate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61065);
            __CLR4_1_101axz1axzlusqka27.R.inc(61066);this.allMaxConProfitTimeDate = allMaxConProfitTimeDate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomMaxDrawdown() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61067);
            __CLR4_1_101axz1axzlusqka27.R.inc(61068);return nomMaxDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomMaxDrawdown(Float nomMaxDrawdown) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61069);
            __CLR4_1_101axz1axzlusqka27.R.inc(61070);this.nomMaxDrawdown = nomMaxDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhyMaxDrawdown() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61071);
            __CLR4_1_101axz1axzlusqka27.R.inc(61072);return nhyMaxDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyMaxDrawdown(Float nhyMaxDrawdown) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61073);
            __CLR4_1_101axz1axzlusqka27.R.inc(61074);this.nhyMaxDrawdown = nhyMaxDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoyMaxDrawdown() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61075);
            __CLR4_1_101axz1axzlusqka27.R.inc(61076);return noyMaxDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyMaxDrawdown(Float noyMaxDrawdown) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61077);
            __CLR4_1_101axz1axzlusqka27.R.inc(61078);this.noyMaxDrawdown = noyMaxDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmMaxDrawdown() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61079);
            __CLR4_1_101axz1axzlusqka27.R.inc(61080);return tmMaxDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmMaxDrawdown(Float tmMaxDrawdown) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61081);
            __CLR4_1_101axz1axzlusqka27.R.inc(61082);this.tmMaxDrawdown = tmMaxDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqMaxDrawdown() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61083);
            __CLR4_1_101axz1axzlusqka27.R.inc(61084);return tqMaxDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqMaxDrawdown(Float tqMaxDrawdown) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61085);
            __CLR4_1_101axz1axzlusqka27.R.inc(61086);this.tqMaxDrawdown = tqMaxDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTyMaxDrawdown() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61087);
            __CLR4_1_101axz1axzlusqka27.R.inc(61088);return tyMaxDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyMaxDrawdown(Float tyMaxDrawdown) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61089);
            __CLR4_1_101axz1axzlusqka27.R.inc(61090);this.tyMaxDrawdown = tyMaxDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllMaxDrawdown() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61091);
            __CLR4_1_101axz1axzlusqka27.R.inc(61092);return allMaxDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllMaxDrawdown(Float allMaxDrawdown) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61093);
            __CLR4_1_101axz1axzlusqka27.R.inc(61094);this.allMaxDrawdown = allMaxDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Integer getAllMaxDrawdownDate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61095);
            __CLR4_1_101axz1axzlusqka27.R.inc(61096);return allMaxDrawdownDate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllMaxDrawdownDate(Integer allMaxDrawdownDate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61097);
            __CLR4_1_101axz1axzlusqka27.R.inc(61098);this.allMaxDrawdownDate = allMaxDrawdownDate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomMaxSingleDrawdown() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61099);
            __CLR4_1_101axz1axzlusqka27.R.inc(61100);return nomMaxSingleDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomMaxSingleDrawdown(Float nomMaxSingleDrawdown) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61101);
            __CLR4_1_101axz1axzlusqka27.R.inc(61102);this.nomMaxSingleDrawdown = nomMaxSingleDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhyMaxSingleDrawdown() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61103);
            __CLR4_1_101axz1axzlusqka27.R.inc(61104);return nhyMaxSingleDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyMaxSingleDrawdown(Float nhyMaxSingleDrawdown) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61105);
            __CLR4_1_101axz1axzlusqka27.R.inc(61106);this.nhyMaxSingleDrawdown = nhyMaxSingleDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoyMaxSingleDrawdown() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61107);
            __CLR4_1_101axz1axzlusqka27.R.inc(61108);return noyMaxSingleDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyMaxSingleDrawdown(Float noyMaxSingleDrawdown) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61109);
            __CLR4_1_101axz1axzlusqka27.R.inc(61110);this.noyMaxSingleDrawdown = noyMaxSingleDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmMaxSingleDrawdown() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61111);
            __CLR4_1_101axz1axzlusqka27.R.inc(61112);return tmMaxSingleDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmMaxSingleDrawdown(Float tmMaxSingleDrawdown) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61113);
            __CLR4_1_101axz1axzlusqka27.R.inc(61114);this.tmMaxSingleDrawdown = tmMaxSingleDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqMaxSingleDrawdown() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61115);
            __CLR4_1_101axz1axzlusqka27.R.inc(61116);return tqMaxSingleDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqMaxSingleDrawdown(Float tqMaxSingleDrawdown) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61117);
            __CLR4_1_101axz1axzlusqka27.R.inc(61118);this.tqMaxSingleDrawdown = tqMaxSingleDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTyMaxSingleDrawdown() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61119);
            __CLR4_1_101axz1axzlusqka27.R.inc(61120);return tyMaxSingleDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyMaxSingleDrawdown(Float tyMaxSingleDrawdown) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61121);
            __CLR4_1_101axz1axzlusqka27.R.inc(61122);this.tyMaxSingleDrawdown = tyMaxSingleDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllMaxSingleDrawdown() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61123);
            __CLR4_1_101axz1axzlusqka27.R.inc(61124);return allMaxSingleDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllMaxSingleDrawdown(Float allMaxSingleDrawdown) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61125);
            __CLR4_1_101axz1axzlusqka27.R.inc(61126);this.allMaxSingleDrawdown = allMaxSingleDrawdown;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Integer getAllMaxSingleDrawdownDate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61127);
            __CLR4_1_101axz1axzlusqka27.R.inc(61128);return allMaxSingleDrawdownDate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllMaxSingleDrawdownDate(Integer allMaxSingleDrawdownDate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61129);
            __CLR4_1_101axz1axzlusqka27.R.inc(61130);this.allMaxSingleDrawdownDate = allMaxSingleDrawdownDate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Integer getNomMaxConDrawdownTime() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61131);
            __CLR4_1_101axz1axzlusqka27.R.inc(61132);return nomMaxConDrawdownTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomMaxConDrawdownTime(Integer nomMaxConDrawdownTime) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61133);
            __CLR4_1_101axz1axzlusqka27.R.inc(61134);this.nomMaxConDrawdownTime = nomMaxConDrawdownTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Integer getNhyMaxConDrawdownTime() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61135);
            __CLR4_1_101axz1axzlusqka27.R.inc(61136);return nhyMaxConDrawdownTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyMaxConDrawdownTime(Integer nhyMaxConDrawdownTime) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61137);
            __CLR4_1_101axz1axzlusqka27.R.inc(61138);this.nhyMaxConDrawdownTime = nhyMaxConDrawdownTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Integer getNoyMaxConDrawdownTime() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61139);
            __CLR4_1_101axz1axzlusqka27.R.inc(61140);return noyMaxConDrawdownTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyMaxConDrawdownTime(Integer noyMaxConDrawdownTime) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61141);
            __CLR4_1_101axz1axzlusqka27.R.inc(61142);this.noyMaxConDrawdownTime = noyMaxConDrawdownTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Integer getTmMaxConDrawdownTime() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61143);
            __CLR4_1_101axz1axzlusqka27.R.inc(61144);return tmMaxConDrawdownTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmMaxConDrawdownTime(Integer tmMaxConDrawdownTime) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61145);
            __CLR4_1_101axz1axzlusqka27.R.inc(61146);this.tmMaxConDrawdownTime = tmMaxConDrawdownTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Integer getTqMaxConDrawdownTime() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61147);
            __CLR4_1_101axz1axzlusqka27.R.inc(61148);return tqMaxConDrawdownTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqMaxConDrawdownTime(Integer tqMaxConDrawdownTime) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61149);
            __CLR4_1_101axz1axzlusqka27.R.inc(61150);this.tqMaxConDrawdownTime = tqMaxConDrawdownTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Integer getTyMaxConDrawdownTime() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61151);
            __CLR4_1_101axz1axzlusqka27.R.inc(61152);return tyMaxConDrawdownTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyMaxConDrawdownTime(Integer tyMaxConDrawdownTime) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61153);
            __CLR4_1_101axz1axzlusqka27.R.inc(61154);this.tyMaxConDrawdownTime = tyMaxConDrawdownTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Integer getAllMaxConDrawdownTime() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61155);
            __CLR4_1_101axz1axzlusqka27.R.inc(61156);return allMaxConDrawdownTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllMaxConDrawdownTime(Integer allMaxConDrawdownTime) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61157);
            __CLR4_1_101axz1axzlusqka27.R.inc(61158);this.allMaxConDrawdownTime = allMaxConDrawdownTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomYieldStdDeviation() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61159);
            __CLR4_1_101axz1axzlusqka27.R.inc(61160);return nomYieldStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomYieldStdDeviation(Float nomYieldStdDeviation) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61161);
            __CLR4_1_101axz1axzlusqka27.R.inc(61162);this.nomYieldStdDeviation = nomYieldStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhyYieldStdDeviation() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61163);
            __CLR4_1_101axz1axzlusqka27.R.inc(61164);return nhyYieldStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyYieldStdDeviation(Float nhyYieldStdDeviation) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61165);
            __CLR4_1_101axz1axzlusqka27.R.inc(61166);this.nhyYieldStdDeviation = nhyYieldStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoyYieldStdDeviation() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61167);
            __CLR4_1_101axz1axzlusqka27.R.inc(61168);return noyYieldStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyYieldStdDeviation(Float noyYieldStdDeviation) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61169);
            __CLR4_1_101axz1axzlusqka27.R.inc(61170);this.noyYieldStdDeviation = noyYieldStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmYieldStdDeviation() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61171);
            __CLR4_1_101axz1axzlusqka27.R.inc(61172);return tmYieldStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmYieldStdDeviation(Float tmYieldStdDeviation) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61173);
            __CLR4_1_101axz1axzlusqka27.R.inc(61174);this.tmYieldStdDeviation = tmYieldStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqYieldStdDeviation() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61175);
            __CLR4_1_101axz1axzlusqka27.R.inc(61176);return tqYieldStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqYieldStdDeviation(Float tqYieldStdDeviation) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61177);
            __CLR4_1_101axz1axzlusqka27.R.inc(61178);this.tqYieldStdDeviation = tqYieldStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTyYieldStdDeviation() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61179);
            __CLR4_1_101axz1axzlusqka27.R.inc(61180);return tyYieldStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyYieldStdDeviation(Float tyYieldStdDeviation) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61181);
            __CLR4_1_101axz1axzlusqka27.R.inc(61182);this.tyYieldStdDeviation = tyYieldStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllYieldStdDeviation() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61183);
            __CLR4_1_101axz1axzlusqka27.R.inc(61184);return allYieldStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllYieldStdDeviation(Float allYieldStdDeviation) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61185);
            __CLR4_1_101axz1axzlusqka27.R.inc(61186);this.allYieldStdDeviation = allYieldStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomDownStdDeviation() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61187);
            __CLR4_1_101axz1axzlusqka27.R.inc(61188);return nomDownStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomDownStdDeviation(Float nomDownStdDeviation) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61189);
            __CLR4_1_101axz1axzlusqka27.R.inc(61190);this.nomDownStdDeviation = nomDownStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhyDownStdDeviation() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61191);
            __CLR4_1_101axz1axzlusqka27.R.inc(61192);return nhyDownStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyDownStdDeviation(Float nhyDownStdDeviation) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61193);
            __CLR4_1_101axz1axzlusqka27.R.inc(61194);this.nhyDownStdDeviation = nhyDownStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoyDownStdDeviation() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61195);
            __CLR4_1_101axz1axzlusqka27.R.inc(61196);return noyDownStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyDownStdDeviation(Float noyDownStdDeviation) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61197);
            __CLR4_1_101axz1axzlusqka27.R.inc(61198);this.noyDownStdDeviation = noyDownStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmDownStdDeviation() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61199);
            __CLR4_1_101axz1axzlusqka27.R.inc(61200);return tmDownStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmDownStdDeviation(Float tmDownStdDeviation) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61201);
            __CLR4_1_101axz1axzlusqka27.R.inc(61202);this.tmDownStdDeviation = tmDownStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqDownStdDeviation() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61203);
            __CLR4_1_101axz1axzlusqka27.R.inc(61204);return tqDownStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqDownStdDeviation(Float tqDownStdDeviation) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61205);
            __CLR4_1_101axz1axzlusqka27.R.inc(61206);this.tqDownStdDeviation = tqDownStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTyDownStdDeviation() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61207);
            __CLR4_1_101axz1axzlusqka27.R.inc(61208);return tyDownStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyDownStdDeviation(Float tyDownStdDeviation) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61209);
            __CLR4_1_101axz1axzlusqka27.R.inc(61210);this.tyDownStdDeviation = tyDownStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllDownStdDeviation() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61211);
            __CLR4_1_101axz1axzlusqka27.R.inc(61212);return allDownStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllDownStdDeviation(Float allDownStdDeviation) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61213);
            __CLR4_1_101axz1axzlusqka27.R.inc(61214);this.allDownStdDeviation = allDownStdDeviation;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomWinRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61215);
            __CLR4_1_101axz1axzlusqka27.R.inc(61216);return nomWinRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomWinRatio(Float nomWinRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61217);
            __CLR4_1_101axz1axzlusqka27.R.inc(61218);this.nomWinRatio = nomWinRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhyWinRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61219);
            __CLR4_1_101axz1axzlusqka27.R.inc(61220);return nhyWinRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyWinRatio(Float nhyWinRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61221);
            __CLR4_1_101axz1axzlusqka27.R.inc(61222);this.nhyWinRatio = nhyWinRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoyWinRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61223);
            __CLR4_1_101axz1axzlusqka27.R.inc(61224);return noyWinRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyWinRatio(Float noyWinRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61225);
            __CLR4_1_101axz1axzlusqka27.R.inc(61226);this.noyWinRatio = noyWinRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmWinRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61227);
            __CLR4_1_101axz1axzlusqka27.R.inc(61228);return tmWinRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmWinRatio(Float tmWinRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61229);
            __CLR4_1_101axz1axzlusqka27.R.inc(61230);this.tmWinRatio = tmWinRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqWinRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61231);
            __CLR4_1_101axz1axzlusqka27.R.inc(61232);return tqWinRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqWinRatio(Float tqWinRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61233);
            __CLR4_1_101axz1axzlusqka27.R.inc(61234);this.tqWinRatio = tqWinRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTyWinRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61235);
            __CLR4_1_101axz1axzlusqka27.R.inc(61236);return tyWinRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyWinRatio(Float tyWinRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61237);
            __CLR4_1_101axz1axzlusqka27.R.inc(61238);this.tyWinRatio = tyWinRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllWinRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61239);
            __CLR4_1_101axz1axzlusqka27.R.inc(61240);return allWinRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllWinRatio(Float allWinRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61241);
            __CLR4_1_101axz1axzlusqka27.R.inc(61242);this.allWinRatio = allWinRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomBeta() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61243);
            __CLR4_1_101axz1axzlusqka27.R.inc(61244);return nomBeta;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomBeta(Float nomBeta) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61245);
            __CLR4_1_101axz1axzlusqka27.R.inc(61246);this.nomBeta = nomBeta;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhyBeta() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61247);
            __CLR4_1_101axz1axzlusqka27.R.inc(61248);return nhyBeta;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyBeta(Float nhyBeta) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61249);
            __CLR4_1_101axz1axzlusqka27.R.inc(61250);this.nhyBeta = nhyBeta;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoyBeta() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61251);
            __CLR4_1_101axz1axzlusqka27.R.inc(61252);return noyBeta;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyBeta(Float noyBeta) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61253);
            __CLR4_1_101axz1axzlusqka27.R.inc(61254);this.noyBeta = noyBeta;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmBeta() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61255);
            __CLR4_1_101axz1axzlusqka27.R.inc(61256);return tmBeta;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmBeta(Float tmBeta) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61257);
            __CLR4_1_101axz1axzlusqka27.R.inc(61258);this.tmBeta = tmBeta;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqBeta() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61259);
            __CLR4_1_101axz1axzlusqka27.R.inc(61260);return tqBeta;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqBeta(Float tqBeta) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61261);
            __CLR4_1_101axz1axzlusqka27.R.inc(61262);this.tqBeta = tqBeta;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTyBeta() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61263);
            __CLR4_1_101axz1axzlusqka27.R.inc(61264);return tyBeta;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyBeta(Float tyBeta) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61265);
            __CLR4_1_101axz1axzlusqka27.R.inc(61266);this.tyBeta = tyBeta;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllBeta() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61267);
            __CLR4_1_101axz1axzlusqka27.R.inc(61268);return allBeta;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllBeta(Float allBeta) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61269);
            __CLR4_1_101axz1axzlusqka27.R.inc(61270);this.allBeta = allBeta;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomAlpha() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61271);
            __CLR4_1_101axz1axzlusqka27.R.inc(61272);return nomAlpha;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomAlpha(Float nomAlpha) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61273);
            __CLR4_1_101axz1axzlusqka27.R.inc(61274);this.nomAlpha = nomAlpha;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhyAlpha() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61275);
            __CLR4_1_101axz1axzlusqka27.R.inc(61276);return nhyAlpha;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyAlpha(Float nhyAlpha) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61277);
            __CLR4_1_101axz1axzlusqka27.R.inc(61278);this.nhyAlpha = nhyAlpha;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoyAlpha() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61279);
            __CLR4_1_101axz1axzlusqka27.R.inc(61280);return noyAlpha;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyAlpha(Float noyAlpha) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61281);
            __CLR4_1_101axz1axzlusqka27.R.inc(61282);this.noyAlpha = noyAlpha;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmAlpha() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61283);
            __CLR4_1_101axz1axzlusqka27.R.inc(61284);return tmAlpha;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmAlpha(Float tmAlpha) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61285);
            __CLR4_1_101axz1axzlusqka27.R.inc(61286);this.tmAlpha = tmAlpha;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqAlpha() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61287);
            __CLR4_1_101axz1axzlusqka27.R.inc(61288);return tqAlpha;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqAlpha(Float tqAlpha) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61289);
            __CLR4_1_101axz1axzlusqka27.R.inc(61290);this.tqAlpha = tqAlpha;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTyAlpha() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61291);
            __CLR4_1_101axz1axzlusqka27.R.inc(61292);return tyAlpha;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyAlpha(Float tyAlpha) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61293);
            __CLR4_1_101axz1axzlusqka27.R.inc(61294);this.tyAlpha = tyAlpha;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllAlpha() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61295);
            __CLR4_1_101axz1axzlusqka27.R.inc(61296);return allAlpha;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllAlpha(Float allAlpha) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61297);
            __CLR4_1_101axz1axzlusqka27.R.inc(61298);this.allAlpha = allAlpha;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomJansen() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61299);
            __CLR4_1_101axz1axzlusqka27.R.inc(61300);return nomJansen;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomJansen(Float nomJansen) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61301);
            __CLR4_1_101axz1axzlusqka27.R.inc(61302);this.nomJansen = nomJansen;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhyJansen() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61303);
            __CLR4_1_101axz1axzlusqka27.R.inc(61304);return nhyJansen;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyJansen(Float nhyJansen) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61305);
            __CLR4_1_101axz1axzlusqka27.R.inc(61306);this.nhyJansen = nhyJansen;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoyJansen() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61307);
            __CLR4_1_101axz1axzlusqka27.R.inc(61308);return noyJansen;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyJansen(Float noyJansen) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61309);
            __CLR4_1_101axz1axzlusqka27.R.inc(61310);this.noyJansen = noyJansen;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmJansen() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61311);
            __CLR4_1_101axz1axzlusqka27.R.inc(61312);return tmJansen;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmJansen(Float tmJansen) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61313);
            __CLR4_1_101axz1axzlusqka27.R.inc(61314);this.tmJansen = tmJansen;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqJansen() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61315);
            __CLR4_1_101axz1axzlusqka27.R.inc(61316);return tqJansen;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqJansen(Float tqJansen) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61317);
            __CLR4_1_101axz1axzlusqka27.R.inc(61318);this.tqJansen = tqJansen;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTyJansen() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61319);
            __CLR4_1_101axz1axzlusqka27.R.inc(61320);return tyJansen;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyJansen(Float tyJansen) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61321);
            __CLR4_1_101axz1axzlusqka27.R.inc(61322);this.tyJansen = tyJansen;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllJansen() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61323);
            __CLR4_1_101axz1axzlusqka27.R.inc(61324);return allJansen;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllJansen(Float allJansen) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61325);
            __CLR4_1_101axz1axzlusqka27.R.inc(61326);this.allJansen = allJansen;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomKumarRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61327);
            __CLR4_1_101axz1axzlusqka27.R.inc(61328);return nomKumarRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomKumarRatio(Float nomKumarRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61329);
            __CLR4_1_101axz1axzlusqka27.R.inc(61330);this.nomKumarRatio = nomKumarRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhyKumarRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61331);
            __CLR4_1_101axz1axzlusqka27.R.inc(61332);return nhyKumarRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyKumarRatio(Float nhyKumarRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61333);
            __CLR4_1_101axz1axzlusqka27.R.inc(61334);this.nhyKumarRatio = nhyKumarRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoyKumarRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61335);
            __CLR4_1_101axz1axzlusqka27.R.inc(61336);return noyKumarRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyKumarRatio(Float noyKumarRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61337);
            __CLR4_1_101axz1axzlusqka27.R.inc(61338);this.noyKumarRatio = noyKumarRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmKumarRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61339);
            __CLR4_1_101axz1axzlusqka27.R.inc(61340);return tmKumarRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmKumarRatio(Float tmKumarRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61341);
            __CLR4_1_101axz1axzlusqka27.R.inc(61342);this.tmKumarRatio = tmKumarRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqKumarRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61343);
            __CLR4_1_101axz1axzlusqka27.R.inc(61344);return tqKumarRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqKumarRatio(Float tqKumarRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61345);
            __CLR4_1_101axz1axzlusqka27.R.inc(61346);this.tqKumarRatio = tqKumarRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTyKumarRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61347);
            __CLR4_1_101axz1axzlusqka27.R.inc(61348);return tyKumarRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyKumarRatio(Float tyKumarRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61349);
            __CLR4_1_101axz1axzlusqka27.R.inc(61350);this.tyKumarRatio = tyKumarRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllKumarRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61351);
            __CLR4_1_101axz1axzlusqka27.R.inc(61352);return allKumarRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllKumarRatio(Float allKumarRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61353);
            __CLR4_1_101axz1axzlusqka27.R.inc(61354);this.allKumarRatio = allKumarRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomSharpeRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61355);
            __CLR4_1_101axz1axzlusqka27.R.inc(61356);return nomSharpeRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomSharpeRatio(Float nomSharpeRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61357);
            __CLR4_1_101axz1axzlusqka27.R.inc(61358);this.nomSharpeRatio = nomSharpeRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhySharpeRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61359);
            __CLR4_1_101axz1axzlusqka27.R.inc(61360);return nhySharpeRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhySharpeRatio(Float nhySharpeRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61361);
            __CLR4_1_101axz1axzlusqka27.R.inc(61362);this.nhySharpeRatio = nhySharpeRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoySharpeRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61363);
            __CLR4_1_101axz1axzlusqka27.R.inc(61364);return noySharpeRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoySharpeRatio(Float noySharpeRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61365);
            __CLR4_1_101axz1axzlusqka27.R.inc(61366);this.noySharpeRatio = noySharpeRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmSharpeRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61367);
            __CLR4_1_101axz1axzlusqka27.R.inc(61368);return tmSharpeRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmSharpeRatio(Float tmSharpeRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61369);
            __CLR4_1_101axz1axzlusqka27.R.inc(61370);this.tmSharpeRatio = tmSharpeRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqSharpeRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61371);
            __CLR4_1_101axz1axzlusqka27.R.inc(61372);return tqSharpeRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqSharpeRatio(Float tqSharpeRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61373);
            __CLR4_1_101axz1axzlusqka27.R.inc(61374);this.tqSharpeRatio = tqSharpeRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTySharpeRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61375);
            __CLR4_1_101axz1axzlusqka27.R.inc(61376);return tySharpeRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTySharpeRatio(Float tySharpeRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61377);
            __CLR4_1_101axz1axzlusqka27.R.inc(61378);this.tySharpeRatio = tySharpeRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllSharpeRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61379);
            __CLR4_1_101axz1axzlusqka27.R.inc(61380);return allSharpeRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllSharpeRatio(Float allSharpeRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61381);
            __CLR4_1_101axz1axzlusqka27.R.inc(61382);this.allSharpeRatio = allSharpeRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomSortinoRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61383);
            __CLR4_1_101axz1axzlusqka27.R.inc(61384);return nomSortinoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomSortinoRatio(Float nomSortinoRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61385);
            __CLR4_1_101axz1axzlusqka27.R.inc(61386);this.nomSortinoRatio = nomSortinoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhySortinoRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61387);
            __CLR4_1_101axz1axzlusqka27.R.inc(61388);return nhySortinoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhySortinoRatio(Float nhySortinoRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61389);
            __CLR4_1_101axz1axzlusqka27.R.inc(61390);this.nhySortinoRatio = nhySortinoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoySortinoRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61391);
            __CLR4_1_101axz1axzlusqka27.R.inc(61392);return noySortinoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoySortinoRatio(Float noySortinoRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61393);
            __CLR4_1_101axz1axzlusqka27.R.inc(61394);this.noySortinoRatio = noySortinoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmSortinoRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61395);
            __CLR4_1_101axz1axzlusqka27.R.inc(61396);return tmSortinoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmSortinoRatio(Float tmSortinoRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61397);
            __CLR4_1_101axz1axzlusqka27.R.inc(61398);this.tmSortinoRatio = tmSortinoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqSortinoRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61399);
            __CLR4_1_101axz1axzlusqka27.R.inc(61400);return tqSortinoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqSortinoRatio(Float tqSortinoRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61401);
            __CLR4_1_101axz1axzlusqka27.R.inc(61402);this.tqSortinoRatio = tqSortinoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTySortinoRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61403);
            __CLR4_1_101axz1axzlusqka27.R.inc(61404);return tySortinoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTySortinoRatio(Float tySortinoRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61405);
            __CLR4_1_101axz1axzlusqka27.R.inc(61406);this.tySortinoRatio = tySortinoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllSortinoRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61407);
            __CLR4_1_101axz1axzlusqka27.R.inc(61408);return allSortinoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllSortinoRatio(Float allSortinoRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61409);
            __CLR4_1_101axz1axzlusqka27.R.inc(61410);this.allSortinoRatio = allSortinoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomHurstIndex() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61411);
            __CLR4_1_101axz1axzlusqka27.R.inc(61412);return nomHurstIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomHurstIndex(Float nomHurstIndex) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61413);
            __CLR4_1_101axz1axzlusqka27.R.inc(61414);this.nomHurstIndex = nomHurstIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhyHurstIndex() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61415);
            __CLR4_1_101axz1axzlusqka27.R.inc(61416);return nhyHurstIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyHurstIndex(Float nhyHurstIndex) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61417);
            __CLR4_1_101axz1axzlusqka27.R.inc(61418);this.nhyHurstIndex = nhyHurstIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoyHurstIndex() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61419);
            __CLR4_1_101axz1axzlusqka27.R.inc(61420);return noyHurstIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyHurstIndex(Float noyHurstIndex) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61421);
            __CLR4_1_101axz1axzlusqka27.R.inc(61422);this.noyHurstIndex = noyHurstIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmHurstIndex() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61423);
            __CLR4_1_101axz1axzlusqka27.R.inc(61424);return tmHurstIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmHurstIndex(Float tmHurstIndex) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61425);
            __CLR4_1_101axz1axzlusqka27.R.inc(61426);this.tmHurstIndex = tmHurstIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqHurstIndex() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61427);
            __CLR4_1_101axz1axzlusqka27.R.inc(61428);return tqHurstIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqHurstIndex(Float tqHurstIndex) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61429);
            __CLR4_1_101axz1axzlusqka27.R.inc(61430);this.tqHurstIndex = tqHurstIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTyHurstIndex() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61431);
            __CLR4_1_101axz1axzlusqka27.R.inc(61432);return tyHurstIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyHurstIndex(Float tyHurstIndex) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61433);
            __CLR4_1_101axz1axzlusqka27.R.inc(61434);this.tyHurstIndex = tyHurstIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllHurstIndex() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61435);
            __CLR4_1_101axz1axzlusqka27.R.inc(61436);return allHurstIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllHurstIndex(Float allHurstIndex) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61437);
            __CLR4_1_101axz1axzlusqka27.R.inc(61438);this.allHurstIndex = allHurstIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomVarIndex() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61439);
            __CLR4_1_101axz1axzlusqka27.R.inc(61440);return nomVarIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomVarIndex(Float nomVarIndex) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61441);
            __CLR4_1_101axz1axzlusqka27.R.inc(61442);this.nomVarIndex = nomVarIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhyVarIndex() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61443);
            __CLR4_1_101axz1axzlusqka27.R.inc(61444);return nhyVarIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyVarIndex(Float nhyVarIndex) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61445);
            __CLR4_1_101axz1axzlusqka27.R.inc(61446);this.nhyVarIndex = nhyVarIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoyVarIndex() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61447);
            __CLR4_1_101axz1axzlusqka27.R.inc(61448);return noyVarIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyVarIndex(Float noyVarIndex) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61449);
            __CLR4_1_101axz1axzlusqka27.R.inc(61450);this.noyVarIndex = noyVarIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmVarIndex() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61451);
            __CLR4_1_101axz1axzlusqka27.R.inc(61452);return tmVarIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmVarIndex(Float tmVarIndex) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61453);
            __CLR4_1_101axz1axzlusqka27.R.inc(61454);this.tmVarIndex = tmVarIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqVarIndex() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61455);
            __CLR4_1_101axz1axzlusqka27.R.inc(61456);return tqVarIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqVarIndex(Float tqVarIndex) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61457);
            __CLR4_1_101axz1axzlusqka27.R.inc(61458);this.tqVarIndex = tqVarIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTyVarIndex() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61459);
            __CLR4_1_101axz1axzlusqka27.R.inc(61460);return tyVarIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyVarIndex(Float tyVarIndex) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61461);
            __CLR4_1_101axz1axzlusqka27.R.inc(61462);this.tyVarIndex = tyVarIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllVarIndex() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61463);
            __CLR4_1_101axz1axzlusqka27.R.inc(61464);return allVarIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllVarIndex(Float allVarIndex) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61465);
            __CLR4_1_101axz1axzlusqka27.R.inc(61466);this.allVarIndex = allVarIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomVarIndex99() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61467);
            __CLR4_1_101axz1axzlusqka27.R.inc(61468);return nomVarIndex99;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomVarIndex99(Float nomVarIndex99) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61469);
            __CLR4_1_101axz1axzlusqka27.R.inc(61470);this.nomVarIndex99 = nomVarIndex99;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhyVarIndex99() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61471);
            __CLR4_1_101axz1axzlusqka27.R.inc(61472);return nhyVarIndex99;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyVarIndex99(Float nhyVarIndex99) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61473);
            __CLR4_1_101axz1axzlusqka27.R.inc(61474);this.nhyVarIndex99 = nhyVarIndex99;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoyVarIndex99() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61475);
            __CLR4_1_101axz1axzlusqka27.R.inc(61476);return noyVarIndex99;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyVarIndex99(Float noyVarIndex99) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61477);
            __CLR4_1_101axz1axzlusqka27.R.inc(61478);this.noyVarIndex99 = noyVarIndex99;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmVarIndex99() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61479);
            __CLR4_1_101axz1axzlusqka27.R.inc(61480);return tmVarIndex99;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmVarIndex99(Float tmVarIndex99) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61481);
            __CLR4_1_101axz1axzlusqka27.R.inc(61482);this.tmVarIndex99 = tmVarIndex99;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqVarIndex99() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61483);
            __CLR4_1_101axz1axzlusqka27.R.inc(61484);return tqVarIndex99;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqVarIndex99(Float tqVarIndex99) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61485);
            __CLR4_1_101axz1axzlusqka27.R.inc(61486);this.tqVarIndex99 = tqVarIndex99;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTyVarIndex99() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61487);
            __CLR4_1_101axz1axzlusqka27.R.inc(61488);return tyVarIndex99;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyVarIndex99(Float tyVarIndex99) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61489);
            __CLR4_1_101axz1axzlusqka27.R.inc(61490);this.tyVarIndex99 = tyVarIndex99;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllVarIndex99() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61491);
            __CLR4_1_101axz1axzlusqka27.R.inc(61492);return allVarIndex99;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllVarIndex99(Float allVarIndex99) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61493);
            __CLR4_1_101axz1axzlusqka27.R.inc(61494);this.allVarIndex99 = allVarIndex99;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomUpCaptureRate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61495);
            __CLR4_1_101axz1axzlusqka27.R.inc(61496);return nomUpCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomUpCaptureRate(Float nomUpCaptureRate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61497);
            __CLR4_1_101axz1axzlusqka27.R.inc(61498);this.nomUpCaptureRate = nomUpCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhyUpCaptureRate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61499);
            __CLR4_1_101axz1axzlusqka27.R.inc(61500);return nhyUpCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyUpCaptureRate(Float nhyUpCaptureRate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61501);
            __CLR4_1_101axz1axzlusqka27.R.inc(61502);this.nhyUpCaptureRate = nhyUpCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoyUpCaptureRate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61503);
            __CLR4_1_101axz1axzlusqka27.R.inc(61504);return noyUpCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyUpCaptureRate(Float noyUpCaptureRate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61505);
            __CLR4_1_101axz1axzlusqka27.R.inc(61506);this.noyUpCaptureRate = noyUpCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmUpCaptureRate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61507);
            __CLR4_1_101axz1axzlusqka27.R.inc(61508);return tmUpCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmUpCaptureRate(Float tmUpCaptureRate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61509);
            __CLR4_1_101axz1axzlusqka27.R.inc(61510);this.tmUpCaptureRate = tmUpCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqUpCaptureRate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61511);
            __CLR4_1_101axz1axzlusqka27.R.inc(61512);return tqUpCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqUpCaptureRate(Float tqUpCaptureRate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61513);
            __CLR4_1_101axz1axzlusqka27.R.inc(61514);this.tqUpCaptureRate = tqUpCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTyUpCaptureRate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61515);
            __CLR4_1_101axz1axzlusqka27.R.inc(61516);return tyUpCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyUpCaptureRate(Float tyUpCaptureRate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61517);
            __CLR4_1_101axz1axzlusqka27.R.inc(61518);this.tyUpCaptureRate = tyUpCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllUpCaptureRate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61519);
            __CLR4_1_101axz1axzlusqka27.R.inc(61520);return allUpCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllUpCaptureRate(Float allUpCaptureRate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61521);
            __CLR4_1_101axz1axzlusqka27.R.inc(61522);this.allUpCaptureRate = allUpCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomDownCaptureRate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61523);
            __CLR4_1_101axz1axzlusqka27.R.inc(61524);return nomDownCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomDownCaptureRate(Float nomDownCaptureRate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61525);
            __CLR4_1_101axz1axzlusqka27.R.inc(61526);this.nomDownCaptureRate = nomDownCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhyDownCaptureRate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61527);
            __CLR4_1_101axz1axzlusqka27.R.inc(61528);return nhyDownCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyDownCaptureRate(Float nhyDownCaptureRate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61529);
            __CLR4_1_101axz1axzlusqka27.R.inc(61530);this.nhyDownCaptureRate = nhyDownCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoyDownCaptureRate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61531);
            __CLR4_1_101axz1axzlusqka27.R.inc(61532);return noyDownCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyDownCaptureRate(Float noyDownCaptureRate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61533);
            __CLR4_1_101axz1axzlusqka27.R.inc(61534);this.noyDownCaptureRate = noyDownCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmDownCaptureRate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61535);
            __CLR4_1_101axz1axzlusqka27.R.inc(61536);return tmDownCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmDownCaptureRate(Float tmDownCaptureRate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61537);
            __CLR4_1_101axz1axzlusqka27.R.inc(61538);this.tmDownCaptureRate = tmDownCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqDownCaptureRate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61539);
            __CLR4_1_101axz1axzlusqka27.R.inc(61540);return tqDownCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqDownCaptureRate(Float tqDownCaptureRate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61541);
            __CLR4_1_101axz1axzlusqka27.R.inc(61542);this.tqDownCaptureRate = tqDownCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTyDownCaptureRate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61543);
            __CLR4_1_101axz1axzlusqka27.R.inc(61544);return tyDownCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyDownCaptureRate(Float tyDownCaptureRate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61545);
            __CLR4_1_101axz1axzlusqka27.R.inc(61546);this.tyDownCaptureRate = tyDownCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllDownCaptureRate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61547);
            __CLR4_1_101axz1axzlusqka27.R.inc(61548);return allDownCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllDownCaptureRate(Float allDownCaptureRate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61549);
            __CLR4_1_101axz1axzlusqka27.R.inc(61550);this.allDownCaptureRate = allDownCaptureRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomInfoRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61551);
            __CLR4_1_101axz1axzlusqka27.R.inc(61552);return nomInfoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomInfoRatio(Float nomInfoRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61553);
            __CLR4_1_101axz1axzlusqka27.R.inc(61554);this.nomInfoRatio = nomInfoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhyInfoRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61555);
            __CLR4_1_101axz1axzlusqka27.R.inc(61556);return nhyInfoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyInfoRatio(Float nhyInfoRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61557);
            __CLR4_1_101axz1axzlusqka27.R.inc(61558);this.nhyInfoRatio = nhyInfoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoyInfoRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61559);
            __CLR4_1_101axz1axzlusqka27.R.inc(61560);return noyInfoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyInfoRatio(Float noyInfoRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61561);
            __CLR4_1_101axz1axzlusqka27.R.inc(61562);this.noyInfoRatio = noyInfoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmInfoRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61563);
            __CLR4_1_101axz1axzlusqka27.R.inc(61564);return tmInfoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmInfoRatio(Float tmInfoRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61565);
            __CLR4_1_101axz1axzlusqka27.R.inc(61566);this.tmInfoRatio = tmInfoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqInfoRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61567);
            __CLR4_1_101axz1axzlusqka27.R.inc(61568);return tqInfoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqInfoRatio(Float tqInfoRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61569);
            __CLR4_1_101axz1axzlusqka27.R.inc(61570);this.tqInfoRatio = tqInfoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTyInfoRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61571);
            __CLR4_1_101axz1axzlusqka27.R.inc(61572);return tyInfoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyInfoRatio(Float tyInfoRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61573);
            __CLR4_1_101axz1axzlusqka27.R.inc(61574);this.tyInfoRatio = tyInfoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllInfoRatio() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61575);
            __CLR4_1_101axz1axzlusqka27.R.inc(61576);return allInfoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllInfoRatio(Float allInfoRatio) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61577);
            __CLR4_1_101axz1axzlusqka27.R.inc(61578);this.allInfoRatio = allInfoRatio;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomAlgorithmVolatility() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61579);
            __CLR4_1_101axz1axzlusqka27.R.inc(61580);return nomAlgorithmVolatility;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomAlgorithmVolatility(Float nomAlgorithmVolatility) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61581);
            __CLR4_1_101axz1axzlusqka27.R.inc(61582);this.nomAlgorithmVolatility = nomAlgorithmVolatility;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhyAlgorithmVolatility() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61583);
            __CLR4_1_101axz1axzlusqka27.R.inc(61584);return nhyAlgorithmVolatility;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyAlgorithmVolatility(Float nhyAlgorithmVolatility) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61585);
            __CLR4_1_101axz1axzlusqka27.R.inc(61586);this.nhyAlgorithmVolatility = nhyAlgorithmVolatility;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoyAlgorithmVolatility() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61587);
            __CLR4_1_101axz1axzlusqka27.R.inc(61588);return noyAlgorithmVolatility;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyAlgorithmVolatility(Float noyAlgorithmVolatility) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61589);
            __CLR4_1_101axz1axzlusqka27.R.inc(61590);this.noyAlgorithmVolatility = noyAlgorithmVolatility;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmAlgorithmVolatility() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61591);
            __CLR4_1_101axz1axzlusqka27.R.inc(61592);return tmAlgorithmVolatility;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmAlgorithmVolatility(Float tmAlgorithmVolatility) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61593);
            __CLR4_1_101axz1axzlusqka27.R.inc(61594);this.tmAlgorithmVolatility = tmAlgorithmVolatility;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqAlgorithmVolatility() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61595);
            __CLR4_1_101axz1axzlusqka27.R.inc(61596);return tqAlgorithmVolatility;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqAlgorithmVolatility(Float tqAlgorithmVolatility) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61597);
            __CLR4_1_101axz1axzlusqka27.R.inc(61598);this.tqAlgorithmVolatility = tqAlgorithmVolatility;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTyAlgorithmVolatility() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61599);
            __CLR4_1_101axz1axzlusqka27.R.inc(61600);return tyAlgorithmVolatility;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyAlgorithmVolatility(Float tyAlgorithmVolatility) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61601);
            __CLR4_1_101axz1axzlusqka27.R.inc(61602);this.tyAlgorithmVolatility = tyAlgorithmVolatility;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllAlgorithmVolatility() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61603);
            __CLR4_1_101axz1axzlusqka27.R.inc(61604);return allAlgorithmVolatility;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllAlgorithmVolatility(Float allAlgorithmVolatility) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61605);
            __CLR4_1_101axz1axzlusqka27.R.inc(61606);this.allAlgorithmVolatility = allAlgorithmVolatility;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomMSquare() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61607);
            __CLR4_1_101axz1axzlusqka27.R.inc(61608);return nomMSquare;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomMSquare(Float nomMSquare) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61609);
            __CLR4_1_101axz1axzlusqka27.R.inc(61610);this.nomMSquare = nomMSquare;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhyMSquare() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61611);
            __CLR4_1_101axz1axzlusqka27.R.inc(61612);return nhyMSquare;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyMSquare(Float nhyMSquare) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61613);
            __CLR4_1_101axz1axzlusqka27.R.inc(61614);this.nhyMSquare = nhyMSquare;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoyMSquare() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61615);
            __CLR4_1_101axz1axzlusqka27.R.inc(61616);return noyMSquare;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyMSquare(Float noyMSquare) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61617);
            __CLR4_1_101axz1axzlusqka27.R.inc(61618);this.noyMSquare = noyMSquare;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmMSquare() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61619);
            __CLR4_1_101axz1axzlusqka27.R.inc(61620);return tmMSquare;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmMSquare(Float tmMSquare) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61621);
            __CLR4_1_101axz1axzlusqka27.R.inc(61622);this.tmMSquare = tmMSquare;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqMSquare() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61623);
            __CLR4_1_101axz1axzlusqka27.R.inc(61624);return tqMSquare;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqMSquare(Float tqMSquare) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61625);
            __CLR4_1_101axz1axzlusqka27.R.inc(61626);this.tqMSquare = tqMSquare;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTyMSquare() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61627);
            __CLR4_1_101axz1axzlusqka27.R.inc(61628);return tyMSquare;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyMSquare(Float tyMSquare) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61629);
            __CLR4_1_101axz1axzlusqka27.R.inc(61630);this.tyMSquare = tyMSquare;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllMSquare() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61631);
            __CLR4_1_101axz1axzlusqka27.R.inc(61632);return allMSquare;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllMSquare(Float allMSquare) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61633);
            __CLR4_1_101axz1axzlusqka27.R.inc(61634);this.allMSquare = allMSquare;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNomTreynorIndex() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61635);
            __CLR4_1_101axz1axzlusqka27.R.inc(61636);return nomTreynorIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNomTreynorIndex(Float nomTreynorIndex) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61637);
            __CLR4_1_101axz1axzlusqka27.R.inc(61638);this.nomTreynorIndex = nomTreynorIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNhyTreynorIndex() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61639);
            __CLR4_1_101axz1axzlusqka27.R.inc(61640);return nhyTreynorIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNhyTreynorIndex(Float nhyTreynorIndex) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61641);
            __CLR4_1_101axz1axzlusqka27.R.inc(61642);this.nhyTreynorIndex = nhyTreynorIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getNoyTreynorIndex() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61643);
            __CLR4_1_101axz1axzlusqka27.R.inc(61644);return noyTreynorIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNoyTreynorIndex(Float noyTreynorIndex) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61645);
            __CLR4_1_101axz1axzlusqka27.R.inc(61646);this.noyTreynorIndex = noyTreynorIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTmTreynorIndex() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61647);
            __CLR4_1_101axz1axzlusqka27.R.inc(61648);return tmTreynorIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTmTreynorIndex(Float tmTreynorIndex) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61649);
            __CLR4_1_101axz1axzlusqka27.R.inc(61650);this.tmTreynorIndex = tmTreynorIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTqTreynorIndex() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61651);
            __CLR4_1_101axz1axzlusqka27.R.inc(61652);return tqTreynorIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTqTreynorIndex(Float tqTreynorIndex) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61653);
            __CLR4_1_101axz1axzlusqka27.R.inc(61654);this.tqTreynorIndex = tqTreynorIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getTyTreynorIndex() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61655);
            __CLR4_1_101axz1axzlusqka27.R.inc(61656);return tyTreynorIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTyTreynorIndex(Float tyTreynorIndex) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61657);
            __CLR4_1_101axz1axzlusqka27.R.inc(61658);this.tyTreynorIndex = tyTreynorIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getAllTreynorIndex() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61659);
            __CLR4_1_101axz1axzlusqka27.R.inc(61660);return allTreynorIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setAllTreynorIndex(Float allTreynorIndex) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61661);
            __CLR4_1_101axz1axzlusqka27.R.inc(61662);this.allTreynorIndex = allTreynorIndex;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getId() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61663);
            __CLR4_1_101axz1axzlusqka27.R.inc(61664);return id;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setId(String id) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61665);
            __CLR4_1_101axz1axzlusqka27.R.inc(61666);this.id = id;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61667);
            __CLR4_1_101axz1axzlusqka27.R.inc(61668);return name;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61669);
            __CLR4_1_101axz1axzlusqka27.R.inc(61670);this.name = name;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getShortName() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61671);
            __CLR4_1_101axz1axzlusqka27.R.inc(61672);return shortName;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setShortName(String shortName) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61673);
            __CLR4_1_101axz1axzlusqka27.R.inc(61674);this.shortName = shortName;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getCode() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61675);
            __CLR4_1_101axz1axzlusqka27.R.inc(61676);return code;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setCode(String code) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61677);
            __CLR4_1_101axz1axzlusqka27.R.inc(61678);this.code = code;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getRecordNumber() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61679);
            __CLR4_1_101axz1axzlusqka27.R.inc(61680);return recordNumber;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setRecordNumber(String recordNumber) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61681);
            __CLR4_1_101axz1axzlusqka27.R.inc(61682);this.recordNumber = recordNumber;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Byte getFundType() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61683);
            __CLR4_1_101axz1axzlusqka27.R.inc(61684);return fundType;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setFundType(Byte fundType) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61685);
            __CLR4_1_101axz1axzlusqka27.R.inc(61686);this.fundType = fundType;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Byte getFundBreed() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61687);
            __CLR4_1_101axz1axzlusqka27.R.inc(61688);return fundBreed;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setFundBreed(Byte fundBreed) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61689);
            __CLR4_1_101axz1axzlusqka27.R.inc(61690);this.fundBreed = fundBreed;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Byte getFundStatus() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61691);
            __CLR4_1_101axz1axzlusqka27.R.inc(61692);return fundStatus;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setFundStatus(Byte fundStatus) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61693);
            __CLR4_1_101axz1axzlusqka27.R.inc(61694);this.fundStatus = fundStatus;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getBuyStatus() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61695);
            __CLR4_1_101axz1axzlusqka27.R.inc(61696);return buyStatus;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setBuyStatus(String buyStatus) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61697);
            __CLR4_1_101axz1axzlusqka27.R.inc(61698);this.buyStatus = buyStatus;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getRedeemStatus() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61699);
            __CLR4_1_101axz1axzlusqka27.R.inc(61700);return redeemStatus;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setRedeemStatus(String redeemStatus) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61701);
            __CLR4_1_101axz1axzlusqka27.R.inc(61702);this.redeemStatus = redeemStatus;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getRecordDate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61703);
            __CLR4_1_101axz1axzlusqka27.R.inc(61704);return recordDate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setRecordDate(String recordDate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61705);
            __CLR4_1_101axz1axzlusqka27.R.inc(61706);this.recordDate = recordDate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getCreateDate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61707);
            __CLR4_1_101axz1axzlusqka27.R.inc(61708);return createDate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setCreateDate(String createDate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61709);
            __CLR4_1_101axz1axzlusqka27.R.inc(61710);this.createDate = createDate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getStopDate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61711);
            __CLR4_1_101axz1axzlusqka27.R.inc(61712);return stopDate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setStopDate(String stopDate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61713);
            __CLR4_1_101axz1axzlusqka27.R.inc(61714);this.stopDate = stopDate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getFundFilingStage() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61715);
            __CLR4_1_101axz1axzlusqka27.R.inc(61716);return fundFilingStage;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setFundFilingStage(String fundFilingStage) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61717);
            __CLR4_1_101axz1axzlusqka27.R.inc(61718);this.fundFilingStage = fundFilingStage;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getFundInvestmentType() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61719);
            __CLR4_1_101axz1axzlusqka27.R.inc(61720);return fundInvestmentType;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setFundInvestmentType(String fundInvestmentType) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61721);
            __CLR4_1_101axz1axzlusqka27.R.inc(61722);this.fundInvestmentType = fundInvestmentType;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getCurrency() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61723);
            __CLR4_1_101axz1axzlusqka27.R.inc(61724);return currency;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setCurrency(String currency) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61725);
            __CLR4_1_101axz1axzlusqka27.R.inc(61726);this.currency = currency;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getManagerType() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61727);
            __CLR4_1_101axz1axzlusqka27.R.inc(61728);return managerType;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setManagerType(String managerType) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61729);
            __CLR4_1_101axz1axzlusqka27.R.inc(61730);this.managerType = managerType;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getManagerName() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61731);
            __CLR4_1_101axz1axzlusqka27.R.inc(61732);return managerName;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setManagerName(String managerName) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61733);
            __CLR4_1_101axz1axzlusqka27.R.inc(61734);this.managerName = managerName;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getInvestmentTarget() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61735);
            __CLR4_1_101axz1axzlusqka27.R.inc(61736);return investmentTarget;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setInvestmentTarget(String investmentTarget) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61737);
            __CLR4_1_101axz1axzlusqka27.R.inc(61738);this.investmentTarget = investmentTarget;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getMajorInvestAreas() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61739);
            __CLR4_1_101axz1axzlusqka27.R.inc(61740);return majorInvestAreas;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setMajorInvestAreas(String majorInvestAreas) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61741);
            __CLR4_1_101axz1axzlusqka27.R.inc(61742);this.majorInvestAreas = majorInvestAreas;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getFundLastModifyDate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61743);
            __CLR4_1_101axz1axzlusqka27.R.inc(61744);return fundLastModifyDate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setFundLastModifyDate(String fundLastModifyDate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61745);
            __CLR4_1_101axz1axzlusqka27.R.inc(61746);this.fundLastModifyDate = fundLastModifyDate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getSpecialNote() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61747);
            __CLR4_1_101axz1axzlusqka27.R.inc(61748);return specialNote;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setSpecialNote(String specialNote) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61749);
            __CLR4_1_101axz1axzlusqka27.R.inc(61750);this.specialNote = specialNote;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getRegisteredAddress() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61751);
            __CLR4_1_101axz1axzlusqka27.R.inc(61752);return registeredAddress;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setRegisteredAddress(String registeredAddress) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61753);
            __CLR4_1_101axz1axzlusqka27.R.inc(61754);this.registeredAddress = registeredAddress;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getInvestmentStrategy() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61755);
            __CLR4_1_101axz1axzlusqka27.R.inc(61756);return investmentStrategy;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setInvestmentStrategy(String investmentStrategy) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61757);
            __CLR4_1_101axz1axzlusqka27.R.inc(61758);this.investmentStrategy = investmentStrategy;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getInvestmentSubStrategy() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61759);
            __CLR4_1_101axz1axzlusqka27.R.inc(61760);return investmentSubStrategy;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setInvestmentSubStrategy(String investmentSubStrategy) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61761);
            __CLR4_1_101axz1axzlusqka27.R.inc(61762);this.investmentSubStrategy = investmentSubStrategy;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public List<String> getFundManagerIds() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61763);
            __CLR4_1_101axz1axzlusqka27.R.inc(61764);return fundManagerIds;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setFundManagerIds(List<String> fundManagerIds) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61765);
            __CLR4_1_101axz1axzlusqka27.R.inc(61766);this.fundManagerIds = fundManagerIds;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getCompanyId() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61767);
            __CLR4_1_101axz1axzlusqka27.R.inc(61768);return companyId;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setCompanyId(String companyId) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61769);
            __CLR4_1_101axz1axzlusqka27.R.inc(61770);this.companyId = companyId;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Long getOrderNum() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61771);
            __CLR4_1_101axz1axzlusqka27.R.inc(61772);return orderNum;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setOrderNum(Long orderNum) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61773);
            __CLR4_1_101axz1axzlusqka27.R.inc(61774);this.orderNum = orderNum;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getCreateScale() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61775);
            __CLR4_1_101axz1axzlusqka27.R.inc(61776);return createScale;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setCreateScale(String createScale) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61777);
            __CLR4_1_101axz1axzlusqka27.R.inc(61778);this.createScale = createScale;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getLatestScale() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61779);
            __CLR4_1_101axz1axzlusqka27.R.inc(61780);return latestScale;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setLatestScale(String latestScale) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61781);
            __CLR4_1_101axz1axzlusqka27.R.inc(61782);this.latestScale = latestScale;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getBenchmark() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61783);
            __CLR4_1_101axz1axzlusqka27.R.inc(61784);return benchmark;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setBenchmark(String benchmark) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61785);
            __CLR4_1_101axz1axzlusqka27.R.inc(61786);this.benchmark = benchmark;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Byte getNetValueUpdateRate() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61787);
            __CLR4_1_101axz1axzlusqka27.R.inc(61788);return netValueUpdateRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNetValueUpdateRate(Byte netValueUpdateRate) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61789);
            __CLR4_1_101axz1axzlusqka27.R.inc(61790);this.netValueUpdateRate = netValueUpdateRate;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getFundOuterId() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61791);
            __CLR4_1_101axz1axzlusqka27.R.inc(61792);return fundOuterId;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setFundOuterId(String fundOuterId) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61793);
            __CLR4_1_101axz1axzlusqka27.R.inc(61794);this.fundOuterId = fundOuterId;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getTags() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61795);
            __CLR4_1_101axz1axzlusqka27.R.inc(61796);return tags;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTags(String tags) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61797);
            __CLR4_1_101axz1axzlusqka27.R.inc(61798);this.tags = tags;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getRemark() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61799);
            __CLR4_1_101axz1axzlusqka27.R.inc(61800);return remark;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setRemark(String remark) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61801);
            __CLR4_1_101axz1axzlusqka27.R.inc(61802);this.remark = remark;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getStrategyCapacity() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61803);
            __CLR4_1_101axz1axzlusqka27.R.inc(61804);return strategyCapacity;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setStrategyCapacity(String strategyCapacity) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61805);
            __CLR4_1_101axz1axzlusqka27.R.inc(61806);this.strategyCapacity = strategyCapacity;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Long getCreateTime() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61807);
            __CLR4_1_101axz1axzlusqka27.R.inc(61808);return createTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setCreateTime(Long createTime) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61809);
            __CLR4_1_101axz1axzlusqka27.R.inc(61810);this.createTime = createTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getCreatorId() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61811);
            __CLR4_1_101axz1axzlusqka27.R.inc(61812);return creatorId;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setCreatorId(String creatorId) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61813);
            __CLR4_1_101axz1axzlusqka27.R.inc(61814);this.creatorId = creatorId;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Long getLastModifyTime() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61815);
            __CLR4_1_101axz1axzlusqka27.R.inc(61816);return lastModifyTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setLastModifyTime(Long lastModifyTime) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61817);
            __CLR4_1_101axz1axzlusqka27.R.inc(61818);this.lastModifyTime = lastModifyTime;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getLastModifierId() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61819);
            __CLR4_1_101axz1axzlusqka27.R.inc(61820);return lastModifierId;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setLastModifierId(String lastModifierId) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61821);
            __CLR4_1_101axz1axzlusqka27.R.inc(61822);this.lastModifierId = lastModifierId;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getCompanyOuterId() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61823);
            __CLR4_1_101axz1axzlusqka27.R.inc(61824);return companyOuterId;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setCompanyOuterId(String companyOuterId) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61825);
            __CLR4_1_101axz1axzlusqka27.R.inc(61826);this.companyOuterId = companyOuterId;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getCompanyName() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61827);
            __CLR4_1_101axz1axzlusqka27.R.inc(61828);return companyName;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setCompanyName(String companyName) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61829);
            __CLR4_1_101axz1axzlusqka27.R.inc(61830);this.companyName = companyName;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public List<String> getManagerOuterIds() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61831);
            __CLR4_1_101axz1axzlusqka27.R.inc(61832);return managerOuterIds;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setManagerOuterIds(List<String> managerOuterIds) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61833);
            __CLR4_1_101axz1axzlusqka27.R.inc(61834);this.managerOuterIds = managerOuterIds;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public List<String> getFundIds() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61835);
            __CLR4_1_101axz1axzlusqka27.R.inc(61836);return fundIds;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setFundIds(List<String> fundIds) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61837);
            __CLR4_1_101axz1axzlusqka27.R.inc(61838);this.fundIds = fundIds;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public List<String> getCompanyIds() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61839);
            __CLR4_1_101axz1axzlusqka27.R.inc(61840);return companyIds;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setCompanyIds(List<String> companyIds) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61841);
            __CLR4_1_101axz1axzlusqka27.R.inc(61842);this.companyIds = companyIds;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getStartAnnualizedReturn() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61843);
            __CLR4_1_101axz1axzlusqka27.R.inc(61844);return startAnnualizedReturn;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setStartAnnualizedReturn(Float startAnnualizedReturn) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61845);
            __CLR4_1_101axz1axzlusqka27.R.inc(61846);this.startAnnualizedReturn = startAnnualizedReturn;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getEndAnnualizedReturn() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61847);
            __CLR4_1_101axz1axzlusqka27.R.inc(61848);return endAnnualizedReturn;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setEndAnnualizedReturn(Float endAnnualizedReturn) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61849);
            __CLR4_1_101axz1axzlusqka27.R.inc(61850);this.endAnnualizedReturn = endAnnualizedReturn;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getTimeInterval() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61851);
            __CLR4_1_101axz1axzlusqka27.R.inc(61852);return timeInterval;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTimeInterval(String timeInterval) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61853);
            __CLR4_1_101axz1axzlusqka27.R.inc(61854);this.timeInterval = timeInterval;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public List<String> getFundManagerNames() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61855);
            __CLR4_1_101axz1axzlusqka27.R.inc(61856);return fundManagerNames;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setFundManagerNames(List<String> fundManagerNames) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61857);
            __CLR4_1_101axz1axzlusqka27.R.inc(61858);this.fundManagerNames = fundManagerNames;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getFundStatusName() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61859);
            __CLR4_1_101axz1axzlusqka27.R.inc(61860);return fundStatusName;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setFundStatusName(String fundStatusName) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61861);
            __CLR4_1_101axz1axzlusqka27.R.inc(61862);this.fundStatusName = fundStatusName;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getFundTypeName() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61863);
            __CLR4_1_101axz1axzlusqka27.R.inc(61864);return fundTypeName;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setFundTypeName(String fundTypeName) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61865);
            __CLR4_1_101axz1axzlusqka27.R.inc(61866);this.fundTypeName = fundTypeName;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Byte getIsConcern() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61867);
            __CLR4_1_101axz1axzlusqka27.R.inc(61868);return isConcern;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setIsConcern(Byte isConcern) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61869);
            __CLR4_1_101axz1axzlusqka27.R.inc(61870);this.isConcern = isConcern;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public Float getConfigWeight() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61871);
            __CLR4_1_101axz1axzlusqka27.R.inc(61872);return configWeight;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setConfigWeight(Float configWeight) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61873);
            __CLR4_1_101axz1axzlusqka27.R.inc(61874);this.configWeight = configWeight;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getNetValueDateString() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61875);
            __CLR4_1_101axz1axzlusqka27.R.inc(61876);return netValueDateString;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setNetValueDateString(String netValueDateString) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61877);
            __CLR4_1_101axz1axzlusqka27.R.inc(61878);this.netValueDateString = netValueDateString;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getManagerId() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61879);
            __CLR4_1_101axz1axzlusqka27.R.inc(61880);return managerId;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setManagerId(String managerId) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61881);
            __CLR4_1_101axz1axzlusqka27.R.inc(61882);this.managerId = managerId;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public String getTagId() {try{__CLR4_1_101axz1axzlusqka27.R.inc(61883);
            __CLR4_1_101axz1axzlusqka27.R.inc(61884);return tagId;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}

        public void setTagId(String tagId) {try{__CLR4_1_101axz1axzlusqka27.R.inc(61885);
            __CLR4_1_101axz1axzlusqka27.R.inc(61886);this.tagId = tagId;
        }finally{__CLR4_1_101axz1axzlusqka27.R.flushNeeded();}}
    }
}