/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_compare_string_simple extends TestCase {static class __CLR4_1_101pue1pueluszweey{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,80245,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_eq() throws Exception {__CLR4_1_101pue1pueluszweey.R.globalSliceStart(getClass().getName(),80150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10k3geih1pue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pue1pueluszweey.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pue1pueluszweey.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_eq",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80150,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10k3geih1pue() throws Exception{try{__CLR4_1_101pue1pueluszweey.R.inc(80150);
        __CLR4_1_101pue1pueluszweey.R.inc(80151);JSONPath path = new JSONPath("[name = 'ljw2083']");

        __CLR4_1_101pue1pueluszweey.R.inc(80152);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pue1pueluszweey.R.inc(80153);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pue1pueluszweey.R.inc(80154);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pue1pueluszweey.R.inc(80155);entities.add(new Entity(1003, null));
        __CLR4_1_101pue1pueluszweey.R.inc(80156);entities.add(new Entity(null, null));

        __CLR4_1_101pue1pueluszweey.R.inc(80157);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pue1pueluszweey.R.inc(80158);Assert.assertEquals(1, result.size());
        __CLR4_1_101pue1pueluszweey.R.inc(80159);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101pue1pueluszweey.R.flushNeeded();}}
    
    public void test_list_eq_x() throws Exception {__CLR4_1_101pue1pueluszweey.R.globalSliceStart(getClass().getName(),80160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10u058ps1puo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pue1pueluszweey.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pue1pueluszweey.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_eq_x",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80160,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10u058ps1puo() throws Exception{try{__CLR4_1_101pue1pueluszweey.R.inc(80160);
        __CLR4_1_101pue1pueluszweey.R.inc(80161);JSONPath path = new JSONPath("[name = 'ljw2083']");
        
        __CLR4_1_101pue1pueluszweey.R.inc(80162);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pue1pueluszweey.R.inc(80163);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pue1pueluszweey.R.inc(80164);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pue1pueluszweey.R.inc(80165);entities.add(new Entity(1003, null));
        __CLR4_1_101pue1pueluszweey.R.inc(80166);entities.add(new Entity(null, null));
        
        __CLR4_1_101pue1pueluszweey.R.inc(80167);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pue1pueluszweey.R.inc(80168);Assert.assertEquals(1, result.size());
        __CLR4_1_101pue1pueluszweey.R.inc(80169);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101pue1pueluszweey.R.flushNeeded();}}
    
    public void test_list_eq_null() throws Exception {__CLR4_1_101pue1pueluszweey.R.globalSliceStart(getClass().getName(),80170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rq8m991puy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pue1pueluszweey.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pue1pueluszweey.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_eq_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80170,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rq8m991puy() throws Exception{try{__CLR4_1_101pue1pueluszweey.R.inc(80170);
        __CLR4_1_101pue1pueluszweey.R.inc(80171);JSONPath path = new JSONPath("$[name = null]");

        __CLR4_1_101pue1pueluszweey.R.inc(80172);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pue1pueluszweey.R.inc(80173);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pue1pueluszweey.R.inc(80174);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pue1pueluszweey.R.inc(80175);entities.add(new Entity(1003, null));
        __CLR4_1_101pue1pueluszweey.R.inc(80176);entities.add(new Entity(null, null));

        __CLR4_1_101pue1pueluszweey.R.inc(80177);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pue1pueluszweey.R.inc(80178);Assert.assertEquals(2, result.size());
        __CLR4_1_101pue1pueluszweey.R.inc(80179);Assert.assertSame(entities.get(2), result.get(0));
        __CLR4_1_101pue1pueluszweey.R.inc(80180);Assert.assertSame(entities.get(3), result.get(1));
    }finally{__CLR4_1_101pue1pueluszweey.R.flushNeeded();}}
    
    public void test_list_not_null() throws Exception {__CLR4_1_101pue1pueluszweey.R.globalSliceStart(getClass().getName(),80181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10sc0x2m1pv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pue1pueluszweey.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pue1pueluszweey.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_not_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80181,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10sc0x2m1pv9() throws Exception{try{__CLR4_1_101pue1pueluszweey.R.inc(80181);
        __CLR4_1_101pue1pueluszweey.R.inc(80182);JSONPath path = new JSONPath("$[name != null]");
        
        __CLR4_1_101pue1pueluszweey.R.inc(80183);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pue1pueluszweey.R.inc(80184);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pue1pueluszweey.R.inc(80185);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pue1pueluszweey.R.inc(80186);entities.add(new Entity(1003, null));
        __CLR4_1_101pue1pueluszweey.R.inc(80187);entities.add(new Entity(null, null));
        
        __CLR4_1_101pue1pueluszweey.R.inc(80188);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pue1pueluszweey.R.inc(80189);Assert.assertEquals(2, result.size());
        __CLR4_1_101pue1pueluszweey.R.inc(80190);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101pue1pueluszweey.R.inc(80191);Assert.assertSame(entities.get(1), result.get(1));
    }finally{__CLR4_1_101pue1pueluszweey.R.flushNeeded();}}
    
    public void test_list_gt() throws Exception {__CLR4_1_101pue1pueluszweey.R.globalSliceStart(getClass().getName(),80192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lxur141pvk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pue1pueluszweey.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pue1pueluszweey.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_gt",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80192,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lxur141pvk() throws Exception{try{__CLR4_1_101pue1pueluszweey.R.inc(80192);
        __CLR4_1_101pue1pueluszweey.R.inc(80193);JSONPath path = new JSONPath("$[name > 'ljw2083']");
        
        __CLR4_1_101pue1pueluszweey.R.inc(80194);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pue1pueluszweey.R.inc(80195);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pue1pueluszweey.R.inc(80196);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pue1pueluszweey.R.inc(80197);entities.add(new Entity(1003, null));
        __CLR4_1_101pue1pueluszweey.R.inc(80198);entities.add(new Entity(null, null));
        
        __CLR4_1_101pue1pueluszweey.R.inc(80199);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pue1pueluszweey.R.inc(80200);Assert.assertEquals(1, result.size());
        __CLR4_1_101pue1pueluszweey.R.inc(80201);Assert.assertSame(entities.get(1), result.get(0));
    }finally{__CLR4_1_101pue1pueluszweey.R.flushNeeded();}}
    
    public void test_list_ge() throws Exception {__CLR4_1_101pue1pueluszweey.R.globalSliceStart(getClass().getName(),80202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c9t2x1pvu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pue1pueluszweey.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pue1pueluszweey.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_ge",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80202,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c9t2x1pvu() throws Exception{try{__CLR4_1_101pue1pueluszweey.R.inc(80202);
        __CLR4_1_101pue1pueluszweey.R.inc(80203);JSONPath path = new JSONPath("$[name >= 'ljw2083']");
        
        __CLR4_1_101pue1pueluszweey.R.inc(80204);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pue1pueluszweey.R.inc(80205);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pue1pueluszweey.R.inc(80206);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pue1pueluszweey.R.inc(80207);entities.add(new Entity(1003, null));
        __CLR4_1_101pue1pueluszweey.R.inc(80208);entities.add(new Entity(null, null));
        
        __CLR4_1_101pue1pueluszweey.R.inc(80209);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pue1pueluszweey.R.inc(80210);Assert.assertEquals(2, result.size());
        __CLR4_1_101pue1pueluszweey.R.inc(80211);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101pue1pueluszweey.R.inc(80212);Assert.assertSame(entities.get(1), result.get(1));
    }finally{__CLR4_1_101pue1pueluszweey.R.flushNeeded();}}

    public void test_list_lt() throws Exception {__CLR4_1_101pue1pueluszweey.R.globalSliceStart(getClass().getName(),80213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fesc9p1pw5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pue1pueluszweey.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pue1pueluszweey.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_lt",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80213,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fesc9p1pw5() throws Exception{try{__CLR4_1_101pue1pueluszweey.R.inc(80213);
        __CLR4_1_101pue1pueluszweey.R.inc(80214);JSONPath path = new JSONPath("$[?(@.name < 'wenshao')]");
        
        __CLR4_1_101pue1pueluszweey.R.inc(80215);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pue1pueluszweey.R.inc(80216);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pue1pueluszweey.R.inc(80217);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pue1pueluszweey.R.inc(80218);entities.add(new Entity(1003, null));
        __CLR4_1_101pue1pueluszweey.R.inc(80219);entities.add(new Entity(null, null));
        
        __CLR4_1_101pue1pueluszweey.R.inc(80220);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pue1pueluszweey.R.inc(80221);Assert.assertEquals(1, result.size());
        __CLR4_1_101pue1pueluszweey.R.inc(80222);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101pue1pueluszweey.R.flushNeeded();}}
    
    public void test_list_le() throws Exception {__CLR4_1_101pue1pueluszweey.R.globalSliceStart(getClass().getName(),80223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106vc7uc1pwf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pue1pueluszweey.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pue1pueluszweey.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_le",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80223,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106vc7uc1pwf() throws Exception{try{__CLR4_1_101pue1pueluszweey.R.inc(80223);
        __CLR4_1_101pue1pueluszweey.R.inc(80224);JSONPath path = new JSONPath("$[name <= 'wenshao']");
        
        __CLR4_1_101pue1pueluszweey.R.inc(80225);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pue1pueluszweey.R.inc(80226);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pue1pueluszweey.R.inc(80227);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pue1pueluszweey.R.inc(80228);entities.add(new Entity(1003, null));
        __CLR4_1_101pue1pueluszweey.R.inc(80229);entities.add(new Entity(null, null));
        
        __CLR4_1_101pue1pueluszweey.R.inc(80230);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pue1pueluszweey.R.inc(80231);Assert.assertEquals(2, result.size());
        __CLR4_1_101pue1pueluszweey.R.inc(80232);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101pue1pueluszweey.R.inc(80233);Assert.assertSame(entities.get(1), result.get(1));
    }finally{__CLR4_1_101pue1pueluszweey.R.flushNeeded();}}
    
    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_1_101pue1pueluszweey.R.inc(80234);
            __CLR4_1_101pue1pueluszweey.R.inc(80235);this.id = id;
            __CLR4_1_101pue1pueluszweey.R.inc(80236);this.name = name;
        }finally{__CLR4_1_101pue1pueluszweey.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_1_101pue1pueluszweey.R.inc(80237);
            __CLR4_1_101pue1pueluszweey.R.inc(80238);return id;
        }finally{__CLR4_1_101pue1pueluszweey.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_1_101pue1pueluszweey.R.inc(80239);
            __CLR4_1_101pue1pueluszweey.R.inc(80240);this.id = id;
        }finally{__CLR4_1_101pue1pueluszweey.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101pue1pueluszweey.R.inc(80241);
            __CLR4_1_101pue1pueluszweey.R.inc(80242);return name;
        }finally{__CLR4_1_101pue1pueluszweey.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101pue1pueluszweey.R.inc(80243);
            __CLR4_1_101pue1pueluszweey.R.inc(80244);this.name = name;
        }finally{__CLR4_1_101pue1pueluszweey.R.flushNeeded();}}

    }
}
