/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_notNull extends TestCase {static class __CLR4_5_21qa71qa7lusvnfnn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,80740,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_map() throws Exception {__CLR4_5_21qa71qa7lusvnfnn.R.globalSliceStart(getClass().getName(),80719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ivxo4x1qa7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qa71qa7lusvnfnn.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qa71qa7lusvnfnn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_notNull.test_list_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80719,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ivxo4x1qa7() throws Exception{try{__CLR4_5_21qa71qa7lusvnfnn.R.inc(80719);
        __CLR4_5_21qa71qa7lusvnfnn.R.inc(80720);JSONPath path = new JSONPath("$[?(@.name)]");

        __CLR4_5_21qa71qa7lusvnfnn.R.inc(80721);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21qa71qa7lusvnfnn.R.inc(80722);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21qa71qa7lusvnfnn.R.inc(80723);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21qa71qa7lusvnfnn.R.inc(80724);entities.add(new Entity(1003, null));

        __CLR4_5_21qa71qa7lusvnfnn.R.inc(80725);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21qa71qa7lusvnfnn.R.inc(80726);Assert.assertEquals(2, result.size());
        __CLR4_5_21qa71qa7lusvnfnn.R.inc(80727);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21qa71qa7lusvnfnn.R.inc(80728);Assert.assertSame(entities.get(1), result.get(1));
    }finally{__CLR4_5_21qa71qa7lusvnfnn.R.flushNeeded();}}

    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_5_21qa71qa7lusvnfnn.R.inc(80729);
            __CLR4_5_21qa71qa7lusvnfnn.R.inc(80730);this.id = id;
            __CLR4_5_21qa71qa7lusvnfnn.R.inc(80731);this.name = name;
        }finally{__CLR4_5_21qa71qa7lusvnfnn.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_5_21qa71qa7lusvnfnn.R.inc(80732);
            __CLR4_5_21qa71qa7lusvnfnn.R.inc(80733);return id;
        }finally{__CLR4_5_21qa71qa7lusvnfnn.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_5_21qa71qa7lusvnfnn.R.inc(80734);
            __CLR4_5_21qa71qa7lusvnfnn.R.inc(80735);this.id = id;
        }finally{__CLR4_5_21qa71qa7lusvnfnn.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21qa71qa7lusvnfnn.R.inc(80736);
            __CLR4_5_21qa71qa7lusvnfnn.R.inc(80737);return name;
        }finally{__CLR4_5_21qa71qa7lusvnfnn.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21qa71qa7lusvnfnn.R.inc(80738);
            __CLR4_5_21qa71qa7lusvnfnn.R.inc(80739);this.name = name;
        }finally{__CLR4_5_21qa71qa7lusvnfnn.R.flushNeeded();}}

    }
}
