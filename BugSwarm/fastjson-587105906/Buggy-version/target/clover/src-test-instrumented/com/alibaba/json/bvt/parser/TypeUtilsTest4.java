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
public class TypeUtilsTest4 extends TestCase {static class __CLR4_1_101jui1juiluszwctr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,72406,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_array() throws Exception {__CLR4_1_101jui1juiluszwctr.R.globalSliceStart(getClass().getName(),72378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vw0vd91jui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jui1juiluszwctr.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jui1juiluszwctr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest4.test_array",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72378,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vw0vd91jui() throws Exception{try{__CLR4_1_101jui1juiluszwctr.R.inc(72378);
        __CLR4_1_101jui1juiluszwctr.R.inc(72379);Assert.assertEquals(0, TypeUtils.cast(new Entity[0], Object[].class, null).length);
    }finally{__CLR4_1_101jui1juiluszwctr.R.flushNeeded();}}

    public void test_ParameterizedType() throws Exception {__CLR4_1_101jui1juiluszwctr.R.globalSliceStart(getClass().getName(),72380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104cffcj1juk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jui1juiluszwctr.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jui1juiluszwctr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest4.test_ParameterizedType",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72380,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104cffcj1juk() throws Exception{try{__CLR4_1_101jui1juiluszwctr.R.inc(72380);
        __CLR4_1_101jui1juiluszwctr.R.inc(72381);Assert.assertEquals(Integer.valueOf(123),
                            ((ArrayList<Object>) TypeUtils.cast(Collections.singleton(123),
                                                                new TypeReference<ArrayList<Object>>() {
                                                                }.getType(), null)).get(0));
    }finally{__CLR4_1_101jui1juiluszwctr.R.flushNeeded();}}

    public void test_ParameterizedType2() throws Exception {__CLR4_1_101jui1juiluszwctr.R.globalSliceStart(getClass().getName(),72382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kvpx711jum();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jui1juiluszwctr.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jui1juiluszwctr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest4.test_ParameterizedType2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72382,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kvpx711jum() throws Exception{try{__CLR4_1_101jui1juiluszwctr.R.inc(72382);
        __CLR4_1_101jui1juiluszwctr.R.inc(72383);Assert.assertEquals("123",
                            ((HashMap<Object, String>) TypeUtils.cast(Collections.singletonMap("name", 123),
                                                                      new TypeReference<HashMap<Object, String>>() {
                                                                      }.getType(), null)).get("name"));
    }finally{__CLR4_1_101jui1juiluszwctr.R.flushNeeded();}}

    public void test_ParameterizedType_error() throws Exception {__CLR4_1_101jui1juiluszwctr.R.globalSliceStart(getClass().getName(),72384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105pcg0a1juo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jui1juiluszwctr.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jui1juiluszwctr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest4.test_ParameterizedType_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72384,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105pcg0a1juo() throws Exception{try{__CLR4_1_101jui1juiluszwctr.R.inc(72384);
        __CLR4_1_101jui1juiluszwctr.R.inc(72385);Exception error = null;
        __CLR4_1_101jui1juiluszwctr.R.inc(72386);try {
            __CLR4_1_101jui1juiluszwctr.R.inc(72387);TypeUtils.cast(Collections.singleton(123), new TypeReference<HashMap<Object, String>>() {
            }.getType(), null);
        } catch (Exception ex) {
            __CLR4_1_101jui1juiluszwctr.R.inc(72388);error = ex;
        }
        __CLR4_1_101jui1juiluszwctr.R.inc(72389);Assert.assertNotNull(error);
    }finally{__CLR4_1_101jui1juiluszwctr.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101jui1juiluszwctr.R.globalSliceStart(getClass().getName(),72390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1juu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jui1juiluszwctr.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jui1juiluszwctr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest4.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72390,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1juu() throws Exception{try{__CLR4_1_101jui1juiluszwctr.R.inc(72390);
        __CLR4_1_101jui1juiluszwctr.R.inc(72391);Exception error = null;
        __CLR4_1_101jui1juiluszwctr.R.inc(72392);try {
            __CLR4_1_101jui1juiluszwctr.R.inc(72393);TypeUtils.cast("xxx", Object[].class, null);
        } catch (Exception ex) {
            __CLR4_1_101jui1juiluszwctr.R.inc(72394);error = ex;
        }
        __CLR4_1_101jui1juiluszwctr.R.inc(72395);Assert.assertNotNull(error);
    }finally{__CLR4_1_101jui1juiluszwctr.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101jui1juiluszwctr.R.globalSliceStart(getClass().getName(),72396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1jv0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jui1juiluszwctr.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jui1juiluszwctr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest4.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72396,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1jv0() throws Exception{try{__CLR4_1_101jui1juiluszwctr.R.inc(72396);
        __CLR4_1_101jui1juiluszwctr.R.inc(72397);Exception error = null;
        __CLR4_1_101jui1juiluszwctr.R.inc(72398);try {
            __CLR4_1_101jui1juiluszwctr.R.inc(72399);TypeUtils.cast(123, new TypeReference<Object[]>() {
            }.getType(), null);
        } catch (Exception ex) {
            __CLR4_1_101jui1juiluszwctr.R.inc(72400);error = ex;
        }
        __CLR4_1_101jui1juiluszwctr.R.inc(72401);Assert.assertNotNull(error);
    }finally{__CLR4_1_101jui1juiluszwctr.R.flushNeeded();}}

    public void test_exception() throws Exception {__CLR4_1_101jui1juiluszwctr.R.globalSliceStart(getClass().getName(),72402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104h5gd31jv6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jui1juiluszwctr.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jui1juiluszwctr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest4.test_exception",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72402,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104h5gd31jv6() throws Exception{try{__CLR4_1_101jui1juiluszwctr.R.inc(72402);
        __CLR4_1_101jui1juiluszwctr.R.inc(72403);JSONObject object = (JSONObject) JSON.toJSON(new RuntimeException());
        __CLR4_1_101jui1juiluszwctr.R.inc(72404);object.put("class", "xxx");
        __CLR4_1_101jui1juiluszwctr.R.inc(72405);Assert.assertEquals(Exception.class, JSON.parseObject(object.toJSONString(), Exception.class).getClass());
    }finally{__CLR4_1_101jui1juiluszwctr.R.flushNeeded();}}

    public static class Entity {

    }
}
