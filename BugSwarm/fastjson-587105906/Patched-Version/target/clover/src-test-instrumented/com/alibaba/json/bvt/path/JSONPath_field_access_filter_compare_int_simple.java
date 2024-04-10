/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_compare_int_simple extends TestCase {static class __CLR4_5_21os61os6lusyjujt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,78807,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_5_21os61os6lusyjujt.R.globalSliceStart(getClass().getName(),78774);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259ny8i1os6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21os61os6lusyjujt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21os61os6lusyjujt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_int_simple.test_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78774,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259ny8i1os6() throws Exception{try{__CLR4_5_21os61os6lusyjujt.R.inc(78774);
        __CLR4_5_21os61os6lusyjujt.R.inc(78775);JSONPath path = new JSONPath("$[id <= 1002]");

        __CLR4_5_21os61os6lusyjujt.R.inc(78776);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21os61os6lusyjujt.R.inc(78777);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21os61os6lusyjujt.R.inc(78778);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21os61os6lusyjujt.R.inc(78779);entities.add(new Entity(1003, null));
        __CLR4_5_21os61os6lusyjujt.R.inc(78780);entities.add(new Entity(null, null));

        __CLR4_5_21os61os6lusyjujt.R.inc(78781);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21os61os6lusyjujt.R.inc(78782);Assert.assertEquals(2, result.size());
        __CLR4_5_21os61os6lusyjujt.R.inc(78783);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21os61os6lusyjujt.R.inc(78784);Assert.assertSame(entities.get(1), result.get(1));
    }finally{__CLR4_5_21os61os6lusyjujt.R.flushNeeded();}}

    public void test_list_2() throws Exception {__CLR4_5_21os61os6lusyjujt.R.globalSliceStart(getClass().getName(),78785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r959r91osh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21os61os6lusyjujt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21os61os6lusyjujt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_int_simple.test_list_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78785,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r959r91osh() throws Exception{try{__CLR4_5_21os61os6lusyjujt.R.inc(78785);
        __CLR4_5_21os61os6lusyjujt.R.inc(78786);JSONPath path = new JSONPath("[id <= 1002]");

        __CLR4_5_21os61os6lusyjujt.R.inc(78787);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21os61os6lusyjujt.R.inc(78788);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21os61os6lusyjujt.R.inc(78789);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21os61os6lusyjujt.R.inc(78790);entities.add(new Entity(1003, null));
        __CLR4_5_21os61os6lusyjujt.R.inc(78791);entities.add(new Entity(null, null));

        __CLR4_5_21os61os6lusyjujt.R.inc(78792);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21os61os6lusyjujt.R.inc(78793);Assert.assertEquals(2, result.size());
        __CLR4_5_21os61os6lusyjujt.R.inc(78794);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21os61os6lusyjujt.R.inc(78795);Assert.assertSame(entities.get(1), result.get(1));
    }finally{__CLR4_5_21os61os6lusyjujt.R.flushNeeded();}}

    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_5_21os61os6lusyjujt.R.inc(78796);
            __CLR4_5_21os61os6lusyjujt.R.inc(78797);this.id = id;
            __CLR4_5_21os61os6lusyjujt.R.inc(78798);this.name = name;
        }finally{__CLR4_5_21os61os6lusyjujt.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_5_21os61os6lusyjujt.R.inc(78799);
            __CLR4_5_21os61os6lusyjujt.R.inc(78800);return id;
        }finally{__CLR4_5_21os61os6lusyjujt.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_5_21os61os6lusyjujt.R.inc(78801);
            __CLR4_5_21os61os6lusyjujt.R.inc(78802);this.id = id;
        }finally{__CLR4_5_21os61os6lusyjujt.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21os61os6lusyjujt.R.inc(78803);
            __CLR4_5_21os61os6lusyjujt.R.inc(78804);return name;
        }finally{__CLR4_5_21os61os6lusyjujt.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21os61os6lusyjujt.R.inc(78805);
            __CLR4_5_21os61os6lusyjujt.R.inc(78806);this.name = name;
        }finally{__CLR4_5_21os61os6lusyjujt.R.flushNeeded();}}

    }
}
