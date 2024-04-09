/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class ByteFieldTest extends TestCase {static class __CLR4_5_2wpgwpglusvn2e6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,42423,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_codec() throws Exception {__CLR4_5_2wpgwpglusvn2e6.R.globalSliceStart(getClass().getName(),42388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nht31swpg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wpgwpglusvn2e6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wpgwpglusvn2e6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ByteFieldTest.test_codec",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42388,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nht31swpg() throws Exception{try{__CLR4_5_2wpgwpglusvn2e6.R.inc(42388);
        __CLR4_5_2wpgwpglusvn2e6.R.inc(42389);V0 v = new V0();
        __CLR4_5_2wpgwpglusvn2e6.R.inc(42390);v.setValue((byte) 10);

        __CLR4_5_2wpgwpglusvn2e6.R.inc(42391);String text = JSON.toJSONString(v);
        __CLR4_5_2wpgwpglusvn2e6.R.inc(42392);System.out.println(text);

        __CLR4_5_2wpgwpglusvn2e6.R.inc(42393);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_2wpgwpglusvn2e6.R.inc(42394);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_2wpgwpglusvn2e6.R.flushNeeded();}}

    public void test_codec_null() throws Exception {__CLR4_5_2wpgwpglusvn2e6.R.globalSliceStart(getClass().getName(),42395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25ncl18wpn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wpgwpglusvn2e6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wpgwpglusvn2e6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ByteFieldTest.test_codec_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42395,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25ncl18wpn() throws Exception{try{__CLR4_5_2wpgwpglusvn2e6.R.inc(42395);
        __CLR4_5_2wpgwpglusvn2e6.R.inc(42396);V0 v = new V0();

        __CLR4_5_2wpgwpglusvn2e6.R.inc(42397);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_2wpgwpglusvn2e6.R.inc(42398);mapping.setAsmEnable(false);

        __CLR4_5_2wpgwpglusvn2e6.R.inc(42399);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_2wpgwpglusvn2e6.R.inc(42400);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_5_2wpgwpglusvn2e6.R.inc(42401);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_2wpgwpglusvn2e6.R.inc(42402);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_2wpgwpglusvn2e6.R.flushNeeded();}}
    
    public void test_codec_null_asm() throws Exception {__CLR4_5_2wpgwpglusvn2e6.R.globalSliceStart(getClass().getName(),42403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_297oyf4wpv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wpgwpglusvn2e6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wpgwpglusvn2e6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ByteFieldTest.test_codec_null_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42403,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_297oyf4wpv() throws Exception{try{__CLR4_5_2wpgwpglusvn2e6.R.inc(42403);
        __CLR4_5_2wpgwpglusvn2e6.R.inc(42404);V0 v = new V0();

        __CLR4_5_2wpgwpglusvn2e6.R.inc(42405);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_2wpgwpglusvn2e6.R.inc(42406);mapping.setAsmEnable(true);

        __CLR4_5_2wpgwpglusvn2e6.R.inc(42407);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_2wpgwpglusvn2e6.R.inc(42408);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_5_2wpgwpglusvn2e6.R.inc(42409);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_2wpgwpglusvn2e6.R.inc(42410);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_2wpgwpglusvn2e6.R.flushNeeded();}}

    public void test_codec_null_1() throws Exception {__CLR4_5_2wpgwpglusvn2e6.R.globalSliceStart(getClass().getName(),42411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2prl16ywq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wpgwpglusvn2e6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wpgwpglusvn2e6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ByteFieldTest.test_codec_null_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42411,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2prl16ywq3() throws Exception{try{__CLR4_5_2wpgwpglusvn2e6.R.inc(42411);
        __CLR4_5_2wpgwpglusvn2e6.R.inc(42412);V0 v = new V0();

        __CLR4_5_2wpgwpglusvn2e6.R.inc(42413);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_2wpgwpglusvn2e6.R.inc(42414);mapping.setAsmEnable(false);

        __CLR4_5_2wpgwpglusvn2e6.R.inc(42415);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullNumberAsZero);
        __CLR4_5_2wpgwpglusvn2e6.R.inc(42416);Assert.assertEquals("{\"value\":0}", text);

        __CLR4_5_2wpgwpglusvn2e6.R.inc(42417);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_2wpgwpglusvn2e6.R.inc(42418);Assert.assertEquals(Byte.valueOf((byte) 0), v1.getValue());
    }finally{__CLR4_5_2wpgwpglusvn2e6.R.flushNeeded();}}

    public static class V0 {

        private Byte value;

        public Byte getValue() {try{__CLR4_5_2wpgwpglusvn2e6.R.inc(42419);
            __CLR4_5_2wpgwpglusvn2e6.R.inc(42420);return value;
        }finally{__CLR4_5_2wpgwpglusvn2e6.R.flushNeeded();}}

        public void setValue(Byte value) {try{__CLR4_5_2wpgwpglusvn2e6.R.inc(42421);
            __CLR4_5_2wpgwpglusvn2e6.R.inc(42422);this.value = value;
        }finally{__CLR4_5_2wpgwpglusvn2e6.R.flushNeeded();}}

    }
}
