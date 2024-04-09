/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_like_simple extends TestCase {static class __CLR4_5_21q5s1q5slusvnfnk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,80719,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_like_extract() throws Exception {__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceStart(getClass().getName(),80560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29501zo1q5s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q5s1q5slusvnfnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_extract",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80560,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29501zo1q5s() throws Exception{try{__CLR4_5_21q5s1q5slusvnfnk.R.inc(80560);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80561);JSONPath path = new JSONPath("$[name like 'ljw2083']");

        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80562);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80563);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80564);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80565);entities.add(new Entity(1003, null));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80566);entities.add(new Entity(null, null));

        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80567);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80568);Assert.assertEquals(1, result.size());
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80569);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21q5s1q5slusvnfnk.R.flushNeeded();}}
    
    public void test_list_not_like_extract() throws Exception {__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceStart(getClass().getName(),80570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bzg58g1q62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q5s1q5slusvnfnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_not_like_extract",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80570,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bzg58g1q62() throws Exception{try{__CLR4_5_21q5s1q5slusvnfnk.R.inc(80570);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80571);JSONPath path = new JSONPath("$[name not like 'ljw2083']");

        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80572);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80573);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80574);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80575);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80576);entities.add(new Entity(null, null));

        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80577);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80578);Assert.assertEquals(3, result.size());
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80579);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80580);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80581);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_5_21q5s1q5slusvnfnk.R.flushNeeded();}}
    
    public void test_list_like_left_match() throws Exception {__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceStart(getClass().getName(),80582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nsd1s81q6e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q5s1q5slusvnfnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_left_match",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80582,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nsd1s81q6e() throws Exception{try{__CLR4_5_21q5s1q5slusvnfnk.R.inc(80582);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80583);JSONPath path = new JSONPath("$[name like 'ljw%']");

        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80584);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80585);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80586);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80587);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80588);entities.add(new Entity(null, null));

        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80589);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80590);Assert.assertEquals(1, result.size());
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80591);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21q5s1q5slusvnfnk.R.flushNeeded();}}
    
    public void test_list_like_left_not_match() throws Exception {__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceStart(getClass().getName(),80592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f5d2g41q6o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q5s1q5slusvnfnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_left_not_match",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80592,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f5d2g41q6o() throws Exception{try{__CLR4_5_21q5s1q5slusvnfnk.R.inc(80592);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80593);JSONPath path = new JSONPath("$[name not like 'ljw%']");

        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80594);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80595);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80596);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80597);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80598);entities.add(new Entity(null, null));

        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80599);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80600);Assert.assertEquals(2, result.size());
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80601);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80602);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_5_21q5s1q5slusvnfnk.R.flushNeeded();}}
    
    public void test_list_like_right_match() throws Exception {__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceStart(getClass().getName(),80603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hx3bmz1q6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q5s1q5slusvnfnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_right_match",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80603,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hx3bmz1q6z() throws Exception{try{__CLR4_5_21q5s1q5slusvnfnk.R.inc(80603);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80604);JSONPath path = new JSONPath("$[name like '%2083']");

        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80605);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80606);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80607);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80608);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80609);entities.add(new Entity(null, null));

        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80610);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80611);Assert.assertEquals(1, result.size());
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80612);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21q5s1q5slusvnfnk.R.flushNeeded();}}
    
    public void test_list_like_right_not_match() throws Exception {__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceStart(getClass().getName(),80613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fwsh7b1q79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q5s1q5slusvnfnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_right_not_match",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80613,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fwsh7b1q79() throws Exception{try{__CLR4_5_21q5s1q5slusvnfnk.R.inc(80613);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80614);JSONPath path = new JSONPath("$[name not like '%2083']");
        
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80615);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80616);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80617);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80618);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80619);entities.add(new Entity(null, null));
        
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80620);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80621);Assert.assertEquals(2, result.size());
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80622);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80623);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_5_21q5s1q5slusvnfnk.R.flushNeeded();}}
    
    public void test_list_like_contains() throws Exception {__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceStart(getClass().getName(),80624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fwgg9y1q7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q5s1q5slusvnfnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_contains",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80624,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fwgg9y1q7k() throws Exception{try{__CLR4_5_21q5s1q5slusvnfnk.R.inc(80624);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80625);JSONPath path = new JSONPath("$[name like '%208%']");

        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80626);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80627);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80628);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80629);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80630);entities.add(new Entity(null, null));

        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80631);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80632);Assert.assertEquals(1, result.size());
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80633);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21q5s1q5slusvnfnk.R.flushNeeded();}}
    
    public void test_list_like_not_contains() throws Exception {__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceStart(getClass().getName(),80634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2btzrba1q7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q5s1q5slusvnfnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_not_contains",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80634,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2btzrba1q7u() throws Exception{try{__CLR4_5_21q5s1q5slusvnfnk.R.inc(80634);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80635);JSONPath path = new JSONPath("$[name not like '%208%']");
        
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80636);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80637);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80638);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80639);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80640);entities.add(new Entity(null, null));
        
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80641);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80642);Assert.assertEquals(2, result.size());
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80643);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80644);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_5_21q5s1q5slusvnfnk.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement() throws Exception {__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceStart(getClass().getName(),80645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kxs5ka1q85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q5s1q5slusvnfnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_match_two_segement",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80645,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kxs5ka1q85() throws Exception{try{__CLR4_5_21q5s1q5slusvnfnk.R.inc(80645);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80646);JSONPath path = new JSONPath("$[name like 'ljw%83']");

        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80647);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80648);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80649);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80650);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80651);entities.add(new Entity(null, null));

        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80652);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80653);Assert.assertEquals(1, result.size());
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80654);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21q5s1q5slusvnfnk.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_not() throws Exception {__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceStart(getClass().getName(),80655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uj0uzu1q8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q5s1q5slusvnfnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_match_two_segement_not",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80655,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uj0uzu1q8f() throws Exception{try{__CLR4_5_21q5s1q5slusvnfnk.R.inc(80655);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80656);JSONPath path = new JSONPath("$[name not like 'ljw%83']");
        
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80657);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80658);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80659);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80660);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80661);entities.add(new Entity(null, null));
        
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80662);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80663);Assert.assertEquals(2, result.size());
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80664);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80665);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_5_21q5s1q5slusvnfnk.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_2() throws Exception {__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceStart(getClass().getName(),80666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2clwq6v1q8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q5s1q5slusvnfnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_match_two_segement_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80666,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2clwq6v1q8q() throws Exception{try{__CLR4_5_21q5s1q5slusvnfnk.R.inc(80666);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80667);JSONPath path = new JSONPath("$[name like 'ljw%w2083']");
        
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80668);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80669);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80670);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80671);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80672);entities.add(new Entity(null, null));
        
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80673);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80674);Assert.assertEquals(0, result.size());
    }finally{__CLR4_5_21q5s1q5slusvnfnk.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_2_not() throws Exception {__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceStart(getClass().getName(),80675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_291xlab1q8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q5s1q5slusvnfnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_match_two_segement_2_not",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80675,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_291xlab1q8z() throws Exception{try{__CLR4_5_21q5s1q5slusvnfnk.R.inc(80675);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80676);JSONPath path = new JSONPath("$[name not like 'ljw%w2083']");
        
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80677);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80678);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80679);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80680);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80681);entities.add(new Entity(null, null));
        
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80682);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80683);Assert.assertEquals(3, result.size());
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80684);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80685);Assert.assertSame(entities.get(1), result.get(1));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80686);Assert.assertSame(entities.get(2), result.get(2));
    }finally{__CLR4_5_21q5s1q5slusvnfnk.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_3() throws Exception {__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceStart(getClass().getName(),80687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29cwree1q9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q5s1q5slusvnfnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_match_two_segement_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80687,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29cwree1q9b() throws Exception{try{__CLR4_5_21q5s1q5slusvnfnk.R.inc(80687);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80688);JSONPath path = new JSONPath("$[name like 'ljw%2%0%83']");
        
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80689);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80690);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80691);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80692);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80693);entities.add(new Entity(null, null));
        
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80694);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80695);Assert.assertEquals(1, result.size());
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80696);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21q5s1q5slusvnfnk.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_3_not() throws Exception {__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceStart(getClass().getName(),80697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oxpr61q9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q5s1q5slusvnfnk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q5s1q5slusvnfnk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_match_two_segement_3_not",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80697,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oxpr61q9l() throws Exception{try{__CLR4_5_21q5s1q5slusvnfnk.R.inc(80697);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80698);JSONPath path = new JSONPath("$[name not like 'ljw%2%0%83']");
        
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80699);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80700);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80701);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80702);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80703);entities.add(new Entity(null, null));
        
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80704);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80705);Assert.assertEquals(2, result.size());
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80706);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_5_21q5s1q5slusvnfnk.R.inc(80707);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_5_21q5s1q5slusvnfnk.R.flushNeeded();}}

    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_5_21q5s1q5slusvnfnk.R.inc(80708);
            __CLR4_5_21q5s1q5slusvnfnk.R.inc(80709);this.id = id;
            __CLR4_5_21q5s1q5slusvnfnk.R.inc(80710);this.name = name;
        }finally{__CLR4_5_21q5s1q5slusvnfnk.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_5_21q5s1q5slusvnfnk.R.inc(80711);
            __CLR4_5_21q5s1q5slusvnfnk.R.inc(80712);return id;
        }finally{__CLR4_5_21q5s1q5slusvnfnk.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_5_21q5s1q5slusvnfnk.R.inc(80713);
            __CLR4_5_21q5s1q5slusvnfnk.R.inc(80714);this.id = id;
        }finally{__CLR4_5_21q5s1q5slusvnfnk.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21q5s1q5slusvnfnk.R.inc(80715);
            __CLR4_5_21q5s1q5slusvnfnk.R.inc(80716);return name;
        }finally{__CLR4_5_21q5s1q5slusvnfnk.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21q5s1q5slusvnfnk.R.inc(80717);
            __CLR4_5_21q5s1q5slusvnfnk.R.inc(80718);this.name = name;
        }finally{__CLR4_5_21q5s1q5slusvnfnk.R.flushNeeded();}}

    }
}
