/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.creator;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.ParserConfig;

import junit.framework.TestCase;

public class JSONCreatorTest_float_obj extends TestCase {static class __CLR4_5_21ke21ke2lusyju1o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,73102,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_create() throws Exception {__CLR4_5_21ke21ke2lusyju1o.R.globalSliceStart(getClass().getName(),73082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nw1awg1ke2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ke21ke2lusyju1o.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ke21ke2lusyju1o.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.creator.JSONCreatorTest_float_obj.test_create",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73082,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nw1awg1ke2() throws Exception{try{__CLR4_5_21ke21ke2lusyju1o.R.inc(73082);
        __CLR4_5_21ke21ke2lusyju1o.R.inc(73083);Entity entity = new Entity(123.45F, "\u83dc\u59d0");
        __CLR4_5_21ke21ke2lusyju1o.R.inc(73084);String text = JSON.toJSONString(entity);

        __CLR4_5_21ke21ke2lusyju1o.R.inc(73085);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_5_21ke21ke2lusyju1o.R.inc(73086);Assert.assertTrue(entity.getId().floatValue() == entity2.getId().floatValue());
        __CLR4_5_21ke21ke2lusyju1o.R.inc(73087);Assert.assertEquals(entity.getName(), entity2.getName());
    }finally{__CLR4_5_21ke21ke2lusyju1o.R.flushNeeded();}}

    public void test_create_2() throws Exception {__CLR4_5_21ke21ke2lusyju1o.R.globalSliceStart(getClass().getName(),73088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mn6j5v1ke8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ke21ke2lusyju1o.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ke21ke2lusyju1o.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.creator.JSONCreatorTest_float_obj.test_create_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73088,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mn6j5v1ke8() throws Exception{try{__CLR4_5_21ke21ke2lusyju1o.R.inc(73088);
        __CLR4_5_21ke21ke2lusyju1o.R.inc(73089);Entity entity = new Entity(123.45F, "\u83dc\u59d0");
        __CLR4_5_21ke21ke2lusyju1o.R.inc(73090);String text = JSON.toJSONString(entity);

        __CLR4_5_21ke21ke2lusyju1o.R.inc(73091);ParserConfig config = new ParserConfig();

        __CLR4_5_21ke21ke2lusyju1o.R.inc(73092);Entity entity2 = JSON.parseObject(text, Entity.class, config, 0);
        __CLR4_5_21ke21ke2lusyju1o.R.inc(73093);Assert.assertTrue(entity.getId().floatValue() == entity2.getId().floatValue());
        __CLR4_5_21ke21ke2lusyju1o.R.inc(73094);Assert.assertEquals(entity.getName(), entity2.getName());
    }finally{__CLR4_5_21ke21ke2lusyju1o.R.flushNeeded();}}

    public static class Entity {

        private final Float  id;
        private final String name;

        @JSONCreator
        public Entity(@JSONField(name = "id") Float id, @JSONField(name = "name") String name){try{__CLR4_5_21ke21ke2lusyju1o.R.inc(73095);
            __CLR4_5_21ke21ke2lusyju1o.R.inc(73096);this.id = id;
            __CLR4_5_21ke21ke2lusyju1o.R.inc(73097);this.name = name;
        }finally{__CLR4_5_21ke21ke2lusyju1o.R.flushNeeded();}}

        public Float getId() {try{__CLR4_5_21ke21ke2lusyju1o.R.inc(73098);
            __CLR4_5_21ke21ke2lusyju1o.R.inc(73099);return id;
        }finally{__CLR4_5_21ke21ke2lusyju1o.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21ke21ke2lusyju1o.R.inc(73100);
            __CLR4_5_21ke21ke2lusyju1o.R.inc(73101);return name;
        }finally{__CLR4_5_21ke21ke2lusyju1o.R.flushNeeded();}}

    }

}
