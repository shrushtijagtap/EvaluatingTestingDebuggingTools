/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Bug_for_smoothrat5 extends TestCase {static class __CLR4_5_215kq15kqlusyjru1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,53910,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_map() throws Exception {__CLR4_5_215kq15kqlusyjru1.R.globalSliceStart(getClass().getName(),53882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aaqgyy15kq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215kq15kqlusyjru1.R.rethrow($CLV_t2$);}finally{__CLR4_5_215kq15kqlusyjru1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_smoothrat5.test_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53882,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aaqgyy15kq() throws Exception{try{__CLR4_5_215kq15kqlusyjru1.R.inc(53882);
        __CLR4_5_215kq15kqlusyjru1.R.inc(53883);Map<Object, Object> map = new LinkedHashMap<Object, Object>();
        __CLR4_5_215kq15kqlusyjru1.R.inc(53884);map.put(34L, "b");
        __CLR4_5_215kq15kqlusyjru1.R.inc(53885);map.put(12, "a");

        __CLR4_5_215kq15kqlusyjru1.R.inc(53886);Entity entity = new Entity();

        __CLR4_5_215kq15kqlusyjru1.R.inc(53887);entity.setValue(map);

        __CLR4_5_215kq15kqlusyjru1.R.inc(53888);String text = JSON.toJSONString(entity, SerializerFeature.WriteClassName);
        __CLR4_5_215kq15kqlusyjru1.R.inc(53889);System.out.println(text);
        __CLR4_5_215kq15kqlusyjru1.R.inc(53890);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_smoothrat5$Entity\",\"value\":{\"@type\":\"java.util.LinkedHashMap\",34L:\"b\",12:\"a\"}}",
                            text);

        __CLR4_5_215kq15kqlusyjru1.R.inc(53891);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_5_215kq15kqlusyjru1.R.inc(53892);Assert.assertEquals(map, entity2.getValue());
        __CLR4_5_215kq15kqlusyjru1.R.inc(53893);Assert.assertEquals(map.getClass(), entity2.getValue().getClass());
    }finally{__CLR4_5_215kq15kqlusyjru1.R.flushNeeded();}}
    
    public void test_treemap() throws Exception {__CLR4_5_215kq15kqlusyjru1.R.globalSliceStart(getClass().getName(),53894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lklnk815l2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215kq15kqlusyjru1.R.rethrow($CLV_t2$);}finally{__CLR4_5_215kq15kqlusyjru1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_smoothrat5.test_treemap",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53894,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lklnk815l2() throws Exception{try{__CLR4_5_215kq15kqlusyjru1.R.inc(53894);
        __CLR4_5_215kq15kqlusyjru1.R.inc(53895);TreeMap<Object, Object> map = new TreeMap<Object, Object>();
        __CLR4_5_215kq15kqlusyjru1.R.inc(53896);map.put(-34L, "b");
        __CLR4_5_215kq15kqlusyjru1.R.inc(53897);map.put(-56L, "a");
        

        __CLR4_5_215kq15kqlusyjru1.R.inc(53898);Entity entity = new Entity();

        __CLR4_5_215kq15kqlusyjru1.R.inc(53899);entity.setValue(map);

        __CLR4_5_215kq15kqlusyjru1.R.inc(53900);String text = JSON.toJSONString(entity, SerializerFeature.WriteClassName);
        __CLR4_5_215kq15kqlusyjru1.R.inc(53901);System.out.println(text);
        __CLR4_5_215kq15kqlusyjru1.R.inc(53902);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_smoothrat5$Entity\",\"value\":{\"@type\":\"java.util.TreeMap\",-56L:\"a\",-34L:\"b\"}}",
                            text);

        __CLR4_5_215kq15kqlusyjru1.R.inc(53903);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_5_215kq15kqlusyjru1.R.inc(53904);Assert.assertEquals(map, entity2.getValue());
        __CLR4_5_215kq15kqlusyjru1.R.inc(53905);Assert.assertEquals(map.getClass(), entity2.getValue().getClass());
    }finally{__CLR4_5_215kq15kqlusyjru1.R.flushNeeded();}}

    public static class Entity {

        private Object value;

        public Object getValue() {try{__CLR4_5_215kq15kqlusyjru1.R.inc(53906);
            __CLR4_5_215kq15kqlusyjru1.R.inc(53907);return value;
        }finally{__CLR4_5_215kq15kqlusyjru1.R.flushNeeded();}}

        public void setValue(Object value) {try{__CLR4_5_215kq15kqlusyjru1.R.inc(53908);
            __CLR4_5_215kq15kqlusyjru1.R.inc(53909);this.value = value;
        }finally{__CLR4_5_215kq15kqlusyjru1.R.flushNeeded();}}
    }
}
