/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.compatible.jsonlib;

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

public class CompatibleTest_noasm extends TestCase {static class __CLR4_1_1019b019b0luszwa6w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,58879,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected void setUp() throws Exception {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58716);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58717);System.out.println();
    }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_1_1019b019b0luszwa6w.R.globalSliceStart(getClass().getName(),58718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp219b2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019b019b0luszwa6w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019b019b0luszwa6w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58718,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp219b2() throws Exception{try{__CLR4_1_1019b019b0luszwa6w.R.inc(58718);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58719);Map<String, Object> obj = new HashMap<String, Object>();
        __CLR4_1_1019b019b0luszwa6w.R.inc(58720);assertEquals(toCompatibleJSONString(obj), toJSONLibString(obj));
    }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_1019b019b0luszwa6w.R.globalSliceStart(getClass().getName(),58721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl19b5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019b019b0luszwa6w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019b019b0luszwa6w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58721,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl19b5() throws Exception{try{__CLR4_1_1019b019b0luszwa6w.R.inc(58721);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58722);VO vo = new VO();
        __CLR4_1_1019b019b0luszwa6w.R.inc(58723);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_1019b019b0luszwa6w.R.globalSliceStart(getClass().getName(),58724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k4419b8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019b019b0luszwa6w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019b019b0luszwa6w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58724,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k4419b8() throws Exception{try{__CLR4_1_1019b019b0luszwa6w.R.inc(58724);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58725);V1 vo = new V1();
        __CLR4_1_1019b019b0luszwa6w.R.inc(58726);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

    // {"media":{"size":58982400,"format":"video/mpg4","uri":"http://javaone.com/keynote.mpg","title":"Javaone Keynote","width":640,"height":480,"duration":18000000,"bitrate":262144,"persons":["Bill Gates","Steve Jobs"],"player":"JAVA"}{"images":[{"size":"LARGE","uri":"http://javaone.com/keynote_large.jpg","title":"Javaone Keynote","width":1024,"height":768},{"size":"SMALL","uri":"http://javaone.com/keynote_small.jpg","title":"Javaone Keynote","width":320,"height":240}]}

    public void test_3() throws Exception {__CLR4_1_1019b019b0luszwa6w.R.globalSliceStart(getClass().getName(),58727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn19bb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019b019b0luszwa6w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019b019b0luszwa6w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58727,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn19bb() throws Exception{try{__CLR4_1_1019b019b0luszwa6w.R.inc(58727);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58728);V1 vo = new V1();
        __CLR4_1_1019b019b0luszwa6w.R.inc(58729);vo.setDate(new Date());
        __CLR4_1_1019b019b0luszwa6w.R.inc(58730);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_1019b019b0luszwa6w.R.globalSliceStart(getClass().getName(),58731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj619bf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019b019b0luszwa6w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019b019b0luszwa6w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58731,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj619bf() throws Exception{try{__CLR4_1_1019b019b0luszwa6w.R.inc(58731);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58732);V1 vo = new V1();
        __CLR4_1_1019b019b0luszwa6w.R.inc(58733);vo.setF2('\u4e2d');
        __CLR4_1_1019b019b0luszwa6w.R.inc(58734);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_1019b019b0luszwa6w.R.globalSliceStart(getClass().getName(),58735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp19bj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019b019b0luszwa6w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019b019b0luszwa6w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58735,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp19bj() throws Exception{try{__CLR4_1_1019b019b0luszwa6w.R.inc(58735);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58736);V2 vo = new V2();
        __CLR4_1_1019b019b0luszwa6w.R.inc(58737);vo.setF1(1.1f);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58738);vo.setF2(2.2);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58739);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_1019b019b0luszwa6w.R.globalSliceStart(getClass().getName(),58740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy819bo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019b019b0luszwa6w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019b019b0luszwa6w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58740,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy819bo() throws Exception{try{__CLR4_1_1019b019b0luszwa6w.R.inc(58740);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58741);V2 vo = new V2();

        __CLR4_1_1019b019b0luszwa6w.R.inc(58742);vo.setF1(0.1f);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58743);vo.setF2(3.3);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58744);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_1_1019b019b0luszwa6w.R.globalSliceStart(getClass().getName(),58745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r19bt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019b019b0luszwa6w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019b019b0luszwa6w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58745,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r19bt() throws Exception{try{__CLR4_1_1019b019b0luszwa6w.R.inc(58745);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58746);V2 vo = new V2();
        __CLR4_1_1019b019b0luszwa6w.R.inc(58747);vo.setF1(1.1f);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58748);vo.setF2(0.1D);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58749);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_1_1019b019b0luszwa6w.R.globalSliceStart(getClass().getName(),58750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102uw8mq19by();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019b019b0luszwa6w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019b019b0luszwa6w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58750,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102uw8mq19by() throws Exception{try{__CLR4_1_1019b019b0luszwa6w.R.inc(58750);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58751);V3 vo = new V3();
        __CLR4_1_1019b019b0luszwa6w.R.inc(58752);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_1_1019b019b0luszwa6w.R.globalSliceStart(getClass().getName(),58753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1063w7f719c1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019b019b0luszwa6w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019b019b0luszwa6w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58753,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1063w7f719c1() throws Exception{try{__CLR4_1_1019b019b0luszwa6w.R.inc(58753);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58754);V4 vo = new V4();
        __CLR4_1_1019b019b0luszwa6w.R.inc(58755);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_1_1019b019b0luszwa6w.R.globalSliceStart(getClass().getName(),58756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c3oj7x19c4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019b019b0luszwa6w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019b019b0luszwa6w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58756,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c3oj7x19c4() throws Exception{try{__CLR4_1_1019b019b0luszwa6w.R.inc(58756);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58757);Object vo = null;
        __CLR4_1_1019b019b0luszwa6w.R.inc(58758);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_1_1019b019b0luszwa6w.R.globalSliceStart(getClass().getName(),58759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108uokfg19c7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019b019b0luszwa6w.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019b019b0luszwa6w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58759,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108uokfg19c7() throws Exception{try{__CLR4_1_1019b019b0luszwa6w.R.inc(58759);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58760);Object vo = new HashMap();
        __CLR4_1_1019b019b0luszwa6w.R.inc(58761);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

    public static void assertEquals(String fastJSON, String jsonLib) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58762);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58763);System.out.println("fastjson: " + fastJSON);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58764);System.out.println("json-lib: " + jsonLib);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58765);Assert.assertEquals(JSON.parse(fastJSON), JSON.parse(jsonLib));
    }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

    private static final SerializeConfig   mapping;
    static {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58766);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58767);mapping = new SerializeConfig();
        __CLR4_1_1019b019b0luszwa6w.R.inc(58768);mapping.setAsmEnable(false);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58769);mapping.put(Date.class, new JSONLibDataFormatSerializer()); // \u4f7f\u7528\u548cjson-lib\u517c\u5bb9\u7684\u65e5\u671f\u8f93\u51fa\u683c\u5f0f
    }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

    private static final SerializerFeature[] features = { SerializerFeature.WriteMapNullValue, // \u8f93\u51fa\u7a7a\u7f6e\u5b57\u6bb5
            SerializerFeature.WriteNullListAsEmpty, // list\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3a[]\uff0c\u800c\u4e0d\u662fnull
            SerializerFeature.WriteNullNumberAsZero, // \u6570\u503c\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3a0\uff0c\u800c\u4e0d\u662fnull
            SerializerFeature.WriteNullBooleanAsFalse, // Boolean\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3afalse\uff0c\u800c\u4e0d\u662fnull
            SerializerFeature.WriteNullStringAsEmpty // \u5b57\u7b26\u7c7b\u578b\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3a""\uff0c\u800c\u4e0d\u662fnull
                                                      };

    // \u5e8f\u5217\u5316\u4e3a\u548cJSON-LIB\u517c\u5bb9\u7684\u5b57\u7b26\u4e32
    public static String toCompatibleJSONString(Object object) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58770);

        __CLR4_1_1019b019b0luszwa6w.R.inc(58771);return JSON.toJSONString(object, mapping, features);
    }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

    public static String toJSONLibString(Object object) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58772);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58773);net.sf.json.JSONObject obj = net.sf.json.JSONObject.fromObject(object);
        __CLR4_1_1019b019b0luszwa6w.R.inc(58774);return obj.toString();
    }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

    public static class V4 {

        private Map<String, Object> items;

        public Map<String, Object> getItems() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58775);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58776);return items;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setItems(Map<String, Object> items) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58777);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58778);this.items = items;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

    }

    public static class V3 {

        private List<String> items;

        public List<String> getItems() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58779);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58780);return items;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setItems(List<String> items) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58781);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58782);this.items = items;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

    }

    public static class V2 {

        private float  f1;
        private double f2;

        private Float  f3;
        private Double f4;

        public float getF1() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58783);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58784);return f1;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setF1(float f1) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58785);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58786);this.f1 = f1;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public double getF2() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58787);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58788);return f2;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setF2(double f2) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58789);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58790);this.f2 = f2;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public Float getF3() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58791);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58792);return f3;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setF3(Float f3) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58793);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58794);this.f3 = f3;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public Double getF4() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58795);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58796);return f4;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setF4(Double f4) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58797);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58798);this.f4 = f4;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

    }

    public static class V1 {

        private Boolean   f1;
        private Character f2;
        private String    f3;
        private Date      date;

        private boolean   f4;
        private char      f5;

        public Boolean getF1() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58799);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58800);return f1;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setF1(Boolean f1) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58801);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58802);this.f1 = f1;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public Character getF2() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58803);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58804);return f2;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setF2(Character f2) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58805);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58806);this.f2 = f2;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public String getF3() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58807);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58808);return f3;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setF3(String f3) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58809);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58810);this.f3 = f3;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public Date getDate() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58811);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58812);return date;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setDate(Date date) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58813);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58814);this.date = date;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public boolean isF4() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58815);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58816);return f4;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setF4(boolean f4) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58817);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58818);this.f4 = f4;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public char getF5() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58819);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58820);return f5;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setF5(char f5) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58821);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58822);this.f5 = f5;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

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

        public Byte getF1() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58823);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58824);return f1;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setF1(Byte f1) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58825);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58826);this.f1 = f1;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public Short getF2() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58827);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58828);return f2;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setF2(Short f2) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58829);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58830);this.f2 = f2;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public Integer getF3() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58831);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58832);return f3;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setF3(Integer f3) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58833);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58834);this.f3 = f3;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public Long getF4() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58835);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58836);return f4;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setF4(Long f4) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58837);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58838);this.f4 = f4;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public BigInteger getF5() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58839);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58840);return f5;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setF5(BigInteger f5) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58841);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58842);this.f5 = f5;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public BigDecimal getF6() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58843);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58844);return f6;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setF6(BigDecimal f6) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58845);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58846);this.f6 = f6;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public byte getF7() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58847);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58848);return f7;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setF7(byte f7) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58849);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58850);this.f7 = f7;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public short getF8() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58851);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58852);return f8;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setF8(short f8) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58853);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58854);this.f8 = f8;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public int getF9() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58855);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58856);return f9;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setF9(int f9) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58857);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58858);this.f9 = f9;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public long getF10() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58859);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58860);return f10;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setF10(long f10) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58861);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58862);this.f10 = f10;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public BigDecimal getSalary() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58863);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58864);return salary;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setSalary(BigDecimal salary) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58865);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58866);this.salary = salary;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public int getId() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58867);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58868);return id;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58869);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58870);this.id = id;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58871);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58872);return name;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58873);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58874);this.name = name;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public List<String> getItems() {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58875);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58876);return items;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

        public void setItems(List<String> items) {try{__CLR4_1_1019b019b0luszwa6w.R.inc(58877);
            __CLR4_1_1019b019b0luszwa6w.R.inc(58878);this.items = items;
        }finally{__CLR4_1_1019b019b0luszwa6w.R.flushNeeded();}}

    }
}
