/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Bug_for_smoothrat4 extends TestCase {static class __CLR4_1_1016ht16htluszw91e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,55125,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_long() throws Exception {__CLR4_1_1016ht16htluszw91e.R.globalSliceStart(getClass().getName(),55073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10eplvzk16ht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1016ht16htluszw91e.R.rethrow($CLV_t2$);}finally{__CLR4_1_1016ht16htluszw91e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_smoothrat4.test_long",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),55073,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10eplvzk16ht() throws Exception{try{__CLR4_1_1016ht16htluszw91e.R.inc(55073);

        __CLR4_1_1016ht16htluszw91e.R.inc(55074);Entity entity = new Entity();

        __CLR4_1_1016ht16htluszw91e.R.inc(55075);entity.setValue(3L);

        __CLR4_1_1016ht16htluszw91e.R.inc(55076);String text = JSON.toJSONString(entity, SerializerFeature.WriteClassName);
        __CLR4_1_1016ht16htluszw91e.R.inc(55077);System.out.println(text);
        __CLR4_1_1016ht16htluszw91e.R.inc(55078);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_smoothrat4$Entity\",\"value\":3L}",
                            text);

        __CLR4_1_1016ht16htluszw91e.R.inc(55079);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_1_1016ht16htluszw91e.R.inc(55080);Assert.assertEquals(Long.valueOf(3), entity2.getValue());
    }finally{__CLR4_1_1016ht16htluszw91e.R.flushNeeded();}}

    public void test_int() throws Exception {__CLR4_1_1016ht16htluszw91e.R.globalSliceStart(getClass().getName(),55081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10sluf5j16i1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1016ht16htluszw91e.R.rethrow($CLV_t2$);}finally{__CLR4_1_1016ht16htluszw91e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_smoothrat4.test_int",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),55081,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10sluf5j16i1() throws Exception{try{__CLR4_1_1016ht16htluszw91e.R.inc(55081);

        __CLR4_1_1016ht16htluszw91e.R.inc(55082);Entity entity = new Entity();

        __CLR4_1_1016ht16htluszw91e.R.inc(55083);entity.setValue(3);

        __CLR4_1_1016ht16htluszw91e.R.inc(55084);String text = JSON.toJSONString(entity, SerializerFeature.WriteClassName);
        __CLR4_1_1016ht16htluszw91e.R.inc(55085);System.out.println(text);
        __CLR4_1_1016ht16htluszw91e.R.inc(55086);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_smoothrat4$Entity\",\"value\":3}", text);

        __CLR4_1_1016ht16htluszw91e.R.inc(55087);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_1_1016ht16htluszw91e.R.inc(55088);Assert.assertEquals(Integer.valueOf(3), entity2.getValue());
    }finally{__CLR4_1_1016ht16htluszw91e.R.flushNeeded();}}

    public void test_short() throws Exception {__CLR4_1_1016ht16htluszw91e.R.globalSliceStart(getClass().getName(),55089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102sodu216i9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1016ht16htluszw91e.R.rethrow($CLV_t2$);}finally{__CLR4_1_1016ht16htluszw91e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_smoothrat4.test_short",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),55089,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102sodu216i9() throws Exception{try{__CLR4_1_1016ht16htluszw91e.R.inc(55089);

        __CLR4_1_1016ht16htluszw91e.R.inc(55090);Entity entity = new Entity();

        __CLR4_1_1016ht16htluszw91e.R.inc(55091);entity.setValue((short) 3);

        __CLR4_1_1016ht16htluszw91e.R.inc(55092);String text = JSON.toJSONString(entity, SerializerFeature.WriteClassName);
        __CLR4_1_1016ht16htluszw91e.R.inc(55093);System.out.println(text);
        __CLR4_1_1016ht16htluszw91e.R.inc(55094);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_smoothrat4$Entity\",\"value\":3S}",
                            text);

        __CLR4_1_1016ht16htluszw91e.R.inc(55095);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_1_1016ht16htluszw91e.R.inc(55096);Assert.assertEquals(Short.valueOf((short) 3), entity2.getValue());
    }finally{__CLR4_1_1016ht16htluszw91e.R.flushNeeded();}}

    public void test_byte() throws Exception {__CLR4_1_1016ht16htluszw91e.R.globalSliceStart(getClass().getName(),55097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10peu30k16ih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1016ht16htluszw91e.R.rethrow($CLV_t2$);}finally{__CLR4_1_1016ht16htluszw91e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_smoothrat4.test_byte",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),55097,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10peu30k16ih() throws Exception{try{__CLR4_1_1016ht16htluszw91e.R.inc(55097);

        __CLR4_1_1016ht16htluszw91e.R.inc(55098);Entity entity = new Entity();

        __CLR4_1_1016ht16htluszw91e.R.inc(55099);entity.setValue((byte) 3);

        __CLR4_1_1016ht16htluszw91e.R.inc(55100);String text = JSON.toJSONString(entity, SerializerFeature.WriteClassName);
        __CLR4_1_1016ht16htluszw91e.R.inc(55101);System.out.println(text);
        __CLR4_1_1016ht16htluszw91e.R.inc(55102);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_smoothrat4$Entity\",\"value\":3B}",
                            text);

        __CLR4_1_1016ht16htluszw91e.R.inc(55103);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_1_1016ht16htluszw91e.R.inc(55104);Assert.assertEquals(Byte.valueOf((byte) 3), entity2.getValue());
    }finally{__CLR4_1_1016ht16htluszw91e.R.flushNeeded();}}

    public void test_float() throws Exception {__CLR4_1_1016ht16htluszw91e.R.globalSliceStart(getClass().getName(),55105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10t1l4bu16ip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1016ht16htluszw91e.R.rethrow($CLV_t2$);}finally{__CLR4_1_1016ht16htluszw91e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_smoothrat4.test_float",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),55105,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10t1l4bu16ip() throws Exception{try{__CLR4_1_1016ht16htluszw91e.R.inc(55105);

        __CLR4_1_1016ht16htluszw91e.R.inc(55106);Entity entity = new Entity();

        __CLR4_1_1016ht16htluszw91e.R.inc(55107);entity.setValue(3F);

        __CLR4_1_1016ht16htluszw91e.R.inc(55108);String text = JSON.toJSONString(entity, SerializerFeature.WriteClassName);
        __CLR4_1_1016ht16htluszw91e.R.inc(55109);System.out.println(text);
        __CLR4_1_1016ht16htluszw91e.R.inc(55110);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_smoothrat4$Entity\",\"value\":3.0F}",
                            text);

        __CLR4_1_1016ht16htluszw91e.R.inc(55111);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_1_1016ht16htluszw91e.R.inc(55112);Assert.assertEquals(3F, entity2.getValue());
    }finally{__CLR4_1_1016ht16htluszw91e.R.flushNeeded();}}

    public void test_double() throws Exception {__CLR4_1_1016ht16htluszw91e.R.globalSliceStart(getClass().getName(),55113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10oq25yd16ix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1016ht16htluszw91e.R.rethrow($CLV_t2$);}finally{__CLR4_1_1016ht16htluszw91e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_smoothrat4.test_double",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),55113,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10oq25yd16ix() throws Exception{try{__CLR4_1_1016ht16htluszw91e.R.inc(55113);

        __CLR4_1_1016ht16htluszw91e.R.inc(55114);Entity entity = new Entity();

        __CLR4_1_1016ht16htluszw91e.R.inc(55115);entity.setValue(3D);

        __CLR4_1_1016ht16htluszw91e.R.inc(55116);String text = JSON.toJSONString(entity, SerializerFeature.WriteClassName);
        __CLR4_1_1016ht16htluszw91e.R.inc(55117);System.out.println(text);
        __CLR4_1_1016ht16htluszw91e.R.inc(55118);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_smoothrat4$Entity\",\"value\":3.0D}",
                            text);

        __CLR4_1_1016ht16htluszw91e.R.inc(55119);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_1_1016ht16htluszw91e.R.inc(55120);Assert.assertEquals(3D, entity2.getValue());
    }finally{__CLR4_1_1016ht16htluszw91e.R.flushNeeded();}}

    public static class Entity {

        private Object value;

        public Object getValue() {try{__CLR4_1_1016ht16htluszw91e.R.inc(55121);
            __CLR4_1_1016ht16htluszw91e.R.inc(55122);return value;
        }finally{__CLR4_1_1016ht16htluszw91e.R.flushNeeded();}}

        public void setValue(Object value) {try{__CLR4_1_1016ht16htluszw91e.R.inc(55123);
            __CLR4_1_1016ht16htluszw91e.R.inc(55124);this.value = value;
        }finally{__CLR4_1_1016ht16htluszw91e.R.flushNeeded();}}
    }
}
