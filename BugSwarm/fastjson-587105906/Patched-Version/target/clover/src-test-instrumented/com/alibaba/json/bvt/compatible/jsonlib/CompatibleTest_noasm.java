/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.compatible.jsonlib;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONLibDataFormatSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class CompatibleTest_noasm extends TestCase {static class __CLR4_5_219ap19aplusvn8z2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,58868,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected void setUp() throws Exception {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58705);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58706);System.out.println();
    }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_5_219ap19aplusvn8z2.R.globalSliceStart(getClass().getName(),58707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp219ar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219ap19aplusvn8z2.R.rethrow($CLV_t2$);}finally{__CLR4_5_219ap19aplusvn8z2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58707,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp219ar() throws Exception{try{__CLR4_5_219ap19aplusvn8z2.R.inc(58707);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58708);Map<String, Object> obj = new HashMap<String, Object>();
        __CLR4_5_219ap19aplusvn8z2.R.inc(58709);assertEquals(toCompatibleJSONString(obj), toJSONLibString(obj));
    }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_219ap19aplusvn8z2.R.globalSliceStart(getClass().getName(),58710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl19au();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219ap19aplusvn8z2.R.rethrow($CLV_t2$);}finally{__CLR4_5_219ap19aplusvn8z2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58710,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl19au() throws Exception{try{__CLR4_5_219ap19aplusvn8z2.R.inc(58710);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58711);VO vo = new VO();
        __CLR4_5_219ap19aplusvn8z2.R.inc(58712);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_219ap19aplusvn8z2.R.globalSliceStart(getClass().getName(),58713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k4419ax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219ap19aplusvn8z2.R.rethrow($CLV_t2$);}finally{__CLR4_5_219ap19aplusvn8z2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58713,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k4419ax() throws Exception{try{__CLR4_5_219ap19aplusvn8z2.R.inc(58713);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58714);V1 vo = new V1();
        __CLR4_5_219ap19aplusvn8z2.R.inc(58715);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

    // {"media":{"size":58982400,"format":"video/mpg4","uri":"http://javaone.com/keynote.mpg","title":"Javaone Keynote","width":640,"height":480,"duration":18000000,"bitrate":262144,"persons":["Bill Gates","Steve Jobs"],"player":"JAVA"}{"images":[{"size":"LARGE","uri":"http://javaone.com/keynote_large.jpg","title":"Javaone Keynote","width":1024,"height":768},{"size":"SMALL","uri":"http://javaone.com/keynote_small.jpg","title":"Javaone Keynote","width":320,"height":240}]}

    public void test_3() throws Exception {__CLR4_5_219ap19aplusvn8z2.R.globalSliceStart(getClass().getName(),58716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn19b0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219ap19aplusvn8z2.R.rethrow($CLV_t2$);}finally{__CLR4_5_219ap19aplusvn8z2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58716,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn19b0() throws Exception{try{__CLR4_5_219ap19aplusvn8z2.R.inc(58716);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58717);V1 vo = new V1();
        __CLR4_5_219ap19aplusvn8z2.R.inc(58718);vo.setDate(new Date());
        __CLR4_5_219ap19aplusvn8z2.R.inc(58719);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_219ap19aplusvn8z2.R.globalSliceStart(getClass().getName(),58720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj619b4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219ap19aplusvn8z2.R.rethrow($CLV_t2$);}finally{__CLR4_5_219ap19aplusvn8z2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58720,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj619b4() throws Exception{try{__CLR4_5_219ap19aplusvn8z2.R.inc(58720);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58721);V1 vo = new V1();
        __CLR4_5_219ap19aplusvn8z2.R.inc(58722);vo.setF2('\u4e2d');
        __CLR4_5_219ap19aplusvn8z2.R.inc(58723);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_219ap19aplusvn8z2.R.globalSliceStart(getClass().getName(),58724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp19b8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219ap19aplusvn8z2.R.rethrow($CLV_t2$);}finally{__CLR4_5_219ap19aplusvn8z2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58724,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp19b8() throws Exception{try{__CLR4_5_219ap19aplusvn8z2.R.inc(58724);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58725);V2 vo = new V2();
        __CLR4_5_219ap19aplusvn8z2.R.inc(58726);vo.setF1(1.1f);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58727);vo.setF2(2.2);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58728);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_5_219ap19aplusvn8z2.R.globalSliceStart(getClass().getName(),58729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy819bd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219ap19aplusvn8z2.R.rethrow($CLV_t2$);}finally{__CLR4_5_219ap19aplusvn8z2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58729,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy819bd() throws Exception{try{__CLR4_5_219ap19aplusvn8z2.R.inc(58729);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58730);V2 vo = new V2();

        __CLR4_5_219ap19aplusvn8z2.R.inc(58731);vo.setF1(0.1f);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58732);vo.setF2(3.3);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58733);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_5_219ap19aplusvn8z2.R.globalSliceStart(getClass().getName(),58734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r19bi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219ap19aplusvn8z2.R.rethrow($CLV_t2$);}finally{__CLR4_5_219ap19aplusvn8z2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58734,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r19bi() throws Exception{try{__CLR4_5_219ap19aplusvn8z2.R.inc(58734);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58735);V2 vo = new V2();
        __CLR4_5_219ap19aplusvn8z2.R.inc(58736);vo.setF1(1.1f);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58737);vo.setF2(0.1D);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58738);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_5_219ap19aplusvn8z2.R.globalSliceStart(getClass().getName(),58739);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq19bn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219ap19aplusvn8z2.R.rethrow($CLV_t2$);}finally{__CLR4_5_219ap19aplusvn8z2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58739,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq19bn() throws Exception{try{__CLR4_5_219ap19aplusvn8z2.R.inc(58739);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58740);V3 vo = new V3();
        __CLR4_5_219ap19aplusvn8z2.R.inc(58741);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_5_219ap19aplusvn8z2.R.globalSliceStart(getClass().getName(),58742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f719bq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219ap19aplusvn8z2.R.rethrow($CLV_t2$);}finally{__CLR4_5_219ap19aplusvn8z2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58742,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f719bq() throws Exception{try{__CLR4_5_219ap19aplusvn8z2.R.inc(58742);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58743);V4 vo = new V4();
        __CLR4_5_219ap19aplusvn8z2.R.inc(58744);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_5_219ap19aplusvn8z2.R.globalSliceStart(getClass().getName(),58745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3oj7x19bt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219ap19aplusvn8z2.R.rethrow($CLV_t2$);}finally{__CLR4_5_219ap19aplusvn8z2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58745,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3oj7x19bt() throws Exception{try{__CLR4_5_219ap19aplusvn8z2.R.inc(58745);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58746);Object vo = null;
        __CLR4_5_219ap19aplusvn8z2.R.inc(58747);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_5_219ap19aplusvn8z2.R.globalSliceStart(getClass().getName(),58748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uokfg19bw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219ap19aplusvn8z2.R.rethrow($CLV_t2$);}finally{__CLR4_5_219ap19aplusvn8z2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),58748,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uokfg19bw() throws Exception{try{__CLR4_5_219ap19aplusvn8z2.R.inc(58748);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58749);Object vo = new HashMap();
        __CLR4_5_219ap19aplusvn8z2.R.inc(58750);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

    public static void assertEquals(String fastJSON, String jsonLib) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58751);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58752);System.out.println("fastjson: " + fastJSON);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58753);System.out.println("json-lib: " + jsonLib);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58754);Assert.assertEquals(JSON.parse(fastJSON), JSON.parse(jsonLib));
    }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

    private static final SerializeConfig   mapping;
    static {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58755);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58756);mapping = new SerializeConfig();
        __CLR4_5_219ap19aplusvn8z2.R.inc(58757);mapping.setAsmEnable(false);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58758);mapping.put(Date.class, new JSONLibDataFormatSerializer()); // \u4f7f\u7528\u548cjson-lib\u517c\u5bb9\u7684\u65e5\u671f\u8f93\u51fa\u683c\u5f0f
    }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

    private static final SerializerFeature[] features = { SerializerFeature.WriteMapNullValue, // \u8f93\u51fa\u7a7a\u7f6e\u5b57\u6bb5
            SerializerFeature.WriteNullListAsEmpty, // list\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3a[]\uff0c\u800c\u4e0d\u662fnull
            SerializerFeature.WriteNullNumberAsZero, // \u6570\u503c\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3a0\uff0c\u800c\u4e0d\u662fnull
            SerializerFeature.WriteNullBooleanAsFalse, // Boolean\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3afalse\uff0c\u800c\u4e0d\u662fnull
            SerializerFeature.WriteNullStringAsEmpty // \u5b57\u7b26\u7c7b\u578b\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3a""\uff0c\u800c\u4e0d\u662fnull
                                                      };

    // \u5e8f\u5217\u5316\u4e3a\u548cJSON-LIB\u517c\u5bb9\u7684\u5b57\u7b26\u4e32
    public static String toCompatibleJSONString(Object object) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58759);

        __CLR4_5_219ap19aplusvn8z2.R.inc(58760);return JSON.toJSONString(object, mapping, features);
    }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

    public static String toJSONLibString(Object object) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58761);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58762);net.sf.json.JSONObject obj = net.sf.json.JSONObject.fromObject(object);
        __CLR4_5_219ap19aplusvn8z2.R.inc(58763);return obj.toString();
    }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

    public static class V4 {

        private Map<String, Object> items;

        public Map<String, Object> getItems() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58764);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58765);return items;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setItems(Map<String, Object> items) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58766);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58767);this.items = items;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

    }

    public static class V3 {

        private List<String> items;

        public List<String> getItems() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58768);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58769);return items;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setItems(List<String> items) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58770);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58771);this.items = items;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

    }

    public static class V2 {

        private float  f1;
        private double f2;

        private Float  f3;
        private Double f4;

        public float getF1() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58772);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58773);return f1;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setF1(float f1) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58774);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58775);this.f1 = f1;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public double getF2() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58776);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58777);return f2;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setF2(double f2) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58778);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58779);this.f2 = f2;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public Float getF3() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58780);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58781);return f3;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setF3(Float f3) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58782);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58783);this.f3 = f3;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public Double getF4() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58784);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58785);return f4;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setF4(Double f4) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58786);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58787);this.f4 = f4;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

    }

    public static class V1 {

        private Boolean   f1;
        private Character f2;
        private String    f3;
        private Date      date;

        private boolean   f4;
        private char      f5;

        public Boolean getF1() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58788);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58789);return f1;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setF1(Boolean f1) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58790);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58791);this.f1 = f1;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public Character getF2() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58792);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58793);return f2;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setF2(Character f2) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58794);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58795);this.f2 = f2;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public String getF3() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58796);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58797);return f3;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setF3(String f3) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58798);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58799);this.f3 = f3;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public Date getDate() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58800);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58801);return date;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setDate(Date date) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58802);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58803);this.date = date;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public boolean isF4() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58804);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58805);return f4;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setF4(boolean f4) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58806);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58807);this.f4 = f4;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public char getF5() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58808);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58809);return f5;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setF5(char f5) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58810);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58811);this.f5 = f5;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

    }

    public static class VO {

        private int          id;
        private String       name;
        private BigDecimal   salary;
        private List<String> items;

        private Byte         f1;
        private Short        f2;
        private Integer      f3;
        private Long         f4;
        private BigInteger   f5;
        private BigDecimal   f6;

        private byte         f7;
        private short        f8;
        private int          f9;
        private long         f10;

        public Byte getF1() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58812);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58813);return f1;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setF1(Byte f1) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58814);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58815);this.f1 = f1;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public Short getF2() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58816);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58817);return f2;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setF2(Short f2) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58818);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58819);this.f2 = f2;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public Integer getF3() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58820);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58821);return f3;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setF3(Integer f3) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58822);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58823);this.f3 = f3;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public Long getF4() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58824);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58825);return f4;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setF4(Long f4) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58826);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58827);this.f4 = f4;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public BigInteger getF5() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58828);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58829);return f5;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setF5(BigInteger f5) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58830);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58831);this.f5 = f5;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public BigDecimal getF6() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58832);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58833);return f6;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setF6(BigDecimal f6) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58834);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58835);this.f6 = f6;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public byte getF7() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58836);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58837);return f7;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setF7(byte f7) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58838);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58839);this.f7 = f7;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public short getF8() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58840);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58841);return f8;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setF8(short f8) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58842);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58843);this.f8 = f8;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public int getF9() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58844);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58845);return f9;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setF9(int f9) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58846);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58847);this.f9 = f9;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public long getF10() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58848);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58849);return f10;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setF10(long f10) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58850);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58851);this.f10 = f10;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public BigDecimal getSalary() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58852);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58853);return salary;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setSalary(BigDecimal salary) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58854);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58855);this.salary = salary;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public int getId() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58856);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58857);return id;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58858);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58859);this.id = id;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58860);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58861);return name;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58862);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58863);this.name = name;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public List<String> getItems() {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58864);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58865);return items;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

        public void setItems(List<String> items) {try{__CLR4_5_219ap19aplusvn8z2.R.inc(58866);
            __CLR4_5_219ap19aplusvn8z2.R.inc(58867);this.items = items;
        }finally{__CLR4_5_219ap19aplusvn8z2.R.flushNeeded();}}

    }
}
