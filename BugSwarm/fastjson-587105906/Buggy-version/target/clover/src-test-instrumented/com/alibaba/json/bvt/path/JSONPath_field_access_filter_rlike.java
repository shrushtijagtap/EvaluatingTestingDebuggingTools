/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_rlike extends TestCase {static class __CLR4_1_101pcv1pcvlusqkinq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,79610,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_like_extract() throws Exception {__CLR4_1_101pcv1pcvlusqkinq.R.globalSliceStart(getClass().getName(),79519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109501zo1pcv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pcv1pcvlusqkinq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pcv1pcvlusqkinq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_extract",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79519,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109501zo1pcv() throws Exception{try{__CLR4_1_101pcv1pcvlusqkinq.R.inc(79519);
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79520);JSONPath path = new JSONPath("$[name rlike 'ljw2083']");

        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79521);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79522);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79523);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79524);entities.add(new Entity(1003, null));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79525);entities.add(new Entity(null, null));

        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79526);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79527);Assert.assertEquals(1, result.size());
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79528);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101pcv1pcvlusqkinq.R.flushNeeded();}}
    
    public void test_list_not_like_extract() throws Exception {__CLR4_1_101pcv1pcvlusqkinq.R.globalSliceStart(getClass().getName(),79529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bzg58g1pd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pcv1pcvlusqkinq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pcv1pcvlusqkinq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_not_like_extract",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79529,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bzg58g1pd5() throws Exception{try{__CLR4_1_101pcv1pcvlusqkinq.R.inc(79529);
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79530);JSONPath path = new JSONPath("$[name not rlike 'wenshao']");

        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79531);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79532);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79533);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79534);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79535);entities.add(new Entity(null, null));

        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79536);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79537);Assert.assertEquals(2, result.size());
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79538);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79539);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_1_101pcv1pcvlusqkinq.R.flushNeeded();}}
    
    public void test_list_like_left_match() throws Exception {__CLR4_1_101pcv1pcvlusqkinq.R.globalSliceStart(getClass().getName(),79540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nsd1s81pdg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pcv1pcvlusqkinq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pcv1pcvlusqkinq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_left_match",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79540,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nsd1s81pdg() throws Exception{try{__CLR4_1_101pcv1pcvlusqkinq.R.inc(79540);
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79541);JSONPath path = new JSONPath("$[?(@.name like 'ljw%')]");

        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79542);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79543);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79544);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79545);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79546);entities.add(new Entity(null, null));

        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79547);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79548);Assert.assertEquals(1, result.size());
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79549);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101pcv1pcvlusqkinq.R.flushNeeded();}}
    
    public void test_list_like_right_match() throws Exception {__CLR4_1_101pcv1pcvlusqkinq.R.globalSliceStart(getClass().getName(),79550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hx3bmz1pdq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pcv1pcvlusqkinq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pcv1pcvlusqkinq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_right_match",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79550,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hx3bmz1pdq() throws Exception{try{__CLR4_1_101pcv1pcvlusqkinq.R.inc(79550);
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79551);JSONPath path = new JSONPath("$[?(@.name like '%2083')]");

        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79552);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79553);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79554);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79555);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79556);entities.add(new Entity(null, null));

        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79557);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79558);Assert.assertEquals(1, result.size());
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79559);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101pcv1pcvlusqkinq.R.flushNeeded();}}
    
    public void test_list_like_contains() throws Exception {__CLR4_1_101pcv1pcvlusqkinq.R.globalSliceStart(getClass().getName(),79560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fwgg9y1pe0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pcv1pcvlusqkinq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pcv1pcvlusqkinq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_contains",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79560,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fwgg9y1pe0() throws Exception{try{__CLR4_1_101pcv1pcvlusqkinq.R.inc(79560);
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79561);JSONPath path = new JSONPath("$[?(@.name like '%208%')]");

        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79562);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79563);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79564);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79565);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79566);entities.add(new Entity(null, null));

        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79567);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79568);Assert.assertEquals(1, result.size());
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79569);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101pcv1pcvlusqkinq.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement() throws Exception {__CLR4_1_101pcv1pcvlusqkinq.R.globalSliceStart(getClass().getName(),79570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kxs5ka1pea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pcv1pcvlusqkinq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pcv1pcvlusqkinq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_match_two_segement",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79570,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kxs5ka1pea() throws Exception{try{__CLR4_1_101pcv1pcvlusqkinq.R.inc(79570);
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79571);JSONPath path = new JSONPath("$[?(@.name like 'ljw%83')]");

        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79572);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79573);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79574);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79575);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79576);entities.add(new Entity(null, null));

        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79577);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79578);Assert.assertEquals(1, result.size());
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79579);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101pcv1pcvlusqkinq.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_2() throws Exception {__CLR4_1_101pcv1pcvlusqkinq.R.globalSliceStart(getClass().getName(),79580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10clwq6v1pek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pcv1pcvlusqkinq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pcv1pcvlusqkinq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_match_two_segement_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79580,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10clwq6v1pek() throws Exception{try{__CLR4_1_101pcv1pcvlusqkinq.R.inc(79580);
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79581);JSONPath path = new JSONPath("$[?(@.name like 'ljw%w2083')]");
        
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79582);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79583);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79584);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79585);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79586);entities.add(new Entity(null, null));
        
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79587);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79588);Assert.assertEquals(0, result.size());
    }finally{__CLR4_1_101pcv1pcvlusqkinq.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_3() throws Exception {__CLR4_1_101pcv1pcvlusqkinq.R.globalSliceStart(getClass().getName(),79589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109cwree1pet();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pcv1pcvlusqkinq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pcv1pcvlusqkinq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_rlike.test_list_like_match_two_segement_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79589,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109cwree1pet() throws Exception{try{__CLR4_1_101pcv1pcvlusqkinq.R.inc(79589);
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79590);JSONPath path = new JSONPath("$[?(@.name like 'ljw%2%0%83')]");
        
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79591);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79592);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79593);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79594);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79595);entities.add(new Entity(null, null));
        
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79596);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79597);Assert.assertEquals(1, result.size());
        __CLR4_1_101pcv1pcvlusqkinq.R.inc(79598);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101pcv1pcvlusqkinq.R.flushNeeded();}}

    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_1_101pcv1pcvlusqkinq.R.inc(79599);
            __CLR4_1_101pcv1pcvlusqkinq.R.inc(79600);this.id = id;
            __CLR4_1_101pcv1pcvlusqkinq.R.inc(79601);this.name = name;
        }finally{__CLR4_1_101pcv1pcvlusqkinq.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_1_101pcv1pcvlusqkinq.R.inc(79602);
            __CLR4_1_101pcv1pcvlusqkinq.R.inc(79603);return id;
        }finally{__CLR4_1_101pcv1pcvlusqkinq.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_1_101pcv1pcvlusqkinq.R.inc(79604);
            __CLR4_1_101pcv1pcvlusqkinq.R.inc(79605);this.id = id;
        }finally{__CLR4_1_101pcv1pcvlusqkinq.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101pcv1pcvlusqkinq.R.inc(79606);
            __CLR4_1_101pcv1pcvlusqkinq.R.inc(79607);return name;
        }finally{__CLR4_1_101pcv1pcvlusqkinq.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101pcv1pcvlusqkinq.R.inc(79608);
            __CLR4_1_101pcv1pcvlusqkinq.R.inc(79609);this.name = name;
        }finally{__CLR4_1_101pcv1pcvlusqkinq.R.flushNeeded();}}

    }
}
