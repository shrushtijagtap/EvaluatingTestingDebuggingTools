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

public class TypeUtilsTest_castToJavaBean extends TestCase {static class __CLR4_5_21jwl1jwllusvndrk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,72589,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72453);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72454);ParserConfig.global.addAccept("com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.");
    }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}

    public void test_castToJavaBean_StackTraceElement() throws Exception {__CLR4_5_21jwl1jwllusvndrk.R.globalSliceStart(getClass().getName(),72455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j4cn1c1jwn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jwl1jwllusvndrk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jwl1jwllusvndrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_castToJavaBean_StackTraceElement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72455,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j4cn1c1jwn() throws Exception{try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72455);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72456);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72457);map.put("className", "java.lang.Object");
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72458);map.put("methodName", "hashCode");
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72459);StackTraceElement element = TypeUtils.castToJavaBean(map, StackTraceElement.class, null);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72460);Assert.assertEquals("java.lang.Object", element.getClassName());
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72461);Assert.assertEquals("hashCode", element.getMethodName());
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72462);Assert.assertEquals(null, element.getFileName());
    }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}

    public void test_castToJavaBean_StackTraceElement_1() throws Exception {__CLR4_5_21jwl1jwllusvndrk.R.globalSliceStart(getClass().getName(),72463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q1jjbm1jwv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jwl1jwllusvndrk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jwl1jwllusvndrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_castToJavaBean_StackTraceElement_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72463,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q1jjbm1jwv() throws Exception{try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72463);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72464);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72465);map.put("className", "java.lang.Object");
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72466);map.put("methodName", "hashCode");
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72467);map.put("lineNumber", 12);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72468);StackTraceElement element = TypeUtils.castToJavaBean(map, StackTraceElement.class, null);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72469);Assert.assertEquals("java.lang.Object", element.getClassName());
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72470);Assert.assertEquals("hashCode", element.getMethodName());
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72471);Assert.assertEquals(null, element.getFileName());
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72472);Assert.assertEquals(12, element.getLineNumber());
    }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}

    public void test_castToJavaBean_type() throws Exception {__CLR4_5_21jwl1jwllusvndrk.R.globalSliceStart(getClass().getName(),72473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yavzt1jx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jwl1jwllusvndrk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jwl1jwllusvndrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_castToJavaBean_type",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72473,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yavzt1jx5() throws Exception{try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72473);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72474);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72475);map.put("@type", "java.lang.StackTraceElement");
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72476);map.put("className", "java.lang.Object");
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72477);map.put("methodName", "hashCode");
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72478);map.put("lineNumber", 12);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72479);StackTraceElement element = (StackTraceElement) TypeUtils.castToJavaBean(map, Object.class, null);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72480);Assert.assertEquals("java.lang.Object", element.getClassName());
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72481);Assert.assertEquals("hashCode", element.getMethodName());
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72482);Assert.assertEquals(null, element.getFileName());
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72483);Assert.assertEquals(12, element.getLineNumber());
    }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21jwl1jwllusvndrk.R.globalSliceStart(getClass().getName(),72484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1jxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jwl1jwllusvndrk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jwl1jwllusvndrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72484,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1jxg() throws Exception{try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72484);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72485);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72486);map.put("@type", "xxx");
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72487);Exception error = null;
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72488);try {
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72489);TypeUtils.castToJavaBean(map, Object.class, null);
        } catch (Exception ex) {
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72490);error = ex;
        }
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72491);Assert.assertNotNull(error);
    }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}

    public void test_error2() throws Exception {__CLR4_5_21jwl1jwllusvndrk.R.globalSliceStart(getClass().getName(),72492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24vg1sy1jxo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jwl1jwllusvndrk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jwl1jwllusvndrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_error2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72492,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24vg1sy1jxo() throws Exception{try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72492);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72493);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72494);map.put("@type", "");
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72495);Exception error = null;
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72496);try {
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72497);TypeUtils.castToJavaBean(map, Object.class, null);
        } catch (Exception ex) {
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72498);error = ex;
        }
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72499);Assert.assertNotNull(error);
    }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}

    public void test_mapping() throws Exception {__CLR4_5_21jwl1jwllusvndrk.R.globalSliceStart(getClass().getName(),72500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21rvqko1jxw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jwl1jwllusvndrk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jwl1jwllusvndrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_mapping",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72500,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21rvqko1jxw() throws Exception{try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72500);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72501);addClassMapping("my_xxx", VO.class);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72502);addClassMapping(null, VO.class);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72503);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72504);map.put("@type", "my_xxx");
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72505);map.put("id", 123);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72506);VO vo = (VO) TypeUtils.castToJavaBean(map, Object.class);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72507);Assert.assertEquals(123, vo.getId());
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72508);TypeUtils.clearClassMapping();
    }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}
    
    public static void addClassMapping(String className, Class<?> clazz) throws Exception {try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72509);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72510);Field field = TypeUtils.class.getDeclaredField("mappings");
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72511);field.setAccessible(true);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72512);field.get(null);
        
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72513);ConcurrentMap<String, Class<?>> mappings = (ConcurrentMap<String, Class<?>>) field.get(null);
        
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72514);if ((((className == null)&&(__CLR4_5_21jwl1jwllusvndrk.R.iget(72515)!=0|true))||(__CLR4_5_21jwl1jwllusvndrk.R.iget(72516)==0&false))) {{
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72517);className = clazz.getName();
        }

        }__CLR4_5_21jwl1jwllusvndrk.R.inc(72518);mappings.put(className, clazz);
    }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}

    public void test_interface() throws Exception {__CLR4_5_21jwl1jwllusvndrk.R.globalSliceStart(getClass().getName(),72519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28tv72r1jyf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jwl1jwllusvndrk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jwl1jwllusvndrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_interface",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72519,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28tv72r1jyf() throws Exception{try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72519);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72520);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72521);map.put("id", 123);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72522);VO vo = TypeUtils.castToJavaBean(map, VO.class);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72523);Assert.assertEquals(123, vo.getId());
    }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}

    public void test_bean() throws Exception {__CLR4_5_21jwl1jwllusvndrk.R.globalSliceStart(getClass().getName(),72524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kwbd3w1jyk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jwl1jwllusvndrk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jwl1jwllusvndrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_bean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72524,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kwbd3w1jyk() throws Exception{try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72524);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72525);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72526);map.put("id", 123);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72527);Entity vo = TypeUtils.castToJavaBean(map, Entity.class);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72528);Assert.assertEquals(123, vo.getId());

        __CLR4_5_21jwl1jwllusvndrk.R.inc(72529);Assert.assertEquals("{\"id\":123}", JSON.toJSONString(vo));
    }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}

    public void test_loadClass() throws Exception {__CLR4_5_21jwl1jwllusvndrk.R.globalSliceStart(getClass().getName(),72530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dgqx781jyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jwl1jwllusvndrk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jwl1jwllusvndrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_loadClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72530,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dgqx781jyq() throws Exception{try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72530);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72531);Assert.assertNull(TypeUtils.loadClass(null));
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72532);Assert.assertNull(TypeUtils.loadClass(""));
    }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}

    public void test_loadClass_1() throws Exception {__CLR4_5_21jwl1jwllusvndrk.R.globalSliceStart(getClass().getName(),72533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_289dzz61jyt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jwl1jwllusvndrk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jwl1jwllusvndrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_loadClass_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72533,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_289dzz61jyt() throws Exception{try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72533);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72534);TypeUtils.clearClassMapping();
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72535);ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72536);Thread.currentThread().setContextClassLoader(new TestLoader());
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72537);try {
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72538);Assert.assertEquals(VO.class,
                                TypeUtils.loadClass("com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean$VO"));
        } finally {
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72539);Thread.currentThread().setContextClassLoader(contextClassLoader);
        }
    }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}

    public void test_loadClass_2() throws Exception {__CLR4_5_21jwl1jwllusvndrk.R.globalSliceStart(getClass().getName(),72540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_250e16p1jz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jwl1jwllusvndrk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jwl1jwllusvndrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_loadClass_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72540,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_250e16p1jz0() throws Exception{try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72540);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72541);TypeUtils.clearClassMapping();
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72542);ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72543);Thread.currentThread().setContextClassLoader(new TestLoader());
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72544);try {
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72545);Assert.assertNull(TypeUtils.loadClass("xxx_xx"));
        } finally {
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72546);Thread.currentThread().setContextClassLoader(contextClassLoader);
        }
    }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}
    
    public void test_bean_2() throws Exception {__CLR4_5_21jwl1jwllusvndrk.R.globalSliceStart(getClass().getName(),72547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qjavav1jz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jwl1jwllusvndrk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jwl1jwllusvndrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_bean_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72547,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qjavav1jz7() throws Exception{try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72547);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72548);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72549);map.put("id", 123);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72550);PO vo = TypeUtils.castToJavaBean(map, PO.class);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72551);Assert.assertEquals(123, vo.id);
        
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72552);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21jwl1jwllusvndrk.R.inc(72553);try {
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72554);SerializeConfig config = new SerializeConfig();
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72555);JSONSerializer serializer = new JSONSerializer(out, config);
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72556);config.put(PO.class, new JavaBeanSerializer(PO.class, Collections.singletonMap("id", "ID")));

            __CLR4_5_21jwl1jwllusvndrk.R.inc(72557);serializer.write(vo);

            __CLR4_5_21jwl1jwllusvndrk.R.inc(72558);Assert.assertEquals("{\"ID\":123}", out.toString());
        } finally {
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72559);out.close();
        }

        
    }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}
    
    public void test_bean_3() throws Exception {__CLR4_5_21jwl1jwllusvndrk.R.globalSliceStart(getClass().getName(),72560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tsau3c1jzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jwl1jwllusvndrk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jwl1jwllusvndrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_bean_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72560,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tsau3c1jzk() throws Exception{try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72560);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72561);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72562);map.put("id", 123);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72563);PO vo = TypeUtils.castToJavaBean(map, PO.class);
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72564);Assert.assertEquals(123, vo.id);
        
        __CLR4_5_21jwl1jwllusvndrk.R.inc(72565);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21jwl1jwllusvndrk.R.inc(72566);try {
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72567);SerializeConfig config = new SerializeConfig();
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72568);JSONSerializer serializer = new JSONSerializer(out, config);
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72569);config.put(PO.class, new JavaBeanSerializer(PO.class, Collections.singletonMap("id", (String) null)));

            __CLR4_5_21jwl1jwllusvndrk.R.inc(72570);serializer.write(vo);

            __CLR4_5_21jwl1jwllusvndrk.R.inc(72571);Assert.assertEquals("{}", out.toString());
        } finally {
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72572);out.close();
        }

        
    }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}

    public static interface VO {

        void setId(int value);

        int getId();

        ClassLoader getClassLoader();
    }

    public static class Entity {

        private int    id;
        protected String name;

        public int getId() {try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72573);
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72574);return id;
        }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72575);
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72576);this.id = id;
        }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}

        protected String getName() {try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72577);
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72578);return name;
        }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}

        protected void setName(String name) {try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72579);
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72580);this.name = name;
        }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}

        public ClassLoader getClassLoader() {try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72581);
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72582);return Entity.class.getClassLoader();
        }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}
    }
    
    private static class PO {
        public int id;
    }

    public static class TestLoader extends ClassLoader {

        public TestLoader(){
            super(null);__CLR4_5_21jwl1jwllusvndrk.R.inc(72584);try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72583);
        }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}

        public URL getResource(String name) {try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72585);
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72586);return null;
        }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}

        public Class<?> loadClass(String name) throws ClassNotFoundException {try{__CLR4_5_21jwl1jwllusvndrk.R.inc(72587);
            __CLR4_5_21jwl1jwllusvndrk.R.inc(72588);throw new ClassNotFoundException();
        }finally{__CLR4_5_21jwl1jwllusvndrk.R.flushNeeded();}}
    }
}
