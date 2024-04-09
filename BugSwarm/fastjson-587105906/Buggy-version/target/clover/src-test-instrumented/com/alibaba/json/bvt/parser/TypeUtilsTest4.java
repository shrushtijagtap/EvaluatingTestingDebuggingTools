/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.util.TypeUtils;

@SuppressWarnings("unchecked")
public class TypeUtilsTest4 extends TestCase {static class __CLR4_1_101iwa1iwalusqke5j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,71174,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_array() throws Exception {__CLR4_1_101iwa1iwalusqke5j.R.globalSliceStart(getClass().getName(),71146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vw0vd91iwa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iwa1iwalusqke5j.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iwa1iwalusqke5j.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest4.test_array",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71146,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vw0vd91iwa() throws Exception{try{__CLR4_1_101iwa1iwalusqke5j.R.inc(71146);
        __CLR4_1_101iwa1iwalusqke5j.R.inc(71147);Assert.assertEquals(0, TypeUtils.cast(new Entity[0], Object[].class, null).length);
    }finally{__CLR4_1_101iwa1iwalusqke5j.R.flushNeeded();}}

    public void test_ParameterizedType() throws Exception {__CLR4_1_101iwa1iwalusqke5j.R.globalSliceStart(getClass().getName(),71148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104cffcj1iwc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iwa1iwalusqke5j.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iwa1iwalusqke5j.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest4.test_ParameterizedType",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71148,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104cffcj1iwc() throws Exception{try{__CLR4_1_101iwa1iwalusqke5j.R.inc(71148);
        __CLR4_1_101iwa1iwalusqke5j.R.inc(71149);Assert.assertEquals(Integer.valueOf(123),
                            ((ArrayList<Object>) TypeUtils.cast(Collections.singleton(123),
                                                                new TypeReference<ArrayList<Object>>() {
                                                                }.getType(), null)).get(0));
    }finally{__CLR4_1_101iwa1iwalusqke5j.R.flushNeeded();}}

    public void test_ParameterizedType2() throws Exception {__CLR4_1_101iwa1iwalusqke5j.R.globalSliceStart(getClass().getName(),71150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kvpx711iwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iwa1iwalusqke5j.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iwa1iwalusqke5j.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest4.test_ParameterizedType2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71150,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kvpx711iwe() throws Exception{try{__CLR4_1_101iwa1iwalusqke5j.R.inc(71150);
        __CLR4_1_101iwa1iwalusqke5j.R.inc(71151);Assert.assertEquals("123",
                            ((HashMap<Object, String>) TypeUtils.cast(Collections.singletonMap("name", 123),
                                                                      new TypeReference<HashMap<Object, String>>() {
                                                                      }.getType(), null)).get("name"));
    }finally{__CLR4_1_101iwa1iwalusqke5j.R.flushNeeded();}}

    public void test_ParameterizedType_error() throws Exception {__CLR4_1_101iwa1iwalusqke5j.R.globalSliceStart(getClass().getName(),71152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105pcg0a1iwg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iwa1iwalusqke5j.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iwa1iwalusqke5j.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest4.test_ParameterizedType_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71152,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105pcg0a1iwg() throws Exception{try{__CLR4_1_101iwa1iwalusqke5j.R.inc(71152);
        __CLR4_1_101iwa1iwalusqke5j.R.inc(71153);Exception error = null;
        __CLR4_1_101iwa1iwalusqke5j.R.inc(71154);try {
            __CLR4_1_101iwa1iwalusqke5j.R.inc(71155);TypeUtils.cast(Collections.singleton(123), new TypeReference<HashMap<Object, String>>() {
            }.getType(), null);
        } catch (Exception ex) {
            __CLR4_1_101iwa1iwalusqke5j.R.inc(71156);error = ex;
        }
        __CLR4_1_101iwa1iwalusqke5j.R.inc(71157);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iwa1iwalusqke5j.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101iwa1iwalusqke5j.R.globalSliceStart(getClass().getName(),71158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1iwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iwa1iwalusqke5j.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iwa1iwalusqke5j.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest4.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71158,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1iwm() throws Exception{try{__CLR4_1_101iwa1iwalusqke5j.R.inc(71158);
        __CLR4_1_101iwa1iwalusqke5j.R.inc(71159);Exception error = null;
        __CLR4_1_101iwa1iwalusqke5j.R.inc(71160);try {
            __CLR4_1_101iwa1iwalusqke5j.R.inc(71161);TypeUtils.cast("xxx", Object[].class, null);
        } catch (Exception ex) {
            __CLR4_1_101iwa1iwalusqke5j.R.inc(71162);error = ex;
        }
        __CLR4_1_101iwa1iwalusqke5j.R.inc(71163);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iwa1iwalusqke5j.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101iwa1iwalusqke5j.R.globalSliceStart(getClass().getName(),71164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1iws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iwa1iwalusqke5j.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iwa1iwalusqke5j.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest4.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71164,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1iws() throws Exception{try{__CLR4_1_101iwa1iwalusqke5j.R.inc(71164);
        __CLR4_1_101iwa1iwalusqke5j.R.inc(71165);Exception error = null;
        __CLR4_1_101iwa1iwalusqke5j.R.inc(71166);try {
            __CLR4_1_101iwa1iwalusqke5j.R.inc(71167);TypeUtils.cast(123, new TypeReference<Object[]>() {
            }.getType(), null);
        } catch (Exception ex) {
            __CLR4_1_101iwa1iwalusqke5j.R.inc(71168);error = ex;
        }
        __CLR4_1_101iwa1iwalusqke5j.R.inc(71169);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iwa1iwalusqke5j.R.flushNeeded();}}

    public void test_exception() throws Exception {__CLR4_1_101iwa1iwalusqke5j.R.globalSliceStart(getClass().getName(),71170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104h5gd31iwy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iwa1iwalusqke5j.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iwa1iwalusqke5j.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest4.test_exception",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71170,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104h5gd31iwy() throws Exception{try{__CLR4_1_101iwa1iwalusqke5j.R.inc(71170);
        __CLR4_1_101iwa1iwalusqke5j.R.inc(71171);JSONObject object = (JSONObject) JSON.toJSON(new RuntimeException());
        __CLR4_1_101iwa1iwalusqke5j.R.inc(71172);object.put("class", "xxx");
        __CLR4_1_101iwa1iwalusqke5j.R.inc(71173);Assert.assertEquals(Exception.class, JSON.parseObject(object.toJSONString(), Exception.class).getClass());
    }finally{__CLR4_1_101iwa1iwalusqke5j.R.flushNeeded();}}

    public static class Entity {

    }
}
