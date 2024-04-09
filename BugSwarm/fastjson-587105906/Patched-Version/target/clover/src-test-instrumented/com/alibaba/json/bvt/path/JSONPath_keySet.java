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

public class JSONPath_keySet extends TestCase {static class __CLR4_5_21qfr1qfrlusvnfow{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,80991,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final Set<String> KEY_SET = new HashSet<String>();

    static {try{__CLR4_5_21qfr1qfrlusvnfow.R.inc(80919);
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80920);KEY_SET.add("id");
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80921);KEY_SET.add("name");
    }finally{__CLR4_5_21qfr1qfrlusvnfow.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public void test_map() {__CLR4_5_21qfr1qfrlusvnfow.R.globalSliceStart(getClass().getName(),80922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aaqgyy1qfu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qfr1qfrlusvnfow.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qfr1qfrlusvnfow.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_keySet.test_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80922,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aaqgyy1qfu(){try{__CLR4_5_21qfr1qfrlusvnfow.R.inc(80922);
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80923);Map<String, Integer> map1 = new HashMap<String, Integer>();
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80924);map1.put("id", 1);
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80925);map1.put("name", null); // null will be included
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80926);Assert.assertEquals(KEY_SET, JSONPath.eval(map1, "$.keySet()"));
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80927);Assert.assertEquals(KEY_SET, JSONPath.keySet(map1, "$"));

        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80928);Map<Long, String> map2 = new HashMap<Long, String>();
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80929);map2.put(1L, "a");
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80930);map2.put(2L, "b");
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80931);Set<Long> keys2 = (Set<Long>)JSONPath.eval(map2, "$.keySet()");
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80932);Assert.assertEquals(2, keys2.size());
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80933);Assert.assertTrue(keys2.contains(1L));
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80934);Assert.assertTrue(keys2.contains(2L));
    }finally{__CLR4_5_21qfr1qfrlusvnfow.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public void test_object() {__CLR4_5_21qfr1qfrlusvnfow.R.globalSliceStart(getClass().getName(),80935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22k5qab1qg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qfr1qfrlusvnfow.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qfr1qfrlusvnfow.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_keySet.test_object",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80935,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22k5qab1qg7(){try{__CLR4_5_21qfr1qfrlusvnfow.R.inc(80935);
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80936);Entity e = new Entity();
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80937);e.id = 3L;
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80938);e.name = "hello";
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80939);Collection<String> result = null;
        // age is null
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80940);result = (Collection<String>)JSONPath.eval(e, "$.keySet()");
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80941);Assert.assertEquals(KEY_SET, result);

        // age not null
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80942);e.age = 4L;
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80943);result = (Collection<String>)JSONPath.eval(e, "$.keySet()");
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80944);Assert.assertEquals(3, result.size());
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80945);Assert.assertTrue(result.containsAll(KEY_SET));
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80946);Assert.assertTrue(result.contains("age"));
    }finally{__CLR4_5_21qfr1qfrlusvnfow.R.flushNeeded();}}

    public void test_nested() {__CLR4_5_21qfr1qfrlusvnfow.R.globalSliceStart(getClass().getName(),80947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mp5or1qgj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qfr1qfrlusvnfow.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qfr1qfrlusvnfow.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_keySet.test_nested",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80947,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mp5or1qgj(){try{__CLR4_5_21qfr1qfrlusvnfow.R.inc(80947);
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80948);Entity e = new Entity();
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80949);e.id = 3L;
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80950);e.name = "hello";
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80951);Object obj = Collections.singletonMap("obj", e);
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80952);Assert.assertEquals(KEY_SET, JSONPath.eval(obj, "$.obj.keySet()"));
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80953);Assert.assertEquals(KEY_SET, new JSONPath("$.obj").keySet(obj));
    }finally{__CLR4_5_21qfr1qfrlusvnfow.R.flushNeeded();}}

    public void test_unsupported() {__CLR4_5_21qfr1qfrlusvnfow.R.globalSliceStart(getClass().getName(),80954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l077ap1qgq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qfr1qfrlusvnfow.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qfr1qfrlusvnfow.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_keySet.test_unsupported",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80954,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l077ap1qgq(){try{__CLR4_5_21qfr1qfrlusvnfow.R.inc(80954);
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80955);Entity e = new Entity();
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80956);e.id = 3L;
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80957);Entity[] array = {e};
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80958);Map<String, Entity[]> map = Collections.singletonMap("array", array);
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80959);Assert.assertEquals(array, JSONPath.eval(map, "$.array"));
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80960);Assert.assertNull(JSONPath.eval(map, "$.array.keySet()"));
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80961);Assert.assertNull(JSONPath.keySet(map, "$.array"));
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80962);Assert.assertNull(new JSONPath("$.array").keySet(map));
    }finally{__CLR4_5_21qfr1qfrlusvnfow.R.flushNeeded();}}

    public void test_null() {__CLR4_5_21qfr1qfrlusvnfow.R.globalSliceStart(getClass().getName(),80963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1qgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qfr1qfrlusvnfow.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qfr1qfrlusvnfow.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_keySet.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80963,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1qgz(){try{__CLR4_5_21qfr1qfrlusvnfow.R.inc(80963);
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80964);Assert.assertNull(JSONPath.eval(null, "$.keySet()"));
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80965);Set<?> keySet = (Set<?>)JSONPath.eval(new HashMap<String, Object>(), "$.keySet()");
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80966);Assert.assertEquals(0, keySet.size());
    }finally{__CLR4_5_21qfr1qfrlusvnfow.R.flushNeeded();}}

    /**
     * Demo for wiki
     */
    @SuppressWarnings("unchecked")
    public void test_demo() {__CLR4_5_21qfr1qfrlusvnfow.R.globalSliceStart(getClass().getName(),80967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26h7j9l1qh3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qfr1qfrlusvnfow.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qfr1qfrlusvnfow.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_keySet.test_demo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80967,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26h7j9l1qh3(){try{__CLR4_5_21qfr1qfrlusvnfow.R.inc(80967);
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80968);Entity e = new Entity();
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80969);e.setId(null);
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80970);e.setName("hello");
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80971);Map<String, Entity> map = Collections.singletonMap("e", e);
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80972);Collection<String> result;

        // id is null, excluded by keySet
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80973);result = (Collection<String>)JSONPath.eval(map, "$.e.keySet()");
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80974);assertEquals(1, result.size());
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80975);Assert.assertTrue(result.contains("name"));

        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80976);e.setId(1L);
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80977);result = (Collection<String>)JSONPath.eval(map, "$.e.keySet()");
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80978);Assert.assertEquals(2, result.size());
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80979);Assert.assertTrue(result.contains("id")); // included
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80980);Assert.assertTrue(result.contains("name"));

        // Same result
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80981);Assert.assertEquals(result, JSONPath.keySet(map, "$.e"));
        __CLR4_5_21qfr1qfrlusvnfow.R.inc(80982);Assert.assertEquals(result, new JSONPath("$.e").keySet(map));
    }finally{__CLR4_5_21qfr1qfrlusvnfow.R.flushNeeded();}}

    public static class Entity {
        private Long id;
        private String name;
        public Long age;

        public Long getId() {try{__CLR4_5_21qfr1qfrlusvnfow.R.inc(80983);
            __CLR4_5_21qfr1qfrlusvnfow.R.inc(80984);return id;
        }finally{__CLR4_5_21qfr1qfrlusvnfow.R.flushNeeded();}}

        public void setId(Long id) {try{__CLR4_5_21qfr1qfrlusvnfow.R.inc(80985);
            __CLR4_5_21qfr1qfrlusvnfow.R.inc(80986);this.id = id;
        }finally{__CLR4_5_21qfr1qfrlusvnfow.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21qfr1qfrlusvnfow.R.inc(80987);
            __CLR4_5_21qfr1qfrlusvnfow.R.inc(80988);return name;
        }finally{__CLR4_5_21qfr1qfrlusvnfow.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21qfr1qfrlusvnfow.R.inc(80989);
            __CLR4_5_21qfr1qfrlusvnfow.R.inc(80990);this.name = name;
        }finally{__CLR4_5_21qfr1qfrlusvnfow.R.flushNeeded();}}

    }
}
