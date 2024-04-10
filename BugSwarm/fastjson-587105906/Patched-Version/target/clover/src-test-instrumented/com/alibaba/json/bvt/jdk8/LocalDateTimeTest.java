/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.jdk8;

import java.time.LocalDateTime;

import com.alibaba.fastjson.serializer.SerializerFeature;
import org.junit.Assert;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class LocalDateTimeTest extends TestCase {static class __CLR4_5_21e0b1e0blusyjt9b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,64838,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_5_21e0b1e0blusyjt9b.R.globalSliceStart(getClass().getName(),64811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1e0b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e0b1e0blusyjt9b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e0b1e0blusyjt9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64811,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1e0b() throws Exception{try{__CLR4_5_21e0b1e0blusyjt9b.R.inc(64811);
        __CLR4_5_21e0b1e0blusyjt9b.R.inc(64812);VO vo = new VO();
        __CLR4_5_21e0b1e0blusyjt9b.R.inc(64813);vo.setDate(LocalDateTime.now().minusNanos(10L));
        
        __CLR4_5_21e0b1e0blusyjt9b.R.inc(64814);String text = JSON.toJSONString(vo);
        
        __CLR4_5_21e0b1e0blusyjt9b.R.inc(64815);VO vo1 = JSON.parseObject(text, VO.class);
        
        __CLR4_5_21e0b1e0blusyjt9b.R.inc(64816);Assert.assertEquals(JSON.toJSONString(vo.getDate()), JSON.toJSONString(vo1.getDate()));
    }finally{__CLR4_5_21e0b1e0blusyjt9b.R.flushNeeded();}}

    /**
     * \u65b9\u6cd5\u63cf\u8ff0: \u6d4b\u8bd5LocalDateTime \u8f6c\u5316\u65f6\u95f4\u6233\u7b49 \u64cd\u4f5c
     *  \u95ee\u9898\u70b91\u3001 LocalDateTime \u8fdb\u6765\u7684\u503c\u65e0\u6cd5\u786e\u5b9a\u5176\u65f6\u533a,\u6240\u4ee5\u6b64\u5904\u7edf\u4e00\u6309\u7740\u7cfb\u7edf\u65f6\u533a\u8d70\u3002
     *  \u95ee\u9898\u70b92\u3001 \u5982\u679c\u8bbe\u7f6e SerializerFeature.WriteDateUseDateFormat \u65f6\u6309\u7740 "yyyy-MM-dd HH:mm:ss" \u8fdb\u884c\u683c\u5f0f\u5316
     *  \u95ee\u9898\u70b93\uff1a  \u5982\u679c\u8bbe\u7f6e SerializerFeature.UseISO8601DateFormat \u65f6\u6309\u7740ISO8601\u7684\u6807\u51c6 "yyyy-MM-dd'T'HH:mm:ss"\u8fdb\u884c\u683c\u5f0f\u5316
     *  \u95ee\u9898\u70b94:
     *      1)\u683c\u5f0f\u5316LocalDateTime\u65f6\uff0c \u9ed8\u8ba4\u683c\u5f0f\u6210 \u65f6\u95f4\u6233\u683c\u5f0f\uff0c
     *      2)\u5982\u8bbe\u7f6eWriteDateUseDateFormat \u6309 "yyyy-MM-dd HH:mm:ss" \u8fdb\u884c\u683c\u5f0f\u5316
     *      3)\u5982\u8bbe\u7f6eUseISO8601DateFormat \u6309ISO8601\u7684\u6807\u51c6 "yyyy-MM-dd'T'HH:mm:ss"\u8fdb\u884c\u683c\u5f0f\u5316
     *      4)\u5982\u8bbe\u7f6eWriteDateUseDateFormat\u3001UseISO8601DateFormat \u540c\u65f6\u8bbe\u7f6e,\u5219\u6309ISO8601\u7684\u6807\u51c6 "yyyy-MM-dd'T'HH:mm:ss"\u8fdb\u884c\u683c\u5f0f\u5316
     * @author wuqiong  2017/11/22 15:08
     */
    public void test_toJsonString_ofLong()throws Exception {__CLR4_5_21e0b1e0blusyjt9b.R.globalSliceStart(getClass().getName(),64817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vo117s1e0h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e0b1e0blusyjt9b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e0b1e0blusyjt9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest.test_toJsonString_ofLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64817,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vo117s1e0h()throws Exception{try{__CLR4_5_21e0b1e0blusyjt9b.R.inc(64817);
        __CLR4_5_21e0b1e0blusyjt9b.R.inc(64818);VO vo = new VO();
        __CLR4_5_21e0b1e0blusyjt9b.R.inc(64819);vo.setDate(LocalDateTime.now());

        __CLR4_5_21e0b1e0blusyjt9b.R.inc(64820);VO vo1 = JSON.parseObject("{\"date\":1511334591189}", VO.class);

        __CLR4_5_21e0b1e0blusyjt9b.R.inc(64821);String text2 = JSON.toJSONString(vo, SerializerFeature.WriteDateUseDateFormat);
        __CLR4_5_21e0b1e0blusyjt9b.R.inc(64822);System.out.println(text2);//{"date":"2017-11-22 15:09:51"}
        __CLR4_5_21e0b1e0blusyjt9b.R.inc(64823);VO vo2 = JSON.parseObject(text2, VO.class);

        __CLR4_5_21e0b1e0blusyjt9b.R.inc(64824);String text3 = JSON.toJSONString(vo, SerializerFeature.UseISO8601DateFormat);
        __CLR4_5_21e0b1e0blusyjt9b.R.inc(64825);System.out.println(text3);//{"date":"2017-11-22T15:09:51"}
        __CLR4_5_21e0b1e0blusyjt9b.R.inc(64826);VO vo3 = JSON.parseObject(text3, VO.class);

        __CLR4_5_21e0b1e0blusyjt9b.R.inc(64827);String text4 = JSON.toJSONString(vo, SerializerFeature.UseISO8601DateFormat, SerializerFeature.WriteDateUseDateFormat);
        __CLR4_5_21e0b1e0blusyjt9b.R.inc(64828);System.out.println(text4);//{"date":"2017-11-22T15:09:51"}
        __CLR4_5_21e0b1e0blusyjt9b.R.inc(64829);VO vo4 = JSON.parseObject(text4, VO.class);
    }finally{__CLR4_5_21e0b1e0blusyjt9b.R.flushNeeded();}}

    public  void test_for_issue_1() throws Exception {__CLR4_5_21e0b1e0blusyjt9b.R.globalSliceStart(getClass().getName(),64830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uhstn51e0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e0b1e0blusyjt9b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e0b1e0blusyjt9b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTimeTest.test_for_issue_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64830,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uhstn51e0u() throws Exception{try{__CLR4_5_21e0b1e0blusyjt9b.R.inc(64830);
        __CLR4_5_21e0b1e0blusyjt9b.R.inc(64831);String text = "{\"date\":\"2018-08-03 22:38:33.145\"}";
        __CLR4_5_21e0b1e0blusyjt9b.R.inc(64832);VO vo1 = JSON.parseObject(text, VO.class);
        __CLR4_5_21e0b1e0blusyjt9b.R.inc(64833);assertNotNull(vo1.date);
    }finally{__CLR4_5_21e0b1e0blusyjt9b.R.flushNeeded();}}

    public static class VO {

        private LocalDateTime date;

        public LocalDateTime getDate() {try{__CLR4_5_21e0b1e0blusyjt9b.R.inc(64834);
            __CLR4_5_21e0b1e0blusyjt9b.R.inc(64835);return date;
        }finally{__CLR4_5_21e0b1e0blusyjt9b.R.flushNeeded();}}

        public void setDate(LocalDateTime date) {try{__CLR4_5_21e0b1e0blusyjt9b.R.inc(64836);
            __CLR4_5_21e0b1e0blusyjt9b.R.inc(64837);this.date = date;
        }finally{__CLR4_5_21e0b1e0blusyjt9b.R.flushNeeded();}}

    }
}
