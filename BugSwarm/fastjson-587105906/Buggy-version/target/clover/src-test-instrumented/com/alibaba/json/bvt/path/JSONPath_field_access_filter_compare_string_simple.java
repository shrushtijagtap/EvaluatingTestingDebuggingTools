/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_compare_string_simple extends TestCase {static class __CLR4_1_101ow61ow6lusqkiif{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,79013,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_eq() throws Exception {__CLR4_1_101ow61ow6lusqkiif.R.globalSliceStart(getClass().getName(),78918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10k3geih1ow6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ow61ow6lusqkiif.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ow61ow6lusqkiif.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_eq",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78918,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10k3geih1ow6() throws Exception{try{__CLR4_1_101ow61ow6lusqkiif.R.inc(78918);
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78919);JSONPath path = new JSONPath("[name = 'ljw2083']");

        __CLR4_1_101ow61ow6lusqkiif.R.inc(78920);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78921);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78922);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78923);entities.add(new Entity(1003, null));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78924);entities.add(new Entity(null, null));

        __CLR4_1_101ow61ow6lusqkiif.R.inc(78925);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78926);Assert.assertEquals(1, result.size());
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78927);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101ow61ow6lusqkiif.R.flushNeeded();}}
    
    public void test_list_eq_x() throws Exception {__CLR4_1_101ow61ow6lusqkiif.R.globalSliceStart(getClass().getName(),78928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10u058ps1owg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ow61ow6lusqkiif.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ow61ow6lusqkiif.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_eq_x",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78928,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10u058ps1owg() throws Exception{try{__CLR4_1_101ow61ow6lusqkiif.R.inc(78928);
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78929);JSONPath path = new JSONPath("[name = 'ljw2083']");
        
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78930);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78931);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78932);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78933);entities.add(new Entity(1003, null));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78934);entities.add(new Entity(null, null));
        
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78935);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78936);Assert.assertEquals(1, result.size());
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78937);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101ow61ow6lusqkiif.R.flushNeeded();}}
    
    public void test_list_eq_null() throws Exception {__CLR4_1_101ow61ow6lusqkiif.R.globalSliceStart(getClass().getName(),78938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rq8m991owq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ow61ow6lusqkiif.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ow61ow6lusqkiif.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_eq_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78938,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rq8m991owq() throws Exception{try{__CLR4_1_101ow61ow6lusqkiif.R.inc(78938);
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78939);JSONPath path = new JSONPath("$[name = null]");

        __CLR4_1_101ow61ow6lusqkiif.R.inc(78940);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78941);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78942);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78943);entities.add(new Entity(1003, null));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78944);entities.add(new Entity(null, null));

        __CLR4_1_101ow61ow6lusqkiif.R.inc(78945);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78946);Assert.assertEquals(2, result.size());
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78947);Assert.assertSame(entities.get(2), result.get(0));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78948);Assert.assertSame(entities.get(3), result.get(1));
    }finally{__CLR4_1_101ow61ow6lusqkiif.R.flushNeeded();}}
    
    public void test_list_not_null() throws Exception {__CLR4_1_101ow61ow6lusqkiif.R.globalSliceStart(getClass().getName(),78949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10sc0x2m1ox1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ow61ow6lusqkiif.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ow61ow6lusqkiif.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_not_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78949,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10sc0x2m1ox1() throws Exception{try{__CLR4_1_101ow61ow6lusqkiif.R.inc(78949);
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78950);JSONPath path = new JSONPath("$[name != null]");
        
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78951);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78952);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78953);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78954);entities.add(new Entity(1003, null));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78955);entities.add(new Entity(null, null));
        
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78956);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78957);Assert.assertEquals(2, result.size());
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78958);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78959);Assert.assertSame(entities.get(1), result.get(1));
    }finally{__CLR4_1_101ow61ow6lusqkiif.R.flushNeeded();}}
    
    public void test_list_gt() throws Exception {__CLR4_1_101ow61ow6lusqkiif.R.globalSliceStart(getClass().getName(),78960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lxur141oxc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ow61ow6lusqkiif.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ow61ow6lusqkiif.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_gt",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78960,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lxur141oxc() throws Exception{try{__CLR4_1_101ow61ow6lusqkiif.R.inc(78960);
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78961);JSONPath path = new JSONPath("$[name > 'ljw2083']");
        
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78962);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78963);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78964);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78965);entities.add(new Entity(1003, null));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78966);entities.add(new Entity(null, null));
        
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78967);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78968);Assert.assertEquals(1, result.size());
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78969);Assert.assertSame(entities.get(1), result.get(0));
    }finally{__CLR4_1_101ow61ow6lusqkiif.R.flushNeeded();}}
    
    public void test_list_ge() throws Exception {__CLR4_1_101ow61ow6lusqkiif.R.globalSliceStart(getClass().getName(),78970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c9t2x1oxm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ow61ow6lusqkiif.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ow61ow6lusqkiif.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_ge",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78970,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c9t2x1oxm() throws Exception{try{__CLR4_1_101ow61ow6lusqkiif.R.inc(78970);
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78971);JSONPath path = new JSONPath("$[name >= 'ljw2083']");
        
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78972);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78973);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78974);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78975);entities.add(new Entity(1003, null));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78976);entities.add(new Entity(null, null));
        
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78977);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78978);Assert.assertEquals(2, result.size());
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78979);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78980);Assert.assertSame(entities.get(1), result.get(1));
    }finally{__CLR4_1_101ow61ow6lusqkiif.R.flushNeeded();}}

    public void test_list_lt() throws Exception {__CLR4_1_101ow61ow6lusqkiif.R.globalSliceStart(getClass().getName(),78981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fesc9p1oxx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ow61ow6lusqkiif.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ow61ow6lusqkiif.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_lt",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78981,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fesc9p1oxx() throws Exception{try{__CLR4_1_101ow61ow6lusqkiif.R.inc(78981);
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78982);JSONPath path = new JSONPath("$[?(@.name < 'wenshao')]");
        
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78983);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78984);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78985);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78986);entities.add(new Entity(1003, null));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78987);entities.add(new Entity(null, null));
        
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78988);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78989);Assert.assertEquals(1, result.size());
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78990);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101ow61ow6lusqkiif.R.flushNeeded();}}
    
    public void test_list_le() throws Exception {__CLR4_1_101ow61ow6lusqkiif.R.globalSliceStart(getClass().getName(),78991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106vc7uc1oy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ow61ow6lusqkiif.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ow61ow6lusqkiif.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_compare_string_simple.test_list_le",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78991,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106vc7uc1oy7() throws Exception{try{__CLR4_1_101ow61ow6lusqkiif.R.inc(78991);
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78992);JSONPath path = new JSONPath("$[name <= 'wenshao']");
        
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78993);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78994);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78995);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78996);entities.add(new Entity(1003, null));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78997);entities.add(new Entity(null, null));
        
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78998);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101ow61ow6lusqkiif.R.inc(78999);Assert.assertEquals(2, result.size());
        __CLR4_1_101ow61ow6lusqkiif.R.inc(79000);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101ow61ow6lusqkiif.R.inc(79001);Assert.assertSame(entities.get(1), result.get(1));
    }finally{__CLR4_1_101ow61ow6lusqkiif.R.flushNeeded();}}
    
    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_1_101ow61ow6lusqkiif.R.inc(79002);
            __CLR4_1_101ow61ow6lusqkiif.R.inc(79003);this.id = id;
            __CLR4_1_101ow61ow6lusqkiif.R.inc(79004);this.name = name;
        }finally{__CLR4_1_101ow61ow6lusqkiif.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_1_101ow61ow6lusqkiif.R.inc(79005);
            __CLR4_1_101ow61ow6lusqkiif.R.inc(79006);return id;
        }finally{__CLR4_1_101ow61ow6lusqkiif.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_1_101ow61ow6lusqkiif.R.inc(79007);
            __CLR4_1_101ow61ow6lusqkiif.R.inc(79008);this.id = id;
        }finally{__CLR4_1_101ow61ow6lusqkiif.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101ow61ow6lusqkiif.R.inc(79009);
            __CLR4_1_101ow61ow6lusqkiif.R.inc(79010);return name;
        }finally{__CLR4_1_101ow61ow6lusqkiif.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101ow61ow6lusqkiif.R.inc(79011);
            __CLR4_1_101ow61ow6lusqkiif.R.inc(79012);this.name = name;
        }finally{__CLR4_1_101ow61ow6lusqkiif.R.flushNeeded();}}

    }
}
