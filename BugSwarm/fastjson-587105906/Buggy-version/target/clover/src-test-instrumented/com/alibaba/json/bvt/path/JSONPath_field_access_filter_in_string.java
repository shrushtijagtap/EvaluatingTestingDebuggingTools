/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_in_string extends TestCase {static class __CLR4_1_101p3r1p3rlusqkilb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,79247,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_in() throws Exception {__CLR4_1_101p3r1p3rlusqkilb.R.globalSliceStart(getClass().getName(),79191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hzv9b41p3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101p3r1p3rlusqkilb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101p3r1p3rlusqkilb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_string.test_list_in",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79191,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hzv9b41p3r() throws Exception{try{__CLR4_1_101p3r1p3rlusqkilb.R.inc(79191);
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79192);JSONPath path = new JSONPath("[name in ('ljw2083')]");

        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79193);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79194);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79195);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79196);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79197);entities.add(new Entity(1004, null));

        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79198);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79199);Assert.assertEquals(1, result.size());
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79200);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101p3r1p3rlusqkilb.R.flushNeeded();}}
    
    public void test_list_not_in() throws Exception {__CLR4_1_101p3r1p3rlusqkilb.R.globalSliceStart(getClass().getName(),79201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10h2h7lg1p41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101p3r1p3rlusqkilb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101p3r1p3rlusqkilb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_string.test_list_not_in",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79201,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10h2h7lg1p41() throws Exception{try{__CLR4_1_101p3r1p3rlusqkilb.R.inc(79201);
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79202);JSONPath path = new JSONPath("[name not in ('ljw2083')]");
        
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79203);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79204);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79205);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79206);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79207);entities.add(new Entity(1004, null));
        
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79208);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79209);Assert.assertEquals(3, result.size());
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79210);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79211);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79212);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_1_101p3r1p3rlusqkilb.R.flushNeeded();}}
    
    public void test_list_in_2() throws Exception {__CLR4_1_101p3r1p3rlusqkilb.R.globalSliceStart(getClass().getName(),79213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tm9n9p1p4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101p3r1p3rlusqkilb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101p3r1p3rlusqkilb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_string.test_list_in_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79213,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tm9n9p1p4d() throws Exception{try{__CLR4_1_101p3r1p3rlusqkilb.R.inc(79213);
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79214);JSONPath path = new JSONPath("[name in ('ljw2083', 'yakolee')]");
        
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79215);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79216);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79217);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79218);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79219);entities.add(new Entity(1004, null));
        
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79220);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79221);Assert.assertEquals(2, result.size());
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79222);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79223);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_1_101p3r1p3rlusqkilb.R.flushNeeded();}}
    
    public void test_list_in_3() throws Exception {__CLR4_1_101p3r1p3rlusqkilb.R.globalSliceStart(getClass().getName(),79224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qd9oh81p4o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101p3r1p3rlusqkilb.R.rethrow($CLV_t2$);}finally{__CLR4_1_101p3r1p3rlusqkilb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_string.test_list_in_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79224,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qd9oh81p4o() throws Exception{try{__CLR4_1_101p3r1p3rlusqkilb.R.inc(79224);
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79225);JSONPath path = new JSONPath("[name in ('ljw2083', 'yakolee',null)]");
        
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79226);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79227);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79228);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79229);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79230);entities.add(new Entity(1004, null));
        
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79231);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79232);Assert.assertEquals(3, result.size());
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79233);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79234);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_1_101p3r1p3rlusqkilb.R.inc(79235);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_1_101p3r1p3rlusqkilb.R.flushNeeded();}}

    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_1_101p3r1p3rlusqkilb.R.inc(79236);
            __CLR4_1_101p3r1p3rlusqkilb.R.inc(79237);this.id = id;
            __CLR4_1_101p3r1p3rlusqkilb.R.inc(79238);this.name = name;
        }finally{__CLR4_1_101p3r1p3rlusqkilb.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_1_101p3r1p3rlusqkilb.R.inc(79239);
            __CLR4_1_101p3r1p3rlusqkilb.R.inc(79240);return id;
        }finally{__CLR4_1_101p3r1p3rlusqkilb.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_1_101p3r1p3rlusqkilb.R.inc(79241);
            __CLR4_1_101p3r1p3rlusqkilb.R.inc(79242);this.id = id;
        }finally{__CLR4_1_101p3r1p3rlusqkilb.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101p3r1p3rlusqkilb.R.inc(79243);
            __CLR4_1_101p3r1p3rlusqkilb.R.inc(79244);return name;
        }finally{__CLR4_1_101p3r1p3rlusqkilb.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101p3r1p3rlusqkilb.R.inc(79245);
            __CLR4_1_101p3r1p3rlusqkilb.R.inc(79246);this.name = name;
        }finally{__CLR4_1_101p3r1p3rlusqkilb.R.flushNeeded();}}

    }
}
