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

public class TypeUtilsTest_castToJavaBean extends TestCase {static class __CLR4_1_101jww1jwwluszwcun{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,72600,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_101jww1jwwluszwcun.R.inc(72464);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72465);ParserConfig.global.addAccept("com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.");
    }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}

    public void test_castToJavaBean_StackTraceElement() throws Exception {__CLR4_1_101jww1jwwluszwcun.R.globalSliceStart(getClass().getName(),72466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10j4cn1c1jwy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jww1jwwluszwcun.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jww1jwwluszwcun.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_castToJavaBean_StackTraceElement",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72466,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10j4cn1c1jwy() throws Exception{try{__CLR4_1_101jww1jwwluszwcun.R.inc(72466);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72467);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101jww1jwwluszwcun.R.inc(72468);map.put("className", "java.lang.Object");
        __CLR4_1_101jww1jwwluszwcun.R.inc(72469);map.put("methodName", "hashCode");
        __CLR4_1_101jww1jwwluszwcun.R.inc(72470);StackTraceElement element = TypeUtils.castToJavaBean(map, StackTraceElement.class, null);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72471);Assert.assertEquals("java.lang.Object", element.getClassName());
        __CLR4_1_101jww1jwwluszwcun.R.inc(72472);Assert.assertEquals("hashCode", element.getMethodName());
        __CLR4_1_101jww1jwwluszwcun.R.inc(72473);Assert.assertEquals(null, element.getFileName());
    }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}

    public void test_castToJavaBean_StackTraceElement_1() throws Exception {__CLR4_1_101jww1jwwluszwcun.R.globalSliceStart(getClass().getName(),72474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10q1jjbm1jx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jww1jwwluszwcun.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jww1jwwluszwcun.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_castToJavaBean_StackTraceElement_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72474,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10q1jjbm1jx6() throws Exception{try{__CLR4_1_101jww1jwwluszwcun.R.inc(72474);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72475);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101jww1jwwluszwcun.R.inc(72476);map.put("className", "java.lang.Object");
        __CLR4_1_101jww1jwwluszwcun.R.inc(72477);map.put("methodName", "hashCode");
        __CLR4_1_101jww1jwwluszwcun.R.inc(72478);map.put("lineNumber", 12);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72479);StackTraceElement element = TypeUtils.castToJavaBean(map, StackTraceElement.class, null);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72480);Assert.assertEquals("java.lang.Object", element.getClassName());
        __CLR4_1_101jww1jwwluszwcun.R.inc(72481);Assert.assertEquals("hashCode", element.getMethodName());
        __CLR4_1_101jww1jwwluszwcun.R.inc(72482);Assert.assertEquals(null, element.getFileName());
        __CLR4_1_101jww1jwwluszwcun.R.inc(72483);Assert.assertEquals(12, element.getLineNumber());
    }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}

    public void test_castToJavaBean_type() throws Exception {__CLR4_1_101jww1jwwluszwcun.R.globalSliceStart(getClass().getName(),72484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yavzt1jxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jww1jwwluszwcun.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jww1jwwluszwcun.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_castToJavaBean_type",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72484,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yavzt1jxg() throws Exception{try{__CLR4_1_101jww1jwwluszwcun.R.inc(72484);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72485);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101jww1jwwluszwcun.R.inc(72486);map.put("@type", "java.lang.StackTraceElement");
        __CLR4_1_101jww1jwwluszwcun.R.inc(72487);map.put("className", "java.lang.Object");
        __CLR4_1_101jww1jwwluszwcun.R.inc(72488);map.put("methodName", "hashCode");
        __CLR4_1_101jww1jwwluszwcun.R.inc(72489);map.put("lineNumber", 12);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72490);StackTraceElement element = (StackTraceElement) TypeUtils.castToJavaBean(map, Object.class, null);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72491);Assert.assertEquals("java.lang.Object", element.getClassName());
        __CLR4_1_101jww1jwwluszwcun.R.inc(72492);Assert.assertEquals("hashCode", element.getMethodName());
        __CLR4_1_101jww1jwwluszwcun.R.inc(72493);Assert.assertEquals(null, element.getFileName());
        __CLR4_1_101jww1jwwluszwcun.R.inc(72494);Assert.assertEquals(12, element.getLineNumber());
    }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101jww1jwwluszwcun.R.globalSliceStart(getClass().getName(),72495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1jxr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jww1jwwluszwcun.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jww1jwwluszwcun.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72495,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1jxr() throws Exception{try{__CLR4_1_101jww1jwwluszwcun.R.inc(72495);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72496);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101jww1jwwluszwcun.R.inc(72497);map.put("@type", "xxx");
        __CLR4_1_101jww1jwwluszwcun.R.inc(72498);Exception error = null;
        __CLR4_1_101jww1jwwluszwcun.R.inc(72499);try {
            __CLR4_1_101jww1jwwluszwcun.R.inc(72500);TypeUtils.castToJavaBean(map, Object.class, null);
        } catch (Exception ex) {
            __CLR4_1_101jww1jwwluszwcun.R.inc(72501);error = ex;
        }
        __CLR4_1_101jww1jwwluszwcun.R.inc(72502);Assert.assertNotNull(error);
    }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}

    public void test_error2() throws Exception {__CLR4_1_101jww1jwwluszwcun.R.globalSliceStart(getClass().getName(),72503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104vg1sy1jxz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jww1jwwluszwcun.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jww1jwwluszwcun.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_error2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72503,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104vg1sy1jxz() throws Exception{try{__CLR4_1_101jww1jwwluszwcun.R.inc(72503);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72504);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101jww1jwwluszwcun.R.inc(72505);map.put("@type", "");
        __CLR4_1_101jww1jwwluszwcun.R.inc(72506);Exception error = null;
        __CLR4_1_101jww1jwwluszwcun.R.inc(72507);try {
            __CLR4_1_101jww1jwwluszwcun.R.inc(72508);TypeUtils.castToJavaBean(map, Object.class, null);
        } catch (Exception ex) {
            __CLR4_1_101jww1jwwluszwcun.R.inc(72509);error = ex;
        }
        __CLR4_1_101jww1jwwluszwcun.R.inc(72510);Assert.assertNotNull(error);
    }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}

    public void test_mapping() throws Exception {__CLR4_1_101jww1jwwluszwcun.R.globalSliceStart(getClass().getName(),72511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101rvqko1jy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jww1jwwluszwcun.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jww1jwwluszwcun.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_mapping",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72511,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101rvqko1jy7() throws Exception{try{__CLR4_1_101jww1jwwluszwcun.R.inc(72511);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72512);addClassMapping("my_xxx", VO.class);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72513);addClassMapping(null, VO.class);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72514);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101jww1jwwluszwcun.R.inc(72515);map.put("@type", "my_xxx");
        __CLR4_1_101jww1jwwluszwcun.R.inc(72516);map.put("id", 123);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72517);VO vo = (VO) TypeUtils.castToJavaBean(map, Object.class);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72518);Assert.assertEquals(123, vo.getId());
        __CLR4_1_101jww1jwwluszwcun.R.inc(72519);TypeUtils.clearClassMapping();
    }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}
    
    public static void addClassMapping(String className, Class<?> clazz) throws Exception {try{__CLR4_1_101jww1jwwluszwcun.R.inc(72520);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72521);Field field = TypeUtils.class.getDeclaredField("mappings");
        __CLR4_1_101jww1jwwluszwcun.R.inc(72522);field.setAccessible(true);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72523);field.get(null);
        
        __CLR4_1_101jww1jwwluszwcun.R.inc(72524);ConcurrentMap<String, Class<?>> mappings = (ConcurrentMap<String, Class<?>>) field.get(null);
        
        __CLR4_1_101jww1jwwluszwcun.R.inc(72525);if ((((className == null)&&(__CLR4_1_101jww1jwwluszwcun.R.iget(72526)!=0|true))||(__CLR4_1_101jww1jwwluszwcun.R.iget(72527)==0&false))) {{
            __CLR4_1_101jww1jwwluszwcun.R.inc(72528);className = clazz.getName();
        }

        }__CLR4_1_101jww1jwwluszwcun.R.inc(72529);mappings.put(className, clazz);
    }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}

    public void test_interface() throws Exception {__CLR4_1_101jww1jwwluszwcun.R.globalSliceStart(getClass().getName(),72530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108tv72r1jyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jww1jwwluszwcun.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jww1jwwluszwcun.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_interface",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72530,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108tv72r1jyq() throws Exception{try{__CLR4_1_101jww1jwwluszwcun.R.inc(72530);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72531);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101jww1jwwluszwcun.R.inc(72532);map.put("id", 123);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72533);VO vo = TypeUtils.castToJavaBean(map, VO.class);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72534);Assert.assertEquals(123, vo.getId());
    }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}

    public void test_bean() throws Exception {__CLR4_1_101jww1jwwluszwcun.R.globalSliceStart(getClass().getName(),72535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kwbd3w1jyv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jww1jwwluszwcun.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jww1jwwluszwcun.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_bean",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72535,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kwbd3w1jyv() throws Exception{try{__CLR4_1_101jww1jwwluszwcun.R.inc(72535);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72536);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101jww1jwwluszwcun.R.inc(72537);map.put("id", 123);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72538);Entity vo = TypeUtils.castToJavaBean(map, Entity.class);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72539);Assert.assertEquals(123, vo.getId());

        __CLR4_1_101jww1jwwluszwcun.R.inc(72540);Assert.assertEquals("{\"id\":123}", JSON.toJSONString(vo));
    }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}

    public void test_loadClass() throws Exception {__CLR4_1_101jww1jwwluszwcun.R.globalSliceStart(getClass().getName(),72541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dgqx781jz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jww1jwwluszwcun.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jww1jwwluszwcun.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_loadClass",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72541,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dgqx781jz1() throws Exception{try{__CLR4_1_101jww1jwwluszwcun.R.inc(72541);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72542);Assert.assertNull(TypeUtils.loadClass(null));
        __CLR4_1_101jww1jwwluszwcun.R.inc(72543);Assert.assertNull(TypeUtils.loadClass(""));
    }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}

    public void test_loadClass_1() throws Exception {__CLR4_1_101jww1jwwluszwcun.R.globalSliceStart(getClass().getName(),72544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1089dzz61jz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jww1jwwluszwcun.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jww1jwwluszwcun.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_loadClass_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72544,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1089dzz61jz4() throws Exception{try{__CLR4_1_101jww1jwwluszwcun.R.inc(72544);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72545);TypeUtils.clearClassMapping();
        __CLR4_1_101jww1jwwluszwcun.R.inc(72546);ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        __CLR4_1_101jww1jwwluszwcun.R.inc(72547);Thread.currentThread().setContextClassLoader(new TestLoader());
        __CLR4_1_101jww1jwwluszwcun.R.inc(72548);try {
            __CLR4_1_101jww1jwwluszwcun.R.inc(72549);Assert.assertEquals(VO.class,
                                TypeUtils.loadClass("com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean$VO"));
        } finally {
            __CLR4_1_101jww1jwwluszwcun.R.inc(72550);Thread.currentThread().setContextClassLoader(contextClassLoader);
        }
    }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}

    public void test_loadClass_2() throws Exception {__CLR4_1_101jww1jwwluszwcun.R.globalSliceStart(getClass().getName(),72551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1050e16p1jzb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jww1jwwluszwcun.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jww1jwwluszwcun.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_loadClass_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72551,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1050e16p1jzb() throws Exception{try{__CLR4_1_101jww1jwwluszwcun.R.inc(72551);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72552);TypeUtils.clearClassMapping();
        __CLR4_1_101jww1jwwluszwcun.R.inc(72553);ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        __CLR4_1_101jww1jwwluszwcun.R.inc(72554);Thread.currentThread().setContextClassLoader(new TestLoader());
        __CLR4_1_101jww1jwwluszwcun.R.inc(72555);try {
            __CLR4_1_101jww1jwwluszwcun.R.inc(72556);Assert.assertNull(TypeUtils.loadClass("xxx_xx"));
        } finally {
            __CLR4_1_101jww1jwwluszwcun.R.inc(72557);Thread.currentThread().setContextClassLoader(contextClassLoader);
        }
    }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}
    
    public void test_bean_2() throws Exception {__CLR4_1_101jww1jwwluszwcun.R.globalSliceStart(getClass().getName(),72558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qjavav1jzi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jww1jwwluszwcun.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jww1jwwluszwcun.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_bean_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72558,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qjavav1jzi() throws Exception{try{__CLR4_1_101jww1jwwluszwcun.R.inc(72558);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72559);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101jww1jwwluszwcun.R.inc(72560);map.put("id", 123);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72561);PO vo = TypeUtils.castToJavaBean(map, PO.class);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72562);Assert.assertEquals(123, vo.id);
        
        __CLR4_1_101jww1jwwluszwcun.R.inc(72563);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101jww1jwwluszwcun.R.inc(72564);try {
            __CLR4_1_101jww1jwwluszwcun.R.inc(72565);SerializeConfig config = new SerializeConfig();
            __CLR4_1_101jww1jwwluszwcun.R.inc(72566);JSONSerializer serializer = new JSONSerializer(out, config);
            __CLR4_1_101jww1jwwluszwcun.R.inc(72567);config.put(PO.class, new JavaBeanSerializer(PO.class, Collections.singletonMap("id", "ID")));

            __CLR4_1_101jww1jwwluszwcun.R.inc(72568);serializer.write(vo);

            __CLR4_1_101jww1jwwluszwcun.R.inc(72569);Assert.assertEquals("{\"ID\":123}", out.toString());
        } finally {
            __CLR4_1_101jww1jwwluszwcun.R.inc(72570);out.close();
        }

        
    }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}
    
    public void test_bean_3() throws Exception {__CLR4_1_101jww1jwwluszwcun.R.globalSliceStart(getClass().getName(),72571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tsau3c1jzv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jww1jwwluszwcun.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jww1jwwluszwcun.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean.test_bean_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72571,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tsau3c1jzv() throws Exception{try{__CLR4_1_101jww1jwwluszwcun.R.inc(72571);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72572);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101jww1jwwluszwcun.R.inc(72573);map.put("id", 123);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72574);PO vo = TypeUtils.castToJavaBean(map, PO.class);
        __CLR4_1_101jww1jwwluszwcun.R.inc(72575);Assert.assertEquals(123, vo.id);
        
        __CLR4_1_101jww1jwwluszwcun.R.inc(72576);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101jww1jwwluszwcun.R.inc(72577);try {
            __CLR4_1_101jww1jwwluszwcun.R.inc(72578);SerializeConfig config = new SerializeConfig();
            __CLR4_1_101jww1jwwluszwcun.R.inc(72579);JSONSerializer serializer = new JSONSerializer(out, config);
            __CLR4_1_101jww1jwwluszwcun.R.inc(72580);config.put(PO.class, new JavaBeanSerializer(PO.class, Collections.singletonMap("id", (String) null)));

            __CLR4_1_101jww1jwwluszwcun.R.inc(72581);serializer.write(vo);

            __CLR4_1_101jww1jwwluszwcun.R.inc(72582);Assert.assertEquals("{}", out.toString());
        } finally {
            __CLR4_1_101jww1jwwluszwcun.R.inc(72583);out.close();
        }

        
    }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}

    public static interface VO {

        void setId(int value);

        int getId();

        ClassLoader getClassLoader();
    }

    public static class Entity {

        private int    id;
        protected String name;

        public int getId() {try{__CLR4_1_101jww1jwwluszwcun.R.inc(72584);
            __CLR4_1_101jww1jwwluszwcun.R.inc(72585);return id;
        }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101jww1jwwluszwcun.R.inc(72586);
            __CLR4_1_101jww1jwwluszwcun.R.inc(72587);this.id = id;
        }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}

        protected String getName() {try{__CLR4_1_101jww1jwwluszwcun.R.inc(72588);
            __CLR4_1_101jww1jwwluszwcun.R.inc(72589);return name;
        }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}

        protected void setName(String name) {try{__CLR4_1_101jww1jwwluszwcun.R.inc(72590);
            __CLR4_1_101jww1jwwluszwcun.R.inc(72591);this.name = name;
        }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}

        public ClassLoader getClassLoader() {try{__CLR4_1_101jww1jwwluszwcun.R.inc(72592);
            __CLR4_1_101jww1jwwluszwcun.R.inc(72593);return Entity.class.getClassLoader();
        }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}
    }
    
    private static class PO {
        public int id;
    }

    public static class TestLoader extends ClassLoader {

        public TestLoader(){
            super(null);__CLR4_1_101jww1jwwluszwcun.R.inc(72595);try{__CLR4_1_101jww1jwwluszwcun.R.inc(72594);
        }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}

        public URL getResource(String name) {try{__CLR4_1_101jww1jwwluszwcun.R.inc(72596);
            __CLR4_1_101jww1jwwluszwcun.R.inc(72597);return null;
        }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}

        public Class<?> loadClass(String name) throws ClassNotFoundException {try{__CLR4_1_101jww1jwwluszwcun.R.inc(72598);
            __CLR4_1_101jww1jwwluszwcun.R.inc(72599);throw new ClassNotFoundException();
        }finally{__CLR4_1_101jww1jwwluszwcun.R.flushNeeded();}}
    }
}
