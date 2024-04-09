/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_like extends TestCase {static class __CLR4_5_21q381q38lusvnfmv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,80560,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_like_extract() throws Exception {__CLR4_5_21q381q38lusvnfmv.R.globalSliceStart(getClass().getName(),80468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29501zo1q38();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q381q38lusvnfmv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q381q38lusvnfmv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_extract",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80468,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29501zo1q38() throws Exception{try{__CLR4_5_21q381q38lusvnfmv.R.inc(80468);
        __CLR4_5_21q381q38lusvnfmv.R.inc(80469);JSONPath path = new JSONPath("$[?(@.name like 'ljw2083')]");

        __CLR4_5_21q381q38lusvnfmv.R.inc(80470);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21q381q38lusvnfmv.R.inc(80471);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80472);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80473);entities.add(new Entity(1003, null));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80474);entities.add(new Entity(null, null));

        __CLR4_5_21q381q38lusvnfmv.R.inc(80475);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21q381q38lusvnfmv.R.inc(80476);Assert.assertEquals(1, result.size());
        __CLR4_5_21q381q38lusvnfmv.R.inc(80477);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21q381q38lusvnfmv.R.flushNeeded();}}
    
    public void test_list_not_like_extract() throws Exception {__CLR4_5_21q381q38lusvnfmv.R.globalSliceStart(getClass().getName(),80478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bzg58g1q3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q381q38lusvnfmv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q381q38lusvnfmv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_not_like_extract",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80478,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bzg58g1q3i() throws Exception{try{__CLR4_5_21q381q38lusvnfmv.R.inc(80478);
        __CLR4_5_21q381q38lusvnfmv.R.inc(80479);JSONPath path = new JSONPath("$[?(@.name not like 'ljw2083')]");

        __CLR4_5_21q381q38lusvnfmv.R.inc(80480);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21q381q38lusvnfmv.R.inc(80481);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80482);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80483);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80484);entities.add(new Entity(null, null));

        __CLR4_5_21q381q38lusvnfmv.R.inc(80485);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21q381q38lusvnfmv.R.inc(80486);Assert.assertEquals(3, result.size());
        __CLR4_5_21q381q38lusvnfmv.R.inc(80487);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80488);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80489);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_5_21q381q38lusvnfmv.R.flushNeeded();}}
    
    public void test_list_like_left_match() throws Exception {__CLR4_5_21q381q38lusvnfmv.R.globalSliceStart(getClass().getName(),80490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nsd1s81q3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q381q38lusvnfmv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q381q38lusvnfmv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_left_match",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80490,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nsd1s81q3u() throws Exception{try{__CLR4_5_21q381q38lusvnfmv.R.inc(80490);
        __CLR4_5_21q381q38lusvnfmv.R.inc(80491);JSONPath path = new JSONPath("$[?(@.name like 'ljw%')]");

        __CLR4_5_21q381q38lusvnfmv.R.inc(80492);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21q381q38lusvnfmv.R.inc(80493);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80494);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80495);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80496);entities.add(new Entity(null, null));

        __CLR4_5_21q381q38lusvnfmv.R.inc(80497);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21q381q38lusvnfmv.R.inc(80498);Assert.assertEquals(1, result.size());
        __CLR4_5_21q381q38lusvnfmv.R.inc(80499);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21q381q38lusvnfmv.R.flushNeeded();}}
    
    public void test_list_like_right_match() throws Exception {__CLR4_5_21q381q38lusvnfmv.R.globalSliceStart(getClass().getName(),80500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hx3bmz1q44();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q381q38lusvnfmv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q381q38lusvnfmv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_right_match",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80500,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hx3bmz1q44() throws Exception{try{__CLR4_5_21q381q38lusvnfmv.R.inc(80500);
        __CLR4_5_21q381q38lusvnfmv.R.inc(80501);JSONPath path = new JSONPath("$[?(@.name like '%2083')]");

        __CLR4_5_21q381q38lusvnfmv.R.inc(80502);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21q381q38lusvnfmv.R.inc(80503);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80504);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80505);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80506);entities.add(new Entity(null, null));

        __CLR4_5_21q381q38lusvnfmv.R.inc(80507);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21q381q38lusvnfmv.R.inc(80508);Assert.assertEquals(1, result.size());
        __CLR4_5_21q381q38lusvnfmv.R.inc(80509);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21q381q38lusvnfmv.R.flushNeeded();}}
    
    public void test_list_like_contains() throws Exception {__CLR4_5_21q381q38lusvnfmv.R.globalSliceStart(getClass().getName(),80510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fwgg9y1q4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q381q38lusvnfmv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q381q38lusvnfmv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_contains",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80510,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fwgg9y1q4e() throws Exception{try{__CLR4_5_21q381q38lusvnfmv.R.inc(80510);
        __CLR4_5_21q381q38lusvnfmv.R.inc(80511);JSONPath path = new JSONPath("$[?(@.name like '%208%')]");

        __CLR4_5_21q381q38lusvnfmv.R.inc(80512);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21q381q38lusvnfmv.R.inc(80513);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80514);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80515);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80516);entities.add(new Entity(null, null));

        __CLR4_5_21q381q38lusvnfmv.R.inc(80517);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21q381q38lusvnfmv.R.inc(80518);Assert.assertEquals(1, result.size());
        __CLR4_5_21q381q38lusvnfmv.R.inc(80519);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21q381q38lusvnfmv.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement() throws Exception {__CLR4_5_21q381q38lusvnfmv.R.globalSliceStart(getClass().getName(),80520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kxs5ka1q4o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q381q38lusvnfmv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q381q38lusvnfmv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_match_two_segement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80520,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kxs5ka1q4o() throws Exception{try{__CLR4_5_21q381q38lusvnfmv.R.inc(80520);
        __CLR4_5_21q381q38lusvnfmv.R.inc(80521);JSONPath path = new JSONPath("$[?(@.name like 'ljw%83')]");

        __CLR4_5_21q381q38lusvnfmv.R.inc(80522);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21q381q38lusvnfmv.R.inc(80523);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80524);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80525);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80526);entities.add(new Entity(null, null));

        __CLR4_5_21q381q38lusvnfmv.R.inc(80527);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21q381q38lusvnfmv.R.inc(80528);Assert.assertEquals(1, result.size());
        __CLR4_5_21q381q38lusvnfmv.R.inc(80529);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21q381q38lusvnfmv.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_2() throws Exception {__CLR4_5_21q381q38lusvnfmv.R.globalSliceStart(getClass().getName(),80530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2clwq6v1q4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q381q38lusvnfmv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q381q38lusvnfmv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_match_two_segement_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80530,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2clwq6v1q4y() throws Exception{try{__CLR4_5_21q381q38lusvnfmv.R.inc(80530);
        __CLR4_5_21q381q38lusvnfmv.R.inc(80531);JSONPath path = new JSONPath("$[?(@.name like 'ljw%w2083')]");
        
        __CLR4_5_21q381q38lusvnfmv.R.inc(80532);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21q381q38lusvnfmv.R.inc(80533);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80534);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80535);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80536);entities.add(new Entity(null, null));
        
        __CLR4_5_21q381q38lusvnfmv.R.inc(80537);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21q381q38lusvnfmv.R.inc(80538);Assert.assertEquals(0, result.size());
    }finally{__CLR4_5_21q381q38lusvnfmv.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_3() throws Exception {__CLR4_5_21q381q38lusvnfmv.R.globalSliceStart(getClass().getName(),80539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29cwree1q57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q381q38lusvnfmv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q381q38lusvnfmv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_match_two_segement_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80539,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29cwree1q57() throws Exception{try{__CLR4_5_21q381q38lusvnfmv.R.inc(80539);
        __CLR4_5_21q381q38lusvnfmv.R.inc(80540);JSONPath path = new JSONPath("$[?(@.name like 'ljw%2%0%83')]");
        
        __CLR4_5_21q381q38lusvnfmv.R.inc(80541);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21q381q38lusvnfmv.R.inc(80542);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80543);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80544);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21q381q38lusvnfmv.R.inc(80545);entities.add(new Entity(null, null));
        
        __CLR4_5_21q381q38lusvnfmv.R.inc(80546);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21q381q38lusvnfmv.R.inc(80547);Assert.assertEquals(1, result.size());
        __CLR4_5_21q381q38lusvnfmv.R.inc(80548);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21q381q38lusvnfmv.R.flushNeeded();}}

    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_5_21q381q38lusvnfmv.R.inc(80549);
            __CLR4_5_21q381q38lusvnfmv.R.inc(80550);this.id = id;
            __CLR4_5_21q381q38lusvnfmv.R.inc(80551);this.name = name;
        }finally{__CLR4_5_21q381q38lusvnfmv.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_5_21q381q38lusvnfmv.R.inc(80552);
            __CLR4_5_21q381q38lusvnfmv.R.inc(80553);return id;
        }finally{__CLR4_5_21q381q38lusvnfmv.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_5_21q381q38lusvnfmv.R.inc(80554);
            __CLR4_5_21q381q38lusvnfmv.R.inc(80555);this.id = id;
        }finally{__CLR4_5_21q381q38lusvnfmv.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21q381q38lusvnfmv.R.inc(80556);
            __CLR4_5_21q381q38lusvnfmv.R.inc(80557);return name;
        }finally{__CLR4_5_21q381q38lusvnfmv.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21q381q38lusvnfmv.R.inc(80558);
            __CLR4_5_21q381q38lusvnfmv.R.inc(80559);this.name = name;
        }finally{__CLR4_5_21q381q38lusvnfmv.R.flushNeeded();}}

    }
}
