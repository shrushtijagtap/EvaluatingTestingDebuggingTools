/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_field_access_filter_in_int extends TestCase {static class __CLR4_1_101pze1pzeluszwei3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,80423,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list_in() throws Exception {__CLR4_1_101pze1pzeluszwei3.R.globalSliceStart(getClass().getName(),80330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hzv9b41pze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pze1pzeluszwei3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pze1pzeluszwei3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_int.test_list_in",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80330,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hzv9b41pze() throws Exception{try{__CLR4_1_101pze1pzeluszwei3.R.inc(80330);
        __CLR4_1_101pze1pzeluszwei3.R.inc(80331);JSONPath path = new JSONPath("[id in (1001)]");

        __CLR4_1_101pze1pzeluszwei3.R.inc(80332);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pze1pzeluszwei3.R.inc(80333);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80334);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80335);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80336);entities.add(new Entity(1004, null));

        __CLR4_1_101pze1pzeluszwei3.R.inc(80337);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pze1pzeluszwei3.R.inc(80338);Assert.assertEquals(1, result.size());
        __CLR4_1_101pze1pzeluszwei3.R.inc(80339);Assert.assertSame(entities.get(0), result.get(0));
    }finally{__CLR4_1_101pze1pzeluszwei3.R.flushNeeded();}}
    
    public void test_list_not_in() throws Exception {__CLR4_1_101pze1pzeluszwei3.R.globalSliceStart(getClass().getName(),80340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10h2h7lg1pzo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pze1pzeluszwei3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pze1pzeluszwei3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_int.test_list_not_in",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80340,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10h2h7lg1pzo() throws Exception{try{__CLR4_1_101pze1pzeluszwei3.R.inc(80340);
        __CLR4_1_101pze1pzeluszwei3.R.inc(80341);JSONPath path = new JSONPath("[id not in (1001)]");

        __CLR4_1_101pze1pzeluszwei3.R.inc(80342);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pze1pzeluszwei3.R.inc(80343);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80344);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80345);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80346);entities.add(new Entity(1004, null));

        __CLR4_1_101pze1pzeluszwei3.R.inc(80347);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pze1pzeluszwei3.R.inc(80348);Assert.assertEquals(3, result.size());
        __CLR4_1_101pze1pzeluszwei3.R.inc(80349);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80350);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80351);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_1_101pze1pzeluszwei3.R.flushNeeded();}}

    public void test_list_nin() throws Exception {__CLR4_1_101pze1pzeluszwei3.R.globalSliceStart(getClass().getName(),80352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102v98621q00();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pze1pzeluszwei3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pze1pzeluszwei3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_int.test_list_nin",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80352,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102v98621q00() throws Exception{try{__CLR4_1_101pze1pzeluszwei3.R.inc(80352);
        __CLR4_1_101pze1pzeluszwei3.R.inc(80353);JSONPath path = new JSONPath("[id nin (1001)]");

        __CLR4_1_101pze1pzeluszwei3.R.inc(80354);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pze1pzeluszwei3.R.inc(80355);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80356);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80357);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80358);entities.add(new Entity(1004, null));

        __CLR4_1_101pze1pzeluszwei3.R.inc(80359);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pze1pzeluszwei3.R.inc(80360);Assert.assertEquals(3, result.size());
        __CLR4_1_101pze1pzeluszwei3.R.inc(80361);Assert.assertSame(entities.get(1), result.get(0));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80362);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80363);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_1_101pze1pzeluszwei3.R.flushNeeded();}}
    
    public void test_list_not_in_null() throws Exception {__CLR4_1_101pze1pzeluszwei3.R.globalSliceStart(getClass().getName(),80364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1094kv0o1q0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pze1pzeluszwei3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pze1pzeluszwei3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_int.test_list_not_in_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80364,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1094kv0o1q0c() throws Exception{try{__CLR4_1_101pze1pzeluszwei3.R.inc(80364);
        __CLR4_1_101pze1pzeluszwei3.R.inc(80365);JSONPath path = new JSONPath("[id not in (null)]");
        
        __CLR4_1_101pze1pzeluszwei3.R.inc(80366);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pze1pzeluszwei3.R.inc(80367);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80368);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80369);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80370);entities.add(new Entity(1004, null));
        
        __CLR4_1_101pze1pzeluszwei3.R.inc(80371);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pze1pzeluszwei3.R.inc(80372);Assert.assertEquals(4, result.size());
        __CLR4_1_101pze1pzeluszwei3.R.inc(80373);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80374);Assert.assertSame(entities.get(1), result.get(1));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80375);Assert.assertSame(entities.get(2), result.get(2));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80376);Assert.assertSame(entities.get(3), result.get(3));
    }finally{__CLR4_1_101pze1pzeluszwei3.R.flushNeeded();}}
    
    public void test_list_in_2() throws Exception {__CLR4_1_101pze1pzeluszwei3.R.globalSliceStart(getClass().getName(),80377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tm9n9p1q0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pze1pzeluszwei3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pze1pzeluszwei3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_int.test_list_in_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80377,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tm9n9p1q0p() throws Exception{try{__CLR4_1_101pze1pzeluszwei3.R.inc(80377);
        __CLR4_1_101pze1pzeluszwei3.R.inc(80378);JSONPath path = new JSONPath("[id in (1001, 1003)]");
        
        __CLR4_1_101pze1pzeluszwei3.R.inc(80379);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pze1pzeluszwei3.R.inc(80380);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80381);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80382);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80383);entities.add(new Entity(1004, null));
        
        __CLR4_1_101pze1pzeluszwei3.R.inc(80384);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pze1pzeluszwei3.R.inc(80385);Assert.assertEquals(2, result.size());
        __CLR4_1_101pze1pzeluszwei3.R.inc(80386);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80387);Assert.assertSame(entities.get(2), result.get(1));
    }finally{__CLR4_1_101pze1pzeluszwei3.R.flushNeeded();}}
    
    public void test_list_in_3() throws Exception {__CLR4_1_101pze1pzeluszwei3.R.globalSliceStart(getClass().getName(),80388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qd9oh81q10();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pze1pzeluszwei3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pze1pzeluszwei3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_int.test_list_in_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80388,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qd9oh81q10() throws Exception{try{__CLR4_1_101pze1pzeluszwei3.R.inc(80388);
        __CLR4_1_101pze1pzeluszwei3.R.inc(80389);JSONPath path = new JSONPath("[id in (1001, 1003, 1004)]");
        
        __CLR4_1_101pze1pzeluszwei3.R.inc(80390);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pze1pzeluszwei3.R.inc(80391);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80392);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80393);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80394);entities.add(new Entity(1004, null));
        
        __CLR4_1_101pze1pzeluszwei3.R.inc(80395);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pze1pzeluszwei3.R.inc(80396);Assert.assertEquals(3, result.size());
        __CLR4_1_101pze1pzeluszwei3.R.inc(80397);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80398);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80399);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_1_101pze1pzeluszwei3.R.flushNeeded();}}
    
    public void test_list_in_3_null() throws Exception {__CLR4_1_101pze1pzeluszwei3.R.globalSliceStart(getClass().getName(),80400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ewx3sw1q1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pze1pzeluszwei3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pze1pzeluszwei3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_field_access_filter_in_int.test_list_in_3_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80400,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ewx3sw1q1c() throws Exception{try{__CLR4_1_101pze1pzeluszwei3.R.inc(80400);
        __CLR4_1_101pze1pzeluszwei3.R.inc(80401);JSONPath path = new JSONPath("[id in (1001, 1003, null)]");
        
        __CLR4_1_101pze1pzeluszwei3.R.inc(80402);List<Entity> entities = new ArrayList<Entity>();
        __CLR4_1_101pze1pzeluszwei3.R.inc(80403);entities.add(new Entity(1001, "ljw2083"));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80404);entities.add(new Entity(1002, "wenshao"));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80405);entities.add(new Entity(1003, "yakolee"));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80406);entities.add(new Entity(null, null));
        
        __CLR4_1_101pze1pzeluszwei3.R.inc(80407);List<Object> result = (List<Object>) path.eval(entities);
        __CLR4_1_101pze1pzeluszwei3.R.inc(80408);Assert.assertEquals(3, result.size());
        __CLR4_1_101pze1pzeluszwei3.R.inc(80409);Assert.assertSame(entities.get(0), result.get(0));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80410);Assert.assertSame(entities.get(2), result.get(1));
        __CLR4_1_101pze1pzeluszwei3.R.inc(80411);Assert.assertSame(entities.get(3), result.get(2));
    }finally{__CLR4_1_101pze1pzeluszwei3.R.flushNeeded();}}

    public static class Entity {

        private Integer id;
        private String  name;

        public Entity(Integer id, String name){try{__CLR4_1_101pze1pzeluszwei3.R.inc(80412);
            __CLR4_1_101pze1pzeluszwei3.R.inc(80413);this.id = id;
            __CLR4_1_101pze1pzeluszwei3.R.inc(80414);this.name = name;
        }finally{__CLR4_1_101pze1pzeluszwei3.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_1_101pze1pzeluszwei3.R.inc(80415);
            __CLR4_1_101pze1pzeluszwei3.R.inc(80416);return id;
        }finally{__CLR4_1_101pze1pzeluszwei3.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_1_101pze1pzeluszwei3.R.inc(80417);
            __CLR4_1_101pze1pzeluszwei3.R.inc(80418);this.id = id;
        }finally{__CLR4_1_101pze1pzeluszwei3.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101pze1pzeluszwei3.R.inc(80419);
            __CLR4_1_101pze1pzeluszwei3.R.inc(80420);return name;
        }finally{__CLR4_1_101pze1pzeluszwei3.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101pze1pzeluszwei3.R.inc(80421);
            __CLR4_1_101pze1pzeluszwei3.R.inc(80422);this.name = name;
        }finally{__CLR4_1_101pze1pzeluszwei3.R.flushNeeded();}}

    }
}
