/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_compare_string extends TestCase {static class __CLR4_5_21ot31ot3lusyjujz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,78907,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_eq() throws Exception {__CLR4_5_21ot31ot3lusyjujz.R.globalSliceStart(getClass().getName(),78807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k3geih1ot3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ot31ot3lusyjujz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ot31ot3lusyjujz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string.test_list_eq",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78807,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k3geih1ot3() throws Exception{try{__CLR4_5_21ot31ot3lusyjujz.R.inc(78807);
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78808);JSONPath path = new JSONPath("$[?(@.name = 'ljw2083')]");

        __CLR4_5_21ot31ot3lusyjujz.R.inc(78809);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78810);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78811);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78812);entities.add(new Entity(1003, null));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78813);entities.add(new Entity(null, null));

        __CLR4_5_21ot31ot3lusyjujz.R.inc(78814);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78815);Assert.assertEquals(1, result.size());
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78816);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21ot31ot3lusyjujz.R.flushNeeded();}}
    
    public void test_list_eq_x() throws Exception {__CLR4_5_21ot31ot3lusyjujz.R.globalSliceStart(getClass().getName(),78817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u058ps1otd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ot31ot3lusyjujz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ot31ot3lusyjujz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string.test_list_eq_x",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78817,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u058ps1otd() throws Exception{try{__CLR4_5_21ot31ot3lusyjujz.R.inc(78817);
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78818);JSONPath path = new JSONPath("$[?(name = 'ljw2083')]");
        
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78819);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78820);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78821);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78822);entities.add(new Entity(1003, null));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78823);entities.add(new Entity(null, null));
        
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78824);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78825);Assert.assertEquals(1, result.size());
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78826);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21ot31ot3lusyjujz.R.flushNeeded();}}
    
    public void test_list_eq_null() throws Exception {__CLR4_5_21ot31ot3lusyjujz.R.globalSliceStart(getClass().getName(),78827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rq8m991otn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ot31ot3lusyjujz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ot31ot3lusyjujz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string.test_list_eq_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78827,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rq8m991otn() throws Exception{try{__CLR4_5_21ot31ot3lusyjujz.R.inc(78827);
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78828);JSONPath path = new JSONPath("$[?(@.name = null)]");

        __CLR4_5_21ot31ot3lusyjujz.R.inc(78829);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78830);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78831);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78832);entities.add(new Entity(1003, null));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78833);entities.add(new Entity(null, null));

        __CLR4_5_21ot31ot3lusyjujz.R.inc(78834);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78835);Assert.assertEquals(2, result.size());
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78836);Assert.assertSame(entities.get(2), result.get(0));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78837);Assert.assertSame(entities.get(3), result.get(1));
    }finally{__CLR4_5_21ot31ot3lusyjujz.R.flushNeeded();}}
    
    public void test_list_not_null() throws Exception {__CLR4_5_21ot31ot3lusyjujz.R.globalSliceStart(getClass().getName(),78838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sc0x2m1oty();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ot31ot3lusyjujz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ot31ot3lusyjujz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string.test_list_not_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78838,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sc0x2m1oty() throws Exception{try{__CLR4_5_21ot31ot3lusyjujz.R.inc(78838);
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78839);JSONPath path = new JSONPath("$[?(@.name != null)]");
        
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78840);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78841);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78842);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78843);entities.add(new Entity(1003, null));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78844);entities.add(new Entity(null, null));
        
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78845);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78846);Assert.assertEquals(2, result.size());
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78847);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78848);Assert.assertSame(entities.get(1), result.get(1));
    }finally{__CLR4_5_21ot31ot3lusyjujz.R.flushNeeded();}}
    
    public void test_list_gt() throws Exception {__CLR4_5_21ot31ot3lusyjujz.R.globalSliceStart(getClass().getName(),78849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lxur141ou9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ot31ot3lusyjujz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ot31ot3lusyjujz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string.test_list_gt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78849,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lxur141ou9() throws Exception{try{__CLR4_5_21ot31ot3lusyjujz.R.inc(78849);
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78850);JSONPath path = new JSONPath("$[?(@.name > 'ljw2083')]");
        
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78851);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78852);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78853);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78854);entities.add(new Entity(1003, null));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78855);entities.add(new Entity(null, null));
        
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78856);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78857);Assert.assertEquals(1, result.size());
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78858);Assert.assertSame(entities.get(1), result.get(0));
    }finally{__CLR4_5_21ot31ot3lusyjujz.R.flushNeeded();}}
    
    public void test_list_ge() throws Exception {__CLR4_5_21ot31ot3lusyjujz.R.globalSliceStart(getClass().getName(),78859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c9t2x1ouj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ot31ot3lusyjujz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ot31ot3lusyjujz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string.test_list_ge",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78859,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c9t2x1ouj() throws Exception{try{__CLR4_5_21ot31ot3lusyjujz.R.inc(78859);
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78860);JSONPath path = new JSONPath("$[?(@.name >= 'ljw2083')]");
        
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78861);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78862);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78863);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78864);entities.add(new Entity(1003, null));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78865);entities.add(new Entity(null, null));
        
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78866);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78867);Assert.assertEquals(2, result.size());
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78868);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78869);Assert.assertSame(entities.get(1), result.get(1));
    }finally{__CLR4_5_21ot31ot3lusyjujz.R.flushNeeded();}}

    public void test_list_lt() throws Exception {__CLR4_5_21ot31ot3lusyjujz.R.globalSliceStart(getClass().getName(),78870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fesc9p1ouu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ot31ot3lusyjujz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ot31ot3lusyjujz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string.test_list_lt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78870,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fesc9p1ouu() throws Exception{try{__CLR4_5_21ot31ot3lusyjujz.R.inc(78870);
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78871);JSONPath path = new JSONPath("$[?(@.name < 'wenshao')]");
        
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78872);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78873);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78874);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78875);entities.add(new Entity(1003, null));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78876);entities.add(new Entity(null, null));
        
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78877);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78878);Assert.assertEquals(1, result.size());
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78879);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21ot31ot3lusyjujz.R.flushNeeded();}}
    
    public void test_list_le() throws Exception {__CLR4_5_21ot31ot3lusyjujz.R.globalSliceStart(getClass().getName(),78880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26vc7uc1ov4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ot31ot3lusyjujz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ot31ot3lusyjujz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string.test_list_le",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78880,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26vc7uc1ov4() throws Exception{try{__CLR4_5_21ot31ot3lusyjujz.R.inc(78880);
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78881);JSONPath path = new JSONPath("$[?(@.name <= 'wenshao')]");
        
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78882);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78883);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78884);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78885);entities.add(new Entity(1003, null));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78886);entities.add(new Entity(null, null));
        
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78887);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78888);Assert.assertEquals(2, result.size());
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78889);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78890);Assert.assertSame(entities.get(1), result.get(1));
    }finally{__CLR4_5_21ot31ot3lusyjujz.R.flushNeeded();}}

    public void test_eq() throws Exception {__CLR4_5_21ot31ot3lusyjujz.R.globalSliceStart(getClass().getName(),78891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9x2zk1ovf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ot31ot3lusyjujz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ot31ot3lusyjujz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string.test_eq",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78891,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9x2zk1ovf() throws Exception{try{__CLR4_5_21ot31ot3lusyjujz.R.inc(78891);
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78892);JSONPath path = new JSONPath("$.*[?(@.name=='b')].id");

        __CLR4_5_21ot31ot3lusyjujz.R.inc(78893);JSONArray array = JSON.parseArray("[{\"id\":\"1\",\"name\":\"a\"},{\"id\":\"2\",\"name\":\"b\"}]");
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78894);Object result = path.eval(array);
        __CLR4_5_21ot31ot3lusyjujz.R.inc(78895);System.out.println(result);
    }finally{__CLR4_5_21ot31ot3lusyjujz.R.flushNeeded();}}

    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_5_21ot31ot3lusyjujz.R.inc(78896);
            __CLR4_5_21ot31ot3lusyjujz.R.inc(78897);this.id = id;
            __CLR4_5_21ot31ot3lusyjujz.R.inc(78898);this.name = name;
        }finally{__CLR4_5_21ot31ot3lusyjujz.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_5_21ot31ot3lusyjujz.R.inc(78899);
            __CLR4_5_21ot31ot3lusyjujz.R.inc(78900);return id;
        }finally{__CLR4_5_21ot31ot3lusyjujz.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_5_21ot31ot3lusyjujz.R.inc(78901);
            __CLR4_5_21ot31ot3lusyjujz.R.inc(78902);this.id = id;
        }finally{__CLR4_5_21ot31ot3lusyjujz.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21ot31ot3lusyjujz.R.inc(78903);
            __CLR4_5_21ot31ot3lusyjujz.R.inc(78904);return name;
        }finally{__CLR4_5_21ot31ot3lusyjujz.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21ot31ot3lusyjujz.R.inc(78905);
            __CLR4_5_21ot31ot3lusyjujz.R.inc(78906);this.name = name;
        }finally{__CLR4_5_21ot31ot3lusyjujz.R.flushNeeded();}}

    }
}
