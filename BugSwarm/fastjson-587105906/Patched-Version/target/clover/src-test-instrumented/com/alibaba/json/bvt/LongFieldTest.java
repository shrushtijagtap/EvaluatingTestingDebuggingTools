/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class LongFieldTest extends TestCase {static class __CLR4_5_2yuyyuylusvn331{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,45215,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_codec() throws Exception {__CLR4_5_2yuyyuylusvn331.R.globalSliceStart(getClass().getName(),45178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nht31syuy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yuyyuylusvn331.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yuyyuylusvn331.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LongFieldTest.test_codec",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45178,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nht31syuy() throws Exception{try{__CLR4_5_2yuyyuylusvn331.R.inc(45178);
        __CLR4_5_2yuyyuylusvn331.R.inc(45179);V0 v = new V0();
        __CLR4_5_2yuyyuylusvn331.R.inc(45180);v.setValue(1001L);

        __CLR4_5_2yuyyuylusvn331.R.inc(45181);String text = JSON.toJSONString(v);
        __CLR4_5_2yuyyuylusvn331.R.inc(45182);System.out.println(text);

        __CLR4_5_2yuyyuylusvn331.R.inc(45183);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_2yuyyuylusvn331.R.inc(45184);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_2yuyyuylusvn331.R.flushNeeded();}}

    public void test_codec_null() throws Exception {__CLR4_5_2yuyyuylusvn331.R.globalSliceStart(getClass().getName(),45185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25ncl18yv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yuyyuylusvn331.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yuyyuylusvn331.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LongFieldTest.test_codec_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45185,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25ncl18yv5() throws Exception{try{__CLR4_5_2yuyyuylusvn331.R.inc(45185);
        __CLR4_5_2yuyyuylusvn331.R.inc(45186);V0 v = new V0();

        __CLR4_5_2yuyyuylusvn331.R.inc(45187);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_2yuyyuylusvn331.R.inc(45188);mapping.setAsmEnable(false);

        __CLR4_5_2yuyyuylusvn331.R.inc(45189);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_2yuyyuylusvn331.R.inc(45190);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_5_2yuyyuylusvn331.R.inc(45191);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_2yuyyuylusvn331.R.inc(45192);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_2yuyyuylusvn331.R.flushNeeded();}}
    
    public void test_codec_null_asm() throws Exception {__CLR4_5_2yuyyuylusvn331.R.globalSliceStart(getClass().getName(),45193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_297oyf4yvd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yuyyuylusvn331.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yuyyuylusvn331.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LongFieldTest.test_codec_null_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45193,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_297oyf4yvd() throws Exception{try{__CLR4_5_2yuyyuylusvn331.R.inc(45193);
        __CLR4_5_2yuyyuylusvn331.R.inc(45194);V0 v = new V0();

        __CLR4_5_2yuyyuylusvn331.R.inc(45195);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_2yuyyuylusvn331.R.inc(45196);mapping.setAsmEnable(true);

        __CLR4_5_2yuyyuylusvn331.R.inc(45197);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_2yuyyuylusvn331.R.inc(45198);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_5_2yuyyuylusvn331.R.inc(45199);ParserConfig config = new ParserConfig();
        __CLR4_5_2yuyyuylusvn331.R.inc(45200);config.setAsmEnable(false);
        
        __CLR4_5_2yuyyuylusvn331.R.inc(45201);V0 v1 = JSON.parseObject(text, V0.class, config, JSON.DEFAULT_PARSER_FEATURE);

        __CLR4_5_2yuyyuylusvn331.R.inc(45202);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_2yuyyuylusvn331.R.flushNeeded();}}

    public void test_codec_null_1() throws Exception {__CLR4_5_2yuyyuylusvn331.R.globalSliceStart(getClass().getName(),45203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2prl16yyvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yuyyuylusvn331.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yuyyuylusvn331.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LongFieldTest.test_codec_null_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45203,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2prl16yyvn() throws Exception{try{__CLR4_5_2yuyyuylusvn331.R.inc(45203);
        __CLR4_5_2yuyyuylusvn331.R.inc(45204);V0 v = new V0();

        __CLR4_5_2yuyyuylusvn331.R.inc(45205);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_2yuyyuylusvn331.R.inc(45206);mapping.setAsmEnable(false);

        __CLR4_5_2yuyyuylusvn331.R.inc(45207);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullNumberAsZero);
        __CLR4_5_2yuyyuylusvn331.R.inc(45208);Assert.assertEquals("{\"value\":0}", text);

        __CLR4_5_2yuyyuylusvn331.R.inc(45209);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_2yuyyuylusvn331.R.inc(45210);Assert.assertEquals(Long.valueOf(0), v1.getValue());
    }finally{__CLR4_5_2yuyyuylusvn331.R.flushNeeded();}}

    public static class V0 {

        private Long value;

        public Long getValue() {try{__CLR4_5_2yuyyuylusvn331.R.inc(45211);
            __CLR4_5_2yuyyuylusvn331.R.inc(45212);return value;
        }finally{__CLR4_5_2yuyyuylusvn331.R.flushNeeded();}}

        public void setValue(Long value) {try{__CLR4_5_2yuyyuylusvn331.R.inc(45213);
            __CLR4_5_2yuyyuylusvn331.R.inc(45214);this.value = value;
        }finally{__CLR4_5_2yuyyuylusvn331.R.flushNeeded();}}

    }
}
