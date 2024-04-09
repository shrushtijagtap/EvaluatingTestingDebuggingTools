/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_in_int extends TestCase {static class __CLR4_1_101p161p16lusqkikp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,79191,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_in() throws Exception {__CLR4_1_101p161p16lusqkikp.R.globalSliceStart(getClass().getName(),79098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hzv9b41p16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101p161p16lusqkikp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101p161p16lusqkikp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_int.test_list_in",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79098,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hzv9b41p16() throws Exception{try{__CLR4_1_101p161p16lusqkikp.R.inc(79098);
        __CLR4_1_101p161p16lusqkikp.R.inc(79099);JSONPath path = new JSONPath("[id in (1001)]");

        __CLR4_1_101p161p16lusqkikp.R.inc(79100);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101p161p16lusqkikp.R.inc(79101);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101p161p16lusqkikp.R.inc(79102);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101p161p16lusqkikp.R.inc(79103);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101p161p16lusqkikp.R.inc(79104);entities.add(new Entity(1004, null));

        __CLR4_1_101p161p16lusqkikp.R.inc(79105);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101p161p16lusqkikp.R.inc(79106);Assert.assertEquals(1, result.size());
        __CLR4_1_101p161p16lusqkikp.R.inc(79107);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101p161p16lusqkikp.R.flushNeeded();}}
    
    public void test_list_not_in() throws Exception {__CLR4_1_101p161p16lusqkikp.R.globalSliceStart(getClass().getName(),79108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10h2h7lg1p1g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101p161p16lusqkikp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101p161p16lusqkikp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_int.test_list_not_in",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79108,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10h2h7lg1p1g() throws Exception{try{__CLR4_1_101p161p16lusqkikp.R.inc(79108);
        __CLR4_1_101p161p16lusqkikp.R.inc(79109);JSONPath path = new JSONPath("[id not in (1001)]");

        __CLR4_1_101p161p16lusqkikp.R.inc(79110);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101p161p16lusqkikp.R.inc(79111);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101p161p16lusqkikp.R.inc(79112);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101p161p16lusqkikp.R.inc(79113);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101p161p16lusqkikp.R.inc(79114);entities.add(new Entity(1004, null));

        __CLR4_1_101p161p16lusqkikp.R.inc(79115);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101p161p16lusqkikp.R.inc(79116);Assert.assertEquals(3, result.size());
        __CLR4_1_101p161p16lusqkikp.R.inc(79117);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_1_101p161p16lusqkikp.R.inc(79118);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_1_101p161p16lusqkikp.R.inc(79119);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_1_101p161p16lusqkikp.R.flushNeeded();}}

    public void test_list_nin() throws Exception {__CLR4_1_101p161p16lusqkikp.R.globalSliceStart(getClass().getName(),79120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102v98621p1s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101p161p16lusqkikp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101p161p16lusqkikp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_int.test_list_nin",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79120,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102v98621p1s() throws Exception{try{__CLR4_1_101p161p16lusqkikp.R.inc(79120);
        __CLR4_1_101p161p16lusqkikp.R.inc(79121);JSONPath path = new JSONPath("[id nin (1001)]");

        __CLR4_1_101p161p16lusqkikp.R.inc(79122);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101p161p16lusqkikp.R.inc(79123);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101p161p16lusqkikp.R.inc(79124);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101p161p16lusqkikp.R.inc(79125);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101p161p16lusqkikp.R.inc(79126);entities.add(new Entity(1004, null));

        __CLR4_1_101p161p16lusqkikp.R.inc(79127);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101p161p16lusqkikp.R.inc(79128);Assert.assertEquals(3, result.size());
        __CLR4_1_101p161p16lusqkikp.R.inc(79129);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_1_101p161p16lusqkikp.R.inc(79130);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_1_101p161p16lusqkikp.R.inc(79131);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_1_101p161p16lusqkikp.R.flushNeeded();}}
    
    public void test_list_not_in_null() throws Exception {__CLR4_1_101p161p16lusqkikp.R.globalSliceStart(getClass().getName(),79132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1094kv0o1p24();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101p161p16lusqkikp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101p161p16lusqkikp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_int.test_list_not_in_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79132,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1094kv0o1p24() throws Exception{try{__CLR4_1_101p161p16lusqkikp.R.inc(79132);
        __CLR4_1_101p161p16lusqkikp.R.inc(79133);JSONPath path = new JSONPath("[id not in (null)]");
        
        __CLR4_1_101p161p16lusqkikp.R.inc(79134);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101p161p16lusqkikp.R.inc(79135);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101p161p16lusqkikp.R.inc(79136);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101p161p16lusqkikp.R.inc(79137);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101p161p16lusqkikp.R.inc(79138);entities.add(new Entity(1004, null));
        
        __CLR4_1_101p161p16lusqkikp.R.inc(79139);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101p161p16lusqkikp.R.inc(79140);Assert.assertEquals(4, result.size());
        __CLR4_1_101p161p16lusqkikp.R.inc(79141);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101p161p16lusqkikp.R.inc(79142);Assert.assertSame(entities.get(1), result.get(1));
        __CLR4_1_101p161p16lusqkikp.R.inc(79143);Assert.assertSame(entities.get(2), result.get(2));
        __CLR4_1_101p161p16lusqkikp.R.inc(79144);Assert.assertSame(entities.get(3), result.get(3));
    }finally{__CLR4_1_101p161p16lusqkikp.R.flushNeeded();}}
    
    public void test_list_in_2() throws Exception {__CLR4_1_101p161p16lusqkikp.R.globalSliceStart(getClass().getName(),79145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tm9n9p1p2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101p161p16lusqkikp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101p161p16lusqkikp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_int.test_list_in_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79145,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tm9n9p1p2h() throws Exception{try{__CLR4_1_101p161p16lusqkikp.R.inc(79145);
        __CLR4_1_101p161p16lusqkikp.R.inc(79146);JSONPath path = new JSONPath("[id in (1001, 1003)]");
        
        __CLR4_1_101p161p16lusqkikp.R.inc(79147);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101p161p16lusqkikp.R.inc(79148);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101p161p16lusqkikp.R.inc(79149);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101p161p16lusqkikp.R.inc(79150);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101p161p16lusqkikp.R.inc(79151);entities.add(new Entity(1004, null));
        
        __CLR4_1_101p161p16lusqkikp.R.inc(79152);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101p161p16lusqkikp.R.inc(79153);Assert.assertEquals(2, result.size());
        __CLR4_1_101p161p16lusqkikp.R.inc(79154);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101p161p16lusqkikp.R.inc(79155);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_1_101p161p16lusqkikp.R.flushNeeded();}}
    
    public void test_list_in_3() throws Exception {__CLR4_1_101p161p16lusqkikp.R.globalSliceStart(getClass().getName(),79156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qd9oh81p2s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101p161p16lusqkikp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101p161p16lusqkikp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_int.test_list_in_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79156,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qd9oh81p2s() throws Exception{try{__CLR4_1_101p161p16lusqkikp.R.inc(79156);
        __CLR4_1_101p161p16lusqkikp.R.inc(79157);JSONPath path = new JSONPath("[id in (1001, 1003, 1004)]");
        
        __CLR4_1_101p161p16lusqkikp.R.inc(79158);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101p161p16lusqkikp.R.inc(79159);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101p161p16lusqkikp.R.inc(79160);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101p161p16lusqkikp.R.inc(79161);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101p161p16lusqkikp.R.inc(79162);entities.add(new Entity(1004, null));
        
        __CLR4_1_101p161p16lusqkikp.R.inc(79163);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101p161p16lusqkikp.R.inc(79164);Assert.assertEquals(3, result.size());
        __CLR4_1_101p161p16lusqkikp.R.inc(79165);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101p161p16lusqkikp.R.inc(79166);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_1_101p161p16lusqkikp.R.inc(79167);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_1_101p161p16lusqkikp.R.flushNeeded();}}
    
    public void test_list_in_3_null() throws Exception {__CLR4_1_101p161p16lusqkikp.R.globalSliceStart(getClass().getName(),79168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ewx3sw1p34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101p161p16lusqkikp.R.rethrow($CLV_t2$);}finally{__CLR4_1_101p161p16lusqkikp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_int.test_list_in_3_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79168,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ewx3sw1p34() throws Exception{try{__CLR4_1_101p161p16lusqkikp.R.inc(79168);
        __CLR4_1_101p161p16lusqkikp.R.inc(79169);JSONPath path = new JSONPath("[id in (1001, 1003, null)]");
        
        __CLR4_1_101p161p16lusqkikp.R.inc(79170);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101p161p16lusqkikp.R.inc(79171);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101p161p16lusqkikp.R.inc(79172);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101p161p16lusqkikp.R.inc(79173);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101p161p16lusqkikp.R.inc(79174);entities.add(new Entity(null, null));
        
        __CLR4_1_101p161p16lusqkikp.R.inc(79175);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101p161p16lusqkikp.R.inc(79176);Assert.assertEquals(3, result.size());
        __CLR4_1_101p161p16lusqkikp.R.inc(79177);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101p161p16lusqkikp.R.inc(79178);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_1_101p161p16lusqkikp.R.inc(79179);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_1_101p161p16lusqkikp.R.flushNeeded();}}

    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_1_101p161p16lusqkikp.R.inc(79180);
            __CLR4_1_101p161p16lusqkikp.R.inc(79181);this.id = id;
            __CLR4_1_101p161p16lusqkikp.R.inc(79182);this.name = name;
        }finally{__CLR4_1_101p161p16lusqkikp.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_1_101p161p16lusqkikp.R.inc(79183);
            __CLR4_1_101p161p16lusqkikp.R.inc(79184);return id;
        }finally{__CLR4_1_101p161p16lusqkikp.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_1_101p161p16lusqkikp.R.inc(79185);
            __CLR4_1_101p161p16lusqkikp.R.inc(79186);this.id = id;
        }finally{__CLR4_1_101p161p16lusqkikp.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101p161p16lusqkikp.R.inc(79187);
            __CLR4_1_101p161p16lusqkikp.R.inc(79188);return name;
        }finally{__CLR4_1_101p161p16lusqkikp.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101p161p16lusqkikp.R.inc(79189);
            __CLR4_1_101p161p16lusqkikp.R.inc(79190);this.name = name;
        }finally{__CLR4_1_101p161p16lusqkikp.R.flushNeeded();}}

    }
}
