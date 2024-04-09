/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Bug_for_smoothrat4 extends TestCase {static class __CLR4_1_1015jl15jllusqk5jn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,53893,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_long() throws Exception {__CLR4_1_1015jl15jllusqk5jn.R.globalSliceStart(getClass().getName(),53841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10eplvzk15jl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1015jl15jllusqk5jn.R.rethrow($CLV_t2$);}finally{__CLR4_1_1015jl15jllusqk5jn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_smoothrat4.test_long",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),53841,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10eplvzk15jl() throws Exception{try{__CLR4_1_1015jl15jllusqk5jn.R.inc(53841);

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53842);Entity entity = new Entity();

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53843);entity.setValue(3L);

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53844);String text = JSON.toJSONString(entity, SerializerFeature.WriteClassName);
        __CLR4_1_1015jl15jllusqk5jn.R.inc(53845);System.out.println(text);
        __CLR4_1_1015jl15jllusqk5jn.R.inc(53846);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_smoothrat4$Entity\",\"value\":3L}",
                            text);

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53847);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_1_1015jl15jllusqk5jn.R.inc(53848);Assert.assertEquals(Long.valueOf(3), entity2.getValue());
    }finally{__CLR4_1_1015jl15jllusqk5jn.R.flushNeeded();}}

    public void test_int() throws Exception {__CLR4_1_1015jl15jllusqk5jn.R.globalSliceStart(getClass().getName(),53849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10sluf5j15jt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1015jl15jllusqk5jn.R.rethrow($CLV_t2$);}finally{__CLR4_1_1015jl15jllusqk5jn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_smoothrat4.test_int",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),53849,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10sluf5j15jt() throws Exception{try{__CLR4_1_1015jl15jllusqk5jn.R.inc(53849);

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53850);Entity entity = new Entity();

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53851);entity.setValue(3);

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53852);String text = JSON.toJSONString(entity, SerializerFeature.WriteClassName);
        __CLR4_1_1015jl15jllusqk5jn.R.inc(53853);System.out.println(text);
        __CLR4_1_1015jl15jllusqk5jn.R.inc(53854);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_smoothrat4$Entity\",\"value\":3}", text);

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53855);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_1_1015jl15jllusqk5jn.R.inc(53856);Assert.assertEquals(Integer.valueOf(3), entity2.getValue());
    }finally{__CLR4_1_1015jl15jllusqk5jn.R.flushNeeded();}}

    public void test_short() throws Exception {__CLR4_1_1015jl15jllusqk5jn.R.globalSliceStart(getClass().getName(),53857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102sodu215k1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1015jl15jllusqk5jn.R.rethrow($CLV_t2$);}finally{__CLR4_1_1015jl15jllusqk5jn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_smoothrat4.test_short",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),53857,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102sodu215k1() throws Exception{try{__CLR4_1_1015jl15jllusqk5jn.R.inc(53857);

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53858);Entity entity = new Entity();

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53859);entity.setValue((short) 3);

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53860);String text = JSON.toJSONString(entity, SerializerFeature.WriteClassName);
        __CLR4_1_1015jl15jllusqk5jn.R.inc(53861);System.out.println(text);
        __CLR4_1_1015jl15jllusqk5jn.R.inc(53862);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_smoothrat4$Entity\",\"value\":3S}",
                            text);

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53863);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_1_1015jl15jllusqk5jn.R.inc(53864);Assert.assertEquals(Short.valueOf((short) 3), entity2.getValue());
    }finally{__CLR4_1_1015jl15jllusqk5jn.R.flushNeeded();}}

    public void test_byte() throws Exception {__CLR4_1_1015jl15jllusqk5jn.R.globalSliceStart(getClass().getName(),53865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10peu30k15k9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1015jl15jllusqk5jn.R.rethrow($CLV_t2$);}finally{__CLR4_1_1015jl15jllusqk5jn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_smoothrat4.test_byte",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),53865,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10peu30k15k9() throws Exception{try{__CLR4_1_1015jl15jllusqk5jn.R.inc(53865);

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53866);Entity entity = new Entity();

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53867);entity.setValue((byte) 3);

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53868);String text = JSON.toJSONString(entity, SerializerFeature.WriteClassName);
        __CLR4_1_1015jl15jllusqk5jn.R.inc(53869);System.out.println(text);
        __CLR4_1_1015jl15jllusqk5jn.R.inc(53870);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_smoothrat4$Entity\",\"value\":3B}",
                            text);

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53871);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_1_1015jl15jllusqk5jn.R.inc(53872);Assert.assertEquals(Byte.valueOf((byte) 3), entity2.getValue());
    }finally{__CLR4_1_1015jl15jllusqk5jn.R.flushNeeded();}}

    public void test_float() throws Exception {__CLR4_1_1015jl15jllusqk5jn.R.globalSliceStart(getClass().getName(),53873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10t1l4bu15kh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1015jl15jllusqk5jn.R.rethrow($CLV_t2$);}finally{__CLR4_1_1015jl15jllusqk5jn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_smoothrat4.test_float",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),53873,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10t1l4bu15kh() throws Exception{try{__CLR4_1_1015jl15jllusqk5jn.R.inc(53873);

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53874);Entity entity = new Entity();

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53875);entity.setValue(3F);

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53876);String text = JSON.toJSONString(entity, SerializerFeature.WriteClassName);
        __CLR4_1_1015jl15jllusqk5jn.R.inc(53877);System.out.println(text);
        __CLR4_1_1015jl15jllusqk5jn.R.inc(53878);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_smoothrat4$Entity\",\"value\":3.0F}",
                            text);

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53879);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_1_1015jl15jllusqk5jn.R.inc(53880);Assert.assertEquals(3F, entity2.getValue());
    }finally{__CLR4_1_1015jl15jllusqk5jn.R.flushNeeded();}}

    public void test_double() throws Exception {__CLR4_1_1015jl15jllusqk5jn.R.globalSliceStart(getClass().getName(),53881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10oq25yd15kp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1015jl15jllusqk5jn.R.rethrow($CLV_t2$);}finally{__CLR4_1_1015jl15jllusqk5jn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_smoothrat4.test_double",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),53881,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10oq25yd15kp() throws Exception{try{__CLR4_1_1015jl15jllusqk5jn.R.inc(53881);

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53882);Entity entity = new Entity();

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53883);entity.setValue(3D);

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53884);String text = JSON.toJSONString(entity, SerializerFeature.WriteClassName);
        __CLR4_1_1015jl15jllusqk5jn.R.inc(53885);System.out.println(text);
        __CLR4_1_1015jl15jllusqk5jn.R.inc(53886);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.bug.Bug_for_smoothrat4$Entity\",\"value\":3.0D}",
                            text);

        __CLR4_1_1015jl15jllusqk5jn.R.inc(53887);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_1_1015jl15jllusqk5jn.R.inc(53888);Assert.assertEquals(3D, entity2.getValue());
    }finally{__CLR4_1_1015jl15jllusqk5jn.R.flushNeeded();}}

    public static class Entity {

        private Object value;

        public Object getValue() {try{__CLR4_1_1015jl15jllusqk5jn.R.inc(53889);
            __CLR4_1_1015jl15jllusqk5jn.R.inc(53890);return value;
        }finally{__CLR4_1_1015jl15jllusqk5jn.R.flushNeeded();}}

        public void setValue(Object value) {try{__CLR4_1_1015jl15jllusqk5jn.R.inc(53891);
            __CLR4_1_1015jl15jllusqk5jn.R.inc(53892);this.value = value;
        }finally{__CLR4_1_1015jl15jllusqk5jn.R.flushNeeded();}}
    }
}
