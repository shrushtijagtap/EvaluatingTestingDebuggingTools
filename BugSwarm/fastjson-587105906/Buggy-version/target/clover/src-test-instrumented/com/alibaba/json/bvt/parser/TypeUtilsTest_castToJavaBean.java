/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.lang.reflect.Field;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

import com.alibaba.fastjson.parser.ParserConfig;
import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.util.TypeUtils;

import junit.framework.TestCase;

public class TypeUtilsTest_castToJavaBean extends TestCase {static class __CLR4_1_101iyo1iyolusqke7m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,71368,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71232);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71233);ParserConfig.global.addAccept("com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.");
    }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}

    public void test_castToJavaBean_StackTraceElement() throws Exception {__CLR4_1_101iyo1iyolusqke7m.R.globalSliceStart(getClass().getName(),71234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10j4cn1c1iyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iyo1iyolusqke7m.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iyo1iyolusqke7m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_castToJavaBean_StackTraceElement",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71234,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10j4cn1c1iyq() throws Exception{try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71234);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71235);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71236);map.put("className", "java.lang.Object");
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71237);map.put("methodName", "hashCode");
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71238);StackTraceElement element = TypeUtils.castToJavaBean(map, StackTraceElement.class, null);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71239);Assert.assertEquals("java.lang.Object", element.getClassName());
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71240);Assert.assertEquals("hashCode", element.getMethodName());
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71241);Assert.assertEquals(null, element.getFileName());
    }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}

    public void test_castToJavaBean_StackTraceElement_1() throws Exception {__CLR4_1_101iyo1iyolusqke7m.R.globalSliceStart(getClass().getName(),71242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10q1jjbm1iyy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iyo1iyolusqke7m.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iyo1iyolusqke7m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_castToJavaBean_StackTraceElement_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71242,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10q1jjbm1iyy() throws Exception{try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71242);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71243);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71244);map.put("className", "java.lang.Object");
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71245);map.put("methodName", "hashCode");
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71246);map.put("lineNumber", 12);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71247);StackTraceElement element = TypeUtils.castToJavaBean(map, StackTraceElement.class, null);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71248);Assert.assertEquals("java.lang.Object", element.getClassName());
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71249);Assert.assertEquals("hashCode", element.getMethodName());
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71250);Assert.assertEquals(null, element.getFileName());
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71251);Assert.assertEquals(12, element.getLineNumber());
    }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}

    public void test_castToJavaBean_type() throws Exception {__CLR4_1_101iyo1iyolusqke7m.R.globalSliceStart(getClass().getName(),71252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yavzt1iz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iyo1iyolusqke7m.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iyo1iyolusqke7m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_castToJavaBean_type",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71252,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yavzt1iz8() throws Exception{try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71252);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71253);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71254);map.put("@type", "java.lang.StackTraceElement");
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71255);map.put("className", "java.lang.Object");
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71256);map.put("methodName", "hashCode");
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71257);map.put("lineNumber", 12);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71258);StackTraceElement element = (StackTraceElement) TypeUtils.castToJavaBean(map, Object.class, null);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71259);Assert.assertEquals("java.lang.Object", element.getClassName());
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71260);Assert.assertEquals("hashCode", element.getMethodName());
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71261);Assert.assertEquals(null, element.getFileName());
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71262);Assert.assertEquals(12, element.getLineNumber());
    }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101iyo1iyolusqke7m.R.globalSliceStart(getClass().getName(),71263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1izj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iyo1iyolusqke7m.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iyo1iyolusqke7m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71263,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1izj() throws Exception{try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71263);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71264);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71265);map.put("@type", "xxx");
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71266);Exception error = null;
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71267);try {
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71268);TypeUtils.castToJavaBean(map, Object.class, null);
        } catch (Exception ex) {
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71269);error = ex;
        }
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71270);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}

    public void test_error2() throws Exception {__CLR4_1_101iyo1iyolusqke7m.R.globalSliceStart(getClass().getName(),71271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104vg1sy1izr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iyo1iyolusqke7m.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iyo1iyolusqke7m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_error2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71271,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104vg1sy1izr() throws Exception{try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71271);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71272);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71273);map.put("@type", "");
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71274);Exception error = null;
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71275);try {
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71276);TypeUtils.castToJavaBean(map, Object.class, null);
        } catch (Exception ex) {
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71277);error = ex;
        }
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71278);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}

    public void test_mapping() throws Exception {__CLR4_1_101iyo1iyolusqke7m.R.globalSliceStart(getClass().getName(),71279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101rvqko1izz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iyo1iyolusqke7m.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iyo1iyolusqke7m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_mapping",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71279,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101rvqko1izz() throws Exception{try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71279);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71280);addClassMapping("my_xxx", VO.class);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71281);addClassMapping(null, VO.class);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71282);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71283);map.put("@type", "my_xxx");
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71284);map.put("id", 123);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71285);VO vo = (VO) TypeUtils.castToJavaBean(map, Object.class);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71286);Assert.assertEquals(123, vo.getId());
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71287);TypeUtils.clearClassMapping();
    }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}
    
    public static void addClassMapping(String className, Class<?> clazz) throws Exception {try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71288);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71289);Field field = TypeUtils.class.getDeclaredField("mappings");
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71290);field.setAccessible(true);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71291);field.get(null);
        
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71292);ConcurrentMap<String, Class<?>> mappings = (ConcurrentMap<String, Class<?>>) field.get(null);
        
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71293);if ((((className == null)&&(__CLR4_1_101iyo1iyolusqke7m.R.iget(71294)!=0|true))||(__CLR4_1_101iyo1iyolusqke7m.R.iget(71295)==0&false))) {{
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71296);className = clazz.getName();
        }

        }__CLR4_1_101iyo1iyolusqke7m.R.inc(71297);mappings.put(className, clazz);
    }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}

    public void test_interface() throws Exception {__CLR4_1_101iyo1iyolusqke7m.R.globalSliceStart(getClass().getName(),71298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108tv72r1j0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iyo1iyolusqke7m.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iyo1iyolusqke7m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_interface",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71298,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108tv72r1j0i() throws Exception{try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71298);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71299);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71300);map.put("id", 123);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71301);VO vo = TypeUtils.castToJavaBean(map, VO.class);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71302);Assert.assertEquals(123, vo.getId());
    }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}

    public void test_bean() throws Exception {__CLR4_1_101iyo1iyolusqke7m.R.globalSliceStart(getClass().getName(),71303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kwbd3w1j0n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iyo1iyolusqke7m.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iyo1iyolusqke7m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_bean",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71303,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kwbd3w1j0n() throws Exception{try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71303);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71304);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71305);map.put("id", 123);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71306);Entity vo = TypeUtils.castToJavaBean(map, Entity.class);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71307);Assert.assertEquals(123, vo.getId());

        __CLR4_1_101iyo1iyolusqke7m.R.inc(71308);Assert.assertEquals("{\"id\":123}", JSON.toJSONString(vo));
    }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}

    public void test_loadClass() throws Exception {__CLR4_1_101iyo1iyolusqke7m.R.globalSliceStart(getClass().getName(),71309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dgqx781j0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iyo1iyolusqke7m.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iyo1iyolusqke7m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_loadClass",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71309,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dgqx781j0t() throws Exception{try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71309);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71310);Assert.assertNull(TypeUtils.loadClass(null));
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71311);Assert.assertNull(TypeUtils.loadClass(""));
    }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}

    public void test_loadClass_1() throws Exception {__CLR4_1_101iyo1iyolusqke7m.R.globalSliceStart(getClass().getName(),71312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1089dzz61j0w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iyo1iyolusqke7m.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iyo1iyolusqke7m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_loadClass_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71312,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1089dzz61j0w() throws Exception{try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71312);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71313);TypeUtils.clearClassMapping();
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71314);ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71315);Thread.currentThread().setContextClassLoader(new TestLoader());
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71316);try {
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71317);Assert.assertEquals(VO.class,
                                TypeUtils.loadClass("com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean$VO"));
        } finally {
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71318);Thread.currentThread().setContextClassLoader(contextClassLoader);
        }
    }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}

    public void test_loadClass_2() throws Exception {__CLR4_1_101iyo1iyolusqke7m.R.globalSliceStart(getClass().getName(),71319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1050e16p1j13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iyo1iyolusqke7m.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iyo1iyolusqke7m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_loadClass_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71319,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1050e16p1j13() throws Exception{try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71319);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71320);TypeUtils.clearClassMapping();
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71321);ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71322);Thread.currentThread().setContextClassLoader(new TestLoader());
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71323);try {
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71324);Assert.assertNull(TypeUtils.loadClass("xxx_xx"));
        } finally {
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71325);Thread.currentThread().setContextClassLoader(contextClassLoader);
        }
    }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}
    
    public void test_bean_2() throws Exception {__CLR4_1_101iyo1iyolusqke7m.R.globalSliceStart(getClass().getName(),71326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qjavav1j1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iyo1iyolusqke7m.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iyo1iyolusqke7m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_bean_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71326,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qjavav1j1a() throws Exception{try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71326);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71327);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71328);map.put("id", 123);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71329);PO vo = TypeUtils.castToJavaBean(map, PO.class);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71330);Assert.assertEquals(123, vo.id);
        
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71331);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101iyo1iyolusqke7m.R.inc(71332);try {
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71333);SerializeConfig config = new SerializeConfig();
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71334);JSONSerializer serializer = new JSONSerializer(out, config);
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71335);config.put(PO.class, new JavaBeanSerializer(PO.class, Collections.singletonMap("id", "ID")));

            __CLR4_1_101iyo1iyolusqke7m.R.inc(71336);serializer.write(vo);

            __CLR4_1_101iyo1iyolusqke7m.R.inc(71337);Assert.assertEquals("{\"ID\":123}", out.toString());
        } finally {
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71338);out.close();
        }

        
    }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}
    
    public void test_bean_3() throws Exception {__CLR4_1_101iyo1iyolusqke7m.R.globalSliceStart(getClass().getName(),71339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tsau3c1j1n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iyo1iyolusqke7m.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iyo1iyolusqke7m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_bean_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71339,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tsau3c1j1n() throws Exception{try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71339);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71340);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71341);map.put("id", 123);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71342);PO vo = TypeUtils.castToJavaBean(map, PO.class);
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71343);Assert.assertEquals(123, vo.id);
        
        __CLR4_1_101iyo1iyolusqke7m.R.inc(71344);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101iyo1iyolusqke7m.R.inc(71345);try {
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71346);SerializeConfig config = new SerializeConfig();
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71347);JSONSerializer serializer = new JSONSerializer(out, config);
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71348);config.put(PO.class, new JavaBeanSerializer(PO.class, Collections.singletonMap("id", (String) null)));

            __CLR4_1_101iyo1iyolusqke7m.R.inc(71349);serializer.write(vo);

            __CLR4_1_101iyo1iyolusqke7m.R.inc(71350);Assert.assertEquals("{}", out.toString());
        } finally {
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71351);out.close();
        }

        
    }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}

    public static interface VO {

        void setId(int value);

        int getId();

        ClassLoader getClassLoader();
    }

    public static class Entity {

        private int    id;
        protected String name;

        public int getId() {try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71352);
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71353);return id;
        }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71354);
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71355);this.id = id;
        }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}

        protected String getName() {try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71356);
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71357);return name;
        }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}

        protected void setName(String name) {try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71358);
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71359);this.name = name;
        }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}

        public ClassLoader getClassLoader() {try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71360);
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71361);return Entity.class.getClassLoader();
        }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}
    }
    
    private static class PO {
        public int id;
    }

    public static class TestLoader extends ClassLoader {

        public TestLoader(){
            super(null);__CLR4_1_101iyo1iyolusqke7m.R.inc(71363);try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71362);
        }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}

        public URL getResource(String name) {try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71364);
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71365);return null;
        }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}

        public Class<?> loadClass(String name) throws ClassNotFoundException {try{__CLR4_1_101iyo1iyolusqke7m.R.inc(71366);
            __CLR4_1_101iyo1iyolusqke7m.R.inc(71367);throw new ClassNotFoundException();
        }finally{__CLR4_1_101iyo1iyolusqke7m.R.flushNeeded();}}
    }
}
