/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Bug_for_smoothrat4 extends TestCase {static class __CLR4_5_216hi16hilusvn762{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,55114,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_long() throws Exception {__CLR4_5_216hi16hilusvn762.R.globalSliceStart(getClass().getName(),55062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eplvzk16hi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216hi16hilusvn762.R.rethrow($CLV_t2$);}finally{__CLR4_5_216hi16hilusvn762.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_smoothrat4.test_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55062,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eplvzk16hi() throws Exception{try{__CLR4_5_216hi16hilusvn762.R.inc(55062);

        __CLR4_5_216hi16hilusvn762.R.inc(55063);Entity entity = new Entity();

        __CLR4_5_216hi16hilusvn762.R.inc(55064);entity.setValue(3L);

        __CLR4_5_216hi16hilusvn762.R.inc(55065);String text = JSON.toJSONString(entity, SerializerFeature.WriteClassName);
        __CLR4_5_216hi16hilusvn762.R.inc(55066);System.out.println(text);
        __CLR4_5_216hi16hilusvn762.R.inc(55067);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_smoothrat4$Entity\",\"value\":3L}",
                            text);

        __CLR4_5_216hi16hilusvn762.R.inc(55068);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_5_216hi16hilusvn762.R.inc(55069);Assert.assertEquals(Long.valueOf(3), entity2.getValue());
    }finally{__CLR4_5_216hi16hilusvn762.R.flushNeeded();}}

    public void test_int() throws Exception {__CLR4_5_216hi16hilusvn762.R.globalSliceStart(getClass().getName(),55070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sluf5j16hq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216hi16hilusvn762.R.rethrow($CLV_t2$);}finally{__CLR4_5_216hi16hilusvn762.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_smoothrat4.test_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55070,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sluf5j16hq() throws Exception{try{__CLR4_5_216hi16hilusvn762.R.inc(55070);

        __CLR4_5_216hi16hilusvn762.R.inc(55071);Entity entity = new Entity();

        __CLR4_5_216hi16hilusvn762.R.inc(55072);entity.setValue(3);

        __CLR4_5_216hi16hilusvn762.R.inc(55073);String text = JSON.toJSONString(entity, SerializerFeature.WriteClassName);
        __CLR4_5_216hi16hilusvn762.R.inc(55074);System.out.println(text);
        __CLR4_5_216hi16hilusvn762.R.inc(55075);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_smoothrat4$Entity\",\"value\":3}", text);

        __CLR4_5_216hi16hilusvn762.R.inc(55076);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_5_216hi16hilusvn762.R.inc(55077);Assert.assertEquals(Integer.valueOf(3), entity2.getValue());
    }finally{__CLR4_5_216hi16hilusvn762.R.flushNeeded();}}

    public void test_short() throws Exception {__CLR4_5_216hi16hilusvn762.R.globalSliceStart(getClass().getName(),55078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22sodu216hy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216hi16hilusvn762.R.rethrow($CLV_t2$);}finally{__CLR4_5_216hi16hilusvn762.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_smoothrat4.test_short",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55078,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22sodu216hy() throws Exception{try{__CLR4_5_216hi16hilusvn762.R.inc(55078);

        __CLR4_5_216hi16hilusvn762.R.inc(55079);Entity entity = new Entity();

        __CLR4_5_216hi16hilusvn762.R.inc(55080);entity.setValue((short) 3);

        __CLR4_5_216hi16hilusvn762.R.inc(55081);String text = JSON.toJSONString(entity, SerializerFeature.WriteClassName);
        __CLR4_5_216hi16hilusvn762.R.inc(55082);System.out.println(text);
        __CLR4_5_216hi16hilusvn762.R.inc(55083);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_smoothrat4$Entity\",\"value\":3S}",
                            text);

        __CLR4_5_216hi16hilusvn762.R.inc(55084);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_5_216hi16hilusvn762.R.inc(55085);Assert.assertEquals(Short.valueOf((short) 3), entity2.getValue());
    }finally{__CLR4_5_216hi16hilusvn762.R.flushNeeded();}}

    public void test_byte() throws Exception {__CLR4_5_216hi16hilusvn762.R.globalSliceStart(getClass().getName(),55086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2peu30k16i6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216hi16hilusvn762.R.rethrow($CLV_t2$);}finally{__CLR4_5_216hi16hilusvn762.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_smoothrat4.test_byte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55086,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2peu30k16i6() throws Exception{try{__CLR4_5_216hi16hilusvn762.R.inc(55086);

        __CLR4_5_216hi16hilusvn762.R.inc(55087);Entity entity = new Entity();

        __CLR4_5_216hi16hilusvn762.R.inc(55088);entity.setValue((byte) 3);

        __CLR4_5_216hi16hilusvn762.R.inc(55089);String text = JSON.toJSONString(entity, SerializerFeature.WriteClassName);
        __CLR4_5_216hi16hilusvn762.R.inc(55090);System.out.println(text);
        __CLR4_5_216hi16hilusvn762.R.inc(55091);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_smoothrat4$Entity\",\"value\":3B}",
                            text);

        __CLR4_5_216hi16hilusvn762.R.inc(55092);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_5_216hi16hilusvn762.R.inc(55093);Assert.assertEquals(Byte.valueOf((byte) 3), entity2.getValue());
    }finally{__CLR4_5_216hi16hilusvn762.R.flushNeeded();}}

    public void test_float() throws Exception {__CLR4_5_216hi16hilusvn762.R.globalSliceStart(getClass().getName(),55094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t1l4bu16ie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216hi16hilusvn762.R.rethrow($CLV_t2$);}finally{__CLR4_5_216hi16hilusvn762.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_smoothrat4.test_float",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55094,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t1l4bu16ie() throws Exception{try{__CLR4_5_216hi16hilusvn762.R.inc(55094);

        __CLR4_5_216hi16hilusvn762.R.inc(55095);Entity entity = new Entity();

        __CLR4_5_216hi16hilusvn762.R.inc(55096);entity.setValue(3F);

        __CLR4_5_216hi16hilusvn762.R.inc(55097);String text = JSON.toJSONString(entity, SerializerFeature.WriteClassName);
        __CLR4_5_216hi16hilusvn762.R.inc(55098);System.out.println(text);
        __CLR4_5_216hi16hilusvn762.R.inc(55099);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_smoothrat4$Entity\",\"value\":3.0F}",
                            text);

        __CLR4_5_216hi16hilusvn762.R.inc(55100);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_5_216hi16hilusvn762.R.inc(55101);Assert.assertEquals(3F, entity2.getValue());
    }finally{__CLR4_5_216hi16hilusvn762.R.flushNeeded();}}

    public void test_double() throws Exception {__CLR4_5_216hi16hilusvn762.R.globalSliceStart(getClass().getName(),55102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oq25yd16im();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216hi16hilusvn762.R.rethrow($CLV_t2$);}finally{__CLR4_5_216hi16hilusvn762.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_smoothrat4.test_double",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55102,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oq25yd16im() throws Exception{try{__CLR4_5_216hi16hilusvn762.R.inc(55102);

        __CLR4_5_216hi16hilusvn762.R.inc(55103);Entity entity = new Entity();

        __CLR4_5_216hi16hilusvn762.R.inc(55104);entity.setValue(3D);

        __CLR4_5_216hi16hilusvn762.R.inc(55105);String text = JSON.toJSONString(entity, SerializerFeature.WriteClassName);
        __CLR4_5_216hi16hilusvn762.R.inc(55106);System.out.println(text);
        __CLR4_5_216hi16hilusvn762.R.inc(55107);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_smoothrat4$Entity\",\"value\":3.0D}",
                            text);

        __CLR4_5_216hi16hilusvn762.R.inc(55108);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_5_216hi16hilusvn762.R.inc(55109);Assert.assertEquals(3D, entity2.getValue());
    }finally{__CLR4_5_216hi16hilusvn762.R.flushNeeded();}}

    public static class Entity {

        private Object value;

        public Object getValue() {try{__CLR4_5_216hi16hilusvn762.R.inc(55110);
            __CLR4_5_216hi16hilusvn762.R.inc(55111);return value;
        }finally{__CLR4_5_216hi16hilusvn762.R.flushNeeded();}}

        public void setValue(Object value) {try{__CLR4_5_216hi16hilusvn762.R.inc(55112);
            __CLR4_5_216hi16hilusvn762.R.inc(55113);this.value = value;
        }finally{__CLR4_5_216hi16hilusvn762.R.flushNeeded();}}
    }
}
