/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_rlike extends TestCase {static class __CLR4_5_21pck1pcklusyjum1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,79599,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_like_extract() throws Exception {__CLR4_5_21pck1pcklusyjum1.R.globalSliceStart(getClass().getName(),79508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29501zo1pck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pck1pcklusyjum1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pck1pcklusyjum1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_extract",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79508,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29501zo1pck() throws Exception{try{__CLR4_5_21pck1pcklusyjum1.R.inc(79508);
        __CLR4_5_21pck1pcklusyjum1.R.inc(79509);JSONPath path = new JSONPath("$[name rlike 'ljw2083']");

        __CLR4_5_21pck1pcklusyjum1.R.inc(79510);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21pck1pcklusyjum1.R.inc(79511);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79512);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79513);entities.add(new Entity(1003, null));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79514);entities.add(new Entity(null, null));

        __CLR4_5_21pck1pcklusyjum1.R.inc(79515);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21pck1pcklusyjum1.R.inc(79516);Assert.assertEquals(1, result.size());
        __CLR4_5_21pck1pcklusyjum1.R.inc(79517);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21pck1pcklusyjum1.R.flushNeeded();}}
    
    public void test_list_not_like_extract() throws Exception {__CLR4_5_21pck1pcklusyjum1.R.globalSliceStart(getClass().getName(),79518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bzg58g1pcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pck1pcklusyjum1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pck1pcklusyjum1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_not_like_extract",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79518,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bzg58g1pcu() throws Exception{try{__CLR4_5_21pck1pcklusyjum1.R.inc(79518);
        __CLR4_5_21pck1pcklusyjum1.R.inc(79519);JSONPath path = new JSONPath("$[name not rlike 'wenshao']");

        __CLR4_5_21pck1pcklusyjum1.R.inc(79520);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21pck1pcklusyjum1.R.inc(79521);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79522);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79523);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79524);entities.add(new Entity(null, null));

        __CLR4_5_21pck1pcklusyjum1.R.inc(79525);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21pck1pcklusyjum1.R.inc(79526);Assert.assertEquals(2, result.size());
        __CLR4_5_21pck1pcklusyjum1.R.inc(79527);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79528);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_5_21pck1pcklusyjum1.R.flushNeeded();}}
    
    public void test_list_like_left_match() throws Exception {__CLR4_5_21pck1pcklusyjum1.R.globalSliceStart(getClass().getName(),79529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nsd1s81pd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pck1pcklusyjum1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pck1pcklusyjum1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_left_match",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79529,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nsd1s81pd5() throws Exception{try{__CLR4_5_21pck1pcklusyjum1.R.inc(79529);
        __CLR4_5_21pck1pcklusyjum1.R.inc(79530);JSONPath path = new JSONPath("$[?(@.name like 'ljw%')]");

        __CLR4_5_21pck1pcklusyjum1.R.inc(79531);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21pck1pcklusyjum1.R.inc(79532);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79533);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79534);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79535);entities.add(new Entity(null, null));

        __CLR4_5_21pck1pcklusyjum1.R.inc(79536);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21pck1pcklusyjum1.R.inc(79537);Assert.assertEquals(1, result.size());
        __CLR4_5_21pck1pcklusyjum1.R.inc(79538);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21pck1pcklusyjum1.R.flushNeeded();}}
    
    public void test_list_like_right_match() throws Exception {__CLR4_5_21pck1pcklusyjum1.R.globalSliceStart(getClass().getName(),79539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hx3bmz1pdf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pck1pcklusyjum1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pck1pcklusyjum1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_right_match",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79539,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hx3bmz1pdf() throws Exception{try{__CLR4_5_21pck1pcklusyjum1.R.inc(79539);
        __CLR4_5_21pck1pcklusyjum1.R.inc(79540);JSONPath path = new JSONPath("$[?(@.name like '%2083')]");

        __CLR4_5_21pck1pcklusyjum1.R.inc(79541);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21pck1pcklusyjum1.R.inc(79542);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79543);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79544);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79545);entities.add(new Entity(null, null));

        __CLR4_5_21pck1pcklusyjum1.R.inc(79546);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21pck1pcklusyjum1.R.inc(79547);Assert.assertEquals(1, result.size());
        __CLR4_5_21pck1pcklusyjum1.R.inc(79548);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21pck1pcklusyjum1.R.flushNeeded();}}
    
    public void test_list_like_contains() throws Exception {__CLR4_5_21pck1pcklusyjum1.R.globalSliceStart(getClass().getName(),79549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fwgg9y1pdp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pck1pcklusyjum1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pck1pcklusyjum1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_contains",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79549,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fwgg9y1pdp() throws Exception{try{__CLR4_5_21pck1pcklusyjum1.R.inc(79549);
        __CLR4_5_21pck1pcklusyjum1.R.inc(79550);JSONPath path = new JSONPath("$[?(@.name like '%208%')]");

        __CLR4_5_21pck1pcklusyjum1.R.inc(79551);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21pck1pcklusyjum1.R.inc(79552);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79553);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79554);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79555);entities.add(new Entity(null, null));

        __CLR4_5_21pck1pcklusyjum1.R.inc(79556);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21pck1pcklusyjum1.R.inc(79557);Assert.assertEquals(1, result.size());
        __CLR4_5_21pck1pcklusyjum1.R.inc(79558);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21pck1pcklusyjum1.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement() throws Exception {__CLR4_5_21pck1pcklusyjum1.R.globalSliceStart(getClass().getName(),79559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kxs5ka1pdz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pck1pcklusyjum1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pck1pcklusyjum1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_match_two_segement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79559,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kxs5ka1pdz() throws Exception{try{__CLR4_5_21pck1pcklusyjum1.R.inc(79559);
        __CLR4_5_21pck1pcklusyjum1.R.inc(79560);JSONPath path = new JSONPath("$[?(@.name like 'ljw%83')]");

        __CLR4_5_21pck1pcklusyjum1.R.inc(79561);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21pck1pcklusyjum1.R.inc(79562);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79563);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79564);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79565);entities.add(new Entity(null, null));

        __CLR4_5_21pck1pcklusyjum1.R.inc(79566);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21pck1pcklusyjum1.R.inc(79567);Assert.assertEquals(1, result.size());
        __CLR4_5_21pck1pcklusyjum1.R.inc(79568);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21pck1pcklusyjum1.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_2() throws Exception {__CLR4_5_21pck1pcklusyjum1.R.globalSliceStart(getClass().getName(),79569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2clwq6v1pe9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pck1pcklusyjum1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pck1pcklusyjum1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_match_two_segement_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79569,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2clwq6v1pe9() throws Exception{try{__CLR4_5_21pck1pcklusyjum1.R.inc(79569);
        __CLR4_5_21pck1pcklusyjum1.R.inc(79570);JSONPath path = new JSONPath("$[?(@.name like 'ljw%w2083')]");
        
        __CLR4_5_21pck1pcklusyjum1.R.inc(79571);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21pck1pcklusyjum1.R.inc(79572);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79573);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79574);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79575);entities.add(new Entity(null, null));
        
        __CLR4_5_21pck1pcklusyjum1.R.inc(79576);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21pck1pcklusyjum1.R.inc(79577);Assert.assertEquals(0, result.size());
    }finally{__CLR4_5_21pck1pcklusyjum1.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_3() throws Exception {__CLR4_5_21pck1pcklusyjum1.R.globalSliceStart(getClass().getName(),79578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29cwree1pei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pck1pcklusyjum1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pck1pcklusyjum1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_match_two_segement_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79578,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29cwree1pei() throws Exception{try{__CLR4_5_21pck1pcklusyjum1.R.inc(79578);
        __CLR4_5_21pck1pcklusyjum1.R.inc(79579);JSONPath path = new JSONPath("$[?(@.name like 'ljw%2%0%83')]");
        
        __CLR4_5_21pck1pcklusyjum1.R.inc(79580);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21pck1pcklusyjum1.R.inc(79581);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79582);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79583);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21pck1pcklusyjum1.R.inc(79584);entities.add(new Entity(null, null));
        
        __CLR4_5_21pck1pcklusyjum1.R.inc(79585);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21pck1pcklusyjum1.R.inc(79586);Assert.assertEquals(1, result.size());
        __CLR4_5_21pck1pcklusyjum1.R.inc(79587);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21pck1pcklusyjum1.R.flushNeeded();}}

    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_5_21pck1pcklusyjum1.R.inc(79588);
            __CLR4_5_21pck1pcklusyjum1.R.inc(79589);this.id = id;
            __CLR4_5_21pck1pcklusyjum1.R.inc(79590);this.name = name;
        }finally{__CLR4_5_21pck1pcklusyjum1.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_5_21pck1pcklusyjum1.R.inc(79591);
            __CLR4_5_21pck1pcklusyjum1.R.inc(79592);return id;
        }finally{__CLR4_5_21pck1pcklusyjum1.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_5_21pck1pcklusyjum1.R.inc(79593);
            __CLR4_5_21pck1pcklusyjum1.R.inc(79594);this.id = id;
        }finally{__CLR4_5_21pck1pcklusyjum1.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21pck1pcklusyjum1.R.inc(79595);
            __CLR4_5_21pck1pcklusyjum1.R.inc(79596);return name;
        }finally{__CLR4_5_21pck1pcklusyjum1.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21pck1pcklusyjum1.R.inc(79597);
            __CLR4_5_21pck1pcklusyjum1.R.inc(79598);this.name = name;
        }finally{__CLR4_5_21pck1pcklusyjum1.R.flushNeeded();}}

    }
}
