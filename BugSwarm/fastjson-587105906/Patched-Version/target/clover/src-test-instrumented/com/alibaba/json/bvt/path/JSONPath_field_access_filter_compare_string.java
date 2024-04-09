/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_compare_string extends TestCase {static class __CLR4_5_21prb1prblusvnfgi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,80139,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_eq() throws Exception {__CLR4_5_21prb1prblusvnfgi.R.globalSliceStart(getClass().getName(),80039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k3geih1prb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21prb1prblusvnfgi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21prb1prblusvnfgi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string.test_list_eq",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80039,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k3geih1prb() throws Exception{try{__CLR4_5_21prb1prblusvnfgi.R.inc(80039);
        __CLR4_5_21prb1prblusvnfgi.R.inc(80040);JSONPath path = new JSONPath("$[?(@.name = 'ljw2083')]");

        __CLR4_5_21prb1prblusvnfgi.R.inc(80041);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21prb1prblusvnfgi.R.inc(80042);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80043);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80044);entities.add(new Entity(1003, null));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80045);entities.add(new Entity(null, null));

        __CLR4_5_21prb1prblusvnfgi.R.inc(80046);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21prb1prblusvnfgi.R.inc(80047);Assert.assertEquals(1, result.size());
        __CLR4_5_21prb1prblusvnfgi.R.inc(80048);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21prb1prblusvnfgi.R.flushNeeded();}}
    
    public void test_list_eq_x() throws Exception {__CLR4_5_21prb1prblusvnfgi.R.globalSliceStart(getClass().getName(),80049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u058ps1prl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21prb1prblusvnfgi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21prb1prblusvnfgi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string.test_list_eq_x",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80049,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u058ps1prl() throws Exception{try{__CLR4_5_21prb1prblusvnfgi.R.inc(80049);
        __CLR4_5_21prb1prblusvnfgi.R.inc(80050);JSONPath path = new JSONPath("$[?(name = 'ljw2083')]");
        
        __CLR4_5_21prb1prblusvnfgi.R.inc(80051);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21prb1prblusvnfgi.R.inc(80052);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80053);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80054);entities.add(new Entity(1003, null));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80055);entities.add(new Entity(null, null));
        
        __CLR4_5_21prb1prblusvnfgi.R.inc(80056);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21prb1prblusvnfgi.R.inc(80057);Assert.assertEquals(1, result.size());
        __CLR4_5_21prb1prblusvnfgi.R.inc(80058);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21prb1prblusvnfgi.R.flushNeeded();}}
    
    public void test_list_eq_null() throws Exception {__CLR4_5_21prb1prblusvnfgi.R.globalSliceStart(getClass().getName(),80059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rq8m991prv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21prb1prblusvnfgi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21prb1prblusvnfgi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string.test_list_eq_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80059,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rq8m991prv() throws Exception{try{__CLR4_5_21prb1prblusvnfgi.R.inc(80059);
        __CLR4_5_21prb1prblusvnfgi.R.inc(80060);JSONPath path = new JSONPath("$[?(@.name = null)]");

        __CLR4_5_21prb1prblusvnfgi.R.inc(80061);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21prb1prblusvnfgi.R.inc(80062);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80063);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80064);entities.add(new Entity(1003, null));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80065);entities.add(new Entity(null, null));

        __CLR4_5_21prb1prblusvnfgi.R.inc(80066);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21prb1prblusvnfgi.R.inc(80067);Assert.assertEquals(2, result.size());
        __CLR4_5_21prb1prblusvnfgi.R.inc(80068);Assert.assertSame(entities.get(2), result.get(0));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80069);Assert.assertSame(entities.get(3), result.get(1));
    }finally{__CLR4_5_21prb1prblusvnfgi.R.flushNeeded();}}
    
    public void test_list_not_null() throws Exception {__CLR4_5_21prb1prblusvnfgi.R.globalSliceStart(getClass().getName(),80070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sc0x2m1ps6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21prb1prblusvnfgi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21prb1prblusvnfgi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string.test_list_not_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80070,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sc0x2m1ps6() throws Exception{try{__CLR4_5_21prb1prblusvnfgi.R.inc(80070);
        __CLR4_5_21prb1prblusvnfgi.R.inc(80071);JSONPath path = new JSONPath("$[?(@.name != null)]");
        
        __CLR4_5_21prb1prblusvnfgi.R.inc(80072);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21prb1prblusvnfgi.R.inc(80073);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80074);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80075);entities.add(new Entity(1003, null));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80076);entities.add(new Entity(null, null));
        
        __CLR4_5_21prb1prblusvnfgi.R.inc(80077);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21prb1prblusvnfgi.R.inc(80078);Assert.assertEquals(2, result.size());
        __CLR4_5_21prb1prblusvnfgi.R.inc(80079);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80080);Assert.assertSame(entities.get(1), result.get(1));
    }finally{__CLR4_5_21prb1prblusvnfgi.R.flushNeeded();}}
    
    public void test_list_gt() throws Exception {__CLR4_5_21prb1prblusvnfgi.R.globalSliceStart(getClass().getName(),80081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lxur141psh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21prb1prblusvnfgi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21prb1prblusvnfgi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string.test_list_gt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80081,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lxur141psh() throws Exception{try{__CLR4_5_21prb1prblusvnfgi.R.inc(80081);
        __CLR4_5_21prb1prblusvnfgi.R.inc(80082);JSONPath path = new JSONPath("$[?(@.name > 'ljw2083')]");
        
        __CLR4_5_21prb1prblusvnfgi.R.inc(80083);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21prb1prblusvnfgi.R.inc(80084);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80085);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80086);entities.add(new Entity(1003, null));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80087);entities.add(new Entity(null, null));
        
        __CLR4_5_21prb1prblusvnfgi.R.inc(80088);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21prb1prblusvnfgi.R.inc(80089);Assert.assertEquals(1, result.size());
        __CLR4_5_21prb1prblusvnfgi.R.inc(80090);Assert.assertSame(entities.get(1), result.get(0));
    }finally{__CLR4_5_21prb1prblusvnfgi.R.flushNeeded();}}
    
    public void test_list_ge() throws Exception {__CLR4_5_21prb1prblusvnfgi.R.globalSliceStart(getClass().getName(),80091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c9t2x1psr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21prb1prblusvnfgi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21prb1prblusvnfgi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string.test_list_ge",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80091,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c9t2x1psr() throws Exception{try{__CLR4_5_21prb1prblusvnfgi.R.inc(80091);
        __CLR4_5_21prb1prblusvnfgi.R.inc(80092);JSONPath path = new JSONPath("$[?(@.name >= 'ljw2083')]");
        
        __CLR4_5_21prb1prblusvnfgi.R.inc(80093);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21prb1prblusvnfgi.R.inc(80094);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80095);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80096);entities.add(new Entity(1003, null));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80097);entities.add(new Entity(null, null));
        
        __CLR4_5_21prb1prblusvnfgi.R.inc(80098);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21prb1prblusvnfgi.R.inc(80099);Assert.assertEquals(2, result.size());
        __CLR4_5_21prb1prblusvnfgi.R.inc(80100);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80101);Assert.assertSame(entities.get(1), result.get(1));
    }finally{__CLR4_5_21prb1prblusvnfgi.R.flushNeeded();}}

    public void test_list_lt() throws Exception {__CLR4_5_21prb1prblusvnfgi.R.globalSliceStart(getClass().getName(),80102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fesc9p1pt2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21prb1prblusvnfgi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21prb1prblusvnfgi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string.test_list_lt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80102,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fesc9p1pt2() throws Exception{try{__CLR4_5_21prb1prblusvnfgi.R.inc(80102);
        __CLR4_5_21prb1prblusvnfgi.R.inc(80103);JSONPath path = new JSONPath("$[?(@.name < 'wenshao')]");
        
        __CLR4_5_21prb1prblusvnfgi.R.inc(80104);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21prb1prblusvnfgi.R.inc(80105);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80106);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80107);entities.add(new Entity(1003, null));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80108);entities.add(new Entity(null, null));
        
        __CLR4_5_21prb1prblusvnfgi.R.inc(80109);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21prb1prblusvnfgi.R.inc(80110);Assert.assertEquals(1, result.size());
        __CLR4_5_21prb1prblusvnfgi.R.inc(80111);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21prb1prblusvnfgi.R.flushNeeded();}}
    
    public void test_list_le() throws Exception {__CLR4_5_21prb1prblusvnfgi.R.globalSliceStart(getClass().getName(),80112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26vc7uc1ptc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21prb1prblusvnfgi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21prb1prblusvnfgi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string.test_list_le",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80112,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26vc7uc1ptc() throws Exception{try{__CLR4_5_21prb1prblusvnfgi.R.inc(80112);
        __CLR4_5_21prb1prblusvnfgi.R.inc(80113);JSONPath path = new JSONPath("$[?(@.name <= 'wenshao')]");
        
        __CLR4_5_21prb1prblusvnfgi.R.inc(80114);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21prb1prblusvnfgi.R.inc(80115);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80116);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80117);entities.add(new Entity(1003, null));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80118);entities.add(new Entity(null, null));
        
        __CLR4_5_21prb1prblusvnfgi.R.inc(80119);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21prb1prblusvnfgi.R.inc(80120);Assert.assertEquals(2, result.size());
        __CLR4_5_21prb1prblusvnfgi.R.inc(80121);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21prb1prblusvnfgi.R.inc(80122);Assert.assertSame(entities.get(1), result.get(1));
    }finally{__CLR4_5_21prb1prblusvnfgi.R.flushNeeded();}}

    public void test_eq() throws Exception {__CLR4_5_21prb1prblusvnfgi.R.globalSliceStart(getClass().getName(),80123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9x2zk1ptn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21prb1prblusvnfgi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21prb1prblusvnfgi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string.test_eq",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80123,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9x2zk1ptn() throws Exception{try{__CLR4_5_21prb1prblusvnfgi.R.inc(80123);
        __CLR4_5_21prb1prblusvnfgi.R.inc(80124);JSONPath path = new JSONPath("$.*[?(@.name=='b')].id");

        __CLR4_5_21prb1prblusvnfgi.R.inc(80125);JSONArray array = JSON.parseArray("[{\"id\":\"1\",\"name\":\"a\"},{\"id\":\"2\",\"name\":\"b\"}]");
        __CLR4_5_21prb1prblusvnfgi.R.inc(80126);Object result = path.eval(array);
        __CLR4_5_21prb1prblusvnfgi.R.inc(80127);System.out.println(result);
    }finally{__CLR4_5_21prb1prblusvnfgi.R.flushNeeded();}}

    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_5_21prb1prblusvnfgi.R.inc(80128);
            __CLR4_5_21prb1prblusvnfgi.R.inc(80129);this.id = id;
            __CLR4_5_21prb1prblusvnfgi.R.inc(80130);this.name = name;
        }finally{__CLR4_5_21prb1prblusvnfgi.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_5_21prb1prblusvnfgi.R.inc(80131);
            __CLR4_5_21prb1prblusvnfgi.R.inc(80132);return id;
        }finally{__CLR4_5_21prb1prblusvnfgi.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_5_21prb1prblusvnfgi.R.inc(80133);
            __CLR4_5_21prb1prblusvnfgi.R.inc(80134);this.id = id;
        }finally{__CLR4_5_21prb1prblusvnfgi.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21prb1prblusvnfgi.R.inc(80135);
            __CLR4_5_21prb1prblusvnfgi.R.inc(80136);return name;
        }finally{__CLR4_5_21prb1prblusvnfgi.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21prb1prblusvnfgi.R.inc(80137);
            __CLR4_5_21prb1prblusvnfgi.R.inc(80138);this.name = name;
        }finally{__CLR4_5_21prb1prblusvnfgi.R.flushNeeded();}}

    }
}
