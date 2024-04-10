/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_in_int extends TestCase {static class __CLR4_5_21p0v1p0vlusyjukq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,79180,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_in() throws Exception {__CLR4_5_21p0v1p0vlusyjukq.R.globalSliceStart(getClass().getName(),79087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hzv9b41p0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p0v1p0vlusyjukq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p0v1p0vlusyjukq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_int.test_list_in",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79087,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hzv9b41p0v() throws Exception{try{__CLR4_5_21p0v1p0vlusyjukq.R.inc(79087);
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79088);JSONPath path = new JSONPath("[id in (1001)]");

        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79089);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79090);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79091);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79092);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79093);entities.add(new Entity(1004, null));

        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79094);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79095);Assert.assertEquals(1, result.size());
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79096);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_5_21p0v1p0vlusyjukq.R.flushNeeded();}}
    
    public void test_list_not_in() throws Exception {__CLR4_5_21p0v1p0vlusyjukq.R.globalSliceStart(getClass().getName(),79097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h2h7lg1p15();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p0v1p0vlusyjukq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p0v1p0vlusyjukq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_int.test_list_not_in",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79097,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h2h7lg1p15() throws Exception{try{__CLR4_5_21p0v1p0vlusyjukq.R.inc(79097);
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79098);JSONPath path = new JSONPath("[id not in (1001)]");

        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79099);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79100);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79101);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79102);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79103);entities.add(new Entity(1004, null));

        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79104);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79105);Assert.assertEquals(3, result.size());
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79106);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79107);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79108);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_5_21p0v1p0vlusyjukq.R.flushNeeded();}}

    public void test_list_nin() throws Exception {__CLR4_5_21p0v1p0vlusyjukq.R.globalSliceStart(getClass().getName(),79109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22v98621p1h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p0v1p0vlusyjukq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p0v1p0vlusyjukq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_int.test_list_nin",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79109,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22v98621p1h() throws Exception{try{__CLR4_5_21p0v1p0vlusyjukq.R.inc(79109);
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79110);JSONPath path = new JSONPath("[id nin (1001)]");

        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79111);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79112);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79113);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79114);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79115);entities.add(new Entity(1004, null));

        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79116);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79117);Assert.assertEquals(3, result.size());
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79118);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79119);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79120);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_5_21p0v1p0vlusyjukq.R.flushNeeded();}}
    
    public void test_list_not_in_null() throws Exception {__CLR4_5_21p0v1p0vlusyjukq.R.globalSliceStart(getClass().getName(),79121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_294kv0o1p1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p0v1p0vlusyjukq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p0v1p0vlusyjukq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_int.test_list_not_in_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79121,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_294kv0o1p1t() throws Exception{try{__CLR4_5_21p0v1p0vlusyjukq.R.inc(79121);
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79122);JSONPath path = new JSONPath("[id not in (null)]");
        
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79123);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79124);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79125);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79126);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79127);entities.add(new Entity(1004, null));
        
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79128);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79129);Assert.assertEquals(4, result.size());
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79130);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79131);Assert.assertSame(entities.get(1), result.get(1));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79132);Assert.assertSame(entities.get(2), result.get(2));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79133);Assert.assertSame(entities.get(3), result.get(3));
    }finally{__CLR4_5_21p0v1p0vlusyjukq.R.flushNeeded();}}
    
    public void test_list_in_2() throws Exception {__CLR4_5_21p0v1p0vlusyjukq.R.globalSliceStart(getClass().getName(),79134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tm9n9p1p26();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p0v1p0vlusyjukq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p0v1p0vlusyjukq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_int.test_list_in_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79134,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tm9n9p1p26() throws Exception{try{__CLR4_5_21p0v1p0vlusyjukq.R.inc(79134);
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79135);JSONPath path = new JSONPath("[id in (1001, 1003)]");
        
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79136);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79137);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79138);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79139);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79140);entities.add(new Entity(1004, null));
        
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79141);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79142);Assert.assertEquals(2, result.size());
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79143);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79144);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_5_21p0v1p0vlusyjukq.R.flushNeeded();}}
    
    public void test_list_in_3() throws Exception {__CLR4_5_21p0v1p0vlusyjukq.R.globalSliceStart(getClass().getName(),79145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qd9oh81p2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p0v1p0vlusyjukq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p0v1p0vlusyjukq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_int.test_list_in_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79145,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qd9oh81p2h() throws Exception{try{__CLR4_5_21p0v1p0vlusyjukq.R.inc(79145);
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79146);JSONPath path = new JSONPath("[id in (1001, 1003, 1004)]");
        
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79147);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79148);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79149);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79150);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79151);entities.add(new Entity(1004, null));
        
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79152);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79153);Assert.assertEquals(3, result.size());
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79154);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79155);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79156);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_5_21p0v1p0vlusyjukq.R.flushNeeded();}}
    
    public void test_list_in_3_null() throws Exception {__CLR4_5_21p0v1p0vlusyjukq.R.globalSliceStart(getClass().getName(),79157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ewx3sw1p2t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21p0v1p0vlusyjukq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21p0v1p0vlusyjukq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_int.test_list_in_3_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79157,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ewx3sw1p2t() throws Exception{try{__CLR4_5_21p0v1p0vlusyjukq.R.inc(79157);
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79158);JSONPath path = new JSONPath("[id in (1001, 1003, null)]");
        
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79159);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79160);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79161);entities.add(new Entity(1002, "wenshao"));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79162);entities.add(new Entity(1003, "yakolee"));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79163);entities.add(new Entity(null, null));
        
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79164);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79165);Assert.assertEquals(3, result.size());
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79166);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79167);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_5_21p0v1p0vlusyjukq.R.inc(79168);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_5_21p0v1p0vlusyjukq.R.flushNeeded();}}

    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_5_21p0v1p0vlusyjukq.R.inc(79169);
            __CLR4_5_21p0v1p0vlusyjukq.R.inc(79170);this.id = id;
            __CLR4_5_21p0v1p0vlusyjukq.R.inc(79171);this.name = name;
        }finally{__CLR4_5_21p0v1p0vlusyjukq.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_5_21p0v1p0vlusyjukq.R.inc(79172);
            __CLR4_5_21p0v1p0vlusyjukq.R.inc(79173);return id;
        }finally{__CLR4_5_21p0v1p0vlusyjukq.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_5_21p0v1p0vlusyjukq.R.inc(79174);
            __CLR4_5_21p0v1p0vlusyjukq.R.inc(79175);this.id = id;
        }finally{__CLR4_5_21p0v1p0vlusyjukq.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21p0v1p0vlusyjukq.R.inc(79176);
            __CLR4_5_21p0v1p0vlusyjukq.R.inc(79177);return name;
        }finally{__CLR4_5_21p0v1p0vlusyjukq.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21p0v1p0vlusyjukq.R.inc(79178);
            __CLR4_5_21p0v1p0vlusyjukq.R.inc(79179);this.name = name;
        }finally{__CLR4_5_21p0v1p0vlusyjukq.R.flushNeeded();}}

    }
}
