/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_like extends TestCase {static class __CLR4_1_101q3j1q3jluszwej0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,80571,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_like_extract() throws Exception {__CLR4_1_101q3j1q3jluszwej0.R.globalSliceStart(getClass().getName(),80479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109501zo1q3j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q3j1q3jluszwej0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q3j1q3jluszwej0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_extract",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80479,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109501zo1q3j() throws Exception{try{__CLR4_1_101q3j1q3jluszwej0.R.inc(80479);
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80480);JSONPath path = new JSONPath("$[?(@.name like 'ljw2083')]");

        __CLR4_1_101q3j1q3jluszwej0.R.inc(80481);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80482);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80483);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80484);entities.add(new Entity(1003, null));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80485);entities.add(new Entity(null, null));

        __CLR4_1_101q3j1q3jluszwej0.R.inc(80486);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80487);Assert.assertEquals(1, result.size());
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80488);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101q3j1q3jluszwej0.R.flushNeeded();}}
    
    public void test_list_not_like_extract() throws Exception {__CLR4_1_101q3j1q3jluszwej0.R.globalSliceStart(getClass().getName(),80489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bzg58g1q3t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q3j1q3jluszwej0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q3j1q3jluszwej0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_not_like_extract",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80489,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bzg58g1q3t() throws Exception{try{__CLR4_1_101q3j1q3jluszwej0.R.inc(80489);
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80490);JSONPath path = new JSONPath("$[?(@.name not like 'ljw2083')]");

        __CLR4_1_101q3j1q3jluszwej0.R.inc(80491);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80492);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80493);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80494);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80495);entities.add(new Entity(null, null));

        __CLR4_1_101q3j1q3jluszwej0.R.inc(80496);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80497);Assert.assertEquals(3, result.size());
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80498);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80499);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80500);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_1_101q3j1q3jluszwej0.R.flushNeeded();}}
    
    public void test_list_like_left_match() throws Exception {__CLR4_1_101q3j1q3jluszwej0.R.globalSliceStart(getClass().getName(),80501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nsd1s81q45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q3j1q3jluszwej0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q3j1q3jluszwej0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_left_match",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80501,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nsd1s81q45() throws Exception{try{__CLR4_1_101q3j1q3jluszwej0.R.inc(80501);
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80502);JSONPath path = new JSONPath("$[?(@.name like 'ljw%')]");

        __CLR4_1_101q3j1q3jluszwej0.R.inc(80503);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80504);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80505);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80506);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80507);entities.add(new Entity(null, null));

        __CLR4_1_101q3j1q3jluszwej0.R.inc(80508);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80509);Assert.assertEquals(1, result.size());
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80510);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101q3j1q3jluszwej0.R.flushNeeded();}}
    
    public void test_list_like_right_match() throws Exception {__CLR4_1_101q3j1q3jluszwej0.R.globalSliceStart(getClass().getName(),80511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hx3bmz1q4f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q3j1q3jluszwej0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q3j1q3jluszwej0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_right_match",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80511,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hx3bmz1q4f() throws Exception{try{__CLR4_1_101q3j1q3jluszwej0.R.inc(80511);
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80512);JSONPath path = new JSONPath("$[?(@.name like '%2083')]");

        __CLR4_1_101q3j1q3jluszwej0.R.inc(80513);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80514);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80515);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80516);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80517);entities.add(new Entity(null, null));

        __CLR4_1_101q3j1q3jluszwej0.R.inc(80518);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80519);Assert.assertEquals(1, result.size());
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80520);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101q3j1q3jluszwej0.R.flushNeeded();}}
    
    public void test_list_like_contains() throws Exception {__CLR4_1_101q3j1q3jluszwej0.R.globalSliceStart(getClass().getName(),80521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fwgg9y1q4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q3j1q3jluszwej0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q3j1q3jluszwej0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_contains",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80521,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fwgg9y1q4p() throws Exception{try{__CLR4_1_101q3j1q3jluszwej0.R.inc(80521);
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80522);JSONPath path = new JSONPath("$[?(@.name like '%208%')]");

        __CLR4_1_101q3j1q3jluszwej0.R.inc(80523);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80524);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80525);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80526);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80527);entities.add(new Entity(null, null));

        __CLR4_1_101q3j1q3jluszwej0.R.inc(80528);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80529);Assert.assertEquals(1, result.size());
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80530);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101q3j1q3jluszwej0.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement() throws Exception {__CLR4_1_101q3j1q3jluszwej0.R.globalSliceStart(getClass().getName(),80531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kxs5ka1q4z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q3j1q3jluszwej0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q3j1q3jluszwej0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_match_two_segement",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80531,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kxs5ka1q4z() throws Exception{try{__CLR4_1_101q3j1q3jluszwej0.R.inc(80531);
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80532);JSONPath path = new JSONPath("$[?(@.name like 'ljw%83')]");

        __CLR4_1_101q3j1q3jluszwej0.R.inc(80533);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80534);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80535);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80536);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80537);entities.add(new Entity(null, null));

        __CLR4_1_101q3j1q3jluszwej0.R.inc(80538);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80539);Assert.assertEquals(1, result.size());
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80540);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101q3j1q3jluszwej0.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_2() throws Exception {__CLR4_1_101q3j1q3jluszwej0.R.globalSliceStart(getClass().getName(),80541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10clwq6v1q59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q3j1q3jluszwej0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q3j1q3jluszwej0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_match_two_segement_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80541,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10clwq6v1q59() throws Exception{try{__CLR4_1_101q3j1q3jluszwej0.R.inc(80541);
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80542);JSONPath path = new JSONPath("$[?(@.name like 'ljw%w2083')]");
        
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80543);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80544);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80545);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80546);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80547);entities.add(new Entity(null, null));
        
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80548);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80549);Assert.assertEquals(0, result.size());
    }finally{__CLR4_1_101q3j1q3jluszwej0.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_3() throws Exception {__CLR4_1_101q3j1q3jluszwej0.R.globalSliceStart(getClass().getName(),80550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109cwree1q5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q3j1q3jluszwej0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q3j1q3jluszwej0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_match_two_segement_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80550,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109cwree1q5i() throws Exception{try{__CLR4_1_101q3j1q3jluszwej0.R.inc(80550);
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80551);JSONPath path = new JSONPath("$[?(@.name like 'ljw%2%0%83')]");
        
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80552);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80553);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80554);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80555);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80556);entities.add(new Entity(null, null));
        
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80557);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80558);Assert.assertEquals(1, result.size());
        __CLR4_1_101q3j1q3jluszwej0.R.inc(80559);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101q3j1q3jluszwej0.R.flushNeeded();}}

    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_1_101q3j1q3jluszwej0.R.inc(80560);
            __CLR4_1_101q3j1q3jluszwej0.R.inc(80561);this.id = id;
            __CLR4_1_101q3j1q3jluszwej0.R.inc(80562);this.name = name;
        }finally{__CLR4_1_101q3j1q3jluszwej0.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_1_101q3j1q3jluszwej0.R.inc(80563);
            __CLR4_1_101q3j1q3jluszwej0.R.inc(80564);return id;
        }finally{__CLR4_1_101q3j1q3jluszwej0.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_1_101q3j1q3jluszwej0.R.inc(80565);
            __CLR4_1_101q3j1q3jluszwej0.R.inc(80566);this.id = id;
        }finally{__CLR4_1_101q3j1q3jluszwej0.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101q3j1q3jluszwej0.R.inc(80567);
            __CLR4_1_101q3j1q3jluszwej0.R.inc(80568);return name;
        }finally{__CLR4_1_101q3j1q3jluszwej0.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101q3j1q3jluszwej0.R.inc(80569);
            __CLR4_1_101q3j1q3jluszwej0.R.inc(80570);this.name = name;
        }finally{__CLR4_1_101q3j1q3jluszwej0.R.flushNeeded();}}

    }
}
