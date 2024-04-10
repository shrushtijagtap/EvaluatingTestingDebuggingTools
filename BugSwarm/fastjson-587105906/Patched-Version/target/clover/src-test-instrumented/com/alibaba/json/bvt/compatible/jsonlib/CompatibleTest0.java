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

public class CompatibleTest0 extends TestCase {static class __CLR4_5_2187z187zlusyjsib{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,57473,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected void setUp() throws Exception {try{__CLR4_5_2187z187zlusyjsib.R.inc(57311);
        __CLR4_5_2187z187zlusyjsib.R.inc(57312);System.out.println();
    }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_5_2187z187zlusyjsib.R.globalSliceStart(getClass().getName(),57313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21881();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2187z187zlusyjsib.R.rethrow($CLV_t2$);}finally{__CLR4_5_2187z187zlusyjsib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57313,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21881() throws Exception{try{__CLR4_5_2187z187zlusyjsib.R.inc(57313);
        __CLR4_5_2187z187zlusyjsib.R.inc(57314);Map<String, Object> obj = new HashMap<String, Object>();
        __CLR4_5_2187z187zlusyjsib.R.inc(57315);assertEquals(toCompatibleJSONString(obj), toJSONLibString(obj));
    }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_2187z187zlusyjsib.R.globalSliceStart(getClass().getName(),57316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1884();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2187z187zlusyjsib.R.rethrow($CLV_t2$);}finally{__CLR4_5_2187z187zlusyjsib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57316,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1884() throws Exception{try{__CLR4_5_2187z187zlusyjsib.R.inc(57316);
        __CLR4_5_2187z187zlusyjsib.R.inc(57317);VO vo = new VO();
        __CLR4_5_2187z187zlusyjsib.R.inc(57318);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_2187z187zlusyjsib.R.globalSliceStart(getClass().getName(),57319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441887();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2187z187zlusyjsib.R.rethrow($CLV_t2$);}finally{__CLR4_5_2187z187zlusyjsib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57319,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441887() throws Exception{try{__CLR4_5_2187z187zlusyjsib.R.inc(57319);
        __CLR4_5_2187z187zlusyjsib.R.inc(57320);V1 vo = new V1();
        __CLR4_5_2187z187zlusyjsib.R.inc(57321);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

    // {"media":{"size":58982400,"format":"video/mpg4","uri":"http://javaone.com/keynote.mpg","title":"Javaone Keynote","width":640,"height":480,"duration":18000000,"bitrate":262144,"persons":["Bill Gates","Steve Jobs"],"player":"JAVA"}{"images":[{"size":"LARGE","uri":"http://javaone.com/keynote_large.jpg","title":"Javaone Keynote","width":1024,"height":768},{"size":"SMALL","uri":"http://javaone.com/keynote_small.jpg","title":"Javaone Keynote","width":320,"height":240}]}

    public void test_3() throws Exception {__CLR4_5_2187z187zlusyjsib.R.globalSliceStart(getClass().getName(),57322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn188a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2187z187zlusyjsib.R.rethrow($CLV_t2$);}finally{__CLR4_5_2187z187zlusyjsib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57322,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn188a() throws Exception{try{__CLR4_5_2187z187zlusyjsib.R.inc(57322);
        __CLR4_5_2187z187zlusyjsib.R.inc(57323);V1 vo = new V1();
        __CLR4_5_2187z187zlusyjsib.R.inc(57324);vo.setDate(new Date());
        __CLR4_5_2187z187zlusyjsib.R.inc(57325);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_2187z187zlusyjsib.R.globalSliceStart(getClass().getName(),57326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj6188e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2187z187zlusyjsib.R.rethrow($CLV_t2$);}finally{__CLR4_5_2187z187zlusyjsib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57326,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj6188e() throws Exception{try{__CLR4_5_2187z187zlusyjsib.R.inc(57326);
        __CLR4_5_2187z187zlusyjsib.R.inc(57327);V1 vo = new V1();
        __CLR4_5_2187z187zlusyjsib.R.inc(57328);vo.setF2('\u4e2d');
        __CLR4_5_2187z187zlusyjsib.R.inc(57329);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_2187z187zlusyjsib.R.globalSliceStart(getClass().getName(),57330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp188i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2187z187zlusyjsib.R.rethrow($CLV_t2$);}finally{__CLR4_5_2187z187zlusyjsib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57330,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp188i() throws Exception{try{__CLR4_5_2187z187zlusyjsib.R.inc(57330);
        __CLR4_5_2187z187zlusyjsib.R.inc(57331);V2 vo = new V2();
        __CLR4_5_2187z187zlusyjsib.R.inc(57332);vo.setF1(0.2f);
        __CLR4_5_2187z187zlusyjsib.R.inc(57333);vo.setF2(33.3);
        __CLR4_5_2187z187zlusyjsib.R.inc(57334);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_5_2187z187zlusyjsib.R.globalSliceStart(getClass().getName(),57335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy8188n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2187z187zlusyjsib.R.rethrow($CLV_t2$);}finally{__CLR4_5_2187z187zlusyjsib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57335,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy8188n() throws Exception{try{__CLR4_5_2187z187zlusyjsib.R.inc(57335);
        __CLR4_5_2187z187zlusyjsib.R.inc(57336);V2 vo = new V2();
        __CLR4_5_2187z187zlusyjsib.R.inc(57337);vo.setF1(0.1f);
        __CLR4_5_2187z187zlusyjsib.R.inc(57338);vo.setF2(33.3);
        __CLR4_5_2187z187zlusyjsib.R.inc(57339);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_5_2187z187zlusyjsib.R.globalSliceStart(getClass().getName(),57340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r188s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2187z187zlusyjsib.R.rethrow($CLV_t2$);}finally{__CLR4_5_2187z187zlusyjsib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57340,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r188s() throws Exception{try{__CLR4_5_2187z187zlusyjsib.R.inc(57340);
        __CLR4_5_2187z187zlusyjsib.R.inc(57341);V2 vo = new V2();
        __CLR4_5_2187z187zlusyjsib.R.inc(57342);vo.setF2(0.1D);
        __CLR4_5_2187z187zlusyjsib.R.inc(57343);vo.setF1(33.3f);
        __CLR4_5_2187z187zlusyjsib.R.inc(57344);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_5_2187z187zlusyjsib.R.globalSliceStart(getClass().getName(),57345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq188x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2187z187zlusyjsib.R.rethrow($CLV_t2$);}finally{__CLR4_5_2187z187zlusyjsib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57345,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq188x() throws Exception{try{__CLR4_5_2187z187zlusyjsib.R.inc(57345);
        __CLR4_5_2187z187zlusyjsib.R.inc(57346);V3 vo = new V3();
        __CLR4_5_2187z187zlusyjsib.R.inc(57347);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_5_2187z187zlusyjsib.R.globalSliceStart(getClass().getName(),57348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f71890();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2187z187zlusyjsib.R.rethrow($CLV_t2$);}finally{__CLR4_5_2187z187zlusyjsib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57348,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f71890() throws Exception{try{__CLR4_5_2187z187zlusyjsib.R.inc(57348);
        __CLR4_5_2187z187zlusyjsib.R.inc(57349);V4 vo = new V4();
        __CLR4_5_2187z187zlusyjsib.R.inc(57350);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_5_2187z187zlusyjsib.R.globalSliceStart(getClass().getName(),57351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c3oj7x1893();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2187z187zlusyjsib.R.rethrow($CLV_t2$);}finally{__CLR4_5_2187z187zlusyjsib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57351,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c3oj7x1893() throws Exception{try{__CLR4_5_2187z187zlusyjsib.R.inc(57351);
        __CLR4_5_2187z187zlusyjsib.R.inc(57352);Object vo = null;
        __CLR4_5_2187z187zlusyjsib.R.inc(57353);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_5_2187z187zlusyjsib.R.globalSliceStart(getClass().getName(),57354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28uokfg1896();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2187z187zlusyjsib.R.rethrow($CLV_t2$);}finally{__CLR4_5_2187z187zlusyjsib.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_11",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57354,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28uokfg1896() throws Exception{try{__CLR4_5_2187z187zlusyjsib.R.inc(57354);
        __CLR4_5_2187z187zlusyjsib.R.inc(57355);Object vo = new HashMap();
        __CLR4_5_2187z187zlusyjsib.R.inc(57356);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

    public static void assertEquals(String fastJSON, String jsonLib) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57357);
        __CLR4_5_2187z187zlusyjsib.R.inc(57358);System.out.println("fastjson: " + fastJSON);
        __CLR4_5_2187z187zlusyjsib.R.inc(57359);System.out.println("json-lib: " + jsonLib);
        __CLR4_5_2187z187zlusyjsib.R.inc(57360);Assert.assertEquals(JSON.parse(fastJSON), JSON.parse(jsonLib));
    }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

private static final SerializeConfig   mapping;
static {try{__CLR4_5_2187z187zlusyjsib.R.inc(57361);
    __CLR4_5_2187z187zlusyjsib.R.inc(57362);mapping = new SerializeConfig();
    __CLR4_5_2187z187zlusyjsib.R.inc(57363);mapping.put(Date.class, new JSONLibDataFormatSerializer()); // \u4f7f\u7528\u548cjson-lib\u517c\u5bb9\u7684\u65e5\u671f\u8f93\u51fa\u683c\u5f0f
}finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

private static final SerializerFeature[] features = { SerializerFeature.WriteMapNullValue, // \u8f93\u51fa\u7a7a\u7f6e\u5b57\u6bb5
        SerializerFeature.WriteNullListAsEmpty, // list\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3a[]\uff0c\u800c\u4e0d\u662fnull
        SerializerFeature.WriteNullNumberAsZero, // \u6570\u503c\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3a0\uff0c\u800c\u4e0d\u662fnull
        SerializerFeature.WriteNullBooleanAsFalse, // Boolean\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3afalse\uff0c\u800c\u4e0d\u662fnull
        SerializerFeature.WriteNullStringAsEmpty // \u5b57\u7b26\u7c7b\u578b\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3a""\uff0c\u800c\u4e0d\u662fnull
                                                  };

// \u5e8f\u5217\u5316\u4e3a\u548cJSON-LIB\u517c\u5bb9\u7684\u5b57\u7b26\u4e32
public static String toCompatibleJSONString(Object object) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57364);

    __CLR4_5_2187z187zlusyjsib.R.inc(57365);return JSON.toJSONString(object, mapping, features);
}finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

    public static String toJSONLibString(Object object) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57366);
        __CLR4_5_2187z187zlusyjsib.R.inc(57367);net.sf.json.JSONObject obj = net.sf.json.JSONObject.fromObject(object);
        __CLR4_5_2187z187zlusyjsib.R.inc(57368);return obj.toString();
    }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

    public static class V4 {

        private Map<String, Object> items;

        public Map<String, Object> getItems() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57369);
            __CLR4_5_2187z187zlusyjsib.R.inc(57370);return items;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setItems(Map<String, Object> items) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57371);
            __CLR4_5_2187z187zlusyjsib.R.inc(57372);this.items = items;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

    }

    public static class V3 {

        private List<String> items;

        public List<String> getItems() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57373);
            __CLR4_5_2187z187zlusyjsib.R.inc(57374);return items;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setItems(List<String> items) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57375);
            __CLR4_5_2187z187zlusyjsib.R.inc(57376);this.items = items;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

    }

    public static class V2 {

        private float  f1;
        private double f2;

        private Float  f3;
        private Double f4;

        public float getF1() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57377);
            __CLR4_5_2187z187zlusyjsib.R.inc(57378);return f1;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setF1(float f1) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57379);
            __CLR4_5_2187z187zlusyjsib.R.inc(57380);this.f1 = f1;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public double getF2() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57381);
            __CLR4_5_2187z187zlusyjsib.R.inc(57382);return f2;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setF2(double f2) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57383);
            __CLR4_5_2187z187zlusyjsib.R.inc(57384);this.f2 = f2;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public Float getF3() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57385);
            __CLR4_5_2187z187zlusyjsib.R.inc(57386);return f3;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setF3(Float f3) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57387);
            __CLR4_5_2187z187zlusyjsib.R.inc(57388);this.f3 = f3;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public Double getF4() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57389);
            __CLR4_5_2187z187zlusyjsib.R.inc(57390);return f4;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setF4(Double f4) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57391);
            __CLR4_5_2187z187zlusyjsib.R.inc(57392);this.f4 = f4;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

    }

    public static class V1 {

        private Boolean   f1;
        private Character f2;
        private String    f3;
        private Date      date;

        private boolean   f4;
        private char      f5;

        public Boolean getF1() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57393);
            __CLR4_5_2187z187zlusyjsib.R.inc(57394);return f1;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setF1(Boolean f1) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57395);
            __CLR4_5_2187z187zlusyjsib.R.inc(57396);this.f1 = f1;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public Character getF2() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57397);
            __CLR4_5_2187z187zlusyjsib.R.inc(57398);return f2;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setF2(Character f2) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57399);
            __CLR4_5_2187z187zlusyjsib.R.inc(57400);this.f2 = f2;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public String getF3() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57401);
            __CLR4_5_2187z187zlusyjsib.R.inc(57402);return f3;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setF3(String f3) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57403);
            __CLR4_5_2187z187zlusyjsib.R.inc(57404);this.f3 = f3;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public Date getDate() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57405);
            __CLR4_5_2187z187zlusyjsib.R.inc(57406);return date;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setDate(Date date) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57407);
            __CLR4_5_2187z187zlusyjsib.R.inc(57408);this.date = date;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public boolean isF4() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57409);
            __CLR4_5_2187z187zlusyjsib.R.inc(57410);return f4;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setF4(boolean f4) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57411);
            __CLR4_5_2187z187zlusyjsib.R.inc(57412);this.f4 = f4;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public char getF5() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57413);
            __CLR4_5_2187z187zlusyjsib.R.inc(57414);return f5;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setF5(char f5) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57415);
            __CLR4_5_2187z187zlusyjsib.R.inc(57416);this.f5 = f5;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

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

        public Byte getF1() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57417);
            __CLR4_5_2187z187zlusyjsib.R.inc(57418);return f1;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setF1(Byte f1) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57419);
            __CLR4_5_2187z187zlusyjsib.R.inc(57420);this.f1 = f1;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public Short getF2() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57421);
            __CLR4_5_2187z187zlusyjsib.R.inc(57422);return f2;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setF2(Short f2) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57423);
            __CLR4_5_2187z187zlusyjsib.R.inc(57424);this.f2 = f2;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public Integer getF3() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57425);
            __CLR4_5_2187z187zlusyjsib.R.inc(57426);return f3;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setF3(Integer f3) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57427);
            __CLR4_5_2187z187zlusyjsib.R.inc(57428);this.f3 = f3;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public Long getF4() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57429);
            __CLR4_5_2187z187zlusyjsib.R.inc(57430);return f4;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setF4(Long f4) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57431);
            __CLR4_5_2187z187zlusyjsib.R.inc(57432);this.f4 = f4;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public BigInteger getF5() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57433);
            __CLR4_5_2187z187zlusyjsib.R.inc(57434);return f5;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setF5(BigInteger f5) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57435);
            __CLR4_5_2187z187zlusyjsib.R.inc(57436);this.f5 = f5;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public BigDecimal getF6() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57437);
            __CLR4_5_2187z187zlusyjsib.R.inc(57438);return f6;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setF6(BigDecimal f6) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57439);
            __CLR4_5_2187z187zlusyjsib.R.inc(57440);this.f6 = f6;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public byte getF7() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57441);
            __CLR4_5_2187z187zlusyjsib.R.inc(57442);return f7;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setF7(byte f7) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57443);
            __CLR4_5_2187z187zlusyjsib.R.inc(57444);this.f7 = f7;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public short getF8() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57445);
            __CLR4_5_2187z187zlusyjsib.R.inc(57446);return f8;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setF8(short f8) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57447);
            __CLR4_5_2187z187zlusyjsib.R.inc(57448);this.f8 = f8;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public int getF9() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57449);
            __CLR4_5_2187z187zlusyjsib.R.inc(57450);return f9;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setF9(int f9) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57451);
            __CLR4_5_2187z187zlusyjsib.R.inc(57452);this.f9 = f9;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public long getF10() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57453);
            __CLR4_5_2187z187zlusyjsib.R.inc(57454);return f10;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setF10(long f10) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57455);
            __CLR4_5_2187z187zlusyjsib.R.inc(57456);this.f10 = f10;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public BigDecimal getSalary() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57457);
            __CLR4_5_2187z187zlusyjsib.R.inc(57458);return salary;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setSalary(BigDecimal salary) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57459);
            __CLR4_5_2187z187zlusyjsib.R.inc(57460);this.salary = salary;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public int getId() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57461);
            __CLR4_5_2187z187zlusyjsib.R.inc(57462);return id;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57463);
            __CLR4_5_2187z187zlusyjsib.R.inc(57464);this.id = id;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57465);
            __CLR4_5_2187z187zlusyjsib.R.inc(57466);return name;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57467);
            __CLR4_5_2187z187zlusyjsib.R.inc(57468);this.name = name;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public List<String> getItems() {try{__CLR4_5_2187z187zlusyjsib.R.inc(57469);
            __CLR4_5_2187z187zlusyjsib.R.inc(57470);return items;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

        public void setItems(List<String> items) {try{__CLR4_5_2187z187zlusyjsib.R.inc(57471);
            __CLR4_5_2187z187zlusyjsib.R.inc(57472);this.items = items;
        }finally{__CLR4_5_2187z187zlusyjsib.R.flushNeeded();}}

    }
}
