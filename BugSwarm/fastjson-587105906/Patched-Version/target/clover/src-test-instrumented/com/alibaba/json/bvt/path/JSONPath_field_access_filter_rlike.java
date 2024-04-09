/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_rlike extends TestCase {static class __CLR4_5_21qas1qaslusvnfo2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,80831,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_like_extract() throws Exception {__CLR4_5_21qas1qaslusvnfo2.R.globalSliceStart(getClass().getName(),80740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29501zo1qas();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qas1qaslusvnfo2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qas1qaslusvnfo2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_extract",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80740,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29501zo1qas() throws Exception{try{__CLR4_5_21qas1qaslusvnfo2.R.inc(80740);
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80741);JSONPath path = new JSONPath("$[name rlike 'ljw2083']");

        __CLR4_5_21qas1qaslusvnfo2.R.inc(80742);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80743);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80744);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80745);entities.add(new Entity(1003, null));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80746);entities.add(new Entity(null, null));

        __CLR4_5_21qas1qaslusvnfo2.R.inc(80747);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80748);Assert.assertEquals(1, result.size());
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80749);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21qas1qaslusvnfo2.R.flushNeeded();}}
    
    public void test_list_not_like_extract() throws Exception {__CLR4_5_21qas1qaslusvnfo2.R.globalSliceStart(getClass().getName(),80750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bzg58g1qb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qas1qaslusvnfo2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qas1qaslusvnfo2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_not_like_extract",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80750,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bzg58g1qb2() throws Exception{try{__CLR4_5_21qas1qaslusvnfo2.R.inc(80750);
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80751);JSONPath path = new JSONPath("$[name not rlike 'wenshao']");

        __CLR4_5_21qas1qaslusvnfo2.R.inc(80752);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80753);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80754);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80755);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80756);entities.add(new Entity(null, null));

        __CLR4_5_21qas1qaslusvnfo2.R.inc(80757);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80758);Assert.assertEquals(2, result.size());
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80759);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80760);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_5_21qas1qaslusvnfo2.R.flushNeeded();}}
    
    public void test_list_like_left_match() throws Exception {__CLR4_5_21qas1qaslusvnfo2.R.globalSliceStart(getClass().getName(),80761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nsd1s81qbd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qas1qaslusvnfo2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qas1qaslusvnfo2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_left_match",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80761,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nsd1s81qbd() throws Exception{try{__CLR4_5_21qas1qaslusvnfo2.R.inc(80761);
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80762);JSONPath path = new JSONPath("$[?(@.name like 'ljw%')]");

        __CLR4_5_21qas1qaslusvnfo2.R.inc(80763);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80764);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80765);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80766);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80767);entities.add(new Entity(null, null));

        __CLR4_5_21qas1qaslusvnfo2.R.inc(80768);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80769);Assert.assertEquals(1, result.size());
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80770);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21qas1qaslusvnfo2.R.flushNeeded();}}
    
    public void test_list_like_right_match() throws Exception {__CLR4_5_21qas1qaslusvnfo2.R.globalSliceStart(getClass().getName(),80771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hx3bmz1qbn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qas1qaslusvnfo2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qas1qaslusvnfo2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_right_match",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80771,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hx3bmz1qbn() throws Exception{try{__CLR4_5_21qas1qaslusvnfo2.R.inc(80771);
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80772);JSONPath path = new JSONPath("$[?(@.name like '%2083')]");

        __CLR4_5_21qas1qaslusvnfo2.R.inc(80773);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80774);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80775);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80776);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80777);entities.add(new Entity(null, null));

        __CLR4_5_21qas1qaslusvnfo2.R.inc(80778);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80779);Assert.assertEquals(1, result.size());
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80780);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21qas1qaslusvnfo2.R.flushNeeded();}}
    
    public void test_list_like_contains() throws Exception {__CLR4_5_21qas1qaslusvnfo2.R.globalSliceStart(getClass().getName(),80781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fwgg9y1qbx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qas1qaslusvnfo2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qas1qaslusvnfo2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_contains",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80781,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fwgg9y1qbx() throws Exception{try{__CLR4_5_21qas1qaslusvnfo2.R.inc(80781);
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80782);JSONPath path = new JSONPath("$[?(@.name like '%208%')]");

        __CLR4_5_21qas1qaslusvnfo2.R.inc(80783);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80784);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80785);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80786);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80787);entities.add(new Entity(null, null));

        __CLR4_5_21qas1qaslusvnfo2.R.inc(80788);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80789);Assert.assertEquals(1, result.size());
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80790);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21qas1qaslusvnfo2.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement() throws Exception {__CLR4_5_21qas1qaslusvnfo2.R.globalSliceStart(getClass().getName(),80791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kxs5ka1qc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qas1qaslusvnfo2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qas1qaslusvnfo2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_match_two_segement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80791,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kxs5ka1qc7() throws Exception{try{__CLR4_5_21qas1qaslusvnfo2.R.inc(80791);
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80792);JSONPath path = new JSONPath("$[?(@.name like 'ljw%83')]");

        __CLR4_5_21qas1qaslusvnfo2.R.inc(80793);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80794);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80795);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80796);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80797);entities.add(new Entity(null, null));

        __CLR4_5_21qas1qaslusvnfo2.R.inc(80798);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80799);Assert.assertEquals(1, result.size());
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80800);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21qas1qaslusvnfo2.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_2() throws Exception {__CLR4_5_21qas1qaslusvnfo2.R.globalSliceStart(getClass().getName(),80801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2clwq6v1qch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qas1qaslusvnfo2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qas1qaslusvnfo2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_match_two_segement_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80801,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2clwq6v1qch() throws Exception{try{__CLR4_5_21qas1qaslusvnfo2.R.inc(80801);
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80802);JSONPath path = new JSONPath("$[?(@.name like 'ljw%w2083')]");
        
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80803);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80804);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80805);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80806);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80807);entities.add(new Entity(null, null));
        
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80808);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80809);Assert.assertEquals(0, result.size());
    }finally{__CLR4_5_21qas1qaslusvnfo2.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_3() throws Exception {__CLR4_5_21qas1qaslusvnfo2.R.globalSliceStart(getClass().getName(),80810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29cwree1qcq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qas1qaslusvnfo2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qas1qaslusvnfo2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_match_two_segement_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80810,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29cwree1qcq() throws Exception{try{__CLR4_5_21qas1qaslusvnfo2.R.inc(80810);
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80811);JSONPath path = new JSONPath("$[?(@.name like 'ljw%2%0%83')]");
        
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80812);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80813);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80814);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80815);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80816);entities.add(new Entity(null, null));
        
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80817);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80818);Assert.assertEquals(1, result.size());
        __CLR4_5_21qas1qaslusvnfo2.R.inc(80819);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21qas1qaslusvnfo2.R.flushNeeded();}}

    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_5_21qas1qaslusvnfo2.R.inc(80820);
            __CLR4_5_21qas1qaslusvnfo2.R.inc(80821);this.id = id;
            __CLR4_5_21qas1qaslusvnfo2.R.inc(80822);this.name = name;
        }finally{__CLR4_5_21qas1qaslusvnfo2.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_5_21qas1qaslusvnfo2.R.inc(80823);
            __CLR4_5_21qas1qaslusvnfo2.R.inc(80824);return id;
        }finally{__CLR4_5_21qas1qaslusvnfo2.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_5_21qas1qaslusvnfo2.R.inc(80825);
            __CLR4_5_21qas1qaslusvnfo2.R.inc(80826);this.id = id;
        }finally{__CLR4_5_21qas1qaslusvnfo2.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21qas1qaslusvnfo2.R.inc(80827);
            __CLR4_5_21qas1qaslusvnfo2.R.inc(80828);return name;
        }finally{__CLR4_5_21qas1qaslusvnfo2.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21qas1qaslusvnfo2.R.inc(80829);
            __CLR4_5_21qas1qaslusvnfo2.R.inc(80830);this.name = name;
        }finally{__CLR4_5_21qas1qaslusvnfo2.R.flushNeeded();}}

    }
}
