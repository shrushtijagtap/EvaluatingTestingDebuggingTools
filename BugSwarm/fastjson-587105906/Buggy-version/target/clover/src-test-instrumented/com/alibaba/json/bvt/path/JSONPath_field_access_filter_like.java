/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_like extends TestCase {static class __CLR4_1_101p5b1p5blusqkilw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,79339,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_like_extract() throws Exception {__CLR4_1_101p5b1p5blusqkilw.R.globalSliceStart(getClass().getName(),79247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109501zo1p5b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101p5b1p5blusqkilw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101p5b1p5blusqkilw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_extract",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79247,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109501zo1p5b() throws Exception{try{__CLR4_1_101p5b1p5blusqkilw.R.inc(79247);
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79248);JSONPath path = new JSONPath("$[?(@.name like 'ljw2083')]");

        __CLR4_1_101p5b1p5blusqkilw.R.inc(79249);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79250);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79251);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79252);entities.add(new Entity(1003, null));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79253);entities.add(new Entity(null, null));

        __CLR4_1_101p5b1p5blusqkilw.R.inc(79254);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79255);Assert.assertEquals(1, result.size());
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79256);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101p5b1p5blusqkilw.R.flushNeeded();}}
    
    public void test_list_not_like_extract() throws Exception {__CLR4_1_101p5b1p5blusqkilw.R.globalSliceStart(getClass().getName(),79257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bzg58g1p5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101p5b1p5blusqkilw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101p5b1p5blusqkilw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_not_like_extract",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79257,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bzg58g1p5l() throws Exception{try{__CLR4_1_101p5b1p5blusqkilw.R.inc(79257);
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79258);JSONPath path = new JSONPath("$[?(@.name not like 'ljw2083')]");

        __CLR4_1_101p5b1p5blusqkilw.R.inc(79259);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79260);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79261);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79262);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79263);entities.add(new Entity(null, null));

        __CLR4_1_101p5b1p5blusqkilw.R.inc(79264);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79265);Assert.assertEquals(3, result.size());
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79266);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79267);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79268);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_1_101p5b1p5blusqkilw.R.flushNeeded();}}
    
    public void test_list_like_left_match() throws Exception {__CLR4_1_101p5b1p5blusqkilw.R.globalSliceStart(getClass().getName(),79269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nsd1s81p5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101p5b1p5blusqkilw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101p5b1p5blusqkilw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_left_match",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79269,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nsd1s81p5x() throws Exception{try{__CLR4_1_101p5b1p5blusqkilw.R.inc(79269);
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79270);JSONPath path = new JSONPath("$[?(@.name like 'ljw%')]");

        __CLR4_1_101p5b1p5blusqkilw.R.inc(79271);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79272);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79273);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79274);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79275);entities.add(new Entity(null, null));

        __CLR4_1_101p5b1p5blusqkilw.R.inc(79276);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79277);Assert.assertEquals(1, result.size());
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79278);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101p5b1p5blusqkilw.R.flushNeeded();}}
    
    public void test_list_like_right_match() throws Exception {__CLR4_1_101p5b1p5blusqkilw.R.globalSliceStart(getClass().getName(),79279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hx3bmz1p67();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101p5b1p5blusqkilw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101p5b1p5blusqkilw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_right_match",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79279,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hx3bmz1p67() throws Exception{try{__CLR4_1_101p5b1p5blusqkilw.R.inc(79279);
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79280);JSONPath path = new JSONPath("$[?(@.name like '%2083')]");

        __CLR4_1_101p5b1p5blusqkilw.R.inc(79281);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79282);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79283);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79284);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79285);entities.add(new Entity(null, null));

        __CLR4_1_101p5b1p5blusqkilw.R.inc(79286);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79287);Assert.assertEquals(1, result.size());
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79288);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101p5b1p5blusqkilw.R.flushNeeded();}}
    
    public void test_list_like_contains() throws Exception {__CLR4_1_101p5b1p5blusqkilw.R.globalSliceStart(getClass().getName(),79289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fwgg9y1p6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101p5b1p5blusqkilw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101p5b1p5blusqkilw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_contains",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79289,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fwgg9y1p6h() throws Exception{try{__CLR4_1_101p5b1p5blusqkilw.R.inc(79289);
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79290);JSONPath path = new JSONPath("$[?(@.name like '%208%')]");

        __CLR4_1_101p5b1p5blusqkilw.R.inc(79291);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79292);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79293);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79294);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79295);entities.add(new Entity(null, null));

        __CLR4_1_101p5b1p5blusqkilw.R.inc(79296);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79297);Assert.assertEquals(1, result.size());
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79298);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101p5b1p5blusqkilw.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement() throws Exception {__CLR4_1_101p5b1p5blusqkilw.R.globalSliceStart(getClass().getName(),79299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kxs5ka1p6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101p5b1p5blusqkilw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101p5b1p5blusqkilw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_match_two_segement",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79299,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kxs5ka1p6r() throws Exception{try{__CLR4_1_101p5b1p5blusqkilw.R.inc(79299);
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79300);JSONPath path = new JSONPath("$[?(@.name like 'ljw%83')]");

        __CLR4_1_101p5b1p5blusqkilw.R.inc(79301);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79302);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79303);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79304);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79305);entities.add(new Entity(null, null));

        __CLR4_1_101p5b1p5blusqkilw.R.inc(79306);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79307);Assert.assertEquals(1, result.size());
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79308);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101p5b1p5blusqkilw.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_2() throws Exception {__CLR4_1_101p5b1p5blusqkilw.R.globalSliceStart(getClass().getName(),79309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10clwq6v1p71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101p5b1p5blusqkilw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101p5b1p5blusqkilw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_match_two_segement_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79309,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10clwq6v1p71() throws Exception{try{__CLR4_1_101p5b1p5blusqkilw.R.inc(79309);
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79310);JSONPath path = new JSONPath("$[?(@.name like 'ljw%w2083')]");
        
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79311);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79312);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79313);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79314);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79315);entities.add(new Entity(null, null));
        
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79316);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79317);Assert.assertEquals(0, result.size());
    }finally{__CLR4_1_101p5b1p5blusqkilw.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_3() throws Exception {__CLR4_1_101p5b1p5blusqkilw.R.globalSliceStart(getClass().getName(),79318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109cwree1p7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101p5b1p5blusqkilw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101p5b1p5blusqkilw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like.test_list_like_match_two_segement_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79318,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109cwree1p7a() throws Exception{try{__CLR4_1_101p5b1p5blusqkilw.R.inc(79318);
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79319);JSONPath path = new JSONPath("$[?(@.name like 'ljw%2%0%83')]");
        
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79320);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79321);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79322);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79323);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79324);entities.add(new Entity(null, null));
        
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79325);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79326);Assert.assertEquals(1, result.size());
        __CLR4_1_101p5b1p5blusqkilw.R.inc(79327);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101p5b1p5blusqkilw.R.flushNeeded();}}

    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_1_101p5b1p5blusqkilw.R.inc(79328);
            __CLR4_1_101p5b1p5blusqkilw.R.inc(79329);this.id = id;
            __CLR4_1_101p5b1p5blusqkilw.R.inc(79330);this.name = name;
        }finally{__CLR4_1_101p5b1p5blusqkilw.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_1_101p5b1p5blusqkilw.R.inc(79331);
            __CLR4_1_101p5b1p5blusqkilw.R.inc(79332);return id;
        }finally{__CLR4_1_101p5b1p5blusqkilw.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_1_101p5b1p5blusqkilw.R.inc(79333);
            __CLR4_1_101p5b1p5blusqkilw.R.inc(79334);this.id = id;
        }finally{__CLR4_1_101p5b1p5blusqkilw.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101p5b1p5blusqkilw.R.inc(79335);
            __CLR4_1_101p5b1p5blusqkilw.R.inc(79336);return name;
        }finally{__CLR4_1_101p5b1p5blusqkilw.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101p5b1p5blusqkilw.R.inc(79337);
            __CLR4_1_101p5b1p5blusqkilw.R.inc(79338);this.name = name;
        }finally{__CLR4_1_101p5b1p5blusqkilw.R.flushNeeded();}}

    }
}
