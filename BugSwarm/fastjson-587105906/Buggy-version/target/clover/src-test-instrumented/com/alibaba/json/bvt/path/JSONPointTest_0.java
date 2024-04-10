/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;

import junit.framework.TestCase;

@SuppressWarnings("unchecked")
public class JSONPointTest_0 extends TestCase {static class __CLR4_1_101quk1qukluszweoy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,81472,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private JSONObject json;

    protected void setUp() throws Exception {try{__CLR4_1_101quk1qukluszweoy.R.inc(81452);
        __CLR4_1_101quk1qukluszweoy.R.inc(81453);String text = "{\"foo\":[\"bar\",\"baz\"],\"pi\":3.1416,\"ext\":{\"ex1\":1,\"ex2\":\"abc\"}}";
        __CLR4_1_101quk1qukluszweoy.R.inc(81454);json = JSON.parseObject(text);
    }finally{__CLR4_1_101quk1qukluszweoy.R.flushNeeded();}}

    public void test_list() throws Exception {__CLR4_1_101quk1qukluszweoy.R.globalSliceStart(getClass().getName(),81455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1059ny8i1qun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101quk1qukluszweoy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101quk1qukluszweoy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPointTest_0.test_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81455,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1059ny8i1qun() throws Exception{try{__CLR4_1_101quk1qukluszweoy.R.inc(81455);
        __CLR4_1_101quk1qukluszweoy.R.inc(81456);List<Object> list = (List<Object>) JSONPath.eval(json, "/foo");
        __CLR4_1_101quk1qukluszweoy.R.inc(81457);Assert.assertEquals(2, list.size());
        __CLR4_1_101quk1qukluszweoy.R.inc(81458);Assert.assertEquals("bar", list.get(0));
        __CLR4_1_101quk1qukluszweoy.R.inc(81459);Assert.assertEquals("baz", list.get(1));
    }finally{__CLR4_1_101quk1qukluszweoy.R.flushNeeded();}}
    
    public void test_list_0() throws Exception {__CLR4_1_101quk1qukluszweoy.R.globalSliceStart(getClass().getName(),81460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kr5c6b1qus();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101quk1qukluszweoy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101quk1qukluszweoy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPointTest_0.test_list_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81460,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kr5c6b1qus() throws Exception{try{__CLR4_1_101quk1qukluszweoy.R.inc(81460);
        __CLR4_1_101quk1qukluszweoy.R.inc(81461);Object val = JSONPath.eval(json, "/foo/0");
        __CLR4_1_101quk1qukluszweoy.R.inc(81462);Assert.assertEquals("bar", val);
    }finally{__CLR4_1_101quk1qukluszweoy.R.flushNeeded();}}
    
    public void test_list_1() throws Exception {__CLR4_1_101quk1qukluszweoy.R.globalSliceStart(getClass().getName(),81463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10o05ays1quv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101quk1qukluszweoy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101quk1qukluszweoy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPointTest_0.test_list_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81463,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10o05ays1quv() throws Exception{try{__CLR4_1_101quk1qukluszweoy.R.inc(81463);
        __CLR4_1_101quk1qukluszweoy.R.inc(81464);Object val = JSONPath.eval(json, "/foo/1");
        __CLR4_1_101quk1qukluszweoy.R.inc(81465);Assert.assertEquals("baz", val);
    }finally{__CLR4_1_101quk1qukluszweoy.R.flushNeeded();}}
    
    public void test_key() throws Exception {__CLR4_1_101quk1qukluszweoy.R.globalSliceStart(getClass().getName(),81466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101643d1quy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101quk1qukluszweoy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101quk1qukluszweoy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPointTest_0.test_key",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81466,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101643d1quy() throws Exception{try{__CLR4_1_101quk1qukluszweoy.R.inc(81466);
        __CLR4_1_101quk1qukluszweoy.R.inc(81467);Object val = JSONPath.eval(json, "/pi");
        __CLR4_1_101quk1qukluszweoy.R.inc(81468);Assert.assertEquals(new BigDecimal("3.1416"), val);
    }finally{__CLR4_1_101quk1qukluszweoy.R.flushNeeded();}}
    
    public void test_key_1() throws Exception {__CLR4_1_101quk1qukluszweoy.R.globalSliceStart(getClass().getName(),81469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zezk171qv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101quk1qukluszweoy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101quk1qukluszweoy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPointTest_0.test_key_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81469,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zezk171qv1() throws Exception{try{__CLR4_1_101quk1qukluszweoy.R.inc(81469);
        __CLR4_1_101quk1qukluszweoy.R.inc(81470);Object val = JSONPath.eval(json, "/ext/ex1");
        __CLR4_1_101quk1qukluszweoy.R.inc(81471);Assert.assertEquals(1, val);
    }finally{__CLR4_1_101quk1qukluszweoy.R.flushNeeded();}}
}
