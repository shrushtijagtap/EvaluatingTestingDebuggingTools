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

public class CompatibleTest0 extends TestCase {static class __CLR4_1_10196i196iluszwa6m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,58716,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected void setUp() throws Exception {try{__CLR4_1_10196i196iluszwa6m.R.inc(58554);
        __CLR4_1_10196i196iluszwa6m.R.inc(58555);System.out.println();
    }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_1_10196i196iluszwa6m.R.globalSliceStart(getClass().getName(),58556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp2196k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10196i196iluszwa6m.R.rethrow($CLV_t2$);}finally{__CLR4_1_10196i196iluszwa6m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58556,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp2196k() throws Exception{try{__CLR4_1_10196i196iluszwa6m.R.inc(58556);
        __CLR4_1_10196i196iluszwa6m.R.inc(58557);Map<String, Object> obj = new HashMap<String, Object>();
        __CLR4_1_10196i196iluszwa6m.R.inc(58558);assertEquals(toCompatibleJSONString(obj), toJSONLibString(obj));
    }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_10196i196iluszwa6m.R.globalSliceStart(getClass().getName(),58559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl196n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10196i196iluszwa6m.R.rethrow($CLV_t2$);}finally{__CLR4_1_10196i196iluszwa6m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58559,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl196n() throws Exception{try{__CLR4_1_10196i196iluszwa6m.R.inc(58559);
        __CLR4_1_10196i196iluszwa6m.R.inc(58560);VO vo = new VO();
        __CLR4_1_10196i196iluszwa6m.R.inc(58561);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_10196i196iluszwa6m.R.globalSliceStart(getClass().getName(),58562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k44196q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10196i196iluszwa6m.R.rethrow($CLV_t2$);}finally{__CLR4_1_10196i196iluszwa6m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58562,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k44196q() throws Exception{try{__CLR4_1_10196i196iluszwa6m.R.inc(58562);
        __CLR4_1_10196i196iluszwa6m.R.inc(58563);V1 vo = new V1();
        __CLR4_1_10196i196iluszwa6m.R.inc(58564);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

    // {"media":{"size":58982400,"format":"video/mpg4","uri":"http://javaone.com/keynote.mpg","title":"Javaone Keynote","width":640,"height":480,"duration":18000000,"bitrate":262144,"persons":["Bill Gates","Steve Jobs"],"player":"JAVA"}{"images":[{"size":"LARGE","uri":"http://javaone.com/keynote_large.jpg","title":"Javaone Keynote","width":1024,"height":768},{"size":"SMALL","uri":"http://javaone.com/keynote_small.jpg","title":"Javaone Keynote","width":320,"height":240}]}

    public void test_3() throws Exception {__CLR4_1_10196i196iluszwa6m.R.globalSliceStart(getClass().getName(),58565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn196t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10196i196iluszwa6m.R.rethrow($CLV_t2$);}finally{__CLR4_1_10196i196iluszwa6m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58565,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn196t() throws Exception{try{__CLR4_1_10196i196iluszwa6m.R.inc(58565);
        __CLR4_1_10196i196iluszwa6m.R.inc(58566);V1 vo = new V1();
        __CLR4_1_10196i196iluszwa6m.R.inc(58567);vo.setDate(new Date());
        __CLR4_1_10196i196iluszwa6m.R.inc(58568);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_10196i196iluszwa6m.R.globalSliceStart(getClass().getName(),58569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj6196x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10196i196iluszwa6m.R.rethrow($CLV_t2$);}finally{__CLR4_1_10196i196iluszwa6m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58569,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj6196x() throws Exception{try{__CLR4_1_10196i196iluszwa6m.R.inc(58569);
        __CLR4_1_10196i196iluszwa6m.R.inc(58570);V1 vo = new V1();
        __CLR4_1_10196i196iluszwa6m.R.inc(58571);vo.setF2('\u4e2d');
        __CLR4_1_10196i196iluszwa6m.R.inc(58572);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_10196i196iluszwa6m.R.globalSliceStart(getClass().getName(),58573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1971();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10196i196iluszwa6m.R.rethrow($CLV_t2$);}finally{__CLR4_1_10196i196iluszwa6m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58573,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1971() throws Exception{try{__CLR4_1_10196i196iluszwa6m.R.inc(58573);
        __CLR4_1_10196i196iluszwa6m.R.inc(58574);V2 vo = new V2();
        __CLR4_1_10196i196iluszwa6m.R.inc(58575);vo.setF1(0.2f);
        __CLR4_1_10196i196iluszwa6m.R.inc(58576);vo.setF2(33.3);
        __CLR4_1_10196i196iluszwa6m.R.inc(58577);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_10196i196iluszwa6m.R.globalSliceStart(getClass().getName(),58578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81976();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10196i196iluszwa6m.R.rethrow($CLV_t2$);}finally{__CLR4_1_10196i196iluszwa6m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58578,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81976() throws Exception{try{__CLR4_1_10196i196iluszwa6m.R.inc(58578);
        __CLR4_1_10196i196iluszwa6m.R.inc(58579);V2 vo = new V2();
        __CLR4_1_10196i196iluszwa6m.R.inc(58580);vo.setF1(0.1f);
        __CLR4_1_10196i196iluszwa6m.R.inc(58581);vo.setF2(33.3);
        __CLR4_1_10196i196iluszwa6m.R.inc(58582);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_1_10196i196iluszwa6m.R.globalSliceStart(getClass().getName(),58583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r197b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10196i196iluszwa6m.R.rethrow($CLV_t2$);}finally{__CLR4_1_10196i196iluszwa6m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58583,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r197b() throws Exception{try{__CLR4_1_10196i196iluszwa6m.R.inc(58583);
        __CLR4_1_10196i196iluszwa6m.R.inc(58584);V2 vo = new V2();
        __CLR4_1_10196i196iluszwa6m.R.inc(58585);vo.setF2(0.1D);
        __CLR4_1_10196i196iluszwa6m.R.inc(58586);vo.setF1(33.3f);
        __CLR4_1_10196i196iluszwa6m.R.inc(58587);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_1_10196i196iluszwa6m.R.globalSliceStart(getClass().getName(),58588);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102uw8mq197g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10196i196iluszwa6m.R.rethrow($CLV_t2$);}finally{__CLR4_1_10196i196iluszwa6m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58588,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102uw8mq197g() throws Exception{try{__CLR4_1_10196i196iluszwa6m.R.inc(58588);
        __CLR4_1_10196i196iluszwa6m.R.inc(58589);V3 vo = new V3();
        __CLR4_1_10196i196iluszwa6m.R.inc(58590);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_1_10196i196iluszwa6m.R.globalSliceStart(getClass().getName(),58591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1063w7f7197j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10196i196iluszwa6m.R.rethrow($CLV_t2$);}finally{__CLR4_1_10196i196iluszwa6m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58591,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1063w7f7197j() throws Exception{try{__CLR4_1_10196i196iluszwa6m.R.inc(58591);
        __CLR4_1_10196i196iluszwa6m.R.inc(58592);V4 vo = new V4();
        __CLR4_1_10196i196iluszwa6m.R.inc(58593);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

    public void test_10() throws Exception {__CLR4_1_10196i196iluszwa6m.R.globalSliceStart(getClass().getName(),58594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c3oj7x197m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10196i196iluszwa6m.R.rethrow($CLV_t2$);}finally{__CLR4_1_10196i196iluszwa6m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58594,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c3oj7x197m() throws Exception{try{__CLR4_1_10196i196iluszwa6m.R.inc(58594);
        __CLR4_1_10196i196iluszwa6m.R.inc(58595);Object vo = null;
        __CLR4_1_10196i196iluszwa6m.R.inc(58596);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

    public void test_11() throws Exception {__CLR4_1_10196i196iluszwa6m.R.globalSliceStart(getClass().getName(),58597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108uokfg197p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10196i196iluszwa6m.R.rethrow($CLV_t2$);}finally{__CLR4_1_10196i196iluszwa6m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.compatible.jsonlib.CompatibleTest0.test_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58597,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108uokfg197p() throws Exception{try{__CLR4_1_10196i196iluszwa6m.R.inc(58597);
        __CLR4_1_10196i196iluszwa6m.R.inc(58598);Object vo = new HashMap();
        __CLR4_1_10196i196iluszwa6m.R.inc(58599);assertEquals(toCompatibleJSONString(vo), toJSONLibString(vo));
    }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

    public static void assertEquals(String fastJSON, String jsonLib) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58600);
        __CLR4_1_10196i196iluszwa6m.R.inc(58601);System.out.println("fastjson: " + fastJSON);
        __CLR4_1_10196i196iluszwa6m.R.inc(58602);System.out.println("json-lib: " + jsonLib);
        __CLR4_1_10196i196iluszwa6m.R.inc(58603);Assert.assertEquals(JSON.parse(fastJSON), JSON.parse(jsonLib));
    }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

private static final SerializeConfig   mapping;
static {try{__CLR4_1_10196i196iluszwa6m.R.inc(58604);
    __CLR4_1_10196i196iluszwa6m.R.inc(58605);mapping = new SerializeConfig();
    __CLR4_1_10196i196iluszwa6m.R.inc(58606);mapping.put(Date.class, new JSONLibDataFormatSerializer()); // \u4f7f\u7528\u548cjson-lib\u517c\u5bb9\u7684\u65e5\u671f\u8f93\u51fa\u683c\u5f0f
}finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

private static final SerializerFeature[] features = { SerializerFeature.WriteMapNullValue, // \u8f93\u51fa\u7a7a\u7f6e\u5b57\u6bb5
        SerializerFeature.WriteNullListAsEmpty, // list\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3a[]\uff0c\u800c\u4e0d\u662fnull
        SerializerFeature.WriteNullNumberAsZero, // \u6570\u503c\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3a0\uff0c\u800c\u4e0d\u662fnull
        SerializerFeature.WriteNullBooleanAsFalse, // Boolean\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3afalse\uff0c\u800c\u4e0d\u662fnull
        SerializerFeature.WriteNullStringAsEmpty // \u5b57\u7b26\u7c7b\u578b\u5b57\u6bb5\u5982\u679c\u4e3anull\uff0c\u8f93\u51fa\u4e3a""\uff0c\u800c\u4e0d\u662fnull
                                                  };

// \u5e8f\u5217\u5316\u4e3a\u548cJSON-LIB\u517c\u5bb9\u7684\u5b57\u7b26\u4e32
public static String toCompatibleJSONString(Object object) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58607);

    __CLR4_1_10196i196iluszwa6m.R.inc(58608);return JSON.toJSONString(object, mapping, features);
}finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

    public static String toJSONLibString(Object object) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58609);
        __CLR4_1_10196i196iluszwa6m.R.inc(58610);net.sf.json.JSONObject obj = net.sf.json.JSONObject.fromObject(object);
        __CLR4_1_10196i196iluszwa6m.R.inc(58611);return obj.toString();
    }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

    public static class V4 {

        private Map<String, Object> items;

        public Map<String, Object> getItems() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58612);
            __CLR4_1_10196i196iluszwa6m.R.inc(58613);return items;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setItems(Map<String, Object> items) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58614);
            __CLR4_1_10196i196iluszwa6m.R.inc(58615);this.items = items;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

    }

    public static class V3 {

        private List<String> items;

        public List<String> getItems() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58616);
            __CLR4_1_10196i196iluszwa6m.R.inc(58617);return items;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setItems(List<String> items) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58618);
            __CLR4_1_10196i196iluszwa6m.R.inc(58619);this.items = items;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

    }

    public static class V2 {

        private float  f1;
        private double f2;

        private Float  f3;
        private Double f4;

        public float getF1() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58620);
            __CLR4_1_10196i196iluszwa6m.R.inc(58621);return f1;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setF1(float f1) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58622);
            __CLR4_1_10196i196iluszwa6m.R.inc(58623);this.f1 = f1;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public double getF2() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58624);
            __CLR4_1_10196i196iluszwa6m.R.inc(58625);return f2;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setF2(double f2) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58626);
            __CLR4_1_10196i196iluszwa6m.R.inc(58627);this.f2 = f2;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public Float getF3() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58628);
            __CLR4_1_10196i196iluszwa6m.R.inc(58629);return f3;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setF3(Float f3) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58630);
            __CLR4_1_10196i196iluszwa6m.R.inc(58631);this.f3 = f3;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public Double getF4() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58632);
            __CLR4_1_10196i196iluszwa6m.R.inc(58633);return f4;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setF4(Double f4) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58634);
            __CLR4_1_10196i196iluszwa6m.R.inc(58635);this.f4 = f4;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

    }

    public static class V1 {

        private Boolean   f1;
        private Character f2;
        private String    f3;
        private Date      date;

        private boolean   f4;
        private char      f5;

        public Boolean getF1() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58636);
            __CLR4_1_10196i196iluszwa6m.R.inc(58637);return f1;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setF1(Boolean f1) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58638);
            __CLR4_1_10196i196iluszwa6m.R.inc(58639);this.f1 = f1;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public Character getF2() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58640);
            __CLR4_1_10196i196iluszwa6m.R.inc(58641);return f2;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setF2(Character f2) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58642);
            __CLR4_1_10196i196iluszwa6m.R.inc(58643);this.f2 = f2;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public String getF3() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58644);
            __CLR4_1_10196i196iluszwa6m.R.inc(58645);return f3;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setF3(String f3) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58646);
            __CLR4_1_10196i196iluszwa6m.R.inc(58647);this.f3 = f3;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public Date getDate() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58648);
            __CLR4_1_10196i196iluszwa6m.R.inc(58649);return date;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setDate(Date date) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58650);
            __CLR4_1_10196i196iluszwa6m.R.inc(58651);this.date = date;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public boolean isF4() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58652);
            __CLR4_1_10196i196iluszwa6m.R.inc(58653);return f4;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setF4(boolean f4) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58654);
            __CLR4_1_10196i196iluszwa6m.R.inc(58655);this.f4 = f4;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public char getF5() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58656);
            __CLR4_1_10196i196iluszwa6m.R.inc(58657);return f5;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setF5(char f5) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58658);
            __CLR4_1_10196i196iluszwa6m.R.inc(58659);this.f5 = f5;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

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

        public Byte getF1() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58660);
            __CLR4_1_10196i196iluszwa6m.R.inc(58661);return f1;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setF1(Byte f1) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58662);
            __CLR4_1_10196i196iluszwa6m.R.inc(58663);this.f1 = f1;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public Short getF2() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58664);
            __CLR4_1_10196i196iluszwa6m.R.inc(58665);return f2;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setF2(Short f2) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58666);
            __CLR4_1_10196i196iluszwa6m.R.inc(58667);this.f2 = f2;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public Integer getF3() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58668);
            __CLR4_1_10196i196iluszwa6m.R.inc(58669);return f3;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setF3(Integer f3) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58670);
            __CLR4_1_10196i196iluszwa6m.R.inc(58671);this.f3 = f3;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public Long getF4() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58672);
            __CLR4_1_10196i196iluszwa6m.R.inc(58673);return f4;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setF4(Long f4) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58674);
            __CLR4_1_10196i196iluszwa6m.R.inc(58675);this.f4 = f4;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public BigInteger getF5() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58676);
            __CLR4_1_10196i196iluszwa6m.R.inc(58677);return f5;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setF5(BigInteger f5) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58678);
            __CLR4_1_10196i196iluszwa6m.R.inc(58679);this.f5 = f5;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public BigDecimal getF6() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58680);
            __CLR4_1_10196i196iluszwa6m.R.inc(58681);return f6;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setF6(BigDecimal f6) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58682);
            __CLR4_1_10196i196iluszwa6m.R.inc(58683);this.f6 = f6;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public byte getF7() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58684);
            __CLR4_1_10196i196iluszwa6m.R.inc(58685);return f7;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setF7(byte f7) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58686);
            __CLR4_1_10196i196iluszwa6m.R.inc(58687);this.f7 = f7;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public short getF8() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58688);
            __CLR4_1_10196i196iluszwa6m.R.inc(58689);return f8;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setF8(short f8) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58690);
            __CLR4_1_10196i196iluszwa6m.R.inc(58691);this.f8 = f8;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public int getF9() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58692);
            __CLR4_1_10196i196iluszwa6m.R.inc(58693);return f9;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setF9(int f9) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58694);
            __CLR4_1_10196i196iluszwa6m.R.inc(58695);this.f9 = f9;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public long getF10() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58696);
            __CLR4_1_10196i196iluszwa6m.R.inc(58697);return f10;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setF10(long f10) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58698);
            __CLR4_1_10196i196iluszwa6m.R.inc(58699);this.f10 = f10;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public BigDecimal getSalary() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58700);
            __CLR4_1_10196i196iluszwa6m.R.inc(58701);return salary;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setSalary(BigDecimal salary) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58702);
            __CLR4_1_10196i196iluszwa6m.R.inc(58703);this.salary = salary;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public int getId() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58704);
            __CLR4_1_10196i196iluszwa6m.R.inc(58705);return id;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58706);
            __CLR4_1_10196i196iluszwa6m.R.inc(58707);this.id = id;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58708);
            __CLR4_1_10196i196iluszwa6m.R.inc(58709);return name;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58710);
            __CLR4_1_10196i196iluszwa6m.R.inc(58711);this.name = name;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public List<String> getItems() {try{__CLR4_1_10196i196iluszwa6m.R.inc(58712);
            __CLR4_1_10196i196iluszwa6m.R.inc(58713);return items;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

        public void setItems(List<String> items) {try{__CLR4_1_10196i196iluszwa6m.R.inc(58714);
            __CLR4_1_10196i196iluszwa6m.R.inc(58715);this.items = items;
        }finally{__CLR4_1_10196i196iluszwa6m.R.flushNeeded();}}

    }
}
