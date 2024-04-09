/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.JSONPathException;

import junit.framework.TestCase;

public class JSONPath_set extends TestCase {static class __CLR4_1_101pt51pt5lusqkius{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,80137,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_set() throws Exception {__CLR4_1_101pt51pt5lusqkius.R.globalSliceStart(getClass().getName(),80105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xan8ro1pt5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pt51pt5lusqkius.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pt51pt5lusqkius.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_set.test_set",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80105,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xan8ro1pt5() throws Exception{try{__CLR4_1_101pt51pt5lusqkius.R.inc(80105);
        __CLR4_1_101pt51pt5lusqkius.R.inc(80106);Entity entity = new Entity();

        __CLR4_1_101pt51pt5lusqkius.R.inc(80107);JSONPath.set(entity, "$.name", "abc");

        __CLR4_1_101pt51pt5lusqkius.R.inc(80108);Assert.assertEquals("abc", entity.getName());
    }finally{__CLR4_1_101pt51pt5lusqkius.R.flushNeeded();}}

    public void test_set_array() throws Exception {__CLR4_1_101pt51pt5lusqkius.R.globalSliceStart(getClass().getName(),80109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g2ks7e1pt9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pt51pt5lusqkius.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pt51pt5lusqkius.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_set.test_set_array",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80109,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g2ks7e1pt9() throws Exception{try{__CLR4_1_101pt51pt5lusqkius.R.inc(80109);
        __CLR4_1_101pt51pt5lusqkius.R.inc(80110);Object[] array = new Object[1];

        __CLR4_1_101pt51pt5lusqkius.R.inc(80111);JSONPath.set(array, "[0]", "abc");

        __CLR4_1_101pt51pt5lusqkius.R.inc(80112);Assert.assertEquals("abc", array[0]);
    }finally{__CLR4_1_101pt51pt5lusqkius.R.flushNeeded();}}

    public void test_set_list() throws Exception {__CLR4_1_101pt51pt5lusqkius.R.globalSliceStart(getClass().getName(),80113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103dwyfl1ptd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pt51pt5lusqkius.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pt51pt5lusqkius.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_set.test_set_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80113,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103dwyfl1ptd() throws Exception{try{__CLR4_1_101pt51pt5lusqkius.R.inc(80113);
        __CLR4_1_101pt51pt5lusqkius.R.inc(80114);List array = new ArrayList();
        __CLR4_1_101pt51pt5lusqkius.R.inc(80115);array.add(null);
        __CLR4_1_101pt51pt5lusqkius.R.inc(80116);array.add(null);

        __CLR4_1_101pt51pt5lusqkius.R.inc(80117);JSONPath.set(array, "[0]", "abc");

        __CLR4_1_101pt51pt5lusqkius.R.inc(80118);Assert.assertEquals("abc", array.get(0));
    }finally{__CLR4_1_101pt51pt5lusqkius.R.flushNeeded();}}

    public void test_root_null() throws Exception {__CLR4_1_101pt51pt5lusqkius.R.globalSliceStart(getClass().getName(),80119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bswbwi1ptj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pt51pt5lusqkius.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pt51pt5lusqkius.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_set.test_root_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80119,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bswbwi1ptj() throws Exception{try{__CLR4_1_101pt51pt5lusqkius.R.inc(80119);
        __CLR4_1_101pt51pt5lusqkius.R.inc(80120);Assert.assertFalse(JSONPath.set(null, "[0]", "abc"));
    }finally{__CLR4_1_101pt51pt5lusqkius.R.flushNeeded();}}
    
    public void test_object_not_exits() throws Exception {__CLR4_1_101pt51pt5lusqkius.R.globalSliceStart(getClass().getName(),80121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i4mitf1ptl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pt51pt5lusqkius.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pt51pt5lusqkius.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_set.test_object_not_exits",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80121,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i4mitf1ptl() throws Exception{try{__CLR4_1_101pt51pt5lusqkius.R.inc(80121);
        __CLR4_1_101pt51pt5lusqkius.R.inc(80122);Map<String, Object> root = new HashMap<String, Object>();
        __CLR4_1_101pt51pt5lusqkius.R.inc(80123);root.put("values", null);
        __CLR4_1_101pt51pt5lusqkius.R.inc(80124);Assert.assertTrue(JSONPath.set(root, "$.values[0]", "abc"));
    }finally{__CLR4_1_101pt51pt5lusqkius.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101pt51pt5lusqkius.R.globalSliceStart(getClass().getName(),80125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1ptp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pt51pt5lusqkius.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pt51pt5lusqkius.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_set.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80125,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1ptp() throws Exception{try{__CLR4_1_101pt51pt5lusqkius.R.inc(80125);
        __CLR4_1_101pt51pt5lusqkius.R.inc(80126);Map<String, Object> root = new HashMap<String, Object>();
        __CLR4_1_101pt51pt5lusqkius.R.inc(80127);root.put("values", null);
        __CLR4_1_101pt51pt5lusqkius.R.inc(80128);JSONPath.set(root, "$.values[0]", "abc");
    }finally{__CLR4_1_101pt51pt5lusqkius.R.flushNeeded();}}

    static class Entity {

        private Integer id;
        private String  name;

        public Integer getId() {try{__CLR4_1_101pt51pt5lusqkius.R.inc(80129);
            __CLR4_1_101pt51pt5lusqkius.R.inc(80130);return id;
        }finally{__CLR4_1_101pt51pt5lusqkius.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_1_101pt51pt5lusqkius.R.inc(80131);
            __CLR4_1_101pt51pt5lusqkius.R.inc(80132);this.id = id;
        }finally{__CLR4_1_101pt51pt5lusqkius.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101pt51pt5lusqkius.R.inc(80133);
            __CLR4_1_101pt51pt5lusqkius.R.inc(80134);return name;
        }finally{__CLR4_1_101pt51pt5lusqkius.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101pt51pt5lusqkius.R.inc(80135);
            __CLR4_1_101pt51pt5lusqkius.R.inc(80136);this.name = name;
        }finally{__CLR4_1_101pt51pt5lusqkius.R.flushNeeded();}}

    }
}
