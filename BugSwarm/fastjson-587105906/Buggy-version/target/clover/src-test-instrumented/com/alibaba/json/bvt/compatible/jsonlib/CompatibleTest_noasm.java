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

public class CompatibleTest_noasm extends TestCase {static class __CLR4_1_1018cs18cslusqk7pi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,57647,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected void setUp() throws Exception {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57484);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57485);System.out.println();
    }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_1_1018cs18cslusqk7pi.R.globalSliceStart(getClass().getName(),57486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp218cu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018cs18cslusqk7pi.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018cs18cslusqk7pi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57486,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp218cu() throws Exception{try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57486);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57487);Map<String, Object> obj = new HashMap<String, Object>();
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57488);assertEquals(toCompatibleJSONString(obj), toJSONLibString(obj));
    }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_1018cs18cslusqk7pi.R.globalSliceStart(getClass().getName(),57489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl18cx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018cs18cslusqk7pi.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018cs18cslusqk7pi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57489,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl18cx() throws Exception{try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57489);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57490);VO vo = new VO();
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57491);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_1018cs18cslusqk7pi.R.globalSliceStart(getClass().getName(),57492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k4418d0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018cs18cslusqk7pi.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018cs18cslusqk7pi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57492,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k4418d0() throws Exception{try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57492);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57493);V1 vo = new V1();
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57494);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

    // {"media":{"size":58982400,"format":"video/mpg4","uri":"http://javaone.com/keynote.mpg","title":"Javaone Keynote","width":640,"height":480,"duration":18000000,"bitrate":262144,"persons":["Bill Gates","Steve Jobs"],"player":"JAVA"}{"images":[{"size":"LARGE","uri":"http://javaone.com/keynote_large.jpg","title":"Javaone Keynote","width":1024,"height":768},{"size":"SMALL","uri":"http://javaone.com/keynote_small.jpg","title":"Javaone Keynote","width":320,"height":240}]}

    public void test_3() throws Exception {__CLR4_1_1018cs18cslusqk7pi.R.globalSliceStart(getClass().getName(),57495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn18d3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018cs18cslusqk7pi.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018cs18cslusqk7pi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57495,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn18d3() throws Exception{try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57495);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57496);V1 vo = new V1();
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57497);vo.setDate(new Date());
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57498);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_1018cs18cslusqk7pi.R.globalSliceStart(getClass().getName(),57499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj618d7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018cs18cslusqk7pi.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018cs18cslusqk7pi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57499,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj618d7() throws Exception{try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57499);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57500);V1 vo = new V1();
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57501);vo.setF2('\u4e2d');
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57502);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_1018cs18cslusqk7pi.R.globalSliceStart(getClass().getName(),57503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp18db();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018cs18cslusqk7pi.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018cs18cslusqk7pi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57503,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp18db() throws Exception{try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57503);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57504);V2 vo = new V2();
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57505);vo.setF1(1.1f);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57506);vo.setF2(2.2);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57507);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_1018cs18cslusqk7pi.R.globalSliceStart(getClass().getName(),57508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy818dg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018cs18cslusqk7pi.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018cs18cslusqk7pi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57508,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy818dg() throws Exception{try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57508);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57509);V2 vo = new V2();

        __CLR4_1_1018cs18cslusqk7pi.R.inc(57510);vo.setF1(0.1f);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57511);vo.setF2(3.3);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57512);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_1_1018cs18cslusqk7pi.R.globalSliceStart(getClass().getName(),57513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r18dl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018cs18cslusqk7pi.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018cs18cslusqk7pi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57513,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r18dl() throws Exception{try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57513);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57514);V2 vo = new V2();
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57515);vo.setF1(1.1f);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57516);vo.setF2(0.1D);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57517);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_1_1018cs18cslusqk7pi.R.globalSliceStart(getClass().getName(),57518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102uw8mq18dq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018cs18cslusqk7pi.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018cs18cslusqk7pi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57518,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102uw8mq18dq() throws Exception{try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57518);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57519);V3 vo = new V3();
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57520);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_1_1018cs18cslusqk7pi.R.globalSliceStart(getClass().getName(),57521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1063w7f718dt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018cs18cslusqk7pi.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018cs18cslusqk7pi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57521,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1063w7f718dt() throws Exception{try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57521);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57522);V4 vo = new V4();
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57523);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_1_1018cs18cslusqk7pi.R.globalSliceStart(getClass().getName(),57524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c3oj7x18dw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018cs18cslusqk7pi.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018cs18cslusqk7pi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57524,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c3oj7x18dw() throws Exception{try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57524);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57525);Object vo = null;
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57526);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_1_1018cs18cslusqk7pi.R.globalSliceStart(getClass().getName(),57527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108uokfg18dz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018cs18cslusqk7pi.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018cs18cslusqk7pi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest_noasm.test_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57527,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108uokfg18dz() throws Exception{try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57527);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57528);Object vo = new HashMap();
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57529);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

    public static void assertEquals(String fastJSON, String jsonLib) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57530);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57531);System.out.println("fastjson: " + fastJSON);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57532);System.out.println("json-lib: " + jsonLib);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57533);Assert.assertEquals(JSON.parse(fastJSON), JSON.parse(jsonLib));
    }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

    private static final SerializeConfig   mapping;
    static {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57534);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57535);mapping = new SerializeConfig();
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57536);mapping.setAsmEnable(false);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57537);mapping.put(Date.class, new JSONLibDataFormatSerializer()); // \u4f7f\u7528\u548cjson-lib\u517c\u5bb9\u7684\u65e5\u671f\u8f93\u51fa\u683c\u5f0f
    }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

    private static final SerializerFeature[] features = { SerializerFeature.WriteMapNullValue, // \u8f93\u51fa\u7a7a\u7f6e\u5b57\u6bb5
            SerializerFeature.WriteNullListAsEmpty, // list\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3a[]\uff0c\u800c\u4e0d\u662fnull
            SerializerFeature.WriteNullNumberAsZero, // \u6570\u503c\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3a0\uff0c\u800c\u4e0d\u662fnull
            SerializerFeature.WriteNullBooleanAsFalse, // Boolean\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3afalse\uff0c\u800c\u4e0d\u662fnull
            SerializerFeature.WriteNullStringAsEmpty // \u5b57\u7b26\u7c7b\u578b\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3a""\uff0c\u800c\u4e0d\u662fnull
                                                      };

    // \u5e8f\u5217\u5316\u4e3a\u548cJSON-LIB\u517c\u5bb9\u7684\u5b57\u7b26\u4e32
    public static String toCompatibleJSONString(Object object) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57538);

        __CLR4_1_1018cs18cslusqk7pi.R.inc(57539);return JSON.toJSONString(object, mapping, features);
    }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

    public static String toJSONLibString(Object object) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57540);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57541);net.sf.json.JSONObject obj = net.sf.json.JSONObject.fromObject(object);
        __CLR4_1_1018cs18cslusqk7pi.R.inc(57542);return obj.toString();
    }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

    public static class V4 {

        private Map<String, Object> items;

        public Map<String, Object> getItems() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57543);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57544);return items;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setItems(Map<String, Object> items) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57545);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57546);this.items = items;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

    }

    public static class V3 {

        private List<String> items;

        public List<String> getItems() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57547);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57548);return items;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setItems(List<String> items) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57549);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57550);this.items = items;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

    }

    public static class V2 {

        private float  f1;
        private double f2;

        private Float  f3;
        private Double f4;

        public float getF1() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57551);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57552);return f1;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setF1(float f1) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57553);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57554);this.f1 = f1;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public double getF2() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57555);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57556);return f2;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setF2(double f2) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57557);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57558);this.f2 = f2;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public Float getF3() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57559);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57560);return f3;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setF3(Float f3) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57561);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57562);this.f3 = f3;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public Double getF4() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57563);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57564);return f4;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setF4(Double f4) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57565);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57566);this.f4 = f4;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

    }

    public static class V1 {

        private Boolean   f1;
        private Character f2;
        private String    f3;
        private Date      date;

        private boolean   f4;
        private char      f5;

        public Boolean getF1() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57567);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57568);return f1;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setF1(Boolean f1) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57569);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57570);this.f1 = f1;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public Character getF2() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57571);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57572);return f2;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setF2(Character f2) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57573);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57574);this.f2 = f2;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public String getF3() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57575);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57576);return f3;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setF3(String f3) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57577);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57578);this.f3 = f3;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public Date getDate() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57579);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57580);return date;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setDate(Date date) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57581);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57582);this.date = date;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public boolean isF4() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57583);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57584);return f4;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setF4(boolean f4) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57585);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57586);this.f4 = f4;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public char getF5() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57587);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57588);return f5;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setF5(char f5) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57589);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57590);this.f5 = f5;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

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

        public Byte getF1() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57591);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57592);return f1;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setF1(Byte f1) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57593);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57594);this.f1 = f1;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public Short getF2() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57595);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57596);return f2;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setF2(Short f2) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57597);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57598);this.f2 = f2;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public Integer getF3() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57599);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57600);return f3;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setF3(Integer f3) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57601);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57602);this.f3 = f3;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public Long getF4() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57603);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57604);return f4;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setF4(Long f4) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57605);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57606);this.f4 = f4;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public BigInteger getF5() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57607);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57608);return f5;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setF5(BigInteger f5) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57609);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57610);this.f5 = f5;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public BigDecimal getF6() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57611);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57612);return f6;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setF6(BigDecimal f6) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57613);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57614);this.f6 = f6;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public byte getF7() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57615);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57616);return f7;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setF7(byte f7) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57617);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57618);this.f7 = f7;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public short getF8() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57619);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57620);return f8;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setF8(short f8) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57621);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57622);this.f8 = f8;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public int getF9() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57623);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57624);return f9;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setF9(int f9) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57625);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57626);this.f9 = f9;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public long getF10() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57627);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57628);return f10;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setF10(long f10) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57629);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57630);this.f10 = f10;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public BigDecimal getSalary() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57631);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57632);return salary;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setSalary(BigDecimal salary) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57633);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57634);this.salary = salary;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public int getId() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57635);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57636);return id;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57637);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57638);this.id = id;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57639);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57640);return name;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57641);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57642);this.name = name;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public List<String> getItems() {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57643);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57644);return items;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

        public void setItems(List<String> items) {try{__CLR4_1_1018cs18cslusqk7pi.R.inc(57645);
            __CLR4_1_1018cs18cslusqk7pi.R.inc(57646);this.items = items;
        }finally{__CLR4_1_1018cs18cslusqk7pi.R.flushNeeded();}}

    }
}
