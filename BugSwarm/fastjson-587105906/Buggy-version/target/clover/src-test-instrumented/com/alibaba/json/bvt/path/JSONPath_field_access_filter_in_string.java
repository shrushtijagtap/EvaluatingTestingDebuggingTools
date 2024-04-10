/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_in_string extends TestCase {static class __CLR4_1_101q1z1q1zluszweij{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,80479,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_in() throws Exception {__CLR4_1_101q1z1q1zluszweij.R.globalSliceStart(getClass().getName(),80423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hzv9b41q1z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q1z1q1zluszweij.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q1z1q1zluszweij.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_string.test_list_in",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80423,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hzv9b41q1z() throws Exception{try{__CLR4_1_101q1z1q1zluszweij.R.inc(80423);
        __CLR4_1_101q1z1q1zluszweij.R.inc(80424);JSONPath path = new JSONPath("[name in ('ljw2083')]");

        __CLR4_1_101q1z1q1zluszweij.R.inc(80425);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q1z1q1zluszweij.R.inc(80426);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q1z1q1zluszweij.R.inc(80427);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q1z1q1zluszweij.R.inc(80428);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q1z1q1zluszweij.R.inc(80429);entities.add(new Entity(1004, null));

        __CLR4_1_101q1z1q1zluszweij.R.inc(80430);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q1z1q1zluszweij.R.inc(80431);Assert.assertEquals(1, result.size());
        __CLR4_1_101q1z1q1zluszweij.R.inc(80432);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101q1z1q1zluszweij.R.flushNeeded();}}
    
    public void test_list_not_in() throws Exception {__CLR4_1_101q1z1q1zluszweij.R.globalSliceStart(getClass().getName(),80433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10h2h7lg1q29();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q1z1q1zluszweij.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q1z1q1zluszweij.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_string.test_list_not_in",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80433,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10h2h7lg1q29() throws Exception{try{__CLR4_1_101q1z1q1zluszweij.R.inc(80433);
        __CLR4_1_101q1z1q1zluszweij.R.inc(80434);JSONPath path = new JSONPath("[name not in ('ljw2083')]");
        
        __CLR4_1_101q1z1q1zluszweij.R.inc(80435);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q1z1q1zluszweij.R.inc(80436);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q1z1q1zluszweij.R.inc(80437);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q1z1q1zluszweij.R.inc(80438);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q1z1q1zluszweij.R.inc(80439);entities.add(new Entity(1004, null));
        
        __CLR4_1_101q1z1q1zluszweij.R.inc(80440);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q1z1q1zluszweij.R.inc(80441);Assert.assertEquals(3, result.size());
        __CLR4_1_101q1z1q1zluszweij.R.inc(80442);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_1_101q1z1q1zluszweij.R.inc(80443);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_1_101q1z1q1zluszweij.R.inc(80444);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_1_101q1z1q1zluszweij.R.flushNeeded();}}
    
    public void test_list_in_2() throws Exception {__CLR4_1_101q1z1q1zluszweij.R.globalSliceStart(getClass().getName(),80445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tm9n9p1q2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q1z1q1zluszweij.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q1z1q1zluszweij.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_string.test_list_in_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80445,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tm9n9p1q2l() throws Exception{try{__CLR4_1_101q1z1q1zluszweij.R.inc(80445);
        __CLR4_1_101q1z1q1zluszweij.R.inc(80446);JSONPath path = new JSONPath("[name in ('ljw2083', 'yakolee')]");
        
        __CLR4_1_101q1z1q1zluszweij.R.inc(80447);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q1z1q1zluszweij.R.inc(80448);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q1z1q1zluszweij.R.inc(80449);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q1z1q1zluszweij.R.inc(80450);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q1z1q1zluszweij.R.inc(80451);entities.add(new Entity(1004, null));
        
        __CLR4_1_101q1z1q1zluszweij.R.inc(80452);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q1z1q1zluszweij.R.inc(80453);Assert.assertEquals(2, result.size());
        __CLR4_1_101q1z1q1zluszweij.R.inc(80454);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101q1z1q1zluszweij.R.inc(80455);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_1_101q1z1q1zluszweij.R.flushNeeded();}}
    
    public void test_list_in_3() throws Exception {__CLR4_1_101q1z1q1zluszweij.R.globalSliceStart(getClass().getName(),80456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qd9oh81q2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101q1z1q1zluszweij.R.rethrow($CLV_t2$);}finally{__CLR4_1_101q1z1q1zluszweij.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_string.test_list_in_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80456,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qd9oh81q2w() throws Exception{try{__CLR4_1_101q1z1q1zluszweij.R.inc(80456);
        __CLR4_1_101q1z1q1zluszweij.R.inc(80457);JSONPath path = new JSONPath("[name in ('ljw2083', 'yakolee',null)]");
        
        __CLR4_1_101q1z1q1zluszweij.R.inc(80458);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101q1z1q1zluszweij.R.inc(80459);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101q1z1q1zluszweij.R.inc(80460);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101q1z1q1zluszweij.R.inc(80461);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101q1z1q1zluszweij.R.inc(80462);entities.add(new Entity(1004, null));
        
        __CLR4_1_101q1z1q1zluszweij.R.inc(80463);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101q1z1q1zluszweij.R.inc(80464);Assert.assertEquals(3, result.size());
        __CLR4_1_101q1z1q1zluszweij.R.inc(80465);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101q1z1q1zluszweij.R.inc(80466);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_1_101q1z1q1zluszweij.R.inc(80467);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_1_101q1z1q1zluszweij.R.flushNeeded();}}

    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_1_101q1z1q1zluszweij.R.inc(80468);
            __CLR4_1_101q1z1q1zluszweij.R.inc(80469);this.id = id;
            __CLR4_1_101q1z1q1zluszweij.R.inc(80470);this.name = name;
        }finally{__CLR4_1_101q1z1q1zluszweij.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_1_101q1z1q1zluszweij.R.inc(80471);
            __CLR4_1_101q1z1q1zluszweij.R.inc(80472);return id;
        }finally{__CLR4_1_101q1z1q1zluszweij.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_1_101q1z1q1zluszweij.R.inc(80473);
            __CLR4_1_101q1z1q1zluszweij.R.inc(80474);this.id = id;
        }finally{__CLR4_1_101q1z1q1zluszweij.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101q1z1q1zluszweij.R.inc(80475);
            __CLR4_1_101q1z1q1zluszweij.R.inc(80476);return name;
        }finally{__CLR4_1_101q1z1q1zluszweij.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101q1z1q1zluszweij.R.inc(80477);
            __CLR4_1_101q1z1q1zluszweij.R.inc(80478);this.name = name;
        }finally{__CLR4_1_101q1z1q1zluszweij.R.flushNeeded();}}

    }
}
