/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSONPath;

import junit.framework.TestCase;
import org.junit.Assert;

public class JSONPath_keySet extends TestCase {static class __CLR4_1_101phu1phulusqkiqb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,79770,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final Set<String> KEY_SET = new HashSet<String>();

    static {try{__CLR4_1_101phu1phulusqkiqb.R.inc(79698);
        __CLR4_1_101phu1phulusqkiqb.R.inc(79699);KEY_SET.add("id");
        __CLR4_1_101phu1phulusqkiqb.R.inc(79700);KEY_SET.add("name");
    }finally{__CLR4_1_101phu1phulusqkiqb.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public void test_map() {__CLR4_1_101phu1phulusqkiqb.R.globalSliceStart(getClass().getName(),79701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10aaqgyy1phx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101phu1phulusqkiqb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101phu1phulusqkiqb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_keySet.test_map",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79701,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10aaqgyy1phx(){try{__CLR4_1_101phu1phulusqkiqb.R.inc(79701);
        __CLR4_1_101phu1phulusqkiqb.R.inc(79702);Map<String, Integer> map1 = new HashMap<String, Integer>();
        __CLR4_1_101phu1phulusqkiqb.R.inc(79703);map1.put("id", 1);
        __CLR4_1_101phu1phulusqkiqb.R.inc(79704);map1.put("name", null); // null will be included
        __CLR4_1_101phu1phulusqkiqb.R.inc(79705);Assert.assertEquals(KEY_SET, JSONPath.eval(map1, "$.keySet()"));
        __CLR4_1_101phu1phulusqkiqb.R.inc(79706);Assert.assertEquals(KEY_SET, JSONPath.keySet(map1, "$"));

        __CLR4_1_101phu1phulusqkiqb.R.inc(79707);Map<Long, String> map2 = new HashMap<Long, String>();
        __CLR4_1_101phu1phulusqkiqb.R.inc(79708);map2.put(1L, "a");
        __CLR4_1_101phu1phulusqkiqb.R.inc(79709);map2.put(2L, "b");
        __CLR4_1_101phu1phulusqkiqb.R.inc(79710);Set<Long> keys2 = (Set<Long>)JSONPath.eval(map2, "$.keySet()");
        __CLR4_1_101phu1phulusqkiqb.R.inc(79711);Assert.assertEquals(2, keys2.size());
        __CLR4_1_101phu1phulusqkiqb.R.inc(79712);Assert.assertTrue(keys2.contains(1L));
        __CLR4_1_101phu1phulusqkiqb.R.inc(79713);Assert.assertTrue(keys2.contains(2L));
    }finally{__CLR4_1_101phu1phulusqkiqb.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public void test_object() {__CLR4_1_101phu1phulusqkiqb.R.globalSliceStart(getClass().getName(),79714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102k5qab1pia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101phu1phulusqkiqb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101phu1phulusqkiqb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_keySet.test_object",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79714,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102k5qab1pia(){try{__CLR4_1_101phu1phulusqkiqb.R.inc(79714);
        __CLR4_1_101phu1phulusqkiqb.R.inc(79715);Entity e = new Entity();
        __CLR4_1_101phu1phulusqkiqb.R.inc(79716);e.id = 3L;
        __CLR4_1_101phu1phulusqkiqb.R.inc(79717);e.name = "hello";
        __CLR4_1_101phu1phulusqkiqb.R.inc(79718);Collection<String> result = null;
        // age is null
        __CLR4_1_101phu1phulusqkiqb.R.inc(79719);result = (Collection<String>)JSONPath.eval(e, "$.keySet()");
        __CLR4_1_101phu1phulusqkiqb.R.inc(79720);Assert.assertEquals(KEY_SET, result);

        // age not null
        __CLR4_1_101phu1phulusqkiqb.R.inc(79721);e.age = 4L;
        __CLR4_1_101phu1phulusqkiqb.R.inc(79722);result = (Collection<String>)JSONPath.eval(e, "$.keySet()");
        __CLR4_1_101phu1phulusqkiqb.R.inc(79723);Assert.assertEquals(3, result.size());
        __CLR4_1_101phu1phulusqkiqb.R.inc(79724);Assert.assertTrue(result.containsAll(KEY_SET));
        __CLR4_1_101phu1phulusqkiqb.R.inc(79725);Assert.assertTrue(result.contains("age"));
    }finally{__CLR4_1_101phu1phulusqkiqb.R.flushNeeded();}}

    public void test_nested() {__CLR4_1_101phu1phulusqkiqb.R.globalSliceStart(getClass().getName(),79726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mp5or1pim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101phu1phulusqkiqb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101phu1phulusqkiqb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_keySet.test_nested",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79726,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mp5or1pim(){try{__CLR4_1_101phu1phulusqkiqb.R.inc(79726);
        __CLR4_1_101phu1phulusqkiqb.R.inc(79727);Entity e = new Entity();
        __CLR4_1_101phu1phulusqkiqb.R.inc(79728);e.id = 3L;
        __CLR4_1_101phu1phulusqkiqb.R.inc(79729);e.name = "hello";
        __CLR4_1_101phu1phulusqkiqb.R.inc(79730);Object obj = Collections.singletonMap("obj", e);
        __CLR4_1_101phu1phulusqkiqb.R.inc(79731);Assert.assertEquals(KEY_SET, JSONPath.eval(obj, "$.obj.keySet()"));
        __CLR4_1_101phu1phulusqkiqb.R.inc(79732);Assert.assertEquals(KEY_SET, new JSONPath("$.obj").keySet(obj));
    }finally{__CLR4_1_101phu1phulusqkiqb.R.flushNeeded();}}

    public void test_unsupported() {__CLR4_1_101phu1phulusqkiqb.R.globalSliceStart(getClass().getName(),79733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10l077ap1pit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101phu1phulusqkiqb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101phu1phulusqkiqb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_keySet.test_unsupported",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79733,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10l077ap1pit(){try{__CLR4_1_101phu1phulusqkiqb.R.inc(79733);
        __CLR4_1_101phu1phulusqkiqb.R.inc(79734);Entity e = new Entity();
        __CLR4_1_101phu1phulusqkiqb.R.inc(79735);e.id = 3L;
        __CLR4_1_101phu1phulusqkiqb.R.inc(79736);Entity[] array = {e};
        __CLR4_1_101phu1phulusqkiqb.R.inc(79737);Map<String, Entity[]> map = Collections.singletonMap("array", array);
        __CLR4_1_101phu1phulusqkiqb.R.inc(79738);Assert.assertEquals(array, JSONPath.eval(map, "$.array"));
        __CLR4_1_101phu1phulusqkiqb.R.inc(79739);Assert.assertNull(JSONPath.eval(map, "$.array.keySet()"));
        __CLR4_1_101phu1phulusqkiqb.R.inc(79740);Assert.assertNull(JSONPath.keySet(map, "$.array"));
        __CLR4_1_101phu1phulusqkiqb.R.inc(79741);Assert.assertNull(new JSONPath("$.array").keySet(map));
    }finally{__CLR4_1_101phu1phulusqkiqb.R.flushNeeded();}}

    public void test_null() {__CLR4_1_101phu1phulusqkiqb.R.globalSliceStart(getClass().getName(),79742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1pj2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101phu1phulusqkiqb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101phu1phulusqkiqb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_keySet.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79742,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1pj2(){try{__CLR4_1_101phu1phulusqkiqb.R.inc(79742);
        __CLR4_1_101phu1phulusqkiqb.R.inc(79743);Assert.assertNull(JSONPath.eval(null, "$.keySet()"));
        __CLR4_1_101phu1phulusqkiqb.R.inc(79744);Set<?> keySet = (Set<?>)JSONPath.eval(new HashMap<String, Object>(), "$.keySet()");
        __CLR4_1_101phu1phulusqkiqb.R.inc(79745);Assert.assertEquals(0, keySet.size());
    }finally{__CLR4_1_101phu1phulusqkiqb.R.flushNeeded();}}

    /**
     * Demo for wiki
     */
    @SuppressWarnings("unchecked")
    public void test_demo() {__CLR4_1_101phu1phulusqkiqb.R.globalSliceStart(getClass().getName(),79746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106h7j9l1pj6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101phu1phulusqkiqb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101phu1phulusqkiqb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_keySet.test_demo",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79746,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106h7j9l1pj6(){try{__CLR4_1_101phu1phulusqkiqb.R.inc(79746);
        __CLR4_1_101phu1phulusqkiqb.R.inc(79747);Entity e = new Entity();
        __CLR4_1_101phu1phulusqkiqb.R.inc(79748);e.setId(null);
        __CLR4_1_101phu1phulusqkiqb.R.inc(79749);e.setName("hello");
        __CLR4_1_101phu1phulusqkiqb.R.inc(79750);Map<String, Entity> map = Collections.singletonMap("e", e);
        __CLR4_1_101phu1phulusqkiqb.R.inc(79751);Collection<String> result;

        // id is null, excluded by keySet
        __CLR4_1_101phu1phulusqkiqb.R.inc(79752);result = (Collection<String>)JSONPath.eval(map, "$.e.keySet()");
        __CLR4_1_101phu1phulusqkiqb.R.inc(79753);assertEquals(1, result.size());
        __CLR4_1_101phu1phulusqkiqb.R.inc(79754);Assert.assertTrue(result.contains("name"));

        __CLR4_1_101phu1phulusqkiqb.R.inc(79755);e.setId(1L);
        __CLR4_1_101phu1phulusqkiqb.R.inc(79756);result = (Collection<String>)JSONPath.eval(map, "$.e.keySet()");
        __CLR4_1_101phu1phulusqkiqb.R.inc(79757);Assert.assertEquals(2, result.size());
        __CLR4_1_101phu1phulusqkiqb.R.inc(79758);Assert.assertTrue(result.contains("id")); // included
        __CLR4_1_101phu1phulusqkiqb.R.inc(79759);Assert.assertTrue(result.contains("name"));

        // Same result
        __CLR4_1_101phu1phulusqkiqb.R.inc(79760);Assert.assertEquals(result, JSONPath.keySet(map, "$.e"));
        __CLR4_1_101phu1phulusqkiqb.R.inc(79761);Assert.assertEquals(result, new JSONPath("$.e").keySet(map));
    }finally{__CLR4_1_101phu1phulusqkiqb.R.flushNeeded();}}

    public static class Entity {
        private Long id;
        private String name;
        public Long age;

        public Long getId() {try{__CLR4_1_101phu1phulusqkiqb.R.inc(79762);
            __CLR4_1_101phu1phulusqkiqb.R.inc(79763);return id;
        }finally{__CLR4_1_101phu1phulusqkiqb.R.flushNeeded();}}

        public void setId(Long id) {try{__CLR4_1_101phu1phulusqkiqb.R.inc(79764);
            __CLR4_1_101phu1phulusqkiqb.R.inc(79765);this.id = id;
        }finally{__CLR4_1_101phu1phulusqkiqb.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101phu1phulusqkiqb.R.inc(79766);
            __CLR4_1_101phu1phulusqkiqb.R.inc(79767);return name;
        }finally{__CLR4_1_101phu1phulusqkiqb.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101phu1phulusqkiqb.R.inc(79768);
            __CLR4_1_101phu1phulusqkiqb.R.inc(79769);this.name = name;
        }finally{__CLR4_1_101phu1phulusqkiqb.R.flushNeeded();}}

    }
}
