/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1500;

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
public class Issue1565 extends TestCase{static class __CLR4_5_21bvw1bvwlusvnac5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,63108,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_testLargeBeanContainsOver256Field(){__CLR4_5_21bvw1bvwlusvnac5.R.globalSliceStart(getClass().getName(),62060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bydi5v1bvw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bvw1bvwlusvnac5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bvw1bvwlusvnac5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1500.Issue1565.test_testLargeBeanContainsOver256Field",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),62060,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bydi5v1bvw(){try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62060);
        __CLR4_5_21bvw1bvwlusvnac5.R.inc(62061);SerializeConfig serializeConfig = new SerializeConfig();
        __CLR4_5_21bvw1bvwlusvnac5.R.inc(62062);serializeConfig.propertyNamingStrategy = PropertyNamingStrategy.SnakeCase;

//        SmallBean smallBean = new SmallBean();
//        smallBean.setId("S35669xxxxxxxxxxxxxx");
//        smallBean.setNetValueDate(20171105);
//
//        System.out.println(JSON.toJSONString(smallBean, serializeConfig));


        __CLR4_5_21bvw1bvwlusvnac5.R.inc(62063);LargeBean expectedBean = new LargeBean();
        __CLR4_5_21bvw1bvwlusvnac5.R.inc(62064);expectedBean.setId("S35669");
        __CLR4_5_21bvw1bvwlusvnac5.R.inc(62065);expectedBean.setNetValueDate(20171105);
        __CLR4_5_21bvw1bvwlusvnac5.R.inc(62066);String expectedStr = "{\"id\":\"S35669\",\"net_value_date\":20171105}";

        __CLR4_5_21bvw1bvwlusvnac5.R.inc(62067);String actualStr = JSON.toJSONString(expectedBean, serializeConfig);
        __CLR4_5_21bvw1bvwlusvnac5.R.inc(62068);JSONObject actualBean = JSON.parseObject(actualStr);
        __CLR4_5_21bvw1bvwlusvnac5.R.inc(62069);Assert.assertEquals(expectedStr, actualStr);
        __CLR4_5_21bvw1bvwlusvnac5.R.inc(62070);Assert.assertEquals(expectedBean.getId(), actualBean.getString("id"));
        __CLR4_5_21bvw1bvwlusvnac5.R.inc(62071);Assert.assertEquals(expectedBean.getNetValueDate(), actualBean.getInteger("net_value_date"));



    }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

    public static class SmallBean implements Serializable{
        private String id;

        public String getId() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62072);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62073);return id;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setId(String id) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62074);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62075);this.id = id;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Integer getNetValueDate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62076);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62077);return netValueDate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNetValueDate(Integer netValueDate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62078);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62079);this.netValueDate = netValueDate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

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

        public Integer getPageSize() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62080);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62081);return pageSize;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setPageSize(Integer pageSize) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62082);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62083);this.pageSize = pageSize;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Integer getFirstResult() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62084);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62085);return firstResult;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setFirstResult(Integer firstResult) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62086);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62087);this.firstResult = firstResult;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Integer getFetchSize() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62088);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62089);return fetchSize;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setFetchSize(Integer fetchSize) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62090);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62091);this.fetchSize = fetchSize;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getStartTime() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62092);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62093);return startTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setStartTime(String startTime) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62094);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62095);this.startTime = startTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getEndTime() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62096);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62097);return endTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setEndTime(String endTime) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62098);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62099);this.endTime = endTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Boolean getAdministrator() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62100);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62101);return isAdministrator;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAdministrator(Boolean administrator) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62102);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62103);isAdministrator = administrator;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Byte getSortMode() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62104);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62105);return sortMode;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setSortMode(Byte sortMode) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62106);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62107);this.sortMode = sortMode;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getSortFieldName() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62108);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62109);return sortFieldName;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setSortFieldName(String sortFieldName) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62110);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62111);this.sortFieldName = sortFieldName;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getSortFieldValue() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62112);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62113);return sortFieldValue;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setSortFieldValue(String sortFieldValue) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62114);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62115);this.sortFieldValue = sortFieldValue;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Long getCreateTimestamp() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62116);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62117);return createTimestamp;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setCreateTimestamp(Long createTimestamp) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62118);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62119);this.createTimestamp = createTimestamp;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Integer getLastPage() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62120);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62121);return lastPage;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setLastPage(Integer lastPage) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62122);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62123);this.lastPage = lastPage;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Byte getQueryType() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62124);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62125);return queryType;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setQueryType(Byte queryType) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62126);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62127);this.queryType = queryType;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getShard() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62128);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62129);return shard;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setShard(String shard) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62130);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62131);this.shard = shard;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Integer getNetValueDate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62132);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62133);return netValueDate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNetValueDate(Integer netValueDate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62134);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62135);this.netValueDate = netValueDate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getUnitNetValue() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62136);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62137);return unitNetValue;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setUnitNetValue(Float unitNetValue) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62138);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62139);this.unitNetValue = unitNetValue;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTotalNetValue() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62140);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62141);return totalNetValue;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTotalNetValue(Float totalNetValue) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62142);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62143);this.totalNetValue = totalNetValue;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomTotalYield() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62144);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62145);return nomTotalYield;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomTotalYield(Float nomTotalYield) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62146);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62147);this.nomTotalYield = nomTotalYield;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhyTotalYield() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62148);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62149);return nhyTotalYield;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyTotalYield(Float nhyTotalYield) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62150);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62151);this.nhyTotalYield = nhyTotalYield;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoyTotalYield() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62152);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62153);return noyTotalYield;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyTotalYield(Float noyTotalYield) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62154);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62155);this.noyTotalYield = noyTotalYield;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmTotalYield() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62156);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62157);return tmTotalYield;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmTotalYield(Float tmTotalYield) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62158);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62159);this.tmTotalYield = tmTotalYield;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqTotalYield() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62160);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62161);return tqTotalYield;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqTotalYield(Float tqTotalYield) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62162);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62163);this.tqTotalYield = tqTotalYield;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTyTotalYield() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62164);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62165);return tyTotalYield;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyTotalYield(Float tyTotalYield) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62166);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62167);this.tyTotalYield = tyTotalYield;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllTotalYield() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62168);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62169);return allTotalYield;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllTotalYield(Float allTotalYield) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62170);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62171);this.allTotalYield = allTotalYield;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomAnnualizedReturn() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62172);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62173);return nomAnnualizedReturn;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomAnnualizedReturn(Float nomAnnualizedReturn) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62174);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62175);this.nomAnnualizedReturn = nomAnnualizedReturn;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhyAnnualizedReturn() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62176);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62177);return nhyAnnualizedReturn;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyAnnualizedReturn(Float nhyAnnualizedReturn) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62178);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62179);this.nhyAnnualizedReturn = nhyAnnualizedReturn;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoyAnnualizedReturn() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62180);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62181);return noyAnnualizedReturn;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyAnnualizedReturn(Float noyAnnualizedReturn) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62182);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62183);this.noyAnnualizedReturn = noyAnnualizedReturn;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmAnnualizedReturn() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62184);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62185);return tmAnnualizedReturn;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmAnnualizedReturn(Float tmAnnualizedReturn) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62186);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62187);this.tmAnnualizedReturn = tmAnnualizedReturn;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqAnnualizedReturn() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62188);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62189);return tqAnnualizedReturn;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqAnnualizedReturn(Float tqAnnualizedReturn) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62190);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62191);this.tqAnnualizedReturn = tqAnnualizedReturn;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTyAnnualizedReturn() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62192);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62193);return tyAnnualizedReturn;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyAnnualizedReturn(Float tyAnnualizedReturn) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62194);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62195);this.tyAnnualizedReturn = tyAnnualizedReturn;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllAnnualizedReturn() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62196);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62197);return allAnnualizedReturn;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllAnnualizedReturn(Float allAnnualizedReturn) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62198);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62199);this.allAnnualizedReturn = allAnnualizedReturn;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomMaxProfitMargin() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62200);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62201);return nomMaxProfitMargin;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomMaxProfitMargin(Float nomMaxProfitMargin) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62202);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62203);this.nomMaxProfitMargin = nomMaxProfitMargin;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhyMaxProfitMargin() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62204);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62205);return nhyMaxProfitMargin;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyMaxProfitMargin(Float nhyMaxProfitMargin) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62206);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62207);this.nhyMaxProfitMargin = nhyMaxProfitMargin;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoyMaxProfitMargin() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62208);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62209);return noyMaxProfitMargin;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyMaxProfitMargin(Float noyMaxProfitMargin) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62210);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62211);this.noyMaxProfitMargin = noyMaxProfitMargin;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmMaxProfitMargin() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62212);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62213);return tmMaxProfitMargin;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmMaxProfitMargin(Float tmMaxProfitMargin) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62214);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62215);this.tmMaxProfitMargin = tmMaxProfitMargin;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqMaxProfitMargin() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62216);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62217);return tqMaxProfitMargin;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqMaxProfitMargin(Float tqMaxProfitMargin) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62218);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62219);this.tqMaxProfitMargin = tqMaxProfitMargin;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTyMaxProfitMargin() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62220);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62221);return tyMaxProfitMargin;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyMaxProfitMargin(Float tyMaxProfitMargin) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62222);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62223);this.tyMaxProfitMargin = tyMaxProfitMargin;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllMaxProfitMargin() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62224);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62225);return allMaxProfitMargin;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllMaxProfitMargin(Float allMaxProfitMargin) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62226);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62227);this.allMaxProfitMargin = allMaxProfitMargin;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomMaxSingleProfit() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62228);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62229);return nomMaxSingleProfit;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomMaxSingleProfit(Float nomMaxSingleProfit) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62230);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62231);this.nomMaxSingleProfit = nomMaxSingleProfit;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhyMaxSingleProfit() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62232);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62233);return nhyMaxSingleProfit;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyMaxSingleProfit(Float nhyMaxSingleProfit) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62234);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62235);this.nhyMaxSingleProfit = nhyMaxSingleProfit;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoyMaxSingleProfit() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62236);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62237);return noyMaxSingleProfit;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyMaxSingleProfit(Float noyMaxSingleProfit) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62238);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62239);this.noyMaxSingleProfit = noyMaxSingleProfit;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmMaxSingleProfit() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62240);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62241);return tmMaxSingleProfit;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmMaxSingleProfit(Float tmMaxSingleProfit) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62242);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62243);this.tmMaxSingleProfit = tmMaxSingleProfit;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqMaxSingleProfit() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62244);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62245);return tqMaxSingleProfit;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqMaxSingleProfit(Float tqMaxSingleProfit) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62246);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62247);this.tqMaxSingleProfit = tqMaxSingleProfit;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTyMaxSingleProfit() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62248);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62249);return tyMaxSingleProfit;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyMaxSingleProfit(Float tyMaxSingleProfit) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62250);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62251);this.tyMaxSingleProfit = tyMaxSingleProfit;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllMaxSingleProfit() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62252);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62253);return allMaxSingleProfit;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllMaxSingleProfit(Float allMaxSingleProfit) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62254);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62255);this.allMaxSingleProfit = allMaxSingleProfit;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Integer getNomMaxConProfitTime() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62256);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62257);return nomMaxConProfitTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomMaxConProfitTime(Integer nomMaxConProfitTime) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62258);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62259);this.nomMaxConProfitTime = nomMaxConProfitTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Integer getNhyMaxConProfitTime() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62260);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62261);return nhyMaxConProfitTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyMaxConProfitTime(Integer nhyMaxConProfitTime) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62262);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62263);this.nhyMaxConProfitTime = nhyMaxConProfitTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Integer getNoyMaxConProfitTime() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62264);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62265);return noyMaxConProfitTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyMaxConProfitTime(Integer noyMaxConProfitTime) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62266);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62267);this.noyMaxConProfitTime = noyMaxConProfitTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Integer getTmMaxConProfitTime() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62268);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62269);return tmMaxConProfitTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmMaxConProfitTime(Integer tmMaxConProfitTime) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62270);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62271);this.tmMaxConProfitTime = tmMaxConProfitTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Integer getTqMaxConProfitTime() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62272);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62273);return tqMaxConProfitTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqMaxConProfitTime(Integer tqMaxConProfitTime) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62274);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62275);this.tqMaxConProfitTime = tqMaxConProfitTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Integer getTyMaxConProfitTime() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62276);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62277);return tyMaxConProfitTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyMaxConProfitTime(Integer tyMaxConProfitTime) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62278);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62279);this.tyMaxConProfitTime = tyMaxConProfitTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Integer getAllMaxConProfitTime() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62280);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62281);return allMaxConProfitTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllMaxConProfitTime(Integer allMaxConProfitTime) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62282);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62283);this.allMaxConProfitTime = allMaxConProfitTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Integer getAllMaxConProfitTimeDate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62284);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62285);return allMaxConProfitTimeDate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllMaxConProfitTimeDate(Integer allMaxConProfitTimeDate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62286);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62287);this.allMaxConProfitTimeDate = allMaxConProfitTimeDate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomMaxDrawdown() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62288);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62289);return nomMaxDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomMaxDrawdown(Float nomMaxDrawdown) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62290);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62291);this.nomMaxDrawdown = nomMaxDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhyMaxDrawdown() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62292);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62293);return nhyMaxDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyMaxDrawdown(Float nhyMaxDrawdown) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62294);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62295);this.nhyMaxDrawdown = nhyMaxDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoyMaxDrawdown() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62296);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62297);return noyMaxDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyMaxDrawdown(Float noyMaxDrawdown) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62298);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62299);this.noyMaxDrawdown = noyMaxDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmMaxDrawdown() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62300);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62301);return tmMaxDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmMaxDrawdown(Float tmMaxDrawdown) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62302);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62303);this.tmMaxDrawdown = tmMaxDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqMaxDrawdown() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62304);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62305);return tqMaxDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqMaxDrawdown(Float tqMaxDrawdown) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62306);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62307);this.tqMaxDrawdown = tqMaxDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTyMaxDrawdown() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62308);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62309);return tyMaxDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyMaxDrawdown(Float tyMaxDrawdown) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62310);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62311);this.tyMaxDrawdown = tyMaxDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllMaxDrawdown() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62312);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62313);return allMaxDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllMaxDrawdown(Float allMaxDrawdown) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62314);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62315);this.allMaxDrawdown = allMaxDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Integer getAllMaxDrawdownDate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62316);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62317);return allMaxDrawdownDate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllMaxDrawdownDate(Integer allMaxDrawdownDate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62318);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62319);this.allMaxDrawdownDate = allMaxDrawdownDate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomMaxSingleDrawdown() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62320);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62321);return nomMaxSingleDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomMaxSingleDrawdown(Float nomMaxSingleDrawdown) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62322);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62323);this.nomMaxSingleDrawdown = nomMaxSingleDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhyMaxSingleDrawdown() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62324);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62325);return nhyMaxSingleDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyMaxSingleDrawdown(Float nhyMaxSingleDrawdown) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62326);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62327);this.nhyMaxSingleDrawdown = nhyMaxSingleDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoyMaxSingleDrawdown() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62328);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62329);return noyMaxSingleDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyMaxSingleDrawdown(Float noyMaxSingleDrawdown) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62330);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62331);this.noyMaxSingleDrawdown = noyMaxSingleDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmMaxSingleDrawdown() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62332);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62333);return tmMaxSingleDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmMaxSingleDrawdown(Float tmMaxSingleDrawdown) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62334);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62335);this.tmMaxSingleDrawdown = tmMaxSingleDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqMaxSingleDrawdown() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62336);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62337);return tqMaxSingleDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqMaxSingleDrawdown(Float tqMaxSingleDrawdown) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62338);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62339);this.tqMaxSingleDrawdown = tqMaxSingleDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTyMaxSingleDrawdown() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62340);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62341);return tyMaxSingleDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyMaxSingleDrawdown(Float tyMaxSingleDrawdown) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62342);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62343);this.tyMaxSingleDrawdown = tyMaxSingleDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllMaxSingleDrawdown() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62344);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62345);return allMaxSingleDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllMaxSingleDrawdown(Float allMaxSingleDrawdown) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62346);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62347);this.allMaxSingleDrawdown = allMaxSingleDrawdown;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Integer getAllMaxSingleDrawdownDate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62348);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62349);return allMaxSingleDrawdownDate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllMaxSingleDrawdownDate(Integer allMaxSingleDrawdownDate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62350);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62351);this.allMaxSingleDrawdownDate = allMaxSingleDrawdownDate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Integer getNomMaxConDrawdownTime() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62352);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62353);return nomMaxConDrawdownTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomMaxConDrawdownTime(Integer nomMaxConDrawdownTime) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62354);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62355);this.nomMaxConDrawdownTime = nomMaxConDrawdownTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Integer getNhyMaxConDrawdownTime() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62356);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62357);return nhyMaxConDrawdownTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyMaxConDrawdownTime(Integer nhyMaxConDrawdownTime) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62358);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62359);this.nhyMaxConDrawdownTime = nhyMaxConDrawdownTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Integer getNoyMaxConDrawdownTime() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62360);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62361);return noyMaxConDrawdownTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyMaxConDrawdownTime(Integer noyMaxConDrawdownTime) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62362);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62363);this.noyMaxConDrawdownTime = noyMaxConDrawdownTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Integer getTmMaxConDrawdownTime() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62364);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62365);return tmMaxConDrawdownTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmMaxConDrawdownTime(Integer tmMaxConDrawdownTime) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62366);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62367);this.tmMaxConDrawdownTime = tmMaxConDrawdownTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Integer getTqMaxConDrawdownTime() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62368);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62369);return tqMaxConDrawdownTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqMaxConDrawdownTime(Integer tqMaxConDrawdownTime) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62370);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62371);this.tqMaxConDrawdownTime = tqMaxConDrawdownTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Integer getTyMaxConDrawdownTime() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62372);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62373);return tyMaxConDrawdownTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyMaxConDrawdownTime(Integer tyMaxConDrawdownTime) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62374);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62375);this.tyMaxConDrawdownTime = tyMaxConDrawdownTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Integer getAllMaxConDrawdownTime() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62376);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62377);return allMaxConDrawdownTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllMaxConDrawdownTime(Integer allMaxConDrawdownTime) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62378);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62379);this.allMaxConDrawdownTime = allMaxConDrawdownTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomYieldStdDeviation() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62380);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62381);return nomYieldStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomYieldStdDeviation(Float nomYieldStdDeviation) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62382);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62383);this.nomYieldStdDeviation = nomYieldStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhyYieldStdDeviation() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62384);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62385);return nhyYieldStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyYieldStdDeviation(Float nhyYieldStdDeviation) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62386);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62387);this.nhyYieldStdDeviation = nhyYieldStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoyYieldStdDeviation() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62388);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62389);return noyYieldStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyYieldStdDeviation(Float noyYieldStdDeviation) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62390);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62391);this.noyYieldStdDeviation = noyYieldStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmYieldStdDeviation() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62392);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62393);return tmYieldStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmYieldStdDeviation(Float tmYieldStdDeviation) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62394);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62395);this.tmYieldStdDeviation = tmYieldStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqYieldStdDeviation() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62396);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62397);return tqYieldStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqYieldStdDeviation(Float tqYieldStdDeviation) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62398);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62399);this.tqYieldStdDeviation = tqYieldStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTyYieldStdDeviation() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62400);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62401);return tyYieldStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyYieldStdDeviation(Float tyYieldStdDeviation) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62402);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62403);this.tyYieldStdDeviation = tyYieldStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllYieldStdDeviation() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62404);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62405);return allYieldStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllYieldStdDeviation(Float allYieldStdDeviation) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62406);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62407);this.allYieldStdDeviation = allYieldStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomDownStdDeviation() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62408);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62409);return nomDownStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomDownStdDeviation(Float nomDownStdDeviation) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62410);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62411);this.nomDownStdDeviation = nomDownStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhyDownStdDeviation() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62412);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62413);return nhyDownStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyDownStdDeviation(Float nhyDownStdDeviation) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62414);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62415);this.nhyDownStdDeviation = nhyDownStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoyDownStdDeviation() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62416);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62417);return noyDownStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyDownStdDeviation(Float noyDownStdDeviation) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62418);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62419);this.noyDownStdDeviation = noyDownStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmDownStdDeviation() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62420);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62421);return tmDownStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmDownStdDeviation(Float tmDownStdDeviation) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62422);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62423);this.tmDownStdDeviation = tmDownStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqDownStdDeviation() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62424);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62425);return tqDownStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqDownStdDeviation(Float tqDownStdDeviation) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62426);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62427);this.tqDownStdDeviation = tqDownStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTyDownStdDeviation() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62428);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62429);return tyDownStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyDownStdDeviation(Float tyDownStdDeviation) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62430);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62431);this.tyDownStdDeviation = tyDownStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllDownStdDeviation() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62432);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62433);return allDownStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllDownStdDeviation(Float allDownStdDeviation) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62434);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62435);this.allDownStdDeviation = allDownStdDeviation;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomWinRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62436);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62437);return nomWinRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomWinRatio(Float nomWinRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62438);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62439);this.nomWinRatio = nomWinRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhyWinRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62440);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62441);return nhyWinRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyWinRatio(Float nhyWinRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62442);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62443);this.nhyWinRatio = nhyWinRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoyWinRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62444);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62445);return noyWinRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyWinRatio(Float noyWinRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62446);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62447);this.noyWinRatio = noyWinRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmWinRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62448);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62449);return tmWinRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmWinRatio(Float tmWinRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62450);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62451);this.tmWinRatio = tmWinRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqWinRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62452);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62453);return tqWinRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqWinRatio(Float tqWinRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62454);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62455);this.tqWinRatio = tqWinRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTyWinRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62456);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62457);return tyWinRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyWinRatio(Float tyWinRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62458);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62459);this.tyWinRatio = tyWinRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllWinRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62460);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62461);return allWinRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllWinRatio(Float allWinRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62462);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62463);this.allWinRatio = allWinRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomBeta() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62464);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62465);return nomBeta;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomBeta(Float nomBeta) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62466);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62467);this.nomBeta = nomBeta;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhyBeta() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62468);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62469);return nhyBeta;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyBeta(Float nhyBeta) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62470);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62471);this.nhyBeta = nhyBeta;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoyBeta() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62472);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62473);return noyBeta;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyBeta(Float noyBeta) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62474);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62475);this.noyBeta = noyBeta;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmBeta() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62476);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62477);return tmBeta;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmBeta(Float tmBeta) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62478);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62479);this.tmBeta = tmBeta;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqBeta() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62480);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62481);return tqBeta;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqBeta(Float tqBeta) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62482);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62483);this.tqBeta = tqBeta;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTyBeta() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62484);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62485);return tyBeta;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyBeta(Float tyBeta) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62486);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62487);this.tyBeta = tyBeta;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllBeta() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62488);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62489);return allBeta;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllBeta(Float allBeta) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62490);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62491);this.allBeta = allBeta;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomAlpha() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62492);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62493);return nomAlpha;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomAlpha(Float nomAlpha) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62494);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62495);this.nomAlpha = nomAlpha;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhyAlpha() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62496);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62497);return nhyAlpha;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyAlpha(Float nhyAlpha) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62498);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62499);this.nhyAlpha = nhyAlpha;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoyAlpha() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62500);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62501);return noyAlpha;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyAlpha(Float noyAlpha) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62502);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62503);this.noyAlpha = noyAlpha;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmAlpha() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62504);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62505);return tmAlpha;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmAlpha(Float tmAlpha) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62506);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62507);this.tmAlpha = tmAlpha;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqAlpha() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62508);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62509);return tqAlpha;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqAlpha(Float tqAlpha) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62510);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62511);this.tqAlpha = tqAlpha;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTyAlpha() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62512);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62513);return tyAlpha;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyAlpha(Float tyAlpha) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62514);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62515);this.tyAlpha = tyAlpha;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllAlpha() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62516);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62517);return allAlpha;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllAlpha(Float allAlpha) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62518);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62519);this.allAlpha = allAlpha;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomJansen() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62520);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62521);return nomJansen;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomJansen(Float nomJansen) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62522);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62523);this.nomJansen = nomJansen;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhyJansen() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62524);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62525);return nhyJansen;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyJansen(Float nhyJansen) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62526);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62527);this.nhyJansen = nhyJansen;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoyJansen() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62528);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62529);return noyJansen;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyJansen(Float noyJansen) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62530);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62531);this.noyJansen = noyJansen;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmJansen() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62532);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62533);return tmJansen;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmJansen(Float tmJansen) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62534);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62535);this.tmJansen = tmJansen;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqJansen() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62536);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62537);return tqJansen;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqJansen(Float tqJansen) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62538);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62539);this.tqJansen = tqJansen;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTyJansen() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62540);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62541);return tyJansen;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyJansen(Float tyJansen) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62542);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62543);this.tyJansen = tyJansen;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllJansen() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62544);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62545);return allJansen;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllJansen(Float allJansen) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62546);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62547);this.allJansen = allJansen;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomKumarRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62548);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62549);return nomKumarRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomKumarRatio(Float nomKumarRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62550);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62551);this.nomKumarRatio = nomKumarRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhyKumarRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62552);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62553);return nhyKumarRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyKumarRatio(Float nhyKumarRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62554);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62555);this.nhyKumarRatio = nhyKumarRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoyKumarRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62556);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62557);return noyKumarRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyKumarRatio(Float noyKumarRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62558);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62559);this.noyKumarRatio = noyKumarRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmKumarRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62560);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62561);return tmKumarRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmKumarRatio(Float tmKumarRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62562);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62563);this.tmKumarRatio = tmKumarRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqKumarRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62564);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62565);return tqKumarRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqKumarRatio(Float tqKumarRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62566);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62567);this.tqKumarRatio = tqKumarRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTyKumarRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62568);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62569);return tyKumarRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyKumarRatio(Float tyKumarRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62570);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62571);this.tyKumarRatio = tyKumarRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllKumarRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62572);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62573);return allKumarRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllKumarRatio(Float allKumarRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62574);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62575);this.allKumarRatio = allKumarRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomSharpeRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62576);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62577);return nomSharpeRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomSharpeRatio(Float nomSharpeRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62578);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62579);this.nomSharpeRatio = nomSharpeRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhySharpeRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62580);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62581);return nhySharpeRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhySharpeRatio(Float nhySharpeRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62582);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62583);this.nhySharpeRatio = nhySharpeRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoySharpeRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62584);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62585);return noySharpeRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoySharpeRatio(Float noySharpeRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62586);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62587);this.noySharpeRatio = noySharpeRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmSharpeRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62588);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62589);return tmSharpeRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmSharpeRatio(Float tmSharpeRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62590);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62591);this.tmSharpeRatio = tmSharpeRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqSharpeRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62592);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62593);return tqSharpeRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqSharpeRatio(Float tqSharpeRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62594);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62595);this.tqSharpeRatio = tqSharpeRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTySharpeRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62596);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62597);return tySharpeRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTySharpeRatio(Float tySharpeRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62598);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62599);this.tySharpeRatio = tySharpeRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllSharpeRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62600);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62601);return allSharpeRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllSharpeRatio(Float allSharpeRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62602);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62603);this.allSharpeRatio = allSharpeRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomSortinoRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62604);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62605);return nomSortinoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomSortinoRatio(Float nomSortinoRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62606);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62607);this.nomSortinoRatio = nomSortinoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhySortinoRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62608);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62609);return nhySortinoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhySortinoRatio(Float nhySortinoRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62610);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62611);this.nhySortinoRatio = nhySortinoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoySortinoRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62612);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62613);return noySortinoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoySortinoRatio(Float noySortinoRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62614);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62615);this.noySortinoRatio = noySortinoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmSortinoRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62616);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62617);return tmSortinoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmSortinoRatio(Float tmSortinoRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62618);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62619);this.tmSortinoRatio = tmSortinoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqSortinoRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62620);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62621);return tqSortinoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqSortinoRatio(Float tqSortinoRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62622);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62623);this.tqSortinoRatio = tqSortinoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTySortinoRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62624);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62625);return tySortinoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTySortinoRatio(Float tySortinoRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62626);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62627);this.tySortinoRatio = tySortinoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllSortinoRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62628);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62629);return allSortinoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllSortinoRatio(Float allSortinoRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62630);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62631);this.allSortinoRatio = allSortinoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomHurstIndex() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62632);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62633);return nomHurstIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomHurstIndex(Float nomHurstIndex) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62634);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62635);this.nomHurstIndex = nomHurstIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhyHurstIndex() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62636);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62637);return nhyHurstIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyHurstIndex(Float nhyHurstIndex) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62638);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62639);this.nhyHurstIndex = nhyHurstIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoyHurstIndex() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62640);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62641);return noyHurstIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyHurstIndex(Float noyHurstIndex) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62642);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62643);this.noyHurstIndex = noyHurstIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmHurstIndex() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62644);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62645);return tmHurstIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmHurstIndex(Float tmHurstIndex) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62646);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62647);this.tmHurstIndex = tmHurstIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqHurstIndex() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62648);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62649);return tqHurstIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqHurstIndex(Float tqHurstIndex) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62650);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62651);this.tqHurstIndex = tqHurstIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTyHurstIndex() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62652);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62653);return tyHurstIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyHurstIndex(Float tyHurstIndex) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62654);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62655);this.tyHurstIndex = tyHurstIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllHurstIndex() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62656);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62657);return allHurstIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllHurstIndex(Float allHurstIndex) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62658);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62659);this.allHurstIndex = allHurstIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomVarIndex() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62660);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62661);return nomVarIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomVarIndex(Float nomVarIndex) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62662);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62663);this.nomVarIndex = nomVarIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhyVarIndex() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62664);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62665);return nhyVarIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyVarIndex(Float nhyVarIndex) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62666);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62667);this.nhyVarIndex = nhyVarIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoyVarIndex() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62668);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62669);return noyVarIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyVarIndex(Float noyVarIndex) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62670);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62671);this.noyVarIndex = noyVarIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmVarIndex() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62672);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62673);return tmVarIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmVarIndex(Float tmVarIndex) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62674);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62675);this.tmVarIndex = tmVarIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqVarIndex() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62676);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62677);return tqVarIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqVarIndex(Float tqVarIndex) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62678);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62679);this.tqVarIndex = tqVarIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTyVarIndex() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62680);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62681);return tyVarIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyVarIndex(Float tyVarIndex) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62682);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62683);this.tyVarIndex = tyVarIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllVarIndex() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62684);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62685);return allVarIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllVarIndex(Float allVarIndex) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62686);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62687);this.allVarIndex = allVarIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomVarIndex99() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62688);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62689);return nomVarIndex99;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomVarIndex99(Float nomVarIndex99) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62690);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62691);this.nomVarIndex99 = nomVarIndex99;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhyVarIndex99() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62692);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62693);return nhyVarIndex99;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyVarIndex99(Float nhyVarIndex99) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62694);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62695);this.nhyVarIndex99 = nhyVarIndex99;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoyVarIndex99() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62696);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62697);return noyVarIndex99;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyVarIndex99(Float noyVarIndex99) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62698);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62699);this.noyVarIndex99 = noyVarIndex99;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmVarIndex99() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62700);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62701);return tmVarIndex99;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmVarIndex99(Float tmVarIndex99) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62702);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62703);this.tmVarIndex99 = tmVarIndex99;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqVarIndex99() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62704);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62705);return tqVarIndex99;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqVarIndex99(Float tqVarIndex99) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62706);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62707);this.tqVarIndex99 = tqVarIndex99;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTyVarIndex99() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62708);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62709);return tyVarIndex99;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyVarIndex99(Float tyVarIndex99) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62710);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62711);this.tyVarIndex99 = tyVarIndex99;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllVarIndex99() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62712);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62713);return allVarIndex99;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllVarIndex99(Float allVarIndex99) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62714);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62715);this.allVarIndex99 = allVarIndex99;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomUpCaptureRate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62716);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62717);return nomUpCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomUpCaptureRate(Float nomUpCaptureRate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62718);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62719);this.nomUpCaptureRate = nomUpCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhyUpCaptureRate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62720);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62721);return nhyUpCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyUpCaptureRate(Float nhyUpCaptureRate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62722);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62723);this.nhyUpCaptureRate = nhyUpCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoyUpCaptureRate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62724);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62725);return noyUpCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyUpCaptureRate(Float noyUpCaptureRate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62726);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62727);this.noyUpCaptureRate = noyUpCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmUpCaptureRate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62728);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62729);return tmUpCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmUpCaptureRate(Float tmUpCaptureRate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62730);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62731);this.tmUpCaptureRate = tmUpCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqUpCaptureRate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62732);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62733);return tqUpCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqUpCaptureRate(Float tqUpCaptureRate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62734);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62735);this.tqUpCaptureRate = tqUpCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTyUpCaptureRate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62736);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62737);return tyUpCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyUpCaptureRate(Float tyUpCaptureRate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62738);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62739);this.tyUpCaptureRate = tyUpCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllUpCaptureRate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62740);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62741);return allUpCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllUpCaptureRate(Float allUpCaptureRate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62742);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62743);this.allUpCaptureRate = allUpCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomDownCaptureRate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62744);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62745);return nomDownCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomDownCaptureRate(Float nomDownCaptureRate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62746);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62747);this.nomDownCaptureRate = nomDownCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhyDownCaptureRate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62748);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62749);return nhyDownCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyDownCaptureRate(Float nhyDownCaptureRate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62750);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62751);this.nhyDownCaptureRate = nhyDownCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoyDownCaptureRate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62752);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62753);return noyDownCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyDownCaptureRate(Float noyDownCaptureRate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62754);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62755);this.noyDownCaptureRate = noyDownCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmDownCaptureRate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62756);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62757);return tmDownCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmDownCaptureRate(Float tmDownCaptureRate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62758);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62759);this.tmDownCaptureRate = tmDownCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqDownCaptureRate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62760);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62761);return tqDownCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqDownCaptureRate(Float tqDownCaptureRate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62762);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62763);this.tqDownCaptureRate = tqDownCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTyDownCaptureRate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62764);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62765);return tyDownCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyDownCaptureRate(Float tyDownCaptureRate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62766);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62767);this.tyDownCaptureRate = tyDownCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllDownCaptureRate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62768);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62769);return allDownCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllDownCaptureRate(Float allDownCaptureRate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62770);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62771);this.allDownCaptureRate = allDownCaptureRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomInfoRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62772);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62773);return nomInfoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomInfoRatio(Float nomInfoRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62774);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62775);this.nomInfoRatio = nomInfoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhyInfoRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62776);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62777);return nhyInfoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyInfoRatio(Float nhyInfoRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62778);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62779);this.nhyInfoRatio = nhyInfoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoyInfoRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62780);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62781);return noyInfoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyInfoRatio(Float noyInfoRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62782);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62783);this.noyInfoRatio = noyInfoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmInfoRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62784);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62785);return tmInfoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmInfoRatio(Float tmInfoRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62786);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62787);this.tmInfoRatio = tmInfoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqInfoRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62788);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62789);return tqInfoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqInfoRatio(Float tqInfoRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62790);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62791);this.tqInfoRatio = tqInfoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTyInfoRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62792);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62793);return tyInfoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyInfoRatio(Float tyInfoRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62794);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62795);this.tyInfoRatio = tyInfoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllInfoRatio() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62796);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62797);return allInfoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllInfoRatio(Float allInfoRatio) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62798);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62799);this.allInfoRatio = allInfoRatio;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomAlgorithmVolatility() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62800);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62801);return nomAlgorithmVolatility;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomAlgorithmVolatility(Float nomAlgorithmVolatility) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62802);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62803);this.nomAlgorithmVolatility = nomAlgorithmVolatility;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhyAlgorithmVolatility() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62804);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62805);return nhyAlgorithmVolatility;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyAlgorithmVolatility(Float nhyAlgorithmVolatility) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62806);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62807);this.nhyAlgorithmVolatility = nhyAlgorithmVolatility;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoyAlgorithmVolatility() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62808);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62809);return noyAlgorithmVolatility;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyAlgorithmVolatility(Float noyAlgorithmVolatility) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62810);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62811);this.noyAlgorithmVolatility = noyAlgorithmVolatility;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmAlgorithmVolatility() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62812);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62813);return tmAlgorithmVolatility;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmAlgorithmVolatility(Float tmAlgorithmVolatility) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62814);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62815);this.tmAlgorithmVolatility = tmAlgorithmVolatility;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqAlgorithmVolatility() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62816);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62817);return tqAlgorithmVolatility;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqAlgorithmVolatility(Float tqAlgorithmVolatility) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62818);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62819);this.tqAlgorithmVolatility = tqAlgorithmVolatility;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTyAlgorithmVolatility() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62820);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62821);return tyAlgorithmVolatility;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyAlgorithmVolatility(Float tyAlgorithmVolatility) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62822);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62823);this.tyAlgorithmVolatility = tyAlgorithmVolatility;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllAlgorithmVolatility() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62824);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62825);return allAlgorithmVolatility;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllAlgorithmVolatility(Float allAlgorithmVolatility) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62826);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62827);this.allAlgorithmVolatility = allAlgorithmVolatility;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomMSquare() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62828);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62829);return nomMSquare;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomMSquare(Float nomMSquare) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62830);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62831);this.nomMSquare = nomMSquare;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhyMSquare() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62832);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62833);return nhyMSquare;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyMSquare(Float nhyMSquare) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62834);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62835);this.nhyMSquare = nhyMSquare;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoyMSquare() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62836);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62837);return noyMSquare;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyMSquare(Float noyMSquare) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62838);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62839);this.noyMSquare = noyMSquare;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmMSquare() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62840);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62841);return tmMSquare;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmMSquare(Float tmMSquare) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62842);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62843);this.tmMSquare = tmMSquare;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqMSquare() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62844);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62845);return tqMSquare;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqMSquare(Float tqMSquare) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62846);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62847);this.tqMSquare = tqMSquare;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTyMSquare() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62848);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62849);return tyMSquare;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyMSquare(Float tyMSquare) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62850);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62851);this.tyMSquare = tyMSquare;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllMSquare() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62852);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62853);return allMSquare;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllMSquare(Float allMSquare) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62854);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62855);this.allMSquare = allMSquare;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNomTreynorIndex() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62856);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62857);return nomTreynorIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNomTreynorIndex(Float nomTreynorIndex) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62858);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62859);this.nomTreynorIndex = nomTreynorIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNhyTreynorIndex() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62860);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62861);return nhyTreynorIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNhyTreynorIndex(Float nhyTreynorIndex) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62862);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62863);this.nhyTreynorIndex = nhyTreynorIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getNoyTreynorIndex() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62864);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62865);return noyTreynorIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNoyTreynorIndex(Float noyTreynorIndex) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62866);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62867);this.noyTreynorIndex = noyTreynorIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTmTreynorIndex() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62868);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62869);return tmTreynorIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTmTreynorIndex(Float tmTreynorIndex) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62870);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62871);this.tmTreynorIndex = tmTreynorIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTqTreynorIndex() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62872);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62873);return tqTreynorIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTqTreynorIndex(Float tqTreynorIndex) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62874);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62875);this.tqTreynorIndex = tqTreynorIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getTyTreynorIndex() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62876);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62877);return tyTreynorIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTyTreynorIndex(Float tyTreynorIndex) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62878);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62879);this.tyTreynorIndex = tyTreynorIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getAllTreynorIndex() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62880);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62881);return allTreynorIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setAllTreynorIndex(Float allTreynorIndex) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62882);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62883);this.allTreynorIndex = allTreynorIndex;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getId() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62884);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62885);return id;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setId(String id) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62886);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62887);this.id = id;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62888);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62889);return name;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62890);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62891);this.name = name;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getShortName() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62892);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62893);return shortName;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setShortName(String shortName) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62894);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62895);this.shortName = shortName;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getCode() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62896);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62897);return code;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setCode(String code) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62898);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62899);this.code = code;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getRecordNumber() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62900);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62901);return recordNumber;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setRecordNumber(String recordNumber) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62902);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62903);this.recordNumber = recordNumber;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Byte getFundType() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62904);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62905);return fundType;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setFundType(Byte fundType) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62906);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62907);this.fundType = fundType;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Byte getFundBreed() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62908);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62909);return fundBreed;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setFundBreed(Byte fundBreed) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62910);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62911);this.fundBreed = fundBreed;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Byte getFundStatus() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62912);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62913);return fundStatus;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setFundStatus(Byte fundStatus) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62914);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62915);this.fundStatus = fundStatus;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getBuyStatus() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62916);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62917);return buyStatus;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setBuyStatus(String buyStatus) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62918);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62919);this.buyStatus = buyStatus;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getRedeemStatus() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62920);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62921);return redeemStatus;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setRedeemStatus(String redeemStatus) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62922);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62923);this.redeemStatus = redeemStatus;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getRecordDate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62924);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62925);return recordDate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setRecordDate(String recordDate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62926);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62927);this.recordDate = recordDate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getCreateDate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62928);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62929);return createDate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setCreateDate(String createDate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62930);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62931);this.createDate = createDate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getStopDate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62932);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62933);return stopDate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setStopDate(String stopDate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62934);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62935);this.stopDate = stopDate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getFundFilingStage() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62936);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62937);return fundFilingStage;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setFundFilingStage(String fundFilingStage) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62938);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62939);this.fundFilingStage = fundFilingStage;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getFundInvestmentType() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62940);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62941);return fundInvestmentType;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setFundInvestmentType(String fundInvestmentType) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62942);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62943);this.fundInvestmentType = fundInvestmentType;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getCurrency() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62944);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62945);return currency;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setCurrency(String currency) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62946);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62947);this.currency = currency;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getManagerType() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62948);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62949);return managerType;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setManagerType(String managerType) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62950);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62951);this.managerType = managerType;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getManagerName() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62952);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62953);return managerName;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setManagerName(String managerName) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62954);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62955);this.managerName = managerName;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getInvestmentTarget() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62956);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62957);return investmentTarget;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setInvestmentTarget(String investmentTarget) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62958);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62959);this.investmentTarget = investmentTarget;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getMajorInvestAreas() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62960);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62961);return majorInvestAreas;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setMajorInvestAreas(String majorInvestAreas) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62962);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62963);this.majorInvestAreas = majorInvestAreas;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getFundLastModifyDate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62964);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62965);return fundLastModifyDate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setFundLastModifyDate(String fundLastModifyDate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62966);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62967);this.fundLastModifyDate = fundLastModifyDate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getSpecialNote() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62968);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62969);return specialNote;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setSpecialNote(String specialNote) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62970);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62971);this.specialNote = specialNote;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getRegisteredAddress() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62972);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62973);return registeredAddress;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setRegisteredAddress(String registeredAddress) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62974);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62975);this.registeredAddress = registeredAddress;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getInvestmentStrategy() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62976);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62977);return investmentStrategy;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setInvestmentStrategy(String investmentStrategy) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62978);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62979);this.investmentStrategy = investmentStrategy;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getInvestmentSubStrategy() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62980);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62981);return investmentSubStrategy;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setInvestmentSubStrategy(String investmentSubStrategy) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62982);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62983);this.investmentSubStrategy = investmentSubStrategy;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public List<String> getFundManagerIds() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62984);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62985);return fundManagerIds;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setFundManagerIds(List<String> fundManagerIds) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62986);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62987);this.fundManagerIds = fundManagerIds;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getCompanyId() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62988);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62989);return companyId;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setCompanyId(String companyId) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62990);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62991);this.companyId = companyId;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Long getOrderNum() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62992);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62993);return orderNum;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setOrderNum(Long orderNum) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62994);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62995);this.orderNum = orderNum;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getCreateScale() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62996);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62997);return createScale;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setCreateScale(String createScale) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(62998);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(62999);this.createScale = createScale;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getLatestScale() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63000);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63001);return latestScale;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setLatestScale(String latestScale) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63002);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63003);this.latestScale = latestScale;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getBenchmark() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63004);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63005);return benchmark;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setBenchmark(String benchmark) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63006);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63007);this.benchmark = benchmark;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Byte getNetValueUpdateRate() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63008);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63009);return netValueUpdateRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNetValueUpdateRate(Byte netValueUpdateRate) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63010);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63011);this.netValueUpdateRate = netValueUpdateRate;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getFundOuterId() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63012);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63013);return fundOuterId;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setFundOuterId(String fundOuterId) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63014);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63015);this.fundOuterId = fundOuterId;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getTags() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63016);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63017);return tags;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTags(String tags) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63018);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63019);this.tags = tags;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getRemark() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63020);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63021);return remark;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setRemark(String remark) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63022);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63023);this.remark = remark;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getStrategyCapacity() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63024);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63025);return strategyCapacity;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setStrategyCapacity(String strategyCapacity) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63026);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63027);this.strategyCapacity = strategyCapacity;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Long getCreateTime() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63028);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63029);return createTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setCreateTime(Long createTime) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63030);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63031);this.createTime = createTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getCreatorId() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63032);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63033);return creatorId;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setCreatorId(String creatorId) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63034);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63035);this.creatorId = creatorId;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Long getLastModifyTime() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63036);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63037);return lastModifyTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setLastModifyTime(Long lastModifyTime) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63038);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63039);this.lastModifyTime = lastModifyTime;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getLastModifierId() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63040);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63041);return lastModifierId;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setLastModifierId(String lastModifierId) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63042);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63043);this.lastModifierId = lastModifierId;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getCompanyOuterId() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63044);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63045);return companyOuterId;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setCompanyOuterId(String companyOuterId) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63046);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63047);this.companyOuterId = companyOuterId;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getCompanyName() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63048);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63049);return companyName;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setCompanyName(String companyName) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63050);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63051);this.companyName = companyName;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public List<String> getManagerOuterIds() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63052);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63053);return managerOuterIds;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setManagerOuterIds(List<String> managerOuterIds) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63054);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63055);this.managerOuterIds = managerOuterIds;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public List<String> getFundIds() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63056);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63057);return fundIds;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setFundIds(List<String> fundIds) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63058);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63059);this.fundIds = fundIds;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public List<String> getCompanyIds() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63060);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63061);return companyIds;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setCompanyIds(List<String> companyIds) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63062);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63063);this.companyIds = companyIds;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getStartAnnualizedReturn() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63064);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63065);return startAnnualizedReturn;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setStartAnnualizedReturn(Float startAnnualizedReturn) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63066);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63067);this.startAnnualizedReturn = startAnnualizedReturn;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getEndAnnualizedReturn() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63068);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63069);return endAnnualizedReturn;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setEndAnnualizedReturn(Float endAnnualizedReturn) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63070);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63071);this.endAnnualizedReturn = endAnnualizedReturn;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getTimeInterval() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63072);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63073);return timeInterval;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTimeInterval(String timeInterval) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63074);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63075);this.timeInterval = timeInterval;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public List<String> getFundManagerNames() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63076);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63077);return fundManagerNames;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setFundManagerNames(List<String> fundManagerNames) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63078);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63079);this.fundManagerNames = fundManagerNames;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getFundStatusName() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63080);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63081);return fundStatusName;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setFundStatusName(String fundStatusName) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63082);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63083);this.fundStatusName = fundStatusName;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getFundTypeName() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63084);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63085);return fundTypeName;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setFundTypeName(String fundTypeName) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63086);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63087);this.fundTypeName = fundTypeName;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Byte getIsConcern() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63088);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63089);return isConcern;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setIsConcern(Byte isConcern) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63090);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63091);this.isConcern = isConcern;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public Float getConfigWeight() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63092);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63093);return configWeight;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setConfigWeight(Float configWeight) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63094);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63095);this.configWeight = configWeight;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getNetValueDateString() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63096);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63097);return netValueDateString;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setNetValueDateString(String netValueDateString) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63098);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63099);this.netValueDateString = netValueDateString;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getManagerId() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63100);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63101);return managerId;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setManagerId(String managerId) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63102);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63103);this.managerId = managerId;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public String getTagId() {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63104);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63105);return tagId;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}

        public void setTagId(String tagId) {try{__CLR4_5_21bvw1bvwlusvnac5.R.inc(63106);
            __CLR4_5_21bvw1bvwlusvnac5.R.inc(63107);this.tagId = tagId;
        }finally{__CLR4_5_21bvw1bvwlusvnac5.R.flushNeeded();}}
    }
}