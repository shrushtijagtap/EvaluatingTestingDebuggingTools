/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_compare_string_simple extends TestCase {static class __CLR4_5_21pu31pu3lusvnfgu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,80234,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_eq() throws Exception {__CLR4_5_21pu31pu3lusvnfgu.R.globalSliceStart(getClass().getName(),80139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k3geih1pu3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pu31pu3lusvnfgu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pu31pu3lusvnfgu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_eq",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80139,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k3geih1pu3() throws Exception{try{__CLR4_5_21pu31pu3lusvnfgu.R.inc(80139);
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80140);JSONPath path = new JSONPath("[name = 'ljw2083']");

        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80141);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80142);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80143);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80144);entities.add(new Entity(1003, null));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80145);entities.add(new Entity(null, null));

        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80146);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80147);Assert.assertEquals(1, result.size());
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80148);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21pu31pu3lusvnfgu.R.flushNeeded();}}
    
    public void test_list_eq_x() throws Exception {__CLR4_5_21pu31pu3lusvnfgu.R.globalSliceStart(getClass().getName(),80149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u058ps1pud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pu31pu3lusvnfgu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pu31pu3lusvnfgu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_eq_x",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80149,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u058ps1pud() throws Exception{try{__CLR4_5_21pu31pu3lusvnfgu.R.inc(80149);
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80150);JSONPath path = new JSONPath("[name = 'ljw2083']");
        
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80151);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80152);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80153);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80154);entities.add(new Entity(1003, null));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80155);entities.add(new Entity(null, null));
        
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80156);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80157);Assert.assertEquals(1, result.size());
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80158);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21pu31pu3lusvnfgu.R.flushNeeded();}}
    
    public void test_list_eq_null() throws Exception {__CLR4_5_21pu31pu3lusvnfgu.R.globalSliceStart(getClass().getName(),80159);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rq8m991pun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pu31pu3lusvnfgu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pu31pu3lusvnfgu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_eq_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80159,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rq8m991pun() throws Exception{try{__CLR4_5_21pu31pu3lusvnfgu.R.inc(80159);
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80160);JSONPath path = new JSONPath("$[name = null]");

        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80161);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80162);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80163);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80164);entities.add(new Entity(1003, null));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80165);entities.add(new Entity(null, null));

        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80166);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80167);Assert.assertEquals(2, result.size());
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80168);Assert.assertSame(entities.get(2), result.get(0));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80169);Assert.assertSame(entities.get(3), result.get(1));
    }finally{__CLR4_5_21pu31pu3lusvnfgu.R.flushNeeded();}}
    
    public void test_list_not_null() throws Exception {__CLR4_5_21pu31pu3lusvnfgu.R.globalSliceStart(getClass().getName(),80170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sc0x2m1puy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pu31pu3lusvnfgu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pu31pu3lusvnfgu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_not_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80170,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sc0x2m1puy() throws Exception{try{__CLR4_5_21pu31pu3lusvnfgu.R.inc(80170);
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80171);JSONPath path = new JSONPath("$[name != null]");
        
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80172);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80173);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80174);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80175);entities.add(new Entity(1003, null));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80176);entities.add(new Entity(null, null));
        
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80177);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80178);Assert.assertEquals(2, result.size());
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80179);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80180);Assert.assertSame(entities.get(1), result.get(1));
    }finally{__CLR4_5_21pu31pu3lusvnfgu.R.flushNeeded();}}
    
    public void test_list_gt() throws Exception {__CLR4_5_21pu31pu3lusvnfgu.R.globalSliceStart(getClass().getName(),80181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lxur141pv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pu31pu3lusvnfgu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pu31pu3lusvnfgu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_gt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80181,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lxur141pv9() throws Exception{try{__CLR4_5_21pu31pu3lusvnfgu.R.inc(80181);
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80182);JSONPath path = new JSONPath("$[name > 'ljw2083']");
        
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80183);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80184);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80185);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80186);entities.add(new Entity(1003, null));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80187);entities.add(new Entity(null, null));
        
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80188);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80189);Assert.assertEquals(1, result.size());
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80190);Assert.assertSame(entities.get(1), result.get(0));
    }finally{__CLR4_5_21pu31pu3lusvnfgu.R.flushNeeded();}}
    
    public void test_list_ge() throws Exception {__CLR4_5_21pu31pu3lusvnfgu.R.globalSliceStart(getClass().getName(),80191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c9t2x1pvj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pu31pu3lusvnfgu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pu31pu3lusvnfgu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_ge",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80191,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c9t2x1pvj() throws Exception{try{__CLR4_5_21pu31pu3lusvnfgu.R.inc(80191);
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80192);JSONPath path = new JSONPath("$[name >= 'ljw2083']");
        
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80193);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80194);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80195);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80196);entities.add(new Entity(1003, null));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80197);entities.add(new Entity(null, null));
        
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80198);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80199);Assert.assertEquals(2, result.size());
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80200);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80201);Assert.assertSame(entities.get(1), result.get(1));
    }finally{__CLR4_5_21pu31pu3lusvnfgu.R.flushNeeded();}}

    public void test_list_lt() throws Exception {__CLR4_5_21pu31pu3lusvnfgu.R.globalSliceStart(getClass().getName(),80202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fesc9p1pvu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pu31pu3lusvnfgu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pu31pu3lusvnfgu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_lt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80202,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fesc9p1pvu() throws Exception{try{__CLR4_5_21pu31pu3lusvnfgu.R.inc(80202);
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80203);JSONPath path = new JSONPath("$[?(@.name < 'wenshao')]");
        
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80204);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80205);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80206);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80207);entities.add(new Entity(1003, null));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80208);entities.add(new Entity(null, null));
        
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80209);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80210);Assert.assertEquals(1, result.size());
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80211);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21pu31pu3lusvnfgu.R.flushNeeded();}}
    
    public void test_list_le() throws Exception {__CLR4_5_21pu31pu3lusvnfgu.R.globalSliceStart(getClass().getName(),80212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26vc7uc1pw4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21pu31pu3lusvnfgu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21pu31pu3lusvnfgu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_le",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80212,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26vc7uc1pw4() throws Exception{try{__CLR4_5_21pu31pu3lusvnfgu.R.inc(80212);
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80213);JSONPath path = new JSONPath("$[name <= 'wenshao']");
        
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80214);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80215);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80216);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80217);entities.add(new Entity(1003, null));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80218);entities.add(new Entity(null, null));
        
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80219);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80220);Assert.assertEquals(2, result.size());
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80221);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21pu31pu3lusvnfgu.R.inc(80222);Assert.assertSame(entities.get(1), result.get(1));
    }finally{__CLR4_5_21pu31pu3lusvnfgu.R.flushNeeded();}}
    
    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_5_21pu31pu3lusvnfgu.R.inc(80223);
            __CLR4_5_21pu31pu3lusvnfgu.R.inc(80224);this.id = id;
            __CLR4_5_21pu31pu3lusvnfgu.R.inc(80225);this.name = name;
        }finally{__CLR4_5_21pu31pu3lusvnfgu.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_5_21pu31pu3lusvnfgu.R.inc(80226);
            __CLR4_5_21pu31pu3lusvnfgu.R.inc(80227);return id;
        }finally{__CLR4_5_21pu31pu3lusvnfgu.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_5_21pu31pu3lusvnfgu.R.inc(80228);
            __CLR4_5_21pu31pu3lusvnfgu.R.inc(80229);this.id = id;
        }finally{__CLR4_5_21pu31pu3lusvnfgu.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21pu31pu3lusvnfgu.R.inc(80230);
            __CLR4_5_21pu31pu3lusvnfgu.R.inc(80231);return name;
        }finally{__CLR4_5_21pu31pu3lusvnfgu.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21pu31pu3lusvnfgu.R.inc(80232);
            __CLR4_5_21pu31pu3lusvnfgu.R.inc(80233);this.name = name;
        }finally{__CLR4_5_21pu31pu3lusvnfgu.R.flushNeeded();}}

    }
}
