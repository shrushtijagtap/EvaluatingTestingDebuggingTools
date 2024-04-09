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

public class CompatibleTest0 extends TestCase {static class __CLR4_1_10188a188alusqk7o4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,57484,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected void setUp() throws Exception {try{__CLR4_1_10188a188alusqk7o4.R.inc(57322);
        __CLR4_1_10188a188alusqk7o4.R.inc(57323);System.out.println();
    }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_1_10188a188alusqk7o4.R.globalSliceStart(getClass().getName(),57324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp2188c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10188a188alusqk7o4.R.rethrow($CLV_t2$);}finally{__CLR4_1_10188a188alusqk7o4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57324,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp2188c() throws Exception{try{__CLR4_1_10188a188alusqk7o4.R.inc(57324);
        __CLR4_1_10188a188alusqk7o4.R.inc(57325);Map<String, Object> obj = new HashMap<String, Object>();
        __CLR4_1_10188a188alusqk7o4.R.inc(57326);assertEquals(toCompatibleJSONString(obj), toJSONLibString(obj));
    }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_10188a188alusqk7o4.R.globalSliceStart(getClass().getName(),57327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl188f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10188a188alusqk7o4.R.rethrow($CLV_t2$);}finally{__CLR4_1_10188a188alusqk7o4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57327,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl188f() throws Exception{try{__CLR4_1_10188a188alusqk7o4.R.inc(57327);
        __CLR4_1_10188a188alusqk7o4.R.inc(57328);VO vo = new VO();
        __CLR4_1_10188a188alusqk7o4.R.inc(57329);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_10188a188alusqk7o4.R.globalSliceStart(getClass().getName(),57330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k44188i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10188a188alusqk7o4.R.rethrow($CLV_t2$);}finally{__CLR4_1_10188a188alusqk7o4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57330,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k44188i() throws Exception{try{__CLR4_1_10188a188alusqk7o4.R.inc(57330);
        __CLR4_1_10188a188alusqk7o4.R.inc(57331);V1 vo = new V1();
        __CLR4_1_10188a188alusqk7o4.R.inc(57332);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

    // {"media":{"size":58982400,"format":"video/mpg4","uri":"http://javaone.com/keynote.mpg","title":"Javaone Keynote","width":640,"height":480,"duration":18000000,"bitrate":262144,"persons":["Bill Gates","Steve Jobs"],"player":"JAVA"}{"images":[{"size":"LARGE","uri":"http://javaone.com/keynote_large.jpg","title":"Javaone Keynote","width":1024,"height":768},{"size":"SMALL","uri":"http://javaone.com/keynote_small.jpg","title":"Javaone Keynote","width":320,"height":240}]}

    public void test_3() throws Exception {__CLR4_1_10188a188alusqk7o4.R.globalSliceStart(getClass().getName(),57333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn188l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10188a188alusqk7o4.R.rethrow($CLV_t2$);}finally{__CLR4_1_10188a188alusqk7o4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57333,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn188l() throws Exception{try{__CLR4_1_10188a188alusqk7o4.R.inc(57333);
        __CLR4_1_10188a188alusqk7o4.R.inc(57334);V1 vo = new V1();
        __CLR4_1_10188a188alusqk7o4.R.inc(57335);vo.setDate(new Date());
        __CLR4_1_10188a188alusqk7o4.R.inc(57336);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_10188a188alusqk7o4.R.globalSliceStart(getClass().getName(),57337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj6188p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10188a188alusqk7o4.R.rethrow($CLV_t2$);}finally{__CLR4_1_10188a188alusqk7o4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57337,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj6188p() throws Exception{try{__CLR4_1_10188a188alusqk7o4.R.inc(57337);
        __CLR4_1_10188a188alusqk7o4.R.inc(57338);V1 vo = new V1();
        __CLR4_1_10188a188alusqk7o4.R.inc(57339);vo.setF2('\u4e2d');
        __CLR4_1_10188a188alusqk7o4.R.inc(57340);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_10188a188alusqk7o4.R.globalSliceStart(getClass().getName(),57341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp188t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10188a188alusqk7o4.R.rethrow($CLV_t2$);}finally{__CLR4_1_10188a188alusqk7o4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57341,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp188t() throws Exception{try{__CLR4_1_10188a188alusqk7o4.R.inc(57341);
        __CLR4_1_10188a188alusqk7o4.R.inc(57342);V2 vo = new V2();
        __CLR4_1_10188a188alusqk7o4.R.inc(57343);vo.setF1(0.2f);
        __CLR4_1_10188a188alusqk7o4.R.inc(57344);vo.setF2(33.3);
        __CLR4_1_10188a188alusqk7o4.R.inc(57345);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_10188a188alusqk7o4.R.globalSliceStart(getClass().getName(),57346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy8188y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10188a188alusqk7o4.R.rethrow($CLV_t2$);}finally{__CLR4_1_10188a188alusqk7o4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57346,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy8188y() throws Exception{try{__CLR4_1_10188a188alusqk7o4.R.inc(57346);
        __CLR4_1_10188a188alusqk7o4.R.inc(57347);V2 vo = new V2();
        __CLR4_1_10188a188alusqk7o4.R.inc(57348);vo.setF1(0.1f);
        __CLR4_1_10188a188alusqk7o4.R.inc(57349);vo.setF2(33.3);
        __CLR4_1_10188a188alusqk7o4.R.inc(57350);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_1_10188a188alusqk7o4.R.globalSliceStart(getClass().getName(),57351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1893();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10188a188alusqk7o4.R.rethrow($CLV_t2$);}finally{__CLR4_1_10188a188alusqk7o4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57351,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1893() throws Exception{try{__CLR4_1_10188a188alusqk7o4.R.inc(57351);
        __CLR4_1_10188a188alusqk7o4.R.inc(57352);V2 vo = new V2();
        __CLR4_1_10188a188alusqk7o4.R.inc(57353);vo.setF2(0.1D);
        __CLR4_1_10188a188alusqk7o4.R.inc(57354);vo.setF1(33.3f);
        __CLR4_1_10188a188alusqk7o4.R.inc(57355);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_1_10188a188alusqk7o4.R.globalSliceStart(getClass().getName(),57356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102uw8mq1898();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10188a188alusqk7o4.R.rethrow($CLV_t2$);}finally{__CLR4_1_10188a188alusqk7o4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57356,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102uw8mq1898() throws Exception{try{__CLR4_1_10188a188alusqk7o4.R.inc(57356);
        __CLR4_1_10188a188alusqk7o4.R.inc(57357);V3 vo = new V3();
        __CLR4_1_10188a188alusqk7o4.R.inc(57358);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_1_10188a188alusqk7o4.R.globalSliceStart(getClass().getName(),57359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1063w7f7189b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10188a188alusqk7o4.R.rethrow($CLV_t2$);}finally{__CLR4_1_10188a188alusqk7o4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57359,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1063w7f7189b() throws Exception{try{__CLR4_1_10188a188alusqk7o4.R.inc(57359);
        __CLR4_1_10188a188alusqk7o4.R.inc(57360);V4 vo = new V4();
        __CLR4_1_10188a188alusqk7o4.R.inc(57361);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_1_10188a188alusqk7o4.R.globalSliceStart(getClass().getName(),57362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c3oj7x189e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10188a188alusqk7o4.R.rethrow($CLV_t2$);}finally{__CLR4_1_10188a188alusqk7o4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57362,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c3oj7x189e() throws Exception{try{__CLR4_1_10188a188alusqk7o4.R.inc(57362);
        __CLR4_1_10188a188alusqk7o4.R.inc(57363);Object vo = null;
        __CLR4_1_10188a188alusqk7o4.R.inc(57364);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_1_10188a188alusqk7o4.R.globalSliceStart(getClass().getName(),57365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108uokfg189h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10188a188alusqk7o4.R.rethrow($CLV_t2$);}finally{__CLR4_1_10188a188alusqk7o4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57365,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108uokfg189h() throws Exception{try{__CLR4_1_10188a188alusqk7o4.R.inc(57365);
        __CLR4_1_10188a188alusqk7o4.R.inc(57366);Object vo = new HashMap();
        __CLR4_1_10188a188alusqk7o4.R.inc(57367);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

    public static void assertEquals(String fastJSON, String jsonLib) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57368);
        __CLR4_1_10188a188alusqk7o4.R.inc(57369);System.out.println("fastjson: " + fastJSON);
        __CLR4_1_10188a188alusqk7o4.R.inc(57370);System.out.println("json-lib: " + jsonLib);
        __CLR4_1_10188a188alusqk7o4.R.inc(57371);Assert.assertEquals(JSON.parse(fastJSON), JSON.parse(jsonLib));
    }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

private static final SerializeConfig   mapping;
static {try{__CLR4_1_10188a188alusqk7o4.R.inc(57372);
    __CLR4_1_10188a188alusqk7o4.R.inc(57373);mapping = new SerializeConfig();
    __CLR4_1_10188a188alusqk7o4.R.inc(57374);mapping.put(Date.class, new JSONLibDataFormatSerializer()); // \u4f7f\u7528\u548cjson-lib\u517c\u5bb9\u7684\u65e5\u671f\u8f93\u51fa\u683c\u5f0f
}finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

private static final SerializerFeature[] features = { SerializerFeature.WriteMapNullValue, // \u8f93\u51fa\u7a7a\u7f6e\u5b57\u6bb5
        SerializerFeature.WriteNullListAsEmpty, // list\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3a[]\uff0c\u800c\u4e0d\u662fnull
        SerializerFeature.WriteNullNumberAsZero, // \u6570\u503c\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3a0\uff0c\u800c\u4e0d\u662fnull
        SerializerFeature.WriteNullBooleanAsFalse, // Boolean\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3afalse\uff0c\u800c\u4e0d\u662fnull
        SerializerFeature.WriteNullStringAsEmpty // \u5b57\u7b26\u7c7b\u578b\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3a""\uff0c\u800c\u4e0d\u662fnull
                                                  };

// \u5e8f\u5217\u5316\u4e3a\u548cJSON-LIB\u517c\u5bb9\u7684\u5b57\u7b26\u4e32
public static String toCompatibleJSONString(Object object) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57375);

    __CLR4_1_10188a188alusqk7o4.R.inc(57376);return JSON.toJSONString(object, mapping, features);
}finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

    public static String toJSONLibString(Object object) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57377);
        __CLR4_1_10188a188alusqk7o4.R.inc(57378);net.sf.json.JSONObject obj = net.sf.json.JSONObject.fromObject(object);
        __CLR4_1_10188a188alusqk7o4.R.inc(57379);return obj.toString();
    }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

    public static class V4 {

        private Map<String, Object> items;

        public Map<String, Object> getItems() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57380);
            __CLR4_1_10188a188alusqk7o4.R.inc(57381);return items;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setItems(Map<String, Object> items) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57382);
            __CLR4_1_10188a188alusqk7o4.R.inc(57383);this.items = items;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

    }

    public static class V3 {

        private List<String> items;

        public List<String> getItems() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57384);
            __CLR4_1_10188a188alusqk7o4.R.inc(57385);return items;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setItems(List<String> items) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57386);
            __CLR4_1_10188a188alusqk7o4.R.inc(57387);this.items = items;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

    }

    public static class V2 {

        private float  f1;
        private double f2;

        private Float  f3;
        private Double f4;

        public float getF1() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57388);
            __CLR4_1_10188a188alusqk7o4.R.inc(57389);return f1;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setF1(float f1) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57390);
            __CLR4_1_10188a188alusqk7o4.R.inc(57391);this.f1 = f1;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public double getF2() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57392);
            __CLR4_1_10188a188alusqk7o4.R.inc(57393);return f2;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setF2(double f2) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57394);
            __CLR4_1_10188a188alusqk7o4.R.inc(57395);this.f2 = f2;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public Float getF3() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57396);
            __CLR4_1_10188a188alusqk7o4.R.inc(57397);return f3;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setF3(Float f3) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57398);
            __CLR4_1_10188a188alusqk7o4.R.inc(57399);this.f3 = f3;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public Double getF4() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57400);
            __CLR4_1_10188a188alusqk7o4.R.inc(57401);return f4;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setF4(Double f4) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57402);
            __CLR4_1_10188a188alusqk7o4.R.inc(57403);this.f4 = f4;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

    }

    public static class V1 {

        private Boolean   f1;
        private Character f2;
        private String    f3;
        private Date      date;

        private boolean   f4;
        private char      f5;

        public Boolean getF1() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57404);
            __CLR4_1_10188a188alusqk7o4.R.inc(57405);return f1;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setF1(Boolean f1) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57406);
            __CLR4_1_10188a188alusqk7o4.R.inc(57407);this.f1 = f1;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public Character getF2() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57408);
            __CLR4_1_10188a188alusqk7o4.R.inc(57409);return f2;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setF2(Character f2) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57410);
            __CLR4_1_10188a188alusqk7o4.R.inc(57411);this.f2 = f2;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public String getF3() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57412);
            __CLR4_1_10188a188alusqk7o4.R.inc(57413);return f3;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setF3(String f3) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57414);
            __CLR4_1_10188a188alusqk7o4.R.inc(57415);this.f3 = f3;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public Date getDate() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57416);
            __CLR4_1_10188a188alusqk7o4.R.inc(57417);return date;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setDate(Date date) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57418);
            __CLR4_1_10188a188alusqk7o4.R.inc(57419);this.date = date;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public boolean isF4() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57420);
            __CLR4_1_10188a188alusqk7o4.R.inc(57421);return f4;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setF4(boolean f4) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57422);
            __CLR4_1_10188a188alusqk7o4.R.inc(57423);this.f4 = f4;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public char getF5() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57424);
            __CLR4_1_10188a188alusqk7o4.R.inc(57425);return f5;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setF5(char f5) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57426);
            __CLR4_1_10188a188alusqk7o4.R.inc(57427);this.f5 = f5;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

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

        public Byte getF1() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57428);
            __CLR4_1_10188a188alusqk7o4.R.inc(57429);return f1;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setF1(Byte f1) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57430);
            __CLR4_1_10188a188alusqk7o4.R.inc(57431);this.f1 = f1;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public Short getF2() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57432);
            __CLR4_1_10188a188alusqk7o4.R.inc(57433);return f2;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setF2(Short f2) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57434);
            __CLR4_1_10188a188alusqk7o4.R.inc(57435);this.f2 = f2;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public Integer getF3() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57436);
            __CLR4_1_10188a188alusqk7o4.R.inc(57437);return f3;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setF3(Integer f3) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57438);
            __CLR4_1_10188a188alusqk7o4.R.inc(57439);this.f3 = f3;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public Long getF4() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57440);
            __CLR4_1_10188a188alusqk7o4.R.inc(57441);return f4;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setF4(Long f4) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57442);
            __CLR4_1_10188a188alusqk7o4.R.inc(57443);this.f4 = f4;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public BigInteger getF5() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57444);
            __CLR4_1_10188a188alusqk7o4.R.inc(57445);return f5;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setF5(BigInteger f5) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57446);
            __CLR4_1_10188a188alusqk7o4.R.inc(57447);this.f5 = f5;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public BigDecimal getF6() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57448);
            __CLR4_1_10188a188alusqk7o4.R.inc(57449);return f6;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setF6(BigDecimal f6) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57450);
            __CLR4_1_10188a188alusqk7o4.R.inc(57451);this.f6 = f6;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public byte getF7() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57452);
            __CLR4_1_10188a188alusqk7o4.R.inc(57453);return f7;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setF7(byte f7) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57454);
            __CLR4_1_10188a188alusqk7o4.R.inc(57455);this.f7 = f7;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public short getF8() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57456);
            __CLR4_1_10188a188alusqk7o4.R.inc(57457);return f8;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setF8(short f8) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57458);
            __CLR4_1_10188a188alusqk7o4.R.inc(57459);this.f8 = f8;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public int getF9() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57460);
            __CLR4_1_10188a188alusqk7o4.R.inc(57461);return f9;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setF9(int f9) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57462);
            __CLR4_1_10188a188alusqk7o4.R.inc(57463);this.f9 = f9;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public long getF10() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57464);
            __CLR4_1_10188a188alusqk7o4.R.inc(57465);return f10;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setF10(long f10) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57466);
            __CLR4_1_10188a188alusqk7o4.R.inc(57467);this.f10 = f10;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public BigDecimal getSalary() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57468);
            __CLR4_1_10188a188alusqk7o4.R.inc(57469);return salary;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setSalary(BigDecimal salary) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57470);
            __CLR4_1_10188a188alusqk7o4.R.inc(57471);this.salary = salary;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public int getId() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57472);
            __CLR4_1_10188a188alusqk7o4.R.inc(57473);return id;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57474);
            __CLR4_1_10188a188alusqk7o4.R.inc(57475);this.id = id;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57476);
            __CLR4_1_10188a188alusqk7o4.R.inc(57477);return name;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57478);
            __CLR4_1_10188a188alusqk7o4.R.inc(57479);this.name = name;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public List<String> getItems() {try{__CLR4_1_10188a188alusqk7o4.R.inc(57480);
            __CLR4_1_10188a188alusqk7o4.R.inc(57481);return items;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

        public void setItems(List<String> items) {try{__CLR4_1_10188a188alusqk7o4.R.inc(57482);
            __CLR4_1_10188a188alusqk7o4.R.inc(57483);this.items = items;
        }finally{__CLR4_1_10188a188alusqk7o4.R.flushNeeded();}}

    }
}
