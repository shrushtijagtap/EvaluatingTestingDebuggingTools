/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_like extends TestCase {static class __CLR4_5_21p501p50lusyjul2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,79328,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_like_extract() throws Exception {__CLR4_5_21p501p50lusyjul2.R.globalSliceStart(getClass().getName(),79236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29501zo1p50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p501p50lusyjul2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p501p50lusyjul2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_extract",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79236,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29501zo1p50() throws Exception{try{__CLR4_5_21p501p50lusyjul2.R.inc(79236);
        __CLR4_5_21p501p50lusyjul2.R.inc(79237);JSONPath path = new JSONPath("$[?(@.name like 'ljw2083')]");

        __CLR4_5_21p501p50lusyjul2.R.inc(79238);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p501p50lusyjul2.R.inc(79239);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79240);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79241);entities.add(new Entity(1003, null));
        __CLR4_5_21p501p50lusyjul2.R.inc(79242);entities.add(new Entity(null, null));

        __CLR4_5_21p501p50lusyjul2.R.inc(79243);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p501p50lusyjul2.R.inc(79244);Assert.assertEquals(1, result.size());
        __CLR4_5_21p501p50lusyjul2.R.inc(79245);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21p501p50lusyjul2.R.flushNeeded();}}
    
    public void test_list_not_like_extract() throws Exception {__CLR4_5_21p501p50lusyjul2.R.globalSliceStart(getClass().getName(),79246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bzg58g1p5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p501p50lusyjul2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p501p50lusyjul2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_not_like_extract",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79246,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bzg58g1p5a() throws Exception{try{__CLR4_5_21p501p50lusyjul2.R.inc(79246);
        __CLR4_5_21p501p50lusyjul2.R.inc(79247);JSONPath path = new JSONPath("$[?(@.name not like 'ljw2083')]");

        __CLR4_5_21p501p50lusyjul2.R.inc(79248);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p501p50lusyjul2.R.inc(79249);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79250);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79251);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79252);entities.add(new Entity(null, null));

        __CLR4_5_21p501p50lusyjul2.R.inc(79253);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p501p50lusyjul2.R.inc(79254);Assert.assertEquals(3, result.size());
        __CLR4_5_21p501p50lusyjul2.R.inc(79255);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_5_21p501p50lusyjul2.R.inc(79256);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_5_21p501p50lusyjul2.R.inc(79257);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_5_21p501p50lusyjul2.R.flushNeeded();}}
    
    public void test_list_like_left_match() throws Exception {__CLR4_5_21p501p50lusyjul2.R.globalSliceStart(getClass().getName(),79258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nsd1s81p5m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p501p50lusyjul2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p501p50lusyjul2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_left_match",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79258,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nsd1s81p5m() throws Exception{try{__CLR4_5_21p501p50lusyjul2.R.inc(79258);
        __CLR4_5_21p501p50lusyjul2.R.inc(79259);JSONPath path = new JSONPath("$[?(@.name like 'ljw%')]");

        __CLR4_5_21p501p50lusyjul2.R.inc(79260);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p501p50lusyjul2.R.inc(79261);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79262);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79263);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79264);entities.add(new Entity(null, null));

        __CLR4_5_21p501p50lusyjul2.R.inc(79265);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p501p50lusyjul2.R.inc(79266);Assert.assertEquals(1, result.size());
        __CLR4_5_21p501p50lusyjul2.R.inc(79267);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21p501p50lusyjul2.R.flushNeeded();}}
    
    public void test_list_like_right_match() throws Exception {__CLR4_5_21p501p50lusyjul2.R.globalSliceStart(getClass().getName(),79268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hx3bmz1p5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p501p50lusyjul2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p501p50lusyjul2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_right_match",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79268,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hx3bmz1p5w() throws Exception{try{__CLR4_5_21p501p50lusyjul2.R.inc(79268);
        __CLR4_5_21p501p50lusyjul2.R.inc(79269);JSONPath path = new JSONPath("$[?(@.name like '%2083')]");

        __CLR4_5_21p501p50lusyjul2.R.inc(79270);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p501p50lusyjul2.R.inc(79271);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79272);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79273);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79274);entities.add(new Entity(null, null));

        __CLR4_5_21p501p50lusyjul2.R.inc(79275);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p501p50lusyjul2.R.inc(79276);Assert.assertEquals(1, result.size());
        __CLR4_5_21p501p50lusyjul2.R.inc(79277);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21p501p50lusyjul2.R.flushNeeded();}}
    
    public void test_list_like_contains() throws Exception {__CLR4_5_21p501p50lusyjul2.R.globalSliceStart(getClass().getName(),79278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fwgg9y1p66();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p501p50lusyjul2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p501p50lusyjul2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_contains",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79278,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fwgg9y1p66() throws Exception{try{__CLR4_5_21p501p50lusyjul2.R.inc(79278);
        __CLR4_5_21p501p50lusyjul2.R.inc(79279);JSONPath path = new JSONPath("$[?(@.name like '%208%')]");

        __CLR4_5_21p501p50lusyjul2.R.inc(79280);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p501p50lusyjul2.R.inc(79281);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79282);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79283);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79284);entities.add(new Entity(null, null));

        __CLR4_5_21p501p50lusyjul2.R.inc(79285);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p501p50lusyjul2.R.inc(79286);Assert.assertEquals(1, result.size());
        __CLR4_5_21p501p50lusyjul2.R.inc(79287);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21p501p50lusyjul2.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement() throws Exception {__CLR4_5_21p501p50lusyjul2.R.globalSliceStart(getClass().getName(),79288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kxs5ka1p6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p501p50lusyjul2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p501p50lusyjul2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_match_two_segement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79288,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kxs5ka1p6g() throws Exception{try{__CLR4_5_21p501p50lusyjul2.R.inc(79288);
        __CLR4_5_21p501p50lusyjul2.R.inc(79289);JSONPath path = new JSONPath("$[?(@.name like 'ljw%83')]");

        __CLR4_5_21p501p50lusyjul2.R.inc(79290);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p501p50lusyjul2.R.inc(79291);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79292);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79293);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79294);entities.add(new Entity(null, null));

        __CLR4_5_21p501p50lusyjul2.R.inc(79295);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p501p50lusyjul2.R.inc(79296);Assert.assertEquals(1, result.size());
        __CLR4_5_21p501p50lusyjul2.R.inc(79297);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21p501p50lusyjul2.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_2() throws Exception {__CLR4_5_21p501p50lusyjul2.R.globalSliceStart(getClass().getName(),79298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2clwq6v1p6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p501p50lusyjul2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p501p50lusyjul2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_match_two_segement_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79298,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2clwq6v1p6q() throws Exception{try{__CLR4_5_21p501p50lusyjul2.R.inc(79298);
        __CLR4_5_21p501p50lusyjul2.R.inc(79299);JSONPath path = new JSONPath("$[?(@.name like 'ljw%w2083')]");
        
        __CLR4_5_21p501p50lusyjul2.R.inc(79300);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p501p50lusyjul2.R.inc(79301);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79302);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79303);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79304);entities.add(new Entity(null, null));
        
        __CLR4_5_21p501p50lusyjul2.R.inc(79305);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p501p50lusyjul2.R.inc(79306);Assert.assertEquals(0, result.size());
    }finally{__CLR4_5_21p501p50lusyjul2.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_3() throws Exception {__CLR4_5_21p501p50lusyjul2.R.globalSliceStart(getClass().getName(),79307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29cwree1p6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p501p50lusyjul2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p501p50lusyjul2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_match_two_segement_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79307,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29cwree1p6z() throws Exception{try{__CLR4_5_21p501p50lusyjul2.R.inc(79307);
        __CLR4_5_21p501p50lusyjul2.R.inc(79308);JSONPath path = new JSONPath("$[?(@.name like 'ljw%2%0%83')]");
        
        __CLR4_5_21p501p50lusyjul2.R.inc(79309);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p501p50lusyjul2.R.inc(79310);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79311);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79312);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p501p50lusyjul2.R.inc(79313);entities.add(new Entity(null, null));
        
        __CLR4_5_21p501p50lusyjul2.R.inc(79314);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p501p50lusyjul2.R.inc(79315);Assert.assertEquals(1, result.size());
        __CLR4_5_21p501p50lusyjul2.R.inc(79316);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21p501p50lusyjul2.R.flushNeeded();}}

    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_5_21p501p50lusyjul2.R.inc(79317);
            __CLR4_5_21p501p50lusyjul2.R.inc(79318);this.id = id;
            __CLR4_5_21p501p50lusyjul2.R.inc(79319);this.name = name;
        }finally{__CLR4_5_21p501p50lusyjul2.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_5_21p501p50lusyjul2.R.inc(79320);
            __CLR4_5_21p501p50lusyjul2.R.inc(79321);return id;
        }finally{__CLR4_5_21p501p50lusyjul2.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_5_21p501p50lusyjul2.R.inc(79322);
            __CLR4_5_21p501p50lusyjul2.R.inc(79323);this.id = id;
        }finally{__CLR4_5_21p501p50lusyjul2.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21p501p50lusyjul2.R.inc(79324);
            __CLR4_5_21p501p50lusyjul2.R.inc(79325);return name;
        }finally{__CLR4_5_21p501p50lusyjul2.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21p501p50lusyjul2.R.inc(79326);
            __CLR4_5_21p501p50lusyjul2.R.inc(79327);this.name = name;
        }finally{__CLR4_5_21p501p50lusyjul2.R.flushNeeded();}}

    }
}
