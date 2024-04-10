/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

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

public class TypeUtilsTest_castToJavaBean extends TestCase {static class __CLR4_5_21iyd1iydlusyjtv4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,71357,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71221);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71222);ParserConfig.global.addAccept("com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.");
    }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}

    public void test_castToJavaBean_StackTraceElement() throws Exception {__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceStart(getClass().getName(),71223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j4cn1c1iyf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iyd1iydlusyjtv4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_castToJavaBean_StackTraceElement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71223,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j4cn1c1iyf() throws Exception{try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71223);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71224);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71225);map.put("className", "java.lang.Object");
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71226);map.put("methodName", "hashCode");
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71227);StackTraceElement element = TypeUtils.castToJavaBean(map, StackTraceElement.class, null);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71228);Assert.assertEquals("java.lang.Object", element.getClassName());
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71229);Assert.assertEquals("hashCode", element.getMethodName());
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71230);Assert.assertEquals(null, element.getFileName());
    }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}

    public void test_castToJavaBean_StackTraceElement_1() throws Exception {__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceStart(getClass().getName(),71231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q1jjbm1iyn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iyd1iydlusyjtv4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_castToJavaBean_StackTraceElement_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71231,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q1jjbm1iyn() throws Exception{try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71231);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71232);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71233);map.put("className", "java.lang.Object");
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71234);map.put("methodName", "hashCode");
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71235);map.put("lineNumber", 12);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71236);StackTraceElement element = TypeUtils.castToJavaBean(map, StackTraceElement.class, null);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71237);Assert.assertEquals("java.lang.Object", element.getClassName());
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71238);Assert.assertEquals("hashCode", element.getMethodName());
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71239);Assert.assertEquals(null, element.getFileName());
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71240);Assert.assertEquals(12, element.getLineNumber());
    }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}

    public void test_castToJavaBean_type() throws Exception {__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceStart(getClass().getName(),71241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yavzt1iyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iyd1iydlusyjtv4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_castToJavaBean_type",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71241,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yavzt1iyx() throws Exception{try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71241);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71242);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71243);map.put("@type", "java.lang.StackTraceElement");
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71244);map.put("className", "java.lang.Object");
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71245);map.put("methodName", "hashCode");
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71246);map.put("lineNumber", 12);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71247);StackTraceElement element = (StackTraceElement) TypeUtils.castToJavaBean(map, Object.class, null);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71248);Assert.assertEquals("java.lang.Object", element.getClassName());
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71249);Assert.assertEquals("hashCode", element.getMethodName());
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71250);Assert.assertEquals(null, element.getFileName());
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71251);Assert.assertEquals(12, element.getLineNumber());
    }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceStart(getClass().getName(),71252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1iz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iyd1iydlusyjtv4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71252,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1iz8() throws Exception{try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71252);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71253);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71254);map.put("@type", "xxx");
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71255);Exception error = null;
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71256);try {
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71257);TypeUtils.castToJavaBean(map, Object.class, null);
        } catch (Exception ex) {
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71258);error = ex;
        }
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71259);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}

    public void test_error2() throws Exception {__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceStart(getClass().getName(),71260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24vg1sy1izg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iyd1iydlusyjtv4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_error2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71260,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24vg1sy1izg() throws Exception{try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71260);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71261);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71262);map.put("@type", "");
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71263);Exception error = null;
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71264);try {
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71265);TypeUtils.castToJavaBean(map, Object.class, null);
        } catch (Exception ex) {
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71266);error = ex;
        }
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71267);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}

    public void test_mapping() throws Exception {__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceStart(getClass().getName(),71268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21rvqko1izo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iyd1iydlusyjtv4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_mapping",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71268,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21rvqko1izo() throws Exception{try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71268);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71269);addClassMapping("my_xxx", VO.class);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71270);addClassMapping(null, VO.class);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71271);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71272);map.put("@type", "my_xxx");
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71273);map.put("id", 123);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71274);VO vo = (VO) TypeUtils.castToJavaBean(map, Object.class);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71275);Assert.assertEquals(123, vo.getId());
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71276);TypeUtils.clearClassMapping();
    }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}
    
    public static void addClassMapping(String className, Class<?> clazz) throws Exception {try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71277);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71278);Field field = TypeUtils.class.getDeclaredField("mappings");
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71279);field.setAccessible(true);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71280);field.get(null);
        
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71281);ConcurrentMap<String, Class<?>> mappings = (ConcurrentMap<String, Class<?>>) field.get(null);
        
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71282);if ((((className == null)&&(__CLR4_5_21iyd1iydlusyjtv4.R.iget(71283)!=0|true))||(__CLR4_5_21iyd1iydlusyjtv4.R.iget(71284)==0&false))) {{
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71285);className = clazz.getName();
        }

        }__CLR4_5_21iyd1iydlusyjtv4.R.inc(71286);mappings.put(className, clazz);
    }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}

    public void test_interface() throws Exception {__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceStart(getClass().getName(),71287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28tv72r1j07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iyd1iydlusyjtv4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_interface",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71287,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28tv72r1j07() throws Exception{try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71287);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71288);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71289);map.put("id", 123);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71290);VO vo = TypeUtils.castToJavaBean(map, VO.class);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71291);Assert.assertEquals(123, vo.getId());
    }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}

    public void test_bean() throws Exception {__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceStart(getClass().getName(),71292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kwbd3w1j0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iyd1iydlusyjtv4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_bean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71292,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kwbd3w1j0c() throws Exception{try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71292);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71293);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71294);map.put("id", 123);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71295);Entity vo = TypeUtils.castToJavaBean(map, Entity.class);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71296);Assert.assertEquals(123, vo.getId());

        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71297);Assert.assertEquals("{\"id\":123}", JSON.toJSONString(vo));
    }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}

    public void test_loadClass() throws Exception {__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceStart(getClass().getName(),71298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dgqx781j0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iyd1iydlusyjtv4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_loadClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71298,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dgqx781j0i() throws Exception{try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71298);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71299);Assert.assertNull(TypeUtils.loadClass(null));
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71300);Assert.assertNull(TypeUtils.loadClass(""));
    }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}

    public void test_loadClass_1() throws Exception {__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceStart(getClass().getName(),71301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_289dzz61j0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iyd1iydlusyjtv4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_loadClass_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71301,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_289dzz61j0l() throws Exception{try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71301);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71302);TypeUtils.clearClassMapping();
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71303);ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71304);Thread.currentThread().setContextClassLoader(new TestLoader());
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71305);try {
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71306);Assert.assertEquals(VO.class,
                                TypeUtils.loadClass("com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean$VO"));
        } finally {
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71307);Thread.currentThread().setContextClassLoader(contextClassLoader);
        }
    }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}

    public void test_loadClass_2() throws Exception {__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceStart(getClass().getName(),71308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_250e16p1j0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iyd1iydlusyjtv4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_loadClass_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71308,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_250e16p1j0s() throws Exception{try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71308);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71309);TypeUtils.clearClassMapping();
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71310);ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71311);Thread.currentThread().setContextClassLoader(new TestLoader());
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71312);try {
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71313);Assert.assertNull(TypeUtils.loadClass("xxx_xx"));
        } finally {
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71314);Thread.currentThread().setContextClassLoader(contextClassLoader);
        }
    }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}
    
    public void test_bean_2() throws Exception {__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceStart(getClass().getName(),71315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qjavav1j0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iyd1iydlusyjtv4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_bean_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71315,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qjavav1j0z() throws Exception{try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71315);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71316);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71317);map.put("id", 123);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71318);PO vo = TypeUtils.castToJavaBean(map, PO.class);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71319);Assert.assertEquals(123, vo.id);
        
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71320);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71321);try {
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71322);SerializeConfig config = new SerializeConfig();
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71323);JSONSerializer serializer = new JSONSerializer(out, config);
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71324);config.put(PO.class, new JavaBeanSerializer(PO.class, Collections.singletonMap("id", "ID")));

            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71325);serializer.write(vo);

            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71326);Assert.assertEquals("{\"ID\":123}", out.toString());
        } finally {
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71327);out.close();
        }

        
    }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}
    
    public void test_bean_3() throws Exception {__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceStart(getClass().getName(),71328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tsau3c1j1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iyd1iydlusyjtv4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iyd1iydlusyjtv4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_bean_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71328,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tsau3c1j1c() throws Exception{try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71328);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71329);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71330);map.put("id", 123);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71331);PO vo = TypeUtils.castToJavaBean(map, PO.class);
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71332);Assert.assertEquals(123, vo.id);
        
        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71333);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21iyd1iydlusyjtv4.R.inc(71334);try {
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71335);SerializeConfig config = new SerializeConfig();
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71336);JSONSerializer serializer = new JSONSerializer(out, config);
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71337);config.put(PO.class, new JavaBeanSerializer(PO.class, Collections.singletonMap("id", (String) null)));

            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71338);serializer.write(vo);

            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71339);Assert.assertEquals("{}", out.toString());
        } finally {
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71340);out.close();
        }

        
    }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}

    public static interface VO {

        void setId(int value);

        int getId();

        ClassLoader getClassLoader();
    }

    public static class Entity {

        private int    id;
        protected String name;

        public int getId() {try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71341);
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71342);return id;
        }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71343);
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71344);this.id = id;
        }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}

        protected String getName() {try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71345);
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71346);return name;
        }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}

        protected void setName(String name) {try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71347);
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71348);this.name = name;
        }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}

        public ClassLoader getClassLoader() {try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71349);
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71350);return Entity.class.getClassLoader();
        }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}
    }
    
    private static class PO {
        public int id;
    }

    public static class TestLoader extends ClassLoader {

        public TestLoader(){
            super(null);__CLR4_5_21iyd1iydlusyjtv4.R.inc(71352);try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71351);
        }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}

        public URL getResource(String name) {try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71353);
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71354);return null;
        }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}

        public Class<?> loadClass(String name) throws ClassNotFoundException {try{__CLR4_5_21iyd1iydlusyjtv4.R.inc(71355);
            __CLR4_5_21iyd1iydlusyjtv4.R.inc(71356);throw new ClassNotFoundException();
        }finally{__CLR4_5_21iyd1iydlusyjtv4.R.flushNeeded();}}
    }
}
