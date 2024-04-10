/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSONPath;

import junit.framework.TestCase;
import org.junit.Assert;

public class JSONPath_keySet extends TestCase {static class __CLR4_5_21phj1phjlusyjunu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,79759,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final Set<String> KEY_SET = new HashSet<String>();

    static {try{__CLR4_5_21phj1phjlusyjunu.R.inc(79687);
        __CLR4_5_21phj1phjlusyjunu.R.inc(79688);KEY_SET.add("id");
        __CLR4_5_21phj1phjlusyjunu.R.inc(79689);KEY_SET.add("name");
    }finally{__CLR4_5_21phj1phjlusyjunu.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public void test_map() {__CLR4_5_21phj1phjlusyjunu.R.globalSliceStart(getClass().getName(),79690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aaqgyy1phm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21phj1phjlusyjunu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21phj1phjlusyjunu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_keySet.test_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79690,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aaqgyy1phm(){try{__CLR4_5_21phj1phjlusyjunu.R.inc(79690);
        __CLR4_5_21phj1phjlusyjunu.R.inc(79691);Map<String, Integer> map1 = new HashMap<String, Integer>();
        __CLR4_5_21phj1phjlusyjunu.R.inc(79692);map1.put("id", 1);
        __CLR4_5_21phj1phjlusyjunu.R.inc(79693);map1.put("name", null); // null will be included
        __CLR4_5_21phj1phjlusyjunu.R.inc(79694);Assert.assertEquals(KEY_SET, JSONPath.eval(map1, "$.keySet()"));
        __CLR4_5_21phj1phjlusyjunu.R.inc(79695);Assert.assertEquals(KEY_SET, JSONPath.keySet(map1, "$"));

        __CLR4_5_21phj1phjlusyjunu.R.inc(79696);Map<Long, String> map2 = new HashMap<Long, String>();
        __CLR4_5_21phj1phjlusyjunu.R.inc(79697);map2.put(1L, "a");
        __CLR4_5_21phj1phjlusyjunu.R.inc(79698);map2.put(2L, "b");
        __CLR4_5_21phj1phjlusyjunu.R.inc(79699);Set<Long> keys2 = (Set<Long>)JSONPath.eval(map2, "$.keySet()");
        __CLR4_5_21phj1phjlusyjunu.R.inc(79700);Assert.assertEquals(2, keys2.size());
        __CLR4_5_21phj1phjlusyjunu.R.inc(79701);Assert.assertTrue(keys2.contains(1L));
        __CLR4_5_21phj1phjlusyjunu.R.inc(79702);Assert.assertTrue(keys2.contains(2L));
    }finally{__CLR4_5_21phj1phjlusyjunu.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public void test_object() {__CLR4_5_21phj1phjlusyjunu.R.globalSliceStart(getClass().getName(),79703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22k5qab1phz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21phj1phjlusyjunu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21phj1phjlusyjunu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_keySet.test_object",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79703,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22k5qab1phz(){try{__CLR4_5_21phj1phjlusyjunu.R.inc(79703);
        __CLR4_5_21phj1phjlusyjunu.R.inc(79704);Entity e = new Entity();
        __CLR4_5_21phj1phjlusyjunu.R.inc(79705);e.id = 3L;
        __CLR4_5_21phj1phjlusyjunu.R.inc(79706);e.name = "hello";
        __CLR4_5_21phj1phjlusyjunu.R.inc(79707);Collection<String> result = null;
        // age is null
        __CLR4_5_21phj1phjlusyjunu.R.inc(79708);result = (Collection<String>)JSONPath.eval(e, "$.keySet()");
        __CLR4_5_21phj1phjlusyjunu.R.inc(79709);Assert.assertEquals(KEY_SET, result);

        // age not null
        __CLR4_5_21phj1phjlusyjunu.R.inc(79710);e.age = 4L;
        __CLR4_5_21phj1phjlusyjunu.R.inc(79711);result = (Collection<String>)JSONPath.eval(e, "$.keySet()");
        __CLR4_5_21phj1phjlusyjunu.R.inc(79712);Assert.assertEquals(3, result.size());
        __CLR4_5_21phj1phjlusyjunu.R.inc(79713);Assert.assertTrue(result.containsAll(KEY_SET));
        __CLR4_5_21phj1phjlusyjunu.R.inc(79714);Assert.assertTrue(result.contains("age"));
    }finally{__CLR4_5_21phj1phjlusyjunu.R.flushNeeded();}}

    public void test_nested() {__CLR4_5_21phj1phjlusyjunu.R.globalSliceStart(getClass().getName(),79715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mp5or1pib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21phj1phjlusyjunu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21phj1phjlusyjunu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_keySet.test_nested",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79715,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mp5or1pib(){try{__CLR4_5_21phj1phjlusyjunu.R.inc(79715);
        __CLR4_5_21phj1phjlusyjunu.R.inc(79716);Entity e = new Entity();
        __CLR4_5_21phj1phjlusyjunu.R.inc(79717);e.id = 3L;
        __CLR4_5_21phj1phjlusyjunu.R.inc(79718);e.name = "hello";
        __CLR4_5_21phj1phjlusyjunu.R.inc(79719);Object obj = Collections.singletonMap("obj", e);
        __CLR4_5_21phj1phjlusyjunu.R.inc(79720);Assert.assertEquals(KEY_SET, JSONPath.eval(obj, "$.obj.keySet()"));
        __CLR4_5_21phj1phjlusyjunu.R.inc(79721);Assert.assertEquals(KEY_SET, new JSONPath("$.obj").keySet(obj));
    }finally{__CLR4_5_21phj1phjlusyjunu.R.flushNeeded();}}

    public void test_unsupported() {__CLR4_5_21phj1phjlusyjunu.R.globalSliceStart(getClass().getName(),79722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l077ap1pii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21phj1phjlusyjunu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21phj1phjlusyjunu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_keySet.test_unsupported",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79722,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l077ap1pii(){try{__CLR4_5_21phj1phjlusyjunu.R.inc(79722);
        __CLR4_5_21phj1phjlusyjunu.R.inc(79723);Entity e = new Entity();
        __CLR4_5_21phj1phjlusyjunu.R.inc(79724);e.id = 3L;
        __CLR4_5_21phj1phjlusyjunu.R.inc(79725);Entity[] array = {e};
        __CLR4_5_21phj1phjlusyjunu.R.inc(79726);Map<String, Entity[]> map = Collections.singletonMap("array", array);
        __CLR4_5_21phj1phjlusyjunu.R.inc(79727);Assert.assertEquals(array, JSONPath.eval(map, "$.array"));
        __CLR4_5_21phj1phjlusyjunu.R.inc(79728);Assert.assertNull(JSONPath.eval(map, "$.array.keySet()"));
        __CLR4_5_21phj1phjlusyjunu.R.inc(79729);Assert.assertNull(JSONPath.keySet(map, "$.array"));
        __CLR4_5_21phj1phjlusyjunu.R.inc(79730);Assert.assertNull(new JSONPath("$.array").keySet(map));
    }finally{__CLR4_5_21phj1phjlusyjunu.R.flushNeeded();}}

    public void test_null() {__CLR4_5_21phj1phjlusyjunu.R.globalSliceStart(getClass().getName(),79731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1pir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21phj1phjlusyjunu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21phj1phjlusyjunu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_keySet.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79731,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1pir(){try{__CLR4_5_21phj1phjlusyjunu.R.inc(79731);
        __CLR4_5_21phj1phjlusyjunu.R.inc(79732);Assert.assertNull(JSONPath.eval(null, "$.keySet()"));
        __CLR4_5_21phj1phjlusyjunu.R.inc(79733);Set<?> keySet = (Set<?>)JSONPath.eval(new HashMap<String, Object>(), "$.keySet()");
        __CLR4_5_21phj1phjlusyjunu.R.inc(79734);Assert.assertEquals(0, keySet.size());
    }finally{__CLR4_5_21phj1phjlusyjunu.R.flushNeeded();}}

    /**
     * Demo for wiki
     */
    @SuppressWarnings("unchecked")
    public void test_demo() {__CLR4_5_21phj1phjlusyjunu.R.globalSliceStart(getClass().getName(),79735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26h7j9l1piv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21phj1phjlusyjunu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21phj1phjlusyjunu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_keySet.test_demo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79735,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26h7j9l1piv(){try{__CLR4_5_21phj1phjlusyjunu.R.inc(79735);
        __CLR4_5_21phj1phjlusyjunu.R.inc(79736);Entity e = new Entity();
        __CLR4_5_21phj1phjlusyjunu.R.inc(79737);e.setId(null);
        __CLR4_5_21phj1phjlusyjunu.R.inc(79738);e.setName("hello");
        __CLR4_5_21phj1phjlusyjunu.R.inc(79739);Map<String, Entity> map = Collections.singletonMap("e", e);
        __CLR4_5_21phj1phjlusyjunu.R.inc(79740);Collection<String> result;

        // id is null, excluded by keySet
        __CLR4_5_21phj1phjlusyjunu.R.inc(79741);result = (Collection<String>)JSONPath.eval(map, "$.e.keySet()");
        __CLR4_5_21phj1phjlusyjunu.R.inc(79742);assertEquals(1, result.size());
        __CLR4_5_21phj1phjlusyjunu.R.inc(79743);Assert.assertTrue(result.contains("name"));

        __CLR4_5_21phj1phjlusyjunu.R.inc(79744);e.setId(1L);
        __CLR4_5_21phj1phjlusyjunu.R.inc(79745);result = (Collection<String>)JSONPath.eval(map, "$.e.keySet()");
        __CLR4_5_21phj1phjlusyjunu.R.inc(79746);Assert.assertEquals(2, result.size());
        __CLR4_5_21phj1phjlusyjunu.R.inc(79747);Assert.assertTrue(result.contains("id")); // included
        __CLR4_5_21phj1phjlusyjunu.R.inc(79748);Assert.assertTrue(result.contains("name"));

        // Same result
        __CLR4_5_21phj1phjlusyjunu.R.inc(79749);Assert.assertEquals(result, JSONPath.keySet(map, "$.e"));
        __CLR4_5_21phj1phjlusyjunu.R.inc(79750);Assert.assertEquals(result, new JSONPath("$.e").keySet(map));
    }finally{__CLR4_5_21phj1phjlusyjunu.R.flushNeeded();}}

    public static class Entity {
        private Long id;
        private String name;
        public Long age;

        public Long getId() {try{__CLR4_5_21phj1phjlusyjunu.R.inc(79751);
            __CLR4_5_21phj1phjlusyjunu.R.inc(79752);return id;
        }finally{__CLR4_5_21phj1phjlusyjunu.R.flushNeeded();}}

        public void setId(Long id) {try{__CLR4_5_21phj1phjlusyjunu.R.inc(79753);
            __CLR4_5_21phj1phjlusyjunu.R.inc(79754);this.id = id;
        }finally{__CLR4_5_21phj1phjlusyjunu.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21phj1phjlusyjunu.R.inc(79755);
            __CLR4_5_21phj1phjlusyjunu.R.inc(79756);return name;
        }finally{__CLR4_5_21phj1phjlusyjunu.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21phj1phjlusyjunu.R.inc(79757);
            __CLR4_5_21phj1phjlusyjunu.R.inc(79758);this.name = name;
        }finally{__CLR4_5_21phj1phjlusyjunu.R.flushNeeded();}}

    }
}
