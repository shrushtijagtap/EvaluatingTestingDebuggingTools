/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_like_simple extends TestCase {static class __CLR4_1_101q631q63luszwejr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,80730,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_like_extract() throws Exception {__CLR4_1_101q631q63luszwejr.R.globalSliceStart(getClass().getName(),80571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109501zo1q63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q631q63luszwejr.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q631q63luszwejr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_extract",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80571,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109501zo1q63() throws Exception{try{__CLR4_1_101q631q63luszwejr.R.inc(80571);
        __CLR4_1_101q631q63luszwejr.R.inc(80572);JSONPath path = new JSONPath("$[name like 'ljw2083']");

        __CLR4_1_101q631q63luszwejr.R.inc(80573);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q631q63luszwejr.R.inc(80574);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q631q63luszwejr.R.inc(80575);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q631q63luszwejr.R.inc(80576);entities.add(new Entity(1003, null));
        __CLR4_1_101q631q63luszwejr.R.inc(80577);entities.add(new Entity(null, null));

        __CLR4_1_101q631q63luszwejr.R.inc(80578);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q631q63luszwejr.R.inc(80579);Assert.assertEquals(1, result.size());
        __CLR4_1_101q631q63luszwejr.R.inc(80580);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101q631q63luszwejr.R.flushNeeded();}}
    
    public void test_list_not_like_extract() throws Exception {__CLR4_1_101q631q63luszwejr.R.globalSliceStart(getClass().getName(),80581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bzg58g1q6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q631q63luszwejr.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q631q63luszwejr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_not_like_extract",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80581,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bzg58g1q6d() throws Exception{try{__CLR4_1_101q631q63luszwejr.R.inc(80581);
        __CLR4_1_101q631q63luszwejr.R.inc(80582);JSONPath path = new JSONPath("$[name not like 'ljw2083']");

        __CLR4_1_101q631q63luszwejr.R.inc(80583);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q631q63luszwejr.R.inc(80584);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q631q63luszwejr.R.inc(80585);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q631q63luszwejr.R.inc(80586);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q631q63luszwejr.R.inc(80587);entities.add(new Entity(null, null));

        __CLR4_1_101q631q63luszwejr.R.inc(80588);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q631q63luszwejr.R.inc(80589);Assert.assertEquals(3, result.size());
        __CLR4_1_101q631q63luszwejr.R.inc(80590);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_1_101q631q63luszwejr.R.inc(80591);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_1_101q631q63luszwejr.R.inc(80592);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_1_101q631q63luszwejr.R.flushNeeded();}}
    
    public void test_list_like_left_match() throws Exception {__CLR4_1_101q631q63luszwejr.R.globalSliceStart(getClass().getName(),80593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nsd1s81q6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q631q63luszwejr.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q631q63luszwejr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_left_match",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80593,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nsd1s81q6p() throws Exception{try{__CLR4_1_101q631q63luszwejr.R.inc(80593);
        __CLR4_1_101q631q63luszwejr.R.inc(80594);JSONPath path = new JSONPath("$[name like 'ljw%']");

        __CLR4_1_101q631q63luszwejr.R.inc(80595);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q631q63luszwejr.R.inc(80596);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q631q63luszwejr.R.inc(80597);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q631q63luszwejr.R.inc(80598);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q631q63luszwejr.R.inc(80599);entities.add(new Entity(null, null));

        __CLR4_1_101q631q63luszwejr.R.inc(80600);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q631q63luszwejr.R.inc(80601);Assert.assertEquals(1, result.size());
        __CLR4_1_101q631q63luszwejr.R.inc(80602);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101q631q63luszwejr.R.flushNeeded();}}
    
    public void test_list_like_left_not_match() throws Exception {__CLR4_1_101q631q63luszwejr.R.globalSliceStart(getClass().getName(),80603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f5d2g41q6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q631q63luszwejr.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q631q63luszwejr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_left_not_match",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80603,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f5d2g41q6z() throws Exception{try{__CLR4_1_101q631q63luszwejr.R.inc(80603);
        __CLR4_1_101q631q63luszwejr.R.inc(80604);JSONPath path = new JSONPath("$[name not like 'ljw%']");

        __CLR4_1_101q631q63luszwejr.R.inc(80605);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q631q63luszwejr.R.inc(80606);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q631q63luszwejr.R.inc(80607);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q631q63luszwejr.R.inc(80608);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q631q63luszwejr.R.inc(80609);entities.add(new Entity(null, null));

        __CLR4_1_101q631q63luszwejr.R.inc(80610);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q631q63luszwejr.R.inc(80611);Assert.assertEquals(2, result.size());
        __CLR4_1_101q631q63luszwejr.R.inc(80612);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_1_101q631q63luszwejr.R.inc(80613);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_1_101q631q63luszwejr.R.flushNeeded();}}
    
    public void test_list_like_right_match() throws Exception {__CLR4_1_101q631q63luszwejr.R.globalSliceStart(getClass().getName(),80614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hx3bmz1q7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q631q63luszwejr.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q631q63luszwejr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_right_match",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80614,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hx3bmz1q7a() throws Exception{try{__CLR4_1_101q631q63luszwejr.R.inc(80614);
        __CLR4_1_101q631q63luszwejr.R.inc(80615);JSONPath path = new JSONPath("$[name like '%2083']");

        __CLR4_1_101q631q63luszwejr.R.inc(80616);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q631q63luszwejr.R.inc(80617);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q631q63luszwejr.R.inc(80618);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q631q63luszwejr.R.inc(80619);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q631q63luszwejr.R.inc(80620);entities.add(new Entity(null, null));

        __CLR4_1_101q631q63luszwejr.R.inc(80621);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q631q63luszwejr.R.inc(80622);Assert.assertEquals(1, result.size());
        __CLR4_1_101q631q63luszwejr.R.inc(80623);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101q631q63luszwejr.R.flushNeeded();}}
    
    public void test_list_like_right_not_match() throws Exception {__CLR4_1_101q631q63luszwejr.R.globalSliceStart(getClass().getName(),80624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fwsh7b1q7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q631q63luszwejr.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q631q63luszwejr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_right_not_match",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80624,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fwsh7b1q7k() throws Exception{try{__CLR4_1_101q631q63luszwejr.R.inc(80624);
        __CLR4_1_101q631q63luszwejr.R.inc(80625);JSONPath path = new JSONPath("$[name not like '%2083']");
        
        __CLR4_1_101q631q63luszwejr.R.inc(80626);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q631q63luszwejr.R.inc(80627);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q631q63luszwejr.R.inc(80628);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q631q63luszwejr.R.inc(80629);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q631q63luszwejr.R.inc(80630);entities.add(new Entity(null, null));
        
        __CLR4_1_101q631q63luszwejr.R.inc(80631);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q631q63luszwejr.R.inc(80632);Assert.assertEquals(2, result.size());
        __CLR4_1_101q631q63luszwejr.R.inc(80633);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_1_101q631q63luszwejr.R.inc(80634);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_1_101q631q63luszwejr.R.flushNeeded();}}
    
    public void test_list_like_contains() throws Exception {__CLR4_1_101q631q63luszwejr.R.globalSliceStart(getClass().getName(),80635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fwgg9y1q7v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q631q63luszwejr.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q631q63luszwejr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_contains",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80635,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fwgg9y1q7v() throws Exception{try{__CLR4_1_101q631q63luszwejr.R.inc(80635);
        __CLR4_1_101q631q63luszwejr.R.inc(80636);JSONPath path = new JSONPath("$[name like '%208%']");

        __CLR4_1_101q631q63luszwejr.R.inc(80637);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q631q63luszwejr.R.inc(80638);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q631q63luszwejr.R.inc(80639);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q631q63luszwejr.R.inc(80640);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q631q63luszwejr.R.inc(80641);entities.add(new Entity(null, null));

        __CLR4_1_101q631q63luszwejr.R.inc(80642);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q631q63luszwejr.R.inc(80643);Assert.assertEquals(1, result.size());
        __CLR4_1_101q631q63luszwejr.R.inc(80644);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101q631q63luszwejr.R.flushNeeded();}}
    
    public void test_list_like_not_contains() throws Exception {__CLR4_1_101q631q63luszwejr.R.globalSliceStart(getClass().getName(),80645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10btzrba1q85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q631q63luszwejr.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q631q63luszwejr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_not_contains",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80645,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10btzrba1q85() throws Exception{try{__CLR4_1_101q631q63luszwejr.R.inc(80645);
        __CLR4_1_101q631q63luszwejr.R.inc(80646);JSONPath path = new JSONPath("$[name not like '%208%']");
        
        __CLR4_1_101q631q63luszwejr.R.inc(80647);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q631q63luszwejr.R.inc(80648);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q631q63luszwejr.R.inc(80649);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q631q63luszwejr.R.inc(80650);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q631q63luszwejr.R.inc(80651);entities.add(new Entity(null, null));
        
        __CLR4_1_101q631q63luszwejr.R.inc(80652);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q631q63luszwejr.R.inc(80653);Assert.assertEquals(2, result.size());
        __CLR4_1_101q631q63luszwejr.R.inc(80654);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_1_101q631q63luszwejr.R.inc(80655);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_1_101q631q63luszwejr.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement() throws Exception {__CLR4_1_101q631q63luszwejr.R.globalSliceStart(getClass().getName(),80656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kxs5ka1q8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q631q63luszwejr.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q631q63luszwejr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_match_two_segement",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80656,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kxs5ka1q8g() throws Exception{try{__CLR4_1_101q631q63luszwejr.R.inc(80656);
        __CLR4_1_101q631q63luszwejr.R.inc(80657);JSONPath path = new JSONPath("$[name like 'ljw%83']");

        __CLR4_1_101q631q63luszwejr.R.inc(80658);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q631q63luszwejr.R.inc(80659);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q631q63luszwejr.R.inc(80660);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q631q63luszwejr.R.inc(80661);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q631q63luszwejr.R.inc(80662);entities.add(new Entity(null, null));

        __CLR4_1_101q631q63luszwejr.R.inc(80663);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q631q63luszwejr.R.inc(80664);Assert.assertEquals(1, result.size());
        __CLR4_1_101q631q63luszwejr.R.inc(80665);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101q631q63luszwejr.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_not() throws Exception {__CLR4_1_101q631q63luszwejr.R.globalSliceStart(getClass().getName(),80666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10uj0uzu1q8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q631q63luszwejr.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q631q63luszwejr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_match_two_segement_not",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80666,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10uj0uzu1q8q() throws Exception{try{__CLR4_1_101q631q63luszwejr.R.inc(80666);
        __CLR4_1_101q631q63luszwejr.R.inc(80667);JSONPath path = new JSONPath("$[name not like 'ljw%83']");
        
        __CLR4_1_101q631q63luszwejr.R.inc(80668);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q631q63luszwejr.R.inc(80669);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q631q63luszwejr.R.inc(80670);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q631q63luszwejr.R.inc(80671);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q631q63luszwejr.R.inc(80672);entities.add(new Entity(null, null));
        
        __CLR4_1_101q631q63luszwejr.R.inc(80673);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q631q63luszwejr.R.inc(80674);Assert.assertEquals(2, result.size());
        __CLR4_1_101q631q63luszwejr.R.inc(80675);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_1_101q631q63luszwejr.R.inc(80676);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_1_101q631q63luszwejr.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_2() throws Exception {__CLR4_1_101q631q63luszwejr.R.globalSliceStart(getClass().getName(),80677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10clwq6v1q91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q631q63luszwejr.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q631q63luszwejr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_match_two_segement_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80677,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10clwq6v1q91() throws Exception{try{__CLR4_1_101q631q63luszwejr.R.inc(80677);
        __CLR4_1_101q631q63luszwejr.R.inc(80678);JSONPath path = new JSONPath("$[name like 'ljw%w2083']");
        
        __CLR4_1_101q631q63luszwejr.R.inc(80679);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q631q63luszwejr.R.inc(80680);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q631q63luszwejr.R.inc(80681);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q631q63luszwejr.R.inc(80682);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q631q63luszwejr.R.inc(80683);entities.add(new Entity(null, null));
        
        __CLR4_1_101q631q63luszwejr.R.inc(80684);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q631q63luszwejr.R.inc(80685);Assert.assertEquals(0, result.size());
    }finally{__CLR4_1_101q631q63luszwejr.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_2_not() throws Exception {__CLR4_1_101q631q63luszwejr.R.globalSliceStart(getClass().getName(),80686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1091xlab1q9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q631q63luszwejr.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q631q63luszwejr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_match_two_segement_2_not",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80686,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1091xlab1q9a() throws Exception{try{__CLR4_1_101q631q63luszwejr.R.inc(80686);
        __CLR4_1_101q631q63luszwejr.R.inc(80687);JSONPath path = new JSONPath("$[name not like 'ljw%w2083']");
        
        __CLR4_1_101q631q63luszwejr.R.inc(80688);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q631q63luszwejr.R.inc(80689);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q631q63luszwejr.R.inc(80690);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q631q63luszwejr.R.inc(80691);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q631q63luszwejr.R.inc(80692);entities.add(new Entity(null, null));
        
        __CLR4_1_101q631q63luszwejr.R.inc(80693);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q631q63luszwejr.R.inc(80694);Assert.assertEquals(3, result.size());
        __CLR4_1_101q631q63luszwejr.R.inc(80695);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101q631q63luszwejr.R.inc(80696);Assert.assertSame(entities.get(1), result.get(1));
        __CLR4_1_101q631q63luszwejr.R.inc(80697);Assert.assertSame(entities.get(2), result.get(2));
    }finally{__CLR4_1_101q631q63luszwejr.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_3() throws Exception {__CLR4_1_101q631q63luszwejr.R.globalSliceStart(getClass().getName(),80698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109cwree1q9m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q631q63luszwejr.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q631q63luszwejr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_match_two_segement_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80698,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109cwree1q9m() throws Exception{try{__CLR4_1_101q631q63luszwejr.R.inc(80698);
        __CLR4_1_101q631q63luszwejr.R.inc(80699);JSONPath path = new JSONPath("$[name like 'ljw%2%0%83']");
        
        __CLR4_1_101q631q63luszwejr.R.inc(80700);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q631q63luszwejr.R.inc(80701);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q631q63luszwejr.R.inc(80702);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q631q63luszwejr.R.inc(80703);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q631q63luszwejr.R.inc(80704);entities.add(new Entity(null, null));
        
        __CLR4_1_101q631q63luszwejr.R.inc(80705);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q631q63luszwejr.R.inc(80706);Assert.assertEquals(1, result.size());
        __CLR4_1_101q631q63luszwejr.R.inc(80707);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101q631q63luszwejr.R.flushNeeded();}}
    
    public void test_list_like_match_two_segement_3_not() throws Exception {__CLR4_1_101q631q63luszwejr.R.globalSliceStart(getClass().getName(),80708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10oxpr61q9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q631q63luszwejr.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q631q63luszwejr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_like_simple.test_list_like_match_two_segement_3_not",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80708,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10oxpr61q9w() throws Exception{try{__CLR4_1_101q631q63luszwejr.R.inc(80708);
        __CLR4_1_101q631q63luszwejr.R.inc(80709);JSONPath path = new JSONPath("$[name not like 'ljw%2%0%83']");
        
        __CLR4_1_101q631q63luszwejr.R.inc(80710);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q631q63luszwejr.R.inc(80711);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q631q63luszwejr.R.inc(80712);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q631q63luszwejr.R.inc(80713);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q631q63luszwejr.R.inc(80714);entities.add(new Entity(null, null));
        
        __CLR4_1_101q631q63luszwejr.R.inc(80715);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q631q63luszwejr.R.inc(80716);Assert.assertEquals(2, result.size());
        __CLR4_1_101q631q63luszwejr.R.inc(80717);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_1_101q631q63luszwejr.R.inc(80718);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_1_101q631q63luszwejr.R.flushNeeded();}}

    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_1_101q631q63luszwejr.R.inc(80719);
            __CLR4_1_101q631q63luszwejr.R.inc(80720);this.id = id;
            __CLR4_1_101q631q63luszwejr.R.inc(80721);this.name = name;
        }finally{__CLR4_1_101q631q63luszwejr.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_1_101q631q63luszwejr.R.inc(80722);
            __CLR4_1_101q631q63luszwejr.R.inc(80723);return id;
        }finally{__CLR4_1_101q631q63luszwejr.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_1_101q631q63luszwejr.R.inc(80724);
            __CLR4_1_101q631q63luszwejr.R.inc(80725);this.id = id;
        }finally{__CLR4_1_101q631q63luszwejr.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101q631q63luszwejr.R.inc(80726);
            __CLR4_1_101q631q63luszwejr.R.inc(80727);return name;
        }finally{__CLR4_1_101q631q63luszwejr.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101q631q63luszwejr.R.inc(80728);
            __CLR4_1_101q631q63luszwejr.R.inc(80729);this.name = name;
        }finally{__CLR4_1_101q631q63luszwejr.R.flushNeeded();}}

    }
}
