/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_like_simple extends TestCase {static class __CLR4_5_21p7k1p7klusyjuli{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,79487,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_like_extract() throws Exception {__CLR4_5_21p7k1p7klusyjuli.R.globalSliceStart(getClass().getName(),79328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29501zo1p7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p7k1p7klusyjuli.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p7k1p7klusyjuli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_extract",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79328,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29501zo1p7k() throws Exception{try{__CLR4_5_21p7k1p7klusyjuli.R.inc(79328);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79329);JSONPath path = new JSONPath("$[name like 'ljw2083']");

        __CLR4_5_21p7k1p7klusyjuli.R.inc(79330);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79331);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79332);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79333);entities.add(new Entity(1003, null));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79334);entities.add(new Entity(null, null));

        __CLR4_5_21p7k1p7klusyjuli.R.inc(79335);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79336);Assert.assertEquals(1, result.size());
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79337);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21p7k1p7klusyjuli.R.flushNeeded();}}
    
    public void test_list_not_like_extract() throws Exception {__CLR4_5_21p7k1p7klusyjuli.R.globalSliceStart(getClass().getName(),79338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bzg58g1p7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p7k1p7klusyjuli.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p7k1p7klusyjuli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_not_like_extract",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79338,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bzg58g1p7u() throws Exception{try{__CLR4_5_21p7k1p7klusyjuli.R.inc(79338);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79339);JSONPath path = new JSONPath("$[name not like 'ljw2083']");

        __CLR4_5_21p7k1p7klusyjuli.R.inc(79340);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79341);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79342);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79343);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79344);entities.add(new Entity(null, null));

        __CLR4_5_21p7k1p7klusyjuli.R.inc(79345);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79346);Assert.assertEquals(3, result.size());
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79347);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79348);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79349);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_5_21p7k1p7klusyjuli.R.flushNeeded();}}
    
    public void test_list_like_left_match() throws Exception {__CLR4_5_21p7k1p7klusyjuli.R.globalSliceStart(getClass().getName(),79350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nsd1s81p86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p7k1p7klusyjuli.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p7k1p7klusyjuli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_left_match",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79350,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nsd1s81p86() throws Exception{try{__CLR4_5_21p7k1p7klusyjuli.R.inc(79350);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79351);JSONPath path = new JSONPath("$[name like 'ljw%']");

        __CLR4_5_21p7k1p7klusyjuli.R.inc(79352);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79353);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79354);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79355);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79356);entities.add(new Entity(null, null));

        __CLR4_5_21p7k1p7klusyjuli.R.inc(79357);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79358);Assert.assertEquals(1, result.size());
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79359);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21p7k1p7klusyjuli.R.flushNeeded();}}
    
    public void test_list_like_left_not_match() throws Exception {__CLR4_5_21p7k1p7klusyjuli.R.globalSliceStart(getClass().getName(),79360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f5d2g41p8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p7k1p7klusyjuli.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p7k1p7klusyjuli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_left_not_match",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79360,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f5d2g41p8g() throws Exception{try{__CLR4_5_21p7k1p7klusyjuli.R.inc(79360);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79361);JSONPath path = new JSONPath("$[name not like 'ljw%']");

        __CLR4_5_21p7k1p7klusyjuli.R.inc(79362);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79363);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79364);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79365);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79366);entities.add(new Entity(null, null));

        __CLR4_5_21p7k1p7klusyjuli.R.inc(79367);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79368);Assert.assertEquals(2, result.size());
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79369);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79370);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_5_21p7k1p7klusyjuli.R.flushNeeded();}}
    
    public void test_list_like_right_match() throws Exception {__CLR4_5_21p7k1p7klusyjuli.R.globalSliceStart(getClass().getName(),79371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hx3bmz1p8r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p7k1p7klusyjuli.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p7k1p7klusyjuli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_right_match",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79371,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hx3bmz1p8r() throws Exception{try{__CLR4_5_21p7k1p7klusyjuli.R.inc(79371);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79372);JSONPath path = new JSONPath("$[name like '%2083']");

        __CLR4_5_21p7k1p7klusyjuli.R.inc(79373);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79374);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79375);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79376);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79377);entities.add(new Entity(null, null));

        __CLR4_5_21p7k1p7klusyjuli.R.inc(79378);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79379);Assert.assertEquals(1, result.size());
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79380);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21p7k1p7klusyjuli.R.flushNeeded();}}
    
    public void test_list_like_right_not_match() throws Exception {__CLR4_5_21p7k1p7klusyjuli.R.globalSliceStart(getClass().getName(),79381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fwsh7b1p91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p7k1p7klusyjuli.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p7k1p7klusyjuli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_right_not_match",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79381,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fwsh7b1p91() throws Exception{try{__CLR4_5_21p7k1p7klusyjuli.R.inc(79381);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79382);JSONPath path = new JSONPath("$[name not like '%2083']");
        
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79383);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79384);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79385);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79386);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79387);entities.add(new Entity(null, null));
        
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79388);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79389);Assert.assertEquals(2, result.size());
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79390);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79391);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_5_21p7k1p7klusyjuli.R.flushNeeded();}}
    
    public void test_list_like_contains() throws Exception {__CLR4_5_21p7k1p7klusyjuli.R.globalSliceStart(getClass().getName(),79392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fwgg9y1p9c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p7k1p7klusyjuli.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p7k1p7klusyjuli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_contains",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79392,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fwgg9y1p9c() throws Exception{try{__CLR4_5_21p7k1p7klusyjuli.R.inc(79392);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79393);JSONPath path = new JSONPath("$[name like '%208%']");

        __CLR4_5_21p7k1p7klusyjuli.R.inc(79394);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79395);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79396);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79397);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79398);entities.add(new Entity(null, null));

        __CLR4_5_21p7k1p7klusyjuli.R.inc(79399);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79400);Assert.assertEquals(1, result.size());
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79401);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21p7k1p7klusyjuli.R.flushNeeded();}}
    
    public void test_list_like_not_contains() throws Exception {__CLR4_5_21p7k1p7klusyjuli.R.globalSliceStart(getClass().getName(),79402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2btzrba1p9m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p7k1p7klusyjuli.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p7k1p7klusyjuli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_not_contains",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79402,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2btzrba1p9m() throws Exception{try{__CLR4_5_21p7k1p7klusyjuli.R.inc(79402);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79403);JSONPath path = new JSONPath("$[name not like '%208%']");
        
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79404);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79405);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79406);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79407);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79408);entities.add(new Entity(null, null));
        
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79409);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79410);Assert.assertEquals(2, result.size());
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79411);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79412);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_5_21p7k1p7klusyjuli.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement() throws Exception {__CLR4_5_21p7k1p7klusyjuli.R.globalSliceStart(getClass().getName(),79413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kxs5ka1p9x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p7k1p7klusyjuli.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p7k1p7klusyjuli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_match_two_segement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79413,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kxs5ka1p9x() throws Exception{try{__CLR4_5_21p7k1p7klusyjuli.R.inc(79413);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79414);JSONPath path = new JSONPath("$[name like 'ljw%83']");

        __CLR4_5_21p7k1p7klusyjuli.R.inc(79415);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79416);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79417);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79418);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79419);entities.add(new Entity(null, null));

        __CLR4_5_21p7k1p7klusyjuli.R.inc(79420);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79421);Assert.assertEquals(1, result.size());
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79422);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21p7k1p7klusyjuli.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_not() throws Exception {__CLR4_5_21p7k1p7klusyjuli.R.globalSliceStart(getClass().getName(),79423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uj0uzu1pa7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p7k1p7klusyjuli.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p7k1p7klusyjuli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_match_two_segement_not",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79423,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uj0uzu1pa7() throws Exception{try{__CLR4_5_21p7k1p7klusyjuli.R.inc(79423);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79424);JSONPath path = new JSONPath("$[name not like 'ljw%83']");
        
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79425);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79426);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79427);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79428);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79429);entities.add(new Entity(null, null));
        
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79430);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79431);Assert.assertEquals(2, result.size());
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79432);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79433);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_5_21p7k1p7klusyjuli.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_2() throws Exception {__CLR4_5_21p7k1p7klusyjuli.R.globalSliceStart(getClass().getName(),79434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2clwq6v1pai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p7k1p7klusyjuli.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p7k1p7klusyjuli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_match_two_segement_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79434,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2clwq6v1pai() throws Exception{try{__CLR4_5_21p7k1p7klusyjuli.R.inc(79434);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79435);JSONPath path = new JSONPath("$[name like 'ljw%w2083']");
        
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79436);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79437);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79438);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79439);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79440);entities.add(new Entity(null, null));
        
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79441);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79442);Assert.assertEquals(0, result.size());
    }finally{__CLR4_5_21p7k1p7klusyjuli.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_2_not() throws Exception {__CLR4_5_21p7k1p7klusyjuli.R.globalSliceStart(getClass().getName(),79443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_291xlab1par();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p7k1p7klusyjuli.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p7k1p7klusyjuli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_match_two_segement_2_not",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79443,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_291xlab1par() throws Exception{try{__CLR4_5_21p7k1p7klusyjuli.R.inc(79443);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79444);JSONPath path = new JSONPath("$[name not like 'ljw%w2083']");
        
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79445);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79446);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79447);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79448);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79449);entities.add(new Entity(null, null));
        
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79450);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79451);Assert.assertEquals(3, result.size());
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79452);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79453);Assert.assertSame(entities.get(1), result.get(1));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79454);Assert.assertSame(entities.get(2), result.get(2));
    }finally{__CLR4_5_21p7k1p7klusyjuli.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_3() throws Exception {__CLR4_5_21p7k1p7klusyjuli.R.globalSliceStart(getClass().getName(),79455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29cwree1pb3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p7k1p7klusyjuli.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p7k1p7klusyjuli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_match_two_segement_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79455,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29cwree1pb3() throws Exception{try{__CLR4_5_21p7k1p7klusyjuli.R.inc(79455);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79456);JSONPath path = new JSONPath("$[name like 'ljw%2%0%83']");
        
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79457);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79458);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79459);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79460);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79461);entities.add(new Entity(null, null));
        
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79462);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79463);Assert.assertEquals(1, result.size());
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79464);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21p7k1p7klusyjuli.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_3_not() throws Exception {__CLR4_5_21p7k1p7klusyjuli.R.globalSliceStart(getClass().getName(),79465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oxpr61pbd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p7k1p7klusyjuli.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p7k1p7klusyjuli.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_match_two_segement_3_not",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79465,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oxpr61pbd() throws Exception{try{__CLR4_5_21p7k1p7klusyjuli.R.inc(79465);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79466);JSONPath path = new JSONPath("$[name not like 'ljw%2%0%83']");
        
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79467);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79468);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79469);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79470);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79471);entities.add(new Entity(null, null));
        
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79472);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79473);Assert.assertEquals(2, result.size());
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79474);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_5_21p7k1p7klusyjuli.R.inc(79475);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_5_21p7k1p7klusyjuli.R.flushNeeded();}}

    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_5_21p7k1p7klusyjuli.R.inc(79476);
            __CLR4_5_21p7k1p7klusyjuli.R.inc(79477);this.id = id;
            __CLR4_5_21p7k1p7klusyjuli.R.inc(79478);this.name = name;
        }finally{__CLR4_5_21p7k1p7klusyjuli.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_5_21p7k1p7klusyjuli.R.inc(79479);
            __CLR4_5_21p7k1p7klusyjuli.R.inc(79480);return id;
        }finally{__CLR4_5_21p7k1p7klusyjuli.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_5_21p7k1p7klusyjuli.R.inc(79481);
            __CLR4_5_21p7k1p7klusyjuli.R.inc(79482);this.id = id;
        }finally{__CLR4_5_21p7k1p7klusyjuli.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21p7k1p7klusyjuli.R.inc(79483);
            __CLR4_5_21p7k1p7klusyjuli.R.inc(79484);return name;
        }finally{__CLR4_5_21p7k1p7klusyjuli.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21p7k1p7klusyjuli.R.inc(79485);
            __CLR4_5_21p7k1p7klusyjuli.R.inc(79486);this.name = name;
        }finally{__CLR4_5_21p7k1p7klusyjuli.R.flushNeeded();}}

    }
}
