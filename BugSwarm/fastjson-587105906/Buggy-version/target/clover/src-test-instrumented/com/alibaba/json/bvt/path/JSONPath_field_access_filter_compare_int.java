/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_compare_int extends TestCase {static class __CLR4_1_101ppn1ppnluszwedz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,80017,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    List<Entity> entities = new ArrayList<Entity>();

    public JSONPath_field_access_filter_compare_int(){try{__CLR4_1_101ppn1ppnluszwedz.R.inc(79979);
        __CLR4_1_101ppn1ppnluszwedz.R.inc(79980);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101ppn1ppnluszwedz.R.inc(79981);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101ppn1ppnluszwedz.R.inc(79982);entities.add(new Entity(1003, null));
        __CLR4_1_101ppn1ppnluszwedz.R.inc(79983);entities.add(new Entity(null, null));
    }finally{__CLR4_1_101ppn1ppnluszwedz.R.flushNeeded();}}

    public void test_list_map_le() throws Exception {__CLR4_1_101ppn1ppnluszwedz.R.globalSliceStart(getClass().getName(),79984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102c33131pps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ppn1ppnluszwedz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ppn1ppnluszwedz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_int.test_list_map_le",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79984,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102c33131pps() throws Exception{try{__CLR4_1_101ppn1ppnluszwedz.R.inc(79984);
        __CLR4_1_101ppn1ppnluszwedz.R.inc(79985);JSONPath path = new JSONPath("$[?(@.id <= 1002)]");

        __CLR4_1_101ppn1ppnluszwedz.R.inc(79986);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101ppn1ppnluszwedz.R.inc(79987);Assert.assertEquals(2, result.size());
        __CLR4_1_101ppn1ppnluszwedz.R.inc(79988);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101ppn1ppnluszwedz.R.inc(79989);Assert.assertSame(entities.get(1), result.get(1));
    }finally{__CLR4_1_101ppn1ppnluszwedz.R.flushNeeded();}}

    public void test_list_map_lt() throws Exception {__CLR4_1_101ppn1ppnluszwedz.R.globalSliceStart(getClass().getName(),79990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jy1h2y1ppy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ppn1ppnluszwedz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ppn1ppnluszwedz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_int.test_list_map_lt",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79990,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jy1h2y1ppy() throws Exception{try{__CLR4_1_101ppn1ppnluszwedz.R.inc(79990);
        __CLR4_1_101ppn1ppnluszwedz.R.inc(79991);JSONPath path = new JSONPath("$[?(@.id < 1002)]");

        __CLR4_1_101ppn1ppnluszwedz.R.inc(79992);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101ppn1ppnluszwedz.R.inc(79993);Assert.assertEquals(1, result.size());
        __CLR4_1_101ppn1ppnluszwedz.R.inc(79994);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101ppn1ppnluszwedz.R.flushNeeded();}}
    
    public void test_list_map_ge() throws Exception {__CLR4_1_101ppn1ppnluszwedz.R.globalSliceStart(getClass().getName(),79995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1046zbqc1pq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ppn1ppnluszwedz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ppn1ppnluszwedz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_int.test_list_map_ge",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79995,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1046zbqc1pq3() throws Exception{try{__CLR4_1_101ppn1ppnluszwedz.R.inc(79995);
        __CLR4_1_101ppn1ppnluszwedz.R.inc(79996);JSONPath path = new JSONPath("$[?(@.id >= 1002)]");

        __CLR4_1_101ppn1ppnluszwedz.R.inc(79997);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101ppn1ppnluszwedz.R.inc(79998);Assert.assertEquals(2, result.size());
        __CLR4_1_101ppn1ppnluszwedz.R.inc(79999);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_1_101ppn1ppnluszwedz.R.inc(80000);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_1_101ppn1ppnluszwedz.R.flushNeeded();}}
    
    public void test_list_map_gt() throws Exception {__CLR4_1_101ppn1ppnluszwedz.R.globalSliceStart(getClass().getName(),80001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qh3vud1pq9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ppn1ppnluszwedz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ppn1ppnluszwedz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_int.test_list_map_gt",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80001,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qh3vud1pq9() throws Exception{try{__CLR4_1_101ppn1ppnluszwedz.R.inc(80001);
        __CLR4_1_101ppn1ppnluszwedz.R.inc(80002);JSONPath path = new JSONPath("$[?(@.id > 1002)]");

        __CLR4_1_101ppn1ppnluszwedz.R.inc(80003);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101ppn1ppnluszwedz.R.inc(80004);Assert.assertEquals(1, result.size());
        __CLR4_1_101ppn1ppnluszwedz.R.inc(80005);Assert.assertSame(entities.get(2), result.get(0));
    }finally{__CLR4_1_101ppn1ppnluszwedz.R.flushNeeded();}}

    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_1_101ppn1ppnluszwedz.R.inc(80006);
            __CLR4_1_101ppn1ppnluszwedz.R.inc(80007);this.id = id;
            __CLR4_1_101ppn1ppnluszwedz.R.inc(80008);this.name = name;
        }finally{__CLR4_1_101ppn1ppnluszwedz.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_1_101ppn1ppnluszwedz.R.inc(80009);
            __CLR4_1_101ppn1ppnluszwedz.R.inc(80010);return id;
        }finally{__CLR4_1_101ppn1ppnluszwedz.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_1_101ppn1ppnluszwedz.R.inc(80011);
            __CLR4_1_101ppn1ppnluszwedz.R.inc(80012);this.id = id;
        }finally{__CLR4_1_101ppn1ppnluszwedz.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101ppn1ppnluszwedz.R.inc(80013);
            __CLR4_1_101ppn1ppnluszwedz.R.inc(80014);return name;
        }finally{__CLR4_1_101ppn1ppnluszwedz.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101ppn1ppnluszwedz.R.inc(80015);
            __CLR4_1_101ppn1ppnluszwedz.R.inc(80016);this.name = name;
        }finally{__CLR4_1_101ppn1ppnluszwedz.R.flushNeeded();}}

    }
}
